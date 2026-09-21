/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.SortedSet;
import java.util.TreeSet;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstNode$DebugPrintVisitor;
import org.mozilla.javascript.ast.AstNode$PositionComparator;
import org.mozilla.javascript.ast.AstRoot$1;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.ScriptNode;

public class AstRoot
extends ScriptNode {
    private SortedSet<Comment> comments;

    public AstRoot() {
        this.type = 140;
    }

    public AstRoot(int n2) {
        super(n2);
        this.type = 140;
    }

    public void addComment(Comment comment) {
        this.assertNotNull(comment);
        if (this.comments == null) {
            this.comments = new TreeSet<AstNode>(new AstNode$PositionComparator());
        }
        this.comments.add(comment);
        comment.setParent(this);
    }

    public void checkParentLinks() {
        this.visit(new AstRoot$1(this));
    }

    @Override
    public String debugPrint() {
        AstNode$DebugPrintVisitor astNode$DebugPrintVisitor = new AstNode$DebugPrintVisitor(new StringBuilder(1000));
        this.visitAll(astNode$DebugPrintVisitor);
        return astNode$DebugPrintVisitor.toString();
    }

    public SortedSet<Comment> getComments() {
        return this.comments;
    }

    public void setComments(SortedSet<Comment> object) {
        if (object == null) {
            this.comments = null;
        } else {
            SortedSet<Comment> sortedSet = this.comments;
            if (sortedSet != null) {
                sortedSet.clear();
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.addComment((Comment)object.next());
            }
        }
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node node : this) {
            stringBuilder.append(((AstNode)node).toSource(n2));
            if (node.getType() != 165) continue;
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void visitAll(NodeVisitor nodeVisitor) {
        this.visit(nodeVisitor);
        this.visitComments(nodeVisitor);
    }

    public void visitComments(NodeVisitor nodeVisitor) {
        SortedSet<Comment> sortedSet = this.comments;
        if (sortedSet != null) {
            sortedSet = sortedSet.iterator();
            while (sortedSet.hasNext()) {
                nodeVisitor.visit((Comment)sortedSet.next());
            }
        }
    }
}

