/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.io.Serializable;
import java.util.Comparator;
import org.mozilla.javascript.ast.AstNode;

public class AstNode$PositionComparator
implements Comparator<AstNode>,
Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public int compare(AstNode astNode, AstNode astNode2) {
        return astNode.position - astNode2.position;
    }
}

