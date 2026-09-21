/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.L0;
import org.json.JSONObject;

public final class J0
implements Runnable {
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public /* synthetic */ J0(Object object, boolean bl, Object object2, int n2) {
        this.a = n2;
        this.c = object;
        this.b = bl;
        this.d = object2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                L0.d((L0)this.c, this.b, (String)this.d);
                return;
            }
        }
        Init.a((Init)this.c, this.b, (JSONObject)this.d);
    }
}

