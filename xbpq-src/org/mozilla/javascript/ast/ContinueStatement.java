/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Loop;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;

public class ContinueStatement
extends Jump {
    private Name label;
    private Loop target;

    public ContinueStatement() {
        this.type = 125;
    }

    public ContinueStatement(int n2) {
        this(n2, -1);
    }

    public ContinueStatement(int n2, int n3) {
        this.type = 125;
        this.position = n2;
        this.length = n3;
    }

    public ContinueStatement(int n2, int n3, Name name) {
        this(n2, n3);
        this.setLabel(name);
    }

    public ContinueStatement(int n2, Name name) {
        this(n2);
        this.setLabel(name);
    }

    public ContinueStatement(Name name) {
        this.type = 125;
        this.setLabel(name);
    }

    public Name getLabel() {
        return this.label;
    }

    public Loop getTarget() {
        return this.target;
    }

    public void setLabel(Name name) {
        this.label = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public void setTarget(Loop loop) {
        this.assertNotNull(loop);
        this.target = loop;
        this.setJumpStatement(loop);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("continue");
        if (this.label != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.label.toSource(0));
        }
        stringBuilder.append(";\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        Name name;
        if (nodeVisitor.visit(this) && (name = this.label) != null) {
            name.visit(nodeVisitor);
        }
    }
}

