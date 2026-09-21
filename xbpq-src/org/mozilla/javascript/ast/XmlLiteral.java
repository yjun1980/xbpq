/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.XmlFragment;

public class XmlLiteral
extends AstNode {
    private List<XmlFragment> fragments = new ArrayList<XmlFragment>();

    public XmlLiteral() {
        this.type = 149;
    }

    public XmlLiteral(int n2) {
        super(n2);
        this.type = 149;
    }

    public XmlLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 149;
    }

    public void addFragment(XmlFragment xmlFragment) {
        this.assertNotNull(xmlFragment);
        this.fragments.add(xmlFragment);
        xmlFragment.setParent(this);
    }

    public List<XmlFragment> getFragments() {
        return this.fragments;
    }

    public void setFragments(List<XmlFragment> object) {
        this.assertNotNull(object);
        this.fragments.clear();
        object = object.iterator();
        while (object.hasNext()) {
            this.addFragment((XmlFragment)object.next());
        }
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder(250);
        Iterator<XmlFragment> iterator = this.fragments.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toSource(0));
        }
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<XmlFragment> iterator = this.fragments.iterator();
            while (iterator.hasNext()) {
                iterator.next().visit(nodeVisitor);
            }
        }
    }
}

