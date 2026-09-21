/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accessibilityservice.AccessibilityServiceInfo
 *  android.bluetooth.BluetoothManager
 *  android.os.Trace
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.util.SparseLongArray
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.github.catvod.spider.merge.xc.h;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.bluetooth.BluetoothManager;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.SparseLongArray;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

public abstract class a {
    public static /* bridge */ /* synthetic */ int a(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    public static /* bridge */ /* synthetic */ int b(SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static /* bridge */ /* synthetic */ int c(SparseLongArray sparseLongArray, int n2) {
        return sparseLongArray.indexOfKey(n2);
    }

    public static /* bridge */ /* synthetic */ int d(SparseLongArray sparseLongArray, long l2) {
        return sparseLongArray.indexOfValue(l2);
    }

    public static /* bridge */ /* synthetic */ int e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTextSelectionEnd();
    }

    public static /* bridge */ /* synthetic */ long f(SparseLongArray sparseLongArray, int n2) {
        return sparseLongArray.valueAt(n2);
    }

    public static /* bridge */ /* synthetic */ long g(SparseLongArray sparseLongArray, int n2, long l2) {
        return sparseLongArray.get(n2, l2);
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic h() {
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return BluetoothManager.class;
    }

    public static /* bridge */ /* synthetic */ String j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getViewIdResourceName();
    }

    public static /* bridge */ /* synthetic */ List k(AccessibilityNodeInfo accessibilityNodeInfo, String string) {
        return accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(string);
    }

    public static /* bridge */ /* synthetic */ void l(SparseLongArray sparseLongArray, int n2) {
        sparseLongArray.removeAt(n2);
    }

    public static /* bridge */ /* synthetic */ void m(SparseLongArray sparseLongArray, int n2, long l2) {
        sparseLongArray.put(n2, l2);
    }

    public static /* bridge */ /* synthetic */ void n(AccessibilityNodeInfo accessibilityNodeInfo, int n2, int n3) {
        accessibilityNodeInfo.setTextSelection(n2, n3);
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo accessibilityNodeInfo, String string) {
        accessibilityNodeInfo.setViewIdResourceName(string);
    }

    public static /* bridge */ /* synthetic */ void p(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setEditable(bl);
    }

    public static /* bridge */ /* synthetic */ boolean q(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isEditable();
    }

    public static /* bridge */ /* synthetic */ int r(SparseLongArray sparseLongArray, int n2) {
        return sparseLongArray.keyAt(n2);
    }

    public static /* bridge */ /* synthetic */ int s(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTextSelectionStart();
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic t() {
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return Trace.class;
    }

    public static /* bridge */ /* synthetic */ boolean v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.refresh();
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic w() {
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic x() {
        return TextDirectionHeuristics.LTR;
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic y() {
        return TextDirectionHeuristics.RTL;
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic z() {
        return TextDirectionHeuristics.LOCALE;
    }
}

