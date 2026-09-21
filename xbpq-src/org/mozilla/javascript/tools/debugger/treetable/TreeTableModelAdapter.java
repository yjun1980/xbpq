/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModel;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter$1;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter$2;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter$3;

public class TreeTableModelAdapter
extends AbstractTableModel {
    private static final long serialVersionUID = 48741114609209052L;
    JTree tree;
    TreeTableModel treeTableModel;

    public TreeTableModelAdapter(TreeTableModel treeTableModel, JTree jTree) {
        this.tree = jTree;
        this.treeTableModel = treeTableModel;
        jTree.addTreeExpansionListener(new TreeTableModelAdapter$1(this));
        treeTableModel.addTreeModelListener(new TreeTableModelAdapter$2(this));
    }

    protected void delayedFireTableDataChanged() {
        SwingUtilities.invokeLater(new TreeTableModelAdapter$3(this));
    }

    @Override
    public Class<?> getColumnClass(int n2) {
        return this.treeTableModel.getColumnClass(n2);
    }

    @Override
    public int getColumnCount() {
        return this.treeTableModel.getColumnCount();
    }

    @Override
    public String getColumnName(int n2) {
        return this.treeTableModel.getColumnName(n2);
    }

    @Override
    public int getRowCount() {
        return this.tree.getRowCount();
    }

    @Override
    public Object getValueAt(int n2, int n3) {
        return this.treeTableModel.getValueAt(this.nodeForRow(n2), n3);
    }

    @Override
    public boolean isCellEditable(int n2, int n3) {
        return this.treeTableModel.isCellEditable(this.nodeForRow(n2), n3);
    }

    protected Object nodeForRow(int n2) {
        return this.tree.getPathForRow(n2).getLastPathComponent();
    }

    @Override
    public void setValueAt(Object object, int n2, int n3) {
        this.treeTableModel.setValueAt(object, this.nodeForRow(n2), n3);
    }
}

