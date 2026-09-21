/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.e;

import com.github.catvod.spider.merge.xc.e.b;
import com.github.catvod.spider.merge.xc.e.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class a
implements Iterable {
    public c a;
    public c b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;
    public final HashMap e = new HashMap();

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        Object object4 = (a)object;
        if (this.d != ((a)object4).d) {
            return false;
        }
        object = this.iterator();
        object4 = ((a)object4).iterator();
        while (((b)(object3 = (b)object)).hasNext() && ((b)(object2 = (b)object4)).hasNext()) {
            object3 = (Map.Entry)((b)object3).next();
            object2 = ((b)object2).next();
            if ((object3 != null || object2 == null) && (object3 == null || object3.equals(object2))) continue;
            return false;
        }
        if (((b)object3).hasNext() || ((b)object4).hasNext()) {
            bl = false;
        }
        return bl;
    }

    public final int hashCode() {
        b b2;
        Iterator iterator = this.iterator();
        int n2 = 0;
        while ((b2 = (b)iterator).hasNext()) {
            n2 += ((Map.Entry)b2.next()).hashCode();
        }
        return n2;
    }

    public final Iterator iterator() {
        b b2 = new b(this.a, this.b, 0);
        this.c.put(b2, Boolean.FALSE);
        return b2;
    }

    public final String toString() {
        b b2;
        StringBuilder stringBuilder = new StringBuilder("[");
        Iterator iterator = this.iterator();
        while ((b2 = (b)iterator).hasNext()) {
            stringBuilder.append(((Map.Entry)b2.next()).toString());
            if (!b2.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

