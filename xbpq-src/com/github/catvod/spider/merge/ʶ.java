/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02b0;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

@Deprecated
public abstract class \u02b6 {
    static final char[] \u037f = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String \u037f(int n2) {
        return Integer.toHexString(n2).toUpperCase(Locale.ENGLISH);
    }

    public abstract int \u0528(CharSequence var1, int var2, Writer var3);

    public final String \u0529(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            this.\u052a(charSequence, stringWriter);
            charSequence = stringWriter.toString();
            return charSequence;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public final void \u052a(CharSequence object, Writer writer) {
        if (writer != null) {
            if (object == null) {
                return;
            }
            int n2 = object.length();
            int n3 = 0;
            block0: while (n3 < n2) {
                int n4;
                int n5 = this.\u0528((CharSequence)object, n3, writer);
                if (n5 == 0) {
                    char c2 = object.charAt(n3);
                    writer.write(c2);
                    n3 = n4 = n3 + 1;
                    if (!Character.isHighSurrogate(c2)) continue;
                    n3 = n4;
                    if (n4 >= n2) continue;
                    c2 = object.charAt(n4);
                    n3 = n4;
                    if (!Character.isLowSurrogate(c2)) continue;
                    writer.write(c2);
                    n3 = n4 + 1;
                    continue;
                }
                int n6 = 0;
                n4 = n3;
                while (true) {
                    n3 = n4;
                    if (n6 >= n5) continue block0;
                    n4 += Character.charCount(Character.codePointAt((CharSequence)object, n4));
                    ++n6;
                }
            }
            return;
        }
        object = new IllegalArgumentException(SOY.d("2E3A3456230513263404541A0F2125561A180E72331354190F3E3D"));
        throw object;
    }

    public final \u02b6 \u052b(\u02b6 ... \u02b6Array) {
        \u02b6[] \u02b6Array2 = new \u02b6[\u02b6Array.length + 1];
        \u02b6Array2[0] = this;
        System.arraycopy(\u02b6Array, 0, \u02b6Array2, 1, \u02b6Array.length);
        return new \u02b0(\u02b6Array2);
    }
}

