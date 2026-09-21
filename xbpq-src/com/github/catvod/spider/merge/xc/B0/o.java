/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.d;
import com.github.catvod.spider.merge.xc.B0.e;
import com.github.catvod.spider.merge.xc.B0.f;
import com.github.catvod.spider.merge.xc.B0.i;
import com.github.catvod.spider.merge.xc.B0.k;
import com.github.catvod.spider.merge.xc.B0.l;
import com.github.catvod.spider.merge.xc.B0.n;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class o
implements Serializable {
    public static final Locale g = new Locale("ja", "JP", "JP");
    public static final Comparator h = com.github.catvod.spider.merge.xc.B0.d.l();
    public static final ConcurrentMap[] i = new ConcurrentMap[17];
    public static final e j = new e(0);
    public static final e k = new e(1);
    public static final i l = new i(1);
    public static final i m = new i(3);
    public static final i n = new i(4);
    public static final i o = new i(6);
    public static final i p = new i(5);
    public static final e q = new e(2);
    public static final i r = new i(8);
    public static final i s = new i(11);
    public static final e t = new e(3);
    public static final e u = new e(4);
    public static final i v = new i(10);
    public static final i w = new i(12);
    public static final i x = new i(13);
    public static final i y = new i(14);
    public final String a;
    public final TimeZone b;
    public final Locale c;
    public final int d;
    public final int e;
    public final transient ArrayList f;

    /*
     * Exception decompiling
     */
    public o(String var1_1, TimeZone var2_2, Locale var3_3) {
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

    /*
     * Unable to fully structure code
     */
    public static void c(StringBuilder var0, String var1_1) {
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
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final k a(int n2, Calendar object) {
        Object object2;
        Object object3 = i;
        // MONITORENTER : object3
        if (object3[n2] == null) {
            object2 = new ConcurrentHashMap(3);
            object3[n2] = object2;
        }
        ConcurrentMap concurrentMap = object3[n2];
        object2 = (k)concurrentMap.get(this.c);
        object3 = object2;
        if (object2 != null) return object3;
        object = n2 == 15 ? new n(this.c) : new f(n2, (Calendar)object, this.c);
        object2 = (k)concurrentMap.putIfAbsent(this.c, object);
        object3 = object;
        if (object2 == null) return object3;
        return object2;
    }

    public final boolean b(String string, ParsePosition parsePosition, Calendar calendar) {
        ListIterator listIterator = this.f.listIterator();
        while (listIterator.hasNext()) {
            int n2;
            l l2 = (l)listIterator.next();
            if (l2.a.a() && listIterator.hasNext()) {
                k k2 = ((l)listIterator.next()).a;
                listIterator.previous();
                n2 = k2.a() ? l2.b : 0;
            } else {
                n2 = 0;
            }
            if (l2.a.b(this, calendar, string, parsePosition, n2)) continue;
            return false;
        }
        return true;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof o;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (o)object;
        String string = ((o)object).a;
        bl = bl2;
        if (this.a.equals(string)) {
            bl = bl2;
            if (this.b.equals(((o)object).b)) {
                bl = bl2;
                if (this.c.equals(((o)object).c)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        return (this.c.hashCode() * 13 + n3) * 13 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FastDateParser[");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(", ");
        stringBuilder.append(this.b.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

