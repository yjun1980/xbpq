/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.A.b;
import com.github.catvod.spider.merge.B.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.B.h;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.B.m;
import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.C.B;
import com.github.catvod.spider.merge.C.C;
import com.github.catvod.spider.merge.C.u;
import com.github.catvod.spider.merge.C.w;
import com.github.catvod.spider.merge.C.x;
import com.github.catvod.spider.merge.C.y;
import com.github.catvod.spider.merge.D.E;
import com.github.catvod.spider.merge.D.F;
import com.github.catvod.spider.merge.D.G;
import com.github.catvod.spider.merge.D.N;
import com.github.catvod.spider.merge.D.S;
import com.github.catvod.spider.merge.D.U;
import com.github.catvod.spider.merge.D.W;
import com.github.catvod.spider.merge.D.b0;
import com.github.catvod.spider.merge.D.j;
import com.github.catvod.spider.merge.D.j0;
import com.github.catvod.spider.merge.D.n;
import com.github.catvod.spider.merge.D.r;
import com.github.catvod.spider.merge.D.s;
import com.github.catvod.spider.merge.D.t;
import com.github.catvod.spider.merge.D.v;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.H.k;
import com.github.catvod.spider.merge.H.q;
import com.github.catvod.spider.merge.y.X;
import com.github.catvod.spider.merge.y.f;
import com.github.catvod.spider.merge.z.a;
import com.github.catvod.spider.merge.z.d;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.sql.DataSource;
import javax.sql.RowSet;
import javax.xml.datatype.XMLGregorianCalendar;

public final class o {
    private static com.github.catvod.spider.merge.H.f<Class<?>, Boolean> A;
    public static final String[] p;
    public static final String[] q;
    private static final String[] r;
    public static final boolean s;
    public static final boolean t;
    private static final long[] u;
    public static o v;
    private static boolean w;
    private static boolean x;
    private static boolean y;
    private static boolean z;
    private final k<Type, com.github.catvod.spider.merge.C.v> a;
    private final k<Type, k<Type, com.github.catvod.spider.merge.C.v>> b;
    private final ConcurrentMap<String, Class<?>> c;
    private boolean d;
    public final p e;
    protected com.github.catvod.spider.merge.C.c f;
    private boolean g;
    private long[] h;
    private long[] i;
    private long[] j;
    public final boolean k;
    public boolean l;
    private List<com.github.catvod.spider.merge.E.a> m;
    private boolean n;
    private final Callable<Void> o;

