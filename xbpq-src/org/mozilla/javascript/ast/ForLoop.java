/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Loop;
import org.mozilla.javascript.ast.NodeVisitor;

public class ForLoop
extends Loop {
    private AstNode condition;
    private AstNode increment;
    private AstNode initializer;

    public ForLoop() {
        this.type = 123;
    }

    public ForLoop(int n2) {
        super(n2);
        this.type = 123;
    }

    public ForLoop(int n2, int n3) {
        super(n2, n3);
        this.type = 123;
    }

    public AstNode getCondition() {
        return this.condition;
    }

    public AstNode getIncrement() {
        return this.increment;
    }

    public AstNode getInitializer() {
        return this.initializer;
    }

    public void setCondition(AstNode astNode) {
        this.assertNotNull(astNode);
        this.condition = astNode;
        astNode.setParent(this);
    }

    public void setIncrement(AstNode astNode) {
        this.assertNotNull(astNode);
        this.increment = astNode;
        astNode.setParent(this);
    }

    public void setInitializer(AstNode astNode) {
        this.assertNotNull(astNode);
        this.initializer = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("for (");
        stringBuilder.append(this.initializer.toSource(0));
        stringBuilder.append("; ");
        stringBuilder.append(this.condition.toSource(0));
        stringBuilder.append("; ");
        stringBuilder.append(this.increment.toSource(0));
        stringBuilder.append(") ");
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource());
            stringBuilder.append("\n");
        }
        if (this.body.getType() == 133) {
            String string;
            String string2 = string = this.body.toSource(n2);
            if (this.getInlineComment() == null) {
                string2 = string.trim();
            }
            stringBuilder.append(string2);
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
            this.initializer.visit(nodeVisitor);
            this.condition.visit(nodeVisitor);
            this.increment.visit(nodeVisitor);
            this.body.visit(nodeVisitor);
        }
    }
}

