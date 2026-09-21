/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Sj;
import com.github.catvod.spider.merge.wa;

public abstract class sK
extends wa
implements Sj {
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("(");
        stringBuilder.append(this.getName());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

