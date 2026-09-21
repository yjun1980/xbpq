/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.BoundFunction;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeGlobal;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.a;
import org.mozilla.javascript.debug.DebuggableObject;

final class EqualObjectGraphs {
    static final boolean $assertionsDisabled = false;
    private static final ThreadLocal<EqualObjectGraphs> instance = new ThreadLocal();
    private static final Set<Class<?>> valueClasses = Collections.unmodifiableSet(new HashSet<Class>(Arrays.asList(Boolean.class, Byte.class, Character.class, Double.class, Float.class, Integer.class, Long.class, Short.class)));
    private final Map<Object, Object> currentlyCompared;
    private final Map<Object, Object> knownEquals = new IdentityHashMap<Object, Object>();

    EqualObjectGraphs() {
        this.currentlyCompared = new IdentityHashMap<Object, Object>();
    }

    public static /* synthetic */ int a(Object object, Object object2) {
        return EqualObjectGraphs.lambda$getSortedIds$0(object, object2);
    }

    private boolean equalGraphsNoMemo(Object object, Object object2) {
        boolean bl = object instanceof Wrapper;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = true;
        boolean bl6 = true;
        boolean bl7 = true;
        boolean bl8 = true;
        if (bl) {
            bl2 = object2 instanceof Wrapper && this.equalGraphs(((Wrapper)object).unwrap(), ((Wrapper)object2).unwrap()) ? bl8 : false;
            return bl2;
        }
        if (object instanceof NativeJavaTopPackage) {
            return object2 instanceof NativeJavaTopPackage;
        }
        if (object instanceof Scriptable) {
            if (!(object2 instanceof Scriptable) || !this.equalScriptables((Scriptable)object, (Scriptable)object2)) {
                bl2 = false;
            }
            return bl2;
        }
        if (object instanceof SymbolKey) {
            bl2 = object2 instanceof SymbolKey && this.equalGraphs(((SymbolKey)object).getName(), ((SymbolKey)object2).getName()) ? bl3 : false;
            return bl2;
        }
        if (object instanceof Object[]) {
            bl2 = object2 instanceof Object[] && this.equalObjectArrays((Object[])object, (Object[])object2) ? bl4 : false;
            return bl2;
        }
        if (object.getClass().isArray()) {
            return Objects.deepEquals(object, object2);
        }
        if (object instanceof List) {
            bl2 = object2 instanceof List && this.equalLists((List)object, (List)object2) ? bl5 : false;
            return bl2;
        }
        if (object instanceof Map) {
            bl2 = object2 instanceof Map && this.equalMaps((Map)object, (Map)object2) ? bl6 : false;
            return bl2;
        }
        if (object instanceof Set) {
            bl2 = object2 instanceof Set && this.equalSets((Set)object, (Set)object2) ? bl7 : false;
            return bl2;
        }
        if (object instanceof NativeGlobal) {
            return object2 instanceof NativeGlobal;
        }
        if (object instanceof JavaAdapter) {
            return object2 instanceof JavaAdapter;
        }
        return object.equals(object2);
    }

    private static boolean equalInterpretedFunctions(InterpretedFunction interpretedFunction, InterpretedFunction interpretedFunction2) {
        return Objects.equals(interpretedFunction.getEncodedSource(), interpretedFunction2.getEncodedSource());
    }

    private boolean equalLists(List<?> object, List<?> object2) {
        if (object.size() != object2.size()) {
            return false;
        }
        object = object.iterator();
        object2 = object2.iterator();
        while (object.hasNext() && object2.hasNext()) {
            if (this.equalGraphs(object.next(), object2.next())) continue;
            return false;
        }
        return true;
    }

    private boolean equalMaps(Map<?, ?> object, Map<?, ?> object2) {
        if (object.size() != object2.size()) {
            return false;
        }
        object = EqualObjectGraphs.sortedEntries(object);
        object2 = EqualObjectGraphs.sortedEntries(object2);
        while (object.hasNext() && object2.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Map.Entry entry2 = (Map.Entry)object2.next();
            if (this.equalGraphs(entry.getKey(), entry2.getKey()) && this.equalGraphs(entry.getValue(), entry2.getValue())) continue;
            return false;
        }
        return true;
    }

