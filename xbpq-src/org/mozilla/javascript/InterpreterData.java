/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.UintMap;
import org.mozilla.javascript.debug.DebuggableScript;

final class InterpreterData
implements Serializable,
DebuggableScript {
    static final int INITIAL_BIGINTTABLE_SIZE = 64;
    static final int INITIAL_MAX_ICODE_LENGTH = 1024;
    static final int INITIAL_NUMBERTABLE_SIZE = 64;
    static final int INITIAL_STRINGTABLE_SIZE = 64;
    private static final long serialVersionUID = 5067677351589230234L;
    int argCount;
    boolean[] argIsConst;
    String[] argNames;
    boolean argsHasRest;
    boolean declaredAsFunctionExpression;
    boolean declaredAsVar;
    String encodedSource;
    int encodedSourceEnd;
    int encodedSourceStart;
    boolean evalScriptFlag;
    int firstLinePC = -1;
    private int icodeHashCode = 0;
    boolean isES6Generator;
    boolean isStrict;
    BigInteger[] itsBigIntTable;
    double[] itsDoubleTable;
    int[] itsExceptionTable;
    int itsFunctionType;
    byte[] itsICode;
    int itsMaxCalleeArgs;
    int itsMaxFrameArray;
    int itsMaxLocals;
    int itsMaxStack;
    int itsMaxVars;
    String itsName;
    boolean itsNeedsActivation;
    InterpreterData[] itsNestedFunctions;
    Object[] itsRegExpLiterals;
    String itsSourceFile;
    String[] itsStringTable;
    Object[] itsTemplateLiterals;
    int languageVersion;
    Object[] literalIds;
    UintMap longJumps;
    InterpreterData parentData;
    boolean topLevel;

    InterpreterData(int n2, String string, String string2, boolean bl) {
        this.languageVersion = n2;
        this.itsSourceFile = string;
        this.encodedSource = string2;
        this.isStrict = bl;
        this.init();
    }

    InterpreterData(InterpreterData interpreterData) {
        this.parentData = interpreterData;
        this.languageVersion = interpreterData.languageVersion;
        this.itsSourceFile = interpreterData.itsSourceFile;
        this.encodedSource = interpreterData.encodedSource;
        this.isStrict = interpreterData.isStrict;
        this.init();
    }

    private void init() {
        this.itsICode = new byte[1024];
        this.itsStringTable = new String[64];
        this.itsBigIntTable = new BigInteger[64];
    }

    @Override
    public DebuggableScript getFunction(int n2) {
        return this.itsNestedFunctions[n2];
    }

    @Override
    public int getFunctionCount() {
        InterpreterData[] interpreterDataArray = this.itsNestedFunctions;
        int n2 = interpreterDataArray == null ? 0 : interpreterDataArray.length;
        return n2;
    }

    @Override
    public String getFunctionName() {
        return this.itsName;
    }

    @Override
    public int[] getLineNumbers() {
        return Interpreter.getLineNumbers(this);
    }

    @Override
    public int getParamAndVarCount() {
        return this.argNames.length;
    }

    @Override
    public int getParamCount() {
        return this.argCount;
    }

    public boolean getParamOrVarConst(int n2) {
        return this.argIsConst[n2];
    }

    @Override
    public String getParamOrVarName(int n2) {
        return this.argNames[n2];
    }

    @Override
    public DebuggableScript getParent() {
        return this.parentData;
    }

    @Override
    public String getSourceName() {
        return this.itsSourceFile;
    }

    public int icodeHashCode() {
        int n2;
        int n3 = n2 = this.icodeHashCode;
        if (n2 == 0) {
            this.icodeHashCode = n3 = Arrays.hashCode(this.itsICode);
        }
        return n3;
    }

    @Override
    public boolean isFunction() {
        boolean bl = this.itsFunctionType != 0;
        return bl;
    }

    @Override
    public boolean isGeneratedScript() {
        return ScriptRuntime.isGeneratedScript(this.itsSourceFile);
    }

    @Override
    public boolean isTopLevel() {
        return this.topLevel;
    }
}

