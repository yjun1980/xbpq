/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import java.util.BitSet;
import java.util.HashMap;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.optimizer.Block$FatBlock;
import org.mozilla.javascript.optimizer.OptFunctionNode;

class Block {
    static final boolean DEBUG = false;
    private static int debug_blockCount;
    private int itsBlockID;
    private int itsEndNodeIndex;
    private BitSet itsLiveOnEntrySet;
    private BitSet itsLiveOnExitSet;
    private BitSet itsNotDefSet;
    private Block[] itsPredecessors;
    private int itsStartNodeIndex;
    private Block[] itsSuccessors;
    private BitSet itsUseBeforeDefSet;

    Block(int n2, int n3) {
        this.itsStartNodeIndex = n2;
        this.itsEndNodeIndex = n3;
    }

    private static boolean assignType(int[] nArray, int n2, int n3) {
        int n4 = nArray[n2];
        nArray[n2] = n3 |= nArray[n2];
        boolean bl = n4 != n3;
        return bl;
    }

    private static Block[] buildBlocks(Node[] object) {
        Object object2;
        int n2;
        int n3;
        Object object3 = new HashMap<Node, Block[]>();
        ObjArray objArray = new ObjArray();
        int n4 = 0;
        int n5 = 0;
        for (n3 = 0; n3 < ((Node[])object).length; ++n3) {
            n2 = object[n3].getType();
            if (n2 != 5 && n2 != 6 && n2 != 7) {
                if (n2 != 135) {
                    n2 = n5;
                } else {
                    n2 = n5;
                    if (n3 != n5) {
                        object2 = Block.newFatBlock(n5, n3 - 1);
                        if (object[n5].getType() == 135) {
                            ((HashMap)object3).put(object[n5], object2);
                        }
                        objArray.add(object2);
                        n2 = n3;
                    }
                }
            } else {
                object2 = Block.newFatBlock(n5, n3);
                if (object[n5].getType() == 135) {
                    ((HashMap)object3).put(object[n5], object2);
                }
                objArray.add(object2);
                n2 = n3 + 1;
            }
            n5 = n2;
        }
        if (n5 != ((Node[])object).length) {
            object2 = Block.newFatBlock(n5, ((Node[])object).length - 1);
            if (object[n5].getType() == 135) {
                ((HashMap)object3).put(object[n5], object2);
            }
            objArray.add(object2);
        }
        for (n3 = 0; n3 < objArray.size(); ++n3) {
            Object object4;
            object2 = (Block$FatBlock)objArray.get(n3);
            Object object5 = object[((Block$FatBlock)object2).realBlock.itsEndNodeIndex];
            n2 = ((Node)object5).getType();
            if (n2 != 5 && n3 < objArray.size() - 1) {
                object4 = (Block$FatBlock)objArray.get(n3 + 1);
                ((Block$FatBlock)object2).addSuccessor((Block$FatBlock)object4);
                ((Block$FatBlock)object4).addPredecessor((Block$FatBlock)object2);
            }
            if (n2 != 7 && n2 != 6 && n2 != 5) continue;
            object4 = ((Jump)object5).target;
            object5 = (Block$FatBlock)((HashMap)object3).get(object4);
            ((Node)object4).putProp(6, ((Block$FatBlock)object5).realBlock);
            ((Block$FatBlock)object2).addSuccessor((Block$FatBlock)object5);
            ((Block$FatBlock)object5).addPredecessor((Block$FatBlock)object2);
        }
        object2 = new Block[objArray.size()];
        for (n3 = n4; n3 < objArray.size(); ++n3) {
            object3 = (Block$FatBlock)objArray.get(n3);
            object = ((Block$FatBlock)object3).realBlock;
            object.itsSuccessors = ((Block$FatBlock)object3).getSuccessors();
            object.itsPredecessors = ((Block$FatBlock)object3).getPredecessors();
            object.itsBlockID = n3;
            object2[n3] = object;
        }
        return object2;
    }

    private boolean doReachedUseDataFlow() {
        this.itsLiveOnExitSet.clear();
        Block[] blockArray = this.itsSuccessors;
        if (blockArray != null) {
            for (Block block : blockArray) {
                this.itsLiveOnExitSet.or(block.itsLiveOnEntrySet);
            }
        }
        return Block.updateEntrySet(this.itsLiveOnEntrySet, this.itsLiveOnExitSet, this.itsUseBeforeDefSet, this.itsNotDefSet);
    }

