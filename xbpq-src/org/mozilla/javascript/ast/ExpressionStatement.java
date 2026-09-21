/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class ExpressionStatement
extends AstNode {
    private AstNode expr;

    public ExpressionStatement() {
        this.type = 137;
    }

    public ExpressionStatement(int n2, int n3) {
        super(n2, n3);
        this.type = 137;
    }

    public ExpressionStatement(int n2, int n3, AstNode astNode) {
        super(n2, n3);
        this.type = 137;
        this.setExpression(astNode);
    }

    public ExpressionStatement(AstNode astNode) {
        this(astNode.getPosition(), astNode.getLength(), astNode);
    }

    public ExpressionStatement(AstNode astNode, boolean bl) {
        this(astNode);
        if (bl) {
            this.setHasResult();
        }
    }

    public AstNode getExpression() {
        return this.expr;
    }

    @Override
    public boolean hasSideEffects() {
        boolean bl = this.type == 138 || this.expr.hasSideEffects();
        return bl;
    }

    public void setExpression(AstNode astNode) {
        this.assertNotNull(astNode);
        this.expr = astNode;
        astNode.setParent(this);
        this.setLineno(astNode.getLineno());
    }

    public void setHasResult() {
        this.type = 138;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.expr.toSource(n2));
        stringBuilder.append(";");
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource(n2));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expr.visit(nodeVisitor);
        }
    }
}

