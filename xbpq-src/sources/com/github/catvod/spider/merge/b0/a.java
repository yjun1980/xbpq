package com.github.catvod.spider.merge.b0;

import java.util.Stack;

/* loaded from: classes.dex */
final class a extends ThreadLocal<Stack<StringBuilder>> {
    @Override // java.lang.ThreadLocal
    protected final Stack<StringBuilder> initialValue() {
        return new Stack<>();
    }
}
