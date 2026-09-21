/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import org.mozilla.javascript.tools.debugger.FindFunction;

class FindFunction$1
extends KeyAdapter {
    final FindFunction this$0;

    FindFunction$1(FindFunction findFunction) {
        this.this$0 = findFunction;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 27) {
            keyEvent.consume();
            FindFunction.access$002(this.this$0, null);
            this.this$0.setVisible(false);
        }
    }
}

