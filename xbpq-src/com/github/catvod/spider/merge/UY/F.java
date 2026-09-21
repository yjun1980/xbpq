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
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.W;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.Q.a;
import com.github.catvod.spider.merge.xc.z0.b;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class F {
    public final Serializable a;
    public final Serializable b;
    public final Serializable c;
    public final Serializable d;

    public F() {
        HashMap<String, String> hashMap;
        this.a = Pattern.compile("https://yun\\.139\\.com/shareweb/#/w/i/([^&]+)");
        this.c = hashMap = new HashMap<String, String>();
        this.d = new HashMap();
        this.b = new SecretKeySpec("PVGDwmcvfs1uV3d1".getBytes(Charset.defaultCharset()), "AES");
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        hashMap.put("Content-Type", "application/json");
        hashMap.put("hcy-cool-flag", "1");
        hashMap.put("x-deviceinfo", "||3|12.27.0|chrome|131.0.0.0|5c7c68368f048245e1ce47f1c0f8f2d0||windows 10|1536X695|zh-CN|||");
    }

    public F(String string, String string2, String string3, String string4) {
        this.a = string;
        this.b = string2;
        if (string3 == null) {
            string3 = "";
        }
        this.c = string3;
        if (string4 == null) {
            string4 = "";
        }
        this.d = string4;
    }

    public static String f() {
        String string = com.github.catvod.spider.merge.xc.Q.a.b().a().a();
        com.github.catvod.spider.merge.Bk.m.o("auth:", string);
        return string;
    }

    public static HashMap g() {
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.k("X-Deviceinfo", "||3|12.27.0|safari|13.1.2|1||macos 10.15.6|1324X381|zh-cn|||", "hcy-cool-flag", "1");
        StringBuilder stringBuilder = new StringBuilder("Basic ");
        stringBuilder.append(F.f());
        hashMap.put("Authorization", stringBuilder.toString());
        hashMap.put("Content-Type", "application/json");
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String h(String object4, String[] object2) {
        Object object3 = object2[0];
        Serializable serializable = Integer.valueOf(1);
        HashMap<String, List<Object>> hashMap = object2[1];
        boolean bl = ((String)object4).contains("\u539f\u753b");
        object2 = null;
        String[] stringArray = "";
        if (bl) {
            Serializable serializable2;
            F f2;
            block8: {
                f2 = W.a;
                f2.getClass();
                F.f();
                try {
                    object4 = com.github.catvod.spider.merge.xc.A0.c.f(H.b(F.f()), ":");
                    object4 = object4 != null && ((Object)object4).length > 1 ? object4[1] : "";
                }
                catch (Exception exception) {}
                serializable2 = new StringBuilder("phone:");
                ((StringBuilder)serializable2).append((String)object4);
                SpiderDebug.log((String)((StringBuilder)serializable2).toString());
                break block8;
                com.github.catvod.spider.merge.Bk.m.m(exception, new StringBuilder("getPhone error: "));
                object4 = stringArray;
            }
            stringArray = new HashMap();
            serializable2 = new HashMap();
            HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
            ((HashMap)serializable2).put("linkID", hashMap);
            ((HashMap)serializable2).put("account", object4);
            hashMap = new HashMap<String, List<Object>>();
            hashMap.put("item", Collections.singletonList(object3));
            ((HashMap)serializable2).put("coIDLst", hashMap);
            hashMap2.put("account", object4);
            hashMap2.put("accountType", serializable);
            stringArray.put("dlFromOutLinkReqV3", serializable2);
            stringArray.put("commonAccountInfo", hashMap2);
            object4 = F.g();
            stringArray = C.R(f2.a(A.k("https://share-kd-njs.yun.139.com/yun-share/richlifeApp/devapp/IOutLink/dlFromOutLinkV3", f2.b(C.Z(stringArray)), (Map)object4).b()));
            object4 = object2;
            if (stringArray.get("resultCode").getAsInt() == 0) {
                object4 = stringArray.getAsJsonObject("data").get("redrUrl").getAsString();
            }
            object4 = B.y((String)object4, new HashMap(), B.p("yidong"), "yidong");
        } else {
            block9: {
                object4 = W.a;
                object4.getClass();
                object2 = new HashMap();
                ((HashMap)object2).put("contentId", object3);
                ((HashMap)object2).put("linkID", hashMap);
                ((HashMap)object2).put("account", "");
                stringArray = new HashMap();
                stringArray.put("account", "");
                stringArray.put("accountType", serializable);
                serializable = new HashMap();
                ((HashMap)serializable).put("getContentInfoFromOutLinkReq", object2);
                ((HashMap)serializable).put("commonAccountInfo", stringArray);
                object2 = new HashMap();
                ((HashMap)object2).put("Accept-Encoding", "gzip, deflate, br, zstd");
                ((HashMap)object2).put("User-Agent", (String)((HashMap)((F)object4).c).get("User-Agent"));
                object2 = C.R(A.k("https://share-kd-njs.yun.139.com/yun-share/richlifeApp/devapp/IOutLink/getContentInfoFromOutLink", C.Z(serializable), (Map)object2).b()).getAsJsonObject("data").getAsJsonObject("contentInfo").get("presentURL").getAsString();
                for (Object object4 : A.o((String)object2, null, null).split("\n")) {
                    if (!((String)object4).contains("index.m3u8")) {
                        continue;
                    }
                    break block9;
                }
                object4 = object2;
            }
            object4 = com.github.catvod.spider.merge.Bk.m.h(new StringBuilder(), ((String)object2).split("playlist.m3u8")[0], (String)object4);
        }
        object2 = new g();
        ((g)object2).w((String)object4);
        ((g)object2).j();
        ((g)object2).g(F.g());
        return ((g)object2).toString();
    }

    public String a(String object) {
        byte[] byArray = com.github.catvod.spider.merge.xc.z0.a.d((String)object);
        object = Arrays.copyOfRange(byArray, 0, 16);
        byArray = Arrays.copyOfRange(byArray, 16, byArray.length);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, (Key)((SecretKeySpec)this.b), new IvParameterSpec((byte[])object));
        return new String(cipher.doFinal(byArray), Charset.defaultCharset());
    }

    public String b(String object) {
        long l2;
        block6: {
            block5: {
                Object object2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                Object object3 = new byte[16];
                new SecureRandom().nextBytes((byte[])object3);
                ((Cipher)object2).init(1, (Key)((SecretKeySpec)this.b), new IvParameterSpec((byte[])object3));
                object2 = ((Cipher)object2).doFinal(((String)object).getBytes(Charset.defaultCharset()));
                int n2 = ((Object)object2).length;
                int n3 = 16 + n2;
                object = new byte[n3];
                System.arraycopy(object3, 0, object, 0, 16);
                System.arraycopy(object2, 0, object, 16, ((Object)object2).length);
                if (n3 == 0) break block5;
                object2 = new com.github.catvod.spider.merge.xc.z0.a(0, com.github.catvod.spider.merge.xc.z0.c.e);
                long l3 = (long)((n2 + 18) / 3) * (long)4;
                n2 = ((com.github.catvod.spider.merge.xc.z0.c)object2).b;
                l2 = l3;
                if (n2 > 0) {
                    l2 = n2;
                    l2 = l3 + (l3 + l2 - 1L) / l2 * (long)((com.github.catvod.spider.merge.xc.z0.c)object2).c;
                }
                if (l2 > (long)Integer.MAX_VALUE) break block6;
                if (n3 != 0 && n3 != 0) {
                    object3 = new b();
                    ((com.github.catvod.spider.merge.xc.z0.a)object2).e((byte[])object, n3, (b)object3);
                    ((com.github.catvod.spider.merge.xc.z0.a)object2).e((byte[])object, -1, (b)object3);
                    n3 = object3.c - object3.d;
                    object = new byte[n3];
                    com.github.catvod.spider.merge.xc.z0.c.b((byte[])object, n3, (b)object3);
                }
            }
            return new String((byte[])object, m.y());
        }
        object = new StringBuilder("Input array too big, the output array would be bigger (");
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(") than the specified maximum size of 2147483647");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public List c(String object, String string) {
        Object object2;
        if (object == null) {
            return Collections.emptyList();
        }
        Object object3 = object;
        if (((String)object).startsWith("http")) {
            object3 = "root";
        }
        if (!(object2 = this.d((String)object3, string)).has("caLst")) {
            return Collections.emptyList();
        }
        object = new ArrayList();
        object3 = Pattern.compile("App|\u6d3b\u52a8\u4e2d\u5fc3|\u514d\u8d39|1T\u7a7a\u95f4|\u514d\u6d41");
        if (!(object2 = object2.get("caLst")).isJsonNull()) {
            object2 = object2.getAsJsonArray().iterator();
            while (object2.hasNext()) {
                Object object4 = ((JsonElement)object2.next()).getAsJsonObject();
                String string2 = object4.get("caName").getAsString();
                object4 = object4.get("path").getAsString();
                if (((Pattern)object3).matcher(string2).find()) continue;
                HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("name", string2);
                hashMap.put("path", (String)object4);
                ((ArrayList)object).add(hashMap);
                ((ArrayList)object).addAll(this.c((String)object4, string));
            }
        }
        return object;
    }

    public JsonObject d(String object, String object2) {
        if (!((String)object2).isEmpty()) {
            HashMap hashMap = (HashMap)this.d;
            String string = com.github.catvod.spider.merge.Bk.m.g((String)object2, "-", (String)object);
            if (hashMap.containsKey(string)) {
                return (JsonObject)hashMap.get(string);
            }
            object2 = com.github.catvod.spider.merge.Bk.m.k("account", "", "linkID", (String)object2);
            ((HashMap)object2).put("passwd", "");
            ((HashMap)object2).put("caSrt", 1);
            ((HashMap)object2).put("coSrt", 1);
            ((HashMap)object2).put("srtDr", 0);
            ((HashMap)object2).put("bNum", 1);
            ((HashMap)object2).put("pCaID", object);
            ((HashMap)object2).put("eNum", 200);
            object = new HashMap();
            ((HashMap)object).put("account", "");
            ((HashMap)object).put("accountType", 1);
            HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
            hashMap2.put("getOutLinkInfoReq", object2);
            hashMap2.put("commonAccountInfo", object);
            object = A.k("https://share-kd-njs.yun.139.com/yun-share/richlifeApp/devapp/IOutLink/getOutLinkInfoV6", this.b(C.Z(hashMap2)), (HashMap)this.c);
            if (!C.R(this.a(((X)object).b())).getAsJsonObject().get("data").isJsonNull()) {
                object = C.R(this.a(((X)object).b())).getAsJsonObject("data");
                hashMap.put(string, object);
                return object;
            }
            SpiderDebug.log((String)"\u8be5\u5206\u4eab\u5df2\u88ab\u53d6\u6d88\uff0c\u65e0\u6cd5\u8bbf\u95ee");
            A.m("\u8be5\u5206\u4eab\u5df2\u88ab\u53d6\u6d88\uff0c\u65e0\u6cd5\u8bbf\u95ee");
            throw new RuntimeException("\u8be5\u5206\u4eab\u5df2\u88ab\u53d6\u6d88\uff0c\u65e0\u6cd5\u8bbf\u95ee");
        }
        throw new IllegalStateException("linkID not initialized");
    }

    public ArrayList e(String object, String string) {
        block3: {
            Object object2;
            block2: {
                object2 = this.d((String)object, string);
                object = new ArrayList();
                if (!object2.has("coLst")) break block2;
                Iterator iterator = object2.getAsJsonArray("coLst").iterator();
                while (iterator.hasNext()) {
                    JsonObject jsonObject = ((JsonElement)iterator.next()).getAsJsonObject();
                    if (jsonObject.get("coType").getAsInt() != 3) continue;
                    object2 = new HashMap();
                    ((HashMap)object2).put("name", jsonObject.get("coName").getAsString());
                    ((HashMap)object2).put("contentId", jsonObject.get("coID").getAsString());
                    ((HashMap)object2).put("linkID", string);
                    ((HashMap)object2).put("path", jsonObject.get("path").getAsString());
                    ((ArrayList)object).add(object2);
                }
                break block3;
            }
            if (!object2.has("caLst")) break block3;
            object2 = object2.getAsJsonArray("caLst").iterator();
            while (object2.hasNext()) {
                ((ArrayList)object).addAll(this.e(((JsonElement)object2.next()).getAsJsonObject().get("path").getAsString(), string));
            }
        }
        return object;
    }
}

