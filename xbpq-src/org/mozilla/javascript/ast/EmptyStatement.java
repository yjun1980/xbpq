/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class EmptyStatement
extends AstNode {
    public EmptyStatement() {
        this.type = 132;
    }

    public EmptyStatement(int n2) {
        super(n2);
        this.type = 132;
    }

    public EmptyStatement(int n2, int n3) {
        super(n2, n3);
        this.type = 132;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(";\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

