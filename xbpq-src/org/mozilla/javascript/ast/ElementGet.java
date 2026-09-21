/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class ElementGet
extends AstNode {
    private AstNode element;
    private int lb = -1;
    private int rb = -1;
    private AstNode target;

    public ElementGet() {
        this.type = 36;
    }

    public ElementGet(int n2) {
        super(n2);
        this.type = 36;
    }

    public ElementGet(int n2, int n3) {
        super(n2, n3);
        this.type = 36;
    }

    public ElementGet(AstNode astNode, AstNode astNode2) {
        this.type = 36;
        this.setTarget(astNode);
        this.setElement(astNode2);
    }

    public AstNode getElement() {
        return this.element;
    }

    public int getLb() {
        return this.lb;
    }

    public int getRb() {
        return this.rb;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public void setElement(AstNode astNode) {
        this.assertNotNull(astNode);
        this.element = astNode;
        astNode.setParent(this);
    }

    public void setLb(int n2) {
        this.lb = n2;
    }

    public void setParens(int n2, int n3) {
        this.lb = n2;
        this.rb = n3;
    }

    public void setRb(int n2) {
        this.rb = n2;
    }

    public void setTarget(AstNode astNode) {
        this.assertNotNull(astNode);
        this.target = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.target.toSource(0));
        stringBuilder.append("[");
        stringBuilder.append(this.element.toSource(0));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            this.element.visit(nodeVisitor);
        }
    }
}

