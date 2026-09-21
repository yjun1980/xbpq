/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.d0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.R0.e;
import java.util.Objects;

public final class b
implements DialogInterface.OnClickListener {
    public final BaseApi a;
    public final EditText b;
    public final String c;

    public /* synthetic */ b(BaseApi baseApi, EditText editText, String string) {
        this.a = baseApi;
        this.b = editText;
        this.c = string;
    }

    public final void onClick(DialogInterface object, int n2) {
        BaseApi baseApi = this.a;
        Object object2 = this.b;
        object = this.c;
        Objects.requireNonNull(baseApi);
        object2 = object2.getText().toString();
        if (!e.d((CharSequence)object) || ((String)object2).equals(object) || !((String)object).startsWith((String)object2)) {
            object = object2;
        }
        baseApi.onSubscriptionUrlPositive((String)object);
    }
}

