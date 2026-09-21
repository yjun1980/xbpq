/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.Scope;

public class Name
extends AstNode {
    private String identifier;
    private Scope scope;

    public Name() {
        this.type = 39;
    }

    public Name(int n2) {
        super(n2);
        this.type = 39;
    }

    public Name(int n2, int n3) {
        super(n2, n3);
        this.type = 39;
    }

    public Name(int n2, int n3, String string) {
        super(n2, n3);
        this.type = 39;
        this.setIdentifier(string);
    }

    public Name(int n2, String string) {
        super(n2);
        this.type = 39;
        this.setIdentifier(string);
        this.setLength(string.length());
    }

    public Scope getDefiningScope() {
        Scope scope = this.getEnclosingScope();
        Object object = this.getIdentifier();
        object = scope == null ? null : scope.getDefiningScope((String)object);
        return object;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public Scope getScope() {
        return this.scope;
    }

    public boolean isLocalName() {
        Scope scope = this.getDefiningScope();
        boolean bl = scope != null && scope.getParentScope() != null;
        return bl;
    }

    public int length() {
        String string = this.identifier;
        int n2 = string == null ? 0 : string.length();
        return n2;
    }

    public void setIdentifier(String string) {
        this.assertNotNull(string);
        this.identifier = string;
        this.setLength(string.length());
    }

    @Override
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    @Override
    public String toSource(int n2) {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        String string2 = string = this.identifier;
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

