/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.xc.U;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public final class p
implements Runnable {
    public final int a;
    public final EditText b;

    public /* synthetic */ p(EditText editText, int n2) {
        this.a = n2;
        this.b = editText;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        EditText editText;
        block7: {
            switch (this.a) {
                default: {
                    EditText editText2 = this.b;
                    InputMethodManager inputMethodManager = (InputMethodManager)editText2.getContext().getSystemService("input_method");
                    if (inputMethodManager == null) return;
                    inputMethodManager.showSoftInput((View)editText2, 1);
                    return;
                }
                case 0: 
            }
            editText = this.b;
            try {}
            catch (Exception exception) {
                return;
            }
            break block7;
            catch (Exception exception) {
                return;
            }
        }
        InputMethodManager inputMethodManager = (InputMethodManager)editText.getContext().getSystemService("input_method");
        if (inputMethodManager == null) return;
        inputMethodManager.showSoftInput((View)editText, 1);
    }
}

