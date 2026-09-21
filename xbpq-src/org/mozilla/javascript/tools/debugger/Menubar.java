/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.mozilla.javascript.tools.debugger.SwingGui;

class Menubar
extends JMenuBar
implements ActionListener {
    private static final long serialVersionUID = 3217170497245911461L;
    private JCheckBoxMenuItem breakOnEnter;
    private JCheckBoxMenuItem breakOnExceptions;
    private JCheckBoxMenuItem breakOnReturn;
    private SwingGui debugGui;
    private List<JMenuItem> interruptOnlyItems = Collections.synchronizedList(new ArrayList());
    private List<JMenuItem> runOnlyItems = Collections.synchronizedList(new ArrayList());
    private JMenu windowMenu;

    Menubar(SwingGui object) {
        int n2;
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        this.debugGui = object;
        Object object2 = new String[]{"Open...", "Run...", "", "Exit"};
        int[] nArray4 = nArray3 = new int[4];
        nArray3[0] = 79;
        nArray4[1] = 78;
        nArray4[2] = 0;
        nArray4[3] = 81;
        int[] nArray5 = nArray2 = new int[5];
        nArray2[0] = 0;
        nArray5[1] = 0;
        nArray5[2] = 0;
        nArray5[3] = 0;
        nArray5[4] = 76;
        object = new String[]{"Break", "Go", "Step Into", "Step Over", "Step Out"};
        int[] nArray6 = nArray = new int[7];
        nArray[0] = 19;
        nArray6[1] = 116;
        nArray6[2] = 122;
        nArray6[3] = 118;
        nArray6[4] = 119;
        nArray6[5] = 0;
        nArray6[6] = 0;
        JMenu jMenu = new JMenu("File");
        jMenu.setMnemonic('F');
        JMenu jMenu2 = new JMenu("Edit");
        jMenu2.setMnemonic('E');
        JMenuItem jMenuItem = new JMenu("Platform");
        jMenuItem.setMnemonic('P');
        JMenuItem jMenuItem2 = new JMenu("Debug");
        jMenuItem2.setMnemonic('D');
        JMenuItem jMenuItem3 = new JMenu("Window");
        this.windowMenu = jMenuItem3;
        jMenuItem3.setMnemonic('W');
        for (n2 = 0; n2 < 4; ++n2) {
            if (object2[n2].length() == 0) {
                jMenu.addSeparator();
                continue;
            }
            jMenuItem3 = new JMenuItem(object2[n2], (new char[]{'0', 'N', '\u0000', 'X'})[n2]);
            jMenuItem3.setActionCommand((new String[]{"Open", "Load", "", "Exit"})[n2]);
            jMenuItem3.addActionListener(this);
            jMenu.add(jMenuItem3);
            if (nArray3[n2] == 0) continue;
            jMenuItem3.setAccelerator(KeyStroke.getKeyStroke(nArray3[n2], 128));
        }
        for (n2 = 0; n2 < 5; ++n2) {
            object2 = new JMenuItem((new String[]{"Cut", "Copy", "Paste", "Go to function...", "Go to line..."})[n2], (new char[]{'T', 'C', 'P', 'F', 'L'})[n2]);
            ((AbstractButton)object2).addActionListener(this);
            jMenu2.add((JMenuItem)object2);
            if (nArray2[n2] == 0) continue;
            ((JMenuItem)object2).setAccelerator(KeyStroke.getKeyStroke(nArray2[n2], 128));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            object2 = new JMenuItem((new String[]{"Metal", "Windows", "Motif"})[n2], (new char[]{'M', 'W', 'F'})[n2]);
            ((AbstractButton)object2).addActionListener(this);
            ((JMenu)jMenuItem).add((JMenuItem)object2);
        }
        for (n2 = 0; n2 < 5; ++n2) {
            jMenuItem = new JMenuItem(object[n2], (new char[]{'B', 'G', 'I', 'O', 'T'})[n2]);
            jMenuItem.addActionListener(this);
            if (nArray[n2] != 0) {
                jMenuItem.setAccelerator(KeyStroke.getKeyStroke(nArray[n2], 0));
            }
            object2 = n2 != 0 ? this.interruptOnlyItems : this.runOnlyItems;
            object2.add(jMenuItem);
            ((JMenu)jMenuItem2).add(jMenuItem);
        }
        this.breakOnExceptions = object = new JCheckBoxMenuItem("Break on Exceptions");
        ((AbstractButton)object).setMnemonic('X');
        this.breakOnExceptions.addActionListener(this);
        this.breakOnExceptions.setSelected(false);
        ((JMenu)jMenuItem2).add(this.breakOnExceptions);
        this.breakOnEnter = object = new JCheckBoxMenuItem("Break on Function Enter");
        ((AbstractButton)object).setMnemonic('E');
        this.breakOnEnter.addActionListener(this);
        this.breakOnEnter.setSelected(false);
        ((JMenu)jMenuItem2).add(this.breakOnEnter);
        this.breakOnReturn = object = new JCheckBoxMenuItem("Break on Function Return");
        ((AbstractButton)object).setMnemonic('R');
        this.breakOnReturn.addActionListener(this);
        this.breakOnReturn.setSelected(false);
        ((JMenu)jMenuItem2).add(this.breakOnReturn);
        this.add(jMenu);
        this.add(jMenu2);
        this.add((JMenu)jMenuItem2);
        jMenuItem2 = this.windowMenu;
        object = new JMenuItem("Cascade", 65);
        ((JMenu)jMenuItem2).add((JMenuItem)object);
        ((AbstractButton)object).addActionListener(this);
        object = this.windowMenu;
        jMenuItem2 = new JMenuItem("Tile", 84);
        ((JMenu)object).add(jMenuItem2);
        jMenuItem2.addActionListener(this);
        this.windowMenu.addSeparator();
        jMenuItem2 = this.windowMenu;
        object = new JMenuItem("Console", 67);
        ((JMenu)jMenuItem2).add((JMenuItem)object);
        ((AbstractButton)object).addActionListener(this);
        this.add(this.windowMenu);
        this.updateEnabled(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void actionPerformed(ActionEvent object) {
        JCheckBoxMenuItem jCheckBoxMenuItem;
        Object object2;
        block15: {
            block13: {
                block14: {
                    block12: {
                        object2 = ((ActionEvent)object).getActionCommand();
                        if (!((String)object2).equals("Metal")) break block12;
                        object = "javax.swing.plaf.metal.MetalLookAndFeel";
                        break block13;
                    }
                    if (!((String)object2).equals("Windows")) break block14;
                    object = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
                    break block13;
                }
                if (!((String)object2).equals("Motif")) break block15;
                object = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
            }
            try {
                UIManager.setLookAndFeel((String)object);
                SwingUtilities.updateComponentTreeUI(this.debugGui);
                SwingUtilities.updateComponentTreeUI(this.debugGui.dlg);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        object2 = ((EventObject)object).getSource();
        if (object2 == (jCheckBoxMenuItem = this.breakOnExceptions)) {
            this.debugGui.dim.setBreakOnExceptions(jCheckBoxMenuItem.isSelected());
            return;
        } else {
            jCheckBoxMenuItem = this.breakOnEnter;
            if (object2 == jCheckBoxMenuItem) {
                this.debugGui.dim.setBreakOnEnter(jCheckBoxMenuItem.isSelected());
                return;
            } else {
                jCheckBoxMenuItem = this.breakOnReturn;
                if (object2 == jCheckBoxMenuItem) {
                    this.debugGui.dim.setBreakOnReturn(jCheckBoxMenuItem.isSelected());
                    return;
                } else {
                    this.debugGui.actionPerformed((ActionEvent)object);
                }
            }
        }
    }

    public void addFile(String object) {
        int n2;
        int n3;
        int n4 = n3 = this.windowMenu.getItemCount();
        if (n3 == 4) {
            this.windowMenu.addSeparator();
            n4 = n3 + 1;
        }
        JMenuItem jMenuItem = this.windowMenu.getItem(n4 - 1);
        n3 = 0;
        if (jMenuItem != null && jMenuItem.getText().equals("More Windows...")) {
            n3 = 1;
            n2 = 6;
        } else {
            n2 = 5;
        }
        if (n3 == 0 && n4 - 4 == 5) {
            object = this.windowMenu;
            jMenuItem = new JMenuItem("More Windows...", 77);
            ((JMenu)object).add(jMenuItem);
            jMenuItem.setActionCommand("More Windows...");
            jMenuItem.addActionListener(this);
            return;
        }
        if (n4 - 4 <= n2) {
            n2 = n4;
            if (n3 != 0) {
                n2 = n4 - 1;
                this.windowMenu.remove(jMenuItem);
            }
            String string = SwingGui.getShortName((String)object);
            JMenu jMenu = this.windowMenu;
            Serializable serializable = new StringBuilder();
            n4 = n2 - 4 + 48;
            ((StringBuilder)serializable).append((char)n4);
            ((StringBuilder)serializable).append(" ");
            ((StringBuilder)serializable).append(string);
            serializable = new JMenuItem(((StringBuilder)serializable).toString(), n4);
            jMenu.add((JMenuItem)serializable);
            if (n3 != 0) {
                this.windowMenu.add(jMenuItem);
            }
            ((AbstractButton)serializable).setActionCommand((String)object);
            ((AbstractButton)serializable).addActionListener(this);
        }
    }

    public JCheckBoxMenuItem getBreakOnEnter() {
        return this.breakOnEnter;
    }

    public JCheckBoxMenuItem getBreakOnExceptions() {
        return this.breakOnExceptions;
    }

    public JCheckBoxMenuItem getBreakOnReturn() {
        return this.breakOnReturn;
    }

    public JMenu getDebugMenu() {
        return this.getMenu(2);
    }

    public void updateEnabled(boolean bl) {
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 == this.interruptOnlyItems.size()) break;
            this.interruptOnlyItems.get(n3).setEnabled(bl);
            ++n3;
        }
        for (int i2 = n2; i2 != this.runOnlyItems.size(); ++i2) {
            this.runOnlyItems.get(i2).setEnabled(bl ^ true);
        }
    }
}

