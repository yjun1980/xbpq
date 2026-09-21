/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.KT;

import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.A;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.F;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.KT.g;
import com.github.catvod.spider.merge.KT.z;
import com.github.catvod.spider.merge.mI.i;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class B {
    public static final HashSet i = new HashSet<String>(Arrays.asList("ali", "baidu", "guangya", "pan115", "pan123", "quark", "tianyi", "uc", "xunlei", "yidong"));
    public static final HashSet j = new HashSet<String>(Arrays.asList("ali_original", "ali_smart", "quark_original", "quark_unlimited", "quark_smart", "uc_original", "uc_smart", "xunlei_original", "xunlei_smart", "pan115_original", "pan123_original", "guangya_original"));
    public static final List k = Arrays.asList("quark", "uc", "baidu", "ali", "tianyi", "yidong", "pan115", "pan123", "xunlei", "guangya");
    public static final B l = new B();
    public Process a;
    public int b = 17890;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile String f = "";
    public volatile String g = "";
    public long h;

    public static void A(ArrayList object) {
        ArrayList arrayList = new ArrayList();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            String string = B.w((String)object.next());
            if (!i.contains(string)) continue;
            B.a(string, arrayList);
        }
        object = arrayList.isEmpty() ? "-" : TextUtils.join((CharSequence)",", arrayList);
        C.N(object, "pan_enabled");
    }

    /*
     * WARNING - void declaration
     */
    public static String B() {
        void var2_5;
        void var2_2;
        if (Build.VERSION.SDK_INT >= 21) {
            String[] object = com.github.catvod.spider.merge.KT.g.t();
        } else {
            String[] stringArray = new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        }
        int n2 = ((void)var2_2).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            void var3_8 = var2_2[i2];
            if (!("arm64-v8a".equals(var3_8) || "armeabi-v7a".equals(var3_8) || "x86_64".equals(var3_8) || "x86".equals(var3_8))) {
                continue;
            }
            return var3_8;
        }
        if (((void)var2_2).length > 0) {
            void var2_3 = var2_2[0];
        } else {
            String string = "";
        }
        return var2_5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void C(boolean bl) {
        C.N(bl, "go_proxy_enabled");
        C.N(bl ^ true, "go_proxy_user_disabled");
        if (!bl) {
            B b2 = l;
            synchronized (b2) {
                try {
                    Process process = b2.a;
                    if (process != null) {
                        process.destroy();
                    }
                }
                catch (Throwable throwable) {}
                b2.a = null;
                b2.e = false;
            }
        }
    }

    public static String D(String string) {
        if (string == null) {
            return "";
        }
        if (string.length() > 160) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.substring(0, 160));
            stringBuilder.append("...");
            string = stringBuilder.toString();
        }
        return string;
    }

    public static String E(String string) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec("xjar-go-bind-20260627-tudou".getBytes(com.github.catvod.spider.merge.UY.m.m()), "HmacSHA256");
            mac.init(secretKeySpec);
            string = B.H(mac.doFinal(string.getBytes(com.github.catvod.spider.merge.UY.m.m())));
            return string;
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String F(JsonObject jsonObject, String string) {
        String string2;
        String string3 = string2 = "";
        if (jsonObject == null) return string3;
        string3 = string2;
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

    public static String G(String string) {
        StringBuilder stringBuilder = new StringBuilder("pan_thread_");
        stringBuilder.append(B.w(string));
        return stringBuilder.toString();
    }

    public static String H(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = Integer.toHexString(byArray[i2] & 0xFF);
            if (string.length() == 1) {
                stringBuilder.append('0');
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void I(String string, File object) {
        Throwable throwable322222;
        FileOutputStream fileOutputStream;
        block11: {
            block10: {
                fileOutputStream = new FileOutputStream((File)object, false);
                object = string;
                if (string != null) break block10;
                object = "";
                {
                    catch (Throwable throwable2) {
                        return;
                    }
                }
            }
            try {
                fileOutputStream.write(((String)object).getBytes(com.github.catvod.spider.merge.UY.m.m()));
            }
            catch (Throwable throwable322222) {
                break block11;
            }
            fileOutputStream.close();
            return;
        }
        try {
            fileOutputStream.close();
            throw throwable322222;
        }
        catch (Throwable throwable4) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(throwable322222, throwable4);
            throw throwable322222;
            catch (Exception exception) {
                throw throwable322222;
            }
        }
    }

    public static void a(String string, ArrayList arrayList) {
        if (!(string = B.w(string)).isEmpty() && !arrayList.contains(string)) {
            arrayList.add(string);
        }
    }

    public static void e(String string) {
        ArrayList arrayList = B.k();
        B.a(string, arrayList);
        B.A(arrayList);
    }

    /*
     * Exception decompiling
     */
    public static File h() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 51->176)] java.lang.Throwable
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

    public static int j(String string) {
        if (!"uc".equals(string) && !"uc_vip".equals(string)) {
            if (!"quark".equals(string) && !"quark_vip".equals(string)) {
                return 8;
            }
            return 32;
        }
        return 128;
    }

    public static ArrayList k() {
        Object object = C.y("pan_enabled");
        AbstractCollection abstractCollection = new LinkedHashSet();
        if (object != null && !((String)object).trim().isEmpty()) {
            if ("-".equals(((String)object).trim())) {
                return new ArrayList();
            }
            Object object2 = ((String)object).split(",");
            int n2 = ((String[])object2).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                object = B.w(object2[i2]);
                if (!i.contains(object)) continue;
                ((AbstractCollection)abstractCollection).add(object);
            }
            object = abstractCollection;
            if (!C.x().getBoolean("pan_enabled_115_migrated", false)) {
                object = abstractCollection;
                if (!((AbstractCollection)abstractCollection).contains("pan115")) {
                    abstractCollection = new ArrayList(abstractCollection);
                    B.a("pan115", abstractCollection);
                    object = new LinkedHashSet(abstractCollection);
                    C.N(TextUtils.join((CharSequence)",", abstractCollection), "pan_enabled");
                }
            }
            object2 = Boolean.TRUE;
            C.N(object2, "pan_enabled_115_migrated");
            abstractCollection = object;
            if (!C.x().getBoolean("pan_enabled_guangya_migrated", false)) {
                abstractCollection = object;
                if (!((AbstractCollection)object).contains("guangya")) {
                    object = new ArrayList(object);
                    B.a("guangya", object);
                    abstractCollection = new LinkedHashSet(object);
                    C.N(TextUtils.join((CharSequence)",", object), "pan_enabled");
                }
            }
            C.N(object2, "pan_enabled_guangya_migrated");
            return new ArrayList(abstractCollection);
        }
        abstractCollection.addAll(k);
        return new ArrayList(abstractCollection);
    }

    public static String l() {
        if (C.x().getBoolean("go_proxy_user_disabled", false)) {
            return "\u5df2\u5173\u95ed";
        }
        if (!B.q()) {
            return "\u672a\u542f\u7528";
        }
        B b2 = l;
        if (b2.t()) {
            StringBuilder stringBuilder = new StringBuilder("\u8fd0\u884c\u4e2d\uff1a");
            stringBuilder.append(b2.c());
            stringBuilder.append("\n");
            stringBuilder.append(b2.f);
            return stringBuilder.toString();
        }
        if (b2.e) {
            return "\u542f\u52a8\u5931\u8d25\uff0c\u5df2\u56de\u9000 Java \u4ee3\u7406";
        }
        if (!b2.c && !b2.d) {
            return "\u5df2\u542f\u7528\uff0c\u64ad\u653e\u65f6\u81ea\u52a8\u542f\u52a8";
        }
        return "\u6b63\u5728\u62c9\u53d6/\u542f\u52a8";
    }

    public static String m(String string) {
        String string2 = B.w(string);
        if ("pan115".equals(string2)) {
            return "115\u7f51\u76d8";
        }
        string2.getClass();
        int n2 = -1;
        switch (string2.hashCode()) {
            default: {
                break;
            }
            case 366170676: {
                if (!string2.equals("guangya")) break;
                n2 = 8;
                break;
            }
            case 107940278: {
                if (!string2.equals("quark")) break;
                n2 = 7;
                break;
            }
            case 93498907: {
                if (!string2.equals("baidu")) break;
                n2 = 6;
                break;
            }
            case 96670: {
                if (!string2.equals("ali")) break;
                n2 = 5;
                break;
            }
            case 3726: {
                if (!string2.equals("uc")) break;
                n2 = 4;
                break;
            }
            case -730781036: {
                if (!string2.equals("yidong")) break;
                n2 = 3;
                break;
            }
            case -748033185: {
                if (!string2.equals("xunlei")) break;
                n2 = 2;
                break;
            }
            case -874016782: {
                if (!string2.equals("tianyi")) break;
                n2 = 1;
                break;
            }
            case -995595147: {
                if (!string2.equals("pan123")) break;
                n2 = 0;
            }
        }
        switch (n2) {
            default: {
                string2 = string;
                if (string == null) {
                    string2 = "";
                }
                return string2;
            }
            case 8: {
                return "\u5149\u9e2d\u7f51\u76d8";
            }
            case 7: {
                return "\u5938\u514b\u7f51\u76d8";
            }
            case 6: {
                return "\u767e\u5ea6\u7f51\u76d8";
            }
            case 5: {
                return "\u963f\u91cc\u4e91\u76d8";
            }
            case 4: {
                return "UC\u7f51\u76d8";
            }
            case 3: {
                return "\u79fb\u52a8\u4e91\u76d8";
            }
            case 2: {
                return "\u8fc5\u96f7\u7f51\u76d8";
            }
            case 1: {
                return "\u5929\u7ffc\u4e91\u76d8";
            }
            case 0: 
        }
        return "123\u7f51\u76d8";
    }

    public static ArrayList n() {
        String[] stringArray = C.y("pan_order");
        ArrayList arrayList = new ArrayList();
        if (stringArray != null && !stringArray.trim().isEmpty()) {
            stringArray = stringArray.split(",");
            int n2 = stringArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                B.a(stringArray[i2], arrayList);
            }
        }
        stringArray = k.iterator();
        while (stringArray.hasNext()) {
            B.a((String)stringArray.next(), arrayList);
        }
        return arrayList;
    }

    public static int o(String string) {
        if (string == null) {
            return 99;
        }
        int n2 = string.indexOf(95);
        int n3 = 0;
        String string2 = n2 > 0 ? string.substring(0, n2) : string;
        string2 = B.w(string2);
        n2 = B.n().indexOf(string2);
        if (n2 < 0) {
            n2 = 50;
        }
        if (!string.contains("original")) {
            n3 = string.contains("unlimited") ? 1 : (string.contains("smart") ? 2 : 5);
        }
        return n2 * 10 + n3;
    }

    public static int p(String string) {
        int n2;
        try {
            n2 = Integer.parseInt(C.y(B.G(string)).trim());
        }
        catch (Throwable throwable) {
            n2 = 0;
        }
        if (n2 > 0) {
            return n2;
        }
        return B.j(string);
    }

    public static boolean q() {
        return C.x().getBoolean("go_proxy_user_disabled", false) ^ true;
    }

    public static boolean r(String string) {
        return B.k().contains(B.w(string));
    }

    public static boolean s(String string) {
        return j.contains(string);
    }

    public static String u(int n2, String charSequence, Map object) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.putAll((Map<String, String>)object);
        hashMap.put("X-Thread-Num", String.valueOf(n2));
        object = F.a;
        com.github.catvod.spider.merge.mI.i.e(charSequence, "url");
        ((F)object).j();
        object = H.a((String)charSequence);
        F.h.put(object, charSequence);
        F.i.put(object, hashMap);
        n2 = F.b;
        charSequence = new StringBuilder("http://127.0.0.1:");
        ((StringBuilder)charSequence).append(n2);
        ((StringBuilder)charSequence).append("/proxy?key=");
        ((StringBuilder)charSequence).append((String)object);
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String v(File object) {
        Throwable throwable2222222;
        FileInputStream fileInputStream;
        block11: {
            fileInputStream = new FileInputStream((File)object);
            try {
                int n2;
                object = MessageDigest.getInstance("MD5");
                byte[] byArray = new byte[131072];
                while ((n2 = fileInputStream.read(byArray)) != -1) {
                    ((MessageDigest)object).update(byArray, 0, n2);
                }
            }
            catch (Throwable throwable2222222) {
                break block11;
            }
            object = B.H(((MessageDigest)object).digest());
            fileInputStream.close();
            return object;
            {
                catch (Throwable throwable3) {
                    return "";
                }
            }
        }
        try {
            fileInputStream.close();
            throw throwable2222222;
        }
        catch (Throwable throwable4) {
            try {}
            catch (Exception exception) {
                throw throwable2222222;
            }
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(throwable2222222, throwable4);
            throw throwable2222222;
        }
    }

    public static String w(String string) {
        if (string == null) {
            return "";
        }
        String string2 = string;
        if (string.endsWith("_vip")) {
            string2 = m.d(string, 4, 0);
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static A x(JsonElement object) {
        void var0_3;
        long l3;
        String string;
        if (object == null) return null;
        if (object.isJsonNull()) {
            return null;
        }
        if (object.isJsonPrimitive()) {
            return new A(object.getAsString(), "", 0L, "");
        }
        JsonObject jsonObject = object.getAsJsonObject();
        String string2 = string = B.F(jsonObject, "url");
        if (TextUtils.isEmpty((CharSequence)string)) {
            String string3 = B.F(jsonObject, "download");
        }
        string = B.F(jsonObject, "md5");
        long l2 = l3 = 0L;
        if (jsonObject == null) return new A((String)var0_3, string, l2, "");
        l2 = l3;
        try {
            if (!jsonObject.has("size")) return new A((String)var0_3, string, l2, "");
            l2 = l3;
            if (jsonObject.get("size").isJsonNull()) return new A((String)var0_3, string, l2, "");
            l2 = jsonObject.get("size").getAsLong();
            return new A((String)var0_3, string, l2, "");
        }
        catch (Throwable throwable) {
            l2 = l3;
            return new A((String)var0_3, string, l2, "");
        }
    }

    public static String y(String string, Map map, int n2, String string2) {
        if (B.q()) {
            return l.d(string, map, n2, string2);
        }
        return B.u(n2, string, map);
    }

    public final HashMap b(String string) {
        this.g();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("X-XJar-Token", this.g);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("|");
        stringBuilder.append(this.g);
        hashMap.put("X-XJar-Sign", B.E(stringBuilder.toString()));
        return hashMap;
    }

    public final String c() {
        StringBuilder stringBuilder = new StringBuilder("http://127.0.0.1:");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String d(String string, Map map, int n2, String charSequence) {
        Throwable throwable2;
        block4: {
            Object object;
            if (!this.f()) {
                return B.u(n2, string, map);
            }
            try {
                object = new StringBuilder("[GoProxy] register pan=");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append(", thread=");
                ((StringBuilder)object).append(n2);
                ((StringBuilder)object).append(", url=");
                ((StringBuilder)object).append(B.D(string));
                SpiderDebug.log((String)((StringBuilder)object).toString());
                object = new HashMap();
                ((HashMap)object).put("url", string);
                Object object2 = new HashMap(map);
                ((HashMap)object).put("headers", object2);
                ((HashMap)object).put("thread", n2);
                ((HashMap)object).put("pan", charSequence);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(this.c());
                ((StringBuilder)charSequence).append("/register");
                charSequence = ((StringBuilder)charSequence).toString();
                object2 = C.Z(object);
                object = new z(0);
                object = com.github.catvod.spider.merge.UY.A.k((String)charSequence, (String)object2, (Map)object).b();
                charSequence = C.R((String)object);
                charSequence = charSequence.has("url") ? charSequence.get("url").getAsString() : "";
            }
            catch (Throwable throwable2) {
                break block4;
            }
            if (!TextUtils.isEmpty((CharSequence)charSequence)) {
                return charSequence;
            }
            charSequence = new StringBuilder("[GoProxy] register empty response: ");
            ((StringBuilder)charSequence).append((String)object);
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            return B.u(n2, string, map);
        }
        m.p(throwable2, new StringBuilder("[GoProxy] register failed: "));
        return B.u(n2, string, map);
    }

    /*
     * Exception decompiling
     */
    public final boolean f() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 70->76)] java.lang.Throwable
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

    public final void g() {
        synchronized (this) {
            block4: {
                boolean bl = TextUtils.isEmpty((CharSequence)this.g);
                if (bl) break block4;
                return;
            }
            byte[] byArray = new byte[24];
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextBytes(byArray);
            this.g = B.H(byArray);
            return;
        }
    }

    public final boolean i() {
        for (int i2 = 17890; i2 < 17895; ++i2) {
            if (!"OK xjar-go-proxy mt-20260704.2".equals(this.z(i2))) continue;
            this.b = i2;
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public final boolean t() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [4 : 53->60)] java.lang.Throwable
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

    public final String z(int n2) {
        try {
            CharSequence charSequence = new StringBuilder("http://127.0.0.1:");
            charSequence.append(n2);
            charSequence.append("/health");
            charSequence = com.github.catvod.spider.merge.UY.A.n(charSequence.toString(), this.b("health"), 1, 1).trim();
            this.f = charSequence;
            return charSequence;
        }
        catch (Throwable throwable) {
            return "";
        }
    }
}

