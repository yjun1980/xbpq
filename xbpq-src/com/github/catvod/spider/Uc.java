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
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.K.f;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc
extends Spider {
    public static final Pattern a = Pattern.compile("drive.uc.cn/s/([^#/]+)(#*/list/share/([^\\-]+))?");

    public static Object[] proxy(Map<String, String> map) {
        if ("unlimited".equals(map.get("type"))) {
            return L0.s().M(map);
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("Unknown uc proxy type: ");
        stringBuilder.append(map.get("type"));
        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream(stringBuilder.toString().getBytes("UTF-8"))};
    }

    public String detailContent(String string, List<String> object) {
        String string2 = object.get(0).trim();
        object = "";
        String string3 = string2.replace("?public=1", "");
        e.d("quark detailContent url:", string3);
        Matcher matcher = a.matcher(string3);
        if (!matcher.find()) {
            return "";
        }
        string2 = matcher.group(1);
        if (matcher.groupCount() == 3) {
            object = matcher.group(3);
        }
        return f.n(L0.s().E(string3, string2, (String)object, string));
    }

    public String detailContent(List<String> object) {
        String string = object.get(0).trim().replace("?public=1", "");
        e.d("quark detailContent url:", string);
        object = a.matcher(string);
        if (!((Matcher)object).find()) {
            return "";
        }
        String string2 = ((Matcher)object).group(1);
        object = ((Matcher)object).groupCount() == 3 ? ((Matcher)object).group(3) : "";
        return f.n(L0.s().E(string, string2, (String)object, ""));
    }

    public void init(Context object, String string) {
        Objects.requireNonNull(L0.s());
        object = new StringBuilder();
        ((StringBuilder)object).append("UcPanApi init extend:");
        ((StringBuilder)object).append(string);
        SpiderDebug.log((String)((StringBuilder)object).toString());
    }

    public String playerContent(String string, String string2, List list) {
        Objects.requireNonNull(L0.s());
        return this.playerContentInternal(string, string2, list);
    }

    public String playerContentInternal(String string, String stringArray, List<String> object) {
        object = new StringBuilder();
        ((StringBuilder)object).append("quark playerContent id:");
        ((StringBuilder)object).append((String)stringArray);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        if (BaseApi.isOk("uc")) {
            return "";
        }
        stringArray = stringArray.split("\\+");
        if (!string.startsWith("\u4ee3\u7406\u539f\u756b") && !string.startsWith("\u6975\u901fGO\u539f\u756b")) {
            if (string.startsWith("\u8f49\u5b58\u539f\u756b")) {
                return L0.s().J(stringArray);
            }
            return L0.s().K(stringArray, string);
        }
        return L0.s().K(stringArray, string);
    }

    public void test() {
        String string = this.detailContent(Arrays.asList("https://drive.uc.cn/s/a4aab66045db4?public=1"));
        System.out.println(string);
        string = this.playerContent("\u4ee3\u7406", "6a0a9e9ab3ea4+552b319d0d8f4030bc80c32fc6b141d1_1a5e3cad1549e34c71bfb4f701b3065e+\u5f77\u5fa8\u4e4b\u5203+Hovering.Blade.2024..4K60FPS.AAC.X265.mp4", null);
        System.out.println(string);
    }
}

