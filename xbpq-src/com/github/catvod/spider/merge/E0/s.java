/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

final class s {
    static final Class<?> a;

    static {
        Class<?> clazz;
        try {
            clazz = Class.forName("com.google.protobuf.ExtensionRegistry");
        }
        catch (ClassNotFoundException classNotFoundException) {
            clazz = null;
        }
        a = clazz;
    }
}

