/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class ErrorNode
extends AstNode {
    private String message;

    public ErrorNode() {
        this.type = -1;
    }

    public ErrorNode(int n2) {
        super(n2);
        this.type = -1;
    }

    public ErrorNode(int n2, int n3) {
        super(n2, n3);
        this.type = -1;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String string) {
        this.message = string;
    }

    @Override
    public String toSource(int n2) {
        return "";
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

