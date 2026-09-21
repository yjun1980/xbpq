/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.mozilla.javascript.NativePromise;

public class UnhandledRejectionTracker {
    private static final IdentityHashMap<NativePromise, NativePromise> unhandled = new IdentityHashMap(0);
    private boolean enabled = false;

    void enable(boolean bl) {
        this.enabled = bl;
    }

    public List<Object> enumerate() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator<NativePromise> iterator = unhandled.values().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().getResult());
        }
        return arrayList;
    }

    public void process(Consumer<Object> consumer) {
        Iterator<NativePromise> iterator = unhandled.values().iterator();
        while (iterator.hasNext()) {
            try {
                consumer.accept(iterator.next().getResult());
            }
            finally {
                iterator.remove();
            }
        }
    }

    void promiseHandled(NativePromise nativePromise) {
        if (this.enabled) {
            unhandled.remove(nativePromise);
        }
    }

    void promiseRejected(NativePromise nativePromise) {
        if (this.enabled) {
            unhandled.put(nativePromise, nativePromise);
        }
    }
}

