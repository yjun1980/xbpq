/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  androidx.core.view.DragStartHelper
 */
package com.github.catvod.spider.merge.KI;

import android.view.View;
import androidx.core.view.DragStartHelper;

public final class b
implements View.OnLongClickListener {
    public final DragStartHelper a;

    public /* synthetic */ b(DragStartHelper dragStartHelper) {
        this.a = dragStartHelper;
    }

    public final boolean onLongClick(View view) {
        return this.a.onLongClick(view);
    }
}

