/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable$ListToTreeSelectionModelWrapper;

class JTreeTable$ListToTreeSelectionModelWrapper$ListSelectionHandler
implements ListSelectionListener {
    final JTreeTable$ListToTreeSelectionModelWrapper this$1;

    JTreeTable$ListToTreeSelectionModelWrapper$ListSelectionHandler(JTreeTable$ListToTreeSelectionModelWrapper jTreeTable$ListToTreeSelectionModelWrapper) {
        this.this$1 = jTreeTable$ListToTreeSelectionModelWrapper;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        this.this$1.updateSelectedPathsFromSelectedRows();
    }
}

