/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.O;

import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.O.c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

public class a {
    public static volatile a d;
    public static final Object e;
    @SerializedName(value="user")
    private c a;
    @SerializedName(value="saveFileIds")
    private Map<String, String> b;
    @SerializedName(value="utToken")
    private String c;

    static {
        e = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a f() {
        if (d != null) {
            return d;
        }
        Object object = e;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                Object object2;
                try {
                    if (d != null) {
                        return d;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                try {
                    object2 = C.P("uc");
                    if (((String)object2).isEmpty()) return d = (object2 = new a());
                    Object object3 = new Gson();
                    object3 = (a)object3.fromJson((String)object2, a.class);
                    object2 = object3;
                    d = object2;
                    if (object3 != null) return d;
                    object2 = new a();
                    return d;
                }
                catch (Exception exception) {}
                object2 = new a();
                d = object2;
                return d;
            }
            throw throwable2;
        }
    }

    public static String g() {
        return com.github.catvod.spider.merge.xc.O.a.f().d().a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = e;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Map<String, String> map = this.b;
                        if (map == null) break block3;
                        map.clear();
                        C.b0("uc", this.toString());
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

    public final void b() {
        this.c = "";
        C.b0("uc_machine_code", "");
    }

    public final String c(String string) {
        Map<String, String> map = this.b;
        string = map == null ? null : map.get(string);
        return string;
    }

    public final c d() {
        c c2;
        c c3 = c2 = this.a;
        if (c2 == null) {
            c3 = new c();
        }
        return c3;
    }

    public final String e() {
        if (this.c == null) {
            this.c = C.P("uc_machine_code");
        }
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(String string, String string2) {
        Object object = e;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        if (this.b != null) break block5;
                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        this.b = hashMap;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (string2 != null) {
                    this.b.put(string, string2);
                } else {
                    this.b.remove(string);
                }
                C.b0("uc", this.toString());
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
    public final void i(boolean bl, boolean bl2) {
        Object object = e;
        synchronized (object) {
            c c2 = this.d();
            c2.e(bl);
            c2.d(bl2);
            this.a = c2;
            C.b0("uc", this.toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(c c2) {
        Object object = e;
        synchronized (object) {
            this.a = c2;
            C.b0("uc", this.toString());
            return;
        }
    }

    public final void k(String string) {
        this.c = string;
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        C.b0("uc_machine_code", string2);
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

