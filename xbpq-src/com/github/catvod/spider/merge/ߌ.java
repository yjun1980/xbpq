/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u03aa;
import com.github.catvod.spider.merge.\u07e0;
import java.util.List;

public class \u07cc
implements \u03aa {
    @Override
    public String name() {
        return SOY.d("193D3F151503");
    }

    @Override
    public \u07e0 \u037f(\u0155 object, List<\u07e0> object2) {
        object = new StringBuilder();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            ((StringBuilder)object).append(((\u07e0)object2.next()).\u052d());
        }
        return \u07e0.\u058f(((StringBuilder)object).toString());
    }
}

