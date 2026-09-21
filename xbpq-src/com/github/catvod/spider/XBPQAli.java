/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.dp.p;
import com.github.catvod.spider.merge.fb.d;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XBPQAli
extends Spider {
    public static final Pattern a = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");

    public static Object[] proxy(Map<String, String> map) {
        String string = map.get("type");
        if (string.equals("sub")) {
            return p.o().H(map);
        }
        if (string.equals("token")) {
            return p.o().w();
        }
        return null;
    }

    public String detailContent(List<String> object) {
        String string;
        block4: {
            try {
                string = object.get(0).trim().replace("www.alipan.com", "www.aliyundrive.com");
                object = a.matcher(string);
                if (((Matcher)object).find()) break block4;
                return "";
            }
            catch (Exception exception) {
                return "";
            }
        }
        String string2 = ((Matcher)object).group(1);
        object = ((Matcher)object).groupCount() == 3 ? ((Matcher)object).group(3) : "";
        p.o().K(string2);
        object = d.e(p.o().z(string, (String)object));
        return object;
    }

    public void init(Context context, String string) {
        p.o().J(string);
    }

    public String playerContent(String object, String stringArray, List<String> object2) {
        try {
            stringArray = stringArray.split("\\+");
            if (((String)object).equals(">\u539f\u753b<")) {
                object = p.o();
                object.getClass();
                object2 = new d();
                ((d)object2).i(((p)object).p(stringArray[0]));
                ((d)object2).h(((p)object).v(stringArray));
                ((d)object2).a(((p)object).q());
                object = ((d)object2).toString();
            } else {
                object = p.o().F(stringArray, (String)object);
            }
            return object;
        }
        catch (Exception exception) {
            return "";
        }
    }
}

