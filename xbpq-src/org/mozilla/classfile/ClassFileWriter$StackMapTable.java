/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

import com.github.catvod.spider.merge.I.r;
import java.util.Arrays;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.classfile.ConstantPool;
import org.mozilla.classfile.ExceptionTableEntry;
import org.mozilla.classfile.FieldOrMethodRef;
import org.mozilla.classfile.SuperBlock;
import org.mozilla.classfile.TypeInfo;
import org.mozilla.javascript.Kit;

final class ClassFileWriter$StackMapTable {
    static final boolean DEBUGSTACKMAP = false;
    private int[] locals;
    private int localsTop;
    private byte[] rawStackMap;
    private int rawStackMapTop;
    private int[] stack;
    private int stackTop;
    private SuperBlock[] superBlocks;
    final ClassFileWriter this$0;
    private boolean wide;
    private SuperBlock[] workList;
    private int workListTop;

    ClassFileWriter$StackMapTable(ClassFileWriter classFileWriter) {
        this.this$0 = classFileWriter;
        this.superBlocks = null;
        this.stack = null;
        this.locals = null;
        this.workList = null;
        this.rawStackMap = null;
        this.localsTop = 0;
        this.stackTop = 0;
        this.workListTop = 0;
        this.rawStackMapTop = 0;
        this.wide = false;
    }

    private void addToWorkList(SuperBlock superBlock) {
        if (!superBlock.isInQueue()) {
            SuperBlock[] superBlockArray;
            superBlock.setInQueue(true);
            superBlock.setInitialized(true);
            int n2 = this.workListTop;
            SuperBlock[] superBlockArray2 = this.workList;
            if (n2 == superBlockArray2.length) {
                superBlockArray = new SuperBlock[n2 * 2];
                System.arraycopy(superBlockArray2, 0, superBlockArray, 0, n2);
                this.workList = superBlockArray;
            }
            superBlockArray = this.workList;
            n2 = this.workListTop;
            this.workListTop = n2 + 1;
            superBlockArray[n2] = superBlock;
        }
    }

