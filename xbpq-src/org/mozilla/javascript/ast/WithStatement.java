/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class WithStatement
extends AstNode {
    private AstNode expression;
    private int lp = -1;
    private int rp = -1;
    private AstNode statement;

    public WithStatement() {
        this.type = 127;
    }

    public WithStatement(int n2) {
        super(n2);
        this.type = 127;
    }

    public WithStatement(int n2, int n3) {
        super(n2, n3);
        this.type = 127;
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public AstNode getStatement() {
        return this.statement;
    }

    public void setExpression(AstNode astNode) {
        this.assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
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

    public void setStatement(AstNode astNode) {
        this.assertNotNull(astNode);
        this.statement = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("with (");
        stringBuilder.append(this.expression.toSource(0));
        stringBuilder.append(") ");
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource(n2 + 1));
        }
        if (this.statement.getType() == 133) {
            if (this.getInlineComment() != null) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(this.statement.toSource(n2).trim());
            stringBuilder.append("\n");
        } else {
            stringBuilder.append("\n");
            stringBuilder.append(this.statement.toSource(n2 + 1));
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
            this.statement.visit(nodeVisitor);
        }
    }
}

