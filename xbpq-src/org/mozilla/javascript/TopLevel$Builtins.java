/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

public final class TopLevel$Builtins
extends Enum<TopLevel$Builtins> {
    private static final TopLevel$Builtins[] $VALUES;
    public static final /* enum */ TopLevel$Builtins Array;
    public static final /* enum */ TopLevel$Builtins BigInt;
    public static final /* enum */ TopLevel$Builtins Boolean;
    public static final /* enum */ TopLevel$Builtins Error;
    public static final /* enum */ TopLevel$Builtins Function;
    public static final /* enum */ TopLevel$Builtins GeneratorFunction;
    public static final /* enum */ TopLevel$Builtins Number;
    public static final /* enum */ TopLevel$Builtins Object;
    public static final /* enum */ TopLevel$Builtins RegExp;
    public static final /* enum */ TopLevel$Builtins String;
    public static final /* enum */ TopLevel$Builtins Symbol;

    static {
        TopLevel$Builtins topLevel$Builtins;
        TopLevel$Builtins topLevel$Builtins2;
        TopLevel$Builtins topLevel$Builtins3;
        TopLevel$Builtins topLevel$Builtins4;
        TopLevel$Builtins topLevel$Builtins5;
        TopLevel$Builtins topLevel$Builtins6;
        TopLevel$Builtins topLevel$Builtins7;
        TopLevel$Builtins topLevel$Builtins8;
        TopLevel$Builtins topLevel$Builtins9;
        TopLevel$Builtins topLevel$Builtins10;
        TopLevel$Builtins topLevel$Builtins11;
        Object = topLevel$Builtins11 = new TopLevel$Builtins();
        Array = topLevel$Builtins10 = new TopLevel$Builtins();
        Function = topLevel$Builtins9 = new TopLevel$Builtins();
        String = topLevel$Builtins8 = new TopLevel$Builtins();
        Number = topLevel$Builtins7 = new TopLevel$Builtins();
        Boolean = topLevel$Builtins6 = new TopLevel$Builtins();
        RegExp = topLevel$Builtins5 = new TopLevel$Builtins();
        Error = topLevel$Builtins4 = new TopLevel$Builtins();
        Symbol = topLevel$Builtins3 = new TopLevel$Builtins();
        GeneratorFunction = topLevel$Builtins2 = new TopLevel$Builtins();
        BigInt = topLevel$Builtins = new TopLevel$Builtins();
        $VALUES = new TopLevel$Builtins[]{topLevel$Builtins11, topLevel$Builtins10, topLevel$Builtins9, topLevel$Builtins8, topLevel$Builtins7, topLevel$Builtins6, topLevel$Builtins5, topLevel$Builtins4, topLevel$Builtins3, topLevel$Builtins2, topLevel$Builtins};
    }

    public static TopLevel$Builtins valueOf(String string) {
        return Enum.valueOf(TopLevel$Builtins.class, string);
    }

    public static TopLevel$Builtins[] values() {
        return (TopLevel$Builtins[])$VALUES.clone();
    }
}

