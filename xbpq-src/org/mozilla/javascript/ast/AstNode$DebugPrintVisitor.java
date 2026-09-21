/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.StringLiteral;

public class AstNode$DebugPrintVisitor
implements NodeVisitor {
    private static final int DEBUG_INDENT = 2;
    private StringBuilder buffer;

    public AstNode$DebugPrintVisitor(StringBuilder stringBuilder) {
        this.buffer = stringBuilder;
    }

    private static String makeIndent(int n2) {
        int n3 = n2 * 2;
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return this.buffer.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean visit(AstNode object) {
        block4: {
            CharSequence charSequence;
            block3: {
                int n2;
                block2: {
                    n2 = ((Node)object).getType();
                    charSequence = Token.typeToName(n2);
                    StringBuilder stringBuilder = this.buffer;
                    stringBuilder.append(((AstNode)object).getAbsolutePosition());
                    stringBuilder.append("\t");
                    this.buffer.append(AstNode$DebugPrintVisitor.makeIndent(((AstNode)object).depth()));
                    StringBuilder stringBuilder2 = this.buffer;
                    stringBuilder2.append((String)charSequence);
                    stringBuilder2.append(" ");
                    charSequence = this.buffer;
                    ((StringBuilder)charSequence).append(((AstNode)object).getPosition());
                    ((StringBuilder)charSequence).append(" ");
                    this.buffer.append(((AstNode)object).getLength());
                    if (n2 != 39) break block2;
                    StringBuilder stringBuilder3 = this.buffer;
                    stringBuilder3.append(" ");
                    charSequence = ((Name)object).getIdentifier();
                    object = stringBuilder3;
                    break block3;
                }
                if (n2 != 41) break block4;
                charSequence = this.buffer;
                ((StringBuilder)charSequence).append(" ");
                String string = ((StringLiteral)object).getValue(true);
                object = charSequence;
                charSequence = string;
            }
            ((StringBuilder)object).append((String)charSequence);
        }
        this.buffer.append("\n");
        return true;
    }
}

