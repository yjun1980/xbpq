/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.L;

import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.L.c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
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
    public static a c() {
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
                    Object object2 = C.P("quark");
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

    public static String d() {
        return com.github.catvod.spider.merge.xc.L.a.c().b().a();
    }

    public final String a(String string) {
        Map<String, String> map = this.b;
        string = map == null ? null : map.get(string);
        return string;
    }

    public final c b() {
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
    public final void e(String string, String string2) {
        Object object = d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.b != null) break block3;
                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        this.b = hashMap;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.b.put(string, string2);
                this.g();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(String string) {
        Object object = d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Map<String, String> map = this.b;
                        if (map == null) break block3;
                        map.remove(string);
                        this.g();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void g() {
        C.b0("quark", new Gson().toJson((Object)this));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(boolean bl, boolean bl2) {
        Object object = d;
        synchronized (object) {
            c c2 = this.b();
            c2.f(bl);
            c2.e(bl2);
            this.a = c2;
            this.g();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(c c2) {
        Object object = d;
        synchronized (object) {
            this.a = c2;
            this.g();
            return;
        }
    }
}

