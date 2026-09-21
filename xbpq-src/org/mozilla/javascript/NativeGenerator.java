/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.NativeGenerator$GeneratorClosedException;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

public final class NativeGenerator
extends IdScriptableObject {
    public static final int GENERATOR_CLOSE = 2;
    public static final int GENERATOR_SEND = 0;
    private static final Object GENERATOR_TAG = "Generator";
    public static final int GENERATOR_THROW = 1;
    private static final int Id___iterator__ = 5;
    private static final int Id_close = 1;
    private static final int Id_next = 2;
    private static final int Id_send = 3;
    private static final int Id_throw = 4;
    private static final int MAX_PROTOTYPE_ID = 5;
    private static final long serialVersionUID = 1645892441041347273L;
    private boolean firstTime = true;
    private NativeFunction function;
    private int lineNumber;
    private String lineSource;
    private boolean locked;
    private Object savedState;

    private NativeGenerator() {
    }

    public NativeGenerator(Scriptable scriptable, NativeFunction nativeFunction, Object object) {
        this.function = nativeFunction;
        this.savedState = object;
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        this.setParentScope(scriptable);
        this.setPrototype((NativeGenerator)ScriptableObject.getTopScopeValue(scriptable, GENERATOR_TAG));
    }

    static NativeGenerator init(ScriptableObject scriptableObject, boolean bl) {
        NativeGenerator nativeGenerator = new NativeGenerator();
        if (scriptableObject != null) {
            nativeGenerator.setParentScope(scriptableObject);
            nativeGenerator.setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        }
        nativeGenerator.activatePrototypeMap(5);
        if (bl) {
            nativeGenerator.sealObject();
        }
        if (scriptableObject != null) {
            scriptableObject.associateValue(GENERATOR_TAG, nativeGenerator);
        }
        return nativeGenerator;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object resume(Context object, Scriptable scriptable, int n2, Object object2) {
        Throwable throwable2;
        block22: {
            if (this.savedState == null) {
                if (n2 == 2) {
                    return Undefined.instance;
                }
                if (n2 == 1) {
                    throw new JavaScriptException(object2, this.lineSource, this.lineNumber);
                }
                object2 = NativeIterator.getStopIterationObject(scriptable);
                throw new JavaScriptException(object2, this.lineSource, this.lineNumber);
            }
            try {
                synchronized (this) {
                    if (this.locked) throw ScriptRuntime.typeErrorById("msg.already.exec.gen", new Object[0]);
                    this.locked = true;
                }
            }
            catch (Throwable throwable2) {
                break block22;
            }
            catch (RhinoException rhinoException) {
                this.lineNumber = rhinoException.lineNumber();
                this.lineSource = rhinoException.lineSource();
                this.savedState = null;
                throw rhinoException;
            }
            catch (NativeGenerator$GeneratorClosedException nativeGenerator$GeneratorClosedException) {
                Object object3 = Undefined.instance;
                synchronized (this) {
                    this.locked = false;
                }
                if (n2 != 2) return object3;
                this.savedState = null;
                return object3;
            }
            {
                object = this.function.resumeGenerator((Context)object, scriptable, n2, this.savedState, object2);
            }
            synchronized (this) {
                this.locked = false;
            }
            if (n2 != 2) return object;
            this.savedState = null;
            return object;
        }
        synchronized (this) {
            this.locked = false;
        }
        if (n2 != 2) throw throwable2;
        this.savedState = null;
        throw throwable2;
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(GENERATOR_TAG)) {
            return super.execIdCall((IdFunctionObject)object, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)object).methodId();
        NativeGenerator nativeGenerator = IdScriptableObject.ensureType(scriptable2, NativeGenerator.class, (IdFunctionObject)object);
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 == 5) {
                            return scriptable2;
                        }
                        throw new IllegalArgumentException(String.valueOf(n2));
                    }
                    object = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
                    return nativeGenerator.resume(context, scriptable, 1, object);
                }
                object = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
                if (nativeGenerator.firstTime && !object.equals(Undefined.instance)) {
                    throw ScriptRuntime.typeErrorById("msg.send.newborn", new Object[0]);
                }
                return nativeGenerator.resume(context, scriptable, 0, object);
            }
            nativeGenerator.firstTime = false;
            return nativeGenerator.resume(context, scriptable, 0, Undefined.instance);
        }
        return nativeGenerator.resume(context, scriptable, 2, new NativeGenerator$GeneratorClosedException());
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 4;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 110339814: {
                if (!string.equals("throw")) break;
                n4 = 4;
                break;
            }
            case 94756344: {
                if (!string.equals("close")) break;
                n4 = 3;
                break;
            }
            case 3526536: {
                if (!string.equals("send")) break;
                n4 = 2;
                break;
            }
            case 3377907: {
                if (!string.equals("next")) break;
                n4 = 1;
                break;
            }
            case -1285135186: {
                if (!string.equals("__iterator__")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 2;
                break;
            }
            case 0: {
                n3 = 5;
            }
            case 4: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return "Generator";
    }

    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3;
        block5: {
            block0: {
                block1: {
                    block6: {
                        block2: {
                            block3: {
                                block4: {
                                    n3 = 1;
                                    if (n2 == 1) break block0;
                                    if (n2 == 2) break block1;
                                    if (n2 == 3) break block2;
                                    if (n2 == 4) break block3;
                                    if (n2 != 5) break block4;
                                    string = "__iterator__";
                                    break block5;
                                }
                                throw new IllegalArgumentException(String.valueOf(n2));
                            }
                            string = "throw";
                            break block6;
                        }
                        string = "send";
                    }
                    n3 = 0;
                    break block5;
                }
                string = "next";
                break block5;
            }
            string = "close";
        }
        this.initPrototypeMethod(GENERATOR_TAG, n2, string, n3);
    }
}

