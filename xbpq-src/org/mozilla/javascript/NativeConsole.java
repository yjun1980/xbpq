/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.h1.j;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeConsole$1;
import org.mozilla.javascript.NativeConsole$ConsolePrinter;
import org.mozilla.javascript.NativeConsole$Level;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

public class NativeConsole
extends IdScriptableObject {
    private static final Object CONSOLE_TAG = "Console";
    private static final String DEFAULT_LABEL = "default";
    private static final Pattern FMT_REG = Pattern.compile("%[sfdioOc%]");
    private static final int Id_assert = 8;
    private static final int Id_count = 9;
    private static final int Id_countReset = 10;
    private static final int Id_debug = 3;
    private static final int Id_error = 7;
    private static final int Id_info = 5;
    private static final int Id_log = 4;
    private static final int Id_time = 11;
    private static final int Id_timeEnd = 12;
    private static final int Id_timeLog = 13;
    private static final int Id_toSource = 1;
    private static final int Id_trace = 2;
    private static final int Id_warn = 6;
    private static final int LAST_METHOD_ID = 13;
    private static final int MAX_ID = 13;
    private static final long serialVersionUID = 5694613212458273057L;
    private final Map<String, AtomicInteger> counters;
    private final NativeConsole$ConsolePrinter printer;
    private final Map<String, Long> timers = new ConcurrentHashMap<String, Long>();

    private NativeConsole(NativeConsole$ConsolePrinter nativeConsole$ConsolePrinter) {
        this.counters = new ConcurrentHashMap<String, AtomicInteger>();
        this.printer = nativeConsole$ConsolePrinter;
    }

    public static /* synthetic */ AtomicInteger a(String string) {
        return NativeConsole.lambda$count$0(string);
    }

    private void count(Context context, Scriptable scriptable, Object[] object) {
        object = ((Object[])object).length > 0 ? ScriptRuntime.toString(object[0]) : DEFAULT_LABEL;
        int n2 = this.counters.computeIfAbsent((String)object, j.a).incrementAndGet();
        NativeConsole$Level nativeConsole$Level = NativeConsole$Level.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(": ");
        stringBuilder.append(n2);
        this.print(context, scriptable, nativeConsole$Level, stringBuilder.toString());
    }

    private void countReset(Context context, Scriptable scriptable, Object[] object) {
        if (this.counters.remove(object = ((Object[])object).length > 0 ? ScriptRuntime.toString(object[0]) : DEFAULT_LABEL) == null) {
            this.print(context, scriptable, NativeConsole$Level.WARN, s.a("Count for '", (String)object, "' does not exist."));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String format(Context context, Scriptable scriptable, Object[] objectArray) {
        if (objectArray == null) return "";
        if (objectArray.length == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = 0;
        Object object = objectArray[0];
        if (object instanceof String || object instanceof ConsString) {
            object = object.toString();
            Matcher matcher = FMT_REG.matcher((CharSequence)object);
            int n3 = 1;
            while (matcher.find()) {
                object = matcher.group();
                if (((String)object).equals("%%")) {
                    object = "%";
                } else {
                    if (n3 < objectArray.length) {
                        Object object2 = objectArray[n3];
                        n2 = -1;
                        switch (((String)object).hashCode()) {
                            default: {
                                break;
                            }
                            case 1262: {
                                if (!((String)object).equals("%s")) break;
                                n2 = 5;
                                break;
                            }
                            case 1258: {
                                if (!((String)object).equals("%o")) break;
                                n2 = 4;
                                break;
                            }
                            case 1252: {
                                if (!((String)object).equals("%i")) break;
                                n2 = 3;
                                break;
                            }
                            case 1249: {
                                if (!((String)object).equals("%f")) break;
                                n2 = 2;
                                break;
                            }
                            case 1247: {
                                if (!((String)object).equals("%d")) break;
                                n2 = 1;
                                break;
                            }
                            case 1226: {
                                if (!((String)object).equals("%O")) break;
                                n2 = 0;
                            }
                        }
                        switch (n2) {
                            default: {
                                object = "";
                                break;
                            }
                            case 5: {
                                object = NativeConsole.formatString(object2);
                                break;
                            }
                            case 2: {
                                object = NativeConsole.formatFloat(object2);
                                break;
                            }
                            case 1: 
                            case 3: {
                                object = NativeConsole.formatInt(object2);
                                break;
                            }
                            case 0: 
                            case 4: {
                                object = NativeConsole.formatObj(context, scriptable, object2);
                            }
                        }
                    }
                    ++n3;
                }
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String)object));
            }
            matcher.appendTail(stringBuffer);
            n2 = n3;
        }
        while (n2 < objectArray.length) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(' ');
            }
            object = (object = objectArray[n2]) instanceof String ? NativeConsole.formatString(object) : NativeConsole.formatObj(context, scriptable, object);
            stringBuffer.append((String)object);
            ++n2;
        }
        return stringBuffer.toString();
    }

    private static String formatFloat(Object object) {
        if (!(object instanceof BigInteger) && !ScriptRuntime.isSymbol(object)) {
            return ScriptRuntime.numberToString(ScriptRuntime.toNumber(object), 10);
        }
        return ScriptRuntime.NaNobj.toString();
    }

    private static String formatInt(Object object) {
        if (object instanceof BigInteger) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ScriptRuntime.bigIntToString((BigInteger)object, 10));
            stringBuilder.append("n");
            return stringBuilder.toString();
        }
        if (ScriptRuntime.isSymbol(object)) {
            return ScriptRuntime.NaNobj.toString();
        }
        double d2 = ScriptRuntime.toNumber(object);
        if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
            return String.valueOf((long)d2);
        }
        return ScriptRuntime.toString(d2);
    }

    private static String formatObj(Context object, Scriptable scriptable, Object object2) {
        if (object2 == null) {
            return "null";
        }
        if (Undefined.isUndefined(object2)) {
            return Undefined.SCRIPTABLE_UNDEFINED.toString();
        }
        if (object2 instanceof NativeError) {
            scriptable = (NativeError)object2;
            object = a.c(e.c(((NativeError)scriptable).toString(), "\n"));
            ((StringBuilder)object).append(((ScriptableObject)scriptable).get("stack"));
            return ((StringBuilder)object).toString();
        }
        try {
            NativeConsole$1 nativeConsole$1 = new NativeConsole$1(object2);
            object = ScriptRuntime.toString(NativeJSON.stringify((Context)object, scriptable, object2, nativeConsole$1, null));
            return object;
        }
        catch (EcmaError ecmaError) {
            if ("TypeError".equals(ecmaError.getName())) {
                return ScriptRuntime.toString(object2);
            }
            throw ecmaError;
        }
    }

    private static String formatString(Object object) {
        if (object instanceof BigInteger) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ScriptRuntime.toString(object));
            stringBuilder.append("n");
            return stringBuilder.toString();
        }
        if (ScriptRuntime.isSymbol(object)) {
            return object.toString();
        }
        return ScriptRuntime.toString(object);
    }

    public static void init(Scriptable scriptable, boolean bl, NativeConsole$ConsolePrinter serializable) {
        serializable = new NativeConsole((NativeConsole$ConsolePrinter)serializable);
        ((IdScriptableObject)serializable).activatePrototypeMap(13);
        ((ScriptableObject)serializable).setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        ((ScriptableObject)serializable).setParentScope(scriptable);
        if (bl) {
            ((ScriptableObject)serializable).sealObject();
        }
        ScriptableObject.defineProperty(scriptable, "console", serializable, 2);
    }

    private void jsAssert(Context context, Scriptable scriptable, Object[] objectArray) {
        if (objectArray != null && objectArray.length > 0 && ScriptRuntime.toBoolean(objectArray[0])) {
            return;
        }
        if (objectArray != null && objectArray.length >= 2) {
            Object[] objectArray2 = objectArray[1];
            if (objectArray2 instanceof String) {
                objectArray[1] = c.a("Assertion failed: ", objectArray2);
                int n2 = objectArray.length - 1;
                objectArray2 = new Object[n2];
                System.arraycopy(objectArray, 1, objectArray2, 0, n2);
                objectArray = objectArray2;
            } else {
                objectArray[0] = "Assertion failed:";
            }
            this.printer.print(context, scriptable, NativeConsole$Level.ERROR, objectArray, null);
            return;
        }
        this.printer.print(context, scriptable, NativeConsole$Level.ERROR, new String[]{"Assertion failed: console.assert"}, null);
    }

    private static /* synthetic */ AtomicInteger lambda$count$0(String string) {
        return new AtomicInteger(0);
    }

    private double nano2Milli(Long l2) {
        return (double)l2.longValue() / 1000000.0;
    }

    private void print(Context context, Scriptable scriptable, NativeConsole$Level nativeConsole$Level, String string) {
        this.printer.print(context, scriptable, nativeConsole$Level, new String[]{string}, null);
    }

    private void time(Context context, Scriptable scriptable, Object[] object) {
        if (this.timers.get(object = ((Object[])object).length > 0 ? ScriptRuntime.toString(object[0]) : DEFAULT_LABEL) != null) {
            this.print(context, scriptable, NativeConsole$Level.WARN, s.a("Timer '", (String)object, "' already exists."));
            return;
        }
        this.timers.put((String)object, System.nanoTime());
    }

    private void timeEnd(Context context, Scriptable scriptable, Object[] object) {
        Long l2 = this.timers.remove(object = ((Object[])object).length > 0 ? ScriptRuntime.toString(object[0]) : DEFAULT_LABEL);
        if (l2 == null) {
            this.print(context, scriptable, NativeConsole$Level.WARN, s.a("Timer '", (String)object, "' does not exist."));
            return;
        }
        NativeConsole$Level nativeConsole$Level = NativeConsole$Level.INFO;
        object = r.d((String)object, ": ");
        ((StringBuilder)object).append(this.nano2Milli(System.nanoTime() - l2));
        ((StringBuilder)object).append("ms");
        this.print(context, scriptable, nativeConsole$Level, ((StringBuilder)object).toString());
    }

    private void timeLog(Context context, Scriptable scriptable, Object[] object) {
        CharSequence charSequence = ((Object[])object).length > 0 ? ScriptRuntime.toString(object[0]) : DEFAULT_LABEL;
        Long l2 = this.timers.get(charSequence);
        if (l2 == null) {
            object = NativeConsole$Level.WARN;
            charSequence = s.a("Timer '", (String)charSequence, "' does not exist.");
        } else {
            charSequence = r.d((String)charSequence, ": ");
            ((StringBuilder)charSequence).append(this.nano2Milli(System.nanoTime() - l2));
            ((StringBuilder)charSequence).append("ms");
            charSequence = new StringBuilder(((StringBuilder)charSequence).toString());
            int n2 = ((Object[])object).length;
            if (n2 > 1) {
                for (int i2 = 1; i2 < ((Object[])object).length; ++i2) {
                    ((StringBuilder)charSequence).append(" ");
                    ((StringBuilder)charSequence).append(ScriptRuntime.toString(object[i2]));
                }
            }
            object = NativeConsole$Level.INFO;
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.print(context, scriptable, (NativeConsole$Level)((Object)object), (String)charSequence);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Object execIdCall(IdFunctionObject scriptStackElementArray, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!scriptStackElementArray.hasTag(CONSOLE_TAG)) {
            return super.execIdCall((IdFunctionObject)scriptStackElementArray, context, scriptable, scriptable2, objectArray);
        }
        int n2 = scriptStackElementArray.methodId();
        switch (n2) {
            default: {
                throw new IllegalStateException(String.valueOf(n2));
            }
            case 13: {
                this.timeLog(context, scriptable, objectArray);
                return Undefined.instance;
            }
            case 12: {
                this.timeEnd(context, scriptable, objectArray);
                return Undefined.instance;
            }
            case 11: {
                this.time(context, scriptable, objectArray);
                return Undefined.instance;
            }
            case 10: {
                this.countReset(context, scriptable, objectArray);
                return Undefined.instance;
            }
            case 9: {
                this.count(context, scriptable, objectArray);
                return Undefined.instance;
            }
            case 8: {
                this.jsAssert(context, scriptable, objectArray);
                return Undefined.instance;
            }
            case 7: {
                this.printer.print(context, scriptable, NativeConsole$Level.ERROR, objectArray, null);
                return Undefined.instance;
            }
            case 6: {
                this.printer.print(context, scriptable, NativeConsole$Level.WARN, objectArray, null);
                return Undefined.instance;
            }
            case 4: 
            case 5: {
                this.printer.print(context, scriptable, NativeConsole$Level.INFO, objectArray, null);
                return Undefined.instance;
            }
            case 3: {
                this.printer.print(context, scriptable, NativeConsole$Level.DEBUG, objectArray, null);
                return Undefined.instance;
            }
            case 2: {
                scriptStackElementArray = new EvaluatorException("[object Object]").getScriptStack();
                this.printer.print(context, scriptable, NativeConsole$Level.TRACE, objectArray, scriptStackElementArray);
                return Undefined.instance;
            }
            case 1: 
        }
        return "Console";
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 12;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 110620997: {
                if (!string.equals("trace")) break;
                n4 = 12;
                break;
            }
            case 96784904: {
                if (!string.equals("error")) break;
                n4 = 11;
                break;
            }
            case 95458899: {
                if (!string.equals("debug")) break;
                n4 = 10;
                break;
            }
            case 94851343: {
                if (!string.equals("count")) break;
                n4 = 9;
                break;
            }
            case 3641990: {
                if (!string.equals("warn")) break;
                n4 = 8;
                break;
            }
            case 3560141: {
                if (!string.equals("time")) break;
                n4 = 7;
                break;
            }
            case 3237038: {
                if (!string.equals("info")) break;
                n4 = 6;
                break;
            }
            case 107332: {
                if (!string.equals("log")) break;
                n4 = 5;
                break;
            }
            case -1047581312: {
                if (!string.equals("countReset")) break;
                n4 = 4;
                break;
            }
            case -1313945289: {
                if (!string.equals("timeLog")) break;
                n4 = 3;
                break;
            }
            case -1313952050: {
                if (!string.equals("timeEnd")) break;
                n4 = 2;
                break;
            }
            case -1408208058: {
                if (!string.equals("assert")) break;
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
            case 12: {
                n3 = 2;
                break;
            }
            case 11: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 3;
                break;
            }
            case 9: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 10;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 0: {
                n3 = 1;
            }
            case 2: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return "Console";
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block15: {
            block16: {
                if (var1_1 > 13) break block15;
                var2_2 = 2;
                switch (var1_1) {
                    default: {
                        throw new IllegalStateException(String.valueOf(var1_1));
                    }
                    case 13: {
                        var3_3 = "timeLog";
                        break block16;
                    }
                    case 12: {
                        var3_3 = "timeEnd";
                        ** GOTO lbl41
                    }
                    case 11: {
                        var3_3 = "time";
                        ** GOTO lbl41
                    }
                    case 10: {
                        var3_3 = "countReset";
                        ** GOTO lbl41
                    }
                    case 9: {
                        var3_3 = "count";
                        ** GOTO lbl41
                    }
                    case 8: {
                        var3_3 = "assert";
                        break block16;
                    }
                    case 7: {
                        var3_3 = "error";
                        ** GOTO lbl41
                    }
                    case 6: {
                        var3_3 = "warn";
                        ** GOTO lbl41
                    }
                    case 5: {
                        var3_3 = "info";
                        ** GOTO lbl41
                    }
                    case 4: {
                        var3_3 = "log";
                        ** GOTO lbl41
                    }
                    case 3: {
                        var3_3 = "debug";
                        ** GOTO lbl41
                    }
                    case 2: {
                        var3_3 = "trace";
lbl41:
                        // 10 sources

                        var2_2 = 1;
                        break block16;
                    }
                    case 1: 
                }
                var2_2 = 0;
                var3_3 = "toSource";
            }
            this.initPrototypeMethod(NativeConsole.CONSOLE_TAG, var1_1, var3_3, var2_2);
            return;
        }
        throw new IllegalStateException(String.valueOf(var1_1));
    }
}

