/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.v.c;
import com.github.catvod.spider.merge.v.d;

final class b {
    static final int[] a;
    static final int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[c.values().length];
        b = nArray;
        try {
            nArray[c.ON_CREATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.b[c.ON_STOP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.b[c.ON_START.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.b[c.ON_PAUSE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.b[c.ON_RESUME.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.b[c.ON_DESTROY.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.b[c.ON_ANY.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[d.values().length];
        a = nArray;
        nArray[2] = 1;
        try {
            com.github.catvod.spider.merge.v.b.a[3] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.a[4] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.a[0] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            com.github.catvod.spider.merge.v.b.a[1] = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

