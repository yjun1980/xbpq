/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.A.b;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.K.d;
import com.github.catvod.spider.merge.cYh;

public final class c {
    public static final b a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        block29: {
            String string;
            int n2;
            String string2;
            block28: {
                string2 = System.getProperty(cYh.d("0D3137307929173522383133043135383834492624232433083E"));
                if (string2 != null) {
                    int n3;
                    int n4 = d.g(string2, '.', 0, 6);
                    if (n4 < 0) {
                        n2 = Integer.parseInt(string2);
                        n2 *= 65536;
                        break block28;
                    }
                    int n5 = n4 + 1;
                    n2 = n3 = d.g(string2, '.', n5, 4);
                    if (n3 < 0) {
                        n2 = string2.length();
                    }
                    object = string2.substring(0, n4);
                    string = cYh.d("13382822773B14702B30213B493C203F307434243338393D85D0E738393D4F233530252E2E3E25342F7647352F351E3403353978");
                    f.d(object, string);
                    string2 = string2.substring(n5, n2);
                    f.d(string2, string);
                    try {
                        n3 = Integer.parseInt((String)object);
                        n2 = Integer.parseInt(string2);
                        n2 += n3 * 65536;
                    }
                    catch (NumberFormatException numberFormatException) {}
                }
                n2 = 65542;
            }
            string2 = cYh.d("4B702330243F47243821327A043C2022243608312534256047");
            string = cYh.d("2E3E32253634043561323B3B142361263629473C2E30333F037027233837473161353E3C01353334392E47332D3024290B3F203532285D70");
            Object object2 = cYh.d("013F331F36370278633A382E0B392F7F3E341335333F363685D0E734392E0624283E392945796F3F322D2E3E3225363404356978");
            if (n2 >= 65544 || n2 < 65536) {
                try {
                    Object object3 = a.class.newInstance();
                    f.d(object3, (String)object2);
                    try {
                        object = (b)object3;
                        break block29;
                    }
                    catch (ClassCastException classCastException) {
                        ClassLoader classLoader = object3.getClass().getClassLoader();
                        ClassLoader classLoader2 = b.class.getClassLoader();
                        if (!f.a(classLoader, classLoader2)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(string);
                            stringBuilder.append(classLoader);
                            stringBuilder.append(string2);
                            stringBuilder.append(classLoader2);
                            object3 = new Object(stringBuilder.toString(), classCastException);
                            throw object3;
                        }
                        throw classCastException;
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    try {
                        Object object4 = Class.forName(cYh.d("0C3F353D3E3449392F25322809312D7F1D082268113D362E013F333C1E37173C243C323413313538383414")).newInstance();
                        f.d(object4, (String)object2);
                        try {
                            object = (b)object4;
                            break block29;
                        }
                        catch (ClassCastException classCastException) {
                            ClassLoader classLoader = object4.getClass().getClassLoader();
                            object4 = b.class.getClassLoader();
                            if (!f.a(classLoader, object4)) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(string);
                                stringBuilder.append(classLoader);
                                stringBuilder.append(string2);
                                stringBuilder.append(object4);
                                ClassNotFoundException classNotFoundException2 = new ClassNotFoundException(stringBuilder.toString(), classCastException);
                                throw classNotFoundException2;
                            }
                            throw classCastException;
                        }
                    }
                    catch (ClassNotFoundException classNotFoundException3) {
                        // empty catch block
                    }
                }
            }
            if (n2 >= 65543 || n2 < 65536) {
                try {
                    Object object5 = com.github.catvod.spider.merge.B.a.class.newInstance();
                    f.d(object5, (String)object2);
                    try {
                        object = (b)object5;
                        break block29;
                    }
                    catch (ClassCastException classCastException) {
                        ClassLoader classLoader = object5.getClass().getClassLoader();
                        ClassLoader classLoader3 = b.class.getClassLoader();
                        if (!f.a(classLoader, classLoader3)) {
                            object5 = new StringBuilder();
                            ((StringBuilder)object5).append(string);
                            ((StringBuilder)object5).append(classLoader);
                            ((StringBuilder)object5).append(string2);
                            ((StringBuilder)object5).append(classLoader3);
                            ClassNotFoundException classNotFoundException = new ClassNotFoundException(((StringBuilder)object5).toString(), classCastException);
                            throw classNotFoundException;
                        }
                        throw classCastException;
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    try {
                        Object object6 = Class.forName(cYh.d("0C3F353D3E3449392F25322809312D7F1D082267113D362E013F333C1E37173C243C323413313538383414")).newInstance();
                        f.d(object6, (String)object2);
                        try {
                            object = (b)object6;
                            break block29;
                        }
                        catch (ClassCastException classCastException) {
                            ClassLoader classLoader = object6.getClass().getClassLoader();
                            ClassLoader classLoader4 = b.class.getClassLoader();
                            if (!f.a(classLoader, classLoader4)) {
                                object6 = new StringBuilder();
                                ((StringBuilder)object6).append(string);
                                ((StringBuilder)object6).append(classLoader);
                                ((StringBuilder)object6).append(string2);
                                ((StringBuilder)object6).append(classLoader4);
                                object2 = new ClassNotFoundException(((StringBuilder)object6).toString(), classCastException);
                                throw object2;
                            }
                            throw classCastException;
                        }
                    }
                    catch (ClassNotFoundException classNotFoundException4) {}
                }
            }
            object = new b();
        }
        a = object;
    }
}

