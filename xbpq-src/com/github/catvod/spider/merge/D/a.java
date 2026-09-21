/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.D.d0;
import com.github.catvod.spider.merge.H.e;
import java.util.HashMap;
import java.util.Map;

final class a {
    private final e[] a;
    private final String b;
    private final d0 c;
    private final boolean d;
    private Map<String, Integer> e = new HashMap<String, Integer>();
    private int f = 9;
    private final boolean g;

    public a(e[] eArray, d0 d02, String string, boolean bl, boolean bl2) {
        this.a = eArray;
        this.b = string;
        this.c = d02;
        this.d = bl;
        bl = bl2 || d02.a.isEnum();
        this.g = bl;
    }

    static /* synthetic */ boolean a(a a2) {
        return a2.d;
    }

    static /* synthetic */ int b(a a2) {
        return a2.f;
    }

    static /* synthetic */ boolean c(a a2) {
        return a2.g;
    }

    static /* synthetic */ String d(a a2) {
        return a2.b;
    }

    static /* synthetic */ d0 e(a a2) {
        return a2.c;
    }

    public final int f(String string) {
        int n2;
        block2: {
            int n3 = this.a.length;
            for (n2 = 0; n2 < n3; ++n2) {
                if (!this.a[n2].a.equals(string)) {
                    continue;
                }
                break block2;
            }
            n2 = -1;
        }
        return n2;
    }

    public final int g(String string) {
        if ((Integer)((HashMap)this.e).get(string) == null) {
            Map<String, Integer> map = this.e;
            int n2 = this.f;
            this.f = n2 + 1;
            ((HashMap)map).put(string, n2);
        }
        return (Integer)((HashMap)this.e).get(string);
    }

    public final int h(String string) {
        if ((Integer)((HashMap)this.e).get(string) == null) {
            ((HashMap)this.e).put(string, this.f);
            this.f += 2;
        }
        return (Integer)((HashMap)this.e).get(string);
    }
}