    private boolean doTypeFlow(OptFunctionNode optFunctionNode, Node[] nodeArray, int[] nArray) {
        boolean bl = false;
        for (int i2 = this.itsStartNodeIndex; i2 <= this.itsEndNodeIndex; ++i2) {
            Node node = nodeArray[i2];
            boolean bl2 = bl;
            if (node != null) {
                bl2 = bl | Block.findDefPoints(optFunctionNode, node, nArray);
            }
            bl = bl2;
        }
        return bl;
    }

    private static boolean findDefPoints(OptFunctionNode optFunctionNode, Node node, int[] nArray) {
        boolean bl;
        block11: {
            int n2;
            int n3;
            boolean bl2;
            block12: {
                Node node2;
                block10: {
                    node2 = node.getFirstChild();
                    bl2 = false;
                    for (Node node3 = node2; node3 != null; node3 = node3.getNext()) {
                        bl2 |= Block.findDefPoints(optFunctionNode, node3, nArray);
                    }
                    n3 = node.getType();
                    if (n3 == 56 || n3 == 160) break block10;
                    if (n3 != 110 && n3 != 111) {
                        bl = bl2;
                    } else {
                        bl = bl2;
                        if (node2.getType() == 55) {
                            n3 = optFunctionNode.getVarIndex(node2);
                            bl = bl2;
                            if (!optFunctionNode.fnode.getParamAndVarConst()[n3]) {
                                bl = Block.assignType(nArray, n3, 1) | bl2;
                            }
                        }
                    }
                    break block11;
                }
                n3 = Block.findExpressionType(optFunctionNode, node2.getNext(), nArray);
                n2 = optFunctionNode.getVarIndex(node);
                if (node.getType() != 56) break block12;
                bl = bl2;
                if (optFunctionNode.fnode.getParamAndVarConst()[n2]) break block11;
            }
            bl = bl2 | Block.assignType(nArray, n2, n3);
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    private static int findExpressionType(OptFunctionNode var0, Node var1_2, int[] var2_3) {
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

    private void initLiveOnEntrySets(OptFunctionNode optFunctionNode, Node[] nodeArray) {
        int n2 = optFunctionNode.getVarCount();
        this.itsUseBeforeDefSet = new BitSet(n2);
        this.itsNotDefSet = new BitSet(n2);
        this.itsLiveOnEntrySet = new BitSet(n2);
        this.itsLiveOnExitSet = new BitSet(n2);
        for (int i2 = this.itsStartNodeIndex; i2 <= this.itsEndNodeIndex; ++i2) {
            this.lookForVariableAccess(optFunctionNode, nodeArray[i2]);
        }
        this.itsNotDefSet.flip(0, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lookForVariableAccess(OptFunctionNode object, Node node) {
        int n2;
        block9: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            block7: {
                                n2 = node.getType();
                                if (n2 == 55) break block4;
                                if (n2 == 56) break block5;
                                if (n2 == 110 || n2 == 111) break block6;
                                if (n2 == 141) break block7;
                                if (n2 != 160) {
                                    node = node.getFirstChild();
                                    while (node != null) {
                                        this.lookForVariableAccess((OptFunctionNode)object, node);
                                        node = node.getNext();
                                    }
                                    return;
                                }
                                break block5;
                            }
                            n2 = ((OptFunctionNode)object).fnode.getIndexForNameNode(node);
                            if (n2 <= -1) return;
                            if (this.itsNotDefSet.get(n2)) return;
                            break block8;
                        }
                        if ((node = node.getFirstChild()).getType() != 55) {
                            this.lookForVariableAccess((OptFunctionNode)object, node);
                            return;
                        }
                        n2 = ((OptFunctionNode)object).getVarIndex(node);
                        if (!this.itsNotDefSet.get(n2)) {
                            this.itsUseBeforeDefSet.set(n2);
                        }
                        object = this.itsNotDefSet;
                        break block9;
                    }
                    this.lookForVariableAccess((OptFunctionNode)object, node.getFirstChild().getNext());
                    this.itsNotDefSet.set(((OptFunctionNode)object).getVarIndex(node));
                    return;
                }
                n2 = ((OptFunctionNode)object).getVarIndex(node);
                if (this.itsNotDefSet.get(n2)) return;
            }
            object = this.itsUseBeforeDefSet;
        }
        ((BitSet)object).set(n2);
    }

    private void markAnyTypeVariables(int[] nArray) {
        for (int i2 = 0; i2 != nArray.length; ++i2) {
            if (!this.itsLiveOnEntrySet.get(i2)) continue;
            Block.assignType(nArray, i2, 3);
        }
    }

    private static Block$FatBlock newFatBlock(int n2, int n3) {
        Block$FatBlock block$FatBlock = new Block$FatBlock(null);
        block$FatBlock.realBlock = new Block(n2, n3);
        return block$FatBlock;
    }

