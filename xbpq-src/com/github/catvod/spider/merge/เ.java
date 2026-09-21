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
import java.util.List;

public class \u0e40
implements \u0130 {
    @Override
    public String name() {
        return SOY.d("1B3C321307031520");
    }

    @Override
    public \u07e0 \u037f(\u0e33 object) {
        LinkedList<\u013a> linkedList = new LinkedList<\u013a>();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            linkedList.addAll(((\u013a)object.next()).\u08ae());
        }
        return \u07e0.\u058f(new \u0e33((List<\u013a>)linkedList));
    }
}

