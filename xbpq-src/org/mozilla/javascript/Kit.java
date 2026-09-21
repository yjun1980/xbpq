/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.r;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.mozilla.javascript.Kit$ComplexKey;
import org.mozilla.javascript.ScriptRuntime;

public class Kit {
    public static Object addListener(Object objectArray, Object objectArray2) {
        block2: {
            block3: {
                block6: {
                    block4: {
                        block5: {
                            if (objectArray2 == null) break block2;
                            if (objectArray2 instanceof Object[]) break block3;
                            if (objectArray == null) break block4;
                            if (objectArray instanceof Object[]) break block5;
                            objectArray2 = new Object[]{objectArray, objectArray2};
                            break block4;
                        }
                        Object[] objectArray3 = objectArray;
                        int n2 = objectArray3.length;
                        if (n2 < 2) break block6;
                        objectArray = new Object[n2 + 1];
                        System.arraycopy(objectArray3, 0, objectArray, 0, n2);
                        objectArray[n2] = objectArray2;
                        objectArray2 = objectArray;
                    }
                    return objectArray2;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static Class<?> classOrNull(ClassLoader object, String string) {
        try {
            object = ((ClassLoader)object).loadClass(string);
            return object;
        }
        catch (ClassNotFoundException | IllegalArgumentException | LinkageError | SecurityException throwable) {
            return null;
        }
    }

    public static Class<?> classOrNull(String object) {
        try {
            object = Class.forName((String)object);
            return object;
        }
        catch (ClassNotFoundException | IllegalArgumentException | LinkageError | SecurityException throwable) {
            return null;
        }
    }

    public static RuntimeException codeBug() {
        IllegalStateException illegalStateException = new IllegalStateException("FAILED ASSERTION");
        illegalStateException.printStackTrace(System.err);
        throw illegalStateException;
    }

    public static RuntimeException codeBug(String object) {
        object = new IllegalStateException(e.c("FAILED ASSERTION: ", (String)object));
        ((Throwable)object).printStackTrace(System.err);
        throw object;
    }

    public static Object getListener(Object objectArray, int n2) {
        if (n2 == 0) {
            if (objectArray == null) {
                return null;
            }
            if (!(objectArray instanceof Object[])) {
                return objectArray;
            }
            if (objectArray.length >= 2) {
                return objectArray[0];
            }
            throw new IllegalArgumentException();
        }
        if (n2 == 1) {
            if (!(objectArray instanceof Object[])) {
                if (objectArray != null) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            return objectArray[1];
        }
        int n3 = (objectArray = (Object[])objectArray).length;
        if (n3 >= 2) {
            if (n2 == n3) {
                return null;
            }
            return objectArray[n2];
        }
        throw new IllegalArgumentException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Object initHash(Map<Object, Object> map, Object object, Object object2) {
        synchronized (map) {
            Object object3 = map.get(object);
            if (object3 != null) return object3;
            map.put(object, object2);
            return object2;
        }
    }

    public static Object makeHashKeyFromPair(Object object, Object object2) {
        if (object != null) {
            if (object2 != null) {
                return new Kit$ComplexKey(object, object2);
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    static Object newInstanceOrNull(Class<?> clazz) {
        try {
            clazz = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            return clazz;
        }
        catch (IllegalAccessException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException throwable) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String readReader(Reader reader) {
        CharSequence charSequence;
        reader = new BufferedReader(reader);
        try {
            int n2;
            char[] cArray = new char[1024];
            charSequence = new StringBuilder(1024);
            while ((n2 = ((BufferedReader)reader).read(cArray, 0, 1024)) != -1) {
                charSequence.append(cArray, 0, n2);
            }
            charSequence = charSequence.toString();
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    ((BufferedReader)reader).close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    throwable.addSuppressed(throwable3);
                }
                throw throwable2;
            }
        }
        ((BufferedReader)reader).close();
        return charSequence;
    }

    public static byte[] readStream(InputStream object, int n2) {
        if (n2 > 0) {
            byte[] byArray = new byte[n2];
            int n3 = 0;
            while (true) {
                int n4;
                int n5;
                if ((n5 = ((InputStream)object).read(byArray, n3, byArray.length - n3)) < 0) {
                    object = byArray;
                    if (n3 != byArray.length) {
                        object = new byte[n3];
                        System.arraycopy(byArray, 0, object, 0, n3);
                    }
                    return object;
                }
                n3 = n5 = n3 + n5;
                if (n5 != byArray.length) continue;
                if (n5 == n2) {
                    n4 = n3 = ((InputStream)object).read();
                    if (n3 < 0) {
                        return byArray;
                    }
                } else {
                    n4 = -1;
                }
                byte[] byArray2 = new byte[byArray.length * 2];
                System.arraycopy(byArray, 0, byArray2, 0, n5);
                n3 = n5;
                if (n4 != -1) {
                    byArray2[n5] = (byte)n4;
                    n3 = n5 + 1;
                }
                byArray = byArray2;
            }
        }
        throw new IllegalArgumentException(r.a("Bad initialBufferCapacity: ", n2));
    }

    public static Object removeListener(Object objectArray, Object object) {
        if (object != null) {
            if (!(object instanceof Object[])) {
                Object[] objectArray2;
                block14: {
                    if (objectArray == object) {
                        objectArray2 = null;
                    } else {
                        objectArray2 = objectArray;
                        if (objectArray instanceof Object[]) {
                            Object[] objectArray3 = objectArray;
                            int n2 = objectArray3.length;
                            if (n2 >= 2) {
                                if (n2 == 2) {
                                    if (objectArray3[1] == object) {
                                        objectArray2 = objectArray3[0];
                                    } else {
                                        objectArray2 = objectArray;
                                        if (objectArray3[0] == object) {
                                            objectArray2 = objectArray3[1];
                                        }
                                    }
                                } else {
                                    int n3;
                                    int n4 = n2;
                                    do {
                                        if (objectArray3[n3 = n4 - 1] == object) {
                                            objectArray2 = new Object[n2 - 1];
                                            System.arraycopy(objectArray3, 0, objectArray2, 0, n3);
                                            n4 = n3 + 1;
                                            System.arraycopy(objectArray3, n4, objectArray2, n3, n2 - n4);
                                            break block14;
                                        }
                                        n4 = n3;
                                    } while (n3 != 0);
                                    objectArray2 = objectArray;
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                }
                return objectArray2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    static boolean testIfCanLoadRhinoClasses(ClassLoader classLoader) {
        Class<?> clazz = ScriptRuntime.ContextFactoryClass;
        return Kit.classOrNull(classLoader, clazz.getName()) == clazz;
    }

    public static int xDigitToInt(int n2, int n3) {
        block3: {
            block4: {
                block5: {
                    block2: {
                        if (n2 > 57) break block2;
                        if ((n2 -= 48) < 0) break block3;
                        break block4;
                    }
                    if (n2 > 70) break block5;
                    if (65 > n2) break block3;
                    n2 -= 55;
                    break block4;
                }
                if (n2 > 102 || 97 > n2) break block3;
                n2 -= 87;
            }
            return n2 | n3 << 4;
        }
        return -1;
    }
}

