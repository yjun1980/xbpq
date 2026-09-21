/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.I.Q0;
import com.github.catvod.spider.merge.I.S0;
import com.github.catvod.spider.merge.I.T0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.i0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XunleiSpider
extends Spider {
    private h a(String charSequence, String iterator, Q0 object, List<S0> object2) {
        Object object3;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("\u8fc5\u96f7\u76d8\u539f\u756b");
        ArrayList<S0> arrayList2 = new ArrayList<S0>();
        Iterator<S0> iterator2 = object2.iterator();
        while (iterator2.hasNext()) {
            object3 = iterator2.next();
            if (!e.d(m.n(((S0)object3).b))) continue;
            arrayList2.add((S0)object3);
        }
        if (!arrayList2.isEmpty()) {
            object2 = arrayList2;
        }
        arrayList2 = new ArrayList();
        iterator2 = T0.g().m();
        object3 = object2.iterator();
        while (true) {
            boolean bl = object3.hasNext();
            if (!bl) break;
            Object object4 = (S0)object3.next();
            if (((S0)object4).b.length() > 40) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(((S0)object4).b.substring(0, 37));
                ((StringBuilder)object2).append("...");
                object2 = ((StringBuilder)object2).toString();
            } else {
                object2 = ((S0)object4).b;
            }
            StringBuilder stringBuilder = new StringBuilder();
            O0.a(stringBuilder, ((Q0)object).a, "::", iterator2, "::");
            stringBuilder.append(((S0)object4).a);
            stringBuilder.append("::");
            stringBuilder.append(m.A(((S0)object4).b));
            object4 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)object2);
            stringBuilder.append("$");
            stringBuilder.append((String)object4);
            arrayList2.add((S0)((Object)stringBuilder.toString()));
        }
        object = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            object2 = new StringBuilder();
            iterator2 = arrayList2.iterator();
            if (iterator2.hasNext()) {
                while (true) {
                    ((StringBuilder)object2).append((CharSequence)((Object)iterator2.next()));
                    if (!iterator2.hasNext()) break;
                    ((StringBuilder)object2).append((CharSequence)"#");
                }
            }
            ((ArrayList)object).add(((StringBuilder)object2).toString());
        }
        object2 = new h();
        ((h)object2).l((String)((Object)iterator));
        ((h)object2).j((String)((Object)iterator));
        ((h)object2).n("https://pp.myapp.com/ma_icon/0/icon_113692_1776673175/256");
        if (!e.d(charSequence)) {
            charSequence = "\u8fc5\u96f7\u5206\u4eab";
        }
        ((h)object2).m((String)charSequence);
        charSequence = new StringBuilder();
        iterator = ((ArrayList)object).iterator();
        if (iterator.hasNext()) {
            while (true) {
                ((StringBuilder)charSequence).append((CharSequence)iterator.next());
                if (!iterator.hasNext()) break;
                ((StringBuilder)charSequence).append((CharSequence)"$$$");
            }
        }
        ((h)object2).p(((StringBuilder)charSequence).toString());
        charSequence = new StringBuilder();
        iterator = arrayList.iterator();
        if (iterator.hasNext()) {
            while (true) {
                ((StringBuilder)charSequence).append((CharSequence)iterator.next());
                if (!iterator.hasNext()) break;
                ((StringBuilder)charSequence).append((CharSequence)"$$$");
            }
        }
        ((h)object2).o(((StringBuilder)charSequence).toString());
        ((h)object2).g("\u8fc5\u96f7\u76d8");
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String detailContent(String object, List<String> object2) {
        try {
            object2 = ((String)object2.get(0)).trim();
            Object object3 = new StringBuilder();
            ((StringBuilder)object3).append("\u8fc5\u96f7\u76d8 detailContent: ");
            ((StringBuilder)object3).append((String)object2);
            SpiderDebug.log((String)((StringBuilder)object3).toString());
            object3 = T0.g().n((String)object2);
            if (object3 == null) {
                SpiderDebug.log((String)"\u8fc5\u96f7\u76d8 \u65e0\u6cd5\u89e3\u6790\u5206\u4eab\u94fe\u63a5");
                object = new ArrayList();
                return f.n(BaseApi.fakeVod(object, "\u8fc5\u96f7\u76d8"));
            }
            List<S0> list = T0.g().o((String)object2);
            if (!((ArrayList)list).isEmpty()) return f.n(this.a((String)object, (String)object2, (Q0)object3, list));
            SpiderDebug.log((String)"\u8fc5\u96f7\u76d8 \u5206\u4eab\u5217\u8868\u4e3a\u7a7a");
            object = new ArrayList();
            return f.n(BaseApi.fakeVod(object, "\u8fc5\u96f7\u76d8"));
        }
        catch (Exception exception) {
            object2 = a.c("\u8fc5\u96f7\u76d8 detailContent \u5f02\u5e38: ");
            ((StringBuilder)object2).append(exception.getMessage());
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            return f.n(BaseApi.fakeVod(new ArrayList(), "\u8fc5\u96f7\u76d8"));
        }
    }

    public String detailContent(List<String> list) {
        return this.detailContent("", list);
    }

    public void init(Context context, String string) {
    }

    public String playerContent(String charSequence, String charSequence2, List<String> object) {
        block7: {
            block6: {
                block5: {
                    try {
                        if (!BaseApi.isOk("xunlei")) break block5;
                        return "";
                    }
                    catch (Exception exception) {
                        r.f(exception, a.c("\u8fc5\u96f7\u76d8 playerContent \u5f02\u5e38: "));
                        return "";
                    }
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u8fc5\u96f7\u76d8 playerContent id: ");
                ((StringBuilder)charSequence).append((String)charSequence2);
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                charSequence = charSequence2.split("::");
                if (((CharSequence)charSequence).length >= 3) break block6;
                SpiderDebug.log((String)"\u8fc5\u96f7\u76d8 playerContent \u53c2\u6570\u4e0d\u8db3");
                return "";
            }
            object = charSequence[0];
            CharSequence charSequence3 = charSequence[1];
            charSequence2 = charSequence[2];
            charSequence2 = T0.g().k((String)charSequence2, (String)object, (String)charSequence3);
            object = new StringBuilder();
            ((StringBuilder)object).append("\u8fc5\u96f7\u76d8 downloadUrl: ");
            ((StringBuilder)object).append((String)charSequence2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            T0.g().d();
            if (!e.b(charSequence2)) break block7;
            return "";
        }
        object = new f();
        ((f)object).w((String)charSequence2);
        ((f)object).j();
        ((f)object).b(u.p().r((String[])charSequence));
        charSequence = ((f)object).toString();
        return charSequence;
    }
}

