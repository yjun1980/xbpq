/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.k0.e;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SP360
extends Spider {
    protected JSONObject a = null;

    protected final HashMap<String, String> a() {
        return r.e("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> object) {
        int n2;
        int n3;
        int n4;
        String string3;
        StringBuilder stringBuilder;
        String string4 = "upinfo";
        String string5 = "total";
        try {
            CharSequence charSequence;
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append("https://api.web.360kan.com/v1/filter/list?catid=");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append("&pageno=");
            ((StringBuilder)object2).append(string2);
            string2 = ((StringBuilder)object2).toString();
            for (String string6 : ((HashMap)object).keySet()) {
                charSequence = ((String)((HashMap)object).get(string6)).trim();
                if (((String)charSequence).length() == 0) continue;
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("&");
                stringBuilder.append(string6);
                stringBuilder.append("=");
                stringBuilder.append(URLEncoder.encode((String)charSequence));
                string2 = stringBuilder.toString();
            }
            string2 = e.d(string2, this.a());
            JSONObject jSONObject = new JSONObject(string2);
            string2 = jSONObject.getJSONObject("data");
            object2 = string2.getJSONArray("movies");
            stringBuilder = new JSONArray();
            string3 = string5;
            for (n4 = 0; n4 < object2.length(); ++n4) {
                CharSequence charSequence2;
                String string6;
                charSequence = object2.getJSONObject(n4);
                string6 = new JSONObject();
                string5 = charSequence.getString("cover");
                bl = charSequence.has(string4);
                if (bl) {
                    charSequence2 = charSequence.getString(string4);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string);
                    stringBuilder2.append("_");
                    stringBuilder2.append(charSequence.getString("id"));
                    string6.put("vod_id", (Object)stringBuilder2.toString());
                    string6.put("vod_name", (Object)charSequence.getString("title"));
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("https:");
                    ((StringBuilder)charSequence).append(string5);
                    string6.put("vod_pic", (Object)((StringBuilder)charSequence).toString());
                    string6.put("vod_remarks", (Object)charSequence2);
                } else {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append(string);
                    ((StringBuilder)charSequence2).append("_");
                    ((StringBuilder)charSequence2).append(charSequence.getString("id"));
                    string6.put("vod_id", (Object)((StringBuilder)charSequence2).toString());
                    string6.put("vod_name", (Object)charSequence.getString("title"));
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("https:");
                    ((StringBuilder)charSequence).append(string5);
                    string6.put("vod_pic", (Object)((StringBuilder)charSequence).toString());
                    string6.put("vod_remarks", (Object)"");
                }
                stringBuilder.put(string6);
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
        {
            string = new JSONObject();
            n3 = Integer.parseInt(string2.getString("current_page"));
            n2 = string2.getInt(string3);
            n4 = n2 % 24 == 0 ? n2 / 24 : n2 / 24 + 1;
        }
        {
            string.put("page", n3);
            string.put("pagecount", n4);
            string.put("limit", 24);
            string.put(string3, n2);
            string.put("list", (Object)stringBuilder);
            return string.toString();
        }
    }

    /*
     * Exception decompiling
     */
    public String detailContent(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[TRYBLOCK]], but top level block is 49[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String homeContent(boolean bl) {
        JSONObject jSONObject;
        block3: {
            jSONObject = new JSONObject();
            jSONObject.put("class", (Object)this.a.getJSONArray("classes"));
            if (!bl) break block3;
            try {
                jSONObject.put("filters", (Object)this.a.getJSONObject("filter"));
            }
            catch (JSONException jSONException) {
                SpiderDebug.log((Throwable)jSONException);
            }
        }
        return jSONObject.toString();
    }

    public String homeVideoContent() {
        JSONObject jSONObject = new JSONObject();
        Object object = new HashMap();
        String string = e.d("https://api.web.360kan.com/v1/rank?cat=1", object);
        SpiderDebug.log((String)"\u54cd\u5e94\u8bf7\u6c42\uff1ahttps://api.web.360kan.com/v1/rank?cat=1");
        object = new JSONObject(string);
        JSONArray jSONArray = object.optJSONArray("data");
        JSONArray jSONArray2 = new JSONArray();
        int n2 = 0;
        while (true) {
            if (n2 >= jSONArray.length()) break;
            JSONObject jSONObject2 = jSONArray.getJSONObject(n2);
            string = new JSONObject();
            object = new StringBuilder();
            ((StringBuilder)object).append(jSONObject2.optString("cat"));
            ((StringBuilder)object).append("_");
            ((StringBuilder)object).append(jSONObject2.optString("ent_id"));
            string.put("vod_id", (Object)((StringBuilder)object).toString());
            string.put("vod_name", (Object)jSONObject2.optString("title"));
            string.put("vod_pic", (Object)jSONObject2.optString("cover"));
            string.put("vod_remarks", (Object)jSONObject2.optString("upinfo"));
            jSONArray2.put((Object)string);
            ++n2;
            continue;
            break;
        }
        try {
            jSONObject.put("list", (Object)jSONArray2);
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
        return jSONObject.toString();
    }

    public void init(Context context) {
        super.init(context);
        try {
            context = new JSONObject("{\"classes\":[{\"type_name\":\"\u7535\u5f71\",\"type_id\":\"1\"},{\"type_name\":\"\u7535\u89c6\u5267\",\"type_id\":\"2\"},{\"type_name\":\"\u7efc\u827a\",\"type_id\":\"3\"},{\"type_name\":\"\u52a8\u6f2b\",\"type_id\":\"4\"}],\"filter\":{\"1\":[{\"key\":\"cat\",\"name\":\"\u7c7b\u578b\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"\u559c\u5267\",\"v\":\"\u559c\u5267\"},{\"n\":\"\u7231\u60c5\",\"v\":\"\u7231\u60c5\"},{\"n\":\"\u52a8\u4f5c\",\"v\":\"\u52a8\u4f5c\"},{\"n\":\"\u6050\u6016\",\"v\":\"\u6050\u6016\"},{\"n\":\"\u79d1\u5e7b\",\"v\":\"\u79d1\u5e7b\"},{\"n\":\"\u5267\u60c5\",\"v\":\"\u5267\u60c5\"},{\"n\":\"\u72af\u7f6a\",\"v\":\"\u72af\u7f6a\"},{\"n\":\"\u5947\u5e7b\",\"v\":\"\u5947\u5e7b\"},{\"n\":\"\u6218\u4e89\",\"v\":\"\u6218\u4e89\"},{\"n\":\"\u60ac\u7591\",\"v\":\"\u60ac\u7591\"},{\"n\":\"\u52a8\u753b\",\"v\":\"\u52a8\u753b\"},{\"n\":\"\u6587\u827a\",\"v\":\"\u6587\u827a\"},{\"n\":\"\u7eaa\u5f55\",\"v\":\"\u7eaa\u5f55\"},{\"n\":\"\u4f20\u8bb0\",\"v\":\"\u4f20\u8bb0\"},{\"n\":\"\u6b4c\u821e\",\"v\":\"\u6b4c\u821e\"},{\"n\":\"\u53e4\u88c5\",\"v\":\"\u53e4\u88c5\"},{\"n\":\"\u5386\u53f2\",\"v\":\"\u5386\u53f2\"},{\"n\":\"\u60ca\u609a\",\"v\":\"\u60ca\u609a\"},{\"n\":\"\u4f26\u7406\",\"v\":\"\u4f26\u7406\"},{\"n\":\"\u5176\u4ed6\",\"v\":\"\u5176\u4ed6\"}]},{\"key\":\"year\",\"name\":\"\u5e74\u4ee3\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"\u66f4\u65e9\",\"v\":\"lt_year\"}]},{\"key\":\"area\",\"name\":\"\u5730\u533a\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"\u5185\u5730\",\"v\":\"\u5927\u9646\"},{\"n\":\"\u4e2d\u56fd\u9999\u6e2f\",\"v\":\"\u9999\u6e2f\"},{\"n\":\"\u4e2d\u56fd\u53f0\u6e7e\",\"v\":\"\u53f0\u6e7e\"},{\"n\":\"\u6cf0\u56fd\",\"v\":\"\u6cf0\u56fd\"},{\"n\":\"\u7f8e\u56fd\",\"v\":\"\u7f8e\u56fd\"},{\"n\":\"\u97e9\u56fd\",\"v\":\"\u97e9\u56fd\"},{\"n\":\"\u65e5\u672c\",\"v\":\"\u65e5\u672c\"},{\"n\":\"\u6cd5\u56fd\",\"v\":\"\u6cd5\u56fd\"},{\"n\":\"\u82f1\u56fd\",\"v\":\"\u82f1\u56fd\"},{\"n\":\"\u5fb7\u56fd\",\"v\":\"\u5fb7\u56fd\"},{\"n\":\"\u5370\u5ea6\",\"v\":\"\u5370\u5ea6\"},{\"n\":\"\u5176\u4ed6\",\"v\":\"\u5176\u4ed6\"}]},{\"key\":\"rank\",\"name\":\"\u6392\u5e8f\",\"value\":[{\"n\":\"\u6700\u8fd1\u70ed\u6620\",\"v\":\"rankhot\"},{\"n\":\"\u6700\u8fd1\u4e0a\u6620\",\"v\":\"ranklatest\"},{\"n\":\"\u6700\u53d7\u597d\u8bc4\",\"v\":\"rankpoint\"}]}],\"2\":[{\"key\":\"cat\",\"name\":\"\u7c7b\u578b\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"\u8a00\u60c5\",\"v\":\"\u8a00\u60c5\"},{\"n\":\"\u5267\u60c5\",\"v\":\"\u5267\u60c5\"},{\"n\":\"\u4f26\u7406\",\"v\":\"\u4f26\u7406\"},{\"n\":\"\u559c\u5267\",\"v\":\"\u559c\u5267\"},{\"n\":\"\u60ac\u7591\",\"v\":\"\u60ac\u7591\"},{\"n\":\"\u90fd\u5e02\",\"v\":\"\u90fd\u5e02\"},{\"n\":\"\u5076\u50cf\",\"v\":\"\u5076\u50cf\"},{\"n\":\"\u53e4\u88c5\",\"v\":\"\u53e4\u88c5\"},{\"n\":\"\u519b\u4e8b\",\"v\":\"\u519b\u4e8b\"},{\"n\":\"\u8b66\u532a\",\"v\":\"\u8b66\u532a\"},{\"n\":\"\u5386\u53f2\",\"v\":\"\u5386\u53f2\"},{\"n\":\"\u52b1\u5fd7\",\"v\":\"\u52b1\u5fd7\"},{\"n\":\"\u795e\u8bdd\",\"v\":\"\u795e\u8bdd\"},{\"n\":\"\u8c0d\u6218\",\"v\":\"\u8c0d\u6218\"},{\"n\":\"\u9752\u6625\",\"v\":\"\u9752\u6625\u5267\"},{\"n\":\"\u5bb6\u5ead\",\"v\":\"\u5bb6\u5ead\u5267\"},{\"n\":\"\u52a8\u4f5c\",\"v\":\"\u52a8\u4f5c\"},{\"n\":\"\u60c5\u666f\",\"v\":\"\u60c5\u666f\"},{\"n\":\"\u6b66\u4fa0\",\"v\":\"\u6b66\u4fa0\"},{\"n\":\"\u79d1\u5e7b\",\"v\":\"\u79d1\u5e7b\"},{\"n\":\"\u5176\u4ed6\",\"v\":\"\u5176\u4ed6\"},{\"n\":\"\u5168\u90e8\",\"v\":\"\"}]},{\"key\":\"year\",\"name\":\"\u5e74\u4ee3\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"\u66f4\u65e9\",\"v\":\"lt_year\"}]},{\"key\":\"area\",\"name\":\"\u5730\u533a\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"\u5185\u5730\",\"v\":\"\u5185\u5730\"},{\"n\":\"\u4e2d\u56fd\u9999\u6e2f\",\"v\":\"\u9999\u6e2f\"},{\"n\":\"\u4e2d\u56fd\u53f0\u6e7e\",\"v\":\"\u53f0\u6e7e\"},{\"n\":\"\u6cf0\u56fd\",\"v\":\"\u6cf0\u56fd\"},{\"n\":\"\u65e5\u672c\",\"v\":\"\u65e5\u672c\"},{\"n\":\"\u97e9\u56fd\",\"v\":\"\u97e9\u56fd\"},{\"n\":\"\u7f8e\u56fd\",\"v\":\"\u7f8e\u56fd\"},{\"n\":\"\u82f1\u56fd\",\"v\":\"\u82f1\u56fd\"},{\"n\":\"\u65b0\u52a0\u5761\",\"v\":\"\u65b0\u52a0\u5761\"}]},{\"key\":\"rank\",\"name\":\"\u6392\u5e8f\",\"value\":[{\"n\":\"\u6700\u8fd1\u70ed\u6620\",\"v\":\"rankhot\"},{\"n\":\"\u6700\u8fd1\u4e0a\u6620\",\"v\":\"ranklatest\"},{\"n\":\"\u6700\u53d7\u597d\u8bc4\",\"v\":\"rankpoint\"}]}],\"3\":[{\"key\":\"cat\",\"name\":\"\u7c7b\u578b\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"\u8131\u53e3\u79c0\",\"v\":\"\u8131\u53e3\u79c0\"},{\"n\":\"\u771f\u4eba\u79c0\",\"v\":\"\u771f\u4eba\u79c0\"},{\"n\":\"\u641e\u7b11\",\"v\":\"\u641e\u7b11\"},{\"n\":\"\u9009\u79c0\",\"v\":\"\u9009\u79c0\"},{\"n\":\"\u516b\u5366\",\"v\":\"\u516b\u5366\"},{\"n\":\"\u8bbf\u8c08\",\"v\":\"\u8bbf\u8c08\"},{\"n\":\"\u60c5\u611f\",\"v\":\"\u60c5\u611f\"},{\"n\":\"\u751f\u6d3b\",\"v\":\"\u751f\u6d3b\"},{\"n\":\"\u665a\u4f1a\",\"v\":\"\u665a\u4f1a\"},{\"n\":\"\u97f3\u4e50\",\"v\":\"\u97f3\u4e50\"},{\"n\":\"\u804c\u573a\",\"v\":\"\u804c\u573a\"},{\"n\":\"\u7f8e\u98df\",\"v\":\"\u7f8e\u98df\"},{\"n\":\"\u65f6\u5c1a\",\"v\":\"\u65f6\u5c1a\"},{\"n\":\"\u6e38\u620f\",\"v\":\"\u6e38\u620f\"},{\"n\":\"\u5c11\u513f\",\"v\":\"\u5c11\u513f\"},{\"n\":\"\u4f53\u80b2\",\"v\":\"\u4f53\u80b2\"},{\"n\":\"\u7eaa\u5b9e\",\"v\":\"\u7eaa\u5b9e\"},{\"n\":\"\u79d1\u6559\",\"v\":\"\u79d1\u6559\"},{\"n\":\"\u66f2\u827a\",\"v\":\"\u66f2\u827a\"},{\"n\":\"\u6b4c\u821e\",\"v\":\"\u6b4c\u821e\"},{\"n\":\"\u8d22\u7ecf\",\"v\":\"\u8d22\u7ecf\"},{\"n\":\"\u6c7d\u8f66\",\"v\":\"\u6c7d\u8f66\"},{\"n\":\"\u64ad\u62a5\",\"v\":\"\u64ad\u62a5\"},{\"n\":\"\u5176\u4ed6\",\"v\":\"\u5176\u4ed6\"}]},{\"key\":\"area\",\"name\":\"\u5730\u533a\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"\u5185\u5730\",\"v\":\"\u5927\u9646\"},{\"n\":\"\u4e2d\u56fd\u9999\u6e2f\",\"v\":\"\u9999\u6e2f\"},{\"n\":\"\u4e2d\u56fd\u53f0\u6e7e\",\"v\":\"\u53f0\u6e7e\"},{\"n\":\"\u65e5\u672c\",\"v\":\"\u65e5\u672c\"},{\"n\":\"\u6b27\u7f8e\",\"v\":\"\u6b27\u7f8e\"}]},{\"key\":\"rank\",\"name\":\"\u6392\u5e8f\",\"value\":[{\"n\":\"\u6700\u8fd1\u70ed\u6620\",\"v\":\"rankhot\"},{\"n\":\"\u6700\u8fd1\u4e0a\u6620\",\"v\":\"ranklatest\"}]}],\"4\":[{\"key\":\"cat\",\"name\":\"\u7c7b\u578b\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"\u70ed\u8840\",\"v\":\"\u70ed\u8840\"},{\"n\":\"\u79d1\u5e7b\",\"v\":\"\u79d1\u5e7b\"},{\"n\":\"\u7f8e\u5c11\u5973\",\"v\":\"\u7f8e\u5c11\u5973\"},{\"n\":\"\u9b54\u5e7b\",\"v\":\"\u9b54\u5e7b\"},{\"n\":\"\u7ecf\u5178\",\"v\":\"\u7ecf\u5178\"},{\"n\":\"\u52b1\u5fd7\",\"v\":\"\u52b1\u5fd7\"},{\"n\":\"\u5c11\u513f\",\"v\":\"\u5c11\u513f\"},{\"n\":\"\u5192\u9669\",\"v\":\"\u5192\u9669\"},{\"n\":\"\u641e\u7b11\",\"v\":\"\u641e\u7b11\"},{\"n\":\"\u63a8\u7406\",\"v\":\"\u63a8\u7406\"},{\"n\":\"\u604b\u7231\",\"v\":\"\u604b\u7231\"},{\"n\":\"\u6cbb\u6108\",\"v\":\"\u6cbb\u6108\"},{\"n\":\"\u5e7b\u60f3\",\"v\":\"\u5e7b\u60f3\"},{\"n\":\"\u6821\u56ed\",\"v\":\"\u6821\u56ed\"},{\"n\":\"\u52a8\u7269\",\"v\":\"\u52a8\u7269\"},{\"n\":\"\u673a\u6218\",\"v\":\"\u673a\u6218\"},{\"n\":\"\u4eb2\u5b50\",\"v\":\"\u4eb2\u5b50\"},{\"n\":\"\u513f\u6b4c\",\"v\":\"\u513f\u6b4c\"},{\"n\":\"\u8fd0\u52a8\",\"v\":\"\u8fd0\u52a8\"},{\"n\":\"\u60ac\u7591\",\"v\":\"\u60ac\u7591\"},{\"n\":\"\u602a\u7269\",\"v\":\"\u602a\u7269\"},{\"n\":\"\u6218\u4e89\",\"v\":\"\u6218\u4e89\"},{\"n\":\"\u76ca\u667a\",\"v\":\"\u76ca\u667a\"},{\"n\":\"\u9752\u6625\",\"v\":\"\u9752\u6625\"},{\"n\":\"\u7ae5\u8bdd\",\"v\":\"\u7ae5\u8bdd\"},{\"n\":\"\u7ade\u6280\",\"v\":\"\u7ade\u6280\"},{\"n\":\"\u52a8\u4f5c\",\"v\":\"\u52a8\u4f5c\"},{\"n\":\"\u793e\u4f1a\",\"v\":\"\u793e\u4f1a\"},{\"n\":\"\u53cb\u60c5\",\"v\":\"\u53cb\u60c5\"},{\"n\":\"\u771f\u4eba\u7248\",\"v\":\"\u771f\u4eba\u7248\"},{\"n\":\"\u7535\u5f71\u7248\",\"v\":\"\u7535\u5f71\u7248\"},{\"n\":\"OVA\u7248\",\"v\":\"OVA\u7248\"},{\"n\":\"TV\u7248\",\"v\":\"TV\u7248\"},{\"n\":\"\u65b0\u756a\u52a8\u753b\",\"v\":\"\u65b0\u756a\u52a8\u753b\"},{\"n\":\"\u5b8c\u7ed3\u52a8\u753b\",\"v\":\"\u5b8c\u7ed3\u52a8\u753b\"}]},{\"key\":\"year\",\"name\":\"\u5e74\u4ee3\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"\u66f4\u65e9\",\"v\":\"\u66f4\u65e9\"}]},{\"key\":\"area\",\"name\":\"\u5730\u533a\",\"value\":[{\"n\":\"\u5168\u90e8\",\"v\":\"\"},{\"n\":\"\u5185\u5730\",\"v\":\"\u5927\u9646\"},{\"n\":\"\u65e5\u672c\",\"v\":\"\u65e5\u672c\"},{\"n\":\"\u7f8e\u56fd\",\"v\":\"\u7f8e\u56fd\"}]},{\"key\":\"rank\",\"name\":\"\u6392\u5e8f\",\"value\":[{\"n\":\"\u6700\u8fd1\u70ed\u6620\",\"v\":\"rankhot\"},{\"n\":\"\u6700\u8fd1\u4e0a\u6620\",\"v\":\"ranklatest\"}]}]}}");
            this.a = context;
        }
        catch (JSONException jSONException) {
            SpiderDebug.log((Throwable)jSONException);
        }
    }

    public String playerContent(String string, String string2, List<String> list) {
        string = new JSONObject();
        try {
            string.put("parse", 1);
            string.put("url", (Object)string2);
            string.put("jx", (Object)"1");
            string.put("playUrl", (Object)"");
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
        return string.toString();
    }

    public String searchContent(String string, boolean bl) {
        JSONObject jSONObject;
        block6: {
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(e.d(String.format("https://api.so.360kan.com/index?force_v=1&kw=%s&from=&pageno=1&v_ap=1&tab=all", string), this.a()));
            string = jSONObject2.optJSONObject("data");
            if (string == null) break block6;
            string = string.optJSONObject("longData");
            if (string == null) break block6;
            try {
                JSONArray jSONArray = string.getJSONArray("rows");
                string = new JSONArray();
                jSONObject.put("list", (Object)string);
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    jSONObject2 = jSONArray.getJSONObject(i2);
                    JSONObject jSONObject3 = new JSONObject();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(jSONObject2.optString("cat_id"));
                    stringBuilder.append("_");
                    stringBuilder.append(jSONObject2.optString("en_id"));
                    jSONObject3.put("vod_id", (Object)stringBuilder.toString());
                    jSONObject3.put("vod_name", (Object)jSONObject2.optString("titleTxt"));
                    jSONObject3.put("vod_pic", (Object)jSONObject2.optString("cover"));
                    jSONObject3.put("vod_remarks", (Object)jSONObject2.optString("score"));
                    string.put((Object)jSONObject3);
                }
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
            }
        }
        return jSONObject.toString();
    }
}

