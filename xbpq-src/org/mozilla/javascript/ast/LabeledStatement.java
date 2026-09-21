/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.NodeVisitor;

public class LabeledStatement
extends AstNode {
    private List<Label> labels = new ArrayList<Label>();
    private AstNode statement;

    public LabeledStatement() {
        this.type = 137;
    }

    public LabeledStatement(int n2) {
        super(n2);
        this.type = 137;
    }

    public LabeledStatement(int n2, int n3) {
        super(n2, n3);
        this.type = 137;
    }

    public void addLabel(Label label) {
        this.assertNotNull(label);
        this.labels.add(label);
        label.setParent(this);
    }

    public Label getFirstLabel() {
        return this.labels.get(0);
    }

    public Label getLabelByName(String string) {
        for (Label label : this.labels) {
            if (!string.equals(label.getName())) continue;
            return label;
        }
        return null;
    }

    public List<Label> getLabels() {
        return this.labels;
    }

    public AstNode getStatement() {
        return this.statement;
    }

    @Override
    public boolean hasSideEffects() {
        return true;
    }

    public void setLabels(List<Label> object) {
        this.assertNotNull(object);
        List<Label> list = this.labels;
        if (list != null) {
            list.clear();
        }
        object = object.iterator();
        while (object.hasNext()) {
            this.addLabel((Label)object.next());
        }
    }

    public void setStatement(AstNode astNode) {
        this.assertNotNull(astNode);
        this.statement = astNode;
        astNode.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Label> iterator = this.labels.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toSource(n2));
        }
        stringBuilder.append(this.statement.toSource(n2 + 1));
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<Label> iterator = this.labels.iterator();
            while (iterator.hasNext()) {
                ((AstNode)iterator.next()).visit(nodeVisitor);
            }
            this.statement.visit(nodeVisitor);
        }
    }
}

