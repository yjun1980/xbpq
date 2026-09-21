/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;

public class \u08a2 {
    public static void \u037f(String string, String string2) {
        String string3 = SOY.d("4E7C665846");
        boolean bl = string != null && !string3.equals(string) && !\u08a2.\u0528(string3).equals(\u08a2.\u0528(string));
        boolean bl2 = !string3.equals(string2) && !\u08a2.\u0528(string3).equals(\u08a2.\u0528(string2));
        if (bl) {
            System.err.printf(SOY.d("3B1C053A26572E3D3E1A54011F20221F1B195A77225601041F3671101B055A313E1211571D373F1306160E3B3E185413153722561A180E723C1700141272251E11571927230411190E7223031A03133F34560212082138191A575F21"), string, string3);
        }
        if (bl2) {
            System.err.printf(SOY.d("3B1C053A265728273F021D1A1F7227130604133D3F5651045A27221310571C3D23560416082134045414153F211F18160E3B3E185413153722561A180E723C1700141272251E11571927230411190E7223031A03133F34560212082138191A575F21"), string2, string3);
        }
    }

    public static String \u0528(String string) {
        int n2;
        int n3 = string.indexOf(46);
        int n4 = n3 >= 0 ? string.indexOf(46, n3 + 1) : -1;
        int n5 = string.indexOf(45);
        n3 = n2 = string.length();
        if (n4 >= 0) {
            n3 = Math.min(n2, n4);
        }
        n4 = n3;
        if (n5 >= 0) {
            n4 = Math.min(n3, n5);
        }
        return string.substring(0, n4);
    }
}

