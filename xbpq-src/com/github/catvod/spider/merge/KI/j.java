/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.os.CancellationSignal
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 *  android.view.WindowInsets$Type
 *  android.view.WindowInsetsAnimationControlListener
 *  android.view.WindowInsetsController
 *  android.view.WindowInsetsController$OnControllableInsetsChangedListener
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.animation.Interpolator
 *  androidx.core.view.b
 */
package com.github.catvod.spider.merge.KI;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import androidx.core.view.b;

public abstract class j {
    public static /* bridge */ /* synthetic */ int A() {
        return WindowInsets.Type.systemGestures();
    }

    public static /* bridge */ /* synthetic */ int B() {
        return WindowInsets.Type.mandatorySystemGestures();
    }

    public static /* bridge */ /* synthetic */ int C() {
        return WindowInsets.Type.tappableElement();
    }

    public static /* bridge */ /* synthetic */ int D() {
        return WindowInsets.Type.displayCutout();
    }

    public static /* bridge */ /* synthetic */ int a() {
        return WindowInsets.Type.statusBars();
    }

    public static /* bridge */ /* synthetic */ int b(WindowInsetsController windowInsetsController) {
        return windowInsetsController.getSystemBarsAppearance();
    }

    public static /* bridge */ /* synthetic */ Insets c(WindowInsets windowInsets, int n2) {
        return windowInsets.getInsetsIgnoringVisibility(n2);
    }

    public static /* bridge */ /* synthetic */ WindowInsets d() {
        return WindowInsets.CONSUMED;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController.OnControllableInsetsChangedListener e(Object object) {
        return (WindowInsetsController.OnControllableInsetsChangedListener)object;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController f(Window window) {
        return window.getInsetsController();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction g() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }

    public static /* bridge */ /* synthetic */ CharSequence h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static /* bridge */ /* synthetic */ void i(WindowInsets.Builder builder, int n2, Insets insets) {
        builder.setInsetsIgnoringVisibility(n2, insets);
    }

    public static /* bridge */ /* synthetic */ void j(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    public static /* bridge */ /* synthetic */ void k(WindowInsetsController windowInsetsController, int n2) {
        windowInsetsController.hide(n2);
    }

    public static /* bridge */ /* synthetic */ void l(WindowInsetsController windowInsetsController, int n2, long l2, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListener windowInsetsAnimationControlListener) {
        windowInsetsController.controlWindowInsetsAnimation(n2, l2, interpolator, cancellationSignal, windowInsetsAnimationControlListener);
    }

    public static /* bridge */ /* synthetic */ void m(WindowInsetsController windowInsetsController, WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    public static /* bridge */ /* synthetic */ void n(WindowInsetsController windowInsetsController, b b2) {
        windowInsetsController.addOnControllableInsetsChangedListener((WindowInsetsController.OnControllableInsetsChangedListener)b2);
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ boolean p(WindowInsets windowInsets, int n2) {
        return windowInsets.isVisible(n2);
    }

    public static /* bridge */ /* synthetic */ int q() {
        return WindowInsets.Type.navigationBars();
    }

    public static /* bridge */ /* synthetic */ int r(WindowInsetsController windowInsetsController) {
        return windowInsetsController.getSystemBarsBehavior();
    }

    public static /* bridge */ /* synthetic */ Insets s(WindowInsets windowInsets, int n2) {
        return windowInsets.getInsets(n2);
    }

    public static /* bridge */ /* synthetic */ void t(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(16, 16);
    }

    public static /* bridge */ /* synthetic */ void u(WindowInsetsController windowInsetsController, int n2) {
        windowInsetsController.setSystemBarsBehavior(n2);
    }

    public static /* bridge */ /* synthetic */ int v() {
        return WindowInsets.Type.captionBar();
    }

    public static /* bridge */ /* synthetic */ void w(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    public static /* bridge */ /* synthetic */ void x(WindowInsetsController windowInsetsController, int n2) {
        windowInsetsController.show(n2);
    }

    public static /* bridge */ /* synthetic */ int y() {
        return WindowInsets.Type.ime();
    }

    public static /* bridge */ /* synthetic */ void z(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(8, 8);
    }
}

