/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Person
 *  android.content.pm.PackageInfo
 *  android.content.pm.ShortcutInfo
 *  android.content.pm.SigningInfo
 *  android.graphics.Bitmap
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$OnHeaderDecodedListener
 *  android.graphics.ImageDecoder$Source
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.text.PrecomputedText
 *  android.text.PrecomputedText$Params
 *  android.text.TextDirectionHeuristic
 *  android.text.TextPaint
 *  android.view.DisplayCutout
 *  android.view.WindowInsets
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.github.catvod.spider.merge.xc.i;

import android.app.Person;
import android.content.pm.PackageInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class a {
    public static /* bridge */ /* synthetic */ CharSequence A(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getPaneTitle();
    }

    public static /* bridge */ /* synthetic */ void B(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setPaneTitle(charSequence);
    }

    public static /* bridge */ /* synthetic */ void C(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setHeading(bl);
    }

    public static /* bridge */ /* synthetic */ boolean D(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isScreenReaderFocusable();
    }

    public static /* bridge */ /* synthetic */ int a(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getDisabledReason();
    }

    public static /* bridge */ /* synthetic */ int b(PrecomputedText.Params params) {
        return params.getBreakStrategy();
    }

    public static /* bridge */ /* synthetic */ int c(PrecomputedText precomputedText) {
        return precomputedText.getParagraphCount();
    }

    public static /* bridge */ /* synthetic */ int d(PrecomputedText precomputedText, int n2) {
        return precomputedText.getParagraphEnd(n2);
    }

    public static /* bridge */ /* synthetic */ int e(DisplayCutout displayCutout) {
        return displayCutout.hashCode();
    }

    public static /* bridge */ /* synthetic */ Person f(Parcelable parcelable) {
        return (Person)parcelable;
    }

    public static /* bridge */ /* synthetic */ Person g(Object object) {
        return (Person)object;
    }

    public static /* bridge */ /* synthetic */ SigningInfo h(PackageInfo packageInfo) {
        return packageInfo.signingInfo;
    }

    public static /* bridge */ /* synthetic */ Bitmap i(ImageDecoder.Source source, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        return ImageDecoder.decodeBitmap((ImageDecoder.Source)source, (ImageDecoder.OnHeaderDecodedListener)onHeaderDecodedListener);
    }

    public static /* bridge */ /* synthetic */ Drawable j(ImageDecoder.Source source, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        return ImageDecoder.decodeDrawable((ImageDecoder.Source)source, (ImageDecoder.OnHeaderDecodedListener)onHeaderDecodedListener);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText k(CharSequence charSequence, PrecomputedText.Params params) {
        return PrecomputedText.create((CharSequence)charSequence, (PrecomputedText.Params)params);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText l(Object object) {
        return (PrecomputedText)object;
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic m(PrecomputedText.Params params) {
        return params.getTextDirection();
    }

    public static /* bridge */ /* synthetic */ TextPaint n(PrecomputedText.Params params) {
        return params.getTextPaint();
    }

    public static /* bridge */ /* synthetic */ DisplayCutout o(WindowInsets windowInsets) {
        return windowInsets.getDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ WindowInsets p(WindowInsets windowInsets) {
        return windowInsets.consumeDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ CharSequence q(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTooltipText();
    }

    public static /* bridge */ /* synthetic */ void r(PrecomputedText precomputedText, Object object) {
        precomputedText.removeSpan(object);
    }

    public static /* bridge */ /* synthetic */ void s(PrecomputedText precomputedText, Object object, int n2, int n3, int n4) {
        precomputedText.setSpan(object, n2, n3, n4);
    }

    public static /* bridge */ /* synthetic */ void t(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setTooltipText(charSequence);
    }

    public static /* bridge */ /* synthetic */ void u(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setScreenReaderFocusable(bl);
    }

    public static /* bridge */ /* synthetic */ boolean v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isHeading();
    }

    public static /* bridge */ /* synthetic */ boolean w(Object object) {
        return object instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ Object[] x(PrecomputedText precomputedText, int n2, int n3, Class clazz) {
        return precomputedText.getSpans(n2, n3, clazz);
    }

    public static /* bridge */ /* synthetic */ int y(PrecomputedText.Params params) {
        return params.getHyphenationFrequency();
    }

    public static /* bridge */ /* synthetic */ int z(PrecomputedText precomputedText, int n2) {
        return precomputedText.getParagraphStart(n2);
    }
}

