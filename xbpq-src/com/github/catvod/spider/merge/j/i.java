/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
package com.github.catvod.spider.merge.j;

import android.graphics.drawable.Drawable;

final class i
implements Drawable.Callback {
    private Drawable.Callback a;

    i() {
    }

    public final Drawable.Callback a() {
        Drawable.Callback callback = this.a;
        this.a = null;
        return callback;
    }

    public final i b(Drawable.Callback callback) {
        this.a = callback;
        return this;
    }

    public final void invalidateDrawable(Drawable drawable) {
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        Drawable.Callback callback = this.a;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, l2);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.a;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}

