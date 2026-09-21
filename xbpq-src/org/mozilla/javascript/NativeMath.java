/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.k;
import org.mozilla.javascript.l;
import org.mozilla.javascript.m;
import org.mozilla.javascript.n;
import org.mozilla.javascript.o;
import org.mozilla.javascript.p;
import org.mozilla.javascript.q;
import org.mozilla.javascript.r;
import org.mozilla.javascript.s;
import org.mozilla.javascript.t;

final class NativeMath
extends ScriptableObject {
    private static final Double Double32 = 32.0;
    private static final double LOG2E = 1.4426950408889634;
    private static final String MATH_TAG = "Math";
    private static final long serialVersionUID = -8838847185801131569L;

    private NativeMath() {
    }

    public static /* synthetic */ Object A(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.random(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object B(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.atanh(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object C(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.tanh(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object D(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.acos(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object E(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.abs(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object F(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.tan(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object G(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.atan(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object H(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.pow(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object I(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.cosh(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object J(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.sign(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object K(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.asin(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object L(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.acosh(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object a(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.ceil(context, scriptable, scriptable2, objectArray);
    }

    private static Object abs(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2;
        double d3 = ScriptRuntime.toNumber(objectArray, 0);
        if (d3 == 0.0) {
            d2 = 0.0;
        } else {
            d2 = d3;
            if (d3 < 0.0) {
                d2 = -d3;
            }
        }
        return ScriptRuntime.wrapNumber(d2);
    }

    private static Object acos(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        d2 = !Double.isNaN(d2) && -1.0 <= d2 && d2 <= 1.0 ? Math.acos(d2) : Double.NaN;
        return ScriptRuntime.wrapNumber(d2);
    }

    private static Object acosh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        if (!Double.isNaN(d2)) {
            return Math.log(Math.sqrt(d2 * d2 - 1.0) + d2);
        }
        return ScriptRuntime.NaNobj;
    }

    private static Object asin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        d2 = !Double.isNaN(d2) && -1.0 <= d2 && d2 <= 1.0 ? Math.asin(d2) : Double.NaN;
        return ScriptRuntime.wrapNumber(d2);
    }

    private static Object asinh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        if (Double.isInfinite(d2)) {
            return d2;
        }
        if (!Double.isNaN(d2)) {
            if (d2 == 0.0) {
                if (1.0 / d2 > 0.0) {
                    return ScriptRuntime.zeroObj;
                }
                return ScriptRuntime.negativeZeroObj;
            }
            return Math.log(Math.sqrt(d2 * d2 + 1.0) + d2);
        }
        return ScriptRuntime.NaNobj;
    }

    private static Object atan(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.atan(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object atan2(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.atan2(ScriptRuntime.toNumber(objectArray, 0), ScriptRuntime.toNumber(objectArray, 1)));
    }

    private static Object atanh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        if (!Double.isNaN(d2) && -1.0 <= d2 && d2 <= 1.0) {
            if (d2 == 0.0) {
                if (1.0 / d2 > 0.0) {
                    return ScriptRuntime.zeroObj;
                }
                return ScriptRuntime.negativeZeroObj;
            }
            return Math.log((d2 + 1.0) / (1.0 - d2)) * 0.5;
        }
        return ScriptRuntime.NaNobj;
    }

    public static /* synthetic */ Object c(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.log2(context, scriptable, scriptable2, objectArray);
    }

    private static Object cbrt(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.cbrt(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object ceil(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.ceil(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object clz32(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        int n2 = 0;
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        if (d2 != 0.0 && !Double.isNaN(d2) && !Double.isInfinite(d2)) {
            long l2 = ScriptRuntime.toUint32(d2);
            if (l2 == 0L) {
                return Double32;
            }
            long l3 = l2;
            if ((0xFFFFFFFFFFFF0000L & l2) != 0L) {
                l3 = l2 >>> 16;
                n2 = 16;
            }
            int n3 = n2;
            l2 = l3;
            if ((0xFF00L & l3) != 0L) {
                n3 = n2 + 8;
                l2 = l3 >>> 8;
            }
            n2 = n3;
            l3 = l2;
            if ((0xF0L & l2) != 0L) {
                n2 = n3 + 4;
                l3 = l2 >>> 4;
            }
            n3 = n2;
            l2 = l3;
            if ((0xCL & l3) != 0L) {
                n3 = n2 + 2;
                l2 = l3 >>> 2;
            }
            n2 = n3;
            l3 = l2;
            if ((2L & l2) != 0L) {
                n2 = n3 + 1;
                l3 = l2 >>> 1;
            }
            n3 = n2;
            if ((l3 & 1L) != 0L) {
                n3 = n2 + 1;
            }
            return (double)(32 - n3);
        }
        return Double32;
    }

    private static Object cos(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        d2 = Double.isInfinite(d2) ? Double.NaN : Math.cos(d2);
        return ScriptRuntime.wrapNumber(d2);
    }

    private static Object cosh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.cosh(ScriptRuntime.toNumber(objectArray, 0)));
    }

    public static /* synthetic */ Object d(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.round(context, scriptable, scriptable2, objectArray);
    }

    private static Object exp(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        if (d2 != Double.POSITIVE_INFINITY) {
            d2 = d2 == Double.NEGATIVE_INFINITY ? 0.0 : Math.exp(d2);
        }
        return ScriptRuntime.wrapNumber(d2);
    }

    private static Object expm1(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.expm1(ScriptRuntime.toNumber(objectArray, 0)));
    }

    public static /* synthetic */ Object f(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.sqrt(context, scriptable, scriptable2, objectArray);
    }

    private static Object floor(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.floor(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object fround(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber((float)ScriptRuntime.toNumber(objectArray, 0));
    }

    public static /* synthetic */ Object g(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.cos(context, scriptable, scriptable2, objectArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object hypot(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = 0.0;
        if (objectArray == null) {
            return 0.0;
        }
        int n2 = objectArray.length;
        boolean bl = false;
        boolean bl2 = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            double d3 = ScriptRuntime.toNumber(objectArray[i2]);
            if (Double.isNaN(d3)) {
                bl2 = true;
                continue;
            }
            if (Double.isInfinite(d3)) {
                bl = true;
                continue;
            }
            d2 = d3 * d3 + d2;
        }
        if (bl) {
            d2 = Double.POSITIVE_INFINITY;
            return d2;
        }
        if (bl2) {
            d2 = Double.NaN;
            return d2;
        }
        d2 = Math.sqrt(d2);
        return d2;
    }

    public static /* synthetic */ Object i(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.cbrt(context, scriptable, scriptable2, objectArray);
    }

    private static Object imul(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (objectArray == null) {
            return 0;
        }
        int n2 = ScriptRuntime.toInt32(objectArray, 0);
        return ScriptRuntime.wrapNumber(ScriptRuntime.toInt32(objectArray, 1) * n2);
    }

    static void init(Scriptable scriptable, boolean bl) {
        NativeMath nativeMath = new NativeMath();
        nativeMath.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeMath.setParentScope(scriptable);
        nativeMath.defineProperty("toSource", (Object)MATH_TAG, 7);
        nativeMath.defineProperty(scriptable, "abs", 1, q.b, 2, 3);
        nativeMath.defineProperty(scriptable, "acos", 1, p.c, 2, 3);
        nativeMath.defineProperty(scriptable, "acosh", 1, t.d, 2, 3);
        nativeMath.defineProperty(scriptable, "asin", 1, n.e, 2, 3);
        nativeMath.defineProperty(scriptable, "asinh", 1, o.d, 2, 3);
        nativeMath.defineProperty(scriptable, "atan", 1, q.e, 2, 3);
        nativeMath.defineProperty(scriptable, "atanh", 1, p.e, 2, 3);
        nativeMath.defineProperty(scriptable, "atan2", 2, t.e, 2, 3);
        nativeMath.defineProperty(scriptable, "cbrt", 1, s.e, 2, 3);
        nativeMath.defineProperty(scriptable, "ceil", 1, r.e, 2, 3);
        nativeMath.defineProperty(scriptable, "clz32", 1, p.b, 2, 3);
        nativeMath.defineProperty(scriptable, "cos", 1, t.b, 2, 3);
        nativeMath.defineProperty(scriptable, "cosh", 1, s.b, 2, 3);
        nativeMath.defineProperty(scriptable, "exp", 1, r.b, 2, 3);
        nativeMath.defineProperty(scriptable, "expm1", 1, l.c, 2, 3);
        nativeMath.defineProperty(scriptable, "floor", 1, k.c, 2, 3);
        nativeMath.defineProperty(scriptable, "fround", 1, m.c, 2, 3);
        nativeMath.defineProperty(scriptable, "hypot", 2, n.c, 2, 3);
        nativeMath.defineProperty(scriptable, "imul", 2, o.b, 2, 3);
        nativeMath.defineProperty(scriptable, "log", 1, q.c, 2, 3);
        nativeMath.defineProperty(scriptable, "log1p", 1, t.c, 2, 3);
        nativeMath.defineProperty(scriptable, "log10", 1, s.c, 2, 3);
        nativeMath.defineProperty(scriptable, "log2", 1, r.c, 2, 3);
        nativeMath.defineProperty(scriptable, "max", 2, l.d, 2, 3);
        nativeMath.defineProperty(scriptable, "min", 2, k.d, 2, 3);
        nativeMath.defineProperty(scriptable, "pow", 2, m.d, 2, 3);
        nativeMath.defineProperty(scriptable, "random", 0, n.d, 2, 3);
        nativeMath.defineProperty(scriptable, "round", 1, o.c, 2, 3);
        nativeMath.defineProperty(scriptable, "sign", 1, q.d, 2, 3);
        nativeMath.defineProperty(scriptable, "sin", 1, p.d, 2, 3);
        nativeMath.defineProperty(scriptable, "sinh", 1, s.d, 2, 3);
        nativeMath.defineProperty(scriptable, "sqrt", 1, r.d, 2, 3);
        nativeMath.defineProperty(scriptable, "tan", 1, l.e, 2, 3);
        nativeMath.defineProperty(scriptable, "tanh", 1, k.e, 2, 3);
        nativeMath.defineProperty(scriptable, "trunc", 1, m.e, 2, 3);
        nativeMath.defineProperty("E", (Object)Math.E, 7);
        nativeMath.defineProperty("PI", (Object)Math.PI, 7);
        nativeMath.defineProperty("LN10", (Object)2.302585092994046, 7);
        nativeMath.defineProperty("LN2", (Object)0.6931471805599453, 7);
        nativeMath.defineProperty("LOG2E", (Object)1.4426950408889634, 7);
        nativeMath.defineProperty("LOG10E", (Object)0.4342944819032518, 7);
        nativeMath.defineProperty("SQRT1_2", (Object)0.7071067811865476, 7);
        nativeMath.defineProperty("SQRT2", (Object)1.4142135623730951, 7);
        nativeMath.defineProperty(SymbolKey.TO_STRING_TAG, (Object)MATH_TAG, 3);
        ScriptableObject.defineProperty(scriptable, MATH_TAG, nativeMath, 2);
        if (bl) {
            nativeMath.sealObject();
        }
    }

    public static /* synthetic */ Object j(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.hypot(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object k(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.asinh(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object l(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.expm1(context, scriptable, scriptable2, objectArray);
    }

    private static Object log(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        d2 = d2 < 0.0 ? Double.NaN : Math.log(d2);
        return ScriptRuntime.wrapNumber(d2);
    }

    private static Object log10(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.log10(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object log1p(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.log1p(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object log2(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        d2 = d2 < 0.0 ? Double.NaN : Math.log(d2) * 1.4426950408889634;
        return ScriptRuntime.wrapNumber(d2);
    }

    public static /* synthetic */ Object m(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.floor(context, scriptable, scriptable2, objectArray);
    }

    private static Object max(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = Double.NEGATIVE_INFINITY;
        for (int i2 = 0; i2 != objectArray.length; ++i2) {
            d2 = Math.max(d2, ScriptRuntime.toNumber(objectArray[i2]));
        }
        return ScriptRuntime.wrapNumber(d2);
    }

    private static Object min(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = Double.POSITIVE_INFINITY;
        for (int i2 = 0; i2 != objectArray.length; ++i2) {
            d2 = Math.min(d2, ScriptRuntime.toNumber(objectArray[i2]));
        }
        return ScriptRuntime.wrapNumber(d2);
    }

    public static /* synthetic */ Object n(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.sinh(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object o(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.log10(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object p(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.trunc(context, scriptable, scriptable2, objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Object pow(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2;
        double d3;
        block17: {
            double d4;
            block21: {
                block16: {
                    double d5;
                    double d6;
                    double d7;
                    block20: {
                        block19: {
                            block18: {
                                d7 = ScriptRuntime.toNumber(objectArray, 0);
                                d6 = ScriptRuntime.toNumber(objectArray, 1);
                                boolean bl = Double.isNaN(d6);
                                d4 = Double.POSITIVE_INFINITY;
                                if (bl) {
                                    d3 = d6;
                                    return ScriptRuntime.wrapNumber(d3);
                                }
                                double d8 = d6 - 0.0;
                                d5 = d8 == 0.0 ? 0 : (d8 > 0.0 ? 1 : -1);
                                if (d5 == false) {
                                    d3 = 1.0;
                                    return ScriptRuntime.wrapNumber(d3);
                                }
                                d3 = 0.0;
                                if (d7 == 0.0) {
                                    if (1.0 / d7 > 0.0) {
                                        d3 = d4;
                                        if (d5 <= 0) return ScriptRuntime.wrapNumber(d3);
                                        break block16;
                                    } else {
                                        long l2 = (long)d6;
                                        if ((double)l2 == d6 && (l2 & 1L) != 0L) {
                                            if (d5 > 0) {
                                                return ScriptRuntime.wrapNumber(d3);
                                            }
                                            d3 = Double.NEGATIVE_INFINITY;
                                            return ScriptRuntime.wrapNumber(d3);
                                        }
                                        d3 = d4;
                                        if (d5 <= 0) return ScriptRuntime.wrapNumber(d3);
                                        d3 = 0.0;
                                        return ScriptRuntime.wrapNumber(d3);
                                    }
                                }
                                d2 = Math.pow(d7, d6);
                                if (!Double.isNaN(d2)) break block17;
                                if (d6 != Double.POSITIVE_INFINITY) break block18;
                                d3 = d4;
                                if (d7 < -1.0) return ScriptRuntime.wrapNumber(d3);
                                if (1.0 < d7) {
                                    d3 = d4;
                                    return ScriptRuntime.wrapNumber(d3);
                                }
                                if (!(-1.0 < d7) || !(d7 < 1.0)) break block17;
                                break block16;
                            }
                            if (d6 != Double.NEGATIVE_INFINITY) break block19;
                            if (d7 < -1.0 || 1.0 < d7) break block16;
                            if (-1.0 < d7 && d7 < 1.0) {
                                d3 = d4;
                                return ScriptRuntime.wrapNumber(d3);
                            }
                            break block17;
                        }
                        if (d7 != Double.POSITIVE_INFINITY) break block20;
                        if (d5 > 0) {
                            d3 = d4;
                            return ScriptRuntime.wrapNumber(d3);
                        }
                        break block16;
                    }
                    if (d7 != Double.NEGATIVE_INFINITY) break block17;
                    long l3 = (long)d6;
                    if ((double)l3 == d6 && (l3 & 1L) != 0L) {
                        if (d5 <= 0) return ScriptRuntime.wrapNumber(d3);
                        d3 = Double.NEGATIVE_INFINITY;
                        return ScriptRuntime.wrapNumber(d3);
                    }
                    if (d5 > 0) break block21;
                }
                d3 = 0.0;
                return ScriptRuntime.wrapNumber(d3);
            }
            d3 = d4;
            return ScriptRuntime.wrapNumber(d3);
        }
        d3 = d2;
        return ScriptRuntime.wrapNumber(d3);
    }

    public static /* synthetic */ Object q(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.imul(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object r(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.sin(context, scriptable, scriptable2, objectArray);
    }

    private static Object random(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.random());
    }

    private static Object round(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2;
        double d3 = d2 = ScriptRuntime.toNumber(objectArray, 0);
        if (!Double.isNaN(d2)) {
            d3 = d2;
            if (!Double.isInfinite(d2)) {
                long l2 = Math.round(d2);
                if (l2 != 0L) {
                    d3 = l2;
                } else if (d2 < 0.0) {
                    d3 = ScriptRuntime.negativeZero;
                } else {
                    d3 = d2;
                    if (d2 != 0.0) {
                        d3 = 0.0;
                    }
                }
            }
        }
        return ScriptRuntime.wrapNumber(d3);
    }

    public static /* synthetic */ Object s(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.exp(context, scriptable, scriptable2, objectArray);
    }

    private static Object sign(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        if (!Double.isNaN(d2)) {
            if (d2 == 0.0) {
                if (1.0 / d2 > 0.0) {
                    return ScriptRuntime.zeroObj;
                }
                return ScriptRuntime.negativeZeroObj;
            }
            return Math.signum(d2);
        }
        return ScriptRuntime.NaNobj;
    }

    private static Object sin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        d2 = Double.isInfinite(d2) ? Double.NaN : Math.sin(d2);
        return ScriptRuntime.wrapNumber(d2);
    }

    private static Object sinh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.sinh(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object sqrt(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.sqrt(ScriptRuntime.toNumber(objectArray, 0)));
    }

    public static /* synthetic */ Object t(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.log1p(context, scriptable, scriptable2, objectArray);
    }

    private static Object tan(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.tan(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object tanh(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.wrapNumber(Math.tanh(ScriptRuntime.toNumber(objectArray, 0)));
    }

    private static Object trunc(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        double d2 = ScriptRuntime.toNumber(objectArray, 0);
        d2 = d2 < 0.0 ? Math.ceil(d2) : Math.floor(d2);
        return ScriptRuntime.wrapNumber(d2);
    }

    public static /* synthetic */ Object u(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.fround(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object v(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.clz32(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object w(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.min(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object x(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.atan2(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object y(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.log(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object z(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeMath.max(context, scriptable, scriptable2, objectArray);
    }

    @Override
    public String getClassName() {
        return MATH_TAG;
    }
}

