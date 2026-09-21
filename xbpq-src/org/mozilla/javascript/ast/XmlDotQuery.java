/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.InfixExpression;

public class XmlDotQuery
extends InfixExpression {
    private int rp = -1;

    public XmlDotQuery() {
        this.type = 150;
    }

    public XmlDotQuery(int n2) {
        super(n2);
        this.type = 150;
    }

    public XmlDotQuery(int n2, int n3) {
        super(n2, n3);
        this.type = 150;
    }

    public int getRp() {
        return this.rp;
    }

    public void setRp(int n2) {
        this.rp = n2;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.getLeft().toSource(0));
        stringBuilder.append(".(");
        stringBuilder.append(this.getRight().toSource(0));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

