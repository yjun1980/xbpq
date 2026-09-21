/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeBigInt;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeJSON$StringifyState;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntime$StringIdOrIndex;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.json.JsonParser;
import org.mozilla.javascript.json.JsonParser$ParseException;
import org.mozilla.javascript.k;
import org.mozilla.javascript.l;
import org.mozilla.javascript.xml.XMLObject;

public final class NativeJSON
extends ScriptableObject {
    private static final String JSON_TAG = "JSON";
    private static final int MAX_STRINGIFY_GAP_LENGTH = 10;
    private static final long serialVersionUID = -4567599697595654984L;

    private NativeJSON() {
    }

    public static /* synthetic */ Object a(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeJSON.parse(context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object c(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return NativeJSON.stringify(context, scriptable, scriptable2, objectArray);
    }

    static void init(Scriptable scriptable, boolean bl) {
        NativeJSON nativeJSON = new NativeJSON();
        nativeJSON.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeJSON.setParentScope(scriptable);
        nativeJSON.defineProperty(scriptable, "parse", 2, l.b, 2, 3);
        nativeJSON.defineProperty(scriptable, "stringify", 3, k.b, 2, 3);
        nativeJSON.defineProperty("toSource", (Object)JSON_TAG, 7);
        nativeJSON.defineProperty(SymbolKey.TO_STRING_TAG, (Object)JSON_TAG, 3);
        ScriptableObject.defineProperty(scriptable, JSON_TAG, nativeJSON, 2);
        if (bl) {
            nativeJSON.sealObject();
        }
    }

    private static boolean isObjectArrayLike(Object object) {
        boolean bl = object instanceof NativeArray;
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        if (object instanceof NativeJavaObject) {
            object = ((NativeJavaObject)object).unwrap();
            bl = bl2;
            if (!(object instanceof Collection)) {
                bl = object.getClass().isArray() ? bl2 : false;
            }
            return bl;
        }
        return false;
    }

    private static String ja(Scriptable object, NativeJSON$StringifyState nativeJSON$StringifyState) {
        Object object2;
        Object object3;
        boolean bl = object instanceof Wrapper;
        Object var13_3 = null;
        if (bl) {
            object2 = object3 = ((Wrapper)object).unwrap();
        } else {
            object3 = object;
            object2 = null;
        }
        int n2 = nativeJSON$StringifyState.stack.search(object3);
        int n3 = 0;
        if (n2 == -1) {
            nativeJSON$StringifyState.stack.push(object3);
            String string = nativeJSON$StringifyState.indent;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(nativeJSON$StringifyState.indent);
            ((StringBuilder)object3).append(nativeJSON$StringifyState.gap);
            nativeJSON$StringifyState.indent = ((StringBuilder)object3).toString();
            LinkedList<Object> linkedList = new LinkedList<Object>();
            Object object4 = object;
            if (object2 != null) {
                int n4;
                if (object2.getClass().isArray()) {
                    n3 = Array.getLength(object2);
                    object3 = new Object[n3];
                    for (n4 = 0; n4 < n3; ++n4) {
                        object3[n4] = Context.javaToJS(Array.get(object2, n4), nativeJSON$StringifyState.scope, nativeJSON$StringifyState.cx);
                    }
                } else {
                    object3 = var13_3;
                    if (object2 instanceof Collection) {
                        object3 = (Collection)object2;
                        object4 = new Object[object3.size()];
                        object2 = object3.iterator();
                        n4 = n3;
                        while (true) {
                            object3 = object4;
                            if (!object2.hasNext()) break;
                            object4[n4] = Context.javaToJS(object2.next(), nativeJSON$StringifyState.scope, nativeJSON$StringifyState.cx);
                            ++n4;
                        }
                    }
                }
                object4 = object;
                if (object3 != null) {
                    object4 = nativeJSON$StringifyState.cx.newArray(nativeJSON$StringifyState.scope, (Object[])object3);
                }
            }
            long l2 = ((NativeArray)object4).getLength();
            for (long i2 = 0L; i2 < l2; ++i2) {
                object = i2 > Integer.MAX_VALUE ? Long.toString(i2) : Integer.valueOf((int)i2);
                object = object3 = NativeJSON.str(object, (Scriptable)object4, nativeJSON$StringifyState);
                if (object3 == Undefined.instance) {
                    object = "null";
                }
                linkedList.add(object);
            }
            if (linkedList.isEmpty()) {
                object = "[]";
            } else if (nativeJSON$StringifyState.gap.length() == 0) {
                object = new StringBuilder();
                ((StringBuilder)object).append('[');
                ((StringBuilder)object).append(NativeJSON.join(linkedList, ","));
                ((StringBuilder)object).append(']');
                object = ((StringBuilder)object).toString();
            } else {
                object = a.c(",\n");
                ((StringBuilder)object).append(nativeJSON$StringifyState.indent);
                object3 = NativeJSON.join(linkedList, ((StringBuilder)object).toString());
                object = a.c("[\n");
                ((StringBuilder)object).append(nativeJSON$StringifyState.indent);
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append('\n');
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(']');
                object = ((StringBuilder)object).toString();
            }
            nativeJSON$StringifyState.stack.pop();
            nativeJSON$StringifyState.indent = string;
            return object;
        }
        throw ScriptRuntime.typeErrorById("msg.cyclic.value", object3.getClass().getName());
    }

    private static Object javaToJSON(Object object, NativeJSON$StringifyState nativeJSON$StringifyState) {
        object = Context.javaToJS(nativeJSON$StringifyState.cx.getJavaToJSONConverter().apply(object), nativeJSON$StringifyState.scope, nativeJSON$StringifyState.cx);
        NativeObject nativeObject = new NativeObject();
        nativeObject.setParentScope(nativeJSON$StringifyState.scope);
        nativeObject.setPrototype(ScriptableObject.getObjectPrototype(nativeJSON$StringifyState.scope));
        nativeObject.defineProperty("", object, 0);
        return NativeJSON.str("", nativeObject, nativeJSON$StringifyState);
    }

    private static String jo(Scriptable entry, NativeJSON$StringifyState nativeJSON$StringifyState) {
        Object object;
        Object object2;
        if (entry instanceof Wrapper) {
            object = object2 = ((Wrapper)((Object)entry)).unwrap();
        } else {
            object = null;
            object2 = entry;
        }
        int n2 = nativeJSON$StringifyState.stack.search(object2);
        int n3 = 0;
        if (n2 == -1) {
            Object object3;
            nativeJSON$StringifyState.stack.push(object2);
            if (object instanceof Map) {
                entry = (Map)object;
                object = nativeJSON$StringifyState.cx.newObject(nativeJSON$StringifyState.scope);
                object2 = entry.entrySet().iterator();
                while (true) {
                    entry = object;
                    if (!object2.hasNext()) break;
                    entry = object2.next();
                    if (entry.getKey() instanceof Symbol) continue;
                    object3 = Context.javaToJS(entry.getValue(), nativeJSON$StringifyState.scope, nativeJSON$StringifyState.cx);
                    boolean bl = entry.getKey() instanceof String;
                    entry = entry.getKey();
                    if (bl) {
                        entry = (String)((Object)entry);
                        n2 = 5;
                    } else {
                        entry = entry.toString();
                        n2 = 0;
                    }
                    try {
                        ScriptableObject.defineProperty((Scriptable)object, (String)((Object)entry), object3, n2);
                    }
                    catch (EcmaError ecmaError) {}
                }
            }
            String string = nativeJSON$StringifyState.indent;
            object = new StringBuilder();
            ((StringBuilder)object).append(nativeJSON$StringifyState.indent);
            ((StringBuilder)object).append(nativeJSON$StringifyState.gap);
            nativeJSON$StringifyState.indent = ((StringBuilder)object).toString();
            object = nativeJSON$StringifyState.propertyList;
            if (object == null) {
                object = entry.getIds();
            }
            LinkedList<Object> linkedList = new LinkedList<Object>();
            int n4 = ((Object[])object).length;
            for (n2 = n3; n2 < n4; ++n2) {
                object2 = object[n2];
                Object object4 = NativeJSON.str(object2, (Scriptable)((Object)entry), nativeJSON$StringifyState);
                if (object4 == Undefined.instance) continue;
                object2 = object3 = r.c(new StringBuilder(), NativeJSON.quote(object2.toString()), ":");
                if (nativeJSON$StringifyState.gap.length() > 0) {
                    object2 = e.c((String)object3, " ");
                }
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(object4);
                linkedList.add(((StringBuilder)object3).toString());
            }
            if (linkedList.isEmpty()) {
                entry = "{}";
            } else if (nativeJSON$StringifyState.gap.length() == 0) {
                entry = new StringBuilder();
                ((StringBuilder)((Object)entry)).append('{');
                ((StringBuilder)((Object)entry)).append(NativeJSON.join(linkedList, ","));
                ((StringBuilder)((Object)entry)).append('}');
                entry = ((StringBuilder)((Object)entry)).toString();
            } else {
                entry = a.c(",\n");
                ((StringBuilder)((Object)entry)).append(nativeJSON$StringifyState.indent);
                entry = NativeJSON.join(linkedList, ((StringBuilder)((Object)entry)).toString());
                object = a.c("{\n");
                ((StringBuilder)object).append(nativeJSON$StringifyState.indent);
                ((StringBuilder)object).append((String)((Object)entry));
                ((StringBuilder)object).append('\n');
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append('}');
                entry = ((StringBuilder)object).toString();
            }
            nativeJSON$StringifyState.stack.pop();
            nativeJSON$StringifyState.indent = string;
            return entry;
        }
        throw ScriptRuntime.typeErrorById("msg.cyclic.value", object2.getClass().getName());
    }

    private static String join(Collection<Object> object, String string) {
        if (object != null && !object.isEmpty()) {
            if (!(object = object.iterator()).hasNext()) {
                return "";
            }
            StringBuilder stringBuilder = new StringBuilder(object.next().toString());
            while (object.hasNext()) {
                stringBuilder.append(string);
                stringBuilder.append(object.next());
            }
            return stringBuilder.toString();
        }
        return "";
    }

    private static Object parse(Context object, Scriptable scriptable, String string) {
        try {
            JsonParser jsonParser = new JsonParser((Context)object, scriptable);
            object = jsonParser.parseValue(string);
            return object;
        }
        catch (JsonParser$ParseException jsonParser$ParseException) {
            throw ScriptRuntime.constructError("SyntaxError", jsonParser$ParseException.getMessage());
        }
    }

    public static Object parse(Context context, Scriptable scriptable, String object, Callable callable) {
        Object object2 = NativeJSON.parse(context, scriptable, (String)object);
        object = context.newObject(scriptable);
        object.put("", (Scriptable)object, object2);
        return NativeJSON.walk(context, scriptable, callable, (Scriptable)object, "");
    }

    private static Object parse(Context context, Scriptable scriptable, Scriptable object, Object[] objectArray) {
        String string = ScriptRuntime.toString(objectArray, 0);
        object = objectArray.length > 1 ? objectArray[1] : null;
        if (object instanceof Callable) {
            return NativeJSON.parse(context, scriptable, string, (Callable)object);
        }
        return NativeJSON.parse(context, scriptable, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String quote(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() + 2);
        stringBuilder.append('\"');
        int n2 = string.length();
        int n3 = 0;
        while (true) {
            block12: {
                String string2;
                block13: {
                    block8: {
                        block9: {
                            block10: {
                                block11: {
                                    if (n3 >= n2) {
                                        stringBuilder.append('\"');
                                        return stringBuilder.toString();
                                    }
                                    char c2 = string.charAt(n3);
                                    if (c2 == '\f') break block8;
                                    if (c2 == '\r') break block9;
                                    if (c2 == '\"') break block10;
                                    if (c2 == '\\') break block11;
                                    switch (c2) {
                                        default: {
                                            if (c2 < ' ') {
                                                stringBuilder.append("\\u");
                                                string2 = String.format("%04x", c2);
                                                break;
                                            }
                                            stringBuilder.append(c2);
                                            break block12;
                                        }
                                        case '\n': {
                                            string2 = "\\n";
                                            break;
                                        }
                                        case '\t': {
                                            string2 = "\\t";
                                            break;
                                        }
                                        case '\b': {
                                            string2 = "\\b";
                                            break;
                                        }
                                    }
                                    break block13;
                                }
                                string2 = "\\\\";
                                break block13;
                            }
                            string2 = "\\\"";
                            break block13;
                        }
                        string2 = "\\r";
                        break block13;
                    }
                    string2 = "\\f";
                }
                stringBuilder.append(string2);
            }
            ++n3;
        }
    }

    private static String repeat(char c2, int n2) {
        char[] cArray = new char[n2];
        Arrays.fill(cArray, c2);
        return new String(cArray);
    }

    private static Object str(Object object, Scriptable object2, NativeJSON$StringifyState nativeJSON$StringifyState) {
        Object object3;
        Scriptable scriptable;
        int n2;
        Object object4;
        Object object5;
        boolean bl = object instanceof String;
        Object var10_4 = null;
        if (bl) {
            object5 = (String)object;
            object4 = ScriptableObject.getProperty((Scriptable)object2, (String)object5);
            n2 = 0;
        } else {
            n2 = ((Number)object).intValue();
            object4 = ScriptableObject.getProperty((Scriptable)object2, n2);
            object5 = null;
        }
        if (object4 instanceof Scriptable && ScriptableObject.hasProperty(scriptable = (Scriptable)object4, "toJSON")) {
            object3 = object4;
            if (ScriptableObject.getProperty(scriptable, "toJSON") instanceof Callable) {
                object4 = nativeJSON$StringifyState.cx;
                object3 = object5;
                if (object5 == null) {
                    object3 = Integer.toString(n2);
                }
                object3 = ScriptableObject.callMethod((Context)object4, scriptable, "toJSON", new Object[]{object3});
            }
        } else {
            object3 = object4;
            if (object4 instanceof BigInteger) {
                scriptable = ScriptRuntime.toObject(nativeJSON$StringifyState.cx, nativeJSON$StringifyState.scope, object4);
                object3 = object4;
                if (ScriptableObject.hasProperty(scriptable, "toJSON")) {
                    object3 = object4;
                    if (ScriptableObject.getProperty(scriptable, "toJSON") instanceof Callable) {
                        object4 = nativeJSON$StringifyState.cx;
                        object3 = object5;
                        if (object5 == null) {
                            object3 = Integer.toString(n2);
                        }
                        object3 = ScriptableObject.callMethod((Context)object4, scriptable, "toJSON", new Object[]{object3});
                    }
                }
            }
        }
        object4 = nativeJSON$StringifyState.replacer;
        object5 = object3;
        if (object4 != null) {
            object5 = object4.call(nativeJSON$StringifyState.cx, nativeJSON$StringifyState.scope, (Scriptable)object2, new Object[]{object, object3});
        }
        if (ScriptRuntime.isSymbol(object5)) {
            return Undefined.instance;
        }
        if (object5 instanceof NativeNumber) {
            object = ScriptRuntime.toNumber(object5);
            object2 = var10_4;
        } else if (object5 instanceof NativeString) {
            object = ScriptRuntime.toString(object5);
            object2 = var10_4;
        } else if (object5 instanceof NativeBoolean) {
            object = ((NativeBoolean)object5).getDefaultValue(ScriptRuntime.BooleanClass);
            object2 = var10_4;
        } else if (nativeJSON$StringifyState.cx.getLanguageVersion() >= 200 && object5 instanceof NativeBigInt) {
            object = ((NativeBigInt)object5).getDefaultValue(ScriptRuntime.BigIntegerClass);
            object2 = var10_4;
        } else if (object5 instanceof NativeJavaObject) {
            object3 = ((NativeJavaObject)object5).unwrap();
            object2 = var10_4;
            object = object5;
            if (!(object3 instanceof Map)) {
                object2 = var10_4;
                object = object5;
                if (!(object3 instanceof Collection)) {
                    object2 = var10_4;
                    object = object5;
                    if (!object3.getClass().isArray()) {
                        object5 = object = object3;
                        object2 = object;
                        object = object5;
                    }
                }
            }
        } else {
            object2 = var10_4;
            object = object5;
            if (object5 instanceof XMLObject) {
                object = object5.toString();
                object2 = var10_4;
            }
        }
        object5 = "null";
        if (object == null) {
            return "null";
        }
        if (object.equals(Boolean.TRUE)) {
            return "true";
        }
        if (object.equals(Boolean.FALSE)) {
            return "false";
        }
        if (object instanceof CharSequence) {
            return NativeJSON.quote(object.toString());
        }
        if (object instanceof Number) {
            if (!(object instanceof BigInteger)) {
                double d2 = ((Number)object).doubleValue();
                object2 = object5;
                if (!Double.isNaN(d2)) {
                    object2 = object5;
                    if (d2 != Double.POSITIVE_INFINITY) {
                        object2 = object5;
                        if (d2 != Double.NEGATIVE_INFINITY) {
                            object2 = ScriptRuntime.toString(object);
                        }
                    }
                }
                return object2;
            }
            throw ScriptRuntime.typeErrorById("msg.json.cant.serialize", "BigInt");
        }
        if (object2 != null) {
            return NativeJSON.javaToJSON(object, nativeJSON$StringifyState);
        }
        if (object instanceof Scriptable && !(object instanceof Callable)) {
            bl = NativeJSON.isObjectArrayLike(object);
            object = (Scriptable)object;
            if (bl) {
                return NativeJSON.ja((Scriptable)object, nativeJSON$StringifyState);
            }
            return NativeJSON.jo((Scriptable)object, nativeJSON$StringifyState);
        }
        return Undefined.instance;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Object stringify(Context object, Scriptable scriptable, Object object2, Object object3, Object object4) {
        int n2;
        Object[] objectArray;
        Object object5;
        if (object3 instanceof Callable) {
            object5 = (Callable)object3;
            objectArray = null;
        } else if (!(object3 instanceof NativeArray)) {
            object5 = null;
            objectArray = null;
        } else {
            object5 = new LinkedHashSet();
            Object object6 = (NativeArray)object3;
            objectArray = ((NativeArray)object6).getIndexIds().iterator();
            while (objectArray.hasNext()) {
                object3 = ((NativeArray)object6).get(objectArray.next(), (Scriptable)object6);
                if (!(object3 instanceof String)) {
                    if (!(object3 instanceof Number) && !(object3 instanceof NativeString) && !(object3 instanceof NativeNumber)) continue;
                    object3 = ScriptRuntime.toString(object3);
                }
                ((AbstractCollection)object5).add(object3);
            }
            objectArray = new Object[((AbstractCollection)object5).size()];
            object6 = ((AbstractCollection)object5).iterator();
            n2 = 0;
            while (object6.hasNext()) {
                ScriptRuntime$StringIdOrIndex scriptRuntime$StringIdOrIndex = ScriptRuntime.toStringIdOrIndex(object6.next());
                object3 = object5 = scriptRuntime$StringIdOrIndex.stringId;
                if (object5 == null) {
                    object3 = scriptRuntime$StringIdOrIndex.index;
                }
                objectArray[n2] = object3;
                ++n2;
            }
            object5 = null;
        }
        object3 = object4 instanceof NativeNumber ? Double.valueOf(ScriptRuntime.toNumber(object4)) : (object4 instanceof NativeString ? ScriptRuntime.toString(object4) : object4);
        if (object3 instanceof Number) {
            n2 = Math.min(10, (int)ScriptRuntime.toInteger(object3));
            object3 = n2 > 0 ? NativeJSON.repeat(' ', n2) : "";
        } else if (object3 instanceof String) {
            object3 = object4 = (String)object3;
            if (((String)object4).length() > 10) {
                object3 = ((String)object4).substring(0, 10);
            }
        } else {
            object3 = "";
        }
        object = new NativeJSON$StringifyState((Context)object, scriptable, "", (String)object3, (Callable)object5, objectArray);
        object3 = new NativeObject();
        ((ScriptableObject)object3).setParentScope(scriptable);
        ((ScriptableObject)object3).setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        ((ScriptableObject)object3).defineProperty("", object2, 0);
        return NativeJSON.str("", (Scriptable)object3, (NativeJSON$StringifyState)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static Object stringify(Context context, Scriptable scriptable, Scriptable object, Object[] object2) {
        void var3_6;
        Object object3;
        object = Undefined.instance;
        int n2 = ((Object[])object2).length;
        Object object4 = null;
        Object object5 = null;
        if (n2 > 0) {
            object = object3 = object2[0];
            if (((Object[])object2).length > 1) {
                object4 = object2[1];
                object = object5;
                if (((Object[])object2).length > 2) {
                    object = object2[2];
                }
                Object object6 = object4;
                object5 = object3;
                object3 = object;
                return NativeJSON.stringify(context, scriptable, object5, var3_6, object3);
            }
        }
        object3 = null;
        object5 = object;
        Object object7 = object4;
        return NativeJSON.stringify(context, scriptable, object5, var3_6, object3);
    }

    private static Object walk(Context context, Scriptable scriptable, Callable callable, Scriptable scriptable2, Object object) {
        Object object2;
        block10: {
            object2 = object instanceof Number ? scriptable2.get(((Number)object).intValue(), scriptable2) : scriptable2.get((String)object, scriptable2);
            if (!(object2 instanceof Scriptable)) break block10;
            Scriptable scriptable3 = (Scriptable)object2;
            if (scriptable3 instanceof NativeArray) {
                long l2 = ((NativeArray)scriptable3).getLength();
                for (long i2 = 0L; i2 < l2; ++i2) {
                    Object object3;
                    if (i2 > Integer.MAX_VALUE) {
                        object3 = Long.toString(i2);
                        Object object4 = NativeJSON.walk(context, scriptable, callable, scriptable3, object3);
                        if (object4 == Undefined.instance) {
                            scriptable3.delete((String)object3);
                            continue;
                        }
                        scriptable3.put((String)object3, scriptable3, object4);
                        continue;
                    }
                    int n2 = (int)i2;
                    object3 = NativeJSON.walk(context, scriptable, callable, scriptable3, n2);
                    if (object3 == Undefined.instance) {
                        scriptable3.delete(n2);
                        continue;
                    }
                    scriptable3.put(n2, scriptable3, object3);
                }
            } else {
                for (Object object5 : scriptable3.getIds()) {
                    Object object6 = NativeJSON.walk(context, scriptable, callable, scriptable3, object5);
                    if (object6 == Undefined.instance) {
                        if (object5 instanceof Number) {
                            scriptable3.delete(((Number)object5).intValue());
                            continue;
                        }
                        scriptable3.delete((String)object5);
                        continue;
                    }
                    if (object5 instanceof Number) {
                        scriptable3.put(((Number)object5).intValue(), scriptable3, object6);
                        continue;
                    }
                    scriptable3.put((String)object5, scriptable3, object6);
                }
            }
        }
        return callable.call(context, scriptable, scriptable2, new Object[]{object, object2});
    }

    @Override
    public String getClassName() {
        return JSON_TAG;
    }
}

