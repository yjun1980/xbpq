/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class ReturnStatement
extends AstNode {
    private AstNode returnValue;

    public ReturnStatement() {
        this.type = 4;
    }

    public ReturnStatement(int n2) {
        super(n2);
        this.type = 4;
    }

    public ReturnStatement(int n2, int n3) {
        super(n2, n3);
        this.type = 4;
    }

    public ReturnStatement(int n2, int n3, AstNode astNode) {
        super(n2, n3);
        this.type = 4;
        this.setReturnValue(astNode);
    }

    public AstNode getReturnValue() {
        return this.returnValue;
    }

    public void setReturnValue(AstNode astNode) {
        this.returnValue = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("return");
        if (this.returnValue != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.returnValue.toSource(0));
        }
        stringBuilder.append(";\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        AstNode astNode;
        if (nodeVisitor.visit(this) && (astNode = this.returnValue) != null) {
            astNode.visit(nodeVisitor);
        }
    }
}

