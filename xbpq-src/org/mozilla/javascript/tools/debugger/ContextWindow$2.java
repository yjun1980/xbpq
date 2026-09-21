/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import org.mozilla.javascript.tools.debugger.ContextWindow;

class ContextWindow$2
implements ContainerListener {
    final ContextWindow this$0;
    final JPanel val$finalP2;
    final JSplitPane val$finalSplit;
    final JToolBar val$finalT1;
    final JToolBar val$finalT2;
    final JPanel val$finalThis;

    ContextWindow$2(ContextWindow contextWindow, JPanel jPanel, JToolBar jToolBar, JToolBar jToolBar2, JPanel jPanel2, JSplitPane jSplitPane) {
        this.this$0 = contextWindow;
        this.val$finalThis = jPanel;
        this.val$finalT1 = jToolBar;
        this.val$finalT2 = jToolBar2;
        this.val$finalP2 = jPanel2;
        this.val$finalSplit = jSplitPane;
    }

    @Override
    public void componentAdded(ContainerEvent serializable) {
        JSplitPane jSplitPane = (JSplitPane)this.val$finalThis.getParent();
        if (((ContainerEvent)serializable).getChild() == this.val$finalT1) {
            double d2;
            if (this.val$finalT2.getParent() == this.val$finalP2) {
                serializable = this.val$finalSplit;
                d2 = 0.5;
            } else {
                serializable = this.val$finalSplit;
                d2 = 1.0;
            }
            ((JSplitPane)serializable).setDividerLocation(d2);
            jSplitPane.setDividerLocation(0.66);
        }
    }

    @Override
    public void componentRemoved(ContainerEvent containerEvent) {
        JSplitPane jSplitPane = (JSplitPane)this.val$finalThis.getParent();
        if (containerEvent.getChild() == this.val$finalT1) {
            double d2;
            if (this.val$finalT2.getParent() == this.val$finalP2) {
                this.val$finalSplit.setDividerLocation(0.0);
                d2 = 0.66;
            } else {
                d2 = 1.0;
            }
            jSplitPane.setDividerLocation(d2);
        }
    }
}

