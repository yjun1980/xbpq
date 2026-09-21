/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$DecoratedCustomViewStyle
 *  android.app.Notification$MessagingStyle
 *  android.graphics.Color
 *  android.location.GnssMeasurementsEvent$Callback
 *  android.location.GnssStatus
 *  android.os.LocaleList
 */
package com.github.catvod.spider.merge.xc.B0;

import android.app.Notification;
import android.graphics.Color;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.os.LocaleList;
import com.github.catvod.spider.merge.UY.n;
import com.github.catvod.spider.merge.UY.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Locale;

public abstract class d {
    public static /* bridge */ /* synthetic */ boolean A(GnssStatus gnssStatus, int n2) {
        return gnssStatus.hasAlmanacData(n2);
    }

    public static /* bridge */ /* synthetic */ float B(GnssStatus gnssStatus, int n2) {
        return gnssStatus.getElevationDegrees(n2);
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return GnssMeasurementsEvent.Callback.class;
    }

    public static /* bridge */ /* synthetic */ boolean D(GnssStatus gnssStatus, int n2) {
        return gnssStatus.usedInFix(n2);
    }

    public static /* bridge */ /* synthetic */ float a(int n2) {
        return Color.luminance((int)n2);
    }

    public static /* bridge */ /* synthetic */ float b(GnssStatus gnssStatus, int n2) {
        return gnssStatus.getCn0DbHz(n2);
    }

    public static /* bridge */ /* synthetic */ int c(GnssStatus gnssStatus) {
        return gnssStatus.hashCode();
    }

    public static /* bridge */ /* synthetic */ int d(GnssStatus gnssStatus, int n2) {
        return gnssStatus.getSvid(n2);
    }

    public static /* bridge */ /* synthetic */ int e(LocaleList localeList) {
        return localeList.size();
    }

    public static /* bridge */ /* synthetic */ int f(Calendar calendar) {
        return calendar.getWeekYear();
    }

    public static /* bridge */ /* synthetic */ Notification.MessagingStyle g(Object object) {
        return (Notification.MessagingStyle)object;
    }

    public static /* bridge */ /* synthetic */ GnssStatus h(Object object) {
        return (GnssStatus)object;
    }

    public static /* bridge */ /* synthetic */ LocaleList i(Object object) {
        return (LocaleList)object;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return Notification.MessagingStyle.class;
    }

    public static /* bridge */ /* synthetic */ String k(LocaleList localeList) {
        return localeList.toLanguageTags();
    }

    public static /* synthetic */ Comparator l() {
        return Comparator.reverseOrder();
    }

    public static /* synthetic */ Comparator m(n n2, o o2) {
        return Comparator.comparing(n2, o2);
    }

    public static /* bridge */ /* synthetic */ Locale n(LocaleList localeList, int n2) {
        return localeList.get(n2);
    }

    public static /* bridge */ /* synthetic */ Locale o(LocaleList localeList, String[] stringArray) {
        return localeList.getFirstMatch(stringArray);
    }

    public static /* bridge */ /* synthetic */ void p(ArrayList arrayList, Comparator comparator) {
        arrayList.sort(comparator);
    }

    public static /* bridge */ /* synthetic */ boolean q(GnssStatus gnssStatus, int n2) {
        return gnssStatus.hasEphemerisData(n2);
    }

    public static /* bridge */ /* synthetic */ boolean r(GnssStatus gnssStatus, Object object) {
        return gnssStatus.equals(object);
    }

    public static /* bridge */ /* synthetic */ boolean s(LocaleList localeList) {
        return localeList.isEmpty();
    }

    public static /* bridge */ /* synthetic */ boolean t(LocaleList localeList, Object object) {
        return localeList.equals(object);
    }

    public static /* bridge */ /* synthetic */ float u(GnssStatus gnssStatus, int n2) {
        return gnssStatus.getAzimuthDegrees(n2);
    }

    public static /* bridge */ /* synthetic */ int v(GnssStatus gnssStatus) {
        return gnssStatus.getSatelliteCount();
    }

    public static /* bridge */ /* synthetic */ int w(GnssStatus gnssStatus, int n2) {
        return gnssStatus.getConstellationType(n2);
    }

    public static /* bridge */ /* synthetic */ int x(LocaleList localeList) {
        return localeList.hashCode();
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    public static /* bridge */ /* synthetic */ String z(LocaleList localeList) {
        return localeList.toString();
    }
}

