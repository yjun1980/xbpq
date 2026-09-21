/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.mozilla.javascript.tools.debugger.MoreWindows;
import org.mozilla.javascript.tools.debugger.MoreWindows$1;

class MoreWindows$MouseHandler
extends MouseAdapter {
    final MoreWindows this$0;

    private MoreWindows$MouseHandler(MoreWindows moreWindows) {
        this.this$0 = moreWindows;
    }

    /* synthetic */ MoreWindows$MouseHandler(MoreWindows moreWindows, MoreWindows$1 moreWindows$1) {
        this(moreWindows);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            MoreWindows.access$200(this.this$0).doClick();
        }
    }
}

