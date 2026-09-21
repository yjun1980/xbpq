/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeModel;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable;

public class JTreeTable$TreeTableCellRenderer
extends JTree
implements TableCellRenderer {
    private static final long serialVersionUID = -193867880014600717L;
    final JTreeTable this$0;
    protected int visibleRow;

    public JTreeTable$TreeTableCellRenderer(JTreeTable jTreeTable, TreeModel treeModel) {
        this.this$0 = jTreeTable;
        super(treeModel);
        this.setBorder(null);
    }

    @Override
    public Component getTableCellRendererComponent(JTable serializable, Object object, boolean bl, boolean bl2, int n2, int n3) {
        serializable = bl ? serializable.getSelectionBackground() : serializable.getBackground();
        this.setBackground((Color)serializable);
        this.visibleRow = n2;
        return this;
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.translate(0, -this.visibleRow * this.getRowHeight());
        super.paint(graphics);
    }

    @Override
    public void setBounds(int n2, int n3, int n4, int n5) {
        super.setBounds(n2, 0, n4, this.this$0.getHeight());
    }

    @Override
    public void setRowHeight(int n2) {
        if (n2 > 0) {
            super.setRowHeight(n2);
            if (this.this$0.getRowHeight() != n2) {
                this.this$0.setRowHeight(this.getRowHeight());
            }
        }
    }

    @Override
    public void updateUI() {
        super.updateUI();
        TreeCellRenderer treeCellRenderer = this.getCellRenderer();
        if (treeCellRenderer instanceof DefaultTreeCellRenderer) {
            treeCellRenderer = (DefaultTreeCellRenderer)treeCellRenderer;
            ((DefaultTreeCellRenderer)treeCellRenderer).setTextSelectionColor(UIManager.getColor("Table.selectionForeground"));
            ((DefaultTreeCellRenderer)treeCellRenderer).setBackgroundSelectionColor(UIManager.getColor("Table.selectionBackground"));
        }
    }
}

