/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  androidx.lifecycle.a
 */
package com.github.catvod.spider.merge.Bk;

import android.os.Looper;
import com.github.catvod.spider.merge.Bk.h;
import com.github.catvod.spider.merge.Bk.i;
import com.github.catvod.spider.merge.Bk.j;
import com.github.catvod.spider.merge.Bk.k;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.e.a;
import com.github.catvod.spider.merge.xc.e.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class l
extends i {
    public final a a = new a();
    public h b;
    public final WeakReference c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public final ArrayList g = new ArrayList();
    public final boolean h;

    public l(k k2) {
        this.c = new WeakReference<k>(k2);
        this.b = com.github.catvod.spider.merge.Bk.h.b;
        this.h = true;
    }

    public final h a(j object) {
        Object object2 = this.a.e;
        boolean bl = object2.containsKey(object);
        Object object3 = null;
        object = bl ? ((c)object2.get((Object)object)).d : null;
        object = object != null ? ((androidx.lifecycle.a)((c)object).b).a : null;
        object2 = this.g;
        if (!((ArrayList)object2).isEmpty()) {
            object3 = (h)((Object)((ArrayList)object2).get(((ArrayList)object2).size() - 1));
        }
        object2 = this.b;
        if (object == null || ((Enum)object).compareTo(object2) >= 0) {
            object = object2;
        }
        if (object3 == null || object3.compareTo(object) >= 0) {
            object3 = object;
        }
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(String string) {
        com.github.catvod.spider.merge.xc.d.a a2;
        if (!this.h) return;
        if (com.github.catvod.spider.merge.xc.d.a.c != null) {
            a2 = com.github.catvod.spider.merge.xc.d.a.c;
        } else {
            // MONITORENTER : com.github.catvod.spider.merge.xc.d.a.class
            if (com.github.catvod.spider.merge.xc.d.a.c == null) {
                com.github.catvod.spider.merge.xc.d.a.c = a2 = new com.github.catvod.spider.merge.xc.d.a(0);
            }
            a2 = com.github.catvod.spider.merge.xc.d.a.c;
        }
        ((com.github.catvod.spider.merge.xc.d.a)a2.b).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) throw new IllegalStateException(m.r("Method ", string, " must be called on the main thread"));
    }

    public final void c(h h2) {
        if (this.b == h2) {
            return;
        }
        this.b = h2;
        if (!this.e && this.d == 0) {
            this.e = true;
            this.d();
            this.e = false;
            return;
        }
        this.f = true;
    }

    /*
     * Exception decompiling
     */
    public final void d() {
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
}

