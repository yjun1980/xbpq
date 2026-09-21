/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.I.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.VariableInitializer;

public class VariableDeclaration
extends AstNode {
    private boolean isStatement;
    private List<VariableInitializer> variables = new ArrayList<VariableInitializer>();

    public VariableDeclaration() {
        this.type = 126;
    }

    public VariableDeclaration(int n2) {
        super(n2);
        this.type = 126;
    }

    public VariableDeclaration(int n2, int n3) {
        super(n2, n3);
        this.type = 126;
    }

    private String declTypeName() {
        return Token.typeToName(this.type).toLowerCase();
    }

    public void addVariable(VariableInitializer variableInitializer) {
        this.assertNotNull(variableInitializer);
        this.variables.add(variableInitializer);
        variableInitializer.setParent(this);
    }

    public List<VariableInitializer> getVariables() {
        return this.variables;
    }

    public boolean isConst() {
        boolean bl = this.type == 158;
        return bl;
    }

    public boolean isLet() {
        boolean bl = this.type == 157;
        return bl;
    }

    public boolean isStatement() {
        return this.isStatement;
    }

    public boolean isVar() {
        boolean bl = this.type == 126;
        return bl;
    }

    public void setIsStatement(boolean bl) {
        this.isStatement = bl;
    }

    @Override
    public Node setType(int n2) {
        if (n2 != 126 && n2 != 158 && n2 != 157) {
            throw new IllegalArgumentException(r.a("invalid decl type: ", n2));
        }
        return super.setType(n2);
    }

    public void setVariables(List<VariableInitializer> object) {
        this.assertNotNull(object);
        this.variables.clear();
        object = object.iterator();
        while (object.hasNext()) {
            this.addVariable((VariableInitializer)object.next());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append(this.declTypeName());
        stringBuilder.append(" ");
        this.printList(this.variables, stringBuilder);
        if (this.isStatement()) {
            stringBuilder.append(";");
        }
        if (this.getInlineComment() != null) {
            stringBuilder.append(this.getInlineComment().toSource(n2));
        } else if (!this.isStatement()) return stringBuilder.toString();
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<VariableInitializer> iterator = this.variables.iterator();
            while (iterator.hasNext()) {
                ((AstNode)iterator.next()).visit(nodeVisitor);
            }
        }
    }
}

