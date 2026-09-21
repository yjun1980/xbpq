/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.impl.StaticLoggerBinder
 */
package com.github.catvod.spider.merge.nz;

import com.github.catvod.spider.merge.Dw.d;
import com.github.catvod.spider.merge.Dw.h;
import com.github.catvod.spider.merge.Dw.q;
import com.github.catvod.spider.merge.nz.a;
import com.github.catvod.spider.merge.nz.b;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

public final class c {
    static volatile int a;
    static final d b;
    static final q c;
    static boolean d;
    private static final String[] e;
    private static String f;

    static {
        b = new d();
        c = new q();
        String string = null;
        try {
            String string2;
            string = string2 = System.getProperty("slf4j.detectLoggerNameMismatch");
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        boolean bl = string == null ? false : string.equalsIgnoreCase("true");
        d = bl;
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    private c() {
    }

    /*
     * Exception decompiling
     */
    private static final void a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [8 : 39->62)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Set<URL> b() {
        LinkedHashSet<URL> linkedHashSet = new LinkedHashSet<URL>();
        try {
            Enumeration<URL> enumeration = c.class.getClassLoader();
            enumeration = enumeration == null ? ClassLoader.getSystemResources(f) : ((ClassLoader)((Object)enumeration)).getResources(f);
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
            return linkedHashSet;
        }
        catch (IOException iOException) {
            h.c((String)"Error getting resources from path", (Throwable)iOException);
        }
        return linkedHashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a c() {
        int n2;
        if (a == 0) {
            synchronized (c.class) {
                if (a == 0) {
                    a = 1;
                    com.github.catvod.spider.merge.nz.c.a();
                    if (a == 3) {
                        com.github.catvod.spider.merge.nz.c.j();
                    }
                }
            }
        }
        if ((n2 = a) == 1) {
            return b;
        }
        if (n2 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (n2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (n2 == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static b d(Class<?> clazz) {
        Object object = clazz.getName();
        b b2 = com.github.catvod.spider.merge.nz.c.c().a((String)object);
        if (d && (object = h.a()) != null && ((Class)object).isAssignableFrom(clazz) ^ true) {
            h.b((String)String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", b2.b(), ((Class)object).getName()));
            h.b((String)"See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return b2;
    }

    public static b e(String string) {
        return com.github.catvod.spider.merge.nz.c.c().a(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean f() {
        String string = null;
        try {
            String string2;
            string = string2 = System.getProperty("java.vendor.url");
        }
        catch (SecurityException securityException) {}
        if (string != null) return string.toLowerCase().contains("android");
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void g() {
        Object object322;
        Object object2 = b;
        synchronized (object2) {
            object2.e();
            for (Object object322 : (ArrayList)object2.d()) {
                object322.g(com.github.catvod.spider.merge.nz.c.e(object322.b()));
            }
            {
                catch (Throwable throwable) {}
                {
                    throw throwable;
                }
            }
        }
        object322 = b.c();
        int n2 = ((LinkedBlockingQueue)object322).size();
        ArrayList arrayList = new ArrayList(128);
        int n3 = 0;
        while (true) {
            if (((LinkedBlockingQueue)object322).drainTo(arrayList, 128) == 0) {
                b.b();
                return;
            }
            object2 = arrayList.iterator();
            while (object2.hasNext()) {
                Object object4;
                com.github.catvod.spider.merge.mk.c c2 = (com.github.catvod.spider.merge.mk.c)object2.next();
                if (c2 != null) {
                    object4 = c2.a();
                    String string = object4.b();
                    if (object4.e()) throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    if (!object4.d()) {
                        if (object4.c()) {
                            object4.f((com.github.catvod.spider.merge.mk.b)c2);
                        } else {
                            h.b((String)string);
                        }
                    }
                }
                if (n3 == 0) {
                    if (c2.a().c()) {
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("A number (");
                        ((StringBuilder)object4).append(n2);
                        ((StringBuilder)object4).append(") of logging calls during the initialization phase have been intercepted and are");
                        h.b((String)((StringBuilder)object4).toString());
                        h.b((String)"now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        h.b((String)"See also http://www.slf4j.org/codes.html#replay");
                    } else if (!c2.a().d()) {
                        h.b((String)"The following set of substitute loggers may have been accessed");
                        h.b((String)"during the initialization phase. Logging calls during this");
                        h.b((String)"phase were not honored. However, subsequent logging calls to these");
                        h.b((String)"loggers will work as normally expected.");
                        h.b((String)"See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                ++n3;
            }
            arrayList.clear();
        }
    }

    private static void h(Set<URL> object) {
        if (object != null) {
            int n2 = object.size();
            boolean bl = true;
            if (n2 <= 1) {
                bl = false;
            }
            if (bl) {
                object = com.github.catvod.spider.merge.ka.d.b("Actual binding is of type [");
                ((StringBuilder)object).append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                ((StringBuilder)object).append("]");
                h.b((String)((StringBuilder)object).toString());
            }
        }
    }

    private static void i(Set<URL> object) {
        int n2 = object.size();
        boolean bl = true;
        if (n2 <= 1) {
            bl = false;
        }
        if (bl) {
            h.b((String)"Class path contains multiple SLF4J bindings.");
            object = object.iterator();
            while (object.hasNext()) {
                URL uRL = (URL)object.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found binding in [");
                stringBuilder.append(uRL);
                stringBuilder.append("]");
                h.b((String)stringBuilder.toString());
            }
            h.b((String)"See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void j() {
        Object object;
        String string;
        try {
            string = StaticLoggerBinder.REQUESTED_API_VERSION;
            object = e;
            int n2 = ((String[])object).length;
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!string.startsWith(object[i2])) continue;
                bl = true;
            }
            if (bl) return;
        }
        catch (Throwable throwable) {
            h.c((String)"Unexpected problem occured during version sanity check", (Throwable)throwable);
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
        {
            object = new StringBuilder();
            ((StringBuilder)object).append("The requested version ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" by your slf4j binding is not compatible with ");
            ((StringBuilder)object).append(Arrays.asList(e).toString());
            h.b((String)((StringBuilder)object).toString());
            h.b((String)"See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            return;
        }
    }
}

