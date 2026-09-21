/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.Log
 *  android.view.View
 *  androidx.core.view.ViewCompat
 */
package com.github.catvod.spider.merge.n;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class P {
    private static Method a;

    static {
        try {
            Method method;
            a = method = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            if (!method.isAccessible()) {
                ((AccessibleObject)a).setAccessible(true);
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Log.d((String)"ViewUtils", (String)"Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        int n2 = ViewCompat.getLayoutDirection((View)view);
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }
}

