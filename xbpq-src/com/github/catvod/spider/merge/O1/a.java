/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O1;

import com.github.catvod.spider.merge.M1.b;
import java.io.Serializable;

public abstract class a
implements b,
Serializable {
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("(");
        stringBuilder.append("NOP");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

