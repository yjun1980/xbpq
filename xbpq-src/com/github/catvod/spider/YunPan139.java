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
import com.github.catvod.spider.merge.I.b1;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YunPan139
extends Spider {
    public static final Pattern a = Pattern.compile("(?:caiyun|yun)\\.139\\.com/(?:shareweb/#/)?([wm])/i/?(.*)");

    private h a(String string, Matcher matcher, String string2) {
        String string3 = matcher.group(2).replace("?", "");
        if (matcher.groupCount() == 4) {
            matcher.group(4);
        }
        return b1.a().e(string, string2, string3);
    }

    public static void main(String[] stringArray) {
        new YunPan139().detailContent(Arrays.asList("https://caiyun.139.com/w/i/1R5BSsm7w5g4h"));
    }

    public String detailContent(String string, List<String> object) {
        Matcher matcher = a.matcher((CharSequence)(object = object.get(0).trim()));
        string = matcher.find() ? f.n(this.a(string, matcher, (String)object)) : "";
        return string;
    }

    public String detailContent(List<String> object) {
        String string = object.get(0).trim();
        object = ((Matcher)(object = a.matcher(string))).find() ? f.n(this.a("\u63a8\u9001\u5f02\u52a8", (Matcher)object, string)) : "";
        return object;
    }

    public void init(Context context, String string) {
    }

    public String playerContent(String string, String string2, List<String> object) {
        object = new StringBuilder();
        ((StringBuilder)object).append("playerContent ids");
        ((StringBuilder)object).append(string2);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        if (BaseApi.isOk("Yun139")) {
            return "";
        }
        return b1.a().g(string2.split("\\+"), string.split("#")[0].equals("\u5f02\u52a8\u539f\u756b"));
    }
}

