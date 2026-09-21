/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class ParenthesizedExpression
extends AstNode {
    private AstNode expression;

    public ParenthesizedExpression() {
        this.type = 90;
    }

    public ParenthesizedExpression(int n2) {
        super(n2);
        this.type = 90;
    }

    public ParenthesizedExpression(int n2, int n3) {
        super(n2, n3);
        this.type = 90;
    }

    public ParenthesizedExpression(int n2, int n3, AstNode astNode) {
        super(n2, n3);
        this.type = 90;
        this.setExpression(astNode);
    }

    public ParenthesizedExpression(AstNode astNode) {
        int n2 = astNode != null ? astNode.getPosition() : 0;
        int n3 = astNode != null ? astNode.getLength() : 1;
        this(n2, n3, astNode);
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
        stringBuilder.append("(");
        stringBuilder.append(this.expression.toSource(0));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }
}

