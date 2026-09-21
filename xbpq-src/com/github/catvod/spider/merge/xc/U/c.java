/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.Button
 *  android.widget.LinearLayout
 */
package com.github.catvod.spider.merge.xc.U;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.a.a;

public final class c
implements View.OnFocusChangeListener {
    public final int a;
    public final View b;
    public final boolean c;

    public /* synthetic */ c(View view, boolean bl, int n2) {
        this.a = n2;
        this.b = view;
        this.c = bl;
    }

    public final void onFocusChange(View view, boolean bl) {
        switch (this.a) {
            default: {
                com.github.catvod.spider.merge.xc.D0.b.e((LinearLayout)this.b, this.c, bl);
                return;
            }
            case 1: {
                boolean bl2 = this.c;
                int n2 = bl ? Color.rgb((int)30, (int)64, (int)175) : (bl2 ? Color.rgb((int)37, (int)99, (int)235) : Color.rgb((int)243, (int)244, (int)246));
                float f2 = C.j(12);
                int n3 = bl ? Color.rgb((int)30, (int)64, (int)175) : (bl2 ? Color.rgb((int)37, (int)99, (int)235) : Color.rgb((int)209, (int)213, (int)219));
                int n4 = bl ? 2 : 1;
                view = com.github.catvod.spider.merge.xc.a.a.v(n2, f2, n3, C.j(n4));
                ((Button)this.b).setBackground((Drawable)view);
                return;
            }
            case 0: 
        }
        com.github.catvod.spider.merge.xc.D0.b.d((Button)this.b, this.c, bl);
    }
}

