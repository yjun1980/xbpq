/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.Scope;

public class CatchClause
extends AstNode {
    private Scope body;
    private AstNode catchCondition;
    private int ifPosition = -1;
    private int lp = -1;
    private int rp = -1;
    private Name varName;

    public CatchClause() {
        this.type = 128;
    }

    public CatchClause(int n2) {
        super(n2);
        this.type = 128;
    }

    public CatchClause(int n2, int n3) {
        super(n2, n3);
        this.type = 128;
    }

    public Scope getBody() {
        return this.body;
    }

    public AstNode getCatchCondition() {
        return this.catchCondition;
    }

    public int getIfPosition() {
        return this.ifPosition;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public Name getVarName() {
        return this.varName;
    }

    public void setBody(Scope scope) {
        this.assertNotNull(scope);
        this.body = scope;
        scope.setParent(this);
    }

    public void setCatchCondition(AstNode astNode) {
        this.catchCondition = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setIfPosition(int n2) {
        this.ifPosition = n2;
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

    public void setVarName(Name name) {
        this.varName = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("catch (");
        stringBuilder.append(this.varName.toSource(0));
        if (this.catchCondition != null) {
            stringBuilder.append(" if ");
            stringBuilder.append(this.catchCondition.toSource(0));
        }
        stringBuilder.append(") ");
        stringBuilder.append(this.body.toSource(0));
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.varName.visit(nodeVisitor);
            AstNode astNode = this.catchCondition;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
            this.body.visit(nodeVisitor);
        }
    }
}

