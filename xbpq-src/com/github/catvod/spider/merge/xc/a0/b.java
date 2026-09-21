/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.a0;

import com.github.catvod.spider.merge.xc.a0.a;
import java.io.PrintStream;

public abstract class b {
    public static final boolean a;
    public static Class b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        boolean bl;
        try {
            bl = System.getProperty("xml.stream.debug") != null;
        }
        catch (Exception exception) {
            return;
        }
        a = bl;
    }

    public static void a(String string) {
        if (a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer("STREAM: ");
            stringBuffer.append(string);
            printStream.println(stringBuffer.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object b(ClassLoader serializable, String string) {
        ClassNotFoundException classNotFoundException2;
        block5: {
            Exception exception2;
            block4: {
                if (serializable == null) {
                    try {
                        serializable = Class.forName(string);
                        return ((Class)serializable).newInstance();
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                    catch (ClassNotFoundException classNotFoundException2) {
                        break block5;
                    }
                }
                serializable = ((ClassLoader)((Object)serializable)).loadClass(string);
                return ((Class)serializable).newInstance();
            }
            serializable = new StringBuffer("Provider ");
            ((StringBuffer)serializable).append(string);
            ((StringBuffer)serializable).append(" could not be instantiated: ");
            ((StringBuffer)serializable).append(exception2);
            throw new a(((StringBuffer)serializable).toString(), exception2);
        }
        serializable = new StringBuffer("Provider ");
        ((StringBuffer)serializable).append(string);
        ((StringBuffer)serializable).append(" not found");
        throw new a(((StringBuffer)serializable).toString(), classNotFoundException2);
    }
}

