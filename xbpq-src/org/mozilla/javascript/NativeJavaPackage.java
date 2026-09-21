/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.y.z;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class NativeJavaPackage
extends ScriptableObject {
    private static final long serialVersionUID = 7445054382212031523L;
    private transient ClassLoader classLoader;
    private Set<String> negativeCache = null;
    private String packageName;

    @Deprecated
    public NativeJavaPackage(String string) {
        this(false, string, Context.getCurrentContext().getApplicationClassLoader());
    }

    @Deprecated
    public NativeJavaPackage(String string, ClassLoader classLoader) {
        this(false, string, classLoader);
    }

    NativeJavaPackage(boolean bl, String string, ClassLoader classLoader) {
        this.packageName = string;
        this.classLoader = classLoader;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.classLoader = Context.getCurrentContext().getApplicationClassLoader();
    }

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof NativeJavaPackage;
        boolean bl3 = bl = false;
        if (bl2) {
            object = (NativeJavaPackage)object;
            bl3 = bl;
            if (this.packageName.equals(((NativeJavaPackage)object).packageName)) {
                bl3 = bl;
                if (this.classLoader == ((NativeJavaPackage)object).classLoader) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    NativeJavaPackage forcePackage(String string, Scriptable scriptable) {
        Object object = super.get(string, (Scriptable)this);
        if (object != null && object instanceof NativeJavaPackage) {
            return (NativeJavaPackage)object;
        }
        object = this.packageName.length() == 0 ? string : z.b(new StringBuilder(), this.packageName, ".", string);
        object = new NativeJavaPackage(true, (String)object, this.classLoader);
        ScriptRuntime.setObjectProtoAndParent((ScriptableObject)object, scriptable);
        super.put(string, (Scriptable)this, object);
        return object;
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        return Scriptable.NOT_FOUND;
    }

    @Override
    public Object get(String string, Scriptable scriptable) {
        return this.getPkgProperty(string, scriptable, true);
    }

    @Override
    public String getClassName() {
        return "JavaPackage";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        return this.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Object getPkgProperty(String string, Scriptable scriptable, boolean bl) {
        synchronized (this) {
            Class clazz;
            HashSet<String> hashSet;
            Object object;
            void var2_2;
            block18: {
                Context context;
                Object var8_6;
                block17: {
                    boolean bl2;
                    object = super.get(string, (Scriptable)var2_2);
                    hashSet = Scriptable.NOT_FOUND;
                    if (object != hashSet) {
                        return object;
                    }
                    object = this.negativeCache;
                    var8_6 = null;
                    if (object != null && (bl2 = object.contains(string))) {
                        return null;
                    }
                    if (this.packageName.length() == 0) {
                        hashSet = string;
                    } else {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(this.packageName);
                        ((StringBuilder)object).append('.');
                        ((StringBuilder)object).append(string);
                        hashSet = ((StringBuilder)object).toString();
                    }
                    context = Context.getContext();
                    clazz = context.getClassShutter();
                    if (clazz == null) break block17;
                    object = var8_6;
                    if (!clazz.visibleToScripts((String)((Object)hashSet))) break block18;
                }
                clazz = (object = this.classLoader) != null ? Kit.classOrNull((ClassLoader)object, (String)((Object)hashSet)) : Kit.classOrNull((String)((Object)hashSet));
                object = var8_6;
                if (clazz != null) {
                    object = context.getWrapFactory().wrapJavaClass(context, ScriptableObject.getTopLevelScope(this), clazz);
                    object.setPrototype(this.getPrototype());
                }
            }
            clazz = object;
            if (object == null) {
                void var3_3;
                if (var3_3 != false) {
                    clazz = new NativeJavaPackage(true, (String)hashSet, this.classLoader);
                    ScriptRuntime.setObjectProtoAndParent(clazz, this.getParentScope());
                } else {
                    if (this.negativeCache == null) {
                        hashSet = new HashSet<String>();
                        this.negativeCache = hashSet;
                    }
                    this.negativeCache.add(string);
                    clazz = object;
                }
            }
            if (clazz != null) {
                super.put(string, (Scriptable)var2_2, clazz);
            }
            return clazz;
        }
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        return false;
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        return true;
    }

    public int hashCode() {
        int n2 = this.packageName.hashCode();
        ClassLoader classLoader = this.classLoader;
        int n3 = classLoader == null ? 0 : classLoader.hashCode();
        return n2 ^ n3;
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        throw Context.reportRuntimeErrorById("msg.pkg.int", new Object[0]);
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
    }

    public String toString() {
        return r.c(a.c("[JavaPackage "), this.packageName, "]");
    }
}

