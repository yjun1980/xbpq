/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.f0.a;
import java.util.LinkedList;
import java.util.List;

public final class b {
    private Object a;

    public b(Object object) {
        this.a = object;
    }

    public final String a() {
        Object object = this.a;
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof l) {
            l l2 = (l)object;
            String string = l2.n0();
            boolean bl = string == (object = cYh.d("2D081E05120233")) || string != null && string.equals(object);
            if (bl) {
                return l2.e0();
            }
            return l2.u();
        }
        return String.valueOf(object);
    }

    public final List<b> b(String string) {
        if (!(this.a instanceof l)) {
            return null;
        }
        return new a(new g((l)this.a)).a(string);
    }

    public final b c(String object) {
        if ((object = this.b((String)object)) != null && ((LinkedList)(object = (LinkedList)object)).size() > 0) {
            return (b)((LinkedList)object).get(0);
        }
        return null;
    }

    public final String toString() {
        return this.a();
    }
}

