/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.constant.Constable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.mozilla.javascript.AccessorSlot;
import org.mozilla.javascript.AccessorSlot$FunctionGetter;
import org.mozilla.javascript.AccessorSlot$FunctionSetter;
import org.mozilla.javascript.AccessorSlot$MemberBoxGetter;
import org.mozilla.javascript.AccessorSlot$MemberBoxSetter;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.ConstProperties;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.ExternalArrayData;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.LambdaFunction;
import org.mozilla.javascript.LambdaSlot;
import org.mozilla.javascript.LazilyLoadedCtor;
import org.mozilla.javascript.LazyLoadSlot;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntime$StringIdOrIndex;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject$KeyComparator;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMapContainer;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolScriptable;
import org.mozilla.javascript.ThreadSafeSlotMapContainer;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.TopLevel$NativeErrors;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import org.mozilla.javascript.annotations.JSStaticFunction;
import org.mozilla.javascript.debug.DebuggableObject;

public abstract class ScriptableObject
implements Scriptable,
SymbolScriptable,
Serializable,
DebuggableObject,
ConstProperties {
    static final boolean $assertionsDisabled = false;
    public static final int CONST = 13;
    public static final int DONTENUM = 2;
    public static final int EMPTY = 0;
    private static final Method GET_ARRAY_LENGTH;
    private static final Comparator<Object> KEY_COMPARATOR;
    public static final int PERMANENT = 4;
    public static final int READONLY = 1;
    public static final int UNINITIALIZED_CONST = 8;
    private static final long serialVersionUID = 2829861078851942586L;
    private volatile Map<Object, Object> associatedValues;
    private transient ExternalArrayData externalData;
    private boolean isExtensible = true;
    private boolean isSealed = false;
    private Scriptable parentScopeObject;
    private Scriptable prototypeObject;
    private transient SlotMapContainer slotMap;

    static {
        try {
            GET_ARRAY_LENGTH = ScriptableObject.class.getMethod("getExternalArrayLength", new Class[0]);
            KEY_COMPARATOR = new ScriptableObject$KeyComparator();
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException(noSuchMethodException);
        }
    }

    public ScriptableObject() {
        this.slotMap = ScriptableObject.createSlotMap(0);
    }

    public ScriptableObject(Scriptable scriptable, Scriptable scriptable2) {
        if (scriptable != null) {
            this.parentScopeObject = scriptable;
            this.prototypeObject = scriptable2;
            this.slotMap = ScriptableObject.createSlotMap(0);
            return;
        }
        throw new IllegalArgumentException();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static <T extends Scriptable> BaseFunction buildClassCtor(Scriptable scriptable, Class<T> constable, boolean bl, boolean bl2) {
        FunctionObject functionObject;
        Object object;
        Object object2;
        Object object3;
        Object var9_9;
        int n2;
        int n3;
        AccessibleObject[] accessibleObjectArray;
        block33: {
            accessibleObjectArray = FunctionObject.getMethodList(constable);
            n3 = accessibleObjectArray.length;
            n2 = 0;
            while (true) {
                var9_9 = null;
                if (n2 >= n3) break;
                object3 = accessibleObjectArray[n2];
                if (((Method)object3).getName().equals("init")) {
                    object2 = ((Method)object3).getParameterTypes();
                    if (((Class<?>[])object2).length == 3 && object2[0] == ScriptRuntime.ContextClass && object2[1] == ScriptRuntime.ScriptableClass && object2[2] == Boolean.TYPE && Modifier.isStatic(((Method)object3).getModifiers())) {
                        object2 = Context.getContext();
                        constable = bl ? Boolean.TRUE : Boolean.FALSE;
                        ((Method)object3).invoke(null, object2, scriptable, constable);
                        return null;
                    }
                    if (((Class<?>[])object2).length == 1 && object2[0] == ScriptRuntime.ScriptableClass && Modifier.isStatic(((Method)object3).getModifiers())) {
                        ((Method)object3).invoke(null, scriptable);
                        return null;
                    }
                }
                ++n2;
            }
            object = ((Class)constable).getConstructors();
            n3 = ((Constructor<?>[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                object3 = object[n2];
                if (((Constructor)object3).getParameterTypes().length != 0) {
                    continue;
                }
                break block33;
            }
            object3 = null;
        }
        if (object3 == null) {
            throw Context.reportRuntimeErrorById("msg.zero.arg.ctor", ((Class)constable).getName());
        }
        Scriptable scriptable2 = (Scriptable)((Constructor)object3).newInstance(ScriptRuntime.emptyArgs);
        Object object4 = scriptable2.getClassName();
        object3 = ScriptableObject.getProperty(ScriptableObject.getTopLevelScope(scriptable), (String)object4);
        if (object3 instanceof BaseFunction && (object2 = ((BaseFunction)(object3 = (BaseFunction)object3)).getPrototypeProperty()) != null && constable.equals(object2.getClass())) {
            return object3;
        }
        object3 = bl2 && ScriptRuntime.ScriptableClass.isAssignableFrom((Class<?>)(object3 = ((Class)constable).getSuperclass())) && !Modifier.isAbstract(((Class)object3).getModifiers()) && (object3 = ScriptableObject.defineClass(scriptable, ScriptableObject.extendsScriptable(object3), bl, bl2)) != null ? ScriptableObject.getClassPrototype(scriptable, (String)object3) : null;
        object2 = object3;
        if (object3 == null) {
            object2 = ScriptableObject.getObjectPrototype(scriptable);
        }
        scriptable2.setPrototype((Scriptable)object2);
        object3 = object2 = ScriptableObject.findAnnotatedMember(accessibleObjectArray, JSConstructor.class);
        if (object2 == null) {
            object3 = ScriptableObject.findAnnotatedMember((AccessibleObject[])object, JSConstructor.class);
        }
        String string = "jsConstructor";
        object2 = object3;
        if (object3 == null) {
            object2 = FunctionObject.findSingleMethod((Method[])accessibleObjectArray, "jsConstructor");
        }
        Object object5 = object2;
        if (object2 == null) {
            if (((AccessibleObject[])object).length == 1) {
                object3 = object[0];
            } else {
                object3 = object2;
                if (((AccessibleObject[])object).length == 2) {
                    if (((Constructor)object[0]).getParameterTypes().length == 0) {
                        object3 = object[1];
                    } else {
                        object3 = object2;
                        if (((Constructor)object[1]).getParameterTypes().length == 0) {
                            object3 = object[0];
                        }
                    }
                }
            }
            if (object3 == null) {
                throw Context.reportRuntimeErrorById("msg.ctor.multiple.parms", ((Class)constable).getName());
            }
            object5 = object3;
        }
        if ((functionObject = new FunctionObject((String)object4, (Member)object5, scriptable)).isVarArgsMethod()) {
            throw Context.reportRuntimeErrorById("msg.varargs.ctor", object5.getName());
        }
        functionObject.initAsConstructor(scriptable, scriptable2, 7);
        object2 = new HashSet();
        object3 = new HashSet();
        n3 = accessibleObjectArray.length;
        constable = var9_9;
        for (n2 = 0; n2 < n3; ++n2) {
            void var9_37;
            block47: {
                void var9_29;
                String string2;
                AccessibleObject accessibleObject;
                block45: {
                    block44: {
                        block34: {
                            void var9_13;
                            block36: {
                                block46: {
                                    block42: {
                                        block43: {
                                            block37: {
                                                block41: {
                                                    void var9_19;
                                                    block39: {
                                                        block40: {
                                                            block38: {
                                                                block35: {
                                                                    Class<?>[] classArray;
                                                                    accessibleObject = accessibleObjectArray[n2];
                                                                    if (accessibleObject == object5) break block34;
                                                                    string2 = ((Method)accessibleObject).getName();
                                                                    if (!string2.equals("finishInit") || (classArray = ((Method)accessibleObject).getParameterTypes()).length != 3 || (object = classArray[0]) != (object4 = ScriptRuntime.ScriptableClass) || classArray[1] != FunctionObject.class || classArray[2] != object4 || !Modifier.isStatic(((Method)accessibleObject).getModifiers())) break block35;
                                                                    AccessibleObject accessibleObject2 = accessibleObject;
                                                                    break block36;
                                                                }
                                                                if (string2.indexOf(36) != -1 || string2.equals(string)) break block37;
                                                                if (!accessibleObject.isAnnotationPresent(JSFunction.class)) break block38;
                                                                Class<JSFunction> clazz = JSFunction.class;
                                                                break block39;
                                                            }
                                                            if (!accessibleObject.isAnnotationPresent(JSStaticFunction.class)) break block40;
                                                            Class<JSStaticFunction> clazz = JSStaticFunction.class;
                                                            break block39;
                                                        }
                                                        if (!accessibleObject.isAnnotationPresent(JSGetter.class)) break block41;
                                                        Class<JSGetter> clazz = JSGetter.class;
                                                    }
                                                    object4 = ((Method)accessibleObject).getAnnotation(var9_19);
                                                    break block42;
                                                }
                                                if (!accessibleObject.isAnnotationPresent(JSSetter.class)) break block43;
                                            }
                                            Constable constable2 = constable;
                                            break block36;
                                        }
                                        object4 = null;
                                    }
                                    String string3 = "jsFunction_";
                                    if (object4 != null) break block44;
                                    if (string2.startsWith("jsFunction_")) break block45;
                                    if (!string2.startsWith("jsStaticFunction_")) break block46;
                                    String string4 = "jsStaticFunction_";
                                    break block45;
                                }
                                Constable constable3 = constable;
                                if (!string2.startsWith("jsGet_")) break block36;
                                String string5 = "jsGet_";
                                break block45;
                            }
                            constable = var9_13;
                        }
                        Constable constable4 = constable;
                        break block47;
                    }
                    Object var9_28 = null;
                }
                int n4 = !(object4 instanceof JSStaticFunction) && var9_29 != "jsStaticFunction_" ? 0 : 1;
                object = n4 != 0 ? object2 : object3;
                String string6 = ScriptableObject.getPropertyName(string2, (String)var9_29, (Annotation)object4);
                if (((HashSet)object).contains(string6)) {
                    throw Context.reportRuntimeErrorById("duplicate.defineClass.name", string2, string6);
                }
                ((HashSet)object).add(string6);
                if (!(object4 instanceof JSGetter) && var9_29 != "jsGet_") {
                    void var9_32;
                    if (n4 != 0 && !Modifier.isStatic(((Method)accessibleObject).getModifiers())) {
                        throw Context.reportRuntimeError("jsStaticFunction must be used with static method.");
                    }
                    object4 = new FunctionObject(string6, (Member)((Object)accessibleObject), scriptable2);
                    if (((FunctionObject)object4).isVarArgsConstructor()) {
                        throw Context.reportRuntimeErrorById("msg.varargs.fun", object5.getName());
                    }
                    if (n4 != 0) {
                        FunctionObject functionObject2 = functionObject;
                    } else {
                        Scriptable scriptable3 = scriptable2;
                    }
                    ScriptableObject.defineProperty((Scriptable)var9_32, string6, object4, 2);
                    Constable constable5 = constable;
                    if (bl) {
                        ((ScriptableObject)object4).sealObject();
                        Constable constable6 = constable;
                    }
                } else {
                    if (!(scriptable2 instanceof ScriptableObject)) {
                        throw Context.reportRuntimeErrorById("msg.extend.scriptable", scriptable2.getClass().toString(), string6);
                    }
                    Method method = ScriptableObject.findSetterMethod((Method[])accessibleObjectArray, string6, "jsSet_");
                    n4 = method != null ? 0 : 1;
                    ((ScriptableObject)scriptable2).defineProperty(string6, null, (Method)accessibleObject, method, n4 | 6);
                    Constable constable7 = constable;
                }
            }
            constable = var9_37;
        }
        if (constable != null) {
            ((Method)((Object)constable)).invoke(null, scriptable, functionObject, scriptable2);
        }
        if (bl) {
            functionObject.sealObject();
            if (scriptable2 instanceof ScriptableObject) {
                ((ScriptableObject)scriptable2).sealObject();
            }
        }
        return functionObject;
    }

    protected static ScriptableObject buildDataDescriptor(Scriptable scriptable, Object object, int n2) {
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, scriptable, TopLevel$Builtins.Object);
        nativeObject.defineProperty("value", object, 0);
        nativeObject.setCommonDescriptorProperties(n2, true);
        return nativeObject;
    }

    public static Object callMethod(Context context, Scriptable scriptable, String object, Object[] objectArray) {
        Object object2 = ScriptableObject.getProperty(scriptable, (String)object);
        if (object2 instanceof Function) {
            object2 = (Function)object2;
            object = ScriptableObject.getTopLevelScope(scriptable);
            if (context != null) {
                return object2.call(context, (Scriptable)object, scriptable, objectArray);
            }
            return Context.call(null, (Callable)object2, (Scriptable)object, scriptable, objectArray);
        }
        throw ScriptRuntime.notFunctionError(scriptable, object);
    }

    public static Object callMethod(Scriptable scriptable, String string, Object[] objectArray) {
        return ScriptableObject.callMethod(null, scriptable, string, objectArray);
    }

    private void checkNotSealed(Object object, int n2) {
        if (!this.isSealed()) {
            return;
        }
        object = object != null ? object.toString() : Integer.toString(n2);
        throw Context.reportRuntimeErrorById("msg.modify.sealed", object);
    }

    static void checkValidAttributes(int n2) {
        if ((n2 & 0xFFFFFFF0) == 0) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(n2));
    }

    private static SlotMapContainer createSlotMap(int n2) {
        Context context = Context.getCurrentContext();
        if (context != null && context.hasFeature(17)) {
            return new ThreadSafeSlotMapContainer(n2);
        }
        return new SlotMapContainer(n2);
    }

    public static <T extends Scriptable> String defineClass(Scriptable scriptable, Class<T> serializable, boolean bl, boolean bl2) {
        if ((serializable = ScriptableObject.buildClassCtor(scriptable, serializable, bl, bl2)) == null) {
            return null;
        }
        String string = ((BaseFunction)serializable).getClassPrototype().getClassName();
        ScriptableObject.defineProperty(scriptable, string, serializable, 2);
        return string;
    }

    public static <T extends Scriptable> void defineClass(Scriptable scriptable, Class<T> clazz) {
        ScriptableObject.defineClass(scriptable, clazz, false, false);
    }

    public static <T extends Scriptable> void defineClass(Scriptable scriptable, Class<T> clazz, boolean bl) {
        ScriptableObject.defineClass(scriptable, clazz, bl, false);
    }

    public static void defineConstProperty(Scriptable scriptable, String string) {
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties)((Object)scriptable)).defineConst(string, scriptable);
        } else {
            ScriptableObject.defineProperty(scriptable, string, Undefined.instance, 13);
        }
    }

    public static void defineProperty(Scriptable scriptable, String string, Object object, int n2) {
        if (!(scriptable instanceof ScriptableObject)) {
            scriptable.put(string, scriptable, object);
            return;
        }
        ((ScriptableObject)scriptable).defineProperty(string, object, n2);
    }

    public static boolean deleteProperty(Scriptable scriptable, int n2) {
        Scriptable scriptable2 = ScriptableObject.getBase(scriptable, n2);
        if (scriptable2 == null) {
            return true;
        }
        scriptable2.delete(n2);
        return scriptable2.has(n2, scriptable) ^ true;
    }

    public static boolean deleteProperty(Scriptable scriptable, String string) {
        Scriptable scriptable2 = ScriptableObject.getBase(scriptable, string);
        if (scriptable2 == null) {
            return true;
        }
        scriptable2.delete(string);
        return scriptable2.has(string, scriptable) ^ true;
    }

    protected static Scriptable ensureScriptable(Object object) {
        if (object instanceof Scriptable) {
            return (Scriptable)object;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(object));
    }

    protected static ScriptableObject ensureScriptableObject(Object object) {
        if (object instanceof ScriptableObject) {
            return (ScriptableObject)object;
        }
        if (object instanceof Delegator) {
            return (ScriptableObject)((Delegator)object).getDelegee();
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(object));
    }

    protected static SymbolScriptable ensureSymbolScriptable(Object object) {
        if (object instanceof SymbolScriptable) {
            return (SymbolScriptable)object;
        }
        throw ScriptRuntime.typeErrorById("msg.object.not.symbolscriptable", ScriptRuntime.typeof(object));
    }

    private static <T extends Scriptable> Class<T> extendsScriptable(Class<?> clazz) {
        if (ScriptRuntime.ScriptableClass.isAssignableFrom(clazz)) {
            return clazz;
        }
        return null;
    }

    private static Member findAnnotatedMember(AccessibleObject[] accessibleObjectArray, Class<? extends Annotation> clazz) {
        for (AccessibleObject accessibleObject : accessibleObjectArray) {
            if (!accessibleObject.isAnnotationPresent(clazz)) continue;
            return (Member)((Object)accessibleObject);
        }
        return null;
    }

    private static Method findSetterMethod(Method[] methodArray, String string, String object) {
        Object object2 = a.c("set");
        int n2 = 0;
        ((StringBuilder)object2).append(Character.toUpperCase(string.charAt(0)));
        ((StringBuilder)object2).append(string.substring(1));
        String string2 = ((StringBuilder)object2).toString();
        for (Method method : methodArray) {
            object2 = method.getAnnotation(JSSetter.class);
            if (object2 == null || !string.equals(object2.value()) && (!"".equals(object2.value()) || !string2.equals(method.getName()))) continue;
            return method;
        }
        string = e.c((String)object, string);
        int n3 = methodArray.length;
        for (int i2 = n2; i2 < n3; ++i2) {
            object = methodArray[i2];
            if (!string.equals(((Method)object).getName())) continue;
            return object;
        }
        return null;
    }

    public static Scriptable getArrayPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(ScriptableObject.getTopLevelScope(scriptable), TopLevel$Builtins.Array);
    }

    private Slot getAttributeSlot(String string, int n2) {
        Slot slot = this.slotMap.query(string, n2);
        if (slot == null) {
            if (string == null) {
                string = Integer.toString(n2);
            }
            throw Context.reportRuntimeErrorById("msg.prop.not.found", string);
        }
        return slot;
    }

    private Slot getAttributeSlot(Symbol symbol) {
        Slot slot = this.slotMap.query(symbol, 0);
        if (slot != null) {
            return slot;
        }
        throw Context.reportRuntimeErrorById("msg.prop.not.found", symbol);
    }

    static Scriptable getBase(Scriptable scriptable, int n2) {
        Scriptable scriptable2 = scriptable;
        while (!scriptable2.has(n2, scriptable)) {
            Scriptable scriptable3;
            scriptable2 = scriptable3 = scriptable2.getPrototype();
            if (scriptable3 != null) continue;
            scriptable2 = scriptable3;
            break;
        }
        return scriptable2;
    }

    static Scriptable getBase(Scriptable scriptable, String string) {
        Scriptable scriptable2 = scriptable;
        while (!scriptable2.has(string, scriptable)) {
            Scriptable scriptable3;
            scriptable2 = scriptable3 = scriptable2.getPrototype();
            if (scriptable3 != null) continue;
            scriptable2 = scriptable3;
            break;
        }
        return scriptable2;
    }

    private static Scriptable getBase(Scriptable scriptable, Symbol symbol) {
        Scriptable scriptable2 = scriptable;
        while (!ScriptableObject.ensureSymbolScriptable(scriptable2).has(symbol, scriptable)) {
            Scriptable scriptable3;
            scriptable2 = scriptable3 = scriptable2.getPrototype();
            if (scriptable3 != null) continue;
            scriptable2 = scriptable3;
            break;
        }
        return scriptable2;
    }

    public static Scriptable getClassPrototype(Scriptable object, String string) {
        block6: {
            block5: {
                block4: {
                    if (!((object = ScriptableObject.getProperty(ScriptableObject.getTopLevelScope((Scriptable)object), string)) instanceof BaseFunction)) break block4;
                    object = ((BaseFunction)object).getPrototypeProperty();
                    break block5;
                }
                if (!(object instanceof Scriptable)) break block6;
                object = (Scriptable)object;
                object = object.get("prototype", (Scriptable)object);
            }
            if (object instanceof Scriptable) {
                return (Scriptable)object;
            }
        }
        return null;
    }

    public static Object getDefaultValue(Scriptable object, Class<?> clazz) {
        Object object2 = null;
        int n2 = 0;
        while (true) {
            block7: {
                block8: {
                    Object object3;
                    Object object4;
                    boolean bl;
                    block9: {
                        bl = true;
                        if (n2 >= 2) break;
                        if (!(clazz == ScriptRuntime.StringClass ? n2 == 0 : n2 == 1)) {
                            bl = false;
                        }
                        object4 = bl ? "toString" : "valueOf";
                        object4 = ScriptableObject.getProperty((Scriptable)object, (String)object4);
                        if (!(object4 instanceof Function)) break block7;
                        object3 = (Function)object4;
                        object4 = object2;
                        if (object2 == null) {
                            object4 = Context.getContext();
                        }
                        object3 = object3.call((Context)object4, object3.getParentScope(), (Scriptable)object, ScriptRuntime.emptyArgs);
                        object2 = object4;
                        if (object3 == null) break block7;
                        if (!(object3 instanceof Scriptable)) {
                            return object3;
                        }
                        object2 = object3;
                        if (clazz == ScriptRuntime.ScriptableClass) break block8;
                        if (clazz != ScriptRuntime.FunctionClass) break block9;
                        object2 = object3;
                        break block8;
                    }
                    object2 = object4;
                    if (!bl) break block7;
                    object2 = object4;
                    if (!(object3 instanceof Wrapper)) break block7;
                    object3 = ((Wrapper)object3).unwrap();
                    object2 = object4;
                    if (!(object3 instanceof String)) break block7;
                    object2 = object3;
                }
                return object2;
            }
            ++n2;
        }
        object = clazz == null ? "undefined" : clazz.getName();
        throw ScriptRuntime.typeErrorById("msg.default.value", object);
    }

    public static Scriptable getFunctionPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(ScriptableObject.getTopLevelScope(scriptable), TopLevel$Builtins.Function);
    }

    public static Scriptable getGeneratorFunctionPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(ScriptableObject.getTopLevelScope(scriptable), TopLevel$Builtins.GeneratorFunction);
    }

    public static Scriptable getObjectPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(ScriptableObject.getTopLevelScope(scriptable), TopLevel$Builtins.Object);
    }

    public static Object getProperty(Scriptable scriptable, int n2) {
        Object object;
        Scriptable scriptable2 = scriptable;
        while ((object = scriptable2.get(n2, scriptable)) == Scriptable.NOT_FOUND) {
            Scriptable scriptable3;
            scriptable2 = scriptable3 = scriptable2.getPrototype();
            if (scriptable3 != null) continue;
        }
        return object;
    }

    public static Object getProperty(Scriptable scriptable, String string) {
        Object object;
        Scriptable scriptable2 = scriptable;
        while ((object = scriptable2.get(string, scriptable)) == Scriptable.NOT_FOUND) {
            Scriptable scriptable3;
            scriptable2 = scriptable3 = scriptable2.getPrototype();
            if (scriptable3 != null) continue;
        }
        return object;
    }

    public static Object getProperty(Scriptable scriptable, Symbol symbol) {
        Object object;
        Scriptable scriptable2 = scriptable;
        while ((object = ScriptableObject.ensureSymbolScriptable(scriptable2).get(symbol, scriptable)) == Scriptable.NOT_FOUND) {
            Scriptable scriptable3;
            scriptable2 = scriptable3 = scriptable2.getPrototype();
            if (scriptable3 != null) continue;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object[] getPropertyIds(Scriptable var0) {
        if (var0 == null) {
            return ScriptRuntime.emptyArgs;
        }
        var5_1 = var0.getIds();
        var3_2 = null;
        var4_3 /* !! */  = var0;
        var0 = var5_1;
        block0: while (true) {
            if ((var7_7 = var4_3 /* !! */ .getPrototype()) == null) {
                if (var3_2 != null) {
                    var0 = var3_2.getKeys();
                }
                return var0;
            }
            var8_8 = var7_7.getIds();
            if (var8_8.length == 0) {
                var4_3 /* !! */  = var7_7;
                continue;
            }
            var2_5 = 0;
            var6_6 = var0;
            var5_1 = var3_2;
            var1_4 = var2_5;
            if (var3_2 == null) {
                if (var0.length == 0) {
                    var0 = var8_8;
                    var4_3 /* !! */  = var7_7;
                    continue;
                }
                var5_1 = new ObjToIntMap(var0.length + var8_8.length);
                for (var1_4 = 0; var1_4 != var0.length; ++var1_4) {
                    var5_1.intern(var0[var1_4]);
                }
                var6_6 = null;
                var1_4 = var2_5;
            }
            while (true) {
                var0 = var6_6;
                var3_2 = var5_1;
                var4_3 /* !! */  = var7_7;
                if (var1_4 != var8_8.length) ** break;
                continue block0;
                var5_1.intern(var8_8[var1_4]);
                ++var1_4;
            }
            break;
        }
    }

    private static String getPropertyName(String string, String object, Annotation object2) {
        block15: {
            block13: {
                block14: {
                    if (object != null) {
                        return string.substring(((String)object).length());
                    }
                    object = null;
                    if (!(object2 instanceof JSGetter)) break block13;
                    if ((object2 = ((JSGetter)object2).value()) == null) break block14;
                    object = object2;
                    if (((String)object2).length() != 0) break block15;
                }
                object = object2;
                if (string.length() > 3) {
                    object = object2;
                    if (string.startsWith("get")) {
                        object = object2 = string.substring(3);
                        if (Character.isUpperCase(((String)object2).charAt(0))) {
                            if (((String)object2).length() == 1) {
                                object = ((String)object2).toLowerCase();
                            } else {
                                object = object2;
                                if (!Character.isUpperCase(((String)object2).charAt(1))) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(Character.toLowerCase(((String)object2).charAt(0)));
                                    ((StringBuilder)object).append(((String)object2).substring(1));
                                    object = ((StringBuilder)object).toString();
                                }
                            }
                        }
                    }
                }
                break block15;
            }
            if (object2 instanceof JSFunction) {
                object = ((JSFunction)object2).value();
            } else if (object2 instanceof JSStaticFunction) {
                object = ((JSStaticFunction)object2).value();
            }
        }
        object2 = string;
        if (object != null) {
            object2 = ((String)object).length() == 0 ? string : object;
        }
        return object2;
    }

    public static Scriptable getTopLevelScope(Scriptable scriptable) {
        Scriptable scriptable2;
        while ((scriptable2 = scriptable.getParentScope()) != null) {
            scriptable = scriptable2;
        }
        return scriptable;
    }

    public static Object getTopScopeValue(Scriptable scriptable, Object object) {
        Object object2;
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        do {
            if (scriptable instanceof ScriptableObject && (object2 = ((ScriptableObject)scriptable).getAssociatedValue(object)) != null) {
                return object2;
            }
            object2 = scriptable.getPrototype();
            scriptable = object2;
        } while (object2 != null);
        return null;
    }

    public static <T> T getTypedProperty(Scriptable object, int n2, Class<T> clazz) {
        Object object2;
        object = object2 = ScriptableObject.getProperty((Scriptable)object, n2);
        if (object2 == Scriptable.NOT_FOUND) {
            object = null;
        }
        return clazz.cast(Context.jsToJava(object, clazz));
    }

    public static <T> T getTypedProperty(Scriptable object, String object2, Class<T> clazz) {
        object = object2 = ScriptableObject.getProperty((Scriptable)object, (String)object2);
        if (object2 == Scriptable.NOT_FOUND) {
            object = null;
        }
        return clazz.cast(Context.jsToJava(object, clazz));
    }

    public static boolean hasProperty(Scriptable scriptable, int n2) {
        boolean bl = ScriptableObject.getBase(scriptable, n2) != null;
        return bl;
    }

    public static boolean hasProperty(Scriptable scriptable, String string) {
        boolean bl = ScriptableObject.getBase(scriptable, string) != null;
        return bl;
    }

    public static boolean hasProperty(Scriptable scriptable, Symbol symbol) {
        boolean bl = ScriptableObject.getBase(scriptable, symbol) != null;
        return bl;
    }

    protected static boolean isAccessorDescriptor(ScriptableObject scriptableObject) {
        boolean bl = ScriptableObject.hasProperty((Scriptable)scriptableObject, "get") || ScriptableObject.hasProperty((Scriptable)scriptableObject, "set");
        return bl;
    }

    protected static boolean isDataDescriptor(ScriptableObject scriptableObject) {
        boolean bl = ScriptableObject.hasProperty((Scriptable)scriptableObject, "value") || ScriptableObject.hasProperty((Scriptable)scriptableObject, "writable");
        return bl;
    }

    protected static boolean isFalse(Object object) {
        return ScriptableObject.isTrue(object) ^ true;
    }

    protected static boolean isTrue(Object object) {
        boolean bl = object != Scriptable.NOT_FOUND && ScriptRuntime.toBoolean(object);
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean putConstImpl(String object, int n2, Scriptable object2, Object object3, int n3) {
        if (!this.isExtensible && Context.getContext().isStrictMode()) {
            throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
        }
        if (this != object2) {
            Slot slot = this.slotMap.query(object, n2);
            object = slot;
            if (slot != null) return ((Slot)object).setValue(object3, this, (Scriptable)object2);
            return false;
        }
        if (!this.isExtensible()) {
            Slot slot = this.slotMap.query(object, n2);
            object = slot;
            if (slot != null) return ((Slot)object).setValue(object3, this, (Scriptable)object2);
            return true;
        }
        this.checkNotSealed(object, n2);
        object2 = this.slotMap.modify(object, n2, 13);
        n2 = ((Slot)object2).getAttributes();
        if ((n2 & 1) == 0) throw Context.reportRuntimeErrorById("msg.var.redecl", object);
        if ((n2 & 8) == 0) return true;
        ((Slot)object2).value = object3;
        if (n3 == 8) return true;
        ((Slot)object2).setAttributes(n2 & 0xFFFFFFF7);
        return true;
    }

    public static void putConstProperty(Scriptable scriptable, String string, Object object) {
        Scriptable scriptable2;
        Scriptable scriptable3 = scriptable2 = ScriptableObject.getBase(scriptable, string);
        if (scriptable2 == null) {
            scriptable3 = scriptable;
        }
        if (scriptable3 instanceof ConstProperties) {
            ((ConstProperties)((Object)scriptable3)).putConst(string, scriptable, object);
        }
    }

    private boolean putImpl(Object object, int n2, Scriptable scriptable, Object object2) {
        return this.putImpl(object, n2, scriptable, object2, Context.isCurrentContextStrict());
    }

    public static void putProperty(Scriptable scriptable, int n2, Object object) {
        Scriptable scriptable2;
        Scriptable scriptable3 = scriptable2 = ScriptableObject.getBase(scriptable, n2);
        if (scriptable2 == null) {
            scriptable3 = scriptable;
        }
        scriptable3.put(n2, scriptable, object);
    }

    public static void putProperty(Scriptable scriptable, String string, Object object) {
        Scriptable scriptable2;
        Scriptable scriptable3 = scriptable2 = ScriptableObject.getBase(scriptable, string);
        if (scriptable2 == null) {
            scriptable3 = scriptable;
        }
        scriptable3.put(string, scriptable, object);
    }

    public static void putProperty(Scriptable scriptable, Symbol symbol, Object object) {
        Scriptable scriptable2;
        Scriptable scriptable3 = scriptable2 = ScriptableObject.getBase(scriptable, symbol);
        if (scriptable2 == null) {
            scriptable3 = scriptable;
        }
        ScriptableObject.ensureSymbolScriptable(scriptable3).put(symbol, scriptable, object);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = objectInputStream.readInt();
        this.slotMap = ScriptableObject.createSlotMap(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Slot slot = (Slot)objectInputStream.readObject();
            this.slotMap.add(slot);
        }
    }

    public static void redefineProperty(Scriptable scriptable, String string, boolean bl) {
        if ((scriptable = ScriptableObject.getBase(scriptable, string)) == null) {
            return;
        }
        if (scriptable instanceof ConstProperties && ((ConstProperties)((Object)scriptable)).isConst(string)) {
            throw ScriptRuntime.typeErrorById("msg.const.redecl", string);
        }
        if (!bl) {
            return;
        }
        throw ScriptRuntime.typeErrorById("msg.var.redecl", string);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        long l2 = this.slotMap.readLock();
        try {
            int n2 = this.slotMap.dirtySize();
            if (n2 == 0) {
                objectOutputStream.writeInt(0);
            } else {
                objectOutputStream.writeInt(n2);
                Iterator<Slot> iterator = this.slotMap.iterator();
                while (iterator.hasNext()) {
                    objectOutputStream.writeObject(iterator.next());
                }
            }
            return;
        }
        finally {
            this.slotMap.unlockRead(l2);
        }
    }

    void addLazilyInitializedValue(String object, int n2, LazilyLoadedCtor lazilyLoadedCtor, int n3) {
        if (object != null && n2 != 0) {
            throw new IllegalArgumentException((String)object);
        }
        this.checkNotSealed(object, n2);
        Slot slot = this.slotMap.modify(object, n2, 0);
        if (slot instanceof LazyLoadSlot) {
            object = (LazyLoadSlot)slot;
        } else {
            object = new LazyLoadSlot(slot);
            this.slotMap.replace(slot, (Slot)object);
        }
        ((Slot)object).setAttributes(n3);
        ((Slot)object).value = lazilyLoadedCtor;
    }

    protected int applyDescriptorToAttributeBitset(int n2, ScriptableObject object) {
        Object object2 = ScriptableObject.getProperty((Scriptable)object, "enumerable");
        Object object3 = Scriptable.NOT_FOUND;
        int n3 = n2;
        if (object2 != object3) {
            n3 = ScriptRuntime.toBoolean(object2) ? n2 & 0xFFFFFFFD : n2 | 2;
        }
        object2 = ScriptableObject.getProperty((Scriptable)object, "writable");
        n2 = n3;
        if (object2 != object3) {
            n2 = ScriptRuntime.toBoolean(object2) ? n3 & 0xFFFFFFFE : n3 | 1;
        }
        object = ScriptableObject.getProperty((Scriptable)object, "configurable");
        n3 = n2;
        if (object != object3) {
            n3 = ScriptRuntime.toBoolean(object) ? n2 & 0xFFFFFFFB : n2 | 4;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object associateValue(Object object, Object object2) {
        synchronized (this) {
            Throwable throwable2;
            if (object2 != null) {
                try {
                    HashMap<Object, Object> hashMap;
                    HashMap<Object, Object> hashMap2 = hashMap = this.associatedValues;
                    if (hashMap != null) return Kit.initHash(hashMap2, object, object2);
                    hashMap2 = new HashMap<Object, Object>();
                    this.associatedValues = hashMap2;
                    return Kit.initHash(hashMap2, object, object2);
                }
                catch (Throwable throwable2) {}
            } else {
                object = new IllegalArgumentException();
                throw object;
            }
            throw throwable2;
        }
    }

    public boolean avoidObjectDetection() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void checkPropertyChange(Object object, ScriptableObject scriptableObject, ScriptableObject scriptableObject2) {
        if (scriptableObject == null) {
            if (this.isExtensible()) return;
            throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
        }
        if (!ScriptableObject.isFalse(scriptableObject.get("configurable", (Scriptable)scriptableObject))) return;
        if (ScriptableObject.isTrue(ScriptableObject.getProperty((Scriptable)scriptableObject2, "configurable"))) throw ScriptRuntime.typeErrorById("msg.change.configurable.false.to.true", object);
        if (ScriptableObject.isTrue(scriptableObject.get("enumerable", (Scriptable)scriptableObject)) != ScriptableObject.isTrue(ScriptableObject.getProperty((Scriptable)scriptableObject2, "enumerable"))) throw ScriptRuntime.typeErrorById("msg.change.enumerable.with.configurable.false", object);
        boolean bl = ScriptableObject.isDataDescriptor(scriptableObject2);
        boolean bl2 = ScriptableObject.isAccessorDescriptor(scriptableObject2);
        if (!bl && !bl2) return;
        if (bl && ScriptableObject.isDataDescriptor(scriptableObject)) {
            if (!ScriptableObject.isFalse(scriptableObject.get("writable", (Scriptable)scriptableObject))) return;
            if (ScriptableObject.isTrue(ScriptableObject.getProperty((Scriptable)scriptableObject2, "writable"))) throw ScriptRuntime.typeErrorById("msg.change.writable.false.to.true.with.configurable.false", object);
            if (this.sameValue(ScriptableObject.getProperty((Scriptable)scriptableObject2, "value"), scriptableObject.get("value", (Scriptable)scriptableObject))) return;
            throw ScriptRuntime.typeErrorById("msg.change.value.with.writable.false", object);
        }
        if (bl2 && ScriptableObject.isAccessorDescriptor(scriptableObject)) {
            if (!this.sameValue(ScriptableObject.getProperty((Scriptable)scriptableObject2, "set"), scriptableObject.get("set", (Scriptable)scriptableObject))) throw ScriptRuntime.typeErrorById("msg.change.setter.with.configurable.false", object);
            if (this.sameValue(ScriptableObject.getProperty((Scriptable)scriptableObject2, "get"), scriptableObject.get("get", (Scriptable)scriptableObject))) return;
            throw ScriptRuntime.typeErrorById("msg.change.getter.with.configurable.false", object);
        }
        if (!ScriptableObject.isDataDescriptor(scriptableObject)) throw ScriptRuntime.typeErrorById("msg.change.property.accessor.to.data.with.configurable.false", object);
        throw ScriptRuntime.typeErrorById("msg.change.property.data.to.accessor.with.configurable.false", object);
    }

    protected void checkPropertyDefinition(ScriptableObject scriptableObject) {
        Object object;
        Object object2 = ScriptableObject.getProperty((Scriptable)scriptableObject, "get");
        if (object2 != (object = Scriptable.NOT_FOUND) && object2 != Undefined.instance && !(object2 instanceof Callable)) {
            throw ScriptRuntime.notFunctionError(object2);
        }
        object2 = ScriptableObject.getProperty((Scriptable)scriptableObject, "set");
        if (object2 != object && object2 != Undefined.instance && !(object2 instanceof Callable)) {
            throw ScriptRuntime.notFunctionError(object2);
        }
        if (ScriptableObject.isDataDescriptor(scriptableObject) && ScriptableObject.isAccessorDescriptor(scriptableObject)) {
            throw ScriptRuntime.typeErrorById("msg.both.data.and.accessor.desc", new Object[0]);
        }
    }

    @Override
    public void defineConst(String string, Scriptable scriptable) {
        if (this.putConstImpl(string, 0, scriptable, Undefined.instance, 8)) {
            return;
        }
        if (scriptable != this) {
            if (scriptable instanceof ConstProperties) {
                ((ConstProperties)((Object)scriptable)).defineConst(string, scriptable);
            }
            return;
        }
        throw Kit.codeBug();
    }

    public void defineFunctionProperties(String[] stringArray, Class<?> clazz, int n2) {
        Method[] methodArray = FunctionObject.getMethodList(clazz);
        for (String string : stringArray) {
            Method method = FunctionObject.findSingleMethod(methodArray, string);
            if (method != null) {
                this.defineProperty(string, (Object)new FunctionObject(string, method, this), n2);
                continue;
            }
            throw Context.reportRuntimeErrorById("msg.method.not.found", string, clazz.getName());
        }
    }

    public void defineOwnProperties(Context context, ScriptableObject scriptableObject) {
        int n2;
        int n3 = 0;
        Object[] objectArray = scriptableObject.getIds(false, true);
        ScriptableObject[] scriptableObjectArray = new ScriptableObject[objectArray.length];
        int n4 = objectArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            ScriptableObject scriptableObject2 = ScriptableObject.ensureScriptableObject(ScriptRuntime.getObjectElem(scriptableObject, objectArray[n2], context));
            this.checkPropertyDefinition(scriptableObject2);
            scriptableObjectArray[n2] = scriptableObject2;
        }
        n4 = objectArray.length;
        for (n2 = n3; n2 < n4; ++n2) {
            this.defineOwnProperty(context, objectArray[n2], scriptableObjectArray[n2]);
        }
    }

    public void defineOwnProperty(Context context, Object object, ScriptableObject scriptableObject) {
        this.checkPropertyDefinition(scriptableObject);
        this.defineOwnProperty(context, object, scriptableObject, true);
    }

    /*
     * Unable to fully structure code
     */
    protected void defineOwnProperty(Context var1_1, Object var2_2, ScriptableObject var3_3, boolean var4_4) {
        block15: {
            var7_5 = var2_2 instanceof Symbol;
            var9_6 = null;
            if (var7_5) {
                var8_7 = var2_2;
                while (true) {
                    var6_9 = 0;
                    break;
                }
            } else {
                var11_10 = ScriptRuntime.toStringIdOrIndex(var2_2);
                var8_7 = var10_8 = var11_10.stringId;
                if (var10_8 != null) ** continue;
                var6_9 = var11_10.index;
                var8_7 = null;
            }
            var10_8 = this.slotMap.query(var8_7, var6_9);
            var5_11 = var10_8 == null;
            if (var4_4) {
                var1_1 = var10_8 == null ? var9_6 : var10_8.getPropertyDescriptor((Context)var1_1, this);
                this.checkPropertyChange(var2_2, (ScriptableObject)var1_1, (ScriptableObject)var3_3);
            }
            var4_4 = ScriptableObject.isAccessorDescriptor((ScriptableObject)var3_3);
            if (var10_8 == null) {
                var2_2 = this.slotMap.modify(var8_7, var6_9, 0);
                var6_9 = 7;
            } else {
                var6_9 = var10_8.getAttributes();
                var2_2 = var10_8;
            }
            var6_9 = this.applyDescriptorToAttributeBitset(var6_9, (ScriptableObject)var3_3);
            if (var4_4) {
                if (var2_2 instanceof AccessorSlot) {
                    var1_1 = (AccessorSlot)var2_2;
                } else {
                    var1_1 = new AccessorSlot((Slot)var2_2);
                    this.slotMap.replace((Slot)var2_2, (Slot)var1_1);
                }
                var8_7 = ScriptableObject.getProperty((Scriptable)var3_3, "get");
                var2_2 = Scriptable.NOT_FOUND;
                if (var8_7 != var2_2) {
                    var1_1.getter = new AccessorSlot$FunctionGetter(var8_7);
                }
                if ((var3_3 = ScriptableObject.getProperty((Scriptable)var3_3, "set")) != var2_2) {
                    var1_1.setter = new AccessorSlot$FunctionSetter(var3_3);
                }
                var2_2 = Undefined.instance;
lbl39:
                // 3 sources

                while (true) {
                    var1_1.value = var2_2;
                    var2_2 = var1_1;
                    break block15;
                    break;
                }
            }
            var1_1 = var2_2;
            if (!var2_2.isValueSlot()) {
                var1_1 = var2_2;
                if (ScriptableObject.isDataDescriptor((ScriptableObject)var3_3)) {
                    var1_1 = new Slot((Slot)var2_2);
                    this.slotMap.replace((Slot)var2_2, (Slot)var1_1);
                }
            }
            if ((var2_2 = ScriptableObject.getProperty((Scriptable)var3_3, "value")) != Scriptable.NOT_FOUND) ** GOTO lbl39
            var2_2 = var1_1;
            if (var5_11) {
                var2_2 = Undefined.instance;
                ** continue;
            }
        }
        var2_2.setAttributes(var6_9);
    }

    public void defineProperty(String string, Class<?> object, int n2) {
        int n3 = string.length();
        if (n3 != 0) {
            Object object2 = new char[n3 + 3];
            string.getChars(0, n3, (char[])object2, 3);
            object2[3] = Character.toUpperCase(object2[3]);
            object2[0] = 103;
            object2[1] = 101;
            object2[2] = 116;
            Object object3 = new String((char[])object2);
            object2[0] = 115;
            object2 = new String((char[])object2);
            object = FunctionObject.getMethodList(object);
            object3 = FunctionObject.findSingleMethod(object, (String)object3);
            object2 = FunctionObject.findSingleMethod(object, (String)object2);
            n3 = n2;
            if (object2 == null) {
                n3 = n2 | 1;
            }
            object = object2;
            if (object2 == null) {
                object = null;
            }
            this.defineProperty(string, null, (Method)object3, (Method)object, n3);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void defineProperty(String string, Object object, int n2) {
        this.checkNotSealed(string, 0);
        this.put(string, (Scriptable)this, object);
        this.setAttributes(string, n2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void defineProperty(String var1_1, Object var2_2, Method var3_3, Method var4_4, int var5_5) {
        block28: {
            var10_6 = null;
            var9_7 = null;
            if (var3_3 == null) ** GOTO lbl34
            var11_8 = new MemberBox((Method)var3_3);
            if (!Modifier.isStatic(var3_3.getModifiers())) {
                var6_9 = var2_2 /* !! */  != null;
                var11_8.delegateTo = var2_2 /* !! */ ;
            } else {
                var11_8.delegateTo = Void.TYPE;
                var6_9 = true;
            }
            var13_10 = var3_3.getParameterTypes();
            var7_11 = var13_10.length;
            var12_12 = "msg.bad.getter.parms";
            if (var7_11 != 0) ** GOTO lbl21
            if (var6_9) {
                var8_13 = "msg.obj.getter.parms";
            } else {
                while (true) {
                    var8_13 = null;
                    break block28;
                    break;
                }
lbl21:
                // 1 sources

                var8_13 = var12_12;
                if (var13_10.length == 1) {
                    var8_13 = var13_10[0];
                    if (var8_13 != ScriptRuntime.ScriptableClass && var8_13 != ScriptRuntime.ScriptableObjectClass) {
                        var8_13 = var12_12;
                    } else {
                        if (var6_9) ** continue;
                        var8_13 = var12_12;
                    }
                }
            }
        }
        if (var8_13 == null) {
            var3_3 = var11_8;
        } else {
            throw Context.reportRuntimeErrorById(var8_13, new Object[]{var3_3.toString()});
lbl34:
            // 1 sources

            var3_3 = null;
        }
        var8_13 = var10_6;
        if (var4_4 != null) {
            if (var4_4.getReturnType() == Void.TYPE) {
                var8_13 = new MemberBox(var4_4);
                if (!Modifier.isStatic(var4_4.getModifiers())) {
                    var6_9 = var2_2 /* !! */  != null;
                    var8_13.delegateTo = var2_2 /* !! */ ;
                } else {
                    var8_13.delegateTo = Void.TYPE;
                    var6_9 = true;
                }
                var2_2 /* !! */  = var4_4.getParameterTypes();
                if (var2_2 /* !! */ .length == 1) {
                    var2_2 /* !! */  = var9_7;
                    if (var6_9) {
                        var2_2 /* !! */  = "msg.setter2.expected";
                    }
                } else if (var2_2 /* !! */ .length == 2) {
                    if ((var2_2 /* !! */  = var2_2 /* !! */ [0]) != ScriptRuntime.ScriptableClass && var2_2 /* !! */  != ScriptRuntime.ScriptableObjectClass) {
                        var2_2 /* !! */  = "msg.setter2.parms";
                    } else {
                        var2_2 /* !! */  = var9_7;
                        if (!var6_9) {
                            var2_2 /* !! */  = "msg.setter1.parms";
                        }
                    }
                } else {
                    var2_2 /* !! */  = "msg.setter.parms";
                }
                if (var2_2 /* !! */  != null) {
                    throw Context.reportRuntimeErrorById(var2_2 /* !! */ , new Object[]{var4_4.toString()});
                }
            } else {
                throw Context.reportRuntimeErrorById("msg.setter.return", new Object[]{var4_4.toString()});
            }
        }
        if ((var2_2 /* !! */  = this.slotMap.modify(var1_1, 0, 0)) instanceof AccessorSlot) {
            var1_1 = (AccessorSlot)var2_2 /* !! */ ;
        } else {
            var1_1 = new AccessorSlot((Slot)var2_2 /* !! */ );
            this.slotMap.replace((Slot)var2_2 /* !! */ , (Slot)var1_1);
        }
        var1_1.setAttributes(var5_5);
        if (var3_3 != null) {
            var1_1.getter = new AccessorSlot$MemberBoxGetter((MemberBox)var3_3);
        }
        if (var8_13 != null) {
            var1_1.setter = new AccessorSlot$MemberBoxSetter((MemberBox)var8_13);
        }
    }

    public void defineProperty(String string, Supplier<Object> supplier, Consumer<Object> consumer, int n2) {
        LambdaSlot lambdaSlot;
        Slot slot = this.slotMap.modify(string, 0, n2);
        if (slot instanceof LambdaSlot) {
            lambdaSlot = (LambdaSlot)slot;
        } else {
            lambdaSlot = new LambdaSlot(slot);
            this.slotMap.replace(slot, lambdaSlot);
        }
        lambdaSlot.getter = supplier;
        lambdaSlot.setter = consumer;
        this.setAttributes(string, n2);
    }

    protected void defineProperty(Scriptable scriptable, String string, int n2, Callable callable, int n3, int n4) {
        scriptable = new LambdaFunction(scriptable, string, n2, callable);
        ((BaseFunction)scriptable).setStandardPropertyAttributes(n4);
        this.defineProperty(string, (Object)scriptable, n3);
    }

    public void defineProperty(Symbol symbol, Object object, int n2) {
        this.checkNotSealed(symbol, 0);
        this.put(symbol, (Scriptable)this, object);
        this.setAttributes(symbol, n2);
    }

    @Override
    public void delete(int n2) {
        this.checkNotSealed(null, n2);
        this.slotMap.remove(null, n2);
    }

    @Override
    public void delete(String string) {
        this.checkNotSealed(string, 0);
        this.slotMap.remove(string, 0);
    }

    @Override
    public void delete(Symbol symbol) {
        this.checkNotSealed(symbol, 0);
        this.slotMap.remove(symbol, 0);
    }

    protected Object equivalentValues(Object object) {
        object = this == object ? Boolean.TRUE : Scriptable.NOT_FOUND;
        return object;
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        Object object = this.externalData;
        if (object != null) {
            if (n2 < object.getArrayLength()) {
                return this.externalData.getArrayElement(n2);
            }
            return Scriptable.NOT_FOUND;
        }
        object = this.slotMap.query(null, n2);
        if (object == null) {
            return Scriptable.NOT_FOUND;
        }
        return ((Slot)object).getValue(scriptable);
    }

    public Object get(Object object) {
        if ((object = object instanceof String ? this.get((String)object, (Scriptable)this) : (object instanceof Symbol ? this.get((Symbol)object, (Scriptable)this) : (object instanceof Number ? this.get(((Number)object).intValue(), (Scriptable)this) : null))) != Scriptable.NOT_FOUND && object != Undefined.instance) {
            Object object2 = object;
            if (object instanceof Wrapper) {
                object2 = ((Wrapper)object).unwrap();
            }
            return object2;
        }
        return null;
    }

    @Override
    public Object get(String object, Scriptable scriptable) {
        if ((object = this.slotMap.query(object, 0)) == null) {
            return Scriptable.NOT_FOUND;
        }
        return ((Slot)object).getValue(scriptable);
    }

    @Override
    public Object get(Symbol object, Scriptable scriptable) {
        if ((object = this.slotMap.query(object, 0)) == null) {
            return Scriptable.NOT_FOUND;
        }
        return ((Slot)object).getValue(scriptable);
    }

    @Override
    public Object[] getAllIds() {
        return this.getIds(true, false);
    }

    public final Object getAssociatedValue(Object object) {
        Map<Object, Object> map = this.associatedValues;
        if (map == null) {
            return null;
        }
        return map.get(object);
    }

    public int getAttributes(int n2) {
        return this.getAttributeSlot(null, n2).getAttributes();
    }

    @Deprecated
    public final int getAttributes(int n2, Scriptable scriptable) {
        return this.getAttributes(n2);
    }

    public int getAttributes(String string) {
        return this.getAttributeSlot(string, 0).getAttributes();
    }

    @Deprecated
    public final int getAttributes(String string, Scriptable scriptable) {
        return this.getAttributes(string);
    }

    public int getAttributes(Symbol symbol) {
        return this.getAttributeSlot(symbol).getAttributes();
    }

    @Override
    public abstract String getClassName();

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        return ScriptableObject.getDefaultValue(this, clazz);
    }

    public ExternalArrayData getExternalArrayData() {
        return this.externalData;
    }

    public Object getExternalArrayLength() {
        ExternalArrayData externalArrayData = this.externalData;
        int n2 = externalArrayData == null ? 0 : externalArrayData.getArrayLength();
        return n2;
    }

    public Object getGetterOrSetter(String object, int n2, Scriptable object2, boolean bl) {
        if (object != null && n2 != 0) {
            throw new IllegalArgumentException((String)object);
        }
        Slot slot = this.slotMap.query(object, n2);
        if (slot == null) {
            return null;
        }
        object = bl ? slot.getSetterFunction((String)object, (Scriptable)object2) : slot.getGetterFunction((String)object, (Scriptable)object2);
        object2 = object;
        if (object == null) {
            object2 = Undefined.instance;
        }
        return object2;
    }

    @Deprecated
    public Object getGetterOrSetter(String string, int n2, boolean bl) {
        return this.getGetterOrSetter(string, n2, this, bl);
    }

    @Override
    public Object[] getIds() {
        return this.getIds(false, false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Object[] getIds(boolean bl, boolean bl2) {
        void var7_14;
        void var7_8;
        int n2;
        Object object;
        ExternalArrayData externalArrayData = this.externalData;
        int n3 = externalArrayData == null ? 0 : externalArrayData.getArrayLength();
        if (n3 == 0) {
            Object[] objectArray = ScriptRuntime.emptyArgs;
        } else {
            object = new Object[n3];
            n2 = 0;
            while (true) {
                Object[] objectArray = object;
                if (n2 >= n3) break;
                object[n2] = n2;
                ++n2;
            }
        }
        if (this.slotMap.isEmpty()) {
            void var7_7;
            return var7_7;
        }
        long l2 = this.slotMap.readLock();
        try {
            Iterator<Slot> iterator = this.slotMap.iterator();
            n2 = n3;
            while (iterator.hasNext()) {
                void var7_11;
                Object object2;
                Slot slot = iterator.next();
                if (!bl && (slot.getAttributes() & 2) != 0 || !bl2 && slot.name instanceof Symbol) continue;
                object = var7_8;
                if (n2 == n3) {
                    object = new Object[this.slotMap.dirtySize() + n3];
                    if (var7_8 != null) {
                        System.arraycopy(var7_8, 0, object, 0, n3);
                    }
                }
                if ((object2 = slot.name) == null) {
                    Integer n4 = slot.indexOrHash;
                }
                object[n2] = var7_11;
                ++n2;
                Object object3 = object;
            }
            this.slotMap.unlockRead(l2);
        }
        catch (Throwable throwable) {
            this.slotMap.unlockRead(l2);
            throw throwable;
        }
        if (n2 != ((void)var7_8).length + n3) {
            object = new Object[n2];
            System.arraycopy(var7_8, 0, object, 0, n2);
            Object object4 = object;
        }
        object = Context.getCurrentContext();
        if (object != null && ((Context)object).hasFeature(16)) {
            Arrays.sort(var7_14, KEY_COMPARATOR);
        }
        return var7_14;
    }

    protected ScriptableObject getOwnPropertyDescriptor(Context context, Object object) {
        if ((object = this.querySlot(context, object)) == null) {
            return null;
        }
        return ((Slot)object).getPropertyDescriptor(context, this);
    }

    @Override
    public Scriptable getParentScope() {
        return this.parentScopeObject;
    }

    @Override
    public Scriptable getPrototype() {
        return this.prototypeObject;
    }

    public String getTypeOf() {
        String string = this.avoidObjectDetection() ? "undefined" : "object";
        return string;
    }

    @Override
    public boolean has(int n2, Scriptable object) {
        object = this.externalData;
        boolean bl = true;
        boolean bl2 = true;
        if (object != null) {
            if (n2 >= object.getArrayLength()) {
                bl2 = false;
            }
            return bl2;
        }
        bl2 = this.slotMap.query(null, n2) != null ? bl : false;
        return bl2;
    }

    @Override
    public boolean has(String string, Scriptable object) {
        object = this.slotMap;
        boolean bl = false;
        if (((SlotMapContainer)object).query(string, 0) != null) {
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean has(Symbol symbol, Scriptable object) {
        object = this.slotMap;
        boolean bl = false;
        if (((SlotMapContainer)object).query(symbol, 0) != null) {
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        return ScriptRuntime.jsDelegatesTo(scriptable, this);
    }

    @Override
    public boolean isConst(String object) {
        SlotMapContainer slotMapContainer = this.slotMap;
        boolean bl = false;
        if ((object = slotMapContainer.query(object, 0)) == null) {
            return false;
        }
        if ((((Slot)object).getAttributes() & 5) == 5) {
            bl = true;
        }
        return bl;
    }

    public boolean isEmpty() {
        return this.slotMap.isEmpty();
    }

    public boolean isExtensible() {
        return this.isExtensible;
    }

    protected boolean isGenericDescriptor(ScriptableObject scriptableObject) {
        boolean bl = !ScriptableObject.isDataDescriptor(scriptableObject) && !ScriptableObject.isAccessorDescriptor(scriptableObject);
        return bl;
    }

    protected boolean isGetterOrSetter(String object, int n2, boolean bl) {
        bl = (object = this.slotMap.query(object, n2)) != null && ((Slot)object).isSetterSlot();
        return bl;
    }

    public final boolean isSealed() {
        return this.isSealed;
    }

    public void preventExtensions() {
        this.isExtensible = false;
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        ExternalArrayData externalArrayData = this.externalData;
        if (externalArrayData != null) {
            if (n2 < externalArrayData.getArrayLength()) {
                this.externalData.setArrayElement(n2, object);
                return;
            }
            throw new JavaScriptException(ScriptRuntime.newNativeError(Context.getCurrentContext(), this, TopLevel$NativeErrors.RangeError, new Object[]{"External array index out of bounds "}), null, 0);
        }
        if (this.putImpl(null, n2, scriptable, object)) {
            return;
        }
        if (scriptable != this) {
            scriptable.put(n2, scriptable, object);
            return;
        }
        throw Kit.codeBug();
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        if (this.putImpl(string, 0, scriptable, object)) {
            return;
        }
        if (scriptable != this) {
            scriptable.put(string, scriptable, object);
            return;
        }
        throw Kit.codeBug();
    }

    @Override
    public void put(Symbol symbol, Scriptable scriptable, Object object) {
        if (this.putImpl(symbol, 0, scriptable, object)) {
            return;
        }
        if (scriptable != this) {
            ScriptableObject.ensureSymbolScriptable(scriptable).put(symbol, scriptable, object);
            return;
        }
        throw Kit.codeBug();
    }

    @Override
    public void putConst(String string, Scriptable scriptable, Object object) {
        if (this.putConstImpl(string, 0, scriptable, object, 1)) {
            return;
        }
        if (scriptable != this) {
            if (scriptable instanceof ConstProperties) {
                ((ConstProperties)((Object)scriptable)).putConst(string, scriptable, object);
            } else {
                scriptable.put(string, scriptable, object);
            }
            return;
        }
        throw Kit.codeBug();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean putImpl(Object object, int n2, Scriptable scriptable, Object object2, boolean bl) {
        if (this != scriptable) {
            Slot slot = this.slotMap.query(object, n2);
            if (!this.isExtensible && (slot == null || !(slot instanceof AccessorSlot) && (slot.getAttributes() & 1) != 0) && bl) {
                throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
            }
            object = slot;
            if (slot != null) return ((Slot)object).setValue(object2, this, scriptable, bl);
            return false;
        }
        if (!this.isExtensible) {
            Slot slot = this.slotMap.query(object, n2);
            if ((slot == null || !(slot instanceof AccessorSlot) && (slot.getAttributes() & 1) != 0) && bl) throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
            object = slot;
            if (slot != null) return ((Slot)object).setValue(object2, this, scriptable, bl);
            return true;
        }
        if (this.isSealed) {
            this.checkNotSealed(object, n2);
        }
        object = this.slotMap.modify(object, n2, 0);
        return ((Slot)object).setValue(object2, this, scriptable, bl);
    }

    protected Slot querySlot(Context object, Object object2) {
        if (object2 instanceof Symbol) {
            return this.slotMap.query(object2, 0);
        }
        object = ScriptRuntime.toStringIdOrIndex(object2);
        object2 = ((ScriptRuntime$StringIdOrIndex)object).stringId;
        if (object2 == null) {
            return this.slotMap.query(null, ((ScriptRuntime$StringIdOrIndex)object).index);
        }
        return this.slotMap.query(object2, 0);
    }

    protected boolean sameValue(Object object, Object object2) {
        Object object3 = Scriptable.NOT_FOUND;
        if (object == object3) {
            return true;
        }
        Object object4 = object2;
        if (object2 == object3) {
            object4 = Undefined.instance;
        }
        if (object4 instanceof Number && object instanceof Number) {
            double d2 = ((Number)object4).doubleValue();
            double d3 = ((Number)object).doubleValue();
            if (Double.isNaN(d2) && Double.isNaN(d3)) {
                return true;
            }
            if (d2 == 0.0 && Double.doubleToLongBits(d2) != Double.doubleToLongBits(d3)) {
                return false;
            }
        }
        return ScriptRuntime.shallowEq(object4, object);
    }

    /*
     * Unable to fully structure code
     */
    public void sealObject() {
        block8: {
            if (this.isSealed) break block8;
            var1_1 = this.slotMap.readLock();
            var5_2 = this.slotMap.iterator();
lbl5:
            // 2 sources

            while (true) {
                if (!var5_2.hasNext()) ** GOTO lbl-1000
                var3_4 = var5_2.next();
                var4_6 = var3_4.value;
                if (!(var4_6 instanceof LazilyLoadedCtor)) continue;
                var4_6 = (LazilyLoadedCtor)var4_6;
                break;
            }
            {
                catch (Throwable var3_5) {
                    this.slotMap.unlockRead(var1_1);
                    throw var3_5;
                }
            }
            {
                var4_6.init();
                continue;
lbl-1000:
                // 1 sources

                {
                    this.isSealed = true;
                }
                this.slotMap.unlockRead(var1_1);
                break block8;
            }
            finally {
                var3_4.value = var4_6.getValue();
                ** continue;
            }
        }
    }

    public void setAttributes(int n2, int n3) {
        this.checkNotSealed(null, n2);
        this.slotMap.modify(null, n2, 0).setAttributes(n3);
    }

    @Deprecated
    public void setAttributes(int n2, Scriptable scriptable, int n3) {
        this.setAttributes(n2, n3);
    }

    public void setAttributes(String string, int n2) {
        this.checkNotSealed(string, 0);
        this.slotMap.modify(string, 0, 0).setAttributes(n2);
    }

    @Deprecated
    public final void setAttributes(String string, Scriptable scriptable, int n2) {
        this.setAttributes(string, n2);
    }

    public void setAttributes(Symbol symbol, int n2) {
        this.checkNotSealed(symbol, 0);
        this.slotMap.modify(symbol, 0, 0).setAttributes(n2);
    }

    protected void setCommonDescriptorProperties(int n2, boolean bl) {
        boolean bl2 = true;
        if (bl) {
            bl = (n2 & 1) == 0;
            this.defineProperty("writable", (Object)bl, 0);
        }
        bl = (n2 & 2) == 0;
        this.defineProperty("enumerable", (Object)bl, 0);
        bl = (n2 & 4) == 0 ? bl2 : false;
        this.defineProperty("configurable", (Object)bl, 0);
    }

    public void setExternalArrayData(ExternalArrayData externalArrayData) {
        this.externalData = externalArrayData;
        if (externalArrayData == null) {
            this.delete("length");
        } else {
            this.defineProperty("length", null, GET_ARRAY_LENGTH, null, 3);
        }
    }

    public void setGetterOrSetter(String object, int n2, Callable callable, boolean bl) {
        block12: {
            AccessorSlot accessorSlot;
            Slot slot;
            block11: {
                block10: {
                    block9: {
                        if (object != null && n2 != 0) {
                            throw new IllegalArgumentException((String)object);
                        }
                        this.checkNotSealed(object, n2);
                        if (!this.isExtensible()) break block9;
                        slot = this.slotMap.modify(object, n2, 0);
                        if (slot instanceof AccessorSlot) break block10;
                        accessorSlot = new AccessorSlot(slot);
                        this.slotMap.replace(slot, accessorSlot);
                        slot = accessorSlot;
                        break block11;
                    }
                    slot = this.slotMap.query(object, n2);
                    if (!(slot instanceof AccessorSlot)) break block12;
                }
                slot = (AccessorSlot)slot;
            }
            if ((slot.getAttributes() & 1) == 0) {
                accessorSlot = null;
                object = null;
                if (bl) {
                    if (callable instanceof Function) {
                        object = new AccessorSlot$FunctionSetter(callable);
                    }
                    ((AccessorSlot)slot).setter = object;
                } else {
                    object = accessorSlot;
                    if (callable instanceof Function) {
                        object = new AccessorSlot$FunctionGetter(callable);
                    }
                    ((AccessorSlot)slot).getter = object;
                }
                slot.value = Undefined.instance;
                return;
            }
            throw Context.reportRuntimeErrorById("msg.modify.readonly", object);
        }
    }

    @Override
    public void setParentScope(Scriptable scriptable) {
        this.parentScopeObject = scriptable;
    }

    @Override
    public void setPrototype(Scriptable scriptable) {
        this.prototypeObject = scriptable;
    }

    public int size() {
        return this.slotMap.size();
    }
}

