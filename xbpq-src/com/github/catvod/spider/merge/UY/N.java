/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.res.Configuration
 *  android.graphics.Bitmap
 *  android.graphics.Rect
 *  android.hardware.display.DisplayManager
 *  android.os.UserHandle
 *  android.os.UserManager
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.util.AtomicFile
 *  android.view.Gravity
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.github.catvod.spider.merge.UY;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.UserHandle;
import android.os.UserManager;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AtomicFile;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.github.catvod.spider.merge.UY.P;
import java.io.FileOutputStream;
import java.util.Locale;

public abstract class N {
    public static /* bridge */ /* synthetic */ void A(ViewGroup.MarginLayoutParams marginLayoutParams, int n2) {
        marginLayoutParams.setMarginEnd(n2);
    }

    public static /* bridge */ /* synthetic */ void B(AccessibilityNodeInfo accessibilityNodeInfo, View view, int n2) {
        accessibilityNodeInfo.setLabelFor(view, n2);
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return UserHandle.class;
    }

    public static /* bridge */ /* synthetic */ int a(Configuration configuration) {
        return configuration.densityDpi;
    }

    public static /* bridge */ /* synthetic */ int b(View view) {
        return view.getPaddingStart();
    }

    public static /* bridge */ /* synthetic */ int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static /* bridge */ /* synthetic */ int d(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale((Locale)locale);
    }

    public static /* bridge */ /* synthetic */ AlertDialog.Builder e(AlertDialog.Builder builder, P p2) {
        return builder.setOnDismissListener((DialogInterface.OnDismissListener)p2);
    }

    public static /* bridge */ /* synthetic */ DisplayManager f(Object object) {
        return (DisplayManager)object;
    }

    public static /* bridge */ /* synthetic */ UserHandle g(Object object) {
        return (UserHandle)object;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getLabelFor();
    }

    public static /* bridge */ /* synthetic */ FileOutputStream i(AtomicFile atomicFile) {
        return atomicFile.startWrite();
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return DisplayManager.class;
    }

    public static /* bridge */ /* synthetic */ Locale k(TextPaint textPaint) {
        return textPaint.getTextLocale();
    }

    public static /* bridge */ /* synthetic */ void l(int n2, int n3, int n4, Rect rect, Rect rect2) {
        Gravity.apply((int)n2, (int)n3, (int)n4, (Rect)rect, (Rect)rect2, (int)0);
    }

    public static /* bridge */ /* synthetic */ void m(Bitmap bitmap, boolean bl) {
        bitmap.setHasMipMap(bl);
    }

    public static /* bridge */ /* synthetic */ void n(AtomicFile atomicFile, FileOutputStream fileOutputStream) {
        atomicFile.finishWrite(fileOutputStream);
    }

    public static /* bridge */ /* synthetic */ void o(View view, int n2, int n3, int n4, int n5) {
        view.setPaddingRelative(n2, n3, n4, n5);
    }

    public static /* bridge */ /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int n2) {
        marginLayoutParams.setMarginStart(n2);
    }

    public static /* bridge */ /* synthetic */ void q(AccessibilityNodeInfo accessibilityNodeInfo, View view, int n2) {
        accessibilityNodeInfo.setLabeledBy(view, n2);
    }

    public static /* bridge */ /* synthetic */ boolean r(Activity activity) {
        return activity.isDestroyed();
    }

    public static /* bridge */ /* synthetic */ boolean s(Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    public static /* bridge */ /* synthetic */ byte[] t(AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    public static /* bridge */ /* synthetic */ int u(View view) {
        return view.getPaddingEnd();
    }

    public static /* bridge */ /* synthetic */ int v(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static /* bridge */ /* synthetic */ AlertDialog.Builder w(AlertDialog.Builder builder, P p2) {
        return builder.setOnDismissListener((DialogInterface.OnDismissListener)p2);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getLabeledBy();
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return UserManager.class;
    }

    public static /* bridge */ /* synthetic */ void z(AtomicFile atomicFile, FileOutputStream fileOutputStream) {
        atomicFile.failWrite(fileOutputStream);
    }
}

