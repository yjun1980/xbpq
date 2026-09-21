package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class t implements Serializable {
    private static final C0047m A;
    static final Locale i;
    private static final Comparator<String> j;
    private static final ConcurrentMap<Locale, AbstractC0049o>[] k;
    private static final C0039e l;
    private static final C0040f m;
    private static final C0047m n;
    private static final C0047m o;
    private static final C0047m p;
    private static final C0047m q;
    private static final C0047m r;
    private static final C0041g s;
    private static final C0047m t;
    private static final C0047m u;
    private static final C0042h v;
    private static final C0043i w;
    private static final C0047m x;
    private static final C0047m y;
    private static final C0047m z;
    private final String c;
    private final TimeZone d;
    private final Locale e;
    private final int f;
    private final int g;
    private transient List<C0050p> h;

    static {
        Comparator<String> reverseOrder;
        String d = cYh.d("0D31");
        String d2 = cYh.d("2D00");
        i = new Locale(d, d2, d2);
        reverseOrder = Comparator.reverseOrder();
        j = reverseOrder;
        k = new ConcurrentMap[17];
        l = new C0039e();
        m = new C0040f();
        n = new C0047m(1);
        o = new C0047m(3);
        p = new C0047m(4);
        q = new C0047m(6);
        r = new C0047m(5);
        s = new C0041g();
        t = new C0047m(8);
        u = new C0047m(11);
        v = new C0042h();
        w = new C0043i();
        x = new C0047m(10);
        y = new C0047m(12);
        z = new C0047m(13);
        A = new C0047m(14);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List<com.github.catvod.spider.merge.Y.p>, java.util.ArrayList] */
    public t(String str, TimeZone timeZone, Locale locale) {
        int i2;
        this.c = str;
        this.d = timeZone;
        Locale a = com.github.catvod.spider.merge.U.c.a(locale);
        this.e = a;
        Calendar calendar = Calendar.getInstance(timeZone, a);
        if (a.equals(i)) {
            i2 = 0;
        } else {
            calendar.setTime(new Date());
            i2 = calendar.get(1) - 80;
        }
        int i3 = (i2 / 100) * 100;
        this.f = i3;
        this.g = i2 - i3;
        this.h = new ArrayList();
        C0051q c0051q = new C0051q(this, calendar);
        while (true) {
            C0050p a2 = c0051q.a();
            if (a2 == null) {
                return;
            } else {
                this.h.add(a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000f. Please report as an issue. */
    public static AbstractC0049o b(t tVar, char c, int i2, Calendar calendar) {
        int i3;
        tVar.getClass();
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return q;
                    case 'E':
                        i3 = 7;
                        return tVar.g(i3, calendar);
                    case 'F':
                        return t;
                    case 'G':
                        i3 = 0;
                        return tVar.g(i3, calendar);
                    case 'H':
                        return u;
                    default:
                        switch (c) {
                            case 'K':
                                return x;
                            case 'M':
                                return i2 >= 3 ? tVar.g(2, calendar) : m;
                            case 'S':
                                return A;
                            case 'a':
                                i3 = 9;
                                return tVar.g(i3, calendar);
                            case 'd':
                                return r;
                            case 'h':
                                return w;
                            case 'k':
                                return v;
                            case 'm':
                                return y;
                            case 's':
                                return z;
                            case 'u':
                                return s;
                            case 'w':
                                return o;
                            default:
                                switch (c) {
                                    case 'W':
                                        return p;
                                    case 'X':
                                        return C0046l.e(i2);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i2 == 2) {
                                            return C0046l.d();
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException(cYh.d("213F333C362E4777") + c + cYh.d("40702F3E237A142531213828133525"));
                                }
                        }
                }
            }
            i3 = 15;
            return tVar.g(i3, calendar);
        }
        return i2 > 2 ? n : l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map c(Calendar calendar, Locale locale, int i2, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Locale a = com.github.catvod.spider.merge.U.c.a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i2, 0, a);
        TreeSet treeSet = new TreeSet(j);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(a);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            j(sb, (String) it.next());
            sb.append('|');
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(t tVar, int i2) {
        int i3 = tVar.f + i2;
        return i2 >= tVar.g ? i3 : i3 + 100;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ StringBuilder f(StringBuilder sb, String str) {
        j(sb, str);
        return sb;
    }

    private AbstractC0049o g(int i2, Calendar calendar) {
        ConcurrentMap<Locale, AbstractC0049o> concurrentMap;
        ConcurrentMap<Locale, AbstractC0049o>[] concurrentMapArr = k;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i2] == null) {
                concurrentMapArr[i2] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i2];
        }
        AbstractC0049o abstractC0049o = concurrentMap.get(this.e);
        if (abstractC0049o == null) {
            abstractC0049o = i2 == 15 ? new s(this.e) : new C0044j(i2, calendar, this.e);
            AbstractC0049o putIfAbsent = concurrentMap.putIfAbsent(this.e, abstractC0049o);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return abstractC0049o;
    }

    private static StringBuilder j(StringBuilder sb, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '$' && charAt != '.' && charAt != '?' && charAt != '^' && charAt != '[' && charAt != '\\' && charAt != '{' && charAt != '|') {
                switch (charAt) {
                }
                sb.append(charAt);
            }
            sb.append('\\');
            sb.append(charAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
        return sb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.c.equals(tVar.c) && this.d.equals(tVar.d) && this.e.equals(tVar.e);
    }

    public final Date h(String str) {
        ParsePosition parsePosition = new ParsePosition(0);
        Date i2 = i(str, parsePosition);
        if (i2 != null) {
            return i2;
        }
        if (this.e.equals(i)) {
            StringBuilder b = C0059d.b(cYh.d("4F04293477"));
            b.append(this.e);
            b.append(cYh.d("473C2E3236360270253E3229473E2E2577291220313E252E473420253229473224373828027070696162471105785D0F09202023243F06322D34773E0624246B7778"));
            b.append(str);
            throw new ParseException(b.toString(), parsePosition.getErrorIndex());
        }
        throw new ParseException(com.github.catvod.spider.merge.b.n.a(cYh.d("323E313025290231233D327A033135346D7A"), str), parsePosition.getErrorIndex());
    }

    public final int hashCode() {
        return (((this.e.hashCode() * 13) + this.d.hashCode()) * 13) + this.c.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[EDGE_INSN: B:13:0x0051->B:14:0x0051 BREAK  A[LOOP:0: B:2:0x0011->B:19:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[LOOP:0: B:2:0x0011->B:19:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.Y.p>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date i(java.lang.String r10, java.text.ParsePosition r11) {
        /*
            r9 = this;
            java.util.TimeZone r0 = r9.d
            java.util.Locale r1 = r9.e
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r1)
            r0.clear()
            java.util.List<com.github.catvod.spider.merge.Y.p> r1 = r9.h
            java.util.ListIterator r1 = r1.listIterator()
        L11:
            boolean r2 = r1.hasNext()
            r8 = 0
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            com.github.catvod.spider.merge.Y.p r2 = (com.github.catvod.spider.merge.Y.C0050p) r2
            com.github.catvod.spider.merge.Y.o r3 = r2.a
            boolean r3 = r3.a()
            if (r3 == 0) goto L42
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L2d
            goto L42
        L2d:
            java.lang.Object r3 = r1.next()
            com.github.catvod.spider.merge.Y.p r3 = (com.github.catvod.spider.merge.Y.C0050p) r3
            com.github.catvod.spider.merge.Y.o r3 = r3.a
            r1.previous()
            boolean r3 = r3.a()
            if (r3 == 0) goto L42
            int r3 = r2.b
            r7 = r3
            goto L43
        L42:
            r7 = 0
        L43:
            com.github.catvod.spider.merge.Y.o r2 = r2.a
            r3 = r9
            r4 = r0
            r5 = r10
            r6 = r11
            boolean r2 = r2.b(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L11
            goto L51
        L50:
            r8 = 1
        L51:
            if (r8 == 0) goto L58
            java.util.Date r10 = r0.getTime()
            goto L59
        L58:
            r10 = 0
        L59:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Y.t.i(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public final String toString() {
        StringBuilder b = C0059d.b(cYh.d("21313225133B13351130252902221A"));
        b.append(this.c);
        String d = cYh.d("4B70");
        b.append(d);
        b.append(this.e);
        b.append(d);
        b.append(this.d.getID());
        b.append(cYh.d("3A"));
        return b.toString();
    }
}
