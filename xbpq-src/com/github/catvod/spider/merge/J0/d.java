/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.J0.c;
import com.github.catvod.spider.merge.J0.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class d
implements Iterable<String> {
    private final HashMap<String, String> a = new HashMap();
    private final ArrayList<c> b = new ArrayList();

    public d(Map<String, String> stringArray) {
        stringArray = stringArray.get("cookie");
        if (stringArray != null) {
            stringArray = stringArray.split(";");
            int n2 = stringArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                String[] stringArray2 = stringArray[i2].trim().split("=");
                if (stringArray2.length != 2) continue;
                this.a.put(stringArray2[0], stringArray2[1]);
            }
        }
    }

    public final void a(o o2) {
        Iterator<c> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            Objects.requireNonNull(iterator.next());
            o2.b("Set-Cookie", String.format("%s=%s; expires=%s", null, null, null));
        }
    }

    @Override
    public final Iterator<String> iterator() {
        return this.a.keySet().iterator();
    }
}

