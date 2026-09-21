/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.H1.m;
import java.util.function.Function;

public final class l
implements Function {
    public static final l b = new l(0);
    public static final l c = new l(1);
    public static final l d = new l(2);
    public static final l e = new l(3);
    public final int a;

    public /* synthetic */ l(int n2) {
        this.a = n2;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                object = (e)object;
                int n2 = G.f;
                return m.d;
            }
            case 1: {
                return ((e)object).g("segmentedLikeDislikeButtonViewModel").g("likeButtonViewModel").g("likeButtonViewModel").g("toggleButtonViewModel").g("toggleButtonViewModel").g("defaultButtonViewModel").g("buttonViewModel");
            }
            case 0: {
                return ((e)object).g("macroMarkersListItemRenderer");
            }
        }
        object = (e)object;
        int n3 = M.i;
        return ((e)object).g("thumbnailBottomOverlayViewModel").b("badges").c();
    }
}

