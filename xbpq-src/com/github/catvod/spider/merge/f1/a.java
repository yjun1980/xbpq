/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.b1.b;
import com.github.catvod.spider.merge.c1.d;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public final class a {
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = -1;
    private String[] h = new String[512];
    private ArrayList<Integer> i = null;
    private int j = 1;
    private boolean k;
    private String l;
    private int m;

    public a(Reader reader, int n2) {
        com.github.catvod.spider.merge.c1.d.f(reader.markSupported());
        this.b = reader;
        this.a = new char[Math.min(n2, 32768)];
        this.b();
    }

    private void N() {
        int n2;
        if (!this.y()) {
            return;
        }
        if (this.i.size() > 0) {
            int n3;
            n2 = n3 = this.z(this.f);
            if (n3 == -1) {
                n2 = 0;
            }
            n3 = this.i.get(n2);
            this.j += n2;
            this.i.clear();
            this.i.add(n3);
        }
        for (n2 = this.e; n2 < this.c; ++n2) {
            if (this.a[n2] != '\n') continue;
            this.i.add(this.f + 1 + n2);
        }
    }

    private void b() {
        int n2;
        if (!this.k && (n2 = this.e) >= this.d) {
            block13: {
                boolean bl;
                int n3;
                int n4;
                block14: {
                    n4 = this.g;
                    if (n4 != -1) {
                        n3 = n2 - n4;
                        n2 = n4;
                    } else {
                        n3 = 0;
                    }
                    Object object = this.b;
                    long l2 = n2;
                    long l3 = ((Reader)object).skip(l2);
                    this.b.mark(32768);
                    n4 = 0;
                    while (true) {
                        int n5;
                        block12: {
                            bl = true;
                            if (n4 > 1024) break;
                            Reader reader = this.b;
                            object = this.a;
                            n5 = reader.read((char[])object, n4, ((Object)object).length - n4);
                            if (n5 != -1) break block12;
                            this.k = true;
                        }
                        if (n5 <= 0) break;
                        n4 += n5;
                    }
                    try {
                        this.b.reset();
                        if (n4 <= 0) break block13;
                        if (l3 == l2) break block14;
                        bl = false;
                    }
                    catch (IOException iOException) {
                        throw new b(iOException);
                    }
                }
                com.github.catvod.spider.merge.c1.d.f(bl);
                this.c = n4;
                this.f += n2;
                this.e = n3;
                if (this.g != -1) {
                    this.g = 0;
                }
                this.d = Math.min(n4, 24576);
            }
            this.N();
            this.l = null;
            return;
        }
    }

    private static String c(char[] object, String[] stringArray, int n2, int n3) {
        int n4;
        if (n3 > 12) {
            return new String((char[])object, n2, n3);
        }
        boolean bl = true;
        if (n3 < 1) {
            return "";
        }
        int n5 = 0;
        for (n4 = 0; n4 < n3; ++n4) {
            n5 = n5 * 31 + object[n2 + n4];
        }
        int n6 = n5 & 0x1FF;
        String string = stringArray[n6];
        if (string != null) {
            boolean bl2;
            if (n3 == string.length()) {
                int n7 = n2;
                n4 = n3;
                n5 = 0;
                while (true) {
                    bl2 = bl;
                    if (n4 != 0) {
                        if (object[n7] != string.charAt(n5)) break;
                        ++n7;
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
        }
        object = new String((char[])object, n2, n3);
        stringArray[n6] = object;
        return object;
    }

    private boolean x() {
        boolean bl = this.e >= this.c;
        return bl;
    }

    private int z(int n2) {
        int n3;
        if (!this.y()) {
            return 0;
        }
        n2 = n3 = Collections.binarySearch(this.i, n2);
        if (n3 < -1) {
            n2 = Math.abs(n3) - 2;
        }
        return n2;
    }

    final int A(int n2) {
        if (!this.y()) {
            return 1;
        }
        if ((n2 = this.z(n2)) == -1) {
            return this.j;
        }
        return n2 + this.j + 1;
    }

    final void B() {
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
    final boolean C(String string) {
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
    final boolean D(String string) {
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

    final boolean E(char c2) {
        boolean bl = !this.w() && this.a[this.e] == c2;
        return bl;
    }

    final boolean F(char ... cArray) {
        if (this.w()) {
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

    final boolean G(char[] cArray) {
        this.b();
        boolean bl = !this.w() && Arrays.binarySearch(cArray, this.a[this.e]) >= 0;
        return bl;
    }

    final boolean H() {
        boolean bl;
        block5: {
            block4: {
                bl = this.w();
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

    final boolean I() {
        boolean bl = this.w();
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

    final boolean J() {
        boolean bl = this.w();
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

    final int K(CharSequence charSequence) {
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

    public final int L() {
        return this.f + this.e;
    }

    final void M() {
        int n2 = this.g;
        if (n2 != -1) {
            this.e = n2;
            this.g = -1;
            return;
        }
        throw new b(new IOException("Mark invalid"));
    }

    public final void O(boolean bl) {
        if (bl && this.i == null) {
            this.i = new ArrayList(409);
            this.N();
        } else if (!bl) {
            this.i = null;
        }
    }

    final void P() {
        int n2 = this.e;
        if (n2 >= 1) {
            this.e = n2 - 1;
            return;
        }
        throw new b(new IOException("WTF: No buffer left to unconsume."));
    }

    final void Q() {
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

    final int e(int n2) {
        if (!this.y()) {
            return n2 + 1;
        }
        int n3 = this.z(n2);
        if (n3 == -1) {
            return n2 + 1;
        }
        return n2 - this.i.get(n3) + 1;
    }

    final char f() {
        this.b();
        char c2 = this.x() ? (char)'\uffff' : this.a[this.e];
        ++this.e;
        return c2;
    }

    final String g(boolean bl) {
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
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String h() {
        char c2;
        int n2;
        int n3 = this.e;
        int n4 = this.c;
        Object object = this.a;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '&' && c2 != '<'; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String i() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        while ((n2 = this.e) < this.c && (c2 = this.a[n2]) >= '0' && c2 <= '9') {
            this.e = n2 + 1;
        }
        return com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, n2 - n3);
    }

    final String j() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        while ((n2 = this.e) < this.c && ((c2 = this.a[n2]) >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'F' || c2 >= 'a' && c2 <= 'f')) {
            this.e = n2 + 1;
        }
        return com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, n2 - n3);
    }

    final String k() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        while ((n2 = ++this.e) < this.c && ((c2 = this.a[n2]) >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2))) {
        }
        return com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, this.e - n3);
    }

    final String l() {
        int n2;
        char[] cArray;
        char c2;
        int n3;
        this.b();
        int n4 = this.e;
        while ((n3 = ++this.e) < this.c && ((c2 = this.a[n3]) >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || Character.isLetter(c2))) {
        }
        while (!this.x() && (n3 = (cArray = this.a)[n2 = this.e]) >= 48 && n3 <= 57) {
            this.e = n2 + 1;
        }
        return com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n4, this.e - n4);
    }

    final String m() {
        char c2;
        int n2;
        int n3 = this.e;
        int n4 = this.c;
        Object object = this.a;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\u0000' && c2 != '<'; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String n() {
        char c2;
        int n2;
        this.b();
        int n3 = this.e;
        int n4 = this.c;
        Object object = this.a;
        for (n2 = n3; n2 < n4 && (c2 = object[n2]) != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ' && c2 != '/' && c2 != '<' && c2 != '>'; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String o() {
        int n2 = this.K("]]>");
        if (n2 != -1) {
            String string = com.github.catvod.spider.merge.f1.a.c(this.a, this.h, this.e, n2);
            this.e += n2;
            return string;
        }
        int n3 = this.c;
        n2 = this.e;
        if (n3 - n2 < 3) {
            return this.s();
        }
        n3 = n3 - 3 + 1;
        String string = com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n2, n3 - n2);
        this.e = n3;
        return string;
    }

    public final String p(char c2) {
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
            String string = com.github.catvod.spider.merge.f1.a.c(this.a, this.h, this.e, c2);
            this.e += c2;
            return string;
        }
        return this.s();
    }

    public final String q(char ... object) {
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
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String r(char ... object) {
        int n2;
        this.b();
        int n3 = this.e;
        int n4 = this.c;
        char[] cArray = this.a;
        for (n2 = n3; n2 < n4 && Arrays.binarySearch((char[])object, cArray[n2]) < 0; ++n2) {
        }
        this.e = n2;
        object = n2 > n3 ? (Object)com.github.catvod.spider.merge.f1.a.c(this.a, this.h, n3, n2 - n3) : (Object)"";
        return object;
    }

    final String s() {
        this.b();
        Object object = this.a;
        String[] stringArray = this.h;
        int n2 = this.e;
        object = com.github.catvod.spider.merge.f1.a.c(object, stringArray, n2, this.c - n2);
        this.e = this.c;
        return object;
    }

    final boolean t(String string) {
        int n2;
        boolean bl = string.equals(this.l);
        boolean bl2 = false;
        int n3 = -1;
        if (bl) {
            n2 = this.m;
            if (n2 == -1) {
                return false;
            }
            if (n2 >= this.e) {
                return true;
            }
        }
        this.l = string;
        Locale locale = Locale.ENGLISH;
        n2 = this.K(string.toLowerCase(locale));
        if (n2 > -1) {
            this.m = this.e + n2;
            return true;
        }
        n2 = this.K(string.toUpperCase(locale));
        if (n2 > -1) {
            bl2 = true;
        }
        if (bl2) {
            n3 = this.e + n2;
        }
        this.m = n3;
        return bl2;
    }

    public final String toString() {
        int n2 = this.c;
        int n3 = this.e;
        if (n2 - n3 < 0) {
            return "";
        }
        return new String(this.a, n3, n2 - n3);
    }

    public final char u() {
        this.b();
        char c2 = this.x() ? (char)'\uffff' : this.a[this.e];
        return c2;
    }

    final String v() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.A(this.f + this.e));
        stringBuilder.append(":");
        stringBuilder.append(this.e(this.f + this.e));
        return stringBuilder.toString();
    }

    public final boolean w() {
        this.b();
        boolean bl = this.e >= this.c;
        return bl;
    }

    public final boolean y() {
        boolean bl = this.i != null;
        return bl;
    }
}

