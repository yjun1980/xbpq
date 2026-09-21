/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.P.C;
import com.github.catvod.spider.merge.Q.Y;
import com.github.catvod.spider.merge.Q.a;
import com.github.catvod.spider.merge.Q.f0;
import com.github.catvod.spider.merge.Q.m;
import com.github.catvod.spider.merge.Q.n0;
import com.github.catvod.spider.merge.Q.p;
import com.github.catvod.spider.merge.Q.w;
import com.github.catvod.spider.merge.S.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;

public abstract class X {
    public static final w b = new w();
    public final int a;

    protected X(int n2) {
        this.a = n2;
    }

    public static X a(a a2, C c2) {
        C c3 = c2;
        if (c2 == null) {
            c3 = C.c;
        }
        if ((c2 = c3.a) != null && c3 != C.c) {
            return n0.i(X.a(a2, c2), ((f0)((m)((ArrayList)a2.a).get((int)c3.b)).d((int)0)).c.b);
        }
        return b;
    }

    public static X b(X x2, Y y2, IdentityHashMap<X, X> identityHashMap) {
        if (x2.f()) {
            return x2;
        }
        Object object = identityHashMap.get(x2);
        if (object != null) {
            return object;
        }
        object = (X)((HashMap)y2.a).get(x2);
        if (object != null) {
            identityHashMap.put(x2, (X)object);
            return object;
        }
        object = new X[x2.h()];
        int n2 = 0;
        for (int i2 = 0; i2 < ((X[])object).length; ++i2) {
            int n3;
            X[] xArray;
            block11: {
                X x3;
                block10: {
                    x3 = X.b(x2.c(i2), y2, identityHashMap);
                    if (n2 != 0) break block10;
                    xArray = object;
                    n3 = n2;
                    if (x3 == x2.c(i2)) break block11;
                }
                n3 = n2;
                if (n2 == 0) {
                    object = new X[x2.h()];
                    for (n2 = 0; n2 < x2.h(); ++n2) {
                        object[n2] = x2.c(n2);
                    }
                    n3 = 1;
                }
                object[i2] = x3;
                xArray = object;
            }
            object = xArray;
            n2 = n3;
        }
        if (n2 == 0) {
            y2.a(x2);
            identityHashMap.put(x2, x2);
            return x2;
        }
        object = ((X[])object).length == 0 ? b : (((X[])object).length == 1 ? n0.i(object[0], x2.d(0)) : new p((X[])object, ((p)x2).d));
        y2.a((X)object);
        identityHashMap.put((X)object, (X)object);
        identityHashMap.put(x2, (X)object);
        return object;
    }

    /*
     * Exception decompiling
     */
    public static X g(X var0, X var1_1, boolean var2_2, c<X, X, X> var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    public abstract X c(int var1);

    public abstract int d(int var1);

    public final boolean e() {
        int n2 = this.h();
        boolean bl = true;
        if (this.d(n2 - 1) != Integer.MAX_VALUE) {
            bl = false;
        }
        return bl;
    }

    public abstract boolean equals(Object var1);

    public boolean f() {
        boolean bl = this == b;
        return bl;
    }

    public abstract int h();

    public final int hashCode() {
        return this.a;
    }
}

