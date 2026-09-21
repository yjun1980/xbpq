/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import com.github.catvod.spider.merge.C.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.RegExpLiteral;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.Symbol;
import org.mozilla.javascript.ast.TemplateCharacters;
import org.mozilla.javascript.ast.TemplateLiteral;

public class ScriptNode
extends Scope {
    private List<FunctionNode> EMPTY_LIST = Collections.emptyList();
    private Object compilerData;
    private String encodedSource;
    private int encodedSourceEnd = -1;
    private int encodedSourceStart = -1;
    private int endLineno = -1;
    private List<FunctionNode> functions;
    private boolean inStrictMode;
    private boolean[] isConsts;
    private int paramCount = 0;
    private List<RegExpLiteral> regexps;
    private String sourceName;
    private List<Symbol> symbols = new ArrayList<Symbol>(4);
    private int tempNumber = 0;
    private List<TemplateLiteral> templateLiterals;
    private String[] variableNames;

    public ScriptNode() {
        this.top = this;
        this.type = 140;
    }

    public ScriptNode(int n2) {
        super(n2);
        this.top = this;
        this.type = 140;
    }

    public int addFunction(FunctionNode functionNode) {
        if (functionNode == null) {
            AstNode.codeBug();
        }
        if (this.functions == null) {
            this.functions = new ArrayList<FunctionNode>();
        }
        this.functions.add(functionNode);
        return this.functions.size() - 1;
    }

    public void addRegExp(RegExpLiteral regExpLiteral) {
        if (regExpLiteral == null) {
            AstNode.codeBug();
        }
        if (this.regexps == null) {
            this.regexps = new ArrayList<RegExpLiteral>();
        }
        this.regexps.add(regExpLiteral);
        regExpLiteral.putIntProp(4, this.regexps.size() - 1);
    }

    void addSymbol(Symbol symbol) {
        if (this.variableNames != null) {
            AstNode.codeBug();
        }
        if (symbol.getDeclType() == 90) {
            ++this.paramCount;
        }
        this.symbols.add(symbol);
    }

    public void addTemplateLiteral(TemplateLiteral templateLiteral) {
        if (templateLiteral == null) {
            AstNode.codeBug();
        }
        if (this.templateLiterals == null) {
            this.templateLiterals = new ArrayList<TemplateLiteral>();
        }
        this.templateLiterals.add(templateLiteral);
        templateLiteral.putIntProp(28, this.templateLiterals.size() - 1);
    }

    public void flattenSymbolTable(boolean bl) {
        Object object;
        if (!bl) {
            object = new ArrayList<Symbol>();
            if (this.symbolTable != null) {
                for (Symbol object2 : this.symbols) {
                    if (object2.getContainingTable() != this) continue;
                    ((ArrayList)object).add((Symbol)object2);
                }
            }
            this.symbols = object;
        }
        this.variableNames = new String[this.symbols.size()];
        this.isConsts = new boolean[this.symbols.size()];
        for (int i2 = 0; i2 < this.symbols.size(); ++i2) {
            object = this.symbols.get(i2);
            this.variableNames[i2] = ((Symbol)object).getName();
            boolean[] blArray = this.isConsts;
            bl = ((Symbol)object).getDeclType() == 158;
            blArray[i2] = bl;
            ((Symbol)object).setIndex(i2);
        }
    }

    public int getBaseLineno() {
        return this.lineno;
    }

    public Object getCompilerData() {
        return this.compilerData;
    }

    public String getEncodedSource() {
        return this.encodedSource;
    }

    public int getEncodedSourceEnd() {
        return this.encodedSourceEnd;
    }

    public int getEncodedSourceStart() {
        return this.encodedSourceStart;
    }

    public int getEndLineno() {
        return this.endLineno;
    }

    public int getFunctionCount() {
        List<FunctionNode> list = this.functions;
        int n2 = list == null ? 0 : list.size();
        return n2;
    }

    public FunctionNode getFunctionNode(int n2) {
        return this.functions.get(n2);
    }

    public List<FunctionNode> getFunctions() {
        List<FunctionNode> list;
        List<FunctionNode> list2 = list = this.functions;
        if (list == null) {
            list2 = this.EMPTY_LIST;
        }
        return list2;
    }

    public int getIndexForNameNode(Node node) {
        Symbol symbol;
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        Scope scope = node.getScope();
        Symbol symbol2 = symbol = null;
        if (scope != null) {
            symbol2 = symbol;
            if (node instanceof Name) {
                symbol2 = scope.getSymbol(((Name)node).getIdentifier());
            }
        }
        int n2 = symbol2 == null ? -1 : symbol2.getIndex();
        return n2;
    }

    public String getNextTempName() {
        StringBuilder stringBuilder = a.c("$");
        int n2 = this.tempNumber;
        this.tempNumber = n2 + 1;
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    public boolean[] getParamAndVarConst() {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        return this.isConsts;
    }

    public int getParamAndVarCount() {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        return this.symbols.size();
    }

    public String[] getParamAndVarNames() {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        return this.variableNames;
    }

    public int getParamCount() {
        return this.paramCount;
    }

    public String getParamOrVarName(int n2) {
        if (this.variableNames == null) {
            AstNode.codeBug();
        }
        return this.variableNames[n2];
    }

    public int getRegexpCount() {
        List<RegExpLiteral> list = this.regexps;
        int n2 = list == null ? 0 : list.size();
        return n2;
    }

    public String getRegexpFlags(int n2) {
        return this.regexps.get(n2).getFlags();
    }

    public String getRegexpString(int n2) {
        return this.regexps.get(n2).getValue();
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public List<Symbol> getSymbols() {
        return this.symbols;
    }

    public int getTemplateLiteralCount() {
        List<TemplateLiteral> list = this.templateLiterals;
        int n2 = list == null ? 0 : list.size();
        return n2;
    }

    public List<TemplateCharacters> getTemplateLiteralStrings(int n2) {
        return this.templateLiterals.get(n2).getTemplateStrings();
    }

    public boolean hasRestParameter() {
        return false;
    }

    public boolean isInStrictMode() {
        return this.inStrictMode;
    }

    public void setBaseLineno(int n2) {
        if (n2 < 0 || this.lineno >= 0) {
            AstNode.codeBug();
        }
        this.lineno = n2;
    }

    public void setCompilerData(Object object) {
        this.assertNotNull(object);
        if (this.compilerData == null) {
            this.compilerData = object;
            return;
        }
        throw new IllegalStateException();
    }

    public void setEncodedSource(String string) {
        this.encodedSource = string;
    }

    public void setEncodedSourceBounds(int n2, int n3) {
        this.encodedSourceStart = n2;
        this.encodedSourceEnd = n3;
    }

    public void setEncodedSourceEnd(int n2) {
        this.encodedSourceEnd = n2;
    }

    public void setEncodedSourceStart(int n2) {
        this.encodedSourceStart = n2;
    }

    public void setEndLineno(int n2) {
        if (n2 < 0 || this.endLineno >= 0) {
            AstNode.codeBug();
        }
        this.endLineno = n2;
    }

    public void setInStrictMode(boolean bl) {
        this.inStrictMode = bl;
    }

    public void setSourceName(String string) {
        this.sourceName = string;
    }

    public void setSymbols(List<Symbol> list) {
        this.symbols = list;
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<Node> iterator = this.iterator();
            while (iterator.hasNext()) {
                ((AstNode)iterator.next()).visit(nodeVisitor);
            }
        }
    }
}

