/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.parser.c;
import com.github.catvod.spider.Init2;
import com.github.catvod.spider.w;

public final class aA
implements Runnable {
    public static final aA l8 = new aA();

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ aA() {
        int n2 = w.d();
        int n3 = 1616;
        block6: while (true) {
            switch (n3 ^= 0x661) {
                default: {
                    continue block6;
                }
                case 49: {
                    if (n2 <= 0) {
                        n3 = 1709;
                        continue block6;
                    }
                }
                case 14: {
                    n3 = 1678;
                    continue block6;
                }
                case 204: {
                    Float f2 = Float.valueOf(c.d("YE8I1Aln7DjYeng10nT"));
                    System.out.println(f2);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    @Override
    public final void run() {
        Init2.S();
    }
}

