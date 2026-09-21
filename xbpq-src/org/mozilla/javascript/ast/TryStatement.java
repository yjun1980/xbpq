/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.CatchClause;
import org.mozilla.javascript.ast.NodeVisitor;

public class TryStatement
extends AstNode {
    private static final List<CatchClause> NO_CATCHES = Collections.unmodifiableList(new ArrayList());
    private List<CatchClause> catchClauses;
    private AstNode finallyBlock;
    private int finallyPosition = -1;
    private AstNode tryBlock;

    public TryStatement() {
        this.type = 84;
    }

    public TryStatement(int n2) {
        super(n2);
        this.type = 84;
    }

    public TryStatement(int n2, int n3) {
        super(n2, n3);
        this.type = 84;
    }

    public void addCatchClause(CatchClause catchClause) {
        this.assertNotNull(catchClause);
        if (this.catchClauses == null) {
            this.catchClauses = new ArrayList<CatchClause>();
        }
        this.catchClauses.add(catchClause);
        catchClause.setParent(this);
    }

    public List<CatchClause> getCatchClauses() {
        List<CatchClause> list = this.catchClauses;
        if (list == null) {
            list = NO_CATCHES;
        }
        return list;
    }

    public AstNode getFinallyBlock() {
        return this.finallyBlock;
    }

    public int getFinallyPosition() {
        return this.finallyPosition;
    }

    public AstNode getTryBlock() {
        return this.tryBlock;
    }

    public void setCatchClauses(List<CatchClause> object) {
        if (object == null) {
            this.catchClauses = null;
        } else {
            List<CatchClause> list = this.catchClauses;
            if (list != null) {
                list.clear();
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.addCatchClause((CatchClause)object.next());
            }
        }
    }

    public void setFinallyBlock(AstNode astNode) {
        this.finallyBlock = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setFinallyPosition(int n2) {
        this.finallyPosition = n2;
    }

    public void setTryBlock(AstNode astNode) {
        this.assertNotNull(astNode);
        this.tryBlock = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder(250);
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("try ");
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource(n2 + 1));
            stringBuilder.append("\n");
        }
        stringBuilder.append(this.tryBlock.toSource(n2).trim());
        Iterator<CatchClause> iterator = this.getCatchClauses().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toSource(n2));
        }
        if (this.finallyBlock != null) {
            stringBuilder.append(" finally ");
            stringBuilder.append(this.finallyBlock.toSource(n2));
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.tryBlock.visit(nodeVisitor);
            Object object = this.getCatchClauses().iterator();
            while (object.hasNext()) {
                object.next().visit(nodeVisitor);
            }
            object = this.finallyBlock;
            if (object != null) {
                ((AstNode)object).visit(nodeVisitor);
            }
        }
    }
}

