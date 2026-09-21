/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Parser$ConditionData;
import org.mozilla.javascript.Parser$ParserException;
import org.mozilla.javascript.Parser$PerFunctionVariables;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.Token$CommentType;
import org.mozilla.javascript.TokenStream;
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
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.DestructuringForm;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.ForInLoop;
import org.mozilla.javascript.ast.ForLoop;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.GeneratorExpression;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.IdeErrorReporter;
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

public class Parser {
    static final boolean $assertionsDisabled = false;
    public static final int ARGC_LIMIT = 65536;
    static final int CLEAR_TI_MASK = 65535;
    private static final int GET_ENTRY = 2;
    private static final int METHOD_ENTRY = 8;
    private static final int PROP_ENTRY = 1;
    private static final int SET_ENTRY = 4;
    static final int TI_AFTER_EOL = 65536;
    static final int TI_CHECK_LABEL = 131072;
    boolean calledByCompileFunction;
    CompilerEnvirons compilerEnv;
    private int currentFlaggedToken = 0;
    private Comment currentJsDocComment;
    private LabeledStatement currentLabel;
    Scope currentScope;
    ScriptNode currentScriptOrFn;
    private int currentToken;
    private boolean defaultUseStrictDirective;
    private int endFlags;
    private IdeErrorReporter errorCollector;
    private ErrorReporter errorReporter;
    private boolean inDestructuringAssignment;
    private boolean inForInit;
    protected boolean inUseStrictDirective;
    private Map<String, LabeledStatement> labelSet;
    private List<Jump> loopAndSwitchSet;
    private List<Loop> loopSet;
    protected int nestingOfFunction;
    private boolean parseFinished;
    private int prevNameTokenLineno;
    private int prevNameTokenStart;
    private String prevNameTokenString = "";
    private List<Comment> scannedComments;
    private char[] sourceChars;
    private String sourceURI;
    private int syntaxErrorCount;
    private TokenStream ts;

    public Parser() {
        this(new CompilerEnvirons());
    }

    public Parser(CompilerEnvirons compilerEnvirons) {
        this(compilerEnvirons, compilerEnvirons.getErrorReporter());
    }

    public Parser(CompilerEnvirons compilerEnvirons, ErrorReporter errorReporter) {
        this.compilerEnv = compilerEnvirons;
        this.errorReporter = errorReporter;
        if (errorReporter instanceof IdeErrorReporter) {
            this.errorCollector = (IdeErrorReporter)errorReporter;
        }
    }

    static /* synthetic */ Map access$200(Parser parser) {
        return parser.labelSet;
    }

    static /* synthetic */ Map access$202(Parser parser, Map map) {
        parser.labelSet = map;
        return map;
    }

    static /* synthetic */ List access$300(Parser parser) {
        return parser.loopSet;
    }

    static /* synthetic */ List access$302(Parser parser, List list) {
        parser.loopSet = list;
        return list;
    }

    static /* synthetic */ List access$400(Parser parser) {
        return parser.loopAndSwitchSet;
    }

    static /* synthetic */ List access$402(Parser parser, List list) {
        parser.loopAndSwitchSet = list;
        return list;
    }

    static /* synthetic */ int access$500(Parser parser) {
        return parser.endFlags;
    }

    static /* synthetic */ int access$502(Parser parser, int n2) {
        parser.endFlags = n2;
        return n2;
    }

    static /* synthetic */ boolean access$600(Parser parser) {
        return parser.inForInit;
    }

    static /* synthetic */ boolean access$602(Parser parser, boolean bl) {
        parser.inForInit = bl;
        return bl;
    }

    private void addError(String string, String object, int n2, int n3, int n4, String string2, int n5) {
        ++this.syntaxErrorCount;
        string = this.lookupMessage(string, (String)object);
        object = this.errorCollector;
        if (object != null) {
            object.error(string, this.sourceURI, n2, n3);
        } else {
            this.errorReporter.error(string, this.sourceURI, n4, string2, n5);
        }
    }

    private AstNode addExpr() {
        AstNode astNode = this.mulExpr();
        while (true) {
            int n2 = this.peekToken();
            int n3 = this.ts.tokenBeg;
            if (n2 != 21 && n2 != 22) {
                return astNode;
            }
            this.consumeToken();
            astNode = new InfixExpression(n2, astNode, this.mulExpr(), n3);
        }
    }

    private void addStrictWarning(String string, String string2, int n2, int n3, int n4, String string3, int n5) {
        if (this.compilerEnv.isStrictMode()) {
            this.addWarning(string, string2, n2, n3, n4, string3, n5);
        }
    }

    private void addWarning(String object, String string, int n2, int n3, int n4, String string2, int n5) {
        String string3 = this.lookupMessage((String)object, string);
        if (this.compilerEnv.reportWarningAsError()) {
            this.addError((String)object, string, n2, n3, n4, string2, n5);
        } else {
            object = this.errorCollector;
            if (object != null) {
                object.warning(string3, this.sourceURI, n2, n3);
            } else {
                this.errorReporter.warning(string3, this.sourceURI, n4, string2, n5);
            }
        }
    }

