/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ShortcutInfo
 *  android.content.pm.ShortcutManager
 *  android.graphics.Insets
 *  android.os.ext.SdkExtensions
 *  android.view.View
 *  android.view.WindowInsets$Builder
 *  android.view.WindowInsetsAnimation
 *  android.view.WindowInsetsAnimation$Bounds
 *  android.view.WindowInsetsAnimation$Callback
 *  android.view.WindowInsetsAnimationController
 *  android.view.animation.Interpolator
 */
package com.github.catvod.spider.merge.xc.k;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Insets;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimationController;
import android.view.animation.Interpolator;
import java.util.List;

public abstract class b {
    public static /* bridge */ /* synthetic */ int A() {
        return SdkExtensions.getExtensionVersion((int)33);
    }

    public static /* bridge */ /* synthetic */ Insets B(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getHiddenStateInsets();
    }

    public static /* bridge */ /* synthetic */ int C() {
        return SdkExtensions.getExtensionVersion((int)1000000);
    }

    public static /* bridge */ /* synthetic */ float a(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getFraction();
    }

    public static /* bridge */ /* synthetic */ float b(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getCurrentFraction();
    }

    public static /* bridge */ /* synthetic */ int c() {
        return SdkExtensions.getExtensionVersion((int)30);
    }

    public static /* bridge */ /* synthetic */ int d(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getTypeMask();
    }

    public static /* bridge */ /* synthetic */ int e(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getTypes();
    }

    public static /* bridge */ /* synthetic */ long f(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getDurationMillis();
    }

    public static /* bridge */ /* synthetic */ Insets g(WindowInsetsAnimation.Bounds bounds) {
        return bounds.getUpperBound();
    }

    public static /* bridge */ /* synthetic */ Insets h(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getShownStateInsets();
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation i(Object object) {
        return (WindowInsetsAnimation)object;
    }

    public static /* bridge */ /* synthetic */ Interpolator j(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getInterpolator();
    }

    public static /* bridge */ /* synthetic */ List k(ShortcutManager shortcutManager, int n2) {
        return shortcutManager.getShortcuts(n2);
    }

    public static /* bridge */ /* synthetic */ void l(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo) {
        shortcutManager.pushDynamicShortcut(shortcutInfo);
    }

    public static /* bridge */ /* synthetic */ void m(ShortcutManager shortcutManager, List list) {
        shortcutManager.removeLongLivedShortcuts(list);
    }

    public static /* bridge */ /* synthetic */ void n(View view, WindowInsetsAnimation.Callback callback) {
        view.setWindowInsetsAnimationCallback(callback);
    }

    public static /* bridge */ /* synthetic */ void o(WindowInsets.Builder builder, int n2, Insets insets) {
        builder.setInsets(n2, insets);
    }

    public static /* bridge */ /* synthetic */ void p(WindowInsetsAnimation windowInsetsAnimation, float f2) {
        windowInsetsAnimation.setFraction(f2);
    }

    public static /* bridge */ /* synthetic */ void q(WindowInsetsAnimationController windowInsetsAnimationController, Insets insets, float f2, float f4) {
        windowInsetsAnimationController.setInsetsAndAlpha(insets, f2, f4);
    }

    public static /* bridge */ /* synthetic */ void r(WindowInsetsAnimationController windowInsetsAnimationController, boolean bl) {
        windowInsetsAnimationController.finish(bl);
    }

    public static /* bridge */ /* synthetic */ boolean s(ShortcutInfo shortcutInfo) {
        return shortcutInfo.isCached();
    }

    public static /* bridge */ /* synthetic */ boolean t(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.isFinished();
    }

    public static /* bridge */ /* synthetic */ float u(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getInterpolatedFraction();
    }

    public static /* bridge */ /* synthetic */ float v(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getCurrentAlpha();
    }

    public static /* bridge */ /* synthetic */ int w() {
        return SdkExtensions.getExtensionVersion((int)31);
    }

    public static /* bridge */ /* synthetic */ Insets x(WindowInsetsAnimation.Bounds bounds) {
        return bounds.getLowerBound();
    }

    public static /* bridge */ /* synthetic */ Insets y(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getCurrentInsets();
    }

    public static /* bridge */ /* synthetic */ boolean z(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.isCancelled();
    }
}

