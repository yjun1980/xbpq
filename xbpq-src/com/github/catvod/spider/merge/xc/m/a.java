/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.drawable.Icon
 *  android.text.TextPaint
 *  android.util.Half
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
package com.github.catvod.spider.merge.xc.m;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.text.TextPaint;
import android.util.Half;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;

public abstract class a {
    public static /* bridge */ /* synthetic */ float a(long l2) {
        return Color.alpha((long)l2);
    }

    public static /* bridge */ /* synthetic */ int b(Color color) {
        return color.toArgb();
    }

    public static /* bridge */ /* synthetic */ long c(Duration duration) {
        return duration.toMillis();
    }

    public static /* bridge */ /* synthetic */ Icon d(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap((Bitmap)bitmap);
    }

    public static /* bridge */ /* synthetic */ Half e(float f2) {
        return Half.valueOf((float)f2);
    }

    public static /* bridge */ /* synthetic */ Half f(String string) {
        return Half.valueOf((String)string);
    }

    public static /* bridge */ /* synthetic */ Half g(short s2) {
        return Half.valueOf((short)s2);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction h() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    }

    public static /* bridge */ /* synthetic */ InputStream i(Path path, OpenOption[] openOptionArray) {
        return Files.newInputStream(path, openOptionArray);
    }

    public static /* bridge */ /* synthetic */ OutputStream j(Path path, OpenOption[] openOptionArray) {
        return Files.newOutputStream(path, openOptionArray);
    }

    public static /* bridge */ /* synthetic */ CharSequence k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getHintText();
    }

    public static /* bridge */ /* synthetic */ String l(TextPaint textPaint) {
        return textPaint.getFontVariationSettings();
    }

    public static /* bridge */ /* synthetic */ List m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getAvailableExtraData();
    }

    public static /* bridge */ /* synthetic */ void n(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo accessibilityNodeInfo, List list) {
        accessibilityNodeInfo.setAvailableExtraData(list);
    }

    public static /* bridge */ /* synthetic */ void p(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setShowingHintText(bl);
    }

    public static /* bridge */ /* synthetic */ boolean q(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isShowingHintText();
    }
}

