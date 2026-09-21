/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderApi
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
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.PushAgent;
import com.github.catvod.spider.XBPQ$3;
import com.github.catvod.spider.XBPQ$5;
import com.github.catvod.spider.XBPQ$6;
import com.github.catvod.spider.XBPQ$7;
import com.github.catvod.spider.a;
import com.github.catvod.spider.c;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.b.p;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.h.b;
import com.github.catvod.spider.merge.j.k;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
    private PushAgent D;
    private boolean E = true;
    private HashMap<String, String> F = null;
    private String G;
    private int H = 0;
    private SpiderApi I = null;
    private String J = cYh.d("5E697669");
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
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private JSONObject A(String var1_1, String var2_3, String var3_4, String var4_5) {
        block23: {
            block22: {
                block21: {
                    var14_6 = cYh.d("3B76");
                    var15_7 = cYh.d("44");
                    var10_8 = new JSONObject();
                    var11_9 = new JSONArray();
                    var7_10 = var1_1.equals(cYh.d("0529"));
                    var17_11 = cYh.d("82D5E9B8D4F2");
                    var18_12 = cYh.d("043135341E3E");
                    var16_13 = cYh.d("4A7D");
                    var13_14 = cYh.d("11");
                    var12_15 = cYh.d("09");
                    var9_16 = var3_4;
                    var8_17 /* !! */  = var10_8;
                    if (!var7_10) {
                        var9_16 = var3_4;
                        var8_17 /* !! */  = var10_8;
                        if (var1_1.equals(var18_12)) break block21;
                        var10_8.put(var12_15, (Object)var17_11);
                        var10_8.put(var13_14, (Object)"");
                        var11_9.put(var10_8);
                        var10_8 = new JSONObject();
                        var9_16 = var3_4;
                        var8_17 /* !! */  = var10_8;
                        if (var3_4.indexOf(var16_13) < 0) break block21;
                        var9_16 = var3_4.split(var16_13)[1];
                        var8_17 /* !! */  = var10_8;
                    }
                }
                var7_10 = var1_1.equals(var18_12);
                var5_18 = 0;
                var10_8 = var9_16;
                var3_4 = var8_17 /* !! */ ;
                if (!var7_10) break block22;
                var8_17 /* !! */ .put(var12_15, (Object)var17_11);
                var8_17 /* !! */ .put(var13_14, (Object)var9_16.split(var16_13)[0]);
                var11_9.put((Object)var8_17 /* !! */ );
                var8_17 /* !! */  = new JSONObject();
                var10_8 = var9_16;
                var3_4 = var8_17 /* !! */ ;
                if (var9_16.indexOf(var16_13) < 0) break block22;
                var10_8 = var9_16.split(var16_13)[1];
                var3_4 = var8_17 /* !! */ ;
            }
            if (var10_8.indexOf(var15_7) < 0) ** GOTO lbl79
            var5_18 = var10_8.indexOf(var15_7);
            var4_5 = cYh.d("3B74");
            if (var5_18 >= 0) {
                ** try [egrp 7[TRYBLOCK] [7 : 306->320)] { 
lbl60:
                // 2 sources

                for (String var9_16 : var10_8.split(var15_7)) {
                    var3_4.put(var12_15, (Object)var9_16.split((String)var4_5)[0]);
                    var3_4.put(var13_14, (Object)var9_16.split((String)var4_5)[1]);
                    var11_9.put((Object)var3_4);
                    var3_4 = new JSONObject();
                }
            } else {
                block24: {
                    var3_4.put(var12_15, (Object)var10_8.split((String)var4_5)[0]);
                    var3_4.put(var13_14, (Object)var10_8.split((String)var4_5)[1]);
                    var11_9.put((Object)var3_4);
                    break block23;
lbl79:
                    // 1 sources

                    if (var10_8.indexOf(cYh.d("41")) < 0) break block23;
                    var8_17 /* !! */  = var10_8.split(var14_6);
                    if (!"".equals(var4_5) && !cYh.d("4D").equals(var4_5)) {
                        var4_5 = var4_5.split(var14_6);
                        break block24;
                    }
                    var4_5 = var8_17 /* !! */ ;
                }
                while (true) {
                    if (var5_18 >= ((JSONObject)var8_17 /* !! */ ).length) break;
                    var3_4.put(var12_15, (Object)var8_17 /* !! */ [var5_18]);
                    var3_4.put(var13_14, var4_5[var5_18]);
                    var11_9.put((Object)var3_4);
                    var3_4 = new JSONObject();
                    ++var5_18;
                    continue;
                    break;
                }
            }
        }
        try {
            var3_4 = new JSONObject();
            var3_4.put(cYh.d("0C3538"), (Object)var1_1);
            var3_4.put(cYh.d("09312C34"), (Object)var2_3);
            var3_4.put(cYh.d("11312D2432"), (Object)var11_9);
            return var3_4;
        }
lbl108:
        // 12 sources

        catch (Exception var1_2) {
            if (this.m) {
                var2_3 = new StringBuilder();
                var2_3.append(this.G);
                var2_3.append(cYh.d("8FE0C2B9F8CF4A6E2634230833293134B2DDDDB9D5C8B8E6FD"));
                var2_3.append(var1_2.toString());
                Init.show(var2_3.toString());
            }
            if ((var2_3 = this.I) != null) {
                com.github.catvod.spider.merge.i.b.a(var1_2, com.github.catvod.spider.merge.d.d.b(cYh.d("00353503032317356978BECEFEB8EEFE7A7759")), (SpiderApi)var2_3);
            }
            return null;
        }
    }

    private String B(String string) {
        return this.C(string, "");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private String C(String object, String object2) {
        void var1_11;
        void var2_21;
        block29: {
            void var1_5;
            block18: {
                int n2;
                String string;
                int n3;
                String[] stringArray;
                String string2;
                String string3;
                String string4;
                block28: {
                    void var2_12;
                    block26: {
                        block27: {
                            boolean bl;
                            block22: {
                                block24: {
                                    block25: {
                                        block23: {
                                            block19: {
                                                block20: {
                                                    block21: {
                                                        string4 = this.B.optString((String)object);
                                                        bl = ((String)object).equals(cYh.d("83E8FAB8F6EF12222D"));
                                                        string3 = "";
                                                        string2 = string4;
                                                        if (!bl) break block19;
                                                        string2 = string4;
                                                        if (!string4.isEmpty()) break block19;
                                                        string2 = string4 = this.B.optString(cYh.d("8EF6D7B8F6EF81DEE9B9DACA8EC3FFB7D9FF"));
                                                        if (!string4.isEmpty()) break block19;
                                                        string2 = string4 = this.B.optString(cYh.d("80EDD0B6FCC382CCF1B4CADA"));
                                                        if (!string4.isEmpty()) break block19;
                                                        string2 = string4 = this.B.optString(cYh.d("12222D"));
                                                        if (!string4.isEmpty()) break block19;
                                                        string2 = string4 = this.B.optString(cYh.d("0F3F2C3402280B"));
                                                        if (!string4.isEmpty()) break block19;
                                                        string2 = string4 = this.B.optString(cYh.d("82D8C7B6E6E112222D"));
                                                        if (!string4.isEmpty()) break block20;
                                                        string4 = this.B.optString(cYh.d("82D8C7B6E6E18EC3FFB7D9FF"));
                                                        bl = string4.isEmpty();
                                                        stringArray = cYh.d("0F243521");
                                                        if (bl) break block21;
                                                        string2 = string4;
                                                        if (string4.startsWith((String)stringArray)) break block20;
                                                    }
                                                    string2 = string4 = this.B.optString(cYh.d("82D8C7B6E6E18EF1F4"));
                                                    if (string4.isEmpty()) {
                                                        string2 = string4 = this.B.optString(cYh.d("043C2022240512222D"));
                                                        if (string4.isEmpty()) {
                                                            string2 = string4 = this.B.optString(cYh.d("0431353402280B"));
                                                            if (string4.isEmpty()) {
                                                                string4 = string2 = this.B.optString(cYh.d("81C0DDB6E3F812222D"));
                                                                if (!string2.startsWith((String)stringArray)) {
                                                                    string4 = "";
                                                                }
                                                                string2 = string4;
                                                                if (string4.isEmpty()) {
                                                                    string2 = string4 = this.B.optString(cYh.d("81C0DDB6E3F88EC3FFB7D9FF"));
                                                                    if (!string4.startsWith((String)stringArray)) {
                                                                        string2 = "";
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                n3 = string2.indexOf(cYh.d("48272433273B1523247E"));
                                                stringArray = cYh.d("4361");
                                                string4 = n3 > 0 ? cYh.d("497A6E2632381731332232754F3835252729580C7B7E7801397F1C7A7E75497A") : cYh.d("497A6939232E17237E0D6D75480B1F7E0A714E7F6F7B");
                                                string2 = string2.replaceAll(string4, (String)stringArray);
                                            }
                                            string4 = string2;
                                            if (!((String)object).equals(cYh.d("82D8C7B6E6E1"))) break block22;
                                            if (string2.isEmpty()) break block23;
                                            string4 = string2;
                                            if (string2.indexOf(cYh.d("41")) < 0) break block22;
                                            string4 = this.B;
                                            stringArray = cYh.d("82D8C7B6E6E182D0FD");
                                            break block24;
                                        }
                                        string2 = this.B.optString(cYh.d("82D8C7B6E6E182C0CCB6F0EA"));
                                        if (string2.isEmpty()) break block25;
                                        string4 = this.B;
                                        stringArray = cYh.d("82D8C7B6E6E182C0CCB6F0EA81CBFEB7DAF88FFFCC");
                                        break block24;
                                    }
                                    string4 = string2 = this.B.optString(cYh.d("043C2022240509312C34"));
                                    if (string2.isEmpty()) break block22;
                                    string4 = this.B;
                                    stringArray = cYh.d("043C2022240511312D2432");
                                }
                                string4 = this.R(string2, string4.optString((String)stringArray));
                            }
                            bl = string4.isEmpty();
                            string2 = cYh.d("80F9FB");
                            if (bl || string4.equals(string2)) break block26;
                            String string5 = string4;
                            if (((String)object).equals(cYh.d("82D9E6B7D4DF"))) return var2_21;
                            String string6 = string4;
                            if (((String)object).equals(cYh.d("82CCF1B4DBE0"))) return var2_21;
                            String string7 = string4;
                            if (((String)object).equals(cYh.d("80E1FAB4C9D1"))) return var2_21;
                            String string8 = string4;
                            if (((String)object).equals(cYh.d("82E9F5B5ECE7"))) return var2_21;
                            String string9 = string4;
                            if (((String)object).equals(cYh.d("81DED3B4EDD5"))) return var2_21;
                            string = cYh.d("1B2C");
                            if (string4.indexOf(string) < 0 || string4.indexOf(string2 = cYh.d("4A7D")) < 0) break block27;
                            stringArray = string4.split(cYh.d("3B2C1D2D"));
                            n2 = stringArray.length;
                            break block28;
                        }
                        String string10 = string4;
                        break block29;
                    }
                    if (!((String)object).equals(cYh.d("81C0DDB6E3F882C0CFB6EBDA"))) return var2_12;
                    if (!string4.equals(string2)) return var2_12;
                    return "";
                }
                for (n3 = 0; n3 < n2; ++n3) {
                    String string11 = stringArray[n3];
                    if (string11.indexOf(this.r) < 0) continue;
                    String string12 = string11.split(string2)[1];
                    break block18;
                }
                String string13 = string3;
                if (string4.indexOf(string) < 0) break block29;
                String[] stringArray2 = stringArray[0].split(string2);
                if (stringArray2.length > 1) {
                    String string14 = stringArray2[1];
                } else {
                    String string15 = stringArray2[0];
                }
            }
            void var2_19 = var1_5;
            return var2_21;
        }
        void var2_20 = var1_11;
        return var2_21;
    }

    private String D(String string, String string2, String string3) {
        return this.C(string, this.C(string2, string3));
    }

    private String E(String string, String string2, String string3, String string4) {
        return this.C(string, this.C(string2, this.C(string3, string4)));
    }

    private String F(String string, String string2, String string3, String string4, String string5) {
        return this.C(string, this.C(string2, this.C(string3, this.C(string4, string5))));
    }

    private String G(String string, String string2, String string3, String string4, String string5, String string6) {
        return this.C(string, this.C(string2, this.C(string3, this.C(string4, this.C(string5, string6)))));
    }

    private String H(String string, String string2, String string3, String string4, String string5, String string6) {
        return this.C(string, this.C(string2, this.C(string3, this.C(string4, this.C(string5, this.C(string6, ""))))));
    }

    private String K(String object) {
        CharSequence charSequence = cYh.d("81C7F7B8C0EE81D8F2");
        String[] stringArray = object;
        if (object.indexOf((String)charSequence) >= 0) {
            stringArray = com.github.catvod.spider.merge.d.d.b("");
            stringArray.append(new Date().getTime());
            stringArray = object.replace(charSequence, stringArray.toString());
        }
        object = stringArray;
        if (stringArray.indexOf(cYh.d("5D6978666F75")) > 0) {
            charSequence = this.J;
            String string = cYh.d("5E697669");
            object = stringArray;
            if (!string.equals(charSequence)) {
                object = stringArray.replace(string, this.J);
            }
        }
        stringArray = object;
        if (object.indexOf(cYh.d("0A347479")) > 0) {
            charSequence = object.replaceAll(cYh.d("0A34740D7F72497A7E780B73"), cYh.d("4361"));
            if (((String)charSequence).indexOf(cYh.d("4B39323E")) > 0) {
                charSequence = ((String)charSequence).split(cYh.d("4B"))[0];
                stringArray = com.github.catvod.spider.merge.j.m.c;
            } else {
                stringArray = com.github.catvod.spider.merge.j.m.b;
            }
            stringArray = com.github.catvod.spider.merge.j.m.a((String)charSequence, (Charset)stringArray);
            stringArray = object.replaceAll(cYh.d("0A34740D7F744D6F1D78"), (String)stringArray);
        }
        object = stringArray;
        if (stringArray.indexOf(cYh.d("4C25333D6D")) > 0) {
            object = stringArray.split(cYh.d("3B7B34233B065D"));
            if (((String[])object).length > 1) {
                if (stringArray.indexOf(cYh.d("432334336D")) > 0) {
                    stringArray = object[1].split(cYh.d("3B74322435065D"));
                    if (stringArray.length > 1) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(object[0]);
                        ((StringBuilder)charSequence).append(this.c0(this.j(stringArray[0]), stringArray[1], "").get(0).trim());
                        object = ((StringBuilder)charSequence).toString();
                    } else {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(object[0]);
                        ((StringBuilder)charSequence).append(this.j(stringArray[0]));
                        object = ((StringBuilder)charSequence).toString();
                    }
                } else {
                    stringArray = new StringBuilder();
                    stringArray.append(object[0]);
                    stringArray.append(this.j(object[1]));
                    object = stringArray.toString();
                }
            } else {
                object = object[0];
            }
        }
        return object;
    }

    private String L(String string) {
        if (string.length() < 1) {
            return string;
        }
        string = string.replaceAll(cYh.d("3B76626E0C3B4A2A007C0D6A4A691C2A667656603C6A"), "");
        String string2 = cYh.d("5B0B1F6F0A7059");
        String string3 = cYh.d("48");
        string = string.replaceAll(string2, string3).replaceAll(cYh.d("3C6E7D0C"), "");
        string2 = cYh.d("47");
        String string4 = cYh.d("80F9FBB6FEE080F9FB");
        string = string.replaceAll(string2, string4).replaceAll(cYh.d("3B236A"), "").replaceAll(string4, string2).replaceAll(cYh.d("487B"), string3);
        while (true) {
            string2 = string;
            if (!string.startsWith(string3)) break;
            string = string.substring(1, string.length());
        }
        while (string2.endsWith(string3)) {
            string2 = string2.substring(0, string2.length() - 1);
        }
        return string2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void M() {
        var8_1 = cYh.d("3B74");
        var12_2 = cYh.d("3739221F323F0300333E2F23");
        var11_3 = cYh.d("82CBFFB6DEDD81C8EEB4C7FC8ECCC1B9F1DB83EBE2B6C7DC");
        var10_4 = cYh.d("82CBFFB6DEDD83EBE2B6C7DC");
        var13_5 = cYh.d("0F243521");
        var17_6 = cYh.d("4176");
        var15_7 = cYh.d("497A6939232E17237E0D6D75480B1F7E0A714E7F6F7B");
        var5_8 = cYh.d("56");
        var9_9 = cYh.d("57");
        var16_10 = cYh.d("82CFDEB4C7D78FE7F2B9EAF6");
        var6_11 = cYh.d("81C0DDB6E3F88EC3FFB7D9FF");
        var3_12 = cYh.d("81C0DDB6E3F812222D");
        var14_14 = cYh.d("48");
        var7_15 = cYh.d("4361");
        var4_16 = cYh.d("5C6B");
        try {
            var18_18 = new StringBuilder();
            var18_18.append(this.B(cYh.d("83E8FAB8F6EF12222D")));
            var18_18.append(var14_14);
            var18_18 = var18_18.toString().replaceAll(var15_7, var7_15);
            this.f = var18_18;
            this.G = var18_18;
            this.G = var18_18.split(cYh.d("5D7F6E"))[1].split(var14_14)[0].replace(cYh.d("49"), cYh.d("38"));
            var18_18 = this.G(cYh.d("82D8C7B6E6E112222D"), cYh.d("82D8C7B6E6E18EC3FFB7D9FF"), cYh.d("82D8C7B6E6E18EF1F4"), cYh.d("043C2022240512222D"), cYh.d("0431353402280B"), "");
            this.b = var18_18;
            var1_19 = var18_18.indexOf((String)var4_16);
            if (var1_19 >= 0) {
                if (this.b.split((String)var4_16).length > 1) {
                    this.s = this.b.split((String)var4_16)[1];
                }
                this.b = this.b.split((String)var4_16)[0];
            } else if (this.D((String)var3_12, var6_11, "").indexOf((String)var4_16) >= 0) {
                if (this.D((String)var3_12, var6_11, "").split((String)var4_16).length > 1) {
                    this.s = this.D((String)var3_12, var6_11, "").split((String)var4_16)[1];
                }
            } else {
                this.s = "";
            }
            if (this.B(var16_10).indexOf(var17_6) > 0 || this.s.indexOf(cYh.d("82CFDE")) >= 0) {
                var3_12 = var4_16 = this.D(cYh.d("82DFD0B4EFD98EF1F4"), cYh.d("82CFDEB4C7D782DFD0B4EFD98EF1F4"), "");
                if (!var4_16.startsWith(var13_5)) {
                    var3_12 = this.f;
                }
                var6_11 = this.j((String)var3_12);
                if (this.B(var16_10).indexOf(var17_6) > 0) {
                    var3_12 = this.Y(var6_11, this.B(var16_10), "").get(0).trim();
                } else {
                    var3_12 = var4_16 = this.Y(var6_11, cYh.d("5B316B39253F016D637771783CB5CDD4B2CACC6A2925232A3A"), "");
                    if (var4_16.size() < 1) {
                        var3_12 = this.Y(var6_11, cYh.d("5B316B39253F016D6677717D3CB5CDD4B2CACC6A2925232A3A"), "");
                    }
                    if ((var1_19 = (var4_16 = this.s.matches(cYh.d("497AA4CEC806037E6B")) != false ? this.s.replaceAll(cYh.d("497AA4CEC8723B34687F7D"), var7_15) : "").matches(cYh.d("3B34")) != false ? Integer.parseInt((String)var4_16) - 1 : 0) > 0 && var3_12.size() > var1_19) {
                        var3_12 = var3_12.get(var1_19);
lbl52:
                        // 2 sources

                        while (true) {
                            var3_12 = (String)var3_12;
                            var4_16 = var3_12.trim();
                            break;
                        }
                    } else {
                        var4_16 = var6_11;
                        if (var3_12.size() > 0) {
                            var3_12 = var3_12.get(0);
                            ** continue;
                        }
                    }
                    var3_12 = new StringBuilder();
                    var3_12.append((String)var4_16);
                    var3_12.append(var14_14);
                    var3_12 = var3_12.toString().replaceAll(var15_7, var7_15);
                }
                if (var3_12 != null && var3_12.startsWith(var13_5)) {
                    this.g = var4_16 = this.f;
                    this.f = var3_12;
                    this.b = this.b.replace((CharSequence)var4_16, (CharSequence)var3_12);
                }
            }
            if (this.s.indexOf(cYh.d("8EC8FEB8D0D6")) >= 0) {
                this.B.put(cYh.d("8FE7F2B9EAF68EC3FFB7D9FF"), (Object)cYh.d("0F2435212460487F36262074063C28282234032228273274043F2C7E24754C312D382E2F09343338213F49332E3C782948766773"));
            }
lbl74:
            // 4 sources

            while (true) {
                var2_20 = this.E(var10_4, var11_3, var12_2, var9_9).equals(var5_8);
                break;
            }
        }
        catch (Exception var4_17) {
            var3_12 = this.I;
            if (var3_12 == null) return;
            com.github.catvod.spider.merge.i.b.a(var4_17, com.github.catvod.spider.merge.d.d.b(cYh.d("82D8DCB4F0D182DCD7B4D2F282E1C1B4D8C28ED7CEB8C3C38FFFEEBEEBDB4A7D7F")), (SpiderApi)var3_12);
            return;
        }
        var4_16 = cYh.d("81C8EE");
        {
            var2_20 = var2_20 || this.E(var10_4, var11_3, var12_2, var9_9).equals(var4_16) || this.s.indexOf(cYh.d("13")) >= 0;
            this.h = var2_20;
            var3_12 = this.s.indexOf(cYh.d("33")) >= 0 ? var5_8 : this.D(cYh.d("8FE0C2B9F8CF"), cYh.d("0335232430"), "");
            this.o = var3_12;
            var2_20 = var3_12.length() > 0 && var9_9.equals(this.o) == false;
            this.m = var2_20;
            if (this.o.indexOf(cYh.d("43")) >= 0) {
                this.p = Integer.parseInt(this.o.split(var8_1)[1]);
                this.o = this.o.split(var8_1)[0];
            }
            var2_20 = this.F(cYh.d("82D0D3B4EDD5"), cYh.d("82D0D3B4EDD581C2ECB7C3E4"), cYh.d("81C8EEB4C7FC82DFCCB9EAF68ED0C8B8CCDC82EACEB4DFCD"), cYh.d("0220280E253F1135332232"), cYh.d("57")).equals(var5_8) || this.F(cYh.d("82D0D3B4EDD5"), cYh.d("82D0D3B4EDD581C2ECB7C3E4"), cYh.d("81C8EEB4C7FC82DFCCB9EAF68ED0C8B8CCDC82EACEB4DFCD"), cYh.d("0220280E253F1135332232"), cYh.d("57")).equals(var4_16) || this.s.indexOf(cYh.d("0360")) < 0 && this.s.indexOf(cYh.d("03")) >= 0;
            this.y = var2_20;
            if (this.s.indexOf(cYh.d("08")) < 0) return;
            var3_12 = this.s.replaceAll(cYh.d("497A2E790B3E4C796F7B"), var7_15);
            if (var3_12.length() <= 0) return;
            this.v = Integer.parseInt((String)var3_12);
            return;
        }
        catch (JSONException var3_13) {
            ** continue;
        }
    }

    private String N(String string) {
        String string2 = cYh.d("8FEDEDB5EED383EAD4B4D8ED");
        String string3 = string;
        if (string.indexOf(string2) >= 0) {
            string3 = string.replace(string2, cYh.d("44"));
        }
        return string3;
    }

    /*
     * Unable to fully structure code
     */
    private String O(String var1_1, String var2_2, String var3_4) {
        block31: {
            block30: {
                block29: {
                    block27: {
                        block34: {
                            block28: {
                                var8_5 = this.I;
                                if (var8_5 == null) ** GOTO lbl11
                                var9_6 = new StringBuilder();
                                var9_6.append(cYh.d("8FFFF6B7E6D88FE7F2B9EAF681C2ECB7C3E48EC3FFB7D9FF81EAD1B6F7DB88ECCD26323832222D7C7A6447"));
                                var9_6.append(var1_1);
                                var8_5.log(var9_6.toString());
lbl11:
                                // 2 sources

                                var9_6 = this.j(var1_1);
                                var10_7 = this.I;
                                var8_5 = var9_6;
                                if (var10_7 == null) break block27;
                                if (var9_6 != null) break block28;
                                var10_7.log(cYh.d("81CCEBB9D9ED82DFD7B4DFEA8FE7F2B9EAF681EAD1B6F7DB"));
                                var8_5 = "";
                                break block27;
                            }
                            var7_8 = this.m;
                            var8_5 = cYh.d("8FDEF6B4D8CC82D8F1B9E0E98FEDEDB7EDCA80F0C07C7A6447");
                            if (!var7_8) ** GOTO lbl33
                            var11_9 = new StringBuilder();
                            var11_9.append((String)var8_5);
                            var11_9.append((String)var9_6);
                            var8_5 = var11_9.toString();
                            break block34;
lbl33:
                            // 1 sources

                            var11_9 = new StringBuilder();
                            var11_9.append((String)var8_5);
                            var11_9.append(var9_6.split(cYh.d("5B3D2425367A0F243521"))[0].split(cYh.d("4B0C3A"))[0]);
                            var11_9.append(cYh.d("497E6F7F7974"));
                            var8_5 = var11_9.toString();
                        }
                        var10_7.log((String)var8_5);
                        var8_5 = var9_6;
                    }
                    if (var2_2.length() > 0) break block29;
                    var2_2 = cYh.d("4525333D7570457667737B");
                }
                var9_6 = cYh.d("4176");
                if (var8_5 != null) {
                    if (!var8_5.startsWith(cYh.d("1C")) || !var8_5.endsWith(cYh.d("1A")) || var2_2.indexOf((String)var9_6) >= 0) break block30;
                    var3_4 = new JSONObject((String)var8_5);
                    if (var2_2.indexOf(cYh.d("49")) < 0) {
                        var3_4.optString(var2_2).getClass();
                    } else {
                        this.u((String)var8_5, var2_2);
                    }
                    break block31;
                }
            }
            if (var8_5 != null) {
                if (var2_2.indexOf((String)var9_6) < 0) break block31;
                var9_6 = this.Y((String)var8_5, (String)var3_4, "");
                var4_11 = 0;
                while (true) {
                    block32: {
                        if (var4_11 >= var9_6.size()) break;
                        var3_4 = (String)var9_6.get(var4_11);
                        if (var3_4.length() <= 10) break block32;
                        var10_7 = this.Y((String)var3_4, var2_2, "");
                        var5_12 = 0;
                        while (true) {
                            block33: {
                                if (var5_12 >= var10_7.size()) break;
                                var3_4 = var8_5 = ((String)var10_7.get(var5_12)).trim();
                                try {
                                    if (this.s.indexOf(cYh.d("1260")) < 0) {
                                        var3_4 = URLDecoder.decode((String)var8_5);
                                    }
                                }
                                catch (Exception var11_10) {
                                    if (this.m) {
                                        var3_4 = new StringBuilder();
                                        var3_4.append(this.G);
                                        var3_4.append(cYh.d("8FE0C2B9F8CF4A6EA9E6E4B2DAFC14233BB2C0F3A6F1D6BFE0EAA8C5CEB5DBCA"));
                                        var3_4.append(var11_10.toString());
                                        Init.show(var3_4.toString());
                                    }
                                    var12_14 = this.I;
                                    var3_4 = var8_5;
                                    if (var12_14 == null) break block33;
                                    var3_4 = new StringBuilder();
                                    var3_4.append(cYh.d("8FE7F2B9EAF632222DB9F0F980F0C0B8C3C38FFFEEBEEBDB4A7D7F"));
                                    var3_4.append(var11_10.toString());
                                    var12_14.log(var3_4.toString());
                                    var3_4 = var8_5;
                                }
                            }
                            var6_13 = var3_4.length();
                            if (var6_13 > 10) {
                                return var3_4;
                            }
                            ++var5_12;
                            continue;
                            break;
                        }
                    }
                    ++var4_11;
                }
            }
        }
        return var1_1;
        {
            catch (Exception var2_3) {
                if (this.m) {
                    var3_4 = new StringBuilder();
                    var3_4.append(this.G);
                    var3_4.append(cYh.d("8FE0C2B9F8CF4A6E2B243A2A242535B4D0E08EC4D8BEEBC0"));
                    var3_4.append(var2_3.toString());
                    Init.show(var3_4.toString());
                }
                if ((var3_4 = this.I) != null) {
                    com.github.catvod.spider.merge.i.b.a(var2_3, com.github.catvod.spider.merge.d.d.b(cYh.d("0D252C21142F137868B8C3C38FFFEEBEEBDB4A7D7F")), (SpiderApi)var3_4);
                }
                return var1_1;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private String P(String var1_1, String var2_2) {
        block44: {
            block43: {
                block42: {
                    block41: {
                        block49: {
                            block40: {
                                block39: {
                                    block48: {
                                        block47: {
                                            block46: {
                                                block45: {
                                                    var11_3 = cYh.d("043F2534");
                                                    var6_4 = var2_2;
                                                    if (var2_2.length() < 1) break block44;
                                                    if (this.u < this.v) break block45;
                                                    var6_4 = var2_2;
                                                    break block44;
                                                }
                                                var3_5 = var2_2.indexOf(cYh.d("81F3C1B7E2D183E8EC"));
                                                var4_6 = false;
                                                if (var3_5 < 0 || var2_2.indexOf(cYh.d("8FE7F2B9EAF683E8EC")) < 0 || var2_2.indexOf(cYh.d("0524363031")) < 0) break block46;
                                                var7_7 = this.I;
                                                if (var7_7 != null) {
                                                    var6_4 = new StringBuilder();
                                                    var6_4.append(cYh.d("8FEFC6B4F9C782F1D5B6CCE44A7D7F71"));
                                                    var6_4.append((String)var2_2);
                                                    var7_7.log(var6_4.toString());
                                                }
                                                var8_11 = this.Y((String)var2_2, cYh.d("052436303167417663"), "").get(0);
                                                var7_7 = com.github.catvod.spider.merge.d.d.b(var1_1);
                                                var2_2 = var6_4 = cYh.d("58");
                                                if (var1_1.indexOf((String)var6_4) >= 0) {
                                                    var2_2 = cYh.d("41");
                                                }
                                                var7_7.append((String)var2_2);
                                                var7_7.append(cYh.d("052436303167"));
                                                var7_7.append(var8_11);
                                                var1_1 = var7_7.toString();
                                                ++this.u;
                                                var6_4 = this.j(var1_1);
                                                this.t = true;
                                                break block44;
                                            }
                                            var5_14 = var2_2.contains(cYh.d("81FDE2B4CBF28FEFDAB9F6D683EAFBB7CBE08FFFC7B4DFF1"));
                                            var10_15 = cYh.d("0F243521");
                                            if (!var5_14) break block47;
                                            var7_8 = this.I;
                                            if (var7_8 != null) {
                                                var6_4 = new StringBuilder();
                                                var6_4.append(cYh.d("83EAFBB7CBE08EFACDB9F8DB4A7D7F71"));
                                                var6_4.append((String)var2_2);
                                                var7_8.log(var6_4.toString());
                                            }
                                            var7_8 = this.Y((String)var2_2, cYh.d("1422226C757C4172"), "").get(0).trim();
                                            var6_4 = var2_2;
                                            if (var7_8.length() > 0) {
                                                var8_12 = new HashMap<String, List<String>>();
                                                var4_6 = var7_8.startsWith(var10_15);
                                                var9_16 = cYh.d("48");
                                                if (var4_6) {
                                                    var2_2 = var7_8;
                                                } else {
                                                    if (var7_8.startsWith(var9_16)) {
                                                        var2_2 = new StringBuilder();
                                                        var2_2.append(this.f);
                                                    } else {
                                                        var2_2 = new StringBuilder();
                                                        var2_2.append(this.f);
                                                        var2_2.append(var9_16);
                                                    }
                                                    var2_2.append((String)var7_8);
                                                    var2_2 = var2_2.toString();
                                                }
                                                var6_4 = com.github.catvod.spider.merge.k.g.h((String)var2_2, this.r((String)var2_2), var8_12);
                                                var7_8 = this.Y((String)var6_4, cYh.d("113133713C3F1E6D63777178"), "").get(0).trim();
                                                var11_3 = this.Y((String)var6_4, cYh.d("4B26203D223F5A72677775"), "").get(0).trim();
                                                var2_2 = "";
                                                for (var3_5 = 0; var3_5 < var11_3.length(); ++var3_5) {
                                                    var2_2 = com.github.catvod.spider.merge.d.d.b((String)var2_2);
                                                    var2_2.append(Integer.toString(var11_3.charAt(var3_5)));
                                                    var2_2 = var2_2.toString();
                                                }
                                                var11_3 = com.github.catvod.spider.merge.j.m.a((String)var2_2, com.github.catvod.spider.merge.j.m.b);
                                                if ((var6_4 = this.Y((String)var6_4, cYh.d("047E263423724576670D71"), "").get(0).trim()).startsWith(var10_15)) {
                                                    var2_2 = var6_4;
                                                } else {
                                                    if (var6_4.startsWith(var9_16)) {
                                                        var2_2 = new StringBuilder();
                                                        var2_2.append(this.f);
                                                    } else {
                                                        var2_2 = new StringBuilder();
                                                        var2_2.append(this.f);
                                                        var2_2.append(var9_16);
                                                    }
                                                    var2_2.append((String)var6_4);
                                                    var2_2 = var2_2.toString();
                                                }
                                                var6_4 = new StringBuilder();
                                                var6_4.append((String)var2_2);
                                                var6_4.append(cYh.d("413B24286A"));
                                                var6_4.append((String)var7_8);
                                                var6_4.append(cYh.d("4126203D223F5A"));
                                                var6_4.append(var11_3);
                                                var2_2 = var6_4.toString();
                                                com.github.catvod.spider.merge.k.g.h((String)var2_2, this.r((String)var2_2), var8_12);
                                                var6_4 = var8_12.entrySet().iterator();
                                                while (var6_4.hasNext()) {
                                                    var2_2 = var6_4.next();
                                                    if (!var2_2.getKey().equals(cYh.d("1435357C3435083B2834")) && !var2_2.getKey().equals(cYh.d("3435357C1435083B2834"))) continue;
                                                    var3_5 = this.z.length();
                                                    var7_8 = cYh.d("5C");
                                                    if (var3_5 < 1) {
                                                        var2_2 = TextUtils.join((CharSequence)var7_8, (Iterable)var2_2.getValue());
                                                    } else {
                                                        var6_4 = new StringBuilder();
                                                        var6_4.append(this.z);
                                                        var6_4.append((String)var7_8);
                                                        var6_4.append(TextUtils.join((CharSequence)var7_8, (Iterable)((Iterable)var2_2.getValue())));
                                                        var2_2 = var6_4.toString();
                                                    }
                                                    this.z = var2_2;
                                                    break;
                                                }
                                                ++this.u;
                                                var6_4 = this.j(var1_1);
                                            }
                                            break block44;
                                        }
                                        var7_9 = cYh.d("8FEED2B4D2FF8EFACDB9F8DB80F0C0");
                                        if (var2_2.indexOf((String)var7_9) >= 0) break block48;
                                        var6_4 = var2_2;
                                        if (var2_2.indexOf(cYh.d("81EBD0B4DDF28EFACDB9F8DB")) < 0) break block44;
                                    }
                                    var6_4 = this.I;
                                    if (var6_4 == null) ** GOTO lbl148
                                    var8_13 = new StringBuilder();
                                    var8_13.append(cYh.d("281313B9E9DF82DAE8B8FDD68FFFC07C7A6447"));
                                    var8_13.append((String)var2_2);
                                    var6_4.log(var8_13.toString());
lbl148:
                                    // 2 sources

                                    if (var2_2.indexOf((String)var7_9) < 0) break block39;
                                    var4_6 = true;
                                }
                                var6_4 = this.y(this.B(cYh.d("8EFACDB9F8DB")), var4_6);
                                var12_18 = this.z;
                                var14_19 = var6_4.getString(cYh.d("142433"));
                                var13_20 = var6_4.getString(cYh.d("043F253402280B"));
                                var8_13 = this.E(cYh.d("083333"), cYh.d("283333"), cYh.d("281313"), "");
                                var9_17 = cYh.d("56");
                                if (!var4_6) break block40;
                                if (var8_13.length() < 1) ** GOTO lbl165
                                var6_4 = var8_13;
                                var7_9 = var9_17;
                                if (var8_13.startsWith(var10_15)) ** GOTO lbl178
lbl165:
                                // 2 sources

                                var6_4 = cYh.d("0F2435212460487F2E322574103F263679360E3E2A7E");
                                var7_9 = var9_17;
                                ** GOTO lbl178
                            }
                            if (var8_13.length() < 1) ** GOTO lbl175
                            var6_4 = var8_13;
                            if (var8_13.startsWith(var10_15)) break block49;
lbl175:
                            // 2 sources

                            var6_4 = cYh.d("0F2435212460487F2E32256B49272E3630740B392F3A78");
                        }
                        var7_9 = cYh.d("54");
lbl178:
                        // 3 sources

                        this.J("");
                        var7_9 = this.o(var14_19, (String)var6_4, (String)var7_9);
                        var6_4 = var7_9.getString(var11_3);
                        this.z = var7_9.getString(cYh.d("043F2E3A3E3F"));
                        if (var6_4.length() > 0 && this.z.length() > 0) ** GOTO lbl192
                        this.z = var12_18;
                        this.u = var3_5 = this.u + 1;
                        if (var3_5 < this.v) break block41;
                        return var2_2;
                    }
                    this.P(var1_1, (String)var2_2);
lbl192:
                    // 2 sources

                    var7_9 = this.r(var14_19);
                    if (!var4_6) break block42;
                    var8_13 = new StringBuilder();
                    var8_13.append(var13_20);
                    var8_13.append((String)var6_4);
                    var8_13 = var8_13.toString();
                    var6_4 = new HashMap();
                    var6_4 = com.github.catvod.spider.merge.h.b.c((String)var8_13, var6_4, (Map<String, String>)var7_9);
                    var7_9 = new JSONObject((String)var6_4);
                    if (var7_9.optInt(var11_3) != 1) {
                        this.z = var12_18;
                        this.u = var3_5 = this.u + 1;
                        if (var3_5 >= this.v) {
                            return var2_2;
                        }
                        break block43;
                    }
                    ** GOTO lbl228
                }
                var8_13 = new StringBuilder();
                var8_13.append(var13_20);
                var8_13.append((String)var6_4);
                if (!com.github.catvod.spider.merge.k.g.g(var8_13.toString(), (Map<String, String>)var7_9).contains(cYh.d("083B"))) {
                    this.z = var12_18;
                    this.u = var3_5 = this.u + 1;
                    if (var3_5 < this.v) break block43;
                    return var2_2;
                }
                ** GOTO lbl228
            }
            try {
                this.P(var1_1, (String)var2_2);
lbl228:
                // 3 sources

                ++this.u;
                var6_4 = this.j(var1_1);
            }
            catch (Exception var7_10) {
                var1_1 = this.I;
                var6_4 = var2_2;
                if (var1_1 == null) break block44;
                com.github.catvod.spider.merge.i.b.a(var7_10, com.github.catvod.spider.merge.d.d.b(cYh.d("0D252C21352E103127797EB3F3C9A9FEF8774A6E")), (SpiderApi)var1_1);
                var6_4 = var2_2;
            }
        }
        return var6_4;
    }

    private String Q(String string) {
        String string2 = cYh.d("8FEDEDB5EED382E7E7B7DCF682DFF6");
        String string3 = string;
        if (string.indexOf(string2) >= 0) {
            string3 = string.replace(string2, cYh.d("3C"));
        }
        string2 = cYh.d("8FEDEDB5EED382DFF2B7DCF682DFF6");
        string = string3;
        if (string3.indexOf(string2) >= 0) {
            string = string3.replace(string2, cYh.d("3A"));
        }
        return string;
    }

    private String R(String charSequence, String object) {
        String[] stringArray;
        block4: {
            block3: {
                if (object.equals(cYh.d("4D"))) break block3;
                stringArray = object;
                if (!object.isEmpty()) break block4;
            }
            stringArray = charSequence;
        }
        object = cYh.d("3B76");
        String[] stringArray2 = ((String)charSequence).split((String)object);
        stringArray = stringArray.split((String)object);
        charSequence = "";
        for (int i2 = 0; i2 < stringArray2.length; ++i2) {
            object = i2 < stringArray2.length - 1 ? cYh.d("44") : "";
            charSequence = com.github.catvod.spider.merge.d.d.b((String)charSequence);
            ((StringBuilder)charSequence).append(stringArray2[i2]);
            ((StringBuilder)charSequence).append(cYh.d("43"));
            charSequence = com.github.catvod.spider.merge.b.n.b((StringBuilder)charSequence, stringArray[i2], (String)object);
        }
        return charSequence;
    }

    private String S(String string, String string2) {
        String string3;
        int n2 = string.length();
        String string4 = string3 = "";
        if (n2 > 1) {
            String[] stringArray = string.split(cYh.d("44"));
            if (stringArray.length == 1) {
                string = stringArray[0].replaceAll(cYh.d("497A6939232E177E6B78"), cYh.d("4361"));
            } else if (stringArray.length > 1) {
                block9: {
                    int n3 = stringArray.length;
                    n2 = 0;
                    while (true) {
                        string4 = cYh.d("3B74");
                        if (n2 >= n3) break;
                        string = stringArray[n2];
                        if (string2.equals(string.split(string4)[0])) {
                            string = string.split(string4)[1];
                            break block9;
                        }
                        ++n2;
                    }
                    string = "";
                }
                if (string.length() < 1) {
                    string = stringArray[0].split(string4)[1];
                }
            } else {
                string = "";
            }
            string4 = string3;
            if (string != null) {
                string4 = !string.startsWith(cYh.d("0F243521")) ? string3 : string;
            }
        }
        return string4;
    }

    /*
     * WARNING - void declaration
     */
    private void T(Map<String, List<String>> object6) {
        String string;
        String string2;
        String string3;
        if (object6.isEmpty()) {
            return;
        }
        Object object = this.I;
        if (object != null) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("82C3CCB4EDCE4A7D7F71"));
            stringBuilder.append(object6.toString());
            object.log(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string4 = cYh.d("1435357C3435083B2834");
        Object object2 = object6.get(string4);
        object = cYh.d("5C");
        if (object2 != null && !((List)object6.get(string4)).isEmpty()) {
            Iterator iterator = ((List)object6.get(string4)).iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(((String)iterator.next()).split((String)object)[0]);
                stringBuilder.append((String)object);
            }
        }
        if (object6.get(string3 = cYh.d("3435357C3435083B2834")) != null && !((List)object6.get(string3)).isEmpty()) {
            for (String string5 : (List)object6.get(string3)) {
                if (stringBuilder.indexOf(string5.split((String)object)[0]) >= 0) continue;
                stringBuilder.append(string5.split((String)object)[0]);
                stringBuilder.append((String)object);
            }
        }
        if (object6.get(string2 = cYh.d("3435357C1435083B2834")) != null && !((List)object6.get(string2)).isEmpty()) {
            for (String string6 : (List)object6.get(string2)) {
                if (stringBuilder.indexOf(string6.split((String)object)[0]) >= 0) continue;
                stringBuilder.append(string6.split((String)object)[0]);
                stringBuilder.append((String)object);
            }
        }
        if (object6.get(string = cYh.d("1435357C1435083B2834")) != null && !((List)object6.get(string)).isEmpty()) {
            for (String string7 : (List)object6.get(string)) {
                if (stringBuilder.indexOf(string7.split((String)object)[0]) >= 0) continue;
                stringBuilder.append(string7.split((String)object)[0]);
                stringBuilder.append((String)object);
            }
        }
        if (stringBuilder.toString().length() < 3) {
            return;
        }
        for (String string8 : stringBuilder.toString().split((String)object)) {
            void var1_13;
            String string9 = this.z;
            object2 = cYh.d("5A");
            int n2 = string9.indexOf(string8.split((String)object2)[0]);
            String string10 = cYh.d("57");
            if (n2 < 0) {
                String string11 = string8;
                if (this.z.length() >= 1) {
                    if (string10.equals(this.z)) {
                        String string12 = string8;
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(this.z);
                        stringBuilder2.append((String)object);
                        stringBuilder2.append(string8);
                        String string13 = stringBuilder2.toString();
                    }
                }
            } else {
                String string14;
                if (string8.endsWith((String)object2) || string10.equals(string8.split((String)object2)[1])) continue;
                String string15 = com.github.catvod.spider.merge.b.n.b(new StringBuilder(), this.z, (String)object);
                string10 = com.github.catvod.spider.merge.b.n.b(new StringBuilder(), string8.split((String)object2)[0], cYh.d("5A7E6B6E6C"));
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string8);
                ((StringBuilder)object2).append((String)object);
                this.z = string14 = string15.replaceAll(string10, ((StringBuilder)object2).toString());
                String string16 = string14.substring(0, string14.length() - 1);
            }
            this.z = var1_13;
        }
    }

    private static String V(String string) {
        if (string.length() < 1) {
            return string;
        }
        Matcher matcher = Pattern.compile(cYh.d("4F0C1D247F06102B752C7E73")).matcher(string);
        while (matcher.find()) {
            String string2 = matcher.group(1);
            char c2 = (char)Integer.parseInt(matcher.group(2), 16);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c2);
            stringBuilder.append("");
            string = string.replace(string2, stringBuilder.toString());
        }
        return string.replaceAll(cYh.d("3B0C"), "");
    }

    /*
     * Exception decompiling
     */
    private JSONObject W(String var1_1, String var2_3, boolean var3_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 67[TRYBLOCK] [101 : 3991->3999)] java.lang.Throwable
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

    private void X(String string) {
        String string2;
        String string3 = cYh.d("80FEC1B5ECD1");
        if (this.B(string3).length() > 0) {
            com.github.catvod.spider.merge.b.p.l = this.L(this.Y(string, this.B(string3), "").get(0));
        }
        if (this.B(string3 = cYh.d("82FFFDB7EBCE")).length() > 0) {
            com.github.catvod.spider.merge.b.p.m = this.L(this.Y(string, this.B(string3), "").get(0));
        }
        if (this.D(string2 = cYh.d("83E8FAB7EBCE"), string3 = cYh.d("81ECD5B4C6C2"), "").length() > 0) {
            com.github.catvod.spider.merge.b.p.n = this.L(this.Y(string, this.D(string2, string3, ""), "").get(0));
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private ArrayList<String> Y(String var1_1, String var2_2, String var3_3) {
        var7_4 = new ArrayList<String>();
        var8_5 = cYh.d("3B7B");
        var6_6 = var2_2;
        if (var2_2.indexOf((String)var8_5) >= 0) {
            var6_6 = var2_2.replace((CharSequence)var8_5, cYh.d("8FEDEDB5EED382DAE1B4D8ED"));
        }
        var9_7 = cYh.d("3B78");
        var2_2 = var6_6;
        if (var6_6.indexOf(var9_7) >= 0) {
            var2_2 = var6_6.replace(var9_7, cYh.d("8FEDEDB5EED382E7E7B4E7D581DBEDB4D8ED"));
        }
        var9_7 = cYh.d("3B79");
        var6_6 = var2_2;
        if (var2_2.indexOf(var9_7) >= 0) {
            var6_6 = var2_2.replace(var9_7, cYh.d("8FEDEDB5EED382DFF2B4E7D581DBEDB4D8ED"));
        }
        if (var6_6.indexOf(cYh.d("4C")) < 0) {
            return this.c0(var1_1, var6_6, (String)var3_3 /* !! */ );
        }
        var8_5 = var6_6.split((String)var8_5);
        var2_2 = new StringBuilder();
        for (String[] var3_3 : var8_5) {
            block10: {
                if (var3_3 /* !! */ .isEmpty()) continue;
                if (var3_3 /* !! */ .startsWith(cYh.d("12222D6B"))) break block10;
                var3_3 /* !! */  = this.c0(var1_1, (String)var3_3 /* !! */ , "");
                ** GOTO lbl30
            }
            var6_6 = var3_3 /* !! */ .substring(4);
            var3_3 /* !! */  = var6_6;
            if (var6_6.indexOf(cYh.d("432334336D")) <= 0) ** GOTO lbl33
            var3_3 /* !! */  = var6_6.split(cYh.d("3B74322435065D"));
            if (var3_3 /* !! */ .length > 1) {
                var3_3 /* !! */  = this.c0(this.j(var3_3 /* !! */ [0]), var3_3 /* !! */ [1], "");
lbl30:
                // 2 sources

                var6_6 = ((String)var3_3 /* !! */ .get(0)).trim();
            } else {
                var3_3 /* !! */  = var3_3 /* !! */ [0];
lbl33:
                // 2 sources

                var6_6 = this.j((String)var3_3 /* !! */ );
            }
            if (var6_6.isEmpty()) continue;
            var3_3 /* !! */  = var2_2;
            if (var6_6.startsWith(cYh.d("0F243521"))) {
                var3_3 /* !! */  = var2_2;
                if (!var2_2.toString().trim().endsWith(cYh.d("5A"))) {
                    var3_3 /* !! */  = var2_2;
                    if (!var2_2.toString().trim().endsWith(cYh.d("8FF7E2B7C9CA"))) {
                        var3_3 /* !! */  = new StringBuilder();
                    }
                }
            }
            var3_3 /* !! */ .append(var6_6);
            var2_2 = var3_3 /* !! */ ;
        }
        var7_4.add(var2_2.toString());
        return var7_4;
    }

    /*
     * Unable to fully structure code
     */
    private ArrayList<String> Z(String var1_1, String var2_3, String var3_4) {
        block109: {
            block99: {
                block98: {
                    block97: {
                        block94: {
                            block95: {
                                block96: {
                                    block110: {
                                        block93: {
                                            block112: {
                                                block111: {
                                                    block92: {
                                                        block91: {
                                                            var13_5 = var1_1;
                                                            var12_6 = var2_3;
                                                            var17_7 = cYh.d("3B0D");
                                                            var18_8 = cYh.d("3B0B");
                                                            var21_9 = cYh.d("81C5F5B8F6EF");
                                                            var16_10 = cYh.d("8FEDEDB5EED382DFF2B4E7D581DBEDB4D8ED");
                                                            var22_11 = cYh.d("8FEDEDB5EED382E7E7B4E7D581DBEDB4D8ED");
                                                            var23_12 = cYh.d("8FEDEDB5EED382DAE1B4D8ED");
                                                            var20_13 = cYh.d("3B741D75");
                                                            var15_14 = cYh.d("3B7A");
                                                            var19_15 = cYh.d("4176");
                                                            var14_16 = new ArrayList<String>();
                                                            if (var2_3.isEmpty() && var3_4.isEmpty() || var12_6.equals(cYh.d("80F9FB7573BDCEEA")) || var12_6.equals(cYh.d("80F9FB"))) break block109;
                                                            var1_1 = var12_6;
                                                            if (var12_6.indexOf(var23_12) >= 0) {
                                                                var1_1 = var12_6.replace(var23_12, cYh.d("4C"));
                                                            }
                                                            var12_6 = var1_1;
                                                            if (var1_1.indexOf(var22_11) >= 0) {
                                                                var12_6 = var1_1.replace(var22_11, cYh.d("4F"));
                                                            }
                                                            var2_3 = var12_6;
                                                            if (var12_6.indexOf((String)var16_10) >= 0) {
                                                                var2_3 = var12_6.replace((CharSequence)var16_10, cYh.d("4E"));
                                                            }
                                                            var4_17 = var2_3.indexOf(var19_15);
                                                            var16_10 = cYh.d("81CBFEB7DAF8");
                                                            var22_11 = cYh.d("4374");
                                                            if (var4_17 < 0) {
                                                                if (var2_3.indexOf(var22_11) >= 0 || var2_3.length() <= 0 || var3_4.length() >= 1) break block91;
                                                                var1_1 = var2_3;
                                                                if (var2_3.indexOf((String)var16_10) >= 0) {
                                                                    var1_1 = this.a0((String)var2_3, (String)var13_5);
                                                                }
                                                                var14_16.add((String)var1_1);
                                                                return var14_16;
                                                            }
                                                        }
                                                        var1_1 = var13_5;
                                                        var12_6 = var2_3;
                                                        if (!var2_3.endsWith(var21_9)) break block92;
                                                        var2_3 = var2_3.replace(var21_9, "");
                                                        var1_1 = var13_5;
                                                        var12_6 = var2_3;
                                                        if (this.x.length() <= 0) break block92;
                                                        var1_1 = this.x;
                                                        var12_6 = var2_3;
                                                    }
                                                    var2_3 = var12_6;
                                                    if (var12_6.indexOf(var18_8) >= 0) {
                                                        var2_3 = var12_6.replace(var18_8, cYh.d("8FEDEDB5EED382E7E7B7DCF682DFF6"));
                                                    }
                                                    var12_6 = var2_3;
                                                    if (var2_3.indexOf(var17_7) >= 0) {
                                                        var12_6 = var2_3.replace(var17_7, cYh.d("8FEDEDB5EED382DFF2B7DCF682DFF6"));
                                                    }
                                                    var2_3 = var12_6;
                                                    if (var12_6.indexOf((String)var15_14) >= 0) {
                                                        var2_3 = var12_6.replace(var15_14, cYh.d("8FEDEDB5EED381C8DEB4D8ED"));
                                                    }
                                                    var4_17 = var2_3.indexOf(cYh.d("3B76"));
                                                    var17_7 = cYh.d("8FEDEDB5EED38FEFDFB7D9FF80FCE7");
                                                    var12_6 = var2_3;
                                                    if (var4_17 >= 0) {
                                                        var12_6 = var2_3.replace(cYh.d("3B76"), var17_7);
                                                    }
                                                    var2_3 = var12_6;
                                                    if (var12_6.indexOf(cYh.d("3B73")) >= 0) {
                                                        var2_3 = var12_6.replace(cYh.d("3B73"), cYh.d("8FEDEDB5EED383EAD4B4D8ED"));
                                                    }
                                                    var4_17 = var2_3.indexOf(var19_15);
                                                    var18_8 = cYh.d("3C");
                                                    var21_9 = cYh.d("3B761D77");
                                                    if (var4_17 < 0) break block110;
                                                    if (var2_3.split(var21_9) == null || var2_3.split(var21_9).length < 1) break block93;
                                                    var4_17 = var2_3.split(var21_9).length;
                                                    var20_13 = cYh.d("81D8EBB4D8CC82D8F1B7CBF182E0FF");
                                                    var3_4 = var1_1;
                                                    var12_6 = var2_3;
                                                    if (var4_17 != 1) ** GOTO lbl116
                                                    if (!var2_3.startsWith(var19_15)) break block111;
                                                    var3_4 = new StringBuilder();
                                                    var3_4.append(cYh.d("83EBCFB4F3EE81D8EBB4D8CC"));
                                                    var3_4.append((String)var1_1);
                                                    var3_4 = var3_4.toString();
                                                    var1_1 = new StringBuilder();
                                                    var1_1.append(cYh.d("83EBCFB4F3EE81D8EBB4D8CC"));
                                                    var1_1.append((String)var2_3);
                                                    ** GOTO lbl115
                                                }
                                                var3_4 = var1_1;
                                                var12_6 = var2_3;
                                                if (!var2_3.endsWith(var19_15)) break block112;
                                                var3_4 = new StringBuilder();
                                                var3_4.append((String)var1_1);
                                                var3_4.append(var20_13);
                                                var3_4 = var3_4.toString();
                                                var1_1 = new StringBuilder();
                                                var1_1.append((String)var2_3);
                                                var1_1.append(var20_13);
lbl115:
                                                // 2 sources

                                                var12_6 = var1_1.toString();
                                            }
                                            var13_5 = var12_6.split(var21_9)[1];
                                            var2_3 = var3_4;
                                            var1_1 = var13_5;
                                            if (var13_5.startsWith(var18_8)) {
                                                var1_1 = new StringBuilder();
                                                var1_1.append(var20_13);
                                                var1_1.append((String)var13_5);
                                                var1_1 = var1_1.toString();
                                                var2_3 = new StringBuilder();
                                                var2_3.append((String)var3_4);
                                                var2_3.append(var20_13);
                                                var2_3 = var2_3.toString();
                                            }
                                            var3_4 = var12_6.split(var21_9)[0];
                                            var13_5 = var2_3;
                                            var2_3 = var3_4;
                                            var3_4 = var1_1;
                                            break block94;
                                        }
                                        var14_16.add((String)var1_1);
                                        return var14_16;
                                    }
                                    if (var2_3.indexOf(var22_11) < 0) break block95;
                                    if (var2_3.split(var20_13) == null || var2_3.split(var21_9).length < 2) break block96;
                                    var3_4 = var2_3.split(var20_13)[1];
                                    var2_3 = var2_3.split(var20_13)[0];
                                    var13_5 = var1_1;
                                    break block94;
                                }
                                var14_16.add((String)var1_1);
                                return var14_16;
                            }
                            var13_5 = var1_1;
                        }
                        var12_6 = var2_3;
                        if (var2_3.indexOf(var17_7) >= 0) {
                            var12_6 = var2_3.replace(var17_7, cYh.d("41"));
                        }
                        var1_1 = var3_4;
                        if (var3_4.indexOf(var17_7) >= 0) {
                            var1_1 = var3_4.replace(var17_7, cYh.d("41"));
                        }
                        var4_17 = var12_6.indexOf(var18_8);
                        var17_7 = cYh.d("4361");
                        if (var4_17 >= 0) {
                            var2_3 = var12_6.replaceAll(cYh.d("497A690D0C744D79"), var17_7);
                            var12_6 = var12_6.replaceAll(cYh.d("3B0B6F7B"), "");
                        } else {
                            var2_3 = "";
                        }
                        var3_4 = var1_1;
                        if (var1_1.indexOf(var18_8) >= 0) {
                            var2_3 = var1_1.replaceAll(cYh.d("497A690D0C744D79"), var17_7);
                            var3_4 = var1_1.replaceAll(cYh.d("3B0B6F7B"), "");
                        }
                        var11_18 = var12_6.matches(cYh.d("4A6F1D357C"));
                        var18_8 = cYh.d("4A");
                        if (var11_18) {
                            if (!var3_4.matches(cYh.d("4A6F1D357C"))) break block97;
                            var4_17 = var12_6.startsWith(var18_8) != false ? var13_5.length() - Integer.parseInt(var12_6.replace(var18_8, "")) : Integer.parseInt((String)var12_6) - 1;
                            var5_19 = var3_4.startsWith(var18_8) != false ? var13_5.length() - Integer.parseInt(var3_4.replace(var18_8, "")) + 1 : Integer.parseInt((String)var3_4);
                            var3_4 = var13_5.substring(var4_17, var5_19);
                            var1_1 = var3_4;
                            if (var2_3.indexOf((String)var16_10) > 0) {
                                var1_1 = this.a0((String)var2_3, (String)var3_4);
                            }
                            var14_16.add((String)var1_1);
                            return var14_16;
                        }
                    }
                    var1_1 = this.Q((String)var12_6);
                    var3_4 = this.Q((String)var3_4);
                    var1_1 = this.N((String)var1_1);
                    var3_4 = this.N((String)var3_4);
                    if (var1_1.indexOf(cYh.d("4D")) >= 0) break block98;
                    var1_1 = this.i((String)var1_1);
                    var4_17 = 1;
                    ** GOTO lbl246
                }
                if (var1_1.indexOf(cYh.d("4D7A")) >= 0) ** GOTO lbl228
                var12_6 = var1_1.split((String)var15_14);
                var1_1 = this.i(this.e0((String)var12_6[0]));
                var4_17 = 1;
                while (true) {
                    if (var4_17 >= ((CharSequence)var12_6).length) break;
                    var15_14 = new StringBuilder();
                    var15_14.append((String)var1_1);
                    var15_14.append(cYh.d("4F0B1F6F0A705879"));
                    var15_14.append(this.i(this.e0((String)var12_6[var4_17])));
                    var1_1 = var15_14.toString();
                    ++var4_17;
                    continue;
                    break;
                }
                var4_17 = ((CharSequence)var12_6).length;
                ** GOTO lbl246
lbl228:
                // 1 sources

                var12_6 = var1_1.split(cYh.d("3B7A1D7B"));
                var1_1 = this.i(this.e0((String)var12_6[0]));
                var4_17 = 1;
                while (true) {
                    if (var4_17 >= ((CharSequence)var12_6).length) break;
                    var15_14 = new StringBuilder();
                    var15_14.append((String)var1_1);
                    var15_14.append(cYh.d("4F0B1D020B293A7A7E78"));
                    var15_14.append(this.i(this.e0((String)var12_6[var4_17])));
                    var1_1 = var15_14.toString();
                    ++var4_17;
                    continue;
                    break;
                }
                try {
                    var4_17 = ((CharSequence)var12_6).length;
lbl246:
                    // 3 sources

                    var12_6 = new StringBuilder();
                    var12_6.append((String)var1_1);
                    var12_6.append(cYh.d("4F0B1D020B293A7A7E78"));
                    var12_6.append(this.i((String)var3_4));
                    var1_1 = Pattern.compile(var12_6.toString()).matcher(var13_5);
                    var5_20 = 0;
                }
                catch (Throwable var1_2) {
                    if (this.m) {
                        var2_3 = new StringBuilder();
                        var2_3.append(this.G);
                        var2_3.append(cYh.d("8FE0C2B9F8CF4A6E32243519083E3534392E222835B4D0E08EC4D8BEEBC0"));
                        var2_3.append(var1_2.toString());
                        Init.show(var2_3.toString());
                    }
                    if ((var3_4 = this.I) == null) break block99;
                    var2_3 = com.github.catvod.spider.merge.d.d.b(cYh.d("14252312383413352F251222137868B8C3C38FFFEE7C7A64"));
                    var2_3.append(var1_2.toString());
                    var3_4.log(var2_3.toString());
                }
                while (true) {
                    block102: {
                        block106: {
                            block103: {
                                block113: {
                                    block101: {
                                        if (!var1_1.find()) break block99;
                                        var3_4 = var1_1.group(var4_17);
                                        var9_24 = var5_20 + 1;
                                        var12_6 = new StringBuilder((String)var3_4);
                                        var12_6.append(cYh.d("5BB5FBDEB2D5D06E"));
                                        var12_6.append(var9_24);
                                        var12_6 = this.a0((String)var2_3, var12_6.toString());
                                        var5_20 = var2_3.indexOf(cYh.d("3CB5CDD4B2CACC6A"));
                                        var15_14 = cYh.d("44");
                                        if (var5_20 >= 0) {
                                            var3_4 = this.Q(var2_3.replaceAll(cYh.d("497A1D0AB2D6E2B5D1FA6D72497A7E780B07497A"), var17_7));
                                            if (var3_4.isEmpty()) ** break block100
                                            var3_4 = var3_4.split((String)var15_14);
                                            var6_21 = ((CharSequence)var3_4).length;
                                            for (var5_20 = 0; var5_20 < var6_21; ++var5_20) {
                                                var7_22 = var12_6.indexOf(this.e0(this.N((String)var3_4[var5_20])));
                                                if (var7_22 < 0) {
                                                    continue;
                                                }
                                                ** break block100
                                            }
                                            var6_21 = 0;
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            var6_21 = 1;
                                        }
                                        var13_5 = cYh.d("83E8CCB9F1DB");
                                        if (var6_21 == 0) break block113;
                                        var5_20 = var6_21;
                                        if (var2_3.indexOf(cYh.d("3CB4F9DCB2D6E2B5D1FA6D")) < 0) break block101;
                                        var3_4 = this.Q(var2_3.replaceAll(cYh.d("497A1D0AB3E2EAB5CDD4B2CACC6A697F7D654E0C1C7F7D"), var17_7));
                                        var5_20 = var6_21;
                                        if (var3_4.isEmpty()) break block101;
                                        var3_4 = var3_4.split((String)var15_14);
                                        var6_21 = ((CharSequence)var3_4).length;
                                        for (var5_20 = 0; var5_20 < var6_21; ++var5_20) {
                                            if (var12_6.indexOf(this.e0(this.N((String)var3_4[var5_20]))) < 0) continue;
                                            var5_20 = 0;
                                            break block101;
                                        }
                                        var5_20 = 1;
                                    }
                                    if (var5_20 != 0) ** GOTO lbl309
                                }
                                var14_16.add((String)var13_5);
                                break block102;
lbl309:
                                // 1 sources

                                if (var2_3.indexOf(cYh.d("3CB5D1FAB2E0E8B5CEE66D")) < 0 || (var3_4 = var2_3.replaceAll(cYh.d("497A1D0AB2CACCB5FBDEB2D5D06A697F7D654E0C1C7F7D"), var17_7)).isEmpty()) break block103;
                                var16_10 = var3_4.split((String)var15_14);
                                var10_25 = var16_10.length;
                                var5_20 = 0;
                                for (var6_21 = 0; var6_21 < var10_25; ++var6_21) {
                                    block105: {
                                        block104: {
                                            var3_4 = var16_10[var6_21];
                                            if (var3_4.indexOf(var18_8) < 0) break block104;
                                            var3_4 = var3_4.split(var18_8);
                                            var8_23 = Integer.parseInt((String)var3_4[0]);
                                            while (true) {
                                                var7_22 = var5_20;
                                                if (var8_23 > Integer.parseInt((String)var3_4[1])) break block105;
                                                if (var8_23 == var9_24) {
                                                    var7_22 = 1;
                                                    break block105;
                                                }
                                                ++var8_23;
                                                continue;
                                                break;
                                            }
                                        }
                                        var8_23 = var4_17;
                                        var7_22 = var5_20;
                                        if (Integer.parseInt((String)var3_4) != var9_24) break block105;
                                        var5_20 = 1;
                                        var4_17 = var8_23;
                                        break;
                                    }
                                    var5_20 = var7_22;
                                }
                            }
                            if (var5_20 == 0) {
                                while (true) {
                                    var14_16.add((String)var13_5);
                                    break block102;
                                    break;
                                }
                            }
                            var6_21 = var5_20;
                            if (var2_3.indexOf(cYh.d("3CB4F9DCB2CACCB5FBDEB2D5D06A")) < 0) break block106;
                            var3_4 = var2_3.replaceAll(cYh.d("497A1D0AB3E2EAB5D1FAB2E0E8B5CEE66D72497A7E780B07497A"), var17_7);
                            var6_21 = var5_20;
                            if (var3_4.isEmpty()) break block106;
                            var3_4 = var3_4.split((String)var15_14);
                            var10_25 = ((CharSequence)var3_4).length;
                            var5_20 = 1;
                            for (var6_21 = 0; var6_21 < var10_25; ++var6_21) {
                                block108: {
                                    block107: {
                                        var15_14 = var3_4[var6_21];
                                        if (var15_14.indexOf(var18_8) < 0) break block107;
                                        var15_14 = var15_14.split(var18_8);
                                        var8_23 = Integer.parseInt((String)var15_14[0]);
                                        while (true) {
                                            var7_22 = var5_20;
                                            if (var8_23 > Integer.parseInt((String)var15_14[1])) break block108;
                                            if (var8_23 == var9_24) {
                                                var7_22 = 0;
                                                break block108;
                                            }
                                            ++var8_23;
                                            continue;
                                            break;
                                        }
                                    }
                                    var7_22 = var5_20;
                                    if (Integer.parseInt((String)var15_14) != var9_24) break block108;
                                    var6_21 = 0;
                                    break block106;
                                }
                                var5_20 = var7_22;
                            }
                            var6_21 = var5_20;
                        }
                        if (var6_21 == 0) ** continue;
                        var14_16.add((String)var12_6);
                    }
                    var5_20 = var9_24;
                }
            }
            if (var14_16.isEmpty()) {
                var14_16.add("");
            }
            return var14_16;
        }
        var14_16.add((String)var13_5);
        return var14_16;
    }

    static /* synthetic */ String a(XBPQ xBPQ, String string) {
        xBPQ.A = string;
        return string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String a0(String var1_1, String var2_2) {
        block60: {
            block61: {
                var14_4 = cYh.d("3B7A");
                var13_5 = cYh.d("596E");
                var10_6 = cYh.d("4473");
                var15_7 = cYh.d("4361");
                var11_8 = cYh.d("4D");
                var12_9 = cYh.d("596E7F");
                var7_10 /* !! */  = var2_2;
                var9_11 = var2_2.replaceAll(cYh.d("497A7DB4EDD582DFF66F7F744D79"), (String)var15_7);
                var7_10 /* !! */  = var2_2;
                var2_2 = var2_2.replaceAll(cYh.d("5BB5FBDEB2D5D06E6F7B"), "");
                var8_12 = var2_2;
                var7_10 /* !! */  = var2_2;
                if (var1_1.indexOf(cYh.d("81CBFEB7DAF8")) < 0) break block60;
                var7_10 /* !! */  = var2_2;
                var8_12 = var1_1.replaceAll(cYh.d("497A1D0AB3E1E26FA7CAE8BCEAF21A6BB8E6FD0D697F7D654E0C1C7F7D"), (String)var15_7);
                var7_10 /* !! */  = var2_2;
                if (var8_12.indexOf(var10_6) < 0) break block61;
                var7_10 /* !! */  = var2_2;
                return this.Y((String)var2_2, var8_12.replace(var10_6, cYh.d("4176")), "").get(0).trim();
            }
            var7_10 /* !! */  = var2_2;
            var9_11 = this.Q((String)var8_12).replace(cYh.d("5BB5FBDEB2D5D06E"), var9_11);
            var8_12 = var2_2;
            var7_10 /* !! */  = var2_2;
            if (var9_11.isEmpty()) break block60;
            var7_10 /* !! */  = var2_2;
            var15_7 = var9_11.split(cYh.d("44"));
            var7_10 /* !! */  = var2_2;
            try {
                var4_13 = var15_7.length;
                var3_14 = 0;
            }
            catch (Exception var2_3) {
                if (this.m) {
                    var8_12 = new StringBuilder();
                    var8_12.append(this.G);
                    var8_12.append(cYh.d("8FE0C2B9F8CF4A6EA7CAE8BCEAF2A4D6EDB3F3C9AEEDDBB2C8E7A7F2D7BCF8F5AEEDCD"));
                    var8_12.append(var1_1);
                    var8_12.append(cYh.d("4A6E"));
                    var8_12.append(var2_3.toString());
                    Init.show(var8_12.toString());
                }
                if ((var1_1 = this.I) != null) {
                    com.github.catvod.spider.merge.i.b.a(var2_3, com.github.catvod.spider.merge.d.d.b(cYh.d("81CBFEB7DAF813186978BECEFEB8EEFEB8E6E67D6C6F")), (SpiderApi)var1_1);
                }
                return var7_10 /* !! */ ;
            }
            while (true) {
                block67: {
                    block64: {
                        block66: {
                            block65: {
                                block63: {
                                    block62: {
                                        var8_12 = var2_2;
                                        if (var3_14 >= var4_13) break;
                                        var7_10 /* !! */  = var2_2;
                                        var8_12 = this.N(var15_7[var3_14]);
                                        var7_10 /* !! */  = var2_2;
                                        if (var8_12.indexOf(var12_9) >= 0) break block62;
                                        var7_10 /* !! */  = var2_2;
                                        var9_11 = var8_12.split(var13_5)[0];
                                        var7_10 /* !! */  = var2_2;
                                        var8_12 = var8_12.split(var13_5)[1];
                                        break block63;
                                    }
                                    var7_10 /* !! */  = var2_2;
                                    var7_10 /* !! */  = var2_2;
                                    var9_11 = new StringBuilder();
                                    var7_10 /* !! */  = var2_2;
                                    var9_11.append(var8_12.split(var12_9)[0]);
                                    var7_10 /* !! */  = var2_2;
                                    var9_11.append(cYh.d("59"));
                                    var7_10 /* !! */  = var2_2;
                                    var9_11 = var9_11.toString();
                                    var7_10 /* !! */  = var2_2;
                                    var8_12 = var8_12.split(var12_9)[1];
                                }
                                var7_10 /* !! */  = var2_2;
                                var10_6 = this.f0((String)var8_12);
                                var7_10 /* !! */  = var2_2;
                                var5_15 = var9_11.indexOf(var11_8);
                                var16_17 = cYh.d("80F9FB");
                                if (var5_15 < 0) break block64;
                                var7_10 /* !! */  = var2_2;
                                if (var10_6.length() <= 0) break block64;
                                var8_12 = var10_6;
                                var7_10 /* !! */  = var2_2;
                                if (var10_6.equals(var16_17)) {
                                    var8_12 = "";
                                }
                                var7_10 /* !! */  = var2_2;
                                var6_16 = var9_11.startsWith(var11_8);
                                var10_6 = cYh.d("4F0B1D020B293A7A7E78");
                                if (var6_16) {
                                    var7_10 /* !! */  = var2_2;
                                    var16_17 = this.e0(var9_11.substring(1, var9_11.length()));
                                    var7_10 /* !! */  = var2_2;
                                    var7_10 /* !! */  = var2_2;
                                    var9_11 = new StringBuilder();
                                    var7_10 /* !! */  = var2_2;
                                    var9_11.append(var10_6);
                                    var7_10 /* !! */  = var2_2;
                                    var9_11.append(this.i(var16_17));
lbl113:
                                    // 2 sources

                                    while (true) {
                                        var7_10 /* !! */  = var2_2;
                                        var10_6 = var9_11.toString();
                                        var9_11 = var8_12;
                                        var8_12 = var10_6;
                                        break block65;
                                        break;
                                    }
                                }
                                var7_10 /* !! */  = var2_2;
                                if (!var9_11.endsWith(var11_8)) break block66;
                                var7_10 /* !! */  = var2_2;
                                var16_17 = this.e0(var9_11.substring(0, var9_11.length() - 1));
                                var7_10 /* !! */  = var2_2;
                                var7_10 /* !! */  = var2_2;
                                var9_11 = new StringBuilder();
                                var7_10 /* !! */  = var2_2;
                                var9_11.append(this.i(var16_17));
                                var7_10 /* !! */  = var2_2;
                                var9_11.append(var10_6);
                                ** continue;
                            }
lbl140:
                            // 3 sources

                            while (true) {
                                var7_10 /* !! */  = var2_2;
                                var8_12 = var2_2.replaceAll((String)var8_12, (String)var9_11);
                                break block67;
                                break;
                            }
                        }
                        var7_10 /* !! */  = var2_2;
                        var16_17 = this.e0(var9_11.split(var14_4)[0]);
                        var7_10 /* !! */  = var2_2;
                        var17_18 = this.e0(var9_11.split(var14_4)[1]);
                        var7_10 /* !! */  = var2_2;
                        var7_10 /* !! */  = var2_2;
                        var9_11 = new StringBuilder();
                        var7_10 /* !! */  = var2_2;
                        var9_11.append(this.i(var16_17));
                        var7_10 /* !! */  = var2_2;
                        var9_11.append(var10_6);
                        var7_10 /* !! */  = var2_2;
                        var9_11.append(this.i(var17_18));
                        var7_10 /* !! */  = var2_2;
                        var10_6 = var9_11.toString();
                        var9_11 = var8_12;
                        var8_12 = var10_6;
                        ** GOTO lbl140
                    }
                    var8_12 = var2_2;
                    var7_10 /* !! */  = var2_2;
                    if (var10_6.length() <= 0) break block67;
                    var7_10 /* !! */  = var2_2;
                    if (var9_11.equals(var16_17)) {
                        return var10_6;
                    }
                    var8_12 = var10_6;
                    var7_10 /* !! */  = var2_2;
                    if (var10_6.equals(var16_17)) {
                        var8_12 = "";
                    }
                    var7_10 /* !! */  = var2_2;
                    var10_6 = this.i(this.e0((String)var9_11));
                    var9_11 = var8_12;
                    var8_12 = var10_6;
                    ** continue;
                }
                ++var3_14;
                var2_2 = var8_12;
            }
        }
        return var8_12;
    }

    static /* synthetic */ String b(XBPQ xBPQ) {
        return xBPQ.G;
    }

    private ArrayList<String> b0(String string, String string2, String string3) {
        block28: {
            ArrayList<String> arrayList;
            block31: {
                String string4;
                block30: {
                    String string5;
                    String string6;
                    String string7;
                    String string8;
                    String string9;
                    int n2;
                    block29: {
                        arrayList = new ArrayList<String>();
                        if (string2.indexOf(cYh.d("25313234616E")) < 0) break block28;
                        n2 = string2.indexOf(cYh.d("250B"));
                        string9 = cYh.d("4361");
                        string8 = cYh.d("4176");
                        String string10 = n2 >= 0 ? string2.replaceAll(cYh.d("497A030D0C72497A7E780B07497A"), string9).replace(cYh.d("4473"), string8) : "";
                        string7 = cYh.d("81CBFEB7DAF8");
                        string4 = string10;
                        if (string10 != null) {
                            string4 = string10;
                            if (string10.indexOf(string7) > 0) {
                                string4 = com.github.catvod.spider.merge.b.n.a(string10, cYh.d("3A"));
                            }
                        }
                        if ((string10 = string2.replaceAll(cYh.d("497A0330243F51641D797F744D6F680D7E744D"), string9)).matches(cYh.d("497A6D0D33"))) {
                            n2 = Integer.parseInt(string10.substring(string10.length() - 1, string10.length()));
                            string10 = string10.substring(0, string10.length() - 2);
                        } else {
                            n2 = 1;
                        }
                        boolean bl = string10.isEmpty();
                        string6 = cYh.d("25313234616E4905131D0809261604B7FFFB82ECCE");
                        string9 = cYh.d("25313234616E491E0E0E00082600A7F9F6BFDBDF");
                        string5 = cYh.d("25313234616E491E0E0E071B2314081F10BCCFF1A4EDD8");
                        if (bl) break block29;
                        if (n2 == 2) {
                            string2 = string9 = new String(Base64.decode((String)this.Z(string, string10, string3).get(0).trim(), (int)1));
                            if (this.m) {
                                Init.show(string5);
                                string2 = string9;
                            }
                        } else if (n2 == 3) {
                            string2 = new String(Base64.decode((String)this.Z(string, string10, string3).get(0).trim(), (int)2));
                            if (this.m) {
                                Init.show(string9);
                            }
                        } else if (n2 == 4) {
                            string2 = string9 = new String(Base64.decode((String)this.Z(string, string10, string3).get(0).trim(), (int)8));
                            if (this.m) {
                                Init.show(string6);
                                string2 = string9;
                            }
                        } else {
                            string2 = "";
                        }
                        if (n2 == 1) {
                            string2 = new String(Base64.decode((String)this.Z(string, string10, string3).get(0).trim(), (int)0));
                        }
                        string3 = string2;
                        if (string4.indexOf(string8) >= 0) break block30;
                        string3 = string2;
                        if (string4.indexOf(string7) <= 0) break block31;
                        string3 = string2;
                        break block30;
                    }
                    if (n2 == 2) {
                        string = string2 = new String(Base64.decode((String)string, (int)1));
                        if (this.m) {
                            Init.show(string5);
                            string = string2;
                        }
                    } else if (n2 == 3) {
                        string = string2 = new String(Base64.decode((String)string, (int)2));
                        if (this.m) {
                            Init.show(string9);
                            string = string2;
                        }
                    } else if (n2 == 4) {
                        string = string2 = new String(Base64.decode((String)string, (int)8));
                        if (this.m) {
                            Init.show(string6);
                            string = string2;
                        }
                    } else {
                        string = new String(Base64.decode((String)string, (int)0));
                    }
                    string3 = string;
                    if (string4.indexOf(string8) >= 0) break block30;
                    string3 = string;
                    if (string4.indexOf(string7) <= 0) break block31;
                    string3 = string;
                }
                string3 = this.Z(string3, string4, "").get(0).trim();
            }
            arrayList.add(string3);
            return arrayList;
        }
        return this.Z(string, string2, string3);
    }

    static /* synthetic */ String c(XBPQ xBPQ) {
        return xBPQ.z;
    }

    private ArrayList<String> c0(String string, String string2, String string3) {
        block9: {
            ArrayList<String> arrayList;
            block12: {
                String string4;
                block11: {
                    String string5;
                    String string6;
                    block10: {
                        arrayList = new ArrayList<String>();
                        if (string2.indexOf(cYh.d("12222D153239083424")) < 0) break block9;
                        int n2 = string2.indexOf(cYh.d("250B"));
                        String string7 = cYh.d("4361");
                        String string8 = n2 >= 0 ? string2.replaceAll(cYh.d("497A69130B01497A7E0D0A73497A"), string7) : "";
                        n2 = string2.indexOf(cYh.d("230B"));
                        string6 = cYh.d("4176");
                        CharSequence charSequence = n2 >= 0 ? string2.replaceAll(cYh.d("497A050D0C72497A7E780B07497A"), string7).replace(cYh.d("4473"), string6) : "";
                        string5 = cYh.d("81CBFEB7DAF8");
                        string4 = charSequence;
                        if (charSequence != null) {
                            string4 = charSequence;
                            if (((String)charSequence).indexOf(string5) > 0) {
                                string4 = com.github.catvod.spider.merge.b.n.a((String)charSequence, cYh.d("3A"));
                            }
                        }
                        if ((string2 = string2.replaceAll(cYh.d("497A34233B1E02332E3532064F786F7B68733B796F7B"), string7)).isEmpty()) break block10;
                        if (string2.indexOf(cYh.d("25313234616E")) >= 0) {
                            string7 = cYh.d("4E");
                            if (string8 != null && string8.length() >= 1) {
                                charSequence = new StringBuilder();
                                ((StringBuilder)charSequence).append(string2);
                                ((StringBuilder)charSequence).append(string7);
                                ((StringBuilder)charSequence).append(string8);
                                string2 = ((StringBuilder)charSequence).toString();
                            } else {
                                string2 = com.github.catvod.spider.merge.b.n.a(string2, string7);
                            }
                        }
                        string = string2 = URLDecoder.decode(this.b0(string, string2, string3).get(0).trim());
                        if (string4.indexOf(string6) >= 0) break block11;
                        string = string2;
                        if (string4.indexOf(string5) <= 0) break block12;
                        string = string2;
                        break block11;
                    }
                    string = string2 = URLDecoder.decode(string);
                    if (string4.indexOf(string6) >= 0) break block11;
                    string = string2;
                    if (string4.indexOf(string5) <= 0) break block12;
                    string = string2;
                }
                string = this.Z(string, string4, "").get(0).trim();
            }
            arrayList.add(string);
            return arrayList;
        }
        return this.b0(string, string2, string3);
    }

    static /* synthetic */ String d(XBPQ xBPQ, String string) {
        xBPQ.z = string;
        return string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject e(String var1_1, String var2_4, boolean var3_5, HashMap<String, String> var4_6) {
        block26: {
            block25: {
                var9_7 = cYh.d("57");
                var14_8 = cYh.d("0C60");
                var13_9 = cYh.d("04");
                this.x = "";
                var8_10 = this.x((String)var1_1, (String)var2_4, var3_5, (HashMap<String, String>)var4_6 /* !! */ );
                var7_11 /* !! */  = new JSONArray();
                {
                    catch (JSONException var1_3) {
                        if (this.m) {
                            var2_4 = new StringBuilder();
                            var2_4.append(this.G);
                            var2_4.append(cYh.d("8FE0C2B9F8CF4A6E2230233F003F3328B2DDDDB9D5C8B8E6FD"));
                            var2_4.append(var1_3.toString());
                            Init.show(var2_4.toString());
                        }
                        if ((var4_6 /* !! */  = this.I) != null) {
                            var2_4 = com.github.catvod.spider.merge.d.d.b(cYh.d("04313534303515296978BECEFEB8EEFEB8E6E67D6C6F"));
                            var2_4.append(var1_3.toString());
                            var4_6 /* !! */ .log(var2_4.toString());
                        }
                        this.x = "";
                        return null;
                    }
                }
                var12_12 = cYh.d("0B393225");
                if (var8_10 == null) ** GOTO lbl29
                var7_11 /* !! */  = var8_10.getJSONArray(var12_12);
lbl29:
                // 2 sources

                var5_13 = var7_11 /* !! */ .length();
                var11_14 = cYh.d("5B3167776B75066E");
                var10_15 = cYh.d("81C0DDB6E3F8");
                var6_16 = var8_10;
                if (var5_13 >= 1) ** GOTO lbl50
                var6_16 = var8_10;
                if (this.w.length() < 1) {
                    if (var10_15.equals(this.r) && this.s.indexOf(var14_8) >= 0) {
                        this.s = this.s.replace(var14_8, "");
                    }
                    if (this.s.indexOf(var13_9) < 0) {
                        var6_16 = new StringBuilder();
                        var6_16.append(this.s);
                        var6_16.append(var13_9);
                        this.s = var6_16.toString();
                    }
                    if ((var6_16 = this.I) != null) {
                        var6_16.log(cYh.d("8FD7EBB4DDF281F8E0B4EBD55B3C286FB1C6CDB6C9FBB2D5F1B5C9E1B1CFD7B6CCFFB8E6EBB5F1CCBFF5F2B7D5F96B3B59B5C7DCB1D2CDB5CEC7B3E2E7B6EDF0"));
                    }
                    this.w = var11_14;
                    var6_16 = this.x((String)var1_1, (String)var2_4, var3_5, (HashMap<String, String>)var4_6 /* !! */ );
                }
lbl50:
                // 4 sources

                var8_10 = var7_11 /* !! */ ;
                if (var6_16 != null) {
                    var8_10 = var6_16.getJSONArray(var12_12);
                }
                var7_11 /* !! */  = var6_16;
                if (var8_10.length() < 1) {
                    var7_11 /* !! */  = var6_16;
                    if (var11_14.equals(this.w)) {
                        var6_16 = this.I;
                        if (var6_16 != null) {
                            var6_16.log(cYh.d("8FD7EBB4DDF281F8E0B4EBD55B317FB7CBF081D8EBB4D8CC82D8F1B7C2EA81DDEFBEEBD682E0DCB9F8CF80C4E96D3333116EA4D7DABCEFFAA4DEC1BEDFD0A7FDF6"));
                        }
                        this.w = cYh.d("5B342827717C5B7F25382164");
                        var1_1 = this.x((String)var1_1, (String)var2_4, var3_5, (HashMap<String, String>)var4_6 /* !! */ );
                        var7_11 /* !! */  = var1_1;
                        if (var10_15.equals(this.r)) {
                            this.w = "";
                            var7_11 /* !! */  = var1_1;
                        }
                    }
                }
                if ((var2_4 = this.B(cYh.d("81E5CEB9F0D282C9E9"))).length() < 1 && this.s.indexOf(cYh.d("2B")) >= 0) break block25;
                var1_1 = var2_4;
                if (!cYh.d("56").equals(var2_4)) break block26;
            }
            var1_1 = this.f;
        }
        var2_4 = this.n((String)var1_1);
        if (var10_15.equals(this.r) || !var1_1.startsWith(cYh.d("0F243521")) || (var3_5 = var9_7.equals(this.A))) ** GOTO lbl98
        try {
            var4_6 /* !! */  = new a(this, (String)var1_1, (String)var2_4);
            Init.run((Runnable)var4_6 /* !! */ , 200);
            if (!var9_7.equals(this.A)) {
                this.A = "";
            }
            ** GOTO lbl98
        }
        catch (Exception var1_2) {
            if (this.m) {
                var2_4 = new StringBuilder();
                var2_4.append(this.G);
                var2_4.append(cYh.d("8FE0C2B9F8CF4A6EA4D7D2BDDAFEA7E4D8B2C0D8A4C8FFB2D8C0A9F0DBBFE0EAA8C5CEB5DBCA"));
                var2_4.append(var1_2.toString());
                Init.show(var2_4.toString());
            }
            if ((var4_6 /* !! */  = this.I) != null) {
                var2_4 = new StringBuilder();
                var2_4.append(cYh.d("82D6C4B6EAF481E5CEB9F0D282C9E9B9E8CA8FF1CD797EB3F3C9A9FEF8B5DBD16C7C69"));
                var2_4.append(var1_2.toString());
                var4_6 /* !! */ .log(var2_4.toString());
            }
lbl98:
            // 5 sources

            this.x = "";
            return var7_11 /* !! */ ;
        }
    }

    private String e0(String string) {
        String string2 = cYh.d("8FEDEDB5EED381C8DEB4D8ED");
        String string3 = string;
        if (string.indexOf(string2) >= 0) {
            string3 = string.replace(string2, cYh.d("4D"));
        }
        return string3;
    }

    private String f0(String object) {
        String string;
        block8: {
            string = cYh.d("3B7A");
            try {
                if (((String)object).length() >= 0) break block8;
                return "";
            }
            catch (Exception exception) {
                Object object2;
                if (this.m) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(this.G);
                    ((StringBuilder)object2).append(cYh.d("8FE0C2B9F8CF4A6EA7CAE8BCEAF2A7D9FDBFE8C6A4D6EDB3F3C9AEEDCD"));
                    ((StringBuilder)object2).append(((Object)exception).toString());
                    Init.show(((StringBuilder)object2).toString());
                }
                if ((object2 = this.I) != null) {
                    com.github.catvod.spider.merge.i.b.a(exception, com.github.catvod.spider.merge.d.d.b(cYh.d("81CBFEB7DAF881D8EBB4D8CC1F381224351912246978BECEFEB8EEFEB8E6E67D6C6F")), (SpiderApi)object2);
                }
                return "";
            }
        }
        if (((String)object).indexOf(cYh.d("4D")) < 0) {
            return this.e0((String)object);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.i(this.e0(((String)object).split(string)[0])));
        stringBuilder.append(cYh.d("4F0B1D020B293A7A7E78"));
        stringBuilder.append(this.i(this.e0(((String)object).split(string)[1])));
        object = Pattern.compile(stringBuilder.toString()).matcher(this.x);
        if (((Matcher)object).find()) {
            return ((Matcher)object).group(1).replaceAll(cYh.d("3B76626E0C3B4A2A007C0D6A4A691C2A667656603C6A"), "").replaceAll(cYh.d("5B0B1F6F0A7059"), "").replaceAll(cYh.d("3C6E7D0C"), "").trim();
        }
        if (this.m) {
            Init.show(cYh.d("81CBFEB7DAF881CCEBB9D9ED82DFD7B4DFEA81CCC8B7C2D281D8EBB4D8CC82D6C4B4F9E3"));
        }
        return "";
    }

    private String fixCover(String string, String string2) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(cYh.d("17222E292E60487F253E6A2205203077243313357C"));
            stringBuilder.append(string2);
            stringBuilder.append(cYh.d("412028326A"));
            stringBuilder.append(string);
            stringBuilder.append(cYh.d("41232E242539023B24286A"));
            stringBuilder.append(this.B(cYh.d("81DCC6B4F9C083EBE2B6C7DC")));
            string2 = stringBuilder.toString();
            return string2;
        }
        catch (Exception exception) {
            Object object;
            if (this.m) {
                object = new StringBuilder();
                ((StringBuilder)object).append(this.G);
                ((StringBuilder)object).append(cYh.d("8FE0C2B9F8CF4A6E27382F1908262423B2DDDDB9D5C8B8E6FD"));
                ((StringBuilder)object).append(((Object)exception).toString());
                Init.show(((StringBuilder)object).toString());
            }
            if ((object = this.I) != null) {
                com.github.catvod.spider.merge.i.b.a(exception, com.github.catvod.spider.merge.d.d.b(cYh.d("01393912382C02226978BECEFEB8EEFE7A7759")), (SpiderApi)object);
            }
            return string;
        }
    }

    /*
     * Unable to fully structure code
     */
    private JSONArray g(String var1_1, String var2_3, String var3_4, String var4_5, String var5_6) {
        block44: {
            block43: {
                block42: {
                    block41: {
                        block33: {
                            block32: {
                                block30: {
                                    block31: {
                                        block39: {
                                            block38: {
                                                block37: {
                                                    block36: {
                                                        block35: {
                                                            block34: {
                                                                var10_7 = cYh.d("81C7F7B8C2E5");
                                                                var14_8 = cYh.d("4A");
                                                                var13_9 = cYh.d("43");
                                                                var11_10 = new JSONArray();
                                                                var6_11 = var1_1.indexOf(var13_9);
                                                                var15_12 = cYh.d("80E1FAB4C9D1");
                                                                var16_13 = cYh.d("043135341E3E");
                                                                var12_14 = cYh.d("41");
                                                                if (var6_11 < 0) ** GOTO lbl14
                                                                var1_1 = this.A(var16_13, var15_12, (String)var1_1, "");
                                                                break block34;
lbl14:
                                                                // 1 sources

                                                                if (var1_1.indexOf(var12_14) < 0) break block35;
                                                                var1_1 = this.A(var16_13, var15_12, (String)var1_1, this.D(cYh.d("80E1FAB4C9D182D0FD"), cYh.d("80FDDAB8D7D382FDD1B4DFDC80E1FAB7CCE581DDE3B9F8D7"), ""));
                                                            }
                                                            var11_10.put((Object)var1_1);
                                                        }
                                                        var6_11 = var2_3.indexOf(var13_9);
                                                        var15_12 = cYh.d("82D9E6B7D4DF");
                                                        var1_1 = cYh.d("043C202224");
                                                        if (var6_11 < 0) ** GOTO lbl27
                                                        var1_1 = this.A((String)var1_1, var15_12, (String)var2_3, "");
                                                        break block36;
lbl27:
                                                        // 1 sources

                                                        if (var2_3.indexOf(var12_14) < 0) break block37;
                                                        var1_1 = this.A((String)var1_1, var15_12, (String)var2_3, this.D(cYh.d("82D9E6B7D4DF82D0FD"), cYh.d("80FDDAB8D7D380E1FAB4C9D181CBFEB7DAF88FFFCC"), ""));
                                                    }
                                                    var11_10.put((Object)var1_1);
                                                }
                                                var6_11 = var3_4.indexOf(var13_9);
                                                var2_3 = cYh.d("82CCF1B4DBE0");
                                                var1_1 = cYh.d("06222430");
                                                if (var6_11 < 0) ** GOTO lbl40
                                                var1_1 = this.A((String)var1_1, (String)var2_3, var3_4, "");
                                                break block38;
lbl40:
                                                // 1 sources

                                                if (var3_4.indexOf(var12_14) < 0) break block39;
                                                var1_1 = this.A((String)var1_1, (String)var2_3, var3_4, this.D(cYh.d("82CCF1B4DBE082D0FD"), cYh.d("80FDDAB8D7D382CCF1B4DBE081CBFEB7DAF88FFFCC"), ""));
                                            }
                                            var11_10.put((Object)var1_1);
                                        }
                                        if (var4_5.indexOf(var14_8) < 0 || var4_5.indexOf(cYh.d("4A7D")) >= 0) break block30;
                                        var9_15 = Integer.parseInt(var4_5.split(var14_8)[1]);
                                        var8_16 = Integer.parseInt(var4_5.split(var14_8)[0]);
                                        var6_11 = var9_15;
                                        var7_17 = var8_16;
                                        if (var8_16 <= var9_15) break block31;
                                        var7_17 = var9_15;
                                        var6_11 = var8_16;
                                    }
                                    var1_1 = new StringBuilder();
                                    while (var6_11 >= var7_17) {
                                        block40: {
                                            if (var6_11 != var7_17) ** GOTO lbl63
                                            var1_1.append(String.valueOf(var6_11));
                                            break block40;
lbl63:
                                            // 1 sources

                                            var1_1.append(String.valueOf(var6_11));
                                            var1_1.append(var12_14);
                                        }
                                        --var6_11;
                                    }
                                    try {
                                        var1_1 = var1_1.toString();
                                        break block32;
                                    }
                                    catch (Exception var1_2) {
                                        if (this.m) {
                                            var2_3 = new StringBuilder();
                                            var2_3.append(this.G);
                                            var2_3.append(cYh.d("8FE0C2B9F8CF4A6E2223323B1316283D233F15B5C6EBBECEFEBFFDCB"));
                                            var2_3.append(var1_2.toString());
                                            Init.show(var2_3.toString());
                                        }
                                        if ((var2_3 = this.I) != null) {
                                            com.github.catvod.spider.merge.i.b.a(var1_2, com.github.catvod.spider.merge.d.d.b(cYh.d("04222430231C0E3C353425724EB9D5C8BFF5C87D6C6F")), (SpiderApi)var2_3);
                                        }
                                        return null;
                                    }
                                }
                                var1_1 = var4_5;
                            }
                            var2_3 = cYh.d("82E9F5B5ECE7");
                            if (this.B(var10_7).length() <= 0) break block33;
                            var2_3 = var10_7;
                        }
                        var6_11 = var1_1.indexOf(var13_9);
                        var3_4 = cYh.d("1E352023");
                        if (var6_11 < 0) ** GOTO lbl101
                        var1_1 = this.A(var3_4, (String)var2_3, (String)var1_1, "");
                        break block41;
lbl101:
                        // 1 sources

                        if (var1_1.indexOf(var12_14) < 0) break block42;
                        var1_1 = this.A(var3_4, (String)var2_3, (String)var1_1, this.E(cYh.d("82E9F5B5ECE782D0FD"), cYh.d("81C7F7B8C2E582D0FD"), cYh.d("80FDDAB8D7D382E9F5B5ECE781CBFEB7DAF88FFFCC"), ""));
                    }
                    var11_10.put((Object)var1_1);
                }
                var6_11 = var5_6.indexOf(var13_9);
                var1_1 = cYh.d("81DED3B4EDD5");
                var2_3 = cYh.d("0529");
                if (var6_11 < 0) ** GOTO lbl114
                var1_1 = this.A((String)var2_3, (String)var1_1, var5_6, "");
                break block43;
lbl114:
                // 1 sources

                if (var5_6.indexOf(var12_14) < 0) break block44;
                var1_1 = this.A((String)var2_3, (String)var1_1, var5_6, this.D(cYh.d("81DED3B4EDD582D0FD"), cYh.d("80FDDAB8D7D381DED3B4EDD581CBFEB7DAF88FFFCC"), ""));
            }
            var11_10.put((Object)var1_1);
        }
        return var11_10;
    }

    private String h(String object) {
        CharSequence charSequence;
        block13: {
            XBPQ$3 xBPQ$3 = new XBPQ$3();
            HashMap<String, String> hashMap = this.s;
            int n2 = ((String)object).indexOf(cYh.d("5C202E2223"));
            String string = "";
            charSequence = n2 > 0 ? ((String)object).split(cYh.d("5C202E222361"))[1].trim() : "";
            Object object2 = ((String)object).split(cYh.d("5C"))[0];
            if (this.s.indexOf(cYh.d("2D")) >= 0 && ((String)object2).indexOf(cYh.d("082535342512331D0D")) < 0 && ((String)object2).indexOf(cYh.d("0E3E2F342512331D0D")) < 0 && this.I != null) {
                object = this.s.indexOf(cYh.d("2D32")) >= 0 ? cYh.d("5D342E322237023E357F353503296F383934022209051A16") : cYh.d("5D342E322237023E357F333504252C34392E223C243C3234137E2E24233F1518151C1B");
                hashMap = ((String)((Object)hashMap)).matches(cYh.d("497A0B336806037B6F7B")) ? ((String)((Object)hashMap)).replaceAll(cYh.d("497A0B3368723B346A787970"), cYh.d("4361")) : "";
                StringBuilder charSequence2 = new StringBuilder();
                charSequence2.append(this.I.getAddress(true));
                charSequence2.append(cYh.d("10352321362814356E"));
                charSequence2.append((String)object2);
                charSequence2.append(cYh.d("5B6C24273636"));
                charSequence2.append((String)((Object)hashMap));
                charSequence2.append((String)object);
                hashMap = charSequence2.toString();
                SpiderApi spiderApi = this.I;
                object = hashMap;
                if (spiderApi != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(cYh.d("81FDE2B4CBF283EDFEB6C3F283EBE2B6C7DC4A7D7F71"));
                    ((StringBuilder)object).append((String)((Object)hashMap));
                    spiderApi.log(((StringBuilder)object).toString());
                    object = hashMap;
                }
            } else {
                object = object2;
            }
            hashMap = this.r;
            hashMap = !cYh.d("81C0DDB6E3F8").equals(hashMap) ? this.r((String)object2) : this.I((String)object2);
            if (((String)charSequence).length() > 2) {
                object2 = new LinkedHashMap();
                for (String string2 : ((String)charSequence).split(cYh.d("3B76"))) {
                    String string3 = cYh.d("5A");
                    if (string2.endsWith(string3)) continue;
                    int n3 = string2.indexOf(string3);
                    ((AbstractMap)object2).put(string2.substring(0, n3), string2.substring(n3 + 1));
                }
                if (!((String)charSequence).isEmpty()) {
                    com.github.catvod.spider.merge.k.g.e(com.github.catvod.spider.merge.k.g.b(), (String)object, (Map<String, String>)object2, (Map<String, String>)hashMap, xBPQ$3);
                } else {
                    com.github.catvod.spider.merge.k.g.e(com.github.catvod.spider.merge.k.g.b(), (String)object, null, (Map<String, String>)hashMap, xBPQ$3);
                }
            } else {
                com.github.catvod.spider.merge.k.g.c(com.github.catvod.spider.merge.k.g.b(), (String)object, hashMap, xBPQ$3);
            }
            try {
                hashMap = (HashMap<String, String>)((Response)xBPQ$3.getResult()).body().bytes();
                object = this.s.indexOf(cYh.d("00")) >= 0 ? cYh.d("20120A") : this.E(cYh.d("80ECD7B6F7DB"), cYh.d("80EDD0B8F6EF80ECD7B6F7DB81F0FDB4EBD5"), cYh.d("243F2538393D38362E233A3B13"), cYh.d("3204077C6F"));
                charSequence = string;
                if (hashMap == null) break block13;
            }
            catch (IOException iOException) {
                if (this.m) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(this.G);
                    ((StringBuilder)charSequence).append(cYh.d("8FE0C2B9F8CF4A6E25341234243F2534B2DDDDB9D5C8B8E6FD"));
                    ((StringBuilder)charSequence).append(((Object)iOException).toString());
                    Init.show(((StringBuilder)charSequence).toString());
                }
                if ((charSequence = this.I) != null) {
                    hashMap = com.github.catvod.spider.merge.d.d.b(cYh.d("0335043F143503356978BECEFEB8EEFE7A7759"));
                    ((StringBuilder)((Object)hashMap)).append(((Object)iOException).toString());
                    charSequence.log(((StringBuilder)((Object)hashMap)).toString());
                }
                return "";
            }
            charSequence = new String((byte[])hashMap, (String)object);
        }
        return charSequence;
    }

    /*
     * Unable to fully structure code
     */
    private String l() {
        block152: {
            block131: {
                block150: {
                    block151: {
                        block142: {
                            block153: {
                                block139: {
                                    block138: {
                                        block141: {
                                            block140: {
                                                block137: {
                                                    block136: {
                                                        block132: {
                                                            var3_1 = cYh.d("3B23");
                                                            if (this.c.length() >= 3) break block152;
                                                            var11_2 = cYh.d("48102923323C");
                                                            var9_3 = cYh.d("80CBF5B7C5F7");
                                                            var24_4 = cYh.d("3B0B");
                                                            var23_5 = cYh.d("3C");
                                                            var7_6 = cYh.d("83E8CCB9F1DB");
                                                            var20_7 = cYh.d("82D8C7B6E6E183EACDB7FBFB81D8EBB4D8CC");
                                                            var21_8 = cYh.d("043135341A3B0925203D");
                                                            var8_9 = cYh.d("48");
                                                            var10_10 = cYh.d("0F243521");
                                                            var12_11 = cYh.d("82D8C7B6E6E181C5F1B6ECDE");
                                                            var17_12 = cYh.d("43");
                                                            var22_13 = cYh.d("3B7E");
                                                            var16_14 = cYh.d("82D8C7B6E6E1");
                                                            var4_15 = this.B(var16_14);
                                                            var15_19 = cYh.d("80C4F4B4EAEB436162B9E8C480EBECB4DEFD436262B6ECE68FD9FB75647982DAE9B7EBF14364");
                                                            var5_20 = this.B(cYh.d("83E8FAB8F6EF12222D"));
                                                            var6_21 = this.g;
                                                            if (var6_21 == null) ** GOTO lbl24
                                                            var5_20 = var5_20.replace((CharSequence)var6_21, this.f);
lbl24:
                                                            // 2 sources

                                                            if (var4_15.indexOf(var17_12) >= 0) break block131;
                                                            var1_22 = this.B((String)var12_11).indexOf(cYh.d("4176"));
                                                            var18_23 = cYh.d("82D8C7B6E6E12E14");
                                                            var14_24 = cYh.d("82D8C7B6E6E181F0C6B8F5C2");
                                                            var19_25 = cYh.d("44");
                                                            var13_26 = cYh.d("487F");
                                                            if (var1_22 >= 0) {
                                                                block134: {
                                                                    block133: {
                                                                        var6_21 = var3_1;
                                                                        if (this.B((String)var12_11).startsWith((String)var13_26)) break block132;
                                                                        var6_21 = var3_1;
                                                                        var5_20 = this.j((String)var5_20);
                                                                        var6_21 = var3_1;
                                                                        if (this.B((String)var20_7).isEmpty()) break block133;
                                                                        var6_21 = var3_1;
                                                                        var4_15 = this.Y((String)var5_20, this.B((String)var20_7), "").get(0);
                                                                        break block134;
                                                                    }
                                                                    var4_15 = var5_20;
                                                                }
                                                                var6_21 = var3_1;
                                                                if (!var4_15.isEmpty()) {
                                                                    var5_20 = var4_15;
                                                                }
                                                                var6_21 = var3_1;
                                                                var4_15 = this.Y((String)var5_20, this.B((String)var12_11), "");
                                                                var6_21 = var3_1;
                                                                var6_21 = var3_1;
                                                                var5_20 = new StringBuilder();
                                                                var1_22 = 0;
                                                                while (true) {
                                                                    block135: {
                                                                        var6_21 = var3_1;
                                                                        if (var1_22 >= var4_15.size()) break;
                                                                        var6_21 = var3_1;
                                                                        if (((String)var4_15.get(var1_22)).equals(var7_6)) break block135;
                                                                        var6_21 = var3_1;
                                                                        var6_21 = var3_1;
                                                                        var8_9 = new StringBuilder();
                                                                        var6_21 = var3_1;
                                                                        var8_9.append((String)var4_15.get(var1_22));
                                                                        var6_21 = var3_1;
                                                                        var8_9.append(cYh.d("5B7F206F"));
                                                                        var6_21 = var3_1;
                                                                        var8_9 = this.Y(var8_9.toString(), this.B((String)var14_24), cYh.d("5976676D783B59")).get(0).replaceAll(cYh.d("3B76626E0C3B4A2A007C0D6A4A691C2A667656603C6A"), "").replaceAll(cYh.d("5B0B1F6F0A7059"), "").replaceAll(cYh.d("3C6E7D0C"), "").trim();
                                                                        var6_21 = var3_1;
                                                                        var9_3 = this.Y((String)var4_15.get(var1_22), this.B(var18_23), cYh.d("0F2224376A78417663")).get(0);
                                                                        var6_21 = var3_1;
                                                                        if (var8_9.equals(var7_6)) break block135;
                                                                        var6_21 = var3_1;
                                                                        if (var8_9.isEmpty()) break block135;
                                                                        var6_21 = var3_1;
                                                                        if (var9_3.isEmpty()) break block135;
                                                                        var6_21 = var3_1;
                                                                        var5_20.append((String)var8_9);
                                                                        var6_21 = var3_1;
                                                                        var5_20.append(var17_12);
                                                                        var6_21 = var3_1;
                                                                        var5_20.append(var9_3);
                                                                        var6_21 = var3_1;
                                                                        var5_20.append(var19_25);
                                                                    }
                                                                    ++var1_22;
                                                                }
                                                                var6_21 = var3_1;
                                                                var4_15 = var5_20.toString().substring(0, var5_20.toString().length() - 1);
                                                                break block131;
                                                            }
                                                        }
                                                        var6_21 = var3_1;
                                                        var6_21 = var3_1;
                                                        var20_7 = new StringBuilder();
                                                        var6_21 = var3_1;
                                                        if (this.B((String)var21_8).isEmpty()) break block136;
                                                        var6_21 = var3_1;
                                                        var7_6 = this.B.optJSONObject((String)var21_8);
                                                        if (var7_6 == null) break block136;
                                                        var6_21 = var3_1;
                                                        var5_20 = var7_6.keys();
                                                        while (true) {
                                                            var6_21 = var3_1;
                                                            if (!var5_20.hasNext()) break;
                                                            var6_21 = var3_1;
                                                            var4_15 = (String)var5_20.next();
                                                            var6_21 = var3_1;
                                                            var20_7.append(var4_15.trim());
                                                            var6_21 = var3_1;
                                                            var20_7.append(var17_12);
                                                            var6_21 = var3_1;
                                                            var20_7.append(var7_6.getString((String)var4_15).trim());
                                                            var6_21 = var3_1;
                                                            var20_7.append(var19_25);
                                                            continue;
                                                            break;
                                                        }
                                                        var6_21 = var3_1;
                                                        var4_15 = var20_7.toString().substring(0, var20_7.toString().length() - 1);
                                                        break block131;
                                                    }
                                                    var6_21 = var3_1;
                                                    var21_8 = this.g0((String)var5_20);
                                                    var5_20 = var4_15;
                                                    var6_21 = var3_1;
                                                    if (var4_15.length() >= 1) break block137;
                                                    var5_20 = var4_15;
                                                    var6_21 = var3_1;
                                                    if (!this.B((String)var12_11).startsWith((String)var13_26)) break block137;
                                                    var6_21 = var3_1;
                                                    var5_20 = this.B((String)var12_11);
                                                }
                                                var6_21 = var3_1;
                                                var7_6 = cYh.d("123C");
                                                var6_21 = var3_1;
                                                var12_11 = cYh.d("06");
                                                var6_21 = var3_1;
                                                if (var5_20.length() < 1) {
                                                    var4_15 = "";
                                                    var5_20 = var12_11;
                                                    break block138;
                                                }
                                                var6_21 = var3_1;
                                                if (var5_20.startsWith((String)var13_26)) break block139;
                                                var6_21 = var3_1;
                                                if (var5_20.indexOf((String)var22_13) < 0) break block139;
                                                var6_21 = var3_1;
                                                if (var5_20.split((String)var22_13)[0].indexOf(var23_5) < 0) break block140;
                                                var6_21 = var3_1;
                                                var7_6 = var5_20.split((String)var22_13)[0].split(var24_4)[0];
                                                var6_21 = var3_1;
                                                var6_21 = var3_1;
                                                var4_15 = new StringBuilder();
                                                var6_21 = var3_1;
                                                var4_15.append(var23_5);
                                                var6_21 = var3_1;
                                                var4_15.append(var5_20.split((String)var22_13)[0].split(var24_4)[1]);
                                                var6_21 = var3_1;
                                                var4_15 = var4_15.toString();
                                                break block141;
                                            }
                                            var6_21 = var3_1;
                                            var7_6 = var5_20.split((String)var22_13)[0];
                                            var4_15 = "";
                                        }
                                        var6_21 = var3_1;
                                        var5_20 = var5_20.split((String)var22_13)[1];
                                    }
                                    var6_21 = cYh.d("8FC0DCB9D9D3");
                                    var12_11 = var5_20;
                                    var5_20 = var6_21;
                                    break block153;
                                }
                                var4_15 = "";
                            }
                            var6_21 = var3_1;
                            if (var5_20.startsWith((String)var13_26)) {
                                var4_15 = var5_20;
                                break block142;
                            }
                            var6_21 = var3_1;
                            var6_21 = var3_1;
                            var22_13 = new StringBuilder();
                            var6_21 = var3_1;
                            var22_13.append((String)var13_26);
                            var6_21 = var3_1;
                            var22_13.append((String)var7_6);
                            var6_21 = var3_1;
                            var22_13.append(cYh.d("3C78223E392E06392F227F754824242923724E7C66"));
                            var6_21 = var3_1;
                            var22_13.append((String)var5_20);
                            var6_21 = var3_1;
                            var22_13.append(cYh.d("4079613E257A043F2F2536330923697E782E022835797E7640B8FECFB0E1CAB5C8F67073473F337134350924203839294F7F6E112333133C247D70B3E7F3A6EBDBBFEDD7667877351570223E392E06392F227F754824242923724E7C66B6C3EF8FF7C7B4DEFD4079613E257A043F2F2536330923697E781A1339353D327640B9DAEABFFCF1B5CBD67073473F337134350924203839294F7F6E2532221378687D70BFEEF7A8CAD17D4E702E237739083E35303E3414786E7E172E0E242D347B7D82DAC6B8CCDC4079613E257A043F2F2536330923697E782E022835797E7640B7D5E4B2E7D6776871382847332E3F233B0E3E32797875272428253B3F4B77A8CAECBFDAE1667877351570223E392E06392F227F754824242923724E7C66B7C0FA80F0C0767E7A0822613238341331283F2472487F01253E2E0B356D76B1CDC7B7E1D07073473F337134350924203839294F7F6E2532221378687D70BDE3F1A6F3EB7D4E702E237739083E35303E3414786E7E172E0E242D347B7D80D4E0B6F5E64079613E257A043F2F2536330923697E782E022835797E7640B5DAECB3E0C0776871382847332E3F233B0E3E32797875272428253B3F4B77A4CDDCBDF3F2667877351570223E392E06392F227F754824242923724E7C66B5EDC081E4F3767E7A0822613238341331283F2472487F01253E2E0B356D76B3E0FDB6F5E37073473F337134350924203839294F7F6E2532221378687D70BEDDCEA7E5E57D4E702E237739083E35303E3414786E7E172E0E242D347B7D83EADFB7E3E840796871363403702F3E2372043F2F2536330923697E781A033135307A3515392638393B0B7C667E7073473F337134350924203839294F7F6E11333B13316C2225394B776E767E7A0822613238341331283F2472487F012225394B776E767E7A0822613238341331283F2472487F013336390C37333E2234037C667E70734E0D"));
                            var6_21 = var3_1;
                            var22_13.append((String)var4_15);
                            var6_21 = var3_1;
                            var22_13.append((String)var13_26);
                            var6_21 = var3_1;
                            var22_13.append((String)var12_11);
                            var6_21 = var3_1;
                            var22_13.append(cYh.d("3C3E2E257F39083E35303E3414786E7E233F1F2469787B7D8EF1F4767E7A0822613238341331283F2472487F35342F2E4F796D76BFF4C8776871382847332E3F233B0E3E32797875133539257F734B77A7C7E77D4E702E237739083E35303E3414786E7E233F1F2469787B7D8FEFFCB4DEFD4079613E257A043F2F2536330923697E782E022835797E7640B7C2FCB1CAFB776871382847332E3F233B0E3E32797875133539257F734B77A7F7CBBFEAC5667877351570223E392E06392F227F754824242923724E7C66B5EBC082C1D9767E7A0822613238341331283F2472487F35342F2E4F796D76B1D4F5B8E0DD7073473F337134350924203839294F7F6E2532221378687D70BDF2C9A9F9D77D4E702E237739083E35303E3414786E7E233F1F2469787B7D80F7C0B5EDE04079613E257A043F2F2536330923697E782E022835797E7640B5FCE0BEC3C5776871382847332E3F233B0E3E32797875133539257F734B77A6ECC67D4E702E237739083E35303E3414786E7E233F1F2469787B7D82EDF0B9F0DC4079613E257A043F2F2536330923697E782E022835797E7640B8C0C5B0E9DC776871382847332E3F233B0E3E32797875133539257F734B77A5E9C4B3C5C8667877351570223E392E06392F227F754824242923724E7C66B7CFD481C8DE767E7A0822613238341331283F2472487F35342F2E4F796D76BFFDF5B8C8E37073473F337134350924203839294F7F6E2532221378687D70BFFCEE667877351570223E392E06392F227F754824242923724E7C66B9DDD880CBEF767E7A0822613238341331283F2472487F35342F2E4F796D76BEC5CEB5E9E07073473F337134350924203839294F7F6E2532221378687D70BCDBC4A4C0CF7D4E702E237739083E35303E3414786E7E233F1F2469787B7D81C6C6B6FCFA4079613E257A043F2F2536330923697E782E022835797E7640B5C4E7B3E1F1776871382847332E3F233B0E3E32797875133539257F734B77A8CEE4BEDEC0667877351570223E392E06392F227F754824242923724E7C66B7D9F28FDDD1767E7A0822613238341331283F2472487F35342F2E4F796D76160A37776871382847332E3F233B0E3E32797875133539257F734B77A5E9DCB2DAED66787E07"));
                            var6_21 = var3_1;
                            var4_15 = var22_13.toString();
                        }
                        var6_21 = var3_1;
                        var13_26 = var21_8.a((String)var4_15);
                        var1_22 = 0;
                        var4_15 = var11_2;
                        var11_2 = var8_9;
                        var12_11 = var14_24;
                        while (true) {
                            block145: {
                                block143: {
                                    block149: {
                                        block148: {
                                            block147: {
                                                block154: {
                                                    block146: {
                                                        block144: {
                                                            var6_21 = var3_1;
                                                            var8_9 = (LinkedList)var13_26;
                                                            var6_21 = var3_1;
                                                            if (var1_22 >= var8_9.size()) break;
                                                            var6_21 = var3_1;
                                                            var7_6 = ((com.github.catvod.spider.merge.f0.b)var8_9.get(var1_22)).c(this.D((String)var12_11, cYh.d("04313534193B0A35"), cYh.d("487F35342F2E4F79"))).a();
                                                            var14_24 = var6_21 = var7_6.replaceAll((String)var3_1, "").trim();
                                                            if (var6_21.length() < 2) {
                                                                var14_24 = ((com.github.catvod.spider.merge.f0.b)var8_9.get(var1_22)).c(cYh.d("48103538233602")).a().trim();
                                                            }
                                                            if (var14_24.length() > 9 || var14_24.length() < 2 || var20_7.toString().indexOf((String)var14_24) >= 0) break block143;
                                                            if ((var14_24.indexOf(var9_3) < 0 || var5_20.indexOf(var9_3) >= 0) && (this.s.indexOf(cYh.d("46")) < 0 || var14_24.indexOf(cYh.d("80C0C7")) < 0 && var14_24.indexOf(cYh.d("80F6CE")) < 0 && var14_24.indexOf(cYh.d("80EECFB4F2E9")) < 0)) break block144;
                                                            var7_6 = var4_15;
                                                            break block145;
                                                        }
                                                        var6_21 = var7_6 = this.E(var18_23, cYh.d("82D8C7B6E6E18EC3FFB7D9FF"), cYh.d("043135341E3E"), (String)var4_15);
                                                        if (!var7_6.startsWith(var10_10)) break block146;
                                                        var6_21 = var4_15;
                                                    }
                                                    var7_6 = ((com.github.catvod.spider.merge.f0.b)var8_9.get(var1_22)).c((String)var6_21).a().trim();
                                                    var2_27 = var7_6.indexOf(cYh.d("143520233432"));
                                                    var6_21 = var4_15;
                                                    var8_9 = cYh.d("14");
                                                    var4_15 = cYh.d("1460");
                                                    if (var2_27 < 0) break block154;
                                                    if (var20_7.toString().indexOf(cYh.d("82D9E6")) < 0 && var20_7.toString().indexOf(cYh.d("82DAC6")) < 0) ** GOTO lbl329
                                                    var7_6 = var6_21;
                                                    if (this.s.indexOf((String)var4_15) >= 0) break block145;
                                                    var7_6 = var6_21;
                                                    if (this.s.indexOf((String)var8_9) < 0) break block145;
lbl329:
                                                    // 2 sources

                                                    var20_7.append((String)var14_24);
                                                    var20_7.append(var17_12);
                                                    var20_7.append((String)var14_24);
                                                    var20_7.append(var19_25);
                                                    var7_6 = var6_21;
                                                    break block145;
                                                }
                                                if (this.s.indexOf((String)var4_15) < 0 && this.s.indexOf((String)var8_9) >= 0) {
                                                    var7_6 = var6_21;
                                                    break block145;
                                                }
                                                var4_15 = var7_6;
                                                if (var7_6.startsWith(var10_10)) {
                                                    var4_15 = var7_6.replace(this.f, "");
                                                }
                                                var7_6 = var6_21;
                                                if (var4_15.length() < 2) break block145;
                                                var7_6 = var6_21;
                                                if (var4_15.indexOf(var11_2) < 0) break block145;
                                                var7_6 = var6_21;
                                                if (var4_15.indexOf(cYh.d("033535303E36")) >= 0) break block145;
                                                var7_6 = var6_21;
                                                if (var4_15.indexOf(cYh.d("233535303E36")) >= 0) break block145;
                                                var7_6 = var6_21;
                                                if (var4_15.indexOf(cYh.d("14382E26")) >= 0) break block145;
                                                if (var4_15.indexOf(cYh.d("173C2028")) < 0) break block147;
                                                var7_6 = var6_21;
                                                break block145;
                                            }
                                            var7_6 = var4_15.matches(cYh.d("487E6B6E0C77382E6E0C0B3E4C0B6C0E29753A0B70610A744D")) != false ? var4_15.replaceAll(cYh.d("487E6B6E0C754A0F3F7E0A723B346A780C014A0F3F7E0A073C61710C7970"), cYh.d("4361")) : var4_15;
                                            if (var7_6 == null) break block148;
                                            var8_9 = var7_6;
                                            if (var7_6.matches(cYh.d("3B346A"))) break block149;
                                        }
                                        var7_6 = var4_15;
                                        if (var4_15.matches(cYh.d("497A28350C77382E6E6C0A744D"))) {
                                            var7_6 = new StringBuilder();
                                            var7_6.append(var11_2);
                                            var7_6.append(var4_15.split(cYh.d("0E341A7C0824486D1C"))[1]);
                                            var7_6 = var7_6.toString();
                                        }
                                        var8_9 = var7_6;
                                        if (var7_6.endsWith(cYh.d("4938353C3B"))) {
                                            var8_9 = var7_6.substring(0, var7_6.length() - 5);
                                        }
                                        var4_15 = var8_9;
                                        if (var8_9.endsWith(cYh.d("2C"))) {
                                            var4_15 = var8_9.substring(0, var8_9.length() - 1);
                                        }
                                        var7_6 = var4_15;
                                        if (var4_15.endsWith(cYh.d("48616E38393E0228"))) {
                                            var7_6 = var4_15.substring(0, var4_15.length() - 6);
                                        }
                                        var4_15 = var7_6;
                                        if (var7_6.endsWith(cYh.d("48392F353222"))) {
                                            var4_15 = var7_6.substring(0, var7_6.length() - 6);
                                        }
                                        var7_6 = var4_15;
                                        if (var4_15.endsWith(cYh.d("4A61"))) {
                                            var7_6 = var4_15.substring(0, var4_15.length() - 2);
                                        }
                                        var4_15 = var7_6;
                                        if (var7_6.endsWith(cYh.d("1961"))) {
                                            var4_15 = var7_6.substring(0, var7_6.length() - 2);
                                        }
                                        var7_6 = var4_15;
                                        if (!var4_15.startsWith(var10_10)) {
                                            var7_6 = var4_15.substring(var4_15.lastIndexOf(var11_2) + 1, var4_15.length());
                                        }
                                        var4_15 = var7_6 = var7_6.replace(cYh.d("0E3E25342F"), "").replace(cYh.d("4A7D6C7C7A774A7D6C7C7A"), "");
                                        if (var7_6.startsWith(cYh.d("0A7D"))) {
                                            var4_15 = var7_6.substring(2, var7_6.length());
                                        }
                                        var7_6 = var6_21;
                                        if (var4_15.length() < 1) break block145;
                                        var7_6 = var6_21;
                                        if (var4_15.length() > 21) break block145;
                                        var7_6 = var6_21;
                                        if (var4_15.startsWith(var10_10)) break block145;
                                        var8_9 = var4_15;
                                        if (var20_7.toString().indexOf((String)var4_15) < 0) break block149;
                                        var7_6 = var6_21;
                                        break block145;
                                    }
                                    var20_7.append((String)var14_24);
                                    var20_7.append(var17_12);
                                    var20_7.append((String)var8_9);
                                    var20_7.append(var19_25);
                                    var7_6 = var6_21;
                                    break block145;
                                }
                                var7_6 = var4_15;
                            }
                            ++var1_22;
                            var4_15 = var7_6;
                        }
                        var5_20 = var3_1;
                        try {
                            if (var20_7.toString().length() < 6) break block150;
                            var4_15 = var20_7.toString().substring(0, var20_7.toString().length() - 1);
                            var3_1 = var5_20;
                            break block131;
                        }
                        catch (Exception var4_16) {
                            break block151;
                        }
                        catch (Exception var4_17) {
                            var3_1 = var6_21;
                        }
                        break block151;
                        catch (Exception var4_18) {
                            // empty catch block
                        }
                    }
                    if (this.m) {
                        var5_20 = new StringBuilder();
                        var5_20.append(this.G);
                        var5_20.append(cYh.d("8FE0C2B9F8CF4A6E2223323B13350230233F82D7FBB8C3C388ECDB"));
                        var5_20.append(var4_15.toString());
                        Init.show(var5_20.toString());
                    }
                    var6_21 = this.I;
                    var5_20 = var3_1;
                    if (var6_21 != null) {
                        com.github.catvod.spider.merge.i.b.a((Exception)var4_15, com.github.catvod.spider.merge.d.d.b(cYh.d("04222430233F243135347F738EC4D8B9F8F54A7D7F")), (SpiderApi)var6_21);
                        var5_20 = var3_1;
                    }
                }
                var4_15 = var15_19;
                var3_1 = var5_20;
            }
            this.c = var4_15.replace(cYh.d("8ECBFAB4EAEB"), cYh.d("80C4F4B4EAEB")).replace(cYh.d("8ED0E2B6EDD682DAC6"), cYh.d("8FEFDFB6ECF782D9E6")).replace(cYh.d("8ECBFAB9F1CC82DAC6"), cYh.d("80C4F4B9F0DC82D9E6")).replace(cYh.d("82DAC6B8CCDC"), cYh.d("82D9E6B8CCDC")).replace(cYh.d("82DBD4B7EBF1"), cYh.d("82DAE9B7EBF1")).replace(cYh.d("80E6DDB9C0C7"), cYh.d("80EBFDB9DEE0")).replaceAll((String)var3_1, "");
            if (this.I != null && this.B(var16_14).length() < 1) {
                var4_15 = this.I;
                var3_1 = com.github.catvod.spider.merge.d.d.b(cYh.d("8FD7EBB4DDF28FDEF6B4D8CC82D8C7B6E6E14A7D7F71"));
                var3_1.append(this.c);
                var4_15.log(var3_1.toString());
            }
        }
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object[] loadPic(Map<String, String> object) {
        try {
            Object object2 = (String)object.get(cYh.d("14393534"));
            String string = (String)object.get(cYh.d("173922"));
            if (L == null) {
                object = new HashMap();
                L = object;
                ((HashMap)object).put(cYh.d("322324237A1B00352F25"), cYh.d("2A3F3B383B36067F747F677A4F07283F33351023611F037A56606F616C7A30392F676361472877657E7A2620313D320D02320A3823755263767F646C47780A1903172B7C613D3E31027006343431087961123F28083D247E6E6E49606F65616A517E74657709063620233E755263767F646C"));
                L.put(cYh.d("15352734253F15"), (String)object2);
            }
            XBPQ$7 xBPQ$7 = new XBPQ$7();
            com.github.catvod.spider.merge.k.g.c(com.github.catvod.spider.merge.k.g.b(), string, L, xBPQ$7);
            if (((Response)xBPQ$7.getResult()).code() != 200) return null;
            object = object2 = ((Response)xBPQ$7.getResult()).headers().get(cYh.d("243F2F253234137D1528273F"));
            if (object2 == null) {
                object = cYh.d("0620313D3E390624283E3975083335342377142433343637");
            }
            System.out.println(string);
            System.out.println((String)object);
            object2 = ((Response)xBPQ$7.getResult()).body().byteStream();
            return new Object[]{200, object, object2};
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject m(String var1_1, String var2_3) {
        var7_4 = cYh.d("80F9FB");
        try {
            block25: {
                block24: {
                    if (var2_3.equals(cYh.d("173F3225"))) break block24;
                    var5_5 = var2_3;
                    if (!var2_3.equals(cYh.d("80F9FB722735142462B6FEE0"))) break block25;
                }
                var2_3 = new StringBuilder();
                var2_3.append(cYh.d("80F9FB72"));
                var2_3.append(this.f);
                var2_3.append(cYh.d("48392F35322249202921783B0D31397E213F1539272808390F35223A682E1E20246C24320827672732280E36386C2C390834242C6C2A0823356A74BDCEEA"));
                var5_5 = var2_3.toString();
            }
            var6_6 = var5_5.split(cYh.d("44"));
            var3_7 = var5_5.length();
        }
        catch (Exception var1_2) {
            var2_3 = this.I;
            if (var2_3 != null) {
                com.github.catvod.spider.merge.i.b.a(var1_2, com.github.catvod.spider.merge.d.d.b(cYh.d("00353512383E0205333D7F738EC4D8B9F8F54A7D7F")), (SpiderApi)var2_3);
            }
            return null;
        }
        var5_5 = cYh.d("48392F35322249202921783B0D31397E213F1539272808390F35223A682E1E20246C243F06222239712C022228372E67");
        var8_8 = cYh.d("48392F35322249202921783B0D31397E213F1539272808390F35223A682E1E20246C24320827672732280E36386C");
        var9_9 = cYh.d("48392F35322249202921782C022228372E750E3E25342F740F242C3D68");
        var11_10 = cYh.d("1E");
        var10_11 = cYh.d("81C0DDB6E3F8");
        if (var3_7 >= 1) ** GOTO lbl54
        {
            if (var10_11.equals(this.r)) {
                var2_3 = new StringBuilder();
                var2_3.append(this.f);
                var2_3.append((String)var5_5);
            } else {
                var2_3 = new StringBuilder();
                var2_3.append(this.f);
                var2_3.append(var8_8);
            }
            var5_5 = var2_3.toString();
            var2_3 = var1_1;
            var1_1 = var5_5;
            if (this.s.indexOf(var11_10) >= 0) {
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append(var9_9);
                var2_3 = var1_1.toString();
                var1_1 = var5_5;
            }
            ** GOTO lbl138
lbl54:
            // 1 sources

            if (this.s.indexOf(var11_10) >= 0) {
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append(var9_9);
                var1_1 = var1_1.toString();
            }
            var4_12 = var7_4.equals(var6_6[0]);
        }
        var11_10 = cYh.d("0F243521");
        var9_9 = cYh.d("48");
        if (!var4_12) ** GOTO lbl-1000
        var2_3 = var1_1;
        ** GOTO lbl87
lbl-1000:
        // 1 sources

        {
            if (!var6_6[0].startsWith(var11_10)) ** GOTO lbl-1000
        }
        var2_3 = var6_6[0];
        ** GOTO lbl87
lbl-1000:
        // 1 sources

        {
            if (!var6_6[0].startsWith(var9_9)) ** GOTO lbl79
            var2_3 = new StringBuilder();
            var2_3.append(this.f);
        }
        var1_1 = var6_6[0];
lbl-1000:
        // 2 sources

        {
            while (true) {
                var2_3.append((String)var1_1);
                ** GOTO lbl-1000
                break;
            }
lbl79:
            // 1 sources

            var2_3 = new StringBuilder();
            var2_3.append(this.f);
            var2_3.append(var9_9);
        }
        var1_1 = var6_6[0];
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var2_3 = var2_3.toString();
lbl87:
            // 3 sources

            if (!var10_11.equals(this.r)) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append((String)var5_5);
            var1_1 = var1_1.toString();
            if (var7_4.equals(var6_6[2])) ** GOTO lbl138
            if (!var6_6[2].startsWith(var11_10)) ** GOTO lbl-1000
        }
        var1_1 = var6_6[2];
        ** GOTO lbl138
lbl-1000:
        // 1 sources

        {
            if (!var6_6[2].startsWith(var9_9)) ** GOTO lbl107
            var5_5 = new StringBuilder();
            var5_5.append(this.f);
        }
        var1_1 = var6_6[2];
lbl-1000:
        // 4 sources

        {
            while (true) {
                var5_5.append((String)var1_1);
                ** GOTO lbl-1000
                break;
            }
lbl107:
            // 1 sources

            var5_5 = new StringBuilder();
            var5_5.append(this.f);
            var5_5.append(var9_9);
        }
        var1_1 = var6_6[2];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append(var8_8);
            var1_1 = var1_1.toString();
            if (var7_4.equals(var6_6[1])) ** GOTO lbl138
            if (!var6_6[1].startsWith(var11_10)) ** GOTO lbl-1000
        }
        var1_1 = var6_6[1];
        ** GOTO lbl138
lbl-1000:
        // 1 sources

        {
            if (!var6_6[1].startsWith(var9_9)) ** GOTO lbl-1000
            var5_5 = new StringBuilder();
            var5_5.append(this.f);
        }
        var1_1 = var6_6[1];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var5_5 = new StringBuilder();
            var5_5.append(this.f);
            var5_5.append(var9_9);
        }
        var1_1 = var6_6[1];
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var1_1 = var5_5.toString();
lbl138:
            // 6 sources

            var5_5 = new JSONObject();
            var5_5.put(cYh.d("142433"), (Object)var2_3);
            var5_5.put(cYh.d("043F253402280B"), (Object)var1_1);
            return var5_5;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject o(String var1_1, String var2_2, String var3_4) {
        var6_5 = cYh.d("54");
        var7_6 = cYh.d("56");
        var9_7 = cYh.d("322324237A1B00352F25");
        try {
            var8_8 /* !! */  = new Request.Builder();
            var1_1 = var8_8 /* !! */ .url((String)var1_1).addHeader(var9_7, this.J("")).build();
            var1_1 = com.github.catvod.spider.merge.k.g.b().newCall((Request)var1_1).execute();
            var8_8 /* !! */  = var1_1.headers().get(cYh.d("3435357C1435083B2834"));
            var10_9 = var1_1.body().byteStream();
            var1_1 = new byte[1024];
            var11_10 = new ByteArrayOutputStream();
            while ((var4_11 = var10_9.read((byte[])var1_1)) != -1) {
                var11_10.write((byte[])var1_1, 0, var4_11);
            }
            var10_9 = Base64.encodeToString((byte[])var11_10.toByteArray(), (int)0).replaceAll(cYh.d("3B23"), "");
            if (var3_4.equals(var7_6)) {
                var1_1 = new StringBuilder();
                var1_1.append(cYh.d("1C722E322505132931347560567C63383A3D456A63"));
                var1_1.append((String)var10_9);
                var1_1.append(cYh.d("457C633336390C37333E2234033C2C367560451E2E3F32781A"));
                var1_1 = var1_1.toString();
            } else {
                var1_1 = "";
            }
            if (var3_4.equals(var6_5)) {
                var1_1 = new StringBuilder();
                var1_1.append(cYh.d("1C722E322505132931347560547C63383A3D456A63"));
                var1_1.append((String)var10_9);
                var1_1.append(cYh.d("452D"));
                var1_1 = var1_1.toString();
            }
            var10_9 = RequestBody.create((MediaType)MediaType.parse((String)cYh.d("0620313D3E390624283E39750D232E3F")), (String)var1_1);
            var1_1 = new Request.Builder();
            var1_1 = var1_1.url(var2_2).post((RequestBody)var10_9).addHeader(var9_7, this.J("")).build();
            var2_2 = com.github.catvod.spider.merge.k.g.b().newCall((Request)var1_1).execute();
            var1_1 = new JSONObject(var2_2.body().string());
            var2_2 = new JSONObject();
            var5_12 = var3_4.equals(var7_6);
        }
        catch (Exception var2_3) {
            var1_1 = this.I;
            if (var1_1 == null) return null;
            com.github.catvod.spider.merge.i.b.a(var2_3, com.github.catvod.spider.merge.d.d.b(cYh.d("00353515362E06236978BECEFEB8EEFE7A7759")), (SpiderApi)var1_1);
            return null;
        }
        var9_7 = cYh.d("153532243B2E");
        var7_6 = cYh.d("043F2534");
        var10_9 = cYh.d("043F2E3A3E3F");
        if (!var5_12) ** GOTO lbl58
        {
            var2_2.put((String)var10_9, (Object)var8_8 /* !! */ );
            var2_2.put(var7_6, (Object)var1_1.getString(var9_7));
            return var2_2;
lbl58:
            // 1 sources

            if (!var3_4.equals(var6_5)) return null;
            var2_2.put((String)var10_9, (Object)var8_8 /* !! */ );
            var2_2.put(var7_6, (Object)var1_1.getJSONObject(var9_7).getString(cYh.d("13313336322E")).replaceAll(cYh.d("3C0C1A0D0A07"), ""));
            return var2_2;
        }
    }

    private String p(String string, String string2) {
        if (string.indexOf(string2) < 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = cYh.d("44");
        stringBuilder.append(string3);
        stringBuilder.append(string);
        stringBuilder.append(string3);
        string = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("497A"));
        stringBuilder.append(string2);
        stringBuilder.append(cYh.d("3B74690A09793A7B7E7874744D"));
        return string.replaceAll(stringBuilder.toString(), cYh.d("4361"));
    }

    /*
     * Unable to fully structure code
     */
    private JSONObject q() {
        block53: {
            block52: {
                block51: {
                    block50: {
                        block49: {
                            block59: {
                                var22_1 = cYh.d("1C32382C");
                                var26_2 = cYh.d("1C2924302527");
                                var27_3 = cYh.d("1C3133343627");
                                var19_4 = cYh.d("1C332D3024291A");
                                var10_5 = cYh.d("80C4F4B9F0DC82D9E6");
                                var9_6 = cYh.d("44");
                                var4_7 = this.c;
                                var20_9 = new ArrayList();
                                var16_10 = var4_7.split((String)var9_6);
                                var1_11 = var16_10.length;
                                var12_12 = cYh.d("8FEFDFB6ECF782D9E6");
                                var14_13 = "";
                                var2_14 = 0;
                                var4_7 = var12_12;
                                var5_15 = "";
                                var8_17 = var7_16 = "";
                                while (true) {
                                    block46: {
                                        block48: {
                                            block47: {
                                                var6_19 = cYh.d("80C4F4B4EAEB");
                                                var21_23 = cYh.d("3B74");
                                                if (var2_14 >= var1_11) break;
                                                var15_22 = var16_10[var2_14];
                                                var20_9.add(var15_22.split(var21_23)[1]);
                                                var3_18 = var10_5.equals(var15_22.split(var21_23)[0]);
                                                var11_20 = cYh.d("82D9E6B8CCDC");
                                                var13_21 = cYh.d("80C4F4B9F0DC");
                                                if (var3_18) {
                                                    var6_19 = var15_22.split(var21_23)[1];
                                                    var4_7 = var10_5;
                                                    break block46;
                                                }
                                                if (!var13_21.equals(var15_22.split(var21_23)[0])) break block47;
                                                var6_19 = var15_22.split(var21_23)[1];
                                                var4_7 = var13_21;
lbl38:
                                                // 3 sources

                                                while (true) {
                                                    var11_20 = var4_7;
lbl40:
                                                    // 3 sources

                                                    while (true) {
                                                        var4_7 = var11_20;
                                                        break block46;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            if (!var11_20.equals(var15_22.split(var21_23)[0])) break block48;
                                            var6_19 = var15_22.split(var21_23)[1];
                                            var4_7 = var11_20;
                                            ** GOTO lbl38
                                        }
                                        if (var12_12.equals(var15_22.split(var21_23)[0])) {
                                            var6_19 = var15_22.split(var21_23)[1];
                                            ** continue;
                                        }
                                        if (var6_19.equals(var15_22.split(var21_23)[0])) {
                                            var5_15 = var15_22.split(var21_23)[1];
                                            var6_19 = var8_17;
                                            break block46;
                                        }
                                        var11_20 = var4_7;
                                        var6_19 = var8_17;
                                        if (!cYh.d("82DAE9B7EBF1").equals(var15_22.split(var21_23)[0])) ** GOTO lbl40
                                        var7_16 = var15_22.split(var21_23)[1];
                                        var11_20 = var4_7;
                                        var6_19 = var8_17;
                                        ** continue;
                                    }
                                    ++var2_14;
                                    var8_17 = var6_19;
                                }
                                var13_21 = var9_6;
                                var11_20 = this.D(cYh.d("80E1FAB4C9D1"), cYh.d("80FDDAB8D7D382FDD1B4DFDC80E1FAB4C7D780F7F1"), cYh.d("57"));
                                var23_24 = this.b;
                                var15_22 = this.D(cYh.d("82D9E6B7D4DF"), cYh.d("80FDDAB8D7D380E1FAB4C9D182C0CCB6F0EA"), "");
                                var1_11 = var23_24.indexOf(var19_4);
                                var18_25 = cYh.d("4A7D");
                                var24_26 = cYh.d("4A7D67");
                                var25_27 = cYh.d("41");
                                var10_5 = var6_19;
                                var28_28 = cYh.d("3B766A");
                                var29_29 = cYh.d("3CB6DAEEB1D7C5");
                                if (var1_11 < 0) break block59;
                                if (var15_22.isEmpty()) ** GOTO lbl89
                            }
                            var6_19 = var15_22;
                            if (var15_22.indexOf(var29_29) < 0) break block49;
lbl89:
                            // 2 sources

                            var9_6 = cYh.d("80C4F4B4EAEB4A7DA4C7CBBFEEF767B6DFEB81D3C477B2D0CFB4FCCD71BDC0C1A4E8EC7C82D9E6B7D4DF41B6C9C9B3E0EE76A9FCF1BFEBFA67B6DDF580EDEB77B2D0CFB7D5EA71BFC2D7A4E8EC7C81FDE7B5E9FA41B5C7C3BEC3CE76A7CFFDBCEFC867B7D6CA81D0D777B1D8CBB7D7C071B3FAC2A7C9F27C82DFE5B9F4DF41B5CFD7B2D5D576A9EEC7BFEDF867B4D3E580FBE477B3E6C1B7D1D72B268FEFDFB6ECF782D9E67C7ABFE8F4A9F2D27C80F5DFB9F8C741B6C9C9B3E0EE76A4D0E1BFE4DF67B6DFEB81D3C477B2CCFBB5C8F671BFC9E6A4EBFA7C80DAEEB6EAF041B6C3FDB0CCF676A7D0C7BCE7C667B7FAFC83EEE177B2D0CFB4FCCD71BFC2D7A4E8EC7C82D9E6B7D4DF41B4FDF7B0CAE176A4DFD1BFE8E23D2DB0E1DBB8C8EB7A778FD4F0B4D8F980F7C177B0C6F8B4FBEBB0FDE776A7D2D2BCE3CF67B7C0DF81E8F977BEC5D4B4F8C171B2EFCEA9E8DF7C80EECFB8F4C541B7FBFBB2F4F976A6C5C8BCD3EB3D2DB2D0CFB6FDFA7A7780F7D0B4EEE141B7C2FCBFFBE776A7C1C9BDCBC167B4D1C88EC9E877B1FAC6B5DAFC71BFEDF8A5ECCB7C8FEFD1B4DDF21B2CA6EBFDBFDAC5A6D8D0774AB7FBFBB2E7F276A4DFD1BFE8E267B5EBFA8FFEF177BEC5D4B4F8C171BCCADCA9D9C97C80CFECB6DEDD41B7E6C0B2E3DC");
                            var6_19 = var9_6;
                            if (!var12_12.equals(var4_7)) {
                                var6_19 = var9_6.replace((CharSequence)var12_12, (CharSequence)var4_7);
                            }
                            var9_6 = var6_19;
                            if (var15_22.indexOf(var29_29) < 0) break block50;
                            var6_19 = this.a0((String)var15_22, var6_19).replaceAll(var28_28, (String)var25_27).replace((CharSequence)var24_26, var18_25);
                        }
                        var9_6 = var6_19;
                    }
                    var6_19 = cYh.d("82CCF1B4DBE0");
                    var15_22 = this.D(var6_19, cYh.d("80FDDAB8D7D382CCF1B4DBE082C0CCB6F0EA"), "");
                    if (var23_24.indexOf(var27_3) >= 0 && var15_22.isEmpty()) ** GOTO lbl108
                    var6_19 = var15_22;
                    if (var15_22.indexOf(var29_29) < 0) break block51;
lbl108:
                    // 2 sources

                    var6_19 = var17_30 = cYh.d("80C4F4B4EAEB4A7DA4F5F0B3FED667B8F1C381E8EE77B2D5D7B6F8EF71BDD9DEA4CAEA7C81E3D4B4CCE741B8CAE0B2C1DA76A7C6F2BCFBFC67B8C8F382CBFC77B2E4D0B5DAEC71BCD4E0A4CAEA7C82DDF1B4EDFC41B4FED5B0E7F0B6D7FE71BCE3DFA4F5F0BFEFF967B9F2E580DFECB6DEC341B5CBF1B1D1D8B5E5F62B268FEFDFB6ECF782D9E67C7ABFC3F7A8C8D17C8EF6D8B7EFF541B5CEE1B1E3D976A6EFD9BFFCED67B7E4CF82CBFC77BFD1D6B5DAEC71BCF0F5A7CDFB7C8ECFE8B4CCE741B5FFE6B2C1DA76A7E2E7BFFCED67B4DAEA82EAE777B3E5E3B7FCC6B1CCC876A7D5D8BFC3F7A4D9FE7C8FF5FEB6D8F780D9D877B2D0C7B6CAEEB2FEC02C3DB6ECE68FD9FB7C7ABFC3F7A8C8D17C8EF6D8B7EFF541B5CEE1B1E3D976A7C6F2BCFBFC67B8C8F382CBFC77B0E4E9B5DAEC71B2ECE1A4CAEA261BB5CBF9B1E6CC7D6CB4F3FD8EC9C777B1CDC2B6DDFD71B3F8F9A4CAEA7C80EECFB4CCE741B8CAE0B2C1DA76A7E2C2BFFCED3D2DB0E0CDB5FCC4B0D3E07D6CB4F3FD8EC9C777BEFCFEB6F9FE71BFE8E0A7E8E97C80EECFB4CCE741B6F2C4B2C1DA76A9DAE6BFFCED67B7C0FF81CCED77BEC5CEB5DAEC71BFD9E7A4CAEA7C81E3F1B4CCE741B5CCE1B2E0C176A5EED3BDDAC7A7C7F87C81D4CEB4F3FD82D8E877BFFFD8B7CEFCB0D3FE76A4DBF7BCECEFA4F5F0");
                    if (!var12_12.equals(var4_7)) {
                        var6_19 = var17_30.replace((CharSequence)var12_12, (CharSequence)var4_7);
                    }
                    if (var15_22.indexOf(var29_29) < 0) {
                        var17_30 = var6_19;
                        break block52;
                    }
                    var6_19 = this.a0((String)var15_22, var6_19).replaceAll(var28_28, (String)var25_27).replace((CharSequence)var24_26, var18_25);
                }
                var17_30 = var6_19;
            }
            var4_7 = this.E(cYh.d("82E9F5B5ECE7"), cYh.d("81C7F7B8C2E5"), cYh.d("80FDDAB8D7D382E9F5B5ECE782C0CCB6F0EA"), "");
            var18_25 = var4_7;
            if (var23_24.indexOf(var26_2) < 0) ** GOTO lbl137
            var18_25 = var4_7;
            if (var4_7.isEmpty()) {
                var4_7 = new Date();
                var1_11 = var4_7.getYear() + 1900;
                var4_7 = new StringBuilder();
                var4_7.append(var1_11 - 15);
                var4_7.append(cYh.d("4A"));
                var4_7.append(var1_11);
                var18_25 = var4_7.toString();
            }
lbl137:
            // 4 sources

            var6_19 = this.D(cYh.d("81DED3B4EDD5"), cYh.d("80FDDAB8D7D381DED3B4EDD582C0CCB6F0EA"), "");
            var4_7 = var6_19;
            if (var23_24.indexOf(var22_1) < 0) break block53;
            var4_7 = var6_19;
            if (!var6_19.isEmpty()) break block53;
            var4_7 = cYh.d("81C7F7B8C0EE4324283C327983EAFBB7E7CE4338282524798FFFC5B4DFDC4323223E253F");
        }
        var12_12 = var4_7;
        try {
            var29_29 = new JSONObject();
            new JSONArray();
            var28_28 = this.E(cYh.d("80D9F8B7F9D082D8C7B6E6E1"), cYh.d("80D9F8B7F9D082D8C7B6E6E112222D"), cYh.d("80D9F8B7F9D082D8C7B6E6E18EC3FFB7D9FF"), "");
            var30_31 = var20_9.iterator();
            var1_11 = 0;
            var20_9 = var9_6;
            var6_19 = var11_20;
            var4_7 = var14_13;
            var9_6 = var12_12;
        }
        catch (Exception var4_8) {
            if (this.m) {
                var5_15 = new StringBuilder();
                var5_15.append(this.G);
                var5_15.append(cYh.d("8FE0C2B9F8CF4A6E2634231C0E3C3534251E062420B4D0E08EC4D8BEEBC0"));
                var5_15.append(var4_8.toString());
                Init.show(var5_15.toString());
            }
            if ((var5_15 = this.I) != null) {
                com.github.catvod.spider.merge.i.b.a(var4_8, com.github.catvod.spider.merge.d.d.b(cYh.d("003535173E3613353315362E067868B8C3C38FFFEE7C7A64")), (SpiderApi)var5_15);
            }
            return null;
        }
        while (true) {
            block58: {
                block57: {
                    block55: {
                        block56: {
                            block54: {
                                if (!var30_31.hasNext()) break;
                                var12_12 = (String)var30_31.next();
                                var24_26 = var16_10[var1_11].split(var21_23)[0];
                                if (var24_26.indexOf(cYh.d("82D9E6")) < 0 || var24_26.indexOf(cYh.d("80C5EBB4DEFD")) >= 0) break block54;
                                var15_22 = var12_12;
                                var14_13 = var8_17;
                                break block55;
                            }
                            if (var24_26.indexOf(cYh.d("80D9C6")) < 0 && var24_26.indexOf(var10_5) < 0 || var24_26.indexOf(cYh.d("80EAEBB4EACF80D9C6")) >= 0 || var24_26.indexOf(cYh.d("82DAE9B6C3E180D9C6")) >= 0) break block56;
                            var14_13 = var12_12;
                            var15_22 = var5_15;
                            break block55;
                        }
                        var11_20 = var24_26.indexOf(cYh.d("80C5EB")) < 0 && var24_26.indexOf(cYh.d("82DAE9B6C3E1")) < 0 && var24_26.indexOf(cYh.d("82C3D5B4C4F3")) < 0 ? var12_12 : var7_16;
                        var14_13 = var11_20;
                        var15_22 = var11_20;
                    }
                    if (var28_28.length() <= 0 || var28_28.indexOf(cYh.d("43")) < 0 || var28_28.indexOf((String)var24_26) < 0) break block57;
                    var11_20 = new StringBuilder();
                    var11_20.append(var28_28);
                    var11_20.append((String)var13_21);
                    var11_20 = var11_20.toString();
                    var23_24 = var13_21;
                    var13_21 = new StringBuilder();
                    var13_21.append(cYh.d("497A"));
                    var13_21.append((String)var24_26);
                    var13_21.append(cYh.d("497A7E0D7372497A7E7874744D"));
                    var25_27 = var11_20.replaceAll(var13_21.toString(), cYh.d("4361"));
                    var11_20 = var25_27.indexOf(var26_2) > 0 ? this.s(var1_11, (String)var12_12, var18_25) : var4_7;
                    var15_22 = var25_27.indexOf(var27_3) > 0 ? this.s(var1_11, (String)var15_22, var17_30) : var4_7;
                    var13_21 = var25_27.indexOf(var19_4) > 0 ? this.s(var1_11, (String)var14_13, (String)var20_9) : var4_7;
                    var24_26 = var15_22;
                    var14_13 = var25_27.indexOf(cYh.d("1C3320253213032D")) > 0 ? this.s(var1_11, (String)var12_12, var6_19) : var4_7;
                    var15_22 = var25_27.indexOf(var22_1) < 0 ? var4_7 : var9_6;
                    var25_27 = var6_19;
                    var25_27 = var13_21;
                    var13_21 = var23_24;
                    break block58;
                }
                var23_24 = var6_19;
                var11_20 = this.s(var1_11, (String)var12_12, var18_25);
                var24_26 = this.s(var1_11, (String)var15_22, var17_30);
                var25_27 = this.s(var1_11, (String)var14_13, (String)var20_9);
                var14_13 = this.s(var1_11, (String)var12_12, var23_24);
                var15_22 = var9_6;
            }
            var29_29.put((String)var12_12, (Object)this.g((String)var14_13, (String)var25_27, (String)var24_26, (String)var11_20, (String)var15_22));
            ++var1_11;
            continue;
            break;
        }
        return var29_29;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private String s(int var1_1, String var2_2, String var3_3) {
        block3: {
            block7: {
                block8: {
                    block2: {
                        block6: {
                            block5: {
                                block4: {
                                    var6_4 = cYh.d("44");
                                    var6_4 = com.github.catvod.spider.merge.b.n.b(com.github.catvod.spider.merge.d.d.b(var6_4), this.c, var6_4);
                                    var7_5 = new StringBuilder();
                                    var7_5.append(cYh.d("497A6279797058791D75"));
                                    var7_5.append((String)var2_2);
                                    var7_5.append(cYh.d("447E6B"));
                                    var12_6 = var6_4.replaceAll(var7_5.toString(), cYh.d("4361"));
                                    var11_7 = cYh.d("1B2C");
                                    var4_8 = var3_3.indexOf(var11_7);
                                    var9_9 = cYh.d("4A7D");
                                    if (var4_8 < 0 && var3_3.indexOf(var9_9) < 0) break block3;
                                    var4_8 = var3_3.indexOf(var9_9);
                                    var10_10 = cYh.d("3B2C1D2D");
                                    if (var4_8 >= 0) break block4;
                                    var2_2 = new StringBuilder((String)var2_2);
                                    var2_2.append(var9_9);
                                    var2_2.append(var3_3.split((String)var10_10)[var1_1]);
                                    var3_3 = var2_2.toString();
                                    break block3;
                                }
                                var4_8 = var3_3.indexOf(var11_7);
                                var8_11 = cYh.d("57");
                                if (var4_8 >= 0) break block5;
                                if (!var12_6.equals(var3_3.split(var9_9)[0])) break block6;
                                var7_5 = new StringBuilder((String)var2_2);
                                var7_5.append(var9_9);
                                var6_4 = var3_3.split(var9_9)[1];
                                ** GOTO lbl45
                            }
                            var7_5 = var3_3.split((String)var10_10);
                            var5_12 = ((String[])var7_5).length;
                            for (var4_8 = 0; var4_8 < var5_12; ++var4_8) {
                                var6_4 = var7_5[var4_8];
                                if (!var12_6.equals(var6_4.split(var9_9)[0])) continue;
                                var7_5 = new StringBuilder((String)var2_2);
                                var7_5.append(var9_9);
                                var6_4 = var6_4.split(var9_9)[1];
lbl45:
                                // 2 sources

                                var7_5.append(var6_4);
                                var6_4 = var7_5.toString();
                                break block2;
                            }
                        }
                        var6_4 = var8_11;
                    }
                    if (!var6_4.equals(var8_11)) break block7;
                    if (var3_3.indexOf(var11_7) >= 0) break block8;
                    var7_5 = var3_3.split(var9_9)[0];
                    var8_11 = com.github.catvod.spider.merge.d.d.b("");
                    var8_11.append(var1_1 + 1);
                    if (!var7_5.equals(var8_11.toString())) break block7;
                    var2_2 = new StringBuilder((String)var2_2);
                    var2_2.append(var9_9);
                    var3_3 = var3_3.split(var9_9)[1];
                    ** GOTO lbl75
                }
                for (Object var3_3 : var3_3.split((String)var10_10)) {
                    var8_11 = var3_3.split(var9_9)[0];
                    var10_10 = com.github.catvod.spider.merge.d.d.b("");
                    var10_10.append(var1_1 + 1);
                    if (!var8_11.equals(var10_10.toString())) continue;
                    var2_2 = new StringBuilder((String)var2_2);
                    var2_2.append(var9_9);
                    var3_3 = var3_3.split(var9_9)[1];
lbl75:
                    // 2 sources

                    var2_2.append((String)var3_3);
                    var3_3 = var2_2.toString();
                    break block3;
                }
            }
            var3_3 = var6_4;
        }
        return var3_3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private JSONArray t(String var1_1, String var2_3) {
        if (var2_3.length() < 1) {
            return new JSONArray(var1_1);
        }
        var7_4 = var2_3;
        if (var2_3.indexOf(cYh.d("4176")) >= 0) {
            var7_4 = cYh.d("03313530");
        }
        var9_5 = new JSONArray();
        var3_6 = var7_4.indexOf(cYh.d("3C"));
        var2_3 = "";
        var10_7 = cYh.d("4361");
        var8_8 /* !! */  = var7_4;
        if (var3_6 < 0) ** GOTO lbl17
        try {
            var2_3 = var7_4.replaceAll(cYh.d("497A1D0A7F744D6F680D0A744D"), var10_7);
            var8_8 /* !! */  = var7_4.replaceAll(cYh.d("3B0B6F7B"), "");
lbl17:
            // 2 sources

            var7_4 = var8_8 /* !! */ .split(cYh.d("3B7E"));
            var6_9 = 0;
            var3_6 = 0;
        }
        catch (JSONException var1_2) {
            if (this.m) {
                var2_3 = new StringBuilder();
                var2_3.append(this.G);
                var2_3.append(cYh.d("8FE0C2B9F8CF4A6E26342310143F2F1025280629A4D6EDB3F3C9AEEDCD"));
                var2_3.append(var1_2.toString());
                Init.show(var2_3.toString());
            }
            if ((var7_4 = this.I) != null) {
                var2_3 = com.github.catvod.spider.merge.d.d.b(cYh.d("0035351B24350911332336234F79A8C5CEB2C8FFAEEDD6774A6E"));
                var2_3.append(var1_2.toString());
                var7_4.log(var2_3.toString());
            }
            return null;
        }
        while (true) {
            block27: {
                block29: {
                    block31: {
                        block32: {
                            block30: {
                                block28: {
                                    if (var3_6 >= ((String[])var7_4).length) break;
                                    var8_8 /* !! */  = new JSONObject(var1_1);
                                    if (var3_6 != ((String[])var7_4).length - 1) break block27;
                                    if (!(var8_8 /* !! */ .get(var7_4[var3_6]) instanceof JSONObject)) break block28;
                                    var9_5.put((Object)var8_8 /* !! */ .getJSONObject(var7_4[var3_6]));
                                    return var9_5;
                                }
                                var7_4 = var8_8 /* !! */ .getJSONArray(var7_4[var3_6]);
                                var3_6 = var7_4.length();
                                if (var2_3 == null) break block29;
                                if (var2_3.length() <= 0) break block29;
                                var4_10 = var2_3.indexOf(cYh.d("4B"));
                                var8_8 /* !! */  = cYh.d("3B346A");
                                if (var4_10 < 0) {
                                    if (!var2_3.matches((String)var8_8 /* !! */ )) break block30;
                                    var4_10 = var3_6;
                                    if (var3_6 > Integer.parseInt((String)var2_3)) {
                                        var4_10 = Integer.parseInt((String)var2_3);
                                    }
                                    var3_6 = var4_10 - 1;
                                    var5_11 = var4_10;
                                    break block31;
                                }
                            }
                            var1_1 = var2_3.replaceAll(cYh.d("4F7E6B787B744D"), var10_7);
                            var2_3 = var2_3.replaceAll(cYh.d("497A6D7979704E"), var10_7);
                            var4_10 = var3_6;
                            if (var2_3 == null) break block32;
                            var4_10 = var3_6;
                            if (var2_3.length() <= 0) break block32;
                            var4_10 = var3_6;
                            if (!var2_3.matches((String)var8_8 /* !! */ )) break block32;
                            var4_10 = var3_6;
                            if (Integer.parseInt((String)var2_3) >= var3_6) break block32;
                            var4_10 = Integer.parseInt((String)var2_3);
                        }
                        var3_6 = var6_9;
                        var5_11 = var4_10;
                        if (var1_1 != null) {
                            var3_6 = var6_9;
                            var5_11 = var4_10;
                            if (var1_1.length() <= 0) break block31;
                            var3_6 = var6_9;
                            var5_11 = var4_10;
                            if (!var1_1.matches((String)var8_8 /* !! */ )) break block31;
                            var3_6 = var6_9;
                            var5_11 = var4_10;
                            if (Integer.parseInt(var1_1) > var4_10) break block31;
                            var3_6 = Integer.parseInt(var1_1) - 1;
                            var5_11 = var4_10;
                        }
                    }
                    while (var3_6 < var5_11) {
                        var9_5.put((Object)var7_4.getJSONObject(var3_6));
                        ++var3_6;
                    }
                    return var9_5;
                }
                return var7_4;
            }
            var1_1 = var8_8 /* !! */ .getJSONObject(var7_4[var3_6]).toString();
            ++var3_6;
            continue;
            break;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String u(String var1_1, String var2_2) {
        var3_3 = var2_2.indexOf(cYh.d("81CBFEB7DAF8"));
        var6_4 = "";
        var4_5 /* !! */  = var2_2;
        if (var3_3 >= 0) {
            var6_4 = var2_2.replaceAll(cYh.d("497A690D0CBEDCD57EB7CCE581DDE30A6DB5DBCA1C0A09063A0D6A6E0B074E7E6B"), cYh.d("4361"));
            var4_5 /* !! */  = var2_2.replaceAll(cYh.d("3B0BA5EAD26581CBFEB7DAF83C6AAEEDCD074F0B1F0D0A074C6F680D0A"), "");
        }
        if (var4_5 /* !! */ .indexOf(cYh.d("4C")) < 0) {
            var1_1 = this.v(var1_1, (String)var4_5 /* !! */ );
lbl9:
            // 2 sources

            return this.a0(var6_4, var1_1);
        }
        var7_6 = var4_5 /* !! */ .split(cYh.d("3B7B"));
        var2_2 = new StringBuilder();
        for (var3_3 = 0; var3_3 < var7_6.length; ++var3_3) {
            block11: {
                block10: {
                    if (var7_6[var3_3].startsWith(cYh.d("12222D6B"))) break block10;
                    var4_5 /* !! */  = this.v(var1_1, var7_6[var3_3]);
                    break block11;
                }
                var5_7 /* !! */  = var7_6[var3_3].substring(4);
                var4_5 /* !! */  = var5_7 /* !! */ ;
                if (var5_7 /* !! */ .indexOf(cYh.d("432334336D")) <= 0) ** GOTO lbl26
                var4_5 /* !! */  = var5_7 /* !! */ .split(cYh.d("3B74322435065D"));
                if (var4_5 /* !! */ .length > 1) {
                    var4_5 /* !! */  = this.v(this.j(var4_5 /* !! */ [0]), var4_5 /* !! */ [1]);
                } else {
                    var4_5 /* !! */  = var4_5 /* !! */ [0];
lbl26:
                    // 2 sources

                    var4_5 /* !! */  = this.j((String)var4_5 /* !! */ );
                }
            }
            var5_7 /* !! */  = var2_2;
            if (var4_5 /* !! */ .length() > 0) {
                var5_7 /* !! */  = var2_2;
                if (var4_5 /* !! */ .startsWith(cYh.d("0F243521"))) {
                    var5_7 /* !! */  = var2_2;
                    if (!var2_2.toString().trim().endsWith(cYh.d("5A"))) {
                        var5_7 /* !! */  = var2_2;
                        if (!var2_2.toString().trim().endsWith(cYh.d("8FF7E2B7C9CA"))) {
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String v(String object, String charSequence) {
        void var1_5;
        CharSequence charSequence2;
        Object object2;
        Object object3;
        String string;
        String string2;
        block19: {
            block18: {
                string2 = cYh.d("40");
                string = cYh.d("81C5F5B8F6EF");
                object3 = object;
                charSequence2 = object2;
                if (((String)object2).endsWith(string)) {
                    object2 = ((String)object2).replace(string, "");
                    object3 = object;
                    charSequence2 = object2;
                    if (this.x.length() > 0) {
                        object3 = this.x;
                        charSequence2 = object2;
                    }
                }
                if (((String)charSequence2).indexOf(string2) >= 0) {
                    return ((String)charSequence2).replace(string2, "");
                }
                if (((String)charSequence2).indexOf(cYh.d("4176")) >= 0) break block18;
                String string3 = charSequence2;
                if (((String)charSequence2).length() >= 1) break block19;
            }
            String string4 = cYh.d("03313530");
        }
        if (var1_5.indexOf(cYh.d("3A7E")) < 0) {
            return this.w((String)object3, (String)var1_5);
        }
        charSequence2 = cYh.d("4B");
        String[] stringArray = var1_5.split(cYh.d("3B0D1D7F"));
        int n2 = stringArray.length;
        string = cYh.d("3A");
        int n3 = 0;
        object2 = object3;
        if (n2 > 2) {
            n2 = 0;
            while (true) {
                object2 = object3;
                if (n2 >= stringArray.length - 2) break;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(stringArray[n2]);
                ((StringBuilder)object2).append(string);
                object3 = this.t((String)object3, ((StringBuilder)object2).toString()).getJSONObject(0).toString();
                ++n2;
                continue;
                break;
            }
        }
        try {
            string2 = stringArray[stringArray.length - 1];
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(stringArray[stringArray.length - 2]);
            ((StringBuilder)object3).append(string);
            string = ((StringBuilder)object3).toString();
            CharSequence charSequence3 = charSequence2;
            object3 = string2;
            if (string2.indexOf(cYh.d("4F")) >= 0) {
                String string5 = string2.replaceAll(cYh.d("497A1D797F744D6F680D7E744D"), cYh.d("4361"));
                object3 = string2.replaceAll(cYh.d("3B786F7B"), "");
            }
            object2 = this.t((String)object2, string);
            charSequence2 = new StringBuilder();
            if (object2 == null) return "";
            if (object2.length() <= 0) return "";
            for (n2 = n3; n2 < object2.length(); ++n2) {
                void var1_10;
                string2 = object2.getJSONObject(n2).toString();
                if (n2 == object2.length() - 1) {
                    String string6 = "";
                }
                ((StringBuilder)charSequence2).append(this.w(string2, (String)object3));
                ((StringBuilder)charSequence2).append((String)var1_10);
            }
        }
        catch (JSONException jSONException) {
            if (this.m) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(this.G);
                ((StringBuilder)object2).append(cYh.d("8FE0C2B9F8CF4A6E26342310143F2F102528062912252533093700322333083EA4D6EDB3F3C9AEEDCD"));
                ((StringBuilder)object2).append(((Object)((Object)jSONException)).toString());
                Init.show(((StringBuilder)object2).toString());
            }
            if ((object2 = this.I) == null) return "";
            object3 = com.github.catvod.spider.merge.d.d.b(cYh.d("0035351B243509113323362334243338393D2633353838344F79A8C5CEB2C8FFAEEDD6774A6E"));
            ((StringBuilder)object3).append(((Object)((Object)jSONException)).toString());
            object2.log(((StringBuilder)object3).toString());
            return "";
        }
        return ((StringBuilder)charSequence2).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String w(String string, String charSequence) {
        try {
            boolean bl;
            Object object;
            block15: {
                block14: {
                    if (((String)charSequence).indexOf(cYh.d("4176")) >= 0) break block14;
                    object = charSequence;
                    if (((String)charSequence).length() >= 1) break block15;
                }
                object = cYh.d("03313530");
            }
            boolean bl2 = ((String)object).endsWith(cYh.d("5C3A323E3961"));
            int n2 = 0;
            if (bl2) {
                object = ((String)object).substring(0, ((String)object).length() - 6);
                bl = true;
            } else {
                bl = false;
            }
            if (((String)object).indexOf(cYh.d("3C")) >= 0) return "";
            charSequence = ((String)object).split(cYh.d("3B7E"));
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
                        string = object.optString((String)charSequence[n2]).trim().replaceAll(cYh.d("3B0D"), "").replaceAll(cYh.d("3B0B"), "").replaceAll(cYh.d("45"), "");
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
            if (this.m) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.G);
                ((StringBuilder)charSequence).append(cYh.d("8FE0C2B9F8CF4A6E26342310143F2F0223280E3E26B4D0E08EC4D8BEEBC0"));
                ((StringBuilder)charSequence).append(((Object)((Object)jSONException)).toString());
                Init.show(((StringBuilder)charSequence).toString());
            }
            if ((charSequence = this.I) == null) return "";
            StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("0035351B2435090335233E34007868B8C3C38FFFEEBEEBDB4A7D7F"));
            stringBuilder.append(((Object)((Object)jSONException)).toString());
            charSequence.log(stringBuilder.toString());
            return "";
        }
    }

    /*
     * Exception decompiling
     */
    private JSONObject x(String var1_1, String var2_8, boolean var3_9, HashMap<String, String> var4_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 928->1063)] java.lang.Exception
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
    private JSONObject y(String var1_1, boolean var2_3) {
        block24: {
            try {
                var6_4 = var1_1.split(cYh.d("44"));
                var3_5 = var1_1.length();
            }
            catch (Exception var1_2) {
                var4_10 = this.I;
                if (var4_10 != null) {
                    com.github.catvod.spider.merge.i.b.a(var1_2, com.github.catvod.spider.merge.d.d.b(cYh.d("0035351E342832222D797EB3F3C9A9FEF8774A6E")), (SpiderApi)var4_10);
                }
                return null;
            }
            var11_6 = cYh.d("48392F35322249202921783B0D31397E213F1539272808390F35223A682E1E20246C243F06222239712C022228372E67");
            var10_7 = cYh.d("48392F35322249202921783B0D31397E213F1539272808390F35223A682E1E20246C24320827672732280E36386C");
            var1_1 = cYh.d("483539253234037F373425390834247E343202332A7F2732176F353F08285A");
            var5_8 = cYh.d("48392F35322249202921782C022228372E750E3E25342F740F242C3D68");
            var12_9 = cYh.d("483539253234037F373425390834247E2334043F2534792A0F207E");
            var4_10 = cYh.d("81C0DDB6E3F8");
            if (var3_5 >= 1) break block24;
            if (!var2_3) ** GOTO lbl37
            {
                block25: {
                    if (var4_10.equals(this.r)) {
                        var1_1 = new StringBuilder();
                        var1_1.append(this.f);
                        var1_1.append(var11_6);
                    } else {
                        var1_1 = new StringBuilder();
                        var1_1.append(this.f);
                        var1_1.append((String)var10_7);
                    }
                    var1_1 = var1_1.toString();
                    var4_10 = new StringBuilder();
                    var4_10.append(this.f);
                    var4_10.append((String)var5_8);
                    break block25;
lbl37:
                    // 1 sources

                    var4_10 = new StringBuilder();
                    var4_10.append(this.f);
                    var4_10.append((String)var1_1);
                    var1_1 = var4_10.toString();
                    var4_10 = new StringBuilder();
                    var4_10.append(this.f);
                    var4_10.append(var12_9);
                }
                var4_10 = var4_10.toString();
                ** GOTO lbl198
            }
        }
        var8_11 = cYh.d("0F243521");
        var9_12 = cYh.d("80F9FB");
        var7_13 = cYh.d("48");
        if (!var2_3) ** GOTO lbl-1000
        {
            block26: {
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append((String)var5_8);
                var5_8 = var1_1.toString();
                if (!var4_10.equals(this.r)) ** GOTO lbl-1000
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append(var11_6);
                var1_1 = var1_1.toString();
                if (!var9_12.equals(var6_4[2])) break block26;
                var4_10 = var5_8;
                ** GOTO lbl177
            }
            if (!var6_4[2].startsWith(var8_11)) ** GOTO lbl-1000
        }
        var1_1 = var6_4[2];
        var4_10 = var5_8;
        ** GOTO lbl177
lbl-1000:
        // 1 sources

        {
            if (!var6_4[2].startsWith(var7_13)) ** GOTO lbl86
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
        }
        var4_10 = var6_4[2];
lbl-1000:
        // 8 sources

        {
            while (true) {
                var1_1.append((String)var4_10);
                ** GOTO lbl-1000
                break;
            }
lbl86:
            // 1 sources

            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append(var7_13);
        }
        var4_10 = var6_4[2];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            block27: {
                var1_1 = new StringBuilder();
                var1_1.append(this.f);
                var1_1.append((String)var10_7);
                var1_1 = var1_1.toString();
                if (!var9_12.equals(var6_4[1])) break block27;
                var4_10 = var5_8;
                ** GOTO lbl177
            }
            if (!var6_4[1].startsWith(var8_11)) ** GOTO lbl-1000
        }
        var1_1 = var6_4[1];
        var4_10 = var5_8;
        ** GOTO lbl177
lbl-1000:
        // 1 sources

        {
            if (!var6_4[1].startsWith(var7_13)) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
        }
        var4_10 = var6_4[1];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append(var7_13);
        }
        var4_10 = var6_4[1];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            block28: {
                var5_8 = new StringBuilder();
                var5_8.append(this.f);
                var5_8.append(var12_9);
                var5_8 = var5_8.toString();
                var10_7 = new StringBuilder();
                var10_7.append(this.f);
                var10_7.append((String)var1_1);
                var1_1 = var10_7.toString();
                if (!var4_10.equals(this.r)) ** GOTO lbl-1000
                if (!var9_12.equals(var6_4[2])) break block28;
                var4_10 = var5_8;
                ** GOTO lbl177
            }
            if (!var6_4[2].startsWith(var8_11)) ** GOTO lbl-1000
        }
        var1_1 = var6_4[2];
        var4_10 = var5_8;
        ** GOTO lbl177
lbl-1000:
        // 1 sources

        {
            if (!var6_4[2].startsWith(var7_13)) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
        }
        var4_10 = var6_4[2];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append(var7_13);
        }
        var4_10 = var6_4[2];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            block29: {
                if (!var9_12.equals(var6_4[1])) break block29;
                var4_10 = var5_8;
                ** GOTO lbl177
            }
            if (!var6_4[1].startsWith(var8_11)) ** GOTO lbl-1000
        }
        var1_1 = var6_4[1];
        var4_10 = var5_8;
        ** GOTO lbl177
lbl-1000:
        // 1 sources

        {
            if (!var6_4[1].startsWith(var7_13)) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
        }
        var4_10 = var6_4[1];
        ** GOTO lbl-1000
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append(this.f);
            var1_1.append(var7_13);
        }
        var4_10 = var6_4[1];
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var1_1 = var1_1.toString();
            var4_10 = var5_8;
lbl177:
            // 9 sources

            if (var9_12.equals(var6_4[0])) ** GOTO lbl198
            if (!var6_4[0].startsWith(var8_11)) ** GOTO lbl-1000
        }
        var4_10 = var6_4[0];
        ** GOTO lbl198
lbl-1000:
        // 1 sources

        {
            if (!var6_4[0].startsWith(var7_13)) ** GOTO lbl190
            var4_10 = new StringBuilder();
            var4_10.append(this.f);
        }
        var5_8 = var6_4[0];
lbl-1000:
        // 2 sources

        {
            while (true) {
                var4_10.append((String)var5_8);
                ** GOTO lbl-1000
                break;
            }
lbl190:
            // 1 sources

            var4_10 = new StringBuilder();
            var4_10.append(this.f);
            var4_10.append(var7_13);
        }
        var5_8 = var6_4[0];
        ** while (true)
lbl-1000:
        // 1 sources

        {
            var4_10 = var4_10.toString();
lbl198:
            // 4 sources

            var5_8 = new JSONObject();
            var5_8.put(cYh.d("142433"), var4_10);
            var5_8.put(cYh.d("043F253402280B"), (Object)var1_1);
            return var5_8;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final HashMap<String, String> I(String string) {
        String string22;
        String string3;
        String[] stringArray;
        String string4;
        HashMap<String, String> hashMap;
        block11: {
            String string5;
            block10: {
                CharSequence charSequence;
                block9: {
                    hashMap = new HashMap<String, String>();
                    string4 = this.F(cYh.d("81C0DDB6E3F88FFFF6B7E6D882F4F5"), cYh.d("81C0DDB6E3F88FFFF6B7E6D882F4F5B4D8D881C5F1"), cYh.d("14352023343238382430333F15"), cYh.d("34182430333F1523"), "");
                    stringArray = this.r;
                    if (!cYh.d("81C0DDB6E3F8").equals(stringArray) || string4.length() <= 1) {
                        string4 = this.G(cYh.d("8FFFF6B7E6D882F4F5"), cYh.d("8FFFF6B7E6D882F4F5B4D8D881C5F1"), cYh.d("1231"), cYh.d("2F352035322814"), cYh.d("32232423163D023E35"), "");
                    }
                    int n2 = string4.length();
                    charSequence = cYh.d("5C");
                    string3 = cYh.d("44");
                    string22 = cYh.d("43");
                    stringArray = string4;
                    if (n2 > 1) {
                        string5 = cYh.d("27");
                        stringArray = string4;
                        if (string4.indexOf(string5) > 0) {
                            stringArray = string4.replace(string5, string22).replace(cYh.d("4176"), string3).replace(cYh.d("88ECDABEEBC1"), charSequence);
                        }
                    }
                    string4 = this.J((String)stringArray);
                    hashMap.put(cYh.d("322324237A1B00352F25"), string4);
                    string5 = this.n(string);
                    n2 = this.s.indexOf(cYh.d("0460"));
                    string4 = cYh.d("243F2E3A3E3F");
                    if (n2 < 0 && string5.length() > 1) {
                        hashMap.put(string4, string5);
                    }
                    if (stringArray.indexOf(string5 = cYh.d("35352734253F15")) >= 0 || this.s.indexOf(cYh.d("1561")) < 0) break block9;
                    string = string.split((String)charSequence)[0];
                    break block10;
                }
                if (stringArray.indexOf(string5) >= 0 || this.s.indexOf(cYh.d("15")) < 0) break block11;
                charSequence = new StringBuilder();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                string = cYh.d("48");
                stringBuilder.append(string);
                ((StringBuilder)charSequence).append(stringBuilder.toString().replaceAll(cYh.d("497A6939232E17237E0D6D75480B1F7E0A714E7F6F7B"), cYh.d("4361")));
                ((StringBuilder)charSequence).append(string);
                string = ((StringBuilder)charSequence).toString();
            }
            hashMap.put(string5, string);
        }
        if ((string = stringArray.replaceAll(cYh.d("497AA6C5E2B2E3C162"), "").replaceAll(cYh.d("497AA7D8DCBCFBEA62"), "").replaceAll(cYh.d("497A1E041679"), "")).indexOf(string22) >= 0) {
            for (String string22 : string.split(string3)) {
                string = cYh.d("3B74");
                if (string4.equals(string22.split(string)[0])) continue;
                string3 = string22.split(string)[0];
                if (cYh.d("043F2E3A3E3F").equals(string3)) continue;
                string3 = string22.split(string)[0];
                string = string22.split(string)[1].equals(cYh.d("80F9FB")) ? "" : string22.split(string)[1];
                hashMap.put(string3, string);
            }
        }
        return hashMap;
    }

    /*
     * Unable to fully structure code
     */
    protected final String J(String var1_1) {
        block9: {
            block7: {
                block8: {
                    var4_2 = this.B(cYh.d("80C9FAB4EACF"));
                    var3_3 = this.r;
                    if (!cYh.d("81C0DDB6E3F8").equals(var3_3)) {
                        if (XBPQ.K.length() > 1) {
                            return XBPQ.K;
                        }
                        if (this.s.indexOf(cYh.d("04")) < 0 && (var4_2.length() > 1 || this.s.indexOf(cYh.d("1E")) >= 0 || this.s.indexOf(cYh.d("3E")) >= 0 || this.s.indexOf(cYh.d("2B")) >= 0 || this.s.indexOf(cYh.d("80D2F8B4D0E1")) >= 0 || this.B(cYh.d("8EFACDB9F8DB")).length() > 0 || this.B(cYh.d("81E5CEB9F0D282C9E9")).length() > 0)) {
                            var3_3 = Init.d;
                            var4_2 = new StringBuilder();
                            var4_2.append(this.G);
                            var4_2.append(cYh.d("382520"));
                            var3_3 = var3_3.getString(var4_2.toString(), "");
                            if (var3_3.length() > 1) {
                                XBPQ.K = var3_3;
                                return var3_3;
                            }
                        }
                    }
                    var3_3 = var1_1;
                    if (var1_1.length() < 1) {
                        var3_3 = this.G(cYh.d("8FFFF6B7E6D882F4F5"), cYh.d("8FFFF6B7E6D882F4F5B4D8D881C5F1"), cYh.d("1231"), cYh.d("2F352035322814"), cYh.d("32232423163D023E35"), "");
                    }
                    var1_1 = cYh.d("27");
                    var4_2 = cYh.d("43");
                    var3_3 = var3_3.replace(var1_1, var4_2);
                    var1_1 = cYh.d("4176");
                    var5_4 = cYh.d("44");
                    var1_1 = var3_3.replace(var1_1, var5_4).replace(cYh.d("88ECDABEEBC1"), cYh.d("5C")).trim();
                    var2_5 = var1_1.isEmpty();
                    var6_6 = cYh.d("26");
                    var8_7 = cYh.d("06");
                    var7_8 = cYh.d("2A1F03181B1F380500");
                    var3_3 = cYh.d("2A3F3B383B36067F747F677A4F1C283F22225C70003F332808392571666B5C7006392F33471234383B3E48020A00667455607169656C496071636C7A10266871162A173C240632382C39357E6269507E726777722C18151C1B76473C283A327A2035223A3873470624232433083E6E65796A471329233837027F7667796A496379616E745F69611C38380E3C2471043B01313338786F54676F6261");
                    var9_9 = cYh.d("81D9CAB7CBE0");
                    if (var2_5 || var1_1.indexOf(var9_9) >= 0 || var1_1.indexOf(var7_8) >= 0 || var1_1.indexOf(cYh.d("80C4F4B9D3CB")) >= 0 || var1_1.indexOf(cYh.d("37131E0416")) >= 0 || var1_1.indexOf(cYh.d("322324237A1B00352F25")) < 0 && (this.s.indexOf(var8_7) >= 0 || this.s.indexOf(var6_6) >= 0 || this.s.indexOf(cYh.d("30")) >= 0)) break block7;
                    if (var1_1.indexOf(cYh.d("322324237A1B00352F2573")) < 0) break block8;
                    var3_3 = new StringBuilder();
                    var3_3.append(var1_1);
                    var3_3.append(var5_4);
                    var1_1 = var3_3.toString().replaceAll(cYh.d("497A142232284A112634392E3B74697F7D654E736F7B"), cYh.d("4361"));
                    break block9;
                }
                if (var1_1.indexOf((String)var4_2) >= 0) ** GOTO lbl-1000
                break block9;
            }
            if (var1_1.indexOf(var9_9) < 0 && var1_1.indexOf(var7_8) < 0 && this.s.indexOf(var8_7) < 0 && this.s.indexOf(var6_6) < 0) {
                var1_1 = cYh.d("2A3F3B383B36067F747F677A4F07283F33351023611F037A56606F616C7A30392F676361472877657E7A2620313D320D02320A3823755263767F646C47780A1903172B7C613D3E31027006343431087961123F28083D247E6E6E49606F65616A517E74657709063620233E755263767F646C");
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = var3_3;
            }
        }
        XBPQ.K = var1_1;
        return var1_1;
    }

    final String U(String string) {
        return com.github.catvod.spider.merge.N.a.l(string).p0();
    }

    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> hashMap) {
        SpiderApi spiderApi = this.I;
        if (spiderApi != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(cYh.d("0431353430351529023E392E023E35792333036D"));
            stringBuilder.append(string);
            stringBuilder.append(cYh.d("4B7031366A"));
            stringBuilder.append(string2);
            stringBuilder.append(cYh.d("4B7027383B2E02227C"));
            stringBuilder.append(bl);
            stringBuilder.append(cYh.d("4B702429233F09347C"));
            stringBuilder.append(((Object)hashMap).toString());
            stringBuilder.append(cYh.d("4E"));
            spiderApi.log(stringBuilder.toString());
        }
        string = (string = this.e(string, string2, bl, hashMap)) != null ? string.toString() : "";
        return string;
    }

    /*
     * Unable to fully structure code
     */
    protected final String d0(String var1_1, String var2_2, String var3_4, String var4_5) {
        block61: {
            block59: {
                block60: {
                    block56: {
                        block57: {
                            block55: {
                                var7_7 = this.A;
                                var10_9 = cYh.d("57");
                                if (var10_9.equals(var7_7)) {
                                    return var3_4;
                                }
                                this.H = var5_10 = this.H + 1;
                                var11_11 = cYh.d("04");
                                if (var5_10 == 2 && this.s.indexOf(var11_11) < 0) {
                                    this.s = com.github.catvod.spider.merge.b.n.b(new StringBuilder(), this.s, var11_11);
                                }
                                if (this.H == 4) {
                                    this.H = 0;
                                    return var3_4;
                                }
                                var7_7 = cYh.d("447362");
                                var9_12 = var2_2.split((String)var7_7)[1];
                                var8_13 = var2_2.split((String)var7_7)[0];
                                var2_2 = var4_5;
                                var12_14 = this.m((String)var8_13, (String)var4_5);
                                var2_2 = var4_5;
                                var7_7 = var12_14.getString(cYh.d("142433"));
                                var2_2 = var4_5;
                                var4_5 = var12_14.getString(cYh.d("043F253402280B"));
                                var2_2 = var4_5;
                                if (var3_4.indexOf(cYh.d("8FEED2B4D2FF8EFACDB9F8DB80F0C0")) < 0) break block55;
                                var2_2 = var4_5;
                                com.github.catvod.spider.merge.j.k.i = cYh.d("8FFFF6B9E9C982D5E4B8FDD68FFFC0B6F7DB");
                                break block56;
                            }
                            var2_2 = var4_5;
                            var5_10 = var3_4.indexOf(cYh.d("81EBD0B4DDF28EFACDB9F8DB"));
                            var12_14 = cYh.d("83EAFBB7CBE08EFACDB9F8DB");
                            if (var5_10 < 0) {
                                var2_2 = var4_5;
                                if (var3_4.indexOf((String)var12_14) >= 0) break block57;
                                var2_2 = var4_5;
                                com.github.catvod.spider.merge.j.k.i = cYh.d("80EDD0B8F6EF81E5CEB9F0D2");
                                var7_7 = var8_13;
                                break block56;
                            }
                        }
                        var2_2 = var4_5;
                        com.github.catvod.spider.merge.j.k.i = var12_14;
                    }
                    var2_2 = var4_5;
                    var12_14 = this.z;
                    var2_2 = var4_5;
                    var2_2 = var4_5;
                    var13_15 = new c(this, (String)var7_7, (String)var12_14);
                    var2_2 = var4_5;
                    Init.run((Runnable)var13_15, 200);
                    while (true) {
                        var2_2 = var4_5;
                        var6_16 = "".equals(this.A);
                        var7_7 = var4_5;
                        if (!var6_16) break;
                        try {
                            Thread.sleep(500L);
                            continue;
                        }
                        catch (Exception var7_8) {
                            block58: {
                                var2_2 = var4_5;
                                if (!this.m) break block58;
                                var2_2 = var4_5;
                                var2_2 = var4_5;
                                var12_14 = new StringBuilder();
                                var2_2 = var4_5;
                                var12_14.append(this.G);
                                var2_2 = var4_5;
                                var12_14.append(cYh.d("8FE0C2B9F8CF4A6E3634350C0E3536153E3B0B3F26B6CAFB80CCE1B8C3C388ECDB"));
                                var2_2 = var4_5;
                                var12_14.append(var7_8.toString());
                                var2_2 = var4_5;
                                Init.show(var12_14.toString());
                            }
                            var2_2 = var4_5;
                            var12_14 = this.I;
                            if (var12_14 == null) continue;
                            var2_2 = var4_5;
                            var2_2 = var4_5;
                            var13_15 = new StringBuilder();
                            var2_2 = var4_5;
                            var13_15.append(cYh.d("103523073E3F101428303B3500B7DCF0B0C6C7B9D5C8BFF5C87D6C6F"));
                            var2_2 = var4_5;
                            var13_15.append(var7_8.toString());
                            var2_2 = var4_5;
                            try {
                                var12_14.log(var13_15.toString());
                                continue;
                            }
                            catch (Exception var4_6) {
                                if (this.m) {
                                    var7_7 = new StringBuilder();
                                    var7_7.append(this.G);
                                    var7_7.append(cYh.d("8FE0C2B9F8CF4A6EA8FBDBB2C8D1A4D6EDB3F3C9AEEDCD"));
                                    var7_7.append(var4_6.toString());
                                    Init.show(var7_7.toString());
                                }
                                var12_14 = this.I;
                                var7_7 = var2_2;
                                if (var12_14 == null) break;
                                com.github.catvod.spider.merge.i.b.a(var4_6, com.github.catvod.spider.merge.d.d.b(cYh.d("8EFACDB9F8DB8EC4D8B9F8F54A7D7F")), (SpiderApi)var12_14);
                                var7_7 = var2_2;
                            }
                        }
                        break;
                    }
                    var2_2 = this.A;
                    if (cYh.d("56").equals(var2_2)) {
                        this.A = "";
                    }
                    if ("".equals(this.A) || var10_9.equals(this.A) || this.s.indexOf(cYh.d("3E")) >= 0) break block61;
                    var2_2 = cYh.d("1C332E353227");
                    if (var7_7.indexOf((String)var2_2) > 0) {
                        var4_5 = var7_7.replace((CharSequence)var2_2, this.A);
                    } else {
                        var2_2 = com.github.catvod.spider.merge.d.d.b((String)var7_7);
                        var2_2.append(this.A);
                        var4_5 = var2_2.toString();
                    }
                    var2_2 = this.r;
                    if (!cYh.d("81C0DDB6E3F8").equals(var2_2)) {
                        if (this.s.indexOf(var11_11) >= 0) {
                            var2_2 = this.r((String)var8_13);
                        } else {
                            this.s = com.github.catvod.spider.merge.b.n.b(new StringBuilder(), this.s, var11_11);
                            var2_2 = this.r((String)var8_13);
                            this.s = this.s.replace(var11_11, "");
                        }
                    } else {
                        var2_2 = this.I((String)var8_13);
                    }
                    if (this.m) {
                        Init.show(this.z);
                    }
                    if (var4_5.indexOf(cYh.d("5C202E222361")) < 0) {
                        com.github.catvod.spider.merge.h.b.g((String)var4_5, var2_2);
                        break block59;
                    }
                    var7_7 = new XBPQ$5();
                    com.github.catvod.spider.merge.k.g.e(com.github.catvod.spider.merge.k.g.b(), var4_5.split(cYh.d("5C"))[0], null, (Map<String, String>)var2_2, (com.github.catvod.spider.merge.k.c)var7_7);
                    var2_2 = (String)var7_7.getResult();
                    var6_16 = this.m;
                    var4_5 = cYh.d("8EFACDB9F8DB82F4F0B9E3FF");
                    if (!var6_16) ** GOTO lbl166
                    var7_7 = var2_2 != null ? var2_2 : var4_5;
                    Init.show((String)var7_7);
lbl166:
                    // 2 sources

                    if ((var7_7 = this.I) == null) break block59;
                    var8_13 = new StringBuilder();
                    var8_13.append(cYh.d("8EFACDB9F8DB80EBD2B7C9C64A7D7F71"));
                    var8_13.append((String)var2_2);
                    if (var8_13.toString() != null) break block60;
                    var2_2 = var4_5;
                }
                try {
                    var7_7.log((String)var2_2);
                }
                catch (Exception var2_3) {
                    if (this.m) {
                        var4_5 = new StringBuilder();
                        var4_5.append(this.G);
                        var4_5.append(cYh.d("8FE0C2B9F8CF4A6E3634350C0E3536153E3B0B3F26B8FDD68FFFC0B4C7D4173F3225BECEFEBFFDCB"));
                        var4_5.append(var2_3.toString());
                        Init.show(var4_5.toString());
                    }
                    if ((var4_5 = this.I) == null) break block59;
                    com.github.catvod.spider.merge.i.b.a(var2_3, com.github.catvod.spider.merge.d.d.b(cYh.d("103523073E3F101428303B3500B9EBDDBFF5E6B5D1DF27351424A8C5CEB2C8FF6C7C69")), (SpiderApi)var4_5);
                }
            }
            if (!var10_9.equals(this.A)) {
                this.A = "";
            }
        }
        if (var10_9.equals(this.A)) {
            return var3_4;
        }
        if (cYh.d("013535323F").equals(var1_1)) {
            var3_4 = this.j(var9_12);
        }
        if (cYh.d("013535323F0A082335").equals(var1_1)) {
            var3_4 = this.k(var9_12);
        }
        return var3_4;
    }

    public String decrypt(String string, String string2, String object, String string3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(((String)object).getBytes(cYh.d("3204077C6F")), cYh.d("261512"));
            Cipher cipher = Cipher.getInstance(cYh.d("2615127E140E357F111A14095200203533330937"));
            object = new IvParameterSpec(string3.getBytes());
            cipher.init(2, (Key)secretKeySpec, (AlgorithmParameterSpec)object);
            string = new String(cipher.doFinal(Base64.decode((String)string, (int)0)), string2);
            return string;
        }
        catch (Exception exception) {
            string2 = this.I;
            if (string2 != null) {
                com.github.catvod.spider.merge.i.b.a(exception, com.github.catvod.spider.merge.d.d.b(cYh.d("033522232E2A137868B8C3C38FFFEE7C7A64")), (SpiderApi)string2);
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 104->166)] java.lang.Exception
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
            Cipher cipher = Cipher.getInstance(cYh.d("2615127E140E357F111A14095200203533330937"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(((String)object).getBytes(), cYh.d("261512"));
            object = new IvParameterSpec(string3.getBytes());
            cipher.init(1, (Key)secretKeySpec, (AlgorithmParameterSpec)object);
            string = Base64.encodeToString((byte[])cipher.doFinal(string.getBytes(string2)), (int)0);
            return string;
        }
        catch (Exception exception) {
            string2 = this.I;
            if (string2 != null) {
                com.github.catvod.spider.merge.i.b.a(exception, com.github.catvod.spider.merge.d.d.b(cYh.d("023E22232E2A137868B8C3C38FFFEE7C7A64")), (SpiderApi)string2);
            }
            return null;
        }
    }

    protected final String f(String string, String object, boolean bl, HashMap<String, String> object2) {
        CharSequence charSequence;
        String string2;
        String string3;
        Object object3;
        CharSequence charSequence2;
        block14: {
            block13: {
                if (string.startsWith(cYh.d("0F243521"))) {
                    return string;
                }
                charSequence2 = this.b;
                object3 = this.E(cYh.d("80D9F8B7F9D082D8C7B6E6E1"), cYh.d("80D9F8B7F9D082D8C7B6E6E112222D"), cYh.d("80D9F8B7F9D082D8C7B6E6E18EC3FFB7D9FF"), "");
                string3 = this.F(cYh.d("8FE5F6B4F0D18EF1F4"), cYh.d("82D8C7B6E6E18FE5F6B4F0D18EF1F4B6F7DB"), cYh.d("163932393E2302"), cYh.d("01393322232A063724"), cYh.d("56"));
                int n2 = this.r.length();
                string2 = cYh.d("4361");
                charSequence = charSequence2;
                if (n2 > 0) {
                    charSequence = charSequence2;
                    if (((String)object3).indexOf(cYh.d("43")) >= 0) {
                        charSequence = charSequence2;
                        if (((String)object3).indexOf(this.r) >= 0) {
                            charSequence = com.github.catvod.spider.merge.b.n.a((String)object3, cYh.d("44"));
                            charSequence2 = com.github.catvod.spider.merge.d.d.b(cYh.d("497A"));
                            ((StringBuilder)charSequence2).append(this.r);
                            ((StringBuilder)charSequence2).append(cYh.d("497A7E0D7372497A7E7874744D"));
                            charSequence = ((String)charSequence).replaceAll(((StringBuilder)charSequence2).toString(), string2);
                        }
                    }
                }
                if (((String)charSequence).indexOf(cYh.d("3C")) >= 0) break block13;
                charSequence2 = charSequence;
                if (((String)charSequence).indexOf(cYh.d("1B")) < 0) break block14;
            }
            charSequence2 = ((String)object).equals(string3) ? ((String)charSequence).replaceAll(cYh.d("497A1A0D0C263B2C1C7F7D720F2435210C043B0D1C7B7E063A6F6F7B"), string2).replace(cYh.d("01393322230A0637246C"), "") : ((String)charSequence).replaceAll(cYh.d("3B2C1D2D"), cYh.d("3B2C")).replaceAll(cYh.d("4F7E6B780C063C2C1D2D0A744D"), string2);
        }
        string2 = cYh.d("1A");
        string3 = cYh.d("1C");
        charSequence = charSequence2;
        if (bl) {
            charSequence = charSequence2;
            if (this.a) {
                charSequence = charSequence2;
                if (object2 != null) {
                    charSequence = charSequence2;
                    if (((HashMap)object2).size() > 0) {
                        object3 = ((HashMap)object2).keySet().iterator();
                        while (true) {
                            charSequence = charSequence2;
                            if (!object3.hasNext()) break;
                            String string4 = (String)object3.next();
                            charSequence = ((HashMap)object2).get(string4);
                            if (((String)charSequence).length() <= 0) continue;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(string3);
                            stringBuilder.append(string4);
                            stringBuilder.append(string2);
                            charSequence2 = ((String)charSequence2).replace(stringBuilder.toString(), URLEncoder.encode((String)charSequence));
                        }
                    }
                }
            }
        }
        string = ((String)charSequence).replace(cYh.d("1C3320253213032D"), string).replace(cYh.d("1C332025320A002D"), (CharSequence)object);
        object = Pattern.compile(cYh.d("3B2B697F7D654E0C3C")).matcher(string);
        while (((Matcher)object).find()) {
            object2 = ((Matcher)object).group(0).replace(string3, "").replace(string2, "");
            string = string.replace(((Matcher)object).group(0), "");
            charSequence2 = new StringBuilder();
            charSequence = cYh.d("48");
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append((String)object2);
            ((StringBuilder)charSequence2).append((String)charSequence);
            string = string.replace(((StringBuilder)charSequence2).toString(), "");
        }
        return string;
    }

    protected final com.github.catvod.spider.merge.f0.a g0(String string) {
        int n2 = string.indexOf(cYh.d("5C202E2223"));
        CharSequence charSequence = cYh.d("1F20");
        if (n2 >= 0) {
            string = this.k(com.github.catvod.spider.merge.b.n.a((String)charSequence, string));
        } else {
            charSequence = com.github.catvod.spider.merge.d.d.b((String)charSequence);
            ((StringBuilder)charSequence).append(string.split(cYh.d("5C"))[0]);
            string = this.j(((StringBuilder)charSequence).toString());
        }
        return new com.github.catvod.spider.merge.f0.a(com.github.catvod.spider.merge.N.a.l(string).R());
    }

    public String getToken(String string, String string2, String string3, String string4) {
        return this.encrypt(string, string2, string3, string4);
    }

    /*
     * Unable to fully structure code
     */
    public String homeContent(boolean var1_1) {
        block69: {
            block68: {
                block65: {
                    block67: {
                        block63: {
                            block64: {
                                block62: {
                                    block60: {
                                        block55: {
                                            block49: {
                                                var14_2 = cYh.d("043C203F6D75483C2E3236360F3F322578");
                                                var15_3 = cYh.d("043C203F6D7548");
                                                var21_4 = cYh.d("0F");
                                                var16_5 = cYh.d("80E1FAB4C9D1");
                                                var13_6 = cYh.d("80FDDAB8D7D3");
                                                var12_7 = new JSONObject();
                                                var9_8 = new JSONArray();
                                                var18_9 = this.D(cYh.d("81F8EBB4CCE4"), cYh.d("81F8EBB4CCE481F8E0B4EBD5"), "");
                                                var7_10 = this.B(cYh.d("82D8C7B6E6E18FFFE7B7D4DF"));
                                                if (var7_10.indexOf(var16_5) < 0 && var7_10.indexOf(cYh.d("82E9F5B5ECE7")) < 0 && var7_10.indexOf(cYh.d("82CCF1B4DBE0")) < 0 && var7_10.indexOf(cYh.d("82FFFDB7EBCE")) < 0 && var7_10.indexOf(cYh.d("83E8FAB7EBCE")) < 0 && var7_10.indexOf(cYh.d("80FEC1B5ECD1")) < 0) {
                                                    var2_11 = false;
                                                    break block49;
                                                }
                                                var2_11 = true;
                                            }
                                            var3_12 = this.s.indexOf(var21_4);
                                            var17_13 = cYh.d("547D");
                                            var19_14 = cYh.d("4A18");
                                            var20_15 = cYh.d("557D");
                                            var10_16 = cYh.d("5561");
                                            var11_17 = cYh.d("5462");
                                            var25_18 = cYh.d("3B34");
                                            var22_19 = cYh.d("82D5E9B8D4F2");
                                            var6_20 = cYh.d("82D8D6B7C2EA");
                                            var8_26 = cYh.d("57");
                                            var23_27 = cYh.d("56");
                                            var24_28 = cYh.d("13293134083C0B3126");
                                            if (var3_12 < 0) {
                                                block51: {
                                                    block54: {
                                                        block53: {
                                                            block52: {
                                                                if (var23_27.equals(var18_9) || var22_19.equals(var18_9) || var18_9.indexOf(cYh.d("8EF6D7B8F6EF")) >= 0) ** break block50
                                                                if (!var2_11) break block51;
                                                                var6_20 = this.p((String)var7_10, (String)var6_20);
                                                                if (var6_20.length() <= 0) break block52;
                                                                var7_10 = var6_20;
                                                                if (var6_20.matches(var25_18)) break block53;
                                                            }
                                                            var7_10 = var8_26;
                                                        }
                                                        if (cYh.d("55").equals(var7_10)) {
                                                            var6_20 = var11_17;
                                                            break block54;
                                                        }
                                                        var6_20 = var7_10;
                                                        if (!var23_27.equals(var7_10)) break block54;
                                                        var6_20 = var10_16;
                                                    }
                                                    var7_10 = new StringBuilder();
                                                    var7_10.append(var17_13);
                                                    var7_10.append((String)var6_20);
                                                    var12_7.put(var24_28, (Object)var7_10.toString());
                                                    var7_10 = "";
                                                    break block55;
                                                }
                                                var6_20 = "";
                                                var7_10 = "";
                                            } else {
                                                block59: {
                                                    block58: {
                                                        block57: {
                                                            block56: {
                                                                var7_10 = this.p(var18_9, (String)var6_20);
                                                                if (var7_10.length() <= 0) break block56;
                                                                var6_20 = var7_10;
                                                                if (var7_10.matches(var25_18)) break block57;
                                                            }
                                                            var6_20 = var8_26;
                                                        }
                                                        if (this.s.indexOf(cYh.d("0F62")) < 0) break block58;
                                                        var6_20 = var11_17;
                                                        break block59;
                                                    }
                                                    if (this.s.indexOf(cYh.d("0F61")) < 0) break block59;
                                                    var6_20 = var10_16;
                                                }
                                                var7_10 = new StringBuilder();
                                                var7_10.append(var20_15);
                                                var7_10.append((String)var6_20);
                                                var7_10.append(var19_14);
                                                var12_7.put(var24_28, (Object)var7_10.toString());
                                                var10_16 = "";
                                                var7_10 = var6_20;
                                                var6_20 = var10_16;
                                            }
                                        }
                                        this.c = this.l();
                                        var11_17 = this.D(cYh.d("82D8D6B9F6F282D8C7B6E6E1"), cYh.d("01352F3D3233"), "");
                                        var10_16 = var11_17;
                                        if (var11_17.isEmpty()) {
                                            var10_16 = this.c;
                                        }
                                        var10_16 = var10_16.split(cYh.d("44"));
                                        var3_12 = ((String[])var10_16).length;
                                        var11_17 = var9_8;
                                        var9_8 = var12_7;
                                        for (var4_29 = 0; var4_29 < var3_12; ++var4_29) {
                                            block66: {
                                                var12_7 = var10_16[var4_29].split(cYh.d("3B74"));
                                                var25_18 = new JSONObject();
                                                var25_18.put(cYh.d("132931340834063D24"), (Object)var12_7[0]);
                                                var25_18.put(cYh.d("13293134083303"), (Object)var12_7[1]);
                                                if (this.s.indexOf(var21_4) >= 0 || var23_27.equals(var18_9) || var22_19.equals(var18_9) || var18_9.indexOf((String)var12_7[0]) >= 0) ** GOTO lbl127
                                                if (!var2_11) ** GOTO lbl138
                                                var12_7 = new StringBuilder();
                                                var12_7.append(var17_13);
                                                var12_7.append((String)var6_20);
                                                var12_7 = var12_7.toString();
                                                break block66;
lbl127:
                                                // 1 sources

                                                var12_7 = new StringBuilder();
                                                var12_7.append(var20_15);
                                                var12_7.append((String)var7_10);
                                                var12_7.append(var19_14);
                                                var12_7 = var12_7.toString();
                                            }
                                            var25_18.put(var24_28, var12_7);
lbl138:
                                            // 2 sources

                                            var11_17.put((Object)var25_18);
                                            continue;
                                        }
                                        var9_8.put(cYh.d("043C202224"), (Object)var11_17);
                                        var10_16 = this.B.optJSONObject(var13_6);
                                        var6_20 = cYh.d("01392D25322803313530");
                                        var7_10 = cYh.d("01392D253228");
                                        if (var10_16 == null) {
                                            block61: {
                                                if (!this.B(var13_6).isEmpty()) break block60;
                                                if (this.B.optJSONObject((String)var7_10) == null) break block61;
                                                var6_20 = var7_10;
                                                break block62;
                                            }
                                            if (this.B.optJSONObject((String)var6_20) == null) {
                                                var6_20 = "";
                                            }
                                            break block62;
                                        }
                                    }
                                    var6_20 = var13_6;
                                }
                                var7_10 = this.B.optJSONObject((String)var6_20);
                                var10_16 = cYh.d("80FDDAB8D7D381C5F1B7DAF4");
                                try {
                                    var10_16 = this.D((String)var6_20, (String)var10_16, "");
                                    var6_20 = this.b;
                                    if (var8_26.equals(this.B(var13_6))) break block63;
                                    if (var6_20.indexOf(cYh.d("1C332D3024291A")) >= 0 || var6_20.indexOf(cYh.d("1C3133343627")) >= 0 || var6_20.indexOf(cYh.d("1C2924302527")) >= 0 || var6_20.indexOf(cYh.d("1C32382C")) >= 0 || this.D(var16_5, cYh.d("80FDDAB8D7D382FDD1B4DFDC80E1FAB4C7D780F7F1"), "").length() > 1) break block64;
                                    if (var7_10 == null) ** GOTO lbl174
                                }
                                catch (Exception var6_21) {}
                                if (var7_10.length() > 0) break block64;
lbl174:
                                // 2 sources

                                if (var10_16.length() <= 1) break block63;
                            }
                            var5_30 = true;
                            break block67;
                        }
                        var5_30 = false;
                    }
                    this.a = var5_30;
                    if (!var1_1 || !var5_30) ** GOTO lbl240
                    if (var10_16.startsWith(cYh.d("0F243521")) || var10_16.startsWith(cYh.d("043C203F"))) ** GOTO lbl192
                    if (var7_10 == null) ** GOTO lbl190
                    var6_20 = var7_10;
                    if (!var10_16.equals(cYh.d("022835"))) break block65;
lbl190:
                    // 2 sources

                    var6_20 = this.q();
                    break block65;
lbl192:
                    // 1 sources

                    var6_20 = InetAddress.getLocalHost();
                    var8_26 = new StringBuilder(cYh.d("0F2435216D7548"));
                    var8_26.append(var6_20.getHostAddress());
                    var8_26.append(cYh.d("5D"));
                    var8_26.append(this.J);
                    var8_26.append(cYh.d("4836283D3275"));
                    var6_20 = var10_16;
                    if (var10_16.startsWith(var15_3)) {
                        var6_20 = var10_16.startsWith(var14_2) != false ? var10_16.replace(var14_2, var8_26.toString()) : var10_16.replace(var15_3, var8_26.toString());
                    }
                    var8_26 = com.github.catvod.spider.merge.h.b.h((String)var6_20, null, null);
                    var6_20 = var7_10;
                    if (var8_26 == null) break block65;
                    var6_20 = new JSONObject((String)var8_26);
                }
                if (var6_20 == null) ** GOTO lbl240
                var9_8.put(cYh.d("01392D25322814"), var6_20);
                ** GOTO lbl240
                break block68;
                catch (Exception var6_22) {
                    // empty catch block
                }
            }
            try {
                if (this.m) {
                    var7_10 = new StringBuilder();
                    var7_10.append(this.G);
                    var7_10.append(cYh.d("8FE0C2B9F8CF4A6EA9DFE0BFE8C6A6FCCCB3E7D9A4D6EDB3F3C9AEEDCD"));
                    var7_10.append(var6_20.toString());
                    Init.show(var7_10.toString());
                }
                if ((var7_10 = this.I) == null) ** GOTO lbl240
            }
            catch (Exception var6_23) {}
            var8_26 = new StringBuilder();
            var8_26.append(cYh.d("8FDEF6B4D8CC80FDDAB8D7D38EC4D8B9F8F588ECC07C7A64"));
            var8_26.append(var6_20.toString());
            var7_10.log(var8_26.toString());
lbl240:
            // 5 sources

            var6_20 = var9_8.toString();
            return var6_20;
            break block69;
            catch (Exception var6_24) {
                // empty catch block
            }
        }
        if (this.m) {
            var7_10 = new StringBuilder();
            var7_10.append(this.G);
            var7_10.append(cYh.d("8FE0C2B9F8CF4A6E293E3A3F243F2F25323413B5C6EBBECEFEBFFDCB"));
            var7_10.append(var6_25.toString());
            Init.show(var7_10.toString());
        }
        if ((var7_10 = this.I) != null) {
            com.github.catvod.spider.merge.i.b.a((Exception)var6_25, com.github.catvod.spider.merge.d.d.b(cYh.d("0F3F2C3414350924243F23724EB9D5C8BFF5C8BFFDD07A7759")), (SpiderApi)var7_10);
        }
        return "";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String homeVideoContent() {
        block12: {
            block13: {
                block11: {
                    block16: {
                        block15: {
                            block14: {
                                var8_1 = cYh.d("3B74");
                                var10_2 = cYh.d("01352F3D3233");
                                var9_3 = cYh.d("82D8D6B9F6F282D8C7B6E6E1");
                                var6_4 = cYh.d("56");
                                var5_5 = "";
                                var4_6 = this.F(cYh.d("8EF6D7B8F6EF"), cYh.d("80D3ECB8C0F2"), cYh.d("0F3F2C3414350924243F23"), cYh.d("14382E242E3F"), cYh.d("5360"));
                                var2_7 = var4_6.equals(var6_4);
                                var7_8 = cYh.d("8EF6D7B8F6EF");
                                if (var2_7) ** GOTO lbl14
                                var3_9 = var4_6;
                                if (!var4_6.equals(var7_8)) break block14;
lbl14:
                                // 2 sources

                                var3_9 = cYh.d("5360");
                            }
                            var1_11 = this.D((String)var9_3, var10_2, "").length();
                            var4_6 = cYh.d("44");
                            if (var1_11 >= 3) ** GOTO lbl27
                            var9_3 = new StringBuilder();
                            var9_3.append(this.c);
                            var9_3.append((String)var4_6);
                            var4_6 = var9_3.toString();
                            break block15;
lbl27:
                            // 1 sources

                            var11_12 /* !! */  = new StringBuilder();
                            var11_12 /* !! */ .append(this.D((String)var9_3, var10_2, ""));
                            var11_12 /* !! */ .append((String)var4_6);
                            var4_6 = var11_12 /* !! */ .toString();
                        }
                        this.e = 40;
                        var1_11 = var3_9.indexOf(cYh.d("43"));
                        var9_3 = cYh.d("4361");
                        var11_12 /* !! */  = cYh.d("3B74697F7D654E736F7B");
                        var10_2 = cYh.d("497A");
                        if (var1_11 < 0) ** GOTO lbl53
                        this.e = Integer.parseInt(var3_9.split((String)var8_1)[1]);
                        var8_1 = var3_9.split((String)var8_1)[0];
                        if (var8_1.equals(var7_8)) break block16;
                        var3_9 = new StringBuilder();
                        var3_9.append(var10_2);
                        var3_9.append((String)var8_1);
                        var3_9.append((String)var11_12 /* !! */ );
                        var3_9 = var3_9.toString();
                        ** GOTO lbl68
lbl53:
                        // 1 sources

                        if (!var3_9.matches(cYh.d("3B346A"))) break block11;
                        this.e = Integer.parseInt((String)var3_9);
                    }
                    var3_9 = "";
                    ** GOTO lbl69
                }
                var8_1 = new StringBuilder();
                var8_1.append(var10_2);
                var8_1.append((String)var3_9);
                var8_1.append((String)var11_12 /* !! */ );
                var3_9 = var8_1.toString();
lbl68:
                // 2 sources

                var3_9 = var4_6.replaceAll((String)var3_9, (String)var9_3);
lbl69:
                // 2 sources

                if (this.e <= 0) break block12;
                this.d = true;
                this.r = var7_8;
                var4_6 = new HashMap();
                var4_6 = this.e((String)var3_9, var6_4, false, (HashMap<String, String>)var4_6);
                this.r = "";
                this.d = false;
                var3_9 = var5_5;
                if (var4_6 == null) break block13;
                try {
                    var3_9 = var4_6.toString();
                }
                catch (Exception var3_10) {
                    if (this.m) {
                        var4_6 = new StringBuilder();
                        var4_6.append(this.G);
                        var4_6.append(cYh.d("8FE0C2B9F8CF4A6EA9DFE0BFE8C6A8F7C1B3C6E5A9E4D3BCDDC0A4D6EDB3F3C9AEEDCD"));
                        var4_6.append(var3_10.toString());
                        Init.show(var4_6.toString());
                    }
                    if ((var4_6 = this.I) == null) break block12;
                    com.github.catvod.spider.merge.i.b.a(var3_10, com.github.catvod.spider.merge.d.d.b(cYh.d("8FDEF6B4D8CC8EF6D7B8F6EF8FE5C5B7EDCA8EC4D8B9F8F588ECC07C7A64")), (SpiderApi)var4_6);
                }
            }
            return var3_9;
        }
        return "";
    }

    final String i(String string) {
        CharSequence charSequence = string;
        if (!string.isEmpty()) {
            int n2 = 0;
            String string2 = cYh.d("3B");
            String string3 = cYh.d("43");
            String string4 = cYh.d("4F");
            String string5 = cYh.d("4E");
            String string6 = cYh.d("4D");
            String string7 = cYh.d("4C");
            String string8 = cYh.d("49");
            String string9 = cYh.d("3C");
            String string10 = cYh.d("3A");
            String string11 = cYh.d("58");
            String string12 = cYh.d("39");
            String string13 = cYh.d("1C");
            String string14 = cYh.d("1A");
            String string15 = cYh.d("1B");
            while (true) {
                charSequence = string;
                if (n2 >= 14) break;
                String string16 = (new String[]{string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15})[n2];
                charSequence = string;
                if (string.indexOf(string16) >= 0) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append(string16);
                    charSequence = string.replace(string16, ((StringBuilder)charSequence).toString());
                }
                ++n2;
                string = charSequence;
            }
        }
        return charSequence;
    }

    public void init(Context context) {
        super.init(context);
    }

    /*
     * Exception decompiling
     */
    public void init(Context var1_1, String var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[SIMPLE_IF_TAKEN]], but top level block is 1[TRYBLOCK]
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

    public void initApi(SpiderApi spiderApi) {
        this.I = spiderApi;
        super.initApi(spiderApi);
        CharSequence charSequence = spiderApi.getPort();
        this.J = charSequence;
        Init.e = charSequence;
        charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("2E34A6D8DFBDCCFFA4DEF4B5DBCA"));
        ((StringBuilder)charSequence).append(this.J);
        spiderApi.log(((StringBuilder)charSequence).toString());
    }

    public boolean isVideoFormat(String string) {
        if (!(string = string.toLowerCase()).startsWith(cYh.d("0F243521")) && !string.startsWith(cYh.d("0A31263F322E"))) {
            return false;
        }
        String[] stringArray = this.D(cYh.d("82C7C4B7D9F88FFFCC"), cYh.d("31392534381C08222C3023"), cYh.d("0A63346974740A207572793C0B26627F3A2A54736F3C633B443D2036393F136A623433680C6A6237232A5D73353922340335336B742A1223296B742E11322E297A22006A"));
        String[] stringArray2 = cYh.d("44");
        stringArray = stringArray.split((String)stringArray2);
        stringArray2 = this.D(cYh.d("8FEFC6B7ECFE8FFFCC"), cYh.d("31392534381C0E3C353425"), cYh.d("12222D6C3F2E1320626A273514247A72793014")).split((String)stringArray2);
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

    /*
     * Exception decompiling
     */
    protected final String j(String var1_1) {
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

    /*
     * WARNING - void declaration
     */
    protected final String k(String string) {
        String string2;
        Object object;
        boolean bl;
        Object object2;
        block37: {
            Object object3;
            block38: {
                String string3;
                String string4;
                String string5;
                Object object4;
                Object object5;
                int n2;
                String string52;
                block34: {
                    block36: {
                        int n3;
                        block35: {
                            string52 = com.github.catvod.spider.merge.b.n.a(cYh.d("447362"), string);
                            object2 = this.K(string);
                            bl = ((String)object2).startsWith(cYh.d("1F20"));
                            String charSequence2 = cYh.d("4361");
                            string = object2;
                            if (bl) {
                                string = ((String)object2).replaceAll(cYh.d("1F206939232E177E6B78"), charSequence2);
                            }
                            n2 = this.s.indexOf(cYh.d("00"));
                            object = cYh.d("3204077C6F");
                            object2 = n2 >= 0 ? cYh.d("20120A") : this.E(cYh.d("80ECD7B6F7DB"), cYh.d("80EDD0B8F6EF80ECD7B6F7DB81F0FDB4EBD5"), cYh.d("243F2538393D38362E233A3B13"), (String)object);
                            boolean bl2 = object.equals(object2);
                            string2 = "";
                            if (!bl2) {
                                object = this.I;
                                if (object != null) {
                                    object3 = new StringBuilder();
                                    ((StringBuilder)object3).append(cYh.d("80ECD7B6F7DB4A7D7F71"));
                                    ((StringBuilder)object3).append((String)object2);
                                    object.log(((StringBuilder)object3).toString());
                                }
                                object2 = this.h(string);
                            } else {
                                object2 = "";
                            }
                            n2 = ((String)object2).length();
                            n3 = 0;
                            object = string;
                            if (n2 < 1) {
                                block33: {
                                    void var11_18;
                                    object3 = string.split(cYh.d("5C202E222361"))[1].trim();
                                    string = string.split(cYh.d("5C"))[0];
                                    object = this.s;
                                    if (object.indexOf(cYh.d("2D")) >= 0 && string.indexOf(cYh.d("082535342512331D0D")) < 0 && string.indexOf(cYh.d("0E3E2F342512331D0D")) < 0 && this.I != null) {
                                        object2 = this.s.indexOf(cYh.d("2D32")) >= 0 ? cYh.d("5D342E322237023E357F353503296F383934022209051A16") : cYh.d("5D342E322237023E357F333504252C34392E223C243C3234137E2E24233F1518151C1B");
                                        object = object.matches(cYh.d("497A0B336806037B6F7B")) ? object.replaceAll(cYh.d("497A0B3368723B346A787970"), charSequence2) : "";
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append(this.I.getAddress(true));
                                        stringBuilder.append(cYh.d("10352321362814356E"));
                                        stringBuilder.append(string);
                                        stringBuilder.append(cYh.d("5B6C24273636"));
                                        stringBuilder.append((String)object);
                                        stringBuilder.append((String)object2);
                                        object = stringBuilder.toString();
                                        object2 = this.I;
                                        if (object2 != null) {
                                            StringBuilder stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append(cYh.d("81FDE2B4CBF2173F3225B3E1C4B7D1D77A775970"));
                                            stringBuilder2.append((String)object);
                                            object2.log(stringBuilder2.toString());
                                        }
                                        SpiderApi spiderApi = this.I;
                                        object2 = object;
                                        if (spiderApi != null) {
                                            object2 = new StringBuilder();
                                            ((StringBuilder)object2).append(cYh.d("173F3225153503296C7C697A"));
                                            ((StringBuilder)object2).append((String)object3);
                                            spiderApi.log(((StringBuilder)object2).toString());
                                            object2 = object;
                                        }
                                    } else {
                                        object2 = string;
                                    }
                                    object = this.r;
                                    object = !cYh.d("81C0DDB6E3F8").equals(object) ? this.r(string) : this.I(string);
                                    object5 = new XBPQ$6();
                                    SpiderApi spiderApi = this.I;
                                    if (spiderApi != null) {
                                        spiderApi.log(cYh.d("82DFD0B4D0E0173F3225BFF5D0B6F0D3797449"));
                                    }
                                    if (!((String)object3).isEmpty()) {
                                        if (((String)object3).startsWith(cYh.d("1C")) && ((String)object3).endsWith(cYh.d("1A"))) {
                                            try {
                                                JSONObject jSONObject = new JSONObject((String)object3);
                                                com.github.catvod.spider.merge.k.g.f(com.github.catvod.spider.merge.k.g.b(), (String)object2, jSONObject.toString(), (Map<String, String>)object, (com.github.catvod.spider.merge.k.c)object5);
                                            }
                                            catch (JSONException jSONException) {
                                                if (this.m) {
                                                    object = new StringBuilder();
                                                    object.append(this.G);
                                                    object.append(cYh.d("8FE0C2B9F8CF4A6E273423390F002E2223BFE0EAA8C5CEB5DBCA"));
                                                    object.append(((Object)((Object)jSONException)).toString());
                                                    Init.show(object.toString());
                                                }
                                                if ((object3 = this.I) != null) {
                                                    object = com.github.catvod.spider.merge.d.d.b(cYh.d("013535323F0A082335797EB3F3C9A9FEF8774A6E"));
                                                    object.append(((Object)((Object)jSONException)).toString());
                                                    object3.log(object.toString());
                                                }
                                                break block33;
                                            }
                                        }
                                        object4 = new LinkedHashMap();
                                        for (CharSequence charSequence : ((String)object3).split(cYh.d("3B76"))) {
                                            string5 = cYh.d("5A");
                                            if (((String)charSequence).endsWith(string5)) continue;
                                            int n4 = ((String)charSequence).indexOf(string5);
                                            ((AbstractMap)object4).put(((String)charSequence).substring(0, n4), ((String)charSequence).substring(n4 + 1));
                                        }
                                        OkHttpClient okHttpClient = com.github.catvod.spider.merge.k.g.b();
                                        object3 = object4;
                                    } else {
                                        OkHttpClient okHttpClient = com.github.catvod.spider.merge.k.g.b();
                                        object3 = null;
                                    }
                                    com.github.catvod.spider.merge.k.g.e((OkHttpClient)var11_18, (String)object2, (Map<String, String>)object3, (Map<String, String>)object, (com.github.catvod.spider.merge.k.c)object5);
                                }
                                object2 = (String)((com.github.catvod.spider.merge.k.c)object5).getResult();
                                object = string;
                            }
                            if (object2 == null) {
                                object2 = "";
                            }
                            object2 = XBPQ.V(this.P((String)object, (String)object2));
                            string = this.A;
                            object3 = cYh.d("57");
                            bl2 = ((String)object3).equals(string);
                            string4 = cYh.d("83EAFBB7CBE08EFACDB9F8DB");
                            object5 = cYh.d("81EBD0B4DDF28EFACDB9F8DB");
                            string3 = cYh.d("8EFACDB9F8DB");
                            object4 = cYh.d("8FEED2B4D2FF8EFACDB9F8DB80F0C0");
                            string5 = cYh.d("82FEC8B4D2F28EFACDB9F8DB");
                            n2 = n3;
                            if (bl2) break block34;
                            if (this.s.indexOf(cYh.d("1E")) >= 0 || this.s.indexOf(cYh.d("3E")) >= 0) break block35;
                            n2 = n3;
                            if (this.B(string3).length() <= 0) break block34;
                        }
                        if (((String)object2).indexOf(string5) >= 0 || ((String)object2).indexOf((String)object4) >= 0 || ((String)object2).indexOf((String)object5) >= 0) break block36;
                        n2 = n3;
                        if (((String)object2).indexOf(string4) < 0) break block34;
                    }
                    n2 = 1;
                }
                string = object2;
                if (n2 == 0) break block37;
                string = this.I;
                if (string != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(cYh.d("8ECCC1B9F1DB8EFACDB9F8DB88ECCDB7EDCA80F0C0B5EFE04A7D7F71"));
                    stringBuilder.append((String)object2);
                    string.log(stringBuilder.toString());
                }
                string = com.github.catvod.spider.merge.b.n.a(object, string52);
                object = this.B(string3);
                object2 = this.d0(cYh.d("013535323F0A082335"), string, (String)object2, (String)object);
                if (((String)object2).indexOf(string5) < 0 || ((String)object2).indexOf((String)object4) < 0 || ((String)object2).indexOf((String)object5) < 0) break block38;
                string = object2;
                if (((String)object2).indexOf(string4) >= 0) break block37;
            }
            Init.show(cYh.d("8EFACDB9F8DB81D8D1B4DDC588ECC0"));
            this.A = object3;
            string = object2;
        }
        object2 = string2;
        if (string != null) {
            if (bl) {
                object2 = string;
            } else {
                object2 = cYh.d("47");
                object = cYh.d("80F9FBB6FEE080F9FB");
                object2 = string.replace((CharSequence)object2, (CharSequence)object).replaceAll(cYh.d("3B236A"), "").replace((CharSequence)object, (CharSequence)object2).trim();
            }
        }
        this.x = object2;
        return object2;
    }

    public Object[] mProxy(Map<String, String> map) {
        return Proxy.proxy(map);
    }

    public boolean manualVideoCheck() {
        boolean bl = !this.D(cYh.d("82C7C4B7D9F88FFFCC"), cYh.d("8FEFC6B7ECFE8FFFCC"), "").isEmpty() || this.C(cYh.d("81D9CAB4DDF282C7C4B7D9F8"), cYh.d("2A312F243636343E2837313F15")).equals(cYh.d("56")) || this.s.indexOf(cYh.d("1F")) >= 0;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    protected final String n(String charSequence4) {
        Object object;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        CharSequence charSequence;
        String string10;
        String string11;
        block23: {
            block22: {
                block21: {
                    string11 = this.z;
                    string10 = cYh.d("57");
                    if (string10.equals(string11)) {
                        return "";
                    }
                    string11 = this.B(cYh.d("80C9FAB4EACF"));
                    charSequence = this.r;
                    boolean bl = cYh.d("81C0DDB6E3F8").equals(charSequence);
                    string9 = cYh.d("88ECDABEEBC1");
                    string8 = cYh.d("4176");
                    string7 = cYh.d("43");
                    string6 = cYh.d("27");
                    string5 = cYh.d("44");
                    string4 = cYh.d("5C");
                    if (bl) break block21;
                    if (this.z.length() > 1) {
                        return this.z;
                    }
                    if (this.s.indexOf(cYh.d("04")) < 0 && (string11.length() > 1 || this.s.indexOf(cYh.d("1E")) >= 0 || this.s.indexOf(cYh.d("3E")) >= 0 || this.s.indexOf(cYh.d("2B")) >= 0 || this.s.indexOf(cYh.d("80D2F8B4D0E1")) >= 0 || this.B(cYh.d("8EFACDB9F8DB")).length() > 0 || this.B(cYh.d("81E5CEB9F0D282C9E9")).length() > 0) && ((String)(charSequence = Init.d.getString(this.G, ""))).length() > 1) {
                        this.z = charSequence;
                        return charSequence;
                    }
                    string3 = cYh.d("8FFFF6B7E6D882F4F5");
                    string2 = cYh.d("8FFFF6B7E6D882F4F5B4D8D881C5F1");
                    charSequence = cYh.d("1231");
                    string = cYh.d("2F352035322814");
                    object = cYh.d("32232423163D023E35");
                    break block22;
                }
                charSequence = this.F(cYh.d("81C0DDB6E3F88FFFF6B7E6D882F4F5"), cYh.d("81C0DDB6E3F88FFFF6B7E6D882F4F5B4D8D881C5F1"), cYh.d("14352023343238382430333F15"), cYh.d("34182430333F1523"), "").replace(string6, string7).replace(string8, string5).replace(string9, string4).trim();
                string3 = charSequence;
                if (((String)charSequence).length() >= 1) break block23;
                string3 = cYh.d("8FFFF6B7E6D882F4F5");
                string2 = cYh.d("8FFFF6B7E6D882F4F5B4D8D881C5F1");
                charSequence = cYh.d("1231");
                string = cYh.d("2F352035322814");
                object = cYh.d("32232423163D023E35");
            }
            string3 = this.G(string3, string2, (String)charSequence, string, (String)object, "").replace(string6, string7).replace(string8, string5).replace(string9, string4).trim();
        }
        Object object2 = new HashMap<String, String>();
        charSequence = this.J(string3);
        ((HashMap)object2).put(cYh.d("322324237A1B00352F25"), charSequence);
        Object object3 = new HashMap();
        Object object4 = new HashMap<String, List<String>>();
        int n2 = string11.length();
        string = cYh.d("5A");
        string2 = cYh.d("4361");
        object = cYh.d("5C202E222361");
        if (n2 > 0 && string11.indexOf((String)object) >= 0 || ((String)charSequence4).indexOf((String)object) >= 0) {
            if (string11.length() > 0) {
                charSequence = string11.split((String)object)[0];
                string11 = string11.split((String)object).length > 1 ? string11.split((String)object)[1] : "";
            } else if (((String)charSequence4).indexOf((String)object) >= 0) {
                charSequence = ((String)charSequence4).split((String)object)[0];
                string11 = ((String)charSequence4).split((String)object).length > 1 ? ((String)charSequence4).split((String)object)[1] : "";
            } else {
                charSequence = "";
            }
            if (string11.length() > 0) {
                for (String string12 : string11.split(cYh.d("3B76"))) {
                    ((HashMap)object3).put(string12.split(string)[0], string12.split(string)[1]);
                }
            }
            ((HashMap)object2).put(cYh.d("35352734253F15"), charSequence);
            StringBuilder stringBuilder = new StringBuilder();
            object = new StringBuilder();
            ((StringBuilder)object).append((String)charSequence4);
            String string13 = cYh.d("48");
            ((StringBuilder)object).append(string13);
            stringBuilder.append(((StringBuilder)object).toString().replaceAll(cYh.d("497A6939232E17237E0D6D75480B1F7E0A714E7F6F7B"), string2));
            stringBuilder.append(string13);
            String string14 = stringBuilder.toString();
            ((HashMap)object2).put(cYh.d("282228363E34"), string14);
            com.github.catvod.spider.merge.h.b.d((String)charSequence, (Map<String, String>)object3, (Map<String, String>)object2, (Map<String, List<String>>)object4);
        }
        this.T((Map<String, List<String>>)object4);
        object = new StringBuilder(this.z);
        object4 = this.D(cYh.d("81C2ECB7C3E48FFFF6B7E6D882F4F5"), cYh.d("80CBF5B7D9FF81C2ECB7C3E480CBF5B8C4E48FF7C7B8F5CB8FFFF6B7E6D882F4F5"), "");
        object3 = cYh.d("083F2A3832");
        if (string3.indexOf((String)object3) >= 0 || ((String)object4).indexOf((String)object3) >= 0) {
            void var1_8;
            n2 = string3.indexOf((String)object3);
            object2 = cYh.d("497A2E3E3C33020C65790C04440D6A6E7E79497A");
            if (n2 >= 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(string5);
                String string15 = stringBuilder.toString().replaceAll((String)object2, string2);
            } else {
                String string16 = "";
            }
            charSequence = var1_8;
            if (((String)object4).indexOf((String)object3) >= 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)var1_8);
                ((StringBuilder)charSequence).append(string4);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(((String)object4).replace(string6, string7).replace(string8, string5));
                stringBuilder.append(string5);
                ((StringBuilder)charSequence).append(stringBuilder.toString().replace(string9, string4).replaceAll((String)object2, string2));
                charSequence = ((StringBuilder)charSequence).toString();
            }
            for (CharSequence charSequence2 : ((String)charSequence).replaceAll(cYh.d("5C7B"), string4).split(string4)) {
                if (((StringBuilder)object).indexOf(((String)charSequence2).split(string)[0]) >= 0) continue;
                ((StringBuilder)object).append((String)charSequence2);
                ((StringBuilder)object).append(string4);
            }
        }
        if (((StringBuilder)object).toString().length() < 2) {
            this.z = string10;
            return "";
        }
        if (string11.length() > 1) {
            SharedPreferences.Editor editor = Init.d.edit();
            this.z = string11 = ((StringBuilder)object).toString();
            editor.putString(this.G, string11);
            editor.apply();
        }
        String string17 = this.o;
        if (cYh.d("043F2E3A3E3F").equals(string17)) {
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 129[TRYBLOCK] [147 : 3847->3856)] java.lang.Exception
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

    protected final HashMap<String, String> r(String object) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        HashMap<String, String> hashMap;
        int n2;
        Object object2;
        String[] stringArray;
        block12: {
            String string6;
            block11: {
                CharSequence charSequence;
                block10: {
                    stringArray = this.F;
                    charSequence = cYh.d("1561");
                    if (stringArray != null && !stringArray.isEmpty() && this.s.indexOf((String)charSequence) < 0 && this.s.indexOf(cYh.d("04")) < 0) {
                        return this.F;
                    }
                    this.F = new HashMap();
                    object2 = this.G(cYh.d("8FFFF6B7E6D882F4F5"), cYh.d("8FFFF6B7E6D882F4F5B4D8D881C5F1"), cYh.d("1231"), cYh.d("2F352035322814"), cYh.d("32232423163D023E35"), "").trim();
                    n2 = ((String)object2).length();
                    hashMap = cYh.d("5C");
                    string5 = cYh.d("44");
                    string4 = cYh.d("43");
                    stringArray = object2;
                    if (n2 > 1) {
                        string3 = cYh.d("27");
                        stringArray = object2;
                        if (((String)object2).indexOf(string3) > 0) {
                            stringArray = ((String)object2).replace(string3, string4).replace(cYh.d("4176"), string5).replace(cYh.d("88ECDABEEBC1"), (CharSequence)((Object)hashMap));
                        }
                    }
                    string2 = this.J((String)stringArray);
                    object2 = this.F;
                    string3 = cYh.d("322324237A1B00352F25");
                    ((HashMap)object2).put(string3, string2);
                    object2 = this.n((String)object);
                    n2 = this.s.indexOf(cYh.d("0460"));
                    string = cYh.d("243F2E3A3E3F");
                    if (n2 < 0 && ((String)object2).length() > 1) {
                        this.F.put(string, (String)object2);
                    }
                    if (stringArray.indexOf(string6 = cYh.d("35352734253F15")) >= 0 || this.s.indexOf((String)charSequence) < 0) break block10;
                    object2 = this.F;
                    hashMap = ((String)object).split((String)((Object)hashMap))[0];
                    object = object2;
                    object2 = hashMap;
                    break block11;
                }
                if (stringArray.indexOf(string6) >= 0 || this.s.indexOf(cYh.d("15")) < 0) break block12;
                hashMap = this.F;
                object2 = new StringBuilder();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                object = cYh.d("48");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)object2).append(((StringBuilder)charSequence).toString().replaceAll(cYh.d("497A6939232E17237E0D6D75480B1F7E0A714E7F6F7B"), cYh.d("4361")));
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
                object = hashMap;
            }
            ((HashMap)object).put(string6, object2);
        }
        if (((String)(object = stringArray.replaceAll(cYh.d("497AA6C5E2B2E3C162"), "").replaceAll(cYh.d("497AA7D8DCBCFBEA62"), "").replaceAll(cYh.d("497A1E041679"), ""))).indexOf(string4) >= 0) {
            stringArray = ((String)object).split(string5);
            int n3 = stringArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                string4 = stringArray[n2];
                object = cYh.d("3B74");
                if (string3.equals(string4.split((String)object)[0]) && string2.length() > 0 || string.equals(string4.split((String)object)[0])) continue;
                object2 = string4.split((String)object)[0];
                if (cYh.d("043F2E3A3E3F").equals(object2)) continue;
                hashMap = this.F;
                object2 = string4.split((String)object)[0];
                object = string4.split((String)object)[1].equals(cYh.d("80F9FB")) ? "" : string4.split((String)object)[1];
                hashMap.put((String)object2, (String)object);
            }
        }
        if ((stringArray = this.I) != null) {
            object = com.github.catvod.spider.merge.d.d.b(cYh.d("8FFFF6B7E6D882F4F57C7A6447"));
            ((StringBuilder)object).append(((Object)this.F).toString());
            stringArray.log(((StringBuilder)object).toString());
        }
        return this.F;
    }

    /*
     * Unable to fully structure code
     */
    public String searchContent(String var1_1, boolean var2_3) {
        block31: {
            block28: {
                var11_4 = cYh.d("0C60");
                var9_5 = "";
                var8_6 = this.I;
                if (var8_6 == null) ** GOTO lbl19
                var7_8 = new StringBuilder();
                var7_8.append(cYh.d("143520233432243F2F25323413782A342E67"));
                var7_8.append(var1_1);
                var7_8.append(cYh.d("4B7030243E390C6D"));
                var7_8.append(var2_3);
                var7_8.append(cYh.d("4E"));
                var8_6.log(var7_8.toString());
lbl19:
                // 2 sources

                this.r = cYh.d("81C0DDB6E3F8");
                var7_8 = this.W("", var1_1, var2_3);
                var8_6 = this.E(cYh.d("80D9F8B7F9D082D8C7B6E6E1"), cYh.d("80D9F8B7F9D082D8C7B6E6E112222D"), cYh.d("80D9F8B7F9D082D8C7B6E6E18EC3FFB7D9FF"), "").replace(this.f, "");
                var10_9 = cYh.d("0B393225");
                if (var7_8 != null) {
                    if (var7_8.getJSONArray(var10_9) == null || var7_8.getJSONArray(var10_9).length() <= 0 || var8_6.indexOf(cYh.d("4438352527")) >= 0) break block28;
                    return var7_8.toString();
                }
            }
            if (var7_8 == null) ** GOTO lbl32
            var7_8 = var7_8.getJSONArray(var10_9);
            break block31;
lbl32:
            // 1 sources

            var7_8 = new JSONArray();
        }
        var12_10 = var8_6.split(cYh.d("4438"));
        var6_11 = ((String[])var12_10).length;
        var5_12 = 0;
        var3_13 = 0;
        while (true) {
            block29: {
                block32: {
                    var8_6 = cYh.d("44");
                    if (var3_13 >= var6_11) break;
                    var14_16 = var12_10[var3_13];
                    if (!var14_16.startsWith(cYh.d("132431"))) break block29;
                    var13_15 = new StringBuilder();
                    var13_15.append(cYh.d("0F"));
                    var15_17 = new StringBuilder();
                    var15_17.append(var14_16);
                    var15_17.append((String)var8_6);
                    var13_15.append(var15_17.toString().replaceAll(cYh.d("497A6925232A497A7E7874744D"), cYh.d("4361")));
                    var8_6 = this.W(var13_15.toString(), var1_1, var2_3);
                    if (var8_6 == null) ** GOTO lbl59
                    var8_6 = var8_6.getJSONArray(var10_9);
                    break block32;
lbl59:
                    // 1 sources

                    var8_6 = new JSONArray();
                }
                if (var8_6.length() <= 0) break block29;
                var4_14 = 0;
                while (true) {
                    if (var4_14 >= var8_6.length()) break;
                    var7_8.put(var8_6.get(var4_14));
                    ++var4_14;
                    continue;
                    break;
                }
            }
            ++var3_13;
        }
        if (this.s.indexOf((String)var11_4) >= 0) {
            this.s = this.s.replace(var11_4, "");
        }
        if (var7_8.length() > 0) {
            var1_1 = new JSONObject();
            return var1_1.put(var10_9, (Object)var7_8).toString();
        }
        var11_4 = new StringBuilder();
        var11_4.append(this.f);
        var11_4.append(cYh.d("486B7AB7C7C68EF6D7B8F6EF"));
        var11_4 = this.W(var11_4.toString(), var1_1, var2_3);
        if (var11_4 == null) ** GOTO lbl89
        if (var11_4.getJSONArray(var10_9) != null && var11_4.getJSONArray(var10_9).length() > 0) {
            return var11_4.toString();
        }
lbl89:
        // 3 sources

        var11_4 = this.c.split((String)var8_6);
        var4_14 = ((CharSequence)var11_4).length;
        block18: for (var3_13 = 0; var3_13 < var4_14; ++var3_13) {
            block30: {
                block33: {
                    var12_10 = var11_4[var3_13];
                    var8_6 = new StringBuilder();
                    var8_6.append(this.f(var12_10.split(cYh.d("3B74"))[1], cYh.d("56"), false, null));
                    var8_6.append(cYh.d("5C6BA7C1CBB3C1C6A8F0E2"));
                    var8_6 = this.W(var8_6.toString(), var1_1, var2_3);
                    if (var8_6 == null) ** GOTO lbl104
                    var8_6 = var8_6.getJSONArray(var10_9);
                    break block33;
lbl104:
                    // 1 sources

                    var8_6 = new JSONArray();
                }
                if (var8_6.length() <= 0) break block30;
                var3_13 = var5_12;
                while (true) {
                    if (var3_13 >= var8_6.length()) break block18;
                    var7_8.put(var8_6.get(var3_13));
                    ++var3_13;
                    continue;
                    break;
                }
            }
            Thread.sleep(1000L);
lbl118:
            // 2 sources

            continue block18;
        }
        var1_1 = var9_5;
        try {
            if (var7_8.length() > 0) {
                var1_1 = new JSONObject();
                var1_1 = var1_1.put(var10_9, (Object)var7_8).toString();
            }
            return var1_1;
        }
        catch (Exception var1_2) {
            if (this.m) {
                var7_8 = new StringBuilder();
                var7_8.append(this.G);
                var7_8.append(cYh.d("8FE0C2B9F8CF4A6E323436280438023E392E023E35B4D0E08EC4D8BEEBC0"));
                var7_8.append(var1_2.toString());
                Init.show(var7_8.toString());
            }
            if ((var7_8 = this.I) != null) {
                com.github.catvod.spider.merge.i.b.a(var1_2, com.github.catvod.spider.merge.d.d.b(cYh.d("143520233432243F2F253234137868B8C3C38FFFEE7C7A64")), (SpiderApi)var7_8);
            }
            return "";
        }
        catch (Exception var8_7) {
            ** continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String xpDetailContent(List<String> var1_1) {
        block54: {
            block46: {
                block51: {
                    block47: {
                        block48: {
                            block49: {
                                block50: {
                                    block45: {
                                        block44: {
                                            var16_3 = cYh.d("437465");
                                            var15_4 = cYh.d("3B741D750B7E");
                                            var8_5 /* !! */  = var1_1.get(0).split(var15_4);
                                            if (!var8_5 /* !! */ [2].startsWith(cYh.d("48")) || var8_5 /* !! */ [2].startsWith(cYh.d("487F"))) break block44;
                                            var6_6 = new StringBuilder();
                                            var6_6.append(this.f);
                                            var6_6.append(var8_5 /* !! */ [2]);
                                            var6_6 = var6_6.toString();
                                            break block45;
                                        }
                                        var6_6 = var8_5 /* !! */ [2];
                                    }
                                    var17_7 = this.g0((String)var6_6);
                                    var9_8 = this.D(cYh.d("81C2ECB7C3E483EACDB7FBFB81D8EBB4D8CC"), cYh.d("03240F3E333F"), "");
                                    var7_16 = var8_5 /* !! */ [1];
                                    var18_17 = var8_5 /* !! */ [0];
                                    var13_18 = var7_16;
                                    if (this.h) {
                                        var13_18 = this.fixCover((String)var7_16, (String)var6_6);
                                    }
                                    var11_19 = this.D(cYh.d("80FEC1B5ECD1"), cYh.d("032405342439"), "");
                                    var6_6 = this.D(cYh.d("82EDF0B6DEDD80E1FAB4C9D1"), cYh.d("03240230233F"), "");
                                    var10_20 = this.D(cYh.d("82EDF0B6DEDD82CCF1B4DBE0"), cYh.d("03240023323B"), "");
                                    var7_16 = this.D(cYh.d("82EDF0B6DEDD82E9F5B5ECF9"), cYh.d("032418343628"), "");
                                    var12_21 = this.D(cYh.d("82EDF0B6DEDD80DAF7B7D7DB"), cYh.d("03240C302531"), "");
                                    var14_22 = this.D(cYh.d("82FFFDB7EBCE"), cYh.d("03240538253F04242E23"), "");
                                    var8_5 /* !! */  = this.E(cYh.d("83E8FAB7EBCE"), cYh.d("81ECD5B4C6C2"), cYh.d("03240032233515"), "");
                                    var9_8 = (LinkedList)var17_7.a((String)var9_8);
                                    var9_8 = var9_8.size() > 0 ? (com.github.catvod.spider.merge.f0.b)var9_8.get(0) : null;
                                    var6_6 = var9_8.c((String)var6_6).a().trim();
                                    try {
                                        var7_16 = var9_8.c((String)var7_16).a().trim();
                                    }
                                    catch (Exception var9_14) {
                                        break block50;
                                    }
                                    try {
                                        var10_20 = var9_8.c(var10_20).a().trim();
                                    }
                                    catch (Exception var9_13) {
                                        break block49;
                                    }
                                    try {
                                        var12_21 = var9_8.c((String)var12_21).a().trim();
                                    }
                                    catch (Exception var9_12) {
                                        var11_19 = var6_6;
                                        break block48;
                                    }
                                    try {
                                        var8_5 /* !! */  = var9_8.c((String)var8_5 /* !! */ ).a().trim();
                                    }
                                    catch (Exception var9_11) {
                                        var8_5 /* !! */  = "";
                                        var14_22 = "";
                                        var11_19 = var6_6;
                                        var6_6 = var14_22;
                                        break block47;
                                    }
                                    try {
                                        var14_22 = var9_8.c((String)var14_22).a().trim();
                                    }
                                    catch (Exception var9_10) {
                                        var14_22 = "";
                                        var11_19 = var6_6;
                                        var6_6 = var14_22;
                                        break block47;
                                    }
                                    try {
                                        var9_8 = var9_8.c((String)var11_19).a().trim();
                                        var11_19 = var6_6;
                                        var6_6 = var14_22;
                                        break block46;
                                    }
                                    catch (Exception var9_9) {
                                        var11_19 = var6_6;
                                        var6_6 = var14_22;
                                        break block47;
                                    }
                                    catch (Exception var9_15) {
                                        var6_6 = "";
                                    }
                                }
                                var7_16 = "";
                            }
                            var10_20 = "";
                            var11_19 = var6_6;
                        }
                        var12_21 = "";
                        var8_5 /* !! */  = "";
                        var6_6 = "";
                    }
                    if (this.m) {
                        var14_22 = new StringBuilder();
                        var14_22.append(this.G);
                        var14_22.append(cYh.d("8FE0C2B9F8CF4A6E3921133F1331283D14350924243F23B2E9E7A4DEC1BFEFC7A9F0FFB3F3C9AEEDCD"));
                        var14_22.append(var9_8.toString());
                        Init.show(var14_22.toString());
                    }
                    if ((var14_22 = this.I) == null) break block51;
                    var19_23 = new StringBuilder();
                    var19_23.append(cYh.d("1F200534233B0E3C023E392E023E35B9D9ED82DFD7B4DFCD8FF1E9B8C3C38FFFEEBEEBDB4A7D7F"));
                    var19_23.append(var9_8.toString());
                    var14_22.log(var19_23.toString());
                }
                var9_8 = "";
            }
            var14_22 = new JSONObject();
            var14_22.put(cYh.d("113F250E3E3E"), (Object)var1_1.get(0));
            var14_22.put(cYh.d("113F250E393B0A35"), (Object)var18_17);
            var14_22.put(cYh.d("113F250E273304"), (Object)var13_18);
            var14_22.put(cYh.d("132931340834063D24"), (Object)var11_19);
            var14_22.put(cYh.d("113F250E2E3F0622"), var7_16);
            var14_22.put(cYh.d("113F250E36280231"), (Object)var10_20);
            var14_22.put(cYh.d("113F250E253F0A31333A24"), (Object)var12_21);
            var14_22.put(cYh.d("113F250E3639133F33"), (Object)var8_5 /* !! */ );
            var14_22.put(cYh.d("113F250E3333153522253828"), var6_6);
            var14_22.put(cYh.d("113F250E34350924243F23"), var9_8);
            var6_6 = new ArrayList();
            var8_5 /* !! */  = var17_7.a(this.D(cYh.d("80EAFEB9E0F581C5F1B6ECDE"), cYh.d("032407233837293F2534"), ""));
            var2_24 = 0;
            while (true) {
                var7_16 = (LinkedList)var8_5 /* !! */ ;
                var3_25 = var7_16.size();
                var1_1 = cYh.d("4824242923724E");
                if (var2_24 >= var3_25) break;
                var6_6.add(((com.github.catvod.spider.merge.f0.b)var7_16.get(var2_24)).c(this.D(cYh.d("80EAFEB9E0F581F0C6B8F5C2"), cYh.d("03240723383729312C34"), (String)var1_1)).a().trim());
                ++var2_24;
                continue;
                break;
            }
            var7_16 = new ArrayList();
            var11_19 = this.D(cYh.d("81C2ECB7C3E481C5F1B6ECDE"), cYh.d("032414233B14083424"), "");
            var8_5 /* !! */  = this.D(cYh.d("81C2ECB7C3E482D8D6B9F6F2"), cYh.d("032414233B0912320F3E333F"), cYh.d("487F20"));
            var10_20 = this.D(cYh.d("81C2ECB7C3E481F0C6B8F5C2"), cYh.d("032414233B14063D24"), (String)var1_1);
            var9_8 = this.D(cYh.d("81C2ECB7C3E48EC3FFB7D9FF"), cYh.d("032414233B1303"), cYh.d("48102923323C"));
            var1_1 = var17_7.a((String)var11_19);
            var3_25 = 0;
            while (true) {
                var11_19 = (LinkedList)var1_1;
                if (var3_25 >= var11_19.size()) break;
                var11_19 = ((com.github.catvod.spider.merge.f0.b)var11_19.get(var3_25)).b((String)var8_5 /* !! */ );
                var12_21 = new ArrayList<String>();
                var2_24 = 0;
                while (true) {
                    block52: {
                        var17_7 = (LinkedList)var11_19;
                        if (var2_24 >= var17_7.size()) break;
                        var4_26 = this.y != false ? var17_7.size() - 1 - var2_24 : var2_24;
                        var13_18 = ((com.github.catvod.spider.merge.f0.b)var17_7.get(var4_26)).c(var10_20).a().trim();
                        var18_17 = ((com.github.catvod.spider.merge.f0.b)var17_7.get(var4_26)).c((String)var9_8).a().trim();
                        if (var18_17 == null) break block52;
                        if (var18_17.length() < 1) break block52;
                        var17_7 = new StringBuilder(var13_18);
                        var17_7.append(cYh.d("43"));
                        var17_7.append(var18_17);
                        var12_21.add(var17_7.toString());
                    }
                    ++var2_24;
                }
                if (var12_21.size() == 0 && var6_6.size() > var3_25) {
                    var6_6.set(var3_25, "");
                }
                var7_16.add(TextUtils.join((CharSequence)cYh.d("44"), var12_21));
                ++var3_25;
                continue;
                break;
            }
            ** try [egrp 22[TRYBLOCK] [26 : 1310->1318)] { 
lbl188:
            // 3 sources

            for (var2_24 = var6_6.size() - 1; var2_24 >= 0; --var2_24) {
                if (!((String)var6_6.get(var2_24)).isEmpty()) continue;
                var6_6.remove(var2_24);
                continue;
            }
            var8_5 /* !! */  = TextUtils.join((CharSequence)var16_3, (Iterable)var6_6);
            var9_8 = TextUtils.join((CharSequence)var16_3, var7_16);
            if (this.I == null) ** GOTO lbl227
            if (var7_16.size() >= 1) break block54;
            var1_1 = this.I;
            var6_6 = cYh.d("3F2020253FBCF1E9A4EDD8BCFBFAA9DFE0BFE8C6A4D9E7BCF5FDA7C5E9BFEFC7A9F0FFB5DBD1");
            ** GOTO lbl225
        }
        var5_27 = this.m;
        var7_16 = cYh.d("3F2020253FBCF1E9A4EDD8B2E9E7A4DEC1BCF5FDA7C5E9BFEFE0A4D9C0B2C6F86C7C697A");
        if (!var5_27) ** GOTO lbl216
        try {
            block53: {
                var1_1 = this.I;
                var6_6 = new StringBuilder();
                var6_6.append((String)var7_16);
                var6_6.append((String)var9_8);
lbl213:
                // 2 sources

                while (true) {
                    var6_6 = var6_6.toString();
                    break block53;
                    break;
                }
lbl216:
                // 1 sources

                var1_1 = this.I;
                var6_6 = new StringBuilder();
                var6_6.append((String)var7_16);
                var6_6.append(var9_8.split(var15_4)[0]);
                var6_6.append(cYh.d("497E6F7F7974"));
                ** continue;
            }
            var1_1.log((String)var6_6);
lbl227:
            // 2 sources

            var14_22.put(cYh.d("113F250E273606291E3725350A"), (Object)var8_5 /* !! */ );
            var14_22.put(cYh.d("113F250E273606291E242536"), var9_8);
            var1_1 = new JSONObject();
            var6_6 = new JSONArray();
            var6_6.put((Object)var14_22);
            var1_1.put(cYh.d("0B393225"), var6_6);
            var1_1 = var1_1.toString();
            return var1_1;
        }
lbl239:
        // 18 sources

        catch (Exception var1_2) {
            if (this.m) {
                var6_6 = new StringBuilder();
                var6_6.append(this.G);
                var6_6.append(cYh.d("8FE0C2B9F8CF4A6E3921133F1331283D14350924243F23BFE0EAA8C5CEB5DBCA"));
                var6_6.append(var1_2.toString());
                Init.show(var6_6.toString());
            }
            if ((var6_6 = this.I) != null) {
                com.github.catvod.spider.merge.i.b.a(var1_2, com.github.catvod.spider.merge.d.d.b(cYh.d("1F200534233B0E3C023E392E023E35797EB3F3C9A9FEF8B5DBD16C7C69")), (SpiderApi)var6_6);
            }
            return "";
        }
    }

    /*
     * Unable to fully structure code
     */
    protected final String z(String var1_1) {
        block17: {
            block20: {
                block19: {
                    block16: {
                        var13_3 = cYh.d("48");
                        var7_4 = cYh.d("322324237A1B00352F25");
                        var8_5 = cYh.d("27");
                        var12_6 = cYh.d("35352734253F15");
                        var6_7 = cYh.d("3B74");
                        var5_8 = this.E(cYh.d("81C2ECB7C3E48FFFF6B7E6D882F4F5"), cYh.d("80CBF5B7D9FF81C2ECB7C3E480CBF5B8C4E48FF7C7B8F5CB8FFFF6B7E6D882F4F5"), cYh.d("173C202808320231253425"), "").trim();
                        var2_9 = var5_8.length();
                        var11_10 = cYh.d("44");
                        var10_11 = cYh.d("43");
                        var4_12 = var5_8;
                        if (var2_9 <= 1) ** GOTO lbl17
                        var4_12 = var5_8;
                        if (var5_8.indexOf(var8_5) > 0) {
                            var4_12 = var5_8.replace(var8_5, var10_11).replace(cYh.d("4176"), var11_10).replace(cYh.d("88ECDABEEBC1"), cYh.d("5C"));
                        }
lbl17:
                        // 4 sources

                        if (!var4_12.startsWith(cYh.d("1C")) || !var4_12.endsWith(cYh.d("1A"))) break block16;
                        return var4_12;
                    }
                    var5_8 = new JSONObject();
                    var9_13 = this.J((String)var4_12);
                    var5_8.put(var7_4, (Object)var9_13);
                    var2_9 = this.s.indexOf(cYh.d("24"));
                    var8_5 = cYh.d("243F2E3A3E3F");
                    if (var2_9 < 0) ** GOTO lbl32
                    if (this.n(var1_1).length() > 1) {
                        var5_8.put(var8_5, (Object)this.n(var1_1));
                    }
lbl32:
                    // 4 sources

                    if (var4_12.indexOf(var12_6) < 0 && this.s.indexOf(cYh.d("3561")) >= 0) break block19;
                    if (var4_12.indexOf(var12_6) >= 0 || this.s.indexOf(cYh.d("35")) < 0) break block20;
                    var14_14 = new StringBuilder();
                    var15_15 = new StringBuilder();
                    var15_15.append(var1_1);
                    var15_15.append(var13_3);
                    var14_14.append(var15_15.toString().replaceAll(cYh.d("497A6939232E17237E0D6D75480B1F7E0A714E7F6F7B"), cYh.d("4361")));
                    var14_14.append(var13_3);
                    var1_1 = var14_14.toString();
                }
                var5_8.put(var12_6, (Object)var1_1);
            }
            if ((var1_1 = var4_12.replaceAll(cYh.d("497AA6C5E2B2E3C162"), "").replaceAll(cYh.d("497AA7D8DCBCFBEA62"), "").replaceAll(cYh.d("497A1E041679"), "")).indexOf(var10_11) < 0) break block17;
            for (String var1_1 : var1_1.split(var11_10)) {
                block18: {
                    if (var7_4.equals(var1_1.split(var6_7)[0]) && var9_13.length() > 0 || var8_5.equals(var1_1.split(var6_7)[0]) || cYh.d("043F2E3A3E3F").equals(var1_1.split(var6_7)[0])) continue;
                    var10_11 = var1_1.split(var6_7)[0];
                    if (!var1_1.split(var6_7)[1].equals(cYh.d("80F9FB"))) break block18;
                    var1_1 = "";
                    ** GOTO lbl60
                }
                var1_1 = var1_1.split(var6_7)[1];
lbl60:
                // 2 sources

                var5_8.put(var10_11, (Object)var1_1);
            }
        }
        try {
            var1_1 = var5_8.toString();
            return var1_1;
        }
        catch (JSONException var1_2) {
            if (this.m) {
                var4_12 = new StringBuilder();
                var4_12.append(this.G);
                var4_12.append(cYh.d("8FE0C2B9F8CF4A6E2634230A0B313819323B03353322B2DDDDB9D5C8B8E6FD"));
                var4_12.append(var1_2.toString());
                Init.show(var4_12.toString());
            }
            if ((var5_8 = this.I) != null) {
                var4_12 = com.github.catvod.spider.merge.d.d.b(cYh.d("003535013B3B1E182430333F15236978BECEFEB8EEFEB8E6E67D6C6F"));
                var4_12.append(var1_2.toString());
                var5_8.log(var4_12.toString());
            }
            return "";
        }
    }
}

