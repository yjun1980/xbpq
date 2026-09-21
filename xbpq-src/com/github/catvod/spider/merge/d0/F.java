/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.D;
import java.util.HashMap;
import java.util.Map;

public final class F
implements Cloneable {
    private static final Map<String, F> l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;
    private static final String[] q;
    private static final String[] r;
    private String c;
    private String d;
    private boolean e = true;
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;

    static {
        int n2;
        l = new HashMap<String, F>();
        int n3 = 0;
        String string = cYh.d("0F242C3D");
        String string2 = cYh.d("0F352035");
        String object4 = cYh.d("053F2528");
        String string3 = cYh.d("0122203C32290224");
        String string4 = cYh.d("14333338272E");
        String string5 = cYh.d("093F323225331724");
        String string6 = cYh.d("1424383D32");
        String string7 = cYh.d("0A353530");
        String string8 = cYh.d("0B392F3A");
        String string9 = cYh.d("1339353D32");
        String string10 = cYh.d("0122203C32");
        String string11 = cYh.d("093F272336370223");
        String string12 = cYh.d("143522253E3509");
        String string13 = cYh.d("093137");
        String string14 = cYh.d("0623283532");
        String string15 = cYh.d("0F37333E222A");
        String string16 = cYh.d("0F3520353228");
        String string17 = cYh.d("013F2E253228");
        String string18 = cYh.d("17");
        String string19 = cYh.d("0F61");
        String string20 = cYh.d("0F62");
        String string21 = cYh.d("0F63");
        String string22 = cYh.d("0F64");
        String string23 = cYh.d("0F65");
        String string24 = cYh.d("0F66");
        String string25 = cYh.d("123C");
        String string26 = cYh.d("083C");
        String string27 = cYh.d("172224");
        String string28 = cYh.d("033937");
        String string29 = cYh.d("053C2E323C2B123F3534");
        String string30 = cYh.d("0F22");
        String string31 = cYh.d("06342523322914");
        String string32 = cYh.d("01392624253F");
        String string33 = cYh.d("01392632362A13392E3F");
        String string34 = cYh.d("013F333C");
        String string35 = cYh.d("0139243D33290224");
        String string36 = cYh.d("0E3E32");
        String string37 = cYh.d("03352D");
        String string38 = cYh.d("033C");
        String string39 = cYh.d("0324");
        String string40 = cYh.d("0334");
        String string41 = cYh.d("0B39");
        String string42 = cYh.d("1331233D32");
        String string43 = cYh.d("043131253E3509");
        String string44 = cYh.d("1338243033");
        String string45 = cYh.d("13362E3E23");
        String string46 = cYh.d("13322E352E");
        String string47 = cYh.d("043F2D3625351220");
        String string48 = cYh.d("043F2D");
        String string49 = cYh.d("1322");
        String string50 = cYh.d("1338");
        String string51 = cYh.d("1334");
        String string52 = cYh.d("1139253438");
        String string53 = cYh.d("0625253838");
        String string54 = cYh.d("04312F273629");
        String string55 = cYh.d("033535303E3614");
        String string56 = cYh.d("0A352F24");
        String string57 = cYh.d("173C2038392E022835");
        String string58 = cYh.d("13352C213B3B1335");
        String string59 = cYh.d("06223538343602");
        String string60 = cYh.d("0A31283F");
        String string61 = cYh.d("142626");
        String string62 = cYh.d("0A313539");
        String string63 = cYh.d("04352F253228");
        String string64 = cYh.d("08322B34342E");
        String string65 = cYh.d("05313234");
        String string66 = cYh.d("013F2F25");
        String string67 = cYh.d("1324");
        String string68 = cYh.d("0E");
        String string69 = cYh.d("05");
        String string70 = cYh.d("12");
        String string71 = cYh.d("053926");
        String string72 = cYh.d("143D203D3B");
        String string73 = cYh.d("023D");
        String string74 = cYh.d("1424333E393D");
        String string75 = cYh.d("03362F");
        String string76 = cYh.d("043F2534");
        String string77 = cYh.d("14312C21");
        String string78 = cYh.d("0C3225");
        String string79 = cYh.d("113133");
        String string80 = cYh.d("04393534");
        String string81 = cYh.d("06322323");
        String string82 = cYh.d("13392C34");
        String string83 = cYh.d("0633333E39230A");
        String string84 = cYh.d("0A31333A");
        String string85 = cYh.d("15252328");
        String string86 = cYh.d("1524");
        String string87 = cYh.d("1520");
        String string88 = cYh.d("06");
        String string89 = cYh.d("0E3D26");
        String string90 = cYh.d("0522");
        String string91 = cYh.d("103233");
        Object object = cYh.d("0A3131");
        String string92 = cYh.d("16");
        String string93 = cYh.d("142523");
        String string94 = cYh.d("142531");
        String string95 = cYh.d("05342E");
        String string96 = cYh.d("0E3633303A3F");
        String string97 = cYh.d("023D233433");
        String string98 = cYh.d("1420203F");
        String string99 = cYh.d("0E3E312423");
        String string100 = cYh.d("14352D34342E");
        String string101 = cYh.d("1335392536280231");
        String string102 = cYh.d("0B3123343B");
        String string103 = cYh.d("052535253834");
        String string104 = cYh.d("0820353625351220");
        String string105 = cYh.d("082035383834");
        String string106 = cYh.d("0B352634393E");
        String string107 = cYh.d("033135303B331424");
        String string108 = cYh.d("0C3538363234");
        String string109 = cYh.d("08253521222E");
        String string110 = cYh.d("17222E36253F1423");
        String string111 = cYh.d("0A35353425");
        String string112 = cYh.d("06222430");
        String string113 = cYh.d("173133303A");
        String string114 = cYh.d("143F3423343F");
        String string115 = cYh.d("132220323C");
        m = new String[]{string64, string65, string66, string67, string68, string69, string70, string71, string72, string73, string74, string75, string76, string77, string78, string79, string80, string81, string82, string83, string84, string85, string86, string87, string88, string89, string90, string91, object, string92, string93, string94, string95, string96, string97, string98, string99, string100, string101, string102, string103, string104, string105, string106, string107, string108, string109, string110, string111, string112, string113, string114, string115, cYh.d("14252C3C36281E"), cYh.d("043F2C3C363403"), cYh.d("03353738343F"), string112, cYh.d("0531323431350924"), cYh.d("0537323E223403"), cYh.d("0A352F243E2E023D"), string113, string114, string115, cYh.d("03313530"), cYh.d("053428"), cYh.d("14")};
        n = new String[]{string7, string8, cYh.d("05313234"), string10, cYh.d("0E3D26"), cYh.d("0522"), cYh.d("103233"), cYh.d("023D233433"), cYh.d("0F22"), string99, string108, cYh.d("043F2D"), cYh.d("043F2C3C363403"), cYh.d("03353738343F"), string112, cYh.d("0531323431350924"), cYh.d("0537323E223403"), cYh.d("0A352F243E2E023D"), string113, string114, string115};
        o = new String[]{string9, cYh.d("06"), string18, string19, cYh.d("0F62"), cYh.d("0F63"), cYh.d("0F64"), cYh.d("0F65"), cYh.d("0F66"), string27, cYh.d("06342523322914"), cYh.d("0B39"), cYh.d("1338"), cYh.d("1334"), string4, string6, cYh.d("0E3E32"), cYh.d("03352D"), cYh.d("14")};
        p = new String[]{string27, cYh.d("173C2038392E022835"), string9, string101};
        q = new String[]{cYh.d("052535253834"), cYh.d("0139243D33290224"), string99, string108, string64, cYh.d("08253521222E"), string100, string101};
        r = new String[]{string99, string108, string64, string100, string101};
        for (n2 = 0; n2 < 64; ++n2) {
            object = new F((new String[]{string, string2, object4, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string56, string57, string58, string59, string60, string61, string62, string63})[n2]);
            ((HashMap)l).put(((F)object).c, (F)object);
        }
        String[] stringArray = m;
        int n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            F f2 = new F(stringArray[n2]);
            f2.e = false;
            f2.f = false;
            ((HashMap)l).put(f2.c, f2);
        }
        for (String string116 : n) {
            F f3 = (F)((HashMap)l).get(string116);
            a.k(f3);
            f3.g = true;
        }
        for (String string117 : o) {
            F f4 = (F)((HashMap)l).get(string117);
            a.k(f4);
            f4.f = false;
        }
        for (String string118 : p) {
            F f5 = (F)((HashMap)l).get(string118);
            a.k(f5);
            f5.i = true;
        }
        for (String string119 : q) {
            F f6 = (F)((HashMap)l).get(string119);
            a.k(f6);
            f6.j = true;
        }
        String[] stringArray2 = r;
        n4 = stringArray2.length;
        for (n2 = n3; n2 < n4; ++n2) {
            String string120 = stringArray2[n2];
            F f7 = (F)((HashMap)l).get(string120);
            a.k(f7);
            f7.k = true;
        }
    }

    private F(String string) {
        this.c = string;
        this.d = com.github.catvod.spider.merge.x.a.c(string);
    }

    public static F l(String string, D d2) {
        a.k(string);
        Map<String, F> map = l;
        Object object = (F)((HashMap)map).get(string);
        F f2 = object;
        if (object == null) {
            string = d2.c(string);
            a.i(string);
            object = com.github.catvod.spider.merge.x.a.c(string);
            f2 = (F)((HashMap)map).get(object);
            if (f2 == null) {
                f2 = new F(string);
                f2.e = false;
            } else if (d2.e() && !string.equals(object)) {
                try {
                    f2 = (F)super.clone();
                    f2.c = string;
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    throw new RuntimeException(cloneNotSupportedException);
                }
            }
        }
        return f2;
    }

    public final boolean a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    protected final Object clone() {
        try {
            F f2 = (F)super.clone();
            return f2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public final boolean d() {
        return this.g;
    }

    public final boolean e() {
        return this.j;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof F)) {
            return false;
        }
        object = (F)object;
        if (!this.c.equals(((F)object).c)) {
            return false;
        }
        if (this.g != ((F)object).g) {
            return false;
        }
        if (this.f != ((F)object).f) {
            return false;
        }
        if (this.e != ((F)object).e) {
            return false;
        }
        if (this.i != ((F)object).i) {
            return false;
        }
        if (this.h != ((F)object).h) {
            return false;
        }
        if (this.j != ((F)object).j) {
            return false;
        }
        if (this.k != ((F)object).k) {
            bl = false;
        }
        return bl;
    }

    public final boolean f() {
        return this.e ^ true;
    }

    public final boolean g() {
        return ((HashMap)l).containsKey(this.c);
    }

    public final boolean h() {
        boolean bl = this.g || this.h;
        return bl;
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j) * 31 + this.k;
    }

    public final String i() {
        return this.d;
    }

    public final boolean j() {
        return this.i;
    }

    final F k() {
        this.h = true;
        return this;
    }

    public final String toString() {
        return this.c;
    }
}

