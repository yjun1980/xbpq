/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.Button
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
package com.github.catvod.spider.merge.xc.U;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

public final class D
implements TextView.OnEditorActionListener {
    public final int a;
    public final Button b;

    public /* synthetic */ D(Button button, int n2) {
        this.a = n2;
        this.b = button;
    }

    public final boolean onEditorAction(TextView textView, int n2, KeyEvent keyEvent) {
        switch (this.a) {
            default: {
                this.b.performClick();
                return true;
            }
            case 2: {
                this.b.performClick();
                return true;
            }
            case 1: {
                this.b.performClick();
                return true;
            }
            case 0: 
        }
        this.b.performClick();
        return true;
    }
}

