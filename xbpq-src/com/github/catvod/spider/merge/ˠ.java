/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b2;
import com.github.catvod.spider.merge.\u02e1;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class \u02e0
implements Serializable {
    private static final \u058f[] \u037f = new \u058f[0];
    private static final ConcurrentMap<\u0781, String> \u0528 = new ConcurrentHashMap<\u0781, String>(7);
    private final String \u0529;
    private final TimeZone \u052a;
    private final Locale \u052b;
    private transient \u058f[] \u052c;
    private transient int \u052d;

    protected \u02e0(String string, TimeZone timeZone, Locale locale) {
        this.\u0529 = string;
        this.\u052a = timeZone;
        this.\u052b = \u02e1.\u037f(locale);
        this.\u0784();
    }

    private static void \u0529(Appendable appendable, int n2) {
        appendable.append((char)(n2 / 10 + 48));
        appendable.append((char)(n2 % 10 + 48));
    }

    private static void \u052a(Appendable appendable, int n2, int n3) {
        block12: {
            block8: {
                block9: {
                    block10: {
                        block11: {
                            if (n2 >= 10000) break block8;
                            int n4 = n2 < 1000 ? (n2 < 100 ? (n2 < 10 ? 1 : 2) : 3) : 4;
                            n3 -= n4;
                            while (n3 > 0) {
                                appendable.append('0');
                                --n3;
                            }
                            n3 = n2;
                            if (n4 == 1) break block9;
                            n3 = n2;
                            if (n4 == 2) break block10;
                            n3 = n2;
                            if (n4 == 3) break block11;
                            if (n4 != 4) break block12;
                            appendable.append((char)(n2 / 1000 + 48));
                            n3 = n2 % 1000;
                        }
                        if (n3 >= 100) {
                            appendable.append((char)(n3 / 100 + 48));
                            n3 %= 100;
                        } else {
                            appendable.append('0');
                        }
                    }
                    if (n3 >= 10) {
                        appendable.append((char)(n3 / 10 + 48));
                        n3 %= 10;
                    } else {
                        appendable.append('0');
                    }
                }
                appendable.append((char)(n3 + 48));
                break block12;
            }
            char[] cArray = new char[10];
            int n5 = 0;
            int n6 = n2;
            n2 = n5;
            while (true) {
                n5 = n3;
                if (n6 == 0) break;
                cArray[n2] = (char)(n6 % 10 + 48);
                n6 /= 10;
                ++n2;
            }
            while (true) {
                n3 = n2;
                if (n2 >= n5) break;
                appendable.append('0');
                --n5;
            }
            while (--n3 >= 0) {
                appendable.append(cArray[n3]);
            }
        }
    }

    private <B extends Appendable> B \u052b(Calendar calendar, B b2) {
        \u058f[] \u058fArray = this.\u052c;
        int n2 = \u058fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            try {
                \u058fArray[i2].\u0528(b2, calendar);
                continue;
            }
            catch (IOException iOException) {
                \u02b2.\u052b(iOException);
                break;
            }
        }
        return b2;
    }

    private String \u052c(Calendar calendar) {
        return this.\u052b(calendar, new StringBuilder(this.\u052d)).toString();
    }

    static String \u0783(TimeZone object, boolean bl, int n2, Locale locale) {
        \u0781 \u07812 = new \u0781((TimeZone)object, bl, n2, locale);
        ConcurrentMap<\u0781, String> concurrentMap = \u0528;
        String string = (String)concurrentMap.get(\u07812);
        Object object2 = string;
        if (string == null && (object = concurrentMap.putIfAbsent(\u07812, (String)(object2 = ((TimeZone)object).getDisplayName(bl, n2, locale)))) != null) {
            object2 = object;
        }
        return object2;
    }

    private void \u0784() {
        \u058f[] \u058fArray = this.\u0786().toArray(\u037f);
        this.\u052c = \u058fArray;
        int n2 = \u058fArray.length;
        int n3 = 0;
        while (--n2 >= 0) {
            n3 += this.\u052c[n2].\u0529();
        }
        this.\u052d = n3;
    }

    private Calendar \u0785() {
        return Calendar.getInstance(this.\u052a, this.\u052b);
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof \u02e0;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (\u02e0)object;
        bl = bl2;
        if (this.\u0529.equals(((\u02e0)object).\u0529)) {
            bl = bl2;
            if (this.\u052a.equals(((\u02e0)object).\u052a)) {
                bl = bl2;
                if (this.\u052b.equals(((\u02e0)object).\u052b)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public int hashCode() {
        return this.\u0529.hashCode() + (this.\u052a.hashCode() + this.\u052b.hashCode() * 13) * 13;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("3C33220230160E3701041D190E37232D"));
        stringBuilder.append(this.\u0529);
        String string = SOY.d("56");
        stringBuilder.append(string);
        stringBuilder.append(this.\u052b);
        stringBuilder.append(string);
        stringBuilder.append(this.\u052a.getID());
        stringBuilder.append(SOY.d("27"));
        return stringBuilder.toString();
    }

    public <B extends Appendable> B \u052d(Calendar calendar, B b2) {
        Calendar calendar2 = calendar;
        if (!calendar.getTimeZone().equals(this.\u052a)) {
            calendar2 = (Calendar)calendar.clone();
            calendar2.setTimeZone(this.\u052a);
        }
        return this.\u052b(calendar2, b2);
    }

    public String \u052e(long l2) {
        Calendar calendar = this.\u0785();
        calendar.setTimeInMillis(l2);
        return this.\u052c(calendar);
    }

    String \u052f(Object object) {
        if (object instanceof Date) {
            return this.\u0620((Date)object);
        }
        if (object instanceof Calendar) {
            return this.\u058f((Calendar)object);
        }
        if (object instanceof Long) {
            return this.\u052e((Long)object);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("2F3C3A181B001472321A1504096871"));
        object = object == null ? SOY.d("463C241A1849") : object.getClass().getName();
        stringBuilder.append((String)object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String \u058f(Calendar calendar) {
        return this.\u052d(calendar, new StringBuilder(this.\u052d)).toString();
    }

    public String \u0620(Date date) {
        Calendar calendar = this.\u0785();
        calendar.setTime(date);
        return this.\u052c(calendar);
    }

    public Locale \u0780() {
        return this.\u052b;
    }

    public String \u0781() {
        return this.\u0529;
    }

    public TimeZone \u0782() {
        return this.\u052a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected List<\u058f> \u0786() {
        var5_1 /* !! */  = new DateFormatSymbols(this.\u052b);
        var10_2 = new ArrayList<\u058f>();
        var9_3 = var5_1 /* !! */ .getEras();
        var12_4 = var5_1 /* !! */ .getMonths();
        var11_5 = var5_1 /* !! */ .getShortMonths();
        var8_6 = var5_1 /* !! */ .getWeekdays();
        var7_7 = var5_1 /* !! */ .getShortWeekdays();
        var13_8 = var5_1 /* !! */ .getAmPmStrings();
        var2_9 = this.\u0529.length();
        var14_10 = new int[1];
        var1_11 = 0;
        while (var1_11 < var2_9) {
            block39: {
                block36: {
                    block38: {
                        block37: {
                            var14_10[0] = var1_11;
                            var5_1 /* !! */  = this.\u0787(this.\u0529, var14_10);
                            var1_11 = var14_10[0];
                            var4_13 = var5_1 /* !! */ .length();
                            if (var4_13 == 0) {
                                return var10_2;
                            }
                            var3_12 = var5_1 /* !! */ .charAt(0);
                            if (var3_12 == 'y') break block36;
                            if (var3_12 == 'z') break block37;
                            switch (var3_12) {
                                default: {
                                    switch (var3_12) {
                                        default: {
                                            switch (var3_12) {
                                                default: {
                                                    var6_14 = new StringBuilder();
                                                    var6_14.append(SOY.d("333E3D1313161672211700031F203F56171817223E1811190E6871"));
                                                    var6_14.append((String)var5_1 /* !! */ );
                                                    throw new IllegalArgumentException(var6_14.toString());
                                                }
                                                case 'Z': {
                                                    if (var4_13 == 1) {
                                                        var5_1 /* !! */  = \u0783.\u0528;
                                                        break;
                                                    }
                                                    if (var4_13 == 2) {
                                                        var5_1 /* !! */  = com.github.catvod.spider.merge.\u02e0$\u052a.\u0529;
                                                        break;
                                                    }
                                                    var5_1 /* !! */  = \u0783.\u037f;
                                                    break;
                                                }
                                                case 'Y': {
                                                    break block36;
                                                }
                                                case 'X': {
                                                    var5_1 /* !! */  = com.github.catvod.spider.merge.\u02e0$\u052a.\u052a(var4_13);
                                                    break;
                                                }
                                                case 'W': {
                                                    var5_1 /* !! */  = this.\u0788(4, var4_13);
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        case 'H': {
                                            var5_1 /* !! */  = this.\u0788(11, var4_13);
                                            break;
                                        }
                                        case 'G': {
                                            var5_1 /* !! */  = new \u0780(0, var9_3);
                                            break;
                                        }
                                        case 'F': {
                                            var5_1 /* !! */  = this.\u0788(8, var4_13);
                                            break;
                                        }
                                        case 'E': {
                                            var5_1 /* !! */  = var4_13 < 4 ? var7_7 : var8_6;
                                            var5_1 /* !! */  = new \u0780(7, var5_1 /* !! */ );
                                            break;
                                        }
                                        case 'D': {
                                            var5_1 /* !! */  = this.\u0788(6, var4_13);
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 'w': {
                                    var5_1 /* !! */  = this.\u0788(3, var4_13);
                                    break;
                                }
                                case 'u': {
                                    var5_1 /* !! */  = new \u0528(this.\u0788(7, var4_13));
                                    break;
                                }
                                case 's': {
                                    var5_1 /* !! */  = this.\u0788(13, var4_13);
                                    break;
                                }
                                case 'm': {
                                    var5_1 /* !! */  = this.\u0788(12, var4_13);
                                    break;
                                }
                                case 'k': {
                                    var5_1 /* !! */  = new \u0785(this.\u0788(11, var4_13));
                                    break;
                                }
                                case 'h': {
                                    var5_1 /* !! */  = new \u0784(this.\u0788(10, var4_13));
                                    break;
                                }
                                case 'd': {
                                    var5_1 /* !! */  = this.\u0788(5, var4_13);
                                    break;
                                }
                                case 'a': {
                                    var5_1 /* !! */  = new \u0780(9, var13_8);
                                    break;
                                }
                                case 'S': {
                                    var5_1 /* !! */  = this.\u0788(14, var4_13);
                                    break;
                                }
                                case 'M': {
                                    if (var4_13 >= 4) {
                                        var5_1 /* !! */  = new \u0780(2, var12_4);
                                        break;
                                    }
                                    if (var4_13 == 3) {
                                        var5_1 /* !! */  = new \u0780(2, var11_5);
                                        break;
                                    }
                                    if (var4_13 == 2) {
                                        var5_1 /* !! */  = \u0786.\u037f;
                                        break;
                                    }
                                    var5_1 /* !! */  = \u0789.\u037f;
                                    break;
                                }
                                case 'K': {
                                    var5_1 /* !! */  = this.\u0788(10, var4_13);
                                    break;
                                }
                                case '\'': {
                                    var5_1 /* !! */  = var5_1 /* !! */ .substring(1);
                                    if (var5_1 /* !! */ .length() == 1) {
                                        var5_1 /* !! */  = new \u037f(var5_1 /* !! */ .charAt(0));
                                        break;
                                    }
                                    var5_1 /* !! */  = new \u0620((String)var5_1 /* !! */ );
                                    break;
                                }
                            }
                            break block38;
                        }
                        var5_1 /* !! */  = var4_13 >= 4 ? new \u0782(this.\u052a, this.\u052b, 1) : new \u0782(this.\u052a, this.\u052b, 0);
                    }
                    var6_14 = var5_1 /* !! */ ;
                    ** break;
lbl124:
                    // 1 sources

                    break block39;
                }
                var5_1 /* !! */  = var4_13 == 2 ? \u0788.\u037f : this.\u0788(1, Math.max(var4_13, 4));
                var6_14 = var5_1 /* !! */ ;
                if (var3_12 == 'Y') {
                    var6_14 = new \u078b((\u052c)var5_1 /* !! */ );
                }
            }
            var10_2.add((\u058f)var6_14);
            ++var1_11;
        }
        return var10_2;
    }

    protected String \u0787(String string, int[] nArray) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = nArray[0];
        int n4 = string.length();
        char c2 = string.charAt(n3);
        if (c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z') {
            stringBuilder.append(c2);
            while (true) {
                int n5 = n3 + 1;
                n2 = n3;
                if (n5 < n4) {
                    n2 = n3;
                    if (string.charAt(n5) == c2) {
                        stringBuilder.append(c2);
                        n3 = n5;
                        continue;
                    }
                }
                break;
            }
        } else {
            stringBuilder.append('\'');
            boolean bl = false;
            while (true) {
                n2 = ++n3;
                if (n3 >= n4) break;
                c2 = string.charAt(n3);
                if (c2 == '\'') {
                    n2 = n3 + 1;
                    if (n2 < n4 && string.charAt(n2) == '\'') {
                        stringBuilder.append(c2);
                        n3 = n2;
                        continue;
                    }
                    bl ^= true;
                    continue;
                }
                if (!bl && (c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z')) {
                    n2 = n3 - 1;
                    break;
                }
                stringBuilder.append(c2);
            }
        }
        nArray[0] = n2;
        return stringBuilder.toString();
    }

    protected \u052c \u0788(int n2, int n3) {
        if (n3 != 1) {
            if (n3 != 2) {
                return new \u052e(n2, n3);
            }
            return new \u0787(n2);
        }
        return new \u078a(n2);
    }

    private static class \u037f
    implements \u058f {
        private final char \u037f;

        \u037f(char c2) {
            this.\u037f = c2;
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            appendable.append(this.\u037f);
        }

        @Override
        public int \u0529() {
            return 1;
        }
    }

    private static class \u0528
    implements \u052c {
        private final \u052c \u037f;

        \u0528(\u052c \u052d) {
            this.\u037f = \u052d;
        }

        @Override
        public void \u037f(Appendable appendable, int n2) {
            this.\u037f.\u037f(appendable, n2);
        }

        @Override
        public void \u0528(Appendable appendable, Calendar object) {
            int n2 = 7;
            int n3 = ((Calendar)object).get(7);
            object = this.\u037f;
            if (n3 != 1) {
                n2 = n3 - 1;
            }
            object.\u037f(appendable, n2);
        }

        @Override
        public int \u0529() {
            return this.\u037f.\u0529();
        }
    }

    private static class \u052a
    implements \u058f {
        static final \u052a \u037f = new \u052a(3);
        static final \u052a \u0528 = new \u052a(5);
        static final \u052a \u0529 = new \u052a(6);
        final int \u052a;

        \u052a(int n2) {
            this.\u052a = n2;
        }

        static \u052a \u052a(int n2) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        return \u0529;
                    }
                    throw new IllegalArgumentException(SOY.d("133C2717181E1E723F0319151F207119125722"));
                }
                return \u0528;
            }
            return \u037f;
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            int n2 = calendar.get(15) + calendar.get(16);
            if (n2 == 0) {
                appendable.append(SOY.d("20"));
                return;
            }
            if (n2 < 0) {
                appendable.append('-');
                n2 = -n2;
            } else {
                appendable.append('+');
            }
            int n3 = n2 / 3600000;
            \u02e0.\u0529(appendable, n3);
            int n4 = this.\u052a;
            if (n4 < 5) {
                return;
            }
            if (n4 == 6) {
                appendable.append(':');
            }
            \u02e0.\u0529(appendable, n2 / 60000 - n3 * 60);
        }

        @Override
        public int \u0529() {
            return this.\u052a;
        }
    }

    private static interface \u052c
    extends \u058f {
        public void \u037f(Appendable var1, int var2);
    }

    private static class \u052e
    implements \u052c {
        private final int \u037f;
        private final int \u0528;

        \u052e(int n2, int n3) {
            if (n3 >= 3) {
                this.\u037f = n2;
                this.\u0528 = n3;
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override
        public final void \u037f(Appendable appendable, int n2) {
            \u02e0.\u052a(appendable, n2, this.\u0528);
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            this.\u037f(appendable, calendar.get(this.\u037f));
        }

        @Override
        public int \u0529() {
            return this.\u0528;
        }
    }

    private static interface \u058f {
        public void \u0528(Appendable var1, Calendar var2);

        public int \u0529();
    }

    private static class \u0620
    implements \u058f {
        private final String \u037f;

        \u0620(String string) {
            this.\u037f = string;
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            appendable.append(this.\u037f);
        }

        @Override
        public int \u0529() {
            return this.\u037f.length();
        }
    }

    private static class \u0780
    implements \u058f {
        private final int \u037f;
        private final String[] \u0528;

        \u0780(int n2, String[] stringArray) {
            this.\u037f = n2;
            this.\u0528 = stringArray;
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            appendable.append(this.\u0528[calendar.get(this.\u037f)]);
        }

        @Override
        public int \u0529() {
            int n2;
            int n3 = this.\u0528.length;
            int n4 = 0;
            while ((n2 = n3 - 1) >= 0) {
                int n5 = this.\u0528[n2].length();
                n3 = n2;
                if (n5 <= n4) continue;
                n4 = n5;
                n3 = n2;
            }
            return n4;
        }
    }

    private static class \u0781 {
        private final TimeZone \u037f;
        private final int \u0528;
        private final Locale \u0529;

        \u0781(TimeZone timeZone, boolean bl, int n2, Locale locale) {
            this.\u037f = timeZone;
            this.\u0528 = bl ? Integer.MIN_VALUE | n2 : n2;
            this.\u0529 = \u02e1.\u037f(locale);
        }

        public boolean equals(Object object) {
            boolean bl = true;
            if (this == object) {
                return true;
            }
            if (object instanceof \u0781) {
                object = (\u0781)object;
                if (!this.\u037f.equals(((\u0781)object).\u037f) || this.\u0528 != ((\u0781)object).\u0528 || !this.\u0529.equals(((\u0781)object).\u0529)) {
                    bl = false;
                }
                return bl;
            }
            return false;
        }

        public int hashCode() {
            return (this.\u0528 * 31 + this.\u0529.hashCode()) * 31 + this.\u037f.hashCode();
        }
    }

    private static class \u0782
    implements \u058f {
        private final Locale \u037f;
        private final int \u0528;
        private final String \u0529;
        private final String \u052a;

        \u0782(TimeZone timeZone, Locale locale, int n2) {
            this.\u037f = \u02e1.\u037f(locale);
            this.\u0528 = n2;
            this.\u0529 = \u02e0.\u0783(timeZone, false, n2, locale);
            this.\u052a = \u02e0.\u0783(timeZone, true, n2, locale);
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) == 0) {
                appendable.append(\u02e0.\u0783(timeZone, false, this.\u0528, this.\u037f));
            } else {
                appendable.append(\u02e0.\u0783(timeZone, true, this.\u0528, this.\u037f));
            }
        }

        @Override
        public int \u0529() {
            return Math.max(this.\u0529.length(), this.\u052a.length());
        }
    }

    private static class \u0783
    implements \u058f {
        static final \u0783 \u037f = new \u0783(true);
        static final \u0783 \u0528 = new \u0783(false);
        final boolean \u0529;

        \u0783(boolean bl) {
            this.\u0529 = bl;
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            int n2 = calendar.get(15) + calendar.get(16);
            if (n2 < 0) {
                appendable.append('-');
                n2 = -n2;
            } else {
                appendable.append('+');
            }
            int n3 = n2 / 3600000;
            \u02e0.\u0529(appendable, n3);
            if (this.\u0529) {
                appendable.append(':');
            }
            \u02e0.\u0529(appendable, n2 / 60000 - n3 * 60);
        }

        @Override
        public int \u0529() {
            return 5;
        }
    }

    private static class \u0784
    implements \u052c {
        private final \u052c \u037f;

        \u0784(\u052c \u052d) {
            this.\u037f = \u052d;
        }

        @Override
        public void \u037f(Appendable appendable, int n2) {
            this.\u037f.\u037f(appendable, n2);
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            int n2;
            int n3 = n2 = calendar.get(10);
            if (n2 == 0) {
                n3 = calendar.getLeastMaximum(10) + 1;
            }
            this.\u037f.\u037f(appendable, n3);
        }

        @Override
        public int \u0529() {
            return this.\u037f.\u0529();
        }
    }

    private static class \u0785
    implements \u052c {
        private final \u052c \u037f;

        \u0785(\u052c \u052d) {
            this.\u037f = \u052d;
        }

        @Override
        public void \u037f(Appendable appendable, int n2) {
            this.\u037f.\u037f(appendable, n2);
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            int n2;
            int n3 = n2 = calendar.get(11);
            if (n2 == 0) {
                n3 = calendar.getMaximum(11) + 1;
            }
            this.\u037f.\u037f(appendable, n3);
        }

        @Override
        public int \u0529() {
            return this.\u037f.\u0529();
        }
    }

    private static class \u0786
    implements \u052c {
        static final \u0786 \u037f = new \u0786();

        \u0786() {
        }

        @Override
        public final void \u037f(Appendable appendable, int n2) {
            \u02e0.\u0529(appendable, n2);
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            this.\u037f(appendable, calendar.get(2) + 1);
        }

        @Override
        public int \u0529() {
            return 2;
        }
    }

    private static class \u0787
    implements \u052c {
        private final int \u037f;

        \u0787(int n2) {
            this.\u037f = n2;
        }

        @Override
        public final void \u037f(Appendable appendable, int n2) {
            if (n2 < 100) {
                \u02e0.\u0529(appendable, n2);
            } else {
                \u02e0.\u052a(appendable, n2, 2);
            }
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            this.\u037f(appendable, calendar.get(this.\u037f));
        }

        @Override
        public int \u0529() {
            return 2;
        }
    }

    private static class \u0788
    implements \u052c {
        static final \u0788 \u037f = new \u0788();

        \u0788() {
        }

        @Override
        public final void \u037f(Appendable appendable, int n2) {
            \u02e0.\u0529(appendable, n2 % 100);
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            this.\u037f(appendable, calendar.get(1) % 100);
        }

        @Override
        public int \u0529() {
            return 2;
        }
    }

    private static class \u0789
    implements \u052c {
        static final \u0789 \u037f = new \u0789();

        \u0789() {
        }

        @Override
        public final void \u037f(Appendable appendable, int n2) {
            if (n2 < 10) {
                appendable.append((char)(n2 + 48));
            } else {
                \u02e0.\u0529(appendable, n2);
            }
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            this.\u037f(appendable, calendar.get(2) + 1);
        }

        @Override
        public int \u0529() {
            return 2;
        }
    }

    private static class \u078a
    implements \u052c {
        private final int \u037f;

        \u078a(int n2) {
            this.\u037f = n2;
        }

        @Override
        public final void \u037f(Appendable appendable, int n2) {
            if (n2 < 10) {
                appendable.append((char)(n2 + 48));
            } else if (n2 < 100) {
                \u02e0.\u0529(appendable, n2);
            } else {
                \u02e0.\u052a(appendable, n2, 1);
            }
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            this.\u037f(appendable, calendar.get(this.\u037f));
        }

        @Override
        public int \u0529() {
            return 4;
        }
    }

    private static class \u078b
    implements \u052c {
        private final \u052c \u037f;

        \u078b(\u052c \u052d) {
            this.\u037f = \u052d;
        }

        @Override
        public void \u037f(Appendable appendable, int n2) {
            this.\u037f.\u037f(appendable, n2);
        }

        @Override
        public void \u0528(Appendable appendable, Calendar calendar) {
            this.\u037f.\u037f(appendable, calendar.getWeekYear());
        }

        @Override
        public int \u0529() {
            return this.\u037f.\u0529();
        }
    }
}

