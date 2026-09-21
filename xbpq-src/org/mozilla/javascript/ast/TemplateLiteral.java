/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.TemplateCharacters;

public class TemplateLiteral
extends AstNode {
    private List<AstNode> elements;

    public TemplateLiteral() {
        this.type = 170;
    }

    public TemplateLiteral(int n2) {
        super(n2);
        this.type = 170;
    }

    public TemplateLiteral(int n2, int n3) {
        super(n2, n3);
        this.type = 170;
    }

    public void addElement(AstNode astNode) {
        this.assertNotNull(astNode);
        if (this.elements == null) {
            this.elements = new ArrayList<AstNode>();
        }
        this.elements.add(astNode);
        astNode.setParent(this);
    }

    public AstNode getElement(int n2) {
        List<AstNode> list = this.elements;
        if (list != null) {
            return list.get(n2);
        }
        throw new IndexOutOfBoundsException("no elements");
    }

    public List<AstNode> getElements() {
        List<AstNode> list;
        List<AstNode> list2 = list = this.elements;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public int getSize() {
        List<AstNode> list = this.elements;
        int n2 = list == null ? 0 : list.size();
        return n2;
    }

    public List<AstNode> getSubstitutions() {
        if (this.elements == null) {
            return Collections.emptyList();
        }
        ArrayList<AstNode> arrayList = new ArrayList<AstNode>();
        for (AstNode astNode : this.elements) {
            if (astNode.getType() == 171) continue;
            arrayList.add(astNode);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<TemplateCharacters> getTemplateStrings() {
        if (this.elements == null) {
            return Collections.emptyList();
        }
        ArrayList<TemplateCharacters> arrayList = new ArrayList<TemplateCharacters>();
        for (AstNode astNode : this.elements) {
            if (astNode.getType() != 171) continue;
            arrayList.add((TemplateCharacters)astNode);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void setElements(List<AstNode> object) {
        if (object == null) {
            this.elements = null;
        } else {
            List<AstNode> list = this.elements;
            if (list != null) {
                list.clear();
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.addElement((AstNode)object.next());
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("`");
        for (AstNode astNode : this.getElements()) {
            void object;
            if (astNode.getType() == 171) {
                String string = astNode.toSource(0);
            } else {
                stringBuilder.append("${");
                stringBuilder.append(astNode.toSource(0));
                String string = "}";
            }
            stringBuilder.append((String)object);
        }
        stringBuilder.append("`");
        return stringBuilder.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<AstNode> iterator = this.getElements().iterator();
            while (iterator.hasNext()) {
                iterator.next().visit(nodeVisitor);
            }
        }
    }
}

