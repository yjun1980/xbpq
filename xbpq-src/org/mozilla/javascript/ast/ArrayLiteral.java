/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.DestructuringForm;
import org.mozilla.javascript.ast.NodeVisitor;

public class ArrayLiteral
extends AstNode
implements DestructuringForm {
    private static final List<AstNode> NO_ELEMS = Collections.unmodifiableList(new ArrayList());
    private int destructuringLength;
    private List<AstNode> elements;
    private boolean isDestructuring;
    private int skipCount;

    public ArrayLiteral() {
        this.type = 66;
    }

    public ArrayLiteral(int n2) {
        super(n2);
        this.type = 66;
    }

    public ArrayLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 66;
    }

    public void addElement(AstNode astNode) {
        this.assertNotNull(astNode);
        if (this.elements == null) {
            this.elements = new ArrayList<AstNode>();
        }
        this.elements.add(astNode);
        astNode.setParent(this);
    }

    public int getDestructuringLength() {
        return this.destructuringLength;
    }

    public AstNode getElement(int n2) {
        List<AstNode> list = this.elements;
        if (list != null) {
            return list.get(n2);
        }
        throw new IndexOutOfBoundsException("no elements");
    }

    public List<AstNode> getElements() {
        List<AstNode> list = this.elements;
        if (list == null) {
            list = NO_ELEMS;
        }
        return list;
    }

    public int getSize() {
        List<AstNode> list = this.elements;
        int n2 = list == null ? 0 : list.size();
        return n2;
    }

    public int getSkipCount() {
        return this.skipCount;
    }

    @Override
    public boolean isDestructuring() {
        return this.isDestructuring;
    }

    public void setDestructuringLength(int n2) {
        this.destructuringLength = n2;
    }

    public void setElements(List<AstNode> object) {
        if (object == null) {
            this.elements = null;
        } else {
            List<AstNode> list = this.elements;
            if (list != null) {
                list.clear();
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.addElement((AstNode)object.next());
            }
        }
    }

    @Override
    public void setIsDestructuring(boolean bl) {
        this.isDestructuring = bl;
    }

    public void setSkipCount(int n2) {
        this.skipCount = n2;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("[");
        List<AstNode> list = this.elements;
        if (list != null) {
            this.printList(list, stringBuilder);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<AstNode> iterator = this.getElements().iterator();
            while (iterator.hasNext()) {
                iterator.next().visit(nodeVisitor);
            }
        }
    }
}

