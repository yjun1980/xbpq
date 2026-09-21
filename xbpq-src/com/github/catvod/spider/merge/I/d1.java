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
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.I.f;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.i0.m;
import java.io.File;
import java.util.Objects;

public final class d1
implements DialogInterface.OnClickListener {
    public final int a;
    public final EditText b;
    public final Object c;

    public /* synthetic */ d1(Object object, EditText editText, int n2) {
        this.a = n2;
        this.c = object;
        this.b = editText;
    }

    public final void onClick(DialogInterface object, int n2) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                object = (f1)this.c;
                EditText editText = this.b;
                Objects.requireNonNull(object);
                Init.execute(new f(object, editText.getText().toString(), 2));
                return;
            }
        }
        object = (TgYunDouBanPan)((Object)this.c);
        Object object2 = this.b;
        n2 = TgYunDouBanPan.u;
        Objects.requireNonNull(object);
        object2 = object2.getText().toString();
        if (!e.b((CharSequence)object2)) {
            com.github.catvod.spider.merge.c.b.f(new File(com.github.catvod.spider.merge.c.b.c("tv", ".tgsou_api_session")), (String)object2);
            object = new StringBuilder();
            ((StringBuilder)object).append(Init.context().getFilesDir().getAbsolutePath());
            ((StringBuilder)object).append("/193316_session_0.txt");
            com.github.catvod.spider.merge.c.b.f(new File(((StringBuilder)object).toString()), (String)object2);
            m.y("\u6b63\u5728\u5f3a\u5236\u542f\u52a8tgsou \u7a0d\u7b49\u91cd\u8bd5 \u6216\u9000\u51fa\u8f6f\u4ef6\u91cd\u8fdb");
            NetPan.initTg(true, NetPan.k);
        }
    }
}

