/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.github.catvod.spider.merge.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.catvod.spider.merge.d.f;

final class d
implements Parcelable.Creator<f> {
    d() {
    }

    public final Object createFromParcel(Parcel parcel) {
        return new f(parcel);
    }

    public final Object[] newArray(int n2) {
        return new f[n2];
    }
}

