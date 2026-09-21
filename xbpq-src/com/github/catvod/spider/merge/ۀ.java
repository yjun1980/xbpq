/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u02d1;
import com.github.catvod.spider.merge.\u03aa;
import com.github.catvod.spider.merge.\u07e0;
import java.util.List;

public class \u06c0
implements \u03aa {
    @Override
    public String name() {
        return SOY.d("092733050005133C365B110F");
    }

    @Override
    public \u07e0 \u037f(\u0155 object, List<\u07e0> list) {
        object = list.get(0).\u052d();
        int n2 = list.get(1).\u052c().intValue();
        if (list.get(2) != null) {
            return \u07e0.\u058f(\u02d1.\u0789((String)object, n2, list.get(2).\u052c().intValue()));
        }
        return \u07e0.\u058f(\u02d1.\u0788((String)object, n2));
    }
}

