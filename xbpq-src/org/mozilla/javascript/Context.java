/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.h1.a;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.function.UnaryOperator;
import org.mozilla.classfile.ClassFileWriter$ClassFileFormatException;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.ClassShutter;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context$1;
import org.mozilla.javascript.Context$ClassShutterSetter;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ContextListener;
import org.mozilla.javascript.ContinuationPending;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.IRFactory;
import org.mozilla.javascript.ImplementationVersion;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.JavaToJSONConverters;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.RegExpProxy;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.UnhandledRejectionTracker;
import org.mozilla.javascript.VMBridge;
import org.mozilla.javascript.WrapFactory;
import org.mozilla.javascript.WrappedException;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.debug.DebuggableScript;
import org.mozilla.javascript.debug.Debugger;
import org.mozilla.javascript.xml.XMLLib;
import org.mozilla.javascript.xml.XMLLib$Factory;

public class Context
implements Closeable {
    public static final int FEATURE_DYNAMIC_SCOPE = 7;
    public static final int FEATURE_E4X = 6;
    public static final int FEATURE_ENABLE_JAVA_MAP_ACCESS = 21;
    public static final int FEATURE_ENABLE_XML_SECURE_PARSING = 20;
    public static final int FEATURE_ENHANCED_JAVA_ACCESS = 13;
    public static final int FEATURE_ENUMERATE_IDS_FIRST = 16;
    public static final int FEATURE_INTEGER_WITHOUT_DECIMAL_PLACE = 18;
    public static final int FEATURE_INTL_402 = 22;
    public static final int FEATURE_LITTLE_ENDIAN = 19;
    public static final int FEATURE_LOCATION_INFORMATION_IN_ERROR = 10;
    public static final int FEATURE_MEMBER_EXPR_AS_FUNCTION_NAME = 2;
    public static final int FEATURE_NON_ECMA_GET_YEAR = 1;
    public static final int FEATURE_OLD_UNDEF_NULL_THIS = 15;
    public static final int FEATURE_PARENT_PROTO_PROPERTIES = 5;
    @Deprecated
    public static final int FEATURE_PARENT_PROTO_PROPRTIES = 5;
    public static final int FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER = 3;
    public static final int FEATURE_STRICT_EVAL = 9;
    public static final int FEATURE_STRICT_MODE = 11;
    public static final int FEATURE_STRICT_VARS = 8;
    public static final int FEATURE_THREAD_SAFE_OBJECTS = 17;
    public static final int FEATURE_TO_STRING_AS_SOURCE = 4;
    public static final int FEATURE_V8_EXTENSIONS = 14;
    public static final int FEATURE_WARNING_AS_ERROR = 12;
    public static final int VERSION_1_0 = 100;
    public static final int VERSION_1_1 = 110;
    public static final int VERSION_1_2 = 120;
    public static final int VERSION_1_3 = 130;
    public static final int VERSION_1_4 = 140;
    public static final int VERSION_1_5 = 150;
    public static final int VERSION_1_6 = 160;
    public static final int VERSION_1_7 = 170;
    public static final int VERSION_1_8 = 180;
    public static final int VERSION_DEFAULT = 0;
    public static final int VERSION_ES6 = 200;
    public static final int VERSION_UNKNOWN = -1;
    private static Class<?> codegenClass;
    public static final Object[] emptyArgs;
    public static final String errorReporterProperty = "error reporter";
    private static Class<?> interpreterClass;
    public static final String languageVersionProperty = "language version";
    Set<String> activationNames;
    private ClassLoader applicationClassLoader;
    XMLLib cachedXMLLib;
    private ClassShutter classShutter;
    NativeCall currentActivationCall;
    Debugger debugger;
    private Object debuggerData;
    private int enterCount;
    private ErrorReporter errorReporter;
    private final ContextFactory factory;
    public boolean generateObserverCount;
    private boolean generatingDebug;
    private boolean generatingDebugChanged;
    private boolean generatingSource = true;
    private boolean hasClassShutter;
    int instructionCount;
    int instructionThreshold;
    Object interpreterSecurityDomain;
    boolean isContinuationsTopCall;
    boolean isTopLevelStrict;
    ObjToIntMap iterating;
    private UnaryOperator<Object> javaToJSONConverter;
    Object lastInterpreterFrame;
    private Locale locale;
    private int maximumInterpreterStackDepth;
    private final ArrayDeque<Runnable> microtasks = new ArrayDeque();
    private int optimizationLevel;
    ObjArray previousInterpreterInvocations;
    private Object propertyListeners;
    RegExpProxy regExpProxy;
    Scriptable scratchScriptable;
    long scratchUint32;
    private Object sealKey;
    private boolean sealed;
    private SecurityController securityController;
    private Map<Object, Object> threadLocalMap;
    private TimeZone timezone;
    Scriptable topCallScope;
    BaseFunction typeErrorThrower;
    private final UnhandledRejectionTracker unhandledPromises = new UnhandledRejectionTracker();
    boolean useDynamicScope;
    int version;
    private WrapFactory wrapFactory;

    static {
        emptyArgs = ScriptRuntime.emptyArgs;
        codegenClass = Kit.classOrNull("org.mozilla.javascript.optimizer.Codegen");
        interpreterClass = Kit.classOrNull("org.mozilla.javascript.Interpreter");
    }

    @Deprecated
    public Context() {
        this(ContextFactory.getGlobal());
    }

    protected Context(ContextFactory contextFactory) {
        int n2 = 0;
        this.generateObserverCount = false;
        if (contextFactory != null) {
            this.factory = contextFactory;
            this.version = 0;
            if (codegenClass == null) {
                n2 = -1;
            }
            this.optimizationLevel = n2;
            this.maximumInterpreterStackDepth = Integer.MAX_VALUE;
            return;
        }
        throw new IllegalArgumentException("factory == null");
    }

    public static /* synthetic */ Object a(Callable callable, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray, Context context) {
        return callable.call(context, scriptable, scriptable2, objectArray);
    }

    static /* synthetic */ ClassShutter access$000(Context context) {
        return context.classShutter;
    }

    static /* synthetic */ ClassShutter access$002(Context context, ClassShutter classShutter) {
        context.classShutter = classShutter;
        return classShutter;
    }

    @Deprecated
    public static void addContextListener(ContextListener contextListener) {
        if ("org.mozilla.javascript.tools.debugger.Main".equals(contextListener.getClass().getName())) {
            Class<?> clazz = contextListener.getClass();
            Class<?> clazz2 = Kit.classOrNull("org.mozilla.javascript.ContextFactory");
            ContextFactory contextFactory = ContextFactory.getGlobal();
            try {
                clazz.getMethod("attachTo", clazz2).invoke(contextListener, contextFactory);
                return;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
        ContextFactory.getGlobal().addListener(contextListener);
    }

    @Deprecated
    public static <T> T call(ContextAction<T> contextAction) {
        return Context.call(ContextFactory.getGlobal(), contextAction);
    }

    public static Object call(ContextFactory contextFactory, Callable callable, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        ContextFactory contextFactory2 = contextFactory;
        if (contextFactory == null) {
            contextFactory2 = ContextFactory.getGlobal();
        }
        return Context.call(contextFactory2, new a(callable, scriptable, scriptable2, objectArray));
    }

    static <T> T call(ContextFactory object, ContextAction<T> contextAction) {
        block7: {
            object = Context.enter(null, (ContextFactory)object);
            try {
                contextAction = contextAction.run((Context)object);
                if (object == null) break block7;
                ((Context)object).close();
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    if (object != null) {
                        try {
                            ((Context)object).close();
                        }
                        catch (Throwable throwable3) {
                            throwable.addSuppressed(throwable3);
                        }
                    }
                    throw throwable2;
                }
            }
        }
        return (T)contextAction;
    }

    public static void checkLanguageVersion(int n2) {
        if (Context.isValidLanguageVersion(n2)) {
            return;
        }
        throw new IllegalArgumentException(r.a("Bad language version: ", n2));
    }

    public static void checkOptimizationLevel(int n2) {
        if (Context.isValidOptimizationLevel(n2)) {
            return;
        }
        throw new IllegalArgumentException(r.a("Optimization level outside [-1..9]: ", n2));
    }

    private Evaluator createCompiler() {
        Object object;
        object = this.optimizationLevel >= 0 && (object = codegenClass) != null ? (Evaluator)Kit.newInstanceOrNull(object) : null;
        Object object2 = object;
        if (object == null) {
            object2 = Context.createInterpreter();
        }
        return object2;
    }

    static Evaluator createInterpreter() {
        return (Evaluator)Kit.newInstanceOrNull(interpreterClass);
    }

    public static Context enter() {
        return Context.enter(null, ContextFactory.getGlobal());
    }

    @Deprecated
    public static Context enter(Context context) {
        return Context.enter(context, ContextFactory.getGlobal());
    }

    static final Context enter(Context context, ContextFactory contextFactory) {
        block11: {
            block7: {
                Object object;
                VMBridge vMBridge;
                block10: {
                    block8: {
                        block9: {
                            Context context2;
                            block6: {
                                vMBridge = VMBridge.instance;
                                object = vMBridge.getThreadContextHelper();
                                context2 = vMBridge.getContext(object);
                                if (context2 == null) break block6;
                                context = context2;
                                break block7;
                            }
                            if (context != null) break block8;
                            context2 = contextFactory.makeContext();
                            if (context2.enterCount != 0) break block9;
                            contextFactory.onContextCreated(context2);
                            context = context2;
                            if (contextFactory.isSealed()) {
                                context = context2;
                                if (!context2.isSealed()) {
                                    context2.seal(null);
                                    context = context2;
                                }
                            }
                            break block10;
                        }
                        throw new IllegalStateException("factory.makeContext() returned Context instance already associated with some thread");
                    }
                    if (context.enterCount != 0) break block11;
                }
                vMBridge.setContext(object, context);
            }
            ++context.enterCount;
            return context;
        }
        throw new IllegalStateException("can not use Context instance already associated with some thread");
    }

    public static void exit() {
        VMBridge vMBridge = VMBridge.instance;
        Object object = vMBridge.getThreadContextHelper();
        Context context = vMBridge.getContext(object);
        if (context != null) {
            int n2;
            if (context.enterCount < 1) {
                Kit.codeBug();
            }
            context.enterCount = n2 = context.enterCount - 1;
            if (n2 == 0) {
                vMBridge.setContext(object, null);
                context.factory.onContextReleased(context);
            }
            return;
        }
        throw new IllegalStateException("Calling Context.exit without previous Context.enter");
    }

    private void firePropertyChangeImpl(Object object, String string, Object object2, Object object3) {
        int n2 = 0;
        Object object4;
        while ((object4 = Kit.getListener(object, n2)) != null) {
            if (object4 instanceof PropertyChangeListener) {
                ((PropertyChangeListener)object4).propertyChange(new PropertyChangeEvent(this, string, object2, object3));
            }
            ++n2;
        }
        return;
    }

    static Context getContext() {
        Context context = Context.getCurrentContext();
        if (context != null) {
            return context;
        }
        throw new RuntimeException("No Context associated with current Thread");
    }

    public static Context getCurrentContext() {
        VMBridge vMBridge = VMBridge.instance;
        return vMBridge.getContext(vMBridge.getThreadContextHelper());
    }

    public static DebuggableScript getDebuggableView(Script script) {
        if (script instanceof NativeFunction) {
            return ((NativeFunction)((Object)script)).getDebuggableView();
        }
        return null;
    }

    static String getSourcePositionFromStack(int[] nArray) {
        Object object;
        Context object22 = Context.getCurrentContext();
        if (object22 == null) {
            return null;
        }
        if (object22.lastInterpreterFrame != null && (object = Context.createInterpreter()) != null) {
            return object.getSourcePositionFromStack(object22, nArray);
        }
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            int n2;
            object = stackTraceElement.getFileName();
            if (object == null || ((String)object).endsWith(".java") || (n2 = stackTraceElement.getLineNumber()) < 0) continue;
            nArray[0] = n2;
            return object;
        }
        return null;
    }

    public static Object getUndefinedValue() {
        return Undefined.instance;
    }

    public static boolean isCurrentContextStrict() {
        Context context = Context.getCurrentContext();
        if (context == null) {
            return false;
        }
        return context.isStrictMode();
    }

    public static boolean isValidLanguageVersion(int n2) {
        switch (n2) {
            default: {
                return false;
            }
            case 0: 
            case 100: 
            case 110: 
            case 120: 
            case 130: 
            case 140: 
            case 150: 
            case 160: 
            case 170: 
            case 180: 
            case 200: 
        }
        return true;
    }

    public static boolean isValidOptimizationLevel(int n2) {
        boolean bl = -1 <= n2 && n2 <= 9;
        return bl;
    }

    public static Object javaToJS(Object object, Scriptable scriptable) {
        return Context.javaToJS(object, scriptable, null);
    }

    public static Object javaToJS(Object object, Scriptable scriptable, Context context) {
        Object object2 = object;
        if (!(object instanceof String)) {
            object2 = object;
            if (!(object instanceof Number)) {
                object2 = object;
                if (!(object instanceof Boolean)) {
                    if (object instanceof Scriptable) {
                        object2 = object;
                    } else {
                        if (object instanceof Character) {
                            return String.valueOf(((Character)object).charValue());
                        }
                        object2 = context;
                        if (context == null) {
                            object2 = Context.getContext();
                        }
                        object2 = ((Context)object2).getWrapFactory().wrap((Context)object2, scriptable, object, null);
                    }
                }
            }
        }
        return object2;
    }

    public static Object jsToJava(Object object, Class<?> clazz) {
        return NativeJavaObject.coerceTypeImpl(clazz, object);
    }

    private static void notifyDebugger_r(Context context, DebuggableScript debuggableScript, String string) {
        context.debugger.handleCompilationDone(context, debuggableScript, string);
        for (int i2 = 0; i2 != debuggableScript.getFunctionCount(); ++i2) {
            Context.notifyDebugger_r(context, debuggableScript.getFunction(i2), string);
        }
    }

    static void onSealedMutation() {
        throw new IllegalStateException();
    }

    private ScriptNode parse(String string, String object, int n2, CompilerEnvirons compilerEnvirons, ErrorReporter errorReporter, boolean bl) {
        Parser parser = new Parser(compilerEnvirons, errorReporter);
        if (bl) {
            parser.calledByCompileFunction = true;
        }
        if (this.isStrictMode()) {
            parser.setDefaultUseStrictDirective(true);
        }
        object = parser.parse(string, (String)object, n2);
        if (bl && (((Node)object).getFirstChild() == null || ((Node)object).getFirstChild().getType() != 113)) {
            throw new IllegalArgumentException(e.c("compileFunction only accepts source with single JS function: ", string));
        }
        return new IRFactory(compilerEnvirons, errorReporter).transformTree((AstRoot)object);
    }

    @Deprecated
    public static void removeContextListener(ContextListener contextListener) {
        ContextFactory.getGlobal().addListener(contextListener);
    }

    public static void reportError(String string) {
        int[] nArray = new int[]{0};
        Context.reportError(string, Context.getSourcePositionFromStack(nArray), nArray[0], null, 0);
    }

    public static void reportError(String string, String string2, int n2, String string3, int n3) {
        Context context = Context.getCurrentContext();
        if (context != null) {
            context.getErrorReporter().error(string, string2, n2, string3, n3);
            return;
        }
        throw new EvaluatorException(string, string2, n2, string3, n3);
    }

    public static EvaluatorException reportRuntimeError(String string) {
        int[] nArray = new int[]{0};
        return Context.reportRuntimeError(string, Context.getSourcePositionFromStack(nArray), nArray[0], null, 0);
    }

    public static EvaluatorException reportRuntimeError(String string, String string2, int n2, String string3, int n3) {
        Context context = Context.getCurrentContext();
        if (context != null) {
            return context.getErrorReporter().runtimeError(string, string2, n2, string3, n3);
        }
        throw new EvaluatorException(string, string2, n2, string3, n3);
    }

    @Deprecated
    static EvaluatorException reportRuntimeError0(String string) {
        return Context.reportRuntimeError(ScriptRuntime.getMessageById(string, new Object[0]));
    }

    @Deprecated
    static EvaluatorException reportRuntimeError1(String string, Object object) {
        return Context.reportRuntimeError(ScriptRuntime.getMessageById(string, object));
    }

    @Deprecated
    static EvaluatorException reportRuntimeError2(String string, Object object, Object object2) {
        return Context.reportRuntimeError(ScriptRuntime.getMessageById(string, object, object2));
    }

    @Deprecated
    static EvaluatorException reportRuntimeError3(String string, Object object, Object object2, Object object3) {
        return Context.reportRuntimeError(ScriptRuntime.getMessageById(string, object, object2, object3));
    }

    @Deprecated
    static EvaluatorException reportRuntimeError4(String string, Object object, Object object2, Object object3, Object object4) {
        return Context.reportRuntimeError(ScriptRuntime.getMessageById(string, object, object2, object3, object4));
    }

    static EvaluatorException reportRuntimeErrorById(String string, Object ... objectArray) {
        return Context.reportRuntimeError(ScriptRuntime.getMessageById(string, objectArray));
    }

    public static void reportWarning(String string) {
        int[] nArray = new int[]{0};
        Context.reportWarning(string, Context.getSourcePositionFromStack(nArray), nArray[0], null, 0);
    }

    public static void reportWarning(String string, String string2, int n2, String string3, int n3) {
        Context context = Context.getContext();
        if (context.hasFeature(12)) {
            Context.reportError(string, string2, n2, string3, n3);
        } else {
            context.getErrorReporter().warning(string, string2, n2, string3, n3);
        }
    }

    public static void reportWarning(String string, Throwable throwable) {
        int[] nArray = new int[]{0};
        String string2 = Context.getSourcePositionFromStack(nArray);
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println(string);
        throwable.printStackTrace(printWriter);
        printWriter.flush();
        Context.reportWarning(((Object)stringWriter).toString(), string2, nArray[0], null, 0);
    }

    @Deprecated
    public static void setCachingEnabled(boolean bl) {
    }

    public static RuntimeException throwAsScriptRuntimeEx(Throwable throwable) {
        Context context;
        while (throwable instanceof InvocationTargetException) {
            throwable = ((InvocationTargetException)throwable).getTargetException();
        }
        if (throwable instanceof Error && ((context = Context.getContext()) == null || !context.hasFeature(13))) {
            throw (Error)throwable;
        }
        if (throwable instanceof RhinoException) {
            throw (RhinoException)throwable;
        }
        throw new WrappedException(throwable);
    }

    public static boolean toBoolean(Object object) {
        return ScriptRuntime.toBoolean(object);
    }

    public static double toNumber(Object object) {
        return ScriptRuntime.toNumber(object);
    }

    public static Scriptable toObject(Object object, Scriptable scriptable) {
        return ScriptRuntime.toObject(scriptable, object);
    }

    @Deprecated
    public static Scriptable toObject(Object object, Scriptable scriptable, Class<?> clazz) {
        return ScriptRuntime.toObject(scriptable, object);
    }

    public static String toString(Object object) {
        return ScriptRuntime.toString(object);
    }

    @Deprecated
    public static Object toType(Object object, Class<?> clazz) {
        try {
            object = Context.jsToJava(object, clazz);
            return object;
        }
        catch (EvaluatorException evaluatorException) {
            throw new IllegalArgumentException(evaluatorException.getMessage(), evaluatorException);
        }
    }

    public void addActivationName(String string) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if (this.activationNames == null) {
            this.activationNames = new HashSet<String>();
        }
        this.activationNames.add(string);
    }

    public final void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        this.propertyListeners = Kit.addListener(this.propertyListeners, propertyChangeListener);
    }

    public Object callFunctionWithContinuations(Callable callable, Scriptable scriptable, Object[] objectArray) {
        if (callable instanceof InterpretedFunction) {
            if (!ScriptRuntime.hasTopCall(this)) {
                this.isContinuationsTopCall = true;
                return ScriptRuntime.doTopCall(callable, this, scriptable, scriptable, objectArray, this.isTopLevelStrict);
            }
            throw new IllegalStateException("Cannot have any pending top calls when executing a script with continuations");
        }
        throw new IllegalArgumentException("Function argument was not created by interpreted mode ");
    }

    public ContinuationPending captureContinuation() {
        return new ContinuationPending(Interpreter.captureContinuation(this));
    }

    @Override
    public void close() {
        int n2;
        if (this.enterCount < 1) {
            Kit.codeBug();
        }
        this.enterCount = n2 = this.enterCount - 1;
        if (n2 == 0) {
            VMBridge vMBridge = VMBridge.instance;
            vMBridge.setContext(vMBridge.getThreadContextHelper(), null);
            this.factory.onContextReleased(this);
        }
    }

    public final Function compileFunction(Scriptable scriptable, String string, String string2, int n2, Object object) {
        return this.compileFunction(scriptable, string, null, null, string2, n2, object);
    }

    final Function compileFunction(Scriptable scriptable, String string, Evaluator evaluator, ErrorReporter errorReporter, String string2, int n2, Object object) {
        try {
            scriptable = (Function)this.compileImpl(scriptable, string, string2, n2, object, true, evaluator, errorReporter);
            return scriptable;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    protected Object compileImpl(Scriptable object, String string, String object2, int n2, Object object3, boolean bl, Evaluator object4, ErrorReporter errorReporter) {
        Object object5 = object2 == null ? "unnamed script" : object2;
        if (object3 != null && this.getSecurityController() == null) {
            throw new IllegalArgumentException("securityDomain should be null if setSecurityController() was never called");
        }
        boolean bl2 = object == null;
        if (!(bl2 ^ bl)) {
            Kit.codeBug();
        }
        CompilerEnvirons compilerEnvirons = new CompilerEnvirons();
        compilerEnvirons.initFromContext(this);
        if (errorReporter == null) {
            errorReporter = compilerEnvirons.getErrorReporter();
        }
        ScriptNode scriptNode = this.parse(string, (String)object5, n2, compilerEnvirons, errorReporter, bl);
        if (object4 == null) {
            object2 = this.createCompiler();
        } else {
            object2 = object4;
        }
        try {
            object4 = object2.compile(compilerEnvirons, scriptNode, scriptNode.getEncodedSource(), bl);
        }
        catch (ClassFileWriter$ClassFileFormatException classFileWriter$ClassFileFormatException) {
            object4 = this.parse(string, (String)object5, n2, compilerEnvirons, errorReporter, bl);
            object2 = Context.createInterpreter();
            object4 = object2.compile(compilerEnvirons, (ScriptNode)object4, ((ScriptNode)object4).getEncodedSource(), bl);
        }
        if (this.debugger != null) {
            if (string == null) {
                Kit.codeBug();
            }
            if (object4 instanceof DebuggableScript) {
                Context.notifyDebugger_r(this, (DebuggableScript)object4, string);
            } else {
                throw new RuntimeException("NOT SUPPORTED");
            }
        }
        object = bl ? object2.createFunctionObject(this, (Scriptable)object, object4, object3) : object2.createScriptObject(object4, object3);
        return object;
    }

    public final Script compileReader(Reader reader, String string, int n2, Object object) {
        block0: {
            if (n2 >= 0) break block0;
            n2 = 0;
        }
        return (Script)this.compileImpl(null, Kit.readReader(reader), string, n2, object, false, null, null);
    }

    @Deprecated
    public final Script compileReader(Scriptable scriptable, Reader reader, String string, int n2, Object object) {
        return this.compileReader(reader, string, n2, object);
    }

    public final Script compileString(String string, String string2, int n2, Object object) {
        block0: {
            if (n2 >= 0) break block0;
            n2 = 0;
        }
        return this.compileString(string, null, null, string2, n2, object);
    }

    final Script compileString(String object, Evaluator evaluator, ErrorReporter errorReporter, String string, int n2, Object object2) {
        try {
            object = (Script)this.compileImpl(null, (String)object, string, n2, object2, false, evaluator, errorReporter);
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public GeneratedClassLoader createClassLoader(ClassLoader classLoader) {
        return this.getFactory().createClassLoader(classLoader);
    }

    public final String decompileFunction(Function function, int n2) {
        if (function instanceof BaseFunction) {
            return ((BaseFunction)function).decompile(n2, 0);
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("function ");
        stringBuilder.append(function.getClassName());
        stringBuilder.append("() {\n\t[native code]\n}\n");
        return stringBuilder.toString();
    }

    public final String decompileFunctionBody(Function function, int n2) {
        if (function instanceof BaseFunction) {
            return ((BaseFunction)function).decompile(n2, 1);
        }
        return "[native code]\n";
    }

    public final String decompileScript(Script script, int n2) {
        return ((NativeFunction)((Object)script)).decompile(n2, 0);
    }

    public void enqueueMicrotask(Runnable runnable) {
        this.microtasks.add(runnable);
    }

    public final Object evaluateReader(Scriptable scriptable, Reader object, String string, int n2, Object object2) {
        if ((object = this.compileReader((Reader)object, string, n2, object2)) != null) {
            return object.exec(this, scriptable);
        }
        return null;
    }

    public final Object evaluateString(Scriptable scriptable, String object, String string, int n2, Object object2) {
        if ((object = this.compileString((String)object, string, n2, object2)) != null) {
            return object.exec(this, scriptable);
        }
        return null;
    }

    public Object executeScriptWithContinuations(Script script, Scriptable scriptable) {
        if (script instanceof InterpretedFunction && ((InterpretedFunction)(script = (InterpretedFunction)script)).isScript()) {
            return this.callFunctionWithContinuations((Callable)((Object)script), scriptable, ScriptRuntime.emptyArgs);
        }
        throw new IllegalArgumentException("Script argument was not a script or was not created by interpreted mode ");
    }

    final void firePropertyChange(String string, Object object, Object object2) {
        Object object3 = this.propertyListeners;
        if (object3 != null) {
            this.firePropertyChangeImpl(object3, string, object, object2);
        }
    }

    public final ClassLoader getApplicationClassLoader() {
        if (this.applicationClassLoader == null) {
            ContextFactory contextFactory = this.getFactory();
            ClassLoader classLoader = contextFactory.getApplicationClassLoader();
            Class<?> clazz = classLoader;
            if (classLoader == null) {
                clazz = Thread.currentThread().getContextClassLoader();
                if (clazz != null && Kit.testIfCanLoadRhinoClasses((ClassLoader)((Object)clazz))) {
                    return clazz;
                }
                clazz = contextFactory.getClass();
                if (clazz == ScriptRuntime.ContextFactoryClass) {
                    clazz = this.getClass();
                }
                clazz = clazz.getClassLoader();
            }
            this.applicationClassLoader = clazz;
        }
        return this.applicationClassLoader;
    }

    final ClassShutter getClassShutter() {
        synchronized (this) {
            ClassShutter classShutter = this.classShutter;
            return classShutter;
        }
    }

    public final Context$ClassShutterSetter getClassShutterSetter() {
        synchronized (this) {
            block4: {
                boolean bl = this.hasClassShutter;
                if (!bl) break block4;
                return null;
            }
            this.hasClassShutter = true;
            Context$1 context$1 = new Context$1(this);
            return context$1;
        }
    }

    public final Debugger getDebugger() {
        return this.debugger;
    }

    public final Object getDebuggerContextData() {
        return this.debuggerData;
    }

    public XMLLib.Factory getE4xImplementationFactory() {
        return this.getFactory().getE4xImplementationFactory();
    }

    public final Object[] getElements(Scriptable scriptable) {
        return ScriptRuntime.getArrayElements(scriptable);
    }

    public final ErrorReporter getErrorReporter() {
        ErrorReporter errorReporter;
        ErrorReporter errorReporter2 = errorReporter = this.errorReporter;
        if (errorReporter == null) {
            errorReporter2 = DefaultErrorReporter.instance;
        }
        return errorReporter2;
    }

    public final ContextFactory getFactory() {
        return this.factory;
    }

    public final String getImplementationVersion() {
        return ImplementationVersion.get();
    }

    public final int getInstructionObserverThreshold() {
        return this.instructionThreshold;
    }

    public UnaryOperator<Object> getJavaToJSONConverter() {
        UnaryOperator<Object> unaryOperator;
        UnaryOperator<Object> unaryOperator2 = unaryOperator = this.javaToJSONConverter;
        if (unaryOperator == null) {
            unaryOperator2 = JavaToJSONConverters.STRING;
        }
        return unaryOperator2;
    }

    public final int getLanguageVersion() {
        return this.version;
    }

    public final Locale getLocale() {
        if (this.locale == null) {
            this.locale = Locale.getDefault();
        }
        return this.locale;
    }

    public final int getMaximumInterpreterStackDepth() {
        return this.maximumInterpreterStackDepth;
    }

    public final int getOptimizationLevel() {
        return this.optimizationLevel;
    }

    RegExpProxy getRegExpProxy() {
        Class<?> clazz;
        if (this.regExpProxy == null && (clazz = Kit.classOrNull("org.mozilla.javascript.regexp.RegExpImpl")) != null) {
            this.regExpProxy = (RegExpProxy)Kit.newInstanceOrNull(clazz);
        }
        return this.regExpProxy;
    }

    SecurityController getSecurityController() {
        SecurityController securityController = SecurityController.global();
        if (securityController != null) {
            return securityController;
        }
        return this.securityController;
    }

    public final Object getThreadLocal(Object object) {
        Map<Object, Object> map = this.threadLocalMap;
        if (map == null) {
            return null;
        }
        return map.get(object);
    }

    public final TimeZone getTimeZone() {
        if (this.timezone == null) {
            this.timezone = TimeZone.getDefault();
        }
        return this.timezone;
    }

    public UnhandledRejectionTracker getUnhandledPromiseTracker() {
        return this.unhandledPromises;
    }

    public final WrapFactory getWrapFactory() {
        if (this.wrapFactory == null) {
            this.wrapFactory = new WrapFactory();
        }
        return this.wrapFactory;
    }

    public boolean hasFeature(int n2) {
        return this.getFactory().hasFeature(this, n2);
    }

    public final Scriptable initSafeStandardObjects(ScriptableObject scriptableObject) {
        return this.initSafeStandardObjects(scriptableObject, false);
    }

    public final ScriptableObject initSafeStandardObjects() {
        return this.initSafeStandardObjects(null, false);
    }

    public ScriptableObject initSafeStandardObjects(ScriptableObject scriptableObject, boolean bl) {
        return ScriptRuntime.initSafeStandardObjects(this, scriptableObject, bl);
    }

    public final Scriptable initStandardObjects(ScriptableObject scriptableObject) {
        return this.initStandardObjects(scriptableObject, false);
    }

    public final ScriptableObject initStandardObjects() {
        return this.initStandardObjects(null, false);
    }

    public ScriptableObject initStandardObjects(ScriptableObject scriptableObject, boolean bl) {
        return ScriptRuntime.initStandardObjects(this, scriptableObject, bl);
    }

    public final boolean isActivationNeeded(String string) {
        Set<String> set = this.activationNames;
        boolean bl = set != null && set.contains(string);
        return bl;
    }

    public final boolean isGeneratingDebug() {
        return this.generatingDebug;
    }

    public final boolean isGeneratingDebugChanged() {
        return this.generatingDebugChanged;
    }

    public final boolean isGeneratingSource() {
        return this.generatingSource;
    }

    public final boolean isSealed() {
        return this.sealed;
    }

    public final boolean isStrictMode() {
        NativeCall nativeCall;
        boolean bl = this.isTopLevelStrict || (nativeCall = this.currentActivationCall) != null && nativeCall.isStrict;
        return bl;
    }

    final boolean isVersionECMA1() {
        int n2 = this.version;
        boolean bl = n2 == 0 || n2 >= 130;
        return bl;
    }

    public Scriptable newArray(Scriptable scriptable, int n2) {
        NativeArray nativeArray = new NativeArray(n2);
        ScriptRuntime.setBuiltinProtoAndParent(nativeArray, scriptable, TopLevel$Builtins.Array);
        return nativeArray;
    }

    public Scriptable newArray(Scriptable scriptable, Object[] object) {
        if (object.getClass().getComponentType() == ScriptRuntime.ObjectClass) {
            object = new NativeArray((Object[])object);
            ScriptRuntime.setBuiltinProtoAndParent((ScriptableObject)object, scriptable, TopLevel$Builtins.Array);
            return object;
        }
        throw new IllegalArgumentException();
    }

    public Scriptable newObject(Scriptable scriptable) {
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, scriptable, TopLevel$Builtins.Object);
        return nativeObject;
    }

    public Scriptable newObject(Scriptable scriptable, String string) {
        return this.newObject(scriptable, string, ScriptRuntime.emptyArgs);
    }

    public Scriptable newObject(Scriptable scriptable, String string, Object[] objectArray) {
        return ScriptRuntime.newObject(this, scriptable, string, objectArray);
    }

    protected void observeInstructionCount(int n2) {
        this.getFactory().observeInstructionCount(this, n2);
    }

    public void processMicrotasks() {
        Runnable runnable;
        do {
            if ((runnable = this.microtasks.poll()) == null) continue;
            runnable.run();
        } while (runnable != null);
    }

    public final void putThreadLocal(Object object, Object object2) {
        synchronized (this) {
            if (this.sealed) {
                Context.onSealedMutation();
            }
            if (this.threadLocalMap == null) {
                HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                this.threadLocalMap = hashMap;
            }
            this.threadLocalMap.put(object, object2);
            return;
        }
    }

    public void removeActivationName(String string) {
        Set<String> set;
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if ((set = this.activationNames) != null) {
            set.remove(string);
        }
    }

    public final void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        this.propertyListeners = Kit.removeListener(this.propertyListeners, propertyChangeListener);
    }

    public final void removeThreadLocal(Object object) {
        Map<Object, Object> map;
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if ((map = this.threadLocalMap) == null) {
            return;
        }
        map.remove(object);
    }

    public Object resumeContinuation(Object object, Scriptable scriptable, Object object2) {
        return Interpreter.restartContinuation((NativeContinuation)object, this, scriptable, new Object[]{object2});
    }

    public final void seal(Object object) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        this.sealed = true;
        this.sealKey = object;
    }

    public final void setApplicationClassLoader(ClassLoader classLoader) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if (classLoader == null) {
            this.applicationClassLoader = null;
            return;
        }
        if (Kit.testIfCanLoadRhinoClasses(classLoader)) {
            this.applicationClassLoader = classLoader;
            return;
        }
        throw new IllegalArgumentException("Loader can not resolve Rhino classes");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setClassShutter(ClassShutter object) {
        synchronized (this) {
            if (this.sealed) {
                Context.onSealedMutation();
            }
            if (object == null) {
                object = new IllegalArgumentException();
                throw object;
            }
            if (!this.hasClassShutter) {
                this.classShutter = object;
                this.hasClassShutter = true;
                return;
            }
            object = new SecurityException("Cannot overwrite existing ClassShutter object");
            throw object;
        }
    }

    public final void setDebugger(Debugger debugger, Object object) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        this.debugger = debugger;
        this.debuggerData = object;
    }

    public final ErrorReporter setErrorReporter(ErrorReporter errorReporter) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if (errorReporter != null) {
            ErrorReporter errorReporter2 = this.getErrorReporter();
            if (errorReporter == errorReporter2) {
                return errorReporter2;
            }
            Object object = this.propertyListeners;
            if (object != null) {
                this.firePropertyChangeImpl(object, errorReporterProperty, errorReporter2, errorReporter);
            }
            this.errorReporter = errorReporter;
            return errorReporter2;
        }
        throw new IllegalArgumentException();
    }

    public void setGenerateObserverCount(boolean bl) {
        this.generateObserverCount = bl;
    }

    public final void setGeneratingDebug(boolean bl) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        this.generatingDebugChanged = true;
        if (bl && this.getOptimizationLevel() > 0) {
            this.setOptimizationLevel(0);
        }
        this.generatingDebug = bl;
    }

    public final void setGeneratingSource(boolean bl) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        this.generatingSource = bl;
    }

    public final void setInstructionObserverThreshold(int n2) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if (n2 >= 0) {
            this.instructionThreshold = n2;
            boolean bl = n2 > 0;
            this.setGenerateObserverCount(bl);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setJavaToJSONConverter(UnaryOperator<Object> unaryOperator) {
        if (unaryOperator != null) {
            this.javaToJSONConverter = unaryOperator;
            return;
        }
        throw new IllegalArgumentException("javaToJSONConverter == null");
    }

    public void setLanguageVersion(int n2) {
        int n3;
        if (this.sealed) {
            Context.onSealedMutation();
        }
        Context.checkLanguageVersion(n2);
        Object object = this.propertyListeners;
        if (object != null && n2 != (n3 = this.version)) {
            this.firePropertyChangeImpl(object, languageVersionProperty, n3, n2);
        }
        this.version = n2;
    }

    public final Locale setLocale(Locale locale) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        Locale locale2 = this.locale;
        this.locale = locale;
        return locale2;
    }

    public final void setMaximumInterpreterStackDepth(int n2) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if (this.optimizationLevel == -1) {
            if (n2 >= 1) {
                this.maximumInterpreterStackDepth = n2;
                return;
            }
            throw new IllegalArgumentException("Cannot set maximumInterpreterStackDepth to less than 1");
        }
        throw new IllegalStateException("Cannot set maximumInterpreterStackDepth when optimizationLevel != -1");
    }

    public final void setOptimizationLevel(int n2) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        int n3 = -1;
        int n4 = n2;
        if (n2 == -2) {
            n4 = -1;
        }
        Context.checkOptimizationLevel(n4);
        if (codegenClass == null) {
            n4 = n3;
        }
        this.optimizationLevel = n4;
    }

    public final void setSecurityController(SecurityController securityController) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if (securityController != null) {
            if (this.securityController == null) {
                if (!SecurityController.hasGlobal()) {
                    this.securityController = securityController;
                    return;
                }
                throw new SecurityException("Can not overwrite existing global SecurityController object");
            }
            throw new SecurityException("Can not overwrite existing SecurityController object");
        }
        throw new IllegalArgumentException();
    }

    public final TimeZone setTimeZone(TimeZone timeZone) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        TimeZone timeZone2 = this.timezone;
        this.timezone = timeZone;
        return timeZone2;
    }

    public void setTrackUnhandledPromiseRejections(boolean bl) {
        this.unhandledPromises.enable(bl);
    }

    public final void setWrapFactory(WrapFactory wrapFactory) {
        if (this.sealed) {
            Context.onSealedMutation();
        }
        if (wrapFactory != null) {
            this.wrapFactory = wrapFactory;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean stringIsCompilableUnit(String string) {
        boolean bl;
        Object object = new CompilerEnvirons();
        ((CompilerEnvirons)object).initFromContext(this);
        boolean bl2 = false;
        ((CompilerEnvirons)object).setGeneratingSource(false);
        object = new Parser((CompilerEnvirons)object, DefaultErrorReporter.instance);
        try {
            ((Parser)object).parse(string, null, 1);
            bl = false;
        }
        catch (EvaluatorException evaluatorException) {
            bl = true;
        }
        if (!bl || !((Parser)object).eof()) {
            bl2 = true;
        }
        return bl2;
    }

    public final void unseal(Object object) {
        if (object != null) {
            if (this.sealKey == object) {
                if (this.sealed) {
                    this.sealed = false;
                    this.sealKey = null;
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}

