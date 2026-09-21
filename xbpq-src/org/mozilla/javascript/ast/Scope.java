/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.Symbol;

public class Scope
extends Jump {
    private List<Scope> childScopes;
    protected Scope parentScope;
    protected Map<String, Symbol> symbolTable;
    protected ScriptNode top;

    public Scope() {
        this.type = 133;
    }

    public Scope(int n2) {
        this.type = 133;
        this.position = n2;
    }

    public Scope(int n2, int n3) {
        this(n2);
        this.length = n3;
    }

    private Map<String, Symbol> ensureSymbolTable() {
        if (this.symbolTable == null) {
            this.symbolTable = new LinkedHashMap<String, Symbol>(5);
        }
        return this.symbolTable;
    }

    public static void joinScopes(Scope object, Scope scope) {
        Map<String, Symbol> object22 = super.ensureSymbolTable();
        object = scope.ensureSymbolTable();
        if (!Collections.disjoint(object22.keySet(), object.keySet())) {
            AstNode.codeBug();
        }
        for (Map.Entry<String, Symbol> entry : object22.entrySet()) {
            Symbol symbol = entry.getValue();
            symbol.setContainingTable(scope);
            object.put(entry.getKey(), symbol);
        }
    }

    public static Scope splitScope(Scope scope) {
        Scope scope2 = new Scope(scope.getType());
        scope2.symbolTable = scope.symbolTable;
        scope.symbolTable = null;
        scope2.parent = scope.parent;
        scope2.setParentScope(scope.getParentScope());
        scope2.setParentScope(scope2);
        scope.parent = scope2;
        scope2.top = scope.top;
        return scope2;
    }

    public void addChildScope(Scope scope) {
        if (this.childScopes == null) {
            this.childScopes = new ArrayList<Scope>();
        }
        this.childScopes.add(scope);
        scope.setParentScope(this);
    }

    public void clearParentScope() {
        this.parentScope = null;
    }

    public List<Scope> getChildScopes() {
        return this.childScopes;
    }

    public Scope getDefiningScope(String string) {
        Scope scope = this;
        while (scope != null) {
            Map<String, Symbol> map = scope.getSymbolTable();
            if (map != null && map.containsKey(string)) {
                return scope;
            }
            scope = scope.parentScope;
        }
        return null;
    }

    public Scope getParentScope() {
        return this.parentScope;
    }

    public List<AstNode> getStatements() {
        ArrayList<AstNode> arrayList = new ArrayList<AstNode>();
        for (Node node = this.getFirstChild(); node != null; node = node.getNext()) {
            arrayList.add((AstNode)node);
        }
        return arrayList;
    }

    public Symbol getSymbol(String object) {
        Map<String, Symbol> map = this.symbolTable;
        object = map == null ? null : map.get(object);
        return object;
    }

    public Map<String, Symbol> getSymbolTable() {
        return this.symbolTable;
    }

    public ScriptNode getTop() {
        return this.top;
    }

    public void putSymbol(Symbol symbol) {
        if (symbol.getName() != null) {
            this.ensureSymbolTable();
            this.symbolTable.put(symbol.getName(), symbol);
            symbol.setContainingTable(this);
            this.top.addSymbol(symbol);
            return;
        }
        throw new IllegalArgumentException("null symbol name");
    }

    public void replaceWith(Scope scope) {
        Object object = this.childScopes;
        if (object != null) {
            object = object.iterator();
            while (object.hasNext()) {
                scope.addChildScope((Scope)object.next());
            }
            this.childScopes.clear();
            this.childScopes = null;
        }
        if ((object = this.symbolTable) != null && !object.isEmpty()) {
            Scope.joinScopes(this, scope);
        }
    }

    public void setParentScope(Scope scope) {
        this.parentScope = scope;
        scope = scope == null ? (ScriptNode)this : scope.top;
        this.top = scope;
    }

    public void setSymbolTable(Map<String, Symbol> map) {
        this.symbolTable = map;
    }

    public void setTop(ScriptNode scriptNode) {
        this.top = scriptNode;
    }

    @Override
    public String toSource(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("{\n");
        for (AstNode astNode : this) {
            stringBuilder.append(astNode.toSource(n2 + 1));
            if (astNode.getType() != 165) continue;
            stringBuilder.append("\n");
        }
        stringBuilder.append(this.makeIndent(n2));
        stringBuilder.append("}\n");
        return stringBuilder.toString();
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

