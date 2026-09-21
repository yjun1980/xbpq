/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.E;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Y9;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.in;
import com.github.catvod.spider.merge.kA;
import com.github.catvod.spider.merge.rO;
import com.github.catvod.spider.merge.tv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class Rz
implements Iterable<in>,
Cloneable {
    String[] S = new String[3];
    String[] T4 = new String[3];
    private int l8 = 0;

    static String N(@Nullable String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    static String c(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('/');
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private boolean eD(String string) {
        boolean bl = true;
        if (string == null || string.length() <= 1 || string.charAt(0) != '/') {
            bl = false;
        }
        return bl;
    }

    private void r1(int n2) {
        boolean bl = n2 >= this.l8;
        Rc.S(bl);
        int n3 = this.l8 - n2 - 1;
        if (n3 > 0) {
            String[] stringArray = this.S;
            int n4 = n2 + 1;
            System.arraycopy(stringArray, n4, stringArray, n2, n3);
            stringArray = this.T4;
            System.arraycopy(stringArray, n4, stringArray, n2, n3);
        }
        this.l8 = n2 = this.l8 - 1;
        this.S[n2] = null;
        this.T4[n2] = null;
    }

    private void tT(int n2) {
        boolean bl = n2 >= this.l8;
        Rc.T4(bl);
        String[] stringArray = this.S;
        int n3 = stringArray.length;
        if (n3 >= n2) {
            return;
        }
        int n4 = 3;
        if (n3 >= 3) {
            n4 = this.l8 * 2;
        }
        if (n2 <= n4) {
            n2 = n4;
        }
        this.S = Arrays.copyOf(stringArray, n2);
        this.T4 = Arrays.copyOf(this.T4, n2);
    }

    private int uS(String string) {
        Rc.HM(string);
        for (int i2 = 0; i2 < this.l8; ++i2) {
            if (!string.equalsIgnoreCase(this.S[i2])) continue;
            return i2;
        }
        return -1;
    }

    public String A(String string) {
        int n2 = this.uS(string);
        string = n2 == -1 ? "" : Rz.N(this.T4[n2]);
        return string;
    }

    public Rz C(in in2) {
        Rc.HM(in2);
        this.W(in2.S(), in2.T4());
        in2.b = this;
        return this;
    }

    int E9(String string) {
        Rc.HM(string);
        for (int i2 = 0; i2 < this.l8; ++i2) {
            if (!string.equals(this.S[i2])) continue;
            return i2;
        }
        return -1;
    }

    public Rz HM() {
        Rz rz;
        try {
            rz = (Rz)super.clone();
            rz.l8 = this.l8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        this.S = Arrays.copyOf(this.S, this.l8);
        this.T4 = Arrays.copyOf(this.T4, this.l8);
        return rz;
    }

    final void Kf(Appendable appendable, g9.aA aA2) {
        int n2 = this.l8;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.eD(this.S[i2])) continue;
            String string = this.S[i2];
            String string2 = this.T4[i2];
            appendable.append(' ').append(string);
            if (in.HM(string, string2, aA2)) continue;
            appendable.append("=\"");
            string = string2;
            if (string2 == null) {
                string = "";
            }
            Y9.OL(appendable, string, aA2, true, false, false);
            appendable.append('\"');
        }
    }

    public void OL(Rz object) {
        if (((Rz)object).size() == 0) {
            return;
        }
        this.tT(this.l8 + ((Rz)object).l8);
        object = ((Rz)object).iterator();
        while (object.hasNext()) {
            this.C((in)object.next());
        }
    }

    void OY(String string, @Nullable String string2) {
        int n2 = this.uS(string);
        if (n2 != -1) {
            this.T4[n2] = string2;
            if (!this.S[n2].equals(string)) {
                this.S[n2] = string;
            }
        } else {
            this.b(string, string2);
        }
    }

    public void Q() {
        for (int i2 = 0; i2 < this.l8; ++i2) {
            String[] stringArray = this.S;
            stringArray[i2] = kA.l8(stringArray[i2]);
        }
    }

    public Rz W(String string, String string2) {
        Rc.HM(string);
        int n2 = this.E9(string);
        if (n2 != -1) {
            this.T4[n2] = string2;
        } else {
            this.b(string, string2);
        }
        return this;
    }

    public Rz b(String string, @Nullable String string2) {
        this.tT(this.l8 + 1);
        String[] stringArray = this.S;
        int n2 = this.l8;
        stringArray[n2] = string;
        this.T4[n2] = string2;
        this.l8 = n2 + 1;
        return this;
    }

    public boolean cD(String string) {
        boolean bl = this.E9(string) != -1;
        return bl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && Rz.class == object.getClass()) {
            object = (Rz)object;
            if (this.l8 != ((Rz)object).l8) {
                return false;
            }
            if (!Arrays.equals(this.S, ((Rz)object).S)) {
                return false;
            }
            return Arrays.equals(this.T4, ((Rz)object).T4);
        }
        return false;
    }

    public String hR() {
        StringBuilder stringBuilder = tv.S();
        try {
            g9 g92 = new g9("");
            this.Kf(stringBuilder, g92.K());
        }
        catch (IOException iOException) {
            throw new E(iOException);
        }
        return tv.cD(stringBuilder);
    }

    public int hashCode() {
        return (this.l8 * 31 + Arrays.hashCode(this.S)) * 31 + Arrays.hashCode(this.T4);
    }

    public boolean isEmpty() {
        boolean bl = this.l8 == 0;
        return bl;
    }

    @Override
    public Iterator<in> iterator() {
        return new Iterator<in>(this){
            final Rz S;
            int l8;
            {
                this.S = rz;
                this.l8 = 0;
            }

            @Override
            public boolean hasNext() {
                boolean bl;
                Rz rz;
                int n2;
                int n3;
                do {
                    n3 = ++this.l8;
                    n2 = this.S.l8;
                    bl = true;
                } while (n3 < n2 && (rz = this.S).eD(rz.S[this.l8]));
                if (this.l8 >= this.S.l8) {
                    bl = false;
                }
                return bl;
            }

            public in l8() {
                Rz rz = this.S;
                Object object = rz.S;
                int n2 = this.l8++;
                object = new in(object[n2], rz.T4[n2], rz);
                return object;
            }

            @Override
            public void remove() {
                int n2;
                Rz rz = this.S;
                this.l8 = n2 = this.l8 - 1;
                rz.r1(n2);
            }
        };
    }

    public List<in> l() {
        ArrayList<in> arrayList = new ArrayList<in>(this.l8);
        for (int i2 = 0; i2 < this.l8; ++i2) {
            if (this.eD(this.S[i2])) continue;
            arrayList.add(new in(this.S[i2], this.T4[i2], this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int n(rO stringArray) {
        boolean bl = this.isEmpty();
        int n2 = 0;
        if (bl) {
            return 0;
        }
        bl = stringArray.b();
        int n3 = 0;
        while (n2 < this.S.length) {
            int n4;
            int n5 = n4 = n2 + 1;
            while (n5 < (stringArray = this.S).length && stringArray[n5] != null) {
                int n6;
                int n7;
                block7: {
                    block6: {
                        if (bl && stringArray[n2].equals(stringArray[n5])) break block6;
                        n7 = n3;
                        n6 = n5;
                        if (bl) break block7;
                        stringArray = this.S;
                        n7 = n3;
                        n6 = n5;
                        if (!stringArray[n2].equalsIgnoreCase(stringArray[n5])) break block7;
                    }
                    n7 = n3 + 1;
                    this.r1(n5);
                    n6 = n5 - 1;
                }
                n5 = n6 + 1;
                n3 = n7;
            }
            n2 = n4;
        }
        return n3;
    }

    public boolean s(String string) {
        boolean bl = this.uS(string) != -1;
        return bl;
    }

    public int size() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.l8; ++i2) {
            int n3 = n2;
            if (!this.eD(this.S[i2])) {
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        return n2;
    }

    public String toString() {
        return this.hR();
    }

    public String v(String string) {
        int n2 = this.E9(string);
        string = n2 == -1 ? "" : Rz.N(this.T4[n2]);
        return string;
    }
}

