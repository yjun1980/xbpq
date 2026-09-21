package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class P {
    private static final String[] d = {cYh.d("4B"), cYh.d("59"), cYh.d("4C"), cYh.d("19"), cYh.d("47")};
    private static final String[] e = {cYh.d("5A"), cYh.d("466D"), cYh.d("396D"), cYh.d("436D"), cYh.d("4D6D"), cYh.d("196D")};
    private static final Pattern f = Pattern.compile(cYh.d("4F781A7A7A074E6F690D33714E6F683F7F06147A690A7C773A797E0D24703B346A7868"), 2);
    private static final Pattern g = Pattern.compile(cYh.d("4F0B6A7C0A7358781D357C73"));
    private final com.github.catvod.spider.merge.d0.P a;
    private final String b;
    private final List<N> c = new ArrayList();

    private P(String str) {
        com.github.catvod.spider.merge.N.a.i(str);
        String trim = str.trim();
        this.b = trim;
        this.a = new com.github.catvod.spider.merge.d0.P(trim);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(char r10) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.e0.P.a(char):void");
    }

    private int b() {
        String trim = this.a.b().trim();
        int i = com.github.catvod.spider.merge.b0.b.d;
        boolean z = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                }
                if (!Character.isDigit(trim.codePointAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        if (z) {
            return Integer.parseInt(trim);
        }
        throw new IllegalArgumentException(cYh.d("2E3E25342F7A0A253225773802702F243A3F153922"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    private void c(boolean z) {
        N c0134s;
        ?? r4;
        this.a.d(z ? cYh.d("5D332E3F233B0E3E321E2034") : cYh.d("5D332E3F233B0E3E32"));
        String o = com.github.catvod.spider.merge.d0.P.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.N.a.j(o, cYh.d("5D332E3F233B0E3E3279233F1F246871262F022238713A2F1424613F382E473224713237172438"));
        if (z) {
            List<N> list = this.c;
            c0134s = new r(o);
            r4 = list;
        } else {
            List<N> list2 = this.c;
            c0134s = new C0134s(o);
            r4 = list2;
        }
        r4.add(c0134s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0082  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.d0.P r0 = r8.a
            java.lang.String r0 = r0.b()
            java.lang.String r0 = com.github.catvod.spider.merge.x.C0243a.d(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.e0.P.f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.e0.P.g
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "083425"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L28
            r0 = 1
        L26:
            r4 = 2
            goto L80
        L28:
            java.lang.String r3 = "0226243F"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            r0 = 0
            goto L26
        L36:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "390C6A"
            java.lang.String r7 = com.github.catvod.spider.merge.cYh.d(r7)
            if (r3 == 0) goto L6e
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L57
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L57:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L6b
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L6b:
            r0 = r4
            r4 = r5
            goto L80
        L6e:
            boolean r1 = r2.matches()
            if (r1 == 0) goto La9
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L80:
            if (r10 == 0) goto L94
            if (r9 == 0) goto L8c
            java.util.List<com.github.catvod.spider.merge.e0.N> r9 = r8.c
            com.github.catvod.spider.merge.e0.G r10 = new com.github.catvod.spider.merge.e0.G
            r10.<init>(r4, r0)
            goto La5
        L8c:
            java.util.List<com.github.catvod.spider.merge.e0.N> r9 = r8.c
            com.github.catvod.spider.merge.e0.H r10 = new com.github.catvod.spider.merge.e0.H
            r10.<init>(r4, r0)
            goto La5
        L94:
            if (r9 == 0) goto L9e
            java.util.List<com.github.catvod.spider.merge.e0.N> r9 = r8.c
            com.github.catvod.spider.merge.e0.F r10 = new com.github.catvod.spider.merge.e0.F
            r10.<init>(r4, r0)
            goto La5
        L9e:
            java.util.List<com.github.catvod.spider.merge.e0.N> r9 = r8.c
            com.github.catvod.spider.merge.e0.E r10 = new com.github.catvod.spider.merge.e0.E
            r10.<init>(r4, r0)
        La5:
            r9.add(r10)
            return
        La9:
            com.github.catvod.spider.merge.e0.Q r9 = new com.github.catvod.spider.merge.e0.Q
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "243F343D337A093F3571273B15232471392E0F7D283F333F1F706674247D5D70343F322217352225323E47362E233A3B13"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            r9.<init>(r0, r10)
            goto Lba
        Lb9:
            throw r9
        Lba:
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.e0.P.d(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    private void e() {
        N j;
        N c;
        ?? r0;
        ?? r02;
        N c0131o;
        ?? r1;
        N c0125i;
        ?? r03;
        if (this.a.j(cYh.d("44"))) {
            String e2 = this.a.e();
            com.github.catvod.spider.merge.N.a.i(e2);
            this.c.add(new C0136u(e2));
            return;
        }
        int i = 1;
        if (this.a.j(cYh.d("49"))) {
            String e3 = this.a.e();
            com.github.catvod.spider.merge.N.a.i(e3);
            this.c.add(new C0125i(e3.trim(), i));
            return;
        }
        boolean m = this.a.m();
        String d2 = cYh.d("4D2C");
        int i2 = 2;
        int i3 = 0;
        if (m || this.a.k(d2)) {
            String d3 = C0243a.d(this.a.f());
            com.github.catvod.spider.merge.N.a.i(d3);
            boolean startsWith = d3.startsWith(d2);
            String d4 = cYh.d("5D");
            if (startsWith) {
                this.c.add(new C0121e(new M(d3), new C0125i(d3.replace(d2, d4), i2)));
                return;
            }
            String d5 = cYh.d("1B");
            if (d3.contains(d5)) {
                d3 = d3.replace(d5, d4);
            }
            this.c.add(new M(d3));
            return;
        }
        if (this.a.k(cYh.d("3C"))) {
            com.github.catvod.spider.merge.d0.P p = new com.github.catvod.spider.merge.d0.P(this.a.a('[', ']'));
            String g2 = p.g(e);
            com.github.catvod.spider.merge.N.a.i(g2);
            p.h();
            if (p.i()) {
                if (g2.startsWith(cYh.d("39"))) {
                    List<N> list = this.c;
                    c0125i = new C0127k(g2.substring(1), 0);
                    r03 = list;
                } else {
                    List<N> list2 = this.c;
                    c0125i = new C0125i(g2, i3);
                    r03 = list2;
                }
                r03.add(c0125i);
                return;
            }
            if (p.j(cYh.d("5A"))) {
                List<N> list3 = this.c;
                c0131o = new C0128l(g2, p.n());
                r1 = list3;
            } else if (p.j(cYh.d("466D"))) {
                List<N> list4 = this.c;
                c0131o = new C0132p(g2, p.n());
                r1 = list4;
            } else if (p.j(cYh.d("396D"))) {
                List<N> list5 = this.c;
                c0131o = new C0133q(g2, p.n());
                r1 = list5;
            } else if (p.j(cYh.d("436D"))) {
                List<N> list6 = this.c;
                c0131o = new C0130n(g2, p.n());
                r1 = list6;
            } else if (p.j(cYh.d("4D6D"))) {
                List<N> list7 = this.c;
                c0131o = new C0129m(g2, p.n());
                r1 = list7;
            } else {
                if (!p.j(cYh.d("196D"))) {
                    throw new Q(cYh.d("243F343D337A093F3571273B15232471362E13222833222E0270302432281E706674247D5D70343F322217352225323E47242E3A323447313571707F1477"), this.b, p.n());
                }
                List<N> list8 = this.c;
                c0131o = new C0131o(g2, Pattern.compile(p.n()));
                r1 = list8;
            }
            r1.add(c0131o);
            return;
        }
        if (this.a.j(cYh.d("4D"))) {
            this.c.add(new C0124h());
            return;
        }
        if (this.a.j(cYh.d("5D3C3579"))) {
            this.c.add(new C0140y(b()));
            return;
        }
        if (this.a.j(cYh.d("5D373579"))) {
            this.c.add(new C0139x(b()));
            return;
        }
        if (this.a.j(cYh.d("5D353079"))) {
            this.c.add(new C0137v(b()));
            return;
        }
        if (this.a.k(cYh.d("5D3820227F"))) {
            this.a.d(cYh.d("5D382022"));
            String a = this.a.a('(', ')');
            com.github.catvod.spider.merge.N.a.j(a, cYh.d("5D3820227F3F0B796122223814352D34342E473D3422237A093F3571353F47352C212323"));
            this.c.add(new S(h(a)));
            return;
        }
        if (this.a.k(cYh.d("5D332E3F233B0E3E3279"))) {
            c(false);
            return;
        }
        if (this.a.k(cYh.d("5D332E3F233B0E3E321E20344F"))) {
            c(true);
            return;
        }
        if (this.a.k(cYh.d("5D332E3F233B0E3E3215362E0678"))) {
            this.a.d(cYh.d("5D332E3F233B0E3E3215362E06"));
            String o = com.github.catvod.spider.merge.d0.P.o(this.a.a('(', ')'));
            com.github.catvod.spider.merge.N.a.j(o, cYh.d("5D332E3F233B0E3E3215362E067835342F2E4E70302432281E702C24242E473E2E2577380270243C272E1E"));
            this.c.add(new C0127k(o, 1));
            return;
        }
        if (this.a.k(cYh.d("5D3D20253432022369"))) {
            f(false);
            return;
        }
        if (this.a.k(cYh.d("5D3D2025343202230E263972"))) {
            f(true);
            return;
        }
        if (this.a.k(cYh.d("5D3E2E257F"))) {
            this.a.d(cYh.d("5D3E2E25"));
            String a2 = this.a.a('(', ')');
            com.github.catvod.spider.merge.N.a.j(a2, cYh.d("5D3E2E257F29023C2432233515796122223814352D34342E473D3422237A093F3571353F47352C212323"));
            this.c.add(new V(h(a2)));
            return;
        }
        if (this.a.j(cYh.d("5D3E35397A390F392D357F"))) {
            d(false, false);
            return;
        }
        if (this.a.j(cYh.d("5D3E35397A360623357C34320E3C2579"))) {
            d(true, false);
            return;
        }
        if (this.a.j(cYh.d("5D3E35397A35017D3528273F4F"))) {
            d(false, true);
            return;
        }
        if (this.a.j(cYh.d("5D3E35397A360623357C383C4A2438213272"))) {
            d(true, true);
            return;
        }
        if (this.a.j(cYh.d("5D362823242E4A3329383B3E"))) {
            List<N> list9 = this.c;
            j = new A(i3);
            r02 = list9;
        } else if (this.a.j(cYh.d("5D3C202223770438283D33"))) {
            List<N> list10 = this.c;
            j = new C(i3);
            r02 = list10;
        } else if (this.a.j(cYh.d("5D362823242E4A3F277C23231735"))) {
            List<N> list11 = this.c;
            j = new B();
            r02 = list11;
        } else {
            if (!this.a.j(cYh.d("5D3C2022237708366C252E2A02"))) {
                if (this.a.j(cYh.d("5D3F2F3D2E770438283D33"))) {
                    List<N> list12 = this.c;
                    c = new A(i);
                    r0 = list12;
                } else if (this.a.j(cYh.d("5D3F2F3D2E7708366C252E2A02"))) {
                    List<N> list13 = this.c;
                    j = new I();
                    r02 = list13;
                } else if (this.a.j(cYh.d("5D352C212323"))) {
                    List<N> list14 = this.c;
                    j = new C0141z();
                    r02 = list14;
                } else if (this.a.j(cYh.d("5D222E3E23"))) {
                    List<N> list15 = this.c;
                    c = new C(i);
                    r0 = list15;
                } else {
                    if (!this.a.j(cYh.d("5D3D2025343233353925"))) {
                        throw new Q(cYh.d("243F343D337A093F3571273B15232471262F02223871707F14777B71223402283134342E023461253831023E6130237A40753276"), this.b, this.a.n());
                    }
                    List<N> list16 = this.c;
                    j = new J();
                    r02 = list16;
                }
                r0.add(c);
                return;
            }
            List<N> list17 = this.c;
            j = new D();
            r02 = list17;
        }
        r02.add(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    private void f(boolean z) {
        N k;
        ?? r4;
        this.a.d(z ? cYh.d("5D3D2025343202230E2639") : cYh.d("5D3D202534320223"));
        String a = this.a.a('(', ')');
        com.github.catvod.spider.merge.N.a.j(a, cYh.d("5D3D2025343202236923323D02286871262F022238713A2F1424613F382E473224713237172438"));
        if (z) {
            List<N> list = this.c;
            k = new L(Pattern.compile(a));
            r4 = list;
        } else {
            List<N> list2 = this.c;
            k = new K(Pattern.compile(a));
            r4 = list2;
        }
        r4.add(k);
    }

    public static N h(String str) {
        try {
            return new P(str).g();
        } catch (IllegalArgumentException e2) {
            throw new Q(e2.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.e0.N>, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0040 -> B:5:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0035 -> B:4:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.github.catvod.spider.merge.e0.N g() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.d0.P r0 = r4.a
            r0.h()
            com.github.catvod.spider.merge.d0.P r0 = r4.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.e0.P.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.e0.N> r0 = r4.c
            com.github.catvod.spider.merge.e0.Y r1 = new com.github.catvod.spider.merge.e0.Y
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.e()
        L1f:
            com.github.catvod.spider.merge.d0.P r1 = r0.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.d0.P r1 = r0.a
            boolean r1 = r1.h()
            com.github.catvod.spider.merge.d0.P r2 = r0.a
            java.lang.String[] r3 = com.github.catvod.spider.merge.e0.P.d
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.d0.P r1 = r0.a
            char r1 = r1.c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.e0.N> r1 = r0.c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.e0.N> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.e0.N r0 = (com.github.catvod.spider.merge.e0.N) r0
            return r0
        L59:
            com.github.catvod.spider.merge.e0.d r1 = new com.github.catvod.spider.merge.e0.d
            java.util.List<com.github.catvod.spider.merge.e0.N> r0 = r0.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.e0.P.g():com.github.catvod.spider.merge.e0.N");
    }

    public final String toString() {
        return this.b;
    }
}
