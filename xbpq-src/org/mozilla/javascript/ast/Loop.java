/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Scope;

public abstract class Loop
extends Scope {
    protected AstNode body;
    protected int lp = -1;
    protected int rp = -1;

    public Loop() {
    }

    public Loop(int n2) {
        super(n2);
    }

    public Loop(int n2, int n3) {
        super(n2, n3);
    }

    public AstNode getBody() {
        return this.body;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public void setBody(AstNode astNode) {
        this.body = astNode;
        int n2 = astNode.getPosition();
        this.setLength(astNode.getLength() + n2 - this.getPosition());
        astNode.setParent(this);
    }

    public void setLp(int n2) {
        this.lp = n2;
    }

    public void setParens(int n2, int n3) {
        this.lp = n2;
        this.rp = n3;
    }

    public void setRp(int n2) {
        this.rp = n2;
    }
}

