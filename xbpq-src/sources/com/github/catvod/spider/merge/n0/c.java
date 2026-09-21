package com.github.catvod.spider.merge.n0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
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

/* loaded from: classes.dex */
public final class c {
    static volatile int a;
    static final d b = new d();
    static final com.github.catvod.spider.merge.W.a c = new com.github.catvod.spider.merge.W.a();
    static boolean d;
    private static final String[] e;
    private static String f;

    static {
        String str = null;
        try {
            str = System.getProperty(cYh.d("143C27653D7403353534342E2B3F2636322829312C341A33143D20253432"));
        } catch (SecurityException unused) {
        }
        d = str == null ? false : str.equalsIgnoreCase(cYh.d("13223434"));
        e = new String[]{cYh.d("567E77"), cYh.d("567E76")};
        f = cYh.d("0822267E243601642B7E3E37173C6E02233B1339221D383D003533133E340335337F3436062332");
    }

    private c() {
    }

    private static final void a() {
        String d2 = cYh.d("2131283D323E47242E713E341424203F233306242471041621640B711B3500372423113B04242E232E");
        Set<URL> set = null;
        try {
            try {
                try {
                    try {
                        if (!f()) {
                            set = b();
                            i(set);
                        }
                        StaticLoggerBinder.getSingleton();
                        a = 3;
                        h(set);
                    } catch (NoSuchMethodError e2) {
                        String message = e2.getMessage();
                        if (message != null && message.contains(cYh.d("0822267F243601642B7F3E37173C6F02233B1339221D383D003533133E340335337F303F1303283F303602242E3F7F73"))) {
                            a = 2;
                            f.b(cYh.d("143C27653D77062028716674517E39717F3515702D30233F15796138247A0E3E223E3A2A062428333B3F472728253F7A1338282277380E3E2538393D49"));
                            f.b(cYh.d("3E3F342377380E3E2538393D47393271213F1523283E397A567E747F627A0822613436280B39242379"));
                            f.b(cYh.d("32202623363E0270383E22284732283F333309376125387A113533223E350970707F61741F7E"));
                        }
                        throw e2;
                    }
                } catch (Exception e3) {
                    a = 2;
                    f.c(d2, e3);
                    throw new IllegalStateException(cYh.d("323E2429273F0424243577330939353836360E2A20253E35097027303E36122224"), e3);
                }
            } catch (NoClassDefFoundError e4) {
                String message2 = e4.getMessage();
                boolean z = false;
                if (message2 != null) {
                    if (!message2.contains(cYh.d("0822267E243601642B7E3E37173C6E02233B1339221D383D003533133E34033533"))) {
                        if (message2.contains(cYh.d("0822267F243601642B7F3E37173C6F02233B1339221D383D003533133E34033533"))) {
                        }
                    }
                    z = true;
                }
                if (z) {
                    a = 4;
                    f.b(cYh.d("2131283D323E47242E713B35063461323B3B142361733828007E323D316E0D7E283C2736490335302333041C2E36303F1512283F333F15726F"));
                    f.b(cYh.d("23352730223613392F36772E08702F3E7A35173533302333083E617919153779613D383D003533713E37173C243C3234133135383834"));
                    f.b(cYh.d("343524713F2E13207B7E782D10276F223B3C533A6F3E253D48332E3532294938353C3B79342420253E392B3F2636322825392F35322847362E23773C1222353932284734242536330B236F"));
                } else {
                    a = 2;
                    f.c(d2, e4);
                    throw e4;
                }
            }
        } finally {
            g();
        }
    }

