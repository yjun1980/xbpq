/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.r;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.mozilla.classfile.ClassFileField;
import org.mozilla.classfile.ClassFileMethod;
import org.mozilla.classfile.ClassFileWriter$BootstrapEntry;
import org.mozilla.classfile.ClassFileWriter$ClassFileFormatException;
import org.mozilla.classfile.ClassFileWriter$MHandle;
import org.mozilla.classfile.ClassFileWriter$StackMapTable;
import org.mozilla.classfile.ConstantPool;
import org.mozilla.classfile.ExceptionTableEntry;
import org.mozilla.classfile.TypeInfo;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.UintMap;

public class ClassFileWriter {
    public static final short ACC_ABSTRACT = 1024;
    public static final short ACC_FINAL = 16;
    public static final short ACC_NATIVE = 256;
    public static final short ACC_PRIVATE = 2;
    public static final short ACC_PROTECTED = 4;
    public static final short ACC_PUBLIC = 1;
    public static final short ACC_STATIC = 8;
    public static final short ACC_SUPER = 32;
    public static final short ACC_SYNCHRONIZED = 32;
    public static final short ACC_TRANSIENT = 128;
    public static final short ACC_VOLATILE = 64;
    private static final boolean DEBUGCODE = false;
    private static final boolean DEBUGLABELS = false;
    private static final boolean DEBUGSTACK = false;
    private static final int ExceptionTableSize = 4;
    private static final int FileHeaderConstant = -889275714;
    private static final boolean GenerateStackMap;
    private static final int LineNumberTableSize = 16;
    private static final int MIN_FIXUP_TABLE_SIZE = 40;
    private static final int MIN_LABEL_TABLE_SIZE = 32;
    private static final int MajorVersion;
    private static final int MinorVersion;
    private static final int SuperBlockStartsSize = 4;
    private String generatedClassName;
    private ObjArray itsBootstrapMethods;
    private int itsBootstrapMethodsLength = 0;
    private byte[] itsCodeBuffer = new byte[256];
    private int itsCodeBufferTop;
    private ConstantPool itsConstantPool;
    private ClassFileMethod itsCurrentMethod;
    private ExceptionTableEntry[] itsExceptionTable;
    private int itsExceptionTableTop;
    private ObjArray itsFields;
    private long[] itsFixupTable;
    private int itsFixupTableTop;
    private short itsFlags;
    private ObjArray itsInterfaces;
    private UintMap itsJumpFroms = null;
    private int[] itsLabelTable;
    private int itsLabelTableTop;
    private int[] itsLineNumberTable;
    private int itsLineNumberTableTop;
    private short itsMaxLocals;
    private short itsMaxStack;
    private ObjArray itsMethods = new ObjArray();
    private short itsSourceFileNameIndex;
    private short itsStackTop;
    private int[] itsSuperBlockStarts = null;
    private int itsSuperBlockStartsTop = 0;
    private short itsSuperClassIndex;
    private short itsThisClassIndex;
    private ObjArray itsVarDescriptors;
    private char[] tmpCharBuffer;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static {
        block21: {
            block20: {
                var4 = false;
                var6_1 = null;
                var7_3 = null;
                var8_4 = ClassFileWriter.class.getResourceAsStream("ClassFileWriter.class");
                var5_5 = var8_4;
                if (var8_4 != null) break block20;
                var7_3 = var8_4;
                var6_1 = var8_4;
                var5_5 = ClassLoader.getSystemResourceAsStream("org/mozilla/classfile/ClassFileWriter.class");
            }
            var7_3 = var5_5;
            var6_1 = var5_5;
            try {
                var8_4 = new byte[8];
            }
            catch (Throwable var5_6) {
                ClassFileWriter.MinorVersion = 0;
                ClassFileWriter.MajorVersion = 48;
                ClassFileWriter.GenerateStackMap = false;
                if (var7_3 != null) {
                    var7_3.close();
                }
lbl56:
                // 4 sources

                throw var5_6;
            }
            catch (Exception var5_7) {
                ClassFileWriter.MinorVersion = 0;
                ClassFileWriter.MajorVersion = 48;
                ClassFileWriter.GenerateStackMap = false;
                if (var6_1 == null) break block21;
                var5_5 = var6_1;
                ** continue;
            }
            for (var0_9 /* !! */  = 0; var0_9 /* !! */  < 8; var0_9 /* !! */  += var1_10 /* !! */ ) {
                var7_3 = var5_5;
                var6_1 = var5_5;
                var1_10 /* !! */  = var5_5.read((byte[])var8_4, var0_9 /* !! */ , 8 - var0_9 /* !! */ );
                if (var1_10 /* !! */  >= 0) {
                    continue;
                }
                var7_3 = var5_5;
                var6_1 = var5_5;
                var7_3 = var5_5;
                var6_1 = var5_5;
                var8_4 = new IOException();
                var7_3 = var5_5;
                var6_1 = var5_5;
                throw var8_4;
            }
            var1_10 /* !! */  = var8_4[4];
            var0_9 /* !! */  = (int)var8_4[5];
            var3_11 = var8_4[6];
            var2_12 /* !! */  = var8_4[7];
            var2_12 /* !! */  = var2_12 /* !! */  & 255 | var3_11 << 8;
            ClassFileWriter.MinorVersion = var1_10 /* !! */  << 8 | var0_9 /* !! */  & 255;
            ClassFileWriter.MajorVersion = (int)var2_12 /* !! */ ;
            if (var2_12 /* !! */  >= 50) {
                var4 = true;
            }
            ClassFileWriter.GenerateStackMap = var4;
            if (var5_5 == null) break block21;
lbl45:
            // 2 sources

            while (true) {
                var5_5.close();
                break;
            }
        }
lbl66:
        // 2 sources

        return;
        catch (IOException var5_8) {}
        ** while (true)
        {
            catch (IOException var6_2) {
                ** continue;
            }
        }
    }

    public ClassFileWriter(String string, String string2, String string3) {
        ConstantPool constantPool;
        this.itsFields = new ObjArray();
        this.itsInterfaces = new ObjArray();
        this.tmpCharBuffer = new char[64];
        this.generatedClassName = string;
        this.itsConstantPool = constantPool = new ConstantPool(this);
        this.itsThisClassIndex = constantPool.addClass(string);
        this.itsSuperClassIndex = this.itsConstantPool.addClass(string2);
        if (string3 != null) {
            this.itsSourceFileNameIndex = this.itsConstantPool.addUtf8(string3);
        }
        this.itsFlags = (short)33;
    }

    static /* synthetic */ int access$000(ClassFileWriter classFileWriter) {
        return classFileWriter.itsSuperBlockStartsTop;
    }

    static /* synthetic */ int[] access$100(ClassFileWriter classFileWriter) {
        return classFileWriter.createInitialLocals();
    }

    static /* synthetic */ short access$1000(ClassFileWriter classFileWriter) {
        return classFileWriter.itsThisClassIndex;
    }

    static /* synthetic */ String access$1100(String string) {
        return ClassFileWriter.descriptorToInternalName(string);
    }

    static /* synthetic */ int access$1200(int n2, boolean bl) {
        return ClassFileWriter.opcodeLength(n2, bl);
    }

    static /* synthetic */ short access$1300(ClassFileWriter classFileWriter) {
        return classFileWriter.itsMaxLocals;
    }

    static /* synthetic */ short access$1400(ClassFileWriter classFileWriter) {
        return classFileWriter.itsMaxStack;
    }

    static /* synthetic */ int[] access$200(ClassFileWriter classFileWriter) {
        return classFileWriter.itsSuperBlockStarts;
    }

    static /* synthetic */ int access$300(ClassFileWriter classFileWriter) {
        return classFileWriter.itsCodeBufferTop;
    }

