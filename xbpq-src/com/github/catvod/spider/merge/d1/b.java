/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d1;

import java.util.Stack;

final class b
extends ThreadLocal<Stack<StringBuilder>> {
    b() {
    }

    @Override
    protected final Object initialValue() {
        return new Stack();
    }
}

