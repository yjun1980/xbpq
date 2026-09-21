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
import java.util.Collection;
import java.util.LinkedList;

public class \u0930
implements \u0130 {
    @Override
    public String name() {
        return SOY.d("0A2034151113133C36");
    }

    @Override
    public \u07e0 \u037f(\u0e33 object) {
        \u0e33 \u0e332 = new \u0e33();
        LinkedList<\u013a> linkedList = new LinkedList<\u013a>();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            \u013a \u013a2 = (\u013a)object.next();
            Object object2 = \u013a2.\u08ae().iterator();
            while (object2.hasNext()) {
                \u0e33 \u0e333 = \u028f.\u052a((\u013a)object2.next());
                if (\u0e333 == null) continue;
                linkedList.addAll(\u0e333);
            }
            object2 = \u028f.\u052a(\u013a2);
            if (object2 == null) continue;
            linkedList.addAll((Collection<\u013a>)object2);
        }
        \u0e332.addAll(linkedList);
        return \u07e0.\u058f(\u0e332);
    }
}

