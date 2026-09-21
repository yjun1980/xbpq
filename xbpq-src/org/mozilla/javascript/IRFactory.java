/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Decompiler;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Parser$PerFunctionVariables;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.ArrayComprehension;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.Assignment;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.BigIntLiteral;
import org.mozilla.javascript.ast.Block;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.CatchClause;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.DestructuringForm;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.ForInLoop;
import org.mozilla.javascript.ast.ForLoop;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.GeneratorExpression;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.IfStatement;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.KeywordLiteral;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.LabeledStatement;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.Loop;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.RegExpLiteral;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.StringLiteral;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.SwitchStatement;
import org.mozilla.javascript.ast.Symbol;
import org.mozilla.javascript.ast.TaggedTemplateLiteral;
import org.mozilla.javascript.ast.TemplateCharacters;
import org.mozilla.javascript.ast.TemplateLiteral;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.ast.TryStatement;
import org.mozilla.javascript.ast.UnaryExpression;
import org.mozilla.javascript.ast.UpdateExpression;
import org.mozilla.javascript.ast.VariableDeclaration;
import org.mozilla.javascript.ast.VariableInitializer;
import org.mozilla.javascript.ast.WhileLoop;
import org.mozilla.javascript.ast.WithStatement;
import org.mozilla.javascript.ast.XmlDotQuery;
import org.mozilla.javascript.ast.XmlElemRef;
import org.mozilla.javascript.ast.XmlExpression;
import org.mozilla.javascript.ast.XmlFragment;
import org.mozilla.javascript.ast.XmlLiteral;
import org.mozilla.javascript.ast.XmlMemberGet;
import org.mozilla.javascript.ast.XmlPropRef;
import org.mozilla.javascript.ast.XmlRef;
import org.mozilla.javascript.ast.XmlString;
import org.mozilla.javascript.ast.Yield;

public final class IRFactory {
    private static final int ALWAYS_FALSE_BOOLEAN = -1;
    private static final int ALWAYS_TRUE_BOOLEAN = 1;
    private static final int LOOP_DO_WHILE = 0;
    private static final int LOOP_FOR = 2;
    private static final int LOOP_WHILE = 1;
    private Decompiler decompiler = new Decompiler();
    private Parser parser;

    public IRFactory(CompilerEnvirons compilerEnvirons) {
        this(compilerEnvirons, compilerEnvirons.getErrorReporter());
    }

    public IRFactory(CompilerEnvirons compilerEnvirons, ErrorReporter errorReporter) {
        this.parser = new Parser(compilerEnvirons, errorReporter);
    }

