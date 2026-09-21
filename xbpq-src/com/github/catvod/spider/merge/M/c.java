/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
package com.github.catvod.spider.merge.M;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.github.catvod.spider.merge.M.a;
import com.github.catvod.spider.merge.M.b;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.f;
import java.lang.reflect.Constructor;

public final class c {
    static {
        Object object;
        try {
            object = new a(c.a(Looper.getMainLooper()));
        }
        catch (Throwable throwable) {
            object = new f(throwable);
        }
        Object object2 = object;
        if (object instanceof f) {
            object2 = null;
        }
        object = (b)object2;
    }

    public static final Handler a(Looper object) {
        Constructor constructor;
        if (Build.VERSION.SDK_INT >= 28) {
            object = Handler.class.getDeclaredMethod(cYh.d("04222430233F2623383F34"), Looper.class).invoke(null, object);
            if (object != null) {
                return (Handler)object;
            }
            throw new NullPointerException(cYh.d("09252D3D7739063E2F3E237A0535613236291370353E7734083E6C3F22360B703528273F47312F3525350E346F3E24742F312F353B3F15"));
        }
        try {
            constructor = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return new Handler(object);
        }
        return (Handler)constructor.newInstance(object, null, Boolean.TRUE);
    }
}

