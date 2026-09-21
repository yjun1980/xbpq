/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

import com.github.catvod.spider.merge.A.c;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.classfile.ClassFileWriter$MHandle;
import org.mozilla.classfile.ConstantEntry;
import org.mozilla.classfile.FieldOrMethodRef;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.UintMap;

final class ConstantPool {
    static final byte CONSTANT_Class = 7;
    static final byte CONSTANT_Double = 6;
    static final byte CONSTANT_Fieldref = 9;
    static final byte CONSTANT_Float = 4;
    static final byte CONSTANT_Integer = 3;
    static final byte CONSTANT_InterfaceMethodref = 11;
    static final byte CONSTANT_InvokeDynamic = 18;
    static final byte CONSTANT_Long = 5;
    static final byte CONSTANT_MethodHandle = 15;
    static final byte CONSTANT_MethodType = 16;
    static final byte CONSTANT_Methodref = 10;
    static final byte CONSTANT_NameAndType = 12;
    static final byte CONSTANT_String = 8;
    static final byte CONSTANT_Utf8 = 1;
    private static final int ConstantPoolSize = 256;
    private static final int MAX_UTF_ENCODING_SIZE = 65535;
    private ClassFileWriter cfw;
    private ObjToIntMap itsClassHash;
    private UintMap itsConstantData;
    private ObjToIntMap itsConstantHash;
    private ObjToIntMap itsFieldRefHash;
    private ObjToIntMap itsMethodRefHash;
    private byte[] itsPool;
    private UintMap itsPoolTypes;
    private UintMap itsStringConstHash = new UintMap();
    private int itsTop;
    private int itsTopIndex;
    private ObjToIntMap itsUtf8Hash = new ObjToIntMap();

    ConstantPool(ClassFileWriter classFileWriter) {
        this.itsFieldRefHash = new ObjToIntMap();
        this.itsMethodRefHash = new ObjToIntMap();
        this.itsClassHash = new ObjToIntMap();
        this.itsConstantHash = new ObjToIntMap();
        this.itsConstantData = new UintMap();
        this.itsPoolTypes = new UintMap();
        this.cfw = classFileWriter;
        this.itsTopIndex = 1;
        this.itsPool = new byte[256];
        this.itsTop = 0;
    }

    private short addNameAndType(String object, String string) {
        int n2;
        short s2 = this.addUtf8((String)object);
        int n3 = this.addUtf8(string);
        this.ensure(5);
        object = this.itsPool;
        int n4 = this.itsTop;
        this.itsTop = n2 = n4 + 1;
        object[n4] = 12;
        this.itsTop = n2 = ClassFileWriter.putInt16(s2, (byte[])object, n2);
        this.itsTop = ClassFileWriter.putInt16(n3, this.itsPool, n2);
        this.itsPoolTypes.put(this.itsTopIndex, 12);
        n3 = this.itsTopIndex;
        this.itsTopIndex = n3 + 1;
        return (short)n3;
    }

    private void ensure(int n2) {
        int n3 = this.itsTop;
        byte[] byArray = this.itsPool;
        if (n3 + n2 > byArray.length) {
            int n4;
            int n5 = n4 = byArray.length * 2;
            if (n3 + n2 > n4) {
                n5 = n3 + n2;
            }
            byte[] byArray2 = new byte[n5];
            System.arraycopy(byArray, 0, byArray2, 0, n3);
            this.itsPool = byArray2;
        }
    }

    short addClass(String string) {
        int n2;
        int n3 = n2 = this.itsClassHash.get(string, -1);
        if (n2 == -1) {
            String string2;
            if (string.indexOf(46) > 0) {
                string2 = ClassFileWriter.getSlashedForm(string);
                n2 = this.itsClassHash.get(string2, -1);
                if (n2 != -1) {
                    this.itsClassHash.put(string, n2);
                }
            } else {
                string2 = string;
            }
            n3 = n2;
            if (n2 == -1) {
                short s2 = this.addUtf8(string2);
                this.ensure(3);
                byte[] byArray = this.itsPool;
                n2 = this.itsTop;
                this.itsTop = n3 = n2 + 1;
                byArray[n2] = 7;
                this.itsTop = ClassFileWriter.putInt16(s2, byArray, n3);
                n2 = this.itsTopIndex;
                this.itsTopIndex = n2 + 1;
                this.itsClassHash.put(string2, n2);
                n3 = n2;
                if (!string.equals(string2)) {
                    this.itsClassHash.put(string, n2);
                    n3 = n2;
                }
            }
        }
        this.setConstantData(n3, string);
        this.itsPoolTypes.put(n3, 7);
        return (short)n3;
    }

