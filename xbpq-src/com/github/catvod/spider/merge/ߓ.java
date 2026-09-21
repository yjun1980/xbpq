/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0130;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u028f;
import com.github.catvod.spider.merge.\u07e0;
import com.github.catvod.spider.merge.\u0e33;
import java.util.ArrayList;
import java.util.LinkedList;

public class \u07d3
implements \u0130 {
    @Override
    public String name() {
        return SOY.d("1C3D3D1A1B00133C365B071E183E381813");
    }

    @Override
    public \u07e0 \u037f(\u0e33 object) {
        LinkedList<\u013a> linkedList = new LinkedList<\u013a>();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            \u0e33 \u0e332 = \u028f.\u037f((\u013a)object.next());
            if (\u0e332 == null) continue;
            linkedList.addAll(\u0e332);
        }
        object = new \u0e33();
        ((ArrayList)object).addAll(linkedList);
        return \u07e0.\u058f(object);
    }
}

