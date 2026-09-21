/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Bundle
 *  androidx.core.location.LocationListenerCompat
 */
package com.github.catvod.spider.merge.xc.q;

import android.location.Location;
import android.os.Bundle;
import androidx.core.location.LocationListenerCompat;
import java.util.List;

public abstract class a {
    public static void a(LocationListenerCompat locationListenerCompat, int n2) {
    }

    public static void b(LocationListenerCompat locationListenerCompat, List list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            locationListenerCompat.onLocationChanged((Location)list.get(i2));
        }
    }

    public static void c(LocationListenerCompat locationListenerCompat, String string) {
    }

    public static void d(LocationListenerCompat locationListenerCompat, String string) {
    }

    public static void e(LocationListenerCompat locationListenerCompat, String string, int n2, Bundle bundle) {
    }
}

