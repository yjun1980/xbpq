/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.I.F0;
import com.github.catvod.spider.merge.I.G0;
import com.github.catvod.spider.merge.I.H0;
import com.github.catvod.spider.merge.I.J0;
import com.github.catvod.spider.merge.I.K0;
import com.github.catvod.spider.merge.I.e;
import com.github.catvod.spider.merge.I.g0;
import com.github.catvod.spider.merge.I.i;
import com.github.catvod.spider.merge.I.j0;
import com.github.catvod.spider.merge.I.l;
import com.github.catvod.spider.merge.I.m0;
import com.github.catvod.spider.merge.I.n0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.I.x;
import com.github.catvod.spider.merge.I.x0;
import com.github.catvod.spider.merge.I.y0;
import com.github.catvod.spider.merge.I.z0;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.S.c;
import com.github.catvod.spider.merge.S.d;
import com.github.catvod.spider.merge.T.a;
import com.github.catvod.spider.merge.T.b;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class L0 {
    private static Map<String, String> o;
    private static Map<String, String> p;
    private final Map<String, String[]> a = new HashMap<String, String[]>();
    private final Map<String, String> b = new ConcurrentHashMap<String, String>();
    private final Map<String, Long> c = new ConcurrentHashMap<String, Long>();
    private final Map<String, String> d;
    private final Map<String, String> e;
    private ScheduledExecutorService f;
    private final ReentrantLock g = new ReentrantLock(true);
    private final ReentrantLock h = new ReentrantLock(true);
    private final List<String> i = new ArrayList<String>();
    private AlertDialog j;
    private String k;
    private String l;
    private String m;
    public b n;

    L0() {
        try {
            this.n = com.github.catvod.spider.merge.T.b.i(com.github.catvod.spider.merge.c1.d.m(com.github.catvod.spider.merge.c.b.e("uc_user")));
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.i0.m.y("uc\u6388\u6743\u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u5220\u9664\u6839\u76ee\u5f55TV\u6587\u4ef6\u5939\u4e0b\u6388\u6743\u6587\u4ef6\u540e\u91cd\u8bd5");
        }
        this.x();
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("uc QuarkPanApi constructor user:");
        ((StringBuilder)serializable).append(this.n);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        serializable = new HashMap();
        this.d = serializable;
        ((HashMap)serializable).put("4K", "4k");
        ((HashMap)serializable).put("2k", "2k");
        ((HashMap)serializable).put("\u8d85\u6e05", "super");
        ((HashMap)serializable).put("\u9ad8\u6e05", "high");
        ((HashMap)serializable).put("\u6a19\u6e05", "low");
        ((HashMap)serializable).put("\u6d41\u66a2", "normal");
        serializable = new HashMap();
        this.e = serializable;
        ((HashMap)serializable).put("4kz", "UC\u539f\u756b");
        ((HashMap)serializable).put("4k", "4K");
        ((HashMap)serializable).put("2k", "2K");
        ((HashMap)serializable).put("super", "\u9ad8\u6e05");
        ((HashMap)serializable).put("high", "\u6a19\u6e05");
        ((HashMap)serializable).put("low", "\u6d41\u66a2");
        ((HashMap)serializable).put("normal", "\u666e\u901a");
        ((HashMap)serializable).put("auto", "UC\u9810\u89bd\u756b\u8cea");
        new HashMap(128);
        o = new HashMap<String, String>(512);
        p = new HashMap<String, String>(4096);
    }

    private String B(String object, boolean bl) {
        synchronized (this) {
            Object object2;
            block9: {
                block10: {
                    object2 = (Long)((ConcurrentHashMap)this.c).get(object);
                    if (bl || object2 == null) break block9;
                    if (System.currentTimeMillis() >= (Long)object2) break block9;
                    object2 = (String)((ConcurrentHashMap)this.b).get(object);
                    int n2 = com.github.catvod.spider.merge.R0.e.a;
                    object = object2;
                    if (object2 != null) break block10;
                    object = "";
                }
                return object;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pwd_id", object);
                jSONObject.put("passcode", (Object)"");
                object2 = new HashMap();
                ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
                ((HashMap)object2).put("Referer", "https://drive.uc.cn/");
                ((HashMap)object2).put("Content-Type", "application/json");
                object2 = com.github.catvod.spider.merge.f0.d.f("https://pc-api.uc.cn/1/clouddrive/share/sharepage/token?pr=UCBrowser&fr=pc", jSONObject.toString(), object2);
                jSONObject = new JSONObject(((com.github.catvod.spider.merge.f0.i)object2).a());
                if (jSONObject.getInt("status") == 200) {
                    object2 = jSONObject.getJSONObject("data").getString("stoken");
                    ((ConcurrentHashMap)this.b).put((String)object, (String)object2);
                    ((ConcurrentHashMap)this.c).put((String)object, System.currentTimeMillis() + 3600000L);
                    return object2;
                }
            }
            catch (Exception exception) {
                object = new StringBuilder();
                ((StringBuilder)object).append("UC\u514d\u8f6c\u5b58\u5237\u65b0\u5206\u4eab\u51ed\u8bc1\u5931\u8d25: ");
                ((StringBuilder)object).append(exception.getMessage());
                SpiderDebug.log((String)((StringBuilder)object).toString());
            }
            {
            }
            finally {
            }
        }
    }

    private String C(String string) {
        String string2 = (String)((ConcurrentHashMap)this.b).get(string);
        int n2 = com.github.catvod.spider.merge.R0.e.a;
        string = string2;
        if (string2 == null) {
            string = "";
        }
        return string;
    }

    private void G(HashMap<String, String> hashMap, boolean bl, com.github.catvod.spider.merge.S.a a2, List<com.github.catvod.spider.merge.S.a> list, List<com.github.catvod.spider.merge.S.a> list2, List<com.github.catvod.spider.merge.S.a> list3, String string) {
        this.H(hashMap, bl, a2, list, list2, list3, string, 1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void H(HashMap<String, String> var1_1, boolean var2_3, com.github.catvod.spider.merge.S.a var3_4, List<com.github.catvod.spider.merge.S.a> var4_5, List<com.github.catvod.spider.merge.S.a> var5_6, List<com.github.catvod.spider.merge.S.a> var6_7, String var7_8, int var8_9) {
        block12: {
            if (!var2_3) ** GOTO lbl7
            var6_7 = new ArrayList<com.github.catvod.spider.merge.S.a>();
            {
                catch (Exception var1_2) {
                    break block12;
                }
lbl7:
                // 2 sources

                var9_10 = new StringBuilder();
                var9_10.append("listFiles >> ");
                var9_10.append(var1_1);
                SpiderDebug.log((String)var9_10.toString());
                var10_11 = new StringBuilder();
                var10_11.append("1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=");
                var10_11.append(var7_8);
                var10_11.append("&stoken=");
                var10_11.append(URLEncoder.encode(this.C(var7_8)));
                var10_11.append("&pdir_fid=");
                var10_11.append(var3_4.i());
                var10_11.append("&force=0&_page=");
                var10_11.append(var8_9);
                var10_11.append("&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=");
                var9_10 = var1_1 != null && "updated_at".equals(var1_1.get("type")) != false ? var1_1.get("type") : "file_name";
                var10_11.append((String)var9_10);
                var10_11.append(":");
                var9_10 = var1_1 != null && var1_1.get("order") != null ? var1_1.get("order").toLowerCase() : "asc";
                var10_11.append((String)var9_10);
                var10_11 = this.t(var10_11.toString());
                var9_10 = new StringBuilder();
                var9_10.append("listFiles >> ");
                var9_10.append((String)var10_11);
                SpiderDebug.log((String)var9_10.toString());
                var9_10 = new JSONObject((String)var10_11);
                var12_13 = com.github.catvod.spider.merge.S.a.q(var9_10.getJSONObject("data").toString());
                try {
                    if (var12_13.j().size() >= 1) {
                        com.github.catvod.spider.merge.S.d.a(var12_13.j());
                    }
                    ** GOTO lbl60
                }
                catch (Exception var10_12) {}
                {
                    var11_14 = new Comparable<StringBuilder>();
                    var11_14.append("listFiles error");
                    var11_14.append(var10_12.getMessage());
                    com.github.catvod.spider.merge.i0.m.y(var11_14.toString());
lbl60:
                    // 6 sources

                    for (Comparable<StringBuilder> var11_14 : var12_13.j()) {
                        if ("folder".equals(var11_14.p())) {
                            var6_7.add((com.github.catvod.spider.merge.S.a)var11_14);
                            continue;
                        }
                        if (!BaseApi.get().d.booleanValue() && !com.github.catvod.spider.merge.R0.e.d(com.github.catvod.spider.merge.i0.m.n(var11_14.k()))) {
                            if (!com.github.catvod.spider.merge.i0.m.t(var11_14.h())) continue;
                            var5_6.add((com.github.catvod.spider.merge.S.a)var11_14);
                            continue;
                        }
                        var11_14.r(var3_4.k());
                        var4_5.add((com.github.catvod.spider.merge.S.a)var11_14);
                    }
                    var10_11 = new Gson();
                    var9_10 = (c)var10_11.fromJson(var9_10.getJSONObject("metadata").toString(), c.class);
                    var8_9 = var9_10.c();
                    if ((var9_10.b() - 1) * var8_9 + var9_10.a() < var9_10.d()) {
                        this.H(var1_1, var2_3, (com.github.catvod.spider.merge.S.a)var3_4, var4_5, var5_6, var6_7, var7_8, var9_10.b() + 1);
                    }
                    if (!var2_3) return;
                    var3_4 = var6_7.iterator();
                    while (var3_4.hasNext()) {
                        this.G(var1_1, var2_3, (com.github.catvod.spider.merge.S.a)var3_4.next(), var4_5, var5_6, null, var7_8);
                    }
                    return;
                }
            }
        }
        var1_2.printStackTrace();
    }

    private com.github.catvod.spider.merge.f0.i L(String object, JSONObject jSONObject) {
        Object object2 = ((String)object).startsWith("https") ? object : com.github.catvod.spider.merge.B.e.c("https://pc-api.uc.cn/", (String)object);
        Serializable serializable = new HashMap<String, List<String>>();
        HashMap<String, String> hashMap = this.w((String)object2);
        object = new com.github.catvod.spider.merge.f0.i();
        for (int i2 = 2; i2 > 0 && ((com.github.catvod.spider.merge.f0.i)(object = com.github.catvod.spider.merge.f0.d.j((String)object2, jSONObject.toString(), hashMap, serializable))).a().length() <= 10; --i2) {
            Thread.sleep(500L);
        }
        this.I((Map<String, List<String>>)((Object)serializable));
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("quark post url:");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(" headers:");
        ((StringBuilder)serializable).append(hashMap);
        ((StringBuilder)serializable).append(" postBody:");
        ((StringBuilder)serializable).append(jSONObject.toString());
        ((StringBuilder)serializable).append(" newcookie: result:,");
        ((StringBuilder)serializable).append(((com.github.catvod.spider.merge.f0.i)object).a());
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean N(String charSequence, String object) {
        if (this.h.tryLock()) {
            Throwable throwable2222222;
            block11: {
                block12: {
                    Long l2 = (Long)((ConcurrentHashMap)this.c).get(charSequence);
                    Object object2 = (String)((ConcurrentHashMap)this.b).get(charSequence);
                    if (object2 != null && l2 != null && System.currentTimeMillis() < l2) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("use cached SToken...");
                        ((StringBuilder)charSequence).append((String)object2);
                        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                        this.k = object2;
                        this.h.unlock();
                        return true;
                    }
                    {
                        catch (Throwable throwable2222222) {
                            break block11;
                        }
                        catch (Exception exception) {}
                        {
                            exception.printStackTrace();
                            com.github.catvod.spider.merge.i0.m.y("\u4f86\u665a\u5566\uff0c\u8a72\u5206\u4eab\u5df2\u5931\u6548\u3002");
                            break block12;
                        }
                    }
                    {
                        SpiderDebug.log((String)"refreshSToken...");
                        for (int i2 = 3; i2 > 0 && com.github.catvod.spider.merge.R0.e.c(this.n.c()); --i2) {
                            Thread.sleep(1000L);
                        }
                    }
                    {
                        object2 = new JSONObject();
                        object2.put("pwd_id", (Object)charSequence);
                        object2.put("passcode", object);
                        object2 = this.L("1/clouddrive/share/sharepage/token?pr=UCBrowser&fr=pc", (JSONObject)object2);
                        l2 = new JSONObject(((com.github.catvod.spider.merge.f0.i)object2).a());
                        object = System.out;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("resultJson");
                        stringBuilder.append(l2);
                        ((PrintStream)object).println(stringBuilder.toString());
                        if (l2.getInt("status") != 401) {
                            object = ((com.github.catvod.spider.merge.f0.i)object2).a();
                            object2 = new JSONObject((String)object);
                            this.k = object2.getJSONObject("data").getString("stoken");
                            object2 = new JSONObject((String)object);
                            this.l = object2.getJSONObject("data").getJSONObject("author").getString("avatar_url");
                            object = new StringBuilder();
                            ((StringBuilder)object).append("sToken: ");
                            ((StringBuilder)object).append(this.k);
                            SpiderDebug.log((String)((StringBuilder)object).toString());
                            ((ConcurrentHashMap)this.b).put((String)charSequence, this.k);
                            long l3 = System.currentTimeMillis();
                            ((ConcurrentHashMap)this.c).put((String)charSequence, l3 + 3600000L);
                            this.h.unlock();
                            return true;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("cookie is invalid:");
                        ((StringBuilder)object).append(this.n.c());
                        SpiderDebug.log((String)((StringBuilder)object).toString());
                        object = new StringBuilder();
                        ((StringBuilder)object).append("cookie is invalid:");
                        ((StringBuilder)object).append(this.n.c());
                        com.github.catvod.spider.merge.i0.m.y(((StringBuilder)object).toString());
                        this.n.k("");
                        this.n.j();
                        this.k = "";
                        ((ConcurrentHashMap)this.b).remove(charSequence);
                        ((ConcurrentHashMap)this.c).remove(charSequence);
                    }
                }
                this.h.unlock();
                return false;
            }
            this.h.unlock();
            throw throwable2222222;
        }
        object = (Long)((ConcurrentHashMap)this.c).get(charSequence);
        if ((charSequence = (String)((ConcurrentHashMap)this.b).get(charSequence)) != null && object != null && System.currentTimeMillis() < (Long)object) {
            com.github.catvod.spider.merge.B.e.d("use cached SToken (concurrent)...", (String)charSequence);
            return true;
        }
        return false;
    }

    private String O(String object, String object2, String string, boolean bl) {
        block5: {
            String string2;
            block4: {
                try {
                    string2 = this.B((String)object, bl);
                    if (!com.github.catvod.spider.merge.R0.e.c(string2)) break block4;
                    return "";
                }
                catch (Exception exception) {
                    r.f(exception, com.github.catvod.spider.merge.C.a.c("UC\u514d\u8f6c\u5b58\u83b7\u53d6\u4e0b\u8f7d\u5730\u5740\u5931\u8d25: "));
                    return "";
                }
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("fids", (Object)jSONArray.put(object2));
            object2 = new JSONArray();
            jSONObject.put("fids_token", (Object)object2.put((Object)string));
            jSONObject.put("pwd_id", object);
            jSONObject.put("stoken", (Object)string2);
            jSONObject.put("speedup_session", (Object)"");
            object = new HashMap();
            object.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
            object.put("Referer", "https://drive.uc.cn");
            object.put("Content-Type", "application/json");
            object2 = com.github.catvod.spider.merge.f0.d.f("https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc", jSONObject.toString(), object);
            object = new JSONObject(((com.github.catvod.spider.merge.f0.i)object2).a());
            if (object.optInt("status", 500) == 200) break block5;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("UC\u514d\u8f6c\u5b58\u4e0b\u8f7d\u63a5\u53e3\u5931\u8d25: ");
            ((StringBuilder)object2).append(object.optInt("status"));
            ((StringBuilder)object2).append("/");
            ((StringBuilder)object2).append(object.optInt("code"));
            ((StringBuilder)object2).append("/");
            ((StringBuilder)object2).append(object.optString("message"));
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            return "";
        }
        object = object.getJSONArray("data").getJSONObject(0).getString("download_url");
        return object;
    }

    private void Q() {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(t.a.c);
        charSequence.append("/api/ucGetRefreshToken");
        charSequence = com.github.catvod.spider.merge.f0.d.k(charSequence.toString());
        if (com.github.catvod.spider.merge.R0.e.d(charSequence)) {
            this.n.o((String)charSequence);
            this.n.j();
            this.U();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void T(String string) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.i0.m.e(240), com.github.catvod.spider.merge.i0.m.e(240));
            ImageView imageView = new ImageView((Context)Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.K1.d.b(string, 240, 2));
            string = new FrameLayout((Context)Init.context());
            layoutParams.gravity = 17;
            string.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
            AlertDialog.Builder builder = new AlertDialog.Builder((Context)Init.getActivity());
            string = builder.setView((View)string);
            g0 g02 = new g0(this, 1);
            string = string.setOnCancelListener((DialogInterface.OnCancelListener)g02);
            j0 j02 = new j0(this, 1);
            string = string.setOnDismissListener((DialogInterface.OnDismissListener)j02).show();
            this.j = string;
            string = string.getWindow();
            ColorDrawable colorDrawable = new ColorDrawable(0);
            string.setBackgroundDrawable((Drawable)colorDrawable);
            com.github.catvod.spider.merge.i0.m.y("\u8acb\u4f7f\u7528UC App \u6383\u63cf\u4e8c\u7dad\u78bc");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void U() {
        ScheduledExecutorService scheduledExecutorService = this.f;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new F0(this, 1));
    }

    public static void a(L0 l02) {
        l02.p();
        Init.execute(new x0(l02, false));
    }

    public static void b(L0 l02) {
        l02.p();
        Init.execute(new x0(l02, true));
    }

    public static /* synthetic */ void c(L0 l02) {
        l02.p();
    }

    public static void d(L0 l02, boolean bl, String string) {
        ScheduledExecutorService scheduledExecutorService;
        Objects.requireNonNull(l02);
        l02.f = scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new z0(l02, bl, string), 1L, 1L, TimeUnit.SECONDS);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static /* synthetic */ void e(L0 var0, boolean var1_1, String var2_2) {
        Objects.requireNonNull(var0);
        if (!var1_1) ** GOTO lbl7
        try {
            block4: {
                var0.Q();
                break block4;
lbl7:
                // 1 sources

                var3_4 /* !! */  = new StringBuilder();
                var3_4 /* !! */ .append("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=381&v=1.2&token=");
                var3_4 /* !! */ .append((String)var2_2);
                var3_4 /* !! */  = com.github.catvod.spider.merge.f0.d.k(var3_4 /* !! */ .toString());
                var4_5 /* !! */  = new JSONObject((String)var3_4 /* !! */ );
                var4_5 /* !! */  = var4_5 /* !! */ .getString("status");
                var5_6 = new StringBuilder();
                var5_6.append("params ");
                var5_6.append((String)var2_2);
                SpiderDebug.log((String)var5_6.toString());
                if ("2000000".equals(var4_5 /* !! */ )) {
                    var2_2 = new JSONObject((String)var3_4 /* !! */ );
                    var4_5 /* !! */  = var2_2.getJSONObject("data").getJSONObject("members").getString("service_ticket");
                    var2_2 = new StringBuilder();
                    var2_2.append("serviceTicket>>");
                    var2_2.append((String)var4_5 /* !! */ );
                    SpiderDebug.log((String)var2_2.toString());
                    var2_2 = new HashMap();
                    var5_6 = new StringBuilder();
                    var5_6.append("https://drive.uc.cn/account/info?st=");
                    var5_6.append((String)var4_5 /* !! */ );
                    var5_6.append("&lw=scan");
                    var4_5 /* !! */  = com.github.catvod.spider.merge.f0.d.l(var5_6.toString(), null, var2_2);
                    var5_6 = new StringBuilder();
                    var5_6.append("string");
                    var5_6.append((String)var4_5 /* !! */ );
                    SpiderDebug.log((String)var5_6.toString());
                    var5_6 = new StringBuilder();
                    var5_6.append("respHeader");
                    var5_6.append(var2_2);
                    SpiderDebug.log((String)var5_6.toString());
                    var5_6 = new JSONObject((String)var4_5 /* !! */ );
                    if (var5_6.getBoolean("success")) {
                        var2_2 = var0.u((Map<String, List<String>>)var2_2).toString();
                        var4_5 /* !! */  = new HashMap();
                        var5_6 = new HashMap();
                        var5_6.put("Cookie", var2_2);
                        var6_7 = com.github.catvod.spider.merge.f0.d.l("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", (Map<String, String>)var5_6, (Map<String, List<String>>)var4_5 /* !! */ );
                        var5_6 = new StringBuilder();
                        var5_6.append("string1");
                        var5_6.append(var6_7);
                        SpiderDebug.log((String)var5_6.toString());
                        var5_6 = new StringBuilder();
                        var5_6.append(var0.u((Map<String, List<String>>)var4_5 /* !! */ ));
                        var5_6.append((String)var2_2);
                        var0.P(var5_6.toString(), true);
                        var2_2 = new StringBuilder();
                        var2_2.append("\u8bf7\u91cd\u65b0\u8fdb\u5165\u64ad\u653e\u9875\u3002\u3002\u3002");
                        var2_2.append((String)var3_4 /* !! */ );
                        com.github.catvod.spider.merge.i0.m.y(var2_2.toString());
                        var0.U();
                    }
                }
            }
            return;
        }
        catch (JSONException var2_3) {
            var0.U();
            throw new RuntimeException(var2_3);
        }
    }

    public static void f(EditText object) {
        L0 l02 = K0.a;
        object = object.getText().toString();
        l02.p();
        Init.execute(new e(l02, object, 3));
    }

    public static void g(L0 l02) {
        l02.U();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(L0 l02) {
        Objects.requireNonNull(l02);
        Iterator<String> iterator = new ArrayList<String>(l02.i).iterator();
        while (true) {
            int n2;
            String string;
            block6: {
                if (!iterator.hasNext()) {
                    return;
                }
                string = iterator.next();
                n2 = 0;
                int n3 = 1;
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Delete...");
                    stringBuilder.append(string);
                    SpiderDebug.log((String)stringBuilder.toString());
                    stringBuilder = new JSONObject();
                    stringBuilder.put("action_type", 2);
                    Object object = new JSONArray();
                    stringBuilder.put("filelist", object.put((Object)string));
                    object = new JSONArray();
                    stringBuilder.put("exclude_fids", object);
                    object = l02.L("1/clouddrive/file/delete?pr=UCBrowser&fr=pc", (JSONObject)stringBuilder).a();
                    if (((String)object).contains("\u6587\u4ef6\u5df2\u7ecf\u5220\u9664")) {
                        n2 = n3;
                        break block6;
                    }
                    stringBuilder = new JSONObject((String)object);
                    n3 = stringBuilder.getInt("status");
                    if (n3 == 200) {
                        n2 = 1;
                    }
                }
                catch (Exception exception) {}
            }
            if (n2 == 0) continue;
            ((ArrayList)l02.i).remove(string);
        }
    }

    public static void i(EditText object) {
        L0 l02 = K0.a;
        object = object.getText().toString();
        l02.p();
        Init.execute(new x(l02, object, 3));
    }

    public static void j(L0 l02) {
        l02.U();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void k(L0 object, boolean bl, String string, String string2) {
        Throwable throwable2222222;
        block4: {
            Objects.requireNonNull(object);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClassName("com.UCMobile", "com.UCMobile.main.UCMobile");
            intent.setData(Uri.parse((String)string2));
            Init.getActivity().startActivity(intent);
            object = new J0(object, bl, string, 0);
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (Exception exception) {}
                {
                    ((L0)object).T(string2);
                    object = new y0((L0)object, bl, string);
                }
            }
            Init.execute((Runnable)object);
            return;
        }
        Init.execute(new y0((L0)object, bl, string));
        throw throwable2222222;
    }

    public static void l(L0 l02, EditText object) {
        Objects.requireNonNull(l02);
        object = object.getText().toString();
        l02.p();
        Init.execute(new l(l02, (String)object, 3));
    }

    public static void m(L0 l02, EditText object) {
        Objects.requireNonNull(l02);
        object = object.getText().toString();
        l02.p();
        Init.execute(new i(l02, object, 2));
    }

    private String n(String object, String string, boolean bl) {
        Object object2 = object;
        if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)object)) {
            Object object3 = new StringBuilder();
            ((StringBuilder)object3).append("Copy ... fileId:");
            ((StringBuilder)object3).append((String)object);
            SpiderDebug.log((String)((StringBuilder)object3).toString());
            object3 = ((String)object).split("_");
            Object object4 = (String)((HashMap)p).get(object3[0]);
            if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)object4)) {
                object3[1] = object4;
            }
            object4 = new JSONObject();
            object4.put("fid_list", (Object)new JSONArray().put((Object)object3[0]));
            object4.put("fid_token_list", (Object)new JSONArray().put((Object)object3[1]));
            object4.put("pwd_id", (Object)string);
            object4.put("stoken", (Object)this.C(string));
            object4.put("pdir_fid", (Object)"0");
            object3 = this.L("1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc", (JSONObject)object4).a();
            if (new JSONObject((String)object3).getInt("status") == 403) {
                if (!bl) {
                    block10: {
                        object3 = "";
                        if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)object)) break block10;
                        object = object3;
                    }
                    if (((String)object).contains("_")) {
                        object2 = ((String)object).split("_")[0];
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("&stoken=");
                    ((StringBuilder)object).append(URLEncoder.encode(this.C(string)));
                    ((StringBuilder)object).append("&pdir_fid=0&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc");
                    object4 = this.t(((StringBuilder)object).toString());
                    object = new JSONObject((String)object4);
                    object = object.getJSONObject("data");
                    ArrayList<com.github.catvod.spider.merge.S.a> arrayList = new ArrayList<com.github.catvod.spider.merge.S.a>();
                    object4 = new ArrayList();
                    com.github.catvod.spider.merge.S.a a2 = new com.github.catvod.spider.merge.S.a(this.y("", (JSONObject)object));
                    this.G(null, true, a2, (List<com.github.catvod.spider.merge.S.a>)arrayList, (List<com.github.catvod.spider.merge.S.a>)object4, null, string);
                    object4 = arrayList.iterator();
                    object = "";
                    try {
                        while (object4.hasNext()) {
                            a2 = (com.github.catvod.spider.merge.S.a)object4.next();
                            ((HashMap)p).put(a2.i(), a2.m());
                            if (!a2.i().equals(object2)) continue;
                            object = a2.b();
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        object = object3;
                    }
                    return this.n((String)object, string, true);
                }
                throw new Exception();
            }
            return new JSONObject((String)object3).getJSONObject("data").getString("task_id");
        }
        throw new Exception();
    }

    private String o(String string, String charSequence) {
        block9: {
            try {
                if (System.currentTimeMillis() / 1000L - this.n.e() < 1800L) {
                    SpiderDebug.log((String)"Obtain drive id... return cached drive");
                    if (com.github.catvod.spider.merge.R0.e.c(this.m)) {
                        this.m = this.n.d();
                    }
                } else {
                    SpiderDebug.log((String)"Obtain drive id...");
                    String string2 = this.t("1/clouddrive/share/sharepage/dir?pr=UCBrowser&fr=pc&aver=1");
                    JSONObject jSONObject = new JSONObject(string2);
                    this.m = string2 = jSONObject.getJSONObject("data").getString("pdir_fid");
                    this.n.l(string2);
                    this.n.m(System.currentTimeMillis() / 1000L);
                    this.n.j();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            string = this.n(string, (String)charSequence, false);
            int n2 = 0;
            while (n2 < 3) {
                int n3 = n2 + 1;
                long l2 = n3 * 500;
                try {
                    Thread.sleep(l2);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("1/clouddrive/task?pr=UCBrowser&fr=pc&task_id=");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("&retry_index=");
                ((StringBuilder)charSequence).append(n2);
                if ((charSequence = new JSONObject(this.t(((StringBuilder)charSequence).toString()))).getInt("status") != 200) continue;
                if (charSequence.getJSONObject("data").getInt("status") == 2) {
                    string = charSequence.getJSONObject("data").getJSONObject("save_as").getJSONArray("save_as_top_fids").getString(0);
                    break block9;
                }
                n2 = n3;
            }
            string = "";
        }
        ((ArrayList)this.i).add(0, string);
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void p() {
        try {
            AlertDialog alertDialog = this.j;
            if (alertDialog == null) return;
            alertDialog.dismiss();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private String q(String string, String string2, String string3, String string4, int n2) {
        if (n2 > 20) {
            return "";
        }
        CharSequence charSequence = new StringBuilder();
        charSequence.append("1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=");
        charSequence.append(string);
        charSequence.append("&stoken=");
        charSequence.append(URLEncoder.encode(string2, "UTF-8"));
        charSequence.append("&pdir_fid=");
        charSequence.append(string3);
        charSequence.append("&force=0&_page=1&_size=100&_fetch_total=1&_fetch_share=1");
        string3 = new JSONObject(this.t(charSequence.toString())).optJSONObject("data");
        if (string3 == null) {
            return "";
        }
        if ((string3 = string3.optJSONArray("list")) == null) {
            return "";
        }
        for (int i2 = 0; i2 < string3.length(); ++i2) {
            charSequence = string3.optJSONObject(i2);
            if (charSequence == null) continue;
            if (string4.equals(charSequence.optString("fid"))) {
                return charSequence.optString("share_fid_token");
            }
            if (!charSequence.optBoolean("dir") || !com.github.catvod.spider.merge.R0.e.e(charSequence = this.q(string, string2, charSequence.optString("fid"), string4, n2 + 1))) continue;
            return charSequence;
        }
        return "";
    }

    private String r(String object, List<com.github.catvod.spider.merge.S.a> object2) {
        Object object3 = new ArrayList<com.github.catvod.spider.merge.S.a>();
        String string = com.github.catvod.spider.merge.i0.m.z((String)object).toLowerCase();
        object = object2.iterator();
        while (object.hasNext()) {
            com.github.catvod.spider.merge.S.a a2 = (com.github.catvod.spider.merge.S.a)object.next();
            String string2 = com.github.catvod.spider.merge.i0.m.z(a2.k()).toLowerCase();
            if (!string.contains(string2) && !string2.contains(string)) continue;
            ((ArrayList)object3).add(a2);
        }
        if (((ArrayList)object3).isEmpty()) {
            ((ArrayList)object3).addAll(object2);
        }
        object = new StringBuilder();
        object3 = ((ArrayList)object3).iterator();
        while (object3.hasNext()) {
            object2 = (com.github.catvod.spider.merge.S.a)object3.next();
            ((HashMap)p).put(((com.github.catvod.spider.merge.S.a)object2).i(), ((com.github.catvod.spider.merge.S.a)object2).m());
            ((StringBuilder)object).append("+");
            ((StringBuilder)object).append(com.github.catvod.spider.merge.i0.m.z(((com.github.catvod.spider.merge.S.a)object2).k()));
            ((StringBuilder)object).append("@@@");
            ((StringBuilder)object).append(((com.github.catvod.spider.merge.S.a)object2).h());
            ((StringBuilder)object).append("@@@");
            ((StringBuilder)object).append(((com.github.catvod.spider.merge.S.a)object2).b());
        }
        return ((StringBuilder)object).toString();
    }

    public static L0 s() {
        return K0.a;
    }

    private String t(String string) {
        String string2 = string.startsWith("https") ? string : com.github.catvod.spider.merge.B.e.c("https://drive-pc.quark.cn/", string);
        Serializable serializable = new HashMap<String, List<String>>();
        HashMap<String, String> hashMap = this.w(string2);
        string = null;
        for (int i2 = 2; i2 > 0; --i2) {
            string = com.github.catvod.spider.merge.f0.d.l(string2, hashMap, serializable);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("quark get result:");
            stringBuilder.append(string);
            SpiderDebug.log((String)stringBuilder.toString());
            if (string.length() > 10) break;
            Thread.sleep(500L);
        }
        this.I((Map<String, List<String>>)((Object)serializable));
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("quark get url:");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(" headers:");
        ((StringBuilder)serializable).append(hashMap);
        ((StringBuilder)serializable).append(" newcookie: result:");
        ((StringBuilder)serializable).append(string);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        return string;
    }

    private StringBuilder u(Map<String, List<String>> object) {
        Object object2;
        List<String> list;
        block6: {
            block5: {
                list = object.get("Set-Cookie");
                if (list == null) break block5;
                object2 = list;
                if (list.size() != 0) break block6;
            }
            object2 = object.get("set-cookie");
        }
        object = new StringBuilder();
        if (object2.size() > 0) {
            list = object2.iterator();
            while (list.hasNext()) {
                object2 = (String)list.next();
                if (((String)object2).contains("ctoken")) continue;
                ((StringBuilder)object).append(((String)object2).split(";")[0]);
                ((StringBuilder)object).append("; ");
            }
        }
        return object;
    }

    private String y(String string, JSONObject jSONObject) {
        block7: {
            block6: {
                try {
                    if (com.github.catvod.spider.merge.R0.e.c(string)) break block6;
                    return string;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return "";
                }
            }
            string = jSONObject.getJSONArray("list");
            if (string.length() != 0) break block7;
            return "";
        }
        string = string.getJSONObject(0);
        if (string.getBoolean("dir")) {
            return string.getString("fid");
        }
        if (string.getBoolean("file") && string.getString("obj_category").equals("video")) {
            return "0";
        }
        return "";
    }

    /*
     * Exception decompiling
     */
    public final String A(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final List<g> D(String[] stringArray) {
        ArrayList<g> arrayList = new ArrayList<g>();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = stringArray[i2];
            if (!((String)object).contains("@@@")) continue;
            Object object2 = ((String)object).split("@@@");
            String string = object2[0];
            object = object2[1];
            CharSequence charSequence = new StringBuilder();
            charSequence.append(Proxy.getUrl());
            charSequence.append("?do=quark&type=sub&share_id=");
            charSequence.append(stringArray[0]);
            charSequence.append("&file_id=");
            charSequence.append(object2[2]);
            charSequence = charSequence.toString();
            object2 = new g();
            ((g)object2).b(string);
            object = ((g)object2).a((String)object);
            ((g)object).c((String)charSequence);
            arrayList.add((g)object);
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public final h E(String var1_1, String var2_5, String var3_6, String var4_7) {
        block24: {
            block23: {
                var8_8 = this.z("");
                for (var5_9 = 3; var5_9 > 0; --var5_9) {
                    if (com.github.catvod.spider.merge.R0.e.c(this.n.c())) {
                        Thread.sleep(1000L);
                        continue;
                    }
                    if (!com.github.catvod.spider.merge.R0.e.c(this.C((String)var2_5))) break;
                    continue;
                }
                this.N((String)var2_5, "");
                var7_10 = "0";
                if (com.github.catvod.spider.merge.R0.e.c((CharSequence)var3_6)) break block23;
                var7_10 = var3_6;
            }
            var9_11 = new StringBuilder();
            var9_11.append("1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=");
            var9_11.append((String)var2_5);
            var9_11.append("&stoken=");
            var9_11.append(URLEncoder.encode(this.C((String)var2_5)));
            var9_11.append("&pdir_fid=");
            var9_11.append((String)var7_10);
            var9_11.append("&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc");
            var7_10 = this.t(var9_11.toString());
            var9_11 = new JSONObject((String)var7_10);
            var9_11 = var9_11.getJSONObject("data");
            var6_12 = com.github.catvod.spider.merge.R0.e.b((CharSequence)var4_7);
            if (!var6_12) ** GOTO lbl40
            var4_7 = com.github.catvod.spider.merge.i0.m.A(var9_11.getJSONObject("share").getString("title"));
lbl40:
            // 2 sources

            var11_13 = new ArrayList();
            var7_10 = new ArrayList<String>();
            var10_14 = new com.github.catvod.spider.merge.S.a(this.y((String)var3_6, (JSONObject)var9_11));
            var3_6 = var7_10;
            this.G(null, true, (com.github.catvod.spider.merge.S.a)var10_14, (List<com.github.catvod.spider.merge.S.a>)var11_13, (List<com.github.catvod.spider.merge.S.a>)var7_10, null, (String)var2_5);
            var10_14 = new ArrayList<String>();
            var7_10 = new ArrayList<String>();
            var11_13 = var11_13.iterator();
            while (var11_13.hasNext()) {
                var13_16 = (com.github.catvod.spider.merge.S.a)var11_13.next();
                L0.p.put(var13_16.i(), var13_16.m());
                var12_15 = new StringBuilder();
                var12_15.append(var13_16.e());
                var12_15.append("$");
                var12_15.append((String)var2_5);
                var12_15.append('+');
                var12_15.append(var13_16.b());
                var12_15.append('+');
                var12_15.append((String)var4_7);
                var12_15.append('+');
                var12_15.append(var13_16.k());
                var12_15.append(this.r(var13_16.k(), (List<com.github.catvod.spider.merge.S.a>)var3_6));
                var10_14.add(var12_15.toString());
            }
            var5_9 = 0;
            while (true) {
                var3_6 = (ArrayList)var8_8;
                if (var5_9 >= var3_6.size()) break;
                var2_5 = new StringBuilder();
                var3_6 = var10_14.iterator();
                if (var3_6.hasNext()) {
                    while (true) {
                        var2_5.append((CharSequence)var3_6.next());
                        if (!var3_6.hasNext()) break;
                        var2_5.append((CharSequence)"#");
                    }
                }
                var7_10.add(var2_5.toString());
                ++var5_9;
                continue;
                break;
            }
            var2_5 = new h();
            var2_5.l((String)var1_1);
            var2_5.j((String)var1_1);
            var2_5.n(this.l);
            var2_5.m(var9_11.getJSONObject("share").getString("title"));
            var1_1 = new StringBuilder();
            var4_7 = var7_10.iterator();
            var6_12 = var4_7.hasNext();
            if (!var6_12) ** GOTO lbl114
            try {
                while (true) {
                    var1_1.append((CharSequence)var4_7.next());
                    if (!var4_7.hasNext()) break;
                    var1_1.append((CharSequence)"$$$");
                }
lbl114:
                // 2 sources

                var2_5.p(var1_1.toString());
                var1_1 = new StringBuilder();
                var3_6 = var3_6.iterator();
                if (var3_6.hasNext()) {
                    while (true) {
                        var1_1.append((CharSequence)var3_6.next());
                        if (!var3_6.hasNext()) break;
                        var1_1.append((CharSequence)"$$$");
                    }
                }
                var2_5.o(var1_1.toString());
            }
            catch (Exception var1_2) {}
            try {
                var2_5.g("UC\u96f2\u76e4");
                return var2_5;
            }
            catch (Exception var1_4) {
                ** continue;
            }
            break block24;
            catch (Exception var1_3) {
                // empty catch block
            }
        }
        return BaseApi.fakeVod(var8_8, "UC\u96f2\u76e4");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<h> F(com.github.catvod.spider.merge.K.i object) {
        void var3_9;
        Object object2;
        Object object3;
        ArrayList<com.github.catvod.spider.merge.S.a> arrayList;
        Object object4;
        String string;
        String string2;
        Object object5;
        Object object6;
        block13: {
            ArrayList<com.github.catvod.spider.merge.S.a> arrayList2;
            block14: {
                object6 = ((com.github.catvod.spider.merge.K.i)object).d();
                object5 = ((com.github.catvod.spider.merge.K.i)object).c();
                String string3 = ((com.github.catvod.spider.merge.K.i)object).f();
                string2 = ((com.github.catvod.spider.merge.K.i)object).e();
                string = ((com.github.catvod.spider.merge.K.i)object).b();
                object4 = ((com.github.catvod.spider.merge.K.i)object).a();
                arrayList = new ArrayList<com.github.catvod.spider.merge.S.a>();
                object3 = new ArrayList();
                for (int i2 = 3; i2 > 0; --i2) {
                    try {
                        if (com.github.catvod.spider.merge.R0.e.c(this.n.c())) {
                            Thread.sleep(1000L);
                            continue;
                        }
                        if (!com.github.catvod.spider.merge.R0.e.c(this.C((String)object5))) break;
                        continue;
                    }
                    catch (Exception exception) {
                        object = string3;
                        ArrayList<com.github.catvod.spider.merge.S.a> arrayList3 = arrayList;
                        break block13;
                    }
                }
                {
                    this.N((String)object5, (String)object6);
                    object = "0";
                    if (!com.github.catvod.spider.merge.R0.e.c(string)) {
                        object = string;
                    }
                    object6 = new StringBuilder();
                    ((StringBuilder)object6).append("1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=");
                    ((StringBuilder)object6).append((String)object5);
                    ((StringBuilder)object6).append("&stoken=");
                    ((StringBuilder)object6).append(URLEncoder.encode(this.C((String)object5)));
                    ((StringBuilder)object6).append("&pdir_fid=");
                    ((StringBuilder)object6).append((String)object);
                    ((StringBuilder)object6).append("&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc");
                    object6 = this.t(((StringBuilder)object6).toString());
                    object = new JSONObject((String)object6);
                    object6 = object.getJSONObject("data");
                    object = string3;
                    if (!com.github.catvod.spider.merge.R0.e.b(string3)) break block14;
                    object = object6.getJSONObject("share").getString("title");
                }
            }
            try {
                arrayList2 = new ArrayList<com.github.catvod.spider.merge.S.a>();
            }
            catch (Exception exception) {
                ArrayList<com.github.catvod.spider.merge.S.a> arrayList4 = arrayList;
                break block13;
            }
            try {
                arrayList = new ArrayList<com.github.catvod.spider.merge.S.a>();
                object2 = new com.github.catvod.spider.merge.S.a(this.y(string, (JSONObject)object6));
                this.G((HashMap<String, String>)object4, false, (com.github.catvod.spider.merge.S.a)object2, arrayList2, arrayList, (List<com.github.catvod.spider.merge.S.a>)object3, (String)object5);
            }
            catch (Exception exception) {}
        }
        arrayList = new ArrayList();
        object2 = ((ArrayList)object3).iterator();
        while (object2.hasNext()) {
            object4 = (com.github.catvod.spider.merge.S.a)object2.next();
            object6 = new h();
            object3 = r.d((String)object5, "*#");
            ((StringBuilder)object3).append(((com.github.catvod.spider.merge.S.a)object4).i());
            ((StringBuilder)object3).append("*#");
            ((StringBuilder)object3).append(((com.github.catvod.spider.merge.S.a)object4).k());
            ((h)object6).l(((StringBuilder)object3).toString());
            ((h)object6).m(((com.github.catvod.spider.merge.S.a)object4).k());
            ((h)object6).r(((com.github.catvod.spider.merge.S.a)object4).p());
            arrayList.add((com.github.catvod.spider.merge.S.a)((Object)((h)object6)));
        }
        object3 = var3_9.iterator();
        while (object3.hasNext()) {
            com.github.catvod.spider.merge.S.a a2 = (com.github.catvod.spider.merge.S.a)object3.next();
            object5 = new h();
            object4 = new StringBuilder();
            ((StringBuilder)object4).append(string2);
            ((StringBuilder)object4).append(string);
            ((StringBuilder)object4).append("*#");
            ((StringBuilder)object4).append((String)object);
            ((h)object5).l(((StringBuilder)object4).toString());
            ((h)object5).m(a2.e());
            ((h)object5).r(a2.p());
            ((h)object5).n(a2.o());
            arrayList.add((com.github.catvod.spider.merge.S.a)((Object)((h)object5)));
        }
        return arrayList;
    }

    public final String I(Map<String, List<String>> object) {
        Object object2;
        block12: {
            block11: {
                String[] object32 = (String[])object.get("Set-Cookie");
                if (object32 == null) break block11;
                object2 = object32;
                if (!object32.isEmpty()) break block12;
            }
            object2 = (List)object.get("set-cookie");
        }
        String string = "";
        if (object2 == null) {
            return "";
        }
        object = string;
        if (!object2.isEmpty()) {
            object2 = ((String)object2.get(0)).split(";");
            int n2 = ((String[])object2).length;
            int n3 = 0;
            while (true) {
                object = string;
                if (n3 >= n2) break;
                object = object2[n3];
                if (((String)object).startsWith("__puus=")) {
                    object = ((String)object).substring(((String)object).indexOf("__puus=") + 7);
                    break;
                }
                ++n3;
            }
            String string2 = this.n.c();
            if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) {
                return string2;
            }
            String[] stringArray = this.n.c().split("; ");
            object2 = new StringBuilder();
            for (String string3 : stringArray) {
                if (string3.startsWith("__puus=")) {
                    ((StringBuilder)object2).append("__puus=");
                    ((StringBuilder)object2).append((String)object);
                } else {
                    ((StringBuilder)object2).append(string3);
                }
                ((StringBuilder)object2).append("; ");
            }
            object = ((StringBuilder)object2).substring(0, ((StringBuilder)object2).length() - 2);
            this.n.k((String)object);
            this.n.j();
        }
        return object;
    }

    public final String J(String[] object) {
        if (object[0].startsWith("http")) {
            object = new f();
            ((f)object).w("");
            return ((f)object).toString();
        }
        f f2 = new f();
        Object object2 = K0.a;
        Object object3 = object[0];
        Object object4 = object[1];
        Objects.requireNonNull(object2);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(Proxy.getUrl());
        ((StringBuilder)object2).append("?do=quark&type=dwnz&file_id=");
        ((StringBuilder)object2).append((String)object4);
        ((StringBuilder)object2).append("&share_id=");
        ((StringBuilder)object2).append((String)object3);
        f2.w(((StringBuilder)object2).toString());
        f2.j();
        f2.v(this.D((String[])object));
        f2.g(this.w(null));
        return f2.toString();
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String K(String[] object, String charSequence) {
        try {
            if (((String)object[0]).startsWith("http")) {
                object = new f();
                ((f)object).w("");
                return ((f)object).toString();
            }
            if (((String)charSequence).contains("\u514d\u8f6c\u5b58")) {
                CharSequence charSequence2;
                String[] stringArray = ((String)object[1]).split("_", 2);
                String string = stringArray[0];
                charSequence = charSequence2 = (String)((HashMap)p).get(string);
                if (com.github.catvod.spider.merge.R0.e.c(charSequence2)) {
                    charSequence = charSequence2;
                    if (stringArray.length > 1) {
                        charSequence = stringArray[1];
                    }
                }
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(Proxy.getUrl());
                ((StringBuilder)charSequence2).append("?do=uc&type=unlimited&shareId=");
                ((StringBuilder)charSequence2).append(URLEncoder.encode((String)object[0], "UTF-8"));
                ((StringBuilder)charSequence2).append("&fileId=");
                ((StringBuilder)charSequence2).append(URLEncoder.encode(string, "UTF-8"));
                ((StringBuilder)charSequence2).append("&fileToken=");
                object = charSequence;
                if (charSequence == null) {
                    object = "";
                }
                ((StringBuilder)charSequence2).append(URLEncoder.encode((String)object, "UTF-8"));
                charSequence = ((StringBuilder)charSequence2).toString();
                object = new f();
                ((f)object).w((String)charSequence);
                ((f)object).j();
                return ((f)object).toString();
            }
            String string = this.v((String)object[1], (String)object[0], ((String)charSequence).contains("\u539f\u756b"));
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append("uc getRealDownUrl MD5:");
            ((StringBuilder)object2).append(com.github.catvod.spider.merge.i0.m.b(string));
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            ConcurrentHashMap<String, String> concurrentHashMap = BaseApi.get().h;
            object2 = com.github.catvod.spider.merge.i0.m.b(string);
            Gson gson = new Gson();
            concurrentHashMap.put((String)object2, gson.toJson(this.w(string)));
            object2 = string;
            if (((String)charSequence).contains("\u539f\u756b")) {
                object2 = Server.y(string, this.n.b(), com.github.catvod.spider.merge.T.a.b(this.n.f()));
            }
            if (BaseApi.get().d.booleanValue()) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object[2]);
                ((StringBuilder)charSequence).append((String)object[3]);
                charSequence = ((StringBuilder)charSequence).toString();
                BaseApi.get().downloadFileWithDownloadManager((String)object2, (String)charSequence, this.w(null));
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("\u6b63\u5728\u4e0b\u8f7d ");
                ((StringBuilder)object2).append((String)charSequence);
                com.github.catvod.spider.merge.i0.m.y(((StringBuilder)object2).toString());
                charSequence = Server.B();
            } else {
                charSequence = NetPan.getIsoDownloadUrl((String)object2);
            }
            object2 = new f();
            ((f)object2).w((String)charSequence);
            ((f)object2).b(t.a.r((String[])object));
            ((f)object2).j();
            ((f)object2).v(this.D((String[])object));
            ((f)object2).g(this.w(null));
            return ((f)object2).toString();
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.i0.m.y(exception.getMessage());
            f f2 = new f();
            f2.w("");
            return f2.toString();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object[] M(Map<String, String> var1_1) {
        block20: {
            block17: {
                var8_2 = (String)var1_1.get("shareId");
                var7_3 = (String)var1_1.get("fileId");
                var6_4 = (String)var1_1.get("fileToken");
                if (com.github.catvod.spider.merge.R0.e.c(var8_2) || com.github.catvod.spider.merge.R0.e.c((CharSequence)var7_3) || com.github.catvod.spider.merge.R0.e.c(var6_4)) break block17;
                synchronized (this) {
                    block19: {
                        block18: {
                            var2_5 = new StringBuilder();
                            var2_5.append(var8_2);
                            var2_5.append("_");
                            var2_5.append((String)var7_3);
                            var5_6 = var2_5.toString();
                            var2_5 = (String[])this.a.get(var5_6);
                            if (var2_5 == null || System.currentTimeMillis() - Long.parseLong(var2_5[1]) >= 240000L) break block18;
                            var2_5 = var2_5[0];
                            break block19;
                        }
                        var3_7 = this.O(var8_2, (String)var7_3, var6_4, false);
                        var2_5 = var3_7;
                        if (com.github.catvod.spider.merge.R0.e.c((CharSequence)var3_7)) {
                            var2_5 = this.O(var8_2, (String)var7_3, var6_4, true);
                        }
                        if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)var2_5)) ** GOTO lbl-1000
                        var3_7 = "";
                        try {
                            var4_8 = this.B(var8_2, false);
                            if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)var4_8)) {
                                var3_7 = var4_8 = this.q(var8_2, (String)var4_8, "0", (String)var7_3, 0);
                            }
                        }
                        catch (Exception var9_9) {
                            var4_8 = new StringBuilder();
                            var4_8.append("UC\u514d\u8f6c\u5b58\u5237\u65b0\u6587\u4ef6 token \u5931\u8d25: ");
                            var4_8.append(var9_9.getMessage());
                            SpiderDebug.log((String)var4_8.toString());
                        }
                        if (com.github.catvod.spider.merge.R0.e.e((CharSequence)var3_7) && !var3_7.equals(var6_4)) {
                            L0.p.put((String)var7_3, (String)var3_7);
                            var3_7 = this.O(var8_2, (String)var7_3, (String)var3_7, false);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_7 = var2_5;
                        }
                        if (com.github.catvod.spider.merge.R0.e.e((CharSequence)var3_7)) {
                            this.a.put((String)var5_6, new String[]{var3_7, String.valueOf(System.currentTimeMillis())});
                        }
                        var2_5 = var3_7;
                        if (var3_7 == null) {
                            var2_5 = "";
                        }
                    }
                    ** if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)var2_5)) goto lbl52
                }
lbl51:
                // 1 sources

                return new Object[]{502, "text/plain; charset=utf-8", new ByteArrayInputStream("UC\u514d\u8f6c\u5b58\u64ad\u653e\u5730\u5740\u83b7\u53d6\u5931\u8d25".getBytes("UTF-8"))};
lbl52:
                // 1 sources

                var4_8 = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
                var3_7 = new StringBuilder();
                var3_7.append((String)var2_5);
                var3_7.append("\\ ");
                var4_8.put("Referer", var3_7.toString());
                var4_8.put("Accept-Encoding", "identity");
                var5_6 = Arrays.asList(new String[]{"Range", "Accept", "Accept-Language", "Connection"}).iterator();
                break block20;
            }
            return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("UC\u514d\u8f6c\u5b58\u53c2\u6570\u65e0\u6548".getBytes("UTF-8"))};
        }
        while (var5_6.hasNext()) {
            block16: {
                var6_4 = (String)var5_6.next();
                var3_7 = var1_1.entrySet().iterator();
                while (var3_7.hasNext()) {
                    var7_3 = (Map.Entry)var3_7.next();
                    if (!var6_4.equalsIgnoreCase((String)var7_3.getKey())) continue;
                    var3_7 = (String)var7_3.getValue();
                    break block16;
                }
                var3_7 = "";
            }
            if (!com.github.catvod.spider.merge.R0.e.e((CharSequence)var3_7)) continue;
            var4_8.put(var6_4, var3_7);
        }
        var2_5 = com.github.catvod.spider.merge.f0.d.e((String)var2_5, (Map<String, String>)var4_8);
        var4_8 = var2_5.header("Content-Type", "application/octet-stream");
        var3_7 = new HashMap<K, V>();
        var5_6 = var2_5.headers().names().iterator();
        while (true) {
            if (!var5_6.hasNext()) {
                return new Object[]{var2_5.code(), var4_8, var2_5.body().byteStream(), var3_7};
            }
            var1_1 = (String)var5_6.next();
            if ("Content-Type".equalsIgnoreCase((String)var1_1)) continue;
            var3_7.put(var1_1, var2_5.header((String)var1_1));
        }
    }

    public final void P(String string, boolean bl) {
        if (com.github.catvod.spider.merge.R0.e.c(this.n.c()) || bl) {
            com.github.catvod.spider.merge.B.e.d("set new Cookie:", string);
            String string2 = string;
            if (string != null) {
                string2 = string;
                if (string.startsWith("http")) {
                    string2 = com.github.catvod.spider.merge.f0.d.k(string).trim();
                }
            }
            this.n.k(string2);
            this.x();
            this.n.j();
            o = new HashMap<String, String>(512);
            p = new HashMap<String, String>(4096);
        }
    }

    public final void R(String string, boolean bl) {
        if (com.github.catvod.spider.merge.R0.e.c(this.n.g()) || bl) {
            com.github.catvod.spider.merge.B.e.d("set new Token:", string);
            String string2 = string;
            if (string != null) {
                string2 = string;
                if (string.startsWith("http")) {
                    string2 = com.github.catvod.spider.merge.f0.d.k(string).trim();
                }
            }
            this.n.o(string2);
            this.n.j();
            o = new HashMap<String, String>(512);
            p = new HashMap<String, String>(4096);
        }
    }

    public final void S(String string) {
        if (com.github.catvod.spider.merge.R0.e.c(this.n.h())) {
            com.github.catvod.spider.merge.B.e.d("setUt:", string);
            String string2 = string;
            if (string != null) {
                string2 = string;
                if (string.startsWith("http")) {
                    string2 = com.github.catvod.spider.merge.f0.d.k(string).trim();
                }
            }
            this.n.p(string2);
            this.n.j();
            o = new HashMap<String, String>(512);
            p = new HashMap<String, String>(4096);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String v(String var1_1, String var2_6, boolean var3_7) {
        this.g.lock();
        var5_8 = new Object();
        var5_8.append("getDownloadUrl... fileId:");
        var5_8.append((String)var1_1);
        var5_8.append(" shareId:");
        var5_8.append((String)var2_6);
        SpiderDebug.log((String)var5_8.toString());
        var6_9 = var1_1.split("_")[0];
        var8_10 = L0.o;
        var7_11 = new StringBuilder();
        var7_11.append(var6_9);
        var5_8 = var3_7 != false ? "#DL" : "#VI";
        var7_11.append((String)var5_8);
        var5_8 = (String)var8_10.get(var7_11.toString());
        if (var5_8 == null || (var4_12 = var5_8.isEmpty())) ** GOTO lbl-1000
        this.g.unlock();
        ** GOTO lbl53
        {
            catch (Throwable var1_2) {
            }
            catch (Exception var1_3) {}
            {
                var1_4 = new HashMap();
                var1_4.put("Cookie", this.n.c());
                var1_4 = com.github.catvod.spider.merge.f0.d.l("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", var1_4, null);
                var2_6 = new StringBuilder();
                var2_6.append("playerContent> ");
                var2_6.append((String)var1_4);
                SpiderDebug.log((String)var2_6.toString());
                try {
                    block14: {
                        var2_6 = new JSONObject((String)var1_4);
                        if (var2_6.getInt("status") != 401) break block14;
                        com.github.catvod.spider.merge.i0.m.y("\u5230\u914d\u7f6e\u4e2d\u5fc3\u914d\u7f6eUC cookie");
                        this.g.unlock();
                        var1_4 = new m0(this, 1);
                        ** GOTO lbl-1000
                    }
lbl46:
                    // 2 sources

                    while (true) {
                        this.g.unlock();
                        var1_4 = new G0(this, 0);
                        break;
                    }
                }
                catch (JSONException var1_5) {
                    ** continue;
                }
lbl-1000:
                // 2 sources

                {
                    Init.execute((Runnable)var1_4);
                    return "";
                }
lbl53:
                // 1 sources

                Init.execute(new F0(this, 0));
                return var5_8;
lbl-1000:
                // 1 sources

                {
                    if ("selfuc".equals(var2_6)) {
                        var2_6 = var1_1;
                    } else {
                        this.N((String)var2_6, "");
                        var2_6 = this.o((String)var1_1, (String)var2_6);
                    }
                    if (com.github.catvod.spider.merge.R0.e.d(this.n.g())) {
                        var1_1 = new StringBuilder();
                        var1_1.append(t.a.c);
                        var1_1.append("/api/uclink?fid=");
                        var1_1.append((String)var2_6);
                        var1_1.append("&refreshToken=");
                        var1_1.append(this.n.g());
                        var1_1 = com.github.catvod.spider.merge.f0.d.k(var1_1.toString());
                        this.Q();
                    } else {
                        var7_11 = new JSONObject();
                        var1_1 = new JSONArray();
                        var7_11.put("fids", var1_1.put((Object)var2_6));
                        var1_1 = com.github.catvod.spider.merge.R0.e.d(this.n.h()) != false ? this.n.h() : "Nk2oZFe20xVMub17UQTOKJdg4CHccNwuJJuwVL1gaHZIlw==";
                        var8_10 = new StringBuilder();
                        var8_10.append("1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.5&ut=");
                        var8_10.append((String)var1_1);
                        var1_1 = this.L(var8_10.toString(), (JSONObject)var7_11).a();
                        var7_11 = new StringBuilder();
                        var7_11.append("getDownloadUrl:");
                        var7_11.append((String)var5_8);
                        SpiderDebug.log((String)var7_11.toString());
                        var5_8 = new Object((String)var1_1);
                        var1_1 = var5_8.getJSONArray("data").getJSONObject(0).getString("download_url");
                    }
                    var5_8 = new Object();
                    var5_8.append("downloadUrl:");
                    var5_8.append(var1_1.contains("Expires="));
                    SpiderDebug.log((String)var5_8.toString());
                    var5_8 = new Object();
                    var5_8.append("downloadUrl:");
                    var5_8.append((String)var1_1);
                    SpiderDebug.log((String)var5_8.toString());
                    if (var1_1.contains("Expires=")) {
                        SpiderDebug.log((String)"getDownloadUrl timeshift:0");
                    }
                    var5_8 = L0.o;
                    var7_11 = new StringBuilder();
                    var7_11.append(var6_9);
                    var7_11.append("#DL");
                    var5_8.put(var7_11.toString(), var1_1);
                    var2_6 = this.A((String)var2_6);
                    var5_8 = L0.o;
                    var7_11 = new StringBuilder();
                    var7_11.append(var6_9);
                    var7_11.append("#VI");
                    var5_8.put((String)var7_11.toString(), (CharSequence)var2_6);
                    if (!var3_7) {
                        var1_1 = var2_6;
                    }
                    this.g.unlock();
                }
                Init.execute(new n0(this, 1));
                return var1_1;
            }
        }
        this.g.unlock();
        Init.execute(new H0(this, 0));
        throw var1_2;
    }

    public final HashMap<String, String> w(String string) {
        HashMap hashMap = r.e("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
        hashMap.put("Cookie", this.n.c());
        hashMap.put("Url", string);
        return hashMap;
    }

    public final void x() {
        try {
            HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
            JSONObject jSONObject = this.w("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home");
            CharSequence charSequence = new StringBuilder();
            charSequence.append("__pus=");
            charSequence.append(com.github.catvod.spider.merge.i0.m.j(jSONObject.get("Cookie")));
            charSequence = charSequence.toString();
            jSONObject.put((String)"Cookie", (String)charSequence);
            String string = com.github.catvod.spider.merge.f0.d.l("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", jSONObject, hashMap);
            b b2 = this.n;
            jSONObject = new JSONObject(string);
            b2.n(jSONObject.getJSONObject("data").getString("member_type"));
            this.n.k(com.github.catvod.spider.merge.i0.m.C(hashMap, (String)charSequence));
        }
        catch (Exception exception) {
            b b3 = this.n;
            a a2 = com.github.catvod.spider.merge.T.a.d;
            b3.n("NORMAL");
        }
    }

    public final List<String> z(String string) {
        CharSequence charSequence;
        StringBuilder stringBuilder;
        ArrayList<String> arrayList = new ArrayList<String>();
        if (NetPan.containNoTransFrom()) {
            stringBuilder = new StringBuilder();
            charSequence = "UC\u514d\u8f6c\u5b58\u539f\u756b";
        } else {
            stringBuilder = new StringBuilder();
            charSequence = "UC\u539f\u756b";
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append(string);
        arrayList.add(stringBuilder.toString());
        if (NetPan.containPuHua()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("UC\u666e\u756b");
            ((StringBuilder)charSequence).append(string);
            arrayList.add(((StringBuilder)charSequence).toString());
        }
        return arrayList;
    }
}

