/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.Q.a;
import com.github.catvod.spider.merge.Q.t0;
import com.github.catvod.spider.merge.S.j;
import com.github.catvod.spider.merge.cYh;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public abstract class m {
    public a a = null;
    public int b = -1;
    public int c;
    public boolean d = false;
    protected final List<t0> e = new ArrayList<t0>(4);
    public j f;

    static {
        Collections.unmodifiableList(Arrays.asList(cYh.d("2E1E17101B1323"), cYh.d("2511121814"), cYh.d("35050D14080933111305"), cYh.d("251C0E121C053404000303"), cYh.d("371C140208182B1F021A080933111305"), cYh.d("3404000308182B1F021A080933111305"), cYh.d("331F0A1419053404000303"), cYh.d("35050D140809331F11"), cYh.d("251C0E121C05221E05"), cYh.d("340400030816281F110E151B241B"), cYh.d("340400030816281F110E1214330218"), cYh.d("371C14020816281F110E151B241B"), cYh.d("2B1F0E01081F2914")));
    }

    public final void a(t0 t02) {
        int n2;
        int n3;
        block5: {
            Object object;
            Object object2;
            n3 = ((ArrayList)this.e).size();
            boolean bl = ((ArrayList)this.e).isEmpty();
            int n4 = 0;
            if (bl) {
                this.d = t02.b();
            } else if (this.d != t02.b()) {
                object2 = System.err;
                object = Locale.getDefault();
                n2 = this.b;
                ((PrintStream)object2).format((Locale)object, cYh.d("26040F71242E06242471723E47382022773808242971322A14392D3E397A063E25713935097D242124330B3F2F712328063E32382333083E327F5D"), n2);
                this.d = false;
            }
            object = ((ArrayList)this.e).iterator();
            do {
                n2 = n4;
                if (!object.hasNext()) break block5;
                object2 = (t0)object.next();
            } while (((t0)object2).a.b != t02.a.b || (((t0)object2).c() == null || t02.c() == null || !((t0)object2).c().equals(t02.c())) && (!((t0)object2).b() || !t02.b()));
            n2 = 1;
        }
        if (n2 == 0) {
            ((ArrayList)this.e).add(n3, t02);
        }
    }

    public final int b() {
        return ((ArrayList)this.e).size();
    }

    public abstract int c();

    public final t0 d(int n2) {
        return (t0)((ArrayList)this.e).get(n2);
    }

    public final boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof m;
        boolean bl3 = bl = false;
        if (bl2) {
            bl3 = bl;
            if (this.b == ((m)object).b) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}

