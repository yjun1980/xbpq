/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.mozilla.javascript.tools.debugger.SwingGui;

class MyTableModel
extends AbstractTableModel {
    private static final long serialVersionUID = 2971618907207577000L;
    private SwingGui debugGui;
    private List<String> expressions;
    private List<String> values;

    public MyTableModel(SwingGui swingGui) {
        this.debugGui = swingGui;
        this.expressions = Collections.synchronizedList(new ArrayList());
        this.values = Collections.synchronizedList(new ArrayList());
        this.expressions.add("");
        this.values.add("");
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                return null;
            }
            return "Value";
        }
        return "Expression";
    }

    @Override
    public int getRowCount() {
        return this.expressions.size();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Object getValueAt(int n2, int n3) {
        List<String> list;
        if (n3 != 0) {
            if (n3 != 1) {
                return "";
            }
            list = this.values;
            return list.get(n2);
        }
        list = this.expressions;
        return list.get(n2);
    }

    @Override
    public boolean isCellEditable(int n2, int n3) {
        return true;
    }

    @Override
    public void setValueAt(Object object, int n2, int n3) {
        block7: {
            block9: {
                block8: {
                    block6: {
                        if (n3 == 0) break block6;
                        if (n3 == 1) {
                            this.fireTableDataChanged();
                        }
                        break block7;
                    }
                    object = object.toString();
                    this.expressions.set(n2, (String)object);
                    if (((String)object).length() <= 0) break block8;
                    String string = this.debugGui.dim.eval((String)object);
                    object = string;
                    if (string != null) break block9;
                }
                object = "";
            }
            this.values.set(n2, (String)object);
            this.updateModel();
            if (++n2 == this.expressions.size()) {
                this.expressions.add("");
                this.values.add("");
                this.fireTableRowsInserted(n2, n2);
            }
        }
    }

    void updateModel() {
        for (int i2 = 0; i2 < this.expressions.size(); ++i2) {
            String string;
            String string2 = this.expressions.get(i2);
            int n2 = string2.length();
            String string3 = string = "";
            if (n2 > 0 && (string3 = this.debugGui.dim.eval(string2)) == null) {
                string3 = string;
            }
            string3 = string3.replace('\n', ' ');
            this.values.set(i2, string3);
        }
        this.fireTableDataChanged();
    }
}

