/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 */
package com.github.catvod.spider.merge.nz;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.github.catvod.spider.Init;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public final class o {
    public static final int a = 0;

    static {
        Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|flv|avi|mkv|rm|wmv|mpg|m4a|mp3)|http((?!http).)*?video/tos*");
    }

    public static int a(int n2) {
        return (int)TypedValue.applyDimension((int)1, (float)n2, (DisplayMetrics)Init.context().getResources().getDisplayMetrics());
    }

    public static String b(String string) {
        return string.substring(string.lastIndexOf(".") + 1);
    }

    public static String c(double d2) {
        if (d2 <= 0.0) {
            return "";
        }
        if (d2 > 1.099511627776E12) {
            return String.format(Locale.getDefault(), "%.2f%s", d2 /= 1.099511627776E12, "TB");
        }
        if (d2 > 1.073741824E9) {
            return String.format(Locale.getDefault(), "%.2f%s", d2 /= 1.073741824E9, "GB");
        }
        if (d2 > 1048576.0) {
            return String.format(Locale.getDefault(), "%.2f%s", d2 /= 1048576.0, "MB");
        }
        return String.format(Locale.getDefault(), "%.2f%s", d2 /= 1024.0, "KB");
    }

    public static boolean d(String string) {
        boolean bl = string.equals("srt") || string.equals("ass") || string.equals("ssa");
        return bl;
    }

    public static String e(String string) {
        String string2 = string;
        if (string.contains(".")) {
            string2 = string.substring(0, string.lastIndexOf("."));
        }
        return string2;
    }
}

