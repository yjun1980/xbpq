/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.optimizer.BodyCodegen$ExceptionManager;
import org.mozilla.javascript.optimizer.BodyCodegen$FinallyReturnPoint;
import org.mozilla.javascript.optimizer.Codegen;
import org.mozilla.javascript.optimizer.OptFunctionNode;
import org.mozilla.javascript.optimizer.OptRuntime;

class BodyCodegen {
    static final boolean $assertionsDisabled = false;
    private static final int ECMAERROR_EXCEPTION = 2;
    private static final int EVALUATOR_EXCEPTION = 1;
    private static final int EXCEPTION_MAX = 5;
    private static final int FINALLY_EXCEPTION = 4;
    static final int GENERATOR_START = 0;
    static final int GENERATOR_TERMINATE = -1;
    static final int GENERATOR_YIELD_START = 1;
    private static final int JAVASCRIPT_EXCEPTION = 0;
    private static final int MAX_LOCALS = 1024;
    private static final int THROWABLE_EXCEPTION = 3;
    private short argsLocal;
    ClassFileWriter cfw;
    Codegen codegen;
    CompilerEnvirons compilerEnv;
    private short contextLocal;
    private int enterAreaStartLabel;
    private int epilogueLabel;
    private BodyCodegen$ExceptionManager exceptionManager = new BodyCodegen$ExceptionManager(this);
    private Map<Node, BodyCodegen$FinallyReturnPoint> finallys;
    private short firstFreeLocal;
    private OptFunctionNode fnCurrent;
    private short funObjLocal;
    private short generatorStateLocal;
    private int generatorSwitch;
    private boolean hasVarsInRegs;
    private boolean inDirectCallFunction;
    private boolean inLocalBlock;
    private boolean isGenerator;
    private boolean itsForcedObjectParameters;
    private int itsLineNumber;
    private short itsOneArgArray;
    private short itsZeroArgArray;
    private List<Node> literals;
    private int[] locals;
    private short localsMax;
    private int maxLocals = 0;
    private int maxStack = 0;
    private short operationLocal;
    private short popvLocal;
    private int savedCodeOffset;
    ScriptNode scriptOrFn;
    public int scriptOrFnIndex;
    private short thisObjLocal;
    private int unnestedYieldCount = 0;
    private IdentityHashMap<Node, String> unnestedYields = new IdentityHashMap();
    private short[] varRegisters;
    private short variableObjectLocal;

    BodyCodegen() {
    }

    static /* synthetic */ Node access$000(Node node) {
        return BodyCodegen.getFinallyAtTarget(node);
    }

    static /* synthetic */ String access$100(int n2) {
        return BodyCodegen.exceptionTypeToName(n2);
    }

    private void addDoubleWrap() {
        this.addOptRuntimeInvoke("wrapDouble", "(D)Ljava/lang/Double;");
    }

    private void addGoto(Node node, int n2) {
        int n3 = this.getTargetLabel(node);
        this.cfw.add(n2, n3);
    }

    private void addGotoWithReturn(Node node) {
        BodyCodegen$FinallyReturnPoint bodyCodegen$FinallyReturnPoint = this.finallys.get(node);
        this.cfw.addLoadConstant(bodyCodegen$FinallyReturnPoint.jsrPoints.size());
        this.addGoto(node, 167);
        this.cfw.add(87);
        int n2 = this.cfw.acquireLabel();
        this.cfw.markLabel(n2);
        bodyCodegen$FinallyReturnPoint.jsrPoints.add(n2);
    }

    private void addInstructionCount() {
        this.addInstructionCount(Math.max(this.cfw.getCurrentCodeOffset() - this.savedCodeOffset, 1));
    }

    private void addInstructionCount(int n2) {
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addPush(n2);
        this.addScriptRuntimeInvoke("addInstructionCount", "(Lorg/mozilla/javascript/Context;I)V");
    }

