/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.mozilla.javascript.tools.debugger.EvalTextArea;
import org.mozilla.javascript.tools.debugger.SwingGui;

class EvalWindow
extends JInternalFrame
implements ActionListener {
    private static final long serialVersionUID = -2860585845212160176L;
    private EvalTextArea evalTextArea;

    public EvalWindow(String object, SwingGui swingGui) {
        super((String)object, true, false, true, true);
        this.evalTextArea = object = new EvalTextArea(swingGui);
        ((JTextArea)object).setRows(24);
        this.evalTextArea.setColumns(80);
        this.setContentPane(new JScrollPane(this.evalTextArea));
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent object) {
        if (((String)(object = ((ActionEvent)object).getActionCommand())).equals("Cut")) {
            this.evalTextArea.cut();
        } else if (((String)object).equals("Copy")) {
            this.evalTextArea.copy();
        } else if (((String)object).equals("Paste")) {
            this.evalTextArea.paste();
        }
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.evalTextArea.setEnabled(bl);
    }
}

