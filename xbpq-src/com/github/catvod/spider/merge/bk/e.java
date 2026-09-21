/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.widget.Toast
 */
package com.github.catvod.spider.merge.bk;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.ai.u;
import com.github.catvod.spider.merge.bk.d;

public final class e {
    private Toast a;

    public static void a(String string) {
        e e2 = d.a;
        if (!TextUtils.isEmpty((CharSequence)string)) {
            Toast toast = e2.a;
            if (toast != null) {
                toast.cancel();
            }
            string = Toast.makeText((Context)Init.context(), (CharSequence)string, (int)1);
            e2.a = string;
            string.show();
        }
    }

    public static void b(String string) {
        Init.run(new u(string, 1));
    }
}

