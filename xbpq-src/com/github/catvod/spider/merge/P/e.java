/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.P.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public final class e {
    private int a = 1;
    private ByteBuffer b;
    private CharBuffer c;
    private IntBuffer d;
    private int e;

    e(int n2) {
        this.b = ByteBuffer.allocate(n2);
        this.c = null;
        this.d = null;
        this.e = -1;
    }

    private void b(CharBuffer charBuffer) {
        Object object = charBuffer.array();
        int n2 = charBuffer.arrayOffset();
        int n3 = charBuffer.position() + n2;
        int n4 = charBuffer.arrayOffset();
        int n5 = charBuffer.limit();
        char[] cArray = this.c.array();
        n2 = this.c.arrayOffset();
        n2 = this.c.position() + n2;
        while (n3 < n5 + n4) {
            char c2 = object[n3];
            if (!Character.isHighSurrogate(c2)) {
                cArray[n2] = c2;
                ++n3;
                ++n2;
                continue;
            }
            charBuffer.position(n3 - charBuffer.arrayOffset());
            object = this.c;
            ((CharBuffer)object).position(n2 - ((CharBuffer)object).arrayOffset());
            n2 = charBuffer.remaining();
            this.c.flip();
            object = IntBuffer.allocate(Math.max(this.c.remaining() + n2, this.c.capacity() / 2));
            while (this.c.hasRemaining()) {
                ((IntBuffer)object).put(this.c.get() & 0xFFFF);
            }
            this.a = 3;
            this.c = null;
            this.d = object;
            this.c(charBuffer);
            return;
        }
        charBuffer.position(n3 - charBuffer.arrayOffset());
        charBuffer = this.c;
        charBuffer.position(n2 - charBuffer.arrayOffset());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(CharBuffer buffer) {
        int n2;
        int n3;
        char[] cArray = ((CharBuffer)buffer).array();
        int n4 = ((CharBuffer)buffer).arrayOffset();
        int n5 = buffer.position() + n4;
        int n6 = ((CharBuffer)buffer).arrayOffset();
        int n7 = buffer.limit();
        int[] nArray = this.d.array();
        n4 = this.d.arrayOffset();
        n4 = this.d.position() + n4;
        while (true) {
            char c2;
            block10: {
                block9: {
                    block8: {
                        block5: {
                            block7: {
                                block6: {
                                    n3 = -1;
                                    if (n5 >= n7 + n6) break;
                                    c2 = cArray[n5];
                                    n2 = n5 + 1;
                                    if (this.e == -1) break block5;
                                    if (!Character.isLowSurrogate(c2)) break block6;
                                    nArray[n4] = Character.toCodePoint((char)this.e, c2);
                                    break block7;
                                }
                                nArray[n4] = this.e;
                                ++n4;
                                if (Character.isHighSurrogate(c2)) break block8;
                                nArray[n4] = 0xFFFF & c2;
                            }
                            ++n4;
                            n5 = n3;
                            break block9;
                        }
                        if (!Character.isHighSurrogate(c2)) break block10;
                    }
                    n5 = c2 & 0xFFFF;
                }
                this.e = n5;
                n5 = n2;
                continue;
            }
            nArray[n4] = c2 & 0xFFFF;
            ++n4;
            n5 = n2;
        }
        n3 = this.e;
        n2 = n4;
        if (n3 != -1) {
            nArray[n4] = n3 & 0xFFFF;
            n2 = n4 + 1;
        }
        ((CharBuffer)buffer).position(n5 - ((CharBuffer)buffer).arrayOffset());
        buffer = this.d;
        ((IntBuffer)buffer).position(n2 - ((IntBuffer)buffer).arrayOffset());
    }

    private static int e(int n2) {
        return (int)Math.pow(2.0, 32 - Integer.numberOfLeadingZeros(n2 - 1));
    }

    public final void a(CharBuffer object) {
        Object object2;
        int n2 = ((Buffer)object).remaining();
        int n3 = com.github.catvod.spider.merge.l.a.a(this.a);
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 == 2 && this.d.remaining() < n2) {
                    object2 = IntBuffer.allocate(com.github.catvod.spider.merge.P.e.e(this.d.capacity() + n2));
                    this.d.flip();
                    ((IntBuffer)object2).put(this.d);
                    this.d = object2;
                }
            } else if (this.c.remaining() < n2) {
                object2 = CharBuffer.allocate(com.github.catvod.spider.merge.P.e.e(this.c.capacity() + n2));
                this.c.flip();
                ((CharBuffer)object2).put(this.c);
                this.c = object2;
            }
        } else if (this.b.remaining() < n2) {
            object2 = ByteBuffer.allocate(com.github.catvod.spider.merge.P.e.e(this.b.capacity() + n2));
            this.b.flip();
            ((ByteBuffer)object2).put(this.b);
            this.b = object2;
        }
        if (((CharBuffer)object).hasArray()) {
            block19: {
                n2 = com.github.catvod.spider.merge.l.a.a(this.a);
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 == 2) {
                            this.c((CharBuffer)object);
                        }
                    } else {
                        this.b((CharBuffer)object);
                    }
                } else {
                    char[] cArray = ((CharBuffer)object).array();
                    n2 = ((CharBuffer)object).arrayOffset();
                    n3 = ((Buffer)object).position() + n2;
                    int n4 = ((CharBuffer)object).arrayOffset();
                    int n5 = ((Buffer)object).limit();
                    object2 = this.b.array();
                    n2 = this.b.arrayOffset();
                    n2 = this.b.position() + n2;
                    while (n3 < n5 + n4) {
                        char c2 = cArray[n3];
                        if (c2 <= '\u00ff') {
                            object2[n2] = (byte)(c2 & 0xFF);
                            ++n3;
                            ++n2;
                            continue;
                        }
                        ((CharBuffer)object).position(n3 - ((CharBuffer)object).arrayOffset());
                        object2 = this.b;
                        ((ByteBuffer)object2).position(n2 - ((ByteBuffer)object2).arrayOffset());
                        if (!Character.isHighSurrogate(c2)) {
                            n2 = ((Buffer)object).remaining();
                            this.b.flip();
                            object2 = CharBuffer.allocate(Math.max(this.b.remaining() + n2, this.b.capacity() / 2));
                            while (this.b.hasRemaining()) {
                                ((CharBuffer)object2).put((char)(this.b.get() & 0xFF));
                            }
                            this.a = 2;
                            this.b = null;
                            this.c = object2;
                            this.b((CharBuffer)object);
                        } else {
                            n2 = ((Buffer)object).remaining();
                            this.b.flip();
                            object2 = IntBuffer.allocate(Math.max(this.b.remaining() + n2, this.b.capacity() / 4));
                            while (this.b.hasRemaining()) {
                                ((IntBuffer)object2).put(this.b.get() & 0xFF);
                            }
                            this.a = 3;
                            this.b = null;
                            this.d = object2;
                            this.c((CharBuffer)object);
                        }
                        break block19;
                    }
                    ((CharBuffer)object).position(n3 - ((CharBuffer)object).arrayOffset());
                    object = this.b;
                    ((ByteBuffer)object).position(n2 - ((ByteBuffer)object).arrayOffset());
                }
            }
            return;
        }
        object = new UnsupportedOperationException(cYh.d("331F051E"));
        throw object;
    }

    public final f d() {
        int n2 = com.github.catvod.spider.merge.l.a.a(this.a);
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    this.d.flip();
                }
            } else {
                this.c.flip();
            }
        } else {
            this.b.flip();
        }
        return new f(this.a, this.b, this.c, this.d);
    }
}

