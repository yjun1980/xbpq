/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class FunctionCall
extends AstNode {
    protected static final List<AstNode> NO_ARGS = Collections.unmodifiableList(new ArrayList());
    protected List<AstNode> arguments;
    protected int lp = -1;
    protected int rp = -1;
    protected AstNode target;

    public FunctionCall() {
        this.type = 38;
    }

    public FunctionCall(int n2) {
        super(n2);
        this.type = 38;
    }

    public FunctionCall(int n2, int n3) {
        super(n2, n3);
        this.type = 38;
    }

    public void addArgument(AstNode astNode) {
        this.assertNotNull(astNode);
        if (this.arguments == null) {
            this.arguments = new ArrayList<AstNode>();
        }
        this.arguments.add(astNode);
        astNode.setParent(this);
    }

    public List<AstNode> getArguments() {
        List<AstNode> list = this.arguments;
        if (list == null) {
            list = NO_ARGS;
        }
        return list;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public void setArguments(List<AstNode> object) {
        if (object == null) {
            this.arguments = null;
        } else {
            List<AstNode> list = this.arguments;
            if (list != null) {
                list.clear();
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.addArgument((AstNode)object.next());
            }
        }
    }

    public void setLp(int n2) {
        this.lp = n2;
    }

    public void setParens(int n2, int n3) {
        this.lp = n2;
        this.rp = n3;
    }

    public void setRp(int n2) {
        this.rp = n2;
    }

    public void setTarget(AstNode astNode) {
        this.assertNotNull(astNode);
        this.target = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.target.toSource(0));
        stringBuilder.append("(");
        List<AstNode> list = this.arguments;
        if (list != null) {
            this.printList(list, stringBuilder);
        }
        stringBuilder.append(")");
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource(n2));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            Iterator<AstNode> iterator = this.getArguments().iterator();
            while (iterator.hasNext()) {
                iterator.next().visit(nodeVisitor);
            }
        }
    }
}

