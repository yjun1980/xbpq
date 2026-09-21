/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.tools.shell.Main$ScriptReference;

class Main$ScriptCache
extends LinkedHashMap<String, Main$ScriptReference> {
    private static final long serialVersionUID = -6866856136258508615L;
    int capacity;
    ReferenceQueue<Script> queue;

    Main$ScriptCache(int n2) {
        super(n2 + 1, 2.0f, true);
        this.capacity = n2;
        this.queue = new ReferenceQueue();
    }

    Main$ScriptReference get(String object, byte[] byArray) {
        Main$ScriptReference main$ScriptReference;
        while ((main$ScriptReference = (Main$ScriptReference)this.queue.poll()) != null) {
            ((AbstractMap)this).remove(main$ScriptReference.path);
        }
        main$ScriptReference = (Main$ScriptReference)((AbstractMap)this).get(object);
        object = main$ScriptReference;
        if (main$ScriptReference != null) {
            object = main$ScriptReference;
            if (!Arrays.equals(byArray, main$ScriptReference.digest)) {
                ((AbstractMap)this).remove(main$ScriptReference.path);
                object = null;
            }
        }
        return object;
    }

    void put(String string, byte[] byArray, Script script) {
        ((AbstractMap)this).put(string, new Main$ScriptReference(string, byArray, script, this.queue));
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, Main$ScriptReference> entry) {
        boolean bl = ((AbstractMap)this).size() > this.capacity;
        return bl;
    }
}

