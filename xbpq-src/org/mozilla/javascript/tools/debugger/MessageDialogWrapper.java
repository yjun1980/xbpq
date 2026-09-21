/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.awt.Component;
import javax.swing.JOptionPane;

class MessageDialogWrapper {
    MessageDialogWrapper() {
    }

    public static void showMessageDialog(Component component, String string, String string2, int n2) {
        CharSequence charSequence = string;
        if (string.length() > 60) {
            charSequence = new StringBuilder();
            int n3 = string.length();
            int n4 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                char c2 = string.charAt(i2);
                ((StringBuilder)charSequence).append(c2);
                int n5 = n4;
                if (Character.isWhitespace(c2)) {
                    int n6;
                    for (n6 = i2 + 1; n6 < n3 && !Character.isWhitespace(string.charAt(n6)); ++n6) {
                    }
                    n5 = n4;
                    if (n6 < n3) {
                        n5 = n4;
                        if (n6 - i2 + n4 > 60) {
                            ((StringBuilder)charSequence).append('\n');
                            n5 = 0;
                        }
                    }
                }
                n4 = n5 + 1;
            }
            charSequence = ((StringBuilder)charSequence).toString();
        }
        JOptionPane.showMessageDialog(component, charSequence, string2, n2);
    }
}

