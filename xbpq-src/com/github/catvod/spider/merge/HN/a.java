/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.view.accessibility.AccessibilityWindowInfo
 */
package com.github.catvod.spider.merge.HN;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import java.util.List;

public abstract class a {
    public static /* bridge */ /* synthetic */ int a(AccessibilityNodeInfo.AccessibilityAction accessibilityAction) {
        return accessibilityAction.getId();
    }

    public static /* bridge */ /* synthetic */ int b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        return collectionInfo.getSelectionMode();
    }

    public static /* bridge */ /* synthetic */ int c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMaxTextLength();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction d(Object object) {
        return (AccessibilityNodeInfo.AccessibilityAction)object;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionInfo e(int n2, int n3, boolean bl, int n4) {
        return AccessibilityNodeInfo.CollectionInfo.obtain((int)n2, (int)n3, (boolean)bl, (int)n4);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo f(int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain((int)n2, (int)n3, (int)n4, (int)n5, (boolean)bl, (boolean)bl2);
    }

    public static /* bridge */ /* synthetic */ AccessibilityWindowInfo g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getWindow();
    }

    public static /* bridge */ /* synthetic */ AccessibilityWindowInfo h(Object object) {
        return (AccessibilityWindowInfo)object;
    }

    public static /* bridge */ /* synthetic */ CharSequence i(AccessibilityNodeInfo.AccessibilityAction accessibilityAction) {
        return accessibilityAction.getLabel();
    }

    public static /* bridge */ /* synthetic */ CharSequence j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getError();
    }

    public static /* bridge */ /* synthetic */ List k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getActionList();
    }

    public static /* bridge */ /* synthetic */ void l(AccessibilityNodeInfo accessibilityNodeInfo, int n2) {
        accessibilityNodeInfo.setMaxTextLength(n2);
    }

    public static /* bridge */ /* synthetic */ void m(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.AccessibilityAction accessibilityAction) {
        accessibilityNodeInfo.addAction(accessibilityAction);
    }

    public static /* bridge */ /* synthetic */ void n(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setError(charSequence);
    }

    public static /* bridge */ /* synthetic */ boolean o(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.removeChild(view);
    }

    public static /* bridge */ /* synthetic */ boolean p(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        return collectionItemInfo.isSelected();
    }

    public static /* bridge */ /* synthetic */ boolean q(AccessibilityNodeInfo accessibilityNodeInfo, View view, int n2) {
        return accessibilityNodeInfo.removeChild(view, n2);
    }

    public static /* bridge */ /* synthetic */ boolean r(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.AccessibilityAction accessibilityAction) {
        return accessibilityNodeInfo.removeAction(accessibilityAction);
    }
}

