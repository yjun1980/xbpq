/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;
import org.mozilla.javascript.tools.debugger.SwingGui;

class EvalTextArea
extends JTextArea
implements KeyListener,
DocumentListener {
    private static final long serialVersionUID = -3918033649601064194L;
    private SwingGui debugGui;
    private List<String> history;
    private int historyIndex = -1;
    private int outputMark;

    public EvalTextArea(SwingGui object) {
        this.debugGui = object;
        this.history = Collections.synchronizedList(new ArrayList());
        object = this.getDocument();
        object.addDocumentListener(this);
        this.addKeyListener(this);
        this.setLineWrap(true);
        this.setFont(new Font("Monospaced", 0, Math.max(12, UIManager.getFont("Label.font").getSize())));
        this.append("% ");
        this.outputMark = object.getLength();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void returnPressed() {
        synchronized (this) {
            Document document = this.getDocument();
            int n2 = document.getLength();
            Segment segment = new Segment();
            try {
                int n3 = this.outputMark;
                document.getText(n3, n2 - n3, segment);
            }
            catch (BadLocationException badLocationException) {
                badLocationException.printStackTrace();
            }
            String string = segment.toString();
            if (this.debugGui.dim.stringIsCompilableUnit(string)) {
                if (string.trim().length() > 0) {
                    this.history.add(string);
                    this.historyIndex = this.history.size();
                }
                this.append("\n");
                string = this.debugGui.dim.eval(string);
                if (string.length() > 0) {
                    this.append(string);
                    this.append("\n");
                }
                this.append("% ");
                this.outputMark = document.getLength();
            } else {
                this.append("\n");
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        synchronized (this) {
            int n2 = documentEvent.getLength();
            int n3 = documentEvent.getOffset();
            int n4 = this.outputMark;
            if (n4 > n3) {
                this.outputMark = n4 + n2;
            }
            return;
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block14: {
            block13: {
                block11: {
                    int n2;
                    block18: {
                        int n3;
                        block16: {
                            block17: {
                                int n4;
                                block15: {
                                    block12: {
                                        n2 = keyEvent.getKeyCode();
                                        if (n2 == 8 || n2 == 37) break block11;
                                        if (n2 != 36) break block12;
                                        int n5 = this.getCaretPosition();
                                        if (n5 == (n2 = this.outputMark)) break block13;
                                        if (n5 <= n2 || keyEvent.isControlDown()) break block14;
                                        if (keyEvent.isShiftDown()) {
                                            this.moveCaretPosition(this.outputMark);
                                        } else {
                                            this.setCaretPosition(this.outputMark);
                                        }
                                        break block13;
                                    }
                                    if (n2 != 10) break block15;
                                    this.returnPressed();
                                    break block13;
                                }
                                if (n2 != 38) break block16;
                                this.historyIndex = n4 = this.historyIndex - 1;
                                n2 = n4;
                                if (n4 < 0) break block17;
                                if (n4 >= this.history.size()) {
                                    this.historyIndex = this.history.size() - 1;
                                }
                                n2 = n4 = this.historyIndex;
                                if (n4 < 0) break block17;
                                String string = this.history.get(n4);
                                n2 = this.getDocument().getLength();
                                this.replaceRange(string, this.outputMark, n2);
                                n2 = this.outputMark;
                                n2 = string.length() + n2;
                                break block18;
                            }
                            this.historyIndex = n2 + 1;
                            break block13;
                        }
                        if (n2 != 40) break block14;
                        n2 = n3 = this.outputMark;
                        if (this.history.size() > 0) {
                            this.historyIndex = n2 = this.historyIndex + 1;
                            if (n2 < 0) {
                                this.historyIndex = 0;
                            }
                            n2 = this.getDocument().getLength();
                            if (this.historyIndex < this.history.size()) {
                                String string = this.history.get(this.historyIndex);
                                this.replaceRange(string, this.outputMark, n2);
                                n2 = this.outputMark;
                                n2 = string.length() + n2;
                            } else {
                                this.historyIndex = this.history.size();
                                this.replaceRange("", this.outputMark, n2);
                                n2 = n3;
                            }
                        }
                    }
                    this.select(n2, n2);
                    break block13;
                }
                if (this.outputMark != this.getCaretPosition()) break block14;
            }
            keyEvent.consume();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void keyReleased(KeyEvent keyEvent) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        if (keyEvent.getKeyChar() == '\b') {
            if (this.outputMark == this.getCaretPosition()) {
                keyEvent.consume();
            }
        } else {
            int n2;
            int n3 = this.getCaretPosition();
            if (n3 < (n2 = this.outputMark)) {
                this.setCaretPosition(n2);
            }
        }
    }

    public void postUpdateUI() {
        synchronized (this) {
            this.setCaret(this.getCaret());
            int n2 = this.outputMark;
            this.select(n2, n2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        synchronized (this) {
            int n2 = documentEvent.getLength();
            int n3 = documentEvent.getOffset();
            int n4 = this.outputMark;
            if (n4 > n3) {
                this.outputMark = n4 >= n3 + n2 ? n4 - n2 : n3;
            }
            return;
        }
    }

    @Override
    public void select(int n2, int n3) {
        super.select(n2, n3);
    }

    public void write(String string) {
        synchronized (this) {
            this.insert(string, this.outputMark);
            int n2 = string.length();
            this.outputMark = n2 = this.outputMark + n2;
            this.select(n2, n2);
            return;
        }
    }
}

