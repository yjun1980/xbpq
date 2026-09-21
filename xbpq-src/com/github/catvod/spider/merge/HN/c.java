/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.github.catvod.spider.merge.HN;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class c {
    public static /* bridge */ /* synthetic */ void a(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setLabeledBy(view);
    }

    public static /* bridge */ /* synthetic */ void b(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setLabelFor(view);
    }
}

