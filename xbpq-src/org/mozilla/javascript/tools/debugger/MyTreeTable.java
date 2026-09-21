/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.AWTEvent;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;
import org.mozilla.javascript.tools.debugger.VariableModel;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable$ListToTreeSelectionModelWrapper;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable$TreeTableCellEditor;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable$TreeTableCellRenderer;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModel;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter;

class MyTreeTable
extends JTreeTable {
    private static final long serialVersionUID = 3457265548184453049L;

    public MyTreeTable(VariableModel variableModel) {
        super(variableModel);
    }

    public boolean isCellEditable(EventObject eventObject) {
        if (eventObject instanceof MouseEvent) {
            MouseEvent mouseEvent = (MouseEvent)eventObject;
            if (mouseEvent.getButton() == 1 && mouseEvent.getModifiersEx() == 0) {
                int n2 = this.rowAtPoint(mouseEvent.getPoint());
                for (int i2 = this.getColumnCount() - 1; i2 >= 0; --i2) {
                    if (TreeTableModel.class != this.getColumnClass(i2)) continue;
                    eventObject = new MouseEvent(this.tree, mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), mouseEvent.getX() - this.getCellRect((int)n2, (int)i2, (boolean)true).x, mouseEvent.getY(), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
                    this.tree.dispatchEvent((AWTEvent)eventObject);
                    break;
                }
            }
            return mouseEvent.getClickCount() >= 3;
        }
        return eventObject == null;
    }

    public JTree resetTree(TreeTableModel object) {
        this.tree = new JTreeTable$TreeTableCellRenderer(this, (TreeModel)object);
        super.setModel(new TreeTableModelAdapter((TreeTableModel)object, this.tree));
        object = new JTreeTable$ListToTreeSelectionModelWrapper(this);
        this.tree.setSelectionModel((TreeSelectionModel)object);
        this.setSelectionModel(((JTreeTable$ListToTreeSelectionModelWrapper)object).getListSelectionModel());
        if (this.tree.getRowHeight() < 1) {
            this.setRowHeight(18);
        } else if (this.tree.getRowHeight() != this.getRowHeight()) {
            this.tree.setRowHeight(this.getRowHeight());
        }
        this.setDefaultRenderer(TreeTableModel.class, this.tree);
        this.setDefaultEditor(TreeTableModel.class, new JTreeTable$TreeTableCellEditor(this));
        this.setShowGrid(true);
        this.setIntercellSpacing(new Dimension(1, 1));
        this.tree.setRootVisible(false);
        this.tree.setShowsRootHandles(true);
        object = (DefaultTreeCellRenderer)this.tree.getCellRenderer();
        ((DefaultTreeCellRenderer)object).setOpenIcon(null);
        ((DefaultTreeCellRenderer)object).setClosedIcon(null);
        ((DefaultTreeCellRenderer)object).setLeafIcon(null);
        return this.tree;
    }
}

