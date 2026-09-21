package com.github.catvod.spider.merge.M;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0248f;

/* loaded from: classes.dex */
public final class c {
    static {
        Object c0248f;
        try {
            c0248f = new a(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            c0248f = new C0248f(th);
        }
        if (c0248f instanceof C0248f) {
            c0248f = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod(cYh.d("04222430233F2623383F34"), Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (Handler) invoke;
        }
        throw new NullPointerException(cYh.d("09252D3D7739063E2F3E237A0535613236291370353E7734083E6C3F22360B703528273F47312F3525350E346F3E24742F312F353B3F15"));
    }
}
