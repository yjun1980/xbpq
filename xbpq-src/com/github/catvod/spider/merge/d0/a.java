/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.EditText
 *  android.widget.Toast
 */
package com.github.catvod.spider.merge.d0;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.BaseApi$Task;
import com.github.catvod.spider.Init;
import java.util.Objects;

public final class a
implements DialogInterface.OnClickListener {
    public final BaseApi a;
    public final EditText b;
    public final BaseApi$Task c;

    public /* synthetic */ a(BaseApi baseApi, EditText editText, BaseApi$Task baseApi$Task) {
        this.a = baseApi;
        this.b = editText;
        this.c = baseApi$Task;
    }

    public final void onClick(DialogInterface object, int n2) {
        BaseApi baseApi = this.a;
        Object object2 = this.b;
        object = this.c;
        Objects.requireNonNull(baseApi);
        object2 = object2.getText().toString();
        if (!((String)object2).isEmpty()) {
            object.execute((String)object2);
        } else {
            Toast.makeText((Context)Init.context(), (CharSequence)"\u8f93\u5165\u4e0d\u80fd\u4e3a\u7a7a", (int)0).show();
        }
    }
}