    int addConstant(double d2) {
        this.ensure(9);
        byte[] byArray = this.itsPool;
        int n2 = this.itsTop;
        this.itsTop = n2 + 1;
        byArray[n2] = 6;
        this.itsTop = ClassFileWriter.putInt64(Double.doubleToLongBits(d2), this.itsPool, this.itsTop);
        n2 = this.itsTopIndex;
        this.itsTopIndex = n2 + 2;
        this.itsPoolTypes.put(n2, 6);
        return n2;
    }

    int addConstant(float f2) {
        this.ensure(5);
        byte[] byArray = this.itsPool;
        int n2 = this.itsTop;
        this.itsTop = n2 + 1;
        byArray[n2] = 4;
        this.itsTop = ClassFileWriter.putInt32(Float.floatToIntBits(f2), this.itsPool, this.itsTop);
        this.itsPoolTypes.put(this.itsTopIndex, 4);
        n2 = this.itsTopIndex;
        this.itsTopIndex = n2 + 1;
        return n2;
    }

    int addConstant(int n2) {
        int n3;
        this.ensure(5);
        byte[] byArray = this.itsPool;
        int n4 = this.itsTop;
        this.itsTop = n3 = n4 + 1;
        byArray[n4] = 3;
        this.itsTop = ClassFileWriter.putInt32(n2, byArray, n3);
        this.itsPoolTypes.put(this.itsTopIndex, 3);
        n2 = this.itsTopIndex;
        this.itsTopIndex = n2 + 1;
        return (short)n2;
    }

    int addConstant(long l2) {
        int n2;
        this.ensure(9);
        byte[] byArray = this.itsPool;
        int n3 = this.itsTop;
        this.itsTop = n2 = n3 + 1;
        byArray[n3] = 5;
        this.itsTop = ClassFileWriter.putInt64(l2, byArray, n2);
        n2 = this.itsTopIndex;
        this.itsTopIndex = n2 + 2;
        this.itsPoolTypes.put(n2, 5);
        return n2;
    }

    int addConstant(Object object) {
        if (!(object instanceof Integer || object instanceof Byte || object instanceof Short)) {
            if (object instanceof Character) {
                return this.addConstant(((Character)object).charValue());
            }
            if (object instanceof Boolean) {
                return this.addConstant(((Boolean)object).booleanValue() ? 1 : 0);
            }
            if (object instanceof Float) {
                return this.addConstant(((Float)object).floatValue());
            }
            if (object instanceof Long) {
                return this.addConstant((Long)object);
            }
            if (object instanceof Double) {
                return this.addConstant((Double)object);
            }
            if (object instanceof String) {
                return this.addConstant((String)object);
            }
            if (object instanceof ClassFileWriter$MHandle) {
                return this.addMethodHandle((ClassFileWriter$MHandle)object);
            }
            throw new IllegalArgumentException(c.a("value ", object));
        }
        return this.addConstant(((Number)object).intValue());
    }

    int addConstant(String object) {
        int n2;
        int n3 = this.addUtf8((String)object) & 0xFFFF;
        int n4 = n2 = this.itsStringConstHash.getInt(n3, -1);
        if (n2 == -1) {
            n4 = this.itsTopIndex;
            this.itsTopIndex = n4 + 1;
            this.ensure(3);
            object = this.itsPool;
            int n5 = this.itsTop;
            this.itsTop = n2 = n5 + 1;
            object[n5] = 8;
            this.itsTop = ClassFileWriter.putInt16(n3, (byte[])object, n2);
            this.itsStringConstHash.put(n3, n4);
        }
        this.itsPoolTypes.put(n4, 8);
        return n4;
    }

    short addFieldRef(String object, String string, String string2) {
        int n2;
        FieldOrMethodRef fieldOrMethodRef = new FieldOrMethodRef((String)object, string, string2);
        int n3 = n2 = this.itsFieldRefHash.get(fieldOrMethodRef, -1);
        if (n2 == -1) {
            n3 = this.addNameAndType(string, string2);
            short s2 = this.addClass((String)object);
            this.ensure(5);
            object = this.itsPool;
            int n4 = this.itsTop;
            this.itsTop = n2 = n4 + 1;
            object[n4] = 9;
            this.itsTop = n2 = ClassFileWriter.putInt16(s2, (byte[])object, n2);
            this.itsTop = ClassFileWriter.putInt16(n3, this.itsPool, n2);
            n3 = this.itsTopIndex;
            this.itsTopIndex = n3 + 1;
            this.itsFieldRefHash.put(fieldOrMethodRef, n3);
        }
        this.setConstantData(n3, fieldOrMethodRef);
        this.itsPoolTypes.put(n3, 9);
        return (short)n3;
    }

