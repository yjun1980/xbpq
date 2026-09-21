/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Builder
 *  android.app.Notification$CallStyle
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.location.LocationRequest
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.OutcomeReceiver
 *  android.view.ContentInfo
 *  android.view.ContentInfo$Builder
 *  android.view.textclassifier.TextLinks
 */
package com.github.catvod.spider.merge.xc.i;

import android.app.Notification;
import android.content.ClipData;
import android.location.LocationRequest;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.view.ContentInfo;
import android.view.textclassifier.TextLinks;

public abstract class b {
    public static /* bridge */ /* synthetic */ int a(ContentInfo contentInfo) {
        return contentInfo.getFlags();
    }

    public static /* bridge */ /* synthetic */ ClipData b(ContentInfo contentInfo) {
        return contentInfo.getClip();
    }

    public static /* bridge */ /* synthetic */ LocationRequest c(Object object) {
        return (LocationRequest)object;
    }

    public static /* bridge */ /* synthetic */ Uri d(ContentInfo contentInfo) {
        return contentInfo.getLinkUri();
    }

    public static /* bridge */ /* synthetic */ Bundle e(ContentInfo contentInfo) {
        return contentInfo.getExtras();
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver f(Object object) {
        return (OutcomeReceiver)object;
    }

    public static /* bridge */ /* synthetic */ ContentInfo g(ContentInfo.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ ContentInfo h(Object object) {
        return (ContentInfo)object;
    }

    public static /* bridge */ /* synthetic */ TextLinks i(ClipData.Item item) {
        return item.getTextLinks();
    }

    public static /* bridge */ /* synthetic */ void j(Notification.CallStyle callStyle, Notification.Builder builder) {
        callStyle.setBuilder(builder);
    }

    public static /* bridge */ /* synthetic */ void k(ContentInfo.Builder builder, int n2) {
        builder.setSource(n2);
    }

    public static /* bridge */ /* synthetic */ void l(ContentInfo.Builder builder, ClipData clipData) {
        builder.setClip(clipData);
    }

    public static /* bridge */ /* synthetic */ void m(ContentInfo.Builder builder, Uri uri) {
        builder.setLinkUri(uri);
    }

    public static /* bridge */ /* synthetic */ void n(ContentInfo.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static /* bridge */ /* synthetic */ int o(ContentInfo contentInfo) {
        return contentInfo.getSource();
    }

    public static /* bridge */ /* synthetic */ void p(ContentInfo.Builder builder, int n2) {
        builder.setFlags(n2);
    }
}

