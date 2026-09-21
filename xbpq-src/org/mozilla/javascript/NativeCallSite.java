/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptStackElement;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

public class NativeCallSite
extends IdScriptableObject {
    private static final String CALLSITE_TAG = "CallSite";
    private static final int Id_constructor = 1;
    private static final int Id_getColumnNumber = 9;
    private static final int Id_getEvalOrigin = 10;
    private static final int Id_getFileName = 7;
    private static final int Id_getFunction = 4;
    private static final int Id_getFunctionName = 5;
    private static final int Id_getLineNumber = 8;
    private static final int Id_getMethodName = 6;
    private static final int Id_getThis = 2;
    private static final int Id_getTypeName = 3;
    private static final int Id_isConstructor = 14;
    private static final int Id_isEval = 12;
    private static final int Id_isNative = 13;
    private static final int Id_isToplevel = 11;
    private static final int Id_toString = 15;
    private static final int MAX_PROTOTYPE_ID = 15;
    private static final long serialVersionUID = 2688372752566593594L;
    private ScriptStackElement element;

    private NativeCallSite() {
    }

    private static Object getFileName(Scriptable object) {
        while (object != null && !(object instanceof NativeCallSite)) {
            object = object.getPrototype();
        }
        if (object == null) {
            return Scriptable.NOT_FOUND;
        }
        object = ((NativeCallSite)object).element;
        object = object == null ? null : ((ScriptStackElement)object).fileName;
        return object;
    }

    private static Object getFunctionName(Scriptable object) {
        while (object != null && !(object instanceof NativeCallSite)) {
            object = object.getPrototype();
        }
        if (object == null) {
            return Scriptable.NOT_FOUND;
        }
        object = ((NativeCallSite)object).element;
        object = object == null ? null : ((ScriptStackElement)object).functionName;
        return object;
    }

    private static Object getLineNumber(Scriptable object) {
        int n2;
        while (object != null && !(object instanceof NativeCallSite)) {
            object = object.getPrototype();
        }
        if (object == null) {
            return Scriptable.NOT_FOUND;
        }
        object = ((NativeCallSite)object).element;
        if (object != null && (n2 = ((ScriptStackElement)object).lineNumber) >= 0) {
            return n2;
        }
        return Undefined.instance;
    }

    static void init(Scriptable scriptable, boolean bl) {
        new NativeCallSite().exportAsJSClass(15, scriptable, bl);
    }

    private static Object js_toString(Scriptable object) {
        while (object != null && !(object instanceof NativeCallSite)) {
            object = object.getPrototype();
        }
        if (object == null) {
            return Scriptable.NOT_FOUND;
        }
        NativeCallSite nativeCallSite = (NativeCallSite)object;
        object = new StringBuilder();
        nativeCallSite.element.renderJavaStyle((StringBuilder)object);
        return ((StringBuilder)object).toString();
    }

    static NativeCallSite make(Scriptable scriptable, Scriptable scriptable2) {
        NativeCallSite nativeCallSite = new NativeCallSite();
        scriptable2 = (Scriptable)scriptable2.get("prototype", scriptable2);
        nativeCallSite.setParentScope(scriptable);
        nativeCallSite.setPrototype(scriptable2);
        return nativeCallSite;
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!idFunctionObject.hasTag(CALLSITE_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = idFunctionObject.methodId();
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 15: {
                return NativeCallSite.js_toString(scriptable2);
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: {
                return Boolean.FALSE;
            }
            case 8: {
                return NativeCallSite.getLineNumber(scriptable2);
            }
            case 7: {
                return NativeCallSite.getFileName(scriptable2);
            }
            case 6: {
                return null;
            }
            case 5: {
                return NativeCallSite.getFunctionName(scriptable2);
            }
            case 2: 
            case 3: 
            case 4: 
            case 9: {
                return Undefined.instance;
            }
            case 1: 
        }
        return NativeCallSite.make(scriptable, idFunctionObject);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 14;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1415137529: {
                if (!string.equals("getFunctionName")) break;
                n4 = 14;
                break;
            }
            case 1401392731: {
                if (!string.equals("getTypeName")) break;
                n4 = 13;
                break;
            }
            case 1342178205: {
                if (!string.equals("getFileName")) break;
                n4 = 12;
                break;
            }
            case 1296528496: {
                if (!string.equals("isConstructor")) break;
                n4 = 11;
                break;
            }
            case 1033688245: {
                if (!string.equals("getColumnNumber")) break;
                n4 = 10;
                break;
            }
            case -75122924: {
                if (!string.equals("getThis")) break;
                n4 = 9;
                break;
            }
            case -378584607: {
                if (!string.equals("isNative")) break;
                n4 = 8;
                break;
            }
            case -511762728: {
                if (!string.equals("getEvalOrigin")) break;
                n4 = 7;
                break;
            }
            case -626890669: {
                if (!string.equals("getLineNumber")) break;
                n4 = 6;
                break;
            }
            case -836128434: {
                if (!string.equals("getFunction")) break;
                n4 = 5;
                break;
            }
            case -1020911870: {
                if (!string.equals("getMethodName")) break;
                n4 = 4;
                break;
            }
            case -1180529434: {
                if (!string.equals("isEval")) break;
                n4 = 3;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 2;
                break;
            }
            case -1747710311: {
                if (!string.equals("isToplevel")) break;
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
            case 14: {
                n3 = 5;
                break;
            }
            case 13: {
                n3 = 3;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 9: {
                n3 = 2;
                break;
            }
            case 8: {
                n3 = 13;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 6;
                break;
            }
            case 3: {
                n3 = 12;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 0: {
                n3 = 15;
            }
            case 11: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return CALLSITE_TAG;
    }

    @Override
    protected void initPrototypeId(int n2) {
        String string;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 15: {
                string = "toString";
                break;
            }
            case 14: {
                string = "isConstructor";
                break;
            }
            case 13: {
                string = "isNative";
                break;
            }
            case 12: {
                string = "isEval";
                break;
            }
            case 11: {
                string = "isToplevel";
                break;
            }
            case 10: {
                string = "getEvalOrigin";
                break;
            }
            case 9: {
                string = "getColumnNumber";
                break;
            }
            case 8: {
                string = "getLineNumber";
                break;
            }
            case 7: {
                string = "getFileName";
                break;
            }
            case 6: {
                string = "getMethodName";
                break;
            }
            case 5: {
                string = "getFunctionName";
                break;
            }
            case 4: {
                string = "getFunction";
                break;
            }
            case 3: {
                string = "getTypeName";
                break;
            }
            case 2: {
                string = "getThis";
                break;
            }
            case 1: {
                string = "constructor";
            }
        }
        this.initPrototypeMethod(CALLSITE_TAG, n2, string, 0);
    }

    void setElement(ScriptStackElement scriptStackElement) {
        this.element = scriptStackElement;
    }

    public String toString() {
        ScriptStackElement scriptStackElement = this.element;
        if (scriptStackElement == null) {
            return "";
        }
        return scriptStackElement.toString();
    }
}

