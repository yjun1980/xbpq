/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.B.a;
import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.d;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.B.f;
import com.github.catvod.spider.merge.B.i;
import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.B.k;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.C.l;
import com.github.catvod.spider.merge.C.m;
import com.github.catvod.spider.merge.C.n;
import com.github.catvod.spider.merge.C.q;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.C.x;
import com.github.catvod.spider.merge.C.z;
import com.github.catvod.spider.merge.D.G;
import com.github.catvod.spider.merge.D.S;
import com.github.catvod.spider.merge.D.e0;
import com.github.catvod.spider.merge.D.j0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.O;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
implements Closeable {
    private static final Set<Class<?>> p;
    public final Object a;
    public final p b;
    protected o c;
    private String d = com.github.catvod.spider.merge.y.a.e;
    private SimpleDateFormat e;
    public final d f;
    protected k g;
    private k[] h;
    private int i = 0;
    private List<a> j;
    public int k = 0;
    private List<m> l = null;
    private List<l> m = null;
    protected com.github.catvod.spider.merge.C.o n = null;
    private int o = 0;

    static {
        HashSet hashSet = new HashSet();
        p = hashSet;
        hashSet.addAll(Arrays.asList(Boolean.TYPE, Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, String.class));
    }

    /*
     * Enabled aggressive block sorting
     */
    public b(Object object, d d2, o o2) {
        this.f = d2;
        this.a = object;
        this.c = o2;
        this.b = o2.e;
        object = (f)d2;
        int n2 = ((f)object).d;
        if (n2 == 123) {
            ((i)d2).next();
            object = (f)d2;
            n2 = 12;
        } else {
            if (n2 != 91) {
                ((f)object).nextToken();
                return;
            }
            ((i)d2).next();
            object = (f)d2;
            n2 = 14;
        }
        ((f)object).a = n2;
    }

    public b(String string, o o2, int n2) {
        this((Object)string, new i(string, n2), o2);
    }

    public final k A(Object object, Object object2) {
        if (this.f.l(com.github.catvod.spider.merge.B.c.k)) {
            return null;
        }
        return this.z(this.g, object, object2);
    }

    public final void B(k k2) {
        if (this.f.l(com.github.catvod.spider.merge.B.c.k)) {
            return;
        }
        this.g = k2;
    }

    public final void C(String string) {
        this.d = string;
        this.e = null;
    }

    public final void D(int n2) {
        this.k = n2;
    }

    public final void a(int n2) {
        d d2 = this.f;
        if (d2.p() == n2) {
            d2.nextToken();
            return;
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("syntax error, expect ");
        stringBuilder.append(com.github.catvod.spider.merge.B.j.f(n2));
        stringBuilder.append(", actual ");
        stringBuilder.append(com.github.catvod.spider.merge.B.j.f(d2.p()));
        throw new com.github.catvod.spider.merge.y.d(stringBuilder.toString());
    }

    public final void b(a a2) {
        if (this.j == null) {
            this.j = new ArrayList<a>(2);
        }
        ((ArrayList)this.j).add(a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(Collection object) {
        if (this.k != 1) return;
        if (object instanceof List) {
            int n2 = object.size();
            List list = (List)object;
            object = this.j();
            ((a)object).c = new z(this, list, n2 - 1);
            ((a)object).d = this.g;
        } else {
            a a2 = this.j();
            a2.c = new z((Collection)object);
            a2.d = this.g;
        }
        this.k = 0;
    }

    @Override
    public final void close() {
        d d2 = this.f;
        try {
            if (d2.l(com.github.catvod.spider.merge.B.c.b)) {
                if (d2.p() == 20) {
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("not close json text, token : ");
                    stringBuilder.append(com.github.catvod.spider.merge.B.j.f(d2.p()));
                    com.github.catvod.spider.merge.y.d d3 = new com.github.catvod.spider.merge.y.d(stringBuilder.toString());
                    throw d3;
                }
            }
            return;
        }
        finally {
            d2.close();
        }
    }

    public final void d(Map object, Object object2) {
        if (this.k == 1) {
            object2 = new z((Map)object, object2);
            object = this.j();
            ((a)object).c = object2;
            ((a)object).d = this.g;
            this.k = 0;
        }
    }

    public final o e() {
        return this.c;
    }

    public final k f() {
        return this.g;
    }

    public final String g() {
        return this.d;
    }

    public final DateFormat h() {
        if (this.e == null) {
            SimpleDateFormat simpleDateFormat;
            this.e = simpleDateFormat = new SimpleDateFormat(this.d, this.f.G());
            simpleDateFormat.setTimeZone(this.f.M());
        }
        return this.e;
    }

    public final com.github.catvod.spider.merge.C.o i() {
        return this.n;
    }

    public final a j() {
        List<a> list = this.j;
        return (a)((ArrayList)list).get(((ArrayList)list).size() - 1);
    }

    public final void k(Object object) {
        List<a> list = this.j;
        if (list == null) {
            return;
        }
        int n2 = ((ArrayList)list).size();
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2;
            Object object3;
            Object object4 = (a)((ArrayList)this.j).get(i2);
            Object object5 = ((a)object4).b;
            Object object6 = ((a)object4).d;
            list = null;
            object6 = object6 != null ? ((k)object6).a : null;
            if (((String)object5).startsWith("$")) {
                int n3 = 0;
                while (true) {
                    object3 = list;
                    if (n3 >= this.i) break;
                    if (((String)object5).equals(this.h[n3].toString())) {
                        object3 = this.h[n3].a;
                        break;
                    }
                    ++n3;
                }
                list = object3;
                if (object3 == null) {
                    object2 = new N((String)object5, e0.i, this.c);
                    list = object3;
                    try {
                        if (((N)object2).o()) {
                            list = ((N)object2).f(object);
                        }
                    }
                    catch (O o2) {
                        list = object3;
                    }
                }
            } else {
                list = ((a)object4).a.a;
            }
            if ((object2 = ((a)object4).c) == null) continue;
            object3 = list;
            if (list != null) {
                object3 = list;
                if (list.getClass() == com.github.catvod.spider.merge.y.e.class) {
                    Object object7 = ((n)object2).a;
                    object3 = list;
                    if (object7 != null) {
                        object3 = list;
                        if (!Map.class.isAssignableFrom(((com.github.catvod.spider.merge.H.e)object7).e)) {
                            object7 = this.h[0].a;
                            object5 = N.c((String)object5);
                            object3 = list;
                            if (((N)object5).o()) {
                                object3 = ((N)object5).f(object7);
                            }
                        }
                    }
                }
            }
            list = object6;
            if (((n)object2).c() != null) {
                list = object6;
                if (!((n)object2).c().isInstance(object6)) {
                    object4 = ((a)object4).d.b;
                    list = object6;
                    if (object4 != null) {
                        while (true) {
                            list = object6;
                            if (object4 == null) break;
                            if (((n)object2).c().isInstance(((k)object4).a)) {
                                list = ((k)object4).a;
                                break;
                            }
                            object4 = ((k)object4).b;
                        }
                    }
                }
            }
            ((n)object2).e(list, object3);
        }
    }

    public final boolean l(c c2) {
        return this.f.l(c2);
    }

    public final Object m() {
        return this.o(null);
    }

    /*
     * Unable to fully structure code
     */
    public final Object n(x var1_1, Object var2_3) {
        block33: {
            var4_4 = this.f.p();
            var5_5 = 0;
            if (var4_4 != 12) {
                var1_1 = com.github.catvod.spider.merge.C.a.c("syntax error, expect {, actual ");
                var1_1.append(this.f.y());
                var1_1 = var7_6 = var1_1.toString();
                if (var2_3 instanceof String) {
                    var1_1 = com.github.catvod.spider.merge.A.c.a(com.github.catvod.spider.merge.B.e.c((String)var7_6, ", fieldName "), var2_3);
                }
                var1_1 = com.github.catvod.spider.merge.C.a.c(com.github.catvod.spider.merge.B.e.c((String)var1_1, ", "));
                var1_1.append(this.f.f());
                var1_1 = var1_1.toString();
                var7_6 = new com.github.catvod.spider.merge.y.b();
                this.q((Collection)var7_6, var2_3);
                if (var7_6.size() == 1 && (var2_3 = var7_6.get(0)) instanceof com.github.catvod.spider.merge.y.e) {
                    return (com.github.catvod.spider.merge.y.e)var2_3;
                }
                throw new com.github.catvod.spider.merge.y.d((String)var1_1);
            }
            var9_8 = this.g;
            while (true) {
                block36: {
                    block34: {
                        block35: {
                            block32: {
                                block31: {
                                    this.f.d();
                                    var6_10 = var4_4 = (int)this.f.F();
                                    if (!this.f.l(com.github.catvod.spider.merge.B.c.g)) break block31;
                                    while (true) {
                                        var6_10 = var4_4;
                                        if (var4_4 != 44) break;
                                        this.f.next();
                                        this.f.d();
                                        var4_4 = this.f.F();
                                        continue;
                                        break;
                                    }
                                }
                                if (var6_10 == 34) {
                                    var7_7 = this.f.I(this.b, '\"');
                                    this.f.d();
                                    if (this.f.F() != ':') {
                                        var2_3 = new StringBuilder();
                                        var2_3.append("expect ':' at ");
                                        var2_3.append(this.f.b());
                                        var1_1 = new com.github.catvod.spider.merge.y.d(var2_3.toString());
                                        throw var1_1;
                                    }
                                    break block32;
                                }
                                if (var6_10 == 125) {
                                    this.f.next();
                                    this.f.e();
                                    this.f.o(16);
                                    return var1_1;
                                }
                                if (var6_10 != 39) ** GOTO lbl72
                                if (this.f.l(com.github.catvod.spider.merge.B.c.d)) {
                                    var7_7 = this.f.I(this.b, '\'');
                                    this.f.d();
                                    if (this.f.F() != ':') {
                                        var2_3 = new StringBuilder();
                                        var2_3.append("expect ':' at ");
                                        var2_3.append(this.f.b());
                                        var1_1 = new com.github.catvod.spider.merge.y.d(var2_3.toString());
                                        throw var1_1;
                                    }
                                    break block32;
                                }
                                var1_1 = new com.github.catvod.spider.merge.y.d("syntax error");
                                throw var1_1;
lbl72:
                                // 1 sources

                                if (this.f.l(com.github.catvod.spider.merge.B.c.c)) {
                                    var7_7 = this.f.E(this.b);
                                    this.f.d();
                                    var3_9 = this.f.F();
                                    if (var3_9 != ':') break block33;
                                }
                                ** GOTO lbl151
                            }
                            this.f.next();
                            this.f.d();
                            this.f.F();
                            this.f.e();
                            var10_12 = com.github.catvod.spider.merge.y.a.c;
                            var8_11 = null;
                            if (var7_7 != var10_12) break block34;
                            if (this.f.l(com.github.catvod.spider.merge.B.c.o)) break block34;
                            var7_7 = this.f.I(this.b, '\"');
                            if (!Map.class.isAssignableFrom((Class<?>)(var7_7 = this.c.b((String)var7_7, null, this.f.w())))) break block35;
                            this.f.o(16);
                            if (this.f.p() == 13) {
                                this.f.o(16);
                                this.B(var9_8);
                                return var1_1;
                            }
                            break block36;
                        }
                        var1_1 = this.c.f((Type)var7_7);
                        this.f.o(16);
                        this.k = 2;
                        if (var9_8 == null) ** GOTO lbl108
                        if (!(var2_3 instanceof Integer)) {
                            this.x();
                        }
lbl108:
                        // 4 sources

                        var1_1 = (Map)var1_1.c(this, (Type)var7_7, var2_3);
                        this.B(var9_8);
                        return var1_1;
                    }
                    this.f.nextToken();
                    if (var5_5 == 0) ** GOTO lbl117
                    this.B(var9_8);
lbl117:
                    // 2 sources

                    var10_12 = var1_1.getType();
                    if (this.f.p() == 8) {
                        this.f.nextToken();
                    } else {
                        var8_11 = this.t((Type)var10_12, var7_7);
                    }
                    var1_1.a();
                    this.z(var9_8, var8_11, var7_7);
                    this.B(var9_8);
                    var4_4 = this.f.p();
                    if (var4_4 == 20 || var4_4 == 15) break;
                    if (var4_4 != 13) break block36;
                    this.f.nextToken();
                    this.B(var9_8);
                    return var1_1;
                }
                ++var5_5;
            }
            this.B(var9_8);
            return var1_1;
        }
        try {
            var1_1 = new StringBuilder();
            var1_1.append("expect ':' at ");
            var1_1.append(this.f.b());
            var1_1.append(", actual ");
            var1_1.append(var3_9);
            var2_3 = new com.github.catvod.spider.merge.y.d(var1_1.toString());
            throw var2_3;
lbl151:
            // 1 sources

            var1_1 = new com.github.catvod.spider.merge.y.d("syntax error");
            throw var1_1;
        }
        catch (Throwable var1_2) {
            throw var1_2;
        }
        finally {
            this.B(var9_8);
        }
    }

    /*
     * Exception decompiling
     */
    public final Object o(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[CASE]], but top level block is 7[SWITCH]
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
    public final void p(Type var1_1, Collection var2_3, Object var3_4) {
        block21: {
            block22: {
                block20: {
                    block19: {
                        var5_5 = this.f.p();
                        if (var5_5 == 21) break block19;
                        var4_6 = var5_5;
                        if (var5_5 != 22) break block20;
                    }
                    this.f.nextToken();
                    var4_6 = this.f.p();
                }
                if (var4_6 != 14) break block21;
                if (Integer.TYPE != var1_1) break block22;
                var6_7 = G.a;
                var7_8 = this.f;
                var4_6 = 2;
                ** GOTO lbl23
            }
            if (String.class == var1_1) {
                var6_7 = j0.a;
                this.f.o(4);
            } else {
                var6_7 = this.c.f((Type)var1_1);
                var7_8 = this.f;
                var4_6 = var6_7.e();
lbl23:
                // 2 sources

                var7_8.o(var4_6);
            }
            var8_9 = this.g;
            this.A(var2_3, var3_4);
            var4_6 = 0;
            while (true) {
                if (this.f.l(com.github.catvod.spider.merge.B.c.g)) {
                    while (this.f.p() == 16) {
                        this.f.nextToken();
                    }
                }
                if ((var5_5 = this.f.p()) != 15) ** break block16
                this.B(var8_9);
                this.f.o(16);
                return;
                break;
            }
            catch (Throwable var1_2) {
                this.B(var8_9);
                throw var1_2;
            }
            {
                block18: {
                    block23: {
                        block17: {
                            var9_10 = Integer.TYPE;
                            var7_8 = null;
                            var3_4 = null;
                            if (var9_10 != var1_1) break block17;
                            var2_3.add(G.a.c(this, null, null));
                            ** GOTO lbl76
                        }
                        if (String.class != var1_1) ** GOTO lbl66
                        if (this.f.p() != 4) break block23;
                        var3_4 = this.f.K();
                        this.f.o(16);
                        ** GOTO lbl63
                    }
                    var7_8 = this.o(null);
                    if (var7_8 == null) ** GOTO lbl63
                    var3_4 = var7_8.toString();
lbl63:
                    // 3 sources

                    var2_3.add(var3_4);
                    ** GOTO lbl76
lbl66:
                    // 1 sources

                    if (this.f.p() != 8) break block18;
                    this.f.nextToken();
                    var3_4 = var7_8;
                    ** GOTO lbl73
                }
                var3_4 = var6_7.c(this, (Type)var1_1, var4_6);
lbl73:
                // 2 sources

                var2_3.add(var3_4);
                this.c(var2_3);
lbl76:
                // 3 sources

                if (this.f.p() == 16) {
                    this.f.o(var6_7.e());
                }
                ++var4_6;
                continue;
            }
        }
        var1_1 = new StringBuilder();
        var1_1.append("field ");
        var1_1.append(var3_4);
        var1_1.append(" expect '[', but ");
        var1_1.append(com.github.catvod.spider.merge.B.j.f(var4_6));
        var1_1.append(", ");
        var1_1.append(this.f.f());
        throw new com.github.catvod.spider.merge.y.d(var1_1.toString());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(Collection var1_1, Object var2_4) {
        var7_5 = this.f;
        if (var7_5.p() == 21 || var7_5.p() == 22) {
            var7_5.nextToken();
        }
        if (var7_5.p() != 14) {
            var1_1 = com.github.catvod.spider.merge.C.a.c("syntax error, expect [, actual ");
            var1_1.append(com.github.catvod.spider.merge.B.j.f(var7_5.p()));
            var1_1.append(", pos ");
            var1_1.append(var7_5.b());
            var1_1.append(", fieldName ");
            var1_1.append(var2_4 /* !! */ );
            throw new com.github.catvod.spider.merge.y.d(var1_1.toString());
        }
        var7_5.o(4);
        var6_6 = this.g;
        if (var6_6 != null && var6_6.d > 512) {
            throw new com.github.catvod.spider.merge.y.d("array level > 512");
        }
        this.A(var1_1, var2_4 /* !! */ );
        var3_7 = 0;
        while (true) {
            block15: {
                if (var7_5.l(com.github.catvod.spider.merge.B.c.g)) {
                    while (var7_5.p() == 16) {
                        var7_5.nextToken();
                    }
                }
                var4_8 = var7_5.p();
                var2_4 /* !! */  = null;
                if (var4_8 == 2) ** GOTO lbl84
                if (var4_8 == 3) ** GOTO lbl82
                if (var4_8 == 4) ** GOTO lbl72
                if (var4_8 == 6) ** GOTO lbl70
                if (var4_8 == 7) ** GOTO lbl68
                if (var4_8 == 8) ** GOTO lbl66
                if (var4_8 == 12) ** GOTO lbl63
                if (var4_8 == 20) ** GOTO lbl61
                if (var4_8 == 23) ** GOTO lbl66
                if (var4_8 == 14) ** GOTO lbl-1000
                if (var4_8 == 15) break block15;
                var2_4 /* !! */  = this.o(null);
                ** GOTO lbl87
            }
            var7_5.o(16);
            {
                catch (Throwable var1_2) {
                    break;
                }
                catch (ClassCastException var1_3) {}
                {
                    var2_4 /* !! */  = new com.github.catvod.spider.merge.y.d("unkown error", var1_3);
                    throw var2_4 /* !! */ ;
                }
            }
            this.B(var6_6);
            return;
lbl-1000:
            // 1 sources

            {
                block16: {
                    block17: {
                        var5_9 = new com.github.catvod.spider.merge.y.b();
                        this.q((Collection)var5_9, var3_7);
                        var2_4 /* !! */  = var5_9;
                        if (var7_5.l(com.github.catvod.spider.merge.B.c.p)) {
                            var2_4 /* !! */  = var5_9.toArray();
                        }
                        break block16;
lbl61:
                        // 1 sources

                        var1_1 = new com.github.catvod.spider.merge.y.d("unclosed jsonArray");
                        throw var1_1;
lbl63:
                        // 1 sources

                        var2_4 /* !! */  = new com.github.catvod.spider.merge.y.e(var7_5.l(com.github.catvod.spider.merge.B.c.n));
                        var2_4 /* !! */  = this.v((Map)var2_4 /* !! */ , var3_7);
                        break block16;
lbl66:
                        // 2 sources

                        var7_5.o(4);
                        break block16;
lbl68:
                        // 1 sources

                        var2_4 /* !! */  = Boolean.FALSE;
                        break block17;
lbl70:
                        // 1 sources

                        var2_4 /* !! */  = Boolean.TRUE;
                        break block17;
lbl72:
                        // 1 sources

                        var5_9 = var7_5.K();
                        var7_5.o(16);
                        var2_4 /* !! */  = var5_9;
                        if (var7_5.l(com.github.catvod.spider.merge.B.c.f)) {
                            var8_10 = new i((String)var5_9);
                            var2_4 /* !! */  = var5_9;
                            if (var8_10.x0(true)) {
                                var2_4 /* !! */  = var8_10.j.getTime();
                            }
                            var8_10.close();
                        }
                        break block16;
lbl82:
                        // 1 sources

                        var2_4 /* !! */  = var7_5.l(com.github.catvod.spider.merge.B.c.h) ? var7_5.z(true) : var7_5.z(false);
                        break block17;
lbl84:
                        // 1 sources

                        var2_4 /* !! */  = var7_5.i();
                    }
                    var7_5.o(16);
                }
                var1_1.add(var2_4 /* !! */ );
                this.c((Collection)var1_1);
                if (var7_5.p() == 16) {
                    var7_5.o(4);
                }
                ++var3_7;
                continue;
            }
            break;
        }
        this.B(var6_6);
        throw var1_2;
    }

    public final void r(Object list, String object) {
        this.f.q();
        object = this.l;
        if (object != null) {
            Iterator iterator = ((ArrayList)object).iterator();
            object = null;
            while (iterator.hasNext()) {
                object = ((m)iterator.next()).a();
            }
        } else {
            object = null;
        }
        if (object == null) {
            this.o(null);
        } else {
            this.t((Type)object, null);
        }
        if (list instanceof com.github.catvod.spider.merge.C.k) {
            ((com.github.catvod.spider.merge.C.k)((Object)list)).a();
            return;
        }
        list = this.m;
        if (list != null) {
            list = ((ArrayList)list).iterator();
            while (list.hasNext()) {
                ((l)list.next()).a();
            }
        }
        if (this.k == 1) {
            this.k = 0;
        }
    }

    public final com.github.catvod.spider.merge.y.e s() {
        Object object = this.v(new com.github.catvod.spider.merge.y.e(this.f.l(com.github.catvod.spider.merge.B.c.n)), null);
        if (object instanceof com.github.catvod.spider.merge.y.e) {
            return (com.github.catvod.spider.merge.y.e)object;
        }
        if (object == null) {
            return null;
        }
        return new com.github.catvod.spider.merge.y.e((Map)object);
    }

    public final <T> T t(Type object, Object object2) {
        int n2 = this.f.p();
        if (n2 == 8) {
            this.f.nextToken();
            return (T)A.r0((Type)object);
        }
        if (n2 == 4) {
            if (object == byte[].class) {
                object = this.f.A();
                this.f.nextToken();
                return (T)object;
            }
            if (object == char[].class) {
                object = this.f.K();
                this.f.nextToken();
                return (T)((String)object).toCharArray();
            }
        }
        v v2 = this.c.f((Type)object);
        try {
            if (v2.getClass() == q.class) {
                if (this.f.p() != 12 && this.f.p() != 14) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("syntax error,expect start with { or [,but actually start with ");
                    ((StringBuilder)object).append(this.f.y());
                    object2 = new com.github.catvod.spider.merge.y.d(((StringBuilder)object).toString());
                    throw object2;
                }
                return ((q)v2).g(this, (Type)object, object2, 0);
            }
            object = v2.c(this, (Type)object, object2);
        }
        catch (Throwable throwable) {
            throw new com.github.catvod.spider.merge.y.d(throwable.getMessage(), throwable);
        }
        catch (com.github.catvod.spider.merge.y.d d2) {
            throw d2;
        }
        return (T)object;
    }

    public final Object u(Map map) {
        return this.v(map, null);
    }

    /*
     * Exception decompiling
     */
    public final Object v(Map var1_1, Object var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [285[UNCONDITIONALDOLOOP]], but top level block is 96[TRYBLOCK]
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

    public final void w(Object object) {
        Class<?> clazz = object.getClass();
        Object object2 = this.c.f(clazz);
        q q2 = object2 instanceof q ? (q)object2 : null;
        if (this.f.p() != 12 && this.f.p() != 16) {
            object = com.github.catvod.spider.merge.C.a.c("syntax error, expect {, actual ");
            ((StringBuilder)object).append(this.f.y());
            throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object).toString());
        }
        while (true) {
            n n2;
            if ((object2 = this.f.x(this.b)) == null) {
                if (this.f.p() == 13) {
                    this.f.o(16);
                    return;
                }
                if (this.f.p() == 16 && this.f.l(com.github.catvod.spider.merge.B.c.g)) continue;
            }
            if ((n2 = q2 != null ? q2.k((String)object2, null) : null) == null) {
                if (this.f.l(com.github.catvod.spider.merge.B.c.i)) {
                    this.f.q();
                    this.m();
                    if (this.f.p() != 13) continue;
                    this.f.nextToken();
                    return;
                }
                object = com.github.catvod.spider.merge.C.a.c("setter not found, class ");
                ((StringBuilder)object).append(clazz.getName());
                ((StringBuilder)object).append(", property ");
                ((StringBuilder)object).append((String)object2);
                throw new com.github.catvod.spider.merge.y.d(((StringBuilder)object).toString());
            }
            object2 = n2.a;
            Object object3 = ((com.github.catvod.spider.merge.H.e)object2).e;
            object2 = ((com.github.catvod.spider.merge.H.e)object2).f;
            if (object3 == Integer.TYPE) {
                this.f.a();
                object2 = G.a.c(this, (Type)object2, null);
            } else if (object3 == String.class) {
                this.f.a();
                object2 = j0.f(this);
            } else if (object3 == Long.TYPE) {
                this.f.a();
                object2 = S.a.c(this, (Type)object2, null);
            } else {
                v v2 = this.c.e((Class<?>)object3, (Type)object2);
                object3 = this.f;
                v2.e();
                object3.a();
                object2 = v2.c(this, (Type)object2, null);
            }
            n2.e(object, object2);
            if (this.f.p() != 16 && this.f.p() == 13) break;
        }
        this.f.o(16);
    }

    public final void x() {
        if (this.f.l(com.github.catvod.spider.merge.B.c.k)) {
            return;
        }
        this.g = this.g.b;
        int n2 = this.i;
        if (n2 <= 0) {
            return;
        }
        this.i = --n2;
        this.h[n2] = null;
    }

    public final Object y(String string) {
        Object object;
        if (this.h == null) {
            return null;
        }
        for (int i2 = 0; i2 < ((k[])(object = this.h)).length && i2 < this.i; ++i2) {
            if (!((k)(object = object[i2])).toString().equals(string)) continue;
            return ((k)object).a;
        }
        return null;
    }

    public final k z(k kArray, Object object, Object kArray2) {
        if (this.f.l(com.github.catvod.spider.merge.B.c.k)) {
            return null;
        }
        this.g = object = new k((k)kArray, object, kArray2);
        int n2 = this.i;
        this.i = n2 + 1;
        kArray = this.h;
        if (kArray == null) {
            this.h = new k[8];
        } else if (n2 >= kArray.length) {
            kArray2 = new k[kArray.length * 3 / 2];
            System.arraycopy(kArray, 0, kArray2, 0, kArray.length);
            this.h = kArray2;
        }
        this.h[n2] = object;
        return this.g;
    }
}

