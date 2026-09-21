/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ES6Generator;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator$StopIteration;
import org.mozilla.javascript.NativeIterator$WrappedJavaIterator;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;

public final class NativeIterator
extends IdScriptableObject {
    public static final String ITERATOR_PROPERTY_NAME = "__iterator__";
    private static final Object ITERATOR_TAG = "Iterator";
    private static final int Id___iterator__ = 3;
    private static final int Id_constructor = 1;
    private static final int Id_next = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final String STOP_ITERATION = "StopIteration";
    private static final long serialVersionUID = -4136968203581667681L;
    private Object objectIterator;

    private NativeIterator() {
    }

    private NativeIterator(Object object) {
        this.objectIterator = object;
    }

    private static Iterator<?> getJavaIterator(Object object) {
        boolean bl = object instanceof Wrapper;
        Iterator iterator = null;
        Iterator iterator2 = null;
        if (bl) {
            object = ((Wrapper)object).unwrap();
            iterator = iterator2;
            if (object instanceof Iterator) {
                iterator = (Iterator)object;
            }
            if (object instanceof Iterable) {
                iterator = ((Iterable)object).iterator();
            }
        }
        return iterator;
    }

    public static Object getStopIterationObject(Scriptable scriptable) {
        return ScriptableObject.getTopScopeValue(ScriptableObject.getTopLevelScope(scriptable), ITERATOR_TAG);
    }

    static void init(Context object, ScriptableObject scriptableObject, boolean bl) {
        new NativeIterator().exportAsJSClass(3, scriptableObject, bl);
        if (((Context)object).getLanguageVersion() >= 200) {
            ES6Generator.init(scriptableObject, bl);
        } else {
            NativeGenerator.init(scriptableObject, bl);
        }
        object = new NativeIterator$StopIteration();
        ((ScriptableObject)object).setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        ((ScriptableObject)object).setParentScope(scriptableObject);
        if (bl) {
            ((ScriptableObject)object).sealObject();
        }
        ScriptableObject.defineProperty(scriptableObject, STOP_ITERATION, object, 2);
        scriptableObject.associateValue(ITERATOR_TAG, object);
    }

    private static Object jsConstructor(Context object, Scriptable scriptable, Scriptable object2, Object[] objectArray) {
        int n2 = objectArray.length;
        boolean bl = false;
        if (n2 != 0 && objectArray[0] != null && objectArray[0] != Undefined.instance) {
            Scriptable scriptable2 = ScriptRuntime.toObject((Context)object, scriptable, objectArray[0]);
            boolean bl2 = bl;
            if (objectArray.length > 1) {
                bl2 = bl;
                if (ScriptRuntime.toBoolean(objectArray[1])) {
                    bl2 = true;
                }
            }
            if (object2 != null) {
                object2 = NativeIterator.getJavaIterator(scriptable2);
                if (object2 != null) {
                    scriptable = ScriptableObject.getTopLevelScope(scriptable);
                    return ((Context)object).getWrapFactory().wrap((Context)object, scriptable, new NativeIterator$WrappedJavaIterator((Iterator<?>)object2, scriptable), NativeIterator$WrappedJavaIterator.class);
                }
                object2 = ScriptRuntime.toIterator((Context)object, scriptable, scriptable2, bl2);
                if (object2 != null) {
                    return object2;
                }
            }
            n2 = bl2 ? 3 : 5;
            object = ScriptRuntime.enumInit(scriptable2, (Context)object, scriptable, n2);
            ScriptRuntime.setEnumNumbers(object, true);
            object = new NativeIterator(object);
            ((ScriptableObject)object).setPrototype(ScriptableObject.getClassPrototype(scriptable, ((NativeIterator)object).getClassName()));
            ((ScriptableObject)object).setParentScope(scriptable);
            return object;
        }
        object = objectArray.length == 0 ? Undefined.instance : objectArray[0];
        throw ScriptRuntime.typeErrorById("msg.no.properties", ScriptRuntime.toString(object));
    }

    private Object next(Context context, Scriptable scriptable) {
        if (ScriptRuntime.enumNext(this.objectIterator, context).booleanValue()) {
            return ScriptRuntime.enumId(this.objectIterator, context);
        }
        throw new JavaScriptException(NativeIterator.getStopIterationObject(scriptable), null, 0);
    }

    @Override
    public Object execIdCall(IdFunctionObject idScriptableObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)idScriptableObject).hasTag(ITERATOR_TAG)) {
            return super.execIdCall((IdFunctionObject)idScriptableObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)idScriptableObject).methodId();
        if (n2 == 1) {
            return NativeIterator.jsConstructor(context, scriptable, scriptable2, objectArray);
        }
        idScriptableObject = IdScriptableObject.ensureType(scriptable2, NativeIterator.class, (IdFunctionObject)idScriptableObject);
        if (n2 != 2) {
            if (n2 == 3) {
                return scriptable2;
            }
            throw new IllegalArgumentException(String.valueOf(n2));
        }
        return super.next(context, scriptable);
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
            case 3377907: {
                if (!string.equals("next")) break;
                n4 = 2;
                break;
            }
            case -1285135186: {
                if (!string.equals(ITERATOR_PROPERTY_NAME)) break;
                n4 = 1;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 0: {
                n3 = 1;
            }
            case 2: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return "Iterator";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3 = 1;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) throw new IllegalArgumentException(String.valueOf(n2));
                string = ITERATOR_PROPERTY_NAME;
            } else {
                string = "next";
                n3 = 0;
            }
        } else {
            string = "constructor";
            n3 = 2;
        }
        this.initPrototypeMethod(ITERATOR_TAG, n2, string, n3);
    }
}

