/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.MediaType
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.AppDrama$ProtoReader;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.MP.b;
import com.github.catvod.spider.merge.MP.c;
import com.github.catvod.spider.merge.MP.d;
import com.github.catvod.spider.merge.MP.g;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppDrama
extends Spider {
    public static final Pattern m = Pattern.compile("(?i).*\\.(mp4|m3u8|flv|mkv|avi|ts|mov|mpd|m4a|wmv)(\\?.*)?$");
    public final SecureRandom a = new SecureRandom();
    public Context b;
    public JSONObject c;
    public String d;
    public String e;
    public String f = "";
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public static void a(ArrayList arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Object object = jSONObject.optJSONObject("coverImage");
        object = object == null ? jSONObject.optString("cover") : object.optString("path", object.optString("thumbnailPath"));
        arrayList.add(new k(jSONObject.optString("id"), jSONObject.optString("name"), (String)object, jSONObject.optString("remark")));
    }

    public static String b(String string, String string2) {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(string2.getBytes(com.github.catvod.spider.merge.UY.m.m()), "AES"));
        return new String(cipher.doFinal(Base64.decode((String)string, (int)0)), com.github.catvod.spider.merge.UY.m.m());
    }

    public static String c(String object, String object2, String string, String string2) {
        Object object3 = new StringBuilder("AES/");
        ((StringBuilder)object3).append(string);
        ((StringBuilder)object3).append("/PKCS7Padding");
        object3 = Cipher.getInstance(((StringBuilder)object3).toString());
        object2 = new SecretKeySpec(((String)object2).getBytes(com.github.catvod.spider.merge.UY.m.m()), "AES");
        if ("CBC".equals(string)) {
            ((Cipher)object3).init(1, (Key)object2, new IvParameterSpec(string2.getBytes(com.github.catvod.spider.merge.UY.m.m())));
        } else {
            ((Cipher)object3).init(1, (Key)object2);
        }
        object = ((Cipher)object3).doFinal(((String)object).getBytes(com.github.catvod.spider.merge.UY.m.m()));
        if (!"CBC".equals(string)) {
            return Base64.encodeToString((byte[])object, (int)2);
        }
        object2 = new StringBuilder();
        int n2 = ((Object)object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ((StringBuilder)object2).append(String.format("%02x", object[i2] & 0xFF));
        }
        return ((StringBuilder)object2).toString();
    }

    public static byte[] d(byte[] byArray) {
        Object object = new AppDrama$ProtoReader(byArray);
        byArray = new byte[]{};
        long l2 = 0L;
        String string = "";
        while (((AppDrama$ProtoReader)object).b()) {
            int n2 = ((AppDrama$ProtoReader)object).e;
            if (n2 == 1) {
                n2 = ((AppDrama$ProtoReader)object).b;
                ((AppDrama$ProtoReader)object).b = ((AppDrama$ProtoReader)object).c;
                l2 = ((AppDrama$ProtoReader)object).c();
                ((AppDrama$ProtoReader)object).b = n2;
                continue;
            }
            if (n2 == 2) {
                string = ((AppDrama$ProtoReader)object).d();
                continue;
            }
            if (n2 != 3) continue;
            byArray = ((AppDrama$ProtoReader)object).a();
        }
        if (l2 != 200L && !TextUtils.isEmpty((CharSequence)string)) {
            object = new StringBuilder("[AppDrama] api code=");
            ((StringBuilder)object).append(l2);
            ((StringBuilder)object).append(", msg=");
            ((StringBuilder)object).append(string);
            SpiderDebug.log((String)((StringBuilder)object).toString());
        }
        return byArray;
    }

    public static byte[] f(int n2, String object) {
        object = ((String)object).getBytes(com.github.catvod.spider.merge.UY.m.m());
        return AppDrama.m(AppDrama.u(n2 << 3 | 2), AppDrama.u(((Object)object).length), (byte[])object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String g(String string, HashMap object) {
        Throwable throwable2;
        block3: {
            string = new Request.Builder().url(string);
            for (Map.Entry entry : ((HashMap)object).entrySet()) {
                string.addHeader((String)entry.getKey(), (String)entry.getValue());
            }
            string = string.build();
            object = A.a().newCall((Request)string).execute();
            try {
                string = object.body() == null ? "" : object.body().string();
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object.close();
            return string;
        }
        object.close();
        throw throwable2;
    }

    public static String i(byte[] object) {
        Object object2 = new AppDrama$ProtoReader((byte[])object);
        object = "";
        String string = "";
        while (((AppDrama$ProtoReader)object2).b()) {
            int n2 = ((AppDrama$ProtoReader)object2).e;
            if (n2 == 1) {
                string = ((AppDrama$ProtoReader)object2).d();
                continue;
            }
            if (n2 != 2) continue;
            object = ((AppDrama$ProtoReader)object2).d();
        }
        object2 = object;
        if (TextUtils.isEmpty((CharSequence)object)) {
            object2 = string;
        }
        return object2;
    }

    public static ArrayList j(byte[] object) {
        ArrayList<k> arrayList = new ArrayList<k>();
        AppDrama$ProtoReader appDrama$ProtoReader = new AppDrama$ProtoReader(AppDrama.d(object));
        while (appDrama$ProtoReader.b()) {
            String string;
            if (appDrama$ProtoReader.e != 1) continue;
            AppDrama$ProtoReader appDrama$ProtoReader2 = new AppDrama$ProtoReader(appDrama$ProtoReader.a());
            object = "";
            String string2 = "";
            String string3 = string = "";
            while (appDrama$ProtoReader2.b()) {
                int n2 = appDrama$ProtoReader2.e;
                if (n2 == 2) {
                    string = AppDrama.i(appDrama$ProtoReader2.a());
                    continue;
                }
                if (n2 == 3) {
                    n2 = appDrama$ProtoReader2.b;
                    appDrama$ProtoReader2.b = appDrama$ProtoReader2.c;
                    long l2 = appDrama$ProtoReader2.c();
                    appDrama$ProtoReader2.b = n2;
                    object = String.valueOf(l2);
                    continue;
                }
                if (n2 == 5) {
                    string2 = appDrama$ProtoReader2.d();
                    continue;
                }
                if (n2 != 13) continue;
                string3 = appDrama$ProtoReader2.d();
            }
            arrayList.add(new k((String)object, string2, string, string3));
        }
        return arrayList;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList k(String iterator) {
        ArrayList<d> arrayList = new ArrayList<d>();
        if (TextUtils.isEmpty(iterator)) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(iterator);
            iterator = Arrays.asList("class", "lang", "area", "year", "extend_sort").iterator();
            while (iterator.hasNext()) {
                String string = iterator.next();
                String string2 = jSONObject.optString(string);
                if (TextUtils.isEmpty((CharSequence)string2)) continue;
                ArrayList<c> arrayList2 = new ArrayList<c>();
                for (String string3 : string2.split("\\|")) {
                    if (TextUtils.isEmpty((CharSequence)string3)) continue;
                    c c2 = new c(string3, string3);
                    arrayList2.add(c2);
                }
                if (arrayList2.isEmpty()) continue;
                d d2 = new d(string, string, arrayList2);
                arrayList.add(d2);
            }
            return arrayList;
        }
        catch (Throwable throwable) {
            return arrayList;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] l(String object, byte[] object2, HashMap object3) {
        Throwable throwable2;
        block3: {
            object = new Request.Builder().url((String)object).post(RequestBody.create((MediaType)MediaType.parse((String)"application/x-protobuf"), (byte[])object2));
            object2 = ((HashMap)object3).entrySet().iterator();
            while (object2.hasNext()) {
                object3 = (Map.Entry)object2.next();
                object.addHeader((String)object3.getKey(), (String)object3.getValue());
            }
            object = object.build();
            object2 = A.a().newCall((Request)object).execute();
            try {
                object = object2.body() == null ? (Object)new byte[0] : (Object)object2.body().bytes();
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object2.close();
            return object;
        }
        object2.close();
        throw throwable2;
    }

    public static byte[] m(byte[] ... byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byteArrayOutputStream.write(byArray[i2]);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String o(int n2, byte[] object) {
        object = new AppDrama$ProtoReader((byte[])object);
        while (((AppDrama$ProtoReader)object).b()) {
            if (((AppDrama$ProtoReader)object).e != n2) continue;
            return ((AppDrama$ProtoReader)object).d();
        }
        return "";
    }

    public static String r(String string, String object) {
        PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode((String)object, (int)0)));
        object = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        ((Cipher)object).init(1, publicKey);
        return Base64.encodeToString((byte[])((Cipher)object).doFinal(string.getBytes(com.github.catvod.spider.merge.UY.m.m())), (int)2);
    }

    public static String t(HashMap object, String string, String string2) {
        block1: {
            if (object == null) {
                return string2;
            }
            if (!TextUtils.isEmpty((CharSequence)(object = (String)((HashMap)object).get(string)))) break block1;
            object = string2;
        }
        return object;
    }

    public static byte[] u(long l2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int n2 = (int)(0x7FL & l2);
            if ((l2 >>>= 7) == 0L) {
                byteArrayOutputStream.write(n2);
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(n2 | 0x80);
        }
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> object3) {
        int n2;
        try {
            n2 = Integer.parseInt((String)object2);
        }
        catch (Throwable throwable) {
            n2 = 1;
        }
        try {
            object2 = new LinkedHashMap();
            ((AbstractMap)object2).put("pagesize", "21");
            ((AbstractMap)object2).put("typeId1", object);
            ((AbstractMap)object2).put("page", String.valueOf(n2));
            ((AbstractMap)object2).put("vodOrderBy", AppDrama.t(object3, "extend_sort", "\u6700\u65b0"));
            ((AbstractMap)object2).put("vodArea", AppDrama.t(object3, "area", ""));
            ((AbstractMap)object2).put("vodLang", AppDrama.t(object3, "lang", ""));
            ((AbstractMap)object2).put("vodClass", AppDrama.t(object3, "class", ""));
            ((AbstractMap)object2).put("vodYear", AppDrama.t(object3, "year", ""));
            object2 = AppDrama.j(this.e("/api/proto/v5/drama/category", this.s((LinkedHashMap)object2)));
            object3 = new g();
            ((g)object3).y((List)object2);
            ((g)object3).k(n2, n2 + 1, 21, Integer.MAX_VALUE);
            object2 = ((g)object3).toString();
            return object2;
        }
        catch (Throwable throwable) {
            object = com.github.catvod.spider.merge.Bk.m.i("[AppDrama] category failed tid=", (String)object, ": ");
            ((StringBuilder)object).append(throwable.getMessage());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new g();
            ((g)object).y(new ArrayList());
            ((g)object).k(n2, n2 + 1, 21, Integer.MAX_VALUE);
            return ((g)object).toString();
        }
    }

    /*
     * WARNING - void declaration
     */
    public String detailContent(List<String> object) {
        Object object2 = new LinkedHashMap<String, String>();
        ((AbstractMap)object2).put("id", (String)object.get(0));
        object = AppDrama.d(this.e("/api/proto/v5/drama/getDetail", this.s((LinkedHashMap)object2)));
        k k2 = new k();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AppDrama$ProtoReader appDrama$ProtoReader = new AppDrama$ProtoReader((byte[])object);
        while (appDrama$ProtoReader.b()) {
            int n2 = appDrama$ProtoReader.e;
            if (n2 != 1) {
                if (n2 != 2) {
                    long l2;
                    if (n2 != 4) {
                        if (n2 != 6) {
                            if (n2 != 9) {
                                if (n2 != 18) {
                                    void object5;
                                    Object object3;
                                    if (n2 != 29) {
                                        if (n2 != 12) {
                                            if (n2 != 13) {
                                                if (n2 != 25) {
                                                    if (n2 != 26) continue;
                                                    k2.q(appDrama$ProtoReader.d());
                                                    continue;
                                                }
                                                k2.h(appDrama$ProtoReader.d());
                                                continue;
                                            }
                                            k2.g(appDrama$ProtoReader.d());
                                            continue;
                                        }
                                        k2.k(appDrama$ProtoReader.d());
                                        continue;
                                    }
                                    Object object4 = new AppDrama$ProtoReader(appDrama$ProtoReader.a());
                                    object = "";
                                    object2 = "";
                                    Object object6 = object3 = "";
                                    while (((AppDrama$ProtoReader)object4).b()) {
                                        n2 = ((AppDrama$ProtoReader)object4).e;
                                        if (n2 == 2) {
                                            String string = ((AppDrama$ProtoReader)object4).d();
                                            continue;
                                        }
                                        if (n2 == 4) {
                                            object2 = ((AppDrama$ProtoReader)object4).d();
                                            continue;
                                        }
                                        if (n2 == 9) {
                                            object3 = ((AppDrama$ProtoReader)object4).d();
                                            continue;
                                        }
                                        if (n2 != 10) continue;
                                        object = ((AppDrama$ProtoReader)object4).d();
                                    }
                                    object4 = object;
                                    if (TextUtils.isEmpty((CharSequence)object)) {
                                        object4 = this.h;
                                    }
                                    object = object2;
                                    if (!m.matcher((CharSequence)object2).matches()) {
                                        object = new JSONObject();
                                        object.put("vodPlayFrom", object3);
                                        object.put("playUrl", object2);
                                        object = Base64.encodeToString((byte[])object.toString().getBytes(com.github.catvod.spider.merge.UY.m.m()), (int)2);
                                    }
                                    if (!((AbstractMap)linkedHashMap).containsKey(object4)) {
                                        ((AbstractMap)linkedHashMap).put(object4, new ArrayList());
                                    }
                                    object2 = (List)linkedHashMap.get(object4);
                                    object3 = new StringBuilder();
                                    ((StringBuilder)object3).append((String)object5);
                                    ((StringBuilder)object3).append("$");
                                    ((StringBuilder)object3).append((String)object);
                                    object2.add(((StringBuilder)object3).toString());
                                    continue;
                                }
                                n2 = appDrama$ProtoReader.b;
                                appDrama$ProtoReader.b = appDrama$ProtoReader.c;
                                l2 = appDrama$ProtoReader.c();
                                appDrama$ProtoReader.b = n2;
                                k2.s(String.valueOf(l2));
                                continue;
                            }
                            k2.m(appDrama$ProtoReader.d());
                            continue;
                        }
                        k2.j(appDrama$ProtoReader.d());
                        continue;
                    }
                    n2 = appDrama$ProtoReader.b;
                    appDrama$ProtoReader.b = appDrama$ProtoReader.c;
                    l2 = appDrama$ProtoReader.c();
                    appDrama$ProtoReader.b = n2;
                    k2.l(String.valueOf(l2));
                    continue;
                }
                k2.n(AppDrama.i(appDrama$ProtoReader.a()));
                continue;
            }
            k2.i(appDrama$ProtoReader.d());
        }
        object = new ArrayList<String>();
        object2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((ArrayList)object).add((String)entry.getKey());
            ((ArrayList)object2).add(TextUtils.join((CharSequence)"#", (Iterable)((Iterable)entry.getValue())));
        }
        k2.o(TextUtils.join((CharSequence)"$$$", object));
        k2.p(TextUtils.join((CharSequence)"$$$", object2));
        return com.github.catvod.spider.merge.MP.g.n(k2);
    }

    public final byte[] e(String string, byte[] byArray) {
        String string2 = com.github.catvod.spider.merge.Bk.m.h(new StringBuilder(), this.d, string);
        string = TextUtils.isEmpty((CharSequence)this.f) ? this.e : this.f;
        return AppDrama.l(string2, byArray, this.n(string));
    }

    public final HashMap h() {
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.k("User-Agent", "okhttp/3.12.1", "Accept", "application/json");
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        String string = TextUtils.isEmpty((CharSequence)this.f) ? this.e : this.f;
        hashMap.put("publicParams", this.p(string, false));
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeContent(boolean bl) {
        Object object;
        try {
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append(this.d);
            ((StringBuilder)object2).append("/api/v3/drama/getCategory?orderBy=type_id");
            object = new JSONObject(AppDrama.g(((StringBuilder)object2).toString(), this.h()));
            JSONArray jSONArray = object.optJSONArray("data");
            ArrayList<b> arrayList = new ArrayList<b>();
            object2 = new LinkedHashMap();
            if (jSONArray == null) return com.github.catvod.spider.merge.MP.g.r(arrayList, (LinkedHashMap)object2);
            int n2 = 0;
            while (n2 < jSONArray.length()) {
                Object object3 = jSONArray.optJSONObject(n2);
                if (object3 != null && !"\u516c\u544a".equals(object3.optString("name"))) {
                    object = object3.optString("id");
                    b b2 = new b((String)object, object3.optString("name"));
                    arrayList.add(b2);
                    object3 = AppDrama.k(object3.optString("converUrl"));
                    if (!((ArrayList)object3).isEmpty()) {
                        ((AbstractMap)object2).put(object, object3);
                    }
                }
                ++n2;
            }
            return com.github.catvod.spider.merge.MP.g.r(arrayList, (LinkedHashMap)object2);
        }
        catch (Throwable throwable) {}
        object = new StringBuilder("[AppDrama] home failed: ");
        ((StringBuilder)object).append(throwable.getMessage());
        SpiderDebug.log((String)((StringBuilder)object).toString());
        return com.github.catvod.spider.merge.MP.g.u(new ArrayList(), new ArrayList());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeVideoContent() {
        int n2;
        ArrayList arrayList;
        JSONArray jSONArray;
        Object object;
        Object object2;
        block9: {
            try {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(this.d);
                ((StringBuilder)object2).append("/api/ex/v3/security/tag/list");
                object2 = AppDrama.g(((StringBuilder)object2).toString(), this.h());
                object = new JSONObject((String)object2);
                object = object.optString("data");
                if (TextUtils.isEmpty((CharSequence)object)) {
                    object2 = new ArrayList();
                    return com.github.catvod.spider.merge.MP.g.t(object2);
                }
                object2 = object;
                if (!"0".equals(this.j)) {
                    object2 = AppDrama.b(AppDrama.b((String)object, this.k), this.l);
                }
                jSONArray = new JSONArray(object2);
                arrayList = new ArrayList();
                n2 = 0;
                break block9;
            }
            catch (Throwable throwable) {}
            object2 = new StringBuilder("[AppDrama] homeVideo failed: ");
            ((StringBuilder)object2).append(throwable.getMessage());
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            return com.github.catvod.spider.merge.MP.g.t(new ArrayList());
        }
        while (n2 < jSONArray.length()) {
            object2 = jSONArray.optJSONObject(n2) == null ? null : jSONArray.optJSONObject(n2).optJSONArray("sections");
            if (object2 != null) {
                for (int i2 = 0; i2 < object2.length(); ++i2) {
                    object = object2.optJSONObject(i2) == null ? null : object2.optJSONObject(i2).optJSONArray("vodList");
                    if (object == null) continue;
                    for (int i4 = 0; i4 < object.length(); ++i4) {
                        AppDrama.a(arrayList, object.optJSONObject(i4));
                    }
                }
            }
            ++n2;
        }
        return com.github.catvod.spider.merge.MP.g.t(arrayList);
    }

    public void init(Context object, String charSequence) {
        super.init((Context)object, (String)charSequence);
        this.b = object;
        object = new JSONObject((String)charSequence);
        this.c = object;
        this.d = object.optString("host");
        this.e = this.c.optString("publicKey");
        this.g = this.c.optString("pkg");
        this.h = this.c.optString("appName");
        this.i = this.c.optString("version");
        this.j = this.c.optString("decrypt");
        this.k = this.c.optString("dataKey");
        this.l = this.c.optString("dataIv");
        try {
            object = this.c.optString("site");
            if (!TextUtils.isEmpty((CharSequence)object) && !TextUtils.isEmpty((CharSequence)(object = (charSequence = new JSONObject(A.o((String)object, null, null))).optString("domain")))) {
                this.d = object;
            }
        }
        catch (Throwable throwable) {
            com.github.catvod.spider.merge.Bk.m.p(throwable, new StringBuilder("[AppDrama] remote host failed: "));
        }
        try {
            long l2 = System.currentTimeMillis();
            charSequence = this.q(16);
            object = AppDrama.m(AppDrama.u(8), AppDrama.u(l2));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l2);
            stringBuilder.append((String)charSequence);
            object = AppDrama.m((byte[])object, AppDrama.f(2, AppDrama.r(stringBuilder.toString(), this.e)), AppDrama.f(3, this.q(16)), AppDrama.f(4, (String)charSequence), AppDrama.f(5, this.q(16)));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.d);
            ((StringBuilder)charSequence).append("/api/v5/find/app/zone");
            object = AppDrama.d(AppDrama.l(((StringBuilder)charSequence).toString(), (byte[])object, this.n(this.e)));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(AppDrama.o(2, (byte[])object));
            ((StringBuilder)charSequence).append(AppDrama.o(3, (byte[])object));
            ((StringBuilder)charSequence).append(AppDrama.o(4, (byte[])object));
            ((StringBuilder)charSequence).append(AppDrama.o(5, (byte[])object));
            this.f = ((StringBuilder)charSequence).toString();
            object = new StringBuilder("[AppDrama] dynamic key len=");
            ((StringBuilder)object).append(this.f.length());
            SpiderDebug.log((String)((StringBuilder)object).toString());
        }
        catch (Throwable throwable) {
            this.f = "";
            com.github.catvod.spider.merge.Bk.m.p(throwable, new StringBuilder("[AppDrama] dynamic key failed: "));
        }
    }

    public final HashMap n(String string) {
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.k("User-Agent", "okhttp/3.12.1", "Accept", "application/x-protobuf");
        hashMap.put("Content-Type", "application/x-protobuf");
        hashMap.put("publicParams", this.p(string, true));
        return hashMap;
    }

    public final String p(String string, boolean bl) {
        CharSequence charSequence = UUID.randomUUID().toString();
        CharSequence charSequence2 = "";
        charSequence = charSequence.replace("-", "").toUpperCase();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("country", (Object)"CN");
        jSONObject.put("vName", (Object)this.i);
        jSONObject.put("cpuId", (Object)"MT6893Z%2FCZA");
        jSONObject.put("young", 0);
        jSONObject.put("facturer", (Object)Build.MANUFACTURER);
        jSONObject.put("pkg", (Object)this.g);
        jSONObject.put("uuid", (Object)charSequence);
        jSONObject.put("resolution", (Object)"1080x2272");
        jSONObject.put("mac", (Object)"02%3A00%3A00%3A00%3A00%3A00");
        jSONObject.put("abid", (Object)"397");
        jSONObject.put("model", (Object)Build.MODEL);
        jSONObject.put("plat", (Object)"android");
        jSONObject.put("udid", (Object)charSequence);
        jSONObject.put("dpi", (Object)"440");
        jSONObject.put("net", (Object)"1");
        jSONObject.put("lang", (Object)"zh");
        jSONObject.put("brand", (Object)Build.BRAND);
        jSONObject.put("density", (Object)"2.75");
        jSONObject.put("appName", (Object)this.h);
        jSONObject.put("cpu", (Object)"arm64-v8a");
        jSONObject.put("chid", (Object)"10000");
        jSONObject.put("carrier", (Object)"%E8%81%94%E9%80%9A");
        jSONObject.put("_vOsCode", Build.VERSION.SDK_INT);
        jSONObject.put("vOs", (Object)Build.VERSION.RELEASE);
        jSONObject.put("v", 1);
        jSONObject.put("tenantId", (Object)"");
        charSequence = this.i;
        charSequence = charSequence == null ? "" : charSequence.replace(".", "");
        jSONObject.put("vApp", (Object)charSequence);
        jSONObject.put("device", 0);
        charSequence = this.b;
        charSequence = charSequence == null ? charSequence2 : Settings.Secure.getString((ContentResolver)charSequence.getContentResolver(), (String)"android_id");
        jSONObject.put("androidID", (Object)charSequence);
        if (bl) {
            long l2 = System.currentTimeMillis();
            charSequence = this.q(16);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(String.valueOf(l2));
            ((StringBuilder)charSequence2).append((String)charSequence);
            String string2 = AppDrama.c(((StringBuilder)charSequence2).toString(), this.l, "ECB", null);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(l2);
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append(jSONObject.optString("vApp", "3019"));
            jSONObject.put("sig", (Object)AppDrama.r(((StringBuilder)charSequence2).toString(), string));
            jSONObject.put("random_str", (Object)charSequence);
            jSONObject.put("timestamp", l2);
            jSONObject.put("sig2", (Object)string2.substring(0, 8));
            jSONObject.put("sig3", (Object)string2.substring(8));
        }
        string = new JSONObject();
        string.put("paramsData", (Object)AppDrama.c(jSONObject.toString(), "ed5fdsgucxumegqa", "CBC", "ed5fdsgucxumegqa"));
        return string.toString();
    }

    public String playerContent(String object, String object2, List<String> object3) {
        object3 = new HashMap();
        object = object2;
        if (!m.matcher((CharSequence)object2).matches()) {
            Object object4;
            object2 = new JSONObject(new String(Base64.decode((String)object2, (int)0), com.github.catvod.spider.merge.UY.m.m()));
            object = new LinkedHashMap();
            Object object5 = object2.names();
            if (object5 != null) {
                for (int i2 = 0; i2 < object5.length(); ++i2) {
                    object4 = object5.optString(i2);
                    ((AbstractMap)object).put(object4, object2.optString((String)object4));
                }
            }
            object4 = AppDrama.d(this.e("/api/proto/v5/videoUsableUrl", this.s((LinkedHashMap)object)));
            object = AppDrama.o(1, (byte[])object4);
            object2 = new ArrayList();
            object4 = new AppDrama$ProtoReader((byte[])object4);
            while (((AppDrama$ProtoReader)object4).b()) {
                if (((AppDrama$ProtoReader)object4).e != 6) continue;
                ((ArrayList)object2).add(((AppDrama$ProtoReader)object4).a());
            }
            object2 = ((ArrayList)object2).iterator();
            while (object2.hasNext()) {
                object5 = (byte[])object2.next();
                object4 = AppDrama.o(1, (byte[])object5);
                object5 = AppDrama.o(2, (byte[])object5);
                if (TextUtils.isEmpty((CharSequence)object4) || TextUtils.isEmpty((CharSequence)object5)) continue;
                ((HashMap)object3).put(object4, object5);
            }
        }
        object2 = new g();
        ((g)object2).w((String)object);
        ((g)object2).g((HashMap)object3);
        return ((g)object2).toString();
    }

    public final String q(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n2 - 1; ++i2) {
            stringBuilder.append("1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(this.a.nextInt(62)));
        }
        stringBuilder.append('=');
        return stringBuilder.toString();
    }

    public final byte[] s(LinkedHashMap object) {
        long l2 = System.currentTimeMillis();
        String string = this.q(8);
        String string2 = this.q(20);
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry object22 : ((LinkedHashMap)object).entrySet()) {
            if (TextUtils.isEmpty((CharSequence)((CharSequence)object22.getValue()))) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append((String)object22.getKey());
            stringBuilder.append('=');
            stringBuilder.append((String)object22.getValue());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(stringBuilder.toString());
        stringBuilder2.append(l2);
        ((StringBuilder)object).append(AppDrama.c(stringBuilder2.toString(), this.k, "ECB", null));
        object = ((StringBuilder)object).toString();
        return AppDrama.m(AppDrama.f(1, ((String)object).substring(0, 20)), AppDrama.f(2, ((String)object).substring(20)), AppDrama.f(3, string2), AppDrama.m(AppDrama.u(32), AppDrama.u(l2)), AppDrama.f(5, string));
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    public String searchContent(String object, boolean bl, String serializable) {
        int n2;
        try {
            n2 = Integer.parseInt((String)((Object)serializable));
        }
        catch (Throwable throwable) {
            n2 = 1;
        }
        try {
            serializable = new LinkedHashMap();
            ((AbstractMap)((Object)serializable)).put("searchKeys", object);
            ((AbstractMap)((Object)serializable)).put("page", String.valueOf(n2));
            ((AbstractMap)((Object)serializable)).put("pagesize", "21");
            serializable = AppDrama.j(this.e("/api/proto/v5/drama/search", this.s((LinkedHashMap)serializable)));
            object = new g();
            ((g)object).y((List)((Object)serializable));
            ((g)object).k(n2, n2 + 1, 21, Integer.MAX_VALUE);
            object = ((g)object).toString();
            return object;
        }
        catch (Throwable throwable) {
            serializable = new StringBuilder("[AppDrama] search failed: ");
            ((StringBuilder)serializable).append(throwable.getMessage());
            SpiderDebug.log((String)((StringBuilder)serializable).toString());
            g g2 = new g();
            g2.y(new ArrayList());
            g2.k(n2, n2 + 1, 21, Integer.MAX_VALUE);
            return g2.toString();
        }
    }
}

