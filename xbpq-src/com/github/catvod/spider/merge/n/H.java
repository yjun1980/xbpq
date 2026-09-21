/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  androidx.core.graphics.ColorUtils
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.n.L;

public final class H {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal();
    static final int[] b = new int[]{-16842910};
    static final int[] c = new int[]{16842908};
    static final int[] d = new int[]{16842919};
    static final int[] e = new int[]{0x10100A0};
    static final int[] f = new int[0];
    private static final int[] g = new int[1];

    public static void a(View view, Context context) {
        context = context.obtainStyledAttributes(com.github.catvod.spider.merge.g.a.h);
        try {
            if (!context.hasValue(117)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("View ");
                stringBuilder.append(view.getClass());
                stringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e((String)"ThemeUtils", (String)stringBuilder.toString());
            }
            return;
        }
        finally {
            context.recycle();
        }
    }

    public static int b(Context context, int n2) {
        ColorStateList colorStateList = H.d(context, n2);
        if (colorStateList != null && colorStateList.isStateful()) {
            return colorStateList.getColorForState(b, colorStateList.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        colorStateList = typedValue;
        if (typedValue == null) {
            colorStateList = new TypedValue();
            threadLocal.set((TypedValue)colorStateList);
        }
        context.getTheme().resolveAttribute(0x1010033, (TypedValue)colorStateList, true);
        float f2 = colorStateList.getFloat();
        n2 = H.c(context, n2);
        return ColorUtils.setAlphaComponent((int)n2, (int)Math.round((float)Color.alpha((int)n2) * f2));
    }

    public static int c(Context object, int n2) {
        int[] nArray = g;
        nArray[0] = n2;
        object = L.r((Context)object, null, nArray);
        try {
            n2 = ((L)object).b();
            return n2;
        }
        finally {
            ((L)object).t();
        }
    }

    public static ColorStateList d(Context object, int n2) {
        Object object2 = g;
        object2[0] = n2;
        object = L.r((Context)object, null, object2);
        try {
            object2 = ((L)object).c(0);
            return object2;
        }
        finally {
            ((L)object).t();
        }
    }
}

