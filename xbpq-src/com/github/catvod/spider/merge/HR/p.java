/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.a;
import com.github.catvod.spider.merge.HR.b;
import com.github.catvod.spider.merge.HR.c;
import com.github.catvod.spider.merge.HR.e;
import com.github.catvod.spider.merge.HR.f;
import com.github.catvod.spider.merge.HR.g;
import com.github.catvod.spider.merge.HR.h;
import com.github.catvod.spider.merge.HR.i;
import com.github.catvod.spider.merge.HR.j;
import com.github.catvod.spider.merge.HR.k;
import com.github.catvod.spider.merge.HR.l;
import com.github.catvod.spider.merge.HR.m;
import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.HR.q;
import com.github.catvod.spider.merge.HR.r;
import com.github.catvod.spider.merge.HR.s;
import com.github.catvod.spider.merge.xc.G0.O;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class p {
    public static final String[] d = new String[]{",", ">", "+", "~", " "};
    public static final String[] e = new String[]{"=", "!=", "^=", "$=", "*=", "~="};
    public static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    public final O a;
    public final String b;
    public final ArrayList c = new ArrayList();

    public p(String string) {
        com.github.catvod.spider.merge.xc.D0.b.y(string);
        this.b = string = string.trim();
        this.a = new O(string);
    }

    public static n j(String object) {
        try {
            p p2 = new p((String)object);
            object = p2.i();
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new q(illegalArgumentException.getMessage());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(char c2) {
        Object object;
        int n2;
        ArrayList arrayList;
        Object object2;
        Object object3;
        block13: {
            n n3;
            block17: {
                block18: {
                    block16: {
                        block15: {
                            block14: {
                                object3 = this.a;
                                ((O)object3).f();
                                object2 = com.github.catvod.spider.merge.xc.E0.b.b();
                                while (!((O)object3).g()) {
                                    if (((O)object3).i("(")) {
                                        ((StringBuilder)object2).append("(");
                                        ((StringBuilder)object2).append(((O)object3).a('(', ')'));
                                        ((StringBuilder)object2).append(")");
                                        continue;
                                    }
                                    if (((O)object3).i("[")) {
                                        ((StringBuilder)object2).append("[");
                                        ((StringBuilder)object2).append(((O)object3).a('[', ']'));
                                        ((StringBuilder)object2).append("]");
                                        continue;
                                    }
                                    if (((O)object3).j(d)) {
                                        if (((StringBuilder)object2).length() > 0) break;
                                        ((O)object3).c();
                                        continue;
                                    }
                                    ((StringBuilder)object2).append(((O)object3).c());
                                }
                                n3 = p.j(com.github.catvod.spider.merge.xc.E0.b.g((StringBuilder)object2));
                                arrayList = this.c;
                                if (arrayList.size() != 1) break block14;
                                object2 = object3 = (n)arrayList.get(0);
                                if (!(object3 instanceof b)) break block15;
                                object2 = object3;
                                if (c2 == ',') break block15;
                                object2 = (b)object3;
                                n2 = ((c)object2).b;
                                object2 = n2 > 0 ? (n)((c)object2).a.get(n2 - 1) : null;
                                n2 = 1;
                                break block16;
                            }
                            object2 = new a(arrayList);
                        }
                        object3 = object2;
                        n2 = 0;
                    }
                    arrayList.clear();
                    if (c2 == ' ') break block17;
                    if (c2 == '>') break block18;
                    if (c2 != '~') {
                        if (c2 != '+') {
                            if (c2 != ',') {
                                throw new q("Unknown combinator '%s'", Character.valueOf(c2));
                            }
                            if (object2 instanceof b) {
                                object2 = (b)object2;
                            } else {
                                object = new b();
                                ArrayList arrayList2 = ((c)object).a;
                                arrayList2.add(object2);
                                ((c)object).b = arrayList2.size();
                                object2 = object;
                            }
                            object = ((c)object2).a;
                            ((ArrayList)object).add(n3);
                            ((c)object2).b = ((ArrayList)object).size();
                            break block13;
                        } else {
                            object2 = new a(new s((n)object2, 1), n3);
                        }
                        break block13;
                    } else {
                        object2 = new a(new s((n)object2, 4), n3);
                    }
                    break block13;
                }
                object2 = new a(new s((n)object2, 0), n3);
                break block13;
            }
            object2 = new a(new s((n)object2, 3), n3);
        }
        if (n2 != 0) {
            object = (b)object3;
            ((c)object).a.set(((c)object).b - 1, object2);
        } else {
            object3 = object2;
        }
        arrayList.add(object3);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final int b() {
        boolean bl;
        boolean bl2 = true;
        Object object = this.a.b().trim();
        String[] stringArray = com.github.catvod.spider.merge.xc.E0.b.a;
        boolean bl3 = true;
        while (true) {
            int n2;
            block7: {
                block6: {
                    int n3;
                    block5: {
                        if (!bl3 || (bl3 = false)) break block5;
                        if (object == null || ((String)object).length() == 0) break block6;
                        n3 = ((String)object).length();
                        n2 = 0;
                    }
                    bl = bl2;
                    if (n2 >= n3) break;
                    if (Character.isDigit(((String)object).codePointAt(n2))) break block7;
                }
                bl = false;
                break;
            }
            ++n2;
        }
        if (bl) {
            return Integer.parseInt((String)object);
        }
        object = new com.github.catvod.spider.merge.xc.D0.c("Index must be numeric");
        throw object;
    }

    public final void c(boolean bl) {
        Object object = bl ? ":containsOwn" : ":contains";
        Object object2 = this.a;
        ((O)object2).d((String)object);
        String string = O.m(((O)object2).a('(', ')'));
        com.github.catvod.spider.merge.xc.D0.b.z(string, ((String)object).concat("(text) query must not be empty"));
        object2 = this.c;
        object = bl ? new f(string, 4) : new f(string, 5);
        ((ArrayList)object2).add(object);
    }

    public final void d(boolean bl) {
        Object object = bl ? ":containsWholeOwnText" : ":containsWholeText";
        Object object2 = this.a;
        ((O)object2).d((String)object);
        String string = O.m(((O)object2).a('(', ')'));
        com.github.catvod.spider.merge.xc.D0.b.z(string, ((String)object).concat("(text) query must not be empty"));
        object2 = this.c;
        object = bl ? new f(string, 6, false) : new f(string, 7, false);
        ((ArrayList)object2).add(object);
    }

    /*
     * Unable to fully structure code
     */
    public final void e(boolean var1_1, boolean var2_2) {
        block15: {
            block12: {
                block14: {
                    block13: {
                        var7_3 = com.github.catvod.spider.merge.xc.D0.b.x(this.a.b());
                        var8_4 = p.f.matcher(var7_3);
                        var6_5 = p.g.matcher(var7_3);
                        if (!"odd".equals(var7_3)) break block13;
                        var3_6 = 2;
                        var4_7 = 1;
                        break block12;
                    }
                    if ("even".equals(var7_3)) {
                        var4_7 = 2;
lbl11:
                        // 2 sources

                        while (true) {
                            var5_8 = 0;
                            var3_6 = var4_7;
                            var4_7 = var5_8;
                            break block12;
                            break;
                        }
                    }
                    if (!var8_4.matches()) break block14;
                    var3_6 = var8_4.group(3) != null ? Integer.parseInt(var8_4.group(1).replaceFirst("^\\+", "")) : 1;
                    var4_7 = var3_6;
                    ** while (var8_4.group((int)4) == null)
lbl20:
                    // 1 sources

                    var4_7 = Integer.parseInt(var8_4.group(4).replaceFirst("^\\+", ""));
                    break block12;
                }
                if (!var6_5.matches()) break block15;
                var4_7 = Integer.parseInt(var6_5.group().replaceFirst("^\\+", ""));
                var3_6 = 0;
            }
            var6_5 = this.c;
            if (var2_2) {
                if (var1_1) {
                    var6_5.add(new l(var3_6, var4_7, 2));
                } else {
                    var6_5.add(new l(var3_6, var4_7, 3));
                }
            } else if (var1_1) {
                var6_5.add(new l(var3_6, var4_7, 1));
            } else {
                var6_5.add(new l(var3_6, var4_7, 0));
            }
            return;
        }
        var6_5 = new q("Could not parse nth-index '%s': unexpected format", new Object[]{var7_3});
        throw var6_5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void f() {
        Object object = this.a;
        boolean bl = ((O)object).h("#");
        ArrayList arrayList = this.c;
        if (bl) {
            String string = ((O)object).e();
            com.github.catvod.spider.merge.xc.D0.b.y(string);
            arrayList.add(new f(string, 8, false));
            return;
        } else if (((O)object).h(".")) {
            String string = ((O)object).e();
            com.github.catvod.spider.merge.xc.D0.b.y(string);
            arrayList.add(new f(string.trim(), 2, false));
            return;
        } else if (!((O)object).k() && !((O)object).i("*|")) {
            bl = ((O)object).i("[");
            String string = this.b;
            if (bl) {
                object = new O(((O)object).a('[', ']'));
                Object object2 = e;
                int n2 = ((O)object).b;
                while (!((O)object).g() && !((O)object).j((String[])object2)) {
                    ++((O)object).b;
                }
                object2 = ((O)object).a.substring(n2, ((O)object).b);
                com.github.catvod.spider.merge.xc.D0.b.y((String)object2);
                ((O)object).f();
                if (((O)object).g()) {
                    if (((String)object2).startsWith("^")) {
                        arrayList.add(new f(((String)object2).substring(1), 1));
                        return;
                    } else {
                        arrayList.add(new f((String)object2, 0, false));
                    }
                    return;
                } else if (((O)object).h("=")) {
                    arrayList.add(new g(0, (String)object2, ((O)object).l()));
                    return;
                } else if (((O)object).h("!=")) {
                    arrayList.add(new g(3, (String)object2, ((O)object).l()));
                    return;
                } else if (((O)object).h("^=")) {
                    arrayList.add(new g((String)object2, 4, ((O)object).l(), false));
                    return;
                } else if (((O)object).h("$=")) {
                    arrayList.add(new g((String)object2, 2, ((O)object).l(), false));
                    return;
                } else if (((O)object).h("*=")) {
                    arrayList.add(new g(1, (String)object2, ((O)object).l()));
                    return;
                } else {
                    if (!((O)object).h("~=")) throw new q("Could not parse attribute query '%s': unexpected token at '%s'", string, ((O)object).l());
                    arrayList.add(new h((String)object2, Pattern.compile(((O)object).l())));
                }
                return;
            } else if (((O)object).h("*")) {
                arrayList.add(new e(0));
                return;
            } else if (((O)object).h(":lt(")) {
                arrayList.add(new i(this.b(), 2));
                return;
            } else if (((O)object).h(":gt(")) {
                arrayList.add(new i(this.b(), 1));
                return;
            } else if (((O)object).h(":eq(")) {
                arrayList.add(new i(this.b(), 0));
                return;
            } else if (((O)object).i(":has(")) {
                ((O)object).d(":has");
                string = ((O)object).a('(', ')');
                com.github.catvod.spider.merge.xc.D0.b.z(string, ":has(selector) sub-select must not be empty");
                arrayList.add(new r(p.j(string)));
                return;
            } else if (((O)object).i(":contains(")) {
                this.c(false);
                return;
            } else if (((O)object).i(":containsOwn(")) {
                this.c(true);
                return;
            } else if (((O)object).i(":containsWholeText(")) {
                this.d(false);
                return;
            } else if (((O)object).i(":containsWholeOwnText(")) {
                this.d(true);
                return;
            } else if (((O)object).i(":containsData(")) {
                ((O)object).d(":containsData");
                string = O.m(((O)object).a('(', ')'));
                com.github.catvod.spider.merge.xc.D0.b.z(string, ":containsData(text) query must not be empty");
                arrayList.add(new f(string, 3));
                return;
            } else if (((O)object).i(":matches(")) {
                this.g(false);
                return;
            } else if (((O)object).i(":matchesOwn(")) {
                this.g(true);
                return;
            } else if (((O)object).i(":matchesWholeText(")) {
                this.h(false);
                return;
            } else if (((O)object).i(":matchesWholeOwnText(")) {
                this.h(true);
                return;
            } else if (((O)object).i(":not(")) {
                ((O)object).d(":not");
                string = ((O)object).a('(', ')');
                com.github.catvod.spider.merge.xc.D0.b.z(string, ":not(selector) subselect must not be empty");
                arrayList.add(new s(p.j(string), 2));
                return;
            } else if (((O)object).h(":nth-child(")) {
                this.e(false, false);
                return;
            } else if (((O)object).h(":nth-last-child(")) {
                this.e(true, false);
                return;
            } else if (((O)object).h(":nth-of-type(")) {
                this.e(false, true);
                return;
            } else if (((O)object).h(":nth-last-of-type(")) {
                this.e(true, true);
                return;
            } else if (((O)object).h(":first-child")) {
                arrayList.add(new e(2));
                return;
            } else if (((O)object).h(":last-child")) {
                arrayList.add(new e(3));
                return;
            } else if (((O)object).h(":first-of-type")) {
                arrayList.add(new j());
                return;
            } else if (((O)object).h(":last-of-type")) {
                arrayList.add(new k());
                return;
            } else if (((O)object).h(":only-child")) {
                arrayList.add(new e(4));
                return;
            } else if (((O)object).h(":only-of-type")) {
                arrayList.add(new e(5));
                return;
            } else if (((O)object).h(":empty")) {
                arrayList.add(new e(1));
                return;
            } else if (((O)object).h(":root")) {
                arrayList.add(new e(6));
                return;
            } else {
                if (!((O)object).h(":matchText")) throw new q("Could not parse query '%s': unexpected token at '%s'", string, ((O)object).l());
                arrayList.add(new e(7));
            }
            return;
        } else {
            int n3 = ((O)object).b;
            while (!((O)object).g() && (((O)object).k() || ((O)object).j("*|", "|", "_", "-"))) {
                ++((O)object).b;
            }
            object = com.github.catvod.spider.merge.xc.D0.b.x(((O)object).a.substring(n3, ((O)object).b));
            com.github.catvod.spider.merge.xc.D0.b.y((String)object);
            if (((String)object).startsWith("*|")) {
                arrayList.add(new b(new f(((String)object).substring(2), 9, false), new f(((String)object).replace("*|", ":"), 10, false)));
                return;
            } else {
                Object object3 = object;
                if (((String)object).contains("|")) {
                    object3 = ((String)object).replace("|", ":");
                }
                arrayList.add(new f((String)object3, 9, false));
            }
        }
    }

    public final void g(boolean bl) {
        Object object = bl ? ":matchesOwn" : ":matches";
        Object object2 = this.a;
        ((O)object2).d((String)object);
        String string = ((O)object2).a('(', ')');
        com.github.catvod.spider.merge.xc.D0.b.z(string, ((String)object).concat("(regex) query must not be empty"));
        object2 = this.c;
        object = bl ? new m(Pattern.compile(string), 1) : new m(Pattern.compile(string), 0);
        ((ArrayList)object2).add(object);
    }

    public final void h(boolean bl) {
        Object object = bl ? ":matchesWholeOwnText" : ":matchesWholeText";
        Object object2 = this.a;
        ((O)object2).d((String)object);
        String string = ((O)object2).a('(', ')');
        com.github.catvod.spider.merge.xc.D0.b.z(string, ((String)object).concat("(regex) query must not be empty"));
        object2 = this.c;
        object = bl ? new m(Pattern.compile(string), 2) : new m(Pattern.compile(string), 3);
        ((ArrayList)object2).add(object);
    }

    public final n i() {
        O o2 = this.a;
        o2.f();
        String[] stringArray = d;
        boolean bl = o2.j(stringArray);
        ArrayList arrayList = this.c;
        if (bl) {
            arrayList.add(new e(8));
            this.a(o2.c());
        } else {
            this.f();
        }
        while (!o2.g()) {
            bl = o2.f();
            if (o2.j(stringArray)) {
                this.a(o2.c());
                continue;
            }
            if (bl) {
                this.a(' ');
                continue;
            }
            this.f();
        }
        if (arrayList.size() == 1) {
            return (n)arrayList.get(0);
        }
        return new a(arrayList);
    }

    public final String toString() {
        return this.b;
    }
}

