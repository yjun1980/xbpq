/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.parser.a;
import com.github.catvod.parser.e;
import com.github.catvod.spider.Init2;

public final class ut
implements Runnable {
    public final String l8;

    /*
     * Enabled aggressive block sorting
     */
    public /* synthetic */ ut(String object) {
        this.l8 = object;
        int n2 = a.b();
        int n3 = 1616;
        block6: while (true) {
            switch (n3 ^= 0x661) {
                default: {
                    continue block6;
                }
                case 49: {
                    if (n2 >= 0) {
                        n3 = 1709;
                        continue block6;
                    }
                }
                case 14: {
                    n3 = 1678;
                    continue block6;
                }
                case 204: {
                    object = Long.decode(e.e("sNxgEeT8qVdUT"));
                    System.out.println(object);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    @Override
    public final void run() {
        Init2.T4(this.l8);
    }
}

