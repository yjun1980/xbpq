/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.J0;

import com.github.catvod.spider.merge.xc.J0.a;
import com.github.catvod.spider.merge.xc.J0.b;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class c {
    public static final Class d;
    public Vector a;
    public String b;
    public final Hashtable c = new Hashtable();

    static {
        new c();
        d = c.class;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a a() {
        Hashtable hashtable;
        Object object;
        Serializable serializable = this.a;
        if (serializable == null) {
            serializable = new StringBuffer("Factory initialization was incomplete - has not tried ");
            ((StringBuffer)serializable).append(this.b);
            serializable = new b(((StringBuffer)serializable).toString());
            throw serializable;
        }
        if (((Vector)serializable).size() == 0) {
            serializable = new StringBuffer("No valid parser classes found in ");
            ((StringBuffer)serializable).append(this.b);
            throw new b(((StringBuffer)serializable).toString());
        }
        serializable = new StringBuffer();
        int n2 = 0;
        while (true) {
            Serializable serializable2;
            if (n2 >= this.a.size()) {
                serializable2 = new StringBuffer("could not create parser: ");
                ((StringBuffer)serializable2).append(serializable);
                throw new b(((StringBuffer)serializable2).toString());
            }
            serializable2 = (Class)this.a.elementAt(n2);
            try {
                object = (a)((Class)serializable2).newInstance();
                hashtable = this.c;
            }
            catch (Exception exception) {
                object = new StringBuffer();
                ((StringBuffer)object).append(((Class)serializable2).getName());
                ((StringBuffer)object).append(": ");
                ((StringBuffer)object).append(((Object)exception).toString());
                ((StringBuffer)object).append("; ");
                ((StringBuffer)serializable).append(((StringBuffer)object).toString());
                ++n2;
                continue;
            }
            break;
        }
        {
            Enumeration enumeration = hashtable.keys();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                Boolean bl = (Boolean)hashtable.get(string);
                if (bl == null || !bl.booleanValue()) continue;
                object.b(string);
            }
            return object;
        }
    }
}

