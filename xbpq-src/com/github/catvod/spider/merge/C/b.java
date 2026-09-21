/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.e;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.H.l;
import com.github.catvod.spider.merge.I.r;
import java.util.HashMap;
import java.util.Map;

final class b {
    private int a = -1;
    private final Map<String, Integer> b = new HashMap<String, Integer>();
    private final Class<?> c;
    private final l d;
    private final String e;
    private e[] f;

    public b(String string, l l2, int n2) {
        this.e = string;
        this.c = l2.a;
        this.a = n2;
        this.d = l2;
        this.f = l2.h;
    }

    static /* synthetic */ l a(b b2) {
        return b2.d;
    }

    static /* synthetic */ int b(b b2) {
        return b2.a;
    }

    static /* synthetic */ e[] c(b b2) {
        return b2.f;
    }

    static /* synthetic */ e[] d(b b2, e[] eArray) {
        b2.f = eArray;
        return eArray;
    }

    static /* synthetic */ String e(b b2) {
        return b2.e;
    }

    static /* synthetic */ Class f(b b2) {
        return b2.c;
    }

    public final String g(e comparable) {
        if (this.j(((e)comparable).a)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((e)comparable).a);
            stringBuilder.append("_asm_deser__");
            comparable = stringBuilder;
        } else {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("_asm_deser__");
            stringBuilder.append(A.A(((e)comparable).a));
            comparable = stringBuilder;
        }
        return ((StringBuilder)comparable).toString();
    }

    public final String h(e comparable) {
        if (this.j(((e)comparable).a)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((e)comparable).a);
            stringBuilder.append("_asm_prefix__");
            comparable = stringBuilder;
        } else {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("asm_field_");
            stringBuilder.append(A.A(((e)comparable).a));
            comparable = stringBuilder;
        }
        return ((StringBuilder)comparable).toString();
    }

    public final Class<?> i() {
        Class<?> clazz;
        Class<?> clazz2 = clazz = this.d.b;
        if (clazz == null) {
            clazz2 = this.c;
        }
        return clazz2;
    }

    final boolean j(String string) {
        int n2 = 0;
        while (true) {
            boolean[] blArray;
            int n3 = string.length();
            boolean bl = true;
            boolean bl2 = true;
            if (n2 >= n3) break;
            n3 = string.charAt(n2);
            if (n3 == 0) {
                blArray = i.c;
                if (n3 >= blArray.length || !blArray[n3]) {
                    bl2 = false;
                }
                if (!bl2) {
                    return false;
                }
            } else {
                blArray = i.d;
                bl2 = n3 < blArray.length && blArray[n3] ? bl : false;
                if (!bl2) {
                    return false;
                }
            }
            ++n2;
        }
        return true;
    }

    public final int k(String string) {
        if ((Integer)((HashMap)this.b).get(string) == null) {
            Map<String, Integer> map = this.b;
            int n2 = this.a;
            this.a = n2 + 1;
            ((HashMap)map).put(string, n2);
        }
        return (Integer)((HashMap)this.b).get(string);
    }

    public final int l(e e2) {
        return this.k(r.c(new StringBuilder(), e2.a, "_asm"));
    }

    public final int m(e object) {
        object = r.c(new StringBuilder(), ((e)object).a, "_asm");
        if ((Integer)((HashMap)this.b).get(object) == null) {
            ((HashMap)this.b).put((String)object, this.a);
            this.a += 2;
        }
        return (Integer)((HashMap)this.b).get(object);
    }
}

