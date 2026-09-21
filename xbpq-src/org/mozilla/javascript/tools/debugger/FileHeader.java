/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import org.mozilla.javascript.tools.debugger.FileTextArea;
import org.mozilla.javascript.tools.debugger.FileWindow;

class FileHeader
extends JPanel
implements MouseListener {
    private static final long serialVersionUID = -2858905404778259127L;
    private FileWindow fileWindow;
    private int pressLine = -1;

    public FileHeader(FileWindow fileWindow) {
        this.fileWindow = fileWindow;
        this.addMouseListener(this);
        this.update();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        int n2 = this.getFontMetrics(this.fileWindow.textArea.getFont()).getHeight();
        this.pressLine = mouseEvent.getY() / n2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.getComponent() == this && mouseEvent.getButton() == 1) {
            int n2 = mouseEvent.getY() / this.getFontMetrics(this.fileWindow.textArea.getFont()).getHeight();
            if (n2 == this.pressLine) {
                this.fileWindow.toggleBreakPoint(n2 + 1);
            } else {
                this.pressLine = -1;
            }
        }
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        FileTextArea fileTextArea = this.fileWindow.textArea;
        Object object = fileTextArea.getFont();
        graphics.setFont((Font)object);
        FontMetrics fontMetrics = this.getFontMetrics((Font)object);
        object = graphics.getClipBounds();
        graphics.setColor(this.getBackground());
        graphics.fillRect(((Rectangle)object).x, ((Rectangle)object).y, ((Rectangle)object).width, ((Rectangle)object).height);
        int n2 = fontMetrics.getMaxAscent();
        int n3 = fontMetrics.getHeight();
        int n4 = fileTextArea.getLineCount() + 1;
        Integer.toString(n4).length();
        int n5 = ((Rectangle)object).y / n3;
        int n6 = (((Rectangle)object).y + ((Rectangle)object).height) / n3 + 1;
        int n7 = this.getWidth();
        if (n6 <= n4) {
            n4 = n6;
        }
        while (n5 < n4) {
            int n8 = -2;
            try {
                n6 = fileTextArea.getLineStartOffset(n5);
            }
            catch (BadLocationException badLocationException) {
                n6 = n8;
            }
            object = this.fileWindow;
            n8 = n5 + 1;
            boolean bl = ((FileWindow)object).isBreakPoint(n8);
            object = new StringBuilder();
            ((StringBuilder)object).append(Integer.toString(n8));
            ((StringBuilder)object).append(" ");
            object = ((StringBuilder)object).toString();
            graphics.setColor(Color.blue);
            int n9 = (n5 *= n3) + n2;
            graphics.drawString((String)object, 0, n9);
            int n10 = n7 - n2;
            if (bl) {
                graphics.setColor(new Color(128, 0, 0));
                graphics.fillOval(n10, n9 -= 9, 9, 9);
                graphics.drawOval(n10, n9, 8, 8);
                graphics.drawOval(n10, n9, 9, 9);
            }
            if (n6 == this.fileWindow.currentPos) {
                object = new Polygon();
                int n11 = n2 - 10 + n5;
                n6 = n11 + 3;
                ((Polygon)object).addPoint(n10, n6);
                n9 = n10 + 5;
                ((Polygon)object).addPoint(n9, n6);
                n6 = n11;
                n5 = n9;
                while (n5 <= n10 + 10) {
                    ((Polygon)object).addPoint(n5, n6);
                    ++n5;
                    ++n6;
                }
                n5 = n10 + 9;
                while (n5 >= n9) {
                    ((Polygon)object).addPoint(n5, n6);
                    --n5;
                    ++n6;
                }
                n6 = n11 + 7;
                ((Polygon)object).addPoint(n9, n6);
                ((Polygon)object).addPoint(n10, n6);
                graphics.setColor(Color.yellow);
                graphics.fillPolygon((Polygon)object);
                graphics.setColor(Color.black);
                graphics.drawPolygon((Polygon)object);
            }
            n5 = n8;
        }
    }

    public void update() {
        Object object = this.fileWindow.textArea;
        Object object2 = ((Component)object).getFont();
        this.setFont((Font)object2);
        FontMetrics fontMetrics = this.getFontMetrics((Font)object2);
        int n2 = fontMetrics.getHeight();
        int n3 = ((JTextArea)object).getLineCount() + 1;
        object = object2 = Integer.toString(n3);
        if (((String)object2).length() < 2) {
            object = "99";
        }
        object2 = new Dimension();
        ((Dimension)object2).width = fontMetrics.stringWidth((String)object) + 16;
        ((Dimension)object2).height = n3 * n2 + 100;
        this.setPreferredSize((Dimension)object2);
        this.setSize((Dimension)object2);
    }
}

