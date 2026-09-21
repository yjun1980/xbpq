package com.github.catvod.spider.merge.j;

import android.util.TypedValue;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.cYh;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class o {
    public static final /* synthetic */ int a = 0;

    static {
        Arrays.asList(cYh.d("0A2075"), cYh.d("0A3B37"), cYh.d("103D37"), cYh.d("013C37"), cYh.d("062628"), cYh.d("0A2072"), cYh.d("063122"), cYh.d("013C2032"), cYh.d("0A6420"), cYh.d("062024"), cYh.d("083726"));
        Pattern.compile(cYh.d("0F2435217F7258712925232A4E7E682A66684B2D7E0D79720A6334692B3717643D373B2C1B3137382B370C263D233A26103D372D3A2A002C2C6536260A2072780B65497A3D39232E1778696E76321324317879731C61737D2A0649782C6222621B3D31652B3C0B263D3021331B3D2A272B280A2C363C21260A20262D3A6E062C2C2164731B38352527724F6F6039232E17796F787D65113925343875133F327B"));
    }

    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, i, Init.context().getResources().getDisplayMetrics());
    }

    public static String b(String str) {
        return str.substring(str.lastIndexOf(cYh.d("49")) + 1);
    }

    public static String c(double d) {
        if (d <= 0.0d) {
            return "";
        }
        String d2 = cYh.d("427E73377229");
        return d > 1.099511627776E12d ? String.format(Locale.getDefault(), d2, Double.valueOf(d / 1.099511627776E12d), cYh.d("3312")) : d > 1.073741824E9d ? String.format(Locale.getDefault(), d2, Double.valueOf(d / 1.073741824E9d), cYh.d("2012")) : d > 1048576.0d ? String.format(Locale.getDefault(), d2, Double.valueOf(d / 1048576.0d), cYh.d("2A12")) : String.format(Locale.getDefault(), d2, Double.valueOf(d / 1024.0d), cYh.d("2C12"));
    }

    public static boolean d(String str) {
        return str.equals(cYh.d("142235")) || str.equals(cYh.d("062332")) || str.equals(cYh.d("142320"));
    }

    public static String e(String str) {
        String d = cYh.d("49");
        return str.contains(d) ? str.substring(0, str.lastIndexOf(d)) : str;
    }
}
