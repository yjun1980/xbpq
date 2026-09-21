/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import org.mozilla.javascript.tools.debugger.ContextWindow;
import org.mozilla.javascript.tools.debugger.ContextWindow$1$1;
import org.mozilla.javascript.tools.debugger.SwingGui;

class ContextWindow$1
implements ComponentListener {
    boolean t2Docked;
    final ContextWindow this$0;
    final SwingGui val$debugGui;
    final JPanel val$finalP1;
    final JPanel val$finalP2;
    final JSplitPane val$finalSplit;
    final JToolBar val$finalT1;
    final JToolBar val$finalT2;
    final JPanel val$finalThis;

    ContextWindow$1(ContextWindow contextWindow, JPanel jPanel, JToolBar jToolBar, JPanel jPanel2, SwingGui swingGui, JToolBar jToolBar2, JPanel jPanel3, JSplitPane jSplitPane) {
        this.this$0 = contextWindow;
        this.val$finalThis = jPanel;
        this.val$finalT1 = jToolBar;
        this.val$finalP1 = jPanel2;
        this.val$debugGui = swingGui;
        this.val$finalT2 = jToolBar2;
        this.val$finalP2 = jPanel3;
        this.val$finalSplit = jSplitPane;
        this.t2Docked = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    void check(Component object) {
        block13: {
            double d2;
            Container container;
            block14: {
                boolean bl;
                block12: {
                    boolean bl2;
                    boolean bl3;
                    container = this.val$finalThis.getParent();
                    if (container == null) {
                        return;
                    }
                    object = this.val$finalT1.getParent();
                    bl = false;
                    if (object != null && object != this.val$finalP1) {
                        while (!(object instanceof JFrame)) {
                            object = ((Component)object).getParent();
                        }
                        JFrame jFrame = (JFrame)object;
                        this.val$debugGui.addTopLevel("Variables", jFrame);
                        if (!jFrame.isResizable()) {
                            jFrame.setResizable(true);
                            jFrame.setDefaultCloseOperation(0);
                            object = (WindowListener[])jFrame.getListeners(WindowListener.class);
                            jFrame.removeWindowListener((WindowListener)object[0]);
                            jFrame.addWindowListener(new ContextWindow$1$1(this, (WindowListener[])object));
                        }
                        bl3 = false;
                    } else {
                        bl3 = true;
                    }
                    object = this.val$finalT2.getParent();
                    if (object != null && object != this.val$finalP2) {
                        while (!(object instanceof JFrame)) {
                            object = ((Component)object).getParent();
                        }
                        object = (JFrame)object;
                        this.val$debugGui.addTopLevel("Evaluate", (JFrame)object);
                        ((Frame)object).setResizable(true);
                    } else {
                        bl = true;
                    }
                    if (bl3 && (bl2 = this.t2Docked) && bl && bl2) {
                        return;
                    }
                    this.t2Docked = bl;
                    container = (JSplitPane)container;
                    if (!bl3) break block12;
                    container = this.val$finalSplit;
                    object = container;
                    if (!bl) break block13;
                    d2 = 0.5;
                    break block14;
                }
                object = container;
                if (!bl) break block13;
                this.val$finalSplit.setDividerLocation(0.0);
                d2 = 0.66;
            }
            ((JSplitPane)container).setDividerLocation(d2);
            return;
        }
        ((JSplitPane)object).setDividerLocation(1.0);
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
        this.check(componentEvent.getComponent());
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
        this.check(componentEvent.getComponent());
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.check(componentEvent.getComponent());
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
        this.check(componentEvent.getComponent());
    }
}

