/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.mozilla.javascript.tools.debugger.FindFunction;

class FindFunction$MouseHandler
extends MouseAdapter {
    final FindFunction this$0;

    FindFunction$MouseHandler(FindFunction findFunction) {
        this.this$0 = findFunction;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            FindFunction.access$100(this.this$0).doClick();
        }
    }
}

