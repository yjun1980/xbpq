/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02ce;
import com.github.catvod.spider.merge.\u02e1;
import com.github.catvod.spider.merge.\u079a;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class \u0773
implements Serializable {
    static final Locale \u037f;
    private static final Comparator<String> \u0528;
    private static final ConcurrentMap<Locale, \u0783>[] \u0529;
    private static final \u0783 \u052a;
    private static final \u0783 \u052b;
    private static final \u0783 \u052c;
    private static final \u0783 \u052d;
    private static final \u0783 \u052e;
    private static final \u0783 \u052f;
    private static final \u0783 \u058f;
    private static final \u0783 \u0620;
    private static final \u0783 \u0780;
    private static final \u0783 \u0781;
    private static final \u0783 \u0782;
    private static final \u0783 \u0783;
    private static final \u0783 \u0784;
    private static final \u0783 \u0785;
    private static final \u0783 \u0786;
    private static final \u0783 \u0787;
    private final String \u0788;
    private final TimeZone \u0789;
    private final Locale \u078a;
    private final int \u078b;
    private final int \u078c;
    private transient List<\u0784> \u078d;

    static {
        String string = SOY.d("1033");
        String string2 = SOY.d("3002");
        \u037f = new Locale(string, string2, string2);
        \u0528 = \u079a.\u037f();
        \u0529 = new ConcurrentMap[17];
        \u052a = new \u0781(1){

            @Override
            int \u0529(\u0773 \u07732, int n2) {
                int n3 = n2;
                if (n2 < 100) {
                    n3 = \u07732.\u052e(n2);
                }
                return n3;
            }
        };
        \u052b = new \u0781(2){

            @Override
            int \u0529(\u0773 \u07732, int n2) {
                return n2 - 1;
            }
        };
        \u052c = new \u0781(1);
        \u052d = new \u0781(3);
        \u052e = new \u0781(4);
        \u052f = new \u0781(6);
        \u058f = new \u0781(5);
        \u0620 = new \u0781(7){

            @Override
            int \u0529(\u0773 \u07732, int n2) {
                int n3 = 1;
                n2 = n2 == 7 ? n3 : ++n2;
                return n2;
            }
        };
        \u0780 = new \u0781(8);
        \u0781 = new \u0781(11);
        \u0782 = new \u0781(11){

            @Override
            int \u0529(\u0773 \u07732, int n2) {
                int n3 = n2;
                if (n2 == 24) {
                    n3 = 0;
                }
                return n3;
            }
        };
        \u0783 = new \u0781(10){

            @Override
            int \u0529(\u0773 \u07732, int n2) {
                int n3 = n2;
                if (n2 == 12) {
                    n3 = 0;
                }
                return n3;
            }
        };
        \u0784 = new \u0781(10);
        \u0785 = new \u0781(12);
        \u0786 = new \u0781(13);
        \u0787 = new \u0781(14);
    }

    protected \u0773(String object, TimeZone cloneable, Locale locale, Date date) {
        int n2;
        int n3;
        this.\u0788 = object;
        this.\u0789 = cloneable;
        this.\u078a = object = \u02e1.\u037f(locale);
        cloneable = Calendar.getInstance((TimeZone)cloneable, (Locale)object);
        if (date != null) {
            ((Calendar)cloneable).setTime(date);
            n3 = ((Calendar)cloneable).get(1);
        } else if (((Locale)object).equals(\u037f)) {
            n3 = 0;
        } else {
            ((Calendar)cloneable).setTime(new Date());
            n3 = ((Calendar)cloneable).get(1) - 80;
        }
        this.\u078b = n2 = n3 / 100 * 100;
        this.\u078c = n3 - n2;
        this.\u0781((Calendar)cloneable);
    }

    private int \u052e(int n2) {
        int n3 = this.\u078b + n2;
        n2 = n2 >= this.\u078c ? n3 : n3 + 100;
        return n2;
    }

    private static Map<String, Integer> \u052f(Calendar object, Locale locale, int n2, StringBuilder stringBuilder) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        locale = \u02e1.\u037f(locale);
        Object object2 = ((Calendar)object).getDisplayNames(n2, 0, locale);
        object = new TreeSet<String>(\u0528);
        for (Map.Entry<String, Integer> entry : object2.entrySet()) {
            object2 = entry.getKey().toLowerCase(locale);
            if (!((TreeSet)object).add(object2)) continue;
            hashMap.put((String)object2, entry.getValue());
        }
        object = ((TreeSet)object).iterator();
        while (object.hasNext()) {
            \u0773.\u0787(stringBuilder, (String)object.next()).append('|');
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ConcurrentMap<Locale, \u0783> \u058f(int n2) {
        ConcurrentMap<Locale, \u0783>[] concurrentMapArray = \u0529;
        synchronized (concurrentMapArray) {
            if (concurrentMapArray[n2] != null) return concurrentMapArray[n2];
            ConcurrentHashMap<Locale, \u0783> concurrentHashMap = new ConcurrentHashMap<Locale, \u0783>(3);
            concurrentMapArray[n2] = concurrentHashMap;
            return concurrentMapArray[n2];
        }
    }

    private \u0783 \u0620(int n2, Calendar object) {
        ConcurrentMap<Locale, \u0783> concurrentMap = \u0773.\u058f(n2);
        \u0783 \u07832 = (\u0783)concurrentMap.get(this.\u078a);
        Object object2 = \u07832;
        if (\u07832 == null) {
            object = n2 == 15 ? new \u0786(this.\u078a) : new \u058f(n2, (Calendar)object, this.\u078a);
            \u07832 = concurrentMap.putIfAbsent(this.\u078a, (\u0783)object);
            object2 = object;
            if (\u07832 != null) {
                return \u07832;
            }
        }
        return object2;
    }

    /*
     * Exception decompiling
     */
    private \u0783 \u0780(char var1_1, int var2_2, Calendar var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CASE]], but top level block is 20[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void \u0781(Calendar object) {
        this.\u078d = new ArrayList<\u0784>();
        object = new \u0785(this, (Calendar)object);
        \u0784 \u07842;
        while ((\u07842 = ((\u0785)object).\u037f()) != null) {
            this.\u078d.add(\u07842);
        }
        return;
    }

    private static boolean \u0782(char c2) {
        boolean bl = c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z';
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private static StringBuilder \u0787(StringBuilder var0, String var1_1) {
        for (var3_2 = 0; var3_2 < var1_1.length(); ++var3_2) {
            var2_3 = var1_1.charAt(var3_2);
            if (var2_3 == '$' || var2_3 == '.' || var2_3 == '?' || var2_3 == '^' || var2_3 == '[' || var2_3 == '\\' || var2_3 == '{' || var2_3 == '|') ** GOTO lbl-1000
            switch (var2_3) {
                default: {
                    break;
                }
                case '(': 
                case ')': 
                case '*': 
                case '+': lbl-1000:
                // 2 sources

                {
                    var0.append('\\');
                }
            }
            var0.append(var2_3);
        }
        if (var0.charAt(var0.length() - 1) == '.') {
            var0.append('?');
        }
        return var0;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof \u0773;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (\u0773)object;
        bl = bl2;
        if (this.\u0788.equals(((\u0773)object).\u0788)) {
            bl = bl2;
            if (this.\u0789.equals(((\u0773)object).\u0789)) {
                bl = bl2;
                if (this.\u078a.equals(((\u0773)object).\u078a)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public int hashCode() {
        return this.\u0788.hashCode() + (this.\u0789.hashCode() + this.\u078a.hashCode() * 13) * 13;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("3C33220230160E37011706041F200A"));
        stringBuilder.append(this.\u0788);
        String string = SOY.d("5672");
        stringBuilder.append(string);
        stringBuilder.append(this.\u078a);
        stringBuilder.append(string);
        stringBuilder.append(this.\u0789.getID());
        stringBuilder.append(SOY.d("27"));
        return stringBuilder.toString();
    }

    public Date \u0783(String string) {
        ParsePosition parsePosition = new ParsePosition(0);
        Comparable<Date> comparable = this.\u0784(string, parsePosition);
        if (comparable == null) {
            if (this.\u078a.equals(\u037f)) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append(SOY.d("5206391354"));
                ((StringBuilder)comparable).append(this.\u078a);
                ((StringBuilder)comparable).append(SOY.d("5A3E3E15151B1F72351911045A3C3E0254040F22211906035A36300211045A3034101B051F72604E424F5A13155F7E221422300407121B303D1354131B26344C5455"));
                ((StringBuilder)comparable).append(string);
                throw new ParseException(((StringBuilder)comparable).toString(), parsePosition.getErrorIndex());
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(SOY.d("2F3C211706041F33331A11571E3325134E57"));
            ((StringBuilder)comparable).append(string);
            throw new ParseException(((StringBuilder)comparable).toString(), parsePosition.getErrorIndex());
        }
        return comparable;
    }

    public Date \u0784(String object, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.\u0789, this.\u078a);
        calendar.clear();
        object = this.\u0785((String)object, parsePosition, calendar) ? calendar.getTime() : null;
        return object;
    }

    public boolean \u0785(String string, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<\u0784> listIterator = this.\u078d.listIterator();
        while (listIterator.hasNext()) {
            \u0784 \u07842 = listIterator.next();
            int n2 = \u07842.\u037f(listIterator);
            if (\u07842.\u037f.\u0528(this, calendar, string, parsePosition, n2)) continue;
            return false;
        }
        return true;
    }

    public Object \u0786(String string, ParsePosition parsePosition) {
        return this.\u0784(string, parsePosition);
    }

    private static class \u058f
    extends \u0782 {
        private final int \u0528;
        final Locale \u0529;
        private final Map<String, Integer> \u052a;

        \u058f(int n2, Calendar calendar, Locale locale) {
            this.\u0528 = n2;
            this.\u0529 = \u02e1.\u037f(locale);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("527A6E1F015E"));
            this.\u052a = \u0773.\u052f(calendar, locale, n2, stringBuilder);
            stringBuilder.setLength(stringBuilder.length() - 1);
            stringBuilder.append(SOY.d("53"));
            this.\u052a(stringBuilder);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("393322133D1909373F051D0313243422110F0E01250415031F3528562F1113373D1249"));
            stringBuilder.append(this.\u0528);
            stringBuilder.append(SOY.d("56723D19171616376C"));
            stringBuilder.append(this.\u0529);
            stringBuilder.append(SOY.d("56723D3D110E2C333D03110447"));
            stringBuilder.append(this.\u052a);
            stringBuilder.append(SOY.d("5672211700031F203F4B"));
            stringBuilder.append(this.\u037f);
            stringBuilder.append(SOY.d("27"));
            return stringBuilder.toString();
        }

        @Override
        void \u052b(\u0773 object, Calendar calendar, String map) {
            String string = ((String)((Object)map)).toLowerCase(this.\u0529);
            map = this.\u052a.get(string);
            object = map;
            if (map == null) {
                map = this.\u052a;
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append('.');
                object = map.get(((StringBuilder)object).toString());
            }
            calendar.set(this.\u0528, (Integer)object);
        }
    }

    private static class \u0620
    extends \u0783 {
        private final String \u037f;

        \u0620(String string) {
            this.\u037f = string;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("393D210F250215263412270308332513130E5A093719061A1B26171F111B1E6F"));
            stringBuilder.append(this.\u037f);
            stringBuilder.append(SOY.d("27"));
            return stringBuilder.toString();
        }

        @Override
        boolean \u037f() {
            return false;
        }

        @Override
        boolean \u0528(\u0773 \u07732, Calendar calendar, String string, ParsePosition parsePosition, int n2) {
            for (n2 = 0; n2 < this.\u037f.length(); ++n2) {
                int n3 = parsePosition.getIndex() + n2;
                if (n3 == string.length()) {
                    parsePosition.setErrorIndex(n3);
                    return false;
                }
                if (this.\u037f.charAt(n2) == string.charAt(n3)) continue;
                parsePosition.setErrorIndex(n3);
                return false;
            }
            parsePosition.setIndex(this.\u037f.length() + parsePosition.getIndex());
            return true;
        }
    }

    private static class \u0780
    extends \u0782 {
        private static final \u0783 \u0528 = new \u0780(SOY.d("52082D5E4B4D21797C2B281301602C5F5D"));
        private static final \u0783 \u0529 = new \u0780(SOY.d("52082D5E4B4D21797C2B281301602C2A100C482F785F"));
        private static final \u0783 \u052a = new \u0780(SOY.d("52082D5E4B4D21797C2B281301602C5E4B4D407B0D120F45077B78"));

        \u0780(String string) {
            this.\u0529(string);
        }

        static /* synthetic */ \u0783 \u052c() {
            return \u052a;
        }

        static \u0783 \u052d(int n2) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        return \u052a;
                    }
                    throw new IllegalArgumentException(SOY.d("133C2717181E1E723F0319151F207119125722"));
                }
                return \u0529;
            }
            return \u0528;
        }

        @Override
        void \u052b(\u0773 \u07732, Calendar calendar, String string) {
            calendar.setTimeZone(\u02ce.\u0528(string));
        }
    }

    private static class \u0781
    extends \u0783 {
        private final int \u037f;

        \u0781(int n2) {
            this.\u037f = n2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("34273C1411052926231700121D2B712D121E1F3E354B"));
            stringBuilder.append(this.\u037f);
            stringBuilder.append(SOY.d("27"));
            return stringBuilder.toString();
        }

        @Override
        boolean \u037f() {
            return true;
        }

        @Override
        boolean \u0528(\u0773 \u07732, Calendar calendar, String string, ParsePosition parsePosition, int n2) {
            int n3;
            int n4 = parsePosition.getIndex();
            int n5 = string.length();
            if (n2 == 0) {
                for (n2 = n4; n2 < n5 && Character.isWhitespace(string.charAt(n2)); ++n2) {
                }
                parsePosition.setIndex(n2);
                n3 = n5;
            } else {
                int n6 = n2 + n4;
                n2 = n4;
                n3 = n5;
                if (n5 > n6) {
                    n3 = n6;
                    n2 = n4;
                }
            }
            while (n2 < n3 && Character.isDigit(string.charAt(n2))) {
                ++n2;
            }
            if (parsePosition.getIndex() == n2) {
                parsePosition.setErrorIndex(n2);
                return false;
            }
            n4 = Integer.parseInt(string.substring(parsePosition.getIndex(), n2));
            parsePosition.setIndex(n2);
            calendar.set(this.\u037f, this.\u0529(\u07732, n4));
            return true;
        }

        int \u0529(\u0773 \u07732, int n2) {
            return n2;
        }
    }

    private static abstract class \u0782
    extends \u0783 {
        Pattern \u037f;

        private \u0782() {
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(SOY.d("5A09211700031F203F4B"));
            stringBuilder.append(this.\u037f);
            stringBuilder.append(SOY.d("27"));
            return stringBuilder.toString();
        }

        @Override
        boolean \u037f() {
            return false;
        }

        @Override
        boolean \u0528(\u0773 \u07732, Calendar calendar, String object, ParsePosition parsePosition, int n2) {
            if (!((Matcher)(object = this.\u037f.matcher(((String)object).substring(parsePosition.getIndex())))).lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + ((Matcher)object).end(1));
            this.\u052b(\u07732, calendar, ((Matcher)object).group(1));
            return true;
        }

        void \u0529(String string) {
            this.\u037f = Pattern.compile(string);
        }

        void \u052a(StringBuilder stringBuilder) {
            this.\u0529(stringBuilder.toString());
        }

        abstract void \u052b(\u0773 var1, Calendar var2, String var3);
    }

    private static abstract class \u0783 {
        private \u0783() {
        }

        boolean \u037f() {
            return false;
        }

        abstract boolean \u0528(\u0773 var1, Calendar var2, String var3, ParsePosition var4, int var5);
    }

    private static class \u0784 {
        final \u0783 \u037f;
        final int \u0528;

        \u0784(\u0783 \u07832, int n2) {
            this.\u037f = \u07832;
            this.\u0528 = n2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("2926231700121D2B101810201336251E542C0926231700121D2B6C"));
            stringBuilder.append(this.\u037f);
            stringBuilder.append(SOY.d("5672261F1003126F"));
            stringBuilder.append(this.\u0528);
            stringBuilder.append(SOY.d("27"));
            return stringBuilder.toString();
        }

        int \u037f(ListIterator<\u0784> listIterator) {
            int n2;
            boolean bl = this.\u037f.\u037f();
            int n3 = n2 = 0;
            if (bl) {
                if (!listIterator.hasNext()) {
                    n3 = n2;
                } else {
                    \u0783 \u07832 = listIterator.next().\u037f;
                    listIterator.previous();
                    n3 = n2;
                    if (\u07832.\u037f()) {
                        n3 = this.\u0528;
                    }
                }
            }
            return n3;
        }
    }

    private class \u0785 {
        private final Calendar \u037f;
        private int \u0528;
        final \u0773 \u0529;

        \u0785(\u0773 \u07732, Calendar calendar) {
            this.\u0529 = \u07732;
            this.\u037f = calendar;
        }

        private \u0784 \u0528(char c2) {
            int n2;
            int n3 = this.\u0528;
            do {
                this.\u0528 = n2 = this.\u0528 + 1;
            } while (n2 < this.\u0529.\u0788.length() && this.\u0529.\u0788.charAt(this.\u0528) == c2);
            n2 = this.\u0528 - n3;
            return new \u0784(this.\u0529.\u0780(c2, n2, this.\u037f), n2);
        }

        private \u0784 \u0529() {
            Object object = new StringBuilder();
            boolean bl = false;
            while (this.\u0528 < this.\u0529.\u0788.length()) {
                char c2 = this.\u0529.\u0788.charAt(this.\u0528);
                if (!bl && \u0773.\u0782(c2)) break;
                if (c2 == '\'') {
                    int n2;
                    this.\u0528 = n2 = this.\u0528 + 1;
                    if (n2 == this.\u0529.\u0788.length() || this.\u0529.\u0788.charAt(this.\u0528) != '\'') {
                        bl ^= true;
                        continue;
                    }
                }
                ++this.\u0528;
                ((StringBuilder)object).append(c2);
            }
            if (!bl) {
                object = ((StringBuilder)object).toString();
                return new \u0784(new \u0620((String)object), ((String)object).length());
            }
            object = new IllegalArgumentException(SOY.d("2F3C2513061A133C300211135A2324190012"));
            throw object;
        }

        \u0784 \u037f() {
            if (this.\u0528 >= this.\u0529.\u0788.length()) {
                return null;
            }
            char c2 = this.\u0529.\u0788.charAt(this.\u0528);
            if (\u0773.\u0782(c2)) {
                return this.\u0528(c2);
            }
            return this.\u0529();
        }
    }

    static class \u0786
    extends \u0782 {
        private final Locale \u0528;
        private final Map<String, \u037f> \u0529 = new HashMap<String, \u037f>();

        \u0786(Locale object3) {
            this.\u0528 = \u02e1.\u037f((Locale)object3);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("527A6E1F015E21797C2B281301662C0A333A2E097A5B292B1E29605A460A400E350D460A"));
            TreeSet<String> treeSet = new TreeSet<String>(\u0528);
            for (String[] stringArray : DateFormatSymbols.getInstance((Locale)object3).getZoneStrings()) {
                Object object = stringArray[0];
                if (((String)object).equalsIgnoreCase(SOY.d("3D1F05"))) continue;
                TimeZone timeZone = TimeZone.getTimeZone((String)object);
                \u037f \u03f3 = new \u037f(timeZone, false);
                object = \u03f3;
                for (int i2 = 1; i2 < stringArray.length; ++i2) {
                    String string;
                    if (i2 != 3) {
                        if (i2 == 5) {
                            object = \u03f3;
                        }
                    } else {
                        object = new \u037f(timeZone, true);
                    }
                    if (stringArray[i2] == null || !treeSet.add(string = stringArray[i2].toLowerCase((Locale)object3))) continue;
                    this.\u0529.put(string, (\u037f)object);
                }
            }
            for (String string : treeSet) {
                stringBuilder.append('|');
                \u0773.\u0787(stringBuilder, string);
            }
            stringBuilder.append(SOY.d("53"));
            this.\u052a(stringBuilder);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("2E3B3C132E181437020206160E37360F542C163D3217181247"));
            stringBuilder.append(this.\u0528);
            stringBuilder.append(SOY.d("5672250C3A161737224B"));
            stringBuilder.append(this.\u0529);
            stringBuilder.append(SOY.d("5672211700031F203F4B"));
            stringBuilder.append(this.\u037f);
            stringBuilder.append(SOY.d("27"));
            return stringBuilder.toString();
        }

        @Override
        void \u052b(\u0773 object, Calendar calendar, String object2) {
            object = \u02ce.\u0528((String)object2);
            if (object != null) {
                calendar.setTimeZone((TimeZone)object);
            } else {
                String string = ((String)object2).toLowerCase(this.\u0528);
                object = object2 = this.\u0529.get(string);
                if (object2 == null) {
                    object = this.\u0529;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(string);
                    ((StringBuilder)object2).append('.');
                    object = object.get(((StringBuilder)object2).toString());
                }
                calendar.set(16, ((\u037f)object).\u0528);
                calendar.set(15, ((\u037f)object).\u037f.getRawOffset());
            }
        }

        private static class \u037f {
            final TimeZone \u037f;
            final int \u0528;

            \u037f(TimeZone timeZone, boolean bl) {
                this.\u037f = timeZone;
                int n2 = bl ? timeZone.getDSTSavings() : 0;
                this.\u0528 = n2;
            }
        }
    }
}

