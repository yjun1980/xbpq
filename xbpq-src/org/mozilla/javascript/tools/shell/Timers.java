/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import com.github.catvod.spider.merge.j1.b;
import java.util.HashMap;
import java.util.PriorityQueue;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.LambdaFunction;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.tools.shell.Timers$Timeout;
import org.mozilla.javascript.tools.shell.a;

public class Timers {
    private int lastId = 0;
    private final PriorityQueue<Timers$Timeout> timerQueue;
    private final HashMap<Integer, Timers$Timeout> timers = new HashMap();

    public Timers() {
        this.timerQueue = new PriorityQueue();
    }

    public static /* synthetic */ Object a(Timers timers, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return timers.lambda$install$0(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ void b(Timers$Timeout timers$Timeout, Context context, Scriptable scriptable) {
        timers$Timeout.func.call(context, scriptable, scriptable, timers$Timeout.funcArgs);
    }

    public static /* synthetic */ Object c(Timers timers, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return timers.lambda$install$1(context, scriptable, scriptable2, objectArray);
    }

    private Object clearTimeout(Object[] object) {
        if (((Object[])object).length != 0) {
            int n2 = ScriptRuntime.toInt32(object[0]);
            if ((object = this.timers.remove(n2)) != null) {
                this.timerQueue.remove(object);
            }
            return Undefined.instance;
        }
        throw ScriptRuntime.typeError("Expected function parameter");
    }

    private boolean executeNext(Context context, Scriptable scriptable) {
        Timers$Timeout timers$Timeout = this.timerQueue.peek();
        if (timers$Timeout == null) {
            return false;
        }
        long l2 = timers$Timeout.expiration - System.currentTimeMillis();
        if (l2 > 0L) {
            Thread.sleep(l2);
        }
        this.timerQueue.remove();
        this.timers.remove(timers$Timeout.id);
        context.enqueueMicrotask(new a(timers$Timeout, context, scriptable));
        return true;
    }

    private /* synthetic */ Object lambda$install$0(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.setTimeout(objectArray);
    }

    private /* synthetic */ Object lambda$install$1(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.clearTimeout(objectArray);
    }

    private Object setTimeout(Object[] objectArray) {
        if (objectArray.length != 0) {
            if (objectArray[0] instanceof Function) {
                int n2;
                this.lastId = n2 = this.lastId + 1;
                Timers$Timeout timers$Timeout = new Timers$Timeout(null);
                timers$Timeout.id = n2;
                timers$Timeout.func = (Function)objectArray[0];
                int n3 = objectArray.length > 1 ? ScriptRuntime.toInt32(objectArray[1]) : 0;
                timers$Timeout.expiration = System.currentTimeMillis() + (long)n3;
                if (objectArray.length > 2) {
                    Object[] objectArray2 = new Object[objectArray.length - 2];
                    timers$Timeout.funcArgs = objectArray2;
                    System.arraycopy(objectArray, 2, objectArray2, 0, objectArray2.length);
                }
                this.timers.put(n2, timers$Timeout);
                this.timerQueue.add(timers$Timeout);
                return n2;
            }
            throw ScriptRuntime.typeError("Expected first argument to be a function");
        }
        throw ScriptRuntime.typeError("Expected function parameter");
    }

    public void install(Scriptable scriptable) {
        ScriptableObject.defineProperty(scriptable, "setTimeout", new LambdaFunction(scriptable, "setTimeout", 1, new com.github.catvod.spider.merge.j1.a(this)), 2);
        ScriptableObject.defineProperty(scriptable, "clearTimeout", new LambdaFunction(scriptable, "clearTimeout", 1, new b(this)), 2);
    }

    public void runAllTimers(Context context, Scriptable scriptable) {
        do {
            context.processMicrotasks();
        } while (this.executeNext(context, scriptable));
        context.processMicrotasks();
    }
}

