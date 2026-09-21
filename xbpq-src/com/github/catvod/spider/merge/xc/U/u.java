/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.U;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.UY.T;
import com.github.catvod.spider.merge.xc.U.K;
import com.github.catvod.spider.merge.xc.U.n;

public final class u
implements K {
    public final int a;

    public /* synthetic */ u(int n2) {
        this.a = n2;
    }

    @Override
    public void a(String string) {
        switch (this.a) {
            default: {
                InitOrigin.execute((Runnable)new T(string, 4));
                return;
            }
            case 3: {
                InitOrigin.execute((Runnable)new T(string, 6));
                return;
            }
            case 2: 
        }
        InitOrigin.execute((Runnable)new T(string, 5));
    }

    public void b(String string, String string2) {
        switch (this.a) {
            default: {
                InitOrigin.execute((Runnable)new n(2, string, string2));
                return;
            }
            case 5: {
                InitOrigin.execute((Runnable)new n(3, string, string2));
                return;
            }
            case 1: {
                InitOrigin.execute((Runnable)new n(4, string, string2));
                return;
            }
            case 0: 
        }
        InitOrigin.execute((Runnable)new n(1, string, string2));
    }
}

