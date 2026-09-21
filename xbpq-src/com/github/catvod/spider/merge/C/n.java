/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.H.e;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;

public abstract class n {
    public final e a;
    protected final Class<?> b;

    public n(Class<?> clazz, e e2) {
        this.b = clazz;
        this.a = e2;
    }

    private static boolean a(Field annotatedElement, Method method, Object object, Object object2) {
        boolean bl;
        if (annotatedElement != null && !Modifier.isFinal(((Field)annotatedElement).getModifiers())) {
            ((Field)annotatedElement).set(object, object2);
            bl = true;
        } else {
            bl = false;
        }
        if (bl) {
            return true;
        }
        try {
            annotatedElement = object.getClass();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("set");
            stringBuilder.append(method.getName().substring(3));
            ((Class)annotatedElement).getDeclaredMethod(stringBuilder.toString(), method.getReturnType()).invoke(object, object2);
            return true;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    public int b() {
        return 0;
    }

    public final Class<?> c() {
        return this.b;
    }

    public abstract void d(b var1, Object var2, Type var3, Map<String, Object> var4);

    /*
     * Exception decompiling
     */
    public void e(Object var1_1, Object var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void f(Object object, String string) {
        this.e(object, string);
    }
}

