/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.Color
 *  android.text.TextUtils
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.h;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.KT.t;

public final class i
implements View.OnClickListener {
    public final int a;
    public final KeyEvent.Callback b;

    public /* synthetic */ i(KeyEvent.Callback callback, int n2) {
        this.a = n2;
        this.b = callback;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onClick(View var1_1) {
        switch (this.a) {
            default: {
                var4_3 = (Activity)this.b;
                var5_4 /* !! */  = new LinearLayout((Context)var4_3);
                var5_4 /* !! */ .setOrientation(1);
                var2_5 = t.g((Context)var4_3, 22);
                var5_4 /* !! */ .setPadding(var2_5, t.g((Context)var4_3, 18), var2_5, t.g((Context)var4_3, 14));
                var1_1 /* !! */  = new TextView((Context)var4_3);
                var1_1 /* !! */ .setText((CharSequence)"\u8c46\u5e55\u641c\u7d22");
                var1_1 /* !! */ .setTextColor(Color.rgb((int)34, (int)38, (int)48));
                var1_1 /* !! */ .setTextSize(20.0f);
                var1_1 /* !! */ .setGravity(16);
                var3_6 /* !! */  = new LinearLayout.LayoutParams(-1, t.g((Context)var4_3, 36));
                var5_4 /* !! */ .addView(var1_1 /* !! */ , (ViewGroup.LayoutParams)var3_6 /* !! */ );
                var6_10 = t.n(var4_3, "\u5267\u540d", t.f(var4_3));
                var3_6 /* !! */  = C.d;
                if (TextUtils.isEmpty((CharSequence)var3_6 /* !! */ )) ** GOTO lbl22
                var1_1 /* !! */  = var3_6 /* !! */ ;
                if (!"movie".equalsIgnoreCase((String)var3_6 /* !! */ )) ** GOTO lbl23
lbl22:
                // 2 sources

                var1_1 /* !! */  = "1";
lbl23:
                // 2 sources

                try {
                    var3_6 /* !! */  = t.n(var4_3, "\u96c6\u6570\uff0c\u4f8b\u5982 1 / 01 / \u7b2c1\u96c6", (String)var1_1 /* !! */ );
                    var5_4 /* !! */ .addView((View)var6_10, (ViewGroup.LayoutParams)t.p(-1, t.g((Context)var4_3, 48), 0, t.g((Context)var4_3, 12), 0));
                    var5_4 /* !! */ .addView((View)var3_6 /* !! */ , (ViewGroup.LayoutParams)t.p(-1, t.g((Context)var4_3, 48), 0, 0, 0));
                    var8_11 = new LinearLayout((Context)var4_3);
                    var8_11.setGravity(21);
                    var8_11.setOrientation(0);
                    var1_1 /* !! */  = t.b(var4_3, "\u53d6\u6d88", false);
                    var7_12 = t.b(var4_3, "\u641c\u7d22", true);
                    var8_11.addView(var1_1 /* !! */ , (ViewGroup.LayoutParams)t.p(t.g((Context)var4_3, 92), t.g((Context)var4_3, 42), 0, 0, t.g((Context)var4_3, 10)));
                    var9_13 = new LinearLayout.LayoutParams(t.g((Context)var4_3, 92), t.g((Context)var4_3, 42));
                    var8_11.addView((View)var7_12, (ViewGroup.LayoutParams)var9_13);
                    var5_4 /* !! */ .addView((View)var8_11, (ViewGroup.LayoutParams)t.p(-1, t.g((Context)var4_3, 54), 0, t.g((Context)var4_3, 18), 0));
                    var8_11 = new AlertDialog.Builder((Context)var4_3);
                    var8_11 = var8_11.setView((View)var5_4 /* !! */ ).create();
                    var5_4 /* !! */  = new h((AlertDialog)var8_11, (Button)var1_1 /* !! */ , var7_12, var4_3, var6_10, (s)var3_6 /* !! */ );
                    var8_11.setOnShowListener((DialogInterface.OnShowListener)var5_4 /* !! */ );
                    var8_11.show();
                }
                catch (Throwable var1_2) {
                    m.p(var1_2, new StringBuilder("[Doumu] show search failed: "));
                }
                return;
            }
            case 0: 
        }
        var1_1 /* !! */  = B.l;
        synchronized (var1_1 /* !! */ ) {
            block14: {
                try {
                    var3_7 = var1_1 /* !! */ .a;
                    if (var3_7 == null) break block14;
                }
                catch (Throwable var3_9) {
                    ** continue;
                }
                var3_7.destroy();
            }
lbl56:
            // 2 sources

            while (true) {
                var1_1 /* !! */ .a = null;
                var1_1 /* !! */ .e = false;
                // MONITOREXIT @DISABLED, blocks:[5, 6, 13] lbl57 : MonitorExitStatement: MONITOREXIT : var1_1 /* !! */ 
                B.C(true);
                ((TextView)this.b).setText((CharSequence)"\u72b6\u6001\uff1a\u4e0b\u8f7d/\u542f\u52a8\u4e2d...");
                InitOrigin.execute((Runnable)new com.github.catvod.spider.merge.UY.s(18));
                return;
            }
        }
    }
}

