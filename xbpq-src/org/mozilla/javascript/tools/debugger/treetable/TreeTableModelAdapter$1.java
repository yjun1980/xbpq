/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter;

class TreeTableModelAdapter$1
implements TreeExpansionListener {
    final TreeTableModelAdapter this$0;

    TreeTableModelAdapter$1(TreeTableModelAdapter treeTableModelAdapter) {
        this.this$0 = treeTableModelAdapter;
    }

    @Override
    public void treeCollapsed(TreeExpansionEvent treeExpansionEvent) {
        this.this$0.fireTableDataChanged();
    }

    @Override
    public void treeExpanded(TreeExpansionEvent treeExpansionEvent) {
        this.this$0.fireTableDataChanged();
    }
}

