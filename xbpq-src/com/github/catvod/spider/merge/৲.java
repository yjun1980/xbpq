/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u01d0;
import com.github.catvod.spider.merge.\u05d5;
import com.github.catvod.spider.merge.\u0672;
import com.github.catvod.spider.merge.\u0f8b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

public class \u09f2
implements Map.Entry<String, String>,
Cloneable {
    private static final String[] \u037f = new String[]{SOY.d("1B3E3D1903110F3E3D0517051F373F"), SOY.d("1B21281817"), SOY.d("1B2725191218192722"), SOY.d("193A34151F121E"), SOY.d("193D3C0615140E"), SOY.d("1E37321A15051F"), SOY.d("1E373717011B0E"), SOY.d("1E37371306"), SOY.d("1E3B2217161B1F36"), SOY.d("1C3D231B1A180C333D1F10160E37"), SOY.d("123B35121119"), SOY.d("133C340400"), SOY.d("13213C1704"), SOY.d("1326341B0714152234"), SOY.d("17273D021D071637"), SOY.d("1727251310"), SOY.d("143D39041111"), SOY.d("143D2313071E0037"), SOY.d("143D221E15131F"), SOY.d("143D2717181E1E332513"), SOY.d("143D26041507"), SOY.d("15223418"), SOY.d("083730121B19162B"), SOY.d("083720031D051F36"), SOY.d("0837271306041F36"), SOY.d("0937301B18120921"), SOY.d("09373D1317031F36"), SOY.d("093D230215151637"), SOY.d("0E20241307071F3735"), SOY.d("0E2B2113190209263C17001412")};
    private String \u0528;
    @Nullable
    private String \u0529;
    @Nullable
    \u0f8b \u052a;

    public \u09f2(String string, @Nullable String string2, @Nullable \u0f8b \u0f8b2) {
        \u01c3.\u052f(string);
        string = string.trim();
        \u01c3.\u052d(string);
        this.\u0528 = string;
        this.\u0529 = string2;
        this.\u052a = \u0f8b2;
    }

    protected static void \u052c(String string, @Nullable String string2, Appendable appendable, \u01d0.\u037f \u03f3) {
        appendable.append(string);
        if (!\u09f2.\u052f(string, string2, \u03f3)) {
            appendable.append(SOY.d("4770"));
            \u05d5.\u052b(appendable, \u0f8b.\u052e(string2), \u03f3, true, false, false);
            appendable.append('\"');
        }
    }

    protected static boolean \u052d(String string) {
        boolean bl = Arrays.binarySearch(\u037f, string) >= 0;
        return bl;
    }

    protected static boolean \u052f(String string, @Nullable String string2, \u01d0.\u037f \u03f3) {
        boolean bl = \u03f3.\u058f() == \u01d0.\u037f.\u037f.\u037f && (string2 == null || (string2.isEmpty() || string2.equalsIgnoreCase(string)) && \u09f2.\u052d(string));
        return bl;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && \u09f2.class == object.getClass()) {
            Object object2 = (\u09f2)object;
            object = this.\u0528;
            if (object != null ? !((String)object).equals(((\u09f2)object2).\u0528) : ((\u09f2)object2).\u0528 != null) {
                return false;
            }
            object = this.\u0529;
            object2 = ((\u09f2)object2).\u0529;
            if (object != null) {
                bl = ((String)object).equals(object2);
            } else if (object2 != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public int hashCode() {
        String string = this.\u0528;
        int n2 = 0;
        int n3 = string != null ? string.hashCode() : 0;
        string = this.\u0529;
        if (string != null) {
            n2 = string.hashCode();
        }
        return n3 * 31 + n2;
    }

    public String toString() {
        return this.\u052a();
    }

    public \u09f2 \u037f() {
        try {
            \u09f2 \u09f22 = (\u09f2)super.clone();
            return \u09f22;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public String \u0528() {
        return this.\u0528;
    }

    public String \u0529() {
        return \u0f8b.\u052e(this.\u0529);
    }

    public String \u052a() {
        StringBuilder stringBuilder = \u0131.\u0528();
        try {
            \u01d0 \u01d02 = new \u01d0("");
            this.\u052b(stringBuilder, \u01d02.\u0af9());
        }
        catch (IOException iOException) {
            throw new \u0672(iOException);
        }
        return \u0131.\u0781(stringBuilder);
    }

    protected void \u052b(Appendable appendable, \u01d0.\u037f \u03f3) {
        \u09f2.\u052c(this.\u0528, this.\u0529, appendable, \u03f3);
    }

    public String \u052e(String string) {
        Object object = this.\u0529;
        Object object2 = this.\u052a;
        if (object2 != null) {
            object2 = ((\u0f8b)object2).\u0620(this.\u0528);
            int n2 = this.\u052a.\u0785(this.\u0528);
            object = object2;
            if (n2 != -1) {
                this.\u052a.\u0529[n2] = string;
                object = object2;
            }
        }
        this.\u0529 = string;
        return \u0f8b.\u052e((String)object);
    }
}

