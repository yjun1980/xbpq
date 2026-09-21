/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.github.catvod.spider.merge.ZP;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.catvod.spider.merge.ZP.a;
import com.github.catvod.spider.merge.ZP.c;

public abstract class b
extends Binder
implements c {
    static final int TRANSACTION_cancel = 2;
    static final int TRANSACTION_cancelAll = 3;
    static final int TRANSACTION_notify = 1;

    public b() {
        this.attachInterface(this, c.a);
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface(c.a);
        if (iInterface != null && iInterface instanceof c) {
            return (c)iInterface;
        }
        return new a(iBinder);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int n2, Parcel object, Parcel object2, int n3) {
        String string = c.a;
        if (n2 >= 1 && n2 <= 0xFFFFFF) {
            object.enforceInterface(string);
        }
        if (n2 != 1598968902) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return super.onTransact(n2, object, object2, n3);
                    }
                    this.cancelAll(object.readString());
                } else {
                    this.cancel(object.readString(), object.readInt(), object.readString());
                }
            } else {
                object2 = object.readString();
                n2 = object.readInt();
                string = object.readString();
                Parcelable.Creator creator = Notification.CREATOR;
                object = object.readInt() != 0 ? creator.createFromParcel(object) : null;
                this.notify((String)object2, n2, string, (Notification)object);
            }
            return true;
        }
        object2.writeString(string);
        return true;
    }
}

