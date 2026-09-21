/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.debug.DebuggableObject;
import org.mozilla.javascript.debug.DebuggableScript;
import org.mozilla.javascript.debug.Debugger;
import org.mozilla.javascript.tools.debugger.Dim$ContextData;
import org.mozilla.javascript.tools.debugger.Dim$DimIProxy;
import org.mozilla.javascript.tools.debugger.Dim$FunctionSource;
import org.mozilla.javascript.tools.debugger.Dim$SourceInfo;
import org.mozilla.javascript.tools.debugger.Dim$StackFrame;
import org.mozilla.javascript.tools.debugger.GuiCallback;
import org.mozilla.javascript.tools.debugger.ScopeProvider;
import org.mozilla.javascript.tools.debugger.SourceProvider;

public class Dim {
    public static final int BREAK = 4;
    public static final int EXIT = 5;
    public static final int GO = 3;
    private static final int IPROXY_COMPILE_SCRIPT = 2;
    private static final int IPROXY_DEBUG = 0;
    private static final int IPROXY_EVAL_SCRIPT = 3;
    private static final int IPROXY_LISTEN = 1;
    private static final int IPROXY_OBJECT_IDS = 7;
    private static final int IPROXY_OBJECT_PROPERTY = 6;
    private static final int IPROXY_OBJECT_TO_STRING = 5;
    private static final int IPROXY_STRING_IS_COMPILABLE = 4;
    public static final int STEP_INTO = 1;
    public static final int STEP_OUT = 2;
    public static final int STEP_OVER = 0;
    private boolean breakFlag;
    private boolean breakOnEnter;
    private boolean breakOnExceptions;
    private boolean breakOnReturn;
    private GuiCallback callback;
    private ContextFactory contextFactory;
    private Dim$StackFrame evalFrame;
    private String evalRequest;
    private String evalResult;
    private Object eventThreadMonitor;
    private int frameIndex = -1;
    private final Map<String, Dim$FunctionSource> functionNames;
    private final Map<DebuggableScript, Dim$FunctionSource> functionToSource;
    private boolean insideInterruptLoop;
    private volatile Dim$ContextData interruptedContextData;
    private Dim$DimIProxy listener;
    private Object monitor = new Object();
    private volatile int returnValue = -1;
    private ScopeProvider scopeProvider;
    private SourceProvider sourceProvider;
    private final Map<String, Dim$SourceInfo> urlToSourceInfo;

    public Dim() {
        this.eventThreadMonitor = new Object();
        this.urlToSourceInfo = Collections.synchronizedMap(new HashMap());
        this.functionNames = Collections.synchronizedMap(new HashMap());
        this.functionToSource = Collections.synchronizedMap(new HashMap());
    }

    static /* synthetic */ ScopeProvider access$1800(Dim dim) {
        return dim.scopeProvider;
    }

    static /* synthetic */ Object access$1900(Dim dim, Context context, Object object, Object object2) {
        return dim.getObjectPropertyImpl(context, object, object2);
    }

    static /* synthetic */ Object[] access$2000(Dim dim, Context context, Object object) {
        return dim.getObjectIdsImpl(context, object);
    }

    static /* synthetic */ ContextFactory access$2100(Dim dim) {
        return dim.contextFactory;
    }

    static /* synthetic */ Dim$FunctionSource access$2200(Dim dim, DebuggableScript debuggableScript) {
        return dim.getFunctionSource(debuggableScript);
    }

    static /* synthetic */ void access$2400(Dim dim, DebuggableScript debuggableScript, String string) {
        dim.registerTopScript(debuggableScript, string);
    }

    static /* synthetic */ boolean access$2700(Dim dim) {
        return dim.breakOnEnter;
    }

    static /* synthetic */ void access$2800(Dim dim, Dim$StackFrame dim$StackFrame, Context context) {
        dim.handleBreakpointHit(dim$StackFrame, context);
    }

    static /* synthetic */ boolean access$2900(Dim dim) {
        return dim.breakFlag;
    }

