/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

public final class StackStyle
extends Enum<StackStyle> {
    private static final StackStyle[] $VALUES;
    public static final /* enum */ StackStyle MOZILLA;
    public static final /* enum */ StackStyle MOZILLA_LF;
    public static final /* enum */ StackStyle RHINO;
    public static final /* enum */ StackStyle V8;

    static {
        StackStyle stackStyle;
        StackStyle stackStyle2;
        StackStyle stackStyle3;
        StackStyle stackStyle4;
        RHINO = stackStyle4 = new StackStyle();
        MOZILLA = stackStyle3 = new StackStyle();
        MOZILLA_LF = stackStyle2 = new StackStyle();
        V8 = stackStyle = new StackStyle();
        $VALUES = new StackStyle[]{stackStyle4, stackStyle3, stackStyle2, stackStyle};
    }

    public static StackStyle valueOf(String string) {
        return Enum.valueOf(StackStyle.class, string);
    }

    public static StackStyle[] values() {
        return (StackStyle[])$VALUES.clone();
    }
}

