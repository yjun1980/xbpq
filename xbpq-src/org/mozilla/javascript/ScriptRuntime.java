/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.AbstractEcmaObjectOperations$INTEGRITY_LEVEL;
import org.mozilla.javascript.Arguments;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.ClassCache;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.DToA;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.IteratorLikeIterable;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.LazilyLoadedCtor;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeBigInt;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeCollectionIterator;
import org.mozilla.javascript.NativeDate;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.NativeGlobal;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeIterator$StopIteration;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaMap;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeMap;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.NativeScript;
import org.mozilla.javascript.NativeSet;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeStringIterator;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.NativeWeakMap;
import org.mozilla.javascript.NativeWeakSet;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.RefCallable;
import org.mozilla.javascript.RegExpProxy;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime$1;
import org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider;
import org.mozilla.javascript.ScriptRuntime$IdEnumeration;
import org.mozilla.javascript.ScriptRuntime$MessageProvider;
import org.mozilla.javascript.ScriptRuntime$NoSuchMethodShim;
import org.mozilla.javascript.ScriptRuntime$StringIdOrIndex;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SpecialRef;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.SymbolScriptable;
import org.mozilla.javascript.TokenStream;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.TopLevel$NativeErrors;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.WrappedException;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.v8dtoa.DoubleConversion;
import org.mozilla.javascript.v8dtoa.FastDtoa;
import org.mozilla.javascript.xml.XMLLib;
import org.mozilla.javascript.xml.XMLObject;

public class ScriptRuntime {
    static final boolean $assertionsDisabled = false;
    public static final Class<?> BigIntegerClass;
    public static final Class<?> BooleanClass;
    public static final Class<?> ByteClass;
    public static final Class<?> CharacterClass;
    public static final Class<?> ClassClass;
    public static final Class<?> ContextClass;
    public static final Class<?> ContextFactoryClass;
    private static final String DEFAULT_NS_TAG = "__default_namespace__";
    public static final Class<?> DateClass;
    public static final Class<?> DoubleClass;
    public static final int ENUMERATE_ARRAY = 2;
    public static final int ENUMERATE_ARRAY_NO_ITERATOR = 5;
    public static final int ENUMERATE_KEYS = 0;
    public static final int ENUMERATE_KEYS_NO_ITERATOR = 3;
    public static final int ENUMERATE_VALUES = 1;
    public static final int ENUMERATE_VALUES_IN_ORDER = 6;
    public static final int ENUMERATE_VALUES_NO_ITERATOR = 4;
    public static final Class<?> FloatClass;
    public static final Class<?> FunctionClass;
    public static final Class<?> IntegerClass;
    private static final Object LIBRARY_SCOPE_KEY;
    public static final Class<?> LongClass;
    public static final double NaN = Double.NaN;
    public static final Double NaNobj;
    public static final Class<?> NumberClass;
    public static final Class<?> ObjectClass;
    public static final Class<Scriptable> ScriptableClass;
    public static final Class<?> ScriptableObjectClass;
    public static final Class<?> ShortClass;
    public static final Class<?> StringClass;
    public static final Object[] emptyArgs;
    public static final String[] emptyStrings;
    public static final ScriptRuntime$MessageProvider messageProvider;
    public static final double negativeZero;
    public static final Double negativeZeroObj;
    public static final Double zeroObj;

    static {
        BooleanClass = Kit.classOrNull("java.lang.Boolean");
        ByteClass = Kit.classOrNull("java.lang.Byte");
        CharacterClass = Kit.classOrNull("java.lang.Character");
        ClassClass = Kit.classOrNull("java.lang.Class");
        DoubleClass = Kit.classOrNull("java.lang.Double");
        FloatClass = Kit.classOrNull("java.lang.Float");
        IntegerClass = Kit.classOrNull("java.lang.Integer");
        LongClass = Kit.classOrNull("java.lang.Long");
        NumberClass = Kit.classOrNull("java.lang.Number");
        ObjectClass = Kit.classOrNull("java.lang.Object");
        ShortClass = Kit.classOrNull("java.lang.Short");
        StringClass = Kit.classOrNull("java.lang.String");
        DateClass = Kit.classOrNull("java.util.Date");
        BigIntegerClass = Kit.classOrNull("java.math.BigInteger");
        ContextClass = Kit.classOrNull("org.mozilla.javascript.Context");
        ContextFactoryClass = Kit.classOrNull("org.mozilla.javascript.ContextFactory");
        FunctionClass = Kit.classOrNull("org.mozilla.javascript.Function");
        ScriptableObjectClass = Kit.classOrNull("org.mozilla.javascript.ScriptableObject");
        ScriptableClass = Scriptable.class;
        LIBRARY_SCOPE_KEY = "LIBRARY_SCOPE";
        NaNobj = Double.NaN;
        negativeZero = Double.longBitsToDouble(Long.MIN_VALUE);
        zeroObj = 0.0;
        negativeZeroObj = 0.0;
        messageProvider = new ScriptRuntime$DefaultMessageProvider(null);
        emptyArgs = new Object[0];
        emptyStrings = new String[0];
    }

    protected ScriptRuntime() {
    }

    @Deprecated
    public static CharSequence add(CharSequence charSequence, Object object) {
        return new ConsString(charSequence, ScriptRuntime.toCharSequence(object));
    }

    @Deprecated
    public static CharSequence add(Object object, CharSequence charSequence) {
        return new ConsString(ScriptRuntime.toCharSequence(object), charSequence);
    }

    public static Object add(Object object, Object object2, Context object3) {
        Object object4;
        boolean bl = object instanceof BigInteger;
        if (bl && object2 instanceof BigInteger) {
            return ((BigInteger)object).add((BigInteger)object2);
        }
        boolean bl2 = object instanceof Number;
        if (bl2 && object2 instanceof BigInteger || bl && object2 instanceof Number) {
            throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
        }
        if (bl2 && object2 instanceof Number) {
            double d2 = ((Number)object).doubleValue();
            return ScriptRuntime.wrapNumber(((Number)object2).doubleValue() + d2);
        }
        if (object instanceof CharSequence && object2 instanceof CharSequence) {
            return new ConsString((CharSequence)object, (CharSequence)object2);
        }
        if (object instanceof XMLObject && (object4 = ((XMLObject)object).addValues((Context)object3, true, object2)) != Scriptable.NOT_FOUND) {
            return object4;
        }
        if (object2 instanceof XMLObject && (object3 = ((XMLObject)object2).addValues((Context)object3, false, object)) != Scriptable.NOT_FOUND) {
            return object3;
        }
        if (!(object instanceof Symbol) && !(object2 instanceof Symbol)) {
            object3 = object;
            if (object instanceof Scriptable) {
                object3 = ((Scriptable)object).getDefaultValue(null);
            }
            object = object2;
            if (object2 instanceof Scriptable) {
                object = ((Scriptable)object2).getDefaultValue(null);
            }
            if (!(object3 instanceof CharSequence) && !(object instanceof CharSequence)) {
                object2 = object3 instanceof Number ? (Number)((Number)object3) : (Number)ScriptRuntime.toNumeric(object3);
                object = object instanceof Number ? (Number)((Number)object) : (Number)ScriptRuntime.toNumeric(object);
                bl = object2 instanceof BigInteger;
                if (bl && object instanceof BigInteger) {
                    return ((BigInteger)object2).add((BigInteger)object);
                }
                if (!bl && !(object instanceof BigInteger)) {
                    double d3 = ((Number)object2).doubleValue();
                    return ((Number)object).doubleValue() + d3;
                }
                throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
            }
            return new ConsString(ScriptRuntime.toCharSequence(object3), ScriptRuntime.toCharSequence(object));
        }
        throw ScriptRuntime.typeErrorById("msg.not.a.number", new Object[0]);
    }

