/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.RemoteInput
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 */
package com.github.catvod.spider.merge.xc.i;

import android.app.RemoteInput;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowInsets;

public abstract class c {
    public static /* bridge */ /* synthetic */ int a(WindowInsets windowInsets) {
        return windowInsets.getSystemWindowInsetLeft();
    }

    public static /* bridge */ /* synthetic */ RemoteInput b(Parcelable parcelable) {
        return (RemoteInput)parcelable;
    }

    public static /* bridge */ /* synthetic */ WindowInsets c(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static /* bridge */ /* synthetic */ WindowInsets d(WindowInsets windowInsets) {
        return windowInsets.consumeSystemWindowInsets();
    }

    public static /* bridge */ /* synthetic */ WindowInsets e(WindowInsets windowInsets, int n2, int n3, int n4, int n5) {
        return windowInsets.replaceSystemWindowInsets(n2, n3, n4, n5);
    }

    public static /* bridge */ /* synthetic */ WindowInsets f(Object object) {
        return (WindowInsets)object;
    }

    public static /* bridge */ /* synthetic */ void g(View view) {
        view.setOnApplyWindowInsetsListener(null);
    }

    public static /* bridge */ /* synthetic */ void h(View view, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
    }

    public static /* bridge */ /* synthetic */ boolean i(WindowInsets windowInsets) {
        return windowInsets.isRound();
    }

    public static /* bridge */ /* synthetic */ boolean j(WindowInsets windowInsets, Object object) {
        return windowInsets.equals(object);
    }

    public static /* bridge */ /* synthetic */ int k(WindowInsets windowInsets) {
        return windowInsets.getSystemWindowInsetTop();
    }

    public static /* bridge */ /* synthetic */ int l(WindowInsets windowInsets) {
        return windowInsets.getSystemWindowInsetRight();
    }

    public static /* bridge */ /* synthetic */ int m(WindowInsets windowInsets) {
        return windowInsets.getSystemWindowInsetBottom();
    }

    public static /* bridge */ /* synthetic */ int n(WindowInsets windowInsets) {
        return windowInsets.hashCode();
    }
}

