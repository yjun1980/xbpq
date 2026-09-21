/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import java.util.Map;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.NodeTransformer;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.optimizer.OptFunctionNode;

class OptTransformer
extends NodeTransformer {
    private ObjArray directCallTargets;
    private Map<String, OptFunctionNode> possibleDirectCalls;

    OptTransformer(Map<String, OptFunctionNode> map, ObjArray objArray) {
        this.possibleDirectCalls = map;
        this.directCallTargets = objArray;
    }

    private void detectDirectCall(Node node, ScriptNode object) {
        block12: {
            if (((Node)object).getType() != 113) break block12;
            Node node2 = node.getFirstChild();
            int n2 = 0;
            int n3 = 0;
            if (node2 != null) {
                Node node3 = node2.getNext();
                while (true) {
                    n2 = n3++;
                    if (node3 == null) break;
                    node3 = node3.getNext();
                }
            }
            if (n2 == 0) {
                OptFunctionNode.get((ScriptNode)object).itsContainsCalls0 = true;
            }
            if (this.possibleDirectCalls != null) {
                object = null;
                if (node2.getType() == 39) {
                    object = node2.getString();
                } else if (node2.getType() == 33) {
                    object = node2.getFirstChild().getNext().getString();
                } else if (node2.getType() == 34) {
                    throw Kit.codeBug();
                }
                if (object != null && (object = this.possibleDirectCalls.get(object)) != null && n2 == ((OptFunctionNode)object).fnode.getParamCount() && !((OptFunctionNode)object).fnode.requiresActivation() && n2 <= 32) {
                    node.putProp(9, object);
                    if (!((OptFunctionNode)object).isTargetOfDirectCall()) {
                        n3 = this.directCallTargets.size();
                        this.directCallTargets.add(object);
                        ((OptFunctionNode)object).setDirectTargetIndex(n3);
                    }
                }
            }
        }
    }

    @Override
    protected void visitCall(Node node, ScriptNode scriptNode) {
        this.detectDirectCall(node, scriptNode);
        super.visitCall(node, scriptNode);
    }

    @Override
    protected void visitNew(Node node, ScriptNode scriptNode) {
        this.detectDirectCall(node, scriptNode);
        super.visitNew(node, scriptNode);
    }
}

