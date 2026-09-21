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
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.K.f;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Yun115
extends Spider {
    public static final Pattern a = Pattern.compile("https://(?:115|anxia|115cdn)\\.com/s/([a-zA-Z0-9]+)\\?password=([a-zA-Z0-9]+)");

    public static void test() {
        String string = new Yun115().detailContent("", Arrays.asList("https://115.com/s/swzew4m3nc6?password=i0d7#_2920619578952252542"));
        System.out.println(string);
    }

    public String detailContent(String string, List<String> object) {
        Object object2 = object.get(0).trim().split("_");
        String string2 = object2[0];
        e.d("115 detailContent url:", string2);
        object = a.matcher(string2);
        if (!((Matcher)object).find()) {
            return "";
        }
        String string3 = ((Matcher)object).group(1);
        object = ((Matcher)object).groupCount() == 2 ? ((Matcher)object).group(2) : "";
        f1 f12 = f1.c();
        object2 = ((String[])object2).length > 1 ? object2[1] : "0";
        return f.n(f12.g(string2, string3, (String)object2, string, (String)object));
    }

    public String detailContent(List<String> object) {
        String string = object.get(0).trim();
        e.d("115 detailContent url:", string);
        Object object2 = a.matcher(string);
        if (!((Matcher)object2).find()) {
            return "";
        }
        String string2 = ((Matcher)object2).group(1);
        object = ((Matcher)object2).groupCount() == 2 ? ((Matcher)object2).group(2) : "";
        object2 = ((Matcher)object2).groupCount() == 3 ? ((Matcher)object2).group(3) : "";
        return f.n(f1.c().g(string, string2, (String)object2, "", (String)object));
    }

    public void init(Context object, String string) {
        Objects.requireNonNull(f1.c());
        object = new StringBuilder();
        ((StringBuilder)object).append("QuarkPanApi init extend:");
        ((StringBuilder)object).append(string);
        SpiderDebug.log((String)((StringBuilder)object).toString());
    }

    public String playerContent(String string, String string2, List list) {
        Objects.requireNonNull(f1.c());
        return this.playerContentInternal(string, string2, list);
    }

    public String playerContentInternal(String string, String charSequence, List<String> stringArray) {
        stringArray = new StringBuilder();
        stringArray.append("quark playerContent id:");
        stringArray.append((String)charSequence);
        SpiderDebug.log((String)stringArray.toString());
        stringArray = ((String)charSequence).split("\\+");
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("quark playerContent flag:");
        ((StringBuilder)charSequence).append(string);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        return f1.c().k(stringArray, string);
    }
}

