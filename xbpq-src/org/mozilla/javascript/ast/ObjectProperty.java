/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.InfixExpression;

public class ObjectProperty
extends InfixExpression {
    public ObjectProperty() {
        this.type = 107;
    }

    public ObjectProperty(int n2) {
        super(n2);
        this.type = 107;
    }

    public ObjectProperty(int n2, int n3) {
        super(n2, n3);
        this.type = 107;
    }

    public boolean isGetterMethod() {
        boolean bl = this.type == 155;
        return bl;
    }

    public boolean isMethod() {
        boolean bl = this.isGetterMethod() || this.isSetterMethod() || this.isNormalMethod();
        return bl;
    }

    public boolean isNormalMethod() {
        boolean bl = this.type == 167;
        return bl;
    }

    public boolean isSetterMethod() {
        boolean bl = this.type == 156;
        return bl;
    }

    public void setIsGetterMethod() {
        this.type = 155;
    }

    public void setIsNormalMethod() {
        this.type = 167;
    }

    public void setIsSetterMethod() {
        this.type = 156;
    }

    public void setNodeType(int n2) {
        if (n2 != 107 && n2 != 155 && n2 != 156 && n2 != 167) {
            throw new IllegalArgumentException(r.a("invalid node type: ", n2));
        }
        this.setType(n2);
    }

    @Override
    public String toSource(int n2) {
        Object object;
        int n3;
        StringBuilder stringBuilder;
        block8: {
            block7: {
                block6: {
                    stringBuilder = a.c("\n");
                    n3 = n2 + 1;
                    stringBuilder.append(this.makeIndent(n3));
                    if (!this.isGetterMethod()) break block6;
                    object = "get ";
                    break block7;
                }
                if (!this.isSetterMethod()) break block8;
                object = "set ";
            }
            stringBuilder.append((String)object);
        }
        object = this.left;
        if (this.getType() == 107) {
            n2 = 0;
        }
        stringBuilder.append(((AstNode)object).toSource(n2));
        if (this.type == 107) {
            stringBuilder.append(": ");
        }
        object = this.right;
        n2 = n3;
        if (this.getType() == 107) {
            n2 = 0;
        }
        stringBuilder.append(((AstNode)object).toSource(n2));
        return stringBuilder.toString();
    }
}

