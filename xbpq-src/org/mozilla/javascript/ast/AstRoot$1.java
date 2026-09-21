/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.NodeVisitor;

class AstRoot$1
implements NodeVisitor {
    final AstRoot this$0;

    AstRoot$1(AstRoot astRoot) {
        this.this$0 = astRoot;
    }

    @Override
    public boolean visit(AstNode astNode) {
        if (astNode.getType() == 140) {
            return true;
        }
        if (astNode.getParent() != null) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No parent for node: ");
        stringBuilder.append(astNode);
        stringBuilder.append("\n");
        stringBuilder.append(astNode.toSource(0));
        throw new IllegalStateException(stringBuilder.toString());
    }
}

