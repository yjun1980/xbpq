/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessControlContext;
import java.security.AllPermission;
import java.security.Permission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.BeanProperty;
import org.mozilla.javascript.ClassCache;
import org.mozilla.javascript.ClassCache$CacheKey;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.FieldAndMethods;
import org.mozilla.javascript.JavaMembers$MethodSignature;
import org.mozilla.javascript.JavaMembers_jdk11;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeJavaConstructor;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

class JavaMembers {
    private static final boolean STRICT_REFLECTIVE_ACCESS = JavaMembers.isModularJava();
    private static final Permission allPermission = new AllPermission();
    private Class<?> cl;
    NativeJavaMethod ctors;
    private Map<String, FieldAndMethods> fieldAndMethods;
    private Map<String, Object> members;
    private Map<String, FieldAndMethods> staticFieldAndMethods;
    private Map<String, Object> staticMembers;

    JavaMembers(Scriptable scriptable, Class<?> clazz) {
        this(scriptable, clazz, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    JavaMembers(Scriptable scriptable, Class<?> clazz, boolean bl) {
        Context context = ContextFactory.getGlobal().enterContext();
        try {
            HashMap<String, Object> hashMap = context.getClassShutter();
            if (hashMap != null && !hashMap.visibleToScripts(clazz.getName())) {
                throw Context.reportRuntimeErrorById("msg.access.prohibited", clazz.getName());
            }
            hashMap = new HashMap<String, Object>();
            this.members = hashMap;
            hashMap = new HashMap<String, Object>();
            this.staticMembers = hashMap;
            this.cl = clazz;
            this.reflect(context, scriptable, bl, context.hasFeature(13));
            context.close();
            return;
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                if (context == null) throw throwable2;
                try {
                    context.close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    throwable.addSuppressed(throwable3);
                }
                throw throwable2;
            }
        }
    }

    private static JavaMembers createJavaMembers(Scriptable scriptable, Class<?> clazz, boolean bl) {
        if (STRICT_REFLECTIVE_ACCESS) {
            return new JavaMembers_jdk11(scriptable, clazz, bl);
        }
        return new JavaMembers(scriptable, clazz, bl);
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void discoverAccessibleMethods(Class<?> object, Map<JavaMembers$MethodSignature, Method> map, boolean bl, boolean bl2) {
        void var10_26;
        int n2;
        int n3;
        int n4;
        block22: {
            JavaMembers$MethodSignature javaMembers$MethodSignature;
            void var10_12;
            block21: {
                boolean bl3 = Modifier.isPublic(((Class)object).getModifiers());
                n4 = 0;
                if (bl3) break block21;
                Object object2 = object;
                if (!bl2) break block22;
            }
            Object object3 = object;
            if (!bl) {
                if (bl2) {
                    Object object4 = object;
                } else {
                    Object object5 = object;
                    this.discoverPublicMethods((Class<?>)object, map);
                    return;
                }
            }
            while ((object = var10_12) != null) {
                for (Method method : ((Class)object).getDeclaredMethods()) {
                    int n5 = method.getModifiers();
                    if (!Modifier.isPublic(n5) && !Modifier.isProtected(n5) && !bl2 || map.containsKey(javaMembers$MethodSignature = new JavaMembers$MethodSignature(method))) continue;
                    if (bl2 && !method.isAccessible()) {
                        ((AccessibleObject)method).setAccessible(true);
                    }
                    map.put(javaMembers$MethodSignature, method);
                }
                Class<?>[] classArray = ((Class)object).getInterfaces();
                n3 = classArray.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    this.discoverAccessibleMethods(classArray[n2], map, bl, bl2);
                }
                Class clazz = ((Class)object).getSuperclass();
            }
            return;
            catch (SecurityException securityException) {
                Object object6 = object;
                try {
                    Method[] methodArray = ((Class)object).getMethods();
                    Object object7 = object;
                    n3 = methodArray.length;
                    n2 = 0;
                    while (n2 < n3) {
                        Method method = methodArray[n2];
                        Object object9 = object;
                        object9 = object;
                        javaMembers$MethodSignature = new JavaMembers$MethodSignature(method);
                        Object object10 = object;
                        if (!map.containsKey(javaMembers$MethodSignature)) {
                            Object object11 = object;
                            map.put(javaMembers$MethodSignature, method);
                        }
                        ++n2;
                    }
                    return;
                }
                catch (SecurityException securityException2) {
                    void var10_25;
                    object = a.c("Could not discover accessible methods of class ");
                    ((StringBuilder)object).append(var10_25.getName());
                    ((StringBuilder)object).append(" due to lack of privileges, attemping superclasses/interfaces.");
                    Context.reportWarning(((StringBuilder)object).toString());
                }
            }
        }
        object = var10_26.getInterfaces();
        n3 = ((Object)object).length;
        n2 = n4;
        while (true) {
            if (n2 >= n3) {
                object = var10_26.getSuperclass();
                if (object == null) return;
                this.discoverAccessibleMethods((Class<?>)object, map, bl, bl2);
                return;
            }
            this.discoverAccessibleMethods((Class<?>)object[n2], map, bl, bl2);
            ++n2;
        }
    }

    private Method[] discoverAccessibleMethods(Class<?> clazz, boolean bl, boolean bl2) {
        HashMap<JavaMembers$MethodSignature, Method> hashMap = new HashMap<JavaMembers$MethodSignature, Method>();
        this.discoverAccessibleMethods(clazz, hashMap, bl, bl2);
        return hashMap.values().toArray(new Method[0]);
    }

    private static MemberBox extractGetMethod(MemberBox[] memberBoxArray, boolean bl) {
        for (MemberBox memberBox : memberBoxArray) {
            if (memberBox.argTypes.length != 0 || bl && !memberBox.isStatic()) continue;
            if (memberBox.method().getReturnType() == Void.TYPE) break;
            return memberBox;
        }
        return null;
    }

    private static MemberBox extractSetMethod(Class<?> clazz, MemberBox[] memberBoxArray, boolean bl) {
        for (int i2 = 1; i2 <= 2; ++i2) {
            for (MemberBox memberBox : memberBoxArray) {
                Class<?>[] classArray;
                if (bl && !memberBox.isStatic() || (classArray = memberBox.argTypes).length != 1) continue;
                if (i2 == 1) {
                    if (classArray[0] != clazz) continue;
                    return memberBox;
                }
                if (i2 != 2) {
                    Kit.codeBug();
                }
                if (!classArray[0].isAssignableFrom(clazz)) continue;
                return memberBox;
            }
        }
        return null;
    }

    private static MemberBox extractSetMethod(MemberBox[] memberBoxArray, boolean bl) {
        for (MemberBox memberBox : memberBoxArray) {
            if (bl && !memberBox.isStatic() || memberBox.method().getReturnType() != Void.TYPE || memberBox.argTypes.length != 1) continue;
            return memberBox;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private MemberBox findExplicitFunction(String string, boolean bl) {
        void var6_14;
        String string2;
        int n2 = string.indexOf(40);
        if (n2 < 0) {
            return null;
        }
        if (bl) {
            Map<String, Object> object = this.staticMembers;
        } else {
            Map<String, Object> map = this.members;
        }
        int n3 = bl && n2 == 0 ? 1 : 0;
        if (n3 != 0) {
            MemberBox[] memberBoxArray = this.ctors.methods;
        } else {
            void var6_11;
            void var6_6;
            Object v2;
            string2 = string.substring(0, n2);
            Object v3 = v2 = var6_6.get(string2);
            if (!bl) {
                Object v4 = v2;
                if (v2 == null) {
                    Object object = this.staticMembers.get(string2);
                }
            }
            if (var6_11 instanceof NativeJavaMethod) {
                MemberBox[] memberBoxArray = ((NativeJavaMethod)var6_11).methods;
            } else {
                Object var6_13 = null;
            }
        }
        if (var6_14 != null) {
            for (void var7_19 : var6_14) {
                string2 = JavaMembers.liveConnectSignature(var7_19.argTypes);
                if (string2.length() + n2 != string.length() || !string.regionMatches(n2, string2, 0, string2.length())) continue;
                return var7_19;
            }
        }
        return null;
    }

    private static MemberBox findGetter(boolean bl, Map<String, Object> object, String string, String string2) {
        if (object.containsKey(string = string.concat(string2)) && (object = object.get(string)) instanceof NativeJavaMethod) {
            return JavaMembers.extractGetMethod(((NativeJavaMethod)object).methods, bl);
        }
        return null;
    }

    private Constructor<?>[] getAccessibleConstructors(boolean bl) {
        AccessibleObject[] accessibleObjectArray;
        if (bl && (accessibleObjectArray = this.cl) != ScriptRuntime.ClassClass) {
            try {
                accessibleObjectArray = accessibleObjectArray.getDeclaredConstructors();
                AccessibleObject.setAccessible(accessibleObjectArray, true);
                return accessibleObjectArray;
            }
            catch (SecurityException securityException) {
                StringBuilder stringBuilder = a.c("Could not access constructor  of class ");
                stringBuilder.append(this.cl.getName());
                stringBuilder.append(" due to lack of privileges.");
                Context.reportWarning(stringBuilder.toString());
            }
        }
        return this.cl.getConstructors();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Field[] getAccessibleFields(boolean bl, boolean bl2) {
        if (!bl2) {
            if (!bl) return this.cl.getFields();
        }
        try {
            ArrayList<Field> arrayList = new ArrayList<Field>();
            Object object = this.cl;
            while (true) {
                if (object == null) return arrayList.toArray(new Field[0]);
                for (Field field : object.getDeclaredFields()) {
                    int n2 = field.getModifiers();
                    if (!bl2 && !Modifier.isPublic(n2) && !Modifier.isProtected(n2)) continue;
                    if (!field.isAccessible()) {
                        ((AccessibleObject)field).setAccessible(true);
                    }
                    arrayList.add(field);
                }
                object = object.getSuperclass();
            }
        }
        catch (SecurityException securityException) {
            return this.cl.getFields();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Object getExplicitFunction(Scriptable object, String string, Object object2, boolean bl) {
        Map<String, Object> map = bl ? this.staticMembers : this.members;
        object2 = null;
        MemberBox memberBox = this.findExplicitFunction(string, bl);
        if (memberBox == null) return object2;
        Scriptable scriptable = ScriptableObject.getFunctionPrototype((Scriptable)object);
        if (memberBox.isCtor()) {
            object2 = new NativeJavaConstructor(memberBox);
        } else {
            object2 = object = map.get(memberBox.getName());
            if (!(object instanceof NativeJavaMethod)) return object2;
            object2 = object;
            if (((NativeJavaMethod)object).methods.length <= 1) return object2;
            object2 = new NativeJavaMethod(memberBox, string);
        }
        ((ScriptableObject)object2).setPrototype(scriptable);
        map.put(string, object2);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object getSecurityContext() {
        SecurityManager securityManager = System.getSecurityManager();
        Object object = null;
        if (securityManager == null) return object;
        object = securityManager.getSecurityContext();
        if (!(object instanceof AccessControlContext)) return object;
        try {
            ((AccessControlContext)object).checkPermission(allPermission);
            return null;
        }
        catch (SecurityException securityException) {
            return object;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean isModularJava() {
        boolean bl = false;
        try {
            Class.class.getMethod("getModule", new Class[0]);
            return true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return bl;
        }
    }

    static String javaSignature(Class<?> serializable) {
        int n2;
        Object object;
        if (!((Class)serializable).isArray()) {
            return ((Class)serializable).getName();
        }
        int n3 = 0;
        do {
            n2 = n3 + 1;
            object = ((Class)serializable).getComponentType();
            n3 = n2;
            serializable = object;
        } while (((Class)object).isArray());
        object = ((Class)object).getName();
        if (n2 == 1) {
            return ((String)object).concat("[]");
        }
        serializable = new StringBuilder(n2 * 2 + ((String)object).length());
        ((StringBuilder)serializable).append((String)object);
        while (n2 != 0) {
            --n2;
            ((StringBuilder)serializable).append("[]");
        }
        return ((StringBuilder)serializable).toString();
    }

    static String liveConnectSignature(Class<?>[] classArray) {
        int n2 = classArray.length;
        if (n2 == 0) {
            return "()";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        for (int i2 = 0; i2 != n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(JavaMembers.javaSignature(classArray[i2]));
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    static JavaMembers lookupClass(Scriptable object, Class<?> clazz, Class<?> clazz2, boolean bl) {
        ClassCache classCache = ClassCache.get((Scriptable)object);
        Map<ClassCache$CacheKey, JavaMembers> map = classCache.getClassCacheMap();
        Object object2 = JavaMembers.getSecurityContext();
        object = clazz;
        while (true) {
            Class<?> clazz3;
            if ((clazz3 = map.get(new ClassCache$CacheKey((Class<?>)object, object2))) != null) {
                if (object != clazz) {
                    map.put(new ClassCache$CacheKey(clazz, object2), (JavaMembers)((Object)clazz3));
                }
                return clazz3;
            }
            try {
                clazz3 = JavaMembers.createJavaMembers(classCache.getAssociatedScope(), object, bl);
            }
            catch (SecurityException securityException) {
                if (clazz2 != null && clazz2.isInterface()) {
                    object = clazz2;
                    clazz2 = null;
                    continue;
                }
                Class clazz4 = ((Class)object).getSuperclass();
                clazz3 = clazz4;
                if (clazz4 == null) {
                    if (((Class)object).isInterface()) {
                        clazz3 = ScriptRuntime.ObjectClass;
                    } else {
                        throw securityException;
                    }
                }
                object = clazz3;
                continue;
            }
            if (classCache.isCachingEnabled()) {
                map.put(new ClassCache$CacheKey((Class<?>)object, object2), (JavaMembers)((Object)clazz3));
                if (object != clazz) {
                    map.put(new ClassCache$CacheKey(clazz, object2), (JavaMembers)((Object)clazz3));
                }
            }
            return clazz3;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void reflect(Context var1_1, Scriptable var2_3, boolean var3_4, boolean var4_5) {
        var15_6 = this.discoverAccessibleMethods(this.cl, var3_4, var4_5);
        var7_14 = var15_6.length;
        var8_15 = 0;
        for (var6_16 = 0; var6_16 < var7_14; ++var6_16) {
            var16_19 = var15_6[var6_16];
            var13_17 /* !! */  = Modifier.isStatic(var16_19.getModifiers()) != false ? this.staticMembers : this.members;
            var17_20 = var13_17 /* !! */ .get(var18_21 = var16_19.getName());
            if (var17_20 == null) {
                var13_17 /* !! */ .put((String)var18_21, (Object)var16_19);
                continue;
            }
            if (var17_20 instanceof ObjArray) {
                var13_17 /* !! */  = (ObjArray)var17_20;
            } else {
                if (!(var17_20 instanceof Method)) {
                    Kit.codeBug();
                }
                var14_18 = new ObjArray();
                var14_18.add(var17_20);
                var13_17 /* !! */ .put(var18_21, var14_18);
                var13_17 /* !! */  = var14_18;
            }
            var13_17 /* !! */ .add(var16_19);
        }
        var6_16 = 0;
        while (true) {
            if (var6_16 != 2) {
                var7_14 = var6_16 == 0 ? 1 : 0;
                var13_17 /* !! */  = var7_14 != 0 ? this.staticMembers : this.members;
                var16_19 = var13_17 /* !! */ .entrySet().iterator();
            } else {
                var15_9 = this.getAccessibleFields(var3_4, var4_5);
                var7_14 = var15_9.length;
                break;
            }
            while (var16_19.hasNext()) {
                var15_8 = (Map.Entry)var16_19.next();
                var17_20 = var15_8.getValue();
                if (var17_20 instanceof Method) {
                    var14_18 = new MemberBox[]{new MemberBox((Method)var17_20)};
                } else {
                    var9_22 = (var17_20 = (ObjArray)var17_20).size();
                    if (var9_22 < 2) {
                        Kit.codeBug();
                    }
                    var14_18 = new MemberBox[var9_22];
                    for (var7_14 = 0; var7_14 != var9_22; ++var7_14) {
                        var14_18[var7_14] = new MemberBox((Method)var17_20.get(var7_14));
                    }
                }
                var14_18 = new NativeJavaMethod((MemberBox[])var14_18);
                if (var2_3 != null) {
                    ScriptRuntime.setFunctionProtoAndParent((BaseFunction)var14_18, (Context)var1_1, (Scriptable)var2_3, false);
                }
                var13_17 /* !! */ .put(var15_8.getKey(), var14_18);
            }
            ++var6_16;
        }
        for (var6_16 = 0; var6_16 < var7_14; ++var6_16) {
            var1_1 = var15_9[var6_16];
            var16_19 = var1_1.getName();
            var9_22 = var1_1.getModifiers();
            try {
                var3_4 = Modifier.isStatic(var9_22);
                var13_17 /* !! */  = var3_4 != false ? this.staticMembers : this.members;
                var14_18 = var13_17 /* !! */ .get(var16_19);
                if (var14_18 != null) {
                    if (var14_18 instanceof NativeJavaMethod) {
                        var14_18 = (NativeJavaMethod)var14_18;
                        var17_20 = new FieldAndMethods((Scriptable)var2_3, var14_18.methods, (Field)var1_1);
                        var1_1 = var3_4 != false ? this.staticFieldAndMethods : this.fieldAndMethods;
                        var14_18 = var1_1;
                        if (var1_1 == null) {
                            var14_18 = new HashMap();
                            if (var3_4) {
                                this.staticFieldAndMethods = var14_18;
                            } else {
                                this.fieldAndMethods = var14_18;
                            }
                        }
                        var14_18.put(var16_19, var17_20);
                        var13_17 /* !! */ .put(var16_19, var17_20);
                        continue;
                    }
                    if (var14_18 instanceof Field) {
                        if (!((Field)var14_18).getDeclaringClass().isAssignableFrom(var1_1.getDeclaringClass())) continue;
                    }
                } else {
                    var13_17 /* !! */ .put(var16_19, var1_1);
                    continue;
                }
                Kit.codeBug();
                continue;
            }
            catch (SecurityException var1_2) {
                var1_1 = new StringBuilder();
                var1_1.append("Could not access field ");
                var1_1.append((String)var16_19);
                var1_1.append(" of class ");
                var1_1.append(this.cl.getName());
                var1_1.append(" due to lack of privileges.");
                Context.reportWarning(var1_1.toString());
            }
        }
        var6_16 = 0;
        while (true) {
            if (var6_16 != 2) {
                var3_4 = var6_16 == 0;
                var14_18 = var3_4 != false ? this.staticMembers : this.members;
                var16_19 = new HashMap<Object, BeanProperty>();
                var17_20 = var14_18.keySet().iterator();
            } else {
                var1_1 = this.getAccessibleConstructors(var4_5);
                var2_3 = new MemberBox[((Object)var1_1).length];
                var6_16 = var8_15;
                while (true) {
                    if (var6_16 == ((Object)var1_1).length) {
                        this.ctors = new NativeJavaMethod((MemberBox[])var2_3, this.cl.getSimpleName());
                        return;
                    }
                    var2_3[var6_16] = new MemberBox((Constructor<?>)var1_1[var6_16]);
                    ++var6_16;
                }
            }
            while (var17_20.hasNext()) {
                var1_1 = (String)var17_20.next();
                var12_26 = var1_1.startsWith("get");
                var10_24 = var1_1.startsWith("set");
                var11_25 = var1_1.startsWith("is");
                if (!var12_26 && !var11_25 && !var10_24 || (var2_3 = var1_1.substring(var7_14 = var11_25 != false ? 2 : 3)).length() == 0) continue;
                var5_23 = var2_3.charAt(0);
                if (!Character.isUpperCase(var5_23)) ** GOTO lbl-1000
                if (var2_3.length() == 1) {
                    var1_1 = var2_3.toLowerCase();
                } else if (!Character.isUpperCase(var2_3.charAt(1))) {
                    var1_1 = new StringBuilder();
                    var1_1.append(Character.toLowerCase(var5_23));
                    var1_1.append(var2_3.substring(1));
                    var1_1 = var1_1.toString();
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = var2_3;
                }
                if (var16_19.containsKey(var1_1) || (var13_17 /* !! */  = var14_18.get(var1_1)) != null && (!var4_5 || !(var13_17 /* !! */  instanceof Member) || !Modifier.isPrivate(((Member)var13_17 /* !! */ ).getModifiers()))) continue;
                var15_11 /* !! */  = var13_17 /* !! */  = JavaMembers.findGetter(var3_4, (Map<String, Object>)var14_18, "get", (String)var2_3);
                if (var13_17 /* !! */  == null) {
                    var15_12 = JavaMembers.findGetter(var3_4, (Map<String, Object>)var14_18, "is", (String)var2_3);
                }
                var13_17 /* !! */  = "set".concat((String)var2_3);
                var10_24 = var14_18.containsKey(var13_17 /* !! */ );
                var2_3 = null;
                if (var10_24 && (var13_17 /* !! */  = var14_18.get(var13_17 /* !! */ )) instanceof NativeJavaMethod) {
                    var13_17 /* !! */  = (NativeJavaMethod)var13_17 /* !! */ ;
                    var2_3 = var15_13 != null ? JavaMembers.extractSetMethod(var15_13.method().getReturnType(), var13_17 /* !! */ .methods, var3_4) : JavaMembers.extractSetMethod(var13_17 /* !! */ .methods, var3_4);
                    if (var13_17 /* !! */ .methods.length <= 1) {
                        var13_17 /* !! */  = null;
                    }
                } else {
                    var13_17 /* !! */  = null;
                }
                var16_19.put(var1_1, new BeanProperty((MemberBox)var15_13, (MemberBox)var2_3, (NativeJavaMethod)var13_17 /* !! */ ));
            }
            var14_18.putAll(var16_19);
            ++var6_16;
        }
    }

    static void registerMethod(Map<JavaMembers$MethodSignature, Method> map, Method method) {
        JavaMembers$MethodSignature javaMembers$MethodSignature = new JavaMembers$MethodSignature(method);
        if (!map.containsKey(javaMembers$MethodSignature)) {
            map.put(javaMembers$MethodSignature, method);
        }
    }

    void discoverPublicMethods(Class<?> methodArray, Map<JavaMembers$MethodSignature, Method> map) {
        methodArray = methodArray.getMethods();
        int n2 = methodArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            JavaMembers.registerMethod(map, methodArray[i2]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Object get(Scriptable scriptable, String object, Object clazz, boolean bl) {
        Object object2;
        Map<String, Object> map = bl ? this.staticMembers : this.members;
        map = object2 = map.get(object);
        if (!bl) {
            map = object2;
            if (object2 == null) {
                map = this.staticMembers.get(object);
            }
        }
        object2 = map;
        if (map == null) {
            object2 = object = this.getExplicitFunction(scriptable, (String)object, clazz, bl);
            if (object == null) {
                return Scriptable.NOT_FOUND;
            }
        }
        if (object2 instanceof Scriptable) {
            return object2;
        }
        map = Context.getContext();
        try {
            if (object2 instanceof BeanProperty) {
                object2 = (BeanProperty)object2;
                object = ((BeanProperty)object2).getter;
                if (object == null) {
                    return Scriptable.NOT_FOUND;
                }
                object = ((MemberBox)object).invoke(clazz, Context.emptyArgs);
                clazz = ((BeanProperty)object2).getter.method().getReturnType();
            } else {
                object2 = (Field)object2;
                if (bl) {
                    clazz = null;
                }
                object = ((Field)object2).get(clazz);
                clazz = ((Field)object2).getType();
            }
        }
        catch (Exception exception) {
            throw Context.throwAsScriptRuntimeEx(exception);
        }
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        return ((Context)((Object)map)).getWrapFactory().wrap((Context)((Object)map), scriptable, object, clazz);
    }

    /*
     * WARNING - void declaration
     */
    Map<String, FieldAndMethods> getFieldAndMethodsObjects(Scriptable scriptable, Object object, boolean bl) {
        void var4_6;
        if (bl) {
            Map<String, FieldAndMethods> map2 = this.staticFieldAndMethods;
        } else {
            Map<String, FieldAndMethods> map = this.fieldAndMethods;
        }
        if (var4_6 == null) {
            return null;
        }
        HashMap<String, FieldAndMethods> hashMap = new HashMap<String, FieldAndMethods>(var4_6.size());
        for (FieldAndMethods fieldAndMethods : var4_6.values()) {
            FieldAndMethods fieldAndMethods2 = new FieldAndMethods(scriptable, fieldAndMethods.methods, fieldAndMethods.field);
            fieldAndMethods2.javaObject = object;
            hashMap.put(fieldAndMethods.field.getName(), fieldAndMethods2);
        }
        return hashMap;
    }

    Object[] getIds(boolean bl) {
        Map<String, Object> map = bl ? this.staticMembers : this.members;
        return map.keySet().toArray(new Object[0]);
    }

    boolean has(String string, boolean bl) {
        Map<String, Object> map = bl ? this.staticMembers : this.members;
        map = map.get(string);
        boolean bl2 = true;
        if (map != null) {
            return true;
        }
        bl = this.findExplicitFunction(string, bl) != null ? bl2 : false;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void put(Scriptable object, String object2, Object object3, Object object4, boolean bl) {
        Object object5;
        Object object6 = bl ? this.staticMembers : this.members;
        Object object7 = object5 = object6.get(object2);
        if (!bl) {
            object7 = object5;
            if (object5 == null) {
                object7 = this.staticMembers.get(object2);
            }
        }
        if (object7 == null) throw this.reportMemberNotFound((String)object2);
        object5 = object7;
        if (object7 instanceof FieldAndMethods) {
            object5 = ((FieldAndMethods)object6.get((Object)object2)).field;
        }
        if (object5 instanceof BeanProperty) {
            object7 = (BeanProperty)object5;
            object6 = ((BeanProperty)object7).setter;
            if (object6 == null) throw this.reportMemberNotFound((String)object2);
            object2 = ((BeanProperty)object7).setters;
            if (object2 != null && object4 != null) {
                ((NativeJavaMethod)object2).call(Context.getContext(), ScriptableObject.getTopLevelScope((Scriptable)object), (Scriptable)object, new Object[]{object4});
                return;
            }
            object = Context.jsToJava(object4, ((MemberBox)object6).argTypes[0]);
            try {
                ((BeanProperty)object7).setter.invoke(object3, new Object[]{object});
                return;
            }
            catch (Exception exception) {
                throw Context.throwAsScriptRuntimeEx(exception);
            }
        }
        if (!(object5 instanceof Field)) {
            object = object5 == null ? "msg.java.internal.private" : "msg.java.method.assign";
            throw Context.reportRuntimeErrorById((String)object, object2);
        }
        object = (Field)object5;
        object2 = Context.jsToJava(object4, ((Field)object).getType());
        try {
            ((Field)object).set(object3, object2);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Context.reportRuntimeErrorById("msg.java.internal.field.type", object4.getClass().getName(), object, object3.getClass().getName());
        }
        catch (IllegalAccessException illegalAccessException) {
            if ((((Field)object).getModifiers() & 0x10) == 0) throw Context.throwAsScriptRuntimeEx(illegalAccessException);
            return;
        }
    }

    RuntimeException reportMemberNotFound(String string) {
        return Context.reportRuntimeErrorById("msg.java.member.not.found", this.cl.getName(), string);
    }
}

