/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.HttpUrl
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.f;
import com.github.catvod.spider.merge.y.z;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONObject;

public final class g {
    private static final Pattern e = Pattern.compile("tmdb-(\\d+)", 2);
    private static final Pattern f = Pattern.compile("\\[tmdb-\\d+\\]", 2);
    private static final Pattern g = Pattern.compile("\\[[^\\]]+\\]|\u3010[^\u3011]+\u3011|\\([^)]*\\)|\uff08[^\uff09]*\uff09");
    private static final Pattern h = Pattern.compile("\\b(19|20)\\d{2}\\b.*$");
    private static final Pattern i = Pattern.compile("\\.(2160p|1080p|720p|WEB-DL|BluRay|H265|H264|AAC|SONYHD|\u66f4\\d*|\u66f4\u65b0\u81f3?\\d*|\u5168\u96c6|\u5b8c\u7ed3|\u5168\\d+\u96c6|\\d+\u96c6\u5168|\u7b2c\\d+[\u5b63\u96c6]|EP?\\d+|HD|BD).*$", 2);
    private static final Pattern j = Pattern.compile("\\s+");
    private String a;
    private String b;
    private String c;
    private final Map<String, JSONObject> d = new ConcurrentHashMap<String, JSONObject>();

    public g() {
        this.a = "https://api.tmdb.org";
        this.b = "https://images.tmdb.org/t/p";
        this.c = "2894d9a1baf7812b451de03c801b0281";
    }

    public g(String string, String string2, String string3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private JSONObject a(String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poster", (Object)string);
            jSONObject.put("overview", (Object)string2);
            return jSONObject;
        }
        catch (Exception exception) {
            return jSONObject;
        }
    }

    public static g b() {
        return com.github.catvod.spider.merge.i0.f.a;
    }

    private Map<String, String> c() {
        return r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/122 Safari/537.36");
    }

    private JSONObject e(JSONObject jSONObject) {
        String string;
        if (jSONObject == null) {
            return null;
        }
        String string2 = string = jSONObject.optString("poster_path", "");
        if (string.isEmpty()) {
            string2 = jSONObject.optString("backdrop_path", "");
        }
        if (string2.isEmpty()) {
            return null;
        }
        return this.a(z.b(new StringBuilder(), this.b, "/w500", string2), jSONObject.optString("overview", ""));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject g(String string, String string2) {
        try {
            string = HttpUrl.parse((String)this.a).newBuilder().addPathSegment("3").addPathSegment("search").addPathSegment("multi").addQueryParameter("api_key", this.c).addQueryParameter("language", "zh-CN").addQueryParameter("query", string);
            if (string2 != null && !string2.isEmpty() && !string2.equals("null")) {
                string.addQueryParameter("year", string2);
            }
            string = string.build().toString();
            string2 = new JSONObject(com.github.catvod.spider.merge.f0.d.l(string, this.c(), null));
            if ((string2 = string2.optJSONArray("results")) == null) return null;
            int n2 = 0;
            while (n2 < string2.length()) {
                string = this.e(string2.getJSONObject(n2));
                if (string != null) {
                    return string;
                }
                ++n2;
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject d(String object, String string, String string2) {
        if (object == null) return this.a(string2, "");
        if (((String)object).trim().isEmpty()) {
            return this.a(string2, "");
        }
        String string3 = ((String)object).trim();
        if (((ConcurrentHashMap)this.d).containsKey(string3)) {
            string = (JSONObject)((ConcurrentHashMap)this.d).get(string3);
            object = string;
            if (!string.optString("poster").isEmpty()) return object;
            return this.a(string2, string.optString("overview"));
        }
        Object object2 = e.matcher((CharSequence)object);
        boolean bl = ((Matcher)object2).find();
        int n2 = 0;
        boolean bl2 = true;
        while (true) {
            int n3;
            block17: {
                String string4;
                block20: {
                    block18: {
                        block19: {
                            if (!bl2 || (bl2 = false)) break block19;
                            if (!bl) break block20;
                            string4 = ((Matcher)object2).group(1);
                            n3 = 0;
                        }
                        if (n3 < 2) {
                            object2 = (new String[]{"movie", "tv"})[n3];
                            String string5 = HttpUrl.parse((String)this.a).newBuilder().addPathSegment("3").addPathSegment((String)object2).addPathSegment(string4).addQueryParameter("api_key", this.c).addQueryParameter("language", "zh-CN").build().toString();
                            object2 = new JSONObject(com.github.catvod.spider.merge.f0.d.l(string5, this.c(), null));
                            object2 = this.e((JSONObject)object2);
                            if (object2 == null) break block17;
                            break block18;
                        }
                        object2 = null;
                    }
                    if (object2 != null) {
                        ((ConcurrentHashMap)this.d).put(string3, (JSONObject)((Matcher)object2));
                        return object2;
                    }
                }
                object = f.matcher((CharSequence)object).replaceAll("");
                object = g.matcher((CharSequence)object).replaceAll(" ");
                object = h.matcher((CharSequence)object).replaceAll("");
                object = (object = i.matcher((CharSequence)object).replaceAll("")) == null ? "" : j.matcher((CharSequence)object).replaceAll(" ").replace("#", "\uff03").replace("$", "\uff04").trim();
                int n4 = ((String)object).length();
                n3 = n2;
                while (true) {
                    n2 = n4;
                    if (n3 >= n4) break;
                    n2 = n4;
                    if (" ._-\u2014".indexOf(((String)object).charAt(n3)) < 0) break;
                    ++n3;
                }
                while (n3 < n2 && " ._-\u2014".indexOf(((String)object).charAt(n4 = n2 - 1)) >= 0) {
                    n2 = n4;
                }
                string4 = ((String)object).substring(n3, n2);
                if (!string4.isEmpty()) {
                    object = object2 = this.g(string4, string);
                    if (object2 == null) {
                        object = object2;
                        if (string != null) {
                            object = object2;
                            if (!string.isEmpty()) {
                                object = object2;
                                if (!string.equals("null")) {
                                    object = this.g(string4, null);
                                }
                            }
                        }
                    }
                    if (object != null) {
                        ((ConcurrentHashMap)this.d).put(string3, (JSONObject)object);
                        return object;
                    }
                }
                object = this.a("", "");
                ((ConcurrentHashMap)this.d).put(string3, (JSONObject)object);
                return this.a(string2, "");
                catch (Exception exception) {}
            }
            ++n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object[] f(Map<String, String> object) {
        block7: {
            block6: {
                Object object2;
                String string = (String)object.get("title");
                object = object2 = (String)object.get("default");
                if (object2 == null) {
                    object = "";
                }
                try {
                    object2 = this.d(string, "", (String)object).optString("poster", (String)object);
                    if (((String)object2).isEmpty() || !(object2 = com.github.catvod.spider.merge.f0.d.e((String)object2, this.c())).isSuccessful()) break block6;
                    object2 = object2.body().byteStream();
                }
                catch (Exception exception) {
                    SpiderDebug.log((Throwable)exception);
                }
                return new Object[]{200, "image/jpeg", object2};
            }
            try {
                if (((String)object).isEmpty() || !((String)object).startsWith("http") || !(object = com.github.catvod.spider.merge.f0.d.e((String)object, this.c())).isSuccessful()) break block7;
                object = object.body().byteStream();
            }
            catch (Exception exception) {
                return new Object[]{200, "image/jpeg", new ByteArrayInputStream(new byte[0])};
            }
            return new Object[]{200, "image/jpeg", object};
        }
        return new Object[]{200, "image/jpeg", new ByteArrayInputStream(new byte[0])};
    }
}

