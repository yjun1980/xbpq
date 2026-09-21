/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

public final class FunctionNode$Form
extends Enum<FunctionNode$Form> {
    private static final FunctionNode$Form[] $VALUES;
    public static final /* enum */ FunctionNode$Form FUNCTION;
    public static final /* enum */ FunctionNode$Form GETTER;
    public static final /* enum */ FunctionNode$Form METHOD;
    public static final /* enum */ FunctionNode$Form SETTER;

    static {
        FunctionNode$Form functionNode$Form;
        FunctionNode$Form functionNode$Form2;
        FunctionNode$Form functionNode$Form3;
        FunctionNode$Form functionNode$Form4;
        FUNCTION = functionNode$Form4 = new FunctionNode$Form();
        GETTER = functionNode$Form3 = new FunctionNode$Form();
        SETTER = functionNode$Form2 = new FunctionNode$Form();
        METHOD = functionNode$Form = new FunctionNode$Form();
        $VALUES = new FunctionNode$Form[]{functionNode$Form4, functionNode$Form3, functionNode$Form2, functionNode$Form};
    }

    public static FunctionNode$Form valueOf(String string) {
        return Enum.valueOf(FunctionNode$Form.class, string);
    }

    public static FunctionNode$Form[] values() {
        return (FunctionNode$Form[])$VALUES.clone();
    }
}

