/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;

public abstract class XmlRef
extends AstNode {
    protected int atPos = -1;
    protected int colonPos = -1;
    protected Name namespace;

    public XmlRef() {
    }

    public XmlRef(int n2) {
        super(n2);
    }

    public XmlRef(int n2, int n3) {
        super(n2, n3);
    }

    public int getAtPos() {
        return this.atPos;
    }

    public int getColonPos() {
        return this.colonPos;
    }

    public Name getNamespace() {
        return this.namespace;
    }

    public boolean isAttributeAccess() {
        boolean bl = this.atPos >= 0;
        return bl;
    }

    public void setAtPos(int n2) {
        this.atPos = n2;
    }

    public void setColonPos(int n2) {
        this.colonPos = n2;
    }

    public void setNamespace(Name name) {
        this.namespace = name;
        if (name != null) {
            name.setParent(this);
        }
    }
}

