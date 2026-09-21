/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.N;

import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.N.d;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class a {
    public static volatile a c;
    public static final Object d;
    @SerializedName(value="user")
    private d a;
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
    public static a a() {
        if (c != null) {
            return c;
        }
        Object object = d;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                a a2;
                try {
                    if (c != null) {
                        return c;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                try {
                    Object object2 = C.P("tianyi");
                    if (((String)object2).isEmpty()) return c = (a2 = new a());
                    Object object3 = new Gson();
                    object2 = (a)object3.fromJson((String)object2, a.class);
                    object3 = object2;
                    if (object2 == null) {
                        object3 = new a();
                    }
                    c = object3;
                    return c;
                }
                catch (Exception exception) {}
                a2 = new a();
                c = a2;
                return c;
            }
            throw throwable2;
        }
    }

    public static String b() {
        d d2;
        d d3 = d2 = com.github.catvod.spider.merge.xc.N.a.a().a;
        if (d2 == null) {
            d3 = new d("");
        }
        return d3.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(d d2) {
        Object object = d;
        synchronized (object) {
            this.a = d2;
            C.b0("tianyi", this.toString());
            return;
        }
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

