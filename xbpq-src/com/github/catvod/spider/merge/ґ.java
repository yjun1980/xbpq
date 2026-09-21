/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u02d1;
import com.github.catvod.spider.merge.\u07d9;
import com.github.catvod.spider.merge.\u07e0;
import com.github.catvod.spider.merge.\u0e33;

public class \u0491
implements \u07d9 {
    @Override
    public String name() {
        return SOY.d("143D3513");
    }

    @Override
    public \u07e0 \u037f(\u0155 object) {
        \u0e33 \u0e332 = new \u0e33();
        for (Object object2 : ((\u0155)object).\u037f()) {
            \u0e332.addAll(((\u013a)object2).\u0864());
            if (!\u02d1.\u0620((CharSequence)(object2 = ((\u013a)object2).\u08ab()))) continue;
            \u013a \u013a2 = new \u013a("");
            \u013a2.\u07a5((String)object2);
            \u0e332.add(\u013a2);
        }
        return \u07e0.\u058f(\u0e332);
    }
}

