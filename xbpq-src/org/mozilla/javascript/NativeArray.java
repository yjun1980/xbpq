/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.IteratorLikeIterable;
import org.mozilla.javascript.NativeArray$1;
import org.mozilla.javascript.NativeArray$2;
import org.mozilla.javascript.NativeArray$3;
import org.mozilla.javascript.NativeArray$ElementComparator;
import org.mozilla.javascript.NativeArray$StringLikeComparator;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Sorting;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.regexp.NativeRegExp;
import org.mozilla.javascript.xml.XMLObject;

public class NativeArray
extends IdScriptableObject
implements List {
    private static final Object ARRAY_TAG = "Array";
    private static final int ConstructorId_concat = -13;
    private static final int ConstructorId_every = -17;
    private static final int ConstructorId_filter = -18;
    private static final int ConstructorId_find = -22;
    private static final int ConstructorId_findIndex = -23;
    private static final int ConstructorId_forEach = -19;
    private static final int ConstructorId_from = -28;
    private static final int ConstructorId_indexOf = -15;
    private static final int ConstructorId_isArray = -26;
    private static final int ConstructorId_join = -5;
    private static final int ConstructorId_lastIndexOf = -16;
    private static final int ConstructorId_map = -20;
    private static final int ConstructorId_of = -27;
    private static final int ConstructorId_pop = -9;
    private static final int ConstructorId_push = -8;
    private static final int ConstructorId_reduce = -24;
    private static final int ConstructorId_reduceRight = -25;
    private static final int ConstructorId_reverse = -6;
    private static final int ConstructorId_shift = -10;
    private static final int ConstructorId_slice = -14;
    private static final int ConstructorId_some = -21;
    private static final int ConstructorId_sort = -7;
    private static final int ConstructorId_splice = -12;
    private static final int ConstructorId_unshift = -11;
    private static final Comparator<Object> DEFAULT_COMPARATOR;
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private static final double GROW_FACTOR = 1.5;
    private static final int Id_at = 32;
    private static final int Id_concat = 13;
    private static final int Id_constructor = 1;
    private static final int Id_copyWithin = 31;
    private static final int Id_entries = 29;
    private static final int Id_every = 17;
    private static final int Id_fill = 26;
    private static final int Id_filter = 18;
    private static final int Id_find = 22;
    private static final int Id_findIndex = 23;
    private static final int Id_flat = 33;
    private static final int Id_flatMap = 34;
    private static final int Id_forEach = 19;
    private static final int Id_includes = 30;
    private static final int Id_indexOf = 15;
    private static final int Id_join = 5;
    private static final int Id_keys = 27;
    private static final int Id_lastIndexOf = 16;
    private static final int Id_length = 1;
    private static final int Id_map = 20;
    private static final int Id_pop = 9;
    private static final int Id_push = 8;
    private static final int Id_reduce = 24;
    private static final int Id_reduceRight = 25;
    private static final int Id_reverse = 6;
    private static final int Id_shift = 10;
    private static final int Id_slice = 14;
    private static final int Id_some = 21;
    private static final int Id_sort = 7;
    private static final int Id_splice = 12;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toSource = 4;
    private static final int Id_toString = 2;
    private static final int Id_unshift = 11;
    private static final int Id_values = 28;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PRE_GROW_SIZE = 0x55555554;
    private static final int MAX_PROTOTYPE_ID = 34;
    private static final Long NEGATIVE_ONE;
    private static final Comparator<Object> STRING_COMPARATOR;
    private static int maximumInitialCapacity = 0;
    private static final long serialVersionUID = 7331366857676127338L;
    private Object[] dense;
    private boolean denseOnly;
    private long length;
    private int lengthAttr = 6;
    private transient int modCount;

    static {
        NEGATIVE_ONE = -1L;
        STRING_COMPARATOR = new NativeArray$StringLikeComparator();
        DEFAULT_COMPARATOR = new NativeArray$ElementComparator();
        maximumInitialCapacity = 10000;
    }

    public NativeArray(long l2) {
        boolean bl = l2 <= (long)maximumInitialCapacity;
        this.denseOnly = bl;
        if (bl) {
            int n2;
            int n3 = n2 = (int)l2;
            if (n2 < 10) {
                n3 = 10;
            }
            Object[] objectArray = new Object[n3];
            this.dense = objectArray;
            Arrays.fill(objectArray, Scriptable.NOT_FOUND);
        }
        this.length = l2;
    }

    public NativeArray(Object[] objectArray) {
        this.denseOnly = true;
        this.dense = objectArray;
        this.length = objectArray.length;
    }

    static /* synthetic */ int access$000(NativeArray nativeArray) {
        return nativeArray.modCount;
    }

    static /* synthetic */ void access$100(NativeArray nativeArray, int n2) {
        nativeArray.checkModCount(n2);
    }

    static /* synthetic */ Comparator access$200() {
        return STRING_COMPARATOR;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Scriptable callConstructorOrCreateArray(Context var0, Scriptable var1_1, Scriptable var2_2, long var3_4, boolean var5_5) {
        block4: {
            block5: {
                var7_6 = var2_2 /* !! */  instanceof Function;
                var6_7 = 0;
                if (!var7_6) break block5;
                if (var5_5 || var3_4 > 0L) ** GOTO lbl8
                try {
                    block6: {
                        var8_8 /* !! */  = ScriptRuntime.emptyArgs;
                        break block6;
lbl8:
                        // 1 sources

                        var8_8 /* !! */  = new Object[]{var3_4};
                    }
                    var2_2 /* !! */  = ((Function)var2_2 /* !! */ ).construct(var0, var1_1, var8_8 /* !! */ );
                    break block4;
                }
                catch (EcmaError var2_3) {
                    if ("TypeError".equals(var2_3.getName())) break block5;
                    throw var2_3;
                }
            }
            var2_2 /* !! */  = null;
        }
        var8_8 /* !! */  = var2_2 /* !! */ ;
        if (var2_2 /* !! */  == null) {
            if (var3_4 <= 0x7FFFFFFFL) {
                var6_7 = (int)var3_4;
            }
            var8_8 /* !! */  = var0.newArray(var1_1, var6_7);
        }
        return var8_8 /* !! */ ;
    }

    private void checkModCount(int n2) {
        if (this.modCount == n2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    private static long concatSpreadArg(Context context, Scriptable scriptable, Scriptable scriptable2, long l2) {
        long l3 = NativeArray.getLengthProperty(context, scriptable2);
        long l4 = l3 + l2;
        if (!((double)l4 > 9.007199254740991E15)) {
            Object object;
            if (l4 <= Integer.MAX_VALUE && scriptable instanceof NativeArray) {
                object = (NativeArray)scriptable;
                if (((NativeArray)object).denseOnly && scriptable2 instanceof NativeArray) {
                    NativeArray nativeArray = (NativeArray)scriptable2;
                    if (nativeArray.denseOnly) {
                        super.ensureCapacity((int)l4);
                        System.arraycopy(nativeArray.dense, 0, ((NativeArray)object).dense, (int)l2, (int)l3);
                        return l4;
                    }
                }
            }
            long l5 = 0L;
            while (l5 < l3) {
                object = NativeArray.getRawElem(scriptable2, l5);
                if (object != Scriptable.NOT_FOUND) {
                    NativeArray.defineElem(context, scriptable, l2, object);
                }
                ++l5;
                ++l2;
            }
            return l4;
        }
        throw ScriptRuntime.typeErrorById("msg.arraylength.too.big", l4);
    }

    private ScriptableObject defaultIndexPropertyDescriptor(Object object) {
        Scriptable scriptable;
        Scriptable scriptable2 = scriptable = this.getParentScope();
        if (scriptable == null) {
            scriptable2 = this;
        }
        scriptable = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent((ScriptableObject)scriptable, scriptable2, TopLevel$Builtins.Object);
        ((ScriptableObject)scriptable).defineProperty("value", object, 0);
        object = Boolean.TRUE;
        ((ScriptableObject)scriptable).defineProperty("writable", object, 0);
        ((ScriptableObject)scriptable).defineProperty("enumerable", object, 0);
        ((ScriptableObject)scriptable).defineProperty("configurable", object, 0);
        return scriptable;
    }

    private static void defineElem(Context context, Scriptable scriptable, long l2, Object object) {
        if (l2 > Integer.MAX_VALUE) {
            scriptable.put(Long.toString(l2), scriptable, object);
        } else {
            scriptable.put((int)l2, scriptable, object);
        }
    }

    private static void defineElemOrThrow(Context context, Scriptable scriptable, long l2, Object object) {
        if (!((double)l2 > 9.007199254740991E15)) {
            NativeArray.defineElem(context, scriptable, l2, object);
            return;
        }
        throw ScriptRuntime.typeErrorById("msg.arraylength.too.big", String.valueOf(l2));
    }

    private static void deleteElem(Scriptable scriptable, long l2) {
        int n2 = (int)l2;
        if ((long)n2 == l2) {
            scriptable.delete(n2);
        } else {
            scriptable.delete(Long.toString(l2));
        }
    }

    private static long doConcat(Context context, Scriptable scriptable, Scriptable scriptable2, Object object, long l2) {
        if (NativeArray.isConcatSpreadable(context, scriptable, object)) {
            return NativeArray.concatSpreadArg(context, scriptable2, (Scriptable)object, l2);
        }
        NativeArray.defineElem(context, scriptable2, l2, object);
        return l2 + 1L;
    }

    private boolean ensureCapacity(int n2) {
        Object[] objectArray = this.dense;
        if (n2 > objectArray.length) {
            if (n2 > 0x55555554) {
                this.denseOnly = false;
                return false;
            }
            n2 = Math.max(n2, (int)((double)objectArray.length * 1.5));
            objectArray = new Object[n2];
            Object[] objectArray2 = this.dense;
            System.arraycopy(objectArray2, 0, objectArray, 0, objectArray2.length);
            Arrays.fill(objectArray, this.dense.length, n2, Scriptable.NOT_FOUND);
            this.dense = objectArray;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private static Scriptable flat(Context var0, Scriptable var1_1, Scriptable var2_2, double var3_3) {
        var13_4 = NativeArray.getLengthProperty(var0, var2_2);
        var17_5 = var0.newArray(var1_1, 0);
        var5_7 = 0L;
        block0: for (var9_6 = 0L; var9_6 < var13_4; ++var9_6) {
            var18_8 = NativeArray.getRawElem(var2_2, var9_6);
            if (var18_8 == Scriptable.NOT_FOUND) {
                var7_9 = var5_7;
                while (true) {
                    var5_7 = var7_9;
                    continue block0;
                    break;
                }
            }
            if (var3_3 >= 1.0 && NativeArray.js_isArray(var18_8)) {
                var18_8 = NativeArray.flat(var0, var1_1, (Scriptable)var18_8, var3_3 - 1.0);
                var15_11 = NativeArray.getLengthProperty(var0, (Scriptable)var18_8);
                var11_10 = 0L;
                while (true) {
                    var7_9 = ++var5_7;
                    if (var11_10 >= var15_11) ** continue;
                    NativeArray.defineElemOrThrow(var0, var17_5, var5_7, NativeArray.getRawElem((Scriptable)var18_8, var11_10));
                    ++var11_10;
                }
            }
            NativeArray.defineElemOrThrow(var0, var17_5, var5_7, var18_8);
            ++var5_7;
        }
        NativeArray.setLengthProperty(var0, var17_5, var5_7);
        return var17_5;
    }

    private static Function getCallbackArg(Context context, Object object) {
        if (object instanceof Function) {
            if (context.getLanguageVersion() >= 200 && object instanceof NativeRegExp) {
                throw ScriptRuntime.notFunctionError(object);
            }
            return (Function)object;
        }
        throw ScriptRuntime.notFunctionError(object);
    }

    private static Object getElem(Context object, Scriptable scriptable, long l2) {
        object = NativeArray.getRawElem(scriptable, l2);
        if (object == Scriptable.NOT_FOUND) {
            object = Undefined.instance;
        }
        return object;
    }

    static long getLengthProperty(Context object, Scriptable scriptable) {
        if (scriptable instanceof NativeString) {
            return ((NativeString)scriptable).getLength();
        }
        if (scriptable instanceof NativeArray) {
            return ((NativeArray)scriptable).getLength();
        }
        if (scriptable instanceof XMLObject) {
            return ((Number)((Callable)scriptable.get("length", scriptable)).call((Context)object, scriptable, scriptable, ScriptRuntime.emptyArgs)).longValue();
        }
        object = ScriptableObject.getProperty(scriptable, "length");
        if (object == Scriptable.NOT_FOUND) {
            return 0L;
        }
        double d2 = ScriptRuntime.toNumber(object);
        if (d2 > 9.007199254740991E15) {
            return 0x1FFFFFFFFFFFFFL;
        }
        if (d2 < 0.0) {
            return 0L;
        }
        return (long)d2;
    }

    static int getMaximumInitialCapacity() {
        return maximumInitialCapacity;
    }

    private static Object getRawElem(Scriptable scriptable, long l2) {
        if (l2 > Integer.MAX_VALUE) {
            return ScriptableObject.getProperty(scriptable, Long.toString(l2));
        }
        return ScriptableObject.getProperty(scriptable, (int)l2);
    }

    static void init(Context context, Scriptable scriptable, boolean bl) {
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, new NativeArray(0L).exportAsJSClass(34, scriptable, bl));
    }

    private static boolean isConcatSpreadable(Context context, Scriptable scriptable, Object object) {
        Object object2;
        if (object instanceof Scriptable && (object2 = ScriptableObject.getProperty((Scriptable)object, SymbolKey.IS_CONCAT_SPREADABLE)) != Scriptable.NOT_FOUND && !Undefined.isUndefined(object2)) {
            return ScriptRuntime.toBoolean(object2);
        }
        if (context.getLanguageVersion() < 200 && ScriptRuntime.instanceOf(object, ScriptRuntime.getExistingCtor(context, scriptable, "Array"), context)) {
            return true;
        }
        return NativeArray.js_isArray(object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Object iterativeMethod(Context var0, IdFunctionObject var1_1, Scriptable var2_2, Scriptable var3_3, Object[] var4_4) {
        var18_5 = ScriptRuntime.toObject(var0, (Scriptable)var2_2 /* !! */ , var3_3);
        var8_6 = Math.abs(var1_1.methodId());
        if (22 == var8_6 || 23 == var8_6) {
            ScriptRuntimeES6.requireObjectCoercible(var0, var18_5, (IdFunctionObject)var1_1);
        }
        var11_7 = NativeArray.getLengthProperty(var0, var18_5);
        if (var8_6 == 20 && var11_7 > 0x7FFFFFFFL) {
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
        var1_1 = var4_4 /* !! */ .length > 0 ? var4_4 /* !! */ [0] : Undefined.instance;
        var19_8 = NativeArray.getCallbackArg(var0, var1_1);
        var17_9 = ScriptableObject.getTopLevelScope(var19_8);
        var1_1 = var4_4 /* !! */ .length >= 2 && var4_4 /* !! */ [1] != null && var4_4 /* !! */ [1] != Undefined.instance ? ScriptRuntime.toObject(var0, (Scriptable)var2_2 /* !! */ , var4_4 /* !! */ [1]) : var17_9;
        var3_3 = null;
        if (var8_6 == 18 || var8_6 == 20) {
            var7_10 = var8_6 == 20 ? (int)var11_7 : 0;
            var3_3 = var0.newArray((Scriptable)var2_2 /* !! */ , var7_10);
        }
        var9_12 = 0L;
        block14: for (var13_11 = 0L; var13_11 < var11_7; ++var13_11) {
            var20_14 = new Object[3];
            var2_2 /* !! */  = var4_4 /* !! */  = NativeArray.getRawElem(var18_5, var13_11);
            if (var4_4 /* !! */  == Scriptable.NOT_FOUND) {
                if (var8_6 != 22 && var8_6 != 23) continue;
                var2_2 /* !! */  = Undefined.instance;
            }
            var20_14[0] = var2_2 /* !! */ ;
            var20_14[1] = var13_11;
            var20_14[2] = var18_5;
            var4_4 /* !! */  = var19_8.call(var0, var17_9, (Scriptable)var1_1, var20_14);
            switch (var8_6) lbl-1000:
            // 5 sources

            {
                default: {
                    continue block14;
                }
                case 23: {
                    if (!ScriptRuntime.toBoolean(var4_4 /* !! */ )) ** GOTO lbl-1000
                    var5_15 = var13_11;
lbl34:
                    // 2 sources

                    return ScriptRuntime.wrapNumber(var5_15);
                }
                case 22: {
                    if (!ScriptRuntime.toBoolean(var4_4 /* !! */ )) ** GOTO lbl-1000
                    return var2_2 /* !! */ ;
                }
                case 21: {
                    if (!ScriptRuntime.toBoolean(var4_4 /* !! */ )) ** GOTO lbl-1000
                    return Boolean.TRUE;
                }
                case 20: {
                    NativeArray.defineElem(var0, var3_3, var13_11, var4_4 /* !! */ );
                    continue block14;
                }
                case 18: {
                    if (!ScriptRuntime.toBoolean(var4_4 /* !! */ )) ** GOTO lbl-1000
                    var15_13 = var9_12 + 1L;
                    NativeArray.defineElem(var0, var3_3, var9_12, var20_14[0]);
                    var9_12 = var15_13;
                    continue block14;
                }
                case 17: {
                    if (ScriptRuntime.toBoolean(var4_4 /* !! */ )) continue block14;
                    return Boolean.FALSE;
                }
            }
        }
        switch (var8_6) {
            default: {
                return Undefined.instance;
            }
            case 23: {
                var5_15 = -1.0;
                ** continue;
            }
            case 21: {
                return Boolean.FALSE;
            }
            case 18: 
            case 20: {
                return var3_3;
            }
            case 17: 
        }
        return Boolean.TRUE;
    }

    private static Object jsConstructor(Context object, Scriptable scriptable, Object[] objectArray) {
        if (objectArray.length == 0) {
            return new NativeArray(0L);
        }
        if (((Context)object).getLanguageVersion() == 120) {
            return new NativeArray(objectArray);
        }
        object = objectArray[0];
        if (objectArray.length <= 1 && object instanceof Number) {
            long l2 = ScriptRuntime.toUint32(object);
            if ((double)l2 == ((Number)object).doubleValue()) {
                return new NativeArray(l2);
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
        return new NativeArray(objectArray);
    }

    private static Object js_at(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        long l2 = NativeArray.getLengthProperty(context, ScriptRuntime.toObject(context, scriptable, scriptable2));
        long l3 = objectArray.length >= 1 ? (long)ScriptRuntime.toInteger(objectArray[0]) : 0L;
        if (l3 < 0L) {
            l3 += l2;
        }
        if (l3 >= 0L && l3 < l2) {
            return NativeArray.getElem(context, scriptable2, l3);
        }
        return Undefined.instance;
    }

    private static Scriptable js_concat(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        scriptable2 = ScriptRuntime.toObject(context, scriptable, scriptable2);
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        Scriptable scriptable3 = context.newArray(scriptable, 0);
        long l2 = NativeArray.doConcat(context, scriptable, scriptable3, scriptable2, 0L);
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            l2 = NativeArray.doConcat(context, scriptable, scriptable3, objectArray[i2], l2);
        }
        NativeArray.setLengthProperty(context, scriptable3, l2);
        return scriptable3;
    }

    private static Object js_copyWithin(Context objectArray, Scriptable object, Scriptable scriptable, Object[] objectArray2) {
        long l2;
        Scriptable scriptable2 = ScriptRuntime.toObject((Context)objectArray, (Scriptable)object, scriptable);
        long l3 = NativeArray.getLengthProperty((Context)objectArray, scriptable2);
        int n2 = objectArray2.length;
        int n3 = 1;
        object = n2 >= 1 ? objectArray2[0] : Undefined.instance;
        long l4 = (long)ScriptRuntime.toInteger(object);
        long l5 = l4 < 0L ? Math.max(l4 + l3, 0L) : Math.min(l4, l3);
        object = objectArray2.length >= 2 ? objectArray2[1] : Undefined.instance;
        l4 = (long)ScriptRuntime.toInteger(object);
        long l6 = l4 < 0L ? Math.max(l4 + l3, 0L) : Math.min(l4, l3);
        l4 = objectArray2.length >= 3 && !Undefined.isUndefined(objectArray2[2]) ? (long)ScriptRuntime.toInteger(objectArray2[2]) : l3;
        l4 = l4 < 0L ? Math.max(l4 + l3, 0L) : Math.min(l4, l3);
        long l7 = Math.min(l4 - l6, l3 - l5);
        n2 = n3;
        l4 = l5;
        l3 = l6;
        if (l6 < l5) {
            l2 = l6 + l7;
            n2 = n3;
            l4 = l5;
            l3 = l6;
            if (l5 < l2) {
                n2 = -1;
                l3 = l2 - 1L;
                l4 = l5 + l7 - 1L;
            }
        }
        l5 = l7;
        l6 = l4;
        l2 = l3;
        if (scriptable2 instanceof NativeArray) {
            l5 = l7;
            l6 = l4;
            l2 = l3;
            if (l7 <= Integer.MAX_VALUE) {
                object = (NativeArray)scriptable2;
                l5 = l7;
                l6 = l4;
                l2 = l3;
                if (((NativeArray)object).denseOnly) {
                    while (l7 > 0L) {
                        objectArray = ((NativeArray)object).dense;
                        objectArray[(int)l4] = objectArray[(int)l3];
                        l5 = n2;
                        l3 += l5;
                        l4 += l5;
                        --l7;
                    }
                    return scriptable;
                }
            }
        }
        while (l5 > 0L) {
            object = NativeArray.getRawElem(scriptable2, l2);
            if (object != Scriptable.NOT_FOUND && !Undefined.isUndefined(object)) {
                NativeArray.setElem((Context)objectArray, scriptable2, l6, object);
            } else {
                NativeArray.deleteElem(scriptable2, l6);
            }
            l4 = n2;
            l2 += l4;
            l6 += l4;
            --l5;
        }
        return scriptable;
    }

    private static Object js_fill(Context context, Scriptable object, Scriptable scriptable, Object[] objectArray) {
        long l2 = NativeArray.getLengthProperty(context, ScriptRuntime.toObject(context, (Scriptable)object, scriptable));
        long l3 = objectArray.length >= 2 ? (long)ScriptRuntime.toInteger(objectArray[1]) : 0L;
        long l4 = objectArray.length >= 3 && !Undefined.isUndefined(objectArray[2]) ? (long)ScriptRuntime.toInteger(objectArray[2]) : l2;
        l4 = l4 < 0L ? Math.max(l2 + l4, 0L) : Math.min(l4, l2);
        object = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
        for (l3 = l3 < 0L ? Math.max(l3 + l2, 0L) : Math.min(l3, l2); l3 < l4; ++l3) {
            NativeArray.setRawElem(context, scriptable, l3, object);
        }
        return scriptable;
    }

    private static Object js_flat(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        scriptable2 = ScriptRuntime.toObject(context, scriptable, scriptable2);
        double d2 = objectArray.length >= 1 && !Undefined.isUndefined(objectArray[0]) ? ScriptRuntime.toInteger(objectArray[0]) : 1.0;
        return NativeArray.flat(context, scriptable, scriptable2, d2);
    }

    private static Object js_flatMap(Context context, Scriptable scriptable, Scriptable object, Object[] object2) {
        Scriptable scriptable2 = ScriptRuntime.toObject(context, scriptable, object);
        object = ((Object[])object2).length > 0 ? object2[0] : Undefined.instance;
        Function function = NativeArray.getCallbackArg(context, object);
        Scriptable scriptable3 = ScriptableObject.getTopLevelScope(function);
        object = ((Object[])object2).length >= 2 && object2[1] != null && object2[1] != Undefined.instance ? ScriptRuntime.toObject(context, scriptable, object2[1]) : scriptable3;
        long l2 = NativeArray.getLengthProperty(context, scriptable2);
        scriptable = context.newArray(scriptable, 0);
        long l3 = 0L;
        for (long i2 = 0L; i2 < l2; ++i2) {
            long l4;
            object2 = NativeArray.getRawElem(scriptable2, i2);
            if (object2 == Scriptable.NOT_FOUND) {
                l4 = l3;
            } else if (NativeArray.js_isArray(object2 = function.call(context, scriptable3, (Scriptable)object, new Object[]{object2, i2, scriptable2}))) {
                object2 = (Scriptable)object2;
                long l5 = NativeArray.getLengthProperty(context, (Scriptable)object2);
                long l6 = 0L;
                while (true) {
                    l4 = ++l3;
                    if (l6 < l5) {
                        NativeArray.defineElemOrThrow(context, scriptable, l3, NativeArray.getRawElem((Scriptable)object2, l6));
                        ++l6;
                        continue;
                    }
                    break;
                }
            } else {
                NativeArray.defineElemOrThrow(context, scriptable, l3, object2);
                l4 = l3 + 1L;
            }
            l3 = l4;
        }
        NativeArray.setLengthProperty(context, scriptable, l3);
        return scriptable;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object js_from(Context context, Scriptable scriptable, Scriptable object, Object[] object2) {
        Object object3;
        void var3_14;
        Object object4 = ((void)var3_14).length >= 1 ? var3_14[0] : Undefined.instance;
        Object object5 = ScriptRuntime.toObject(scriptable, object4);
        Object object6 = ((void)var3_14).length >= 2 ? var3_14[1] : Undefined.instance;
        Scriptable scriptable2 = Undefined.SCRIPTABLE_UNDEFINED;
        boolean bl = Undefined.isUndefined(object6) ^ true;
        Object object7 = null;
        object4 = scriptable2;
        if (bl) {
            if (!(object6 instanceof Function)) throw ScriptRuntime.typeErrorById("msg.map.function.not", new Object[0]);
            object6 = (Function)object6;
            object4 = scriptable2;
            object7 = object6;
            if (((void)var3_14).length >= 3) {
                object4 = ScriptableObject.ensureScriptable(var3_14[2]);
                object7 = object6;
            }
        }
        Object object8 = ScriptableObject.getProperty((Scriptable)object5, SymbolKey.ITERATOR);
        if (!(object5 instanceof NativeArray || object8 == Scriptable.NOT_FOUND || Undefined.isUndefined(object8) || Undefined.isUndefined(object3 = ScriptRuntime.callIterator(object5, context, scriptable)))) {
            long l2;
            scriptable2 = NativeArray.callConstructorOrCreateArray(context, scriptable, (Scriptable)object, 0L, false);
            object6 = new IteratorLikeIterable(context, scriptable, object3);
            try {
                object5 = ((IteratorLikeIterable)object6).iterator();
                l2 = 0L;
                while (object5.hasNext()) {
                    void var2_8;
                    Object e2;
                    Object e3 = e2 = object5.next();
                    if (bl) {
                        Object object9 = object7.call(context, scriptable, (Scriptable)object4, new Object[]{e2, l2});
                    }
                    NativeArray.defineElem(context, scriptable2, l2, var2_8);
                    ++l2;
                }
                ((IteratorLikeIterable)object6).close();
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    try {
                        ((IteratorLikeIterable)object6).close();
                        throw throwable2;
                    }
                    catch (Throwable throwable3) {
                        throwable.addSuppressed(throwable3);
                    }
                    throw throwable2;
                }
            }
            NativeArray.setLengthProperty(context, scriptable2, l2);
            return scriptable2;
        }
        long l3 = NativeArray.getLengthProperty(context, (Scriptable)object5);
        object6 = NativeArray.callConstructorOrCreateArray(context, scriptable, (Scriptable)object, l3, true);
        long l4 = 0L;
        while (true) {
            void var2_13;
            Object object10;
            if (l4 >= l3) {
                NativeArray.setLengthProperty(context, (Scriptable)object6, l3);
                return object6;
            }
            Object object11 = object10 = NativeArray.getElem(context, (Scriptable)object5, l4);
            if (bl) {
                Object object12 = object7.call(context, scriptable, (Scriptable)object4, new Object[]{object10, l4});
            }
            NativeArray.defineElem(context, (Scriptable)object6, l4, var2_13);
            ++l4;
        }
    }

    private static Boolean js_includes(Context object, Scriptable object2, Scriptable scriptable, Object[] object3) {
        long l2;
        long l3;
        long l4;
        Object object4;
        Object object5;
        block16: {
            block18: {
                block17: {
                    long l5;
                    block15: {
                        object5 = ((Object[])object3).length > 0 ? object3[0] : Undefined.instance;
                        object4 = ScriptRuntime.toObject((Context)object, (Scriptable)object2, scriptable);
                        l4 = ScriptRuntime.toLength(new Object[]{ScriptableObject.getProperty(scriptable, "length")}, 0);
                        l3 = 0L;
                        if (l4 == 0L) {
                            return Boolean.FALSE;
                        }
                        if (((Object[])object3).length >= 2) break block15;
                        l2 = l3;
                        break block16;
                    }
                    l2 = l5 = (long)ScriptRuntime.toInteger(object3[1]);
                    if (l5 >= 0L) break block17;
                    l2 = l5 += l4;
                    if (l5 < 0L) break block18;
                }
                l3 = l2;
            }
            l2 = l3;
            if (l3 > l4 - 1L) {
                return Boolean.FALSE;
            }
        }
        l3 = l2;
        if (object4 instanceof NativeArray) {
            scriptable = (NativeArray)object4;
            l3 = l2;
            if (((NativeArray)scriptable).denseOnly) {
                object3 = ((ScriptableObject)scriptable).getPrototype();
                int n2 = (int)l2;
                while ((long)n2 < l4) {
                    object2 = ((NativeArray)scriptable).dense[n2];
                    object4 = Scriptable.NOT_FOUND;
                    object = object2;
                    if (object2 == object4) {
                        object = object2;
                        if (object3 != null) {
                            object = ScriptableObject.getProperty((Scriptable)object3, n2);
                        }
                    }
                    object2 = object;
                    if (object == object4) {
                        object2 = Undefined.instance;
                    }
                    if (ScriptRuntime.sameZero(object2, object5)) {
                        return Boolean.TRUE;
                    }
                    ++n2;
                }
                return Boolean.FALSE;
            }
        }
        while (l3 < l4) {
            object = object2 = NativeArray.getRawElem((Scriptable)object4, l3);
            if (object2 == Scriptable.NOT_FOUND) {
                object = Undefined.instance;
            }
            if (ScriptRuntime.sameZero(object, object5)) {
                return Boolean.TRUE;
            }
            ++l3;
        }
        return Boolean.FALSE;
    }

    private static Object js_indexOf(Context object, Scriptable object2, Scriptable scriptable, Object[] object3) {
        long l2;
        long l3;
        int n2;
        long l4;
        Object object4;
        block13: {
            block15: {
                block14: {
                    long l5;
                    block12: {
                        object4 = ((Object[])object3).length > 0 ? object3[0] : Undefined.instance;
                        object2 = ScriptRuntime.toObject((Context)object, (Scriptable)object2, scriptable);
                        l4 = NativeArray.getLengthProperty((Context)object, (Scriptable)object2);
                        n2 = ((Object[])object3).length;
                        l3 = 0L;
                        if (n2 >= 2) break block12;
                        l2 = l3;
                        break block13;
                    }
                    l2 = l5 = (long)ScriptRuntime.toInteger(object3[1]);
                    if (l5 >= 0L) break block14;
                    l2 = l5 += l4;
                    if (l5 < 0L) break block15;
                }
                l3 = l2;
            }
            l2 = l3;
            if (l3 > l4 - 1L) {
                return NEGATIVE_ONE;
            }
        }
        l3 = l2;
        if (object2 instanceof NativeArray) {
            scriptable = (NativeArray)object2;
            l3 = l2;
            if (((NativeArray)scriptable).denseOnly) {
                Scriptable scriptable2 = ((ScriptableObject)scriptable).getPrototype();
                n2 = (int)l2;
                while ((l2 = (long)n2) < l4) {
                    object2 = ((NativeArray)scriptable).dense[n2];
                    object3 = Scriptable.NOT_FOUND;
                    object = object2;
                    if (object2 == object3) {
                        object = object2;
                        if (scriptable2 != null) {
                            object = ScriptableObject.getProperty(scriptable2, n2);
                        }
                    }
                    if (object != object3 && ScriptRuntime.shallowEq(object, object4)) {
                        return l2;
                    }
                    ++n2;
                }
                return NEGATIVE_ONE;
            }
        }
        while (l3 < l4) {
            object = NativeArray.getRawElem((Scriptable)object2, l3);
            if (object != Scriptable.NOT_FOUND && ScriptRuntime.shallowEq(object, object4)) {
                return l3;
            }
            ++l3;
        }
        return NEGATIVE_ONE;
    }

    private static boolean js_isArray(Object object) {
        if (!(object instanceof Scriptable)) {
            return false;
        }
        return "Array".equals(((Scriptable)object).getClassName());
    }

    private static String js_join(Context object, Scriptable object2, Scriptable object3, Object[] object4) {
        object3 = ScriptRuntime.toObject((Context)object, (Scriptable)object2, object3);
        long l2 = NativeArray.getLengthProperty((Context)object, (Scriptable)object3);
        int n2 = (int)l2;
        long l3 = n2;
        int n3 = 0;
        int n4 = 0;
        if (l2 == l3) {
            object2 = ((Object[])object4).length >= 1 && object4[0] != Undefined.instance ? ScriptRuntime.toString(object4[0]) : ",";
            if (object3 instanceof NativeArray) {
                object4 = (NativeArray)object3;
                if (object4.denseOnly) {
                    object = new StringBuilder();
                    while (n4 < n2) {
                        if (n4 != 0) {
                            ((StringBuilder)object).append((String)object2);
                        }
                        if (n4 < ((Object[])(object3 = object4.dense)).length && (object3 = object3[n4]) != null && object3 != Undefined.instance && object3 != Scriptable.NOT_FOUND) {
                            ((StringBuilder)object).append(ScriptRuntime.toString(object3));
                        }
                        ++n4;
                    }
                    return ((StringBuilder)object).toString();
                }
            }
            if (n2 == 0) {
                return "";
            }
            object4 = new String[n2];
            n4 = 0;
            for (int i2 = 0; i2 != n2; ++i2) {
                Object object5 = NativeArray.getElem((Context)object, (Scriptable)object3, i2);
                int n5 = n4;
                if (object5 != null) {
                    n5 = n4;
                    if (object5 != Undefined.instance) {
                        object5 = ScriptRuntime.toString(object5);
                        n5 = n4 + ((String)object5).length();
                        object4[i2] = object5;
                    }
                }
                n4 = n5;
            }
            object = new StringBuilder(((String)object2).length() * (n2 - 1) + n4);
            for (n4 = n3; n4 != n2; ++n4) {
                if (n4 != 0) {
                    ((StringBuilder)object).append((String)object2);
                }
                if ((object3 = object4[n4]) == null) continue;
                ((StringBuilder)object).append((String)object3);
            }
            return ((StringBuilder)object).toString();
        }
        throw Context.reportRuntimeErrorById("msg.arraylength.too.big", String.valueOf(l2));
    }

    private static Object js_lastIndexOf(Context object, Scriptable object2, Scriptable scriptable, Object[] object3) {
        long l2;
        long l3;
        Object object4 = ((Object[])object3).length > 0 ? object3[0] : Undefined.instance;
        object2 = ScriptRuntime.toObject((Context)object, (Scriptable)object2, scriptable);
        long l4 = NativeArray.getLengthProperty((Context)object, (Scriptable)object2);
        if (((Object[])object3).length < 2) {
            l3 = l4 - 1L;
        } else {
            l2 = (long)ScriptRuntime.toInteger(object3[1]);
            if (l2 >= l4) {
                l2 = l4 - 1L;
            } else {
                l3 = l2;
                if (l2 < 0L) {
                    l3 = l2 + l4;
                }
                l2 = l3;
            }
            l3 = l2;
            if (l2 < 0L) {
                return NEGATIVE_ONE;
            }
        }
        l2 = l3;
        if (object2 instanceof NativeArray) {
            scriptable = (NativeArray)object2;
            l2 = l3;
            if (((NativeArray)scriptable).denseOnly) {
                Scriptable scriptable2 = ((ScriptableObject)scriptable).getPrototype();
                for (int i2 = (int)l3; i2 >= 0; --i2) {
                    object2 = ((NativeArray)scriptable).dense[i2];
                    object3 = Scriptable.NOT_FOUND;
                    object = object2;
                    if (object2 == object3) {
                        object = object2;
                        if (scriptable2 != null) {
                            object = ScriptableObject.getProperty(scriptable2, i2);
                        }
                    }
                    if (object == object3 || !ScriptRuntime.shallowEq(object, object4)) continue;
                    return (long)i2;
                }
                return NEGATIVE_ONE;
            }
        }
        while (l2 >= 0L) {
            object = NativeArray.getRawElem((Scriptable)object2, l2);
            if (object != Scriptable.NOT_FOUND && ScriptRuntime.shallowEq(object, object4)) {
                return l2;
            }
            --l2;
        }
        return NEGATIVE_ONE;
    }

    /*
     * Unable to fully structure code
     */
    private static Object js_of(Context var0, Scriptable var1_1, Scriptable var2_2, Object[] var3_3) {
        var2_2 = NativeArray.callConstructorOrCreateArray(var0, var1_1, var2_2, var3_3.length, true);
        var7_4 = var0.getLanguageVersion();
        var6_5 = 0;
        var5_6 = 0;
        var4_7 = var6_5;
        if (var7_4 < 200) ** GOTO lbl-1000
        var4_7 = var6_5;
        if (var2_2 instanceof ScriptableObject) {
            var1_1 = ScriptableObject.buildDataDescriptor(var2_2, null, 0);
            for (var4_7 = var5_6; var4_7 < var3_3.length; ++var4_7) {
                var1_1.put("value", var1_1, var3_3[var4_7]);
                ((ScriptableObject)var2_2).defineOwnProperty(var0, var4_7, (ScriptableObject)var1_1);
            }
        } else lbl-1000:
        // 3 sources

        {
            while (var4_7 < var3_3.length) {
                NativeArray.defineElem(var0, var2_2, var4_7, var3_3[var4_7]);
                ++var4_7;
            }
        }
        NativeArray.setLengthProperty(var0, var2_2, var3_3.length);
        return var2_2;
    }

    private static Object js_pop(Context object, Scriptable objectArray, Scriptable scriptable, Object[] objectArray2) {
        long l2;
        if ((scriptable = ScriptRuntime.toObject((Context)object, (Scriptable)objectArray, scriptable)) instanceof NativeArray) {
            objectArray = (NativeArray)scriptable;
            if (objectArray.denseOnly && (l2 = objectArray.length) > 0L) {
                objectArray.length = --l2;
                ++objectArray.modCount;
                objectArray = objectArray.dense;
                object = objectArray[(int)l2];
                objectArray[(int)l2] = Scriptable.NOT_FOUND;
                return object;
            }
        }
        if ((l2 = NativeArray.getLengthProperty((Context)object, scriptable)) > 0L) {
            objectArray = NativeArray.getElem((Context)object, scriptable, --l2);
            NativeArray.deleteElem(scriptable, l2);
        } else {
            objectArray = Undefined.instance;
        }
        NativeArray.setLengthProperty((Context)object, scriptable, l2);
        return objectArray;
    }

    private static Object js_push(Context object, Scriptable object2, Scriptable object32, Object[] objectArray) {
        object32 = ScriptRuntime.toObject((Context)object, (Scriptable)object2, object32);
        boolean bl = object32 instanceof NativeArray;
        int n2 = 0;
        if (bl) {
            object2 = (NativeArray)object32;
            if (((NativeArray)object2).denseOnly && super.ensureCapacity((int)((NativeArray)object2).length + objectArray.length)) {
                for (Object object32 : objectArray) {
                    object = ((NativeArray)object2).dense;
                    long l2 = ((NativeArray)object2).length;
                    ((NativeArray)object2).length = 1L + l2;
                    object[(int)l2] = object32;
                    ++((NativeArray)object2).modCount;
                }
                return ScriptRuntime.wrapNumber(((NativeArray)object2).length);
            }
        }
        long l3 = NativeArray.getLengthProperty((Context)object, (Scriptable)object32);
        for (int i2 = n2; i2 < objectArray.length; ++i2) {
            NativeArray.setElem((Context)object, (Scriptable)object32, (long)i2 + l3, objectArray[i2]);
        }
        object2 = NativeArray.setLengthProperty((Context)object, (Scriptable)object32, l3 + (long)objectArray.length);
        if (object.getLanguageVersion() == 120) {
            object = objectArray.length == 0 ? Undefined.instance : objectArray[objectArray.length - 1];
            return object;
        }
        return object2;
    }

    private static Scriptable js_reverse(Context object, Scriptable scriptable, Scriptable object2, Object[] objectArray) {
        if ((scriptable = ScriptRuntime.toObject((Context)object, scriptable, object2)) instanceof NativeArray) {
            object2 = (NativeArray)scriptable;
            if (((NativeArray)object2).denseOnly) {
                int n2 = 0;
                for (int i2 = (int)((NativeArray)object2).length - 1; n2 < i2; ++n2, --i2) {
                    objectArray = ((NativeArray)object2).dense;
                    object = objectArray[n2];
                    objectArray[n2] = objectArray[i2];
                    objectArray[i2] = object;
                }
                return scriptable;
            }
        }
        long l2 = NativeArray.getLengthProperty((Context)object, scriptable);
        long l3 = l2 / 2L;
        for (long i4 = 0L; i4 < l3; ++i4) {
            long l4 = l2 - i4 - 1L;
            object2 = NativeArray.getRawElem(scriptable, i4);
            NativeArray.setRawElem((Context)object, scriptable, i4, NativeArray.getRawElem(scriptable, l4));
            NativeArray.setRawElem((Context)object, scriptable, l4, object2);
        }
        return scriptable;
    }

    private static Object js_shift(Context object, Scriptable object2, Scriptable object3, Object[] object4) {
        long l2;
        if ((object3 = ScriptRuntime.toObject((Context)object, (Scriptable)object2, object3)) instanceof NativeArray) {
            object4 = (NativeArray)object3;
            if (object4.denseOnly && (l2 = object4.length) > 0L) {
                object4.length = --l2;
                ++object4.modCount;
                object = object4.dense;
                object2 = object[0];
                System.arraycopy(object, 1, object, 0, (int)l2);
                object = object4.dense;
                int n2 = (int)object4.length;
                object[n2] = object3 = Scriptable.NOT_FOUND;
                object = object2;
                if (object2 == object3) {
                    object = Undefined.instance;
                }
                return object;
            }
        }
        if ((l2 = NativeArray.getLengthProperty((Context)object, (Scriptable)object3)) > 0L) {
            long l3 = l2 - 1L;
            object2 = NativeArray.getElem((Context)object, (Scriptable)object3, 0L);
            if (l3 > 0L) {
                for (l2 = 1L; l2 <= l3; ++l2) {
                    NativeArray.setRawElem((Context)object, (Scriptable)object3, l2 - 1L, NativeArray.getRawElem((Scriptable)object3, l2));
                }
            }
            NativeArray.deleteElem((Scriptable)object3, l3);
            l2 = l3;
        } else {
            object2 = Undefined.instance;
        }
        NativeArray.setLengthProperty((Context)object, (Scriptable)object3, l2);
        return object2;
    }

    private static Scriptable js_slice(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] object) {
        long l2;
        long l3;
        long l4;
        scriptable2 = ScriptRuntime.toObject(context, scriptable, scriptable2);
        long l5 = NativeArray.getLengthProperty(context, scriptable2);
        if (((Object[])object).length == 0) {
            l4 = 0L;
            l3 = l5;
        } else {
            l2 = NativeArray.toSliceIndex(ScriptRuntime.toInteger(object[0]), l5);
            l3 = l5;
            l4 = l2;
            if (((Object[])object).length != 1) {
                if (object[1] == Undefined.instance) {
                    l3 = l5;
                    l4 = l2;
                } else {
                    l3 = NativeArray.toSliceIndex(ScriptRuntime.toInteger(object[1]), l5);
                    l4 = l2;
                }
            }
        }
        l2 = l3 - l4;
        if (l2 <= Integer.MAX_VALUE) {
            scriptable = context.newArray(scriptable, 0);
            for (l5 = l4; l5 < l3; ++l5) {
                object = NativeArray.getRawElem(scriptable2, l5);
                if (object == Scriptable.NOT_FOUND) continue;
                NativeArray.defineElem(context, scriptable, l5 - l4, object);
            }
            NativeArray.setLengthProperty(context, scriptable, Math.max(0L, l2));
            return scriptable;
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
    }

    private static Scriptable js_sort(Context context, Scriptable object, Scriptable scriptable, Object[] objectArray) {
        scriptable = ScriptRuntime.toObject(context, (Scriptable)object, scriptable);
        int n2 = objectArray.length;
        int n3 = 0;
        if (n2 > 0 && Undefined.instance != objectArray[0]) {
            Callable callable = ScriptRuntime.getValueFunctionAndThis(objectArray[0], context);
            objectArray = ScriptRuntime.lastStoredScriptable(context);
            object = new NativeArray$ElementComparator(new NativeArray$1(new Object[2], callable, context, (Scriptable)object, (Scriptable)objectArray));
        } else {
            object = DEFAULT_COMPARATOR;
        }
        long l2 = NativeArray.getLengthProperty(context, scriptable);
        int n4 = (int)l2;
        if (l2 == (long)n4) {
            objectArray = new Object[n4];
            for (n2 = 0; n2 != n4; ++n2) {
                objectArray[n2] = NativeArray.getRawElem(scriptable, n2);
            }
            Sorting.get().hybridSort(objectArray, (Comparator<Object>)object);
            for (n2 = n3; n2 < n4; ++n2) {
                NativeArray.setRawElem(context, scriptable, n2, objectArray[n2]);
            }
            return scriptable;
        }
        throw Context.reportRuntimeErrorById("msg.arraylength.too.big", String.valueOf(l2));
    }

    private static Object js_splice(Context objectArray, Scriptable object, Scriptable objectArray2, Object[] objectArray3) {
        long l2;
        long l3;
        boolean bl;
        Scriptable scriptable = ScriptRuntime.toObject((Context)objectArray, (Scriptable)object, objectArray2);
        if (scriptable instanceof NativeArray) {
            objectArray2 = (NativeArray)scriptable;
            bl = objectArray2.denseOnly;
        } else {
            objectArray2 = null;
            bl = false;
        }
        Object object2 = ScriptableObject.getTopLevelScope((Scriptable)object);
        int n2 = objectArray3.length;
        if (n2 == 0) {
            return objectArray.newArray((Scriptable)object2, 0);
        }
        long l4 = NativeArray.getLengthProperty((Context)objectArray, scriptable);
        long l5 = NativeArray.toSliceIndex(ScriptRuntime.toInteger(objectArray3[0]), l4);
        --n2;
        if (objectArray3.length == 1) {
            l3 = l4 - l5;
        } else {
            double d2 = ScriptRuntime.toInteger(objectArray3[1]);
            if (d2 < 0.0) {
                l2 = 0L;
            } else {
                l2 = l4 - l5;
                if (!(d2 > (double)l2)) {
                    l2 = (long)d2;
                }
            }
            --n2;
            l3 = l2;
        }
        l2 = l5 + l3;
        long l6 = n2;
        long l7 = l6 - l3;
        long l8 = l4 + l7;
        if (!((double)l8 > 9.007199254740991E15)) {
            if (l3 <= Integer.MAX_VALUE) {
                int n3;
                if (l3 != 0L) {
                    if (l3 == 1L && objectArray.getLanguageVersion() == 120) {
                        object = NativeArray.getElem((Context)objectArray, scriptable, l5);
                    } else if (bl) {
                        n3 = (int)(l2 - l5);
                        object = new Object[n3];
                        System.arraycopy(objectArray2.dense, (int)l5, object, 0, n3);
                        object = objectArray.newArray((Scriptable)object2, (Object[])object);
                    } else {
                        object = objectArray.newArray((Scriptable)object2, 0);
                        for (l3 = l5; l3 != l2; ++l3) {
                            object2 = NativeArray.getRawElem(scriptable, l3);
                            if (object2 == Scriptable.NOT_FOUND) continue;
                            NativeArray.setElem((Context)objectArray, (Scriptable)object, l3 - l5, object2);
                        }
                        NativeArray.setLengthProperty((Context)objectArray, (Scriptable)object, l2 - l5);
                    }
                } else {
                    object = objectArray.getLanguageVersion() == 120 ? Undefined.instance : objectArray.newArray((Scriptable)object2, 0);
                }
                if (bl && l8 < Integer.MAX_VALUE && super.ensureCapacity(n3 = (int)l8)) {
                    objectArray = objectArray2.dense;
                    System.arraycopy(objectArray, (int)l2, objectArray, (int)(l5 + l6), (int)(l4 - l2));
                    if (n2 > 0) {
                        System.arraycopy(objectArray3, 2, objectArray2.dense, (int)l5, n2);
                    }
                    if (l7 < 0L) {
                        Arrays.fill(objectArray2.dense, n3, (int)l4, Scriptable.NOT_FOUND);
                    }
                    objectArray2.length = l8;
                    ++objectArray2.modCount;
                    return object;
                }
                long l9 = l7 - 0L;
                n3 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
                if (n3 > 0) {
                    for (l3 = l4 - 1L; l3 >= l2; --l3) {
                        NativeArray.setRawElem((Context)objectArray, scriptable, l3 + l7, NativeArray.getRawElem(scriptable, l3));
                    }
                } else if (n3 < 0) {
                    while (l2 < l4) {
                        NativeArray.setRawElem((Context)objectArray, scriptable, l2 + l7, NativeArray.getRawElem(scriptable, l2));
                        ++l2;
                    }
                    objectArray2 = object;
                    l2 = l4 - 1L;
                    while (true) {
                        object = objectArray2;
                        if (l2 < l8) break;
                        NativeArray.deleteElem(scriptable, l2);
                        --l2;
                    }
                }
                int n4 = objectArray3.length;
                for (n3 = 0; n3 < n2; ++n3) {
                    NativeArray.setElem((Context)objectArray, scriptable, (long)n3 + l5, objectArray3[n3 + (n4 - n2)]);
                }
                NativeArray.setLengthProperty((Context)objectArray, scriptable, l8);
                return object;
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
        throw ScriptRuntime.typeErrorById("msg.arraylength.too.big", l8);
    }

    private static Object js_unshift(Context objectArray, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray2) {
        scriptable2 = ScriptRuntime.toObject((Context)objectArray, scriptable, scriptable2);
        boolean bl = scriptable2 instanceof NativeArray;
        int n2 = 0;
        if (bl) {
            scriptable = (NativeArray)scriptable2;
            if (((NativeArray)scriptable).denseOnly && super.ensureCapacity((int)((NativeArray)scriptable).length + objectArray2.length)) {
                long l2;
                objectArray = ((NativeArray)scriptable).dense;
                System.arraycopy(objectArray, 0, objectArray, objectArray2.length, (int)((NativeArray)scriptable).length);
                System.arraycopy(objectArray2, 0, ((NativeArray)scriptable).dense, 0, objectArray2.length);
                ((NativeArray)scriptable).length = l2 = ((NativeArray)scriptable).length + (long)objectArray2.length;
                ++((NativeArray)scriptable).modCount;
                return ScriptRuntime.wrapNumber(l2);
            }
        }
        long l3 = NativeArray.getLengthProperty((Context)objectArray, scriptable2);
        int n3 = objectArray2.length;
        if (n3 > 0) {
            long l4 = n3;
            long l5 = l3 + l4;
            if (!((double)l5 > 9.007199254740991E15)) {
                int n4 = n2;
                if (l3 > 0L) {
                    l5 = l3 - 1L;
                    while (true) {
                        n4 = n2;
                        if (l5 < 0L) break;
                        NativeArray.setRawElem((Context)objectArray, scriptable2, l5 + l4, NativeArray.getRawElem(scriptable2, l5));
                        --l5;
                    }
                }
                while (n4 < objectArray2.length) {
                    NativeArray.setElem((Context)objectArray, scriptable2, n4, objectArray2[n4]);
                    ++n4;
                }
            } else {
                throw ScriptRuntime.typeErrorById("msg.arraylength.too.big", l5);
            }
        }
        return NativeArray.setLengthProperty((Context)objectArray, scriptable2, l3 + (long)n3);
    }

    private static Object reduceMethod(Context context, int n2, Scriptable object, Scriptable object2, Object[] object3) {
        Scriptable scriptable = ScriptRuntime.toObject(context, (Scriptable)object, object2);
        long l2 = NativeArray.getLengthProperty(context, scriptable);
        object = ((Object[])object3).length > 0 ? object3[0] : Undefined.instance;
        if (object != null && object instanceof Function) {
            Function function = (Function)object;
            Scriptable scriptable2 = ScriptableObject.getTopLevelScope(function);
            n2 = n2 == 24 ? 1 : 0;
            object = ((Object[])object3).length > 1 ? object3[1] : Scriptable.NOT_FOUND;
            for (long i2 = 0L; i2 < l2; ++i2) {
                long l3 = n2 != 0 ? i2 : l2 - 1L - i2;
                object2 = NativeArray.getRawElem(scriptable, l3);
                if (object2 == (object3 = Scriptable.NOT_FOUND)) continue;
                if (object == object3) {
                    object = object2;
                    continue;
                }
                object = function.call(context, scriptable2, scriptable2, new Object[]{object, object2, l3, scriptable});
            }
            if (object != Scriptable.NOT_FOUND) {
                return object;
            }
            throw ScriptRuntime.typeErrorById("msg.empty.array.reduce", new Object[0]);
        }
        throw ScriptRuntime.notFunctionError(object);
    }

    private static void setElem(Context context, Scriptable scriptable, long l2, Object object) {
        if (l2 > Integer.MAX_VALUE) {
            ScriptableObject.putProperty(scriptable, Long.toString(l2), object);
        } else {
            ScriptableObject.putProperty(scriptable, (int)l2, object);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void setLength(Object var1_1) {
        block9: {
            block11: {
                block10: {
                    if ((this.lengthAttr & 1) != 0) {
                        return;
                    }
                    var4_2 = ScriptRuntime.toNumber(var1_1);
                    var11_3 = ScriptRuntime.toUint32(var4_2);
                    var2_4 = var11_3;
                    var6_5 = 0;
                    if (var2_4 != var4_2) break block9;
                    if (!this.denseOnly) break block10;
                    var9_6 = this.length;
                    if (var11_3 < var9_6) {
                        var1_1 = this.dense;
                        Arrays.fill(var1_1, (int)var11_3, var1_1.length, Scriptable.NOT_FOUND);
lbl13:
                        // 5 sources

                        while (true) {
                            this.length = var11_3;
                            ++this.modCount;
                            return;
                        }
                    }
                    if (var11_3 < 0x55555554L && var2_4 < (double)var9_6 * 1.5 && this.ensureCapacity((int)var11_3)) ** GOTO lbl13
                    this.denseOnly = false;
                }
                if (var11_3 >= (var9_6 = this.length)) ** GOTO lbl13
                if (var9_6 - var11_3 <= 4096L) break block11;
                var1_1 = this.getIds();
                var7_7 = var1_1.length;
                while (true) {
                    if (var6_5 >= var7_7) ** GOTO lbl13
                    var13_9 = var1_1[var6_5];
                    if (var13_9 instanceof String) {
                        if (NativeArray.toArrayIndex((String)(var13_9 = (String)var13_9)) >= var11_3) {
                            this.delete((String)var13_9);
                        }
                    } else {
                        var8_8 = (Integer)var13_9;
                        if ((long)var8_8 >= var11_3) {
                            this.delete(var8_8);
                        }
                    }
                    ++var6_5;
                }
            }
            var9_6 = var11_3;
            while (true) {
                if (var9_6 < this.length) ** break;
                ** continue;
                NativeArray.deleteElem(this, var9_6);
                ++var9_6;
            }
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
    }

    private static Object setLengthProperty(Context object, Scriptable scriptable, long l2) {
        object = ScriptRuntime.wrapNumber(l2);
        ScriptableObject.putProperty(scriptable, "length", object);
        return object;
    }

    static void setMaximumInitialCapacity(int n2) {
        maximumInitialCapacity = n2;
    }

    private static void setRawElem(Context context, Scriptable scriptable, long l2, Object object) {
        if (object == Scriptable.NOT_FOUND) {
            NativeArray.deleteElem(scriptable, l2);
        } else {
            NativeArray.setElem(context, scriptable, l2, object);
        }
    }

    private static long toArrayIndex(double d2) {
        long l2;
        if (!Double.isNaN(d2) && (double)(l2 = ScriptRuntime.toUint32(d2)) == d2 && l2 != 0xFFFFFFFFL) {
            return l2;
        }
        return -1L;
    }

    private static long toArrayIndex(Object object) {
        if (object instanceof String) {
            return NativeArray.toArrayIndex((String)object);
        }
        if (object instanceof Number) {
            return NativeArray.toArrayIndex(((Number)object).doubleValue());
        }
        return -1L;
    }

    private static long toArrayIndex(String string) {
        long l2 = NativeArray.toArrayIndex(ScriptRuntime.toNumber(string));
        if (Long.toString(l2).equals(string)) {
            return l2;
        }
        return -1L;
    }

    private static int toDenseIndex(Object object) {
        long l2 = NativeArray.toArrayIndex(object);
        int n2 = 0L <= l2 && l2 < Integer.MAX_VALUE ? (int)l2 : -1;
        return n2;
    }

    private static long toSliceIndex(double d2, long l2) {
        block4: {
            double d3;
            block3: {
                block2: {
                    if (!(d2 < 0.0)) break block2;
                    d3 = d2 += (double)l2;
                    if (!(d2 < 0.0)) break block3;
                    l2 = 0L;
                    break block4;
                }
                d3 = d2;
                if (d2 > (double)l2) break block4;
            }
            l2 = (long)d3;
        }
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String toStringHelper(Context context, Scriptable scriptable, Scriptable object, boolean bl, boolean bl2) {
        long l2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        String string;
        Scriptable scriptable2 = ScriptRuntime.toObject(context, scriptable, object);
        long l3 = NativeArray.getLengthProperty(context, scriptable2);
        StringBuilder stringBuilder = new StringBuilder(256);
        if (bl) {
            stringBuilder.append('[');
            string = ", ";
        } else {
            string = ",";
        }
        object = context.iterating;
        if (object == null) {
            context.iterating = new ObjToIntMap(31);
            bl5 = false;
            bl4 = true;
        } else {
            bl5 = ((ObjToIntMap)object).has(scriptable2);
            bl4 = false;
        }
        if (!bl5) {
            try {
                context.iterating.put(scriptable2, 0);
                boolean bl6 = !bl || context.getLanguageVersion() < 150;
                bl3 = false;
                for (l2 = 0L; l2 < l3; ++l2) {
                    Object object2;
                    if (l2 > 0L) {
                        stringBuilder.append(string);
                    }
                    if ((object2 = NativeArray.getRawElem(scriptable2, l2)) != Scriptable.NOT_FOUND && (!bl6 || object2 != null && object2 != Undefined.instance)) {
                        if (bl) {
                            object = ScriptRuntime.uneval(context, scriptable, object2);
                        } else if (object2 instanceof String) {
                            object = (String)object2;
                        } else {
                            object = object2;
                            if (bl2) {
                                object = ScriptRuntime.getPropFunctionAndThis(object2, "toLocaleString", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.emptyArgs);
                            }
                            object = ScriptRuntime.toString(object);
                        }
                        stringBuilder.append((String)object);
                        bl3 = true;
                        continue;
                    }
                    bl3 = false;
                }
                context.iterating.remove(scriptable2);
            }
            finally {
                if (bl4) {
                    context.iterating = null;
                }
            }
        } else {
            bl3 = false;
            l2 = 0L;
        }
        if (!bl) return stringBuilder.toString();
        if (!bl3 && l2 > 0L) {
            stringBuilder.append(", ]");
            return stringBuilder.toString();
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void add(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        boolean bl = this.indexOf(object) > -1;
        return bl;
    }

    @Override
    public boolean containsAll(Collection object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    protected void defineOwnProperty(Context context, Object object, ScriptableObject scriptableObject, boolean bl) {
        Object[] objectArray;
        long l2 = NativeArray.toArrayIndex(object);
        if (l2 >= this.length) {
            this.length = 1L + l2;
            ++this.modCount;
        }
        if (l2 != -1L && (objectArray = this.dense) != null) {
            this.dense = null;
            this.denseOnly = false;
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                if (objectArray[i2] == Scriptable.NOT_FOUND) continue;
                if (!this.isExtensible()) {
                    this.setAttributes(i2, 0);
                }
                this.put(i2, (Scriptable)this, objectArray[i2]);
            }
        }
        super.defineOwnProperty(context, object, scriptableObject, bl);
        if ("length".equals(object)) {
            this.lengthAttr = this.getAttributes("length");
        }
    }

    @Override
    public void delete(int n2) {
        Object[] objectArray = this.dense;
        if (!(objectArray == null || n2 < 0 || n2 >= objectArray.length || this.isSealed() || !this.denseOnly && this.isGetterOrSetter(null, n2, true))) {
            this.dense[n2] = Scriptable.NOT_FOUND;
        } else {
            super.delete(n2);
        }
    }

    @Override
    public void delete(Symbol symbol) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            super.delete("values");
        }
        super.delete(symbol);
    }

    /*
     * Exception decompiling
     */
    @Override
    public Object execIdCall(IdFunctionObject var1_1, Context var2_2, Scriptable var3_3, Scriptable var4_4, Object[] var5_5) {
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

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object object = ARRAY_TAG;
        this.addIdFunctionProperty(idFunctionObject, object, -5, "join", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -6, "reverse", 0);
        this.addIdFunctionProperty(idFunctionObject, object, -7, "sort", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -8, "push", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -9, "pop", 0);
        this.addIdFunctionProperty(idFunctionObject, object, -10, "shift", 0);
        this.addIdFunctionProperty(idFunctionObject, object, -11, "unshift", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -12, "splice", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -13, "concat", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -14, "slice", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -15, "indexOf", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -16, "lastIndexOf", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -17, "every", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -18, "filter", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -19, "forEach", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -20, "map", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -21, "some", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -22, "find", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -23, "findIndex", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -24, "reduce", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -25, "reduceRight", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -26, "isArray", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -27, "of", 0);
        this.addIdFunctionProperty(idFunctionObject, object, -28, "from", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        if (string.equals("length")) {
            return IdScriptableObject.instanceIdInfo(this.lengthAttr, 1);
        }
        return super.findInstanceIdInfo(string);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 21;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1943291465: {
                if (!string.equals("indexOf")) break;
                n4 = 33;
                break;
            }
            case 1099846370: {
                if (!string.equals("reverse")) break;
                n4 = 32;
                break;
            }
            case 965561430: {
                if (!string.equals("reduceRight")) break;
                n4 = 31;
                break;
            }
            case 409595545: {
                if (!string.equals("findIndex")) break;
                n4 = 30;
                break;
            }
            case 109526418: {
                if (!string.equals("slice")) break;
                n4 = 29;
                break;
            }
            case 109407362: {
                if (!string.equals("shift")) break;
                n4 = 28;
                break;
            }
            case 96891675: {
                if (!string.equals("every")) break;
                n4 = 27;
                break;
            }
            case 90259659: {
                if (!string.equals("includes")) break;
                n4 = 26;
                break;
            }
            case 3536286: {
                if (!string.equals("sort")) break;
                n4 = 25;
                break;
            }
            case 3536116: {
                if (!string.equals("some")) break;
                n4 = 24;
                break;
            }
            case 3452698: {
                if (!string.equals("push")) break;
                n4 = 23;
                break;
            }
            case 3288564: {
                if (!string.equals("keys")) break;
                n4 = 22;
                break;
            }
            case 3267882: {
                if (!string.equals("join")) break;
                n4 = 21;
                break;
            }
            case 3145593: {
                if (!string.equals("flat")) break;
                n4 = 20;
                break;
            }
            case 3143097: {
                if (!string.equals("find")) break;
                n4 = 19;
                break;
            }
            case 3143043: {
                if (!string.equals("fill")) break;
                n4 = 18;
                break;
            }
            case 111185: {
                if (!string.equals("pop")) break;
                n4 = 17;
                break;
            }
            case 107868: {
                if (!string.equals("map")) break;
                n4 = 16;
                break;
            }
            case 3123: {
                if (!string.equals("at")) break;
                n4 = 15;
                break;
            }
            case -277637751: {
                if (!string.equals("unshift")) break;
                n4 = 14;
                break;
            }
            case -467511597: {
                if (!string.equals("lastIndexOf")) break;
                n4 = 13;
                break;
            }
            case -678635926: {
                if (!string.equals("forEach")) break;
                n4 = 12;
                break;
            }
            case -778842333: {
                if (!string.equals("flatMap")) break;
                n4 = 11;
                break;
            }
            case -807660480: {
                if (!string.equals("copyWithin")) break;
                n4 = 10;
                break;
            }
            case -823812830: {
                if (!string.equals("values")) break;
                n4 = 9;
                break;
            }
            case -895859076: {
                if (!string.equals("splice")) break;
                n4 = 8;
                break;
            }
            case -934873754: {
                if (!string.equals("reduce")) break;
                n4 = 7;
                break;
            }
            case -1274492040: {
                if (!string.equals("filter")) break;
                n4 = 6;
                break;
            }
            case -1354795244: {
                if (!string.equals("concat")) break;
                n4 = 5;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 4;
                break;
            }
            case -1591573360: {
                if (!string.equals("entries")) break;
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
            case 33: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 31: {
                n3 = 25;
                break;
            }
            case 30: {
                n3 = 23;
                break;
            }
            case 29: {
                n3 = 14;
                break;
            }
            case 28: {
                n3 = 10;
                break;
            }
            case 27: {
                n3 = 17;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 25: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 22: {
                n3 = 27;
                break;
            }
            case 21: {
                n3 = 5;
                break;
            }
            case 20: {
                n3 = 33;
                break;
            }
            case 19: {
                n3 = 22;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 17: {
                n3 = 9;
                break;
            }
            case 16: {
                n3 = 20;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 14: {
                n3 = 11;
                break;
            }
            case 13: {
                n3 = 16;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 11: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 9: {
                n3 = 28;
                break;
            }
            case 8: {
                n3 = 12;
                break;
            }
            case 7: {
                n3 = 24;
                break;
            }
            case 6: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 29;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 0: {
                n3 = 3;
            }
            case 24: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 28;
        }
        return 0;
    }

    public Object get(int n2) {
        return this.get((long)n2);
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        if (!this.denseOnly && this.isGetterOrSetter(null, n2, false)) {
            return super.get(n2, scriptable);
        }
        Object[] objectArray = this.dense;
        if (objectArray != null && n2 >= 0 && n2 < objectArray.length) {
            return objectArray[n2];
        }
        return super.get(n2, scriptable);
    }

    public Object get(long l2) {
        if (l2 >= 0L && l2 < this.length) {
            Object object = NativeArray.getRawElem(this, l2);
            if (object != Scriptable.NOT_FOUND && object != Undefined.instance) {
                Object object2 = object;
                if (object instanceof Wrapper) {
                    object2 = ((Wrapper)object).unwrap();
                }
                return object2;
            }
            return null;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return super.get("values", scriptable);
        }
        return super.get(symbol, scriptable);
    }

    @Override
    public int getAttributes(int n2) {
        Object[] objectArray = this.dense;
        if (objectArray != null && n2 >= 0 && n2 < objectArray.length && objectArray[n2] != Scriptable.NOT_FOUND) {
            return 0;
        }
        return super.getAttributes(n2);
    }

    @Override
    public String getClassName() {
        return "Array";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        if (clazz == ScriptRuntime.NumberClass && Context.getContext().getLanguageVersion() == 120) {
            return this.length;
        }
        return super.getDefaultValue(clazz);
    }

    @Override
    public Object[] getIds(boolean bl, boolean bl2) {
        Object[] objectArray = super.getIds(bl, bl2);
        Object[] objectArray2 = this.dense;
        if (objectArray2 == null) {
            return objectArray;
        }
        int n2 = objectArray2.length;
        long l2 = this.length;
        int n3 = n2;
        if ((long)n2 > l2) {
            n3 = (int)l2;
        }
        if (n3 == 0) {
            return objectArray;
        }
        int n4 = objectArray.length;
        Object[] objectArray3 = new Object[n3 + n4];
        int n5 = 0;
        for (n2 = 0; n2 != n3; ++n2) {
            int n6 = n5;
            if (this.dense[n2] != Scriptable.NOT_FOUND) {
                objectArray3[n5] = n2;
                n6 = n5 + 1;
            }
            n5 = n6;
        }
        objectArray2 = objectArray3;
        if (n5 != n3) {
            objectArray2 = new Object[n5 + n4];
            System.arraycopy(objectArray3, 0, objectArray2, 0, n5);
        }
        System.arraycopy(objectArray, 0, objectArray2, n5, n4);
        return objectArray2;
    }

    public List<Integer> getIndexIds() {
        Object[] objectArray = this.getIds();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(objectArray.length);
        for (Object object : objectArray) {
            int n2 = ScriptRuntime.toInt32(object);
            if (n2 < 0 || !ScriptRuntime.toString(n2).equals(ScriptRuntime.toString(object))) continue;
            arrayList.add(n2);
        }
        return arrayList;
    }

    @Override
    protected String getInstanceIdName(int n2) {
        if (n2 == 1) {
            return "length";
        }
        return super.getInstanceIdName(n2);
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        if (n2 == 1) {
            return ScriptRuntime.wrapNumber(this.length);
        }
        return super.getInstanceIdValue(n2);
    }

    public long getLength() {
        return this.length;
    }

    @Override
    protected int getMaxInstanceId() {
        return 1;
    }

    @Override
    protected ScriptableObject getOwnPropertyDescriptor(Context context, Object object) {
        Object[] objectArray;
        int n2;
        if (this.dense != null && (n2 = NativeArray.toDenseIndex(object)) >= 0 && n2 < (objectArray = this.dense).length && objectArray[n2] != Scriptable.NOT_FOUND) {
            return this.defaultIndexPropertyDescriptor(objectArray[n2]);
        }
        return super.getOwnPropertyDescriptor(context, object);
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        boolean bl = this.denseOnly;
        boolean bl2 = false;
        if (!bl && this.isGetterOrSetter(null, n2, false)) {
            return super.has(n2, scriptable);
        }
        Object[] objectArray = this.dense;
        if (objectArray != null && n2 >= 0 && n2 < objectArray.length) {
            if (objectArray[n2] != Scriptable.NOT_FOUND) {
                bl2 = true;
            }
            return bl2;
        }
        return super.has(n2, scriptable);
    }

    @Override
    public boolean has(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return super.has("values", scriptable);
        }
        return super.has(symbol, scriptable);
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        int n3 = this.size();
        int n4 = 0;
        if (object == null) {
            for (n2 = n4; n2 < n3; ++n2) {
                if (this.get(n2) != null) continue;
                return n2;
            }
        } else {
            for (n2 = 0; n2 < n3; ++n2) {
                if (!object.equals(this.get(n2))) continue;
                return n2;
            }
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block37: {
            block36: {
                switch (var1_1) {
                    default: {
                        throw new IllegalArgumentException(String.valueOf(var1_1));
                    }
                    case 34: {
                        var3_2 = "flatMap";
                        break block36;
                    }
                    case 33: {
                        var3_2 = "flat";
                        ** GOTO lbl103
                    }
                    case 32: {
                        var3_2 = "at";
                        break block36;
                    }
                    case 31: {
                        var3_2 = "copyWithin";
                        ** GOTO lbl72
                    }
                    case 30: {
                        var3_2 = "includes";
                        break block36;
                    }
                    case 29: {
                        var3_2 = "entries";
                        ** GOTO lbl103
                    }
                    case 28: {
                        var3_2 = "values";
                        ** GOTO lbl103
                    }
                    case 27: {
                        var3_2 = "keys";
                        ** GOTO lbl103
                    }
                    case 26: {
                        var3_2 = "fill";
                        break block36;
                    }
                    case 25: {
                        var3_2 = "reduceRight";
                        break block36;
                    }
                    case 24: {
                        var3_2 = "reduce";
                        break block36;
                    }
                    case 23: {
                        var3_2 = "findIndex";
                        break block36;
                    }
                    case 22: {
                        var3_2 = "find";
                        break block36;
                    }
                    case 21: {
                        var3_2 = "some";
                        break block36;
                    }
                    case 20: {
                        var3_2 = "map";
                        break block36;
                    }
                    case 19: {
                        var3_2 = "forEach";
                        break block36;
                    }
                    case 18: {
                        var3_2 = "filter";
                        break block36;
                    }
                    case 17: {
                        var3_2 = "every";
                        break block36;
                    }
                    case 16: {
                        var3_2 = "lastIndexOf";
                        break block36;
                    }
                    case 15: {
                        var3_2 = "indexOf";
                        break block36;
                    }
                    case 14: {
                        var3_2 = "slice";
                        ** GOTO lbl72
                    }
                    case 13: {
                        var3_2 = "concat";
                        break block36;
                    }
                    case 12: {
                        var3_2 = "splice";
lbl72:
                        // 3 sources

                        var2_3 = 2;
                        break block37;
                    }
                    case 11: {
                        var3_2 = "unshift";
                        break block36;
                    }
                    case 10: {
                        var3_2 = "shift";
                        ** GOTO lbl103
                    }
                    case 9: {
                        var3_2 = "pop";
                        ** GOTO lbl103
                    }
                    case 8: {
                        var3_2 = "push";
                        break block36;
                    }
                    case 7: {
                        var3_2 = "sort";
                        break block36;
                    }
                    case 6: {
                        var3_2 = "reverse";
                        ** GOTO lbl103
                    }
                    case 5: {
                        var3_2 = "join";
                        break block36;
                    }
                    case 4: {
                        var3_2 = "toSource";
                        ** GOTO lbl103
                    }
                    case 3: {
                        var3_2 = "toLocaleString";
                        ** GOTO lbl103
                    }
                    case 2: {
                        var3_2 = "toString";
lbl103:
                        // 10 sources

                        var2_3 = 0;
                        break block37;
                    }
                    case 1: 
                }
                var3_2 = "constructor";
            }
            var2_3 = 1;
        }
        this.initPrototypeMethod(NativeArray.ARRAY_TAG, var1_1, var3_2, null, var2_3);
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.length == 0L;
        return bl;
    }

    @Override
    public Iterator iterator() {
        return this.listIterator(0);
    }

    @Deprecated
    public long jsGet_length() {
        return this.getLength();
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object == null) {
            while (n2 >= 0) {
                if (this.get(n2) == null) {
                    return n2;
                }
                --n2;
            }
        } else {
            for (int i2 = n2 = this.size() - 1; i2 >= 0; --i2) {
                if (!object.equals(this.get(i2))) continue;
                return i2;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    public ListIterator listIterator(int n2) {
        int n3 = this.size();
        if (n2 >= 0 && n2 <= n3) {
            return new NativeArray$2(this, n2, n3);
        }
        throw new IndexOutOfBoundsException(r.a("Index: ", n2));
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        long l2;
        long l3;
        if (!(scriptable != this || this.isSealed() || this.dense == null || n2 < 0 || !this.denseOnly && this.isGetterOrSetter(null, n2, true))) {
            if (!this.isExtensible() && this.length <= (long)n2) {
                return;
            }
            Object[] objectArray = this.dense;
            if (n2 < objectArray.length) {
                objectArray[n2] = object;
                long l4 = this.length;
                long l5 = n2;
                if (l4 <= l5) {
                    this.length = l5 + 1L;
                    ++this.modCount;
                }
                return;
            }
            if (this.denseOnly && (double)n2 < (double)objectArray.length * 1.5 && this.ensureCapacity(n2 + 1)) {
                this.dense[n2] = object;
                this.length = (long)n2 + 1L;
                ++this.modCount;
                return;
            }
            this.denseOnly = false;
        }
        super.put(n2, scriptable, object);
        if (scriptable == this && (this.lengthAttr & 1) == 0 && (l3 = this.length) <= (l2 = (long)n2)) {
            this.length = l2 + 1L;
            ++this.modCount;
        }
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        long l2;
        super.put(string, scriptable, object);
        if (scriptable == this && (l2 = NativeArray.toArrayIndex(string)) >= this.length) {
            this.length = l2 + 1L;
            ++this.modCount;
            this.denseOnly = false;
        }
    }

    @Override
    public void put(Symbol symbol, Scriptable scriptable, Object object) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            super.put("values", scriptable, object);
        }
        super.put(symbol, scriptable, object);
    }

    public Object remove(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object set(int n2, Object object) {
        throw new UnsupportedOperationException();
    }

    void setDenseOnly(boolean bl) {
        if (bl && !this.denseOnly) {
            throw new IllegalArgumentException();
        }
        this.denseOnly = bl;
    }

    @Override
    protected void setInstanceIdAttributes(int n2, int n3) {
        if (n2 == 1) {
            this.lengthAttr = n3;
        }
    }

    @Override
    protected void setInstanceIdValue(int n2, Object object) {
        if (n2 == 1) {
            this.setLength(object);
            return;
        }
        super.setInstanceIdValue(n2, object);
    }

    @Override
    public void setPrototype(Scriptable scriptable) {
        super.setPrototype(scriptable);
        if (!(scriptable instanceof NativeArray)) {
            this.setDenseOnly(false);
        }
    }

    @Override
    public int size() {
        long l2 = this.length;
        if (l2 <= Integer.MAX_VALUE) {
            return (int)l2;
        }
        StringBuilder stringBuilder = a.c("list.length (");
        stringBuilder.append(this.length);
        stringBuilder.append(") exceeds Integer.MAX_VALUE");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public List subList(int n2, int n3) {
        if (n2 >= 0) {
            if (n3 <= this.size()) {
                if (n2 <= n3) {
                    return new NativeArray$3(this, n2, n3);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fromIndex(");
                stringBuilder.append(n2);
                stringBuilder.append(") > toIndex(");
                stringBuilder.append(n3);
                stringBuilder.append(")");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new IndexOutOfBoundsException(r.a("toIndex = ", n3));
        }
        throw new IndexOutOfBoundsException(r.a("fromIndex = ", n2));
    }

    @Override
    public Object[] toArray() {
        return this.toArray(ScriptRuntime.emptyArgs);
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        int n2 = this.size();
        if (objectArray.length < n2) {
            objectArray = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n2);
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray[i2] = this.get(i2);
        }
        return objectArray;
    }
}

