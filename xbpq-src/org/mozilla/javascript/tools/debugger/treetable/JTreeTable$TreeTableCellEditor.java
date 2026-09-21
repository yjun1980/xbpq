/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import org.mozilla.javascript.tools.debugger.treetable.AbstractCellEditor;
import org.mozilla.javascript.tools.debugger.treetable.JTreeTable;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModel;

public class JTreeTable$TreeTableCellEditor
extends AbstractCellEditor
implements TableCellEditor {
    final JTreeTable this$0;

    public JTreeTable$TreeTableCellEditor(JTreeTable jTreeTable) {
        this.this$0 = jTreeTable;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n2, int n3) {
        return this.this$0.tree;
    }

    @Override
    public boolean isCellEditable(EventObject eventObject) {
        if (eventObject instanceof MouseEvent) {
            for (int i2 = this.this$0.getColumnCount() - 1; i2 >= 0; --i2) {
                if (this.this$0.getColumnClass(i2) != TreeTableModel.class) continue;
                eventObject = (MouseEvent)eventObject;
                eventObject = new MouseEvent(this.this$0.tree, ((AWTEvent)eventObject).getID(), ((InputEvent)eventObject).getWhen(), ((MouseEvent)eventObject).getModifiersEx(), ((MouseEvent)eventObject).getX() - this.this$0.getCellRect((int)0, (int)i2, (boolean)true).x, ((MouseEvent)eventObject).getY(), ((MouseEvent)eventObject).getClickCount(), ((MouseEvent)eventObject).isPopupTrigger(), ((MouseEvent)eventObject).getButton());
                this.this$0.tree.dispatchEvent((AWTEvent)eventObject);
                break;
            }
        }
        return false;
    }
}

