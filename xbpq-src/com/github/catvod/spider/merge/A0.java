/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.E;
import com.github.catvod.spider.merge.Lk;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Rz;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.gv;
import com.github.catvod.spider.merge.tv;
import com.github.catvod.spider.merge.uM;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public abstract class A0
implements Cloneable {
    static final List<A0> l8 = Collections.emptyList();
    @Nullable
    A0 S;
    int T4;

    protected A0() {
    }

    private void A0(int n2) {
        List<A0> list = this.hR();
        while (n2 < list.size()) {
            list.get(n2).y(n2);
            ++n2;
        }
    }

    protected A0 A(@Nullable A0 a02) {
        try {
            A0 a03 = (A0)super.clone();
            a03.S = a02;
            int n2 = a02 == null ? 0 : this.T4;
            a03.T4 = n2;
            return a03;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    protected void Bz(A0 a02, A0 a03) {
        boolean bl = a02.S == this;
        Rc.T4(bl);
        Rc.HM(a03);
        A0 a04 = a03.S;
        if (a04 != null) {
            a04.d(a03);
        }
        int n2 = a02.T4;
        this.hR().set(n2, a03);
        a03.S = this;
        a03.y(n2);
        a02.S = null;
    }

    public String C() {
        StringBuilder stringBuilder = tv.S();
        this.OY(stringBuilder);
        return tv.cD(stringBuilder);
    }

    protected abstract boolean E9();

    @Nullable
    public A0 G() {
        return this.S;
    }

    public void H6(A0 a02) {
        Rc.HM(a02);
        Rc.HM(this.S);
        this.S.Bz(this, a02);
    }

    public abstract int HM();

    public boolean Kf(String string) {
        Rc.HM(string);
        if (!this.E9()) {
            return false;
        }
        if (string.startsWith("abs:")) {
            String string2 = string.substring(4);
            if (this.OL().s(string2) && !this.l8(string2).isEmpty()) {
                return true;
            }
        }
        return this.OL().s(string);
    }

    public List<A0> M() {
        Cloneable cloneable = this.S;
        if (cloneable == null) {
            return Collections.emptyList();
        }
        Object object = ((A0)cloneable).hR();
        cloneable = new ArrayList(object.size() - 1);
        object = object.iterator();
        while (object.hasNext()) {
            A0 a02 = (A0)object.next();
            if (a02 == this) continue;
            cloneable.add(a02);
        }
        return cloneable;
    }

    public A0 N(int n2) {
        return this.hR().get(n2);
    }

    protected void O(A0 a02) {
        a02.mF(this);
    }

    public abstract Rz OL();

    protected void OY(Appendable appendable) {
        uM.S(new aA(appendable, gv.l8(this)), this);
    }

    public A0 PP() {
        A0 a02;
        A0 a03 = this;
        while ((a02 = a03.S) != null) {
            a03 = a02;
        }
        return a03;
    }

    public abstract String Q();

    abstract void R(Appendable var1, int var2, g9.aA var3);

    protected void S(int n2, A0 ... a0Array) {
        int n3;
        int n4;
        Rc.HM(a0Array);
        if (a0Array.length == 0) {
            return;
        }
        List<A0> list = this.hR();
        int n5 = 0;
        A0 a02 = a0Array[0].G();
        if (a02 != null && a02.HM() == a0Array.length) {
            block7: {
                List<A0> list2 = a02.hR();
                n4 = a0Array.length;
                while (true) {
                    n3 = n4 - 1;
                    if (n4 <= 0) break;
                    if (a0Array[n3] != list2.get(n3)) {
                        n4 = 0;
                        break block7;
                    }
                    n4 = n3;
                }
                n4 = 1;
            }
            if (n4 != 0) {
                a02.s();
                list.addAll(n2, Arrays.asList(a0Array));
                n4 = a0Array.length;
                while (true) {
                    n5 = n4 - 1;
                    if (n4 <= 0) break;
                    a0Array[n5].S = this;
                    n4 = n5;
                }
                this.A0(n2);
                return;
            }
        }
        Rc.OL(a0Array);
        n3 = a0Array.length;
        for (n4 = n5; n4 < n3; ++n4) {
            this.O(a0Array[n4]);
        }
        list.addAll(n2, Arrays.asList(a0Array));
        this.A0(n2);
    }

    public String T4(String string) {
        Rc.HM(string);
        if (!this.E9()) {
            return "";
        }
        String string2 = this.OL().A(string);
        if (string2.length() > 0) {
            return string2;
        }
        if (string.startsWith("abs:")) {
            return this.l8(string.substring(4));
        }
        return "";
    }

    void W() {
    }

    public int Ws() {
        return this.T4;
    }

    public A0 b(String string, String string2) {
        string = gv.S(this).b().l8(string);
        this.OL().OY(string, string2);
        return this;
    }

    @Nullable
    public g9 bc() {
        A0 a02 = this.PP();
        a02 = a02 instanceof g9 ? (g9)a02 : null;
        return a02;
    }

    protected void c(Appendable appendable, int n2, g9.aA aA2) {
        appendable.append('\n').append(tv.A(n2 * aA2.l()));
    }

    protected abstract void cD(String var1);

    protected void d(A0 a02) {
        boolean bl = a02.S == this;
        Rc.T4(bl);
        int n2 = a02.T4;
        this.hR().remove(n2);
        this.A0(n2);
        a02.S = null;
    }

    @Nullable
    public A0 eD() {
        Object object = this.S;
        if (object == null) {
            return null;
        }
        object = ((A0)object).hR();
        int n2 = this.T4 + 1;
        if (object.size() > n2) {
            return (A0)object.get(n2);
        }
        return null;
    }

    public boolean equals(Object object) {
        boolean bl = this == object;
        return bl;
    }

    protected abstract List<A0> hR();

    public void hd() {
        Rc.HM(this.S);
        this.S.d(this);
    }

    public abstract String l();

    public String l8(String string) {
        Rc.tT(string);
        if (this.E9() && this.OL().s(string)) {
            return tv.s(this.l(), this.OL().A(string));
        }
        return "";
    }

    protected void mF(A0 a02) {
        Rc.HM(a02);
        A0 a03 = this.S;
        if (a03 != null) {
            a03.d(this);
        }
        this.S = a02;
    }

    public List<A0> n() {
        if (this.HM() == 0) {
            return l8;
        }
        List<A0> list = this.hR();
        ArrayList<A0> arrayList = new ArrayList<A0>(list.size());
        arrayList.addAll(list);
        return Collections.unmodifiableList(arrayList);
    }

    public void o(String string) {
        Rc.HM(string);
        this.cD(string);
    }

    @Nullable
    public A0 oH() {
        A0 a02 = this.S;
        if (a02 == null) {
            return null;
        }
        if (this.T4 > 0) {
            return a02.hR().get(this.T4 - 1);
        }
        return null;
    }

    abstract void r1(Appendable var1, int var2, g9.aA var3);

    @Nullable
    public final A0 rD() {
        return this.S;
    }

    public abstract A0 s();

    public A0 tT(A0 a02) {
        Rc.HM(a02);
        Rc.HM(this.S);
        this.S.S(this.T4, a02);
        return this;
    }

    public String toString() {
        return this.C();
    }

    public boolean uS() {
        boolean bl = this.S != null;
        return bl;
    }

    public A0 v() {
        A0 a02 = this.A(null);
        LinkedList<A0> linkedList = new LinkedList<A0>();
        linkedList.add(a02);
        while (!linkedList.isEmpty()) {
            A0 a03 = (A0)linkedList.remove();
            int n2 = a03.HM();
            for (int i2 = 0; i2 < n2; ++i2) {
                List<A0> list = a03.hR();
                A0 a04 = list.get(i2).A(a03);
                list.set(i2, a04);
                linkedList.add(a04);
            }
        }
        return a02;
    }

    protected void y(int n2) {
        this.T4 = n2;
    }

    private static class aA
    implements Lk {
        private final g9.aA S;
        private final Appendable l8;

        aA(Appendable appendable, g9.aA aA2) {
            this.l8 = appendable;
            this.S = aA2;
            aA2.N();
        }

        @Override
        public void S(A0 a02, int n2) {
            try {
                a02.r1(this.l8, n2, this.S);
                return;
            }
            catch (IOException iOException) {
                throw new E(iOException);
            }
        }

        @Override
        public void l8(A0 a02, int n2) {
            if (!a02.Q().equals("#text")) {
                try {
                    a02.R(this.l8, n2, this.S);
                }
                catch (IOException iOException) {
                    throw new E(iOException);
                }
            }
        }
    }
}

