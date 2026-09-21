/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ShortcutManager
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputContentInfo
 */
package com.github.catvod.spider.merge.xc.k;

import android.content.pm.ShortcutManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;

public abstract class c {
    public static /* bridge */ /* synthetic */ int a(ShortcutManager shortcutManager) {
        return shortcutManager.getMaxShortcutCountPerActivity();
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object object) {
        return (ShortcutManager)object;
    }

    public static /* bridge */ /* synthetic */ InputContentInfo c(Object object) {
        return (InputContentInfo)object;
    }

    public static /* bridge */ /* synthetic */ void d(ShortcutManager shortcutManager, List list) {
        shortcutManager.removeDynamicShortcuts(list);
    }

    public static /* bridge */ /* synthetic */ void e(EditorInfo editorInfo, String[] stringArray) {
        editorInfo.contentMimeTypes = stringArray;
    }

    public static /* bridge */ /* synthetic */ boolean f(ShortcutManager shortcutManager, ArrayList arrayList) {
        return shortcutManager.addDynamicShortcuts((List)arrayList);
    }

    public static /* bridge */ /* synthetic */ String[] g(EditorInfo editorInfo) {
        return editorInfo.contentMimeTypes;
    }

    public static /* bridge */ /* synthetic */ int h(ShortcutManager shortcutManager) {
        return shortcutManager.getIconMaxHeight();
    }

    public static /* bridge */ /* synthetic */ void i(ShortcutManager shortcutManager, List list) {
        shortcutManager.addDynamicShortcuts(list);
    }

    public static /* bridge */ /* synthetic */ int j(ShortcutManager shortcutManager) {
        return shortcutManager.getIconMaxWidth();
    }
}

