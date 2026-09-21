/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;

public class PropertyGet
extends InfixExpression {
    public PropertyGet() {
        this.type = 33;
    }

    public PropertyGet(int n2) {
        super(n2);
        this.type = 33;
    }

    public PropertyGet(int n2, int n3) {
        super(n2, n3);
        this.type = 33;
    }

    public PropertyGet(int n2, int n3, AstNode astNode, Name name) {
        super(n2, n3, astNode, name);
        this.type = 33;
    }

    public PropertyGet(AstNode astNode, Name name) {
        super(astNode, name);
        this.type = 33;
    }

    public PropertyGet(AstNode astNode, Name name, int n2) {
        super(33, astNode, (AstNode)name, n2);
        this.type = 33;
    }

    public Name getProperty() {
        return (Name)this.getRight();
    }

    public AstNode getTarget() {
        return this.getLeft();
    }

    public void setProperty(Name name) {
        this.setRight(name);
    }

    public void setTarget(AstNode astNode) {
        this.setLeft(astNode);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.getLeft().toSource(0));
        stringBuilder.append(".");
        stringBuilder.append(this.getRight().toSource(0));
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.getTarget().visit(nodeVisitor);
            this.getProperty().visit(nodeVisitor);
        }
    }
}

