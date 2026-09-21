/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.github.catvod.spider.merge.v;

import android.annotation.SuppressLint;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.o.a;
import com.github.catvod.spider.merge.v.c;
import com.github.catvod.spider.merge.v.d;
import com.github.catvod.spider.merge.v.e;
import com.github.catvod.spider.merge.v.g;
import com.github.catvod.spider.merge.v.h;
import com.github.catvod.spider.merge.v.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class j
extends e {
    private com.github.catvod.spider.merge.p.a<g, i> a = new com.github.catvod.spider.merge.p.a();
    private d b;
    private final WeakReference<h> c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<d> g = new ArrayList();
    private final boolean h;

    public j(h h2) {
        this.c = new WeakReference<h>(h2);
        this.b = com.github.catvod.spider.merge.v.d.b;
        this.h = true;
    }

    @SuppressLint(value={"RestrictedApi"})
    private void b(String string) {
        if (this.h && !com.github.catvod.spider.merge.o.a.i().j()) {
            throw new IllegalStateException(s.a("Method ", string, " must be called on the main thread"));
        }
    }

    static d e(d d2, d d3) {
        d d4 = d2;
        if (d3 != null) {
            d4 = d2;
            if (d3.compareTo(d2) < 0) {
                d4 = d3;
            }
        }
        return d4;
    }

    private void f(d d2) {
        if (this.b == d2) {
            return;
        }
        this.b = d2;
        if (!this.e && this.d == 0) {
            this.e = true;
            this.i();
            this.e = false;
            return;
        }
        this.f = true;
    }

    private void g() {
        ArrayList<d> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void h(d d2) {
        this.g.add(d2);
    }

    /*
     * Exception decompiling
     */
    private void i() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 4[UNCONDITIONALDOLOOP]
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

    @Override
    public final void a(g g2) {
        this.b("removeObserver");
        this.a.g(g2);
    }

    public final void c(c c2) {
        this.b("handleLifecycleEvent");
        this.f(c2.b());
    }

    @Deprecated
    public final void d() {
        d d2 = com.github.catvod.spider.merge.v.d.c;
        this.b("markState");
        this.b("setCurrentState");
        this.f(d2);
    }
}

