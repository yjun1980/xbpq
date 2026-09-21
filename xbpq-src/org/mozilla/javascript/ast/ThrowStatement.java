/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class ThrowStatement
extends AstNode {
    private AstNode expression;

    public ThrowStatement() {
        this.type = 50;
    }

    public ThrowStatement(int n2) {
        super(n2);
        this.type = 50;
    }

    public ThrowStatement(int n2, int n3) {
        super(n2, n3);
        this.type = 50;
    }

    public ThrowStatement(int n2, int n3, AstNode astNode) {
        super(n2, n3);
        this.type = 50;
        this.setExpression(astNode);
    }

    public ThrowStatement(int n2, AstNode astNode) {
        super(n2, astNode.getLength());
        this.type = 50;
        this.setExpression(astNode);
    }

    public ThrowStatement(AstNode astNode) {
        this.type = 50;
        this.setExpression(astNode);
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public void setExpression(AstNode astNode) {
        this.assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("throw");
        stringBuilder.append(" ");
        stringBuilder.append(this.expression.toSource(0));
        stringBuilder.append(";\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }
}

