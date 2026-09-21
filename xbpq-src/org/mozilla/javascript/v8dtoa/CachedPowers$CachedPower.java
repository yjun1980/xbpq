/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.v8dtoa;

class CachedPowers$CachedPower {
    short binaryExponent;
    short decimalExponent;
    long significand;

    CachedPowers$CachedPower(long l2, short s2, short s3) {
        this.significand = l2;
        this.binaryExponent = s2;
        this.decimalExponent = s3;
    }
}

