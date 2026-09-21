/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.I.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.SwitchCase;

public class SwitchStatement
extends Jump {
    private static final List<SwitchCase> NO_CASES = Collections.unmodifiableList(new ArrayList());
    private List<SwitchCase> cases;
    private AstNode expression;
    private int lp = -1;
    private int rp = -1;

    public SwitchStatement() {
        this.type = 118;
    }

    public SwitchStatement(int n2) {
        this.type = 118;
        this.position = n2;
    }

    public SwitchStatement(int n2, int n3) {
        this.type = 118;
        this.position = n2;
        this.length = n3;
    }

    public void addCase(SwitchCase switchCase) {
        this.assertNotNull(switchCase);
        if (this.cases == null) {
            this.cases = new ArrayList<SwitchCase>();
        }
        this.cases.add(switchCase);
        switchCase.setParent(this);
    }

    public List<SwitchCase> getCases() {
        List<SwitchCase> list = this.cases;
        if (list == null) {
            list = NO_CASES;
        }
        return list;
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public void setCases(List<SwitchCase> object) {
        if (object == null) {
            this.cases = null;
        } else {
            List<SwitchCase> list = this.cases;
            if (list != null) {
                list.clear();
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.addCase((SwitchCase)object.next());
            }
        }
    }

    public void setExpression(AstNode astNode) {
        this.assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    public void setLp(int n2) {
        this.lp = n2;
    }

    public void setParens(int n2, int n3) {
        this.lp = n2;
        this.rp = n3;
    }

    public void setRp(int n2) {
        this.rp = n2;
    }

    @Override
    public String toSource(int n2) {
        String string = this.makeIndent(n2);
        StringBuilder stringBuilder = r.d(string, "switch (");
        stringBuilder.append(this.expression.toSource(0));
        stringBuilder.append(") {\n");
        Object object = this.cases;
        if (object != null) {
            object = object.iterator();
            while (object.hasNext()) {
                stringBuilder.append(((SwitchCase)object.next()).toSource(n2 + 1));
            }
        }
        return r.c(stringBuilder, string, "}\n");
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
            Iterator<SwitchCase> iterator = this.getCases().iterator();
            while (iterator.hasNext()) {
                iterator.next().visit(nodeVisitor);
            }
        }
    }
}

