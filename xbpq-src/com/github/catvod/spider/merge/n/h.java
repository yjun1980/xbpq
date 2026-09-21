/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 */
package com.github.catvod.spider.merge.n;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.github.catvod.spider.merge.n.Q;

final class h {
    static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            view = view.getParent();
            while (view instanceof View) {
                if (view instanceof Q) {
                    editorInfo.hintText = ((Q)view).a();
                    break;
                }
                view = view.getParent();
            }
        }
        return inputConnection;
    }
}

