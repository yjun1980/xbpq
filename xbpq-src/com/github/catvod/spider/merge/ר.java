/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0130;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u07e0;
import com.github.catvod.spider.merge.\u0e33;
import java.util.ArrayList;

public class \u05e8
implements \u0130 {
    @Override
    public String name() {
        return SOY.d("193A381A10");
    }

    @Override
    public \u07e0 \u037f(\u0e33 object) {
        \u0e33 \u0e332 = new \u0e33();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            \u0e332.addAll(((\u013a)object.next()).\u0864());
        }
        return \u07e0.\u058f(\u0e332);
    }
}

