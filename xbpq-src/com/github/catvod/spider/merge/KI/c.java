/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  androidx.core.view.DragStartHelper
 */
package com.github.catvod.spider.merge.KI;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.DragStartHelper;

public final class c
implements View.OnTouchListener {
    public final DragStartHelper a;

    public /* synthetic */ c(DragStartHelper dragStartHelper) {
        this.a = dragStartHelper;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.onTouch(view, motionEvent);
    }
}

