/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module;

import com.github.catvod.spider.merge.C.a;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.commonjs.module.ModuleScope;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.ModuleScriptProvider;

public class Require
extends BaseFunction {
    private static final ThreadLocal<Map<String, Scriptable>> loadingModuleInterfaces = new ThreadLocal();
    private static final long serialVersionUID = 1L;
    private final Map<String, Scriptable> exportedModuleInterfaces = new ConcurrentHashMap<String, Scriptable>();
    private final Object loadLock = new Object();
    private Scriptable mainExports;
    private String mainModuleId = null;
    private final ModuleScriptProvider moduleScriptProvider;
    private final Scriptable nativeScope;
    private final Scriptable paths;
    private final Script postExec;
    private final Script preExec;
    private final boolean sandboxed;

    public Require(Context object, Scriptable scriptable, ModuleScriptProvider moduleScriptProvider, Script script, Script script2, boolean bl) {
        this.moduleScriptProvider = moduleScriptProvider;
        this.nativeScope = scriptable;
        this.sandboxed = bl;
        this.preExec = script;
        this.postExec = script2;
        this.setPrototype(ScriptableObject.getFunctionPrototype(scriptable));
        if (!bl) {
            this.paths = object = ((Context)object).newArray(scriptable, 0);
            Require.defineReadOnlyProperty(this, "paths", object);
        } else {
            this.paths = null;
        }
    }

    private static void defineReadOnlyProperty(ScriptableObject scriptableObject, String string, Object object) {
        ScriptableObject.putProperty((Scriptable)scriptableObject, string, object);
        scriptableObject.setAttributes(string, 5);
    }

    private Scriptable executeModuleScript(Context context, String object, Scriptable scriptable, ModuleScript moduleScript, boolean bl) {
        ScriptableObject scriptableObject = (ScriptableObject)context.newObject(this.nativeScope);
        URI uRI = moduleScript.getUri();
        URI uRI2 = moduleScript.getBase();
        Require.defineReadOnlyProperty(scriptableObject, "id", object);
        if (!this.sandboxed) {
            Require.defineReadOnlyProperty(scriptableObject, "uri", uRI.toString());
        }
        object = new ModuleScope(this.nativeScope, uRI, uRI2);
        object.put("exports", (Scriptable)object, (Object)scriptable);
        object.put("module", (Scriptable)object, (Object)scriptableObject);
        scriptableObject.put("exports", (Scriptable)scriptableObject, (Object)scriptable);
        this.install((Scriptable)object);
        if (bl) {
            Require.defineReadOnlyProperty(this, "main", scriptableObject);
        }
        Require.executeOptionalScript(this.preExec, context, (Scriptable)object);
        moduleScript.getScript().exec(context, (Scriptable)object);
        Require.executeOptionalScript(this.postExec, context, (Scriptable)object);
        return ScriptRuntime.toObject(context, this.nativeScope, ScriptableObject.getProperty((Scriptable)scriptableObject, "exports"));
    }

    private static void executeOptionalScript(Script script, Context context, Scriptable scriptable) {
        if (script != null) {
            script.exec(context, scriptable);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Scriptable getExportedModuleInterface(Context object, String string, URI hashMap, URI object2, boolean bl) {
        Object object3;
        Map<String, Scriptable> map = this.exportedModuleInterfaces.get(string);
        if (map != null) {
            if (!bl) {
                return map;
            }
            throw new IllegalStateException("Attempt to set main module after it was loaded");
        }
        ThreadLocal<Map<String, Scriptable>> threadLocal = loadingModuleInterfaces;
        map = threadLocal.get();
        if (map != null && (object3 = (Scriptable)map.get(string)) != null) {
            return object3;
        }
        object3 = this.loadLock;
        synchronized (object3) {
            Throwable throwable2222222;
            boolean bl2;
            block18: {
                block17: {
                    Object object4 = this.exportedModuleInterfaces.get(string);
                    if (object4 != null) {
                        return object4;
                    }
                    object4 = this.getModule((Context)object, string, (URI)((Object)hashMap), (URI)object2);
                    if (this.sandboxed && !((ModuleScript)object4).isSandboxed()) {
                        hashMap = this.nativeScope;
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Module \"");
                        ((StringBuilder)object2).append(string);
                        ((StringBuilder)object2).append("\" is not contained in sandbox.");
                        throw ScriptRuntime.throwError((Context)object, hashMap, ((StringBuilder)object2).toString());
                    }
                    object2 = ((Context)object).newObject(this.nativeScope);
                    bl2 = map == null;
                    hashMap = map;
                    if (bl2) {
                        hashMap = new HashMap<String, Object>();
                        threadLocal.set(hashMap);
                    }
                    hashMap.put(string, object2);
                    map = this.executeModuleScript((Context)object, string, (Scriptable)object2, (ModuleScript)object4, bl);
                    object = object2;
                    if (object2 == map) break block17;
                    {
                        catch (Throwable throwable2222222) {
                            break block18;
                        }
                        catch (RuntimeException runtimeException) {}
                        {
                            hashMap.remove(string);
                            throw runtimeException;
                        }
                    }
                    {
                        hashMap.put(string, map);
                        object = map;
                    }
                }
                if (bl2) {
                    this.exportedModuleInterfaces.putAll(hashMap);
                    threadLocal.set(null);
                }
                return object;
            }
            if (bl2) {
                this.exportedModuleInterfaces.putAll(hashMap);
                loadingModuleInterfaces.set(null);
            }
            throw throwable2222222;
        }
    }

    private ModuleScript getModule(Context context, String string, URI serializable, URI object) {
        block4: {
            serializable = this.moduleScriptProvider.getModuleScript(context, string, (URI)serializable, (URI)object, this.paths);
            if (serializable == null) break block4;
            return serializable;
        }
        try {
            object = this.nativeScope;
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Module \"");
            ((StringBuilder)serializable).append(string);
            ((StringBuilder)serializable).append("\" not found.");
            throw ScriptRuntime.throwError(context, (Scriptable)object, ((StringBuilder)serializable).toString());
        }
        catch (Exception exception) {
            throw Context.throwAsScriptRuntimeEx(exception);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Object call(Context var1_1, Scriptable var2_2, Scriptable var3_3, Object[] var4_4) {
        block7: {
            block10: {
                block9: {
                    block8: {
                        if (var4_4 == null || ((Object[])var4_4).length < 1) break block7;
                        if ((var4_4 = (String)Context.jsToJava(var4_4[0], String.class)).startsWith("./") || var4_4.startsWith("../")) break block8;
                        var5_5 = null;
                        var2_2 = null;
                        var3_3 = var4_4;
                        var4_4 = var5_5;
                        break block9;
                    }
                    if (!(var3_3 instanceof ModuleScope)) break block10;
                    var3_3 = (ModuleScope)var3_3;
                    var5_6 = var3_3.getBase();
                    var3_3 = var3_3.getUri();
                    var6_7 = var3_3.resolve((String)var4_4);
                    if (var5_6 == null) {
                        while (true) {
                            var3_3 = var6_7.toString();
                            break;
                        }
                    } else {
                        var3_3 = var4_4 = var5_6.relativize((URI)var3_3).resolve((String)var4_4).toString();
                        if (var4_4.charAt(0) == '.') {
                            if (!this.sandboxed) ** continue;
                            var3_3 = new StringBuilder();
                            var3_3.append("Module \"");
                            var3_3.append((String)var4_4);
                            var3_3.append("\" is not contained in sandbox.");
                            throw ScriptRuntime.throwError(var1_1, (Scriptable)var2_2, var3_3.toString());
                        }
                    }
                    var4_4 = var6_7;
                    var2_2 = var5_6;
                }
                return this.getExportedModuleInterface(var1_1, (String)var3_3, (URI)var4_4, (URI)var2_2, false);
            }
            var3_3 = new StringBuilder();
            var3_3.append("Can't resolve relative module ID \"");
            var3_3.append((String)var4_4);
            var3_3.append("\" when require() is used outside of a module");
            throw ScriptRuntime.throwError(var1_1, (Scriptable)var2_2, var3_3.toString());
        }
        throw ScriptRuntime.throwError(var1_1, (Scriptable)var2_2, "require() needs one argument");
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        throw ScriptRuntime.throwError(context, scriptable, "require() can not be invoked as a constructor");
    }

    @Override
    public int getArity() {
        return 1;
    }

    @Override
    public String getFunctionName() {
        return "require";
    }

    @Override
    public int getLength() {
        return 1;
    }

    public void install(Scriptable scriptable) {
        ScriptableObject.putProperty(scriptable, "require", (Object)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Scriptable requireMain(Context object, String string) {
        block14: {
            Object object2;
            Object object3;
            block13: {
                block16: {
                    block15: {
                        object3 = this.mainModuleId;
                        if (object3 != null) {
                            if (((String)object3).equals(string)) {
                                return this.mainExports;
                            }
                            object = a.c("Main module already set to ");
                            ((StringBuilder)object).append(this.mainModuleId);
                            throw new IllegalStateException(((StringBuilder)object).toString());
                        }
                        try {
                            object3 = this.moduleScriptProvider.getModuleScript((Context)object, string, null, null, this.paths);
                            if (object3 != null) {
                                object2 = string;
                                object3 = null;
                                break block13;
                            }
                            if (this.sandboxed) break block14;
                            object2 = null;
                        }
                        catch (Exception exception) {
                            throw new RuntimeException(exception);
                        }
                        catch (RuntimeException runtimeException) {
                            throw runtimeException;
                        }
                        try {
                            object2 = object3 = new URI(string);
                        }
                        catch (URISyntaxException uRISyntaxException) {
                            // empty catch block
                        }
                        if (object2 == null) break block15;
                        object3 = object2;
                        if (((URI)object2).isAbsolute()) break block16;
                    }
                    if (!((File)(object3 = new File(string))).isFile()) {
                        object2 = this.nativeScope;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Module \"");
                        ((StringBuilder)object3).append(string);
                        ((StringBuilder)object3).append("\" not found.");
                        throw ScriptRuntime.throwError((Context)object, (Scriptable)object2, ((StringBuilder)object3).toString());
                    }
                    object3 = ((File)object3).toURI();
                }
                object2 = ((URI)object3).toString();
            }
            this.mainExports = this.getExportedModuleInterface((Context)object, (String)object2, (URI)object3, null, true);
        }
        this.mainModuleId = string;
        return this.mainExports;
    }
}

