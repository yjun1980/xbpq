/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.Scope;

public class Symbol {
    private Scope containingTable;
    private int declType;
    private int index = -1;
    private String name;
    private Node node;

    public Symbol() {
    }

    public Symbol(int n2, String string) {
        this.setName(string);
        this.setDeclType(n2);
    }

    public Scope getContainingTable() {
        return this.containingTable;
    }

    public int getDeclType() {
        return this.declType;
    }

    public String getDeclTypeName() {
        return Token.typeToName(this.declType);
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public Node getNode() {
        return this.node;
    }

    public void setContainingTable(Scope scope) {
        this.containingTable = scope;
    }

    public void setDeclType(int n2) {
        if (n2 != 113 && n2 != 90 && n2 != 126 && n2 != 157 && n2 != 158) {
            throw new IllegalArgumentException(r.a("Invalid declType: ", n2));
        }
        this.declType = n2;
    }

    public void setIndex(int n2) {
        this.index = n2;
    }

    public void setName(String string) {
        this.name = string;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public String toString() {
        StringBuilder stringBuilder = a.c("Symbol (");
        stringBuilder.append(this.getDeclTypeName());
        stringBuilder.append(") name=");
        stringBuilder.append(this.name);
        if (this.node != null) {
            stringBuilder.append(" line=");
            stringBuilder.append(this.node.getLineno());
        }
        return stringBuilder.toString();
    }
}

