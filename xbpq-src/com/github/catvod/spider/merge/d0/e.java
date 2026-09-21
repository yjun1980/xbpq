/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.github.catvod.spider.merge.d0;

import android.view.View;
import com.github.catvod.en.BaseApi;

public final class e
implements View.OnClickListener {
    public final BaseApi a;
    public final String b;

    public /* synthetic */ e(BaseApi baseApi, String string) {
        this.a = baseApi;
        this.b = string;
    }

    public final void onClick(View object) {
        BaseApi baseApi = this.a;
        object = this.b;
        baseApi.g.setText((CharSequence)object);
    }
}

