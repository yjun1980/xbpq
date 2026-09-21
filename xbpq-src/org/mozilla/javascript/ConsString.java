/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.util.ArrayDeque;

public class ConsString
implements CharSequence,
Serializable {
    private static final long serialVersionUID = -8432806714471372570L;
    private boolean isFlat;
    private CharSequence left;
    private final int length;
    private CharSequence right;

    public ConsString(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence;
        if (!(charSequence instanceof String)) {
            charSequence3 = charSequence;
            if (!(charSequence instanceof ConsString)) {
                charSequence3 = charSequence.toString();
            }
        }
        charSequence = charSequence2;
        if (!(charSequence2 instanceof String)) {
            charSequence = charSequence2;
            if (!(charSequence2 instanceof ConsString)) {
                charSequence = charSequence2.toString();
            }
        }
        this.left = charSequence3;
        this.right = charSequence;
        int n2 = charSequence3.length();
        this.length = this.right.length() + n2;
        this.isFlat = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String flatten() {
        synchronized (this) {
            CharSequence charSequence;
            if (this.isFlat) return (String)this.left;
            int n2 = this.length;
            char[] cArray = new char[n2];
            ArrayDeque<CharSequence> arrayDeque = new ArrayDeque<CharSequence>();
            arrayDeque.addFirst(this.left);
            CharSequence charSequence2 = this.right;
            do {
                block9: {
                    block10: {
                        charSequence = charSequence2;
                        if (charSequence2 instanceof ConsString) {
                            charSequence = (ConsString)charSequence2;
                            if (!((ConsString)charSequence).isFlat) {
                                arrayDeque.addFirst(((ConsString)charSequence).left);
                                charSequence = ((ConsString)charSequence).right;
                                break block9;
                            }
                            charSequence = ((ConsString)charSequence).left;
                        }
                        ((String)charSequence).getChars(0, ((String)charSequence).length(), cArray, n2 -= ((String)charSequence).length());
                        if (!arrayDeque.isEmpty()) break block10;
                        charSequence = null;
                        break block9;
                    }
                    charSequence = (CharSequence)arrayDeque.removeFirst();
                }
                charSequence2 = charSequence;
            } while (charSequence != null);
            charSequence = new String(cArray);
            this.left = charSequence;
            this.right = "";
            this.isFlat = true;
            return (String)this.left;
        }
    }

    private Object writeReplace() {
        return this.toString();
    }

    @Override
    public char charAt(int n2) {
        String string = this.isFlat ? (String)this.left : this.flatten();
        return string.charAt(n2);
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public CharSequence subSequence(int n2, int n3) {
        String string = this.isFlat ? (String)this.left : this.flatten();
        return string.substring(n2, n3);
    }

    @Override
    public String toString() {
        String string = this.isFlat ? (String)this.left : this.flatten();
        return string;
    }
}

