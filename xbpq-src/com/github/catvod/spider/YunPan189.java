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
import com.github.catvod.spider.merge.I.c1;
import com.github.catvod.spider.merge.K.f;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YunPan189
extends Spider {
    public static final Pattern a = Pattern.compile("cloud.189.cn/t/?(.*)");

    public static void test() {
        new YunPan189().detailContent(Arrays.asList("https://cloud.189.cn/web/share?code=neQFre2uENr2"));
    }

    public String detailContent(String object, List<String> object2) {
        object = object2 = object2.get(0).trim().replaceAll("h5.cloud.189.cn/share.html#", "cloud.189.cn");
        if (((String)object2).contains("web/share?code=")) {
            object = ((String)object2).replace("web/share?code=", "t/");
        }
        Matcher matcher = a.matcher((CharSequence)object);
        boolean bl = matcher.find();
        object2 = "";
        if (bl) {
            object2 = matcher.group(1).replace("?", "");
            if (matcher.groupCount() == 4) {
                matcher.group(4);
            }
            object2 = f.n(c1.a().d((String)object, (String)object2));
        }
        return object2;
    }

    public String detailContent(List<String> list) {
        return this.detailContent("189\u63a8\u9001", list);
    }

    public void init(Context context, String string) {
    }

    public String playerContent(String string, String stringArray, List<String> object) {
        object = new StringBuilder();
        ((StringBuilder)object).append("playerContent ids");
        ((StringBuilder)object).append((String)stringArray);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object = c1.a();
        stringArray = stringArray.split("\\+");
        string.split("#")[0].equals("\u5929\u610f\u539f\u756b");
        return ((c1)object).f(stringArray);
    }
}

