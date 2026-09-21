/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.math.BigInteger;
import java.util.Iterator;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Icode;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.NodeTransformer;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ObjToIntMap$Iterator;
import org.mozilla.javascript.RegExpProxy;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.UintMap;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.Block;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.TemplateCharacters;
import org.mozilla.javascript.ast.VariableInitializer;

class CodeGenerator
extends Icode {
    private static final int ECF_TAIL = 1;
    private static final int MIN_FIXUP_TABLE_SIZE = 40;
    private static final int MIN_LABEL_TABLE_SIZE = 32;
    private ObjToIntMap bigInts;
    private CompilerEnvirons compilerEnv;
    private int doubleTableTop;
    private int exceptionTableTop;
    private long[] fixupTable;
    private int fixupTableTop;
    private int iCodeTop;
    private InterpreterData itsData;
    private boolean itsInFunctionFlag;
    private boolean itsInTryFlag;
    private int[] labelTable;
    private int labelTableTop;
    private int lineNumber;
    private ObjArray literalIds;
    private int localTop;
    private ScriptNode scriptOrFn;
    private int stackDepth;
    private ObjToIntMap strings = new ObjToIntMap(20);

    CodeGenerator() {
        this.bigInts = new ObjToIntMap(20);
        this.literalIds = new ObjArray();
    }

    private void addBackwardGoto(int n2, int n3) {
        int n4 = this.iCodeTop;
        if (n4 > n3) {
            this.addGotoOp(n2);
            this.resolveGoto(n4, n3);
            return;
        }
        throw Kit.codeBug();
    }

    private void addBigInt(BigInteger bigInteger) {
        int n2;
        int n3 = n2 = this.bigInts.get(bigInteger, -1);
        if (n2 == -1) {
            n3 = this.bigInts.size();
            this.bigInts.put(bigInteger, n3);
        }
        if (n3 < 4) {
            this.addIcode(-67 - n3);
        } else if (n3 <= 255) {
            this.addIcode(-71);
            this.addUint8(n3);
        } else if (n3 <= 65535) {
            this.addIcode(-72);
            this.addUint16(n3);
        } else {
            this.addIcode(-73);
            this.addInt(n3);
        }
        this.addToken(83);
    }

    private void addExceptionHandler(int n2, int n3, int n4, boolean bl, int n5, int n6) {
        int[] nArray;
        int n7 = this.exceptionTableTop;
        int[] nArray2 = this.itsData.itsExceptionTable;
        if (nArray2 == null) {
            if (n7 != 0) {
                Kit.codeBug();
            }
            this.itsData.itsExceptionTable = nArray = new int[12];
        } else {
            nArray = nArray2;
            if (nArray2.length == n7) {
                nArray = new int[nArray2.length * 2];
                System.arraycopy(nArray2, 0, nArray, 0, n7);
                this.itsData.itsExceptionTable = nArray;
            }
        }
        nArray[n7 + 0] = n2;
        nArray[n7 + 1] = n3;
        nArray[n7 + 2] = n4;
        nArray[n7 + 3] = bl ? 1 : 0;
        nArray[n7 + 4] = n5;
        nArray[n7 + 5] = n6;
        this.exceptionTableTop = n7 + 6;
    }

    private void addGoto(Node object, int n2) {
        int n3;
        int n4 = this.getTargetLabel((Node)object);
        if (n4 >= this.labelTableTop) {
            Kit.codeBug();
        }
        if ((n3 = this.labelTable[n4]) != -1) {
            this.addBackwardGoto(n2, n3);
        } else {
            n3 = this.iCodeTop;
            this.addGotoOp(n2);
            n2 = this.fixupTableTop;
            object = this.fixupTable;
            if (object == null || n2 == ((Object)object).length) {
                if (object == null) {
                    this.fixupTable = new long[40];
                } else {
                    long[] lArray = new long[((Object)object).length * 2];
                    System.arraycopy(object, 0, lArray, 0, n2);
                    this.fixupTable = lArray;
                }
            }
            this.fixupTableTop = n2 + 1;
            this.fixupTable[n2] = (long)n4 << 32 | (long)n3;
        }
    }

    private void addGotoOp(int n2) {
        byte[] byArray = this.itsData.itsICode;
        int n3 = this.iCodeTop;
        byte[] byArray2 = byArray;
        if (n3 + 3 > byArray.length) {
            byArray2 = this.increaseICodeCapacity(3);
        }
        byArray2[n3] = (byte)n2;
        this.iCodeTop = n3 + 1 + 2;
    }

    private void addIcode(int n2) {
        if (Icode.validIcode(n2)) {
            this.addUint8(n2 & 0xFF);
            return;
        }
        throw Kit.codeBug();
    }

    private void addIndexOp(int n2, int n3) {
        this.addIndexPrefix(n3);
        if (Icode.validIcode(n2)) {
            this.addIcode(n2);
        } else {
            this.addToken(n2);
        }
    }

    private void addIndexPrefix(int n2) {
        if (n2 < 0) {
            Kit.codeBug();
        }
        if (n2 < 6) {
            this.addIcode(-32 - n2);
        } else if (n2 <= 255) {
            this.addIcode(-38);
            this.addUint8(n2);
        } else if (n2 <= 65535) {
            this.addIcode(-39);
            this.addUint16(n2);
        } else {
            this.addIcode(-40);
            this.addInt(n2);
        }
    }

    private void addInt(int n2) {
        byte[] byArray = this.itsData.itsICode;
        int n3 = this.iCodeTop;
        int n4 = n3 + 4;
        byte[] byArray2 = byArray;
        if (n4 > byArray.length) {
            byArray2 = this.increaseICodeCapacity(4);
        }
        byArray2[n3] = (byte)(n2 >>> 24);
        byArray2[n3 + 1] = (byte)(n2 >>> 16);
        byArray2[n3 + 2] = (byte)(n2 >>> 8);
        byArray2[n3 + 3] = (byte)n2;
        this.iCodeTop = n4;
    }

    private void addStringOp(int n2, String string) {
        this.addStringPrefix(string);
        if (Icode.validIcode(n2)) {
            this.addIcode(n2);
        } else {
            this.addToken(n2);
        }
    }

    private void addStringPrefix(String string) {
        int n2;
        int n3 = n2 = this.strings.get(string, -1);
        if (n2 == -1) {
            n3 = this.strings.size();
            this.strings.put(string, n3);
        }
        if (n3 < 4) {
            this.addIcode(-41 - n3);
        } else if (n3 <= 255) {
            this.addIcode(-45);
            this.addUint8(n3);
        } else if (n3 <= 65535) {
            this.addIcode(-46);
            this.addUint16(n3);
        } else {
            this.addIcode(-47);
            this.addInt(n3);
        }
    }

    private void addToken(int n2) {
        if (Icode.validTokenCode(n2)) {
            this.addUint8(n2);
            return;
        }
        throw Kit.codeBug();
    }

    private void addUint16(int n2) {
        if ((0xFFFF0000 & n2) == 0) {
            byte[] byArray = this.itsData.itsICode;
            int n3 = this.iCodeTop;
            int n4 = n3 + 2;
            byte[] byArray2 = byArray;
            if (n4 > byArray.length) {
                byArray2 = this.increaseICodeCapacity(2);
            }
            byArray2[n3] = (byte)(n2 >>> 8);
            byArray2[n3 + 1] = (byte)n2;
            this.iCodeTop = n4;
            return;
        }
        throw Kit.codeBug();
    }

    private void addUint8(int n2) {
        if ((n2 & 0xFFFFFF00) == 0) {
            byte[] byArray = this.itsData.itsICode;
            int n3 = this.iCodeTop;
            byte[] byArray2 = byArray;
            if (n3 == byArray.length) {
                byArray2 = this.increaseICodeCapacity(1);
            }
            byArray2[n3] = (byte)n2;
            this.iCodeTop = n3 + 1;
            return;
        }
        throw Kit.codeBug();
    }

    private void addVarOp(int n2, int n3) {
        if (n2 != -7) {
            if (n2 != 160) {
                if (n2 != 55 && n2 != 56) {
                    throw Kit.codeBug();
                }
                if (n3 < 128) {
                    n2 = n2 == 55 ? -48 : -49;
                    this.addIcode(n2);
                    this.addUint8(n3);
                    return;
                }
            } else {
                if (n3 < 128) {
                    this.addIcode(-61);
                    this.addUint8(n3);
                    return;
                }
                this.addIndexOp(-60, n3);
                return;
            }
        }
        this.addIndexOp(n2, n3);
    }

    private int allocLocal() {
        int n2;
        int n3 = this.localTop;
        this.localTop = n2 = n3 + 1;
        InterpreterData interpreterData = this.itsData;
        if (n2 > interpreterData.itsMaxLocals) {
            interpreterData.itsMaxLocals = n2;
        }
        return n3;
    }

    private static RuntimeException badTree(Node node) {
        throw new RuntimeException(node.toString());
    }

    private void fixLabelGotos() {
        for (int i2 = 0; i2 < this.fixupTableTop; ++i2) {
            long l2 = this.fixupTable[i2];
            int n2 = (int)(l2 >> 32);
            int n3 = (int)l2;
            if ((n2 = this.labelTable[n2]) != -1) {
                this.resolveGoto(n3, n2);
                continue;
            }
            throw Kit.codeBug();
        }
        this.fixupTableTop = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void generateCallFunAndThis(Node node) {
        int n2 = node.getType();
        if (n2 != 33 && n2 != 36) {
            if (n2 == 39) {
                this.addStringOp(-15, node.getString());
                this.stackChange(2);
                return;
            }
            this.visitExpression(node, 0);
            this.addIcode(-18);
        } else {
            node = node.getFirstChild();
            this.visitExpression(node, 0);
            node = node.getNext();
            if (n2 != 33) {
                this.visitExpression(node, 0);
                this.addIcode(-17);
                return;
            }
            this.addStringOp(-16, node.getString());
        }
        this.stackChange(1);
    }

    private void generateFunctionICode() {
        this.itsInFunctionFlag = true;
        FunctionNode functionNode = (FunctionNode)this.scriptOrFn;
        this.itsData.itsFunctionType = functionNode.getFunctionType();
        this.itsData.itsNeedsActivation = functionNode.requiresActivation();
        if (functionNode.getFunctionName() != null) {
            this.itsData.itsName = functionNode.getName();
        }
        if (functionNode.isGenerator()) {
            this.addIcode(-62);
            this.addUint16(functionNode.getBaseLineno() & 0xFFFF);
        }
        if (functionNode.isInStrictMode()) {
            this.itsData.isStrict = true;
        }
        if (functionNode.isES6Generator()) {
            this.itsData.isES6Generator = true;
        }
        this.itsData.declaredAsVar = functionNode.getParent() instanceof VariableInitializer;
        this.generateICodeFromTree(functionNode.getLastChild());
    }

    private void generateICodeFromTree(Node object) {
        int n2;
        Object object2;
        int n3;
        this.generateNestedFunctions();
        this.generateRegExpLiterals();
        this.generateTemplateLiterals();
        this.visitStatement((Node)object, 0);
        this.fixLabelGotos();
        if (this.itsData.itsFunctionType == 0) {
            this.addToken(65);
        }
        if ((n3 = ((byte[])(object2 = this.itsData.itsICode)).length) != (n2 = this.iCodeTop)) {
            object = new byte[n2];
            System.arraycopy(object2, 0, object, 0, n2);
            this.itsData.itsICode = (byte[])object;
        }
        if (this.strings.size() == 0) {
            this.itsData.itsStringTable = null;
        } else {
            this.itsData.itsStringTable = new String[this.strings.size()];
            object = this.strings.newIterator();
            ((ObjToIntMap$Iterator)object).start();
            while (!((ObjToIntMap$Iterator)object).done()) {
                object2 = (String)((ObjToIntMap$Iterator)object).getKey();
                n2 = ((ObjToIntMap$Iterator)object).getValue();
                if (this.itsData.itsStringTable[n2] != null) {
                    Kit.codeBug();
                }
                this.itsData.itsStringTable[n2] = object2;
                ((ObjToIntMap$Iterator)object).next();
            }
        }
        n2 = this.doubleTableTop;
        if (n2 == 0) {
            this.itsData.itsDoubleTable = null;
        } else {
            object = this.itsData.itsDoubleTable;
            if (((Object)object).length != n2) {
                object2 = new double[n2];
                System.arraycopy(object, 0, object2, 0, n2);
                this.itsData.itsDoubleTable = (double[])object2;
            }
        }
        if (this.bigInts.size() == 0) {
            this.itsData.itsBigIntTable = null;
        } else {
            this.itsData.itsBigIntTable = new BigInteger[this.bigInts.size()];
            object2 = this.bigInts.newIterator();
            ((ObjToIntMap$Iterator)object2).start();
            while (!((ObjToIntMap$Iterator)object2).done()) {
                object = (BigInteger)((ObjToIntMap$Iterator)object2).getKey();
                n2 = ((ObjToIntMap$Iterator)object2).getValue();
                if (this.itsData.itsBigIntTable[n2] != null) {
                    Kit.codeBug();
                }
                this.itsData.itsBigIntTable[n2] = object;
                ((ObjToIntMap$Iterator)object2).next();
            }
        }
        n2 = this.exceptionTableTop;
        if (n2 != 0 && ((Object)(object = (Object)this.itsData.itsExceptionTable)).length != n2) {
            object2 = new int[n2];
            System.arraycopy(object, 0, object2, 0, n2);
            this.itsData.itsExceptionTable = (int[])object2;
        }
        this.itsData.itsMaxVars = this.scriptOrFn.getParamAndVarCount();
        object = this.itsData;
        ((InterpreterData)object).itsMaxFrameArray = ((InterpreterData)object).itsMaxVars + ((InterpreterData)object).itsMaxLocals + ((InterpreterData)object).itsMaxStack;
        ((InterpreterData)object).argNames = this.scriptOrFn.getParamAndVarNames();
        this.itsData.argIsConst = this.scriptOrFn.getParamAndVarConst();
        this.itsData.argCount = this.scriptOrFn.getParamCount();
        this.itsData.argsHasRest = this.scriptOrFn.hasRestParameter();
        this.itsData.encodedSourceStart = this.scriptOrFn.getEncodedSourceStart();
        this.itsData.encodedSourceEnd = this.scriptOrFn.getEncodedSourceEnd();
        if (this.literalIds.size() != 0) {
            this.itsData.literalIds = this.literalIds.toArray();
        }
    }

    private void generateNestedFunctions() {
        int n2 = this.scriptOrFn.getFunctionCount();
        if (n2 == 0) {
            return;
        }
        InterpreterData[] interpreterDataArray = new InterpreterData[n2];
        for (int i2 = 0; i2 != n2; ++i2) {
            AstNode astNode = this.scriptOrFn.getFunctionNode(i2);
            CodeGenerator codeGenerator = new CodeGenerator();
            codeGenerator.compilerEnv = this.compilerEnv;
            codeGenerator.scriptOrFn = astNode;
            codeGenerator.itsData = new InterpreterData(this.itsData);
            codeGenerator.generateFunctionICode();
            interpreterDataArray[i2] = codeGenerator.itsData;
            astNode = astNode.getParent();
            if (astNode instanceof AstRoot || astNode instanceof Scope || astNode instanceof Block) continue;
            codeGenerator.itsData.declaredAsFunctionExpression = true;
        }
        this.itsData.itsNestedFunctions = interpreterDataArray;
    }

    private void generateRegExpLiterals() {
        int n2 = this.scriptOrFn.getRegexpCount();
        if (n2 == 0) {
            return;
        }
        Context context = Context.getContext();
        RegExpProxy regExpProxy = ScriptRuntime.checkRegExpProxy(context);
        Object[] objectArray = new Object[n2];
        for (int i2 = 0; i2 != n2; ++i2) {
            objectArray[i2] = regExpProxy.compileRegExp(context, this.scriptOrFn.getRegexpString(i2), this.scriptOrFn.getRegexpFlags(i2));
        }
        this.itsData.itsRegExpLiterals = objectArray;
    }

    private void generateTemplateLiterals() {
        int n2 = this.scriptOrFn.getTemplateLiteralCount();
        if (n2 == 0) {
            return;
        }
        Object[] objectArray = new Object[n2];
        for (int i2 = 0; i2 != n2; ++i2) {
            Iterable<TemplateCharacters> iterable = this.scriptOrFn.getTemplateLiteralStrings(i2);
            String[] stringArray = new String[iterable.size() * 2];
            Iterator<TemplateCharacters> iterator = iterable.iterator();
            int n3 = 0;
            while (iterator.hasNext()) {
                iterable = iterator.next();
                int n4 = n3 + 1;
                stringArray[n3] = ((TemplateCharacters)iterable).getValue();
                n3 = n4 + 1;
                stringArray[n4] = ((TemplateCharacters)iterable).getRawValue();
            }
            objectArray[i2] = stringArray;
        }
        this.itsData.itsTemplateLiterals = objectArray;
    }

    private int getDoubleIndex(double d2) {
        int n2 = this.doubleTableTop;
        Object object = this.itsData;
        if (n2 == 0) {
            ((InterpreterData)object).itsDoubleTable = new double[64];
        } else {
            object = ((InterpreterData)object).itsDoubleTable;
            if (((Object)object).length == n2) {
                double[] dArray = new double[n2 * 2];
                System.arraycopy(object, 0, dArray, 0, n2);
                this.itsData.itsDoubleTable = dArray;
            }
        }
        this.itsData.itsDoubleTable[n2] = d2;
        this.doubleTableTop = n2 + 1;
        return n2;
    }

    private static int getLocalBlockRef(Node node) {
        return ((Node)node.getProp(3)).getExistingIntProp(2);
    }

    private int getTargetLabel(Node node) {
        int n2 = node.labelId();
        if (n2 != -1) {
            return n2;
        }
        n2 = this.labelTableTop;
        int[] nArray = this.labelTable;
        if (nArray == null || n2 == nArray.length) {
            if (nArray == null) {
                this.labelTable = new int[32];
            } else {
                int[] nArray2 = new int[nArray.length * 2];
                System.arraycopy(nArray, 0, nArray2, 0, n2);
                this.labelTable = nArray2;
            }
        }
        this.labelTableTop = n2 + 1;
        this.labelTable[n2] = -1;
        node.labelId(n2);
        return n2;
    }

    private byte[] increaseICodeCapacity(int n2) {
        int n3 = this.iCodeTop;
        byte[] byArray = this.itsData.itsICode;
        int n4 = byArray.length;
        if ((n2 += n3) > n4) {
            if (n2 <= (n4 *= 2)) {
                n2 = n4;
            }
            byte[] byArray2 = new byte[n2];
            System.arraycopy(byArray, 0, byArray2, 0, n3);
            this.itsData.itsICode = byArray2;
            return byArray2;
        }
        throw Kit.codeBug();
    }

    private void markTargetLabel(Node node) {
        int n2 = this.getTargetLabel(node);
        if (this.labelTable[n2] != -1) {
            Kit.codeBug();
        }
        this.labelTable[n2] = this.iCodeTop;
    }

    private void releaseLocal(int n2) {
        int n3;
        this.localTop = n3 = this.localTop - 1;
        if (n2 != n3) {
            Kit.codeBug();
        }
    }

    private void resolveForwardGoto(int n2) {
        int n3 = this.iCodeTop;
        if (n3 >= n2 + 3) {
            this.resolveGoto(n2, n3);
            return;
        }
        throw Kit.codeBug();
    }

    private void resolveGoto(int n2, int n3) {
        Object object;
        int n4 = n3 - n2;
        if (n4 >= 0 && n4 <= 2) {
            throw Kit.codeBug();
        }
        int n5 = n2 + 1;
        n2 = n4;
        if (n4 != (short)n4) {
            object = this.itsData;
            if (((InterpreterData)object).longJumps == null) {
                ((InterpreterData)object).longJumps = new UintMap();
            }
            this.itsData.longJumps.put(n5, n3);
            n2 = 0;
        }
        object = this.itsData.itsICode;
        object[n5] = (byte)(n2 >> 8);
        object[n5 + 1] = (byte)n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void stackChange(int n2) {
        int n3 = this.stackDepth + n2;
        if (n2 > 0) {
            InterpreterData interpreterData = this.itsData;
            if (n3 > interpreterData.itsMaxStack) {
                interpreterData.itsMaxStack = n3;
            }
        }
        this.stackDepth = n3;
    }

    private void updateLineNumber(Node object) {
        int n2 = ((Node)object).getLineno();
        if (n2 != this.lineNumber && n2 >= 0) {
            object = this.itsData;
            if (((InterpreterData)object).firstLinePC < 0) {
                ((InterpreterData)object).firstLinePC = n2;
            }
            this.lineNumber = n2;
            this.addIcode(-26);
            this.addUint16(n2 & 0xFFFF);
        }
    }

    private void visitArrayComprehension(Node node, Node node2, Node node3) {
        this.visitStatement(node2, this.stackDepth);
        this.visitExpression(node3, 0);
    }

    /*
     * Exception decompiling
     */
    private void visitExpression(Node var1_1, int var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [38[CASE]], but top level block is 41[SWITCH]
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

    private void visitIncDec(Node node, Node node2) {
        block8: {
            int n2;
            block6: {
                block1: {
                    block2: {
                        block7: {
                            block3: {
                                block4: {
                                    block5: {
                                        n2 = node.getExistingIntProp(13);
                                        int n3 = node2.getType();
                                        if (n3 == 33) break block1;
                                        if (n3 == 36) break block2;
                                        if (n3 == 39) break block3;
                                        if (n3 == 55) break block4;
                                        if (n3 != 68) break block5;
                                        this.visitExpression(node2.getFirstChild(), 0);
                                        this.addIcode(-11);
                                        break block6;
                                    }
                                    throw CodeGenerator.badTree(node);
                                }
                                if (this.itsData.itsNeedsActivation) {
                                    Kit.codeBug();
                                }
                                this.addVarOp(-7, this.scriptOrFn.getIndexForNameNode(node2));
                                break block7;
                            }
                            this.addStringOp(-8, node2.getString());
                        }
                        this.addUint8(n2);
                        this.stackChange(1);
                        break block8;
                    }
                    node = node2.getFirstChild();
                    this.visitExpression(node, 0);
                    this.visitExpression(node.getNext(), 0);
                    this.addIcode(-10);
                    this.addUint8(n2);
                    this.stackChange(-1);
                    break block8;
                }
                node = node2.getFirstChild();
                this.visitExpression(node, 0);
                this.addStringOp(-9, node.getNext().getString());
            }
            this.addUint8(n2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void visitLiteral(Node var1_1, Node var2_2) {
        block17: {
            block16: {
                block15: {
                    var4_3 = var1_1.getType();
                    if (var4_3 != 66) break block15;
                    var3_5 = 0;
                    for (var5_4 /* !! */  = var2_2 /* !! */ ; var5_4 /* !! */  != null; var5_4 /* !! */  = var5_4 /* !! */ .getNext()) {
                        ++var3_5;
                    }
                    var5_4 /* !! */  = null;
                    break block16;
                }
                if (var4_3 != 67) break block17;
                var5_4 /* !! */  = (Object[])var1_1.getProp(12);
                var3_5 = var5_4 /* !! */  == null ? 0 : var5_4 /* !! */ .length;
            }
            this.addIndexOp(-29, var3_5);
            this.stackChange(2);
            while (var2_2 /* !! */  != null) {
                var3_5 = var2_2 /* !! */ .getType();
                if (var3_5 == 155) {
                    this.visitExpression(var2_2 /* !! */ .getFirstChild(), 0);
                    var3_5 = -57;
lbl21:
                    // 2 sources

                    while (true) {
                        this.addIcode(var3_5);
                        break;
                    }
                } else {
                    if (var3_5 == 156) {
                        this.visitExpression(var2_2 /* !! */ .getFirstChild(), 0);
                        var3_5 = -58;
                        ** continue;
                    }
                    if (var3_5 == 167) {
                        this.visitExpression(var2_2 /* !! */ .getFirstChild(), 0);
                    } else {
                        this.visitExpression((Node)var2_2 /* !! */ , 0);
                    }
                    this.addIcode(-30);
                }
                this.stackChange(-1);
                var2_2 /* !! */  = var2_2 /* !! */ .getNext();
            }
            if (var4_3 == 66) {
                if ((var1_1 = (Object)((int[])var1_1.getProp(11))) == null) {
                    this.addToken(66);
                } else {
                    var3_5 = this.literalIds.size();
                    this.literalIds.add(var1_1);
                    this.addIndexOp(-31, var3_5);
                }
            } else {
                var3_5 = this.literalIds.size();
                this.literalIds.add(var5_4 /* !! */ );
                this.addIndexOp(67, var3_5);
            }
            this.stackChange(-1);
            return;
        }
        throw CodeGenerator.badTree((Node)var1_1);
    }

    /*
     * Exception decompiling
     */
    private void visitStatement(Node var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CASE]], but top level block is 11[SWITCH]
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

    private void visitTemplateLiteral(Node node) {
        this.addIndexOp(-74, node.getExistingIntProp(28));
        this.stackChange(1);
    }

    public InterpreterData compile(CompilerEnvirons object, ScriptNode scriptNode, String string, boolean bl) {
        this.compilerEnv = object;
        new NodeTransformer().transform(scriptNode, (CompilerEnvirons)object);
        ScriptNode scriptNode2 = scriptNode;
        if (bl) {
            scriptNode2 = scriptNode.getFunctionNode(0);
        }
        this.scriptOrFn = scriptNode2;
        this.itsData = object = new InterpreterData(((CompilerEnvirons)object).getLanguageVersion(), this.scriptOrFn.getSourceName(), string, this.scriptOrFn.isInStrictMode());
        ((InterpreterData)object).topLevel = true;
        if (bl) {
            this.generateFunctionICode();
        } else {
            this.generateICodeFromTree(this.scriptOrFn);
        }
        return this.itsData;
    }
}

