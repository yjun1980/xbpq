/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.VU;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

public final class kJ {
    private boolean HM;
    private String[] N = new String[512];
    private int OL;
    private Reader S;
    private int T4;
    private int b;
    private int l;
    private char[] l8;
    private int tT = -1;

    public kJ(Reader reader) {
        this(reader, 32768);
    }

    public kJ(Reader reader, int n2) {
        Rc.HM(reader);
        Rc.T4(reader.markSupported());
        this.S = reader;
        this.l8 = new char[Math.min(n2, 32768)];
        this.S();
    }

    public kJ(String string) {
        this(new StringReader(string), string.length());
    }

    static boolean H6(char[] cArray, int n2, int n3, String string) {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void S() {
        boolean bl;
        int n2;
        int n3;
        int n4;
        block12: {
            if (this.HM || (n4 = this.OL) < this.b) return;
            n3 = this.tT;
            if (n3 != -1) {
                n2 = n4 - n3;
                n4 = n3;
            } else {
                n2 = 0;
            }
            Reader reader = this.S;
            long l2 = n4;
            long l3 = reader.skip(l2);
            this.S.mark(32768);
            n3 = 0;
            while (true) {
                int n5;
                block11: {
                    bl = true;
                    if (n3 > 1024) break;
                    reader = this.S;
                    char[] cArray = this.l8;
                    n5 = reader.read(cArray, n3, cArray.length - n3);
                    if (n5 != -1) break block11;
                    this.HM = true;
                }
                if (n5 <= 0) break;
                n3 += n5;
            }
            try {
                this.S.reset();
                if (n3 <= 0) return;
                if (l3 == l2) break block12;
                bl = false;
            }
            catch (IOException iOException) {
                throw new VU(iOException);
            }
        }
        Rc.T4(bl);
        this.T4 = n3;
        this.l += n4;
        this.OL = n2;
        if (this.tT != -1) {
            this.tT = 0;
        }
        this.b = Math.min(n3, 24576);
    }

    private static String T4(char[] object, String[] stringArray, int n2, int n3) {
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
            if (kJ.H6(object, n2, n3, string)) {
                return string;
            }
            object = new String((char[])object, n2, n3);
            stringArray[n6] = object;
        }
        return object;
    }

    private boolean W() {
        boolean bl = this.OL >= this.T4;
        return bl;
    }

