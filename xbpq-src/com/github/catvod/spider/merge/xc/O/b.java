/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.O;

import java.util.Map;

public final class b {
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public Double f = 0.0;
    public int g = 0;

    public static b a(String object, Map map) {
        b b2 = new b();
        Object object2 = map.get("fid");
        String string = "";
        object2 = object2 != null ? (String)map.get("fid") : "";
        b2.a = object2;
        b2.b = object;
        object = map.get("stoken") != null ? (String)map.get("stoken") : "";
        b2.c = object;
        object = map.get("share_fid_token") != null ? (String)map.get("share_fid_token") : "";
        b2.d = object;
        if (map.get("series_id") != null) {
            object = (String)map.get("series_id");
        }
        object = string;
        if (map.get("file_name") != null) {
            object = (String)map.get("file_name");
        }
        object2 = object;
        if (object != null) {
            object2 = ((String)object).isEmpty() ? object : ((String)object).replace("&#39;", "'").replace("&#34;", "\"").replace("&#38;", "&").replace("&#60;", "<").replace("&#62;", ">").replace("&apos;", "'").replace("&quot;", "\"").replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">");
        }
        b2.e = object2;
        if (map.get("obj_category") != null) {
            object = (String)map.get("obj_category");
        }
        if (map.get("format_type") != null) {
            object = (String)map.get("format_type");
        }
        double d2 = map.get("size") != null ? (Double)map.get("size") : 0.0;
        b2.f = d2;
        if (map.get("pdir_fid") != null) {
            object = (String)map.get("pdir_fid");
        }
        if (map.get("last_update_at") != null) {
            object = (Double)map.get("last_update_at");
        }
        b2.g = 1;
        return b2;
    }
}

