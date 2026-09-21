package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0167a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* renamed from: com.github.catvod.spider.merge.P.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e {
    private ByteBuffer b;
    private int a = 1;
    private CharBuffer c = null;
    private IntBuffer d = null;
    private int e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0004e(int i) {
        this.b = ByteBuffer.allocate(i);
    }

    private void b(CharBuffer charBuffer) {
        char[] array = charBuffer.array();
        int position = charBuffer.position() + charBuffer.arrayOffset();
        int limit = charBuffer.limit() + charBuffer.arrayOffset();
        char[] array2 = this.c.array();
        int position2 = this.c.position() + this.c.arrayOffset();
        while (position < limit) {
            char c = array[position];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(position - charBuffer.arrayOffset());
                CharBuffer charBuffer2 = this.c;
                charBuffer2.position(position2 - charBuffer2.arrayOffset());
                int remaining = charBuffer.remaining();
                this.c.flip();
                IntBuffer allocate = IntBuffer.allocate(Math.max(this.c.remaining() + remaining, this.c.capacity() / 2));
                while (this.c.hasRemaining()) {
                    allocate.put(this.c.get() & 65535);
                }
                this.a = 3;
                this.c = null;
                this.d = allocate;
                c(charBuffer);
                return;
            }
            array2[position2] = c;
            position++;
            position2++;
        }
        charBuffer.position(position - charBuffer.arrayOffset());
        CharBuffer charBuffer3 = this.c;
        charBuffer3.position(position2 - charBuffer3.arrayOffset());
    }

    private void c(CharBuffer charBuffer) {
        char[] array = charBuffer.array();
        int position = charBuffer.position() + charBuffer.arrayOffset();
        int limit = charBuffer.limit() + charBuffer.arrayOffset();
        int[] array2 = this.d.array();
        int position2 = this.d.position() + this.d.arrayOffset();
        while (true) {
            int i = -1;
            if (position >= limit) {
                break;
            }
            char c = array[position];
            position++;
            if (this.e != -1) {
                if (Character.isLowSurrogate(c)) {
                    array2[position2] = Character.toCodePoint((char) this.e, c);
                } else {
                    array2[position2] = this.e;
                    position2++;
                    if (!Character.isHighSurrogate(c)) {
                        array2[position2] = 65535 & c;
                    }
                }
                position2++;
                this.e = i;
            } else if (!Character.isHighSurrogate(c)) {
                array2[position2] = c & 65535;
                position2++;
            }
            i = c & 65535;
            this.e = i;
        }
        int i2 = this.e;
        if (i2 != -1) {
            array2[position2] = i2 & 65535;
            position2++;
        }
        charBuffer.position(position - charBuffer.arrayOffset());
        IntBuffer intBuffer = this.d;
        intBuffer.position(position2 - intBuffer.arrayOffset());
    }

    private static int e(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final void a(CharBuffer charBuffer) {
        int remaining = charBuffer.remaining();
        int a = C0167a.a(this.a);
        if (a != 0) {
            if (a != 1) {
                if (a == 2 && this.d.remaining() < remaining) {
                    IntBuffer allocate = IntBuffer.allocate(e(this.d.capacity() + remaining));
                    this.d.flip();
                    allocate.put(this.d);
                    this.d = allocate;
                }
            } else if (this.c.remaining() < remaining) {
                CharBuffer allocate2 = CharBuffer.allocate(e(this.c.capacity() + remaining));
                this.c.flip();
                allocate2.put(this.c);
                this.c = allocate2;
            }
        } else if (this.b.remaining() < remaining) {
            ByteBuffer allocate3 = ByteBuffer.allocate(e(this.b.capacity() + remaining));
            this.b.flip();
            allocate3.put(this.b);
            this.b = allocate3;
        }
        if (charBuffer.hasArray()) {
            int a2 = C0167a.a(this.a);
            if (a2 != 0) {
                if (a2 == 1) {
                    b(charBuffer);
                    return;
                } else {
                    if (a2 != 2) {
                        return;
                    }
                    c(charBuffer);
                    return;
                }
            }
            char[] array = charBuffer.array();
            int position = charBuffer.position() + charBuffer.arrayOffset();
            int limit = charBuffer.limit() + charBuffer.arrayOffset();
            byte[] array2 = this.b.array();
            int position2 = this.b.position() + this.b.arrayOffset();
            while (position < limit) {
                char c = array[position];
                if (c > 255) {
                    charBuffer.position(position - charBuffer.arrayOffset());
                    ByteBuffer byteBuffer = this.b;
                    byteBuffer.position(position2 - byteBuffer.arrayOffset());
                    if (!Character.isHighSurrogate(c)) {
                        int remaining2 = charBuffer.remaining();
                        this.b.flip();
                        CharBuffer allocate4 = CharBuffer.allocate(Math.max(this.b.remaining() + remaining2, this.b.capacity() / 2));
                        while (this.b.hasRemaining()) {
                            allocate4.put((char) (this.b.get() & 255));
                        }
                        this.a = 2;
                        this.b = null;
                        this.c = allocate4;
                        b(charBuffer);
                        return;
                    }
                    int remaining3 = charBuffer.remaining();
                    this.b.flip();
                    IntBuffer allocate5 = IntBuffer.allocate(Math.max(this.b.remaining() + remaining3, this.b.capacity() / 4));
                    while (this.b.hasRemaining()) {
                        allocate5.put(this.b.get() & 255);
                    }
                    this.a = 3;
                    this.b = null;
                    this.d = allocate5;
                    c(charBuffer);
                    return;
                }
                array2[position2] = (byte) (c & 255);
                position++;
                position2++;
            }
            charBuffer.position(position - charBuffer.arrayOffset());
            ByteBuffer byteBuffer2 = this.b;
            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
            return;
        }
        throw new UnsupportedOperationException(cYh.d("331F051E"));
    }

    public final C0005f d() {
        int a = C0167a.a(this.a);
        if (a == 0) {
            this.b.flip();
        } else if (a == 1) {
            this.c.flip();
        } else if (a == 2) {
            this.d.flip();
        }
        return new C0005f(this.a, this.b, this.c, this.d);
    }
}
