/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import org.mozilla.javascript.tools.debugger.FileTextArea;

class FilePopupMenu
extends JPopupMenu {
    private static final long serialVersionUID = 3589525009546013565L;
    int x;
    int y;

    public FilePopupMenu(FileTextArea fileTextArea) {
        JMenuItem jMenuItem = new JMenuItem("Set Breakpoint");
        this.add(jMenuItem);
        jMenuItem.addActionListener(fileTextArea);
        jMenuItem = new JMenuItem("Clear Breakpoint");
        this.add(jMenuItem);
        jMenuItem.addActionListener(fileTextArea);
        jMenuItem = new JMenuItem("Run");
        this.add(jMenuItem);
        jMenuItem.addActionListener(fileTextArea);
    }

    public void show(JComponent jComponent, int n2, int n3) {
        this.x = n2;
        this.y = n3;
        super.show(jComponent, n2, n3);
    }
}

