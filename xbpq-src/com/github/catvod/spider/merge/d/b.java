/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.github.catvod.spider.merge.d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.github.catvod.spider.merge.d.c;
import com.github.catvod.spider.merge.d.e;
import java.util.Objects;

public abstract class b
extends Binder
implements c {
    public static final int a = 0;

    public b() {
        this.attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n2, Parcel object, Parcel object2, int n3) {
        if (n2 != 1) {
            if (n2 != 1598968902) {
                return super.onTransact(n2, object, object2, n3);
            }
            object2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
        object.enforceInterface("android.support.v4.os.IResultReceiver");
        n2 = object.readInt();
        object = object.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(object) : null;
        object2 = (e)this;
        Objects.requireNonNull(object2.b);
        object2.b.a(n2, (Bundle)object);
        return true;
    }
}

