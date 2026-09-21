/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.xc.U;

import android.widget.TextView;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.UY.A;

public final class o
implements Runnable {
    public final TextView a;
    public final boolean b;

    public /* synthetic */ o(TextView textView, boolean bl) {
        this.a = textView;
        this.b = bl;
    }

    @Override
    public final void run() {
        CharSequence charSequence = new StringBuilder("\u72b6\u6001\uff1a");
        charSequence.append(B.l());
        charSequence.append("\n\u542f\u7528\u540e\u4f1a\u6309\u5f53\u524d\u8bbe\u5907 ABI \u4e0b\u8f7d Go \u4e8c\u8fdb\u5236\uff0c\u542f\u52a8\u5931\u8d25\u81ea\u52a8\u56de\u9000 Java \u4ee3\u7406\u3002");
        charSequence = charSequence.toString();
        this.a.setText(charSequence);
        if (!this.b) {
            A.m("Go\u4ee3\u7406\u542f\u52a8\u5931\u8d25\uff0c\u5df2\u56de\u9000 Java \u4ee3\u7406");
        }
    }
}

