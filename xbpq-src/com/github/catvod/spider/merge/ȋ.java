/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u012b;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u013e;
import com.github.catvod.spider.merge.\u0140;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u0209;
import com.github.catvod.spider.merge.\u0399;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u06e6;
import com.github.catvod.spider.merge.\u09f2;
import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class \u020b {
    protected \u020b() {
    }

    public abstract boolean \u037f(\u013a var1, \u013a var2);

    public static final class \u037f
    extends \u020b {
        public String toString() {
            return SOY.d("50");
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return true;
        }
    }

    public static final class \u0528
    extends \u020b {
        private final String \u037f;

        public \u0528(String string) {
            this.\u037f = string;
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("2177222B"), string);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return \u013a3.\u0784(this.\u037f);
        }
    }

    public static abstract class \u052a
    extends \u020b {
        String \u037f;
        String \u0528;

        public \u052a(String string, String string2) {
            this(string, string2, true);
        }

        public \u052a(String string, String string2, boolean bl) {
            \u01c3.\u052d(string);
            \u01c3.\u052d(string2);
            this.\u037f = \u06e6.\u0528(string);
            string = SOY.d("5D");
            boolean bl2 = string2.startsWith(string) && string2.endsWith(string) || string2.startsWith(string = SOY.d("58")) && string2.endsWith(string);
            string = string2;
            if (bl2) {
                string = string2.substring(1, string2.length() - 1);
            }
            string = bl ? \u06e6.\u0528(string) : \u06e6.\u0529(string, bl2);
            this.\u0528 = string;
        }
    }

    public static final class \u052c
    extends \u020b {
        private final String \u037f;

        public \u052c(String string) {
            \u01c3.\u052d(string);
            this.\u037f = \u06e6.\u037f(string);
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("210C740529"), string);
        }

        @Override
        public boolean \u037f(\u013a object, \u013a \u013a2) {
            object = \u013a2.\u052b().\u052c().iterator();
            while (object.hasNext()) {
                if (!\u06e6.\u037f(((\u09f2)object.next()).\u0528()).startsWith(this.\u037f)) continue;
                return true;
            }
            return false;
        }
    }

    public static final class \u052e
    extends \u052a {
        public \u052e(String string, String string2) {
            super(string, string2);
        }

        public String toString() {
            String string = this.\u037f;
            String string2 = this.\u0528;
            return String.format(SOY.d("2177224B510427"), string, string2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a3.\u0784(this.\u037f) && this.\u0528.equalsIgnoreCase(\u013a3.\u0529(this.\u037f).trim());
            return bl;
        }
    }

    public static final class \u058f
    extends \u052a {
        public \u058f(String string, String string2) {
            super(string, string2);
        }

        public String toString() {
            String string = this.\u037f;
            String string2 = this.\u0528;
            return String.format(SOY.d("2177225C4952090F"), string, string2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a3.\u0784(this.\u037f) && \u06e6.\u037f(\u013a3.\u0529(this.\u037f)).contains(this.\u0528);
            return bl;
        }
    }

    public static final class \u0620
    extends \u052a {
        public \u0620(String string, String string2) {
            super(string, string2, false);
        }

        public String toString() {
            String string = this.\u037f;
            String string2 = this.\u0528;
            return String.format(SOY.d("217722524952090F"), string, string2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a3.\u0784(this.\u037f) && \u06e6.\u037f(\u013a3.\u0529(this.\u037f)).endsWith(this.\u0528);
            return bl;
        }
    }

    public static final class \u0780
    extends \u020b {
        String \u037f;
        Pattern \u0528;

        public \u0780(String string, Pattern pattern) {
            this.\u037f = \u06e6.\u0528(string);
            this.\u0528 = pattern;
        }

        public String toString() {
            String string = this.\u037f;
            String string2 = this.\u0528.toString();
            return String.format(SOY.d("217722084952090F"), string, string2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a3.\u0784(this.\u037f) && this.\u0528.matcher(\u013a3.\u0529(this.\u037f)).find();
            return bl;
        }
    }

    public static final class \u0781
    extends \u052a {
        public \u0781(String string, String string2) {
            super(string, string2);
        }

        public String toString() {
            String string = this.\u037f;
            String string2 = this.\u0528;
            return String.format(SOY.d("217722574952090F"), string, string2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return this.\u0528.equalsIgnoreCase(\u013a3.\u0529(this.\u037f)) ^ true;
        }
    }

    public static final class \u0782
    extends \u052a {
        public \u0782(String string, String string2) {
            super(string, string2, false);
        }

        public String toString() {
            String string = this.\u037f;
            String string2 = this.\u0528;
            return String.format(SOY.d("217722284952090F"), string, string2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a3.\u0784(this.\u037f) && \u06e6.\u037f(\u013a3.\u0529(this.\u037f)).startsWith(this.\u0528);
            return bl;
        }
    }

    public static final class \u0783
    extends \u020b {
        private final String \u037f;

        public \u0783(String string) {
            this.\u037f = string;
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("547722"), string);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return \u013a3.\u08a1(this.\u037f);
        }
    }

    public static final class \u0784
    extends \u020b {
        private final String \u037f;

        public \u0784(String string) {
            this.\u037f = \u06e6.\u037f(string);
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("40313E180016133C223215031B7A74055D"), string);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return \u06e6.\u037f(\u013a3.\u0866()).contains(this.\u037f);
        }
    }

    public static final class \u0785
    extends \u020b {
        private final String \u037f;

        public \u0785(String string) {
            this.\u037f = \u06e6.\u037f(string);
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("40313E180016133C223903195277225F"), string);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return \u06e6.\u037f(\u013a3.\u08ab()).contains(this.\u037f);
        }
    }

    public static final class \u0786
    extends \u020b {
        private final String \u037f;

        public \u0786(String string) {
            this.\u037f = \u06e6.\u037f(string);
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("40313E180016133C225E510453"), string);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return \u06e6.\u037f(\u013a3.\u08b9()).contains(this.\u037f);
        }
    }

    public static abstract class \u0787
    extends \u020b {
        protected final int \u037f;
        protected final int \u0528;

        public \u0787(int n2, int n3) {
            this.\u037f = n2;
            this.\u0528 = n3;
        }

        public String toString() {
            if (this.\u037f == 0) {
                String string = this.\u0529();
                int n2 = this.\u0528;
                return String.format(SOY.d("4077225E511353"), string, n2);
            }
            if (this.\u0528 == 0) {
                String string = this.\u0529();
                int n3 = this.\u037f;
                return String.format(SOY.d("4077225E5113147B"), string, n3);
            }
            String string = this.\u0529();
            int n4 = this.\u037f;
            int n5 = this.\u0528;
            return String.format(SOY.d("4077225E511314777A125D"), string, n4, n5);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            \u013a \u013a4 = \u013a3.\u08ad();
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = bl;
            if (\u013a4 != null) {
                if (\u013a4 instanceof \u01d0) {
                    bl3 = bl;
                } else {
                    int n2 = this.\u0528(\u013a2, \u013a3);
                    int n3 = this.\u037f;
                    if (n3 == 0) {
                        bl3 = bl2;
                        if (n2 == this.\u0528) {
                            bl3 = true;
                        }
                        return bl3;
                    }
                    int n4 = this.\u0528;
                    bl3 = bl;
                    if ((n2 - n4) * n3 >= 0) {
                        bl3 = bl;
                        if ((n2 - n4) % n3 == 0) {
                            bl3 = true;
                        }
                    }
                }
            }
            return bl3;
        }

        protected abstract int \u0528(\u013a var1, \u013a var2);

        protected abstract String \u0529();
    }

    public static final class \u0788
    extends \u020b {
        private final String \u037f;

        public \u0788(String string) {
            this.\u037f = string;
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("597722"), string);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return this.\u037f.equals(\u013a3.\u08a4());
        }
    }

    public static final class \u0789
    extends \u078a {
        public \u0789(int n2) {
            super(n2);
        }

        public String toString() {
            int n2 = this.\u037f;
            return String.format(SOY.d("4037205E511353"), n2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a3.\u0868() == this.\u037f;
            return bl;
        }
    }

    public static abstract class \u078a
    extends \u020b {
        int \u037f;

        public \u078a(int n2) {
            this.\u037f = n2;
        }
    }

    public static final class \u078b
    extends \u078a {
        public \u078b(int n2) {
            super(n2);
        }

        public String toString() {
            int n2 = this.\u037f;
            return String.format(SOY.d("4035255E511353"), n2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a3.\u0868() > this.\u037f;
            return bl;
        }
    }

    public static final class \u078c
    extends \u078a {
        public \u078c(int n2) {
            super(n2);
        }

        public String toString() {
            int n2 = this.\u037f;
            return String.format(SOY.d("403E255E511353"), n2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a2 != \u013a3 && \u013a3.\u0868() < this.\u037f;
            return bl;
        }
    }

    public static final class \u078d
    extends \u020b {
        public String toString() {
            return SOY.d("40373C06000E");
        }

        @Override
        public boolean \u037f(\u013a object, \u013a \u058222) {
            for (\u0582 \u05822 : \u058222.\u058f()) {
                if (\u05822 instanceof \u012b || \u05822 instanceof \u0399) continue;
                return false;
            }
            return true;
        }
    }

    public static final class \u078e
    extends \u020b {
        public String toString() {
            return SOY.d("4034380407035731391F1813");
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            \u013a2 = \u013a3.\u08ad();
            boolean bl = \u013a2 != null && !(\u013a2 instanceof \u01d0) && \u013a3.\u0868() == 0;
            return bl;
        }
    }

    public static final class \u078f
    extends \u0795 {
        public \u078f() {
            super(0, 1);
        }

        @Override
        public String toString() {
            return SOY.d("403438040703573D375B000E0A37");
        }
    }

    public static final class \u0790
    extends \u020b {
        public String toString() {
            return SOY.d("403E3005005A193A381A10");
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            \u013a2 = \u013a3.\u08ad();
            boolean bl = true;
            if (\u013a2 == null || \u013a2 instanceof \u01d0 || \u013a3.\u0868() != \u013a2.\u0864().size() - 1) {
                bl = false;
            }
            return bl;
        }
    }

    public static final class \u0791
    extends \u0794 {
        public \u0791() {
            super(0, 1);
        }

        @Override
        public String toString() {
            return SOY.d("403E3005005A15347C020D071F");
        }
    }

    public static final class \u0792
    extends \u0787 {
        public \u0792(int n2, int n3) {
            super(n2, n3);
        }

        @Override
        protected int \u0528(\u013a \u013a2, \u013a \u013a3) {
            return \u013a3.\u0868() + 1;
        }

        @Override
        protected String \u0529() {
            return SOY.d("1426395B171F133E35");
        }
    }

    public static final class \u0793
    extends \u0787 {
        public \u0793(int n2, int n3) {
            super(n2, n3);
        }

        @Override
        protected int \u0528(\u013a \u013a2, \u013a \u013a3) {
            if (\u013a3.\u08ad() == null) {
                return 0;
            }
            return \u013a3.\u08ad().\u0864().size() - \u013a3.\u0868();
        }

        @Override
        protected String \u0529() {
            return SOY.d("1426395B181609267C151C1E1636");
        }
    }

    public static class \u0794
    extends \u0787 {
        public \u0794(int n2, int n3) {
            super(n2, n3);
        }

        @Override
        protected int \u0528(\u013a cloneable, \u013a \u013a2) {
            cloneable = \u013a2.\u08ad();
            int n2 = 0;
            if (cloneable == null) {
                return 0;
            }
            cloneable = \u013a2.\u08ad().\u0864();
            for (int i2 = \u013a2.\u0868(); i2 < ((ArrayList)cloneable).size(); ++i2) {
                int n3 = n2;
                if (((\u013a)((ArrayList)cloneable).get(i2)).\u08b7().equals(\u013a2.\u08b7())) {
                    n3 = n2 + 1;
                }
                n2 = n3;
            }
            return n2;
        }

        @Override
        protected String \u0529() {
            return SOY.d("1426395B181609267C19125A0E2B2113");
        }
    }

    public static class \u0795
    extends \u0787 {
        public \u0795(int n2, int n3) {
            super(n2, n3);
        }

        @Override
        protected int \u0528(\u013a object, \u013a \u013a2) {
            int n2;
            \u013a \u013a3;
            object = \u013a2.\u08ad();
            int n3 = 0;
            if (object == null) {
                return 0;
            }
            object = \u013a2.\u08ad().\u0864().iterator();
            do {
                n2 = n3;
                if (!object.hasNext()) break;
                \u013a3 = (\u013a)object.next();
                n2 = n3;
                if (\u013a3.\u08b7().equals(\u013a2.\u08b7())) {
                    n2 = n3 + 1;
                }
                n3 = n2;
            } while (\u013a3 != \u013a2);
            return n2;
        }

        @Override
        protected String \u0529() {
            return SOY.d("1426395B1B115726280611");
        }
    }

    public static final class \u0796
    extends \u020b {
        public String toString() {
            return SOY.d("403D3F1A0D5A193A381A10");
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            \u013a2 = \u013a3.\u08ad();
            boolean bl = \u013a2 != null && !(\u013a2 instanceof \u01d0) && \u013a3.\u08b6().isEmpty();
            return bl;
        }
    }

    public static final class \u0797
    extends \u020b {
        public String toString() {
            return SOY.d("403D3F1A0D5A15347C020D071F");
        }

        @Override
        public boolean \u037f(\u013a object, \u013a \u013a2) {
            boolean bl;
            object = \u013a2.\u08ad();
            boolean bl2 = bl = false;
            if (object != null) {
                if (object instanceof \u01d0) {
                    bl2 = bl;
                } else {
                    object = ((\u013a)object).\u0864().iterator();
                    int n2 = 0;
                    while (object.hasNext()) {
                        if (!((\u013a)object.next()).\u08b7().equals(\u013a2.\u08b7())) continue;
                        ++n2;
                    }
                    bl2 = bl;
                    if (n2 == 1) {
                        bl2 = true;
                    }
                }
            }
            return bl2;
        }
    }

    public static final class \u0798
    extends \u020b {
        public String toString() {
            return SOY.d("40203E1900");
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a2 instanceof \u01d0;
            boolean bl2 = false;
            \u013a \u013a4 = \u013a2;
            if (bl) {
                \u013a4 = \u013a2.\u0862(0);
            }
            if (\u013a3 == \u013a4) {
                bl2 = true;
            }
            return bl2;
        }
    }

    public static final class \u0799
    extends \u020b {
        public String toString() {
            return SOY.d("403F3002171F2E372902");
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public boolean \u037f(\u013a \u058222, \u013a \u013a2) {
            void var2_4;
            if (var2_4 instanceof \u013e) {
                return true;
            }
            for (\u0140 \u01402 : var2_4.\u08bb()) {
                \u013e \u013e2 = new \u013e(\u0209.\u0782(var2_4.\u08b8()), var2_4.\u052c(), var2_4.\u052b());
                \u01402.\u0798(\u013e2);
                \u013e2.\u07a2(\u01402);
            }
            return false;
        }
    }

    public static final class \u079a
    extends \u020b {
        private final Pattern \u037f;

        public \u079a(Pattern pattern) {
            this.\u037f = pattern;
        }

        public String toString() {
            Pattern pattern = this.\u037f;
            return String.format(SOY.d("403F3002171F1F217953075E"), pattern);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return this.\u037f.matcher(\u013a3.\u08b9()).find();
        }
    }

    public static final class \u079b
    extends \u020b {
        private final Pattern \u037f;

        public \u079b(Pattern pattern) {
            this.\u037f = pattern;
        }

        public String toString() {
            Pattern pattern = this.\u037f;
            return String.format(SOY.d("403F3002171F1F211E011A5F5F2178"), pattern);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return this.\u037f.matcher(\u013a3.\u08ab()).find();
        }
    }

    public static final class \u079c
    extends \u020b {
        private final String \u037f;

        public \u079c(String string) {
            this.\u037f = string;
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("5F21"), string);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return \u013a3.\u08aa().equals(this.\u037f);
        }
    }

    public static final class \u079d
    extends \u020b {
        private final String \u037f;

        public \u079d(String string) {
            this.\u037f = string;
        }

        public String toString() {
            String string = this.\u037f;
            return String.format(SOY.d("5F21"), string);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return \u013a3.\u08aa().endsWith(this.\u037f);
        }
    }
}

