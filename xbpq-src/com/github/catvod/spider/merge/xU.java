/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.annotation.ParametersAreNonnullByDefault
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.B8;
import com.github.catvod.spider.merge.DQ;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.Lh;
import com.github.catvod.spider.merge.PU;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.cz;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.gx;
import com.github.catvod.spider.merge.hs;
import com.github.catvod.spider.merge.m;
import com.github.catvod.spider.merge.mt;
import com.github.catvod.spider.merge.oL;
import com.github.catvod.spider.merge.qF;
import com.github.catvod.spider.merge.rO;
import com.github.catvod.spider.merge.tv;
import com.github.catvod.spider.merge.vv;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

public class xU
extends gx {
    static final String[] A;
    static final String[] E9;
    static final String[] Kf;
    static final String[] cD;
    static final String[] hR;
    static final String[] s;
    static final String[] v;
    @Nullable
    private Iw C;
    private boolean G;
    private ArrayList<Iw> OY;
    @Nullable
    private Iw Q;
    private mt.XT R;
    @Nullable
    private vv W;
    private boolean bc;
    private oL c;
    private boolean eD;
    private String[] oH = new String[]{null};
    private List<String> r1;
    private boolean rD;
    private oL uS;

    static {
        v = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
        A = new String[]{"ol", "ul"};
        cD = new String[]{"button"};
        s = new String[]{"html", "table"};
        hR = new String[]{"optgroup", "option"};
        Kf = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
        E9 = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    }

    private void B(A0 a02) {
        Iw iw;
        if (this.OL.isEmpty()) {
            this.b.f(a02);
        } else if (this.H()) {
            this.x(a02);
        } else {
            this.l8().f(a02);
        }
        if (a02 instanceof Iw && (iw = (Iw)a02).cE().l() && (a02 = this.W) != null) {
            ((vv)a02).g(iw);
        }
    }

    private boolean PP(String string, String[] stringArray, String[] stringArray2) {
        String[] stringArray3 = this.oH;
        stringArray3[0] = string;
        return this.o(stringArray3, stringArray, stringArray2);
    }

    private void cE(ArrayList<Iw> arrayList, Iw iw, Iw iw2) {
        int n2 = arrayList.lastIndexOf(iw);
        boolean bl = n2 != -1;
        Rc.T4(bl);
        arrayList.set(n2, iw2);
    }

    private boolean im(ArrayList<Iw> arrayList, Iw iw) {
        int n2 = arrayList.size() - 1;
        int n3 = n2 >= 256 ? n2 - 256 : 0;
        while (n2 >= n3) {
            if (arrayList.get(n2) == iw) {
                return true;
            }
            --n2;
        }
        return false;
    }

    private boolean o(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        int n2 = this.OL.size() - 1;
        int n3 = n2 > 100 ? n2 - 100 : 0;
        while (n2 >= n3) {
            String string = this.OL.get(n2).m();
            if (tv.b(string, stringArray)) {
                return true;
            }
            if (tv.b(string, stringArray2)) {
                return false;
            }
            if (stringArray3 != null && tv.b(string, stringArray3)) {
                return false;
            }
            --n2;
        }
        return false;
    }

    private void s(String ... stringArray) {
        Iw iw;
        for (int i2 = this.OL.size() - 1; i2 >= 0 && !tv.T4((iw = this.OL.get(i2)).m(), stringArray) && !iw.m().equals("html"); --i2) {
            this.OL.remove(i2);
        }
    }

    private boolean t2(Iw iw, Iw iw2) {
        boolean bl = iw.m().equals(iw2.m()) && iw.OL().equals(iw2.OL());
        return bl;
    }

    void A(Iw iw) {
        Iw iw2;
        int n2 = 0;
        for (int i2 = this.OY.size() - 1; i2 >= 0 && (iw2 = this.OY.get(i2)) != null; --i2) {
            int n3 = n2;
            if (this.t2(iw, iw2)) {
                n3 = n2 + 1;
            }
            if (n3 == 3) {
                this.OY.remove(i2);
                break;
            }
            n2 = n3;
        }
    }

    boolean A0(String string) {
        return this.O(string, cD);
    }

    boolean Bz(String[] stringArray) {
        return this.o(stringArray, v, null);
    }

    Iw C(String string) {
        Iw iw;
        for (int i2 = this.OY.size() - 1; i2 >= 0 && (iw = this.OY.get(i2)) != null; --i2) {
            if (!iw.m().equals(string)) continue;
            return iw;
        }
        return null;
    }

    Iw DL(mt.i i2) {
        hs hs2 = hs.hR(i2.G(), this.N);
        Iw iw = new Iw(hs2, null, this.N.S(i2.n));
        this.B(iw);
        if (i2.bc()) {
            if (hs2.N()) {
                if (!hs2.OL()) {
                    this.T4.c("Tag cannot be self closing; not a void tag");
                }
            } else {
                hs2.cD();
            }
        }
        return iw;
    }

    void DX(Iw iw) {
        for (int i2 = this.OY.size() - 1; i2 >= 0; --i2) {
            if (this.OY.get(i2) != iw) continue;
            this.OY.remove(i2);
            break;
        }
    }

    void E9() {
        this.s("tr", "template");
    }

    void F(Iw iw, Iw iw2) {
        this.cE(this.OL, iw, iw2);
    }

    void FG() {
        this.OY.add(null);
    }

    Iw G() {
        return this.Q;
    }

    void GO() {
        boolean bl = false;
        for (int i2 = this.OL.size() - 1; i2 >= 0; --i2) {
            Object object = this.OL.get(i2);
            if (i2 == 0) {
                object = this.C;
                bl = true;
            }
            if ("select".equals(object = object != null ? ((Iw)object).m() : "")) {
                this.T(oL.Kf);
                break;
            }
            if (!("td".equals(object) || "th".equals(object) && !bl)) {
                if ("tr".equals(object)) {
                    this.T(oL.s);
                    break;
                }
                if (!("tbody".equals(object) || "thead".equals(object) || "tfoot".equals(object))) {
                    if ("caption".equals(object)) {
                        this.T(oL.v);
                        break;
                    }
                    if ("colgroup".equals(object)) {
                        this.T(oL.A);
                        break;
                    }
                    if ("table".equals(object)) {
                        this.T(oL.HM);
                        break;
                    }
                    if ("head".equals(object)) {
                        this.T(oL.tT);
                        break;
                    }
                    if ("body".equals(object)) {
                        this.T(oL.tT);
                        break;
                    }
                    if ("frameset".equals(object)) {
                        this.T(oL.c);
                        break;
                    }
                    if ("html".equals(object)) {
                        this.T(oL.T4);
                        break;
                    }
                    if (!bl) continue;
                    this.T(oL.tT);
                    break;
                }
                this.T(oL.cD);
                break;
            }
            this.T(oL.hR);
            break;
        }
    }

    boolean H() {
        return this.G;
    }

    boolean H6(String string) {
        for (int i2 = this.OL.size() - 1; i2 >= 0; --i2) {
            String string2 = this.OL.get(i2).m();
            if (string2.equals(string)) {
                return true;
            }
            if (tv.b(string2, hR)) continue;
            return false;
        }
        Rc.l8("Should not be reachable");
        return false;
    }

    boolean I(Iw iw) {
        return this.im(this.OY, iw);
    }

    boolean J() {
        return this.rD;
    }

    void Jb() {
        this.c = this.uS;
    }

    void K(Iw iw) {
        this.Q = iw;
    }

    void KP(vv vv2) {
        this.W = vv2;
    }

    void Kf() {
        this.s("table");
    }

    void Kw(Iw iw) {
        this.A(iw);
        this.OY.add(iw);
    }

    void L(Iw iw) {
        this.OL.add(iw);
    }

    boolean LD(Iw iw) {
        for (int i2 = this.OL.size() - 1; i2 >= 0; --i2) {
            if (this.OL.get(i2) != iw) continue;
            this.OL.remove(i2);
            return true;
        }
        return false;
    }

    void Lw(mt.c c2) {
        this.B(new qF(c2.c()));
    }

    void M(mt.Y object) {
        Object object2 = this.l8();
        Iw iw = object2;
        if (object2 == null) {
            iw = this.b;
        }
        object2 = iw.m();
        String string = ((mt.Y)object).E9();
        object = ((mt)object).l() ? new PU(string) : (this.ec((String)object2) ? new Lh(string) : new DQ(string));
        iw.f((A0)object);
    }

    /*
     * Unable to fully structure code
     */
    void Nb() {
        var5_1 = this.gh();
        if (var5_1 != null && !this.h((Iw)var5_1)) {
            var1_2 = this.OY.size();
            var3_3 = true;
            var1_2 = var4_4 = var1_2 - 1;
            while (var1_2 != 0) {
                var5_1 = this.OY;
                var2_5 = var1_2 - 1;
                var6_6 = (Iw)var5_1.get(var2_5);
                var5_1 = var6_6;
                var1_2 = var2_5;
                if (var6_6 != null) {
                    var5_1 = var6_6;
                    var1_2 = var2_5;
                    if (!this.h(var6_6)) continue;
                    var1_2 = var2_5;
                    var5_1 = var6_6;
                }
                while (true) {
                    var3_3 = false;
                    break;
                }
                break;
            }
            var2_5 = var1_2;
            if (!var3_3) {
                var5_1 = this.OY;
                var2_5 = var1_2 + 1;
                var5_1 = (Iw)var5_1.get(var2_5);
            }
            Rc.HM(var5_1);
            var6_6 = this.U(var5_1.m());
            var6_6.OL().OL(var5_1.OL());
            this.OY.set(var2_5, var6_6);
            var1_2 = var2_5;
            if (var2_5 != var4_4) ** continue;
        }
    }

    boolean O(String string, String[] stringArray) {
        return this.PP(string, v, stringArray);
    }

    Iw OT() {
        int n2 = this.OL.size();
        return this.OL.remove(n2 - 1);
    }

    String OY() {
        return this.l;
    }

    void Q() {
        this.W(null);
    }

    vv R() {
        return this.W;
    }

    @Override
    rO S() {
        return rO.l8;
    }

    void T(oL oL2) {
        this.uS = oL2;
    }

    Iw U(String object) {
        object = new Iw(hs.hR((String)object, this.N), null);
        this.Ws((Iw)object);
        return object;
    }

    int UM(Iw iw) {
        for (int i2 = 0; i2 < this.OY.size(); ++i2) {
            if (iw != this.OY.get(i2)) continue;
            return i2;
        }
        return -1;
    }

    void Ut(Iw iw, Iw iw2) {
        this.cE(this.OY, iw, iw2);
    }

    void W(String string) {
        while (string != null && !this.l8().m().equals(string) && tv.b(this.l8().m(), Kf)) {
            this.OT();
        }
    }

    void W8(Iw iw, int n2) {
        this.A(iw);
        this.OY.add(n2, iw);
    }

    void Ws(Iw iw) {
        this.B(iw);
        this.OL.add(iw);
    }

    void Xc() {
        this.r1 = new ArrayList<String>();
    }

    void Y(Iw iw, Iw iw2) {
        int n2 = this.OL.lastIndexOf(iw);
        boolean bl = n2 != -1;
        Rc.T4(bl);
        this.OL.add(n2 + 1, iw2);
    }

    oL Yr() {
        return this.uS;
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void b(Reader reader, String string, B8 b8) {
        super.b(reader, string, b8);
        this.uS = oL.l8;
        this.c = null;
        this.eD = false;
        this.Q = null;
        this.W = null;
        this.C = null;
        this.OY = new ArrayList();
        this.r1 = new ArrayList<String>();
        this.R = new mt.XT();
        this.bc = true;
        this.G = false;
        this.rD = false;
    }

    boolean b6(mt mt2, oL oL2) {
        this.tT = mt2;
        return oL2.n(mt2, this);
    }

    Iw bc(String string) {
        for (int i2 = this.OL.size() - 1; i2 >= 0; --i2) {
            Iw iw = this.OL.get(i2);
            if (!iw.m().equals(string)) continue;
            return iw;
        }
        return null;
    }

    void c(boolean bl) {
        this.bc = bl;
    }

    void cD() {
        while (!this.OY.isEmpty() && this.pu() != null) {
        }
    }

    boolean d(String string) {
        return this.O(string, null);
    }

    Iw e(String string) {
        for (int i2 = this.OL.size() - 1; i2 >= 0; --i2) {
            Iw iw = this.OL.get(i2);
            this.OL.remove(i2);
            if (!iw.m().equals(string)) continue;
            return iw;
        }
        return null;
    }

    boolean eD() {
        return this.bc;
    }

    protected boolean ec(String string) {
        boolean bl = string.equals("script") || string.equals("style");
        return bl;
    }

    vv f(mt.i object, boolean bl) {
        object = new vv(hs.hR(((mt.Ph)object).G(), this.N), null, this.N.S(((mt.Ph)object).n));
        this.KP((vv)object);
        this.B((A0)object);
        if (bl) {
            this.OL.add((Iw)object);
        }
        return object;
    }

    void g(boolean bl) {
        this.G = bl;
    }

    Iw gh() {
        Cloneable cloneable;
        if (this.OY.size() > 0) {
            cloneable = this.OY;
            cloneable = cloneable.get(cloneable.size() - 1);
        } else {
            cloneable = null;
        }
        return cloneable;
    }

    boolean h(Iw iw) {
        return this.im(this.OL, iw);
    }

    void hR() {
        this.s("tbody", "tfoot", "thead", "template");
    }

    boolean hd(String string) {
        return this.O(string, A);
    }

    @Override
    protected boolean l(mt mt2) {
        this.tT = mt2;
        return this.uS.n(mt2, this);
    }

    void m(String ... stringArray) {
        for (int i2 = this.OL.size() - 1; i2 >= 0; --i2) {
            Iw iw = this.OL.get(i2);
            this.OL.remove(i2);
            if (tv.b(iw.m(), stringArray)) break;
        }
    }

    boolean mF(String string) {
        return this.PP(string, s, null);
    }

    oL n6() {
        return this.c;
    }

    void nZ(Iw object) {
        if (this.eD) {
            return;
        }
        if (((String)(object = ((A0)object).l8("href"))).length() != 0) {
            this.l = object;
            this.eD = true;
            this.b.o((String)object);
        }
    }

    ArrayList<Iw> oH() {
        return this.OL;
    }

    Iw pu() {
        int n2 = this.OY.size();
        if (n2 > 0) {
            return this.OY.remove(n2 - 1);
        }
        return null;
    }

    boolean r0(Iw iw) {
        return tv.b(iw.m(), E9);
    }

    g9 r1() {
        return this.b;
    }

    List<String> rD() {
        return this.r1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TreeBuilder{currentToken=");
        stringBuilder.append(this.tT);
        stringBuilder.append(", state=");
        stringBuilder.append((Object)this.uS);
        stringBuilder.append(", currentElement=");
        stringBuilder.append(this.l8());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    void uS(oL oL2) {
        if (this.l8.l8().l8()) {
            this.l8.l8().add(new cz(this.S.Bz(), "Unexpected token [%s] when in state [%s]", new Object[]{this.tT.hR(), oL2}));
        }
    }

    Iw v(Iw iw) {
        for (int i2 = this.OL.size() - 1; i2 >= 0; --i2) {
            if (this.OL.get(i2) != iw) continue;
            return this.OL.get(i2 - 1);
        }
        return null;
    }

    void vi(String string) {
        for (int i2 = this.OL.size() - 1; i2 >= 0 && !this.OL.get(i2).m().equals(string); --i2) {
            this.OL.remove(i2);
        }
    }

    void x(A0 a02) {
        Iw iw;
        Iw iw2 = this.bc("table");
        boolean bl = false;
        if (iw2 != null) {
            if (iw2.L() != null) {
                iw = iw2.L();
                bl = true;
            } else {
                iw = this.v(iw2);
            }
        } else {
            iw = this.OL.get(0);
        }
        if (bl) {
            Rc.HM(iw2);
            iw2.Y(a02);
        } else {
            iw.f(a02);
        }
    }

    Iw y(mt.i object) {
        if (((mt.Ph)object).R() && !((mt.Ph)object).n.isEmpty() && ((mt.Ph)object).n.n(this.N) > 0) {
            this.T4("Duplicate attribute");
        }
        if (((mt.Ph)object).bc()) {
            object = this.DL((mt.i)object);
            this.OL.add((Iw)object);
            this.T4.C(m.l8);
            this.T4.cD(this.R.hd().rD(((Iw)object).F()));
            return object;
        }
        object = new Iw(hs.hR(((mt.Ph)object).G(), this.N), null, this.N.S(((mt.Ph)object).n));
        this.Ws((Iw)object);
        return object;
    }
}

