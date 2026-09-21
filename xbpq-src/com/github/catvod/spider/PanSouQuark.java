/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import java.net.URLEncoder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PanSouQuark
extends NetPan {
    private String searchContent(String string, String arrayList) {
        Object object = com.github.catvod.spider.merge.C.a.c("https://www.aipanso.com/search?k=");
        ((StringBuilder)object).append(URLEncoder.encode(string));
        ((StringBuilder)object).append("&page=");
        ((StringBuilder)object).append((String)((Object)arrayList));
        ((StringBuilder)object).append("&s=0&t=-1");
        object = ((StringBuilder)object).toString();
        arrayList = new HashMap();
        ((HashMap)((Object)arrayList)).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        object = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.f0.d.l((String)object, (Map<String, String>)((Object)arrayList), null)).m0("van-row > a");
        arrayList = new ArrayList<h>();
        Iterator iterator = ((AbstractCollection)object).iterator();
        while (iterator.hasNext()) {
            m m2 = (m)iterator.next();
            String string2 = m2.n0("template").s0().trim();
            if (!string2.contains(string)) continue;
            object = new h();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m2.c("href"));
            stringBuilder.append("#");
            stringBuilder.append(string);
            ((h)object).l(stringBuilder.toString());
            ((h)object).n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/c7/6c/55/c76c5544-64a5-882a-3862-c68b28f16299/AppIcon-0-0-1x_U007ephone-0-11-0-0-85-220.png/350x350.png");
            ((h)object).m(string2);
            arrayList.add((h)object);
        }
        return com.github.catvod.spider.merge.K.f.o(arrayList);
    }

    public String detailContent(List<String> list) {
        if (NetPan.a.matcher(list.get(0).split("#")[0]).find()) {
            return super.detailContent(list);
        }
        CharSequence charSequence = com.github.catvod.spider.merge.C.a.c("https://www.aipanso.com");
        charSequence.append(list.get(0).split("#")[0].replace("/s/", "/cv/"));
        String string = charSequence.toString();
        charSequence = list.get(0).split("#")[0];
        HashMap hashMap = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://www.aipanso.com");
        stringBuilder.append((String)charSequence);
        hashMap.put("Referer", stringBuilder.toString());
        hashMap.put("_bid", "6d14a5dd6c07980d9dc089a693805ad8");
        charSequence = com.github.catvod.spider.merge.f0.d.c(string, hashMap);
        return super.detailContent("", list.get(0).split("#")[1], Arrays.asList(charSequence));
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, "1");
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.searchContent(string, string2);
    }
}

