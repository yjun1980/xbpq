/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.SharedPreferences
 */
package com.github.catvod.spider.merge.i0;

import android.app.Application;
import android.content.SharedPreferences;
import com.github.catvod.spider.Init;

public final class d {
    private static SharedPreferences a() {
        Application application = Init.context();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Init.context().getPackageName());
        stringBuilder.append("_preferences");
        return application.getSharedPreferences(stringBuilder.toString(), 0);
    }

    public static String b(String string) {
        return d.a().getString(string, "");
    }

    public static void c(String string, Object object) {
        d.a().edit().putString(string, (String)object).apply();
    }
}

