/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import org.mozilla.javascript.tools.debugger.ContextWindow$1;
import org.mozilla.javascript.tools.debugger.ContextWindow$2;
import org.mozilla.javascript.tools.debugger.Dim$ContextData;
import org.mozilla.javascript.tools.debugger.Dim$StackFrame;
import org.mozilla.javascript.tools.debugger.EvalTextArea;
import org.mozilla.javascript.tools.debugger.Evaluator;
import org.mozilla.javascript.tools.debugger.MyTableModel;
import org.mozilla.javascript.tools.debugger.MyTreeTable;
import org.mozilla.javascript.tools.debugger.SwingGui;
import org.mozilla.javascript.tools.debugger.VariableModel;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModel;

class ContextWindow
extends JPanel
implements ActionListener {
    private static final long serialVersionUID = 2306040975490228051L;
    private EvalTextArea cmdLine;
    JComboBox<String> context;
    private SwingGui debugGui;
    private boolean enabled;
    private Evaluator evaluator;
    private MyTreeTable localsTable;
    JSplitPane split;
    private MyTableModel tableModel;
    private JTabbedPane tabs;
    private JTabbedPane tabs2;
    private MyTreeTable thisTable;
    List<String> toolTips;

    public ContextWindow(SwingGui object) {
        this.debugGui = object;
        this.enabled = false;
        JComponent jComponent = new JPanel();
        JToolBar jToolBar = new JToolBar();
        jToolBar.setName("Variables");
        jToolBar.setLayout(new GridLayout());
        jToolBar.add(jComponent);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout());
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout());
        jPanel.add(jToolBar);
        Serializable serializable = new JLabel("Context:");
        Serializable serializable2 = new JComboBox();
        this.context = serializable2;
        ((JComboBox)serializable2).setLightWeightPopupEnabled(false);
        this.toolTips = Collections.synchronizedList(new ArrayList());
        serializable.setBorder(this.context.getBorder());
        this.context.addActionListener(this);
        this.context.setActionCommand("ContextSwitch");
        serializable2 = new GridBagLayout();
        jComponent.setLayout((LayoutManager)((Object)serializable2));
        Serializable serializable3 = new GridBagConstraints();
        ((GridBagConstraints)serializable3).insets.left = 5;
        ((GridBagConstraints)serializable3).anchor = 17;
        ((GridBagConstraints)serializable3).ipadx = 5;
        ((GridBagLayout)serializable2).setConstraints((Component)serializable, (GridBagConstraints)serializable3);
        jComponent.add((Component)serializable);
        serializable = new GridBagConstraints();
        ((GridBagConstraints)serializable).gridwidth = 0;
        ((GridBagConstraints)serializable).fill = 2;
        ((GridBagConstraints)serializable).anchor = 17;
        ((GridBagLayout)serializable2).setConstraints(this.context, (GridBagConstraints)serializable);
        jComponent.add(this.context);
        serializable3 = new JTabbedPane(3);
        this.tabs = serializable3;
        ((JComponent)serializable3).setPreferredSize(new Dimension(500, 300));
        this.thisTable = new MyTreeTable(new VariableModel());
        serializable3 = new JScrollPane(this.thisTable);
        ((JScrollPane)serializable3).getViewport().setViewSize(new Dimension(5, 2));
        this.tabs.add("this", (Component)serializable3);
        serializable3 = new MyTreeTable(new VariableModel());
        this.localsTable = serializable3;
        ((JTable)serializable3).setAutoResizeMode(4);
        this.localsTable.setPreferredSize(null);
        serializable3 = new JScrollPane(this.localsTable);
        this.tabs.add("Locals", (Component)serializable3);
        ((GridBagConstraints)serializable).weighty = 1.0;
        ((GridBagConstraints)serializable).weightx = 1.0;
        ((GridBagConstraints)serializable).gridheight = 0;
        ((GridBagConstraints)serializable).fill = 1;
        ((GridBagConstraints)serializable).anchor = 17;
        ((GridBagLayout)serializable2).setConstraints(this.tabs, (GridBagConstraints)serializable);
        jComponent.add(this.tabs);
        this.evaluator = new Evaluator((SwingGui)object);
        this.cmdLine = new EvalTextArea((SwingGui)object);
        this.tableModel = this.evaluator.tableModel;
        serializable = new JScrollPane(this.evaluator);
        jComponent = new JToolBar();
        jComponent.setName("Evaluate");
        serializable2 = new JTabbedPane(3);
        this.tabs2 = serializable2;
        ((JTabbedPane)serializable2).add("Watch", (Component)serializable);
        this.tabs2.add("Evaluate", new JScrollPane(this.cmdLine));
        this.tabs2.setPreferredSize(new Dimension(500, 300));
        ((JToolBar)jComponent).setLayout(new GridLayout());
        jComponent.add(this.tabs2);
        jPanel2.add(jComponent);
        this.evaluator.setAutoResizeMode(4);
        serializable2 = new JSplitPane(1, jPanel, jPanel2);
        this.split = serializable2;
        ((JSplitPane)serializable2).setOneTouchExpandable(true);
        SwingGui.setResizeWeight(this.split, 0.5);
        this.setLayout(new BorderLayout());
        this.add((Component)this.split, "Center");
        serializable2 = this.split;
        object = new ContextWindow$1(this, this, jToolBar, jPanel, (SwingGui)object, (JToolBar)jComponent, jPanel2, (JSplitPane)serializable2);
        jPanel.addContainerListener(new ContextWindow$2(this, this, jToolBar, (JToolBar)jComponent, jPanel2, (JSplitPane)serializable2));
        jToolBar.addComponentListener((ComponentListener)object);
        jComponent.addComponentListener((ComponentListener)object);
        this.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent object) {
        if (!this.enabled) {
            return;
        }
        if (((ActionEvent)object).getActionCommand().equals("ContextSwitch")) {
            object = this.debugGui.dim.currentContextData();
            if (object == null) {
                return;
            }
            int n2 = this.context.getSelectedIndex();
            this.context.setToolTipText(this.toolTips.get(n2));
            if (n2 >= ((Dim$ContextData)object).frameCount()) {
                return;
            }
            Dim$StackFrame dim$StackFrame = ((Dim$ContextData)object).getFrame(n2);
            object = dim$StackFrame.scope();
            Object object2 = dim$StackFrame.thisObj();
            this.thisTable.resetTree(new VariableModel(this.debugGui.dim, object2));
            object = object != object2 ? new VariableModel(this.debugGui.dim, object) : new VariableModel();
            this.localsTable.resetTree((TreeTableModel)object);
            this.debugGui.dim.contextSwitch(n2);
            this.debugGui.showStopLine(dim$StackFrame);
            this.tableModel.updateModel();
        }
    }

    public void disableUpdate() {
        this.enabled = false;
    }

    public void enableUpdate() {
        this.enabled = true;
    }

    @Override
    public void setEnabled(boolean bl) {
        this.context.setEnabled(bl);
        this.thisTable.setEnabled(bl);
        this.localsTable.setEnabled(bl);
        this.evaluator.setEnabled(bl);
        this.cmdLine.setEnabled(bl);
    }
}

