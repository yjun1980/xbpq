/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.X0;
import com.github.catvod.spider.merge.I.h;
import java.util.Objects;

public final class W0
implements DialogInterface.OnClickListener {
    public final EditText a;

    public /* synthetic */ W0(EditText editText) {
        this.a = editText;
    }

    public final void onClick(DialogInterface object, int n2) {
        Object object2 = this.a;
        object = X0.a;
        object2 = object2.getText().toString();
        Objects.requireNonNull(object);
        Init.execute(new h(object, object2, 3));
    }
}

