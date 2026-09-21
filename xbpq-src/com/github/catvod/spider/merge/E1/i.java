/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import java.util.function.Function;

public final class i
implements Function {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public static final i d = new i(2);
    public final int a;

    public /* synthetic */ i(int n2) {
        this.a = n2;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                object = (e)object;
                int n2 = G.f;
                return A.o(((e)object).g("thumbnailOverlayTimeStatusRenderer").g("text"), false);
            }
            case 0: {
                return ((e)object).b("runs").c();
            }
        }
        object = (e)object;
        int n3 = M.i;
        return ((e)object).b("badges").c();
    }
}

