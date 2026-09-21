/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mI;

import com.github.catvod.spider.merge.mI.a;
import com.github.catvod.spider.merge.mI.d;
import com.github.catvod.spider.merge.mI.k;
import com.github.catvod.spider.merge.mI.m;
import com.github.catvod.spider.merge.xc.p0.g;
import com.github.catvod.spider.merge.xc.p0.h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

public abstract class b
implements com.github.catvod.spider.merge.xc.p0.b,
Serializable {
    public static final Object NO_RECEIVER = a.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient com.github.catvod.spider.merge.xc.p0.b reflected;
    private final String signature;

    public b(Object object, Class clazz, String string, String string2, boolean bl) {
        this.receiver = object;
        this.owner = clazz;
        this.name = string;
        this.signature = string2;
        this.isTopLevel = bl;
    }

    @Override
    public Object call(Object ... objectArray) {
        return this.getReflected().call(objectArray);
    }

    @Override
    public Object callBy(Map map) {
        return this.getReflected().callBy(map);
    }

    public com.github.catvod.spider.merge.xc.p0.b compute() {
        com.github.catvod.spider.merge.xc.p0.b b2;
        com.github.catvod.spider.merge.xc.p0.b b3 = b2 = this.reflected;
        if (b2 == null) {
            this.reflected = b3 = this.computeReflected();
        }
        return b3;
    }

    public abstract com.github.catvod.spider.merge.xc.p0.b computeReflected();

    @Override
    public List<Annotation> getAnnotations() {
        return this.getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public com.github.catvod.spider.merge.xc.p0.d getOwner() {
        Object object = this.owner;
        if (object == null) {
            object = null;
        } else if (this.isTopLevel) {
            m.a.getClass();
            object = new k((Class)object);
        } else {
            m.a.getClass();
            object = new d((Class)object);
        }
        return object;
    }

    @Override
    public List<Object> getParameters() {
        return this.getReflected().getParameters();
    }

    public abstract com.github.catvod.spider.merge.xc.p0.b getReflected();

    @Override
    public g getReturnType() {
        this.getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override
    public List<Object> getTypeParameters() {
        return this.getReflected().getTypeParameters();
    }

    @Override
    public h getVisibility() {
        return this.getReflected().getVisibility();
    }

    @Override
    public boolean isAbstract() {
        return this.getReflected().isAbstract();
    }

    @Override
    public boolean isFinal() {
        return this.getReflected().isFinal();
    }

    @Override
    public boolean isOpen() {
        return this.getReflected().isOpen();
    }
}

