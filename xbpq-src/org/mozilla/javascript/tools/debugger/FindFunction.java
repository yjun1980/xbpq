/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.mozilla.javascript.tools.debugger.Dim$FunctionSource;
import org.mozilla.javascript.tools.debugger.FindFunction$1;
import org.mozilla.javascript.tools.debugger.FindFunction$MouseHandler;
import org.mozilla.javascript.tools.debugger.SwingGui;

class FindFunction
extends JDialog
implements ActionListener {
    private static final long serialVersionUID = 559491015232880916L;
    private JButton cancelButton;
    private SwingGui debugGui;
    private JList<String> list;
    private JButton setButton;
    private String value;

    public FindFunction(SwingGui object, String object2, String object3) {
        super((Frame)object, (String)object2, true);
        this.debugGui = object;
        this.cancelButton = new JButton("Cancel");
        this.setButton = new JButton("Select");
        this.cancelButton.addActionListener(this);
        this.setButton.addActionListener(this);
        this.getRootPane().setDefaultButton(this.setButton);
        this.list = object2 = new JList(new DefaultListModel());
        object2 = (DefaultListModel)((JList)object2).getModel();
        ((DefaultListModel)object2).clear();
        object = ((SwingGui)object).dim.functionNames();
        Arrays.sort((Object[])object);
        for (int i2 = 0; i2 < ((Object[])object).length; ++i2) {
            ((DefaultListModel)object2).addElement(object[i2]);
        }
        this.list.setSelectedIndex(0);
        object2 = this.setButton;
        boolean bl = ((Object[])object).length > 0;
        ((AbstractButton)object2).setEnabled(bl);
        this.list.setSelectionMode(1);
        this.list.addMouseListener(new FindFunction$MouseHandler(this));
        object2 = new JScrollPane(this.list);
        ((JComponent)object2).setPreferredSize(new Dimension(320, 240));
        ((JComponent)object2).setMinimumSize(new Dimension(250, 80));
        ((JComponent)object2).setAlignmentX(0.0f);
        object = new JPanel();
        ((Container)object).setLayout(new BoxLayout((Container)object, 1));
        object3 = new JLabel((String)object3);
        ((JLabel)object3).setLabelFor(this.list);
        ((Container)object).add((Component)object3);
        ((Container)object).add(Box.createRigidArea(new Dimension(0, 5)));
        ((Container)object).add((Component)object2);
        ((JComponent)object).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        object3 = new JPanel();
        ((Container)object3).setLayout(new BoxLayout((Container)object3, 0));
        ((JComponent)object3).setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        ((Container)object3).add(Box.createHorizontalGlue());
        ((Container)object3).add(this.cancelButton);
        ((Container)object3).add(Box.createRigidArea(new Dimension(10, 0)));
        ((Container)object3).add(this.setButton);
        object2 = this.getContentPane();
        ((Container)object2).add((Component)object, "Center");
        ((Container)object2).add((Component)object3, "South");
        this.pack();
        this.addKeyListener(new FindFunction$1(this));
    }

    static /* synthetic */ String access$002(FindFunction findFunction, String string) {
        findFunction.value = string;
        return string;
    }

    static /* synthetic */ JButton access$100(FindFunction findFunction) {
        return findFunction.setButton;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void actionPerformed(ActionEvent object) {
        if (((String)(object = ((ActionEvent)object).getActionCommand())).equals("Cancel")) {
            this.setVisible(false);
            this.value = null;
            return;
        }
        if (!((String)object).equals("Select")) return;
        if (this.list.getSelectedIndex() < 0) {
            return;
        }
        try {
            this.value = this.list.getSelectedValue();
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            return;
        }
        this.setVisible(false);
        Dim$FunctionSource dim$FunctionSource = this.debugGui.dim.functionSourceByName(this.value);
        if (dim$FunctionSource == null) return;
        object = dim$FunctionSource.sourceInfo().url();
        int n2 = dim$FunctionSource.firstLine();
        this.debugGui.showFileWindow((String)object, n2);
    }

    public String showDialog(Component component) {
        this.value = null;
        this.setLocationRelativeTo(component);
        this.setVisible(true);
        return this.value;
    }
}

