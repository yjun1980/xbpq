/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b3;
import com.github.catvod.spider.merge.\u02c1;
import com.github.catvod.spider.merge.\u02c8;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08a3;

public class \u02be
implements \u02b3 {
    public \u08a3 \u037f;
    public \u02c8 \u0528;

    public \u02be(\u08a3 \u08a32) {
        this.\u037f = \u08a32;
    }

    public String toString() {
        if (this.\u037f.getType() == -1) {
            return SOY.d("46171E304A");
        }
        return this.\u037f.\u0528();
    }

    @Override
    public void \u037f(\u08a1 \u08a12) {
        this.\u0528 = \u08a12;
    }

    @Override
    public String \u0528() {
        return this.\u037f.\u0528();
    }

    @Override
    public \u08a3 \u0529() {
        return this.\u037f;
    }

    @Override
    public <T> T \u052a(\u02c1<? extends T> \u02c12) {
        return \u02c12.\u0528(this);
    }
}

