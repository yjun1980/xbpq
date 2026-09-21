/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

class NativeScript
extends BaseFunction {
    private static final int Id_compile = 3;
    private static final int Id_constructor = 1;
    private static final int Id_exec = 4;
    private static final int Id_toString = 2;
    private static final int MAX_PROTOTYPE_ID = 4;
    private static final Object SCRIPT_TAG = "Script";
    private static final long serialVersionUID = -6795101161980121700L;
    private Script script;

    private NativeScript(Script script) {
        this.script = script;
    }

    private static Script compile(Context context, String string) {
        String string2;
        int[] nArray = new int[]{0};
        String string3 = string2 = Context.getSourcePositionFromStack(nArray);
        if (string2 == null) {
            nArray[0] = 1;
            string3 = "<Script object>";
        }
        return context.compileString(string, null, DefaultErrorReporter.forEval(context.getErrorReporter()), string3, nArray[0], null);
    }

    static void init(Context context, Scriptable scriptable, boolean bl) {
        new NativeScript(null).exportAsJSClass(4, scriptable, bl);
    }

    @Deprecated
    static void init(Scriptable scriptable, boolean bl) {
        NativeScript.init(Context.getContext(), scriptable, bl);
    }

    private static NativeScript realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeScript.class, idFunctionObject);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable object, Object[] objectArray) {
        object = this.script;
        if (object != null) {
            return object.exec(context, scriptable);
        }
        return Undefined.instance;
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        throw Context.reportRuntimeErrorById("msg.script.is.not.constructor", new Object[0]);
    }

    @Override
    String decompile(int n2, int n3) {
        Script script = this.script;
        if (script instanceof NativeFunction) {
            return ((NativeFunction)((Object)script)).decompile(n2, n3);
        }
        return super.decompile(n2, n3);
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(SCRIPT_TAG)) {
            return super.execIdCall((IdFunctionObject)object, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)object).methodId();
        String string = "";
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        throw new IllegalArgumentException(String.valueOf(n2));
                    }
                    throw Context.reportRuntimeErrorById("msg.cant.call.indirect", "exec");
                }
                object = NativeScript.realThis(scriptable2, (IdFunctionObject)object);
                ((NativeScript)object).script = NativeScript.compile(context, ScriptRuntime.toString(objectArray, 0));
                return object;
            }
            object = NativeScript.realThis((Scriptable)scriptable2, (IdFunctionObject)object).script;
            if (object == null) {
                return "";
            }
            return context.decompileScript((Script)object, 0);
        }
        object = objectArray.length == 0 ? string : ScriptRuntime.toString(objectArray[0]);
        object = new NativeScript(NativeScript.compile(context, (String)object));
        ScriptRuntime.setObjectProtoAndParent((ScriptableObject)object, scriptable);
        return object;
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 3;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 950491699: {
                if (!string.equals("compile")) break;
                n4 = 3;
                break;
            }
            case 3127441: {
                if (!string.equals("exec")) break;
                n4 = 2;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 1;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 0: {
                n3 = 2;
            }
            case 3: 
        }
        return n3;
    }

    @Override
    public int getArity() {
        return 0;
    }

    @Override
    public String getClassName() {
        return "Script";
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3;
        block4: {
            block5: {
                block0: {
                    block1: {
                        block2: {
                            block3: {
                                n3 = 0;
                                if (n2 == 1) break block0;
                                if (n2 == 2) break block1;
                                if (n2 == 3) break block2;
                                if (n2 != 4) break block3;
                                string = "exec";
                                break block4;
                            }
                            throw new IllegalArgumentException(String.valueOf(n2));
                        }
                        string = "compile";
                        break block5;
                    }
                    string = "toString";
                    break block4;
                }
                string = "constructor";
            }
            n3 = 1;
        }
        this.initPrototypeMethod(SCRIPT_TAG, n2, string, n3);
    }
}