    private void clearStack() {
        this.stackTop = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void computeRawStackMap() {
        var6_1 /* !! */  = this.superBlocks[0].getTrimmedLocals();
        var2_2 = -1;
        for (var1_3 = 1; var1_3 < (var7_7 /* !! */  = this.superBlocks).length; ++var1_3) {
            block6: {
                block4: {
                    block7: {
                        block5: {
                            var8_8 = var7_7 /* !! */ [var1_3];
                            var7_7 /* !! */  = (SuperBlock[])var8_8.getTrimmedLocals();
                            var9_9 = var8_8.getStack();
                            var4_5 = var8_8.getStart() - var2_2 - 1;
                            if (var9_9.length != 0) break block4;
                            var2_2 = var6_1 /* !! */ .length > var7_7 /* !! */ .length ? var7_7 /* !! */ .length : var6_1 /* !! */ .length;
                            var5_6 = Math.abs(var6_1 /* !! */ .length - var7_7 /* !! */ .length);
                            for (var3_4 = 0; var3_4 < var2_2 && var6_1 /* !! */ [var3_4] == var7_7 /* !! */ [var3_4]; ++var3_4) {
                            }
                            if (var3_4 != var7_7 /* !! */ .length || var5_6 != 0) break block5;
                            this.writeSameFrame(var4_5);
                            break block6;
                        }
                        if (var3_4 != var7_7 /* !! */ .length || var5_6 > 3) break block7;
                        this.writeChopFrame(var5_6, var4_5);
                        break block6;
                    }
                    if (var3_4 != var6_1 /* !! */ .length || var5_6 > 3) ** GOTO lbl-1000
                    this.writeAppendFrame((int[])var7_7 /* !! */ , var5_6, var4_5);
                    break block6;
                }
                if (var9_9.length == 1 && Arrays.equals(var6_1 /* !! */ , (int[])var7_7 /* !! */ )) {
                    this.writeSameLocalsOneStackItemFrame(var9_9, var4_5);
                } else lbl-1000:
                // 2 sources

                {
                    this.writeFullFrame((int[])var7_7 /* !! */ , var9_9, var4_5);
                }
            }
            var2_2 = var8_8.getStart();
            var6_1 /* !! */  = (int[])var7_7 /* !! */ ;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int execute(int var1_1) {
        block69: {
            var5_2 = ClassFileWriter.access$400(this.this$0)[var1_1] & 255;
            var3_3 = 2;
            var4_4 = 1;
            switch (var5_2) {
                default: {
                    throw new IllegalArgumentException(r.a("bad opcode: ", var5_2));
                }
                case 196: {
                    this.wide = true;
                    break;
                }
                case 192: {
                    this.pop();
                    var1_1 = this.getOperand(var1_1 + 1, 2);
                    ** GOTO lbl201
                }
                case 191: {
                    var1_1 = this.pop();
                    this.clearStack();
                    ** GOTO lbl251
                }
                case 189: {
                    var1_1 = this.getOperand(var1_1 + 1, 2);
                    var10_5 = (String)ClassFileWriter.access$500(this.this$0).getConstantData(var1_1);
                    this.pop();
                    var11_9 = new StringBuilder();
                    var11_9.append("[L");
                    var11_9.append(var10_5);
                    var11_9.append(';');
                    var1_1 = TypeInfo.OBJECT(var11_9.toString(), ClassFileWriter.access$500(this.this$0));
                    ** GOTO lbl251
                }
                case 188: {
                    this.pop();
                    var2_12 = ClassFileWriter.access$800(ClassFileWriter.access$400(this.this$0)[var1_1 + 1]);
                    var10_6 = ClassFileWriter.access$500(this.this$0);
                    var11_10 = new StringBuilder();
                    var11_10.append("[");
                    var11_10.append(var2_12);
                    var1_1 = var10_6.addClass(var11_10.toString());
                    ** GOTO lbl201
                }
                case 187: {
                    var1_1 = TypeInfo.UNINITIALIZED_VARIABLE(var1_1);
                    ** GOTO lbl251
                }
                case 186: {
                    var1_1 = this.getOperand(var1_1 + 1, 2);
                    var10_7 = (String)ClassFileWriter.access$500(this.this$0).getConstantData(var1_1);
                    var3_3 = ClassFileWriter.access$900((String)var10_7);
                    for (var1_1 = 0; var1_1 < var3_3 >>> 16; ++var1_1) {
                        this.pop();
                    }
                    if ((var10_7 = ClassFileWriter.access$1100(var10_7.substring(var10_7.indexOf(41) + 1))).equals("V")) break;
                    ** GOTO lbl82
                }
                case 182: 
                case 183: 
                case 184: 
                case 185: {
                    var1_1 = this.getOperand(var1_1 + 1, 2);
                    var10_7 = (FieldOrMethodRef)ClassFileWriter.access$500(this.this$0).getConstantData(var1_1);
                    var11_11 = var10_7.getType();
                    var12_13 = var10_7.getName();
                    var3_3 = ClassFileWriter.access$900(var11_11);
                    for (var1_1 = 0; var1_1 < var3_3 >>> 16; ++var1_1) {
                        this.pop();
                    }
                    if (var5_2 != 184 && ((var1_1 = TypeInfo.getTag(var3_3 = this.pop())) == TypeInfo.UNINITIALIZED_VARIABLE(0) || var1_1 == 6)) {
                        if ("<init>".equals(var12_13)) {
                            var1_1 = var1_1 == TypeInfo.UNINITIALIZED_VARIABLE(0) ? TypeInfo.OBJECT(var10_7.getClassName(), ClassFileWriter.access$500(this.this$0)) : TypeInfo.OBJECT(ClassFileWriter.access$1000(this.this$0));
                            this.initializeTypeInfo(var3_3, var1_1);
                        } else {
                            throw new IllegalStateException("bad instance");
                        }
                    }
                    if ((var10_7 = ClassFileWriter.access$1100(var11_11.substring(var11_11.indexOf(41) + 1))).equals("V")) break;
                    ** GOTO lbl82
                }
                case 180: {
                    this.pop();
                }
                case 178: {
                    var1_1 = this.getOperand(var1_1 + 1, 2);
                    var10_7 = ClassFileWriter.access$1100(((FieldOrMethodRef)ClassFileWriter.access$500(this.this$0).getConstantData(var1_1)).getType());
lbl82:
                    // 3 sources

                    var1_1 = TypeInfo.fromType((String)var10_7, ClassFileWriter.access$500(this.this$0));
                    ** GOTO lbl251
                }
                case 172: 
                case 173: 
                case 174: 
                case 175: 
                case 176: 
                case 177: {
                    this.clearStack();
                    break;
                }
                case 170: {
                    var4_4 = var1_1 + 1 + (~var1_1 & 3);
                    var3_3 = this.getOperand(var4_4 + 4, 4);
                    var1_1 = (this.getOperand(var4_4 + 8, 4) - var3_3 + 4) * 4 + var4_4 - var1_1;
                    this.pop();
                    break block69;
                }
                case 95: {
                    var1_1 = this.pop();
                    var3_3 = this.pop();
                    this.push(var1_1);
                    this.push(var3_3);
                    break;
                }
                case 94: {
                    var6_14 = this.pop2();
                    var8_16 = this.pop2();
                    this.push2(var6_14);
                    this.push2(var8_16);
                    ** GOTO lbl115
                }
                case 93: {
                    var6_14 = this.pop2();
                    var1_1 = this.pop();
                    this.push2(var6_14);
                    this.push(var1_1);
                    ** GOTO lbl115
                }
                case 92: {
                    var6_14 = this.pop2();
                    this.push2(var6_14);
lbl115:
                    // 3 sources

                    this.push2(var6_14);
                    break;
                }
                case 91: {
                    var1_1 = this.pop();
                    var6_15 = this.pop2();
                    this.push(var1_1);
                    this.push2(var6_15);
                    ** GOTO lbl251
                }
                case 90: {
                    var1_1 = this.pop();
                    var3_3 = this.pop();
                    this.push(var1_1);
                    this.push(var3_3);
                    ** GOTO lbl251
                }
                case 89: {
                    var1_1 = this.pop();
                    this.push(var1_1);
                    ** GOTO lbl251
                }
                case 88: {
                    this.pop2();
                    break;
                }
                case 79: 
                case 80: 
                case 81: 
                case 82: 
                case 83: 
                case 84: 
                case 85: 
                case 86: {
                    this.pop();
                }
                case 159: 
                case 160: 
                case 161: 
                case 162: 
                case 163: 
                case 164: 
                case 165: 
                case 166: 
                case 181: {
                    this.pop();
                }
                case 87: 
                case 153: 
                case 154: 
                case 155: 
                case 156: 
                case 157: 
                case 158: 
                case 179: 
                case 194: 
                case 195: 
                case 198: 
                case 199: {
                    this.pop();
                    break;
                }
                case 75: 
                case 76: 
                case 77: 
                case 78: {
                    var1_1 = var5_2 - 75;
                    ** GOTO lbl166
                }
                case 71: 
                case 72: 
                case 73: 
                case 74: {
                    var1_1 = var5_2 - 71;
                    ** GOTO lbl172
                }
                case 67: 
                case 68: 
                case 69: 
                case 70: {
                    var1_1 = var5_2 - 67;
                    ** GOTO lbl179
                }
                case 63: 
                case 64: 
                case 65: 
                case 66: {
                    var1_1 = var5_2 - 63;
                    ** GOTO lbl185
                }
                case 59: 
                case 60: 
                case 61: 
                case 62: {
                    var1_1 = var5_2 - 59;
                    ** GOTO lbl191
                }
                case 58: {
                    if (!this.wide) {
                        var3_3 = 1;
                    }
                    var1_1 = this.getOperand(var1_1 + 1, var3_3);
lbl166:
                    // 2 sources

                    this.executeAStore(var1_1);
                    break;
                }
                case 57: {
                    if (!this.wide) {
                        var3_3 = 1;
                    }
                    var1_1 = this.getOperand(var1_1 + 1, var3_3);
lbl172:
                    // 2 sources

                    this.executeStore(var1_1, 3);
                    break;
                }
                case 56: {
                    var3_3 = var4_4;
                    if (this.wide) {
                        var3_3 = 2;
                    }
                    var1_1 = this.getOperand(var1_1 + 1, var3_3);
lbl179:
                    // 2 sources

                    this.executeStore(var1_1, 2);
                    break;
                }
                case 55: {
                    if (!this.wide) {
                        var3_3 = 1;
                    }
                    var1_1 = this.getOperand(var1_1 + 1, var3_3);
lbl185:
                    // 2 sources

                    this.executeStore(var1_1, 4);
                    break;
                }
                case 54: {
                    if (!this.wide) {
                        var3_3 = 1;
                    }
                    var1_1 = this.getOperand(var1_1 + 1, var3_3);
lbl191:
                    // 2 sources

                    this.executeStore(var1_1, 1);
                    break;
                }
                case 50: {
                    this.pop();
                    var1_1 = this.pop();
                    var10_8 = (String)ClassFileWriter.access$500(this.this$0).getConstantData(var1_1 >>> 8);
                    if (var10_8.charAt(0) != '[') ** GOTO lbl203
                    var10_8 = ClassFileWriter.access$1100(var10_8.substring(1));
                    var1_1 = ClassFileWriter.access$500(this.this$0).addClass(var10_8);
lbl201:
                    // 3 sources

                    var1_1 = TypeInfo.OBJECT(var1_1);
                    ** GOTO lbl251
lbl203:
                    // 1 sources

                    throw new IllegalStateException("bad array type");
                }
                case 49: 
                case 99: 
                case 103: 
                case 107: 
                case 111: 
                case 115: {
                    this.pop();
                }
                case 119: 
                case 135: 
                case 138: 
                case 141: {
                    this.pop();
                    ** GOTO lbl254
                }
                case 48: 
                case 98: 
                case 102: 
                case 106: 
                case 110: 
                case 114: {
                    this.pop();
                }
                case 118: 
                case 134: 
                case 137: 
                case 144: {
                    this.pop();
                    ** GOTO lbl257
                }
                case 47: 
                case 97: 
                case 101: 
                case 105: 
                case 109: 
                case 113: 
                case 121: 
                case 123: 
                case 125: 
                case 127: 
                case 129: 
                case 131: {
                    this.pop();
                }
                case 117: 
                case 133: 
                case 140: 
                case 143: {
                    this.pop();
                    ** GOTO lbl260
                }
                case 46: 
                case 51: 
                case 52: 
                case 53: 
                case 96: 
                case 100: 
                case 104: 
                case 108: 
                case 112: 
                case 120: 
                case 122: 
                case 124: 
                case 126: 
                case 128: 
                case 130: 
                case 148: 
                case 149: 
                case 150: 
                case 151: 
                case 152: {
                    this.pop();
                }
                case 116: 
                case 136: 
                case 139: 
                case 142: 
                case 145: 
                case 146: 
                case 147: 
                case 190: 
                case 193: {
                    this.pop();
                    ** GOTO lbl263
                }
                case 42: 
                case 43: 
                case 44: 
                case 45: {
                    var1_1 = var5_2 - 42;
                    ** GOTO lbl239
                }
                case 25: {
                    if (!this.wide) {
                        var3_3 = 1;
                    }
                    var1_1 = this.getOperand(var1_1 + 1, var3_3);
lbl239:
                    // 2 sources

                    this.executeALoad(var1_1);
                    break;
                }
                case 18: 
                case 19: 
                case 20: {
                    ++var1_1;
                    var1_1 = var5_2 == 18 ? this.getOperand(var1_1) : this.getOperand(var1_1, 2);
                    var1_1 = ClassFileWriter.access$500(this.this$0).getConstantType(var1_1);
                    if (var1_1 == 3) ** GOTO lbl263
                    if (var1_1 == 4) ** GOTO lbl257
                    if (var1_1 == 5) ** GOTO lbl260
                    if (var1_1 == 6) ** GOTO lbl254
                    if (var1_1 != 8) ** GOTO lbl253
                    var1_1 = TypeInfo.OBJECT("java/lang/String", ClassFileWriter.access$500(this.this$0));
lbl251:
                    // 9 sources

                    this.push(var1_1);
                    break;
lbl253:
                    // 1 sources

                    throw new IllegalArgumentException(r.a("bad const type ", var1_1));
                }
lbl254:
                // 3 sources

                case 14: 
                case 15: 
                case 24: 
                case 38: 
                case 39: 
                case 40: 
                case 41: {
                    this.push(3);
                    break;
                }
lbl257:
                // 3 sources

                case 11: 
                case 12: 
                case 13: 
                case 23: 
                case 34: 
                case 35: 
                case 36: 
                case 37: {
                    this.push(2);
                    break;
                }
lbl260:
                // 3 sources

                case 9: 
                case 10: 
                case 22: 
                case 30: 
                case 31: 
                case 32: 
                case 33: {
                    this.push(4);
                    break;
                }
lbl263:
                // 3 sources

                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 16: 
                case 17: 
                case 21: 
                case 26: 
                case 27: 
                case 28: 
                case 29: {
                    this.push(1);
                    break;
                }
                case 1: {
                    this.push(5);
                }
                case 0: 
                case 132: 
                case 167: 
                case 200: 
            }
            var1_1 = 0;
        }
        var3_3 = var1_1;
        if (var1_1 == 0) {
            var3_3 = ClassFileWriter.access$1200(var5_2, this.wide);
        }
        if (this.wide && var5_2 != 196) {
            this.wide = false;
        }
        return var3_3;
    }

    private void executeALoad(int n2) {
        int n3 = this.getLocal(n2);
        int n4 = TypeInfo.getTag(n3);
        if (n4 != 7 && n4 != 6 && n4 != 8 && n4 != 5) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bad local variable type: ");
            stringBuilder.append(n3);
            stringBuilder.append(" at index: ");
            stringBuilder.append(n2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.push(n3);
    }

    private void executeAStore(int n2) {
        this.setLocal(n2, this.pop());
    }

    private void executeBlock(SuperBlock superBlockArray) {
        int n2;
        Object object;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = ClassFileWriter.access$600(this.this$0);
        if (ClassFileWriter.access$600(this.this$0) > 1) {
            n6 = Integer.MAX_VALUE;
            n5 = 0;
            n4 = 0;
            while (true) {
                n3 = n6;
                n7 = n5;
                if (n4 < ClassFileWriter.access$600(this.this$0)) {
                    object = ClassFileWriter.access$700(this.this$0)[n4];
                    n7 = n6;
                    n3 = n5;
                    if (superBlockArray.getEnd() >= this.this$0.getLabelPC(((ExceptionTableEntry)object).itsStartLabel)) {
                        n7 = n6;
                        n3 = n5;
                        if (superBlockArray.getStart() < this.this$0.getLabelPC(((ExceptionTableEntry)object).itsEndLabel)) {
                            n7 = Math.min(n6, n4);
                            n3 = Math.max(n5, n4 + 1);
                        }
                    }
                    ++n4;
                    n6 = n7;
                    n5 = n3;
                    continue;
                }
                break;
            }
        } else {
            n3 = 0;
        }
        n6 = 0;
        for (n5 = superBlockArray.getStart(); n5 < superBlockArray.getEnd(); n5 += n2) {
            int n8;
            int n9 = ClassFileWriter.access$400(this.this$0)[n5] & 0xFF;
            n2 = this.execute(n5);
            if (this.isBranch(n9)) {
                this.flowInto(this.getBranchTarget(n5));
            } else if (n9 == 170) {
                int n10 = n5 + 1 + (~n5 & 3);
                this.flowInto(this.getSuperBlockFromOffset(this.getOperand(n10, 4) + n5));
                n8 = this.getOperand(n10 + 4, 4);
                n4 = this.getOperand(n10 + 8, 4);
                for (n6 = 0; n6 < n4 - n8 + 1; ++n6) {
                    this.flowInto(this.getSuperBlockFromOffset(this.getOperand(n6 * 4 + (n10 + 12), 4) + n5));
                }
            }
            for (n6 = n3; n6 < n7; ++n6) {
                Object object2 = ClassFileWriter.access$700(this.this$0)[n6];
                n8 = this.this$0.getLabelPC(((ExceptionTableEntry)object2).itsStartLabel);
                n4 = this.this$0.getLabelPC(((ExceptionTableEntry)object2).itsEndLabel);
                if (n5 < n8 || n5 >= n4) continue;
                object = this.getSuperBlockFromOffset(this.this$0.getLabelPC(((ExceptionTableEntry)object2).itsHandlerLabel));
                n4 = n8 = (int)((ExceptionTableEntry)object2).itsCatchType;
                if (n8 == 0) {
                    n4 = ClassFileWriter.access$500(this.this$0).addClass("java/lang/Throwable");
                }
                n4 = TypeInfo.OBJECT(n4);
                object2 = this.locals;
                n8 = this.localsTop;
                ConstantPool constantPool = ClassFileWriter.access$500(this.this$0);
                ((SuperBlock)object).merge((int[])object2, n8, new int[]{n4}, 1, constantPool);
                this.addToWorkList((SuperBlock)object);
            }
            n6 = n9;
        }
        if (!this.isSuperBlockEnd(n6) && (n3 = superBlockArray.getIndex() + 1) < (superBlockArray = this.superBlocks).length) {
            this.flowInto(superBlockArray[n3]);
        }
    }

    private void executeStore(int n2, int n3) {
        this.pop();
        this.setLocal(n2, n3);
    }

    private void executeWorkList() {
        int n2;
        while ((n2 = this.workListTop) > 0) {
            Object[] objectArray = this.workList;
            this.workListTop = --n2;
            SuperBlock superBlock = objectArray[n2];
            superBlock.setInQueue(false);
            this.locals = superBlock.getLocals();
            objectArray = superBlock.getStack();
            this.stack = (int[])objectArray;
            this.localsTop = this.locals.length;
            this.stackTop = objectArray.length;
            this.executeBlock(superBlock);
        }
    }

    private void flowInto(SuperBlock superBlock) {
        if (superBlock.merge(this.locals, this.localsTop, this.stack, this.stackTop, ClassFileWriter.access$500(this.this$0))) {
            this.addToWorkList(superBlock);
        }
    }

    private SuperBlock getBranchTarget(int n2) {
        int n3 = (ClassFileWriter.access$400(this.this$0)[n2] & 0xFF) == 200 ? this.getOperand(n2 + 1, 4) : (int)((short)this.getOperand(n2 + 1, 2));
        return this.getSuperBlockFromOffset(n2 + n3);
    }

    private int getLocal(int n2) {
        if (n2 < this.localsTop) {
            return this.locals[n2];
        }
        return 0;
    }

    private int getOperand(int n2) {
        return this.getOperand(n2, 1);
    }

    private int getOperand(int n2, int n3) {
        if (n3 <= 4) {
            int n4 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                n4 = n4 << 8 | ClassFileWriter.access$400(this.this$0)[n2 + i2] & 0xFF;
            }
            return n4;
        }
        throw new IllegalArgumentException("bad operand size");
    }

    private SuperBlock getSuperBlockFromOffset(int n2) {
        int n3;
        int n4 = n3 = Arrays.binarySearch(ClassFileWriter.access$200(this.this$0), 0, ClassFileWriter.access$000(this.this$0), n2);
        if (n3 < 0) {
            n4 = -n3 - 2;
        }
        if (n4 < ClassFileWriter.access$000(this.this$0)) {
            SuperBlock superBlock = this.superBlocks[n4];
            if (n2 < superBlock.getStart() || n2 >= superBlock.getEnd()) {
                Kit.codeBug();
            }
            return superBlock;
        }
        throw new IllegalArgumentException(r.a("bad offset: ", n2));
    }

    private int getWorstCaseWriteSize() {
        int n2 = this.superBlocks.length;
        short s2 = ClassFileWriter.access$1300(this.this$0);
        return (ClassFileWriter.access$1400(this.this$0) * 3 + (s2 * 3 + 7)) * (n2 - 1);
    }

    private void initializeTypeInfo(int n2, int n3) {
        this.initializeTypeInfo(n2, n3, this.locals, this.localsTop);
        this.initializeTypeInfo(n2, n3, this.stack, this.stackTop);
    }

    private void initializeTypeInfo(int n2, int n3, int[] nArray, int n4) {
        for (int i2 = 0; i2 < n4; ++i2) {
            if (nArray[i2] != n2) continue;
            nArray[i2] = n3;
        }
    }

    private boolean isBranch(int n2) {
        switch (n2) {
            default: {
                switch (n2) {
                    default: {
                        return false;
                    }
                    case 198: 
                    case 199: 
                    case 200: 
                }
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
        }
        return true;
    }

    private boolean isSuperBlockEnd(int n2) {
        if (n2 != 167 && n2 != 191 && n2 != 200 && n2 != 176 && n2 != 177) {
            switch (n2) {
                default: {
                    return false;
                }
                case 170: 
                case 171: 
                case 172: 
                case 173: 
                case 174: 
            }
        }
        return true;
    }

    private void killSuperBlock(SuperBlock superBlock) {
        Object object;
        int n2;
        int n3;
        int n4;
        int[] nArray;
        block13: {
            nArray = new int[]{};
            n4 = TypeInfo.OBJECT("java/lang/Throwable", ClassFileWriter.access$500(this.this$0));
            n3 = superBlock.getStart();
            n2 = 0;
            while (true) {
                object = nArray;
                if (n2 >= ClassFileWriter.access$600(this.this$0)) break;
                Object object2 = ClassFileWriter.access$700(this.this$0)[n2];
                int n5 = this.this$0.getLabelPC(((ExceptionTableEntry)object2).itsStartLabel);
                if (n3 > n5 && n3 < this.this$0.getLabelPC(((ExceptionTableEntry)object2).itsEndLabel)) {
                    object = this.getSuperBlockFromOffset(this.this$0.getLabelPC(((ExceptionTableEntry)object2).itsHandlerLabel));
                    nArray = object.getLocals();
                    if (object.isInitialized()) break block13;
                    object = nArray;
                } else {
                    object = nArray;
                    if (n5 > n3) {
                        object = nArray;
                        if (n5 < superBlock.getEnd()) {
                            object2 = this.getSuperBlockFromOffset(this.this$0.getLabelPC(((ExceptionTableEntry)object2).itsHandlerLabel));
                            object = nArray;
                            if (((SuperBlock)object2).isInitialized()) {
                                object = ((SuperBlock)object2).getLocals();
                                break;
                            }
                        }
                    }
                }
                ++n2;
                nArray = object;
            }
            nArray = object;
        }
        n2 = 0;
        while (n2 < ClassFileWriter.access$600(this.this$0)) {
            block15: {
                block14: {
                    object = ClassFileWriter.access$700(this.this$0)[n2];
                    if (this.this$0.getLabelPC(object.itsStartLabel) == superBlock.getStart()) break block14;
                    n3 = n2;
                    if (this.this$0.getLabelPC(object.itsHandlerLabel) != superBlock.getStart()) break block15;
                }
                for (n3 = n2 + 1; n3 < ClassFileWriter.access$600(this.this$0); ++n3) {
                    ClassFileWriter.access$700((ClassFileWriter)this.this$0)[n3 - 1] = ClassFileWriter.access$700(this.this$0)[n3];
                }
                ClassFileWriter.access$610(this.this$0);
                n3 = n2 - 1;
            }
            n2 = n3 + 1;
        }
        n2 = nArray.length;
        object = ClassFileWriter.access$500(this.this$0);
        superBlock.merge(nArray, n2, new int[]{n4}, 1, (ConstantPool)object);
        n3 = superBlock.getEnd() - 1;
        ClassFileWriter.access$400((ClassFileWriter)this.this$0)[n3] = -65;
        for (n2 = superBlock.getStart(); n2 < n3; ++n2) {
            ClassFileWriter.access$400((ClassFileWriter)this.this$0)[n2] = 0;
        }
    }

    private int pop() {
        int n2;
        int[] nArray = this.stack;
        this.stackTop = n2 = this.stackTop - 1;
        return nArray[n2];
    }

    private long pop2() {
        long l2 = this.pop();
        if (TypeInfo.isTwoWords((int)l2)) {
            return l2;
        }
        return l2 << 32 | (long)(this.pop() & 0xFFFFFF);
    }

    private void push(int n2) {
        int[] nArray;
        int n3 = this.stackTop;
        if (n3 == this.stack.length) {
            nArray = new int[Math.max(n3 * 2, 4)];
            System.arraycopy(this.stack, 0, nArray, 0, this.stackTop);
            this.stack = nArray;
        }
        nArray = this.stack;
        n3 = this.stackTop;
        this.stackTop = n3 + 1;
        nArray[n3] = n2;
    }

    private void push2(long l2) {
        this.push((int)(l2 & 0xFFFFFFL));
        if ((l2 >>>= 32) != 0L) {
            this.push((int)(l2 & 0xFFFFFFL));
        }
    }

    private void setLocal(int n2, int n3) {
        int n4 = this.localsTop;
        if (n2 >= n4) {
            int n5 = n2 + 1;
            int[] nArray = new int[n5];
            System.arraycopy(this.locals, 0, nArray, 0, n4);
            this.locals = nArray;
            this.localsTop = n5;
        }
        this.locals[n2] = n3;
    }

    private void verify() {
        Object object = ClassFileWriter.access$100(this.this$0);
        Object object2 = this.superBlocks;
        SuperBlock superBlock = object2[0];
        int n2 = ((int[])object).length;
        object2 = ClassFileWriter.access$500(this.this$0);
        superBlock.merge((int[])object, n2, new int[0], 0, (ConstantPool)object2);
        this.workList = new SuperBlock[]{this.superBlocks[0]};
        this.workListTop = 1;
        this.executeWorkList();
        object2 = this.superBlocks;
        n2 = ((SuperBlock[])object2).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            object = object2[i2];
            if (((SuperBlock)object).isInitialized()) continue;
            this.killSuperBlock((SuperBlock)object);
        }
        this.executeWorkList();
    }

    private void writeAppendFrame(int[] nArray, int n2, int n3) {
        int n4;
        int n5 = nArray.length;
        byte[] byArray = this.rawStackMap;
        int n6 = this.rawStackMapTop;
        this.rawStackMapTop = n4 = n6 + 1;
        byArray[n6] = (byte)(n2 + 251);
        this.rawStackMapTop = ClassFileWriter.putInt16(n3, byArray, n4);
        this.rawStackMapTop = this.writeTypes(nArray, n5 - n2);
    }

    private void writeChopFrame(int n2, int n3) {
        int n4;
        byte[] byArray = this.rawStackMap;
        int n5 = this.rawStackMapTop;
        this.rawStackMapTop = n4 = n5 + 1;
        byArray[n5] = (byte)(251 - n2);
        this.rawStackMapTop = ClassFileWriter.putInt16(n3, byArray, n4);
    }

    private void writeFullFrame(int[] nArray, int[] nArray2, int n2) {
        int n3;
        byte[] byArray = this.rawStackMap;
        int n4 = this.rawStackMapTop;
        this.rawStackMapTop = n3 = n4 + 1;
        byArray[n4] = -1;
        this.rawStackMapTop = n2 = ClassFileWriter.putInt16(n2, byArray, n3);
        this.rawStackMapTop = ClassFileWriter.putInt16(nArray.length, this.rawStackMap, n2);
        this.writeTypes(nArray);
        this.rawStackMapTop = ClassFileWriter.putInt16(nArray2.length, this.rawStackMap, this.rawStackMapTop);
        this.writeTypes(nArray2);
    }

    private void writeSameFrame(int n2) {
        if (n2 <= 63) {
            byte[] byArray = this.rawStackMap;
            int n3 = this.rawStackMapTop;
            this.rawStackMapTop = n3 + 1;
            byArray[n3] = (byte)n2;
        } else {
            int n4;
            byte[] byArray = this.rawStackMap;
            int n5 = this.rawStackMapTop;
            this.rawStackMapTop = n4 = n5 + 1;
            byArray[n5] = -5;
            this.rawStackMapTop = ClassFileWriter.putInt16(n2, byArray, n4);
        }
    }

    private void writeSameLocalsOneStackItemFrame(int[] nArray, int n2) {
        if (n2 <= 63) {
            byte[] byArray = this.rawStackMap;
            int n3 = this.rawStackMapTop;
            this.rawStackMapTop = n3 + 1;
            byArray[n3] = (byte)(n2 + 64);
        } else {
            int n4;
            byte[] byArray = this.rawStackMap;
            int n5 = this.rawStackMapTop;
            this.rawStackMapTop = n4 = n5 + 1;
            byArray[n5] = -9;
            this.rawStackMapTop = ClassFileWriter.putInt16(n2, byArray, n4);
        }
        this.writeType(nArray[0]);
    }

    private int writeType(int n2) {
        int n3;
        int n4 = n2 & 0xFF;
        byte[] byArray = this.rawStackMap;
        int n5 = this.rawStackMapTop;
        this.rawStackMapTop = n3 = n5 + 1;
        byArray[n5] = (byte)n4;
        if (n4 == 7 || n4 == 8) {
            this.rawStackMapTop = ClassFileWriter.putInt16(n2 >>> 8, byArray, n3);
        }
        return this.rawStackMapTop;
    }

    private int writeTypes(int[] nArray) {
        return this.writeTypes(nArray, 0);
    }

    private int writeTypes(int[] nArray, int n2) {
        while (n2 < nArray.length) {
            this.rawStackMapTop = this.writeType(nArray[n2]);
            ++n2;
        }
        return this.rawStackMapTop;
    }

    int computeWriteSize() {
        this.rawStackMap = new byte[this.getWorstCaseWriteSize()];
        this.computeRawStackMap();
        return this.rawStackMapTop + 2;
    }

    void generate() {
        this.superBlocks = new SuperBlock[ClassFileWriter.access$000(this.this$0)];
        int[] nArray = ClassFileWriter.access$100(this.this$0);
        for (int i2 = 0; i2 < ClassFileWriter.access$000(this.this$0); ++i2) {
            int n2 = ClassFileWriter.access$200(this.this$0)[i2];
            int n3 = i2 == ClassFileWriter.access$000(this.this$0) - 1 ? ClassFileWriter.access$300(this.this$0) : ClassFileWriter.access$200(this.this$0)[i2 + 1];
            this.superBlocks[i2] = new SuperBlock(i2, n2, n3, nArray);
        }
        this.verify();
    }

    int write(byte[] byArray, int n2) {
        n2 = ClassFileWriter.putInt32(this.rawStackMapTop + 2, byArray, n2);
        n2 = ClassFileWriter.putInt16(this.superBlocks.length - 1, byArray, n2);
        System.arraycopy(this.rawStackMap, 0, byArray, n2, this.rawStackMapTop);
        return n2 + this.rawStackMapTop;
    }
}

