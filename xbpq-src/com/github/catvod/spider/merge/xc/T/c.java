/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Icon
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristic
 *  android.text.TextPaint
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.xc.T;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

public abstract class c {
    public static /* bridge */ /* synthetic */ int a(Activity activity) {
        return activity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static /* bridge */ /* synthetic */ int b(Context context, String string) {
        return context.checkSelfPermission(string);
    }

    public static /* bridge */ /* synthetic */ Icon c(int n2, byte[] byArray) {
        return Icon.createWithData((byte[])byArray, (int)0, (int)n2);
    }

    public static /* bridge */ /* synthetic */ Icon d(Bitmap bitmap) {
        return Icon.createWithBitmap((Bitmap)bitmap);
    }

    public static /* bridge */ /* synthetic */ Icon e(Uri uri) {
        return Icon.createWithContentUri((Uri)uri);
    }

    public static /* bridge */ /* synthetic */ Icon f(Parcelable parcelable) {
        return (Icon)parcelable;
    }

    public static /* bridge */ /* synthetic */ Icon g(Object object) {
        return (Icon)object;
    }

    public static /* bridge */ /* synthetic */ StaticLayout.Builder h(StaticLayout.Builder builder, int n2) {
        return builder.setBreakStrategy(n2);
    }

    public static /* bridge */ /* synthetic */ StaticLayout.Builder i(StaticLayout.Builder builder, TextDirectionHeuristic textDirectionHeuristic) {
        return builder.setTextDirection(textDirectionHeuristic);
    }

    public static /* bridge */ /* synthetic */ StaticLayout.Builder j(CharSequence charSequence, int n2, TextPaint textPaint) {
        return StaticLayout.Builder.obtain((CharSequence)charSequence, (int)0, (int)n2, (TextPaint)textPaint, (int)Integer.MAX_VALUE);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction k() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
    }

    public static /* bridge */ /* synthetic */ Object l(Context context, Class clazz) {
        return context.getSystemService(clazz);
    }

    public static /* bridge */ /* synthetic */ void m(Activity activity, String[] stringArray) {
        activity.requestPermissions(stringArray, 9999);
    }

    public static /* bridge */ /* synthetic */ void n(StaticLayout.Builder builder) {
        builder.build();
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setContextClickable(bl);
    }

    public static /* bridge */ /* synthetic */ void p(TextView textView, int n2) {
        textView.setTextAppearance(n2);
    }

    public static /* bridge */ /* synthetic */ boolean q(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isContextClickable();
    }

    public static /* bridge */ /* synthetic */ boolean r(Object object) {
        return object instanceof Icon;
    }

    public static /* bridge */ /* synthetic */ StaticLayout.Builder s(StaticLayout.Builder builder, int n2) {
        return builder.setHyphenationFrequency(n2);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction t() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction u() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction v() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction x() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction y() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
    }
}

