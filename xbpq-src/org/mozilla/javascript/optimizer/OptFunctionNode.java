/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.ScriptNode;

public final class OptFunctionNode {
    private int directTargetIndex = -1;
    public final FunctionNode fnode;
    boolean itsContainsCalls0;
    boolean itsContainsCalls1;
    private boolean itsParameterNumberContext;
    private boolean[] numberVarFlags;

    OptFunctionNode(FunctionNode functionNode) {
        this.fnode = functionNode;
        functionNode.setCompilerData(this);
    }

    public static OptFunctionNode get(ScriptNode scriptNode) {
        return (OptFunctionNode)scriptNode.getCompilerData();
    }

    public static OptFunctionNode get(ScriptNode scriptNode, int n2) {
        return (OptFunctionNode)scriptNode.getFunctionNode(n2).getCompilerData();
    }

    public int getDirectTargetIndex() {
        return this.directTargetIndex;
    }

    public boolean getParameterNumberContext() {
        return this.itsParameterNumberContext;
    }

    public int getVarCount() {
        return this.fnode.getParamAndVarCount();
    }

    public int getVarIndex(Node node) {
        int n2;
        int n3 = n2 = node.getIntProp(7, -1);
        if (n2 == -1) {
            Node node2;
            n3 = node.getType();
            if (n3 == 55) {
                node2 = node;
            } else {
                if (n3 != 56 && n3 != 160) {
                    throw Kit.codeBug();
                }
                node2 = node.getFirstChild();
            }
            n3 = this.fnode.getIndexForNameNode(node2);
            if (n3 >= 0) {
                node.putIntProp(7, n3);
            } else {
                throw Kit.codeBug();
            }
        }
        return n3;
    }

    public boolean isNumberVar(int n2) {
        boolean[] blArray;
        if ((n2 -= this.fnode.getParamCount()) >= 0 && (blArray = this.numberVarFlags) != null) {
            return blArray[n2];
        }
        return false;
    }

    public boolean isParameter(int n2) {
        boolean bl = n2 < this.fnode.getParamCount();
        return bl;
    }

    public boolean isTargetOfDirectCall() {
        boolean bl = this.directTargetIndex >= 0;
        return bl;
    }

    void setDirectTargetIndex(int n2) {
        if (n2 < 0 || this.directTargetIndex >= 0) {
            Kit.codeBug();
        }
        this.directTargetIndex = n2;
    }

    void setIsNumberVar(int n2) {
        if ((n2 -= this.fnode.getParamCount()) < 0) {
            Kit.codeBug();
        }
        if (this.numberVarFlags == null) {
            this.numberVarFlags = new boolean[this.fnode.getParamAndVarCount() - this.fnode.getParamCount()];
        }
        this.numberVarFlags[n2] = true;
    }

    void setParameterNumberContext(boolean bl) {
        this.itsParameterNumberContext = bl;
    }
}

