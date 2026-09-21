/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token$CommentType;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.NodeVisitor;

public class SwitchCase
extends AstNode {
    private AstNode expression;
    private List<AstNode> statements;

    public SwitchCase() {
        this.type = 119;
    }

    public SwitchCase(int n2) {
        super(n2);
        this.type = 119;
    }

    public SwitchCase(int n2, int n3) {
        super(n2, n3);
        this.type = 119;
    }

    public void addStatement(AstNode astNode) {
        this.assertNotNull(astNode);
        if (this.statements == null) {
            this.statements = new ArrayList<AstNode>();
        }
        int n2 = astNode.getPosition();
        this.setLength(astNode.getLength() + n2 - this.getPosition());
        this.statements.add(astNode);
        astNode.setParent(this);
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public List<AstNode> getStatements() {
        return this.statements;
    }

    public boolean isDefault() {
        boolean bl = this.expression == null;
        return bl;
    }

    public void setExpression(AstNode astNode) {
        this.expression = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setStatements(List<AstNode> object) {
        List<AstNode> list = this.statements;
        if (list != null) {
            list.clear();
        }
        object = object.iterator();
        while (object.hasNext()) {
            this.addStatement((AstNode)object.next());
        }
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        if (this.expression == null) {
            stringBuilder.append("default:\n");
        } else {
            stringBuilder.append("case ");
            stringBuilder.append(this.expression.toSource(0));
            stringBuilder.append(":");
            if (this.getInlineComment() != null) {
                stringBuilder.append(this.getInlineComment().toSource(n2 + 1));
            }
            stringBuilder.append("\n");
        }
        Object object = this.statements;
        if (object != null) {
            object = object.iterator();
            while (object.hasNext()) {
                AstNode astNode = (AstNode)object.next();
                stringBuilder.append(astNode.toSource(n2 + 1));
                if (astNode.getType() != 165 || ((Comment)astNode).getCommentType() != Token$CommentType.LINE) continue;
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Object object = this.expression;
            if (object != null) {
                ((AstNode)object).visit(nodeVisitor);
            }
            if ((object = this.statements) != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    ((AstNode)object.next()).visit(nodeVisitor);
                }
            }
        }
    }
}

