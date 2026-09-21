/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import java.util.AbstractCollection;
import java.util.HashSet;

final class y
extends HashSet<String> {
    y() {
        super(6);
        ((AbstractCollection)this).add("net.sf.cglib.proxy.Factory");
        ((AbstractCollection)this).add("org.springframework.cglib.proxy.Factory");
        ((AbstractCollection)this).add("javassist.util.proxy.ProxyObject");
        ((AbstractCollection)this).add("org.apache.ibatis.javassist.util.proxy.ProxyObject");
        ((AbstractCollection)this).add("org.hibernate.proxy.HibernateProxy");
        ((AbstractCollection)this).add("org.springframework.context.annotation.ConfigurationClassEnhancer$EnhancedConfiguration");
    }
}

