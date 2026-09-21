/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.I0.a;
import com.github.catvod.spider.merge.c1.e;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.f1.F;
import com.github.catvod.spider.merge.i0.m;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.util.Arrays;

public final class d {
    public static byte[] a(String object) {
        int n2;
        object = new BigInteger((String)object, 16).toByteArray();
        for (n2 = 0; n2 < ((Object)object).length && object[n2] == false; ++n2) {
        }
        return Arrays.copyOfRange((byte[])object, n2, ((Object)object).length);
    }

    public static int b(int n2, int n3) {
        n2 = n2 < n3 ? -1 : (n2 == n3 ? 0 : 1);
        return n2;
    }

    public static void c(String string) {
        throw new e(string);
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

    public static void e(boolean bl) {
        if (!bl) {
            return;
        }
        throw new e("Must be false");
    }

    public static void f(boolean bl) {
        if (bl) {
            return;
        }
        throw new e("Must be true");
    }

    public static void g(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new e(string);
    }

    public static void h(String string) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new e("String must not be empty");
    }

    public static void i(String string, String string2) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new e(string2);
    }

    public static void j(Object object) {
        if (object != null) {
            return;
        }
        throw new e("Object must not be null");
    }

    public static void k(Object object, String string) {
        if (object != null) {
            return;
        }
        throw new e(String.format("The parameter '%s' must not be null.", string));
    }

    public static h l(String string) {
        return F.d(string, "");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String m(File object) {
        try {
            Object object2 = new FileInputStream((File)object);
            Object object3 = new InputStreamReader((InputStream)object2);
            object = new BufferedReader((Reader)object3);
            object3 = new StringBuilder();
            while (true) {
                if ((object2 = ((BufferedReader)object).readLine()) == null) {
                    ((BufferedReader)object).close();
                    return m.D(((StringBuilder)object3).toString());
                }
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append("\n");
            }
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static a n(BigInteger bigInteger, int n2) {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("%0");
        stringBuilder.append(String.valueOf(n2 * 2));
        stringBuilder.append("x");
        return new a(d.a(String.format(stringBuilder.toString(), bigInteger)));
    }

    public static byte[] o(int n2) {
        return new byte[]{(byte)n2};
    }
}

