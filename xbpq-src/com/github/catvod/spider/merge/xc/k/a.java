/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.content.pm.ShortcutInfo
 *  android.content.pm.ShortcutManager
 *  android.os.PersistableBundle
 *  android.os.UserHandle
 */
package com.github.catvod.spider.merge.xc.k;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.PersistableBundle;
import android.os.UserHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class a {
    public static /* bridge */ /* synthetic */ boolean A(ShortcutInfo shortcutInfo) {
        return shortcutInfo.isDeclaredInManifest();
    }

    public static /* bridge */ /* synthetic */ boolean B(ShortcutInfo shortcutInfo) {
        return shortcutInfo.isImmutable();
    }

    public static /* bridge */ /* synthetic */ boolean C(ShortcutInfo shortcutInfo) {
        return shortcutInfo.isEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean D(ShortcutInfo shortcutInfo) {
        return shortcutInfo.hasKeyFieldsOnly();
    }

    public static /* bridge */ /* synthetic */ int a(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getRank();
    }

    public static /* bridge */ /* synthetic */ long b(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getLastChangedTimestamp();
    }

    public static /* bridge */ /* synthetic */ ComponentName c(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getActivity();
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo d(Object object) {
        return (ShortcutInfo)object;
    }

    public static /* bridge */ /* synthetic */ PersistableBundle e(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getExtras();
    }

    public static /* bridge */ /* synthetic */ UserHandle f(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getUserHandle();
    }

    public static /* bridge */ /* synthetic */ CharSequence g(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getShortLabel();
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return ShortcutManager.class;
    }

    public static /* bridge */ /* synthetic */ String i(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getId();
    }

    public static /* bridge */ /* synthetic */ List j(ShortcutManager shortcutManager) {
        return shortcutManager.getDynamicShortcuts();
    }

    public static /* bridge */ /* synthetic */ Set k(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getCategories();
    }

    public static /* bridge */ /* synthetic */ void l(ShortcutManager shortcutManager) {
        shortcutManager.removeAllDynamicShortcuts();
    }

    public static /* bridge */ /* synthetic */ void m(ShortcutManager shortcutManager, String string) {
        shortcutManager.reportShortcutUsed(string);
    }

    public static /* bridge */ /* synthetic */ void n(ShortcutManager shortcutManager, ArrayList arrayList) {
        shortcutManager.enableShortcuts((List)arrayList);
    }

    public static /* bridge */ /* synthetic */ void o(ShortcutManager shortcutManager, List list, CharSequence charSequence) {
        shortcutManager.disableShortcuts(list, charSequence);
    }

    public static /* bridge */ /* synthetic */ boolean p(ShortcutInfo shortcutInfo) {
        return shortcutInfo.isDynamic();
    }

    public static /* bridge */ /* synthetic */ boolean q(ShortcutManager shortcutManager) {
        return shortcutManager.isRateLimitingActive();
    }

    public static /* bridge */ /* synthetic */ boolean r(ShortcutManager shortcutManager, ArrayList arrayList) {
        return shortcutManager.updateShortcuts((List)arrayList);
    }

    public static /* bridge */ /* synthetic */ Intent[] s(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getIntents();
    }

    public static /* bridge */ /* synthetic */ CharSequence t(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getLongLabel();
    }

    public static /* bridge */ /* synthetic */ String u(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getPackage();
    }

    public static /* bridge */ /* synthetic */ List v(ShortcutManager shortcutManager) {
        return shortcutManager.getManifestShortcuts();
    }

    public static /* bridge */ /* synthetic */ boolean w(ShortcutInfo shortcutInfo) {
        return shortcutInfo.isPinned();
    }

    public static /* bridge */ /* synthetic */ boolean x(ShortcutManager shortcutManager, ArrayList arrayList) {
        return shortcutManager.setDynamicShortcuts((List)arrayList);
    }

    public static /* bridge */ /* synthetic */ CharSequence y(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getDisabledMessage();
    }

    public static /* bridge */ /* synthetic */ List z(ShortcutManager shortcutManager) {
        return shortcutManager.getPinnedShortcuts();
    }
}

