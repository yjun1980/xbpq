/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;

final class NativeBigInt
extends IdScriptableObject {
    private static final Object BIG_INT_TAG = "BigInt";
    private static final int ConstructorId_asIntN = -1;
    private static final int ConstructorId_asUintN = -2;
    private static final int Id_constructor = 1;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toSource = 4;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    private static final int SymbolId_toStringTag = 6;
    private static final long serialVersionUID = 1335609231306775449L;
    private BigInteger bigIntValue;

    NativeBigInt(BigInteger bigInteger) {
        this.bigIntValue = bigInteger;
    }

    private static Object execConstructorCall(int n2, Object[] object) {
        int n3 = -1;
        if (n2 != -2 && n2 != -1) {
            throw new IllegalArgumentException(String.valueOf(n2));
        }
        Object object2 = ((Object[])object).length < 1 ? Undefined.instance : object[0];
        int n4 = ScriptRuntime.toIndex(object2);
        object = ((Object[])object).length < 2 ? Undefined.instance : object[1];
        object = ScriptRuntime.toBigInt(object);
        if (n4 == 0) {
            return BigInteger.ZERO;
        }
        int n5 = n4 / 8 + 1;
        object2 = object.toByteArray();
        if (n5 > ((Object)object2).length) {
            return object;
        }
        object = Arrays.copyOfRange((byte[])object2, ((Object)object2).length - n5, ((Object)object2).length);
        n5 = n4 % 8;
        if (n2 != -2) {
            if (n2 == -1) {
                if (n5 == 0) {
                    if (object[1] >= 0) {
                        n3 = 0;
                    }
                    object[0] = n3;
                } else {
                    object[0] = (object[0] & 1 << n5 - 1) != 0 ? (Object)((byte)(object[0] | -1 << n5)) : (Object)((byte)(object[0] & (1 << n5) - 1));
                }
            }
        } else {
            object[0] = (byte)(object[0] & (1 << n5) - 1);
        }
        return new BigInteger((byte[])object);
    }

    static void init(Scriptable scriptable, boolean bl) {
        new NativeBigInt(BigInteger.ZERO).exportAsJSClass(6, scriptable, bl);
    }

    @Override
    public Object execIdCall(IdFunctionObject serializable, Context object, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        Object object2 = BIG_INT_TAG;
        if (!serializable.hasTag(object2)) {
            return super.execIdCall((IdFunctionObject)serializable, (Context)object, scriptable, scriptable2, objectArray);
        }
        int n2 = serializable.methodId();
        if (n2 == 1) {
            if (scriptable2 != null) {
                serializable = objectArray.length >= 1 ? ScriptRuntime.toBigInt(objectArray[0]) : BigInteger.ZERO;
                return serializable;
            }
            throw ScriptRuntime.typeErrorById("msg.not.ctor", object2);
        }
        if (n2 < 1) {
            return NativeBigInt.execConstructorCall(n2, objectArray);
        }
        serializable = IdScriptableObject.ensureType((Object)scriptable2, NativeBigInt.class, (IdFunctionObject)serializable).bigIntValue;
        if (n2 != 2 && n2 != 3) {
            if (n2 != 4) {
                if (n2 == 5) {
                    return serializable;
                }
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            object = a.c("(new BigInt(");
            ((StringBuilder)object).append(ScriptRuntime.toString(serializable));
            ((StringBuilder)object).append("))");
            return ((StringBuilder)object).toString();
        }
        n2 = objectArray.length != 0 && objectArray[0] != Undefined.instance ? ScriptRuntime.toInt32(objectArray[0]) : 10;
        return ScriptRuntime.bigIntToString((BigInteger)serializable, n2);
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object object = BIG_INT_TAG;
        this.addIdFunctionProperty(idFunctionObject, object, -1, "asIntN", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -2, "asUintN", 2);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 4;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 231605032: {
                if (!string.equals("valueOf")) break;
                n4 = 4;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 3;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 2;
                break;
            }
            case -1781441930: {
                if (!string.equals("toSource")) break;
                n4 = 1;
                break;
            }
            case -2020003546: {
                if (!string.equals("toLocaleString")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 4: {
                n3 = 5;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 0: {
                n3 = 3;
            }
            case 1: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.TO_STRING_TAG.equals(symbol)) {
            return 6;
        }
        return 0;
    }

    @Override
    public String getClassName() {
        return "BigInt";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        String string;
        if (n2 == 6) {
            this.initPrototypeValue(6, SymbolKey.TO_STRING_TAG, (Object)this.getClassName(), 3);
            return;
        }
        int n3 = 1;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) throw new IllegalArgumentException(String.valueOf(n2));
                        string = "valueOf";
                    } else {
                        string = "toSource";
                    }
                } else {
                    string = "toLocaleString";
                }
            } else {
                string = "toString";
            }
            n3 = 0;
        } else {
            string = "constructor";
        }
        this.initPrototypeMethod(BIG_INT_TAG, n2, string, n3);
    }

    public String toString() {
        return ScriptRuntime.bigIntToString(this.bigIntValue, 10);
    }
}

