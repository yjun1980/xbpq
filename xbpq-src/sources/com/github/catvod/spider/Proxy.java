package com.github.catvod.spider;

import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.MixDemo;
import com.github.catvod.parser.MixWeb;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.k.C0164g;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class Proxy extends Spider {
    public static int a = -1;

    public static String getUrl() {
        int i = a;
        String d = cYh.d("0F2435216D7548617366796A49606F606D");
        if (i <= 0) {
            int parseInt = Integer.parseInt(Init.e);
            while (true) {
                if (parseInt >= 10000) {
                    break;
                }
                if (C0164g.g(d + parseInt + cYh.d("4820333E2F2358342E6C3431"), null).equals(cYh.d("083B"))) {
                    SpiderDebug.log(cYh.d("213F343F337A0B3F22303B7A14353327322847202E23237A") + parseInt);
                    a = parseInt;
                    break;
                }
                parseInt++;
            }
        }
        StringBuilder b = C0059d.b(d);
        b.append(a);
        b.append(cYh.d("4820333E2F23"));
        return b.toString();
    }

    public static Object[] proxy(Map<String, String> map) {
        try {
            String str = map.get(cYh.d("033F"));
            boolean equals = str.equals(cYh.d("0B393734"));
            String d = cYh.d("3204077C6F");
            if (equals) {
                if (!map.get(cYh.d("13293134")).equals(cYh.d("132835"))) {
                    return null;
                }
                String str2 = map.get(cYh.d("022835"));
                if (!str2.startsWith(cYh.d("0F243521"))) {
                    str2 = new String(Base64.decode(str2, 10), d);
                }
                return com.github.catvod.spider.merge.N.a.h(str2);
            }
            if (str.equals(cYh.d("043B"))) {
                return new Object[]{200, cYh.d("13353925782A0B31283F6C7A04382023243F136D342531775F"), new ByteArrayInputStream(cYh.d("083B").getBytes(d))};
            }
            if (!str.equals(cYh.d("17253239")) && !str.equals(cYh.d("063C28"))) {
                if (str.equals(cYh.d("1F323120"))) {
                    return XBPQ.loadPic(map);
                }
                if (str.equals(cYh.d("1F322824"))) {
                    return XBiu.loadPic(map);
                }
                if (str.equals(cYh.d("06203108240C55"))) {
                    return AppYsV2.loadPic(map);
                }
                boolean equals2 = str.equals(cYh.d("2A393915323708"));
                String d2 = cYh.d("12222D");
                String d3 = cYh.d("013C2036");
                if (equals2) {
                    return MixDemo.loadHtml(map.get(d3), map.get(d2));
                }
                if (str.equals(cYh.d("2A3939063238"))) {
                    return MixWeb.loadHtml(map.get(d3), map.get(d2));
                }
                return null;
            }
            return Ali.proxy(map);
        } catch (Throwable unused) {
            return null;
        }
    }
}
