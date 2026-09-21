/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.UIManager;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.text.BadLocationException;
import org.mozilla.javascript.tools.debugger.FilePopupMenu;
import org.mozilla.javascript.tools.debugger.FileWindow;

class FileTextArea
extends JTextArea
implements ActionListener,
PopupMenuListener,
KeyListener,
MouseListener {
    private static final long serialVersionUID = -25032065448563720L;
    private FilePopupMenu popup;
    private FileWindow w;

    public FileTextArea(FileWindow jComponent) {
        this.w = jComponent;
        jComponent = new FilePopupMenu(this);
        this.popup = jComponent;
        ((JPopupMenu)jComponent).addPopupMenuListener(this);
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setFont(new Font("Monospaced", 0, Math.max(12, UIManager.getFont("Label.font").getSize())));
    }

    private void checkPopup(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            this.popup.show(this, mouseEvent.getX(), mouseEvent.getY());
        }
    }

    @Override
    public void actionPerformed(ActionEvent object) {
        FilePopupMenu filePopupMenu = this.popup;
        int n2 = this.viewToModel(new Point(filePopupMenu.x, filePopupMenu.y));
        this.popup.setVisible(false);
        object = ((ActionEvent)object).getActionCommand();
        try {
            n2 = this.getLineOfOffset(n2);
        }
        catch (Exception exception) {
            n2 = -1;
        }
        if (((String)object).equals("Set Breakpoint")) {
            this.w.setBreakPoint(n2 + 1);
        } else if (((String)object).equals("Clear Breakpoint")) {
            this.w.clearBreakPoint(n2 + 1);
        } else if (((String)object).equals("Run")) {
            this.w.load();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int n2 = keyEvent.getKeyCode();
        if (n2 != 127) {
            switch (n2) {
                default: {
                    return;
                }
                case 8: 
                case 9: 
                case 10: 
            }
        }
        keyEvent.consume();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        keyEvent.consume();
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        keyEvent.consume();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.checkPopup(mouseEvent);
        this.requestFocus();
        this.getCaret().setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        this.checkPopup(mouseEvent);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        this.checkPopup(mouseEvent);
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void select(int n2) {
        block6: {
            Rectangle rectangle;
            Rectangle rectangle2;
            block7: {
                if (n2 < 0) return;
                try {
                    int n3 = this.getLineOfOffset(n2);
                    rectangle2 = this.modelToView(n2);
                    if (rectangle2 == null) break block6;
                    rectangle = this.modelToView(this.getLineStartOffset(n3 + 1));
                    if (rectangle != null) {
                        rectangle2 = rectangle;
                    }
                    break block7;
                }
                catch (BadLocationException badLocationException) {
                    this.select(n2, n2);
                }
                return;
                catch (Exception exception) {}
            }
            rectangle = ((JViewport)this.getParent()).getViewRect();
            if (rectangle.y + rectangle.height <= rectangle2.y) {
                rectangle2.y += (rectangle.height - rectangle2.height) / 2;
                this.scrollRectToVisible(rectangle2);
            }
        }
        this.select(n2, n2);
    }
}

