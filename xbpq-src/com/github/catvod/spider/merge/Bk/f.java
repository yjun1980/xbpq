/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Bk;

import com.github.catvod.spider.merge.Bk.g;
import com.github.catvod.spider.merge.Bk.h;

public abstract class f {
    public static final int[] a;
    public static final int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[g.values().length];
        b = nArray;
        try {
            nArray[g.ON_CREATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.b[g.ON_STOP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.b[g.ON_START.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.b[g.ON_PAUSE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.b[g.ON_RESUME.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.b[g.ON_DESTROY.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.b[g.ON_ANY.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[h.values().length];
        a = nArray;
        nArray[2] = 1;
        try {
            f.a[3] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.a[4] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.a[0] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f.a[1] = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

