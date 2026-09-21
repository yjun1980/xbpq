/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.I.r;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode$DebugPrintVisitor;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.Scope;

public abstract class AstNode
extends Node
implements Comparable<AstNode> {
    private static final String[] INDENTATIONS;
    private static final int MAX_INDENT = 42;
    private static Map<Integer, String> operatorNames;
    protected AstNode inlineComment;
    protected int length = 1;
    protected AstNode parent;
    protected int position = -1;

    static {
        Serializable serializable = new HashMap<Integer, String>();
        operatorNames = serializable;
        String[] stringArray = new String[43];
        INDENTATIONS = stringArray;
        serializable.put(52, (String)"in");
        operatorNames.put(32, "typeof");
        operatorNames.put(53, "instanceof");
        operatorNames.put(31, "delete");
        operatorNames.put(92, ",");
        operatorNames.put(107, ":");
        operatorNames.put(108, "||");
        operatorNames.put(109, "&&");
        operatorNames.put(110, "++");
        operatorNames.put(111, "--");
        operatorNames.put(9, "|");
        operatorNames.put(10, "^");
        operatorNames.put(11, "&");
        operatorNames.put(12, "==");
        operatorNames.put(13, "!=");
        operatorNames.put(14, "<");
        operatorNames.put(16, ">");
        operatorNames.put(15, "<=");
        operatorNames.put(17, ">=");
        operatorNames.put(18, "<<");
        operatorNames.put(19, ">>");
        operatorNames.put(20, ">>>");
        operatorNames.put(21, "+");
        operatorNames.put(22, "-");
        operatorNames.put(23, "*");
        operatorNames.put(24, "/");
        operatorNames.put(25, "%");
        operatorNames.put(75, "**");
        operatorNames.put(26, "!");
        operatorNames.put(27, "~");
        operatorNames.put(28, "+");
        operatorNames.put(29, "-");
        operatorNames.put(46, "===");
        operatorNames.put(47, "!==");
        operatorNames.put(93, "=");
        operatorNames.put(94, "|=");
        operatorNames.put(96, "&=");
        operatorNames.put(97, "<<=");
        operatorNames.put(98, ">>=");
        operatorNames.put(99, ">>>=");
        operatorNames.put(100, "+=");
        operatorNames.put(101, "-=");
        operatorNames.put(102, "*=");
        operatorNames.put(103, "/=");
        operatorNames.put(104, "%=");
        operatorNames.put(95, "^=");
        operatorNames.put(105, "**=");
        operatorNames.put(130, "void");
        serializable = new StringBuilder();
        stringArray[0] = ((StringBuilder)serializable).toString();
        for (int i2 = 1; i2 <= 42; ++i2) {
            ((StringBuilder)serializable).append("  ");
            AstNode.INDENTATIONS[i2] = ((StringBuilder)serializable).toString();
        }
    }

    public AstNode() {
        super(-1);
    }

    public AstNode(int n2) {
        this();
        this.position = n2;
    }

    public AstNode(int n2, int n3) {
        this();
        this.position = n2;
        this.length = n3;
    }

    public static RuntimeException codeBug() {
        throw Kit.codeBug();
    }

    public static String operatorToString(int n2) {
        String string = operatorNames.get(n2);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException(r.a("Invalid operator: ", n2));
    }

    public void addChild(AstNode astNode) {
        this.assertNotNull(astNode);
        int n2 = astNode.getPosition();
        this.setLength(astNode.getLength() + n2 - this.getPosition());
        this.addChildToBack(astNode);
        astNode.setParent(this);
    }

    protected void assertNotNull(Object object) {
        if (object != null) {
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    @Override
    public int compareTo(AstNode astNode) {
        int n2;
        if (this.equals(astNode)) {
            return 0;
        }
        int n3 = this.getAbsolutePosition();
        if (n3 < (n2 = astNode.getAbsolutePosition())) {
            return -1;
        }
        if (n2 < n3) {
            return 1;
        }
        n3 = this.getLength();
        if (n3 < (n2 = astNode.getLength())) {
            return -1;
        }
        if (n2 < n3) {
            return 1;
        }
        return this.hashCode() - astNode.hashCode();
    }

    public String debugPrint() {
        AstNode$DebugPrintVisitor astNode$DebugPrintVisitor = new AstNode$DebugPrintVisitor(new StringBuilder(1000));
        this.visit(astNode$DebugPrintVisitor);
        return astNode$DebugPrintVisitor.toString();
    }

    public int depth() {
        AstNode astNode = this.parent;
        int n2 = astNode == null ? 0 : astNode.depth() + 1;
        return n2;
    }

    public int getAbsolutePosition() {
        int n2 = this.position;
        for (AstNode astNode = this.parent; astNode != null; astNode = astNode.getParent()) {
            n2 += astNode.getPosition();
        }
        return n2;
    }

    public AstRoot getAstRoot() {
        AstNode astNode;
        for (astNode = this; astNode != null && !(astNode instanceof AstRoot); astNode = astNode.getParent()) {
        }
        return (AstRoot)astNode;
    }

    public FunctionNode getEnclosingFunction() {
        AstNode astNode;
        for (astNode = this.getParent(); astNode != null && !(astNode instanceof FunctionNode); astNode = astNode.getParent()) {
        }
        return (FunctionNode)astNode;
    }

    public Scope getEnclosingScope() {
        AstNode astNode;
        for (astNode = this.getParent(); astNode != null && !(astNode instanceof Scope); astNode = astNode.getParent()) {
        }
        return (Scope)astNode;
    }

    public AstNode getInlineComment() {
        return this.inlineComment;
    }

    public int getLength() {
        return this.length;
    }

    @Override
    public int getLineno() {
        int n2 = this.lineno;
        if (n2 != -1) {
            return n2;
        }
        AstNode astNode = this.parent;
        if (astNode != null) {
            return astNode.getLineno();
        }
        return -1;
    }

    public AstNode getParent() {
        return this.parent;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public boolean hasSideEffects() {
        int n2 = this.getType();
        if (n2 != 30 && n2 != 31 && n2 != 37 && n2 != 38 && n2 != 50 && n2 != 51 && n2 != 56 && n2 != 57 && n2 != 84 && n2 != 85 && n2 != 110 && n2 != 111) {
            switch (n2) {
                default: {
                    switch (n2) {
                        default: {
                            switch (n2) {
                                default: {
                                    switch (n2) {
                                        default: {
                                            return false;
                                        }
                                        case 113: 
                                        case 114: 
                                        case 115: 
                                        case 116: 
                                        case 117: 
                                        case 118: 
                                    }
                                }
                                case 69: 
                                case 70: 
                                case 71: 
                            }
                        }
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                    }
                }
                case -1: 
                case 35: 
                case 65: 
                case 73: 
                case 93: 
                case 94: 
                case 95: 
                case 96: 
                case 97: 
                case 98: 
                case 99: 
                case 100: 
                case 101: 
                case 102: 
                case 103: 
                case 104: 
                case 121: 
                case 122: 
                case 123: 
                case 124: 
                case 125: 
                case 126: 
                case 127: 
                case 128: 
                case 129: 
                case 133: 
                case 134: 
                case 135: 
                case 136: 
                case 138: 
                case 139: 
                case 143: 
                case 144: 
                case 145: 
                case 146: 
                case 157: 
                case 158: 
                case 162: 
                case 163: 
                case 169: 
            }
        }
        return true;
    }

    public String makeIndent(int n2) {
        n2 = Math.min(42, Math.max(0, n2));
        return INDENTATIONS[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    protected <T extends AstNode> void printList(List<T> object, StringBuilder stringBuilder) {
        int n2 = object.size();
        Iterator iterator = object.iterator();
        int n3 = 0;
        while (true) {
            block7: {
                block6: {
                    block5: {
                        if (!iterator.hasNext()) {
                            return;
                        }
                        object = (AstNode)iterator.next();
                        stringBuilder.append(((AstNode)object).toSource(0));
                        if (n3 >= n2 - 1) break block5;
                        object = ", ";
                        break block6;
                    }
                    if (!(object instanceof EmptyExpression)) break block7;
                    object = ",";
                }
                stringBuilder.append((String)object);
            }
            ++n3;
        }
    }

    public void setBounds(int n2, int n3) {
        this.setPosition(n2);
        this.setLength(n3 - n2);
    }

    public void setInlineComment(AstNode astNode) {
        this.inlineComment = astNode;
    }

    public void setLength(int n2) {
        this.length = n2;
    }

    public void setParent(AstNode astNode) {
        AstNode astNode2 = this.parent;
        if (astNode == astNode2) {
            return;
        }
        if (astNode2 != null) {
            this.setRelative(-astNode2.getAbsolutePosition());
        }
        this.parent = astNode;
        if (astNode != null) {
            this.setRelative(astNode.getAbsolutePosition());
        }
    }

    public void setPosition(int n2) {
        this.position = n2;
    }

    public void setRelative(int n2) {
        this.position -= n2;
    }

    public String shortName() {
        String string = this.getClass().getName();
        return string.substring(string.lastIndexOf(".") + 1);
    }

    public String toSource() {
        return this.toSource(0);
    }

    public abstract String toSource(int var1);

    public abstract void visit(NodeVisitor var1);
}

