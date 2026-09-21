/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.j;
import java.util.AbstractMap;
import java.util.List;
import java.util.function.Consumer;

public final class e
implements Consumer {
    public final List a;
    public final List b;

    public /* synthetic */ e(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final void accept(Object object) {
        List list = this.a;
        List list2 = this.b;
        object = (com.github.catvod.spider.merge.F0.e)object;
        int n2 = ((com.github.catvod.spider.merge.F0.e)object).e("startIndex", -1);
        int n3 = ((com.github.catvod.spider.merge.F0.e)object).e("length", 0);
        if (n2 >= 0 && n3 >= 1) {
            n3 += n2;
            if (((AbstractMap)object).containsKey("strikethrough")) {
                list.add(new j("<s>", "</s>", n2, null));
                list2.add(new j("<s>", "</s>", n3, null));
            }
            if (((com.github.catvod.spider.merge.F0.e)object).d("italic")) {
                list.add(new j("<i>", "</i>", n2, null));
                list2.add(new j("<i>", "</i>", n3, null));
            }
            if (((AbstractMap)object).containsKey("weightLabel") && !"FONT_WEIGHT_NORMAL".equals(((com.github.catvod.spider.merge.F0.e)object).i("weightLabel", null))) {
                list.add(new j("<b>", "</b>", n2, null));
                list2.add(new j("<b>", "</b>", n3, null));
            }
        }
    }
}

