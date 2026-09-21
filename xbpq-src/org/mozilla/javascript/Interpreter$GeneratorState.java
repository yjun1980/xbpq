/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

class Interpreter$GeneratorState {
    int operation;
    RuntimeException returnedException;
    Object value;

    Interpreter$GeneratorState(int n2, Object object) {
        this.operation = n2;
        this.value = object;
    }
}

