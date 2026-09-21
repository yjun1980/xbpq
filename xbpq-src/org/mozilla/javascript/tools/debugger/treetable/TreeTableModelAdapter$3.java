/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter;

class TreeTableModelAdapter$3
implements Runnable {
    final TreeTableModelAdapter this$0;

    TreeTableModelAdapter$3(TreeTableModelAdapter treeTableModelAdapter) {
        this.this$0 = treeTableModelAdapter;
    }

    @Override
    public void run() {
        this.this$0.fireTableDataChanged();
    }
}

