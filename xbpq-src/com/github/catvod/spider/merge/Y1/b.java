/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 */
package com.github.catvod.spider.merge.Y1;

import com.github.catvod.spider.merge.Y1.a;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

public final class b {
    static final Class d;
    protected Vector a;
    protected String b;
    protected Hashtable c = new Hashtable();

    static {
        new b();
        d = b.class;
    }

    protected b() {
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b a() {
        Vector vector;
        String string;
        String string2;
        int n2;
        Object object;
        Serializable serializable = d;
        try {
            object = ((Class)serializable).getResourceAsStream("/META-INF/services/org.xmlpull.v1.XmlPullParserFactory");
            if (object == null) {
                serializable = new a("resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available");
                throw serializable;
            }
            serializable = new StringBuffer();
            while (true) {
                if ((n2 = ((InputStream)object).read()) < 0) {
                    ((InputStream)object).close();
                    string2 = ((StringBuffer)serializable).toString();
                    serializable = new StringBuffer();
                    ((StringBuffer)serializable).append("resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained '");
                    ((StringBuffer)serializable).append(string2);
                    ((StringBuffer)serializable).append("'");
                    string = ((StringBuffer)serializable).toString();
                    vector = new Vector();
                    new Vector();
                    serializable = null;
                    n2 = 0;
                    break;
                }
                if (n2 <= 32) continue;
                char c2 = (char)n2;
                ((StringBuffer)serializable).append(c2);
            }
        }
        catch (Exception exception) {
            throw new a(exception);
        }
        while (true) {
            Object var7_12;
            String string3;
            int n3;
            int n4;
            block22: {
                if (n2 >= string2.length()) {
                    object = serializable;
                    if (serializable == null) {
                        object = new b();
                    }
                    ((b)object).a = vector;
                    ((b)object).b = string;
                    return object;
                }
                n3 = n4 = string2.indexOf(44, n2);
                if (n4 == -1) {
                    n3 = string2.length();
                }
                string3 = string2.substring(n2, n3);
                object = Class.forName(string3);
                var7_12 = ((Class)object).newInstance();
                break block22;
                {
                    catch (Exception exception) {}
                }
                catch (Exception exception) {
                    object = null;
                    var7_12 = null;
                }
            }
            Serializable serializable2 = serializable;
            if (object != null) {
                boolean bl = var7_12 instanceof XmlPullParser;
                n4 = 1;
                if (bl) {
                    vector.addElement((Class<?>)object);
                    n2 = 1;
                } else {
                    n2 = 0;
                }
                if (var7_12 instanceof b) {
                    object = serializable;
                    n2 = n4;
                    if (serializable == null) {
                        object = var7_12;
                        n2 = n4;
                    }
                } else {
                    object = serializable;
                }
                if (n2 == 0) {
                    serializable = new StringBuffer();
                    ((StringBuffer)serializable).append("incompatible class: ");
                    ((StringBuffer)serializable).append(string3);
                    throw new a(((StringBuffer)serializable).toString());
                }
                serializable2 = object;
            }
            n2 = n3 + 1;
            serializable = serializable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final XmlPullParser b() {
        Serializable serializable = this.a;
        if (serializable == null) {
            serializable = new StringBuffer();
            ((StringBuffer)serializable).append("Factory initialization was incomplete - has not tried ");
            ((StringBuffer)serializable).append(this.b);
            throw new a(((StringBuffer)serializable).toString());
        }
        if (((Vector)serializable).size() == 0) {
            serializable = new StringBuffer();
            ((StringBuffer)serializable).append("No valid parser classes found in ");
            ((StringBuffer)serializable).append(this.b);
            throw new a(((StringBuffer)serializable).toString());
        }
        serializable = new StringBuffer();
        int n2 = 0;
        while (true) {
            Object object;
            Serializable serializable2;
            if (n2 >= this.a.size()) {
                serializable2 = new StringBuffer();
                ((StringBuffer)serializable2).append("could not create parser: ");
                ((StringBuffer)serializable2).append(serializable);
                throw new a(((StringBuffer)serializable2).toString());
            }
            serializable2 = (Class)this.a.elementAt(n2);
            try {
                XmlPullParser xmlPullParser = (XmlPullParser)((Class)serializable2).newInstance();
                object = this.c.keys();
                while (true) {
                    if (!object.hasMoreElements()) {
                        return xmlPullParser;
                    }
                    String string = (String)object.nextElement();
                    Boolean bl = (Boolean)this.c.get(string);
                    if (bl == null || !bl.booleanValue()) continue;
                    xmlPullParser.setFeature(string, true);
                }
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
    }

    public final void c() {
        this.c.put("http://xmlpull.org/v1/doc/features.html#process-namespaces", new Boolean(true));
    }
}