    static /* synthetic */ byte[] access$400(ClassFileWriter classFileWriter) {
        return classFileWriter.itsCodeBuffer;
    }

    static /* synthetic */ ConstantPool access$500(ClassFileWriter classFileWriter) {
        return classFileWriter.itsConstantPool;
    }

    static /* synthetic */ int access$600(ClassFileWriter classFileWriter) {
        return classFileWriter.itsExceptionTableTop;
    }

    static /* synthetic */ int access$610(ClassFileWriter classFileWriter) {
        int n2 = classFileWriter.itsExceptionTableTop;
        classFileWriter.itsExceptionTableTop = n2 - 1;
        return n2;
    }

    static /* synthetic */ ExceptionTableEntry[] access$700(ClassFileWriter classFileWriter) {
        return classFileWriter.itsExceptionTable;
    }

    static /* synthetic */ char access$800(int n2) {
        return ClassFileWriter.arrayTypeToName(n2);
    }

    static /* synthetic */ int access$900(String string) {
        return ClassFileWriter.sizeOfParameters(string);
    }

    private void addLabelFixup(int n2, int n3) {
        if (n2 < 0) {
            int n4 = n2 & Integer.MAX_VALUE;
            if (n4 < this.itsLabelTableTop) {
                n2 = this.itsFixupTableTop;
                long[] lArray = this.itsFixupTable;
                if (lArray == null || n2 == lArray.length) {
                    if (lArray == null) {
                        this.itsFixupTable = new long[40];
                    } else {
                        long[] lArray2 = new long[lArray.length * 2];
                        System.arraycopy(lArray, 0, lArray2, 0, n2);
                        this.itsFixupTable = lArray2;
                    }
                }
                this.itsFixupTableTop = n2 + 1;
                lArray = this.itsFixupTable;
                long l2 = n4;
                lArray[n2] = (long)n3 | l2 << 32;
                return;
            }
            throw new IllegalArgumentException("Bad label");
        }
        throw new IllegalArgumentException("Bad label, no biscuit");
    }

    private int addReservedCodeSpace(int n2) {
        if (this.itsCurrentMethod != null) {
            int n3 = this.itsCodeBufferTop;
            int n4 = n2 + n3;
            byte[] byArray = this.itsCodeBuffer;
            if (n4 > byArray.length) {
                int n5;
                n2 = n5 = byArray.length * 2;
                if (n4 > n5) {
                    n2 = n4;
                }
                byte[] byArray2 = new byte[n2];
                System.arraycopy(byArray, 0, byArray2, 0, n3);
                this.itsCodeBuffer = byArray2;
            }
            this.itsCodeBufferTop = n4;
            return n3;
        }
        throw new IllegalArgumentException("No method to add to");
    }

    private void addSuperBlockStart(int n2) {
        if (GenerateStackMap) {
            int[] nArray;
            int n3;
            int[] nArray2 = this.itsSuperBlockStarts;
            if (nArray2 == null) {
                this.itsSuperBlockStarts = new int[4];
            } else {
                int n4 = nArray2.length;
                n3 = this.itsSuperBlockStartsTop;
                if (n4 == n3) {
                    nArray = new int[n3 * 2];
                    System.arraycopy(nArray2, 0, nArray, 0, n3);
                    this.itsSuperBlockStarts = nArray;
                }
            }
            nArray = this.itsSuperBlockStarts;
            n3 = this.itsSuperBlockStartsTop;
            this.itsSuperBlockStartsTop = n3 + 1;
            nArray[n3] = n2;
        }
    }

    private void addToCodeBuffer(int n2) {
        int n3 = this.addReservedCodeSpace(1);
        this.itsCodeBuffer[n3] = (byte)n2;
    }

    private void addToCodeInt16(int n2) {
        int n3 = this.addReservedCodeSpace(2);
        ClassFileWriter.putInt16(n2, this.itsCodeBuffer, n3);
    }

    private static char arrayTypeToName(int n2) {
        switch (n2) {
            default: {
                throw new IllegalArgumentException("bad operand");
            }
            case 11: {
                return 'J';
            }
            case 10: {
                return 'I';
            }
            case 9: {
                return 'S';
            }
            case 8: {
                return 'B';
            }
            case 7: {
                return 'D';
            }
            case 6: {
                return 'F';
            }
            case 5: {
                return 'C';
            }
            case 4: 
        }
        return 'Z';
    }