    private AstNode andExpr() {
        AstNode astNode;
        AstNode astNode2 = astNode = this.bitOrExpr();
        if (this.matchToken(109, true)) {
            int n2 = this.ts.tokenBeg;
            astNode2 = new InfixExpression(109, astNode, this.andExpr(), n2);
        }
        return astNode2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<AstNode> argumentList() {
        if (this.matchToken(91, true)) {
            return null;
        }
        ArrayList<AstNode> arrayList = new ArrayList<AstNode>();
        boolean bl = this.inForInit;
        this.inForInit = false;
        try {
            while (this.peekToken() != 91) {
                boolean bl2;
                if (this.peekToken() == 73) {
                    this.reportError("msg.yield.parenthesized");
                }
                AstNode astNode = this.assignExpr();
                int n2 = this.peekToken();
                if (n2 == 123) {
                    try {
                        arrayList.add(this.generatorExpression(astNode, 0, true));
                    }
                    catch (IOException iOException) {}
                } else {
                    arrayList.add(astNode);
                }
                if (bl2 = this.matchToken(92, true)) continue;
            }
            this.inForInit = bl;
            this.mustMatchToken(91, "msg.no.paren.arg", true);
            return arrayList;
        }
        catch (Throwable throwable) {
            this.inForInit = bl;
            throw throwable;
        }
    }

    private AstNode arrayComprehension(AstNode astNode, int n2) {
        ArrayList<ArrayComprehensionLoop> arrayList = new ArrayList<ArrayComprehensionLoop>();
        while (this.peekToken() == 123) {
            arrayList.add(this.arrayComprehensionLoop());
        }
        int n3 = -1;
        Parser$ConditionData parser$ConditionData = null;
        if (this.peekToken() == 116) {
            this.consumeToken();
            n3 = this.ts.tokenBeg - n2;
            parser$ConditionData = this.condition();
        }
        this.mustMatchToken(87, "msg.no.bracket.arg", true);
        ArrayComprehension arrayComprehension = new ArrayComprehension(n2, this.ts.tokenEnd - n2);
        arrayComprehension.setResult(astNode);
        arrayComprehension.setLoops(arrayList);
        if (parser$ConditionData != null) {
            arrayComprehension.setIfPosition(n3);
            arrayComprehension.setFilter(parser$ConditionData.condition);
            arrayComprehension.setFilterLp(parser$ConditionData.lp - n2);
            arrayComprehension.setFilterRp(parser$ConditionData.rp - n2);
        }
        return arrayComprehension;
    }

    /*
     * Unable to fully structure code
     */
    private ArrayComprehensionLoop arrayComprehensionLoop() {
        block20: {
            block19: {
                block18: {
                    block21: {
                        block17: {
                            block16: {
                                if (this.nextToken() != 123) {
                                    this.codeBug();
                                }
                                var5_1 = this.ts.tokenBeg;
                                var9_2 = new ArrayComprehensionLoop(var5_1);
                                this.pushScope(var9_2);
                                var7_3 = true;
                                var6_4 = this.matchToken(39, true);
                                if (!var6_4) break block16;
                                if (this.ts.getString().equals("each")) {
                                    var2_5 = this.ts.tokenBeg - var5_1;
                                    break block17;
                                }
                                this.reportError("msg.no.paren.for");
                            }
                            var2_5 = -1;
                        }
                        var3_6 = this.mustMatchToken(90, "msg.no.paren.for", true) != false ? this.ts.tokenBeg - var5_1 : -1;
                        var8_7 = null;
                        var1_9 = this.peekToken();
                        if (var1_9 == 39) ** GOTO lbl34
                        if (var1_9 == 86 || var1_9 == 88) ** GOTO lbl31
                        this.reportError("msg.bad.var");
                        break block21;
lbl31:
                        // 1 sources

                        var8_7 = this.destructuringPrimaryExpr();
                        this.markDestructuring(var8_7);
                        break block21;
lbl34:
                        // 1 sources

                        this.consumeToken();
                        var8_7 = this.createNameNode();
                    }
                    if (var8_7.getType() == 39) {
                        this.defineSymbol(157, this.ts.getString(), true);
                    }
                    if ((var1_9 = this.nextToken()) == 39) ** GOTO lbl44
                    if (var1_9 != 52) break block18;
                    var1_9 = this.ts.tokenBeg - var5_1;
                    break block19;
lbl44:
                    // 1 sources

                    if (!"of".equals(this.ts.getString())) break block18;
                    if (var2_5 == -1) ** GOTO lbl48
                    this.reportError("msg.invalid.for.each");
lbl48:
                    // 2 sources

                    var1_9 = this.ts.tokenBeg - var5_1;
                    var6_4 = true;
                }
                this.reportError("msg.in.after.for.name");
                var1_9 = -1;
            }
            var6_4 = false;
            var10_10 = this.expr(false);
            var4_11 = this.mustMatchToken(91, "msg.no.paren.for.ctrl", true) != false ? this.ts.tokenBeg - var5_1 : -1;
            var9_2.setLength(this.ts.tokenEnd - var5_1);
            var9_2.setIterator(var8_7);
            var9_2.setIteratedObject(var10_10);
            var9_2.setInPosition(var1_9);
            var9_2.setEachPosition(var2_5);
            if (var2_5 != -1) break block20;
            var7_3 = false;
        }
        try {
            var9_2.setIsForEach(var7_3);
            var9_2.setParens(var3_6, var4_11);
            var9_2.setIsForOf(var6_4);
            return var9_2;
        }
        finally {
            this.popScope();
        }
    }

    private AstNode arrayLiteral() {
        if (this.currentToken != 86) {
            this.codeBug();
        }
        Object object = this.ts;
        int n2 = ((TokenStream)object).tokenBeg;
        int n3 = ((TokenStream)object).tokenEnd;
        Object object2 = new ArrayList<AstNode>();
        object = new ArrayLiteral(n2);
        int n4 = 1;
        int n5 = 0;
        while (true) {
            block15: {
                block14: {
                    int n6;
                    block13: {
                        int n7 = -1;
                        while (true) {
                            if ((n6 = this.peekToken()) == 92) {
                                this.consumeToken();
                                n7 = this.ts.tokenEnd;
                                if (n4 == 0) {
                                    n4 = 1;
                                    continue;
                                }
                                ((ArrayList)object2).add(new EmptyExpression(this.ts.tokenBeg, 1));
                                ++n5;
                                continue;
                            }
                            if (n6 != 165) break;
                            this.consumeToken();
                        }
                        if (n6 != 87) break block13;
                        this.consumeToken();
                        n3 = this.ts.tokenEnd;
                        ((ArrayLiteral)object).setDestructuringLength(((ArrayList)object2).size() + n4);
                        ((ArrayLiteral)object).setSkipCount(n5);
                        n4 = n3;
                        if (n7 != -1) {
                            this.warnTrailingComma(n2, (List<?>)object2, n7);
                            n4 = n3;
                        }
                        break block14;
                    }
                    if (n6 == 123 && n4 == 0 && ((ArrayList)object2).size() == 1) {
                        return this.arrayComprehension((AstNode)((ArrayList)object2).get(0), n2);
                    }
                    if (n6 != 0) break block15;
                    this.reportError("msg.no.bracket.arg");
                    n4 = n3;
                }
                object2 = ((ArrayList)object2).iterator();
                while (object2.hasNext()) {
                    ((ArrayLiteral)object).addElement((AstNode)object2.next());
                }
                ((AstNode)object).setLength(n4 - n2);
                return object;
            }
            if (n4 == 0) {
                this.reportError("msg.no.bracket.arg");
            }
            ((ArrayList)object2).add(this.assignExpr());
            n4 = 0;
        }
    }

    private AstNode arrowFunction(AstNode node) {
        int n2 = this.ts.lineno;
        int n3 = node != null ? ((AstNode)node).getPosition() : -1;
        FunctionNode functionNode = new FunctionNode(n3);
        functionNode.setFunctionType(4);
        functionNode.setJsDocNode(this.getAndResetJsDoc());
        HashMap<String, Node> object3 = new HashMap<String, Node>();
        HashSet<String> hashSet = new HashSet<String>();
        Parser$PerFunctionVariables parser$PerFunctionVariables = new Parser$PerFunctionVariables(this, functionNode);
        Object object = node;
        try {
            block11: {
                block10: {
                    if (!(node instanceof ParenthesizedExpression)) break block10;
                    functionNode.setParens(0, ((AstNode)node).getLength());
                    if (node.getIntProp(29, 0) == 1) {
                        functionNode.putIntProp(29, 1);
                    }
                    if ((object = ((ParenthesizedExpression)node).getExpression()) instanceof EmptyExpression) break block11;
                }
                this.arrowFunctionParams(functionNode, (AstNode)object, object3, hashSet);
            }
            if (!object3.isEmpty()) {
                node = new Node(92);
                for (Map.Entry entry : object3.entrySet()) {
                    node.addChildToBack(this.createDestructuringAssignment(126, (Node)entry.getValue(), this.createName((String)entry.getKey())));
                }
                functionNode.putProp(23, node);
            }
            functionNode.setBody(this.parseFunctionBody(4, functionNode));
            functionNode.setEncodedSourceBounds(n3, this.ts.tokenEnd);
            functionNode.setLength(this.ts.tokenEnd - n3);
            if (functionNode.isGenerator()) {
                this.reportError("msg.arrowfunction.generator");
                return this.makeErrorNode();
            }
            functionNode.setSourceName(this.sourceURI);
            functionNode.setBaseLineno(n2);
            functionNode.setEndLineno(this.ts.lineno);
            return functionNode;
        }
        finally {
            parser$PerFunctionVariables.restore();
        }
    }

    private void arrowFunctionParams(FunctionNode object, AstNode astNode, Map<String, Node> map, Set<String> set) {
        if (!(astNode instanceof ArrayLiteral) && !(astNode instanceof ObjectLiteral)) {
            if (astNode instanceof InfixExpression && astNode.getType() == 92) {
                astNode = (InfixExpression)astNode;
                this.arrowFunctionParams((FunctionNode)object, ((InfixExpression)astNode).getLeft(), map, set);
                this.arrowFunctionParams((FunctionNode)object, ((InfixExpression)astNode).getRight(), map, set);
            } else if (astNode instanceof Name) {
                ((FunctionNode)object).addParam(astNode);
                object = ((Name)astNode).getIdentifier();
                this.defineSymbol(90, (String)object);
                if (this.inUseStrictDirective) {
                    if ("eval".equals(object) || "arguments".equals(object)) {
                        this.reportError("msg.bad.id.strict", (String)object);
                    }
                    if (set.contains(object)) {
                        this.addError("msg.dup.param.strict", (String)object);
                    }
                    set.add((String)object);
                }
            } else {
                this.reportError("msg.no.parm", astNode.getPosition(), astNode.getLength());
                ((FunctionNode)object).addParam(this.makeErrorNode());
            }
        } else {
            this.markDestructuring(astNode);
            ((FunctionNode)object).addParam(astNode);
            object = this.currentScriptOrFn.getNextTempName();
            this.defineSymbol(90, (String)object, false);
            map.put((String)object, astNode);
        }
    }

    private AstNode assignExpr() {
        AstNode astNode;
        int n2 = this.peekToken();
        int n3 = 1;
        if (n2 == 73) {
            return this.returnOrYield(n2, true);
        }
        AstNode astNode2 = this.condExpr();
        n2 = this.peekTokenOrEOL();
        if (n2 == 1) {
            n2 = this.peekToken();
        } else {
            n3 = 0;
        }
        if (93 <= n2 && n2 <= 105) {
            if (this.inDestructuringAssignment) {
                this.reportError("msg.destruct.default.vals");
            }
            this.consumeToken();
            Comment comment = this.getAndResetJsDoc();
            this.markDestructuring(astNode2);
            n3 = this.ts.tokenBeg;
            astNode = new Assignment(n2, astNode2, this.assignExpr(), n3);
            if (comment != null) {
                astNode.setJsDocNode(comment);
            }
        } else if (n2 == 85) {
            astNode = astNode2;
            if (this.currentJsDocComment != null) {
                astNode2.setJsDocNode(this.getAndResetJsDoc());
                astNode = astNode2;
            }
        } else {
            astNode = astNode2;
            if (n3 == 0) {
                astNode = astNode2;
                if (n2 == 168) {
                    this.consumeToken();
                    astNode = this.arrowFunction(astNode2);
                }
            }
        }
        return astNode;
    }

    private AstNode attributeAccess() {
        int n2 = this.nextToken();
        TokenStream tokenStream = this.ts;
        int n3 = tokenStream.tokenBeg;
        if (n2 != 23) {
            if (n2 != 39) {
                if (n2 != 86) {
                    this.reportError("msg.no.name.after.xmlAttr");
                    return this.makeErrorNode();
                }
                return this.xmlElemRef(n3, null, -1);
            }
            return this.propertyName(n3, 0);
        }
        this.saveNameTokenData(n3, "*", tokenStream.lineno);
        return this.propertyName(n3, 0);
    }

    private void autoInsertSemicolon(AstNode astNode) {
        block3: {
            int n2;
            int n3;
            block4: {
                block0: {
                    block1: {
                        block2: {
                            n3 = this.peekFlaggedToken();
                            n2 = astNode.getPosition();
                            int n4 = 0xFFFF & n3;
                            if (n4 == -1 || n4 == 0) break block0;
                            if (n4 == 85) break block1;
                            if (n4 == 89) break block0;
                            if ((n3 & 0x10000) != 0) break block2;
                            this.reportError("msg.no.semi.stmt");
                            break block3;
                        }
                        n3 = Parser.nodeEnd(astNode);
                        break block4;
                    }
                    this.consumeToken();
                    astNode.setLength(this.ts.tokenEnd - n2);
                    break block3;
                }
                n3 = Math.max(n2 + 1, Parser.nodeEnd(astNode));
            }
            this.warnMissingSemi(n2, n3);
        }
    }

    private AstNode bitAndExpr() {
        AstNode astNode = this.eqExpr();
        while (this.matchToken(11, true)) {
            int n2 = this.ts.tokenBeg;
            astNode = new InfixExpression(11, astNode, this.eqExpr(), n2);
        }
        return astNode;
    }

    private AstNode bitOrExpr() {
        AstNode astNode = this.bitXorExpr();
        while (this.matchToken(9, true)) {
            int n2 = this.ts.tokenBeg;
            astNode = new InfixExpression(9, astNode, this.bitXorExpr(), n2);
        }
        return astNode;
    }

    private AstNode bitXorExpr() {
        AstNode astNode = this.bitAndExpr();
        while (this.matchToken(10, true)) {
            int n2 = this.ts.tokenBeg;
            astNode = new InfixExpression(10, astNode, this.bitAndExpr(), n2);
        }
        return astNode;
    }

    private AstNode block() {
        if (this.currentToken != 88) {
            this.codeBug();
        }
        this.consumeToken();
        int n2 = this.ts.tokenBeg;
        Scope scope = new Scope(n2);
        scope.setLineno(this.ts.lineno);
        this.pushScope(scope);
        try {
            this.statements(scope);
            this.mustMatchToken(89, "msg.no.brace.block", true);
            scope.setLength(this.ts.tokenEnd - n2);
            return scope;
        }
        finally {
            this.popScope();
        }
    }

    private BreakStatement breakStatement() {
        Name name;
        if (this.currentToken != 124) {
            this.codeBug();
        }
        this.consumeToken();
        List<Jump> list = this.ts;
        int n2 = ((TokenStream)((Object)list)).lineno;
        int n3 = ((TokenStream)((Object)list)).tokenBeg;
        int n4 = ((TokenStream)((Object)list)).tokenEnd;
        int n5 = this.peekTokenOrEOL();
        list = null;
        if (n5 == 39) {
            name = this.createNameNode();
            n4 = Parser.getNodeEnd(name);
        } else {
            name = null;
        }
        Iterable<Jump> iterable = this.matchJumpLabelName();
        if (iterable != null) {
            list = ((LabeledStatement)iterable).getFirstLabel();
        }
        iterable = list;
        if (list == null) {
            iterable = list;
            if (name == null) {
                iterable = this.loopAndSwitchSet;
                if (iterable != null && iterable.size() != 0) {
                    list = this.loopAndSwitchSet;
                    iterable = list.get(list.size() - 1);
                } else {
                    this.reportError("msg.bad.break", n3, n4 - n3);
                    iterable = list;
                }
            }
        }
        list = new BreakStatement(n3, n4 - n3);
        ((BreakStatement)((Object)list)).setBreakLabel(name);
        if (iterable != null) {
            ((BreakStatement)((Object)list)).setBreakTarget((Jump)iterable);
        }
        ((Node)((Object)list)).setLineno(n2);
        return list;
    }

    private void checkBadIncDec(UpdateExpression object) {
        int n2 = this.removeParens(((UpdateExpression)object).getOperand()).getType();
        if (n2 != 39 && n2 != 33 && n2 != 36 && n2 != 68 && n2 != 38) {
            object = ((Node)object).getType() == 110 ? "msg.bad.incr" : "msg.bad.decr";
            this.reportError((String)object);
        }
    }

    private void checkCallRequiresActivation(AstNode astNode) {
        if (astNode.getType() == 39 && "eval".equals(((Name)astNode).getIdentifier()) || astNode.getType() == 33 && "eval".equals(((PropertyGet)astNode).getProperty().getIdentifier())) {
            this.setRequiresActivation();
        }
    }

    private RuntimeException codeBug() {
        StringBuilder stringBuilder = a.c("ts.cursor=");
        stringBuilder.append(this.ts.cursor);
        stringBuilder.append(", ts.tokenBeg=");
        stringBuilder.append(this.ts.tokenBeg);
        stringBuilder.append(", currentToken=");
        stringBuilder.append(this.currentToken);
        throw Kit.codeBug(stringBuilder.toString());
    }

    private AstNode condExpr() {
        AstNode astNode = this.orExpr();
        Object object = astNode;
        if (this.matchToken(106, true)) {
            object = this.ts;
            int n2 = ((TokenStream)object).lineno;
            int n3 = ((TokenStream)object).tokenBeg;
            int n4 = -1;
            boolean bl = this.inForInit;
            this.inForInit = false;
            try {
                AstNode astNode2 = this.assignExpr();
                if (this.mustMatchToken(107, "msg.no.colon.cond", true)) {
                    n4 = this.ts.tokenBeg;
                }
                AstNode astNode3 = this.assignExpr();
                int n5 = astNode.getPosition();
                object = new ConditionalExpression(n5, Parser.getNodeEnd(astNode3) - n5);
                ((Node)object).setLineno(n2);
                ((ConditionalExpression)object).setTestExpression(astNode);
                ((ConditionalExpression)object).setTrueExpression(astNode2);
                ((ConditionalExpression)object).setFalseExpression(astNode3);
                ((ConditionalExpression)object).setQuestionMarkPosition(n3 - n5);
                ((ConditionalExpression)object).setColonPosition(n4 - n5);
            }
            finally {
                this.inForInit = bl;
            }
        }
        return object;
    }

    private Parser$ConditionData condition() {
        AstNode astNode;
        Parser$ConditionData parser$ConditionData = new Parser$ConditionData(null);
        if (this.mustMatchToken(90, "msg.no.paren.cond", true)) {
            parser$ConditionData.lp = this.ts.tokenBeg;
        }
        parser$ConditionData.condition = this.expr(false);
        if (this.mustMatchToken(91, "msg.no.paren.after.cond", true)) {
            parser$ConditionData.rp = this.ts.tokenBeg;
        }
        if ((astNode = parser$ConditionData.condition) instanceof Assignment) {
            this.addStrictWarning("msg.equal.as.assign", "", astNode.getPosition(), parser$ConditionData.condition.getLength());
        }
        return parser$ConditionData;
    }

    private void consumeToken() {
        this.currentFlaggedToken = 0;
    }

    private ContinueStatement continueStatement() {
        Name name;
        if (this.currentToken != 125) {
            this.codeBug();
        }
        this.consumeToken();
        Iterable<Loop> iterable = this.ts;
        int n2 = ((TokenStream)((Object)iterable)).lineno;
        int n3 = ((TokenStream)((Object)iterable)).tokenBeg;
        int n4 = ((TokenStream)((Object)iterable)).tokenEnd;
        int n5 = this.peekTokenOrEOL();
        iterable = null;
        if (n5 == 39) {
            name = this.createNameNode();
            n4 = Parser.getNodeEnd(name);
        } else {
            name = null;
        }
        Iterable<Node> iterable2 = this.matchJumpLabelName();
        if (iterable2 == null && name == null) {
            iterable2 = this.loopSet;
            if (iterable2 != null && iterable2.size() != 0) {
                iterable = this.loopSet;
                iterable = iterable.get(iterable.size() - 1);
            } else {
                this.reportError("msg.continue.outside");
            }
        } else {
            if (iterable2 == null || !(((LabeledStatement)iterable2).getStatement() instanceof Loop)) {
                this.reportError("msg.continue.nonloop", n3, n4 - n3);
            }
            if (iterable2 != null) {
                iterable = (Loop)((LabeledStatement)iterable2).getStatement();
            }
        }
        iterable2 = new ContinueStatement(n3, n4 - n3);
        if (iterable != null) {
            ((ContinueStatement)iterable2).setTarget((Loop)iterable);
        }
        ((ContinueStatement)iterable2).setLabel(name);
        ((Node)iterable2).setLineno(n2);
        return iterable2;
    }

    private Name createNameNode() {
        return this.createNameNode(false, 39);
    }

    private Name createNameNode(boolean bl, int n2) {
        Object object = this.ts;
        int n3 = ((TokenStream)object).tokenBeg;
        object = ((TokenStream)object).getString();
        int n4 = this.ts.lineno;
        String string = this.prevNameTokenString;
        Object object2 = "";
        if (!"".equals(string)) {
            n3 = this.prevNameTokenStart;
            object = this.prevNameTokenString;
            n4 = this.prevNameTokenLineno;
            this.prevNameTokenStart = 0;
            this.prevNameTokenString = "";
            this.prevNameTokenLineno = 0;
        }
        if (object == null) {
            if (this.compilerEnv.isIdeMode()) {
                object = object2;
            } else {
                this.codeBug();
            }
        }
        object2 = new Name(n3, (String)object);
        ((Node)object2).setLineno(n4);
        if (bl) {
            this.checkActivationName((String)object, n2);
        }
        return object2;
    }

    private AstNode createNumericLiteral(int n2, boolean bl) {
        Object object;
        String string;
        block6: {
            String string2;
            block8: {
                block10: {
                    block9: {
                        block7: {
                            block5: {
                                string2 = this.ts.getString();
                                if (this.inUseStrictDirective && this.ts.isNumericOldOctal() && (this.compilerEnv.getLanguageVersion() >= 200 || !bl)) {
                                    string = n2 == 83 ? "msg.no.old.octal.bigint" : "msg.no.old.octal.strict";
                                    this.reportError(string);
                                }
                                if (this.compilerEnv.getLanguageVersion() >= 200) break block5;
                                string = string2;
                                if (bl) break block6;
                            }
                            if (!this.ts.isNumericBinary()) break block7;
                            object = new StringBuilder();
                            string = "0b";
                            break block8;
                        }
                        if (!this.ts.isNumericOldOctal()) break block9;
                        object = new StringBuilder();
                        string = "0";
                        break block8;
                    }
                    if (!this.ts.isNumericOctal()) break block10;
                    object = new StringBuilder();
                    string = "0o";
                    break block8;
                }
                string = string2;
                if (!this.ts.isNumericHex()) break block6;
                object = new StringBuilder();
                string = "0x";
            }
            string = r.c((StringBuilder)object, string, string2);
        }
        if (n2 == 83) {
            return new BigIntLiteral(this.ts.tokenBeg, e.c(string, "n"), this.ts.getBigInt());
        }
        object = this.ts;
        return new NumberLiteral(((TokenStream)object).tokenBeg, string, ((TokenStream)object).getNumber());
    }

    private StringLiteral createStringLiteral() {
        Object object = this.ts;
        int n2 = ((TokenStream)object).tokenBeg;
        object = new StringLiteral(n2, ((TokenStream)object).tokenEnd - n2);
        ((Node)object).setLineno(this.ts.lineno);
        ((StringLiteral)object).setValue(this.ts.getString());
        ((StringLiteral)object).setQuoteCharacter(this.ts.getQuoteChar());
        return object;
    }

    private TemplateCharacters createTemplateLiteralCharacters(int n2) {
        TemplateCharacters templateCharacters = new TemplateCharacters(n2, this.ts.tokenEnd - n2 - 1);
        templateCharacters.setValue(this.ts.getString());
        templateCharacters.setRawValue(this.ts.getRawString());
        return templateCharacters;
    }

    private AstNode defaultXmlNamespace() {
        if (this.currentToken != 120) {
            this.codeBug();
        }
        this.consumeToken();
        this.mustHaveXML();
        this.setRequiresActivation();
        Object object = this.ts;
        int n2 = ((TokenStream)object).lineno;
        int n3 = ((TokenStream)object).tokenBeg;
        if (!this.matchToken(39, true) || !"xml".equals(this.ts.getString())) {
            this.reportError("msg.bad.namespace");
        }
        if (!this.matchToken(39, true) || !"namespace".equals(this.ts.getString())) {
            this.reportError("msg.bad.namespace");
        }
        if (!this.matchToken(93, true)) {
            this.reportError("msg.bad.namespace");
        }
        object = this.expr(false);
        UnaryExpression unaryExpression = new UnaryExpression(n3, Parser.getNodeEnd((AstNode)object) - n3);
        unaryExpression.setOperator(76);
        unaryExpression.setOperand((AstNode)object);
        unaryExpression.setLineno(n2);
        return new ExpressionStatement(unaryExpression, true);
    }

    private AstNode destructuringPrimaryExpr() {
        try {
            this.inDestructuringAssignment = true;
            AstNode astNode = this.primaryExpr();
            return astNode;
        }
        finally {
            this.inDestructuringAssignment = false;
        }
    }

    private DoLoop doLoop() {
        if (this.currentToken != 122) {
            this.codeBug();
        }
        this.consumeToken();
        int n2 = this.ts.tokenBeg;
        DoLoop doLoop = new DoLoop(n2);
        doLoop.setLineno(this.ts.lineno);
        this.enterLoop(doLoop);
        try {
            AstNode astNode = this.getNextStatementAfterInlineComments(doLoop);
            this.mustMatchToken(121, "msg.no.while.do", true);
            doLoop.setWhilePosition(this.ts.tokenBeg - n2);
            Parser$ConditionData parser$ConditionData = this.condition();
            doLoop.setCondition(parser$ConditionData.condition);
            doLoop.setParens(parser$ConditionData.lp - n2, parser$ConditionData.rp - n2);
            int n3 = Parser.getNodeEnd(astNode);
            this.restoreRelativeLoopPosition(doLoop);
            doLoop.setBody(astNode);
            if (this.matchToken(85, true)) {
                n3 = this.ts.tokenEnd;
            }
            doLoop.setLength(n3 - n2);
            return doLoop;
        }
        finally {
            this.exitLoop();
        }
    }

    private void enterLoop(Loop loop) {
        if (this.loopSet == null) {
            this.loopSet = new ArrayList<Loop>();
        }
        this.loopSet.add(loop);
        if (this.loopAndSwitchSet == null) {
            this.loopAndSwitchSet = new ArrayList<Jump>();
        }
        this.loopAndSwitchSet.add(loop);
        this.pushScope(loop);
        LabeledStatement labeledStatement = this.currentLabel;
        if (labeledStatement != null) {
            labeledStatement.setStatement(loop);
            this.currentLabel.getFirstLabel().setLoop(loop);
            loop.setRelative(-this.currentLabel.getPosition());
        }
    }

    private void enterSwitch(SwitchStatement switchStatement) {
        if (this.loopAndSwitchSet == null) {
            this.loopAndSwitchSet = new ArrayList<Jump>();
        }
        this.loopAndSwitchSet.add(switchStatement);
    }

    private AstNode eqExpr() {
        AstNode astNode = this.relExpr();
        while (true) {
            int n2 = this.peekToken();
            int n3 = this.ts.tokenBeg;
            if (n2 != 12 && n2 != 13 && n2 != 46 && n2 != 47) {
                return astNode;
            }
            this.consumeToken();
            int n4 = n2;
            if (this.compilerEnv.getLanguageVersion() == 120) {
                if (n2 == 12) {
                    n4 = 46;
                } else {
                    n4 = n2;
                    if (n2 == 13) {
                        n4 = 47;
                    }
                }
            }
            astNode = new InfixExpression(n4, astNode, this.relExpr(), n3);
        }
    }

    private void exitLoop() {
        List<Jump> list = this.loopSet;
        list.remove(list.size() - 1);
        list = this.loopAndSwitchSet;
        list.remove(list.size() - 1);
        this.popScope();
    }

    private void exitSwitch() {
        List<Jump> list = this.loopAndSwitchSet;
        list.remove(list.size() - 1);
    }

    private AstNode expExpr() {
        AstNode astNode = this.unaryExpr();
        while (true) {
            int n2 = this.peekToken();
            int n3 = this.ts.tokenBeg;
            if (n2 != 75) {
                return astNode;
            }
            if (astNode instanceof UnaryExpression) {
                this.reportError("msg.no.unary.expr.on.left.exp", AstNode.operatorToString(astNode.getType()));
                return this.makeErrorNode();
            }
            this.consumeToken();
            astNode = new InfixExpression(n2, astNode, this.expExpr(), n3);
        }
    }

    private AstNode expr(boolean bl) {
        AstNode astNode = this.assignExpr();
        int n2 = astNode.getPosition();
        while (this.matchToken(92, true)) {
            int n3 = this.ts.tokenBeg;
            if (this.compilerEnv.isStrictMode() && !astNode.hasSideEffects()) {
                this.addStrictWarning("msg.no.side.effects", "", n2, Parser.nodeEnd(astNode) - n2);
            }
            if (this.peekToken() == 73) {
                this.reportError("msg.yield.parenthesized");
            }
            if (bl && this.peekToken() == 91) {
                astNode.putIntProp(29, 1);
                return astNode;
            }
            astNode = new InfixExpression(92, astNode, this.assignExpr(), n3);
        }
        return astNode;
    }

    /*
     * Unable to fully structure code
     */
    private Loop forLoop() {
        block31: {
            block29: {
                block30: {
                    block28: {
                        block26: {
                            block27: {
                                if (this.currentToken != 123) {
                                    this.codeBug();
                                }
                                this.consumeToken();
                                var10_1 = this.ts;
                                var7_4 = var10_1.tokenBeg;
                                var6_5 = var10_1.lineno;
                                var12_6 = null;
                                var11_7 = null;
                                var13_8 = new Scope();
                                this.pushScope(var13_8);
                                var8_9 = this.matchToken(39, true);
                                var5_10 = 0;
                                var1_11 = 0;
                                if (!var8_9) break block26;
                                if (!"each".equals(this.ts.getString())) break block27;
                                var3_12 = this.ts.tokenBeg - var7_4;
                                var8_9 = true;
                            }
                            this.reportError("msg.no.paren.for");
                        }
                        var3_12 = -1;
                        var8_9 = false;
                        var4_13 = this.mustMatchToken(90, "msg.no.paren.for", true) != false ? this.ts.tokenBeg - var7_4 : -1;
                        var14_14 = this.forLoopInit(this.peekToken());
                        if (!this.matchToken(52, true)) break block28;
                        var2_15 = this.ts.tokenBeg - var7_4;
                        this.markDestructuring(var14_14);
                        var10_1 = this.expr(false);
                        var1_11 = 1;
lbl37:
                        // 2 sources

                        while (true) {
                            var9_16 = false;
                            break block29;
                            break;
                        }
                    }
                    if (this.compilerEnv.getLanguageVersion() < 200 || !this.matchToken(39, true) || !"of".equals(this.ts.getString())) break block30;
                    var2_15 = this.ts.tokenBeg - var7_4;
                    this.markDestructuring(var14_14);
                    var10_1 = this.expr(false);
                    var9_16 = true;
                    var11_7 = var12_6;
                    var1_11 = var5_10;
                    {
                        catch (Throwable var10_3) {
                            throw var10_3;
                        }
                    }
                }
                this.mustMatchToken(85, "msg.no.semi.for", true);
                if (this.peekToken() == 85) {
                    var10_1 = new EmptyExpression(this.ts.tokenBeg, 1);
                    var10_1.setLineno(this.ts.lineno);
                } else {
                    var10_1 = this.expr(false);
                }
                this.mustMatchToken(85, "msg.no.semi.for.cond", true);
                var2_15 = this.ts.tokenEnd;
                if (this.peekToken() == 91) {
                    var11_7 = new EmptyExpression(var2_15, 1);
                    var11_7.setLineno(this.ts.lineno);
                } else {
                    var11_7 = this.expr(false);
                }
                var2_15 = -1;
                ** continue;
            }
            var5_10 = this.mustMatchToken(91, "msg.no.paren.for.ctrl", true) != false ? this.ts.tokenBeg - var7_4 : -1;
            if (var1_11 != 0 || var9_16) break block31;
            var12_6 = new ForLoop(var7_4);
            var12_6.setInitializer(var14_14);
            var12_6.setCondition((AstNode)var10_1);
            var12_6.setIncrement(var11_7);
            var10_1 = var12_6;
        }
        var11_7 = new ForInLoop(var7_4);
        if (var14_14 instanceof VariableDeclaration && ((VariableDeclaration)var14_14).getVariables().size() > 1) {
            this.reportError("msg.mult.index");
        }
        if (!var9_16 || !var8_9) ** GOTO lbl90
        this.reportError("msg.invalid.for.each");
lbl90:
        // 2 sources

        var11_7.setIterator(var14_14);
        var11_7.setIteratedObject((AstNode)var10_1);
        var11_7.setInPosition(var2_15);
        var11_7.setIsForEach(var8_9);
        var11_7.setEachPosition(var3_12);
        var11_7.setIsForOf(var9_16);
        var10_1 = var11_7;
        this.currentScope.replaceWith((Scope)var10_1);
        this.popScope();
        this.enterLoop((Loop)var10_1);
        try {
            var11_7 = this.getNextStatementAfterInlineComments((AstNode)var10_1);
            var10_1.setLength(Parser.getNodeEnd(var11_7) - var7_4);
            this.restoreRelativeLoopPosition((Loop)var10_1);
            var10_1.setBody(var11_7);
        }
        catch (Throwable var10_2) {
            this.exitLoop();
            throw var10_2;
        }
        try {
            this.exitLoop();
            var10_1.setParens(var4_13, var5_10);
            var10_1.setLineno(var6_5);
            return var10_1;
        }
        finally {
            if (this.currentScope == var13_8) {
                this.popScope();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AstNode forLoopInit(int n2) {
        try {
            AstNode astNode;
            this.inForInit = true;
            if (n2 == 85) {
                astNode = new EmptyExpression(this.ts.tokenBeg, 1);
                astNode.setLineno(this.ts.lineno);
                return astNode;
            }
            if (n2 != 126 && n2 != 157) {
                astNode = this.expr(false);
                return astNode;
            }
            this.consumeToken();
            astNode = this.variables(n2, this.ts.tokenBeg, false);
            return astNode;
        }
        finally {
            this.inForInit = false;
        }
    }

    private FunctionNode function(int n2) {
        return this.function(n2, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private FunctionNode function(int n2, boolean bl) {
        FunctionNode functionNode;
        Object object;
        int n3;
        block16: {
            Object object2;
            Object object3 = this.ts;
            n3 = ((TokenStream)object3).lineno;
            int n4 = ((TokenStream)object3).tokenBeg;
            boolean bl2 = this.matchToken(39, true);
            Object object4 = null;
            object = null;
            if (bl2) {
                object2 = this.createNameNode(true, 39);
                if (this.inUseStrictDirective && ("eval".equals(object3 = ((Name)object2).getIdentifier()) || "arguments".equals(object3))) {
                    this.reportError("msg.bad.id.strict", (String)object3);
                }
                object3 = object2;
                if (!this.matchToken(90, true)) {
                    object3 = object2;
                    object4 = object;
                    if (this.compilerEnv.isAllowMemberExprAsFunctionName()) {
                        object4 = this.memberExprTail(false, (AstNode)object2);
                        object3 = null;
                    }
                    this.mustMatchToken(90, "msg.no.paren.parms", true);
                }
            } else if (this.matchToken(90, true)) {
                object3 = null;
            } else {
                if (this.matchToken(23, true) && this.compilerEnv.getLanguageVersion() >= 200) {
                    return this.function(n2, true);
                }
                object3 = this.compilerEnv.isAllowMemberExprAsFunctionName() ? this.memberExpr(false) : null;
                this.mustMatchToken(90, "msg.no.paren.parms", true);
                object2 = null;
                object4 = object3;
                object3 = object2;
            }
            int n5 = this.currentToken == 90 ? this.ts.tokenBeg : -1;
            int n6 = object4 != null ? 2 : n2;
            if (n6 != 2 && object3 != null && ((Name)object3).length() > 0) {
                this.defineSymbol(113, ((Name)object3).getIdentifier());
            }
            functionNode = new FunctionNode(n4, (Name)object3);
            functionNode.setFunctionType(n2);
            if (bl) {
                functionNode.setIsES6Generator();
            }
            if (n5 != -1) {
                functionNode.setLp(n5 - n4);
            }
            functionNode.setJsDocNode(this.getAndResetJsDoc());
            object = new Parser$PerFunctionVariables(this, functionNode);
            this.parseFunctionParams(functionNode);
            functionNode.setBody(this.parseFunctionBody(n2, functionNode));
            functionNode.setEncodedSourceBounds(n4, this.ts.tokenEnd);
            functionNode.setLength(this.ts.tokenEnd - n4);
            if (this.compilerEnv.isStrictMode() && !functionNode.getBody().hasConsistentReturnUsage()) {
                object2 = object3 != null && ((Name)object3).length() > 0 ? "msg.no.return.value" : "msg.anon.no.return.value";
                object3 = object3 == null ? "" : ((Name)object3).getIdentifier();
                this.addStrictWarning((String)object2, (String)object3);
            }
            if (object4 == null) break block16;
            Kit.codeBug();
            functionNode.setMemberExprNode((AstNode)object4);
        }
        functionNode.setSourceName(this.sourceURI);
        functionNode.setBaseLineno(n3);
        functionNode.setEndLineno(this.ts.lineno);
        if (this.compilerEnv.isIdeMode()) {
            functionNode.setParentScope(this.currentScope);
        }
        return functionNode;
        finally {
            ((Parser$PerFunctionVariables)object).restore();
        }
    }

    private AstNode generatorExpression(AstNode astNode, int n2) {
        return this.generatorExpression(astNode, n2, false);
    }

    private AstNode generatorExpression(AstNode astNode, int n2, boolean bl) {
        ArrayList<GeneratorExpressionLoop> arrayList = new ArrayList<GeneratorExpressionLoop>();
        while (this.peekToken() == 123) {
            arrayList.add(this.generatorExpressionLoop());
        }
        int n3 = -1;
        Parser$ConditionData parser$ConditionData = null;
        if (this.peekToken() == 116) {
            this.consumeToken();
            n3 = this.ts.tokenBeg - n2;
            parser$ConditionData = this.condition();
        }
        if (!bl) {
            this.mustMatchToken(91, "msg.no.paren.let", true);
        }
        GeneratorExpression generatorExpression = new GeneratorExpression(n2, this.ts.tokenEnd - n2);
        generatorExpression.setResult(astNode);
        generatorExpression.setLoops(arrayList);
        if (parser$ConditionData != null) {
            generatorExpression.setIfPosition(n3);
            generatorExpression.setFilter(parser$ConditionData.condition);
            generatorExpression.setFilterLp(parser$ConditionData.lp - n2);
            generatorExpression.setFilterRp(parser$ConditionData.rp - n2);
        }
        return generatorExpression;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private GeneratorExpressionLoop generatorExpressionLoop() {
        if (this.nextToken() != 123) {
            this.codeBug();
        }
        int n2 = this.ts.tokenBeg;
        GeneratorExpressionLoop generatorExpressionLoop = new GeneratorExpressionLoop(n2);
        this.pushScope(generatorExpressionLoop);
        try {
            boolean bl = this.mustMatchToken(90, "msg.no.paren.for", true);
            int n3 = -1;
            int n4 = bl ? this.ts.tokenBeg - n2 : -1;
            AstNode astNode = null;
            int n5 = this.peekToken();
            if (n5 != 39) {
                if (n5 != 86 && n5 != 88) {
                    this.reportError("msg.bad.var");
                } else {
                    astNode = this.destructuringPrimaryExpr();
                    this.markDestructuring(astNode);
                }
            } else {
                this.consumeToken();
                astNode = this.createNameNode();
            }
            if (astNode.getType() == 39) {
                this.defineSymbol(157, this.ts.getString(), true);
            }
            n5 = this.mustMatchToken(52, "msg.in.after.for.name", true) ? this.ts.tokenBeg - n2 : -1;
            AstNode astNode2 = this.expr(false);
            if (this.mustMatchToken(91, "msg.no.paren.for.ctrl", true)) {
                n3 = this.ts.tokenBeg - n2;
            }
            generatorExpressionLoop.setLength(this.ts.tokenEnd - n2);
            generatorExpressionLoop.setIterator(astNode);
            generatorExpressionLoop.setIteratedObject(astNode2);
            generatorExpressionLoop.setInPosition(n5);
            generatorExpressionLoop.setParens(n4, n3);
            return generatorExpressionLoop;
        }
        finally {
            this.popScope();
        }
    }

    private Comment getAndResetJsDoc() {
        Comment comment = this.currentJsDocComment;
        this.currentJsDocComment = null;
        return comment;
    }

    private static String getDirective(AstNode astNode) {
        if (astNode instanceof ExpressionStatement && (astNode = ((ExpressionStatement)astNode).getExpression()) instanceof StringLiteral) {
            return ((StringLiteral)astNode).getValue();
        }
        return null;
    }

    private AstNode getNextStatementAfterInlineComments(AstNode astNode) {
        AstNode astNode2;
        AstNode astNode3 = astNode2 = this.statement();
        if (165 == astNode2.getType()) {
            astNode3 = this.statement();
            if (astNode != null) {
                astNode.setInlineComment(astNode2);
            } else {
                astNode3.setInlineComment(astNode2);
            }
        }
        return astNode3;
    }

    private static int getNodeEnd(AstNode astNode) {
        int n2 = astNode.getPosition();
        return astNode.getLength() + n2;
    }

    private IfStatement ifStatement() {
        if (this.currentToken != 116) {
            this.codeBug();
        }
        this.consumeToken();
        Object object = this.ts;
        int n2 = ((TokenStream)object).tokenBeg;
        int n3 = ((TokenStream)object).lineno;
        int n4 = -1;
        IfStatement ifStatement = new IfStatement(n2);
        Parser$ConditionData parser$ConditionData = this.condition();
        AstNode astNode = this.getNextStatementAfterInlineComments(ifStatement);
        object = null;
        if (this.matchToken(117, true)) {
            if (this.peekToken() == 165) {
                object = this.scannedComments;
                ifStatement.setElseKeyWordInlineComment((AstNode)object.get(object.size() - 1));
                this.consumeToken();
            }
            n4 = this.ts.tokenBeg - n2;
            object = this.statement();
        }
        Object object2 = object != null ? object : astNode;
        ifStatement.setLength(Parser.getNodeEnd((AstNode)object2) - n2);
        ifStatement.setCondition(parser$ConditionData.condition);
        ifStatement.setParens(parser$ConditionData.lp - n2, parser$ConditionData.rp - n2);
        ifStatement.setThenPart(astNode);
        ifStatement.setElsePart((AstNode)object);
        ifStatement.setElsePosition(n4);
        ifStatement.setLineno(n3);
        return ifStatement;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AstNode let(boolean bl, int n2) {
        LetNode letNode = new LetNode(n2);
        letNode.setLineno(this.ts.lineno);
        boolean bl2 = true;
        if (this.mustMatchToken(90, "msg.no.paren.after.let", true)) {
            letNode.setLp(this.ts.tokenBeg - n2);
        }
        this.pushScope(letNode);
        try {
            letNode.setVariables(this.variables(157, this.ts.tokenBeg, bl));
            if (this.mustMatchToken(91, "msg.no.paren.let", true)) {
                letNode.setRp(this.ts.tokenBeg - n2);
            }
            if (bl && this.peekToken() == 88) {
                this.consumeToken();
                int n3 = this.ts.tokenBeg;
                AstNode astNode = this.statements();
                this.mustMatchToken(89, "msg.no.curly.let", true);
                astNode.setLength(this.ts.tokenEnd - n3);
                letNode.setLength(this.ts.tokenEnd - n2);
                letNode.setBody(astNode);
                letNode.setType(157);
                return letNode;
            }
            AstNode astNode = this.expr(false);
            letNode.setLength(Parser.getNodeEnd(astNode) - n2);
            letNode.setBody(astNode);
            if (!bl) return letNode;
            bl = !this.insideFunction() ? bl2 : false;
            astNode = new ExpressionStatement(letNode, bl);
            astNode.setLineno(letNode.getLineno());
            return astNode;
        }
        finally {
            this.popScope();
        }
    }

    private AstNode letStatement() {
        if (this.currentToken != 157) {
            this.codeBug();
        }
        this.consumeToken();
        Object object = this.ts;
        int n2 = ((TokenStream)object).lineno;
        int n3 = ((TokenStream)object).tokenBeg;
        object = this.peekToken() == 90 ? this.let(true, n3) : this.variables(157, n3, true);
        ((Node)object).setLineno(n2);
        return object;
    }

    private int lineBeginningFor(int n2) {
        char[] cArray = this.sourceChars;
        if (cArray == null) {
            return -1;
        }
        if (n2 <= 0) {
            return 0;
        }
        int n3 = n2;
        if (n2 >= cArray.length) {
            n3 = cArray.length - 1;
        }
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (!ScriptRuntime.isJSLineTerminator(cArray[n2])) continue;
            return n2 + 1;
        }
        return 0;
    }

    private ErrorNode makeErrorNode() {
        Object object = this.ts;
        int n2 = ((TokenStream)object).tokenBeg;
        object = new ErrorNode(n2, ((TokenStream)object).tokenEnd - n2);
        ((Node)object).setLineno(this.ts.lineno);
        return object;
    }

    private LabeledStatement matchJumpLabelName() {
        int n2 = this.peekTokenOrEOL();
        Object object = null;
        LabeledStatement labeledStatement = null;
        if (n2 == 39) {
            this.consumeToken();
            object = this.labelSet;
            if (object != null) {
                labeledStatement = object.get(this.ts.getString());
            }
            object = labeledStatement;
            if (labeledStatement == null) {
                this.reportError("msg.undef.label");
                object = labeledStatement;
            }
        }
        return object;
    }

    private boolean matchToken(int n2, boolean bl) {
        int n3;
        while ((n3 = this.peekToken()) == 165 && bl) {
            this.consumeToken();
        }
        if (n3 != n2) {
            return false;
        }
        this.consumeToken();
        return true;
    }

    private AstNode memberExpr(boolean bl) {
        AstNode astNode;
        int n2 = this.peekToken();
        int n3 = this.ts.lineno;
        if (n2 != 30) {
            astNode = this.primaryExpr();
        } else {
            this.consumeToken();
            int n4 = this.ts.tokenBeg;
            astNode = new NewExpression(n4);
            Object object = this.memberExpr(false);
            n2 = Parser.getNodeEnd((AstNode)object);
            ((FunctionCall)astNode).setTarget((AstNode)object);
            if (this.matchToken(90, true)) {
                int n5 = this.ts.tokenBeg;
                List<AstNode> list = this.argumentList();
                if (list != null && list.size() > 65536) {
                    this.reportError("msg.too.many.constructor.args");
                }
                object = this.ts;
                int n6 = ((TokenStream)object).tokenBeg;
                n2 = ((TokenStream)object).tokenEnd;
                if (list != null) {
                    ((FunctionCall)astNode).setArguments(list);
                }
                ((FunctionCall)astNode).setParens(n5 - n4, n6 - n4);
            }
            if (this.matchToken(88, true)) {
                object = this.objectLiteral();
                n2 = Parser.getNodeEnd((AstNode)object);
                ((NewExpression)astNode).setInitializer((ObjectLiteral)object);
            }
            astNode.setLength(n2 - n4);
        }
        astNode.setLineno(n3);
        return this.memberExprTail(bl, astNode);
    }

    private AstNode memberExprTail(boolean bl, AstNode object) {
        if (object == null) {
            this.codeBug();
        }
        int n2 = ((AstNode)object).getPosition();
        while (true) {
            int n3;
            block17: {
                AstNode astNode;
                int n4;
                int n5;
                Object object2;
                int n6;
                block11: {
                    block18: {
                        block16: {
                            block12: {
                                block13: {
                                    block14: {
                                        block15: {
                                            n6 = this.peekToken();
                                            n3 = -1;
                                            if (n6 == 86) break block11;
                                            if (n6 == 90) break block12;
                                            if (n6 == 112 || n6 == 147) break block13;
                                            if (n6 == 150) break block14;
                                            if (n6 == 165) break block15;
                                            if (n6 == 170) {
                                                this.consumeToken();
                                                object = this.taggedTemplateLiteral((AstNode)object);
                                                continue;
                                            }
                                            break block16;
                                        }
                                        n3 = this.currentFlaggedToken;
                                        this.peekUntilNonComment(n6);
                                        n6 = this.currentFlaggedToken;
                                        if ((n6 & 0x10000) != 0) {
                                            n3 = n6;
                                        }
                                        this.currentFlaggedToken = n3;
                                        continue;
                                    }
                                    this.consumeToken();
                                    object2 = this.ts;
                                    n5 = ((TokenStream)object2).tokenBeg;
                                    n4 = ((TokenStream)object2).lineno;
                                    this.mustHaveXML();
                                    this.setRequiresActivation();
                                    astNode = this.expr(false);
                                    n6 = Parser.getNodeEnd(astNode);
                                    if (this.mustMatchToken(91, "msg.no.paren", true)) {
                                        object2 = this.ts;
                                        n3 = ((TokenStream)object2).tokenBeg;
                                        n6 = ((TokenStream)object2).tokenEnd;
                                    }
                                    object2 = new XmlDotQuery(n2, n6 - n2);
                                    ((InfixExpression)object2).setLeft((AstNode)object);
                                    ((InfixExpression)object2).setRight(astNode);
                                    ((InfixExpression)object2).setOperatorPosition(n5);
                                    ((XmlDotQuery)object2).setRp(n3 - n2);
                                    n3 = n4;
                                    object = object2;
                                    break block17;
                                }
                                n3 = this.ts.lineno;
                                object = this.propertyAccess(n6, (AstNode)object);
                                ((Node)object).setLineno(n3);
                                continue;
                            }
                            if (bl) break block18;
                        }
                        return object;
                    }
                    n3 = this.ts.lineno;
                    this.consumeToken();
                    this.checkCallRequiresActivation((AstNode)object);
                    object2 = new FunctionCall(n2);
                    ((FunctionCall)object2).setTarget((AstNode)object);
                    ((Node)object2).setLineno(n3);
                    ((FunctionCall)object2).setLp(this.ts.tokenBeg - n2);
                    object = this.argumentList();
                    if (object != null && object.size() > 65536) {
                        this.reportError("msg.too.many.function.args");
                    }
                    ((FunctionCall)object2).setArguments((List<AstNode>)object);
                    ((FunctionCall)object2).setRp(this.ts.tokenBeg - n2);
                    ((AstNode)object2).setLength(this.ts.tokenEnd - n2);
                    object = object2;
                    continue;
                }
                this.consumeToken();
                object2 = this.ts;
                int n7 = ((TokenStream)object2).tokenBeg;
                n4 = ((TokenStream)object2).lineno;
                astNode = this.expr(false);
                n5 = Parser.getNodeEnd(astNode);
                n6 = n3;
                n3 = n5;
                if (this.mustMatchToken(87, "msg.no.bracket.index", true)) {
                    object2 = this.ts;
                    n6 = ((TokenStream)object2).tokenBeg;
                    n3 = ((TokenStream)object2).tokenEnd;
                }
                object2 = new ElementGet(n2, n3 - n2);
                ((ElementGet)object2).setTarget((AstNode)object);
                ((ElementGet)object2).setElement(astNode);
                ((ElementGet)object2).setParens(n7, n6);
                object = object2;
                n3 = n4;
            }
            ((Node)object).setLineno(n3);
        }
    }

    private ObjectProperty methodDefinition(int n2, AstNode astNode, int n3) {
        FunctionNode functionNode = this.function(2);
        AstNode astNode2 = functionNode.getFunctionName();
        if (astNode2 != null && ((Name)astNode2).length() != 0) {
            this.reportError("msg.bad.prop");
        }
        astNode2 = new ObjectProperty(n2);
        if (n3 != 2) {
            if (n3 != 4) {
                if (n3 == 8) {
                    ((ObjectProperty)astNode2).setIsNormalMethod();
                    functionNode.setFunctionIsNormalMethod();
                }
            } else {
                ((ObjectProperty)astNode2).setIsSetterMethod();
                functionNode.setFunctionIsSetterMethod();
            }
        } else {
            ((ObjectProperty)astNode2).setIsGetterMethod();
            functionNode.setFunctionIsGetterMethod();
        }
        n3 = Parser.getNodeEnd(functionNode);
        ((InfixExpression)astNode2).setLeft(astNode);
        ((InfixExpression)astNode2).setRight(functionNode);
        astNode2.setLength(n3 - n2);
        return astNode2;
    }

    private AstNode mulExpr() {
        AstNode astNode = this.expExpr();
        block3: while (true) {
            int n2 = this.peekToken();
            int n3 = this.ts.tokenBeg;
            switch (n2) {
                default: {
                    break block3;
                }
                case 23: 
                case 24: 
                case 25: {
                    this.consumeToken();
                    astNode = new InfixExpression(n2, astNode, this.expExpr(), n3);
                    continue block3;
                }
            }
            break;
        }
        return astNode;
    }

    private void mustHaveXML() {
        if (!this.compilerEnv.isXmlAvailable()) {
            this.reportError("msg.XML.not.available");
        }
    }

    private boolean mustMatchToken(int n2, String string, int n3, int n4, boolean bl) {
        if (this.matchToken(n2, bl)) {
            return true;
        }
        this.reportError(string, n3, n4);
        return false;
    }

    private boolean mustMatchToken(int n2, String string, boolean bl) {
        TokenStream tokenStream = this.ts;
        int n3 = tokenStream.tokenBeg;
        return this.mustMatchToken(n2, string, n3, tokenStream.tokenEnd - n3, bl);
    }

    private AstNode name(int n2, int n3) {
        String string = this.ts.getString();
        Object object = this.ts;
        n3 = ((TokenStream)object).tokenBeg;
        int n4 = ((TokenStream)object).lineno;
        if ((n2 & 0x20000) != 0 && this.peekToken() == 107) {
            object = new Label(n3, this.ts.tokenEnd - n3);
            ((Label)object).setName(string);
            ((Node)object).setLineno(this.ts.lineno);
            return object;
        }
        this.saveNameTokenData(n3, string, n4);
        if (this.compilerEnv.isXmlAvailable()) {
            return this.propertyName(-1, 0);
        }
        return this.createNameNode(true, 39);
    }

    /*
     * WARNING - void declaration
     */
    private AstNode nameOrLabel() {
        if (this.currentToken == 39) {
            void var4_19;
            LabeledStatement labeledStatement;
            int n2;
            block12: {
                AstNode astNode;
                void var3_7;
                block11: {
                    n2 = this.ts.tokenBeg;
                    this.currentFlaggedToken |= 0x20000;
                    AstNode astNode2 = this.expr(false);
                    if (astNode2.getType() != 134) {
                        ExpressionStatement expressionStatement = new ExpressionStatement(astNode2, this.insideFunction() ^ true);
                        expressionStatement.lineno = astNode2.lineno;
                        return expressionStatement;
                    }
                    labeledStatement = new LabeledStatement(n2);
                    this.recordLabel((Label)astNode2, labeledStatement);
                    labeledStatement.setLineno(this.ts.lineno);
                    while (this.peekToken() == 39) {
                        this.currentFlaggedToken |= 0x20000;
                        AstNode astNode3 = this.expr(false);
                        if (astNode3.getType() != 134) {
                            ExpressionStatement expressionStatement = new ExpressionStatement(astNode3, this.insideFunction() ^ true);
                            this.autoInsertSemicolon(expressionStatement);
                            break block11;
                        }
                        this.recordLabel((Label)astNode3, labeledStatement);
                    }
                    Object var3_6 = null;
                }
                this.currentLabel = labeledStatement;
                void var4_14 = var3_7;
                if (var3_7 != null) break block12;
                AstNode astNode4 = astNode = this.statementHelper();
                if (this.peekToken() != 165) break block12;
                int n3 = astNode.getLineno();
                List<Comment> list = this.scannedComments;
                AstNode astNode5 = astNode;
                try {
                    if (n3 != ((Comment)list.get(list.size() - 1)).getLineno()) break block12;
                    List<Comment> list2 = this.scannedComments;
                    astNode.setInlineComment(list2.get(list2.size() - 1));
                    this.consumeToken();
                    AstNode astNode6 = astNode;
                }
                catch (Throwable throwable) {
                    this.currentLabel = null;
                    for (Label label : labeledStatement.getLabels()) {
                        this.labelSet.remove(label.getName());
                    }
                    throw throwable;
                }
            }
            this.currentLabel = null;
            for (Label label : labeledStatement.getLabels()) {
                this.labelSet.remove(label.getName());
            }
            n2 = var4_19.getParent() == null ? Parser.getNodeEnd((AstNode)var4_19) - n2 : Parser.getNodeEnd((AstNode)var4_19);
            labeledStatement.setLength(n2);
            labeledStatement.setStatement((AstNode)var4_19);
            return labeledStatement;
        }
        throw this.codeBug();
    }

    private int nextToken() {
        int n2 = this.peekToken();
        this.consumeToken();
        return n2;
    }

    private static int nodeEnd(AstNode astNode) {
        int n2 = astNode.getPosition();
        return astNode.getLength() + n2;
    }

    private static final boolean nowAllSet(int n2, int n3, int n4) {
        boolean bl = (n2 & n4) != n4 && (n3 & n4) == n4;
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private ObjectLiteral objectLiteral() {
        var6_1 = this.ts;
        var5_2 = var6_1.tokenBeg;
        var4_3 = var6_1.lineno;
        var10_4 = new ArrayList<ObjectProperty>();
        if (this.inUseStrictDirective) {
            var7_5 = new HashSet<Object>();
            var8_6 = new HashSet<Object>();
        } else {
            var7_5 = null;
            var8_6 = null;
        }
        var11_7 = this.getAndResetJsDoc();
        var2_8 = -1;
        while (true) {
            block22: {
                block28: {
                    block29: {
                        block30: {
                            block21: {
                                block23: {
                                    block27: {
                                        block26: {
                                            block25: {
                                                block24: {
                                                    var3_10 = this.peekToken();
                                                    var12_12 = this.getAndResetJsDoc();
                                                    var1_9 = var3_10;
                                                    if (var3_10 == 165) {
                                                        this.consumeToken();
                                                        var1_9 = this.peekUntilNonComment(var3_10);
                                                    }
                                                    if (var1_9 == 89) {
                                                        if (var2_8 == -1) break;
                                                        this.warnTrailingComma(var5_2, var10_4, var2_8);
                                                        break;
                                                    }
                                                    var9_11 = this.objliteralProperty();
                                                    if (var9_11 == null) {
                                                        this.reportError("msg.bad.prop");
                                                        var1_9 = 1;
                                                        while (true) {
                                                            var6_1 = null;
                                                            break block21;
                                                            break;
                                                        }
                                                    }
                                                    var6_1 = this.ts.getString();
                                                    var2_8 = this.ts.tokenBeg;
                                                    this.consumeToken();
                                                    var3_10 = this.peekToken();
                                                    if (var3_10 == 92 || var3_10 == 107 || var3_10 == 89) break block23;
                                                    if (var3_10 != 90) break block24;
                                                    var1_9 = 8;
                                                    break block25;
                                                }
                                                if (var9_11.getType() != 39) ** GOTO lbl-1000
                                                if ("get".equals(var6_1)) {
                                                    var1_9 = 2;
                                                } else if ("set".equals(var6_1)) {
                                                    var1_9 = 4;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var1_9 = 1;
                                                }
                                            }
                                            if (var1_9 == 2) break block26;
                                            var6_1 = var9_11;
                                            if (var1_9 != 4) break block27;
                                        }
                                        if ((var6_1 = this.objliteralProperty()) == null) {
                                            this.reportError("msg.bad.prop");
                                        }
                                        this.consumeToken();
                                    }
                                    if (var6_1 == null) ** continue;
                                    var9_11 = this.ts.getString();
                                    var13_13 = this.methodDefinition(var2_8, (AstNode)var6_1, var1_9);
                                    var6_1.setJsDocNode(var12_12);
                                    var10_4.add(var13_13);
                                    var6_1 = var9_11;
                                    break block21;
                                }
                                var9_11.setJsDocNode(var12_12);
                                var10_4.add(this.plainProperty((AstNode)var9_11, var1_9));
                                var1_9 = 1;
                            }
                            if (!this.inUseStrictDirective || var6_1 == null) break block22;
                            if (var1_9 == 1) break block28;
                            if (var1_9 == 2) break block29;
                            if (var1_9 == 4) break block30;
                            if (var1_9 == 8) break block28;
                            break block22;
                        }
                        if (var8_6.contains(var6_1)) {
                            this.addError("msg.dup.obj.lit.prop.strict", (String)var6_1);
                        }
lbl80:
                        // 4 sources

                        while (true) {
                            var8_6.add(var6_1);
                            break block22;
                            break;
                        }
                    }
                    if (var7_5.contains(var6_1)) {
                        this.addError("msg.dup.obj.lit.prop.strict", (String)var6_1);
                    }
                    var7_5.add(var6_1);
                    break block22;
                }
                if (var7_5.contains(var6_1) || var8_6.contains(var6_1)) {
                    this.addError("msg.dup.obj.lit.prop.strict", (String)var6_1);
                }
                var7_5.add(var6_1);
                ** continue;
            }
            this.getAndResetJsDoc();
            if (!this.matchToken(92, true)) break;
            var2_8 = this.ts.tokenEnd;
        }
        this.mustMatchToken(89, "msg.no.brace.prop", true);
        var6_1 = new ObjectLiteral(var5_2, this.ts.tokenEnd - var5_2);
        if (var11_7 != null) {
            var6_1.setJsDocNode(var11_7);
        }
        var6_1.setElements(var10_4);
        var6_1.setLineno(var4_3);
        return var6_1;
    }

    /*
     * Handled duff style switch with additional control
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private AstNode objliteralProperty() {
        void var2_5;
        int n2 = this.peekToken();
        if (n2 != 83) {
            int n3 = 0;
            block5: do {
                switch (n3 == 0 ? n2 : n3) {
                    default: {
                        if (!this.compilerEnv.isReservedKeywordAsIdentifier()) return null;
                        if (!TokenStream.isKeyword(this.ts.getString(), this.compilerEnv.getLanguageVersion(), this.inUseStrictDirective)) return null;
                        n3 = 39;
                        continue block5;
                    }
                    case 41: {
                        StringLiteral stringLiteral = this.createStringLiteral();
                        return var2_5;
                    }
                    case 39: {
                        Name name = this.createNameNode();
                        return var2_5;
                    }
                    case 40: 
                }
                break;
            } while (true);
        }
        AstNode astNode = this.createNumericLiteral(n2, true);
        return var2_5;
    }

    private AstNode orExpr() {
        AstNode astNode;
        AstNode astNode2 = astNode = this.andExpr();
        if (this.matchToken(108, true)) {
            int n2 = this.ts.tokenBeg;
            astNode2 = new InfixExpression(108, astNode, this.orExpr(), n2);
        }
        return astNode2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AstNode parenExpr() {
        boolean bl = this.inForInit;
        boolean bl2 = false;
        this.inForInit = false;
        try {
            Comment comment = this.getAndResetJsDoc();
            Object object = this.ts;
            int n2 = ((TokenStream)object).lineno;
            int n3 = ((TokenStream)object).tokenBeg;
            object = this.peekToken() == 91 ? new EmptyExpression(n3) : this.expr(true);
            if (this.peekToken() == 123) {
                object = this.generatorExpression((AstNode)object, n3);
                return object;
            }
            this.mustMatchToken(91, "msg.no.paren", true);
            int n4 = this.ts.tokenEnd;
            if (((Node)object).getIntProp(29, 0) == 1) {
                bl2 = true;
            }
            if ((bl2 || ((Node)object).getType() == 132) && this.peekToken() != 168) {
                this.reportError("msg.syntax");
                object = this.makeErrorNode();
                return object;
            }
            ParenthesizedExpression parenthesizedExpression = new ParenthesizedExpression(n3, n4 - n3, (AstNode)object);
            parenthesizedExpression.setLineno(n2);
            object = comment;
            if (comment == null) {
                object = this.getAndResetJsDoc();
            }
            if (object != null) {
                parenthesizedExpression.setJsDocNode((Comment)object);
            }
            if (!bl2) return parenthesizedExpression;
            parenthesizedExpression.putIntProp(29, 1);
            return parenthesizedExpression;
        }
        finally {
            this.inForInit = bl;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AstRoot parse() {
        var10_1 = new AstRoot(0);
        this.currentScriptOrFn = var10_1;
        this.currentScope = var10_1;
        var5_2 = this.ts.lineno;
        var6_3 = this.inUseStrictDirective;
        this.inUseStrictDirective = var7_4 = this.defaultUseStrictDirective;
        if (var7_4) {
            var10_1.setInStrictMode(true);
        }
        var3_5 = 1;
        var1_6 = 0;
        while (true) {
            block21: {
                block22: {
                    block20: {
                        var2_7 = var1_6;
                        try {
                            var4_8 = this.peekToken();
                            if (var4_8 <= 0) break block20;
                            if (var4_8 != 113) break block21;
                            var2_7 = var1_6;
                            this.consumeToken();
                            var2_7 = var1_6;
                            var4_8 = this.calledByCompileFunction != false ? 2 : 1;
                            var2_7 = var1_6;
                            var8_9 = this.function(var4_8);
                            var4_8 = var3_5;
                            ** GOTO lbl96
                        }
                        catch (StackOverflowError var8_11) {
                            var8_9 = this.lookupMessage("msg.too.deep.parser.recursion");
                            var7_4 = this.compilerEnv.isIdeMode();
                            if (var7_4) {
                                var1_6 = var2_7;
                            }
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var8_10) {
                            break block22;
                        }
                    }
lbl36:
                    // 2 sources

                    while (true) {
                        this.inUseStrictDirective = var6_3;
                        var2_7 = this.syntaxErrorCount;
                        if (var2_7 != 0) {
                            var8_9 = this.lookupMessage("msg.got.syntax.errors", String.valueOf(var2_7));
                            if (!this.compilerEnv.isIdeMode()) {
                                throw this.errorReporter.runtimeError((String)var8_9, this.sourceURI, var5_2, null, 0);
                            }
                        }
                        var8_9 = this.scannedComments;
                        var2_7 = var1_6;
                        if (var8_9 != null) {
                            var2_7 = var8_9.size();
                            var1_6 = Math.max(var1_6, Parser.getNodeEnd(this.scannedComments.get(var2_7 - 1)));
                            var8_9 = this.scannedComments.iterator();
                            while (true) {
                                var2_7 = var1_6;
                                if (!var8_9.hasNext()) break;
                                var10_1.addComment(var8_9.next());
                            }
                        }
                        var10_1.setLength(var2_7 - 0);
                        var10_1.setSourceName(this.sourceURI);
                        var10_1.setBaseLineno(var5_2);
                        var10_1.setEndLineno(this.ts.lineno);
                        return var10_1;
                    }
lbl-1000:
                    // 1 sources

                    {
                        throw Context.reportRuntimeError((String)var8_9, this.sourceURI, this.ts.lineno, null, 0);
                    }
                }
                this.inUseStrictDirective = var6_3;
                throw var8_10;
                catch (Parser$ParserException var8_12) {
                    ** continue;
                }
            }
            if (var4_8 != 165) ** GOTO lbl75
            var2_7 = var1_6;
            {
                block23: {
                    var8_9 = this.scannedComments;
                    var2_7 = var1_6;
                    var8_9 = (AstNode)var8_9.get(var8_9.size() - 1);
                    var2_7 = var1_6;
                    this.consumeToken();
                    var4_8 = var3_5;
                    break block23;
lbl75:
                    // 1 sources

                    var2_7 = var1_6;
                    var9_13 = this.statement();
                    var4_8 = var3_5;
                    var8_9 = var9_13;
                    if (var3_5 != 0) {
                        var2_7 = var1_6;
                        var11_14 = Parser.getDirective(var9_13);
                        if (var11_14 == null) {
                            var4_8 = 0;
                            var8_9 = var9_13;
                        } else {
                            var4_8 = var3_5;
                            var8_9 = var9_13;
                            var2_7 = var1_6;
                            if (var11_14.equals("use strict")) {
                                var2_7 = var1_6;
                                this.inUseStrictDirective = true;
                                var2_7 = var1_6;
                                var10_1.setInStrictMode(true);
                                var8_9 = var9_13;
                                var4_8 = var3_5;
                            }
                        }
                    }
                }
                var2_7 = var1_6;
                var2_7 = var1_6 = Parser.getNodeEnd((AstNode)var8_9);
                var10_1.addChildToBack((Node)var8_9);
                var2_7 = var1_6;
                var8_9.setParent(var10_1);
                var3_5 = var4_8;
                continue;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private AstNode parseFunctionBody(int var1_1, FunctionNode var2_2) {
        block19: {
            block23: {
                if (this.matchToken(88, true)) ** GOTO lbl6
                if (this.compilerEnv.getLanguageVersion() >= 180 || var1_1 == 4) {
                    var3_5 = true;
                } else {
                    this.reportError("msg.no.brace.body");
lbl6:
                    // 2 sources

                    var3_5 = false;
                }
                var1_1 = var1_1 == 4 ? 1 : 0;
                ++this.nestingOfFunction;
                var5_6 = this.ts.tokenBeg;
                var9_7 = new Block(var5_6);
                var6_8 = this.inUseStrictDirective;
                this.inUseStrictDirective = false;
                var9_7.setLineno(this.ts.lineno);
                if (!var3_5) break block23;
                var7_9 /* !! */  = this.assignExpr();
                var2_2 = new ReturnStatement(var7_9 /* !! */ .getPosition(), var7_9 /* !! */ .getLength(), var7_9 /* !! */ );
                var7_9 /* !! */  = Boolean.TRUE;
                var2_2.putProp(25, var7_9 /* !! */ );
                var9_7.putProp(25, var7_9 /* !! */ );
                if (var1_1 == 0) ** GOTO lbl24
                try {
                    var2_2.putProp(27, var7_9 /* !! */ );
lbl24:
                    // 2 sources

                    var9_7.addStatement(var2_2);
                }
                catch (Throwable var2_3) {
                    --this.nestingOfFunction;
                    this.inUseStrictDirective = var6_8;
                    throw var2_3;
                }
            }
            var1_1 = 1;
            while (true) {
                block22: {
                    block20: {
                        block21: {
                            var4_11 = this.peekToken();
                            if (var4_11 == -1 || var4_11 == 0 || var4_11 == 89) break block19;
                            if (var4_11 == 113) break block20;
                            if (var4_11 == 165) break block21;
                            var8_12 = this.statement();
                            var7_10 = var8_12;
                            var4_11 = var1_1;
                            if (var1_1 == 0) break block22;
                            var10_13 = Parser.getDirective(var8_12);
                            if (var10_13 == null) {
                                var4_11 = 0;
                                var7_10 = var8_12;
                                break block22;
                            }
                            var7_10 = var8_12;
                            var4_11 = var1_1;
                            if (!var10_13.equals("use strict")) break block22;
                            this.inUseStrictDirective = true;
                            var2_2.setInStrictMode(true);
                            var7_10 = var8_12;
                            var4_11 = var1_1;
                            if (var6_8) break block22;
                            this.setRequiresActivation();
                            var7_10 = var8_12;
                            var4_11 = var1_1;
                            break block22;
                        }
                        this.consumeToken();
                        var7_10 = this.scannedComments;
                        var7_10 = (AstNode)var7_10.get(var7_10.size() - 1);
                        var4_11 = var1_1;
                        break block22;
                    }
                    this.consumeToken();
                    var7_10 = this.function(1);
                    var4_11 = var1_1;
                }
                var9_7.addStatement((AstNode)var7_10);
                var1_1 = var4_11;
                continue;
                break;
            }
        }
lbl81:
        // 2 sources

        while (true) {
            --this.nestingOfFunction;
            this.inUseStrictDirective = var6_8;
            var4_11 = this.ts.tokenEnd;
            this.getAndResetJsDoc();
            var1_1 = var4_11;
            if (!var3_5) {
                var1_1 = var4_11;
                if (this.mustMatchToken(89, "msg.no.brace.after.body", true)) {
                    var1_1 = this.ts.tokenEnd;
                }
            }
            var9_7.setLength(var1_1 - var5_6);
            return var9_7;
        }
        catch (Parser$ParserException var2_4) {
            ** continue;
        }
    }

    private void parseFunctionParams(FunctionNode functionNode) {
        Object object;
        HashMap hashMap;
        block20: {
            if (this.matchToken(91, true)) {
                functionNode.setRp(this.ts.tokenBeg - functionNode.getPosition());
                return;
            }
            hashMap = null;
            HashSet<Object> object2 = new HashSet<Object>();
            do {
                Object object3;
                int n2;
                int n3;
                if ((n3 = this.peekToken()) == 91) {
                    if (functionNode.hasRestParameter()) {
                        object = this.ts;
                        n2 = ((TokenStream)object).tokenBeg;
                        this.reportError("msg.parm.after.rest", n2, ((TokenStream)object).tokenEnd - n2);
                    }
                    functionNode.putIntProp(29, 1);
                    break block20;
                }
                n2 = 0;
                if (n3 != 86 && n3 != 88) {
                    if (n3 == 174) {
                        if (functionNode.hasRestParameter()) {
                            object = this.ts;
                            n2 = ((TokenStream)object).tokenBeg;
                            this.reportError("msg.parm.after.rest", n2, ((TokenStream)object).tokenEnd - n2);
                        }
                        functionNode.setHasRestParameter(true);
                        this.consumeToken();
                        n2 = 1;
                    }
                    if (this.mustMatchToken(39, "msg.no.parm", true)) {
                        if (n2 == 0 && functionNode.hasRestParameter()) {
                            object = this.ts;
                            n2 = ((TokenStream)object).tokenBeg;
                            this.reportError("msg.parm.after.rest", n2, ((TokenStream)object).tokenEnd - n2);
                        }
                        object3 = this.createNameNode();
                        object = this.getAndResetJsDoc();
                        if (object != null) {
                            ((Node)object3).setJsDocNode((Comment)object);
                        }
                        functionNode.addParam((AstNode)object3);
                        object3 = this.ts.getString();
                        this.defineSymbol(90, (String)object3);
                        object = hashMap;
                        if (this.inUseStrictDirective) {
                            if ("eval".equals(object3) || "arguments".equals(object3)) {
                                this.reportError("msg.bad.id.strict", (String)object3);
                            }
                            if (object2.contains(object3)) {
                                this.addError("msg.dup.param.strict", (String)object3);
                            }
                            object2.add(object3);
                            object = hashMap;
                        }
                    } else {
                        functionNode.addParam(this.makeErrorNode());
                        object = hashMap;
                    }
                } else {
                    if (functionNode.hasRestParameter()) {
                        object = this.ts;
                        n2 = ((TokenStream)object).tokenBeg;
                        this.reportError("msg.parm.after.rest", n2, ((TokenStream)object).tokenEnd - n2);
                    }
                    object3 = this.destructuringPrimaryExpr();
                    this.markDestructuring((AstNode)object3);
                    functionNode.addParam((AstNode)object3);
                    object = hashMap;
                    if (hashMap == null) {
                        object = new HashMap();
                    }
                    hashMap = this.currentScriptOrFn.getNextTempName();
                    this.defineSymbol(90, (String)((Object)hashMap), false);
                    object.put(hashMap, object3);
                }
                hashMap = object;
            } while (this.matchToken(92, true));
            hashMap = object;
        }
        if (hashMap != null) {
            object = new Node(92);
            for (Map.Entry entry : hashMap.entrySet()) {
                ((Node)object).addChildToBack(this.createDestructuringAssignment(126, (Node)entry.getValue(), this.createName((String)entry.getKey())));
            }
            functionNode.putProp(23, object);
        }
        if (this.mustMatchToken(91, "msg.no.paren.after.parms", true)) {
            functionNode.setRp(this.ts.tokenBeg - functionNode.getPosition());
        }
    }

    private int peekFlaggedToken() {
        this.peekToken();
        return this.currentFlaggedToken;
    }

    private int peekToken() {
        if (this.currentFlaggedToken != 0) {
            return this.currentToken;
        }
        int n2 = this.ts.getLineno();
        int n3 = this.ts.getToken();
        int n4 = 0;
        boolean bl = false;
        while (true) {
            block8: {
                block7: {
                    if (n3 != 1 && n3 != 165) break block7;
                    if (n3 == 1) {
                        ++n2;
                        n3 = this.ts.getToken();
                        bl = true;
                        continue;
                    }
                    if (!this.compilerEnv.isRecordingComments()) break block8;
                    this.recordComment(n2, this.ts.getAndResetCurrentComment());
                }
                this.currentToken = n3;
                n2 = n4;
                if (bl) {
                    n2 = 65536;
                }
                this.currentFlaggedToken = n3 | n2;
                return n3;
            }
            n3 = this.ts.getToken();
        }
    }

    private int peekTokenOrEOL() {
        int n2 = this.peekToken();
        if ((this.currentFlaggedToken & 0x10000) != 0) {
            n2 = 1;
        }
        return n2;
    }

    private int peekUntilNonComment(int n2) {
        while (n2 == 165) {
            this.consumeToken();
            n2 = this.peekToken();
        }
        return n2;
    }

    private ObjectProperty plainProperty(AstNode astNode, int n2) {
        int n3 = this.peekToken();
        if ((n3 == 92 || n3 == 89) && n2 == 39 && this.compilerEnv.getLanguageVersion() >= 180) {
            if (!this.inDestructuringAssignment && this.compilerEnv.getLanguageVersion() < 200) {
                this.reportError("msg.bad.object.init");
            }
            Name name = new Name(astNode.getPosition(), astNode.getString());
            ObjectProperty objectProperty = new ObjectProperty();
            objectProperty.putProp(26, Boolean.TRUE);
            objectProperty.setLeftAndRight(astNode, name);
            return objectProperty;
        }
        this.mustMatchToken(107, "msg.no.colon.prop", true);
        ObjectProperty objectProperty = new ObjectProperty();
        objectProperty.setOperatorPosition(this.ts.tokenBeg);
        objectProperty.setLeftAndRight(astNode, this.assignExpr());
        return objectProperty;
    }

    /*
     * Exception decompiling
     */
    private AstNode primaryExpr() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 12[SWITCH]
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

    private AstNode propertyAccess(int n2, AstNode astNode) {
        Object object;
        int n3;
        Object object2;
        block12: {
            int n4;
            block7: {
                int n5;
                int n6;
                block13: {
                    block6: {
                        block8: {
                            block11: {
                                block9: {
                                    block10: {
                                        if (astNode == null) {
                                            this.codeBug();
                                        }
                                        n4 = 0;
                                        object2 = this.ts;
                                        n6 = ((TokenStream)object2).lineno;
                                        n3 = ((TokenStream)object2).tokenBeg;
                                        this.consumeToken();
                                        if (n2 == 147) {
                                            this.mustHaveXML();
                                            n4 = 4;
                                        }
                                        if (!this.compilerEnv.isXmlAvailable()) {
                                            if (!(this.nextToken() == 39 || this.compilerEnv.isReservedKeywordAsIdentifier() && TokenStream.isKeyword(this.ts.getString(), this.compilerEnv.getLanguageVersion(), this.inUseStrictDirective))) {
                                                this.reportError("msg.no.name.after.dot");
                                            }
                                            astNode = new PropertyGet(astNode, this.createNameNode(true, 33), n3);
                                            astNode.setLineno(n6);
                                            return astNode;
                                        }
                                        n6 = this.nextToken();
                                        if (n6 == 23) break block6;
                                        if (n6 == 39) break block7;
                                        if (n6 == 50) break block8;
                                        if (n6 == 131) break block9;
                                        if (n6 == 151) break block10;
                                        if (!this.compilerEnv.isReservedKeywordAsIdentifier() || (object2 = Token.keywordToName(n6)) == null) {
                                            this.reportError("msg.no.name.after.dot");
                                            return this.makeErrorNode();
                                        }
                                        break block11;
                                    }
                                    object2 = this.attributeAccess();
                                    break block12;
                                }
                                object2 = this.ts.getString();
                            }
                            object = this.ts;
                            this.saveNameTokenData(((TokenStream)object).tokenBeg, (String)object2, ((TokenStream)object).lineno);
                            break block7;
                        }
                        object2 = this.ts;
                        n6 = ((TokenStream)object2).tokenBeg;
                        n5 = ((TokenStream)object2).lineno;
                        object2 = "throw";
                        break block13;
                    }
                    object2 = this.ts;
                    n6 = ((TokenStream)object2).tokenBeg;
                    n5 = ((TokenStream)object2).lineno;
                    object2 = "*";
                }
                this.saveNameTokenData(n6, (String)object2, n5);
            }
            object2 = this.propertyName(-1, n4);
        }
        boolean bl = object2 instanceof XmlRef;
        object = bl ? new XmlMemberGet() : new PropertyGet();
        if (bl && n2 == 112) {
            ((Node)object).setType(112);
        }
        n2 = astNode.getPosition();
        ((AstNode)object).setPosition(n2);
        ((AstNode)object).setLength(Parser.getNodeEnd((AstNode)object2) - n2);
        ((InfixExpression)object).setOperatorPosition(n3 - n2);
        ((Node)object).setLineno(astNode.getLineno());
        ((InfixExpression)object).setLeft(astNode);
        ((InfixExpression)object).setRight((AstNode)object2);
        return object;
    }

    private AstNode propertyName(int n2, int n3) {
        Object object;
        int n4;
        int n5 = n2 != -1 ? n2 : this.ts.tokenBeg;
        int n6 = this.ts.lineno;
        Name name = this.createNameNode(true, this.currentToken);
        if (this.matchToken(148, true)) {
            n4 = this.ts.tokenBeg;
            int n7 = this.nextToken();
            if (n7 != 23) {
                if (n7 != 39) {
                    if (n7 != 86) {
                        this.reportError("msg.no.name.after.coloncolon");
                        return this.makeErrorNode();
                    }
                    return this.xmlElemRef(n2, name, n4);
                }
                object = this.createNameNode();
            } else {
                object = this.ts;
                this.saveNameTokenData(((TokenStream)object).tokenBeg, "*", ((TokenStream)object).lineno);
                object = this.createNameNode(false, -1);
            }
        } else {
            n4 = -1;
            object = name;
            name = null;
        }
        if (name == null && n3 == 0 && n2 == -1) {
            return object;
        }
        XmlPropRef xmlPropRef = new XmlPropRef(n5, Parser.getNodeEnd((AstNode)object) - n5);
        xmlPropRef.setAtPos(n2);
        xmlPropRef.setNamespace(name);
        xmlPropRef.setColonPos(n4);
        xmlPropRef.setPropName((Name)object);
        xmlPropRef.setLineno(n6);
        return xmlPropRef;
    }

    private void recordComment(int n2, String object) {
        if (this.scannedComments == null) {
            this.scannedComments = new ArrayList<Comment>();
        }
        Object object2 = this.ts;
        object2 = new Comment(((TokenStream)object2).tokenBeg, ((TokenStream)object2).getTokenLength(), this.ts.commentType, (String)object);
        if (this.ts.commentType == Token$CommentType.JSDOC && this.compilerEnv.isRecordingLocalJsDocComments()) {
            TokenStream tokenStream = this.ts;
            this.currentJsDocComment = object = new Comment(tokenStream.tokenBeg, tokenStream.getTokenLength(), this.ts.commentType, (String)object);
            ((Node)object).setLineno(n2);
        }
        ((Node)object2).setLineno(n2);
        this.scannedComments.add((Comment)object2);
    }

    private void recordLabel(Label label, LabeledStatement labeledStatement) {
        if (this.peekToken() != 107) {
            this.codeBug();
        }
        this.consumeToken();
        String string = label.getName();
        Object object = this.labelSet;
        if (object == null) {
            this.labelSet = new HashMap<String, LabeledStatement>();
        } else if ((object = object.get(string)) != null) {
            if (this.compilerEnv.isIdeMode()) {
                object = ((LabeledStatement)object).getLabelByName(string);
                this.reportError("msg.dup.label", ((AstNode)object).getAbsolutePosition(), ((AstNode)object).getLength());
            }
            this.reportError("msg.dup.label", label.getPosition(), label.getLength());
        }
        labeledStatement.addLabel(label);
        this.labelSet.put(string, labeledStatement);
    }

    /*
     * Exception decompiling
     */
    private AstNode relExpr() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    private void restoreRelativeLoopPosition(Loop loop) {
        if (loop.getParent() != null) {
            loop.setRelative(loop.getParent().getPosition());
        }
    }

    /*
     * Unable to fully structure code
     */
    private AstNode returnOrYield(int var1_1, boolean var2_2) {
        block14: {
            block15: {
                var9_3 = this.insideFunction();
                var4_4 = 4;
                if (!var9_3) {
                    var10_5 = var1_1 == 4 ? "msg.bad.return" : "msg.bad.yield";
                    this.reportError((String)var10_5);
                }
                this.consumeToken();
                var10_5 = this.ts;
                var7_6 = var10_5.lineno;
                var6_7 = var10_5.tokenBeg;
                var5_8 = var10_5.tokenEnd;
                if (var1_1 == 73 && this.compilerEnv.getLanguageVersion() >= 200 && this.peekToken() == 23) {
                    this.consumeToken();
                    var9_3 = true;
                } else {
                    var9_3 = false;
                }
                var11_9 = null;
                var8_10 = this.peekTokenOrEOL();
                var3_11 = var5_8;
                var10_5 = var11_9;
                if (var8_10 == -1) break block14;
                var3_11 = var5_8;
                var10_5 = var11_9;
                if (var8_10 == 0) break block14;
                var3_11 = var5_8;
                var10_5 = var11_9;
                if (var8_10 == 1) break block14;
                if (var8_10 == 73) break block15;
                var3_11 = var5_8;
                var10_5 = var11_9;
                if (var8_10 == 85) break block14;
                var3_11 = var5_8;
                var10_5 = var11_9;
                if (var8_10 == 87) break block14;
                var3_11 = var5_8;
                var10_5 = var11_9;
                if (var8_10 == 89) break block14;
                var3_11 = var5_8;
                var10_5 = var11_9;
                if (var8_10 == 91) break block14;
                ** GOTO lbl-1000
            }
            if (this.compilerEnv.getLanguageVersion() < 200) {
                var3_11 = var5_8;
                var10_5 = var11_9;
            } else lbl-1000:
            // 2 sources

            {
                var10_5 = this.expr(false);
                var3_11 = Parser.getNodeEnd((AstNode)var10_5);
            }
        }
        var5_8 = this.endFlags;
        if (var1_1 == 4) {
            var1_1 = var4_4;
            if (var10_5 == null) {
                var1_1 = 2;
            }
            this.endFlags = var5_8 | var1_1;
            var1_1 = var3_11 - var6_7;
            var11_9 = new ReturnStatement(var6_7, var1_1, (AstNode)var10_5);
            var10_5 = var11_9;
            if (Parser.nowAllSet(var5_8, this.endFlags, 6)) {
                this.addStrictWarning("msg.return.inconsistent", "", var6_7, var1_1);
                var10_5 = var11_9;
            }
        } else {
            if (!this.insideFunction()) {
                this.reportError("msg.bad.yield");
            }
            this.endFlags |= 8;
            var11_9 = new Yield(var6_7, var3_11 - var6_7, (AstNode)var10_5, var9_3);
            this.setRequiresActivation();
            this.setIsGenerator();
            var10_5 = var11_9;
            if (!var2_2) {
                var10_5 = new ExpressionStatement(var11_9);
            }
        }
        if (this.insideFunction() && Parser.nowAllSet(var5_8, this.endFlags, 12) && !((FunctionNode)this.currentScriptOrFn).isES6Generator()) {
            var11_9 = ((FunctionNode)this.currentScriptOrFn).getFunctionName();
            if (var11_9 != null && var11_9.length() != 0) {
                this.addError("msg.generator.returns", var11_9.getIdentifier());
            } else {
                this.addError("msg.anon.generator.returns", "");
            }
        }
        var10_5.setLineno(var7_6);
        return var10_5;
    }

    private void saveNameTokenData(int n2, String string, int n3) {
        this.prevNameTokenStart = n2;
        this.prevNameTokenString = string;
        this.prevNameTokenLineno = n3;
    }

    private AstNode shiftExpr() {
        AstNode astNode = this.addExpr();
        block3: while (true) {
            int n2 = this.peekToken();
            int n3 = this.ts.tokenBeg;
            switch (n2) {
                default: {
                    break block3;
                }
                case 18: 
                case 19: 
                case 20: {
                    this.consumeToken();
                    astNode = new InfixExpression(n2, astNode, this.addExpr(), n3);
                    continue block3;
                }
            }
            break;
        }
        return astNode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AstNode statement() {
        int n2;
        int n3 = this.ts.tokenBeg;
        try {
            AstNode astNode = this.statementHelper();
            if (astNode != null) {
                Object object;
                int n4;
                if (this.compilerEnv.isStrictMode() && !astNode.hasSideEffects()) {
                    n4 = astNode.getPosition();
                    n4 = Math.max(n4, this.lineBeginningFor(n4));
                    object = astNode instanceof EmptyStatement ? "msg.extra.trailing.semi" : "msg.no.side.effects";
                    this.addStrictWarning((String)object, "", n4, Parser.nodeEnd(astNode) - n4);
                }
                if (this.peekToken() == 165 && (n4 = astNode.getLineno()) == (object = this.scannedComments).get(object.size() - 1).getLineno()) {
                    object = this.scannedComments;
                    astNode.setInlineComment(object.get(object.size() - 1));
                    this.consumeToken();
                }
                return astNode;
            }
        }
        catch (Parser$ParserException parser$ParserException) {}
        do {
            n2 = this.peekTokenOrEOL();
            this.consumeToken();
        } while (n2 != -1 && n2 != 0 && n2 != 1 && n2 != 85);
        return new EmptyStatement(n3, this.ts.tokenBeg - n3);
    }

    /*
     * Unable to fully structure code
     */
    private AstNode statementHelper() {
        block14: {
            block26: {
                block15: {
                    block16: {
                        block17: {
                            block18: {
                                block19: {
                                    block20: {
                                        block21: {
                                            block22: {
                                                block23: {
                                                    block24: {
                                                        block25: {
                                                            var3_1 = this.currentLabel;
                                                            if (var3_1 != null && var3_1.getStatement() != null) {
                                                                this.currentLabel = null;
                                                            }
                                                            var1_2 = this.peekToken();
                                                            var3_1 = this.ts;
                                                            var2_3 = var3_1.tokenBeg;
                                                            if (var1_2 == -1) break block14;
                                                            if (var1_2 == 4) break block15;
                                                            if (var1_2 == 39) break block16;
                                                            if (var1_2 == 50) break block17;
                                                            if (var1_2 == 73) break block15;
                                                            if (var1_2 == 88) break block18;
                                                            if (var1_2 == 113) break block19;
                                                            if (var1_2 == 116) break block20;
                                                            if (var1_2 == 118) break block21;
                                                            if (var1_2 == 84) break block22;
                                                            if (var1_2 == 85) break block23;
                                                            if (var1_2 == 157) break block24;
                                                            if (var1_2 == 158) break block25;
                                                            if (var1_2 == 164) ** GOTO lbl48
                                                            if (var1_2 == 165) ** GOTO lbl46
                                                            switch (var1_2) {
                                                                default: {
                                                                    var1_2 = var3_1.lineno;
                                                                    var3_1 = new ExpressionStatement(this.expr(false), this.insideFunction() ^ true);
                                                                    break;
                                                                }
                                                                case 127: {
                                                                    if (this.inUseStrictDirective) {
                                                                        this.reportError("msg.no.with.strict");
                                                                    }
                                                                    return this.withStatement();
                                                                }
                                                                case 125: {
                                                                    var3_1 = this.continueStatement();
                                                                    break block26;
                                                                }
                                                                case 124: {
                                                                    var3_1 = this.breakStatement();
                                                                    break block26;
                                                                }
                                                                case 123: {
                                                                    return this.forLoop();
                                                                }
                                                                case 122: {
                                                                    return this.doLoop();
                                                                }
                                                                case 121: {
                                                                    return this.whileLoop();
                                                                }
                                                                case 120: {
                                                                    var3_1 = this.defaultXmlNamespace();
                                                                    break block26;
                                                                }
lbl46:
                                                                // 1 sources

                                                                var3_1 = this.scannedComments;
                                                                return var3_1.get(var3_1.size() - 1);
lbl48:
                                                                // 1 sources

                                                                this.consumeToken();
                                                                var3_1 = this.ts;
                                                                var2_3 = var3_1.tokenBeg;
                                                                var3_1 = new KeywordLiteral(var2_3, var3_1.tokenEnd - var2_3, var1_2);
                                                                var1_2 = this.ts.lineno;
                                                            }
                                                            var3_1.setLineno(var1_2);
                                                            break block26;
                                                            {
                                                                ** case 126:
                                                            }
                                                        }
                                                        this.consumeToken();
                                                        var3_1 = this.ts;
                                                        var1_2 = var3_1.lineno;
                                                        var3_1 = this.variables(this.currentToken, var3_1.tokenBeg, true);
                                                        var3_1.setLineno(var1_2);
                                                        break block26;
                                                    }
                                                    var3_1 = this.letStatement();
                                                    if (!(var3_1 instanceof VariableDeclaration) || this.peekToken() != 85) {
                                                        return var3_1;
                                                    }
                                                    break block26;
                                                }
                                                this.consumeToken();
                                                var1_2 = this.ts.tokenBeg;
                                                var3_1 = new EmptyStatement(var1_2, this.ts.tokenEnd - var1_2);
                                                var3_1.setLineno(this.ts.lineno);
                                                return var3_1;
                                            }
                                            return this.tryStatement();
                                        }
                                        return this.switchStatement();
                                    }
                                    return this.ifStatement();
                                }
                                this.consumeToken();
                                return this.function(3);
                            }
                            return this.block();
                        }
                        var3_1 = this.throwStatement();
                        break block26;
                    }
                    var3_1 = this.nameOrLabel();
                    if (!(var3_1 instanceof ExpressionStatement)) {
                        return var3_1;
                    }
                    break block26;
                }
                var3_1 = this.returnOrYield(var1_2, false);
            }
            this.autoInsertSemicolon((AstNode)var3_1);
            return var3_1;
        }
        this.consumeToken();
        return this.makeErrorNode();
    }

    private AstNode statements() {
        return this.statements(null);
    }

    private AstNode statements(AstNode astNode) {
        int n2;
        if (this.currentToken != 88 && !this.compilerEnv.isIdeMode()) {
            this.codeBug();
        }
        int n3 = this.ts.tokenBeg;
        if (astNode == null) {
            astNode = new Block(n3);
        }
        astNode.setLineno(this.ts.lineno);
        while ((n2 = this.peekToken()) > 0 && n2 != 89) {
            astNode.addChild(this.statement());
        }
        astNode.setLength(this.ts.tokenBeg - n3);
        return astNode;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private SwitchStatement switchStatement() {
        if (this.currentToken != 118) {
            this.codeBug();
        }
        this.consumeToken();
        int n2 = this.ts.tokenBeg;
        SwitchStatement switchStatement = new SwitchStatement(n2);
        if (this.mustMatchToken(90, "msg.no.paren.switch", true)) {
            switchStatement.setLp(this.ts.tokenBeg - n2);
        }
        switchStatement.setLineno(this.ts.lineno);
        switchStatement.setExpression(this.expr(false));
        this.enterSwitch(switchStatement);
        try {
            block16: {
                Object object;
                if (this.mustMatchToken(91, "msg.no.paren.after.switch", true)) {
                    switchStatement.setRp(this.ts.tokenBeg - n2);
                }
                this.mustMatchToken(88, "msg.no.brace.switch", true);
                boolean bl = false;
                while (true) {
                    int n3 = this.nextToken();
                    object = this.ts;
                    int n4 = ((TokenStream)object).tokenBeg;
                    int n5 = ((TokenStream)object).lineno;
                    Iterable<Comment> iterable = null;
                    if (n3 == 89) break;
                    if (n3 != 165) {
                        if (n3 != 119) {
                            if (n3 != 120) {
                                this.reportError("msg.bad.switch");
                                break block16;
                            }
                            if (bl) {
                                this.reportError("msg.double.switch.default");
                            }
                            this.mustMatchToken(107, "msg.no.colon.case", true);
                            bl = true;
                        } else {
                            iterable = this.expr(false);
                            this.mustMatchToken(107, "msg.no.colon.case", true);
                        }
                        object = new SwitchCase(n4);
                        ((SwitchCase)object).setExpression((AstNode)iterable);
                        ((AstNode)object).setLength(this.ts.tokenEnd - n2);
                        ((Node)object).setLineno(n5);
                        while ((n5 = this.peekToken()) != 89 && n5 != 119 && n5 != 120 && n5 != 0) {
                            if (n5 == 165) {
                                iterable = this.scannedComments;
                                iterable = (Comment)iterable.get(iterable.size() - 1);
                                if (((AstNode)object).getInlineComment() == null && ((AstNode)iterable).getLineno() == ((AstNode)object).getLineno()) {
                                    ((AstNode)object).setInlineComment((AstNode)iterable);
                                } else {
                                    ((SwitchCase)object).addStatement((AstNode)iterable);
                                }
                                this.consumeToken();
                                continue;
                            }
                            ((SwitchCase)object).addStatement(this.statement());
                        }
                        switchStatement.addCase((SwitchCase)object);
                        continue;
                    }
                    iterable = this.scannedComments;
                    switchStatement.addChild(iterable.get(iterable.size() - 1));
                }
                switchStatement.setLength(((TokenStream)object).tokenEnd - n2);
            }
            return switchStatement;
        }
        finally {
            this.exitSwitch();
        }
    }

    private AstNode taggedTemplateLiteral(AstNode astNode) {
        AstNode astNode2 = this.templateLiteral(true);
        TaggedTemplateLiteral taggedTemplateLiteral = new TaggedTemplateLiteral();
        taggedTemplateLiteral.setTarget(astNode);
        taggedTemplateLiteral.setTemplateLiteral(astNode2);
        return taggedTemplateLiteral;
    }

    private AstNode templateLiteral(boolean bl) {
        int n2;
        if (this.currentToken != 170) {
            this.codeBug();
        }
        TokenStream tokenStream = this.ts;
        int n3 = tokenStream.tokenBeg;
        int n4 = tokenStream.tokenEnd;
        ArrayList<AstNode> arrayList = new ArrayList<AstNode>();
        TemplateLiteral templateLiteral = new TemplateLiteral(n3);
        tokenStream = this.ts;
        n4 = tokenStream.tokenBeg;
        while (true) {
            ++n4;
            n2 = tokenStream.readTemplateLiteral(bl);
            if (n2 != 172) break;
            arrayList.add(this.createTemplateLiteralCharacters(n4));
            arrayList.add(this.expr(false));
            this.mustMatchToken(89, "msg.syntax", true);
            tokenStream = this.ts;
            n4 = tokenStream.tokenBeg;
        }
        if (n2 == -1) {
            return this.makeErrorNode();
        }
        arrayList.add(this.createTemplateLiteralCharacters(n4));
        n4 = this.ts.tokenEnd;
        templateLiteral.setElements(arrayList);
        templateLiteral.setLength(n4 - n3);
        return templateLiteral;
    }

    private ThrowStatement throwStatement() {
        if (this.currentToken != 50) {
            this.codeBug();
        }
        this.consumeToken();
        Object object = this.ts;
        int n2 = ((TokenStream)object).tokenBeg;
        int n3 = ((TokenStream)object).lineno;
        if (this.peekTokenOrEOL() == 1) {
            this.reportError("msg.bad.throw.eol");
        }
        object = new ThrowStatement(n2, this.expr(false));
        ((Node)object).setLineno(n3);
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private TryStatement tryStatement() {
        if (this.currentToken != 84) {
            this.codeBug();
        }
        this.consumeToken();
        var11_1 /* !! */  = this.getAndResetJsDoc();
        var10_2 = this.ts;
        var6_4 = var10_2.tokenBeg;
        var7_5 = var10_2.lineno;
        var15_6 = new TryStatement(var6_4);
        while ((var1_7 = this.peekToken()) == 165) {
            var10_2 = this.scannedComments;
            var15_6.setInlineComment((Comment)var10_2.get(var10_2.size() - 1));
            this.consumeToken();
        }
        if (var1_7 != 88) {
            this.reportError("msg.no.brace.try");
        }
        var16_8 = this.getNextStatementAfterInlineComments(var15_6);
        var2_9 = Parser.getNodeEnd(var16_8);
        while ((var1_7 = this.peekToken()) == 165) {
            var10_2 = this.scannedComments;
            var15_6.setInlineComment(var10_2.get(var10_2.size() - 1));
            this.consumeToken();
        }
        if (var1_7 == 128) {
            var1_7 = 0;
            var10_2 = null;
            while (this.matchToken(128, true)) {
                var9_14 = this.ts.lineno;
                if (var1_7 != 0) {
                    this.reportError("msg.catch.unreachable");
                }
                var8_13 = this.ts.tokenBeg;
                var2_9 = this.peekToken();
                if (var2_9 != 88) {
                    if (var2_9 != 90) {
                        while (true) {
                            this.reportError("msg.no.paren.catch");
                            break block27;
                            break;
                        }
                    }
                    this.matchToken(90, true);
                    var4_11 = this.ts.tokenBeg;
                    this.mustMatchToken(39, "msg.bad.catchcond", true);
                    var14_17 = this.createNameNode();
                    var12_15 = this.getAndResetJsDoc();
                    if (var12_15 != null) {
                        var14_17.setJsDocNode((Comment)var12_15);
                    }
                    var12_15 = var14_17.getIdentifier();
                    if (this.inUseStrictDirective && ("eval".equals(var12_15) || "arguments".equals(var12_15))) {
                        this.reportError("msg.bad.id.strict", (String)var12_15);
                    }
                    if (this.matchToken(116, true)) {
                        var2_9 = this.ts.tokenBeg;
                        var12_15 = this.expr(false);
                    } else {
                        var2_9 = -1;
                        var1_7 = 1;
                        var12_15 = null;
                    }
                    var3_10 = this.mustMatchToken(91, "msg.bad.catchcond", true) != false ? this.ts.tokenBeg : -1;
                    this.mustMatchToken(88, "msg.no.brace.catchblock", true);
                    var13_16 = var12_15;
                    var12_15 = var14_17;
                } else {
                    block27: {
                        if (this.compilerEnv.getLanguageVersion() < 200) ** continue;
                        this.matchToken(88, true);
                    }
                    var13_16 = null;
                    var2_9 = -1;
                    var3_10 = -1;
                    var4_11 = -1;
                    var12_15 = null;
                }
                var17_18 = new Scope(var8_13);
                var14_17 = new CatchClause(var8_13);
                var14_17.setLineno(this.ts.lineno);
                this.pushScope(var17_18);
                this.statements(var17_18);
                var5_12 = Parser.getNodeEnd(var17_18);
                var14_17.setVarName((Name)var12_15);
                var14_17.setCatchCondition((AstNode)var13_16);
                var14_17.setBody(var17_18);
                if (var2_9 != -1) {
                    var14_17.setIfPosition(var2_9 - var8_13);
                }
                var14_17.setParens(var4_11, var3_10);
                var14_17.setLineno(var9_14);
                var2_9 = var5_12;
                if (this.mustMatchToken(89, "msg.no.brace.after.body", true)) {
                    var2_9 = this.ts.tokenEnd;
                }
                var14_17.setLength(var2_9 - var8_13);
                var12_15 = var10_2;
                if (var10_2 == null) {
                    var12_15 = new ArrayList<Comment>();
                }
                var12_15.add((AstNode)var14_17);
                var10_2 = var12_15;
                continue;
                finally {
                    this.popScope();
                }
            }
            var12_15 = var11_1 /* !! */ ;
            var11_1 /* !! */  = var10_2;
            var10_2 = var12_15;
        } else {
            var10_2 = var11_1 /* !! */ ;
            if (var1_7 != 129) {
                this.mustMatchToken(129, "msg.try.no.catchfinally", true);
            }
            var11_1 /* !! */  = null;
        }
        if (this.matchToken(129, true)) {
            var1_7 = this.ts.tokenBeg;
            var12_15 = this.statement();
            var2_9 = Parser.getNodeEnd((AstNode)var12_15);
        } else {
            var1_7 = -1;
            var12_15 = null;
        }
        var15_6.setLength(var2_9 - var6_4);
        var15_6.setTryBlock(var16_8);
        var15_6.setCatchClauses((List<CatchClause>)var11_1 /* !! */ );
        var15_6.setFinallyBlock((AstNode)var12_15);
        if (var1_7 != -1) {
            var15_6.setFinallyPosition(var1_7 - var6_4);
        }
        var15_6.setLineno(var7_5);
        if (var10_2 != null) {
            var15_6.setJsDocNode((Comment)var10_2);
        }
        return var15_6;
    }

    private AstNode unaryExpr() {
        block4: {
            int n2;
            int n3;
            block10: {
                block5: {
                    block6: {
                        block7: {
                            block8: {
                                block9: {
                                    n2 = n3 = this.peekToken();
                                    if (n3 == 165) {
                                        this.consumeToken();
                                        n2 = this.peekUntilNonComment(n3);
                                    }
                                    n3 = this.ts.lineno;
                                    if (n2 == -1) break block4;
                                    if (n2 == 14) break block5;
                                    if (n2 == 130) break block6;
                                    if (n2 == 21) break block7;
                                    if (n2 == 22) break block8;
                                    if (n2 == 26 || n2 == 27) break block6;
                                    if (n2 == 31) break block9;
                                    if (n2 == 32) break block6;
                                    if (n2 == 110 || n2 == 111) {
                                        this.consumeToken();
                                        UpdateExpression updateExpression = new UpdateExpression(n2, this.ts.tokenBeg, this.memberExpr(true));
                                        updateExpression.setLineno(n3);
                                        this.checkBadIncDec(updateExpression);
                                        return updateExpression;
                                    }
                                    break block10;
                                }
                                this.consumeToken();
                                UnaryExpression unaryExpression = new UnaryExpression(n2, this.ts.tokenBeg, this.unaryExpr());
                                unaryExpression.setLineno(n3);
                                return unaryExpression;
                            }
                            this.consumeToken();
                            UnaryExpression unaryExpression = new UnaryExpression(29, this.ts.tokenBeg, this.unaryExpr());
                            unaryExpression.setLineno(n3);
                            return unaryExpression;
                        }
                        this.consumeToken();
                        UnaryExpression unaryExpression = new UnaryExpression(28, this.ts.tokenBeg, this.unaryExpr());
                        unaryExpression.setLineno(n3);
                        return unaryExpression;
                    }
                    this.consumeToken();
                    UnaryExpression unaryExpression = new UnaryExpression(n2, this.ts.tokenBeg, this.unaryExpr());
                    unaryExpression.setLineno(n3);
                    return unaryExpression;
                }
                if (this.compilerEnv.isXmlAvailable()) {
                    this.consumeToken();
                    return this.memberExprTail(true, this.xmlInitializer());
                }
            }
            AstNode astNode = this.memberExpr(true);
            n2 = this.peekTokenOrEOL();
            if (n2 != 110 && n2 != 111) {
                return astNode;
            }
            this.consumeToken();
            astNode = new UpdateExpression(n2, this.ts.tokenBeg, astNode, true);
            astNode.setLineno(n3);
            this.checkBadIncDec((UpdateExpression)astNode);
            return astNode;
        }
        this.consumeToken();
        return this.makeErrorNode();
    }

    private VariableDeclaration variables(int n2, int n3, boolean bl) {
        int n4;
        VariableDeclaration variableDeclaration = new VariableDeclaration(n3);
        variableDeclaration.setType(n2);
        variableDeclaration.setLineno(this.ts.lineno);
        Object object = this.getAndResetJsDoc();
        if (object != null) {
            variableDeclaration.setJsDocNode((Comment)object);
        }
        do {
            Name name;
            int n5 = this.peekToken();
            object = this.ts;
            int n6 = ((TokenStream)object).tokenBeg;
            n4 = ((TokenStream)object).tokenEnd;
            AstNode astNode = null;
            if (n5 != 86 && n5 != 88) {
                this.mustMatchToken(39, "msg.bad.var", true);
                name = this.createNameNode();
                name.setLineno(this.ts.getLineno());
                if (this.inUseStrictDirective && ("eval".equals(object = this.ts.getString()) || "arguments".equals(this.ts.getString()))) {
                    this.reportError("msg.bad.id.strict", (String)object);
                }
                this.defineSymbol(n2, this.ts.getString(), this.inForInit);
                object = null;
            } else {
                object = this.destructuringPrimaryExpr();
                n4 = Parser.getNodeEnd((AstNode)object);
                if (!(object instanceof DestructuringForm)) {
                    this.reportError("msg.bad.assign.left", n6, n4 - n6);
                }
                this.markDestructuring((AstNode)object);
                name = null;
            }
            n5 = this.ts.lineno;
            Comment comment = this.getAndResetJsDoc();
            if (this.matchToken(93, true)) {
                astNode = this.assignExpr();
                n4 = Parser.getNodeEnd(astNode);
            }
            VariableInitializer variableInitializer = new VariableInitializer(n6, n4 - n6);
            if (object != null) {
                if (astNode == null && !this.inForInit) {
                    this.reportError("msg.destruct.assign.no.init");
                }
                variableInitializer.setTarget((AstNode)object);
            } else {
                variableInitializer.setTarget(name);
            }
            variableInitializer.setInitializer(astNode);
            variableInitializer.setType(n2);
            variableInitializer.setJsDocNode(comment);
            variableInitializer.setLineno(n5);
            variableDeclaration.addVariable(variableInitializer);
        } while (this.matchToken(92, true));
        variableDeclaration.setLength(n4 - n3);
        variableDeclaration.setIsStatement(bl);
        return variableDeclaration;
    }

    private void warnMissingSemi(int n2, int n3) {
        if (this.compilerEnv.isStrictMode()) {
            int[] nArray = new int[2];
            String string = this.ts.getLine(n3, nArray);
            int n4 = n2;
            if (this.compilerEnv.isIdeMode()) {
                n4 = Math.max(n2, n3 - nArray[1]);
            }
            if (string != null) {
                this.addStrictWarning("msg.missing.semi", "", n4, n3 - n4, nArray[0], string, nArray[1]);
            } else {
                this.addStrictWarning("msg.missing.semi", "", n4, n3 - n4);
            }
        }
    }

    private void warnTrailingComma(int n2, List<?> list, int n3) {
        if (this.compilerEnv.getWarnTrailingComma()) {
            if (!list.isEmpty()) {
                n2 = ((AstNode)list.get(0)).getPosition();
            }
            n2 = Math.max(n2, this.lineBeginningFor(n3));
            this.addWarning("msg.extra.trailing.comma", n2, n3 - n2);
        }
    }

    private WhileLoop whileLoop() {
        if (this.currentToken != 121) {
            this.codeBug();
        }
        this.consumeToken();
        int n2 = this.ts.tokenBeg;
        WhileLoop whileLoop = new WhileLoop(n2);
        whileLoop.setLineno(this.ts.lineno);
        this.enterLoop(whileLoop);
        try {
            Object object = this.condition();
            whileLoop.setCondition(((Parser$ConditionData)object).condition);
            whileLoop.setParens(((Parser$ConditionData)object).lp - n2, ((Parser$ConditionData)object).rp - n2);
            object = this.getNextStatementAfterInlineComments(whileLoop);
            whileLoop.setLength(Parser.getNodeEnd((AstNode)object) - n2);
            this.restoreRelativeLoopPosition(whileLoop);
            whileLoop.setBody((AstNode)object);
            return whileLoop;
        }
        finally {
            this.exitLoop();
        }
    }

    private WithStatement withStatement() {
        if (this.currentToken != 127) {
            this.codeBug();
        }
        this.consumeToken();
        Comment comment = this.getAndResetJsDoc();
        Object object = this.ts;
        int n2 = ((TokenStream)object).lineno;
        int n3 = ((TokenStream)object).tokenBeg;
        boolean bl = this.mustMatchToken(90, "msg.no.paren.with", true);
        int n4 = -1;
        int n5 = bl ? this.ts.tokenBeg : -1;
        AstNode astNode = this.expr(false);
        if (this.mustMatchToken(91, "msg.no.paren.after.with", true)) {
            n4 = this.ts.tokenBeg;
        }
        object = new WithStatement(n3);
        AstNode astNode2 = this.getNextStatementAfterInlineComments((AstNode)object);
        ((AstNode)object).setLength(Parser.getNodeEnd(astNode2) - n3);
        ((Node)object).setJsDocNode(comment);
        ((WithStatement)object).setExpression(astNode);
        ((WithStatement)object).setStatement(astNode2);
        ((WithStatement)object).setParens(n5, n4);
        ((Node)object).setLineno(n2);
        return object;
    }

    private XmlElemRef xmlElemRef(int n2, Name name, int n3) {
        Object object;
        int n4 = this.ts.tokenBeg;
        int n5 = -1;
        int n6 = n2 != -1 ? n2 : n4;
        AstNode astNode = this.expr(false);
        int n7 = Parser.getNodeEnd(astNode);
        if (this.mustMatchToken(87, "msg.no.bracket.index", true)) {
            object = this.ts;
            n5 = ((TokenStream)object).tokenBeg;
            n7 = ((TokenStream)object).tokenEnd;
        }
        object = new XmlElemRef(n6, n7 - n6);
        ((XmlRef)object).setNamespace(name);
        ((XmlRef)object).setColonPos(n3);
        ((XmlRef)object).setAtPos(n2);
        ((XmlElemRef)object).setExpression(astNode);
        ((XmlElemRef)object).setBrackets(n4, n5);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private AstNode xmlInitializer() {
        if (this.currentToken != 14) {
            this.codeBug();
        }
        Object object = this.ts;
        int n2 = ((TokenStream)object).tokenBeg;
        int n3 = ((TokenStream)object).getFirstXMLToken();
        if (n3 == 149 || n3 == 152) {
            XmlLiteral xmlLiteral = new XmlLiteral(n2);
            xmlLiteral.setLineno(this.ts.lineno);
            while (true) {
                if (n3 != 149) {
                    if (n3 != 152) break;
                    object = this.ts;
                    xmlLiteral.addFragment(new XmlString(((TokenStream)object).tokenBeg, ((TokenStream)object).getString()));
                    return xmlLiteral;
                }
                object = this.ts;
                xmlLiteral.addFragment(new XmlString(((TokenStream)object).tokenBeg, ((TokenStream)object).getString()));
                this.mustMatchToken(88, "msg.syntax", true);
                n3 = this.ts.tokenBeg;
                object = this.peekToken() == 89 ? new EmptyExpression(n3, this.ts.tokenEnd - n3) : this.expr(false);
                this.mustMatchToken(89, "msg.syntax", true);
                object = new XmlExpression(n3, (AstNode)object);
                ((XmlExpression)object).setIsXmlAttribute(this.ts.isXMLAttribute());
                ((AstNode)object).setLength(this.ts.tokenEnd - n3);
                xmlLiteral.addFragment((XmlFragment)object);
                n3 = this.ts.getNextXMLToken();
            }
        }
        this.reportError("msg.syntax");
        return this.makeErrorNode();
    }

    void addError(String string) {
        TokenStream tokenStream = this.ts;
        if (tokenStream == null) {
            this.addError(string, 0, 0);
        } else {
            int n2 = tokenStream.tokenBeg;
            this.addError(string, n2, tokenStream.tokenEnd - n2);
        }
    }

    void addError(String string, int n2) {
        this.addError(string, Character.toString((char)n2));
    }

    void addError(String string, int n2, int n3) {
        this.addError(string, null, n2, n3);
    }

    void addError(String string, String string2) {
        TokenStream tokenStream = this.ts;
        if (tokenStream == null) {
            this.addError(string, string2, 0, 0);
        } else {
            int n2 = tokenStream.tokenBeg;
            this.addError(string, string2, n2, tokenStream.tokenEnd - n2);
        }
    }

    void addError(String object, String string, int n2, int n3) {
        ++this.syntaxErrorCount;
        string = this.lookupMessage((String)object, string);
        object = this.errorCollector;
        if (object != null) {
            object.error(string, this.sourceURI, n2, n3);
        } else {
            object = this.ts;
            if (object != null) {
                n3 = ((TokenStream)object).getLineno();
                object = this.ts.getLine();
                n2 = this.ts.getOffset();
            } else {
                object = "";
                n3 = 1;
                n2 = 1;
            }
            this.errorReporter.error(string, this.sourceURI, n3, (String)object, n2);
        }
    }

    void addStrictWarning(String string, String string2) {
        int n2;
        TokenStream tokenStream = this.ts;
        int n3 = -1;
        if (tokenStream != null) {
            n3 = tokenStream.tokenBeg;
            n2 = tokenStream.tokenEnd - n3;
        } else {
            n2 = -1;
        }
        this.addStrictWarning(string, string2, n3, n2);
    }

    void addStrictWarning(String string, String string2, int n2, int n3) {
        if (this.compilerEnv.isStrictMode()) {
            this.addWarning(string, string2, n2, n3);
        }
    }

    void addWarning(String string, int n2, int n3) {
        this.addWarning(string, null, n2, n3);
    }

    void addWarning(String string, String string2) {
        int n2;
        TokenStream tokenStream = this.ts;
        int n3 = -1;
        if (tokenStream != null) {
            n3 = tokenStream.tokenBeg;
            n2 = tokenStream.tokenEnd - n3;
        } else {
            n2 = -1;
        }
        this.addWarning(string, string2, n3, n2);
    }

    void addWarning(String object, String object2, int n2, int n3) {
        String string = this.lookupMessage((String)object, (String)object2);
        if (this.compilerEnv.reportWarningAsError()) {
            this.addError((String)object, (String)object2, n2, n3);
        } else {
            object = this.errorCollector;
            if (object != null) {
                object.warning(string, this.sourceURI, n2, n3);
            } else {
                object = this.ts;
                object2 = this.errorReporter;
                String string2 = this.sourceURI;
                if (object != null) {
                    n2 = ((TokenStream)object).getLineno();
                    object = this.ts.getLine();
                    n3 = this.ts.getOffset();
                } else {
                    n2 = 1;
                    n3 = 1;
                    object = "";
                }
                object2.warning(string, string2, n2, (String)object, n3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void checkActivationName(String string, int n2) {
        boolean bl;
        block6: {
            block5: {
                if (!this.insideFunction()) {
                    return;
                }
                boolean bl2 = false;
                if ("arguments".equals(string) && ((FunctionNode)this.currentScriptOrFn).getFunctionType() != 4 || this.compilerEnv.getActivationNames() != null && this.compilerEnv.getActivationNames().contains(string)) break block5;
                bl = bl2;
                if (!"length".equals(string)) break block6;
                bl = bl2;
                if (n2 != 33) break block6;
                bl = bl2;
                if (this.compilerEnv.getLanguageVersion() != 120) break block6;
            }
            bl = true;
        }
        if (bl) {
            this.setRequiresActivation();
        }
    }

    protected void checkMutableReference(Node node) {
        if ((node.getIntProp(16, 0) & 4) != 0) {
            this.reportError("msg.bad.assign.left");
        }
    }

    Node createDestructuringAssignment(int n2, Node node, Node node2) {
        String string = this.currentScriptOrFn.getNextTempName();
        node = this.destructuringAssignmentHelper(n2, node, node2, string);
        node.getLastChild().addChildToBack(this.createName(string));
        return node;
    }

    protected Node createName(int n2, String object, Node node) {
        object = this.createName((String)object);
        ((Node)object).setType(n2);
        if (node != null) {
            ((Node)object).addChildToBack(node);
        }
        return object;
    }

    protected Node createName(String string) {
        this.checkActivationName(string, 39);
        return Node.newString(39, string);
    }

    protected Node createNumber(double d2) {
        return Node.newNumber(d2);
    }

    Parser$PerFunctionVariables createPerFunctionVariables(FunctionNode functionNode) {
        return new Parser$PerFunctionVariables(this, functionNode);
    }

    protected Scope createScopeNode(int n2, int n3) {
        Scope scope = new Scope();
        scope.setType(n2);
        scope.setLineno(n3);
        return scope;
    }

    void defineSymbol(int n2, String string) {
        this.defineSymbol(n2, string, false);
    }

    void defineSymbol(int n2, String string, boolean bl) {
        Scope scope;
        if (string == null) {
            if (this.compilerEnv.isIdeMode()) {
                return;
            }
            this.codeBug();
        }
        Object object = (scope = this.currentScope.getDefiningScope(string)) != null ? scope.getSymbol(string) : null;
        int n3 = object != null ? ((Symbol)object).getDeclType() : -1;
        String string2 = "msg.var.redecl";
        if (object != null && (n3 == 158 || n2 == 158 || scope == this.currentScope && n3 == 157)) {
            object = n3 == 158 ? "msg.const.redecl" : (n3 == 157 ? "msg.let.redecl" : (n3 == 126 ? string2 : (n3 == 113 ? "msg.fn.redecl" : "msg.parm.redecl")));
            this.addError((String)object, string);
            return;
        }
        if (n2 != 90) {
            if (n2 != 113 && n2 != 126) {
                if (n2 != 157) {
                    if (n2 != 158) {
                        throw this.codeBug();
                    }
                } else {
                    if (!bl && (this.currentScope.getType() == 116 || this.currentScope instanceof Loop)) {
                        this.addError("msg.let.decl.not.in.block");
                        return;
                    }
                    this.currentScope.putSymbol(new Symbol(n2, string));
                    return;
                }
            }
            if (object != null) {
                if (n3 == 126) {
                    this.addStrictWarning("msg.var.redecl", string);
                } else if (n3 == 90) {
                    this.addStrictWarning("msg.var.hides.arg", string);
                }
            } else {
                this.currentScriptOrFn.putSymbol(new Symbol(n2, string));
            }
            return;
        }
        if (object != null) {
            this.addWarning("msg.dup.parms", string);
        }
        this.currentScriptOrFn.putSymbol(new Symbol(n2, string));
    }

    boolean destructuringArray(ArrayLiteral object, int n2, String string, Node node, List<String> list) {
        int n3 = n2 == 158 ? 159 : 8;
        object = ((ArrayLiteral)object).getElements().iterator();
        boolean bl = true;
        int n4 = 0;
        while (object.hasNext()) {
            Object object2 = (AstNode)object.next();
            if (((Node)object2).getType() == 132) {
                ++n4;
                continue;
            }
            Node node2 = new Node(36, this.createName(string), this.createNumber(n4));
            if (((Node)object2).getType() == 39) {
                object2 = ((Node)object2).getString();
                node.addChildToBack(new Node(n3, this.createName(49, (String)object2, null), node2));
                if (n2 != -1) {
                    this.defineSymbol(n2, (String)object2, true);
                    list.add((String)object2);
                }
            } else {
                node.addChildToBack(this.destructuringAssignmentHelper(n2, (Node)object2, node2, this.currentScriptOrFn.getNextTempName()));
            }
            ++n4;
            bl = false;
        }
        return bl;
    }

    Node destructuringAssignmentHelper(int n2, Node node, Node iterable, String string) {
        Scope scope = this.createScopeNode(162, node.getLineno());
        scope.addChildToFront(new Node(157, this.createName(39, string, (Node)iterable)));
        try {
            this.pushScope(scope);
            boolean bl = true;
            this.defineSymbol(157, string, true);
            Node node2 = new Node(92);
            scope.addChildToBack(node2);
            iterable = new ArrayList();
            int n3 = node.getType();
            if (n3 != 33 && n3 != 36) {
                if (n3 != 66) {
                    if (n3 != 67) {
                        this.reportError("msg.bad.assign.left");
                    } else {
                        bl = this.destructuringObject((ObjectLiteral)node, n2, string, node2, (List<String>)iterable);
                    }
                } else {
                    bl = this.destructuringArray((ArrayLiteral)node, n2, string, node2, (List<String>)iterable);
                }
            } else {
                if (n2 == 126 || n2 == 157 || n2 == 158) {
                    this.reportError("msg.bad.assign.left");
                }
                node2.addChildToBack(this.simpleAssignment(node, this.createName(string)));
            }
            if (bl) {
                node2.addChildToBack(this.createNumber(0.0));
            }
            scope.putProp(22, iterable);
            return scope;
        }
        finally {
            this.popScope();
        }
    }

    boolean destructuringObject(ObjectLiteral object, int n2, String string, Node node, List<String> list) {
        int n3 = n2 == 158 ? 159 : 8;
        Iterator<ObjectProperty> iterator = ((ObjectLiteral)object).getElements().iterator();
        boolean bl = true;
        while (iterator.hasNext()) {
            block10: {
                int n4;
                Object object2;
                block8: {
                    block9: {
                        block7: {
                            object2 = iterator.next();
                            object = this.ts;
                            n4 = object != null ? ((TokenStream)object).lineno : 0;
                            object = ((InfixExpression)object2).getLeft();
                            if (!(object instanceof Name)) break block7;
                            object = Node.newString(((Name)object).getIdentifier());
                            object = new Node(33, this.createName(string), (Node)object);
                            break block8;
                        }
                        if (!(object instanceof StringLiteral)) break block9;
                        object = Node.newString(((StringLiteral)object).getValue());
                        object = new Node(33, this.createName(string), (Node)object);
                        break block8;
                    }
                    if (!(object instanceof NumberLiteral)) break block10;
                    object = this.createNumber((int)((NumberLiteral)object).getNumber());
                    object = new Node(36, this.createName(string), (Node)object);
                }
                ((Node)object).setLineno(n4);
                object2 = ((InfixExpression)object2).getRight();
                if (((Node)object2).getType() == 39) {
                    object2 = ((Name)object2).getIdentifier();
                    node.addChildToBack(new Node(n3, this.createName(49, (String)object2, null), (Node)object));
                    if (n2 != -1) {
                        this.defineSymbol(n2, (String)object2, true);
                        list.add((String)object2);
                    }
                } else {
                    node.addChildToBack(this.destructuringAssignmentHelper(n2, (Node)object2, (Node)object, this.currentScriptOrFn.getNextTempName()));
                }
                bl = false;
                continue;
            }
            throw this.codeBug();
        }
        return bl;
    }

    public boolean eof() {
        return this.ts.eof();
    }

    public boolean inUseStrictDirective() {
        return this.inUseStrictDirective;
    }

    boolean insideFunction() {
        boolean bl = this.nestingOfFunction != 0;
        return bl;
    }

    String lookupMessage(String string) {
        return this.lookupMessage(string, null);
    }

    String lookupMessage(String string, String string2) {
        string = string2 == null ? ScriptRuntime.getMessageById(string, new Object[0]) : ScriptRuntime.getMessageById(string, string2);
        return string;
    }

    void markDestructuring(AstNode astNode) {
        if (astNode instanceof DestructuringForm) {
            ((DestructuringForm)((Object)astNode)).setIsDestructuring(true);
        } else if (astNode instanceof ParenthesizedExpression) {
            this.markDestructuring(((ParenthesizedExpression)astNode).getExpression());
        }
    }

    @Deprecated
    public AstRoot parse(Reader object, String object2, int n2) {
        if (!this.parseFinished) {
            if (this.compilerEnv.isIdeMode()) {
                return this.parse(Kit.readReader((Reader)object), (String)object2, n2);
            }
            try {
                this.sourceURI = object2;
                this.ts = object2 = new TokenStream(this, (Reader)object, null, n2);
                object = this.parse();
                return object;
            }
            finally {
                this.parseFinished = true;
            }
        }
        throw new IllegalStateException("parser reused");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AstRoot parse(String object, String string, int n2) {
        Throwable throwable2222222;
        if (this.parseFinished) {
            throw new IllegalStateException("parser reused");
        }
        this.sourceURI = string;
        if (this.compilerEnv.isIdeMode()) {
            this.sourceChars = ((String)object).toCharArray();
        }
        this.ts = new TokenStream(this, null, (String)object, n2);
        object = this.parse();
        this.parseFinished = true;
        return object;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            {
                IllegalStateException illegalStateException = new IllegalStateException();
                throw illegalStateException;
            }
        }
        this.parseFinished = true;
        throw throwable2222222;
    }

    void popScope() {
        this.currentScope = this.currentScope.getParentScope();
    }

    void pushScope(Scope scope) {
        Scope scope2 = scope.getParentScope();
        if (scope2 != null) {
            if (scope2 != this.currentScope) {
                this.codeBug();
            }
        } else {
            this.currentScope.addChildScope(scope);
        }
        this.currentScope = scope;
    }

    protected AstNode removeParens(AstNode astNode) {
        while (astNode instanceof ParenthesizedExpression) {
            astNode = ((ParenthesizedExpression)astNode).getExpression();
        }
        return astNode;
    }

    void reportError(String string) {
        this.reportError(string, null);
    }

    void reportError(String string, int n2, int n3) {
        this.reportError(string, null, n2, n3);
    }

    void reportError(String string, String string2) {
        TokenStream tokenStream = this.ts;
        if (tokenStream == null) {
            this.reportError(string, string2, 1, 1);
        } else {
            int n2 = tokenStream.tokenBeg;
            this.reportError(string, string2, n2, tokenStream.tokenEnd - n2);
        }
    }

    void reportError(String string, String string2, int n2, int n3) {
        this.addError(string, string2, n2, n3);
        if (this.compilerEnv.recoverFromErrors()) {
            return;
        }
        throw new Parser$ParserException(null);
    }

    public void setDefaultUseStrictDirective(boolean bl) {
        this.defaultUseStrictDirective = bl;
    }

    protected void setIsGenerator() {
        if (this.insideFunction()) {
            ((FunctionNode)this.currentScriptOrFn).setIsGenerator();
        }
    }

    protected void setRequiresActivation() {
        if (this.insideFunction()) {
            ((FunctionNode)this.currentScriptOrFn).setRequiresActivation();
        }
    }

    protected Node simpleAssignment(Node node, Node node2) {
        Node node3;
        int n2 = node.getType();
        if (n2 != 33 && n2 != 36) {
            if (n2 != 39) {
                if (n2 == 68) {
                    node = node.getFirstChild();
                    this.checkMutableReference(node);
                    return new Node(69, node, node2);
                }
                throw this.codeBug();
            }
            String string = ((Name)node).getIdentifier();
            if (this.inUseStrictDirective && ("eval".equals(string) || "arguments".equals(string))) {
                this.reportError("msg.bad.id.strict", string);
            }
            node.setType(49);
            return new Node(8, node, node2);
        }
        if (node instanceof PropertyGet) {
            node3 = (PropertyGet)node;
            node = ((PropertyGet)node3).getTarget();
            node3 = ((PropertyGet)node3).getProperty();
        } else if (node instanceof ElementGet) {
            node3 = (ElementGet)node;
            node = ((ElementGet)node3).getTarget();
            node3 = ((ElementGet)node3).getElement();
        } else {
            Node node4 = node.getFirstChild();
            node3 = node.getLastChild();
            node = node4;
        }
        if (n2 == 33) {
            n2 = 35;
            node3.setType(41);
        } else {
            n2 = 37;
        }
        return new Node(n2, node, node3, node2);
    }
}

