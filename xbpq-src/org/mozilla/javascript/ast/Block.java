/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.Iterator;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class Block
extends AstNode {
    public Block() {
        this.type = 133;
    }

    public Block(int n2) {
        super(n2);
        this.type = 133;
    }

    public Block(int n2, int n3) {
        super(n2, n3);
        this.type = 133;
    }

    public void addStatement(AstNode astNode) {
        this.addChild(astNode);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("{\n");
        for (AstNode astNode : this) {
            stringBuilder.append(astNode.toSource(n2 + 1));
            if (astNode.getType() != 165) continue;
            stringBuilder.append("\n");
        }
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("}");
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource(n2));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<Node> iterator = this.iterator();
            while (iterator.hasNext()) {
                ((AstNode)iterator.next()).visit(nodeVisitor);
            }
        }
    }
}

