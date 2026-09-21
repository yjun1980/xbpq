/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u06e6;
import com.github.catvod.spider.merge.\u0f8b;

abstract class \u017f {
    \u0782 \u037f;

    private \u017f() {
    }

    static void \u0782(StringBuilder stringBuilder) {
        if (stringBuilder != null) {
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    final \u052a \u037f() {
        return (\u052a)this;
    }

    final \u052c \u0528() {
        return (\u052c)this;
    }

    final \u052e \u0529() {
        return (\u052e)this;
    }

    final \u0620 \u052a() {
        return (\u0620)this;
    }

    final \u0780 \u052b() {
        return (\u0780)this;
    }

    final boolean \u052c() {
        return this instanceof \u0528;
    }

    final boolean \u052d() {
        boolean bl = this.\u037f == \u0782.\u052b;
        return bl;
    }

    final boolean \u052e() {
        boolean bl = this.\u037f == \u0782.\u052a;
        return bl;
    }

    final boolean \u052f() {
        boolean bl = this.\u037f == \u0782.\u037f;
        return bl;
    }

    final boolean \u058f() {
        boolean bl = this.\u037f == \u0782.\u052c;
        return bl;
    }

    final boolean \u0620() {
        boolean bl = this.\u037f == \u0782.\u0529;
        return bl;
    }

    final boolean \u0780() {
        boolean bl = this.\u037f == \u0782.\u0528;
        return bl;
    }

    abstract \u017f \u0781();

    String \u0783() {
        return this.getClass().getSimpleName();
    }

    static final class \u0528
    extends \u052a {
        \u0528(String string) {
            this.\u0784(string);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("46730A3530362E130A"));
            stringBuilder.append(this.\u0785());
            stringBuilder.append(SOY.d("270F6F"));
            return stringBuilder.toString();
        }
    }

    static class \u052a
    extends \u017f {
        private String \u0528;

        \u052a() {
            this.\u037f = \u0782.\u052b;
        }

        public String toString() {
            return this.\u0785();
        }

        @Override
        \u017f \u0781() {
            this.\u0528 = null;
            return this;
        }

        \u052a \u0784(String string) {
            this.\u0528 = string;
            return this;
        }

        String \u0785() {
            return this.\u0528;
        }
    }

    static final class \u052c
    extends \u017f {
        private final StringBuilder \u0528 = new StringBuilder();
        private String \u0529;
        boolean \u052a = false;

        \u052c() {
            this.\u037f = \u0782.\u052a;
        }

        private void \u0786() {
            String string = this.\u0529;
            if (string != null) {
                this.\u0528.append(string);
                this.\u0529 = null;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("46737C5B"));
            stringBuilder.append(this.\u0787());
            stringBuilder.append(SOY.d("577F6F"));
            return stringBuilder.toString();
        }

        @Override
        \u017f \u0781() {
            \u017f.\u0782(this.\u0528);
            this.\u0529 = null;
            this.\u052a = false;
            return this;
        }

        final \u052c \u0784(char c2) {
            this.\u0786();
            this.\u0528.append(c2);
            return this;
        }

        final \u052c \u0785(String string) {
            this.\u0786();
            if (this.\u0528.length() == 0) {
                this.\u0529 = string;
            } else {
                this.\u0528.append(string);
            }
            return this;
        }

        String \u0787() {
            String string = this.\u0529;
            if (string == null) {
                string = this.\u0528.toString();
            }
            return string;
        }
    }

    static final class \u052e
    extends \u017f {
        final StringBuilder \u0528 = new StringBuilder();
        String \u0529 = null;
        final StringBuilder \u052a = new StringBuilder();
        final StringBuilder \u052b = new StringBuilder();
        boolean \u052c = false;

        \u052e() {
            this.\u037f = \u0782.\u037f;
        }

        @Override
        \u017f \u0781() {
            \u017f.\u0782(this.\u0528);
            this.\u0529 = null;
            \u017f.\u0782(this.\u052a);
            \u017f.\u0782(this.\u052b);
            this.\u052c = false;
            return this;
        }

        String \u0784() {
            return this.\u0528.toString();
        }

        String \u0785() {
            return this.\u0529;
        }

        String \u0786() {
            return this.\u052a.toString();
        }

        public String \u0787() {
            return this.\u052b.toString();
        }

        public boolean \u0788() {
            return this.\u052c;
        }
    }

    static final class \u058f
    extends \u017f {
        \u058f() {
            this.\u037f = \u0782.\u052c;
        }

        public String toString() {
            return "";
        }

        @Override
        \u017f \u0781() {
            return this;
        }
    }

    static final class \u0620
    extends \u0781 {
        \u0620() {
            this.\u037f = \u0782.\u0529;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("467D"));
            stringBuilder.append(this.\u0796());
            stringBuilder.append(SOY.d("44"));
            return stringBuilder.toString();
        }
    }

