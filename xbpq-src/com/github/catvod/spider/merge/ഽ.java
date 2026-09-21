/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0209;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u0e33;
import com.github.catvod.spider.merge.\u0f8b;

public class \u0d3d
extends \u013a {
    private final \u0e33 \u0620 = new \u0e33();

    public \u0d3d(\u0209 \u02092, String string, \u0f8b \u0f8b2) {
        super(\u02092, string, \u0f8b2);
    }

    @Override
    protected void \u0795(\u0582 \u05822) {
        super.\u0795(\u05822);
        this.\u0620.remove(\u05822);
    }

    public \u0d3d \u08bc(\u013a \u013a2) {
        this.\u0620.add(\u013a2);
        return this;
    }

    public \u0d3d \u08bd() {
        return (\u0d3d)super.\u0865();
    }
}

