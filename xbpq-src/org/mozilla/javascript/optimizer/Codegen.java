/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.TemplateCharacters;
import org.mozilla.javascript.optimizer.BodyCodegen;
import org.mozilla.javascript.optimizer.OptFunctionNode;
import org.mozilla.javascript.optimizer.OptTransformer;
import org.mozilla.javascript.optimizer.Optimizer;

public class Codegen
implements Evaluator {
    static final String DEFAULT_MAIN_METHOD_CLASS = "org.mozilla.javascript.optimizer.OptRuntime";
    static final String FUNCTION_CONSTRUCTOR_SIGNATURE = "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V";
    static final String FUNCTION_INIT_SIGNATURE = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V";
    static final String ID_FIELD_NAME = "_id";
    static final String REGEXP_INIT_METHOD_NAME = "_reInit";
    static final String REGEXP_INIT_METHOD_SIGNATURE = "(Lorg/mozilla/javascript/Context;)V";
    private static final String SUPER_CLASS_NAME = "org.mozilla.javascript.NativeFunction";
    static final String TEMPLATE_LITERAL_INIT_METHOD_NAME = "_qInit";
    static final String TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE = "()V";
    private static final Object globalLock = new Object();
    private static int globalSerialClassCounter;
    private CompilerEnvirons compilerEnv;
    private ObjArray directCallTargets;
    private double[] itsConstantList;
    private int itsConstantListSize;
    String mainClassName;
    String mainClassSignature;
    private String mainMethodClass = "org.mozilla.javascript.optimizer.OptRuntime";
    private ObjToIntMap scriptOrFnIndexes;
    ScriptNode[] scriptOrFnNodes;

    private static void addDoubleWrap(ClassFileWriter classFileWriter) {
        classFileWriter.addInvoke(184, "org/mozilla/javascript/optimizer/OptRuntime", "wrapDouble", "(D)Ljava/lang/Double;");
    }

    static RuntimeException badTree() {
        throw new RuntimeException("Bad tree in codegen");
    }

    private static void collectScriptNodes_r(ScriptNode scriptNode, ObjArray objArray) {
        objArray.add(scriptNode);
        int n2 = scriptNode.getFunctionCount();
        for (int i2 = 0; i2 != n2; ++i2) {
            Codegen.collectScriptNodes_r(scriptNode.getFunctionNode(i2), objArray);
        }
    }

    /*
     * WARNING - void declaration
     */
    private Class<?> defineClass(Object clazz, Object object) {
        void var1_4;
        Object[] objectArray = (Object[])clazz;
        clazz = (String)objectArray[0];
        objectArray = (byte[])objectArray[1];
        object = SecurityController.createLoader(this.getClass().getClassLoader(), object);
        try {
            clazz = object.defineClass((String)((Object)clazz), (byte[])objectArray);
            object.linkClass(clazz);
            return clazz;
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Malformed optimizer package ");
        ((StringBuilder)object).append(var1_4);
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    private void emitConstantDudeInitializers(ClassFileWriter classFileWriter) {
        int n2 = this.itsConstantListSize;
        if (n2 == 0) {
            return;
        }
        classFileWriter.startMethod("<clinit>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short)24);
        double[] dArray = this.itsConstantList;
        for (int i2 = 0; i2 != n2; ++i2) {
            double d2 = dArray[i2];
            String string = r.a("_k", i2);
            String string2 = Codegen.getStaticConstantWrapperType(d2);
            classFileWriter.addField(string, string2, (short)10);
            int n3 = (int)d2;
            if ((double)n3 == d2) {
                classFileWriter.addPush(n3);
                classFileWriter.addInvoke(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            } else {
                classFileWriter.addPush(d2);
                Codegen.addDoubleWrap(classFileWriter);
            }
            classFileWriter.add(179, this.mainClassName, string, string2);
        }
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)0);
    }

    private void emitDirectConstructor(ClassFileWriter classFileWriter, OptFunctionNode optFunctionNode) {
        int n2;
        classFileWriter.startMethod(this.getDirectCtorName(optFunctionNode.fnode), this.getBodyMethodSignature(optFunctionNode.fnode), (short)10);
        int n3 = optFunctionNode.fnode.getParamCount();
        int n4 = n3 * 3 + 4;
        int n5 = n4 + 1;
        classFileWriter.addALoad(0);
        classFileWriter.addALoad(1);
        classFileWriter.addALoad(2);
        classFileWriter.addInvoke(182, "org/mozilla/javascript/BaseFunction", "createObject", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.addAStore(n5);
        classFileWriter.addALoad(0);
        classFileWriter.addALoad(1);
        classFileWriter.addALoad(2);
        classFileWriter.addALoad(n5);
        for (n2 = 0; n2 < n3; ++n2) {
            int n6 = n2 * 3;
            classFileWriter.addALoad(n6 + 4);
            classFileWriter.addDLoad(n6 + 5);
        }
        classFileWriter.addALoad(n4);
        classFileWriter.addInvoke(184, this.mainClassName, this.getBodyMethodName(optFunctionNode.fnode), this.getBodyMethodSignature(optFunctionNode.fnode));
        n2 = classFileWriter.acquireLabel();
        classFileWriter.add(89);
        classFileWriter.add(193, "org/mozilla/javascript/Scriptable");
        classFileWriter.add(153, n2);
        classFileWriter.add(192, "org/mozilla/javascript/Scriptable");
        classFileWriter.add(176);
        classFileWriter.markLabel(n2);
        classFileWriter.addALoad(n5);
        classFileWriter.add(176);
        classFileWriter.stopMethod((short)(n5 + 1));
    }

    private void emitRegExpInit(ClassFileWriter classFileWriter) {
        Object object;
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 != ((ScriptNode[])(object = this.scriptOrFnNodes)).length; ++n2) {
            n3 += object[n2].getRegexpCount();
        }
        if (n3 == 0) {
            return;
        }
        classFileWriter.startMethod(REGEXP_INIT_METHOD_NAME, REGEXP_INIT_METHOD_SIGNATURE, (short)10);
        classFileWriter.addField("_reInitDone", "Z", (short)74);
        classFileWriter.add(178, this.mainClassName, "_reInitDone", "Z");
        n2 = classFileWriter.acquireLabel();
        classFileWriter.add(153, n2);
        classFileWriter.add(177);
        classFileWriter.markLabel(n2);
        classFileWriter.addALoad(0);
        classFileWriter.addInvoke(184, "org/mozilla/javascript/ScriptRuntime", "checkRegExpProxy", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
        classFileWriter.addAStore(1);
        for (n2 = 0; n2 != ((ScriptNode[])(object = this.scriptOrFnNodes)).length; ++n2) {
            object = object[n2];
            int n4 = ((ScriptNode)object).getRegexpCount();
            for (n3 = 0; n3 != n4; ++n3) {
                String string = this.getCompiledRegexpName((ScriptNode)object, n3);
                String string2 = ((ScriptNode)object).getRegexpString(n3);
                String string3 = ((ScriptNode)object).getRegexpFlags(n3);
                classFileWriter.addField(string, "Ljava/lang/Object;", (short)10);
                classFileWriter.addALoad(1);
                classFileWriter.addALoad(0);
                classFileWriter.addPush(string2);
                if (string3 == null) {
                    classFileWriter.add(1);
                } else {
                    classFileWriter.addPush(string3);
                }
                classFileWriter.addInvoke(185, "org/mozilla/javascript/RegExpProxy", "compileRegExp", "(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;");
                classFileWriter.add(179, this.mainClassName, string, "Ljava/lang/Object;");
            }
        }
        classFileWriter.addPush(1);
        classFileWriter.add(179, this.mainClassName, "_reInitDone", "Z");
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)2);
    }

    private void emitTemplateLiteralInit(ClassFileWriter classFileWriter) {
        int n2;
        Object object = this.scriptOrFnNodes;
        int n3 = ((ScriptNode[])object).length;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            n4 += object[n2].getTemplateLiteralCount();
        }
        if (n4 == 0) {
            return;
        }
        classFileWriter.startMethod(TEMPLATE_LITERAL_INIT_METHOD_NAME, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short)10);
        classFileWriter.addField("_qInitDone", "Z", (short)74);
        classFileWriter.add(178, this.mainClassName, "_qInitDone", "Z");
        n4 = classFileWriter.acquireLabel();
        classFileWriter.add(153, n4);
        classFileWriter.add(177);
        classFileWriter.markLabel(n4);
        for (ScriptNode scriptNode : this.scriptOrFnNodes) {
            int n5 = scriptNode.getTemplateLiteralCount();
            if (n5 == 0) continue;
            object = this.getTemplateLiteralName(scriptNode);
            classFileWriter.addField((String)object, "[Ljava/lang/Object;", (short)10);
            classFileWriter.addPush(n5);
            classFileWriter.add(189, "java/lang/Object");
            for (n2 = 0; n2 < n5; ++n2) {
                Object object2 = scriptNode.getTemplateLiteralStrings(n2);
                classFileWriter.add(89);
                classFileWriter.addPush(n2);
                classFileWriter.addPush(object2.size() * 2);
                classFileWriter.add(189, "java/lang/String");
                object2 = object2.iterator();
                n3 = 0;
                while (object2.hasNext()) {
                    TemplateCharacters templateCharacters = (TemplateCharacters)object2.next();
                    classFileWriter.add(89);
                    int n6 = n3 + 1;
                    classFileWriter.addPush(n3);
                    if (templateCharacters.getValue() != null) {
                        classFileWriter.addPush(templateCharacters.getValue());
                    } else {
                        classFileWriter.add(1);
                    }
                    classFileWriter.add(83);
                    classFileWriter.add(89);
                    classFileWriter.addPush(n6);
                    classFileWriter.addPush(templateCharacters.getRawValue());
                    classFileWriter.add(83);
                    n3 = n6 + 1;
                }
                classFileWriter.add(83);
            }
            classFileWriter.add(179, this.mainClassName, (String)object, "[Ljava/lang/Object;");
        }
        classFileWriter.addPush(true);
        classFileWriter.add(179, this.mainClassName, "_qInitDone", "Z");
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)0);
    }

    private void generateCallMethod(ClassFileWriter classFileWriter, boolean bl) {
        int n2;
        classFileWriter.startMethod("call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", (short)17);
        int n3 = classFileWriter.acquireLabel();
        classFileWriter.addALoad(1);
        classFileWriter.addInvoke(184, "org/mozilla/javascript/ScriptRuntime", "hasTopCall", "(Lorg/mozilla/javascript/Context;)Z");
        classFileWriter.add(154, n3);
        classFileWriter.addALoad(0);
        classFileWriter.addALoad(1);
        classFileWriter.addALoad(2);
        classFileWriter.addALoad(3);
        classFileWriter.addALoad(4);
        classFileWriter.addPush(bl);
        classFileWriter.addInvoke(184, "org/mozilla/javascript/ScriptRuntime", "doTopCall", "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Z)Ljava/lang/Object;");
        classFileWriter.add(176);
        classFileWriter.markLabel(n3);
        classFileWriter.addALoad(0);
        classFileWriter.addALoad(1);
        classFileWriter.addALoad(2);
        classFileWriter.addALoad(3);
        classFileWriter.addALoad(4);
        int n4 = this.scriptOrFnNodes.length;
        n3 = 2 <= n4 ? 1 : 0;
        if (n3 != 0) {
            classFileWriter.addLoadThis();
            classFileWriter.add(180, classFileWriter.getClassName(), ID_FIELD_NAME, "I");
            n2 = classFileWriter.addTableSwitch(1, n4 - 1);
        } else {
            n2 = 0;
        }
        int n5 = 0;
        for (int i2 = 0; i2 != n4; ++i2) {
            int n6;
            OptFunctionNode optFunctionNode;
            ScriptNode scriptNode = this.scriptOrFnNodes[i2];
            int n7 = n5;
            if (n3 != 0) {
                if (i2 == 0) {
                    classFileWriter.markTableSwitchDefault(n2);
                    n7 = classFileWriter.getStackTop();
                } else {
                    classFileWriter.markTableSwitchCase(n2, i2 - 1, n5);
                    n7 = n5;
                }
            }
            if (scriptNode.getType() == 113 && (optFunctionNode = OptFunctionNode.get(scriptNode)).isTargetOfDirectCall() && (n6 = optFunctionNode.fnode.getParamCount()) != 0) {
                for (n5 = 0; n5 != n6; ++n5) {
                    classFileWriter.add(190);
                    classFileWriter.addPush(n5);
                    int n8 = classFileWriter.acquireLabel();
                    int n9 = classFileWriter.acquireLabel();
                    classFileWriter.add(164, n8);
                    classFileWriter.addALoad(4);
                    classFileWriter.addPush(n5);
                    classFileWriter.add(50);
                    classFileWriter.add(167, n9);
                    classFileWriter.markLabel(n8);
                    Codegen.pushUndefined(classFileWriter);
                    classFileWriter.markLabel(n9);
                    classFileWriter.adjustStackTop(-1);
                    classFileWriter.addPush(0.0);
                    classFileWriter.addALoad(4);
                }
            }
            classFileWriter.addInvoke(184, this.mainClassName, this.getBodyMethodName(scriptNode), this.getBodyMethodSignature(scriptNode));
            classFileWriter.add(176);
            n5 = n7;
        }
        classFileWriter.stopMethod((short)5);
    }

    private byte[] generateCode(String object) {
        Object object2 = this.scriptOrFnNodes;
        int n2 = 0;
        int n3 = object2[0].getType();
        int n4 = 1;
        n3 = n3 == 140 ? 1 : 0;
        object2 = this.scriptOrFnNodes;
        int n5 = n4;
        if (((ScriptNode[])object2).length <= 1) {
            n5 = n3 == 0 ? n4 : 0;
        }
        boolean bl = object2[0].isInStrictMode();
        object2 = null;
        if (this.compilerEnv.isGenerateDebugInfo()) {
            object2 = this.scriptOrFnNodes[0].getSourceName();
        }
        object2 = new ClassFileWriter(this.mainClassName, SUPER_CLASS_NAME, (String)object2);
        ((ClassFileWriter)object2).addField(ID_FIELD_NAME, "I", (short)2);
        if (n5 != 0) {
            this.generateFunctionConstructor((ClassFileWriter)object2);
        }
        if (n3 != 0) {
            ((ClassFileWriter)object2).addInterface("org/mozilla/javascript/Script");
            Codegen.generateScriptCtor((ClassFileWriter)object2);
            this.generateMain((ClassFileWriter)object2);
            Codegen.generateExecute((ClassFileWriter)object2);
        }
        this.generateCallMethod((ClassFileWriter)object2, bl);
        this.generateResumeGenerator((ClassFileWriter)object2);
        this.generateNativeFunctionOverrides((ClassFileWriter)object2, (String)object);
        n5 = this.scriptOrFnNodes.length;
        for (n3 = n2; n3 != n5; ++n3) {
            ScriptNode scriptNode = this.scriptOrFnNodes[n3];
            object = new BodyCodegen();
            ((BodyCodegen)object).cfw = object2;
            ((BodyCodegen)object).codegen = this;
            ((BodyCodegen)object).compilerEnv = this.compilerEnv;
            ((BodyCodegen)object).scriptOrFn = scriptNode;
            ((BodyCodegen)object).scriptOrFnIndex = n3;
            ((BodyCodegen)object).generateBodyCode();
            if (scriptNode.getType() != 113) continue;
            object = OptFunctionNode.get(scriptNode);
            this.generateFunctionInit((ClassFileWriter)object2, (OptFunctionNode)object);
            if (!((OptFunctionNode)object).isTargetOfDirectCall()) continue;
            this.emitDirectConstructor((ClassFileWriter)object2, (OptFunctionNode)object);
        }
        this.emitRegExpInit((ClassFileWriter)object2);
        this.emitTemplateLiteralInit((ClassFileWriter)object2);
        this.emitConstantDudeInitializers((ClassFileWriter)object2);
        return ((ClassFileWriter)object2).toByteArray();
    }

    private static void generateExecute(ClassFileWriter classFileWriter) {
        classFileWriter.startMethod("exec", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;", (short)17);
        classFileWriter.addLoadThis();
        classFileWriter.addALoad(1);
        classFileWriter.addALoad(2);
        classFileWriter.add(89);
        classFileWriter.add(1);
        classFileWriter.addInvoke(182, classFileWriter.getClassName(), "call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        classFileWriter.addALoad(1);
        classFileWriter.addInvoke(182, "org.mozilla.javascript.Context", "processMicrotasks", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        classFileWriter.add(176);
        classFileWriter.stopMethod((short)3);
    }

    private void generateFunctionConstructor(ClassFileWriter classFileWriter) {
        boolean bl = true;
        classFileWriter.startMethod("<init>", FUNCTION_CONSTRUCTOR_SIGNATURE, (short)1);
        short s2 = 0;
        classFileWriter.addALoad(0);
        classFileWriter.addInvoke(183, SUPER_CLASS_NAME, "<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        classFileWriter.addLoadThis();
        classFileWriter.addILoad(3);
        classFileWriter.add(181, classFileWriter.getClassName(), ID_FIELD_NAME, "I");
        classFileWriter.addLoadThis();
        classFileWriter.addALoad(2);
        classFileWriter.addALoad(1);
        int n2 = this.scriptOrFnNodes[0].getType() == 140 ? 1 : 0;
        int n3 = this.scriptOrFnNodes.length;
        if (n2 != n3) {
            int n4;
            if (2 > n3 - n2) {
                bl = false;
            }
            if (bl) {
                classFileWriter.addILoad(3);
                n4 = classFileWriter.addTableSwitch(n2 + 1, n3 - 1);
            } else {
                n4 = 0;
            }
            for (int i2 = n2; i2 != n3; ++i2) {
                short s3 = s2;
                if (bl) {
                    if (i2 == n2) {
                        classFileWriter.markTableSwitchDefault(n4);
                        s3 = classFileWriter.getStackTop();
                    } else {
                        classFileWriter.markTableSwitchCase(n4, i2 - 1 - n2, s2);
                        s3 = s2;
                    }
                }
                OptFunctionNode optFunctionNode = OptFunctionNode.get(this.scriptOrFnNodes[i2]);
                classFileWriter.addInvoke(183, this.mainClassName, this.getFunctionInitMethodName(optFunctionNode), FUNCTION_INIT_SIGNATURE);
                classFileWriter.add(177);
                s2 = s3;
            }
            classFileWriter.stopMethod((short)4);
            return;
        }
        throw Codegen.badTree();
    }

    private void generateFunctionInit(ClassFileWriter classFileWriter, OptFunctionNode optFunctionNode) {
        classFileWriter.startMethod(this.getFunctionInitMethodName(optFunctionNode), FUNCTION_INIT_SIGNATURE, (short)18);
        classFileWriter.addLoadThis();
        classFileWriter.addALoad(1);
        classFileWriter.addALoad(2);
        classFileWriter.addInvoke(182, "org/mozilla/javascript/NativeFunction", "initScriptFunction", FUNCTION_INIT_SIGNATURE);
        if (optFunctionNode.fnode.getRegexpCount() != 0) {
            classFileWriter.addALoad(1);
            classFileWriter.addInvoke(184, this.mainClassName, REGEXP_INIT_METHOD_NAME, REGEXP_INIT_METHOD_SIGNATURE);
        }
        if (optFunctionNode.fnode.getTemplateLiteralCount() != 0) {
            classFileWriter.addInvoke(184, this.mainClassName, TEMPLATE_LITERAL_INIT_METHOD_NAME, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        }
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)3);
    }

    private void generateMain(ClassFileWriter classFileWriter) {
        classFileWriter.startMethod("main", "([Ljava/lang/String;)V", (short)9);
        classFileWriter.add(187, classFileWriter.getClassName());
        classFileWriter.add(89);
        classFileWriter.addInvoke(183, classFileWriter.getClassName(), "<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        classFileWriter.add(42);
        classFileWriter.addInvoke(184, this.mainMethodClass, "main", "(Lorg/mozilla/javascript/Script;[Ljava/lang/String;)V");
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void generateNativeFunctionOverrides(ClassFileWriter var1_1, String var2_2) {
        var1_1.startMethod("getLanguageVersion", "()I", (short)1);
        var1_1.addPush(this.compilerEnv.getLanguageVersion());
        var4_3 = 172;
        var1_1.add(172);
        var1_1.stopMethod((short)1);
        for (var6_4 = 0; var6_4 != 8; ++var6_4) {
            block43: {
                block42: {
                    if (var6_4 == 4 && var2_2 == null) continue;
                    switch (var6_4) {
                        default: {
                            throw Kit.codeBug();
                        }
                        case 7: {
                            var1_1.startMethod("hasRestParameter", "()Z", (short)1);
                            break block42;
                        }
                        case 6: {
                            var1_1.startMethod("isGeneratorFunction", "()Z", (short)4);
                            break block42;
                        }
                        case 5: {
                            var1_1.startMethod("getParamOrVarConst", "(I)Z", (short)1);
                            var3_5 = 3;
                            break block43;
                        }
                        case 4: {
                            var1_1.startMethod("getEncodedSource", "()Ljava/lang/String;", (short)1);
                            var1_1.addPush(var2_2);
                            break block42;
                        }
                        case 3: {
                            var3_5 = 2;
                            var1_1.startMethod("getParamOrVarName", "(I)Ljava/lang/String;", (short)1);
                            break block43;
                        }
                        case 2: {
                            var15_15 = "getParamAndVarCount";
                            ** GOTO lbl34
                        }
                        case 1: {
                            var15_15 = "getParamCount";
lbl34:
                            // 2 sources

                            var1_1.startMethod((String)var15_15, "()I", (short)1);
                            break block42;
                        }
                        case 0: 
                    }
                    var1_1.startMethod("getFunctionName", "()Ljava/lang/String;", (short)1);
                }
                var3_5 = 1;
            }
            var11_11 = this.scriptOrFnNodes.length;
            if (var11_11 > 1) {
                var1_1.addLoadThis();
                var1_1.add(180, var1_1.getClassName(), "_id", "I");
                var7_7 = var1_1.addTableSwitch(1, var11_11 - 1);
            } else {
                var7_7 = 0;
            }
            var9_9 = 0;
            block21: for (var8_8 = 0; var8_8 != var11_11; ++var8_8) {
                var16_16 = this.scriptOrFnNodes[var8_8];
                if (var8_8 == 0) {
                    if (var11_11 > 1) {
                        var1_1.markTableSwitchDefault(var7_7);
                        var9_9 = var1_1.getStackTop();
                    }
                } else {
                    var1_1.markTableSwitchCase(var7_7, var8_8 - 1, var9_9);
                }
                switch (var6_4) {
                    default: {
                        throw Kit.codeBug();
                    }
                    case 7: {
                        var14_14 /* !! */  = var16_16.hasRestParameter();
lbl62:
                        // 3 sources

                        while (true) {
                            var1_1.addPush(var14_14 /* !! */ );
                            ** GOTO lbl138
                            break;
                        }
                    }
                    case 6: {
                        if (!(var16_16 instanceof FunctionNode)) ** GOTO lbl69
                        var14_14 /* !! */  = ((FunctionNode)var16_16).isES6Generator();
                        ** GOTO lbl62
lbl69:
                        // 1 sources

                        var1_1.addPush(false);
                        ** GOTO lbl138
                    }
                    case 5: {
                        var13_13 = var16_16.getParamAndVarCount();
                        var15_15 = var16_16.getParamAndVarConst();
                        if (var13_13 != 0) ** GOTO lbl77
                        var1_1.add(3);
                        ** GOTO lbl138
lbl77:
                        // 1 sources

                        if (var13_13 == 1) {
                            var14_14 /* !! */  = var15_15[0];
                            ** continue;
                        }
                        var1_1.addILoad(1);
                        var12_12 = var1_1.addTableSwitch(1, var13_13 - 1);
                        var10_10 = 0;
                        while (true) {
                            var5_6 = var4_3;
                            if (var10_10 != var13_13) {
                                if (var1_1.getStackTop() != 0) {
                                    Kit.codeBug();
                                }
                                if (var10_10 == 0) {
                                    var1_1.markTableSwitchDefault(var12_12);
                                } else {
                                    var1_1.markTableSwitchCase(var12_12, var10_10 - 1, 0);
                                }
                                var1_1.addPush((boolean)var15_15[var10_10]);
                                var1_1.add(var4_3);
                                ++var10_10;
                                continue;
                            }
                            ** GOTO lbl140
                            break;
                        }
                    }
                    case 4: {
                        var1_1.addPush(var16_16.getEncodedSourceStart());
                        var1_1.addPush(var16_16.getEncodedSourceEnd());
                        var1_1.addInvoke(182, "java/lang/String", "substring", "(II)Ljava/lang/String;");
                        var1_1.add(176);
                        var5_6 = var4_3;
                        ** GOTO lbl140
                    }
                    case 3: {
                        var12_12 = var16_16.getParamAndVarCount();
                        if (var12_12 == 0) {
                            var1_1.add(1);
lbl109:
                            // 2 sources

                            while (true) {
                                var1_1.add(176);
                                continue block21;
                                break;
                            }
                        }
                        if (var12_12 == 1) {
                            var1_1.addPush(var16_16.getParamOrVarName(0));
                            ** continue;
                        }
                        var1_1.addILoad(1);
                        var13_13 = var1_1.addTableSwitch(1, var12_12 - 1);
                        var10_10 = 0;
                        while (true) {
                            var5_6 = var4_3;
                            if (var10_10 != var12_12) {
                                if (var1_1.getStackTop() != 0) {
                                    Kit.codeBug();
                                }
                                var15_15 = var16_16.getParamOrVarName(var10_10);
                                if (var10_10 == 0) {
                                    var1_1.markTableSwitchDefault(var13_13);
                                } else {
                                    var1_1.markTableSwitchCase(var13_13, var10_10 - 1, 0);
                                }
                                var1_1.addPush((String)var15_15);
                                var1_1.add(176);
                                ++var10_10;
                                var4_3 = 172;
                                continue;
                            }
                            ** GOTO lbl140
                            break;
                        }
                    }
                    case 2: {
                        var1_1.addPush(var16_16.getParamAndVarCount());
                        var4_3 = 172;
lbl138:
                        // 4 sources

                        var1_1.add(var4_3);
                        var5_6 = var4_3;
lbl140:
                        // 4 sources

                        var4_3 = var5_6;
                        continue block21;
                    }
                    case 1: {
                        var5_6 = var16_16.hasRestParameter() != false ? var16_16.getParamCount() - 1 : var16_16.getParamCount();
                        var1_1.addPush(var5_6);
                        var1_1.add(var4_3);
                        continue block21;
                    }
                    case 0: 
                }
                var15_15 = var16_16.getType() == 140 ? "" : ((FunctionNode)var16_16).getName();
                var1_1.addPush((String)var15_15);
                var1_1.add(176);
            }
            var1_1.stopMethod(var3_5);
        }
    }

    private void generateResumeGenerator(ClassFileWriter classFileWriter) {
        int n2;
        Object object = this.scriptOrFnNodes;
        int n3 = ((ScriptNode[])object).length;
        int n4 = 0;
        int n5 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            if (!Codegen.isGenerator(object[n2])) continue;
            n5 = 1;
        }
        if (n5 == 0) {
            return;
        }
        classFileWriter.startMethod("resumeGenerator", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", (short)17);
        classFileWriter.addALoad(0);
        classFileWriter.addALoad(1);
        classFileWriter.addALoad(2);
        classFileWriter.addALoad(4);
        classFileWriter.addALoad(5);
        classFileWriter.addILoad(3);
        classFileWriter.addLoadThis();
        classFileWriter.add(180, classFileWriter.getClassName(), ID_FIELD_NAME, "I");
        n5 = classFileWriter.addTableSwitch(0, this.scriptOrFnNodes.length - 1);
        classFileWriter.markTableSwitchDefault(n5);
        n3 = classFileWriter.acquireLabel();
        for (n2 = n4; n2 < ((ScriptNode[])(object = this.scriptOrFnNodes)).length; ++n2) {
            object = object[n2];
            classFileWriter.markTableSwitchCase(n5, n2, 6);
            if (Codegen.isGenerator((ScriptNode)object)) {
                String string = r.c(a.c("("), this.mainClassSignature, "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;");
                classFileWriter.addInvoke(184, this.mainClassName, r.c(new StringBuilder(), this.getBodyMethodName((ScriptNode)object), "_gen"), string);
                classFileWriter.add(176);
                continue;
            }
            classFileWriter.add(167, n3);
        }
        classFileWriter.markLabel(n3);
        Codegen.pushUndefined(classFileWriter);
        classFileWriter.add(176);
        classFileWriter.stopMethod((short)6);
    }

    private static void generateScriptCtor(ClassFileWriter classFileWriter) {
        classFileWriter.startMethod("<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short)1);
        classFileWriter.addLoadThis();
        classFileWriter.addInvoke(183, SUPER_CLASS_NAME, "<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        classFileWriter.addLoadThis();
        classFileWriter.addPush(0);
        classFileWriter.add(181, classFileWriter.getClassName(), ID_FIELD_NAME, "I");
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)1);
    }

    private static String getStaticConstantWrapperType(double d2) {
        if ((double)((int)d2) == d2) {
            return "Ljava/lang/Integer;";
        }
        return "Ljava/lang/Double;";
    }

    private static void initOptFunctions_r(ScriptNode scriptNode) {
        int n2 = scriptNode.getFunctionCount();
        for (int i2 = 0; i2 != n2; ++i2) {
            FunctionNode functionNode = scriptNode.getFunctionNode(i2);
            new OptFunctionNode(functionNode);
            Codegen.initOptFunctions_r(functionNode);
        }
    }

    private void initScriptNodesData(ScriptNode objectArray) {
        ObjArray objArray = new ObjArray();
        Codegen.collectScriptNodes_r((ScriptNode)objectArray, objArray);
        int n2 = objArray.size();
        objectArray = new ScriptNode[n2];
        this.scriptOrFnNodes = objectArray;
        objArray.toArray(objectArray);
        this.scriptOrFnIndexes = new ObjToIntMap(n2);
        for (int i2 = 0; i2 != n2; ++i2) {
            this.scriptOrFnIndexes.put(this.scriptOrFnNodes[i2], i2);
        }
    }

    static boolean isGenerator(ScriptNode scriptNode) {
        boolean bl = scriptNode.getType() == 113 && ((FunctionNode)scriptNode).isGenerator();
        return bl;
    }

    static void pushUndefined(ClassFileWriter classFileWriter) {
        classFileWriter.add(178, "org/mozilla/javascript/Undefined", "instance", "Ljava/lang/Object;");
    }

    private void transform(ScriptNode scriptNode) {
        Codegen.initOptFunctions_r(scriptNode);
        int n2 = this.compilerEnv.getOptimizationLevel();
        OptFunctionNode optFunctionNode = null;
        OptFunctionNode optFunctionNode2 = null;
        Object object = optFunctionNode;
        if (n2 > 0) {
            object = optFunctionNode;
            if (scriptNode.getType() == 140) {
                int n3 = scriptNode.getFunctionCount();
                int n4 = 0;
                optFunctionNode = optFunctionNode2;
                while (true) {
                    object = optFunctionNode;
                    if (n4 == n3) break;
                    optFunctionNode2 = OptFunctionNode.get(scriptNode, n4);
                    object = optFunctionNode;
                    if (optFunctionNode2.fnode.getFunctionType() == 1) {
                        String string = optFunctionNode2.fnode.getName();
                        object = optFunctionNode;
                        if (string.length() != 0) {
                            object = optFunctionNode;
                            if (optFunctionNode == null) {
                                object = new HashMap();
                            }
                            object.put(string, optFunctionNode2);
                        }
                    }
                    ++n4;
                    optFunctionNode = object;
                }
            }
        }
        if (object != null) {
            this.directCallTargets = new ObjArray();
        }
        new OptTransformer((Map<String, OptFunctionNode>)object, this.directCallTargets).transform(scriptNode, this.compilerEnv);
        if (n2 > 0) {
            new Optimizer().optimize(scriptNode);
        }
    }

    @Override
    public void captureStackInfo(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    String cleanName(ScriptNode object) {
        object = object instanceof FunctionNode ? ((object = ((FunctionNode)object).getFunctionName()) == null ? "anonymous" : ((Name)object).getIdentifier()) : "script";
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String string, boolean bl) {
        CharSequence charSequence;
        int n2;
        Object object = globalLock;
        synchronized (object) {
            globalSerialClassCounter = n2 = globalSerialClassCounter + 1;
        }
        object = "c";
        if (scriptNode.getSourceName().length() > 0) {
            charSequence = scriptNode.getSourceName().replaceAll("\\W", "_");
            object = charSequence;
            if (!Character.isJavaIdentifierStart(((String)charSequence).charAt(0))) {
                object = e.c("_", (String)charSequence);
            }
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("org.mozilla.javascript.gen.");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("_");
        ((StringBuilder)charSequence).append(n2);
        object = ((StringBuilder)charSequence).toString();
        return new Object[]{object, this.compileToClassFile(compilerEnvirons, (String)object, scriptNode, string, bl)};
    }

    public byte[] compileToClassFile(CompilerEnvirons object, String string, ScriptNode scriptNode, String string2, boolean bl) {
        this.compilerEnv = object;
        this.transform(scriptNode);
        object = scriptNode;
        if (bl) {
            object = scriptNode.getFunctionNode(0);
        }
        this.initScriptNodesData((ScriptNode)object);
        this.mainClassName = string;
        this.mainClassSignature = ClassFileWriter.classNameToSignature(string);
        return this.generateCode(string2);
    }

    @Override
    public Function createFunctionObject(Context object, Scriptable object2, Object clazz, Object object3) {
        clazz = this.defineClass(clazz, object3);
        try {
            object = (NativeFunction)clazz.getConstructors()[0].newInstance(object2, object, 0);
            return object;
        }
        catch (Exception exception) {
            object2 = a.c("Unable to instantiate compiled class:");
            ((StringBuilder)object2).append(((Object)exception).toString());
            throw new RuntimeException(((StringBuilder)object2).toString());
        }
    }

    @Override
    public Script createScriptObject(Object object, Object object2) {
        object = this.defineClass(object, object2);
        try {
            object = (Script)((Class)object).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            return object;
        }
        catch (Exception exception) {
            object2 = a.c("Unable to instantiate compiled class:");
            ((StringBuilder)object2).append(((Object)exception).toString());
            throw new RuntimeException(((StringBuilder)object2).toString());
        }
    }

    String getBodyMethodName(ScriptNode scriptNode) {
        StringBuilder stringBuilder = a.c("_c_");
        stringBuilder.append(this.cleanName(scriptNode));
        stringBuilder.append("_");
        stringBuilder.append(this.getIndex(scriptNode));
        return stringBuilder.toString();
    }

    String getBodyMethodSignature(ScriptNode object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(this.mainClassSignature);
        stringBuilder.append("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;");
        if (((Node)object).getType() == 113 && ((OptFunctionNode)(object = OptFunctionNode.get((ScriptNode)object))).isTargetOfDirectCall()) {
            int n2 = ((OptFunctionNode)object).fnode.getParamCount();
            for (int i2 = 0; i2 != n2; ++i2) {
                stringBuilder.append("Ljava/lang/Object;D");
            }
        }
        stringBuilder.append("[Ljava/lang/Object;)Ljava/lang/Object;");
        return stringBuilder.toString();
    }

    String getCompiledRegexpName(ScriptNode scriptNode, int n2) {
        StringBuilder stringBuilder = a.c("_re");
        stringBuilder.append(this.getIndex(scriptNode));
        stringBuilder.append("_");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    String getDirectCtorName(ScriptNode scriptNode) {
        StringBuilder stringBuilder = a.c("_n");
        stringBuilder.append(this.getIndex(scriptNode));
        return stringBuilder.toString();
    }

    String getFunctionInitMethodName(OptFunctionNode optFunctionNode) {
        StringBuilder stringBuilder = a.c("_i");
        stringBuilder.append(this.getIndex(optFunctionNode.fnode));
        return stringBuilder.toString();
    }

    int getIndex(ScriptNode scriptNode) {
        return this.scriptOrFnIndexes.getExisting(scriptNode);
    }

    @Override
    public String getPatchedStack(RhinoException rhinoException, String string) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> getScriptStack(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getSourcePositionFromStack(Context context, int[] nArray) {
        throw new UnsupportedOperationException();
    }

    String getTemplateLiteralName(ScriptNode scriptNode) {
        StringBuilder stringBuilder = a.c("_q");
        stringBuilder.append(this.getIndex(scriptNode));
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    void pushNumberAsObject(ClassFileWriter classFileWriter, double d2) {
        int n2;
        block17: {
            block14: {
                block16: {
                    void var6_5;
                    block15: {
                        block13: {
                            if (d2 != 0.0) break block13;
                            if (!(1.0 / d2 > 0.0)) break block14;
                            String string = "zeroObj";
                            break block15;
                        }
                        if (d2 == 1.0) {
                            classFileWriter.add(178, "org/mozilla/javascript/optimizer/OptRuntime", "oneObj", "Ljava/lang/Double;");
                            return;
                        }
                        if (d2 == -1.0) {
                            classFileWriter.add(178, "org/mozilla/javascript/optimizer/OptRuntime", "minusOneObj", "Ljava/lang/Double;");
                            return;
                        }
                        if (!Double.isNaN(d2)) break block16;
                        String string = "NaNobj";
                    }
                    classFileWriter.add(178, "org/mozilla/javascript/ScriptRuntime", (String)var6_5, "Ljava/lang/Double;");
                    return;
                }
                n2 = this.itsConstantListSize;
                if (n2 < 2000) break block17;
            }
            classFileWriter.addPush(d2);
            Codegen.addDoubleWrap(classFileWriter);
            return;
        }
        int n3 = 0;
        if (n2 == 0) {
            this.itsConstantList = new double[64];
        } else {
            double[] dArray = this.itsConstantList;
            for (n3 = 0; n3 != n2 && dArray[n3] != d2; ++n3) {
            }
            if (n2 == dArray.length) {
                double[] dArray2 = new double[n2 * 2];
                System.arraycopy(this.itsConstantList, 0, dArray2, 0, n2);
                this.itsConstantList = dArray2;
            }
        }
        if (n3 == n2) {
            this.itsConstantList[n2] = d2;
            this.itsConstantListSize = n2 + 1;
        }
        String string = r.a("_k", n3);
        String string2 = Codegen.getStaticConstantWrapperType(d2);
        classFileWriter.add(178, this.mainClassName, string, string2);
    }

    @Override
    public void setEvalScriptFlag(Script script) {
        throw new UnsupportedOperationException();
    }

    public void setMainMethodClass(String string) {
        this.mainMethodClass = string;
    }
}