    private static void badStack(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = n2 < 0 ? "Stack underflow: " : "Too big stack: ";
        stringBuilder.append(string);
        stringBuilder.append(n2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private static String bytecodeStr(int n2) {
        return "";
    }

    private static String classDescriptorToInternalName(String string) {
        return string.substring(1, string.length() - 1);
    }

    public static String classNameToSignature(String string) {
        int n2 = string.length();
        int n3 = n2 + 1;
        int n4 = n3 + 1;
        char[] cArray = new char[n4];
        cArray[0] = 76;
        cArray[n3] = 59;
        string.getChars(0, n2, cArray, 1);
        for (int i2 = 1; i2 != n3; ++i2) {
            if (cArray[i2] != '.') continue;
            cArray[i2] = 47;
        }
        return new String(cArray, 0, n4);
    }

    /*
     * Unable to fully structure code
     */
    private int[] createInitialLocals() {
        block7: {
            var8_1 = new int[this.itsMaxLocals];
            if ((this.itsCurrentMethod.getFlags() & 8) == 0) {
                var8_1[0] = "<init>".equals(this.itsCurrentMethod.getName()) != false ? 6 : TypeInfo.OBJECT(this.itsThisClassIndex);
                var2_2 = 1;
            } else {
                var2_2 = 0;
            }
            var6_3 = this.itsCurrentMethod.getType();
            var1_4 = var6_3.indexOf(40);
            var4_5 = var6_3.indexOf(41);
            if (var1_4 != 0 || var4_5 < 0) break block7;
            ++var1_4;
            var7_6 = new StringBuilder();
            block3: while (var1_4 < var4_5) {
                var3_7 = var6_3.charAt(var1_4);
                if (var3_7 == 70) ** GOTO lbl-1000
                if (var3_7 == 76) ** GOTO lbl26
                if (var3_7 == 83 || var3_7 == 73 || var3_7 == 74 || var3_7 == 90) ** GOTO lbl-1000
                if (var3_7 == 91) ** GOTO lbl22
                switch (var3_7) {
                    default: {
                        break;
                    }
lbl22:
                    // 1 sources

                    var7_6.append('[');
                    ++var1_4;
                    continue block3;
lbl26:
                    // 1 sources

                    var3_7 = var6_3.indexOf(59, var1_4) + 1;
                    var7_6.append(var6_3.substring(var1_4, var3_7));
                    var1_4 = var3_7;
                    break;
                    case 66: 
                    case 67: 
                    case 68: lbl-1000:
                    // 3 sources

                    {
                        var7_6.append(var6_3.charAt(var1_4));
                        ++var1_4;
                    }
                }
                var5_8 = TypeInfo.fromType(ClassFileWriter.descriptorToInternalName(var7_6.toString()), this.itsConstantPool);
                var3_7 = var2_2 + 1;
                var8_1[var2_2] = var5_8;
                var2_2 = var3_7;
                if (TypeInfo.isTwoWords(var5_8)) {
                    var2_2 = var3_7 + 1;
                }
                var7_6.setLength(0);
            }
            return var8_1;
        }
        throw new IllegalArgumentException("bad method type");
    }

    private static String descriptorToInternalName(String string) {
        char c2 = string.charAt(0);
        String string2 = string;
        if (c2 != 'F') {
            if (c2 != 'L') {
                string2 = string;
                if (c2 != 'S') {
                    string2 = string;
                    if (c2 != 'V') {
                        string2 = string;
                        if (c2 != 'I') {
                            string2 = string;
                            if (c2 != 'J') {
                                string2 = string;
                                if (c2 != 'Z') {
                                    string2 = string;
                                    if (c2 != '[') {
                                        string2 = string;
                                        switch (c2) {
                                            default: {
                                                throw new IllegalArgumentException(e.c("bad descriptor:", string));
                                            }
                                            case 'B': 
                                            case 'C': 
                                            case 'D': {
                                                return string2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                string2 = ClassFileWriter.classDescriptorToInternalName(string);
            }
        }
        return string2;
    }

    private void finalizeSuperBlockStarts() {
        if (GenerateStackMap) {
            int n2;
            for (n2 = 0; n2 < this.itsExceptionTableTop; ++n2) {
                this.addSuperBlockStart(this.getLabelPC(this.itsExceptionTable[n2].itsHandlerLabel));
            }
            Arrays.sort(this.itsSuperBlockStarts, 0, this.itsSuperBlockStartsTop);
            int n3 = this.itsSuperBlockStarts[0];
            int n4 = 1;
            for (n2 = 1; n2 < this.itsSuperBlockStartsTop; ++n2) {
                int[] nArray = this.itsSuperBlockStarts;
                int n5 = nArray[n2];
                int n6 = n3;
                int n7 = n4;
                if (n3 != n5) {
                    if (n4 != n2) {
                        nArray[n4] = n5;
                    }
                    n7 = n4 + 1;
                    n6 = n5;
                }
                n3 = n6;
                n4 = n7;
            }
            this.itsSuperBlockStartsTop = n4;
            if (this.itsSuperBlockStarts[n4 - 1] == this.itsCodeBufferTop) {
                this.itsSuperBlockStartsTop = n4 - 1;
            }
        }
    }

    private void fixLabelGotos() {
        byte[] byArray = this.itsCodeBuffer;
        for (int i2 = 0; i2 < this.itsFixupTableTop; ++i2) {
            long l2 = this.itsFixupTable[i2];
            int n2 = (int)(l2 >> 32);
            int n3 = (int)l2;
            if ((n2 = this.itsLabelTable[n2]) != -1) {
                this.addSuperBlockStart(n2);
                UintMap uintMap = this.itsJumpFroms;
                int n4 = n3 - 1;
                uintMap.put(n2, n4);
                if ((short)(n2 -= n4) == n2) {
                    byArray[n3] = (byte)(n2 >> 8);
                    byArray[n3 + 1] = (byte)n2;
                    continue;
                }
                throw new ClassFileWriter$ClassFileFormatException("Program too complex: too big jump offset");
            }
            throw new RuntimeException("unlocated label");
        }
        this.itsFixupTableTop = 0;
    }

    static String getSlashedForm(String string) {
        return string.replace('.', '/');
    }

    private int getWriteSize() {
        if (this.itsSourceFileNameIndex != 0) {
            this.itsConstantPool.addUtf8("SourceFile");
        }
        int n2 = this.itsConstantPool.getWriteSize();
        int n3 = this.itsInterfaces.size() * 2 + (8 + n2 + 2 + 2 + 2 + 2) + 2;
        int n4 = 0;
        for (n2 = 0; n2 < this.itsFields.size(); ++n2) {
            n3 += ((ClassFileField)this.itsFields.get(n2)).getWriteSize();
        }
        n3 += 2;
        for (n2 = n4; n2 < this.itsMethods.size(); ++n2) {
            n3 += ((ClassFileMethod)this.itsMethods.get(n2)).getWriteSize();
        }
        n2 = n3 += 2;
        if (this.itsSourceFileNameIndex != 0) {
            n2 = n3 + 2 + 4 + 2;
        }
        n3 = n2;
        if (this.itsBootstrapMethods != null) {
            n3 = n2 + 2 + 4 + 2 + this.itsBootstrapMethodsLength;
        }
        return n3;
    }

    /*
     * Exception decompiling
     */
    private static int opcodeCount(int var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 6[SWITCH]
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

    /*
     * Exception decompiling
     */
    private static int opcodeLength(int var0, boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 7[SWITCH]
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

    static int putInt16(int n2, byte[] byArray, int n3) {
        byArray[n3 + 0] = (byte)(n2 >>> 8);
        byArray[n3 + 1] = (byte)n2;
        return n3 + 2;
    }

    static int putInt32(int n2, byte[] byArray, int n3) {
        byArray[n3 + 0] = (byte)(n2 >>> 24);
        byArray[n3 + 1] = (byte)(n2 >>> 16);
        byArray[n3 + 2] = (byte)(n2 >>> 8);
        byArray[n3 + 3] = (byte)n2;
        return n3 + 4;
    }

    static int putInt64(long l2, byte[] byArray, int n2) {
        n2 = ClassFileWriter.putInt32((int)(l2 >>> 32), byArray, n2);
        return ClassFileWriter.putInt32((int)l2, byArray, n2);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static int sizeOfParameters(String var0) {
        block18: {
            block21: {
                block20: {
                    block17: {
                        var1_1 = var0.length();
                        var9_2 = var0.lastIndexOf(41);
                        if (3 > var1_1) break block18;
                        var7_3 = 0;
                        if (var0.charAt(0) != '(' || 1 > var9_2 || (var8_4 = var9_2 + 1) >= var1_1) break block18;
                        var2_5 = 1;
                        var1_1 = 0;
                        var3_6 = 0;
                        block11: while (var2_5 != var9_2) {
                            block19: {
                                var10_10 = var0.charAt(var2_5);
                                var4_7 = var2_5;
                                var5_8 = var1_1;
                                if (var10_10 == 'F') break block19;
                                var6_9 = var2_5;
                                if (var10_10 == 'L') ** GOTO lbl65
                                var4_7 = var2_5;
                                var5_8 = var1_1;
                                if (var10_10 == 'S') break block19;
                                var4_7 = var2_5;
                                var5_8 = var1_1;
                                if (var10_10 == 'I') break block19;
                                if (var10_10 == 'J') ** GOTO lbl-1000
                                var4_7 = var2_5;
                                var5_8 = var1_1;
                                if (var10_10 == 'Z') break block19;
                                var4_7 = var2_5;
                                if (var10_10 == '[') ** GOTO lbl33
                                var4_7 = var2_5;
                                var5_8 = var1_1;
                                block0 : switch (var10_10) {
                                    default: {
                                        ** break;
                                    }
lbl33:
                                    // 2 sources

                                    while ((var10_10 = var0.charAt(var2_5 = var4_7 + 1)) == '[') {
                                        var4_7 = var2_5;
                                    }
                                    var4_7 = var2_5;
                                    var5_8 = var1_1;
                                    if (var10_10 == 'F') break;
                                    var6_9 = var2_5;
                                    if (var10_10 != 'L') {
                                        var4_7 = var2_5;
                                        var5_8 = var1_1;
                                        if (var10_10 == 'S') break;
                                        var4_7 = var2_5;
                                        var5_8 = var1_1;
                                        if (var10_10 == 'Z') break;
                                        var4_7 = var2_5;
                                        var5_8 = var1_1;
                                        if (var10_10 == 'I') break;
                                        var4_7 = var2_5;
                                        var5_8 = var1_1;
                                        if (var10_10 == 'J') break;
                                        var4_7 = var2_5;
                                        var5_8 = var1_1;
                                        switch (var10_10) {
                                            default: {
                                                ** break;
                                            }
                                            case 'B': 
                                            case 'C': 
                                            case 'D': {
                                                break block0;
                                            }
                                        }
                                    }
                                    ** GOTO lbl65
                                    {
                                        case 'D': lbl-1000:
                                        // 2 sources

                                        {
                                            var5_8 = var1_1 - 1;
                                            var4_7 = var2_5;
                                            break block0;
                                        }
lbl65:
                                        // 2 sources

                                        var5_8 = var1_1 - 1;
                                        var4_7 = var3_6 + 1;
                                        var2_5 = var0.indexOf(59, ++var6_9);
                                        var1_1 = var5_8;
                                        var3_6 = var4_7;
                                        if (var6_9 + 1 <= var2_5) {
                                            if (var2_5 >= var9_2) {
                                                var1_1 = var5_8;
                                                var3_6 = var4_7;
                                                ** break;
                                            }
                                            ++var2_5;
                                            var1_1 = var5_8;
                                            var3_6 = var4_7;
                                            continue block11;
                                        }
lbl79:
                                        // 5 sources

                                        var2_5 = 0;
                                        var4_7 = var3_6;
                                        break block17;
                                    }
                                    case 'B': 
                                    case 'C': 
                                }
                            }
                            var1_1 = var5_8 - 1;
                            ++var3_6;
                            var2_5 = var4_7 + 1;
                        }
                        var2_5 = 1;
                        var4_7 = var3_6;
                    }
                    if (var2_5 == 0) break block18;
                    var5_8 = var0.charAt(var8_4);
                    var3_6 = var1_1;
                    if (var5_8 == 70) ** GOTO lbl-1000
                    var3_6 = var1_1;
                    if (var5_8 == 76) ** GOTO lbl-1000
                    var3_6 = var1_1;
                    if (var5_8 == 83) ** GOTO lbl-1000
                    var3_6 = var1_1;
                    if (var5_8 == 86) break block20;
                    var3_6 = var1_1;
                    if (var5_8 == 73) ** GOTO lbl-1000
                    if (var5_8 == 74) ** GOTO lbl-1000
                    var3_6 = var1_1;
                    if (var5_8 == 90) ** GOTO lbl-1000
                    var3_6 = var1_1;
                    if (var5_8 == 91) ** GOTO lbl-1000
                    var3_6 = var1_1;
                    switch (var5_8) {
                        default: {
                            var2_5 = var7_3;
                            break block21;
                        }
                        case 68: lbl-1000:
                        // 2 sources

                        {
                            var3_6 = var1_1 + 1;
                        }
                        case 66: 
                        case 67: lbl-1000:
                        // 7 sources

                        {
                            ++var3_6;
                        }
                    }
                }
                var1_1 = var3_6;
            }
            if (var2_5 != 0) {
                return var4_7 << 16 | 65535 & var1_1;
            }
        }
        throw new IllegalArgumentException(e.c("Bad parameter signature: ", var0));
    }

    private static int stackChange(int n2) {
        if (n2 != 254 && n2 != 255) {
            switch (n2) {
                default: {
                    throw new IllegalArgumentException(r.a("Bad opcode: ", n2));
                }
                case 80: 
                case 82: {
                    return -4;
                }
                case 79: 
                case 81: 
                case 83: 
                case 84: 
                case 85: 
                case 86: 
                case 148: 
                case 151: 
                case 152: {
                    return -3;
                }
                case 55: 
                case 57: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 71: 
                case 72: 
                case 73: 
                case 74: 
                case 88: 
                case 97: 
                case 99: 
                case 101: 
                case 103: 
                case 105: 
                case 107: 
                case 109: 
                case 111: 
                case 113: 
                case 115: 
                case 127: 
                case 129: 
                case 131: 
                case 159: 
                case 160: 
                case 161: 
                case 162: 
                case 163: 
                case 164: 
                case 165: 
                case 166: 
                case 173: 
                case 175: {
                    return -2;
                }
                case 46: 
                case 48: 
                case 50: 
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 56: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 67: 
                case 68: 
                case 69: 
                case 70: 
                case 75: 
                case 76: 
                case 77: 
                case 78: 
                case 87: 
                case 96: 
                case 98: 
                case 100: 
                case 102: 
                case 104: 
                case 106: 
                case 108: 
                case 110: 
                case 112: 
                case 114: 
                case 120: 
                case 121: 
                case 122: 
                case 123: 
                case 124: 
                case 125: 
                case 126: 
                case 128: 
                case 130: 
                case 136: 
                case 137: 
                case 142: 
                case 144: 
                case 149: 
                case 150: 
                case 153: 
                case 154: 
                case 155: 
                case 156: 
                case 157: 
                case 158: 
                case 170: 
                case 171: 
                case 172: 
                case 174: 
                case 176: 
                case 180: 
                case 181: 
                case 182: 
                case 183: 
                case 185: 
                case 191: 
                case 194: 
                case 195: 
                case 198: 
                case 199: {
                    return -1;
                }
                case 9: 
                case 10: 
                case 14: 
                case 15: 
                case 20: 
                case 22: 
                case 24: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 92: 
                case 93: 
                case 94: {
                    return 2;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 11: 
                case 12: 
                case 13: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 21: 
                case 23: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 89: 
                case 90: 
                case 91: 
                case 133: 
                case 135: 
                case 140: 
                case 141: 
                case 168: 
                case 187: 
                case 197: 
                case 201: {
                    return 1;
                }
                case 0: 
                case 47: 
                case 49: 
                case 95: 
                case 116: 
                case 117: 
                case 118: 
                case 119: 
                case 132: 
                case 134: 
                case 138: 
                case 139: 
                case 143: 
                case 145: 
                case 146: 
                case 147: 
                case 167: 
                case 169: 
                case 177: 
                case 178: 
                case 179: 
                case 184: 
                case 186: 
                case 188: 
                case 189: 
                case 190: 
                case 192: 
                case 193: 
                case 196: 
                case 200: 
                case 202: 
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void xop(int n2, int n3, int n4) {
        int n5 = n2;
        if (n4 != 0) {
            n5 = 1;
            if (n4 != 1) {
                n5 = 2;
                if (n4 != 2) {
                    n5 = 3;
                    if (n4 != 3) {
                        this.add(n3, n4);
                        return;
                    }
                }
            }
            n5 = n2 + n5;
        }
        this.add(n5);
    }

    public int acquireLabel() {
        int n2 = this.itsLabelTableTop;
        int[] nArray = this.itsLabelTable;
        if (nArray == null || n2 == nArray.length) {
            if (nArray == null) {
                this.itsLabelTable = new int[32];
            } else {
                int[] nArray2 = new int[nArray.length * 2];
                System.arraycopy(nArray, 0, nArray2, 0, n2);
                this.itsLabelTable = nArray2;
            }
        }
        this.itsLabelTableTop = n2 + 1;
        this.itsLabelTable[n2] = -1;
        return n2 | Integer.MIN_VALUE;
    }

    public void add(int n2) {
        if (ClassFileWriter.opcodeCount(n2) == 0) {
            short s2;
            int n3 = this.itsStackTop + ClassFileWriter.stackChange(n2);
            if (n3 < 0 || Short.MAX_VALUE < n3) {
                ClassFileWriter.badStack(n3);
            }
            this.addToCodeBuffer(n2);
            this.itsStackTop = s2 = (short)n3;
            if (n3 > this.itsMaxStack) {
                this.itsMaxStack = s2;
            }
            if (n2 == 191) {
                this.addSuperBlockStart(this.itsCodeBufferTop);
            }
            return;
        }
        throw new IllegalArgumentException("Unexpected operands");
    }

    /*
     * Exception decompiling
     */
    public void add(int var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 9[SWITCH]
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

    public void add(int n2, int n3, int n4) {
        block11: {
            block12: {
                block13: {
                    short s2;
                    int n5;
                    block10: {
                        block9: {
                            block5: {
                                block6: {
                                    block7: {
                                        block8: {
                                            n5 = this.itsStackTop + ClassFileWriter.stackChange(n2);
                                            if (n5 < 0 || Short.MAX_VALUE < n5) {
                                                ClassFileWriter.badStack(n5);
                                            }
                                            if (n2 != 132) break block5;
                                            if (n3 < 0 || 65536 <= n3) break block6;
                                            if (n4 < 0 || 65536 <= n4) break block7;
                                            if (n3 > 255 || n4 > 127) break block8;
                                            this.addToCodeBuffer(132);
                                            this.addToCodeBuffer(n3);
                                            break block9;
                                        }
                                        this.addToCodeBuffer(196);
                                        this.addToCodeBuffer(132);
                                        this.addToCodeInt16(n3);
                                        this.addToCodeInt16(n4);
                                        break block10;
                                    }
                                    throw new ClassFileWriter$ClassFileFormatException("out of range increment");
                                }
                                throw new ClassFileWriter$ClassFileFormatException("out of range variable");
                            }
                            if (n2 != 197) break block11;
                            if (n3 < 0 || n3 >= 65536) break block12;
                            if (n4 < 0 || n4 >= 256) break block13;
                            this.addToCodeBuffer(197);
                            this.addToCodeInt16(n3);
                        }
                        this.addToCodeBuffer(n4);
                    }
                    this.itsStackTop = s2 = (short)n5;
                    if (n5 > this.itsMaxStack) {
                        this.itsMaxStack = s2;
                    }
                    return;
                }
                throw new IllegalArgumentException("out of range dimensions");
            }
            throw new IllegalArgumentException("out of range index");
        }
        throw new IllegalArgumentException("Unexpected opcode for 2 operands");
    }

    public void add(int n2, String string) {
        short s2;
        int n3 = this.itsStackTop + ClassFileWriter.stackChange(n2);
        if (n3 < 0 || Short.MAX_VALUE < n3) {
            ClassFileWriter.badStack(n3);
        }
        if (n2 != 187 && n2 != 189 && n2 != 192 && n2 != 193) {
            throw new IllegalArgumentException("bad opcode for class reference");
        }
        short s3 = this.itsConstantPool.addClass(string);
        this.addToCodeBuffer(n2);
        this.addToCodeInt16(s3);
        this.itsStackTop = s2 = (short)n3;
        if (n3 > this.itsMaxStack) {
            this.itsMaxStack = s2;
        }
    }

    public void add(int n2, String string, String string2, String string3) {
        short s2;
        int n3 = this.itsStackTop + ClassFileWriter.stackChange(n2);
        short s3 = string3.charAt(0);
        s3 = s3 != 74 && s3 != 68 ? (short)1 : 2;
        switch (n2) {
            default: {
                throw new IllegalArgumentException("bad opcode for field reference");
            }
            case 179: 
            case 181: {
                s3 = n3 - s3;
                break;
            }
            case 178: 
            case 180: {
                s3 = n3 + s3;
            }
        }
        if (s3 < 0 || Short.MAX_VALUE < s3) {
            ClassFileWriter.badStack(s3);
        }
        n3 = this.itsConstantPool.addFieldRef(string, string2, string3);
        this.addToCodeBuffer(n2);
        this.addToCodeInt16(n3);
        this.itsStackTop = s2 = (short)s3;
        if (s3 > this.itsMaxStack) {
            this.itsMaxStack = s2;
        }
    }

    public void addALoad(int n2) {
        this.xop(42, 25, n2);
    }

    public void addAStore(int n2) {
        this.xop(75, 58, n2);
    }

    public void addDLoad(int n2) {
        this.xop(38, 24, n2);
    }

    public void addDStore(int n2) {
        this.xop(71, 57, n2);
    }

    public void addExceptionHandler(int n2, int n3, int n4, String exceptionTableEntryArray) {
        if ((n2 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            if ((n3 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                if ((n4 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    short s2 = exceptionTableEntryArray == null ? (short)0 : this.itsConstantPool.addClass((String)exceptionTableEntryArray);
                    ExceptionTableEntry exceptionTableEntry = new ExceptionTableEntry(n2, n3, n4, s2);
                    n2 = this.itsExceptionTableTop;
                    if (n2 == 0) {
                        this.itsExceptionTable = new ExceptionTableEntry[4];
                    } else {
                        ExceptionTableEntry[] exceptionTableEntryArray2 = this.itsExceptionTable;
                        if (n2 == exceptionTableEntryArray2.length) {
                            exceptionTableEntryArray = new ExceptionTableEntry[n2 * 2];
                            System.arraycopy(exceptionTableEntryArray2, 0, exceptionTableEntryArray, 0, n2);
                            this.itsExceptionTable = exceptionTableEntryArray;
                        }
                    }
                    this.itsExceptionTable[n2] = exceptionTableEntry;
                    this.itsExceptionTableTop = n2 + 1;
                    return;
                }
                throw new IllegalArgumentException("Bad handlerLabel");
            }
            throw new IllegalArgumentException("Bad endLabel");
        }
        throw new IllegalArgumentException("Bad startLabel");
    }

    public void addFLoad(int n2) {
        this.xop(34, 23, n2);
    }

    public void addFStore(int n2) {
        this.xop(67, 56, n2);
    }

    public void addField(String string, String string2, short s2) {
        short s3 = this.itsConstantPool.addUtf8(string);
        short s4 = this.itsConstantPool.addUtf8(string2);
        this.itsFields.add(new ClassFileField(s3, s4, s2));
    }

    public void addField(String object, String string, short s2, double d2) {
        object = new ClassFileField(this.itsConstantPool.addUtf8((String)object), this.itsConstantPool.addUtf8(string), s2);
        ((ClassFileField)object).setAttributes(this.itsConstantPool.addUtf8("ConstantValue"), (short)0, (short)2, this.itsConstantPool.addConstant(d2));
        this.itsFields.add(object);
    }

    public void addField(String object, String string, short s2, int n2) {
        object = new ClassFileField(this.itsConstantPool.addUtf8((String)object), this.itsConstantPool.addUtf8(string), s2);
        ((ClassFileField)object).setAttributes(this.itsConstantPool.addUtf8("ConstantValue"), (short)0, (short)0, this.itsConstantPool.addConstant(n2));
        this.itsFields.add(object);
    }

    public void addField(String object, String string, short s2, long l2) {
        object = new ClassFileField(this.itsConstantPool.addUtf8((String)object), this.itsConstantPool.addUtf8(string), s2);
        ((ClassFileField)object).setAttributes(this.itsConstantPool.addUtf8("ConstantValue"), (short)0, (short)2, this.itsConstantPool.addConstant(l2));
        this.itsFields.add(object);
    }

    public void addILoad(int n2) {
        this.xop(26, 21, n2);
    }

    public void addIStore(int n2) {
        this.xop(59, 54, n2);
    }

    public void addInterface(String string) {
        short s2 = this.itsConstantPool.addClass(string);
        this.itsInterfaces.add(s2);
    }

    public void addInvoke(int n2, String string, String string2, String string3) {
        short s2;
        int n3 = ClassFileWriter.sizeOfParameters(string3);
        int n4 = n3;
        if ((n4 = this.itsStackTop + n4 + ClassFileWriter.stackChange(n2)) < 0 || Short.MAX_VALUE < n4) {
            ClassFileWriter.badStack(n4);
        }
        switch (n2) {
            default: {
                throw new IllegalArgumentException("bad opcode for method reference");
            }
            case 182: 
            case 183: 
            case 184: 
            case 185: 
        }
        this.addToCodeBuffer(n2);
        if (n2 == 185) {
            this.addToCodeInt16(this.itsConstantPool.addInterfaceMethodRef(string, string2, string3));
            this.addToCodeBuffer((n3 >>> 16) + 1);
            this.addToCodeBuffer(0);
        } else {
            this.addToCodeInt16(this.itsConstantPool.addMethodRef(string, string2, string3));
        }
        this.itsStackTop = s2 = (short)n4;
        if (n4 > this.itsMaxStack) {
            this.itsMaxStack = s2;
        }
    }

    public void addInvokeDynamic(String string, String string2, ClassFileWriter$MHandle object, Object ... objectArray) {
        if (MajorVersion >= 51) {
            short s2;
            int n2;
            int n3 = ClassFileWriter.sizeOfParameters(string2);
            int n4 = this.itsStackTop + n3;
            if (n4 < 0 || Short.MAX_VALUE < n4) {
                ClassFileWriter.badStack(n4);
            }
            object = new ClassFileWriter$BootstrapEntry(this, (ClassFileWriter$MHandle)object, objectArray);
            if (this.itsBootstrapMethods == null) {
                this.itsBootstrapMethods = new ObjArray();
            }
            n3 = n2 = this.itsBootstrapMethods.indexOf(object);
            if (n2 == -1) {
                n3 = this.itsBootstrapMethods.size();
                this.itsBootstrapMethods.add(object);
                this.itsBootstrapMethodsLength += ((ClassFileWriter$BootstrapEntry)object).code.length;
            }
            n3 = this.itsConstantPool.addInvokeDynamic(string, string2, n3);
            this.addToCodeBuffer(186);
            this.addToCodeInt16(n3);
            this.addToCodeInt16(0);
            this.itsStackTop = s2 = (short)n4;
            if (n4 > this.itsMaxStack) {
                this.itsMaxStack = s2;
            }
            return;
        }
        throw new RuntimeException("Please build and run with JDK 1.7 for invokedynamic support");
    }

    public void addLLoad(int n2) {
        this.xop(30, 22, n2);
    }

    public void addLStore(int n2) {
        this.xop(63, 55, n2);
    }

    public void addLineNumberEntry(short s2) {
        if (this.itsCurrentMethod != null) {
            int n2 = this.itsLineNumberTableTop;
            if (n2 == 0) {
                this.itsLineNumberTable = new int[16];
            } else {
                int[] nArray = this.itsLineNumberTable;
                if (n2 == nArray.length) {
                    int[] nArray2 = new int[n2 * 2];
                    System.arraycopy(nArray, 0, nArray2, 0, n2);
                    this.itsLineNumberTable = nArray2;
                }
            }
            this.itsLineNumberTable[n2] = (this.itsCodeBufferTop << 16) + s2;
            this.itsLineNumberTableTop = n2 + 1;
            return;
        }
        throw new IllegalArgumentException("No method to stop");
    }

    public void addLoadConstant(double d2) {
        this.add(20, this.itsConstantPool.addConstant(d2));
    }

    public void addLoadConstant(float f2) {
        this.add(18, this.itsConstantPool.addConstant(f2));
    }

    public void addLoadConstant(int n2) {
        block6: {
            block0: {
                block1: {
                    block2: {
                        block7: {
                            block3: {
                                block4: {
                                    block5: {
                                        if (n2 == 0) break block0;
                                        if (n2 == 1) break block1;
                                        if (n2 == 2) break block2;
                                        if (n2 == 3) break block3;
                                        if (n2 == 4) break block4;
                                        if (n2 == 5) break block5;
                                        this.add(18, this.itsConstantPool.addConstant(n2));
                                        break block6;
                                    }
                                    n2 = 8;
                                    break block7;
                                }
                                n2 = 7;
                                break block7;
                            }
                            n2 = 6;
                        }
                        this.add(n2);
                        break block6;
                    }
                    this.add(5);
                    break block6;
                }
                this.add(4);
                break block6;
            }
            this.add(3);
        }
    }

    public void addLoadConstant(long l2) {
        this.add(20, this.itsConstantPool.addConstant(l2));
    }

    public void addLoadConstant(String string) {
        this.add(18, this.itsConstantPool.addConstant(string));
    }

    public void addLoadThis() {
        this.add(42);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void addPush(double d2) {
        if (d2 == 0.0) {
            this.add(14);
            if (!(1.0 / d2 < 0.0)) return;
        } else {
            if (d2 != 1.0 && d2 != -1.0) {
                this.addLoadConstant(d2);
                return;
            }
            this.add(15);
            if (!(d2 < 0.0)) return;
        }
        this.add(119);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void addPush(int n2) {
        short s2;
        block8: {
            block4: {
                block7: {
                    block6: {
                        block5: {
                            s2 = (short)n2;
                            if (s2 != n2) break block4;
                            if (n2 != -1) break block5;
                            n2 = 2;
                            break block6;
                        }
                        if (n2 < 0 || n2 > 5) break block7;
                        n2 = (byte)(n2 + 3);
                    }
                    this.add(n2);
                    return;
                }
                n2 = 16;
                break block8;
            }
            s2 = (short)n2;
            if (s2 != n2) {
                this.addLoadConstant(n2);
                return;
            }
            n2 = 17;
        }
        this.add(n2, s2);
    }

    public void addPush(long l2) {
        int n2 = (int)l2;
        if ((long)n2 == l2) {
            this.addPush(n2);
            this.add(133);
        } else {
            this.addLoadConstant(l2);
        }
    }

    public void addPush(String string) {
        int n2 = string.length();
        ConstantPool constantPool = this.itsConstantPool;
        int n3 = 0;
        int n4 = constantPool.getUtfEncodingLimit(string, 0, n2);
        if (n4 == n2) {
            this.addLoadConstant(string);
            return;
        }
        this.add(187, "java/lang/StringBuilder");
        this.add(89);
        this.addPush(n2);
        this.addInvoke(183, "java/lang/StringBuilder", "<init>", "(I)V");
        while (true) {
            this.add(89);
            this.addLoadConstant(string.substring(n3, n4));
            this.addInvoke(182, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
            this.add(87);
            if (n4 == n2) {
                this.addInvoke(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
                return;
            }
            int n5 = this.itsConstantPool.getUtfEncodingLimit(string, n4, n2);
            n3 = n4;
            n4 = n5;
        }
    }

    public void addPush(boolean bl) {
        int n2 = bl ? 4 : 3;
        this.add(n2);
    }

    public int addTableSwitch(int n2, int n3) {
        if (n2 <= n3) {
            short s2;
            int n4 = this.itsStackTop + ClassFileWriter.stackChange(170);
            if (n4 < 0 || Short.MAX_VALUE < n4) {
                ClassFileWriter.badStack(n4);
            }
            int n5 = ~this.itsCodeBufferTop & 3;
            int n6 = this.addReservedCodeSpace((n3 - n2 + 1 + 3) * 4 + (n5 + 1));
            byte[] byArray = this.itsCodeBuffer;
            int n7 = n6 + 1;
            byArray[n6] = -86;
            while (n5 != 0) {
                this.itsCodeBuffer[n7] = 0;
                --n5;
                ++n7;
            }
            n2 = ClassFileWriter.putInt32(n2, this.itsCodeBuffer, n7 + 4);
            ClassFileWriter.putInt32(n3, this.itsCodeBuffer, n2);
            this.itsStackTop = s2 = (short)n4;
            if (n4 > this.itsMaxStack) {
                this.itsMaxStack = s2;
            }
            return n6;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad bounds: ");
        stringBuilder.append(n2);
        stringBuilder.append(' ');
        stringBuilder.append(n3);
        throw new ClassFileWriter$ClassFileFormatException(stringBuilder.toString());
    }

    public void addVariableDescriptor(String string, String string2, int n2, int n3) {
        short s2 = this.itsConstantPool.addUtf8(string);
        short s3 = this.itsConstantPool.addUtf8(string2);
        if (this.itsVarDescriptors == null) {
            this.itsVarDescriptors = new ObjArray();
        }
        this.itsVarDescriptors.add(new int[]{s2, s3, n2, n3});
    }

    public void adjustStackTop(int n2) {
        short s2;
        if ((n2 = this.itsStackTop + n2) < 0 || Short.MAX_VALUE < n2) {
            ClassFileWriter.badStack(n2);
        }
        this.itsStackTop = s2 = (short)n2;
        if (n2 > this.itsMaxStack) {
            this.itsMaxStack = s2;
        }
    }

    final char[] getCharBuffer(int n2) {
        char[] cArray = this.tmpCharBuffer;
        if (n2 > cArray.length) {
            int n3 = cArray.length * 2;
            if (n2 <= n3) {
                n2 = n3;
            }
            this.tmpCharBuffer = new char[n2];
        }
        return this.tmpCharBuffer;
    }

    public final String getClassName() {
        return this.generatedClassName;
    }

    public int getCurrentCodeOffset() {
        return this.itsCodeBufferTop;
    }

    public int getLabelPC(int n2) {
        if (n2 < 0) {
            if ((n2 &= Integer.MAX_VALUE) < this.itsLabelTableTop) {
                return this.itsLabelTable[n2];
            }
            throw new IllegalArgumentException("Bad label");
        }
        throw new IllegalArgumentException("Bad label, no biscuit");
    }

    public short getStackTop() {
        return this.itsStackTop;
    }

    public boolean isUnderStringSizeLimit(String string) {
        return this.itsConstantPool.isUnderUtfEncodingLimit(string);
    }

    public void markHandler(int n2) {
        this.itsStackTop = 1;
        this.markLabel(n2);
    }

    public void markLabel(int n2) {
        if (n2 < 0) {
            if ((n2 &= Integer.MAX_VALUE) <= this.itsLabelTableTop) {
                int[] nArray = this.itsLabelTable;
                if (nArray[n2] == -1) {
                    nArray[n2] = this.itsCodeBufferTop;
                    return;
                }
                throw new IllegalStateException("Can only mark label once");
            }
            throw new IllegalArgumentException("Bad label");
        }
        throw new IllegalArgumentException("Bad label, no biscuit");
    }

    public void markLabel(int n2, short s2) {
        this.markLabel(n2);
        this.itsStackTop = s2;
    }

    public final void markTableSwitchCase(int n2, int n3) {
        this.addSuperBlockStart(this.itsCodeBufferTop);
        this.itsJumpFroms.put(this.itsCodeBufferTop, n2);
        this.setTableSwitchJump(n2, n3, this.itsCodeBufferTop);
    }

    public final void markTableSwitchCase(int n2, int n3, int n4) {
        if (n4 >= 0 && n4 <= this.itsMaxStack) {
            this.itsStackTop = (short)n4;
            this.addSuperBlockStart(this.itsCodeBufferTop);
            this.itsJumpFroms.put(this.itsCodeBufferTop, n2);
            this.setTableSwitchJump(n2, n3, this.itsCodeBufferTop);
            return;
        }
        throw new IllegalArgumentException(r.a("Bad stack index: ", n4));
    }

    public final void markTableSwitchDefault(int n2) {
        this.addSuperBlockStart(this.itsCodeBufferTop);
        this.itsJumpFroms.put(this.itsCodeBufferTop, n2);
        this.setTableSwitchJump(n2, -1, this.itsCodeBufferTop);
    }

    public void setFlags(short s2) {
        this.itsFlags = s2;
    }

    public void setStackTop(short s2) {
        this.itsStackTop = s2;
    }

    public void setTableSwitchJump(int n2, int n3, int n4) {
        int n5;
        if (n4 >= 0 && (n5 = this.itsCodeBufferTop) >= n4) {
            if (n3 >= -1) {
                int n6 = ~n2 & 3;
                int n7 = n2 + 1 + n6;
                if (n3 >= 0) {
                    n7 += (n3 + 3) * 4;
                }
                if (n2 >= 0 && n5 - 16 - n6 - 1 >= n2) {
                    Object object = this.itsCodeBuffer;
                    if ((object[n2] & 0xFF) == 170) {
                        if (n7 >= 0 && n5 >= n7 + 4) {
                            ClassFileWriter.putInt32(n4 - n2, object, n7);
                            return;
                        }
                        throw new ClassFileWriter$ClassFileFormatException(r.a("Too big case index: ", n3));
                    }
                    object = new StringBuilder();
                    object.append(n2);
                    object.append(" is not offset of tableswitch statement");
                    throw new IllegalArgumentException(object.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n2);
                stringBuilder.append(" is outside a possible range of tableswitch in already generated code");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new IllegalArgumentException(r.a("Bad case index: ", n3));
        }
        throw new IllegalArgumentException(r.a("Bad jump target: ", n4));
    }

    public void startMethod(String string, String string2, short s2) {
        this.itsCurrentMethod = new ClassFileMethod(string, this.itsConstantPool.addUtf8(string), string2, this.itsConstantPool.addUtf8(string2), s2);
        this.itsJumpFroms = new UintMap();
        this.itsMethods.add(this.itsCurrentMethod);
        this.addSuperBlockStart(0);
    }

    public void stopMethod(short s2) {
        if (this.itsCurrentMethod != null) {
            int n2;
            ClassFileWriter$StackMapTable classFileWriter$StackMapTable;
            this.fixLabelGotos();
            this.itsMaxLocals = s2;
            if (GenerateStackMap) {
                this.finalizeSuperBlockStarts();
                classFileWriter$StackMapTable = new ClassFileWriter$StackMapTable(this);
                classFileWriter$StackMapTable.generate();
            } else {
                classFileWriter$StackMapTable = null;
            }
            int n3 = this.itsLineNumberTable != null ? this.itsLineNumberTableTop * 4 + 8 : 0;
            Object object = this.itsVarDescriptors;
            int n4 = object != null ? ((ObjArray)object).size() * 10 + 8 : 0;
            n2 = classFileWriter$StackMapTable != null && (n2 = classFileWriter$StackMapTable.computeWriteSize()) > 0 ? (n2 += 6) : 0;
            Object object2 = this.itsCodeBufferTop;
            n3 = this.itsExceptionTableTop * 8 + (object2 + 14 + 2) + 2 + n3 + n4 + n2;
            if (n3 <= 65536) {
                Object object3;
                int n5;
                Object object4;
                Object object5;
                block13: {
                    object = new byte[n3];
                    n3 = ClassFileWriter.putInt32(n3 - 6, (byte[])object, ClassFileWriter.putInt16(this.itsConstantPool.addUtf8("Code"), (byte[])object, 0));
                    n3 = ClassFileWriter.putInt16(this.itsMaxStack, (byte[])object, n3);
                    n3 = ClassFileWriter.putInt16(this.itsMaxLocals, (byte[])object, n3);
                    n3 = ClassFileWriter.putInt32(this.itsCodeBufferTop, (byte[])object, n3);
                    System.arraycopy(this.itsCodeBuffer, 0, object, n3, this.itsCodeBufferTop);
                    n4 = n3 + this.itsCodeBufferTop;
                    n3 = this.itsExceptionTableTop;
                    if (n3 > 0) {
                        block14: {
                            block15: {
                                n3 = ClassFileWriter.putInt16(n3, (byte[])object, n4);
                                n4 = 0;
                                while (true) {
                                    object2 = n3;
                                    if (n4 >= this.itsExceptionTableTop) break block13;
                                    object5 = this.itsExceptionTable[n4];
                                    object4 = this.getLabelPC(((ExceptionTableEntry)object5).itsStartLabel);
                                    n5 = this.getLabelPC(((ExceptionTableEntry)object5).itsEndLabel);
                                    object2 = this.getLabelPC(((ExceptionTableEntry)object5).itsHandlerLabel);
                                    object3 = ((ExceptionTableEntry)object5).itsCatchType;
                                    if (object4 == -1) break block14;
                                    if (n5 == -1) break block15;
                                    if (object2 == -1) break;
                                    n3 = ClassFileWriter.putInt16(object3, (byte[])object, ClassFileWriter.putInt16(object2, (byte[])object, ClassFileWriter.putInt16(n5, (byte[])object, ClassFileWriter.putInt16(object4, (byte[])object, n3))));
                                    ++n4;
                                }
                                throw new IllegalStateException("handler label not defined");
                            }
                            throw new IllegalStateException("end label not defined");
                        }
                        throw new IllegalStateException("start label not defined");
                    }
                    object2 = ClassFileWriter.putInt16(0, (byte[])object, n4);
                }
                n4 = this.itsLineNumberTable != null ? 1 : 0;
                n3 = n4;
                if (this.itsVarDescriptors != null) {
                    n3 = n4 + 1;
                }
                n4 = n3;
                if (n2 > 0) {
                    n4 = n3 + 1;
                }
                n3 = n4 = ClassFileWriter.putInt16(n4, (byte[])object, object2);
                if (this.itsLineNumberTable != null) {
                    n3 = ClassFileWriter.putInt16(this.itsConstantPool.addUtf8("LineNumberTable"), (byte[])object, n4);
                    n3 = ClassFileWriter.putInt32(this.itsLineNumberTableTop * 4 + 2, (byte[])object, n3);
                    n4 = ClassFileWriter.putInt16(this.itsLineNumberTableTop, (byte[])object, n3);
                    object2 = 0;
                    while (true) {
                        n3 = n4;
                        if (object2 >= this.itsLineNumberTableTop) break;
                        n4 = ClassFileWriter.putInt32(this.itsLineNumberTable[object2], (byte[])object, n4);
                        ++object2;
                    }
                }
                object2 = n3;
                if (this.itsVarDescriptors != null) {
                    n3 = ClassFileWriter.putInt16(this.itsConstantPool.addUtf8("LocalVariableTable"), (byte[])object, n3);
                    n5 = this.itsVarDescriptors.size();
                    n3 = ClassFileWriter.putInt16(n5, (byte[])object, ClassFileWriter.putInt32(n5 * 10 + 2, (byte[])object, n3));
                    n4 = 0;
                    while (true) {
                        object2 = n3;
                        if (n4 >= n5) break;
                        object5 = (int[])this.itsVarDescriptors.get(n4);
                        object3 = object5[0];
                        object2 = object5[1];
                        object4 = object5[2];
                        n3 = ClassFileWriter.putInt16((int)object5[3], (byte[])object, ClassFileWriter.putInt16(object2, (byte[])object, ClassFileWriter.putInt16(object3, (byte[])object, ClassFileWriter.putInt16(this.itsCodeBufferTop - object4, (byte[])object, ClassFileWriter.putInt16(object4, (byte[])object, n3)))));
                        ++n4;
                    }
                }
                if (n2 > 0) {
                    classFileWriter$StackMapTable.write((byte[])object, ClassFileWriter.putInt16(this.itsConstantPool.addUtf8("StackMapTable"), (byte[])object, object2));
                }
                this.itsCurrentMethod.setCodeAttribute((byte[])object);
                this.itsExceptionTable = null;
                this.itsExceptionTableTop = 0;
                this.itsLineNumberTableTop = 0;
                this.itsCodeBufferTop = 0;
                this.itsCurrentMethod = null;
                this.itsMaxStack = 0;
                this.itsStackTop = 0;
                this.itsLabelTableTop = 0;
                this.itsFixupTableTop = 0;
                this.itsVarDescriptors = null;
                this.itsSuperBlockStarts = null;
                this.itsSuperBlockStartsTop = 0;
                this.itsJumpFroms = null;
                return;
            }
            throw new ClassFileWriter$ClassFileFormatException("generated bytecode for method exceeds 64K limit.");
        }
        throw new IllegalStateException("No method to stop");
    }

    public byte[] toByteArray() {
        short s2;
        int n2;
        int n3;
        if (this.itsBootstrapMethods != null) {
            n3 = this.itsConstantPool.addUtf8("BootstrapMethods");
            n2 = 1;
        } else {
            n3 = 0;
            n2 = 0;
        }
        if (this.itsSourceFileNameIndex != 0) {
            ++n2;
            s2 = this.itsConstantPool.addUtf8("SourceFile");
        } else {
            s2 = 0;
        }
        int n4 = this.getWriteSize();
        byte[] byArray = new byte[n4];
        int n5 = ClassFileWriter.putInt32(-889275714, byArray, 0);
        n5 = ClassFileWriter.putInt16(MinorVersion, byArray, n5);
        n5 = ClassFileWriter.putInt16(MajorVersion, byArray, n5);
        n5 = this.itsConstantPool.write(byArray, n5);
        n5 = ClassFileWriter.putInt16(this.itsFlags, byArray, n5);
        n5 = ClassFileWriter.putInt16(this.itsThisClassIndex, byArray, n5);
        n5 = ClassFileWriter.putInt16(this.itsSuperClassIndex, byArray, n5);
        int n6 = ClassFileWriter.putInt16(this.itsInterfaces.size(), byArray, n5);
        for (n5 = 0; n5 < this.itsInterfaces.size(); ++n5) {
            n6 = ClassFileWriter.putInt16(((Short)this.itsInterfaces.get(n5)).shortValue(), byArray, n6);
        }
        n6 = ClassFileWriter.putInt16(this.itsFields.size(), byArray, n6);
        for (n5 = 0; n5 < this.itsFields.size(); ++n5) {
            n6 = ((ClassFileField)this.itsFields.get(n5)).write(byArray, n6);
        }
        n6 = ClassFileWriter.putInt16(this.itsMethods.size(), byArray, n6);
        for (n5 = 0; n5 < this.itsMethods.size(); ++n5) {
            n6 = ((ClassFileMethod)this.itsMethods.get(n5)).write(byArray, n6);
        }
        n2 = n5 = ClassFileWriter.putInt16(n2, byArray, n6);
        if (this.itsBootstrapMethods != null) {
            n2 = ClassFileWriter.putInt16(n3, byArray, n5);
            n2 = ClassFileWriter.putInt32(this.itsBootstrapMethodsLength + 2, byArray, n2);
            n3 = ClassFileWriter.putInt16(this.itsBootstrapMethods.size(), byArray, n2);
            n5 = 0;
            while (true) {
                n2 = n3;
                if (n5 >= this.itsBootstrapMethods.size()) break;
                ClassFileWriter$BootstrapEntry classFileWriter$BootstrapEntry = (ClassFileWriter$BootstrapEntry)this.itsBootstrapMethods.get(n5);
                byte[] byArray2 = classFileWriter$BootstrapEntry.code;
                System.arraycopy(byArray2, 0, byArray, n3, byArray2.length);
                n3 += classFileWriter$BootstrapEntry.code.length;
                ++n5;
            }
        }
        n3 = n2;
        if (this.itsSourceFileNameIndex != 0) {
            n2 = ClassFileWriter.putInt32(2, byArray, ClassFileWriter.putInt16(s2, byArray, n2));
            n3 = ClassFileWriter.putInt16(this.itsSourceFileNameIndex, byArray, n2);
        }
        if (n3 == n4) {
            return byArray;
        }
        throw new RuntimeException();
    }

    public void write(OutputStream outputStream) {
        outputStream.write(this.toByteArray());
    }
}

