/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.github.catvod.spider.merge.n;

import android.view.View;
import com.github.catvod.spider.merge.n.N;
import java.util.Objects;

final class M
implements View.OnClickListener {
    final N a;

    M(N n2) {
        this.a = n2;
        n2.a.getContext();
    }

    public final void onClick(View view) {
        Objects.requireNonNull(this.a);
    }
}

