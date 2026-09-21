/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class StringLiteral
extends AstNode {
    private char quoteChar;
    private String value;

    public StringLiteral() {
        this.type = 41;
    }

    public StringLiteral(int n2) {
        super(n2);
        this.type = 41;
    }

    public StringLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 41;
    }

    public char getQuoteCharacter() {
        return this.quoteChar;
    }

    public String getValue() {
        return this.value;
    }

    public String getValue(boolean bl) {
        if (!bl) {
            return this.value;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.quoteChar);
        stringBuilder.append(this.value);
        stringBuilder.append(this.quoteChar);
        return stringBuilder.toString();
    }

    public void setQuoteCharacter(char c2) {
        this.quoteChar = c2;
    }

    public void setValue(String string) {
        this.assertNotNull(string);
        this.value = string;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder(this.makeIndent(n2));
        stringBuilder.append(this.quoteChar);
        stringBuilder.append(ScriptRuntime.escapeString(this.value, this.quoteChar));
        stringBuilder.append(this.quoteChar);
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

