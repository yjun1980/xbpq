/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.W;
import com.github.catvod.spider.merge.I.Z;
import com.github.catvod.spider.merge.I.c1;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.K.i;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a0 {
    static volatile c1 a = new c1();

    static Integer a(a0 object, String string) {
        Objects.requireNonNull(object);
        try {
            object = Integer.parseInt(m.z(m.x(string)).replaceAll("\\D+", ""));
        }
        catch (Exception exception) {
            object = null;
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    public static String b(String var0, List var1_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[UNCONDITIONALDOLOOP]], but top level block is 15[TRYBLOCK]
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

    public static a0 c() {
        return Z.a;
    }

    private Map d() {
        HashMap hashMap = c.b("Content-Type", "application/json", "User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
        hashMap.put("Referer", "https://www.guangyapan.com/");
        hashMap.put("Origin", "https://www.guangyapan.com");
        hashMap.put("dt", "4");
        if (e.d(W.a.e.b())) {
            hashMap.put("Authorization", W.a.e.b());
        }
        return hashMap;
    }

    private boolean f(JSONObject object) {
        String string = object.optString("mineType", "");
        object = object.optString("ext", "").toLowerCase();
        if (string.startsWith("video/")) {
            return true;
        }
        for (int i2 = 0; i2 < 15; ++i2) {
            if (!((String)object).equals((new String[]{".mp4", ".mkv", ".avi", ".wmv", ".flv", ".mov", ".rmvb", ".rm", ".3gp", ".ts", ".m4v", ".webm", ".mpg", ".mpeg", ".m2ts"})[i2])) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void g(String charSequence, List list, String string) {
        try {
            JSONArray jSONArray;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parentId", (Object)charSequence);
            jSONObject.put("pageSize", 200);
            jSONObject.put("orderBy", 0);
            jSONObject.put("sortType", 0);
            String string2 = this.i("https://api.guangyapan.com/nd.bizuserres.s/v1/file/get_file_list", jSONObject, true);
            if (!e.d(string2) || !"success".equals((charSequence = new JSONObject(string2)).optString("msg")) || (jSONArray = charSequence.getJSONObject("data").optJSONArray("list")) == null) return;
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.optInt("resType") == 2) {
                    String string3 = jSONObject2.getString("fileName");
                    String string4 = jSONObject2.getString("fileId");
                    charSequence = string3;
                    if (e.d(string)) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string);
                        ((StringBuilder)charSequence).append("/");
                        ((StringBuilder)charSequence).append(string3);
                        charSequence = ((StringBuilder)charSequence).toString();
                    }
                    this.g(string4, list, (String)charSequence);
                    continue;
                }
                if (jSONObject2.optInt("resType") != 1 || !this.f(jSONObject2)) continue;
                charSequence = string != null ? string : "";
                jSONObject2.put("_parentName", (Object)charSequence);
                list.add(jSONObject2);
            }
            return;
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8\u81ea\u6709\u76d8 listAllVideoFiles \u5f02\u5e38: "));
        }
    }

    /*
     * Unable to fully structure code
     */
    private String i(String var1_1, JSONObject var2_3, boolean var3_4) {
        block9: {
            var6_5 = d.i(var1_1, var2_3.toString(), this.d());
            if (!var3_4) ** GOTO lbl27
            {
                catch (Exception var1_2) {
                    r.f(var1_2, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8\u81ea\u6709\u76d8 POST \u5f02\u5e38: "));
                    return "";
                }
            }
            var5_6 = var6_5.b();
            var4_7 = true;
            if (var5_6 == 401) ** GOTO lbl23
            var3_4 = e.d(var6_5.a());
            if (!var3_4) break block9;
            try {
                var7_8 = new JSONObject(var6_5.a());
                var5_6 = var7_8.optInt("code", 200);
                if (var5_6 == 401) ** GOTO lbl23
            }
            catch (Exception var7_9) {
                ** continue;
            }
        }
lbl21:
        // 2 sources

        while (true) {
            var4_7 = false;
lbl23:
            // 3 sources

            if (!var4_7) ** GOTO lbl27
            if (W.a.C()) {
                return this.i(var1_1, var2_3, false);
            }
lbl27:
            // 4 sources

            var7_8 = new StringBuilder();
            var7_8.append("\u5149\u9e2d\u4e91\u76d8\u81ea\u6709\u76d8 POST ");
            var7_8.append(var1_1);
            var7_8.append(" body:");
            var7_8.append(var2_3);
            var7_8.append(" result:");
            var7_8.append(var6_5);
            SpiderDebug.log((String)var7_8.toString());
            var1_1 = var6_5.a();
            return var1_1;
            break;
        }
    }

    public List e(i object) {
        ArrayList<Object> arrayList;
        block10: {
            JSONArray jSONArray;
            String string;
            String string2;
            block9: {
                string2 = ((i)object).c();
                string = ((i)object).e();
                object = e.b(((i)object).b()) ? "" : ((i)object).b();
                arrayList = new ArrayList<Object>();
                if (!e.b(W.a.e.b())) break block9;
                m.y("\u8bf7\u5148\u767b\u5f55\u5149\u9e2d\u4e91\u76d8");
                return arrayList;
            }
            Object object2 = new JSONObject();
            object2.put("parentId", object);
            object2.put("pageSize", 200);
            int n2 = 0;
            try {
                object2.put("orderBy", 0);
                object2.put("sortType", 0);
                object = this.i("https://api.guangyapan.com/nd.bizuserres.s/v1/file/get_file_list", (JSONObject)object2, true);
                if (!e.d((CharSequence)object) || !"success".equals((object2 = new JSONObject((String)object)).optString("msg")) || (jSONArray = object2.getJSONObject("data").optJSONArray("list")) == null) break block10;
            }
            catch (Exception exception) {
                r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8\u81ea\u6709\u76d8 getVodFolder \u5f02\u5e38: "));
            }
            while (true) {
                block13: {
                    block12: {
                        String string3;
                        Object object3;
                        block11: {
                            if (n2 >= jSONArray.length()) break block10;
                            object3 = jSONArray.getJSONObject(n2);
                            object2 = new h();
                            string3 = object3.getString("fileName");
                            object = object3.getString("fileId");
                            int n3 = object3.optInt("resType");
                            if (n3 != 2) break block11;
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append(string2);
                            ((StringBuilder)object3).append("*#");
                            ((StringBuilder)object3).append((String)object);
                            ((StringBuilder)object3).append("*#");
                            ((StringBuilder)object3).append(string3);
                            ((h)object2).l(((StringBuilder)object3).toString());
                            ((h)object2).m(string3);
                            object = "folder";
                            break block12;
                        }
                        if (!this.f((JSONObject)object3) && !BaseApi.get().d.booleanValue() && !e.d(m.n(string3))) break block13;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string);
                        stringBuilder.append("_");
                        stringBuilder.append(object3.optString("parentId", object3.getString("fileId")));
                        stringBuilder.append("*#");
                        stringBuilder.append((String)object);
                        stringBuilder.append("*#");
                        stringBuilder.append(string3);
                        ((h)object2).l(stringBuilder.toString());
                        ((h)object2).m(string3);
                        object = "file";
                    }
                    ((h)object2).r((String)object);
                    arrayList.add(object2);
                }
                ++n2;
            }
        }
        return arrayList;
    }

    public String h(String string) {
        block9: {
            Object object;
            Object object2;
            if (BaseApi.isOk("guangya")) {
                return "";
            }
            try {
                object2 = Base64.decode((String)string, (int)10);
                object = new String((byte[])object2, StandardCharsets.UTF_8);
                string = new JSONObject((String)object);
                string = string.optString("fileId");
            }
            catch (Exception exception) {
                r.f(exception, com.github.catvod.spider.merge.C.a.c("\u89e3\u6790\u64ad\u653e\u53c2\u6570\u5f02\u5e38: "));
                string = "";
            }
            if (e.d(string)) {
                object = new JSONObject();
                object.put("fileId", (Object)string);
                object = this.i("https://api.guangyapan.com/nd.bizuserres.s/v1/get_res_download_url", (JSONObject)object, true);
                if (!e.d((CharSequence)object) || !"success".equals((string = new JSONObject((String)object)).optString("msg"))) break block9;
                object2 = string.getJSONObject("data");
                object = object2.optString("signedURL", "");
                string = object;
                try {
                    if (e.b((CharSequence)object)) {
                        string = object2.optString("downloadUrl", "");
                    }
                    if (e.d(string)) {
                        object = new f();
                        ((f)object).w(string);
                        ((f)object).g(this.d());
                        string = ((f)object).toString();
                        return string;
                    }
                }
                catch (Exception exception) {
                    r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8\u81ea\u6709\u76d8 playerContent \u5f02\u5e38: "));
                }
            }
        }
        return "";
    }

    public JSONArray j(String string) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accessToken", (Object)W.a.e.b());
            jSONObject.put("name", (Object)string);
            jSONObject.put("page", 0);
            jSONObject.put("pageSize", 100);
            string = this.i("https://api.guangyapan.com/nd.bizuserres.s/v1/file/search_files", jSONObject, true);
            if (e.d(string) && "success".equals((jSONObject = new JSONObject(string)).optString("msg"))) {
                string = jSONObject.optJSONObject("data").optJSONArray("list");
                return string;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 searchFiles \u5f02\u5e38: "));
        }
        return new JSONArray();
    }
}

