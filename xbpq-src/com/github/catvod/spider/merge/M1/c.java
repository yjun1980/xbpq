/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.impl.StaticLoggerBinder
 */
package com.github.catvod.spider.merge.M1;

import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.J.i;
import com.github.catvod.spider.merge.M1.a;
import com.github.catvod.spider.merge.M1.b;
import com.github.catvod.spider.merge.O1.d;
import com.github.catvod.spider.merge.O1.f;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

public final class c {
    static volatile int a;
    static final d b;
    static final j c;
    static boolean d;
    private static final String[] e;
    private static String f;

    static {
        b = new d();
        c = new j();
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
            com.github.catvod.spider.merge.O1.f.c("Error getting resources from path", iOException);
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
                    com.github.catvod.spider.merge.M1.c.a();
                    if (a == 3) {
                        com.github.catvod.spider.merge.M1.c.j();
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

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static b d() {
        Class<i> clazz;
        Object object = i.class.getName();
        object = com.github.catvod.spider.merge.M1.c.c().a((String)object);
        if (d && (clazz = com.github.catvod.spider.merge.O1.f.a()) != null && clazz.isAssignableFrom(i.class) ^ true) {
            com.github.catvod.spider.merge.O1.f.b(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", object.getName(), clazz.getName()));
            com.github.catvod.spider.merge.O1.f.b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return object;
    }

    public static b e(String string) {
        return com.github.catvod.spider.merge.M1.c.c().a(string);
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void g() {
        Object object3;
        Object object2 = b;
        synchronized (object2) {
            ((d)object2).e();
            for (Object object3 : (ArrayList)((d)object2).d()) {
                ((com.github.catvod.spider.merge.O1.c)object3).r(com.github.catvod.spider.merge.M1.c.e(((com.github.catvod.spider.merge.O1.c)object3).getName()));
            }
        }
        object2 = b.c();
        int n2 = ((LinkedBlockingQueue)object2).size();
        object3 = new ArrayList(128);
        int n3 = 0;
        while (true) {
            if (((LinkedBlockingQueue)object2).drainTo(object3, 128) == 0) {
                b.b();
                return;
            }
            Iterator iterator = ((ArrayList)object3).iterator();
            while (iterator.hasNext()) {
                Object object4;
                com.github.catvod.spider.merge.N1.c c2 = (com.github.catvod.spider.merge.N1.c)iterator.next();
                if (c2 != null) {
                    object4 = c2.a();
                    String string = ((com.github.catvod.spider.merge.O1.c)object4).getName();
                    if (((com.github.catvod.spider.merge.O1.c)object4).p()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!((com.github.catvod.spider.merge.O1.c)object4).o()) {
                        if (((com.github.catvod.spider.merge.O1.c)object4).n()) {
                            ((com.github.catvod.spider.merge.O1.c)object4).q(c2);
                        } else {
                            com.github.catvod.spider.merge.O1.f.b(string);
                        }
                    }
                }
                if (n3 == 0) {
                    if (c2.a().n()) {
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("A number (");
                        ((StringBuilder)object4).append(n2);
                        ((StringBuilder)object4).append(") of logging calls during the initialization phase have been intercepted and are");
                        com.github.catvod.spider.merge.O1.f.b(((StringBuilder)object4).toString());
                        com.github.catvod.spider.merge.O1.f.b("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        com.github.catvod.spider.merge.O1.f.b("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!c2.a().o()) {
                        com.github.catvod.spider.merge.O1.f.b("The following set of substitute loggers may have been accessed");
                        com.github.catvod.spider.merge.O1.f.b("during the initialization phase. Logging calls during this");
                        com.github.catvod.spider.merge.O1.f.b("phase were not honored. However, subsequent logging calls to these");
                        com.github.catvod.spider.merge.O1.f.b("loggers will work as normally expected.");
                        com.github.catvod.spider.merge.O1.f.b("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                ++n3;
            }
            ((ArrayList)object3).clear();
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
                object = com.github.catvod.spider.merge.C.a.c("Actual binding is of type [");
                ((StringBuilder)object).append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                ((StringBuilder)object).append("]");
                com.github.catvod.spider.merge.O1.f.b(((StringBuilder)object).toString());
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
            com.github.catvod.spider.merge.O1.f.b("Class path contains multiple SLF4J bindings.");
            object = object.iterator();
            while (object.hasNext()) {
                URL uRL = (URL)object.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found binding in [");
                stringBuilder.append(uRL);
                stringBuilder.append("]");
                com.github.catvod.spider.merge.O1.f.b(stringBuilder.toString());
            }
            com.github.catvod.spider.merge.O1.f.b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
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
            com.github.catvod.spider.merge.O1.f.c("Unexpected problem occured during version sanity check", throwable);
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
            com.github.catvod.spider.merge.O1.f.b(((StringBuilder)object).toString());
            com.github.catvod.spider.merge.O1.f.b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            return;
        }
    }
}

