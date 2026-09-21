/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.math.BigInteger;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class BigIntLiteral
extends AstNode {
    private BigInteger bigInt;
    private String value;

    public BigIntLiteral() {
        this.type = 83;
    }

    public BigIntLiteral(int n2) {
        super(n2);
        this.type = 83;
    }

    public BigIntLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 83;
    }

    public BigIntLiteral(int n2, String string) {
        super(n2);
        this.type = 83;
        this.setValue(string);
        this.setLength(string.length());
    }

    public BigIntLiteral(int n2, String string, BigInteger bigInteger) {
        this(n2, string);
        this.setBigInt(bigInteger);
    }

    @Override
    public BigInteger getBigInt() {
        return this.bigInt;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public void setBigInt(BigInteger bigInteger) {
        this.bigInt = bigInteger;
    }

    public void setValue(String string) {
        this.assertNotNull(string);
        this.value = string;
    }

    @Override
    public String toSource(int n2) {
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        if (this.bigInt == null) {
            charSequence = "<null>";
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.bigInt.toString());
            ((StringBuilder)charSequence).append("n");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