    private boolean equalObjectArrays(Object[] objectArray, Object[] objectArray2) {
        if (objectArray.length != objectArray2.length) {
            return false;
        }
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            if (this.equalGraphs(objectArray[i2], objectArray2[i2])) continue;
            return false;
        }
        return true;
    }

    private boolean equalScriptables(Scriptable scriptable, Scriptable scriptable2) {
        Object[] objectArray = EqualObjectGraphs.getSortedIds(scriptable);
        Object[] objectArray2 = EqualObjectGraphs.getSortedIds(scriptable2);
        boolean bl = this.equalObjectArrays(objectArray, objectArray2);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        if (!bl) {
            return false;
        }
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.equalGraphs(EqualObjectGraphs.getValue(scriptable, objectArray[i2]), EqualObjectGraphs.getValue(scriptable2, objectArray2[i2]))) continue;
            return false;
        }
        if (!this.equalGraphs(scriptable.getPrototype(), scriptable2.getPrototype())) {
            return false;
        }
        if (!this.equalGraphs(scriptable.getParentScope(), scriptable2.getParentScope())) {
            return false;
        }
        if (scriptable instanceof NativeContinuation) {
            bl = bl7;
            if (scriptable2 instanceof NativeContinuation) {
                bl = bl7;
                if (NativeContinuation.equalImplementations((NativeContinuation)scriptable, (NativeContinuation)scriptable2)) {
                    bl = true;
                }
            }
            return bl;
        }
        if (scriptable instanceof NativeJavaPackage) {
            return scriptable.equals(scriptable2);
        }
        if (scriptable instanceof IdFunctionObject) {
            bl = bl2;
            if (scriptable2 instanceof IdFunctionObject) {
                bl = bl2;
                if (IdFunctionObject.equalObjectGraphs((IdFunctionObject)scriptable, (IdFunctionObject)scriptable2, this)) {
                    bl = true;
                }
            }
            return bl;
        }
        if (scriptable instanceof InterpretedFunction) {
            bl = bl3;
            if (scriptable2 instanceof InterpretedFunction) {
                bl = bl3;
                if (EqualObjectGraphs.equalInterpretedFunctions((InterpretedFunction)scriptable, (InterpretedFunction)scriptable2)) {
                    bl = true;
                }
            }
            return bl;
        }
        if (scriptable instanceof ArrowFunction) {
            bl = bl4;
            if (scriptable2 instanceof ArrowFunction) {
                bl = bl4;
                if (ArrowFunction.equalObjectGraphs((ArrowFunction)scriptable, (ArrowFunction)scriptable2, this)) {
                    bl = true;
                }
            }
            return bl;
        }
        if (scriptable instanceof BoundFunction) {
            bl = bl5;
            if (scriptable2 instanceof BoundFunction) {
                bl = bl5;
                if (BoundFunction.equalObjectGraphs((BoundFunction)scriptable, (BoundFunction)scriptable2, this)) {
                    bl = true;
                }
            }
            return bl;
        }
        if (scriptable instanceof NativeSymbol) {
            bl = bl6;
            if (scriptable2 instanceof NativeSymbol) {
                bl = bl6;
                if (this.equalGraphs(((NativeSymbol)scriptable).getKey(), ((NativeSymbol)scriptable2).getKey())) {
                    bl = true;
                }
            }
            return bl;
        }
        return true;
    }

    private boolean equalSets(Set<?> set, Set<?> set2) {
        return this.equalObjectArrays(EqualObjectGraphs.sortedSet(set), EqualObjectGraphs.sortedSet(set2));
    }

    private static Object[] getIds(Scriptable scriptable) {
        if (scriptable instanceof ScriptableObject) {
            return ((ScriptableObject)scriptable).getIds(true, true);
        }
        if (scriptable instanceof DebuggableObject) {
            return ((DebuggableObject)((Object)scriptable)).getAllIds();
        }
        return scriptable.getIds();
    }

    private static Object[] getSortedIds(Scriptable objectArray) {
        objectArray = EqualObjectGraphs.getIds((Scriptable)objectArray);
        Arrays.sort(objectArray, a.a);
        return objectArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String getSymbolName(Symbol symbol) {
        if (symbol instanceof SymbolKey) {
            symbol = (SymbolKey)symbol;
            return ((SymbolKey)symbol).getName();
        }
        if (!(symbol instanceof NativeSymbol)) throw new ClassCastException();
        symbol = ((NativeSymbol)symbol).getKey();
        return ((SymbolKey)symbol).getName();
    }

    private static Object getValue(Scriptable scriptable, Object object) {
        if (object instanceof Symbol) {
            return ScriptableObject.getProperty(scriptable, (Symbol)object);
        }
        if (object instanceof Integer) {
            return ScriptableObject.getProperty(scriptable, (Integer)object);
        }
        if (object instanceof String) {
            return ScriptableObject.getProperty(scriptable, (String)object);
        }
        throw new ClassCastException();
    }

    private static /* synthetic */ int lambda$getSortedIds$0(Object object, Object object2) {
        if (object instanceof Integer) {
            if (object2 instanceof Integer) {
                return ((Integer)object).compareTo((Integer)object2);
            }
            if (object2 instanceof String || object2 instanceof Symbol) {
                return -1;
            }
        } else if (object instanceof String) {
            if (object2 instanceof String) {
                return ((String)object).compareTo((String)object2);
            }
            if (object2 instanceof Integer) {
                return 1;
            }
            if (object2 instanceof Symbol) {
                return -1;
            }
        } else if (object instanceof Symbol) {
            if (object2 instanceof Symbol) {
                return EqualObjectGraphs.getSymbolName((Symbol)object).compareTo(EqualObjectGraphs.getSymbolName((Symbol)object2));
            }
            if (object2 instanceof Integer || object2 instanceof String) {
                return 1;
            }
        }
        throw new ClassCastException();
    }

    private static Iterator<Map.Entry> sortedEntries(Map treeMap) {
        if (!(treeMap instanceof SortedMap)) {
            treeMap = new TreeMap(treeMap);
        }
        return treeMap.entrySet().iterator();
    }

    private static Object[] sortedSet(Set<?> objectArray) {
        objectArray = objectArray.toArray();
        Arrays.sort(objectArray);
        return objectArray;
    }

    static <T> T withThreadLocal(Function<EqualObjectGraphs, T> function) {
        ThreadLocal<EqualObjectGraphs> threadLocal = instance;
        EqualObjectGraphs equalObjectGraphs = threadLocal.get();
        if (equalObjectGraphs == null) {
            equalObjectGraphs = new EqualObjectGraphs();
            threadLocal.set(equalObjectGraphs);
            try {
                function = function.apply(equalObjectGraphs);
                threadLocal.set(null);
            }
            catch (Throwable throwable) {
                instance.set(null);
                throw throwable;
            }
            return (T)function;
        }
        return function.apply(equalObjectGraphs);
    }

    boolean equalGraphs(Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (object != null && object2 != null) {
            if (object instanceof String) {
                if (object2 instanceof ConsString) {
                    return object.equals(object2.toString());
                }
                return object.equals(object2);
            }
            if (object instanceof ConsString) {
                if (!(object2 instanceof String) && !(object2 instanceof ConsString)) {
                    return false;
                }
                return object.toString().equals(object2.toString());
            }
            if (valueClasses.contains(object.getClass())) {
                return object.equals(object2);
            }
            Object object3 = this.currentlyCompared.get(object);
            if (object3 == object2) {
                return true;
            }
            if (object3 != null) {
                return false;
            }
            object3 = this.knownEquals.get(object);
            if (object3 == object2) {
                return true;
            }
            if (object3 != null) {
                return false;
            }
            if (this.knownEquals.get(object2) != null) {
                return false;
            }
            this.currentlyCompared.put(object, object2);
            boolean bl = this.equalGraphsNoMemo(object, object2);
            if (bl) {
                this.knownEquals.put(object, object2);
                this.knownEquals.put(object2, object);
            }
            this.currentlyCompared.remove(object);
            return bl;
        }
        return false;
    }
}

