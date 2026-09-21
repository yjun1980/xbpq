/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.github.catvod.spider.merge.xc.U;

import android.view.View;
import com.github.catvod.spider.merge.KT.B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e
implements View.OnClickListener {
    public final int a;
    public final List b;
    public final int[] c;
    public final Map d;
    public final Runnable[] e;

    public /* synthetic */ e(ArrayList arrayList, int[] nArray, HashMap hashMap, Runnable[] runnableArray, int n2) {
        this.a = n2;
        this.b = arrayList;
        this.c = nArray;
        this.d = hashMap;
        this.e = runnableArray;
    }

    public final void onClick(View object) {
        switch (this.a) {
            default: {
                int n2 = this.c[0];
                object = (String)this.b.get(n2);
                n2 = B.j((String)object);
                this.d.put(object, n2);
                this.e[0].run();
                return;
            }
            case 1: {
                int n3 = this.c[0];
                String string = (String)this.b.get(n3);
                object = this.d;
                object.put(string, (Integer)object.get(string) + 1);
                this.e[0].run();
                return;
            }
            case 0: 
        }
        int n4 = this.c[0];
        object = (String)this.b.get(n4);
        Map map = this.d;
        map.put(object, Math.max(1, (Integer)map.get(object) - 1));
        this.e[0].run();
    }
}

