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

public class \u0390
implements \u07d9 {
    @Override
    public String name() {
        return SOY.d("15272513063F0E3F3D");
    }

    @Override
    public \u07e0 \u037f(\u0155 object) {
        LinkedList<String> linkedList = new LinkedList<String>();
        object = ((\u0155)object).\u037f().iterator();
        while (object.hasNext()) {
            linkedList.add(((\u013a)object.next()).\u078b());
        }
        return \u07e0.\u058f(linkedList);
    }
}

