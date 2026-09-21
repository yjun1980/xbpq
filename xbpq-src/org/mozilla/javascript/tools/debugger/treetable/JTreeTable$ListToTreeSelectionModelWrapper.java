/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable$ListToTreeSelectionModelWrapper$ListSelectionHandler;

public class JTreeTable$ListToTreeSelectionModelWrapper
extends DefaultTreeSelectionModel {
    private static final long serialVersionUID = 8168140829623071131L;
    final JTreeTable this$0;
    protected boolean updatingListSelectionModel;

    public JTreeTable$ListToTreeSelectionModelWrapper(JTreeTable jTreeTable) {
        this.this$0 = jTreeTable;
        this.getListSelectionModel().addListSelectionListener(this.createListSelectionListener());
    }

    protected ListSelectionListener createListSelectionListener() {
        return new JTreeTable$ListToTreeSelectionModelWrapper$ListSelectionHandler(this);
    }

    public ListSelectionModel getListSelectionModel() {
        return this.listSelectionModel;
    }

    @Override
    public void resetRowSelection() {
        if (!this.updatingListSelectionModel) {
            this.updatingListSelectionModel = true;
            try {
                super.resetRowSelection();
            }
            finally {
                this.updatingListSelectionModel = false;
            }
        }
    }

    protected void updateSelectedPathsFromSelectedRows() {
        if (!this.updatingListSelectionModel) {
            block6: {
                int n2;
                int n3;
                this.updatingListSelectionModel = true;
                try {
                    n3 = this.listSelectionModel.getMaxSelectionIndex();
                    this.clearSelection();
                    if (n2 == -1 || n3 == -1) break block6;
                }
                catch (Throwable throwable) {
                    this.updatingListSelectionModel = false;
                    throw throwable;
                }
                for (n2 = this.listSelectionModel.getMinSelectionIndex(); n2 <= n3; ++n2) {
                    TreePath treePath;
                    if (!this.listSelectionModel.isSelectedIndex(n2) || (treePath = this.this$0.tree.getPathForRow(n2)) == null) continue;
                    this.addSelectionPath(treePath);
                }
            }
            this.updatingListSelectionModel = false;
        }
    }
}

