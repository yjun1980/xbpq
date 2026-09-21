/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.google.gson.JsonObject
 *  okhttp3.HttpUrl
 */
package com.github.catvod.spider.merge.UY;

import android.util.Base64;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.B;
import com.github.catvod.spider.merge.UY.D;
import com.github.catvod.spider.merge.UY.F;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.N.a;
import com.github.catvod.spider.merge.xc.N.d;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.net.URLEncoder;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import okhttp3.HttpUrl;

public final class G {
    public final A a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public final String i;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public G() {
        String string = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.a = new A();
        this.n();
        try {
            String string2 = C.P("tianyi_session");
            if (!com.github.catvod.spider.merge.xc.A0.c.c(string2)) return;
            JsonObject jsonObject = C.R(string2);
            string2 = jsonObject.has("sessionKey") ? jsonObject.get("sessionKey").getAsString() : "";
            this.c = string2;
            string2 = jsonObject.has("sessionSecret") ? jsonObject.get("sessionSecret").getAsString() : "";
            this.d = string2;
            string2 = jsonObject.has("familySessionKey") ? jsonObject.get("familySessionKey").getAsString() : "";
            this.e = string2;
            string2 = jsonObject.has("familySessionSecret") ? jsonObject.get("familySessionSecret").getAsString() : "";
            this.f = string2;
            string2 = jsonObject.has("accessToken") ? jsonObject.get("accessToken").getAsString() : "";
            this.g = string2;
            string2 = jsonObject.has("refreshToken") ? jsonObject.get("refreshToken").getAsString() : "";
            this.h = string2;
            string2 = string;
            if (jsonObject.has("familyId")) {
                string2 = jsonObject.get("familyId").getAsString();
            }
            this.i = string2;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean b(String string, HashMap hashMap) {
        try {
            HashMap<String, String> hashMap2 = new HashMap<String, String>();
            hashMap2.put("accountType", "02");
            hashMap2.put("userName", string);
            hashMap2.put("appKey", "8025431004");
            boolean bl = "0".equals(A.l("https://open.e.189.cn/api/logbox/oauth2/needcaptcha.do", hashMap2, hashMap).b().trim());
            return bl ^ true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static B d(String charSequence, String string, String object, String string2) {
        object = G.p((String)object);
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append(string2);
        charSequence2.append(G.e((String)charSequence, (PublicKey)object));
        charSequence2 = charSequence2.toString();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(G.e(string, (PublicKey)object));
        return new B(0, (String)charSequence2, ((StringBuilder)charSequence).toString());
    }

    public static String e(String charSequence, PublicKey object) {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, (Key)object);
        object = Base64.encodeToString((byte[])cipher.doFinal(((String)charSequence).getBytes(m.m())), (int)2);
        charSequence = new StringBuilder();
        int n2 = 0;
        int n3 = 0;
        for (int i2 = 0; i2 < ((String)object).length(); ++i2) {
            char c2 = ((String)object).charAt(i2);
            int n4 = n2;
            int n5 = n3;
            if (c2 != '=') {
                n4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".indexOf(c2);
                if (n2 == 0) {
                    ((StringBuilder)charSequence).append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(n4 >> 2));
                    n5 = n4 & 3;
                    n4 = 1;
                } else if (n2 == 1) {
                    ((StringBuilder)charSequence).append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(n3 << 2 | n4 >> 4));
                    n5 = n4 & 0xF;
                    n4 = 2;
                } else if (n2 == 2) {
                    ((StringBuilder)charSequence).append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(n3));
                    ((StringBuilder)charSequence).append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(n4 >> 2));
                    n5 = n4 & 3;
                    n4 = 3;
                } else {
                    ((StringBuilder)charSequence).append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(n3 << 2 | n4 >> 4));
                    ((StringBuilder)charSequence).append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(n4 & 0xF));
                    n4 = 0;
                    n5 = n3;
                }
            }
            n2 = n4;
            n3 = n5;
        }
        if (n2 == 1) {
            ((StringBuilder)charSequence).append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(n3 << 2));
        }
        return ((StringBuilder)charSequence).toString();
    }

    public static String f(String string, String string2, String string3) {
        int n2 = string.indexOf(string2);
        if (n2 == -1) {
            return null;
        }
        n2 = string2.length() + n2;
        int n3 = string.indexOf(string3, n2);
        if (n3 == -1) {
            return null;
        }
        return string.substring(n2, n3);
    }

    public static PublicKey p(String object) {
        object = new X509EncodedKeySpec(Base64.decode((String)object, (int)2));
        return KeyFactory.getInstance("RSA").generatePublic((KeySpec)object);
    }

    public final HashMap a(String string, String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>(this.i("https://open.e.189.cn"));
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:74.0) Gecko/20100101 Firefox/76.0");
        hashMap.put("Referer", "https://open.e.189.cn/");
        hashMap.put("Lt", string);
        hashMap.put("Reqid", string2);
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        com.github.catvod.spider.merge.xc.N.a.a().c(new d(""));
        ((HashMap)this.a.b).clear();
        C.b0("tianyi", "");
        C.b0("tianyie", "");
        Object object = com.github.catvod.spider.merge.xc.N.a.d;
        synchronized (object) {
            com.github.catvod.spider.merge.xc.N.a.c = null;
            return;
        }
    }

    public final String g() {
        HashMap object3 = new HashMap();
        Object object = ((HashMap)this.a.b).values().iterator();
        while (object.hasNext()) {
            object3.putAll((Map)object.next());
        }
        object = new StringBuilder();
        for (Map.Entry entry : object3.entrySet()) {
            if (((StringBuilder)object).length() > 0) {
                ((StringBuilder)object).append("; ");
            }
            ((StringBuilder)object).append((String)entry.getKey());
            ((StringBuilder)object).append("=");
            ((StringBuilder)object).append((String)entry.getValue());
        }
        return ((StringBuilder)object).toString();
    }

    public final JsonObject h() {
        X x2 = A.l("https://open.e.189.cn/api/logbox/config/encryptConf.do", com.github.catvod.spider.merge.Bk.m.j("appId", "8025431004"), this.i("https://open.e.189.cn/api/logbox/config/encryptConf.do"));
        this.s("https://open.e.189.cn/api/logbox/config/encryptConf.do", (List)((Map)x2.c).get("Set-Cookie"));
        return C.R(x2.b());
    }

    public final HashMap i(String string) {
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        hashMap.put("Cookie", this.a.h(string));
        return hashMap;
    }

    public final F j() {
        CharSequence charSequence = new StringBuilder("https://cloud.189.cn/api/portal/unifyLoginForPC.action?appId=8025431004&clientType=10020&returnURL=");
        charSequence.append(URLEncoder.encode("https://m.cloud.189.cn/zhuanti/2020/loginErrorPc/index.html", "UTF-8"));
        charSequence.append("&timeStamp=");
        charSequence.append(System.currentTimeMillis());
        String string = charSequence.toString();
        Object object = A.e(string, null, this.i(string));
        charSequence = ((X)object).b();
        this.s(string, (List)((Map)((X)object).c).get("Set-Cookie"));
        object = G.f((String)charSequence, "lt = \"", "\"");
        return new F(G.f((String)charSequence, "reqId = \"", "\""), (String)object, G.f((String)charSequence, "paramId = \"", "\""), G.f((String)charSequence, "'captchaToken' value='", "'"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean k(String string) {
        block7: {
            try {
                Serializable serializable = new Random();
                Object object = new StringBuilder();
                ((StringBuilder)object).append(((Random)serializable).nextInt(100000));
                ((StringBuilder)object).append("_");
                ((StringBuilder)object).append(((Random)serializable).nextLong());
                object = ((StringBuilder)object).toString();
                serializable = new StringBuilder("https://api.cloud.189.cn/getSessionForPC.action?clientType=TELEPC&version=6.2&channelId=web_cloud.189.cn&rand=");
                ((StringBuilder)serializable).append((String)object);
                ((StringBuilder)serializable).append("&redirectURL=");
                ((StringBuilder)serializable).append(URLEncoder.encode(string, "UTF-8"));
                string = ((StringBuilder)serializable).toString();
                object = new HashMap();
                ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
                ((HashMap)object).put("Accept", "application/json;charset=UTF-8");
                ((HashMap)object).put("Cookie", this.g());
                serializable = new HashMap();
                object = A.l(string, (Map)((Object)serializable), object);
                this.s(string, (List)((Map)((X)object).c).get("Set-Cookie"));
                string = C.R(((X)object).b());
                if (string.has("resCode") && string.get("resCode").getAsInt() == 0) {
                    return this.q((JsonObject)string);
                }
                boolean bl = string.has("res_code");
                if (!bl) break block7;
            }
            catch (Exception exception) {
                return false;
            }
            try {
                if (string.get("res_code").getAsInt() == 0) {
                    return this.q((JsonObject)string);
                }
            }
            catch (Exception exception) {}
        }
        if (!string.has("sessionKey")) return false;
        if (string.get("sessionKey").isJsonNull()) return false;
        return this.q((JsonObject)string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean l(String string, List object) {
        block12: {
            try {
                Iterator iterator = new Iterator();
                Serializable serializable = new StringBuilder();
                ((StringBuilder)serializable).append(((Random)((Object)iterator)).nextInt(100000));
                ((StringBuilder)serializable).append("_");
                ((StringBuilder)serializable).append(((Random)((Object)iterator)).nextLong());
                iterator = ((StringBuilder)serializable).toString();
                serializable = new StringBuilder("https://api.cloud.189.cn/getSessionForPC.action?clientType=TELEPC&version=6.2&channelId=web_cloud.189.cn&rand=");
                ((StringBuilder)serializable).append((String)((Object)iterator));
                ((StringBuilder)serializable).append("&redirectURL=");
                ((StringBuilder)serializable).append(URLEncoder.encode(string, "UTF-8"));
                string = ((StringBuilder)serializable).toString();
                serializable = new StringBuilder();
                if (object != null) {
                    iterator = object.iterator();
                    while (iterator.hasNext()) {
                        object = ((String)iterator.next()).split(";")[0].split("=", 2);
                        if (((Object)object).length != 2) continue;
                        if (((StringBuilder)serializable).length() > 0) {
                            ((StringBuilder)serializable).append("; ");
                        }
                        ((StringBuilder)serializable).append((String)object[0]);
                        ((StringBuilder)serializable).append("=");
                        ((StringBuilder)serializable).append((String)object[1]);
                    }
                }
                if (!((String)(object = this.g())).isEmpty()) {
                    if (((StringBuilder)serializable).length() > 0) {
                        ((StringBuilder)serializable).append("; ");
                    }
                    ((StringBuilder)serializable).append((String)object);
                }
                object = new HashMap();
                ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
                ((HashMap)object).put("Accept", "application/json;charset=UTF-8");
                ((HashMap)object).put("Cookie", ((StringBuilder)serializable).toString());
                serializable = new HashMap();
                object = A.l(string, (Map)((Object)serializable), (Map)object);
                this.s(string, (List)((Map)((X)object).c).get("Set-Cookie"));
                string = C.R(((X)object).b());
                if (string.has("resCode") && string.get("resCode").getAsInt() == 0) {
                    return this.q((JsonObject)string);
                }
                boolean bl = string.has("res_code");
                if (!bl) break block12;
            }
            catch (Exception exception) {
                return false;
            }
            try {
                if (string.get("res_code").getAsInt() == 0) {
                    return this.q((JsonObject)string);
                }
            }
            catch (Exception exception) {}
        }
        if (!string.has("sessionKey")) return false;
        if (string.get("sessionKey").isJsonNull()) return false;
        return this.q((JsonObject)string);
    }

    public final boolean m() {
        Object object2 = this.a;
        HashMap hashMap = (HashMap)((A)object2).b;
        HashMap hashMap2 = hashMap;
        if (hashMap.isEmpty()) {
            this.n();
            hashMap2 = (HashMap)((A)object2).b;
        }
        if (hashMap2.isEmpty()) {
            return false;
        }
        for (Object object2 : hashMap2.keySet()) {
            if (!((String)object2).contains("189.cn") || ((Map)hashMap2.get(object2)).isEmpty()) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void n() {
        try {
            String string = C.P("tianyie");
            if (com.github.catvod.spider.merge.xc.A0.c.c(string)) {
                this.a.d(string);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean o() {
        Object object;
        Object object2;
        Object object3;
        block14: {
            object3 = com.github.catvod.spider.merge.xc.N.a.b();
            if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object3)) {
                return false;
            }
            if (!(object3 = C.R((String)object3)).has("username")) return false;
            if (!object3.has("password")) {
                return false;
            }
            object2 = object3.get("username").getAsString();
            object3 = object3.get("password").getAsString();
            if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object2)) return false;
            if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object3)) {
                return false;
            }
            object = new HashMap();
            HashMap<String, String> hashMap = C.R(A.l("https://open.e.189.cn/api/logbox/config/encryptConf.do?appId=cloud", object, this.i("https://open.e.189.cn/api/logbox/config/encryptConf.do?appId=cloud")).b()).getAsJsonObject("data").get("pubKey").getAsString();
            object = (List)A.g("https://cloud.189.cn/api/portal/loginUrl.action?redirectURL=https://cloud.189.cn/web/redirect.html?returnURL=/main.action", this.i("https://cloud.189.cn/api/portal/loginUrl.action?redirectURL=https://cloud.189.cn/web/redirect.html?returnURL=/main.action")).get("Location");
            if (object == null) return false;
            if (object.isEmpty()) {
                return false;
            }
            object = (String)object.get(0);
            if ((object = (List)A.g((String)object, this.i((String)object)).get("Location")) == null) return false;
            if (object.isEmpty()) {
                return false;
            }
            object = HttpUrl.parse((String)((String)object.get(0)));
            Object object4 = object.queryParameter("reqId");
            String string = object.queryParameter("lt");
            object = new HashMap(this.i("https://open.e.189.cn"));
            try {
                ((HashMap)object).put("Content-Type", "application/x-www-form-urlencoded");
                ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:74.0) Gecko/20100101 Firefox/76.0");
                ((HashMap)object).put("Referer", "https://open.e.189.cn/");
                ((HashMap)object).put("Lt", string);
                ((HashMap)object).put("Reqid", object4);
                object4 = new HashMap();
                ((HashMap)object4).put("version", "2.0");
                ((HashMap)object4).put("appKey", "cloud");
                string = C.R(A.l("https://open.e.189.cn/api/logbox/oauth2/appConf.do", object4, object).b()).getAsJsonObject("data");
                object4 = string.get("returnUrl").getAsString();
                string = string.get("paramId").getAsString();
                hashMap = G.p((String)((Object)hashMap));
                object2 = G.e((String)object2, (PublicKey)((Object)hashMap));
                object3 = G.e((String)object3, (PublicKey)((Object)hashMap));
                hashMap = new HashMap<String, String>();
                hashMap.put("appKey", "cloud");
                hashMap.put("version", "2.0");
                hashMap.put("accountType", "02");
                hashMap.put("validateCode", "");
                hashMap.put("returnUrl", (String)object4);
                hashMap.put("paramId", string);
                hashMap.put("captchaToken", "");
                hashMap.put("dynamicCheck", "FALSE");
                hashMap.put("clientType", "1");
                hashMap.put("cb_SaveName", "3");
                hashMap.put("isOauth2", "false");
                object4 = new StringBuilder("{NRP}");
                ((StringBuilder)object4).append((String)object2);
                hashMap.put("userName", ((StringBuilder)object4).toString());
                object2 = new StringBuilder("{NRP}");
                ((StringBuilder)object2).append((String)object3);
                hashMap.put("password", ((StringBuilder)object2).toString());
                object2 = A.l("https://open.e.189.cn/api/logbox/oauth2/loginSubmit.do", hashMap, object);
            }
            catch (Exception exception) {
                return false;
            }
            object3 = (Map)((X)object2).c;
            object2 = C.R(((X)object2).b());
            if (object2.has("result") && object2.get("result").getAsInt() != 0) {
                return false;
            }
            if (!object2.has("toUrl")) return false;
            if (object2.get("toUrl").isJsonNull()) {
                return false;
            }
            object = (List)object3.get("Set-Cookie");
            try {}
            catch (Exception exception) {
                return false;
            }
            break block14;
            catch (Exception exception) {
                return false;
            }
        }
        this.s("https://open.e.189.cn/api/logbox/oauth2/loginSubmit.do", (List)object);
        object2 = object2.get("toUrl").getAsString();
        this.l((String)object2, (List)object3.get("Set-Cookie"));
        this.s((String)object2, (List)A.g((String)object2, this.i((String)object2)).get("Set-Cookie"));
        this.t();
        return this.m();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean q(JsonObject jsonObject) {
        boolean bl = jsonObject.has("sessionKey");
        String string = "";
        String string2 = bl ? jsonObject.get("sessionKey").getAsString() : "";
        this.c = string2;
        string2 = jsonObject.has("sessionSecret") ? jsonObject.get("sessionSecret").getAsString() : "";
        this.d = string2;
        string2 = jsonObject.has("familySessionKey") ? jsonObject.get("familySessionKey").getAsString() : "";
        this.e = string2;
        string2 = jsonObject.has("familySessionSecret") ? jsonObject.get("familySessionSecret").getAsString() : "";
        this.f = string2;
        string2 = jsonObject.has("accessToken") ? jsonObject.get("accessToken").getAsString() : "";
        this.g = string2;
        string2 = string;
        if (jsonObject.has("refreshToken")) {
            string2 = jsonObject.get("refreshToken").getAsString();
        }
        this.h = string2;
        try {
            jsonObject = new JsonObject();
            jsonObject.addProperty("sessionKey", this.c);
            jsonObject.addProperty("sessionSecret", this.d);
            jsonObject.addProperty("familySessionKey", this.e);
            jsonObject.addProperty("familySessionSecret", this.f);
            jsonObject.addProperty("accessToken", this.g);
            jsonObject.addProperty("refreshToken", this.h);
            jsonObject.addProperty("familyId", this.i);
            C.b0("tianyi_session", C.Z(jsonObject));
            return this.c.isEmpty() ^ true;
        }
        catch (Exception exception) {
            return this.c.isEmpty() ^ true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r() {
        boolean bl;
        block11: {
            Object object;
            block12: {
                Object object2;
                boolean bl2 = false;
                try {
                    object = A.f("https://cloud.189.cn/api/portal/loginUrl.action?redirectURL=https%3A%2F%2Fcloud.189.cn%2Fweb%2Fredirect.html&defaultSaveName=3&defaultSaveNameCheck=uncheck&browserId=16322f24d9405fb83331c3f6ce971b53", this.i("https://cloud.189.cn/api/portal/loginUrl.action?redirectURL=https%3A%2F%2Fcloud.189.cn%2Fweb%2Fredirect.html&defaultSaveName=3&defaultSaveNameCheck=uncheck&browserId=16322f24d9405fb83331c3f6ce971b53"));
                    object2 = A.g((String)object, this.i((String)object));
                    this.s((String)object, (List)object2.get("Set-Cookie"));
                    object = (List)object2.get("Location");
                    if (object != null && !object.isEmpty()) {
                        this.b = object = (String)object.get(0);
                        object = (List)A.g((String)object, this.i((String)object)).get("Set-Cookie");
                        this.s(this.b, (List)object);
                        this.t();
                        bl = this.m();
                        if (bl) {
                            return;
                        }
                    }
                }
                catch (Exception exception) {}
                try {
                    object = new StringBuilder("https://cloud.189.cn/api/portal/unifyLoginForPC.action?appId=8025431004&clientType=10020&returnURL=");
                    ((StringBuilder)object).append(URLEncoder.encode("https://m.cloud.189.cn/zhuanti/2020/loginErrorPc/index.html", "UTF-8"));
                    ((StringBuilder)object).append("&timeStamp=");
                    ((StringBuilder)object).append(System.currentTimeMillis());
                    object2 = ((StringBuilder)object).toString();
                    ArrayList arrayList = new ArrayList();
                    object = null;
                    for (int i2 = 0; i2 < 10; ++i2) {
                        Object object3 = new HashMap();
                        ((HashMap)object3).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
                        ((HashMap)object3).put("Cookie", this.g());
                        Map map = A.g((String)object2, object3);
                        object3 = (List)map.get("Set-Cookie");
                        if (object3 != null) {
                            arrayList.addAll(object3);
                            this.s((String)object2, (List)object3);
                        }
                        if ((object2 = (List)map.get("Location")) == null || object2.isEmpty()) break;
                        if (!((String)(object2 = (String)object2.get(0))).contains("loginErrorPc")) continue;
                        object = object2;
                    }
                    this.t();
                    bl = bl2;
                    if (object == null) break block11;
                    if (this.l((String)object, arrayList)) {
                        bl = true;
                    }
                    break block12;
                }
                catch (Exception exception) {
                    bl = bl2;
                }
                break block11;
            }
            bl = this.k((String)object);
        }
        if (bl && this.m()) {
            return;
        }
        this.o();
    }

    public final void s(String map, List object) {
        if (object != null && object.size() > 0) {
            Object object2 = this.a;
            object2.getClass();
            HttpUrl httpUrl = HttpUrl.parse((String)((Object)map));
            if (httpUrl != null) {
                object2 = (HashMap)((A)object2).b;
                map = ((HashMap)object2).containsKey(httpUrl.host()) ? (Map)((HashMap)object2).get(httpUrl.host()) : new HashMap();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    object = ((String)iterator.next()).split(";")[0].trim();
                    int n2 = ((String)object).indexOf(61);
                    if (n2 <= 0) continue;
                    String string = ((String)object).substring(0, n2);
                    object = n2 < ((String)object).length() - 1 ? ((String)object).substring(n2 + 1) : "";
                    if ("SSON".equals(string) && !com.github.catvod.spider.merge.xc.A0.c.c(new CharSequence[]{object})) continue;
                    map.put(string, object);
                }
                ((HashMap)object2).put(httpUrl.host(), map);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void t() {
        try {
            C.b0("tianyie", C.Z((HashMap)this.a.b));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final D u(HashMap object, F object2, B b2) {
        HashMap hashMap = com.github.catvod.spider.merge.Bk.m.k("appKey", "8025431004", "accountType", "02");
        hashMap.put("userName", b2.b);
        hashMap.put("password", b2.c);
        hashMap.put("validateCode", "");
        hashMap.put("captchaToken", (String)((Object)((F)object2).d));
        hashMap.put("returnUrl", "https://m.cloud.189.cn/zhuanti/2020/loginErrorPc/index.html");
        hashMap.put("dynamicCheck", "FALSE");
        hashMap.put("clientType", "10020");
        hashMap.put("cb_SaveName", "1");
        hashMap.put("isOauth2", "false");
        hashMap.put("state", "");
        hashMap.put("paramId", (String)((Object)((F)object2).c));
        object2 = A.l("https://open.e.189.cn/api/logbox/oauth2/loginSubmit.do", hashMap, (Map)object);
        object = (Map)((X)object2).c;
        this.s("https://open.e.189.cn", (List)object.get("Set-Cookie"));
        object2 = C.R(((X)object2).b());
        if (object2.has("result") && object2.get("result").getAsInt() != 0) {
            object = object2.has("msg") ? object2.get("msg").getAsString() : "\u767b\u5f55\u5931\u8d25";
            throw new Exception((String)object);
        }
        if (object2.has("toUrl") && !object2.get("toUrl").isJsonNull()) {
            return new D(object2.get("toUrl").getAsString(), (List)object.get("Set-Cookie"));
        }
        throw new Exception("\u767b\u5f55\u5931\u8d25: \u672a\u83b7\u53d6\u5230\u8df3\u8f6c\u5730\u5740");
    }
}

