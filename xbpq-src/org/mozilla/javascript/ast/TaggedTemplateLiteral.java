/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class TaggedTemplateLiteral
extends AstNode {
    private AstNode target;
    private AstNode templateLiteral;

    public TaggedTemplateLiteral() {
        this.type = 173;
    }

    public TaggedTemplateLiteral(int n2) {
        super(n2);
        this.type = 173;
    }

    public TaggedTemplateLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 173;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public AstNode getTemplateLiteral() {
        return this.templateLiteral;
    }

    public void setTarget(AstNode astNode) {
        this.target = astNode;
        astNode.setParent(this);
    }

    public void setTemplateLiteral(AstNode astNode) {
        this.templateLiteral = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.target.toSource(0));
        stringBuilder.append(this.templateLiteral.toSource(0));
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            this.templateLiteral.visit(nodeVisitor);
        }
    }
}

