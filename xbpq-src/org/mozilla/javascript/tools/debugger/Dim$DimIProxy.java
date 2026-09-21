/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ContextFactory$Listener;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.debug.DebugFrame;
import org.mozilla.javascript.debug.DebuggableScript;
import org.mozilla.javascript.debug.Debugger;
import org.mozilla.javascript.tools.debugger.Dim;
import org.mozilla.javascript.tools.debugger.Dim$1;
import org.mozilla.javascript.tools.debugger.Dim$ContextData;
import org.mozilla.javascript.tools.debugger.Dim$FunctionSource;
import org.mozilla.javascript.tools.debugger.Dim$StackFrame;

class Dim$DimIProxy
implements ContextAction,
ContextFactory$Listener,
Debugger {
    private boolean booleanResult;
    private Dim dim;
    private Object id;
    private Object object;
    private Object[] objectArrayResult;
    private Object objectResult;
    private String stringResult;
    private String text;
    private int type;
    private String url;

    private Dim$DimIProxy(Dim dim, int n2) {
        this.dim = dim;
        this.type = n2;
    }

    /* synthetic */ Dim$DimIProxy(Dim dim, int n2, Dim$1 dim$1) {
        this(dim, n2);
    }

    static /* synthetic */ boolean access$1000(Dim$DimIProxy dim$DimIProxy) {
        return dim$DimIProxy.booleanResult;
    }

    static /* synthetic */ Object access$1102(Dim$DimIProxy dim$DimIProxy, Object object) {
        dim$DimIProxy.id = object;
        return object;
    }

    static /* synthetic */ Object access$1200(Dim$DimIProxy dim$DimIProxy) {
        return dim$DimIProxy.objectResult;
    }

    static /* synthetic */ Object[] access$1300(Dim$DimIProxy dim$DimIProxy) {
        return dim$DimIProxy.objectArrayResult;
    }

    static /* synthetic */ String access$502(Dim$DimIProxy dim$DimIProxy, String string) {
        dim$DimIProxy.url = string;
        return string;
    }

    static /* synthetic */ String access$602(Dim$DimIProxy dim$DimIProxy, String string) {
        dim$DimIProxy.text = string;
        return string;
    }

    static /* synthetic */ void access$700(Dim$DimIProxy dim$DimIProxy) {
        dim$DimIProxy.withContext();
    }

    static /* synthetic */ Object access$802(Dim$DimIProxy dim$DimIProxy, Object object) {
        dim$DimIProxy.object = object;
        return object;
    }

    static /* synthetic */ String access$900(Dim$DimIProxy dim$DimIProxy) {
        return dim$DimIProxy.stringResult;
    }

    private void withContext() {
        Dim.access$2100(this.dim).call(this);
    }

    @Override
    public void contextCreated(Context context) {
        if (this.type != 1) {
            Kit.codeBug();
        }
        Dim$ContextData dim$ContextData = new Dim$ContextData();
        context.setDebugger(new Dim$DimIProxy(this.dim, 0), dim$ContextData);
        context.setGeneratingDebug(true);
        context.setOptimizationLevel(-1);
    }

    @Override
    public void contextReleased(Context context) {
        if (this.type != 1) {
            Kit.codeBug();
        }
    }

    @Override
    public DebugFrame getFrame(Context context, DebuggableScript object) {
        if (this.type != 0) {
            Kit.codeBug();
        }
        if ((object = Dim.access$2200(this.dim, (DebuggableScript)object)) == null) {
            return null;
        }
        return new Dim$StackFrame(context, this.dim, (Dim$FunctionSource)object, null);
    }

    @Override
    public void handleCompilationDone(Context context, DebuggableScript debuggableScript, String string) {
        if (this.type != 0) {
            Kit.codeBug();
        }
        if (!debuggableScript.isTopLevel()) {
            return;
        }
        Dim.access$2400(this.dim, debuggableScript, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object run(Context object) {
        switch (this.type) {
            default: {
                throw Kit.codeBug();
            }
            case 7: {
                this.objectArrayResult = Dim.access$2000(this.dim, (Context)object, this.object);
                return null;
            }
            case 6: {
                this.objectResult = Dim.access$1900(this.dim, (Context)object, this.object, this.id);
                return null;
            }
            case 5: {
                object = this.object;
                object = object == Undefined.instance ? "undefined" : (object == null ? "null" : (object instanceof NativeCall ? "[object Call]" : Context.toString(object)));
                this.stringResult = object;
                return null;
            }
            case 4: {
                this.booleanResult = ((Context)object).stringIsCompilableUnit(this.text);
                return null;
            }
            case 3: {
                Scriptable scriptable = Dim.access$1800(this.dim) != null ? Dim.access$1800(this.dim).getScope() : null;
                Scriptable scriptable2 = scriptable;
                if (scriptable == null) {
                    scriptable2 = new ImporterTopLevel((Context)object);
                }
                ((Context)object).evaluateString(scriptable2, this.text, this.url, 1, null);
                return null;
            }
            case 2: 
        }
        ((Context)object).compileString(this.text, this.url, 1, null);
        return null;
    }
}

