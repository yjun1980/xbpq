/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Loop;
import org.mozilla.javascript.ast.NodeVisitor;

public class DoLoop
extends Loop {
    private AstNode condition;
    private int whilePosition = -1;

    public DoLoop() {
        this.type = 122;
    }

    public DoLoop(int n2) {
        super(n2);
        this.type = 122;
    }

    public DoLoop(int n2, int n3) {
        super(n2, n3);
        this.type = 122;
    }

    public AstNode getCondition() {
        return this.condition;
    }

    public int getWhilePosition() {
        return this.whilePosition;
    }

    public void setCondition(AstNode astNode) {
        this.assertNotNull(astNode);
        this.condition = astNode;
        astNode.setParent(this);
    }

    public void setWhilePosition(int n2) {
        this.whilePosition = n2;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("do ");
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource(n2 + 1));
            stringBuilder.append("\n");
        }
        stringBuilder.append(this.body.toSource(n2).trim());
        stringBuilder.append(" while (");
        stringBuilder.append(this.condition.toSource(0));
        stringBuilder.append(");\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.body.visit(nodeVisitor);
            this.condition.visit(nodeVisitor);
        }
    }
}

