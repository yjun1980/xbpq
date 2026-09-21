/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.F0.m;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Stack;

public final class d<T> {
    private Stack<Object> a;
    private T b;

    d(T t2) {
        Stack<T> stack = new Stack<T>();
        this.a = stack;
        this.b = t2;
        stack.push(t2);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public final d a() {
        c c2 = new c();
        this.f("internalExperimentFlags", c2);
        this.a.push(c2);
        return this;
    }

    public final T b() {
        return this.b;
    }

    public final d<T> c() {
        if (((AbstractCollection)this.a).size() != 1) {
            this.a.pop();
            return this;
        }
        throw new m("Cannot end the root object or array");
    }

    public final d<T> d(String string) {
        e e2 = new e();
        this.f(string, e2);
        this.a.push(e2);
        return this;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public final d e() {
        this.f("utcOffsetMinutes", 0);
        return this;
    }

    public final d<T> f(String string, Object object) {
        e e2;
        try {
            e2 = (e)this.a.peek();
        }
        catch (ClassCastException classCastException) {
            throw new m("Attempted to write a keyed value to a JsonArray");
        }
        ((AbstractMap)e2).put(string, object);
        return this;
    }

    public final d<T> g(String string, boolean bl) {
        this.f(string, bl);
        return this;
    }
}

