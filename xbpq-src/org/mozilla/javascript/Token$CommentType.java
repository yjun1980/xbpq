/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

public final class Token$CommentType
extends Enum<Token$CommentType> {
    private static final Token$CommentType[] $VALUES;
    public static final /* enum */ Token$CommentType BLOCK_COMMENT;
    public static final /* enum */ Token$CommentType HTML;
    public static final /* enum */ Token$CommentType JSDOC;
    public static final /* enum */ Token$CommentType LINE;

    static {
        Token$CommentType token$CommentType;
        Token$CommentType token$CommentType2;
        Token$CommentType token$CommentType3;
        Token$CommentType token$CommentType4;
        LINE = token$CommentType4 = new Token$CommentType();
        BLOCK_COMMENT = token$CommentType3 = new Token$CommentType();
        JSDOC = token$CommentType2 = new Token$CommentType();
        HTML = token$CommentType = new Token$CommentType();
        $VALUES = new Token$CommentType[]{token$CommentType4, token$CommentType3, token$CommentType2, token$CommentType};
    }

    public static Token$CommentType valueOf(String string) {
        return Enum.valueOf(Token$CommentType.class, string);
    }

    public static Token$CommentType[] values() {
        return (Token$CommentType[])$VALUES.clone();
    }
}

