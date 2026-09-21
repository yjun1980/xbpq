/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderApi
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.XBPQ$3;
import com.github.catvod.spider.XBPQ$5;
import com.github.catvod.spider.XBPQ$6;
import com.github.catvod.spider.XBPQ$7;
import com.github.catvod.spider.XBPQPA;
import com.github.catvod.spider.XBPQa;
import com.github.catvod.spider.XBPQc;
import com.github.catvod.spider.merge.Dw.f;
import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.v;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.ka.d;
import com.github.catvod.spider.merge.lq.b;
import com.github.catvod.spider.merge.mk.c;
import com.github.catvod.spider.merge.mk.g;
import com.github.catvod.spider.merge.nz.k;
import com.github.catvod.spider.merge.nz.m;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class XBPQ
extends Spider {
    public static String K = "";
    private static HashMap<String, String> L;
    private String A = "";
    protected JSONObject B = null;
    private Context C;
    private XBPQPA D;
    private boolean E = true;
    private HashMap<String, String> F = null;
    private String G;
    private int H = 0;
    private SpiderApi I = null;
    private String J = "9978";
    private boolean a = false;
    private String b;
    private String c = "";
    private boolean d = false;
    private int e;
    private String f = "";
    private String g = null;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private List<String> k = null;
    private JSONObject l = null;
    private boolean m = false;
    private String n = "";
    private String o;
    private int p = 0;
    private boolean q = false;
    private String r = "";
    private String s = "";
    private boolean t = false;
    private int u = 0;
    private int v = 3;
    private String w = "";
    private String x = "";
    private boolean y = false;
    private String z = "";

    /*
     * Exception decompiling
     */
    private JSONObject A(String var1_1, String var2_3, boolean var3_4, HashMap<String, String> var4_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 73[TRYBLOCK] [110 : 4741->4750)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject B(String var1_1, boolean var2_2) {
        try {
            block26: {
                block25: {
                    var6_3 = var1_1.split("#");
                    var3_4 = var1_1.length();
                    if (var3_4 >= 1) break block25;
                    if (var2_2) {
                        if ("\u641c\u7d22".equals(this.r)) {
                            var1_1 = new StringBuilder();
                            var1_1.append(this.f);
                            var1_1.append("/index.php/ajax/verify_check?type=search&verify=");
                        } else {
                            var1_1 = new StringBuilder();
                            var1_1.append(this.f);
                            var1_1.append("/index.php/ajax/verify_check?type=show&verify=");
                        }
                        var1_1 = var1_1.toString();
                        var4_5 /* !! */  = new StringBuilder();
                        var4_5 /* !! */ .append(this.f);
                        var4_5 /* !! */ .append("/index.php/verify/index.html?");
                    } else {
                        var1_1 = new StringBuilder();
                        var1_1.append(this.f);
                        var1_1.append("/extend/vercode/check.php?tn_r=");
                        var1_1 = var1_1.toString();
                        var4_5 /* !! */  = new StringBuilder();
                        var4_5 /* !! */ .append(this.f);
                        var4_5 /* !! */ .append("/extend/vercode/tncode.php?");
                    }
                    var4_5 /* !! */  = var4_5 /* !! */ .toString();
                    ** GOTO lbl189
                }
                if (!var2_2) ** GOTO lbl-1000
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append("/index.php/verify/index.html?");
                var5_7 = var1_1.toString();
                if (!"\u641c\u7d22".equals(this.r)) ** GOTO lbl-1000
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append("/index.php/ajax/verify_check?type=search&verify=");
                var1_1 = var1_1.toString();
                if (!"\u7a7a".equals(var6_3[2])) break block26;
                var4_5 /* !! */  = var5_7;
                ** GOTO lbl168
            }
            if (var6_3[2].startsWith("http")) {
            }
            ** GOTO lbl-1000
        }
        catch (Exception var4_6) {
            var1_1 = this.I;
            if (var1_1 != null) {
                com.github.catvod.spider.merge.Dw.f.a(var4_6, com.github.catvod.spider.merge.ka.d.b("getOcrUrl()\u9519\u8bef-->"), (SpiderApi)var1_1);
            }
            return null;
        }
        var1_1 = var6_3[2];
        var4_5 /* !! */  = var5_7;
        ** GOTO lbl168
lbl-1000:
        // 1 sources

        {
            if (!var6_3[2].startsWith("/")) ** GOTO lbl77
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
        }
        var4_5 /* !! */  = var6_3[2];
lbl-1000:
        // 8 sources

        {
            while (true) {
                var1_1.append((String)var4_5 /* !! */ );
                ** GOTO lbl-1000
                break;
            }
lbl77:
            // 1 sources

            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append("/");
        }
        var4_5 /* !! */  = var6_3[2];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            block27: {
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append("/index.php/ajax/verify_check?type=show&verify=");
                var1_1 = var1_1.toString();
                if (!"\u7a7a".equals(var6_3[1])) break block27;
                var4_5 /* !! */  = var5_7;
                ** GOTO lbl168
            }
            if (!var6_3[1].startsWith("http")) ** GOTO lbl-1000
        }
        var1_1 = var6_3[1];
        var4_5 /* !! */  = var5_7;
        ** GOTO lbl168
lbl-1000:
        // 1 sources

        {
            if (!var6_3[1].startsWith("/")) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
        }
        var4_5 /* !! */  = var6_3[1];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append("/");
        }
        var4_5 /* !! */  = var6_3[1];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            block28: {
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append("/extend/vercode/tncode.php?");
                var5_7 = var1_1.toString();
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append("/extend/vercode/check.php?tn_r=");
                var1_1 = var1_1.toString();
                if (!"\u641c\u7d22".equals(this.r)) ** GOTO lbl-1000
                if (!"\u7a7a".equals(var6_3[2])) break block28;
                var4_5 /* !! */  = var5_7;
                ** GOTO lbl168
            }
            if (!var6_3[2].startsWith("http")) ** GOTO lbl-1000
        }
        var1_1 = var6_3[2];
        var4_5 /* !! */  = var5_7;
        ** GOTO lbl168
lbl-1000:
        // 1 sources

        {
            if (!var6_3[2].startsWith("/")) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
        }
        var4_5 /* !! */  = var6_3[2];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append("/");
        }
        var4_5 /* !! */  = var6_3[2];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            block29: {
                if (!"\u7a7a".equals(var6_3[1])) break block29;
                var4_5 /* !! */  = var5_7;
                ** GOTO lbl168
            }
            if (!var6_3[1].startsWith("http")) ** GOTO lbl-1000
        }
        var1_1 = var6_3[1];
        var4_5 /* !! */  = var5_7;
        ** GOTO lbl168
lbl-1000:
        // 1 sources

        {
            if (!var6_3[1].startsWith("/")) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
        }
        var4_5 /* !! */  = var6_3[1];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append("/");
        }
        var4_5 /* !! */  = var6_3[1];
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var1_1 = var1_1.toString();
            var4_5 /* !! */  = var5_7;
lbl168:
            // 9 sources

            if ("\u7a7a".equals(var6_3[0])) ** GOTO lbl189
            if (!var6_3[0].startsWith("http")) ** GOTO lbl-1000
        }
        var4_5 /* !! */  = var6_3[0];
        ** GOTO lbl189
lbl-1000:
        // 1 sources

        {
            if (!var6_3[0].startsWith("/")) ** GOTO lbl181
            var5_7 = new StringBuilder();
            var5_7.append(this.f);
        }
        var4_5 /* !! */  = var6_3[0];