    static Set<URL> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f) : classLoader.getResources(f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            f.c(cYh.d("2222333E257A003535253E3400703334243512222234247A01222E3C772A062429"), e2);
        }
        return linkedHashSet;
    }

    public static a c() {
        if (a == 0) {
            synchronized (c.class) {
                if (a == 0) {
                    a = 1;
                    a();
                    if (a == 3) {
                        j();
                    }
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException(cYh.d("0822267F243601642B7F1B3500372423113B04242E232E7A0E3E613736330B352571242E0624247F771515392638393B0B702429343F1724283E397A103132712332153F363F771F26020D18120849701234327A063C323E77321324316B78751027367F243601642B7F3828007F223E333F147E29253A3644252F22223904353222312F0B192F3823"));
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException(cYh.d("323E333436390F31233D327A043F2534"));
    }

    public static b d(Class<?> cls) {
        Class<?> a2;
        b a3 = c().a(cls.getName());
        if (d && (a2 = f.a()) != null && (!a2.isAssignableFrom(cls))) {
            f.b(String.format(cYh.d("23353534342E0234613D383D00353371393B0A35613C3E290A3135323F74471728273234473E203C326047726422756147332E3C272F13352571393B0A357B71757F14726F"), a3.b(), a2.getName()));
            f.b(cYh.d("343524713F2E13207B7E782D10276F223B3C533A6F3E253D48332E3532294938353C3B790B3F2636322829312C341A33143D2025343247362E23773B097024292736063E20253E3509"));
        }
        return a3;
    }

    public static b e(String str) {
        return c().a(str);
    }

    private static boolean f() {
        String str = null;
        try {
            str = System.getProperty(cYh.d("0D313730792C023E253E257412222D"));
        } catch (SecurityException unused) {
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains(cYh.d("063E2523383303"));
    }

    private static void g() {
        d dVar = b;
        synchronized (dVar) {
            dVar.e();
            Iterator it = ((ArrayList) dVar.d()).iterator();
            while (it.hasNext()) {
                com.github.catvod.spider.merge.p0.c cVar = (com.github.catvod.spider.merge.p0.c) it.next();
                cVar.g(e(cVar.b()));
            }
        }
        LinkedBlockingQueue<com.github.catvod.spider.merge.o0.c> c2 = b.c();
        int size = c2.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (c2.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.github.catvod.spider.merge.o0.c cVar2 = (com.github.catvod.spider.merge.o0.c) it2.next();
                if (cVar2 != null) {
                    com.github.catvod.spider.merge.p0.c a2 = cVar2.a();
                    String b2 = a2.b();
                    if (a2.e()) {
                        throw new IllegalStateException(cYh.d("23352D34303B1335613D383D00353371343B093E2E25773802702F243B364731357123320E236122233B13356F"));
                    }
                    if (!a2.d()) {
                        if (a2.c()) {
                            a2.f(cVar2);
                        } else {
                            f.b(b2);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (cVar2.a().c()) {
                        f.b(cYh.d("26702F243A3802226179") + size + cYh.d("4E702E37773608372638393D4733203D3B29473434233E3400703539327A0E3E28253E3B0B393B302333083E61213F3B14356139362C02702334323447392F25322804353125323E47312F35773B1535"));
                        f.b(cYh.d("093F3671353F0E3E2671253F173C2028323E49701539322902702023327A1425233B32391370353E772E0F3561373E3613353338393D4722343D3229473F277123320270343F333F153C3838393D473C2E363033093761222E2913352C7F"));
                        f.b(cYh.d("343524713636143F6139232E176A6E7E202D107E323D316E0D7E2E233075043F253424740F242C3D742802202D302E"));
                    } else if (!cVar2.a().d()) {
                        f.b(cYh.d("3338247131350B3C2E263E3400703234237A08366122223814242825222E02702D3E303D022232713A3B1E702930213F47322434397A0633223424290234"));
                        f.b(cYh.d("03253338393D4724293477330939353836360E2A20253E35097031393629027E611D383D00392F367739063C2D22773E1222283F307A13382822"));
                        f.b(cYh.d("17382022327A10353334773408246139383408222435797A2F3F3634213F157C6122223814353024323413702D3E303D0E3E2671343B0B3C3271233547242934243F"));
                        f.b(cYh.d("0B3F26363228147036383B3647272E233C7A0623613F38280A312D3D2E7A02283134342E02346F"));
                        f.b(cYh.d("343524713636143F6139232E176A6E7E202D107E323D316E0D7E2E233075043F253424740F242C3D7429123232253E2E1224241D383D003533"));
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        b.b();
    }

    private static void h(Set<URL> set) {
        if (set != null) {
            if (set.size() > 1) {
                StringBuilder b2 = C0059d.b(cYh.d("2633352436364732283F333309376138247A083661252E2A02701A"));
                b2.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                b2.append(cYh.d("3A"));
                f.b(b2.toString());
            }
        }
    }

    private static void i(Set<URL> set) {
        if (set.size() > 1) {
            f.b(cYh.d("243C2022247A173135397739083E35303E3414702C243B2E0E202D3477092B16751B77380E3E2538393D147E"));
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                f.b(cYh.d("213F343F337A05392F353E340070283F7701") + it.next() + cYh.d("3A"));
            }
            f.b(cYh.d("343524713F2E13207B7E782D10276F223B3C533A6F3E253D48332E3532294938353C3B790A252D253E2A0B351E333E3403392F36247A013F33713634473539213B3B09313538383449"));
        }
    }

    private static final void j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            f.b(cYh.d("33382471253F16252422233F0370373425290E3F2F71") + str + cYh.d("473238712E35122261223B3C533A61333E3403392F36773314702F3E237A043F2C21362E0E322D34772D0E242971") + Arrays.asList(e).toString());
            f.b(cYh.d("343524713F2E13207B7E782D10276F223B3C533A6F3E253D48332E3532294938353C3B79113533223E35090F2C38243706242239773C08226137222813382423773E022420383B2949"));
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            f.c(cYh.d("323E2429273F04242435772A153F233D3237473F223222280234613522280E3E2671213F1523283E397A14312F382323473329343431"), th);
        }
    }
}
