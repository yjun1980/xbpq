/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.c0.g;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.D;
import com.github.catvod.spider.merge.d0.E;
import com.github.catvod.spider.merge.d0.F;
import com.github.catvod.spider.merge.d0.b;

public final class h
extends l {
    private g l;
    private E m;
    private int n;

    public h() {
        D d2 = D.c;
        super(F.l(cYh.d("44222E3E23"), d2), "", null);
        this.l = new g();
        this.n = 1;
        this.m = new E(new b());
    }

    /*
     * Exception decompiling
     */
    @Override
    public final l o0(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[DOLOOP]], but top level block is 2[SIMPLE_IF_TAKEN]
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

    public final h r0() {
        h h2 = (h)super.S();
        h2.l = this.l.a();
        return h2;
    }

    public final g s0() {
        return this.l;
    }

    @Override
    public final String t() {
        return cYh.d("44342E322237023E35");
    }

    public final h t0(E e2) {
        this.m = e2;
        return this;
    }

    @Override
    public final String u() {
        return this.X();
    }

    public final E u0() {
        return this.m;
    }

    public final h v0() {
        this.n = 2;
        return this;
    }

    public final int w0() {
        return this.n;
    }
}

