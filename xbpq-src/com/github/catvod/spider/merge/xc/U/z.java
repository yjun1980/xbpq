/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 */
package com.github.catvod.spider.merge.xc.U;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.f;
import com.github.catvod.spider.merge.xc.a.a;
import java.io.Serializable;

public final class z
implements Runnable {
    public final int a;
    public final String b;
    public final int c;
    public final Runnable d;
    public final Serializable e;

    public /* synthetic */ z(String string, String string2, int n2, Runnable runnable) {
        this.a = 1;
        this.b = string;
        this.e = string2;
        this.c = n2;
        this.d = runnable;
    }

    public /* synthetic */ z(byte[] byArray, f f2) {
        this.a = 0;
        this.e = byArray;
        this.b = "\u767e\u5ea6\u7f51\u76d8";
        this.c = -13603596;
        this.d = f2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                String string = this.b;
                String string2 = (String)((Object)this.e);
                int n2 = this.c;
                Runnable runnable = this.d;
                try {
                    com.github.catvod.spider.merge.xc.a.a.y(string2, n2, C.w(C.j(240), string), runnable);
                }
                catch (Exception exception) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    A.m("\u626b\u7801\u767b\u5f55\u5931\u8d25");
                }
                return;
            }
            case 0: 
        }
        Object object = (byte[])this.e;
        String string = this.b;
        int n3 = this.c;
        Runnable runnable = this.d;
        object = ((byte[])object).length != 0 ? (Object)BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)((byte[])object).length) : null;
        try {
            com.github.catvod.spider.merge.xc.a.a.y(string, n3, (Bitmap)object, runnable);
        }
        catch (Exception exception) {
            if (runnable != null) {
                runnable.run();
            }
            A.m("\u626b\u7801\u767b\u5f55\u5931\u8d25");
        }
    }
}