    String A() {
        char c2;
        int n2;
        int n3 = this.OL;
        int n4 = this.T4;
        Object object = this.l8;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '<'; ++n2) {
        }
        this.OL = n2;
        object = n2 > n3 ? (Object)kJ.T4(this.l8, this.N, n3, n2 - n3) : (Object)"";
        return object;
    }

    boolean A0(String string) {
        this.S();
        int n2 = string.length();
        if (n2 > this.T4 - this.OL) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.toUpperCase(string.charAt(i2)) == Character.toUpperCase(this.l8[this.OL + i2])) continue;
            return false;
        }
        return true;
    }

    public int Bz() {
        return this.l + this.OL;
    }

    void C() {
        if (this.T4 - this.OL < 1024) {
            this.b = 0;
        }
        this.S();
        this.tT = this.OL;
    }

    String E9(char ... object) {
        int n2;
        this.S();
        int n3 = this.OL;
        int n4 = this.T4;
        char[] cArray = this.l8;
        for (n2 = n3; n2 < n4 && Arrays.binarySearch((char[])object, cArray[n2]) < 0; ++n2) {
        }
        this.OL = n2;
        object = n2 > n3 ? (Object)kJ.T4(this.l8, this.N, n3, n2 - n3) : (Object)"";
        return object;
    }

    boolean G(char ... cArray) {
        if (this.Q()) {
            return false;
        }
        this.S();
        char c2 = this.l8[this.OL];
        int n2 = cArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (cArray[i2] != c2) continue;
            return true;
        }
        return false;
    }

    String HM() {
        char c2;
        int n2;
        this.S();
        int n3 = this.OL;
        while ((n2 = this.OL) < this.T4 && ((c2 = this.l8[n2]) >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'F' || c2 >= 'a' && c2 <= 'f')) {
            this.OL = n2 + 1;
        }
        return kJ.T4(this.l8, this.N, n3, n2 - n3);
    }

    public String Kf(char ... object) {
        int n2;
        this.S();
        int n3 = this.OL;
        int n4 = this.T4;
        char[] cArray = this.l8;
        int n5 = ((char[])object).length;
        block0: for (n2 = n3; n2 < n4; ++n2) {
            for (int i2 = 0; i2 < n5; ++i2) {
                if (cArray[n2] == object[i2]) break block0;
            }
        }
        this.OL = n2;
        object = n2 > n3 ? (Object)kJ.T4(this.l8, this.N, n3, n2 - n3) : (Object)"";
        return object;
    }

    String N() {
        char c2;
        int n2;
        this.S();
        int n3 = this.OL;
        while ((n2 = this.OL) < this.T4 && (c2 = this.l8[n2]) >= '0' && c2 <= '9') {
            this.OL = n2 + 1;
        }
        return kJ.T4(this.l8, this.N, n3, n2 - n3);
    }

    int O(CharSequence charSequence) {
        this.S();
        char c2 = charSequence.charAt(0);
        int n2 = this.OL;
        while (n2 < this.T4) {
            int n3 = this.l8[n2];
            int n4 = 1;
            int n5 = n2;
            if (c2 != n3) {
                do {
                    n5 = ++n2;
                    if (n2 >= this.T4) break;
                    n5 = n2;
                } while (c2 != this.l8[n2]);
            }
            n2 = n5 + 1;
            int n6 = charSequence.length() + n2 - 1;
            n3 = this.T4;
            if (n5 >= n3 || n6 > n3) continue;
            n3 = n2;
            while (n3 < n6 && charSequence.charAt(n4) == this.l8[n3]) {
                ++n3;
                ++n4;
            }
            if (n3 != n6) continue;
            return n5 - this.OL;
        }
        return -1;
    }

    char OL() {
        this.S();
        char c2 = this.W() ? (char)'\uffff' : this.l8[this.OL];
        ++this.OL;
        return c2;
    }

    boolean OY(String string) {
        this.S();
        if (this.bc(string)) {
            this.OL += string.length();
            return true;
        }
        return false;
    }

    void PP() {
        int n2 = this.tT;
        if (n2 != -1) {
            this.OL = n2;
            this.mF();
            return;
        }
        throw new VU(new IOException("Mark invalid"));
    }

    public boolean Q() {
        this.S();
        boolean bl = this.OL >= this.T4;
        return bl;
    }

    boolean R(char c2) {
        boolean bl = !this.Q() && this.l8[this.OL] == c2;
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public void b() {
        var1_1 = this.S;
        if (var1_1 == null) {
            return;
        }
        try {
            var1_1.close();
        }
        catch (Throwable var1_2) {
            this.S = null;
            this.l8 = null;
            this.N = null;
            throw var1_2;
        }
lbl12:
        // 2 sources

        while (true) {
            this.S = null;
            this.l8 = null;
            this.N = null;
            return;
        }
        catch (IOException var1_3) {
            ** continue;
        }
    }

    boolean bc(String string) {
        this.S();
        int n2 = string.length();
        if (n2 > this.T4 - this.OL) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (string.charAt(i2) == this.l8[this.OL + i2]) continue;
            return false;
        }
        return true;
    }

    boolean c(String string) {
        Locale locale = Locale.ENGLISH;
        String string2 = string.toLowerCase(locale);
        string = string.toUpperCase(locale);
        boolean bl = this.O(string2) > -1 || this.O(string) > -1;
        return bl;
    }

    String cD() {
        char c2;
        int n2;
        this.S();
        int n3 = this.OL;
        int n4 = this.T4;
        Object object = this.l8;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != ' ' && c2 != '/' && c2 != '<' && c2 != '>' && c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r'; ++n2) {
        }
        this.OL = n2;
        object = n2 > n3 ? (Object)kJ.T4(this.l8, this.N, n3, n2 - n3) : (Object)"";
        return object;
    }

    int d(char c2) {
        this.S();
        for (int i2 = this.OL; i2 < this.T4; ++i2) {
            if (c2 != this.l8[i2]) continue;
            return i2 - this.OL;
        }
        return -1;
    }

    public char eD() {
        this.S();
        char c2 = this.W() ? (char)'\uffff' : this.l8[this.OL];
        return c2;
    }

    String hR(String object) {
        int n2 = this.O((CharSequence)object);
        if (n2 != -1) {
            object = kJ.T4(this.l8, this.N, this.OL, n2);
            this.OL += n2;
            return object;
        }
        if (this.T4 - this.OL < object.length()) {
            return this.uS();
        }
        n2 = this.T4 - object.length() + 1;
        char[] cArray = this.l8;
        object = this.N;
        int n3 = this.OL;
        object = kJ.T4(cArray, object, n3, n2 - n3);
        this.OL = n2;
        return object;
    }

    boolean hd() {
        boolean bl = this.Q();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        char c2 = this.l8[this.OL];
        if (c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2)) {
            bl2 = true;
        }
        return bl2;
    }

    String l(boolean bl) {
        char c2;
        int n2;
        int n3 = this.OL;
        int n4 = this.T4;
        Object object = this.l8;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000'; ++n2) {
            if (c2 != '\"') {
                if (c2 == '&') break;
                if (c2 != '\'') continue;
                if (bl) break;
            }
            if (!bl) break;
        }
        this.OL = n2;
        object = n2 > n3 ? (Object)kJ.T4(this.l8, this.N, n3, n2 - n3) : (Object)"";
        return object;
    }

    public void l8() {
        ++this.OL;
    }

    void mF() {
        this.tT = -1;
    }

    String n() {
        char c2;
        int n2;
        this.S();
        int n3 = this.OL;
        while ((n2 = ++this.OL) < this.T4 && ((c2 = this.l8[n2]) >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2))) {
        }
        return kJ.T4(this.l8, this.N, n3, this.OL - n3);
    }

    void o() {
        int n2 = this.OL;
        if (n2 >= 1) {
            this.OL = n2 - 1;
            return;
        }
        throw new VU(new IOException("WTF: No buffer left to unconsume."));
    }

    boolean oH() {
        boolean bl = this.Q();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        char c2 = this.l8[this.OL];
        bl = bl2;
        if (c2 >= '0') {
            bl = bl2;
            if (c2 <= '9') {
                bl = true;
            }
        }
        return bl;
    }

    boolean r1(String string) {
        if (this.A0(string)) {
            this.OL += string.length();
            return true;
        }
        return false;
    }

    boolean rD(char[] cArray) {
        this.S();
        boolean bl = !this.Q() && Arrays.binarySearch(cArray, this.l8[this.OL]) >= 0;
        return bl;
    }

    public String s(char c2) {
        int n2 = this.d(c2);
        if (n2 != -1) {
            String string = kJ.T4(this.l8, this.N, this.OL, n2);
            this.OL += n2;
            return string;
        }
        return this.uS();
    }

    String tT() {
        char c2;
        int n2;
        int n3 = this.OL;
        int n4 = this.T4;
        Object object = this.l8;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '&' && c2 != '<'; ++n2) {
        }
        this.OL = n2;
        object = n2 > n3 ? (Object)kJ.T4(this.l8, this.N, n3, n2 - n3) : (Object)"";
        return object;
    }

    public String toString() {
        if (this.T4 - this.OL < 0) {
            return "";
        }
        char[] cArray = this.l8;
        int n2 = this.OL;
        return new String(cArray, n2, this.T4 - n2);
    }

    String uS() {
        this.S();
        Object object = this.l8;
        String[] stringArray = this.N;
        int n2 = this.OL;
        object = kJ.T4(object, stringArray, n2, this.T4 - n2);
        this.OL = this.T4;
        return object;
    }

    String v() {
        char[] cArray;
        char c2;
        char c3;
        int n2;
        this.S();
        int n3 = this.OL;
        while ((n2 = ++this.OL) < this.T4 && ((c3 = this.l8[n2]) >= 'A' && c3 <= 'Z' || c3 >= 'a' && c3 <= 'z' || Character.isLetter(c3))) {
        }
        while (!this.W() && (c2 = (cArray = this.l8)[n2 = this.OL]) >= '0' && c2 <= '9') {
            this.OL = n2 + 1;
        }
        return kJ.T4(this.l8, this.N, n3, this.OL - n3);
    }
}

