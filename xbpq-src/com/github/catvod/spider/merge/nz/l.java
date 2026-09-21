/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.nz;

import com.github.catvod.spider.merge.Dw.c;
import com.github.catvod.spider.merge.Dw.u;
import com.github.catvod.spider.merge.ej.g;
import com.github.catvod.spider.merge.nz.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.AbstractCollection;
import java.util.Iterator;

public final class l {
    public static final Object a(Throwable throwable) {
        return new u(throwable);
    }

    public static g b(com.github.catvod.spider.merge.Em.l l2) {
        g g2 = new g();
        while ((l2 = l2.b0()) != null) {
            ((AbstractCollection)g2).add(l2);
        }
        if (((AbstractCollection)g2).size() > 0) {
            return g2;
        }
        return null;
    }

    public static int c(com.github.catvod.spider.merge.Em.l l2, c c2) {
        Iterator iterator = ((AbstractCollection)l2.f0().R()).iterator();
        int n2 = 1;
        while (iterator.hasNext()) {
            com.github.catvod.spider.merge.Em.l l3 = (com.github.catvod.spider.merge.Em.l)iterator.next();
            if (!l2.n0().equals(l3.n0()) || !((AbstractCollection)c2.a()).contains(l3)) continue;
            boolean bl = l2 == l3;
            if (bl) break;
            ++n2;
        }
        return n2;
    }

    public static g d(com.github.catvod.spider.merge.Em.l l2) {
        g g2 = new g();
        while ((l2 = l2.i0()) != null) {
            ((AbstractCollection)g2).add(l2);
        }
        if (((AbstractCollection)g2).size() > 0) {
            return g2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e(InputStream object) {
        try {
            Object object2 = new InputStreamReader((InputStream)object);
            Object object3 = new BufferedReader((Reader)object2);
            object = new StringBuilder();
            while ((object2 = ((BufferedReader)object3).readLine()) != null) {
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append("\n");
            }
            ((BufferedReader)object3).close();
            object3 = ((StringBuilder)object).toString();
            int n2 = o.a;
            object = object3;
            if (object3 == null) return object;
            object = object3;
            if (((String)object3).length() <= 1) return object;
            return ((String)object3).substring(0, ((String)object3).length() - 1);
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static void f(com.github.catvod.spider.merge.Em.l l2, int n2) {
        l2.b("EL_SAME_TAG_INDEX_KEY", String.valueOf(n2));
    }

    public static void g(File file, String object) {
        object = ((String)object).getBytes();
        Object object2 = new FileOutputStream(file);
        ((FileOutputStream)object2).write((byte[])object);
        ((OutputStream)object2).flush();
        ((FileOutputStream)object2).close();
        try {
            object = Runtime.getRuntime();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("chmod 777 ");
            ((StringBuilder)object2).append(file);
            ((Runtime)object).exec(((StringBuilder)object2).toString()).waitFor();
        }
        catch (Exception exception) {
            try {
                exception.printStackTrace();
            }
            catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
    }
}

