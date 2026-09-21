/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.J;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.A;
import com.github.catvod.spider.merge.J.h;
import com.github.catvod.spider.merge.J.i;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.i0.m;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class k
extends Spider {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String detailContent(String object, List<String> list) {
        int n2;
        Object object2 = list.get(0).trim();
        Iterator iterator = A.a();
        Objects.requireNonNull(iterator);
        list = new ArrayList<String>();
        ((ArrayList)list).add("\u6446\u6e21\u539f\u756b");
        if (NetPan.containPuHua()) {
            ((ArrayList)list).add("\u6446\u6e21\u666e\u756b");
        }
        SpiderDebug.log((String)"baidu getVod called");
        ((A)((Object)iterator)).c.c = com.github.catvod.spider.merge.R0.e.d((CharSequence)object) ? object : "";
        object = ((A)((Object)iterator)).c;
        String string = ((A)((Object)iterator)).b.b();
        Objects.requireNonNull(object);
        Cloneable cloneable = new HashMap<String, String>();
        if (string != null && !string.isEmpty()) {
            String[] stringArray = string.split(";\\s*");
            int n3 = stringArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                String string2 = stringArray[n2];
                String[] stringArray2 = string2.split("=", 2);
                if (stringArray2.length != 2) continue;
                try {
                    ((HashMap)cloneable).put(stringArray2[0].trim(), URLDecoder.decode(stringArray2[1].trim(), "UTF-8"));
                    continue;
                }
                catch (Exception exception) {
                    e.d("Error decoding cookie: ", string2);
                }
            }
        }
        ((i)object).b = cloneable;
        h h2 = ((A)((Object)iterator)).c.n(Collections.singletonList(object2));
        try {
            object = new com.github.catvod.spider.merge.K.h();
            cloneable = new ArrayList();
            for (n2 = 0; n2 < ((ArrayList)list).size(); ++n2) {
                ((ArrayList)cloneable).add((String)((List)h2.b).get(0));
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            m.y(exception.getMessage());
            object = BaseApi.fakeVod(list, "\u6446\u6e21");
            return f.n((com.github.catvod.spider.merge.K.h)object);
        }
        {
            ((com.github.catvod.spider.merge.K.h)object).l((String)object2);
            ((com.github.catvod.spider.merge.K.h)object).j((String)object2);
            ((com.github.catvod.spider.merge.K.h)object).n("https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/df/92/ee/df92ee21-b113-91fd-d6a9-c63827f1ae28/AppIcon-0-0-1x_U007ephone-0-11-0-0-sRGB-85-220.png/350x350.png");
            ((com.github.catvod.spider.merge.K.h)object).m(((A)((Object)iterator)).c.c);
            iterator = new Iterator();
            object2 = ((ArrayList)cloneable).iterator();
            boolean bl = object2.hasNext();
            if (bl) {
                while (true) {
                    ((StringBuilder)((Object)iterator)).append((CharSequence)object2.next());
                    if (!object2.hasNext()) break;
                    ((StringBuilder)((Object)iterator)).append((CharSequence)"$$$");
                }
            }
            ((com.github.catvod.spider.merge.K.h)object).p(((StringBuilder)((Object)iterator)).toString());
            object2 = new StringBuilder();
            iterator = ((ArrayList)list).iterator();
            if (iterator.hasNext()) {
                while (true) {
                    ((StringBuilder)object2).append((CharSequence)iterator.next());
                    if (!iterator.hasNext()) break;
                    ((StringBuilder)object2).append((CharSequence)"$$$");
                }
            }
            ((com.github.catvod.spider.merge.K.h)object).o(((StringBuilder)object2).toString());
            ((com.github.catvod.spider.merge.K.h)object).g("\u6446\u6e21");
            return f.n((com.github.catvod.spider.merge.K.h)object);
        }
    }

    public final String detailContent(List<String> list) {
        return this.detailContent("", list);
    }

    public final void init(Context context, String string) {
    }

    public final String playerContent(String string, String string2, List<String> object) {
        e.d("playerContent ids", string2);
        if (BaseApi.isOk("YunPanBd")) {
            return "";
        }
        object = A.a();
        string.split("#")[0].equals("\u6446\u6e21\u539f\u756b");
        return ((A)object).c(new String[]{string2});
    }
}

