/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.github.catvod.spider.merge.u;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.catvod.spider.merge.u.a;

public abstract class b
implements Parcelable {
    public static final b b = new a();
    private final Parcelable a;

    b() {
        this.a = null;
    }

    protected b(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == b) {
                parcelable = null;
            }
            this.a = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final Parcelable a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelable(this.a, n2);
    }
}

