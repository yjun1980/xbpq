/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.StateListAnimator
 *  android.app.Application
 *  android.app.Notification
 *  android.app.job.JobScheduler
 *  android.app.usage.UsageStatsManager
 *  android.content.RestrictionsManager
 *  android.content.pm.LauncherApps
 *  android.graphics.Outline
 *  android.graphics.Rect
 *  android.hardware.camera2.CameraManager
 *  android.media.AudioAttributes
 *  android.media.projection.MediaProjectionManager
 *  android.media.session.MediaSessionManager
 *  android.media.tv.TvInputManager
 *  android.os.Build
 *  android.os.PersistableBundle
 *  android.telecom.TelecomManager
 *  android.widget.RemoteViews
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.KT;

import android.animation.StateListAnimator;
import android.app.Application;
import android.app.Notification;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.graphics.Outline;
import android.graphics.Rect;
import android.hardware.camera2.CameraManager;
import android.media.AudioAttributes;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.os.Build;
import android.os.PersistableBundle;
import android.telecom.TelecomManager;
import android.widget.RemoteViews;
import android.widget.TextView;
import java.io.File;

public abstract class g {
    public static /* bridge */ /* synthetic */ Class A() {
        return TvInputManager.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return UsageStatsManager.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return CameraManager.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return JobScheduler.class;
    }

    public static /* bridge */ /* synthetic */ float a(TextView textView) {
        return textView.getElevation();
    }

    public static /* bridge */ /* synthetic */ int b(Notification notification) {
        return notification.color;
    }

    public static /* bridge */ /* synthetic */ int c(PersistableBundle persistableBundle) {
        return persistableBundle.getInt("extraPersonCount");
    }

    public static /* bridge */ /* synthetic */ StateListAnimator d(TextView textView) {
        return textView.getStateListAnimator();
    }

    public static /* bridge */ /* synthetic */ Notification e(Notification notification) {
        return notification.publicVersion;
    }

    public static /* bridge */ /* synthetic */ AudioAttributes f() {
        return Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public static /* bridge */ /* synthetic */ AudioAttributes g(Notification notification) {
        return notification.audioAttributes;
    }

    public static /* bridge */ /* synthetic */ PersistableBundle h(PersistableBundle persistableBundle, String string) {
        return persistableBundle.getPersistableBundle(string);
    }

    public static /* bridge */ /* synthetic */ RemoteViews i(Notification notification) {
        return notification.headsUpContentView;
    }

    public static /* bridge */ /* synthetic */ File j(Application application) {
        return application.getCodeCacheDir();
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return LauncherApps.class;
    }

    public static /* bridge */ /* synthetic */ String l(Notification notification) {
        return notification.category;
    }

    public static /* bridge */ /* synthetic */ String m(PersistableBundle persistableBundle) {
        return persistableBundle.getString("extraLocusId");
    }

    public static /* bridge */ /* synthetic */ void n(Notification notification, AudioAttributes audioAttributes) {
        notification.audioAttributes = audioAttributes;
    }

    public static /* bridge */ /* synthetic */ void o(Notification notification, RemoteViews remoteViews) {
        notification.headsUpContentView = remoteViews;
    }

    public static /* bridge */ /* synthetic */ void p(Outline outline, Rect rect, float f2) {
        outline.setRoundRect(rect, f2);
    }

    public static /* bridge */ /* synthetic */ void q(TextView textView, float f2) {
        textView.setElevation(f2);
    }

    public static /* bridge */ /* synthetic */ void r(TextView textView, StateListAnimator stateListAnimator) {
        textView.setStateListAnimator(stateListAnimator);
    }

    public static /* bridge */ /* synthetic */ boolean s(PersistableBundle persistableBundle) {
        return persistableBundle.containsKey("extraPersonCount");
    }

    public static /* bridge */ /* synthetic */ String[] t() {
        return Build.SUPPORTED_ABIS;
    }

    public static /* bridge */ /* synthetic */ int u(Notification notification) {
        return notification.visibility;
    }

    public static /* bridge */ /* synthetic */ Class v() {
        return MediaProjectionManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean w(PersistableBundle persistableBundle) {
        return persistableBundle.containsKey("extraLongLived");
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return MediaSessionManager.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return RestrictionsManager.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return TelecomManager.class;
    }
}

