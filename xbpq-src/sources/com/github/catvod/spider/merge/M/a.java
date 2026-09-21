package com.github.catvod.spider.merge.M;

import android.os.Handler;
import com.github.catvod.spider.merge.L.t;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class a extends b {
    private volatile a _immediate;
    private final a d;
    private final Handler e;
    private final String f;
    private final boolean g;

    public a(Handler handler) {
        this(handler, null, false);
    }

    private a(Handler handler, String str, boolean z) {
        super(null);
        this.e = handler;
        this.f = str;
        this.g = z;
        this._immediate = z ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.d = aVar;
    }

    @Override // com.github.catvod.spider.merge.L.t
    public final t c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).e == this.e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.e);
    }

    @Override // com.github.catvod.spider.merge.L.t, com.github.catvod.spider.merge.L.e
    public final String toString() {
        String d = d();
        if (d != null) {
            return d;
        }
        String str = this.f;
        if (str == null) {
            str = this.e.toString();
        }
        return this.g ? n.a(str, cYh.d("49392C3C323E0E313534")) : str;
    }
}
