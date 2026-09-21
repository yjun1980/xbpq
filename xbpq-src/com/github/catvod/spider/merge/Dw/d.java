/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Dw;

import java.util.Stack;

final class d
extends ThreadLocal<Stack<StringBuilder>> {
    d() {
    }

    @Override
    protected final Object initialValue() {
        return new Stack();
    }
}

