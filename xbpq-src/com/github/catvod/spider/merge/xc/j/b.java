/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.content.IntentSanitizer
 *  androidx.core.util.Consumer
 */
package com.github.catvod.spider.merge.xc.j;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;

public final class b
implements Consumer {
    public final int a;

    public /* synthetic */ b(int n2) {
        this.a = n2;
    }

    public final void accept(Object object) {
        int n2 = this.a;
        object = (String)object;
        switch (n2) {
            default: {
                IntentSanitizer.b((String)object);
                return;
            }
            case 0: 
        }
        IntentSanitizer.a((String)object);
    }
}

