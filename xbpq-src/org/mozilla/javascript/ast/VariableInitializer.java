/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;

public class VariableInitializer
extends AstNode {
    private AstNode initializer;
    private AstNode target;

    public VariableInitializer() {
        this.type = 126;
    }

    public VariableInitializer(int n2) {
        super(n2);
        this.type = 126;
    }

    public VariableInitializer(int n2, int n3) {
        super(n2, n3);
        this.type = 126;
    }

    public AstNode getInitializer() {
        return this.initializer;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public boolean isDestructuring() {
        return this.target instanceof Name ^ true;
    }

    public void setInitializer(AstNode astNode) {
        this.initializer = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setNodeType(int n2) {
        if (n2 != 126 && n2 != 158 && n2 != 157) {
            throw new IllegalArgumentException("invalid node type");
        }
        this.setType(n2);
    }

    public void setTarget(AstNode astNode) {
        if (astNode != null) {
            this.target = astNode;
            astNode.setParent(this);
            return;
        }
        throw new IllegalArgumentException("invalid target arg");
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.target.toSource(0));
        if (this.initializer != null) {
            stringBuilder.append(" = ");
            stringBuilder.append(this.initializer.toSource(0));
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            AstNode astNode = this.initializer;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
        }
    }
}

