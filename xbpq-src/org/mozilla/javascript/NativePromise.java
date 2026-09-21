/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.h1.m;
import com.github.catvod.spider.merge.h1.o;
import com.github.catvod.spider.merge.h1.p;
import com.github.catvod.spider.merge.h1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.IteratorLikeIterable;
import org.mozilla.javascript.IteratorLikeIterable$Itr;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.LambdaFunction;
import org.mozilla.javascript.NativePromise$Capability;
import org.mozilla.javascript.NativePromise$PromiseAllResolver;
import org.mozilla.javascript.NativePromise$Reaction;
import org.mozilla.javascript.NativePromise$ReactionType;
import org.mozilla.javascript.NativePromise$ResolvingFunctions;
import org.mozilla.javascript.NativePromise$State;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel$NativeErrors;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.k;
import org.mozilla.javascript.l;
import org.mozilla.javascript.n;
import org.mozilla.javascript.r;
import org.mozilla.javascript.s;
import org.mozilla.javascript.t;
import org.mozilla.javascript.u;
import org.mozilla.javascript.v;
import org.mozilla.javascript.w;
import org.mozilla.javascript.x;

public class NativePromise
extends ScriptableObject {
    static final boolean $assertionsDisabled = false;
    private ArrayList<NativePromise$Reaction> fulfillReactions;
    private boolean handled = false;
    private ArrayList<NativePromise$Reaction> rejectReactions;
    private Object result = null;
    private NativePromise$State state = NativePromise$State.PENDING;

    public NativePromise() {
        this.fulfillReactions = new ArrayList();
        this.rejectReactions = new ArrayList();
    }

    public static /* synthetic */ Object a(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.race(context, scriptable, scriptable2, objectArray);
    }

    static /* synthetic */ Object access$000(NativePromise nativePromise, Context context, Scriptable scriptable, Object object) {
        return nativePromise.rejectPromise(context, scriptable, object);
    }

    static /* synthetic */ Object access$100(NativePromise nativePromise, Context context, Scriptable scriptable, Object object) {
        return nativePromise.fulfillPromise(context, scriptable, object);
    }

    static /* synthetic */ void access$200(NativePromise nativePromise, Context context, Scriptable scriptable, Object object, Callable callable) {
        nativePromise.callThenable(context, scriptable, object, callable);
    }

    static /* synthetic */ Object access$300(Context context, Scriptable scriptable, RhinoException rhinoException) {
        return NativePromise.getErrorObject(context, scriptable, rhinoException);
    }

    private static Object all(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.doAll(context, scriptable, scriptable2, objectArray, true);
    }

    private static Object allSettled(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.doAll(context, scriptable, scriptable2, objectArray, false);
    }

    public static /* synthetic */ void c(NativePromise$Reaction nativePromise$Reaction, Context context, Scriptable scriptable, Object object) {
        nativePromise$Reaction.invoke(context, scriptable, object);
    }

    private void callThenable(Context context, Scriptable scriptable, Object object, Callable callable) {
        NativePromise$ResolvingFunctions nativePromise$ResolvingFunctions = new NativePromise$ResolvingFunctions(scriptable, this);
        object = object instanceof Scriptable ? (Scriptable)object : Undefined.SCRIPTABLE_UNDEFINED;
        try {
            callable.call(context, scriptable, (Scriptable)object, new Object[]{nativePromise$ResolvingFunctions.resolve, nativePromise$ResolvingFunctions.reject});
        }
        catch (RhinoException rhinoException) {
            nativePromise$ResolvingFunctions.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{NativePromise.getErrorObject(context, scriptable, rhinoException)});
        }
    }

    private static Scriptable constructor(Context context, Scriptable scriptable, Object[] object) {
        if (((Object[])object).length >= 1 && object[0] instanceof Callable) {
            Callable callable = (Callable)object[0];
            NativePromise nativePromise = new NativePromise();
            NativePromise$ResolvingFunctions nativePromise$ResolvingFunctions = new NativePromise$ResolvingFunctions(scriptable, nativePromise);
            Scriptable scriptable2 = Undefined.SCRIPTABLE_UNDEFINED;
            object = scriptable2;
            if (!context.isStrictMode()) {
                Scriptable scriptable3 = context.topCallScope;
                object = scriptable2;
                if (scriptable3 != null) {
                    object = scriptable3;
                }
            }
            try {
                callable.call(context, scriptable, (Scriptable)object, new Object[]{nativePromise$ResolvingFunctions.resolve, nativePromise$ResolvingFunctions.reject});
            }
            catch (RhinoException rhinoException) {
                nativePromise$ResolvingFunctions.reject.call(context, scriptable, (Scriptable)object, new Object[]{NativePromise.getErrorObject(context, scriptable, rhinoException)});
            }
            return nativePromise;
        }
        throw ScriptRuntime.typeErrorById("msg.function.expected", new Object[0]);
    }

    public static /* synthetic */ void d(NativePromise nativePromise, NativePromise$Reaction nativePromise$Reaction, Context context, Scriptable scriptable) {
        nativePromise.lambda$then$3(nativePromise$Reaction, context, scriptable);
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object doAll(Context context, Scriptable scriptable, Scriptable object, Object[] object2, boolean bl) {
        NativePromise$Capability nativePromise$Capability = new NativePromise$Capability(context, scriptable, object);
        object2 = ((Object)object2).length > 0 ? object2[0] : Undefined.instance;
        Object object3 = ScriptRuntime.callIterator(object2, context, scriptable);
        object2 = new IteratorLikeIterable(context, scriptable, object3);
        object3 = ((IteratorLikeIterable)object2).iterator();
        NativePromise$PromiseAllResolver nativePromise$PromiseAllResolver = new NativePromise$PromiseAllResolver((IteratorLikeIterable$Itr)object3, (Scriptable)object, nativePromise$Capability, bl);
        {
            catch (RhinoException rhinoException) {
                nativePromise$Capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{NativePromise.getErrorObject(context, scriptable, rhinoException)});
                return nativePromise$Capability.promise;
            }
        }
        object = nativePromise$PromiseAllResolver.resolve(context, scriptable);
        if (((IteratorLikeIterable$Itr)object3).isDone()) return object;
        ((IteratorLikeIterable)object2).close();
        return object;
        catch (Throwable throwable) {
            if (((IteratorLikeIterable$Itr)object3).isDone()) throw throwable;
            ((IteratorLikeIterable)object2).close();
            throw throwable;
        }
        catch (RhinoException rhinoException) {
            nativePromise$Capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{NativePromise.getErrorObject(context, scriptable, rhinoException)});
            return nativePromise$Capability.promise;
        }
    }

    private static Object doCatch(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] object) {
        object = ((Object[])object).length > 0 ? object[0] : Undefined.instance;
        return ScriptRuntime.getPropFunctionAndThis(ScriptRuntime.toObject(context, scriptable, scriptable2), "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{Undefined.instance, object});
    }

    private static Object doFinally(Context context, Scriptable scriptable, Scriptable scriptable2, LambdaConstructor object, Object[] object2) {
        if (ScriptRuntime.isObject(scriptable2)) {
            object2 = ((Object[])object2).length > 0 ? object2[0] : Undefined.SCRIPTABLE_UNDEFINED;
            object = AbstractEcmaObjectOperations.speciesConstructor(context, scriptable2, (Constructable)object);
            if (object2 instanceof Callable) {
                Callable callable = (Callable)object2;
                object2 = NativePromise.makeThenFinally(scriptable, object, callable);
                object = NativePromise.makeCatchFinally(scriptable, object, callable);
            } else {
                object = object2;
            }
            return ScriptRuntime.getPropFunctionAndThis(scriptable2, "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{object2, object});
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(scriptable2));
    }

    public static /* synthetic */ void f(NativePromise$Reaction nativePromise$Reaction, Context context, Scriptable scriptable, Object object) {
        nativePromise$Reaction.invoke(context, scriptable, object);
    }

    private Object fulfillPromise(Context context, Scriptable scriptable, Object object) {
        this.result = object;
        Object object2 = this.fulfillReactions;
        this.fulfillReactions = new ArrayList();
        if (!this.rejectReactions.isEmpty()) {
            this.rejectReactions = new ArrayList();
        }
        this.state = NativePromise$State.FULFILLED;
        object2 = ((ArrayList)object2).iterator();
        while (object2.hasNext()) {
            context.enqueueMicrotask(new v((NativePromise$Reaction)object2.next(), context, scriptable, object));
        }
        return Undefined.instance;
    }

    public static /* synthetic */ Object g(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.resolve(context, scriptable, scriptable2, objectArray);
    }

    private static Object getErrorObject(Context context, Scriptable scriptable, RhinoException rhinoException) {
        TopLevel$NativeErrors topLevel$NativeErrors;
        if (rhinoException instanceof JavaScriptException) {
            return ((JavaScriptException)rhinoException).getValue();
        }
        Object object = topLevel$NativeErrors = TopLevel$NativeErrors.Error;
        if (rhinoException instanceof EcmaError) {
            object = ((EcmaError)rhinoException).getName();
            Objects.requireNonNull(object);
            int n2 = -1;
            switch (((String)object).hashCode()) {
                default: {
                    break;
                }
                case 1615877061: {
                    if (!((String)object).equals("SyntaxError")) break;
                    n2 = 7;
                    break;
                }
                case 1368933789: {
                    if (!((String)object).equals("ReferenceError")) break;
                    n2 = 6;
                    break;
                }
                case 154321643: {
                    if (!((String)object).equals("RangeError")) break;
                    n2 = 5;
                    break;
                }
                case -266958820: {
                    if (!((String)object).equals("URIError")) break;
                    n2 = 4;
                    break;
                }
                case -584074195: {
                    if (!((String)object).equals("JavaException")) break;
                    n2 = 3;
                    break;
                }
                case -1614392660: {
                    if (!((String)object).equals("EvalError")) break;
                    n2 = 2;
                    break;
                }
                case -1693386453: {
                    if (!((String)object).equals("InternalError")) break;
                    n2 = 1;
                    break;
                }
                case -1795692850: {
                    if (!((String)object).equals("TypeError")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    object = topLevel$NativeErrors;
                    break;
                }
                case 7: {
                    object = TopLevel$NativeErrors.SyntaxError;
                    break;
                }
                case 6: {
                    object = TopLevel$NativeErrors.ReferenceError;
                    break;
                }
                case 5: {
                    object = TopLevel$NativeErrors.RangeError;
                    break;
                }
                case 4: {
                    object = TopLevel$NativeErrors.URIError;
                    break;
                }
                case 3: {
                    object = TopLevel$NativeErrors.JavaException;
                    break;
                }
                case 2: {
                    object = TopLevel$NativeErrors.EvalError;
                    break;
                }
                case 1: {
                    object = TopLevel$NativeErrors.InternalError;
                    break;
                }
                case 0: {
                    object = TopLevel$NativeErrors.TypeError;
                }
            }
        }
        return ScriptRuntime.newNativeError(context, scriptable, object, new Object[]{rhinoException.getMessage()});
    }

    public static /* synthetic */ Object i(Object object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.lambda$null$6(object, context, scriptable, scriptable2, objectArray);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        LambdaConstructor lambdaConstructor = new LambdaConstructor(scriptable, "Promise", 1, 2, q.a);
        lambdaConstructor.setPrototypePropertyAttributes(7);
        lambdaConstructor.defineConstructorMethod(scriptable, "resolve", 1, t.f, 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "reject", 1, s.f, 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "all", 1, r.f, 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "allSettled", 1, l.f, 2, 3);
        lambdaConstructor.defineConstructorMethod(scriptable, "race", 1, k.f, 2, 3);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, lambdaConstructor);
        lambdaConstructor.definePrototypeMethod(scriptable, "then", 2, new com.github.catvod.spider.merge.h1.n(lambdaConstructor, 1), 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "catch", 1, n.f, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "finally", 1, new m(lambdaConstructor, 1), 2, 3);
        lambdaConstructor.definePrototypeProperty(SymbolKey.TO_STRING_TAG, (Object)"Promise", 3);
        ScriptableObject.defineProperty(scriptable, "Promise", lambdaConstructor, 2);
        if (bl) {
            lambdaConstructor.sealObject();
        }
    }

    public static /* synthetic */ Object j(Scriptable scriptable, Callable callable, Object object, Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objectArray) {
        return NativePromise.lambda$makeThenFinally$5(scriptable, callable, object, context, scriptable2, scriptable3, objectArray);
    }

    public static /* synthetic */ Object k(Object object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return object;
    }

    public static /* synthetic */ Scriptable l(Context context, Scriptable scriptable, Object[] objectArray) {
        return NativePromise.constructor(context, scriptable, objectArray);
    }

    private static /* synthetic */ Object lambda$init$0(LambdaConstructor lambdaConstructor, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return LambdaConstructor.convertThisObject(scriptable2, NativePromise.class).then(context, scriptable, lambdaConstructor, objectArray);
    }

    private static /* synthetic */ Object lambda$makeCatchFinally$7(Scriptable scriptable, Callable callable, Object object, Context context, Scriptable scriptable2, Scriptable object2, Object[] objectArray) {
        object2 = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
        object2 = new LambdaFunction(scriptable, 0, new m(object2, 0));
        return ScriptRuntime.getPropFunctionAndThis(NativePromise.resolveInternal(context, scriptable, object, callable.call(context, scriptable2, Undefined.SCRIPTABLE_UNDEFINED, ScriptRuntime.emptyArgs)), "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{object2});
    }

    private static /* synthetic */ Object lambda$makeThenFinally$5(Scriptable scriptable, Callable callable, Object object, Context context, Scriptable scriptable2, Scriptable object2, Object[] objectArray) {
        object2 = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
        object2 = new LambdaFunction(scriptable, 0, new com.github.catvod.spider.merge.h1.n(object2, 0));
        return ScriptRuntime.getPropFunctionAndThis(NativePromise.resolveInternal(context, scriptable, object, callable.call(context, scriptable2, Undefined.SCRIPTABLE_UNDEFINED, ScriptRuntime.emptyArgs)), "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{object2});
    }

    private static /* synthetic */ Object lambda$null$6(Object object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        throw new JavaScriptException(object, null, 0);
    }

    private /* synthetic */ void lambda$then$2(NativePromise$Reaction nativePromise$Reaction, Context context, Scriptable scriptable) {
        nativePromise$Reaction.invoke(context, scriptable, this.result);
    }

    private /* synthetic */ void lambda$then$3(NativePromise$Reaction nativePromise$Reaction, Context context, Scriptable scriptable) {
        nativePromise$Reaction.invoke(context, scriptable, this.result);
    }

    public static /* synthetic */ Object m(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.allSettled(context, scriptable, scriptable2, objectArray);
    }

    private static Callable makeCatchFinally(Scriptable scriptable, Object object, Callable callable) {
        return new LambdaFunction(scriptable, 1, new p(scriptable, callable, object));
    }

    private static Callable makeThenFinally(Scriptable scriptable, Object object, Callable callable) {
        return new LambdaFunction(scriptable, 1, new o(scriptable, callable, object));
    }

    private void markHandled(Context context) {
        if (!this.handled) {
            context.getUnhandledPromiseTracker().promiseHandled(this);
            this.handled = true;
        }
    }

    public static /* synthetic */ Object n(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.doCatch(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object o(LambdaConstructor lambdaConstructor, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.lambda$init$0(lambdaConstructor, context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ void p(NativePromise nativePromise, NativePromise$Reaction nativePromise$Reaction, Context context, Scriptable scriptable) {
        nativePromise.lambda$then$2(nativePromise$Reaction, context, scriptable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object performRace(Context context, Scriptable scriptable, IteratorLikeIterable$Itr iteratorLikeIterable$Itr, Scriptable object, NativePromise$Capability nativePromise$Capability) {
        Callable callable = ScriptRuntime.getPropFunctionAndThis(object, "resolve", context, scriptable);
        Scriptable scriptable2 = ScriptRuntime.lastStoredScriptable(context);
        while (true) {
            object = Undefined.instance;
            try {
                boolean bl = iteratorLikeIterable$Itr.hasNext();
                if (bl) {
                    object = iteratorLikeIterable$Itr.next();
                }
                if (!bl) {
                    return nativePromise$Capability.promise;
                }
            }
            catch (Throwable throwable) {
                iteratorLikeIterable$Itr.setDone(true);
                throw throwable;
            }
            ScriptRuntime.getPropFunctionAndThis(callable.call(context, scriptable, scriptable2, new Object[]{object}), "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{nativePromise$Capability.resolve, nativePromise$Capability.reject});
        }
    }

    public static /* synthetic */ Object q(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.reject(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object r(LambdaConstructor lambdaConstructor, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.doFinally(context, scriptable, scriptable2, lambdaConstructor, objectArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object race(Context context, Scriptable scriptable, Scriptable object, Object[] object2) {
        Object object3;
        NativePromise$Capability nativePromise$Capability = new NativePromise$Capability(context, scriptable, object);
        object2 = ((Object)object2).length > 0 ? object2[0] : Undefined.instance;
        try {
            object3 = ScriptRuntime.callIterator(object2, context, scriptable);
            object2 = new IteratorLikeIterable(context, scriptable, object3);
        }
        catch (RhinoException rhinoException) {
            nativePromise$Capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{NativePromise.getErrorObject(context, scriptable, rhinoException)});
            return nativePromise$Capability.promise;
        }
        object3 = ((IteratorLikeIterable)object2).iterator();
        try {
            object = NativePromise.performRace(context, scriptable, (IteratorLikeIterable$Itr)object3, (Scriptable)object, nativePromise$Capability);
        }
        catch (Throwable throwable) {
            if (((IteratorLikeIterable$Itr)object3).isDone()) throw throwable;
            ((IteratorLikeIterable)object2).close();
            throw throwable;
        }
        try {
            if (((IteratorLikeIterable$Itr)object3).isDone()) return object;
            ((IteratorLikeIterable)object2).close();
            return object;
        }
        catch (RhinoException rhinoException) {}
        nativePromise$Capability.reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{NativePromise.getErrorObject(context, scriptable, rhinoException)});
        return nativePromise$Capability.promise;
    }

    private static Object reject(Context context, Scriptable scriptable, Scriptable object, Object[] object2) {
        if (ScriptRuntime.isObject(object)) {
            object2 = ((Object[])object2).length > 0 ? object2[0] : Undefined.instance;
            object = new NativePromise$Capability(context, scriptable, object);
            ((NativePromise$Capability)object).reject.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{object2});
            return ((NativePromise$Capability)object).promise;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(object));
    }

    private Object rejectPromise(Context context, Scriptable scriptable, Object object) {
        this.result = object;
        ArrayList<NativePromise$Reaction> arrayList = this.rejectReactions;
        this.rejectReactions = new ArrayList();
        if (!this.fulfillReactions.isEmpty()) {
            this.fulfillReactions = new ArrayList();
        }
        this.state = NativePromise$State.REJECTED;
        context.getUnhandledPromiseTracker().promiseRejected(this);
        Iterator<NativePromise$Reaction> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            context.enqueueMicrotask(new u(iterator.next(), context, scriptable, object));
        }
        if (!arrayList.isEmpty()) {
            this.markHandled(context);
        }
        return Undefined.instance;
    }

    private static Object resolve(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] object) {
        if (ScriptRuntime.isObject(scriptable2)) {
            object = ((Object[])object).length > 0 ? object[0] : Undefined.instance;
            return NativePromise.resolveInternal(context, scriptable, scriptable2, object);
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(scriptable2));
    }

    private static Object resolveInternal(Context context, Scriptable scriptable, Object object, Object object2) {
        if (object2 instanceof NativePromise && ScriptRuntime.getObjectProp(object2, "constructor", context, scriptable) == object) {
            return object2;
        }
        object = new NativePromise$Capability(context, scriptable, object);
        ((NativePromise$Capability)object).resolve.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{object2});
        return ((NativePromise$Capability)object).promise;
    }

    public static /* synthetic */ Object s(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativePromise.all(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object t(Scriptable scriptable, Callable callable, Object object, Context context, Scriptable scriptable2, Scriptable scriptable3, Object[] objectArray) {
        return NativePromise.lambda$makeCatchFinally$7(scriptable, callable, object, context, scriptable2, scriptable3, objectArray);
    }

    private Object then(Context context, Scriptable scriptable, LambdaConstructor object, Object[] object2) {
        NativePromise$Capability nativePromise$Capability = new NativePromise$Capability(context, scriptable, AbstractEcmaObjectOperations.speciesConstructor(context, this, (Constructable)object));
        int n2 = ((Object[])object2).length;
        Object var7_7 = null;
        Object object3 = n2 >= 1 && object2[0] instanceof Callable ? (Callable)object2[0] : null;
        object = var7_7;
        if (((Object[])object2).length >= 2) {
            object = var7_7;
            if (object2[1] instanceof Callable) {
                object = (Callable)object2[1];
            }
        }
        object2 = new NativePromise$Reaction(nativePromise$Capability, NativePromise$ReactionType.FULFILL, (Callable)object3);
        object = new NativePromise$Reaction(nativePromise$Capability, NativePromise$ReactionType.REJECT, (Callable)object);
        object3 = this.state;
        if (object3 == NativePromise$State.PENDING) {
            this.fulfillReactions.add((NativePromise$Reaction)object2);
            this.rejectReactions.add((NativePromise$Reaction)object);
        } else if (object3 == NativePromise$State.FULFILLED) {
            context.enqueueMicrotask(new x(this, (NativePromise$Reaction)object2, context, scriptable));
        } else {
            this.markHandled(context);
            context.enqueueMicrotask(new w(this, (NativePromise$Reaction)object, context, scriptable));
        }
        return nativePromise$Capability.promise;
    }

    @Override
    public String getClassName() {
        return "Promise";
    }

    Object getResult() {
        return this.result;
    }
}

