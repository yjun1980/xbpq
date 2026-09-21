/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ES6Generator$State;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;

public final class ES6Generator
extends IdScriptableObject {
    private static final Object GENERATOR_TAG = "Generator";
    private static final int Id_next = 1;
    private static final int Id_return = 2;
    private static final int Id_throw = 3;
    private static final int MAX_PROTOTYPE_ID = 4;
    private static final int SymbolId_iterator = 4;
    private static final long serialVersionUID = 1645892441041347273L;
    private Object delegee;
    private NativeFunction function;
    private int lineNumber;
    private String lineSource;
    private Object savedState;
    private ES6Generator$State state = ES6Generator$State.SUSPENDED_START;

    private ES6Generator() {
    }

    public ES6Generator(Scriptable scriptable, NativeFunction nativeFunction, Object object) {
        this.function = nativeFunction;
        this.savedState = object;
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        this.setParentScope(scriptable);
        this.setPrototype((ES6Generator)ScriptableObject.getTopScopeValue(scriptable, GENERATOR_TAG));
    }

    private Object callReturnOptionally(Context context, Scriptable scriptable, Object objectArray) {
        Object object = Undefined.instance;
        objectArray = object.equals(objectArray) ? ScriptRuntime.emptyArgs : new Object[]{objectArray};
        Object object2 = ScriptRuntime.getObjectPropNoWarn(this.delegee, "return", context, scriptable);
        if (!object.equals(object2)) {
            if (object2 instanceof Callable) {
                return ((Callable)object2).call(context, scriptable, ScriptableObject.ensureScriptable(this.delegee), objectArray);
            }
            throw ScriptRuntime.typeErrorById("msg.isnt.function", "return", ScriptRuntime.typeof(object2));
        }
        return null;
    }

    static ES6Generator init(ScriptableObject scriptableObject, boolean bl) {
        ES6Generator eS6Generator = new ES6Generator();
        if (scriptableObject != null) {
            eS6Generator.setParentScope(scriptableObject);
            eS6Generator.setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        }
        eS6Generator.activatePrototypeMap(4);
        if (bl) {
            eS6Generator.sealObject();
        }
        if (scriptableObject != null) {
            scriptableObject.associateValue(GENERATOR_TAG, eS6Generator);
        }
        return eS6Generator;
    }

    /*
     * Exception decompiling
     */
    private Scriptable resumeAbruptLocal(Context var1_1, Scriptable var2_5, int var3_7, Object var4_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [4 : 227->252)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private Scriptable resumeDelegee(Context context, Scriptable scriptable, Object object) {
        try {
            object = Undefined.instance.equals(object) ? ScriptRuntime.emptyArgs : new Object[]{object};
            object = ScriptableObject.ensureScriptable(ScriptRuntime.getPropFunctionAndThis(this.delegee, "next", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), (Object[])object));
            if (ScriptRuntime.isIteratorDone(context, object)) {
                this.delegee = null;
                object = this.resumeLocal(context, scriptable, ScriptableObject.getProperty((Scriptable)object, "value"));
                return object;
            }
            return object;
        }
        catch (RhinoException rhinoException) {
            this.delegee = null;
            return this.resumeAbruptLocal(context, scriptable, 1, rhinoException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Scriptable resumeDelegeeReturn(Context context, Scriptable scriptable, Object object) {
        try {
            Object object2 = this.callReturnOptionally(context, scriptable, object);
            if (object2 == null) {
                this.delegee = null;
                return this.resumeAbruptLocal(context, scriptable, 2, object);
            }
            if (!ScriptRuntime.isIteratorDone(context, object2)) return ScriptableObject.ensureScriptable(object2);
            this.delegee = null;
            return this.resumeAbruptLocal(context, scriptable, 2, ScriptRuntime.getObjectPropNoWarn(object2, "value", context, scriptable));
        }
        catch (RhinoException rhinoException) {
            this.delegee = null;
            return this.resumeAbruptLocal(context, scriptable, 1, rhinoException);
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Scriptable resumeDelegeeThrow(Context object, Scriptable scriptable, Object object2) {
        void var3_8;
        block13: {
            boolean bl;
            block15: {
                block12: {
                    bl = false;
                    object2 = ScriptRuntime.getPropFunctionAndThis(this.delegee, "throw", (Context)object, scriptable).call((Context)object, scriptable, ScriptRuntime.lastStoredScriptable((Context)object), new Object[]{object2});
                    boolean bl2 = ScriptRuntime.isIteratorDone((Context)object, object2);
                    if (!bl2) break block12;
                    this.callReturnOptionally((Context)object, scriptable, Undefined.instance);
                    {
                        catch (Throwable throwable) {
                            this.delegee = null;
                            throw throwable;
                        }
                    }
                    try {
                        this.delegee = null;
                        return this.resumeLocal((Context)object, scriptable, ScriptRuntime.getObjectProp(object2, "value", (Context)object, scriptable));
                    }
                    catch (RhinoException rhinoException) {
                        bl = true;
                    }
                    break block15;
                }
                try {
                    return ScriptableObject.ensureScriptable(object2);
                }
                catch (RhinoException rhinoException) {
                    // empty catch block
                }
            }
            if (!bl) {
                Throwable throwable222;
                block14: {
                    try {
                        this.callReturnOptionally((Context)object, scriptable, Undefined.instance);
                        break block13;
                    }
                    catch (Throwable throwable222) {
                        break block14;
                    }
                    catch (RhinoException rhinoException) {
                        object = this.resumeAbruptLocal((Context)object, scriptable, 1, rhinoException);
                        this.delegee = null;
                        return object;
                    }
                }
                this.delegee = null;
                throw throwable222;
            }
        }
        this.delegee = null;
        return this.resumeAbruptLocal((Context)object, scriptable, 1, var3_8);
    }

    /*
     * Exception decompiling
     */
    private Scriptable resumeLocal(Context var1_1, Scriptable var2_7, Object var3_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [24 : 257->275)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(GENERATOR_TAG)) {
            return super.execIdCall((IdFunctionObject)object, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)object).methodId();
        ES6Generator eS6Generator = IdScriptableObject.ensureType(scriptable2, ES6Generator.class, (IdFunctionObject)object);
        object = objectArray.length >= 1 ? objectArray[0] : Undefined.instance;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 == 4) {
                        return scriptable2;
                    }
                    throw new IllegalArgumentException(String.valueOf(n2));
                }
                if (eS6Generator.delegee == null) {
                    return eS6Generator.resumeAbruptLocal(context, scriptable, 1, object);
                }
                return eS6Generator.resumeDelegeeThrow(context, scriptable, object);
            }
            if (eS6Generator.delegee == null) {
                return eS6Generator.resumeAbruptLocal(context, scriptable, 2, object);
            }
            return eS6Generator.resumeDelegeeReturn(context, scriptable, object);
        }
        if (eS6Generator.delegee == null) {
            return eS6Generator.resumeLocal(context, scriptable, object);
        }
        return eS6Generator.resumeDelegee(context, scriptable, object);
    }

    @Override
    protected int findPrototypeId(String string) {
        int n2;
        block6: {
            String string2;
            n2 = string.length();
            int n3 = 0;
            if (n2 == 4) {
                n2 = 1;
                string2 = "next";
            } else if (n2 == 5) {
                n2 = 3;
                string2 = "throw";
            } else if (n2 == 6) {
                n2 = 2;
                string2 = "return";
            } else {
                string2 = null;
                n2 = 0;
            }
            if (string2 == null || string2 == string || string2.equals(string)) break block6;
            n2 = n3;
        }
        return n2;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 4;
        }
        return 0;
    }

    @Override
    public String getClassName() {
        return "Generator";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        String string;
        if (n2 == 4) {
            this.initPrototypeMethod(GENERATOR_TAG, n2, SymbolKey.ITERATOR, "[Symbol.iterator]", 0);
            return;
        }
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) throw new IllegalArgumentException(String.valueOf(n2));
                string = "throw";
            } else {
                string = "return";
            }
        } else {
            string = "next";
        }
        this.initPrototypeMethod(GENERATOR_TAG, n2, string, 1);
    }
}

