/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.d0.f;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.r0.e;
import com.github.catvod.spider.merge.xc.r0.l;
import com.github.catvod.spider.merge.xc.s0.D;
import com.github.catvod.spider.merge.xc.s0.c0;
import com.github.catvod.spider.merge.xc.s0.m0;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.s0.r;
import com.github.catvod.spider.merge.xc.s0.r0;
import com.github.catvod.spider.merge.xc.s0.x;
import com.github.catvod.spider.merge.xc.s0.z;
import com.github.catvod.spider.merge.xc.t0.B;
import com.github.catvod.spider.merge.xc.t0.C;
import com.github.catvod.spider.merge.xc.t0.E;
import com.github.catvod.spider.merge.xc.t0.g;
import com.github.catvod.spider.merge.xc.t0.h;
import com.github.catvod.spider.merge.xc.t0.i;
import com.github.catvod.spider.merge.xc.t0.m;
import com.github.catvod.spider.merge.xc.t0.u;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.CancellationException;

public abstract class a {
    public static final A a = new A(5, "NO_DECISION");
    public static final A b = new A(5, "UNDEFINED");
    public static final A c = new A(5, "REUSABLE_CLAIMED");
    public static final A d = new A(5, "CONDITION_FALSE");
    public static final A e = new A(5, "NO_THREAD_ELEMENTS");

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(com.github.catvod.spider.merge.xc.e0.i object, Throwable throwable) {
        block8: {
            Iterator iterator = g.a.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    h h2 = new h((com.github.catvod.spider.merge.xc.e0.i)object);
                    com.github.catvod.spider.merge.xc.D0.b.c(throwable, h2);
                    break block8;
                }
                com.github.catvod.spider.merge.Bk.m.n(iterator.next());
                try {
                    throw null;
                }
                catch (Throwable throwable2) {
                    void var2_4;
                    if (throwable == throwable2) {
                        Throwable throwable3 = throwable;
                    } else {
                        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", throwable2);
                        com.github.catvod.spider.merge.xc.D0.b.c(runtimeException, throwable);
                    }
                    Thread thread = Thread.currentThread();
                    thread.getUncaughtExceptionHandler().uncaughtException(thread, (Throwable)var2_4);
                    continue;
                }
                break;
            }
            catch (Throwable throwable4) {}
        }
        object = Thread.currentThread();
        ((Thread)object).getUncaughtExceptionHandler().uncaughtException((Thread)object, throwable);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List c() {
        void var0_13;
        if (!m.a) {
            void var0_7;
            ClassLoader classLoader = u.class.getClassLoader();
            try {
                ArrayList arrayList = com.github.catvod.spider.merge.xc.t0.a.d(classLoader);
                return var0_7;
            }
            catch (Throwable throwable) {
                List list = com.github.catvod.spider.merge.xc.d0.i.M(ServiceLoader.load(u.class, classLoader));
            }
            return var0_7;
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            try {
                com.github.catvod.spider.merge.Bk.m.n(u.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, u.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null)));
            }
            catch (ClassNotFoundException classNotFoundException) {}
            try {
                com.github.catvod.spider.merge.Bk.m.n(u.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, u.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null)));
                return var0_13;
            }
            catch (ClassNotFoundException classNotFoundException) {
                return var0_13;
            }
        }
        catch (Throwable throwable) {
            ClassLoader classLoader = u.class.getClassLoader();
            try {
                ArrayList arrayList = com.github.catvod.spider.merge.xc.t0.a.d(classLoader);
                return var0_13;
            }
            catch (Throwable throwable2) {
                List list = com.github.catvod.spider.merge.xc.d0.i.M(ServiceLoader.load(u.class, classLoader));
            }
        }
        return var0_13;
    }

    /*
     * Exception decompiling
     */
    public static ArrayList d(ClassLoader var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 179->187)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public static List e(BufferedReader bufferedReader) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            string = ((Object)com.github.catvod.spider.merge.xc.r0.e.f0(com.github.catvod.spider.merge.xc.r0.e.d0(string, "#"))).toString();
            for (int i2 = 0; i2 < string.length(); ++i2) {
                char c2 = string.charAt(i2);
                if (c2 == '.' || Character.isJavaIdentifierPart(c2)) continue;
                throw new IllegalArgumentException("Illegal service provider class name: ".concat(string).toString());
            }
            if (string.length() <= 0) continue;
            linkedHashSet.add(string);
        }
        return com.github.catvod.spider.merge.xc.d0.i.M(linkedHashSet);
    }

    public static final void f(com.github.catvod.spider.merge.xc.e0.i object, Object object2) {
        if (object2 == e) {
            return;
        }
        if (object2 instanceof E) {
            object2 = (E)object2;
            object = ((E)object2).c;
            int n2 = ((z[])object).length - 1;
            if (n2 >= 0) {
                while (true) {
                    int n3 = n2 - 1;
                    com.github.catvod.spider.merge.mI.i.b(object[n2]);
                    String string = (String)((E)object2).b[n2];
                    Thread.currentThread().setName(string);
                    if (n3 >= 0) {
                        n2 = n3;
                        continue;
                    }
                    break;
                }
            }
        } else {
            object = object.c(null, C.c);
            com.github.catvod.spider.merge.mI.i.c(object, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            object = (z)object;
            object = (String)object2;
            Thread.currentThread().setName((String)object);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void g(d var0, com.github.catvod.spider.merge.by.l var1_3) {
        block14: {
            block15: {
                var3_5 = com.github.catvod.spider.merge.xc.c0.f.a;
                if (!(var0 instanceof i)) {
                    var0.resumeWith(var3_5);
                    return;
                }
                var4_6 = (i)var0;
                var0 = com.github.catvod.spider.merge.xc.c0.d.a(var3_5);
                var0 = var0 == null ? (var1_3 != null ? new r(var3_5, (com.github.catvod.spider.merge.by.l)var1_3) : var3_5) : new q((Throwable)var0, false);
                var1_3 = var4_6.e;
                var1_3.getContext();
                var5_7 = var4_6.d;
                if (var5_7.g()) {
                    var4_6.f = var0;
                    var4_6.c = 1;
                    var5_7.d(var1_3.getContext(), var4_6);
                    return;
                }
                var2_8 = D.a;
                var5_7 = r0.a();
                if (var5_7.c >= 0x100000000L) {
                    var4_6.f = var0;
                    var4_6.c = 1;
                    var0 = var1_3 = var5_7.e;
                    if (var1_3 == null) {
                        var5_7.e = var0 = new f();
                    }
                    var0.addLast(var4_6);
                    return;
                }
                var5_7.j(true);
                var6_9 = (c0)var1_3.getContext().b(x.b);
                if (var6_9 == null || var6_9.a()) break block15;
                var1_3 = ((m0)var6_9).p();
                var4_6.a(var0, (CancellationException)var1_3);
                var4_6.resumeWith(com.github.catvod.spider.merge.xc.a.a.h((Throwable)var1_3));
                ** GOTO lbl46
            }
            var6_9 = var4_6.g;
            var0 = var1_3.getContext();
            var6_9 = com.github.catvod.spider.merge.xc.t0.a.k((com.github.catvod.spider.merge.xc.e0.i)var0, var6_9);
            if (var6_9 == com.github.catvod.spider.merge.xc.t0.a.e) break block14;
            com.github.catvod.spider.merge.xc.s0.E.l((d)var1_3, (com.github.catvod.spider.merge.xc.e0.i)var0);
        }
        var1_3.resumeWith(var3_5);
        com.github.catvod.spider.merge.xc.t0.a.f((com.github.catvod.spider.merge.xc.e0.i)var0, var6_9);
lbl46:
        // 3 sources

        while (var2_8 = var5_7.l()) {
        }
        return;
        {
            catch (Throwable var0_1) {}
        }
        catch (Throwable var1_4) {
            com.github.catvod.spider.merge.xc.t0.a.f((com.github.catvod.spider.merge.xc.e0.i)var0, var6_9);
            throw var1_4;
        }
        try {
            var4_6.e(var0_1, null);
            return;
        }
        finally {
            var5_7.h(true);
        }
    }

    public static final long h(long l2, long l3, long l4, String string) {
        Comparable<Long> comparable;
        CharSequence charSequence;
        block5: {
            block6: {
                block4: {
                    int n2 = B.a;
                    try {
                        charSequence = System.getProperty(string);
                    }
                    catch (SecurityException securityException) {
                        charSequence = null;
                    }
                    if (charSequence == null) break block4;
                    comparable = l.I((String)charSequence);
                    if (comparable == null) break block5;
                    l2 = (Long)comparable;
                    if (l3 > l2 || l2 > l4) break block6;
                }
                return l2;
            }
            charSequence = new StringBuilder("System property '");
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("' should be in range ");
            ((StringBuilder)charSequence).append(l3);
            ((StringBuilder)charSequence).append("..");
            ((StringBuilder)charSequence).append(l4);
            ((StringBuilder)charSequence).append(", but is '");
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append('\'');
            throw new IllegalStateException(((StringBuilder)charSequence).toString().toString());
        }
        comparable = new StringBuilder("System property '");
        ((StringBuilder)comparable).append(string);
        ((StringBuilder)comparable).append("' has unrecognized value '");
        ((StringBuilder)comparable).append((String)charSequence);
        ((StringBuilder)comparable).append('\'');
        throw new IllegalStateException(((StringBuilder)comparable).toString().toString());
    }

    public static int i(String string, int n2, int n3, int n4, int n5) {
        if ((n5 & 4) != 0) {
            n3 = 1;
        }
        if ((n5 & 8) != 0) {
            n4 = Integer.MAX_VALUE;
        }
        return (int)com.github.catvod.spider.merge.xc.t0.a.h(n2, n3, n4, string);
    }

    public static final Object j(com.github.catvod.spider.merge.xc.e0.i object) {
        object = object.c(0, C.b);
        com.github.catvod.spider.merge.mI.i.b(object);
        return object;
    }

    public static final Object k(com.github.catvod.spider.merge.xc.e0.i object, Object object2) {
        Object object3 = object2;
        if (object2 == null) {
            object3 = com.github.catvod.spider.merge.xc.t0.a.j((com.github.catvod.spider.merge.xc.e0.i)object);
        }
        object = object3 == Integer.valueOf(0) ? e : (object3 instanceof Integer ? object.c(new E((com.github.catvod.spider.merge.xc.e0.i)object, ((Number)object3).intValue()), C.d) : ((z)object3).d((com.github.catvod.spider.merge.xc.e0.i)object));
        return object;
    }

    public abstract com.github.catvod.spider.merge.by.l a(Class var1);
}

