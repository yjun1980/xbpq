package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.b.k;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.n;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class Init {
    public static SharedPreferences d = null;
    public static String e = "9978";
    private Application c;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ExecutorService a = Executors.newFixedThreadPool(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class Loader {
        static volatile Init a = new Init();

        private Loader() {
        }
    }

    public static Application context() {
        return get().c;
    }

    public static void execute(Runnable runnable) {
        get().a.execute(runnable);
    }

    public static Init get() {
        return Loader.a;
    }

    public static Activity getActivity() {
        Class<?> cls = Class.forName(cYh.d("063E25233833037E2021277426333538213313291539253F0634"));
        Object invoke = cls.getMethod(cYh.d("042533233234131122253E2C0E2438053F28023125"), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(cYh.d("0A1122253E2C0E24283424"));
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(invoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(cYh.d("17313422323E"));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField(cYh.d("0633353821331329"));
                declaredField3.setAccessible(true);
                Activity activity = (Activity) declaredField3.get(obj);
                SpiderDebug.log(activity.getComponentName().getClassName());
                return activity;
            }
        }
        return null;
    }

    public static void init(Context context) {
        get().c = (Application) context;
        d = context.getSharedPreferences(cYh.d("3F121100"), 0);
        n.a();
    }

    public static void run(Runnable runnable) {
        get().b.post(runnable);
    }

    public static void run(Runnable runnable, int i) {
        get().b.postDelayed(runnable, i);
    }

    public static void show(String str) {
        get().b.post(new k(str, 1));
    }
}