    private void printLiveOnEntrySet(OptFunctionNode optFunctionNode) {
    }

    private static void reachingDefDataFlow(OptFunctionNode object, Node[] objectArray, Block[] blockArray, int[] nArray) {
        int n2;
        int n3 = blockArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            blockArray[n2].initLiveOnEntrySets((OptFunctionNode)object, (Node[])objectArray);
        }
        object = new boolean[blockArray.length];
        objectArray = new boolean[blockArray.length];
        n3 = blockArray.length - 1;
        object[n3] = true;
        block1: while (true) {
            n2 = 0;
            while (true) {
                int n4;
                block12: {
                    block11: {
                        if (object[n3] != false) break block11;
                        n4 = n2;
                        if (objectArray[n3] != false) break block12;
                    }
                    objectArray[n3] = (Node)true;
                    object[n3] = false;
                    n4 = n2;
                    if (blockArray[n3].doReachedUseDataFlow()) {
                        Block[] blockArray2 = blockArray[n3].itsPredecessors;
                        n4 = n2;
                        if (blockArray2 != null) {
                            int n5 = blockArray2.length;
                            int n6 = 0;
                            while (true) {
                                n4 = n2;
                                if (n6 >= n5) break;
                                n4 = blockArray2[n6].itsBlockID;
                                object[n4] = true;
                                n4 = n4 > n3 ? 1 : 0;
                                n2 |= n4;
                                ++n6;
                            }
                        }
                    }
                }
                if (n3 == 0) {
                    if (n4 != 0) {
                        n3 = blockArray.length - 1;
                        continue block1;
                    }
                    blockArray[0].markAnyTypeVariables(nArray);
                    return;
                }
                --n3;
                n2 = n4;
            }
            break;
        }
    }

    static void runFlowAnalyzes(OptFunctionNode optFunctionNode, Node[] nodeArray) {
        int n2;
        int n3 = optFunctionNode.fnode.getParamCount();
        int n4 = optFunctionNode.fnode.getParamAndVarCount();
        int[] nArray = new int[n4];
        for (n2 = 0; n2 != n3; ++n2) {
            nArray[n2] = 3;
        }
        for (n2 = n3; n2 != n4; ++n2) {
            nArray[n2] = 0;
        }
        Block[] blockArray = Block.buildBlocks(nodeArray);
        Block.reachingDefDataFlow(optFunctionNode, nodeArray, blockArray, nArray);
        Block.typeFlow(optFunctionNode, nodeArray, blockArray, nArray);
        while (n3 != n4) {
            if (nArray[n3] == 1) {
                optFunctionNode.setIsNumberVar(n3);
            }
            ++n3;
        }
    }

    private static String toString(Block[] blockArray, Node[] nodeArray) {
        return null;
    }

    private static void typeFlow(OptFunctionNode optFunctionNode, Node[] nodeArray, Block[] blockArray, int[] nArray) {
        boolean[] blArray = new boolean[blockArray.length];
        boolean[] blArray2 = new boolean[blockArray.length];
        blArray[0] = true;
        block0: while (true) {
            int n2 = 0;
            int n3 = 0;
            while (true) {
                int n4;
                block10: {
                    block9: {
                        if (blArray[n2]) break block9;
                        n4 = n3;
                        if (blArray2[n2]) break block10;
                    }
                    blArray2[n2] = true;
                    blArray[n2] = false;
                    n4 = n3;
                    if (blockArray[n2].doTypeFlow(optFunctionNode, nodeArray, nArray)) {
                        Block[] blockArray2 = blockArray[n2].itsSuccessors;
                        n4 = n3;
                        if (blockArray2 != null) {
                            int n5 = blockArray2.length;
                            int n6 = 0;
                            while (true) {
                                n4 = n3;
                                if (n6 >= n5) break;
                                n4 = blockArray2[n6].itsBlockID;
                                blArray[n4] = true;
                                n4 = n4 < n2 ? 1 : 0;
                                n3 |= n4;
                                ++n6;
                            }
                        }
                    }
                }
                if (n2 == blockArray.length - 1) {
                    if (n4 != 0) continue block0;
                    return;
                }
                ++n2;
                n3 = n4;
            }
            break;
        }
    }

    private static boolean updateEntrySet(BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4) {
        int n2 = bitSet.cardinality();
        bitSet.or(bitSet2);
        bitSet.and(bitSet4);
        bitSet.or(bitSet3);
        boolean bl = bitSet.cardinality() != n2;
        return bl;
    }
}

