/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u037a;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

public final class \u0456 {
    private char[] \u037f;
    private Reader \u0528;
    private int \u0529;
    private int \u052a;
    private int \u052b;
    private int \u052c;
    private int \u052d = -1;
    private String[] \u052e = new String[512];
    private boolean \u052f;

    public \u0456(Reader reader) {
        this(reader, 32768);
    }

    public \u0456(Reader reader, int n2) {
        \u01c3.\u052f(reader);
        \u01c3.\u0529(reader.markSupported());
        this.\u0528 = reader;
        this.\u037f = new char[Math.min(n2, 32768)];
        this.\u0528();
    }

    public \u0456(String string) {
        this(new StringReader(string), string.length());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void \u0528() {
        boolean bl;
        int n2;
        int n3;
        int n4;
        block12: {
            if (this.\u052f || (n4 = this.\u052b) < this.\u052a) return;
            n3 = this.\u052d;
            if (n3 != -1) {
                n2 = n4 - n3;
                n4 = n3;
            } else {
                n2 = 0;
            }
            Object object = this.\u0528;
            long l2 = n4;
            long l3 = ((Reader)object).skip(l2);
            this.\u0528.mark(32768);
            n3 = 0;
            while (true) {
                int n5;
                block11: {
                    bl = true;
                    if (n3 > 1024) break;
                    Reader reader = this.\u0528;
                    object = this.\u037f;
                    n5 = reader.read((char[])object, n3, ((Object)object).length - n3);
                    if (n5 != -1) break block11;
                    this.\u052f = true;
                }
                if (n5 <= 0) break;
                n3 += n5;
            }
            try {
                this.\u0528.reset();
                if (n3 <= 0) return;
                if (l3 == l2) break block12;
                bl = false;
            }
            catch (IOException iOException) {
                throw new \u037a(iOException);
            }
        }
        \u01c3.\u0529(bl);
        this.\u0529 = n3;
        this.\u052c += n4;
        this.\u052b = n2;
        if (this.\u052d != -1) {
            this.\u052d = 0;
        }
        this.\u052a = Math.min(n3, 24576);
    }

    private static String \u0529(char[] object, String[] stringArray, int n2, int n3) {
        if (n3 > 12) {
            return new String((char[])object, n2, n3);
        }
        if (n3 < 1) {
            return "";
        }
        int n4 = n3 * 31;
        int n5 = 0;
        int n6 = n2;
        while (n5 < n3) {
            n4 = n4 * 31 + object[n6];
            ++n5;
            ++n6;
        }
        n6 = n4 & 0x1FF;
        String string = stringArray[n6];
        if (string == null) {
            object = new String((char[])object, n2, n3);
            stringArray[n6] = object;
        } else {
            if (\u0456.\u0798(object, n2, n3, string)) {
                return string;
            }
            object = new String((char[])object, n2, n3);
            stringArray[n6] = object;
        }
        return object;
    }

    private boolean \u078a() {
        boolean bl = this.\u052b >= this.\u0529;
        return bl;
    }

    static boolean \u0798(char[] cArray, int n2, int n3, String string) {
        if (n3 == string.length()) {
            int n4 = 0;
            int n5 = n2;
            n2 = n4;
            while (n3 != 0) {
                if (cArray[n5] != string.charAt(n2)) {
                    return false;
                }
                ++n5;
                --n3;
                ++n2;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        if (this.\u0529 - this.\u052b < 0) {
            return "";
        }
        char[] cArray = this.\u037f;
        int n2 = this.\u052b;
        return new String(cArray, n2, this.\u0529 - n2);
    }

    public void \u037f() {
        ++this.\u052b;
    }

    /*
     * Unable to fully structure code
     */
    public void \u052a() {
        var1_1 = this.\u0528;
        if (var1_1 == null) {
            return;
        }
        try {
            var1_1.close();
        }
        catch (Throwable var1_2) {
            this.\u0528 = null;
            this.\u037f = null;
            this.\u052e = null;
            throw var1_2;
        }
lbl12:
        // 2 sources

        while (true) {
            this.\u0528 = null;
            this.\u037f = null;
            this.\u052e = null;
            return;
        }
        catch (IOException var1_3) {
            ** continue;
        }
    }

    char \u052b() {
        this.\u0528();
        char c2 = this.\u078a() ? (char)'\uffff' : this.\u037f[this.\u052b];
        ++this.\u052b;
        return c2;
    }

    String \u052c(boolean bl) {
        char c2;
        int n2;
        int n3 = this.\u052b;
        int n4 = this.\u0529;
        Object object = this.\u037f;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000'; ++n2) {
            if (c2 != '\"') {
                if (c2 == '&') break;
                if (c2 != '\'') continue;
                if (bl) break;
            }
            if (!bl) break;
        }
        this.\u052b = n2;
        object = n2 > n3 ? (Object)\u0456.\u0529(this.\u037f, this.\u052e, n3, n2 - n3) : (Object)"";
        return object;
    }

    String \u052d() {
        char c2;
        int n2;
        int n3 = this.\u052b;
        int n4 = this.\u0529;
        Object object = this.\u037f;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '&' && c2 != '<'; ++n2) {
        }
        this.\u052b = n2;
        object = n2 > n3 ? (Object)\u0456.\u0529(this.\u037f, this.\u052e, n3, n2 - n3) : (Object)"";
        return object;
    }

    String \u052e() {
        char c2;
        int n2;
        this.\u0528();
        int n3 = this.\u052b;
        while ((n2 = this.\u052b) < this.\u0529 && (c2 = this.\u037f[n2]) >= '0' && c2 <= '9') {
            this.\u052b = n2 + 1;
        }
        return \u0456.\u0529(this.\u037f, this.\u052e, n3, n2 - n3);
    }

    String \u052f() {
        char c2;
        int n2;
        this.\u0528();
        int n3 = this.\u052b;
        while ((n2 = this.\u052b) < this.\u0529 && ((c2 = this.\u037f[n2]) >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'F' || c2 >= 'a' && c2 <= 'f')) {
            this.\u052b = n2 + 1;
        }
        return \u0456.\u0529(this.\u037f, this.\u052e, n3, n2 - n3);
    }

    String \u058f() {
        char c2;
        int n2;
        this.\u0528();
        int n3 = this.\u052b;
        while ((n2 = ++this.\u052b) < this.\u0529 && ((c2 = this.\u037f[n2]) >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2))) {
        }
        return \u0456.\u0529(this.\u037f, this.\u052e, n3, this.\u052b - n3);
    }

