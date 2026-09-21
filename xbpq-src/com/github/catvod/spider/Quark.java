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
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.K.f;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quark
extends Spider {
    public static final Pattern a = Pattern.compile("pan.quark.cn/s/([^#/]+)(#*/list/share/([^\\-]+))?");

    public static void test() {
        String string = new Quark().detailContent(Arrays.asList("https://pan.quark.cn/s/1ca9adc1d480"));
        System.out.println(string);
    }

    public String detailContent(String string, List<String> object) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append("\u7f51\u76d8\u96c6\u5408 detailContent ids 3:");
        charSequence.append(object);
        SpiderDebug.log((String)charSequence.toString());
        charSequence = object.get(0).trim();
        e.d("quark detailContent url:", (String)charSequence);
        Matcher matcher = a.matcher(charSequence);
        boolean bl = matcher.find();
        object = "";
        if (!bl) {
            return "";
        }
        String string2 = matcher.group(1);
        if (matcher.groupCount() == 3) {
            object = matcher.group(3);
        }
        return f.n(s0.o().B((String)charSequence, string2, (String)object, string));
    }

    public String detailContent(List<String> object) {
        String string = object.get(0).trim();
        e.d("quark detailContent url:", string);
        object = a.matcher(string);
        if (!((Matcher)object).find()) {
            return "";
        }
        String string2 = ((Matcher)object).group(1);
        object = ((Matcher)object).groupCount() == 3 ? ((Matcher)object).group(3) : "";
        return f.n(s0.o().B(string, string2, (String)object, ""));
    }

    public void init(Context object, String string) {
        Objects.requireNonNull(s0.o());
        object = new StringBuilder();
        ((StringBuilder)object).append("QuarkPanApi init extend:");
        ((StringBuilder)object).append(string);
        SpiderDebug.log((String)((StringBuilder)object).toString());
    }

    public String playerContent(String string, String string2, List list) {
        Objects.requireNonNull(s0.o());
        return this.playerContentInternal(string, string2, list);
    }

    public String playerContentInternal(String string, String stringArray, List<String> object) {
        object = new StringBuilder();
        ((StringBuilder)object).append("quark playerContent id:");
        ((StringBuilder)object).append((String)stringArray);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        stringArray = stringArray.split("\\+");
        if (!string.startsWith("\u4ee3\u7406\u539f\u756b") && !string.startsWith("\u6975\u901fGO\u539f\u756b")) {
            if (string.startsWith("\u8f49\u5b58\u539f\u756b")) {
                return s0.o().G(stringArray);
            }
            return s0.o().H(stringArray, string);
        }
        return s0.o().H(stringArray, string);
    }
}

