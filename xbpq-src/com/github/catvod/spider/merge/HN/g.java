/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsets$Builder
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
package com.github.catvod.spider.merge.HN;

import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class g {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    }

    public static /* bridge */ /* synthetic */ void b(WindowInsets.Builder builder, int n2, boolean bl) {
        builder.setVisible(n2, bl);
    }
}

