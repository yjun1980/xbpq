/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.s;
import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeCallSite;
import org.mozilla.javascript.NativeError$ProtoProps;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptStackElement;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.e;
import org.mozilla.javascript.f;
import org.mozilla.javascript.g;
import org.mozilla.javascript.h;
import org.mozilla.javascript.i;
import org.mozilla.javascript.j;

final class NativeError
extends IdScriptableObject {
    private static final int ConstructorId_captureStackTrace = -1;
    public static final int DEFAULT_STACK_LIMIT = -1;
    private static final Object ERROR_TAG = "Error";
    private static final int Id_constructor = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final String STACK_HIDE_KEY = "_stackHide";
    private static final String STACK_TAG = "stack";
    private static final long serialVersionUID = -5338413581437645187L;
    private Object stack;
    private RhinoException stackProvider;

    NativeError() {
    }

    private Object callPrepareStack(Function function, ScriptStackElement[] scriptStackElementArray) {
        Context context = Context.getCurrentContext();
        Object[] objectArray = new Object[scriptStackElementArray.length];
        for (int i2 = 0; i2 < scriptStackElementArray.length; ++i2) {
            NativeCallSite nativeCallSite = (NativeCallSite)context.newObject(this, "CallSite");
            nativeCallSite.setElement(scriptStackElementArray[i2]);
            objectArray[i2] = nativeCallSite;
        }
        return function.call(context, function, this, new Object[]{this, context.newArray((Scriptable)this, objectArray)});
    }

    static void init(Scriptable scriptable, boolean bl) {
        NativeError nativeError = new NativeError();
        ScriptableObject.putProperty((Scriptable)nativeError, "name", (Object)"Error");
        ScriptableObject.putProperty((Scriptable)nativeError, "message", (Object)"");
        ScriptableObject.putProperty((Scriptable)nativeError, "fileName", (Object)"");
        ScriptableObject.putProperty((Scriptable)nativeError, "lineNumber", (Object)0);
        nativeError.setAttributes("name", 2);
        nativeError.setAttributes("message", 2);
        nativeError.exportAsJSClass(3, scriptable, bl);
        NativeCallSite.init(nativeError, bl);
    }

    private static void js_captureStackTrace(Context object, Scriptable object2, Scriptable scriptable, Object[] objectArray) {
        ScriptableObject scriptableObject = (ScriptableObject)ScriptRuntime.toObject((Context)object, (Scriptable)object2, objectArray[0]);
        object2 = objectArray.length > 1 ? (Function)ScriptRuntime.toObjectOrNull((Context)object, objectArray[1], (Scriptable)object2) : null;
        object = (NativeError)((Context)object).newObject(scriptable, "Error");
        ((NativeError)object).setStackProvider(new EvaluatorException("[object Object]"));
        if (object2 != null && (object2 = object2.get("name", (Scriptable)object2)) != null && !Undefined.isUndefined(object2)) {
            ((ScriptableObject)object).associateValue(STACK_HIDE_KEY, Context.toString(object2));
        }
        scriptableObject.defineProperty(STACK_TAG, ((ScriptableObject)object).get(STACK_TAG), 2);
    }

    private static String js_toSource(Context context, Scriptable scriptable, Scriptable object) {
        Object object2 = ScriptableObject.getProperty((Scriptable)object, "name");
        Object object3 = ScriptableObject.getProperty((Scriptable)object, "message");
        Object object4 = ScriptableObject.getProperty((Scriptable)object, "fileName");
        Object object5 = ScriptableObject.getProperty((Scriptable)object, "lineNumber");
        StringBuilder stringBuilder = a.c("(new ");
        Object object6 = Scriptable.NOT_FOUND;
        object = object2;
        if (object2 == object6) {
            object = Undefined.instance;
        }
        stringBuilder.append(ScriptRuntime.toString(object));
        stringBuilder.append("(");
        if (object3 != object6 || object4 != object6 || object5 != object6) {
            object = object3;
            if (object3 == object6) {
                object = "";
            }
            stringBuilder.append(ScriptRuntime.uneval(context, scriptable, object));
            if (object4 != object6 || object5 != object6) {
                int n2;
                stringBuilder.append(", ");
                object = object4;
                if (object4 == object6) {
                    object = "";
                }
                stringBuilder.append(ScriptRuntime.uneval(context, scriptable, object));
                if (object5 != object6 && (n2 = ScriptRuntime.toInt32(object5)) != 0) {
                    stringBuilder.append(", ");
                    stringBuilder.append(ScriptRuntime.toString(n2));
                }
            }
        }
        stringBuilder.append("))");
        return stringBuilder.toString();
    }

    private static Object js_toString(Scriptable object) {
        Object object2;
        Object object3 = ScriptableObject.getProperty((Scriptable)object, "name");
        object3 = object3 != (object2 = Scriptable.NOT_FOUND) && !Undefined.isUndefined(object3) ? ScriptRuntime.toString(object3) : "Error";
        object = ScriptableObject.getProperty((Scriptable)object, "message");
        object = object != object2 && !Undefined.isUndefined(object) ? ScriptRuntime.toString(object) : "";
        if (((String)object3).isEmpty()) {
            return object;
        }
        if (((String)object).isEmpty()) {
            return object3;
        }
        return s.a((String)object3, ": ", (String)object);
    }

    static NativeError make(Context object, Scriptable scriptable, IdFunctionObject idScriptableObject, Object[] objectArray) {
        object = (Scriptable)idScriptableObject.get("prototype", (Scriptable)idScriptableObject);
        idScriptableObject = new NativeError();
        idScriptableObject.setPrototype((Scriptable)object);
        idScriptableObject.setParentScope(scriptable);
        int n2 = objectArray.length;
        if (n2 >= 1) {
            if (!Undefined.isUndefined(objectArray[0])) {
                ScriptableObject.putProperty((Scriptable)idScriptableObject, "message", (Object)ScriptRuntime.toString(objectArray[0]));
                idScriptableObject.setAttributes("message", 2);
            }
            if (n2 >= 2) {
                ScriptableObject.putProperty((Scriptable)idScriptableObject, "fileName", objectArray[1]);
                if (n2 >= 3) {
                    ScriptableObject.putProperty((Scriptable)idScriptableObject, "lineNumber", (Object)ScriptRuntime.toInt32(objectArray[2]));
                }
            }
        }
        return idScriptableObject;
    }

    @Override
    public Object execIdCall(IdFunctionObject idScriptableObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)idScriptableObject).hasTag(ERROR_TAG)) {
            return super.execIdCall((IdFunctionObject)idScriptableObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)idScriptableObject).methodId();
        if (n2 != -1) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        return NativeError.js_toSource(context, scriptable, scriptable2);
                    }
                    throw new IllegalArgumentException(String.valueOf(n2));
                }
                return NativeError.js_toString(scriptable2);
            }
            idScriptableObject = NativeError.make(context, scriptable, (IdFunctionObject)idScriptableObject, objectArray);
            ((NativeError)idScriptableObject).setStackProvider(new EvaluatorException(""));
            return idScriptableObject;
        }
        NativeError.js_captureStackTrace(context, scriptable, scriptable2, objectArray);
        return Undefined.instance;
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        this.addIdFunctionProperty(idFunctionObject, ERROR_TAG, -1, "captureStackTrace", 2);
        this.stackProvider = new EvaluatorException("");
        NativeError$ProtoProps nativeError$ProtoProps = new NativeError$ProtoProps(null);
        this.associateValue("_ErrorPrototypeProps", nativeError$ProtoProps);
        idFunctionObject.defineProperty("stackTraceLimit", new i(nativeError$ProtoProps), new f(nativeError$ProtoProps), 0);
        idFunctionObject.defineProperty("prepareStackTrace", new h(nativeError$ProtoProps), new e(nativeError$ProtoProps), 0);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 2;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 2;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 1;
                break;
            }
            case -1781441930: {
                if (!string.equals("toSource")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 0: {
                n3 = 3;
            }
            case 1: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return "Error";
    }

    public Object getStackDelegated() {
        Object object = this.stack;
        if (object != null) {
            return object;
        }
        if (this.stackProvider == null) {
            return Scriptable.NOT_FOUND;
        }
        int n2 = -1;
        object = null;
        Object object2 = (NativeError$ProtoProps)((NativeError)this.getPrototype()).getAssociatedValue("_ErrorPrototypeProps");
        if (object2 != null) {
            n2 = object2.stackTraceLimit;
            object = object2.prepareStackTrace;
        }
        object2 = (String)this.getAssociatedValue(STACK_HIDE_KEY);
        object2 = this.stackProvider.getScriptStack(n2, (String)object2);
        object = object == null ? RhinoException.formatStackTrace(object2, this.stackProvider.details()) : this.callPrepareStack((Function)object, (ScriptStackElement[])object2);
        this.stack = object;
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3 = 0;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) throw new IllegalArgumentException(String.valueOf(n2));
                string = "toSource";
            } else {
                string = "toString";
            }
        } else {
            string = "constructor";
            n3 = 1;
        }
        this.initPrototypeMethod(ERROR_TAG, n2, string, n3);
    }

    public void setStackDelegated(Object object) {
        this.stackProvider = null;
        this.stack = object;
    }

    public void setStackProvider(RhinoException rhinoException) {
        if (this.stackProvider == null) {
            this.defineProperty(STACK_TAG, new j(this), new g(this), 2);
        }
        this.stackProvider = rhinoException;
    }

    public String toString() {
        Object object = NativeError.js_toString(this);
        object = object instanceof String ? (String)object : super.toString();
        return object;
    }
}

