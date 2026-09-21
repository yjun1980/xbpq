/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Stack;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

class NativeJSON$StringifyState {
    Context cx;
    String gap;
    String indent;
    Object[] propertyList;
    Callable replacer;
    Scriptable scope;
    Stack<Object> stack = new Stack();

    NativeJSON$StringifyState(Context context, Scriptable scriptable, String string, String string2, Callable callable, Object[] objectArray) {
        this.cx = context;
        this.scope = scriptable;
        this.indent = string;
        this.gap = string2;
        this.replacer = callable;
        this.propertyList = objectArray;
    }
}

