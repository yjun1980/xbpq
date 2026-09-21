/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.XmlRef;

public class XmlElemRef
extends XmlRef {
    private AstNode indexExpr;
    private int lb = -1;
    private int rb = -1;

    public XmlElemRef() {
        this.type = 79;
    }

    public XmlElemRef(int n2) {
        super(n2);
        this.type = 79;
    }

    public XmlElemRef(int n2, int n3) {
        super(n2, n3);
        this.type = 79;
    }

    public AstNode getExpression() {
        return this.indexExpr;
    }

    public int getLb() {
        return this.lb;
    }

    public int getRb() {
        return this.rb;
    }

    public void setBrackets(int n2, int n3) {
        this.lb = n2;
        this.rb = n3;
    }

    public void setExpression(AstNode astNode) {
        this.assertNotNull(astNode);
        this.indexExpr = astNode;
        astNode.setParent(this);
    }

    public void setLb(int n2) {
        this.lb = n2;
    }

    public void setRb(int n2) {
        this.rb = n2;
    }

    @Override
    public String toSource(int n2) {
        Name name;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        if (this.isAttributeAccess()) {
            stringBuilder.append("@");
        }
        if ((name = this.namespace) != null) {
            stringBuilder.append(name.toSource(0));
            stringBuilder.append("::");
        }
        stringBuilder.append("[");
        stringBuilder.append(this.indexExpr.toSource(0));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Name name = this.namespace;
            if (name != null) {
                name.visit(nodeVisitor);
            }
            this.indexExpr.visit(nodeVisitor);
        }
    }
}

