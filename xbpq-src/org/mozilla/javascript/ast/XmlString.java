/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.XmlFragment;

public class XmlString
extends XmlFragment {
    private String xml;

    public XmlString() {
    }

    public XmlString(int n2) {
        super(n2);
    }

    public XmlString(int n2, String string) {
        super(n2);
        this.setXml(string);
    }

    public String getXml() {
        return this.xml;
    }

    public void setXml(String string) {
        this.assertNotNull(string);
        this.xml = string;
        this.setLength(string.length());
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.xml);
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