    private static void addSwitchCase(Node node, Node node2, Node node3) {
        if (node.getType() == 133) {
            Jump jump = (Jump)node.getFirstChild();
            if (jump.getType() == 118) {
                Node node4 = Node.newTarget();
                if (node2 != null) {
                    node2 = new Jump(119, node2);
                    ((Jump)node2).target = node4;
                    jump.addChildToBack(node2);
                } else {
                    jump.setDefault(node4);
                }
                node.addChildToBack(node4);
                node.addChildToBack(node3);
                return;
            }
            throw Kit.codeBug();
        }
        throw Kit.codeBug();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Node arrayCompTransformHelper(ArrayComprehension node, String object) {
        Object object2;
        Node node2;
        int n2;
        this.decompiler.addToken(86);
        int n3 = ((AstNode)node).getLineno();
        Node node3 = this.transform(((ArrayComprehension)node).getResult());
        List<ArrayComprehensionLoop> list = ((ArrayComprehension)node).getLoops();
        int n4 = list.size();
        Node[] nodeArray = new Node[n4];
        Node[] nodeArray2 = new Node[n4];
        for (n2 = 0; n2 < n4; ++n2) {
            node2 = list.get(n2);
            this.decompiler.addName(" ");
            this.decompiler.addToken(123);
            if (((ForInLoop)node2).isForEach()) {
                this.decompiler.addName("each ");
            }
            this.decompiler.addToken(90);
            Node node4 = ((ForInLoop)node2).getIterator();
            if (node4.getType() == 39) {
                object2 = node4.getString();
                this.decompiler.addName((String)object2);
            } else {
                this.decompile((AstNode)node4);
                object2 = this.parser.currentScriptOrFn.getNextTempName();
                this.parser.defineSymbol(90, (String)object2, false);
                node3 = IRFactory.createBinary(92, this.createAssignment(93, node4, this.parser.createName((String)object2)), node3);
            }
            node4 = this.parser.createName((String)object2);
            this.parser.defineSymbol(157, (String)object2, false);
            nodeArray[n2] = node4;
            if (((ForInLoop)node2).isForOf()) {
                this.decompiler.addName("of ");
            } else {
                this.decompiler.addToken(52);
            }
            nodeArray2[n2] = this.transform(((ForInLoop)node2).getIteratedObject());
            this.decompiler.addToken(91);
        }
        object2 = this.createCallOrNew(38, this.createPropertyGet(this.parser.createName((String)object), null, "push", 0));
        node2 = new Node(137, (Node)object2, n3);
        object = node2;
        if (((ArrayComprehension)node).getFilter() != null) {
            this.decompiler.addName(" ");
            this.decompiler.addToken(116);
            this.decompiler.addToken(90);
            object = IRFactory.createIf(this.transform(((ArrayComprehension)node).getFilter()), node2, null, n3);
            this.decompiler.addToken(91);
        }
        --n4;
        n2 = 0;
        node = object2;
        while (n4 >= 0) {
            block16: {
                try {
                    node2 = list.get(n4);
                    object2 = this.createLoopNode(null, ((AstNode)node2).getLineno());
                    this.parser.pushScope((Scope)object2);
                    ++n2;
                }
                catch (Throwable throwable) {
                    // empty catch block
                    break block16;
                }
                try {
                    object = this.createForIn(157, (Node)object2, nodeArray[n4], nodeArray2[n4], (Node)object, ((ForInLoop)node2).isForEach(), ((ForInLoop)node2).isForOf());
                    --n4;
                    continue;
                }
                catch (Throwable throwable) {}
            }
            n4 = 0;
            while (true) {
                if (n4 >= n2) {
                    void var1_4;
                    throw var1_4;
                }
                this.parser.popScope();
                ++n4;
            }
        }
        n4 = 0;
        while (true) {
            if (n4 >= n2) {
                this.decompiler.addToken(87);
                node.addChildToBack(node3);
                return object;
            }
            this.parser.popScope();
            ++n4;
        }
    }

    private static void closeSwitch(Node node) {
        if (node.getType() == 133) {
            Jump jump = (Jump)node.getFirstChild();
            if (jump.getType() == 118) {
                Node node2;
                Node node3;
                jump.target = node3 = Node.newTarget();
                Node node4 = node2 = jump.getDefault();
                if (node2 == null) {
                    node4 = node3;
                }
                node.addChildAfter(IRFactory.makeJump(5, node4), jump);
                node.addChildToBack(node3);
                return;
            }
            throw Kit.codeBug();
        }
        throw Kit.codeBug();
    }

    /*
     * Unable to fully structure code
     */
    private Node createAssignment(int var1_1, Node var2_2, Node var3_3) {
        var5_4 = IRFactory.makeReference(var2_2);
        if (var5_4 == null) {
            if (var2_2.getType() != 66 && var2_2.getType() != 67) {
                this.parser.reportError("msg.bad.assign.left");
                return var3_3;
            }
            if (var1_1 != 93) {
                this.parser.reportError("msg.bad.destruct.op");
                return var3_3;
            }
            return this.parser.createDestructuringAssignment(-1, var2_2, var3_3);
        }
        switch (var1_1) {
            default: {
                throw Kit.codeBug();
            }
            case 105: {
                var1_1 = 75;
                ** GOTO lbl48
            }
            case 104: {
                var1_1 = 25;
                ** GOTO lbl48
            }
            case 103: {
                var1_1 = 24;
                ** GOTO lbl48
            }
            case 102: {
                var1_1 = 23;
                ** GOTO lbl48
            }
            case 101: {
                var1_1 = 22;
                ** GOTO lbl48
            }
            case 100: {
                var1_1 = 21;
                ** GOTO lbl48
            }
            case 99: {
                var1_1 = 20;
                ** GOTO lbl48
            }
            case 98: {
                var1_1 = 19;
                ** GOTO lbl48
            }
            case 97: {
                var1_1 = 18;
                ** GOTO lbl48
            }
            case 96: {
                var1_1 = 11;
                ** GOTO lbl48
            }
            case 95: {
                var1_1 = 10;
                ** GOTO lbl48
            }
            case 94: {
                var1_1 = 9;
lbl48:
                // 12 sources

                var4_5 = var5_4.getType();
                if (var4_5 != 33 && var4_5 != 36) {
                    if (var4_5 != 39) {
                        if (var4_5 == 68) {
                            var2_2 = var5_4.getFirstChild();
                            this.parser.checkMutableReference(var2_2);
                            return new Node(146, var2_2, new Node(var1_1, new Node(142), var3_3));
                        }
                        throw Kit.codeBug();
                    }
                    var2_2 = new Node(var1_1, var5_4, var3_3);
                    return new Node(8, Node.newString(49, var5_4.getString()), var2_2);
                }
                var2_2 = var5_4.getFirstChild();
                var5_4 = var5_4.getLastChild();
                var4_5 = var4_5 == 33 ? 143 : 144;
                return new Node(var4_5, var2_2, var5_4, new Node(var1_1, new Node(142), var3_3));
            }
            case 93: 
        }
        return this.parser.simpleAssignment(var5_4, var3_3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Node createBinary(int n2, Node node, Node object) {
        if (n2 != 108) {
            if (n2 != 109) {
                switch (n2) {
                    default: {
                        return new Node(n2, node, (Node)object);
                    }
                    case 24: {
                        if (((Node)object).type != 40) return new Node(n2, node, (Node)object);
                        double d2 = ((Node)object).getDouble();
                        if (node.type == 40) {
                            node.setDouble(node.getDouble() / d2);
                            return node;
                        }
                        if (d2 != 1.0) return new Node(n2, node, (Node)object);
                        return new Node(28, node);
                    }
                    case 23: {
                        if (node.type == 40) {
                            double d3 = node.getDouble();
                            if (((Node)object).type == 40) {
                                node.setDouble(((Node)object).getDouble() * d3);
                                return node;
                            }
                            if (d3 != 1.0) return new Node(n2, node, (Node)object);
                            return new Node(28, (Node)object);
                        }
                        if (((Node)object).type != 40 || ((Node)object).getDouble() != 1.0) return new Node(n2, node, (Node)object);
                        return new Node(28, node);
                    }
                    case 22: {
                        if (node.type == 40) {
                            double d4 = node.getDouble();
                            if (((Node)object).type == 40) {
                                node.setDouble(d4 - ((Node)object).getDouble());
                                return node;
                            }
                            if (d4 != 0.0) return new Node(n2, node, (Node)object);
                            return new Node(29, (Node)object);
                        }
                        if (((Node)object).type != 40 || ((Node)object).getDouble() != 0.0) return new Node(n2, node, (Node)object);
                        return new Node(28, node);
                    }
                    case 21: {
                        int n3 = node.type;
                        if (n3 == 41) {
                            n3 = ((Node)object).type;
                            if (n3 == 41) {
                                object = ((Node)object).getString();
                            } else {
                                if (n3 != 40) return new Node(n2, node, (Node)object);
                                object = ScriptRuntime.numberToString(((Node)object).getDouble(), 10);
                            }
                            node.setString(node.getString().concat((String)object));
                            return node;
                        }
                        if (n3 != 40) return new Node(n2, node, (Node)object);
                        n3 = ((Node)object).type;
                        if (n3 == 40) {
                            double d5 = node.getDouble();
                            node.setDouble(((Node)object).getDouble() + d5);
                            return node;
                        }
                        if (n3 != 41) return new Node(n2, node, (Node)object);
                        ((Node)object).setString(ScriptRuntime.numberToString(node.getDouble(), 10).concat(((Node)object).getString()));
                        return object;
                    }
                }
            }
            int n4 = IRFactory.isAlwaysDefinedBoolean(node);
            if (n4 == -1) {
                return node;
            }
            if (n4 != 1) return new Node(n2, node, (Node)object);
            return object;
        }
        int n5 = IRFactory.isAlwaysDefinedBoolean(node);
        if (n5 == 1) {
            return node;
        }
        if (n5 != -1) return new Node(n2, node, (Node)object);
        return object;
    }

    private Node createCallOrNew(int n2, Node node) {
        int n3;
        block6: {
            block7: {
                block5: {
                    int n4 = node.getType();
                    n3 = 1;
                    if (n4 != 39) break block5;
                    String string = node.getString();
                    if (string.equals("eval")) break block6;
                    if (!string.equals("With")) break block7;
                    n3 = 2;
                    break block6;
                }
                if (node.getType() == 33 && node.getLastChild().getString().equals("eval")) break block6;
            }
            n3 = 0;
        }
        node = new Node(n2, node);
        if (n3 != 0) {
            this.parser.setRequiresActivation();
            node.putIntProp(10, n3);
        }
        return node;
    }

    private Node createCatch(Node node, Node node2, Node node3, int n2) {
        Node node4 = node;
        if (node == null) {
            node4 = new Node(132);
        }
        node = node2;
        if (node2 == null) {
            node = new Node(132);
        }
        return new Node(128, node4, node, node3, n2);
    }

    private static Node createCondExpr(Node node, Node node2, Node node3) {
        int n2 = IRFactory.isAlwaysDefinedBoolean(node);
        if (n2 == 1) {
            return node2;
        }
        if (n2 == -1) {
            return node3;
        }
        return new Node(106, node, node2, node3);
    }

    private Node createElementGet(Node node, String string, Node node2, int n2) {
        if (string == null && n2 == 0) {
            if (node != null) {
                return new Node(36, node, node2);
            }
            throw Kit.codeBug();
        }
        return this.createMemberRefGet(node, string, node2, n2);
    }

    private static Node createExprStatementNoReturn(Node node, int n2) {
        return new Node(137, node, n2);
    }

    private static Node createFor(Scope scope, Node node, Node node2, Node node3, Node node4) {
        if (node.getType() == 157) {
            Scope scope2 = Scope.splitScope(scope);
            scope2.setType(157);
            scope2.addChildrenToBack(node);
            scope2.addChildToBack(IRFactory.createLoop(scope, 2, node4, node2, new Node(132), node3));
            return scope2;
        }
        return IRFactory.createLoop(scope, 2, node4, node2, node, node3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Node createForIn(int n2, Node node, Node node2, Node node3, Node node4, boolean bl, boolean bl2) {
        Node node5;
        Node node6;
        Node node7;
        Node node8;
        int n3;
        block17: {
            Node node9;
            block16: {
                block18: {
                    int n4;
                    int n5;
                    int n6;
                    block13: {
                        int n7;
                        block14: {
                            block11: {
                                block15: {
                                    block12: {
                                        block9: {
                                            block10: {
                                                n5 = n6 = node2.getType();
                                                n7 = 0;
                                                n4 = 0;
                                                n3 = 0;
                                                if (n5 == 126 || n5 == 157) break block9;
                                                if (n5 == 66 || n5 == 67) break block10;
                                                node9 = IRFactory.makeReference(node2);
                                                if (node9 != null) break block11;
                                                break block12;
                                            }
                                            n4 = n3;
                                            if (node2 instanceof ArrayLiteral) {
                                                n4 = ((ArrayLiteral)node2).getDestructuringLength();
                                            }
                                            node9 = node2;
                                            n3 = n5;
                                            break block13;
                                        }
                                        node9 = node2.getLastChild();
                                        n3 = node9.getType();
                                        if (n3 == 66 || n3 == 67) break block14;
                                        if (n3 == 39) break block15;
                                    }
                                    this.parser.reportError("msg.bad.for.in.lhs");
                                    return null;
                                }
                                node9 = Node.newString(39, node9.getString());
                            }
                            n5 = -1;
                            n3 = n6;
                            break block13;
                        }
                        n4 = n7;
                        if (node9 instanceof ArrayLiteral) {
                            n4 = ((ArrayLiteral)node9).getDestructuringLength();
                        }
                        n5 = n3;
                    }
                    node8 = new Node(145);
                    n6 = bl ? 59 : (bl2 ? 61 : (n5 != -1 ? 60 : 58));
                    node7 = new Node(n6, node3);
                    node7.putProp(3, node8);
                    node6 = new Node(62);
                    node6.putProp(3, node8);
                    node3 = new Node(63);
                    node3.putProp(3, node8);
                    node5 = new Node(133);
                    if (n5 == -1) break block16;
                    node3 = node9 = this.parser.createDestructuringAssignment(n2, node9, node3);
                    if (bl) break block17;
                    node3 = node9;
                    if (bl2) break block17;
                    if (n5 == 67) break block18;
                    node3 = node9;
                    if (n4 == 2) break block17;
                }
                this.parser.reportError("msg.bad.for.in.destruct");
                node3 = node9;
                break block17;
            }
            node3 = this.parser.simpleAssignment(node9, node3);
        }
        node5.addChildToBack(new Node(137, node3));
        node5.addChildToBack(node4);
        node = IRFactory.createLoop((Jump)node, 1, node5, node6, null, null);
        node.addChildToFront(node7);
        if (n3 == 126 || n3 == 157) {
            node.addChildToFront(node2);
        }
        node8.addChildToBack(node);
        return node8;
    }

    private static Node createIf(Node node, Node node2, Node node3, int n2) {
        int n3 = IRFactory.isAlwaysDefinedBoolean(node);
        if (n3 == 1) {
            return node2;
        }
        if (n3 == -1) {
            if (node3 != null) {
                return node3;
            }
            return new Node(133, n2);
        }
        Node node4 = new Node(133, n2);
        Node node5 = Node.newTarget();
        node = new Jump(7, node);
        ((Jump)node).target = node5;
        node4.addChildToBack(node);
        node4.addChildrenToBack(node2);
        if (node3 != null) {
            node = Node.newTarget();
            node4.addChildToBack(IRFactory.makeJump(5, node));
            node4.addChildToBack(node5);
            node4.addChildrenToBack(node3);
            node4.addChildToBack(node);
        } else {
            node4.addChildToBack(node5);
        }
        return node4;
    }

    private static Node createIncDec(int n2, boolean bl, Node node) {
        int n3 = (node = IRFactory.makeReference(node)).getType();
        if (n3 != 33 && n3 != 36 && n3 != 39 && n3 != 68) {
            throw Kit.codeBug();
        }
        node = new Node(n2, node);
        n3 = 0;
        if (n2 == 111) {
            n3 = 1;
        }
        n2 = n3;
        if (bl) {
            n2 = n3 | 2;
        }
        node.putIntProp(13, n2);
        return node;
    }

    private static Node createLoop(Jump jump, int n2, Node node, Node node2, Node node3, Node node4) {
        block12: {
            Node node5;
            block11: {
                Node node6 = Node.newTarget();
                node5 = Node.newTarget();
                Node node7 = node2;
                if (n2 == 2) {
                    node7 = node2;
                    if (node2.getType() == 132) {
                        node7 = new Node(45);
                    }
                }
                node7 = new Jump(6, node7);
                ((Jump)node7).target = node6;
                node2 = Node.newTarget();
                jump.addChildToBack(node6);
                jump.addChildrenToBack(node);
                if (n2 == 1 || n2 == 2) {
                    jump.addChildrenToBack(new Node(132, jump.getLineno()));
                }
                jump.addChildToBack(node5);
                jump.addChildToBack(node7);
                jump.addChildToBack(node2);
                jump.target = node2;
                if (n2 == 1) break block11;
                node2 = node5;
                if (n2 != 2) break block12;
            }
            jump.addChildToFront(IRFactory.makeJump(5, node5));
            node2 = node5;
            if (n2 == 2) {
                n2 = node3.getType();
                if (n2 != 132) {
                    node2 = node3;
                    if (n2 != 126) {
                        node2 = node3;
                        if (n2 != 157) {
                            node2 = new Node(137, node3);
                        }
                    }
                    jump.addChildToFront(node2);
                }
                node3 = Node.newTarget();
                jump.addChildAfter(node3, node);
                node2 = node3;
                if (node4.getType() != 132) {
                    jump.addChildAfter(new Node(137, node4), node3);
                    node2 = node3;
                }
            }
        }
        jump.setContinue(node2);
        return jump;
    }

    private Scope createLoopNode(Node node, int n2) {
        Scope scope = this.parser.createScopeNode(136, n2);
        if (node != null) {
            ((Jump)node).setLoop(scope);
        }
        return scope;
    }

    private Node createMemberRefGet(Node node, String string, Node node2, int n2) {
        Node node3 = string != null ? (string.equals("*") ? new Node(42) : this.parser.createName(string)) : null;
        node = node == null ? (string == null ? new Node(81, node2) : new Node(82, node3, node2)) : (string == null ? new Node(79, node, node2) : new Node(80, node, node3, node2));
        if (n2 != 0) {
            node.putIntProp(16, n2);
        }
        return new Node(68, node);
    }

    private Node createPropertyGet(Node node, String string, String string2, int n2) {
        if (string == null && n2 == 0) {
            if (node == null) {
                return this.parser.createName(string2);
            }
            this.parser.checkActivationName(string2, 33);
            if (ScriptRuntime.isSpecialProperty(string2)) {
                node = new Node(72, node);
                node.putProp(17, string2);
                return new Node(68, node);
            }
            return new Node(33, node, Node.newString(string2));
        }
        return this.createMemberRefGet(node, string, Node.newString(string2), n2 | 1);
    }

    private static Node createString(String string) {
        return Node.newString(string);
    }

    private Node createTryCatchFinally(Node node, Node node2, Node node3, int n2) {
        boolean bl = false;
        boolean bl2 = node3 != null && (node3.getType() != 133 || node3.hasChildren());
        if (node.getType() == 133 && !node.hasChildren() && !bl2) {
            return node;
        }
        boolean bl3 = node2.hasChildren();
        if (!bl2 && !bl3) {
            return node;
        }
        Node node4 = new Node(145);
        Jump jump = new Jump(84, node, n2);
        jump.putProp(3, node4);
        if (bl3) {
            Node node5 = Node.newTarget();
            jump.addChildToBack(IRFactory.makeJump(5, node5));
            jump.target = node = Node.newTarget();
            jump.addChildToBack(node);
            Node node6 = new Node(145);
            node = node2.getFirstChild();
            n2 = 0;
            while (node != null) {
                int n3 = node.getLineno();
                Node node7 = node.getFirstChild();
                Node node8 = node7.getNext();
                node2 = node8.getNext();
                node.removeChild(node7);
                node.removeChild(node8);
                node.removeChild(node2);
                node2.addChildToBack(new Node(3));
                node2.addChildToBack(IRFactory.makeJump(5, node5));
                if (node8.getType() == 132) {
                    bl = true;
                } else {
                    node2 = IRFactory.createIf(node8, node2, null, n3);
                }
                node7 = new Node(57, node7, IRFactory.createUseLocal(node4));
                node7.putProp(3, node6);
                node7.putIntProp(14, n2);
                node6.addChildToBack(node7);
                node6.addChildToBack(this.createWith(IRFactory.createUseLocal(node6), node2, n3));
                node = node.getNext();
                ++n2;
            }
            jump.addChildToBack(node6);
            if (!bl) {
                node = new Node(51);
                node.putProp(3, node4);
                jump.addChildToBack(node);
            }
            jump.addChildToBack(node5);
        }
        if (bl2) {
            node2 = Node.newTarget();
            jump.setFinally(node2);
            jump.addChildToBack(IRFactory.makeJump(139, node2));
            node = Node.newTarget();
            jump.addChildToBack(IRFactory.makeJump(5, node));
            jump.addChildToBack(node2);
            node2 = new Node(129, node3);
            node2.putProp(3, node4);
            jump.addChildToBack(node2);
            jump.addChildToBack(node);
        }
        node4.addChildToBack(jump);
        return node4;
    }

    private static Node createUnary(int n2, Node node) {
        int n3 = node.getType();
        switch (n2) {
            default: {
                break;
            }
            case 32: {
                if (n3 != 39) break;
                node.setType(141);
                return node;
            }
            case 31: {
                if (n3 == 39) {
                    node.setType(49);
                    node = new Node(n2, node, Node.newString(node.getString()));
                } else if (n3 != 33 && n3 != 36) {
                    if (n3 == 68) {
                        Node node2 = node.getFirstChild();
                        node.removeChild(node2);
                        node = new Node(70, node2);
                    } else {
                        node = new Node(n2, new Node(45), node);
                    }
                } else {
                    Node node3 = node.getFirstChild();
                    Node node4 = node.getLastChild();
                    node.removeChild(node3);
                    node.removeChild(node4);
                    node = new Node(n2, node3, node4);
                }
                return node;
            }
            case 29: {
                if (n3 != 40) break;
                node.setDouble(-node.getDouble());
                return node;
            }
            case 27: {
                if (n3 != 40) break;
                node.setDouble(~ScriptRuntime.toInt32(node.getDouble()));
                return node;
            }
            case 26: {
                int n4 = IRFactory.isAlwaysDefinedBoolean(node);
                if (n4 == 0) break;
                n2 = n4 == 1 ? 44 : 45;
                if (n3 != 45 && n3 != 44) {
                    return new Node(n2);
                }
                node.setType(n2);
                return node;
            }
        }
        return new Node(n2, node);
    }

    private static Node createUseLocal(Node node) {
        if (145 == node.getType()) {
            Node node2 = new Node(54);
            node2.putProp(3, node);
            return node2;
        }
        throw Kit.codeBug();
    }

    private Node createWith(Node node, Node node2, int n2) {
        this.parser.setRequiresActivation();
        Node node3 = new Node(133, n2);
        node3.addChildToBack(new Node(2, node));
        node3.addChildrenToBack(new Node(127, node2, n2));
        node3.addChildToBack(new Node(3));
        return node3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Node genExprTransformHelper(GeneratorExpression node) {
        int n2;
        int n3;
        block15: {
            Object object;
            this.decompiler.addToken(90);
            int n4 = ((AstNode)node).getLineno();
            Node node2 = this.transform(((GeneratorExpression)node).getResult());
            List<GeneratorExpressionLoop> list = ((GeneratorExpression)node).getLoops();
            n3 = list.size();
            Node[] nodeArray = new Node[n3];
            Node[] nodeArray2 = new Node[n3];
            int n5 = 0;
            int n6 = 0;
            for (n2 = 0; n2 < n3; ++n2) {
                GeneratorExpressionLoop generatorExpressionLoop = list.get(n2);
                this.decompiler.addName(" ");
                this.decompiler.addToken(123);
                this.decompiler.addToken(90);
                Node node3 = generatorExpressionLoop.getIterator();
                if (node3.getType() == 39) {
                    object = node3.getString();
                    this.decompiler.addName((String)object);
                } else {
                    this.decompile((AstNode)node3);
                    object = this.parser.currentScriptOrFn.getNextTempName();
                    this.parser.defineSymbol(90, (String)object, false);
                    node2 = IRFactory.createBinary(92, this.createAssignment(93, node3, this.parser.createName((String)object)), node2);
                }
                node3 = this.parser.createName((String)object);
                this.parser.defineSymbol(157, (String)object, false);
                nodeArray[n2] = node3;
                if (generatorExpressionLoop.isForOf()) {
                    this.decompiler.addName("of ");
                } else {
                    this.decompiler.addToken(52);
                }
                nodeArray2[n2] = this.transform(generatorExpressionLoop.getIteratedObject());
                this.decompiler.addToken(91);
            }
            node2 = new Node(137, new Node(73, node2, ((AstNode)node).getLineno()), n4);
            object = node2;
            if (((GeneratorExpression)node).getFilter() != null) {
                this.decompiler.addName(" ");
                this.decompiler.addToken(116);
                this.decompiler.addToken(90);
                object = IRFactory.createIf(this.transform(((GeneratorExpression)node).getFilter()), node2, null, n4);
                this.decompiler.addToken(91);
            }
            node = object;
            n4 = n3 - 1;
            n2 = 0;
            while (true) {
                n3 = n5;
                if (n4 < 0) break block15;
                try {
                    node2 = list.get(n4);
                    object = this.createLoopNode(null, ((AstNode)node2).getLineno());
                    this.parser.pushScope((Scope)object);
                    ++n2;
                }
                catch (Throwable throwable) {
                    n4 = n6;
                    break;
                }
                try {
                    node = this.createForIn(157, (Node)object, nodeArray[n4], nodeArray2[n4], node, ((GeneratorExpressionLoop)node2).isForEach(), ((ForInLoop)node2).isForOf());
                    --n4;
                }
                catch (Throwable throwable) {
                    n4 = n6;
                    break;
                }
            }
            while (true) {
                if (n4 >= n2) {
                    void var1_4;
                    throw var1_4;
                }
                this.parser.popScope();
                ++n4;
            }
        }
        while (true) {
            if (n3 >= n2) {
                this.decompiler.addToken(91);
                return node;
            }
            this.parser.popScope();
            ++n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Object getPropKey(Node object) {
        if (object instanceof Name) {
            object = ((Name)object).getIdentifier();
            this.decompiler.addName((String)object);
            return ScriptRuntime.getIndexObject((String)object);
        }
        if (object instanceof StringLiteral) {
            object = ((StringLiteral)object).getValue();
            this.decompiler.addString((String)object);
            return ScriptRuntime.getIndexObject((String)object);
        }
        if (!(object instanceof NumberLiteral)) throw Kit.codeBug();
        double d2 = ((NumberLiteral)object).getNumber();
        this.decompiler.addNumber(d2);
        return ScriptRuntime.getIndexObject(d2);
    }

    private static Node initFunction(FunctionNode node, int n2, Node node2, int n3) {
        Node node3;
        ((FunctionNode)node).setFunctionType(n3);
        node.addChildToBack(node2);
        if (((ScriptNode)node).getFunctionCount() != 0) {
            ((FunctionNode)node).setRequiresActivation();
        }
        if (n3 == 2 && (node3 = ((FunctionNode)node).getFunctionName()) != null && ((Name)node3).length() != 0 && ((Scope)node).getSymbol(((Name)node3).getIdentifier()) == null) {
            ((Scope)node).putSymbol(new Symbol(113, ((Name)node3).getIdentifier()));
            node2.addChildrenToFront(new Node(137, new Node(8, Node.newString(49, ((Name)node3).getIdentifier()), new Node(64))));
        }
        if ((node3 = node2.getLastChild()) == null || node3.getType() != 4) {
            node2.addChildToBack(new Node(4));
        }
        node = Node.newString(113, ((FunctionNode)node).getName());
        node.putIntProp(1, n2);
        return node;
    }

    private static int isAlwaysDefinedBoolean(Node node) {
        int n2 = node.getType();
        if (n2 != 40) {
            if (n2 != 42 && n2 != 44) {
                if (n2 != 45) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        double d2 = node.getDouble();
        if (!Double.isNaN(d2) && d2 != 0.0) {
            return 1;
        }
        return -1;
    }

    private static Jump makeJump(int n2, Node node) {
        Jump jump = new Jump(n2);
        jump.target = node;
        return jump;
    }

    private static Node makeReference(Node node) {
        int n2 = node.getType();
        if (n2 != 33 && n2 != 36 && n2 != 68) {
            if (n2 != 38) {
                if (n2 != 39) {
                    return null;
                }
            } else {
                node.setType(71);
                return new Node(68, node);
            }
        }
        return node;
    }

    private Node transformArrayComp(ArrayComprehension arrayComprehension) {
        int n2 = arrayComprehension.getLineno();
        Scope scope = this.parser.createScopeNode(161, n2);
        String string = this.parser.currentScriptOrFn.getNextTempName();
        this.parser.pushScope(scope);
        try {
            this.parser.defineSymbol(157, string, false);
            Node node = new Node(133, n2);
            Node node2 = this.createCallOrNew(30, this.parser.createName("Array"));
            Node node3 = new Node(137, this.createAssignment(93, this.parser.createName(string), node2), n2);
            node.addChildToBack(node3);
            node.addChildToBack(this.arrayCompTransformHelper(arrayComprehension, string));
            scope.addChildToBack(node);
            scope.addChildToBack(this.parser.createName(string));
            return scope;
        }
        finally {
            this.parser.popScope();
        }
    }

    private Node transformArrayLiteral(ArrayLiteral object) {
        int n2;
        if (((ArrayLiteral)object).isDestructuring()) {
            return object;
        }
        this.decompiler.addToken(86);
        List<AstNode> list = ((ArrayLiteral)object).getElements();
        Node node = new Node(66);
        Iterable iterable = null;
        int n3 = 0;
        for (n2 = 0; n2 < list.size(); ++n2) {
            Iterable<Node> iterable2 = list.get(n2);
            if (iterable2.getType() != 132) {
                node.addChildToBack(this.transform((AstNode)iterable2));
            } else {
                iterable2 = iterable;
                if (iterable == null) {
                    iterable2 = new ArrayList();
                }
                iterable2.add(n2);
                iterable = iterable2;
            }
            if (n2 >= list.size() - 1) continue;
            this.decompiler.addToken(92);
        }
        this.decompiler.addToken(87);
        node.putIntProp(21, ((ArrayLiteral)object).getDestructuringLength());
        if (iterable != null) {
            object = new int[iterable.size()];
            for (n2 = n3; n2 < iterable.size(); ++n2) {
                object[n2] = (Integer)iterable.get(n2);
            }
            node.putProp(11, object);
        }
        return node;
    }

    private Node transformAssignment(Assignment assignment) {
        AstNode astNode = assignment.getRight();
        Node node = this.transformAssignmentLeft(assignment, this.parser.removeParens(assignment.getLeft()), astNode);
        if (this.isDestructuring(node)) {
            this.decompile((AstNode)node);
        } else {
            node = this.transform((AstNode)node);
        }
        this.decompiler.addToken(assignment.getType());
        return this.createAssignment(assignment.getType(), node, this.transform(astNode));
    }

    private AstNode transformAssignmentLeft(Assignment assignment, AstNode astNode, AstNode astNode2) {
        if (astNode2.getType() == 42 && assignment.getType() == 93 && astNode instanceof Name && astNode2 instanceof KeywordLiteral) {
            Object object = ((Name)astNode).getIdentifier();
            for (astNode2 = assignment.getParent(); astNode2 != null; astNode2 = astNode2.getParent()) {
                Name name;
                if (!(astNode2 instanceof FunctionNode) || (name = ((FunctionNode)astNode2).getFunctionName()) == null || !name.getIdentifier().equals(object)) continue;
                astNode2 = new PropertyGet();
                object = new KeywordLiteral();
                ((KeywordLiteral)object).setType(43);
                ((InfixExpression)astNode2).setLeft((AstNode)object);
                ((InfixExpression)astNode2).setRight(astNode);
                assignment.setLeft(astNode2);
                return astNode2;
            }
        }
        return astNode;
    }

    private Node transformBigInt(BigIntLiteral bigIntLiteral) {
        this.decompiler.addBigInt(bigIntLiteral.getBigInt());
        return bigIntLiteral;
    }

    private Node transformBlock(AstNode astNode) {
        boolean bl = astNode instanceof Scope;
        if (bl) {
            this.parser.pushScope((Scope)astNode);
        }
        try {
            ArrayList<Node> arrayList = new ArrayList<Node>();
            Iterator<Node> iterator = astNode.iterator();
            while (iterator.hasNext()) {
                arrayList.add(this.transform((AstNode)iterator.next()));
            }
            astNode.removeChildren();
            iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                astNode.addChildToBack(iterator.next());
            }
            return astNode;
        }
        finally {
            if (astNode instanceof Scope) {
                this.parser.popScope();
            }
        }
    }

    private Node transformBreak(BreakStatement breakStatement) {
        this.decompiler.addToken(124);
        if (breakStatement.getBreakLabel() != null) {
            this.decompiler.addName(breakStatement.getBreakLabel().getIdentifier());
        }
        this.decompiler.addEOL(85);
        return breakStatement;
    }

    private Node transformCondExpr(ConditionalExpression conditionalExpression) {
        Node node = this.transform(conditionalExpression.getTestExpression());
        this.decompiler.addToken(106);
        Node node2 = this.transform(conditionalExpression.getTrueExpression());
        this.decompiler.addToken(107);
        return IRFactory.createCondExpr(node, node2, this.transform(conditionalExpression.getFalseExpression()));
    }

    private Node transformContinue(ContinueStatement continueStatement) {
        this.decompiler.addToken(125);
        if (continueStatement.getLabel() != null) {
            this.decompiler.addName(continueStatement.getLabel().getIdentifier());
        }
        this.decompiler.addEOL(85);
        return continueStatement;
    }

    private Node transformDefaultXmlNamepace(UnaryExpression unaryExpression) {
        this.decompiler.addToken(120);
        this.decompiler.addName(" xml");
        this.decompiler.addName(" namespace");
        this.decompiler.addToken(93);
        return IRFactory.createUnary(76, this.transform(unaryExpression.getOperand()));
    }

    private Node transformDoLoop(DoLoop node) {
        node.setType(136);
        this.parser.pushScope((Scope)node);
        try {
            this.decompiler.addToken(122);
            this.decompiler.addEOL(88);
            Node node2 = this.transform(node.getBody());
            this.decompiler.addToken(89);
            this.decompiler.addToken(121);
            this.decompiler.addToken(90);
            Node node3 = this.transform(node.getCondition());
            this.decompiler.addToken(91);
            this.decompiler.addEOL(85);
            node = IRFactory.createLoop(node, 0, node2, node3, null, null);
            return node;
        }
        finally {
            this.parser.popScope();
        }
    }

    private Node transformElementGet(ElementGet node) {
        Node node2 = this.transform(node.getTarget());
        this.decompiler.addToken(86);
        node = this.transform(node.getElement());
        this.decompiler.addToken(87);
        return new Node(36, node2, node);
    }

    private Node transformExprStmt(ExpressionStatement expressionStatement) {
        Node node = this.transform(expressionStatement.getExpression());
        this.decompiler.addEOL(85);
        return new Node(expressionStatement.getType(), node, expressionStatement.getLineno());
    }

    private Node transformForInLoop(ForInLoop node) {
        this.decompiler.addToken(123);
        if (node.isForEach()) {
            this.decompiler.addName("each ");
        }
        this.decompiler.addToken(90);
        node.setType(136);
        this.parser.pushScope((Scope)node);
        try {
            Node node2 = node.getIterator();
            int n2 = node2 instanceof VariableDeclaration ? node2.getType() : -1;
            node2 = this.transform((AstNode)node2);
            if (node.isForOf()) {
                this.decompiler.addName("of ");
            } else {
                this.decompiler.addToken(52);
            }
            Node node3 = this.transform(node.getIteratedObject());
            this.decompiler.addToken(91);
            this.decompiler.addEOL(88);
            Node node4 = this.transform(node.getBody());
            this.decompiler.addEOL(89);
            node = this.createForIn(n2, node, node2, node3, node4, node.isForEach(), node.isForOf());
            return node;
        }
        finally {
            this.parser.popScope();
        }
    }

    private Node transformForLoop(ForLoop node) {
        this.decompiler.addToken(123);
        this.decompiler.addToken(90);
        node.setType(136);
        Object object = this.parser;
        Scope scope = ((Parser)object).currentScope;
        ((Parser)object).currentScope = node;
        try {
            object = this.transform(node.getInitializer());
            this.decompiler.addToken(85);
            Node node2 = this.transform(node.getCondition());
            this.decompiler.addToken(85);
            Node node3 = this.transform(node.getIncrement());
            this.decompiler.addToken(91);
            this.decompiler.addEOL(88);
            Node node4 = this.transform(node.getBody());
            this.decompiler.addEOL(89);
            node = IRFactory.createFor(node, (Node)object, node2, node3, node4);
            return node;
        }
        finally {
            this.parser.currentScope = scope;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Node transformFunction(FunctionNode object) {
        int n2 = ((FunctionNode)object).getFunctionType();
        int n3 = this.decompiler.markFunctionStart(n2, ((FunctionNode)object).isES6Generator());
        Node node = this.decompileFunctionHeader((FunctionNode)object);
        int n4 = this.parser.currentScriptOrFn.addFunction((FunctionNode)object);
        Parser$PerFunctionVariables parser$PerFunctionVariables = this.parser.createPerFunctionVariables((FunctionNode)object);
        try {
            Object object2 = (Node)((Node)object).getProp(23);
            ((Node)object).removeProp(23);
            int n5 = ((FunctionNode)object).getBody().getLineno();
            Object object3 = this.parser;
            ++((Parser)object3).nestingOfFunction;
            Node node2 = this.transform(((FunctionNode)object).getBody());
            if (!((FunctionNode)object).isExpressionClosure()) {
                this.decompiler.addToken(89);
            }
            ((ScriptNode)object).setEncodedSourceBounds(n3, this.decompiler.markFunctionEnd(n3));
            if (n2 != 2 && !((FunctionNode)object).isExpressionClosure()) {
                this.decompiler.addToken(1);
            }
            if (object2 != null) {
                object3 = new Node(137, (Node)object2, n5);
                node2.addChildToFront((Node)object3);
            }
            n3 = ((FunctionNode)object).getFunctionType();
            object2 = object3 = IRFactory.initFunction((FunctionNode)object, n4, node2, n3);
            if (node != null) {
                object2 = object3 = this.createAssignment(93, node, (Node)object3);
                if (n3 != 2) {
                    object2 = IRFactory.createExprStatementNoReturn((Node)object3, ((AstNode)object).getLineno());
                }
            }
            object = this.parser;
            --((Parser)object).nestingOfFunction;
            parser$PerFunctionVariables.restore();
            return object2;
        }
        catch (Throwable throwable) {
            Parser parser = this.parser;
            --parser.nestingOfFunction;
            parser$PerFunctionVariables.restore();
            throw throwable;
        }
    }

    private Node transformFunctionCall(FunctionCall iterable) {
        Node node = this.createCallOrNew(38, this.transform(((FunctionCall)iterable).getTarget()));
        node.setLineno(((AstNode)iterable).getLineno());
        this.decompiler.addToken(90);
        iterable = ((FunctionCall)iterable).getArguments();
        for (int i2 = 0; i2 < iterable.size(); ++i2) {
            node.addChildToBack(this.transform((AstNode)iterable.get(i2)));
            if (i2 >= iterable.size() - 1) continue;
            this.decompiler.addToken(92);
        }
        this.decompiler.addToken(91);
        return node;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Node transformGenExpr(GeneratorExpression generatorExpression) {
        FunctionNode functionNode = new FunctionNode();
        functionNode.setSourceName(this.parser.currentScriptOrFn.getNextTempName());
        functionNode.setIsGenerator();
        functionNode.setFunctionType(2);
        functionNode.setRequiresActivation();
        int n2 = functionNode.getFunctionType();
        int n3 = this.decompiler.markFunctionStart(n2, false);
        Node node = this.decompileFunctionHeader(functionNode);
        int n4 = this.parser.currentScriptOrFn.addFunction(functionNode);
        Parser$PerFunctionVariables parser$PerFunctionVariables = this.parser.createPerFunctionVariables(functionNode);
        try {
            Object object = (Node)functionNode.getProp(23);
            functionNode.removeProp(23);
            int n5 = generatorExpression.lineno;
            Object object2 = this.parser;
            ++((Parser)object2).nestingOfFunction;
            Node node2 = this.genExprTransformHelper(generatorExpression);
            if (!functionNode.isExpressionClosure()) {
                this.decompiler.addToken(89);
            }
            functionNode.setEncodedSourceBounds(n3, this.decompiler.markFunctionEnd(n3));
            if (n2 != 2 && !functionNode.isExpressionClosure()) {
                this.decompiler.addToken(1);
            }
            if (object != null) {
                object2 = new Node(137, (Node)object, n5);
                node2.addChildToFront((Node)object2);
            }
            n2 = functionNode.getFunctionType();
            object = object2 = IRFactory.initFunction(functionNode, n4, node2, n2);
            if (node != null) {
                object = object2 = this.createAssignment(93, node, (Node)object2);
                if (n2 != 2) {
                    object = IRFactory.createExprStatementNoReturn((Node)object2, functionNode.getLineno());
                }
            }
            object2 = this.parser;
            --((Parser)object2).nestingOfFunction;
            parser$PerFunctionVariables.restore();
            object = this.createCallOrNew(38, (Node)object);
            ((Node)object).setLineno(generatorExpression.getLineno());
            this.decompiler.addToken(90);
            this.decompiler.addToken(91);
            return object;
        }
        catch (Throwable throwable) {
            Parser parser = this.parser;
            --parser.nestingOfFunction;
            parser$PerFunctionVariables.restore();
            throw throwable;
        }
    }

    private Node transformIf(IfStatement ifStatement) {
        Node node;
        this.decompiler.addToken(116);
        this.decompiler.addToken(90);
        Node node2 = this.transform(ifStatement.getCondition());
        this.decompiler.addToken(91);
        this.decompiler.addEOL(88);
        Node node3 = this.transform(ifStatement.getThenPart());
        if (ifStatement.getElsePart() != null) {
            this.decompiler.addToken(89);
            this.decompiler.addToken(117);
            this.decompiler.addEOL(88);
            node = this.transform(ifStatement.getElsePart());
        } else {
            node = null;
        }
        this.decompiler.addEOL(89);
        return IRFactory.createIf(node2, node3, node, ifStatement.getLineno());
    }

    private Node transformInfix(InfixExpression infixExpression) {
        Node node = this.transform(infixExpression.getLeft());
        this.decompiler.addToken(infixExpression.getType());
        Node node2 = this.transform(infixExpression.getRight());
        if (infixExpression instanceof XmlDotQuery) {
            this.decompiler.addToken(91);
        }
        return IRFactory.createBinary(infixExpression.getType(), node, node2);
    }

    /*
     * WARNING - void declaration
     */
    private Node transformLabeledStatement(LabeledStatement node) {
        void var4_8;
        Label label = ((LabeledStatement)node).getFirstLabel();
        List<Label> object2 = ((LabeledStatement)node).getLabels();
        this.decompiler.addName(label.getName());
        int n2 = object2.size();
        int n3 = 107;
        if (n2 > 1) {
            for (Label label2 : object2.subList(1, object2.size())) {
                this.decompiler.addEOL(107);
                this.decompiler.addName(label2.getName());
            }
        }
        if (((LabeledStatement)node).getStatement().getType() == 133) {
            this.decompiler.addToken(67);
            Decompiler decompiler = this.decompiler;
            n3 = 88;
        } else {
            Decompiler decompiler = this.decompiler;
        }
        var4_8.addEOL(n3);
        Node node2 = this.transform(((LabeledStatement)node).getStatement());
        if (((LabeledStatement)node).getStatement().getType() == 133) {
            this.decompiler.addEOL(89);
        }
        node = Node.newTarget();
        Node node3 = new Node(133, (Node)label, node2, node);
        label.target = node;
        return node3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Node transformLetNode(LetNode letNode) {
        this.parser.pushScope(letNode);
        try {
            this.decompiler.addToken(157);
            this.decompiler.addToken(90);
            Node node = this.transformVariableInitializers(letNode.getVariables());
            this.decompiler.addToken(91);
            letNode.addChildToBack(node);
            boolean bl = letNode.getType() == 162;
            if (letNode.getBody() == null) return letNode;
            if (bl) {
                this.decompiler.addName(" ");
            } else {
                this.decompiler.addEOL(88);
            }
            letNode.addChildToBack(this.transform(letNode.getBody()));
            if (bl) return letNode;
            this.decompiler.addEOL(89);
            return letNode;
        }
        finally {
            this.parser.popScope();
        }
    }

    private Node transformLiteral(AstNode astNode) {
        this.decompiler.addToken(astNode.getType());
        return astNode;
    }

    private Node transformName(Name name) {
        this.decompiler.addName(name.getIdentifier());
        return name;
    }

    private Node transformNewExpr(NewExpression newExpression) {
        this.decompiler.addToken(30);
        Node node = this.createCallOrNew(30, this.transform(newExpression.getTarget()));
        node.setLineno(newExpression.getLineno());
        List<AstNode> list = newExpression.getArguments();
        this.decompiler.addToken(90);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            node.addChildToBack(this.transform(list.get(i2)));
            if (i2 >= list.size() - 1) continue;
            this.decompiler.addToken(92);
        }
        this.decompiler.addToken(91);
        if (newExpression.getInitializer() != null) {
            node.addChildToBack(this.transformObjectLiteral(newExpression.getInitializer()));
        }
        return node;
    }

    private Node transformNumber(NumberLiteral numberLiteral) {
        this.decompiler.addNumber(numberLiteral.getNumber());
        return numberLiteral;
    }

    private Node transformObjectLiteral(ObjectLiteral iterable) {
        if (((ObjectLiteral)iterable).isDestructuring()) {
            return iterable;
        }
        this.decompiler.addToken(88);
        iterable = ((ObjectLiteral)iterable).getElements();
        Node node = new Node(67);
        if (iterable.isEmpty()) {
            iterable = ScriptRuntime.emptyArgs;
        } else {
            int n2 = iterable.size();
            int n3 = 0;
            Object[] objectArray = new Object[n2];
            for (ObjectProperty objectProperty : iterable) {
                if (objectProperty.isGetterMethod()) {
                    this.decompiler.addToken(155);
                } else if (objectProperty.isSetterMethod()) {
                    this.decompiler.addToken(156);
                } else if (objectProperty.isNormalMethod()) {
                    this.decompiler.addToken(167);
                }
                int n4 = n3 + 1;
                objectArray[n3] = this.getPropKey(objectProperty.getLeft());
                if (!objectProperty.isMethod()) {
                    this.decompiler.addToken(67);
                }
                Node node2 = this.transform(objectProperty.getRight());
                if (objectProperty.isGetterMethod()) {
                    iterable = IRFactory.createUnary(155, node2);
                } else if (objectProperty.isSetterMethod()) {
                    iterable = IRFactory.createUnary(156, node2);
                } else {
                    iterable = node2;
                    if (objectProperty.isNormalMethod()) {
                        iterable = IRFactory.createUnary(167, node2);
                    }
                }
                node.addChildToBack((Node)iterable);
                if (n4 < n2) {
                    this.decompiler.addToken(92);
                }
                n3 = n4;
            }
            iterable = objectArray;
        }
        this.decompiler.addToken(89);
        node.putProp(12, iterable);
        return node;
    }

    private Node transformParenExpr(ParenthesizedExpression node) {
        node = ((ParenthesizedExpression)node).getExpression();
        this.decompiler.addToken(90);
        int n2 = 1;
        while (node instanceof ParenthesizedExpression) {
            this.decompiler.addToken(90);
            ++n2;
            node = ((ParenthesizedExpression)node).getExpression();
        }
        node = this.transform((AstNode)node);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.decompiler.addToken(91);
        }
        node.putProp(19, Boolean.TRUE);
        return node;
    }

    private Node transformPropertyGet(PropertyGet object) {
        Node node = this.transform(((PropertyGet)object).getTarget());
        object = ((PropertyGet)object).getProperty().getIdentifier();
        this.decompiler.addToken(112);
        this.decompiler.addName((String)object);
        return this.createPropertyGet(node, null, (String)object, 0);
    }

    private Node transformRegExp(RegExpLiteral regExpLiteral) {
        this.decompiler.addRegexp(regExpLiteral.getValue(), regExpLiteral.getFlags());
        this.parser.currentScriptOrFn.addRegExp(regExpLiteral);
        return regExpLiteral;
    }

    private Node transformReturn(ReturnStatement node) {
        AstNode astNode;
        Object object = Boolean.TRUE;
        boolean bl = ((Boolean)object).equals(node.getProp(25));
        boolean bl2 = ((Boolean)object).equals(node.getProp(27));
        if (bl) {
            if (!bl2) {
                this.decompiler.addName(" ");
            }
        } else {
            this.decompiler.addToken(4);
        }
        object = (astNode = node.getReturnValue()) == null ? null : this.transform(astNode);
        if (!bl) {
            this.decompiler.addEOL(85);
        }
        node = astNode == null ? new Node(4, node.getLineno()) : new Node(4, (Node)object, node.getLineno());
        return node;
    }

    private Node transformScript(ScriptNode scriptNode) {
        this.decompiler.addToken(140);
        if (this.parser.currentScope != null) {
            Kit.codeBug();
        }
        this.parser.currentScope = scriptNode;
        Node node = new Node(133);
        Iterator<Node> iterator = scriptNode.iterator();
        while (iterator.hasNext()) {
            node.addChildToBack(this.transform((AstNode)iterator.next()));
        }
        scriptNode.removeChildren();
        node = node.getFirstChild();
        if (node != null) {
            scriptNode.addChildrenToBack(node);
        }
        return scriptNode;
    }

    private Node transformString(StringLiteral stringLiteral) {
        this.decompiler.addString(stringLiteral.getValue());
        return Node.newString(stringLiteral.getValue());
    }

    private Node transformSwitch(SwitchStatement node) {
        this.decompiler.addToken(118);
        this.decompiler.addToken(90);
        Node node2 = this.transform(((SwitchStatement)node).getExpression());
        this.decompiler.addToken(91);
        node.addChildToBack(node2);
        node2 = new Node(133, node, ((AstNode)node).getLineno());
        this.decompiler.addEOL(88);
        for (SwitchCase switchCase : ((SwitchStatement)node).getCases()) {
            Object object = switchCase.getExpression();
            node = null;
            if (object != null) {
                this.decompiler.addToken(119);
                node = this.transform((AstNode)object);
            } else {
                this.decompiler.addToken(120);
            }
            this.decompiler.addEOL(107);
            object = switchCase.getStatements();
            Block astNode = new Block();
            if (object != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    astNode.addChildToBack(this.transform((AstNode)object.next()));
                }
            }
            IRFactory.addSwitchCase(node2, node, astNode);
        }
        this.decompiler.addEOL(89);
        IRFactory.closeSwitch(node2);
        return node2;
    }

    private Node transformTemplateLiteral(TemplateLiteral node) {
        this.decompiler.addToken(170);
        Object object = node.getElements();
        node = Node.newString("");
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (AstNode)object.next();
            if (((Node)object2).getType() != 171) {
                this.decompiler.addToken(172);
                node = IRFactory.createBinary(21, node, this.transform((AstNode)object2));
                this.decompiler.addToken(89);
                continue;
            }
            object2 = (TemplateCharacters)object2;
            this.decompiler.addTemplateLiteral(((TemplateCharacters)object2).getRawValue());
            if (((String)(object2 = ((TemplateCharacters)object2).getValue())).length() <= 0) continue;
            node = IRFactory.createBinary(21, node, Node.newString((String)object2));
        }
        this.decompiler.addToken(170);
        return node;
    }

    private Node transformTemplateLiteralCall(TaggedTemplateLiteral astNode) {
        Node node = this.createCallOrNew(38, this.transform(((TaggedTemplateLiteral)astNode).getTarget()));
        node.setLineno(astNode.getLineno());
        this.decompiler.addToken(170);
        astNode = (TemplateLiteral)((TaggedTemplateLiteral)astNode).getTemplateLiteral();
        Object object = ((TemplateLiteral)astNode).getElements();
        node.addChildToBack(astNode);
        object = object.iterator();
        while (object.hasNext()) {
            AstNode astNode2 = (AstNode)object.next();
            if (astNode2.getType() != 171) {
                this.decompiler.addToken(172);
                node.addChildToBack(this.transform(astNode2));
                this.decompiler.addToken(89);
                continue;
            }
            astNode2 = (TemplateCharacters)astNode2;
            this.decompiler.addTemplateLiteral(((TemplateCharacters)astNode2).getRawValue());
        }
        this.parser.currentScriptOrFn.addTemplateLiteral((TemplateLiteral)astNode);
        this.decompiler.addToken(170);
        return node;
    }

    private Node transformThrow(ThrowStatement throwStatement) {
        this.decompiler.addToken(50);
        Node node = this.transform(throwStatement.getExpression());
        this.decompiler.addEOL(85);
        return new Node(50, node, throwStatement.getLineno());
    }

    private Node transformTry(TryStatement tryStatement) {
        Node node;
        this.decompiler.addToken(84);
        this.decompiler.addEOL(88);
        Node node2 = this.transform(tryStatement.getTryBlock());
        this.decompiler.addEOL(89);
        Block block = new Block();
        Iterator<CatchClause> iterator = tryStatement.getCatchClauses().iterator();
        while (true) {
            boolean bl = iterator.hasNext();
            node = null;
            Node node3 = null;
            if (!bl) break;
            CatchClause catchClause = iterator.next();
            this.decompiler.addToken(128);
            node = catchClause.getVarName();
            if (node != null) {
                this.decompiler.addToken(90);
                this.decompiler.addName(((Name)node).getIdentifier());
                node3 = this.parser.createName(((Name)node).getIdentifier());
                node = catchClause.getCatchCondition();
                if (node != null) {
                    this.decompiler.addName(" ");
                    this.decompiler.addToken(116);
                    node = this.transform((AstNode)node);
                } else {
                    node = new EmptyExpression();
                }
                this.decompiler.addToken(91);
            } else {
                node = null;
            }
            this.decompiler.addEOL(88);
            Node node4 = this.transform(catchClause.getBody());
            this.decompiler.addEOL(89);
            block.addChildToBack(this.createCatch(node3, node, node4, catchClause.getLineno()));
        }
        if (tryStatement.getFinallyBlock() != null) {
            this.decompiler.addToken(129);
            this.decompiler.addEOL(88);
            node = this.transform(tryStatement.getFinallyBlock());
            this.decompiler.addEOL(89);
        }
        return this.createTryCatchFinally(node2, block, node, tryStatement.getLineno());
    }

    private Node transformUnary(UnaryExpression unaryExpression) {
        int n2 = unaryExpression.getType();
        if (n2 == 76) {
            return this.transformDefaultXmlNamepace(unaryExpression);
        }
        this.decompiler.addToken(n2);
        return IRFactory.createUnary(n2, this.transform(unaryExpression.getOperand()));
    }

    private Node transformUpdate(UpdateExpression updateExpression) {
        int n2 = updateExpression.getType();
        if (updateExpression.isPrefix()) {
            this.decompiler.addToken(n2);
        }
        Node node = this.transform(updateExpression.getOperand());
        if (updateExpression.isPostfix()) {
            this.decompiler.addToken(n2);
        }
        return IRFactory.createIncDec(n2, updateExpression.isPostfix(), node);
    }

    private Node transformVariableInitializers(VariableDeclaration variableDeclaration) {
        Iterable<VariableInitializer> iterable = variableDeclaration.getVariables();
        int n2 = iterable.size();
        Iterator<VariableInitializer> iterator = iterable.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            block8: {
                block7: {
                    Node node;
                    block6: {
                        VariableInitializer variableInitializer = iterator.next();
                        iterable = variableInitializer.getTarget();
                        AstNode astNode = variableInitializer.getInitializer();
                        if (variableInitializer.isDestructuring()) {
                            this.decompile((AstNode)iterable);
                        } else {
                            iterable = this.transform((AstNode)iterable);
                        }
                        node = null;
                        if (astNode != null) {
                            this.decompiler.addToken(93);
                            node = this.transform(astNode);
                        }
                        if (!variableInitializer.isDestructuring()) break block6;
                        if (node == null) break block7;
                        variableDeclaration.addChildToBack(this.parser.createDestructuringAssignment(variableDeclaration.getType(), (Node)iterable, node));
                        break block8;
                    }
                    if (node != null) {
                        ((Node)iterable).addChildToBack(node);
                    }
                }
                variableDeclaration.addChildToBack((Node)iterable);
            }
            if (n3 < n2 - 1) {
                this.decompiler.addToken(92);
            }
            ++n3;
        }
        return variableDeclaration;
    }

    private Node transformVariables(VariableDeclaration variableDeclaration) {
        this.decompiler.addToken(variableDeclaration.getType());
        this.transformVariableInitializers(variableDeclaration);
        AstNode astNode = variableDeclaration.getParent();
        if (!(astNode instanceof Loop) && !(astNode instanceof LetNode)) {
            this.decompiler.addEOL(85);
        }
        return variableDeclaration;
    }

    private Node transformWhileLoop(WhileLoop node) {
        this.decompiler.addToken(121);
        node.setType(136);
        this.parser.pushScope((Scope)node);
        try {
            this.decompiler.addToken(90);
            Node node2 = this.transform(node.getCondition());
            this.decompiler.addToken(91);
            this.decompiler.addEOL(88);
            Node node3 = this.transform(node.getBody());
            this.decompiler.addEOL(89);
            node = IRFactory.createLoop(node, 1, node3, node2, null, null);
            return node;
        }
        finally {
            this.parser.popScope();
        }
    }

    private Node transformWith(WithStatement withStatement) {
        this.decompiler.addToken(127);
        this.decompiler.addToken(90);
        Node node = this.transform(withStatement.getExpression());
        this.decompiler.addToken(91);
        this.decompiler.addEOL(88);
        Node node2 = this.transform(withStatement.getStatement());
        this.decompiler.addEOL(89);
        return this.createWith(node, node2, withStatement.getLineno());
    }

    /*
     * Enabled aggressive block sorting
     */
    private Node transformXmlLiteral(XmlLiteral object) {
        Node node = new Node(30, ((AstNode)object).getLineno());
        Object object2 = ((XmlLiteral)object).getFragments();
        boolean bl = ((XmlString)object2.get(0)).getXml().trim().startsWith("<>");
        Object object3 = this.parser;
        object = bl ? "XMLList" : "XML";
        node.addChildToBack(((Parser)object3).createName((String)object));
        object = null;
        object3 = object2.iterator();
        while (true) {
            if (!object3.hasNext()) {
                node.addChildToBack((Node)object);
                return node;
            }
            object2 = (XmlFragment)object3.next();
            if (object2 instanceof XmlString) {
                object2 = ((XmlString)object2).getXml();
                this.decompiler.addName((String)object2);
                if (object == null) {
                    object = IRFactory.createString((String)object2);
                    continue;
                }
                object2 = IRFactory.createString((String)object2);
            } else {
                object2 = (XmlExpression)object2;
                bl = ((XmlExpression)object2).isXmlAttribute();
                this.decompiler.addToken(88);
                object2 = ((XmlExpression)object2).getExpression() instanceof EmptyExpression ? IRFactory.createString("") : this.transform(((XmlExpression)object2).getExpression());
                this.decompiler.addToken(89);
                if (bl) {
                    object2 = IRFactory.createUnary(77, (Node)object2);
                    object2 = IRFactory.createBinary(21, IRFactory.createBinary(21, IRFactory.createString("\""), (Node)object2), IRFactory.createString("\""));
                } else {
                    object2 = IRFactory.createUnary(78, (Node)object2);
                }
            }
            object = IRFactory.createBinary(21, (Node)object, (Node)object2);
        }
    }

    private Node transformXmlMemberGet(XmlMemberGet object) {
        XmlRef xmlRef = ((XmlMemberGet)object).getMemberRef();
        Node node = this.transform(((InfixExpression)object).getLeft());
        int n2 = xmlRef.isAttributeAccess() ? 2 : 0;
        int n3 = ((Node)object).getType();
        int n4 = 147;
        if (n3 == 147) {
            n2 |= 4;
            object = this.decompiler;
        } else {
            object = this.decompiler;
            n4 = 112;
        }
        ((Decompiler)object).addToken(n4);
        return this.transformXmlRef(node, xmlRef, n2);
    }

    private Node transformXmlRef(Node node, XmlRef object, int n2) {
        Object object2;
        if ((n2 & 2) != 0) {
            this.decompiler.addToken(151);
        }
        if ((object2 = (object2 = ((XmlRef)object).getNamespace()) != null ? ((Name)object2).getIdentifier() : null) != null) {
            this.decompiler.addName((String)object2);
            this.decompiler.addToken(148);
        }
        if (object instanceof XmlPropRef) {
            object = ((XmlPropRef)object).getPropName().getIdentifier();
            this.decompiler.addName((String)object);
            return this.createPropertyGet(node, (String)object2, (String)object, n2);
        }
        this.decompiler.addToken(86);
        object = this.transform(((XmlElemRef)object).getExpression());
        this.decompiler.addToken(87);
        return this.createElementGet(node, (String)object2, (Node)object, n2);
    }

    private Node transformXmlRef(XmlRef xmlRef) {
        int n2 = xmlRef.isAttributeAccess() ? 2 : 0;
        return this.transformXmlRef(null, xmlRef, n2);
    }

    private Node transformYield(Yield yield) {
        this.decompiler.addToken(yield.getType());
        Node node = yield.getValue() == null ? null : this.transform(yield.getValue());
        if (node != null) {
            return new Node(yield.getType(), node, yield.getLineno());
        }
        return new Node(yield.getType(), yield.getLineno());
    }

    void decompile(AstNode astNode) {
        int n2 = astNode.getType();
        if (n2 != 33) {
            if (n2 != 36) {
                if (n2 != 43) {
                    if (n2 != 83) {
                        if (n2 != 132) {
                            if (n2 != 66) {
                                if (n2 != 67) {
                                    switch (n2) {
                                        default: {
                                            StringBuilder stringBuilder = a.c("unexpected token: ");
                                            stringBuilder.append(Token.typeToName(astNode.getType()));
                                            Kit.codeBug(stringBuilder.toString());
                                            break;
                                        }
                                        case 41: {
                                            this.decompiler.addString(((StringLiteral)astNode).getValue());
                                            break;
                                        }
                                        case 40: {
                                            this.decompiler.addNumber(((NumberLiteral)astNode).getNumber());
                                            break;
                                        }
                                        case 39: {
                                            this.decompiler.addName(((Name)astNode).getIdentifier());
                                            break;
                                        }
                                    }
                                } else {
                                    this.decompileObjectLiteral((ObjectLiteral)astNode);
                                }
                            } else {
                                this.decompileArrayLiteral((ArrayLiteral)astNode);
                            }
                        }
                    } else {
                        this.decompiler.addBigInt(astNode.getBigInt());
                    }
                } else {
                    this.decompiler.addToken(astNode.getType());
                }
            } else {
                this.decompileElementGet((ElementGet)astNode);
            }
        } else {
            this.decompilePropertyGet((PropertyGet)astNode);
        }
    }

    void decompileArrayLiteral(ArrayLiteral iterable) {
        this.decompiler.addToken(86);
        iterable = ((ArrayLiteral)iterable).getElements();
        int n2 = iterable.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.decompile((AstNode)iterable.get(i2));
            if (i2 >= n2 - 1) continue;
            this.decompiler.addToken(92);
        }
        this.decompiler.addToken(87);
    }

    void decompileElementGet(ElementGet elementGet) {
        this.decompile(elementGet.getTarget());
        this.decompiler.addToken(86);
        this.decompile(elementGet.getElement());
        this.decompiler.addToken(87);
    }

    /*
     * Unable to fully structure code
     */
    Node decompileFunctionHeader(FunctionNode var1_1) {
        block9: {
            if (var1_1.getFunctionName() == null) break block9;
            this.decompiler.addName(var1_1.getName());
            ** GOTO lbl-1000
        }
        if (var1_1.getMemberExprNode() != null) {
            var6_2 = this.transform(var1_1.getMemberExprNode());
        } else lbl-1000:
        // 2 sources

        {
            var6_2 = null;
        }
        var2_3 = var1_1.getFunctionType();
        var4_4 = 0;
        var2_3 = var2_3 == 4 ? 1 : 0;
        var3_5 = var2_3 != 0 && var1_1.getLp() == -1;
        if (!var3_5) {
            this.decompiler.addToken(90);
        }
        var7_6 = var1_1.getParams();
        var5_7 = var7_6.size() - 1;
        while (var4_4 <= var5_7) {
            if (var4_4 > 0) {
                this.decompiler.addToken(92);
            }
            if (var1_1.hasRestParameter() && var4_4 == var5_7) {
                this.decompiler.addToken(174);
            }
            this.decompile(var7_6.get(var4_4));
            ++var4_4;
        }
        if (!var3_5) {
            this.decompiler.addToken(91);
        }
        if (var2_3 != 0) {
            this.decompiler.addToken(168);
        }
        if (!var1_1.isExpressionClosure()) {
            this.decompiler.addEOL(88);
        }
        return var6_2;
    }

    void decompileObjectLiteral(ObjectLiteral iterable) {
        this.decompiler.addToken(88);
        iterable = ((ObjectLiteral)iterable).getElements();
        int n2 = iterable.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ObjectProperty objectProperty = (ObjectProperty)iterable.get(i2);
            boolean bl = Boolean.TRUE.equals(objectProperty.getProp(26));
            this.decompile(objectProperty.getLeft());
            if (!bl) {
                this.decompiler.addToken(107);
                this.decompile(objectProperty.getRight());
            }
            if (i2 >= n2 - 1) continue;
            this.decompiler.addToken(92);
        }
        this.decompiler.addToken(89);
    }

    void decompilePropertyGet(PropertyGet propertyGet) {
        this.decompile(propertyGet.getTarget());
        this.decompiler.addToken(112);
        this.decompile(propertyGet.getProperty());
    }

    boolean isDestructuring(Node node) {
        boolean bl = node instanceof DestructuringForm && ((DestructuringForm)((Object)node)).isDestructuring();
        return bl;
    }

    /*
     * Exception decompiling
     */
    public Node transform(AstNode var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[CASE]], but top level block is 31[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public ScriptNode transformTree(AstRoot scriptNode) {
        Parser parser = this.parser;
        parser.currentScriptOrFn = scriptNode;
        parser.inUseStrictDirective = scriptNode.isInStrictMode();
        int n2 = this.decompiler.getCurrentOffset();
        scriptNode = (ScriptNode)this.transform(scriptNode);
        scriptNode.setEncodedSourceBounds(n2, this.decompiler.getCurrentOffset());
        if (this.parser.compilerEnv.isGeneratingSource()) {
            scriptNode.setEncodedSource(this.decompiler.getEncodedSource());
        }
        this.decompiler = null;
        return scriptNode;
    }
}

