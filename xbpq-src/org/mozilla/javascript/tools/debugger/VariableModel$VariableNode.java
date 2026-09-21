/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import com.github.catvod.spider.merge.C.a;

class VariableModel$VariableNode {
    private VariableModel$VariableNode[] children;
    private Object id;
    private Object object;

    public VariableModel$VariableNode(Object object, Object object2) {
        this.object = object;
        this.id = object2;
    }

    static /* synthetic */ VariableModel$VariableNode[] access$000(VariableModel$VariableNode variableModel$VariableNode) {
        return variableModel$VariableNode.children;
    }

    static /* synthetic */ VariableModel$VariableNode[] access$002(VariableModel$VariableNode variableModel$VariableNode, VariableModel$VariableNode[] variableModel$VariableNodeArray) {
        variableModel$VariableNode.children = variableModel$VariableNodeArray;
        return variableModel$VariableNodeArray;
    }

    static /* synthetic */ Object access$100(VariableModel$VariableNode variableModel$VariableNode) {
        return variableModel$VariableNode.object;
    }

    static /* synthetic */ Object access$200(VariableModel$VariableNode variableModel$VariableNode) {
        return variableModel$VariableNode.id;
    }

    public String toString() {
        Object object = this.id;
        if (object instanceof String) {
            object = (String)object;
        } else {
            object = a.c("[");
            ((StringBuilder)object).append((Integer)this.id);
            ((StringBuilder)object).append("]");
            object = ((StringBuilder)object).toString();
        }
        return object;
    }
}

