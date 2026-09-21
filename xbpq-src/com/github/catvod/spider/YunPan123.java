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
import com.github.catvod.spider.merge.I.a1;
import com.github.catvod.spider.merge.K.f;
import java.util.Arrays;
import java.util.List;

public class YunPan123
extends Spider {
    public String detailContent(String string, List<String> list) {
        string = list.get(0).trim();
        return f.n(a1.a().g(string));
    }

    public String detailContent(List<String> list) {
        return this.detailContent("", list);
    }

    public void init(Context context, String string) {
    }

    public String playerContent(String string, String stringArray, List<String> object) {
        object = new StringBuilder();
        ((StringBuilder)object).append("playerContent ids");
        ((StringBuilder)object).append((String)stringArray);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        if (BaseApi.isOk("yun123")) {
            return "";
        }
        object = a1.a();
        stringArray = stringArray.split("\\+");
        string.split("#")[0].equals("p123\u539f\u756b");
        return ((a1)object).j(stringArray);
    }

    public void test() {
        new YunPan123().detailContent(Arrays.asList("https://www.123684.com/s/Gme4Td-BW0Bd?\u63d0\u53d6\u7801:evCv"));
    }
}

