/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.XmlRef;

public class XmlPropRef
extends XmlRef {
    private Name propName;

    public XmlPropRef() {
        this.type = 81;
    }

    public XmlPropRef(int n2) {
        super(n2);
        this.type = 81;
    }

    public XmlPropRef(int n2, int n3) {
        super(n2, n3);
        this.type = 81;
    }

    public Name getPropName() {
        return this.propName;
    }

    public void setPropName(Name name) {
        this.assertNotNull(name);
        this.propName = name;
        name.setParent(this);
    }

    @Override
    public String toSource(int n2) {
        Name name;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        if (this.isAttributeAccess()) {
            stringBuilder.append("@");
        }
        if ((name = this.namespace) != null) {
            stringBuilder.append(name.toSource(0));
            stringBuilder.append("::");
        }
        stringBuilder.append(this.propName.toSource(0));
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Name name = this.namespace;
            if (name != null) {
                name.visit(nodeVisitor);
            }
            this.propName.visit(nodeVisitor);
        }
    }
}

