/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.PrintStream;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.mozilla.javascript.tools.debugger.JSInternalConsole$1;
import org.mozilla.javascript.tools.shell.ConsoleTextArea;

class JSInternalConsole
extends JInternalFrame
implements ActionListener {
    private static final long serialVersionUID = -5523468828771087292L;
    ConsoleTextArea consoleTextArea;

    public JSInternalConsole(String object) {
        super((String)object, true, false, true, true);
        this.consoleTextArea = object = new ConsoleTextArea(null);
        ((JTextArea)object).setRows(24);
        this.consoleTextArea.setColumns(80);
        this.setContentPane(new JScrollPane(this.consoleTextArea));
        this.pack();
        this.addInternalFrameListener(new JSInternalConsole$1(this));
    }

    @Override
    public void actionPerformed(ActionEvent object) {
        if (((String)(object = ((ActionEvent)object).getActionCommand())).equals("Cut")) {
            this.consoleTextArea.cut();
        } else if (((String)object).equals("Copy")) {
            this.consoleTextArea.copy();
        } else if (((String)object).equals("Paste")) {
            this.consoleTextArea.paste();
        }
    }

    public PrintStream getErr() {
        return this.consoleTextArea.getErr();
    }

    public InputStream getIn() {
        return this.consoleTextArea.getIn();
    }

    public PrintStream getOut() {
        return this.consoleTextArea.getOut();
    }
}

