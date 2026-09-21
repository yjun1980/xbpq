/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.j;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.B;
import com.github.catvod.spider.merge.UY.D;
import com.github.catvod.spider.merge.UY.g;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.c0.b;
import com.github.catvod.spider.merge.xc.d0.q;
import com.github.catvod.spider.merge.xc.d0.r;
import com.github.catvod.spider.merge.xc.d0.v;
import com.github.catvod.spider.merge.xc.r0.d;
import com.github.catvod.spider.merge.xc.r0.e;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class i {
    public static final LinkedHashMap a = new LinkedHashMap();
    public static final Map b = v.U(new b("User-Agent", "Mozilla/5.0 (Linux; Android 12; SM-X800) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.40 Safari/537.36"), new b("Accept", "application/json, text/plain, */*"), new b("Content-Type", "application/x-www-form-urlencoded"), new b("Origin", "https://pan.baidu.com"), new b("Referer", "https://pan.baidu.com/"));
    public static final String c = "tudou";
    public static final String d = "https://pan.baidu.com";

    static {
        v.U(new b("parse", "1"), new b("msg", "Error retrieving video URL"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(JsonObject var0) {
        block15: {
            block14: {
                block13: {
                    var3_4 = "";
                    try {
                        var2_6 = var4_5 = i.i();
                        if (var4_5 == null) {
                            var2_6 = "";
                        }
                        var5_7 = i.g(i.k());
                        if (var2_6.length() == 0) {
                            return "";
                        }
                        if (var5_7.length() == 0) {
                            return "";
                        }
                        var4_5 = String.valueOf(System.currentTimeMillis());
                        var6_8 = H.l((String)var5_7);
                        com.github.catvod.spider.merge.mI.i.d(var6_8, "sha1Hex(...)");
                        var5_7 = new StringBuilder();
                        var5_7.append((String)var6_8);
                        var5_7.append((String)var2_6);
                        var5_7.append("ebrcUYiuxaZv2XGu7KIYKxUrqfnOfpDF");
                        var5_7.append((String)var4_5);
                        var5_7.append("73CED981D0F186D12BC18CAE1684FFD5|VSRCQTF6W11.30.2ae5821440fab5e1a61a025f014bd8972");
                        var7_9 = H.l(var5_7.toString());
                        com.github.catvod.spider.merge.mI.i.d(var7_9, "sha1Hex(...)");
                        var2_6 = var0.get("randsk").getAsString();
                        var6_8 = var0.get("shareid").getAsString();
                        var5_7 = new b("shareid", var6_8);
                        var8_10 = var0.get("uk").getAsString();
                        var6_8 = new b("uk", var8_10);
                        var8_10 = var0.get("fid").getAsString();
                        var0 = new b("fid", var8_10);
                        var10_11 = new b("origin", "dlna");
                        var11_12 = new b("devuid", "73CED981D0F186D12BC18CAE1684FFD5|VSRCQTF6W");
                        var9_13 = new b("clienttype", "1");
                        var13_14 = new b("channel", "android_12_zhao_bd-netdisk_1024266h");
                        var12_15 = new b("version", "11.30.2");
                        var8_10 = new b("time", var4_5);
                        var14_16 = new b("rand", var7_9);
                        var4_5 = new LinkedHashMap(v.S(10));
                        v.V(var4_5, new b[]{var5_7, var6_8, var0, var10_11, var11_12, var9_13, var13_14, var12_15, var8_10, var14_16});
                        var0 = new ArrayList(var4_5.size());
                        for (Object var6_8 : var4_5.entrySet()) {
                            var5_7 = (String)var6_8.getKey();
                            var6_8 = URLEncoder.encode((String)var6_8.getValue(), "UTF-8");
                            var7_9 = new StringBuilder();
                            var7_9.append((String)var5_7);
                            var7_9.append("=");
                            var7_9.append((String)var6_8);
                            var0.add(var7_9.toString());
                        }
                        var4_5 = new StringBuilder();
                        var4_5.append("sekey=");
                        var4_5.append((String)var2_6);
                        var5_7 = var4_5.toString();
                        var4_5 = new ArrayList(var0.size() + 1);
                        var4_5.addAll(var0);
                        var4_5.add(var5_7);
                        var0 = com.github.catvod.spider.merge.xc.d0.i.K(var4_5, "&", null, null, null, 62);
                        var4_5 = i.k();
                        com.github.catvod.spider.merge.mI.i.b(var2_6);
                        var4_5 = i.r((String)var4_5, (String)var2_6);
                        var5_7 = new b("User-Agent", "netdisk;P2SP;2.2.91.136;android-android;");
                        var2_6 = new b("Referer", "https://pan.baidu.com");
                        var6_8 = new b("Cookie", var4_5);
                        var4_5 = v.U(new b[]{var5_7, var2_6, var6_8});
                        var5_7 = i.d;
                        var2_6 = new StringBuilder();
                        var2_6.append((String)var5_7);
                        var2_6.append("/share/list?");
                        var2_6.append((String)var0);
                        var4_5 = C.R(A.o(var2_6.toString(), r.a, (Map)var4_5));
                    }
lbl85:
                    // 2 sources

                    catch (Exception var0_1) {}
                    try {
                        var0 = var4_5.get("errno");
                        if (var0 == null) break block13;
                        var1_17 = var0.getAsInt();
                        break block14;
                    }
                    catch (Exception var0_2) {
                        // empty catch block
                    }
                }
                var1_17 = 0;
            }
            if (var1_17 == 0) ** GOTO lbl-1000
            var0 = var4_5.get("errmsg");
            if (var0 == null) break block15;
            var0 = var2_6 = var0.getAsString();
            if (var2_6 != null) ** GOTO lbl122
        }
        var0 = (var0 = var4_5.get("show_msg")) != null ? var0.getAsString() : null;
        {
            catch (Exception var0_3) {}
        }
        var2_6 = var0;
        var0 = var2_6;
        if (var2_6 != null) ** GOTO lbl122
        ** GOTO lbl121
lbl-1000:
        // 1 sources

        {
            var0 = var4_5.get("list");
            if (var0 == null) return "";
            if ((var0 = var0.getAsJsonArray()) == null) {
                return "";
            }
            if (var0.size() == 0) {
                return "";
            }
            var2_6 = var0.get(0).getAsJsonObject().get("dlink");
            var0 = var3_4;
            if (var2_6 == null) return var0;
            var0 = var2_6.getAsString();
            if (var0 != null) return var0;
            return var3_4;
lbl121:
            // 2 sources

            var0 = "";
lbl122:
            // 3 sources

            ** try [egrp 3[TRYBLOCK] [12 : 819->926)] { 
lbl123:
            // 1 sources

            var2_6 = new StringBuilder();
            var2_6.append("[BD\u65e0\u9650] share/list errno=");
            var2_6.append(var1_17);
            var2_6.append(" ");
            var2_6.append((String)var0);
            SpiderDebug.log((String)var2_6.toString());
            return "";
        }
        m.o("[BD\u65e0\u9650] \u83b7\u53d6\u76f4\u94fe\u5f02\u5e38: ", var0_1.getMessage());
        return var3_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String b(JsonObject object) {
        HashMap hashMap;
        String string;
        block17: {
            block16: {
                block15: {
                    JsonElement jsonElement;
                    JsonObject jsonObject;
                    string = "";
                    try {
                        i.e();
                        hashMap = c;
                        StringBuilder stringBuilder = new StringBuilder("/");
                        stringBuilder.append((String)((Object)hashMap));
                        String string2 = stringBuilder.toString();
                        i.d();
                        String string3 = object.get("randsk").getAsString();
                        jsonObject = new HashMap();
                        jsonObject.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36 Edg/134.0.0.0");
                        jsonObject.put("Accept", "application/json;charset=UTF-8");
                        jsonObject.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                        jsonObject.put("Referer", "https://pan.baidu.com");
                        jsonObject.put("Cookie", i.k());
                        hashMap = d;
                        HashMap<String, String> hashMap2 = object.get("shareid").getAsString();
                        String string4 = object.get("uk").getAsString();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append((String)((Object)hashMap));
                        stringBuilder2.append("/share/transfer?shareid=");
                        stringBuilder2.append((String)((Object)hashMap2));
                        stringBuilder2.append("&from=");
                        stringBuilder2.append(string4);
                        stringBuilder2.append("&sekey=");
                        stringBuilder2.append(string3);
                        stringBuilder2.append("&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528");
                        string3 = stringBuilder2.toString();
                        hashMap2 = new HashMap<String, String>();
                        string4 = object.get("fid").getAsString();
                        object = new StringBuilder("[");
                        ((StringBuilder)object).append(string4);
                        ((StringBuilder)object).append("]");
                        hashMap2.put("fsidlist", ((StringBuilder)object).toString());
                        hashMap2.put("path", string2);
                        jsonObject = C.R(A.l(string3, hashMap2, jsonObject).b());
                        jsonElement = jsonObject.get("errno");
                        object = string;
                        if (jsonElement == null) return object;
                        object = string;
                    }
                    catch (Exception exception) {
                        return string;
                    }
                    if (jsonElement.getAsInt() != 0) return object;
                    object = jsonObject.get("extra");
                    if (object == null) break block15;
                    object = object.getAsJsonObject();
                    if (object == null) break block15;
                    object = object.get("list");
                    if (object == null) break block15;
                    object = object.getAsJsonArray();
                    if (object == null) break block15;
                    object = object.get(0);
                    if (object == null) break block15;
                    object = object.getAsJsonObject();
                    if (object == null) break block15;
                    object = object.get("to");
                    if (object == null) break block15;
                    String string5 = object.getAsString();
                    object = string5;
                    if (string5 != null) break block16;
                }
                object = "";
            }
            if (((String)object).length() != 0) break block17;
            return "";
        }
        String string6 = URLEncoder.encode((String)object, "UTF-8");
        object = new StringBuilder();
        ((StringBuilder)object).append((String)((Object)hashMap));
        ((StringBuilder)object).append("/api/mediainfo?type=M3U8_FLV_264_480&path=");
        ((StringBuilder)object).append(string6);
        ((StringBuilder)object).append("&clienttype=80&origin=dlna");
        String string7 = ((StringBuilder)object).toString();
        object = new HashMap();
        ((HashMap)object).put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
        ((HashMap)object).put("Cookie", i.k());
        hashMap = new HashMap();
        JsonElement jsonElement = C.R(A.o(string7, hashMap, (Map)object)).get("info");
        object = string;
        if (jsonElement == null) return object;
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        object = string;
        if (jsonObject == null) return object;
        JsonElement jsonElement2 = jsonObject.get("dlink");
        object = string;
        if (jsonElement2 == null) return object;
        object = jsonElement2.getAsString();
        if (object != null) return object;
        return string;
    }

    public static void c(JsonObject object, String object2, String object3, Map object4, ArrayList arrayList, ArrayList arrayList2) {
        Object object5;
        String string;
        long l2 = object.get("size").getAsLong();
        if (l2 <= 0L) {
            string = "0 B";
        } else {
            double d2 = l2;
            int n2 = (int)(Math.log10(d2) / Math.log10(1024.0));
            double d3 = Math.pow(1024.0, n2);
            Double.isNaN(d2);
            string = String.format("%.1f %s", Arrays.copyOf(new Object[]{d2 / d3, (new String[]{"B", "KB", "MB", "GB", "TB"})[n2]}, 2));
        }
        Object object6 = object5 = object.get("server_filename");
        if (object5 == null) {
            object6 = "";
        }
        object5 = v.U(new b("uk", object2), new b("shareid", object3), new b("fid", object.get("fs_id")), new b("randsk", object4.get("randsk")), new b("pname", object6), new b("qtype", "original"));
        object = v.U(new b("uk", object2), new b("shareid", object3), new b("fid", object.get("fs_id")), new b("randsk", object4.get("randsk")), new b("pname", object6), new b("qtype", "direct"));
        object3 = C.Z(object5);
        com.github.catvod.spider.merge.mI.i.d(object3, "toJson(...)");
        object2 = com.github.catvod.spider.merge.xc.r0.a.a;
        object3 = ((String)object3).getBytes((Charset)object2);
        com.github.catvod.spider.merge.mI.i.d(object3, "getBytes(...)");
        object3 = H.c((byte[])object3);
        object4 = new StringBuilder("[");
        ((StringBuilder)object4).append(string);
        ((StringBuilder)object4).append("]");
        ((StringBuilder)object4).append(object6);
        ((StringBuilder)object4).append("$");
        ((StringBuilder)object4).append((String)object3);
        arrayList.add(((StringBuilder)object4).toString());
        object = C.Z(object);
        com.github.catvod.spider.merge.mI.i.d(object, "toJson(...)");
        object = object.getBytes((Charset)object2);
        com.github.catvod.spider.merge.mI.i.d(object, "getBytes(...)");
        object = H.c((byte[])object);
        object2 = new StringBuilder("[");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("]");
        ((StringBuilder)object2).append(object6);
        ((StringBuilder)object2).append("$");
        ((StringBuilder)object2).append((String)object);
        arrayList2.add(((StringBuilder)object2).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d() {
        HashMap<String, String> hashMap = d;
        try {
            LinkedHashMap linkedHashMap = v.X(b);
            linkedHashMap.put("Cookie", i.k());
            Object object = new StringBuilder();
            ((StringBuilder)object).append((String)((Object)hashMap));
            ((StringBuilder)object).append("/api/list");
            object = ((StringBuilder)object).toString();
            Object object2 = c;
            Object object3 = new StringBuilder("/");
            ((StringBuilder)object3).append((String)object2);
            object3 = ((StringBuilder)object3).toString();
            object2 = new b("dir", object3);
            b b2 = new b("order", "name");
            b b3 = new b("desc", "0");
            Object object4 = new b("showempty", "0");
            object3 = new b("web", "1");
            b b4 = new b("app_id", "250528");
            object = C.R(A.o((String)object, v.U(new b[]{object2, b2, b3, object4, object3, b4}), linkedHashMap));
            object2 = object.get("errno");
            if (object2 == null) return;
            if (object2.getAsInt() != 0) return;
            if ((object = object.get("list")) == null) return;
            object2 = object.getAsJsonArray();
            if (object2 == null) {
                return;
            }
            if (object2.size() == 0) {
                return;
            }
            object = new ArrayList();
            object2 = object2.iterator();
            com.github.catvod.spider.merge.mI.i.d(object2, "iterator(...)");
            while (object2.hasNext()) {
                object3 = ((JsonElement)object2.next()).getAsJsonObject().get("path");
                if (object3 == null || (object4 = object3.getAsString()) == null) continue;
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("\"");
                ((StringBuilder)object3).append((String)object4);
                ((StringBuilder)object3).append("\"");
                ((ArrayList)object).add(((StringBuilder)object3).toString());
            }
            if (((ArrayList)object).isEmpty()) {
                return;
            }
            object3 = i.j();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)((Object)hashMap));
            ((StringBuilder)object2).append("/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=");
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            hashMap = new HashMap<String, String>();
            object = com.github.catvod.spider.merge.xc.d0.i.K(object, ",", null, null, null, 62);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("[");
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append("]");
            hashMap.put("filelist", ((StringBuilder)object3).toString());
            A.l((String)object2, hashMap, linkedHashMap);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e() {
        Exception exception2;
        block8: {
            Object object;
            Object object2;
            CharSequence charSequence;
            LinkedHashMap linkedHashMap;
            Object object3;
            block7: {
                block6: {
                    object3 = d;
                    if (i.k().length() == 0) {
                        return;
                    }
                    linkedHashMap = v.X(b);
                    linkedHashMap.put("Cookie", i.k());
                    try {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append((String)object3);
                        ((StringBuilder)charSequence).append("/api/list");
                        charSequence = ((StringBuilder)charSequence).toString();
                        b b2 = new b("dir", "/");
                        object2 = new b("order", "name");
                        b b3 = new b("desc", "0");
                        object = new b("showempty", "0");
                        b b4 = new b("web", "1");
                        b b5 = new b("app_id", "250528");
                        charSequence = C.R(A.o((String)charSequence, v.U(new b[]{b2, object2, b3, object, b4, b5}), linkedHashMap));
                        if (charSequence.get("errno").getAsInt() != 0) {
                            return;
                        }
                        charSequence = charSequence.get("list").getAsJsonArray();
                        com.github.catvod.spider.merge.mI.i.d(charSequence, "getAsJsonArray(...)");
                        object2 = charSequence.iterator();
                        do {
                            boolean bl = object2.hasNext();
                            object = c;
                            if (!bl) break block6;
                        } while ((b5 = (JsonElement)(charSequence = object2.next())).getAsJsonObject().get("isdir").getAsInt() != 1 || !com.github.catvod.spider.merge.mI.i.a(b5.getAsJsonObject().get("server_filename").getAsString(), object));
                        break block7;
                    }
                    catch (Exception exception2) {
                        break block8;
                    }
                }
                charSequence = null;
            }
            charSequence = (JsonElement)charSequence;
            if (charSequence != null) {
                charSequence.getAsJsonObject().get("fs_id").getAsLong();
                return;
            }
            object2 = i.j();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append("/api/create?a=commit&bdstoken=");
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("&clienttype=0&app_id=250528&web=1&dp-logid=73131200762376420075");
            charSequence = ((StringBuilder)charSequence).toString();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("/");
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            object3 = new b("path", object);
            object = new b("isdir", "1");
            object2 = new b("block_list", "[]");
            C.R(A.l((String)charSequence, v.U(new b[]{object3, object, object2}), linkedHashMap).b()).get("fs_id").getAsLong();
            return;
        }
        m.o("[BD] \u521b\u5efa\u4fdd\u5b58\u76ee\u5f55\u5931\u8d25: ", exception2.getMessage());
    }

    public static void f() {
        if (i.k().length() == 0) {
            Object object = g.a;
            g.a.g();
            while (true) {
                object = g.a;
                g.a.getClass();
                String string = com.github.catvod.spider.merge.xc.F.a.b();
                object = string;
                if (string == null) {
                    object = "";
                }
                if (((String)object).length() != 0) break;
                Thread.sleep(250L);
            }
        }
    }

    public static String g(String object) {
        String string = Pattern.quote("BDUSS");
        com.github.catvod.spider.merge.mI.i.d(string, "quote(...)");
        Object object2 = new StringBuilder("(?:^|;\\s*)");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("=([^;]+)");
        object2 = ((StringBuilder)object2).toString();
        com.github.catvod.spider.merge.mI.i.e(object2, "pattern");
        object2 = Pattern.compile((String)object2);
        com.github.catvod.spider.merge.mI.i.d(object2, "compile(...)");
        object2 = ((Pattern)object2).matcher((CharSequence)object);
        com.github.catvod.spider.merge.mI.i.d(object2, "matcher(...)");
        object = !((Matcher)object2).find(0) ? null : new D((Matcher)object2, (CharSequence)object);
        if (object != null) {
            if ((d)((D)object).b == null) {
                ((D)object).b = new d((D)object);
            }
            object = (d)((D)object).b;
            com.github.catvod.spider.merge.mI.i.b(object);
            object = (String)((d)object).get(1);
        } else {
            object = "";
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    public static b h(Map var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 22[TRYBLOCK] [22 : 397->407)] java.lang.Exception
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
    public static String i() {
        Exception exception2;
        block6: {
            JsonObject jsonObject;
            Object var2_3;
            LinkedHashMap linkedHashMap = a;
            if (linkedHashMap.get("uid") != null) {
                return (String)linkedHashMap.get("uid");
            }
            Object object = v.X(b);
            object.put("Cookie", i.k());
            try {
                object = C.R(A.o("https://mbd.baidu.com/userx/v1/info/get?appname=baiduboxapp&fields=%20%20%20%20%20%20%20%20%5B%22bg_image%22,%22member%22,%22uid%22,%22avatar%22,%20%22avatar_member%22%5D&client&clientfrom&lang=zh-cn&tpl&ttt", r.a, (Map)object)).get("data").getAsJsonObject();
                var2_3 = null;
                jsonObject = object != null && (object = object.get("fields")) != null ? object.getAsJsonObject() : null;
            }
            catch (Exception exception2) {
                break block6;
            }
            object = var2_3;
            if (jsonObject != null) {
                jsonObject = jsonObject.get("uid");
                object = var2_3;
                if (jsonObject != null) {
                    object = jsonObject.getAsString();
                }
            }
            if (object != null) {
                linkedHashMap.put("uid", object);
                return object;
            }
            object = new Exception("Failed to retrieve UID from Baidu Drive.");
            throw object;
        }
        m.o("[BD] \u83b7\u53d6\u7528\u6237ID\u5931\u8d25: ", exception2.getMessage());
        return "";
    }

    public static String j() {
        LinkedHashMap linkedHashMap = a;
        if (linkedHashMap.get("bdstoken") != null) {
            Object v2 = linkedHashMap.get("bdstoken");
            com.github.catvod.spider.merge.mI.i.b(v2);
            return (String)v2;
        }
        Object object = v.X(b);
        object.put("Cookie", i.k());
        object = C.R(A.o(m.h(new StringBuilder(), d, "/api/gettemplatevariable?clienttype=0&app_id=250528&web=1&fields=[\"bdstoken\",\"token\",\"uk\",\"isdocuser\",\"servertime\"]"), r.a, (Map)object)).get("result");
        object = object != null && (object = object.getAsJsonObject()) != null && (object = object.get("bdstoken")) != null ? object.getAsString() : null;
        Object object2 = object == null ? "" : object;
        linkedHashMap.put("bdstoken", object2);
        object2 = object;
        if (object == null) {
            object2 = "";
        }
        return object2;
    }

    public static String k() {
        Object object = g.a;
        g.a.getClass();
        String string = com.github.catvod.spider.merge.xc.F.a.b();
        object = string;
        if (string == null) {
            object = "";
        }
        return object;
    }

    public static JsonObject l(Map object) {
        Object object2;
        Serializable serializable;
        Object object3;
        if (object.containsKey("dir")) {
            object3 = object.get("uk");
            com.github.catvod.spider.merge.mI.i.b(object3);
            object3 = new b("uk", object3.toString());
            serializable = object.get("shareid");
            com.github.catvod.spider.merge.mI.i.b(serializable);
            object2 = new b("shareid", serializable.toString());
            b b2 = new b("page", String.valueOf(object.get("page")));
            serializable = new b("num", "9999");
            Object v2 = object.get("dir");
            com.github.catvod.spider.merge.mI.i.b(v2);
            object3 = v.U(new b[]{object3, object2, b2, serializable, new b("dir", URLEncoder.encode(v2.toString(), "UTF-8")), new b("desc", "0"), new b("order", "name")});
        } else {
            object3 = new b("page", String.valueOf(object.get("page")));
            serializable = new b("num", "9999");
            object2 = object.get("surl");
            com.github.catvod.spider.merge.mI.i.b(object2);
            object3 = v.U(new b[]{object3, serializable, new b("shorturl", object2.toString()), new b("root", "1"), new b("desc", "0"), new b("order", "name")});
        }
        serializable = v.X(b);
        object = object.get("randsk");
        object2 = new StringBuilder("BDCLND=");
        ((StringBuilder)object2).append(object);
        serializable.put("Cookie", ((StringBuilder)object2).toString());
        object = new StringBuilder();
        ((StringBuilder)object).append(d);
        ((StringBuilder)object).append("/share/list");
        return C.R(A.o(((StringBuilder)object).toString(), (Map)object3, (Map)((Object)serializable)));
    }

    public static Map m(Map object) {
        Object object2;
        String string;
        Object object3;
        Object object4;
        block7: {
            block4: {
                block5: {
                    block6: {
                        object4 = new b("t", String.valueOf(System.currentTimeMillis()));
                        object3 = (String)object.get("surl");
                        string = "";
                        object2 = object3;
                        if (object3 == null) {
                            object2 = "";
                        }
                        object4 = v.U(new b[]{object4, new b("surl", object2)});
                        object2 = object3 = (String)object.get("pwd");
                        if (object3 == null) {
                            object2 = "";
                        }
                        object2 = v.T(new b("pwd", object2));
                        object3 = object4.get("t");
                        object4 = object4.get("surl");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(d);
                        stringBuilder.append("/share/verify?t=");
                        stringBuilder.append(object3);
                        stringBuilder.append("&surl=");
                        stringBuilder.append(object4);
                        object4 = C.R(A.l(stringBuilder.toString(), (Map)object2, b).b()).getAsJsonObject().get("randsk").getAsString();
                        if (object4 == null) {
                            return v.T(new b("error", "\u83b7\u53d6randsk\u5931\u8d25"));
                        }
                        object2 = (String)object.get("url");
                        if (object2 == null) break block4;
                        if ((object2 = e.Y((CharSequence)object2, new String[]{"s/"}, 0, 6)).isEmpty()) break block5;
                        if ((object2 = (String)object2.get(object2.size() - 1)) == null) break block4;
                        if ((object2 = e.Y((CharSequence)object2, new String[]{"?"}, 0, 6)).isEmpty()) break block6;
                        object2 = object3 = (String)object2.get(0);
                        if (object3 != null) break block7;
                        break block4;
                    }
                    throw new NoSuchElementException("List is empty.");
                }
                throw new NoSuchElementException("List is empty.");
            }
            object2 = "";
        }
        object2 = new b("yurl", object2);
        object3 = new b("randsk", object4);
        if ((object = (String)object.get("surl")) == null) {
            object = string;
        }
        return v.U(new b[]{object2, object3, new b("surl", object)});
    }

    public static k n(String string) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        com.github.catvod.spider.merge.mI.i.e(string, "shareUrl");
        Object object5 = com.github.catvod.spider.merge.xc.a.a.o(string);
        if (object5.isEmpty()) {
            object5 = q.a;
            object5 = new b(object5, object5);
        } else {
            object4 = new ArrayList(com.github.catvod.spider.merge.xc.d0.k.H((Iterable)object5));
            object3 = object5.iterator();
            while (object3.hasNext()) {
                object2 = (String)object3.next();
                object5 = null;
                try {
                    object2 = i.p(object2);
                    if (!object2.containsKey("error") && !(object2 = i.m((Map)object2)).containsKey("error")) {
                        object5 = object2 = i.h((Map)object2);
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                ((ArrayList)object4).add(object5);
            }
            object5 = new ArrayList();
            object2 = new ArrayList();
            object4 = ((ArrayList)object4).iterator();
            while (object4.hasNext()) {
                object = (b)object4.next();
                if (object == null) continue;
                object3 = (List)((b)object).a;
                object = (List)((b)object).b;
                ((ArrayList)object5).add("\u767e\u5ea6\u4e91\u76d8");
                ((ArrayList)object2).add(com.github.catvod.spider.merge.xc.d0.i.K((Iterable)object3, "#", null, null, null, 62));
                if (!(object.isEmpty() ^ true)) continue;
                ((ArrayList)object5).add("\u767e\u5ea6\u65e0\u9650");
                ((ArrayList)object2).add(com.github.catvod.spider.merge.xc.d0.i.K(object, "#", null, null, null, 62));
            }
            object5 = new b(object5, object2);
        }
        object2 = (List)((b)object5).a;
        List list = (List)((b)object5).b;
        D d2 = new D();
        int n2 = object2.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            object3 = new ArrayList();
            object = e.Y((CharSequence)list.get(i2), new String[]{"#"}, 0, 6).iterator();
            while (object.hasNext()) {
                object5 = e.Y((String)object.next(), new String[]{"$"}, 0, 6);
                object4 = new j();
                ((j)object4).a = (String)object5.get(0);
                ((j)object4).b = (String)object5.get(1);
                ((ArrayList)object3).add(object4);
            }
            d2.a((String)object2.get(i2), (ArrayList)object3);
        }
        object2 = d2.d();
        object5 = new k();
        ((k)object5).l(string);
        ((k)object5).n("");
        ((k)object5).s("");
        ((k)object5).m("");
        ((k)object5).j("");
        ((k)object5).o(((B)object2).b);
        ((k)object5).p(((B)object2).c);
        return object5;
    }

    public static boolean o(String string) {
        List list = H.b;
        int n2 = e.U(".", string, 6);
        if (n2 != -1) {
            string = string.substring(1 + n2, string.length());
            com.github.catvod.spider.merge.mI.i.d(string, "substring(...)");
        }
        Locale locale = Locale.ROOT;
        com.github.catvod.spider.merge.mI.i.d(locale, "ROOT");
        string = string.toLowerCase(locale);
        com.github.catvod.spider.merge.mI.i.d(string, "toLowerCase(...)");
        return list.contains(string);
    }

    public static Map p(String object) {
        b b2;
        Object object2;
        Object object3;
        String string;
        Object object4;
        block11: {
            block10: {
                int n2;
                object4 = e.M((CharSequence)object, "\u63d0\u53d6\u7801", false) ? com.github.catvod.spider.merge.xc.r0.m.K((String)object, "\u63d0\u53d6\u7801:", "?pwd=") : object;
                boolean bl = e.M((CharSequence)object, "/share/", false);
                string = "";
                if (!bl) {
                    object4 = object3 = A.f((String)object, b);
                    if (object3 == null) {
                        object4 = "";
                    }
                }
                object4 = e.Z(e.c0(e.a0((String)object4, "?", (String)object4), '#'), new char[]{'&'}, 0, 6);
                int n3 = n2 = v.S(com.github.catvod.spider.merge.xc.d0.k.H((Iterable)object4));
                if (n2 < 16) {
                    n3 = 16;
                }
                object2 = new LinkedHashMap<String, List>(n3);
                object3 = object4.iterator();
                while (object3.hasNext()) {
                    object4 = e.Z((String)object3.next(), new char[]{'='}, 2, 2);
                    object2.put((String)object4.get(0), com.github.catvod.spider.merge.xc.a.a.o((String)object4.get(1)));
                }
                object4 = object;
                if (e.M((CharSequence)object, "/share/", false)) {
                    object4 = com.github.catvod.spider.merge.xc.r0.m.K((String)object, "share/init?surl=", "s/1");
                }
                b2 = new b("url", object4);
                object = (List)((LinkedHashMap)object2).get("surl");
                object4 = null;
                if (object == null) break block10;
                object = object.isEmpty() ? null : object.get(0);
                object = object3 = (String)object;
                if (object3 != null) break block11;
            }
            object = "";
        }
        object3 = new b("surl", object);
        object2 = (List)((LinkedHashMap)object2).get("pwd");
        object = string;
        if (object2 != null) {
            object = object2.isEmpty() ? object4 : object2.get(0);
            if ((object = (String)object) == null) {
                object = string;
            }
        }
        return v.U(new b[]{b2, object3, new b("pwd", object)});
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String q(JsonObject object, String object2) {
        Exception exception4;
        block12: {
            Object object3;
            Object object4;
            block10: {
                block9: {
                    com.github.catvod.spider.merge.mI.i.e(object2, "flag");
                    try {
                        object4 = object.get("qtype");
                        if (object4 == null) break block9;
                        object4 = object3 = object4.getAsString();
                        if (object3 != null) break block10;
                    }
                    catch (Exception exception2) {}
                }
                object4 = "";
            }
            if (!object4.equals("direct") && !e.M((CharSequence)object2, "\u767e\u5ea6\u65e0\u9650", false)) {
                Exception exception32;
                block11: {
                    try {
                        i.f();
                        object2 = i.b((JsonObject)object);
                        if (((String)object2).length() == 0) {
                            SpiderDebug.log((String)"[BD\u539f] \u83b7\u53d6\u4e0b\u8f7d\u94fe\u63a5\u5931\u8d25");
                            object = new com.github.catvod.spider.merge.MP.g();
                            ((com.github.catvod.spider.merge.MP.g)object).w("");
                            object = ((com.github.catvod.spider.merge.MP.g)object).toString();
                            com.github.catvod.spider.merge.mI.i.d(object, "string(...)");
                            return object;
                        }
                    }
                    catch (Exception exception32) {
                        break block11;
                    }
                    object4 = new b("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
                    object = i.k();
                    object3 = new b("Cookie", object);
                    object = com.github.catvod.spider.merge.KT.B.y((String)object2, v.U(new b[]{object4, object3}), com.github.catvod.spider.merge.KT.B.p("baidu"), "baidu");
                    com.github.catvod.spider.merge.mI.i.d(object, "play(...)");
                    object2 = new com.github.catvod.spider.merge.MP.g();
                    ((com.github.catvod.spider.merge.MP.g)object2).w((String)object);
                    ((com.github.catvod.spider.merge.MP.g)object2).j();
                    return ((com.github.catvod.spider.merge.MP.g)object2).toString();
                }
                object2 = exception32.getMessage();
                object = new StringBuilder("[BD\u539f] \u64ad\u653e\u5931\u8d25: ");
                ((StringBuilder)object).append((String)object2);
                SpiderDebug.log((String)((StringBuilder)object).toString());
                object = new com.github.catvod.spider.merge.MP.g();
                ((com.github.catvod.spider.merge.MP.g)object).w("");
                return ((com.github.catvod.spider.merge.MP.g)object).toString();
            }
            try {
                i.f();
                object2 = i.a((JsonObject)object);
                if (((String)object2).length() == 0) {
                    SpiderDebug.log((String)"[BD\u65e0\u9650] \u83b7\u53d6\u514d\u8f6c\u5b58\u64ad\u653e\u94fe\u63a5\u5931\u8d25");
                    object = new com.github.catvod.spider.merge.MP.g();
                    ((com.github.catvod.spider.merge.MP.g)object).w("");
                    object = ((com.github.catvod.spider.merge.MP.g)object).toString();
                    com.github.catvod.spider.merge.mI.i.d(object, "string(...)");
                    return object;
                }
            }
            catch (Exception exception4) {
                break block12;
            }
            object4 = i.k();
            object = object.get("randsk").getAsString();
            com.github.catvod.spider.merge.mI.i.d(object, "getAsString(...)");
            object4 = i.r((String)object4, (String)object);
            object = new b("User-Agent", "netdisk;P2SP;2.2.91.136;android-android;");
            b b2 = new b("Referer", "https://pan.baidu.com");
            object3 = new b("Cookie", object4);
            object4 = v.U(new b[]{object, b2, object3});
            object = new com.github.catvod.spider.merge.MP.g();
            object2 = com.github.catvod.spider.merge.KT.B.y((String)object2, (Map)object4, com.github.catvod.spider.merge.KT.B.p("baidu"), "baidu");
            com.github.catvod.spider.merge.mI.i.d(object2, "play(...)");
            ((com.github.catvod.spider.merge.MP.g)object).w((String)object2);
            ((com.github.catvod.spider.merge.MP.g)object).j();
            return ((com.github.catvod.spider.merge.MP.g)object).toString();
        }
        object2 = exception4.getMessage();
        object = new StringBuilder("[BD\u65e0\u9650] \u64ad\u653e\u5931\u8d25: ");
        ((StringBuilder)object).append((String)object2);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object = new com.github.catvod.spider.merge.MP.g();
        ((com.github.catvod.spider.merge.MP.g)object).w("");
        return ((com.github.catvod.spider.merge.MP.g)object).toString();
    }

    public static String r(String object, String string) {
        object = e.Y((CharSequence)object, new String[]{";"}, 0, 6);
        Object object2 = new ArrayList<String>(com.github.catvod.spider.merge.xc.d0.k.H((Iterable)object));
        object = object.iterator();
        while (object.hasNext()) {
            ((ArrayList)object2).add(((Object)e.f0((String)object.next())).toString());
        }
        object = new ArrayList();
        Iterator iterator = ((ArrayList)object2).iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            object2 = (String)e2;
            if (((String)object2).length() <= 0 || com.github.catvod.spider.merge.xc.r0.m.L((String)object2, "BDCLND=")) continue;
            ((ArrayList)object).add(e2);
        }
        object = ((String)(object = com.github.catvod.spider.merge.xc.d0.i.K((Iterable)object, "; ", null, null, null, 62))).length() == 0 ? "BDCLND=".concat(string) : m.g((String)object, "; BDCLND=", string);
        return object;
    }
}

