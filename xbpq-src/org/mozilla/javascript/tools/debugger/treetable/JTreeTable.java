/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.LookAndFeel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable$ListToTreeSelectionModelWrapper;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable$TreeTableCellEditor;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable$TreeTableCellRenderer;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModel;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter;

public class JTreeTable
extends JTable {
    private static final long serialVersionUID = -2103973006456695515L;
    protected JTreeTable$TreeTableCellRenderer tree;

    public JTreeTable(TreeTableModel object) {
        this.tree = new JTreeTable$TreeTableCellRenderer(this, (TreeModel)object);
        super.setModel(new TreeTableModelAdapter((TreeTableModel)object, this.tree));
        object = new JTreeTable$ListToTreeSelectionModelWrapper(this);
        this.tree.setSelectionModel((TreeSelectionModel)object);
        this.setSelectionModel(((JTreeTable$ListToTreeSelectionModelWrapper)object).getListSelectionModel());
        this.setDefaultRenderer(TreeTableModel.class, this.tree);
        this.setDefaultEditor(TreeTableModel.class, new JTreeTable$TreeTableCellEditor(this));
        this.setShowGrid(false);
        this.setIntercellSpacing(new Dimension(0, 0));
        if (this.tree.getRowHeight() < 1) {
            this.setRowHeight(18);
        }
    }

    @Override
    public int getEditingRow() {
        int n2 = this.getColumnClass(this.editingColumn) == TreeTableModel.class ? -1 : this.editingRow;
        return n2;
    }

    public JTree getTree() {
        return this.tree;
    }

    @Override
    public void setRowHeight(int n2) {
        super.setRowHeight(n2);
        JTreeTable$TreeTableCellRenderer jTreeTable$TreeTableCellRenderer = this.tree;
        if (jTreeTable$TreeTableCellRenderer != null && jTreeTable$TreeTableCellRenderer.getRowHeight() != n2) {
            this.tree.setRowHeight(this.getRowHeight());
        }
    }

    @Override
    public void updateUI() {
        super.updateUI();
        JTreeTable$TreeTableCellRenderer jTreeTable$TreeTableCellRenderer = this.tree;
        if (jTreeTable$TreeTableCellRenderer != null) {
            jTreeTable$TreeTableCellRenderer.updateUI();
        }
        LookAndFeel.installColorsAndFont(this, "Tree.background", "Tree.foreground", "Tree.font");
    }
}

