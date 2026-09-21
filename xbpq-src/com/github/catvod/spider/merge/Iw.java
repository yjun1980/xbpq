/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.DQ;
import com.github.catvod.spider.merge.Lh;
import com.github.catvod.spider.merge.Lk;
import com.github.catvod.spider.merge.PU;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Rz;
import com.github.catvod.spider.merge.aI;
import com.github.catvod.spider.merge.fZ;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.gv;
import com.github.catvod.spider.merge.hs;
import com.github.catvod.spider.merge.i3;
import com.github.catvod.spider.merge.jk;
import com.github.catvod.spider.merge.oU;
import com.github.catvod.spider.merge.qF;
import com.github.catvod.spider.merge.tv;
import com.github.catvod.spider.merge.uM;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class Iw
extends A0 {
    private static final Pattern OL;
    private static final List<Iw> b;
    private static final String l;
    List<A0> HM;
    @Nullable
    private WeakReference<List<Iw>> N;
    @Nullable
    private Rz n;
    private hs tT;

    static {
        b = Collections.emptyList();
        OL = Pattern.compile("\\s+");
        l = "/baseUri";
    }

    public Iw(hs hs2, String string) {
        this(hs2, string, null);
    }

    public Iw(hs hs2, @Nullable String string, @Nullable Rz rz) {
        Rc.HM(hs2);
        this.HM = A0.l8;
        this.n = rz;
        this.tT = hs2;
        if (string != null) {
            this.o(string);
        }
    }

    private static String DX(Iw iw, String string) {
        while (iw != null) {
            Rz rz = iw.n;
            if (rz != null && rz.cD(string)) {
                return iw.n.v(string);
            }
            iw = iw.L();
        }
        return "";
    }

    private static void FG(Iw iw, StringBuilder stringBuilder) {
        if (iw.tT.T4().equals("br") && !DQ.Y(stringBuilder)) {
            stringBuilder.append(" ");
        }
    }

    static boolean Kw(@Nullable A0 a02) {
        if (a02 instanceof Iw) {
            Iw iw;
            a02 = (Iw)a02;
            int n2 = 0;
            do {
                if (((Iw)a02).tT.v()) {
                    return true;
                }
                iw = ((Iw)a02).L();
                if (++n2 >= 6) break;
                a02 = iw;
            } while (iw != null);
        }
        return false;
    }

    private void b6(StringBuilder stringBuilder) {
        for (A0 a02 : this.HM) {
            if (a02 instanceof DQ) {
                Iw.x(stringBuilder, (DQ)a02);
                continue;
            }
            if (!(a02 instanceof Iw)) continue;
            Iw.FG((Iw)a02, stringBuilder);
        }
    }

    private boolean e(g9.aA aA2) {
        boolean bl = this.cE().tT() && !this.cE().OL() && (this.L() == null || this.L().OT()) && this.oH() != null && !aA2.tT();
        return bl;
    }

    private static <E extends Iw> int n6(Iw iw, List<E> list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (list.get(i2) != iw) continue;
            return i2;
        }
        return 0;
    }

    private boolean vi(g9.aA aA2) {
        boolean bl = this.tT.S() || this.L() != null && this.L().cE().S() || aA2.tT();
        return bl;
    }

    private static void x(StringBuilder stringBuilder, DQ dQ) {
        String string = dQ.FG();
        if (!Iw.Kw(dQ.S) && !(dQ instanceof PU)) {
            tv.l8(stringBuilder, string, DQ.Y(stringBuilder));
        } else {
            stringBuilder.append(string);
        }
    }

    public Iw B(String string, String string2) {
        super.b(string, string2);
        return this;
    }

    @Override
    protected boolean E9() {
        boolean bl = this.n != null;
        return bl;
    }

    public String F() {
        return this.tT.T4();
    }

    public String GO() {
        StringBuilder stringBuilder = tv.S();
        uM.S(new Lk(this, stringBuilder){
            final Iw S;
            final StringBuilder l8;
            {
                this.S = iw;
                this.l8 = stringBuilder;
            }

            @Override
            public void S(A0 a02, int n2) {
                if (a02 instanceof DQ) {
                    a02 = (DQ)a02;
                    Iw.x(this.l8, (DQ)a02);
                } else if (a02 instanceof Iw) {
                    a02 = (Iw)a02;
                    if (this.l8.length() > 0 && (((Iw)a02).OT() || ((Iw)a02).tT.T4().equals("br")) && !DQ.Y(this.l8)) {
                        this.l8.append(' ');
                    }
                }
            }

            @Override
            public void l8(A0 a02, int n2) {
                if (a02 instanceof Iw && ((Iw)a02).OT() && a02.eD() instanceof DQ && !DQ.Y(this.l8)) {
                    this.l8.append(' ');
                }
            }
        }, this);
        return tv.cD(stringBuilder).trim();
    }

    public Iw H() {
        return (Iw)super.v();
    }

    @Override
    public int HM() {
        return this.HM.size();
    }

    protected Iw I(@Nullable A0 cloneable) {
        Iw iw = (Iw)super.A((A0)cloneable);
        cloneable = this.n;
        cloneable = cloneable != null ? ((Rz)cloneable).HM() : null;
        iw.n = cloneable;
        cloneable = new ut(iw, this.HM.size());
        iw.HM = cloneable;
        cloneable.addAll(this.HM);
        return iw;
    }

    public String J() {
        StringBuilder stringBuilder = tv.S();
        for (A0 a02 : this.HM) {
            if (a02 instanceof Lh) {
                stringBuilder.append(((Lh)a02).FG());
                continue;
            }
            if (a02 instanceof qF) {
                stringBuilder.append(((qF)a02).FG());
                continue;
            }
            if (a02 instanceof Iw) {
                stringBuilder.append(((Iw)a02).J());
                continue;
            }
            if (!(a02 instanceof PU)) continue;
            stringBuilder.append(((PU)a02).FG());
        }
        return tv.cD(stringBuilder);
    }

    public boolean Jb(String string) {
        Object object = this.n;
        if (object == null) {
            return false;
        }
        object = ((Rz)object).A("class");
        int n2 = ((String)object).length();
        int n3 = string.length();
        if (n2 != 0 && n2 >= n3) {
            if (n2 == n3) {
                return string.equalsIgnoreCase((String)object);
            }
            boolean bl = false;
            int n4 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n5;
                boolean bl2;
                if (Character.isWhitespace(((String)object).charAt(i2))) {
                    bl2 = bl;
                    n5 = n4;
                    if (bl) {
                        if (i2 - n4 == n3 && ((String)object).regionMatches(true, n4, string, 0, n3)) {
                            return true;
                        }
                        bl2 = false;
                        n5 = n4;
                    }
                } else {
                    bl2 = bl;
                    n5 = n4;
                    if (!bl) {
                        n5 = i2;
                        bl2 = true;
                    }
                }
                bl = bl2;
                n4 = n5;
            }
            if (bl && n2 - n4 == n3) {
                return ((String)object).regionMatches(true, n4, string, 0, n3);
            }
        }
        return false;
    }

    public List<DQ> KP() {
        ArrayList<DQ> arrayList = new ArrayList<DQ>();
        for (A0 a02 : this.HM) {
            if (!(a02 instanceof DQ)) continue;
            arrayList.add((DQ)a02);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iw L() {
        return (Iw)this.S;
    }

    public jk LD(String string) {
        return aI.l8(string, this);
    }

    public Iw Nb() {
        return (Iw)super.PP();
    }

    @Override
    public Rz OL() {
        if (this.n == null) {
            this.n = new Rz();
        }
        return this.n;
    }

    public boolean OT() {
        return this.tT.b();
    }

    @Override
    public String Q() {
        return this.tT.T4();
    }

    @Override
    void R(Appendable appendable, int n2, g9.aA aA2) {
        if (!this.HM.isEmpty() || !this.tT.HM()) {
            if (aA2.HM() && !this.HM.isEmpty() && (this.tT.S() || aA2.tT() && (this.HM.size() > 1 || this.HM.size() == 1 && !(this.HM.get(0) instanceof DQ)))) {
                this.c(appendable, n2, aA2);
            }
            appendable.append("</").append(this.F()).append('>');
        }
    }

    public Iw U(int n2) {
        return this.ec().get(n2);
    }

    public String UM() {
        StringBuilder stringBuilder = tv.S();
        this.b6(stringBuilder);
        return tv.cD(stringBuilder).trim();
    }

    public jk Ut() {
        if (this.S == null) {
            return new jk(0);
        }
        Object object = this.L().ec();
        jk jk2 = new jk(object.size() - 1);
        object = object.iterator();
        while (object.hasNext()) {
            Iw iw = (Iw)object.next();
            if (iw == this) continue;
            jk2.add(iw);
        }
        return jk2;
    }

    @Override
    void W() {
        super.W();
        this.N = null;
    }

    @Nullable
    public Iw W8() {
        if (this.S == null) {
            return null;
        }
        List<Iw> list = this.L().ec();
        int n2 = Iw.n6(this, list);
        if (n2 > 0) {
            return list.get(n2 - 1);
        }
        return null;
    }

    public String Xc() {
        CharSequence charSequence = tv.S();
        this.nZ(charSequence);
        String string = tv.cD(charSequence);
        charSequence = string;
        if (gv.l8(this).HM()) {
            charSequence = string.trim();
        }
        return charSequence;
    }

    public Iw Y(A0 a02) {
        return (Iw)super.tT(a02);
    }

    @Override
    protected void cD(String string) {
        this.OL().W(l, string);
    }

    public hs cE() {
        return this.tT;
    }

    List<Iw> ec() {
        Object object;
        block6: {
            Object object2;
            block5: {
                if (this.HM() == 0) {
                    return b;
                }
                object = this.N;
                if (object == null) break block5;
                object2 = (List)((Reference)object).get();
                object = object2;
                if (object2 != null) break block6;
            }
            int n2 = this.HM.size();
            object = new ArrayList<Iw>(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = this.HM.get(i2);
                if (!(object2 instanceof Iw)) continue;
                object.add((Iw)((Iw)object2));
            }
            this.N = new WeakReference<ArrayList<Iw>>((ArrayList<Iw>)object);
        }
        return object;
    }

    public Iw f(A0 a02) {
        Rc.HM(a02);
        this.O(a02);
        this.hR();
        this.HM.add(a02);
        a02.y(this.HM.size() - 1);
        return this;
    }

    public jk gh() {
        return fZ.l8(new i3.aA(), this);
    }

    public String h() {
        Object object = this.n;
        object = object != null ? ((Rz)object).A("id") : "";
        return object;
    }

    @Override
    protected List<A0> hR() {
        if (this.HM == A0.l8) {
            this.HM = new ut(this, 4);
        }
        return this.HM;
    }

    public jk im() {
        return new jk(this.ec());
    }

    @Override
    public String l() {
        return Iw.DX(this, l);
    }

    public String m() {
        return this.tT.n();
    }

    public <T extends Appendable> T nZ(T t2) {
        int n2 = this.HM.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.HM.get(i2).OY(t2);
        }
        return t2;
    }

    @Nullable
    public Iw pu(String string) {
        return aI.T4(string, this);
    }

    public Iw r0() {
        this.HM.clear();
        return this;
    }

    @Override
    void r1(Appendable appendable, int n2, g9.aA aA2) {
        if (aA2.HM() && this.vi(aA2) && !this.e(aA2)) {
            if (appendable instanceof StringBuilder) {
                if (((StringBuilder)appendable).length() > 0) {
                    this.c(appendable, n2, aA2);
                }
            } else {
                this.c(appendable, n2, aA2);
            }
        }
        appendable.append('<').append(this.F());
        Rz rz = this.n;
        if (rz != null) {
            rz.Kf(appendable, aA2);
        }
        if (this.HM.isEmpty() && this.tT.HM()) {
            if (aA2.n() == g9.aA.aA.l8 && this.tT.OL()) {
                appendable.append('>');
            } else {
                appendable.append(" />");
            }
        } else {
            appendable.append('>');
        }
    }

    public int t2() {
        if (this.L() == null) {
            return 0;
        }
        return Iw.n6(this, this.L().ec());
    }

    private static final class ut
    extends oU<A0> {
        private final Iw l8;

        ut(Iw iw, int n2) {
            super(n2);
            this.l8 = iw;
        }

        @Override
        public void l8() {
            this.l8.W();
        }
    }
}

