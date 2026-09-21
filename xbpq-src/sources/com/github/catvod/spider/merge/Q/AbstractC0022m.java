package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.Q.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0022m {
    public int c;
    public com.github.catvod.spider.merge.S.j f;
    public C0010a a = null;
    public int b = -1;
    public boolean d = false;
    protected final List<t0> e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList(cYh.d("2E1E17101B1323"), cYh.d("2511121814"), cYh.d("35050D14080933111305"), cYh.d("251C0E121C053404000303"), cYh.d("371C140208182B1F021A080933111305"), cYh.d("3404000308182B1F021A080933111305"), cYh.d("331F0A1419053404000303"), cYh.d("35050D140809331F11"), cYh.d("251C0E121C05221E05"), cYh.d("340400030816281F110E151B241B"), cYh.d("340400030816281F110E1214330218"), cYh.d("371C14020816281F110E151B241B"), cYh.d("2B1F0E01081F2914")));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.t0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.Q.t0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<com.github.catvod.spider.merge.Q.t0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.github.catvod.spider.merge.Q.t0>, java.util.ArrayList] */
    public final void a(t0 t0Var) {
        int size = this.e.size();
        boolean z = false;
        if (this.e.isEmpty()) {
            this.d = t0Var.b();
        } else if (this.d != t0Var.b()) {
            System.err.format(Locale.getDefault(), cYh.d("26040F71242E06242471723E47382022773808242971322A14392D3E397A063E25713935097D242124330B3F2F712328063E32382333083E327F5D"), Integer.valueOf(this.b));
            this.d = false;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            t0 t0Var2 = (t0) it.next();
            if (t0Var2.a.b == t0Var.a.b && ((t0Var2.c() != null && t0Var.c() != null && t0Var2.c().equals(t0Var.c())) || (t0Var2.b() && t0Var.b()))) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        this.e.add(size, t0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.t0>, java.util.ArrayList] */
    public final int b() {
        return this.e.size();
    }

    public abstract int c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Q.t0>, java.util.ArrayList] */
    public final t0 d(int i) {
        return (t0) this.e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0022m) && this.b == ((AbstractC0022m) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
