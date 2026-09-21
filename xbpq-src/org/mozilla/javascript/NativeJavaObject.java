/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.FieldAndMethods;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.InterfaceAdapter;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeDate;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaObject$JavaIterableIterator;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.SymbolScriptable;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.n;

public class NativeJavaObject
implements Scriptable,
SymbolScriptable,
Wrapper,
Serializable {
    private static final Object COERCED_INTERFACE_KEY;
    static final byte CONVERSION_NONE = 99;
    static final byte CONVERSION_NONTRIVIAL = 0;
    static final byte CONVERSION_TRIVIAL = 1;
    private static final int JSTYPE_BIGINT = 9;
    private static final int JSTYPE_BOOLEAN = 2;
    private static final int JSTYPE_JAVA_ARRAY = 7;
    private static final int JSTYPE_JAVA_CLASS = 5;
    private static final int JSTYPE_JAVA_OBJECT = 6;
    private static final int JSTYPE_NULL = 1;
    private static final int JSTYPE_NUMBER = 3;
    private static final int JSTYPE_OBJECT = 8;
    private static final int JSTYPE_STRING = 4;
    private static final int JSTYPE_UNDEFINED = 0;
    private static Method adapter_readAdapterObject;
    private static Method adapter_writeAdapterObject;
    private static final long serialVersionUID = -6948590651130498591L;
    private static Callable symbol_iterator;
    private transient Map<String, FieldAndMethods> fieldAndMethods;
    protected transient boolean isAdapter;
    protected transient Object javaObject;
    protected transient JavaMembers members;
    protected Scriptable parent;
    protected Scriptable prototype;
    protected transient Class<?> staticType;

    static {
        symbol_iterator = n.b;
        COERCED_INTERFACE_KEY = "Coerced Interface";
        Class[] classArray = new Class[2];
        Class<?> clazz = Kit.classOrNull("org.mozilla.javascript.JavaAdapter");
        if (clazz != null) {
            try {
                classArray[0] = ScriptRuntime.ObjectClass;
                classArray[1] = Kit.classOrNull("java.io.ObjectOutputStream");
                adapter_writeAdapterObject = clazz.getMethod("writeAdapterObject", classArray);
                classArray[0] = ScriptRuntime.ScriptableClass;
                classArray[1] = Kit.classOrNull("java.io.ObjectInputStream");
                adapter_readAdapterObject = clazz.getMethod("readAdapterObject", classArray);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                adapter_writeAdapterObject = null;
                adapter_readAdapterObject = null;
            }
        }
    }

    public NativeJavaObject() {
    }

    public NativeJavaObject(Scriptable scriptable, Object object, Class<?> clazz) {
        this(scriptable, object, clazz, false);
    }

    public NativeJavaObject(Scriptable scriptable, Object object, Class<?> clazz, boolean bl) {
        this.parent = scriptable;
        this.javaObject = object;
        this.staticType = clazz;
        this.isAdapter = bl;
        this.initMembers();
    }

    public static /* synthetic */ Object a(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeJavaObject.lambda$static$0(context, scriptable, scriptable2, objectArray);
    }

    public static boolean canConvert(Object object, Class<?> clazz) {
        boolean bl = NativeJavaObject.getConversionWeight(object, clazz) < 99;
        return bl;
    }

    private static Object coerceToNumber(Class<?> clazz, Object object) {
        Class<?> clazz2 = object.getClass();
        if (clazz != Character.TYPE && clazz != ScriptRuntime.CharacterClass) {
            if (clazz != ScriptRuntime.ObjectClass && clazz != ScriptRuntime.DoubleClass && clazz != Double.TYPE) {
                double d2;
                double d3;
                Class<?> clazz3 = ScriptRuntime.BigIntegerClass;
                if (clazz == clazz3) {
                    if (clazz2 == clazz3) {
                        return object;
                    }
                    return ScriptRuntime.toBigInt(object);
                }
                clazz3 = ScriptRuntime.FloatClass;
                if (clazz != clazz3 && clazz != Float.TYPE) {
                    clazz3 = ScriptRuntime.IntegerClass;
                    if (clazz != clazz3 && clazz != Integer.TYPE) {
                        clazz3 = ScriptRuntime.LongClass;
                        if (clazz != clazz3 && clazz != Long.TYPE) {
                            clazz3 = ScriptRuntime.ShortClass;
                            if (clazz != clazz3 && clazz != Short.TYPE) {
                                clazz3 = ScriptRuntime.ByteClass;
                                if (clazz != clazz3 && clazz != Byte.TYPE) {
                                    return NativeJavaObject.toDouble(object);
                                }
                                if (clazz2 == clazz3) {
                                    return object;
                                }
                                return (byte)NativeJavaObject.toInteger(object, clazz3, -128.0, 127.0);
                            }
                            if (clazz2 == clazz3) {
                                return object;
                            }
                            return (short)NativeJavaObject.toInteger(object, clazz3, -32768.0, 32767.0);
                        }
                        if (clazz2 == clazz3) {
                            return object;
                        }
                        double d4 = Double.longBitsToDouble(4890909195324358655L);
                        return NativeJavaObject.toInteger(object, clazz3, Double.longBitsToDouble(-4332462841530417152L), d4);
                    }
                    if (clazz2 == clazz3) {
                        return object;
                    }
                    return (int)NativeJavaObject.toInteger(object, clazz3, -2.147483648E9, 2.147483647E9);
                }
                if (clazz2 == clazz3) {
                    return object;
                }
                double d5 = NativeJavaObject.toDouble(object);
                if (!Double.isInfinite(d5) && !Double.isNaN(d5) && (d3 = (d2 = d5 - 0.0) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1)) != false) {
                    double d6 = Math.abs(d5);
                    if (d6 < (double)1.4E-45f) {
                        float f2 = d3 > 0 ? 0.0f : 0.0f;
                        return Float.valueOf(f2);
                    }
                    if (d6 > 3.4028234663852886E38) {
                        float f4 = d3 > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
                        return Float.valueOf(f4);
                    }
                    return Float.valueOf((float)d5);
                }
                return Float.valueOf((float)d5);
            }
            if (clazz2 == ScriptRuntime.DoubleClass) {
                return object;
            }
            return NativeJavaObject.toDouble(object);
        }
        clazz = ScriptRuntime.CharacterClass;
        if (clazz2 == clazz) {
            return object;
        }
        return Character.valueOf((char)NativeJavaObject.toInteger(object, clazz, 0.0, 65535.0));
    }

    @Deprecated
    public static Object coerceType(Class<?> clazz, Object object) {
        return NativeJavaObject.coerceTypeImpl(clazz, object);
    }

    /*
     * Unable to fully structure code
     */
    static Object coerceTypeImpl(Class<?> var0, Object var1_1) {
        block41: {
            if (var1_1 != null && var1_1.getClass() == var0) {
                return var1_1;
            }
            var3_2 = NativeJavaObject.getJSTypeCode(var1_1);
            var2_3 = 0;
            switch (var3_2) {
                default: {
                    break block41;
                }
                case 8: {
                    if (var0 == ScriptRuntime.StringClass) {
                        return ScriptRuntime.toString(var1_1);
                    }
                    if (var0.isPrimitive()) {
                        if (var0 == Boolean.TYPE) {
                            NativeJavaObject.reportConversionError(var1_1, var0);
                        }
                        return NativeJavaObject.coerceToNumber(var0, var1_1);
                    }
                    if (var0.isInstance(var1_1)) {
                        return var1_1;
                    }
                    if (var0 == ScriptRuntime.DateClass && var1_1 instanceof NativeDate) {
                        return new Date((long)((NativeDate)var1_1).getJSTimeValue());
                    }
                    if (var0.isArray() && var1_1 instanceof NativeArray) {
                        var6_4 = (NativeArray)var1_1;
                        var4_7 = var6_4.getLength();
                        var8_8 = var0.getComponentType();
                        var9_9 = Array.newInstance(var8_8, (int)var4_7);
                        while ((long)var2_3 < var4_7) {
                            try {
                                Array.set(var9_9, var2_3, NativeJavaObject.coerceTypeImpl(var8_8, var6_4.get(var2_3, (Scriptable)var6_4)));
                            }
                            catch (EvaluatorException var7_10) {
                                NativeJavaObject.reportConversionError(var1_1, var0);
                            }
                            ++var2_3;
                        }
                        return var9_9;
                    }
                    if (!(var1_1 instanceof Wrapper)) ** GOTO lbl38
                    var6_5 = var1_1 = ((Wrapper)var1_1).unwrap();
                    if (var0.isInstance(var1_1)) {
                        return var1_1;
                    }
                    ** GOTO lbl70
lbl38:
                    // 1 sources

                    var6_5 = var1_1;
                    if (!var0.isInterface()) ** GOTO lbl70
                    if (var1_1 instanceof NativeObject) ** GOTO lbl45
                    var6_5 = var1_1;
                    if (!(var1_1 instanceof Callable)) ** GOTO lbl70
                    var6_5 = var1_1;
                    if (!(var1_1 instanceof ScriptableObject)) ** GOTO lbl70
lbl45:
                    // 2 sources

                    return NativeJavaObject.createInterfaceAdapter(var0, (ScriptableObject)var1_1);
                }
                case 6: 
                case 7: {
                    var7_11 = var1_1;
                    if (var1_1 instanceof Wrapper) {
                        var7_11 = ((Wrapper)var1_1).unwrap();
                    }
                    if (var0.isPrimitive()) {
                        if (var0 == Boolean.TYPE) {
                            NativeJavaObject.reportConversionError(var7_11, var0);
                        }
                        return NativeJavaObject.coerceToNumber(var0, var7_11);
                    }
                    if (var0 == ScriptRuntime.StringClass) {
                        return var7_11.toString();
                    }
                    var6_5 = var7_11;
                    if (var0.isInstance(var7_11)) {
                        return var7_11;
                    }
                    ** GOTO lbl70
                }
                case 5: {
                    var7_12 = var1_1;
                    if (var1_1 instanceof Wrapper) {
                        var7_12 = ((Wrapper)var1_1).unwrap();
                    }
                    if (var0 != ScriptRuntime.ClassClass && var0 != ScriptRuntime.ObjectClass) {
                        var6_5 = var7_12;
                        if (var0 == ScriptRuntime.StringClass) {
                            return var7_12.toString();
                        } else {
                            ** GOTO lbl70
                        }
                    }
                    ** GOTO lbl74
lbl70:
                    // 10 sources

                    while (true) {
                        NativeJavaObject.reportConversionError(var6_5, var0);
                        var1_1 = var6_5;
                        break block41;
                        break;
                    }
lbl74:
                    // 1 sources

                    return var7_12;
                }
                case 4: {
                    if (var0 == ScriptRuntime.StringClass || var0.isInstance(var1_1)) ** GOTO lbl86
                    if (var0 == Character.TYPE || var0 == ScriptRuntime.CharacterClass) ** GOTO lbl82
                    if (var0.isPrimitive() && var0 != Boolean.TYPE) ** GOTO lbl81
                    var6_5 = var1_1;
                    if (!ScriptRuntime.NumberClass.isAssignableFrom((Class<?>)var0)) ** GOTO lbl70
lbl81:
                    // 2 sources

                    return NativeJavaObject.coerceToNumber(var0, var1_1);
lbl82:
                    // 1 sources

                    var6_6 = (CharSequence)var1_1;
                    if (var6_6.length() == 1) {
                        return Character.valueOf(var6_6.charAt(0));
                    }
                    return NativeJavaObject.coerceToNumber(var0, var1_1);
lbl86:
                    // 1 sources

                    return var1_1.toString();
                }
                case 3: 
                case 9: {
                    if (var0 == ScriptRuntime.StringClass) {
                        return ScriptRuntime.toString(var1_1);
                    }
                    if (var0 == ScriptRuntime.ObjectClass) {
                        var0 = Context.getCurrentContext();
                        if (var0 != null && var0.hasFeature(18) && (double)Math.round(NativeJavaObject.toDouble(var1_1)) == NativeJavaObject.toDouble(var1_1)) {
                            return NativeJavaObject.coerceToNumber(Long.TYPE, var1_1);
                        }
                        var0 = var3_2 == 9 ? BigInteger.class : Double.TYPE;
                        return NativeJavaObject.coerceToNumber(var0, var1_1);
                    }
                    if (var0.isPrimitive() && var0 != Boolean.TYPE) ** GOTO lbl99
                    var6_5 = var1_1;
                    if (!ScriptRuntime.NumberClass.isAssignableFrom((Class<?>)var0)) ** GOTO lbl70
lbl99:
                    // 2 sources

                    return NativeJavaObject.coerceToNumber(var0, var1_1);
                }
                case 2: {
                    if (var0 != Boolean.TYPE && var0 != ScriptRuntime.BooleanClass && var0 != ScriptRuntime.ObjectClass) {
                        var6_5 = var1_1;
                        if (var0 == ScriptRuntime.StringClass) ** break;
                        ** continue;
                        return var1_1.toString();
                    }
                    return var1_1;
                }
                case 1: {
                    if (var0.isPrimitive()) {
                        NativeJavaObject.reportConversionError(var1_1, var0);
                    }
                    return null;
                }
                case 0: 
            }
            if (var0 != ScriptRuntime.StringClass && var0 != ScriptRuntime.ObjectClass) {
                NativeJavaObject.reportConversionError("undefined", var0);
            } else {
                return "undefined";
            }
        }
        return var1_1;
    }

    protected static Object createInterfaceAdapter(Class<?> clazz, ScriptableObject scriptableObject) {
        Object object = Kit.makeHashKeyFromPair(COERCED_INTERFACE_KEY, clazz);
        Object object2 = scriptableObject.getAssociatedValue(object);
        if (object2 != null) {
            return object2;
        }
        return scriptableObject.associateValue(object, InterfaceAdapter.create(Context.getContext(), clazz, scriptableObject));
    }

    static int getConversionWeight(Object object, Class<?> clazz) {
        int n2 = NativeJavaObject.getJSTypeCode(object);
        int n3 = 99;
        switch (n2) {
            default: {
                break;
            }
            case 8: {
                Class<?> clazz2 = ScriptRuntime.ObjectClass;
                if (clazz != clazz2 && clazz.isInstance(object)) {
                    return 1;
                }
                if (clazz.isArray()) {
                    if (!(object instanceof NativeArray)) break;
                    return 2;
                }
                if (clazz == clazz2) {
                    return 3;
                }
                if (clazz == ScriptRuntime.StringClass) {
                    return 4;
                }
                if (clazz == ScriptRuntime.DateClass) {
                    if (!(object instanceof NativeDate)) break;
                    return 1;
                }
                if (clazz.isInterface()) {
                    if (object instanceof NativeFunction) {
                        return 1;
                    }
                    if (object instanceof NativeObject) {
                        return 2;
                    }
                    return 12;
                }
                if (!clazz.isPrimitive() || clazz == Boolean.TYPE) break;
                return NativeJavaObject.getSizeRank(clazz) + 4;
            }
            case 6: 
            case 7: {
                Object object2 = object;
                if (object instanceof Wrapper) {
                    object2 = ((Wrapper)object).unwrap();
                }
                if (clazz.isInstance(object2)) {
                    return 0;
                }
                if (clazz == ScriptRuntime.StringClass) {
                    return 2;
                }
                if (!clazz.isPrimitive() || clazz == Boolean.TYPE) break;
                if (n2 != 7) {
                    n3 = NativeJavaObject.getSizeRank(clazz) + 2;
                }
                return n3;
            }
            case 5: {
                if (clazz == ScriptRuntime.ClassClass) {
                    return 1;
                }
                if (clazz == ScriptRuntime.ObjectClass) {
                    return 3;
                }
                if (clazz != ScriptRuntime.StringClass) break;
                return 4;
            }
            case 4: {
                if (clazz == ScriptRuntime.StringClass) {
                    return 1;
                }
                if (clazz.isInstance(object)) {
                    return 2;
                }
                if (!clazz.isPrimitive()) break;
                if (clazz == Character.TYPE) {
                    return 3;
                }
                if (clazz == Boolean.TYPE) break;
                return 4;
            }
            case 3: 
            case 9: {
                if (clazz.isPrimitive()) {
                    if (clazz == Double.TYPE) {
                        return 1;
                    }
                    if (clazz == Boolean.TYPE) break;
                    return NativeJavaObject.getSizeRank(clazz) + 1;
                }
                if (clazz == ScriptRuntime.StringClass) {
                    return 9;
                }
                if (clazz == ScriptRuntime.BigIntegerClass) {
                    return 10;
                }
                if (clazz == ScriptRuntime.ObjectClass) {
                    return 11;
                }
                if (!ScriptRuntime.NumberClass.isAssignableFrom(clazz)) break;
                return 2;
            }
            case 2: {
                if (clazz == Boolean.TYPE) {
                    return 1;
                }
                if (clazz == ScriptRuntime.BooleanClass) {
                    return 2;
                }
                if (clazz == ScriptRuntime.ObjectClass) {
                    return 3;
                }
                if (clazz != ScriptRuntime.StringClass) break;
                return 4;
            }
            case 1: {
                if (clazz.isPrimitive()) break;
                return 1;
            }
            case 0: {
                if (clazz != ScriptRuntime.StringClass && clazz != ScriptRuntime.ObjectClass) break;
                return 1;
            }
        }
        return 99;
    }

    private static int getJSTypeCode(Object object) {
        if (object == null) {
            return 1;
        }
        if (object == Undefined.instance) {
            return 0;
        }
        if (object instanceof CharSequence) {
            return 4;
        }
        if (object instanceof BigInteger) {
            return 9;
        }
        if (object instanceof Number) {
            return 3;
        }
        if (object instanceof Boolean) {
            return 2;
        }
        if (object instanceof Scriptable) {
            if (object instanceof NativeJavaClass) {
                return 5;
            }
            if (object instanceof NativeJavaArray) {
                return 7;
            }
            if (object instanceof Wrapper) {
                return 6;
            }
            return 8;
        }
        if (object instanceof Class) {
            return 5;
        }
        if (object.getClass().isArray()) {
            return 7;
        }
        return 6;
    }

    static int getSizeRank(Class<?> clazz) {
        if (clazz == Double.TYPE) {
            return 1;
        }
        if (clazz == Float.TYPE) {
            return 2;
        }
        if (clazz == Long.TYPE) {
            return 3;
        }
        if (clazz == Integer.TYPE) {
            return 4;
        }
        if (clazz == Short.TYPE) {
            return 5;
        }
        if (clazz == Character.TYPE) {
            return 6;
        }
        if (clazz == Byte.TYPE) {
            return 7;
        }
        if (clazz == Boolean.TYPE) {
            return 99;
        }
        return 8;
    }

    static void init(ScriptableObject scriptableObject, boolean bl) {
        NativeJavaObject$JavaIterableIterator.init(scriptableObject, bl);
    }

    private static /* synthetic */ Object lambda$static$0(Context object, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (scriptable2 instanceof NativeJavaObject) {
            object = ((NativeJavaObject)scriptable2).javaObject;
            if (object instanceof Iterable) {
                return new NativeJavaObject$JavaIterableIterator(scriptable, (Iterable)object);
            }
            throw ScriptRuntime.typeErrorById("msg.incompat.call", SymbolKey.ITERATOR);
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", SymbolKey.ITERATOR);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void readObject(ObjectInputStream object) {
        boolean bl;
        ((ObjectInputStream)object).defaultReadObject();
        this.isAdapter = bl = ((ObjectInputStream)object).readBoolean();
        if (bl) {
            Method method = adapter_readAdapterObject;
            if (method == null) throw new ClassNotFoundException();
            try {
                this.javaObject = method.invoke(null, this, object);
            }
            catch (Exception exception) {
                throw new IOException();
            }
        } else {
            this.javaObject = ((ObjectInputStream)object).readObject();
        }
        object = (String)((ObjectInputStream)object).readObject();
        this.staticType = object != null ? Class.forName((String)object) : null;
        this.initMembers();
    }

    static void reportConversionError(Object object, Class<?> clazz) {
        throw Context.reportRuntimeErrorById("msg.conversion.not.allowed", String.valueOf(object), JavaMembers.javaSignature(clazz));
    }

    private static double toDouble(Object object) {
        Method method;
        if (object instanceof Number) {
            return ((Number)object).doubleValue();
        }
        if (object instanceof String) {
            return ScriptRuntime.toNumber((String)object);
        }
        if (object instanceof Scriptable) {
            if (object instanceof Wrapper) {
                return NativeJavaObject.toDouble(((Wrapper)object).unwrap());
            }
            return ScriptRuntime.toNumber(object);
        }
        try {
            method = object.getClass().getMethod("doubleValue", null);
        }
        catch (NoSuchMethodException | SecurityException exception) {
            method = null;
        }
        if (method != null) {
            try {
                double d2 = ((Number)method.invoke(object, null)).doubleValue();
                return d2;
            }
            catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
                NativeJavaObject.reportConversionError(object, Double.TYPE);
            }
        }
        return ScriptRuntime.toNumber(object.toString());
    }

    private static long toInteger(Object object, Class<?> clazz, double d2, double d3) {
        double d4 = NativeJavaObject.toDouble(object);
        if (Double.isInfinite(d4) || Double.isNaN(d4)) {
            NativeJavaObject.reportConversionError(ScriptRuntime.toString(object), clazz);
        }
        if ((d4 = d4 > 0.0 ? Math.floor(d4) : Math.ceil(d4)) < d2 || d4 > d3) {
            NativeJavaObject.reportConversionError(ScriptRuntime.toString(object), clazz);
        }
        return (long)d4;
    }

    @Deprecated
    public static Object wrap(Scriptable scriptable, Object object, Class<?> clazz) {
        Context context = Context.getContext();
        return context.getWrapFactory().wrap(context, scriptable, object, clazz);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        Class<?> clazz;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeBoolean(this.isAdapter);
        if (this.isAdapter) {
            Method method = adapter_writeAdapterObject;
            if (method == null) throw new IOException();
            clazz = this.javaObject;
            try {
                method.invoke(null, clazz, objectOutputStream);
            }
            catch (Exception exception) {
                throw new IOException();
            }
        } else {
            objectOutputStream.writeObject(this.javaObject);
        }
        clazz = this.staticType;
        if (clazz != null) {
            objectOutputStream.writeObject(clazz.getName());
            return;
        } else {
            objectOutputStream.writeObject(null);
        }
    }

    @Override
    public void delete(int n2) {
    }

    @Override
    public void delete(String string) {
    }

    @Override
    public void delete(Symbol symbol) {
    }

    public boolean equals(Object object) {
        boolean bl = object != null && object.getClass().equals(this.getClass()) && Objects.equals(((NativeJavaObject)object).javaObject, this.javaObject);
        return bl;
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        throw this.members.reportMemberNotFound(Integer.toString(n2));
    }

    @Override
    public Object get(String string, Scriptable map) {
        map = this.fieldAndMethods;
        if (map != null && (map = map.get(string)) != null) {
            return map;
        }
        return this.members.get(this, string, this.javaObject, false);
    }

    @Override
    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol) && this.javaObject instanceof Iterable) {
            return symbol_iterator;
        }
        return Scriptable.NOT_FOUND;
    }

    @Override
    public String getClassName() {
        return "JavaObject";
    }

    @Override
    public Object getDefaultValue(Class<?> object) {
        block8: {
            block3: {
                block6: {
                    Class<?> clazz;
                    block7: {
                        block5: {
                            block4: {
                                clazz = object;
                                if (object == null) {
                                    Object object2 = this.javaObject;
                                    if (object2 instanceof Boolean) {
                                        object = ScriptRuntime.BooleanClass;
                                    }
                                    clazz = object;
                                    if (object2 instanceof Number) {
                                        clazz = ScriptRuntime.NumberClass;
                                    }
                                }
                                if (clazz == null || clazz == ScriptRuntime.StringClass) break block3;
                                if (clazz != ScriptRuntime.BooleanClass) break block4;
                                object = "booleanValue";
                                break block5;
                            }
                            if (clazz != ScriptRuntime.NumberClass) break block6;
                            object = "doubleValue";
                        }
                        object = this.get((String)object, (Scriptable)this);
                        if (!(object instanceof Function)) break block7;
                        object = (Function)object;
                        object = object.call(Context.getContext(), object.getParentScope(), this, ScriptRuntime.emptyArgs);
                        break block8;
                    }
                    if (clazz != ScriptRuntime.NumberClass || !((object = this.javaObject) instanceof Boolean)) break block3;
                    object = ((Boolean)object).booleanValue() ? (Number)ScriptRuntime.wrapNumber(1.0) : (Number)ScriptRuntime.zeroObj;
                    break block8;
                }
                throw Context.reportRuntimeErrorById("msg.default.value", new Object[0]);
            }
            object = this.javaObject.toString();
        }
        return object;
    }

    @Override
    public Object[] getIds() {
        return this.members.getIds(false);
    }

    @Override
    public Scriptable getParentScope() {
        return this.parent;
    }

    @Override
    public Scriptable getPrototype() {
        Scriptable scriptable;
        Scriptable scriptable2 = scriptable = this.prototype;
        if (scriptable == null) {
            scriptable2 = scriptable;
            if (this.javaObject instanceof String) {
                scriptable2 = TopLevel.getBuiltinPrototype(ScriptableObject.getTopLevelScope(this.parent), TopLevel$Builtins.String);
            }
        }
        return scriptable2;
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        return false;
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        return this.members.has(string, false);
    }

    @Override
    public boolean has(Symbol symbol, Scriptable scriptable) {
        return SymbolKey.ITERATOR.equals(symbol) && this.javaObject instanceof Iterable;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        return false;
    }

    public int hashCode() {
        Object object = this.javaObject;
        int n2 = object == null ? 0 : object.hashCode();
        return n2;
    }

    protected void initMembers() {
        Class<?> clazz = this.javaObject;
        clazz = clazz != null ? clazz.getClass() : this.staticType;
        this.members = clazz = JavaMembers.lookupClass(this.parent, clazz, this.staticType, this.isAdapter);
        this.fieldAndMethods = ((JavaMembers)((Object)clazz)).getFieldAndMethodsObjects(this, this.javaObject, false);
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        throw this.members.reportMemberNotFound(Integer.toString(n2));
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        if (this.prototype != null && !this.members.has(string, false)) {
            scriptable = this.prototype;
            scriptable.put(string, scriptable, object);
        } else {
            this.members.put(this, string, this.javaObject, object, false);
        }
    }

    @Override
    public void put(Symbol symbol, Scriptable object, Object object2) {
        object = symbol.toString();
        if (this.prototype != null && !this.members.has((String)object, false)) {
            object = this.prototype;
            if (object instanceof SymbolScriptable) {
                ((SymbolScriptable)object).put(symbol, (Scriptable)object, object2);
            }
        } else {
            this.members.put(this, (String)object, this.javaObject, object2, false);
        }
    }

    @Override
    public void setParentScope(Scriptable scriptable) {
        this.parent = scriptable;
    }

    @Override
    public void setPrototype(Scriptable scriptable) {
        this.prototype = scriptable;
    }

    @Override
    public Object unwrap() {
        return this.javaObject;
    }
}

