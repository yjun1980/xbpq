/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.I.r;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class InfixExpression
extends AstNode {
    protected AstNode left;
    protected int operatorPosition = -1;
    protected AstNode right;

    public InfixExpression() {
    }

    public InfixExpression(int n2) {
        super(n2);
    }

    public InfixExpression(int n2, int n3) {
        super(n2, n3);
    }

    public InfixExpression(int n2, int n3, AstNode astNode, AstNode astNode2) {
        super(n2, n3);
        this.setLeft(astNode);
        this.setRight(astNode2);
    }

    public InfixExpression(int n2, AstNode astNode, AstNode astNode2, int n3) {
        this.setType(n2);
        this.setOperatorPosition(n3 - astNode.getPosition());
        this.setLeftAndRight(astNode, astNode2);
    }

    public InfixExpression(AstNode astNode, AstNode astNode2) {
        this.setLeftAndRight(astNode, astNode2);
    }

    public AstNode getLeft() {
        return this.left;
    }

    public int getOperator() {
        return this.getType();
    }

    public int getOperatorPosition() {
        return this.operatorPosition;
    }

    public AstNode getRight() {
        return this.right;
    }

    @Override
    public boolean hasSideEffects() {
        boolean bl;
        block5: {
            block7: {
                AstNode astNode;
                boolean bl2;
                block6: {
                    int n2 = this.getType();
                    bl = true;
                    bl2 = true;
                    if (n2 == 92) break block5;
                    if (n2 != 108 && n2 != 109) {
                        return super.hasSideEffects();
                    }
                    astNode = this.left;
                    if (astNode == null) break block6;
                    bl = bl2;
                    if (astNode.hasSideEffects()) break block7;
                }
                bl = (astNode = this.right) != null && astNode.hasSideEffects() ? bl2 : false;
            }
            return bl;
        }
        AstNode astNode = this.right;
        if (astNode == null || !astNode.hasSideEffects()) {
            bl = false;
        }
        return bl;
    }

    public void setLeft(AstNode astNode) {
        this.assertNotNull(astNode);
        this.left = astNode;
        this.setLineno(astNode.getLineno());
        astNode.setParent(this);
    }

    public void setLeftAndRight(AstNode astNode, AstNode astNode2) {
        this.assertNotNull(astNode);
        this.assertNotNull(astNode2);
        int n2 = astNode.getPosition();
        int n3 = astNode2.getPosition();
        this.setBounds(n2, astNode2.getLength() + n3);
        this.setLeft(astNode);
        this.setRight(astNode2);
    }

    public void setOperator(int n2) {
        if (Token.isValidToken(n2)) {
            this.setType(n2);
            return;
        }
        throw new IllegalArgumentException(r.a("Invalid token: ", n2));
    }

    public void setOperatorPosition(int n2) {
        this.operatorPosition = n2;
    }

    public void setRight(AstNode astNode) {
        this.assertNotNull(astNode);
        this.right = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.left.toSource());
        stringBuilder.append(" ");
        stringBuilder.append(AstNode.operatorToString(this.getType()));
        stringBuilder.append(" ");
        stringBuilder.append(this.right.toSource());
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.left.visit(nodeVisitor);
            this.right.visit(nodeVisitor);
        }
    }
}

