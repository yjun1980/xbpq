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
import java.util.List;

public class \u06d5
implements \u0130 {
    @Override
    public String name() {
        return SOY.d("1C3D3D1A1B00133C36");
    }

    @Override
    public \u07e0 \u037f(\u0e33 object) {
        LinkedList<\u013a> linkedList = new LinkedList<\u013a>();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            \u013a \u013a2 = (\u013a)object.next();
            Object object2 = \u013a2.\u08ae().iterator();
            while (object2.hasNext()) {
                Object object3 = \u028f.\u037f((\u013a)object2.next());
                if (object3 == null) continue;
                object3 = ((ArrayList)object3).iterator();
                while (object3.hasNext()) {
                    linkedList.addAll(((\u013a)object3.next()).\u086a());
                }
            }
            object2 = \u028f.\u037f(\u013a2);
            if (object2 == null) continue;
            object2 = ((ArrayList)object2).iterator();
            while (object2.hasNext()) {
                linkedList.addAll(((\u013a)object2.next()).\u086a());
            }
        }
        return \u07e0.\u058f(new \u0e33((List<\u013a>)linkedList));
    }
}

