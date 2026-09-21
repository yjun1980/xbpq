/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dalvik.system.DexFile
 */
package com.github.catvod.spider.merge.ai;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.zip.ZipFile;

final class a {
    public final int a;
    private final Constructor b;

    public a(Class genericDeclaration, int n2) {
        this.a = n2;
        if (n2 != 1) {
            if (n2 != 2) {
                genericDeclaration = ((Class)genericDeclaration).getConstructor(File.class, ZipFile.class, DexFile.class);
                this.b = genericDeclaration;
                ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
                return;
            }
            genericDeclaration = ((Class)genericDeclaration).getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
            this.b = genericDeclaration;
            ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
            return;
        }
        super();
        genericDeclaration = ((Class)genericDeclaration).getConstructor(File.class, File.class, DexFile.class);
        this.b = genericDeclaration;
        ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
    }

    public final Object a(File file, DexFile dexFile) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return this.b.newInstance(file, file, dexFile);
            }
            case 0: {
                return this.b.newInstance(file, new ZipFile(file), dexFile);
            }
        }
        return this.b.newInstance(file, Boolean.FALSE, file, dexFile);
    }
}

