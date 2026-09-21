/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnUnhandledKeyEventListener
 *  androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat
 */
package com.github.catvod.spider.merge.KI;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class h
implements View.OnUnhandledKeyEventListener {
    public final ViewCompat.OnUnhandledKeyEventListenerCompat a;

    public /* synthetic */ h(ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        this.a = onUnhandledKeyEventListenerCompat;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.a.onUnhandledKeyEvent(view, keyEvent);
    }
}

