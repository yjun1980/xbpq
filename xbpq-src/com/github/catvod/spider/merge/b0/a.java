/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.b0;

import java.util.Stack;

final class a
extends ThreadLocal<Stack<StringBuilder>> {
    a() {
    }

    @Override
    protected final Object initialValue() {
        return new Stack();
    }
}

