/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.impl.StaticLoggerBinder
 */
package com.github.catvod.spider.merge.n0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.n0.a;
import com.github.catvod.spider.merge.n0.b;
import com.github.catvod.spider.merge.p0.d;
import com.github.catvod.spider.merge.p0.f;
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
    static final com.github.catvod.spider.merge.W.a c;
    static boolean d;
    private static final String[] e;
    private static String f;

    static {
        b = new d();
        c = new com.github.catvod.spider.merge.W.a();
        String string = cYh.d("143C27653D7403353534342E2B3F2636322829312C341A33143D20253432");
        String string2 = null;
        try {
            string2 = string = System.getProperty(string);
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        boolean bl = string2 == null ? false : string2.equalsIgnoreCase(cYh.d("13223434"));
        d = bl;
        e = new String[]{cYh.d("567E77"), cYh.d("567E76")};
        f = cYh.d("0822267E243601642B7E3E37173C6E02233B1339221D383D003533133E340335337F3436062332");
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [8 : 45->70)] java.lang.Throwable
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
            com.github.catvod.spider.merge.p0.f.c(cYh.d("2222333E257A003535253E3400703334243512222234247A01222E3C772A062429"), iOException);
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
                    com.github.catvod.spider.merge.n0.c.a();
                    if (a == 3) {
                        com.github.catvod.spider.merge.n0.c.j();
                    }
                }
            }
        }
        if ((n2 = a) == 1) {
            return b;
        }
        if (n2 == 2) {
            throw new IllegalStateException(cYh.d("0822267F243601642B7F1B3500372423113B04242E232E7A0E3E613736330B352571242E0624247F771515392638393B0B702429343F1724283E397A103132712332153F363F771F26020D18120849701234327A063C323E77321324316B78751027367F243601642B7F3828007F223E333F147E29253A3644252F22223904353222312F0B192F3823"));
        }
        if (n2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (n2 == 4) {
            return c;
        }
        throw new IllegalStateException(cYh.d("323E333436390F31233D327A043F2534"));
    }

    public static b d(Class<?> object) {
        Object object2;
        Object object3 = ((Class)object).getName();
        object3 = com.github.catvod.spider.merge.n0.c.c().a((String)object3);
        if (d && (object2 = com.github.catvod.spider.merge.p0.f.a()) != null && ((Class)object2).isAssignableFrom((Class<?>)object) ^ true) {
            object = object3.b();
            object2 = ((Class)object2).getName();
            com.github.catvod.spider.merge.p0.f.b(String.format(cYh.d("23353534342E0234613D383D00353371393B0A35613C3E290A3135323F74471728273234473E203C326047726422756147332E3C272F13352571393B0A357B71757F14726F"), object, object2));
            com.github.catvod.spider.merge.p0.f.b(cYh.d("343524713F2E13207B7E782D10276F223B3C533A6F3E253D48332E3532294938353C3B790B3F2636322829312C341A33143D2025343247362E23773B097024292736063E20253E3509"));
        }
        return object3;
    }

    public static b e(String string) {
        return com.github.catvod.spider.merge.n0.c.c().a(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean f() {
        String string = cYh.d("0D313730792C023E253E257412222D");
        String string2 = null;
        try {
            string2 = string = System.getProperty(string);
        }
        catch (SecurityException securityException) {}
        if (string2 != null) return string2.toLowerCase().contains(cYh.d("063E2523383303"));
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
        int n2;
        ArrayList arrayList;
        int n3;
        Object object322;
        Object object2 = b;
        synchronized (object2) {
            ((d)object2).e();
            for (Object object322 : (ArrayList)((d)object2).d()) {
                ((com.github.catvod.spider.merge.p0.c)object322).g(com.github.catvod.spider.merge.n0.c.e(((com.github.catvod.spider.merge.p0.c)object322).b()));
            }
            // MONITOREXIT @DISABLED, blocks:[0, 2] lbl10 : MonitorExitStatement: MONITOREXIT : var2
            object322 = b.c();
            n3 = ((LinkedBlockingQueue)object322).size();
            arrayList = new ArrayList(128);
            n2 = 0;
            {
                catch (Throwable throwable) {}
                {
                    throw throwable;
                }
            }
        }
        while (true) {
            if (((LinkedBlockingQueue)object322).drainTo(arrayList, 128) == 0) {
                b.b();
                return;
            }
            object2 = arrayList.iterator();
            while (object2.hasNext()) {
                Object object4;
                com.github.catvod.spider.merge.o0.c c2 = (com.github.catvod.spider.merge.o0.c)object2.next();
                if (c2 != null) {
                    object4 = c2.a();
                    String string = ((com.github.catvod.spider.merge.p0.c)object4).b();
                    if (((com.github.catvod.spider.merge.p0.c)object4).e()) throw new IllegalStateException(cYh.d("23352D34303B1335613D383D00353371343B093E2E25773802702F243B364731357123320E236122233B13356F"));
                    if (!((com.github.catvod.spider.merge.p0.c)object4).d()) {
                        if (((com.github.catvod.spider.merge.p0.c)object4).c()) {
                            ((com.github.catvod.spider.merge.p0.c)object4).f(c2);
                        } else {
                            com.github.catvod.spider.merge.p0.f.b(string);
                        }
                    }
                }
                if (n2 == 0) {
                    if (c2.a().c()) {
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append(cYh.d("26702F243A3802226179"));
                        ((StringBuilder)object4).append(n3);
                        ((StringBuilder)object4).append(cYh.d("4E702E37773608372638393D4733203D3B29473434233E3400703539327A0E3E28253E3B0B393B302333083E61213F3B14356139362C02702334323447392F25322804353125323E47312F35773B1535"));
                        com.github.catvod.spider.merge.p0.f.b(((StringBuilder)object4).toString());
                        com.github.catvod.spider.merge.p0.f.b(cYh.d("093F3671353F0E3E2671253F173C2028323E49701539322902702023327A1425233B32391370353E772E0F3561373E3613353338393D4722343D3229473F277123320270343F333F153C3838393D473C2E363033093761222E2913352C7F"));
                        com.github.catvod.spider.merge.p0.f.b(cYh.d("343524713636143F6139232E176A6E7E202D107E323D316E0D7E2E233075043F253424740F242C3D742802202D302E"));
                    } else if (!c2.a().d()) {
                        com.github.catvod.spider.merge.p0.f.b(cYh.d("3338247131350B3C2E263E3400703234237A08366122223814242825222E02702D3E303D022232713A3B1E702930213F47322434397A0633223424290234"));
                        com.github.catvod.spider.merge.p0.f.b(cYh.d("03253338393D4724293477330939353836360E2A20253E35097031393629027E611D383D00392F367739063C2D22773E1222283F307A13382822"));
                        com.github.catvod.spider.merge.p0.f.b(cYh.d("17382022327A10353334773408246139383408222435797A2F3F3634213F157C6122223814353024323413702D3E303D0E3E2671343B0B3C3271233547242934243F"));
                        com.github.catvod.spider.merge.p0.f.b(cYh.d("0B3F26363228147036383B3647272E233C7A0623613F38280A312D3D2E7A02283134342E02346F"));
                        com.github.catvod.spider.merge.p0.f.b(cYh.d("343524713636143F6139232E176A6E7E202D107E323D316E0D7E2E233075043F253424740F242C3D7429123232253E2E1224241D383D003533"));
                    }
                }
                ++n2;
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
                object = com.github.catvod.spider.merge.d.d.b(cYh.d("2633352436364732283F333309376138247A083661252E2A02701A"));
                ((StringBuilder)object).append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                ((StringBuilder)object).append(cYh.d("3A"));
                com.github.catvod.spider.merge.p0.f.b(((StringBuilder)object).toString());
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
            com.github.catvod.spider.merge.p0.f.b(cYh.d("243C2022247A173135397739083E35303E3414702C243B2E0E202D3477092B16751B77380E3E2538393D147E"));
            Iterator<URL> iterator = object.iterator();
            while (iterator.hasNext()) {
                URL uRL = iterator.next();
                object = new StringBuilder();
                ((StringBuilder)object).append(cYh.d("213F343F337A05392F353E340070283F7701"));
                ((StringBuilder)object).append(uRL);
                ((StringBuilder)object).append(cYh.d("3A"));
                com.github.catvod.spider.merge.p0.f.b(((StringBuilder)object).toString());
            }
            com.github.catvod.spider.merge.p0.f.b(cYh.d("343524713F2E13207B7E782D10276F223B3C533A6F3E253D48332E3532294938353C3B790A252D253E2A0B351E333E3403392F36247A013F33713634473539213B3B09313538383449"));
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
            com.github.catvod.spider.merge.p0.f.c(cYh.d("323E2429273F04242435772A153F233D3237473F223222280234613522280E3E2671213F1523283E397A14312F382323473329343431"), throwable);
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
        {
            object = new StringBuilder();
            ((StringBuilder)object).append(cYh.d("33382471253F16252422233F0370373425290E3F2F71"));
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(cYh.d("473238712E35122261223B3C533A61333E3403392F36773314702F3E237A043F2C21362E0E322D34772D0E242971"));
            ((StringBuilder)object).append(Arrays.asList(e).toString());
            com.github.catvod.spider.merge.p0.f.b(((StringBuilder)object).toString());
            com.github.catvod.spider.merge.p0.f.b(cYh.d("343524713F2E13207B7E782D10276F223B3C533A6F3E253D48332E3532294938353C3B79113533223E35090F2C38243706242239773C08226137222813382423773E022420383B2949"));
            return;
        }
    }
}