    private void addJumpedBooleanWrap(int n2, int n3) {
        this.cfw.markLabel(n3);
        n3 = this.cfw.acquireLabel();
        this.cfw.add(178, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
        this.cfw.add(167, n3);
        this.cfw.markLabel(n2);
        this.cfw.add(178, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
        this.cfw.markLabel(n3);
        this.cfw.adjustStackTop(-1);
    }

    private void addLoadPropertyIds(Object[] objectArray, int n2) {
        this.addNewObjectArray(n2);
        for (int i2 = 0; i2 != n2; ++i2) {
            this.cfw.add(89);
            this.cfw.addPush(i2);
            Object object = objectArray[i2];
            if (object instanceof String) {
                this.cfw.addPush((String)object);
            } else {
                this.cfw.addPush((Integer)object);
                this.addScriptRuntimeInvoke("wrapInt", "(I)Ljava/lang/Integer;");
            }
            this.cfw.add(83);
        }
    }

    private void addLoadPropertyValues(Node node, Node node2, int n2) {
        int n3;
        boolean bl = this.isGenerator;
        int n4 = 0;
        if (bl) {
            for (n3 = 0; n3 != n2; ++n3) {
                int n5 = node2.getType();
                if (n5 != 155 && n5 != 156 && n5 != 167) {
                    this.generateExpression(node2, node);
                } else {
                    this.generateExpression(node2.getFirstChild(), node);
                }
                node2 = node2.getNext();
            }
            this.addNewObjectArray(n2);
            for (n3 = n4; n3 != n2; ++n3) {
                this.cfw.add(90);
                this.cfw.add(95);
                this.cfw.addPush(n2 - n3 - 1);
                this.cfw.add(95);
                this.cfw.add(83);
            }
        } else {
            this.addNewObjectArray(n2);
            for (n3 = 0; n3 != n2; ++n3) {
                this.cfw.add(89);
                this.cfw.addPush(n3);
                n4 = node2.getType();
                if (n4 != 155 && n4 != 156 && n4 != 167) {
                    this.generateExpression(node2, node);
                } else {
                    this.generateExpression(node2.getFirstChild(), node);
                }
                this.cfw.add(83);
                node2 = node2.getNext();
            }
        }
    }

    private void addNewObjectArray(int n2) {
        if (n2 == 0) {
            n2 = this.itsZeroArgArray;
            if (n2 >= 0) {
                this.cfw.addALoad(n2);
            } else {
                this.cfw.add(178, "org/mozilla/javascript/ScriptRuntime", "emptyArgs", "[Ljava/lang/Object;");
            }
        } else {
            this.cfw.addPush(n2);
            this.cfw.add(189, "java/lang/Object");
        }
    }

    private void addObjectToDouble() {
        this.addScriptRuntimeInvoke("toNumber", "(Ljava/lang/Object;)D");
    }

    private void addObjectToNumeric() {
        this.addScriptRuntimeInvoke("toNumeric", "(Ljava/lang/Object;)Ljava/lang/Number;");
    }

    private void addOptRuntimeInvoke(String string, String string2) {
        this.cfw.addInvoke(184, "org/mozilla/javascript/optimizer/OptRuntime", string, string2);
    }

    private void addScriptRuntimeInvoke(String string, String string2) {
        this.cfw.addInvoke(184, "org.mozilla.javascript.ScriptRuntime", string, string2);
    }

    private void dcpLoadAsNumber(int n2) {
        this.cfw.addALoad(n2);
        this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
        int n3 = this.cfw.acquireLabel();
        this.cfw.add(165, n3);
        short s2 = this.cfw.getStackTop();
        this.cfw.addALoad(n2);
        this.addObjectToDouble();
        int n4 = this.cfw.acquireLabel();
        this.cfw.add(167, n4);
        this.cfw.markLabel(n3, s2);
        this.cfw.addDLoad(n2 + 1);
        this.cfw.markLabel(n4);
    }

    private void dcpLoadAsObject(int n2) {
        this.cfw.addALoad(n2);
        this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
        int n3 = this.cfw.acquireLabel();
        this.cfw.add(165, n3);
        short s2 = this.cfw.getStackTop();
        this.cfw.addALoad(n2);
        int n4 = this.cfw.acquireLabel();
        this.cfw.add(167, n4);
        this.cfw.markLabel(n3, s2);
        this.cfw.addDLoad(n2 + 1);
        this.addDoubleWrap();
        this.cfw.markLabel(n4);
    }

    private void decReferenceWordLocal(short s2) {
        int[] nArray = this.locals;
        nArray[s2] = nArray[s2] - 1;
    }

    private static String exceptionTypeToName(int n2) {
        if (n2 == 0) {
            return "org/mozilla/javascript/JavaScriptException";
        }
        if (n2 == 1) {
            return "org/mozilla/javascript/EvaluatorException";
        }
        if (n2 == 2) {
            return "org/mozilla/javascript/EcmaError";
        }
        if (n2 == 3) {
            return "java/lang/Throwable";
        }
        if (n2 == 4) {
            return null;
        }
        throw Kit.codeBug();
    }

    private Node findNestedYield(Node node) {
        for (node = node.getFirstChild(); node != null; node = node.getNext()) {
            if (node.getType() != 73 && node.getType() != 169) {
                Node node2 = this.findNestedYield(node);
                if (node2 == null) continue;
                return node2;
            }
            return node;
        }
        return null;
    }

    private void genSimpleCompare(int n2, int n3, int n4) {
        if (n3 != -1) {
            ClassFileWriter classFileWriter;
            switch (n2) {
                default: {
                    throw Codegen.badTree();
                }
                case 17: {
                    this.cfw.add(151);
                    classFileWriter = this.cfw;
                    n2 = 156;
                    break;
                }
                case 16: {
                    this.cfw.add(151);
                    classFileWriter = this.cfw;
                    n2 = 157;
                    break;
                }
                case 15: {
                    this.cfw.add(152);
                    classFileWriter = this.cfw;
                    n2 = 158;
                    break;
                }
                case 14: {
                    this.cfw.add(152);
                    classFileWriter = this.cfw;
                    n2 = 155;
                }
            }
            classFileWriter.add(n2, n3);
            if (n4 != -1) {
                this.cfw.add(167, n4);
            }
            return;
        }
        throw Codegen.badTree();
    }

    private void generateActivationExit() {
        if (this.fnCurrent != null && !this.hasVarsInRegs) {
            this.cfw.addALoad(this.contextLocal);
            this.addScriptRuntimeInvoke("exitActivationFunction", "(Lorg/mozilla/javascript/Context;)V");
            return;
        }
        throw Kit.codeBug();
    }

    private void generateArrayLiteralFactory(Node node, int n2) {
        short s2;
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.codegen.getBodyMethodName(this.scriptOrFn));
        charSequence.append("_literal");
        charSequence.append(n2);
        charSequence = charSequence.toString();
        this.initBodyGeneration();
        short s3 = this.firstFreeLocal;
        this.firstFreeLocal = s2 = (short)(s3 + 1);
        this.argsLocal = s3;
        this.localsMax = s2;
        this.cfw.startMethod((String)charSequence, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", (short)2);
        this.visitArrayLiteral(node, node.getFirstChild(), true);
        this.cfw.add(176);
        this.cfw.stopMethod((short)(this.localsMax + 1));
    }

    private void generateCallArgArray(Node node, Node node2, boolean bl) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        for (Node node3 = node2; node3 != null; node3 = node3.getNext()) {
            ++n4;
        }
        if (n4 == 1 && (n2 = this.itsOneArgArray) >= 0) {
            this.cfw.addALoad(n2);
        } else {
            this.addNewObjectArray(n4);
        }
        while (n3 != n4) {
            if (!this.isGenerator) {
                this.cfw.add(89);
                this.cfw.addPush(n3);
            }
            if (!bl) {
                this.generateExpression(node2, node);
            } else {
                n2 = this.nodeIsDirectCallParameter(node2);
                if (n2 >= 0) {
                    this.dcpLoadAsObject(n2);
                } else {
                    this.generateExpression(node2, node);
                    if (node2.getIntProp(8, -1) == 0) {
                        this.addDoubleWrap();
                    }
                }
            }
            if (this.isGenerator) {
                short s2 = this.getNewWordLocal();
                this.cfw.addAStore(s2);
                this.cfw.add(192, "[Ljava/lang/Object;");
                this.cfw.add(89);
                this.cfw.addPush(n3);
                this.cfw.addALoad(s2);
                this.releaseWordLocal(s2);
            }
            this.cfw.add(83);
            node2 = node2.getNext();
            ++n3;
        }
    }

    private void generateCatchBlock(int n2, short s2, int n3, int n4, int n5) {
        n2 = n5;
        if (n5 == 0) {
            n2 = this.cfw.acquireLabel();
        }
        this.cfw.markHandler(n2);
        this.cfw.addAStore(n4);
        this.cfw.addALoad(s2);
        this.cfw.addAStore(this.variableObjectLocal);
        this.cfw.add(167, n3);
    }

    private void generateCheckForThrowOrClose(int n2, boolean bl, int n3) {
        int n4 = this.cfw.acquireLabel();
        int n5 = this.cfw.acquireLabel();
        this.cfw.markLabel(n4);
        this.cfw.addALoad(this.argsLocal);
        this.generateThrowJavaScriptException();
        this.cfw.markLabel(n5);
        this.cfw.addALoad(this.argsLocal);
        this.cfw.add(192, "java/lang/Throwable");
        this.cfw.add(191);
        if (n2 != -1) {
            this.cfw.markLabel(n2);
        }
        if (!bl) {
            this.cfw.markTableSwitchCase(this.generatorSwitch, n3);
        }
        this.cfw.addILoad(this.operationLocal);
        this.cfw.addLoadConstant(2);
        this.cfw.add(159, n5);
        this.cfw.addILoad(this.operationLocal);
        this.cfw.addLoadConstant(1);
        this.cfw.add(159, n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void generateEpilogue() {
        int n2;
        if (this.compilerEnv.isGenerateObserverCount()) {
            this.addInstructionCount();
        }
        if (this.isGenerator) {
            Map<Node, BodyCodegen$FinallyReturnPoint> map;
            Map<Node, int[]> map2 = ((FunctionNode)this.scriptOrFn).getLiveLocals();
            if (map2 != null) {
                for (Node node : ((FunctionNode)this.scriptOrFn).getResumptionPoints()) {
                    int[] nArray = map2.get(node);
                    if (nArray == null) continue;
                    this.cfw.markTableSwitchCase(this.generatorSwitch, this.getNextGeneratorState(node));
                    this.generateGetGeneratorLocalsState();
                    for (n2 = 0; n2 < nArray.length; ++n2) {
                        this.cfw.add(89);
                        this.cfw.addLoadConstant(n2);
                        this.cfw.add(50);
                        this.cfw.addAStore(nArray[n2]);
                    }
                    this.cfw.add(87);
                    this.cfw.add(167, this.getTargetLabel(node));
                }
            }
            if ((map = this.finallys) != null) {
                for (Map.Entry<Node, BodyCodegen$FinallyReturnPoint> entry : map.entrySet()) {
                    if (entry.getKey().getType() != 129) continue;
                    BodyCodegen$FinallyReturnPoint bodyCodegen$FinallyReturnPoint = entry.getValue();
                    this.cfw.markLabel(bodyCodegen$FinallyReturnPoint.tableLabel, (short)1);
                    int n3 = this.cfw.addTableSwitch(0, bodyCodegen$FinallyReturnPoint.jsrPoints.size() - 1);
                    this.cfw.markTableSwitchDefault(n3);
                    int n4 = 0;
                    for (n2 = 0; n2 < bodyCodegen$FinallyReturnPoint.jsrPoints.size(); ++n4, ++n2) {
                        this.cfw.markTableSwitchCase(n3, n4);
                        this.cfw.add(167, bodyCodegen$FinallyReturnPoint.jsrPoints.get(n2));
                    }
                }
            }
        }
        if ((n2 = this.epilogueLabel) != -1) {
            this.cfw.markLabel(n2);
        }
        if (this.isGenerator) {
            if (((FunctionNode)this.scriptOrFn).getResumptionPoints() != null) {
                this.cfw.markTableSwitchDefault(this.generatorSwitch);
            }
            this.generateSetGeneratorResumptionPoint(-1);
            this.cfw.addALoad(this.variableObjectLocal);
            this.cfw.addALoad(this.generatorStateLocal);
            this.addOptRuntimeInvoke("throwStopIteration", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            Codegen.pushUndefined(this.cfw);
        } else if (!this.hasVarsInRegs) {
            if (this.fnCurrent != null) {
                this.generateActivationExit();
                this.cfw.add(176);
                n2 = this.cfw.acquireLabel();
                this.cfw.markHandler(n2);
                short s2 = this.getNewWordLocal();
                this.cfw.addAStore(s2);
                this.generateActivationExit();
                this.cfw.addALoad(s2);
                this.releaseWordLocal(s2);
                this.cfw.add(191);
                this.cfw.addExceptionHandler(this.enterAreaStartLabel, this.epilogueLabel, n2, null);
                return;
            }
            this.cfw.addALoad(this.popvLocal);
        }
        this.cfw.add(176);
    }

    /*
     * Exception decompiling
     */
    private void generateExpression(Node var1_1, Node var2_3) {
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

    /*
     * Unable to fully structure code
     */
    private void generateFunctionAndThisObj(Node var1_1, Node var2_2) {
        block5: {
            block3: {
                block4: {
                    var4_3 = var1_1.getType();
                    var3_4 = var1_1.getType();
                    if (var3_4 == 33) break block3;
                    if (var3_4 == 34) break block4;
                    if (var3_4 == 36) break block3;
                    if (var3_4 != 39) {
                        this.generateExpression((Node)var1_1, (Node)var2_2);
                        this.cfw.addALoad(this.contextLocal);
                        var1_1 = "getValueFunctionAndThis";
                        var2_2 = "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Callable;";
lbl11:
                        // 4 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var1_1 = var1_1.getString();
                    this.cfw.addPush((String)var1_1);
                    this.cfw.addALoad(this.contextLocal);
                    this.cfw.addALoad(this.variableObjectLocal);
                    var1_1 = "getNameFunctionAndThis";
                    var2_2 = "(Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Callable;";
                    ** GOTO lbl11
                }
                throw Kit.codeBug();
            }
            var2_2 = var1_1.getFirstChild();
            this.generateExpression((Node)var2_2, (Node)var1_1);
            var2_2 = var2_2.getNext();
            if (var4_3 != 33) break block5;
            var1_1 = var2_2.getString();
            this.cfw.addPush((String)var1_1);
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            var1_1 = "getPropFunctionAndThis";
            var2_2 = "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Callable;";
            ** GOTO lbl11
        }
        this.generateExpression((Node)var2_2, (Node)var1_1);
        if (var1_1.getIntProp(8, -1) != -1) {
            this.addDoubleWrap();
        }
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        var1_1 = "getElemFunctionAndThis";
        var2_2 = "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Callable;";
        ** while (true)
        this.addScriptRuntimeInvoke((String)var1_1, (String)var2_2);
        this.cfw.addALoad(this.contextLocal);
        this.addScriptRuntimeInvoke("lastStoredScriptable", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void generateGenerator() {
        short s2;
        this.cfw.startMethod(this.codegen.getBodyMethodName(this.scriptOrFn), this.codegen.getBodyMethodSignature(this.scriptOrFn), (short)10);
        this.initBodyGeneration();
        short s3 = this.firstFreeLocal;
        this.firstFreeLocal = s2 = (short)(s3 + 1);
        this.argsLocal = s3;
        this.localsMax = s2;
        if (this.fnCurrent != null) {
            this.cfw.addALoad(this.funObjLocal);
            this.cfw.addInvoke(185, "org/mozilla/javascript/Scriptable", "getParentScope", "()Lorg/mozilla/javascript/Scriptable;");
            this.cfw.addAStore(this.variableObjectLocal);
        }
        this.cfw.addALoad(this.funObjLocal);
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        this.cfw.addALoad(this.argsLocal);
        this.cfw.addPush(this.scriptOrFn.isInStrictMode());
        this.cfw.addPush(this.scriptOrFn.hasRestParameter());
        this.addScriptRuntimeInvoke("createFunctionActivation", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;ZZ)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.addAStore(this.variableObjectLocal);
        this.cfw.add(187, this.codegen.mainClassName);
        this.cfw.add(89);
        this.cfw.addALoad(this.variableObjectLocal);
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addPush(this.scriptOrFnIndex);
        this.cfw.addInvoke(183, this.codegen.mainClassName, "<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V");
        this.generateNestedFunctionInits();
        this.cfw.addALoad(this.variableObjectLocal);
        this.cfw.addALoad(this.thisObjLocal);
        this.cfw.addLoadConstant(this.maxLocals);
        this.cfw.addLoadConstant(this.maxStack);
        this.addOptRuntimeInvoke("createNativeGenerator", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;II)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.add(176);
        this.cfw.stopMethod((short)(this.localsMax + 1));
    }

    private void generateGetGeneratorLocalsState() {
        this.cfw.addALoad(this.generatorStateLocal);
        this.addOptRuntimeInvoke("getGeneratorLocalsState", "(Ljava/lang/Object;)[Ljava/lang/Object;");
    }

    private void generateGetGeneratorResumptionPoint() {
        this.cfw.addALoad(this.generatorStateLocal);
        this.cfw.add(180, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "resumptionPoint", "I");
    }

    private void generateGetGeneratorStackState() {
        this.cfw.addALoad(this.generatorStateLocal);
        this.addOptRuntimeInvoke("getGeneratorStackState", "(Ljava/lang/Object;)[Ljava/lang/Object;");
    }

    /*
     * Unable to fully structure code
     */
    private void generateIfJump(Node var1_1, Node var2_2, int var3_3, int var4_4) {
        block7: {
            block6: {
                var6_5 = var1_1.getType();
                var7_6 = var1_1.getFirstChild();
                if (var6_5 == 26) break block6;
                if (var6_5 == 46 || var6_5 == 47) ** GOTO lbl-1000
                if (var6_5 == 52 || var6_5 == 53) ** GOTO lbl-1000
                if (var6_5 == 108 || var6_5 == 109) ** GOTO lbl14
                switch (var6_5) {
                    default: {
                        this.generateExpression(var1_1, var2_2);
                        this.addScriptRuntimeInvoke("toBoolean", "(Ljava/lang/Object;)Z");
                        this.cfw.add(154, var3_3);
                        this.cfw.add(167, var4_4);
                        break;
                    }
lbl14:
                    // 1 sources

                    var5_7 = this.cfw.acquireLabel();
                    if (var6_5 == 109) {
                        this.generateIfJump(var7_6, var1_1, var5_7, var4_4);
                    } else {
                        this.generateIfJump(var7_6, var1_1, var3_3, var5_7);
                    }
                    this.cfw.markLabel(var5_7);
                    this.generateIfJump(var7_6.getNext(), var1_1, var3_3, var4_4);
                    break;
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: lbl-1000:
                    // 2 sources

                    {
                        this.visitIfJumpRelOp(var1_1, var7_6, var3_3, var4_4);
                        break;
                    }
                    case 12: 
                    case 13: lbl-1000:
                    // 2 sources

                    {
                        this.visitIfJumpEqOp(var1_1, var7_6, var3_3, var4_4);
                        break;
                    }
                }
                break block7;
            }
            this.generateIfJump(var7_6, var1_1, var4_4, var3_3);
        }
    }

    private void generateIntegerUnwrap() {
        this.cfw.addInvoke(182, "java/lang/Integer", "intValue", "()I");
    }

    private void generateIntegerWrap() {
        this.cfw.addInvoke(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
    }

    private void generateLocalYieldPoint(Node object, boolean bl) {
        Node node;
        int n2 = this.maxStack;
        int n3 = this.cfw.getStackTop();
        if (n2 <= n3) {
            n2 = n3;
        }
        this.maxStack = n2;
        if (n3 != 0) {
            this.generateGetGeneratorStackState();
            for (n2 = 0; n2 < n3; ++n2) {
                this.cfw.add(90);
                this.cfw.add(95);
                this.cfw.addLoadConstant(n2);
                this.cfw.add(95);
                this.cfw.add(83);
            }
            this.cfw.add(87);
        }
        if ((node = ((Node)object).getFirstChild()) != null) {
            this.generateExpression(node, (Node)object);
        } else {
            Codegen.pushUndefined(this.cfw);
        }
        if (((Node)object).getType() == 169) {
            this.cfw.add(187, "org/mozilla/javascript/ES6Generator$YieldStarResult");
            this.cfw.add(90);
            this.cfw.add(95);
            this.cfw.addInvoke(183, "org/mozilla/javascript/ES6Generator$YieldStarResult", "<init>", "(Ljava/lang/Object;)V");
        }
        n2 = this.getNextGeneratorState((Node)object);
        this.generateSetGeneratorResumptionPoint(n2);
        boolean bl2 = this.generateSaveLocals((Node)object);
        this.cfw.add(176);
        this.generateCheckForThrowOrClose(this.getTargetLabel((Node)object), bl2, n2);
        if (n3 != 0) {
            this.generateGetGeneratorStackState();
            n2 = n3 - 1;
            while (true) {
                object = this.cfw;
                if (n2 < 0) break;
                ((ClassFileWriter)object).add(89);
                this.cfw.addLoadConstant(n2);
                this.cfw.add(50);
                this.cfw.add(95);
                --n2;
            }
            ((ClassFileWriter)object).add(87);
        }
        if (bl) {
            this.cfw.addALoad(this.argsLocal);
        }
    }

    private void generateNestedFunctionInits() {
        int n2 = this.scriptOrFn.getFunctionCount();
        for (int i2 = 0; i2 != n2; ++i2) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFn, i2);
            if (optFunctionNode.fnode.getFunctionType() != 1) continue;
            this.visitFunction(optFunctionNode, 1);
        }
    }

    private void generateObjectLiteralFactory(Node node, int n2) {
        short s2;
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.codegen.getBodyMethodName(this.scriptOrFn));
        charSequence.append("_literal");
        charSequence.append(n2);
        charSequence = charSequence.toString();
        this.initBodyGeneration();
        short s3 = this.firstFreeLocal;
        this.firstFreeLocal = s2 = (short)(s3 + 1);
        this.argsLocal = s3;
        this.localsMax = s2;
        this.cfw.startMethod((String)charSequence, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;", (short)2);
        this.visitObjectLiteral(node, node.getFirstChild(), true);
        this.cfw.add(176);
        this.cfw.stopMethod((short)(this.localsMax + 1));
    }

    /*
     * Unable to fully structure code
     */
    private void generatePrologue() {
        block32: {
            if (this.inDirectCallFunction) {
                var4_1 = this.scriptOrFn.getParamCount();
                if (this.firstFreeLocal != 4) {
                    Kit.codeBug();
                }
                for (var3_2 = 0; var3_2 != var4_1; ++var3_2) {
                    var9_4 = this.varRegisters;
                    var9_4[var3_2] = var1_3 = this.firstFreeLocal;
                    this.firstFreeLocal = (short)(var1_3 + 3);
                }
                if (!this.fnCurrent.getParameterNumberContext()) {
                    this.itsForcedObjectParameters = true;
                    for (var3_2 = 0; var3_2 != var4_1; ++var3_2) {
                        var5_5 = this.varRegisters[var3_2];
                        this.cfw.addALoad(var5_5);
                        this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                        var6_6 = this.cfw.acquireLabel();
                        this.cfw.add(166, var6_6);
                        this.cfw.addDLoad(var5_5 + 1);
                        this.addDoubleWrap();
                        this.cfw.addAStore(var5_5);
                        this.cfw.markLabel(var6_6);
                    }
                }
            }
            if (this.fnCurrent != null) {
                this.cfw.addALoad(this.funObjLocal);
                this.cfw.addInvoke(185, "org/mozilla/javascript/Scriptable", "getParentScope", "()Lorg/mozilla/javascript/Scriptable;");
                this.cfw.addAStore(this.variableObjectLocal);
            }
            var2_7 = this.firstFreeLocal;
            this.firstFreeLocal = var1_3 = (int)(var2_7 + 1);
            this.argsLocal = var2_7;
            this.localsMax = var1_3;
            if (this.isGenerator) {
                this.firstFreeLocal = var2_7 = (short)(var1_3 + 1);
                this.operationLocal = var1_3;
                this.localsMax = var2_7;
                this.cfw.addALoad(this.thisObjLocal);
                var1_3 = this.firstFreeLocal;
                this.firstFreeLocal = var2_7 = (short)(var1_3 + 1);
                this.generatorStateLocal = var1_3;
                this.localsMax = var2_7;
                this.cfw.add(192, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState");
                this.cfw.add(89);
                this.cfw.addAStore(this.generatorStateLocal);
                this.cfw.add(180, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "thisObj", "Lorg/mozilla/javascript/Scriptable;");
                this.cfw.addAStore(this.thisObjLocal);
                if (this.epilogueLabel == -1) {
                    this.epilogueLabel = this.cfw.acquireLabel();
                }
                if ((var9_4 = (Object)((FunctionNode)this.scriptOrFn).getResumptionPoints()) != null) {
                    this.generateGetGeneratorResumptionPoint();
                    this.generatorSwitch = this.cfw.addTableSwitch(0, var9_4.size() + 0);
                    this.generateCheckForThrowOrClose(-1, false, 0);
                }
            }
            if (this.fnCurrent == null) {
                if (this.scriptOrFn.getRegexpCount() != 0) {
                    this.cfw.addALoad(this.contextLocal);
                    this.cfw.addInvoke(184, this.codegen.mainClassName, "_reInit", "(Lorg/mozilla/javascript/Context;)V");
                }
                if (this.scriptOrFn.getTemplateLiteralCount() != 0) {
                    this.cfw.addInvoke(184, this.codegen.mainClassName, "_qInit", "()V");
                }
            }
            if (this.compilerEnv.isGenerateObserverCount()) {
                this.saveCurrentCodeOffset();
            }
            if (this.isGenerator) {
                return;
            }
            if (!this.hasVarsInRegs) break block32;
            var3_2 = this.scriptOrFn.getParamCount();
            if (var3_2 > 0 && !this.inDirectCallFunction) {
                if (this.scriptOrFn.hasRestParameter()) {
                    this.cfw.addALoad(this.contextLocal);
                    this.cfw.addALoad(this.variableObjectLocal);
                    this.cfw.addALoad(this.argsLocal);
                    this.cfw.addPush(var3_2);
                    this.addScriptRuntimeInvoke("padAndRestArguments", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;I)[Ljava/lang/Object;");
                    this.cfw.addAStore(this.argsLocal);
                } else {
                    this.cfw.addALoad(this.argsLocal);
                    this.cfw.add(190);
                    this.cfw.addPush(var3_2);
                    var4_1 = this.cfw.acquireLabel();
                    this.cfw.add(162, var4_1);
                    this.cfw.addALoad(this.argsLocal);
                    this.cfw.addPush(var3_2);
                    this.addScriptRuntimeInvoke("padArguments", "([Ljava/lang/Object;I)[Ljava/lang/Object;");
                    this.cfw.addAStore(this.argsLocal);
                    this.cfw.markLabel(var4_1);
                }
            }
            var6_6 = this.fnCurrent.fnode.getParamCount();
            var7_8 = this.fnCurrent.fnode.getParamAndVarCount();
            var10_9 = this.fnCurrent.fnode.getParamAndVarConst();
            var3_2 = -1;
            for (var4_1 = 0; var4_1 != var7_8; ++var4_1) {
                block34: {
                    block36: {
                        block35: {
                            block33: {
                                if (var4_1 >= var6_6) break block33;
                                if (!this.inDirectCallFunction) {
                                    var1_3 = this.getNewWordLocal();
                                    this.cfw.addALoad(this.argsLocal);
                                    this.cfw.addPush(var4_1);
                                    this.cfw.add(50);
lbl94:
                                    // 3 sources

                                    while (true) {
                                        this.cfw.addAStore(var1_3);
                                        ** GOTO lbl114
                                        break;
                                    }
                                } else {
                                    var1_3 = -1;
                                }
                                break block34;
                            }
                            if (!this.fnCurrent.isNumberVar(var4_1)) break block35;
                            var1_3 = this.getNewWordPairLocal(var10_9[var4_1]);
                            this.cfw.addPush(0.0);
                            this.cfw.addDStore(var1_3);
                            break block34;
                        }
                        var1_3 = this.getNewWordLocal(var10_9[var4_1]);
                        if (var3_2 != -1) break block36;
                        Codegen.pushUndefined(this.cfw);
                        var3_2 = var1_3;
                        ** GOTO lbl94
                    }
                    this.cfw.addALoad(var3_2);
                    ** continue;
                }
                if (var1_3 >= 0) {
                    if (var10_9[var4_1]) {
                        this.cfw.addPush(0);
                        var9_4 = this.cfw;
                        var5_5 = this.fnCurrent.isNumberVar(var4_1) != false ? 2 : 1;
                        var9_4.addIStore(var5_5 + var1_3);
                    }
                    this.varRegisters[var4_1] = var1_3;
                }
                if (!this.compilerEnv.isGenerateDebugInfo()) continue;
                var11_12 = this.fnCurrent.fnode.getParamOrVarName(var4_1);
                var9_4 = this.fnCurrent.isNumberVar(var4_1) != false ? (Object)"D" : (Object)"Ljava/lang/Object;";
                var8_11 = this.cfw.getCurrentCodeOffset();
                var5_5 = var1_3;
                if (var1_3 < 0) {
                    var5_5 = this.varRegisters[var4_1];
                }
                this.cfw.addVariableDescriptor(var11_12, (String)var9_4, var8_11, var5_5);
            }
            return;
        }
        var9_4 = this.scriptOrFn;
        var3_2 = var9_4 instanceof FunctionNode != false && ((FunctionNode)var9_4).getFunctionType() == 4 ? 1 : 0;
        if (this.fnCurrent != null) {
            this.cfw.addALoad(this.funObjLocal);
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.cfw.addALoad(this.argsLocal);
            this.cfw.addPush(this.scriptOrFn.isInStrictMode());
            this.cfw.addPush(this.scriptOrFn.hasRestParameter());
            var9_4 = var3_2 != 0 ? (Object)"createArrowFunctionActivation" : (Object)"createFunctionActivation";
            this.addScriptRuntimeInvoke((String)var9_4, "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;ZZ)Lorg/mozilla/javascript/Scriptable;");
            this.cfw.addAStore(this.variableObjectLocal);
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.addScriptRuntimeInvoke("enterActivationFunction", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
            var9_4 = "activation";
        } else {
            this.cfw.addALoad(this.funObjLocal);
            this.cfw.addALoad(this.thisObjLocal);
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.cfw.addPush(0);
            this.addScriptRuntimeInvoke("initScript", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Z)V");
            var9_4 = "global";
        }
        this.enterAreaStartLabel = this.cfw.acquireLabel();
        this.epilogueLabel = this.cfw.acquireLabel();
        this.cfw.markLabel(this.enterAreaStartLabel);
        this.generateNestedFunctionInits();
        if (this.compilerEnv.isGenerateDebugInfo()) {
            var10_10 = this.cfw;
            var10_10.addVariableDescriptor((String)var9_4, "Lorg/mozilla/javascript/Scriptable;", var10_10.getCurrentCodeOffset(), this.variableObjectLocal);
        }
        if ((var9_4 = this.fnCurrent) == null) {
            this.popvLocal = this.getNewWordLocal();
            Codegen.pushUndefined(this.cfw);
            this.cfw.addAStore(this.popvLocal);
            var3_2 = this.scriptOrFn.getEndLineno();
            if (var3_2 != -1) {
                this.cfw.addLineNumberEntry((short)var3_2);
            }
        } else {
            if (var9_4.itsContainsCalls0) {
                this.itsZeroArgArray = this.getNewWordLocal();
                this.cfw.add(178, "org/mozilla/javascript/ScriptRuntime", "emptyArgs", "[Ljava/lang/Object;");
                this.cfw.addAStore(this.itsZeroArgArray);
            }
            if (this.fnCurrent.itsContainsCalls1) {
                this.itsOneArgArray = this.getNewWordLocal();
                this.cfw.addPush(1);
                this.cfw.add(189, "java/lang/Object");
                this.cfw.addAStore(this.itsOneArgArray);
            }
        }
    }

    private boolean generateSaveLocals(Node object) {
        int n2;
        int n3;
        int n4 = 0;
        int n5 = 0;
        for (n3 = 0; n3 < this.firstFreeLocal; ++n3) {
            n2 = n5;
            if (this.locals[n3] != 0) {
                n2 = n5 + 1;
            }
            n5 = n2;
        }
        if (n5 == 0) {
            ((FunctionNode)this.scriptOrFn).addLiveLocals((Node)object, null);
            return false;
        }
        n2 = this.maxLocals;
        if (n2 <= n5) {
            n2 = n5;
        }
        this.maxLocals = n2;
        int[] nArray = new int[n5];
        n3 = 0;
        for (n2 = 0; n2 < this.firstFreeLocal; ++n2) {
            int n6 = n3;
            if (this.locals[n2] != 0) {
                nArray[n3] = n2;
                n6 = n3 + 1;
            }
            n3 = n6;
        }
        ((FunctionNode)this.scriptOrFn).addLiveLocals((Node)object, nArray);
        this.generateGetGeneratorLocalsState();
        n2 = n4;
        while (true) {
            object = this.cfw;
            if (n2 >= n5) break;
            ((ClassFileWriter)object).add(89);
            this.cfw.addLoadConstant(n2);
            this.cfw.addALoad(nArray[n2]);
            this.cfw.add(83);
            ++n2;
        }
        ((ClassFileWriter)object).add(87);
        return true;
    }

    private void generateSetGeneratorResumptionPoint(int n2) {
        this.cfw.addALoad(this.generatorStateLocal);
        this.cfw.addLoadConstant(n2);
        this.cfw.add(181, "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState", "resumptionPoint", "I");
    }

    private void generateSetGeneratorReturnValue() {
        this.cfw.addALoad(this.generatorStateLocal);
        this.cfw.add(95);
        this.addOptRuntimeInvoke("setGeneratorReturnValue", "(Ljava/lang/Object;Ljava/lang/Object;)V");
    }

    /*
     * Exception decompiling
     */
    private void generateStatement(Node var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 10[SWITCH]
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

    private void generateThrowJavaScriptException() {
        this.cfw.add(187, "org/mozilla/javascript/JavaScriptException");
        this.cfw.add(90);
        this.cfw.add(95);
        this.cfw.addPush(this.scriptOrFn.getSourceName());
        this.cfw.addPush(this.itsLineNumber);
        this.cfw.addInvoke(183, "org/mozilla/javascript/JavaScriptException", "<init>", "(Ljava/lang/Object;Ljava/lang/String;I)V");
        this.cfw.add(191);
    }

    private void generateYieldPoint(Node node, boolean bl) {
        if (this.unnestedYields.containsKey(node)) {
            if (bl) {
                this.cfw.addALoad(this.variableObjectLocal);
                this.cfw.addLoadConstant(this.unnestedYields.get(node));
                this.cfw.addALoad(this.contextLocal);
                this.cfw.addALoad(this.variableObjectLocal);
                this.addScriptRuntimeInvoke("getObjectPropNoWarn", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
            }
            return;
        }
        Node node2 = this.findNestedYield(node);
        if (node2 != null) {
            this.generateYieldPoint(node2, true);
            CharSequence charSequence = a.c("__nested__yield__");
            charSequence.append(this.unnestedYieldCount);
            charSequence = charSequence.toString();
            ++this.unnestedYieldCount;
            this.cfw.addALoad(this.variableObjectLocal);
            this.cfw.add(95);
            this.cfw.addLoadConstant((String)charSequence);
            this.cfw.add(95);
            this.cfw.addALoad(this.contextLocal);
            this.addScriptRuntimeInvoke("setObjectProp", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
            this.cfw.add(87);
            this.unnestedYields.put(node2, (String)charSequence);
        }
        this.generateLocalYieldPoint(node, bl);
    }

    private static Node getFinallyAtTarget(Node node) {
        if (node == null) {
            return null;
        }
        if (node.getType() == 129) {
            return node;
        }
        if (node.getType() == 135 && (node = node.getNext()) != null && node.getType() == 129) {
            return node;
        }
        throw Kit.codeBug("bad finally target");
    }

    private static int getLocalBlockRegister(Node node) {
        return ((Node)node.getProp(3)).getExistingIntProp(2);
    }

    /*
     * Exception decompiling
     */
    private short getNewWordIntern(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[DOLOOP]], but top level block is 10[SIMPLE_IF_TAKEN]
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

    private short getNewWordLocal() {
        return this.getNewWordIntern(1);
    }

    private short getNewWordLocal(boolean bl) {
        int n2 = bl ? 2 : 1;
        return this.getNewWordIntern(n2);
    }

    private short getNewWordPairLocal(boolean bl) {
        int n2 = bl ? 3 : 2;
        return this.getNewWordIntern(n2);
    }

    private int getNextGeneratorState(Node node) {
        return ((FunctionNode)this.scriptOrFn).getResumptionPoints().indexOf(node) + 1;
    }

    private int getTargetLabel(Node node) {
        int n2;
        int n3 = n2 = node.labelId();
        if (n2 == -1) {
            n3 = this.cfw.acquireLabel();
            node.labelId(n3);
        }
        return n3;
    }

    private void incReferenceWordLocal(short s2) {
        int[] nArray = this.locals;
        nArray[s2] = nArray[s2] + 1;
    }

    private void initBodyGeneration() {
        this.varRegisters = null;
        if (this.scriptOrFn.getType() == 113) {
            int n2;
            boolean bl;
            OptFunctionNode optFunctionNode;
            this.fnCurrent = optFunctionNode = OptFunctionNode.get(this.scriptOrFn);
            this.hasVarsInRegs = bl = optFunctionNode.fnode.requiresActivation() ^ true;
            if (bl && (n2 = this.fnCurrent.fnode.getParamAndVarCount()) != 0) {
                this.varRegisters = new short[n2];
            }
            this.inDirectCallFunction = bl = this.fnCurrent.isTargetOfDirectCall();
            if (bl && !this.hasVarsInRegs) {
                Codegen.badTree();
            }
        } else {
            this.fnCurrent = null;
            this.hasVarsInRegs = false;
            this.inDirectCallFunction = false;
        }
        this.locals = new int[1024];
        this.funObjLocal = 0;
        this.contextLocal = 1;
        this.variableObjectLocal = (short)2;
        this.thisObjLocal = (short)3;
        this.localsMax = (short)4;
        this.firstFreeLocal = (short)4;
        this.popvLocal = (short)-1;
        this.argsLocal = (short)-1;
        this.itsZeroArgArray = (short)-1;
        this.itsOneArgArray = (short)-1;
        this.epilogueLabel = -1;
        this.enterAreaStartLabel = -1;
        this.generatorStateLocal = (short)-1;
    }

    private void inlineFinally(Node node) {
        int n2 = this.cfw.acquireLabel();
        int n3 = this.cfw.acquireLabel();
        this.cfw.markLabel(n2);
        this.inlineFinally(node, n2, n3);
        this.cfw.markLabel(n3);
    }

    private void inlineFinally(Node node, int n2, int n3) {
        Node node2 = BodyCodegen.getFinallyAtTarget(node);
        node2.resetTargets();
        this.exceptionManager.markInlineFinallyStart(node2, n2);
        for (node = node2.getFirstChild(); node != null; node = node.getNext()) {
            this.generateStatement(node);
        }
        this.exceptionManager.markInlineFinallyEnd(node2, n3);
    }

    private static boolean isArithmeticNode(Node node) {
        int n2 = node.getType();
        boolean bl = n2 == 22 || n2 == 25 || n2 == 24 || n2 == 23;
        return bl;
    }

    private int nodeIsDirectCallParameter(Node node) {
        int n2;
        if (node.getType() == 55 && this.inDirectCallFunction && !this.itsForcedObjectParameters && this.fnCurrent.isParameter(n2 = this.fnCurrent.getVarIndex(node))) {
            return this.varRegisters[n2];
        }
        return -1;
    }

    private void releaseWordLocal(short s2) {
        if (s2 < this.firstFreeLocal) {
            this.firstFreeLocal = s2;
        }
        this.locals[s2] = 0;
    }

    private void saveCurrentCodeOffset() {
        this.savedCodeOffset = this.cfw.getCurrentCodeOffset();
    }

    private void updateLineNumber(Node node) {
        int n2;
        this.itsLineNumber = n2 = node.getLineno();
        if (n2 == -1) {
            return;
        }
        this.cfw.addLineNumberEntry((short)n2);
    }

    private boolean varIsDirectCallParameter(int n2) {
        boolean bl = this.fnCurrent.isParameter(n2) && this.inDirectCallFunction && !this.itsForcedObjectParameters;
        return bl;
    }

    private void visitArithmetic(Node object, int n2, Node node, Node node2) {
        int n3 = ((Node)object).getIntProp(8, -1);
        this.generateExpression(node, (Node)object);
        if (n3 != -1) {
            this.generateExpression(node.getNext(), (Node)object);
            switch (n2) {
                default: {
                    throw Kit.codeBug(Token.typeToName(n2));
                }
                case 25: {
                    object = this.cfw;
                    n2 = 115;
                    break;
                }
                case 24: {
                    object = this.cfw;
                    n2 = 111;
                    break;
                }
                case 23: {
                    object = this.cfw;
                    n2 = 107;
                    break;
                }
                case 22: {
                    object = this.cfw;
                    n2 = 103;
                }
            }
            ((ClassFileWriter)object).add(n2);
        } else {
            if (!BodyCodegen.isArithmeticNode(node)) {
                this.addObjectToNumeric();
            }
            this.generateExpression(node.getNext(), (Node)object);
            if (!BodyCodegen.isArithmeticNode(node.getNext())) {
                this.addObjectToNumeric();
            }
            switch (n2) {
                default: {
                    throw Kit.codeBug(Token.typeToName(n2));
                }
                case 25: {
                    object = "remainder";
                    break;
                }
                case 24: {
                    object = "divide";
                    break;
                }
                case 23: {
                    object = "multiply";
                    break;
                }
                case 22: {
                    object = "subtract";
                }
            }
            this.addScriptRuntimeInvoke((String)object, "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
        }
    }

    private void visitArrayLiteral(Node object, Node node, boolean bl) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (Node node2 = node; node2 != null; node2 = node2.getNext()) {
            ++n4;
        }
        if (!(bl || n4 <= 10 && this.cfw.getCurrentCodeOffset() <= 30000 || this.hasVarsInRegs || this.isGenerator || this.inLocalBlock)) {
            if (this.literals == null) {
                this.literals = new LinkedList<Node>();
            }
            this.literals.add((Node)object);
            object = new StringBuilder();
            ((StringBuilder)object).append(this.codegen.getBodyMethodName(this.scriptOrFn));
            ((StringBuilder)object).append("_literal");
            ((StringBuilder)object).append(this.literals.size());
            object = ((StringBuilder)object).toString();
            this.cfw.addALoad(this.funObjLocal);
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.cfw.addALoad(this.thisObjLocal);
            this.cfw.addALoad(this.argsLocal);
            this.cfw.addInvoke(182, this.codegen.mainClassName, (String)object, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        if (this.isGenerator) {
            for (n2 = 0; n2 != n4; ++n2) {
                this.generateExpression(node, (Node)object);
                node = node.getNext();
            }
            this.addNewObjectArray(n4);
            for (n2 = n3; n2 != n4; ++n2) {
                this.cfw.add(90);
                this.cfw.add(95);
                this.cfw.addPush(n4 - n2 - 1);
                this.cfw.add(95);
                this.cfw.add(83);
            }
        } else {
            this.addNewObjectArray(n4);
            while (n2 != n4) {
                this.cfw.add(89);
                this.cfw.addPush(n2);
                this.generateExpression(node, (Node)object);
                this.cfw.add(83);
                node = node.getNext();
                ++n2;
            }
        }
        if ((object = (Object)((int[])((Node)object).getProp(11))) == null) {
            this.cfw.add(1);
            this.cfw.add(3);
        } else {
            this.cfw.addPush(OptRuntime.encodeIntArray((int[])object));
            this.cfw.addPush(((Object)object).length);
        }
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        this.addOptRuntimeInvoke("newArrayLiteral", "([Ljava/lang/Object;Ljava/lang/String;ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitBitNot(Node node, Node node2) {
        int n2 = node.getIntProp(8, -1);
        this.generateExpression(node2, node);
        if (n2 == -1) {
            this.addObjectToNumeric();
            this.addScriptRuntimeInvoke("bitwiseNOT", "(Ljava/lang/Number;)Ljava/lang/Number;");
        } else {
            this.addScriptRuntimeInvoke("toInt32", "(D)I");
            this.cfw.addPush(-1);
            this.cfw.add(130);
            this.cfw.add(135);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void visitBitOp(Node var1_1, int var2_2, Node var3_3) {
        block14: {
            block15: {
                block18: {
                    block19: {
                        block16: {
                            block17: {
                                var4_4 = var1_1.getIntProp(8, -1);
                                this.generateExpression(var3_3, (Node)var1_1);
                                if (var2_2 == 20) {
                                    this.addScriptRuntimeInvoke("toUint32", "(Ljava/lang/Object;)J");
                                    this.generateExpression(var3_3.getNext(), (Node)var1_1);
                                    this.addScriptRuntimeInvoke("toInt32", "(Ljava/lang/Object;)I");
                                    this.cfw.addPush(31);
                                    this.cfw.add(126);
                                    this.cfw.add(125);
                                    this.cfw.add(138);
                                    this.addDoubleWrap();
                                    return;
                                }
                                if (var4_4 != -1) break block16;
                                this.addObjectToNumeric();
                                this.generateExpression(var3_3.getNext(), (Node)var1_1);
                                this.addObjectToNumeric();
                                if (var2_2 == 18) break block17;
                                if (var2_2 != 19) {
                                    switch (var2_2) {
                                        default: {
                                            throw Kit.codeBug(Token.typeToName(var2_2));
                                        }
                                        case 11: {
                                            var1_1 = "bitwiseAND";
                                            break;
                                        }
                                        case 10: {
                                            var1_1 = "bitwiseXOR";
                                            break;
                                        }
                                        case 9: {
                                            var1_1 = "bitwiseOR";
                                        }
                                    }
lbl30:
                                    // 5 sources

                                    while (true) {
                                        this.addScriptRuntimeInvoke((String)var1_1, "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
                                        break block14;
                                        break;
                                    }
                                }
                                var1_1 = "signedRightShift";
                                ** GOTO lbl30
                            }
                            var1_1 = "leftShift";
                            ** while (true)
                        }
                        this.addScriptRuntimeInvoke("toInt32", "(D)I");
                        this.generateExpression(var3_3.getNext(), (Node)var1_1);
                        this.addScriptRuntimeInvoke("toInt32", "(D)I");
                        if (var2_2 == 18) break block18;
                        if (var2_2 == 19) break block19;
                        switch (var2_2) {
                            default: {
                                throw Kit.codeBug(Token.typeToName(var2_2));
                            }
                            case 11: {
                                this.cfw.add(126);
                                break block15;
                            }
                            case 10: {
                                var1_1 = this.cfw;
                                var2_2 = 130;
                                break;
                            }
                            case 9: {
                                var1_1 = this.cfw;
                                var2_2 = 128;
                            }
                        }
lbl57:
                        // 4 sources

                        while (true) {
                            var1_1.add(var2_2);
                            break block15;
                            break;
                        }
                    }
                    var1_1 = this.cfw;
                    var2_2 = 122;
                    ** GOTO lbl57
                }
                var1_1 = this.cfw;
                var2_2 = 120;
                ** while (true)
            }
            this.cfw.add(135);
        }
    }

    private void visitDotQuery(Node node, Node node2) {
        this.updateLineNumber(node);
        this.generateExpression(node2, node);
        this.cfw.addALoad(this.variableObjectLocal);
        this.addScriptRuntimeInvoke("enterDotQuery", "(Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.addAStore(this.variableObjectLocal);
        this.cfw.add(1);
        int n2 = this.cfw.acquireLabel();
        this.cfw.markLabel(n2);
        this.cfw.add(87);
        this.generateExpression(node2.getNext(), node);
        this.addScriptRuntimeInvoke("toBoolean", "(Ljava/lang/Object;)Z");
        this.cfw.addALoad(this.variableObjectLocal);
        this.addScriptRuntimeInvoke("updateDotQuery", "(ZLorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        this.cfw.add(89);
        this.cfw.add(198, n2);
        this.cfw.addALoad(this.variableObjectLocal);
        this.addScriptRuntimeInvoke("leaveDotQuery", "(Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        this.cfw.addAStore(this.variableObjectLocal);
    }

    private void visitExponentiation(Node node, Node node2, Node node3) {
        int n2 = node.getIntProp(8, -1);
        this.generateExpression(node2, node);
        this.generateExpression(node2.getNext(), node);
        if (n2 != -1) {
            this.cfw.addInvoke(184, "java/lang/Math", "pow", "(DD)D");
        } else {
            n2 = this.getNewWordLocal();
            this.cfw.addAStore(n2);
            this.addObjectToNumeric();
            this.cfw.addALoad(n2);
            this.addObjectToNumeric();
            this.addScriptRuntimeInvoke("exponentiate", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;");
        }
    }

    private void visitFunction(OptFunctionNode optFunctionNode, int n2) {
        int n3 = this.codegen.getIndex(optFunctionNode.fnode);
        this.cfw.add(187, this.codegen.mainClassName);
        this.cfw.add(89);
        this.cfw.addALoad(this.variableObjectLocal);
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addPush(n3);
        this.cfw.addInvoke(183, this.codegen.mainClassName, "<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V");
        if (n2 == 4) {
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.cfw.addALoad(this.thisObjLocal);
            this.addOptRuntimeInvoke("bindThis", "(Lorg/mozilla/javascript/NativeFunction;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Function;");
        }
        if (n2 != 2 && n2 != 4) {
            this.cfw.addPush(n2);
            this.cfw.addALoad(this.variableObjectLocal);
            this.cfw.addALoad(this.contextLocal);
            this.addOptRuntimeInvoke("initFunction", "(Lorg/mozilla/javascript/NativeFunction;ILorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;)V");
        }
    }

    private void visitGetProp(Node node, Node node2) {
        this.generateExpression(node2, node);
        Node node3 = node2.getNext();
        this.generateExpression(node3, node);
        if (node.getType() == 34) {
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.addScriptRuntimeInvoke("getObjectPropNoWarn", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
            return;
        }
        if (node2.getType() == 43 && node3.getType() == 41) {
            this.cfw.addALoad(this.contextLocal);
            this.addScriptRuntimeInvoke("getObjectProp", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;");
        } else {
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.addScriptRuntimeInvoke("getObjectProp", "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
        }
    }

    private void visitGetVar(Node node) {
        if (!this.hasVarsInRegs) {
            Kit.codeBug();
        }
        int n2 = this.fnCurrent.getVarIndex(node);
        short s2 = this.varRegisters[n2];
        if (this.varIsDirectCallParameter(n2)) {
            if (node.getIntProp(8, -1) != -1) {
                this.dcpLoadAsNumber(s2);
            } else {
                this.dcpLoadAsObject(s2);
            }
        } else if (this.fnCurrent.isNumberVar(n2)) {
            this.cfw.addDLoad(s2);
        } else {
            this.cfw.addALoad(s2);
        }
    }

    private void visitGoto(Jump jump, int n2, Node node) {
        block11: {
            block10: {
                Node node2;
                block9: {
                    node2 = jump.target;
                    if (n2 == 6 || n2 == 7) break block9;
                    if (n2 == 139) {
                        if (this.isGenerator) {
                            this.addGotoWithReturn(node2);
                        } else {
                            this.inlineFinally(node2);
                        }
                    } else {
                        this.addGoto(node2, 167);
                    }
                    break block10;
                }
                if (node == null) break block11;
                int n3 = this.getTargetLabel(node2);
                int n4 = this.cfw.acquireLabel();
                if (n2 == 6) {
                    this.generateIfJump(node, jump, n3, n4);
                } else {
                    this.generateIfJump(node, jump, n4, n3);
                }
                this.cfw.markLabel(n4);
            }
            return;
        }
        throw Codegen.badTree();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void visitIfJumpEqOp(Node object, Node object2, int n2, int n3) {
        block11: {
            short s2;
            block18: {
                Node node;
                int n4;
                Object object3;
                block12: {
                    int n5;
                    block17: {
                        block15: {
                            block13: {
                                block16: {
                                    block14: {
                                        object3 = object2;
                                        if (n2 == -1 || n3 == -1) break block11;
                                        s2 = this.cfw.getStackTop();
                                        n4 = ((Node)object).getType();
                                        node = ((Node)object2).getNext();
                                        if (((Node)object2).getType() == 42 || node.getType() == 42) break block12;
                                        int n6 = this.nodeIsDirectCallParameter((Node)object3);
                                        if (n6 != -1 && node.getType() == 153 && ((Node)(object2 = node.getFirstChild())).getType() == 40) {
                                            this.cfw.addALoad(n6);
                                            this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                                            n5 = this.cfw.acquireLabel();
                                            this.cfw.add(166, n5);
                                            this.cfw.addDLoad(n6 + 1);
                                            this.cfw.addPush(((Node)object2).getDouble());
                                            this.cfw.add(151);
                                            if (n4 == 12) {
                                                this.cfw.add(153, n2);
                                            } else {
                                                this.cfw.add(154, n2);
                                            }
                                            this.cfw.add(167, n3);
                                            this.cfw.markLabel(n5);
                                        }
                                        this.generateExpression((Node)object3, (Node)object);
                                        this.generateExpression(node, (Node)object);
                                        object2 = "shallowEq";
                                        if (n4 == 12) break block13;
                                        if (n4 == 13) break block14;
                                        object = object2;
                                        if (n4 == 46) break block15;
                                        if (n4 != 47) {
                                            throw Codegen.badTree();
                                        }
                                        object = object2;
                                        break block16;
                                    }
                                    object = "eq";
                                }
                                n5 = 153;
                                break block17;
                            }
                            object = "eq";
                        }
                        n5 = 154;
                    }
                    this.addScriptRuntimeInvoke((String)object, "(Ljava/lang/Object;Ljava/lang/Object;)Z");
                    this.cfw.add(n5, n2);
                    break block18;
                }
                if (((Node)object2).getType() == 42) {
                    object3 = node;
                }
                this.generateExpression((Node)object3, (Node)object);
                int n7 = 199;
                if (n4 != 46 && n4 != 47) {
                    int n8 = n2;
                    n7 = n3;
                    if (n4 != 12) {
                        if (n4 != 13) {
                            throw Codegen.badTree();
                        }
                        n8 = n3;
                        n7 = n2;
                    }
                    this.cfw.add(89);
                    n2 = this.cfw.acquireLabel();
                    this.cfw.add(199, n2);
                    short s3 = this.cfw.getStackTop();
                    this.cfw.add(87);
                    this.cfw.add(167, n8);
                    this.cfw.markLabel(n2, s3);
                    Codegen.pushUndefined(this.cfw);
                    this.cfw.add(165, n8);
                    n3 = n7;
                } else {
                    if (n4 == 46) {
                        n7 = 198;
                    }
                    this.cfw.add(n7, n2);
                }
            }
            this.cfw.add(167, n3);
            if (s2 != this.cfw.getStackTop()) {
                throw Codegen.badTree();
            }
            return;
        }
        throw Codegen.badTree();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void visitIfJumpRelOp(Node object, Node node, int n2, int n3) {
        if (n2 == -1 || n3 == -1) throw Codegen.badTree();
        int n4 = ((Node)object).getType();
        Node node2 = node.getNext();
        if (n4 != 53 && n4 != 52) {
            int n5 = ((Node)object).getIntProp(8, -1);
            int n6 = this.nodeIsDirectCallParameter(node);
            int n7 = this.nodeIsDirectCallParameter(node2);
            if (n5 != -1) {
                if (n5 != 2) {
                    this.generateExpression(node, (Node)object);
                } else if (n6 != -1) {
                    this.dcpLoadAsNumber(n6);
                } else {
                    this.generateExpression(node, (Node)object);
                    this.addObjectToDouble();
                }
                if (n5 != 1) {
                    this.generateExpression(node2, (Node)object);
                } else if (n7 != -1) {
                    this.dcpLoadAsNumber(n7);
                } else {
                    this.generateExpression(node2, (Node)object);
                    this.addObjectToDouble();
                }
                this.genSimpleCompare(n4, n2, n3);
                return;
            } else {
                if (n6 != -1 && n7 != -1) {
                    n5 = this.cfw.getStackTop();
                    int n8 = this.cfw.acquireLabel();
                    this.cfw.addALoad(n6);
                    this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                    this.cfw.add(166, n8);
                    this.cfw.addDLoad(n6 + 1);
                    this.dcpLoadAsNumber(n7);
                    this.genSimpleCompare(n4, n2, n3);
                    if (n5 != this.cfw.getStackTop()) throw Codegen.badTree();
                    this.cfw.markLabel(n8);
                    n8 = this.cfw.acquireLabel();
                    this.cfw.addALoad(n7);
                    this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                    this.cfw.add(166, n8);
                    this.cfw.addALoad(n6);
                    this.addObjectToDouble();
                    this.cfw.addDLoad(n7 + 1);
                    this.genSimpleCompare(n4, n2, n3);
                    if (n5 != this.cfw.getStackTop()) throw Codegen.badTree();
                    this.cfw.markLabel(n8);
                    this.cfw.addALoad(n6);
                    this.cfw.addALoad(n7);
                } else {
                    this.generateExpression(node, (Node)object);
                    this.generateExpression(node2, (Node)object);
                }
                this.cfw.addPush(n4);
                this.addScriptRuntimeInvoke("compare", "(Ljava/lang/Object;Ljava/lang/Object;I)Z");
                this.cfw.add(154, n2);
                this.cfw.add(167, n3);
            }
            return;
        }
        this.generateExpression(node, (Node)object);
        this.generateExpression(node2, (Node)object);
        this.cfw.addALoad(this.contextLocal);
        object = n4 == 53 ? "instanceOf" : "in";
        this.addScriptRuntimeInvoke((String)object, "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;)Z");
        this.cfw.add(154, n2);
        this.cfw.add(167, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void visitIncDec(Node object) {
        Object object2;
        block29: {
            int n2;
            block26: {
                block27: {
                    block28: {
                        n2 = ((Node)object).getExistingIntProp(13);
                        object2 = ((Node)object).getFirstChild();
                        int n3 = ((Node)object2).getType();
                        if (n3 == 33) break block26;
                        if (n3 == 34) throw Kit.codeBug();
                        if (n3 == 36) break block27;
                        if (n3 == 39) break block28;
                        if (n3 != 55) {
                            if (n3 != 68) {
                                Codegen.badTree();
                                return;
                            }
                            this.generateExpression(((Node)object2).getFirstChild(), (Node)object);
                            this.cfw.addALoad(this.contextLocal);
                            this.cfw.addALoad(this.variableObjectLocal);
                            this.cfw.addPush(n2);
                            object2 = "refIncrDecr";
                            object = "(Lorg/mozilla/javascript/Ref;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;";
                            break block29;
                        } else {
                            if (!this.hasVarsInRegs) {
                                Kit.codeBug();
                            }
                            n3 = (n2 & 2) != 0 ? 1 : 0;
                            int n4 = this.fnCurrent.getVarIndex((Node)object2);
                            int n5 = this.varRegisters[n4];
                            boolean bl = this.fnCurrent.fnode.getParamAndVarConst()[n4];
                            int n6 = ((Node)object).getIntProp(8, -1);
                            if (bl) {
                                if (n6 != -1) {
                                    n6 = this.varIsDirectCallParameter(n4) ? 1 : 0;
                                    this.cfw.addDLoad(n5 + n6);
                                    if (n3 != 0) return;
                                    this.cfw.addPush(1.0);
                                    if ((n2 & 1) == 0) {
                                        this.cfw.add(99);
                                        return;
                                    }
                                    this.cfw.add(103);
                                    return;
                                }
                                if (this.varIsDirectCallParameter(n4)) {
                                    this.dcpLoadAsObject(n5);
                                } else {
                                    this.cfw.addALoad(n5);
                                }
                                if (n3 != 0) {
                                    this.cfw.add(89);
                                    this.addObjectToDouble();
                                    this.cfw.add(88);
                                    return;
                                }
                                this.addObjectToDouble();
                                this.cfw.addPush(1.0);
                                if ((n2 & 1) == 0) {
                                    this.cfw.add(99);
                                } else {
                                    this.cfw.add(103);
                                }
                            } else {
                                if (n6 != -1) {
                                    n6 = this.varIsDirectCallParameter(n4) ? 1 : 0;
                                    object = this.cfw;
                                    ((ClassFileWriter)object).addDLoad(n5 += n6);
                                    if (n3 != 0) {
                                        this.cfw.add(92);
                                    }
                                    this.cfw.addPush(1.0);
                                    if ((n2 & 1) == 0) {
                                        this.cfw.add(99);
                                    } else {
                                        this.cfw.add(103);
                                    }
                                    if (n3 == 0) {
                                        this.cfw.add(92);
                                    }
                                    this.cfw.addDStore(n5);
                                    return;
                                }
                                if (this.varIsDirectCallParameter(n4)) {
                                    this.dcpLoadAsObject(n5);
                                } else {
                                    this.cfw.addALoad(n5);
                                }
                                this.addObjectToDouble();
                                if (n3 != 0) {
                                    this.cfw.add(92);
                                }
                                this.cfw.addPush(1.0);
                                if ((n2 & 1) == 0) {
                                    this.cfw.add(99);
                                } else {
                                    this.cfw.add(103);
                                }
                                this.addDoubleWrap();
                                if (n3 == 0) {
                                    this.cfw.add(89);
                                }
                                this.cfw.addAStore(n5);
                                if (n3 == 0) return;
                            }
                            this.addDoubleWrap();
                            return;
                        }
                    }
                    this.cfw.addALoad(this.variableObjectLocal);
                    this.cfw.addPush(((Node)object2).getString());
                    this.cfw.addALoad(this.contextLocal);
                    this.cfw.addPush(n2);
                    object2 = "nameIncrDecr";
                    object = "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;I)Ljava/lang/Object;";
                    break block29;
                }
                object2 = ((Node)object2).getFirstChild();
                this.generateExpression((Node)object2, (Node)object);
                this.generateExpression(((Node)object2).getNext(), (Node)object);
                this.cfw.addALoad(this.contextLocal);
                this.cfw.addALoad(this.variableObjectLocal);
                this.cfw.addPush(n2);
                if (((Node)object2).getNext().getIntProp(8, -1) != -1) {
                    this.addOptRuntimeInvoke("elemIncrDecr", "(Ljava/lang/Object;DLorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
                    return;
                }
                this.addScriptRuntimeInvoke("elemIncrDecr", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;");
                return;
            }
            object2 = ((Node)object2).getFirstChild();
            this.generateExpression((Node)object2, (Node)object);
            this.generateExpression(((Node)object2).getNext(), (Node)object);
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.cfw.addPush(n2);
            object2 = "propIncrDecr";
            object = "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;";
        }
        this.addScriptRuntimeInvoke((String)object2, (String)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void visitObjectLiteral(Node object, Node node, boolean bl) {
        int n2;
        int n3;
        int n4;
        block13: {
            Object[] objectArray = (Object[])((Node)object).getProp(12);
            n4 = 0;
            n3 = objectArray == null ? 0 : objectArray.length;
            if (!(bl || n3 <= 10 && this.cfw.getCurrentCodeOffset() <= 30000 || this.hasVarsInRegs || this.isGenerator || this.inLocalBlock)) {
                if (this.literals == null) {
                    this.literals = new LinkedList<Node>();
                }
                this.literals.add((Node)object);
                object = new StringBuilder();
                ((StringBuilder)object).append(this.codegen.getBodyMethodName(this.scriptOrFn));
                ((StringBuilder)object).append("_literal");
                ((StringBuilder)object).append(this.literals.size());
                object = ((StringBuilder)object).toString();
                this.cfw.addALoad(this.funObjLocal);
                this.cfw.addALoad(this.contextLocal);
                this.cfw.addALoad(this.variableObjectLocal);
                this.cfw.addALoad(this.thisObjLocal);
                this.cfw.addALoad(this.argsLocal);
                this.cfw.addInvoke(182, this.codegen.mainClassName, (String)object, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
                return;
            }
            if (this.isGenerator) {
                this.addLoadPropertyValues((Node)object, node, n3);
                this.addLoadPropertyIds(objectArray, n3);
                this.cfw.add(95);
            } else {
                this.addLoadPropertyIds(objectArray, n3);
                this.addLoadPropertyValues((Node)object, node, n3);
            }
            object = node;
            for (n2 = 0; n2 != n3; object = ((Node)object).getNext(), ++n2) {
                int n5 = ((Node)object).getType();
                if (n5 != 155 && n5 != 156) {
                    continue;
                }
                n2 = 1;
                break block13;
            }
            n2 = 0;
        }
        if (n2 == 0) {
            this.cfw.add(1);
        } else {
            this.cfw.addPush(n3);
            this.cfw.add(188, 10);
            while (n4 != n3) {
                this.cfw.add(89);
                this.cfw.addPush(n4);
                n2 = node.getType();
                if (n2 == 155) {
                    object = this.cfw;
                    n2 = 2;
                } else if (n2 == 156) {
                    object = this.cfw;
                    n2 = 4;
                } else {
                    object = this.cfw;
                    n2 = 3;
                }
                ((ClassFileWriter)object).add(n2);
                this.cfw.add(79);
                node = node.getNext();
                ++n4;
            }
        }
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        this.addScriptRuntimeInvoke("newObjectLiteral", "([Ljava/lang/Object;[Ljava/lang/Object;[ILorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitOptimizedCall(Node node, OptFunctionNode optFunctionNode, int n2, Node object) {
        short s2;
        Node node2 = ((Node)object).getNext();
        String string = this.codegen.mainClassName;
        if (n2 == 30) {
            this.generateExpression((Node)object, node);
            s2 = 0;
        } else {
            this.generateFunctionAndThisObj((Node)object, node);
            s2 = this.getNewWordLocal();
            this.cfw.addAStore(s2);
        }
        int n3 = this.cfw.acquireLabel();
        int n4 = this.cfw.acquireLabel();
        this.cfw.add(89);
        this.cfw.add(193, string);
        this.cfw.add(153, n4);
        this.cfw.add(192, string);
        this.cfw.add(89);
        this.cfw.add(180, string, "_id", "I");
        this.cfw.addPush(this.codegen.getIndex(optFunctionNode.fnode));
        this.cfw.add(160, n4);
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        object = this.cfw;
        if (n2 == 30) {
            ((ClassFileWriter)object).add(1);
        } else {
            ((ClassFileWriter)object).addALoad(s2);
        }
        for (object = node2; object != null; object = ((Node)object).getNext()) {
            int n5 = this.nodeIsDirectCallParameter((Node)object);
            if (n5 >= 0) {
                this.cfw.addALoad(n5);
                this.cfw.addDLoad(n5 + 1);
                continue;
            }
            if (((Node)object).getIntProp(8, -1) == 0) {
                this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                this.generateExpression((Node)object, node);
                continue;
            }
            this.generateExpression((Node)object, node);
            this.cfw.addPush(0.0);
        }
        this.cfw.add(178, "org/mozilla/javascript/ScriptRuntime", "emptyArgs", "[Ljava/lang/Object;");
        ClassFileWriter classFileWriter = this.cfw;
        Codegen codegen = this.codegen;
        string = codegen.mainClassName;
        object = optFunctionNode.fnode;
        object = n2 == 30 ? codegen.getDirectCtorName((ScriptNode)object) : codegen.getBodyMethodName((ScriptNode)object);
        classFileWriter.addInvoke(184, string, (String)object, this.codegen.getBodyMethodSignature(optFunctionNode.fnode));
        this.cfw.add(167, n3);
        this.cfw.markLabel(n4);
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        if (n2 != 30) {
            this.cfw.addALoad(s2);
            this.releaseWordLocal(s2);
        }
        this.generateCallArgArray(node, node2, true);
        if (n2 == 30) {
            this.addScriptRuntimeInvoke("newObject", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        } else {
            this.cfw.addInvoke(185, "org/mozilla/javascript/Callable", "call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        }
        this.cfw.markLabel(n3);
    }

    private void visitSetConst(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            this.generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addPush(string);
        this.addScriptRuntimeInvoke("setConst", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Ljava/lang/String;)Ljava/lang/Object;");
    }

    /*
     * Unable to fully structure code
     */
    private void visitSetConstVar(Node var1_1, Node var2_2, boolean var3_3) {
        block3: {
            block4: {
                if (!this.hasVarsInRegs) {
                    Kit.codeBug();
                }
                var6_4 = this.fnCurrent.getVarIndex((Node)var1_1);
                this.generateExpression(var2_2.getNext(), (Node)var1_1);
                var5_5 = var1_1.getIntProp(8, -1) != -1 ? 1 : 0;
                var8_6 = this.varRegisters[var6_4];
                var6_4 = this.cfw.acquireLabel();
                var7_7 = this.cfw.acquireLabel();
                if (var5_5 == 0) break block3;
                var1_1 = this.cfw;
                var5_5 = var8_6 + 2;
                var1_1.addILoad(var5_5);
                this.cfw.add(154, var7_7);
                var4_8 = this.cfw.getStackTop();
                this.cfw.addPush(1);
                this.cfw.addIStore(var5_5);
                this.cfw.addDStore(var8_6);
                var1_1 = this.cfw;
                if (!var3_3) break block4;
                var1_1.addDLoad(var8_6);
                ** GOTO lbl41
            }
            var1_1.add(167, var6_4);
            this.cfw.markLabel(var7_7, var4_8);
            var1_1 = this.cfw;
            var5_5 = 88;
            ** GOTO lbl47
        }
        var1_1 = this.cfw;
        var5_5 = var8_6 + 1;
        var1_1.addILoad(var5_5);
        this.cfw.add(154, var7_7);
        var4_8 = this.cfw.getStackTop();
        this.cfw.addPush(1);
        this.cfw.addIStore(var5_5);
        this.cfw.addAStore(var8_6);
        var1_1 = this.cfw;
        if (var3_3) {
            var1_1.addALoad(var8_6);
lbl41:
            // 2 sources

            this.cfw.markLabel(var7_7, var4_8);
        } else {
            var1_1.add(167, var6_4);
            this.cfw.markLabel(var7_7, var4_8);
            var1_1 = this.cfw;
            var5_5 = 87;
lbl47:
            // 2 sources

            var1_1.add(var5_5);
        }
        this.cfw.markLabel(var6_4);
    }

    private void visitSetElem(int n2, Node object, Node object2) {
        this.generateExpression((Node)object2, (Node)object);
        object2 = ((Node)object2).getNext();
        if (n2 == 144) {
            this.cfw.add(89);
        }
        this.generateExpression((Node)object2, (Node)object);
        Node node = ((Node)object2).getNext();
        boolean bl = ((Node)object).getIntProp(8, -1) != -1;
        if (n2 == 144) {
            String string;
            object2 = this.cfw;
            if (bl) {
                ((ClassFileWriter)object2).add(93);
                this.cfw.addALoad(this.contextLocal);
                this.cfw.addALoad(this.variableObjectLocal);
                object2 = "getObjectIndex";
                string = "(Ljava/lang/Object;DLorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else {
                ((ClassFileWriter)object2).add(90);
                this.cfw.addALoad(this.contextLocal);
                this.cfw.addALoad(this.variableObjectLocal);
                object2 = "getObjectElem";
                string = "(Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            }
            this.addScriptRuntimeInvoke((String)object2, string);
        }
        this.generateExpression(node, (Node)object);
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        if (bl) {
            object2 = "setObjectIndex";
            object = "(Ljava/lang/Object;DLjava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
        } else {
            object2 = "setObjectElem";
            object = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
        }
        this.addScriptRuntimeInvoke((String)object2, (String)object);
    }

    private void visitSetName(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            this.generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        this.cfw.addPush(string);
        this.addScriptRuntimeInvoke("setName", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Ljava/lang/Object;");
    }

    private void visitSetProp(int n2, Node node, Node object) {
        this.generateExpression((Node)object, node);
        Node node2 = ((Node)object).getNext();
        if (n2 == 143) {
            this.cfw.add(89);
        }
        this.generateExpression(node2, node);
        Node node3 = node2.getNext();
        if (n2 == 143) {
            this.cfw.add(90);
            if (((Node)object).getType() == 43 && node2.getType() == 41) {
                this.cfw.addALoad(this.contextLocal);
                object = "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;Lorg/mozilla/javascript/Context;)Ljava/lang/Object;";
            } else {
                this.cfw.addALoad(this.contextLocal);
                this.cfw.addALoad(this.variableObjectLocal);
                object = "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            }
            this.addScriptRuntimeInvoke("getObjectProp", (String)object);
        }
        this.generateExpression(node3, node);
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        this.addScriptRuntimeInvoke("setObjectProp", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void visitSetVar(Node object, Node node, boolean bl) {
        boolean bl2;
        short s2;
        block16: {
            block15: {
                int n2;
                int n3;
                block14: {
                    if (!this.hasVarsInRegs) {
                        Kit.codeBug();
                    }
                    n3 = this.fnCurrent.getVarIndex((Node)object);
                    this.generateExpression(node.getNext(), (Node)object);
                    n2 = ((Node)object).getIntProp(8, -1) != -1 ? 1 : 0;
                    s2 = this.varRegisters[n3];
                    if (this.fnCurrent.fnode.getParamAndVarConst()[n3]) {
                        if (bl) return;
                        if (n2 != 0) {
                            object = this.cfw;
                            n2 = 88;
                        } else {
                            object = this.cfw;
                            n2 = 87;
                        }
                        ((ClassFileWriter)object).add(n2);
                        return;
                    }
                    if (!this.varIsDirectCallParameter(n3)) break block14;
                    if (n2 != 0) {
                        if (bl) {
                            this.cfw.add(92);
                        }
                        this.cfw.addALoad(s2);
                        this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                        n2 = this.cfw.acquireLabel();
                        n3 = this.cfw.acquireLabel();
                        this.cfw.add(165, n2);
                        short s3 = this.cfw.getStackTop();
                        this.addDoubleWrap();
                        this.cfw.addAStore(s2);
                        this.cfw.add(167, n3);
                        this.cfw.markLabel(n2, s3);
                        this.cfw.addDStore(s2 + 1);
                        this.cfw.markLabel(n3);
                        return;
                    }
                    if (bl) {
                        this.cfw.add(89);
                    }
                    break block15;
                }
                bl2 = this.fnCurrent.isNumberVar(n3);
                if (n2 == 0) break block16;
                if (bl2) {
                    this.cfw.addDStore(s2);
                    if (!bl) return;
                    this.cfw.addDLoad(s2);
                    return;
                }
                if (bl) {
                    this.cfw.add(92);
                }
                this.addDoubleWrap();
            }
            this.cfw.addAStore(s2);
            return;
        }
        if (bl2) {
            Kit.codeBug();
        }
        this.cfw.addAStore(s2);
        if (!bl) return;
        this.cfw.addALoad(s2);
    }

    private void visitSpecialCall(Node object, int n2, int n3, Node object2) {
        this.cfw.addALoad(this.contextLocal);
        if (n2 == 30) {
            this.generateExpression((Node)object2, (Node)object);
        } else {
            this.generateFunctionAndThisObj((Node)object2, (Node)object);
        }
        this.generateCallArgArray((Node)object, ((Node)object2).getNext(), false);
        object = this.cfw;
        if (n2 == 30) {
            ((ClassFileWriter)object).addALoad(this.variableObjectLocal);
            this.cfw.addALoad(this.thisObjLocal);
            this.cfw.addPush(n3);
            object2 = "newObjectSpecial";
            object = "(Lorg/mozilla/javascript/Context;Ljava/lang/Object;[Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;I)Ljava/lang/Object;";
        } else {
            ((ClassFileWriter)object).addALoad(this.variableObjectLocal);
            this.cfw.addALoad(this.thisObjLocal);
            this.cfw.addPush(n3);
            object2 = this.scriptOrFn.getSourceName();
            ClassFileWriter classFileWriter = this.cfw;
            object = object2;
            if (object2 == null) {
                object = "";
            }
            classFileWriter.addPush((String)object);
            this.cfw.addPush(this.itsLineNumber);
            object2 = "callSpecial";
            object = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;ILjava/lang/String;I)Ljava/lang/Object;";
        }
        this.addOptRuntimeInvoke((String)object2, (String)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void visitStandardCall(Node object, Node object2) {
        if (((Node)object).getType() != 38) throw Codegen.badTree();
        Node node = ((Node)object2).getNext();
        int n2 = ((Node)object2).getType();
        if (node == null) {
            if (n2 == 39) {
                object = ((Node)object2).getString();
                this.cfw.addPush((String)object);
                object = "callName0";
                object2 = "(Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else if (n2 == 33) {
                object2 = ((Node)object2).getFirstChild();
                this.generateExpression((Node)object2, (Node)object);
                object = ((Node)object2).getNext().getString();
                this.cfw.addPush((String)object);
                object = "callProp0";
                object2 = "(Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else {
                if (n2 == 34) throw Kit.codeBug();
                this.generateFunctionAndThisObj((Node)object2, (Node)object);
                object = "call0";
                object2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            }
        } else if (n2 == 39) {
            object2 = ((Node)object2).getString();
            this.generateCallArgArray((Node)object, node, false);
            this.cfw.addPush((String)object2);
            object = "callName";
            object2 = "([Ljava/lang/Object;Ljava/lang/String;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
        } else {
            n2 = 0;
            for (Node node2 = node; node2 != null; node2 = node2.getNext()) {
                ++n2;
            }
            this.generateFunctionAndThisObj((Node)object2, (Node)object);
            if (n2 == 1) {
                this.generateExpression(node, (Node)object);
                object = "call1";
                object2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else if (n2 == 2) {
                this.generateExpression(node, (Node)object);
                this.generateExpression(node.getNext(), (Node)object);
                object = "call2";
                object2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            } else {
                this.generateCallArgArray((Node)object, node, false);
                object = "callN";
                object2 = "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;";
            }
        }
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        this.addOptRuntimeInvoke((String)object, (String)object2);
    }

    private void visitStandardNew(Node node, Node node2) {
        if (node.getType() == 30) {
            Node node3 = node2.getNext();
            this.generateExpression(node2, node);
            this.cfw.addALoad(this.contextLocal);
            this.cfw.addALoad(this.variableObjectLocal);
            this.generateCallArgArray(node, node3, false);
            this.addScriptRuntimeInvoke("newObject", "(Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
            return;
        }
        throw Codegen.badTree();
    }

    private void visitStrictSetName(Node node, Node node2) {
        String string = node.getFirstChild().getString();
        while (node2 != null) {
            this.generateExpression(node2, node);
            node2 = node2.getNext();
        }
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        this.cfw.addPush(string);
        this.addScriptRuntimeInvoke("strictSetName", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Ljava/lang/Object;");
    }

    private void visitSwitch(Jump jump, Node node) {
        this.generateExpression(node, jump);
        short s2 = this.getNewWordLocal();
        this.cfw.addAStore(s2);
        while ((node = (Jump)node.getNext()) != null) {
            if (node.getType() == 119) {
                this.generateExpression(node.getFirstChild(), node);
                this.cfw.addALoad(s2);
                this.addScriptRuntimeInvoke("shallowEq", "(Ljava/lang/Object;Ljava/lang/Object;)Z");
                this.addGoto(((Jump)node).target, 154);
                continue;
            }
            throw Codegen.badTree();
        }
        this.releaseWordLocal(s2);
    }

    private void visitTemplateLiteral(Node object) {
        int n2 = ((Node)object).getExistingIntProp(28);
        this.cfw.addALoad(this.contextLocal);
        this.cfw.addALoad(this.variableObjectLocal);
        ClassFileWriter classFileWriter = this.cfw;
        object = this.codegen;
        classFileWriter.add(178, ((Codegen)object).mainClassName, ((Codegen)object).getTemplateLiteralName(this.scriptOrFn), "[Ljava/lang/Object;");
        this.cfw.addPush(n2);
        this.cfw.addInvoke(184, "org/mozilla/javascript/ScriptRuntime", "getTemplateLiteralCallSite", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;I)Lorg/mozilla/javascript/Scriptable;");
    }

    private void visitTryCatchFinally(Jump object, Node node) {
        int n2;
        int n3;
        Object object2;
        short s2 = this.getNewWordLocal();
        this.cfw.addALoad(this.variableObjectLocal);
        this.cfw.addAStore(s2);
        int n4 = this.cfw.acquireLabel();
        this.cfw.markLabel(n4, (short)0);
        Node node2 = ((Jump)object).target;
        Node node3 = ((Jump)object).getFinally();
        int[] nArray = new int[5];
        this.exceptionManager.pushExceptionInfo((Jump)object);
        if (node2 != null) {
            nArray[0] = this.cfw.acquireLabel();
            nArray[1] = this.cfw.acquireLabel();
            nArray[2] = this.cfw.acquireLabel();
            object2 = Context.getCurrentContext();
            if (object2 != null && ((Context)object2).hasFeature(13)) {
                nArray[3] = this.cfw.acquireLabel();
            }
        }
        if (node3 != null) {
            nArray[4] = this.cfw.acquireLabel();
        }
        this.exceptionManager.setHandlers(nArray, n4);
        if (this.isGenerator && node3 != null) {
            object2 = new BodyCodegen$FinallyReturnPoint();
            if (this.finallys == null) {
                this.finallys = new HashMap<Node, BodyCodegen$FinallyReturnPoint>();
            }
            this.finallys.put(node3, (BodyCodegen$FinallyReturnPoint)object2);
            this.finallys.put(node3.getNext(), (BodyCodegen$FinallyReturnPoint)object2);
        }
        while (node != null) {
            if (node == node2) {
                n3 = this.getTargetLabel(node2);
                this.exceptionManager.removeHandler(0, n3);
                this.exceptionManager.removeHandler(1, n3);
                this.exceptionManager.removeHandler(2, n3);
                this.exceptionManager.removeHandler(3, n3);
            }
            this.generateStatement(node);
            node = node.getNext();
        }
        int n5 = this.cfw.acquireLabel();
        this.cfw.add(167, n5);
        n3 = BodyCodegen.getLocalBlockRegister((Node)object);
        if (node2 != null) {
            n2 = node2.labelId();
            this.generateCatchBlock(0, s2, n2, n3, nArray[0]);
            this.generateCatchBlock(1, s2, n2, n3, nArray[1]);
            this.generateCatchBlock(2, s2, n2, n3, nArray[2]);
            object = Context.getCurrentContext();
            if (object != null && ((Context)object).hasFeature(13)) {
                this.generateCatchBlock(3, s2, n2, n3, nArray[3]);
            }
        }
        if (node3 != null) {
            n2 = this.cfw.acquireLabel();
            int n6 = this.cfw.acquireLabel();
            this.cfw.markHandler(n2);
            if (!this.isGenerator) {
                this.cfw.markLabel(nArray[4]);
            }
            this.cfw.addAStore(n3);
            this.cfw.addALoad(s2);
            this.cfw.addAStore(this.variableObjectLocal);
            int n7 = node3.labelId();
            if (this.isGenerator) {
                this.addGotoWithReturn(node3);
            } else {
                this.inlineFinally(node3, nArray[4], n6);
            }
            this.cfw.addALoad(n3);
            if (this.isGenerator) {
                this.cfw.add(192, "java/lang/Throwable");
            }
            this.cfw.add(191);
            this.cfw.markLabel(n6);
            if (this.isGenerator) {
                this.cfw.addExceptionHandler(n4, n7, n2, null);
            }
        }
        this.releaseWordLocal(s2);
        this.cfw.markLabel(n5);
        if (!this.isGenerator) {
            this.exceptionManager.popExceptionInfo();
        }
    }

    private void visitTypeofname(Node node) {
        int n2;
        if (this.hasVarsInRegs && (n2 = this.fnCurrent.fnode.getIndexForNameNode(node)) >= 0) {
            if (this.fnCurrent.isNumberVar(n2)) {
                this.cfw.addPush("number");
            } else if (this.varIsDirectCallParameter(n2)) {
                int n3 = this.varRegisters[n2];
                this.cfw.addALoad(n3);
                this.cfw.add(178, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
                n2 = this.cfw.acquireLabel();
                this.cfw.add(165, n2);
                short s2 = this.cfw.getStackTop();
                this.cfw.addALoad(n3);
                this.addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
                n3 = this.cfw.acquireLabel();
                this.cfw.add(167, n3);
                this.cfw.markLabel(n2, s2);
                this.cfw.addPush("number");
                this.cfw.markLabel(n3);
            } else {
                this.cfw.addALoad(this.varRegisters[n2]);
                this.addScriptRuntimeInvoke("typeof", "(Ljava/lang/Object;)Ljava/lang/String;");
            }
            return;
        }
        this.cfw.addALoad(this.variableObjectLocal);
        this.cfw.addPush(node.getString());
        this.addScriptRuntimeInvoke("typeofName", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Ljava/lang/String;");
    }

    void generateBodyCode() {
        Object object;
        this.isGenerator = Codegen.isGenerator(this.scriptOrFn);
        this.initBodyGeneration();
        if (this.isGenerator) {
            object = r.c(a.c("("), this.codegen.mainClassSignature, "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;");
            this.cfw.startMethod(r.c(new StringBuilder(), this.codegen.getBodyMethodName(this.scriptOrFn), "_gen"), (String)object, (short)10);
        } else {
            this.cfw.startMethod(this.codegen.getBodyMethodName(this.scriptOrFn), this.codegen.getBodyMethodSignature(this.scriptOrFn), (short)10);
        }
        this.generatePrologue();
        object = this.fnCurrent != null ? this.scriptOrFn.getLastChild() : this.scriptOrFn;
        this.generateStatement((Node)object);
        this.generateEpilogue();
        this.cfw.stopMethod((short)(this.localsMax + 1));
        if (this.isGenerator) {
            this.generateGenerator();
        }
        if (this.literals != null) {
            for (int i2 = 0; i2 < this.literals.size(); ++i2) {
                object = this.literals.get(i2);
                int n2 = ((Node)object).getType();
                if (n2 != 66) {
                    if (n2 != 67) {
                        Kit.codeBug(Token.typeToName(n2));
                        continue;
                    }
                    this.generateObjectLiteralFactory((Node)object, i2 + 1);
                    continue;
                }
                this.generateArrayLiteralFactory((Node)object, i2 + 1);
            }
        }
    }
}

