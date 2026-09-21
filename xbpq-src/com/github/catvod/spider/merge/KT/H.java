/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 */
package com.github.catvod.spider.merge.KT;

import android.net.Uri;
import android.util.Base64;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class H {
    public static final Pattern a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");
    public static final List b;
    public static final List c;
    public static HashMap d;

    static {
        Pattern.compile("(magnet|thunder|ed2k):.*");
        b = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
        c = Arrays.asList("srt", "ass", "ssa", "vtt");
    }

    public static String a(String object) {
        try {
            Object object2 = MessageDigest.getInstance("MD5").digest(((String)object).getBytes("UTF-8"));
            object = new BigInteger(1, (byte[])object2);
            object2 = new StringBuilder;
            ((StringBuilder)object2)(((BigInteger)object).toString(16));
            while (((StringBuilder)object2).length() < 32) {
                ((StringBuilder)object2).insert(0, "0");
            }
            object = ((StringBuilder)object2).toString().toLowerCase();
        }
        catch (Exception exception) {
            object = "";
        }
        return object;
    }

    public static String b(String string) {
        return new String(Base64.decode((String)string, (int)2), Charset.defaultCharset());
    }

    public static String c(byte[] byArray) {
        return new String(Base64.encode((byte[])byArray, (int)2), Charset.defaultCharset());
    }

    public static String d(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = Integer.toHexString(byArray[i2] & 0xFF);
            if (string.length() == 1) {
                stringBuilder.append('0');
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static String e(String object, String string) {
        if (((Matcher)(object = Pattern.compile((String)object).matcher(string))).find()) {
            return ((Matcher)object).group(1);
        }
        return "";
    }

    public static String f(String charSequence, String string) {
        if (string.startsWith("//")) {
            charSequence = Uri.parse((String)charSequence);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(charSequence.getScheme());
            stringBuilder.append(":");
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        if (!string.contains("://")) {
            Uri uri = Uri.parse((String)charSequence);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(uri.getScheme());
            ((StringBuilder)charSequence).append("://");
            ((StringBuilder)charSequence).append(uri.getHost());
            ((StringBuilder)charSequence).append(string);
            return ((StringBuilder)charSequence).toString();
        }
        return string;
    }

    public static String g(String charSequence) {
        CharSequence charSequence2;
        Matcher matcher;
        block7: {
            block6: {
                try {
                    matcher = Pattern.compile(".*(1080|720|2160|4k|4K).*").matcher(charSequence);
                    boolean bl = matcher.find();
                    if (!bl) break block6;
                }
                catch (Exception exception) {
                    return "";
                }
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(matcher.group(1));
                ((StringBuilder)charSequence2).append(" ");
                ((StringBuilder)charSequence2).append((String)charSequence);
                charSequence2 = ((StringBuilder)charSequence2).toString();
                break block7;
            }
            charSequence2 = charSequence;
        }
        matcher = Pattern.compile("^([0-9]+)").matcher(charSequence);
        charSequence = charSequence2;
        if (matcher.find()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(matcher.group(1));
            ((StringBuilder)charSequence).append(" ");
            ((StringBuilder)charSequence).append((String)charSequence2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append(((String)charSequence).replaceAll("\\D+", ""));
        ((StringBuilder)charSequence2).append(" ");
        ((StringBuilder)charSequence2).append(((String)charSequence).replaceAll("\\d+", ""));
        charSequence = ((StringBuilder)charSequence2).toString();
        return charSequence;
    }

    public static String h(String string) {
        String string2 = string;
        if (string.contains(".")) {
            string2 = string.substring(string.lastIndexOf(".") + 1);
        }
        return string2;
    }

    public static String i(double d2) {
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

    public static boolean j(String string) {
        if (!(string.contains("url=http") || string.contains(".js") || string.contains(".css") || string.contains(".html"))) {
            return a.matcher(string).find();
        }
        return false;
    }

    public static String k(String string) {
        String string2 = string;
        if (string.contains(".")) {
            string2 = string.substring(0, string.lastIndexOf("."));
        }
        return string2;
    }

    public static String l(String string) {
        try {
            string = H.d(MessageDigest.getInstance("SHA-1").digest(string.getBytes(Charset.defaultCharset())));
            return string;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static HashMap m(String object) {
        Serializable serializable = d;
        if (serializable == null || ((HashMap)serializable).isEmpty()) {
            block5: {
                // MONITORENTER : com.github.catvod.spider.merge.KT.H.class
                serializable = d;
                if (serializable != null && !((HashMap)serializable).isEmpty()) break block5;
                serializable = new HashMap();
                d = serializable;
                ((HashMap)serializable).put("Content-Type", "text/plain;charset=UTF-8");
                d.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
                d.put("Connection", "keep-alive");
                d.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
                d.put("Accept", "*/*");
            }
            // MONITOREXIT : com.github.catvod.spider.merge.KT.H.class
        }
        object = URI.create((String)object);
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(((URI)object).getScheme());
        ((StringBuilder)serializable).append("://");
        ((StringBuilder)serializable).append(((URI)object).getHost());
        object = ((StringBuilder)serializable).toString();
        d.put("Referer", object);
        d.put("Origin", object);
        return d;
    }
}

