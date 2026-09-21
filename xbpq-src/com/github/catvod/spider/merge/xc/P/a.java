/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.P;

import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.P.b;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class a {
    public static volatile a b;
    public static final Object c;
    @SerializedName(value="user")
    private b a;

    static {
        c = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a c() {
        if (b != null) {
            return b;
        }
        Object object = c;
        synchronized (object) {
            Throwable throwable2;
            block11: {
                a a2;
                try {
                    if (b != null) {
                        return b;
                    }
                }
                catch (Throwable throwable2) {
                    break block11;
                }
                try {
                    Object object2;
                    Object object3 = C.P("xunlei");
                    if (((String)object3).isEmpty()) return b = (a2 = new a());
                    Object object4 = new Gson();
                    object4 = object2 = (a)object4.fromJson((String)object3, a.class);
                    if (object2 == null) {
                        object4 = new a();
                    }
                    object2 = object4;
                    if (((a)object4).b().a().isEmpty()) {
                        object2 = new Gson();
                        object3 = (b)object2.fromJson((String)object3, b.class);
                        object2 = object4;
                        if (object3 != null) {
                            object2 = object4;
                            if (!((b)object3).a().isEmpty()) {
                                object2 = new a();
                                ((a)object2).a = object3;
                                object4 = new Gson();
                                C.b0("xunlei", object4.toJson(object2));
                            }
                        }
                    }
                    b = object2;
                    return b;
                }
                catch (Exception exception) {}
                a2 = new a();
                b = a2;
                return b;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d() {
        Object object = c;
        synchronized (object) {
            b = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = c;
        synchronized (object) {
            b b2;
            this.a = b2 = new b();
            C.b0("xunlei", "");
        }
        com.github.catvod.spider.merge.xc.P.a.d();
    }

    public final b b() {
        b b2;
        b b3 = b2 = this.a;
        if (b2 == null) {
            b3 = new b();
        }
        return b3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(b b2) {
        Object object = c;
        synchronized (object) {
            this.a = b2;
            b2 = new Gson();
            C.b0("xunlei", b2.toJson(this));
            return;
        }
    }
}

