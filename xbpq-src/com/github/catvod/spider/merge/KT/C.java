/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.SharedPreferences
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Environment
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  com.google.zxing.BarcodeFormat
 *  com.google.zxing.EncodeHintType
 *  com.google.zxing.MultiFormatWriter
 *  com.google.zxing.common.BitMatrix
 */
package com.github.catvod.spider.merge.KT;

import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.KT.c;
import com.github.catvod.spider.merge.KT.d;
import com.github.catvod.spider.merge.KT.e;
import com.github.catvod.spider.merge.KT.f;
import com.github.catvod.spider.merge.MP.k;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.o;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class C {
    public static String a = "";
    public static String b = "";
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static boolean f = true;
    public static boolean g = false;
    public static String h = "";
    public static String i = "";
    public static String j = "xml";
    public static String k = "\u571f\u8c46\u5f39\u5e55";
    public static String l = "";
    public static String m = "";
    public static int n = 1;
    public static volatile A o = new A(4);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c A(ArrayList object, String object2, boolean bl) {
        Throwable throwable2;
        ExecutorService executorService;
        block21: {
            Object object3;
            ArrayList<Object> arrayList;
            block20: {
                int n2;
                arrayList = new ArrayList<Object>();
                object3 = com.github.catvod.spider.merge.KT.c.d(C.P((String)object2));
                if (!((String)object3).isEmpty() && !arrayList.contains(object3)) {
                    arrayList.add(object3);
                }
                object3 = ((ArrayList)object).iterator();
                while (object3.hasNext()) {
                    object = com.github.catvod.spider.merge.KT.c.d((String)object3.next());
                    if (((String)object).isEmpty() || arrayList.contains(object)) continue;
                    arrayList.add(object);
                }
                if (arrayList.isEmpty()) {
                    arrayList.add("");
                }
                object2 = new c(arrayList, (String)object2, bl);
                object3 = (ArrayList)((c)object2).c;
                if (((ArrayList)object3).size() <= 1) {
                    return object2;
                }
                object = new ArrayList<d>();
                for (n2 = 0; n2 < ((ArrayList)object3).size(); ++n2) {
                    ((ArrayList)object).add(new d((c)object2, (String)((ArrayList)object3).get(n2), n2));
                }
                executorService = Executors.newFixedThreadPool(Math.min(Math.max(1, ((ArrayList)object).size()), 8));
                arrayList = new ArrayList();
                try {
                    List list = executorService.invokeAll(object, 11L, TimeUnit.SECONDS);
                    for (n2 = 0; n2 < list.size(); ++n2) {
                        object = list.get(n2);
                    }
                    break block20;
                    {
                        Exception exception3;
                        try {
                            object = object.isCancelled() ? new e((String)((ArrayList)object3).get(n2), false, Long.MAX_VALUE, n2) : (e)object.get();
                            arrayList.add(object);
                            continue;
                        }
                        catch (Exception exception2) {
                            try {
                                object = new e((String)((ArrayList)object3).get(n2), false, Long.MAX_VALUE, n2);
                                arrayList.add(object);
                            }
                            catch (Exception exception3) {}
                            continue;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("CloudPool probe error: ");
                        ((StringBuilder)object).append(exception3.getMessage());
                        SpiderDebug.log((String)((StringBuilder)object).toString());
                        for (n2 = 0; n2 < ((ArrayList)object3).size(); ++n2) {
                            object = new e((String)((ArrayList)object3).get(n2), false, Long.MAX_VALUE, n2);
                            arrayList.add(object);
                        }
                        break block20;
                        break;
                    }
                }
                catch (Throwable throwable2) {
                    break block21;
                }
            }
            executorService.shutdownNow();
            if (arrayList.isEmpty()) {
                return object2;
            }
            Collections.sort(arrayList, new o(1));
            ((ArrayList)object3).clear();
            object = arrayList.iterator();
            while (object.hasNext()) {
                ((ArrayList)object3).add(((e)object.next()).a);
            }
            ((c)object2).j(0);
            if (((c)object2).b && !((String)((c)object2).d).isEmpty() && ((e)arrayList.get((int)0)).b) {
                C.b0((String)((Object)((c)object2).e), (String)((c)object2).d);
            }
            object3 = new StringBuilder("CloudPool fastest site: ");
            ((StringBuilder)object3).append((String)((c)object2).d);
            if (((e)arrayList.get((int)0)).b) {
                object = new StringBuilder(" ");
                ((StringBuilder)object).append(((e)arrayList.get((int)0)).c);
                ((StringBuilder)object).append("ms");
                object = ((StringBuilder)object).toString();
            } else {
                object = " fallback";
            }
            ((StringBuilder)object3).append((String)object);
            SpiderDebug.log((String)((StringBuilder)object3).toString());
            return object2;
        }
        executorService.shutdownNow();
        throw throwable2;
    }

    public static boolean B(String string) {
        boolean bl = string == null || string.trim().isEmpty();
        return bl;
    }

    public static boolean C(String string) {
        boolean bl = C.B(string);
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        if ((string = string.trim()).startsWith("<")) {
            return string.contains("<d ") ^ true;
        }
        string = C.g(C.R(string));
        bl = bl2;
        if (string != null) {
            bl = string.size() == 0 ? bl2 : false;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void D() {
        Throwable throwable2;
        block4: {
            JsonObject jsonObject;
            block3: {
                if (!h.isEmpty() && !i.isEmpty()) {
                    return;
                }
                try {
                    jsonObject = C.R(A.n("https://d.kstore.dev/download/6741/jar/duanmu.json", null, 5, 8));
                    boolean bl = h.isEmpty();
                    if (!bl) break block3;
                    h = C.v(jsonObject, "api", C.v(jsonObject, "danmuApi", ""));
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            if (!i.isEmpty()) return;
            i = C.v(jsonObject, "TOKEN", C.v(jsonObject, "token", C.v(jsonObject, "danmuToken", "")));
            return;
        }
        com.github.catvod.spider.merge.Bk.m.p(throwable2, new StringBuilder("[Danmu] remote config error: "));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String E(String charSequence, String object) {
        long l2;
        boolean bl;
        block28: {
            Throwable throwable2;
            String string;
            block27: {
                boolean bl2;
                block26: {
                    String string2;
                    String string3;
                    block25: {
                        block30: {
                            block29: {
                                C.l();
                                string3 = h;
                                bl2 = C.B(string3);
                                string2 = "";
                                bl = false;
                                if (bl2) break block28;
                                if (C.B((String)object)) break block29;
                                string = object;
                                if (!"movie".equalsIgnoreCase(((String)object).trim())) break block30;
                            }
                            string = "1";
                        }
                        object = string3.trim();
                        while (((String)object).endsWith("/")) {
                            object = com.github.catvod.spider.merge.Bk.m.d((String)object, 1, 0);
                        }
                        string3 = object;
                        if (((String)object).endsWith("/api/v2/fongmi/danmaku")) {
                            string3 = com.github.catvod.spider.merge.Bk.m.d((String)object, 22, 0);
                        }
                        if (string3.endsWith("/danmaku/api/v2/fongmi/danmaku")) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(string3);
                            ((StringBuilder)object).append("?name=");
                            ((StringBuilder)object).append(C.k((String)charSequence));
                            ((StringBuilder)object).append("&episode=");
                            ((StringBuilder)object).append(C.k(string));
                            ((StringBuilder)object).append("&format=xml");
                            charSequence = ((StringBuilder)object).toString();
                        } else {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(string3);
                            ((StringBuilder)object).append("/danmaku/api/v2/fongmi/danmaku?name=");
                            ((StringBuilder)object).append(C.k((String)charSequence));
                            ((StringBuilder)object).append("&episode=");
                            ((StringBuilder)object).append(C.k(string));
                            ((StringBuilder)object).append("&format=xml");
                            charSequence = ((StringBuilder)object).toString();
                        }
                        string = A.n((String)charSequence, C.z(false), 10, 20);
                        if (C.B(string)) {
                            charSequence = string;
                            return C.a0((String)charSequence);
                        }
                        charSequence = string.trim();
                        if (((String)charSequence).startsWith("<")) {
                            charSequence = string;
                            return C.a0((String)charSequence);
                        }
                        try {
                            charSequence = C.K((String)charSequence);
                            bl2 = charSequence.isJsonArray();
                            if (!bl2) break block25;
                            object = charSequence.getAsJsonArray();
                            break block26;
                        }
                        catch (Throwable throwable2) {
                            break block27;
                        }
                    }
                    if (charSequence.isJsonObject()) {
                        string3 = charSequence.getAsJsonObject();
                        object = C.b((JsonObject)string3, "data");
                        charSequence = object;
                        if (object == null) {
                            charSequence = C.b((JsonObject)string3, "list");
                        }
                        object = charSequence;
                        if (charSequence == null) {
                            object = C.b((JsonObject)string3, "items");
                        }
                        if (object == null && string3.has("url")) {
                            charSequence = string3.get("url").getAsString();
                            charSequence = charSequence == null ? string2 : ((String)charSequence).replace("/danmaku/api/v2/comment/", "/api/v2/comment/");
                            charSequence = A.n((String)charSequence, C.z(false), 10, 30);
                            return C.a0((String)charSequence);
                        }
                    } else {
                        object = null;
                    }
                }
                charSequence = string;
                if (object == null) return C.a0((String)charSequence);
                if (object.size() == 0) {
                    charSequence = string;
                    return C.a0((String)charSequence);
                }
                object = object.iterator();
                do {
                    charSequence = string;
                    if (!object.hasNext()) return C.a0((String)charSequence);
                } while ((charSequence = (JsonElement)object.next()) == null || !charSequence.isJsonObject() || (bl2 = C.C((String)(charSequence = C.p(C.Y(charSequence.getAsJsonObject(), "url"))))));
                return C.a0((String)charSequence);
            }
            com.github.catvod.spider.merge.Bk.m.p(throwable2, new StringBuilder("[Danmu] resolve candidate error: "));
            charSequence = string;
            return C.a0((String)charSequence);
        }
        C.l();
        boolean bl3 = bl;
        if (!l.isEmpty()) {
            bl3 = bl;
            if (!m.isEmpty()) {
                bl3 = true;
            }
        }
        if (!bl3) {
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><i></i>";
        }
        long l3 = l2 = C.r((String)charSequence, (String)object);
        if (l2 <= 0L) {
            l3 = l2;
            if (!C.B((String)object)) {
                l3 = "movie".equalsIgnoreCase(((String)object).trim()) ? l2 : C.r((String)charSequence, "");
            }
        }
        if (l3 <= 0L) {
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><i></i>";
        }
        charSequence = new StringBuilder("https://api.dandanplay.net/api/v2/comment/");
        ((StringBuilder)charSequence).append(l3);
        ((StringBuilder)charSequence).append("?withRelated=true&chConvert=");
        C.l();
        ((StringBuilder)charSequence).append(n);
        return C.a0(A.n(((StringBuilder)charSequence).toString(), C.z(true), 10, 30));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long F(JsonObject jsonObject) {
        long l2;
        long l3 = l2 = 0L;
        try {
            if (!jsonObject.has("episodeId")) return l3;
            l3 = l2;
        }
        catch (Throwable throwable) {
            return l2;
        }
        if (jsonObject.get("episodeId").isJsonNull()) return l3;
        return jsonObject.get("episodeId").getAsLong();
    }

    public static String G(String string) {
        if (string == null) {
            return "image/jpeg";
        }
        if ((string = string.toLowerCase()).contains(".png")) {
            return "image/png";
        }
        if (string.contains(".webp")) {
            return "image/webp";
        }
        if (string.contains(".gif")) {
            return "image/gif";
        }
        return "image/jpeg";
    }

    public static void H() {
        if (!h.isEmpty() && !i.isEmpty()) {
            String string = h;
            CharSequence charSequence = new StringBuilder(".*/");
            ((StringBuilder)charSequence).append(Pattern.quote(i));
            ((StringBuilder)charSequence).append("(/.*)?$");
            if (!string.matches(((StringBuilder)charSequence).toString())) {
                charSequence = h;
                string = i;
                charSequence = ((String)charSequence).trim();
                while (((String)charSequence).endsWith("/")) {
                    charSequence = com.github.catvod.spider.merge.Bk.m.d((String)charSequence, 1, 0);
                }
                if (((String)charSequence).endsWith("/api/v2/fongmi/danmaku")) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(((String)charSequence).substring(0, ((String)charSequence).length() - 22));
                    stringBuilder.append("/");
                    charSequence = com.github.catvod.spider.merge.Bk.m.h(stringBuilder, string, "/api/v2/fongmi/danmaku");
                } else {
                    charSequence = com.github.catvod.spider.merge.Bk.m.g((String)charSequence, "/", string);
                }
                h = charSequence;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static double I(JsonObject jsonObject, String string, double d2) {
        double d3 = d2;
        try {
            if (!jsonObject.has(string)) return d3;
            d3 = d2;
        }
        catch (Throwable throwable) {
            return d2;
        }
        if (jsonObject.get(string).isJsonNull()) return d3;
        return jsonObject.get(string).getAsDouble();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JsonObject J(JsonObject jsonObject, String string) {
        JsonObject jsonObject2;
        JsonObject jsonObject3 = jsonObject2 = null;
        if (jsonObject == null) return jsonObject3;
        jsonObject3 = jsonObject2;
        try {
            if (!jsonObject.has(string)) return jsonObject3;
            jsonObject3 = jsonObject2;
        }
        catch (Throwable throwable) {
            return jsonObject2;
        }
        if (!jsonObject.get(string).isJsonObject()) return jsonObject3;
        return jsonObject.getAsJsonObject(string);
    }

    public static JsonElement K(String string) {
        try {
            JsonElement jsonElement = JsonParser.parseString((String)string);
            return jsonElement;
        }
        catch (Throwable throwable) {
            return new JsonParser().parse(string);
        }
    }

    public static Object L(String string, Type object) {
        try {
            Gson gson = new Gson();
            object = gson.fromJson(string, (Type)object);
            return object;
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            object = new StringBuilder("json parse error: ");
            ((StringBuilder)object).append(jsonSyntaxException.getMessage());
            ((StringBuilder)object).append("\n ");
            ((StringBuilder)object).append(string);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return null;
        }
    }

    public static String M(String string, String string2) {
        Object object;
        C.l();
        boolean bl = f;
        String string3 = "";
        if (!bl) {
            return "";
        }
        String string4 = a.replaceAll("[\\[\\(].*?[\\]\\)]", "").trim();
        if (string4.isEmpty()) {
            return "";
        }
        Object object2 = string3;
        if (string2 != null) {
            if (c.isEmpty()) {
                object2 = string3;
            } else {
                String[] stringArray;
                block13: {
                    stringArray = c.split("\\$\\$\\$");
                    object2 = b.split("\\$\\$\\$");
                    if (string != null && !string.isEmpty() && stringArray.length != 0 && ((Object)object2).length != 0) {
                        int n2;
                        String string5 = string.trim();
                        int n3 = Math.min(stringArray.length, ((Object)object2).length);
                        for (n2 = 0; n2 < n3; ++n2) {
                            if (!string5.equals(((String)object2[n2]).trim())) continue;
                            object2 = stringArray[n2];
                            break block13;
                        }
                        for (n2 = 0; n2 < n3; ++n2) {
                            object = ((String)object2[n2]).trim();
                            if (((String)object).isEmpty() || !string5.contains((CharSequence)object) && !((String)object).contains(string5)) continue;
                            object2 = stringArray[n2];
                            break block13;
                        }
                    }
                    object2 = "";
                }
                object2 = ((String)object2).isEmpty() ? "" : C.s(string2, new String[]{object2});
                object = object2;
                if (((String)object2).isEmpty()) {
                    object = C.s(string2, stringArray);
                }
                if (object == null) {
                    object2 = string3;
                } else {
                    object2 = ((String)object).trim();
                    if (!((String)(object = C.o((String)object2))).isEmpty()) {
                        object2 = object;
                    }
                }
            }
        }
        object = object2;
        if (((String)object2).isEmpty()) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(" ");
            ((StringBuilder)object2).append(string2);
            object = C.o(((StringBuilder)object2).toString());
        }
        d = object;
        e = string4;
        string = !"list".equalsIgnoreCase(j) && !"source".equalsIgnoreCase(j) ? C.e("danmu", string4, (String)object, string, string2) : C.e("danmuList", string4, (String)object, string, string2);
        return string;
    }

    public static void N(Object object, String string) {
        if (object == null) {
            return;
        }
        if (object instanceof String) {
            C.x().edit().putString(string, (String)object).apply();
        } else if (object instanceof Boolean) {
            C.x().edit().putBoolean(string, ((Boolean)object).booleanValue()).apply();
        } else if (object instanceof Float) {
            C.x().edit().putFloat(string, ((Float)object).floatValue()).apply();
        } else if (object instanceof Integer) {
            C.x().edit().putInt(string, ((Integer)object).intValue()).apply();
        } else if (object instanceof Long) {
            C.x().edit().putLong(string, ((Long)object).longValue()).apply();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String O(File object) {
        String string = "";
        FileInputStream fileInputStream = new FileInputStream((File)object);
        try {
            byte[] byArray = new byte[((InputStream)fileInputStream).available()];
            ((InputStream)fileInputStream).read(byArray);
            ((InputStream)fileInputStream).close();
            return new String(byArray, "UTF-8");
        }
        catch (IOException iOException) {
            try {
                iOException.printStackTrace();
                return string;
            }
            catch (Exception exception) {
                return string;
            }
        }
    }

    public static String P(String object) {
        String string = C.O(C.q((String)object));
        if (string.length() > 0) {
            return string;
        }
        string = object;
        if (!((String)object).startsWith(".")) {
            string = ".".concat((String)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(Environment.getExternalStorageDirectory());
        object = new File(com.github.catvod.spider.merge.Bk.m.h((StringBuilder)object, File.separator, "TV"));
        if (!((File)object).exists()) {
            ((File)object).mkdirs();
        }
        return C.O(new File((File)object, string));
    }

    public static void Q(k object) {
        if (object == null) {
            return;
        }
        String string = ((k)object).c();
        String string2 = ((k)object).e();
        object = ((k)object).f();
        if (string != null && !string.trim().isEmpty()) {
            C.W(string);
        }
        if (object != null && !((String)object).trim().isEmpty()) {
            C.X(string2, (String)object);
        }
    }

    public static JsonObject R(String string) {
        block3: {
            try {
                JsonObject jsonObject = C.K(string).getAsJsonObject();
                string = jsonObject;
                if (jsonObject != null) break block3;
            }
            catch (Throwable throwable) {
                return new JsonObject();
            }
            string = new JsonObject();
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList S(String string) {
        ArrayList<f> arrayList;
        block7: {
            Throwable throwable2;
            block6: {
                block5: {
                    arrayList = new ArrayList<f>();
                    try {
                        C.l();
                        String string2 = h;
                        if (C.B(string2)) break block5;
                        arrayList.addAll(C.T(string2, string));
                        if (!arrayList.isEmpty()) {
                            return arrayList;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                C.l();
                if (!l.isEmpty() && !m.isEmpty()) {
                    arrayList.addAll(C.U(string));
                }
                break block7;
            }
            com.github.catvod.spider.merge.Bk.m.p(throwable2, new StringBuilder("[Danmu] search error: "));
        }
        if (arrayList.isEmpty() && !C.B(string)) {
            arrayList.add(new f(string, "1", C.e("danmu", string, "1", "", "")));
        }
        return arrayList;
    }

    public static ArrayList T(String charSequence, String string) {
        ArrayList arrayList = new ArrayList();
        String string2 = ((String)charSequence).trim();
        while (string2.endsWith("/")) {
            string2 = com.github.catvod.spider.merge.Bk.m.d(string2, 1, 0);
        }
        charSequence = string2;
        if (string2.endsWith("/api/v2/fongmi/danmaku")) {
            charSequence = com.github.catvod.spider.merge.Bk.m.d(string2, 22, 0);
        }
        string2 = charSequence;
        if (((String)charSequence).endsWith("/danmaku/api/v2/fongmi/danmaku")) {
            string2 = com.github.catvod.spider.merge.Bk.m.d((String)charSequence, 30, 0);
        }
        String string3 = C.k(string);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("/api/v2/search/anime?keyword=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append("&anime=");
        ((StringBuilder)charSequence).append(string3);
        C.f(C.K(A.n(com.github.catvod.spider.merge.Bk.m.h((StringBuilder)charSequence, "&name=", string3), C.z(false), 10, 20)), arrayList, string);
        return arrayList;
    }

    public static ArrayList U(String charSequence) {
        int n2 = 2;
        int n3 = 0;
        int n4 = 3;
        ArrayList<f> arrayList = new ArrayList<f>();
        Object object = new StringBuilder("https://api.dandanplay.net/api/v2/search/episodes?anime=");
        object.append(C.k((String)charSequence));
        charSequence = C.b(C.R(A.n(object.toString(), C.z(true), 10, 20)), "animes");
        if (charSequence == null) {
            return arrayList;
        }
        Iterator iterator = charSequence.iterator();
        block0: while (iterator.hasNext()) {
            charSequence = ((JsonElement)iterator.next()).getAsJsonObject();
            object = new String[n4];
            object[n3] = "animeTitle";
            object[1] = "title";
            object[n2] = "name";
            String string = C.t((JsonObject)charSequence, object);
            if ((charSequence = C.b((JsonObject)charSequence, "episodes")) != null && charSequence.size() != 0) {
                Iterator iterator2 = charSequence.iterator();
                int n5 = n4;
                int n6 = n3;
                int n7 = n2;
                while (true) {
                    n2 = n7;
                    n3 = n6;
                    n4 = n5;
                    if (!iterator2.hasNext()) continue block0;
                    charSequence = ((JsonElement)iterator2.next()).getAsJsonObject();
                    object = new String[4];
                    object[n6] = "episodeTitle";
                    object[1] = "title";
                    object[n7] = "name";
                    object[n5] = "episode";
                    String string2 = C.t((JsonObject)charSequence, object);
                    long l2 = C.F((JsonObject)charSequence);
                    if (l2 > 0L) {
                        charSequence = new StringBuilder("https://api.dandanplay.net/api/v2/comment/");
                        ((StringBuilder)charSequence).append(l2);
                        ((StringBuilder)charSequence).append("?withRelated=true&chConvert=");
                        C.l();
                        ((StringBuilder)charSequence).append(n);
                        object = ((StringBuilder)charSequence).toString();
                    } else {
                        object = "";
                    }
                    charSequence = C.B(string2) ? "1" : string2;
                    object = C.B((String)object) ? C.e("danmu", string, string2, "", "") : C.c((String)object);
                    arrayList.add(new f(string, (String)charSequence, (String)object));
                    if (arrayList.size() >= 80) {
                        return arrayList;
                    }
                    n7 = 2;
                    n6 = 0;
                    n5 = 3;
                }
            }
            arrayList.add(new f(string, "1", C.e("danmu", string, "1", "", "")));
            n2 = 2;
            n3 = 0;
            n4 = 3;
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void V(String var0) {
        block16: {
            block15: {
                block14: {
                    block13: {
                        block12: {
                            var4_3 = C.R(var0);
                            var3_4 = true;
                            C.f = true;
                            C.g = true;
                            C.h = C.v(var4_3, "danmuApi", C.v(var4_3, "danmuUrl", C.v(var4_3, "api", "")));
                            C.i = C.v(var4_3, "danmuToken", C.v(var4_3, "token", ""));
                            C.j = C.v(var4_3, "danmuMode", "xml");
                            C.k = C.v(var4_3, "danmuName", "\u571f\u8c46\u5f39\u5e55");
                            C.l = C.v(var4_3, "danmuAppId", C.v(var4_3, "appId", ""));
                            C.m = C.v(var4_3, "danmuAppSecret", C.v(var4_3, "appSecret", ""));
                            try {
                                if (!var4_3.has("danmuChConvert") || var4_3.get("danmuChConvert").isJsonNull()) break block12;
                                var1_5 = var4_3.get("danmuChConvert").getAsInt();
                                break block13;
                            }
                            catch (Throwable var0_1) {
                                // empty catch block
                            }
                        }
                        var1_5 = 1;
                    }
                    C.n = var1_5;
                    if (var4_3.has("danmu")) {
                        try {
                            if (var4_3.get("danmu").isJsonPrimitive() && var4_3.get("danmu").getAsJsonPrimitive().isBoolean()) {
                                C.f = var4_3.get("danmu").getAsBoolean();
                            }
                        }
                        catch (Throwable var0_2) {}
                        break block14;
                        C.f = "false".equalsIgnoreCase(var4_3.get("danmu").getAsString()) ^ true;
                    }
                }
                if (C.f) {
                    C.D();
                }
                C.H();
                if (!C.f) ** GOTO lbl-1000
                if (C.h.isEmpty()) break block15;
                var2_6 = var3_4;
                if (!C.i.isEmpty()) break block16;
            }
            ** if (C.l.isEmpty() || C.m.isEmpty()) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                var2_6 = var3_4;
                ** GOTO lbl44
            }
lbl-1000:
            // 2 sources

            {
                var2_6 = false;
            }
        }
        C.f = var2_6;
    }

    public static void W(String string) {
        if (!(string = string == null ? "" : string.trim()).equals(a)) {
            e = "";
            d = "";
        }
        a = string;
    }

    public static void X(String string, String string2) {
        String string3 = string;
        if (string == null) {
            string3 = "";
        }
        b = string3;
        string = string2;
        if (string2 == null) {
            string = "";
        }
        c = string;
        d = "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String Y(JsonObject jsonObject, String string) {
        String string2;
        String string3 = string2 = "";
        try {
            if (!jsonObject.has(string)) return string3;
            string3 = string2;
        }
        catch (Throwable throwable) {
            return string2;
        }
        if (jsonObject.get(string).isJsonNull()) return string3;
        return jsonObject.get(string).getAsString();
    }

    public static String Z(Object object) {
        return new Gson().toJson(object);
    }

    public static void a(StringBuilder stringBuilder, String string, String string2) {
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        stringBuilder.append("&");
        stringBuilder.append(string);
        stringBuilder.append("=");
        stringBuilder.append(URLEncoder.encode(H.c(string3.getBytes(com.github.catvod.spider.merge.UY.m.m())), "UTF-8"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a0(String string) {
        if (C.B(string)) {
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><i></i>";
        }
        if ((string = string.trim()).startsWith("<")) {
            return string;
        }
        if ((string = C.g(C.R(string))) == null) {
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><i></i>";
        }
        StringBuilder stringBuilder = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?><i>");
        Iterator iterator = string.iterator();
        while (true) {
            String string2;
            String string3;
            JsonObject jsonObject;
            block9: {
                if (!iterator.hasNext()) {
                    stringBuilder.append("</i>");
                    return stringBuilder.toString();
                }
                string = (JsonElement)iterator.next();
                try {
                    jsonObject = string.getAsJsonObject();
                    string3 = C.Y(jsonObject, "p");
                    string = string2 = C.Y(jsonObject, "m");
                    if (!C.B(string2)) break block9;
                    string = C.Y(jsonObject, "text");
                }
                catch (Throwable throwable) {
                }
            }
            string2 = string;
            if (C.B(string)) {
                string2 = C.Y(jsonObject, "content");
            }
            string = string3;
            if (C.B(string3)) {
                string = C.d(jsonObject);
            }
            if (C.B(string) || C.B(string2)) continue;
            stringBuilder.append("<d p=\"");
            stringBuilder.append(C.m(string));
            stringBuilder.append("\">");
            stringBuilder.append(C.m(string2));
            stringBuilder.append("</d>");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JsonArray b(JsonObject jsonObject, String string) {
        JsonArray jsonArray;
        JsonArray jsonArray2 = jsonArray = null;
        if (jsonObject == null) return jsonArray2;
        jsonArray2 = jsonArray;
        try {
            if (!jsonObject.has(string)) return jsonArray2;
            jsonArray2 = jsonArray;
        }
        catch (Throwable throwable) {
            return jsonArray;
        }
        if (!jsonObject.get(string).isJsonArray()) return jsonArray2;
        return jsonObject.getAsJsonArray(string);
    }

    public static void b0(String object, String object2) {
        File file = C.q((String)object);
        object = object2;
        if (object2 == null) {
            object = "";
        }
        object2 = ((String)object).getBytes();
        try {
            C.h(file);
            object = new FileOutputStream(file);
            ((FileOutputStream)object).write((byte[])object2);
            ((OutputStream)object).flush();
            ((FileOutputStream)object).close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            com.github.catvod.spider.merge.Bk.m.m(exception, new StringBuilder("\u5199\u5165\u6587\u4ef6\u51fa\u9519\uff1a"));
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String c(String charSequence) {
        void var0_2;
        try {
            String string;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Proxy.getUrl());
            stringBuilder.append("?do=danmuDirect&url=");
            stringBuilder.append(URLEncoder.encode(H.c(((String)charSequence).getBytes(com.github.catvod.spider.merge.UY.m.m())), "UTF-8"));
            String string2 = string = stringBuilder.toString();
            return var0_2;
        }
        catch (Throwable throwable) {
            return var0_2;
        }
    }

    public static String d(JsonObject object) {
        String string;
        double d2 = C.I(object, "time", C.I(object, "at", 0.0));
        int n2 = (int)C.I(object, "mode", C.I(object, "type", 1.0));
        int n3 = (int)C.I(object, "color", 1.6777215E7);
        String string2 = string = C.Y(object, "userId");
        if (C.B(string)) {
            string2 = C.Y(object, "uid");
        }
        object = string2;
        if (C.B(string2)) {
            object = "0";
        }
        return String.format(Locale.US, "%.2f,%d,%d,%s", d2, n2, n3, object);
    }

    /*
     * Unable to fully structure code
     */
    public static String e(String var0, String var1_2, String var2_3, String var3_4, String var4_5) {
        block5: {
            if (var1_2 != null) {
                if (var1_2.trim().isEmpty()) break block5;
                C.e = var1_2.trim();
            }
        }
        if (var2_3 == null) ** GOTO lbl10
        try {
            if (!var2_3.trim().isEmpty()) {
                C.d = var2_3.trim();
            }
lbl10:
            // 4 sources

            var5_6 = new StringBuilder(Proxy.getUrl());
            var5_6.append("?do=");
            var5_6.append(var0);
            C.a(var5_6, "name", var1_2);
            C.a(var5_6, "episode", var2_3);
            C.a(var5_6, "flag", var3_4);
            C.a(var5_6, "id", var4_5);
            var0 = var5_6.toString();
            return var0;
        }
        catch (Throwable var0_1) {
            com.github.catvod.spider.merge.Bk.m.p(var0_1, new StringBuilder("[Danmu] build url error: "));
            return "";
        }
    }

    public static void f(JsonElement object, ArrayList arrayList, String object2) {
        if (object != null && !object.isJsonNull() && arrayList.size() < 80) {
            if (object.isJsonArray()) {
                object = object.getAsJsonArray().iterator();
                while (object.hasNext()) {
                    C.f((JsonElement)object.next(), arrayList, (String)object2);
                }
                return;
            }
            if (!object.isJsonObject()) {
                return;
            }
            Object object3 = object.getAsJsonObject();
            if ((object = C.u(object3, new String[]{"data", "list", "items", "results", "animes", "episodes"})) != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    C.f((JsonElement)object.next(), arrayList, (String)object2);
                }
                return;
            }
            String string = C.t(object3, new String[]{"animeTitle", "title", "name", "anime", "vod_name"});
            object = C.t(object3, new String[]{"episodeTitle", "episode", "episodeName", "ep", "index"});
            String string2 = C.t(object3, new String[]{"url", "danmaku", "comment", "commentUrl"});
            long l2 = C.F(object3);
            if (C.B(string)) {
                string = object2;
            }
            object3 = object;
            if (C.B((String)object)) {
                object3 = "1";
            }
            object = string2;
            if (!C.B(string2)) {
                object = string2;
                if (string2.startsWith("http")) {
                    object = C.c(string2);
                }
            }
            object2 = object;
            if (C.B((String)object)) {
                object2 = object;
                if (l2 > 0L) {
                    object = new StringBuilder("https://api.dandanplay.net/api/v2/comment/");
                    ((StringBuilder)object).append(l2);
                    ((StringBuilder)object).append("?withRelated=true&chConvert=");
                    C.l();
                    ((StringBuilder)object).append(n);
                    object2 = C.c(((StringBuilder)object).toString());
                }
            }
            if (!C.B(string)) {
                object = object2;
                if (C.B((String)object2)) {
                    object = C.e("danmu", string, (String)object3, "", "");
                }
                arrayList.add(new f(string, (String)object3, (String)object));
            }
        }
    }

    public static JsonArray g(JsonObject jsonObject) {
        JsonArray jsonArray = C.b(jsonObject, "comments");
        if (jsonArray != null) {
            return jsonArray;
        }
        JsonObject jsonObject2 = C.J(jsonObject, "data");
        if (jsonObject2 != null) {
            jsonArray = C.b(jsonObject2, "comments");
            if (jsonArray != null) {
                return jsonArray;
            }
            jsonArray = C.b(jsonObject2, "list");
            if (jsonArray != null) {
                return jsonArray;
            }
        }
        return C.b(jsonObject, "list");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File h(File file) {
        Exception exception222222;
        if (!file.canWrite()) {
            file.setWritable(true);
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        CharSequence charSequence = new StringBuilder("chmod 777 ");
        ((StringBuilder)charSequence).append(file);
        charSequence = ((StringBuilder)charSequence).toString();
        {
            catch (Exception exception222222) {}
        }
        try {
            int n2 = Runtime.getRuntime().exec((String)charSequence).waitFor();
            if (n2 == 0) {
                return file;
            }
            charSequence = new StringBuilder("Shell command failed with exit code ");
            ((StringBuilder)charSequence).append(n2);
            RuntimeException runtimeException = new RuntimeException(((StringBuilder)charSequence).toString());
            throw runtimeException;
        }
        catch (Exception exception3) {
            exception3.printStackTrace();
            return file;
        }
        exception222222.printStackTrace();
        return file;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String i(String string) {
        String string2;
        if (string == null) {
            return "";
        }
        try {
            string2 = H.b(string);
            boolean bl = C.B(string2);
            if (!bl) {
                return string2;
            }
        }
        catch (Throwable throwable) {}
        try {
            string2 = URLDecoder.decode(string, "UTF-8");
            return string2;
        }
        catch (Throwable throwable) {
            return string;
        }
    }

    public static int j(int n2) {
        return (int)TypedValue.applyDimension((int)1, (float)n2, (DisplayMetrics)Init.context().getResources().getDisplayMetrics());
    }

    public static String k(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return URLEncoder.encode(string2, "UTF-8");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void l() {
        synchronized (C.class) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl;
                        block8: {
                            boolean bl2;
                            block7: {
                                if (g || !f) break block5;
                                bl2 = true;
                                g = true;
                                C.D();
                                C.H();
                                if (h.isEmpty()) break block7;
                                bl = bl2;
                                if (!i.isEmpty()) break block8;
                            }
                            bl = !l.isEmpty() && !m.isEmpty() ? bl2 : false;
                        }
                        f = bl;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public static String m(String string) {
        string = string == null ? "" : string.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;");
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList n(ArrayList arrayList, int n2) {
        ExecutorService executorService;
        ArrayList<Object> arrayList2;
        block11: {
            block12: {
                arrayList2 = new ArrayList<Object>();
                if (arrayList.isEmpty()) {
                    return arrayList2;
                }
                executorService = Executors.newFixedThreadPool(Math.min(Math.max(1, arrayList.size()), 8));
                long l2 = n2;
                try {
                    Object object;
                    Object object2 = executorService.invokeAll(arrayList, l2, TimeUnit.SECONDS).iterator();
                    while (object2.hasNext()) {
                        object = (Future)object2.next();
                    }
                    break block11;
                    {
                        Exception exception3;
                        try {
                            object = object.isCancelled() ? "" : (String)object.get();
                            arrayList2.add(object);
                            continue;
                        }
                        catch (Exception exception2) {
                            try {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("CloudPool task error: ");
                                stringBuilder.append(exception2.getMessage());
                                SpiderDebug.log((String)stringBuilder.toString());
                                arrayList2.add("");
                                continue;
                            }
                            catch (Exception exception3) {}
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("CloudPool execute error: ");
                        ((StringBuilder)object2).append(exception3.getMessage());
                        SpiderDebug.log((String)((StringBuilder)object2).toString());
                        break block12;
                        break;
                    }
                }
                catch (Throwable throwable) {}
                executorService.shutdownNow();
                throw throwable;
            }
            for (n2 = 0; n2 < arrayList.size(); ++n2) {
                arrayList2.add("");
            }
        }
        executorService.shutdownNow();
        return arrayList2;
    }

    public static String o(String string) {
        String string2 = "";
        if (string == null) {
            return "";
        }
        if ((string = string.trim().replaceAll("(?i)\\.(mp4|mkv|m3u8|avi|mov|flv|wmv|ts|webm|rmvb)(?:\\?.*)?$", "").replaceAll("(?i)\\[[^\\]]*\\d+(?:\\.\\d+)?\\s*(?:mb|gb)[^\\]]*\\]", " ").replaceAll("(?i)\\([^\\)]*\\d+(?:\\.\\d+)?\\s*(?:mb|gb)[^\\)]*\\)", " ").replaceAll("(?i)\\b\\d+(?:\\.\\d+)?\\s*(?:mb|gb)\\b", " ").replaceAll("(?i)(^|[\\s._\\-])(?:4k|8k|720p|1080p|1440p|2160p|4320p|hdr|hdr10|dv|dolby|60fps|120fps|h\\.?26[45]|x26[45]|avc|hevc)(?=$|[\\s._\\-])", "$1").replaceAll("[\\s._\\-]+$", "").trim()).toLowerCase().contains("movie")) {
            return "movie";
        }
        Matcher matcher = Pattern.compile("(?i)s\\s*\\d{1,2}[\\s._\\-]*e\\s*(\\d{1,4})").matcher(string);
        if (matcher.find()) {
            string = matcher.group(1);
            if (string != null) {
                try {
                    string2 = String.valueOf(Integer.parseInt(string));
                }
                catch (Throwable throwable) {
                    string2 = string;
                }
            }
            return string2;
        }
        matcher = Pattern.compile("(?i)(?:^|[\\s._\\-])e(?:p)?\\.?\\s*(\\d{1,4})(?=$|[\\s._\\-])").matcher(string);
        if (matcher.find()) {
            string = matcher.group(1);
            if (string != null) {
                try {
                    string2 = String.valueOf(Integer.parseInt(string));
                }
                catch (Throwable throwable) {
                    string2 = string;
                }
            }
            return string2;
        }
        matcher = Pattern.compile("(?:^|\\D)(\\d{1,4})(?:\\D*)$").matcher(string);
        string = string2;
        if (matcher.find()) {
            string = matcher.group(1);
            if (string == null) {
                string = string2;
            } else {
                try {
                    string = string2 = String.valueOf(Integer.parseInt(string));
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
        }
        return string;
    }

    public static String p(String stringArray) {
        if (C.B((String)stringArray)) {
            return "";
        }
        String string2 = stringArray == null ? "" : stringArray.replace("/danmaku/api/v2/comment/", "/api/v2/comment/");
        for (String string2 : string2.equals(stringArray) ? new String[]{string2} : new String[]{string2, stringArray}) {
            try {
                string2 = A.n(string2, C.z(false), 10, 30);
                boolean bl = C.C(string2);
                if (bl) continue;
                return string2;
            }
            catch (Throwable throwable) {
                com.github.catvod.spider.merge.Bk.m.p(throwable, new StringBuilder("[Danmu] comment fetch failed: "));
            }
        }
        return "";
    }

    public static File q(String object) {
        String string = object;
        if (!((String)object).startsWith(".")) {
            string = ".".concat((String)object);
        }
        if (!((File)(object = new File(Init.context().getFilesDir(), "secure"))).exists()) {
            ((File)object).mkdirs();
        }
        return new File((File)object, string);
    }

    public static long r(String object, String string) {
        if (C.B((String)object)) {
            return 0L;
        }
        CharSequence charSequence = new StringBuilder("https://api.dandanplay.net/api/v2/search/episodes?anime=");
        charSequence.append(C.k((String)object));
        charSequence = charSequence.toString();
        object = charSequence;
        if (!C.B(string)) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append("&episode=");
            ((StringBuilder)object).append(C.k(string));
            object = ((StringBuilder)object).toString();
        }
        if ((object = C.b(C.R(A.n((String)object, C.z(true), 10, 20)), "animes")) == null) {
            return 0L;
        }
        object = object.iterator();
        while (object.hasNext()) {
            string = C.b(((JsonElement)object.next()).getAsJsonObject(), "episodes");
            if (string == null || string.size() == 0 || !(string = string.get(0).getAsJsonObject()).has("episodeId")) continue;
            return string.get("episodeId").getAsLong();
        }
        return 0L;
    }

    /*
     * Unable to fully structure code
     */
    public static String s(String var0, String[] var1_1) {
        var7_2 = var1_1.length;
        var11_3 = "";
        var4_4 = -1;
        var9_5 = "";
        for (var3_6 = 0; var3_6 < var7_2; ++var3_6) {
            for (String var14_14 : var1_1[var3_6].split("#")) {
                block10: {
                    block11: {
                        var2_7 = var14_14.indexOf(36);
                        var6_9 = var4_4;
                        var10_11 = var9_5;
                        if (var2_7 <= 0) break block10;
                        if (var2_7 < var14_14.length() - 1) break block11;
                        var6_9 = var4_4;
                        var10_11 = var9_5;
                        break block10;
                    }
                    var12_12 = var14_14.substring(0, var2_7).trim();
                    var14_14 = var14_14.substring(var2_7 + 1);
                    if (var0 == null || var14_14 == null) ** GOTO lbl-1000
                    if (var0.equals(var14_14)) {
                        var2_7 = 100000;
                    } else {
                        var10_11 = var0.replaceAll("\\s+", "").replaceAll("(?i)&_t=\\d+$", "");
                        var14_14 = var14_14.replaceAll("\\s+", "").replaceAll("(?i)&_t=\\d+$", "");
                        if (!var10_11.isEmpty() && var10_11.equals(var14_14)) {
                            var2_7 = 90000;
                        } else if (!var10_11.isEmpty() && !var14_14.isEmpty() && (var10_11.contains(var14_14) || var14_14.contains(var10_11))) {
                            var2_7 = Math.min(var10_11.length(), var14_14.length());
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_7 = 0;
                        }
                    }
                    var6_9 = var4_4;
                    var10_11 = var9_5;
                    if (var2_7 > var4_4) {
                        var10_11 = var12_12;
                        var6_9 = var2_7;
                    }
                }
                var4_4 = var6_9;
                var9_5 = var10_11;
            }
        }
        var0 = var11_3;
        if (var4_4 > 0) {
            var0 = var9_5;
        }
        return var0;
    }

    public static String t(JsonObject jsonObject, String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = C.Y(jsonObject, stringArray[i2]);
            if (C.B(string)) continue;
            return string;
        }
        return "";
    }

    public static JsonArray u(JsonObject jsonObject, String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = stringArray[i2];
            JsonArray jsonArray = C.b(jsonObject, string);
            if (jsonArray != null) {
                return jsonArray;
            }
            jsonArray = C.J(jsonObject, string);
            if (jsonArray == null || (jsonArray = C.u((JsonObject)jsonArray, stringArray)) == null) continue;
            return jsonArray;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String v(JsonObject jsonObject, String string, String string2) {
        String string3 = string2;
        try {
            if (!jsonObject.has(string)) return string3;
            string3 = string2;
        }
        catch (Throwable throwable) {
            return string2;
        }
        if (jsonObject.get(string).isJsonNull()) return string3;
        return jsonObject.get(string).getAsString().trim();
    }

    public static Bitmap w(int n2, String object) {
        BitMatrix bitMatrix = new EnumMap(EncodeHintType.class);
        bitMatrix.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        bitMatrix.put(EncodeHintType.MARGIN, (Object)2);
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        bitMatrix = multiFormatWriter.encode((String)object, BarcodeFormat.QR_CODE, n2, n2, bitMatrix);
        int n3 = bitMatrix.getWidth();
        int n4 = bitMatrix.getHeight();
        object = new int[n3 * n4];
        for (n2 = 0; n2 < n4; ++n2) {
            for (int i2 = 0; i2 < n3; ++i2) {
                int n5 = bitMatrix.get(i2, n2) ? -16777216 : -1;
                object[n2 * n3 + i2] = n5;
            }
        }
        try {
            bitMatrix = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            bitMatrix.setPixels((int[])object, 0, n3, 0, 0, n3, n4);
            return bitMatrix;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static SharedPreferences x() {
        Application application = Init.context();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Init.context().getPackageName());
        stringBuilder.append("_preferences");
        return application.getSharedPreferences(stringBuilder.toString(), 0);
    }

    public static String y(String string) {
        return C.x().getString(string, "");
    }

    public static HashMap z(boolean bl) {
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Accept", "application/json");
        if (bl) {
            C.l();
            hashMap.put("X-AppId", l);
            C.l();
            hashMap.put("X-AppSecret", m);
        }
        return hashMap;
    }
}

