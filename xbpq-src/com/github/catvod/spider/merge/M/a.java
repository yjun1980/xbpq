/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.github.catvod.spider.merge.M;

import android.os.Handler;
import com.github.catvod.spider.merge.E.d;
import com.github.catvod.spider.merge.L.t;
import com.github.catvod.spider.merge.M.b;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;

public final class a
extends b {
    private volatile a _immediate;
    private final a d;
    private final Handler e;
    private final String f;
    private final boolean g;

    public a(Handler handler) {
        this(handler, null, false);
    }

    private a(Handler object, String string, boolean bl) {
        a a2 = null;
        super((d)null);
        this.e = object;
        this.f = string;
        this.g = bl;
        if (bl) {
            a2 = this;
        }
        if ((a2 = (this._immediate = a2)) != null) {
            object = a2;
        } else {
            object = new a((Handler)object, string, true);
            this._immediate = object;
        }
        this.d = object;
    }

    @Override
    public final t c() {
        return this.d;
    }

    public final boolean equals(Object object) {
        boolean bl = object instanceof a && ((a)object).e == this.e;
        return bl;
    }

    public final int hashCode() {
        return System.identityHashCode(this.e);
    }

    @Override
    public final String toString() {
        String string = this.d();
        if (string == null) {
            String string2 = this.f;
            if (string2 == null) {
                string2 = this.e.toString();
            }
            string = string2;
            if (this.g) {
                string = n.a(string2, cYh.d("49392C3C323E0E313534"));
            }
        }
        return string;
    }
}

