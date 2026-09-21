/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.Scope;

public class ArrayComprehension
extends Scope {
    private AstNode filter;
    private int ifPosition = -1;
    private List<ArrayComprehensionLoop> loops = new ArrayList<ArrayComprehensionLoop>();
    private int lp = -1;
    private AstNode result;
    private int rp = -1;

    public ArrayComprehension() {
        this.type = 161;
    }

    public ArrayComprehension(int n2) {
        super(n2);
        this.type = 161;
    }

    public ArrayComprehension(int n2, int n3) {
        super(n2, n3);
        this.type = 161;
    }

    public void addLoop(ArrayComprehensionLoop arrayComprehensionLoop) {
        this.assertNotNull(arrayComprehensionLoop);
        this.loops.add(arrayComprehensionLoop);
        arrayComprehensionLoop.setParent(this);
    }

    public AstNode getFilter() {
        return this.filter;
    }

    public int getFilterLp() {
        return this.lp;
    }

    public int getFilterRp() {
        return this.rp;
    }

    public int getIfPosition() {
        return this.ifPosition;
    }

    public List<ArrayComprehensionLoop> getLoops() {
        return this.loops;
    }

    public AstNode getResult() {
        return this.result;
    }

    public void setFilter(AstNode astNode) {
        this.filter = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setFilterLp(int n2) {
        this.lp = n2;
    }

    public void setFilterRp(int n2) {
        this.rp = n2;
    }

    public void setIfPosition(int n2) {
        this.ifPosition = n2;
    }

    public void setLoops(List<ArrayComprehensionLoop> object) {
        this.assertNotNull(object);
        this.loops.clear();
        object = object.iterator();
        while (object.hasNext()) {
            this.addLoop((ArrayComprehensionLoop)object.next());
        }
    }

    public void setResult(AstNode astNode) {
        this.assertNotNull(astNode);
        this.result = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder(250);
        stringBuilder.append("[");
        stringBuilder.append(this.result.toSource(0));
        Iterator<ArrayComprehensionLoop> iterator = this.loops.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toSource(0));
        }
        if (this.filter != null) {
            stringBuilder.append(" if (");
            stringBuilder.append(this.filter.toSource(0));
            stringBuilder.append(")");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (!nodeVisitor.visit(this)) {
            return;
        }
        this.result.visit(nodeVisitor);
        Object object = this.loops.iterator();
        while (object.hasNext()) {
            object.next().visit(nodeVisitor);
        }
        object = this.filter;
        if (object != null) {
            ((AstNode)object).visit(nodeVisitor);
        }
    }
}

