/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 */
package com.github.catvod.spider.merge.af;

import com.github.catvod.spider.merge.af.o;
import com.github.catvod.spider.merge.nIe;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;

public final class p {
    static final Class d;
    protected Vector a;
    protected String b;
    protected Hashtable c = new Hashtable();

    static {
        new p();
        d = p.class;
    }

    protected p() {
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static p a() {
        Vector vector;
        String string;
        String string2;
        int n2;
        Object object;
        Serializable serializable = d;
        try {
            object = ((Class)serializable).getResourceAsStream(nIe.d("6D2B161708620B28156C3A2A30103A202C3C6D09212467372F0A233625236C10626D11222E36262F251F231420263B092305272C3B36"));
            if (object == null) {
                serializable = new o(nIe.d("3003202C3C3D2103732D263B62003C36272B78467C0E0C1B034B1A0D0F6031032135202C27157C2C3B286C1E3E2F393A2E0A7D3578611A0B3F133C232E3632313A2A302032203D20301F732E2824274620363B2A62123B223D6F320721302C3D620F3E33252A2F033D37202125460B2E251F370A3F63081F0B463A30692E34073A2F282D2E03"));
                throw serializable;
            }
            serializable = new StringBuffer();
            while (true) {
                if ((n2 = ((InputStream)object).read()) < 0) {
                    ((InputStream)object).close();
                    string2 = ((StringBuffer)serializable).toString();
                    serializable = new StringBuffer();
                    ((StringBuffer)serializable).append(nIe.d("3003202C3C3D2103736C040A16277E0A07096D1536313F262103206C263D25482B2E253F370A3F6D3F7E6C3E3E2F193A2E0A03223B3C271415222A3B2D142A633D2723127320262136073A2D2C2B6241"));
                    ((StringBuffer)serializable).append(string2);
                    ((StringBuffer)serializable).append(nIe.d("65"));
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
            o o2 = new o(exception);
            throw o2;
        }
        while (true) {
            Object var7_13;
            String string3;
            int n3;
            int n4;
            block22: {
                if (n2 >= string2.length()) {
                    object = serializable;
                    if (serializable == null) {
                        object = new p();
                    }
                    ((p)object).a = vector;
                    ((p)object).b = string;
                    return object;
                }
                n3 = n4 = string2.indexOf(44, n2);
                if (n4 == -1) {
                    n3 = string2.length();
                }
                string3 = string2.substring(n2, n3);
                object = Class.forName(string3);
                var7_13 = ((Class)object).newInstance();
                break block22;
                {
                    catch (Exception exception) {}
                }
                catch (Exception exception) {
                    object = null;
                    var7_13 = null;
                }
            }
            Serializable serializable2 = serializable;
            if (object != null) {
                boolean bl = var7_13 instanceof XmlPullParser;
                n4 = 1;
                if (bl) {
                    vector.addElement((Class<?>)object);
                    n2 = 1;
                } else {
                    n2 = 0;
                }
                if (var7_13 instanceof p) {
                    object = serializable;
                    n2 = n4;
                    if (serializable == null) {
                        object = var7_13;
                        n2 = n4;
                    }
                } else {
                    object = serializable;
                }
                if (n2 == 0) {
                    serializable = new StringBuffer();
                    ((StringBuffer)serializable).append(nIe.d("2B08302C243F23123A21252A62053F223A3C7846"));
                    ((StringBuffer)serializable).append(string3);
                    throw new o(((StringBuffer)serializable).toString());
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
            ((StringBuffer)serializable).append(nIe.d("04073037263D3B463A2D203B2B073F2A332E360F3C2D69382315732A272C2D0B232F2C3B27467E63212E31463D2C3D6F36143A262D6F"));
            ((StringBuffer)serializable).append(this.b);
            serializable = new o(((StringBuffer)serializable).toString());
            throw serializable;
        }
        if (((Vector)serializable).size() == 0) {
            serializable = new StringBuffer();
            ((StringBuffer)serializable).append(nIe.d("0C09733528232B027333283D310321632A23231520263A6F2409262D2D6F2B0873"));
            ((StringBuffer)serializable).append(this.b);
            throw new o(((StringBuffer)serializable).toString());
        }
        serializable = new StringBuffer();
        int n2 = 0;
        while (true) {
            Object object;
            Serializable serializable2;
            if (n2 >= this.a.size()) {
                serializable2 = new StringBuffer();
                ((StringBuffer)serializable2).append(nIe.d("2109262F2D6F2C0927632A3D27072726693F231420263B7562"));
                ((StringBuffer)serializable2).append(serializable);
                throw new o(((StringBuffer)serializable2).toString());
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
                ((StringBuffer)object).append(nIe.d("7846"));
                ((StringBuffer)object).append(((Object)exception).toString());
                ((StringBuffer)object).append(nIe.d("7946"));
                ((StringBuffer)serializable).append(((StringBuffer)object).toString());
                ++n2;
                continue;
            }
            break;
        }
    }

    public final void c() {
        Hashtable hashtable = this.c;
        Boolean bl = new Boolean(true);
        hashtable.put(nIe.d("2A12273373606D1E3E2F393A2E0A7D2C3B286D10626C2D2021493526283B371436306727360B3F60393D2D0536303A622C073E263A3F23053630"), bl);
    }
}

