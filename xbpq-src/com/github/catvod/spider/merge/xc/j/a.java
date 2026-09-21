/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.PersistableBundle
 *  android.telephony.SubscriptionManager
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.github.catvod.spider.merge.xc.j;

import android.os.PersistableBundle;
import android.telephony.SubscriptionManager;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class a {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTraversalAfter();
    }

    public static /* bridge */ /* synthetic */ Class b() {
        return SubscriptionManager.class;
    }

    public static /* bridge */ /* synthetic */ void c(PersistableBundle persistableBundle, boolean bl) {
        persistableBundle.putBoolean("extraLongLived", bl);
    }

    public static /* bridge */ /* synthetic */ void d(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setTraversalAfter(view);
    }

    public static /* bridge */ /* synthetic */ void e(AccessibilityNodeInfo accessibilityNodeInfo, View view, int n2) {
        accessibilityNodeInfo.setTraversalBefore(view, n2);
    }

    public static /* bridge */ /* synthetic */ boolean f(PersistableBundle persistableBundle) {
        return persistableBundle.getBoolean("extraLongLived");
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTraversalBefore();
    }

    public static /* bridge */ /* synthetic */ void h(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setTraversalBefore(view);
    }

    public static /* bridge */ /* synthetic */ void i(AccessibilityNodeInfo accessibilityNodeInfo, View view, int n2) {
        accessibilityNodeInfo.setTraversalAfter(view, n2);
    }
}

