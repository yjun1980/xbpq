/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContinuationPending;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.MemberBox$1;
import org.mozilla.javascript.MemberBox$2;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.VMBridge;

final class MemberBox
implements Serializable {
    private static final Class<?>[] primitives = new Class[]{Boolean.TYPE, Byte.TYPE, Character.TYPE, Double.TYPE, Float.TYPE, Integer.TYPE, Long.TYPE, Short.TYPE, Void.TYPE};
    private static final long serialVersionUID = 6358550398665688245L;
    transient Class<?>[] argTypes;
    transient Function asGetterFunction;
    transient Function asSetterFunction;
    transient Object delegateTo;
    private transient Member memberObject;
    transient boolean vararg;

    MemberBox(Constructor<?> constructor) {
        this.init(constructor);
    }

    MemberBox(Method method) {
        this.init(method);
    }

    private void init(Constructor<?> constructor) {
        this.memberObject = constructor;
        this.argTypes = constructor.getParameterTypes();
        this.vararg = constructor.isVarArgs();
    }

    private void init(Method method) {
        this.memberObject = method;
        this.argTypes = method.getParameterTypes();
        this.vararg = method.isVarArgs();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Member readMember(ObjectInputStream object) {
        if (!((ObjectInputStream)object).readBoolean()) {
            return null;
        }
        boolean bl = ((ObjectInputStream)object).readBoolean();
        String string = (String)((ObjectInputStream)object).readObject();
        Class clazz = (Class)((ObjectInputStream)object).readObject();
        object = MemberBox.readParameters((ObjectInputStream)object);
        if (!bl) return clazz.getConstructor((Class<?>)object);
        try {
            return clazz.getMethod(string, (Class<?>)object);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Cannot find member: ");
            ((StringBuilder)object).append(noSuchMethodException);
            throw new IOException(((StringBuilder)object).toString());
        }
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        object = MemberBox.readMember((ObjectInputStream)object);
        if (object instanceof Method) {
            this.init((Method)object);
        } else {
            this.init((Constructor)object);
        }
    }

    private static Class<?>[] readParameters(ObjectInputStream objectInputStream) {
        int n2 = objectInputStream.readShort();
        Class[] classArray = new Class[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            classArray[i2] = !objectInputStream.readBoolean() ? (Class)objectInputStream.readObject() : primitives[objectInputStream.readByte()];
        }
        return classArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Method searchAccessibleMethod(Method genericDeclaration, Class<?>[] classArray) {
        int n2 = ((Method)genericDeclaration).getModifiers();
        if (!Modifier.isPublic(n2)) return null;
        if (Modifier.isStatic(n2)) return null;
        Class<Object> clazz = ((Method)genericDeclaration).getDeclaringClass();
        if (Modifier.isPublic(clazz.getModifiers())) return null;
        String string = ((Method)genericDeclaration).getName();
        Object object = clazz.getInterfaces();
        n2 = 0;
        int n3 = ((Class<?>[])object).length;
        while (true) {
            genericDeclaration = clazz;
            if (n2 == n3) break;
            genericDeclaration = object[n2];
            if (Modifier.isPublic(((Class)genericDeclaration).getModifiers())) {
                try {
                    return ((Class)genericDeclaration).getMethod(string, classArray);
                }
                catch (NoSuchMethodException | SecurityException exception) {}
            }
            ++n2;
        }
        while ((clazz = ((Class)genericDeclaration).getSuperclass()) != null) {
            genericDeclaration = clazz;
            if (!Modifier.isPublic(clazz.getModifiers())) continue;
            try {
                object = clazz.getMethod(string, classArray);
                n2 = ((Method)object).getModifiers();
                genericDeclaration = clazz;
                if (!Modifier.isPublic(n2)) continue;
                boolean bl = Modifier.isStatic(n2);
                genericDeclaration = clazz;
                if (bl) continue;
                return object;
            }
            catch (NoSuchMethodException | SecurityException exception) {
                genericDeclaration = clazz;
                continue;
            }
            break;
        }
        return null;
    }

    private static void writeMember(ObjectOutputStream objectOutputStream, Member member) {
        if (member == null) {
            objectOutputStream.writeBoolean(false);
            return;
        }
        objectOutputStream.writeBoolean(true);
        boolean bl = member instanceof Method;
        if (!bl && !(member instanceof Constructor)) {
            throw new IllegalArgumentException("not Method or Constructor");
        }
        objectOutputStream.writeBoolean(bl);
        objectOutputStream.writeObject(member.getName());
        objectOutputStream.writeObject(member.getDeclaringClass());
        if (bl) {
            MemberBox.writeParameters(objectOutputStream, ((Method)member).getParameterTypes());
        } else {
            MemberBox.writeParameters(objectOutputStream, ((Constructor)member).getParameterTypes());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        MemberBox.writeMember(objectOutputStream, this.memberObject);
    }

    private static void writeParameters(ObjectOutputStream object, Class<?>[] classArray) {
        ((ObjectOutputStream)object).writeShort(classArray.length);
        block0: for (Class<?> clazz : classArray) {
            Class<?>[] classArray2;
            boolean bl = clazz.isPrimitive();
            ((ObjectOutputStream)object).writeBoolean(bl);
            if (!bl) {
                ((ObjectOutputStream)object).writeObject(clazz);
                continue;
            }
            for (int i2 = 0; i2 < (classArray2 = primitives).length; ++i2) {
                if (!clazz.equals(classArray2[i2])) continue;
                ((ObjectOutputStream)object).writeByte(i2);
                continue block0;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Primitive ");
            ((StringBuilder)object).append(clazz);
            ((StringBuilder)object).append(" not found");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
    }

    Function asGetterFunction(String string, Scriptable scriptable) {
        if (this.asGetterFunction == null) {
            this.asGetterFunction = new MemberBox$1(this, scriptable, ScriptableObject.getFunctionPrototype(scriptable), string);
        }
        return this.asGetterFunction;
    }

    Function asSetterFunction(String string, Scriptable scriptable) {
        if (this.asSetterFunction == null) {
            this.asSetterFunction = new MemberBox$2(this, scriptable, ScriptableObject.getFunctionPrototype(scriptable), string);
        }
        return this.asSetterFunction;
    }

    Constructor<?> ctor() {
        return (Constructor)this.memberObject;
    }

    Class<?> getDeclaringClass() {
        return this.memberObject.getDeclaringClass();
    }

    String getName() {
        return this.memberObject.getName();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Object invoke(Object object, Object[] objectArray) {
        Method method = this.method();
        Object object2 = object;
        if (object instanceof Delegator) {
            object2 = ((Delegator)object).getDelegee();
        }
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            if (!(objectArray[i2] instanceof Delegator)) continue;
            objectArray[i2] = ((Delegator)objectArray[i2]).getDelegee();
        }
        try {
            try {
                return method.invoke(object2, objectArray);
            }
            catch (IllegalAccessException illegalAccessException) {
                object = MemberBox.searchAccessibleMethod(method, this.argTypes);
                if (object != null) {
                    this.memberObject = object;
                    return ((Method)object).invoke(object2, objectArray);
                }
                if (!VMBridge.instance.tryToMakeAccessible(method)) throw Context.throwAsScriptRuntimeEx(illegalAccessException);
                object = method;
                return ((Method)object).invoke(object2, objectArray);
            }
        }
        catch (Exception exception) {
            throw Context.throwAsScriptRuntimeEx(exception);
        }
        catch (InvocationTargetException invocationTargetException) {}
        do {
            Object[] objectArray2;
            objectArray2 = objectArray = ((InvocationTargetException)objectArray2).getTargetException();
        } while (objectArray instanceof InvocationTargetException);
        if (!(objectArray instanceof ContinuationPending)) throw Context.throwAsScriptRuntimeEx((Throwable)objectArray);
        throw (ContinuationPending)objectArray;
    }

    boolean isCtor() {
        return this.memberObject instanceof Constructor;
    }

    boolean isMethod() {
        return this.memberObject instanceof Method;
    }

    boolean isPublic() {
        return Modifier.isPublic(this.memberObject.getModifiers());
    }

    boolean isStatic() {
        return Modifier.isStatic(this.memberObject.getModifiers());
    }

    Member member() {
        return this.memberObject;
    }

    Method method() {
        return (Method)this.memberObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Object newInstance(Object[] objectArray) {
        Constructor<?> constructor = this.ctor();
        try {
            try {
                return constructor.newInstance(objectArray);
            }
            catch (IllegalAccessException illegalAccessException) {
                if (!VMBridge.instance.tryToMakeAccessible(constructor)) throw Context.throwAsScriptRuntimeEx(illegalAccessException);
                return constructor.newInstance(objectArray);
            }
        }
        catch (Exception exception) {
            throw Context.throwAsScriptRuntimeEx(exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    String toJavaDeclaration() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.isMethod()) {
            object = this.method();
            stringBuilder.append(((Method)object).getReturnType());
            stringBuilder.append(' ');
            object = ((Method)object).getName();
        } else {
            String string = this.ctor().getDeclaringClass().getName();
            int n2 = string.lastIndexOf(46);
            object = string;
            if (n2 >= 0) {
                object = string.substring(n2 + 1);
            }
        }
        stringBuilder.append((String)object);
        stringBuilder.append(JavaMembers.liveConnectSignature(this.argTypes));
        return stringBuilder.toString();
    }

    public String toString() {
        return this.memberObject.toString();
    }
}

