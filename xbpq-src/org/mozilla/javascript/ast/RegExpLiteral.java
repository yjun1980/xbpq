/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class RegExpLiteral
extends AstNode {
    private String flags;
    private String value;

    public RegExpLiteral() {
        this.type = 48;
    }

    public RegExpLiteral(int n2) {
        super(n2);
        this.type = 48;
    }

    public RegExpLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 48;
    }

    public String getFlags() {
        return this.flags;
    }

    public String getValue() {
        return this.value;
    }

    public void setFlags(String string) {
        this.flags = string;
    }

    public void setValue(String string) {
        this.assertNotNull(string);
        this.value = string;
    }

    @Override
    public String toSource(int n2) {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("/");
        stringBuilder.append(this.value);
        stringBuilder.append("/");
        String string2 = string = this.flags;
        if (string == null) {
            string2 = "";
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

