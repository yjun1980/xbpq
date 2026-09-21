/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.D0.b;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class a {
    public char[] a;
    public Reader b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = -1;
    public String[] h = new String[512];
    public ArrayList i = null;
    public int j = 1;
    public boolean k;
    public String l;
    public int m;

    public a(StringReader stringReader, int n2) {
        com.github.catvod.spider.merge.xc.D0.b.r(((Reader)stringReader).markSupported());
        this.b = stringReader;
        this.a = new char[Math.min(n2, 32768)];
        this.b();
    }

    public static String c(char[] object, String[] stringArray, int n2, int n3) {
        block6: {
            int n4;
            if (n3 > 12) {
                return new String((char[])object, n2, n3);
            }
            if (n3 < 1) {
                return "";
            }
            int n5 = 0;
            int n6 = 0;
            for (n4 = 0; n4 < n3; ++n4) {
                n6 = n6 * 31 + object[n2 + n4];
            }
            int n7 = n6 & 0x1FF;
            String string = stringArray[n7];
            if (string != null && n3 == string.length()) {
                n4 = n2;
                n6 = n3;
                while (n6 != 0) {
                    if (object[n4] == string.charAt(n5)) {
                        ++n4;
                        --n6;
                        ++n5;
                        continue;
                    }
                    break block6;
                }
                return string;
            }
        }
        object = new String((char[])object, n2, n3);
        stringArray[n7] = object;
        return object;
    }

    public final void a() {
        ++this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        boolean bl;
        long l2;
        long l3;
        Reader reader;
        int n2;
        if (this.k) return;
        int n3 = this.e;
        if (n3 < this.d) {
            return;
        }
        int n4 = this.g;
        if (n4 != -1) {
            n2 = n3 - n4;
            n3 = n4;
        } else {
            n2 = 0;
        }
        try {
            reader = this.b;
            l3 = n3;
            l2 = reader.skip(l3);
            this.b.mark(32768);
            n4 = 0;
        }
        catch (IOException iOException) {
            throw new com.github.catvod.spider.merge.xc.C0.a(iOException);
        }
        while (true) {
            bl = true;
            if (n4 > 1024) break;
            reader = this.b;
            char[] cArray = this.a;
            int n5 = reader.read(cArray, n4, cArray.length - n4);
            if (n5 == -1) {
                this.k = true;
            }
            if (n5 <= 0) break;
            n4 += n5;
        }
        this.b.reset();
        if (n4 > 0) {
            if (l2 != l3) {
                bl = false;
            }
            com.github.catvod.spider.merge.xc.D0.b.r(bl);
            this.c = n4;
            this.f += n3;
            this.e = n2;
            if (this.g != -1) {
                this.g = 0;
            }
            this.d = Math.min(n4, 24576);
        }
        this.y();
        this.l = null;
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
lbl6:
            // 2 sources

            while (true) {
                this.b = null;
                this.a = null;
                this.h = null;
                break;
            }
        }
        catch (Throwable var1_2) {
            this.b = null;
            this.a = null;
            this.h = null;
            throw var1_2;
        }
        return;
        catch (IOException var1_3) {
            ** continue;
        }
    }

    public final char e() {
        this.b();
        int n2 = this.e;
        char c2 = n2 >= this.c ? (char)'\uffff' : this.a[n2];
        this.e = n2 + 1;
        return c2;
    }

    public final String f(boolean bl) {
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
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.xc.G0.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    public final String g() {
        char c2;
        int n2;
        int n3 = this.e;
        int n4 = this.c;
        Object object = this.a;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '&' && c2 != '<'; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.xc.G0.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    public final String h() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        while ((n2 = ++this.e) < this.c && ((c2 = this.a[n2]) >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2))) {
        }
        return com.github.catvod.spider.merge.xc.G0.a.c(this.a, this.h, n3, this.e - n3);
    }

    public final String i(char c2) {
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
            String string = com.github.catvod.spider.merge.xc.G0.a.c(this.a, this.h, this.e, c2);
            this.e += c2;
            return string;
        }
        this.b();
        char[] cArray = this.a;
        Object object = this.h;
        c2 = (char)this.e;
        object = com.github.catvod.spider.merge.xc.G0.a.c(cArray, object, c2, this.c - c2);
        this.e = this.c;
        return object;
    }

    public final String j(char ... object) {
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
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.xc.G0.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    public final String k(char ... object) {
        int n2;
        this.b();
        int n3 = this.e;
        int n4 = this.c;
        char[] cArray = this.a;
        for (n2 = n3; n2 < n4 && Arrays.binarySearch((char[])object, cArray[n2]) < 0; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.xc.G0.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    public final char l() {
        this.b();
        int n2 = this.e;
        char c2 = n2 >= this.c ? (char)'\uffff' : this.a[n2];
        return c2;
    }

    public final String m() {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.w();
        n3 = this.i != null ? ((n3 = this.o(n3)) == -1 ? this.j : n3 + this.j + 1) : 1;
        stringBuilder.append(n3);
        stringBuilder.append(":");
        n3 = n2 = this.w();
        if (this.i != null) {
            n3 = this.o(n2);
            n3 = n3 == -1 ? n2 : n2 - (Integer)this.i.get(n3);
        }
        stringBuilder.append(n3 + 1);
        return stringBuilder.toString();
    }

    public final boolean n() {
        this.b();
        boolean bl = this.e >= this.c;
        return bl;
    }

    public final int o(int n2) {
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            int n3;
            n2 = n3 = Collections.binarySearch(arrayList, n2);
            if (n3 < -1) {
                n2 = Math.abs(n3) - 2;
            }
            return n2;
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean p(String string) {
        int n2;
        this.b();
        this.b();
        int n3 = string.length();
        if (n3 > this.c - this.e) return false;
        for (n2 = 0; n2 < n3; ++n2) {
            if (string.charAt(n2) == this.a[this.e + n2]) continue;
            return false;
        }
        n2 = this.e;
        this.e = string.length() + n2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean q(String string) {
        int n2;
        this.b();
        int n3 = string.length();
        if (n3 > this.c - this.e) return false;
        for (n2 = 0; n2 < n3; ++n2) {
            if (Character.toUpperCase(string.charAt(n2)) == Character.toUpperCase(this.a[this.e + n2])) continue;
            return false;
        }
        n2 = this.e;
        this.e = string.length() + n2;
        return true;
    }

    public final boolean r(char c2) {
        boolean bl = !this.n() && this.a[this.e] == c2;
        return bl;
    }

    public final boolean s(char ... cArray) {
        if (this.n()) {
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

    public final boolean t() {
        boolean bl;
        block5: {
            block4: {
                bl = this.n();
                boolean bl2 = false;
                if (bl) {
                    return false;
                }
                char c2 = this.a[this.e];
                if (c2 >= 'A' && c2 <= 'Z') break block4;
                bl = bl2;
                if (c2 < 'a') break block5;
                bl = bl2;
                if (c2 > 'z') break block5;
            }
            bl = true;
        }
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

    public final boolean u() {
        boolean bl = this.n();
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

    public final int v(String string) {
        this.b();
        char c2 = string.charAt(0);
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
            int n6 = string.length() + n2 - 1;
            n3 = this.c;
            if (n5 >= n3 || n6 > n3) continue;
            n3 = n2;
            while (n3 < n6 && string.charAt(n4) == this.a[n3]) {
                ++n3;
                ++n4;
            }
            if (n3 != n6) continue;
            return n5 - this.e;
        }
        return -1;
    }

    public final int w() {
        return this.f + this.e;
    }

    public final void x() {
        int n2 = this.g;
        if (n2 != -1) {
            this.e = n2;
            this.g = -1;
            return;
        }
        throw new com.github.catvod.spider.merge.xc.C0.a(new IOException("Mark invalid"));
    }

    public final void y() {
        Serializable serializable = this.i;
        if (serializable != null) {
            int n2;
            if (((ArrayList)serializable).size() > 0) {
                int n3;
                n2 = n3 = this.o(this.f);
                if (n3 == -1) {
                    n2 = 0;
                }
                serializable = (Integer)this.i.get(n2);
                serializable.getClass();
                this.j += n2;
                this.i.clear();
                this.i.add(serializable);
            }
            for (n2 = this.e; n2 < this.c; ++n2) {
                if (this.a[n2] != '\n') continue;
                this.i.add(this.f + 1 + n2);
            }
        }
    }

    public final void z() {
        int n2 = this.e;
        if (n2 >= 1) {
            this.e = n2 - 1;
            return;
        }
        throw new com.github.catvod.spider.merge.xc.C0.a(new IOException("WTF: No buffer left to unconsume."));
    }
}

