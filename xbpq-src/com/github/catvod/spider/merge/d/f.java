/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.github.catvod.spider.merge.d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.catvod.spider.merge.d.a;
import com.github.catvod.spider.merge.d.b;
import com.github.catvod.spider.merge.d.c;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.d.e;

@SuppressLint(value={"BanParcelableUsage"})
public class f
implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new d();
    c a;

    f(Parcel object) {
        IInterface iInterface;
        object = object.readStrongBinder();
        int n2 = b.a;
        object = object == null ? null : ((iInterface = object.queryLocalInterface("android.support.v4.os.IResultReceiver")) != null && iInterface instanceof c ? (c)iInterface : new a((IBinder)object));
        this.a = object;
    }

    protected void a(int n2, Bundle bundle) {
    }

    public final int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeToParcel(Parcel parcel, int n2) {
        synchronized (this) {
            if (this.a == null) {
                e e2 = new e(this);
                this.a = e2;
            }
            parcel.writeStrongBinder(this.a.asBinder());
            return;
        }
    }
}

