/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Loop;
import org.mozilla.javascript.ast.NodeVisitor;

public class WhileLoop
extends Loop {
    private AstNode condition;

    public WhileLoop() {
        this.type = 121;
    }

    public WhileLoop(int n2) {
        super(n2);
        this.type = 121;
    }

    public WhileLoop(int n2, int n3) {
        super(n2, n3);
        this.type = 121;
    }

    public AstNode getCondition() {
        return this.condition;
    }

    public void setCondition(AstNode astNode) {
        this.assertNotNull(astNode);
        this.condition = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("while (");
        stringBuilder.append(this.condition.toSource(0));
        stringBuilder.append(") ");
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource(n2 + 1));
            stringBuilder.append("\n");
        }
        if (this.body.getType() == 133) {
            stringBuilder.append(this.body.toSource(n2).trim());
            stringBuilder.append("\n");
        } else {
            if (this.getInlineComment() == null) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(this.body.toSource(n2 + 1));
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.condition.visit(nodeVisitor);
            this.body.visit(nodeVisitor);
        }
    }
}

