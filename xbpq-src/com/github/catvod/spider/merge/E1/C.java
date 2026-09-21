/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.D;
import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import java.time.LocalDate;
import java.util.function.Function;

public final class C
implements Function {
    public static final C b = new C(0);
    public static final C c = new C(1);
    public static final C d = new C(2);
    public final int a;

    public /* synthetic */ C(int n2) {
        this.a = n2;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return ((e)object).g("engagementPanelSectionListRenderer").g("content").g("macroMarkersListRenderer").b("contents");
            }
            case 0: {
                return D.e0((LocalDate)object);
            }
        }
        object = (e)object;
        int n2 = M.i;
        return ((e)object).g("thumbnailBadgeViewModel");
    }
}

