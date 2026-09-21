/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.util.Arrays;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.VariableModel$1;
import org.mozilla.javascript.tools.debugger.VariableModel$VariableNode;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModel;

class VariableModel
implements TreeTableModel {
    private static final VariableModel$VariableNode[] CHILDLESS;
    private static final String[] cNames;
    private static final Class<?>[] cTypes;
    private Dim debugger;
    private VariableModel$VariableNode root;

    static {
        cNames = new String[]{" Name", " Value"};
        cTypes = new Class[]{TreeTableModel.class, String.class};
        CHILDLESS = new VariableModel$VariableNode[0];
    }

    public VariableModel() {
    }

    public VariableModel(Dim dim, Object object) {
        this.debugger = dim;
        this.root = new VariableModel$VariableNode(object, "this");
    }

    private VariableModel$VariableNode[] children(VariableModel$VariableNode variableModel$VariableNode) {
        VariableModel$VariableNode[] variableModel$VariableNodeArray;
        if (VariableModel$VariableNode.access$000(variableModel$VariableNode) != null) {
            return VariableModel$VariableNode.access$000(variableModel$VariableNode);
        }
        Object object = this.getValue(variableModel$VariableNode);
        Object[] objectArray = this.debugger.getObjectIds(object);
        if (objectArray != null && objectArray.length != 0) {
            Arrays.sort(objectArray, new VariableModel$1(this));
            VariableModel$VariableNode[] variableModel$VariableNodeArray2 = new VariableModel$VariableNode[objectArray.length];
            int n2 = 0;
            while (true) {
                variableModel$VariableNodeArray = variableModel$VariableNodeArray2;
                if (n2 != objectArray.length) {
                    variableModel$VariableNodeArray2[n2] = new VariableModel$VariableNode(object, objectArray[n2]);
                    ++n2;
                    continue;
                }
                break;
            }
        } else {
            variableModel$VariableNodeArray = CHILDLESS;
        }
        VariableModel$VariableNode.access$002(variableModel$VariableNode, variableModel$VariableNodeArray);
        return variableModel$VariableNodeArray;
    }

    @Override
    public void addTreeModelListener(TreeModelListener treeModelListener) {
    }

    @Override
    public Object getChild(Object object, int n2) {
        if (this.debugger == null) {
            return null;
        }
        return this.children((VariableModel$VariableNode)object)[n2];
    }

    @Override
    public int getChildCount(Object object) {
        if (this.debugger == null) {
            return 0;
        }
        return this.children((VariableModel$VariableNode)object).length;
    }

    @Override
    public Class<?> getColumnClass(int n2) {
        return cTypes[n2];
    }

    @Override
    public int getColumnCount() {
        return cNames.length;
    }

    @Override
    public String getColumnName(int n2) {
        return cNames[n2];
    }

    @Override
    public int getIndexOfChild(Object object, Object variableModel$VariableNodeArray) {
        if (this.debugger == null) {
            return -1;
        }
        VariableModel$VariableNode variableModel$VariableNode = (VariableModel$VariableNode)object;
        object = (VariableModel$VariableNode)variableModel$VariableNodeArray;
        variableModel$VariableNodeArray = this.children(variableModel$VariableNode);
        for (int i2 = 0; i2 != variableModel$VariableNodeArray.length; ++i2) {
            if (variableModel$VariableNodeArray[i2] != object) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public Object getRoot() {
        if (this.debugger == null) {
            return null;
        }
        return this.root;
    }

    public Object getValue(VariableModel$VariableNode object) {
        try {
            object = this.debugger.getObjectProperty(VariableModel$VariableNode.access$100((VariableModel$VariableNode)object), VariableModel$VariableNode.access$200((VariableModel$VariableNode)object));
            return object;
        }
        catch (Exception exception) {
            return "undefined";
        }
    }

    @Override
    public Object getValueAt(Object object, int n2) {
        Object object2 = this.debugger;
        if (object2 == null) {
            return null;
        }
        object = (VariableModel$VariableNode)object;
        if (n2 != 0) {
            block7: {
                if (n2 != 1) {
                    return null;
                }
                try {
                    object = ((Dim)object2).objectToString(this.getValue((VariableModel$VariableNode)object));
                }
                catch (RuntimeException runtimeException) {
                    object = runtimeException.getMessage();
                    if (object != null) break block7;
                    object = ((Object)runtimeException).toString();
                }
            }
            object2 = new StringBuilder();
            int n3 = ((String)object).length();
            for (n2 = 0; n2 < n3; ++n2) {
                char c2;
                char c3 = c2 = ((String)object).charAt(n2);
                if (Character.isISOControl(c2)) {
                    c3 = ' ';
                }
                ((StringBuilder)object2).append(c3);
            }
            return ((StringBuilder)object2).toString();
        }
        return ((VariableModel$VariableNode)object).toString();
    }

    @Override
    public boolean isCellEditable(Object object, int n2) {
        boolean bl = n2 == 0;
        return bl;
    }

    @Override
    public boolean isLeaf(Object object) {
        Dim dim = this.debugger;
        boolean bl = true;
        if (dim == null) {
            return true;
        }
        if (this.children((VariableModel$VariableNode)object).length != 0) {
            bl = false;
        }
        return bl;
    }

    @Override
    public void removeTreeModelListener(TreeModelListener treeModelListener) {
    }

    @Override
    public void setValueAt(Object object, Object object2, int n2) {
    }

    @Override
    public void valueForPathChanged(TreePath treePath, Object object) {
    }
}

