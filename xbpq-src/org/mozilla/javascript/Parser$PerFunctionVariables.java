/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.LabeledStatement;
import org.mozilla.javascript.ast.Loop;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;

public class Parser$PerFunctionVariables {
    private Scope savedCurrentScope;
    private ScriptNode savedCurrentScriptOrFn;
    private int savedEndFlags;
    private boolean savedInForInit;
    private Map<String, LabeledStatement> savedLabelSet;
    private List<Jump> savedLoopAndSwitchSet;
    private List<Loop> savedLoopSet;
    final Parser this$0;

    Parser$PerFunctionVariables(Parser parser, FunctionNode functionNode) {
        this.this$0 = parser;
        this.savedCurrentScriptOrFn = parser.currentScriptOrFn;
        parser.currentScriptOrFn = functionNode;
        this.savedCurrentScope = parser.currentScope;
        parser.currentScope = functionNode;
        this.savedLabelSet = Parser.access$200(parser);
        Parser.access$202(parser, null);
        this.savedLoopSet = Parser.access$300(parser);
        Parser.access$302(parser, null);
        this.savedLoopAndSwitchSet = Parser.access$400(parser);
        Parser.access$402(parser, null);
        this.savedEndFlags = Parser.access$500(parser);
        Parser.access$502(parser, 0);
        this.savedInForInit = Parser.access$600(parser);
        Parser.access$602(parser, false);
    }

    void restore() {
        Parser parser = this.this$0;
        parser.currentScriptOrFn = this.savedCurrentScriptOrFn;
        parser.currentScope = this.savedCurrentScope;
        Parser.access$202(parser, this.savedLabelSet);
        Parser.access$302(this.this$0, this.savedLoopSet);
        Parser.access$402(this.this$0, this.savedLoopAndSwitchSet);
        Parser.access$502(this.this$0, this.savedEndFlags);
        Parser.access$602(this.this$0, this.savedInForInit);
    }
}

