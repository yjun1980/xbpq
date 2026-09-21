/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Wrapper;

public class JavaScriptException
extends RhinoException {
    private static final long serialVersionUID = -7666130513694669293L;
    private String details;
    private Object value;

    @Deprecated
    public JavaScriptException(Object object) {
        this(object, "", 0);
    }

    public JavaScriptException(Object object, String string, int n2) {
        this.recordErrorOrigin(string, n2, null, 0);
        this.value = object;
        Object object2 = object;
        if (object instanceof NativeError) {
            object = (NativeError)object;
            object2 = ((IdScriptableObject)object).get("javaException", (Scriptable)object);
            if (Context.getContext().hasFeature(10)) {
                if (!((IdScriptableObject)object).has("fileName", (Scriptable)object)) {
                    ((IdScriptableObject)object).put("fileName", (Scriptable)object, (Object)string);
                }
                if (!((IdScriptableObject)object).has("lineNumber", (Scriptable)object)) {
                    ((IdScriptableObject)object).put("lineNumber", (Scriptable)object, (Object)n2);
                }
                ((NativeError)object).setStackProvider(this);
            }
        }
        object = object2;
        if (object2 instanceof Wrapper) {
            object = ((Wrapper)object2).unwrap();
        }
        if (object instanceof Throwable) {
            this.initCause((Throwable)object);
        }
        this.details = this.getDetails();
    }

    @Override
    public String details() {
        return this.details;
    }

    public String getDetails() {
        Object object = this.value;
        if (object == null) {
            return "null";
        }
        if (object instanceof NativeError) {
            return object.toString();
        }
        try {
            object = ScriptRuntime.toString(object);
            return object;
        }
        catch (RuntimeException runtimeException) {
            Object object2 = this.value;
            if (object2 instanceof Scriptable) {
                return ScriptRuntime.defaultObjectToString((Scriptable)object2);
            }
            return object2.toString();
        }
    }

    @Deprecated
    public int getLineNumber() {
        return this.lineNumber();
    }

    @Deprecated
    public String getSourceName() {
        return this.sourceName();
    }

    public Object getValue() {
        return this.value;
    }
}

