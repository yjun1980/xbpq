package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes.dex */
public final class g implements Cloneable {
    int f;
    private m c = m.h;
    private Charset d = com.github.catvod.spider.merge.a0.b.a;
    private final ThreadLocal<CharsetEncoder> e = new ThreadLocal<>();
    private boolean g = true;
    private int h = 1;
    private int i = 1;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            g gVar = (g) super.clone();
            String name = this.d.name();
            gVar.getClass();
            gVar.d = Charset.forName(name);
            gVar.c = m.valueOf(this.c.name());
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharsetEncoder b() {
        CharsetEncoder charsetEncoder = this.e.get();
        return charsetEncoder != null ? charsetEncoder : e();
    }

    public final m c() {
        return this.c;
    }

    public final int d() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharsetEncoder e() {
        CharsetEncoder newEncoder = this.d.newEncoder();
        this.e.set(newEncoder);
        String name = newEncoder.charset().name();
        this.f = name.equals(cYh.d("32036C1004192E19")) ? 1 : name.startsWith(cYh.d("3204077C")) ? 2 : 3;
        return newEncoder;
    }

    public final boolean f() {
        return this.g;
    }

    public final int g() {
        return this.i;
    }
}
