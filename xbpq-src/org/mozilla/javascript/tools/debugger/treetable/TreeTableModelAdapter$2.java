/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter;

class TreeTableModelAdapter$2
implements TreeModelListener {
    final TreeTableModelAdapter this$0;

    TreeTableModelAdapter$2(TreeTableModelAdapter treeTableModelAdapter) {
        this.this$0 = treeTableModelAdapter;
    }

    @Override
    public void treeNodesChanged(TreeModelEvent treeModelEvent) {
        this.this$0.delayedFireTableDataChanged();
    }

    @Override
    public void treeNodesInserted(TreeModelEvent treeModelEvent) {
        this.this$0.delayedFireTableDataChanged();
    }

    @Override
    public void treeNodesRemoved(TreeModelEvent treeModelEvent) {
        this.this$0.delayedFireTableDataChanged();
    }

    @Override
    public void treeStructureChanged(TreeModelEvent treeModelEvent) {
        this.this$0.delayedFireTableDataChanged();
    }
}

