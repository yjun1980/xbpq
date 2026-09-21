/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;
import org.mozilla.javascript.tools.shell.ConsoleWriter;

public class ConsoleTextArea
extends JTextArea
implements KeyListener,
DocumentListener {
    static final long serialVersionUID = 8557083244830872961L;
    private ConsoleWriter console1;
    private ConsoleWriter console2;
    private PrintStream err;
    private List<String> history = new ArrayList<String>();
    private int historyIndex = -1;
    private PipedInputStream in;
    private PrintWriter inPipe;
    private PrintStream out;
    private int outputMark = 0;

    public ConsoleTextArea(String[] object) {
        PipedInputStream pipedInputStream;
        this.console1 = new ConsoleWriter(this);
        this.console2 = new ConsoleWriter(this);
        this.out = new PrintStream(this.console1, true);
        this.err = new PrintStream(this.console2, true);
        object = new PipedOutputStream();
        this.inPipe = new PrintWriter((OutputStream)object);
        this.in = pipedInputStream = new PipedInputStream();
        try {
            ((PipedOutputStream)object).connect(pipedInputStream);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.getDocument().addDocumentListener(this);
        this.addKeyListener(this);
        this.setLineWrap(true);
        this.setFont(new Font("Monospaced", 0, 12));
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

    public void eval(String string) {
        this.inPipe.write(string);
        this.inPipe.write("\n");
        this.inPipe.flush();
        this.console1.flush();
    }

    public PrintStream getErr() {
        return this.err;
    }

    public InputStream getIn() {
        return this.in;
    }

    public PrintStream getOut() {
        return this.out;
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
            this.requestFocus();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void returnPressed() {
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
            if (segment.count > 0) {
                this.history.add(segment.toString());
            }
            this.historyIndex = this.history.size();
            this.inPipe.write(segment.array, segment.offset, segment.count);
            this.append("\n");
            this.outputMark = document.getLength();
            this.inPipe.write("\n");
            this.inPipe.flush();
            this.console1.flush();
            return;
        }
    }

    @Override
    public void select(int n2, int n3) {
        this.requestFocus();
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

