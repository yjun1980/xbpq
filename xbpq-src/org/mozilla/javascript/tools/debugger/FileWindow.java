/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import org.mozilla.javascript.tools.debugger.Dim$SourceInfo;
import org.mozilla.javascript.tools.debugger.FileHeader;
import org.mozilla.javascript.tools.debugger.FileTextArea;
import org.mozilla.javascript.tools.debugger.RunProxy;
import org.mozilla.javascript.tools.debugger.SwingGui;

class FileWindow
extends JInternalFrame
implements ActionListener {
    private static final long serialVersionUID = -6212382604952082370L;
    int currentPos;
    private SwingGui debugGui;
    private FileHeader fileHeader;
    private JScrollPane p;
    private Dim$SourceInfo sourceInfo;
    FileTextArea textArea;

    public FileWindow(SwingGui container, Dim$SourceInfo dim$SourceInfo) {
        super(SwingGui.getShortName(dim$SourceInfo.url()), true, true, true, true);
        this.debugGui = container;
        this.sourceInfo = dim$SourceInfo;
        this.updateToolTip();
        this.currentPos = -1;
        container = new FileTextArea(this);
        this.textArea = container;
        ((JTextArea)container).setRows(24);
        this.textArea.setColumns(80);
        this.p = new JScrollPane();
        this.fileHeader = new FileHeader(this);
        this.p.setViewportView(this.textArea);
        this.p.setRowHeaderView(this.fileHeader);
        this.setContentPane(this.p);
        this.pack();
        this.updateText(dim$SourceInfo);
        this.textArea.select(0);
    }

    private void updateToolTip() {
        Component component;
        int n2 = this.getComponentCount();
        int n3 = 1;
        if (--n2 <= 1) {
            if (n2 < 0) {
                return;
            }
            n3 = n2;
        }
        if ((component = this.getComponent(n3)) != null && component instanceof JComponent) {
            ((JComponent)component).setToolTipText(this.getUrl());
        }
    }

    @Override
    public void actionPerformed(ActionEvent object) {
        if (!((String)(object = ((ActionEvent)object).getActionCommand())).equals("Cut")) {
            if (((String)object).equals("Copy")) {
                this.textArea.copy();
            } else {
                ((String)object).equals("Paste");
            }
        }
    }

    public void clearBreakPoint(int n2) {
        if (this.sourceInfo.breakableLine(n2) && this.sourceInfo.breakpoint(n2, false)) {
            this.fileHeader.repaint();
        }
    }

    @Override
    public void dispose() {
        this.debugGui.removeWindow(this);
        super.dispose();
    }

    public int getPosition(int n2) {
        try {
            n2 = this.textArea.getLineStartOffset(n2);
        }
        catch (BadLocationException badLocationException) {
            n2 = -1;
        }
        return n2;
    }

    public String getUrl() {
        return this.sourceInfo.url();
    }

    public boolean isBreakPoint(int n2) {
        boolean bl = this.sourceInfo.breakableLine(n2) && this.sourceInfo.breakpoint(n2);
        return bl;
    }

    void load() {
        String string = this.getUrl();
        if (string != null) {
            RunProxy runProxy = new RunProxy(this.debugGui, 2);
            runProxy.fileName = string;
            runProxy.text = this.sourceInfo.source();
            new Thread(runProxy).start();
        }
    }

    public void select(int n2, int n3) {
        int n4 = this.textArea.getDocument().getLength();
        this.textArea.select(n4, n4);
        this.textArea.select(n2, n3);
    }

    public void setBreakPoint(int n2) {
        if (this.sourceInfo.breakableLine(n2) && this.sourceInfo.breakpoint(n2, true)) {
            this.fileHeader.repaint();
        }
    }

    public void setPosition(int n2) {
        this.textArea.select(n2);
        this.currentPos = n2;
        this.fileHeader.repaint();
    }

    public void toggleBreakPoint(int n2) {
        if (!this.isBreakPoint(n2)) {
            this.setBreakPoint(n2);
        } else {
            this.clearBreakPoint(n2);
        }
    }

    public void updateText(Dim$SourceInfo object) {
        this.sourceInfo = object;
        object = ((Dim$SourceInfo)object).source();
        if (!this.textArea.getText().equals(object)) {
            this.textArea.setText((String)object);
            int n2 = 0;
            int n3 = this.currentPos;
            if (n3 != -1) {
                n2 = n3;
            }
            this.textArea.select(n2);
        }
        this.fileHeader.update();
        this.fileHeader.repaint();
    }
}

