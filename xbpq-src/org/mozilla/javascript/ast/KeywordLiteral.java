/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class KeywordLiteral
extends AstNode {
    public KeywordLiteral() {
    }

    public KeywordLiteral(int n2) {
        super(n2);
    }

    public KeywordLiteral(int n2, int n3) {
        super(n2, n3);
    }

    public KeywordLiteral(int n2, int n3, int n4) {
        super(n2, n3);
        this.setType(n4);
    }

    public boolean isBooleanLiteral() {
        int n2 = this.type;
        boolean bl = n2 == 45 || n2 == 44;
        return bl;
    }

    @Override
    public KeywordLiteral setType(int n2) {
        if (n2 != 43 && n2 != 42 && n2 != 45 && n2 != 44 && n2 != 164) {
            throw new IllegalArgumentException(r.a("Invalid node type: ", n2));
        }
        this.type = n2;
        return this;
    }

    @Override
    public String toSource(int n2) {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        n2 = this.getType();
        if (n2 != 164) {
            switch (n2) {
                default: {
                    StringBuilder stringBuilder2 = a.c("Invalid keyword literal type: ");
                    stringBuilder2.append(this.getType());
                    throw new IllegalStateException(stringBuilder2.toString());
                }
                case 45: {
                    string = "true";
                    break;
                }
                case 44: {
                    string = "false";
                    break;
                }
                case 43: {
                    string = "this";
                    break;
                }
                case 42: {
                    string = "null";
                    break;
                }
            }
        } else {
            string = "debugger;\n";
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

