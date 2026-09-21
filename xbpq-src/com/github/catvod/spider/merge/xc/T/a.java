/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
package com.github.catvod.spider.merge.xc.T;

import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Locale;

public abstract class a {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* bridge */ /* synthetic */ String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static /* bridge */ /* synthetic */ String c(String string, Charset charset) {
        return URLDecoder.decode(string, charset);
    }

    public static /* bridge */ /* synthetic */ void d(AccessibilityNodeInfo accessibilityNodeInfo, String string) {
        accessibilityNodeInfo.setUniqueId(string);
    }

    public static /* bridge */ /* synthetic */ boolean e(Locale locale, Locale locale2) {
        return LocaleList.matchesLanguageAndScript((Locale)locale, (Locale)locale2);
    }
}

