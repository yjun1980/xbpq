/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init$Loader;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.G1.a;
import com.github.catvod.spider.merge.I.J;
import com.github.catvod.spider.merge.I.J0;
import com.github.catvod.spider.merge.I.T;
import com.github.catvod.spider.merge.I.d;
import com.github.catvod.spider.merge.I.g;
import com.github.catvod.spider.merge.I.h;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.g0.i;
import com.github.catvod.spider.merge.g0.j;
import com.github.catvod.spider.merge.g0.l;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.y.z;
import com.github.catvod.utils.server.Server;
import com.github.catvod.utils.server.ServerStart;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class Init {
    private static String g = "";
    public static String h = "";
    public static String i = "";
    public static String j = "";
    public static String k = "";
    public static String l = "";
    public static String m = "";
    public static String n = "";
    public String a = "";
    public String b = "";
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ExecutorService d;
    private final Handler e = new Handler(Looper.getMainLooper());
    public Application f;

    public Init() {
        this.d = Executors.newFixedThreadPool(5);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Init init, boolean bl, JSONObject object) {
        Object object2;
        block17: {
            int n2;
            int n3;
            Object object3;
            block18: {
                block16: {
                    Objects.requireNonNull(init);
                    object2 = com.github.catvod.spider.merge.c.b.c("tv", ".tgsou_api_session");
                    object3 = new File((String)object2);
                    boolean bl2 = ((File)object3).exists();
                    n3 = 0;
                    if (!bl2) break block16;
                    n2 = Server.l;
                    try {
                        bl2 = com.github.catvod.spider.merge.R0.e.d(com.github.catvod.spider.merge.f0.d.p("http://127.0.0.1:9999", 1L));
                    }
                    catch (Exception exception) {
                        bl2 = false;
                    }
                    if (!bl2) break block18;
                }
                if (!bl) {
                    return;
                }
            }
            try {
                j = init.h("tgsou-linux", "tgsou-arm64", "tgsou-armV7");
                object3 = new StringBuilder();
                ((StringBuilder)object3).append(Init.context().getFilesDir().getAbsolutePath());
                ((StringBuilder)object3).append("/");
                ((StringBuilder)object3).append(j);
                object2 = new File(((StringBuilder)object3).toString());
                object3 = new File(((File)object2).getParent(), "tmp");
                if (!((File)object3).exists()) {
                    ((File)object3).mkdir();
                }
                init.j(j, (File)object2);
                object3 = com.github.catvod.spider.merge.c.b.c("tv", ".tgsou_api_session");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Init.context().getFilesDir().getAbsolutePath());
                stringBuilder.append("/193316_session_0.txt");
                object2 = new File(stringBuilder.toString());
                File file = new File((String)object3);
                com.github.catvod.spider.merge.c.b.f((File)object2, com.github.catvod.spider.merge.c.b.d(file));
                object3 = "";
                n2 = n3;
                if (object.has("proxy")) {
                    n2 = n3;
                    if (com.github.catvod.spider.merge.R0.e.d(object.getString("proxy"))) {
                        n2 = 1;
                    }
                }
                object2 = object3;
                if (n2 != 0) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(" --proxy ");
                    ((StringBuilder)object2).append(object.getString("proxy"));
                    object2 = ((StringBuilder)object2).toString();
                }
                break block17;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                SpiderDebug.log((String)"extract assets fail");
            }
            return;
            catch (JSONException jSONException) {
                object2 = object3;
            }
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("TMPDIR=$(cd .. && echo $(pwd)/cache) ./");
        ((StringBuilder)object).append(j);
        ((StringBuilder)object).append(" --qr");
        ((StringBuilder)object).append((String)object2);
        object = ((StringBuilder)object).toString();
        init.executeBinary(j, (String)object, "my_tgoutput.log", true);
    }

    public static /* synthetic */ void b(Init init, Context context, boolean bl) {
        Objects.requireNonNull(init);
        for (int i2 = 0; i2 < 5; ++i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(u.p().c);
            stringBuilder.append("/api/ping");
            if (com.github.catvod.spider.merge.R0.e.d(com.github.catvod.spider.merge.f0.d.p(stringBuilder.toString(), 1L))) break;
            init.i(context, bl, "goProxy_arm64");
            stringBuilder = new StringBuilder();
            stringBuilder.append(u.p().c);
            stringBuilder.append("/api/ping");
            if (!com.github.catvod.spider.merge.R0.e.b(com.github.catvod.spider.merge.f0.d.p(stringBuilder.toString(), 1L))) continue;
            init.i(context, bl, "goProxy_armV7");
        }
    }

    public static /* synthetic */ void c(Init init, Boolean bl) {
        Objects.requireNonNull(init);
        try {
            m = init.h("alist-linux", "alist-arm64", "alist-armV7");
            CharSequence charSequence = new StringBuilder();
            charSequence.append(Init.context().getFilesDir().getAbsolutePath());
            charSequence.append("/");
            charSequence.append(m);
            Object object = new File(charSequence.toString());
            init.j(m, (File)object);
            charSequence = new StringBuilder();
            charSequence.append("nohup ./");
            charSequence.append(m);
            charSequence.append(" admin set admin");
            charSequence = charSequence.toString();
            object = new StringBuilder();
            ((StringBuilder)object).append("nohup ./");
            ((StringBuilder)object).append(m);
            ((StringBuilder)object).append(" server");
            object = ((StringBuilder)object).toString();
            init.executeBinary(m, (String)charSequence, "my_alist.log", bl);
            init.executeBinary(m, (String)object, "my_alist.log", bl);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            SpiderDebug.log((String)"extract assets fail");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void checkPermission() {
        Activity activity = Init.getActivity();
        if (activity == null) return;
        try {
            if (Build.VERSION.SDK_INT < 23) return;
            if (activity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9999);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static Application context() {
        return Init.get().f;
    }

    public static /* synthetic */ void d(Init init, Boolean bl) {
        Objects.requireNonNull(init);
        try {
            n = init.h("filebrowser-linux", "filebrowser-arm64", "filebrowser-armV7");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Init.context().getFilesDir().getAbsolutePath());
            stringBuilder.append("/");
            stringBuilder.append(n);
            Object object = new File(stringBuilder.toString());
            init.j(n, (File)object);
            stringBuilder = new StringBuilder();
            stringBuilder.append("HOME=/Users/my_username ");
            stringBuilder.append(((File)object).getAbsolutePath());
            stringBuilder.append(" -a 0.0.0.0 -r /storage/emulated/0");
            object = stringBuilder.toString();
            init.executeBinary(n, (String)object, "my_filebrowser.log", bl);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            SpiderDebug.log((String)"extract assets fail");
        }
    }

    public static /* synthetic */ void e(Init init, Boolean bl) {
        Objects.requireNonNull(init);
        try {
            k = init.h("allinone-linux", "allinone-arm64", "allinone-armV7");
            CharSequence charSequence = new StringBuilder();
            charSequence.append(Init.context().getFilesDir().getAbsolutePath());
            charSequence.append("/");
            charSequence.append(k);
            File file = new File(charSequence.toString());
            init.j(k, file);
            charSequence = new StringBuilder();
            charSequence.append("nohup ./");
            charSequence.append(k);
            charSequence = charSequence.toString();
            init.executeBinary(k, (String)charSequence, "my_allinoneutput.log", bl);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            SpiderDebug.log((String)"extract assets fail");
        }
    }

    public static void execute(Runnable runnable) {
        Init.get().d.execute(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void f(Init init, JSONObject object, Boolean bl) {
        Objects.requireNonNull(init);
        try {
            Object object2 = com.github.catvod.spider.merge.c.b.c("tv", ".tgsou_api_session");
            Comparable<File> comparable = new Comparable<File>((String)object2);
            if (((File)comparable).exists()) {
                return;
            }
            l = init.h("tgsou-go-linux-amd64", "tgsou-go-linux-arm64", "tgsou-go-linux-arm");
            comparable = new Comparable<File>();
            ((StringBuilder)comparable).append(Init.context().getFilesDir().getAbsolutePath());
            ((StringBuilder)comparable).append("/");
            ((StringBuilder)comparable).append(l);
            object2 = new File(((StringBuilder)comparable).toString());
            init.j(l, (File)object2);
            boolean bl2 = object.has("proxy");
            if (bl2 && com.github.catvod.spider.merge.R0.e.d(object.getString("proxy"))) {
                comparable = new Comparable<File>();
                ((StringBuilder)comparable).append("nohup ./");
                ((StringBuilder)comparable).append(l);
                ((StringBuilder)comparable).append(" -proxy ");
                ((StringBuilder)comparable).append(object.getString("proxy"));
                object = ((StringBuilder)comparable).toString();
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("nohup ./");
                ((StringBuilder)object).append(l);
                object = ((StringBuilder)object).toString();
            }
            init.executeBinary(l, (String)object, "my_tgsou-go.log", bl);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            SpiderDebug.log((String)"extract assets fail");
        }
    }

    public static /* synthetic */ void g(Init init) {
        Objects.requireNonNull(init);
        try {
            Object object = new File(BaseApi.get().a);
            if (((File)object).exists()) {
                i = init.h("sing-box-linux", "sing-box-arm64", "sing-box-armV7");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Init.context().getFilesDir().getAbsolutePath());
                stringBuilder.append("/");
                stringBuilder.append(i);
                object = new File(stringBuilder.toString());
                init.j(i, (File)object);
                object = new StringBuilder();
                ((StringBuilder)object).append("nohup ./");
                ((StringBuilder)object).append(i);
                ((StringBuilder)object).append(" run ");
                object = ((StringBuilder)object).toString();
                init.executeBinary(i, (String)object, "my_singboxoutput.log", true);
            }
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("singbox start fail ");
            stringBuilder.append(exception.getMessage());
            com.github.catvod.spider.merge.i0.m.y(stringBuilder.toString());
        }
    }

    public static Init get() {
        return Init$Loader.a;
    }

    public static Activity getActivity() {
        Object object = Class.forName("android.app.ActivityThread");
        Object object2 = ((Class)object).getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        object = ((Class)object).getDeclaredField("mActivities");
        ((AccessibleObject)object).setAccessible(true);
        object = ((Map)((Field)object).get(object2)).values().iterator();
        while (object.hasNext()) {
            object2 = object.next();
            Class<?> clazz = object2.getClass();
            Field field = clazz.getDeclaredField("paused");
            ((AccessibleObject)field).setAccessible(true);
            if (field.getBoolean(object2)) continue;
            object = clazz.getDeclaredField("activity");
            ((AccessibleObject)object).setAccessible(true);
            object2 = (Activity)((Field)object).get(object2);
            object = com.github.catvod.spider.merge.C.a.c("getActivity:");
            ((StringBuilder)object).append(object2.getComponentName().getClassName());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return object2;
        }
        return null;
    }

    public static Activity getConfigActivity() {
        AnnotatedElement annotatedElement2 = Class.forName("android.app.ActivityThread");
        Iterator iterator = ((Class)annotatedElement2).getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        annotatedElement2 = ((Class)annotatedElement2).getDeclaredField("mActivities");
        ((AccessibleObject)annotatedElement2).setAccessible(true);
        for (AnnotatedElement annotatedElement2 : ((Map)((Field)annotatedElement2).get(iterator)).values()) {
            Field field = annotatedElement2.getClass().getDeclaredField("activity");
            ((AccessibleObject)field).setAccessible(true);
            if (!(annotatedElement2 = (Activity)field.get(annotatedElement2)).getComponentName().getClassName().contains("Home") && !annotatedElement2.getComponentName().getClassName().contains("Main")) continue;
            return annotatedElement2;
        }
        return null;
    }

    private String h(String string, String string2, String string3) {
        String string4 = Arrays.toString(Build.SUPPORTED_ABIS);
        if (string4.contains("x86")) {
            return string;
        }
        if (string4.contains("arm64")) {
            return string2;
        }
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void i(Context object, boolean bl, String object2) {
        try {
            if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)object2)) {
                object2 = this.h("goProxy_linux", "goProxy_arm64", "goProxy_armV7");
            }
            h = object2;
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(Init.context().getFilesDir().getAbsolutePath());
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append(h);
            object2 = new File(((StringBuilder)charSequence).toString());
            charSequence = com.github.catvod.spider.merge.c.b.c("tv/lib", "goProxy55");
            Object object3 = new File((String)charSequence);
            boolean bl2 = ((File)object3).exists();
            if (bl2) {
                object3 = new FileInputStream((String)charSequence);
                Init.write((File)object2, (InputStream)object3);
                ((File)object2).setExecutable(true);
            } else {
                this.j(h, (File)object2);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("nohup ");
            ((StringBuilder)charSequence).append(((File)object2).getAbsolutePath());
            ((StringBuilder)charSequence).append(" --md5=ajdadywekgjjbwdasdasiwqcbbdg");
            charSequence = ((StringBuilder)charSequence).toString();
            object2 = charSequence;
            if (com.github.catvod.spider.merge.R0.e.d(this.b)) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)charSequence);
                ((StringBuilder)object2).append(" --proxy=");
                ((StringBuilder)object2).append(this.b);
                object2 = ((StringBuilder)object2).toString();
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(" --appPath=");
            ((StringBuilder)charSequence).append(object.getPackageResourcePath());
            object2 = ((StringBuilder)charSequence).toString();
            object = new StringBuilder();
            ((StringBuilder)object).append("goProxy command: ");
            ((StringBuilder)object).append((String)object2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            charSequence = h;
            object = bl2 ? "goProxy.log" : "";
            this.executeBinary((String)charSequence, (String)object2, (String)object, bl);
            return;
        }
        catch (Exception exception) {
            s.b("doGoProxy error:", exception);
        }
    }

    public static void init(Context context) {
        Init.get().f = (Application)context;
        SpiderDebug.log((String)"\u81ea\u5b9a\u7fa9\u722c\u87f2\u4ee3\u78bc\u8f09\u5165\u6210\u529f\uff01");
        Init.get().exeLibStub();
        Init.startProxyServer();
        new Thread(com.github.catvod.spider.merge.g0.j.f).start();
    }

    public static void interceptActivitySch() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(com.github.catvod.spider.merge.g0.i.f, 1L, 1L, TimeUnit.SECONDS);
    }

    public static void interceptActivityStart() {
        AnnotatedElement annotatedElement2 = Class.forName("android.app.ActivityThread");
        Iterator iterator = ((Class)annotatedElement2).getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        annotatedElement2 = ((Class)annotatedElement2).getDeclaredField("mActivities");
        ((AccessibleObject)annotatedElement2).setAccessible(true);
        for (AnnotatedElement annotatedElement2 : ((Map)((Field)annotatedElement2).get(iterator)).values()) {
            Field field = annotatedElement2.getClass().getDeclaredField("activity");
            ((AccessibleObject)field).setAccessible(true);
            if ((field = (Activity)field.get(annotatedElement2)) == null || !(annotatedElement2 = field.getComponentName()).getClassName().contains("Video") && !annotatedElement2.getClassName().contains("Detail")) continue;
            field.finish();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(String var1_1, File var2_3) {
        block10: {
            block11: {
                block9: {
                    var5_5 = com.github.catvod.spider.merge.c.b.c("tv/lib", (String)var1_1);
                    if (!new File((String)var5_5).exists()) break block9;
                    var1_1 = new FileInputStream((String)var5_5);
                    break block10;
                }
                var6_6 = z.b(new StringBuilder(), this.a, (String)var1_1, "");
                var5_5 = z.b(new StringBuilder(), this.a, (String)var1_1, ".md5");
                if (var2_3.exists()) break block11;
                var1_1 = r.d((String)var1_1, ":\u4e0d\u5b58\u5728:");
                ** GOTO lbl54
            }
            var8_7 = MessageDigest.getInstance("MD5");
            var7_8 = new FileInputStream(var2_3);
            var9_9 = new byte[8192];
            while (true) {
                var4_11 = var7_8.read(var9_9);
                if (var4_11 <= 0) break;
                var8_7.update(var9_9, 0, var4_11);
            }
            var8_7 = var8_7.digest();
            var7_8 = new StringBuilder();
            var4_11 = ((Object)var8_7).length;
            for (var3_10 = 0; var3_10 < var4_11; ++var3_10) {
                var7_8.append(Integer.toString((var8_7[var3_10] & 255) + 256, 16).substring(1));
            }
            var7_8 = var7_8.toString();
            var8_7 = new StringBuilder();
            var8_7.append((String)var1_1);
            var8_7.append(":localMd5:");
            var8_7.append((String)var7_8);
            SpiderDebug.log((String)var8_7.toString());
            if (com.github.catvod.spider.merge.f0.d.k((String)var5_5).contains((CharSequence)var7_8)) {
                var5_5 = new StringBuilder();
                var5_5.append((String)var1_1);
                var5_5.append(":\u4e0e\u7ebf\u4e0a\u4e00\u81f4:");
                SpiderDebug.log((String)var5_5.toString());
                var1_1 = new FileInputStream(var2_3);
            } else {
                var5_5 = new StringBuilder();
                var5_5.append((String)var1_1);
                var5_5.append(":\u91cd\u65b0\u4e0b\u8f7d:");
                var5_5.append((String)var7_8);
                var1_1 = var5_5;
lbl54:
                // 2 sources

                SpiderDebug.log((String)var1_1.toString());
                var1_1 = com.github.catvod.spider.merge.i0.m.l(var6_6);
            }
        }
        Init.write(var2_3, (InputStream)var1_1);
        var2_3.setExecutable(true);
        return;
        finally {
            var7_8.close();
        }
    }

    @SuppressLint(value={"UnsafeDynamicallyLoadedCode"})
    private void k() {
        Comparable<StringBuilder> comparable = new StringBuilder();
        ((StringBuilder)comparable).append(Init.context().getCacheDir().getAbsolutePath());
        ((StringBuilder)comparable).append("/");
        ((StringBuilder)comparable).append("libstub.so");
        ((StringBuilder)comparable).append(UUID.randomUUID());
        comparable = new File(((StringBuilder)comparable).toString());
        if (((File)comparable).exists()) {
            ((File)comparable).delete();
        }
        ClassLoader classLoader = this.getClass().getClassLoader();
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("assets/libs/");
        stringBuilder.append(g);
        Init.write(comparable, classLoader.getResourceAsStream(stringBuilder.toString()));
        try {
            stringBuilder = new StringBuilder();
            stringBuilder.append(g);
            stringBuilder.append(" length:");
            stringBuilder.append(((File)comparable).length());
            SpiderDebug.log((String)stringBuilder.toString());
            System.load(((File)comparable).getAbsolutePath());
            return;
        }
        catch (Throwable throwable) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(g);
            stringBuilder.append("libstubExtracted error\uff1a");
            stringBuilder.append(throwable.getMessage());
            SpiderDebug.log((String)stringBuilder.toString());
            throw throwable;
        }
    }

    private static void l(InputStream closeable, String string, boolean bl) {
        closeable = new BufferedReader(new InputStreamReader((InputStream)closeable));
        com.github.catvod.spider.merge.B.e.d(string, ":");
        while ((string = ((BufferedReader)closeable).readLine()) != null) {
            boolean bl2 = string.contains("not found") || string.contains("killall") || string.contains("sing-box") || string.contains("goProxy") || string.contains("Killed");
            if (bl2) continue;
            SpiderDebug.log((String)string);
            if (!bl) continue;
            com.github.catvod.spider.merge.i0.m.y(string);
        }
    }

    private static String m(String string, String string2, String string3) {
        int n2 = string.indexOf(string2);
        if (n2 < 0) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.substring(0, n2));
        stringBuilder.append(string3);
        stringBuilder.append(string.substring(string2.length() + n2));
        return stringBuilder.toString();
    }

    private static String n(String string) {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("'");
        stringBuilder.append(string.replace("'", "'\\''"));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public static void run(Runnable runnable) {
        Init.get().e.post(runnable);
    }

    public static void run(Runnable runnable, int n2) {
        Init.get().e.postDelayed(runnable, (long)n2);
    }

    public static void show(String string) {
        Init.get().e.post((Runnable)new d(string, 5));
    }

    public static void startProxyServer() {
        try {
            ServerStart.a().c();
        }
        catch (Exception exception) {
            SpiderDebug.log((String)"ailProxyDanmuServer error");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u8acb\u4f7f\u7528 ");
            stringBuilder.append(exception.getCause());
            com.github.catvod.spider.merge.i0.m.y(stringBuilder.toString());
            exception.printStackTrace();
        }
    }

    /*
     * Exception decompiling
     */
    public static void write(File var0, InputStream var1_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    public void exeAListProxy(Context context, Boolean bl) {
        this.d.execute(new J(this, bl, 2));
    }

    public void exeAllInOneProxy(Context context, Boolean bl) {
        this.d.execute(new h(this, bl, 6));
    }

    public void exeFileProxy(Context context, Boolean bl) {
        this.d.execute(new g(this, bl, 2));
    }

    public void exeGoProxy(Context context, boolean bl) {
        new Thread(new l(this, context, bl)).start();
    }

    public void exeLibStub() {
        try {
            g = "arm64-v8a/libstub.so";
            this.k();
        }
        catch (Throwable throwable) {
            g = "armeabi-v7a/libstub.so";
            try {
                this.k();
            }
            catch (Throwable throwable2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(g);
                stringBuilder.append(" load fail ex");
                stringBuilder.append(throwable2.getMessage());
                com.github.catvod.spider.merge.i0.m.y(stringBuilder.toString());
            }
        }
    }

    public void exeSingBoxProxy(Context context) {
        this.d.execute(new T(this, 3));
    }

    public void exeTgProxy(boolean bl, JSONObject jSONObject, Context context) {
        this.d.execute(new J0(this, bl, jSONObject, 1));
    }

    public void exeTgSouGoProxy(Context context, Boolean bl, JSONObject jSONObject) {
        this.d.execute(new com.github.catvod.spider.merge.I.j(this, jSONObject, bl, 2));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void executeBinary(String var1_1, String var2_3, String var3_5, boolean var4_6) {
        block16: {
            block15: {
                block17: {
                    block14: {
                        var8_7 = new StringBuilder();
                        var8_7.append(Init.context().getFilesDir().getAbsolutePath());
                        var8_7.append("/");
                        var8_7.append((String)var1_1);
                        var9_8 = new File(var8_7.toString());
                        var5_9 /* !! */  = Build.VERSION.SDK_INT;
                        var7_10 = false;
                        var5_9 /* !! */  = var5_9 /* !! */  >= 29 && Init.context().getApplicationInfo().targetSdkVersion >= 29 ? 1 : 0;
                        if (var5_9 /* !! */  != 0) break block14;
                        var1_1 = var2_3;
                        break block15;
                    }
                    var8_7 = new FileInputStream((File)var9_8);
                    var10_11 = new byte[5];
                    if (var8_7.read((byte[])var10_11) != 5 || var10_11[0] != 127 || var10_11[1] != 69 || var10_11[2] != 76 || var10_11[3] != 70) break block16;
                    var5_9 /* !! */  = (int)var10_11[4];
                    if (var5_9 /* !! */  != 2) break block17;
                    var8_7.close();
                    ** GOTO lbl-1000
                }
                var5_9 /* !! */  = (int)var10_11[4];
                var8_7.close();
                if (var5_9 /* !! */  != 1 && Build.SUPPORTED_64_BIT_ABIS.length > 0) lbl-1000:
                // 2 sources

                {
                    var5_9 /* !! */  = 1;
                } else {
                    var5_9 /* !! */  = 0;
                }
                var8_7 = var5_9 /* !! */  != 0 ? "/apex/com.android.runtime/bin/linker64" : "/apex/com.android.runtime/bin/linker";
                if (!new File((String)var8_7).exists()) {
                    var8_7 = var5_9 /* !! */  != 0 ? "/system/bin/linker64" : "/system/bin/linker";
                }
                var10_11 = new StringBuilder();
                var10_11.append(Init.n((String)var8_7));
                var10_11.append(" ");
                var10_11.append(Init.n(var9_8.getAbsolutePath()));
                var10_11 = var10_11.toString();
                var8_7 = var9_8.getAbsolutePath();
                var11_12 = com.github.catvod.spider.merge.B.e.c("./", (String)var1_1);
                var1_1 = var8_7 = Init.m((String)var2_3, (String)var8_7, (String)var10_11);
                if (var8_7.equals(var2_3)) {
                    var1_1 = Init.m((String)var2_3, var11_12, (String)var10_11);
                }
                if (var1_1.equals(var2_3)) {
                    var1_1 = s.a((String)var10_11, " ", (String)var2_3);
                }
                com.github.catvod.spider.merge.B.e.d("system linker command: ", (String)var1_1);
            }
            var8_7 = Runtime.getRuntime().exec("/system/bin/sh\n");
            var2_3 = new DataOutputStream(var8_7.getOutputStream());
            var10_11 = com.github.catvod.spider.merge.C.a.c("cd ");
            var10_11.append(var9_8.getParent());
            var10_11.append("\n");
            var2_3.writeBytes(var10_11.toString());
            var10_11 = new StringBuilder();
            var10_11.append("chmod 777 ");
            var10_11.append(var9_8.getParent());
            var10_11.append("\n");
            var2_3.writeBytes(var10_11.toString());
            var10_11 = new StringBuilder();
            var10_11.append("chmod 777 ");
            var10_11.append(var9_8.getAbsolutePath());
            var10_11.append("\n");
            var2_3.writeBytes(var10_11.toString());
            var10_11 = new StringBuilder();
            var10_11.append("export LD_LIBRARY_PATH=");
            var10_11.append(var9_8.getParent());
            var10_11.append(":");
            var10_11.append(var9_8.getParent());
            var10_11.append("/libs:$LD_LIBRARY_PATH\n");
            var2_3.writeBytes(var10_11.toString());
            var2_3.writeBytes("export OPENSSL_CONF=/dev/null\n");
            var10_11 = new StringBuilder();
            var10_11.append("export OPENSSL_MODULES=");
            var10_11.append(var9_8.getParent());
            var10_11.append("/libs\n");
            var2_3.writeBytes(var10_11.toString());
            var9_8 = new CharSequence[]{var3_5};
            var5_9 /* !! */  = com.github.catvod.spider.merge.R0.e.a;
            var5_9 /* !! */  = Array.getLength(var9_8) == 0 ? 1 : 0;
            if (var5_9 /* !! */  != 0) {
                var6_13 = var7_10;
            } else {
                var5_9 /* !! */  = 0;
                while (true) {
                    var6_13 = var7_10;
                    if (var5_9 /* !! */  >= 1) break;
                    if (com.github.catvod.spider.merge.R0.e.b(var9_8[var5_9 /* !! */ ])) {
                        var6_13 = true;
                        break;
                    }
                    ++var5_9 /* !! */ ;
                }
            }
            var1_1 = (var6_13 ^ true) != false ? com.github.catvod.spider.merge.G1.a.a((String)var1_1, " > ", com.github.catvod.spider.merge.c.b.c("tv/log", var3_5), " 2>&1\n") : com.github.catvod.spider.merge.B.e.c((String)var1_1, "\n");
            var2_3.writeBytes((String)var1_1);
            var2_3.flush();
            var2_3.writeBytes("exit\n");
            var2_3.flush();
            Init.l(var8_7.getInputStream(), "Output", var4_6);
            Init.l(var8_7.getErrorStream(), "Error", var4_6);
            var8_7.waitFor();
            return;
        }
        try {
            var2_3 = new StringBuilder();
            var2_3.append("\u65e0\u6548 ELF \u6587\u4ef6: ");
            var2_3.append(var9_8.getAbsolutePath());
            var1_1 = new IOException(var2_3.toString());
            throw var1_1;
        }
        catch (Throwable var1_2) {
            try {
                var8_7.close();
            }
            catch (Throwable var2_4) {
                var1_2.addSuppressed(var2_4);
            }
            throw var1_2;
        }
    }
}

