/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.B.b;
import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.D.L;
import com.github.catvod.spider.merge.D.X;
import com.github.catvod.spider.merge.D.e0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.H.i;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.Q;
import com.github.catvod.spider.merge.y.d;
import com.github.catvod.spider.merge.y.e;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

public final class U
implements X,
v {
    private static boolean a;
    public static final U b;
    private static Method c;
    private static boolean d;

    static {
        b = new U();
        a = "true".equals(i.e("fastjson.deserializer.fileRelativePathSupport"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final <T> T c(b object, Type object2, Object object3) {
        block43: {
            Object object4;
            block42: {
                block41: {
                    object4 = ((b)object).f;
                    int n2 = 0;
                    if (object2 == InetSocketAddress.class) {
                        if (object4.p() == 8) {
                            object4.nextToken();
                            return null;
                        }
                        ((b)object).a(12);
                        object2 = null;
                        while (true) {
                            object3 = object4.K();
                            object4.o(17);
                            if (((String)object3).equals("address")) {
                                ((b)object).a(17);
                                object2 = (InetAddress)((b)object).t((Type)((Object)InetAddress.class), null);
                            } else {
                                boolean bl = ((String)object3).equals("port");
                                ((b)object).a(17);
                                if (bl) {
                                    if (object4.p() != 2) throw new d("port is not int");
                                    n2 = object4.c();
                                    object4.nextToken();
                                } else {
                                    ((b)object).m();
                                }
                            }
                            if (object4.p() != 16) {
                                ((b)object).a(13);
                                return (T)new InetSocketAddress((InetAddress)object2, n2);
                            }
                            object4.nextToken();
                        }
                    }
                    if (((b)object).k == 2) {
                        ((b)object).k = 0;
                        ((b)object).a(16);
                        if (object4.p() != 4) throw new d("syntax error");
                        if (!"val".equals(object4.K())) throw new d("syntax error");
                        object4.nextToken();
                        ((b)object).a(17);
                        object3 = ((b)object).o(null);
                        ((b)object).a(13);
                    } else {
                        object3 = ((b)object).o(null);
                    }
                    if (object3 != null) break block41;
                    object3 = null;
                    break block42;
                }
                if (!(object3 instanceof String)) break block43;
                object3 = (String)object3;
            }
            if (object3 == null) return null;
            if (((String)object3).length() == 0) {
                return null;
            }
            if (object2 == UUID.class) {
                return (T)UUID.fromString((String)object3);
            }
            if (object2 == URI.class) {
                return (T)URI.create((String)object3);
            }
            if (object2 == URL.class) {
                try {
                    object = new URL((String)object3);
                    return (T)object;
                }
                catch (MalformedURLException malformedURLException) {
                    throw new d("create url error", malformedURLException);
                }
            }
            if (object2 == Pattern.class) {
                return (T)Pattern.compile((String)object3);
            }
            if (object2 == Locale.class) {
                return (T)A.u0((String)object3);
            }
            if (object2 == SimpleDateFormat.class) {
                object = new SimpleDateFormat((String)object3, object4.G());
                ((DateFormat)object).setTimeZone(object4.M());
                return (T)object;
            }
            if (object2 != InetAddress.class && object2 != Inet4Address.class && object2 != Inet6Address.class) {
                if (object2 == File.class) {
                    if (((String)object3).indexOf("..") < 0) return (T)new File((String)object3);
                    if (!a) throw new d("file relative path not support.");
                    return (T)new File((String)object3);
                }
                if (object2 == TimeZone.class) {
                    return (T)TimeZone.getTimeZone((String)object3);
                }
                object4 = object2;
                if (object2 instanceof ParameterizedType) {
                    object4 = ((ParameterizedType)object2).getRawType();
                }
                if (object4 == Class.class) {
                    Objects.requireNonNull(((b)object).e());
                    return (T)A.m0((String)object3, false);
                }
                if (object4 == Charset.class) {
                    return (T)Charset.forName((String)object3);
                }
                if (object4 == Currency.class) {
                    return (T)Currency.getInstance((String)object3);
                }
                if (object4 == N.class) {
                    return (T)new N((String)object3, e0.i, o.v);
                }
                if (!(object4 instanceof Class)) {
                    object = com.github.catvod.spider.merge.C.a.c("MiscCodec not support ");
                    ((StringBuilder)object).append(object4.toString());
                    throw new d(((StringBuilder)object).toString());
                }
                object = ((Class)object4).getName();
                if (!((String)object).equals("java.nio.file.Path")) throw new d(com.github.catvod.spider.merge.B.e.c("MiscCodec not support ", (String)object));
                try {
                    if (c == null && !d) {
                        c = A.m0("java.nio.file.Paths", false).getMethod("get", String.class, String[].class);
                    }
                    if ((object2 = c) != null) {
                        return (T)((Method)object2).invoke(null, object3, new String[0]);
                    }
                    object2 = new d("Path deserialize erorr");
                    throw object2;
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw new d("Path deserialize erorr", invocationTargetException);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new d("Path deserialize erorr", illegalAccessException);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    d = true;
                }
                throw new d(com.github.catvod.spider.merge.B.e.c("MiscCodec not support ", (String)object));
            }
            try {
                object = InetAddress.getByName((String)object3);
                return (T)object;
            }
            catch (UnknownHostException unknownHostException) {
                throw new d("deserialize inet adress error", unknownHostException);
            }
        }
        if (!(object3 instanceof e)) throw new d("expect string");
        object = (e)object3;
        if (object2 == Currency.class) {
            object3 = ((e)object).x("currency");
            if (object3 != null) {
                return (T)Currency.getInstance((String)object3);
            }
            object3 = ((e)object).x("currencyCode");
            if (object3 != null) {
                return (T)Currency.getInstance((String)object3);
            }
        }
        if (object2 != Map.Entry.class) return A.f(object, (Type)object2, o.v);
        return (T)((e)object).entrySet().iterator().next();
    }

    @Override
    public final void d(L object, Object object2, Object clazz, Type object3, int n2) {
        block27: {
            h0 h02;
            block16: {
                block22: {
                    block25: {
                        block26: {
                            block23: {
                                block24: {
                                    block21: {
                                        block20: {
                                            block19: {
                                                block18: {
                                                    block17: {
                                                        block15: {
                                                            h02 = ((L)object).j;
                                                            if (object2 == null) {
                                                                h02.s();
                                                                return;
                                                            }
                                                            clazz = object2.getClass();
                                                            if (clazz != SimpleDateFormat.class) break block15;
                                                            String string = ((SimpleDateFormat)object2).toPattern();
                                                            clazz = string;
                                                            if (h02.g(i0.o)) {
                                                                clazz = string;
                                                                if (object2.getClass() != object3) {
                                                                    h02.write(123);
                                                                    h02.j(com.github.catvod.spider.merge.y.a.c);
                                                                    ((L)object).v(object2.getClass().getName());
                                                                    h02.m(',', "val", string);
                                                                    h02.write(125);
                                                                    return;
                                                                }
                                                            }
                                                            break block16;
                                                        }
                                                        if (clazz != Class.class) break block17;
                                                        clazz = ((Class)object2).getName();
                                                        break block16;
                                                    }
                                                    if (clazz == InetSocketAddress.class) {
                                                        object2 = (InetSocketAddress)object2;
                                                        clazz = ((InetSocketAddress)object2).getAddress();
                                                        h02.write(123);
                                                        if (clazz != null) {
                                                            h02.j("address");
                                                            ((L)object).u(clazz);
                                                            h02.write(44);
                                                        }
                                                        h02.j("port");
                                                        h02.q(((InetSocketAddress)object2).getPort());
                                                        h02.write(125);
                                                        return;
                                                    }
                                                    if (!(object2 instanceof File)) break block18;
                                                    clazz = ((File)object2).getPath();
                                                    break block16;
                                                }
                                                if (!(object2 instanceof InetAddress)) break block19;
                                                clazz = ((InetAddress)object2).getHostAddress();
                                                break block16;
                                            }
                                            if (!(object2 instanceof TimeZone)) break block20;
                                            clazz = ((TimeZone)object2).getID();
                                            break block16;
                                        }
                                        if (!(object2 instanceof Currency)) break block21;
                                        clazz = ((Currency)object2).getCurrencyCode();
                                        break block16;
                                    }
                                    if (object2 instanceof Q) {
                                        ((Q)object2).c(h02);
                                        return;
                                    }
                                    if (object2 instanceof Iterator) {
                                        this.f((L)object, h02, (Iterator)object2);
                                        return;
                                    }
                                    if (object2 instanceof Iterable) {
                                        this.f((L)object, h02, ((Iterable)object2).iterator());
                                        return;
                                    }
                                    if (!(object2 instanceof Map.Entry)) break block22;
                                    clazz = (Map.Entry)object2;
                                    object2 = clazz.getKey();
                                    clazz = clazz.getValue();
                                    if (!(object2 instanceof String)) break block23;
                                    object2 = (String)object2;
                                    if (!(clazz instanceof String)) break block24;
                                    h02.n('{', (String)object2, (String)((Object)clazz));
                                    break block25;
                                }
                                h02.write(123);
                                h02.j((String)object2);
                                break block26;
                            }
                            h02.write(123);
                            ((L)object).u(object2);
                            h02.write(58);
                        }
                        ((L)object).u(clazz);
                    }
                    h02.write(125);
                    return;
                }
                if (object2.getClass().getName().equals("net.sf.json.JSONNull")) {
                    h02.s();
                    return;
                }
                if (!(object2 instanceof Node)) break block27;
                clazz = (Node)object2;
                try {
                    object = TransformerFactory.newInstance().newTransformer();
                    object2 = new DOMSource((Node)((Object)clazz));
                    object3 = new StringWriter();
                    clazz = new StreamResult((Writer)object3);
                    ((Transformer)object).transform((Source)object2, (Result)((Object)clazz));
                    clazz = ((StringWriter)object3).toString();
                }
                catch (TransformerException transformerException) {
                    throw new d("xml node to string error", transformerException);
                }
            }
            h02.v((String)((Object)clazz));
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("not support class : ");
        ((StringBuilder)object).append(clazz);
        throw new d(((StringBuilder)object).toString());
    }

    @Override
    public final int e() {
        return 4;
    }

    protected final void f(L l2, h0 h02, Iterator<?> iterator) {
        h02.write(91);
        int n2 = 0;
        while (iterator.hasNext()) {
            if (n2 != 0) {
                h02.write(44);
            }
            l2.u(iterator.next());
            ++n2;
        }
        h02.write(93);
    }
}

