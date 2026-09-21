/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Iterator;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Hashtable$Entry;
import org.mozilla.javascript.NativeCollectionIterator$1;
import org.mozilla.javascript.NativeCollectionIterator$Type;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class NativeCollectionIterator
extends ES6Iterator {
    private static final long serialVersionUID = 7094840979404373443L;
    private String className;
    private transient Iterator<Hashtable$Entry> iterator;
    private NativeCollectionIterator$Type type;

    public NativeCollectionIterator(String string) {
        this.iterator = Collections.emptyIterator();
        this.className = string;
        this.iterator = Collections.emptyIterator();
        this.type = NativeCollectionIterator$Type.BOTH;
    }

    public NativeCollectionIterator(Scriptable scriptable, String string, NativeCollectionIterator$Type nativeCollectionIterator$Type, Iterator<Hashtable$Entry> iterator) {
        super(scriptable, string);
        Collections.emptyIterator();
        this.className = string;
        this.iterator = iterator;
        this.type = nativeCollectionIterator$Type;
    }

    static void init(ScriptableObject scriptableObject, String string, boolean bl) {
        ES6Iterator.init(scriptableObject, bl, new NativeCollectionIterator(string), string);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.className = (String)objectInputStream.readObject();
        this.type = (NativeCollectionIterator$Type)((Object)objectInputStream.readObject());
        this.iterator = Collections.emptyIterator();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.className);
        objectOutputStream.writeObject((Object)this.type);
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    protected boolean isDone(Context context, Scriptable scriptable) {
        return this.iterator.hasNext() ^ true;
    }

    @Override
    protected Object nextValue(Context context, Scriptable scriptable) {
        Hashtable$Entry hashtable$Entry = this.iterator.next();
        int n2 = NativeCollectionIterator$1.$SwitchMap$org$mozilla$javascript$NativeCollectionIterator$Type[this.type.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return context.newArray(scriptable, new Object[]{hashtable$Entry.key, hashtable$Entry.value});
                }
                throw new AssertionError();
            }
            return hashtable$Entry.value;
        }
        return hashtable$Entry.key;
    }
}

