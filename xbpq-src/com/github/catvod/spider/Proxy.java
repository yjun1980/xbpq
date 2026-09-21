/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Uc;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.A;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.T0;
import com.github.catvod.spider.merge.I.a1;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.p0;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.R0.e;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.g;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.ServerStart;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public class Proxy
extends Spider {
    private static int a = -1;

    public static String getUrl() {
        StringBuilder stringBuilder;
        if (a <= 0) {
            for (int i2 = 9978; i2 < 10000; ++i2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("http://127.0.0.1:");
                stringBuilder.append(i2);
                stringBuilder.append("/proxy?do=ck");
                if (!d.l(stringBuilder.toString(), null, null).equals("ok")) continue;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Found local server port ");
                stringBuilder.append(i2);
                SpiderDebug.log((String)stringBuilder.toString());
                a = i2;
                break;
            }
        }
        stringBuilder = com.github.catvod.spider.merge.C.a.c("http://127.0.0.1:");
        stringBuilder.append(a);
        stringBuilder.append("/proxy");
        return stringBuilder.toString();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object[] processPush(Map<String, String> object) {
        String string;
        int n2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Object object2 = (String)object.get("action");
        boolean bl = e.d((CharSequence)object2);
        Integer n3 = 200;
        if (bl) {
            ConfigCenter.executeAction((String)object2);
            return new Object[]{n3, "application/json; charset=utf-8", new ByteArrayInputStream("{\"code\":200,\"msg\":\"\u64cd\u4f5c\u5df2\u89e6\u53d1\"}".getBytes("UTF-8"))};
        }
        object2 = (String)object.get("op");
        if ("status".equalsIgnoreCase((String)object2)) {
            jSONObject2 = new JSONObject();
            jSONObject2.put("code", 200);
            jSONObject2.put("ip", (Object)m.m());
            jSONObject2.put("port", ServerStart.a().b());
            object = Boolean.TRUE;
            jSONObject2.put("netPanDown", ((Boolean)object).equals(BaseApi.get().d));
            jSONObject2.put("netPanISO", ((Boolean)object).equals(BaseApi.get().e));
            object = BaseApi.get().c;
            object2 = "";
            object = object != null ? BaseApi.get().c : "";
            jSONObject2.put("netPanOrder", object);
            object = BaseApi.get().f != null ? BaseApi.get().f : "";
            jSONObject2.put("subscriptionUrl", object);
            jSONObject = new JSONObject();
            bl = u.p().n != null && e.d(u.p().n.f());
            jSONObject.put("aliToken", bl);
            object = bl ? u.p().n.f() : "";
            jSONObject.put("aliTokenVal", object);
            jSONObject.put("aliThread", u.p().b);
        } else {
            if ("save_config".equalsIgnoreCase((String)object2)) {
                try {
                    object2 = new p0(object, 3);
                    Init.execute((Runnable)object2);
                    object2 = new ByteArrayInputStream("{\"code\":200,\"msg\":\"\u914d\u7f6e\u5df2\u63d0\u4ea4\u4fdd\u5b58\"}".getBytes("UTF-8"));
                    object = new Object[]{n3, "application/json; charset=utf-8", object2};
                    return object;
                }
                catch (Exception exception) {
                    SpiderDebug.log((Throwable)exception);
                    object = com.github.catvod.spider.merge.C.a.c("{\"code\":500,\"msg\":\"");
                    ((StringBuilder)object).append(exception.getMessage());
                    ((StringBuilder)object).append("\"}");
                    return new Object[]{500, "application/json; charset=utf-8", new ByteArrayInputStream(((StringBuilder)object).toString().getBytes())};
                }
            }
            if (e.d((CharSequence)object.get("url"))) {
                u.p().r = u.p().D((String)object.get("url"), "1");
                object = com.github.catvod.spider.merge.C.a.c("\u5f39\u5e55\u6765\u81ea\u63a8\u9001 \u5730\u5740\uff1a");
                ((StringBuilder)object).append(u.p().r);
                ((StringBuilder)object).append(" \u53ef\u80fd\u9700\u8981\u91cd\u65b0\u5237\u65b0\u64ad\u653e\u9875");
                m.y(((StringBuilder)object).toString());
                object = new StringBuilder();
                ((StringBuilder)object).append("http://127.0.0.1:9978/action?do=refresh&type=danmaku&path=");
                ((StringBuilder)object).append(URLEncoder.encode(u.p().r));
                d.k(((StringBuilder)object).toString());
                return new Object[]{n3, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
            }
            if (e.d((CharSequence)object.get("input"))) {
                BaseApi.get().g.setText((CharSequence)object.get("input"));
                return new Object[]{n3, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
            }
            if (e.d((CharSequence)object.get("subtitleContent"))) {
                object2 = b.c("tv/zm", (String)object.get("subtitleName"));
                b.f(new File((String)object2), (String)object.get("subtitleContent"));
                object = new StringBuilder();
                ((StringBuilder)object).append("http://127.0.0.1:9978/action?do=refresh&type=subtitle&path=http://127.0.0.1:9978/file/");
                ((StringBuilder)object).append((String)object2);
                d.k(((StringBuilder)object).toString());
                return new Object[]{n3, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
            }
            return new Object[]{n3, "text/html; charset=utf-8", Proxy.class.getClassLoader().getResourceAsStream("assets/push.html")};
            catch (Exception exception) {}
        }
        try {
            bl = s0.o().m != null && e.d(s0.o().m.d());
            jSONObject.put("quarkCookie", bl);
            object = bl ? s0.o().m.d() : "";
            jSONObject.put("quarkCookieVal", object);
            n2 = s0.o().m != null ? s0.o().m.c() : 0;
            jSONObject.put("quarkThread", n2);
        }
        catch (Exception exception) {}
        try {
            bl = L0.s().n != null && e.d(L0.s().n.c());
            jSONObject.put("ucCookie", bl);
            object = bl ? L0.s().n.c() : "";
            jSONObject.put("ucCookieVal", object);
            n2 = L0.s().n != null ? L0.s().n.b() : 0;
            jSONObject.put("ucThread", n2);
        }
        catch (Exception exception) {}
        try {
            bl = f1.c().c != null && e.d(f1.c().c.b());
            jSONObject.put("yun115Cookie", bl);
            object = bl ? f1.c().c.b() : "";
            jSONObject.put("yun115CookieVal", object);
        }
        catch (Exception exception) {}
        try {
            bl = a1.a().f != null && e.d(a1.a().f.d());
            jSONObject.put("yun123Account", bl);
            if (bl) {
                string = a1.a().f.d();
                String string2 = a1.a().f.e();
                object = string;
                if (e.d(string2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("|");
                    ((StringBuilder)object).append(string2);
                    object = ((StringBuilder)object).toString();
                }
            } else {
                object = "";
            }
            jSONObject.put("yun123AccountVal", object);
        }
        catch (Exception exception) {}
        try {
            bl = T0.g().f != null && e.d(T0.g().f.e());
            jSONObject.put("xunleiAccount", bl);
            object = object2;
            if (bl) {
                object2 = T0.g().f.e();
                string = T0.g().f.f();
                object = object2;
                if (e.d(string)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append("|");
                    ((StringBuilder)object).append(string);
                    object = ((StringBuilder)object).toString();
                }
            }
            jSONObject.put("xunleiAccountVal", object);
        }
        catch (Exception exception) {}
        try {
            n2 = A.a().b != null ? A.a().b.a() : 0;
            jSONObject.put("baiduThread", n2);
        }
        catch (Exception exception) {}
        try {
            jSONObject2.put("pan", (Object)jSONObject);
            object = new JSONObject();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("http://");
            ((StringBuilder)object2).append(m.m());
            ((StringBuilder)object2).append(":5244");
            object.put("alist", (Object)((StringBuilder)object2).toString());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("http://");
            ((StringBuilder)object2).append(m.m());
            ((StringBuilder)object2).append(":8080");
            object.put("filebrowser", (Object)((StringBuilder)object2).toString());
            jSONObject2.put("services", object);
            object = new Object[3];
            object[0] = n3;
            object[1] = "application/json; charset=utf-8";
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            object2 = com.github.catvod.spider.merge.C.a.c("{\"code\":500,\"msg\":\"");
            ((StringBuilder)object2).append(exception.getMessage());
            ((StringBuilder)object2).append("\"}");
            return new Object[]{500, "application/json; charset=utf-8", new ByteArrayInputStream(((StringBuilder)object2).toString().getBytes())};
        }
        object[2] = object2 = new ByteArrayInputStream(jSONObject2.toString().getBytes("UTF-8"));
        return object;
    }

    public static Object[] proxy(Map<String, String> map) {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("proxy");
        ((StringBuilder)charSequence).append(map);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        charSequence = map.get("do");
        Objects.requireNonNull(charSequence);
        int n2 = ((String)charSequence).hashCode();
        int n3 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1438032931: {
                if (!((String)charSequence).equals("danmuku")) break;
                n3 = 6;
                break;
            }
            case 3563703: {
                if (!((String)charSequence).equals("tmdb")) break;
                n3 = 5;
                break;
            }
            case 96670: {
                if (!((String)charSequence).equals("ali")) break;
                n3 = 4;
                break;
            }
            case 3726: {
                if (!((String)charSequence).equals("uc")) break;
                n3 = 3;
                break;
            }
            case 3176: {
                if (!((String)charSequence).equals("ck")) break;
                n3 = 2;
                break;
            }
            case -764567009: {
                if (!((String)charSequence).equals("pushdanmu")) break;
                n3 = 1;
                break;
            }
            case -791803963: {
                if (!((String)charSequence).equals("webdav")) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return null;
            }
            case 5: {
                return g.b().f(map);
            }
            case 4: {
                return NetPan.proxy(map);
            }
            case 3: {
                return Uc.proxy(map);
            }
            case 2: {
                return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
            }
            case 0: 
            case 1: 
            case 6: 
        }
        return Proxy.processPush(map);
    }
}

