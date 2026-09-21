/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class \u07a1 {
    private final \u052a \u037f;
    private final ByteBuffer \u0528;
    private final CharBuffer \u0529;
    private final IntBuffer \u052a;

    private \u07a1(\u052a \u052b, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.\u037f = \u052b;
        this.\u0528 = byteBuffer;
        this.\u0529 = charBuffer;
        this.\u052a = intBuffer;
    }

    public static \u0528 \u0528(int n2) {
        return new \u0528(n2);
    }

    int \u037f() {
        int n2 = com.github.catvod.spider.merge.\u07a1$\u037f.\u037f[this.\u037f.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return this.\u052a.arrayOffset();
                }
                throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
            }
            return this.\u0529.arrayOffset();
        }
        return this.\u0528.arrayOffset();
    }

    byte[] \u0529() {
        return this.\u0528.array();
    }

    char[] \u052a() {
        return this.\u0529.array();
    }

    \u052a \u052b() {
        return this.\u037f;
    }

    int[] \u052c() {
        return this.\u052a.array();
    }

    public int \u052d() {
        int n2 = com.github.catvod.spider.merge.\u07a1$\u037f.\u037f[this.\u037f.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return this.\u052a.position();
                }
                throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
            }
            return this.\u0529.position();
        }
        return this.\u0528.position();
    }

    public int \u052e() {
        int n2 = com.github.catvod.spider.merge.\u07a1$\u037f.\u037f[this.\u037f.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return this.\u052a.remaining();
                }
                throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
            }
            return this.\u0529.remaining();
        }
        return this.\u0528.remaining();
    }

    public static class \u0528 {
        private \u052a \u037f = com.github.catvod.spider.merge.\u07a1$\u052a.\u037f;
        private ByteBuffer \u0528;
        private CharBuffer \u0529;
        private IntBuffer \u052a;
        private int \u052b;

        private \u0528(int n2) {
            this.\u0528 = ByteBuffer.allocate(n2);
            this.\u0529 = null;
            this.\u052a = null;
            this.\u052b = -1;
        }

        private void \u0528(CharBuffer charBuffer) {
            int n2 = com.github.catvod.spider.merge.\u07a1$\u037f.\u037f[this.\u037f.ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        this.\u052b(charBuffer);
                    }
                } else {
                    this.\u052a(charBuffer);
                }
            } else {
                this.\u0529(charBuffer);
            }
        }

        private void \u0529(CharBuffer buffer) {
            Object object = ((CharBuffer)buffer).array();
            int n2 = ((CharBuffer)buffer).arrayOffset() + buffer.position();
            int n3 = ((CharBuffer)buffer).arrayOffset();
            int n4 = buffer.limit();
            byte[] byArray = this.\u0528.array();
            int n5 = this.\u0528.arrayOffset() + this.\u0528.position();
            while (n2 < n3 + n4) {
                char c2 = object[n2];
                if (c2 <= '\u00ff') {
                    byArray[n5] = (byte)(c2 & 0xFF);
                    ++n2;
                    ++n5;
                    continue;
                }
                ((CharBuffer)buffer).position(n2 - ((CharBuffer)buffer).arrayOffset());
                object = this.\u0528;
                ((ByteBuffer)object).position(n5 - ((ByteBuffer)object).arrayOffset());
                if (!Character.isHighSurrogate(c2)) {
                    this.\u052d(buffer.remaining());
                    this.\u052a((CharBuffer)buffer);
                    return;
                }
                this.\u052e(buffer.remaining());
                this.\u052b((CharBuffer)buffer);
                return;
            }
            ((CharBuffer)buffer).position(n2 - ((CharBuffer)buffer).arrayOffset());
            buffer = this.\u0528;
            ((ByteBuffer)buffer).position(n5 - ((ByteBuffer)buffer).arrayOffset());
        }

        private void \u052a(CharBuffer charBuffer) {
            char[] cArray = charBuffer.array();
            int n2 = charBuffer.arrayOffset() + charBuffer.position();
            int n3 = charBuffer.arrayOffset();
            int n4 = charBuffer.limit();
            Object object = this.\u0529.array();
            int n5 = this.\u0529.arrayOffset() + this.\u0529.position();
            while (n2 < n3 + n4) {
                char c2 = cArray[n2];
                if (!Character.isHighSurrogate(c2)) {
                    object[n5] = c2;
                    ++n2;
                    ++n5;
                    continue;
                }
                charBuffer.position(n2 - charBuffer.arrayOffset());
                object = this.\u0529;
                ((CharBuffer)object).position(n5 - ((CharBuffer)object).arrayOffset());
                this.\u052f(charBuffer.remaining());
                this.\u052b(charBuffer);
                return;
            }
            charBuffer.position(n2 - charBuffer.arrayOffset());
            charBuffer = this.\u0529;
            charBuffer.position(n5 - charBuffer.arrayOffset());
        }

        private void \u052b(CharBuffer buffer) {
            char[] cArray = ((CharBuffer)buffer).array();
            int n2 = ((CharBuffer)buffer).arrayOffset() + buffer.position();
            int n3 = ((CharBuffer)buffer).arrayOffset();
            int n4 = buffer.limit();
            int[] nArray = this.\u052a.array();
            int n5 = this.\u052a.arrayOffset() + this.\u052a.position();
            while (n2 < n3 + n4) {
                char c2 = cArray[n2];
                ++n2;
                if (this.\u052b != -1) {
                    if (Character.isLowSurrogate(c2)) {
                        nArray[n5] = Character.toCodePoint((char)this.\u052b, c2);
                        ++n5;
                        this.\u052b = -1;
                        continue;
                    }
                    nArray[n5] = this.\u052b;
                    ++n5;
                    if (Character.isHighSurrogate(c2)) {
                        this.\u052b = c2 & 0xFFFF;
                        continue;
                    }
                    nArray[n5] = 0xFFFF & c2;
                    ++n5;
                    this.\u052b = -1;
                    continue;
                }
                if (Character.isHighSurrogate(c2)) {
                    this.\u052b = c2 & 0xFFFF;
                    continue;
                }
                nArray[n5] = c2 & 0xFFFF;
                ++n5;
            }
            n4 = this.\u052b;
            n3 = n5;
            if (n4 != -1) {
                nArray[n5] = n4 & 0xFFFF;
                n3 = n5 + 1;
            }
            ((CharBuffer)buffer).position(n2 - ((CharBuffer)buffer).arrayOffset());
            buffer = this.\u052a;
            ((IntBuffer)buffer).position(n3 - ((IntBuffer)buffer).arrayOffset());
        }

        private void \u052d(int n2) {
            this.\u0528.flip();
            CharBuffer charBuffer = CharBuffer.allocate(Math.max(this.\u0528.remaining() + n2, this.\u0528.capacity() / 2));
            while (this.\u0528.hasRemaining()) {
                charBuffer.put((char)(this.\u0528.get() & 0xFF));
            }
            this.\u037f = com.github.catvod.spider.merge.\u07a1$\u052a.\u0528;
            this.\u0528 = null;
            this.\u0529 = charBuffer;
        }

        private void \u052e(int n2) {
            this.\u0528.flip();
            IntBuffer intBuffer = IntBuffer.allocate(Math.max(this.\u0528.remaining() + n2, this.\u0528.capacity() / 4));
            while (this.\u0528.hasRemaining()) {
                intBuffer.put(this.\u0528.get() & 0xFF);
            }
            this.\u037f = com.github.catvod.spider.merge.\u07a1$\u052a.\u0529;
            this.\u0528 = null;
            this.\u052a = intBuffer;
        }

        private void \u052f(int n2) {
            this.\u0529.flip();
            IntBuffer intBuffer = IntBuffer.allocate(Math.max(this.\u0529.remaining() + n2, this.\u0529.capacity() / 2));
            while (this.\u0529.hasRemaining()) {
                intBuffer.put(this.\u0529.get() & 0xFFFF);
            }
            this.\u037f = com.github.catvod.spider.merge.\u07a1$\u052a.\u0529;
            this.\u0529 = null;
            this.\u052a = intBuffer;
        }

        private static int \u0620(int n2) {
            return (int)Math.pow(2.0, 32 - Integer.numberOfLeadingZeros(n2 - 1));
        }

        public void \u037f(CharBuffer charBuffer) {
            this.\u058f(charBuffer.remaining());
            if (charBuffer.hasArray()) {
                this.\u0528(charBuffer);
                return;
            }
            throw new UnsupportedOperationException(SOY.d("2E1D1539"));
        }

        public \u07a1 \u052c() {
            int n2 = com.github.catvod.spider.merge.\u07a1$\u037f.\u037f[this.\u037f.ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        this.\u052a.flip();
                    }
                } else {
                    this.\u0529.flip();
                }
            } else {
                this.\u0528.flip();
            }
            return new \u07a1(this.\u037f, this.\u0528, this.\u0529, this.\u052a);
        }

        public void \u058f(int n2) {
            int n3 = com.github.catvod.spider.merge.\u07a1$\u037f.\u037f[this.\u037f.ordinal()];
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 == 3 && this.\u052a.remaining() < n2) {
                        IntBuffer intBuffer = IntBuffer.allocate(com.github.catvod.spider.merge.\u07a1$\u0528.\u0620(this.\u052a.capacity() + n2));
                        this.\u052a.flip();
                        intBuffer.put(this.\u052a);
                        this.\u052a = intBuffer;
                    }
                } else if (this.\u0529.remaining() < n2) {
                    CharBuffer charBuffer = CharBuffer.allocate(com.github.catvod.spider.merge.\u07a1$\u0528.\u0620(this.\u0529.capacity() + n2));
                    this.\u0529.flip();
                    charBuffer.put(this.\u0529);
                    this.\u0529 = charBuffer;
                }
            } else if (this.\u0528.remaining() < n2) {
                ByteBuffer byteBuffer = ByteBuffer.allocate(com.github.catvod.spider.merge.\u07a1$\u0528.\u0620(this.\u0528.capacity() + n2));
                this.\u0528.flip();
                byteBuffer.put(this.\u0528);
                this.\u0528 = byteBuffer;
            }
        }
    }

    public static final class \u052a
    extends Enum<\u052a> {
        public static final /* enum */ \u052a \u037f;
        public static final /* enum */ \u052a \u0528;
        public static final /* enum */ \u052a \u0529;
        private static final \u052a[] \u052a;

        static {
            \u052a \u052b;
            \u052a \u052b2;
            \u052a \u052b3;
            \u037f = \u052b3 = new \u052a();
            \u0528 = \u052b2 = new \u052a();
            \u0529 = \u052b = new \u052a();
            \u052a = new \u052a[]{\u052b3, \u052b2, \u052b};
        }

        public static \u052a[] \u037f() {
            return (\u052a[])\u052a.clone();
        }
    }
}