    static {
        String[] stringArray;
        p = com.github.catvod.spider.merge.B.o.n(com.github.catvod.spider.merge.H.i.e("fastjson.parser.deny.internal"));
        q = com.github.catvod.spider.merge.B.o.n(com.github.catvod.spider.merge.H.i.e("fastjson.parser.deny"));
        s = "true".equals(com.github.catvod.spider.merge.H.i.e("fastjson.parser.autoTypeSupport"));
        t = "true".equals(com.github.catvod.spider.merge.H.i.e("fastjson.parser.safeMode"));
        String[] stringArray2 = stringArray = com.github.catvod.spider.merge.B.o.n(com.github.catvod.spider.merge.H.i.e("fastjson.parser.autoTypeAccept"));
        if (stringArray == null) {
            stringArray2 = new String[]{};
        }
        r = stringArray2;
        u = new long[]{-6976602508726000783L, -6293031534589903644L, 59775428743665658L, 7267793227937552092L};
        v = new o();
        w = false;
        x = false;
        y = false;
        z = false;
        A = new m();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public o() {
        int n2;
        long l2;
        void var5_5;
        int n3;
        block13: {
            String[] stringArray;
            this.a = new k();
            this.b = new k(16);
            this.c = new ConcurrentHashMap(16, 0.75f, 1);
            this.d = com.github.catvod.spider.merge.H.c.a ^ true;
            this.e = new p();
            this.g = s;
            this.l = com.github.catvod.spider.merge.H.A.b;
            this.m = new ArrayList<com.github.catvod.spider.merge.E.a>();
            this.n = t;
            this.i = com.github.catvod.spider.merge.B.o.$d2j$hex$b197f546$decode_J("02ea2fcc0bc7d0805f72225a09858386ef7aafbef92bfc86a633ea071b2af587a7b7b0d09ff27288a77ff79b8feeaa8b4344a9b20cd4ad8e803ff00dfaf9758faf3079153fa57291b84f360e712d1292c9f4ef3be7661894c5730f58265c30943f7ddf3128793794208b17932fa623a150c44410ce8258a837490cb1fdaf3daaa7c6e1c1b7e6a9aa37377a482608aaaa8fe4e6532f5682ab39aa982cf56262aca0e83198447a93ad96a060ad1fda50ae5a228e3823fff6af4d339ab9954cffaf4fc96e741c340fb4a2135d7f75ede8b7e92f9396536b8bb9cef06627c19dddbc9964724ee3dee0bcd096676ae9134fbe26a4cb1cfb72babe8b80f2badee10bc058622ee3fa6a08c14cfeec58094d66c2057c7cc8c9f71fc40a05caba63b364c60624e7e3bf9e59c7a961e601569ed4c8359990283a4bf0c88e72fd82506963c925232284e49cf2cb346d31b3f4cdefd1ed39b277cc914bd501ea090b1fe99ed5f5fee792ab686fd6ac2b985e593dcad83e9e44a615d6d8dcd69b8b9a80a023de04417d238f20fcde75b3cd10f3df2ddf2f58424860e49ae08f46bfd5049891e17e466ce5c73aebe22b69ad1fa5d603e6342a2b0519fd04e72a961d5be54b18e90708f625ad0bf2e9ed4b5cb43c6513ed77b4299d093d98f2e8b890544a2a70f33667f21845e474f491d9e3b34f3fd9f4e6714d8ecf7dd7f5696aa3730e34c0f6bc8da5df746ee9f79176820ce23a77fcd88bb94486e7f3fc20d7560061fc5bfd7ce3f121f05ba1ff0534edf1801addffe5c555cd67e010003ec16c13191676008afb5b4c23aa2b02b80172cb68500803a3aba378bc115b04071c28f2a0fc5c0555513afe745c550ade5a95a52f296e0b9392b7d01485ef0bf05efd661b51e60e24669953a25001103e9b9d84cabdb210e5dae04684c4db10fc0a21101f5b9b1158317267b4774214f04ad0ea6f2edb14fa4c292db26c4b152a622752ca4c92171ad4aeea97263b19b78b356a1cf1d61cae3dff58338c0a1ebb13e717e72c6524494eef8f04f6d2247155dce7d599ec24a2718fc2f162e92529af77b832075d270636934ee482ac280c710ac42cce712a5d012f113aced12a31d929febbefdf2adf4c347a46373a2b37689d22b3d86d2bd8b051c8bb8d302d0dae52ead350e92f4c55d4d8abb43b31056970c8d78e7c321083a169530b2f33e9beee6b0b3e9a332f3f521f924bc63353b17125e0f3e733f1fd2984e71ea83494e8fcdc9876313778e81101cb0783379b8b0c38b2f42638f00c92012e948f39ffc705bb2d41313a33bcb25e63e07e3a6432f76703a4db3a21b26dbfec510b3be2f024a59440f13ba9fbc90f561ad1429208aed2c90d3243b95f448f20890e44571f84b5a408c8461494b38ba1d30f47d97700fbda2b31492c202803b397374a0dd758e754e2a34b30f5379de481f84b18e8e305ec4ef54cc130eb5f7472a94d75c616ff908cf04e1f82136ddc0dd14f4adf7633574f1b52bcbce36cb4b67d52c100976f2d555e53d5dae15f265e8554fc4f456d4a502857ac99a013125c9b59fe5e2e075cd85b5ad140ab7130cbb05a42ea75028249615b760437b9e5d3745d84ed40dedde6925dbbddcdf83e09615e530763fb2256215f07513821d7bdc561347c39741224db6235b231a1a2cc6e63b9c7170ae620a263be9e144e22b07a64cd20d9c1841bf86573391911c3535c66d2f0e0325483496777b3845017e0b669b2fd2abb1e50476affaf4ca56fbfca6f28460afc832de96ffb95c13ea5d46b74ff310e26b90bb574d30f1d87f560cc75effe07516a587a76971367265893e578f567a9d7dedd3a79f39ca12736eea77a4bccb8410207fa7a651abf281d31d97e7a41bf281d48d97ee3bb20da77c4e67e");
            long[] lArray = new long[r.length];
            for (n3 = 0; n3 < (stringArray = r).length; ++n3) {
                lArray[n3] = com.github.catvod.spider.merge.H.A.z(stringArray[n3]);
            }
            Arrays.sort(lArray);
            this.j = lArray;
            this.o = new l(this);
            this.k = false;
            if (!com.github.catvod.spider.merge.H.c.a) {
                try {
                    com.github.catvod.spider.merge.H.b b2 = new com.github.catvod.spider.merge.H.b();
                    com.github.catvod.spider.merge.C.c c2 = new com.github.catvod.spider.merge.C.c(b2);
                    break block13;
                }
                catch (ExceptionInInitializerError | NoClassDefFoundError | AccessControlException throwable) {}
            }
            Object var5_4 = null;
        }
        this.f = var5_5;
        if (var5_5 == null) {
            this.d = false;
        }
        k<Type, com.github.catvod.spider.merge.C.v> k2 = this.a;
        U u2 = U.b;
        k2.c((Type)((Object)SimpleDateFormat.class), u2);
        k<Type, com.github.catvod.spider.merge.C.v> k3 = this.a;
        Object object = com.github.catvod.spider.merge.D.r.b;
        k3.c((Type)((Object)Calendar.class), (com.github.catvod.spider.merge.C.v)object);
        this.a.c((Type)((Object)XMLGregorianCalendar.class), (com.github.catvod.spider.merge.C.v)object);
        object = this.a;
        com.github.catvod.spider.merge.C.t t2 = com.github.catvod.spider.merge.C.t.a;
        ((k)object).c(com.github.catvod.spider.merge.y.e.class, t2);
        object = this.a;
        Object object2 = com.github.catvod.spider.merge.D.v.a;
        ((k)object).c(com.github.catvod.spider.merge.y.b.class, (com.github.catvod.spider.merge.C.v)object2);
        this.a.c((Type)((Object)Map.class), t2);
        this.a.c((Type)((Object)HashMap.class), t2);
        this.a.c((Type)((Object)LinkedHashMap.class), t2);
        this.a.c((Type)((Object)TreeMap.class), t2);
        this.a.c((Type)((Object)ConcurrentMap.class), t2);
        this.a.c((Type)((Object)ConcurrentHashMap.class), t2);
        this.a.c((Type)((Object)Collection.class), (com.github.catvod.spider.merge.C.v)object2);
        this.a.c((Type)((Object)List.class), (com.github.catvod.spider.merge.C.v)object2);
        this.a.c((Type)((Object)ArrayList.class), (com.github.catvod.spider.merge.C.v)object2);
        object = this.a;
        com.github.catvod.spider.merge.C.r r2 = com.github.catvod.spider.merge.C.r.a;
        ((k)object).c(Object.class, (com.github.catvod.spider.merge.C.v)r2);
        object2 = this.a;
        object = j0.a;
        ((k)object2).c(String.class, object);
        this.a.c((Type)((Object)StringBuffer.class), (com.github.catvod.spider.merge.C.v)object);
        this.a.c((Type)((Object)StringBuilder.class), (com.github.catvod.spider.merge.C.v)object);
        object2 = this.a;
        k<Type, com.github.catvod.spider.merge.C.v> k4 = Character.TYPE;
        object = com.github.catvod.spider.merge.D.t.a;
        ((k)object2).c(k4, (com.github.catvod.spider.merge.C.v)object);
        this.a.c((Type)((Object)Character.class), (com.github.catvod.spider.merge.C.v)object);
        object2 = this.a;
        k4 = Byte.TYPE;
        object = com.github.catvod.spider.merge.C.u.a;
        ((k)object2).c(k4, (com.github.catvod.spider.merge.C.v)object);
        this.a.c((Type)((Object)Byte.class), (com.github.catvod.spider.merge.C.v)object);
        this.a.c(Short.TYPE, (com.github.catvod.spider.merge.C.v)object);
        this.a.c((Type)((Object)Short.class), (com.github.catvod.spider.merge.C.v)object);
        Object object3 = this.a;
        k4 = Integer.TYPE;
        object2 = G.a;
        ((k)object3).c(k4, (com.github.catvod.spider.merge.C.v)object2);
        this.a.c((Type)((Object)Integer.class), (com.github.catvod.spider.merge.C.v)object2);
        object3 = this.a;
        Class<Boolean> clazz = Long.TYPE;
        k4 = S.a;
        ((k)object3).c(clazz, (com.github.catvod.spider.merge.C.v)((Object)k4));
        this.a.c((Type)((Object)Long.class), (com.github.catvod.spider.merge.C.v)((Object)k4));
        this.a.c((Type)((Object)BigInteger.class), com.github.catvod.spider.merge.D.n.c);
        this.a.c((Type)((Object)BigDecimal.class), com.github.catvod.spider.merge.D.m.c);
        k<Type, com.github.catvod.spider.merge.C.v> k5 = this.a;
        object3 = Float.TYPE;
        clazz = E.b;
        k5.c((Type)object3, (com.github.catvod.spider.merge.C.v)((Object)clazz));
        this.a.c((Type)((Object)Float.class), (com.github.catvod.spider.merge.C.v)((Object)clazz));
        this.a.c(Double.TYPE, (com.github.catvod.spider.merge.C.v)object);
        this.a.c((Type)((Object)Double.class), (com.github.catvod.spider.merge.C.v)object);
        k5 = this.a;
        clazz = Boolean.TYPE;
        object3 = com.github.catvod.spider.merge.D.o.a;
        k5.c(clazz, (com.github.catvod.spider.merge.C.v)object3);
        this.a.c((Type)((Object)Boolean.class), (com.github.catvod.spider.merge.C.v)object3);
        this.a.c((Type)((Object)Class.class), u2);
        this.a.c((Type)((Object)char[].class), new s());
        this.a.c((Type)((Object)AtomicBoolean.class), (com.github.catvod.spider.merge.C.v)object3);
        this.a.c((Type)((Object)AtomicInteger.class), (com.github.catvod.spider.merge.C.v)object2);
        this.a.c((Type)((Object)AtomicLong.class), (com.github.catvod.spider.merge.C.v)((Object)k4));
        k4 = this.a;
        object2 = b0.a;
        k4.c((Type)((Object)AtomicReference.class), (com.github.catvod.spider.merge.C.v)object2);
        this.a.c((Type)((Object)WeakReference.class), (com.github.catvod.spider.merge.C.v)object2);
        this.a.c((Type)((Object)SoftReference.class), (com.github.catvod.spider.merge.C.v)object2);
        this.a.c((Type)((Object)UUID.class), u2);
        this.a.c((Type)((Object)TimeZone.class), u2);
        this.a.c((Type)((Object)Locale.class), u2);
        this.a.c((Type)((Object)Currency.class), u2);
        this.a.c((Type)((Object)Inet4Address.class), u2);
        this.a.c((Type)((Object)Inet6Address.class), u2);
        this.a.c((Type)((Object)InetSocketAddress.class), u2);
        this.a.c((Type)((Object)File.class), u2);
        this.a.c((Type)((Object)URI.class), u2);
        this.a.c((Type)((Object)URL.class), u2);
        this.a.c((Type)((Object)Pattern.class), u2);
        this.a.c((Type)((Object)Charset.class), u2);
        this.a.c((Type)((Object)com.github.catvod.spider.merge.y.N.class), u2);
        this.a.c((Type)((Object)Number.class), (com.github.catvod.spider.merge.C.v)object);
        object = this.a;
        com.github.catvod.spider.merge.D.h h2 = com.github.catvod.spider.merge.D.h.a;
        ((k)object).c(AtomicIntegerArray.class, (com.github.catvod.spider.merge.C.v)h2);
        this.a.c((Type)((Object)AtomicLongArray.class), h2);
        this.a.c((Type)((Object)StackTraceElement.class), B.a);
        this.a.c((Type)((Object)Serializable.class), r2);
        this.a.c((Type)((Object)Cloneable.class), r2);
        this.a.c((Type)((Object)Comparable.class), r2);
        this.a.c((Type)((Object)Closeable.class), r2);
        this.a.c((Type)((Object)f.class), new com.github.catvod.spider.merge.C.p());
        com.github.catvod.spider.merge.H.m.c(this.o);
        String[] stringArray = q;
        if (stringArray != null) {
            for (n3 = 0; n3 < stringArray.length; ++n3) {
                String string = stringArray[n3];
                if (string == null || string.length() == 0 || Arrays.binarySearch(this.i, l2 = com.github.catvod.spider.merge.H.A.z(string)) >= 0) continue;
                long[] lArray = this.i;
                n2 = lArray.length + 1;
                object = new long[n2];
                object[n2 - 1] = l2;
                System.arraycopy(lArray, 0, object, 0, lArray.length);
                Arrays.sort((long[])object);
                this.i = (long[])object;
            }
        }
        String[] stringArray2 = p;
        if (stringArray2 != null) {
            for (n3 = 0; n3 < stringArray2.length; ++n3) {
                String string = stringArray2[n3];
                if (string == null || string.length() == 0) continue;
                l2 = com.github.catvod.spider.merge.H.A.z(string);
                long[] lArray = this.h;
                if (lArray == null) {
                    this.h = new long[]{l2};
                    continue;
                }
                if (Arrays.binarySearch(lArray, l2) >= 0) continue;
                long[] lArray2 = this.h;
                n2 = lArray2.length + 1;
                object = new long[n2];
                object[n2 - 1] = l2;
                System.arraycopy(lArray2, 0, object, 0, lArray2.length);
                Arrays.sort((long[])object);
                this.h = (long[])object;
            }
        }
        String[] stringArray3 = r;
        if (stringArray3 == null) {
            return;
        }
        n3 = 0;
        while (n3 < stringArray3.length) {
            String string = stringArray3[n3];
            if (string != null && string.length() != 0 && Arrays.binarySearch(this.j, l2 = com.github.catvod.spider.merge.H.A.z(string)) < 0) {
                long[] lArray = this.j;
                n2 = lArray.length + 1;
                object = new long[n2];
                object[n2 - 1] = l2;
                System.arraycopy(lArray, 0, object, 0, lArray.length);
                Arrays.sort((long[])object);
                this.j = (long[])object;
            }
            ++n3;
        }
    }

    static /* synthetic */ k a(o o2) {
        return o2.a;
    }

    /*
     * WARNING - void declaration
     */
    private static Method g(Class genericDeclaration2, Class clazz) {
        void var0_4;
        block2: {
            for (Method method : ((Class)genericDeclaration2).getMethods()) {
                void var1_5;
                if (!Modifier.isStatic(method.getModifiers()) || method.getReturnType() != var1_5 || method.getParameterTypes().length != 1 || method.getAnnotation(a.class) == null) {
                    continue;
                }
                break block2;
            }
            Object var0_3 = null;
        }
        return var0_4;
    }

    public static Field h(String string, Map<String, Field> object) {
        Object object2;
        block11: {
            Object object3;
            Object object4 = object3 = object.get(string);
            if (object3 == null) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("_");
                ((StringBuilder)object3).append(string);
                object4 = object.get(((StringBuilder)object3).toString());
            }
            object3 = object4;
            if (object4 == null) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("m_");
                ((StringBuilder)object3).append(string);
                object3 = object.get(((StringBuilder)object3).toString());
            }
            object2 = object3;
            if (object3 == null) {
                char c2 = string.charAt(0);
                object4 = object3;
                if (c2 >= 'a') {
                    object4 = object3;
                    if (c2 <= 'z') {
                        object3 = string.toCharArray();
                        object3[0] = (char)(object3[0] - 32);
                        object4 = object.get(new String((char[])object3));
                    }
                }
                object2 = object4;
                if (string.length() > 2) {
                    char c3 = string.charAt(1);
                    object2 = object4;
                    if (c2 >= 'a') {
                        object2 = object4;
                        if (c2 <= 'z') {
                            object2 = object4;
                            if (c3 >= 'A') {
                                object2 = object4;
                                if (c3 <= 'Z') {
                                    object = object.entrySet().iterator();
                                    do {
                                        object2 = object4;
                                        if (!object.hasNext()) break block11;
                                    } while (!string.equalsIgnoreCase((String)(object3 = (Map.Entry)object.next()).getKey()));
                                    object2 = (Field)object3.getValue();
                                }
                            }
                        }
                    }
                }
            }
        }
        return object2;
    }

    public static boolean i(Class<?> clazz) {
        Boolean bl;
        boolean bl2 = clazz.isPrimitive();
        boolean bl3 = false;
        bl2 = bl2 || clazz == Boolean.class || clazz == Character.class || clazz == Byte.class || clazz == Short.class || clazz == Integer.class || clazz == Long.class || clazz == Float.class || clazz == Double.class || clazz == BigInteger.class || clazz == BigDecimal.class || clazz == String.class || clazz == Date.class || clazz.isEnum();
        Boolean bl4 = bl = Boolean.valueOf(bl2);
        if (!bl.booleanValue()) {
            bl4 = com.github.catvod.spider.merge.H.m.b(A, clazz);
        }
        bl2 = bl3;
        if (bl4 != null) {
            bl2 = bl4;
        }
        return bl2;
    }

    public static void k(Class<?> clazz, Map<String, Field> map) {
        for (Field field : clazz.getDeclaredFields()) {
            String string = field.getName();
            if (map.containsKey(string)) continue;
            map.put(string, field);
        }
        if (clazz.getSuperclass() != null && clazz.getSuperclass() != Object.class) {
            com.github.catvod.spider.merge.B.o.k(clazz.getSuperclass(), map);
        }
    }

    private static String[] n(String string) {
        if (string != null && string.length() > 0) {
            return string.split(",");
        }
        return null;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Class<?> b(String string, Class<?> clazz, int n2) {
        boolean bl;
        Class clazz2;
        Object object;
        int n3;
        int n4;
        block43: {
            void var1_4;
            block40: {
                block39: {
                    block38: {
                        int n5;
                        Object object2;
                        long l2;
                        int n6;
                        block41: {
                            long l3;
                            long l4;
                            block42: {
                                if (string == null) {
                                    return null;
                                }
                                n6 = com.github.catvod.spider.merge.B.c.x.a;
                                n6 = !this.n && (n2 & n6) == 0 && (n6 & com.github.catvod.spider.merge.y.a.f) == 0 ? 0 : 1;
                                if (n6 != 0) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("safeMode not support autoType : ", string));
                                n6 = com.github.catvod.spider.merge.B.c.t.a;
                                n2 = !this.g && (n2 & n6) == 0 && (n6 & com.github.catvod.spider.merge.y.a.f) == 0 ? 0 : 1;
                                if (string.length() >= 192) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
                                if (string.length() < 3) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
                                n6 = clazz != null && (l2 = com.github.catvod.spider.merge.H.A.z(clazz.getName())) != -8024746738719829346L && l2 != 3247277300971823414L && l2 != -5811778396720452501L && l2 != -1368967840069965882L && l2 != 2980334044947851925L && l2 != 5183404141909004468L && l2 != 7222019943667248779L && l2 != -2027296626235911549L && l2 != -2114196234051346931L && l2 != -2939497380989775398L ? 1 : 0;
                                object2 = string.replace('$', '.');
                                l2 = ((long)((String)object2).charAt(0) ^ 0xCBF29CE484222325L) * 1099511628211L;
                                if (l2 == -5808493101479473382L) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
                                if ((l2 ^ (long)((String)object2).charAt(((String)object2).length() - 1)) * 1099511628211L == 655701488918567152L) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
                                l2 = ((((long)((String)object2).charAt(0) ^ 0xCBF29CE484222325L) * 1099511628211L ^ (long)((String)object2).charAt(1)) * 1099511628211L ^ (long)((String)object2).charAt(2)) * 1099511628211L;
                                l4 = com.github.catvod.spider.merge.H.A.z((String)object2);
                                n4 = Arrays.binarySearch(u, l4) >= 0 ? 1 : 0;
                                l3 = l2;
                                if (this.h != null) {
                                    n3 = 3;
                                    long l5 = l2;
                                    while (true) {
                                        l3 = l2;
                                        if (n3 >= ((String)object2).length()) break;
                                        if (Arrays.binarySearch(this.h, l5 = (l5 ^ (long)((String)object2).charAt(n3)) * 1099511628211L) >= 0) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
                                        ++n3;
                                    }
                                }
                                l2 = l3;
                                n3 = n6;
                                n5 = n4;
                                if (n4 != 0) break block41;
                                if (n2 != 0) break block42;
                                n3 = n6;
                                n5 = n4;
                                if (n6 == 0) break block41;
                            }
                            int n7 = 3;
                            l3 = l2;
                            while (true) {
                                n3 = n6;
                                n5 = n4;
                                if (n7 >= ((String)object2).length()) break;
                                l3 = ((long)((String)object2).charAt(n7) ^ l3) * 1099511628211L;
                                if (Arrays.binarySearch(this.j, l3) >= 0 && (object = com.github.catvod.spider.merge.H.A.m0(string, true)) != null) {
                                    return object;
                                }
                                if (Arrays.binarySearch(this.i, l3) >= 0 && com.github.catvod.spider.merge.H.A.H(string) == null) {
                                    if (Arrays.binarySearch(this.j, l4) < 0) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
                                }
                                ++n7;
                            }
                        }
                        object = com.github.catvod.spider.merge.H.A.H(string);
                        clazz2 = object;
                        if (object == null) {
                            clazz2 = this.a.a(string);
                        }
                        object = clazz2;
                        if (clazz == null) {
                            object = clazz2;
                            if (clazz2 != null) {
                                object = clazz2;
                                if (Throwable.class.isAssignableFrom(clazz2)) {
                                    object = clazz2;
                                    if (n2 == 0) {
                                        object = null;
                                    }
                                }
                            }
                        }
                        clazz2 = object;
                        if (object == null) {
                            clazz2 = (Class)((ConcurrentHashMap)this.c).get(string);
                        }
                        object = clazz2;
                        if (n5 != 0) {
                            object = com.github.catvod.spider.merge.H.A.m0(string, true);
                        }
                        if (object != null) {
                            if (clazz == null) return object;
                            if (object == HashMap.class) return object;
                            if (object == LinkedHashMap.class) return object;
                            if (clazz.isAssignableFrom((Class<?>)object)) {
                                return object;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("type not match. ");
                            ((StringBuilder)object).append(string);
                            ((StringBuilder)object).append(" -> ");
                            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e(clazz, (StringBuilder)object));
                        }
                        n4 = n2;
                        clazz2 = object;
                        if (n2 == 0) {
                            n6 = 3;
                            while (true) {
                                n4 = n2;
                                clazz2 = object;
                                if (n6 >= ((String)object2).length()) break;
                                if (Arrays.binarySearch(this.i, l2 = (l2 ^ (long)((String)object2).charAt(n6)) * 1099511628211L) >= 0) {
                                    if (string.endsWith("Exception")) return null;
                                    if (!string.endsWith("Error")) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
                                    return null;
                                }
                                if (Arrays.binarySearch(this.j, l2) >= 0) {
                                    object = com.github.catvod.spider.merge.H.A.m0(string, true);
                                    if (object == null) {
                                        return clazz;
                                    }
                                    if (clazz == null) return object;
                                    if (!clazz.isAssignableFrom((Class<?>)object)) {
                                        return object;
                                    }
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("type not match. ");
                                    ((StringBuilder)object).append(string);
                                    ((StringBuilder)object).append(" -> ");
                                    throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e(clazz, (StringBuilder)object));
                                }
                                ++n6;
                            }
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string.replace('.', '/'));
                        ((StringBuilder)object).append(".class");
                        object = ((StringBuilder)object).toString();
                        object = o.class.getClassLoader().getResourceAsStream((String)object);
                        if (object == null) break block38;
                        try {
                            b b2 = new b((InputStream)object, true);
                            object2 = new com.github.catvod.spider.merge.A.l("<clinit>", new Class[0]);
                            b2.a((com.github.catvod.spider.merge.A.l)object2);
                            bl = ((com.github.catvod.spider.merge.A.l)object2).b();
                            break block39;
                        }
                        catch (Throwable throwable) {
                            break block40;
                        }
                    }
                    bl = false;
                }
                com.github.catvod.spider.merge.H.i.a((Closeable)object);
                break block43;
                catch (Throwable throwable) {
                    object = null;
                }
            }
            com.github.catvod.spider.merge.H.i.a((Closeable)object);
            throw var1_4;
            catch (Exception exception) {
                block44: {
                    object = null;
                    break block44;
                    catch (Exception exception2) {}
                }
                com.github.catvod.spider.merge.H.i.a((Closeable)object);
                bl = false;
            }
        }
        if (n4 == 0 && !bl && n3 == 0) {
            object = clazz2;
        } else {
            boolean bl2 = n4 != 0 || bl;
            object = com.github.catvod.spider.merge.H.A.m0(string, bl2);
        }
        if (object != null) {
            if (bl) {
                if (n4 == 0) return object;
                com.github.catvod.spider.merge.H.A.a(string, object);
                return object;
            }
            if (ClassLoader.class.isAssignableFrom((Class<?>)object)) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
            if (DataSource.class.isAssignableFrom((Class<?>)object)) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
            if (RowSet.class.isAssignableFrom((Class<?>)object)) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
            if (clazz != null) {
                if (clazz.isAssignableFrom((Class<?>)object)) {
                    if (n4 == 0) return object;
                    com.github.catvod.spider.merge.H.A.a(string, object);
                    return object;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("type not match. ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" -> ");
                throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e(clazz, (StringBuilder)object));
            }
            bl = com.github.catvod.spider.merge.H.A.b;
            if (com.github.catvod.spider.merge.H.l.b((Class)object, (Type)object, (boolean)false).d != null) {
                if (n4 != 0) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
            }
        }
        if (n4 == 0) {
            if (string.endsWith("Exception")) return null;
            if (!string.endsWith("Error")) throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.e.c("autoType is not support. ", string));
            return null;
        }
        if (object == null) return object;
        if (n4 == 0) return object;
        com.github.catvod.spider.merge.H.A.a(string, object);
        return object;
    }

    public final com.github.catvod.spider.merge.C.v c(Class<?> clazz, Type type) {
        Object object;
        Object object2;
        boolean bl;
        boolean bl2;
        block34: {
            bl = bl2 = this.d & (this.k ^ true);
            if (bl2) {
                object2 = com.github.catvod.spider.merge.H.A.D(clazz, d.class);
                if (object2 != null) {
                    object = object2.deserializer();
                    if (object != Void.class) {
                        try {
                            object = object.newInstance();
                            if (object instanceof com.github.catvod.spider.merge.C.v) {
                                object = (com.github.catvod.spider.merge.C.v)object;
                                return object;
                            }
                        }
                        catch (Throwable throwable) {
                            // empty catch block
                        }
                    }
                    bl2 = object2.asm() && object2.parseFeatures().length == 0;
                }
                bl = bl2;
                if (bl2) {
                    object = com.github.catvod.spider.merge.H.l.e(clazz, (d)object2);
                    object2 = object;
                    if (object == null) {
                        object2 = clazz;
                    }
                    do {
                        if (!Modifier.isPublic(((Class)object2).getModifiers())) {
                            bl = false;
                            break block34;
                        }
                        object = ((Class)object2).getSuperclass();
                        bl = bl2;
                        if (object == Object.class) break block34;
                        object2 = object;
                    } while (object != null);
                    bl = bl2;
                }
            }
        }
        bl2 = bl;
        if (clazz.getTypeParameters().length != 0) {
            bl2 = false;
        }
        bl = bl2;
        if (bl2) {
            object2 = this.f;
            bl = bl2;
            if (object2 != null) {
                bl = bl2;
                if (((com.github.catvod.spider.merge.C.c)object2).a.b(clazz)) {
                    bl = false;
                }
            }
        }
        bl2 = bl;
        if (bl) {
            bl2 = com.github.catvod.spider.merge.H.c.a(clazz.getSimpleName());
        }
        bl = bl2;
        if (bl2) {
            if (clazz.isInterface()) {
                bl2 = false;
            }
            bl = com.github.catvod.spider.merge.H.A.b;
            object = com.github.catvod.spider.merge.H.l.b(clazz, type, false);
            bl = bl2;
            if (bl2) {
                bl = bl2;
                if (object.h.length > 200) {
                    bl = false;
                }
            }
            object2 = object.c;
            bl2 = bl;
            if (bl) {
                bl2 = bl;
                if (object2 == null) {
                    bl2 = bl;
                    if (!clazz.isInterface()) {
                        bl2 = false;
                    }
                }
            }
            object = object.h;
            int n2 = ((com.github.catvod.spider.merge.H.e[])object).length;
            int n3 = 0;
            while (true) {
                Object object3;
                bl = bl2;
                if (n3 >= n2) break;
                com.github.catvod.spider.merge.H.e e2 = object[n3];
                if (e2.h || !Modifier.isPublic(((Class)(object2 = e2.e)).getModifiers()) || ((Class)object2).isMemberClass() && !Modifier.isStatic(((Class)object2).getModifiers()) || e2.l() != null && !com.github.catvod.spider.merge.H.c.a(e2.l().getName()) || (object3 = e2.h()) != null && (!com.github.catvod.spider.merge.H.c.a(object3.name()) || object3.format().length() != 0 || object3.deserializeUsing() != Void.class || object3.parseFeatures().length != 0 || object3.unwrapped()) || (object3 = e2.b) != null && ((Method)object3).getParameterTypes().length > 1 || ((Class)object2).isEnum() && !(this.f((Type)object2) instanceof com.github.catvod.spider.merge.C.j)) {
                    bl = false;
                    break;
                }
                ++n3;
            }
        }
        bl2 = bl;
        if (bl) {
            bl2 = bl;
            if (clazz.isMemberClass()) {
                bl2 = bl;
                if (!Modifier.isStatic(clazz.getModifiers())) {
                    bl2 = false;
                }
            }
        }
        bl = bl2;
        if (bl2) {
            bl = bl2;
            if (com.github.catvod.spider.merge.H.A.k0(clazz)) {
                bl = false;
            }
        }
        if (!bl) {
            return new com.github.catvod.spider.merge.C.q(this, clazz, type);
        }
        bl = com.github.catvod.spider.merge.H.A.b;
        object2 = com.github.catvod.spider.merge.H.l.b(clazz, type, false);
        try {
            object = this.f.o(this, (com.github.catvod.spider.merge.H.l)object2);
            return object;
        }
        catch (Exception exception) {
            throw new com.github.catvod.spider.merge.y.d(com.github.catvod.spider.merge.B.h.e(clazz, com.github.catvod.spider.merge.C.a.c("create asm deserializer error, ")), exception);
        }
        catch (com.github.catvod.spider.merge.y.d d2) {
            return new com.github.catvod.spider.merge.C.q(this, (com.github.catvod.spider.merge.H.l)object2);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return new com.github.catvod.spider.merge.C.q(this, clazz, type);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final com.github.catvod.spider.merge.C.v d(Type object) {
        Type type = com.github.catvod.spider.merge.y.a.d((Type)object);
        if (type == null) {
            object = this.a.b((Type)object);
            return (com.github.catvod.spider.merge.C.v)object;
        }
        if ((object = this.b.b((Type)object)) == null) {
            return null;
        }
        object = ((k)object).b((Type)type);
        return (com.github.catvod.spider.merge.C.v)object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final com.github.catvod.spider.merge.C.v e(Class<?> object, Type object2) {
        void var7_22;
        int n2;
        int n3;
        Object object3;
        Class<?> clazz;
        Object object4;
        block59: {
            com.github.catvod.spider.merge.C.v clazz22 = this.d((Type)object2);
            object4 = clazz22;
            if (clazz22 == null) {
                object4 = clazz22;
                if (object2 instanceof com.github.catvod.spider.merge.H.n) {
                    object4 = this.d(X.a((com.github.catvod.spider.merge.H.n)object2));
                }
            }
            if (object4 != null) {
                return object4;
            }
            clazz = object2;
            if (object2 == null) {
                clazz = object;
            }
            if ((object2 = this.d(clazz)) != null) {
                return object2;
            }
            object4 = com.github.catvod.spider.merge.H.A.D(object, d.class);
            if (object4 != null && (object4 = object4.mappingTo()) != Void.class) {
                return this.e((Class<?>)object4, (Type)object4);
            }
            if (clazz instanceof WildcardType || clazz instanceof TypeVariable || clazz instanceof ParameterizedType) {
                object2 = this.d((Type)object);
            }
            if (object2 != null) {
                return object2;
            }
            Iterator iterator = ((ArrayList)this.m).iterator();
            while (iterator.hasNext()) {
                object2 = object4 = ((com.github.catvod.spider.merge.E.a)iterator.next()).b();
                if (object4 == null) continue;
                this.l(clazz, (com.github.catvod.spider.merge.C.v)object4);
                return object4;
            }
            object3 = ((Class)object).getName().replace('$', '.');
            boolean bl = ((String)object3).startsWith("java.awt.");
            n3 = 0;
            object4 = object2;
            if (bl) {
                object4 = object2;
                if (com.github.catvod.spider.merge.D.j.j(object)) {
                    object4 = object2;
                    if (!w) {
                        for (n2 = 0; n2 < 4; ++n2) {
                            try {
                                object2 = (new String[]{"java.awt.Point", "java.awt.Font", "java.awt.Rectangle", "java.awt.Color"})[n2];
                                if (!((String)object2).equals(object3)) continue;
                                object2 = Class.forName((String)object2);
                                object4 = com.github.catvod.spider.merge.D.j.a;
                                this.l((Type)object2, (com.github.catvod.spider.merge.C.v)object4);
                                return object4;
                            }
                            catch (Throwable throwable) {
                                w = true;
                                break;
                            }
                        }
                        object4 = com.github.catvod.spider.merge.D.j.a;
                    }
                }
            }
            Iterator<com.github.catvod.spider.merge.C.f> iterator2 = object4;
            if (!x) {
                object2 = object4;
                try {
                    if (((String)object3).startsWith("java.time.")) {
                        n2 = 0;
                        while (true) {
                            Iterator<com.github.catvod.spider.merge.C.f> iterator3 = object4;
                            if (n2 < 12) {
                                object2 = object4;
                                String string = (new String[]{"java.time.LocalDateTime", "java.time.LocalDate", "java.time.LocalTime", "java.time.ZonedDateTime", "java.time.OffsetDateTime", "java.time.OffsetTime", "java.time.ZoneOffset", "java.time.ZoneRegion", "java.time.ZoneId", "java.time.Period", "java.time.Duration", "java.time.Instant"})[n2];
                                object2 = object4;
                                if (string.equals(object3)) {
                                    object2 = object4;
                                    Class<?> clazz2 = Class.forName(string);
                                    object2 = object4;
                                    object2 = object4 = com.github.catvod.spider.merge.C.s.a;
                                    this.l(clazz2, (com.github.catvod.spider.merge.C.v)object4);
                                    return object4;
                                }
                                ++n2;
                                continue;
                            }
                            break block59;
                            break;
                        }
                    }
                    object2 = object4;
                    Iterator<com.github.catvod.spider.merge.C.f> iterator4 = object4;
                }
                catch (Throwable object42) {
                    x = true;
                    Class<?> clazz3 = object2;
                    break block59;
                }
                {
                    if (!((String)object3).startsWith("java.util.Optional")) break block59;
                    n2 = 0;
                    while (true) {
                        Iterator<com.github.catvod.spider.merge.C.f> iterator5 = object4;
                        if (n2 >= 4) break;
                        object2 = object4;
                        String string = (new String[]{"java.util.Optional", "java.util.OptionalDouble", "java.util.OptionalInt", "java.util.OptionalLong"})[n2];
                        object2 = object4;
                        if (string.equals(object3)) {
                            object2 = object4;
                            Class<?> clazz4 = Class.forName(string);
                            object2 = object4;
                            object2 = object4 = com.github.catvod.spider.merge.C.w.a;
                            this.l(clazz4, (com.github.catvod.spider.merge.C.v)object4);
                            return object4;
                        }
                        ++n2;
                    }
                }
            }
        }
        object2 = var7_22;
        if (!y) {
            object4 = var7_22;
            object2 = var7_22;
            try {
                if (((String)object3).startsWith("org.joda.time.")) {
                    n2 = 0;
                    while (true) {
                        object2 = var7_22;
                        if (n2 < 9) {
                            object4 = var7_22;
                            object2 = (new String[]{"org.joda.time.DateTime", "org.joda.time.LocalDate", "org.joda.time.LocalDateTime", "org.joda.time.LocalTime", "org.joda.time.Instant", "org.joda.time.Period", "org.joda.time.Duration", "org.joda.time.DateTimeZone", "org.joda.time.format.DateTimeFormatter"})[n2];
                            object4 = var7_22;
                            if (((String)object2).equals(object3)) {
                                object4 = var7_22;
                                Class<?> clazz2 = Class.forName((String)object2);
                                object4 = var7_22;
                                object4 = object2 = N.a;
                                this.l(clazz2, (com.github.catvod.spider.merge.C.v)object2);
                                return object2;
                            }
                            ++n2;
                            continue;
                        }
                        break;
                    }
                }
            }
            catch (Throwable throwable) {
                y = true;
                object2 = object4;
            }
        }
        object4 = object2;
        if (!z) {
            object4 = object2;
            if (((String)object3).startsWith("com.google.common.collect.")) {
                n2 = n3;
                while (true) {
                    object4 = object2;
                    if (n2 >= 5) break;
                    object4 = object2;
                    try {
                        String string = (new String[]{"com.google.common.collect.HashMultimap", "com.google.common.collect.LinkedListMultimap", "com.google.common.collect.LinkedHashMultimap", "com.google.common.collect.ArrayListMultimap", "com.google.common.collect.TreeMultimap"})[n2];
                        object4 = object2;
                        if (string.equals(object3)) {
                            object4 = object2;
                            Class<?> clazz6 = Class.forName(string);
                            object4 = object2;
                            object4 = object2 = F.a;
                            this.l(clazz6, (com.github.catvod.spider.merge.C.v)object2);
                            return object2;
                        }
                        ++n2;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (((String)object3).equals("java.nio.ByteBuffer")) {
            object4 = com.github.catvod.spider.merge.D.q.a;
            this.l((Type)object, (com.github.catvod.spider.merge.C.v)object4);
        }
        object2 = object4;
        if (((String)object3).equals("java.nio.file.Path")) {
            object2 = U.b;
            this.l((Type)object, (com.github.catvod.spider.merge.C.v)object2);
        }
        if (object == Map.Entry.class) {
            object2 = U.b;
            this.l((Type)object, (com.github.catvod.spider.merge.C.v)object2);
        }
        if (((String)object3).equals("org.javamoney.moneta.Money")) {
            object2 = com.github.catvod.spider.merge.F.a.a;
            this.l((Type)object, (com.github.catvod.spider.merge.C.v)object2);
        }
        object4 = Thread.currentThread().getContextClassLoader();
        try {
            for (com.github.catvod.spider.merge.C.f f2 : com.github.catvod.spider.merge.H.q.a(com.github.catvod.spider.merge.C.f.class, (ClassLoader)object4)) {
                object3 = f2.a().iterator();
                while (object3.hasNext()) {
                    this.l((Type)object3.next(), f2);
                }
            }
        }
        catch (Exception throwable) {
            // empty catch block
        }
        object4 = object2;
        if (object2 == null) {
            object4 = this.d(clazz);
        }
        if (object4 != null) {
            return object4;
        }
        if (((Class)object).isEnum()) {
            object4 = (Class)com.github.catvod.spider.merge.y.a.d((Type)object);
            object2 = object4 != null ? object4 : object;
            if ((object2 = com.github.catvod.spider.merge.H.A.D(object2, d.class)) != null) {
                object2 = object2.deserializer();
                try {
                    object2 = (com.github.catvod.spider.merge.C.v)((Class)object2).newInstance();
                    this.l((Type)object, (com.github.catvod.spider.merge.C.v)object2);
                    return object2;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            Object f2 = null;
            if (object4 != null) {
                object4 = com.github.catvod.spider.merge.B.o.g((Class)object4, (Class)object);
                object2 = f2;
                if (object4 != null) {
                    try {
                        object2 = ((Class)object).getMethod(((Method)object4).getName(), ((Method)object4).getParameterTypes());
                    }
                    catch (Exception exception) {
                        object2 = f2;
                    }
                }
            } else {
                object2 = com.github.catvod.spider.merge.B.o.g((Class)object, (Class)object);
            }
            if (object2 != null) {
                object2 = new com.github.catvod.spider.merge.C.i((Method)object2);
                this.l((Type)object, (com.github.catvod.spider.merge.C.v)object2);
                return object2;
            }
            object = new com.github.catvod.spider.merge.C.j((Class<?>)object);
        } else {
            object = ((Class)object).isArray() ? W.a : (object != Set.class && object != HashSet.class && object != Collection.class && object != List.class && object != ArrayList.class && !Collection.class.isAssignableFrom((Class<?>)object) ? (Map.class.isAssignableFrom((Class<?>)object) ? com.github.catvod.spider.merge.C.t.a : (Throwable.class.isAssignableFrom((Class<?>)object) ? new C(this, (Class<?>)object) : (x.class.isAssignableFrom((Class<?>)object) ? new y((Class<x>)object) : (object == InetAddress.class ? U.b : this.c((Class<?>)object, clazz))))) : com.github.catvod.spider.merge.D.v.a);
        }
        this.l(clazz, (com.github.catvod.spider.merge.C.v)object);
        return object;
    }

    public final com.github.catvod.spider.merge.C.v f(Type typeArray) {
        Object object = this.d((Type)typeArray);
        if (object != null) {
            return object;
        }
        if (typeArray instanceof Class) {
            return this.e((Class)typeArray, (Type)typeArray);
        }
        if (typeArray instanceof ParameterizedType) {
            object = ((ParameterizedType)typeArray).getRawType();
            if (object instanceof Class) {
                return this.e((Class)object, (Type)typeArray);
            }
            return this.f((Type)object);
        }
        if (typeArray instanceof WildcardType && (typeArray = ((WildcardType)typeArray).getUpperBounds()).length == 1) {
            return this.f(typeArray[0]);
        }
        return com.github.catvod.spider.merge.C.r.a;
    }

    public final boolean j() {
        return this.n;
    }

    public final void l(Type type, com.github.catvod.spider.merge.C.v v2) {
        Type type2 = com.github.catvod.spider.merge.y.a.d(type);
        if (type2 != null) {
            k<Type, com.github.catvod.spider.merge.C.v> k2;
            k<Type, com.github.catvod.spider.merge.C.v> k3 = k2 = this.b.b(type);
            if (k2 == null) {
                k3 = new k(4);
                this.b.c(type, k3);
            }
            k3.c(type2, v2);
        } else {
            this.a.c(type, v2);
        }
    }

    public final void m() {
        this.d = false;
    }

    private static long[] $d2j$hex$b197f546$decode_J(String src) {
        byte[] d2 = com.github.catvod.spider.merge.B.o.$d2j$hex$b197f546$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$b197f546$decode_I(String src) {
        byte[] d2 = com.github.catvod.spider.merge.B.o.$d2j$hex$b197f546$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$b197f546$decode_S(String src) {
        byte[] d2 = com.github.catvod.spider.merge.B.o.$d2j$hex$b197f546$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$b197f546$decode_B(String src) {
        char[] d2 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i2 = 0; i2 < ret.length; ++i2) {
            int ll;
            int hh;
            char h2 = d2[2 * i2];
            char l2 = d2[2 * i2 + 1];
            if (h2 >= '0' && h2 <= '9') {
                hh = h2 - 48;
            } else if (h2 >= 'a' && h2 <= 'f') {
                hh = h2 - 97 + 10;
            } else if (h2 >= 'A' && h2 <= 'F') {
                hh = h2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l2 >= '0' && l2 <= '9') {
                ll = l2 - 48;
            } else if (l2 >= 'a' && l2 <= 'f') {
                ll = l2 - 97 + 10;
            } else if (l2 >= 'A' && l2 <= 'F') {
                ll = l2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i2] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

