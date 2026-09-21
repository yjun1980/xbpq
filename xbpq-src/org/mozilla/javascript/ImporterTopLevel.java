/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.Undefined;

public class ImporterTopLevel
extends TopLevel {
    private static final String AKEY = "importedPackages";
    private static final Object IMPORTER_TAG = "Importer";
    private static final int Id_constructor = 1;
    private static final int Id_importClass = 2;
    private static final int Id_importPackage = 3;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final long serialVersionUID = -9095380847465315412L;
    private boolean topScopeFlag;

    public ImporterTopLevel() {
    }

    public ImporterTopLevel(Context context) {
        this(context, false);
    }

    public ImporterTopLevel(Context context, boolean bl) {
        this.initStandardObjects(context, bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object[] getNativeJavaPackages(Scriptable scriptable) {
        synchronized (scriptable) {
            if (!(scriptable instanceof ScriptableObject)) return null;
            Object[] objectArray = (Object[])((ScriptableObject)scriptable).getAssociatedValue(AKEY);
            if (objectArray == null) return null;
            return objectArray.toArray();
        }
    }

    private Object getPackageProperty(String string, Scriptable scriptable) {
        Object object = Scriptable.NOT_FOUND;
        Object object2 = this.topScopeFlag ? ScriptableObject.getTopLevelScope(scriptable) : scriptable;
        Object[] objectArray = ImporterTopLevel.getNativeJavaPackages((Scriptable)object2);
        if (objectArray == null) {
            return object;
        }
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object3 = ((NativeJavaPackage)objectArray[i2]).getPkgProperty(string, scriptable, false);
            object2 = object;
            if (object3 != null) {
                object2 = object;
                if (!(object3 instanceof NativeJavaPackage)) {
                    if (object == Scriptable.NOT_FOUND) {
                        object2 = object3;
                    } else {
                        throw Context.reportRuntimeErrorById("msg.ambig.import", object.toString(), object3.toString());
                    }
                }
            }
            object = object2;
        }
        return object;
    }

    private static void importClass(Scriptable scriptable, NativeJavaClass nativeJavaClass) {
        String string = nativeJavaClass.getClassObject().getName();
        Object object = scriptable.get(string = string.substring(string.lastIndexOf(46) + 1), scriptable);
        if (object != Scriptable.NOT_FOUND && object != nativeJavaClass) {
            throw Context.reportRuntimeErrorById("msg.prop.defined", string);
        }
        scriptable.put(string, scriptable, (Object)nativeJavaClass);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void importPackage(ScriptableObject scriptableObject, NativeJavaPackage nativeJavaPackage) {
        if (nativeJavaPackage == null) {
            return;
        }
        synchronized (scriptableObject) {
            ObjArray objArray;
            ObjArray objArray2 = objArray = (ObjArray)scriptableObject.getAssociatedValue(AKEY);
            if (objArray == null) {
                objArray2 = new ObjArray();
                scriptableObject.associateValue(AKEY, objArray2);
            }
            int n2 = 0;
            while (true) {
                if (n2 == objArray2.size()) {
                    objArray2.add(nativeJavaPackage);
                    return;
                }
                if (nativeJavaPackage.equals(objArray2.get(n2))) {
                    return;
                }
                ++n2;
            }
        }
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        new ImporterTopLevel().exportAsJSClass(3, scriptable, bl);
    }

    private Object js_construct(Scriptable scriptable, Object[] objectArray) {
        ImporterTopLevel importerTopLevel = new ImporterTopLevel();
        for (int i2 = 0; i2 != objectArray.length; ++i2) {
            Object object = objectArray[i2];
            if (object instanceof NativeJavaClass) {
                ImporterTopLevel.importClass(importerTopLevel, (NativeJavaClass)object);
                continue;
            }
            if (object instanceof NativeJavaPackage) {
                ImporterTopLevel.importPackage(importerTopLevel, (NativeJavaPackage)object);
                continue;
            }
            throw Context.reportRuntimeErrorById("msg.not.class.not.pkg", Context.toString(object));
        }
        importerTopLevel.setParentScope(scriptable);
        importerTopLevel.setPrototype(this);
        return importerTopLevel;
    }

    private static Object js_importClass(Scriptable scriptable, Object[] objectArray) {
        for (int i2 = 0; i2 != objectArray.length; ++i2) {
            Object object = objectArray[i2];
            if (object instanceof NativeJavaClass) {
                ImporterTopLevel.importClass(scriptable, (NativeJavaClass)object);
                continue;
            }
            throw Context.reportRuntimeErrorById("msg.not.class", Context.toString(object));
        }
        return Undefined.instance;
    }

    private static Object js_importPackage(ScriptableObject scriptableObject, Object[] objectArray) {
        for (int i2 = 0; i2 != objectArray.length; ++i2) {
            Object object = objectArray[i2];
            if (object instanceof NativeJavaPackage) {
                ImporterTopLevel.importPackage(scriptableObject, (NativeJavaPackage)object);
                continue;
            }
            throw Context.reportRuntimeErrorById("msg.not.pkg", Context.toString(object));
        }
        return Undefined.instance;
    }

    private ScriptableObject realScope(Scriptable scriptable, Scriptable scriptable2, IdFunctionObject idFunctionObject) {
        if (this.topScopeFlag) {
            scriptable2 = ScriptableObject.getTopLevelScope(scriptable);
        }
        return IdScriptableObject.ensureType(scriptable2, ScriptableObject.class, idFunctionObject);
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!idFunctionObject.hasTag(IMPORTER_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = idFunctionObject.methodId();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return ImporterTopLevel.js_importPackage(this.realScope(scriptable, scriptable2, idFunctionObject), objectArray);
                }
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            return ImporterTopLevel.js_importClass(this.realScope(scriptable, scriptable2, idFunctionObject), objectArray);
        }
        return this.js_construct(scriptable, objectArray);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 2;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1978066145: {
                if (!string.equals("importPackage")) break;
                n4 = 2;
                break;
            }
            case 1442890963: {
                if (!string.equals("importClass")) break;
                n4 = 1;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 0: {
                n3 = 1;
            }
            case 1: 
        }
        return n3;
    }

    @Override
    public Object get(String string, Scriptable scriptable) {
        Object object = super.get(string, scriptable);
        if (object != Scriptable.NOT_FOUND) {
            return object;
        }
        return this.getPackageProperty(string, scriptable);
    }

    @Override
    public String getClassName() {
        String string = this.topScopeFlag ? "global" : "JavaImporter";
        return string;
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        boolean bl = super.has(string, scriptable) || this.getPackageProperty(string, scriptable) != Scriptable.NOT_FOUND;
        return bl;
    }

    @Deprecated
    public void importPackage(Context context, Scriptable scriptable, Object[] objectArray, Function function) {
        ImporterTopLevel.js_importPackage(this, objectArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3 = 1;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) throw new IllegalArgumentException(String.valueOf(n2));
                string = "importPackage";
            } else {
                string = "importClass";
            }
        } else {
            n3 = 0;
            string = "constructor";
        }
        this.initPrototypeMethod(IMPORTER_TAG, n2, string, n3);
    }

    public void initStandardObjects(Context object, boolean bl) {
        ((Context)object).initStandardObjects(this, bl);
        this.topScopeFlag = true;
        object = this.exportAsJSClass(3, this, false);
        if (bl) {
            ((ScriptableObject)object).sealObject();
        }
        this.delete("constructor");
    }
}

