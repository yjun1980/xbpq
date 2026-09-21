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
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuangYaPan
extends Spider {
    public static final Pattern a = Pattern.compile("www\\.guangyapan\\.com/s/([\\w-]+)(?:\\?code=([\\w]+))?(?:#/share/([\\w-]+))?");

    public String detailContent(String string, List<String> object) {
        Object object2;
        String string2;
        CharSequence charSequence;
        block6: {
            try {
                charSequence = new StringBuilder();
                charSequence.append("\u5149\u9e2d\u4e91\u76d8 detailContent vodName:");
                charSequence.append(string);
                charSequence.append(" ids:");
                charSequence.append(object);
                SpiderDebug.log((String)charSequence.toString());
                string2 = ((String)object.get(0)).trim();
                object2 = a.matcher(string2);
                if (((Matcher)object2).find()) break block6;
                return "";
            }
            catch (Exception exception) {
                object = com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 detailContent \u5f02\u5e38: ");
                ((StringBuilder)object).append(exception.getMessage());
                SpiderDebug.log((String)((StringBuilder)object).toString());
                return f.n(new h("1", "\u65e0\u6548", ""));
            }
        }
        object = ((Matcher)object2).group(1) != null ? ((Matcher)object2).group(1) : "";
        charSequence = ((Matcher)object2).group(2) != null ? ((Matcher)object2).group(2) : "";
        object2 = ((Matcher)object2).group(3) != null ? ((Matcher)object2).group(3) : "";
        string = f.n(X.n().v(string2, (String)object, (String)object2, (String)charSequence, string));
        return string;
    }

    public String detailContent(List<String> object) {
        String string = object.get(0).trim();
        e.d("\u5149\u9e2d\u4e91\u76d8 detailContent url:", string);
        Object object2 = a.matcher(string);
        if (!((Matcher)object2).find()) {
            return "";
        }
        object = ((Matcher)object2).group(1) != null ? ((Matcher)object2).group(1) : "";
        String string2 = ((Matcher)object2).group(2) != null ? ((Matcher)object2).group(2) : "";
        object2 = ((Matcher)object2).group(3) != null ? ((Matcher)object2).group(3) : "";
        return f.n(X.n().v(string, (String)object, (String)object2, string2, ""));
    }

    public void init(Context context, String string) {
        SpiderDebug.log((String)"\u5149\u9e2d\u4e91\u76d8 init");
    }

    public String playerContent(String string, String string2, List object) {
        object = new StringBuilder();
        ((StringBuilder)object).append("\u5149\u9e2d\u4e91\u76d8 playerContent flag:");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" id:");
        ((StringBuilder)object).append(string2);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        if (BaseApi.isOk("guangya")) {
            return "";
        }
        return X.n().z(string2);
    }
}

