/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.lang.reflect.Field;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

class FieldAndMethods
extends NativeJavaMethod {
    private static final long serialVersionUID = -9222428244284796755L;
    Field field;
    Object javaObject;

    FieldAndMethods(Scriptable scriptable, MemberBox[] memberBoxArray, Field field) {
        super(memberBoxArray);
        this.field = field;
        this.setParentScope(scriptable);
        this.setPrototype(ScriptableObject.getFunctionPrototype(scriptable));
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        Class<?> clazz2;
        Object object;
        if (clazz == ScriptRuntime.FunctionClass) {
            return this;
        }
        try {
            object = this.field.get(this.javaObject);
            clazz2 = this.field.getType();
        }
        catch (IllegalAccessException illegalAccessException) {
            throw Context.reportRuntimeErrorById("msg.java.internal.private", this.field.getName());
        }
        Object object2 = Context.getContext();
        object2 = object = ((Context)object2).getWrapFactory().wrap((Context)object2, this, object, clazz2);
        if (object instanceof Scriptable) {
            object2 = ((Scriptable)object).getDefaultValue(clazz);
        }
        return object2;
    }
}

