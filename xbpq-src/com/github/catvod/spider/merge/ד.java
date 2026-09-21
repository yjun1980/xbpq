/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u0828;
import com.github.catvod.spider.merge.\u0860;
import com.github.catvod.spider.merge.\u0862;
import com.github.catvod.spider.merge.\u0867;
import com.github.catvod.spider.merge.\u0868;
import com.github.catvod.spider.merge.\u086a;
import com.github.catvod.spider.merge.\u08a3;

public class \u05d3
extends \u0860 {
    @Override
    public \u08a3 \u037f(\u0867 object) {
        \u0862 \u08622 = new \u0862((\u0867)object);
        for (object = ((\u0867)object).\u078d(); object != null; object = ((\u0868)object).\u0787()) {
            ((\u0868)object).\u052d = \u08622;
        }
        object = new \u0828(\u08622);
        throw object;
    }

    @Override
    public void \u0529(\u0867 object, \u086a \u086a2) {
        for (object = ((\u0867)object).\u078d(); object != null; object = ((\u0868)object).\u0787()) {
            ((\u0868)object).\u052d = \u086a2;
        }
        object = new \u0828(\u086a2);
        throw object;
    }
}

