/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.List;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.ObjectLiteral;

public class NewExpression
extends FunctionCall {
    private ObjectLiteral initializer;

    public NewExpression() {
        this.type = 30;
    }

    public NewExpression(int n2) {
        super(n2);
        this.type = 30;
    }

    public NewExpression(int n2, int n3) {
        super(n2, n3);
        this.type = 30;
    }

    public ObjectLiteral getInitializer() {
        return this.initializer;
    }

    public void setInitializer(ObjectLiteral objectLiteral) {
        this.initializer = objectLiteral;
        if (objectLiteral != null) {
            objectLiteral.setParent(this);
        }
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("new ");
        stringBuilder.append(this.target.toSource(0));
        stringBuilder.append("(");
        List<AstNode> list = this.arguments;
        if (list != null) {
            this.printList(list, stringBuilder);
        }
        stringBuilder.append(")");
        if (this.initializer != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.initializer.toSource(0));
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            Object object = this.getArguments().iterator();
            while (object.hasNext()) {
                object.next().visit(nodeVisitor);
            }
            object = this.initializer;
            if (object != null) {
                ((ObjectLiteral)object).visit(nodeVisitor);
            }
        }
    }
}

