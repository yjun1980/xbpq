/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.gson.JsonParser
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.g1.g;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.y.z;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class PanTa
extends NetPan {
    public String m = "https://www.leijing1.com/";
    public String n = "";

    private HashMap<String, String> o() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("cookie", this.n);
        return hashMap;
    }

    private String p(g object) {
        f f2 = new f();
        ArrayList<h> arrayList = new ArrayList<h>();
        Iterator iterator = ((AbstractCollection)object).iterator();
        while (iterator.hasNext()) {
            com.github.catvod.spider.merge.e1.m m2 = (com.github.catvod.spider.merge.e1.m)iterator.next();
            com.github.catvod.spider.merge.e1.m m3 = m2.n0(".title");
            object = m3.m0("a").j();
            h h2 = new h();
            h2.r("file");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m3.m0("a").a("href"));
            stringBuilder.append("#");
            stringBuilder.append((String)object);
            h2.l(stringBuilder.toString());
            h2.m((String)object);
            object = m2.n0(".avatarLink img").c("src");
            if (!((String)object).startsWith("https")) {
                object = r.c(new StringBuilder(), this.m, (String)object);
            }
            h2.n((String)object);
            arrayList.add(h2);
        }
        f2.y(arrayList);
        f2.k(-1, -1, -1, -1);
        return f2.toString();
    }

    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> serializable) {
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(this.m);
        ((StringBuilder)serializable).append(string);
        string = com.github.catvod.spider.merge.R0.e.b(string) ? "?" : "&";
        return this.p(com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.i0.m.q(z.b((StringBuilder)serializable, string, "page=", string2), this.o()).get("html")).m0(".topicItem"));
    }

    public String detailContent(List<String> list) {
        Object object = new StringBuilder();
        ((StringBuilder)object).append(this.m);
        ((StringBuilder)object).append(list.get(0).split("#")[0]);
        object = NetPan.findMatches(com.github.catvod.spider.merge.i0.m.q(((StringBuilder)object).toString(), this.o()).get("html"), "(https?://(?:www\\.(?:123684|123865|123912|123pan|123592)\\.com|www\\.123pan\\.cn|[\\w-]+\\.(?:share|mshare)\\.(?:123684|123865|123912|123pan|123592)\\.com|[\\w-]+\\.(?:share|mshare)\\.123pan\\.cn)/(?:s|123pan)/[\\w-]+(?:\\?(?:pwd=[\\w]+|\u63d0\u53d6\u7801:[^#\\s]*))?)|https?://(?:(?:www\\.(?:alipan|aliyundrive)\\.com|pan\\.quark\\.cn|drive\\.uc\\.cn)/s/\\w+(?:\\?public=1)?|(?:115|anxia|115cdn)\\.com/s/\\w+\\?password=\\w+#?|caiyun\\.139\\.com/m/i\\?\\w+|caiyun\\.139\\.com/w/i/\\w+|yun\\.139\\.com/shareweb/#/w/i/\\w+|cloud\\.189\\.cn/t/\\w{12}\uff08\u8bbf\u95ee\u7801\uff1a\\w+\uff09|pan\\.baidu\\.com/s/[\\w-]+(?:[?&]pwd=\\w{4})?|cloud\\.189\\.cn/t/\\w{12}|pan\\.xunlei\\.com/s/[^?]+\\?.*?pwd=[^&#]+|www\\.guangyapan\\.com/s/[\\w-]+(?:\\?code=[\\w]+)?(?:#/share/[\\w-]+)?)");
        return super.detailContent("", list.get(0).split("#")[1], (List)object);
    }

    public String homeContent(boolean bl) {
        ArrayList<a> arrayList = new ArrayList<a>();
        LinkedHashMap<String, List<c>> linkedHashMap = new LinkedHashMap<String, List<c>>();
        g g2 = com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.i0.m.q(this.m, this.o()).get("html")).m0(".tab,.tab_current");
        for (int i2 = 0; i2 < ((AbstractCollection)g2).size(); ++i2) {
            arrayList.add(new a(((com.github.catvod.spider.merge.e1.m)((AbstractList)g2).get(i2)).m0("a").a("href"), ((com.github.catvod.spider.merge.e1.m)((AbstractList)g2).get(i2)).s0(), "1"));
        }
        return com.github.catvod.spider.merge.K.f.q(arrayList, linkedHashMap);
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
        this.m = JsonParser.parseString((String)string).getAsJsonObject().get("siteUrl").getAsString();
        if (JsonParser.parseString((String)string).getAsJsonObject().get("cookie") != null) {
            this.n = JsonParser.parseString((String)string).getAsJsonObject().get("cookie").getAsString();
        }
    }

    public String searchContent(String string, boolean bl) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.m);
            stringBuilder.append("search?keyword=");
            stringBuilder.append(URLEncoder.encode(string));
            string = this.p(com.github.catvod.spider.merge.c1.d.l(com.github.catvod.spider.merge.i0.m.q(stringBuilder.toString(), this.o()).get("html")).m0(".topicItem"));
            return string;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