    static /* synthetic */ void access$3000(Dim dim, Context context, Throwable throwable, Dim$StackFrame dim$StackFrame) {
        dim.handleExceptionThrown(context, throwable, dim$StackFrame);
    }

    static /* synthetic */ boolean access$3100(Dim dim) {
        return dim.breakOnReturn;
    }

    private static void collectFunctions_r(DebuggableScript debuggableScript, ObjArray objArray) {
        objArray.add(debuggableScript);
        for (int i2 = 0; i2 != debuggableScript.getFunctionCount(); ++i2) {
            Dim.collectFunctions_r(debuggableScript.getFunction(i2), objArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String do_eval(Context object, Dim$StackFrame object2, String string) {
        Throwable throwable2;
        int n2;
        Object object3;
        Debugger debugger;
        block6: {
            block5: {
                String string2 = "";
                debugger = ((Context)object).getDebugger();
                object3 = ((Context)object).getDebuggerContextData();
                n2 = ((Context)object).getOptimizationLevel();
                ((Context)object).setDebugger(null, null);
                ((Context)object).setOptimizationLevel(-1);
                ((Context)object).setGeneratingDebug(false);
                try {
                    try {
                        object2 = ((Callable)((Object)((Context)object).compileString(string, "", 0, null))).call((Context)object, Dim$StackFrame.access$1600((Dim$StackFrame)object2), Dim$StackFrame.access$1700((Dim$StackFrame)object2), ScriptRuntime.emptyArgs);
                        if (object2 == Undefined.instance) {
                            object2 = string2;
                            break block5;
                        }
                        object2 = ScriptRuntime.toString(object2);
                    }
                    catch (Exception exception) {
                        object2 = exception.getMessage();
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            ((Context)object).setGeneratingDebug(true);
            ((Context)object).setOptimizationLevel(n2);
            ((Context)object).setDebugger(debugger, object3);
            object = object2;
            if (object2 != null) return object;
            return "null";
        }
        ((Context)object).setGeneratingDebug(true);
        ((Context)object).setOptimizationLevel(n2);
        ((Context)object).setDebugger(debugger, object3);
        throw throwable2;
    }

    private Dim$FunctionSource functionSource(DebuggableScript debuggableScript) {
        return this.functionToSource.get(debuggableScript);
    }

    private static DebuggableScript[] getAllFunctions(DebuggableScript objectArray) {
        ObjArray objArray = new ObjArray();
        Dim.collectFunctions_r((DebuggableScript)objectArray, objArray);
        objectArray = new DebuggableScript[objArray.size()];
        objArray.toArray(objectArray);
        return objectArray;
    }

    private Dim$FunctionSource getFunctionSource(DebuggableScript debuggableScript) {
        Object object;
        Object object2 = object = this.functionSource(debuggableScript);
        if (object == null) {
            String string = this.getNormalizedUrl(debuggableScript);
            object2 = object;
            if (this.sourceInfo(string) == null) {
                object2 = object;
                if (!debuggableScript.isGeneratedScript()) {
                    string = this.loadSource(string);
                    object2 = object;
                    if (string != null) {
                        object2 = debuggableScript;
                        while (true) {
                            if ((object = object2.getParent()) == null) {
                                this.registerTopScript((DebuggableScript)object2, string);
                                object2 = this.functionSource(debuggableScript);
                                break;
                            }
                            object2 = object;
                        }
                    }
                }
            }
        }
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String getNormalizedUrl(DebuggableScript object) {
        String string = object.getSourceName();
        if (string == null) {
            return "<stdin>";
        }
        int n2 = string.length();
        StringBuilder stringBuilder = null;
        int n3 = 0;
        while (true) {
            int n4;
            block10: {
                block9: {
                    int n5;
                    char c2;
                    int n6;
                    if ((n4 = string.indexOf(35, n3)) < 0) break block9;
                    for (n6 = n5 = n4 + 1; n6 != n2 && '0' <= (c2 = string.charAt(n6)) && c2 <= '9'; ++n6) {
                    }
                    object = "(eval)";
                    if (n6 != n5 && "(eval)".regionMatches(0, string, n6, 6)) {
                        n3 = n6 + 6;
                    } else {
                        object = null;
                    }
                    if (object != null) break block10;
                }
                object = string;
                if (stringBuilder == null) return object;
                if (n3 == n2) return stringBuilder.toString();
                stringBuilder.append(string.substring(n3));
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder2 = stringBuilder;
            if (stringBuilder == null) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string.substring(0, n4));
            }
            stringBuilder2.append((String)object);
            stringBuilder = stringBuilder2;
        }
    }

    private Object[] getObjectIdsImpl(Context objectArray, Object objectArray2) {
        if (objectArray2 instanceof Scriptable && objectArray2 != Undefined.instance) {
            objectArray = (objectArray2 = (Scriptable)objectArray2) instanceof DebuggableObject ? ((DebuggableObject)objectArray2).getAllIds() : objectArray2.getIds();
            Scriptable scriptable = objectArray2.getPrototype();
            Scriptable scriptable2 = objectArray2.getParentScope();
            int n2 = 1;
            int n3 = scriptable != null ? 1 : 0;
            int n4 = n3;
            if (scriptable2 != null) {
                n4 = n3 + 1;
            }
            objectArray2 = objectArray;
            if (n4 != 0) {
                objectArray2 = new Object[objectArray.length + n4];
                System.arraycopy(objectArray, 0, objectArray2, n4, objectArray.length);
                if (scriptable != null) {
                    objectArray2[0] = "__proto__";
                    n3 = n2;
                } else {
                    n3 = 0;
                }
                if (scriptable2 != null) {
                    objectArray2[n3] = "__parent__";
                }
            }
            return objectArray2;
        }
        return Context.emptyArgs;
    }

    private Object getObjectPropertyImpl(Context object, Object object2, Object object3) {
        block3: {
            block6: {
                block2: {
                    block5: {
                        block4: {
                            object = (Scriptable)object2;
                            if (!(object3 instanceof String)) break block2;
                            object2 = (String)object3;
                            if (((String)object2).equals("this")) break block3;
                            if (!((String)object2).equals("__proto__")) break block4;
                            object = object.getPrototype();
                            break block3;
                        }
                        if (!((String)object2).equals("__parent__")) break block5;
                        object = object.getParentScope();
                        break block3;
                    }
                    object = object2 = ScriptableObject.getProperty((Scriptable)object, (String)object2);
                    if (object2 != Scriptable.NOT_FOUND) break block3;
                    break block6;
                }
                object = object2 = ScriptableObject.getProperty((Scriptable)object, (Integer)object3);
                if (object2 != Scriptable.NOT_FOUND) break block3;
            }
            object = Undefined.instance;
        }
        return object;
    }

    private void handleBreakpointHit(Dim$StackFrame dim$StackFrame, Context context) {
        this.breakFlag = false;
        this.interrupted(context, dim$StackFrame, null);
    }

    private void handleExceptionThrown(Context context, Throwable throwable, Dim$StackFrame dim$StackFrame) {
        Dim$ContextData dim$ContextData;
        if (this.breakOnExceptions && Dim$ContextData.access$300(dim$ContextData = dim$StackFrame.contextData()) != throwable) {
            this.interrupted(context, dim$StackFrame, throwable);
            Dim$ContextData.access$302(dim$ContextData, throwable);
        }
    }

    /*
     * Exception decompiling
     */
    private void interrupted(Context var1_1, Dim$StackFrame var2_7, Throwable var3_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 14[TRYBLOCK] [19 : 292->298)] java.lang.Throwable
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

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String loadSource(String object) {
        Object object2;
        Object object3;
        Object object4;
        InputStreamReader inputStreamReader;
        Object object5;
        block16: {
            int n2 = ((String)object).indexOf(35);
            object5 = object;
            if (n2 >= 0) {
                object5 = ((String)object).substring(0, n2);
            }
            inputStreamReader = null;
            object4 = inputStreamReader;
            object3 = object5;
            n2 = ((String)object5).indexOf(58);
            object = object5;
            if (n2 < 0) {
                block17: {
                    object4 = inputStreamReader;
                    object3 = object5;
                    try {
                        if (((String)object5).startsWith("~/")) {
                            object4 = inputStreamReader;
                            object3 = object5;
                            String string = SecurityUtilities.getSystemProperty("user.home");
                            if (string != null) {
                                object4 = inputStreamReader;
                                object3 = object5;
                                String string2 = ((String)object5).substring(2);
                                object4 = inputStreamReader;
                                object3 = object5;
                                object4 = inputStreamReader;
                                object3 = object5;
                                object4 = inputStreamReader;
                                object3 = object5;
                                object = new File(string);
                                object4 = inputStreamReader;
                                object3 = object5;
                                object2 = new File((File)object, string2);
                                object4 = inputStreamReader;
                                object3 = object5;
                                if (((File)object2).exists()) {
                                    object4 = inputStreamReader;
                                    object3 = object5;
                                    object4 = inputStreamReader;
                                    object3 = object5;
                                    object = new FileInputStream((File)object2);
                                    break block16;
                                }
                            }
                        }
                        object4 = inputStreamReader;
                        object3 = object5;
                        object4 = inputStreamReader;
                        object3 = object5;
                        object = new File((String)object5);
                        object4 = inputStreamReader;
                        object3 = object5;
                        if (!((File)object).exists()) break block17;
                        object4 = inputStreamReader;
                        object3 = object5;
                        object = new FileInputStream((File)object);
                        break block16;
                    }
                    catch (SecurityException securityException) {}
                }
                object4 = inputStreamReader;
                object3 = object5;
                if (((String)object5).startsWith("//")) {
                    object4 = inputStreamReader;
                    object3 = object5;
                    object4 = inputStreamReader;
                    object3 = object5;
                    object = new StringBuilder();
                    object4 = inputStreamReader;
                    object3 = object5;
                    ((StringBuilder)object).append("http:");
                    object4 = inputStreamReader;
                    object3 = object5;
                    ((StringBuilder)object).append((String)object5);
                } else {
                    object4 = inputStreamReader;
                    object3 = object5;
                    if (((String)object5).startsWith("/")) {
                        object4 = inputStreamReader;
                        object3 = object5;
                        object4 = inputStreamReader;
                        object3 = object5;
                        object = new StringBuilder();
                        object4 = inputStreamReader;
                        object3 = object5;
                        ((StringBuilder)object).append("http://127.0.0.1");
                        object4 = inputStreamReader;
                        object3 = object5;
                        ((StringBuilder)object).append((String)object5);
                    } else {
                        object4 = inputStreamReader;
                        object3 = object5;
                        object4 = inputStreamReader;
                        object3 = object5;
                        object = new StringBuilder();
                        object4 = inputStreamReader;
                        object3 = object5;
                        ((StringBuilder)object).append("http://");
                        object4 = inputStreamReader;
                        object3 = object5;
                        ((StringBuilder)object).append((String)object5);
                    }
                }
                object4 = inputStreamReader;
                object3 = object5;
                object = ((StringBuilder)object).toString();
            }
            object4 = inputStreamReader;
            object3 = object;
            object4 = inputStreamReader;
            object3 = object;
            object5 = new URL((String)object);
            object4 = inputStreamReader;
            object3 = object;
            object2 = ((URL)object5).openStream();
            object5 = object;
            object = object2;
        }
        object4 = new InputStreamReader((InputStream)object);
        object4 = object2 = Kit.readReader((Reader)object4);
        object3 = object5;
        {
            catch (Throwable throwable) {
                object4 = inputStreamReader;
                object3 = object5;
                ((InputStream)object).close();
                object4 = inputStreamReader;
                object3 = object5;
                throw throwable;
            }
        }
        try {
            ((InputStream)object).close();
            return object2;
        }
        catch (IOException iOException) {
            object2 = System.err;
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed to load source from ");
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(iOException);
            ((PrintStream)object2).println(((StringBuilder)object).toString());
        }
        return object4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void registerTopScript(DebuggableScript object, String map) {
        int n2;
        int n3;
        if (!object.isTopLevel()) {
            throw new IllegalArgumentException();
        }
        Object object2 = this.getNormalizedUrl((DebuggableScript)object);
        DebuggableScript[] debuggableScriptArray = Dim.getAllFunctions((DebuggableScript)object);
        SourceProvider sourceProvider = this.sourceProvider;
        Object object3 = map;
        if (sourceProvider != null) {
            object = sourceProvider.getSource((DebuggableScript)object);
            object3 = map;
            if (object != null) {
                object3 = object;
            }
        }
        object = new Dim$SourceInfo((String)object3, debuggableScriptArray, (String)object2, null);
        map = this.urlToSourceInfo;
        synchronized (map) {
            object3 = this.urlToSourceInfo.get(object2);
            if (object3 != null) {
                Dim$SourceInfo.access$200((Dim$SourceInfo)object, (Dim$SourceInfo)object3);
            }
            this.urlToSourceInfo.put((String)object2, (Dim$SourceInfo)object);
            n3 = 0;
            for (n2 = 0; n2 != ((Dim$SourceInfo)object).functionSourcesTop(); ++n2) {
                object2 = ((Dim$SourceInfo)object).functionSource(n2);
                object3 = ((Dim$FunctionSource)object2).name();
                if (((String)object3).length() == 0) continue;
                this.functionNames.put((String)object3, (Dim$FunctionSource)object2);
            }
        }
        map = this.functionToSource;
        synchronized (map) {
            n2 = n3;
            while (true) {
                if (n2 == debuggableScriptArray.length) {
                    // MONITOREXIT @DISABLED, blocks:[7, 9, 10] lbl34 : MonitorExitStatement: MONITOREXIT : var2_2
                    this.callback.updateSourceText((Dim$SourceInfo)object);
                    return;
                }
                object3 = ((Dim$SourceInfo)object).functionSource(n2);
                this.functionToSource.put(debuggableScriptArray[n2], (Dim$FunctionSource)object3);
                ++n2;
            }
        }
    }

    public void attachTo(ContextFactory contextFactory) {
        Dim$DimIProxy dim$DimIProxy;
        this.detach();
        this.contextFactory = contextFactory;
        this.listener = dim$DimIProxy = new Dim$DimIProxy(this, 1, null);
        contextFactory.addListener(dim$DimIProxy);
    }

    public void clearAllBreakpoints() {
        Iterator<Dim$SourceInfo> iterator = this.urlToSourceInfo.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().removeAllBreakpoints();
        }
    }

    public void compileScript(String string, String string2) {
        Dim$DimIProxy dim$DimIProxy = new Dim$DimIProxy(this, 2, null);
        Dim$DimIProxy.access$502(dim$DimIProxy, string);
        Dim$DimIProxy.access$602(dim$DimIProxy, string2);
        Dim$DimIProxy.access$700(dim$DimIProxy);
    }

    public void contextSwitch(int n2) {
        this.frameIndex = n2;
    }

    public Dim$ContextData currentContextData() {
        return this.interruptedContextData;
    }

    public void detach() {
        Dim$DimIProxy dim$DimIProxy = this.listener;
        if (dim$DimIProxy != null) {
            this.contextFactory.removeListener(dim$DimIProxy);
            this.contextFactory = null;
            this.listener = null;
        }
    }

    public void dispose() {
        this.detach();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String eval(String string) {
        String string2 = "undefined";
        if (string == null) {
            return "undefined";
        }
        Object object = this.currentContextData();
        if (object == null) return "undefined";
        if (this.frameIndex >= ((Dim$ContextData)object).frameCount()) {
            return "undefined";
        }
        Dim$StackFrame dim$StackFrame = ((Dim$ContextData)object).getFrame(this.frameIndex);
        if (Dim$ContextData.access$400((Dim$ContextData)object)) {
            return Dim.do_eval(Context.getCurrentContext(), dim$StackFrame, string);
        }
        object = this.monitor;
        synchronized (object) {
            if (!this.insideInterruptLoop) return string2;
            this.evalRequest = string;
            this.evalFrame = dim$StackFrame;
            this.monitor.notify();
            try {
                do {
                    this.monitor.wait();
                } while (this.evalRequest != null);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
            string2 = this.evalResult;
            return string2;
        }
    }

    public void evalScript(String string, String string2) {
        Dim$DimIProxy dim$DimIProxy = new Dim$DimIProxy(this, 3, null);
        Dim$DimIProxy.access$502(dim$DimIProxy, string);
        Dim$DimIProxy.access$602(dim$DimIProxy, string2);
        Dim$DimIProxy.access$700(dim$DimIProxy);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String[] functionNames() {
        Map<String, Dim$SourceInfo> map = this.urlToSourceInfo;
        synchronized (map) {
            return this.functionNames.keySet().toArray(new String[this.functionNames.size()]);
        }
    }

    public Dim$FunctionSource functionSourceByName(String string) {
        return this.functionNames.get(string);
    }

    public Object[] getObjectIds(Object object) {
        Dim$DimIProxy dim$DimIProxy = new Dim$DimIProxy(this, 7, null);
        Dim$DimIProxy.access$802(dim$DimIProxy, object);
        Dim$DimIProxy.access$700(dim$DimIProxy);
        return Dim$DimIProxy.access$1300(dim$DimIProxy);
    }

    public Object getObjectProperty(Object object, Object object2) {
        Dim$DimIProxy dim$DimIProxy = new Dim$DimIProxy(this, 6, null);
        Dim$DimIProxy.access$802(dim$DimIProxy, object);
        Dim$DimIProxy.access$1102(dim$DimIProxy, object2);
        Dim$DimIProxy.access$700(dim$DimIProxy);
        return Dim$DimIProxy.access$1200(dim$DimIProxy);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void go() {
        Object object = this.monitor;
        synchronized (object) {
            this.returnValue = 3;
            this.monitor.notifyAll();
            return;
        }
    }

    public String objectToString(Object object) {
        Dim$DimIProxy dim$DimIProxy = new Dim$DimIProxy(this, 5, null);
        Dim$DimIProxy.access$802(dim$DimIProxy, object);
        Dim$DimIProxy.access$700(dim$DimIProxy);
        return Dim$DimIProxy.access$900(dim$DimIProxy);
    }

    public void setBreak() {
        this.breakFlag = true;
    }

    public void setBreakOnEnter(boolean bl) {
        this.breakOnEnter = bl;
    }

    public void setBreakOnExceptions(boolean bl) {
        this.breakOnExceptions = bl;
    }

    public void setBreakOnReturn(boolean bl) {
        this.breakOnReturn = bl;
    }

    public void setGuiCallback(GuiCallback guiCallback) {
        this.callback = guiCallback;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setReturnValue(int n2) {
        Object object = this.monitor;
        synchronized (object) {
            this.returnValue = n2;
            this.monitor.notify();
            return;
        }
    }

    public void setScopeProvider(ScopeProvider scopeProvider) {
        this.scopeProvider = scopeProvider;
    }

    public void setSourceProvider(SourceProvider sourceProvider) {
        this.sourceProvider = sourceProvider;
    }

    public Dim$SourceInfo sourceInfo(String string) {
        return this.urlToSourceInfo.get(string);
    }

    public boolean stringIsCompilableUnit(String string) {
        Dim$DimIProxy dim$DimIProxy = new Dim$DimIProxy(this, 4, null);
        Dim$DimIProxy.access$602(dim$DimIProxy, string);
        Dim$DimIProxy.access$700(dim$DimIProxy);
        return Dim$DimIProxy.access$1000(dim$DimIProxy);
    }
}