lbl-1000:
        // 2 sources

        {
            while (true) {
                var5_7.append((String)var4_5 /* !! */ );
                ** GOTO lbl-1000
                break;
            }
lbl181:
            // 1 sources

            var5_7 = new StringBuilder();
            var5_7.append(this.f);
            var5_7.append("/");
        }
        var4_5 /* !! */  = var6_3[0];
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var4_5 /* !! */  = var5_7.toString();
lbl189:
            // 4 sources

            var5_7 = new JSONObject();
            var5_7.put("str", (Object)var4_5 /* !! */ );
            var5_7.put("codeUrl", (Object)var1_1);
            return var5_7;
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject D(String string, String charSequence, String object, String object2) {
        try {
            Object object3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            boolean bl = string.equals("by");
            Object object4 = object;
            Object object52 = object3;
            if (!bl) {
                object4 = object;
                object52 = object3;
                if (!string.equals("cateId")) {
                    object3.put("n", (Object)"\u5168\u90e8");
                    object3.put("v", (Object)"");
                    jSONArray.put(object3);
                    object3 = new JSONObject();
                    object4 = object;
                    object52 = object3;
                    if (((String)object).indexOf("--") >= 0) {
                        object4 = ((String)object).split("--")[1];
                        object52 = object3;
                    }
                }
            }
            bl = string.equals("cateId");
            int n2 = 0;
            object3 = object4;
            JSONObject jSONObject = object52;
            if (bl) {
                object52.put("n", (Object)"\u5168\u90e8");
                object52.put("v", (Object)((String)object4).split("--")[0]);
                jSONArray.put(object52);
                object52 = new JSONObject();
                object3 = object4;
                Object object6 = object52;
                if (((String)object4).indexOf("--") >= 0) {
                    object3 = ((String)object4).split("--")[1];
                    Object object7 = object52;
                }
            }
            if (((String)object3).indexOf("#") >= 0) {
                n2 = ((String)object3).indexOf("#");
                if (n2 >= 0) {
                    for (Object object52 : ((String)object3).split("#")) {
                        void var3_9;
                        var3_9.put("n", (Object)((String)object52).split("\\$")[0]);
                        var3_9.put("v", (Object)((String)object52).split("\\$")[1]);
                        jSONArray.put((Object)var3_9);
                        JSONObject jSONObject2 = new JSONObject();
                    }
                } else {
                    void var3_8;
                    var3_8.put("n", (Object)((String)object3).split("\\$")[0]);
                    var3_8.put("v", (Object)((String)object3).split("\\$")[1]);
                    jSONArray.put((Object)var3_8);
                }
            } else if (((String)object3).indexOf("&") >= 0) {
                Object object8;
                object4 = ((String)object3).split("\\&");
                object8 = !"".equals(object8) && !"*".equals(object8) ? object8.split("\\&") : object4;
                while (n2 < ((String[])object4).length) {
                    void var3_11;
                    object52 = !"\u60c5\u8272".equals(object4[n2]) ? object4[n2] : "\u798f\u5229";
                    var3_11.put("n", object52);
                    var3_11.put("v", (Object)object8[n2]);
                    jSONArray.put((Object)var3_11);
                    JSONObject jSONObject3 = new JSONObject();
                    ++n2;
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("key", (Object)string);
            jSONObject4.put("name", (Object)charSequence);
            jSONObject4.put("value", (Object)jSONArray);
            return jSONObject4;
        }
        catch (Exception exception) {
            if (this.m) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.G);
                ((StringBuilder)charSequence).append("\u8c03\u8bd5->getRType\u51fa\u9519\uff1a");
                ((StringBuilder)charSequence).append(((Object)exception).toString());
                Init.show(((StringBuilder)charSequence).toString());
            }
            if ((charSequence = this.I) != null) {
                com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("getRType()\u9519\u8bef-->"), (SpiderApi)charSequence);
            }
            return null;
        }
    }

    private String E(String string) {
        return this.F(string, "");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private String F(String object, String stringArray) {
        void var1_11;
        Object object2;
        block23: {
            void var1_5;
            int n2;
            String[] stringArray2;
            String string;
            block24: {
                block22: {
                    block18: {
                        String string2;
                        Object object3;
                        block20: {
                            block21: {
                                block19: {
                                    block15: {
                                        block16: {
                                            block17: {
                                                object2 = this.B.optString((String)object);
                                                boolean bl = ((String)object).equals("\u4e3b\u9875url");
                                                string = "";
                                                object3 = object2;
                                                if (!bl) break block15;
                                                object3 = object2;
                                                if (!((String)object2).isEmpty()) break block15;
                                                object3 = object2 = this.B.optString("\u9996\u9875\u63a8\u8350\u94fe\u63a5");
                                                if (!((String)object2).isEmpty()) break block15;
                                                object3 = object2 = this.B.optString("\u7f51\u7ad9\u5730\u5740");
                                                if (!((String)object2).isEmpty()) break block15;
                                                object3 = object2 = this.B.optString("url");
                                                if (!((String)object2).isEmpty()) break block15;
                                                object3 = object2 = this.B.optString("homeUrl");
                                                if (!((String)object2).isEmpty()) break block15;
                                                object3 = object2 = this.B.optString("\u5206\u7c7burl");
                                                if (!((String)object2).isEmpty()) break block16;
                                                object2 = this.B.optString("\u5206\u7c7b\u94fe\u63a5");
                                                if (((String)object2).isEmpty()) break block17;
                                                object3 = object2;
                                                if (((String)object2).startsWith("http")) break block16;
                                            }
                                            object3 = object2 = this.B.optString("\u5206\u7c7b\u9875");
                                            if (((String)object2).isEmpty()) {
                                                object3 = object2 = this.B.optString("class_url");
                                                if (((String)object2).isEmpty()) {
                                                    object3 = object2 = this.B.optString("cateUrl");
                                                    if (((String)object2).isEmpty()) {
                                                        object2 = object3 = this.B.optString("\u641c\u7d22url");
                                                        if (!((String)object3).startsWith("http")) {
                                                            object2 = "";
                                                        }
                                                        object3 = object2;
                                                        if (((String)object2).isEmpty()) {
                                                            object3 = object2 = this.B.optString("\u641c\u7d22\u94fe\u63a5");
                                                            if (!((String)object2).startsWith("http")) {
                                                                object3 = "";
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        object2 = ((String)object3).indexOf("/webparse/") > 0 ? ".*/webparse/(https?\\://[^/]+)/.*" : ".*(https?\\://[^/]+)/.*";
                                        object3 = ((String)object3).replaceAll((String)object2, "$1");
                                    }
                                    object2 = object3;
                                    if (!((String)object).equals("\u5206\u7c7b")) break block18;
                                    if (((String)object3).isEmpty()) break block19;
                                    object2 = object3;
                                    if (((String)object3).indexOf("&") < 0) break block18;
                                    object2 = this.B;
                                    string2 = "\u5206\u7c7b\u503c";
                                    break block20;
                                }
                                object3 = this.B.optString("\u5206\u7c7b\u540d\u79f0");
                                if (((String)object3).isEmpty()) break block21;
                                object2 = this.B;
                                string2 = "\u5206\u7c7b\u540d\u79f0\u66ff\u6362\u8bcd";
                                break block20;
                            }
                            object2 = object3 = this.B.optString("class_name");
                            if (((String)object3).isEmpty()) break block18;
                            object2 = this.B;
                            string2 = "class_value";
                        }
                        object2 = this.T((String)object3, object2.optString(string2));
                    }
                    if (((String)object2).isEmpty() || ((String)object2).equals("\u7a7a")) break block22;
                    stringArray2 = object2;
                    if (((String)object).equals("\u5267\u60c5")) return stringArray2;
                    stringArray2 = object2;
                    if (((String)object).equals("\u5730\u533a")) return stringArray2;
                    stringArray2 = object2;
                    if (((String)object).equals("\u7c7b\u578b")) return stringArray2;
                    stringArray2 = object2;
                    if (((String)object).equals("\u5e74\u4efd")) return stringArray2;
                    stringArray2 = object2;
                    if (((String)object).equals("\u6392\u5e8f")) return stringArray2;
                    if (((String)object2).indexOf("||") < 0 || ((String)object2).indexOf("--") < 0) break block23;
                    stringArray2 = ((String)object2).split("\\|\\|");
                    n2 = stringArray2.length;
                    break block24;
                }
                if (!((String)object).equals("\u641c\u7d22\u540e\u7f00")) return stringArray2;
                if (!((String)object2).equals("\u7a7a")) return stringArray2;
                return "";
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                String string3 = stringArray2[i2];
                if (string3.indexOf(this.r) < 0) continue;
                String string4 = string3.split("--")[1];
                return var1_5;
            }
            String string5 = string;
            if (((String)object2).indexOf("||") < 0) return var1_11;
            String[] stringArray3 = stringArray2[0].split("--");
            if (stringArray3.length > 1) {
                String string6 = stringArray3[1];
                return var1_5;
            } else {
                String string7 = stringArray3[0];
            }
            return var1_5;
        }
        String[] stringArray4 = object2;
        return var1_11;
    }

    private String G(String string, String string2, String string3) {
        return this.F(string, this.F(string2, string3));
    }

    private String H(String string, String string2, String string3, String string4) {
        return this.F(string, this.F(string2, this.F(string3, string4)));
    }

    private String I(String string, String string2, String string3, String string4, String string5) {
        return this.F(string, this.F(string2, this.F(string3, this.F(string4, string5))));
    }

    private String J(String string, String string2, String string3, String string4, String string5, String string6) {
        return this.F(string, this.F(string2, this.F(string3, this.F(string4, this.F(string5, string6)))));
    }

    private String K(String string, String string2, String string3, String string4, String string5, String string6) {
        return this.F(string, this.F(string2, this.F(string3, this.F(string4, this.F(string5, this.F(string6, ""))))));
    }

    private String N(String charSequence) {
        Comparable<Charset> comparable;
        CharSequence charSequence2 = charSequence = ((String)charSequence).replace("://", "\u53cc\u659c\u6760").replace("//", "/").replace("\u53cc\u659c\u6760", "://").trim();
        if (((String)charSequence).indexOf("\u65f6\u95f4\u6233") >= 0) {
            charSequence2 = com.github.catvod.spider.merge.ka.d.b("");
            ((StringBuilder)charSequence2).append(new Date().getTime());
            charSequence2 = ((String)charSequence).replace("\u65f6\u95f4\u6233", ((StringBuilder)charSequence2).toString());
        }
        charSequence = charSequence2;
        if (((String)charSequence2).indexOf(":9978/") > 0) {
            charSequence = charSequence2;
            if (!"9978".equals(this.J)) {
                charSequence = ((String)charSequence2).replace("9978", this.J);
            }
        }
        charSequence2 = charSequence;
        if (((String)charSequence).indexOf("md5(") > 0) {
            charSequence2 = ((String)charSequence).replaceAll("md5\\((.*?)\\)", "$1");
            if (((String)charSequence2).indexOf(",iso") > 0) {
                charSequence2 = ((String)charSequence2).split(",")[0];
                comparable = com.github.catvod.spider.merge.nz.m.c;
            } else {
                comparable = com.github.catvod.spider.merge.nz.m.b;
            }
            charSequence2 = ((String)charSequence).replaceAll("md5\\(.*?\\)", com.github.catvod.spider.merge.nz.m.a((String)charSequence2, (Charset)comparable));
        }
        charSequence = charSequence2;
        if (((String)charSequence2).indexOf("+url:") > 0) {
            charSequence = ((String)charSequence2).split("\\+url\\:");
            if (((CharSequence)charSequence).length > 1) {
                if (((String)charSequence2).indexOf("$sub:") > 0) {
                    charSequence2 = ((String)charSequence[1]).split("\\$sub\\:");
                    if (((CharSequence)charSequence2).length > 1) {
                        comparable = new StringBuilder();
                        ((StringBuilder)comparable).append((String)charSequence[0]);
                        ((StringBuilder)comparable).append(this.e0(this.k((String)charSequence2[0]), (String)charSequence2[1], "").get(0).trim());
                        charSequence = ((StringBuilder)comparable).toString();
                    } else {
                        comparable = new StringBuilder();
                        ((StringBuilder)comparable).append((String)charSequence[0]);
                        ((StringBuilder)comparable).append(this.k((String)charSequence2[0]));
                        charSequence = ((StringBuilder)comparable).toString();
                    }
                } else {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append((String)charSequence[0]);
                    ((StringBuilder)charSequence2).append(this.k((String)charSequence[1]));
                    charSequence = ((StringBuilder)charSequence2).toString();
                }
            } else {
                charSequence = charSequence[0];
            }
        }
        return charSequence;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void O() {
        boolean bl;
        Object object;
        block20: {
            try {
                block21: {
                    Object object2;
                    block23: {
                        block26: {
                            block25: {
                                String string;
                                block24: {
                                    int n2;
                                    block22: {
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append(this.E("\u4e3b\u9875url"));
                                        ((StringBuilder)object).append("/");
                                        object = ((StringBuilder)object).toString().replaceAll(".*(https?\\://[^/]+)/.*", "$1");
                                        this.f = object;
                                        this.G = object;
                                        this.G = ((String)object).split("://")[1].split("/")[0].replace(".", "_");
                                        object = this.J("\u5206\u7c7burl", "\u5206\u7c7b\u94fe\u63a5", "\u5206\u7c7b\u9875", "class_url", "cateUrl", "");
                                        this.b = object;
                                        n2 = ((String)object).indexOf(";;");
                                        if (n2 >= 0) {
                                            if (this.b.split(";;").length > 1) {
                                                this.s = this.b.split(";;")[1];
                                            }
                                            this.b = this.b.split(";;")[0];
                                        } else if (this.G("\u641c\u7d22url", "\u641c\u7d22\u94fe\u63a5", "").indexOf(";;") >= 0) {
                                            if (this.G("\u641c\u7d22url", "\u641c\u7d22\u94fe\u63a5", "").split(";;").length > 1) {
                                                this.s = this.G("\u641c\u7d22url", "\u641c\u7d22\u94fe\u63a5", "").split(";;")[1];
                                            }
                                        } else {
                                            this.s = "";
                                        }
                                        if (this.E("\u57df\u540d\u8df3\u8f6c").indexOf("&&") <= 0 && this.s.indexOf("\u57df") < 0) break block21;
                                        object = object2 = this.G("\u53d1\u5e03\u9875", "\u57df\u540d\u53d1\u5e03\u9875", "");
                                        if (!((String)object2).startsWith("http")) {
                                            object = this.f;
                                        }
                                        string = this.k((String)object);
                                        if (this.E("\u57df\u540d\u8df3\u8f6c").indexOf("&&") <= 0) break block22;
                                        object = this.a0(string, this.E("\u57df\u540d\u8df3\u8f6c"), "").get(0).trim();
                                        break block23;
                                    }
                                    object = object2 = this.a0(string, "<a*href=\"&&\"[\u5305\u542b:http]", "");
                                    if (((ArrayList)object2).size() < 1) {
                                        object = this.a0(string, "<a*href='&&'[\u5305\u542b:http]", "");
                                    }
                                    if ((n2 = ((String)(object2 = this.s.matches(".*\u57df\\d.*") ? this.s.replaceAll(".*\u57df(\\d).*", "$1") : "")).matches("\\d") ? Integer.parseInt((String)object2) - 1 : 0) <= 0 || ((ArrayList)object).size() <= n2) break block24;
                                    object = ((ArrayList)object).get(n2);
                                    break block25;
                                }
                                object2 = string;
                                if (((ArrayList)object).size() <= 0) break block26;
                                object = ((ArrayList)object).get(0);
                            }
                            object = (String)object;
                            object2 = ((String)object).trim();
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append("/");
                        object = ((StringBuilder)object).toString().replaceAll(".*(https?\\://[^/]+)/.*", "$1");
                    }
                    if (object != null && ((String)object).startsWith("http")) {
                        this.g = object2 = this.f;
                        this.f = object;
                        this.b = this.b.replace((CharSequence)object2, (CharSequence)object);
                    }
                }
                if (this.s.indexOf("\u963f\u91cc") >= 0) {
                    this.B.put("\u8df3\u8f6c\u94fe\u63a5", (Object)"https://www.aliyundrive.com/s/+aliyundrive.com/s/&&\"");
                }
                break block20;
            }
            catch (Exception exception) {
                SpiderApi spiderApi = this.I;
                if (spiderApi == null) return;
                com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("\u521d\u59cb\u5316\u5168\u5c40\u53d8\u91cf\u9519\u8bef\uff01-->"), spiderApi);
            }
            return;
            catch (JSONException jSONException) {}
        }
        bl = (bl = this.H("\u56fe\u7247\u4ee3\u7406", "\u56fe\u7247\u662f\u5426\u9700\u8981\u4ee3\u7406", "PicNeedProxy", "0").equals("1")) || this.H("\u56fe\u7247\u4ee3\u7406", "\u56fe\u7247\u662f\u5426\u9700\u8981\u4ee3\u7406", "PicNeedProxy", "0").equals("\u662f") || this.s.indexOf("t") >= 0;
        this.h = bl;
        object = this.s.indexOf("T") >= 0 ? "1" : this.G("\u8c03\u8bd5", "debug", "");
        this.o = object;
        bl = ((String)object).length() > 0 && !"0".equals(this.o);
        this.m = bl;
        if (this.o.indexOf("$") >= 0) {
            this.p = Integer.parseInt(this.o.split("\\$")[1]);
            this.o = this.o.split("\\$")[0];
        }
        bl = this.I("\u5012\u5e8f", "\u5012\u5e8f\u64ad\u653e", "\u662f\u5426\u53cd\u8f6c\u9009\u96c6\u5e8f\u5217", "epi_reverse", "0").equals("1") || this.I("\u5012\u5e8f", "\u5012\u5e8f\u64ad\u653e", "\u662f\u5426\u53cd\u8f6c\u9009\u96c6\u5e8f\u5217", "epi_reverse", "0").equals("\u662f") || this.s.indexOf("d0") < 0 && this.s.indexOf("d") >= 0;
        this.y = bl;
        if (this.s.indexOf("o") < 0) return;
        object = this.s.replaceAll(".*o(\\d+).*", "$1");
        if (((String)object).length() <= 0) return;
        this.v = Integer.parseInt((String)object);
    }

    private String P(String string) {
        String string2 = string;
        if (string.indexOf("\u8f6c\u4e49\u4e95\u53f7") >= 0) {
            string2 = string.replace("\u8f6c\u4e49\u4e95\u53f7", "#");
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     */
    private String Q(String var1_1, String var2_2, String var3_4) {
        block32: {
            block31: {
                block30: {
                    block28: {
                        block35: {
                            block29: {
                                var8_5 = this.I;
                                if (var8_5 == null) ** GOTO lbl11
                                var9_6 = new StringBuilder();
                                var9_6.append("\u8bf7\u6c42\u8df3\u8f6c\u64ad\u653e\u94fe\u63a5\u6e90\u7801\uff0cwebUrl--> ");
                                var9_6.append(var1_1);
                                var8_5.log(var9_6.toString());
lbl11:
                                // 2 sources

                                var9_6 = this.k(var1_1);
                                var10_7 = this.I;
                                if (var10_7 == null) break block28;
                                if (var9_6 != null) break block29;
                                var10_7.log("\u672a\u83b7\u53d6\u5230\u8df3\u8f6c\u6e90\u7801");
                                return var1_1;
                            }
                            var7_8 = this.m;
                            if (!var7_8) ** GOTO lbl30
                            var8_5 = new StringBuilder();
                            var8_5.append("\u83b7\u53d6\u5230\u8df3\u8f6c\u6e90\u7801--> ");
                            var8_5.append((String)var9_6);
                            var8_5 = var8_5.toString();
                            break block35;
lbl30:
                            // 1 sources

                            var8_5 = new StringBuilder();
                            var8_5.append("\u83b7\u53d6\u5230\u8df3\u8f6c\u6e90\u7801--> ");
                            var8_5.append(var9_6.split("<meta http")[0].split(",\\{")[0]);
                            var8_5.append("......");
                            var8_5 = var8_5.toString();
                        }
                        var10_7.log((String)var8_5);
                        break block30;
                    }
                    if (var9_6 == null) {
                        return var1_1;
                    }
                }
                if (var2_2.length() <= 0) {
                    var2_2 = "\"url\"*\"&&\",";
                }
                if (var9_6 == null) break block31;
                if (!var9_6.startsWith("{") || !var9_6.endsWith("}") || var2_2.indexOf("&&") >= 0) break block31;
                var3_4 = new JSONObject((String)var9_6);
                if (var2_2.indexOf(".") < 0) {
                    var3_4.optString(var2_2).getClass();
                } else {
                    this.w((String)var9_6, var2_2);
                }
                break block32;
            }
            if (var9_6 != null) {
                if (var2_2.indexOf("&&") < 0) break block32;
                var9_6 = this.a0((String)var9_6, (String)var3_4, "");
                var4_9 = 0;
                while (true) {
                    block33: {
                        if (var4_9 >= var9_6.size()) break;
                        var3_4 = (String)var9_6.get(var4_9);
                        if (var3_4.length() <= 10) break block33;
                        var10_7 = this.a0((String)var3_4, var2_2, "");
                        var5_10 = 0;
                        while (true) {
                            block34: {
                                if (var5_10 >= var10_7.size()) break;
                                var3_4 = var8_5 = ((String)var10_7.get(var5_10)).trim();
                                try {
                                    if (this.s.indexOf("u0") < 0) {
                                        var3_4 = URLDecoder.decode((String)var8_5);
                                    }
                                }
                                catch (Exception var11_12) {
                                    if (this.m) {
                                        var3_4 = new StringBuilder();
                                        var3_4.append(this.G);
                                        var3_4.append("\u8c03\u8bd5->\u8df3\u8f6cUrl\u89e3\u7801\u51fa\u9519\uff1a");
                                        var3_4.append(var11_12.toString());
                                        Init.show(var3_4.toString());
                                    }
                                    var12_13 = this.I;
                                    var3_4 = var8_5;
                                    if (var12_13 == null) break block34;
                                    var3_4 = new StringBuilder();
                                    var3_4.append("\u8df3\u8f6cUrl\u89e3\u7801\u9519\u8bef\uff01-->");
                                    var3_4.append(var11_12.toString());
                                    var12_13.log(var3_4.toString());
                                    var3_4 = var8_5;
                                }
                            }
                            var6_11 = var3_4.length();
                            if (var6_11 > 10) {
                                return var3_4;
                            }
                            ++var5_10;
                            continue;
                            break;
                        }
                    }
                    ++var4_9;
                }
            }
        }
        return var1_1;
        {
            catch (Exception var2_3) {
                if (this.m) {
                    var3_4 = new StringBuilder();
                    var3_4.append(this.G);
                    var3_4.append("\u8c03\u8bd5->jumpCut\u51fa\u9519\uff1a");
                    var3_4.append(var2_3.toString());
                    Init.show(var3_4.toString());
                }
                if ((var3_4 = this.I) != null) {
                    com.github.catvod.spider.merge.Dw.f.a(var2_3, com.github.catvod.spider.merge.ka.d.b("jumpCut()\u9519\u8bef\uff01-->"), (SpiderApi)var3_4);
                }
                return var1_1;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private String R(String var1_1, String var2_3) {
        block42: {
            block41: {
                block40: {
                    block39: {
                        block36: {
                            block38: {
                                block37: {
                                    block34: {
                                        block35: {
                                            block33: {
                                                block46: {
                                                    block45: {
                                                        block44: {
                                                            block43: {
                                                                var5_4 = var2_3;
                                                                if (var2_3.length() < 1) break block42;
                                                                if (this.u < this.v) break block43;
                                                                var5_4 = var2_3;
                                                                break block42;
                                                            }
                                                            var3_5 = var2_3.indexOf("\u68c0\u6d4b\u4e2d");
                                                            var4_6 = false;
                                                            if (var3_5 < 0 || var2_3.indexOf("\u8df3\u8f6c\u4e2d") < 0 || var2_3.indexOf("btwaf") < 0) break block44;
                                                            var6_7 = this.I;
                                                            if (var6_7 != null) {
                                                                var5_4 = new StringBuilder();
                                                                var5_4.append("\u8fc7\u5b9d\u5854\u76fe--> ");
                                                                var5_4.append((String)var2_3);
                                                                var6_7.log(var5_4.toString());
                                                            }
                                                            var5_4 = this.a0((String)var2_3, "btwaf=&&\"", "").get(0);
                                                            var6_7 = com.github.catvod.spider.merge.ka.d.b(var1_1);
                                                            var2_3 = "?";
                                                            if (var1_1.indexOf("?") >= 0) {
                                                                var2_3 = "&";
                                                            }
                                                            var6_7.append((String)var2_3);
                                                            var6_7.append("btwaf=");
                                                            var6_7.append((String)var5_4);
                                                            var1_1 = var6_7.toString();
                                                            ++this.u;
                                                            var5_4 = this.k(var1_1);
                                                            this.t = true;
                                                            break block42;
                                                        }
                                                        if (!var2_3.contains("\u6b63\u5728\u8fdb\u884c\u4eba\u673a\u8bc6\u522b")) break block45;
                                                        var5_4 = this.I;
                                                        if (var5_4 != null) {
                                                            var6_8 = new StringBuilder();
                                                            var6_8.append("\u4eba\u673a\u9a8c\u8bc1--> ");
                                                            var6_8.append((String)var2_3);
                                                            var5_4.log(var6_8.toString());
                                                        }
                                                        var6_8 = this.a0((String)var2_3, "src=\"&&\"", "").get(0).trim();
                                                        var5_4 = var2_3;
                                                        if (var6_8.length() > 0) {
                                                            var7_10 = new HashMap<String, List<String>>();
                                                            if (var6_8.startsWith("http")) {
                                                                var2_3 = var6_8;
                                                            } else {
                                                                if (var6_8.startsWith("/")) {
                                                                    var2_3 = new StringBuilder();
                                                                    var2_3.append(this.f);
                                                                } else {
                                                                    var2_3 = new StringBuilder();
                                                                    var2_3.append(this.f);
                                                                    var2_3.append("/");
                                                                }
                                                                var2_3.append((String)var6_8);
                                                                var2_3 = var2_3.toString();
                                                            }
                                                            var5_4 = com.github.catvod.spider.merge.mk.g.h((String)var2_3, this.t((String)var2_3), var7_10);
                                                            var6_8 = this.a0((String)var5_4, "var key=\"&&\"", "").get(0).trim();
                                                            var8_12 = this.a0((String)var5_4, ",value=\"&&\"", "").get(0).trim();
                                                            var2_3 = "";
                                                            for (var3_5 = 0; var3_5 < var8_12.length(); ++var3_5) {
                                                                var2_3 = com.github.catvod.spider.merge.ka.d.b((String)var2_3);
                                                                var2_3.append(Integer.toString(var8_12.charAt(var3_5)));
                                                                var2_3 = var2_3.toString();
                                                            }
                                                            var8_12 = com.github.catvod.spider.merge.nz.m.a((String)var2_3, com.github.catvod.spider.merge.nz.m.b);
                                                            if ((var5_4 = this.a0((String)var5_4, "c.get(\"&&\\&", "").get(0).trim()).startsWith("http")) {
                                                                var2_3 = var5_4;
                                                            } else {
                                                                if (var5_4.startsWith("/")) {
                                                                    var2_3 = new StringBuilder();
                                                                    var2_3.append(this.f);
                                                                } else {
                                                                    var2_3 = new StringBuilder();
                                                                    var2_3.append(this.f);
                                                                    var2_3.append("/");
                                                                }
                                                                var2_3.append((String)var5_4);
                                                                var2_3 = var2_3.toString();
                                                            }
                                                            var5_4 = new StringBuilder();
                                                            var5_4.append((String)var2_3);
                                                            var5_4.append("&key=");
                                                            var5_4.append((String)var6_8);
                                                            var5_4.append("&value=");
                                                            var5_4.append(var8_12);
                                                            var2_3 = var5_4.toString();
                                                            com.github.catvod.spider.merge.mk.g.h((String)var2_3, this.t((String)var2_3), var7_10);
                                                            var5_4 = var7_10.entrySet().iterator();
                                                            while (var5_4.hasNext()) {
                                                                var2_3 = var5_4.next();
                                                                if (!var2_3.getKey().equals("set-cookie") && !var2_3.getKey().equals("Set-Cookie")) continue;
                                                                if (this.z.length() < 1) {
                                                                    var2_3 = TextUtils.join((CharSequence)";", (Iterable)var2_3.getValue());
                                                                } else {
                                                                    var5_4 = new StringBuilder();
                                                                    var5_4.append(this.z);
                                                                    var5_4.append(";");
                                                                    var5_4.append(TextUtils.join((CharSequence)";", (Iterable)((Iterable)var2_3.getValue())));
                                                                    var2_3 = var5_4.toString();
                                                                }
                                                                this.z = var2_3;
                                                                break;
                                                            }
                                                            ++this.u;
                                                            var5_4 = this.k(var1_1);
                                                        }
                                                        break block42;
                                                    }
                                                    if (var2_3.indexOf("\u8f93\u5165\u9a8c\u8bc1\u7801") >= 0) break block46;
                                                    var5_4 = var2_3;
                                                    if (var2_3.indexOf("\u6ed1\u52a8\u9a8c\u8bc1") < 0) break block42;
                                                }
                                                var5_4 = this.I;
                                                if (var5_4 == null) ** GOTO lbl140
                                                var6_9 = new StringBuilder();
                                                var6_9.append("OCR\u8f85\u52a9\u9a8c\u8bc1--> ");
                                                var6_9.append((String)var2_3);
                                                var5_4.log(var6_9.toString());
lbl140:
                                                // 2 sources

                                                if (var2_3.indexOf("\u8f93\u5165\u9a8c\u8bc1\u7801") < 0) break block33;
                                                var4_6 = true;
                                            }
                                            var5_4 = this.B(this.E("\u9a8c\u8bc1"), var4_6);
                                            var9_14 = this.z;
                                            var11_15 = var5_4.getString("str");
                                            var10_16 = var5_4.getString("codeUrl");
                                            var6_9 = this.H("ocr", "Ocr", "OCR", "");
                                            var8_13 = "1";
                                            if (!var4_6) break block34;
                                            if (var6_9.length() < 1) break block35;
                                            var5_4 = var6_9;
                                            var7_11 = var8_13;
                                            if (var6_9.startsWith("http")) break block36;
                                        }
                                        var5_4 = "https://ocr.wogg.link/";
                                        var7_11 = var8_13;
                                        {
                                            break block36;
                                        }
                                    }
                                    if (var6_9.length() < 1) break block37;
                                    var5_4 = var6_9;
                                    if (var6_9.startsWith("http")) break block38;
                                }
                                var5_4 = "https://ocr1.wogg.link/";
                            }
                            var7_11 = "3";
                        }
                        this.M("");
                        var5_4 = this.p(var11_15, (String)var5_4, (String)var7_11);
                        var6_9 = var5_4.getString("code");
                        this.z = var5_4.getString("cookie");
                        if (var6_9.length() > 0 && this.z.length() > 0) ** GOTO lbl187
                        this.z = var9_14;
                        this.u = var3_5 = this.u + 1;
                        if (var3_5 < this.v) break block39;
                        return var2_3;
                    }
                    this.R(var1_1, (String)var2_3);
lbl187:
                    // 2 sources

                    var5_4 = this.t(var11_15);
                    if (!var4_6) break block40;
                    var7_11 = new StringBuilder();
                    var7_11.append(var10_16);
                    var7_11.append((String)var6_9);
                    var7_11 = var7_11.toString();
                    var6_9 = new HashMap();
                    var5_4 = com.github.catvod.spider.merge.lq.b.c((String)var7_11, (Map<String, String>)var6_9, (Map<String, String>)var5_4);
                    var6_9 = new JSONObject((String)var5_4);
                    if (var6_9.optInt("code") != 1) {
                        this.z = var9_14;
                        this.u = var3_5 = this.u + 1;
                        if (var3_5 >= this.v) {
                            return var2_3;
                        }
                        break block41;
                    }
                    ** GOTO lbl223
                }
                var7_11 = new StringBuilder();
                var7_11.append(var10_16);
                var7_11.append((String)var6_9);
                if (!com.github.catvod.spider.merge.mk.g.g(var7_11.toString(), (Map<String, String>)var5_4).contains("ok")) {
                    this.z = var9_14;
                    this.u = var3_5 = this.u + 1;
                    if (var3_5 < this.v) break block41;
                    return var2_3;
                }
                ** GOTO lbl223
            }
            try {
                this.R(var1_1, (String)var2_3);
lbl223:
                // 3 sources

                ++this.u;
                var5_4 = this.k(var1_1);
            }
            catch (Exception var1_2) {
                var6_9 = this.I;
                var5_4 = var2_3;
                if (var6_9 == null) break block42;
                com.github.catvod.spider.merge.Dw.f.a(var1_2, com.github.catvod.spider.merge.ka.d.b("jumpbtwaf()\u9519\u8bef-->"), (SpiderApi)var6_9);
                var5_4 = var2_3;
            }
        }
        return var5_4;
    }

    private String S(String string) {
        String string2 = string;
        if (string.indexOf("\u8f6c\u4e49\u5de6\u62ec\u53f7") >= 0) {
            string2 = string.replace("\u8f6c\u4e49\u5de6\u62ec\u53f7", "[");
        }
        string = string2;
        if (string2.indexOf("\u8f6c\u4e49\u53f3\u62ec\u53f7") >= 0) {
            string = string2.replace("\u8f6c\u4e49\u53f3\u62ec\u53f7", "]");
        }
        return string;
    }

    private String T(String charSequence, String object) {
        String[] stringArray;
        block4: {
            block3: {
                if (object.equals("*")) break block3;
                stringArray = object;
                if (!object.isEmpty()) break block4;
            }
            stringArray = charSequence;
        }
        String[] stringArray2 = ((String)charSequence).split("\\&");
        stringArray = stringArray.split("\\&");
        charSequence = "";
        for (int i2 = 0; i2 < stringArray2.length; ++i2) {
            object = i2 < stringArray2.length - 1 ? "#" : "";
            charSequence = com.github.catvod.spider.merge.ka.d.b((String)charSequence);
            ((StringBuilder)charSequence).append(stringArray2[i2]);
            ((StringBuilder)charSequence).append("$");
            charSequence = com.github.catvod.spider.merge.dp.n.b((StringBuilder)charSequence, stringArray[i2], (String)object);
        }
        return charSequence;
    }

    /*
     * Could not resolve type clashes
     * Loose catch block
     */
    private String U(String object7) {
        Object object2;
        Object object3;
        StringBuilder stringBuilder;
        Object object4;
        block61: {
            int n2;
            int n3;
            block59: {
                block56: {
                    Object object5;
                    block60: {
                        block53: {
                            block55: {
                                block54: {
                                    object4 = ";post";
                                    stringBuilder = new StringBuilder();
                                    object3 = object4;
                                    if (((String)object7).indexOf("$$$") >= 1) break block53;
                                    object3 = object4;
                                    if (((String)object7).indexOf(";post") < 0) break block54;
                                    object3 = object4;
                                    object7 = object4 = this.l((String)object7);
                                    break block55;
                                }
                                object3 = object4;
                                object7 = object4 = this.k(((String)object7).split(";")[0]);
                            }
                            return object7;
                        }
                        object3 = object4;
                        if (this.I == null) break block56;
                        object3 = object4;
                        object3 = object4;
                        JsonArray jsonArray = new JsonArray();
                        object3 = object4;
                        object2 = ((String)object7).split("\\$\\$\\$");
                        object3 = object4;
                        n3 = ((Object)object2).length;
                        for (n2 = 0; n2 < n3; ++n2) {
                            JsonObject jsonObject;
                            JsonObject jsonObject2;
                            Object object6;
                            block58: {
                                block57: {
                                    object6 = object2[n2];
                                    object3 = object4;
                                    object3 = object4;
                                    jsonObject2 = new JsonObject();
                                    object3 = object4;
                                    object3 = object4;
                                    jsonObject = new JsonObject();
                                    object3 = object4;
                                    object3 = object4;
                                    JsonObject jsonObject3 = new JsonObject();
                                    object3 = object4;
                                    int n4 = ((String)object6).indexOf((String)object4);
                                    if (n4 <= 0) break block57;
                                    object3 = object4;
                                    jsonObject.addProperty("method", "POST");
                                    object3 = object4;
                                    String[] stringArray = ((String)object6).split(";post;")[1].split("\\&");
                                    object3 = object4;
                                    n4 = stringArray.length;
                                    object5 = object4;
                                    for (int i2 = 0; i2 < n4; ++i2) {
                                        String string = stringArray[i2];
                                        object3 = object5;
                                        if (string.endsWith("=")) continue;
                                        object3 = object5;
                                        jsonObject3.addProperty(string.split("=")[0], string.split("=")[1]);
                                    }
                                    object3 = object5;
                                    jsonObject.add("data", (JsonElement)jsonObject3);
                                    object3 = object5;
                                    jsonObject.addProperty("postType", "form");
                                    break block58;
                                }
                                object3 = object4;
                                jsonObject.addProperty("method", "GET");
                            }
                            object3 = object4;
                            jsonObject.add("headers", (JsonElement)this.y((String)object6));
                            object3 = object4;
                            jsonObject2.addProperty("url", ((String)object6).split(";")[0]);
                            object3 = object4;
                            jsonObject2.add("data", (JsonElement)jsonObject);
                            object3 = object4;
                            jsonArray.add((JsonElement)jsonObject2);
                            continue;
                        }
                        object3 = object2 = object4;
                        object5 = this.I.multiReq(jsonArray);
                        object4 = object2;
                        if (object5 == null) break block59;
                        object4 = object2;
                        object3 = object2;
                        if (((String)object5).length() <= 50) break block59;
                        object3 = object2;
                        object3 = object2;
                        object4 = new Gson();
                        object3 = object2;
                        object4 = (JsonArray)object4.fromJson((String)object5, JsonArray.class);
                        if (object4 == null) break block60;
                        object3 = object2;
                        if (object4.size() <= 0) break block60;
                        object3 = object2;
                        this.I.log("\u591a\u7ebf\u7a0b\u5e76\u53d1\u6210\u529f\uff01");
                        n3 = 0;
                        while (true) {
                            object3 = object2;
                            if (n3 >= object4.size()) break;
                            object3 = object2;
                            stringBuilder.append(object4.get(n3).getAsJsonObject().get("content").getAsString());
                            ++n3;
                            continue;
                            break;
                        }
                        object3 = object2;
                        return XBPQ.Y(stringBuilder.toString()).replace(" ", "\u7a7a\u7a7a\u7a7a").replaceAll("\\s+", "").replace("\u7a7a\u7a7a\u7a7a", " ").trim();
                    }
                    object3 = object2;
                    return XBPQ.Y((String)object5).replace(" ", "\u7a7a\u7a7a\u7a7a").replaceAll("\\s+", "").replace("\u7a7a\u7a7a\u7a7a", " ").trim();
                }
                object4 = ";post";
            }
            object3 = object4;
            object2 = ((String)object7).split("\\$\\$\\$");
            object3 = object4;
            n2 = ((Object)object2).length;
            for (n3 = 0; n3 < n2; ++n3) {
                object3 = object2[n3];
                object3 = ((String)object3).indexOf((String)object4) >= 0 ? this.l((String)object3) : this.k(((String)object3).split(";")[0]);
                if (((String)object3).length() <= 50) continue;
                stringBuilder.append((String)object3);
                continue;
            }
            try {
                object3 = stringBuilder.toString();
                return object3;
            }
            catch (Exception exception) {}
            break block61;
            catch (Exception exception) {
                object2 = object3;
                object3 = exception;
                object4 = object2;
            }
            break block61;
            catch (Exception exception) {
                object4 = object3;
                object3 = exception;
            }
        }
        if (this.m) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(this.G);
            ((StringBuilder)object2).append("\u8c03\u8bd5->multiReq\u51fa\u9519\uff1a");
            ((StringBuilder)object2).append(object3.toString());
            Init.show(((StringBuilder)object2).toString());
        }
        if ((object2 = this.I) != null) {
            com.github.catvod.spider.merge.Dw.f.a((Exception)object3, com.github.catvod.spider.merge.ka.d.b("multiReq()\u9519\u8bef\uff01-->"), (SpiderApi)object2);
        }
        for (Object object7 : ((String)object7).split("\\$\\$\\$")) {
            object7 = ((String)object7).indexOf((String)object4) >= 0 ? this.l((String)object7) : this.k(((String)object7).split(";")[0]);
            if (((String)object7).length() <= 50) continue;
            stringBuilder.append((String)object7);
        }
        return stringBuilder.toString();
    }

    private String V(String string, String string2) {
        String string3;
        int n2 = string.length();
        String string4 = string3 = "";
        if (n2 > 1) {
            String[] stringArray = string.split("#");
            if (string.indexOf("$") < 1) {
                string = stringArray[0].replaceAll(".*(http.*)", "$1");
            } else {
                int n3 = stringArray.length;
                string = "";
                for (n2 = 0; n2 < n3; ++n2) {
                    String string5;
                    string4 = string5 = stringArray[n2];
                    if (string5.endsWith("$")) {
                        string4 = com.github.catvod.spider.merge.dp.n.a(string5, "\u7a7a");
                    }
                    String[] stringArray2 = string4.split("\\$")[0].split("\u3001");
                    int n4 = stringArray2.length;
                    int n5 = 0;
                    while (true) {
                        string5 = string;
                        if (n5 >= n4) break;
                        if (string2.equals(stringArray2[n5])) {
                            string5 = string4.split("\\$")[1];
                            break;
                        }
                        ++n5;
                    }
                    string = string5;
                }
                if (string.length() < 1 && "\u9ed8\u8ba4".equals(stringArray[0].split("\\$")[0])) {
                    string = stringArray[0].split("\\$")[1];
                }
            }
            string4 = string3;
            if (!"\u7a7a".equals(string)) {
                string4 = string3;
                if (string.startsWith("http")) {
                    string4 = !string.endsWith("=") ? string3 : string;
                }
            }
        }
        return string4;
    }

    private void W(Map<String, List<String>> object) {
        if (object.isEmpty()) {
            return;
        }
        SpiderApi object32 = this.I;
        if (object32 != null) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.ka.d.b("\u54cd\u5e94--> ");
            stringBuilder.append(object.toString());
            object32.log(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (object.get("set-cookie") != null && !((List)object.get("set-cookie")).isEmpty()) {
            Iterator iterator = ((List)object.get("set-cookie")).iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(((String)iterator.next()).split(";")[0]);
                stringBuilder.append(";");
            }
        }
        if (object.get("Set-cookie") != null && !((List)object.get("Set-cookie")).isEmpty()) {
            for (String string : (List)object.get("Set-cookie")) {
                if (stringBuilder.indexOf(string.split(";")[0]) >= 0) continue;
                stringBuilder.append(string.split(";")[0]);
                stringBuilder.append(";");
            }
        }
        if (object.get("Set-Cookie") != null && !((List)object.get("Set-Cookie")).isEmpty()) {
            for (String string : (List)object.get("Set-Cookie")) {
                if (stringBuilder.indexOf(string.split(";")[0]) >= 0) continue;
                stringBuilder.append(string.split(";")[0]);
                stringBuilder.append(";");
            }
        }
        if (object.get("set-Cookie") != null && !((List)object.get("set-Cookie")).isEmpty()) {
            for (String string : (List)object.get("set-Cookie")) {
                if (stringBuilder.indexOf(string.split(";")[0]) >= 0) continue;
                stringBuilder.append(string.split(";")[0]);
                stringBuilder.append(";");
            }
        }
        if (stringBuilder.toString().length() < 3) {
            return;
        }
        for (String string : stringBuilder.toString().split(";")) {
            if (this.z.indexOf(string.split("=")[0]) < 0) {
                object = string;
                if (this.z.length() >= 1) {
                    if ("0".equals(this.z)) {
                        object = string;
                    } else {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.z);
                        ((StringBuilder)object).append(";");
                        ((StringBuilder)object).append(string);
                        object = ((StringBuilder)object).toString();
                    }
                }
            } else {
                if (string.endsWith("=") || "0".equals(string.split("=")[1])) continue;
                String string2 = com.github.catvod.spider.merge.dp.n.b(new StringBuilder(), this.z, ";");
                object = com.github.catvod.spider.merge.dp.n.b(new StringBuilder(), string.split("=")[0], "=.*?;");
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string);
                stringBuilder2.append(";");
                this.z = object = string2.replaceAll((String)object, stringBuilder2.toString());
                object = ((String)object).substring(0, ((String)object).length() - 1);
            }
            this.z = object;
        }
    }

    private static String Y(String string) {
        if (string.length() < 1) {
            return string;
        }
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(string);
        while (matcher.find()) {
            String string2 = matcher.group(1);
            char c2 = (char)Integer.parseInt(matcher.group(2), 16);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c2);
            stringBuilder.append("");
            string = string.replace(string2, stringBuilder.toString());
        }
        return string.replaceAll("\\\\", "");
    }

    /*
     * Exception decompiling
     */
    private JSONObject Z(String var1_1, String var2_9, boolean var3_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 73[TRYBLOCK] [102 : 3624->3634)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    static /* synthetic */ String a(XBPQ xBPQ, String string) {
        xBPQ.A = string;
        return string;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private ArrayList<String> a0(String var1_1, String var2_2, String var3_3) {
        var7_4 = new ArrayList<String>();
        var6_5 = var2_2;
        if (var2_2.indexOf("\\+") >= 0) {
            var6_5 = var2_2.replace("\\+", "\u8f6c\u4e49\u52a0\u53f7");
        }
        var2_2 = var6_5;
        if (var6_5.indexOf("\\(") >= 0) {
            var2_2 = var6_5.replace("\\(", "\u8f6c\u4e49\u5de6\u5c0f\u62ec\u53f7");
        }
        var6_5 = var2_2;
        if (var2_2.indexOf("\\)") >= 0) {
            var6_5 = var2_2.replace("\\)", "\u8f6c\u4e49\u53f3\u5c0f\u62ec\u53f7");
        }
        if (var6_5.indexOf("+") < 0) {
            return this.e0(var1_1, var6_5, (String)var3_3 /* !! */ );
        }
        var8_6 = var6_5.split("\\+");
        var2_2 = new StringBuilder();
        for (String[] var3_3 : var8_6) {
            block10: {
                if (var3_3 /* !! */ .isEmpty()) continue;
                if (var3_3 /* !! */ .startsWith("url:")) break block10;
                var3_3 /* !! */  = this.e0(var1_1, (String)var3_3 /* !! */ , "");
                ** GOTO lbl27
            }
            var6_5 = var3_3 /* !! */ .substring(4);
            var3_3 /* !! */  = var6_5;
            if (var6_5.indexOf("$sub:") <= 0) ** GOTO lbl30
            var3_3 /* !! */  = var6_5.split("\\$sub\\:");
            if (var3_3 /* !! */ .length > 1) {
                var3_3 /* !! */  = this.e0(this.k(var3_3 /* !! */ [0]), var3_3 /* !! */ [1], "");
lbl27:
                // 2 sources

                var6_5 = ((String)var3_3 /* !! */ .get(0)).trim();
            } else {
                var3_3 /* !! */  = var3_3 /* !! */ [0];
lbl30:
                // 2 sources

                var6_5 = this.k((String)var3_3 /* !! */ );
            }
            if (var6_5.isEmpty()) continue;
            var3_3 /* !! */  = var2_2;
            if (var6_5.startsWith("http")) {
                var3_3 /* !! */  = var2_2;
                if (!var2_2.toString().trim().endsWith("=")) {
                    var3_3 /* !! */  = var2_2;
                    if (!var2_2.toString().trim().endsWith("\u89e3\u6790")) {
                        var3_3 /* !! */  = new StringBuilder();
                    }
                }
            }
            var3_3 /* !! */ .append(var6_5);
            var2_2 = var3_3 /* !! */ ;
        }
        var7_4.add(var2_2.toString());
        return var7_4;
    }

    static /* synthetic */ String b(XBPQ xBPQ) {
        return xBPQ.G;
    }

    /*
     * Unable to fully structure code
     */
    private ArrayList<String> b0(String var1_1, String var2_3, String var3_4) {
        block106: {
            block96: {
                block95: {
                    block94: {
                        block93: {
                            block92: {
                                block89: {
                                    block90: {
                                        block91: {
                                            block87: {
                                                block88: {
                                                    block108: {
                                                        block107: {
                                                            block86: {
                                                                block85: {
                                                                    block84: {
                                                                        var13_5 = var1_1;
                                                                        var12_6 = var2_3;
                                                                        var14_7 = new ArrayList<String>();
                                                                        if (var2_3.isEmpty() && var3_4.isEmpty() || var12_6.equals("\u7a7a$$\u7a7a") || var12_6.equals("\u7a7a")) break block106;
                                                                        var1_1 = var12_6;
                                                                        if (var12_6.indexOf("\u8f6c\u4e49\u52a0\u53f7") >= 0) {
                                                                            var1_1 = var12_6.replace("\u8f6c\u4e49\u52a0\u53f7", "+");
                                                                        }
                                                                        var12_6 = var1_1;
                                                                        if (var1_1.indexOf("\u8f6c\u4e49\u5de6\u5c0f\u62ec\u53f7") >= 0) {
                                                                            var12_6 = var1_1.replace("\u8f6c\u4e49\u5de6\u5c0f\u62ec\u53f7", "(");
                                                                        }
                                                                        var2_3 = var12_6;
                                                                        if (var12_6.indexOf("\u8f6c\u4e49\u53f3\u5c0f\u62ec\u53f7") >= 0) {
                                                                            var2_3 = var12_6.replace("\u8f6c\u4e49\u53f3\u5c0f\u62ec\u53f7", ")");
                                                                        }
                                                                        if ((var4_8 = var2_3.indexOf("&&")) >= 0) break block84;
                                                                        if (var2_3.indexOf("$$") >= 0 || var2_3.length() <= 0 || var3_4.length() >= 1) break block84;
                                                                        var1_1 = var2_3;
                                                                        if (var2_3.indexOf("\u66ff\u6362") >= 0) {
                                                                            var1_1 = this.c0((String)var2_3, (String)var13_5);
                                                                        }
                                                                        var14_7.add((String)var1_1);
                                                                        return var14_7;
                                                                    }
                                                                    var1_1 = var13_5;
                                                                    var12_6 = var2_3;
                                                                    if (!var2_3.endsWith("\u6574\u9875")) break block85;
                                                                    var2_3 = var2_3.replace("\u6574\u9875", "");
                                                                    var1_1 = var13_5;
                                                                    var12_6 = var2_3;
                                                                    if (this.x.length() <= 0) break block85;
                                                                    var1_1 = this.x;
                                                                    var12_6 = var2_3;
                                                                }
                                                                var2_3 = var12_6;
                                                                if (var12_6.indexOf("\\[") >= 0) {
                                                                    var2_3 = var12_6.replace("\\[", "\u8f6c\u4e49\u5de6\u62ec\u53f7");
                                                                }
                                                                var12_6 = var2_3;
                                                                if (var2_3.indexOf("\\]") >= 0) {
                                                                    var12_6 = var2_3.replace("\\]", "\u8f6c\u4e49\u53f3\u62ec\u53f7");
                                                                }
                                                                var2_3 = var12_6;
                                                                if (var12_6.indexOf("\\*") >= 0) {
                                                                    var2_3 = var12_6.replace("\\*", "\u8f6c\u4e49\u661f\u53f7");
                                                                }
                                                                var4_8 = var2_3.indexOf("\\&");
                                                                var12_6 = var2_3;
                                                                if (var4_8 < 0) break block86;
                                                                var12_6 = var2_3.replace("\\&", "\u8f6c\u4e49\u8fde\u63a5\u7b26");
                                                            }
                                                            var2_3 = var12_6;
                                                            if (var12_6.indexOf("\\#") >= 0) {
                                                                var2_3 = var12_6.replace("\\#", "\u8f6c\u4e49\u4e95\u53f7");
                                                            }
                                                            if ((var4_8 = var2_3.indexOf("&&")) < 0) break block87;
                                                            if (var2_3.split("\\&\\&") == null || var2_3.split("\\&\\&").length < 1) break block88;
                                                            var4_8 = var2_3.split("\\&\\&").length;
                                                            var3_4 = var1_1;
                                                            var12_6 = var2_3;
                                                            if (var4_8 != 1) ** GOTO lbl100
                                                            if (!var2_3.startsWith("&&")) break block107;
                                                            var3_4 = new StringBuilder();
                                                            var3_4.append("\u4ece\u5934\u622a\u53d6");
                                                            var3_4.append((String)var1_1);
                                                            var3_4 = var3_4.toString();
                                                            var1_1 = new StringBuilder();
                                                            var1_1.append("\u4ece\u5934\u622a\u53d6");
                                                            var1_1.append((String)var2_3);
                                                            ** GOTO lbl99
                                                        }
                                                        var3_4 = var1_1;
                                                        var12_6 = var2_3;
                                                        if (!var2_3.endsWith("&&")) break block108;
                                                        var3_4 = new StringBuilder();
                                                        var3_4.append((String)var1_1);
                                                        var3_4.append("\u622a\u53d6\u5230\u672b\u5c3e");
                                                        var3_4 = var3_4.toString();
                                                        var1_1 = new StringBuilder();
                                                        var1_1.append((String)var2_3);
                                                        var1_1.append("\u622a\u53d6\u5230\u672b\u5c3e");
lbl99:
                                                        // 2 sources

                                                        var12_6 = var1_1.toString();
                                                    }
                                                    var13_5 = var12_6.split("\\&\\&")[1];
                                                    var2_3 = var3_4;
                                                    var1_1 = var13_5;
                                                    if (var13_5.startsWith("[")) {
                                                        var1_1 = new StringBuilder();
                                                        var1_1.append("\u622a\u53d6\u5230\u672b\u5c3e");
                                                        var1_1.append((String)var13_5);
                                                        var1_1 = var1_1.toString();
                                                        var2_3 = new StringBuilder();
                                                        var2_3.append((String)var3_4);
                                                        var2_3.append("\u622a\u53d6\u5230\u672b\u5c3e");
                                                        var2_3 = var2_3.toString();
                                                    }
                                                    var3_4 = var12_6.split("\\&\\&")[0];
                                                    var13_5 = var2_3;
                                                    var2_3 = var3_4;
                                                    var3_4 = var1_1;
                                                    break block89;
                                                }
                                                var14_7.add((String)var1_1);
                                                return var14_7;
                                            }
                                            if (var2_3.indexOf("$$") < 0) break block90;
                                            if (var2_3.split("\\$\\$") == null || var2_3.split("\\&\\&").length < 2) break block91;
                                            var3_4 = var2_3.split("\\$\\$")[1];
                                            var2_3 = var2_3.split("\\$\\$")[0];
                                            var13_5 = var1_1;
                                            break block89;
                                        }
                                        var14_7.add((String)var1_1);
                                        return var14_7;
                                    }
                                    var13_5 = var1_1;
                                }
                                var12_6 = var2_3;
                                if (var2_3.indexOf("\u8f6c\u4e49\u8fde\u63a5\u7b26") >= 0) {
                                    var12_6 = var2_3.replace("\u8f6c\u4e49\u8fde\u63a5\u7b26", "&");
                                }
                                var1_1 = var3_4;
                                if (var3_4.indexOf("\u8f6c\u4e49\u8fde\u63a5\u7b26") >= 0) {
                                    var1_1 = var3_4.replace("\u8f6c\u4e49\u8fde\u63a5\u7b26", "&");
                                }
                                if ((var4_8 = var12_6.indexOf("[")) <= 0) break block92;
                                var2_3 = var12_6.replaceAll(".*(\\[.*)", "$1");
                                var12_6 = var12_6.replaceAll("\\[.*", "");
                                break block93;
                            }
                            var2_3 = "";
                        }
                        var3_4 = var1_1;
                        if (var1_1.indexOf("[") > 0) {
                            var2_3 = var1_1.replaceAll(".*(\\[.*)", "$1");
                            var3_4 = var1_1.replaceAll("\\[.*", "");
                        }
                        if (!(var11_9 = var12_6.matches("-?\\d+"))) break block94;
                        if (!var3_4.matches("-?\\d+")) break block94;
                        var4_8 = var12_6.startsWith("-") != false ? var13_5.length() - Integer.parseInt(var12_6.replace("-", "")) : Integer.parseInt((String)var12_6) - 1;
                        var5_10 = var3_4.startsWith("-") != false ? var13_5.length() - Integer.parseInt(var3_4.replace("-", "")) + 1 : Integer.parseInt((String)var3_4);
                        var3_4 = var13_5.substring(var4_8, var5_10);
                        var1_1 = var3_4;
                        if (var2_3.indexOf("\u66ff\u6362") > 0) {
                            var1_1 = this.c0((String)var2_3, (String)var3_4);
                        }
                        var14_7.add((String)var1_1);
                        return var14_7;
                    }
                    var12_6 = this.S((String)var12_6);
                    var1_1 = this.S((String)var3_4);
                    var12_6 = this.P((String)var12_6);
                    var3_4 = this.P((String)var1_1);
                    if (var12_6.indexOf("*") >= 0) break block95;
                    var1_1 = this.j((String)var12_6);
                    var4_8 = 1;
                    ** GOTO lbl228
                }
                if (var12_6.indexOf("**") >= 0) ** GOTO lbl210
                var12_6 = var12_6.split("\\*");
                var1_1 = this.j(this.g0((String)var12_6[0]));
                var4_8 = 1;
                while (true) {
                    if (var4_8 >= ((CharSequence)var12_6).length) break;
                    var15_12 = new StringBuilder();
                    var15_12.append((String)var1_1);
                    var15_12.append("([^>]*?)");
                    var15_12.append(this.j(this.g0((String)var12_6[var4_8])));
                    var1_1 = var15_12.toString();
                    ++var4_8;
                    continue;
                    break;
                }
                var4_8 = ((CharSequence)var12_6).length;
                ** GOTO lbl228
lbl210:
                // 1 sources

                var12_6 = var12_6.split("\\*\\*");
                var1_1 = this.j(this.g0((String)var12_6[0]));
                var4_8 = 1;
                while (true) {
                    if (var4_8 >= ((CharSequence)var12_6).length) break;
                    var15_12 = new StringBuilder();
                    var15_12.append((String)var1_1);
                    var15_12.append("([\\S\\s]*?)");
                    var15_12.append(this.j(this.g0((String)var12_6[var4_8])));
                    var1_1 = var15_12.toString();
                    ++var4_8;
                    continue;
                    break;
                }
                try {
                    var4_8 = ((CharSequence)var12_6).length;
lbl228:
                    // 3 sources

                    var12_6 = new StringBuilder();
                    var12_6.append((String)var1_1);
                    var12_6.append("([\\S\\s]*?)");
                    var12_6.append(this.j((String)var3_4));
                    var1_1 = Pattern.compile(var12_6.toString()).matcher(var13_5);
                    var5_11 = 0;
                }
                catch (Throwable var1_2) {
                    if (this.m) {
                        var2_3 = new StringBuilder();
                        var2_3.append(this.G);
                        var2_3.append("\u8c03\u8bd5->subContentExt\u51fa\u9519\uff1a");
                        var2_3.append(var1_2.toString());
                        Init.show(var2_3.toString());
                    }
                    if ((var2_3 = this.I) == null) break block96;
                    var3_4 = com.github.catvod.spider.merge.ka.d.b("subContentExt()\u9519\u8bef-->");
                    var3_4.append(var1_2.toString());
                    var2_3.log(var3_4.toString());
                }
                while (true) {
                    block99: {
                        block103: {
                            block100: {
                                block110: {
                                    block98: {
                                        block109: {
                                            block97: {
                                                if (!var1_1.find()) break block96;
                                                var12_6 = var1_1.group(var4_8);
                                                var9_16 = var5_11 + 1;
                                                var3_4 = new StringBuilder((String)var12_6);
                                                var3_4.append("<\u5e8f\u53f7>");
                                                var3_4.append(var9_16);
                                                var12_6 = this.c0((String)var2_3, var3_4.toString());
                                                var5_11 = var2_3.indexOf("[\u5305\u542b:");
                                                if (var5_11 < 0) break block97;
                                                var3_4 = this.S(var2_3.replaceAll(".*\\[\u5305\u542b:(.*?)\\].*", "$1"));
                                                if (var3_4.isEmpty()) break block97;
                                                var3_4 = var3_4.split("#");
                                                var6_13 = ((CharSequence)var3_4).length;
                                                for (var5_11 = 0; var5_11 < var6_13; ++var5_11) {
                                                    var7_14 = var12_6.indexOf(this.g0(this.P((String)var3_4[var5_11])));
                                                    if (var7_14 < 0) {
                                                        continue;
                                                    }
                                                    break block97;
                                                }
                                                var6_13 = 0;
                                                break block109;
                                            }
                                            var6_13 = 1;
                                        }
                                        if (var6_13 == 0) break block110;
                                        var5_11 = var6_13;
                                        if (var2_3.indexOf("[\u4e0d\u5305\u542b:") < 0) break block98;
                                        var3_4 = this.S(var2_3.replaceAll(".*\\[\u4e0d\u5305\u542b:(.*?)\\].*", "$1"));
                                        var5_11 = var6_13;
                                        if (var3_4.isEmpty()) break block98;
                                        var3_4 = var3_4.split("#");
                                        var6_13 = ((CharSequence)var3_4).length;
                                        for (var5_11 = 0; var5_11 < var6_13; ++var5_11) {
                                            if (var12_6.indexOf(this.g0(this.P((String)var3_4[var5_11]))) < 0) continue;
                                            var5_11 = 0;
                                            break block98;
                                        }
                                        var5_11 = 1;
                                    }
                                    if (var5_11 != 0) ** GOTO lbl290
                                }
                                var14_7.add("\u4e0d\u8981");
                                break block99;
lbl290:
                                // 1 sources

                                if (var2_3.indexOf("[\u542b\u5e8f\u53f7:") < 0 || (var3_4 = var2_3.replaceAll(".*\\[\u542b\u5e8f\u53f7:(.*?)\\].*", "$1")).isEmpty()) break block100;
                                var13_5 = var3_4.split("#");
                                var10_17 = ((CharSequence)var13_5).length;
                                var5_11 = 0;
                                for (var6_13 = 0; var6_13 < var10_17; ++var6_13) {
                                    block102: {
                                        block101: {
                                            var3_4 = var13_5[var6_13];
                                            if (var3_4.indexOf("-") < 0) break block101;
                                            var3_4 = var3_4.split("-");
                                            var8_15 = Integer.parseInt((String)var3_4[0]);
                                            while (true) {
                                                var7_14 = var5_11;
                                                if (var8_15 > Integer.parseInt((String)var3_4[1])) break block102;
                                                if (var8_15 == var9_16) {
                                                    var7_14 = 1;
                                                    break block102;
                                                }
                                                ++var8_15;
                                                continue;
                                                break;
                                            }
                                        }
                                        var8_15 = var4_8;
                                        var7_14 = var5_11;
                                        if (Integer.parseInt((String)var3_4) != var9_16) break block102;
                                        var5_11 = 1;
                                        var4_8 = var8_15;
                                        break;
                                    }
                                    var5_11 = var7_14;
                                }
                            }
                            if (var5_11 == 0) {
                                while (true) {
                                    var14_7.add("\u4e0d\u8981");
                                    break block99;
                                    break;
                                }
                            }
                            var6_13 = var5_11;
                            if (var2_3.indexOf("[\u4e0d\u542b\u5e8f\u53f7:") < 0) break block103;
                            var3_4 = var2_3.replaceAll(".*\\[\u4e0d\u542b\u5e8f\u53f7:(.*?)\\].*", "$1");
                            var6_13 = var5_11;
                            if (var3_4.isEmpty()) break block103;
                            var3_4 = var3_4.split("#");
                            var10_17 = ((CharSequence)var3_4).length;
                            var5_11 = 1;
                            for (var6_13 = 0; var6_13 < var10_17; ++var6_13) {
                                block105: {
                                    block104: {
                                        var13_5 = var3_4[var6_13];
                                        if (var13_5.indexOf("-") < 0) break block104;
                                        var13_5 = var13_5.split("-");
                                        var8_15 = Integer.parseInt((String)var13_5[0]);
                                        while (true) {
                                            var7_14 = var5_11;
                                            if (var8_15 > Integer.parseInt((String)var13_5[1])) break block105;
                                            if (var8_15 == var9_16) {
                                                var7_14 = 0;
                                                break block105;
                                            }
                                            ++var8_15;
                                            continue;
                                            break;
                                        }
                                    }
                                    var7_14 = var5_11;
                                    if (Integer.parseInt((String)var13_5) != var9_16) break block105;
                                    var6_13 = 0;
                                    break block103;
                                }
                                var5_11 = var7_14;
                            }
                            var6_13 = var5_11;
                        }
                        if (var6_13 == 0) ** continue;
                        var14_7.add((String)var12_6);
                    }
                    var5_11 = var9_16;
                }
            }
            if (var14_7.isEmpty()) {
                var14_7.add("");
            }
            return var14_7;
        }
        var14_7.add((String)var13_5);
        return var14_7;
    }

    static /* synthetic */ String c(XBPQ xBPQ) {
        return xBPQ.z;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String c0(String var1_1, String var2_2) {
        block65: {
            block66: {
                var6_4 /* !! */  = var2_2;
                var8_5 = var2_2.replaceAll(".*<\u5e8f\u53f7>(.*)", "$1");
                var6_4 /* !! */  = var2_2;
                var2_2 = var2_2.replaceAll("<\u5e8f\u53f7>.*", "");
                var7_6 = var2_2;
                var6_4 /* !! */  = var2_2;
                if (var1_1.indexOf("\u66ff\u6362") < 0) break block65;
                var6_4 /* !! */  = var2_2;
                var7_6 = var1_1.replaceAll(".*\\[\u4ec5?\u66ff\u6362[:\uff1a](.*?)\\].*", "$1");
                var6_4 /* !! */  = var2_2;
                if (var7_6.indexOf("##") < 0) break block66;
                var6_4 /* !! */  = var2_2;
                return this.a0((String)var2_2, var7_6.replace("##", "&&"), "").get(0).trim();
            }
            var6_4 /* !! */  = var2_2;
            var8_5 = this.S((String)var7_6).replace("<\u5e8f\u53f7>", var8_5);
            var7_6 = var2_2;
            var6_4 /* !! */  = var2_2;
            if (var8_5.isEmpty()) break block65;
            var6_4 /* !! */  = var2_2;
            var10_7 = var8_5.split("#");
            var6_4 /* !! */  = var2_2;
            try {
                var4_8 = var10_7.length;
                var3_9 = 0;
            }
            catch (Exception var2_3) {
                if (this.m) {
                    var7_6 = new StringBuilder();
                    var7_6.append(this.G);
                    var7_6.append("\u8c03\u8bd5->\u66ff\u6362\u51fa\u9519\uff0c\u8bf7\u68c0\u67e5\uff1a");
                    var7_6.append(var1_1);
                    var7_6.append("->");
                    var7_6.append(var2_3.toString());
                    Init.show(var7_6.toString());
                }
                if ((var1_1 = this.I) != null) {
                    com.github.catvod.spider.merge.Dw.f.a(var2_3, com.github.catvod.spider.merge.ka.d.b("\u66ff\u6362tH()\u9519\u8bef\uff01-->"), (SpiderApi)var1_1);
                }
                return var6_4 /* !! */ ;
            }
            while (true) {
                block74: {
                    block70: {
                        block73: {
                            block72: {
                                block71: {
                                    block69: {
                                        block68: {
                                            block67: {
                                                var7_6 = var2_2;
                                                if (var3_9 >= var4_8) break;
                                                var6_4 /* !! */  = var2_2;
                                                var8_5 = this.P(var10_7[var3_9]);
                                                var6_4 /* !! */  = var2_2;
                                                var5_10 = var8_5.endsWith(">>");
                                                var7_6 = var8_5;
                                                if (!var5_10) break block67;
                                                var6_4 /* !! */  = var2_2;
                                                var6_4 /* !! */  = var2_2;
                                                var7_6 = new StringBuilder();
                                                var6_4 /* !! */  = var2_2;
                                                var7_6.append((String)var8_5);
                                                var6_4 /* !! */  = var2_2;
                                                var7_6.append("\u7a7a");
                                                var6_4 /* !! */  = var2_2;
                                                var7_6 = var7_6.toString();
                                            }
                                            var6_4 /* !! */  = var2_2;
                                            if (var7_6.indexOf(">>>") >= 0) break block68;
                                            var6_4 /* !! */  = var2_2;
                                            var8_5 = var7_6.split(">>")[0];
                                            var6_4 /* !! */  = var2_2;
                                            var7_6 = var7_6.split(">>")[1];
                                            break block69;
                                        }
                                        var6_4 /* !! */  = var2_2;
                                        var6_4 /* !! */  = var2_2;
                                        var8_5 = new StringBuilder();
                                        var6_4 /* !! */  = var2_2;
                                        var8_5.append(var7_6.split(">>>")[0]);
                                        var6_4 /* !! */  = var2_2;
                                        var8_5.append(">");
                                        var6_4 /* !! */  = var2_2;
                                        var8_5 = var8_5.toString();
                                        var6_4 /* !! */  = var2_2;
                                        var7_6 = var7_6.split(">>>")[1];
                                    }
                                    var6_4 /* !! */  = var2_2;
                                    var9_11 = this.h0((String)var7_6);
                                    var6_4 /* !! */  = var2_2;
                                    if (var8_5.indexOf("*") < 0) break block70;
                                    var6_4 /* !! */  = var2_2;
                                    if (var9_11.length() <= 0) break block70;
                                    var7_6 = var9_11;
                                    var6_4 /* !! */  = var2_2;
                                    if (var9_11.equals("\u7a7a")) {
                                        var7_6 = "";
                                    }
                                    var6_4 /* !! */  = var2_2;
                                    var5_10 = var8_5.startsWith("*");
                                    if (!var5_10) break block71;
                                    var6_4 /* !! */  = var2_2;
                                    var9_11 = this.g0(var8_5.substring(1, var8_5.length()));
                                    var6_4 /* !! */  = var2_2;
                                    var6_4 /* !! */  = var2_2;
                                    var8_5 = new StringBuilder();
                                    var6_4 /* !! */  = var2_2;
                                    var8_5.append("[\\S\\s]*?");
                                    var6_4 /* !! */  = var2_2;
                                    var8_5.append(this.j(var9_11));
lbl125:
                                    // 2 sources

                                    while (true) {
                                        var6_4 /* !! */  = var2_2;
                                        var9_11 = var8_5.toString();
                                        var8_5 = var7_6;
                                        var7_6 = var9_11;
                                        break block72;
                                        break;
                                    }
                                }
                                var6_4 /* !! */  = var2_2;
                                if (!var8_5.endsWith("*")) break block73;
                                var6_4 /* !! */  = var2_2;
                                var9_11 = this.g0(var8_5.substring(0, var8_5.length() - 1));
                                var6_4 /* !! */  = var2_2;
                                var6_4 /* !! */  = var2_2;
                                var8_5 = new StringBuilder();
                                var6_4 /* !! */  = var2_2;
                                var8_5.append(this.j(var9_11));
                                var6_4 /* !! */  = var2_2;
                                var8_5.append("[\\S\\s]*");
                                ** continue;
                            }
lbl153:
                            // 3 sources

                            while (true) {
                                var6_4 /* !! */  = var2_2;
                                var7_6 = var2_2.replaceAll((String)var7_6, (String)var8_5);
                                break block74;
                                break;
                            }
                        }
                        var6_4 /* !! */  = var2_2;
                        var9_11 = this.g0(var8_5.split("\\*")[0]);
                        var6_4 /* !! */  = var2_2;
                        var11_12 = this.g0(var8_5.split("\\*")[1]);
                        var6_4 /* !! */  = var2_2;
                        var6_4 /* !! */  = var2_2;
                        var8_5 = new StringBuilder();
                        var6_4 /* !! */  = var2_2;
                        var8_5.append(this.j(var9_11));
                        var6_4 /* !! */  = var2_2;
                        var8_5.append("[\\S\\s]*?");
                        var6_4 /* !! */  = var2_2;
                        var8_5.append(this.j(var11_12));
                        var6_4 /* !! */  = var2_2;
                        var9_11 = var8_5.toString();
                        var8_5 = var7_6;
                        var7_6 = var9_11;
                        ** GOTO lbl153
                    }
                    var7_6 = var2_2;
                    var6_4 /* !! */  = var2_2;
                    if (var9_11.length() <= 0) break block74;
                    var6_4 /* !! */  = var2_2;
                    if (var8_5.equals("\u7a7a")) {
                        return var9_11;
                    }
                    var7_6 = var9_11;
                    var6_4 /* !! */  = var2_2;
                    if (var9_11.equals("\u7a7a")) {
                        var7_6 = "";
                    }
                    var6_4 /* !! */  = var2_2;
                    var9_11 = this.j(this.g0((String)var8_5));
                    var8_5 = var7_6;
                    var7_6 = var9_11;
                    ** continue;
                }
                ++var3_9;
                var2_2 = var7_6;
            }
        }
        return var7_6;
    }

    static /* synthetic */ String d(XBPQ xBPQ, String string) {
        xBPQ.z = string;
        return string;
    }

    private ArrayList<String> d0(String string, String string2, String string3) {
        block28: {
            ArrayList<String> arrayList;
            block31: {
                String string4;
                block30: {
                    int n2;
                    block29: {
                        arrayList = new ArrayList<String>();
                        if (string2.indexOf("Base64") < 0) break block28;
                        String string5 = string2.indexOf("B[") >= 0 ? string2.replaceAll(".*B\\[(.*?)\\].*", "$1").replace("##", "&&") : "";
                        string4 = string5;
                        if (string5 != null) {
                            string4 = string5;
                            if (string5.indexOf("\u66ff\u6362") > 0) {
                                string4 = com.github.catvod.spider.merge.dp.n.a(string5, "]");
                            }
                        }
                        if ((string5 = string2.replaceAll(".*Base64\\((.*?)\\).*", "$1")).matches(".*,\\d")) {
                            n2 = Integer.parseInt(string5.substring(string5.length() - 1, string5.length()));
                            string5 = string5.substring(0, string5.length() - 2);
                        } else {
                            n2 = 1;
                        }
                        if (string5.isEmpty()) break block29;
                        if (n2 == 2) {
                            String string6;
                            string2 = string6 = new String(Base64.decode((String)this.b0(string, string5, string3).get(0).trim(), (int)1));
                            if (this.m) {
                                Init.show("Base64.NO_PADDING\u6a21\u5f0f");
                                string2 = string6;
                            }
                        } else if (n2 == 3) {
                            string2 = new String(Base64.decode((String)this.b0(string, string5, string3).get(0).trim(), (int)2));
                            if (this.m) {
                                Init.show("Base64.NO_WRAP\u6a21\u5f0f");
                            }
                        } else if (n2 == 4) {
                            String string7;
                            string2 = string7 = new String(Base64.decode((String)this.b0(string, string5, string3).get(0).trim(), (int)8));
                            if (this.m) {
                                Init.show("Base64.URL_SAFE\u6a21\u5f0f");
                                string2 = string7;
                            }
                        } else {
                            string2 = "";
                        }
                        if (n2 == 1) {
                            string2 = new String(Base64.decode((String)this.b0(string, string5, string3).get(0).trim(), (int)0));
                        }
                        string3 = string2;
                        if (string4.indexOf("&&") >= 0) break block30;
                        string3 = string2;
                        if (string4.indexOf("\u66ff\u6362") <= 0) break block31;
                        string3 = string2;
                        break block30;
                    }
                    if (n2 == 2) {
                        string = string2 = new String(Base64.decode((String)string, (int)1));
                        if (this.m) {
                            Init.show("Base64.NO_PADDING\u6a21\u5f0f");
                            string = string2;
                        }
                    } else if (n2 == 3) {
                        string = string2 = new String(Base64.decode((String)string, (int)2));
                        if (this.m) {
                            Init.show("Base64.NO_WRAP\u6a21\u5f0f");
                            string = string2;
                        }
                    } else if (n2 == 4) {
                        string = string2 = new String(Base64.decode((String)string, (int)8));
                        if (this.m) {
                            Init.show("Base64.URL_SAFE\u6a21\u5f0f");
                            string = string2;
                        }
                    } else {
                        string = new String(Base64.decode((String)string, (int)0));
                    }
                    string3 = string;
                    if (string4.indexOf("&&") >= 0) break block30;
                    string3 = string;
                    if (string4.indexOf("\u66ff\u6362") <= 0) break block31;
                    string3 = string;
                }
                string3 = this.b0(string3, string4, "").get(0).trim();
            }
            arrayList.add(string3);
            return arrayList;
        }
        return this.b0(string, string2, string3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject e(String var1_1, String var2_4, boolean var3_5, HashMap<String, String> var4_6) {
        block31: {
            block30: {
                this.x = "";
                var7_7 = this.w.length() < 1 ? this.A((String)var1_1, (String)var2_4, var3_5, (HashMap<String, String>)var4_6) : null;
                var6_8 = new JSONArray();
                if (var7_7 != null) {
                    var6_8 = var7_7.getJSONArray("list");
                }
                var5_9 = var6_8.length();
                var8_10 /* !! */  = var7_7;
                if (var5_9 < 1) {
                    var8_10 /* !! */  = var7_7;
                    if (!"<div&&</div>".equals(this.w)) {
                        if (this.w.length() < 1) {
                            if ("\u641c\u7d22".equals(this.r) && this.s.indexOf("k0") >= 0) {
                                this.s = this.s.replace("k0", "");
                            }
                            if (this.s.indexOf("c") < 0) {
                                var7_7 = new StringBuilder();
                                var7_7.append(this.s);
                                var7_7.append("c");
                                this.s = var7_7.toString();
                            }
                            if ((var7_7 = this.I) != null) {
                                var7_7.log("\u81ea\u52a8\u6a21\u5f0f<li>\u672a\u622a\u53d6\u5230\u6570\u636e\uff0c\u5c1d\u8bd5\u7528<a>\u518d\u622a\u53d6\u4e00\u6b21");
                            }
                            this.w = "<a&&</a>";
                        }
                        var8_10 /* !! */  = this.A((String)var1_1, (String)var2_4, var3_5, (HashMap<String, String>)var4_6);
                    }
                }
                var7_7 = var6_8;
                if (var8_10 /* !! */  != null) {
                    var7_7 = var6_8;
                    if (var6_8.length() < 1) {
                        var7_7 = var8_10 /* !! */ .getJSONArray("list");
                    }
                }
                if (var7_7.length() < 1) {
                    if (!"<div&&</div>".equals(this.w)) {
                        var6_8 = this.I;
                        if (var6_8 != null) {
                            var6_8.log("\u81ea\u52a8\u6a21\u5f0f<a>\u672a\u622a\u53d6\u5230\u6570\u636e\uff0c\u5c1d\u8bd5\u7528<div>\u518d\u622a\u53d6\u4e00\u6b21");
                        }
                        this.w = "<div&&</div>";
                    }
                    var1_1 = this.A((String)var1_1, (String)var2_4, var3_5, (HashMap<String, String>)var4_6);
                    var8_10 /* !! */  = var1_1;
                    if ("\u641c\u7d22".equals(this.r)) {
                        this.w = "";
                        var8_10 /* !! */  = var1_1;
                    }
                }
                var1_1 = var7_7;
                if (var8_10 /* !! */  != null) {
                    var1_1 = var7_7;
                    if (var7_7.length() < 1) {
                        var1_1 = var8_10 /* !! */ .getJSONArray("list");
                    }
                }
                if (var1_1.length() < 1 && this.w.length() > 0) {
                    this.w = "";
                }
                if ((var2_4 = this.E("\u6d4f\u89c8\u5668")).length() < 1 && this.s.indexOf("L") >= 0) break block30;
                var1_1 = var2_4;
                if (!"1".equals(var2_4)) break block31;
            }
            var1_1 = this.f;
        }
        var4_6 = this.o((String)var1_1);
        if ("\u641c\u7d22".equals(this.r) || !var1_1.startsWith("http") || (var3_5 = "0".equals(this.A))) ** GOTO lbl98
        {
            catch (JSONException var1_3) {
                if (this.m) {
                    var2_4 = new StringBuilder();
                    var2_4.append(this.G);
                    var2_4.append("\u8c03\u8bd5->category\u51fa\u9519\uff1a");
                    var2_4.append(var1_3.toString());
                    Init.show(var2_4.toString());
                }
                if ((var2_4 = this.I) != null) {
                    var4_6 = com.github.catvod.spider.merge.ka.d.b("category()\u9519\u8bef\uff01-->");
                    var4_6.append(var1_3.toString());
                    var2_4.log(var4_6.toString());
                }
                this.x = "";
                return null;
            }
        }
        try {
            var2_4 = new XBPQa(this, (String)var1_1, (String)var4_6);
            Init.run((Runnable)var2_4, 200);
            if (!"0".equals(this.A)) {
                this.A = "";
            }
            ** GOTO lbl98
        }
        catch (Exception var1_2) {
            if (this.m) {
                var2_4 = new StringBuilder();
                var2_4.append(this.G);
                var2_4.append("\u8c03\u8bd5->\u5185\u7f6e\u6d4f\u89c8\u5668\u8fd0\u884c\u51fa\u9519\uff1a");
                var2_4.append(var1_2.toString());
                Init.show(var2_4.toString());
            }
            if ((var2_4 = this.I) != null) {
                var4_6 = new StringBuilder();
                var4_6.append("\u5185\u7f6e\u6d4f\u89c8\u5668\u8fd0\u884c()\u9519\u8bef\uff01-->");
                var4_6.append(var1_2.toString());
                var2_4.log(var4_6.toString());
            }
lbl98:
            // 5 sources

            this.x = "";
            return var8_10 /* !! */ ;
        }
    }

    private ArrayList<String> e0(String string, String string2, String string3) {
        block9: {
            ArrayList<String> arrayList;
            block12: {
                String string4;
                block11: {
                    block10: {
                        arrayList = new ArrayList<String>();
                        if (string2.indexOf("urlDecode") < 0) break block9;
                        String string5 = string2.indexOf("B[") >= 0 ? string2.replaceAll(".*(B\\[.*?\\]).*", "$1") : "";
                        CharSequence charSequence = string2.indexOf("D[") >= 0 ? string2.replaceAll(".*D\\[(.*?)\\].*", "$1").replace("##", "&&") : "";
                        string4 = charSequence;
                        if (charSequence != null) {
                            string4 = charSequence;
                            if (((String)charSequence).indexOf("\u66ff\u6362") > 0) {
                                string4 = com.github.catvod.spider.merge.dp.n.a((String)charSequence, "]");
                            }
                        }
                        if ((string2 = string2.replaceAll(".*urlDecode\\((.*?)\\).*", "$1")).isEmpty()) break block10;
                        if (string2.indexOf("Base64") >= 0) {
                            if (string5 != null && string5.length() >= 1) {
                                charSequence = new StringBuilder();
                                ((StringBuilder)charSequence).append(string2);
                                ((StringBuilder)charSequence).append(")");
                                ((StringBuilder)charSequence).append(string5);
                                string2 = ((StringBuilder)charSequence).toString();
                            } else {
                                string2 = com.github.catvod.spider.merge.dp.n.a(string2, ")");
                            }
                        }
                        string = string2 = URLDecoder.decode(this.d0(string, string2, string3).get(0).trim());
                        if (string4.indexOf("&&") >= 0) break block11;
                        string = string2;
                        if (string4.indexOf("\u66ff\u6362") <= 0) break block12;
                        string = string2;
                        break block11;
                    }
                    string = string2 = URLDecoder.decode(string);
                    if (string4.indexOf("&&") >= 0) break block11;
                    string = string2;
                    if (string4.indexOf("\u66ff\u6362") <= 0) break block12;
                    string = string2;
                }
                string = this.b0(string, string4, "").get(0).trim();
            }
            arrayList.add(string);
            return arrayList;
        }
        return this.d0(string, string2, string3);
    }

    private String fixCover(String string, String string2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("proxy://do=xbpq&site=");
            stringBuilder.append(string2);
            stringBuilder.append("&pic=");
            stringBuilder.append(string);
            stringBuilder.append("&sourcekey=");
            stringBuilder.append(this.E("\u6307\u5b9a\u4ee3\u7406"));
            string2 = stringBuilder.toString();
            return string2;
        }
        catch (Exception exception) {
            Object object;
            if (this.m) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.G);
                ((StringBuilder)object).append("\u8c03\u8bd5->fixCover\u51fa\u9519\uff1a");
                ((StringBuilder)object).append(((Object)exception).toString());
                Init.show(((StringBuilder)object).toString());
            }
            if ((object = this.I) != null) {
                com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("fixCover()\u9519\u8bef-->"), (SpiderApi)object);
            }
            return string;
        }
    }

    private String g(String string) {
        String string2;
        block6: {
            String string3;
            String string4;
            block9: {
                block8: {
                    block7: {
                        string2 = string4 = "";
                        if (string == null) break block6;
                        if (string.length() >= 1) break block7;
                        string2 = string4;
                        break block6;
                    }
                    string3 = string.trim();
                    if (string3.startsWith("\uff1a")) break block8;
                    string = string3;
                    if (!string3.startsWith(":")) break block9;
                }
                string = string3.substring(1, string3.length());
            }
            while (true) {
                string3 = string;
                if (!string.startsWith("/")) break;
                string = string.substring(1, string.length()).trim();
            }
            while (string3.endsWith("/")) {
                string3 = string3.substring(0, string3.length() - 1).trim();
            }
            string2 = string4;
            if (!"\u672a\u77e5".equals(string3)) {
                string2 = "\u5185\u8be6".equals(string3) ? string4 : string3;
            }
        }
        return string2;
    }

    private String g0(String string) {
        String string2 = string;
        if (string.indexOf("\u8f6c\u4e49\u661f\u53f7") >= 0) {
            string2 = string.replace("\u8f6c\u4e49\u661f\u53f7", "*");
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONArray h(String charSequence, String charSequence2, String string, String string2, String string3, String string4, String string5) {
        String string6 = "\u65f6\u957f";
        try {
            JSONArray jSONArray;
            block58: {
                block57: {
                    int n2;
                    block56: {
                        block55: {
                            block54: {
                                block53: {
                                    block52: {
                                        block51: {
                                            block50: {
                                                block49: {
                                                    block48: {
                                                        block47: {
                                                            block46: {
                                                                block45: {
                                                                    block44: {
                                                                        block43: {
                                                                            block42: {
                                                                                block41: {
                                                                                    block40: {
                                                                                        block39: {
                                                                                            jSONArray = new JSONArray();
                                                                                            n2 = ((String)charSequence).indexOf("$");
                                                                                            if (n2 < 0) break block39;
                                                                                            charSequence = this.D("cateId", "\u7c7b\u578b", (String)charSequence, "");
                                                                                            break block40;
                                                                                        }
                                                                                        if (((String)charSequence).indexOf("&") < 0) break block41;
                                                                                        charSequence = this.D("cateId", "\u7c7b\u578b", (String)charSequence, this.G("\u7c7b\u578b\u503c", "\u7b5b\u9009\u5b50\u5206\u7c7b\u66ff\u6362\u8bcd", ""));
                                                                                    }
                                                                                    jSONArray.put((Object)charSequence);
                                                                                }
                                                                                if ((n2 = ((String)charSequence2).indexOf("$")) < 0) break block42;
                                                                                charSequence = this.D("class", "\u5267\u60c5", (String)charSequence2, "");
                                                                                break block43;
                                                                            }
                                                                            if (((String)charSequence2).indexOf("&") < 0) break block44;
                                                                            charSequence = this.D("class", "\u5267\u60c5", (String)charSequence2, this.G("\u5267\u60c5\u503c", "\u7b5b\u9009\u7c7b\u578b\u66ff\u6362\u8bcd", ""));
                                                                        }
                                                                        jSONArray.put((Object)charSequence);
                                                                    }
                                                                    if ((n2 = string.indexOf("$")) < 0) break block45;
                                                                    charSequence = this.D("area", "\u5730\u533a", string, "");
                                                                    break block46;
                                                                }
                                                                if (string.indexOf("&") < 0) break block47;
                                                                charSequence = this.D("area", "\u5730\u533a", string, this.G("\u5730\u533a\u503c", "\u7b5b\u9009\u5730\u533a\u66ff\u6362\u8bcd", ""));
                                                            }
                                                            jSONArray.put((Object)charSequence);
                                                        }
                                                        if ((n2 = string2.indexOf("$")) < 0) break block48;
                                                        charSequence = this.D("lang", "\u8bed\u8a00", string2, "");
                                                        break block49;
                                                    }
                                                    if (string2.indexOf("&") < 0) break block50;
                                                    charSequence = this.D("lang", "\u8bed\u8a00", string2, this.G("\u8bed\u8a00\u503c", "\u7b5b\u9009\u8bed\u8a00\u66ff\u6362\u8bcd", ""));
                                                }
                                                jSONArray.put((Object)charSequence);
                                            }
                                            if (string3.indexOf("-") < 0 || string3.indexOf("--") >= 0) {
                                                charSequence = string3;
                                            } else {
                                                int n3 = Integer.parseInt(string3.split("-")[1]);
                                                int n4 = Integer.parseInt(string3.split("-")[0]);
                                                n2 = n3;
                                                int n5 = n4;
                                                if (n4 > n3) {
                                                    n5 = n3;
                                                    n2 = n4;
                                                }
                                                charSequence = new StringBuilder();
                                                while (n2 >= n5) {
                                                    if (n2 == n5) {
                                                        ((StringBuilder)charSequence).append(String.valueOf(n2));
                                                    } else {
                                                        ((StringBuilder)charSequence).append(String.valueOf(n2));
                                                        ((StringBuilder)charSequence).append("&");
                                                    }
                                                    --n2;
                                                }
                                                charSequence = ((StringBuilder)charSequence).toString();
                                            }
                                            charSequence2 = this.E("\u65f6\u957f").length() > 0 ? string6 : "\u5e74\u4efd";
                                            n2 = ((String)charSequence).indexOf("$");
                                            if (n2 < 0) break block51;
                                            charSequence = this.D("year", (String)charSequence2, (String)charSequence, "");
                                            break block52;
                                        }
                                        if (((String)charSequence).indexOf("&") < 0) break block53;
                                        charSequence = this.D("year", (String)charSequence2, (String)charSequence, this.H("\u5e74\u4efd\u503c", "\u65f6\u957f\u503c", "\u7b5b\u9009\u5e74\u4efd\u66ff\u6362\u8bcd", ""));
                                    }
                                    jSONArray.put((Object)charSequence);
                                }
                                if ((n2 = string4.indexOf("$")) < 0) break block54;
                                charSequence = this.D("letter", "\u5b57\u6bcd", string4, "");
                                break block55;
                            }
                            if (string4.indexOf("&") < 0) break block56;
                            charSequence = this.D("letter", "\u5b57\u6bcd", string4, this.G("\u5b57\u6bcd\u503c", "\u7b5b\u9009\u5b57\u6bcd\u66ff\u6362\u8bcd", ""));
                        }
                        jSONArray.put((Object)charSequence);
                    }
                    charSequence = "";
                    n2 = string5.indexOf("$");
                    if (n2 >= 0) break block57;
                    if (string5.indexOf("&") < 0) break block58;
                    charSequence = this.G("\u6392\u5e8f\u503c", "\u7b5b\u9009\u6392\u5e8f\u66ff\u6362\u8bcd", "");
                }
                charSequence = this.D("by", "\u6392\u5e8f", string5, (String)charSequence);
                jSONArray.put((Object)charSequence);
            }
            return jSONArray;
        }
        catch (Exception exception) {
            if (this.m) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(this.G);
                ((StringBuilder)charSequence2).append("\u8c03\u8bd5->creatFilter\u51fa\u9519\uff1a");
                ((StringBuilder)charSequence2).append(((Object)exception).toString());
                Init.show(((StringBuilder)charSequence2).toString());
            }
            if ((charSequence2 = this.I) != null) {
                com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("creatFilter()\u9519\u8bef-->"), (SpiderApi)charSequence2);
            }
            return null;
        }
    }

    private String h0(String object) {
        block8: {
            try {
                if (((String)object).length() >= 0) break block8;
                return "";
            }
            catch (Exception exception) {
                Object object2;
                if (this.m) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(this.G);
                    ((StringBuilder)object2).append("\u8c03\u8bd5->\u66ff\u6362\u622a\u53d6\u51fa\u9519\uff1a");
                    ((StringBuilder)object2).append(((Object)exception).toString());
                    Init.show(((StringBuilder)object2).toString());
                }
                if ((object2 = this.I) != null) {
                    com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("\u66ff\u6362\u622a\u53d6xhSubCut()\u9519\u8bef\uff01-->"), (SpiderApi)object2);
                }
                return "";
            }
        }
        if (((String)object).indexOf("*") < 0) {
            return this.g0((String)object);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.j(this.g0(((String)object).split("\\*")[0])));
        stringBuilder.append("([\\S\\s]*?)");
        stringBuilder.append(this.j(this.g0(((String)object).split("\\*")[1])));
        object = Pattern.compile(stringBuilder.toString()).matcher(this.x);
        if (((Matcher)object).find()) {
            return ((Matcher)object).group(1).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
        }
        if (this.m) {
            Init.show("\u66ff\u6362\u672a\u83b7\u53d6\u5230\u6709\u6548\u622a\u53d6\u5185\u5bb9");
        }
        return "";
    }

    private String i(String object) {
        CharSequence charSequence;
        String string;
        HashMap<String, String> hashMap;
        block16: {
            block15: {
                XBPQ$3 xBPQ$3 = new XBPQ$3();
                hashMap = this.s;
                int n2 = ((String)object).indexOf(";post");
                string = "";
                charSequence = n2 > 0 ? ((String)object).split(";post;")[1].trim() : "";
                String[] stringArray = ((String)object).split(";")[0];
                if (this.s.indexOf("J") >= 0 && stringArray.indexOf("outerHTML") < 0 && stringArray.indexOf("innerHTML") < 0 && this.I != null) {
                    object = this.s.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML";
                    hashMap = ((String)((Object)hashMap)).matches(".*Jb?\\d+.*") ? ((String)((Object)hashMap)).replaceAll(".*Jb?(\\d+).*", "$1") : "";
                    StringBuilder charSequence2 = new StringBuilder();
                    charSequence2.append(this.I.getAddress(true));
                    charSequence2.append("webparse/");
                    charSequence2.append((String)stringArray);
                    charSequence2.append("<<eval");
                    charSequence2.append((String)((Object)hashMap));
                    charSequence2.append((String)object);
                    hashMap = charSequence2.toString();
                    SpiderApi spiderApi = this.I;
                    object = hashMap;
                    if (spiderApi != null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("\u6b63\u5728\u4f7f\u7528\u4ee3\u7406--> ");
                        ((StringBuilder)object).append((String)((Object)hashMap));
                        spiderApi.log(((StringBuilder)object).toString());
                        object = hashMap;
                    }
                } else {
                    object = stringArray;
                }
                hashMap = !"\u641c\u7d22".equals(this.r) ? this.t((String)stringArray) : this.L((String)stringArray);
                if (((String)charSequence).length() > 2) {
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
                    for (String string2 : ((String)charSequence).split("\\&")) {
                        if (string2.endsWith("=")) continue;
                        int n3 = string2.indexOf("=");
                        ((AbstractMap)linkedHashMap).put(string2.substring(0, n3), string2.substring(n3 + 1));
                    }
                    if (!((String)charSequence).isEmpty()) {
                        com.github.catvod.spider.merge.mk.g.e(com.github.catvod.spider.merge.mk.g.b(), (String)object, linkedHashMap, (Map<String, String>)hashMap, xBPQ$3);
                    } else {
                        com.github.catvod.spider.merge.mk.g.e(com.github.catvod.spider.merge.mk.g.b(), (String)object, null, (Map<String, String>)hashMap, xBPQ$3);
                    }
                } else {
                    com.github.catvod.spider.merge.mk.g.c(com.github.catvod.spider.merge.mk.g.b(), (String)object, hashMap, xBPQ$3);
                }
                try {
                    hashMap = (HashMap<String, String>)((Response)xBPQ$3.getResult()).body().bytes();
                    if (this.s.indexOf("g") < 0) break block15;
                    object = "GBK";
                    break block16;
                }
                catch (IOException iOException) {
                    if (this.m) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(this.G);
                        ((StringBuilder)charSequence).append("\u8c03\u8bd5->deEnCode\u51fa\u9519\uff1a");
                        ((StringBuilder)charSequence).append(((Object)iOException).toString());
                        Init.show(((StringBuilder)charSequence).toString());
                    }
                    if ((charSequence = this.I) != null) {
                        hashMap = com.github.catvod.spider.merge.ka.d.b("deEnCode()\u9519\u8bef-->");
                        ((StringBuilder)((Object)hashMap)).append(((Object)iOException).toString());
                        charSequence.log(((StringBuilder)((Object)hashMap)).toString());
                    }
                    return "";
                }
            }
            object = this.H("\u7f16\u7801", "\u7f51\u9875\u7f16\u7801\u683c\u5f0f", "Coding_format", "UTF-8");
        }
        charSequence = string;
        if (hashMap != null) {
            charSequence = new String((byte[])hashMap, (String)object);
        }
        return charSequence;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object[] loadPic(Map<String, String> object) {
        block5: {
            XBPQ$7 xBPQ$7;
            String string;
            Object object2;
            block6: {
                try {
                    object2 = (String)object.get("site");
                    string = (String)object.get("pic");
                    if (L == null) {
                        object = new HashMap();
                        L = object;
                        ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                        L.put("referer", (String)object2);
                    }
                    xBPQ$7 = new XBPQ$7();
                    com.github.catvod.spider.merge.mk.g.c(com.github.catvod.spider.merge.mk.g.b(), string, L, xBPQ$7);
                    if (((Response)xBPQ$7.getResult()).code() != 200) break block5;
                    object = object2 = ((Response)xBPQ$7.getResult()).headers().get("Content-Type");
                    if (object2 != null) break block6;
                    object = "application/octet-stream";
                }
                catch (Throwable throwable) {
                    return null;
                }
            }
            System.out.println(string);
            System.out.println((String)object);
            object2 = ((Response)xBPQ$7.getResult()).body().byteStream();
            return new Object[]{200, object, object2};
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private String m() {
        block156: {
            block133: {
                block154: {
                    block155: {
                        block145: {
                            block157: {
                                block142: {
                                    block141: {
                                        block144: {
                                            block143: {
                                                block140: {
                                                    block139: {
                                                        block138: {
                                                            block134: {
                                                                block136: {
                                                                    block135: {
                                                                        block132: {
                                                                            block131: {
                                                                                if (this.c.length() >= 3) break block156;
                                                                                var10_1 = "/";
                                                                                var4_2 = this.E("\u5206\u7c7b");
                                                                                var3_6 = this.E("\u4e3b\u9875url");
                                                                                var9_7 = "http";
                                                                                var5_8 = this.g;
                                                                                if (var5_8 == null) break block131;
                                                                                var3_6 = var3_6.replace((CharSequence)var5_8, this.f);
                                                                            }
                                                                            var11_9 = "/@href";
                                                                            if (var4_2.indexOf("$") < 0) break block132;
                                                                            var3_6 = "\\s";
                                                                            break block133;
                                                                        }
                                                                        var1_10 = this.E("\u5206\u7c7b\u6570\u7ec4").indexOf("&&");
                                                                        var13_11 = "\u76f4\u64ad";
                                                                        var12_12 = "\u5206\u7c7b\u6807\u9898";
                                                                        var8_13 = "\\s";
                                                                        if (var1_10 < 0) break block134;
                                                                        var6_14 = var8_13;
                                                                        if (this.E("\u5206\u7c7b\u6570\u7ec4").startsWith("//")) break block134;
                                                                        var6_14 = var8_13;
                                                                        var4_2 = this.k((String)var3_6);
                                                                        var6_14 = var8_13;
                                                                        if (this.E("\u5206\u7c7b\u4e8c\u6b21\u622a\u53d6").isEmpty()) break block135;
                                                                        var6_14 = var8_13;
                                                                        var3_6 = this.a0((String)var4_2, this.E("\u5206\u7c7b\u4e8c\u6b21\u622a\u53d6"), "").get(0);
                                                                        break block136;
                                                                    }
                                                                    var3_6 = var4_2;
                                                                }
                                                                var6_14 = var8_13;
                                                                if (!var3_6.isEmpty()) {
                                                                    var4_2 = var3_6;
                                                                }
                                                                var6_14 = var8_13;
                                                                var4_2 = this.a0((String)var4_2, this.E("\u5206\u7c7b\u6570\u7ec4"), "");
                                                                var6_14 = var8_13;
                                                                var6_14 = var8_13;
                                                                var3_6 = new StringBuilder();
                                                                var1_10 = 0;
                                                                while (true) {
                                                                    block137: {
                                                                        var6_14 = var8_13;
                                                                        if (var1_10 >= var4_2.size()) break;
                                                                        var6_14 = var8_13;
                                                                        if (((String)var4_2.get(var1_10)).equals("\u4e0d\u8981")) break block137;
                                                                        var6_14 = var8_13;
                                                                        var6_14 = var8_13;
                                                                        var5_8 = new StringBuilder();
                                                                        var6_14 = var8_13;
                                                                        var5_8.append((String)var4_2.get(var1_10));
                                                                        var6_14 = var8_13;
                                                                        var5_8.append("</a>");
                                                                        var6_14 = var8_13;
                                                                        var5_8 = this.a0(var5_8.toString(), this.E("\u5206\u7c7b\u6807\u9898"), ">&&</a>").get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
                                                                        var6_14 = var8_13;
                                                                        var7_15 = this.a0((String)var4_2.get(var1_10), this.E("\u5206\u7c7bID"), "href=\"&&\"").get(0);
                                                                        var6_14 = var8_13;
                                                                        if (var5_8.equals("\u4e0d\u8981")) break block137;
                                                                        var6_14 = var8_13;
                                                                        if (var5_8.isEmpty()) break block137;
                                                                        var6_14 = var8_13;
                                                                        if (var7_15.isEmpty()) break block137;
                                                                        var6_14 = var8_13;
                                                                        var3_6.append((String)var5_8);
                                                                        var6_14 = var8_13;
                                                                        var3_6.append("$");
                                                                        var6_14 = var8_13;
                                                                        var3_6.append(var7_15);
                                                                        var6_14 = var8_13;
                                                                        var3_6.append("#");
                                                                    }
                                                                    ++var1_10;
                                                                }
                                                                var6_14 = var8_13;
                                                                var3_6 = var3_6.toString().substring(0, var3_6.toString().length() - 1);
                                                                break block138;
                                                            }
                                                            var6_14 = var8_13;
                                                            var6_14 = var8_13;
                                                            var15_17 = new StringBuilder();
                                                            var6_14 = var8_13;
                                                            if (this.E("cateManual").isEmpty()) break block139;
                                                            var6_14 = var8_13;
                                                            var5_8 = this.B.optJSONObject("cateManual");
                                                            if (var5_8 == null) break block139;
                                                            var6_14 = var8_13;
                                                            var4_2 = var5_8.keys();
                                                            while (true) {
                                                                var6_14 = var8_13;
                                                                if (!var4_2.hasNext()) break;
                                                                var6_14 = var8_13;
                                                                var3_6 = (String)var4_2.next();
                                                                var6_14 = var8_13;
                                                                var15_17.append(var3_6.trim());
                                                                var6_14 = var8_13;
                                                                var15_17.append("$");
                                                                var6_14 = var8_13;
                                                                var15_17.append(var5_8.getString((String)var3_6).trim());
                                                                var6_14 = var8_13;
                                                                var15_17.append("#");
                                                                continue;
                                                                break;
                                                            }
                                                            var6_14 = var8_13;
                                                            var3_6 = var15_17.toString().substring(0, var15_17.toString().length() - 1);
                                                        }
                                                        var4_2 = var3_6;
                                                        var3_6 = "\\s";
                                                        break block133;
                                                    }
                                                    var6_14 = var8_13;
                                                    var14_18 = this.i0((String)var3_6);
                                                    var5_8 = var4_2;
                                                    var6_14 = var8_13;
                                                    if (var4_2.length() >= 1) break block140;
                                                    var5_8 = var4_2;
                                                    var6_14 = var8_13;
                                                    if (!this.E("\u5206\u7c7b\u6570\u7ec4").startsWith("//")) break block140;
                                                    var6_14 = var8_13;
                                                    var5_8 = this.E("\u5206\u7c7b\u6570\u7ec4");
                                                }
                                                var7_16 = "ul";
                                                var4_2 = "a";
                                                var6_14 = var8_13;
                                                if (var5_8.length() < 1) {
                                                    var3_6 = "";
                                                    var5_8 = var7_16;
                                                    break block141;
                                                }
                                                var6_14 = var8_13;
                                                if (var5_8.startsWith("//")) break block142;
                                                var6_14 = var8_13;
                                                if (var5_8.indexOf("\\.") < 0) break block142;
                                                var6_14 = var8_13;
                                                if (var5_8.split("\\.")[0].indexOf("[") < 0) break block143;
                                                var6_14 = var8_13;
                                                var7_16 = var5_8.split("\\.")[0].split("\\[")[0];
                                                var6_14 = var8_13;
                                                var6_14 = var8_13;
                                                var3_6 = new StringBuilder();
                                                var6_14 = var8_13;
                                                var3_6.append("[");
                                                var6_14 = var8_13;
                                                var3_6.append(var5_8.split("\\.")[0].split("\\[")[1]);
                                                var6_14 = var8_13;
                                                var3_6 = var3_6.toString();
                                                break block144;
                                            }
                                            var6_14 = var8_13;
                                            var7_16 = var5_8.split("\\.")[0];
                                            var3_6 = "";
                                        }
                                        var6_14 = var8_13;
                                        var4_2 = var5_8.split("\\.")[1];
                                        var5_8 = var7_16;
                                    }
                                    var6_14 = "\u841d\u8389";
                                    var7_16 = var5_8;
                                    var5_8 = var6_14;
                                    break block157;
                                }
                                var3_6 = "";
                            }
                            var6_14 = var8_13;
                            if (var5_8.startsWith("//")) {
                                var3_6 = var5_8;
                                break block145;
                            }
                            var6_14 = var8_13;
                            var6_14 = var8_13;
                            var16_19 = new StringBuilder();
                            var6_14 = var8_13;
                            var16_19.append("//");
                            var6_14 = var8_13;
                            var16_19.append((String)var7_16);
                            var6_14 = var8_13;
                            var16_19.append("[(contains(//text(),'");
                            var6_14 = var8_13;
                            var16_19.append((String)var5_8);
                            var6_14 = var8_13;
                            var16_19.append("') or contains(//text(),'\u8fde\u7eed\u5267') or contains(//@title,'\u9023\u7e8c\u5287') or contains(//text(),'\u7535\u89c6\u5267') or contains(//@title,'\u96fb\u8996\u5287') or contains(//text(),'\u5267\u96c6') or contains(//@title,'\u5287\u96c6') or contains(//text(),'\u7535\u5f71') or contains(//@title,'\u96fb\u5f71') or contains(//text(),'\u65e0\u7801') or contains(//@title,'\u65e0\u7801') or contains(//text(),'\u7121\u78bc') or contains(//@title,'\u7121\u78bc') or contains(//text(),'\u56fd\u4ea7') or contains(//@title,'\u570b\u7522') or contains(//text(),'\u4e9a\u6d32') or contains(//@title,'\u4e9a\u6d32') or contains(//text(),'\u4e9e\u6d32') or contains(//@title,'\u4e9e\u6d32')) and not(contains(//@data-original,'/') or contains(//@data-src,'/') or contains(//@src,'/') or contains(//@background,'/'))]");
                            var6_14 = var8_13;
                            var16_19.append((String)var3_6);
                            var6_14 = var8_13;
                            var16_19.append("//");
                            var6_14 = var8_13;
                            var16_19.append((String)var4_2);
                            var6_14 = var8_13;
                            var16_19.append("[not(contains(//text(),'\u9875') or contains(//text(),'\u8baf') or contains(//text(),'\u65b0') or contains(//text(),'\u8ffd\u5267') or contains(//text(),'\u70ed\u641c') or contains(//text(),'\u699c\u5355') or contains(//text(),'\u4f1a\u5458') or contains(//text(),'\u6392\u884c') or contains(//text(),'\u7559\u8a00') or contains(//text(),'\u79c1\u4eba') or contains(//text(),'\u5f71\u9662') or contains(//text(),'\u7f51') or contains(//text(),'\u5f71\u89c6') or contains(//text(),'\u8054\u7cfb') or contains(//text(),'\u4e13\u9898') or contains(//text(),'\u660e\u661f') or contains(//text(),'\u89d2\u8272') or contains(//text(),'\u56fe') or contains(//text(),'\u8282\u76ee') or contains(//text(),'\u97e9\u5a31') or contains(//text(),'\u6f14\u5458') or contains(//text(),'\u6587\u7ae0') or contains(//text(),'\u5176\u4ed6') or contains(//text(),'\u97f3\u4e50') or contains(//text(),'\u63a8\u8350') or contains(//text(),'APP') or contains(//text(),'\u4e0b\u8f7d'))]");
                            var6_14 = var8_13;
                            var3_6 = var16_19.toString();
                        }
                        var6_14 = var8_13;
                        var7_16 = var14_18.a((String)var3_6);
                        var1_10 = 0;
                        var3_6 = var8_13;
                        var8_13 = var13_11;
                        var4_2 = var11_9;
                        var11_9 = var7_16;
                        while (true) {
                            block148: {
                                block146: {
                                    block153: {
                                        block152: {
                                            block151: {
                                                block150: {
                                                    block149: {
                                                        block147: {
                                                            var6_14 = var3_6;
                                                            var14_18 = (LinkedList)var11_9;
                                                            var6_14 = var3_6;
                                                            if (var1_10 >= var14_18.size()) break;
                                                            var6_14 = var3_6;
                                                            var7_16 = ((com.github.catvod.spider.merge.fb.b)var14_18.get(var1_10)).c(this.G(var12_12, "cateName", "//text()")).a();
                                                            var6_14 = var7_16.replaceAll((String)var3_6, "").trim();
                                                            var13_11 = var6_14;
                                                            if (var6_14.length() < 2) {
                                                                var13_11 = ((com.github.catvod.spider.merge.fb.b)var14_18.get(var1_10)).c("/@title").a().trim();
                                                            }
                                                            if (var13_11.length() > 9 || var13_11.length() < 2 || var15_17.toString().indexOf(var13_11) >= 0) break block146;
                                                            if ((var13_11.indexOf(var8_13) < 0 || var5_8.indexOf(var8_13) >= 0) && (this.s.indexOf("!") < 0 || var13_11.indexOf("\u7406") < 0 && var13_11.indexOf("\u798f") < 0 && var13_11.indexOf("\u7f8e\u5973") < 0)) break block147;
                                                            var7_16 = var4_2;
                                                            break block148;
                                                        }
                                                        var6_14 = var7_16 = this.H("\u5206\u7c7bID", "\u5206\u7c7b\u94fe\u63a5", "cateId", (String)var4_2);
                                                        if (!var7_16.startsWith(var9_7)) break block149;
                                                        var6_14 = var4_2;
                                                    }
                                                    var7_16 = ((com.github.catvod.spider.merge.fb.b)var14_18.get(var1_10)).c((String)var6_14).a().trim();
                                                    var2_20 = var7_16.indexOf("search");
                                                    var6_14 = var4_2;
                                                    if (var2_20 < 0) break block150;
                                                    if (var15_17.toString().indexOf("\u5267") < 0 && var15_17.toString().indexOf("\u5287") < 0) ** GOTO lbl323
                                                    var7_16 = var6_14;
                                                    if (this.s.indexOf("s0") >= 0) break block148;
                                                    var7_16 = var6_14;
                                                    if (this.s.indexOf("s") < 0) break block148;
lbl323:
                                                    // 2 sources

                                                    var15_17.append(var13_11);
                                                    var15_17.append("$");
                                                    var15_17.append(var13_11);
                                                    var15_17.append("#");
                                                    var7_16 = var6_14;
                                                    break block148;
                                                }
                                                if (this.s.indexOf("s0") < 0 && this.s.indexOf("s") >= 0) {
                                                    var7_16 = var6_14;
                                                    break block148;
                                                }
                                                var4_2 = var7_16;
                                                if (var7_16.startsWith(var9_7)) {
                                                    var4_2 = var7_16.replace(this.f, "");
                                                }
                                                var7_16 = var6_14;
                                                if (var4_2.length() < 2) break block148;
                                                var7_16 = var6_14;
                                                if (var4_2.indexOf(var10_1) < 0) break block148;
                                                var7_16 = var6_14;
                                                if (var4_2.indexOf("detail") >= 0) break block148;
                                                var7_16 = var6_14;
                                                if (var4_2.indexOf("Detail") >= 0) break block148;
                                                var7_16 = var6_14;
                                                if (var4_2.indexOf("show") >= 0) break block148;
                                                if (var4_2.indexOf("play") < 0) break block151;
                                                var7_16 = var6_14;
                                                break block148;
                                            }
                                            var7_16 = var4_2.matches("/.*?[-_~/]\\d+[-_~/][10].*") != false ? var4_2.replaceAll("/.*?[/-_~/](\\d+)[[-_~/]][10].*", "$1") : var4_2;
                                            if (var7_16 == null) break block152;
                                            var14_18 = var7_16;
                                            if (var7_16.matches("\\d+")) break block153;
                                        }
                                        var7_16 = var4_2;
                                        if (var4_2.matches(".*id[-_~/=].*")) {
                                            var7_16 = new StringBuilder();
                                            var7_16.append(var10_1);
                                            var7_16.append(var4_2.split("id[-_~/=]")[1]);
                                            var7_16 = var7_16.toString();
                                        }
                                        var4_2 = var7_16;
                                        if (var7_16.endsWith(".html")) {
                                            var4_2 = var7_16.substring(0, var7_16.length() - 5);
                                        }
                                        var7_16 = var4_2;
                                        if (var4_2.endsWith("K")) {
                                            var7_16 = var4_2.substring(0, var4_2.length() - 1);
                                        }
                                        var4_2 = var7_16;
                                        if (var7_16.endsWith("/1/index")) {
                                            var4_2 = var7_16.substring(0, var7_16.length() - 6);
                                        }
                                        var7_16 = var4_2;
                                        if (var4_2.endsWith("/index")) {
                                            var7_16 = var4_2.substring(0, var4_2.length() - 6);
                                        }
                                        var4_2 = var7_16;
                                        if (var7_16.endsWith("-1")) {
                                            var4_2 = var7_16.substring(0, var7_16.length() - 2);
                                        }
                                        var7_16 = var4_2;
                                        if (var4_2.endsWith("~1")) {
                                            var7_16 = var4_2.substring(0, var4_2.length() - 2);
                                        }
                                        var4_2 = var7_16;
                                        if (!var7_16.startsWith(var9_7)) {
                                            var4_2 = var7_16.substring(var7_16.lastIndexOf(var10_1) + 1, var7_16.length());
                                        }
                                        var4_2 = var7_16 = var4_2.replace("index", "").replace("-----------", "");
                                        if (var7_16.startsWith("m-")) {
                                            var4_2 = var7_16.substring(2, var7_16.length());
                                        }
                                        var7_16 = var6_14;
                                        if (var4_2.length() < 1) break block148;
                                        var7_16 = var6_14;
                                        if (var4_2.length() > 21) break block148;
                                        var7_16 = var6_14;
                                        if (var4_2.startsWith(var9_7)) break block148;
                                        var14_18 = var4_2;
                                        if (var15_17.toString().indexOf((String)var4_2) < 0) break block153;
                                        var7_16 = var6_14;
                                        break block148;
                                    }
                                    var15_17.append(var13_11);
                                    var15_17.append("$");
                                    var15_17.append((String)var14_18);
                                    var15_17.append("#");
                                    var7_16 = var6_14;
                                    break block148;
                                }
                                var7_16 = var4_2;
                            }
                            ++var1_10;
                            var4_2 = var7_16;
                        }
                        var5_8 = var3_6;
                        try {
                            if (var15_17.toString().length() < 6) break block154;
                            var4_2 = var15_17.toString().substring(0, var15_17.toString().length() - 1);
                            var3_6 = var5_8;
                            break block133;
                        }
                        catch (Exception var4_3) {
                            break block155;
                        }
                        catch (Exception var4_4) {
                            var3_6 = var6_14;
                        }
                        break block155;
                        catch (Exception var4_5) {
                            var3_6 = "\\s";
                        }
                    }
                    if (this.m) {
                        var5_8 = new StringBuilder();
                        var5_8.append(this.G);
                        var5_8.append("\u8c03\u8bd5->createCate\u51fa\u9519\uff1a");
                        var5_8.append(var4_2.toString());
                        Init.show(var5_8.toString());
                    }
                    var6_14 = this.I;
                    var5_8 = var3_6;
                    if (var6_14 != null) {
                        com.github.catvod.spider.merge.Dw.f.a((Exception)var4_2, com.github.catvod.spider.merge.ka.d.b("createCate()\u9519\u8bef-->"), (SpiderApi)var6_14);
                        var5_8 = var3_6;
                    }
                }
                var4_2 = "\u7535\u5f71$1#\u8fde\u7eed\u5267$2#\u7efc\u827a$3#\u52a8\u6f2b$4";
                var3_6 = var5_8;
            }
            this.c = var4_2.replace("\u96fb\u5f71", "\u7535\u5f71").replace("\u9023\u7e8c\u5287", "\u8fde\u7eed\u5267").replace("\u96fb\u8996\u5287", "\u7535\u89c6\u5267").replace("\u5287\u96c6", "\u5267\u96c6").replace("\u52d5\u6f2b", "\u52a8\u6f2b").replace("\u7d9c\u85dd", "\u7efc\u827a").replaceAll((String)var3_6, "");
            if (this.I != null && this.E("\u5206\u7c7b").length() < 1) {
                var4_2 = this.I;
                var3_6 = com.github.catvod.spider.merge.ka.d.b("\u81ea\u52a8\u83b7\u53d6\u5206\u7c7b--> ");
                var3_6.append(this.c);
                var4_2.log(var3_6.toString());
            }
        }
        return this.c;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject n(String var1_1, String var2_2) {
        try {
            block28: {
                block27: {
                    block26: {
                        block25: {
                            if (var2_2.equals("post")) break block25;
                            var5_4 = var2_2;
                            if (!var2_2.equals("\u7a7a#post#\u7a7a")) break block26;
                        }
                        var2_2 = new StringBuilder();
                        var2_2.append("\u7a7a#");
                        var2_2.append(this.f);
                        var2_2.append("/index.php/ajax/verify_check?type=show&verify={code};post;#\u7a7a");
                        var5_4 = var2_2.toString();
                    }
                    var6_5 = var5_4.split("#");
                    var3_6 = var5_4.length();
                    if (var3_6 >= 1) break block27;
                    if ("\u641c\u7d22".equals(this.r)) {
                        var2_2 = new StringBuilder();
                        var2_2.append(this.f);
                        var2_2.append("/index.php/ajax/verify_check?type=search&verify=");
                    } else {
                        var2_2 = new StringBuilder();
                        var2_2.append(this.f);
                        var2_2.append("/index.php/ajax/verify_check?type=show&verify=");
                    }
                    var5_4 = var2_2.toString();
                    var2_2 = var1_1;
                    var1_1 = var5_4;
                    if (this.s.indexOf("y") >= 0) {
                        var1_1 = new StringBuilder();
                        var1_1.append(this.f);
                        var1_1.append("/index.php/verify/index.html?");
                        var2_2 = var1_1.toString();
                        var1_1 = var5_4;
                    }
                    ** GOTO lbl132
                }
                if (this.s.indexOf("y") >= 0) {
                    var1_1 = new StringBuilder();
                    var1_1.append(this.f);
                    var1_1.append("/index.php/verify/index.html?");
                    var1_1 = var1_1.toString();
                }
                if (!(var4_7 = "\u7a7a".equals(var6_5[0]))) break block28;
                var2_2 = var1_1;
                ** GOTO lbl81
            }
            if (var6_5[0].startsWith("http")) {
            }
            ** GOTO lbl-1000
        }
        catch (Exception var2_3) {
            var1_1 = this.I;
            if (var1_1 != null) {
                com.github.catvod.spider.merge.Dw.f.a(var2_3, com.github.catvod.spider.merge.ka.d.b("getCodeUrl()\u9519\u8bef-->"), (SpiderApi)var1_1);
            }
            return null;
        }
        var2_2 = var6_5[0];
        ** GOTO lbl81
lbl-1000:
        // 1 sources

        {
            if (!var6_5[0].startsWith("/")) ** GOTO lbl73
            var2_2 = new StringBuilder();
            var2_2.append(this.f);
        }
        var1_1 = var6_5[0];
lbl-1000:
        // 2 sources

        {
            while (true) {
                var2_2.append((String)var1_1);
                ** GOTO lbl-1000
                break;
            }
lbl73:
            // 1 sources

            var2_2 = new StringBuilder();
            var2_2.append(this.f);
            var2_2.append("/");
        }
        var1_1 = var6_5[0];
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var2_2 = var2_2.toString();
lbl81:
            // 3 sources

            if (!"\u641c\u7d22".equals(this.r)) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append("/index.php/ajax/verify_check?type=search&verify=");
            var1_1 = var1_1.toString();
            if ("\u7a7a".equals(var6_5[2])) ** GOTO lbl132
            if (!var6_5[2].startsWith("http")) ** GOTO lbl-1000
        }
        var1_1 = var6_5[2];
        ** GOTO lbl132
lbl-1000:
        // 1 sources

        {
            if (!var6_5[2].startsWith("/")) ** GOTO lbl101
            var5_4 = new StringBuilder();
            var5_4.append(this.f);
        }
        var1_1 = var6_5[2];
lbl-1000:
        // 4 sources

        {
            while (true) {
                var5_4.append((String)var1_1);
                ** GOTO lbl-1000
                break;
            }
lbl101:
            // 1 sources

            var5_4 = new StringBuilder();
            var5_4.append(this.f);
            var5_4.append("/");
        }
        var1_1 = var6_5[2];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append("/index.php/ajax/verify_check?type=show&verify=");
            var1_1 = var1_1.toString();
            if ("\u7a7a".equals(var6_5[1])) ** GOTO lbl132
            if (!var6_5[1].startsWith("http")) ** GOTO lbl-1000
        }
        var1_1 = var6_5[1];
        ** GOTO lbl132
lbl-1000:
        // 1 sources

        {
            if (!var6_5[1].startsWith("/")) ** GOTO lbl-1000
            var5_4 = new StringBuilder();
            var5_4.append(this.f);
        }
        var1_1 = var6_5[1];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var5_4 = new StringBuilder();
            var5_4.append(this.f);
            var5_4.append("/");
        }
        var1_1 = var6_5[1];
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var1_1 = var5_4.toString();
lbl132:
            // 6 sources

            var5_4 = new JSONObject();
            var5_4.put("str", (Object)var2_2);
            var5_4.put("codeUrl", (Object)var1_1);
            return var5_4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject p(String object, String string, String string2) {
        try {
            int n2;
            Object object2 = new Request.Builder();
            object = object2.url((String)object).addHeader("User-Agent", this.M("")).build();
            object = com.github.catvod.spider.merge.mk.g.b().newCall((Request)object).execute();
            object2 = object.headers().get("Set-Cookie");
            InputStream inputStream = object.body().byteStream();
            Object object3 = new byte[1024];
            object = new ByteArrayOutputStream();
            while ((n2 = inputStream.read((byte[])object3)) != -1) {
                ((ByteArrayOutputStream)object).write((byte[])object3, 0, n2);
            }
            object3 = Base64.encodeToString((byte[])((ByteArrayOutputStream)object).toByteArray(), (int)0).replaceAll("\\s", "");
            if (string2.equals("1")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("{\"ocr_type\":1,\"img\":\"");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append("\",\"backgroundlmg\":\"None\"}");
                object = ((StringBuilder)object).toString();
            } else {
                object = "";
            }
            if (string2.equals("3")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("{\"ocr_type\":3,\"img\":\"");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append("\"}");
                object = ((StringBuilder)object).toString();
            }
            object3 = RequestBody.create((MediaType)MediaType.parse((String)"application/json"), (String)object);
            object = new Request.Builder();
            object = object.url(string).post((RequestBody)object3).addHeader("User-Agent", this.M("")).build();
            string = com.github.catvod.spider.merge.mk.g.b().newCall((Request)object).execute();
            object = new JSONObject(string.body().string());
            string = new JSONObject();
            boolean bl = string2.equals("1");
            if (bl) {
                string.put("cookie", object2);
                string.put("code", (Object)object.getString("result"));
                return string;
            }
            if (!string2.equals("3")) return null;
            string.put("cookie", object2);
            string.put("code", (Object)object.getJSONObject("result").getString("target").replaceAll("[\\[\\]]", ""));
            return string;
        }
        catch (Exception exception) {
            object = this.I;
            if (object == null) return null;
            com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("getDatas()\u9519\u8bef-->"), (SpiderApi)object);
        }
        return null;
    }

    private String q(String string, String string2) {
        if (string.indexOf(string2) < 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        stringBuilder.append(string);
        stringBuilder.append("#");
        string = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(".*");
        stringBuilder.append(string2);
        stringBuilder.append("\\$([^#]+?)#.*");
        return string.replaceAll(stringBuilder.toString(), "$1");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private JSONObject r(String var1_1) {
        block40: {
            block45: {
                block46: {
                    block44: {
                        block43: {
                            block41: {
                                block42: {
                                    block39: {
                                        block47: {
                                            var10_3 = "";
                                            var17_4 = new JSONObject();
                                            var12_5 = this.G("\u7b80\u4ecb", "\u8be6\u60c5", "");
                                            var6_6 = this.E("\u5f71\u7247\u7c7b\u578b");
                                            var7_7 = this.E("\u5f71\u7247\u5730\u533a");
                                            var8_8 = this.E("\u5f71\u7247\u5e74\u4ee3");
                                            var5_9 = this.G("\u5f71\u7247\u72b6\u6001", "\u72b6\u6001", "");
                                            var11_10 = this.E("\u5bfc\u6f14");
                                            var9_11 /* !! */  = this.G("\u4e3b\u6f14", "\u6f14\u5458", "");
                                            var4_12 = (this.H("\u64ad\u653e\u4e8c\u6b21\u622a\u53d6", "bfjiequqian", "list_twice_pre", "").isEmpty() ^ true) != false ? this.a0((String)var1_1, this.H("\u64ad\u653e\u4e8c\u6b21\u622a\u53d6", "bfjiequqian", "list_twice_pre", ""), "").get(0) : var1_1;
                                            if (var12_5.indexOf(".") <= 0 && var9_11 /* !! */ .indexOf(".") <= 0 && var11_10.indexOf(".") <= 0 && var5_9.indexOf(".") <= 0 && var7_7.indexOf(".") <= 0 && var8_8.indexOf(".") <= 0 || var12_5.indexOf("&&") >= 0 || var9_11 /* !! */ .indexOf("&&") >= 0 || var11_10.indexOf("&&") >= 0 || var5_9.indexOf("&&") >= 0 || var7_7.indexOf("&&") >= 0 || var8_8.indexOf("&&") >= 0) break block39;
                                            if (!var4_12.startsWith("{")) ** GOTO lbl18
                                            var1_1 = var4_12;
                                            if (var4_12.endsWith("}")) break block47;
lbl18:
                                            // 2 sources

                                            var1_1 = var4_12.replaceAll("[\\S\\s]\\{([\\S\\s])\\}[\\S\\s]", "$1");
                                        }
                                        this.G("bfjiequhou", "list_twice_suf", "");
                                        var6_6 = this.w((String)var1_1, (String)var6_6);
                                        var5_9 = this.w((String)var1_1, (String)var5_9);
                                        var10_3 = this.w((String)var1_1, var12_5);
                                        var8_8 = this.w((String)var1_1, (String)var8_8);
                                        var7_7 = this.w((String)var1_1, var7_7);
                                        var4_12 = this.w((String)var1_1, var11_10);
                                        var9_11 /* !! */  = this.w((String)var1_1, (String)var9_11 /* !! */ );
                                        var1_1 = var5_9;
                                        var5_9 = var7_7;
                                        var7_7 = var9_11 /* !! */ ;
                                        break block40;
                                    }
                                    var4_12 = this.H("\u7b80\u4ecb", "\u64ad\u653e\u9875\u5267\u60c5", "juqingqian", "\u8ff0\u4e86&&</div>");
                                    var11_10 = this.G("\u5f71\u7247\u7c7b\u578b", "leixinqian", "\u7c7b\u578b\uff1a&&</div>");
                                    var12_5 = this.F("\u5f71\u7247\u5730\u533a", "\u5730\u533a\uff1a&&</div>");
                                    var13_13 = this.G("\u5f71\u7247\u5e74\u4ee3", "niandaiqian", "\u5e74\u4efd\uff1a&&</div>");
                                    var9_11 /* !! */  = this.I("\u5f71\u7247\u72b6\u6001", "\u72b6\u6001", "\u64ad\u653e\u9875\u72b6\u6001", "zhuangtaiqian", "\u72b6\u6001\uff1a&&</div>");
                                    var5_9 = this.H("\u5bfc\u6f14", "\u64ad\u653e\u9875\u5bfc\u6f14", "daoyanqian", "\u5bfc\u6f14\uff1a&&</div>");
                                    var7_7 = this.I("\u4e3b\u6f14", "\u6f14\u5458", "\u64ad\u653e\u9875\u6f14\u5458", "zhuyanqian", "\u4e3b\u6f14\uff1a&&</div>");
                                    if (var1_1.indexOf("</a>") >= 0 || var1_1.indexOf("</div>") >= 0) break block41;
                                    if (!"\u8ff0\u4e86&&</div>".equals(this.E("\u7b80\u4ecb"))) break block42;
                                    var4_12 = "vod_blurb*:*\"&&\"";
                                }
                                if ("\u5bfc\u6f14\uff1a&&</div>".equals(this.E("\u5bfc\u6f14"))) {
                                    var5_9 = "vod_director*:*\"&&\"";
                                }
                                var6_6 = var4_12;
                                var8_8 = var5_9;
                                if ("\u4e3b\u6f14\uff1a&&</div>".equals(this.E("\u4e3b\u6f14"))) {
                                    var7_7 = "vod_actor*:*\"&&\"";
                                    var6_6 = var4_12;
                                    var8_8 = var5_9;
                                }
                                break block43;
                            }
                            var6_6 = var4_12;
                            var8_8 = var5_9;
                        }
                        var4_12 = this.a0((String)var1_1, var11_10, this.E("leixinhou")).get(0).trim().replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "/").replaceAll("[><]", "").replaceAll("\uff0c", ",").replaceAll("/+", "/").replaceAll("\u5730\u533a.*", "").replaceAll("\\s+", "").replaceAll("\u4e0a\u6620.*", "");
                        var14_14 = "\u8ff0\u4e86&&</div>";
                        var11_10 = this.g(var4_12.replaceAll("\u66f4\u65b0.*", "").replaceAll("\u4e3b\u6f14.*", "").replaceAll("\u72b6\u6001.*", "").replaceAll("\u603b\u96c6\u6570.*", "").replaceAll("\u7f16\u5267.*", "").replaceAll("\u5e74\u4ee3.*", "").replaceAll("\u5e74\u4efd.*", "").replaceAll("\u56fd\u5bb6.*", "").replaceAll("\u5bfc\u6f14.*", "").replaceAll("\u5267\u60c5.*", "").replaceAll("\u7b80\u4ecb.*", ""));
                        var12_5 = this.a0((String)var1_1, var12_5, "").get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", " ").replaceAll("[><]", "").replaceAll("\\s+", " ").trim().split(" ")[0];
                        var4_12 = var5_9 = this.a0((String)var1_1, var13_13, this.E("niandaihou")).get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", " ").replaceAll("[><]", "").replaceAll("\\s+", " ").trim().split(" ")[0];
                        if (var5_9.trim().isEmpty()) {
                            var4_12 = this.a0((String)var1_1, "\u5e74\u4ee3\uff1a&&</div>", "").get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", " ").replaceAll("[><]", "").replaceAll("\\s+", " ").trim().split(" ")[0];
                        }
                        var9_11 /* !! */  = this.a0((String)var1_1, (String)var9_11 /* !! */ , this.E("zhuangtaihou")).get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", " ").replaceAll("[><]", "").replaceAll("\\s+", " ").trim().split(" ")[0];
                        var5_9 = var9_11 /* !! */ ;
                        if (var9_11 /* !! */ .trim().isEmpty()) {
                            var5_9 = this.a0((String)var1_1, "\u66f4\u65b0\uff1a&&</div>", "").get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", " ").replaceAll("[><]", "").replaceAll("\\s+", " ").trim().split(" ")[0];
                        }
                        var9_11 /* !! */  = new String[]{var7_7, "\u6f14\u5458\uff1a&&</div>", "\u4e3b\u6f14\uff1a&&</p>", "\u6f14\u5458\uff1a&&</p>"};
                        var7_7 = "";
                        for (var2_15 = 0; var2_15 < 4; ++var2_15) {
                            var7_7 = this.a0((String)var1_1, var9_11 /* !! */ [var2_15], "").get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "/").replaceAll("[><]", "").replaceAll(" ", "\u7a7a\u7a7a\u7a7a").replaceAll("\\s+", "").replaceAll("\u7a7a\u7a7a\u7a7a", " ").replaceAll("/+", "/").trim();
                            if (var7_7.length() > 1) break;
                            continue;
                        }
                        var13_13 = this.g(var7_7.replaceAll("\u7c7b\u578b.*", "").replaceAll("\u5bfc\u6f14.*", "").replaceAll("\u4e3b\u6f14.*", "").replaceAll("\u4e0a\u6620.*", "").replaceAll("\u66f4\u65b0.*", "").replaceAll("\u603b\u96c6\u6570.*", "").replaceAll("\u7f16\u5267.*", "").replaceAll("\u72b6\u6001.*", "").replaceAll("\u5e74\u4ee3.*", "").replaceAll("\u5e74\u4efd.*", "").replaceAll("\u56fd\u5bb6.*", "").replaceAll("\u5730\u533a.*", "").replaceAll("\u7b80\u4ecb.*", "").replaceAll("\u5267\u60c5.*", "").replaceAll("\u7acb\u5373\u64ad\u653e.*", "").replaceAll("\u300a.*", "").replaceAll("\u201c.*", "").replaceAll("\u8be5\u7247.*", "").trim());
                        var8_8 = this.a0((String)var1_1, (String)var8_8, this.E("daoyanhou")).get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "/").replaceAll("[><]", "").replaceAll(" ", "\u7a7a\u7a7a\u7a7a").replaceAll("\\s+", "").replaceAll("\u7a7a\u7a7a\u7a7a", " ").replaceAll("/+", "/").trim();
                        var7_7 = var8_8;
                        if (var8_8.isEmpty()) {
                            var7_7 = this.a0((String)var1_1, "\u5bfc\u6f14\uff1a&&</p>", "").get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "/").replaceAll("[><]", "").replaceAll(" ", "\u7a7a\u7a7a\u7a7a").replaceAll("\\s+", "").replaceAll("\u7a7a\u7a7a\u7a7a", " ").replaceAll("/+", "/").trim();
                        }
                        var15_16 = this.g(var7_7.replaceAll("\u4e3b\u6f14.*", "").replaceAll("\u6f14\u5458.*", "").replaceAll("\u7c7b\u578b.*", "").replaceAll("\u4e0a\u6620.*", "").replaceAll("\u66f4\u65b0.*", "").replaceAll("\u72b6\u6001.*", "").replaceAll("\u603b\u96c6\u6570.*", "").replaceAll("\u7f16\u5267.*", "").replaceAll("\u5e74\u4ee3.*", "").replaceAll("\u5e74\u4efd.*", "").replaceAll("\u56fd\u5bb6.*", "").replaceAll("\u5730\u533a.*", "").replaceAll("\u5267\u60c5.*", "").replaceAll("\u7b80\u4ecb.*", "").replaceAll("\u7acb\u5373\u64ad\u653e.*", "").replaceAll("\u300a.*", "").replaceAll("\u8bed\u8a00.*", "").trim());
                        var18_17 = new String[]{"$.", "$(", "=", "vod_", "font", "\":\"", "\": \"", "height", "width", "size"};
                        var7_7 = this.E("juqinghou");
                        var16_18 = this.a0((String)var1_1, (String)var6_6, var7_7).get(0).trim().replaceAll("<script[. ]*?>[. ]*?</script>", "").replaceAll("<style[. ]*?>[. ]*?</style>", "").replace("\u8be6\u60c5", "").replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").replaceAll(" ", "\u7a7a\u7a7a\u7a7a").replaceAll("\\s+", "").replaceAll("\u7a7a\u7a7a\u7a7a", " ").replaceAll("\"?var.*", "").replaceAll("\u7acb\u5373\u64ad\u653e.*", "").replaceAll("\u64ad\u653e.*", "").replaceAll("\"?\u70ed\u641c.*", "").replaceAll("\u70ed\u95e8.*", "").replaceAll("name=.*", "").split("\u9009\u96c6")[0].split("\u9009\u7ebf")[0].split("\u7ebf\u8def")[0].trim();
                        for (var2_15 = 0; var2_15 < 10; ++var2_15) {
                            if (var16_18.indexOf(var18_17[var2_15]) < 0) continue;
                            var2_15 = 1;
                            break block44;
                        }
                        var2_15 = 0;
                    }
                    var9_11 /* !! */  = new String[]{"\u7b80\u4ecb&&</div>", "\u5267\u60c5&&</div>", "\u4ecb\u7ecd&&</div>", "\u6982\u8981&&</div>", "\u6982\u8981&&</p>", "\u7b80\u4ecb&&</p>", "\u5267\u60c5&&</p>[\u4e0d\u5305\u542b:\u9996\u9875]", "\u4ecb\u7ecd&&</p>[\u4e0d\u5305\u542b:\u9996\u9875]", "<p*>&&</p>[\u4e0d\u5305\u542b:\u70ed\u641c#\u70ed\u95e8#\u64ad\u653e#\u672c\u7ad9#\u5bfc\u6f14\uff1a#\u66f4\u65b0\uff1a#\u72b6\u6001\uff1a#\u4e3b\u6f14\uff1a#\u6f14\u5458\uff1a#\u5730\u533a\uff1a#\u5e74\u4efd\uff1a#\u5e74\u4ee3\uff1a#\u7c7b\u578b\uff1a]"};
                    var7_7 = var14_14;
                    var8_8 = var6_6;
                    var6_6 = var16_18;
                    block26: for (var3_19 = 0; var3_19 < 9; ++var3_19) {
                        var14_14 = var9_11 /* !! */ [var3_19];
                        if (!var7_7.equals(var8_8)) break;
                        if (var2_15 != 0) ** GOTO lbl114
                        if (var8_8.indexOf("\u5185\u8be6") >= 0 || var8_8.indexOf("\u672a\u77e5") >= 0 || var6_6.length() >= 10) break;
lbl114:
                        // 2 sources

                        var6_6 = this.a0((String)var1_1, "\u6982\u8981&&</p>", "").get(0).trim().replaceAll("<script[. ]*?>[. ]*?</script>", "").replaceAll("<style[. ]*?>[. ]*?</style>", "").replace("\u8be6\u60c5", "").replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").replaceAll(" ", "\u7a7a\u7a7a\u7a7a").replaceAll("\\s+", "").replaceAll("\u7a7a\u7a7a\u7a7a", " ").replaceAll("\"?var.*", "").replaceAll("\u7acb\u5373\u64ad\u653e.*", "").replaceAll("\u64ad\u653e.*", "").replaceAll("\"?\u70ed\u641c.*", "").replaceAll("\u70ed\u95e8.*", "").replaceAll("\u5927\u5bb6\u90fd\u5728.*", "").replace("\u4ecb\u7ecd", "").split("\u9009\u96c6")[0].split("\u9009\u7ebf")[0].split("\u7ebf\u8def")[0].trim();
                        for (var2_15 = 0; var2_15 < 10; ++var2_15) {
                            if (var6_6.indexOf(var18_17[var2_15]) < 0) continue;
                            var2_15 = 1;
                            continue block26;
                        }
                        var2_15 = 0;
                    }
                    var1_1 = var10_3;
                    try {
                        if ("\u672a\u77e5".equals(var6_6)) break block45;
                        var1_1 = var10_3;
                    }
                    catch (Exception var1_2) {
                        if (this.m) {
                            var4_12 = new StringBuilder();
                            var4_12.append(this.G);
                            var4_12.append("\u8c03\u8bd5->getDescInfo\u51fa\u9519\uff1a");
                            var4_12.append(var1_2.toString());
                            Init.show(var4_12.toString());
                        }
                        if ((var4_12 = this.I) != null) {
                            com.github.catvod.spider.merge.Dw.f.a(var1_2, com.github.catvod.spider.merge.ka.d.b("\u8be6\u60c5\u4fe1\u606f\u83b7\u53d6\u9519\u8bef\uff01getDescInfo()-->"), (SpiderApi)var4_12);
                        }
                        return null;
                    }
                    if ("\u5185\u8be6".equals(var6_6)) break block45;
                    if (!var7_7.equals(var8_8)) break block46;
                    var1_1 = var10_3;
                    if (var2_15 != 0) break block45;
                    if (var8_8.indexOf("\u5185\u8be6") >= 0 || var8_8.indexOf("\u672a\u77e5") >= 0 || var6_6.length() >= 10) break block46;
                    var1_1 = var10_3;
                    break block45;
                }
                var1_1 = var6_6;
            }
            var7_7 = var15_16;
            var8_8 = var12_5;
            var6_6 = var11_10;
            var10_3 = var4_12;
            var9_11 /* !! */  = var5_9;
            var5_9 = var13_13;
            var4_12 = var7_7;
            var7_7 = var5_9;
            var5_9 = var8_8;
            var8_8 = var10_3;
            var10_3 = var1_1;
            var1_1 = var9_11 /* !! */ ;
        }
        var9_11 /* !! */  = this.g((String)var10_3);
        var17_4.put("category", var6_6);
        var17_4.put("remark", (Object)var1_1);
        var17_4.put("desc", (Object)var9_11 /* !! */ );
        var17_4.put("year", var8_8);
        var17_4.put("area", var5_9);
        var17_4.put("director", var4_12);
        var17_4.put("actor", (Object)var7_7);
        return var17_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject s() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        String string;
        Object object5;
        String string2;
        String string3;
        String string4;
        String string5;
        Object object6;
        Object object7;
        int n2;
        Object object8;
        int n3;
        String[] stringArray;
        Object object9;
        Object object10;
        String string6 = "{year}";
        String string7 = "{letter}";
        Object object11 = "\u7535\u89c6\u5267";
        try {
            object10 = this.c;
            object9 = new ArrayList();
            stringArray = ((String)object10).split("#");
            n3 = stringArray.length;
            object8 = "";
            n2 = 0;
            object7 = "\u8fde\u7eed\u5267";
            object6 = "";
            string3 = string5 = (string4 = "");
            string2 = "#";
        }
        catch (Exception exception) {
            if (this.m) {
                object5 = new StringBuilder();
                ((StringBuilder)object5).append(this.G);
                ((StringBuilder)object5).append("\u8c03\u8bd5->getFilterData\u51fa\u9519\uff1a");
                ((StringBuilder)object5).append(((Object)exception).toString());
                Init.show(((StringBuilder)object5).toString());
            }
            if ((object5 = this.I) != null) {
                com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("getFilterData()\u9519\u8bef-->"), (SpiderApi)object5);
            }
            return null;
        }
        while (true) {
            string = "\u7535\u5f71";
            if (n2 >= n3) break;
            object4 = stringArray[n2];
            {
                ((ArrayList)object9).add(((String)object4).split("\\$")[1]);
                boolean bl = ((String)object11).equals(((String)object4).split("\\$")[0]);
                if (bl) {
                    object10 = ((String)object4).split("\\$")[1];
                    object5 = object11;
                    object3 = object6;
                    object2 = string4;
                    object = string3;
                } else if ("\u7535\u89c6".equals(((String)object4).split("\\$")[0])) {
                    object10 = ((String)object4).split("\\$")[1];
                    object5 = "\u7535\u89c6";
                    object3 = object6;
                    object2 = string4;
                    object = string3;
                } else if ("\u5267\u96c6".equals(((String)object4).split("\\$")[0])) {
                    object10 = ((String)object4).split("\\$")[1];
                    object5 = "\u5267\u96c6";
                    object3 = object6;
                    object2 = string4;
                    object = string3;
                } else if ("\u8fde\u7eed\u5267".equals(((String)object4).split("\\$")[0])) {
                    object10 = ((String)object4).split("\\$")[1];
                    object5 = object7;
                    object3 = object6;
                    object2 = string4;
                    object = string3;
                } else if ("\u7535\u5f71".equals(((String)object4).split("\\$")[0])) {
                    object3 = ((String)object4).split("\\$")[0];
                    object2 = ((String)object4).split("\\$")[1];
                    object5 = object7;
                    object10 = string5;
                    object = string3;
                } else if ("\u52a8\u6f2b".equals(((String)object4).split("\\$")[0])) {
                    object = ((String)object4).split("\\$")[1];
                    object5 = object7;
                    object3 = object6;
                    object2 = string4;
                    object10 = string5;
                } else if (((String)object4).split("\\$")[0].indexOf("\u7535\u5f71") > 0 && string4.length() < 1) {
                    object3 = ((String)object4).split("\\$")[0];
                    object2 = ((String)object4).split("\\$")[1];
                    object5 = object7;
                    object10 = string5;
                    object = string3;
                } else {
                    object5 = object7;
                    object3 = object6;
                    object2 = string4;
                    object10 = string5;
                    object = string3;
                    if (((String)object4).split("\\$")[0].indexOf("\u5267") >= 0) {
                        object5 = object7;
                        object3 = object6;
                        object2 = string4;
                        object10 = string5;
                        object = string3;
                        if (string5.length() < 1) {
                            object5 = ((String)object4).split("\\$")[0];
                            object10 = ((String)object4).split("\\$")[1];
                            object = string3;
                            object2 = string4;
                            object3 = object6;
                        }
                    }
                }
                ++n2;
                object7 = object5;
                object6 = object3;
                string4 = object2;
                string5 = object10;
                string3 = object;
                continue;
            }
            break;
        }
        {
            Object object12;
            String string8;
            String string9;
            block57: {
                block56: {
                    block54: {
                        block55: {
                            string9 = this.G("\u7c7b\u578b", "\u7b5b\u9009\u5b50\u5206\u7c7b\u540d\u79f0", "0");
                            string8 = this.b;
                            object11 = this.G("\u5267\u60c5", "\u7b5b\u9009\u7c7b\u578b\u540d\u79f0", "");
                            n3 = string8.indexOf("{class}");
                            object3 = "{class}";
                            object = "\u5267";
                            object12 = "\\$";
                            if ((n3 < 0 || !((String)object11).isEmpty()) && ((String)object11).indexOf("[\u66ff\u6362") < 0) break block54;
                            object10 = "\u7535\u5f71--\u559c\u5267&\u7231\u60c5&\u52a8\u4f5c&\u79d1\u5e7b&\u6218\u4e89&\u8b66\u532a&\u72af\u7f6a&\u52a8\u753b&\u5947\u5e7b&\u53e4\u88c5&\u6b66\u4fa0&\u5192\u9669&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u60ac\u7591&\u67aa\u6218&\u5267\u60c5&\u9752\u6625&\u6587\u827a&\u5386\u53f2&\u4f20\u5947&\u97f3\u4e50&\u6b4c\u821e&\u90fd\u5e02&\u8fd0\u52a8&\u513f\u7ae5&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6||\u8fde\u7eed\u5267--\u53e4\u88c5&\u795e\u8bdd&\u6218\u4e89&\u559c\u5267&\u7231\u60c5&\u6b66\u4fa0&\u52a8\u4f5c&\u7a7f\u8d8a&\u5947\u5e7b&\u5076\u50cf&\u5bb6\u5ead&\u72af\u7f6a&\u60ac\u7591&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u5267\u60c5&\u4e61\u6751&\u90fd\u5e02&\u7ecf\u5178&\u5386\u53f2&\u4f20\u5947&\u97f3\u4e50&\u6b4c\u821e&\u7f51\u5267&\u60c5\u666f&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6||\u7efc\u827a--\u8131\u53e3\u79c0&\u771f\u4eba\u79c0&\u8bbf\u8c08&\u60c5\u611f&\u9009\u79c0&\u751f\u6d3b&\u7f8e\u98df&\u65c5\u6e38&\u97f3\u4e50&\u821e\u8e48&\u8d22\u7ecf&\u7eaa\u5b9e&\u6e38\u620f&\u6b4c\u821e&\u6c42\u804c&\u60c5\u8272&\u5176\u4ed6||\u52a8\u6f2b--\u79d1\u5e7b&\u70ed\u8840&\u641e\u7b11&\u5192\u9669&\u63a8\u7406&\u6218\u4e89&\u673a\u6218&\u52a8\u4f5c&\u6821\u56ed&\u793e\u4f1a&\u4eb2\u5b50&\u52b1\u5fd7&\u5c11\u5e74&\u5c11\u5973&\u841d\u8389&\u76ca\u667a&\u539f\u521b&\u8fd0\u52a8&\u60c5\u8272&\u5176\u4ed6||\u7eaa\u5f55\u7247--\u7eaa\u5f55&\u5386\u53f2&\u4f20\u8bb0&\u97f3\u4e50&\u6b4c\u821e&\u77ed\u7247&\u79d1\u5e7b&\u5176\u4ed6||\u901a\u7528--\u559c\u5267&\u7231\u60c5&\u52a8\u4f5c&\u79d1\u5e7b&\u6218\u4e89&\u72af\u7f6a&\u795e\u8bdd&\u5947\u5e7b&\u7a7f\u8d8a&\u53e4\u88c5&\u6b66\u4fa0&\u5192\u9669&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u60ac\u7591&\u513f\u7ae5&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6";
                            if (this.s.indexOf("\u7b80") >= 0) {
                                object10 = "\u7535\u5f71--\u559c\u5267&\u7231\u60c5&\u52a8\u4f5c&\u79d1\u5e7b&\u6218\u4e89&\u8b66\u532a&\u72af\u7f6a&\u52a8\u753b&\u5947\u5e7b&\u53e4\u88c5&\u6b66\u4fa0&\u5192\u9669&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u60ac\u7591&\u67aa\u6218&\u5267\u60c5&\u9752\u6625&\u6587\u827a&\u5386\u53f2&\u4f20\u5947&\u97f3\u4e50&\u6b4c\u821e&\u90fd\u5e02&\u8fd0\u52a8&\u513f\u7ae5&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6||\u8fde\u7eed\u5267--\u53e4\u88c5&\u795e\u8bdd&\u6218\u4e89&\u559c\u5267&\u7231\u60c5&\u6b66\u4fa0&\u52a8\u4f5c&\u7a7f\u8d8a&\u5947\u5e7b&\u5076\u50cf&\u5bb6\u5ead&\u72af\u7f6a&\u60ac\u7591&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u5267\u60c5&\u4e61\u6751&\u90fd\u5e02&\u7ecf\u5178&\u5386\u53f2&\u4f20\u5947&\u97f3\u4e50&\u6b4c\u821e&\u7f51\u5267&\u60c5\u666f&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6||\u7efc\u827a--\u8131\u53e3\u79c0&\u771f\u4eba\u79c0&\u8bbf\u8c08&\u60c5\u611f&\u9009\u79c0&\u751f\u6d3b&\u7f8e\u98df&\u65c5\u6e38&\u97f3\u4e50&\u821e\u8e48&\u8d22\u7ecf&\u7eaa\u5b9e&\u6e38\u620f&\u6b4c\u821e&\u6c42\u804c&\u60c5\u8272&\u5176\u4ed6||\u52a8\u6f2b--\u79d1\u5e7b&\u70ed\u8840&\u641e\u7b11&\u5192\u9669&\u63a8\u7406&\u6218\u4e89&\u673a\u6218&\u52a8\u4f5c&\u6821\u56ed&\u793e\u4f1a&\u4eb2\u5b50&\u52b1\u5fd7&\u5c11\u5e74&\u5c11\u5973&\u841d\u8389&\u76ca\u667a&\u539f\u521b&\u8fd0\u52a8&\u60c5\u8272&\u5176\u4ed6||\u7eaa\u5f55\u7247--\u7eaa\u5f55&\u5386\u53f2&\u4f20\u8bb0&\u97f3\u4e50&\u6b4c\u821e&\u77ed\u7247&\u79d1\u5e7b&\u5176\u4ed6||\u901a\u7528--\u559c\u5267&\u7231\u60c5&\u52a8\u4f5c&\u79d1\u5e7b&\u6218\u4e89&\u72af\u7f6a&\u795e\u8bdd&\u5947\u5e7b&\u7a7f\u8d8a&\u53e4\u88c5&\u6b66\u4fa0&\u5192\u9669&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u60ac\u7591&\u513f\u7ae5&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6".replaceAll("\\&\u5267\u60c5.*?\u5176\u4ed6", "").replaceAll("\\&\u8d22\u7ecf.*?\u5176\u4ed6", "").replaceAll("\\&\u5c11\u5e74.*?\u5176\u4ed6", "");
                            } else if (this.s.indexOf("!") >= 0) {
                                object10 = "\u7535\u5f71--\u559c\u5267&\u7231\u60c5&\u52a8\u4f5c&\u79d1\u5e7b&\u6218\u4e89&\u8b66\u532a&\u72af\u7f6a&\u52a8\u753b&\u5947\u5e7b&\u53e4\u88c5&\u6b66\u4fa0&\u5192\u9669&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u60ac\u7591&\u67aa\u6218&\u5267\u60c5&\u9752\u6625&\u6587\u827a&\u5386\u53f2&\u4f20\u5947&\u97f3\u4e50&\u6b4c\u821e&\u90fd\u5e02&\u8fd0\u52a8&\u513f\u7ae5&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6||\u8fde\u7eed\u5267--\u53e4\u88c5&\u795e\u8bdd&\u6218\u4e89&\u559c\u5267&\u7231\u60c5&\u6b66\u4fa0&\u52a8\u4f5c&\u7a7f\u8d8a&\u5947\u5e7b&\u5076\u50cf&\u5bb6\u5ead&\u72af\u7f6a&\u60ac\u7591&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u5267\u60c5&\u4e61\u6751&\u90fd\u5e02&\u7ecf\u5178&\u5386\u53f2&\u4f20\u5947&\u97f3\u4e50&\u6b4c\u821e&\u7f51\u5267&\u60c5\u666f&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6||\u7efc\u827a--\u8131\u53e3\u79c0&\u771f\u4eba\u79c0&\u8bbf\u8c08&\u60c5\u611f&\u9009\u79c0&\u751f\u6d3b&\u7f8e\u98df&\u65c5\u6e38&\u97f3\u4e50&\u821e\u8e48&\u8d22\u7ecf&\u7eaa\u5b9e&\u6e38\u620f&\u6b4c\u821e&\u6c42\u804c&\u60c5\u8272&\u5176\u4ed6||\u52a8\u6f2b--\u79d1\u5e7b&\u70ed\u8840&\u641e\u7b11&\u5192\u9669&\u63a8\u7406&\u6218\u4e89&\u673a\u6218&\u52a8\u4f5c&\u6821\u56ed&\u793e\u4f1a&\u4eb2\u5b50&\u52b1\u5fd7&\u5c11\u5e74&\u5c11\u5973&\u841d\u8389&\u76ca\u667a&\u539f\u521b&\u8fd0\u52a8&\u60c5\u8272&\u5176\u4ed6||\u7eaa\u5f55\u7247--\u7eaa\u5f55&\u5386\u53f2&\u4f20\u8bb0&\u97f3\u4e50&\u6b4c\u821e&\u77ed\u7247&\u79d1\u5e7b&\u5176\u4ed6||\u901a\u7528--\u559c\u5267&\u7231\u60c5&\u52a8\u4f5c&\u79d1\u5e7b&\u6218\u4e89&\u72af\u7f6a&\u795e\u8bdd&\u5947\u5e7b&\u7a7f\u8d8a&\u53e4\u88c5&\u6b66\u4fa0&\u5192\u9669&\u6050\u6016&\u60ca\u609a&\u707e\u96be&\u60ac\u7591&\u513f\u7ae5&\u4f26\u7406&\u60c5\u8272&\u5176\u4ed6".replaceAll("\\&\u4f26\u7406.*?\u60c5\u8272", "");
                            }
                            object5 = object10;
                            if (!"\u8fde\u7eed\u5267".equals(object7)) {
                                object5 = ((String)object10).replace("\u8fde\u7eed\u5267", (CharSequence)object7);
                            }
                            object10 = object5;
                            if (!"\u7535\u5f71".equals(object6)) {
                                object10 = ((String)object5).replace("\u7535\u5f71", (CharSequence)object6);
                            }
                            if (((String)object11).indexOf("[\u66ff\u6362") < 0) break block55;
                            object10 = this.c0((String)object11, (String)object10).replaceAll("\\&+", "&").replace("--&", "--");
                            break block56;
                        }
                        object5 = object10;
                        break block57;
                    }
                    object10 = object11;
                }
                object5 = object10;
            }
            object2 = this.G("\u5730\u533a", "\u7b5b\u9009\u5730\u533a\u540d\u79f0", "");
            if (string8.indexOf("{area}") >= 0 && ((String)object2).isEmpty() || ((String)object2).indexOf("[\u66ff\u6362") >= 0) {
                object11 = "\u7535\u5f71--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u7f8e\u56fd&\u6cd5\u56fd&\u82f1\u56fd&\u65e5\u672c&\u97e9\u56fd&\u5fb7\u56fd&\u6cf0\u56fd&\u5370\u5ea6&\u4fc4\u7f57\u65af&\u610f\u5927\u5229&\u897f\u73ed\u7259&\u52a0\u62ff\u5927&\u5176\u4ed6||\u8fde\u7eed\u5267--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u7f8e\u56fd&\u6cd5\u56fd&\u82f1\u56fd&\u65e5\u672c&\u97e9\u56fd&\u5fb7\u56fd&\u6cf0\u56fd&\u5370\u5ea6&\u4fc4\u7f57\u65af&\u610f\u5927\u5229&\u897f\u73ed\u7259&\u52a0\u62ff\u5927&\u5176\u4ed6||\u7efc\u827a--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u65e5\u672c&\u97e9\u56fd&\u7f8e\u56fd&\u82f1\u56fd&\u5176\u4ed6||\u52a8\u6f2b--\u4e2d\u56fd\u5927\u9646&\u65e5\u672c&\u97e9\u56fd&\u7f8e\u56fd&\u82f1\u56fd&\u6cd5\u56fd&\u5176\u4ed6||\u7eaa\u5f55\u7247--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u7f8e\u56fd&\u6cd5\u56fd&\u82f1\u56fd&\u65e5\u672c&\u97e9\u56fd&\u5fb7\u56fd&\u6cf0\u56fd&\u5370\u5ea6&\u4fc4\u7f57\u65af&\u610f\u5927\u5229&\u897f\u73ed\u7259&\u52a0\u62ff\u5927&\u5176\u4ed6||\u901a\u7528--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u7f8e\u56fd&\u6cd5\u56fd&\u82f1\u56fd&\u65e5\u672c&\u97e9\u56fd&\u5fb7\u56fd&\u6cf0\u56fd&\u5370\u5ea6&\u4fc4\u7f57\u65af&\u610f\u5927\u5229&\u897f\u73ed\u7259&\u52a0\u62ff\u5927&\u5176\u4ed6";
                if (this.s.indexOf("\u4e2d") < 0) {
                    object11 = "\u7535\u5f71--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u7f8e\u56fd&\u6cd5\u56fd&\u82f1\u56fd&\u65e5\u672c&\u97e9\u56fd&\u5fb7\u56fd&\u6cf0\u56fd&\u5370\u5ea6&\u4fc4\u7f57\u65af&\u610f\u5927\u5229&\u897f\u73ed\u7259&\u52a0\u62ff\u5927&\u5176\u4ed6||\u8fde\u7eed\u5267--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u7f8e\u56fd&\u6cd5\u56fd&\u82f1\u56fd&\u65e5\u672c&\u97e9\u56fd&\u5fb7\u56fd&\u6cf0\u56fd&\u5370\u5ea6&\u4fc4\u7f57\u65af&\u610f\u5927\u5229&\u897f\u73ed\u7259&\u52a0\u62ff\u5927&\u5176\u4ed6||\u7efc\u827a--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u65e5\u672c&\u97e9\u56fd&\u7f8e\u56fd&\u82f1\u56fd&\u5176\u4ed6||\u52a8\u6f2b--\u4e2d\u56fd\u5927\u9646&\u65e5\u672c&\u97e9\u56fd&\u7f8e\u56fd&\u82f1\u56fd&\u6cd5\u56fd&\u5176\u4ed6||\u7eaa\u5f55\u7247--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u7f8e\u56fd&\u6cd5\u56fd&\u82f1\u56fd&\u65e5\u672c&\u97e9\u56fd&\u5fb7\u56fd&\u6cf0\u56fd&\u5370\u5ea6&\u4fc4\u7f57\u65af&\u610f\u5927\u5229&\u897f\u73ed\u7259&\u52a0\u62ff\u5927&\u5176\u4ed6||\u901a\u7528--\u4e2d\u56fd\u5927\u9646&\u4e2d\u56fd\u9999\u6e2f&\u4e2d\u56fd\u53f0\u6e7e&\u7f8e\u56fd&\u6cd5\u56fd&\u82f1\u56fd&\u65e5\u672c&\u97e9\u56fd&\u5fb7\u56fd&\u6cf0\u56fd&\u5370\u5ea6&\u4fc4\u7f57\u65af&\u610f\u5927\u5229&\u897f\u73ed\u7259&\u52a0\u62ff\u5927&\u5176\u4ed6".replace("\u4e2d\u56fd", "");
                }
                object10 = object11;
                if (!"\u8fde\u7eed\u5267".equals(object7)) {
                    object10 = ((String)object11).replace("\u8fde\u7eed\u5267", (CharSequence)object7);
                }
                object11 = object10;
                if (!"\u7535\u5f71".equals(object6)) {
                    object11 = ((String)object10).replace("\u7535\u5f71", (CharSequence)object6);
                }
                object10 = ((String)object2).indexOf("[\u66ff\u6362") >= 0 ? this.c0((String)object2, (String)object11).replaceAll("\\&+", "&").replace("--&", "--") : object11;
            } else {
                object10 = object2;
            }
            Object object13 = object5;
            String string10 = "{area}";
            object5 = this.G("\u8bed\u8a00", "\u7b5b\u9009\u8bed\u8a00\u540d\u79f0", "");
            String string11 = "{lang}";
            object4 = object5;
            if (string8.indexOf("{lang}") >= 0) {
                object4 = object5;
                if (((String)object5).isEmpty()) {
                    object4 = "\u56fd\u8bed&\u82f1\u8bed&\u7ca4\u8bed&\u95fd\u5357\u8bed&\u97e9\u8bed&\u65e5\u8bed&\u6cd5\u8bed&\u5fb7\u8bed&\u5176\u5b83";
                }
            }
            Object object14 = object5 = this.G("\u5b57\u6bcd", "\u7b5b\u9009\u5b57\u6bcd\u540d\u79f0", "");
            if (string8.indexOf(string7) >= 0) {
                object14 = object5;
                if (((String)object5).isEmpty()) {
                    object14 = "A&B&C&D&E&F&G&H&I&J&K&L&M&N&O&P&Q&R&S&T&U&V&W&X&Y&Z";
                }
            }
            object5 = object11 = this.H("\u5e74\u4efd", "\u65f6\u957f", "\u7b5b\u9009\u5e74\u4efd\u540d\u79f0", "");
            if (string8.indexOf(string6) >= 0) {
                object5 = object11;
                if (((String)object11).isEmpty()) {
                    object5 = new Date();
                    n3 = ((Date)object5).getYear() + 1900;
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append(n3 - 20);
                    ((StringBuilder)object5).append("-");
                    ((StringBuilder)object5).append(n3);
                    object5 = ((StringBuilder)object5).toString();
                }
            }
            Object object15 = object5;
            object2 = object5 = this.G("\u6392\u5e8f", "\u7b5b\u9009\u6392\u5e8f\u540d\u79f0", "");
            if (string8.indexOf("{by}") >= 0) {
                object2 = object5;
                if (((String)object5).isEmpty()) {
                    object2 = "\u65f6\u95f4$time#\u4eba\u6c14$hits#\u8bc4\u5206$score";
                }
            }
            JSONObject jSONObject = new JSONObject();
            new JSONArray();
            string8 = this.H("\u7279\u6b8a\u5206\u7c7b", "\u7279\u6b8a\u5206\u7c7burl", "\u7279\u6b8a\u5206\u7c7b\u94fe\u63a5", "");
            Iterator iterator = ((ArrayList)object9).iterator();
            n3 = 0;
            object5 = object12;
            object11 = object;
            object6 = object3;
            object12 = object10;
            object10 = object8;
            while (iterator.hasNext()) {
                Object object16;
                Object object17;
                String string12;
                Object object18;
                object9 = (String)iterator.next();
                object7 = stringArray[n3].split((String)object5)[0];
                Object object19 = object5;
                if (((String)object7).indexOf("\u7247") >= 0 && ((String)object7).indexOf("\u7eaa\u5f55\u7247") < 0 && ((String)object7).indexOf("\u52a8\u753b\u7247") < 0 || ((String)object7).indexOf(string) > 0) {
                    object3 = object9;
                    object5 = string4;
                } else if (((String)object7).indexOf((String)object11) >= 0 && ((String)object7).indexOf("\u756a\u5267") < 0) {
                    object5 = object9;
                    object3 = string5;
                } else if (((String)object7).indexOf("\u756a") < 0 && ((String)object7).indexOf("\u52a8\u753b") < 0 && ((String)object7).indexOf("\u54d4\u54e9") < 0) {
                    n2 = ((String)object7).indexOf("\u5168");
                    if (n2 < 0 && ((String)object7).indexOf("\u65b0") < 0 && ((String)object7).indexOf("\u70ed") < 0 && ((String)object7).indexOf("\u699c") < 0 && ((String)object7).indexOf("\u8350") < 0) {
                        object5 = new StringBuilder();
                        ((StringBuilder)object5).append((String)object9);
                        ((StringBuilder)object5).append("$$$\u901a\u7528");
                        object5 = ((StringBuilder)object5).toString();
                        object3 = object9;
                    } else {
                        object5 = new StringBuilder();
                        ((StringBuilder)object5).append((String)object9);
                        ((StringBuilder)object5).append("$$$\u901a\u7528");
                        object5 = ((StringBuilder)object5).toString();
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append((String)object9);
                        ((StringBuilder)object3).append("$$$\u901a\u7528");
                        object3 = ((StringBuilder)object3).toString();
                    }
                } else {
                    object3 = object5 = string3;
                }
                if (string8.length() > 0 && string8.indexOf("$") >= 0 && string8.indexOf((String)object7) >= 0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string8);
                    ((StringBuilder)object).append(string2);
                    object = ((StringBuilder)object).toString();
                    object8 = new StringBuilder();
                    ((StringBuilder)object8).append(".*");
                    ((StringBuilder)object8).append((String)object7);
                    ((StringBuilder)object8).append(".*?\\$(.*?)#.*");
                    object18 = ((String)object).replaceAll(((StringBuilder)object8).toString(), "$1");
                    object7 = ((String)object18).indexOf("{cateId}") > 0 ? this.u(n3, (String)object9, string9) : object10;
                    object3 = ((String)object18).indexOf((String)object6) > 0 ? this.u(n3, (String)object3, (String)object13) : object10;
                    string12 = object6;
                    object8 = ((String)object18).indexOf(string10) > 0 ? this.u(n3, (String)object5, (String)object12) : object10;
                    object = ((String)object18).indexOf(string11) > 0 ? this.u(n3, (String)object9, (String)object4) : object10;
                    object5 = ((String)object18).indexOf(string6) > 0 ? this.u(n3, (String)object9, (String)object15) : object10;
                    object6 = ((String)object18).indexOf(string7) > 0 ? this.u(n3, (String)object9, (String)object14) : object10;
                    object17 = object8;
                    object8 = ((String)object18).indexOf("{by}") < 0 ? object10 : object2;
                    object18 = object3;
                    object16 = object7;
                    object3 = object;
                    object7 = object18;
                    object18 = object16;
                    object = object8;
                    object16 = object5;
                    object8 = object6;
                } else {
                    object7 = this.u(n3, (String)object9, string9);
                    object = this.u(n3, (String)object3, (String)object13);
                    object17 = this.u(n3, (String)object5, (String)object12);
                    object3 = this.u(n3, (String)object9, (String)object4);
                    object16 = this.u(n3, (String)object9, (String)object15);
                    object8 = this.u(n3, (String)object9, (String)object14);
                    object5 = object;
                    object = object2;
                    string12 = object6;
                    object18 = object7;
                    object7 = object5;
                }
                jSONObject.put((String)object9, (Object)this.h((String)object18, (String)object7, (String)object17, (String)object3, (String)object16, (String)object8, (String)object));
                ++n3;
                object6 = string12;
                object5 = object19;
            }
            return jSONObject;
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private String u(int var1_1, String var2_2, String var3_3) {
        block6: {
            block10: {
                block11: {
                    block5: {
                        block9: {
                            block8: {
                                block7: {
                                    if (var2_2.indexOf("$$$") < 0) {
                                        var7_4 = com.github.catvod.spider.merge.dp.n.b(com.github.catvod.spider.merge.ka.d.b("#"), this.c, "#");
                                        var6_5 = new StringBuilder();
                                        var6_5.append(".*#(.*?)\\$");
                                        var6_5.append((String)var2_2);
                                        var6_5.append("#.*");
                                        var7_4 = var7_4.replaceAll(var6_5.toString(), "$1");
                                        var6_5 = var2_2;
                                    } else {
                                        var7_4 = var2_2.split("\\$\\$\\$")[1];
                                        var6_5 = var2_2.split("\\$\\$\\$")[0];
                                    }
                                    if (var3_3.indexOf("||") < 0 && var3_3.indexOf("--") < 0) break block6;
                                    if (var3_3.indexOf("--") >= 0) break block7;
                                    var2_2 = new StringBuilder((String)var6_5);
                                    var2_2.append("--");
                                    var2_2.append(var3_3.split("\\|\\|")[var1_1]);
                                    var3_3 = var2_2.toString();
                                    break block6;
                                }
                                if (var3_3.indexOf("||") >= 0) break block8;
                                if (!var7_4.equals(var3_3.split("--")[0])) break block9;
                                var2_2 = new StringBuilder((String)var6_5);
                                var2_2.append("--");
                                var7_4 = var3_3.split("--")[1];
                                ** GOTO lbl43
                            }
                            var2_2 = var3_3.split("\\|\\|");
                            var5_6 = ((CharSequence)var2_2).length;
                            for (var4_7 = 0; var4_7 < var5_6; ++var4_7) {
                                var8_8 = var2_2[var4_7];
                                if (!(var7_4.equals(var8_8.split("--")[0]) || var7_4.indexOf(var8_8.split("--")[0]) >= 0 && var7_4.indexOf("\u7535\u5f71") < 0 && var7_4.indexOf("\u5267") < 0)) {
                                    continue;
                                }
                                var2_2 = new StringBuilder((String)var6_5);
                                var2_2.append("--");
                                var7_4 = var8_8.split("--")[1];
lbl43:
                                // 2 sources

                                var2_2.append(var7_4);
                                var2_2 = var2_2.toString();
                                break block5;
                            }
                        }
                        var2_2 = "0";
                    }
                    if (!var2_2.equals("0")) break block10;
                    if (var3_3.indexOf("||") >= 0) break block11;
                    var7_4 = var3_3.split("--")[0];
                    var8_8 = com.github.catvod.spider.merge.ka.d.b("");
                    var8_8.append(var1_1 + 1);
                    if (!var7_4.equals(var8_8.toString())) break block10;
                    var2_2 = new StringBuilder((String)var6_5);
                    var2_2.append("--");
                    var3_3 = var3_3.split("--")[1];
                    ** GOTO lbl73
                }
                for (CharSequence var3_3 : var3_3.split("\\|\\|")) {
                    var7_4 = var3_3.split("--")[0];
                    var8_8 = com.github.catvod.spider.merge.ka.d.b("");
                    var8_8.append(var1_1 + 1);
                    if (!var7_4.equals(var8_8.toString())) continue;
                    var2_2 = new StringBuilder((String)var6_5);
                    var2_2.append("--");
                    var3_3 = var3_3.split("--")[1];
lbl73:
                    // 2 sources

                    var2_2.append((String)var3_3);
                    var3_3 = var2_2.toString();
                    break block6;
                }
            }
            var3_3 = var2_2;
        }
        return var3_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONArray v(String string, String charSequence) {
        JSONArray jSONArray;
        try {
            if (((String)charSequence).length() < 1) {
                return new JSONArray(string);
            }
            jSONArray = charSequence;
            if (((String)charSequence).indexOf("&&") >= 0) {
                jSONArray = "data";
            }
            JSONArray jSONArray2 = new JSONArray();
            int n2 = jSONArray.indexOf("[");
            charSequence = "";
            CharSequence charSequence2 = jSONArray;
            if (n2 >= 0) {
                charSequence = jSONArray.replaceAll(".*\\[(.*?)\\].*", "$1");
                charSequence2 = jSONArray.replaceAll("\\[.*", "");
            }
            jSONArray = ((String)charSequence2).split("\\.");
            int n3 = 0;
            for (n2 = 0; n2 < ((String[])jSONArray).length; ++n2) {
                charSequence2 = new JSONObject(string);
                if (n2 == ((String[])jSONArray).length - 1) {
                    if (charSequence2.get(jSONArray[n2]) instanceof JSONObject) {
                        jSONArray2.put((Object)charSequence2.getJSONObject(jSONArray[n2]));
                        return jSONArray2;
                    }
                    jSONArray = charSequence2.getJSONArray(jSONArray[n2]);
                    n2 = jSONArray.length();
                    if (charSequence != null && ((String)charSequence).length() > 0) {
                        int n4;
                        int n5 = ((String)charSequence).indexOf(",");
                        if (n5 < 0 && ((String)charSequence).matches("\\d+")) {
                            n5 = n2;
                            if (n2 > Integer.parseInt((String)charSequence)) {
                                n5 = Integer.parseInt((String)charSequence);
                            }
                            n2 = n5 - 1;
                            n4 = n5;
                        } else {
                            string = ((String)charSequence).replaceAll("(.*),.*", "$1");
                            charSequence = ((String)charSequence).replaceAll(".*,(.*)", "$1");
                            n5 = n2;
                            if (charSequence != null) {
                                n5 = n2;
                                if (((String)charSequence).length() > 0) {
                                    n5 = n2;
                                    if (((String)charSequence).matches("\\d+")) {
                                        n5 = n2;
                                        if (Integer.parseInt((String)charSequence) < n2) {
                                            n5 = Integer.parseInt((String)charSequence);
                                        }
                                    }
                                }
                            }
                            n2 = n3;
                            n4 = n5;
                            if (string != null) {
                                n2 = n3;
                                n4 = n5;
                                if (string.length() > 0) {
                                    n2 = n3;
                                    n4 = n5;
                                    if (string.matches("\\d+")) {
                                        n2 = n3;
                                        n4 = n5;
                                        if (Integer.parseInt(string) <= n5) {
                                            n2 = Integer.parseInt(string) - 1;
                                            n4 = n5;
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (n2 >= n4) {
                                return jSONArray2;
                            }
                            jSONArray2.put((Object)jSONArray.getJSONObject(n2));
                            ++n2;
                        }
                    }
                    return jSONArray;
                }
                string = charSequence2.getJSONObject(jSONArray[n2]).toString();
            }
        }
        catch (JSONException jSONException) {
            if (this.m) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.G);
                ((StringBuilder)charSequence).append("\u8c03\u8bd5->getJsonArray\u51fa\u9519\uff1a");
                ((StringBuilder)charSequence).append(((Object)((Object)jSONException)).toString());
                Init.show(((StringBuilder)charSequence).toString());
            }
            if ((charSequence = this.I) != null) {
                jSONArray = com.github.catvod.spider.merge.ka.d.b("getJsonArray()\u9519\u8bef\uff01-->");
                jSONArray.append(((Object)((Object)jSONException)).toString());
                charSequence.log(jSONArray.toString());
            }
            return null;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String w(String var1_1, String var2_2) {
        var3_3 = var2_2.indexOf("\u66ff\u6362");
        var6_4 = "";
        var4_5 /* !! */  = var2_2;
        if (var3_3 >= 0) {
            var6_4 = var2_2.replaceAll(".*(\\[\u4ec5?\u66ff\u6362[:\uff1a][^\\]]+?\\]).*", "$1");
            var4_5 /* !! */  = var2_2.replaceAll("\\[\u4ec5?\u66ff\u6362[:\uff1a]([^\\]]+?)\\]", "");
        }
        if (var4_5 /* !! */ .indexOf("+") < 0) {
            var1_1 = this.x(var1_1, (String)var4_5 /* !! */ );
lbl9:
            // 2 sources

            return this.c0(var6_4, var1_1);
        }
        var7_6 = var4_5 /* !! */ .split("\\+");
        var2_2 = new StringBuilder();
        for (var3_3 = 0; var3_3 < var7_6.length; ++var3_3) {
            block11: {
                block10: {
                    if (var7_6[var3_3].startsWith("url:")) break block10;
                    var4_5 /* !! */  = this.x(var1_1, var7_6[var3_3]);
                    break block11;
                }
                var5_7 /* !! */  = var7_6[var3_3].substring(4);
                var4_5 /* !! */  = var5_7 /* !! */ ;
                if (var5_7 /* !! */ .indexOf("$sub:") <= 0) ** GOTO lbl26
                var4_5 /* !! */  = var5_7 /* !! */ .split("\\$sub\\:");
                if (var4_5 /* !! */ .length > 1) {
                    var4_5 /* !! */  = this.x(this.k(var4_5 /* !! */ [0]), var4_5 /* !! */ [1]);
                } else {
                    var4_5 /* !! */  = var4_5 /* !! */ [0];
lbl26:
                    // 2 sources

                    var4_5 /* !! */  = this.k((String)var4_5 /* !! */ );
                }
            }
            var5_7 /* !! */  = var2_2;
            if (var4_5 /* !! */ .length() > 0) {
                var5_7 /* !! */  = var2_2;
                if (var4_5 /* !! */ .startsWith("http")) {
                    var5_7 /* !! */  = var2_2;
                    if (!var2_2.toString().trim().endsWith("=")) {
                        var5_7 /* !! */  = var2_2;
                        if (!var2_2.toString().trim().endsWith("\u89e3\u6790")) {
                            var5_7 /* !! */  = new StringBuilder();
                        }
                    }
                }
                var5_7 /* !! */ .append((String)var4_5 /* !! */ );
            }
            var2_2 = var5_7 /* !! */ ;
        }
        var1_1 = var2_2.toString();
        ** while (true)
    }

    private String x(String object, String charSequence) {
        block24: {
            int n2;
            int n3;
            CharSequence charSequence2;
            CharSequence charSequence3;
            block23: {
                block22: {
                    block21: {
                        charSequence3 = object;
                        charSequence2 = charSequence;
                        if (((String)charSequence).endsWith("\u6574\u9875")) {
                            charSequence = ((String)charSequence).replace("\u6574\u9875", "");
                            charSequence3 = object;
                            charSequence2 = charSequence;
                            if (this.x.length() > 0) {
                                charSequence3 = this.x;
                                charSequence2 = charSequence;
                            }
                        }
                        if (((String)charSequence2).indexOf("'") >= 0) {
                            return ((String)charSequence2).replace("'", "");
                        }
                        if (((String)charSequence2).indexOf("&&") >= 0) break block21;
                        object = charSequence2;
                        if (((String)charSequence2).length() >= 1) break block22;
                    }
                    object = "data";
                }
                if (object.indexOf("].") < 0) {
                    return this.z((String)charSequence3, (String)object);
                }
                charSequence2 = ",";
                object = object.split("\\]\\.");
                n3 = ((String[])object).length;
                n2 = 0;
                charSequence = charSequence3;
                if (n3 <= 2) break block23;
                n3 = 0;
                while (true) {
                    charSequence = charSequence3;
                    if (n3 >= ((String[])object).length - 2) break;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(object[n3]);
                    ((StringBuilder)charSequence).append("]");
                    charSequence3 = this.v((String)charSequence3, ((StringBuilder)charSequence).toString()).getJSONObject(0).toString();
                    ++n3;
                    continue;
                    break;
                }
            }
            String string = object[((String[])object).length - 1];
            charSequence3 = new StringBuilder();
            ((StringBuilder)charSequence3).append(object[((String[])object).length - 2]);
            ((StringBuilder)charSequence3).append("]");
            String string2 = ((StringBuilder)charSequence3).toString();
            object = charSequence2;
            charSequence3 = string;
            if (string.indexOf("(") >= 0) {
                object = string.replaceAll(".*\\((.*?)\\).*", "$1");
                charSequence3 = string.replaceAll("\\(.*", "");
            }
            charSequence = this.v((String)charSequence, string2);
            charSequence2 = new StringBuilder();
            if (charSequence == null) break block24;
            if (charSequence.length() <= 0) break block24;
            n3 = n2;
            while (true) {
                block25: {
                    if (n3 >= charSequence.length()) break;
                    string = charSequence.getJSONObject(n3).toString();
                    if (n3 != charSequence.length() - 1) break block25;
                    object = "";
                }
                ((StringBuilder)charSequence2).append(this.z(string, (String)charSequence3));
                ((StringBuilder)charSequence2).append((String)object);
                ++n3;
                continue;
                break;
            }
            try {
                object = ((StringBuilder)charSequence2).toString();
                return object;
            }
            catch (JSONException jSONException) {
                if (this.m) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(this.G);
                    ((StringBuilder)charSequence).append("\u8c03\u8bd5->getJsonArrayStringAction\u51fa\u9519\uff1a");
                    ((StringBuilder)charSequence).append(((Object)((Object)jSONException)).toString());
                    Init.show(((StringBuilder)charSequence).toString());
                }
                if ((charSequence = this.I) != null) {
                    charSequence3 = com.github.catvod.spider.merge.ka.d.b("getJsonArrayStringAction()\u9519\u8bef\uff01-->");
                    ((StringBuilder)charSequence3).append(((Object)((Object)jSONException)).toString());
                    charSequence.log(((StringBuilder)charSequence3).toString());
                }
                return "";
            }
        }
        return "";
    }

    /*
     * WARNING - void declaration
     */
    private JsonObject y(String object3) {
        SpiderApi spiderApi;
        String string;
        CharSequence charSequence;
        Object object;
        String[] stringArray;
        JsonObject jsonObject;
        block13: {
            void var1_4;
            block12: {
                block11: {
                    jsonObject = new JsonObject();
                    stringArray = this.J("\u8bf7\u6c42\u5934", "\u8bf7\u6c42\u5934\u53c2\u6570", "ua", "Headers", "UserAgent", "").trim();
                    object = stringArray;
                    if (stringArray.length() > 1) {
                        object = stringArray;
                        if (stringArray.indexOf("@") > 0) {
                            object = stringArray.replace("@", "$").replace("&&", "#").replace("\uff1b\uff1b", ";");
                        }
                    }
                    stringArray = this.M((String)object);
                    jsonObject.addProperty("User-Agent", (String)stringArray);
                    charSequence = this.o((String)object3);
                    if (this.s.indexOf("c0") < 0 && ((String)charSequence).length() > 1) {
                        jsonObject.addProperty("Cookie", (String)charSequence);
                    }
                    if (((String)object).indexOf("Referer") >= 0 || this.s.indexOf("r1") < 0) break block11;
                    String string2 = ((String)object3).split(";")[0];
                    break block12;
                }
                if (((String)object).indexOf("Referer") >= 0 || this.s.indexOf("r") < 0) break block13;
                charSequence = new StringBuilder();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object3);
                stringBuilder.append("/");
                ((StringBuilder)charSequence).append(stringBuilder.toString().replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                ((StringBuilder)charSequence).append("/");
                String string3 = ((StringBuilder)charSequence).toString();
            }
            jsonObject.addProperty("Referer", (String)var1_4);
        }
        if ((string = ((String)object).replaceAll(".*\u7535\u8111#", "").replaceAll(".*\u624b\u673a#", "").replaceAll(".*_UA#", "")).indexOf("$") >= 0) {
            for (String string4 : string.split("#")) {
                void var1_11;
                if ("User-Agent".equals(string4.split("\\$")[0]) && stringArray.length() > 0 || "Cookie".equals(string4.split("\\$")[0]) || "cookie".equals(string4.split("\\$")[0])) continue;
                charSequence = string4.split("\\$")[0];
                if (string4.split("\\$")[1].equals("\u7a7a")) {
                    String string5 = "";
                } else {
                    String string6 = string4.split("\\$")[1];
                }
                jsonObject.addProperty((String)charSequence, (String)var1_11);
            }
        }
        if ((spiderApi = this.I) != null) {
            object = com.github.catvod.spider.merge.ka.d.b("\u8bf7\u6c42\u5934--> ");
            ((StringBuilder)object).append(jsonObject.toString());
            spiderApi.log(((StringBuilder)object).toString());
        }
        return jsonObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String z(String string, String charSequence) {
        try {
            boolean bl;
            Object object;
            block15: {
                block14: {
                    if (((String)charSequence).indexOf("&&") >= 0) break block14;
                    object = charSequence;
                    if (((String)charSequence).length() >= 1) break block15;
                }
                object = "data";
            }
            boolean bl2 = ((String)object).endsWith(";json;");
            int n2 = 0;
            if (bl2) {
                object = ((String)object).substring(0, ((String)object).length() - 6);
                bl = true;
            } else {
                bl = false;
            }
            if (((String)object).indexOf("[") >= 0) return "";
            charSequence = ((String)object).split("\\.");
            while (n2 < ((CharSequence)charSequence).length) {
                object = new JSONObject(string);
                if (n2 == ((CharSequence)charSequence).length - 1) {
                    if (bl) {
                        if ((object = object.get((String)charSequence[n2])) instanceof JSONObject) {
                            string = (JSONObject)object;
                        } else {
                            if (!(object instanceof JSONArray)) return "";
                            string = new JSONObject();
                            string = string.put((String)charSequence[n2], (Object)((JSONArray)object));
                        }
                        string = string.toString();
                    } else {
                        string = object.optString((String)charSequence[n2]).trim().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll("\"", "");
                    }
                    if (string == null) return "";
                    return string;
                }
                string = object.getJSONObject((String)charSequence[n2]).toString();
                ++n2;
            }
            return "";
        }
        catch (JSONException jSONException) {
            SpiderApi spiderApi;
            if (this.m) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.G);
                ((StringBuilder)charSequence).append("\u8c03\u8bd5->getJsonString\u51fa\u9519\uff1a");
                ((StringBuilder)charSequence).append(((Object)((Object)jSONException)).toString());
                Init.show(((StringBuilder)charSequence).toString());
            }
            if ((spiderApi = this.I) == null) return "";
            charSequence = com.github.catvod.spider.merge.ka.d.b("getJsonString()\u9519\u8bef\uff01-->");
            ((StringBuilder)charSequence).append(((Object)((Object)jSONException)).toString());
            spiderApi.log(((StringBuilder)charSequence).toString());
            return "";
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final String C(String string) {
        int n2;
        String[] stringArray;
        JSONObject jSONObject;
        CharSequence charSequence;
        int n3;
        String string2;
        try {
            block15: {
                block14: {
                    string2 = this.H("\u64ad\u653e\u8bf7\u6c42\u5934", "\u76f4\u63a5\u64ad\u653e\u76f4\u94fe\u89c6\u9891\u8bf7\u6c42\u5934", "play_header", "").trim();
                    n3 = string2.length();
                    charSequence = string2;
                    if (n3 > 1) {
                        charSequence = string2;
                        if (string2.indexOf("@") > 0) {
                            charSequence = string2.replace("@", "$").replace("&&", "#").replace("\uff1b\uff1b", ";");
                        }
                    }
                    if (((String)charSequence).startsWith("{") && ((String)charSequence).endsWith("}")) {
                        return charSequence;
                    }
                    jSONObject = new JSONObject();
                    string2 = this.M((String)charSequence);
                    jSONObject.put("User-Agent", (Object)string2);
                    n3 = this.s.indexOf("C");
                    if (n3 >= 0 && this.o(string).length() > 1) {
                        jSONObject.put("Cookie", (Object)this.o(string));
                    }
                    if (((String)charSequence).indexOf("Referer") < 0 && this.s.indexOf("R1") >= 0) break block14;
                    if (((String)charSequence).indexOf("Referer") >= 0 || this.s.indexOf("R") < 0) break block15;
                    stringArray = new StringBuilder();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append("/");
                    stringArray.append(stringBuilder.toString().replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                    stringArray.append("/");
                    string = stringArray.toString();
                }
                jSONObject.put("Referer", (Object)string);
            }
            if ((string = ((String)charSequence).replaceAll(".*\u7535\u8111#", "").replaceAll(".*\u624b\u673a#", "").replaceAll(".*_UA#", "")).indexOf("$") < 0) return jSONObject.toString();
            stringArray = string.split("#");
            n2 = stringArray.length;
            n3 = 0;
        }
        catch (JSONException jSONException) {
            if (this.m) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.G);
                ((StringBuilder)charSequence).append("\u8c03\u8bd5->getPlayHeaders\u51fa\u9519\uff1a");
                ((StringBuilder)charSequence).append(((Object)((Object)jSONException)).toString());
                Init.show(((StringBuilder)charSequence).toString());
            }
            if ((string2 = this.I) == null) return "";
            charSequence = com.github.catvod.spider.merge.ka.d.b("getPlayHeaders()\u9519\u8bef\uff01-->");
            ((StringBuilder)charSequence).append(((Object)((Object)jSONException)).toString());
            string2.log(((StringBuilder)charSequence).toString());
            return "";
        }
        while (n3 < n2) {
            string = stringArray[n3];
            {
                if (!("User-Agent".equals(string.split("\\$")[0]) && string2.length() > 0 || "Cookie".equals(string.split("\\$")[0]) || "cookie".equals(string.split("\\$")[0]))) {
                    charSequence = string.split("\\$")[0];
                    string = string.split("\\$")[1].equals("\u7a7a") ? "" : string.split("\\$")[1];
                    jSONObject.put((String)charSequence, (Object)string);
                }
                ++n3;
            }
        }
        return jSONObject.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final HashMap<String, String> L(String string3) {
        String string2;
        HashMap<String, String> hashMap;
        block11: {
            block10: {
                String[] stringArray;
                block9: {
                    hashMap = new HashMap<String, String>();
                    stringArray = this.I("\u641c\u7d22\u8bf7\u6c42\u5934", "\u641c\u7d22\u8bf7\u6c42\u5934\u53c2\u6570", "search_header", "SHeaders", "");
                    if (!"\u641c\u7d22".equals(this.r) || stringArray.length() <= 1) {
                        stringArray = this.J("\u8bf7\u6c42\u5934", "\u8bf7\u6c42\u5934\u53c2\u6570", "ua", "Headers", "UserAgent", "");
                    }
                    string2 = stringArray;
                    if (stringArray.length() > 1) {
                        string2 = stringArray;
                        if (stringArray.indexOf("@") > 0) {
                            string2 = stringArray.replace("@", "$").replace("&&", "#").replace("\uff1b\uff1b", ";");
                        }
                    }
                    hashMap.put("User-Agent", this.M(string2));
                    stringArray = this.o(string3);
                    if (this.s.indexOf("c0") < 0 && stringArray.length() > 1) {
                        hashMap.put("Cookie", (String)stringArray);
                    }
                    if (string2.indexOf("Referer") >= 0 || this.s.indexOf("r1") < 0) break block9;
                    string3 = string3.split(";")[0];
                    break block10;
                }
                if (string2.indexOf("Referer") >= 0 || this.s.indexOf("r") < 0) break block11;
                stringArray = new StringBuilder();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append("/");
                stringArray.append(stringBuilder.toString().replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                stringArray.append("/");
                string3 = stringArray.toString();
            }
            hashMap.put("Referer", string3);
        }
        if ((string3 = string2.replaceAll(".*\u7535\u8111#", "").replaceAll(".*\u624b\u673a#", "").replaceAll(".*_UA#", "")).indexOf("$") >= 0) {
            for (String string3 : string3.split("#")) {
                if ("Cookie".equals(string3.split("\\$")[0]) || "cookie".equals(string3.split("\\$")[0])) continue;
                string2 = string3.split("\\$")[0];
                string3 = string3.split("\\$")[1].equals("\u7a7a") ? "" : string3.split("\\$")[1];
                hashMap.put(string2, string3);
            }
        }
        return hashMap;
    }

    /*
     * Unable to fully structure code
     */
    protected final String M(String var1_1) {
        block9: {
            block7: {
                block8: {
                    var2_2 = this.E("\u767b\u5f55");
                    if (!"\u641c\u7d22".equals(this.r)) {
                        if (XBPQ.K.length() > 1) {
                            return XBPQ.K;
                        }
                        if (this.s.indexOf("c") < 0 && (var2_2.length() > 1 || this.s.indexOf("y") >= 0 || this.s.indexOf("Y") >= 0 || this.s.indexOf("L") >= 0 || this.s.indexOf("\u70b9\u51fb") >= 0 || this.E("\u9a8c\u8bc1").length() > 0 || this.E("\u6d4f\u89c8\u5668").length() > 0)) {
                            var2_2 = Init.d;
                            var3_3 = new StringBuilder();
                            var3_3.append(this.G);
                            var3_3.append("_ua");
                            var2_2 = var2_2.getString(var3_3.toString(), "");
                            if (var2_2.length() > 1) {
                                XBPQ.K = var2_2;
                                return var2_2;
                            }
                        }
                    }
                    var2_2 = var1_1;
                    if (var1_1.length() < 1) {
                        var2_2 = this.J("\u8bf7\u6c42\u5934", "\u8bf7\u6c42\u5934\u53c2\u6570", "ua", "Headers", "UserAgent", "");
                    }
                    if ((var1_1 = var2_2.replace("@", "$").replace("&&", "#").replace("\uff1b\uff1b", ";").trim()).isEmpty() || var1_1.indexOf("\u624b\u673a") >= 0 || var1_1.indexOf("MOBILE_UA") >= 0 || var1_1.indexOf("\u7535\u8111") >= 0 || var1_1.indexOf("PC_UA") >= 0 || var1_1.indexOf("User-Agent") < 0 && (this.s.indexOf("a") >= 0 || this.s.indexOf("A") >= 0 || this.s.indexOf("W") >= 0)) break block7;
                    if (var1_1.indexOf("User-Agent$") < 0) break block8;
                    var2_2 = new StringBuilder();
                    var2_2.append(var1_1);
                    var2_2.append("#");
                    var1_1 = var2_2.toString().replaceAll(".*User-Agent\\$(.*?)#.*", "$1");
                    break block9;
                }
                if (var1_1.indexOf("$") >= 0) ** GOTO lbl-1000
                break block9;
            }
            if (var1_1.indexOf("\u624b\u673a") < 0 && var1_1.indexOf("MOBILE_UA") < 0 && this.s.indexOf("a") < 0 && this.s.indexOf("A") < 0) {
                var1_1 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = "Mozilla/5.0 (Linux; Android 11; Ghxi Build/RKQ1.200826.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/76.0.3809.89 Mobile Safari/537.36";
            }
        }
        XBPQ.K = var1_1;
        return var1_1;
    }

    final String X(String string) {
        return com.github.catvod.spider.merge.Dw.i.l(string).p0();
    }

    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> hashMap) {
        SpiderApi spiderApi = this.I;
        if (spiderApi != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("categoryContent(tid=");
            stringBuilder.append(string);
            stringBuilder.append(", pg=");
            stringBuilder.append(string2);
            stringBuilder.append(", filter=");
            stringBuilder.append(bl);
            stringBuilder.append(", extend=");
            stringBuilder.append(((Object)hashMap).toString());
            stringBuilder.append(")");
            spiderApi.log(stringBuilder.toString());
        }
        string = this.e(string, string2, bl, hashMap);
        string2 = "";
        if ((string = string != null ? string.toString() : "").length() > 20) {
            string2 = string;
        }
        return string2;
    }

    public String decrypt(String string, String string2, String object, String string3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(((String)object).getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            object = new IvParameterSpec(string3.getBytes());
            cipher.init(2, (Key)secretKeySpec, (AlgorithmParameterSpec)object);
            string = new String(cipher.doFinal(Base64.decode((String)string, (int)0)), string2);
            return string;
        }
        catch (Exception exception) {
            string2 = this.I;
            if (string2 != null) {
                com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("decrypt()\u9519\u8bef-->"), (SpiderApi)string2);
            }
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    public String detailContent(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 35[TRYBLOCK] [60 : 2005->2155)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public String encrypt(String string, String string2, String object, String string3) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            SecretKeySpec secretKeySpec = new SecretKeySpec(((String)object).getBytes(), "AES");
            object = new IvParameterSpec(string3.getBytes());
            cipher.init(1, (Key)secretKeySpec, (AlgorithmParameterSpec)object);
            string = Base64.encodeToString((byte[])cipher.doFinal(string.getBytes(string2)), (int)0);
            return string;
        }
        catch (Exception exception) {
            string2 = this.I;
            if (string2 != null) {
                com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("encrypt()\u9519\u8bef-->"), (SpiderApi)string2);
            }
            return null;
        }
    }

    protected final String f(String charSequence, String object, boolean bl, HashMap<String, String> object2) {
        CharSequence charSequence2;
        Object object3;
        String string;
        CharSequence charSequence3;
        block21: {
            block20: {
                if (((String)charSequence).startsWith("http")) {
                    return charSequence;
                }
                charSequence3 = this.b;
                string = this.H("\u7279\u6b8a\u5206\u7c7b", "\u7279\u6b8a\u5206\u7c7burl", "\u7279\u6b8a\u5206\u7c7b\u94fe\u63a5", "");
                object3 = this.I("\u8d77\u59cb\u9875", "\u5206\u7c7b\u8d77\u59cb\u9875\u7801", "qishiye", "firstpage", "1");
                charSequence2 = charSequence3;
                if (this.r.length() > 0) {
                    charSequence2 = charSequence3;
                    if (string.indexOf("$") >= 0) {
                        charSequence2 = charSequence3;
                        if (string.indexOf(this.r) >= 0) {
                            charSequence2 = com.github.catvod.spider.merge.dp.n.a(string, "#");
                            charSequence3 = com.github.catvod.spider.merge.ka.d.b(".*");
                            ((StringBuilder)charSequence3).append(this.r);
                            ((StringBuilder)charSequence3).append(".*?\\$(.*?)#.*");
                            charSequence2 = ((String)charSequence2).replaceAll(((StringBuilder)charSequence3).toString(), "$1");
                        }
                    }
                }
                if (((String)charSequence2).indexOf("[") >= 0) break block20;
                charSequence3 = charSequence2;
                if (((String)charSequence2).indexOf("|") < 0) break block21;
            }
            charSequence3 = ((String)object).equals(object3) ? ((String)charSequence2).replaceAll(".*[\\[|\\|].*(http[^\\]]*)\\]?.*", "$1").replace("firstPage=", "") : ((String)charSequence2).replaceAll("\\|\\|", "\\|").replaceAll("(.*)[\\[|\\|].*", "$1");
        }
        charSequence2 = charSequence3;
        if (bl) {
            charSequence2 = charSequence3;
            if (this.a) {
                charSequence2 = charSequence3;
                if (object2 != null) {
                    charSequence2 = charSequence3;
                    if (((HashMap)object2).size() > 0) {
                        object3 = ((HashMap)object2).keySet().iterator();
                        while (true) {
                            charSequence2 = charSequence3;
                            if (!object3.hasNext()) break;
                            string = (String)object3.next();
                            String string2 = (String)((HashMap)object2).get(string);
                            if (string2.length() <= 0) continue;
                            charSequence2 = new StringBuilder();
                            ((StringBuilder)charSequence2).append("{");
                            ((StringBuilder)charSequence2).append(string);
                            ((StringBuilder)charSequence2).append("}");
                            charSequence3 = ((String)charSequence3).replace(((StringBuilder)charSequence2).toString(), URLEncoder.encode(string2));
                        }
                    }
                }
            }
        }
        object2 = charSequence2;
        if (((String)charSequence2).startsWith("/")) {
            object2 = charSequence2;
            if (!((String)charSequence2).startsWith("//")) {
                object2 = com.github.catvod.spider.merge.dp.n.b(new StringBuilder(), this.f, (String)charSequence2);
            }
        }
        if (((String)object2).indexOf("{catePg}") < 0) {
            charSequence = ((String)object2).replace("{cateId}", charSequence);
        } else {
            int n2 = ((String)object).indexOf("-");
            object2 = ((String)object2).replace("{cateId}", charSequence);
            if (n2 < 1) {
                charSequence = ((String)object2).replace("{catePg}", (CharSequence)object);
            } else {
                charSequence = ((String)object2).replace("{catePg}", ((String)object).split("-")[0]);
                for (n2 = Integer.parseInt(((String)object).split("-")[0]) + 1; n2 <= Integer.parseInt(((String)object).split("-")[1]); ++n2) {
                    charSequence3 = new StringBuilder();
                    ((StringBuilder)charSequence3).append((String)charSequence);
                    ((StringBuilder)charSequence3).append("$$$");
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("");
                    ((StringBuilder)charSequence).append(n2);
                    ((StringBuilder)charSequence3).append(((String)object2).replace("{catePg}", ((StringBuilder)charSequence).toString()));
                    charSequence = ((StringBuilder)charSequence3).toString();
                }
            }
        }
        object = Pattern.compile("\\{(.*?)\\}").matcher(charSequence);
        while (((Matcher)object).find()) {
            object2 = ((Matcher)object).group(0).replace("{", "").replace("}", "");
            charSequence3 = ((String)charSequence).replace(((Matcher)object).group(0), "");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("/");
            charSequence = ((String)charSequence3).replace(((StringBuilder)charSequence).toString(), "");
        }
        return charSequence;
    }

    /*
     * Unable to fully structure code
     */
    protected final String f0(String var1_1, String var2_2, String var3_4, String var4_5) {
        block60: {
            block58: {
                block59: {
                    block55: {
                        block56: {
                            block54: {
                                if ("0".equals(this.A)) {
                                    return var3_4;
                                }
                                this.H = var5_7 = this.H + 1;
                                if (var5_7 == 2 && this.s.indexOf("c") < 0) {
                                    this.s = com.github.catvod.spider.merge.dp.n.b(new StringBuilder(), this.s, "c");
                                }
                                if (this.H == 4) {
                                    this.H = 0;
                                    return var3_4;
                                }
                                var9_8 = var2_2.split("###")[1];
                                var8_9 = var2_2.split("###")[0];
                                var2_2 = var4_5;
                                var10_10 = this.n(var8_9, (String)var4_5);
                                var2_2 = var4_5;
                                var7_11 = var10_10.getString("str");
                                var2_2 = var4_5;
                                var2_2 = var4_5 = var10_10.getString("codeUrl");
                                if (var3_4.indexOf("\u8f93\u5165\u9a8c\u8bc1\u7801") < 0) break block54;
                                var2_2 = var4_5;
                                com.github.catvod.spider.merge.nz.k.i = "\u8bf7\u8f93\u5165\u9a8c\u8bc1\u7801";
                                break block55;
                            }
                            var2_2 = var4_5;
                            var5_7 = var3_4.indexOf("\u6ed1\u52a8\u9a8c\u8bc1");
                            if (var5_7 >= 0) break block56;
                            var2_2 = var4_5;
                            if (var3_4.indexOf("\u4eba\u673a\u9a8c\u8bc1") >= 0) break block56;
                            var2_2 = var4_5;
                            com.github.catvod.spider.merge.nz.k.i = "\u7f51\u9875\u6d4f\u89c8";
                            var7_11 = var8_9;
                            break block55;
                        }
                        var2_2 = var4_5;
                        com.github.catvod.spider.merge.nz.k.i = "\u4eba\u673a\u9a8c\u8bc1";
                    }
                    var2_2 = var4_5;
                    var10_10 = this.z;
                    var2_2 = var4_5;
                    var2_2 = var4_5;
                    var11_13 = new XBPQc(this, (String)var7_11, (String)var10_10);
                    var2_2 = var4_5;
                    Init.run(var11_13, 200);
                    while (true) {
                        var2_2 = var4_5;
                        var6_14 = "".equals(this.A);
                        var7_11 = var4_5;
                        if (!var6_14) break;
                        try {
                            Thread.sleep(500L);
                            continue;
                        }
                        catch (Exception var7_12) {
                            block57: {
                                var2_2 = var4_5;
                                if (!this.m) break block57;
                                var2_2 = var4_5;
                                var2_2 = var4_5;
                                var10_10 = new StringBuilder();
                                var2_2 = var4_5;
                                var10_10.append(this.G);
                                var2_2 = var4_5;
                                var10_10.append("\u8c03\u8bd5->webViewDialog\u7761\u7720\u9519\uff1a");
                                var2_2 = var4_5;
                                var10_10.append(var7_12.toString());
                                var2_2 = var4_5;
                                Init.show(var10_10.toString());
                            }
                            var2_2 = var4_5;
                            var11_13 = this.I;
                            if (var11_13 == null) continue;
                            var2_2 = var4_5;
                            var2_2 = var4_5;
                            var10_10 = new StringBuilder();
                            var2_2 = var4_5;
                            var10_10.append("webViewDialog\u7761\u7720\u9519\u8bef-->");
                            var2_2 = var4_5;
                            var10_10.append(var7_12.toString());
                            var2_2 = var4_5;
                            try {
                                var11_13.log(var10_10.toString());
                                continue;
                            }
                            catch (Exception var4_6) {
                                if (this.m) {
                                    var7_11 = new StringBuilder();
                                    var7_11.append(this.G);
                                    var7_11.append("\u8c03\u8bd5->\u9a8c\u8bc1\u51fa\u9519\uff1a");
                                    var7_11.append(var4_6.toString());
                                    Init.show(var7_11.toString());
                                }
                                var10_10 = this.I;
                                var7_11 = var2_2;
                                if (var10_10 == null) break;
                                com.github.catvod.spider.merge.Dw.f.a(var4_6, com.github.catvod.spider.merge.ka.d.b("\u9a8c\u8bc1\u9519\u8bef-->"), (SpiderApi)var10_10);
                                var7_11 = var2_2;
                            }
                        }
                        break;
                    }
                    if ("1".equals(this.A)) {
                        this.A = "";
                    }
                    if ("".equals(this.A) || "0".equals(this.A) || this.s.indexOf("Y") >= 0) break block60;
                    if (var7_11.indexOf("{code}") > 0) {
                        var4_5 = var7_11.replace("{code}", this.A);
                    } else {
                        var2_2 = com.github.catvod.spider.merge.ka.d.b((String)var7_11);
                        var2_2.append(this.A);
                        var4_5 = var2_2.toString();
                    }
                    if (!"\u641c\u7d22".equals(this.r)) {
                        if (this.s.indexOf("c") >= 0) {
                            var2_2 = this.t(var8_9);
                        } else {
                            this.s = com.github.catvod.spider.merge.dp.n.b(new StringBuilder(), this.s, "c");
                            var2_2 = this.t(var8_9);
                            this.s = this.s.replace("c", "");
                        }
                    } else {
                        var2_2 = this.L(var8_9);
                    }
                    if (this.m) {
                        Init.show(this.z);
                    }
                    if (var4_5.indexOf(";post;") < 0) {
                        com.github.catvod.spider.merge.lq.b.g((String)var4_5, (Map<String, String>)var2_2);
                        break block58;
                    }
                    var7_11 = new XBPQ$5();
                    com.github.catvod.spider.merge.mk.g.e(com.github.catvod.spider.merge.mk.g.b(), var4_5.split(";")[0], null, var2_2, (c)var7_11);
                    var2_2 = (String)var7_11.getResult();
                    var6_14 = this.m;
                    if (!var6_14) ** GOTO lbl156
                    var4_5 = var2_2 != null ? var2_2 : "\u9a8c\u8bc1\u5931\u8d25";
                    Init.show((String)var4_5);
lbl156:
                    // 2 sources

                    if ((var4_5 = this.I) == null) break block58;
                    var7_11 = new StringBuilder();
                    var7_11.append("\u9a8c\u8bc1\u7ed3\u679c--> ");
                    var7_11.append((String)var2_2);
                    if (var7_11.toString() != null) break block59;
                    var2_2 = "\u9a8c\u8bc1\u5931\u8d25";
                }
                try {
                    var4_5.log((String)var2_2);
                }
                catch (Exception var2_3) {
                    if (this.m) {
                        var4_5 = new StringBuilder();
                        var4_5.append(this.G);
                        var4_5.append("\u8c03\u8bd5->webViewDialog\u9a8c\u8bc1\u540epost\u9519\uff1a");
                        var4_5.append(var2_3.toString());
                        Init.show(var4_5.toString());
                    }
                    if ((var4_5 = this.I) == null) break block58;
                    com.github.catvod.spider.merge.Dw.f.a(var2_3, com.github.catvod.spider.merge.ka.d.b("webViewDialog\u9a8c\u8bc1\u540epost\u9519\u8bef-->"), (SpiderApi)var4_5);
                }
            }
            if (!"0".equals(this.A)) {
                this.A = "";
            }
        }
        if ("0".equals(this.A)) {
            return var3_4;
        }
        if ("fetch".equals(var1_1)) {
            var3_4 = this.k(var9_8);
        }
        if ("fetchPost".equals(var1_1)) {
            var3_4 = this.l(var9_8);
        }
        return var3_4;
    }

    public String getToken(String string, String string2, String string3, String string4) {
        return this.encrypt(string, string2, string3, string4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String homeContent(boolean var1_1) {
        block70: {
            block69: {
                block65: {
                    block66: {
                        block68: {
                            block63: {
                                block64: {
                                    block62: {
                                        block59: {
                                            block60: {
                                                block61: {
                                                    block54: {
                                                        block58: {
                                                            block57: {
                                                                block56: {
                                                                    block55: {
                                                                        block48: {
                                                                            block49: {
                                                                                block53: {
                                                                                    block52: {
                                                                                        block51: {
                                                                                            block50: {
                                                                                                block47: {
                                                                                                    var11_2 = new JSONObject();
                                                                                                    var8_3 = new JSONArray();
                                                                                                    var12_4 = this.G("\u6a2a\u56fe", "\u6a2a\u56fe\u6a21\u5f0f", "");
                                                                                                    var6_5 /* !! */  = this.E("\u5206\u7c7b\u8be6\u60c5");
                                                                                                    if (var6_5 /* !! */ .indexOf("\u7c7b\u578b") < 0 && var6_5 /* !! */ .indexOf("\u5e74\u4efd") < 0 && var6_5 /* !! */ .indexOf("\u5730\u533a") < 0 && var6_5 /* !! */ .indexOf("\u5bfc\u6f14") < 0 && var6_5 /* !! */ .indexOf("\u4e3b\u6f14") < 0 && var6_5 /* !! */ .indexOf("\u7b80\u4ecb") < 0) {
                                                                                                        var2_12 = false;
                                                                                                        break block47;
                                                                                                    }
                                                                                                    var2_12 = true;
                                                                                                }
                                                                                                var3_13 = this.s.indexOf("h");
                                                                                                if (var3_13 >= 0) break block48;
                                                                                                if ("1".equals(var12_4) || "\u5168\u90e8".equals(var12_4) || var12_4.indexOf("\u9996\u9875") >= 0) break block48;
                                                                                                if (!var2_12) break block49;
                                                                                                var7_14 = this.q((String)var6_5 /* !! */ , "\u5217\u6570");
                                                                                                if (var7_14.length() <= 0) break block50;
                                                                                                var6_5 /* !! */  = var7_14;
                                                                                                if (var7_14.matches("\\d")) break block51;
                                                                                            }
                                                                                            var6_5 /* !! */  = "0";
                                                                                        }
                                                                                        if (!"2".equals(var6_5 /* !! */ )) break block52;
                                                                                        var6_5 /* !! */  = "32";
                                                                                        break block53;
                                                                                    }
                                                                                    if (!"1".equals(var6_5 /* !! */ )) break block53;
                                                                                    var6_5 /* !! */  = "21";
                                                                                }
                                                                                var7_14 = new StringBuilder();
                                                                                var7_14.append("3-");
                                                                                var7_14.append((String)var6_5 /* !! */ );
                                                                                var11_2.put("type_flag", (Object)var7_14.toString());
                                                                                var7_14 = "";
                                                                                break block54;
                                                                            }
                                                                            var6_5 /* !! */  = "";
                                                                            var7_14 = "";
                                                                            break block54;
                                                                        }
                                                                        var7_14 = this.q(var12_4, "\u5217\u6570");
                                                                        if (var7_14.length() <= 0) break block55;
                                                                        var6_5 /* !! */  = var7_14;
                                                                        if (var7_14.matches("\\d")) break block56;
                                                                    }
                                                                    var6_5 /* !! */  = "0";
                                                                }
                                                                if (this.s.indexOf("h2") < 0) break block57;
                                                                var6_5 /* !! */  = "32";
                                                                break block58;
                                                            }
                                                            if (this.s.indexOf("h1") < 0) break block58;
                                                            var6_5 /* !! */  = "21";
                                                        }
                                                        var7_14 = new StringBuilder();
                                                        var7_14.append("2-");
                                                        var7_14.append((String)var6_5 /* !! */ );
                                                        var7_14.append("-H");
                                                        var11_2.put("type_flag", (Object)var7_14.toString());
                                                        var9_15 = "";
                                                        var7_14 = var6_5 /* !! */ ;
                                                        var6_5 /* !! */  = var9_15;
                                                    }
                                                    this.c = this.m();
                                                    var10_16 /* !! */  = this.G("\u5217\u8868\u5206\u7c7b", "fenlei", "");
                                                    var9_15 = var10_16 /* !! */ ;
                                                    if (var10_16 /* !! */ .isEmpty()) {
                                                        var9_15 = this.c;
                                                    }
                                                    var10_16 /* !! */  = var9_15.split("#");
                                                    var3_13 = var10_16 /* !! */ .length;
                                                    var9_15 = var8_3;
                                                    var8_3 = var11_2;
                                                    for (var4_17 = 0; var4_17 < var3_13; ++var4_17) {
                                                        block67: {
                                                            var11_2 = var10_16 /* !! */ [var4_17].split("\\$");
                                                            var13_18 = new JSONObject();
                                                            var13_18.put("type_name", (Object)var11_2[0]);
                                                            var13_18.put("type_id", (Object)var11_2[1]);
                                                            if (this.s.indexOf("h") >= 0 || "1".equals(var12_4) || "\u5168\u90e8".equals(var12_4) || var12_4.indexOf((String)var11_2[0]) >= 0) ** GOTO lbl111
                                                            if (!var2_12) ** GOTO lbl122
                                                            var11_2 = new StringBuilder();
                                                            var11_2.append("3-");
                                                            var11_2.append((String)var6_5 /* !! */ );
                                                            var11_2 = var11_2.toString();
                                                            break block67;
lbl111:
                                                            // 1 sources

                                                            var11_2 = new StringBuilder();
                                                            var11_2.append("2-");
                                                            var11_2.append((String)var7_14);
                                                            var11_2.append("-H");
                                                            var11_2 = var11_2.toString();
                                                        }
                                                        var13_18.put("type_flag", var11_2);
lbl122:
                                                        // 2 sources

                                                        var9_15.put((Object)var13_18);
                                                        continue;
                                                    }
                                                    var8_3.put("class", var9_15);
                                                    var7_14 = this.B.optJSONObject("\u7b5b\u9009");
                                                    var6_5 /* !! */  = "filterdata";
                                                    if (var7_14 != null) break block59;
                                                    if (!this.E("\u7b5b\u9009").isEmpty()) break block59;
                                                    if (this.B.optJSONObject("\u7b5b\u9009\u6570\u636e") != null || !this.E("\u7b5b\u9009\u6570\u636e").isEmpty()) break block60;
                                                    if (this.B.optJSONObject("filter") == null) break block61;
                                                    var6_5 /* !! */  = "filter";
                                                    break block62;
                                                }
                                                if (this.B.optJSONObject("filterdata") == null) {
                                                    var6_5 /* !! */  = "";
                                                }
                                                break block62;
                                            }
                                            var6_5 /* !! */  = "\u7b5b\u9009\u6570\u636e";
                                            break block62;
                                        }
                                        var6_5 /* !! */  = "\u7b5b\u9009";
                                    }
                                    var7_14 = this.B.optJSONObject((String)var6_5 /* !! */ );
                                    var9_15 = this.E((String)var6_5 /* !! */ );
                                    var6_5 /* !! */  = this.b;
                                    if ("0".equals(this.E("\u7b5b\u9009"))) break block63;
                                    if (var6_5 /* !! */ .indexOf("{class}") >= 0 || var6_5 /* !! */ .indexOf("{area}") >= 0 || var6_5 /* !! */ .indexOf("{year}") >= 0 || var6_5 /* !! */ .indexOf("{by}") >= 0 || var6_5 /* !! */ .indexOf("{letter}") >= 0 || var6_5 /* !! */ .indexOf("{lang}") >= 0) break block64;
                                    try {
                                        if (this.G("\u7c7b\u578b", "\u7b5b\u9009\u5b50\u5206\u7c7b\u540d\u79f0", "").length() > 1) break block64;
                                        if (var7_14 == null) ** GOTO lbl161
                                    }
                                    catch (Exception var6_6) {}
                                    if (var7_14.length() > 0) break block64;
lbl161:
                                    // 2 sources

                                    if (var9_15.length() <= 1) break block63;
                                }
                                var5_19 = true;
                                break block68;
                            }
                            var5_19 = false;
                        }
                        this.a = var5_19;
                        if (!var1_1 || !var5_19) ** GOTO lbl234
                        if (var9_15.startsWith("http") || var9_15.startsWith("clan")) ** GOTO lbl179
                        if (var7_14 == null) ** GOTO lbl177
                        var6_5 /* !! */  = var7_14;
                        if (!var9_15.equals("ext")) break block65;
lbl177:
                        // 2 sources

                        var6_5 /* !! */  = this.s();
                        break block65;
lbl179:
                        // 1 sources

                        var6_5 /* !! */  = InetAddress.getLocalHost();
                        var11_2 = new StringBuilder("http://");
                        var11_2.append(var6_5 /* !! */ .getHostAddress());
                        var11_2.append(":");
                        var11_2.append(this.J);
                        var11_2.append("/file/");
                        var10_16 /* !! */  = "clan://";
                        var6_5 /* !! */  = var9_15;
                        if (!var9_15.startsWith("clan://")) ** GOTO lbl200
                        var6_5 /* !! */  = var10_16 /* !! */ ;
                        if (!var9_15.startsWith("clan://localhost/")) break block66;
                        var6_5 /* !! */  = "clan://localhost/";
                    }
                    var6_5 /* !! */  = var9_15.replace((CharSequence)var6_5 /* !! */ , var11_2.toString());
lbl200:
                    // 2 sources

                    var9_15 = com.github.catvod.spider.merge.lq.b.h((String)var6_5 /* !! */ , null, null);
                    var6_5 /* !! */  = var7_14;
                    if (var9_15 == null) break block65;
                    var6_5 /* !! */  = new JSONObject((String)var9_15);
                }
                if (var6_5 /* !! */  == null) ** GOTO lbl234
                var8_3.put("filters", (Object)var6_5 /* !! */ );
                ** GOTO lbl234
                break block69;
                catch (Exception var6_7) {
                    // empty catch block
                }
            }
            try {
                if (this.m) {
                    var7_14 = new StringBuilder();
                    var7_14.append(this.G);
                    var7_14.append("\u8c03\u8bd5->\u83b7\u53d6\u7b5b\u9009\u51fa\u9519\uff1a");
                    var7_14.append(var6_5 /* !! */ .toString());
                    Init.show(var7_14.toString());
                }
                if ((var7_14 = this.I) == null) ** GOTO lbl234
            }
            catch (Exception var6_8) {}
            var9_15 = new StringBuilder();
            var9_15.append("\u83b7\u53d6\u7b5b\u9009\u9519\u8bef\uff01-->");
            var9_15.append(var6_5 /* !! */ .toString());
            var7_14.log(var9_15.toString());
lbl234:
            // 5 sources

            var6_5 /* !! */  = var8_3.toString();
            return var6_5 /* !! */ ;
            break block70;
            catch (Exception var6_9) {}
            break block70;
            catch (Exception var6_10) {
                // empty catch block
            }
        }
        if (this.m) {
            var7_14 = new StringBuilder();
            var7_14.append(this.G);
            var7_14.append("\u8c03\u8bd5->homeContent\u51fa\u9519\uff1a");
            var7_14.append(var6_11.toString());
            Init.show(var7_14.toString());
        }
        if ((var7_14 = this.I) != null) {
            com.github.catvod.spider.merge.Dw.f.a((Exception)var6_11, com.github.catvod.spider.merge.ka.d.b("homeContent()\u9519\u8bef\uff01-->"), (SpiderApi)var7_14);
        }
        return "";
    }

    /*
     * Unable to fully structure code
     */
    public String homeVideoContent() {
        block14: {
            block16: {
                block15: {
                    block13: {
                        block18: {
                            block17: {
                                block12: {
                                    block11: {
                                        var5_1 = "";
                                        var3_2 = this.I("\u9996\u9875", "\u70ed\u95e8", "homeContent", "shouye", "40");
                                        var2_4 = var3_2.equals("1");
                                        if (var2_4) break block11;
                                        var4_5 = var3_2;
                                        if (!var3_2.equals("\u9996\u9875")) break block12;
                                    }
                                    var4_5 = "40";
                                }
                                var1_6 = this.G("\u5217\u8868\u5206\u7c7b", "fenlei", "").length();
                                if (var1_6 >= 3) ** GOTO lbl23
                                var3_2 = new StringBuilder();
                                var3_2.append(this.c);
                                var3_2.append("#");
                                var3_2 = var3_2.toString();
                                break block17;
lbl23:
                                // 1 sources

                                var3_2 = new StringBuilder();
                                var3_2.append(this.G("\u5217\u8868\u5206\u7c7b", "fenlei", ""));
                                var3_2.append("#");
                                var3_2 = var3_2.toString();
                            }
                            this.e = 40;
                            var1_6 = var4_5.indexOf("$");
                            if (var1_6 < 0) ** GOTO lbl46
                            this.e = Integer.parseInt(var4_5.split("\\$")[1]);
                            var4_5 = var4_5.split("\\$")[0];
                            if (var4_5.equals("\u9996\u9875")) break block18;
                            var6_7 = new StringBuilder();
                            var6_7.append(".*");
                            var6_7.append((String)var4_5);
                            var6_7.append("\\$(.*?)#.*");
                            var4_5 = var6_7.toString();
                            ** GOTO lbl61
lbl46:
                            // 1 sources

                            if (!var4_5.matches("\\d+")) break block13;
                            this.e = Integer.parseInt((String)var4_5);
                        }
                        var3_2 = "";
                        ** GOTO lbl62
                    }
                    var6_8 = new StringBuilder();
                    var6_8.append(".*");
                    var6_8.append((String)var4_5);
                    var6_8.append("\\$(.*?)#.*");
                    var4_5 = var6_8.toString();
lbl61:
                    // 2 sources

                    var3_2 = var3_2.replaceAll((String)var4_5, "$1");
lbl62:
                    // 2 sources

                    if (this.e <= 0) break block14;
                    this.d = true;
                    this.r = "\u9996\u9875";
                    var4_5 = new HashMap();
                    var3_2 = this.e((String)var3_2, "1", false, (HashMap<String, String>)var4_5);
                    this.r = "";
                    this.d = false;
                    if (var3_2 == null) break block15;
                    var3_2 = var3_2.toString();
                    break block16;
                }
                var3_2 = "";
            }
            try {
                var1_6 = var3_2.length();
                var4_5 = var5_1;
                if (var1_6 > 20) {
                    var4_5 = var3_2;
                }
                return var4_5;
            }
            catch (Exception var3_3) {
                if (this.m) {
                    var4_5 = new StringBuilder();
                    var4_5.append(this.G);
                    var4_5.append("\u8c03\u8bd5->\u83b7\u53d6\u9996\u9875\u8d44\u6e90\u51fa\u9519\uff1a");
                    var4_5.append(var3_3.toString());
                    Init.show(var4_5.toString());
                }
                if ((var4_5 = this.I) == null) break block14;
                com.github.catvod.spider.merge.Dw.f.a(var3_3, com.github.catvod.spider.merge.ka.d.b("\u83b7\u53d6\u9996\u9875\u8d44\u6e90\u9519\u8bef\uff01-->"), (SpiderApi)var4_5);
            }
        }
        return "";
    }

    protected final v i0(String string) {
        if (string.indexOf(";post") >= 0) {
            string = this.l(com.github.catvod.spider.merge.dp.n.a("xp", string));
        } else {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.ka.d.b("xp");
            stringBuilder.append(string.split(";")[0]);
            string = this.k(stringBuilder.toString());
        }
        return new v(com.github.catvod.spider.merge.Dw.i.l(string).R());
    }

    public void init(Context context) {
        super.init(context);
    }

    public void init(Context object2, String stringArray) {
        block12: {
            block11: {
                String string;
                block13: {
                    JSONObject jSONObject;
                    String[] stringArray2;
                    this.C = object2;
                    super.init((Context)object2, (String)stringArray2);
                    if (stringArray2 == null) break block12;
                    if (stringArray2.startsWith("http")) {
                        if (stringArray2.indexOf("{cateId}") < 0) {
                            String string2 = com.github.catvod.spider.merge.lq.b.h((String)stringArray2, null, null);
                            stringArray2 = new JSONObject(string2);
                            this.B = stringArray2;
                        } else {
                            JSONObject jSONObject2;
                            this.B = jSONObject2 = new JSONObject();
                            jSONObject2.put("\u5206\u7c7burl", (Object)stringArray2);
                        }
                        break block11;
                    }
                    if (stringArray2.startsWith("{")) {
                        JSONObject jSONObject3;
                        this.B = jSONObject3 = new JSONObject((String)stringArray2);
                        break block11;
                    }
                    this.B = jSONObject = new JSONObject();
                    string = stringArray2.replace("\\,", "\u9017\u53f7");
                    int n2 = string.indexOf(",");
                    if (n2 >= 0) break block13;
                    this.B.put(string.substring(0, string.indexOf(":")), (Object)string.substring(string.indexOf(":") + 1).replace("\u9017\u53f7", ","));
                    break block11;
                }
                for (String string3 : string.split(",")) {
                    this.B.put(string3.substring(0, string3.indexOf(":")), (Object)string3.substring(string3.indexOf(":") + 1).replace("\u9017\u53f7", ","));
                }
            }
            try {
                this.O();
            }
            catch (JSONException jSONException) {
                SpiderApi spiderApi;
                if (this.m) {
                    Init.show("\u8bf7\u68c0\u914d\u7f6eext");
                }
                if ((spiderApi = this.I) == null) break block12;
                StringBuilder stringBuilder = com.github.catvod.spider.merge.ka.d.b("\u8bf7\u68c0\u914d\u7f6eext-->");
                stringBuilder.append(((Object)((Object)jSONException)).toString());
                spiderApi.log(stringBuilder.toString());
            }
        }
    }

    public void initApi(SpiderApi spiderApi) {
        this.I = spiderApi;
        super.initApi(spiderApi);
        CharSequence charSequence = spiderApi.getPort();
        this.J = charSequence;
        Init.e = charSequence;
        charSequence = com.github.catvod.spider.merge.ka.d.b("Id\u7248\u7aef\u53e3\uff1a");
        ((StringBuilder)charSequence).append(this.J);
        spiderApi.log(((StringBuilder)charSequence).toString());
    }

    public boolean isVideoFormat(String string) {
        if (!(string = string.toLowerCase()).startsWith("http") && !string.startsWith("magnet")) {
            return false;
        }
        String[] stringArray = this.G("\u55c5\u63a2\u8bcd", "VideoFormat", "m3u8#.mp4#.flv#.mp3#.m4a#magnet:#ed2k:#ftp:#thunder:#push:#tvbox-xg:").split("#");
        String[] stringArray2 = this.G("\u8fc7\u6ee4\u8bcd", "VideoFilter", "url=http#;post;#.js").split("#");
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (string.indexOf(stringArray[i2]) < 0) continue;
            n2 = stringArray2.length;
            for (i2 = 0; i2 < n2; ++i2) {
                if (string.indexOf(stringArray2[i2]) < 0) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    final String j(String string) {
        CharSequence charSequence = string;
        if (!string.isEmpty()) {
            int n2 = 0;
            while (true) {
                charSequence = string;
                if (n2 >= 14) break;
                String string2 = (new String[]{"\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|"})[n2];
                charSequence = string;
                if (string.indexOf(string2) >= 0) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("\\");
                    ((StringBuilder)charSequence).append(string2);
                    charSequence = string.replace(string2, ((StringBuilder)charSequence).toString());
                }
                ++n2;
                string = charSequence;
            }
        }
        return charSequence;
    }

    /*
     * Exception decompiling
     */
    protected final String k(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
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

    protected final String l(String charSequence) {
        String string;
        boolean bl;
        Object object;
        block34: {
            block35: {
                int n2;
                Object object2;
                Object object3;
                String string2;
                block31: {
                    block33: {
                        int n3;
                        block32: {
                            string2 = com.github.catvod.spider.merge.dp.n.a("###", (String)charSequence);
                            object = this.N((String)charSequence);
                            bl = ((String)object).startsWith("xp");
                            charSequence = object;
                            if (bl) {
                                charSequence = ((String)object).replaceAll("xp(http.*)", "$1");
                            }
                            object = this.s.indexOf("g") >= 0 ? "GBK" : this.H("\u7f16\u7801", "\u7f51\u9875\u7f16\u7801\u683c\u5f0f", "Coding_format", "UTF-8");
                            boolean bl2 = "UTF-8".equals(object);
                            string = "";
                            if (!bl2) {
                                object3 = this.I;
                                if (object3 != null) {
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append("\u7f16\u7801--> ");
                                    ((StringBuilder)object2).append((String)object);
                                    object3.log(((StringBuilder)object2).toString());
                                }
                                object = this.i((String)charSequence);
                            } else {
                                object = "";
                            }
                            n2 = ((String)object).length();
                            n3 = 0;
                            object2 = charSequence;
                            if (n2 < 1) {
                                XBPQ$6 xBPQ$6;
                                block30: {
                                    Object object4;
                                    object3 = ((String)charSequence).split(";post;")[1].trim();
                                    charSequence = ((String)charSequence).split(";")[0];
                                    object2 = this.s;
                                    if (((String)object2).indexOf("J") >= 0 && ((String)charSequence).indexOf("outerHTML") < 0 && ((String)charSequence).indexOf("innerHTML") < 0 && this.I != null) {
                                        object = this.s.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML";
                                        object2 = ((String)object2).matches(".*Jb?\\d+.*") ? ((String)object2).replaceAll(".*Jb?(\\d+).*", "$1") : "";
                                        object4 = new StringBuilder();
                                        ((StringBuilder)object4).append(this.I.getAddress(true));
                                        ((StringBuilder)object4).append("webparse/");
                                        ((StringBuilder)object4).append((String)charSequence);
                                        ((StringBuilder)object4).append("<<eval");
                                        ((StringBuilder)object4).append((String)object2);
                                        ((StringBuilder)object4).append((String)object);
                                        object2 = ((StringBuilder)object4).toString();
                                        object4 = this.I;
                                        object = object2;
                                        if (object4 != null) {
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append("\u6b63\u5728post\u4ee3\u7406--> ");
                                            ((StringBuilder)object).append((String)object2);
                                            ((StringBuilder)object).append("\npostBody--> ");
                                            ((StringBuilder)object).append((String)object3);
                                            object4.log(((StringBuilder)object).toString());
                                            object = object2;
                                        }
                                    } else {
                                        object = charSequence;
                                    }
                                    object2 = !"\u641c\u7d22".equals(this.r) ? this.t((String)charSequence) : this.L((String)charSequence);
                                    xBPQ$6 = new XBPQ$6();
                                    object4 = this.I;
                                    if (object4 != null) {
                                        object4.log("\u53d1\u51fapost\u8bf7\u6c42...");
                                    }
                                    if (!((String)object3).isEmpty()) {
                                        if (((String)object3).startsWith("{") && ((String)object3).endsWith("}")) {
                                            try {
                                                object4 = new JSONObject((String)object3);
                                                com.github.catvod.spider.merge.mk.g.f(com.github.catvod.spider.merge.mk.g.b(), (String)object, object4.toString(), (Map<String, String>)object2, xBPQ$6);
                                            }
                                            catch (JSONException jSONException) {
                                                if (this.m) {
                                                    object2 = new StringBuilder();
                                                    ((StringBuilder)object2).append(this.G);
                                                    ((StringBuilder)object2).append("\u8c03\u8bd5->fetchPost\u51fa\u9519\uff1a");
                                                    ((StringBuilder)object2).append(((Object)((Object)jSONException)).toString());
                                                    Init.show(((StringBuilder)object2).toString());
                                                }
                                                if ((object3 = this.I) != null) {
                                                    object2 = com.github.catvod.spider.merge.ka.d.b("fetchPost()\u9519\u8bef-->");
                                                    ((StringBuilder)object2).append(((Object)((Object)jSONException)).toString());
                                                    object3.log(((StringBuilder)object2).toString());
                                                }
                                                break block30;
                                            }
                                        }
                                        object4 = new LinkedHashMap();
                                        for (String string3 : ((String)object3).split("\\&")) {
                                            if (string3.endsWith("=")) continue;
                                            int n4 = string3.indexOf("=");
                                            ((AbstractMap)object4).put(string3.substring(0, n4), string3.substring(n4 + 1));
                                        }
                                        object3 = com.github.catvod.spider.merge.mk.g.b();
                                    } else {
                                        object3 = com.github.catvod.spider.merge.mk.g.b();
                                        object4 = null;
                                    }
                                    com.github.catvod.spider.merge.mk.g.e((OkHttpClient)object3, (String)object, (Map<String, String>)object4, (Map<String, String>)object2, xBPQ$6);
                                }
                                object = (String)xBPQ$6.getResult();
                                object2 = charSequence;
                            }
                            if (object == null) {
                                object = "";
                            }
                            object = XBPQ.Y(this.R((String)object2, (String)object));
                            n2 = n3;
                            if ("0".equals(this.A)) break block31;
                            if (this.s.indexOf("y") >= 0 || this.s.indexOf("Y") >= 0) break block32;
                            n2 = n3;
                            if (this.E("\u9a8c\u8bc1").length() <= 0) break block31;
                        }
                        if (((String)object).indexOf("\u5b89\u5168\u9a8c\u8bc1") >= 0 || ((String)object).indexOf("\u8f93\u5165\u9a8c\u8bc1\u7801") >= 0 || ((String)object).indexOf("\u6ed1\u52a8\u9a8c\u8bc1") >= 0) break block33;
                        n2 = n3;
                        if (((String)object).indexOf("\u4eba\u673a\u9a8c\u8bc1") < 0) break block31;
                    }
                    n2 = 1;
                }
                charSequence = object;
                if (n2 == 0) break block34;
                object3 = this.I;
                if (object3 != null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("\u9700\u8981\u9a8c\u8bc1\uff0c\u6e90\u7801\u4e3a--> ");
                    ((StringBuilder)charSequence).append((String)object);
                    object3.log(((StringBuilder)charSequence).toString());
                }
                if (((String)(object = this.f0("fetchPost", com.github.catvod.spider.merge.dp.n.a((String)object2, string2), (String)object, this.E("\u9a8c\u8bc1")))).indexOf("\u5b89\u5168\u9a8c\u8bc1") < 0 || ((String)object).indexOf("\u8f93\u5165\u9a8c\u8bc1\u7801") < 0 || ((String)object).indexOf("\u6ed1\u52a8\u9a8c\u8bc1") < 0) break block35;
                charSequence = object;
                if (((String)object).indexOf("\u4eba\u673a\u9a8c\u8bc1") >= 0) break block34;
            }
            Init.show("\u9a8c\u8bc1\u6210\u529f\uff01");
            this.A = "0";
            charSequence = object;
        }
        object = string;
        if (charSequence != null) {
            object = bl ? charSequence : ((String)charSequence).replace(" ", "\u7a7a\u7a7a\u7a7a").replaceAll("\\s+", "").replace("\u7a7a\u7a7a\u7a7a", " ").trim();
        }
        this.x = object;
        return object;
    }

    public Object[] mProxy(Map<String, String> map) {
        return Proxy.proxy(map);
    }

    public boolean manualVideoCheck() {
        boolean bl = !this.G("\u55c5\u63a2\u8bcd", "\u8fc7\u6ee4\u8bcd", "").isEmpty() || this.F("\u624b\u52a8\u55c5\u63a2", "ManualSniffer").equals("1") || this.s.indexOf("x") >= 0;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    protected final String o(String charSequence) {
        Object object;
        String string;
        String string2;
        block24: {
            block23: {
                String string3;
                block22: {
                    String charSequence22;
                    if ("0".equals(this.z)) {
                        return "";
                    }
                    string2 = this.E("\u767b\u5f55");
                    if ("\u641c\u7d22".equals(this.r)) break block22;
                    if (this.z.length() > 1) {
                        return this.z;
                    }
                    if (this.s.indexOf("c") < 0 && (string2.length() > 1 || this.s.indexOf("y") >= 0 || this.s.indexOf("Y") >= 0 || this.s.indexOf("L") >= 0 || this.s.indexOf("\u70b9\u51fb") >= 0 || this.E("\u9a8c\u8bc1").length() > 0 || this.E("\u6d4f\u89c8\u5668").length() > 0) && (charSequence22 = Init.d.getString(this.G, "")).length() > 1) {
                        this.z = charSequence22;
                        return charSequence22;
                    }
                    break block23;
                }
                string = string3 = this.I("\u641c\u7d22\u8bf7\u6c42\u5934", "\u641c\u7d22\u8bf7\u6c42\u5934\u53c2\u6570", "search_header", "SHeaders", "").replace("@", "$").replace("&&", "#").replace("\uff1b\uff1b", ";").trim();
                if (string3.length() >= 1) break block24;
            }
            string = this.J("\u8bf7\u6c42\u5934", "\u8bf7\u6c42\u5934\u53c2\u6570", "ua", "Headers", "UserAgent", "").replace("@", "$").replace("&&", "#").replace("\uff1b\uff1b", ";").trim();
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("User-Agent", this.M(string));
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        Object object2 = new HashMap<String, List<String>>();
        if (string2.length() > 0 && string2.indexOf(";post;") >= 0 || ((String)charSequence).indexOf(";post;") >= 0) {
            void var5_9;
            if (string2.length() > 0) {
                String string4 = string2.split(";post;")[0];
                string2 = string2.split(";post;").length > 1 ? string2.split(";post;")[1] : "";
            } else if (((String)charSequence).indexOf(";post;") >= 0) {
                String string5 = ((String)charSequence).split(";post;")[0];
                string2 = ((String)charSequence).split(";post;").length > 1 ? ((String)charSequence).split(";post;")[1] : "";
            } else {
                String string6 = "";
            }
            if (string2.length() > 0) {
                for (String string7 : string2.split("\\&")) {
                    if (string7.endsWith("=")) continue;
                    hashMap2.put(string7.split("=")[0], string7.split("=")[1]);
                }
            }
            hashMap.put("Referer", (String)var5_9);
            object = new StringBuilder();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append("/");
            ((StringBuilder)object).append(stringBuilder.toString().replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
            ((StringBuilder)object).append("/");
            hashMap.put("Origin", ((StringBuilder)object).toString());
            com.github.catvod.spider.merge.lq.b.d((String)var5_9, hashMap2, hashMap, (Map<String, List<String>>)object2);
        }
        this.W((Map<String, List<String>>)object2);
        object = new StringBuilder(this.z);
        object2 = this.G("\u64ad\u653e\u8bf7\u6c42\u5934", "\u76f4\u63a5\u64ad\u653e\u76f4\u94fe\u89c6\u9891\u8bf7\u6c42\u5934", "");
        if (string.indexOf("ookie") >= 0 || ((String)object2).indexOf("ookie") >= 0) {
            void var5_14;
            if (string.indexOf("ookie") >= 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("#");
                charSequence = ((StringBuilder)charSequence).toString().replaceAll(".*ookie\\$([^#]+?)#.*", "$1");
            } else {
                charSequence = "";
            }
            CharSequence charSequence2 = charSequence;
            if (((String)object2).indexOf("ookie") >= 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append(";");
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(((String)object2).replace("@", "$").replace("&&", "#"));
                ((StringBuilder)charSequence).append("#");
                stringBuilder.append(((StringBuilder)charSequence).toString().replace("\uff1b\uff1b", ";").replaceAll(".*ookie\\$([^#]+?)#.*", "$1"));
                String string8 = stringBuilder.toString();
            }
            for (CharSequence charSequence3 : var5_14.replaceAll(";+", ";").split(";")) {
                if (((StringBuilder)object).indexOf(((String)charSequence3).split("=")[0]) >= 0) continue;
                ((StringBuilder)object).append((String)charSequence3);
                ((StringBuilder)object).append(";");
            }
        }
        if (((StringBuilder)object).toString().length() < 2) {
            this.z = "0";
            return "";
        }
        if (string2.length() > 1) {
            charSequence = Init.d.edit();
            this.z = string2 = ((StringBuilder)object).toString();
            charSequence.putString(this.G, string2);
            charSequence.apply();
        }
        if ("cookie".equals(this.o)) {
            Init.show(((StringBuilder)object).toString());
        }
        return ((StringBuilder)object).toString();
    }

    /*
     * Exception decompiling
     */
    public String playerContent(String var1_1, String var2_6, List<String> var3_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 127[TRYBLOCK] [150 : 3446->3456)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String searchContent(String string, boolean bl) {
        int n2;
        StringBuilder stringBuilder;
        CharSequence charSequence;
        String string2 = "";
        Object object = this.I;
        if (object != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("searchContent(key=");
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(", quick=");
            ((StringBuilder)charSequence).append(bl);
            ((StringBuilder)charSequence).append(")");
            object.log(((StringBuilder)charSequence).toString());
        }
        this.r = "\u641c\u7d22";
        object = this.Z("", string, bl);
        charSequence = this.H("\u7279\u6b8a\u5206\u7c7b", "\u7279\u6b8a\u5206\u7c7burl", "\u7279\u6b8a\u5206\u7c7b\u94fe\u63a5", "").replace(this.f, "");
        boolean bl2 = this.G("\u641c\u7d22\u6a21\u5f0f", "ssmoshi", "").equals("0");
        int n3 = !(bl2 || this.G("\u641c\u7d22\u540e\u7f00", "sousuohouzhui", "").length() > 0 && !this.G("\u641c\u7d22\u6a21\u5f0f", "ssmoshi", "").equals("1") || this.K("\u641c\u7d22url", "\u641c\u7d22\u94fe\u63a5", "\u641c\u7d22\u524d", "sousuoqian", "search_url", "searchUrl").indexOf("/ajax/") >= 0 && !(bl2 = this.G("\u641c\u7d22\u6a21\u5f0f", "ssmoshi", "").equals("1"))) ? 0 : 1;
        if (n3 != 0 && (object == null || object.getJSONArray("list") == null || object.getJSONArray("list").length() < 1)) {
            this.B.put("\u641c\u7d22\u6a21\u5f0f", (Object)"1");
            this.B.put("\u641c\u7d22\u6a21\u5f0f0", (Object)"0");
            object = this.Z("", string, bl);
            this.B.put("\u641c\u7d22\u6a21\u5f0f0", (Object)"");
        }
        if (object != null && object.getJSONArray("list") != null && object.getJSONArray("list").length() > 0 && ((String)charSequence).indexOf("#http") < 0) {
            return object.toString();
        }
        object = object != null ? object.getJSONArray("list") : new JSONArray();
        for (String string3 : ((String)charSequence).split("#h")) {
            if (!string3.startsWith("ttp")) continue;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("h");
            stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append("#");
            ((StringBuilder)charSequence).append(stringBuilder.toString().replaceAll(".*(ttp.*?)#.*", "$1"));
            charSequence = this.Z(((StringBuilder)charSequence).toString(), string, bl);
            charSequence = charSequence != null ? charSequence.getJSONArray("list") : new JSONArray();
            if (charSequence.length() <= 0) continue;
            for (n2 = 0; n2 < charSequence.length(); ++n2) {
                object.put(charSequence.get(n2));
            }
        }
        if (object.length() > 0) {
            string = new JSONObject();
            return string.put("list", object).toString();
        }
        if (this.s.indexOf("k0") >= 0) {
            this.s = this.s.replace("k0", "");
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(this.f);
        ((StringBuilder)charSequence).append("/;;\u641c\u9996\u9875");
        charSequence = this.Z(((StringBuilder)charSequence).toString(), string, bl);
        if (charSequence != null && charSequence.getJSONArray("list") != null && charSequence.getJSONArray("list").length() > 0) {
            return charSequence.toString();
        }
        String[] stringArray = this.c.split("#");
        n2 = stringArray.length;
        for (n3 = 0; n3 < n2; ++n3) {
            block20: {
                charSequence = stringArray[n3];
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.f(((String)charSequence).split("\\$")[1], "1", false, null));
                stringBuilder.append(";;\u641c\u9996\u9875");
                charSequence = this.Z(stringBuilder.toString(), string, bl);
                charSequence = charSequence != null ? charSequence.getJSONArray("list") : new JSONArray();
                if (charSequence.length() <= 0) break block20;
                for (n3 = 0; n3 < charSequence.length(); ++n3) {
                    object.put(charSequence.get(n3));
                }
                break;
            }
            try {
                Thread.sleep(1000L);
                continue;
            }
            catch (Exception exception) {}
        }
        try {
            this.r = "";
            string = string2;
            if (object.length() <= 0) return string;
            string = new JSONObject();
            return string.put("list", object).toString();
        }
        catch (Exception exception) {
            if (this.m) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.G);
                ((StringBuilder)object).append("\u8c03\u8bd5->searchContent\u51fa\u9519\uff1a");
                ((StringBuilder)object).append(((Object)exception).toString());
                Init.show(((StringBuilder)object).toString());
            }
            if ((object = this.I) != null) {
                com.github.catvod.spider.merge.Dw.f.a(exception, com.github.catvod.spider.merge.ka.d.b("searchContent()\u9519\u8bef-->"), (SpiderApi)object);
            }
            this.r = "";
            return "";
        }
    }

    /*
     * WARNING - void declaration
     */
    protected final HashMap<String, String> t(String charSequence2) {
        String string;
        String string2;
        HashMap<String, String> hashMap;
        HashMap<String, String> hashMap2;
        block14: {
            void var1_4;
            block13: {
                block12: {
                    hashMap2 = this.F;
                    if (hashMap2 != null && !hashMap2.isEmpty() && this.s.indexOf("r1") < 0 && this.s.indexOf("c") < 0) {
                        return this.F;
                    }
                    this.F = new HashMap();
                    hashMap = this.J("\u8bf7\u6c42\u5934", "\u8bf7\u6c42\u5934\u53c2\u6570", "ua", "Headers", "UserAgent", "").trim();
                    hashMap2 = hashMap;
                    if (((String)((Object)hashMap)).length() > 1) {
                        hashMap2 = hashMap;
                        if (((String)((Object)hashMap)).indexOf("@") > 0) {
                            hashMap2 = ((String)((Object)hashMap)).replace("@", "$").replace("&&", "#").replace("\uff1b\uff1b", ";");
                        }
                    }
                    string2 = this.M((String)((Object)hashMap2));
                    this.F.put("User-Agent", string2);
                    hashMap = this.o((String)charSequence2);
                    if (this.s.indexOf("c0") < 0 && ((String)((Object)hashMap)).length() > 1) {
                        this.F.put("Cookie", (String)((Object)hashMap));
                    }
                    if (((String)((Object)hashMap2)).indexOf("Referer") >= 0 || this.s.indexOf("r1") < 0) break block12;
                    hashMap = this.F;
                    String string3 = ((String)charSequence2).split(";")[0];
                    break block13;
                }
                if (((String)((Object)hashMap2)).indexOf("Referer") >= 0 || this.s.indexOf("r") < 0) break block14;
                hashMap = this.F;
                StringBuilder stringBuilder = new StringBuilder();
                String[] stringArray = new StringBuilder();
                stringArray.append((String)charSequence2);
                stringArray.append("/");
                stringBuilder.append(stringArray.toString().replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                stringBuilder.append("/");
                String string4 = stringBuilder.toString();
            }
            hashMap.put("Referer", (String)var1_4);
        }
        if ((string = ((String)((Object)hashMap2)).replaceAll(".*\u7535\u8111#", "").replaceAll(".*\u624b\u673a#", "").replaceAll(".*_UA#", "")).indexOf("$") >= 0) {
            for (String string5 : string.split("#")) {
                void var1_11;
                if ("User-Agent".equals(string5.split("\\$")[0]) && string2.length() > 0 || "Cookie".equals(string5.split("\\$")[0]) || "cookie".equals(string5.split("\\$")[0])) continue;
                hashMap = this.F;
                hashMap2 = string5.split("\\$")[0];
                if (string5.split("\\$")[1].equals("\u7a7a")) {
                    String string6 = "";
                } else {
                    String string7 = string5.split("\\$")[1];
                }
                hashMap.put((String)((Object)hashMap2), (String)var1_11);
            }
        }
        if ((hashMap2 = this.I) != null) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.ka.d.b("\u8bf7\u6c42\u5934--> ");
            stringBuilder.append(((Object)this.F).toString());
            hashMap2.log(stringBuilder.toString());
        }
        return this.F;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String xpDetailContent(List<String> var1_1) {
        block56: {
            block55: {
                block48: {
                    block53: {
                        block49: {
                            block50: {
                                block51: {
                                    block52: {
                                        block47: {
                                            block46: {
                                                var8_3 = var1_1.get(0).split("\\$\\$\\$");
                                                if (!var8_3[2].startsWith("/") || var8_3[2].startsWith("//")) break block46;
                                                var6_4 = new StringBuilder();
                                                var6_4.append(this.f);
                                                var6_4.append(var8_3[2]);
                                                var6_4 = var6_4.toString();
                                                break block47;
                                            }
                                            var6_4 = var8_3[2];
                                        }
                                        var15_5 = this.i0((String)var6_4);
                                        var9_6 = this.G("\u64ad\u653e\u4e8c\u6b21\u622a\u53d6", "dtNode", "");
                                        var7_14 = var8_3[1];
                                        var16_15 = var8_3[0];
                                        var13_16 = var7_14;
                                        if (this.h) {
                                            var13_16 = this.fixCover((String)var7_14, (String)var6_4);
                                        }
                                        var11_17 = this.G("\u7b80\u4ecb", "dtDesc", "");
                                        var6_4 = this.G("\u5f71\u7247\u7c7b\u578b", "dtCate", "");
                                        var10_18 = this.G("\u5f71\u7247\u5730\u533a", "dtArea", "");
                                        var7_14 = this.G("\u5f71\u7247\u5e74\u4ee3", "dtYear", "");
                                        var12_19 = this.G("\u5f71\u7247\u72b6\u6001", "dtMark", "");
                                        var14_20 = this.G("\u5bfc\u6f14", "dtDirector", "");
                                        var8_3 = this.H("\u4e3b\u6f14", "\u6f14\u5458", "dtActor", "");
                                        var9_6 = (LinkedList)var15_5.a((String)var9_6);
                                        var9_6 = var9_6.size() > 0 ? (com.github.catvod.spider.merge.fb.b)var9_6.get(0) : null;
                                        var6_4 = var9_6.c((String)var6_4).a().trim();
                                        try {
                                            var7_14 = var9_6.c((String)var7_14).a().trim();
                                        }
                                        catch (Exception var9_12) {
                                            break block52;
                                        }
                                        try {
                                            var10_18 = var9_6.c(var10_18).a().trim();
                                        }
                                        catch (Exception var9_11) {
                                            break block51;
                                        }
                                        try {
                                            var12_19 = var9_6.c((String)var12_19).a().trim();
                                        }
                                        catch (Exception var9_10) {
                                            var11_17 = var6_4;
                                            break block50;
                                        }
                                        try {
                                            var8_3 = var9_6.c((String)var8_3).a().trim();
                                        }
                                        catch (Exception var9_9) {
                                            var8_3 = "";
                                            var14_20 = "";
                                            var11_17 = var6_4;
                                            var6_4 = var14_20;
                                            break block49;
                                        }
                                        try {
                                            var14_20 = var9_6.c((String)var14_20).a().trim();
                                        }
                                        catch (Exception var9_8) {
                                            var14_20 = "";
                                            var11_17 = var6_4;
                                            var6_4 = var14_20;
                                            break block49;
                                        }
                                        try {
                                            var9_6 = var9_6.c((String)var11_17).a().trim();
                                            break block48;
                                        }
                                        catch (Exception var9_7) {
                                            var11_17 = var6_4;
                                            var6_4 = var14_20;
                                            break block49;
                                        }
                                        catch (Exception var9_13) {
                                            var6_4 = "";
                                        }
                                    }
                                    var7_14 = "";
                                }
                                var10_18 = "";
                                var11_17 = var6_4;
                            }
                            var12_19 = "";
                            var8_3 = "";
                            var6_4 = "";
                        }
                        if (this.m) {
                            var14_20 = new StringBuilder();
                            var14_20.append(this.G);
                            var14_20.append("\u8c03\u8bd5->xpDetailContent\u83b7\u53d6\u5217\u8868\u9519\uff1a");
                            var14_20.append(var9_6.toString());
                            Init.show(var14_20.toString());
                        }
                        if ((var14_20 = this.I) == null) break block53;
                        var17_21 = new StringBuilder();
                        var17_21.append("xpDetailContent\u83b7\u53d6\u5217\u8868\u9519\u8bef\uff01-->");
                        var17_21.append(var9_6.toString());
                        var14_20.log(var17_21.toString());
                    }
                    var9_6 = "";
                    var14_20 = var6_4;
                    var6_4 = var11_17;
                }
                var11_17 = new JSONObject();
                var11_17.put("vod_id", (Object)var1_1.get(0));
                var11_17.put("vod_name", (Object)var16_15);
                var11_17.put("vod_pic", var13_16);
                var11_17.put("type_name", var6_4);
                var11_17.put("vod_year", (Object)var7_14);
                var11_17.put("vod_area", (Object)var10_18);
                var11_17.put("vod_remarks", (Object)var12_19);
                var11_17.put("vod_actor", var8_3);
                var11_17.put("vod_director", var14_20);
                var11_17.put("vod_content", var9_6);
                var6_4 = new ArrayList();
                var1_1 = var15_5.a(this.G("\u7ebf\u8def\u6570\u7ec4", "dtFromNode", ""));
                var2_22 = 0;
                while (true) {
                    var7_14 = (LinkedList)var1_1;
                    var3_23 = var7_14.size();
                    if (var2_22 >= var3_23) break;
                    var6_4.add(((com.github.catvod.spider.merge.fb.b)var7_14.get(var2_22)).c(this.G("\u7ebf\u8def\u6807\u9898", "dtFromName", "/text()")).a().trim());
                    ++var2_22;
                    continue;
                    break;
                }
                var7_14 = new ArrayList<String>();
                var1_1 = this.G("\u64ad\u653e\u6570\u7ec4", "dtUrlNode", "");
                var10_18 = this.G("\u64ad\u653e\u5217\u8868", "dtUrlSubNode", "//a");
                var9_6 = this.G("\u64ad\u653e\u6807\u9898", "dtUrlName", "/text()");
                var8_3 = this.G("\u64ad\u653e\u94fe\u63a5", "dtUrlId", "/@href");
                var1_1 = var15_5.a((String)var1_1);
                var3_23 = 0;
                while (true) {
                    var12_19 = (LinkedList)var1_1;
                    if (var3_23 >= var12_19.size()) break;
                    var13_16 = ((com.github.catvod.spider.merge.fb.b)var12_19.get(var3_23)).b(var10_18);
                    var12_19 = new ArrayList<String>();
                    var2_22 = 0;
                    while (true) {
                        block54: {
                            var15_5 = (LinkedList)var13_16;
                            if (var2_22 >= var15_5.size()) break;
                            var4_24 = this.y != false ? var15_5.size() - 1 - var2_22 : var2_22;
                            var14_20 = ((com.github.catvod.spider.merge.fb.b)var15_5.get(var4_24)).c((String)var9_6).a().trim();
                            var15_5 = ((com.github.catvod.spider.merge.fb.b)var15_5.get(var4_24)).c((String)var8_3).a().trim();
                            if (var15_5 == null) break block54;
                            if (var15_5.length() < 1) break block54;
                            var16_15 = new StringBuilder((String)var14_20);
                            var16_15.append("$");
                            var16_15.append((String)var15_5);
                            var12_19.add(var16_15.toString());
                        }
                        ++var2_22;
                    }
                    if (var12_19.size() == 0 && var6_4.size() > var3_23) {
                        var6_4.set(var3_23, "");
                    }
                    var7_14.add(TextUtils.join((CharSequence)"#", var12_19));
                    ++var3_23;
                    continue;
                    break;
                }
                ** try [egrp 22[TRYBLOCK] [26 : 1144->1152)] { 
lbl185:
                // 3 sources

                for (var2_22 = var6_4.size() - 1; var2_22 >= 0; --var2_22) {
                    if (!((String)var6_4.get(var2_22)).isEmpty()) continue;
                    var6_4.remove(var2_22);
                    continue;
                }
                var9_6 = TextUtils.join((CharSequence)"$$$", (Iterable)var6_4);
                var8_3 = TextUtils.join((CharSequence)"$$$", var7_14);
                if (this.I == null) ** GOTO lbl223
                if (var7_14.size() >= 1) break block55;
                this.I.log("Xpath\u65b9\u5f0f\u672a\u83b7\u53d6\u5230\u64ad\u653e\u5217\u8868\uff01");
                return "";
            }
            var5_25 = this.m;
            if (!var5_25) ** GOTO lbl211
            var1_1 = this.I;
            var6_4 = new StringBuilder();
            var6_4.append("Xpath\u65b9\u5f0f\u83b7\u53d6\u64ad\u653e\u5230\u5217\u8868--> ");
            var6_4.append((String)var8_3);
lbl209:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl211:
            // 1 sources

            var1_1 = this.I;
            var6_4 = new StringBuilder();
            var6_4.append("Xpath\u65b9\u5f0f\u83b7\u53d6\u64ad\u653e\u5230\u5217\u8868--> ");
            var6_4.append(var8_3.split("\\$\\$\\$")[0]);
            var6_4.append("......");
            ** continue;
            var6_4 = var6_4.toString();
            var1_1.log((String)var6_4);
            break block56;
lbl223:
            // 1 sources

            if (var7_14.size() >= 1) break block56;
            return "";
        }
        try {
            var11_17.put("vod_play_from", var9_6);
            var11_17.put("vod_play_url", var8_3);
            var6_4 = new JSONObject();
            var1_1 = new JSONArray();
            var1_1.put(var11_17);
            var6_4.put("list", (Object)var1_1);
            var1_1 = var6_4.toString();
            return var1_1;
        }
lbl239:
        // 20 sources

        catch (Exception var1_2) {
            if (this.m) {
                var6_4 = new StringBuilder();
                var6_4.append(this.G);
                var6_4.append("\u8c03\u8bd5->xpDetailContent\u51fa\u9519\uff1a");
                var6_4.append(var1_2.toString());
                Init.show(var6_4.toString());
            }
            if ((var6_4 = this.I) != null) {
                com.github.catvod.spider.merge.Dw.f.a(var1_2, com.github.catvod.spider.merge.ka.d.b("xpDetailContent()\u9519\u8bef\uff01-->"), (SpiderApi)var6_4);
            }
            return "";
        }
    }
}

