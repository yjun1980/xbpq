/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0155;
import com.github.catvod.spider.merge.\u07d9;
import com.github.catvod.spider.merge.\u07e0;
import java.util.LinkedList;

public class \u07d4
implements \u07d9 {
    @Override
    public String name() {
        return SOY.d("1B3E3D22110F0E");
    }

    @Override
    public \u07e0 \u037f(\u0155 object2) {
        LinkedList<String> linkedList = new LinkedList<String>();
        for (Object object2 : ((\u0155)object2).\u037f()) {
            String string = ((\u013a)object2).\u0789();
            if (SOY.d("0931231F0403").equals(string)) {
                linkedList.add(((\u013a)object2).\u0866());
                continue;
            }
            linkedList.add(((\u013a)object2).\u08b9());
        }
        return \u07e0.\u058f(linkedList);
    }
}

