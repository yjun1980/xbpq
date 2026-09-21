/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Wrapper;

public class NativeJavaTopPackage
extends NativeJavaPackage
implements Function,
IdFunctionCall {
    private static final Object FTAG;
    private static final int Id_getClass = 1;
    private static final String[][] commonPackages;
    private static final long serialVersionUID = -1455787259477709999L;

    static {
        String[] stringArray = new String[]{"javax", "swing"};
        commonPackages = new String[][]{{"java", "lang", "reflect"}, {"java", "io"}, {"java", "math"}, {"java", "net"}, {"java", "util", "zip"}, {"java", "text", "resources"}, {"java", "applet"}, stringArray};
        FTAG = "JavaTopPackage";
    }

    NativeJavaTopPackage(ClassLoader classLoader) {
        super(true, "", classLoader);
    }

    public static void init(Context object, Scriptable scriptable, boolean bl) {
        String[][] stringArray;
        int n2;
        NativeJavaTopPackage nativeJavaTopPackage = new NativeJavaTopPackage(((Context)object).getApplicationClassLoader());
        nativeJavaTopPackage.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeJavaTopPackage.setParentScope(scriptable);
        int n3 = 0;
        for (n2 = 0; n2 != commonPackages.length; ++n2) {
            object = nativeJavaTopPackage;
            for (int i2 = 0; i2 != (stringArray = commonPackages)[n2].length; ++i2) {
                object = ((NativeJavaPackage)object).forcePackage(stringArray[n2][i2], scriptable);
            }
        }
        object = new IdFunctionObject(nativeJavaTopPackage, FTAG, 1, "getClass", 1, scriptable);
        stringArray = ScriptRuntime.getTopPackageNames();
        NativeJavaPackage[] nativeJavaPackageArray = new NativeJavaPackage[stringArray.length];
        for (n2 = 0; n2 < stringArray.length; ++n2) {
            nativeJavaPackageArray[n2] = (NativeJavaPackage)nativeJavaTopPackage.get((String)stringArray[n2], (Scriptable)nativeJavaTopPackage);
        }
        scriptable = (ScriptableObject)scriptable;
        if (bl) {
            ((ScriptableObject)object).sealObject();
        }
        ((IdFunctionObject)object).exportAsScopeProperty();
        ((ScriptableObject)scriptable).defineProperty("Packages", nativeJavaTopPackage, 2);
        for (n2 = n3; n2 < stringArray.length; ++n2) {
            ((ScriptableObject)scriptable).defineProperty((String)stringArray[n2], nativeJavaPackageArray[n2], 2);
        }
    }

    private Scriptable js_getClass(Context object, Scriptable object2, Object[] object3) {
        if (((Object[])object3).length > 0 && object3[0] instanceof Wrapper) {
            int n2;
            object3 = ((Wrapper)object3[0]).unwrap().getClass().getName();
            object = this;
            int n3 = 0;
            while ((object = object.get((String)(object2 = (n2 = ((String)object3).indexOf(46, n3)) == -1 ? ((String)object3).substring(n3) : ((String)object3).substring(n3, n2)), (Scriptable)object)) instanceof Scriptable) {
                object = (Scriptable)object;
                if (n2 == -1) {
                    return object;
                }
                n3 = n2 + 1;
            }
        }
        throw Context.reportRuntimeErrorById("msg.not.java.obj", new Object[0]);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.construct(context, scriptable, objectArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Scriptable construct(Context var1_1, Scriptable var2_2, Object[] var3_3) {
        if (var3_3 /* !! */ .length == 0) ** GOTO lbl-1000
        var1_1 /* !! */  = var3_3 /* !! */  = var3_3 /* !! */ [0];
        if (var3_3 /* !! */  instanceof Wrapper) {
            var1_1 /* !! */  = ((Wrapper)var3_3 /* !! */ ).unwrap();
        }
        if (var1_1 /* !! */  instanceof ClassLoader) {
            var1_1 /* !! */  = (ClassLoader)var1_1 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 /* !! */  = null;
        }
        if (var1_1 /* !! */  == null) {
            Context.reportRuntimeErrorById("msg.not.classloader", new Object[0]);
            return null;
        }
        var1_1 /* !! */  = new NativeJavaPackage(true, "", (ClassLoader)var1_1 /* !! */ );
        ScriptRuntime.setObjectProtoAndParent((ScriptableObject)var1_1 /* !! */ , var2_2);
        return var1_1 /* !! */ ;
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 1) {
            return this.js_getClass(context, scriptable, objectArray);
        }
        throw idFunctionObject.unknown();
    }
}

