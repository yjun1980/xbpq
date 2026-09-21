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
import org.mozilla.javascript.ast.ObjectProperty;

public class ObjectLiteral
extends AstNode
implements DestructuringForm {
    private static final List<ObjectProperty> NO_ELEMS = Collections.unmodifiableList(new ArrayList());
    private List<ObjectProperty> elements;
    boolean isDestructuring;

    public ObjectLiteral() {
        this.type = 67;
    }

    public ObjectLiteral(int n2) {
        super(n2);
        this.type = 67;
    }

    public ObjectLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 67;
    }

    public void addElement(ObjectProperty objectProperty) {
        this.assertNotNull(objectProperty);
        if (this.elements == null) {
            this.elements = new ArrayList<ObjectProperty>();
        }
        this.elements.add(objectProperty);
        objectProperty.setParent(this);
    }

    public List<ObjectProperty> getElements() {
        List<ObjectProperty> list = this.elements;
        if (list == null) {
            list = NO_ELEMS;
        }
        return list;
    }

    @Override
    public boolean isDestructuring() {
        return this.isDestructuring;
    }

    public void setElements(List<ObjectProperty> object) {
        if (object == null) {
            this.elements = null;
        } else {
            List<ObjectProperty> list = this.elements;
            if (list != null) {
                list.clear();
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.addElement((ObjectProperty)object.next());
            }
        }
    }

    @Override
    public void setIsDestructuring(boolean bl) {
        this.isDestructuring = bl;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("{");
        List<ObjectProperty> list = this.elements;
        if (list != null) {
            this.printList(list, stringBuilder);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<ObjectProperty> iterator = this.getElements().iterator();
            while (iterator.hasNext()) {
                iterator.next().visit(nodeVisitor);
            }
        }
    }
}

