/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.ResolvedOverload;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;

public class NativeJavaMethod
extends BaseFunction {
    private static final int PREFERENCE_AMBIGUOUS = 3;
    private static final int PREFERENCE_EQUAL = 0;
    private static final int PREFERENCE_FIRST_ARG = 1;
    private static final int PREFERENCE_SECOND_ARG = 2;
    private static final boolean debug = false;
    private static final long serialVersionUID = -3440381785576412928L;
    private String functionName;
    MemberBox[] methods;
    private final transient CopyOnWriteArrayList<ResolvedOverload> overloadCache = new CopyOnWriteArrayList();

    public NativeJavaMethod(Method method, String string) {
        this(new MemberBox(method), string);
    }

    NativeJavaMethod(MemberBox memberBox, String string) {
        this.functionName = string;
        this.methods = new MemberBox[]{memberBox};
    }

    NativeJavaMethod(MemberBox[] memberBoxArray) {
        this.functionName = memberBoxArray[0].getName();
        this.methods = memberBoxArray;
    }

    NativeJavaMethod(MemberBox[] memberBoxArray, String string) {
        this.functionName = string;
        this.methods = memberBoxArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static int findFunction(Context var0, MemberBox[] var1_1, Object[] var2_2) {
        if (var1_1.length == 0) {
            return -1;
        }
        if (var1_1.length == 1) {
            var0 = var1_1[0];
            var1_1 = var0.argTypes;
            var4_3 = var1_1.length;
            if (var0.vararg) {
                var3_5 = --var4_3;
                if (var4_3 > var2_2.length) {
                    return -1;
                }
            } else {
                var3_5 = var4_3;
                if (var4_3 != var2_2.length) {
                    return -1;
                }
            }
            for (var4_3 = 0; var4_3 != var3_5; ++var4_3) {
                if (NativeJavaObject.canConvert(var2_2[var4_3], var1_1[var4_3])) continue;
                return -1;
            }
            return 0;
        }
        var10_7 = null;
        var3_6 = -1;
        var7_8 = 0;
        for (var4_4 = 0; var4_4 < var1_1.length; ++var4_4) {
            block33: {
                block35: {
                    block34: {
                        var12_14 = var1_1[var4_4];
                        var11_13 /* !! */  = var12_14.argTypes;
                        var6_10 = var11_13 /* !! */ .length;
                        if (!var12_14.vararg) break block34;
                        var5_9 = --var6_10;
                        if (var6_10 <= var2_2.length) break block35;
                        var11_13 /* !! */  = var10_7;
                        var5_9 = var3_6;
                        var6_10 = var7_8;
                        break block33;
                    }
                    var5_9 = var6_10;
                    if (var6_10 == var2_2.length) break block35;
                    var11_13 /* !! */  = var10_7;
                    var5_9 = var3_6;
                    var6_10 = var7_8;
                    break block33;
                }
                for (var6_10 = 0; var6_10 < var5_9; ++var6_10) {
                    if (NativeJavaObject.canConvert(var2_2[var6_10], var11_13 /* !! */ [var6_10])) continue;
                    var11_13 /* !! */  = var10_7;
                    var5_9 = var3_6;
                    var6_10 = var7_8;
                    break block33;
                }
                if (var3_6 < 0) ** GOTO lbl-1000
                var6_10 = 0;
                var5_9 = 0;
                block3: for (var8_11 = -1; var8_11 != var7_8; ++var8_11) {
                    block38: {
                        block37: {
                            block36: {
                                var9_12 /* !! */  = var8_11 == -1 ? var3_6 : (int)var10_7[var8_11];
                                var13_15 = var1_1[var9_12 /* !! */ ];
                                if (!var0.hasFeature(13) || var13_15.isPublic() == var12_14.isPublic()) break block36;
                                if (var13_15.isPublic()) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        ++var5_9;
                                        continue block3;
                                        break;
                                    }
                                }
                                break block37;
                            }
                            var9_12 /* !! */  = NativeJavaMethod.preferSignature(var2_2, var11_13 /* !! */ , var12_14.vararg, var13_15.argTypes, var13_15.vararg);
                            if (var9_12 /* !! */  == 3) break;
                            if (var9_12 /* !! */  != 1) break block38;
                        }
                        ++var6_10;
                        continue;
                    }
                    if (var9_12 /* !! */  == 2) {
                        ** continue;
                    }
                    if (var9_12 /* !! */  != 0) {
                        Kit.codeBug();
                    }
                    var11_13 /* !! */  = var10_7;
                    var5_9 = var3_6;
                    var6_10 = var7_8;
                    if (var13_15.isStatic()) {
                        var11_13 /* !! */  = var10_7;
                        var5_9 = var3_6;
                        var6_10 = var7_8;
                        if (var13_15.getDeclaringClass().isAssignableFrom(var12_14.getDeclaringClass())) {
                            ** if (var8_11 != -1) goto lbl-1000
                        }
                    }
                    break block33;
lbl-1000:
                    // 2 sources

                    {
                        var5_9 = var4_4;
                        var11_13 /* !! */  = var10_7;
                        var6_10 = var7_8;
                        ** GOTO lbl107
                    }
lbl-1000:
                    // 1 sources

                    {
                        var10_7[var8_11] = var4_4;
                        var11_13 /* !! */  = var10_7;
                        var5_9 = var3_6;
                        var6_10 = var7_8;
                    }
                    break block33;
                }
                if (var6_10 == (var8_11 = var7_8 + 1)) {
                    var5_9 = var4_4;
                    var6_10 = 0;
                    var11_13 /* !! */  = var10_7;
                } else if (var5_9 == var8_11) {
                    var11_13 /* !! */  = var10_7;
                    var5_9 = var3_6;
                    var6_10 = var7_8;
                } else {
                    var11_13 /* !! */  = var10_7;
                    if (var10_7 == null) {
                        var11_13 /* !! */  = (Class<?>[])new int[var1_1.length - 1];
                    }
                    var11_13 /* !! */ [var7_8] = var4_4;
                    var6_10 = var8_11;
                    var5_9 = var3_6;
                }
            }
            var10_7 = var11_13 /* !! */ ;
            var3_6 = var5_9;
            var7_8 = var6_10;
        }
        if (var3_6 < 0) {
            return -1;
        }
        if (var7_8 == 0) {
            return var3_6;
        }
        var0 = new StringBuilder();
        for (var4_4 = -1; var4_4 != var7_8; ++var4_4) {
            var5_9 = var4_4 == -1 ? var3_6 : var10_7[var4_4];
            var0.append("\n    ");
            var0.append(var1_1[var5_9].toJavaDeclaration());
        }
        var11_13 /* !! */  = var1_1[var3_6];
        var10_7 = var11_13 /* !! */ .getName();
        var11_13 /* !! */  = var11_13 /* !! */ .getDeclaringClass().getName();
        if (var1_1[0].isCtor()) {
            throw Context.reportRuntimeErrorById("msg.constructor.ambiguous", new Object[]{var10_7, NativeJavaMethod.scriptSignature(var2_2), var0.toString()});
        }
        throw Context.reportRuntimeErrorById("msg.method.ambiguous", new Object[]{var11_13 /* !! */ , var10_7, NativeJavaMethod.scriptSignature(var2_2), var0.toString()});
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int preferSignature(Object[] objectArray, Class<?>[] classArray, boolean bl, Class<?>[] classArray2, boolean bl2) {
        int n2 = 0;
        int n3 = 0;
        while (true) {
            block5: {
                int n4;
                block6: {
                    block8: {
                        Class<?> clazz;
                        Class<?> clazz2;
                        block9: {
                            block7: {
                                int n5;
                                n4 = n3;
                                if (n2 >= objectArray.length) return n4;
                                n4 = 1;
                                clazz2 = bl && n2 >= classArray.length ? classArray[classArray.length - 1] : classArray[n2];
                                clazz = bl2 && n2 >= classArray2.length ? classArray2[classArray2.length - 1] : classArray2[n2];
                                if (clazz2 == clazz) break block5;
                                Object object = objectArray[n2];
                                int n6 = NativeJavaObject.getConversionWeight(object, clazz2);
                                if (n6 < (n5 = NativeJavaObject.getConversionWeight(object, clazz))) break block6;
                                if (n6 > n5) break block7;
                                if (n6 != 0) break block8;
                                if (!clazz2.isAssignableFrom(clazz)) break block9;
                            }
                            n4 = 2;
                            break block6;
                        }
                        if (clazz.isAssignableFrom(clazz2)) break block6;
                    }
                    n4 = 3;
                }
                n3 = n4 = n3 | n4;
                if (n4 == 3) {
                    return n4;
                }
            }
            ++n2;
        }
    }

    private static void printDebug(String string, MemberBox memberBox, Object[] objectArray) {
    }

    static String scriptSignature(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 != objectArray.length; ++i2) {
            Object object = objectArray[i2];
            object = object == null ? "null" : (object instanceof Boolean ? "boolean" : (object instanceof String ? "string" : (object instanceof Number ? "number" : (object instanceof Scriptable ? (object instanceof Undefined ? "undefined" : (object instanceof Wrapper ? ((Wrapper)object).unwrap().getClass().getName() : (object instanceof Function ? "function" : "object"))) : JavaMembers.javaSignature(object.getClass())))));
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Object call(Context object, Scriptable object2, Scriptable object3, Object[] object4) {
        Object object5;
        Class<?> clazz;
        Object object6;
        if (this.methods.length == 0) {
            throw new RuntimeException("No methods defined for call");
        }
        int n2 = this.findCachedFunction((Context)object, (Object[])object4);
        if (n2 < 0) {
            object2 = this.methods[0].method().getDeclaringClass();
            object = new StringBuilder();
            ((StringBuilder)object).append(((Class)object2).getName());
            ((StringBuilder)object).append('.');
            ((StringBuilder)object).append(this.getFunctionName());
            ((StringBuilder)object).append('(');
            ((StringBuilder)object).append(NativeJavaMethod.scriptSignature((Object[])object4));
            ((StringBuilder)object).append(')');
            throw Context.reportRuntimeErrorById("msg.java.no_such_method", ((StringBuilder)object).toString());
        }
        MemberBox memberBox = this.methods[n2];
        Object object7 = memberBox.argTypes;
        if (memberBox.vararg) {
            object6 = new Object[((Class<?>[])object7).length];
            for (n2 = 0; n2 < ((Class<?>[])object7).length - 1; ++n2) {
                object6[n2] = Context.jsToJava(object4[n2], object7[n2]);
            }
            if (((Object)object4).length == ((Class<?>[])object7).length && (object4[((Object)object4).length - 1] == null || object4[((Object)object4).length - 1] instanceof NativeArray || object4[((Object)object4).length - 1] instanceof NativeJavaArray)) {
                object4 = Context.jsToJava(object4[((Object)object4).length - 1], object7[((Object)object7).length - 1]);
            } else {
                clazz = object7[((Class<?>[])object7).length - 1].getComponentType();
                object5 = Array.newInstance(clazz, ((Object)object4).length - ((Class<?>[])object7).length + 1);
                for (n2 = 0; n2 < Array.getLength(object5); ++n2) {
                    Array.set(object5, n2, Context.jsToJava(object4[((Object)object7).length - 1 + n2], clazz));
                }
                object4 = object5;
            }
            object6[((Object)object7).length - 1] = object4;
        } else {
            object5 = object4;
            n2 = 0;
            while (true) {
                object6 = object5;
                if (n2 >= ((Object)object5).length) break;
                Object object8 = object5[n2];
                clazz = Context.jsToJava(object8, object7[n2]);
                object6 = object5;
                if (clazz != object8) {
                    object6 = object5;
                    if (object4 == object5) {
                        object6 = (Object[])object5.clone();
                    }
                    object6[n2] = clazz;
                }
                ++n2;
                object5 = object6;
            }
        }
        if (memberBox.isStatic()) {
            object3 = null;
        } else {
            object7 = memberBox.getDeclaringClass();
            object4 = object3;
            while (true) {
                if (object4 == null) {
                    throw Context.reportRuntimeErrorById("msg.nonjava.method", this.getFunctionName(), ScriptRuntime.toString(object3), ((Class)object7).getName());
                }
                if (object4 instanceof Wrapper && ((Class)object7).isInstance(object5 = ((Wrapper)object4).unwrap())) {
                    object3 = object5;
                    break;
                }
                object4 = object4.getPrototype();
            }
        }
        object4 = memberBox.invoke(object3, (Object[])object6);
        object3 = memberBox.method().getReturnType();
        object = object2 = ((Context)object).getWrapFactory().wrap((Context)object, (Scriptable)object2, object4, (Class<?>)object3);
        if (object2 != null) return object;
        object = object2;
        if (object3 != Void.TYPE) return object;
        return Undefined.instance;
    }

    @Override
    String decompile(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        n2 = 1;
        if ((n3 & 1) == 0) {
            n2 = 0;
        }
        if (n2 == 0) {
            stringBuilder.append("function ");
            stringBuilder.append(this.getFunctionName());
            stringBuilder.append("() {");
        }
        stringBuilder.append("/*\n");
        stringBuilder.append(this.toString());
        String string = n2 != 0 ? "*/\n" : "*/}\n";
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    int findCachedFunction(Context object, Object[] objectArray) {
        MemberBox[] memberBoxArray = this.methods;
        if (memberBoxArray.length > 1) {
            for (ResolvedOverload resolvedOverload : this.overloadCache) {
                if (!resolvedOverload.matches(objectArray)) continue;
                return resolvedOverload.index;
            }
            int n2 = NativeJavaMethod.findFunction((Context)object, this.methods, objectArray);
            if (this.overloadCache.size() < this.methods.length * 2) {
                object = new ResolvedOverload(objectArray, n2);
                this.overloadCache.addIfAbsent((ResolvedOverload)object);
            }
            return n2;
        }
        return NativeJavaMethod.findFunction((Context)object, memberBoxArray, objectArray);
    }

    @Override
    public String getFunctionName() {
        return this.functionName;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.methods.length;
        for (int i2 = 0; i2 != n2; ++i2) {
            Object object;
            if (this.methods[i2].isMethod()) {
                object = this.methods[i2].method();
                stringBuilder.append(JavaMembers.javaSignature(((Method)object).getReturnType()));
                stringBuilder.append(' ');
                object = ((Method)object).getName();
            } else {
                object = this.methods[i2].getName();
            }
            stringBuilder.append((String)object);
            stringBuilder.append(JavaMembers.liveConnectSignature(this.methods[i2].argTypes));
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}

