/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.U;

import java.util.ArrayList;
import java.util.List;

public final class q
implements Runnable {
    public final int a;
    public final List b;
    public final String c;
    public final Runnable[] d;

    public /* synthetic */ q(ArrayList arrayList, String string, Runnable[] runnableArray, int n2) {
        this.a = n2;
        this.b = arrayList;
        this.c = string;
        this.d = runnableArray;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                ArrayList arrayList = (ArrayList)this.b;
                String string = this.c;
                if (arrayList.contains(string)) {
                    arrayList.remove(string);
                } else {
                    arrayList.add(string);
                }
                this.d[0].run();
                return;
            }
            case 0: 
        }
        ArrayList arrayList = (ArrayList)this.b;
        String string = this.c;
        if (arrayList.contains(string)) {
            arrayList.remove(string);
        } else {
            arrayList.add(string);
        }
        this.d[0].run();
    }
}

