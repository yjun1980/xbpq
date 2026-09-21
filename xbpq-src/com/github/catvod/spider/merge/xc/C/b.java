/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.util.SparseIntArray
 */
package com.github.catvod.spider.merge.xc.C;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.C.a;

public final class b
extends a {
    public final SparseIntArray d = new SparseIntArray();
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i = -1;
    public int j;
    public int k = -1;

    public b(Parcel parcel, int n2, int n3, String string, com.github.catvod.spider.merge.xc.f.b b2, com.github.catvod.spider.merge.xc.f.b b3, com.github.catvod.spider.merge.xc.f.b b4) {
        super(b2, b3, b4);
        this.e = parcel;
        this.f = n2;
        this.g = n3;
        this.j = n2;
        this.h = string;
    }

    @Override
    public final b a() {
        int n2;
        Parcel parcel = this.e;
        int n3 = parcel.dataPosition();
        int n4 = n2 = this.j;
        if (n2 == this.f) {
            n4 = this.g;
        }
        String string = m.h(new StringBuilder(), this.h, "  ");
        com.github.catvod.spider.merge.xc.f.b b2 = this.c;
        return new b(parcel, n3, n4, string, this.a, this.b, b2);
    }

    @Override
    public final boolean e(int n2) {
        boolean bl;
        while (true) {
            int n3 = this.j;
            int n4 = this.g;
            bl = false;
            if (n3 >= n4) break;
            n4 = this.k;
            if (n4 == n2) {
                return true;
            }
            if (String.valueOf(n4).compareTo(String.valueOf(n2)) > 0) {
                return false;
            }
            n4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(n4);
            n4 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += n4;
        }
        if (this.k == n2) {
            bl = true;
        }
        return bl;
    }

    @Override
    public final void h(int n2) {
        int n3 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (n3 >= 0) {
            int n4 = sparseIntArray.get(n3);
            n3 = parcel.dataPosition();
            parcel.setDataPosition(n4);
            parcel.writeInt(n3 - n4);
            parcel.setDataPosition(n3);
        }
        this.i = n2;
        sparseIntArray.put(n2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(n2);
    }
}

