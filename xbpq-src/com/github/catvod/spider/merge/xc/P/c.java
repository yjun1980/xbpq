/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.P;

import com.github.catvod.spider.merge.KT.H;

public final class c
implements Comparable {
    public String a = "";
    public String b = "";
    public long c = 0L;
    public String d = "";
    public String e = "";

    /*
     * Enabled aggressive block sorting
     */
    public final String a() {
        String string = this.e;
        String string2 = "";
        if (string == null) {
            string = "";
        }
        if (string.isEmpty() || (string = this.e) == null) {
            string = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        String string3 = this.b;
        string = string2;
        if (string3 != null) {
            string = string3;
        }
        stringBuilder.append(H.g(string));
        return stringBuilder.toString().trim();
    }

    public final int compareTo(Object object) {
        object = (c)object;
        return this.a().compareTo(((c)object).a());
    }
}

