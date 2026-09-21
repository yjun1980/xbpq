/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.I.O0;
import com.github.catvod.spider.merge.k1.c;
import com.github.catvod.spider.merge.k1.e;
import java.util.Collections;
import java.util.List;

public final class j
extends e {
    private final m f;
    private String g;
    private String h;
    private long i = -1L;
    private long j = -1L;
    private String k = null;
    private List<c> l = Collections.emptyList();
    private boolean m = false;

    public j(int n2, String string, String string2, m m2) {
        super(1, n2, string, string2);
        this.f = m2;
    }

    public final void g(long l2) {
        this.j = l2;
    }

    public final void h(String string) {
        this.h = string;
    }

    public final void i(List<c> list) {
        this.l = list;
    }

    public final void j(String string) {
        this.g = string;
    }

    public final void k(String string) {
        this.k = string;
    }

    public final void l(boolean bl) {
        this.m = bl;
    }

    public final void m(long l2) {
        this.i = l2;
    }

    @Override
    public final String toString() {
        String string = String.valueOf((Object)this.f);
        String string2 = this.g;
        String string3 = this.h;
        long l2 = this.i;
        long l3 = this.j;
        String string4 = this.k;
        String string5 = O0.b(this.a());
        int n2 = this.c();
        String string6 = this.e();
        String string7 = this.b();
        String string8 = String.valueOf(this.d());
        boolean bl = this.m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StreamInfoItem{streamType=");
        stringBuilder.append(string);
        stringBuilder.append(", uploaderName='");
        stringBuilder.append(string2);
        stringBuilder.append("', textualUploadDate='");
        stringBuilder.append(string3);
        stringBuilder.append("', viewCount=");
        stringBuilder.append(l2);
        stringBuilder.append(", duration=");
        stringBuilder.append(l3);
        stringBuilder.append(", uploaderUrl='");
        O0.a(stringBuilder, string4, "', infoType=", string5, ", serviceId=");
        stringBuilder.append(n2);
        stringBuilder.append(", url='");
        stringBuilder.append(string6);
        stringBuilder.append("', name='");
        O0.a(stringBuilder, string7, "', thumbnails='", string8, "', uploaderVerified='");
        stringBuilder.append(bl);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

