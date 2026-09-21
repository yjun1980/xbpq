/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class NumberLiteral
extends AstNode {
    private double number;
    private String value;

    public NumberLiteral() {
        this.type = 40;
    }

    public NumberLiteral(double d2) {
        this.type = 40;
        this.setDouble(d2);
        this.setValue(Double.toString(d2));
    }

    public NumberLiteral(int n2) {
        super(n2);
        this.type = 40;
    }

    public NumberLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 40;
    }

    public NumberLiteral(int n2, String string) {
        super(n2);
        this.type = 40;
        this.setValue(string);
        this.setLength(string.length());
    }

    public NumberLiteral(int n2, String string, double d2) {
        this(n2, string);
        this.setDouble(d2);
    }

    public double getNumber() {
        return this.number;
    }

    public String getValue() {
        return this.value;
    }

    public void setNumber(double d2) {
        this.number = d2;
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
        String string2 = string = this.value;
        if (string == null) {
            string2 = "<null>";
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

