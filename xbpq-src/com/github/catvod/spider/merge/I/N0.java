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
import com.github.catvod.spider.merge.I.P0;
import com.github.catvod.spider.merge.I.e;
import java.util.Objects;

public final class N0
implements DialogInterface.OnClickListener {
    public final EditText a;

    public /* synthetic */ N0(EditText editText) {
        this.a = editText;
    }

    public final void onClick(DialogInterface object, int n2) {
        Object object2 = this.a;
        object = P0.a;
        object2 = object2.getText().toString();
        Objects.requireNonNull(object);
        Init.execute(new e(object, object2, 4));
    }
}

