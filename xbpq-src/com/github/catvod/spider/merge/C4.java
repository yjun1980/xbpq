/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Wf;
import com.github.catvod.spider.merge.ZR;
import com.github.catvod.spider.merge.aI;
import com.github.catvod.spider.merge.cE;
import com.github.catvod.spider.merge.i3;
import com.github.catvod.spider.merge.kA;
import com.github.catvod.spider.merge.tv;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C4 {
    private static final String[] S;
    private static final Pattern T4;
    private static final Pattern b;
    private static final String[] l8;
    private final ZR OL;
    private final String l;
    private final List<i3> tT = new ArrayList<i3>();

    static {
        l8 = new String[]{",", ">", "+", "~", " "};
        S = new String[]{"=", "!=", "^=", "$=", "*=", "~="};
        T4 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
        b = Pattern.compile("([+-])?(\\d+)");
    }

    private C4(String string) {
        Rc.tT(string);
        this.l = string = string.trim();
        this.OL = new ZR(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void A() {
        if (this.OL.v("#")) {
            this.b();
            return;
        } else if (this.OL.v(".")) {
            this.T4();
            return;
        } else if (!this.OL.Kf() && !this.OL.A("*|")) {
            if (this.OL.A("[")) {
                this.S();
                return;
            } else if (this.OL.v("*")) {
                this.l8();
                return;
            } else if (this.OL.v(":lt(")) {
                this.Kf();
                return;
            } else if (this.OL.v(":gt(")) {
                this.hR();
                return;
            } else if (this.OL.v(":eq(")) {
                this.s();
                return;
            } else if (this.OL.A(":has(")) {
                this.cD();
                return;
            } else if (this.OL.A(":contains(")) {
                this.HM(false);
                return;
            } else if (this.OL.A(":containsOwn(")) {
                this.HM(true);
                return;
            } else if (this.OL.A(":containsData(")) {
                this.n();
                return;
            } else if (this.OL.A(":matches(")) {
                this.E9(false);
                return;
            } else if (this.OL.A(":matchesOwn(")) {
                this.E9(true);
                return;
            } else if (this.OL.A(":not(")) {
                this.uS();
                return;
            } else if (this.OL.v(":nth-child(")) {
                this.v(false, false);
                return;
            } else if (this.OL.v(":nth-last-child(")) {
                this.v(true, false);
                return;
            } else if (this.OL.v(":nth-of-type(")) {
                this.v(false, true);
                return;
            } else if (this.OL.v(":nth-last-of-type(")) {
                this.v(true, true);
                return;
            } else if (this.OL.v(":first-child")) {
                this.tT.add(new i3.VT());
                return;
            } else if (this.OL.v(":last-child")) {
                this.tT.add(new i3.F());
                return;
            } else if (this.OL.v(":first-of-type")) {
                this.tT.add(new i3.dY());
                return;
            } else if (this.OL.v(":last-of-type")) {
                this.tT.add(new i3.n());
                return;
            } else if (this.OL.v(":only-child")) {
                this.tT.add(new i3.cp());
                return;
            } else if (this.OL.v(":only-of-type")) {
                this.tT.add(new i3.D());
                return;
            } else if (this.OL.v(":empty")) {
                this.tT.add(new i3.ib());
                return;
            } else if (this.OL.v(":root")) {
                this.tT.add(new i3.X0());
                return;
            } else {
                if (!this.OL.v(":matchText")) throw new aI.aA("Could not parse query '%s': unexpected token at '%s'", this.l, this.OL.E9());
                this.tT.add(new i3.ff());
            }
            return;
        } else {
            this.OL();
        }
    }

    private void E9(boolean bl) {
        ZR zR = this.OL;
        String string = bl ? ":matchesOwn" : ":matches";
        zR.b(string);
        string = this.OL.l8('(', ')');
        Rc.N(string, ":matches(regex) query must not be empty");
        if (bl) {
            this.tT.add(new i3.p(Pattern.compile(string)));
        } else {
            this.tT.add(new i3.O5(Pattern.compile(string)));
        }
    }

    private void HM(boolean bl) {
        ZR zR = this.OL;
        String string = bl ? ":containsOwn" : ":contains";
        zR.b(string);
        string = ZR.c(this.OL.l8('(', ')'));
        Rc.N(string, ":contains(text) query must not be empty");
        if (bl) {
            this.tT.add(new i3.cI(string));
        } else {
            this.tT.add(new i3.U(string));
        }
    }

    private void Kf() {
        this.tT.add(new i3.Zv(this.tT()));
    }

    private String N() {
        StringBuilder stringBuilder = tv.S();
        while (!this.OL.n()) {
            if (this.OL.A("(")) {
                stringBuilder.append("(");
                stringBuilder.append(this.OL.l8('(', ')'));
                stringBuilder.append(")");
                continue;
            }
            if (this.OL.A("[")) {
                stringBuilder.append("[");
                stringBuilder.append(this.OL.l8('[', ']'));
                stringBuilder.append("]");
                continue;
            }
            if (this.OL.s(l8)) break;
            stringBuilder.append(this.OL.T4());
        }
        return tv.cD(stringBuilder);
    }

    private void OL() {
        String string = kA.S(this.OL.l());
        Rc.tT(string);
        if (string.startsWith("*|")) {
            this.tT.add(new Wf.ut(new i3.MN(string), new i3.G(string.replace("*|", ":"))));
        } else {
            String string2 = string;
            if (string.contains("|")) {
                string2 = string.replace("|", ":");
            }
            this.tT.add(new i3.MN(string2));
        }
    }

    private void S() {
        ZR zR;
        block12: {
            block6: {
                String string;
                block11: {
                    block10: {
                        block9: {
                            block8: {
                                block7: {
                                    block5: {
                                        zR = new ZR(this.OL.l8('[', ']'));
                                        string = zR.N(S);
                                        Rc.tT(string);
                                        zR.HM();
                                        if (!zR.n()) break block5;
                                        if (string.startsWith("^")) {
                                            this.tT.add(new i3.c(string.substring(1)));
                                        } else {
                                            this.tT.add(new i3.ut(string));
                                        }
                                        break block6;
                                    }
                                    if (!zR.v("=")) break block7;
                                    this.tT.add(new i3.xq(string, zR.E9()));
                                    break block6;
                                }
                                if (!zR.v("!=")) break block8;
                                this.tT.add(new i3.Ph(string, zR.E9()));
                                break block6;
                            }
                            if (!zR.v("^=")) break block9;
                            this.tT.add(new i3.Q(string, zR.E9()));
                            break block6;
                        }
                        if (!zR.v("$=")) break block10;
                        this.tT.add(new i3.XT(string, zR.E9()));
                        break block6;
                    }
                    if (!zR.v("*=")) break block11;
                    this.tT.add(new i3.OD(string, zR.E9()));
                    break block6;
                }
                if (!zR.v("~=")) break block12;
                this.tT.add(new i3.i(string, Pattern.compile(zR.E9())));
            }
            return;
        }
        throw new aI.aA("Could not parse attribute query '%s': unexpected token at '%s'", this.l, zR.E9());
    }

    private void T4() {
        String string = this.OL.OL();
        Rc.tT(string);
        this.tT.add(new i3.a(string.trim()));
    }

    private void b() {
        String string = this.OL.OL();
        Rc.tT(string);
        this.tT.add(new i3.k(string));
    }

    private void cD() {
        this.OL.b(":has");
        String string = this.OL.l8('(', ')');
        Rc.N(string, ":has(el) subselect must not be empty");
        this.tT.add(new cE.aA(C4.eD(string)));
    }

    public static i3 eD(String object) {
        try {
            C4 c4 = new C4((String)object);
            object = c4.c();
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new aI.aA(illegalArgumentException.getMessage(), new Object[0]);
        }
    }

    private void hR() {
        this.tT.add(new i3.ii(this.tT()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l(char c2) {
        boolean bl;
        Object object;
        Object object2;
        block9: {
            i3 i32;
            block13: {
                block14: {
                    block12: {
                        block11: {
                            block10: {
                                this.OL.HM();
                                i32 = C4.eD(this.N());
                                if (this.tT.size() != 1) break block10;
                                object = object2 = this.tT.get(0);
                                if (!(object2 instanceof Wf.ut)) break block11;
                                object = object2;
                                if (c2 == ',') break block11;
                                object = ((Wf.ut)object2).T4();
                                bl = true;
                                break block12;
                            }
                            object = new Wf.aA(this.tT);
                        }
                        object2 = object;
                        bl = false;
                    }
                    this.tT.clear();
                    if (c2 == ' ') break block13;
                    if (c2 == '>') break block14;
                    if (c2 != '~') {
                        if (c2 != '+') {
                            if (c2 != ',') {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Unknown combinator: ");
                                ((StringBuilder)object).append(c2);
                                throw new aI.aA(((StringBuilder)object).toString(), new Object[0]);
                            }
                            if (object instanceof Wf.ut) {
                                object = (Wf.ut)object;
                            } else {
                                Wf.ut ut2 = new Wf.ut();
                                ut2.OL((i3)object);
                                object = ut2;
                            }
                            ((Wf.ut)object).OL(i32);
                            break block9;
                        } else {
                            object = new Wf.aA(new cE.Y((i3)object), i32);
                        }
                        break block9;
                    } else {
                        object = new Wf.aA(new cE.OD((i3)object), i32);
                    }
                    break block9;
                }
                object = new Wf.aA(new cE.ut((i3)object), i32);
                break block9;
            }
            object = new Wf.aA(new cE.xq((i3)object), i32);
        }
        if (bl) {
            ((Wf.ut)object2).S((i3)object);
        } else {
            object2 = object;
        }
        this.tT.add((i3)object2);
    }

    private void l8() {
        this.tT.add(new i3.aA());
    }

    private void n() {
        this.OL.b(":containsData");
        String string = ZR.c(this.OL.l8('(', ')'));
        Rc.N(string, ":containsData(text) query must not be empty");
        this.tT.add(new i3.b(string));
    }

    private void s() {
        this.tT.add(new i3.L(this.tT()));
    }

    private int tT() {
        String string = this.OL.S(")").trim();
        Rc.b(tv.N(string), "Index must be numeric");
        return Integer.parseInt(string);
    }

    private void uS() {
        this.OL.b(":not");
        String string = this.OL.l8('(', ')');
        Rc.N(string, ":not(selector) subselect must not be empty");
        this.tT.add(new cE.c(C4.eD(string)));
    }

    private void v(boolean bl, boolean bl2) {
        String string;
        block15: {
            int n2;
            int n3;
            block12: {
                Matcher matcher;
                block14: {
                    Matcher matcher2;
                    block13: {
                        int n4;
                        block11: {
                            string = kA.S(this.OL.S(")"));
                            matcher2 = T4.matcher(string);
                            matcher = b.matcher(string);
                            boolean bl3 = "odd".equals(string);
                            n3 = 2;
                            n4 = 0;
                            n2 = 0;
                            if (!bl3) break block11;
                            n2 = 1;
                            break block12;
                        }
                        if (!"even".equals(string)) break block13;
                        n2 = n4;
                        break block12;
                    }
                    if (!matcher2.matches()) break block14;
                    n3 = matcher2.group(3) != null ? Integer.parseInt(matcher2.group(1).replaceFirst("^\\+", "")) : 1;
                    if (matcher2.group(4) != null) {
                        n2 = Integer.parseInt(matcher2.group(4).replaceFirst("^\\+", ""));
                    }
                    break block12;
                }
                if (!matcher.matches()) break block15;
                n2 = Integer.parseInt(matcher.group().replaceFirst("^\\+", ""));
                n3 = 0;
            }
            if (bl2) {
                if (bl) {
                    this.tT.add(new i3.ok(n3, n2));
                } else {
                    this.tT.add(new i3.j(n3, n2));
                }
            } else if (bl) {
                this.tT.add(new i3.No(n3, n2));
            } else {
                this.tT.add(new i3.Z(n3, n2));
            }
            return;
        }
        throw new aI.aA("Could not parse nth-index '%s': unexpected format", string);
    }

    i3 c() {
        this.OL.HM();
        if (this.OL.s(l8)) {
            this.tT.add(new cE.XT());
            this.l(this.OL.T4());
        } else {
            this.A();
        }
        while (!this.OL.n()) {
            boolean bl = this.OL.HM();
            if (this.OL.s(l8)) {
                this.l(this.OL.T4());
                continue;
            }
            if (bl) {
                this.l(' ');
                continue;
            }
            this.A();
        }
        if (this.tT.size() == 1) {
            return this.tT.get(0);
        }
        return new Wf.aA(this.tT);
    }

    public String toString() {
        return this.l;
    }
}

