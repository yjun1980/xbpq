/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.k1.a;
import com.github.catvod.spider.merge.k1.e;
import com.github.catvod.spider.merge.k1.f;
import com.github.catvod.spider.merge.n1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class g<I extends e, E extends f>
implements a<I, E> {
    private final List<I> a = new ArrayList<I>();
    private final List<Throwable> b = new ArrayList<Throwable>();
    private final int c;
    private final Comparator<I> d;

    public g(int n2) {
        this.c = n2;
        this.d = null;
    }

    protected final void b(Exception exception) {
        ((ArrayList)this.b).add(exception);
    }

    protected final void c(I i2) {
        ((ArrayList)this.a).add(i2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(E object) {
        try {
            e e2 = (e)this.a(object);
            ((ArrayList)this.a).add((e)e2);
            return;
        }
        catch (i i2) {
            this.b(i2);
            return;
        }
        catch (com.github.catvod.spider.merge.n1.f f2) {
            return;
        }
    }

    public List<Throwable> e() {
        return Collections.unmodifiableList(this.b);
    }

    public final List<I> f() {
        Comparator<I> comparator = this.d;
        if (comparator != null) {
            ((ArrayList)this.a).sort(comparator);
        }
        return Collections.unmodifiableList(this.a);
    }

    public final int g() {
        return this.c;
    }
}

