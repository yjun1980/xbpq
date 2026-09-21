/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.C.a;
import java.util.HashMap;

public final class i {
    private String a;
    private HashMap<String, String> b;
    private String c;
    private String d;
    private String e;
    private String f;

    public final HashMap<String, String> a() {
        return this.b;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return this.c;
    }

    public final void g(HashMap<String, String> hashMap) {
        this.b = hashMap;
    }

    public final void h(String string) {
        this.f = string;
    }

    public final void i(String string) {
        this.e = string;
    }

    public final void j(String string) {
        this.a = string;
    }

    public final void k(String string) {
        this.d = string;
    }

    public final void l(String string) {
        this.c = string;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("VodFolderParm{sharePwd='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", extend=");
        stringBuilder.append(this.b);
        stringBuilder.append(", vodName='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", url='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", shareId='");
        stringBuilder.append(this.e);
        stringBuilder.append('\'');
        stringBuilder.append(", fileId='");
        stringBuilder.append(this.f);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

