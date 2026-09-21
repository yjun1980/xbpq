/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B0;

import com.github.catvod.spider.merge.B0.c;
import com.github.catvod.spider.merge.y.e;

public final class a
extends c {
    private final Integer i;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a(e object, boolean bl, String string) {
        super((e)object, (boolean)var2_5);
        void var2_5;
        this.i = ((e)object).s("audioSampleRate");
        ((e)object).s("averageBitrate");
        if (!((e)object).containsKey("audioQuality")) return;
        String[] stringArray = ((e)object).x("audioQuality").split("_");
        String string2 = stringArray[stringArray.length - 1].toLowerCase();
        try {
            com.github.catvod.spider.merge.C0.a.valueOf(string2);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public final Integer i() {
        return this.i;
    }
}

