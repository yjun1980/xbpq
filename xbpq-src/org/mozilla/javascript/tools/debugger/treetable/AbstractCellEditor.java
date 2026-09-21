/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger.treetable;

import java.util.EventObject;
import javax.swing.CellEditor;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.EventListenerList;

public class AbstractCellEditor
implements CellEditor {
    protected EventListenerList listenerList = new EventListenerList();

    @Override
    public void addCellEditorListener(CellEditorListener cellEditorListener) {
        this.listenerList.add(CellEditorListener.class, cellEditorListener);
    }

    @Override
    public void cancelCellEditing() {
    }

    protected void fireEditingCanceled() {
        Object[] objectArray = this.listenerList.getListenerList();
        for (int i2 = objectArray.length - 2; i2 >= 0; i2 -= 2) {
            if (objectArray[i2] != CellEditorListener.class) continue;
            ((CellEditorListener)objectArray[i2 + 1]).editingCanceled(new ChangeEvent(this));
        }
    }

    protected void fireEditingStopped() {
        Object[] objectArray = this.listenerList.getListenerList();
        for (int i2 = objectArray.length - 2; i2 >= 0; i2 -= 2) {
            if (objectArray[i2] != CellEditorListener.class) continue;
            ((CellEditorListener)objectArray[i2 + 1]).editingStopped(new ChangeEvent(this));
        }
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public boolean isCellEditable(EventObject eventObject) {
        return true;
    }

    @Override
    public void removeCellEditorListener(CellEditorListener cellEditorListener) {
        this.listenerList.remove(CellEditorListener.class, cellEditorListener);
    }

    @Override
    public boolean shouldSelectCell(EventObject eventObject) {
        return false;
    }

    @Override
    public boolean stopCellEditing() {
        return true;
    }
}

