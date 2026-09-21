package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.github.catvod.spider.merge.l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186t {
    private static final Object a;
    public static final /* synthetic */ int b = 0;

    static {
        Object obj;
        String d = cYh.d("14252F7F3A3314336F1B362C061C203F301B0433242224");
        Method method = null;
        try {
            obj = Class.forName(cYh.d("14252F7F3A3314336F023F3B15352502323915353522"), false, null).getMethod(cYh.d("0035351B362C061C203F301B0433242224"), new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            obj = null;
        }
        a = obj;
        if (obj != null) {
            try {
                Class.forName(d, false, null).getMethod(cYh.d("00353502233B043B1523363902152D343A3F0924"), Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (Throwable unused2) {
            }
        }
        Object obj2 = a;
        if (obj2 != null) {
            try {
                try {
                    method = Class.forName(d, false, null).getMethod(cYh.d("00353502233B043B15233639021424212332"), Throwable.class);
                } catch (ThreadDeath e3) {
                    throw e3;
                } catch (Throwable unused3) {
                }
                if (method == null) {
                } else {
                    method.invoke(obj2, new Throwable());
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
            }
        }
    }
}
