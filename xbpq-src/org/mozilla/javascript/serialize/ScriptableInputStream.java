/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.serialize;

import com.github.catvod.spider.merge.I.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.UniqueTag;
import org.mozilla.javascript.serialize.ScriptableOutputStream;
import org.mozilla.javascript.serialize.ScriptableOutputStream$PendingLookup;

public class ScriptableInputStream
extends ObjectInputStream {
    private ClassLoader classLoader;
    private Scriptable scope;

    public ScriptableInputStream(InputStream closeable, Scriptable scriptable) {
        super((InputStream)closeable);
        this.scope = scriptable;
        this.enableResolveObject(true);
        closeable = Context.getCurrentContext();
        if (closeable != null) {
            this.classLoader = ((Context)closeable).getApplicationClassLoader();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        String string = objectStreamClass.getName();
        ClassLoader classLoader = this.classLoader;
        if (classLoader == null) return super.resolveClass(objectStreamClass);
        try {
            return classLoader.loadClass(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return super.resolveClass(objectStreamClass);
        }
    }

    @Override
    protected Object resolveObject(Object object) {
        Object object2;
        if (object instanceof ScriptableOutputStream$PendingLookup) {
            object2 = ScriptableOutputStream.lookupQualifiedName(this.scope, (String)(object = ((ScriptableOutputStream$PendingLookup)object).getName()));
            if (object2 == Scriptable.NOT_FOUND) {
                throw new IOException(s.a("Object ", (String)object, " not found upon deserialization."));
            }
        } else if (object instanceof UniqueTag) {
            object2 = ((UniqueTag)object).readResolve();
        } else {
            object2 = object;
            if (object instanceof Undefined) {
                object2 = ((Undefined)object).readResolve();
            }
        }
        return object2;
    }
}

