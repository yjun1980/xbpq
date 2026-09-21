/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.util.AttributeSet
 *  android.view.Menu
 *  android.view.MenuInflater
 *  org.xmlpull.v1.XmlPullParser
 */
package com.github.catvod.spider.merge.l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import com.github.catvod.spider.merge.l.d;
import org.xmlpull.v1.XmlPullParser;

public final class e
extends MenuInflater {
    static final Class<?>[] e;
    static final Class<?>[] f;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;

    static {
        Class[] classArray = new Class[]{Context.class};
        e = classArray;
        f = classArray;
    }

    public e(Context context) {
        super(context);
        this.c = context;
        Object[] objectArray = new Object[]{context};
        this.a = objectArray;
        this.b = objectArray;
    }

    private Object a(Object object) {
        if (object instanceof Activity) {
            return object;
        }
        Object object2 = object;
        if (object instanceof ContextWrapper) {
            object2 = this.a(((ContextWrapper)object).getBaseContext());
        }
        return object2;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu object) {
        int n2;
        int n3;
        d d2;
        block27: {
            d2 = new d(this, (Menu)object);
            n3 = xmlPullParser.getEventType();
            do {
                if (n3 == 2) {
                    object = xmlPullParser.getName();
                    if (((String)object).equals("menu")) {
                        n3 = xmlPullParser.next();
                        break block27;
                    }
                    throw new RuntimeException(com.github.catvod.spider.merge.B.e.c("Expecting menu, got ", (String)object));
                }
                n3 = n2 = xmlPullParser.next();
            } while (n2 != 1);
            n3 = n2;
        }
        n2 = 0;
        int n4 = 0;
        Object object2 = null;
        while (n2 == 0) {
            if (n3 != 1) {
                int n5;
                if (n3 != 2) {
                    if (n3 != 3) {
                        n5 = n2;
                        n3 = n4;
                        object = object2;
                    } else {
                        String string = xmlPullParser.getName();
                        if (n4 != 0 && string.equals(object2)) {
                            object = null;
                            n3 = 0;
                            n5 = n2;
                        } else if (string.equals("group")) {
                            d2.g();
                            n5 = n2;
                            n3 = n4;
                            object = object2;
                        } else if (string.equals("item")) {
                            n5 = n2;
                            n3 = n4;
                            object = object2;
                            if (!d2.c()) {
                                object = d2.z;
                                if (object != null && object.hasSubMenu()) {
                                    d2.b();
                                    n5 = n2;
                                    n3 = n4;
                                    object = object2;
                                } else {
                                    d2.a();
                                    n5 = n2;
                                    n3 = n4;
                                    object = object2;
                                }
                            }
                        } else {
                            n5 = n2;
                            n3 = n4;
                            object = object2;
                            if (string.equals("menu")) {
                                n5 = 1;
                                n3 = n4;
                                object = object2;
                            }
                        }
                    }
                } else if (n4 != 0) {
                    n5 = n2;
                    n3 = n4;
                    object = object2;
                } else {
                    object = xmlPullParser.getName();
                    if (((String)object).equals("group")) {
                        d2.e(attributeSet);
                        n5 = n2;
                        n3 = n4;
                        object = object2;
                    } else if (((String)object).equals("item")) {
                        d2.f(attributeSet);
                        n5 = n2;
                        n3 = n4;
                        object = object2;
                    } else if (((String)object).equals("menu")) {
                        this.c(xmlPullParser, attributeSet, (Menu)d2.b());
                        n5 = n2;
                        n3 = n4;
                        object = object2;
                    } else {
                        n3 = 1;
                        n5 = n2;
                    }
                }
                int n6 = xmlPullParser.next();
                n2 = n5;
                n4 = n3;
                object2 = object;
                n3 = n6;
                continue;
            }
            throw new RuntimeException("Unexpected end of document");
        }
    }

    final Object b() {
        if (this.d == null) {
            Object object;
            Context context = this.c;
            if (context instanceof Activity) {
                object = context;
            } else {
                object = context;
                if (context instanceof ContextWrapper) {
                    object = this.a(((ContextWrapper)context).getBaseContext());
                }
            }
            this.d = object;
        }
        return this.d;
    }

    /*
     * Exception decompiling
     */
    public final void inflate(int var1_1, Menu var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [6 : 74->79)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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
}

