/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.tools.shell.ConsoleTextArea;
import org.mozilla.javascript.tools.shell.JSConsole$1;
import org.mozilla.javascript.tools.shell.JSConsole$2;
import org.mozilla.javascript.tools.shell.Main;

public class JSConsole
extends JFrame
implements ActionListener {
    static final long serialVersionUID = 2551225560631876300L;
    private File CWD;
    private ConsoleTextArea consoleTextArea;
    private JFileChooser dlg;

    public JSConsole(String[] stringArray) {
        super("Rhino JavaScript Console");
        JMenuItem jMenuItem;
        int n2;
        JMenuBar jMenuBar = new JMenuBar();
        this.createFileChooser();
        JMenu jMenu = new JMenu("File");
        jMenu.setMnemonic('F');
        JMenu jMenu2 = new JMenu("Edit");
        jMenu2.setMnemonic('E');
        JMenu jMenu3 = new JMenu("Platform");
        jMenu3.setMnemonic('P');
        for (n2 = 0; n2 < 2; ++n2) {
            jMenuItem = new JMenuItem((new String[]{"Load...", "Exit"})[n2], (new char[]{'L', 'X'})[n2]);
            jMenuItem.setActionCommand((new String[]{"Load", "Exit"})[n2]);
            jMenuItem.addActionListener(this);
            jMenu.add(jMenuItem);
        }
        for (n2 = 0; n2 < 3; ++n2) {
            jMenuItem = new JMenuItem((new String[]{"Cut", "Copy", "Paste"})[n2], (new char[]{'T', 'C', 'P'})[n2]);
            jMenuItem.addActionListener(this);
            jMenu2.add(jMenuItem);
        }
        ButtonGroup buttonGroup = new ButtonGroup();
        for (n2 = 0; n2 < 3; ++n2) {
            jMenuItem = new JRadioButtonMenuItem((new String[]{"Metal", "Windows", "Motif"})[n2], (new boolean[]{true, false, false})[n2]);
            buttonGroup.add(jMenuItem);
            jMenuItem.addActionListener(this);
            jMenu3.add(jMenuItem);
        }
        jMenuBar.add(jMenu);
        jMenuBar.add(jMenu2);
        jMenuBar.add(jMenu3);
        this.setJMenuBar(jMenuBar);
        this.consoleTextArea = new ConsoleTextArea(stringArray);
        this.setContentPane(new JScrollPane(this.consoleTextArea));
        this.consoleTextArea.setRows(24);
        this.consoleTextArea.setColumns(80);
        this.addWindowListener(new JSConsole$2(this));
        this.pack();
        this.setVisible(true);
        Main.setIn(this.consoleTextArea.getIn());
        Main.setOut(this.consoleTextArea.getOut());
        Main.setErr(this.consoleTextArea.getErr());
        Main.main(stringArray);
    }

    public static void main(String[] stringArray) {
        new JSConsole(stringArray);
    }

    @Override
    public void actionPerformed(ActionEvent object) {
        if (((String)(object = ((ActionEvent)object).getActionCommand())).equals("Load")) {
            object = this.chooseFile();
            if (object != null) {
                object = ((String)object).replace('\\', '/');
                ConsoleTextArea consoleTextArea = this.consoleTextArea;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("load(\"");
                stringBuilder.append((String)object);
                stringBuilder.append("\");");
                consoleTextArea.eval(stringBuilder.toString());
            }
        } else if (((String)object).equals("Exit")) {
            System.exit(0);
        } else if (((String)object).equals("Cut")) {
            this.consoleTextArea.cut();
        } else if (((String)object).equals("Copy")) {
            this.consoleTextArea.copy();
        } else if (((String)object).equals("Paste")) {
            this.consoleTextArea.paste();
        } else if ((object = ((String)object).equals("Metal") ? "javax.swing.plaf.metal.MetalLookAndFeel" : (((String)object).equals("Windows") ? "com.sun.java.swing.plaf.windows.WindowsLookAndFeel" : (((String)object).equals("Motif") ? "com.sun.java.swing.plaf.motif.MotifLookAndFeel" : null))) != null) {
            try {
                UIManager.setLookAndFeel((String)object);
                SwingUtilities.updateComponentTreeUI(this);
                this.consoleTextArea.postUpdateUI();
                this.createFileChooser();
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Platform", 0);
            }
        }
    }

    public String chooseFile() {
        Object object;
        if (this.CWD == null && (object = SecurityUtilities.getSystemProperty("user.dir")) != null) {
            this.CWD = new File((String)object);
        }
        if ((object = this.CWD) != null) {
            this.dlg.setCurrentDirectory((File)object);
        }
        this.dlg.setDialogTitle("Select a file to load");
        if (this.dlg.showOpenDialog(this) == 0) {
            object = this.dlg.getSelectedFile().getPath();
            this.CWD = new File(this.dlg.getSelectedFile().getParent());
            return object;
        }
        return null;
    }

    public void createFileChooser() {
        this.dlg = new JFileChooser();
        JSConsole$1 jSConsole$1 = new JSConsole$1(this);
        this.dlg.addChoosableFileFilter(jSConsole$1);
    }
}

