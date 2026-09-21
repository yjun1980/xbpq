/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02cb;
import com.github.catvod.spider.merge.\u079f;
import com.github.catvod.spider.merge.\u07a1;
import java.nio.charset.StandardCharsets;

public abstract class \u07a2
implements \u079f {
    protected final int \u037f;
    protected final String \u0528;
    protected int \u0529;

    private \u07a2(int n2, int n3, String string) {
        this.\u037f = n3;
        this.\u0528 = string;
        this.\u0529 = 0;
    }

    public static \u07a2 \u0620(\u07a1 \u07a12, String string) {
        int n2 = com.github.catvod.spider.merge.\u07a2$\u037f.\u037f[\u07a12.\u052b().ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return new \u052a(\u07a12.\u052d(), \u07a12.\u052e(), string, \u07a12.\u052c(), \u07a12.\u037f());
                }
                throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
            }
            return new \u0528(\u07a12.\u052d(), \u07a12.\u052e(), string, \u07a12.\u052a(), \u07a12.\u037f());
        }
        return new \u052c(\u07a12.\u052d(), \u07a12.\u052e(), string, \u07a12.\u0529(), \u07a12.\u037f());
    }

    @Override
    public final int size() {
        return this.\u037f;
    }

    public final String toString() {
        return this.\u052e(\u02cb.\u0529(0, this.\u037f - 1));
    }

    @Override
    public final int \u037f() {
        return -1;
    }

    @Override
    public final void \u0529(int n2) {
        this.\u0529 = n2;
    }

    @Override
    public final int \u052d() {
        return this.\u0529;
    }

    @Override
    public final void \u052f() {
        int n2 = this.\u037f;
        int n3 = this.\u0529;
        if (n2 - n3 == 0) {
            throw new IllegalStateException(SOY.d("19333F181B035A313E180702173771333B31"));
        }
        this.\u0529 = n3 + 1;
    }

    @Override
    public final void \u058f(int n2) {
    }

    private static final class \u0528
    extends \u07a2 {
        private final char[] \u052a;

        private \u0528(int n2, int n3, String string, char[] cArray, int n4) {
            super(n2, n3, string);
            this.\u052a = cArray;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public int \u052c(int n2) {
            int n3 = Integer.signum(n2);
            if (n3 != -1) {
                if (n3 == 0) return 0;
                if (n3 != 1) throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
                if ((n2 = this.\u0529 + n2 - 1) >= this.\u037f) {
                    return -1;
                }
                n2 = this.\u052a[n2];
                return n2 & 0xFFFF;
            }
            if ((n2 = this.\u0529 + n2) < 0) {
                return -1;
            }
            n2 = this.\u052a[n2];
            return n2 & 0xFFFF;
        }

        @Override
        public String \u052e(\u02cb \u02cb2) {
            int n2 = Math.min(\u02cb2.\u052d, this.\u037f);
            int n3 = Math.min(\u02cb2.\u052e - \u02cb2.\u052d + 1, this.\u037f - n2);
            return new String(this.\u052a, n2, n3);
        }
    }

    private static final class \u052a
    extends \u07a2 {
        private final int[] \u052a;

        private \u052a(int n2, int n3, String string, int[] nArray, int n4) {
            super(n2, n3, string);
            this.\u052a = nArray;
        }

        @Override
        public int \u052c(int n2) {
            int n3 = Integer.signum(n2);
            if (n3 != -1) {
                if (n3 != 0) {
                    if (n3 == 1) {
                        if ((n2 = this.\u0529 + n2 - 1) >= this.\u037f) {
                            return -1;
                        }
                        return this.\u052a[n2];
                    }
                    throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
                }
                return 0;
            }
            if ((n2 = this.\u0529 + n2) < 0) {
                return -1;
            }
            return this.\u052a[n2];
        }

        @Override
        public String \u052e(\u02cb \u02cb2) {
            int n2 = Math.min(\u02cb2.\u052d, this.\u037f);
            int n3 = Math.min(\u02cb2.\u052e - \u02cb2.\u052d + 1, this.\u037f - n2);
            return new String(this.\u052a, n2, n3);
        }
    }

    private static final class \u052c
    extends \u07a2 {
        private final byte[] \u052a;

        private \u052c(int n2, int n3, String string, byte[] byArray, int n4) {
            super(n2, n3, string);
            this.\u052a = byArray;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public int \u052c(int n2) {
            int n3 = Integer.signum(n2);
            if (n3 != -1) {
                if (n3 == 0) return 0;
                if (n3 != 1) throw new UnsupportedOperationException(SOY.d("343D255606121B31391310"));
                if ((n2 = this.\u0529 + n2 - 1) >= this.\u037f) {
                    return -1;
                }
                n2 = this.\u052a[n2];
                return n2 & 0xFF;
            }
            if ((n2 = this.\u0529 + n2) < 0) {
                return -1;
            }
            n2 = this.\u052a[n2];
            return n2 & 0xFF;
        }

        @Override
        public String \u052e(\u02cb \u02cb2) {
            int n2 = Math.min(\u02cb2.\u052d, this.\u037f);
            int n3 = Math.min(\u02cb2.\u052e - \u02cb2.\u052d + 1, this.\u037f - n2);
            return new String(this.\u052a, n2, n3, StandardCharsets.ISO_8859_1);
        }
    }
}

