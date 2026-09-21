/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.e;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public final class f {
    private final int a;
    private final ByteBuffer b;
    private final CharBuffer c;
    private final IntBuffer d;

    f(int n2, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = n2;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    public static e b(int n2) {
        return new e(n2);
    }

    final int a() {
        int n2 = com.github.catvod.spider.merge.l.a.a(this.a);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    return this.d.arrayOffset();
                }
                throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
            }
            return this.c.arrayOffset();
        }
        return this.b.arrayOffset();
    }

    final byte[] c() {
        return this.b.array();
    }

    final char[] d() {
        return this.c.array();
    }

    final int e() {
        return this.a;
    }

    final int[] f() {
        return this.d.array();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int g() {
        void var2_3;
        int n2 = com.github.catvod.spider.merge.l.a.a(this.a);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
                IntBuffer intBuffer = this.d;
                return var2_3.position();
            }
            CharBuffer charBuffer = this.c;
            return var2_3.position();
        }
        ByteBuffer byteBuffer = this.b;
        return var2_3.position();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int h() {
        void var2_3;
        int n2 = com.github.catvod.spider.merge.l.a.a(this.a);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
                IntBuffer intBuffer = this.d;
                return var2_3.remaining();
            }
            CharBuffer charBuffer = this.c;
            return var2_3.remaining();
        }
        ByteBuffer byteBuffer = this.b;
        return var2_3.remaining();
    }
}

