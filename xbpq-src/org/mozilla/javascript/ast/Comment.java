/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token$CommentType;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class Comment
extends AstNode {
    private Token$CommentType commentType;
    private String value;

    public Comment(int n2, int n3, Token$CommentType token$CommentType, String string) {
        super(n2, n3);
        this.type = 165;
        this.commentType = token$CommentType;
        this.value = string;
    }

    public Token$CommentType getCommentType() {
        return this.commentType;
    }

    public String getValue() {
        return this.value;
    }

    public void setCommentType(Token$CommentType token$CommentType) {
        this.commentType = token$CommentType;
    }

    public void setValue(String string) {
        this.value = string;
        this.setLength(string.length());
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder(this.getLength() + 10);
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.value);
        if (Token$CommentType.BLOCK_COMMENT == this.getCommentType()) {
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

