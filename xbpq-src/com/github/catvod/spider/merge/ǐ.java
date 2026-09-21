/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0209;
import com.github.catvod.spider.merge.\u020b;
import com.github.catvod.spider.merge.\u0371;
import com.github.catvod.spider.merge.\u05d5;
import com.github.catvod.spider.merge.\u0675;
import com.github.catvod.spider.merge.\u097d;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import javax.annotation.Nullable;

public class \u01d0
extends \u013a {
    private static final \u020b \u0620 = new \u020b.\u079c(SOY.d("0E3B251A11"));
    private \u037f \u0780;
    private \u0371 \u0781;
    private \u0528 \u0782;
    private final String \u0783;
    private boolean \u0784;

    public \u01d0(String string) {
        \u097d \u097d2 = \u097d.\u037f;
        super(\u0209.\u0783(SOY.d("59203E1900"), \u097d2), string);
        this.\u0780 = new \u037f();
        this.\u0782 = com.github.catvod.spider.merge.\u01d0$\u0528.\u037f;
        this.\u0784 = false;
        this.\u0783 = string;
        this.\u0781 = \u0371.\u0529();
    }

    private \u013a \u09fc() {
        String string;
        block1: {
            \u013a \u013a2;
            Iterator<\u013a> iterator = this.\u0863().iterator();
            do {
                boolean bl = iterator.hasNext();
                string = SOY.d("12263C1A");
                if (!bl) break block1;
            } while (!(\u013a2 = iterator.next()).\u08aa().equals(string));
            return \u013a2;
        }
        return this.\u07a3(string);
    }

    @Override
    public String \u0789() {
        return SOY.d("59363E15011A1F3C25");
    }

    @Override
    public String \u078b() {
        return super.\u08a3();
    }

    @Override
    public \u013a \u08ba(String string) {
        this.\u08bc().\u08ba(string);
        return this;
    }

    public \u013a \u08bc() {
        String string;
        \u013a \u013a2;
        block1: {
            \u013a \u013a3;
            \u013a2 = this.\u09fc();
            Iterator<\u013a> iterator = \u013a2.\u0863().iterator();
            do {
                boolean bl = iterator.hasNext();
                string = SOY.d("183D350F");
                if (!bl) break block1;
                \u013a3 = iterator.next();
                if (string.equals(\u013a3.\u08aa())) break;
                string = \u013a3.\u08aa();
            } while (!SOY.d("1C20301B11041F26").equals(string));
            return \u013a3;
        }
        return \u013a2.\u07a3(string);
    }

    public \u01d0 \u08bd() {
        \u01d0 \u01d02 = (\u01d0)super.\u0865();
        \u01d02.\u0780 = this.\u0780.\u0529();
        return \u01d02;
    }

    public \u037f \u0af9() {
        return this.\u0780;
    }

    public \u01d0 \u0c80(\u0371 \u03712) {
        this.\u0781 = \u03712;
        return this;
    }

    public \u0371 \u0cf1() {
        return this.\u0781;
    }

    public \u0528 \u0cf2() {
        return this.\u0782;
    }

    public \u01d0 \u0d29(\u0528 \u0529) {
        this.\u0782 = \u0529;
        return this;
    }

    public static class com.github.catvod.spider.merge.\u01d0$\u037f
    implements Cloneable {
        private \u05d5.\u052a \u037f = \u05d5.\u052a.\u0528;
        private Charset \u0528 = \u0675.\u0528;
        private final ThreadLocal<CharsetEncoder> \u0529 = new ThreadLocal();
        @Nullable
        \u05d5.\u0528 \u052a;
        private boolean \u052b = true;
        private boolean \u052c = false;
        private int \u052d = 1;
        private \u037f \u052e = \u037f.\u037f;

        public com.github.catvod.spider.merge.\u01d0$\u037f \u037f(String string) {
            this.\u0528(Charset.forName(string));
            return this;
        }

        public com.github.catvod.spider.merge.\u01d0$\u037f \u0528(Charset charset) {
            this.\u0528 = charset;
            return this;
        }

        public com.github.catvod.spider.merge.\u01d0$\u037f \u0529() {
            com.github.catvod.spider.merge.\u01d0$\u037f \u03f3;
            try {
                \u03f3 = (com.github.catvod.spider.merge.\u01d0$\u037f)super.clone();
                \u03f3.\u037f(this.\u0528.name());
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw new RuntimeException(cloneNotSupportedException);
            }
            \u03f3.\u037f = \u05d5.\u052a.\u0620(this.\u037f.name());
            return \u03f3;
        }

        CharsetEncoder \u052a() {
            CharsetEncoder charsetEncoder = this.\u0529.get();
            if (charsetEncoder == null) {
                charsetEncoder = this.\u052e();
            }
            return charsetEncoder;
        }

        public \u05d5.\u052a \u052b() {
            return this.\u037f;
        }

        public int \u052c() {
            return this.\u052d;
        }

        public boolean \u052d() {
            return this.\u052c;
        }

        CharsetEncoder \u052e() {
            CharsetEncoder charsetEncoder = this.\u0528.newEncoder();
            this.\u0529.set(charsetEncoder);
            this.\u052a = \u05d5.\u0528.\u037f(charsetEncoder.charset().name());
            return charsetEncoder;
        }

        public boolean \u052f() {
            return this.\u052b;
        }

        public \u037f \u058f() {
            return this.\u052e;
        }

        public static final class \u037f
        extends Enum<\u037f> {
            public static final /* enum */ \u037f \u037f;
            public static final /* enum */ \u037f \u0528;
            private static final \u037f[] \u0529;

            static {
                \u037f \u03f3;
                \u037f \u03f32;
                \u037f = \u03f32 = new \u037f();
                \u0528 = \u03f3 = new \u037f();
                \u0529 = new \u037f[]{\u03f32, \u03f3};
            }
        }
    }

    public static final class \u0528
    extends Enum<\u0528> {
        public static final /* enum */ \u0528 \u037f;
        public static final /* enum */ \u0528 \u0528;
        public static final /* enum */ \u0528 \u0529;
        private static final \u0528[] \u052a;

        static {
            \u0528 \u0529;
            \u0528 \u05292;
            \u0528 \u05293;
            \u037f = \u05293 = new \u0528();
            \u0528 = \u05292 = new \u0528();
            com.github.catvod.spider.merge.\u01d0$\u0528.\u0529 = \u0529 = new \u0528();
            \u052a = new \u0528[]{\u05293, \u05292, \u0529};
        }
    }
}

