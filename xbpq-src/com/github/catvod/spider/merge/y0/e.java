/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y0;

import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y0.c;
import com.github.catvod.spider.merge.y0.d;
import java.util.AbstractCollection;
import java.util.ArrayList;

public final class e
extends ArrayList<d>
implements com.github.catvod.spider.merge.y0.b {
    public e(com.github.catvod.spider.merge.y.e a2) {
        super(((com.github.catvod.spider.merge.y.e)a2).t("cards").size());
        ((com.github.catvod.spider.merge.y.e)a2).u("header").u("richListHeaderRenderer").u("title").x("simpleText");
        a2 = ((com.github.catvod.spider.merge.y.e)a2).t("cards");
        for (int i2 = 0; i2 < ((b)a2).size(); ++i2) {
            ((AbstractCollection)this).add(new d(((b)a2).p(i2).u("searchRefinementCardRenderer")));
        }
    }

    @Override
    public final c type() {
        return c.c;
    }
}

