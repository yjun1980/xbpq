/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class ConditionalExpression
extends AstNode {
    private int colonPosition = -1;
    private AstNode falseExpression;
    private int questionMarkPosition = -1;
    private AstNode testExpression;
    private AstNode trueExpression;

    public ConditionalExpression() {
        this.type = 106;
    }

    public ConditionalExpression(int n2) {
        super(n2);
        this.type = 106;
    }

    public ConditionalExpression(int n2, int n3) {
        super(n2, n3);
        this.type = 106;
    }

    public int getColonPosition() {
        return this.colonPosition;
    }

    public AstNode getFalseExpression() {
        return this.falseExpression;
    }

    public int getQuestionMarkPosition() {
        return this.questionMarkPosition;
    }

    public AstNode getTestExpression() {
        return this.testExpression;
    }

    public AstNode getTrueExpression() {
        return this.trueExpression;
    }

    @Override
    public boolean hasSideEffects() {
        if (this.testExpression == null || this.trueExpression == null || this.falseExpression == null) {
            AstNode.codeBug();
        }
        boolean bl = this.trueExpression.hasSideEffects() && this.falseExpression.hasSideEffects();
        return bl;
    }

    public void setColonPosition(int n2) {
        this.colonPosition = n2;
    }

    public void setFalseExpression(AstNode astNode) {
        this.assertNotNull(astNode);
        this.falseExpression = astNode;
        astNode.setParent(this);
    }

    public void setQuestionMarkPosition(int n2) {
        this.questionMarkPosition = n2;
    }

    public void setTestExpression(AstNode astNode) {
        this.assertNotNull(astNode);
        this.testExpression = astNode;
        astNode.setParent(this);
    }

    public void setTrueExpression(AstNode astNode) {
        this.assertNotNull(astNode);
        this.trueExpression = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.testExpression.toSource(n2));
        stringBuilder.append(" ? ");
        stringBuilder.append(this.trueExpression.toSource(0));
        stringBuilder.append(" : ");
        stringBuilder.append(this.falseExpression.toSource(0));
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.testExpression.visit(nodeVisitor);
            this.trueExpression.visit(nodeVisitor);
            this.falseExpression.visit(nodeVisitor);
        }
    }
}

