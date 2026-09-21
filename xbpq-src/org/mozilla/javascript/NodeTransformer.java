/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;

public class NodeTransformer {
    private boolean hasFinally;
    private ObjArray loopEnds;
    private ObjArray loops;

    private static Node addBeforeCurrent(Node node, Node node2, Node node3, Node node4) {
        if (node2 == null) {
            if (node3 != node.getFirstChild()) {
                Kit.codeBug();
            }
            node.addChildToFront(node4);
        } else {
            if (node3 != node2.getNext()) {
                Kit.codeBug();
            }
            node.addChildAfter(node4, node2);
        }
        return node4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Node replaceCurrent(Node node, Node node2, Node node3, Node node4) {
        if (node2 == null) {
            if (node3 != node.getFirstChild()) {
                Kit.codeBug();
            }
        } else if (node2.next == node3) {
            node.replaceChildAfter(node2, node4);
            return node4;
        }
        node.replaceChild(node3, node4);
        return node4;
    }

    private void transformCompilationUnit(ScriptNode scriptNode, boolean bl) {
        this.loops = new ObjArray();
        this.loopEnds = new ObjArray();
        this.hasFinally = false;
        boolean bl2 = scriptNode.getType() != 113 || ((FunctionNode)scriptNode).requiresActivation();
        scriptNode.flattenSymbolTable(bl2 ^ true);
        this.transformCompilationUnit_r(scriptNode, scriptNode, scriptNode, bl2, bl);
    }

    /*
     * Exception decompiling
     */
    private void transformCompilationUnit_r(ScriptNode var1_1, Node var2_2, Scope var3_3, boolean var4_4, boolean var5_5) {
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

    public final void transform(ScriptNode scriptNode, CompilerEnvirons compilerEnvirons) {
        this.transform(scriptNode, false, compilerEnvirons);
    }

    public final void transform(ScriptNode scriptNode, boolean bl, CompilerEnvirons compilerEnvirons) {
        boolean bl2 = bl;
        if (compilerEnvirons.getLanguageVersion() >= 200) {
            bl2 = bl;
            if (scriptNode.isInStrictMode()) {
                bl2 = true;
            }
        }
        this.transformCompilationUnit(scriptNode, bl2);
        for (int i2 = 0; i2 != scriptNode.getFunctionCount(); ++i2) {
            this.transform(scriptNode.getFunctionNode(i2), bl2, compilerEnvirons);
        }
    }

    protected void visitCall(Node node, ScriptNode scriptNode) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected Node visitLet(boolean bl, Node node, Node node2, Node node3) {
        Node node4;
        Iterable<Node> iterable = node3.getFirstChild();
        Node node5 = ((Node)iterable).getNext();
        node3.removeChild((Node)iterable);
        node3.removeChild(node5);
        boolean bl2 = node3.getType() == 162;
        if (bl) {
            int n2 = bl2 ? 163 : 133;
            node4 = new Node(n2);
            node4 = NodeTransformer.replaceCurrent(node, node2, node3, node4);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Node node6 = new Node(67);
            node2 = node5;
            for (node = ((Node)iterable).getFirstChild(); node != null; node = node.getNext()) {
                if (node.getType() == 162) {
                    iterable = (List)node.getProp(22);
                    node3 = node.getFirstChild();
                    if (node3.getType() != 157) throw Kit.codeBug();
                    node5 = bl2 ? new Node(92, node3.getNext(), node2) : new Node(133, new Node(137, node3.getNext()), node2);
                    if (iterable != null) {
                        arrayList.addAll((Collection<Object>)iterable);
                        for (n2 = 0; n2 < iterable.size(); ++n2) {
                            node6.addChildToBack(new Node(130, Node.newNumber(0.0)));
                        }
                    }
                    node3 = node3.getFirstChild();
                    node2 = node5;
                } else {
                    node3 = node;
                }
                if (node3.getType() != 39) throw Kit.codeBug();
                arrayList.add(ScriptRuntime.getIndexObject(node3.getString()));
                node3 = node5 = node3.getFirstChild();
                if (node5 == null) {
                    node3 = new Node(130, Node.newNumber(0.0));
                }
                node6.addChildToBack(node3);
            }
            node6.putProp(12, arrayList.toArray());
            node4.addChildToBack(new Node(2, node6));
            node4.addChildToBack(new Node(127, node2));
            node4.addChildToBack(new Node(3));
            return node4;
        }
        int n3 = bl2 ? 92 : 133;
        node4 = new Node(n3);
        node4 = NodeTransformer.replaceCurrent(node, node2, node3, node4);
        Node node7 = new Node(92);
        node2 = node5;
        for (node = ((Node)iterable).getFirstChild(); node != null; node = node.getNext()) {
            Node node8;
            if (node.getType() == 162) {
                node5 = node.getFirstChild();
                if (node5.getType() != 157) throw Kit.codeBug();
                node8 = bl2 ? new Node(92, node5.getNext(), node2) : new Node(133, new Node(137, node5.getNext()), node2);
                Scope.joinScopes((Scope)node, (Scope)node3);
                node5 = node5.getFirstChild();
                node2 = node8;
            } else {
                node5 = node;
            }
            if (node5.getType() != 39) throw Kit.codeBug();
            iterable = Node.newString(node5.getString());
            ((Node)iterable).setScope((Scope)node3);
            node5 = node8 = node5.getFirstChild();
            if (node8 == null) {
                node5 = new Node(130, Node.newNumber(0.0));
            }
            node7.addChildToBack(new Node(56, (Node)iterable, node5));
        }
        if (bl2) {
            node4.addChildToBack(node7);
            node3.setType(92);
            node4.addChildToBack(node3);
            node3.addChildToBack(node2);
            node = node4;
            if (!(node2 instanceof Scope)) return node;
        } else {
            node4.addChildToBack(new Node(137, node7));
            node3.setType(133);
            node4.addChildToBack(node3);
            node3.addChildrenToBack(node2);
            node = node4;
            if (!(node2 instanceof Scope)) return node;
        }
        node2 = (Scope)node2;
        node = ((Scope)node2).getParentScope();
        node3 = (Scope)node3;
        ((Scope)node2).setParentScope((Scope)node3);
        ((Scope)node3).setParentScope((Scope)node);
        return node4;
    }

    protected void visitNew(Node node, ScriptNode scriptNode) {
    }
}

