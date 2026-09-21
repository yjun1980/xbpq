/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.ForInLoop;
import org.mozilla.javascript.ast.NodeVisitor;

public class GeneratorExpressionLoop
extends ForInLoop {
    public GeneratorExpressionLoop() {
    }

    public GeneratorExpressionLoop(int n2) {
        super(n2);
    }

    public GeneratorExpressionLoop(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    public boolean isForEach() {
        return false;
    }

    @Override
    public void setIsForEach(boolean bl) {
        throw new UnsupportedOperationException("this node type does not support for each");
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

