/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.view.accessibility.AccessibilityNodeInfo$RangeInfo
 */
package com.github.catvod.spider.merge.HN;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.zip.Deflater;

public abstract class b {
    public static /* bridge */ /* synthetic */ int A(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        return collectionItemInfo.getRowIndex();
    }

    public static /* bridge */ /* synthetic */ void B(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setMultiLine(bl);
    }

    public static /* bridge */ /* synthetic */ boolean C(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isDismissable();
    }

    public static /* bridge */ /* synthetic */ int D(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        return collectionItemInfo.getRowSpan();
    }

    public static /* bridge */ /* synthetic */ float a(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        return rangeInfo.getMax();
    }

    public static /* bridge */ /* synthetic */ int b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        return collectionInfo.getColumnCount();
    }

    public static /* bridge */ /* synthetic */ int c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        return collectionItemInfo.getColumnIndex();
    }

    public static /* bridge */ /* synthetic */ int d(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        return rangeInfo.getType();
    }

    public static /* bridge */ /* synthetic */ int e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getInputType();
    }

    public static /* bridge */ /* synthetic */ int f(Deflater deflater, byte[] byArray, int n2, int n3) {
        return deflater.deflate(byArray, n2, n3, 2);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionInfo g(int n2, int n3, boolean bl) {
        return AccessibilityNodeInfo.CollectionInfo.obtain((int)n2, (int)n3, (boolean)bl);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo h(int n2, int n3, int n4, int n5, boolean bl) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain((int)n2, (int)n3, (int)n4, (int)n5, (boolean)bl);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.RangeInfo i(int n2, float f2, float f4, float f5) {
        return AccessibilityNodeInfo.RangeInfo.obtain((int)n2, (float)f2, (float)f4, (float)f5);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.RangeInfo j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getRangeInfo();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.RangeInfo k(Object object) {
        return (AccessibilityNodeInfo.RangeInfo)object;
    }

    public static /* bridge */ /* synthetic */ void l(AccessibilityNodeInfo accessibilityNodeInfo, int n2) {
        accessibilityNodeInfo.setLiveRegion(n2);
    }

    public static /* bridge */ /* synthetic */ void m(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public static /* bridge */ /* synthetic */ void n(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.RangeInfo rangeInfo) {
        accessibilityNodeInfo.setRangeInfo(rangeInfo);
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setDismissable(bl);
    }

    public static /* bridge */ /* synthetic */ boolean p(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        return collectionInfo.isHierarchical();
    }

    public static /* bridge */ /* synthetic */ boolean q(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        return collectionItemInfo.isHeading();
    }

    public static /* bridge */ /* synthetic */ boolean r(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.canOpenPopup();
    }

    public static /* bridge */ /* synthetic */ float s(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        return rangeInfo.getCurrent();
    }

    public static /* bridge */ /* synthetic */ int t(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        return collectionInfo.getRowCount();
    }

    public static /* bridge */ /* synthetic */ int u(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        return collectionItemInfo.getColumnSpan();
    }

    public static /* bridge */ /* synthetic */ int v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getLiveRegion();
    }

    public static /* bridge */ /* synthetic */ void w(AccessibilityNodeInfo accessibilityNodeInfo, int n2) {
        accessibilityNodeInfo.setInputType(n2);
    }

    public static /* bridge */ /* synthetic */ void x(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setCanOpenPopup(bl);
    }

    public static /* bridge */ /* synthetic */ boolean y(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isMultiLine();
    }

    public static /* bridge */ /* synthetic */ float z(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        return rangeInfo.getMin();
    }
}

