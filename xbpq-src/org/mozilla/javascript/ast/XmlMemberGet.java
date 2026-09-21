/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.C.a;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.XmlRef;

public class XmlMemberGet
extends InfixExpression {
    public XmlMemberGet() {
        this.type = 147;
    }

    public XmlMemberGet(int n2) {
        super(n2);
        this.type = 147;
    }

    public XmlMemberGet(int n2, int n3) {
        super(n2, n3);
        this.type = 147;
    }

    public XmlMemberGet(int n2, int n3, AstNode astNode, XmlRef xmlRef) {
        super(n2, n3, astNode, xmlRef);
        this.type = 147;
    }

    public XmlMemberGet(AstNode astNode, XmlRef xmlRef) {
        super(astNode, xmlRef);
        this.type = 147;
    }

    public XmlMemberGet(AstNode astNode, XmlRef xmlRef, int n2) {
        super(147, astNode, (AstNode)xmlRef, n2);
        this.type = 147;
    }

    private String dotsToString() {
        int n2 = this.getType();
        if (n2 != 112) {
            if (n2 == 147) {
                return "..";
            }
            StringBuilder stringBuilder = a.c("Invalid type of XmlMemberGet: ");
            stringBuilder.append(this.getType());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return ".";
    }

    public XmlRef getMemberRef() {
        return (XmlRef)this.getRight();
    }

    public AstNode getTarget() {
        return this.getLeft();
    }

    public void setProperty(XmlRef xmlRef) {
        this.setRight(xmlRef);
    }

    public void setTarget(AstNode astNode) {
        this.setLeft(astNode);
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.getLeft().toSource(0));
        stringBuilder.append(this.dotsToString());
        stringBuilder.append(this.getRight().toSource(0));
        return stringBuilder.toString();
    }
}

