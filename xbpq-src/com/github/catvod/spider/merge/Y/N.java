/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.C;
import com.github.catvod.spider.merge.Y.I;
import com.github.catvod.spider.merge.Y.L;
import com.github.catvod.spider.merge.Y.x;
import com.github.catvod.spider.merge.Y.y;
import com.github.catvod.spider.merge.Y.z;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class N
implements Serializable {
    private static final z[] h = new z[0];
    private static final ConcurrentMap<C, String> i = new ConcurrentHashMap<C, String>(7);
    private final String c;
    private final TimeZone d;
    private final Locale e;
    private transient z[] f;
    private transient int g;

    /*
     * Exception decompiling
     */
    protected N(String var1_1, TimeZone var2_2, Locale var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE], 1[CASE]], but top level block is 21[SWITCH]
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

    static void a(Appendable appendable, int n2) {
        char c2 = (char)(n2 / 10 + 48);
        appendable = (StringBuilder)appendable;
        ((StringBuilder)appendable).append(c2);
        ((StringBuilder)appendable).append((char)(n2 % 10 + 48));
    }

    static void b(Appendable appendable, int n2, int n3) {
        block12: {
            block8: {
                char c2;
                block9: {
                    block10: {
                        block11: {
                            if (n2 >= 10000) break block8;
                            int n4 = n2 < 1000 ? (n2 < 100 ? (n2 < 10 ? 1 : 2) : 3) : 4;
                            n3 -= n4;
                            while (n3 > 0) {
                                ((StringBuilder)appendable).append('0');
                                --n3;
                            }
                            n3 = n2;
                            if (n4 == 1) break block9;
                            n3 = n2;
                            if (n4 == 2) break block10;
                            n3 = n2;
                            if (n4 == 3) break block11;
                            if (n4 != 4) break block12;
                            c2 = (char)(n2 / 1000 + 48);
                            ((StringBuilder)appendable).append(c2);
                            n3 = n2 % 1000;
                        }
                        if (n3 >= 100) {
                            c2 = (char)(n3 / 100 + 48);
                            ((StringBuilder)appendable).append(c2);
                            n3 %= 100;
                        } else {
                            ((StringBuilder)appendable).append('0');
                        }
                    }
                    if (n3 >= 10) {
                        c2 = (char)(n3 / 10 + 48);
                        ((StringBuilder)appendable).append(c2);
                        n3 %= 10;
                    } else {
                        ((StringBuilder)appendable).append('0');
                    }
                }
                c2 = (char)(n3 + 48);
                ((StringBuilder)appendable).append(c2);
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
                ((StringBuilder)appendable).append('0');
                --n5;
            }
            while (--n3 >= 0) {
                char c3 = cArray[n3];
                ((StringBuilder)appendable).append(c3);
            }
        }
    }

    private String c(Calendar calendar) {
        int n2;
        z[] zArray;
        StringBuilder stringBuilder = new StringBuilder(this.g);
        try {
            zArray = this.f;
            n2 = zArray.length;
        }
        catch (IOException iOException) {
            throw iOException;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            zArray[i2].c(stringBuilder, calendar);
            continue;
        }
        return stringBuilder.toString();
    }

    static String h(TimeZone object, boolean bl, int n2, Locale locale) {
        C c2 = new C((TimeZone)object, bl, n2, locale);
        ConcurrentMap<C, String> concurrentMap = i;
        String string = (String)((ConcurrentHashMap)concurrentMap).get(c2);
        Object object2 = string;
        if (string == null && (object = ((ConcurrentHashMap)concurrentMap).putIfAbsent(c2, (String)(object2 = ((TimeZone)object).getDisplayName(bl, n2, locale)))) != null) {
            object2 = object;
        }
        return object2;
    }

    final String d(Object object) {
        if (object instanceof Date) {
            object = (Date)object;
            Calendar calendar = Calendar.getInstance(this.d, this.e);
            calendar.setTime((Date)object);
            return this.c(calendar);
        }
        if (object instanceof Calendar) {
            z[] zArray = (z[])object;
            StringBuilder stringBuilder = new StringBuilder(this.g);
            object = zArray;
            if (!zArray.getTimeZone().equals(this.d)) {
                object = (Calendar)zArray.clone();
                ((Calendar)object).setTimeZone(this.d);
            }
            zArray = this.f;
            int n2 = zArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                zArray[i2].c(stringBuilder, (Calendar)object);
                continue;
            }
            return stringBuilder.toString();
        }
        if (object instanceof Long) {
            long l2 = (Long)object;
            object = Calendar.getInstance(this.d, this.e);
            ((Calendar)object).setTimeInMillis(l2);
            return this.c((Calendar)object);
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("323E2A3F382D0970223D3629146A61"));
        object = object == null ? cYh.d("5B3E343D3B64") : object.getClass().getName();
        stringBuilder.append((String)object);
        object = new IllegalArgumentException(stringBuilder.toString());
        throw object;
    }

    public final Locale e() {
        return this.e;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof N;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (N)object;
        bl = bl2;
        if (this.c.equals(((N)object).c)) {
            bl = bl2;
            if (this.d.equals(((N)object).d)) {
                bl = bl2;
                if (this.e.equals(((N)object).e)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public final String f() {
        return this.c;
    }

    public final TimeZone g() {
        return this.d;
    }

    public final int hashCode() {
        int n2 = this.c.hashCode();
        int n3 = this.d.hashCode();
        return (this.e.hashCode() * 13 + n3) * 13 + n2;
    }

    protected final x i(int n2, int n3) {
        if (n3 != 1) {
            if (n3 != 2) {
                return new y(n2, n3);
            }
            return new I(n2);
        }
        return new L(n2);
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("21313225133B133511233E341335330A"));
        stringBuilder.append(this.c);
        String string = cYh.d("4B");
        stringBuilder.append(string);
        stringBuilder.append(this.e);
        stringBuilder.append(string);
        stringBuilder.append(this.d.getID());
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

