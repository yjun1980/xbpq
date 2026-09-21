/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.Person
 *  android.content.LocusId
 *  android.content.pm.ShortcutInfo
 *  android.content.pm.ShortcutInfo$Builder
 *  android.graphics.Insets
 *  android.net.ssl.SSLSockets
 *  android.view.DisplayCutout
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo
 */
package com.github.catvod.spider.merge.Bk;

import android.app.Activity;
import android.app.Application;
import android.app.Person;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.graphics.Insets;
import android.net.ssl.SSLSockets;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import com.github.catvod.spider.merge.Bk.q;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public abstract class p {
    public static /* bridge */ /* synthetic */ void A(WindowInsets.Builder builder, Insets insets) {
        builder.setSystemGestureInsets(insets);
    }

    public static /* bridge */ /* synthetic */ int B(Insets insets) {
        return insets.bottom;
    }

    public static /* bridge */ /* synthetic */ void C(WindowInsets.Builder builder, Insets insets) {
        builder.setMandatorySystemGestureInsets(insets);
    }

    public static /* bridge */ /* synthetic */ void D(WindowInsets.Builder builder, Insets insets) {
        builder.setTappableElementInsets(insets);
    }

    public static /* bridge */ /* synthetic */ int a(Insets insets) {
        return insets.left;
    }

    public static /* bridge */ /* synthetic */ LocusId b(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getLocusId();
    }

    public static /* bridge */ /* synthetic */ Insets c(WindowInsets windowInsets) {
        return windowInsets.getTappableElementInsets();
    }

    public static /* bridge */ /* synthetic */ WindowInsets d(WindowInsets.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ WindowInsets e(WindowInsets windowInsets, int n2, int n3, int n4, int n5) {
        return windowInsets.inset(n2, n3, n4, n5);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTouchDelegateInfo();
    }

    public static /* bridge */ /* synthetic */ String h(SSLSocket sSLSocket) {
        return sSLSocket.getApplicationProtocol();
    }

    public static /* bridge */ /* synthetic */ void i(Activity activity, q q2) {
        activity.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)q2);
    }

    public static /* bridge */ /* synthetic */ void j(ShortcutInfo.Builder builder, LocusId locusId) {
        builder.setLocusId(locusId);
    }

    public static /* bridge */ /* synthetic */ void k(ShortcutInfo.Builder builder, boolean bl) {
        builder.setLongLived(bl);
    }

    public static /* bridge */ /* synthetic */ void l(ShortcutInfo.Builder builder, Person[] personArray) {
        builder.setPersons(personArray);
    }

    public static /* bridge */ /* synthetic */ void m(WindowInsets.Builder builder, Insets insets) {
        builder.setSystemWindowInsets(insets);
    }

    public static /* bridge */ /* synthetic */ void n(WindowInsets.Builder builder, DisplayCutout displayCutout) {
        builder.setDisplayCutout(displayCutout);
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
        accessibilityNodeInfo.setTouchDelegateInfo(touchDelegateInfo);
    }

    public static /* bridge */ /* synthetic */ void p(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setTextEntryKey(bl);
    }

    public static /* bridge */ /* synthetic */ void q(SSLParameters sSLParameters, String[] stringArray) {
        sSLParameters.setApplicationProtocols(stringArray);
    }

    public static /* bridge */ /* synthetic */ void r(SSLSocket sSLSocket) {
        SSLSockets.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)true);
    }

    public static /* bridge */ /* synthetic */ boolean s(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextEntryKey();
    }

    public static /* bridge */ /* synthetic */ boolean t(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket((SSLSocket)sSLSocket);
    }

    public static /* bridge */ /* synthetic */ int u(Insets insets) {
        return insets.top;
    }

    public static /* bridge */ /* synthetic */ Insets v(WindowInsets windowInsets) {
        return windowInsets.getMandatorySystemGestureInsets();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    public static /* bridge */ /* synthetic */ void x(WindowInsets.Builder builder, Insets insets) {
        builder.setStableInsets(insets);
    }

    public static /* bridge */ /* synthetic */ int y(Insets insets) {
        return insets.right;
    }

    public static /* bridge */ /* synthetic */ Insets z(WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }
}