    short addInterfaceMethodRef(String object, String string, String string2) {
        int n2;
        int n3 = this.addNameAndType(string, string2);
        short s2 = this.addClass((String)object);
        this.ensure(5);
        byte[] byArray = this.itsPool;
        int n4 = this.itsTop;
        this.itsTop = n2 = n4 + 1;
        byArray[n4] = 11;
        this.itsTop = n4 = ClassFileWriter.putInt16(s2, byArray, n2);
        this.itsTop = ClassFileWriter.putInt16(n3, this.itsPool, n4);
        object = new FieldOrMethodRef((String)object, string, string2);
        this.setConstantData(this.itsTopIndex, object);
        this.itsPoolTypes.put(this.itsTopIndex, 11);
        n3 = this.itsTopIndex;
        this.itsTopIndex = n3 + 1;
        return (short)n3;
    }

    short addInvokeDynamic(String object, String string, int n2) {
        int n3;
        ConstantEntry constantEntry = new ConstantEntry(18, n2, (String)object, string);
        int n4 = n3 = this.itsConstantHash.get(constantEntry, -1);
        if (n3 == -1) {
            int n5;
            n4 = this.addNameAndType((String)object, string);
            this.ensure(5);
            object = this.itsPool;
            n3 = this.itsTop;
            this.itsTop = n5 = n3 + 1;
            object[n3] = 18;
            this.itsTop = n2 = ClassFileWriter.putInt16(n2, (byte[])object, n5);
            this.itsTop = ClassFileWriter.putInt16(n4, this.itsPool, n2);
            n4 = this.itsTopIndex;
            this.itsTopIndex = n4 + 1;
            this.itsConstantHash.put(constantEntry, n4);
            this.setConstantData(n4, string);
            this.itsPoolTypes.put(n4, 18);
        }
        return (short)n4;
    }

    short addMethodHandle(ClassFileWriter$MHandle classFileWriter$MHandle) {
        int n2;
        int n3 = n2 = this.itsConstantHash.get(classFileWriter$MHandle, -1);
        if (n2 == -1) {
            n3 = classFileWriter$MHandle.tag;
            n3 = n3 <= 4 ? (int)this.addFieldRef(classFileWriter$MHandle.owner, classFileWriter$MHandle.name, classFileWriter$MHandle.desc) : (n3 == 9 ? (int)this.addInterfaceMethodRef(classFileWriter$MHandle.owner, classFileWriter$MHandle.name, classFileWriter$MHandle.desc) : (int)this.addMethodRef(classFileWriter$MHandle.owner, classFileWriter$MHandle.name, classFileWriter$MHandle.desc));
            this.ensure(4);
            byte[] byArray = this.itsPool;
            int n4 = this.itsTop;
            this.itsTop = n2 = n4 + 1;
            byArray[n4] = 15;
            this.itsTop = n4 = n2 + 1;
            byArray[n2] = classFileWriter$MHandle.tag;
            this.itsTop = ClassFileWriter.putInt16(n3, byArray, n4);
            n3 = this.itsTopIndex;
            this.itsTopIndex = n3 + 1;
            this.itsConstantHash.put(classFileWriter$MHandle, n3);
            this.itsPoolTypes.put(n3, 15);
        }
        return (short)n3;
    }

