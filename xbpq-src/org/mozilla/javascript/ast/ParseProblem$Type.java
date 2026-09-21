/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

public final class ParseProblem$Type
extends Enum<ParseProblem$Type> {
    private static final ParseProblem$Type[] $VALUES;
    public static final /* enum */ ParseProblem$Type Error;
    public static final /* enum */ ParseProblem$Type Warning;

    static {
        ParseProblem$Type parseProblem$Type;
        ParseProblem$Type parseProblem$Type2;
        Error = parseProblem$Type2 = new ParseProblem$Type();
        Warning = parseProblem$Type = new ParseProblem$Type();
        $VALUES = new ParseProblem$Type[]{parseProblem$Type2, parseProblem$Type};
    }

    public static ParseProblem$Type valueOf(String string) {
        return Enum.valueOf(ParseProblem$Type.class, string);
    }

    public static ParseProblem$Type[] values() {
        return (ParseProblem$Type[])$VALUES.clone();
    }
}

