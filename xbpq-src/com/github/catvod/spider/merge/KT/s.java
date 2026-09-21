/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.KeyEvent
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.KT;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

public final class s
extends EditText {
    public s(Context context) {
        super(context);
    }

    public final boolean onKeyPreIme(int n2, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && (n2 == 4 || n2 == 111)) {
            this.setTag(Boolean.FALSE);
        }
        return super.onKeyPreIme(n2, keyEvent);
    }
}

