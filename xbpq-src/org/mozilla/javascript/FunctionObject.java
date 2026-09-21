/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.commonjs.module.ModuleScope;

public class FunctionObject
extends BaseFunction {
    public static final int JAVA_BOOLEAN_TYPE = 3;
    public static final int JAVA_DOUBLE_TYPE = 4;
    public static final int JAVA_INT_TYPE = 2;
    public static final int JAVA_OBJECT_TYPE = 6;
    public static final int JAVA_SCRIPTABLE_TYPE = 5;
    public static final int JAVA_STRING_TYPE = 1;
    public static final int JAVA_UNSUPPORTED_TYPE = 0;
    private static final short VARARGS_CTOR = -2;
    private static final short VARARGS_METHOD = -1;
    private static boolean sawSecurityException = false;
    private static final long serialVersionUID = -5332312783643935019L;
    private String functionName;
    private transient boolean hasVoidReturn;
    private boolean isStatic;
    MemberBox member;
    private int parmsLength;
    private transient int returnTypeTag;
    private transient byte[] typeTags;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public FunctionObject(String object, Member object2, Scriptable scriptable) {
        if (object2 instanceof Constructor) {
            this.member = new MemberBox((Constructor)object2);
            this.isStatic = true;
        } else {
            this.member = object2 = new MemberBox((Method)object2);
            this.isStatic = ((MemberBox)object2).isStatic();
        }
        object2 = this.member.getName();
        this.functionName = object;
        object = this.member.argTypes;
        int n2 = ((Object)object).length;
        if (n2 == 4 && (((Class)object[1]).isArray() || ((Class)object[2]).isArray())) {
            int n3;
            if (((Class)object[1]).isArray()) {
                if (!this.isStatic || object[0] != ScriptRuntime.ContextClass || ((Class)object[1]).getComponentType() != ScriptRuntime.ObjectClass || object[2] != ScriptRuntime.FunctionClass || object[3] != Boolean.TYPE) throw Context.reportRuntimeErrorById("msg.varargs.ctor", object2);
                n3 = -2;
            } else {
                if (!this.isStatic || object[0] != ScriptRuntime.ContextClass || object[1] != ScriptRuntime.ScriptableClass || ((Class)object[2]).getComponentType() != ScriptRuntime.ObjectClass || object[3] != ScriptRuntime.FunctionClass) throw Context.reportRuntimeErrorById("msg.varargs.fun", object2);
                n3 = -1;
            }
            this.parmsLength = n3;
        } else {
            this.parmsLength = n2;
            if (n2 > 0) {
                this.typeTags = new byte[n2];
                for (int i2 = 0; i2 != n2; ++i2) {
                    int n4 = FunctionObject.getTypeTag(object[i2]);
                    if (n4 == 0) throw Context.reportRuntimeErrorById("msg.bad.parms", ((Class)object[i2]).getName(), object2);
                    this.typeTags[i2] = (byte)n4;
                }
            }
        }
        if (this.member.isMethod()) {
            object = this.member.method().getReturnType();
            if (object == Void.TYPE) {
                this.hasVoidReturn = true;
            } else {
                this.returnTypeTag = FunctionObject.getTypeTag(object);
            }
        } else {
            object = this.member.getDeclaringClass();
            if (!ScriptRuntime.ScriptableClass.isAssignableFrom((Class<?>)object)) throw Context.reportRuntimeErrorById("msg.bad.ctor.return", ((Class)object).getName());
        }
        ScriptRuntime.setFunctionProtoAndParent(this, Context.getCurrentContext(), scriptable, false);
    }

    public static Object convertArg(Context object, Scriptable scriptable, Object object2, int n2) {
        switch (n2) {
            default: {
                throw new IllegalArgumentException();
            }
            case 6: {
                if (object2 instanceof ConsString) {
                    return object2.toString();
                }
                return object2;
            }
            case 5: {
                return ScriptRuntime.toObjectOrNull((Context)object, object2, scriptable);
            }
            case 4: {
                if (object2 instanceof Double) {
                    return object2;
                }
                return ScriptRuntime.toNumber(object2);
            }
            case 3: {
                if (object2 instanceof Boolean) {
                    return object2;
                }
                object = ScriptRuntime.toBoolean(object2) ? Boolean.TRUE : Boolean.FALSE;
                return object;
            }
            case 2: {
                if (object2 instanceof Integer) {
                    return object2;
                }
                return ScriptRuntime.toInt32(object2);
            }
            case 1: 
        }
        if (object2 instanceof String) {
            return object2;
        }
        return ScriptRuntime.toString(object2);
    }

    @Deprecated
    public static Object convertArg(Context context, Scriptable scriptable, Object object, Class<?> clazz) {
        int n2 = FunctionObject.getTypeTag(clazz);
        if (n2 != 0) {
            return FunctionObject.convertArg(context, scriptable, object, n2);
        }
        throw Context.reportRuntimeErrorById("msg.cant.convert", clazz.getName());
    }

    static Method findSingleMethod(Method[] methodArray, String string) {
        int n2 = methodArray.length;
        Method method = null;
        for (int i2 = 0; i2 != n2; ++i2) {
            Method method2 = methodArray[i2];
            Method method3 = method;
            if (method2 != null) {
                method3 = method;
                if (string.equals(method2.getName())) {
                    if (method == null) {
                        method3 = method2;
                    } else {
                        throw Context.reportRuntimeErrorById("msg.no.overload", string, method2.getDeclaringClass().getName());
                    }
                }
            }
            method = method3;
        }
        return method;
    }

    static Method[] getMethodList(Class<?> genericDeclaration) {
        int n2;
        Method[] methodArray;
        block8: {
            block7: {
                try {
                    if (sawSecurityException) break block7;
                    methodArray = genericDeclaration.getDeclaredMethods();
                    break block8;
                }
                catch (SecurityException securityException) {
                    sawSecurityException = true;
                }
            }
            methodArray = null;
        }
        Method[] methodArray2 = methodArray;
        if (methodArray == null) {
            methodArray2 = genericDeclaration.getMethods();
        }
        int n3 = 0;
        int n4 = 0;
        for (n2 = 0; n2 < methodArray2.length; ++n2) {
            if (sawSecurityException ? methodArray2[n2].getDeclaringClass() != genericDeclaration : !Modifier.isPublic(methodArray2[n2].getModifiers())) {
                methodArray2[n2] = null;
                continue;
            }
            ++n4;
        }
        methodArray = new Method[n4];
        int n5 = methodArray2.length;
        n2 = 0;
        while (n3 < n5) {
            genericDeclaration = methodArray2[n3];
            n4 = n2;
            if (genericDeclaration != null) {
                methodArray[n2] = genericDeclaration;
                n4 = n2 + 1;
            }
            ++n3;
            n2 = n4;
        }
        return methodArray;
    }

    public static int getTypeTag(Class<?> clazz) {
        if (clazz == ScriptRuntime.StringClass) {
            return 1;
        }
        if (clazz != ScriptRuntime.IntegerClass && clazz != Integer.TYPE) {
            if (clazz != ScriptRuntime.BooleanClass && clazz != Boolean.TYPE) {
                if (clazz != ScriptRuntime.DoubleClass && clazz != Double.TYPE) {
                    if (ScriptRuntime.ScriptableClass.isAssignableFrom(clazz)) {
                        return 5;
                    }
                    if (clazz == ScriptRuntime.ObjectClass) {
                        return 6;
                    }
                    return 0;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    private void readObject(ObjectInputStream object) {
        object.defaultReadObject();
        int n2 = this.parmsLength;
        if (n2 > 0) {
            object = this.member.argTypes;
            this.typeTags = new byte[n2];
            for (n2 = 0; n2 != this.parmsLength; ++n2) {
                this.typeTags[n2] = (byte)FunctionObject.getTypeTag(object[n2]);
            }
        }
        if (this.member.isMethod()) {
            object = this.member.method().getReturnType();
            if (object == Void.TYPE) {
                this.hasVoidReturn = true;
            } else {
                this.returnTypeTag = FunctionObject.getTypeTag(object);
            }
        }
    }

    public void addAsConstructor(Scriptable scriptable, Scriptable scriptable2) {
        this.initAsConstructor(scriptable, scriptable2, 7);
        ScriptableObject.defineProperty(scriptable, scriptable2.getClassName(), this, 2);
    }

    public void addAsConstructor(Scriptable scriptable, Scriptable scriptable2, int n2) {
        this.initAsConstructor(scriptable, scriptable2, n2);
        ScriptableObject.defineProperty(scriptable, scriptable2.getClassName(), this, 2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Object call(Context var1_1, Scriptable var2_2, Scriptable var3_3, Object[] var4_4) {
        block26: {
            block24: {
                block25: {
                    var7_5 = ((Object[])var4_4).length;
                    var5_6 = this.parmsLength;
                    var6_7 = 1;
                    if (var5_6 >= 0) break block24;
                    for (var5_6 = 0; var5_6 < var7_5; ++var5_6) {
                        if (!(var4_4[var5_6] instanceof ConsString)) continue;
                        var4_4[var5_6] = var4_4[var5_6].toString();
                    }
                    if (this.parmsLength != -1) break block25;
                    var3_3 /* !! */  = this.member.invoke(null, new Object[]{var1_1, var3_3 /* !! */ , var4_4, this});
                    var5_6 = var6_7;
                    break block26;
                }
                var5_6 = var3_3 /* !! */  == null ? 1 : 0;
                var3_3 /* !! */  = var5_6 != 0 ? Boolean.TRUE : Boolean.FALSE;
                var10_8 = new Object[]{var1_1, var4_4, this, var3_3 /* !! */ };
                var3_3 /* !! */  = this.member.isCtor() ? this.member.newInstance(var10_8) : this.member.invoke(null, var10_8);
                ** GOTO lbl74
            }
            var11_10 = var3_3 /* !! */ ;
            if (!this.isStatic) {
                var12_11 /* !! */  = this.member.getDeclaringClass();
                var10_9 = var3_3 /* !! */ ;
                if (var3_3 /* !! */  instanceof Delegator) {
                    var10_9 = ((Delegator)var3_3 /* !! */ ).getDelegee();
                }
                var11_10 = var10_9;
                if (!var12_11 /* !! */ .isInstance(var10_9)) {
                    if ((var10_9 == var2_2 || var10_9 instanceof ModuleScope) && var2_2 != (var3_3 /* !! */  = this.getParentScope())) {
                        var8_13 = var9_12 = var12_11 /* !! */ .isInstance(var3_3 /* !! */ );
                        if (var9_12) {
                            var10_9 = var3_3 /* !! */ ;
                            var8_13 = var9_12;
                        }
                    } else {
                        var8_13 = false;
                    }
                    if (var8_13) {
                        var11_10 = var10_9;
                    } else {
                        throw ScriptRuntime.typeErrorById("msg.incompat.call", new Object[]{this.functionName});
                    }
                }
            }
            if ((var5_6 = this.parmsLength) == var7_5) {
                var3_3 /* !! */  = var4_4;
                var5_6 = 0;
                while (true) {
                    var10_9 = var3_3 /* !! */ ;
                    if (var5_6 != this.parmsLength) {
                        var13_14 = var4_4[var5_6];
                        var12_11 /* !! */  = FunctionObject.convertArg(var1_1, var2_2, var13_14, this.typeTags[var5_6]);
                        var10_9 = var3_3 /* !! */ ;
                        if (var13_14 != var12_11 /* !! */ ) {
                            var10_9 = var3_3 /* !! */ ;
                            if (var3_3 /* !! */  == var4_4) {
                                var10_9 = (Object[])var4_4.clone();
                            }
                            var10_9[var5_6] = var12_11 /* !! */ ;
                        }
                        ++var5_6;
                        var3_3 /* !! */  = var10_9;
                        continue;
                    }
                    break;
                }
            } else if (var5_6 == 0) {
                var10_9 = ScriptRuntime.emptyArgs;
            } else {
                var12_11 /* !! */  = new Object[var5_6];
                var5_6 = 0;
                while (true) {
                    var10_9 = var12_11 /* !! */ ;
                    if (var5_6 == this.parmsLength) break;
                    var3_3 /* !! */  = var5_6 < var7_5 ? var4_4[var5_6] : Undefined.instance;
                    var12_11 /* !! */ [var5_6] = FunctionObject.convertArg(var1_1, var2_2, (Object)var3_3 /* !! */ , this.typeTags[var5_6]);
                    ++var5_6;
                }
            }
            if (this.member.isMethod()) {
                var3_3 /* !! */  = this.member.invoke(var11_10, var10_9);
                var5_6 = var6_7;
            } else {
                var3_3 /* !! */  = this.member.newInstance(var10_9);
lbl74:
                // 2 sources

                var5_6 = 0;
            }
        }
        var4_4 = var3_3 /* !! */ ;
        if (var5_6 != 0) {
            if (this.hasVoidReturn) {
                var4_4 = Undefined.instance;
            } else {
                var4_4 = var3_3 /* !! */ ;
                if (this.returnTypeTag == 0) {
                    var4_4 = var1_1.getWrapFactory().wrap(var1_1, var2_2, var3_3 /* !! */ , null);
                }
            }
        }
        return var4_4;
    }

    @Override
    public Scriptable createObject(Context object, Scriptable scriptable) {
        if (!this.member.isCtor() && this.parmsLength != -2) {
            try {
                object = (Scriptable)this.member.getDeclaringClass().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                object.setPrototype(this.getClassPrototype());
                object.setParentScope(this.getParentScope());
                return object;
            }
            catch (Exception exception) {
                throw Context.throwAsScriptRuntimeEx(exception);
            }
        }
        return null;
    }

    @Override
    public int getArity() {
        int n2;
        int n3 = n2 = this.parmsLength;
        if (n2 < 0) {
            n3 = 1;
        }
        return n3;
    }

    @Override
    public String getFunctionName() {
        String string;
        String string2 = string = this.functionName;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @Override
    public int getLength() {
        return this.getArity();
    }

    public Member getMethodOrConstructor() {
        if (this.member.isMethod()) {
            return this.member.method();
        }
        return this.member.ctor();
    }

    void initAsConstructor(Scriptable scriptable, Scriptable scriptable2, int n2) {
        ScriptRuntime.setFunctionProtoAndParent((BaseFunction)this, Context.getCurrentContext(), scriptable);
        this.setImmunePrototypeProperty(scriptable2);
        scriptable2.setParentScope(this);
        ScriptableObject.defineProperty(scriptable2, "constructor", this, n2);
        this.setParentScope(scriptable);
    }

    boolean isVarArgsConstructor() {
        boolean bl = this.parmsLength == -2;
        return bl;
    }

    boolean isVarArgsMethod() {
        boolean bl = this.parmsLength == -1;
        return bl;
    }
}

