/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

final class TopLevel$NativeErrors
extends Enum<TopLevel$NativeErrors> {
    private static final TopLevel$NativeErrors[] $VALUES;
    public static final /* enum */ TopLevel$NativeErrors Error;
    public static final /* enum */ TopLevel$NativeErrors EvalError;
    public static final /* enum */ TopLevel$NativeErrors InternalError;
    public static final /* enum */ TopLevel$NativeErrors JavaException;
    public static final /* enum */ TopLevel$NativeErrors RangeError;
    public static final /* enum */ TopLevel$NativeErrors ReferenceError;
    public static final /* enum */ TopLevel$NativeErrors SyntaxError;
    public static final /* enum */ TopLevel$NativeErrors TypeError;
    public static final /* enum */ TopLevel$NativeErrors URIError;

    static {
        TopLevel$NativeErrors topLevel$NativeErrors;
        TopLevel$NativeErrors topLevel$NativeErrors2;
        TopLevel$NativeErrors topLevel$NativeErrors3;
        TopLevel$NativeErrors topLevel$NativeErrors4;
        TopLevel$NativeErrors topLevel$NativeErrors5;
        TopLevel$NativeErrors topLevel$NativeErrors6;
        TopLevel$NativeErrors topLevel$NativeErrors7;
        TopLevel$NativeErrors topLevel$NativeErrors8;
        TopLevel$NativeErrors topLevel$NativeErrors9;
        Error = topLevel$NativeErrors9 = new TopLevel$NativeErrors();
        EvalError = topLevel$NativeErrors8 = new TopLevel$NativeErrors();
        RangeError = topLevel$NativeErrors7 = new TopLevel$NativeErrors();
        ReferenceError = topLevel$NativeErrors6 = new TopLevel$NativeErrors();
        SyntaxError = topLevel$NativeErrors5 = new TopLevel$NativeErrors();
        TypeError = topLevel$NativeErrors4 = new TopLevel$NativeErrors();
        URIError = topLevel$NativeErrors3 = new TopLevel$NativeErrors();
        InternalError = topLevel$NativeErrors2 = new TopLevel$NativeErrors();
        JavaException = topLevel$NativeErrors = new TopLevel$NativeErrors();
        $VALUES = new TopLevel$NativeErrors[]{topLevel$NativeErrors9, topLevel$NativeErrors8, topLevel$NativeErrors7, topLevel$NativeErrors6, topLevel$NativeErrors5, topLevel$NativeErrors4, topLevel$NativeErrors3, topLevel$NativeErrors2, topLevel$NativeErrors};
    }

    public static TopLevel$NativeErrors valueOf(String string) {
        return Enum.valueOf(TopLevel$NativeErrors.class, string);
    }

    public static TopLevel$NativeErrors[] values() {
        return (TopLevel$NativeErrors[])$VALUES.clone();
    }
}

