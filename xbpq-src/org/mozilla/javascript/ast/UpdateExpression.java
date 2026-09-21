/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.I.r;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class UpdateExpression
extends AstNode {
    private boolean isPostfix;
    private AstNode operand;

    public UpdateExpression() {
    }

    public UpdateExpression(int n2) {
        super(n2);
    }

    public UpdateExpression(int n2, int n3) {
        super(n2, n3);
    }

    public UpdateExpression(int n2, int n3, AstNode astNode) {
        this(n2, n3, astNode, false);
    }

    public UpdateExpression(int n2, int n3, AstNode astNode, boolean bl) {
        this.assertNotNull(astNode);
        int n4 = bl ? astNode.getPosition() : n3;
        n3 = bl ? (n3 += 2) : astNode.getPosition() + astNode.getLength();
        this.setBounds(n4, n3);
        this.setOperator(n2);
        this.setOperand(astNode);
        this.isPostfix = bl;
    }

    public AstNode getOperand() {
        return this.operand;
    }

    public int getOperator() {
        return this.type;
    }

    public boolean isPostfix() {
        return this.isPostfix;
    }

    public boolean isPrefix() {
        return this.isPostfix ^ true;
    }

    public void setIsPostfix(boolean bl) {
        this.isPostfix = bl;
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
        if (!this.isPostfix) {
            stringBuilder.append(AstNode.operatorToString(n2));
        }
        stringBuilder.append(this.operand.toSource());
        if (this.isPostfix) {
            stringBuilder.append(AstNode.operatorToString(n2));
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.operand.visit(nodeVisitor);
        }
    }
}

