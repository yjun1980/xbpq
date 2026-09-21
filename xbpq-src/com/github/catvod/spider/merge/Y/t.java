/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.U.c;
import com.github.catvod.spider.merge.Y.d;
import com.github.catvod.spider.merge.Y.e;
import com.github.catvod.spider.merge.Y.f;
import com.github.catvod.spider.merge.Y.g;
import com.github.catvod.spider.merge.Y.h;
import com.github.catvod.spider.merge.Y.i;
import com.github.catvod.spider.merge.Y.j;
import com.github.catvod.spider.merge.Y.m;
import com.github.catvod.spider.merge.Y.o;
import com.github.catvod.spider.merge.Y.p;
import com.github.catvod.spider.merge.Y.q;
import com.github.catvod.spider.merge.Y.s;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;
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

public final class t
implements Serializable {
    private static final m A;
    static final Locale i;
    private static final Comparator<String> j;
    private static final ConcurrentMap<Locale, o>[] k;
    private static final e l;
    private static final f m;
    private static final m n;
    private static final m o;
    private static final m p;
    private static final m q;
    private static final m r;
    private static final g s;
    private static final m t;
    private static final m u;
    private static final h v;
    private static final i w;
    private static final m x;
    private static final m y;
    private static final m z;
    private final String c;
    private final TimeZone d;
    private final Locale e;
    private final int f;
    private final int g;
    private transient List<p> h;

    static {
        String string = cYh.d("0D31");
        String string2 = cYh.d("2D00");
        i = new Locale(string, string2, string2);
        j = com.github.catvod.spider.merge.Y.d.a();
        k = new ConcurrentMap[17];
        l = new e();
        m = new f();
        n = new m(1);
        o = new m(3);
        p = new m(4);
        q = new m(6);
        r = new m(5);
        s = new g();
        t = new m(8);
        u = new m(11);
        v = new h();
        w = new i();
        x = new m(10);
        y = new m(12);
        z = new m(13);
        A = new m(14);
    }

    protected t(String object, TimeZone object2, Locale locale) {
        int n2;
        int n3;
        this.c = object;
        this.d = object2;
        this.e = object = com.github.catvod.spider.merge.U.c.a(locale);
        object2 = Calendar.getInstance((TimeZone)object2, (Locale)object);
        if (((Locale)object).equals(i)) {
            n3 = 0;
        } else {
            ((Calendar)object2).setTime(new Date());
            n3 = ((Calendar)object2).get(1) - 80;
        }
        this.f = n2 = n3 / 100 * 100;
        this.g = n3 - n2;
        this.h = new ArrayList<p>();
        object = new q(this, (Calendar)object2);
        while ((object2 = ((q)object).a()) != null) {
            ((ArrayList)this.h).add((p)object2);
        }
        return;
    }

    static /* synthetic */ String a(t t2) {
        return t2.c;
    }

    /*
     * Exception decompiling
     */
    static o b(t var0, char var1_1, int var2_2, Calendar var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE], 8[CASE]], but top level block is 20[SWITCH]
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

    static Map c(Calendar object, Locale locale, int n2, StringBuilder stringBuilder) {
        HashMap hashMap = new HashMap();
        locale = com.github.catvod.spider.merge.U.c.a(locale);
        Map.Entry<String, Integer> entry2 = ((Calendar)object).getDisplayNames(n2, 0, locale);
        object = new TreeSet<String>(j);
        for (Map.Entry<String, Integer> entry2 : entry2.entrySet()) {
            String string = ((String)entry2.getKey()).toLowerCase(locale);
            if (!((TreeSet)object).add(string)) continue;
            hashMap.put(string, entry2.getValue());
        }
        object = ((TreeSet)object).iterator();
        while (object.hasNext()) {
            com.github.catvod.spider.merge.Y.t.j(stringBuilder, (String)object.next());
            stringBuilder.append('|');
        }
        return hashMap;
    }

    static int d(t t2, int n2) {
        int n3 = t2.f + n2;
        n2 = n2 >= t2.g ? n3 : n3 + 100;
        return n2;
    }

    static /* synthetic */ Comparator e() {
        return j;
    }

    static /* synthetic */ StringBuilder f(StringBuilder stringBuilder, String string) {
        com.github.catvod.spider.merge.Y.t.j(stringBuilder, string);
        return stringBuilder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private o g(int n2, Calendar object) {
        ConcurrentMap<Locale, o> concurrentMap;
        Object object2;
        Object object3 = k;
        synchronized (object3) {
            if (object3[n2] == null) {
                object2 = new ConcurrentHashMap(3);
                object3[n2] = object2;
            }
            concurrentMap = object3[n2];
        }
        object2 = (o)concurrentMap.get(this.e);
        object3 = object2;
        if (object2 == null) {
            object = n2 == 15 ? new s(this.e) : new j(n2, (Calendar)object, this.e);
            object2 = concurrentMap.putIfAbsent(this.e, (o)object);
            object3 = object;
            if (object2 != null) {
                return object2;
            }
        }
        return object3;
    }

    /*
     * Unable to fully structure code
     */
    private static StringBuilder j(StringBuilder var0, String var1_1) {
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

    public final boolean equals(Object object) {
        boolean bl = object instanceof t;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (t)object;
        bl = bl2;
        if (this.c.equals(((t)object).c)) {
            bl = bl2;
            if (this.d.equals(((t)object).d)) {
                bl = bl2;
                if (this.e.equals(((t)object).e)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public final Date h(String string) {
        ParsePosition parsePosition = new ParsePosition(0);
        Comparable<Date> comparable = this.i(string, parsePosition);
        if (comparable == null) {
            if (this.e.equals(i)) {
                comparable = com.github.catvod.spider.merge.d.d.b(cYh.d("4F04293477"));
                ((StringBuilder)comparable).append(this.e);
                ((StringBuilder)comparable).append(cYh.d("473C2E3236360270253E3229473E2E2577291220313E252E473420253229473224373828027070696162471105785D0F09202023243F06322D34773E0624246B7778"));
                ((StringBuilder)comparable).append(string);
                throw new ParseException(((StringBuilder)comparable).toString(), parsePosition.getErrorIndex());
            }
            throw new ParseException(com.github.catvod.spider.merge.b.n.a(cYh.d("323E313025290231233D327A033135346D7A"), string), parsePosition.getErrorIndex());
        }
        return comparable;
    }

    public final int hashCode() {
        int n2 = this.c.hashCode();
        int n3 = this.d.hashCode();
        return (this.e.hashCode() * 13 + n3) * 13 + n2;
    }

    public final Date i(String object, ParsePosition parsePosition) {
        int n2;
        Calendar calendar;
        block4: {
            block3: {
                int n3;
                p p2;
                calendar = Calendar.getInstance(this.d, this.e);
                calendar.clear();
                ListIterator listIterator = ((ArrayList)this.h).listIterator();
                do {
                    boolean bl = listIterator.hasNext();
                    n3 = 0;
                    if (!bl) break block3;
                    p2 = (p)listIterator.next();
                    if (p2.a.a() && listIterator.hasNext()) {
                        o o2 = ((p)listIterator.next()).a;
                        listIterator.previous();
                        if (o2.a()) {
                            n2 = p2.b;
                            continue;
                        }
                    }
                    n2 = 0;
                } while (p2.a.b(this, calendar, (String)object, parsePosition, n2));
                n2 = n3;
                break block4;
            }
            n2 = 1;
        }
        object = n2 != 0 ? calendar.getTime() : null;
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(cYh.d("21313225133B13351130252902221A"));
        stringBuilder.append(this.c);
        String string = cYh.d("4B70");
        stringBuilder.append(string);
        stringBuilder.append(this.e);
        stringBuilder.append(string);
        stringBuilder.append(this.d.getID());
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

