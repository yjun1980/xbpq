/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.I.r;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.NodeVisitor;

public class Label
extends Jump {
    private String name;

    public Label() {
        this.type = 134;
    }

    public Label(int n2) {
        this(n2, -1);
    }

    public Label(int n2, int n3) {
        this.type = 134;
        this.position = n2;
        this.length = n3;
    }

    public Label(int n2, int n3, String string) {
        this(n2, n3);
        this.setName(string);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String string) {
        if ((string = string == null ? null : string.trim()) != null && !"".equals(string)) {
            this.name = string;
            return;
        }
        throw new IllegalArgumentException("invalid label name");
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        return r.c(stringBuilder, this.name, ":\n");
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}

