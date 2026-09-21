/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.h1.c;
import com.github.catvod.spider.merge.h1.d;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.ClassCache;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.JavaAdapter$JavaAdapterSignature;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ObjToIntMap$Iterator;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;

public final class JavaAdapter
implements IdFunctionCall {
    private static final Object FTAG = "JavaAdapter";
    private static final int Id_JavaAdapter = 1;

    public static /* synthetic */ Object a(Scriptable scriptable, Scriptable scriptable2, Function function, Object[] objectArray, long l2, Context context) {
        return JavaAdapter.doCall(context, scriptable, scriptable2, function, objectArray, l2);
    }

    static int appendMethodSignature(Class<?>[] classArray, Class<?> clazz, StringBuilder stringBuilder) {
        stringBuilder.append('(');
        int n2 = classArray.length + 1;
        for (Class<?> clazz2 : classArray) {
            int n3;
            block4: {
                block3: {
                    JavaAdapter.appendTypeString(stringBuilder, clazz2);
                    if (clazz2 == Long.TYPE) break block3;
                    n3 = n2;
                    if (clazz2 != Double.TYPE) break block4;
                }
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        stringBuilder.append(')');
        JavaAdapter.appendTypeString(stringBuilder, clazz);
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void appendOverridableMethods(Class<?> methodArray, ArrayList<Method> arrayList, HashSet<String> hashSet) {
        methodArray = methodArray.isInterface() ? methodArray.getMethods() : methodArray.getDeclaredMethods();
        int n2 = methodArray.length;
        int n3 = 0;
        while (true) {
            block5: {
                String string;
                block6: {
                    int n4;
                    if (n3 >= n2) {
                        return;
                    }
                    Method method = methodArray[n3];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(method.getName());
                    stringBuilder.append(JavaAdapter.getMethodSignature(method, method.getParameterTypes()));
                    string = stringBuilder.toString();
                    if (hashSet.contains(string) || Modifier.isStatic(n4 = method.getModifiers())) break block5;
                    if (Modifier.isFinal(n4)) break block6;
                    if (!Modifier.isPublic(n4) && !Modifier.isProtected(n4)) break block5;
                    arrayList.add(method);
                }
                hashSet.add(string);
            }
            ++n3;
        }
    }

    private static StringBuilder appendTypeString(StringBuilder stringBuilder, Class<?> clazz) {
        int n2;
        while (clazz.isArray()) {
            stringBuilder.append('[');
            clazz = clazz.getComponentType();
        }
        if (clazz.isPrimitive()) {
            n2 = clazz == Boolean.TYPE ? 90 : (clazz == Long.TYPE ? 74 : Character.toUpperCase(clazz.getName().charAt(0)));
        } else {
            stringBuilder.append('L');
            stringBuilder.append(clazz.getName().replace('.', '/'));
            n2 = 59;
        }
        stringBuilder.append((char)n2);
        return stringBuilder;
    }

    public static /* synthetic */ ScriptableObject b(Script script, Context context) {
        return JavaAdapter.lambda$runScript$1(script, context);
    }

    public static Object callMethod(ContextFactory object, Scriptable scriptable, Function function, Object[] objectArray, long l2) {
        if (function == null) {
            return null;
        }
        ContextFactory contextFactory = object;
        if (object == null) {
            contextFactory = ContextFactory.getGlobal();
        }
        Scriptable scriptable2 = function.getParentScope();
        if (l2 == 0L) {
            return Context.call(contextFactory, function, scriptable2, scriptable, objectArray);
        }
        object = Context.getCurrentContext();
        if (object != null) {
            return JavaAdapter.doCall((Context)object, scriptable2, scriptable, function, objectArray, l2);
        }
        return contextFactory.call(new d(scriptable2, scriptable, function, objectArray, l2));
    }

    public static Object convertResult(Object object, Class<?> clazz) {
        if (object == Undefined.instance && clazz != ScriptRuntime.ObjectClass && clazz != ScriptRuntime.StringClass) {
            return null;
        }
        return Context.jsToJava(object, clazz);
    }

    public static byte[] createAdapterCode(ObjToIntMap object, String string, Class<?> object2, Class<?>[] object3, String object4) {
        Object object5;
        Object object6;
        int n2;
        int n3;
        ClassFileWriter classFileWriter = new ClassFileWriter(string, ((Class)object2).getName(), "<adapter>");
        classFileWriter.addField("factory", "Lorg/mozilla/javascript/ContextFactory;", (short)17);
        classFileWriter.addField("delegee", "Lorg/mozilla/javascript/Scriptable;", (short)17);
        classFileWriter.addField("self", "Lorg/mozilla/javascript/Scriptable;", (short)17);
        int n4 = object3 == null ? 0 : ((Object)object3).length;
        for (n3 = 0; n3 < n4; ++n3) {
            if (object3[n3] == null) continue;
            classFileWriter.addInterface(((Class)object3[n3]).getName());
        }
        Object object7 = ((Class)object2).getName().replace('.', '/');
        for (Constructor<?> executable2 : ((Class)object2).getDeclaredConstructors()) {
            n2 = executable2.getModifiers();
            if (!Modifier.isPublic(n2) && !Modifier.isProtected(n2)) continue;
            JavaAdapter.generateCtor(classFileWriter, string, (String)object7, executable2);
        }
        JavaAdapter.generateSerialCtor(classFileWriter, string, (String)object7);
        if (object4 != null) {
            JavaAdapter.generateEmptyCtor(classFileWriter, string, (String)object7, (String)object4);
        }
        ObjToIntMap objToIntMap = new ObjToIntMap();
        object4 = new ObjToIntMap();
        for (n3 = 0; n3 < n4; ++n3) {
            object6 = ((Class)object3[n3]).getMethods();
            int n5 = ((Method[])object6).length;
            for (n2 = 0; n2 < n5; ++n2) {
                String string2;
                Method method = object6[n2];
                int n6 = method.getModifiers();
                if (Modifier.isStatic(n6) || Modifier.isFinal(n6) || method.isDefault()) continue;
                String string3 = method.getName();
                object5 = method.getParameterTypes();
                if (!((ObjToIntMap)object).has(string3)) {
                    try {
                        ((Class)object2).getMethod(string3, (Class<?>)object5);
                        continue;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        // empty catch block
                    }
                }
                if (objToIntMap.has(string2 = e.c(string3, JavaAdapter.getMethodSignature(method, object5)))) continue;
                JavaAdapter.generateMethod(classFileWriter, string, string3, object5, method.getReturnType(), true);
                objToIntMap.put(string2, 0);
                ((ObjToIntMap)object4).put(string3, 0);
            }
        }
        for (Method method : JavaAdapter.getOverridableMethods(object2)) {
            Class<?>[] classArray;
            boolean bl = Modifier.isAbstract(method.getModifiers());
            object3 = method.getName();
            if (!bl && !((ObjToIntMap)object).has(object3) || objToIntMap.has(object5 = e.c((String)object3, (String)(object6 = JavaAdapter.getMethodSignature(method, classArray = method.getParameterTypes()))))) continue;
            JavaAdapter.generateMethod(classFileWriter, string, (String)object3, classArray, method.getReturnType(), true);
            objToIntMap.put(object5, 0);
            ((ObjToIntMap)object4).put(object3, 0);
            if (bl) continue;
            JavaAdapter.generateSuper(classFileWriter, string, (String)object7, (String)object3, (String)object6, classArray, method.getReturnType());
        }
        object = new ObjToIntMap$Iterator((ObjToIntMap)object);
        ((ObjToIntMap$Iterator)object).start();
        while (!((ObjToIntMap$Iterator)object).done()) {
            object2 = (String)((ObjToIntMap$Iterator)object).getKey();
            if (!((ObjToIntMap)object4).has(object2)) {
                n3 = ((ObjToIntMap$Iterator)object).getValue();
                object3 = new Class[n3];
                n4 = 0;
                while (true) {
                    object7 = ScriptRuntime.ObjectClass;
                    if (n4 >= n3) break;
                    object3[n4] = object7;
                    ++n4;
                }
                JavaAdapter.generateMethod(classFileWriter, string, (String)object2, object3, object7, false);
            }
            ((ObjToIntMap$Iterator)object).next();
        }
        return classFileWriter.toByteArray();
    }

    public static Scriptable createAdapterWrapper(Scriptable scriptable, Object object) {
        object = new NativeJavaObject(ScriptableObject.getTopLevelScope(scriptable), object, null, true);
        ((NativeJavaObject)object).setPrototype(scriptable);
        return object;
    }

    private static Object doCall(Context context, Scriptable scriptable, Scriptable scriptable2, Function function, Object[] objectArray, long l2) {
        for (int i2 = 0; i2 != objectArray.length; ++i2) {
            Object object;
            if (0L == ((long)(1 << i2) & l2) || (object = objectArray[i2]) instanceof Scriptable) continue;
            objectArray[i2] = context.getWrapFactory().wrap(context, scriptable, object, null);
        }
        return function.call(context, scriptable, scriptable2, objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void generateCtor(ClassFileWriter classFileWriter, String string, String string2, Constructor<?> object) {
        Class<?>[] classArray = ((Constructor)object).getParameterTypes();
        int n2 = classArray.length;
        short s2 = 3;
        if (n2 == 0) {
            classFileWriter.startMethod("<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;)V", (short)1);
            classFileWriter.add(42);
            object = "()V";
        } else {
            object = new StringBuilder("(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;");
            int n3 = ((StringBuilder)object).length();
            int n4 = classArray.length;
            int n5 = 0;
            for (n2 = 0; n2 < n4; ++n2) {
                JavaAdapter.appendTypeString((StringBuilder)object, classArray[n2]);
            }
            ((StringBuilder)object).append(")V");
            classFileWriter.startMethod("<init>", ((StringBuilder)object).toString(), (short)1);
            classFileWriter.add(42);
            n4 = classArray.length;
            for (n2 = n5; n2 < n4; ++n2) {
                s2 = (short)(s2 + JavaAdapter.generatePushParam(classFileWriter, s2, classArray[n2]));
            }
            ((StringBuilder)object).delete(1, n3);
            object = ((StringBuilder)object).toString();
        }
        classFileWriter.addInvoke(183, string2, "<init>", (String)object);
        classFileWriter.add(42);
        classFileWriter.add(43);
        classFileWriter.add(181, string, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(42);
        classFileWriter.add(44);
        classFileWriter.add(181, string, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.add(42);
        classFileWriter.add(43);
        classFileWriter.add(42);
        classFileWriter.addInvoke(184, "org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(181, string, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(177);
        classFileWriter.stopMethod(s2);
    }

    private static void generateEmptyCtor(ClassFileWriter classFileWriter, String string, String string2, String string3) {
        classFileWriter.startMethod("<init>", "()V", (short)1);
        classFileWriter.add(42);
        classFileWriter.addInvoke(183, string2, "<init>", "()V");
        classFileWriter.add(42);
        classFileWriter.add(1);
        classFileWriter.add(181, string, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.add(187, string3);
        classFileWriter.add(89);
        classFileWriter.addInvoke(183, string3, "<init>", "()V");
        classFileWriter.addInvoke(184, "org/mozilla/javascript/JavaAdapter", "runScript", "(Lorg/mozilla/javascript/Script;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(76);
        classFileWriter.add(42);
        classFileWriter.add(43);
        classFileWriter.add(181, string, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(42);
        classFileWriter.add(43);
        classFileWriter.add(42);
        classFileWriter.addInvoke(184, "org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(181, string, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)2);
    }

    private static void generateMethod(ClassFileWriter classFileWriter, String string, String string2, Class<?>[] classArray, Class<?> clazz, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = JavaAdapter.appendMethodSignature(classArray, clazz, stringBuilder);
        classFileWriter.startMethod(string2, stringBuilder.toString(), (short)1);
        classFileWriter.add(42);
        classFileWriter.add(180, string, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.add(42);
        classFileWriter.add(180, string, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(42);
        classFileWriter.add(180, string, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.addPush(string2);
        classFileWriter.addInvoke(184, "org/mozilla/javascript/JavaAdapter", "getFunction", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Lorg/mozilla/javascript/Function;");
        JavaAdapter.generatePushWrappedArgs(classFileWriter, classArray, classArray.length);
        int n3 = classArray.length;
        if (n3 <= 64) {
            long l2 = 0L;
            for (int i2 = 0; i2 != classArray.length; ++i2) {
                long l3 = l2;
                if (!classArray[i2].isPrimitive()) {
                    l3 = l2 | (long)(1 << i2);
                }
                l2 = l3;
            }
            classFileWriter.addPush(l2);
            classFileWriter.addInvoke(184, "org/mozilla/javascript/JavaAdapter", "callMethod", "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Function;[Ljava/lang/Object;J)Ljava/lang/Object;");
            JavaAdapter.generateReturnResult(classFileWriter, clazz, bl);
            classFileWriter.stopMethod((short)n2);
            return;
        }
        throw Context.reportRuntimeErrorById("JavaAdapter can not subclass methods with more then 64 arguments.", new Object[0]);
    }

    /*
     * Unable to fully structure code
     */
    private static void generatePopResult(ClassFileWriter var0, Class<?> var1_1) {
        block6: {
            block7: {
                block4: {
                    block5: {
                        if (!var1_1.isPrimitive()) break block4;
                        var2_2 = var1_1.getName().charAt(0);
                        if (var2_2 == 102) break block5;
                        if (var2_2 == 105) ** GOTO lbl-1000
                        if (var2_2 == 108) ** GOTO lbl13
                        if (var2_2 == 115 || var2_2 == 122) ** GOTO lbl-1000
                        switch (var2_2) {
                            default: {
                                break block6;
                            }
                            case 100: {
                                var2_2 = 175;
                                break;
                            }
lbl13:
                            // 1 sources

                            var2_2 = 173;
                            break;
                            case 98: 
                            case 99: lbl-1000:
                            // 3 sources

                            {
                                var2_2 = 172;
                                break;
                            }
                        }
                        break block7;
                    }
                    var2_2 = 174;
                    break block7;
                }
                var2_2 = 176;
            }
            var0.add(var2_2);
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private static int generatePushParam(ClassFileWriter classFileWriter, int n2, Class<?> clazz) {
        if (!clazz.isPrimitive()) {
            classFileWriter.addALoad(n2);
            return 1;
        }
        char c2 = clazz.getName().charAt(0);
        if (c2 == 'f') {
            classFileWriter.addFLoad(n2);
            return 1;
        }
        if (c2 != 'i') {
            if (c2 == 'l') {
                classFileWriter.addLLoad(n2);
                return 2;
            }
            if (c2 != 's' && c2 != 'z') {
                switch (c2) {
                    default: {
                        throw Kit.codeBug();
                    }
                    case 'd': {
                        classFileWriter.addDLoad(n2);
                        return 2;
                    }
                    case 'b': 
                    case 'c': 
                }
            }
        }
        classFileWriter.addILoad(n2);
        return 1;
    }

    static void generatePushWrappedArgs(ClassFileWriter classFileWriter, Class<?>[] classArray, int n2) {
        classFileWriter.addPush(n2);
        classFileWriter.add(189, "java/lang/Object");
        int n3 = 1;
        for (n2 = 0; n2 != classArray.length; ++n2) {
            classFileWriter.add(89);
            classFileWriter.addPush(n2);
            n3 += JavaAdapter.generateWrapArg(classFileWriter, n3, classArray[n2]);
            classFileWriter.add(83);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void generateReturnResult(ClassFileWriter object, Class<?> object2, boolean bl) {
        int n2;
        block3: {
            block7: {
                block5: {
                    block8: {
                        block9: {
                            block10: {
                                block11: {
                                    block6: {
                                        block4: {
                                            block2: {
                                                if (object2 != Void.TYPE) break block2;
                                                ((ClassFileWriter)object).add(87);
                                                n2 = 177;
                                                break block3;
                                            }
                                            if (object2 != Boolean.TYPE) break block4;
                                            ((ClassFileWriter)object).addInvoke(184, "org/mozilla/javascript/Context", "toBoolean", "(Ljava/lang/Object;)Z");
                                            break block5;
                                        }
                                        if (object2 != Character.TYPE) break block6;
                                        ((ClassFileWriter)object).addInvoke(184, "org/mozilla/javascript/Context", "toString", "(Ljava/lang/Object;)Ljava/lang/String;");
                                        ((ClassFileWriter)object).add(3);
                                        ((ClassFileWriter)object).addInvoke(182, "java/lang/String", "charAt", "(I)C");
                                        break block5;
                                    }
                                    if (!((Class)object2).isPrimitive()) break block7;
                                    ((ClassFileWriter)object).addInvoke(184, "org/mozilla/javascript/Context", "toNumber", "(Ljava/lang/Object;)D");
                                    n2 = ((Class)object2).getName().charAt(0);
                                    if (n2 == 98) break block8;
                                    if (n2 == 100) break block9;
                                    if (n2 == 102) break block10;
                                    if (n2 == 105) break block8;
                                    if (n2 == 108) break block11;
                                    if (n2 != 115) {
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append("Unexpected return type ");
                                        ((StringBuilder)object).append(object2);
                                        throw new RuntimeException(((StringBuilder)object).toString());
                                    }
                                    break block8;
                                }
                                ((ClassFileWriter)object).add(143);
                                n2 = 173;
                                break block3;
                            }
                            ((ClassFileWriter)object).add(144);
                            n2 = 174;
                            break block3;
                        }
                        n2 = 175;
                        break block3;
                    }
                    ((ClassFileWriter)object).add(142);
                }
                ((ClassFileWriter)object).add(172);
                return;
            }
            object2 = ((Class)object2).getName();
            if (bl) {
                ((ClassFileWriter)object).addLoadConstant((String)object2);
                ((ClassFileWriter)object).addInvoke(184, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
                ((ClassFileWriter)object).addInvoke(184, "org/mozilla/javascript/JavaAdapter", "convertResult", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
            }
            ((ClassFileWriter)object).add(192, (String)object2);
            n2 = 176;
        }
        ((ClassFileWriter)object).add(n2);
    }

    private static void generateSerialCtor(ClassFileWriter classFileWriter, String string, String string2) {
        classFileWriter.startMethod("<init>", "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;)V", (short)1);
        classFileWriter.add(42);
        classFileWriter.addInvoke(183, string2, "<init>", "()V");
        classFileWriter.add(42);
        classFileWriter.add(43);
        classFileWriter.add(181, string, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.add(42);
        classFileWriter.add(44);
        classFileWriter.add(181, string, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(42);
        classFileWriter.add(45);
        classFileWriter.add(181, string, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.add(177);
        classFileWriter.stopMethod((short)4);
    }

    private static void generateSuper(ClassFileWriter classFileWriter, String charSequence, String string, String string2, String string3, Class<?>[] classArray, Class<?> clazz) {
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("super$");
        ((StringBuilder)charSequence).append(string2);
        classFileWriter.startMethod(((StringBuilder)charSequence).toString(), string3, (short)1);
        classFileWriter.add(25, 0);
        int n2 = classArray.length;
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += JavaAdapter.generatePushParam(classFileWriter, n3, classArray[i2]);
        }
        classFileWriter.addInvoke(183, string, string2, string3);
        if (!clazz.equals(Void.TYPE)) {
            JavaAdapter.generatePopResult(classFileWriter, clazz);
        } else {
            classFileWriter.add(177);
        }
        classFileWriter.stopMethod((short)(n3 + 1));
    }

    private static int generateWrapArg(ClassFileWriter classFileWriter, int n2, Class<?> clazz) {
        block1: {
            block8: {
                int n3;
                block10: {
                    block4: {
                        block9: {
                            block5: {
                                block6: {
                                    block7: {
                                        int n4;
                                        block3: {
                                            block2: {
                                                block0: {
                                                    boolean bl = clazz.isPrimitive();
                                                    n4 = 1;
                                                    n3 = 1;
                                                    if (bl) break block0;
                                                    classFileWriter.add(25, n2);
                                                    n2 = n4;
                                                    break block1;
                                                }
                                                if (clazz != Boolean.TYPE) break block2;
                                                classFileWriter.add(187, "java/lang/Boolean");
                                                classFileWriter.add(89);
                                                classFileWriter.add(21, n2);
                                                classFileWriter.addInvoke(183, "java/lang/Boolean", "<init>", "(Z)V");
                                                n2 = n4;
                                                break block1;
                                            }
                                            if (clazz != Character.TYPE) break block3;
                                            classFileWriter.add(21, n2);
                                            classFileWriter.addInvoke(184, "java/lang/String", "valueOf", "(C)Ljava/lang/String;");
                                            n2 = n4;
                                            break block1;
                                        }
                                        classFileWriter.add(187, "java/lang/Double");
                                        classFileWriter.add(89);
                                        n4 = clazz.getName().charAt(0);
                                        if (n4 == 98) break block4;
                                        if (n4 == 100) break block5;
                                        if (n4 == 102) break block6;
                                        if (n4 == 105) break block4;
                                        if (n4 == 108) break block7;
                                        if (n4 == 115) break block4;
                                        n2 = n3;
                                        break block8;
                                    }
                                    classFileWriter.add(22, n2);
                                    classFileWriter.add(138);
                                    break block9;
                                }
                                classFileWriter.add(23, n2);
                                n2 = 141;
                                break block10;
                            }
                            classFileWriter.add(24, n2);
                        }
                        n2 = 2;
                        break block8;
                    }
                    classFileWriter.add(21, n2);
                    n2 = 135;
                }
                classFileWriter.add(n2);
                n2 = n3;
            }
            classFileWriter.addInvoke(183, "java/lang/Double", "<init>", "(D)V");
        }
        return n2;
    }

    private static Class<?> getAdapterClass(Scriptable clazz, Class<?> clazz2, Class<?>[] classArray, Scriptable object) {
        ClassCache classCache = ClassCache.get((Scriptable)((Object)clazz));
        Map<JavaAdapter$JavaAdapterSignature, Class<?>> map = classCache.getInterfaceAdapterCacheMap();
        ObjToIntMap objToIntMap = JavaAdapter.getObjectFunctionNames((Scriptable)object);
        JavaAdapter$JavaAdapterSignature javaAdapter$JavaAdapterSignature = new JavaAdapter$JavaAdapterSignature(clazz2, classArray, objToIntMap);
        object = map.get(javaAdapter$JavaAdapterSignature);
        clazz = object;
        if (object == null) {
            clazz = a.c("adapter");
            ((StringBuilder)((Object)clazz)).append(classCache.newClassSerialNumber());
            clazz = ((StringBuilder)((Object)clazz)).toString();
            clazz = clazz2 = JavaAdapter.loadAdapterClass((String)((Object)clazz), JavaAdapter.createAdapterCode(objToIntMap, (String)((Object)clazz), clazz2, classArray, null));
            if (classCache.isCachingEnabled()) {
                map.put(javaAdapter$JavaAdapterSignature, clazz2);
                clazz = clazz2;
            }
        }
        return clazz;
    }

    public static Object getAdapterSelf(Class<?> clazz, Object object) {
        return clazz.getDeclaredField("self").get(object);
    }

    static int[] getArgsToConvert(Class<?>[] classArray) {
        int n2;
        int n3;
        int n4 = 0;
        int n5 = 0;
        for (n3 = 0; n3 != classArray.length; ++n3) {
            n2 = n5;
            if (!classArray[n3].isPrimitive()) {
                n2 = n5 + 1;
            }
            n5 = n2;
        }
        if (n5 == 0) {
            return null;
        }
        int[] nArray = new int[n5];
        n5 = 0;
        for (n3 = n4; n3 != classArray.length; ++n3) {
            n2 = n5;
            if (!classArray[n3].isPrimitive()) {
                nArray[n5] = n3;
                n2 = n5 + 1;
            }
            n5 = n2;
        }
        return nArray;
    }

    public static Function getFunction(Scriptable object, String string) {
        if ((object = ScriptableObject.getProperty((Scriptable)object, string)) == Scriptable.NOT_FOUND) {
            return null;
        }
        if (object instanceof Function) {
            return (Function)object;
        }
        throw ScriptRuntime.notFunctionError(object, string);
    }

    private static String getMethodSignature(Method method, Class<?>[] classArray) {
        StringBuilder stringBuilder = new StringBuilder();
        JavaAdapter.appendMethodSignature(classArray, method.getReturnType(), stringBuilder);
        return stringBuilder.toString();
    }

    private static ObjToIntMap getObjectFunctionNames(Scriptable scriptable) {
        Object[] objectArray = ScriptableObject.getPropertyIds(scriptable);
        ObjToIntMap objToIntMap = new ObjToIntMap(objectArray.length);
        for (int i2 = 0; i2 != objectArray.length; ++i2) {
            int n2;
            String string;
            Object object;
            if (!(objectArray[i2] instanceof String) || !((object = ScriptableObject.getProperty(scriptable, string = (String)objectArray[i2])) instanceof Function)) continue;
            int n3 = n2 = ScriptRuntime.toInt32(ScriptableObject.getProperty((Scriptable)((Function)object), "length"));
            if (n2 < 0) {
                n3 = 0;
            }
            objToIntMap.put(string, n3);
        }
        return objToIntMap;
    }

    static Method[] getOverridableMethods(Class<?> classArray) {
        Object object;
        ArrayList<Method> arrayList = new ArrayList<Method>();
        HashSet<String> hashSet = new HashSet<String>();
        Class<?>[] classArray2 = classArray;
        while (true) {
            object = classArray;
            if (classArray2 == null) break;
            JavaAdapter.appendOverridableMethods(classArray2, arrayList, hashSet);
            classArray2 = classArray2.getSuperclass();
        }
        while (true) {
            if (object == null) break;
            classArray = object.getInterfaces();
            int n2 = classArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                JavaAdapter.appendOverridableMethods(classArray[i2], arrayList, hashSet);
            }
            object = object.getSuperclass();
        }
        return arrayList.toArray(new Method[0]);
    }

    public static void init(Context object, Scriptable scriptable, boolean bl) {
        object = new IdFunctionObject(new JavaAdapter(), FTAG, 1, "JavaAdapter", 1, scriptable);
        ((IdFunctionObject)object).markAsConstructor(null);
        if (bl) {
            ((ScriptableObject)object).sealObject();
        }
        ((IdFunctionObject)object).exportAsScopeProperty();
    }

    /*
     * Unable to fully structure code
     */
    static Object js_createAdapter(Context var0, Scriptable var1_2, Object[] var2_3) {
        block12: {
            block13: {
                var6_4 = var2_3 /* !! */ .length;
                if (var6_4 == 0) break block12;
                for (var3_5 = 0; var3_5 < var6_4 - 1 && !((var7_6 = var2_3 /* !! */ [var3_5]) instanceof NativeObject); ++var3_5) {
                    if (var7_6 instanceof NativeJavaClass) {
                        continue;
                    }
                    throw ScriptRuntime.typeErrorById("msg.not.java.class.arg", new Object[]{String.valueOf(var3_5), ScriptRuntime.toString(var7_6)});
                }
                var7_6 = null;
                var9_7 = new Class[var3_5];
                var5_9 = 0;
                for (var4_8 = 0; var4_8 < var3_5; ++var4_8) {
                    var8_10 = ((NativeJavaClass)var2_3 /* !! */ [var4_8]).getClassObject();
                    if (!var8_10.isInterface()) {
                        if (var7_6 == null) {
                            var7_6 = var8_10;
                            continue;
                        }
                        throw ScriptRuntime.typeErrorById("msg.only.one.super", new Object[]{var7_6.getName(), var8_10.getName()});
                    }
                    var9_7[var5_9] = var8_10;
                    ++var5_9;
                }
                var8_10 = var7_6;
                if (var7_6 == null) {
                    var8_10 = ScriptRuntime.ObjectClass;
                }
                var7_6 = new Class[var5_9];
                System.arraycopy(var9_7, 0, var7_6, 0, var5_9);
                var9_7 = ScriptableObject.ensureScriptable(var2_3 /* !! */ [var3_5]);
                var7_6 = JavaAdapter.getAdapterClass(var1_2, var8_10, var7_6, (Scriptable)var9_7);
                var4_8 = var6_4 - var3_5 - 1;
                if (var4_8 <= 0) ** GOTO lbl46
                try {
                    var8_10 = new Object[var4_8 + 2];
                    var8_10[0] = var9_7;
                }
                catch (Exception var0_1) {
                    throw Context.throwAsScriptRuntimeEx(var0_1);
                }
                var8_10[1] = var0.getFactory();
                System.arraycopy(var2_3 /* !! */ , var3_5 + 1, var8_10, 2, var4_8);
                var9_7 = new NativeJavaClass(var1_2, (Class<?>)var7_6, true);
                var9_7 = var9_7.members.ctors;
                var3_5 = var9_7.findCachedFunction((Context)var0, var8_10);
                if (var3_5 < 0) ** GOTO lbl44
                var0 = NativeJavaClass.constructInternal(var8_10, var9_7.methods[var3_5]);
                break block13;
lbl44:
                // 1 sources

                var0 = NativeJavaMethod.scriptSignature(var2_3 /* !! */ );
                throw Context.reportRuntimeErrorById("msg.no.java.ctor", new Object[]{var7_6.getName(), var0});
lbl46:
                // 1 sources

                var8_10 = ScriptRuntime.ScriptableClass;
                var2_3 /* !! */  = ScriptRuntime.ContextFactoryClass;
                var0 = var0.getFactory();
                var0 = var7_6.getConstructor(new Class[]{var8_10, var2_3 /* !! */ }).newInstance(new Object[]{var9_7, var0});
            }
            var0 = JavaAdapter.getAdapterSelf(var7_6, var0);
            if (var0 instanceof Wrapper && (var2_3 /* !! */  = ((Wrapper)var0).unwrap()) instanceof Scriptable) {
                if (var2_3 /* !! */  instanceof ScriptableObject) {
                    ScriptRuntime.setObjectProtoAndParent((ScriptableObject)var2_3 /* !! */ , var1_2);
                }
                return var2_3 /* !! */ ;
            }
            return var0;
        }
        throw ScriptRuntime.typeErrorById("msg.adapter.zero.args", new Object[0]);
    }

    private static /* synthetic */ ScriptableObject lambda$runScript$1(Script script, Context context) {
        ScriptableObject scriptableObject = ScriptRuntime.getGlobal(context);
        script.exec(context, scriptableObject);
        return scriptableObject;
    }

    /*
     * Unable to fully structure code
     */
    static Class<?> loadAdapterClass(String var0, byte[] var1_1) {
        var4_2 = SecurityController.getStaticSecurityDomainClass();
        if (var4_2 != CodeSource.class && var4_2 != ProtectionDomain.class) {
            while (true) {
                var3_4 = null;
                break;
            }
        } else {
            var2_3 = var3_4 = SecurityUtilities.getScriptProtectionDomain();
            if (var3_4 == null) {
                var2_3 = JavaAdapter.class.getProtectionDomain();
            }
            var3_4 = var2_3;
            if (var4_2 == CodeSource.class) {
                if (var2_3 == null) ** continue;
                var3_4 = var2_3.getCodeSource();
            }
        }
        var2_3 = SecurityController.createLoader(null, var3_4);
        var0 = var2_3.defineClass((String)var0, var1_1);
        var2_3.linkClass((Class<?>)var0);
        return var0;
    }

    public static Object readAdapterObject(Scriptable scriptable, ObjectInputStream object) {
        Object object2 = Context.getCurrentContext();
        object2 = object2 != null ? ((Context)object2).getFactory() : null;
        Class<Object> clazz = Class.forName((String)((ObjectInputStream)object).readObject());
        Object object3 = (String[])((ObjectInputStream)object).readObject();
        Object object4 = new Class[((String[])object3).length];
        for (int i2 = 0; i2 < ((String[])object3).length; ++i2) {
            object4[i2] = Class.forName(object3[i2]);
        }
        object = (Scriptable)((ObjectInputStream)object).readObject();
        object4 = JavaAdapter.getAdapterClass(scriptable, clazz, object4, (Scriptable)object);
        object3 = ScriptRuntime.ContextFactoryClass;
        clazz = ScriptRuntime.ScriptableClass;
        try {
            scriptable = ((Class)object4).getConstructor(new Class[]{object3, clazz, clazz}).newInstance(object2, object, scriptable);
            return scriptable;
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            throw new ClassNotFoundException("adapter");
        }
    }

    public static Scriptable runScript(Script script) {
        return (Scriptable)ContextFactory.getGlobal().call(new c(script));
    }

    public static void writeAdapterObject(Object object, ObjectOutputStream objectOutputStream) {
        Class<?> clazz = object.getClass();
        objectOutputStream.writeObject(clazz.getSuperclass().getName());
        Class<?>[] classArray = clazz.getInterfaces();
        String[] stringArray = new String[classArray.length];
        for (int i2 = 0; i2 < classArray.length; ++i2) {
            stringArray[i2] = classArray[i2].getName();
        }
        objectOutputStream.writeObject(stringArray);
        try {
            objectOutputStream.writeObject(clazz.getField("delegee").get(object));
            return;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            throw new IOException();
        }
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 1) {
            return JavaAdapter.js_createAdapter(context, scriptable, objectArray);
        }
        throw idFunctionObject.unknown();
    }
}

