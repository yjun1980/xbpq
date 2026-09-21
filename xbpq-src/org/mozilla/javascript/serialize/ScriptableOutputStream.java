/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.serialize;

import com.github.catvod.spider.merge.I.s;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.UniqueTag;
import org.mozilla.javascript.serialize.ScriptableOutputStream$PendingLookup;

public class ScriptableOutputStream
extends ObjectOutputStream {
    private Scriptable scope;
    private Map<Object, String> table;

    public ScriptableOutputStream(OutputStream object, Scriptable scriptable) {
        super((OutputStream)object);
        this.scope = scriptable;
        this.table = object = new HashMap();
        object.put(scriptable, "");
        this.enableReplaceObject(true);
        this.excludeStandardObjectNames();
    }

    static Object lookupQualifiedName(Scriptable object, String object2) {
        Object object3;
        block1: {
            StringTokenizer stringTokenizer = new StringTokenizer((String)object2, ".");
            do {
                object3 = object;
                if (!stringTokenizer.hasMoreTokens()) break block1;
                object2 = stringTokenizer.nextToken();
                object3 = object2 = ScriptableObject.getProperty((Scriptable)object, (String)object2);
                if (object2 == null) break block1;
                object = object2;
            } while (object2 instanceof Scriptable);
            object3 = object2;
        }
        return object3;
    }

    public void addExcludedName(String string) {
        Object object = ScriptableOutputStream.lookupQualifiedName(this.scope, string);
        if (object instanceof Scriptable) {
            this.table.put(object, string);
            return;
        }
        throw new IllegalArgumentException(s.a("Object for excluded name ", string, " not found."));
    }

    public void addOptionalExcludedName(String string) {
        Object object = ScriptableOutputStream.lookupQualifiedName(this.scope, string);
        if (object != null && object != UniqueTag.NOT_FOUND) {
            if (object instanceof Scriptable) {
                this.table.put(object, string);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Object for excluded name ");
                stringBuilder.append(string);
                stringBuilder.append(" is not a Scriptable, it is ");
                stringBuilder.append(object.getClass().getName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    public void excludeAllIds(Object[] objectArray) {
        for (Object object : objectArray) {
            Scriptable scriptable;
            if (!(object instanceof String) || !((scriptable = this.scope).get((String)(object = (String)object), scriptable) instanceof Scriptable)) continue;
            this.addExcludedName((String)object);
        }
    }

    public void excludeStandardObjectNames() {
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < 21; ++n2) {
            this.addExcludedName((new String[]{"Object", "Object.prototype", "Function", "Function.prototype", "String", "String.prototype", "Math", "Array", "Array.prototype", "Error", "Error.prototype", "Number", "Number.prototype", "Date", "Date.prototype", "RegExp", "RegExp.prototype", "Script", "Script.prototype", "Continuation", "Continuation.prototype"})[n2]);
        }
        for (n2 = n3; n2 < 4; ++n2) {
            this.addOptionalExcludedName((new String[]{"XML", "XML.prototype", "XMLList", "XMLList.prototype"})[n2]);
        }
    }

    public boolean hasExcludedName(String string) {
        boolean bl = this.table.get(string) != null;
        return bl;
    }

    public void removeExcludedName(String string) {
        this.table.remove(string);
    }

    @Override
    protected Object replaceObject(Object object) {
        String string = this.table.get(object);
        if (string == null) {
            return object;
        }
        return new ScriptableOutputStream$PendingLookup(string);
    }
}

