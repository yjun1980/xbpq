/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

import com.github.catvod.spider.merge.C.a;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.classfile.ConstantPool;

final class TypeInfo {
    static final int DOUBLE = 3;
    static final int FLOAT = 2;
    static final int INTEGER = 1;
    static final int LONG = 4;
    static final int NULL = 5;
    static final int OBJECT_TAG = 7;
    static final int TOP = 0;
    static final int UNINITIALIZED_THIS = 6;
    static final int UNINITIALIZED_VAR_TAG = 8;

    private TypeInfo() {
    }

    static final int OBJECT(int n2) {
        return (n2 & 0xFFFF) << 8 | 7;
    }

    static final int OBJECT(String string, ConstantPool constantPool) {
        return TypeInfo.OBJECT(constantPool.addClass(string));
    }

    static final int UNINITIALIZED_VARIABLE(int n2) {
        return (n2 & 0xFFFF) << 8 | 8;
    }

    static final int fromType(String string, ConstantPool constantPool) {
        if (string.length() == 1) {
            char c2 = string.charAt(0);
            if (c2 != 'F') {
                if (c2 != 'S' && c2 != 'Z' && c2 != 'I') {
                    if (c2 != 'J') {
                        switch (c2) {
                            default: {
                                throw new IllegalArgumentException("bad type");
                            }
                            case 'D': {
                                return 3;
                            }
                            case 'B': 
                            case 'C': {
                                return 1;
                            }
                        }
                    }
                    return 4;
                }
                return 1;
            }
            return 2;
        }
        return TypeInfo.OBJECT(string, constantPool);
    }

    private static Class<?> getClassFromInternalName(String object) {
        try {
            object = Class.forName(((String)object).replace('/', '.'));
            return object;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException(classNotFoundException);
        }
    }

    static final int getPayload(int n2) {
        return n2 >>> 8;
    }

    static final String getPayloadAsType(int n2, ConstantPool constantPool) {
        if (TypeInfo.getTag(n2) == 7) {
            return (String)constantPool.getConstantData(TypeInfo.getPayload(n2));
        }
        throw new IllegalArgumentException("expecting object type");
    }

    static final int getTag(int n2) {
        return n2 & 0xFF;
    }

    static boolean isTwoWords(int n2) {
        boolean bl = n2 == 3 || n2 == 4;
        return bl;
    }

    static int merge(int n2, int n3, ConstantPool constantPool) {
        if (n2 == n3) {
            return n2;
        }
        int n4 = TypeInfo.getTag(n2);
        int n5 = TypeInfo.getTag(n3);
        boolean bl = true;
        boolean bl2 = n4 == 7;
        if (n5 != 7) {
            bl = false;
        }
        if (bl2 && n3 == 5) {
            return n2;
        }
        if (n4 != 0 && n5 != 0) {
            Object object;
            if (n2 == 5 && bl) {
                return n3;
            }
            if (bl2 && bl) {
                CharSequence charSequence = TypeInfo.getPayloadAsType(n2, constantPool);
                Object object2 = TypeInfo.getPayloadAsType(n3, constantPool);
                String string = (String)constantPool.getConstantData(2);
                object = (String)constantPool.getConstantData(4);
                Object object3 = charSequence;
                if (charSequence.equals(string)) {
                    object3 = object;
                }
                charSequence = object2;
                if (((String)object2).equals(string)) {
                    charSequence = object;
                }
                if (((Class)(object2 = TypeInfo.getClassFromInternalName((String)object3))).isAssignableFrom((Class<?>)(object = TypeInfo.getClassFromInternalName(charSequence)))) {
                    return n2;
                }
                if (((Class)object).isAssignableFrom((Class<?>)object2)) {
                    return n3;
                }
                if (!((Class)object).isInterface() && !((Class)object2).isInterface()) {
                    while ((object3 = ((Class)object).getSuperclass()) != null) {
                        object = object3;
                        if (!((Class)object3).isAssignableFrom((Class<?>)object2)) continue;
                        object = ClassFileWriter.getSlashedForm(((Class)object3).getName());
                        break block13;
                    }
                } else {
                    block13: {
                        object = "java/lang/Object";
                    }
                    return TypeInfo.OBJECT((String)object, constantPool);
                }
            }
            object = a.c("bad merge attempt between ");
            ((StringBuilder)object).append(TypeInfo.toString(n2, constantPool));
            ((StringBuilder)object).append(" and ");
            ((StringBuilder)object).append(TypeInfo.toString(n3, constantPool));
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return 0;
    }

    static void print(int[] nArray, int n2, int[] nArray2, int n3, ConstantPool constantPool) {
        System.out.print("locals: ");
        System.out.println(TypeInfo.toString(nArray, n2, constantPool));
        System.out.print("stack: ");
        System.out.println(TypeInfo.toString(nArray2, n3, constantPool));
        System.out.println();
    }

    static void print(int[] nArray, int[] nArray2, ConstantPool constantPool) {
        TypeInfo.print(nArray, nArray.length, nArray2, nArray2.length, constantPool);
    }

    static String toString(int n2, ConstantPool constantPool) {
        int n3 = TypeInfo.getTag(n2);
        switch (n3) {
            default: {
                if (n3 != 7) break;
                return TypeInfo.getPayloadAsType(n2, constantPool);
            }
            case 6: {
                return "uninitialized_this";
            }
            case 5: {
                return "null";
            }
            case 4: {
                return "long";
            }
            case 3: {
                return "double";
            }
            case 2: {
                return "float";
            }
            case 1: {
                return "int";
            }
            case 0: {
                return "top";
            }
        }
        if (n3 == 8) {
            return "uninitialized";
        }
        throw new IllegalArgumentException("bad type");
    }

    private static String toString(int[] nArray, int n2, ConstantPool constantPool) {
        StringBuilder stringBuilder = a.c("[");
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(TypeInfo.toString(nArray[i2], constantPool));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

