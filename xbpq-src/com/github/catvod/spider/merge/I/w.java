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
import com.github.catvod.spider.merge.I.A;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.g;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.x;
import java.util.Objects;

public final class w
implements DialogInterface.OnClickListener {
    public final int a;
    public final EditText b;
    public final Object c;

    public /* synthetic */ w(Object object, EditText editText, int n2) {
        this.a = n2;
        this.c = object;
        this.b = editText;
    }

    public final void onClick(DialogInterface object, int n2) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                s0.e((s0)this.c, this.b);
                return;
            }
            case 0: {
                object = (A)this.c;
                EditText editText = this.b;
                Objects.requireNonNull(object);
                Init.execute(new x(object, editText.getText().toString(), 0));
                return;
            }
        }
        f1 f12 = (f1)this.c;
        object = this.b;
        Objects.requireNonNull(f12);
        Init.execute(new g(f12, object.getText().toString(), 1));
    }
}

