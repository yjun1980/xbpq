/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u03aa;
import com.github.catvod.spider.merge.\u07e0;
import java.util.List;

public class \u09fb
implements \u03aa {
    @Override
    public String name() {
        return SOY.d("092630040004572538021C");
    }

    @Override
    public \u07e0 \u037f(\u0155 \u01552, List<\u07e0> list) {
        return \u07e0.\u058f(list.get(0).\u052d().startsWith(list.get(1).\u052d()));
    }
}

