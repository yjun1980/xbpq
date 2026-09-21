/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.I.r;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.VariableDeclaration;

public class LetNode
extends Scope {
    private AstNode body;
    private int lp = -1;
    private int rp = -1;
    private VariableDeclaration variables;

    public LetNode() {
        this.type = 162;
    }

    public LetNode(int n2) {
        super(n2);
        this.type = 162;
    }

    public LetNode(int n2, int n3) {
        super(n2, n3);
        this.type = 162;
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

    public VariableDeclaration getVariables() {
        return this.variables;
    }

    public void setBody(AstNode astNode) {
        this.body = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
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

    public void setVariables(VariableDeclaration variableDeclaration) {
        this.assertNotNull(variableDeclaration);
        this.variables = variableDeclaration;
        variableDeclaration.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = r.d(this.makeIndent(n2), "let (");
        this.printList(this.variables.getVariables(), stringBuilder);
        stringBuilder.append(") ");
        AstNode astNode = this.body;
        if (astNode != null) {
            stringBuilder.append(astNode.toSource(n2));
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.variables.visit(nodeVisitor);
            AstNode astNode = this.body;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
        }
    }
}

