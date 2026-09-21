/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 *  android.text.TextPaint
 *  android.view.PointerIcon
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
package com.github.catvod.spider.merge.xc.r;

import android.os.LocaleList;
import android.text.TextPaint;
import android.view.PointerIcon;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Locale;
import java.util.function.Consumer;

public abstract class a {
    public static /* bridge */ /* synthetic */ int a(LocaleList localeList, Locale locale) {
        return localeList.indexOf(locale);
    }

    public static /* bridge */ /* synthetic */ int b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getDrawingOrder();
    }

    public static /* bridge */ /* synthetic */ LocaleList c(TextPaint textPaint) {
        return textPaint.getTextLocales();
    }

    public static /* bridge */ /* synthetic */ PointerIcon d(Object object) {
        return (PointerIcon)object;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction e() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
    }

    public static /* bridge */ /* synthetic */ Consumer f(Object object) {
        return (Consumer)object;
    }

    public static /* bridge */ /* synthetic */ void g(AccessibilityNodeInfo accessibilityNodeInfo, int n2) {
        accessibilityNodeInfo.setDrawingOrder(n2);
    }

    public static /* bridge */ /* synthetic */ void h(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setImportantForAccessibility(bl);
    }

    public static /* bridge */ /* synthetic */ boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isImportantForAccessibility();
    }
}

