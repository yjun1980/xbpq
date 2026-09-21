/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.github.catvod.spider.merge.n.G;
import com.github.catvod.spider.merge.n.f;

public final class g {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static g c;
    public static final int d = 0;
    private G a;

    static /* synthetic */ PorterDuff.Mode a() {
        return b;
    }

    public static g b() {
        synchronized (g.class) {
            if (c == null) {
                g.e();
            }
            g g2 = c;
            return g2;
        }
    }

    public static void e() {
        synchronized (g.class) {
            if (c == null) {
                Object object = new g();
                c = object;
                ((g)object).a = G.d();
                object = g.c.a;
                f f2 = new f();
                ((G)object).l(f2);
            }
            return;
        }
    }

    public final Drawable c(Context context, int n2) {
        synchronized (this) {
            context = this.a.f(context, n2);
            return context;
        }
    }

    final ColorStateList d(Context context, int n2) {
        synchronized (this) {
            context = this.a.i(context, n2);
            return context;
        }
    }
}

