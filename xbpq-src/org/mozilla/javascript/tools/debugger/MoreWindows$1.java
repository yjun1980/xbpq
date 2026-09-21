/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import org.mozilla.javascript.tools.debugger.MoreWindows;

class MoreWindows$1
extends KeyAdapter {
    final MoreWindows this$0;

    MoreWindows$1(MoreWindows moreWindows) {
        this.this$0 = moreWindows;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 27) {
            keyEvent.consume();
            MoreWindows.access$102(this.this$0, null);
            this.this$0.setVisible(false);
        }
    }
}

