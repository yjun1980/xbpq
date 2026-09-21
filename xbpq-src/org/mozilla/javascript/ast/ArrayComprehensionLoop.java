/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ForInLoop;
import org.mozilla.javascript.ast.NodeVisitor;

public class ArrayComprehensionLoop
extends ForInLoop {
    public ArrayComprehensionLoop() {
    }

    public ArrayComprehensionLoop(int n2) {
        super(n2);
    }

    public ArrayComprehensionLoop(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    public AstNode getBody() {
        return null;
    }

    @Override
    public void setBody(AstNode astNode) {
        throw new UnsupportedOperationException("this node type has no body");
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(" for ");
        String string = this.isForEach() ? "each " : "";
        stringBuilder.append(string);
        stringBuilder.append("(");
        stringBuilder.append(this.iterator.toSource(0));
        string = this.isForOf() ? " of " : " in ";
        stringBuilder.append(string);
        stringBuilder.append(this.iteratedObject.toSource(0));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.iterator.visit(nodeVisitor);
            this.iteratedObject.visit(nodeVisitor);
        }
    }
}

