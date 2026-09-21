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
import java.util.Iterator;
import java.util.LinkedList;

public class \u03a4
implements \u0130 {
    @Override
    public String name() {
        return SOY.d("0A2034151113133C365B071E183E3818135A153C34");
    }

    @Override
    public \u07e0 \u037f(\u0e33 cloneable) {
        LinkedList<Cloneable> linkedList = new LinkedList<Cloneable>();
        Iterator iterator = ((ArrayList)cloneable).iterator();
        while (iterator.hasNext()) {
            cloneable = (\u013a)iterator.next();
            if (((\u013a)cloneable).\u08b0() == null) continue;
            linkedList.add(cloneable);
        }
        cloneable = new \u0e33();
        ((ArrayList)cloneable).addAll(linkedList);
        return \u07e0.\u058f(cloneable);
    }
}

