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
import java.util.LinkedList;

public class \u062f
implements \u0130 {
    @Override
    public String name() {
        return SOY.d("1C3D3D1A1B00133C365B071E183E3818135A153C34");
    }

    @Override
    public \u07e0 \u037f(\u0e33 object) {
        LinkedList<\u013a> linkedList = new LinkedList<\u013a>();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            \u013a \u013a2 = (\u013a)object.next();
            if (\u013a2.\u08a9() == null) continue;
            linkedList.add(\u013a2.\u08a9());
        }
        object = new \u0e33();
        ((ArrayList)object).addAll(linkedList);
        return \u07e0.\u058f(object);
    }
}

