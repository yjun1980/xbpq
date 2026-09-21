/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 */
package com.github.catvod.spider.merge.l;

import android.content.Context;
import android.content.res.Configuration;

public final class a {
    private Context a;

    private a(Context context) {
        this.a = context;
    }

    public static a a(Context context) {
        return new a(context);
    }

    public final int b() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public final int c() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int n2 = configuration.screenWidthDp;
        int n3 = configuration.screenHeightDp;
        if (!(configuration.smallestScreenWidthDp > 600 || n2 > 600 || n2 > 960 && n3 > 720 || n2 > 720 && n3 > 960)) {
            if (!(n2 >= 500 || n2 > 640 && n3 > 480 || n2 > 480 && n3 > 640)) {
                if (n2 >= 360) {
                    return 3;
                }
                return 2;
            }
            return 4;
        }
        return 5;
    }
}

