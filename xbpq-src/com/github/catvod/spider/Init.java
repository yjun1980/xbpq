/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Handler
 *  android.os.Looper
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init$Loader;
import com.github.catvod.spider.merge.b.k;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.n;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Init {
    public static SharedPreferences d;
    public static String e = "9978";
    private final ExecutorService a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private Application c;

    public Init() {
        this.a = Executors.newFixedThreadPool(5);
    }

    public static Application context() {
        return Init.get().c;
    }

    public static void execute(Runnable runnable) {
        Init.get().a.execute(runnable);
    }

    public static Init get() {
        return Init$Loader.a;
    }

    public static Activity getActivity() {
        AnnotatedElement annotatedElement = Class.forName(cYh.d("063E25233833037E2021277426333538213313291539253F0634"));
        Object object2 = ((Class)annotatedElement).getMethod(cYh.d("042533233234131122253E2C0E2438053F28023125"), new Class[0]).invoke(null, new Object[0]);
        annotatedElement = ((Class)annotatedElement).getDeclaredField(cYh.d("0A1122253E2C0E24283424"));
        ((AccessibleObject)annotatedElement).setAccessible(true);
        for (Object object2 : ((Map)((Field)annotatedElement).get(object2)).values()) {
            Class<?> clazz = object2.getClass();
            annotatedElement = clazz.getDeclaredField(cYh.d("17313422323E"));
            ((AccessibleObject)annotatedElement).setAccessible(true);
            if (((Field)annotatedElement).getBoolean(object2)) continue;
            annotatedElement = clazz.getDeclaredField(cYh.d("0633353821331329"));
            ((AccessibleObject)annotatedElement).setAccessible(true);
            object2 = (Activity)((Field)annotatedElement).get(object2);
            SpiderDebug.log((String)object2.getComponentName().getClassName());
            return object2;
        }
        return null;
    }

    public static void init(Context context) {
        Init.get().c = (Application)context;
        d = context.getSharedPreferences(cYh.d("3F121100"), 0);
        n.a();
    }

    public static void run(Runnable runnable) {
        Init.get().b.post(runnable);
    }

    public static void run(Runnable runnable, int n2) {
        Init.get().b.postDelayed(runnable, (long)n2);
    }

    public static void show(String string) {
        Init.get().b.post((Runnable)new k(string, 1));
    }
}

