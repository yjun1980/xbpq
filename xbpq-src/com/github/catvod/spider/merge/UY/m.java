/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.AppOpsManager
 *  android.app.Notification
 *  android.app.Notification$Action
 *  android.app.PendingIntent
 *  android.graphics.Path
 *  android.graphics.Path$Op
 *  android.hardware.ConsumerIrManager
 *  android.os.Bundle
 *  android.print.PrintManager
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.view.accessibility.CaptioningManager
 */
package com.github.catvod.spider.merge.UY;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Path;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.print.PrintManager;
import android.transition.Transition;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.CaptioningManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class m {
    public static /* bridge */ /* synthetic */ Path.Op A() {
        return Path.Op.DIFFERENCE;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return ConsumerIrManager.class;
    }

    public static /* bridge */ /* synthetic */ Path.Op C() {
        return Path.Op.XOR;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return PrintManager.class;
    }

    public static /* bridge */ /* synthetic */ int a(Notification.Action action) {
        return action.icon;
    }

    public static /* bridge */ /* synthetic */ AppOpsManager b(Object object) {
        return (AppOpsManager)object;
    }

    public static /* bridge */ /* synthetic */ PendingIntent c(Notification.Action action) {
        return action.actionIntent;
    }

    public static /* bridge */ /* synthetic */ Path.Op d() {
        return Path.Op.UNION;
    }

    public static /* bridge */ /* synthetic */ Bundle e(Notification notification) {
        return notification.extras;
    }

    public static /* bridge */ /* synthetic */ Transition f(Object object) {
        return (Transition)object;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionInfo g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getCollectionInfo();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionInfo h(Object object) {
        return (AccessibilityNodeInfo.CollectionInfo)object;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getCollectionItemInfo();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo j(Object object) {
        return (AccessibilityNodeInfo.CollectionItemInfo)object;
    }

    public static /* bridge */ /* synthetic */ CharSequence k(Notification.Action action) {
        return action.title;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return AppOpsManager.class;
    }

    public static /* bridge */ /* synthetic */ Charset m() {
        return StandardCharsets.UTF_8;
    }

    public static /* bridge */ /* synthetic */ void n(Path path, Path path2, Path.Op op) {
        path.op(path2, op);
    }

    public static /* bridge */ /* synthetic */ void o(Path path, Path path2, Path path3, Path.Op op) {
        path.op(path2, path3, op);
    }

    public static /* bridge */ /* synthetic */ void p(Transition transition, Transition.TransitionListener transitionListener) {
        transition.addListener(transitionListener);
    }

    public static /* bridge */ /* synthetic */ void q(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public static /* bridge */ /* synthetic */ void r(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setContentInvalid(bl);
    }

    public static /* bridge */ /* synthetic */ boolean s(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public static /* bridge */ /* synthetic */ boolean t(View view) {
        return view.isLaidOut();
    }

    public static /* bridge */ /* synthetic */ boolean u(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isContentInvalid();
    }

    public static /* bridge */ /* synthetic */ Notification.Action[] v(Notification notification) {
        return notification.actions;
    }

    public static /* bridge */ /* synthetic */ Path.Op w() {
        return Path.Op.INTERSECT;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return CaptioningManager.class;
    }

    public static /* bridge */ /* synthetic */ Charset y() {
        return StandardCharsets.US_ASCII;
    }

    public static /* bridge */ /* synthetic */ boolean z(View view) {
        return view.isAttachedToWindow();
    }
}

