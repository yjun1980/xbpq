/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Animatable
 */
package com.github.catvod.spider.merge.j;

import android.graphics.drawable.Animatable;
import com.github.catvod.spider.merge.j.f;

final class a
extends f {
    private final Animatable a;

    a(Animatable animatable) {
        this.a = animatable;
    }

    @Override
    public final void c() {
        this.a.start();
    }

    @Override
    public final void d() {
        this.a.stop();
    }
}

