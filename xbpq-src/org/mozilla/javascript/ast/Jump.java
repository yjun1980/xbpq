/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NodeVisitor;

public class Jump
extends AstNode {
    private Jump jumpNode;
    public Node target;
    private Node target2;

    public Jump() {
        this.type = -1;
    }

    public Jump(int n2) {
        this.type = n2;
    }

    public Jump(int n2, int n3) {
        this(n2);
        this.setLineno(n3);
    }

    public Jump(int n2, Node node) {
        this(n2);
        this.addChildToBack(node);
    }

    public Jump(int n2, Node node, int n3) {
        this(n2, node);
        this.setLineno(n3);
    }

    public Node getContinue() {
        if (this.type != 136) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Node getDefault() {
        if (this.type != 118) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Node getFinally() {
        if (this.type != 84) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Jump getJumpStatement() {
        int n2 = this.type;
        if (n2 != 124 && n2 != 125) {
            AstNode.codeBug();
        }
        return this.jumpNode;
    }

    public Jump getLoop() {
        if (this.type != 134) {
            AstNode.codeBug();
        }
        return this.jumpNode;
    }

    public void setContinue(Node node) {
        if (this.type != 136) {
            AstNode.codeBug();
        }
        if (node.getType() != 135) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setDefault(Node node) {
        if (this.type != 118) {
            AstNode.codeBug();
        }
        if (node.getType() != 135) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setFinally(Node node) {
        if (this.type != 84) {
            AstNode.codeBug();
        }
        if (node.getType() != 135) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setJumpStatement(Jump jump) {
        int n2 = this.type;
        if (n2 != 124 && n2 != 125) {
            AstNode.codeBug();
        }
        if (jump == null) {
            AstNode.codeBug();
        }
        if (this.jumpNode != null) {
            AstNode.codeBug();
        }
        this.jumpNode = jump;
    }

    public void setLoop(Jump jump) {
        if (this.type != 134) {
            AstNode.codeBug();
        }
        if (jump == null) {
            AstNode.codeBug();
        }
        if (this.jumpNode != null) {
            AstNode.codeBug();
        }
        this.jumpNode = jump;
    }

    @Override
    public String toSource(int n2) {
        throw new UnsupportedOperationException(this.toString());
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        throw new UnsupportedOperationException(this.toString());
    }
}

