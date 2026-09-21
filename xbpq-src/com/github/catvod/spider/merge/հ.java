/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0241;
import com.github.catvod.spider.merge.\u0f41;

public abstract class \u0570
extends \u0241
implements \u0f41 {
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(SOY.d("52"));
        stringBuilder.append(this.getName());
        stringBuilder.append(SOY.d("53"));
        return stringBuilder.toString();
    }
}

