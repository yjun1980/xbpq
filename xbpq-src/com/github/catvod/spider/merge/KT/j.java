/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.KT;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.KT.t;

public final class j
implements View.OnFocusChangeListener {
    public final Activity a;
    public final EditText b;

    public /* synthetic */ j(Activity activity, s s2) {
        this.a = activity;
        this.b = s2;
    }

    public final void onFocusChange(View object, boolean bl) {
        object = (s)this.b;
        t.w(this.a, (s)((Object)object), bl);
    }
}

