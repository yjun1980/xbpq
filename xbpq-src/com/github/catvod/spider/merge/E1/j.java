/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.F0.e;
import java.util.function.Function;

public final class j
implements Function {
    public static final j b = new j(0);
    public static final j c = new j(1);
    public static final j d = new j(2);
    public final int a;

    public /* synthetic */ j(int n2) {
        this.a = n2;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                object = (e)object;
                int n2 = M.i;
                return ((e)object).g("thumbnailBadgeViewModel").i("text", null);
            }
            case 0: {
                return ((e)object).g("metadataRowRenderer").b("contents").c();
            }
        }
        object = (e)object;
        int n3 = M.i;
        return ((e)object).g("clientResource").i("imageName", null);
    }
}

