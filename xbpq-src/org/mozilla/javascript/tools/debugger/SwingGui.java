/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import java.awt.AWTEvent;
import java.awt.ActiveEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.MenuComponent;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Dictionary;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.BadLocationException;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.tools.debugger.ContextWindow;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.Dim$ContextData;
import org.mozilla.javascript.tools.debugger.Dim$SourceInfo;
import org.mozilla.javascript.tools.debugger.Dim$StackFrame;
import org.mozilla.javascript.tools.debugger.FileWindow;
import org.mozilla.javascript.tools.debugger.FindFunction;
import org.mozilla.javascript.tools.debugger.GuiCallback;
import org.mozilla.javascript.tools.debugger.JSInternalConsole;
import org.mozilla.javascript.tools.debugger.Menubar;
import org.mozilla.javascript.tools.debugger.MessageDialogWrapper;
import org.mozilla.javascript.tools.debugger.MoreWindows;
import org.mozilla.javascript.tools.debugger.RunProxy;
import org.mozilla.javascript.tools.debugger.SwingGui$1;
import org.mozilla.javascript.tools.debugger.SwingGui$2;

public class SwingGui
extends JFrame
implements GuiCallback {
    private static final long serialVersionUID = -8217029773456711621L;
    private EventQueue awtEventQueue;
    private JSInternalConsole console;
    private ContextWindow context;
    private FileWindow currentWindow;
    private JDesktopPane desk;
    Dim dim;
    JFileChooser dlg;
    private Runnable exitAction;
    private final Map<String, FileWindow> fileWindows;
    private Menubar menubar;
    private JSplitPane split1;
    private JLabel statusBar;
    private JToolBar toolBar;
    private final Map<String, JFrame> toplevels = Collections.synchronizedMap(new HashMap());

    public SwingGui(Dim dim, String string) {
        super(string);
        this.fileWindows = Collections.synchronizedMap(new TreeMap());
        this.dim = dim;
        this.init();
        dim.setGuiCallback(this);
    }

    static /* synthetic */ void access$000(SwingGui swingGui) {
        swingGui.exit();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String chooseFile(String object) {
        this.dlg.setDialogTitle((String)object);
        object = SecurityUtilities.getSystemProperty("user.dir");
        object = object != null ? new File((String)object) : null;
        if (object != null) {
            this.dlg.setCurrentDirectory((File)object);
        }
        if (this.dlg.showOpenDialog(this) != 0) return null;
        try {
            String string = this.dlg.getSelectedFile().getCanonicalPath();
            File file = this.dlg.getSelectedFile().getParentFile();
            object = System.getProperties();
            ((Dictionary)object).put("user.dir", file.getPath());
            System.setProperties((Properties)object);
            return string;
        }
        catch (IOException | SecurityException exception) {
            return null;
        }
    }

    private void exit() {
        Runnable runnable = this.exitAction;
        if (runnable != null) {
            SwingUtilities.invokeLater(runnable);
        }
        this.dim.setReturnValue(5);
    }

    private JInternalFrame getSelectedFrame() {
        JInternalFrame[] jInternalFrameArray = this.desk.getAllFrames();
        for (int i2 = 0; i2 < jInternalFrameArray.length; ++i2) {
            if (!jInternalFrameArray[i2].isShowing()) continue;
            return jInternalFrameArray[i2];
        }
        return jInternalFrameArray[jInternalFrameArray.length - 1];
    }

    static String getShortName(String string) {
        int n2;
        int n3 = n2 = string.lastIndexOf(47);
        if (n2 < 0) {
            n3 = string.lastIndexOf(92);
        }
        String string2 = string;
        if (n3 >= 0) {
            string2 = string;
            if (++n3 < string.length()) {
                string2 = string.substring(n3);
            }
        }
        return string2;
    }

    private JMenu getWindowMenu() {
        return this.menubar.getMenu(3);
    }

    private void init() {
        Object object = new Menubar(this);
        this.menubar = object;
        this.setJMenuBar((JMenuBar)object);
        this.toolBar = new JToolBar();
        Object object2 = new String[]{"Break (Pause)", "Go (F5)", "Step Into (F11)", "Step Over (F7)", "Step Out (F8)"};
        JButton jButton = new JButton("Break");
        jButton.setToolTipText("Break");
        jButton.setActionCommand("Break");
        jButton.addActionListener(this.menubar);
        jButton.setEnabled(true);
        jButton.setToolTipText(object2[0]);
        JComponent jComponent = new JButton("Go");
        jComponent.setToolTipText("Go");
        ((AbstractButton)jComponent).setActionCommand("Go");
        ((AbstractButton)jComponent).addActionListener(this.menubar);
        ((AbstractButton)jComponent).setEnabled(false);
        jComponent.setToolTipText(object2[1]);
        JButton jButton2 = new JButton("Step Into");
        jButton2.setToolTipText("Step Into");
        jButton2.setActionCommand("Step Into");
        jButton2.addActionListener(this.menubar);
        jButton2.setEnabled(false);
        jButton2.setToolTipText(object2[2]);
        object = new JButton("Step Over");
        ((JComponent)object).setToolTipText("Step Over");
        ((AbstractButton)object).setActionCommand("Step Over");
        ((AbstractButton)object).setEnabled(false);
        ((AbstractButton)object).addActionListener(this.menubar);
        ((JComponent)object).setToolTipText(object2[3]);
        JComponent jComponent2 = new JButton("Step Out");
        jComponent2.setToolTipText("Step Out");
        ((AbstractButton)jComponent2).setActionCommand("Step Out");
        ((AbstractButton)jComponent2).setEnabled(false);
        ((AbstractButton)jComponent2).addActionListener(this.menubar);
        jComponent2.setToolTipText(object2[4]);
        object2 = ((JComponent)object).getPreferredSize();
        jButton.setPreferredSize((Dimension)object2);
        jButton.setMinimumSize((Dimension)object2);
        jButton.setMaximumSize((Dimension)object2);
        jButton.setSize((Dimension)object2);
        jComponent.setPreferredSize((Dimension)object2);
        jComponent.setMinimumSize((Dimension)object2);
        jComponent.setMaximumSize((Dimension)object2);
        jButton2.setPreferredSize((Dimension)object2);
        jButton2.setMinimumSize((Dimension)object2);
        jButton2.setMaximumSize((Dimension)object2);
        ((JComponent)object).setPreferredSize((Dimension)object2);
        ((JComponent)object).setMinimumSize((Dimension)object2);
        ((JComponent)object).setMaximumSize((Dimension)object2);
        jComponent2.setPreferredSize((Dimension)object2);
        jComponent2.setMinimumSize((Dimension)object2);
        jComponent2.setMaximumSize((Dimension)object2);
        this.toolBar.add(jButton);
        this.toolBar.add(jComponent);
        this.toolBar.add(jButton2);
        this.toolBar.add((Component)object);
        this.toolBar.add(jComponent2);
        object = new JPanel();
        ((Container)object).setLayout(new BorderLayout());
        this.getContentPane().add((Component)this.toolBar, "North");
        this.getContentPane().add((Component)object, "Center");
        jComponent = new JDesktopPane();
        this.desk = jComponent;
        jComponent.setPreferredSize(new Dimension(600, 300));
        this.desk.setMinimumSize(new Dimension(150, 50));
        jComponent2 = this.desk;
        jComponent = new JSInternalConsole("JavaScript Console");
        this.console = jComponent;
        jComponent2.add(jComponent);
        jComponent = new ContextWindow(this);
        this.context = jComponent;
        jComponent.setPreferredSize(new Dimension(600, 120));
        this.context.setMinimumSize(new Dimension(50, 50));
        jComponent = new JSplitPane(0, this.desk, this.context);
        this.split1 = jComponent;
        ((JSplitPane)jComponent).setOneTouchExpandable(true);
        SwingGui.setResizeWeight(this.split1, 0.66);
        ((Container)object).add((Component)this.split1, "Center");
        jComponent = new JLabel();
        this.statusBar = jComponent;
        ((JLabel)jComponent).setText("Thread: ");
        ((Container)object).add((Component)this.statusBar, "South");
        this.dlg = new JFileChooser();
        object = new SwingGui$1(this);
        this.dlg.addChoosableFileFilter((FileFilter)object);
        this.addWindowListener(new SwingGui$2(this));
    }

    /*
     * Unable to fully structure code
     */
    private String readFile(String var1_1) {
        var3_2 = new FileReader(var1_1);
        var2_4 = Kit.readReader(var3_2);
        var3_2.close();
        var1_1 = var2_4;
        catch (Throwable var4_7) {
            try {
                throw var4_7;
            }
            catch (Throwable var2_5) {
                try {
                    var3_2.close();
                    ** GOTO lbl19
                }
                catch (Throwable var3_3) {
                    try {
                        var4_7.addSuppressed(var3_3);
lbl19:
                        // 2 sources

                        throw var2_5;
                    }
                    catch (IOException var2_6) {
                        MessageDialogWrapper.showMessageDialog(this, var2_6.getMessage(), e.c("Error reading ", var1_1), 0);
                        var1_1 = null;
                    }
                }
            }
        }
        return var1_1;
    }

    /*
     * Unable to fully structure code
     */
    private void setFilePosition(FileWindow var1_1, int var2_3) {
        block9: {
            var3_4 = var1_1.textArea;
            if (var2_3 != -1) ** GOTO lbl8
            var1_1.setPosition(-1);
            if (this.currentWindow == var1_1) {
                this.currentWindow = null;
            }
            break block9;
lbl8:
            // 1 sources

            var2_3 = var3_4.getLineStartOffset(var2_3 - 1);
            var3_4 = this.currentWindow;
            if (var3_4 == null || var3_4 == var1_1) ** GOTO lbl13
            try {
                var3_4.setPosition(-1);
lbl13:
                // 2 sources

                var1_1.setPosition(var2_3);
                this.currentWindow = var1_1;
            }
            catch (BadLocationException var3_5) {
                ** continue;
            }
        }
lbl16:
        // 2 sources

        while (true) {
            if (var1_1.isIcon()) {
                this.desk.getDesktopManager().deiconifyFrame(var1_1);
            }
            this.desk.getDesktopManager().activateFrame(var1_1);
            var1_1.show();
            var1_1.toFront();
            var1_1.setSelected(true);
lbl24:
            // 2 sources

            return;
            break;
        }
        catch (Exception var1_2) {
            ** continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void setResizeWeight(JSplitPane jSplitPane, double d2) {
        try {
            JSplitPane.class.getMethod("setResizeWeight", Double.TYPE).invoke(jSplitPane, d2);
            return;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return;
        }
    }

    private void updateEnabled(boolean bl) {
        ((Menubar)this.getJMenuBar()).updateEnabled(bl);
        int n2 = this.toolBar.getComponentCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            boolean bl2 = i2 == 0 ? bl ^ true : bl;
            this.toolBar.getComponent(i2).setEnabled(bl2);
        }
        if (bl) {
            this.toolBar.setEnabled(true);
            if (this.getExtendedState() == 1) {
                this.setExtendedState(0);
            }
            this.toFront();
            this.context.setEnabled(true);
        } else {
            FileWindow fileWindow = this.currentWindow;
            if (fileWindow != null) {
                fileWindow.setPosition(-1);
            }
            this.context.setEnabled(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void actionPerformed(ActionEvent object) {
        int n2;
        block26: {
            block23: {
                block24: {
                    String string;
                    block38: {
                        int n3;
                        block37: {
                            int n4;
                            block36: {
                                block35: {
                                    block34: {
                                        block33: {
                                            block32: {
                                                String string2;
                                                block31: {
                                                    String string3;
                                                    block30: {
                                                        block29: {
                                                            block28: {
                                                                block27: {
                                                                    block25: {
                                                                        string = ((ActionEvent)object).getActionCommand();
                                                                        boolean bl = string.equals("Cut");
                                                                        n2 = 2;
                                                                        if (bl || string.equals("Copy") || string.equals("Paste")) break block24;
                                                                        if (!string.equals("Step Over")) break block25;
                                                                        n2 = 0;
                                                                        break block26;
                                                                    }
                                                                    if (!string.equals("Step Into")) break block27;
                                                                    n2 = 1;
                                                                    break block26;
                                                                }
                                                                if (string.equals("Step Out")) break block26;
                                                                if (!string.equals("Go")) break block28;
                                                                n2 = 3;
                                                                break block26;
                                                            }
                                                            if (!string.equals("Break")) break block29;
                                                            this.dim.setBreak();
                                                            break block23;
                                                        }
                                                        if (!string.equals("Exit")) break block30;
                                                        this.exit();
                                                        break block23;
                                                    }
                                                    if (!string.equals("Open")) break block31;
                                                    object = this.chooseFile("Select a file to compile");
                                                    if (object == null || (string3 = this.readFile((String)object)) == null) break block23;
                                                    RunProxy runProxy = new RunProxy(this, 1);
                                                    runProxy.fileName = object;
                                                    runProxy.text = string3;
                                                    object = new Thread(runProxy);
                                                    break block32;
                                                }
                                                if (!string.equals("Load")) break block33;
                                                object = this.chooseFile("Select a file to execute");
                                                if (object == null || (string2 = this.readFile((String)object)) == null) break block23;
                                                RunProxy runProxy = new RunProxy(this, 2);
                                                runProxy.fileName = object;
                                                runProxy.text = string2;
                                                object = new Thread(runProxy);
                                            }
                                            ((Thread)object).start();
                                            break block23;
                                        }
                                        if (!string.equals("More Windows...")) break block34;
                                        new MoreWindows(this, this.fileWindows, "Window", "Files").showDialog(this);
                                        break block23;
                                    }
                                    if (!string.equals("Console")) break block35;
                                    if (this.console.isIcon()) {
                                        this.desk.getDesktopManager().deiconifyFrame(this.console);
                                    }
                                    this.console.show();
                                    this.desk.getDesktopManager().activateFrame(this.console);
                                    this.console.consoleTextArea.requestFocus();
                                    break block23;
                                }
                                if (string.equals("Cut") || string.equals("Copy") || string.equals("Paste")) break block23;
                                if (!string.equals("Go to function...")) break block36;
                                new FindFunction(this, "Go to function", "Function").showDialog(this);
                                break block23;
                            }
                            if (string.equals("Go to line...")) {
                                object = (String)JOptionPane.showInputDialog(this, "Line number", "Go to line...", 3, null, null, null);
                                if (object == null) return;
                                if (((String)object).trim().length() == 0) {
                                    return;
                                }
                                this.showFileWindow(null, Integer.parseInt((String)object));
                            }
                            if (!string.equals("Tile")) break block37;
                            object = this.desk.getAllFrames();
                            int n5 = ((Object)object).length;
                            n2 = (int)Math.sqrt(n5);
                            if (n2 * n2 < n5) {
                                n4 = n2 + 1;
                                if (n2 * n4 < n5) {
                                    n2 = n4;
                                } else {
                                    n5 = n2;
                                    n2 = n4;
                                    n4 = n5;
                                }
                            } else {
                                n4 = n2;
                            }
                            Dimension dimension = this.desk.getSize();
                            int n6 = dimension.width / n2;
                            int n7 = dimension.height / n4;
                            n5 = 0;
                            for (int i2 = 0; i2 < n4; n5 += n7, ++i2) {
                                int n8;
                                int n9 = 0;
                                for (int i4 = 0; i4 < n2 && (n8 = i2 * n2 + i4) < ((Object)object).length; n9 += n6, ++i4) {
                                    Object object2 = object[n8];
                                    try {
                                        ((JInternalFrame)object2).setIcon(false);
                                        ((JInternalFrame)object2).setMaximum(false);
                                    }
                                    catch (Exception exception) {}
                                    this.desk.getDesktopManager().setBoundsForFrame((JComponent)object2, n9, n5, n6, n7);
                                }
                            }
                            break block23;
                        }
                        if (!string.equals("Cascade")) break block38;
                        JInternalFrame[] jInternalFrameArray = this.desk.getAllFrames();
                        int n10 = jInternalFrameArray.length;
                        n2 = n3 = this.desk.getHeight() / n10;
                        if (n3 > 30) {
                            n2 = 30;
                        }
                        int n11 = n10 - 1;
                        n10 = 0;
                        n3 = 0;
                        while (n11 >= 0) {
                            object = jInternalFrameArray[n11];
                            try {
                                ((JInternalFrame)object).setIcon(false);
                                ((JInternalFrame)object).setMaximum(false);
                            }
                            catch (Exception exception) {}
                            Dimension dimension = ((JComponent)object).getPreferredSize();
                            int n12 = dimension.width;
                            int n13 = dimension.height;
                            this.desk.getDesktopManager().setBoundsForFrame((JComponent)object, n10, n3, n12, n13);
                            --n11;
                            n10 += n2;
                            n3 += n2;
                        }
                        break block23;
                    }
                    object = this.getFileWindow(string);
                    if (object == null) break block23;
                    try {
                        if (((JInternalFrame)object).isIcon()) {
                            ((JInternalFrame)object).setIcon(false);
                        }
                        ((JComponent)object).setVisible(true);
                        ((JInternalFrame)object).moveToFront();
                        ((JInternalFrame)object).setSelected(true);
                        break block23;
                    }
                    catch (Exception | NumberFormatException exception) {}
                    break block23;
                }
                JInternalFrame jInternalFrame = this.getSelectedFrame();
                if (jInternalFrame != null && jInternalFrame instanceof ActionListener) {
                    ((ActionListener)((Object)jInternalFrame)).actionPerformed((ActionEvent)object);
                }
            }
            n2 = -1;
        }
        if (n2 == -1) return;
        this.updateEnabled(false);
        this.dim.setReturnValue(n2);
    }

    void addTopLevel(String string, JFrame jFrame) {
        if (jFrame != this) {
            this.toplevels.put(string, jFrame);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void createFileWindow(Dim$SourceInfo object, int n2) {
        String string = ((Dim$SourceInfo)object).url();
        object = new FileWindow(this, (Dim$SourceInfo)object);
        this.fileWindows.put(string, (FileWindow)object);
        if (n2 != -1) {
            FileWindow fileWindow = this.currentWindow;
            if (fileWindow != null) {
                fileWindow.setPosition(-1);
            }
            try {
                ((FileWindow)object).setPosition(((FileWindow)object).textArea.getLineStartOffset(n2 - 1));
            }
            catch (BadLocationException badLocationException) {
                try {
                    ((FileWindow)object).setPosition(((FileWindow)object).textArea.getLineStartOffset(0));
                }
                catch (BadLocationException badLocationException2) {
                    ((FileWindow)object).setPosition(-1);
                }
            }
        }
        this.desk.add((Component)object);
        if (n2 != -1) {
            this.currentWindow = object;
        }
        this.menubar.addFile(string);
        ((JComponent)object).setVisible(true);
        try {
            ((JInternalFrame)object).setMaximum(true);
            ((JInternalFrame)object).setSelected(true);
            ((JInternalFrame)object).moveToFront();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @Override
    public void dispatchNextGuiEvent() {
        Object object;
        Object object2 = object = this.awtEventQueue;
        if (object == null) {
            this.awtEventQueue = object2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        if ((object2 = ((EventQueue)object2).getNextEvent()) instanceof ActiveEvent) {
            ((ActiveEvent)object2).dispatch();
        } else {
            object = ((EventObject)object2).getSource();
            if (object instanceof Component) {
                ((Component)object).dispatchEvent((AWTEvent)object2);
            } else if (object instanceof MenuComponent) {
                ((MenuComponent)object).dispatchEvent((AWTEvent)object2);
            }
        }
    }

    @Override
    public void enterInterrupt(Dim$StackFrame dim$StackFrame, String string, String string2) {
        if (SwingUtilities.isEventDispatchThread()) {
            this.enterInterruptImpl(dim$StackFrame, string, string2);
        } else {
            RunProxy runProxy = new RunProxy(this, 4);
            runProxy.lastFrame = dim$StackFrame;
            runProxy.threadTitle = string;
            runProxy.alertMessage = string2;
            SwingUtilities.invokeLater(runProxy);
        }
    }

    void enterInterruptImpl(Dim$StackFrame object, String string, String object2) {
        this.statusBar.setText(e.c("Thread: ", string));
        this.showStopLine((Dim$StackFrame)object);
        if (object2 != null) {
            MessageDialogWrapper.showMessageDialog(this, (String)object2, "Exception in Script", 0);
        }
        this.updateEnabled(true);
        object2 = ((Dim$StackFrame)object).contextData();
        object = this.context;
        JComboBox<String> jComboBox = ((ContextWindow)object).context;
        List<String> list = ((ContextWindow)object).toolTips;
        ((ContextWindow)object).disableUpdate();
        int n2 = ((Dim$ContextData)object2).frameCount();
        jComboBox.removeAllItems();
        jComboBox.setSelectedItem(null);
        list.clear();
        for (int i2 = 0; i2 < n2; ++i2) {
            object = ((Dim$ContextData)object2).getFrame(i2);
            string = ((Dim$StackFrame)object).getUrl();
            int n3 = ((Dim$StackFrame)object).getLineNumber();
            if (string.length() > 20) {
                object = a.c("...");
                ((StringBuilder)object).append(string.substring(string.length() - 17));
                object = ((StringBuilder)object).toString();
            } else {
                object = string;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\"");
            stringBuilder.append((String)object);
            stringBuilder.append("\", line ");
            stringBuilder.append(n3);
            jComboBox.insertItemAt(stringBuilder.toString(), i2);
            object = new StringBuilder();
            ((StringBuilder)object).append("\"");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("\", line ");
            ((StringBuilder)object).append(n3);
            list.add(((StringBuilder)object).toString());
        }
        this.context.enableUpdate();
        jComboBox.setSelectedIndex(0);
        jComboBox.setMinimumSize(new Dimension(50, jComboBox.getMinimumSize().height));
    }

    public JSInternalConsole getConsole() {
        return this.console;
    }

    FileWindow getFileWindow(String string) {
        if (string != null && !string.equals("<stdin>")) {
            return this.fileWindows.get(string);
        }
        return null;
    }

    public Menubar getMenubar() {
        return this.menubar;
    }

    @Override
    public boolean isGuiEventThread() {
        return SwingUtilities.isEventDispatchThread();
    }

    void removeWindow(FileWindow jComponent) {
        this.fileWindows.remove(((FileWindow)jComponent).getUrl());
        JMenu jMenu = this.getWindowMenu();
        int n2 = jMenu.getItemCount();
        int n3 = n2 - 1;
        JMenuItem jMenuItem = jMenu.getItem(n3);
        Object object = SwingGui.getShortName(((FileWindow)jComponent).getUrl());
        for (int i2 = 5; i2 < n2; ++i2) {
            String string;
            jComponent = jMenu.getItem(i2);
            if (jComponent == null || !(string = ((AbstractButton)jComponent).getText()).substring(string.indexOf(32) + 1).equals(object)) continue;
            jMenu.remove((JMenuItem)jComponent);
            if (n2 == 6) {
                jMenu.remove(4);
                break;
            }
            int n4 = i2 - 4;
            while (i2 < n3) {
                object = jMenu.getItem(i2);
                int n5 = n4;
                if (object != null) {
                    string = ((AbstractButton)object).getText();
                    if (string.equals("More Windows...")) break;
                    n5 = string.indexOf(32);
                    StringBuilder stringBuilder = new StringBuilder();
                    int n6 = n4 + 48;
                    stringBuilder.append((char)n6);
                    stringBuilder.append(" ");
                    stringBuilder.append(string.substring(n5 + 1));
                    ((AbstractButton)object).setText(stringBuilder.toString());
                    ((AbstractButton)object).setMnemonic(n6);
                    n5 = n4 + 1;
                }
                ++i2;
                n4 = n5;
            }
            if (n2 - 6 != 0 || jMenuItem == jComponent || !jMenuItem.getText().equals("More Windows...")) break;
            jMenu.remove(jMenuItem);
            break;
        }
        jMenu.revalidate();
    }

    public void setExitAction(Runnable runnable) {
        this.exitAction = runnable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        if (!bl) return;
        this.console.consoleTextArea.requestFocus();
        this.context.split.setDividerLocation(0.5);
        try {
            this.console.setMaximum(true);
            this.console.setSelected(true);
            this.console.show();
            this.console.consoleTextArea.requestFocus();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void showFileWindow(String string, int n2) {
        JInternalFrame jInternalFrame;
        jInternalFrame = string != null ? this.getFileWindow(string) : ((jInternalFrame = this.getSelectedFrame()) != null && jInternalFrame instanceof FileWindow ? (FileWindow)jInternalFrame : this.currentWindow);
        JInternalFrame jInternalFrame2 = jInternalFrame;
        if (jInternalFrame == null) {
            jInternalFrame2 = jInternalFrame;
            if (string != null) {
                this.createFileWindow(this.dim.sourceInfo(string), -1);
                jInternalFrame2 = this.getFileWindow(string);
            }
        }
        if (jInternalFrame2 == null) {
            return;
        }
        if (n2 > -1) {
            int n3 = ((FileWindow)jInternalFrame2).getPosition(n2 - 1);
            n2 = ((FileWindow)jInternalFrame2).getPosition(n2);
            if (n3 <= 0) {
                return;
            }
            ((FileWindow)jInternalFrame2).textArea.select(n3);
            ((FileWindow)jInternalFrame2).textArea.setCaretPosition(n3);
            ((FileWindow)jInternalFrame2).textArea.moveCaretPosition(n2 - 1);
        }
        try {
            if (jInternalFrame2.isIcon()) {
                jInternalFrame2.setIcon(false);
            }
            jInternalFrame2.setVisible(true);
            jInternalFrame2.moveToFront();
            jInternalFrame2.setSelected(true);
            this.requestFocus();
            jInternalFrame2.requestFocus();
            ((FileWindow)jInternalFrame2).textArea.requestFocus();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    void showStopLine(Dim$StackFrame object) {
        String string = ((Dim$StackFrame)object).getUrl();
        if (string != null && !string.equals("<stdin>")) {
            this.showFileWindow(string, -1);
            int n2 = ((Dim$StackFrame)object).getLineNumber();
            object = this.getFileWindow(string);
            if (object != null) {
                this.setFilePosition((FileWindow)object, n2);
            }
        } else if (this.console.isVisible()) {
            this.console.show();
        }
    }

    protected boolean updateFileWindow(Dim$SourceInfo dim$SourceInfo) {
        FileWindow fileWindow = this.getFileWindow(dim$SourceInfo.url());
        if (fileWindow != null) {
            fileWindow.updateText(dim$SourceInfo);
            fileWindow.show();
            return true;
        }
        return false;
    }

    @Override
    public void updateSourceText(Dim$SourceInfo dim$SourceInfo) {
        RunProxy runProxy = new RunProxy(this, 3);
        runProxy.sourceInfo = dim$SourceInfo;
        SwingUtilities.invokeLater(runProxy);
    }
}

