package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0167a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* renamed from: com.github.catvod.spider.merge.P.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f {
    private final int a;
    private final ByteBuffer b;
    private final CharBuffer c;
    private final IntBuffer d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0005f(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    public static C0004e b(int i) {
        return new C0004e(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int a = C0167a.a(this.a);
        if (a == 0) {
            return this.b.arrayOffset();
        }
        if (a == 1) {
            return this.c.arrayOffset();
        }
        if (a == 2) {
            return this.d.arrayOffset();
        }
        throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] c() {
        return this.b.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char[] d() {
        return this.c.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] f() {
        return this.d.array();
    }

    public final int g() {
        Buffer buffer;
        int a = C0167a.a(this.a);
        if (a == 0) {
            buffer = this.b;
        } else if (a == 1) {
            buffer = this.c;
        } else {
            if (a != 2) {
                throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
            }
            buffer = this.d;
        }
        return buffer.position();
    }

    public final int h() {
        Buffer buffer;
        int a = C0167a.a(this.a);
        if (a == 0) {
            buffer = this.b;
        } else if (a == 1) {
            buffer = this.c;
        } else {
            if (a != 2) {
                throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
            }
            buffer = this.d;
        }
        return buffer.remaining();
    }
}
