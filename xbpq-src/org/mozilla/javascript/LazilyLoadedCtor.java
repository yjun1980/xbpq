/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.LazilyLoadedCtor$1;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public final class LazilyLoadedCtor
implements Serializable {
    private static final int STATE_BEFORE_INIT = 0;
    private static final int STATE_INITIALIZING = 1;
    private static final int STATE_WITH_VALUE = 2;
    private static final long serialVersionUID = 1L;
    private final String className;
    private Object initializedValue;
    private final boolean privileged;
    private final String propertyName;
    private final ScriptableObject scope;
    private final boolean sealed;
    private int state;

    public LazilyLoadedCtor(ScriptableObject scriptableObject, String string, String string2, boolean bl) {
        this(scriptableObject, string, string2, bl, false);
    }

    LazilyLoadedCtor(ScriptableObject scriptableObject, String string, String string2, boolean bl, boolean bl2) {
        this.scope = scriptableObject;
        this.propertyName = string;
        this.className = string2;
        this.sealed = bl;
        this.privileged = bl2;
        this.state = 0;
        scriptableObject.addLazilyInitializedValue(string, 0, this, 2);
    }

    static /* synthetic */ Object access$000(LazilyLoadedCtor lazilyLoadedCtor) {
        return lazilyLoadedCtor.buildValue0();
    }

    private Object buildValue() {
        if (this.privileged) {
            return AccessController.doPrivileged(new LazilyLoadedCtor$1(this));
        }
        return this.buildValue0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object buildValue0() {
        Class<? extends Scriptable> clazz = LazilyLoadedCtor.cast(Kit.classOrNull(this.className));
        if (clazz == null) return Scriptable.NOT_FOUND;
        try {
            clazz = ScriptableObject.buildClassCtor(this.scope, clazz, this.sealed, false);
            if (clazz != null) {
                return clazz;
            }
            clazz = this.scope;
            Object object = ((ScriptableObject)((Object)clazz)).get(this.propertyName, (Scriptable)((Object)clazz));
            if (object == (clazz = Scriptable.NOT_FOUND)) return Scriptable.NOT_FOUND;
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getTargetException();
            if (throwable instanceof RuntimeException) throw (RuntimeException)throwable;
            return Scriptable.NOT_FOUND;
        }
        catch (IllegalAccessException | InstantiationException | SecurityException | RhinoException exception) {
            return Scriptable.NOT_FOUND;
        }
    }

    private static Class<? extends Scriptable> cast(Class<?> clazz) {
        return clazz;
    }

    Object getValue() {
        if (this.state == 2) {
            return this.initializedValue;
        }
        throw new IllegalStateException(this.propertyName);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void init() {
        synchronized (this) {
            int n2 = this.state;
            if (n2 == 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Recursive initialization for ");
                stringBuilder.append(this.propertyName);
                IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
                throw illegalStateException;
            }
            if (n2 == 0) {
                this.state = 1;
                Object object = Scriptable.NOT_FOUND;
                try {
                    Object object2;
                    this.initializedValue = object2 = this.buildValue();
                    this.state = 2;
                }
                catch (Throwable throwable) {
                    this.initializedValue = object;
                    this.state = 2;
                    throw throwable;
                }
            }
            return;
        }
    }
}

