/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 */
package com.github.catvod.spider.merge.w;

import android.animation.TypeEvaluator;

public final class a
implements TypeEvaluator {
    private static final a a = new a();

    public static a a() {
        return a;
    }

    public final Object evaluate(float f2, Object object, Object object2) {
        int n2 = (Integer)object;
        float f4 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f7 = (float)(n2 & 0xFF) / 255.0f;
        n2 = (Integer)object2;
        float f8 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f9 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f10 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f11 = (float)(n2 & 0xFF) / 255.0f;
        f5 = (float)Math.pow(f5, 2.2);
        f6 = (float)Math.pow(f6, 2.2);
        f7 = (float)Math.pow(f7, 2.2);
        f9 = (float)Math.pow(f9, 2.2);
        f10 = (float)Math.pow(f10, 2.2);
        f11 = (float)Math.pow(f11, 2.2);
        f5 = (float)Math.pow((f9 - f5) * f2 + f5, 0.45454545454545453);
        f6 = (float)Math.pow((f10 - f6) * f2 + f6, 0.45454545454545453);
        f11 = (float)Math.pow((f11 - f7) * f2 + f7, 0.45454545454545453);
        n2 = Math.round(((f8 - f4) * f2 + f4) * 255.0f);
        return Math.round(f5 * 255.0f) << 16 | n2 << 24 | Math.round(f6 * 255.0f) << 8 | Math.round(f11 * 255.0f);
    }
}

