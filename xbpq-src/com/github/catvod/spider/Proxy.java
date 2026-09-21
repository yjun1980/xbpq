/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.Ali
 *  com.github.catvod.spider.XBiu
 */
package com.github.catvod.spider;

import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.MixDemo;
import com.github.catvod.parser.MixWeb;
import com.github.catvod.spider.Ali;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.XBiu;
import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.k.g;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class Proxy
extends Spider {
    public static int a = -1;

    public static String getUrl() {
        int n2 = a;
        CharSequence charSequence = cYh.d("0F2435216D7548617366796A49606F606D");
        if (n2 <= 0) {
            for (n2 = Integer.parseInt(Init.e); n2 < 10000; ++n2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append(n2);
                stringBuilder.append(cYh.d("4820333E2F2358342E6C3431"));
                if (!g.g(stringBuilder.toString(), null).equals(cYh.d("083B"))) continue;
                stringBuilder = new StringBuilder();
                stringBuilder.append(cYh.d("213F343F337A0B3F22303B7A14353327322847202E23237A"));
                stringBuilder.append(n2);
                SpiderDebug.log((String)stringBuilder.toString());
                a = n2;
                break;
            }
        }
        charSequence = d.b((String)charSequence);
        ((StringBuilder)charSequence).append(a);
        ((StringBuilder)charSequence).append(cYh.d("4820333E2F23"));
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * Unable to fully structure code
     */
    public static Object[] proxy(Map<String, String> var0) {
        block12: {
            try {
                var2_2 = var0.get(cYh.d("033F"));
                var1_3 = var2_2.equals(cYh.d("0B393734"));
            }
            catch (Throwable var0_1) {
                ** continue;
            }
            var3_4 = cYh.d("3204077C6F");
            if (!var1_3) ** GOTO lbl16
            if (!var0.get(cYh.d("13293134")).equals(cYh.d("132835"))) break block12;
            var2_2 = (String)var0.get(cYh.d("022835"));
            var0 = var2_2;
            if (!var2_2.startsWith(cYh.d("0F243521"))) {
                var0 = new String(Base64.decode((String)var2_2, (int)10), var3_4);
            }
            return com.github.catvod.spider.merge.N.a.h((String)var0);
lbl16:
            // 1 sources

            if (var2_2.equals(cYh.d("043B"))) {
                return new Object[]{200, cYh.d("13353925782A0B31283F6C7A04382023243F136D342531775F"), new ByteArrayInputStream(cYh.d("083B").getBytes(var3_4))};
            }
            if (var2_2.equals(cYh.d("17253239")) || var2_2.equals(cYh.d("063C28"))) ** GOTO lbl34
            if (var2_2.equals(cYh.d("1F323120"))) {
                return XBPQ.loadPic((Map<String, String>)var0);
            }
            if (var2_2.equals(cYh.d("1F322824"))) {
                return XBiu.loadPic((Map)var0);
            }
            if (var2_2.equals(cYh.d("06203108240C55"))) {
                return AppYsV2.loadPic((Map<String, String>)var0);
            }
            var1_3 = var2_2.equals(cYh.d("2A393915323708"));
            var4_5 = cYh.d("12222D");
            var3_4 = cYh.d("013C2036");
            if (!var1_3) ** GOTO lbl31
            return MixDemo.loadHtml((String)var0.get(var3_4), (String)var0.get(var4_5));
lbl31:
            // 1 sources

            if (var2_2.equals(cYh.d("2A3939063238"))) {
                return MixWeb.loadHtml((String)var0.get(var3_4), (String)var0.get(var4_5));
            }
            break block12;
lbl34:
            // 1 sources

            var0 = Ali.proxy(var0);
            return var0;
        }
lbl37:
        // 2 sources

        return null;
    }
}

