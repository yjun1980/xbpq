/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.G.f;
import com.github.catvod.spider.merge.xc.G.h;
import com.github.catvod.spider.merge.xc.G.o;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class c {
    public static volatile c d;
    public static final Object e;
    @SerializedName(value="user")
    private o a;
    @SerializedName(value="oauth")
    private h b;
    @SerializedName(value="drive")
    private f c;

    static {
        e = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c d() {
        if (d != null) {
            return d;
        }
        Object object = e;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                c c2;
                try {
                    if (d != null) {
                        return d;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                try {
                    Object object2 = C.P("aliyun");
                    if (((String)object2).isEmpty()) return d = (c2 = new c());
                    Object object3 = new Gson();
                    object2 = (c)object3.fromJson((String)object2, c.class);
                    object3 = object2;
                    if (object2 == null) {
                        object3 = new c();
                    }
                    d = object3;
                    return d;
                }
                catch (Exception exception) {}
                c2 = new c();
                d = c2;
                return d;
            }
            throw throwable2;
        }
    }

    public final f a() {
        if (this.c == null) {
            this.c = new f();
        }
        return this.c;
    }

    public final h b() {
        if (this.b == null) {
            this.b = new h();
        }
        return this.b;
    }

    public final o c() {
        if (this.a == null) {
            this.a = new o();
        }
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(f f2) {
        Object object = e;
        synchronized (object) {
            this.c = f2;
            C.b0("aliyun", this.toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(h h2) {
        Object object = e;
        synchronized (object) {
            this.b = h2;
            C.b0("aliyun", this.toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(o o2) {
        Object object = e;
        synchronized (object) {
            this.a = o2;
            C.b0("aliyun", this.toString());
            return;
        }
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

