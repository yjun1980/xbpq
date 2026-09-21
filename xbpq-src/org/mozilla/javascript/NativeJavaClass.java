/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.util.Map;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.FieldAndMethods;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.WrapFactory;
import org.mozilla.javascript.Wrapper;

public class NativeJavaClass
extends NativeJavaObject
implements Function {
    static final String javaClassPropertyName = "__javaObject__";
    private static final long serialVersionUID = -6460763940409461664L;
    private Map<String, FieldAndMethods> staticFieldAndMethods;

    public NativeJavaClass() {
    }

    public NativeJavaClass(Scriptable scriptable, Class<?> clazz) {
        this(scriptable, clazz, false);
    }

    public NativeJavaClass(Scriptable scriptable, Class<?> clazz, boolean bl) {
        super(scriptable, clazz, null, bl);
    }

    static Object constructInternal(Object[] object, MemberBox memberBox) {
        Object[] objectArray;
        Class<?>[] classArray = memberBox.argTypes;
        boolean bl = memberBox.vararg;
        int n2 = 0;
        int n3 = 0;
        if (bl) {
            objectArray = new Object[classArray.length];
            for (n2 = 0; n2 < classArray.length - 1; ++n2) {
                objectArray[n2] = Context.jsToJava(object[n2], classArray[n2]);
            }
            if (((Object[])object).length == classArray.length && (object[((Object[])object).length - 1] == null || object[((Object[])object).length - 1] instanceof NativeArray || object[((Object[])object).length - 1] instanceof NativeJavaArray)) {
                object = Context.jsToJava(object[((Object[])object).length - 1], classArray[classArray.length - 1]);
            } else {
                Class<?> clazz = classArray[classArray.length - 1].getComponentType();
                Object object2 = Array.newInstance(clazz, ((Object[])object).length - classArray.length + 1);
                for (n2 = n3; n2 < Array.getLength(object2); ++n2) {
                    Array.set(object2, n2, Context.jsToJava(object[classArray.length - 1 + n2], clazz));
                }
                object = object2;
            }
            objectArray[classArray.length - 1] = object;
        } else {
            Object[] objectArray2 = object;
            while (true) {
                objectArray = objectArray2;
                if (n2 >= objectArray2.length) break;
                Object object3 = objectArray2[n2];
                Object object4 = Context.jsToJava(object3, classArray[n2]);
                objectArray = objectArray2;
                if (object4 != object3) {
                    objectArray = objectArray2;
                    if (objectArray2 == object) {
                        objectArray = (Object[])object.clone();
                    }
                    objectArray[n2] = object4;
                }
                ++n2;
                objectArray2 = objectArray;
            }
        }
        return memberBox.newInstance(objectArray);
    }

    static Scriptable constructSpecific(Context context, Scriptable scriptable, Object[] object, MemberBox memberBox) {
        object = NativeJavaClass.constructInternal(object, memberBox);
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        return context.getWrapFactory().wrapNewObject(context, scriptable, object);
    }

    private static Class<?> findNestedClass(Class<?> object, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Class)object).getName());
        stringBuilder.append('$');
        stringBuilder.append(string);
        string = stringBuilder.toString();
        object = ((Class)object).getClassLoader();
        if (object == null) {
            return Kit.classOrNull(string);
        }
        return Kit.classOrNull((ClassLoader)object, string);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (objectArray.length == 1 && objectArray[0] instanceof Scriptable) {
            Scriptable scriptable3;
            Class<?> clazz = this.getClassObject();
            scriptable2 = (Scriptable)objectArray[0];
            do {
                if (scriptable2 instanceof Wrapper && clazz.isInstance(((Wrapper)((Object)scriptable2)).unwrap())) {
                    return scriptable2;
                }
                scriptable2 = scriptable3 = scriptable2.getPrototype();
            } while (scriptable3 != null);
        }
        return this.construct(context, scriptable, objectArray);
    }

    @Override
    public Scriptable construct(Context object, Scriptable object2, Object[] object3) {
        Class<?> clazz = this.getClassObject();
        int n2 = clazz.getModifiers();
        if (!Modifier.isInterface(n2) && !Modifier.isAbstract(n2)) {
            NativeJavaMethod nativeJavaMethod = this.members.ctors;
            n2 = nativeJavaMethod.findCachedFunction((Context)object, (Object[])object3);
            if (n2 >= 0) {
                return NativeJavaClass.constructSpecific((Context)object, (Scriptable)object2, object3, nativeJavaMethod.methods[n2]);
            }
            object = NativeJavaMethod.scriptSignature(object3);
            throw Context.reportRuntimeErrorById("msg.no.java.ctor", clazz.getName(), object);
        }
        if (((Object[])object3).length != 0) {
            block7: {
                Scriptable scriptable = ScriptableObject.getTopLevelScope(this);
                try {
                    if ("Dalvik".equals(System.getProperty("java.vm.name")) && clazz.isInterface()) {
                        object3 = NativeJavaObject.createInterfaceAdapter(clazz, ScriptableObject.ensureScriptableObject(object3[0]));
                        return ((Context)object).getWrapFactory().wrapAsJavaObject((Context)object, (Scriptable)object2, object3, null);
                    }
                    object2 = scriptable.get("JavaAdapter", scriptable);
                    if (object2 != Scriptable.NOT_FOUND) {
                        object = ((Function)object2).construct((Context)object, scriptable, new Object[]{this, object3[0]});
                        return object;
                    }
                }
                catch (Exception exception) {
                    object = exception.getMessage();
                    if (object != null) break block7;
                }
                object = "";
            }
            throw Context.reportRuntimeErrorById("msg.cant.instantiate", object, clazz.getName());
        }
        throw Context.reportRuntimeErrorById("msg.adapter.zero.args", new Object[0]);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public Object get(String object, Scriptable object2) {
        if (((String)object).equals("prototype")) {
            return null;
        }
        Map<String, FieldAndMethods> map = this.staticFieldAndMethods;
        if (map != null && (map = map.get(object)) != null) {
            return map;
        }
        if (this.members.has((String)object, true)) {
            return this.members.get(this, (String)object, this.javaObject, true);
        }
        map = Context.getContext();
        Scriptable scriptable = ScriptableObject.getTopLevelScope((Scriptable)object2);
        object2 = ((Context)((Object)map)).getWrapFactory();
        if (javaClassPropertyName.equals(object)) {
            return ((WrapFactory)object2).wrap((Context)((Object)map), scriptable, this.javaObject, ScriptRuntime.ClassClass);
        }
        Class<?> clazz = NativeJavaClass.findNestedClass(this.getClassObject(), (String)object);
        if (clazz != null) {
            object = ((WrapFactory)object2).wrapJavaClass((Context)((Object)map), scriptable, clazz);
            object.setParentScope(this);
            return object;
        }
        throw this.members.reportMemberNotFound((String)object);
    }

    @Override
    public String getClassName() {
        return "JavaClass";
    }

    public Class<?> getClassObject() {
        return (Class)super.unwrap();
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        if (clazz != null && clazz != ScriptRuntime.StringClass) {
            if (clazz == ScriptRuntime.BooleanClass) {
                return Boolean.TRUE;
            }
            if (clazz == ScriptRuntime.NumberClass) {
                return ScriptRuntime.NaNobj;
            }
            return this;
        }
        return this.toString();
    }

    @Override
    public Object[] getIds() {
        return this.members.getIds(true);
    }

    @Override
    public boolean has(String string, Scriptable object) {
        boolean bl;
        object = this.members;
        boolean bl2 = bl = true;
        if (!((JavaMembers)object).has(string, true)) {
            bl2 = javaClassPropertyName.equals(string) ? bl : false;
        }
        return bl2;
    }

    @Override
    public boolean hasInstance(Scriptable object) {
        if (object instanceof Wrapper && !(object instanceof NativeJavaClass)) {
            object = ((Wrapper)object).unwrap();
            return this.getClassObject().isInstance(object);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void initMembers() {
        JavaMembers javaMembers;
        Class clazz = (Class)this.javaObject;
        this.members = javaMembers = JavaMembers.lookupClass(this.parent, clazz, clazz, this.isAdapter);
        this.staticFieldAndMethods = javaMembers.getFieldAndMethodsObjects(this, clazz, true);
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        this.members.put(this, string, this.javaObject, object, true);
    }

    public String toString() {
        StringBuilder stringBuilder = a.c("[JavaClass ");
        stringBuilder.append(this.getClassObject().getName());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

