/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.K;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.mI.i;

public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public final long g;
    public final String h;

    public b(String string, String string2, String string3, int n2, long l2, String string4, long l3, String string5) {
        i.e(string2, "shareKey");
        i.e(string3, "sharePwd");
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = n2;
        this.e = l2;
        this.f = string4;
        this.g = l3;
        this.h = string5;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        object = b2.a;
        if (!i.a(this.a, object)) {
            return false;
        }
        if (!i.a(this.b, b2.b)) {
            return false;
        }
        if (!i.a(this.c, b2.c)) {
            return false;
        }
        if (this.d != b2.d) {
            return false;
        }
        if (this.e != b2.e) {
            return false;
        }
        if (!i.a(this.f, b2.f)) {
            return false;
        }
        if (this.g != b2.g) {
            return false;
        }
        return i.a(this.h, b2.h);
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        n2 = m.a(this.b, n2 * 31, 31);
        int n3 = m.a(this.c, n2, 31);
        n2 = this.d;
        long l2 = this.e;
        int n4 = (int)(l2 ^ l2 >>> 32);
        n4 = m.a(this.f, ((n3 + n2) * 31 + n4) * 31, 31);
        l2 = this.g;
        n2 = (int)(l2 ^ l2 >>> 32);
        return this.h.hashCode() + (n4 + n2) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShareInfo(filename=");
        stringBuilder.append(this.a);
        stringBuilder.append(", shareKey=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sharePwd=");
        stringBuilder.append(this.c);
        stringBuilder.append(", next=");
        stringBuilder.append(this.d);
        stringBuilder.append(", fileId=");
        stringBuilder.append(this.e);
        stringBuilder.append(", S3KeyFlag=");
        stringBuilder.append(this.f);
        stringBuilder.append(", Size=");
        stringBuilder.append(this.g);
        stringBuilder.append(", Etag=");
        return m.h(stringBuilder, this.h, ")");
    }
}

