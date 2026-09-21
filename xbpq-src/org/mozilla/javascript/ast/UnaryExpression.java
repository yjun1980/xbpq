/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.I.r;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class UnaryExpression
extends AstNode {
    private AstNode operand;

    public UnaryExpression() {
    }

    public UnaryExpression(int n2) {
        super(n2);
    }

    public UnaryExpression(int n2, int n3) {
        super(n2, n3);
    }

    public UnaryExpression(int n2, int n3, AstNode astNode) {
        this.assertNotNull(astNode);
        n3 = astNode.getPosition();
        int n4 = astNode.getPosition();
        this.setBounds(n3, astNode.getLength() + n4);
        this.setOperator(n2);
        this.setOperand(astNode);
    }

    public AstNode getOperand() {
        return this.operand;
    }

    public int getOperator() {
        return this.type;
    }

    public void setOperand(AstNode astNode) {
        this.assertNotNull(astNode);
        this.operand = astNode;
        astNode.setParent(this);
    }

    public void setOperator(int n2) {
        if (Token.isValidToken(n2)) {
            this.setType(n2);
            return;
        }
        throw new IllegalArgumentException(r.a("Invalid token: ", n2));
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        n2 = this.getType();
        stringBuilder.append(AstNode.operatorToString(n2));
        if (n2 == 32 || n2 == 31 || n2 == 130) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(this.operand.toSource());
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.operand.visit(nodeVisitor);
        }
    }
}

