/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.UY.A;

public final class u
implements Runnable {
    public final int a;
    public final boolean b;

    public /* synthetic */ u(int n2, boolean bl) {
        this.a = n2;
        this.b = bl;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                String string = this.b ? "UC\u6388\u6743\u6210\u529f [\u4f1a\u5458]" : "UC\u6388\u6743\u6210\u529f [\u975e\u4f1a\u5458]";
                A.m(string);
                return;
            }
            case 0: 
        }
        String string = this.b ? "\u5938\u514b\u6388\u6743\u6210\u529f [\u4f1a\u5458]" : "\u5938\u514b\u6388\u6743\u6210\u529f [\u975e\u4f1a\u5458]";
        A.m(string);
    }
}