    String \u0620() {
        int n2;
        char[] cArray;
        char c2;
        int n3;
        this.\u0528();
        int n4 = this.\u052b;
        while ((n3 = ++this.\u052b) < this.\u0529 && ((c2 = this.\u037f[n3]) >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2))) {
        }
        while (!this.\u078a() && (n3 = (cArray = this.\u037f)[n2 = this.\u052b]) >= 48 && n3 <= 57) {
            this.\u052b = n2 + 1;
        }
        return \u0456.\u0529(this.\u037f, this.\u052e, n4, this.\u052b - n4);
    }

    String \u0780() {
        char c2;
        int n2;
        int n3 = this.\u052b;
        int n4 = this.\u0529;
        Object object = this.\u037f;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '<'; ++n2) {
        }
        this.\u052b = n2;
        object = n2 > n3 ? (Object)\u0456.\u0529(this.\u037f, this.\u052e, n3, n2 - n3) : (Object)"";
        return object;
    }

    String \u0781() {
        char c2;
        int n2;
        this.\u0528();
        int n3 = this.\u052b;
        int n4 = this.\u0529;
        Object object = this.\u037f;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != ' ' && c2 != '/' && c2 != '<' && c2 != '>' && c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r'; ++n2) {
        }
        this.\u052b = n2;
        object = n2 > n3 ? (Object)\u0456.\u0529(this.\u037f, this.\u052e, n3, n2 - n3) : (Object)"";
        return object;
    }

    public String \u0782(char c2) {
        int n2 = this.\u0795(c2);
        if (n2 != -1) {
            String string = \u0456.\u0529(this.\u037f, this.\u052e, this.\u052b, n2);
            this.\u052b += n2;
            return string;
        }
        return this.\u0786();
    }

    String \u0783(String object) {
        int n2 = this.\u0796((CharSequence)object);
        if (n2 != -1) {
            object = \u0456.\u0529(this.\u037f, this.\u052e, this.\u052b, n2);
            this.\u052b += n2;
            return object;
        }
        if (this.\u0529 - this.\u052b < object.length()) {
            return this.\u0786();
        }
        n2 = this.\u0529 - object.length() + 1;
        char[] cArray = this.\u037f;
        object = this.\u052e;
        int n3 = this.\u052b;
        object = \u0456.\u0529(cArray, object, n3, n2 - n3);
        this.\u052b = n2;
        return object;
    }

    public String \u0784(char ... object) {
        int n2;
        this.\u0528();
        int n3 = this.\u052b;
        int n4 = this.\u0529;
        char[] cArray = this.\u037f;
        int n5 = ((char[])object).length;
        block0: for (n2 = n3; n2 < n4; ++n2) {
            for (int i2 = 0; i2 < n5; ++i2) {
                if (cArray[n2] == object[i2]) break block0;
            }
        }
        this.\u052b = n2;
        object = n2 > n3 ? (Object)\u0456.\u0529(this.\u037f, this.\u052e, n3, n2 - n3) : (Object)"";
        return object;
    }

    String \u0785(char ... object) {
        int n2;
        this.\u0528();
        int n3 = this.\u052b;
        int n4 = this.\u0529;
        char[] cArray = this.\u037f;
        for (n2 = n3; n2 < n4 && Arrays.binarySearch((char[])object, cArray[n2]) < 0; ++n2) {
        }
        this.\u052b = n2;
        object = n2 > n3 ? (Object)\u0456.\u0529(this.\u037f, this.\u052e, n3, n2 - n3) : (Object)"";
        return object;
    }

    String \u0786() {
        this.\u0528();
        Object object = this.\u037f;
        String[] stringArray = this.\u052e;
        int n2 = this.\u052b;
        object = \u0456.\u0529(object, stringArray, n2, this.\u0529 - n2);
        this.\u052b = this.\u0529;
        return object;
    }

    boolean \u0787(String string) {
        Locale locale = Locale.ENGLISH;
        String string2 = string.toLowerCase(locale);
        string = string.toUpperCase(locale);
        boolean bl = this.\u0796(string2) > -1 || this.\u0796(string) > -1;
        return bl;
    }

    public char \u0788() {
        this.\u0528();
        char c2 = this.\u078a() ? (char)'\uffff' : this.\u037f[this.\u052b];
        return c2;
    }

    public boolean \u0789() {
        this.\u0528();
        boolean bl = this.\u052b >= this.\u0529;
        return bl;
    }

    void \u078b() {
        if (this.\u0529 - this.\u052b < 1024) {
            this.\u052a = 0;
        }
        this.\u0528();
        this.\u052d = this.\u052b;
    }

    boolean \u078c(String string) {
        this.\u0528();
        if (this.\u078f(string)) {
            this.\u052b += string.length();
            return true;
        }
        return false;
    }

    boolean \u078d(String string) {
        if (this.\u0793(string)) {
            this.\u052b += string.length();
            return true;
        }
        return false;
    }

    boolean \u078e(char c2) {
        boolean bl = !this.\u0789() && this.\u037f[this.\u052b] == c2;
        return bl;
    }

    boolean \u078f(String string) {
        this.\u0528();
        int n2 = string.length();
        if (n2 > this.\u0529 - this.\u052b) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (string.charAt(i2) == this.\u037f[this.\u052b + i2]) continue;
            return false;
        }
        return true;
    }

    boolean \u0790(char ... cArray) {
        if (this.\u0789()) {
            return false;
        }
        this.\u0528();
        char c2 = this.\u037f[this.\u052b];
        int n2 = cArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (cArray[i2] != c2) continue;
            return true;
        }
        return false;
    }

    boolean \u0791(char[] cArray) {
        this.\u0528();
        boolean bl = !this.\u0789() && Arrays.binarySearch(cArray, this.\u037f[this.\u052b]) >= 0;
        return bl;
    }

    boolean \u0792() {
        boolean bl = this.\u0789();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        char c2 = this.\u037f[this.\u052b];
        bl = bl2;
        if (c2 >= '0') {
            bl = bl2;
            if (c2 <= '9') {
                bl = true;
            }
        }
        return bl;
    }

    boolean \u0793(String string) {
        this.\u0528();
        int n2 = string.length();
        if (n2 > this.\u0529 - this.\u052b) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.toUpperCase(string.charAt(i2)) == Character.toUpperCase(this.\u037f[this.\u052b + i2])) continue;
            return false;
        }
        return true;
    }

    boolean \u0794() {
        boolean bl = this.\u0789();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        char c2 = this.\u037f[this.\u052b];
        if (c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2)) {
            bl2 = true;
        }
        return bl2;
    }

    int \u0795(char c2) {
        this.\u0528();
        for (int i2 = this.\u052b; i2 < this.\u0529; ++i2) {
            if (c2 != this.\u037f[i2]) continue;
            return i2 - this.\u052b;
        }
        return -1;
    }

    int \u0796(CharSequence charSequence) {
        this.\u0528();
        char c2 = charSequence.charAt(0);
        int n2 = this.\u052b;
        while (n2 < this.\u0529) {
            int n3 = this.\u037f[n2];
            int n4 = 1;
            int n5 = n2;
            if (c2 != n3) {
                do {
                    n5 = ++n2;
                    if (n2 >= this.\u0529) break;
                    n5 = n2;
                } while (c2 != this.\u037f[n2]);
            }
            n2 = n5 + 1;
            int n6 = charSequence.length() + n2 - 1;
            n3 = this.\u0529;
            if (n5 >= n3 || n6 > n3) continue;
            n3 = n2;
            while (n3 < n6 && charSequence.charAt(n4) == this.\u037f[n3]) {
                ++n3;
                ++n4;
            }
            if (n3 != n6) continue;
            return n5 - this.\u052b;
        }
        return -1;
    }

    public int \u0797() {
        return this.\u052c + this.\u052b;
    }

    void \u0799() {
        int n2 = this.\u052d;
        if (n2 != -1) {
            this.\u052b = n2;
            this.\u079b();
            return;
        }
        throw new \u037a(new IOException(SOY.d("3733231D541E1424301A1D13")));
    }

    void \u079a() {
        int n2 = this.\u052b;
        if (n2 >= 1) {
            this.\u052b = n2 - 1;
            return;
        }
        throw new \u037a(new IOException(SOY.d("2D06174C54391572330312111F20711A11110E722519540214313E18070217377F")));
    }

    void \u079b() {
        this.\u052d = -1;
    }
}

