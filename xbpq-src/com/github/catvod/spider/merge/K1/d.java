/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  com.google.zxing.BarcodeFormat
 *  com.google.zxing.EncodeHintType
 *  com.google.zxing.MultiFormatWriter
 *  com.google.zxing.common.BitMatrix
 */
package com.github.catvod.spider.merge.K1;

import android.graphics.Bitmap;
import com.github.catvod.spider.merge.B.j;
import com.github.catvod.spider.merge.H0.b;
import com.github.catvod.spider.merge.H0.c;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.o;
import com.github.catvod.spider.merge.e.a;
import com.github.catvod.spider.merge.i0.m;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.EnumMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public final class d {
    public static void a(String string) {
        Context context = Context.enter();
        try {
            context.setInterpretedMode(true);
            context.compileString(string, null, 1, null);
            context.close();
            return;
        }
        catch (Throwable throwable) {
            if (context != null) {
                try {
                    context.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
            }
            throw throwable;
        }
    }

    public static Bitmap b(String object, int n2, int n3) {
        BitMatrix bitMatrix = new EnumMap(EncodeHintType.class);
        bitMatrix.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        bitMatrix.put(EncodeHintType.MARGIN, (Object)n3);
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        bitMatrix = multiFormatWriter.encode((String)object, BarcodeFormat.QR_CODE, m.e(n2), m.e(n2), bitMatrix);
        int n4 = bitMatrix.getWidth();
        int n5 = bitMatrix.getHeight();
        object = new int[n4 * n5];
        for (n2 = 0; n2 < n5; ++n2) {
            for (n3 = 0; n3 < n4; ++n3) {
                int n6 = bitMatrix.get(n3, n2) ? -16777216 : -1;
                object[n2 * n4 + n3] = n6;
            }
        }
        try {
            bitMatrix = Bitmap.createBitmap((int)n4, (int)n5, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            bitMatrix.setPixels((int[])object, 0, n4, 0, 0, n4, n5);
            return bitMatrix;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static boolean c(String string, String string2) {
        return d.d(Pattern.compile(string), string2);
    }

    public static boolean d(Pattern pattern, String string) {
        return pattern.matcher(string).find();
    }

    public static String e(String string) {
        string = string != null ? string.toLowerCase(Locale.ENGLISH) : "";
        return string;
    }

    public static String f(String string, String string2, int n2) {
        return d.g(Pattern.compile(string), string2, n2);
    }

    public static String g(Pattern object, String string, int n2) {
        Object object2 = ((Pattern)object).matcher(string);
        if (((Matcher)object2).find()) {
            return ((Matcher)object2).group(n2);
        }
        object = object2 = s.a("Failed to find pattern \"", ((Pattern)object).pattern(), "\"");
        if (string.length() <= 1024) {
            object = com.github.catvod.spider.merge.G1.a.a((String)object2, " inside of \"", string, "\"");
        }
        throw new o((String)object);
    }

    public static Matcher h(Pattern[] patternArray, String string) {
        int n2 = patternArray.length;
        Object object = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            Pattern pattern = patternArray[i2];
            Object object2 = pattern.matcher(string);
            if (((Matcher)object2).find()) {
                return object2;
            }
            object2 = object;
            if (object == null) {
                object2 = pattern.pattern();
                object = string.length() <= 1000 ? s.a("inside of \"", string, "\"") : "";
                object2 = new o(com.github.catvod.spider.merge.G1.a.a("Failed to find pattern \"", (String)object2, "\"", (String)object));
            }
            object = object2;
        }
        if (object == null) {
            object = new o("Empty patterns array passed to matchMultiplePatterns");
        }
        throw object;
    }

    public static String i(String string) {
        return d.e(string).trim();
    }

    public static String j(String string, String string2, String ... stringArray) {
        Context context = Context.enter();
        try {
            context.setInterpretedMode(true);
            ScriptableObject scriptableObject = context.initSafeStandardObjects();
            context.evaluateString(scriptableObject, string, string2, 1, null);
            string = ((Function)scriptableObject.get(string2, (Scriptable)scriptableObject)).call(context, scriptableObject, scriptableObject, stringArray).toString();
            context.close();
            return string;
        }
        catch (Throwable throwable) {
            if (context != null) {
                try {
                    context.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
            }
            throw throwable;
        }
    }

    public static com.github.catvod.spider.merge.H0.d k(String object, c c2, MessageDigest object2) {
        object2 = new BigInteger(com.github.catvod.spider.merge.c1.d.d(((MessageDigest)object2).digest(((String)object).getBytes())), 16);
        object = c2.a;
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigInteger2 = a.a(((com.github.catvod.spider.merge.H0.a)object).c);
        bigInteger = j.e((b)((com.github.catvod.spider.merge.H0.a)object).d, (BigInteger)bigInteger2, (BigInteger)((com.github.catvod.spider.merge.H0.a)object).c, (BigInteger)((com.github.catvod.spider.merge.H0.a)object).a, (BigInteger)((com.github.catvod.spider.merge.H0.a)object).b).a.mod(((com.github.catvod.spider.merge.H0.a)object).c);
        return new com.github.catvod.spider.merge.H0.d(bigInteger, ((BigInteger)object2).add(bigInteger.multiply(c2.b)).multiply(j.b(bigInteger2, ((com.github.catvod.spider.merge.H0.a)object).c)).mod(((com.github.catvod.spider.merge.H0.a)object).c));
    }
}

