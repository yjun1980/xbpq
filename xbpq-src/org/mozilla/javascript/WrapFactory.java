/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaList;
import org.mozilla.javascript.NativeJavaMap;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

public class WrapFactory {
    private boolean javaPrimitiveWrap = true;

    public final boolean isJavaPrimitiveWrap() {
        return this.javaPrimitiveWrap;
    }

    public final void setJavaPrimitiveWrap(boolean bl) {
        Context context = Context.getCurrentContext();
        if (context != null && context.isSealed()) {
            Context.onSealedMutation();
        }
        this.javaPrimitiveWrap = bl;
    }

    public Object wrap(Context context, Scriptable scriptable, Object object, Class<?> clazz) {
        Object object2;
        if (object != null && object != (object2 = Undefined.instance) && !(object instanceof Scriptable)) {
            if (clazz != null && clazz.isPrimitive()) {
                if (clazz == Void.TYPE) {
                    return object2;
                }
                if (clazz == Character.TYPE) {
                    return (int)((Character)object).charValue();
                }
                return object;
            }
            if (!this.isJavaPrimitiveWrap()) {
                if (!(object instanceof String || object instanceof Boolean || object instanceof Integer || object instanceof Short || object instanceof Long || object instanceof Float || object instanceof Double || object instanceof BigInteger)) {
                    if (object instanceof Character) {
                        return String.valueOf(((Character)object).charValue());
                    }
                } else {
                    return object;
                }
            }
            if (object.getClass().isArray()) {
                return NativeJavaArray.wrap(scriptable, object);
            }
            return this.wrapAsJavaObject(context, scriptable, object, clazz);
        }
        return object;
    }

    public Scriptable wrapAsJavaObject(Context context, Scriptable scriptable, Object object, Class<?> clazz) {
        if (List.class.isAssignableFrom(object.getClass())) {
            return new NativeJavaList(scriptable, object);
        }
        if (Map.class.isAssignableFrom(object.getClass())) {
            return new NativeJavaMap(scriptable, object);
        }
        return new NativeJavaObject(scriptable, object, clazz);
    }

    public Scriptable wrapJavaClass(Context context, Scriptable scriptable, Class<?> clazz) {
        return new NativeJavaClass(scriptable, clazz);
    }

    public Scriptable wrapNewObject(Context context, Scriptable scriptable, Object object) {
        if (object instanceof Scriptable) {
            return (Scriptable)object;
        }
        if (object.getClass().isArray()) {
            return NativeJavaArray.wrap(scriptable, object);
        }
        return this.wrapAsJavaObject(context, scriptable, object, null);
    }
}

