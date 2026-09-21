/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

final class ES6Generator$State
extends Enum<ES6Generator$State> {
    private static final ES6Generator$State[] $VALUES;
    public static final /* enum */ ES6Generator$State COMPLETED;
    public static final /* enum */ ES6Generator$State EXECUTING;
    public static final /* enum */ ES6Generator$State SUSPENDED_START;
    public static final /* enum */ ES6Generator$State SUSPENDED_YIELD;

    static {
        ES6Generator$State eS6Generator$State;
        ES6Generator$State eS6Generator$State2;
        ES6Generator$State eS6Generator$State3;
        ES6Generator$State eS6Generator$State4;
        SUSPENDED_START = eS6Generator$State4 = new ES6Generator$State();
        SUSPENDED_YIELD = eS6Generator$State3 = new ES6Generator$State();
        EXECUTING = eS6Generator$State2 = new ES6Generator$State();
        COMPLETED = eS6Generator$State = new ES6Generator$State();
        $VALUES = new ES6Generator$State[]{eS6Generator$State4, eS6Generator$State3, eS6Generator$State2, eS6Generator$State};
    }

    public static ES6Generator$State valueOf(String string) {
        return Enum.valueOf(ES6Generator$State.class, string);
    }

    public static ES6Generator$State[] values() {
        return (ES6Generator$State[])$VALUES.clone();
    }
}

