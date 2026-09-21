/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class TemplateCharacters
extends AstNode {
    private String rawValue;
    private String value;

    public TemplateCharacters() {
        this.type = 171;
    }

    public TemplateCharacters(int n2) {
        super(n2);
        this.type = 171;
    }

    public TemplateCharacters(int n2, int n3) {
        super(n2, n3);
        this.type = 171;
    }

    public String getRawValue() {
        return this.rawValue;
    }

    public String getValue() {
        return this.value;
    }

    public void setRawValue(String string) {
        this.assertNotNull(string);
        this.rawValue = string;
    }

    public void setValue(String string) {
        this.value = string;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder(this.makeIndent(n2));
        stringBuilder.append(this.rawValue);
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

