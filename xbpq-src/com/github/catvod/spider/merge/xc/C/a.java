/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 */
package com.github.catvod.spider.merge.xc.C;

import android.os.Parcelable;
import com.github.catvod.spider.merge.xc.C.b;
import com.github.catvod.spider.merge.xc.C.c;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {
    public final com.github.catvod.spider.merge.xc.f.b a;
    public final com.github.catvod.spider.merge.xc.f.b b;
    public final com.github.catvod.spider.merge.xc.f.b c;

    public a(com.github.catvod.spider.merge.xc.f.b b2, com.github.catvod.spider.merge.xc.f.b b3, com.github.catvod.spider.merge.xc.f.b b4) {
        this.a = b2;
        this.b = b3;
        this.c = b4;
    }

    public abstract b a();

    public final Class b(Class clazz) {
        Class<?> clazz2 = clazz.getName();
        com.github.catvod.spider.merge.xc.f.b b2 = this.c;
        Serializable serializable = (Class)b2.get(clazz2);
        clazz2 = serializable;
        if (serializable == null) {
            String string = clazz.getPackage().getName();
            clazz2 = clazz.getSimpleName();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(string);
            ((StringBuilder)serializable).append(".");
            ((StringBuilder)serializable).append((String)((Object)clazz2));
            ((StringBuilder)serializable).append("Parcelizer");
            clazz2 = Class.forName(((StringBuilder)serializable).toString(), false, clazz.getClassLoader());
            b2.put(clazz.getName(), clazz2);
        }
        return clazz2;
    }

    public final Method c(String string) {
        Method method;
        com.github.catvod.spider.merge.xc.f.b b2 = this.a;
        Method method2 = method = (Method)b2.get(string);
        if (method == null) {
            System.currentTimeMillis();
            method2 = Class.forName(string, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            b2.put(string, method2);
        }
        return method2;
    }

    public final Method d(Class clazz) {
        Object object = clazz.getName();
        com.github.catvod.spider.merge.xc.f.b b2 = this.b;
        Method method = (Method)b2.get(object);
        object = method;
        if (method == null) {
            object = this.b(clazz);
            System.currentTimeMillis();
            object = ((Class)object).getDeclaredMethod("write", clazz, a.class);
            b2.put(clazz.getName(), object);
        }
        return object;
    }

    public abstract boolean e(int var1);

    public final Parcelable f(Parcelable object, int n2) {
        if (!this.e(n2)) {
            return object;
        }
        b b2 = (b)this;
        object = b.class.getClassLoader();
        return b2.e.readParcelable((ClassLoader)object);
    }

    public final c g() {
        IllegalAccessException illegalAccessException2;
        block9: {
            InvocationTargetException invocationTargetException2;
            block8: {
                NoSuchMethodException noSuchMethodException2;
                block7: {
                    Object object = ((b)this).e.readString();
                    if (object == null) {
                        return null;
                    }
                    b b2 = this.a();
                    try {
                        object = (c)this.c((String)object).invoke(null, b2);
                        return object;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block7;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block8;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block9;
                    }
                    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
                }
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException2);
            }
            if (invocationTargetException2.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException2);
        }
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException2);
    }

    public abstract void h(int var1);

    public final void i(c c2) {
        IllegalAccessException illegalAccessException2;
        block12: {
            InvocationTargetException invocationTargetException2;
            block11: {
                NoSuchMethodException noSuchMethodException2;
                block10: {
                    ClassNotFoundException classNotFoundException3;
                    block9: {
                        int n2;
                        Object object;
                        if (c2 == null) {
                            ((b)this).e.writeString(null);
                            return;
                        }
                        try {
                            object = this.b(c2.getClass());
                            object = ((Class)object).getName();
                        }
                        catch (ClassNotFoundException classNotFoundException2) {
                            throw new RuntimeException(c2.getClass().getSimpleName().concat(" does not have a Parcelizer"), classNotFoundException2);
                        }
                        ((b)this).e.writeString((String)object);
                        object = this.a();
                        try {
                            this.d(c2.getClass()).invoke(null, c2, object);
                            n2 = ((b)object).i;
                            if (n2 < 0) break block9;
                        }
                        catch (ClassNotFoundException classNotFoundException3) {
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block10;
                        }
                        catch (InvocationTargetException invocationTargetException2) {
                            break block11;
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block12;
                        }
                        n2 = ((b)object).d.get(n2);
                        c2 = ((b)object).e;
                        int n3 = c2.dataPosition();
                        c2.setDataPosition(n2);
                        c2.writeInt(n3 - n2);
                        c2.setDataPosition(n3);
                    }
                    return;
                    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException3);
                }
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException2);
            }
            if (invocationTargetException2.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException2);
        }
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException2);
    }
}

