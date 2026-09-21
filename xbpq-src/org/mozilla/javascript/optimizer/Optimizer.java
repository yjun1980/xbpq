/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import org.mozilla.javascript.Node;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.optimizer.Block;
import org.mozilla.javascript.optimizer.OptFunctionNode;

class Optimizer {
    static final int AnyType = 3;
    static final int NoType = 0;
    static final int NumberType = 1;
    private boolean inDirectCallFunction;
    private boolean parameterUsedInNumberContext;
    OptFunctionNode theFunction;

    Optimizer() {
    }

    private static void buildStatementList_r(Node node, ObjArray objArray) {
        int n2 = node.getType();
        if (n2 != 133 && n2 != 145 && n2 != 136 && n2 != 113) {
            objArray.add(node);
        } else {
            for (node = node.getFirstChild(); node != null; node = node.getNext()) {
                Optimizer.buildStatementList_r(node, objArray);
            }
        }
    }

    private boolean convertParameter(Node node) {
        int n2;
        if (this.inDirectCallFunction && node.getType() == 55 && this.theFunction.isParameter(n2 = this.theFunction.getVarIndex(node))) {
            node.removeProp(8);
            return true;
        }
        return false;
    }

    private void markDCPNumberContext(Node node) {
        int n2;
        if (this.inDirectCallFunction && node.getType() == 55 && this.theFunction.isParameter(n2 = this.theFunction.getVarIndex(node))) {
            this.parameterUsedInNumberContext = true;
        }
    }

    private void optimizeFunction(OptFunctionNode optFunctionNode) {
        if (optFunctionNode.fnode.requiresActivation()) {
            return;
        }
        this.inDirectCallFunction = optFunctionNode.isTargetOfDirectCall();
        this.theFunction = optFunctionNode;
        ObjArray objArray = new ObjArray();
        Optimizer.buildStatementList_r(optFunctionNode.fnode, objArray);
        int n2 = objArray.size();
        Object[] objectArray = new Node[n2];
        objArray.toArray(objectArray);
        Block.runFlowAnalyzes(optFunctionNode, (Node[])objectArray);
        if (!optFunctionNode.fnode.requiresActivation()) {
            this.parameterUsedInNumberContext = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.rewriteForNumberVariables((Node)objectArray[i2], 1);
            }
            optFunctionNode.setParameterNumberContext(this.parameterUsedInNumberContext);
        }
    }

    private void rewriteAsObjectChildren(Node node, Node node2) {
        while (node2 != null) {
            Node node3 = node2.getNext();
            if (this.rewriteForNumberVariables(node2, 0) == 1 && !this.convertParameter(node2)) {
                node.removeChild(node2);
                node2 = new Node(153, node2);
                if (node3 == null) {
                    node.addChildToBack(node2);
                } else {
                    node.addChildBefore(node2, node3);
                }
            }
            node2 = node3;
        }
    }

    /*
     * Exception decompiling
     */
    private int rewriteForNumberVariables(Node var1_1, int var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void optimize(ScriptNode scriptNode) {
        int n2 = scriptNode.getFunctionCount();
        for (int i2 = 0; i2 != n2; ++i2) {
            this.optimizeFunction(OptFunctionNode.get(scriptNode, i2));
        }
    }
}

