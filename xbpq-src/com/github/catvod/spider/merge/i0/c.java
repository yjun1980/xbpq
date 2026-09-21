/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.widget.Toast
 */
package com.github.catvod.spider.merge.i0;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.i0.b;

public final class c {
    private Toast a;

    public static void a(String string) {
        c c2 = b.a;
        if (!TextUtils.isEmpty((CharSequence)string)) {
            Toast toast = c2.a;
            if (toast != null) {
                toast.cancel();
            }
            string = Toast.makeText((Context)Init.context(), (CharSequence)string, (int)1);
            c2.a = string;
            string.show();
        }
    }

    public static void b(String string) {
        Init.run(new com.github.catvod.spider.merge.I.c(string, 4));
    }
}

