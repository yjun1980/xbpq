/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.d;
import com.github.catvod.spider.merge.H.f;
import com.github.catvod.spider.merge.H.v;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class m {
    private static boolean a;

    static {
        try {
            Class.forName("java.sql.Time");
            a = true;
        }
        catch (Throwable throwable) {
            a = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static <T, U, R> R a(d<T, U, R> object, T t2, U u2) {
        if (a) {
            Objects.requireNonNull((v)object);
            object = (Class)u2;
            if (object == Date.class) {
                object = A.s(t2);
                return (R)object;
            }
            if (object == Time.class) {
                object = A.t(t2);
                return (R)object;
            }
            if (object == Timestamp.class) {
                object = m.b(A.R, t2);
                return (R)object;
            }
        }
        object = null;
        return (R)object;
    }

    public static <ARG, T> T b(f<ARG, T> f2, ARG ARG) {
        if (a) {
            return f2.apply(ARG);
        }
        return null;
    }

    public static <T> T c(Callable<T> callable) {
        if (a) {
            try {
                callable = callable.call();
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
            return (T)callable;
        }
        return null;
    }
}