    static final class \u0780
    extends \u0781 {
        \u0780() {
            this.\u037f = \u0782.\u0528;
        }

        public String toString() {
            boolean bl = this.\u078e();
            String string = SOY.d("44");
            String string2 = SOY.d("46");
            if (bl && this.\u058f.size() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(this.\u0796());
                stringBuilder.append(SOY.d("5A"));
                stringBuilder.append(this.\u058f.toString());
                stringBuilder.append(string);
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(this.\u0796());
            stringBuilder.append(string);
            return stringBuilder.toString();
        }

        @Override
        \u0781 \u0794() {
            super.\u0794();
            this.\u058f = null;
            return this;
        }

        \u0780 \u0797(String string, \u0f8b \u0f8b2) {
            this.\u0528 = string;
            this.\u058f = \u0f8b2;
            this.\u0529 = \u06e6.\u037f(string);
            return this;
        }
    }

    static abstract class \u0781
    extends \u017f {
        protected String \u0528;
        protected String \u0529;
        private String \u052a;
        private StringBuilder \u052b = new StringBuilder();
        private String \u052c;
        private boolean \u052d = false;
        private boolean \u052e = false;
        boolean \u052f = false;
        \u0f8b \u058f;

        \u0781() {
        }

        private void \u078b() {
            this.\u052e = true;
            String string = this.\u052c;
            if (string != null) {
                this.\u052b.append(string);
                this.\u052c = null;
            }
        }

        final void \u0784(char c2) {
            this.\u0785(String.valueOf(c2));
        }

        final void \u0785(String string) {
            String string2 = this.\u052a;
            if (string2 != null) {
                string = string2.concat(string);
            }
            this.\u052a = string;
        }

        final void \u0786(char c2) {
            this.\u078b();
            this.\u052b.append(c2);
        }

        final void \u0787(String string) {
            this.\u078b();
            if (this.\u052b.length() == 0) {
                this.\u052c = string;
            } else {
                this.\u052b.append(string);
            }
        }

        final void \u0788(int[] nArray) {
            this.\u078b();
            for (int n2 : nArray) {
                this.\u052b.appendCodePoint(n2);
            }
        }

        final void \u0789(char c2) {
            this.\u078a(String.valueOf(c2));
        }

        final void \u078a(String string) {
            String string2 = this.\u0528;
            if (string2 != null) {
                string = string2.concat(string);
            }
            this.\u0528 = string;
            this.\u0529 = \u06e6.\u037f(string);
        }

        final void \u078c() {
            if (this.\u052a != null) {
                this.\u0792();
            }
        }

        final boolean \u078d(String string) {
            \u0f8b \u0f8b2 = this.\u058f;
            boolean bl = \u0f8b2 != null && \u0f8b2.\u0781(string);
            return bl;
        }

        final boolean \u078e() {
            boolean bl = this.\u058f != null;
            return bl;
        }

        final boolean \u078f() {
            return this.\u052f;
        }

        final String \u0790() {
            String string = this.\u0528;
            boolean bl = string == null || string.length() == 0;
            \u01c3.\u0528(bl);
            return this.\u0528;
        }

        final \u0781 \u0791(String string) {
            this.\u0528 = string;
            this.\u0529 = \u06e6.\u037f(string);
            return this;
        }

        final void \u0792() {
            String string;
            if (this.\u058f == null) {
                this.\u058f = new \u0f8b();
            }
            if ((string = this.\u052a) != null) {
                this.\u052a = string = string.trim();
                if (string.length() > 0) {
                    string = this.\u052e ? (this.\u052b.length() > 0 ? this.\u052b.toString() : this.\u052c) : (this.\u052d ? "" : null);
                    this.\u058f.\u052a(this.\u052a, string);
                }
            }
            this.\u052a = null;
            this.\u052d = false;
            this.\u052e = false;
            \u017f.\u0782(this.\u052b);
            this.\u052c = null;
        }

        final String \u0793() {
            return this.\u0529;
        }

        \u0781 \u0794() {
            this.\u0528 = null;
            this.\u0529 = null;
            this.\u052a = null;
            \u017f.\u0782(this.\u052b);
            this.\u052c = null;
            this.\u052d = false;
            this.\u052e = false;
            this.\u052f = false;
            this.\u058f = null;
            return this;
        }

        final void \u0795() {
            this.\u052d = true;
        }

        final String \u0796() {
            String string = this.\u0528;
            if (string == null) {
                string = SOY.d("21273F05110327");
            }
            return string;
        }
    }

    public static final class \u0782
    extends Enum<\u0782> {
        public static final /* enum */ \u0782 \u037f;
        public static final /* enum */ \u0782 \u0528;
        public static final /* enum */ \u0782 \u0529;
        public static final /* enum */ \u0782 \u052a;
        public static final /* enum */ \u0782 \u052b;
        public static final /* enum */ \u0782 \u052c;
        private static final \u0782[] \u052d;

        static {
            \u0782 \u07822;
            \u0782 \u07823;
            \u0782 \u07824;
            \u0782 \u07825;
            \u0782 \u07826;
            \u0782 \u07827;
            \u037f = \u07827 = new \u0782();
            \u0528 = \u07826 = new \u0782();
            \u0529 = \u07825 = new \u0782();
            \u052a = \u07824 = new \u0782();
            \u052b = \u07823 = new \u0782();
            \u052c = \u07822 = new \u0782();
            \u052d = new \u0782[]{\u07827, \u07826, \u07825, \u07824, \u07823, \u07822};
        }

        public static \u0782[] \u037f() {
            return (\u0782[])\u052d.clone();
        }
    }
}

