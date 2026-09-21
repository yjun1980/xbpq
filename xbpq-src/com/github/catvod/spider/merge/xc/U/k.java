/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.github.catvod.spider.merge.xc.U;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class k
implements View.OnClickListener {
    public final int a;
    public final int[] b;
    public final List c;
    public final Runnable[] d;

    public /* synthetic */ k(int[] nArray, ArrayList arrayList, Runnable[] runnableArray, int n2) {
        this.a = n2;
        this.b = nArray;
        this.c = arrayList;
        this.d = runnableArray;
    }

    public final void onClick(View object) {
        switch (this.a) {
            default: {
                int[] nArray = this.b;
                int n2 = nArray[0];
                object = this.c;
                if (n2 < object.size() - 1) {
                    n2 = nArray[0];
                    String string = (String)object.remove(n2);
                    object.add(++n2, string);
                    nArray[0] = n2;
                    this.d[0].run();
                }
                return;
            }
            case 0: 
        }
        int[] nArray = this.b;
        int n3 = nArray[0];
        if (n3 > 0) {
            List list = this.c;
            object = (String)list.remove(n3);
            list.add(--n3, object);
            nArray[0] = n3;
            this.d[0].run();
        }
    }
}

