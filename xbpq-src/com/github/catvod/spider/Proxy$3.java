/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.parser.MixDemo
 *  com.github.catvod.spider.Czsapp
 *  com.github.catvod.spider.Ddys
 */
package com.github.catvod.spider;

import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.MixDemo;
import com.github.catvod.parser.MixWeb;
import com.github.catvod.spider.Czsapp;
import com.github.catvod.spider.Ddys;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.xc;
import com.github.catvod.spider.merge.\u0783;
import com.github.catvod.spider.merge.\u078c;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class Proxy$3
extends Spider {
    public static int \u037f = -1;

    public static String localProxyUrl() {
        Proxy$3.\u037f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("122625064E58556363415A4754627F474E"));
        stringBuilder.append(\u037f);
        stringBuilder.append(SOY.d("552223190C0E"));
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    public static Object[] proxy(Map<String, String> var0) {
        block11: {
            try {
                var2_2 = var0.get(SOY.d("1E3D"));
                var1_3 = var2_2.equals(SOY.d("163B2713"));
            }
            catch (Throwable var0_1) {
                ** continue;
            }
            var3_4 = SOY.d("2F06175B4C");
            if (!var1_3) ** GOTO lbl16
            if (!var0.get(SOY.d("0E2B2113")).equals(SOY.d("0E2A25"))) break block11;
            var2_2 = var0.get(SOY.d("1F2A25"));
            var0 = var2_2;
            if (!var2_2.startsWith(SOY.d("12262506"))) {
                var0 = new String(Base64.decode((String)var2_2, (int)10), var3_4);
            }
            return \u0783.\u0529((String)var0);
lbl16:
            // 1 sources

            if (var2_2.equals(SOY.d("1939"))) {
                return new Object[]{200, SOY.d("0E3729025B07163338184F57193A300407120E6F2402125A42"), new ByteArrayInputStream(SOY.d("1539").getBytes(var3_4))};
            }
            if (var2_2.equals(SOY.d("0A27221E"))) {
                return xc.vod(var0);
            }
            var1_3 = var2_2.equals(SOY.d("0A33230511201F30"));
            var3_4 = SOY.d("1C3E3011");
            var4_5 = SOY.d("0F203D");
            if (!var1_3) ** GOTO lbl26
            return MixWeb.loadHtml((String)var0.get(var3_4), (String)var0.get(var4_5));
lbl26:
            // 1 sources

            if (var2_2.equals(SOY.d("0A332305113A132A"))) {
                return MixDemo.loadHtml((String)((String)var0.get(var3_4)), (String)((String)var0.get(var4_5)));
            }
            if (var2_2.equals(SOY.d("1928220604"))) {
                return Czsapp.loadsub((String)((String)var0.get(var4_5)));
            }
            if (!var2_2.equals(SOY.d("1E362805"))) break block11;
            var0 = Ddys.loadsub((String)((String)var0.get(var4_5)));
            return var0;
        }
lbl34:
        // 2 sources

        return null;
    }

    static void \u037f() {
        if (\u037f > 0) {
            return;
        }
        for (int i2 = 9978; i2 < 10000; ++i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("122625064E58556363415A4754627F474E"));
            stringBuilder.append(i2);
            stringBuilder.append(SOY.d("552223190C0E45363E4B171C"));
            if (!\u078c.\u058f(stringBuilder.toString(), null).equals(SOY.d("1539"))) continue;
            stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("3C3D24181057163D321718570937230011055A223E040057"));
            stringBuilder.append(i2);
            SpiderDebug.log((String)stringBuilder.toString());
            \u037f = i2;
            break;
        }
    }
}

