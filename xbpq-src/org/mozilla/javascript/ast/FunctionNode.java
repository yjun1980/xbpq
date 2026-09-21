/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.FunctionNode$Form;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.ScriptNode;

public class FunctionNode
extends ScriptNode {
    public static final int ARROW_FUNCTION = 4;
    public static final int FUNCTION_EXPRESSION = 2;
    public static final int FUNCTION_EXPRESSION_STATEMENT = 3;
    public static final int FUNCTION_STATEMENT = 1;
    private static final List<AstNode> NO_PARAMS = Collections.unmodifiableList(new ArrayList());
    private AstNode body;
    private FunctionNode$Form functionForm = FunctionNode$Form.FUNCTION;
    private Name functionName;
    private int functionType;
    private List<Node> generatorResumePoints;
    private boolean hasRestParameter;
    private boolean isES6Generator;
    private boolean isExpressionClosure;
    private boolean isGenerator;
    private Map<Node, int[]> liveLocals;
    private int lp = -1;
    private AstNode memberExprNode;
    private boolean needsActivation;
    private List<AstNode> params;
    private int rp = -1;

    public FunctionNode() {
        this.type = 113;
    }

    public FunctionNode(int n2) {
        super(n2);
        this.type = 113;
    }

    public FunctionNode(int n2, Name name) {
        super(n2);
        this.type = 113;
        this.setFunctionName(name);
    }

    @Override
    public int addFunction(FunctionNode functionNode) {
        int n2 = super.addFunction(functionNode);
        if (this.getFunctionCount() > 0) {
            this.needsActivation = true;
        }
        return n2;
    }

    public void addLiveLocals(Node node, int[] nArray) {
        if (this.liveLocals == null) {
            this.liveLocals = new HashMap<Node, int[]>();
        }
        this.liveLocals.put(node, nArray);
    }

    public void addParam(AstNode astNode) {
        this.assertNotNull(astNode);
        if (this.params == null) {
            this.params = new ArrayList<AstNode>();
        }
        this.params.add(astNode);
        astNode.setParent(this);
    }

    public void addResumptionPoint(Node node) {
        if (this.generatorResumePoints == null) {
            this.generatorResumePoints = new ArrayList<Node>();
        }
        this.generatorResumePoints.add(node);
    }

    public AstNode getBody() {
        return this.body;
    }

    public Name getFunctionName() {
        return this.functionName;
    }

    public int getFunctionType() {
        return this.functionType;
    }

    public Map<Node, int[]> getLiveLocals() {
        return this.liveLocals;
    }

    public int getLp() {
        return this.lp;
    }

    public AstNode getMemberExprNode() {
        return this.memberExprNode;
    }

    public String getName() {
        Object object = this.functionName;
        object = object != null ? ((Name)object).getIdentifier() : "";
        return object;
    }

    public List<AstNode> getParams() {
        List<AstNode> list = this.params;
        if (list == null) {
            list = NO_PARAMS;
        }
        return list;
    }

    public List<Node> getResumptionPoints() {
        return this.generatorResumePoints;
    }

    public int getRp() {
        return this.rp;
    }

    @Override
    public boolean hasRestParameter() {
        return this.hasRestParameter;
    }

    public boolean isES6Generator() {
        return this.isES6Generator;
    }

    public boolean isExpressionClosure() {
        return this.isExpressionClosure;
    }

    public boolean isGenerator() {
        return this.isGenerator;
    }

    public boolean isGetterMethod() {
        boolean bl = this.functionForm == FunctionNode$Form.GETTER;
        return bl;
    }

    public boolean isMethod() {
        FunctionNode$Form functionNode$Form = this.functionForm;
        boolean bl = functionNode$Form == FunctionNode$Form.GETTER || functionNode$Form == FunctionNode$Form.SETTER || functionNode$Form == FunctionNode$Form.METHOD;
        return bl;
    }

    public boolean isNormalMethod() {
        boolean bl = this.functionForm == FunctionNode$Form.METHOD;
        return bl;
    }

    public boolean isParam(AstNode astNode) {
        List<AstNode> list = this.params;
        boolean bl = list == null ? false : list.contains(astNode);
        return bl;
    }

    public boolean isSetterMethod() {
        boolean bl = this.functionForm == FunctionNode$Form.SETTER;
        return bl;
    }

    public boolean requiresActivation() {
        return this.needsActivation;
    }

    public void setBody(AstNode astNode) {
        this.assertNotNull(astNode);
        this.body = astNode;
        if (Boolean.TRUE.equals(astNode.getProp(25))) {
            this.setIsExpressionClosure(true);
        }
        int n2 = astNode.getPosition();
        n2 = astNode.getLength() + n2;
        astNode.setParent(this);
        this.setLength(n2 - this.position);
        this.setEncodedSourceBounds(this.position, n2);
    }

    public void setFunctionIsGetterMethod() {
        this.functionForm = FunctionNode$Form.GETTER;
    }

    public void setFunctionIsNormalMethod() {
        this.functionForm = FunctionNode$Form.METHOD;
    }

    public void setFunctionIsSetterMethod() {
        this.functionForm = FunctionNode$Form.SETTER;
    }

    public void setFunctionName(Name name) {
        this.functionName = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public void setFunctionType(int n2) {
        this.functionType = n2;
    }

    public void setHasRestParameter(boolean bl) {
        this.hasRestParameter = bl;
    }

    public void setIsES6Generator() {
        this.isES6Generator = true;
        this.isGenerator = true;
    }

    public void setIsExpressionClosure(boolean bl) {
        this.isExpressionClosure = bl;
    }

    public void setIsGenerator() {
        this.isGenerator = true;
    }

    public void setLp(int n2) {
        this.lp = n2;
    }

    public void setMemberExprNode(AstNode astNode) {
        this.memberExprNode = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setParams(List<AstNode> object) {
        if (object == null) {
            this.params = null;
        } else {
            List<AstNode> list = this.params;
            if (list != null) {
                list.clear();
            }
            object = object.iterator();
            while (object.hasNext()) {
                this.addParam((AstNode)object.next());
            }
        }
    }

    public void setParens(int n2, int n3) {
        this.lp = n2;
        this.rp = n3;
    }

    public void setRequiresActivation() {
        this.needsActivation = true;
    }

    public void setRp(int n2) {
        this.rp = n2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String toSource(int var1_1) {
        block13: {
            block14: {
                block11: {
                    block12: {
                        var4_2 = new StringBuilder();
                        var2_3 = this.functionType == 4;
                        if (!this.isMethod()) {
                            var4_2.append(this.makeIndent(var1_1));
                            if (!var2_3) {
                                var4_2.append("function");
                            }
                        }
                        if (this.functionName != null) {
                            var4_2.append(" ");
                            var4_2.append(this.functionName.toSource(0));
                        }
                        if ((var3_4 = this.params) == null) {
                            var3_4 = "() ";
lbl16:
                            // 2 sources

                            while (true) {
                                var4_2.append((String)var3_4);
                                break;
                            }
                        } else if (var2_3 && this.lp == -1) {
                            this.printList(var3_4, var4_2);
                            var4_2.append(" ");
                        } else {
                            var4_2.append("(");
                            this.printList(this.params, var4_2);
                            if (this.getIntProp(29, 0) == 1) {
                                var4_2.append(", ");
                            }
                            var3_4 = ") ";
                            ** continue;
                        }
                        if (var2_3) {
                            var4_2.append("=> ");
                        }
                        if (!this.isExpressionClosure) break block11;
                        var3_4 = this.getBody();
                        if (!(var3_4.getLastChild() instanceof ReturnStatement)) break block12;
                        var4_2.append(((ReturnStatement)var3_4.getLastChild()).getReturnValue().toSource(0));
                        if (this.functionType != 1) break block13;
                        var3_4 = ";";
                        break block14;
                    }
                    var4_2.append(" ");
                    var3_4 = var3_4.toSource(0);
                    break block14;
                }
                var3_4 = this.getBody().toSource(var1_1).trim();
            }
            var4_2.append((String)var3_4);
        }
        if (this.functionType == 1 || this.isMethod()) {
            var4_2.append("\n");
        }
        return var4_2.toString();
    }

    @Override
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Object object = this.functionName;
            if (object != null) {
                ((Name)object).visit(nodeVisitor);
            }
            object = this.getParams().iterator();
            while (object.hasNext()) {
                ((AstNode)object.next()).visit(nodeVisitor);
            }
            this.getBody().visit(nodeVisitor);
            if (!this.isExpressionClosure && (object = this.memberExprNode) != null) {
                ((AstNode)object).visit(nodeVisitor);
            }
        }
    }
}

