/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Region
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo
 */
package com.github.catvod.spider.merge.HN;

import android.graphics.Region;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class e {
    public static /* bridge */ /* synthetic */ int a(AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
        return touchDelegateInfo.getRegionCount();
    }

    public static /* bridge */ /* synthetic */ Region b(AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo, int n2) {
        return touchDelegateInfo.getRegionAt(n2);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo d(AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo, Region region) {
        return touchDelegateInfo.getTargetForRegion(region);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction e() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }
}

