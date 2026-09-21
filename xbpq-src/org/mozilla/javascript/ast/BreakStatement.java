/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;

public class BreakStatement
extends Jump {
    private Name breakLabel;
    private AstNode target;

    public BreakStatement() {
        this.type = 124;
    }

    public BreakStatement(int n2) {
        this.type = 124;
        this.position = n2;
    }

    public BreakStatement(int n2, int n3) {
        this.type = 124;
        this.position = n2;
        this.length = n3;
    }

    public Name getBreakLabel() {
        return this.breakLabel;
    }

    public AstNode getBreakTarget() {
        return this.target;
    }

    public void setBreakLabel(Name name) {
        this.breakLabel = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public void setBreakTarget(Jump jump) {
        this.assertNotNull(jump);
        this.target = jump;
        this.setJumpStatement(jump);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("break");
        if (this.breakLabel != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.breakLabel.toSource(0));
        }
        stringBuilder.append(";\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        Name name;
        if (nodeVisitor.visit(this) && (name = this.breakLabel) != null) {
            name.visit(nodeVisitor);
        }
    }
}

