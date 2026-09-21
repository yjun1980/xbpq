/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
package com.github.catvod.spider.merge.KT;

import android.view.KeyEvent;
import android.view.View;

public final class p
implements View.OnKeyListener {
    public final boolean onKey(View view, int n2, KeyEvent keyEvent) {
        int n3 = keyEvent.getAction();
        boolean bl = true;
        if (n3 == 1 && (n2 == 23 || n2 == 66)) {
            view.performClick();
        } else {
            bl = false;
        }
        return bl;
    }
}