    public static void addInstructionCount(Context context, int n2) {
        context.instructionCount = n2 = context.instructionCount + n2;
        if (n2 > context.instructionThreshold) {
            context.observeInstructionCount(n2);
            context.instructionCount = 0;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static Object applyOrCall(boolean var0, Context var1_1, Scriptable var2_2, Scriptable var3_3, Object[] var4_4) {
        block10: {
            block9: {
                var5_5 = var4_4.length;
                var7_6 = ScriptRuntime.getCallable((Scriptable)var3_3);
                if (var5_5 == 0) ** GOTO lbl14
                if (var1_1.hasFeature(15)) {
                    var3_3 = var4_4[0];
lbl6:
                    // 2 sources

                    while (true) {
                        var3_3 = ScriptRuntime.toObjectOrNull(var1_1, var3_3, var2_2);
                        break;
                    }
                } else if (var4_4[0] == Undefined.instance) {
                    var3_3 = Undefined.SCRIPTABLE_UNDEFINED;
                } else {
                    var3_3 = var4_4[0];
                    ** continue;
lbl14:
                    // 1 sources

                    var3_3 = null;
                }
                var6_7 = var3_3;
                if (var3_3 == null) {
                    var6_7 = var3_3;
                    if (var1_1.hasFeature(15)) {
                        var6_7 = ScriptRuntime.getTopCallScope(var1_1);
                    }
                }
                if (!var0) break block9;
                if (var5_5 <= 1) ** GOTO lbl-1000
                var3_3 = ScriptRuntime.getApplyArguments(var1_1, var4_4[1]);
                break block10;
            }
            if (var5_5 <= 1) lbl-1000:
            // 2 sources

            {
                var3_3 = ScriptRuntime.emptyArgs;
            } else {
                var3_3 = new Object[--var5_5];
                System.arraycopy(var4_4, 1, var3_3, 0, var5_5);
            }
        }
        return var7_6.call(var1_1, var2_2, var6_7, var3_3);
    }

    public static String bigIntToString(BigInteger bigInteger, int n2) {
        if (n2 >= 2 && n2 <= 36) {
            return bigInteger.toString(n2);
        }
        throw ScriptRuntime.rangeErrorById("msg.bad.radix", Integer.toString(n2));
    }

    /*
     * Unable to fully structure code
     */
    public static Scriptable bind(Context var0, Scriptable var1_1, String var2_2) {
        block14: {
            var5_3 = var1_1.getParentScope();
            var4_4 = null;
            var3_5 = var1_1;
            if (var5_3 == null) break block14;
            var3_5 = null;
            var4_4 = var1_1;
            var1_1 = var5_3;
            while (true) {
                block15: {
                    var5_3 = var1_1;
                    var6_6 = var4_4;
                    if (!(var4_4 instanceof NativeWith)) break;
                    var5_3 = var4_4.getPrototype();
                    if (var5_3 instanceof XMLObject) {
                        if ((var5_3 = (XMLObject)var5_3).has(var0, var2_2)) {
                            return var5_3;
                        }
                        var4_4 = var3_5;
                        if (var3_5 == null) {
                            var4_4 = var5_3;
                        }
                    } else {
                        var4_4 = var3_5;
                        if (ScriptableObject.hasProperty(var5_3, var2_2)) {
                            return var5_3;
                        }
                    }
                    if ((var3_5 = var1_1.getParentScope()) != null) break block15;
                    var3_5 = var4_4;
                    ** GOTO lbl38
                }
                var5_3 = var1_1;
                var1_1 = var3_5;
                var3_5 = var4_4;
                var4_4 = var5_3;
            }
            while (true) {
                block16: {
                    var1_1 = var5_3;
                    if (ScriptableObject.hasProperty(var6_6, var2_2)) {
                        return var6_6;
                    }
                    var5_3 = var1_1.getParentScope();
                    if (var5_3 != null) break block16;
lbl38:
                    // 2 sources

                    var4_4 = var3_5;
                    var3_5 = var1_1;
                    break;
                }
                var6_6 = var1_1;
            }
        }
        var1_1 = var3_5;
        if (var0.useDynamicScope) {
            var1_1 = ScriptRuntime.checkDynamicScope(var0.topCallScope, var3_5);
        }
        if (ScriptableObject.hasProperty(var1_1, var2_2)) {
            return var1_1;
        }
        return var4_4;
    }

    public static Number bitwiseAND(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            return ((BigInteger)number).and((BigInteger)number2);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return (double)(ScriptRuntime.toInt32(number.doubleValue()) & ScriptRuntime.toInt32(number2.doubleValue()));
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    public static Number bitwiseNOT(Number number) {
        if (number instanceof BigInteger) {
            return ((BigInteger)number).not();
        }
        return (double)(~ScriptRuntime.toInt32(number.doubleValue()));
    }

    public static Number bitwiseOR(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            return ((BigInteger)number).or((BigInteger)number2);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return (double)(ScriptRuntime.toInt32(number.doubleValue()) | ScriptRuntime.toInt32(number2.doubleValue()));
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    public static Number bitwiseXOR(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            return ((BigInteger)number).xor((BigInteger)number2);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return (double)(ScriptRuntime.toInt32(number.doubleValue()) ^ ScriptRuntime.toInt32(number2.doubleValue()));
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    @Deprecated
    public static Object call(Context context, Object object, Object object2, Object[] objectArray, Scriptable scriptable) {
        if (object instanceof Function) {
            object = (Function)object;
            if ((object2 = ScriptRuntime.toObjectOrNull(context, object2, scriptable)) != null) {
                return object.call(context, scriptable, (Scriptable)object2, objectArray);
            }
            throw ScriptRuntime.undefCallError(null, "function");
        }
        throw ScriptRuntime.notFunctionError(ScriptRuntime.toString(object));
    }

    public static Object callIterator(Object object, Context context, Scriptable scriptable) {
        return ScriptRuntime.getElemFunctionAndThis(object, SymbolKey.ITERATOR, context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), emptyArgs);
    }

    public static Ref callRef(Callable callable, Scriptable object, Object[] objectArray, Context context) {
        if (callable instanceof RefCallable) {
            if ((object = (callable = (RefCallable)callable).refCall(context, (Scriptable)object, objectArray)) != null) {
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(callable.getClass().getName());
            ((StringBuilder)object).append(".refCall() returned null");
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        throw ScriptRuntime.constructError("ReferenceError", ScriptRuntime.getMessageById("msg.no.ref.from.function", ScriptRuntime.toString(callable)));
    }

    public static Object callSpecial(Context context, Callable callable, Scriptable scriptable, Object[] objectArray, Scriptable scriptable2, Scriptable scriptable3, int n2, String string, int n3) {
        block7: {
            block8: {
                block6: {
                    block5: {
                        if (n2 != 1) break block5;
                        if (scriptable.getParentScope() == null && NativeGlobal.isEvalFunction(callable)) {
                            return ScriptRuntime.evalSpecial(context, scriptable2, scriptable3, objectArray, string, n3);
                        }
                        break block6;
                    }
                    if (n2 != 2) break block7;
                    if (NativeWith.isWithFunction(callable)) break block8;
                }
                return callable.call(context, scriptable2, scriptable, objectArray);
            }
            throw Context.reportRuntimeErrorById("msg.only.from.new", "With");
        }
        throw Kit.codeBug();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Optional<Double> canonicalNumericIndexString(String string) {
        double d2;
        if ("-0".equals(string)) {
            d2 = Double.NEGATIVE_INFINITY;
            return Optional.of(d2);
        }
        d2 = ScriptRuntime.toNumber(string);
        if (Double.isNaN(d2)) {
            return Optional.empty();
        }
        if (!ScriptRuntime.toString(d2).equals(string)) return Optional.empty();
        return Optional.of(d2);
    }

    static void checkDeprecated(Context object, String string) {
        block3: {
            block2: {
                int n2 = ((Context)object).getLanguageVersion();
                if (n2 < 140 && n2 != 0) break block2;
                object = ScriptRuntime.getMessageById("msg.deprec.ctor", string);
                if (n2 != 0) break block3;
                Context.reportWarning((String)object);
            }
            return;
        }
        throw Context.reportRuntimeError((String)object);
    }

    static Scriptable checkDynamicScope(Scriptable scriptable, Scriptable scriptable2) {
        Scriptable scriptable3;
        if (scriptable == scriptable2) {
            return scriptable;
        }
        Scriptable scriptable4 = scriptable;
        do {
            if ((scriptable3 = scriptable4.getPrototype()) == scriptable2) {
                return scriptable;
            }
            scriptable4 = scriptable3;
        } while (scriptable3 != null);
        return scriptable2;
    }

    public static RegExpProxy checkRegExpProxy(Context object) {
        if ((object = ScriptRuntime.getRegExpProxy((Context)object)) != null) {
            return object;
        }
        throw Context.reportRuntimeErrorById("msg.no.regexp", new Object[0]);
    }

    public static boolean compare(Number number, Number number2, int n2) {
        double d2;
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            return ScriptRuntime.compareTo((BigInteger)number, (BigInteger)number2, n2);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return ScriptRuntime.compareTo(number.doubleValue(), number2.doubleValue(), n2);
        }
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = true;
        if (bl) {
            number = new BigDecimal((BigInteger)number);
        } else {
            d2 = number.doubleValue();
            if (Double.isNaN(d2)) {
                return false;
            }
            if (d2 == Double.POSITIVE_INFINITY) {
                bl = bl5;
                if (n2 != 17) {
                    bl = n2 == 16 ? bl5 : false;
                }
                return bl;
            }
            if (d2 == Double.NEGATIVE_INFINITY) {
                bl = bl2;
                if (n2 != 15) {
                    bl = n2 == 14 ? bl2 : false;
                }
                return bl;
            }
            number = new BigDecimal(d2, MathContext.UNLIMITED);
        }
        if (number2 instanceof BigInteger) {
            number2 = new BigDecimal((BigInteger)number2);
        } else {
            d2 = number2.doubleValue();
            if (Double.isNaN(d2)) {
                return false;
            }
            if (d2 == Double.POSITIVE_INFINITY) {
                bl = bl3;
                if (n2 != 15) {
                    bl = n2 == 14 ? bl3 : false;
                }
                return bl;
            }
            if (d2 == Double.NEGATIVE_INFINITY) {
                bl = bl4;
                if (n2 != 17) {
                    bl = n2 == 16 ? bl4 : false;
                }
                return bl;
            }
            number2 = new BigDecimal(d2, MathContext.UNLIMITED);
        }
        return ScriptRuntime.compareTo(number, number2, n2);
    }

    public static boolean compare(Object object, Object object2, int n2) {
        if (object instanceof Number && object2 instanceof Number) {
            return ScriptRuntime.compare((Number)object, (Number)object2, n2);
        }
        if (!(object instanceof Symbol) && !(object2 instanceof Symbol)) {
            Object object3 = object;
            if (object instanceof Scriptable) {
                object3 = ((Scriptable)object).getDefaultValue(NumberClass);
            }
            object = object2;
            if (object2 instanceof Scriptable) {
                object = ((Scriptable)object2).getDefaultValue(NumberClass);
            }
            if (object3 instanceof CharSequence && object instanceof CharSequence) {
                return ScriptRuntime.compareTo(object3.toString(), object.toString(), n2);
            }
            return ScriptRuntime.compare(ScriptRuntime.toNumeric(object3), ScriptRuntime.toNumeric(object), n2);
        }
        throw ScriptRuntime.typeErrorById("msg.compare.symbol", new Object[0]);
    }

    private static <T> boolean compareTo(double d2, double d3, int n2) {
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        switch (n2) {
            default: {
                throw Kit.codeBug();
            }
            case 17: {
                bl = d2 >= d3 ? bl4 : false;
                return bl;
            }
            case 16: {
                if (!(d2 > d3)) {
                    bl = false;
                }
                return bl;
            }
            case 15: {
                bl = d2 <= d3 ? bl2 : false;
                return bl;
            }
            case 14: 
        }
        bl = d2 < d3 ? bl3 : false;
        return bl;
    }

    private static <T> boolean compareTo(Comparable<T> comparable, T t2, int n2) {
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        switch (n2) {
            default: {
                throw Kit.codeBug();
            }
            case 17: {
                bl = comparable.compareTo(t2) >= 0 ? bl4 : false;
                return bl;
            }
            case 16: {
                if (comparable.compareTo(t2) <= 0) {
                    bl = false;
                }
                return bl;
            }
            case 15: {
                bl = comparable.compareTo(t2) <= 0 ? bl2 : false;
                return bl;
            }
            case 14: 
        }
        bl = comparable.compareTo(t2) < 0 ? bl3 : false;
        return bl;
    }

    public static EcmaError constructError(String string, String string2) {
        int[] nArray = new int[1];
        return ScriptRuntime.constructError(string, string2, Context.getSourcePositionFromStack(nArray), nArray[0], null, 0);
    }

    public static EcmaError constructError(String string, String string2, int n2) {
        int[] nArray = new int[1];
        String string3 = Context.getSourcePositionFromStack(nArray);
        if (nArray[0] != 0) {
            nArray[0] = nArray[0] + n2;
        }
        return ScriptRuntime.constructError(string, string2, string3, nArray[0], null, 0);
    }

    public static EcmaError constructError(String string, String string2, String string3, int n2, String string4, int n3) {
        return new EcmaError(string, string2, string3, n2, string4, n3);
    }

    public static Scriptable createArrowFunctionActivation(NativeFunction nativeFunction, Context context, Scriptable scriptable, Object[] objectArray, boolean bl, boolean bl2) {
        return new NativeCall(nativeFunction, context, scriptable, objectArray, true, bl, bl2);
    }

    @Deprecated
    public static Scriptable createArrowFunctionActivation(NativeFunction nativeFunction, Scriptable scriptable, Object[] objectArray, boolean bl) {
        return new NativeCall(nativeFunction, Context.getCurrentContext(), scriptable, objectArray, true, bl, false);
    }

    public static Scriptable createFunctionActivation(NativeFunction nativeFunction, Context context, Scriptable scriptable, Object[] objectArray, boolean bl, boolean bl2) {
        return new NativeCall(nativeFunction, context, scriptable, objectArray, false, bl, bl2);
    }

    @Deprecated
    public static Scriptable createFunctionActivation(NativeFunction nativeFunction, Scriptable scriptable, Object[] objectArray) {
        return ScriptRuntime.createFunctionActivation(nativeFunction, Context.getCurrentContext(), scriptable, objectArray, false, false);
    }

    @Deprecated
    public static Scriptable createFunctionActivation(NativeFunction nativeFunction, Scriptable scriptable, Object[] objectArray, boolean bl) {
        return new NativeCall(nativeFunction, Context.getCurrentContext(), scriptable, objectArray, false, bl, false);
    }

    private static XMLLib currentXMLLib(Context context) {
        Scriptable scriptable = context.topCallScope;
        if (scriptable != null) {
            XMLLib xMLLib;
            XMLLib xMLLib2 = xMLLib = context.cachedXMLLib;
            if (xMLLib == null) {
                xMLLib2 = XMLLib.extractFromScope(scriptable);
                if (xMLLib2 != null) {
                    context.cachedXMLLib = xMLLib2;
                } else {
                    throw new IllegalStateException();
                }
            }
            return xMLLib2;
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static String defaultObjectToSource(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] object) {
        boolean bl;
        boolean bl2;
        object = context.iterating;
        int n2 = 0;
        if (object == null) {
            context.iterating = new ObjToIntMap(31);
            bl2 = true;
            bl = false;
        } else {
            bl = ((ObjToIntMap)object).has(scriptable2);
            bl2 = false;
        }
        StringBuilder stringBuilder = new StringBuilder(128);
        if (bl2) {
            stringBuilder.append("(");
        }
        stringBuilder.append('{');
        if (!bl) {
            context.iterating.intern(scriptable2);
            return scriptable2.getIds();
        }
        if (bl2) {
            context.iterating = null;
        }
        stringBuilder.append('}');
        if (!bl2) return stringBuilder.toString();
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    static String defaultObjectToString(Scriptable scriptable) {
        if (scriptable == null) {
            return "[object Null]";
        }
        if (Undefined.isUndefined(scriptable)) {
            return "[object Undefined]";
        }
        StringBuilder stringBuilder = a.c("[object ");
        stringBuilder.append(scriptable.getClassName());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Deprecated
    public static Object delete(Object object, Object object2, Context context) {
        return ScriptRuntime.delete(object, object2, context, false);
    }

    public static Object delete(Object object, Object object2, Context context, Scriptable scriptable, boolean bl) {
        if ((scriptable = ScriptRuntime.toObjectOrNull(context, object, scriptable)) == null) {
            if (bl) {
                return Boolean.TRUE;
            }
            throw ScriptRuntime.undefDeleteError(object, object2);
        }
        return ScriptRuntime.wrapBoolean(ScriptRuntime.deleteObjectElem(scriptable, object2, context));
    }

    @Deprecated
    public static Object delete(Object object, Object object2, Context context, boolean bl) {
        return ScriptRuntime.delete(object, object2, context, ScriptRuntime.getTopCallScope(context), bl);
    }

    public static boolean deleteObjectElem(Scriptable scriptable, Object object, Context object2) {
        if (ScriptRuntime.isSymbol(object)) {
            object2 = ScriptableObject.ensureSymbolScriptable(scriptable);
            object = (Symbol)object;
            object2.delete((Symbol)object);
            return object2.has((Symbol)object, scriptable) ^ true;
        }
        object2 = ScriptRuntime.toStringIdOrIndex(object);
        object = ((ScriptRuntime$StringIdOrIndex)object2).stringId;
        if (object == null) {
            scriptable.delete(((ScriptRuntime$StringIdOrIndex)object2).index);
            return scriptable.has(((ScriptRuntime$StringIdOrIndex)object2).index, scriptable) ^ true;
        }
        scriptable.delete((String)object);
        return scriptable.has(((ScriptRuntime$StringIdOrIndex)object2).stringId, scriptable) ^ true;
    }

    public static Number divide(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            if (!number2.equals(BigInteger.ZERO)) {
                return ((BigInteger)number).divide((BigInteger)number2);
            }
            throw ScriptRuntime.rangeErrorById("msg.division.zero", new Object[0]);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return number.doubleValue() / number2.doubleValue();
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    private static Object doScriptableIncrDecr(Scriptable scriptable, String string, Scriptable scriptable2, Object object, int n2) {
        boolean bl = (n2 & 2) != 0;
        Number number = object instanceof Number ? (Number)((Number)object) : (Number)ScriptRuntime.toNumeric(object);
        boolean bl2 = number instanceof BigInteger;
        n2 &= 1;
        if (bl2) {
            object = n2 == 0 ? ((BigInteger)number).add(BigInteger.ONE) : ((BigInteger)number).subtract(BigInteger.ONE);
        } else {
            double d2 = number.doubleValue();
            d2 = n2 == 0 ? (d2 += 1.0) : (d2 -= 1.0);
            object = d2;
        }
        scriptable.put(string, scriptable2, object);
        if (bl) {
            return number;
        }
        return object;
    }

    @Deprecated
    public static Object doTopCall(Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ScriptRuntime.doTopCall(callable, context, scriptable, scriptable2, objectArray, context.isTopLevelStrict);
    }

    public static Object doTopCall(Callable object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray, boolean bl) {
        if (scriptable != null) {
            if (context.topCallScope == null) {
                block5: {
                    context.topCallScope = ScriptableObject.getTopLevelScope(scriptable);
                    context.useDynamicScope = context.hasFeature(7);
                    boolean bl2 = context.isTopLevelStrict;
                    context.isTopLevelStrict = bl;
                    ContextFactory contextFactory = context.getFactory();
                    try {
                        object = contextFactory.doTopCall((Callable)object, context, scriptable, scriptable2, objectArray);
                        context.topCallScope = null;
                        context.cachedXMLLib = null;
                        context.isTopLevelStrict = bl2;
                        if (context.currentActivationCall != null) break block5;
                        return object;
                    }
                    catch (Throwable throwable) {
                        context.topCallScope = null;
                        context.cachedXMLLib = null;
                        context.isTopLevelStrict = bl2;
                        if (context.currentActivationCall != null) {
                            throw new IllegalStateException();
                        }
                        throw throwable;
                    }
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public static Object elemIncrDecr(Object object, Object object2, Context context, int n2) {
        return ScriptRuntime.elemIncrDecr(object, object2, context, ScriptRuntime.getTopCallScope(context), n2);
    }

    public static Object elemIncrDecr(Object object, Object object2, Context context, Scriptable scriptable, int n2) {
        Object object3 = ScriptRuntime.getObjectElem(object, object2, context, scriptable);
        boolean bl = (n2 & 2) != 0;
        Number number = object3 instanceof Number ? (Number)((Number)object3) : (Number)ScriptRuntime.toNumeric(object3);
        boolean bl2 = number instanceof BigInteger;
        n2 &= 1;
        if (bl2) {
            object3 = n2 == 0 ? ((BigInteger)number).add(BigInteger.ONE) : ((BigInteger)number).subtract(BigInteger.ONE);
        } else {
            double d2 = number.doubleValue();
            d2 = n2 == 0 ? (d2 += 1.0) : (d2 -= 1.0);
            object3 = d2;
        }
        ScriptRuntime.setObjectElem(object, object2, object3, context, scriptable);
        if (bl) {
            return number;
        }
        return object3;
    }

    public static void enterActivationFunction(Context context, Scriptable scriptable) {
        if (context.topCallScope != null) {
            scriptable = (NativeCall)scriptable;
            ((NativeCall)scriptable).parentActivationCall = context.currentActivationCall;
            context.currentActivationCall = scriptable;
            ((NativeCall)scriptable).defineAttributesForArguments();
            return;
        }
        throw new IllegalStateException();
    }

    public static Scriptable enterDotQuery(Object object, Scriptable scriptable) {
        if (object instanceof XMLObject) {
            return ((XMLObject)object).enterDotQuery(scriptable);
        }
        throw ScriptRuntime.notXmlError(object);
    }

    public static Scriptable enterWith(Object object, Context object2, Scriptable scriptable) {
        if ((object2 = ScriptRuntime.toObjectOrNull((Context)object2, object, scriptable)) != null) {
            if (object2 instanceof XMLObject) {
                return ((XMLObject)object2).enterWith(scriptable);
            }
            return new NativeWith(scriptable, (Scriptable)object2);
        }
        throw ScriptRuntime.typeErrorById("msg.undef.with", ScriptRuntime.toString(object));
    }

    private static void enumChangeObject(ScriptRuntime$IdEnumeration scriptRuntime$IdEnumeration) {
        Object[] objectArray;
        Object[] objectArray2 = null;
        while ((objectArray = scriptRuntime$IdEnumeration.obj) != null && (objectArray2 = objectArray.getIds()).length == 0) {
            scriptRuntime$IdEnumeration.obj = scriptRuntime$IdEnumeration.obj.getPrototype();
        }
        if (scriptRuntime$IdEnumeration.obj != null && (objectArray = scriptRuntime$IdEnumeration.ids) != null) {
            int n2 = objectArray.length;
            if (scriptRuntime$IdEnumeration.used == null) {
                scriptRuntime$IdEnumeration.used = new ObjToIntMap(n2);
            }
            for (int i2 = 0; i2 != n2; ++i2) {
                scriptRuntime$IdEnumeration.used.intern(objectArray[i2]);
            }
        }
        scriptRuntime$IdEnumeration.ids = objectArray2;
        scriptRuntime$IdEnumeration.index = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object enumId(Object object, Context context) {
        ScriptRuntime$IdEnumeration scriptRuntime$IdEnumeration = (ScriptRuntime$IdEnumeration)object;
        if (scriptRuntime$IdEnumeration.iterator != null) {
            return scriptRuntime$IdEnumeration.currentId;
        }
        int n2 = scriptRuntime$IdEnumeration.enumType;
        if (n2 == 0) return scriptRuntime$IdEnumeration.currentId;
        if (n2 == 1) return ScriptRuntime.enumValue(object, context);
        if (n2 != 2) {
            if (n2 == 3) return scriptRuntime$IdEnumeration.currentId;
            if (n2 == 4) return ScriptRuntime.enumValue(object, context);
            if (n2 != 5) {
                throw Kit.codeBug();
            }
        }
        Object object2 = scriptRuntime$IdEnumeration.currentId;
        object = ScriptRuntime.enumValue(object, context);
        return context.newArray(ScriptableObject.getTopLevelScope(scriptRuntime$IdEnumeration.obj), new Object[]{object2, object});
    }

    @Deprecated
    public static Object enumInit(Object object, Context context, int n2) {
        return ScriptRuntime.enumInit(object, context, ScriptRuntime.getTopCallScope(context), n2);
    }

    public static Object enumInit(Object object, Context context, Scriptable scriptable, int n2) {
        ScriptRuntime$IdEnumeration scriptRuntime$IdEnumeration = new ScriptRuntime$IdEnumeration(null);
        scriptRuntime$IdEnumeration.obj = object = ScriptRuntime.toObjectOrNull(context, object, scriptable);
        if (n2 == 6) {
            scriptRuntime$IdEnumeration.enumType = n2;
            scriptRuntime$IdEnumeration.iterator = null;
            return ScriptRuntime.enumInitInOrder(context, scriptRuntime$IdEnumeration);
        }
        if (object == null) {
            return scriptRuntime$IdEnumeration;
        }
        scriptRuntime$IdEnumeration.enumType = n2;
        scriptRuntime$IdEnumeration.iterator = null;
        if (n2 != 3 && n2 != 4 && n2 != 5) {
            scriptable = object.getParentScope();
            object = scriptRuntime$IdEnumeration.obj;
            boolean bl = n2 == 0;
            scriptRuntime$IdEnumeration.iterator = ScriptRuntime.toIterator(context, scriptable, (Scriptable)object, bl);
        }
        if (scriptRuntime$IdEnumeration.iterator == null) {
            ScriptRuntime.enumChangeObject(scriptRuntime$IdEnumeration);
        }
        return scriptRuntime$IdEnumeration;
    }

    @Deprecated
    public static Object enumInit(Object object, Context context, boolean bl) {
        return ScriptRuntime.enumInit(object, context, bl ? 1 : 0);
    }

    private static Object enumInitInOrder(Context object, ScriptRuntime$IdEnumeration scriptRuntime$IdEnumeration) {
        Object object2;
        Scriptable scriptable = scriptRuntime$IdEnumeration.obj;
        if (scriptable instanceof SymbolScriptable && ScriptableObject.hasProperty(scriptable, (Symbol)(object2 = SymbolKey.ITERATOR))) {
            if ((object2 = ScriptableObject.getProperty(scriptRuntime$IdEnumeration.obj, (Symbol)object2)) instanceof Callable) {
                if ((object = ((Callable)object2).call((Context)object, scriptRuntime$IdEnumeration.obj.getParentScope(), scriptRuntime$IdEnumeration.obj, new Object[0])) instanceof Scriptable) {
                    scriptRuntime$IdEnumeration.iterator = (Scriptable)object;
                    return scriptRuntime$IdEnumeration;
                }
                throw ScriptRuntime.typeErrorById("msg.not.iterable", ScriptRuntime.toString(scriptRuntime$IdEnumeration.obj));
            }
            throw ScriptRuntime.typeErrorById("msg.not.iterable", ScriptRuntime.toString(scriptRuntime$IdEnumeration.obj));
        }
        throw ScriptRuntime.typeErrorById("msg.not.iterable", ScriptRuntime.toString(scriptRuntime$IdEnumeration.obj));
    }

    @Deprecated
    public static Boolean enumNext(Object object) {
        return ScriptRuntime.enumNext(object, Context.getContext());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Boolean enumNext(Object object, Context object2) {
        block10: {
            int n2;
            ScriptRuntime$IdEnumeration scriptRuntime$IdEnumeration = (ScriptRuntime$IdEnumeration)object;
            object = scriptRuntime$IdEnumeration.iterator;
            if (object != null) {
                if (scriptRuntime$IdEnumeration.enumType == 6) {
                    return ScriptRuntime.enumNextInOrder(scriptRuntime$IdEnumeration, (Context)object2);
                }
                if (!((object = ScriptableObject.getProperty((Scriptable)object, "next")) instanceof Callable)) {
                    return Boolean.FALSE;
                }
                object = (Callable)object;
                try {
                    scriptRuntime$IdEnumeration.currentId = object.call((Context)object2, scriptRuntime$IdEnumeration.iterator.getParentScope(), scriptRuntime$IdEnumeration.iterator, emptyArgs);
                    return Boolean.TRUE;
                }
                catch (JavaScriptException javaScriptException) {
                    if (!(javaScriptException.getValue() instanceof NativeIterator$StopIteration)) throw javaScriptException;
                    return Boolean.FALSE;
                }
            }
            while (true) {
                if ((object2 = scriptRuntime$IdEnumeration.obj) == null) {
                    return Boolean.FALSE;
                }
                n2 = scriptRuntime$IdEnumeration.index;
                object = scriptRuntime$IdEnumeration.ids;
                if (n2 == ((Object)object).length) {
                    scriptRuntime$IdEnumeration.obj = object2.getPrototype();
                    ScriptRuntime.enumChangeObject(scriptRuntime$IdEnumeration);
                    continue;
                }
                scriptRuntime$IdEnumeration.index = n2 + 1;
                object = object[n2];
                object2 = scriptRuntime$IdEnumeration.used;
                if (object2 != null && ((ObjToIntMap)object2).has(object) || object instanceof Symbol) continue;
                if (object instanceof String) {
                    object2 = (String)object;
                    Scriptable scriptable = scriptRuntime$IdEnumeration.obj;
                    object = object2;
                    if (!scriptable.has((String)object2, scriptable)) {
                        continue;
                    }
                    break block10;
                }
                object = scriptRuntime$IdEnumeration.obj;
                n2 = ((Number)object).intValue();
                if (object.has(n2, (Scriptable)object)) break;
            }
            object = scriptRuntime$IdEnumeration.enumNumbers ? Integer.valueOf(n2) : String.valueOf(n2);
        }
        scriptRuntime$IdEnumeration.currentId = object;
        return Boolean.TRUE;
    }

    private static Boolean enumNextInOrder(ScriptRuntime$IdEnumeration scriptRuntime$IdEnumeration, Context object) {
        Object object2 = ScriptableObject.getProperty(scriptRuntime$IdEnumeration.iterator, "next");
        if (object2 instanceof Callable) {
            Callable callable = (Callable)object2;
            object2 = scriptRuntime$IdEnumeration.iterator.getParentScope();
            if ((object2 = ScriptableObject.getProperty((Scriptable)(object = ScriptRuntime.toObject((Context)object, (Scriptable)object2, callable.call((Context)object, (Scriptable)object2, scriptRuntime$IdEnumeration.iterator, emptyArgs))), "done")) != Scriptable.NOT_FOUND && ScriptRuntime.toBoolean(object2)) {
                return Boolean.FALSE;
            }
            scriptRuntime$IdEnumeration.currentId = ScriptableObject.getProperty((Scriptable)object, "value");
            return Boolean.TRUE;
        }
        throw ScriptRuntime.notFunctionError(scriptRuntime$IdEnumeration.iterator, "next");
    }

    public static Object enumValue(Object object, Context object2) {
        Object object3 = (ScriptRuntime$IdEnumeration)object;
        if (ScriptRuntime.isSymbol(((ScriptRuntime$IdEnumeration)object3).currentId)) {
            object = ScriptableObject.ensureSymbolScriptable(((ScriptRuntime$IdEnumeration)object3).obj).get((Symbol)((ScriptRuntime$IdEnumeration)object3).currentId, ((ScriptRuntime$IdEnumeration)object3).obj);
        } else {
            object2 = ScriptRuntime.toStringIdOrIndex(((ScriptRuntime$IdEnumeration)object3).currentId);
            object = ((ScriptRuntime$StringIdOrIndex)object2).stringId;
            object3 = ((ScriptRuntime$IdEnumeration)object3).obj;
            object = object == null ? object3.get(((ScriptRuntime$StringIdOrIndex)object2).index, (Scriptable)object3) : object3.get((String)object, (Scriptable)object3);
        }
        return object;
    }

    public static boolean eq(Object object, Object object2) {
        block27: {
            boolean bl;
            boolean bl2;
            block28: {
                Object object3;
                double d2;
                block29: {
                    block30: {
                        block31: {
                            boolean bl3 = false;
                            bl2 = false;
                            bl = false;
                            if (object == null || Undefined.isUndefined(object)) break block27;
                            if (object instanceof BigInteger) {
                                return ScriptRuntime.eqBigInt((BigInteger)object, object2);
                            }
                            if (object instanceof Number) {
                                return ScriptRuntime.eqNumber(((Number)object).doubleValue(), object2);
                            }
                            if (object == object2) {
                                return true;
                            }
                            if (object instanceof CharSequence) {
                                return ScriptRuntime.eqString((CharSequence)object, object2);
                            }
                            boolean bl4 = object instanceof Boolean;
                            d2 = 1.0;
                            if (bl4) {
                                bl3 = (Boolean)object;
                                if (object2 instanceof Boolean) {
                                    if (bl3 == (Boolean)object2) {
                                        bl = true;
                                    }
                                    return bl;
                                }
                                if (object2 instanceof ScriptableObject && (object = ((ScriptableObject)object2).equivalentValues(object)) != Scriptable.NOT_FOUND) {
                                    return (Boolean)object;
                                }
                                if (!bl3) {
                                    d2 = 0.0;
                                }
                                return ScriptRuntime.eqNumber(d2, object2);
                            }
                            if (!(object instanceof Scriptable)) break block28;
                            object3 = object;
                            if (object instanceof Delegator) {
                                object = ((Delegator)object).getDelegee();
                                if (object2 instanceof Delegator) {
                                    return ScriptRuntime.eq(object, ((Delegator)object2).getDelegee());
                                }
                                object3 = object;
                                if (object == object2) {
                                    return true;
                                }
                            }
                            if (object2 instanceof Delegator && ((Delegator)object2).getDelegee() == object3) {
                                return true;
                            }
                            if (!(object2 instanceof Scriptable)) break block29;
                            if (object3 instanceof ScriptableObject && (object = ((ScriptableObject)object3).equivalentValues(object2)) != Scriptable.NOT_FOUND) {
                                return (Boolean)object;
                            }
                            if (object2 instanceof ScriptableObject && (object = ((ScriptableObject)object2).equivalentValues(object3)) != Scriptable.NOT_FOUND) {
                                return (Boolean)object;
                            }
                            bl = bl3;
                            if (!(object3 instanceof Wrapper)) break block30;
                            bl = bl3;
                            if (!(object2 instanceof Wrapper)) break block30;
                            object = ((Wrapper)object3).unwrap();
                            if (object == (object2 = ((Wrapper)object2).unwrap())) break block31;
                            bl = bl3;
                            if (!ScriptRuntime.isPrimitive(object)) break block30;
                            bl = bl3;
                            if (!ScriptRuntime.isPrimitive(object2)) break block30;
                            bl = bl3;
                            if (!ScriptRuntime.eq(object, object2)) break block30;
                        }
                        bl = true;
                    }
                    return bl;
                }
                if (object2 instanceof Boolean) {
                    if (object3 instanceof ScriptableObject && (object = ((ScriptableObject)object3).equivalentValues(object2)) != Scriptable.NOT_FOUND) {
                        return (Boolean)object;
                    }
                    if (!((Boolean)object2).booleanValue()) {
                        d2 = 0.0;
                    }
                    return ScriptRuntime.eqNumber(d2, object3);
                }
                if (object2 instanceof BigInteger) {
                    return ScriptRuntime.eqBigInt((BigInteger)object2, object3);
                }
                if (object2 instanceof Number) {
                    return ScriptRuntime.eqNumber(((Number)object2).doubleValue(), object3);
                }
                if (object2 instanceof CharSequence) {
                    return ScriptRuntime.eqString((CharSequence)object2, object3);
                }
                return false;
            }
            ScriptRuntime.warnAboutNonJSObject(object);
            bl = bl2;
            if (object == object2) {
                bl = true;
            }
            return bl;
        }
        if (object2 != null && !Undefined.isUndefined(object2)) {
            if (object2 instanceof ScriptableObject && (object = ((ScriptableObject)object2).equivalentValues(object)) != Scriptable.NOT_FOUND) {
                return (Boolean)object;
            }
            return false;
        }
        return true;
    }

    private static boolean eqBigInt(BigInteger bigInteger, double d2) {
        boolean bl;
        boolean bl2 = Double.isNaN(d2);
        boolean bl3 = bl = false;
        if (!bl2) {
            if (Double.isInfinite(d2)) {
                bl3 = bl;
            } else {
                double d3 = Math.ceil(d2);
                if (d3 != d2) {
                    return false;
                }
                bl3 = bl;
                if (new BigDecimal(bigInteger).compareTo(new BigDecimal(d3, MathContext.UNLIMITED)) == 0) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    static boolean eqBigInt(BigInteger bigInteger, Object object) {
        while (object != null && !Undefined.isUndefined(object)) {
            if (object instanceof BigInteger) {
                return bigInteger.equals(object);
            }
            if (object instanceof Number) {
                return ScriptRuntime.eqBigInt(bigInteger, ((Number)object).doubleValue());
            }
            if (object instanceof CharSequence) {
                try {
                    object = ScriptRuntime.toBigInt(object);
                }
                catch (EcmaError ecmaError) {
                    return false;
                }
                return bigInteger.equals(object);
            }
            if (object instanceof Boolean) {
                object = (Boolean)object != false ? BigInteger.ONE : BigInteger.ZERO;
                return bigInteger.equals(object);
            }
            if (ScriptRuntime.isSymbol(object)) {
                return false;
            }
            if (object instanceof Scriptable) {
                Object object2;
                if (object instanceof ScriptableObject && (object2 = ((ScriptableObject)object).equivalentValues(bigInteger)) != Scriptable.NOT_FOUND) {
                    return (Boolean)object2;
                }
                object = ScriptRuntime.toPrimitive(object);
                continue;
            }
            ScriptRuntime.warnAboutNonJSObject(object);
            break;
        }
        return false;
    }

    static boolean eqNumber(double d2, Object object) {
        block11: {
            while (true) {
                boolean bl = false;
                boolean bl2 = false;
                boolean bl3 = false;
                if (object == null || Undefined.isUndefined(object)) break block11;
                if (object instanceof BigInteger) {
                    return ScriptRuntime.eqBigInt((BigInteger)object, d2);
                }
                if (object instanceof Number) {
                    bl = bl3;
                    if (d2 == ((Number)object).doubleValue()) {
                        bl = true;
                    }
                    return bl;
                }
                if (object instanceof CharSequence) {
                    if (d2 == ScriptRuntime.toNumber(object)) {
                        bl = true;
                    }
                    return bl;
                }
                if (object instanceof Boolean) {
                    double d3 = (Boolean)object != false ? 1.0 : 0.0;
                    bl = bl2;
                    if (d2 == d3) {
                        bl = true;
                    }
                    return bl;
                }
                if (ScriptRuntime.isSymbol(object)) {
                    return false;
                }
                if (!(object instanceof Scriptable)) break;
                if (object instanceof ScriptableObject) {
                    Object object2 = ScriptRuntime.wrapNumber(d2);
                    if ((object2 = ((ScriptableObject)object).equivalentValues(object2)) != Scriptable.NOT_FOUND) {
                        return (Boolean)object2;
                    }
                }
                object = ScriptRuntime.toPrimitive(object);
            }
            ScriptRuntime.warnAboutNonJSObject(object);
        }
        return false;
    }

    private static boolean eqString(CharSequence object, Object object2) {
        block13: {
            while (true) {
                Object object3;
                boolean bl = false;
                boolean bl2 = false;
                boolean bl3 = false;
                if (object2 == null || Undefined.isUndefined(object2)) break block13;
                if (object2 instanceof CharSequence) {
                    object2 = (CharSequence)object2;
                    bl = bl3;
                    if (object.length() == object2.length()) {
                        bl = bl3;
                        if (object.toString().equals(object2.toString())) {
                            bl = true;
                        }
                    }
                    return bl;
                }
                if (object2 instanceof BigInteger) {
                    try {
                        object = ScriptRuntime.toBigInt(object);
                    }
                    catch (EcmaError ecmaError) {
                        return false;
                    }
                    return ((BigInteger)object).equals(object2);
                }
                if (object2 instanceof Number) {
                    if (ScriptRuntime.toNumber(object.toString()) == ((Number)object2).doubleValue()) {
                        bl = true;
                    }
                    return bl;
                }
                if (object2 instanceof Boolean) {
                    double d2 = ScriptRuntime.toNumber(object.toString());
                    double d3 = (Boolean)object2 != false ? 1.0 : 0.0;
                    bl = bl2;
                    if (d2 == d3) {
                        bl = true;
                    }
                    return bl;
                }
                if (ScriptRuntime.isSymbol(object2)) {
                    return false;
                }
                if (!(object2 instanceof Scriptable)) break;
                if (object2 instanceof ScriptableObject && (object3 = ((ScriptableObject)object2).equivalentValues(object.toString())) != Scriptable.NOT_FOUND) {
                    return (Boolean)object3;
                }
                object2 = ScriptRuntime.toPrimitive(object2);
            }
            ScriptRuntime.warnAboutNonJSObject(object2);
        }
        return false;
    }

    private static RuntimeException errorWithClassName(String string, Object object) {
        return Context.reportRuntimeErrorById(string, object.getClass().getName());
    }

    public static String escapeAttributeValue(Object object, Context context) {
        return ScriptRuntime.currentXMLLib(context).escapeAttributeValue(object);
    }

    public static String escapeString(String string) {
        return ScriptRuntime.escapeString(string, '\"');
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String escapeString(String string, char c2) {
        if (c2 != '\"' && c2 != '\'') {
            Kit.codeBug();
        }
        StringBuilder stringBuilder = null;
        int n2 = 0;
        int n3 = string.length();
        while (true) {
            StringBuilder stringBuilder2;
            block20: {
                StringBuilder stringBuilder3;
                int n4;
                char c3;
                block17: {
                    block18: {
                        block23: {
                            block22: {
                                char c4;
                                block21: {
                                    block19: {
                                        if (n2 == n3) break block18;
                                        c3 = string.charAt(n2);
                                        n4 = 32;
                                        if (' ' > c3 || c3 > '~' || c3 == c2 || c3 == '\\') break block19;
                                        stringBuilder2 = stringBuilder;
                                        if (stringBuilder == null) break block20;
                                        c4 = c3;
                                        stringBuilder3 = stringBuilder;
                                        break block21;
                                    }
                                    stringBuilder3 = stringBuilder;
                                    if (stringBuilder == null) {
                                        stringBuilder3 = new StringBuilder(n3 + 3);
                                        stringBuilder3.append(string);
                                        stringBuilder3.setLength(n2);
                                    }
                                    if (c3 != ' ') {
                                        if (c3 != '\\') {
                                            switch (c3) {
                                                default: {
                                                    n4 = -1;
                                                    break;
                                                }
                                                case '\r': {
                                                    n4 = 114;
                                                    break;
                                                }
                                                case '\f': {
                                                    n4 = 102;
                                                    break;
                                                }
                                                case '\u000b': {
                                                    n4 = 118;
                                                    break;
                                                }
                                                case '\n': {
                                                    n4 = 110;
                                                    break;
                                                }
                                                case '\t': {
                                                    n4 = 116;
                                                    break;
                                                }
                                                case '\b': {
                                                    n4 = 98;
                                                    break;
                                                }
                                            }
                                        } else {
                                            n4 = 92;
                                        }
                                    }
                                    if (n4 < 0) break block22;
                                    stringBuilder3.append('\\');
                                    c4 = (char)n4;
                                }
                                stringBuilder3.append(c4);
                                stringBuilder2 = stringBuilder3;
                                break block20;
                            }
                            if (c3 != c2) break block23;
                            stringBuilder3.append('\\');
                            stringBuilder3.append(c2);
                            stringBuilder2 = stringBuilder3;
                            break block20;
                        }
                        if (c3 < '\u0100') {
                            stringBuilder3.append("\\x");
                            n4 = 2;
                            break block17;
                        } else {
                            stringBuilder3.append("\\u");
                            n4 = 4;
                        }
                        break block17;
                    }
                    if (stringBuilder != null) return stringBuilder.toString();
                    return string;
                }
                n4 = (n4 - 1) * 4;
                while (true) {
                    stringBuilder2 = stringBuilder3;
                    if (n4 < 0) break;
                    int n5 = c3 >> n4 & 0xF;
                    n5 = n5 < 10 ? (n5 += 48) : (n5 += 87);
                    stringBuilder3.append((char)n5);
                    n4 -= 4;
                }
            }
            ++n2;
            stringBuilder = stringBuilder2;
        }
    }

    public static String escapeTextValue(Object object, Context context) {
        return ScriptRuntime.currentXMLLib(context).escapeTextValue(object);
    }

    public static Object evalSpecial(Context context, Scriptable scriptable, Object object, Object[] object2, String object3, int n2) {
        if (((Object[])object2).length < 1) {
            return Undefined.instance;
        }
        Object object4 = object2[0];
        if (!(object4 instanceof CharSequence)) {
            if (!context.hasFeature(11) && !context.hasFeature(9)) {
                Context.reportWarning(ScriptRuntime.getMessageById("msg.eval.nonstring", new Object[0]));
                return object4;
            }
            throw Context.reportRuntimeErrorById("msg.eval.nonstring.strict", new Object[0]);
        }
        object2 = object3;
        Object object5 = n2;
        if (object3 == null) {
            object3 = new int[1];
            object2 = Context.getSourcePositionFromStack((int[])object3);
            if (object2 != null) {
                object5 = object3[0];
            } else {
                object2 = "";
                object5 = n2;
            }
        }
        String string = ScriptRuntime.makeUrlForGeneratedScript(true, (String)object2, object5);
        ErrorReporter errorReporter = DefaultErrorReporter.forEval(context.getErrorReporter());
        object3 = Context.createInterpreter();
        if (object3 != null) {
            object2 = context.compileString(object4.toString(), (Evaluator)object3, errorReporter, string, 1, null);
            object3.setEvalScriptFlag((Script)object2);
            return ((Callable)object2).call(context, scriptable, (Scriptable)object, emptyArgs);
        }
        throw new JavaScriptException("Interpreter not present", (String)object2, (int)object5);
    }

    public static void exitActivationFunction(Context context) {
        NativeCall nativeCall = context.currentActivationCall;
        context.currentActivationCall = nativeCall.parentActivationCall;
        nativeCall.parentActivationCall = null;
    }

    public static Number exponentiate(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            if (((BigInteger)number2).signum() != -1) {
                try {
                    int n2 = ((BigInteger)number2).intValueExact();
                    number = ((BigInteger)number).pow(n2);
                    return number;
                }
                catch (ArithmeticException arithmeticException) {
                    throw ScriptRuntime.rangeErrorById("msg.bigint.out.of.range.arithmetic", new Object[0]);
                }
            }
            throw ScriptRuntime.rangeErrorById("msg.bigint.negative.exponent", new Object[0]);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return Math.pow(number.doubleValue(), number2.doubleValue());
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    static NativeCall findFunctionActivation(Context object, Function function) {
        object = ((Context)object).currentActivationCall;
        while (object != null) {
            if (((NativeCall)object).function == function) {
                return object;
            }
            object = ((NativeCall)object).parentActivationCall;
        }
        return null;
    }

    static Object[] getApplyArguments(Context context, Object object) {
        if (object != null && !Undefined.isUndefined(object)) {
            Scriptable scriptable;
            if (object instanceof Scriptable && ScriptRuntime.isArrayLike(scriptable = (Scriptable)object)) {
                return context.getElements(scriptable);
            }
            if (object instanceof ScriptableObject) {
                return emptyArgs;
            }
            throw ScriptRuntime.typeErrorById("msg.arg.isnt.array", new Object[0]);
        }
        return emptyArgs;
    }

    public static Object[] getArrayElements(Scriptable scriptable) {
        long l2 = NativeArray.getLengthProperty(Context.getContext(), scriptable);
        if (l2 <= Integer.MAX_VALUE) {
            int n2 = (int)l2;
            if (n2 == 0) {
                return emptyArgs;
            }
            Object[] objectArray = new Object[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object;
                Object object2 = object = ScriptableObject.getProperty(scriptable, i2);
                if (object == Scriptable.NOT_FOUND) {
                    object2 = Undefined.instance;
                }
                objectArray[i2] = object2;
            }
            return objectArray;
        }
        throw new IllegalArgumentException();
    }

    static Callable getCallable(Scriptable object) {
        block4: {
            Object object2;
            block5: {
                block3: {
                    block2: {
                        if (!(object instanceof Callable)) break block2;
                        object = (Callable)object;
                        break block3;
                    }
                    if (object == null) break block4;
                    object2 = object.getDefaultValue(FunctionClass);
                    if (!(object2 instanceof Callable)) break block5;
                    object = (Callable)object2;
                }
                return object;
            }
            throw ScriptRuntime.notFunctionError(object2, object);
        }
        throw ScriptRuntime.notFunctionError(null, null);
    }

    @Deprecated
    public static Callable getElemFunctionAndThis(Object object, Object object2, Context context) {
        return ScriptRuntime.getElemFunctionAndThis(object, object2, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Callable getElemFunctionAndThis(Object object, Object object2, Context context, Scriptable object3) {
        block8: {
            block7: {
                block5: {
                    block6: {
                        if (!ScriptRuntime.isSymbol(object2)) break block5;
                        Scriptable scriptable = ScriptRuntime.toObjectOrNull(context, object, (Scriptable)object3);
                        if (scriptable == null) break block6;
                        object3 = ScriptableObject.getProperty(scriptable, (Symbol)object2);
                        object = scriptable;
                        break block7;
                    }
                    throw ScriptRuntime.undefCallError(object, String.valueOf(object2));
                }
                Object object4 = ScriptRuntime.toStringIdOrIndex(object2);
                String string = ((ScriptRuntime$StringIdOrIndex)object4).stringId;
                if (string != null) {
                    return ScriptRuntime.getPropFunctionAndThis(object, string, context, (Scriptable)object3);
                }
                if ((object3 = ScriptRuntime.toObjectOrNull(context, object, (Scriptable)object3)) == null) break block8;
                object4 = ScriptableObject.getProperty((Scriptable)object3, ((ScriptRuntime$StringIdOrIndex)object4).index);
                object = object3;
                object3 = object4;
            }
            if (object3 instanceof Callable) {
                ScriptRuntime.storeScriptable(context, (Scriptable)object);
                return (Callable)object3;
            }
            throw ScriptRuntime.notFunctionError(object3, object2);
        }
        throw ScriptRuntime.undefCallError(object, String.valueOf(object2));
    }

    static Function getExistingCtor(Context object, Scriptable scriptable, String string) {
        object = ScriptableObject.getProperty(scriptable, string);
        if (object instanceof Function) {
            return (Function)object;
        }
        if (object == Scriptable.NOT_FOUND) {
            throw Context.reportRuntimeErrorById("msg.ctor.not.found", string);
        }
        throw Context.reportRuntimeErrorById("msg.not.ctor", string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ScriptableObject getGlobal(Context context) {
        Class<?> clazz = Kit.classOrNull("org.mozilla.javascript.tools.shell.Global");
        if (clazz == null) return new ImporterTopLevel(context);
        try {
            return (ScriptableObject)clazz.getConstructor(ContextClass).newInstance(context);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return new ImporterTopLevel(context);
        }
    }

    static Object getIndexObject(double d2) {
        int n2 = (int)d2;
        if ((double)n2 == d2) {
            return n2;
        }
        return ScriptRuntime.toString(d2);
    }

    static Object getIndexObject(String string) {
        long l2 = ScriptRuntime.indexFromString(string);
        Object object = string;
        if (l2 >= 0L) {
            object = string;
            if (l2 <= Integer.MAX_VALUE) {
                object = (int)l2;
            }
        }
        return object;
    }

    public static ScriptableObject getLibraryScopeOrNull(Scriptable scriptable) {
        return (ScriptableObject)ScriptableObject.getTopScopeValue(scriptable, LIBRARY_SCOPE_KEY);
    }

    @Deprecated
    public static String getMessage(String string, Object[] objectArray) {
        return messageProvider.getMessage(string, objectArray);
    }

    @Deprecated
    public static String getMessage0(String string) {
        return ScriptRuntime.getMessage(string, null);
    }

    @Deprecated
    public static String getMessage1(String string, Object object) {
        return ScriptRuntime.getMessage(string, new Object[]{object});
    }

    @Deprecated
    public static String getMessage2(String string, Object object, Object object2) {
        return ScriptRuntime.getMessage(string, new Object[]{object, object2});
    }

    @Deprecated
    public static String getMessage3(String string, Object object, Object object2, Object object3) {
        return ScriptRuntime.getMessage(string, new Object[]{object, object2, object3});
    }

    @Deprecated
    public static String getMessage4(String string, Object object, Object object2, Object object3, Object object4) {
        return ScriptRuntime.getMessage(string, new Object[]{object, object2, object3, object4});
    }

    public static String getMessageById(String string, Object ... objectArray) {
        return messageProvider.getMessage(string, objectArray);
    }

    public static Callable getNameFunctionAndThis(String string, Context context, Scriptable scriptable) {
        Object object = scriptable.getParentScope();
        if (object == null) {
            object = ScriptRuntime.topScopeName(context, scriptable, string);
            if (!(object instanceof Callable)) {
                if (object == Scriptable.NOT_FOUND) {
                    throw ScriptRuntime.notFoundError(scriptable, string);
                }
                throw ScriptRuntime.notFunctionError(object, string);
            }
            ScriptRuntime.storeScriptable(context, scriptable);
            return (Callable)object;
        }
        return (Callable)ScriptRuntime.nameOrFunction(context, scriptable, (Scriptable)object, string, true);
    }

    @Deprecated
    public static Object getObjectElem(Object object, Object object2, Context context) {
        return ScriptRuntime.getObjectElem(object, object2, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Object getObjectElem(Object object, Object object2, Context context, Scriptable scriptable) {
        if ((scriptable = ScriptRuntime.toObjectOrNull(context, object, scriptable)) != null) {
            return ScriptRuntime.getObjectElem(scriptable, object2, context);
        }
        throw ScriptRuntime.undefReadError(object, object2);
    }

    public static Object getObjectElem(Scriptable object, Object object2, Context object3) {
        if (object instanceof XMLObject) {
            object = ((XMLObject)object).get((Context)object3, object2);
        } else if (ScriptRuntime.isSymbol(object2)) {
            object = ScriptableObject.getProperty((Scriptable)object, (Symbol)object2);
        } else {
            object2 = ScriptRuntime.toStringIdOrIndex(object2);
            object3 = ((ScriptRuntime$StringIdOrIndex)object2).stringId;
            object = object3 == null ? ScriptableObject.getProperty((Scriptable)object, ((ScriptRuntime$StringIdOrIndex)object2).index) : ScriptableObject.getProperty((Scriptable)object, (String)object3);
        }
        object2 = object;
        if (object == Scriptable.NOT_FOUND) {
            object2 = Undefined.instance;
        }
        return object2;
    }

    @Deprecated
    public static Object getObjectIndex(Object object, double d2, Context context) {
        return ScriptRuntime.getObjectIndex(object, d2, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Object getObjectIndex(Object object, double d2, Context context, Scriptable scriptable) {
        if ((scriptable = ScriptRuntime.toObjectOrNull(context, object, scriptable)) != null) {
            int n2 = (int)d2;
            if ((double)n2 == d2 && n2 >= 0) {
                return ScriptRuntime.getObjectIndex(scriptable, n2, context);
            }
            return ScriptRuntime.getObjectProp(scriptable, ScriptRuntime.toString(d2), context);
        }
        throw ScriptRuntime.undefReadError(object, ScriptRuntime.toString(d2));
    }

    public static Object getObjectIndex(Scriptable object, int n2, Context object2) {
        object = object2 = ScriptableObject.getProperty((Scriptable)object, n2);
        if (object2 == Scriptable.NOT_FOUND) {
            object = Undefined.instance;
        }
        return object;
    }

    @Deprecated
    public static Object getObjectProp(Object object, String string, Context context) {
        return ScriptRuntime.getObjectProp(object, string, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Object getObjectProp(Object object, String string, Context context, Scriptable scriptable) {
        if ((scriptable = ScriptRuntime.toObjectOrNull(context, object, scriptable)) != null) {
            return ScriptRuntime.getObjectProp(scriptable, string, context);
        }
        throw ScriptRuntime.undefReadError(object, string);
    }

    public static Object getObjectProp(Scriptable object, String string, Context context) {
        Object object2;
        object = object2 = ScriptableObject.getProperty((Scriptable)object, string);
        if (object2 == Scriptable.NOT_FOUND) {
            if (context.hasFeature(11)) {
                Context.reportWarning(ScriptRuntime.getMessageById("msg.ref.undefined.prop", string));
            }
            object = Undefined.instance;
        }
        return object;
    }

    @Deprecated
    public static Object getObjectPropNoWarn(Object object, String string, Context context) {
        return ScriptRuntime.getObjectPropNoWarn(object, string, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Object getObjectPropNoWarn(Object object, String object2, Context object3, Scriptable scriptable) {
        if ((object3 = ScriptRuntime.toObjectOrNull((Context)object3, object, scriptable)) != null) {
            object = object2 = ScriptableObject.getProperty((Scriptable)object3, (String)object2);
            if (object2 == Scriptable.NOT_FOUND) {
                object = Undefined.instance;
            }
            return object;
        }
        throw ScriptRuntime.undefReadError(object, object2);
    }

    @Deprecated
    public static Callable getPropFunctionAndThis(Object object, String string, Context context) {
        return ScriptRuntime.getPropFunctionAndThis(object, string, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Callable getPropFunctionAndThis(Object object, String string, Context context, Scriptable scriptable) {
        return ScriptRuntime.getPropFunctionAndThisHelper(object, string, context, ScriptRuntime.toObjectOrNull(context, object, scriptable));
    }

    private static Callable getPropFunctionAndThisHelper(Object object, String string, Context context, Scriptable scriptable) {
        if (scriptable != null) {
            Object object2;
            object = object2 = ScriptableObject.getProperty(scriptable, string);
            if (!(object2 instanceof Callable)) {
                Object object3 = ScriptableObject.getProperty(scriptable, "__noSuchMethod__");
                object = object2;
                if (object3 instanceof Callable) {
                    object = new ScriptRuntime$NoSuchMethodShim((Callable)object3, string);
                }
            }
            if (object instanceof Callable) {
                ScriptRuntime.storeScriptable(context, scriptable);
                return (Callable)object;
            }
            throw ScriptRuntime.notFunctionError(scriptable, object, string);
        }
        throw ScriptRuntime.undefCallError(object, string);
    }

    public static RegExpProxy getRegExpProxy(Context context) {
        return context.getRegExpProxy();
    }

    public static Scriptable getTemplateLiteralCallSite(Context context, Scriptable object, Object[] objectArray, int n2) {
        Object object2 = objectArray[n2];
        if (object2 instanceof Scriptable) {
            return (Scriptable)object2;
        }
        String[] stringArray = (String[])object2;
        object2 = (ScriptableObject)context.newArray((Scriptable)object, stringArray.length >>> 1);
        ScriptableObject scriptableObject = (ScriptableObject)context.newArray((Scriptable)object, stringArray.length >>> 1);
        ((ScriptableObject)object2).put("raw", (Scriptable)object2, (Object)scriptableObject);
        ((ScriptableObject)object2).setAttributes("raw", 2);
        int n3 = stringArray.length;
        for (int i2 = 0; i2 < n3; i2 += 2) {
            int n4 = i2 >>> 1;
            object = stringArray[i2] == null ? Undefined.instance : stringArray[i2];
            ((ScriptableObject)object2).put(n4, (Scriptable)object2, object);
            scriptableObject.put(n4, (Scriptable)scriptableObject, (Object)stringArray[i2 + 1]);
        }
        object = AbstractEcmaObjectOperations$INTEGRITY_LEVEL.FROZEN;
        AbstractEcmaObjectOperations.setIntegrityLevel(context, scriptableObject, (AbstractEcmaObjectOperations$INTEGRITY_LEVEL)((Object)object));
        AbstractEcmaObjectOperations.setIntegrityLevel(context, object2, (AbstractEcmaObjectOperations$INTEGRITY_LEVEL)((Object)object));
        objectArray[n2] = object2;
        return object2;
    }

    public static Scriptable getTopCallScope(Context object) {
        object = ((Context)object).topCallScope;
        if (object != null) {
            return object;
        }
        throw new IllegalStateException();
    }

    public static Object getTopLevelProp(Scriptable scriptable, String string) {
        return ScriptableObject.getProperty(ScriptableObject.getTopLevelScope(scriptable), string);
    }

    static String[] getTopPackageNames() {
        String[] stringArray = "Dalvik".equals(System.getProperty("java.vm.name")) ? new String[]{"java", "javax", "org", "com", "edu", "net", "android"} : new String[]{"java", "javax", "org", "com", "edu", "net"};
        return stringArray;
    }

    public static Callable getValueFunctionAndThis(Object object, Context context) {
        if (object instanceof Callable) {
            Callable callable = (Callable)object;
            Object object2 = null;
            if (callable instanceof Scriptable) {
                object2 = ((Scriptable)((Object)callable)).getParentScope();
            }
            object = object2;
            if (object2 == null && (object = context.topCallScope) == null) {
                throw new IllegalStateException();
            }
            object2 = object;
            if (object.getParentScope() != null) {
                if (object instanceof NativeWith) {
                    object2 = object;
                } else {
                    object2 = object;
                    if (object instanceof NativeCall) {
                        object2 = ScriptableObject.getTopLevelScope((Scriptable)object);
                    }
                }
            }
            ScriptRuntime.storeScriptable(context, (Scriptable)object2);
            return callable;
        }
        throw ScriptRuntime.notFunctionError(object);
    }

    public static boolean hasObjectElem(Scriptable scriptable, Object object, Context object2) {
        boolean bl;
        if (ScriptRuntime.isSymbol(object)) {
            bl = ScriptableObject.hasProperty(scriptable, (Symbol)object);
        } else {
            object = ScriptRuntime.toStringIdOrIndex(object);
            object2 = ((ScriptRuntime$StringIdOrIndex)object).stringId;
            bl = object2 == null ? ScriptableObject.hasProperty(scriptable, ((ScriptRuntime$StringIdOrIndex)object).index) : ScriptableObject.hasProperty(scriptable, (String)object2);
        }
        return bl;
    }

    public static boolean hasTopCall(Context context) {
        boolean bl = context.topCallScope != null;
        return bl;
    }

    public static boolean in(Object object, Object object2, Context context) {
        if (object2 instanceof Scriptable) {
            return ScriptRuntime.hasObjectElem((Scriptable)object2, object, context);
        }
        throw ScriptRuntime.typeErrorById("msg.in.not.object", new Object[0]);
    }

    public static long indexFromString(String string) {
        int n2 = string.length();
        if (n2 > 0) {
            int n3;
            boolean bl;
            int n4 = 0;
            int n5 = 0;
            int n6 = string.charAt(0);
            if (n6 == 45 && n2 > 1) {
                n6 = string.charAt(1);
                if (n6 == 48) {
                    return -1L;
                }
                bl = true;
                n3 = 1;
            } else {
                bl = false;
                n3 = 0;
            }
            int n7 = n6 - 48;
            if (n7 >= 0 && n7 <= 9 && n2 <= (n6 = bl ? 11 : 10)) {
                int n8 = -n7;
                int n9 = n3 + 1;
                n3 = n7;
                int n10 = n9;
                n6 = n8;
                if (n8 != 0) {
                    n3 = n7;
                    n7 = n5;
                    while (true) {
                        n4 = n7;
                        n10 = n9;
                        n6 = n8;
                        if (n9 == n2) break;
                        n5 = string.charAt(n9) - 48;
                        n4 = n7;
                        n3 = n5;
                        n10 = n9;
                        n6 = n8;
                        if (n5 < 0) break;
                        n4 = n7;
                        n3 = n5;
                        n10 = n9++;
                        n6 = n8;
                        if (n5 > 9) break;
                        n6 = n8 * 10 - n5;
                        n7 = n8;
                        n3 = n5;
                        n8 = n6;
                    }
                }
                if (n10 == n2 && (n4 > -214748364 || n4 == -214748364 && n3 <= (n9 = bl ? 8 : 7))) {
                    if (!bl) {
                        n6 = -n6;
                    }
                    return 0xFFFFFFFFL & (long)n6;
                }
            }
        }
        return -1L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void initFunction(Context object, Scriptable scriptable, NativeFunction nativeFunction, int n2, boolean bl) {
        Scriptable scriptable2;
        if (n2 == 1) {
            String string = nativeFunction.getFunctionName();
            if (string == null) return;
            if (string.length() == 0) return;
            object = string;
            scriptable2 = scriptable;
            if (!bl) {
                ScriptableObject.defineProperty(scriptable, string, nativeFunction, 4);
                return;
            }
        } else {
            if (n2 != 3) throw Kit.codeBug();
            String string = nativeFunction.getFunctionName();
            if (string == null) return;
            if (string.length() == 0) return;
            while (true) {
                object = string;
                scriptable2 = scriptable;
                if (!(scriptable instanceof NativeWith)) break;
                scriptable = scriptable.getParentScope();
            }
        }
        scriptable2.put((String)object, scriptable2, (Object)nativeFunction);
    }

    public static ScriptableObject initSafeStandardObjects(Context context, ScriptableObject object, boolean bl) {
        ScriptableObject scriptableObject;
        if (object == null) {
            scriptableObject = new NativeObject();
        } else {
            scriptableObject = object;
            if (object instanceof TopLevel) {
                ((TopLevel)object).clearCache();
                scriptableObject = object;
            }
        }
        scriptableObject.associateValue(LIBRARY_SCOPE_KEY, scriptableObject);
        new ClassCache().associate(scriptableObject);
        BaseFunction.init(context, scriptableObject, bl);
        NativeObject.init(scriptableObject, bl);
        object = ScriptableObject.getObjectPrototype(scriptableObject);
        ScriptableObject.getClassPrototype(scriptableObject, "Function").setPrototype((Scriptable)object);
        if (scriptableObject.getPrototype() == null) {
            scriptableObject.setPrototype((Scriptable)object);
        }
        NativeError.init(scriptableObject, bl);
        NativeGlobal.init(context, scriptableObject, bl);
        NativeArray.init(context, scriptableObject, bl);
        if (context.getOptimizationLevel() > 0) {
            NativeArray.setMaximumInitialCapacity(200000);
        }
        NativeString.init(scriptableObject, bl);
        NativeBoolean.init(scriptableObject, bl);
        NativeNumber.init(scriptableObject, bl);
        NativeDate.init(scriptableObject, bl);
        NativeMath.init(scriptableObject, bl);
        NativeJSON.init(scriptableObject, bl);
        NativeWith.init(scriptableObject, bl);
        NativeCall.init(scriptableObject, bl);
        NativeScript.init(context, scriptableObject, bl);
        NativeIterator.init(context, scriptableObject, bl);
        NativeArrayIterator.init(scriptableObject, bl);
        NativeStringIterator.init(scriptableObject, bl);
        NativeJavaObject.init(scriptableObject, bl);
        NativeJavaMap.init(scriptableObject, bl);
        boolean bl2 = context.hasFeature(6) && context.getE4xImplementationFactory() != null;
        new LazilyLoadedCtor(scriptableObject, "RegExp", "org.mozilla.javascript.regexp.NativeRegExp", bl, true);
        new LazilyLoadedCtor(scriptableObject, "Continuation", "org.mozilla.javascript.NativeContinuation", bl, true);
        if (bl2) {
            object = context.getE4xImplementationFactory().getImplementationClassName();
            new LazilyLoadedCtor(scriptableObject, "XML", (String)object, bl, true);
            new LazilyLoadedCtor(scriptableObject, "XMLList", (String)object, bl, true);
            new LazilyLoadedCtor(scriptableObject, "Namespace", (String)object, bl, true);
            new LazilyLoadedCtor(scriptableObject, "QName", (String)object, bl, true);
        }
        if (context.getLanguageVersion() >= 180 && context.hasFeature(14) || context.getLanguageVersion() >= 200) {
            new LazilyLoadedCtor(scriptableObject, "ArrayBuffer", "org.mozilla.javascript.typedarrays.NativeArrayBuffer", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Int8Array", "org.mozilla.javascript.typedarrays.NativeInt8Array", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Uint8Array", "org.mozilla.javascript.typedarrays.NativeUint8Array", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Uint8ClampedArray", "org.mozilla.javascript.typedarrays.NativeUint8ClampedArray", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Int16Array", "org.mozilla.javascript.typedarrays.NativeInt16Array", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Uint16Array", "org.mozilla.javascript.typedarrays.NativeUint16Array", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Int32Array", "org.mozilla.javascript.typedarrays.NativeInt32Array", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Uint32Array", "org.mozilla.javascript.typedarrays.NativeUint32Array", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Float32Array", "org.mozilla.javascript.typedarrays.NativeFloat32Array", bl, true);
            new LazilyLoadedCtor(scriptableObject, "Float64Array", "org.mozilla.javascript.typedarrays.NativeFloat64Array", bl, true);
            new LazilyLoadedCtor(scriptableObject, "DataView", "org.mozilla.javascript.typedarrays.NativeDataView", bl, true);
        }
        if (context.getLanguageVersion() >= 200) {
            NativeSymbol.init(context, scriptableObject, bl);
            NativeCollectionIterator.init(scriptableObject, "Set Iterator", bl);
            NativeCollectionIterator.init(scriptableObject, "Map Iterator", bl);
            NativeMap.init(context, scriptableObject, bl);
            NativePromise.init(context, scriptableObject, bl);
            NativeSet.init(context, scriptableObject, bl);
            NativeWeakMap.init(scriptableObject, bl);
            NativeWeakSet.init(scriptableObject, bl);
            NativeBigInt.init(scriptableObject, bl);
        }
        if (scriptableObject instanceof TopLevel) {
            ((TopLevel)scriptableObject).cacheBuiltins(scriptableObject, bl);
        }
        return scriptableObject;
    }

    public static void initScript(NativeFunction nativeFunction, Scriptable scriptable, Context object, Scriptable scriptable2, boolean bl) {
        if (((Context)object).topCallScope != null) {
            int n2 = nativeFunction.getParamAndVarCount();
            if (n2 != 0) {
                int n3;
                scriptable = scriptable2;
                while (true) {
                    n3 = n2;
                    if (!(scriptable instanceof NativeWith)) break;
                    scriptable = scriptable.getParentScope();
                }
                while (true) {
                    n2 = n3 - 1;
                    if (n3 == 0) break;
                    object = nativeFunction.getParamOrVarName(n2);
                    boolean bl2 = nativeFunction.getParamOrVarConst(n2);
                    if (!ScriptableObject.hasProperty(scriptable2, (String)object)) {
                        if (bl2) {
                            ScriptableObject.defineConstProperty(scriptable, (String)object);
                        } else if (!bl) {
                            if (!(nativeFunction instanceof InterpretedFunction) || ((InterpretedFunction)nativeFunction).hasFunctionNamed((String)object)) {
                                ScriptableObject.defineProperty(scriptable, (String)object, Undefined.instance, 4);
                            }
                        } else {
                            scriptable.put((String)object, scriptable, Undefined.instance);
                        }
                    } else {
                        ScriptableObject.redefineProperty(scriptable2, (String)object, bl2);
                    }
                    n3 = n2;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static ScriptableObject initStandardObjects(Context stringArray, ScriptableObject scriptableObject, boolean bl) {
        scriptableObject = ScriptRuntime.initSafeStandardObjects((Context)stringArray, scriptableObject, bl);
        new LazilyLoadedCtor(scriptableObject, "Packages", "org.mozilla.javascript.NativeJavaTopPackage", bl, true);
        new LazilyLoadedCtor(scriptableObject, "getClass", "org.mozilla.javascript.NativeJavaTopPackage", bl, true);
        new LazilyLoadedCtor(scriptableObject, "JavaAdapter", "org.mozilla.javascript.JavaAdapter", bl, true);
        new LazilyLoadedCtor(scriptableObject, "JavaImporter", "org.mozilla.javascript.ImporterTopLevel", bl, true);
        stringArray = ScriptRuntime.getTopPackageNames();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            new LazilyLoadedCtor(scriptableObject, stringArray[i2], "org.mozilla.javascript.NativeJavaTopPackage", bl, true);
        }
        return scriptableObject;
    }

    public static boolean instanceOf(Object object, Object object2, Context context) {
        if (object2 instanceof Scriptable) {
            if (!(object instanceof Scriptable)) {
                return false;
            }
            return ((Scriptable)object2).hasInstance((Scriptable)object);
        }
        throw ScriptRuntime.typeErrorById("msg.instanceof.not.object", new Object[0]);
    }

    private static boolean isArrayLike(Scriptable scriptable) {
        boolean bl = scriptable != null && (scriptable instanceof NativeArray || scriptable instanceof Arguments || ScriptableObject.hasProperty(scriptable, "length"));
        return bl;
    }

    public static boolean isArrayObject(Object object) {
        boolean bl = object instanceof NativeArray || object instanceof Arguments;
        return bl;
    }

    static boolean isGeneratedScript(String string) {
        boolean bl = string.indexOf("(eval)") >= 0 || string.indexOf("(Function)") >= 0;
        return bl;
    }

    public static boolean isIteratorDone(Context context, Object object) {
        if (!(object instanceof Scriptable)) {
            return false;
        }
        return ScriptRuntime.toBoolean(ScriptRuntime.getObjectProp((Scriptable)object, "done", context));
    }

    public static boolean isJSLineTerminator(int n2) {
        boolean bl = false;
        if ((0xDFD0 & n2) != 0) {
            return false;
        }
        if (n2 == 10 || n2 == 13 || n2 == 8232 || n2 == 8233) {
            bl = true;
        }
        return bl;
    }

    public static boolean isJSWhitespaceOrLineTerminator(int n2) {
        boolean bl = ScriptRuntime.isStrWhiteSpaceChar(n2) || ScriptRuntime.isJSLineTerminator(n2);
        return bl;
    }

    public static boolean isNaN(Object object) {
        if (object instanceof Double) {
            return ((Double)object).isNaN();
        }
        if (object instanceof Float) {
            return ((Float)object).isNaN();
        }
        return false;
    }

    public static boolean isObject(Object object) {
        boolean bl = false;
        if (object == null) {
            return false;
        }
        if (Undefined.isUndefined(object)) {
            return false;
        }
        if (object instanceof ScriptableObject) {
            if ("object".equals(object = ((ScriptableObject)object).getTypeOf()) || "function".equals(object)) {
                bl = true;
            }
            return bl;
        }
        if (object instanceof Scriptable) {
            return object instanceof Callable ^ true;
        }
        return false;
    }

    public static boolean isPrimitive(Object object) {
        boolean bl = object == null || Undefined.isUndefined(object) || object instanceof Number || object instanceof String || object instanceof Boolean;
        return bl;
    }

    public static boolean isRhinoRuntimeType(Class<?> clazz) {
        boolean bl = clazz.isPrimitive();
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl) {
            bl2 = bl3;
            if (clazz != Character.TYPE) {
                bl2 = true;
            }
            return bl2;
        }
        if (clazz == StringClass || clazz == BooleanClass || NumberClass.isAssignableFrom(clazz) || ScriptableClass.isAssignableFrom(clazz)) {
            bl2 = true;
        }
        return bl2;
    }

    static boolean isSpecialProperty(String string) {
        boolean bl = string.equals("__proto__") || string.equals("__parent__");
        return bl;
    }

    static boolean isStrWhiteSpaceChar(int n2) {
        boolean bl;
        boolean bl2 = bl = true;
        if (n2 != 32) {
            bl2 = bl;
            if (n2 != 160) {
                bl2 = bl;
                if (n2 != 65279) {
                    bl2 = bl;
                    if (n2 != 8232) {
                        bl2 = bl;
                        if (n2 != 8233) {
                            bl2 = bl;
                            switch (n2) {
                                default: {
                                    bl2 = Character.getType(n2) == 12 ? bl : false;
                                }
                                case 9: 
                                case 10: 
                                case 11: 
                                case 12: 
                                case 13: 
                            }
                        }
                    }
                }
            }
        }
        return bl2;
    }

    static boolean isSymbol(Object object) {
        boolean bl = object instanceof NativeSymbol && ((NativeSymbol)object).isSymbol() || object instanceof SymbolKey;
        return bl;
    }

    static boolean isValidIdentifierName(String string, Context context, boolean bl) {
        int n2 = string.length();
        if (n2 == 0) {
            return false;
        }
        if (!Character.isJavaIdentifierStart(string.charAt(0))) {
            return false;
        }
        for (int i2 = 1; i2 != n2; ++i2) {
            if (Character.isJavaIdentifierPart(string.charAt(i2))) continue;
            return false;
        }
        return TokenStream.isKeyword(string, context.getLanguageVersion(), bl) ^ true;
    }

    private static boolean isVisible(Context object, Object object2) {
        boolean bl = (object = ((Context)object).getClassShutter()) == null || object.visibleToScripts(object2.getClass().getName());
        return bl;
    }

    public static boolean jsDelegatesTo(Scriptable scriptable, Scriptable scriptable2) {
        Scriptable scriptable3;
        while ((scriptable3 = scriptable.getPrototype()) != null) {
            scriptable = scriptable3;
            if (!scriptable3.equals(scriptable2)) continue;
            return true;
        }
        return false;
    }

    public static Scriptable lastStoredScriptable(Context context) {
        Scriptable scriptable = context.scratchScriptable;
        context.scratchScriptable = null;
        return scriptable;
    }

    public static long lastUint32Result(Context context) {
        long l2 = context.scratchUint32;
        if (l2 >>> 32 == 0L) {
            return l2;
        }
        throw new IllegalStateException();
    }

    public static Scriptable leaveDotQuery(Scriptable scriptable) {
        return ((NativeWith)scriptable).getParentScope();
    }

    public static Scriptable leaveWith(Scriptable scriptable) {
        return ((NativeWith)scriptable).getParentScope();
    }

    public static Number leftShift(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            try {
                int n2 = ((BigInteger)number2).intValueExact();
                number = ((BigInteger)number).shiftLeft(n2);
                return number;
            }
            catch (ArithmeticException arithmeticException) {
                throw ScriptRuntime.rangeErrorById("msg.bigint.out.of.range.arithmetic", new Object[0]);
            }
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return (double)(ScriptRuntime.toInt32(number.doubleValue()) << ScriptRuntime.toInt32(number2.doubleValue()));
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean loadFromIterable(Context object, Scriptable object2, Object object3, BiConsumer<Object, Object> biConsumer) {
        if (object3 == null) return false;
        if (Undefined.isUndefined(object3)) {
            return false;
        }
        if (Undefined.isUndefined(object3 = ScriptRuntime.callIterator(object3, (Context)object, (Scriptable)object2))) {
            return false;
        }
        IteratorLikeIterable iteratorLikeIterable = new IteratorLikeIterable((Context)object, (Scriptable)object2, object3);
        try {
            Iterator iterator = iteratorLikeIterable.iterator();
            while (iterator.hasNext()) {
                object3 = ScriptableObject.ensureScriptable(iterator.next());
                if (!(object3 instanceof Symbol)) {
                    object2 = object3.get(0, (Scriptable)object3);
                    Object object4 = Scriptable.NOT_FOUND;
                    object = object2;
                    if (object2 == object4) {
                        object = Undefined.instance;
                    }
                    object2 = object3 = object3.get(1, (Scriptable)object3);
                    if (object3 == object4) {
                        object2 = Undefined.instance;
                    }
                    biConsumer.accept(object, object2);
                    continue;
                }
                throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(object3));
            }
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    iteratorLikeIterable.close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    throwable.addSuppressed(throwable3);
                }
                throw throwable2;
            }
        }
        iteratorLikeIterable.close();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static String makeUrlForGeneratedScript(boolean bl, String string, int n2) {
        StringBuilder stringBuilder;
        if (bl) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append('#');
            stringBuilder.append(n2);
            string = "(eval)";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append('#');
            stringBuilder.append(n2);
            string = "(Function)";
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static Ref memberRef(Object object, Object object2, Object object3, Context context, int n2) {
        if (object instanceof XMLObject) {
            return ((XMLObject)object).memberRef(context, object2, object3, n2);
        }
        throw ScriptRuntime.notXmlError(object);
    }

    public static Ref memberRef(Object object, Object object2, Context context, int n2) {
        if (object instanceof XMLObject) {
            return ((XMLObject)object).memberRef(context, object2, n2);
        }
        throw ScriptRuntime.notXmlError(object);
    }

    public static Number multiply(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            return ((BigInteger)number).multiply((BigInteger)number2);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            double d2 = number.doubleValue();
            return number2.doubleValue() * d2;
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    public static Object name(Context object, Scriptable scriptable, String string) {
        Scriptable scriptable2 = scriptable.getParentScope();
        if (scriptable2 == null) {
            if ((object = ScriptRuntime.topScopeName((Context)object, scriptable, string)) != Scriptable.NOT_FOUND) {
                return object;
            }
            throw ScriptRuntime.notFoundError(scriptable, string);
        }
        return ScriptRuntime.nameOrFunction((Context)object, scriptable, scriptable2, string, false);
    }

    @Deprecated
    public static Object nameIncrDecr(Scriptable scriptable, String string, int n2) {
        return ScriptRuntime.nameIncrDecr(scriptable, string, Context.getContext(), n2);
    }

    public static Object nameIncrDecr(Scriptable scriptable, String string, Context context, int n2) {
        Object object = scriptable;
        do {
            scriptable = object;
            if (context.useDynamicScope) {
                scriptable = object;
                if (object.getParentScope() == null) {
                    scriptable = ScriptRuntime.checkDynamicScope(context.topCallScope, (Scriptable)object);
                }
            }
            object = scriptable;
            while (!(object instanceof NativeWith) || !(object.getPrototype() instanceof XMLObject)) {
                Object object2 = object.get(string, scriptable);
                if (object2 != Scriptable.NOT_FOUND) {
                    return ScriptRuntime.doScriptableIncrDecr((Scriptable)object, string, scriptable, object2, n2);
                }
                object = object2 = object.getPrototype();
                if (object2 != null) continue;
            }
        } while ((object = scriptable.getParentScope()) != null);
        throw ScriptRuntime.notFoundError(null, string);
    }

    private static Object nameOrFunction(Context context, Scriptable object, Scriptable object2, String string, boolean bl) {
        Object object3 = null;
        Object object4 = object;
        while (true) {
            Object object5;
            Object object6;
            block18: {
                block15: {
                    block16: {
                        block17: {
                            block12: {
                                block13: {
                                    block14: {
                                        if (!(object4 instanceof NativeWith)) break block12;
                                        object6 = object4.getPrototype();
                                        if (!(object6 instanceof XMLObject)) break block13;
                                        object4 = (XMLObject)object6;
                                        if (!((IdScriptableObject)object4).has(string, (Scriptable)object4)) break block14;
                                        object2 = ((IdScriptableObject)object4).get(string, (Scriptable)object4);
                                        object = object4;
                                        break block15;
                                    }
                                    object5 = object3;
                                    if (object3 != null) break block16;
                                    object5 = object4;
                                    break block16;
                                }
                                object4 = ScriptableObject.getProperty((Scriptable)object6, string);
                                object5 = object3;
                                if (object4 == Scriptable.NOT_FOUND) break block16;
                                object = object6;
                                object2 = object4;
                                break block15;
                            }
                            if (!(object4 instanceof NativeCall)) break block17;
                            object4 = object4.get(string, (Scriptable)object4);
                            object5 = object3;
                            if (object4 == Scriptable.NOT_FOUND) break block16;
                            if (bl) {
                                object = ScriptableObject.getTopLevelScope((Scriptable)object2);
                            }
                            object2 = object4;
                            break block15;
                        }
                        object6 = ScriptableObject.getProperty((Scriptable)object4, string);
                        object5 = object3;
                        if (object6 == Scriptable.NOT_FOUND) break block16;
                        object2 = object6;
                        object = object4;
                        break block15;
                    }
                    if ((object6 = object2.getParentScope()) != null) break block18;
                    object = object4 = ScriptRuntime.topScopeName(context, (Scriptable)object2, string);
                    if (object4 == Scriptable.NOT_FOUND) {
                        if (object5 != null && !bl) {
                            object = ((IdScriptableObject)object5).get(string, (Scriptable)object5);
                        } else {
                            throw ScriptRuntime.notFoundError((Scriptable)object2, string);
                        }
                    }
                    object4 = object2;
                    object2 = object;
                    object = object4;
                }
                if (bl) {
                    if (object2 instanceof Callable) {
                        ScriptRuntime.storeScriptable(context, (Scriptable)object);
                    } else {
                        throw ScriptRuntime.notFunctionError(object2, string);
                    }
                }
                return object2;
            }
            object3 = object5;
            object4 = object2;
            object2 = object6;
        }
    }

    public static Ref nameRef(Object object, Object object2, Context context, Scriptable scriptable, int n2) {
        return ScriptRuntime.currentXMLLib(context).nameRef(context, object, object2, scriptable, n2);
    }

    public static Ref nameRef(Object object, Context context, Scriptable scriptable, int n2) {
        return ScriptRuntime.currentXMLLib(context).nameRef(context, object, scriptable, n2);
    }

    public static Number negate(Number number) {
        if (number instanceof BigInteger) {
            return ((BigInteger)number).negate();
        }
        return -number.doubleValue();
    }

    public static Scriptable newArrayLiteral(Object[] objectArray, int[] nArray, Context object, Scriptable scriptable) {
        int n2;
        int n3;
        int n4 = objectArray.length;
        int n5 = nArray != null ? nArray.length : 0;
        int n6 = n4 + n5;
        if (n6 > 1 && n5 * 2 < n6) {
            if (n5 != 0) {
                Object[] objectArray2 = new Object[n6];
                n4 = 0;
                n3 = 0;
                for (n2 = 0; n2 != n6; ++n2) {
                    if (n4 != n5 && nArray[n4] == n2) {
                        objectArray2[n2] = Scriptable.NOT_FOUND;
                        ++n4;
                        continue;
                    }
                    objectArray2[n2] = objectArray[n3];
                    ++n3;
                }
                objectArray = objectArray2;
            }
            return ((Context)object).newArray(scriptable, objectArray);
        }
        object = ((Context)object).newArray(scriptable, n6);
        n2 = 0;
        n4 = 0;
        for (n3 = 0; n3 != n6; ++n3) {
            if (n2 != n5 && nArray[n2] == n3) {
                ++n2;
                continue;
            }
            object.put(n3, (Scriptable)object, objectArray[n4]);
            ++n4;
        }
        return object;
    }

    public static Scriptable newBuiltinObject(Context context, Scriptable objectArray, TopLevel$Builtins object, Object[] objectArray2) {
        Scriptable scriptable = ScriptableObject.getTopLevelScope((Scriptable)objectArray);
        object = TopLevel.getBuiltinCtor(context, scriptable, (TopLevel$Builtins)((Object)object));
        objectArray = objectArray2;
        if (objectArray2 == null) {
            objectArray = emptyArgs;
        }
        return object.construct(context, scriptable, objectArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Scriptable newCatchScope(Throwable var0, Scriptable var1_1, String var2_2, Context var3_3, Scriptable var4_4) {
        block22: {
            block17: {
                block18: {
                    block21: {
                        block20: {
                            block19: {
                                var6_5 = var0 instanceof JavaScriptException;
                                var5_6 = 0;
                                if (!var6_5) break block19;
                                var1_1 = ((JavaScriptException)var0).getValue();
                                break block17;
                            }
                            if (var1_1 != null) {
                                var1_1 = var7_7 /* !! */  = ((NativeObject)var1_1).getAssociatedValue(var0);
                                if (var7_7 /* !! */  == null) {
                                    Kit.codeBug();
                                    var1_1 = var7_7 /* !! */ ;
                                }
lbl13:
                                // 4 sources

                                while (true) {
                                    var5_6 = 1;
                                    break block17;
                                    break;
                                }
                            }
                            if (var0 instanceof EcmaError) {
                                var1_1 = (EcmaError)var0;
                                var7_7 /* !! */  = TopLevel$NativeErrors.valueOf(var1_1.getName());
                                var8_8 /* !! */  = var1_1.getErrorMessage();
lbl20:
                                // 3 sources

                                while (true) {
                                    var9_9 = var8_8 /* !! */ ;
                                    var8_8 /* !! */  = null;
                                    break block18;
                                    break;
                                }
                            }
                            if (!(var0 instanceof WrappedException)) break block20;
                            var10_10 = (WrappedException)var0;
                            var8_8 /* !! */  = var10_10.getWrappedException();
                            if (!ScriptRuntime.isVisible(var3_3, var8_8 /* !! */ )) {
                                var7_7 /* !! */  = TopLevel$NativeErrors.InternalError;
                                var1_1 = var8_8 /* !! */ .getMessage();
                            } else {
                                var7_7 /* !! */  = TopLevel$NativeErrors.JavaException;
                                var1_1 = new StringBuilder();
                                var1_1.append(var8_8 /* !! */ .getClass().getName());
                                var1_1.append(": ");
                                var1_1.append(var8_8 /* !! */ .getMessage());
                                var1_1 = var1_1.toString();
                            }
                            var9_9 = var1_1;
                            var1_1 = var10_10;
                            break block18;
                        }
                        if (!(var0 instanceof EvaluatorException)) break block21;
                        var1_1 = (EvaluatorException)var0;
                        var7_7 /* !! */  = TopLevel$NativeErrors.InternalError;
                        var8_8 /* !! */  = var1_1.getMessage();
                        ** GOTO lbl20
                    }
                    if (var3_3.hasFeature(13)) {
                        var1_1 = new WrappedException(var0);
                        var7_7 /* !! */  = TopLevel$NativeErrors.JavaException;
                        var8_8 /* !! */  = var0.toString();
                        ** continue;
                    }
                    break block22;
                }
                var11_11 = var1_1.sourceName();
                var10_10 = var11_11;
                if (var11_11 == null) {
                    var10_10 = "";
                }
                if ((var5_6 = var1_1.lineNumber()) > 0) {
                    var11_11 = new Object[]{var9_9, var10_10, var5_6};
                    var9_9 = var11_11;
                } else {
                    var11_11 = new Object[]{var9_9, var10_10};
                    var9_9 = var11_11;
                }
                var7_7 /* !! */  = ScriptRuntime.newNativeError(var3_3, var4_4, (TopLevel$NativeErrors)var7_7 /* !! */ , var9_9);
                if (var7_7 /* !! */  instanceof NativeError) {
                    ((NativeError)var7_7 /* !! */ ).setStackProvider((RhinoException)var1_1);
                }
                if (var8_8 /* !! */  != null && ScriptRuntime.isVisible(var3_3, var8_8 /* !! */ )) {
                    ScriptableObject.defineProperty((Scriptable)var7_7 /* !! */ , "javaException", var3_3.getWrapFactory().wrap(var3_3, var4_4, var8_8 /* !! */ , null), 7);
                }
                if (ScriptRuntime.isVisible(var3_3, var1_1)) {
                    ScriptableObject.defineProperty((Scriptable)var7_7 /* !! */ , "rhinoException", var3_3.getWrapFactory().wrap(var3_3, var4_4, var1_1, null), 7);
                }
                var1_1 = var7_7 /* !! */ ;
                ** while (true)
            }
            var7_7 /* !! */  = new NativeObject();
            if (var2_2 != null) {
                var7_7 /* !! */ .defineProperty(var2_2, var1_1, 4);
            }
            if (ScriptRuntime.isVisible(var3_3, var0)) {
                var7_7 /* !! */ .defineProperty("__exception__", Context.javaToJS(var0, var4_4), 6);
            }
            if (var5_6 != 0) {
                var7_7 /* !! */ .associateValue(var0, var1_1);
            }
            return var7_7 /* !! */ ;
        }
        throw Kit.codeBug();
    }

    static Scriptable newNativeError(Context context, Scriptable objectArray, TopLevel$NativeErrors object, Object[] objectArray2) {
        Scriptable scriptable = ScriptableObject.getTopLevelScope((Scriptable)objectArray);
        object = TopLevel.getNativeErrorCtor(context, scriptable, (TopLevel$NativeErrors)((Object)object));
        objectArray = objectArray2;
        if (objectArray2 == null) {
            objectArray = emptyArgs;
        }
        return object.construct(context, scriptable, objectArray);
    }

    public static Scriptable newObject(Object object, Context context, Scriptable scriptable, Object[] objectArray) {
        if (object instanceof Function) {
            return ((Function)object).construct(context, scriptable, objectArray);
        }
        throw ScriptRuntime.notFunctionError(object);
    }

    public static Scriptable newObject(Context context, Scriptable objectArray, String object, Object[] objectArray2) {
        Scriptable scriptable = ScriptableObject.getTopLevelScope((Scriptable)objectArray);
        object = ScriptRuntime.getExistingCtor(context, scriptable, (String)object);
        objectArray = objectArray2;
        if (objectArray2 == null) {
            objectArray = emptyArgs;
        }
        return object.construct(context, scriptable, objectArray);
    }

    @Deprecated
    public static Scriptable newObjectLiteral(Object[] objectArray, Object[] objectArray2, Context context, Scriptable scriptable) {
        return ScriptRuntime.newObjectLiteral(objectArray, objectArray2, null, context, scriptable);
    }

    public static Scriptable newObjectLiteral(Object[] objectArray, Object[] objectArray2, int[] nArray, Context context, Scriptable scriptable) {
        Scriptable scriptable2 = context.newObject(scriptable);
        int n2 = objectArray == null ? 0 : objectArray.length;
        for (int i2 = 0; i2 != n2; ++i2) {
            Object object;
            Object object2 = objectArray[i2];
            int n3 = nArray == null ? 0 : nArray[i2];
            Object object3 = objectArray2[i2];
            if (n3 == 0) {
                if (object2 instanceof Symbol) {
                    object = (Symbol)object2;
                    ((SymbolScriptable)((Object)scriptable2)).put((Symbol)object, scriptable2, object3);
                    continue;
                }
                if (object2 instanceof Integer) {
                    scriptable2.put((Integer)object2, scriptable2, object3);
                    continue;
                }
                object = ScriptRuntime.toString(object2);
                if (ScriptRuntime.isSpecialProperty((String)object)) {
                    ScriptRuntime.specialRef(scriptable2, (String)object, context, scriptable).set(context, scriptable, object3);
                    continue;
                }
                scriptable2.put((String)object, scriptable2, object3);
                continue;
            }
            object = (ScriptableObject)scriptable2;
            Callable callable = (Callable)object3;
            boolean bl = true;
            if (n3 != 1) {
                bl = false;
            }
            object3 = object2 instanceof String ? (String)object2 : null;
            n3 = object3 == null ? (Integer)object2 : 0;
            ((ScriptableObject)object).setGetterOrSetter((String)object3, n3, callable, bl);
        }
        return scriptable2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object newSpecial(Context context, Object object, Object[] objectArray, Scriptable scriptable, int n2) {
        if (n2 == 1) {
            if (!NativeGlobal.isEvalFunction(object)) return ScriptRuntime.newObject(object, context, scriptable, objectArray);
            throw ScriptRuntime.typeErrorById("msg.not.ctor", "eval");
        }
        if (n2 != 2) throw Kit.codeBug();
        if (!NativeWith.isWithFunction(object)) return ScriptRuntime.newObject(object, context, scriptable, objectArray);
        return NativeWith.newWithSpecial(context, scriptable, objectArray);
    }

    public static RuntimeException notFoundError(Scriptable scriptable, String string) {
        throw ScriptRuntime.constructError("ReferenceError", ScriptRuntime.getMessageById("msg.is.not.defined", string));
    }

    public static RuntimeException notFunctionError(Object object) {
        return ScriptRuntime.notFunctionError(object, object);
    }

    public static RuntimeException notFunctionError(Object object, Object object2) {
        object2 = object2 == null ? "null" : object2.toString();
        if (object == Scriptable.NOT_FOUND) {
            return ScriptRuntime.typeErrorById("msg.function.not.found", object2);
        }
        return ScriptRuntime.typeErrorById("msg.isnt.function", object2, ScriptRuntime.typeof(object));
    }

    public static RuntimeException notFunctionError(Object object, Object object2, String string) {
        String string2;
        String string3 = string2 = ScriptRuntime.toString(object);
        if (object instanceof NativeFunction) {
            int n2 = string2.indexOf(123, string2.indexOf(41));
            string3 = string2;
            if (n2 > -1) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string2.substring(0, n2 + 1));
                ((StringBuilder)object).append("...}");
                string3 = ((StringBuilder)object).toString();
            }
        }
        if (object2 == Scriptable.NOT_FOUND) {
            return ScriptRuntime.typeErrorById("msg.function.not.found.in", string, string3);
        }
        return ScriptRuntime.typeErrorById("msg.isnt.function.in", string, string3, ScriptRuntime.typeof(object2));
    }

    private static RuntimeException notXmlError(Object object) {
        throw ScriptRuntime.typeErrorById("msg.isnt.xml.object", ScriptRuntime.toString(object));
    }

    public static String numberToString(double d2, int n2) {
        if (n2 >= 2 && n2 <= 36) {
            if (Double.isNaN(d2)) {
                return "NaN";
            }
            if (d2 == Double.POSITIVE_INFINITY) {
                return "Infinity";
            }
            if (d2 == Double.NEGATIVE_INFINITY) {
                return "-Infinity";
            }
            if (d2 == 0.0) {
                return "0";
            }
            if (n2 != 10) {
                return DToA.JS_dtobasestr(n2, d2);
            }
            CharSequence charSequence = FastDtoa.numberToString(d2);
            if (charSequence != null) {
                return charSequence;
            }
            charSequence = new StringBuilder();
            DToA.JS_dtostr((StringBuilder)charSequence, 0, 0, d2);
            return ((StringBuilder)charSequence).toString();
        }
        throw Context.reportRuntimeErrorById("msg.bad.radix", Integer.toString(n2));
    }

    public static Object[] padAndRestArguments(Context context, Scriptable scriptable, Object[] objectArray, int n2) {
        Object[] objectArray2 = new Object[n2];
        if (objectArray.length < --n2) {
            System.arraycopy(objectArray, 0, objectArray2, 0, objectArray.length);
            Arrays.fill(objectArray2, objectArray.length, n2, Undefined.instance);
        } else {
            System.arraycopy(objectArray, 0, objectArray2, 0, n2);
        }
        if (objectArray.length > n2) {
            int n3 = objectArray.length - n2;
            Object[] objectArray3 = new Object[n3];
            System.arraycopy(objectArray, n2, objectArray3, 0, n3);
            objectArray = objectArray3;
        } else {
            objectArray = emptyArgs;
        }
        objectArray2[n2] = context.newArray(scriptable, objectArray);
        return objectArray2;
    }

    public static Object[] padArguments(Object[] objectArray, int n2) {
        if (n2 < objectArray.length) {
            return objectArray;
        }
        Object[] objectArray2 = new Object[n2];
        System.arraycopy(objectArray, 0, objectArray2, 0, objectArray.length);
        if (objectArray.length < n2) {
            Arrays.fill(objectArray2, objectArray.length, n2, Undefined.instance);
        }
        return objectArray2;
    }

    @Deprecated
    public static Object propIncrDecr(Object object, String string, Context context, int n2) {
        return ScriptRuntime.propIncrDecr(object, string, context, ScriptRuntime.getTopCallScope(context), n2);
    }

    public static Object propIncrDecr(Object object, String string, Context object2, Scriptable object3, int n2) {
        if ((object2 = ScriptRuntime.toObjectOrNull((Context)object2, object, (Scriptable)object3)) != null) {
            object = object2;
            do {
                if ((object3 = object.get(string, (Scriptable)object2)) != Scriptable.NOT_FOUND) {
                    return ScriptRuntime.doScriptableIncrDecr((Scriptable)object, string, (Scriptable)object2, object3, n2);
                }
                object = object3 = object.getPrototype();
            } while (object3 != null);
            object = NaNobj;
            object2.put(string, (Scriptable)object2, object);
            return object;
        }
        throw ScriptRuntime.undefReadError(object, string);
    }

    public static EcmaError rangeError(String string) {
        return ScriptRuntime.constructError("RangeError", string);
    }

    public static EcmaError rangeErrorById(String string, Object ... objectArray) {
        return ScriptRuntime.rangeError(ScriptRuntime.getMessageById(string, objectArray));
    }

    public static Object refDel(Ref ref, Context context) {
        return ScriptRuntime.wrapBoolean(ref.delete(context));
    }

    public static Object refGet(Ref ref, Context context) {
        return ref.get(context);
    }

    @Deprecated
    public static Object refIncrDecr(Ref ref, Context context, int n2) {
        return ScriptRuntime.refIncrDecr(ref, context, ScriptRuntime.getTopCallScope(context), n2);
    }

    public static Object refIncrDecr(Ref ref, Context context, Scriptable scriptable, int n2) {
        Object object = ref.get(context);
        boolean bl = (n2 & 2) != 0;
        Number number = object instanceof Number ? (Number)((Number)object) : (Number)ScriptRuntime.toNumeric(object);
        boolean bl2 = number instanceof BigInteger;
        n2 &= 1;
        if (bl2) {
            object = n2 == 0 ? ((BigInteger)number).add(BigInteger.ONE) : ((BigInteger)number).subtract(BigInteger.ONE);
        } else {
            double d2 = number.doubleValue();
            d2 = n2 == 0 ? (d2 += 1.0) : (d2 -= 1.0);
            object = d2;
        }
        ref.set(context, scriptable, object);
        if (bl) {
            return number;
        }
        return object;
    }

    @Deprecated
    public static Object refSet(Ref ref, Object object, Context context) {
        return ScriptRuntime.refSet(ref, object, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Object refSet(Ref ref, Object object, Context context, Scriptable scriptable) {
        return ref.set(context, scriptable, object);
    }

    public static Number remainder(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            if (!number2.equals(BigInteger.ZERO)) {
                return ((BigInteger)number).remainder((BigInteger)number2);
            }
            throw ScriptRuntime.rangeErrorById("msg.division.zero", new Object[0]);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return number.doubleValue() % number2.doubleValue();
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    public static boolean same(Object object, Object object2) {
        if (!ScriptRuntime.typeof(object).equals(ScriptRuntime.typeof(object2))) {
            return false;
        }
        if (object instanceof Number) {
            if (ScriptRuntime.isNaN(object) && ScriptRuntime.isNaN(object2)) {
                return true;
            }
            return object.equals(object2);
        }
        return ScriptRuntime.eq(object, object2);
    }

    public static boolean sameZero(Object object, Object object2) {
        if (!ScriptRuntime.typeof(object).equals(ScriptRuntime.typeof(object2))) {
            return false;
        }
        if (object instanceof BigInteger) {
            return object.equals(object2);
        }
        if (object instanceof Number) {
            if (ScriptRuntime.isNaN(object) && ScriptRuntime.isNaN(object2)) {
                return true;
            }
            double d2 = ((Number)object).doubleValue();
            if (object2 instanceof Number) {
                double d3 = ((Number)object2).doubleValue();
                double d4 = negativeZero;
                if (d2 == d4 && d3 == 0.0 || d2 == 0.0 && d3 == d4) {
                    return true;
                }
            }
            return ScriptRuntime.eqNumber(d2, object2);
        }
        return ScriptRuntime.eq(object, object2);
    }

    public static Object searchDefaultNamespace(Context object) {
        NativeCall nativeCall = ((Context)object).currentActivationCall;
        Object object2 = nativeCall;
        if (nativeCall == null) {
            object2 = ScriptRuntime.getTopCallScope((Context)object);
        }
        while (true) {
            block9: {
                block8: {
                    block7: {
                        if ((object = object2.getParentScope()) != null) break block7;
                        object = object2 = ScriptableObject.getProperty((Scriptable)object2, DEFAULT_NS_TAG);
                        if (object2 == Scriptable.NOT_FOUND) {
                            return null;
                        }
                        break block8;
                    }
                    if ((object2 = object2.get(DEFAULT_NS_TAG, (Scriptable)object2)) == Scriptable.NOT_FOUND) break block9;
                    object = object2;
                }
                return object;
            }
            object2 = object;
        }
    }

    public static void setBuiltinProtoAndParent(ScriptableObject scriptableObject, Scriptable scriptable, TopLevel$Builtins topLevel$Builtins) {
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        scriptableObject.setParentScope(scriptable);
        scriptableObject.setPrototype(TopLevel.getBuiltinPrototype(scriptable, topLevel$Builtins));
    }

    public static Object setConst(Scriptable scriptable, Object object, Context context, String string) {
        if (scriptable instanceof XMLObject) {
            scriptable.put(string, scriptable, object);
        } else {
            ScriptableObject.putConstProperty(scriptable, string, object);
        }
        return object;
    }

    public static Object setDefaultNamespace(Object object, Context context) {
        NativeCall nativeCall = context.currentActivationCall;
        Scriptable scriptable = nativeCall;
        if (nativeCall == null) {
            scriptable = ScriptRuntime.getTopCallScope(context);
        }
        object = ScriptRuntime.currentXMLLib(context).toDefaultXmlNamespace(context, object);
        if (!scriptable.has(DEFAULT_NS_TAG, scriptable)) {
            ScriptableObject.defineProperty(scriptable, DEFAULT_NS_TAG, object, 6);
        } else {
            scriptable.put(DEFAULT_NS_TAG, scriptable, object);
        }
        return Undefined.instance;
    }

    public static void setEnumNumbers(Object object, boolean bl) {
        ((ScriptRuntime$IdEnumeration)object).enumNumbers = bl;
    }

    public static void setFunctionProtoAndParent(BaseFunction baseFunction, Context context, Scriptable scriptable) {
        ScriptRuntime.setFunctionProtoAndParent(baseFunction, context, scriptable, false);
    }

    public static void setFunctionProtoAndParent(BaseFunction baseFunction, Context context, Scriptable scriptable, boolean bl) {
        baseFunction.setParentScope(scriptable);
        scriptable = bl ? ScriptableObject.getGeneratorFunctionPrototype(scriptable) : ScriptableObject.getFunctionPrototype(scriptable);
        baseFunction.setPrototype(scriptable);
        if (context != null && context.getLanguageVersion() >= 200) {
            baseFunction.setStandardPropertyAttributes(3);
        }
    }

    @Deprecated
    public static void setFunctionProtoAndParent(BaseFunction baseFunction, Scriptable scriptable) {
        ScriptRuntime.setFunctionProtoAndParent(baseFunction, Context.getCurrentContext(), scriptable, false);
    }

    @Deprecated
    public static void setFunctionProtoAndParent(BaseFunction baseFunction, Scriptable scriptable, boolean bl) {
        ScriptRuntime.setFunctionProtoAndParent(baseFunction, Context.getCurrentContext(), scriptable, bl);
    }

    public static Object setName(Scriptable scriptable, Object object, Context context, Scriptable scriptable2, String string) {
        if (scriptable != null) {
            ScriptableObject.putProperty(scriptable, string, object);
        } else {
            if (context.hasFeature(11) || context.hasFeature(8)) {
                Context.reportWarning(ScriptRuntime.getMessageById("msg.assn.create.strict", string));
            }
            scriptable = scriptable2 = ScriptableObject.getTopLevelScope(scriptable2);
            if (context.useDynamicScope) {
                scriptable = ScriptRuntime.checkDynamicScope(context.topCallScope, scriptable2);
            }
            scriptable.put(string, scriptable, object);
        }
        return object;
    }

    @Deprecated
    public static Object setObjectElem(Object object, Object object2, Object object3, Context context) {
        return ScriptRuntime.setObjectElem(object, object2, object3, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Object setObjectElem(Object object, Object object2, Object object3, Context context, Scriptable scriptable) {
        if ((scriptable = ScriptRuntime.toObjectOrNull(context, object, scriptable)) != null) {
            return ScriptRuntime.setObjectElem(scriptable, object2, object3, context);
        }
        throw ScriptRuntime.undefWriteError(object, object2, object3);
    }

    public static Object setObjectElem(Scriptable scriptable, Object object, Object object2, Context object3) {
        if (scriptable instanceof XMLObject) {
            ((XMLObject)scriptable).put((Context)object3, object, object2);
        } else if (ScriptRuntime.isSymbol(object)) {
            ScriptableObject.putProperty(scriptable, (Symbol)object, object2);
        } else {
            object = ScriptRuntime.toStringIdOrIndex(object);
            object3 = ((ScriptRuntime$StringIdOrIndex)object).stringId;
            if (object3 == null) {
                ScriptableObject.putProperty(scriptable, ((ScriptRuntime$StringIdOrIndex)object).index, object2);
            } else {
                ScriptableObject.putProperty(scriptable, (String)object3, object2);
            }
        }
        return object2;
    }

    @Deprecated
    public static Object setObjectIndex(Object object, double d2, Object object2, Context context) {
        return ScriptRuntime.setObjectIndex(object, d2, object2, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Object setObjectIndex(Object object, double d2, Object object2, Context context, Scriptable scriptable) {
        if ((scriptable = ScriptRuntime.toObjectOrNull(context, object, scriptable)) != null) {
            int n2 = (int)d2;
            if ((double)n2 == d2 && n2 >= 0) {
                return ScriptRuntime.setObjectIndex(scriptable, n2, object2, context);
            }
            return ScriptRuntime.setObjectProp(scriptable, ScriptRuntime.toString(d2), object2, context);
        }
        throw ScriptRuntime.undefWriteError(object, String.valueOf(d2), object2);
    }

    public static Object setObjectIndex(Scriptable scriptable, int n2, Object object, Context context) {
        ScriptableObject.putProperty(scriptable, n2, object);
        return object;
    }

    @Deprecated
    public static Object setObjectProp(Object object, String string, Object object2, Context context) {
        return ScriptRuntime.setObjectProp(object, string, object2, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Object setObjectProp(Object object, String string, Object object2, Context context, Scriptable scriptable) {
        if (!(object instanceof Scriptable) && context.isStrictMode() && context.getLanguageVersion() >= 180) {
            throw ScriptRuntime.undefWriteError(object, string, object2);
        }
        if ((scriptable = ScriptRuntime.toObjectOrNull(context, object, scriptable)) != null) {
            return ScriptRuntime.setObjectProp(scriptable, string, object2, context);
        }
        throw ScriptRuntime.undefWriteError(object, string, object2);
    }

    public static Object setObjectProp(Scriptable scriptable, String string, Object object, Context context) {
        ScriptableObject.putProperty(scriptable, string, object);
        return object;
    }

    public static void setObjectProtoAndParent(ScriptableObject scriptableObject, Scriptable scriptable) {
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        scriptableObject.setParentScope(scriptable);
        scriptableObject.setPrototype(ScriptableObject.getClassPrototype(scriptable, scriptableObject.getClassName()));
    }

    public static void setRegExpProxy(Context context, RegExpProxy regExpProxy) {
        if (regExpProxy != null) {
            context.regExpProxy = regExpProxy;
            return;
        }
        throw new IllegalArgumentException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean shallowEq(Object object, Object object2) {
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        if (object == object2) {
            if (object instanceof Number) return Double.isNaN(((Number)object).doubleValue()) ^ true;
            return true;
        }
        if (object != null && object != Undefined.instance && object != Undefined.SCRIPTABLE_UNDEFINED) {
            boolean bl4 = object instanceof BigInteger;
            if (bl4) {
                if (!(object2 instanceof BigInteger)) return false;
                return object.equals(object2);
            }
            if (object instanceof Number && !bl4) {
                if (!(object2 instanceof Number)) return false;
                if (object2 instanceof BigInteger) return false;
                if (((Number)object).doubleValue() != ((Number)object2).doubleValue()) return false;
                return bl3;
            }
            if (object instanceof CharSequence) {
                if (!(object2 instanceof CharSequence)) return false;
                return object.toString().equals(object2.toString());
            }
            if (object instanceof Boolean) {
                if (!(object2 instanceof Boolean)) return false;
                return object.equals(object2);
            }
            if (object instanceof Scriptable) {
                if (object instanceof Wrapper && object2 instanceof Wrapper) {
                    if (((Wrapper)object).unwrap() != ((Wrapper)object2).unwrap()) return false;
                    return bl;
                }
                Object object3 = object;
                if (object instanceof Delegator) {
                    object = ((Delegator)object).getDelegee();
                    if (object2 instanceof Delegator) {
                        return ScriptRuntime.shallowEq(object, ((Delegator)object2).getDelegee());
                    }
                    object3 = object;
                    if (object == object2) {
                        return true;
                    }
                }
                if (!(object2 instanceof Delegator)) return false;
                if (((Delegator)object2).getDelegee() != object3) return false;
                return true;
            }
            ScriptRuntime.warnAboutNonJSObject(object);
            if (object != object2) return false;
            return bl2;
        }
        Object object4 = Undefined.instance;
        if (object == object4) {
            if (object2 == Undefined.SCRIPTABLE_UNDEFINED) return true;
        }
        if (object != Undefined.SCRIPTABLE_UNDEFINED) return false;
        if (object2 != object4) return false;
        return true;
    }

    public static Number signedRightShift(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            try {
                int n2 = ((BigInteger)number2).intValueExact();
                number = ((BigInteger)number).shiftRight(n2);
                return number;
            }
            catch (ArithmeticException arithmeticException) {
                throw ScriptRuntime.rangeErrorById("msg.bigint.out.of.range.arithmetic", new Object[0]);
            }
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return (double)(ScriptRuntime.toInt32(number.doubleValue()) >> ScriptRuntime.toInt32(number2.doubleValue()));
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    @Deprecated
    public static Ref specialRef(Object object, String string, Context context) {
        return ScriptRuntime.specialRef(object, string, context, ScriptRuntime.getTopCallScope(context));
    }

    public static Ref specialRef(Object object, String string, Context context, Scriptable scriptable) {
        return SpecialRef.createSpecial(context, scriptable, object, string);
    }

    private static void storeScriptable(Context context, Scriptable scriptable) {
        if (context.scratchScriptable == null) {
            context.scratchScriptable = scriptable;
            return;
        }
        throw new IllegalStateException();
    }

    public static void storeUint32Result(Context context, long l2) {
        if (l2 >>> 32 == 0L) {
            context.scratchUint32 = l2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Object strictSetName(Scriptable object, Object object2, Context context, Scriptable scriptable, String string) {
        if (object != null) {
            ScriptableObject.putProperty((Scriptable)object, string, object2);
            return object2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Assignment to undefined \"");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("\" in strict mode");
        throw ScriptRuntime.constructError("ReferenceError", ((StringBuilder)object).toString());
    }

    static double stringPrefixToNumber(String string, int n2, int n3) {
        return ScriptRuntime.stringToNumber(string, n2, string.length() - 1, n3, true);
    }

    static double stringToNumber(String string, int n2, int n3, int n4) {
        return ScriptRuntime.stringToNumber(string, n2, n3, n4, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static double stringToNumber(String string, int n2, int n3, int n4, boolean bl) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = n4 < 10 ? (int)((char)(n4 + 48 - 1)) : 57;
        if (n4 > 10) {
            n8 = (char)(n4 + 97 - 10);
            n7 = (char)(n4 + 65 - 10);
        } else {
            n8 = 97;
            n7 = 65;
        }
        double d2 = 0.0;
        for (n6 = n2; n6 <= n3; ++n6) {
            block26: {
                block23: {
                    block25: {
                        block24: {
                            block22: {
                                n5 = string.charAt(n6);
                                if (48 > n5 || n5 > n9) break block22;
                                n5 -= 48;
                                break block23;
                            }
                            if (97 > n5 || n5 >= n8) break block24;
                            n5 -= 97;
                            break block25;
                        }
                        if (65 > n5 || n5 >= n7) break block26;
                        n5 -= 65;
                    }
                    n5 += 10;
                }
                d2 = d2 * (double)n4 + (double)n5;
                continue;
            }
            if (bl) break;
            return Double.NaN;
        }
        if (n2 == n6) {
            return Double.NaN;
        }
        double d3 = d2;
        if (!(d2 > 9.007199254740991E15)) return d3;
        if (n4 == 10) {
            try {
                return Double.parseDouble(string.substring(n2, n6));
            }
            catch (NumberFormatException numberFormatException) {
                return Double.NaN;
            }
        }
        if (n4 != 2 && n4 != 4 && n4 != 8 && n4 != 16) {
            d3 = d2;
            if (n4 != 32) return d3;
        }
        int n10 = 53;
        n3 = 1;
        n9 = 0;
        n5 = 0;
        n7 = 0;
        double d4 = 0.0;
        int n11 = 0;
        int n12 = n2;
        while (true) {
            int n13;
            int n14;
            int n15;
            int n16;
            block32: {
                block27: {
                    block28: {
                        block29: {
                            block31: {
                                block30: {
                                    n16 = n12;
                                    n2 = n3;
                                    if (n3 == 1) {
                                        if (n12 == n6) {
                                            if (n9 == 0) {
                                                return 0.0;
                                            }
                                            if (n9 != 3) {
                                                if (n9 != 4) break;
                                                d3 = d2;
                                                if (n5 == 0) return d3 * d4;
                                            } else {
                                                d3 = d2;
                                                if ((n5 & n7) == 0) return d3 * d4;
                                            }
                                            d3 = d2 + 1.0;
                                            return d3 * d4;
                                        }
                                        n2 = string.charAt(n12);
                                        n2 = 48 <= n2 && n2 <= 57 ? (n2 -= 48) : (97 <= n2 && n2 <= 122 ? (n2 -= 87) : (n2 -= 55));
                                        n11 = n2;
                                        n16 = n12 + 1;
                                        n2 = n4;
                                    }
                                    n3 = (n11 & (n15 = n2 >> 1)) != 0 ? 1 : 0;
                                    if (n9 == 0) break block27;
                                    if (n9 == 1) break block28;
                                    if (n9 == 2) break block29;
                                    if (n9 == 3) break block30;
                                    n2 = n9;
                                    if (n9 == 4) break block31;
                                    n8 = n10;
                                    n2 = n9;
                                    n14 = n5;
                                    n13 = n7;
                                    d3 = d4;
                                    break block32;
                                }
                                n2 = n9;
                                if (n3 != 0) {
                                    n2 = 4;
                                }
                            }
                            d3 = d4 * 2.0;
                            n8 = n10;
                            n14 = n5;
                            n13 = n7;
                            break block32;
                        }
                        d3 = 2.0;
                        n2 = 3;
                        n8 = n10;
                        n14 = n3;
                        n13 = n7;
                        break block32;
                    }
                    double d5 = d2 *= 2.0;
                    if (n3 != 0) {
                        d5 = d2 + 1.0;
                    }
                    n8 = --n10;
                    n2 = n9;
                    n14 = n5;
                    n13 = n7;
                    d2 = d5;
                    d3 = d4;
                    if (n10 == 0) {
                        n2 = 2;
                        n8 = n10;
                        n14 = n5;
                        n13 = n3;
                        d2 = d5;
                        d3 = d4;
                    }
                    break block32;
                }
                n8 = n10;
                n2 = n9;
                n14 = n5;
                n13 = n7;
                d3 = d4;
                if (n3 != 0) {
                    n8 = n10 - 1;
                    d2 = 1.0;
                    n2 = 1;
                    d3 = d4;
                    n13 = n7;
                    n14 = n5;
                }
            }
            n12 = n16;
            n10 = n8;
            n3 = n15;
            n9 = n2;
            n5 = n14;
            n7 = n13;
            d4 = d3;
        }
        d3 = d2;
        return d3;
    }

    public static Number subtract(Number number, Number number2) {
        boolean bl = number instanceof BigInteger;
        if (bl && number2 instanceof BigInteger) {
            return ((BigInteger)number).subtract((BigInteger)number2);
        }
        if (!bl && !(number2 instanceof BigInteger)) {
            return number.doubleValue() - number2.doubleValue();
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    public static EcmaError syntaxError(String string) {
        return ScriptRuntime.constructError("SyntaxError", string);
    }

    public static EcmaError syntaxErrorById(String string, Object ... objectArray) {
        return ScriptRuntime.syntaxError(ScriptRuntime.getMessageById(string, objectArray));
    }

    public static long testUint32String(String string) {
        int n2 = string.length();
        long l2 = -1L;
        if (1 <= n2 && n2 <= 10) {
            int n3 = string.charAt(0) - 48;
            if (n3 == 0) {
                if (n2 == 1) {
                    l2 = 0L;
                }
                return l2;
            }
            if (1 <= n3 && n3 <= 9) {
                l2 = n3;
                for (int i2 = 1; i2 != n2; ++i2) {
                    n3 = string.charAt(i2) - 48;
                    if (n3 >= 0 && n3 <= 9) {
                        l2 = l2 * 10L + (long)n3;
                        continue;
                    }
                    return -1L;
                }
                if (l2 >>> 32 == 0L) {
                    return l2;
                }
            }
        }
        return -1L;
    }

    public static JavaScriptException throwCustomError(Context context, Scriptable scriptable, String string, String string2) {
        int[] nArray = new int[]{0};
        String string3 = Context.getSourcePositionFromStack(nArray);
        return new JavaScriptException(context.newObject(scriptable, string, new Object[]{string2, string3, nArray[0]}), string3, nArray[0]);
    }

    public static JavaScriptException throwError(Context context, Scriptable scriptable, String string) {
        int[] nArray = new int[]{0};
        String string2 = Context.getSourcePositionFromStack(nArray);
        return new JavaScriptException(ScriptRuntime.newBuiltinObject(context, scriptable, TopLevel$Builtins.Error, new Object[]{string, string2, nArray[0]}), string2, nArray[0]);
    }

    public static BigInteger toBigInt(Object object) {
        block11: {
            block12: {
                block13: {
                    Object object2;
                    while (true) {
                        if (object instanceof BigInteger) {
                            return (BigInteger)object;
                        }
                        if (object instanceof BigDecimal) {
                            return ((BigDecimal)object).toBigInteger();
                        }
                        if (object instanceof Number) {
                            if (object instanceof Long) {
                                return BigInteger.valueOf((Long)object);
                            }
                            double d2 = ((Number)object).doubleValue();
                            if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
                                object2 = new BigDecimal(d2, MathContext.UNLIMITED);
                                try {
                                    object2 = ((BigDecimal)object2).toBigIntegerExact();
                                    return object2;
                                }
                                catch (ArithmeticException arithmeticException) {
                                    throw ScriptRuntime.rangeErrorById("msg.cant.convert.to.bigint.isnt.integer", ScriptRuntime.toString(object));
                                }
                            }
                            throw ScriptRuntime.rangeErrorById("msg.cant.convert.to.bigint.isnt.integer", ScriptRuntime.toString(object));
                        }
                        if (object == null || Undefined.isUndefined(object)) break block11;
                        if (object instanceof String) {
                            return ScriptRuntime.toBigInt((String)object);
                        }
                        if (object instanceof CharSequence) {
                            return ScriptRuntime.toBigInt(object.toString());
                        }
                        if (object instanceof Boolean) {
                            object = (Boolean)object != false ? BigInteger.ONE : BigInteger.ZERO;
                            return object;
                        }
                        if (object instanceof Symbol) break block12;
                        if (!(object instanceof Scriptable)) break block13;
                        object = object2 = ((Scriptable)object).getDefaultValue(BigIntegerClass);
                        if (!(object2 instanceof Scriptable)) continue;
                        if (!ScriptRuntime.isSymbol(object2)) break;
                        object = object2;
                    }
                    throw ScriptRuntime.errorWithClassName("msg.primitive.expected", object2);
                }
                ScriptRuntime.warnAboutNonJSObject(object);
                return BigInteger.ZERO;
            }
            throw ScriptRuntime.typeErrorById("msg.cant.convert.to.bigint", ScriptRuntime.toString(object));
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.bigint", ScriptRuntime.toString(object));
    }

    public static BigInteger toBigInt(String object) {
        int n2 = ((String)object).length();
        int n3 = 0;
        while (n3 != n2) {
            int n4 = ((String)object).charAt(n3);
            if (!ScriptRuntime.isStrWhiteSpaceChar(n4)) {
                int n5;
                --n2;
                while (ScriptRuntime.isStrWhiteSpaceChar(((String)object).charAt(n2))) {
                    --n2;
                }
                if (n4 == 48 && (n5 = n3 + 2) <= n2) {
                    n4 = ((String)object).charAt(n3 + 1);
                    n4 = n4 != 120 && n4 != 88 ? (n4 != 111 && n4 != 79 ? (n4 != 98 && n4 != 66 ? -1 : 2) : 8) : 16;
                    if (n4 != -1) {
                        try {
                            object = new BigInteger(((String)object).substring(n5, n2 + 1), n4);
                            return object;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw ScriptRuntime.syntaxErrorById("msg.bigint.bad.form", new Object[0]);
                        }
                    }
                }
                object = ((String)object).substring(n3, n2 + 1);
                for (n4 = ((String)object).length() - 1; n4 >= 0; --n4) {
                    n3 = ((String)object).charAt(n4);
                    if (n4 == 0 && (n3 == 43 || n3 == 45) || 48 <= n3 && n3 <= 57) {
                        continue;
                    }
                    throw ScriptRuntime.syntaxErrorById("msg.bigint.bad.form", new Object[0]);
                }
                try {
                    object = new BigInteger((String)object);
                    return object;
                }
                catch (NumberFormatException numberFormatException) {
                    throw ScriptRuntime.syntaxErrorById("msg.bigint.bad.form", new Object[0]);
                }
            }
            ++n3;
        }
        return BigInteger.ZERO;
    }

    public static boolean toBoolean(Object object) {
        block10: {
            block11: {
                Object object2;
                while (true) {
                    if (object instanceof Boolean) {
                        return (Boolean)object;
                    }
                    boolean bl = false;
                    boolean bl2 = false;
                    if (object == null || Undefined.isUndefined(object)) break block10;
                    if (object instanceof CharSequence) {
                        if (((CharSequence)object).length() != 0) {
                            bl2 = true;
                        }
                        return bl2;
                    }
                    if (object instanceof BigInteger) {
                        return BigInteger.ZERO.equals(object) ^ true;
                    }
                    if (object instanceof Number) {
                        double d2 = ((Number)object).doubleValue();
                        bl2 = bl;
                        if (!Double.isNaN(d2)) {
                            bl2 = bl;
                            if (d2 != 0.0) {
                                bl2 = true;
                            }
                        }
                        return bl2;
                    }
                    if (!(object instanceof Scriptable)) break block11;
                    if (object instanceof ScriptableObject && ((ScriptableObject)object).avoidObjectDetection()) {
                        return false;
                    }
                    if (Context.getContext().isVersionECMA1()) {
                        return true;
                    }
                    object = object2 = ((Scriptable)object).getDefaultValue(BooleanClass);
                    if (!(object2 instanceof Scriptable)) continue;
                    if (!ScriptRuntime.isSymbol(object2)) break;
                    object = object2;
                }
                throw ScriptRuntime.errorWithClassName("msg.primitive.expected", object2);
            }
            ScriptRuntime.warnAboutNonJSObject(object);
            return true;
        }
        return false;
    }

    public static CharSequence toCharSequence(Object object) {
        if (object instanceof NativeString) {
            return ((NativeString)object).toCharSequence();
        }
        object = object instanceof CharSequence ? (CharSequence)object : ScriptRuntime.toString(object);
        return object;
    }

    public static int toIndex(Object object) {
        if (Undefined.isUndefined(object)) {
            return 0;
        }
        double d2 = ScriptRuntime.toInteger(object);
        if (!(d2 < 0.0)) {
            double d3 = Math.min(d2, 9.007199254740991E15);
            if (d2 == d3) {
                return (int)d3;
            }
            throw ScriptRuntime.rangeError("index out of range");
        }
        throw ScriptRuntime.rangeError("index out of range");
    }

    public static int toInt32(double d2) {
        return DoubleConversion.doubleToInt32(d2);
    }

    public static int toInt32(Object object) {
        if (object instanceof Integer) {
            return (Integer)object;
        }
        return ScriptRuntime.toInt32(ScriptRuntime.toNumber(object));
    }

    public static int toInt32(Object[] objectArray, int n2) {
        n2 = n2 < objectArray.length ? ScriptRuntime.toInt32(objectArray[n2]) : 0;
        return n2;
    }

    public static double toInteger(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0;
        }
        double d3 = d2 - 0.0;
        double d4 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
        double d5 = d2;
        if (d4 != false) {
            if (Double.isInfinite(d2)) {
                d5 = d2;
            } else {
                if (d4 > 0) {
                    return Math.floor(d2);
                }
                d5 = Math.ceil(d2);
            }
        }
        return d5;
    }

    public static double toInteger(Object object) {
        return ScriptRuntime.toInteger(ScriptRuntime.toNumber(object));
    }

    public static double toInteger(Object[] objectArray, int n2) {
        double d2 = n2 < objectArray.length ? ScriptRuntime.toInteger(objectArray[n2]) : 0.0;
        return d2;
    }

    public static Scriptable toIterator(Context object, Scriptable scriptable, Scriptable scriptable2, boolean bl) {
        if (ScriptableObject.hasProperty(scriptable2, "__iterator__")) {
            Object object2 = ScriptableObject.getProperty(scriptable2, "__iterator__");
            if (object2 instanceof Callable) {
                Callable callable = (Callable)object2;
                if ((object = callable.call((Context)object, scriptable, scriptable2, new Object[]{object2 = bl ? Boolean.TRUE : Boolean.FALSE})) instanceof Scriptable) {
                    return (Scriptable)object;
                }
                throw ScriptRuntime.typeErrorById("msg.iterator.primitive", new Object[0]);
            }
            throw ScriptRuntime.typeErrorById("msg.invalid.iterator", new Object[0]);
        }
        return null;
    }

    public static long toLength(Object[] objectArray, int n2) {
        double d2 = ScriptRuntime.toInteger(objectArray, n2);
        if (d2 <= 0.0) {
            return 0L;
        }
        return (long)Math.min(d2, 9.007199254740991E15);
    }

    public static double toNumber(Object object) {
        while (!(object instanceof BigInteger)) {
            if (object instanceof Number) {
                return ((Number)object).doubleValue();
            }
            double d2 = 0.0;
            if (object == null) {
                return 0.0;
            }
            if (Undefined.isUndefined(object)) {
                return Double.NaN;
            }
            if (object instanceof String) {
                return ScriptRuntime.toNumber((String)object);
            }
            if (object instanceof CharSequence) {
                return ScriptRuntime.toNumber(object.toString());
            }
            if (object instanceof Boolean) {
                if (((Boolean)object).booleanValue()) {
                    d2 = 1.0;
                }
                return d2;
            }
            if (!(object instanceof Symbol)) {
                if (object instanceof Scriptable) {
                    Object object2;
                    object = object2 = ((Scriptable)object).getDefaultValue(NumberClass);
                    if (!(object2 instanceof Scriptable)) continue;
                    if (ScriptRuntime.isSymbol(object2)) {
                        object = object2;
                        continue;
                    }
                    throw ScriptRuntime.errorWithClassName("msg.primitive.expected", object2);
                }
                ScriptRuntime.warnAboutNonJSObject(object);
                return Double.NaN;
            }
            throw ScriptRuntime.typeErrorById("msg.not.a.number", new Object[0]);
        }
        throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
    }

    public static double toNumber(String string) {
        int n2 = string.length();
        int n3 = 0;
        while (true) {
            block19: {
                int n4;
                block20: {
                    char c2;
                    block22: {
                        block21: {
                            char c3;
                            if (n3 == n2) {
                                return 0.0;
                            }
                            c2 = string.charAt(n3);
                            if (ScriptRuntime.isStrWhiteSpaceChar(c2)) break block19;
                            n4 = n2 - 1;
                            while (ScriptRuntime.isStrWhiteSpaceChar(c3 = string.charAt(n4))) {
                                --n4;
                            }
                            Context context = Context.getCurrentContext();
                            char c4 = context != null && context.getLanguageVersion() >= 200 ? (char)'\u0000' : '\u0001';
                            int n5 = 16;
                            if (c2 == '0') {
                                int n6 = n3 + 2;
                                if (n6 <= n4) {
                                    char c5 = string.charAt(n3 + 1);
                                    n2 = n5;
                                    if (c5 != 'x') {
                                        n2 = c5 == 'X' ? n5 : (c4 == '\u0000' && (c5 == 'o' || c5 == 'O') ? 8 : (c4 == '\u0000' && (c5 == 'b' || c5 == 'B') ? 2 : -1));
                                    }
                                    if (n2 != -1) {
                                        if (c4 != '\u0000') {
                                            return ScriptRuntime.stringPrefixToNumber(string, n6, n2);
                                        }
                                        return ScriptRuntime.stringToNumber(string, n6, n4, n2);
                                    }
                                }
                            } else if (!(c4 == '\u0000' || c2 != '+' && c2 != '-' || (n2 = n3 + 3) > n4 || string.charAt(n3 + 1) != '0' || (c4 = string.charAt(n3 + 2)) != 'x' && c4 != 'X')) {
                                double d2;
                                double d3 = d2 = ScriptRuntime.stringPrefixToNumber(string, n2, 16);
                                if (c2 == '-') {
                                    d3 = -d2;
                                }
                                return d3;
                            }
                            if (c3 != 'y') break block20;
                            if (c2 == '+') break block21;
                            n2 = n3;
                            if (c2 != '-') break block22;
                        }
                        n2 = n3 + 1;
                    }
                    if (n2 + 7 == n4 && string.regionMatches(n2, "Infinity", 0, 8)) {
                        double d4 = c2 == '-' ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                        return d4;
                    }
                    return Double.NaN;
                }
                string = string.substring(n3, n4 + 1);
                for (n2 = string.length() - 1; n2 >= 0; --n2) {
                    n3 = string.charAt(n2);
                    if (48 <= n3 && n3 <= 57 || n3 == 46 || n3 == 101 || n3 == 69 || n3 == 43 || n3 == 45) continue;
                    return Double.NaN;
                }
                try {
                    double d5 = Double.parseDouble(string);
                    return d5;
                }
                catch (NumberFormatException numberFormatException) {
                    return Double.NaN;
                }
            }
            ++n3;
        }
    }

    public static double toNumber(Object[] objectArray, int n2) {
        double d2 = n2 < objectArray.length ? ScriptRuntime.toNumber(objectArray[n2]) : Double.NaN;
        return d2;
    }

    public static Number toNumeric(Object object) {
        if (object instanceof Number) {
            return (Number)object;
        }
        return ScriptRuntime.toNumber(object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Scriptable toObject(Context object, Scriptable scriptable, Object object2) {
        block12: {
            void var2_4;
            block8: {
                block11: {
                    block10: {
                        block9: {
                            block7: {
                                if (object2 == null) {
                                    throw ScriptRuntime.typeErrorById("msg.null.to.object", new Object[0]);
                                }
                                if (Undefined.isUndefined(object2)) {
                                    throw ScriptRuntime.typeErrorById("msg.undef.to.object", new Object[0]);
                                }
                                if (!ScriptRuntime.isSymbol(object2)) break block7;
                                object = object2 instanceof SymbolKey ? new NativeSymbol((SymbolKey)object2) : new NativeSymbol((NativeSymbol)object2);
                                TopLevel$Builtins topLevel$Builtins = TopLevel$Builtins.Symbol;
                                break block8;
                            }
                            if (object2 instanceof Scriptable) {
                                return (Scriptable)object2;
                            }
                            if (!(object2 instanceof CharSequence)) break block9;
                            object = new NativeString((CharSequence)object2);
                            TopLevel$Builtins topLevel$Builtins = TopLevel$Builtins.String;
                            break block8;
                        }
                        if (((Context)object).getLanguageVersion() < 200 || !(object2 instanceof BigInteger)) break block10;
                        object = new NativeBigInt((BigInteger)object2);
                        TopLevel$Builtins topLevel$Builtins = TopLevel$Builtins.BigInt;
                        break block8;
                    }
                    if (!(object2 instanceof Number)) break block11;
                    object = new NativeNumber(((Number)object2).doubleValue());
                    TopLevel$Builtins topLevel$Builtins = TopLevel$Builtins.Number;
                    break block8;
                }
                if (!(object2 instanceof Boolean)) break block12;
                object = new NativeBoolean((Boolean)object2);
                TopLevel$Builtins topLevel$Builtins = TopLevel$Builtins.Boolean;
            }
            ScriptRuntime.setBuiltinProtoAndParent((ScriptableObject)object, scriptable, (TopLevel$Builtins)var2_4);
            return object;
        }
        if ((object = ((Context)object).getWrapFactory().wrap((Context)object, scriptable, object2, null)) instanceof Scriptable) {
            return (Scriptable)object;
        }
        throw ScriptRuntime.errorWithClassName("msg.invalid.type", object2);
    }

    @Deprecated
    public static Scriptable toObject(Context context, Scriptable scriptable, Object object, Class<?> clazz) {
        return ScriptRuntime.toObject(context, scriptable, object);
    }

    public static Scriptable toObject(Scriptable scriptable, Object object) {
        if (object instanceof Scriptable) {
            return (Scriptable)object;
        }
        return ScriptRuntime.toObject(Context.getContext(), scriptable, object);
    }

    @Deprecated
    public static Scriptable toObject(Scriptable scriptable, Object object, Class<?> clazz) {
        if (object instanceof Scriptable) {
            return (Scriptable)object;
        }
        return ScriptRuntime.toObject(Context.getContext(), scriptable, object);
    }

    @Deprecated
    public static Scriptable toObjectOrNull(Context context, Object object) {
        if (object instanceof Scriptable) {
            return (Scriptable)object;
        }
        if (object != null && !Undefined.isUndefined(object)) {
            return ScriptRuntime.toObject(context, ScriptRuntime.getTopCallScope(context), object);
        }
        return null;
    }

    public static Scriptable toObjectOrNull(Context context, Object object, Scriptable scriptable) {
        if (object instanceof Scriptable) {
            return (Scriptable)object;
        }
        if (object != null && !Undefined.isUndefined(object)) {
            return ScriptRuntime.toObject(context, scriptable, object);
        }
        return null;
    }

    public static Object toPrimitive(Object object) {
        return ScriptRuntime.toPrimitive(object, null);
    }

    public static Object toPrimitive(Object object, Class<?> clazz) {
        if (!(object instanceof Scriptable)) {
            return object;
        }
        if ((object = ((Scriptable)object).getDefaultValue(clazz)) instanceof Scriptable && !ScriptRuntime.isSymbol(object)) {
            throw ScriptRuntime.typeErrorById("msg.bad.default.value", new Object[0]);
        }
        return object;
    }

    public static String toString(double d2) {
        return ScriptRuntime.numberToString(d2, 10);
    }

    public static String toString(Object object) {
        block7: {
            block8: {
                Object object2;
                while (true) {
                    if (object == null) {
                        return "null";
                    }
                    if (Undefined.isUndefined(object)) {
                        return "undefined";
                    }
                    if (object instanceof String) {
                        return (String)object;
                    }
                    if (object instanceof CharSequence) {
                        return object.toString();
                    }
                    if (object instanceof BigInteger) {
                        return object.toString();
                    }
                    if (object instanceof Number) {
                        return ScriptRuntime.numberToString(((Number)object).doubleValue(), 10);
                    }
                    if (object instanceof Symbol) break block7;
                    if (!(object instanceof Scriptable)) break block8;
                    object = object2 = ((Scriptable)object).getDefaultValue(StringClass);
                    if (!(object2 instanceof Scriptable)) continue;
                    if (!ScriptRuntime.isSymbol(object2)) break;
                    object = object2;
                }
                throw ScriptRuntime.errorWithClassName("msg.primitive.expected", object2);
            }
            return object.toString();
        }
        throw ScriptRuntime.typeErrorById("msg.not.a.string", new Object[0]);
    }

    public static String toString(Object[] object, int n2) {
        object = n2 < ((Object[])object).length ? ScriptRuntime.toString(object[n2]) : "undefined";
        return object;
    }

    public static ScriptRuntime$StringIdOrIndex toStringIdOrIndex(Object object) {
        if (object instanceof Number) {
            double d2 = ((Number)object).doubleValue();
            if (d2 < 0.0) {
                return new ScriptRuntime$StringIdOrIndex(ScriptRuntime.toString(object));
            }
            int n2 = (int)d2;
            if ((double)n2 == d2) {
                return new ScriptRuntime$StringIdOrIndex(n2);
            }
            return new ScriptRuntime$StringIdOrIndex(ScriptRuntime.toString(object));
        }
        long l2 = ScriptRuntime.indexFromString((String)(object = object instanceof String ? (String)object : ScriptRuntime.toString(object)));
        if (l2 >= 0L && l2 <= Integer.MAX_VALUE) {
            return new ScriptRuntime$StringIdOrIndex((int)l2);
        }
        return new ScriptRuntime$StringIdOrIndex((String)object);
    }

    public static char toUint16(Object object) {
        return (char)DoubleConversion.doubleToInt32(ScriptRuntime.toNumber(object));
    }

    public static long toUint32(double d2) {
        return (long)DoubleConversion.doubleToInt32(d2) & 0xFFFFFFFFL;
    }

    public static long toUint32(Object object) {
        return ScriptRuntime.toUint32(ScriptRuntime.toNumber(object));
    }

    private static Object topScopeName(Context context, Scriptable scriptable, String string) {
        Scriptable scriptable2 = scriptable;
        if (context.useDynamicScope) {
            scriptable2 = ScriptRuntime.checkDynamicScope(context.topCallScope, scriptable);
        }
        return ScriptableObject.getProperty(scriptable2, string);
    }

    public static EcmaError typeError(String string) {
        return ScriptRuntime.constructError("TypeError", string);
    }

    @Deprecated
    public static EcmaError typeError0(String string) {
        return ScriptRuntime.typeError(ScriptRuntime.getMessage0(string));
    }

    @Deprecated
    public static EcmaError typeError1(String string, Object object) {
        return ScriptRuntime.typeError(ScriptRuntime.getMessage1(string, object));
    }

    @Deprecated
    public static EcmaError typeError2(String string, Object object, Object object2) {
        return ScriptRuntime.typeError(ScriptRuntime.getMessage2(string, object, object2));
    }

    @Deprecated
    public static EcmaError typeError3(String string, String string2, String string3, String string4) {
        return ScriptRuntime.typeError(ScriptRuntime.getMessage3(string, string2, string3, string4));
    }

    public static EcmaError typeErrorById(String string, Object ... objectArray) {
        return ScriptRuntime.typeError(ScriptRuntime.getMessageById(string, objectArray));
    }

    @Deprecated
    public static BaseFunction typeErrorThrower() {
        return ScriptRuntime.typeErrorThrower(Context.getCurrentContext());
    }

    public static BaseFunction typeErrorThrower(Context context) {
        if (context.typeErrorThrower == null) {
            ScriptRuntime$1 scriptRuntime$1 = new ScriptRuntime$1();
            ScriptRuntime.setFunctionProtoAndParent(scriptRuntime$1, context, context.topCallScope, false);
            scriptRuntime$1.preventExtensions();
            context.typeErrorThrower = scriptRuntime$1;
        }
        return context.typeErrorThrower;
    }

    public static String typeof(Object object) {
        String string = "object";
        if (object == null) {
            return "object";
        }
        if (object == Undefined.instance) {
            return "undefined";
        }
        if (object instanceof Delegator) {
            return ScriptRuntime.typeof(((Delegator)object).getDelegee());
        }
        if (object instanceof ScriptableObject) {
            return ((ScriptableObject)object).getTypeOf();
        }
        if (object instanceof Scriptable) {
            if (object instanceof Callable) {
                string = "function";
            }
            return string;
        }
        if (object instanceof CharSequence) {
            return "string";
        }
        if (object instanceof BigInteger) {
            return "bigint";
        }
        if (object instanceof Number) {
            return "number";
        }
        if (object instanceof Boolean) {
            return "boolean";
        }
        if (ScriptRuntime.isSymbol(object)) {
            return "symbol";
        }
        throw ScriptRuntime.errorWithClassName("msg.invalid.type", object);
    }

    public static String typeofName(Scriptable scriptable, String string) {
        Context context = Context.getContext();
        scriptable = ScriptRuntime.bind(context, scriptable, string);
        if (scriptable == null) {
            return "undefined";
        }
        return ScriptRuntime.typeof(ScriptRuntime.getObjectProp(scriptable, string, context));
    }

    public static RuntimeException undefCallError(Object object, Object object2) {
        return ScriptRuntime.typeErrorById("msg.undef.method.call", ScriptRuntime.toString(object), ScriptRuntime.toString(object2));
    }

    private static RuntimeException undefDeleteError(Object object, Object object2) {
        throw ScriptRuntime.typeErrorById("msg.undef.prop.delete", ScriptRuntime.toString(object), ScriptRuntime.toString(object2));
    }

    public static RuntimeException undefReadError(Object object, Object object2) {
        return ScriptRuntime.typeErrorById("msg.undef.prop.read", ScriptRuntime.toString(object), ScriptRuntime.toString(object2));
    }

    public static RuntimeException undefWriteError(Object object, Object object2, Object object3) {
        return ScriptRuntime.typeErrorById("msg.undef.prop.write", ScriptRuntime.toString(object), ScriptRuntime.toString(object2), ScriptRuntime.toString(object3));
    }

    static String uneval(Context object, Scriptable object2, Object object3) {
        if (object3 == null) {
            return "null";
        }
        if (Undefined.isUndefined(object3)) {
            return "undefined";
        }
        if (object3 instanceof CharSequence) {
            object = ScriptRuntime.escapeString(object3.toString());
            object2 = new StringBuilder(((String)object).length() + 2);
            ((StringBuilder)object2).append('\"');
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append('\"');
            return ((StringBuilder)object2).toString();
        }
        if (object3 instanceof Number) {
            double d2 = ((Number)object3).doubleValue();
            if (d2 == 0.0 && 1.0 / d2 < 0.0) {
                return "-0";
            }
            return ScriptRuntime.toString(d2);
        }
        if (object3 instanceof Boolean) {
            return ScriptRuntime.toString(object3);
        }
        if (object3 instanceof Scriptable) {
            Object object4;
            Scriptable scriptable = (Scriptable)object3;
            if (ScriptableObject.hasProperty(scriptable, "toSource") && (object4 = ScriptableObject.getProperty(scriptable, "toSource")) instanceof Function) {
                return ScriptRuntime.toString(((Function)object4).call((Context)object, (Scriptable)object2, scriptable, emptyArgs));
            }
            return ScriptRuntime.toString(object3);
        }
        ScriptRuntime.warnAboutNonJSObject(object3);
        return object3.toString();
    }

    public static Object updateDotQuery(boolean bl, Scriptable scriptable) {
        return ((NativeWith)scriptable).updateDotQuery(bl);
    }

    private static void warnAboutNonJSObject(Object object) {
        if (!"true".equals(ScriptRuntime.getMessageById("params.omit.non.js.object.warning", new Object[0]))) {
            object = ScriptRuntime.getMessageById("msg.non.js.object.warning", object, object.getClass().getName());
            Context.reportWarning((String)object);
            System.err.println((String)object);
        }
    }

    public static Boolean wrapBoolean(boolean bl) {
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public static Scriptable wrapException(Throwable var0, Scriptable var1_1, Context var2_2) {
        block15: {
            block13: {
                block14: {
                    if (var0 instanceof EcmaError) {
                        var6_3 = (EcmaError)var0;
                        var0 = var6_3.getName();
                        var4_4 = var6_3.getErrorMessage();
lbl5:
                        // 2 sources

                        while (true) {
                            var5_5 = var0;
                            var0 = null;
                            break block13;
                            break;
                        }
                    }
                    if (!(var0 instanceof WrappedException)) break block14;
                    var6_3 = (WrappedException)var0;
                    var0 = var6_3.getWrappedException();
                    var4_4 = new StringBuilder();
                    var4_4.append(var0.getClass().getName());
                    var4_4.append(": ");
                    var4_4.append(var0.getMessage());
                    var4_4 = var4_4.toString();
                    var5_5 = "JavaException";
                    break block13;
                }
                if (var0 instanceof EvaluatorException) {
                    var6_3 = (EvaluatorException)var0;
                    var4_4 = var6_3.getMessage();
                    var0 = "InternalError";
                    ** continue;
                }
                if (!var2_2.hasFeature(13)) break block15;
                var6_3 = new WrappedException((Throwable)var0);
                var4_4 = var0.toString();
                var5_5 = "JavaException";
                var0 = null;
            }
            var7_7 = var8_6 = var6_3.sourceName();
            if (var8_6 == null) {
                var7_7 = "";
            }
            if ((var3_8 = var6_3.lineNumber()) > 0) {
                var8_6 = new Object[]{var4_4, var7_7, var3_8};
                var4_4 = var8_6;
            } else {
                var8_6 = new Object[]{var4_4, var7_7};
                var4_4 = var8_6;
            }
            var4_4 = var2_2.newObject(var1_1, (String)var5_5, (Object[])var4_4);
            ScriptableObject.putProperty((Scriptable)var4_4, "name", var5_5);
            if (var4_4 instanceof NativeError) {
                ((NativeError)var4_4).setStackProvider(var6_3);
            }
            if (var0 != null && ScriptRuntime.isVisible(var2_2, var0)) {
                ScriptableObject.defineProperty((Scriptable)var4_4, "javaException", var2_2.getWrapFactory().wrap(var2_2, var1_1, var0, null), 7);
            }
            if (ScriptRuntime.isVisible(var2_2, var6_3)) {
                ScriptableObject.defineProperty((Scriptable)var4_4, "rhinoException", var2_2.getWrapFactory().wrap(var2_2, var1_1, var6_3, null), 7);
            }
            return var4_4;
        }
        throw Kit.codeBug();
    }

    public static Integer wrapInt(int n2) {
        return n2;
    }

    public static Number wrapNumber(double d2) {
        if (Double.isNaN(d2)) {
            return NaNobj;
        }
        return d2;
    }

    public static Scriptable wrapRegExp(Context context, Scriptable scriptable, Object object) {
        return context.getRegExpProxy().wrapRegExp(context, scriptable, object);
    }
}

