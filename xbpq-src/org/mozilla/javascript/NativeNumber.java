/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.DToA;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

final class NativeNumber
extends IdScriptableObject {
    private static final int ConstructorId_isFinite = -1;
    private static final int ConstructorId_isInteger = -3;
    private static final int ConstructorId_isNaN = -2;
    private static final int ConstructorId_isSafeInteger = -4;
    private static final double EPSILON = 2.220446049250313E-16;
    private static final int Id_constructor = 1;
    private static final int Id_toExponential = 7;
    private static final int Id_toFixed = 6;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toPrecision = 8;
    private static final int Id_toSource = 4;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 5;
    private static final int MAX_PRECISION = 100;
    private static final int MAX_PROTOTYPE_ID = 8;
    public static final double MAX_SAFE_INTEGER = 9.007199254740991E15;
    private static final double MIN_SAFE_INTEGER = -9.007199254740991E15;
    private static final Object NUMBER_TAG = "Number";
    private static final long serialVersionUID = 3504516769741512101L;
    private double doubleValue;

    NativeNumber(double d2) {
        this.doubleValue = d2;
    }

    private static Object execConstructorCall(int n2, Object[] objectArray) {
        if (n2 != -4) {
            if (n2 != -3) {
                if (n2 != -2) {
                    if (n2 == -1) {
                        if (objectArray.length != 0 && !Undefined.isUndefined(objectArray[0])) {
                            if (objectArray[0] instanceof Number) {
                                return NativeNumber.isFinite(objectArray[0]);
                            }
                            return Boolean.FALSE;
                        }
                        return Boolean.FALSE;
                    }
                    throw new IllegalArgumentException(String.valueOf(n2));
                }
                if (objectArray.length != 0 && !Undefined.isUndefined(objectArray[0])) {
                    if (objectArray[0] instanceof Number) {
                        return NativeNumber.isNaN((Number)objectArray[0]);
                    }
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            }
            if (objectArray.length != 0 && !Undefined.isUndefined(objectArray[0])) {
                if (objectArray[0] instanceof Number) {
                    return NativeNumber.isInteger((Number)objectArray[0]);
                }
                return Boolean.FALSE;
            }
            return Boolean.FALSE;
        }
        if (objectArray.length != 0 && Undefined.instance != objectArray[0]) {
            if (objectArray[0] instanceof Number) {
                return NativeNumber.isSafeInteger((Number)objectArray[0]);
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    static void init(Scriptable scriptable, boolean bl) {
        new NativeNumber(0.0).exportAsJSClass(8, scriptable, bl);
    }

    private static boolean isDoubleInteger(double d2) {
        boolean bl = !Double.isInfinite(d2) && !Double.isNaN(d2) && Math.floor(d2) == d2;
        return bl;
    }

    private static boolean isDoubleInteger(Double d2) {
        boolean bl = !d2.isInfinite() && !d2.isNaN() && Math.floor(d2) == d2;
        return bl;
    }

    private static boolean isDoubleSafeInteger(double d2) {
        boolean bl = NativeNumber.isDoubleInteger(d2) && d2 <= 9.007199254740991E15 && d2 >= -9.007199254740991E15;
        return bl;
    }

    private static boolean isDoubleSafeInteger(Double d2) {
        boolean bl = NativeNumber.isDoubleInteger(d2) && d2 <= 9.007199254740991E15 && d2 >= -9.007199254740991E15;
        return bl;
    }

    static Object isFinite(Object object) {
        boolean bl = !((Double)(object = Double.valueOf(ScriptRuntime.toNumber(object)))).isInfinite() && !((Double)object).isNaN();
        return ScriptRuntime.wrapBoolean(bl);
    }

    private static boolean isInteger(Number number) {
        if (number instanceof Double) {
            return NativeNumber.isDoubleInteger((Double)number);
        }
        return NativeNumber.isDoubleInteger(number.doubleValue());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Boolean isNaN(Number number) {
        boolean bl;
        if (number instanceof Double) {
            bl = ((Double)number).isNaN();
            return bl;
        }
        bl = Double.isNaN(number.doubleValue());
        return bl;
    }

    private static boolean isSafeInteger(Number number) {
        if (number instanceof Double) {
            return NativeNumber.isDoubleSafeInteger((Double)number);
        }
        return NativeNumber.isDoubleSafeInteger(number.doubleValue());
    }

    private static String num_to(double d2, Object[] object, int n2, int n3, int n4, int n5) {
        block4: {
            block3: {
                block2: {
                    int n6 = ((Object[])object).length;
                    int n7 = 0;
                    if (n6 != 0) break block2;
                    n3 = n7;
                    break block3;
                }
                double d3 = ScriptRuntime.toInteger(object[0]);
                if (d3 < (double)n4 || d3 > 100.0) break block4;
                n4 = ScriptRuntime.toInt32(d3);
                n2 = n3;
                n3 = n4;
            }
            object = new StringBuilder();
            DToA.JS_dtostr((StringBuilder)object, n2, n3 + n5, d2);
            return ((StringBuilder)object).toString();
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.bad.precision", ScriptRuntime.toString(object[0])));
    }

    @Override
    public Object execIdCall(IdFunctionObject serializable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)serializable).hasTag(NUMBER_TAG)) {
            return super.execIdCall((IdFunctionObject)serializable, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)serializable).methodId();
        double d2 = 0.0;
        if (n2 == 1) {
            if (objectArray.length >= 1) {
                d2 = ScriptRuntime.toNumeric(objectArray[0]).doubleValue();
            }
            if (scriptable2 == null) {
                return new NativeNumber(d2);
            }
            return ScriptRuntime.wrapNumber(d2);
        }
        if (n2 < 1) {
            return NativeNumber.execConstructorCall(n2, objectArray);
        }
        d2 = IdScriptableObject.ensureType((Object)scriptable2, NativeNumber.class, (IdFunctionObject)serializable).doubleValue;
        int n3 = 10;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 8: {
                if (objectArray.length != 0 && !Undefined.isUndefined(objectArray[0])) {
                    if (Double.isNaN(d2)) {
                        return "NaN";
                    }
                    if (Double.isInfinite(d2)) {
                        if (d2 >= 0.0) {
                            return "Infinity";
                        }
                        return "-Infinity";
                    }
                    return NativeNumber.num_to(d2, objectArray, 0, 4, 1, 0);
                }
                return ScriptRuntime.numberToString(d2, 10);
            }
            case 7: {
                if (Double.isNaN(d2)) {
                    return "NaN";
                }
                if (Double.isInfinite(d2)) {
                    if (d2 >= 0.0) {
                        return "Infinity";
                    }
                    return "-Infinity";
                }
                return NativeNumber.num_to(d2, objectArray, 1, 3, 0, 1);
            }
            case 6: {
                n2 = context.version < 200 ? -20 : 0;
                return NativeNumber.num_to(d2, objectArray, 2, 2, n2, 0);
            }
            case 5: {
                return ScriptRuntime.wrapNumber(d2);
            }
            case 4: {
                serializable = a.c("(new Number(");
                ((StringBuilder)serializable).append(ScriptRuntime.toString(d2));
                ((StringBuilder)serializable).append("))");
                return ((StringBuilder)serializable).toString();
            }
            case 2: 
            case 3: 
        }
        n2 = n3;
        if (objectArray.length != 0) {
            n2 = Undefined.isUndefined(objectArray[0]) ? n3 : ScriptRuntime.toInt32(objectArray[0]);
        }
        return ScriptRuntime.numberToString(d2, n2);
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        idFunctionObject.defineProperty("NaN", (Object)ScriptRuntime.NaNobj, 7);
        idFunctionObject.defineProperty("POSITIVE_INFINITY", (Object)ScriptRuntime.wrapNumber(Double.POSITIVE_INFINITY), 7);
        idFunctionObject.defineProperty("NEGATIVE_INFINITY", (Object)ScriptRuntime.wrapNumber(Double.NEGATIVE_INFINITY), 7);
        idFunctionObject.defineProperty("MAX_VALUE", (Object)ScriptRuntime.wrapNumber(Double.MAX_VALUE), 7);
        idFunctionObject.defineProperty("MIN_VALUE", (Object)ScriptRuntime.wrapNumber(Double.MIN_VALUE), 7);
        idFunctionObject.defineProperty("MAX_SAFE_INTEGER", (Object)ScriptRuntime.wrapNumber(9.007199254740991E15), 7);
        idFunctionObject.defineProperty("MIN_SAFE_INTEGER", (Object)ScriptRuntime.wrapNumber(-9.007199254740991E15), 7);
        idFunctionObject.defineProperty("EPSILON", (Object)ScriptRuntime.wrapNumber(2.220446049250313E-16), 7);
        Object object = NUMBER_TAG;
        this.addIdFunctionProperty(idFunctionObject, object, -1, "isFinite", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -2, "isNaN", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -3, "isInteger", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -4, "isSafeInteger", 1);
        object = ScriptRuntime.getTopLevelProp(idFunctionObject, "parseFloat");
        if (object instanceof IdFunctionObject) {
            ((IdFunctionObject)object).addAsProperty(idFunctionObject);
        }
        if ((object = ScriptRuntime.getTopLevelProp(idFunctionObject, "parseInt")) instanceof IdFunctionObject) {
            ((IdFunctionObject)object).addAsProperty(idFunctionObject);
        }
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 7;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1670723530: {
                if (!string.equals("toExponential")) break;
                n4 = 7;
                break;
            }
            case 231605032: {
                if (!string.equals("valueOf")) break;
                n4 = 6;
                break;
            }
            case -1178026567: {
                if (!string.equals("toFixed")) break;
                n4 = 5;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 4;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 3;
                break;
            }
            case -1781441930: {
                if (!string.equals("toSource")) break;
                n4 = 2;
                break;
            }
            case -1998299069: {
                if (!string.equals("toPrecision")) break;
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
            case 6: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 0: {
                n3 = 3;
            }
            case 7: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return "Number";
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block10: {
            var2_2 = 1;
            switch (var1_1) {
                default: {
                    throw new IllegalArgumentException(String.valueOf(var1_1));
                }
                case 8: {
                    var3_3 = "toPrecision";
                    break block10;
                }
                case 7: {
                    var3_3 = "toExponential";
                    break block10;
                }
                case 6: {
                    var3_3 = "toFixed";
                    break block10;
                }
                case 5: {
                    var3_3 = "valueOf";
                    ** GOTO lbl19
                }
                case 4: {
                    var3_3 = "toSource";
lbl19:
                    // 2 sources

                    var2_2 = 0;
                    break block10;
                }
                case 3: {
                    var3_3 = "toLocaleString";
                    break block10;
                }
                case 2: {
                    var3_3 = "toString";
                    break block10;
                }
                case 1: 
            }
            var3_3 = "constructor";
        }
        this.initPrototypeMethod(NativeNumber.NUMBER_TAG, var1_1, var3_3, var2_2);
    }

    public String toString() {
        return ScriptRuntime.numberToString(this.doubleValue, 10);
    }
}

