/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B0;

import com.github.catvod.spider.merge.B0.f;
import com.github.catvod.spider.merge.C0.a;
import com.github.catvod.spider.merge.y.e;

public final class g
extends f {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public g(e object, boolean bl, String string) {
        super((e)object, (boolean)var2_5, (String)var3_6);
        void var3_6;
        void var2_5;
        ((e)object).s("audioSampleRate");
        ((e)object).s("averageBitrate");
        if (!((e)object).containsKey("audioQuality")) return;
        String[] stringArray = ((e)object).x("audioQuality").split("_");
        String string2 = stringArray[stringArray.length - 1].toLowerCase();
        try {
            a.valueOf(string2);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }
}

