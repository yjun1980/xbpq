/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.github.catvod.spider.InitOrigin
 *  okhttp3.Headers
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 */
package com.github.catvod.spider.merge.UY;

import android.text.TextUtils;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.HR.d;
import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.HR.o;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.c;
import com.github.catvod.spider.merge.UY.f;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.U.z;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.c0.b;
import com.github.catvod.spider.merge.xc.d0.q;
import com.github.catvod.spider.merge.xc.d0.r;
import com.github.catvod.spider.merge.xc.d0.v;
import com.github.catvod.spider.merge.xc.r0.e;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.Request;

public final class h
implements o {
    public Object a;
    public Object b;
    public final Object c;

    public h() {
        this.b = "";
        this.c = v.U(new b("User-Agent", "Mozilla/5.0 (Linux; Android 12; SM-X800) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.40 Safari/537.36"), new b("Accept", "application/json, text/plain, */*"), new b("Content-Type", "application/x-www-form-urlencoded"), new b("Origin", "https://pan.baidu.com"), new b("Referer", "https://pan.baidu.com/"));
    }

    public h(n n2) {
        this.a = null;
        this.b = null;
        this.c = n2;
    }

    public /* synthetic */ h(Object object, Object object2, Object object3) {
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    public static String f(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string : list) {
                list = Pattern.compile(";");
                i.d(list, "compile(...)");
                i.e(string, "input");
                e.W(0);
                Matcher matcher = ((Pattern)((Object)list)).matcher(string);
                if (!matcher.find()) {
                    list = com.github.catvod.spider.merge.xc.a.a.o(string.toString());
                } else {
                    int n2;
                    list = new ArrayList<String>(10);
                    int n3 = 0;
                    do {
                        ((ArrayList)list).add(((Object)string.subSequence(n3, matcher.start())).toString());
                        n3 = n2 = matcher.end();
                    } while (matcher.find());
                    ((ArrayList)list).add(((Object)string.subSequence(n2, string.length())).toString());
                }
                if (!list.isEmpty()) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        if (((String)listIterator.previous()).length() == 0) continue;
                        list = com.github.catvod.spider.merge.xc.d0.i.L(list, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    list = q.a;
                }
                arrayList.add(list.toArray(new String[0])[0]);
            }
            list = TextUtils.join((CharSequence)";", arrayList);
            i.d(list, "join(...)");
            return list;
        }
        return "";
    }

    public static String h(String string) {
        return com.github.catvod.spider.merge.xc.r0.m.K(com.github.catvod.spider.merge.xc.r0.m.K(com.github.catvod.spider.merge.xc.r0.m.K(com.github.catvod.spider.merge.xc.r0.m.K(com.github.catvod.spider.merge.xc.r0.m.K(com.github.catvod.spider.merge.xc.r0.m.K(string, "&amp;", "&"), "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&#39;", "'"), "&#x27;", "'");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String object) {
        Exception exception2;
        block15: {
            int n2;
            int n3;
            Object object2;
            long l2;
            try {
                l2 = System.currentTimeMillis();
                object2 = new StringBuilder("https://passport.baidu.com/channel/unicast?channel_id=");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("&tpl=netdisk&callback=&apiver=v3&tt=");
                ((StringBuilder)object2).append(l2);
                ((StringBuilder)object2).append("&_=");
                ((StringBuilder)object2).append(l2);
                object2 = ((StringBuilder)object2).toString();
                object = r.a;
            }
            catch (Exception exception2) {
                break block15;
            }
            Object object3 = (Map)this.c;
            {
                object2 = A.o((String)object2, (Map)object, (Map)object3);
                i.b(object2);
                n3 = ((String)object2).length() - 1;
                n2 = 0;
                boolean bl = false;
                while (n2 <= n3) {
                    int n4;
                    block16: {
                        n4 = !bl ? n2 : n3;
                        char c2 = ((String)object2).charAt(n4);
                        for (n4 = 0; n4 < 4; ++n4) {
                            if (c2 != (new char[]{'(', ' ', '\n', ')'})[n4]) {
                                continue;
                            }
                            break block16;
                        }
                        n4 = -1;
                    }
                    n4 = n4 >= 0 ? 1 : 0;
                    if (!bl) {
                        if (n4 == 0) {
                            bl = true;
                            continue;
                        }
                        ++n2;
                        continue;
                    }
                    if (n4 == 0) break;
                    --n3;
                }
            }
            if ((object2 = C.R(((Object)((String)object2).subSequence(n2, n3 + 1)).toString())).get("errno").getAsInt() != 0) {
                n2 = object2.get("errno").getAsInt();
                object = new b("errno", n2);
                v.T((b)object);
                return;
            }
            if ((object2 = C.R(object2.get("channel_v").getAsString())).get("status").getAsInt() != 0) {
                n2 = object2.get("status").getAsInt();
                object = new b("status", n2);
                v.T((b)object);
                return;
            }
            object2 = object2.get("v").getAsString();
            l2 = System.currentTimeMillis();
            Object object4 = new StringBuilder();
            ((StringBuilder)object4).append("https://passport.baidu.com/v3/login/main/qrbdusslogin?v=");
            ((StringBuilder)object4).append(l2);
            ((StringBuilder)object4).append("&bduss=");
            ((StringBuilder)object4).append((String)object2);
            ((StringBuilder)object4).append("&u=&loginVersion=v4&qrcode=1&tpl=netdisk&apiver=v3&tt=");
            ((StringBuilder)object4).append(l2);
            ((StringBuilder)object4).append("&traceid=&callback=bd__cbs__cupstt");
            object3 = A.e(((StringBuilder)object4).toString(), (Map)object, (Map)object3);
            object = ((X)object3).b();
            i.d(object, "getBody(...)");
            object = e.a0((String)object, "(", (String)object);
            n2 = e.U(")", (CharSequence)object, 6);
            if (n2 != -1) {
                object = ((String)object).substring(0, n2);
                i.d(object, "substring(...)");
            }
            object4 = C.R(h.h((String)object));
            if (object4.has("errInfo") && i.a(object4.get("errInfo").getAsJsonObject().get("no").getAsString(), "0")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("BDUSS=");
                ((StringBuilder)object).append((String)object2);
                this.b = ((StringBuilder)object).toString();
                this.b = object = h.f((List)((Map)((X)object3).c).get("set-cookie"));
                n2 = ((String)object).length() > 0 ? 1 : 0;
                if (n2 != 0) {
                    object = com.github.catvod.spider.merge.xc.F.a.a();
                    object3 = (String)this.b;
                    object4 = new com.github.catvod.spider.merge.xc.Q.b((String)object3);
                    ((com.github.catvod.spider.merge.xc.F.a)object).c((com.github.catvod.spider.merge.xc.Q.b)object4);
                    B.e("baidu");
                    object = (ScheduledExecutorService)this.a;
                    if (object != null) {
                        object.shutdownNow();
                    }
                    com.github.catvod.spider.merge.xc.a.a.i();
                    A.m("\u767e\u5ea6\u767b\u5f55\u6210\u529f");
                }
                object3 = Boolean.TRUE;
                object = new b("success", object3);
                object3 = new b("bduss", object2);
                v.U(new b[]{object, object3});
                return;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("\u767b\u5f55\u5931\u8d25: ");
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = new b("error", object);
            v.T((b)object2);
            return;
        }
        v.T(new b("error", m.q("\u68c0\u67e5\u767b\u5f55\u72b6\u6001\u5931\u8d25: ", exception2.getMessage())));
    }

    @Override
    public void b(com.github.catvod.spider.merge.xc.F0.q q2, int n2) {
    }

    @Override
    public void c(com.github.catvod.spider.merge.xc.F0.q q2, int n2) {
        if (q2 instanceof l && ((n)this.c).a((l)this.a, (l)(q2 = (l)q2))) {
            ((AbstractCollection)((d)this.b)).add(q2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        this.b = "";
        com.github.catvod.spider.merge.xc.F.a.a().c(new com.github.catvod.spider.merge.xc.Q.b(""));
        C.b0("baidu", "");
        Object object = com.github.catvod.spider.merge.xc.F.a.d;
        synchronized (object) {
            com.github.catvod.spider.merge.xc.F.a.c = null;
            return;
        }
    }

    public l e(l q2, l l2) {
        this.a = q2;
        this.b = null;
        q2 = l2;
        int n2 = 0;
        while (q2 != null) {
            int n3;
            l l3;
            boolean bl = q2 instanceof l;
            int n4 = 1;
            if (bl && ((n)this.c).a((l)this.a, l3 = q2)) {
                this.b = l3;
                n3 = 5;
            } else {
                n3 = 1;
            }
            if (n3 == 5) break;
            l3 = q2;
            int n5 = n2;
            int n6 = n3;
            if (n3 == 1) {
                l3 = q2;
                n5 = n2++;
                n6 = n3;
                if (((com.github.catvod.spider.merge.xc.F0.q)q2).f() > 0) {
                    q2 = (com.github.catvod.spider.merge.xc.F0.q)((com.github.catvod.spider.merge.xc.F0.q)q2).j().get(0);
                    continue;
                }
            }
            while (l3.n() == null && n5 > 0) {
                block13: {
                    block12: {
                        if (n6 == 1) break block12;
                        n2 = n6;
                        if (n6 != 2) break block13;
                    }
                    n2 = 1;
                }
                q2 = l3.a;
                --n5;
                if (n2 == 4) {
                    l3.u();
                }
                l3 = q2;
                n6 = 1;
            }
            n2 = n4;
            if (n6 != 1) {
                n2 = n6 == 2 ? n4 : n6;
            }
            if (l3 == l2) break;
            q2 = l3.n();
            if (n2 == 4) {
                l3.u();
            }
            n2 = n5;
        }
        return (l)this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g() {
        Object object;
        Object object2;
        Object object3;
        block8: {
            Exception exception2;
            block7: {
                long l2;
                block6: {
                    try {
                        l2 = System.currentTimeMillis();
                        object3 = new StringBuilder("https://passport.baidu.com/v2/api/getqrcode?lp=pc&_=");
                        ((StringBuilder)object3).append(l2);
                        object2 = C.R(A.o(((StringBuilder)object3).toString(), r.a, (Map)this.c));
                        if (object2.get("errno").getAsInt() == 0) break block6;
                        int n2 = object2.get("errno").getAsInt();
                        object3 = new StringBuilder("\u83b7\u53d6\u767b\u5f55\u4e8c\u7ef4\u7801\u9519\u8bef, code: ");
                        ((StringBuilder)object3).append(n2);
                        object2 = ((StringBuilder)object3).toString();
                        object3 = new b("error", object2);
                        object3 = v.T((b)object3);
                    }
                    catch (Exception exception2) {
                        break block7;
                    }
                }
                object3 = object2.get("sign").getAsString();
                object = object2.get("imgurl").getAsString();
                object2 = new StringBuilder("https://");
                ((StringBuilder)object2).append((String)object);
                object = ((StringBuilder)object2).toString();
                object2 = new StringBuilder("https://wappass.baidu.com/wp/?qrlogin&t=");
                ((StringBuilder)object2).append(l2);
                ((StringBuilder)object2).append("&error=0&sign=");
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append("&cmd=login&lp=pc&tpl=netdisk&uaonly=&client_id=&adapter=3&client=&qrloginfrom=pc&wechat=0&traceid=");
                Object object4 = ((StringBuilder)object2).toString();
                object2 = new b("qrCodeImageUrl", object);
                object = new b("qrLoginUrl", object4);
                object4 = new b("sign", object3);
                object3 = v.U(new b[]{object2, object, object4});
                break block8;
            }
            object3 = v.T(new b("error", m.q("\u83b7\u53d6\u4e8c\u7ef4\u7801\u5931\u8d25: ", exception2.getMessage())));
        }
        if (!object3.containsKey("error") && object3.containsKey("qrCodeImageUrl")) {
            object2 = object3.get("qrCodeImageUrl");
            i.b(object2);
            object = (String)object2;
            object2 = m.j("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36");
            object2 = new Request.Builder().url((String)object).headers(Headers.of((Map)object2)).build();
            object2 = A.a().newCall((Request)object2).execute();
            if (object2.code() == 200) {
                object2 = object2.body();
                i.b(object2);
                object2 = object2.bytes();
                i.d(object2, "bytes(...)");
            } else {
                object2 = "".getBytes(com.github.catvod.spider.merge.xc.r0.a.a);
                i.d(object2, "getBytes(...)");
            }
            InitOrigin.run((Runnable)new z((byte[])object2, new f(0, this)));
            InitOrigin.execute((Runnable)new c(this, object3, 2));
            return;
        }
        object3 = object2 = (String)object3.get("error");
        if (object2 == null) {
            object3 = "\u672a\u77e5\u9519\u8bef";
        }
        A.m("\u767e\u5ea6\u83b7\u53d6\u4e8c\u7ef4\u7801\u5931\u8d25: ".concat((String)object3));
    }
}

