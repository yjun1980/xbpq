/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.K;

import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.K.c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class a {
    public static volatile a c;
    public static final Object d;
    @SerializedName(value="user")
    private c a;
    @SerializedName(value="saveFileIds")
    private Map<String, String> b;

    static {
        d = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b() {
        if (c != null) {
            return c;
        }
        Object object = d;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                Object object2;
                try {
                    if (c != null) {
                        return c;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                try {
                    object2 = C.P("pan123");
                    if (((String)object2).isEmpty()) return c = (object2 = new a());
                    c = com.github.catvod.spider.merge.xc.K.a.c((String)object2);
                    return c;
                }
                catch (Exception exception) {}
                object2 = new a();
                c = object2;
                return c;
            }
            throw throwable2;
        }
    }

    public static a c(String object) {
        if (((String)object).isEmpty()) {
            return new a();
        }
        a a2 = (a)new Gson().fromJson((String)object, a.class);
        object = a2;
        if (a2 == null) {
            object = new a();
        }
        return object;
    }

    public final c a() {
        c c2;
        c c3 = c2 = this.a;
        if (c2 == null) {
            c3 = new c();
        }
        return c3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(c c2) {
        Object object = d;
        synchronized (object) {
            this.a = c2;
            C.b0("pan123", this.toString());
            return;
        }
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

