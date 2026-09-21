/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ObjToIntMap$Iterator;
import org.mozilla.javascript.optimizer.Block;
import org.mozilla.javascript.optimizer.Block$1;

class Block$FatBlock {
    private ObjToIntMap predecessors;
    Block realBlock;
    private ObjToIntMap successors = new ObjToIntMap();

    private Block$FatBlock() {
        this.predecessors = new ObjToIntMap();
    }

    /* synthetic */ Block$FatBlock(Block$1 block$1) {
        this();
    }

    private static Block[] reduceToArray(ObjToIntMap blockArray) {
        if (!blockArray.isEmpty()) {
            Block[] blockArray2 = new Block[blockArray.size()];
            int n2 = 0;
            ObjToIntMap$Iterator objToIntMap$Iterator = blockArray.newIterator();
            objToIntMap$Iterator.start();
            while (true) {
                blockArray = blockArray2;
                if (!objToIntMap$Iterator.done()) {
                    blockArray2[n2] = ((Block$FatBlock)objToIntMap$Iterator.getKey()).realBlock;
                    objToIntMap$Iterator.next();
                    ++n2;
                    continue;
                }
                break;
            }
        } else {
            blockArray = null;
        }
        return blockArray;
    }

    void addPredecessor(Block$FatBlock block$FatBlock) {
        this.predecessors.put(block$FatBlock, 0);
    }

    void addSuccessor(Block$FatBlock block$FatBlock) {
        this.successors.put(block$FatBlock, 0);
    }

    Block[] getPredecessors() {
        return Block$FatBlock.reduceToArray(this.predecessors);
    }

    Block[] getSuccessors() {
        return Block$FatBlock.reduceToArray(this.successors);
    }
}

