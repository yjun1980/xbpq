/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.impl.StaticLoggerBinder
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013c;
import com.github.catvod.spider.merge.\u0279;
import com.github.catvod.spider.merge.\u029f;
import com.github.catvod.spider.merge.\u068e;
import com.github.catvod.spider.merge.\u0cbd;
import com.github.catvod.spider.merge.\u0eb3;
import com.github.catvod.spider.merge.\u0f41;
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

public final class \u024d {
    static volatile int \u037f;
    static final \u029f \u0528;
    static final \u0eb3 \u0529;
    static boolean \u052a;
    private static final String[] \u052b;
    private static String \u052c;

    static {
        \u0528 = new \u029f();
        \u0529 = new \u0eb3();
        \u052a = \u0279.\u052c(SOY.d("093E37421E591E3725131703363D3611110534333C13391E093F3002171F"));
        \u052b = new String[]{SOY.d("4B7C67"), SOY.d("4B7C66")};
        \u052c = SOY.d("15203659071B1C663B591D1A0A3E7E2500160E3B323A1B101D3723341D191E372358171B1B2122");
    }

    private \u024d() {
    }

    /*
     * Exception decompiling
     */
    private static final void \u037f() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [8 : 39->59)] java.lang.Throwable
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

    private static void \u0528(\u0cbd \u0cbd2, int n2) {
        if (\u0cbd2.\u037f().\u052a()) {
            \u024d.\u0529(n2);
        } else if (!\u0cbd2.\u037f().\u052b()) {
            \u024d.\u052a();
        }
    }

    private static void \u0529(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("3B723F0319151F20715E"));
        stringBuilder.append(n2);
        stringBuilder.append(SOY.d("53723E10541B1535361F1A105A31301A18045A3624041D191D72251E1157133C38021D16163B2B17001E153C71061C160937711E15011F72331311195A3B3F0211051937210211135A333F1254160837"));
        \u0279.\u0529(stringBuilder.toString());
        \u0279.\u0529(SOY.d("143D26561612133C365606120A3E300F11135472051E11041F72300411570927331C11140E7225195403123771101D1B0E37231F1A105A20241A11045A3D3756001F1F7224181012083E281F1A105A3E3E11131E143571050D040E373C58"));
        \u0279.\u0529(SOY.d("29373456151B093D711E00030A687E5903000D7C221A1243107C3E041358193D3513075912263C1A57051F223D170D"));
    }

    private static void \u052a() {
        \u0279.\u0529(SOY.d("2E3A34561218163E3E011D191D72221300571534710501150926380201031F723D1913101F20225619160372391702125A3034131A571B31321307041F36"));
        \u0279.\u0529(SOY.d("1E27231F1A105A263913541E143B251F151B132830021D181472211E15041F7C713A1B101D3B3F1154141B3E3D0554130F20381813570E3A3805"));
        \u0279.\u0529(SOY.d("0A3A300511570D37231354191526711E1B19152034125A57323D26130212087E710501150937200311190E723D191310133C36561716163E225600185A2639130712"));
        \u0279.\u0529(SOY.d("163D361111050972261F181B5A253E041F571B2171181B0517333D1A0D571F2A211317031F367F"));
        \u0279.\u0529(SOY.d("29373456151B093D711E00030A687E5903000D7C221A1243107C3E041358193D3513075912263C1A57040F3022021D030F26343A1B101D3723"));
    }

    static void \u052b(Throwable throwable) {
        \u037f = 2;
        \u0279.\u052a(SOY.d("3C33381A11135A263E561D1909263018001E1B263456273B3C661B5638181D353404321619263E040D"), throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Set<URL> \u052c() {
        LinkedHashSet<URL> linkedHashSet = new LinkedHashSet<URL>();
        try {
            Enumeration<URL> enumeration = \u024d.class.getClassLoader();
            enumeration = enumeration == null ? ClassLoader.getSystemResources(\u052c) : ((ClassLoader)((Object)enumeration)).getResources(\u052c);
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
            return linkedHashSet;
        }
        catch (IOException iOException) {
            \u0279.\u052a(SOY.d("3F20231906571D3725021D191D72231307180F20321307571C203E1B54071B2639"), iOException);
        }
        return linkedHashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void \u052d() {
        \u029f \u029f2 = \u0528;
        synchronized (\u029f2) {
            \u029f2.\u052b();
            Iterator<\u068e> iterator = \u029f2.\u052a().iterator();
            while (iterator.hasNext()) {
                \u068e \u068e2 = iterator.next();
                \u068e2.\u052e(\u024d.\u058f(\u068e2.getName()));
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static \u013c \u052e() {
        int n2;
        if (\u037f == 0) {
            synchronized (\u024d.class) {
                if (\u037f == 0) {
                    \u037f = 1;
                    \u024d.\u0783();
                }
            }
        }
        if ((n2 = \u037f) == 1) {
            return \u0528;
        }
        if (n2 == 2) {
            throw new IllegalStateException(SOY.d("15203658071B1C663B5838181D353404321619263E040D57133C7110151E1637355607031B2634585438083B361F1A161672340E17120A2638191A570D332256001F083D261854323B001D3F31255472021311571B3E2219541F0E26214C5B580D252658071B1C663B581B051D7D32191012097C3902191B59273F050114193722051202161B3F1F00"));
        }
        if (n2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (n2 == 4) {
            return \u0529;
        }
        throw new IllegalStateException(SOY.d("2F3C231315141233331A1157193D3513"));
    }

    public static \u0f41 \u052f(Class<?> object) {
        Object object2;
        \u0f41 \u0f412 = \u024d.\u058f(((Class)object).getName());
        if (\u052a && (object2 = \u0279.\u037f()) != null && \u024d.\u0782(object, object2)) {
            object = \u0f412.getName();
            object2 = ((Class)object2).getName();
            \u0279.\u0529(String.format(SOY.d("3E37251317031F36711A1B101D3723561A161737711B1D04173325151C595A15380011195A3C301B114D5A707405564C5A313E1B04020E3735561A1617376B56565209707F"), object, object2));
            \u0279.\u0529(SOY.d("293734561C030E226B595B000D257F0518114E387F19061055313E121104543A251B1854163D3611110534333C13391E093F3002171F5A343E0454161472340E041B1B3C30021D1814"));
        }
        return \u0f412;
    }

    public static \u0f41 \u058f(String string) {
        return \u024d.\u052e().\u037f(string);
    }

    private static boolean \u0620(Set<URL> set) {
        int n2 = set.size();
        boolean bl = true;
        if (n2 <= 1) {
            bl = false;
        }
        return bl;
    }

    private static boolean \u0780() {
        String string = \u0279.\u052d(SOY.d("103327175A011F3C351906590F203D"));
        if (string == null) {
            return false;
        }
        return string.toLowerCase().contains(SOY.d("1B3C35041B1E1E"));
    }

    private static boolean \u0781(String string) {
        if (string == null) {
            return false;
        }
        if (string.contains(SOY.d("15203659071B1C663B591D1A0A3E7E2500160E3B323A1B101D3723341D191E3723"))) {
            return true;
        }
        return string.contains(SOY.d("15203658071B1C663B581D1A0A3E7F2500160E3B323A1B101D3723341D191E3723"));
    }

    private static boolean \u0782(Class<?> clazz, Class<?> clazz2) {
        return clazz2.isAssignableFrom(clazz) ^ true;
    }

    private static final void \u0783() {
        \u024d.\u037f();
        if (\u037f == 3) {
            \u024d.\u0789();
        }
    }

    private static void \u0784() {
        \u024d.\u052d();
        \u024d.\u0785();
        \u0528.\u0528();
    }

    private static void \u0785() {
        LinkedBlockingQueue<\u0cbd> linkedBlockingQueue = \u0528.\u0529();
        int n2 = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int n3 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (\u0cbd \u0cbd2 : arrayList) {
                \u024d.\u0786(\u0cbd2);
                if (n3 == 0) {
                    \u024d.\u0528(\u0cbd2, n2);
                }
                ++n3;
            }
            arrayList.clear();
        }
        return;
    }

    private static void \u0786(\u0cbd \u0cbd2) {
        if (\u0cbd2 == null) {
            return;
        }
        \u068e \u068e2 = \u0cbd2.\u037f();
        String string = \u068e2.getName();
        if (!\u068e2.\u052c()) {
            if (!\u068e2.\u052b()) {
                if (\u068e2.\u052a()) {
                    \u068e2.\u052d(\u0cbd2);
                } else {
                    \u0279.\u0529(string);
                }
            }
            return;
        }
        throw new IllegalStateException(SOY.d("3E373D1313160E37711A1B101D3723561716143C3E0254151F723F03181B5A332556001F1321710500160E377F"));
    }

    private static void \u0787(Set<URL> object) {
        if (object != null && \u024d.\u0620(object)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(SOY.d("3B312503151B5A303818101E1435711F0757153471020D071F720A"));
            ((StringBuilder)object).append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
            ((StringBuilder)object).append(SOY.d("27"));
            \u0279.\u0529(((StringBuilder)object).toString());
        }
    }

    private static void \u0788(Set<URL> object) {
        if (\u024d.\u0620(object)) {
            \u0279.\u0529(SOY.d("393E300507570A33251E5414153C25171D1909723C03180313223D1354243614653C5415133C351F1A10097C"));
            object = object.iterator();
            while (object.hasNext()) {
                URL uRL = (URL)object.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(SOY.d("3C3D24181057183B3F121D191D723818542C"));
                stringBuilder.append(uRL);
                stringBuilder.append(SOY.d("27"));
                \u0279.\u0529(stringBuilder.toString());
            }
            \u0279.\u0529(SOY.d("293734561C030E226B595B000D257F0518114E387F19061055313E121104543A251B185417273D021D0716370E141D191E3B3F1107571C3D235615195A37290618161433251F1B1954"));
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void \u0789() {
        Object object;
        String string;
        try {
            string = StaticLoggerBinder.REQUESTED_API_VERSION;
            object = \u052b;
            int n2 = ((String[])object).length;
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!string.startsWith(object[i2])) continue;
                bl = true;
            }
            if (bl) return;
        }
        catch (Throwable throwable) {
            \u0279.\u052a(SOY.d("2F3C340E0412192634125407083D331A111A5A3D321501051F3671120105133C36560212082138191A5709333F1F000E5A313913171C"), throwable);
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
        {
            object = new StringBuilder();
            ((StringBuilder)object).append(SOY.d("2E3A345606120B27340500121E7227130604133D3F56"));
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(SOY.d("5A3028560D180F20710518114E3871141D191E3B3F11541E09723F190057193D3C06150313303D13540013263956"));
            ((StringBuilder)object).append(Arrays.asList(\u052b).toString());
            \u0279.\u0529(((StringBuilder)object).toString());
            \u0279.\u0529(SOY.d("293734561C030E226B595B000D257F0518114E387F19061055313E121104543A251B18540C3723051D18140D3C1F071A1B26321E54111520711001050E3A340454131F26301F180454"));
            return;
        }
    }
}

