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
import java.util.Map;
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
import org.mozilla.javascript.tools.debugger.FileWindow;
import org.mozilla.javascript.tools.debugger.MoreWindows$1;
import org.mozilla.javascript.tools.debugger.MoreWindows$MouseHandler;
import org.mozilla.javascript.tools.debugger.SwingGui;

class MoreWindows
extends JDialog
implements ActionListener {
    private static final long serialVersionUID = 5177066296457377546L;
    private JButton cancelButton;
    private JList<String> list;
    private JButton setButton;
    private SwingGui swingGui;
    private String value;

    MoreWindows(SwingGui serializable, Map<String, FileWindow> object, String object2, String string) {
        super((Frame)serializable, (String)object2, true);
        this.swingGui = serializable;
        this.cancelButton = new JButton("Cancel");
        this.setButton = new JButton("Select");
        this.cancelButton.addActionListener(this);
        this.setButton.addActionListener(this);
        this.getRootPane().setDefaultButton(this.setButton);
        serializable = new JList(new DefaultListModel());
        this.list = serializable;
        serializable = (DefaultListModel)((JList)serializable).getModel();
        ((DefaultListModel)serializable).clear();
        object = object.keySet().iterator();
        while (object.hasNext()) {
            ((DefaultListModel)serializable).addElement((String)object.next());
        }
        this.list.setSelectedIndex(0);
        this.setButton.setEnabled(true);
        this.list.setSelectionMode(1);
        this.list.addMouseListener(new MoreWindows$MouseHandler(this, null));
        object = new JScrollPane(this.list);
        ((JComponent)object).setPreferredSize(new Dimension(320, 240));
        ((JComponent)object).setMinimumSize(new Dimension(250, 80));
        ((JComponent)object).setAlignmentX(0.0f);
        serializable = new JPanel();
        ((Container)serializable).setLayout(new BoxLayout((Container)serializable, 1));
        object2 = new JLabel(string);
        ((JLabel)object2).setLabelFor(this.list);
        ((Container)serializable).add((Component)object2);
        ((Container)serializable).add(Box.createRigidArea(new Dimension(0, 5)));
        ((Container)serializable).add((Component)object);
        ((JComponent)serializable).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        object = new JPanel();
        ((Container)object).setLayout(new BoxLayout((Container)object, 0));
        ((JComponent)object).setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        ((Container)object).add(Box.createHorizontalGlue());
        ((Container)object).add(this.cancelButton);
        ((Container)object).add(Box.createRigidArea(new Dimension(10, 0)));
        ((Container)object).add(this.setButton);
        object2 = this.getContentPane();
        ((Container)object2).add((Component)serializable, "Center");
        ((Container)object2).add((Component)object, "South");
        this.pack();
        this.addKeyListener(new MoreWindows$1(this));
    }

    static /* synthetic */ String access$102(MoreWindows moreWindows, String string) {
        moreWindows.value = string;
        return string;
    }

    static /* synthetic */ JButton access$200(MoreWindows moreWindows) {
        return moreWindows.setButton;
    }

    @Override
    public void actionPerformed(ActionEvent object) {
        if (((String)(object = ((ActionEvent)object).getActionCommand())).equals("Cancel")) {
            this.setVisible(false);
            this.value = null;
        } else if (((String)object).equals("Select")) {
            this.value = this.list.getSelectedValue();
            this.setVisible(false);
            this.swingGui.showFileWindow(this.value, -1);
        }
    }

    public String showDialog(Component component) {
        this.value = null;
        this.setLocationRelativeTo(component);
        this.setVisible(true);
        return this.value;
    }
}

