/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.m;
import com.github.catvod.spider.merge.m.c;
import com.github.catvod.spider.merge.n.A;
import com.github.catvod.spider.merge.n.H;
import com.github.catvod.spider.merge.n.M;
import com.github.catvod.spider.merge.n.q;
import com.github.catvod.spider.merge.n.r;
import com.github.catvod.spider.merge.n.s;
import com.github.catvod.spider.merge.n.x;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class t<InputT, OutputT>
extends x<OutputT> {
    private static final Logger q = Logger.getLogger(t.class.getName());
    private c<? extends M<? extends InputT>> n;
    private final boolean o;
    private final boolean p;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    t(c c2) {
        super(c2.size());
        this.n = c2;
        this.o = false;
        this.p = false;
    }

    /*
     * Unable to fully structure code
     */
    public static void D(t var0, M var1_1, int var2_6) {
        block7: {
            var0.getClass();
            if (!var1_1.isCancelled()) break block7;
            var0.n = null;
            var0.cancel(false);
            {
                catch (Throwable var1_5) {
                    throw var1_5;
                }
            }
        }
        try {
            H.c(var1_1);
            var0.F();
        }
        catch (Throwable var1_2) {
            ** GOTO lbl22
        }
        catch (ExecutionException var1_3) {
            var1_4 = var1_3.getCause();
lbl22:
            // 2 sources

            var0.I(var1_4);
        }
        return;
        {
            finally {
                var0.G(null);
            }
        }
    }

    public static /* synthetic */ void E(t t2, c c2) {
        t2.G(c2);
    }

    private void G(c<? extends Future<? extends InputT>> object) {
        int n2 = this.B();
        boolean bl = n2 >= 0;
        m.g(bl, cYh.d("2B353222772E0F312F71677A15352C303E340E3E2671312F1325333424"));
        if (n2 == 0) {
            if (object != null) {
                com.github.catvod.spider.merge.m.m<Future<InputT>> m2 = ((c)object).e();
                while (m2.hasNext()) {
                    object = (Future)m2.next();
                    if (object.isCancelled()) continue;
                    try {
                        H.c((Future)object);
                        this.F();
                        continue;
                    }
                    catch (Throwable throwable) {
                    }
                    catch (ExecutionException executionException) {
                        object = executionException.getCause();
                    }
                    this.I((Throwable)object);
                }
            }
            this.A();
            this.H();
            this.K(s.d);
        }
    }

    private void I(Throwable throwable) {
        throwable.getClass();
        boolean bl = this.o;
        String string = cYh.d("2E3E3124237A21253524253F473620383B3F037036382332471533233828");
        String string2 = cYh.d("203F35713A35153561253F3B09702E3F327A0E3E3124237A21253524253F473620383B2F15356F711B350037283F307A0131283D222802236130312E022261253F3F47362823242E");
        if (bl && !this.u(throwable)) {
            boolean bl2;
            block6: {
                Set<Throwable> set = this.C();
                for (Throwable throwable2 = throwable; throwable2 != null; throwable2 = throwable2.getCause()) {
                    if (set.add(throwable2)) continue;
                    bl2 = false;
                    break block6;
                }
                bl2 = true;
            }
            if (bl2) {
                if (!(throwable instanceof Error)) {
                    string = string2;
                }
                q.log(Level.SEVERE, string, throwable);
                return;
            }
        }
        if (bl = throwable instanceof Error) {
            if (!bl) {
                string = string2;
            }
            q.log(Level.SEVERE, string, throwable);
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    abstract void F();

    abstract void H();

    final void J() {
        A a2 = A.c;
        this.n.getClass();
        if (this.n.isEmpty()) {
            this.H();
            return;
        }
        if (this.o) {
            int n2 = 0;
            com.github.catvod.spider.merge.m.m<M<InputT>> m2 = this.n.e();
            while (m2.hasNext()) {
                M m3 = (M)m2.next();
                m3.a(new r(this, m3, n2), a2);
                ++n2;
            }
        } else {
            c<M<InputT>> c2 = this.p ? this.n : null;
            q q2 = new q(this, c2);
            c2 = this.n.e();
            while (c2.hasNext()) {
                ((M)c2.next()).a(q2, a2);
            }
        }
    }

    void K(s s2) {
        this.n = null;
    }

    @Override
    protected final void k() {
        Object object = this.n;
        this.K(s.c);
        boolean bl = this.isCancelled();
        boolean bl2 = object != null;
        if (bl & bl2) {
            bl = this.v();
            object = ((c)object).e();
            while (object.hasNext()) {
                ((Future)object.next()).cancel(bl);
            }
        }
    }

    @Override
    protected final String r() {
        c<? extends M<? extends InputT>> c2 = this.n;
        if (c2 != null) {
            c2 = String.valueOf(c2);
            StringBuilder stringBuilder = new StringBuilder(((String)((Object)c2)).length() + 8);
            stringBuilder.append(cYh.d("01253524253F146D"));
            stringBuilder.append((String)((Object)c2));
            return stringBuilder.toString();
        }
        return super.r();
    }

    @Override
    final void z(Set<Throwable> set) {
        set.getClass();
        if (!this.isCancelled()) {
            Throwable throwable;
            throwable.getClass();
            for (throwable = this.b(); throwable != null && set.add(throwable); throwable = throwable.getCause()) {
            }
        }
    }
}

