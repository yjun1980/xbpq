/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.J;
import com.github.catvod.spider.merge.E1.k;
import com.github.catvod.spider.merge.F0.e;

final class K
extends J {
    K(e e2) {
        super(e2);
    }

    @Override
    public final e a() {
        return this.a.b("avatars").a(0);
    }

    @Override
    public final e b() {
        return this.a.g("rendererContext").g("commandContext").g("onTap").g("innertubeCommand").g("showDialogCommand").g("panelLoadingStrategy").g("inlineContent").g("dialogViewModel").g("customContent").g("listViewModel").b("listItems").c().map(k.d).findFirst().orElse(null);
    }
}

