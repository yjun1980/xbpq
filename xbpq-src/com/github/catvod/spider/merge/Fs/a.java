/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.r;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public final class a {
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = -1;
    private String[] h = new String[512];
    private boolean i;

    public a(Reader reader, int n2) {
        com.github.catvod.spider.merge.Dw.i.f(reader.markSupported());
        this.b = reader;
        this.a = new char[Math.min(n2, 32768)];
        this.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b() {
        boolean bl;
        int n2;
        int n3;
        int n4;
        block12: {
            if (this.i || (n4 = this.e) < this.d) return;
            n3 = this.g;
            if (n3 != -1) {
                n2 = n4 - n3;
                n4 = n3;
            } else {
                n2 = 0;
            }
            Reader reader = this.b;
            long l2 = n4;
            long l3 = reader.skip(l2);
            this.b.mark(32768);
            n3 = 0;
            while (true) {
                int n5;
                block11: {
                    bl = true;
                    if (n3 > 1024) break;
                    reader = this.b;
                    char[] cArray = this.a;
                    n5 = reader.read(cArray, n3, cArray.length - n3);
                    if (n5 != -1) break block11;
                    this.i = true;
                }
                if (n5 <= 0) break;
                n3 += n5;
            }
            try {
                this.b.reset();
                if (n3 <= 0) return;
                if (l3 == l2) break block12;
                bl = false;
            }
            catch (IOException iOException) {
                throw new r(iOException);
            }
        }
        com.github.catvod.spider.merge.Dw.i.f(bl);
        this.c = n3;
        this.f += n4;
        this.e = n2;
        if (this.g != -1) {
            this.g = 0;
        }
        this.d = Math.min(n3, 24576);
    }

    private static String c(char[] object, String[] stringArray, int n2, int n3) {
        if (n3 > 12) {
            return new String((char[])object, n2, n3);
        }
        boolean bl = true;
        if (n3 < 1) {
            return "";
        }
        int n4 = n3 * 31;
        int n5 = n2;
        int n6 = 0;
        while (n6 < n3) {
            n4 = n4 * 31 + object[n5];
            ++n6;
            ++n5;
        }
        int n7 = n4 & 0x1FF;
        String string = stringArray[n7];
        if (string == null) {
            object = new String((char[])object, n2, n3);
            stringArray[n7] = object;
        } else {
            boolean bl2;
            if (n3 == string.length()) {
                n6 = n2;
                n4 = n3;
                n5 = 0;
                while (true) {
                    bl2 = bl;
                    if (n4 != 0) {
                        if (object[n6] != string.charAt(n5)) break;
                        ++n6;
                        --n4;
                        ++n5;
                        continue;
                    }
                    break;
                }
            } else {
                bl2 = false;
            }
            if (bl2) {
                return string;
            }
            object = new String((char[])object, n2, n3);
            stringArray[n7] = object;
        }
        return object;
    }

    private boolean u() {
        boolean bl = this.e >= this.c;
        return bl;
    }

    final boolean A(char[] cArray) {
        this.b();
        boolean bl = !this.t() && Arrays.binarySearch(cArray, this.a[this.e]) >= 0;
        return bl;
    }

    final boolean B() {
        boolean bl = this.t();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        char c2 = this.a[this.e];
        bl = bl2;
        if (c2 >= '0') {
            bl = bl2;
            if (c2 <= '9') {
                bl = true;
            }
        }
        return bl;
    }

    final boolean C() {
        boolean bl = this.t();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        char c2 = this.a[this.e];
        if (c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2)) {
            bl2 = true;
        }
        return bl2;
    }

    final int D(CharSequence charSequence) {
        this.b();
        char c2 = charSequence.charAt(0);
        int n2 = this.e;
        while (n2 < this.c) {
            int n3 = this.a[n2];
            int n4 = 1;
            int n5 = n2;
            if (c2 != n3) {
                do {
                    n5 = ++n2;
                    if (n2 >= this.c) break;
                    n5 = n2;
                } while (c2 != this.a[n2]);
            }
            n2 = n5 + 1;
            int n6 = charSequence.length() + n2 - 1;
            n3 = this.c;
            if (n5 >= n3 || n6 > n3) continue;
            n3 = n2;
            while (n3 < n6 && charSequence.charAt(n4) == this.a[n3]) {
                ++n3;
                ++n4;
            }
            if (n3 != n6) continue;
            return n5 - this.e;
        }
        return -1;
    }

    public final int E() {
        return this.f + this.e;
    }

    final void F() {
        int n2 = this.g;
        if (n2 != -1) {
            this.e = n2;
            this.g = -1;
            return;
        }
        throw new r(new IOException("Mark invalid"));
    }

    final void G() {
        int n2 = this.e;
        if (n2 >= 1) {
            this.e = n2 - 1;
            return;
        }
        throw new r(new IOException("WTF: No buffer left to unconsume."));
    }

    final void H() {
        this.g = -1;
    }

    public final void a() {
        ++this.e;
    }

    /*
     * Unable to fully structure code
     */
    public final void d() {
        var1_1 = this.b;
        if (var1_1 == null) {
            return;
        }
        try {
            var1_1.close();
        }
        catch (Throwable var1_2) {
            this.b = null;
            this.a = null;
            this.h = null;
            throw var1_2;
        }
lbl12:
        // 2 sources

        while (true) {
            this.b = null;
            this.a = null;
            this.h = null;
            return;
        }
        catch (IOException var1_3) {
            ** continue;
        }
    }

    final char e() {
        this.b();
        char c2 = this.u() ? (char)'\uffff' : this.a[this.e];
        ++this.e;
        return c2;
    }

    final String f(boolean bl) {
        char c2;
        int n2;
        int n3 = this.e;
        int n4 = this.c;
        Object object = this.a;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000'; ++n2) {
            if (c2 != '\"') {
                if (c2 == '&') break;
                if (c2 != '\'') continue;
                if (bl) break;
            }
            if (!bl) break;
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String g() {
        char c2;
        int n2;
        int n3 = this.e;
        int n4 = this.c;
        Object object = this.a;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '&' && c2 != '<'; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String h() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        while ((n2 = this.e) < this.c && (c2 = this.a[n2]) >= '0' && c2 <= '9') {
            this.e = n2 + 1;
        }
        return com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, n2 - n3);
    }

    final String i() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        while ((n2 = this.e) < this.c && ((c2 = this.a[n2]) >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'F' || c2 >= 'a' && c2 <= 'f')) {
            this.e = n2 + 1;
        }
        return com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, n2 - n3);
    }

    final String j() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        while ((n2 = ++this.e) < this.c && ((c2 = this.a[n2]) >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2))) {
        }
        return com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, this.e - n3);
    }

    final String k() {
        int n2;
        char[] cArray;
        char c2;
        int n3;
        this.b();
        int n4 = this.e;
        while ((n3 = ++this.e) < this.c && ((c2 = this.a[n3]) >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2))) {
        }
        while (!this.u() && (n3 = (cArray = this.a)[n2 = this.e]) >= 48 && n3 <= 57) {
            this.e = n2 + 1;
        }
        return com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n4, this.e - n4);
    }

    final String l() {
        char c2;
        int n2;
        int n3 = this.e;
        int n4 = this.c;
        Object object = this.a;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '<'; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String m() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        int n4 = this.c;
        Object object = this.a;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != ' ' && c2 != '/' && c2 != '<' && c2 != '>' && c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r'; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String n() {
        int n2 = this.D("]]>");
        if (n2 != -1) {
            String string = com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, this.e, n2);
            this.e += n2;
            return string;
        }
        int n3 = this.c;
        n2 = this.e;
        if (n3 - n2 < 3) {
            return this.r();
        }
        n3 = n3 - 3 + 1;
        String string = com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n2, n3 - n2);
        this.e = n3;
        return string;
    }

    public final String o(char c2) {
        block2: {
            this.b();
            for (int i2 = this.e; i2 < this.c; ++i2) {
                if (c2 != this.a[i2]) continue;
                c2 = (char)(i2 - this.e);
                break block2;
            }
            c2 = (char)-1;
        }
        if (c2 != '\uffffffff') {
            String string = com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, this.e, c2);
            this.e += c2;
            return string;
        }
        return this.r();
    }

    public final String p(char ... object) {
        int n2;
        this.b();
        int n3 = this.e;
        int n4 = this.c;
        char[] cArray = this.a;
        int n5 = ((char[])object).length;
        block0: for (n2 = n3; n2 < n4; ++n2) {
            for (int i2 = 0; i2 < n5; ++i2) {
                if (cArray[n2] == object[i2]) break block0;
            }
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String q(char ... object) {
        int n2;
        this.b();
        int n3 = this.e;
        int n4 = this.c;
        char[] cArray = this.a;
        for (n2 = n3; n2 < n4 && Arrays.binarySearch((char[])object, cArray[n2]) < 0; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.Fs.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String r() {
        this.b();
        char[] cArray = this.a;
        Object object = this.h;
        int n2 = this.e;
        object = com.github.catvod.spider.merge.Fs.a.c(cArray, object, n2, this.c - n2);
        this.e = this.c;
        return object;
    }

    public final char s() {
        this.b();
        char c2 = this.u() ? (char)'\uffff' : this.a[this.e];
        return c2;
    }

    public final boolean t() {
        this.b();
        boolean bl = this.e >= this.c;
        return bl;
    }

    public final String toString() {
        int n2 = this.c;
        int n3 = this.e;
        if (n2 - n3 < 0) {
            return "";
        }
        return new String(this.a, n3, n2 - n3);
    }

    final void v() {
        if (this.c - this.e < 1024) {
            this.d = 0;
        }
        this.b();
        this.g = this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean w(String string) {
        int n2;
        this.b();
        this.b();
        int n3 = string.length();
        if (n3 > this.c - this.e) return false;
        for (n2 = 0; n2 < n3; ++n2) {
            if (string.charAt(n2) == this.a[this.e + n2]) continue;
            return false;
        }
        n2 = 1;
        if (n2 == 0) return false;
        n2 = this.e;
        this.e = string.length() + n2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean x(String string) {
        int n2;
        this.b();
        int n3 = string.length();
        if (n3 > this.c - this.e) return false;
        for (n2 = 0; n2 < n3; ++n2) {
            if (Character.toUpperCase(string.charAt(n2)) == Character.toUpperCase(this.a[this.e + n2])) continue;
            return false;
        }
        n2 = 1;
        if (n2 == 0) return false;
        n2 = this.e;
        this.e = string.length() + n2;
        return true;
    }

    final boolean y(char c2) {
        boolean bl = !this.t() && this.a[this.e] == c2;
        return bl;
    }

    final boolean z(char ... cArray) {
        if (this.t()) {
            return false;
        }
        this.b();
        char c2 = this.a[this.e];
        int n2 = cArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (cArray[i2] != c2) continue;
            return true;
        }
        return false;
    }
}

