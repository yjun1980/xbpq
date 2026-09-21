/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import java.util.function.Function;

public final class B
implements Function {
    public static final B b = new B(0);
    public static final B c = new B(1);
    public final int a;

    public /* synthetic */ B(int n2) {
        this.a = n2;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return ((e)object).g("segmentedLikeDislikeButtonRenderer").g("likeButton").g("toggleButtonRenderer");
            }
        }
        object = (e)object;
        int n2 = M.i;
        return ((e)object).g("thumbnailBottomOverlayViewModel").b("badges").c();
    }
}

