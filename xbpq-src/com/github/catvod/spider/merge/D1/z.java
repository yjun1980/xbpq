/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.K1.p;
import java.util.function.Predicate;

public final class z
implements Predicate {
    public static final z b = new z(0);
    public static final z c = new z(1);
    public final int a;

    public /* synthetic */ z(int n2) {
        this.a = n2;
    }

    public final boolean test(Object object) {
        int n2 = this.a;
        boolean bl = true;
        switch (n2) {
            default: {
                break;
            }
            case 0: {
                object = (e)object;
                n2 = A.j;
                return p.j(((e)object).i("url", null)) ^ true;
            }
        }
        object = (e)object;
        n2 = A.j;
        object = ((e)object).g("clientResource").i("imageName", null);
        boolean bl2 = bl;
        if (!"CHECK_CIRCLE_FILLED".equals(object)) {
            bl2 = bl;
            if (!"AUDIO_BADGE".equals(object)) {
                bl2 = "MUSIC_FILLED".equals(object) ? bl : false;
            }
        }
        return bl2;
    }
}

