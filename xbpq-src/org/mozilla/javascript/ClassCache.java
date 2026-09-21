/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.ClassCache$CacheKey;
import org.mozilla.javascript.JavaAdapter$JavaAdapterSignature;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class ClassCache
implements Serializable {
    private static final Object AKEY = "ClassCache";
    private static final long serialVersionUID = -8866246036237312215L;
    private Scriptable associatedScope;
    private volatile boolean cachingIsEnabled = true;
    private transient Map<JavaAdapter.JavaAdapterSignature, Class<?>> classAdapterCache;
    private transient Map<ClassCache$CacheKey, JavaMembers> classTable;
    private int generatedClassSerial;
    private transient Map<Class<?>, Object> interfaceAdapterCache;

    public static ClassCache get(Scriptable object) {
        if ((object = (ClassCache)ScriptableObject.getTopScopeValue((Scriptable)object, AKEY)) != null) {
            return object;
        }
        throw new RuntimeException("Can't find top level scope for ClassCache.get");
    }

    public boolean associate(ScriptableObject scriptableObject) {
        if (scriptableObject.getParentScope() == null) {
            if (this == scriptableObject.associateValue(AKEY, this)) {
                this.associatedScope = scriptableObject;
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    void cacheInterfaceAdapter(Class<?> clazz, Object object) {
        synchronized (this) {
            if (this.cachingIsEnabled) {
                if (this.interfaceAdapterCache == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16, 0.75f, 1);
                    this.interfaceAdapterCache = concurrentHashMap;
                }
                this.interfaceAdapterCache.put(clazz, object);
            }
            return;
        }
    }

    public void clearCaches() {
        synchronized (this) {
            this.classTable = null;
            this.classAdapterCache = null;
            this.interfaceAdapterCache = null;
            return;
        }
    }

    Scriptable getAssociatedScope() {
        return this.associatedScope;
    }

    Map<ClassCache$CacheKey, JavaMembers> getClassCacheMap() {
        if (this.classTable == null) {
            this.classTable = new ConcurrentHashMap<ClassCache$CacheKey, JavaMembers>(16, 0.75f, 1);
        }
        return this.classTable;
    }

    Object getInterfaceAdapter(Class<?> object) {
        Map<Class<?>, Object> map = this.interfaceAdapterCache;
        object = map == null ? null : map.get(object);
        return object;
    }

    Map<JavaAdapter.JavaAdapterSignature, Class<?>> getInterfaceAdapterCacheMap() {
        if (this.classAdapterCache == null) {
            this.classAdapterCache = new ConcurrentHashMap(16, 0.75f, 1);
        }
        return this.classAdapterCache;
    }

    public final boolean isCachingEnabled() {
        return this.cachingIsEnabled;
    }

    @Deprecated
    public boolean isInvokerOptimizationEnabled() {
        return false;
    }

    public final int newClassSerialNumber() {
        synchronized (this) {
            int n2;
            this.generatedClassSerial = n2 = this.generatedClassSerial + 1;
            return n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCachingEnabled(boolean bl) {
        synchronized (this) {
            boolean bl2 = this.cachingIsEnabled;
            if (bl == bl2) {
                return;
            }
            if (!bl) {
                this.clearCaches();
            }
            this.cachingIsEnabled = bl;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Deprecated
    public void setInvokerOptimizationEnabled(boolean bl) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }
}

