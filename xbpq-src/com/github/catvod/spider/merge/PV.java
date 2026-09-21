/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.impl.StaticLoggerBinder
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.B4;
import com.github.catvod.spider.merge.Pt;
import com.github.catvod.spider.merge.Sj;
import com.github.catvod.spider.merge.Yg;
import com.github.catvod.spider.merge.gp;
import com.github.catvod.spider.merge.jf;
import com.github.catvod.spider.merge.zE;
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

public final class PV {
    private static final String[] OL;
    static final jf S;
    static final B4 T4;
    static boolean b;
    private static String l;
    static volatile int l8;

    static {
        S = new jf();
        T4 = new B4();
        b = Pt.l("slf4j.detectLoggerNameMismatch");
        OL = new String[]{"1.6", "1.7"};
        l = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    private PV() {
    }

    private static boolean A() {
        if ("http://www.android.com/" == null) {
            return false;
        }
        return "http://www.android.com/".toLowerCase().contains("android");
    }

    private static void E9() {
        LinkedBlockingQueue<zE> linkedBlockingQueue = S.T4();
        int n2 = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int n3 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (zE zE2 : arrayList) {
                PV.uS(zE2);
                if (n3 == 0) {
                    PV.S(zE2, n2);
                }
                ++n3;
            }
            arrayList.clear();
        }
        return;
    }

    public static Sj HM(Class<?> clazz) {
        Class<?> clazz2;
        Sj sj = PV.n(clazz.getName());
        if (b && (clazz2 = Pt.l8()) != null && PV.s(clazz, clazz2)) {
            Pt.T4(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", sj.getName(), clazz2.getName()));
            Pt.T4("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return sj;
    }

    private static void Kf() {
        PV.tT();
        PV.E9();
        S.S();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static gp N() {
        int n2;
        if (l8 == 0) {
            synchronized (PV.class) {
                if (l8 == 0) {
                    l8 = 1;
                    PV.hR();
                }
            }
        }
        if ((n2 = l8) == 1) {
            return S;
        }
        if (n2 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (n2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (n2 == 4) {
            return T4;
        }
        throw new IllegalStateException("Unreachable code");
    }

    static void OL(Throwable throwable) {
        l8 = 2;
        Pt.b("Failed to instantiate SLF4J LoggerFactory", throwable);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void Q() {
        Object object;
        String string;
        try {
            string = StaticLoggerBinder.REQUESTED_API_VERSION;
            object = OL;
            int n2 = ((String[])object).length;
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!string.startsWith(object[i2])) continue;
                bl = true;
            }
            if (bl) return;
        }
        catch (Throwable throwable) {
            Pt.b("Unexpected problem occured during version sanity check", throwable);
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
            ((StringBuilder)object).append(Arrays.asList(OL).toString());
            Pt.T4(((StringBuilder)object).toString());
            Pt.T4("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            return;
        }
    }

    private static void S(zE zE2, int n2) {
        if (zE2.l8().l8()) {
            PV.T4(n2);
        } else if (!zE2.l8().S()) {
            PV.b();
        }
    }

    private static void T4(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A number (");
        stringBuilder.append(n2);
        stringBuilder.append(") of logging calls during the initialization phase have been intercepted and are");
        Pt.T4(stringBuilder.toString());
        Pt.T4("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        Pt.T4("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void b() {
        Pt.T4("The following set of substitute loggers may have been accessed");
        Pt.T4("during the initialization phase. Logging calls during this");
        Pt.T4("phase were not honored. However, subsequent logging calls to these");
        Pt.T4("loggers will work as normally expected.");
        Pt.T4("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    private static void c(Set<URL> object) {
        if (object != null && PV.v(object)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Actual binding is of type [");
            ((StringBuilder)object).append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
            ((StringBuilder)object).append("]");
            Pt.T4(((StringBuilder)object).toString());
        }
    }

    private static boolean cD(String string) {
        if (string == null) {
            return false;
        }
        if (string.contains("org/slf4j/impl/StaticLoggerBinder")) {
            return true;
        }
        return string.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static void eD(Set<URL> object) {
        if (PV.v(object)) {
            Pt.T4("Class path contains multiple SLF4J bindings.");
            object = object.iterator();
            while (object.hasNext()) {
                URL uRL = (URL)object.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found binding in [");
                stringBuilder.append(uRL);
                stringBuilder.append("]");
                Pt.T4(stringBuilder.toString());
            }
            Pt.T4("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static final void hR() {
        PV.l8();
        if (l8 == 3) {
            PV.Q();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Set<URL> l() {
        LinkedHashSet<URL> linkedHashSet = new LinkedHashSet<URL>();
        try {
            Enumeration<URL> enumeration = PV.class.getClassLoader();
            enumeration = enumeration == null ? ClassLoader.getSystemResources(l) : ((ClassLoader)((Object)enumeration)).getResources(l);
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
            return linkedHashSet;
        }
        catch (IOException iOException) {
            Pt.b("Error getting resources from path", iOException);
        }
        return linkedHashSet;
    }

    /*
     * Exception decompiling
     */
    private static final void l8() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [8 : 39->57)] java.lang.Throwable
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

    public static Sj n(String string) {
        return PV.N().l8(string);
    }

    private static boolean s(Class<?> clazz, Class<?> clazz2) {
        return clazz2.isAssignableFrom(clazz) ^ true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void tT() {
        jf jf2 = S;
        synchronized (jf2) {
            jf2.OL();
            Iterator<Yg> iterator = jf2.b().iterator();
            while (iterator.hasNext()) {
                Yg yg = iterator.next();
                yg.OL(PV.n(yg.getName()));
            }
            return;
        }
    }

    private static void uS(zE zE2) {
        if (zE2 == null) {
            return;
        }
        Yg yg = zE2.l8();
        String string = yg.getName();
        if (!yg.T4()) {
            if (!yg.S()) {
                if (yg.l8()) {
                    yg.b(zE2);
                } else {
                    Pt.T4(string);
                }
            }
            return;
        }
        throw new IllegalStateException("Delegate logger cannot be null at this state.");
    }

    private static boolean v(Set<URL> set) {
        int n2 = set.size();
        boolean bl = true;
        if (n2 <= 1) {
            bl = false;
        }
        return bl;
    }
}