    short addMethodRef(String object, String string, String string2) {
        int n2;
        FieldOrMethodRef fieldOrMethodRef = new FieldOrMethodRef((String)object, string, string2);
        int n3 = n2 = this.itsMethodRefHash.get(fieldOrMethodRef, -1);
        if (n2 == -1) {
            n3 = this.addNameAndType(string, string2);
            short s2 = this.addClass((String)object);
            this.ensure(5);
            object = this.itsPool;
            int n4 = this.itsTop;
            this.itsTop = n2 = n4 + 1;
            object[n4] = 10;
            this.itsTop = n2 = ClassFileWriter.putInt16(s2, (byte[])object, n2);
            this.itsTop = ClassFileWriter.putInt16(n3, this.itsPool, n2);
            n3 = this.itsTopIndex;
            this.itsTopIndex = n3 + 1;
            this.itsMethodRefHash.put(fieldOrMethodRef, n3);
        }
        this.setConstantData(n3, fieldOrMethodRef);
        this.itsPoolTypes.put(n3, 10);
        return (short)n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    short addUtf8(String var1_1) {
        var2_3 = var3_2 = this.itsUtf8Hash.get(var1_1, -1);
        if (var3_2 == -1) {
            var7_4 = var1_1.length();
            var5_5 = 0;
            if (var7_4 > 65535) {
                while (true) {
                    var4_6 = 1;
                    var2_3 = var3_2;
                    var3_2 = var4_6;
                    break;
                }
            } else {
                this.ensure(var7_4 * 3 + 3);
                var2_3 = this.itsTop;
                this.itsPool[var2_3] = 1;
                var2_3 = var2_3 + 1 + 2;
                var10_7 /* !! */  = this.cfw.getCharBuffer(var7_4);
                var1_1.getChars(0, var7_4, var10_7 /* !! */ , 0);
                for (var4_6 = 0; var4_6 != var7_4; ++var4_6) {
                    var8_9 = var10_7 /* !! */ [var4_6];
                    if (var8_9 != '\u0000' && var8_9 <= '\u007f') {
                        var11_11 = this.itsPool;
                        var6_8 = var2_3 + 1;
                        var11_11[var2_3] = (byte)var8_9;
                        var2_3 = var6_8;
                        continue;
                    }
                    if (var8_9 > '\u07ff') {
                        var11_11 = this.itsPool;
                        var9_10 = var2_3 + 1;
                        var11_11[var2_3] = (byte)(var8_9 >> 12 | 224);
                        var6_8 = var9_10 + 1;
                        var11_11[var9_10] = (byte)(var8_9 >> 6 & 63 | 128);
                        var2_3 = var6_8 + 1;
                        var11_11[var6_8] = (byte)(var8_9 & 63 | 128);
                        continue;
                    }
                    var11_11 = this.itsPool;
                    var6_8 = var2_3 + 1;
                    var11_11[var2_3] = (byte)(var8_9 >> 6 | 192);
                    var2_3 = var6_8 + 1;
                    var11_11[var6_8] = (byte)(var8_9 & 63 | 128);
                }
                if ((var6_8 = var2_3 - ((var4_6 = this.itsTop) + 1 + 2)) > 65535) ** continue;
                var10_7 /* !! */  = (char[])this.itsPool;
                var10_7 /* !! */ [var4_6 + 1] = (char)(var6_8 >>> 8);
                var10_7 /* !! */ [var4_6 + 2] = (char)var6_8;
                this.itsTop = var2_3;
                var2_3 = this.itsTopIndex;
                this.itsTopIndex = var2_3 + 1;
                this.itsUtf8Hash.put(var1_1, var2_3);
                var3_2 = var5_5;
            }
            if (var3_2 != 0) {
                throw new IllegalArgumentException("Too big string");
            }
        }
        this.setConstantData(var2_3, var1_1);
        this.itsPoolTypes.put(var2_3, 1);
        return (short)var2_3;
    }

    Object getConstantData(int n2) {
        return this.itsConstantData.getObject(n2);
    }

    byte getConstantType(int n2) {
        return (byte)this.itsPoolTypes.getInt(n2, 0);
    }

    int getUtfEncodingLimit(String string, int n2, int n3) {
        int n4 = 65535;
        if ((n3 - n2) * 3 <= 65535) {
            return n3;
        }
        for (int i2 = n2; i2 != n3; ++i2) {
            n2 = string.charAt(i2);
            n2 = n2 != 0 && n2 <= 127 ? n4 - 1 : (n2 < 2047 ? n4 - 2 : n4 - 3);
            if (n2 < 0) {
                return i2;
            }
            n4 = n2;
        }
        return n3;
    }

    int getWriteSize() {
        return this.itsTop + 2;
    }

    boolean isUnderUtfEncodingLimit(String string) {
        int n2 = string.length();
        boolean bl = true;
        if (n2 * 3 <= 65535) {
            return true;
        }
        if (n2 > 65535) {
            return false;
        }
        if (n2 != this.getUtfEncodingLimit(string, 0, n2)) {
            bl = false;
        }
        return bl;
    }

    void setConstantData(int n2, Object object) {
        this.itsConstantData.put(n2, object);
    }

    int write(byte[] byArray, int n2) {
        n2 = ClassFileWriter.putInt16((short)this.itsTopIndex, byArray, n2);
        System.arraycopy(this.itsPool, 0, byArray, n2, this.itsTop);
        return n2 + this.itsTop;
    }
}

