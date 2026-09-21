/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class \u0787 {
    public static final List<String> \u037f = Arrays.asList(SOY.d("172265"), SOY.d("173927"), SOY.d("0D3F27"), SOY.d("1C3E27"), SOY.d("1B2438"), SOY.d("13213E"), SOY.d("172236"), SOY.d("0E21"), SOY.d("172262"), SOY.d("1B3332"), SOY.d("1C3E3015"), SOY.d("176630"), SOY.d("1B2234"), SOY.d("153536"));
    public static final List<String> \u0528 = Arrays.asList(SOY.d("092025"), SOY.d("1B2122"), SOY.d("092130"), SOY.d("0C2625"));

    public static String \u037f(String string) {
        String string2 = SOY.d("54");
        String string3 = string;
        if (string.contains(string2)) {
            string3 = string.substring(string.lastIndexOf(string2) + 1);
        }
        return string3;
    }

    public static String \u0528(double d2) {
        if (d2 <= 0.0) {
            return "";
        }
        String string = SOY.d("5F7C63105104");
        if (d2 > 1.099511627776E12) {
            return String.format(Locale.getDefault(), string, d2 /= 1.099511627776E12, SOY.d("2E10"));
        }
        if (d2 > 1.073741824E9) {
            return String.format(Locale.getDefault(), string, d2 /= 1.073741824E9, SOY.d("3D10"));
        }
        if (d2 > 1048576.0) {
            return String.format(Locale.getDefault(), string, d2 /= 1048576.0, SOY.d("3710"));
        }
        return String.format(Locale.getDefault(), string, d2 /= 1024.0, SOY.d("3110"));
    }

    public static boolean \u0529(String string) {
        return \u037f.contains(\u0787.\u037f(string));
    }

    public static boolean \u052a(String string) {
        return \u0528.contains(string);
    }
}

