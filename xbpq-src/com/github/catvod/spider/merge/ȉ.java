/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u06e6;
import com.github.catvod.spider.merge.\u097d;
import java.util.HashMap;
import java.util.Map;

public class \u0209
implements Cloneable {
    private static final Map<String, \u0209> \u037f;
    private static final String[] \u0528;
    private static final String[] \u0529;
    private static final String[] \u052a;
    private static final String[] \u052b;
    private static final String[] \u052c;
    private static final String[] \u052d;
    private static final String[] \u052e;
    private String \u052f;
    private String \u058f;
    private boolean \u0620 = true;
    private boolean \u0780 = true;
    private boolean \u0781 = false;
    private boolean \u0782 = false;
    private boolean \u0783 = false;
    private boolean \u0784 = false;
    private boolean \u0785 = false;

    static {
        int n2;
        \u037f = new HashMap<String, \u0209>();
        String[] stringArray = new String[64];
        String object2 = SOY.d("12263C1A");
        int n3 = 0;
        stringArray[0] = object2;
        stringArray[1] = SOY.d("12373012");
        stringArray[2] = SOY.d("183D350F");
        stringArray[3] = SOY.d("1C20301B11041F26");
        stringArray[4] = SOY.d("0931231F0403");
        stringArray[5] = SOY.d("143D2215061E0A26");
        stringArray[6] = SOY.d("0926281A11");
        stringArray[7] = SOY.d("17372517");
        stringArray[8] = SOY.d("163B3F1D");
        stringArray[9] = SOY.d("0E3B251A11");
        stringArray[10] = SOY.d("1C20301B11");
        stringArray[11] = SOY.d("143D3704151A1F21");
        stringArray[12] = SOY.d("093732021D1814");
        stringArray[13] = SOY.d("143327");
        stringArray[14] = SOY.d("1B21381211");
        stringArray[15] = SOY.d("123523190107");
        stringArray[16] = SOY.d("123730121105");
        stringArray[17] = SOY.d("1C3D3E021105");
        stringArray[18] = SOY.d("0A");
        stringArray[19] = SOY.d("1263");
        stringArray[20] = SOY.d("1260");
        stringArray[21] = SOY.d("1261");
        stringArray[22] = SOY.d("1266");
        stringArray[23] = SOY.d("1267");
        stringArray[24] = SOY.d("1264");
        stringArray[25] = SOY.d("0F3E");
        stringArray[26] = SOY.d("153E");
        stringArray[27] = SOY.d("0A2034");
        stringArray[28] = SOY.d("1E3B27");
        stringArray[29] = SOY.d("183E3E151F060F3D2513");
        stringArray[30] = SOY.d("1220");
        stringArray[31] = SOY.d("1B363504110409");
        stringArray[32] = SOY.d("1C3B36030612");
        stringArray[33] = SOY.d("1C3B361515070E3B3E18");
        stringArray[34] = SOY.d("1C3D231B");
        stringArray[35] = SOY.d("1C3B341A10041F26");
        stringArray[36] = SOY.d("133C22");
        stringArray[37] = SOY.d("1E373D");
        stringArray[38] = SOY.d("1E3E");
        stringArray[39] = SOY.d("1E26");
        stringArray[40] = SOY.d("1E36");
        stringArray[41] = SOY.d("163B");
        stringArray[42] = SOY.d("0E33331A11");
        stringArray[43] = SOY.d("193321021D1814");
        stringArray[44] = SOY.d("0E3A341710");
        stringArray[45] = SOY.d("0E343E1900");
        stringArray[46] = SOY.d("0E303E120D");
        stringArray[47] = SOY.d("193D3D1106180F22");
        stringArray[48] = SOY.d("193D3D");
        stringArray[49] = SOY.d("0E20");
        stringArray[50] = SOY.d("0E3A");
        stringArray[51] = SOY.d("0E36");
        stringArray[52] = SOY.d("0C3B35131B");
        stringArray[53] = SOY.d("1B27351F1B");
        stringArray[54] = SOY.d("19333F001504");
        stringArray[55] = SOY.d("1E3725171D1B09");
        stringArray[56] = SOY.d("17373F03");
        stringArray[57] = SOY.d("0A3E301F1A031F2A25");
        stringArray[58] = SOY.d("0E373C0618160E37");
        stringArray[59] = SOY.d("1B20251F171B1F");
        stringArray[60] = SOY.d("17333818");
        stringArray[61] = SOY.d("092436");
        stringArray[62] = SOY.d("1733251E");
        stringArray[63] = SOY.d("19373F021105");
        \u0528 = stringArray;
        String string = SOY.d("15303B131703");
        String string2 = SOY.d("18332213");
        String string3 = SOY.d("1C3D3F02");
        String string4 = SOY.d("0E26");
        String string5 = SOY.d("13");
        String string6 = SOY.d("18");
        String string7 = SOY.d("0F");
        String string8 = SOY.d("183B36");
        String string9 = SOY.d("093F301A18");
        String string10 = SOY.d("1F3F");
        String string11 = SOY.d("092623191A10");
        String string12 = SOY.d("1E343F");
        String string13 = SOY.d("193D3513");
        String string14 = SOY.d("09333C06");
        String string15 = SOY.d("113035");
        String string16 = SOY.d("0C3323");
        String string17 = SOY.d("193B2513");
        String string18 = SOY.d("1B303304");
        String string19 = SOY.d("0E3B3C13");
        String string20 = SOY.d("1B3123191A0E17");
        String string21 = SOY.d("1733231D");
        String string22 = SOY.d("0827330F");
        String string23 = SOY.d("0826");
        String string24 = SOY.d("0822");
        String string25 = SOY.d("1B");
        String string26 = SOY.d("133F36");
        String string27 = SOY.d("1820");
        String string28 = SOY.d("0D3023");
        String string29 = SOY.d("173321");
        String string30 = SOY.d("0B");
        String string31 = SOY.d("092733");
        String string32 = SOY.d("092721");
        String string33 = SOY.d("18363E");
        String string34 = SOY.d("133423171912");
        String string35 = SOY.d("1F3F331310");
        String string36 = SOY.d("09223018");
        String string37 = SOY.d("133C210300");
        String string38 = SOY.d("09373D131703");
        String string39 = SOY.d("0E37290215051F33");
        \u0529 = new String[]{string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, SOY.d("1633331318"), SOY.d("182725021B19"), SOY.d("1522251106180F22"), SOY.d("1522251F1B19"), SOY.d("163736131A13"), SOY.d("1E332517181E0926"), SOY.d("113728111119"), SOY.d("152725060103"), SOY.d("0A203E1106120921"), SOY.d("1737251306"), SOY.d("1B203417"), SOY.d("0A33231719"), SOY.d("093D24041712"), SOY.d("0E2030151F"), SOY.d("09273C1B150503"), SOY.d("193D3C1B15191E"), SOY.d("1E37271F1712"), SOY.d("1B203417"), SOY.d("1833221312181426"), SOY.d("1835221901191E"), SOY.d("17373F031D031F3F"), SOY.d("0A33231719"), SOY.d("093D24041712"), SOY.d("0E2030151F"), SOY.d("1E332517"), SOY.d("183638"), SOY.d("09")};
        \u052a = new String[]{SOY.d("17372517"), SOY.d("163B3F1D"), SOY.d("18332213"), SOY.d("1C20301B11"), SOY.d("133F36"), SOY.d("1820"), SOY.d("0D3023"), SOY.d("1F3F331310"), SOY.d("1220"), string37, SOY.d("113728111119"), SOY.d("193D3D"), SOY.d("193D3C1B15191E"), SOY.d("1E37271F1712"), SOY.d("1B203417"), SOY.d("1833221312181426"), SOY.d("1835221901191E"), SOY.d("17373F031D031F3F"), SOY.d("0A33231719"), SOY.d("093D24041712"), SOY.d("0E2030151F")};
        \u052b = new String[]{SOY.d("0E3B251A11"), SOY.d("1B"), SOY.d("0A"), SOY.d("1263"), SOY.d("1260"), SOY.d("1261"), SOY.d("1266"), SOY.d("1267"), SOY.d("1264"), SOY.d("0A2034"), SOY.d("1B363504110409"), SOY.d("163B"), SOY.d("0E3A"), SOY.d("0E36"), SOY.d("0931231F0403"), SOY.d("0926281A11"), SOY.d("133C22"), SOY.d("1E373D"), SOY.d("09")};
        \u052c = new String[]{SOY.d("0A2034"), SOY.d("0A3E301F1A031F2A25"), SOY.d("0E3B251A11"), string39};
        \u052d = new String[]{SOY.d("182725021B19"), SOY.d("1C3B341A10041F26"), string37, SOY.d("113728111119"), SOY.d("15303B131703"), SOY.d("152725060103"), SOY.d("09373D131703"), string39};
        \u052e = new String[]{string37, SOY.d("113728111119"), SOY.d("15303B131703"), SOY.d("09373D131703"), string39};
        int n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            \u0209.\u0780(new \u0209(stringArray[n2]));
        }
        stringArray = \u0529;
        n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            \u0209 \u02092 = new \u0209(stringArray[n2]);
            \u02092.\u0620 = false;
            \u02092.\u0780 = false;
            \u0209.\u0780(\u02092);
        }
        for (String string40 : \u052a) {
            \u0209 \u02093 = \u037f.get(string40);
            \u01c3.\u052f(\u02093);
            \u02093.\u0781 = true;
        }
        for (String string41 : \u052b) {
            \u0209 \u02094 = \u037f.get(string41);
            \u01c3.\u052f(\u02094);
            \u02094.\u0780 = false;
        }
        for (String string42 : \u052c) {
            \u0209 \u02095 = \u037f.get(string42);
            \u01c3.\u052f(\u02095);
            \u02095.\u0783 = true;
        }
        for (String string43 : \u052d) {
            \u0209 \u02096 = \u037f.get(string43);
            \u01c3.\u052f(\u02096);
            \u02096.\u0784 = true;
        }
        stringArray = \u052e;
        n4 = stringArray.length;
        for (n2 = n3; n2 < n4; ++n2) {
            String string44 = stringArray[n2];
            \u0209 \u02097 = \u037f.get(string44);
            \u01c3.\u052f(\u02097);
            \u02097.\u0785 = true;
        }
    }

    private \u0209(String string) {
        this.\u052f = string;
        this.\u058f = \u06e6.\u037f(string);
    }

    private static void \u0780(\u0209 \u02092) {
        \u037f.put(\u02092.\u052f, \u02092);
    }

    public static \u0209 \u0782(String string) {
        return \u0209.\u0783(string, \u097d.\u0528);
    }

    public static \u0209 \u0783(String string, \u097d \u097d2) {
        \u0209 \u02092;
        block0: {
            Object object;
            block1: {
                \u01c3.\u052f(string);
                Map<String, \u0209> map = \u037f;
                object = map.get(string);
                \u02092 = object;
                if (object != null) break block0;
                string = \u097d2.\u0529(string);
                \u01c3.\u052d(string);
                object = \u06e6.\u037f(string);
                \u02092 = map.get(object);
                if (\u02092 != null) break block1;
                \u02092 = new \u0209(string);
                \u02092.\u0620 = false;
                break block0;
            }
            if (!\u097d2.\u052b() || string.equals(object)) break block0;
            \u02092 = \u02092.\u037f();
            \u02092.\u052f = string;
        }
        return \u02092;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof \u0209)) {
            return false;
        }
        object = (\u0209)object;
        if (!this.\u052f.equals(((\u0209)object).\u052f)) {
            return false;
        }
        if (this.\u0781 != ((\u0209)object).\u0781) {
            return false;
        }
        if (this.\u0780 != ((\u0209)object).\u0780) {
            return false;
        }
        if (this.\u0620 != ((\u0209)object).\u0620) {
            return false;
        }
        if (this.\u0783 != ((\u0209)object).\u0783) {
            return false;
        }
        if (this.\u0782 != ((\u0209)object).\u0782) {
            return false;
        }
        if (this.\u0784 != ((\u0209)object).\u0784) {
            return false;
        }
        if (this.\u0785 != ((\u0209)object).\u0785) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return ((((((this.\u052f.hashCode() * 31 + this.\u0620) * 31 + this.\u0780) * 31 + this.\u0781) * 31 + this.\u0782) * 31 + this.\u0783) * 31 + this.\u0784) * 31 + this.\u0785;
    }

    public String toString() {
        return this.\u052f;
    }

    protected \u0209 \u037f() {
        try {
            \u0209 \u02092 = (\u0209)super.clone();
            return \u02092;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public boolean \u0528() {
        return this.\u0780;
    }

    public String \u0529() {
        return this.\u052f;
    }

    public boolean \u052a() {
        return this.\u0620;
    }

    public boolean \u052b() {
        return this.\u0781;
    }

    public boolean \u052c() {
        return this.\u0784;
    }

    public boolean \u052d() {
        return this.\u0620 ^ true;
    }

    public boolean \u052e() {
        return \u037f.containsKey(this.\u052f);
    }

    public boolean \u052f() {
        boolean bl = this.\u0781 || this.\u0782;
        return bl;
    }

    public String \u058f() {
        return this.\u058f;
    }

    public boolean \u0620() {
        return this.\u0783;
    }

    \u0209 \u0781() {
        this.\u0782 = true;
        return this;
    }
}

