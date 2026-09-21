/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.C.a;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class Yield
extends AstNode {
    private AstNode value;

    public Yield() {
        this.type = 73;
    }

    public Yield(int n2) {
        super(n2);
        this.type = 73;
    }

    public Yield(int n2, int n3) {
        super(n2, n3);
        this.type = 73;
    }

    public Yield(int n2, int n3, AstNode astNode, boolean bl) {
        super(n2, n3);
        n2 = bl ? 169 : 73;
        this.type = n2;
        this.setValue(astNode);
    }

    public AstNode getValue() {
        return this.value;
    }

    public void setValue(AstNode astNode) {
        this.value = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    @Override
    public String toSource(int n2) {
        CharSequence charSequence;
        if (this.value == null) {
            charSequence = "yield";
        } else {
            charSequence = a.c("yield ");
            ((StringBuilder)charSequence).append(this.value.toSource(0));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        AstNode astNode;
        if (nodeVisitor.visit(this) && (astNode = this.value) != null) {
            astNode.visit(nodeVisitor);
        }
    }
}

