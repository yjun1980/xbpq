/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u03aa;
import com.github.catvod.spider.merge.\u068c;
import com.github.catvod.spider.merge.\u07e0;
import java.util.List;

public class \u0e32
implements \u03aa {
    @Override
    public String name() {
        return SOY.d("143D25");
    }

    @Override
    public \u07e0 \u037f(\u0155 \u01552, List<\u07e0> list) {
        if (list.size() == 1) {
            return \u07e0.\u058f(list.get(0).\u037f() ^ true);
        }
        throw new \u068c(SOY.d("1F20231906570A3323171957133C71181B0352303E19185E5A3424181703133D3F58241B1F33221354141237321D5A"));
    }
}

