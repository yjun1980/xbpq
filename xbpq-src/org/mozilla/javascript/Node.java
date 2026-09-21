/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.math.BigInteger;
import java.util.Iterator;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node$NodeIterator;
import org.mozilla.javascript.Node$PropListItem;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;

public class Node
implements Iterable<Node> {
    public static final int ARROW_FUNCTION_PROP = 27;
    public static final int ATTRIBUTE_FLAG = 2;
    public static final int BOTH = 0;
    public static final int CASEARRAY_PROP = 5;
    public static final int CATCH_SCOPE_PROP = 14;
    public static final int CONTROL_BLOCK_PROP = 18;
    public static final int DECR_FLAG = 1;
    public static final int DESCENDANTS_FLAG = 4;
    public static final int DESTRUCTURING_ARRAY_LENGTH = 21;
    public static final int DESTRUCTURING_NAMES = 22;
    public static final int DESTRUCTURING_PARAMS = 23;
    public static final int DIRECTCALL_PROP = 9;
    public static final int END_DROPS_OFF = 1;
    public static final int END_RETURNS = 2;
    public static final int END_RETURNS_VALUE = 4;
    public static final int END_UNREACHED = 0;
    public static final int END_YIELDS = 8;
    public static final int EXPRESSION_CLOSURE_PROP = 25;
    public static final int FUNCTION_PROP = 1;
    public static final int GENERATOR_END_PROP = 20;
    public static final int INCRDECR_PROP = 13;
    public static final int ISNUMBER_PROP = 8;
    public static final int JSDOC_PROP = 24;
    public static final int LABEL_ID_PROP = 15;
    public static final int LAST_PROP = 29;
    public static final int LEFT = 1;
    public static final int LOCAL_BLOCK_PROP = 3;
    public static final int LOCAL_PROP = 2;
    public static final int MEMBER_TYPE_PROP = 16;
    public static final int NAME_PROP = 17;
    public static final int NON_SPECIALCALL = 0;
    private static final Node NOT_SET = new Node(-1);
    public static final int OBJECT_IDS_PROP = 12;
    public static final int PARENTHESIZED_PROP = 19;
    public static final int POST_FLAG = 2;
    public static final int PROPERTY_FLAG = 1;
    public static final int REGEXP_PROP = 4;
    public static final int RIGHT = 2;
    public static final int SHORTHAND_PROPERTY_NAME = 26;
    public static final int SKIP_INDEXES_PROP = 11;
    public static final int SPECIALCALL_EVAL = 1;
    public static final int SPECIALCALL_PROP = 10;
    public static final int SPECIALCALL_WITH = 2;
    public static final int TARGETBLOCK_PROP = 6;
    public static final int TEMPLATE_LITERAL_PROP = 28;
    public static final int TRAILING_COMMA = 29;
    public static final int VARIABLE_PROP = 7;
    protected Node first;
    protected Node last;
    protected int lineno;
    protected Node next;
    protected Node$PropListItem propListHead;
    protected int type;

    public Node(int n2) {
        this.lineno = -1;
        this.type = n2;
    }

    public Node(int n2, int n3) {
        this.type = n2;
        this.lineno = n3;
    }

    public Node(int n2, Node node) {
        this.lineno = -1;
        this.type = n2;
        this.last = node;
        this.first = node;
        node.next = null;
    }

    public Node(int n2, Node node, int n3) {
        this(n2, node);
        this.lineno = n3;
    }

    public Node(int n2, Node node, Node node2) {
        this.lineno = -1;
        this.type = n2;
        this.first = node;
        this.last = node2;
        node.next = node2;
        node2.next = null;
    }

    public Node(int n2, Node node, Node node2, int n3) {
        this(n2, node, node2);
        this.lineno = n3;
    }

    public Node(int n2, Node node, Node node2, Node node3) {
        this.lineno = -1;
        this.type = n2;
        this.first = node;
        this.last = node3;
        node.next = node2;
        node2.next = node3;
        node3.next = null;
    }

    public Node(int n2, Node node, Node node2, Node node3, int n3) {
        this(n2, node, node2, node3);
        this.lineno = n3;
    }

    static /* synthetic */ Node access$000() {
        return NOT_SET;
    }

    private static void appendPrintId(Node node, ObjToIntMap objToIntMap, StringBuilder stringBuilder) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int endCheck() {
        int n2 = this.type;
        if (n2 != 4) {
            if (n2 == 50) return 0;
            if (n2 == 73) return 8;
            if (n2 != 133 && n2 != 145) {
                if (n2 == 169) return 8;
                if (n2 == 124) return this.endCheckBreak();
                if (n2 == 125) return 0;
                switch (n2) {
                    default: {
                        return 1;
                    }
                    case 137: {
                        Node node = this.first;
                        if (node == null) return 1;
                        return node.endCheck();
                    }
                    case 136: {
                        return this.endCheckLoop();
                    }
                    case 135: 
                }
                Node node = this.next;
                if (node == null) return 1;
                return node.endCheck();
            }
            Node node = this.first;
            if (node == null) {
                return 1;
            }
            n2 = node.type;
            if (n2 == 7) return node.endCheckIf();
            if (n2 == 84) return node.endCheckTry();
            if (n2 == 118) return node.endCheckSwitch();
            if (n2 == 134) return node.endCheckLabel();
            return this.endCheckBlock();
        }
        if (this.first == null) return 2;
        return 4;
    }

    private int endCheckBlock() {
        Node node = this.first;
        int n2 = 1;
        while (n2 & true && node != null) {
            n2 = n2 & 0xFFFFFFFE | node.endCheck();
            node = node.next;
        }
        return n2;
    }

    private int endCheckBreak() {
        ((Jump)this).getJumpStatement().putIntProp(18, 1);
        return 0;
    }

    private int endCheckIf() {
        Node node = this.next;
        Node node2 = ((Jump)this).target;
        int n2 = node.endCheck();
        n2 = node2 != null ? (n2 |= node2.endCheck()) : (n2 |= 1);
        return n2;
    }

    private int endCheckLabel() {
        return this.next.endCheck() | this.getIntProp(18, 0);
    }

    private int endCheckLoop() {
        int n2;
        Node node;
        Node node2 = this.first;
        while ((node = node2.next) != this.last) {
            node2 = node;
        }
        if (node2.type != 6) {
            return 1;
        }
        int n3 = n2 = ((Jump)node2).target.next.endCheck();
        if (node2.first.type == 45) {
            n3 = n2 & 0xFFFFFFFE;
        }
        return this.getIntProp(18, 0) | n3;
    }

    private int endCheckSwitch() {
        return 0;
    }

    private int endCheckTry() {
        return 0;
    }

    private Node$PropListItem ensureProperty(int n2) {
        Node$PropListItem node$PropListItem;
        Node$PropListItem node$PropListItem2 = node$PropListItem = this.lookupProperty(n2);
        if (node$PropListItem == null) {
            node$PropListItem2 = new Node$PropListItem(null);
            node$PropListItem2.type = n2;
            node$PropListItem2.next = this.propListHead;
            this.propListHead = node$PropListItem2;
        }
        return node$PropListItem2;
    }

    private static void generatePrintIds(Node node, ObjToIntMap objToIntMap) {
    }

    private Node$PropListItem lookupProperty(int n2) {
        Node$PropListItem node$PropListItem = this.propListHead;
        while (node$PropListItem != null && n2 != node$PropListItem.type) {
            node$PropListItem = node$PropListItem.next;
        }
        return node$PropListItem;
    }

    public static Node newNumber(double d2) {
        NumberLiteral numberLiteral = new NumberLiteral();
        numberLiteral.setNumber(d2);
        return numberLiteral;
    }

    public static Node newString(int n2, String string) {
        Name name = new Name();
        name.setIdentifier(string);
        name.setType(n2);
        return name;
    }

    public static Node newString(String string) {
        return Node.newString(41, string);
    }

    public static Node newTarget() {
        return new Node(135);
    }

    private static final String propToString(int n2) {
        return null;
    }

    private void resetTargets_r() {
        int n2 = this.type;
        if (n2 == 135 || n2 == 73 || n2 == 169) {
            this.labelId(-1);
        }
        Node node = this.first;
        while (node != null) {
            node.resetTargets_r();
            node = node.next;
        }
    }

    private void toString(ObjToIntMap objToIntMap, StringBuilder stringBuilder) {
    }

    private static void toStringTreeHelper(ScriptNode scriptNode, Node node, ObjToIntMap objToIntMap, int n2, StringBuilder stringBuilder) {
    }

    public void addChildAfter(Node node, Node node2) {
        if (node.next == null) {
            node.next = node2.next;
            node2.next = node;
            if (this.last == node2) {
                this.last = node;
            }
            return;
        }
        throw new RuntimeException("newChild had siblings in addChildAfter");
    }

    public void addChildBefore(Node node, Node node2) {
        if (node.next == null) {
            Node node3 = this.first;
            if (node3 == node2) {
                node.next = node3;
                this.first = node;
                return;
            }
            this.addChildAfter(node, this.getChildBefore(node2));
            return;
        }
        throw new RuntimeException("newChild had siblings in addChildBefore");
    }

    public void addChildToBack(Node node) {
        node.next = null;
        Node node2 = this.last;
        if (node2 == null) {
            this.last = node;
            this.first = node;
            return;
        }
        node2.next = node;
        this.last = node;
    }

    public void addChildToFront(Node node) {
        node.next = this.first;
        this.first = node;
        if (this.last == null) {
            this.last = node;
        }
    }

    public void addChildrenToBack(Node node) {
        Node node2 = this.last;
        if (node2 != null) {
            node2.next = node;
        }
        this.last = node.getLastSibling();
        if (this.first == null) {
            this.first = node;
        }
    }

    public void addChildrenToFront(Node node) {
        Node node2 = node.getLastSibling();
        node2.next = this.first;
        this.first = node;
        if (this.last == null) {
            this.last = node2;
        }
    }

    public BigInteger getBigInt() {
        throw new UnsupportedOperationException("Can only be called when Token.BIGINT");
    }

    public Node getChildBefore(Node node) {
        Node node2;
        Node node3 = node2 = this.first;
        if (node == node2) {
            return null;
        }
        while ((node2 = node3.next) != node) {
            if (node2 != null) {
                node3 = node2;
                continue;
            }
            throw new RuntimeException("node is not a child");
        }
        return node3;
    }

    public final double getDouble() {
        return ((NumberLiteral)this).getNumber();
    }

    public int getExistingIntProp(int n2) {
        Node$PropListItem node$PropListItem = this.lookupProperty(n2);
        if (node$PropListItem == null) {
            Kit.codeBug();
        }
        return node$PropListItem.intValue;
    }

    public Node getFirstChild() {
        return this.first;
    }

    public int getIntProp(int n2, int n3) {
        Node$PropListItem node$PropListItem = this.lookupProperty(n2);
        if (node$PropListItem == null) {
            return n3;
        }
        return node$PropListItem.intValue;
    }

    public String getJsDoc() {
        Comment comment = this.getJsDocNode();
        if (comment != null) {
            return comment.getValue();
        }
        return null;
    }

    public Comment getJsDocNode() {
        return (Comment)this.getProp(24);
    }

    public Node getLastChild() {
        return this.last;
    }

    public Node getLastSibling() {
        Node node;
        Node node2 = this;
        while ((node = node2.next) != null) {
            node2 = node;
        }
        return node2;
    }

    public int getLineno() {
        return this.lineno;
    }

    public Node getNext() {
        return this.next;
    }

    public Object getProp(int n2) {
        Node$PropListItem node$PropListItem = this.lookupProperty(n2);
        if (node$PropListItem == null) {
            return null;
        }
        return node$PropListItem.objectValue;
    }

    public Scope getScope() {
        return ((Name)this).getScope();
    }

    public final String getString() {
        return ((Name)this).getIdentifier();
    }

    public int getType() {
        return this.type;
    }

    public boolean hasChildren() {
        boolean bl = this.first != null;
        return bl;
    }

    public boolean hasConsistentReturnUsage() {
        int n2 = this.endCheck();
        boolean bl = (n2 & 4) == 0 || (n2 & 0xB) == 0;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean hasSideEffects() {
        int n2 = this.type;
        boolean bl = true;
        boolean bl2 = true;
        if (n2 == 30) return true;
        if (n2 == 31) return true;
        if (n2 == 37) return true;
        if (n2 == 38) return true;
        if (n2 == 50) return true;
        if (n2 == 51) return true;
        if (n2 == 56) return true;
        if (n2 == 57) return true;
        if (n2 == 84) return true;
        if (n2 == 85) return true;
        switch (n2) {
            default: {
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
                                            case 116: 
                                            case 117: 
                                            case 118: 
                                        }
                                        return true;
                                    }
                                    case 108: 
                                    case 109: {
                                        if (this.first == null || this.last == null) {
                                            Kit.codeBug();
                                        }
                                        bl = bl2;
                                        if (this.first.hasSideEffects()) return bl;
                                        if (!this.last.hasSideEffects()) return false;
                                        return bl2;
                                    }
                                    case 110: 
                                    case 111: 
                                }
                                return true;
                            }
                            case 69: 
                            case 70: 
                            case 71: 
                        }
                        return true;
                    }
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                }
                return true;
            }
            case 106: {
                Node node = this.first;
                if (node == null || (node = node.next) == null || node.next == null) {
                    Kit.codeBug();
                }
                if (!this.first.next.hasSideEffects()) return false;
                if (!this.first.next.next.hasSideEffects()) return false;
                return bl;
            }
            case 92: 
            case 137: {
                Node node = this.last;
                if (node == null) return true;
                return node.hasSideEffects();
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
        return true;
    }

    @Override
    public Iterator<Node> iterator() {
        return new Node$NodeIterator(this);
    }

    public final int labelId() {
        int n2 = this.type;
        if (n2 != 135 && n2 != 73 && n2 != 169) {
            Kit.codeBug();
        }
        return this.getIntProp(15, -1);
    }

    public void labelId(int n2) {
        int n3 = this.type;
        if (n3 != 135 && n3 != 73 && n3 != 169) {
            Kit.codeBug();
        }
        this.putIntProp(15, n2);
    }

    public void putIntProp(int n2, int n3) {
        this.ensureProperty((int)n2).intValue = n3;
    }

    public void putProp(int n2, Object object) {
        if (object == null) {
            this.removeProp(n2);
        } else {
            this.ensureProperty((int)n2).objectValue = object;
        }
    }

    public void removeChild(Node node) {
        Node node2 = this.getChildBefore(node);
        if (node2 == null) {
            this.first = this.first.next;
        } else {
            node2.next = node.next;
        }
        if (node == this.last) {
            this.last = node2;
        }
        node.next = null;
    }

    public void removeChildren() {
        this.last = null;
        this.first = null;
    }

    public void removeProp(int n2) {
        Node$PropListItem node$PropListItem = this.propListHead;
        if (node$PropListItem != null) {
            Node$PropListItem node$PropListItem2 = null;
            while (node$PropListItem.type != n2) {
                Node$PropListItem node$PropListItem3 = node$PropListItem.next;
                if (node$PropListItem3 == null) {
                    return;
                }
                node$PropListItem2 = node$PropListItem;
                node$PropListItem = node$PropListItem3;
            }
            node$PropListItem = node$PropListItem.next;
            if (node$PropListItem2 == null) {
                this.propListHead = node$PropListItem;
            } else {
                node$PropListItem2.next = node$PropListItem;
            }
        }
    }

    public void replaceChild(Node node, Node node2) {
        node2.next = node.next;
        if (node == this.first) {
            this.first = node2;
        } else {
            this.getChildBefore((Node)node).next = node2;
        }
        if (node == this.last) {
            this.last = node2;
        }
        node.next = null;
    }

    public void replaceChildAfter(Node node, Node node2) {
        Node node3 = node.next;
        node2.next = node3.next;
        node.next = node2;
        if (node3 == this.last) {
            this.last = node2;
        }
        node3.next = null;
    }

    public void resetTargets() {
        if (this.type == 129) {
            this.resetTargets_r();
        } else {
            Kit.codeBug();
        }
    }

    public void setBigInt(BigInteger bigInteger) {
        throw new UnsupportedOperationException("Can only be called when Token.BIGINT");
    }

    public final void setDouble(double d2) {
        ((NumberLiteral)this).setNumber(d2);
    }

    public void setJsDocNode(Comment comment) {
        this.putProp(24, comment);
    }

    public void setLineno(int n2) {
        this.lineno = n2;
    }

    public void setScope(Scope scope) {
        if (scope == null) {
            Kit.codeBug();
        }
        if (this instanceof Name) {
            ((Name)this).setScope(scope);
            return;
        }
        throw Kit.codeBug();
    }

    public final void setString(String string) {
        if (string == null) {
            Kit.codeBug();
        }
        ((Name)this).setIdentifier(string);
    }

    public Node setType(int n2) {
        this.type = n2;
        return this;
    }

    public String toString() {
        return String.valueOf(this.type);
    }

    public String toStringTree(ScriptNode scriptNode) {
        return null;
    }
}

