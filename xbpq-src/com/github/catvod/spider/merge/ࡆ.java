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
import java.util.HashSet;

public class \u0846
implements \u0130 {
    @Override
    public String name() {
        return SOY.d("1E37221511191E333F025918087F22131811");
    }

    @Override
    public \u07e0 \u037f(\u0e33 object) {
        HashSet<\u013a> hashSet = new HashSet<\u013a>();
        \u0e33 \u0e332 = new \u0e33();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            hashSet.addAll(((\u013a)object.next()).\u086a());
        }
        \u0e332.addAll(hashSet);
        return \u07e0.\u058f(\u0e332);
    }
}

