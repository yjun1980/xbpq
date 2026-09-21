/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.util.Objects;
import org.mozilla.javascript.BoundFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.UniqueTag;

public class BaseFunction
extends IdScriptableObject
implements Function {
    private static final String FUNCTION_CLASS = "Function";
    private static final Object FUNCTION_TAG = "Function";
    static final String GENERATOR_FUNCTION_CLASS = "__GeneratorFunction";
    private static final int Id_apply = 4;
    protected static final int Id_arguments = 5;
    protected static final int Id_arity = 2;
    private static final int Id_bind = 6;
    private static final int Id_call = 5;
    private static final int Id_constructor = 1;
    protected static final int Id_length = 1;
    protected static final int Id_name = 3;
    protected static final int Id_prototype = 4;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    protected static final int MAX_INSTANCE_ID = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    private static final long serialVersionUID = 5311394446546053859L;
    private int argumentsAttributes;
    private Object argumentsObj = Scriptable.NOT_FOUND;
    private int arityPropertyAttributes;
    private boolean isGeneratorFunction;
    private int lengthPropertyAttributes;
    private int namePropertyAttributes;
    private String nameValue = null;
    private Object prototypeProperty;
    private int prototypePropertyAttributes;

    public BaseFunction() {
        this.isGeneratorFunction = false;
        this.prototypePropertyAttributes = 6;
        this.argumentsAttributes = 6;
        this.arityPropertyAttributes = 7;
        this.namePropertyAttributes = 3;
        this.lengthPropertyAttributes = 7;
    }

    public BaseFunction(Scriptable scriptable, Scriptable scriptable2) {
        super(scriptable, scriptable2);
        this.isGeneratorFunction = false;
        this.prototypePropertyAttributes = 6;
        this.argumentsAttributes = 6;
        this.arityPropertyAttributes = 7;
        this.namePropertyAttributes = 3;
        this.lengthPropertyAttributes = 7;
    }

    public BaseFunction(boolean bl) {
        this.prototypePropertyAttributes = 6;
        this.argumentsAttributes = 6;
        this.arityPropertyAttributes = 7;
        this.namePropertyAttributes = 3;
        this.lengthPropertyAttributes = 7;
        this.isGeneratorFunction = bl;
    }

    private Object getArguments() {
        Object object = this.defaultHas("arguments") ? this.defaultGet("arguments") : this.argumentsObj;
        if (object != Scriptable.NOT_FOUND) {
            return object;
        }
        object = ScriptRuntime.findFunctionActivation(Context.getContext(), this);
        object = object == null ? null : ((IdScriptableObject)object).get("arguments", (Scriptable)object);
        return object;
    }

    static void init(Context context, Scriptable scriptable, boolean bl) {
        BaseFunction baseFunction = new BaseFunction();
        baseFunction.prototypePropertyAttributes = 7;
        if (context.getLanguageVersion() >= 200) {
            baseFunction.setStandardPropertyAttributes(3);
        }
        baseFunction.exportAsJSClass(6, scriptable, bl);
    }

    @Deprecated
    static void init(Scriptable scriptable, boolean bl) {
        BaseFunction.init(Context.getContext(), scriptable, bl);
    }

    static Object initAsGeneratorFunction(Scriptable scriptable, boolean bl) {
        BaseFunction baseFunction = new BaseFunction(true);
        baseFunction.prototypePropertyAttributes = 5;
        baseFunction.exportAsJSClass(6, scriptable, bl);
        return ScriptableObject.getProperty(scriptable, GENERATOR_FUNCTION_CLASS);
    }

    static boolean isApply(IdFunctionObject idFunctionObject) {
        boolean bl = idFunctionObject.hasTag(FUNCTION_TAG) && idFunctionObject.methodId() == 4;
        return bl;
    }

    static boolean isApplyOrCall(IdFunctionObject idFunctionObject) {
        int n2;
        return idFunctionObject.hasTag(FUNCTION_TAG) && ((n2 = idFunctionObject.methodId()) == 4 || n2 == 5);
        {
        }
    }

    private Object jsConstructor(Context context, Scriptable object, Object[] object2) {
        int n2;
        int n3 = ((Object[])object2).length;
        CharSequence charSequence = a.c("function ");
        if (this.isGeneratorFunction()) {
            charSequence.append("* ");
        }
        if (context.getLanguageVersion() != 120) {
            charSequence.append("anonymous");
        }
        charSequence.append('(');
        for (int i2 = 0; i2 < (n2 = n3 - 1); ++i2) {
            if (i2 > 0) {
                charSequence.append(',');
            }
            charSequence.append(ScriptRuntime.toString(object2[i2]));
        }
        charSequence.append(") {");
        if (n3 != 0) {
            charSequence.append(ScriptRuntime.toString(object2[n2]));
        }
        charSequence.append("\n}");
        String string = charSequence.toString();
        int[] nArray = new int[1];
        charSequence = Context.getSourcePositionFromStack(nArray);
        object2 = charSequence;
        if (charSequence == null) {
            nArray[0] = 1;
            object2 = "<eval'ed string>";
        }
        charSequence = ScriptRuntime.makeUrlForGeneratedScript(false, (String)object2, nArray[0]);
        Scriptable scriptable = ScriptableObject.getTopLevelScope((Scriptable)object);
        object = DefaultErrorReporter.forEval(context.getErrorReporter());
        Evaluator evaluator = Context.createInterpreter();
        if (evaluator != null) {
            return context.compileFunction(scriptable, string, evaluator, (ErrorReporter)object, (String)charSequence, 1, null);
        }
        throw new JavaScriptException("Interpreter not present", (String)object2, nArray[0]);
    }

    private static BaseFunction realFunction(Scriptable object, IdFunctionObject idFunctionObject) {
        if (object != null) {
            Object object2;
            object = object2 = object.getDefaultValue(ScriptRuntime.FunctionClass);
            if (object2 instanceof Delegator) {
                object = ((Delegator)object2).getDelegee();
            }
            return IdScriptableObject.ensureType(object, BaseFunction.class, idFunctionObject);
        }
        throw ScriptRuntime.notFunctionError(null);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return Undefined.instance;
    }

    @Override
    public Scriptable construct(Context object, Scriptable object2, Object[] object3) {
        block10: {
            block9: {
                block8: {
                    Scriptable scriptable = this.createObject((Context)object, (Scriptable)object2);
                    if (scriptable == null) break block8;
                    object2 = this.call((Context)object, (Scriptable)object2, scriptable, (Object[])object3);
                    object = scriptable;
                    if (object2 instanceof Scriptable) {
                        object = (Scriptable)object2;
                    }
                    break block9;
                }
                if (!((object = this.call((Context)object, (Scriptable)object2, null, (Object[])object3)) instanceof Scriptable)) break block10;
                object2 = (Scriptable)object;
                if (object2.getPrototype() == null && object2 != (object = this.getClassPrototype())) {
                    object2.setPrototype((Scriptable)object);
                }
                object = object2;
                if (object2.getParentScope() == null) {
                    object3 = this.getParentScope();
                    object = object2;
                    if (object2 != object3) {
                        object2.setParentScope((Scriptable)object3);
                        object = object2;
                    }
                }
            }
            return object;
        }
        object = a.c("Bad implementation of call as constructor, name=");
        ((StringBuilder)object).append(this.getFunctionName());
        ((StringBuilder)object).append(" in ");
        ((StringBuilder)object).append(this.getClass().getName());
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public Scriptable createObject(Context object, Scriptable scriptable) {
        object = new NativeObject();
        object.setPrototype(this.getClassPrototype());
        object.setParentScope(this.getParentScope());
        return object;
    }

    String decompile(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        n2 = 1;
        if ((n3 & 1) == 0) {
            n2 = 0;
        }
        if (n2 == 0) {
            stringBuilder.append("function ");
            stringBuilder.append(this.getFunctionName());
            stringBuilder.append("() {\n\t");
        }
        stringBuilder.append("[native code, arity=");
        stringBuilder.append(this.getArity());
        stringBuilder.append("]\n");
        if (n2 == 0) {
            stringBuilder.append("}\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public Object execIdCall(IdFunctionObject objectArray, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray2) {
        if (!objectArray.hasTag(FUNCTION_TAG)) {
            return super.execIdCall((IdFunctionObject)objectArray, context, scriptable, scriptable2, objectArray2);
        }
        int n2 = objectArray.methodId();
        boolean bl = true;
        int n3 = 0;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 6: {
                if (scriptable2 instanceof Callable) {
                    Callable callable = (Callable)((Object)scriptable2);
                    n2 = objectArray2.length;
                    if (n2 > 0) {
                        scriptable2 = ScriptRuntime.toObjectOrNull(context, objectArray2[0], scriptable);
                        objectArray = new Object[--n2];
                        System.arraycopy(objectArray2, 1, objectArray, 0, n2);
                    } else {
                        objectArray = ScriptRuntime.emptyArgs;
                        scriptable2 = null;
                    }
                    return new BoundFunction(context, scriptable, callable, scriptable2, objectArray);
                }
                throw ScriptRuntime.notFunctionError(scriptable2);
            }
            case 4: 
            case 5: {
                if (n2 != 4) {
                    bl = false;
                }
                return ScriptRuntime.applyOrCall(bl, context, scriptable, scriptable2, objectArray2);
            }
            case 3: {
                objectArray = BaseFunction.realFunction(scriptable2, (IdFunctionObject)objectArray);
                int n4 = 2;
                int n5 = n3;
                n2 = n4;
                if (objectArray2.length != 0) {
                    int n6 = ScriptRuntime.toInt32(objectArray2[0]);
                    n5 = n3;
                    n2 = n4;
                    if (n6 >= 0) {
                        n5 = n6;
                        n2 = 0;
                    }
                }
                return objectArray.decompile(n5, n2);
            }
            case 2: {
                return BaseFunction.realFunction(scriptable2, (IdFunctionObject)objectArray).decompile(ScriptRuntime.toInt32(objectArray2, 0), 0);
            }
            case 1: 
        }
        return this.jsConstructor(context, scriptable, objectArray2);
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        idFunctionObject.setPrototype(this);
        super.fillConstructorProperties(idFunctionObject);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int findInstanceIdInfo(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 93082333: {
                if (!string.equals("arity")) break;
                n3 = 4;
                break;
            }
            case 3373707: {
                if (!string.equals("name")) break;
                n3 = 3;
                break;
            }
            case -598792926: {
                if (!string.equals("prototype")) break;
                n3 = 2;
                break;
            }
            case -1106363674: {
                if (!string.equals("length")) break;
                n3 = 1;
                break;
            }
            case -2035517098: {
                if (!string.equals("arguments")) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return super.findInstanceIdInfo(string);
            }
            case 4: {
                n3 = this.arityPropertyAttributes;
                if (n3 < 0) return super.findInstanceIdInfo(string);
                return IdScriptableObject.instanceIdInfo(n3, 2);
            }
            case 3: {
                n3 = this.namePropertyAttributes;
                if (n3 < 0) return super.findInstanceIdInfo(string);
                return IdScriptableObject.instanceIdInfo(n3, 3);
            }
            case 2: {
                if (!this.hasPrototypeProperty()) return super.findInstanceIdInfo(string);
                return IdScriptableObject.instanceIdInfo(this.prototypePropertyAttributes, 4);
            }
            case 1: {
                n3 = this.lengthPropertyAttributes;
                if (n3 < 0) return super.findInstanceIdInfo(string);
                return IdScriptableObject.instanceIdInfo(n3, 1);
            }
            case 0: 
        }
        return IdScriptableObject.instanceIdInfo(this.argumentsAttributes, 5);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 5;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 93029230: {
                if (!string.equals("apply")) break;
                n4 = 5;
                break;
            }
            case 3045982: {
                if (!string.equals("call")) break;
                n4 = 4;
                break;
            }
            case 3023933: {
                if (!string.equals("bind")) break;
                n4 = 3;
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
            case 5: {
                n3 = 4;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 2;
                break;
            }
            case 0: {
                n3 = 3;
            }
            case 4: 
        }
        return n3;
    }

    public int getArity() {
        return 0;
    }

    @Override
    public String getClassName() {
        String string = this.isGeneratorFunction() ? GENERATOR_FUNCTION_CLASS : FUNCTION_CLASS;
        return string;
    }

    protected Scriptable getClassPrototype() {
        Object object = this.getPrototypeProperty();
        if (object instanceof Scriptable) {
            return (Scriptable)object;
        }
        return ScriptableObject.getObjectPrototype(this);
    }

    public String getFunctionName() {
        return "";
    }

    @Override
    protected String getInstanceIdName(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            return super.getInstanceIdName(n2);
                        }
                        return "arguments";
                    }
                    return "prototype";
                }
                return "name";
            }
            return "arity";
        }
        return "length";
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                Object object;
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            return super.getInstanceIdValue(n2);
                        }
                        return this.getArguments();
                    }
                    return this.getPrototypeProperty();
                }
                if (this.namePropertyAttributes >= 0) {
                    object = this.nameValue;
                    if (object == null) {
                        object = this.getFunctionName();
                    }
                } else {
                    object = Scriptable.NOT_FOUND;
                }
                return object;
            }
            Object object = this.arityPropertyAttributes >= 0 ? Integer.valueOf(this.getArity()) : Scriptable.NOT_FOUND;
            return object;
        }
        Object object = this.lengthPropertyAttributes >= 0 ? Integer.valueOf(this.getLength()) : Scriptable.NOT_FOUND;
        return object;
    }

    public int getLength() {
        return 0;
    }

    @Override
    protected int getMaxInstanceId() {
        return 5;
    }

    protected Object getPrototypeProperty() {
        Object object;
        Object object2 = this.prototypeProperty;
        if (object2 == null) {
            object = this instanceof NativeFunction ? this.setupDefaultPrototype() : Undefined.instance;
        } else {
            object = object2;
            if (object2 == UniqueTag.NULL_VALUE) {
                object = null;
            }
        }
        return object;
    }

    @Override
    public String getTypeOf() {
        String string = this.avoidObjectDetection() ? "undefined" : "function";
        return string;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        Object object = ScriptableObject.getProperty((Scriptable)this, "prototype");
        if (object instanceof Scriptable) {
            return ScriptRuntime.jsDelegatesTo(scriptable, (Scriptable)object);
        }
        throw ScriptRuntime.typeErrorById("msg.instanceof.bad.prototype", this.getFunctionName());
    }

    protected boolean hasPrototypeProperty() {
        boolean bl = this.prototypeProperty != null || this instanceof NativeFunction;
        return bl;
    }

    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3 = 1;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 6: {
                string = "bind";
                break;
            }
            case 5: {
                string = "call";
                break;
            }
            case 4: {
                n3 = 2;
                string = "apply";
                break;
            }
            case 3: {
                string = "toSource";
                break;
            }
            case 2: {
                n3 = 0;
                string = "toString";
                break;
            }
            case 1: {
                string = "constructor";
            }
        }
        this.initPrototypeMethod(FUNCTION_TAG, n2, string, n3);
    }

    protected boolean isGeneratorFunction() {
        return this.isGeneratorFunction;
    }

    public void setImmunePrototypeProperty(Object object) {
        if ((this.prototypePropertyAttributes & 1) == 0) {
            if (object == null) {
                object = UniqueTag.NULL_VALUE;
            }
            this.prototypeProperty = object;
            this.prototypePropertyAttributes = 7;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    protected void setInstanceIdAttributes(int n2, int n3) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            super.setInstanceIdAttributes(n2, n3);
                            return;
                        }
                        this.argumentsAttributes = n3;
                        return;
                    }
                    this.prototypePropertyAttributes = n3;
                    return;
                }
                this.namePropertyAttributes = n3;
                return;
            }
            this.arityPropertyAttributes = n3;
            return;
        }
        this.lengthPropertyAttributes = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void setInstanceIdValue(int n2, Object object) {
        if (n2 == 1) {
            if (object != Scriptable.NOT_FOUND) return;
            this.lengthPropertyAttributes = -1;
            return;
        }
        if (n2 == 2) {
            if (object != Scriptable.NOT_FOUND) return;
            this.arityPropertyAttributes = -1;
            return;
        }
        if (n2 != 3) {
            if (n2 != 4) {
                if (n2 != 5) {
                    super.setInstanceIdValue(n2, object);
                    return;
                }
                if (object == Scriptable.NOT_FOUND) {
                    Kit.codeBug();
                }
                if (this.defaultHas("arguments")) {
                    this.defaultPut("arguments", object);
                    return;
                }
                if ((this.argumentsAttributes & 1) != 0) return;
                this.argumentsObj = object;
                return;
            }
            if ((this.prototypePropertyAttributes & 1) != 0) return;
            if (object == null) {
                object = UniqueTag.NULL_VALUE;
            }
            this.prototypeProperty = object;
            return;
        }
        if (object == Scriptable.NOT_FOUND) {
            this.namePropertyAttributes = -1;
            object = null;
        } else {
            object = object instanceof CharSequence ? ScriptRuntime.toString(object) : "";
        }
        this.nameValue = object;
    }

    protected void setPrototypeProperty(Object object) {
        this.prototypeProperty = object;
    }

    public void setPrototypePropertyAttributes(int n2) {
        this.prototypePropertyAttributes = n2;
    }

    public void setStandardPropertyAttributes(int n2) {
        this.namePropertyAttributes = n2;
        this.lengthPropertyAttributes = n2;
        this.arityPropertyAttributes = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected Object setupDefaultPrototype() {
        synchronized (this) {
            Object object = this.prototypeProperty;
            if (object != null) {
                return object;
            }
            object = new NativeObject();
            ((ScriptableObject)object).setParentScope(this.getParentScope());
            this.prototypeProperty = object;
            Scriptable scriptable = ScriptableObject.getObjectPrototype(this);
            if (scriptable != object) {
                ((ScriptableObject)object).setPrototype(scriptable);
            }
            ((ScriptableObject)object).defineProperty("constructor", (Object)this, 2);
            return object;
        }
    }
}

