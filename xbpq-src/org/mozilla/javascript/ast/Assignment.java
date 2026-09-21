/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.InfixExpression;

public class Assignment
extends InfixExpression {
    public Assignment() {
    }

    public Assignment(int n2) {
        super(n2);
    }

    public Assignment(int n2, int n3) {
        super(n2, n3);
    }

    public Assignment(int n2, int n3, AstNode astNode, AstNode astNode2) {
        super(n2, n3, astNode, astNode2);
    }

    public Assignment(int n2, AstNode astNode, AstNode astNode2, int n3) {
        super(n2, astNode, astNode2, n3);
    }

    public Assignment(AstNode astNode, AstNode astNode2) {
        super(astNode, astNode2);
    }
}

