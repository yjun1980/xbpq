/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.github.catvod.spider.merge.ZP;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import com.github.catvod.spider.merge.ZP.c;

public final class a
implements c {
    public final IBinder b;

    public a(IBinder iBinder) {
        this.b = iBinder;
    }

    public final IBinder asBinder() {
        return this.b;
    }

    @Override
    public final void cancel(String string, int n2, String string2) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken(c.a);
            parcel.writeString(string);
            parcel.writeInt(n2);
            parcel.writeString(string2);
            this.b.transact(2, parcel, null, 1);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    @Override
    public final void cancelAll(String string) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken(c.a);
            parcel.writeString(string);
            this.b.transact(3, parcel, null, 1);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    @Override
    public final void notify(String string, int n2, String string2, Notification notification) {
        Parcel parcel = Parcel.obtain();
        try {
            parcel.writeInterfaceToken(c.a);
            parcel.writeString(string);
            parcel.writeInt(n2);
            parcel.writeString(string2);
            if (notification != null) {
                parcel.writeInt(1);
                notification.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            this.b.transact(1, parcel, null, 1);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

