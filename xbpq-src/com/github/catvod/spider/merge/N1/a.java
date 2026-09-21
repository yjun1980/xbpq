/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.N1;

import com.github.catvod.spider.merge.M1.b;
import com.github.catvod.spider.merge.N1.c;
import java.util.Queue;

public final class a
implements b {
    String a;
    com.github.catvod.spider.merge.O1.c b;
    Queue<c> c;

    public a(com.github.catvod.spider.merge.O1.c c2, Queue<c> queue) {
        this.b = c2;
        this.a = c2.getName();
        this.c = queue;
    }

    private void m(Object[] objectArray) {
        c c2 = new c();
        System.currentTimeMillis();
        c2.a = this.b;
        Thread.currentThread().getName();
        c2.b = objectArray;
        this.c.add(c2);
    }

    private void n(int n2, String object, Object object2, Object object3) {
        if (object3 instanceof Throwable) {
            object = (Throwable)object3;
            this.m(new Object[]{object2});
        } else {
            this.m(new Object[]{object2, object3});
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void o(int n2, String object, Object[] objectArray) {
        void var2_7;
        void var2_3;
        void var3_9;
        if (((void)var3_9).length != 0 && (var2_3 = var3_9[((void)var3_9).length - 1]) instanceof Throwable) {
            Throwable throwable = (Throwable)var2_3;
        } else {
            Object var2_6 = null;
        }
        if (var2_7 != null) {
            if (((void)var3_9).length == 0) throw new IllegalStateException("non-sensical empty or null argument array");
            n2 = ((void)var3_9).length - 1;
            Object[] objectArray2 = new Object[n2];
            if (n2 > 0) {
                System.arraycopy(var3_9, 0, objectArray2, 0, n2);
            }
            this.m(objectArray2);
            return;
        } else {
            this.m((Object[])var3_9);
        }
    }

    private void p(int n2, String string, Object object) {
        this.m(new Object[]{object});
    }

    @Override
    public final void a(String string, Object object) {
        this.p(1, string, object);
    }

    @Override
    public final void b(String string, Object object) {
        this.p(3, string, object);
    }

    @Override
    public final void c(String string, Object object) {
        this.p(2, string, object);
    }

    @Override
    public final void d() {
        this.m(null);
    }

    @Override
    public final void e(String string) {
        this.m(null);
    }

    @Override
    public final void f(String string, Object object, Object object2) {
        this.n(1, string, object, object2);
    }

    @Override
    public final void g(String string, Object ... objectArray) {
        this.o(1, string, objectArray);
    }

    @Override
    public final String getName() {
        return this.a;
    }

    @Override
    public final void h(Object object, Object object2) {
        this.n(3, "Transfer attempt {}/{}...", object, object2);
    }

    @Override
    public final void i(String string, Object object) {
        this.p(5, string, object);
    }

    @Override
    public final void j(String string) {
        this.m(null);
    }

    @Override
    public final void k(Object ... objectArray) {
        this.o(3, "Obtained uk: {}, shareid: {} from root of surl {}", objectArray);
    }

    @Override
    public final void l(Throwable throwable) {
        this.m(null);
    }
}

