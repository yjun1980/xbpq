/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.H.i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public final class q {
    private static final Set<String> a = new HashSet<String>();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static <T> Set<T> a(Class<T> object, ClassLoader classLoader) {
        if (classLoader == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        Set<String> set = e.c("META-INF/services/", ((Class)object).getName());
        object = new HashSet();
        try {
            Enumeration<URL> enumeration = classLoader.getResources((String)((Object)set));
            while (enumeration.hasMoreElements()) {
                set = a;
                URL uRL = enumeration.nextElement();
                if (((HashSet)set).contains(uRL.toString())) continue;
                q.b(uRL, (Set<String>)object);
                ((HashSet)set).add(uRL.toString());
            }
        }
        catch (Throwable throwable) {}
        object = ((HashSet)object).iterator();
        while (object.hasNext()) {
            set = (String)object.next();
            try {
                hashSet.add(classLoader.loadClass((String)((Object)set)).newInstance());
            }
            catch (Exception exception) {
            }
        }
        return hashSet;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(URL object, Set<String> object2) {
        void var0_4;
        Object object3;
        block10: {
            BufferedReader bufferedReader;
            InputStream inputStream;
            object3 = null;
            try {
                inputStream = ((URL)object).openStream();
            }
            catch (Throwable throwable) {
                object2 = null;
                break block10;
            }
            try {
                object = new InputStreamReader(inputStream, "utf-8");
                bufferedReader = new BufferedReader((Reader)object);
            }
            catch (Throwable throwable) {
                object2 = inputStream;
                break block10;
            }
            while (true) {
                block11: {
                    object3 = bufferedReader.readLine();
                    if (object3 != null) break block11;
                    i.a(bufferedReader);
                    i.a(inputStream);
                    return;
                }
                int n2 = ((String)object3).indexOf(35);
                object = object3;
                if (n2 >= 0) {
                    object = ((String)object3).substring(0, n2);
                }
                if (((String)(object = ((String)object).trim())).length() == 0) continue;
                object2.add(object);
                continue;
                break;
            }
            catch (Throwable throwable) {
                object3 = bufferedReader;
                object2 = inputStream;
            }
        }
        i.a(object3);
        i.a((Closeable)object2);
        throw var0_4;
    }
}

