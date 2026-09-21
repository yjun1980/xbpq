/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class IfStatement
extends AstNode {
    private AstNode condition;
    private AstNode elseKeyWordInlineComment;
    private AstNode elsePart;
    private int elsePosition = -1;
    private int lp = -1;
    private int rp = -1;
    private AstNode thenPart;

    public IfStatement() {
        this.type = 116;
    }

    public IfStatement(int n2) {
        super(n2);
        this.type = 116;
    }

    public IfStatement(int n2, int n3) {
        super(n2, n3);
        this.type = 116;
    }

    public AstNode getCondition() {
        return this.condition;
    }

    public AstNode getElseKeyWordInlineComment() {
        return this.elseKeyWordInlineComment;
    }

    public AstNode getElsePart() {
        return this.elsePart;
    }

    public int getElsePosition() {
        return this.elsePosition;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public AstNode getThenPart() {
        return this.thenPart;
    }

    public void setCondition(AstNode astNode) {
        this.assertNotNull(astNode);
        this.condition = astNode;
        astNode.setParent(this);
    }

    public void setElseKeyWordInlineComment(AstNode astNode) {
        this.elseKeyWordInlineComment = astNode;
    }

    public void setElsePart(AstNode astNode) {
        this.elsePart = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setElsePosition(int n2) {
        this.elsePosition = n2;
    }

    public void setLp(int n2) {
        this.lp = n2;
    }

    public void setParens(int n2, int n3) {
        this.lp = n2;
        this.rp = n3;
    }

    public void setRp(int n2) {
        this.rp = n2;
    }

    public void setThenPart(AstNode astNode) {
        this.assertNotNull(astNode);
        this.thenPart = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        String string = this.makeIndent(n2);
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(string);
        stringBuilder.append("if (");
        stringBuilder.append(this.condition.toSource(0));
        stringBuilder.append(") ");
        if (this.getInlineComment() != null) {
            stringBuilder.append("    ");
            stringBuilder.append(this.getInlineComment().toSource());
            stringBuilder.append("\n");
        }
        if (this.thenPart.getType() != 133) {
            if (this.getInlineComment() == null) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(this.makeIndent(n2 + 1));
        }
        stringBuilder.append(this.thenPart.toSource(n2).trim());
        if (this.elsePart != null) {
            if (this.thenPart.getType() != 133) {
                stringBuilder.append("\n");
                stringBuilder.append(string);
                string = "else ";
            } else {
                string = " else ";
            }
            stringBuilder.append(string);
            if (this.getElseKeyWordInlineComment() != null) {
                stringBuilder.append("    ");
                stringBuilder.append(this.getElseKeyWordInlineComment().toSource());
                stringBuilder.append("\n");
            }
            if (this.elsePart.getType() != 133 && this.elsePart.getType() != 116) {
                if (this.getElseKeyWordInlineComment() == null) {
                    stringBuilder.append("\n");
                }
                stringBuilder.append(this.makeIndent(n2 + 1));
            }
            stringBuilder.append(this.elsePart.toSource(n2).trim());
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.condition.visit(nodeVisitor);
            this.thenPart.visit(nodeVisitor);
            AstNode astNode = this.elsePart;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
        }
    }
}

