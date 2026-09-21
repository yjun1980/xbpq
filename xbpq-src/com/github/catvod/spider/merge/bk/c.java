/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.Context
 *  android.content.res.XmlResourceParser
 *  android.net.Uri
 *  android.os.Environment
 */
package com.github.catvod.spider.merge.bk;

import android.content.ContentProvider;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Environment;
import com.github.catvod.spider.merge.af.o;
import com.github.catvod.spider.merge.bk.a;
import com.github.catvod.spider.merge.bk.b;
import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class c
extends ContentProvider {
    private static final HashMap<String, a> a = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri a(Context context, String object, File file) {
        HashMap<String, a> hashMap = a;
        synchronized (hashMap) {
            a a2;
            a a3 = a2 = hashMap.get(object);
            if (a2 == null) {
                try {
                    a3 = c.b(context, (String)object);
                    hashMap.put((String)object, a3);
                }
                catch (o o2) {
                    object = new IllegalArgumentException(nIe.d("04073A2F2C2B62123C63392E30153663282126143C2A2D6131132333263D3648150A050A1D36010C1F060623011C190E162E0063242A36077E27283B23"), o2);
                    throw object;
                }
                catch (IOException iOException) {
                    object = new IllegalArgumentException(nIe.d("04073A2F2C2B62123C63392E30153663282126143C2A2D6131132333263D3648150A050A1D36010C1F060623011C190E162E0063242A36077E27283B23"), iOException);
                    throw object;
                }
            }
            return a3.a(file);
        }
    }

    private static a b(Context object, String object2) {
        b b2 = new b((String)object2);
        Object object3 = object.getPackageManager().resolveContentProvider((String)object2, 128);
        if (object3 != null) {
            object2 = object3.metaData;
            XmlResourceParser xmlResourceParser = object3.loadXmlMetaData(object.getPackageManager(), nIe.d("23083731262626482036393F2D14276D0F060E230C131B00142F17061B101227070B1A"));
            if (xmlResourceParser != null) {
                int n2;
                while ((n2 = xmlResourceParser.next()) != 1) {
                    if (n2 != 2) continue;
                    object3 = xmlResourceParser.getName();
                    object2 = null;
                    String string = xmlResourceParser.getAttributeValue(null, nIe.d("2C073E26"));
                    String string2 = xmlResourceParser.getAttributeValue(null, nIe.d("3207272B"));
                    if (nIe.d("2107302B2C623207272B").equals(object3)) {
                        object2 = object.getCacheDir();
                    } else if (nIe.d("271E27263B21230A7E33283B2A").equals(object3)) {
                        object2 = Environment.getExternalStorageDirectory();
                    }
                    if (object2 == null) continue;
                    for (n2 = 0; n2 < 1; ++n2) {
                        String string3 = (new String[]{string2})[n2];
                        object3 = object2;
                        if (string3 != null) {
                            object3 = new File((File)object2, string3);
                        }
                        object2 = object3;
                    }
                    b2.b(string, (File)object2);
                }
                return b2;
            }
            throw new IllegalArgumentException(nIe.d("0F0F203020212546322D2D3D2D0F376D3A3A32163C313D61042F1F06161F1029050A0D0A103903021D0711463E263D2E6F02323728"));
        }
        object = new IllegalArgumentException(com.github.catvod.spider.merge.ai.c.a(nIe.d("0109262F2D2165127325202126463E263D2E6F023237286F24092163393D2D103A272C3D62113A37216F2313272B263D2B122A63"), (String)object2));
        throw object;
    }
}

