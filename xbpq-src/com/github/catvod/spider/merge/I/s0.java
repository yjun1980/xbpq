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
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.K;
import com.github.catvod.spider.merge.I.S;
import com.github.catvod.spider.merge.I.c;
import com.github.catvod.spider.merge.I.g0;
import com.github.catvod.spider.merge.I.h;
import com.github.catvod.spider.merge.I.i;
import com.github.catvod.spider.merge.I.j0;
import com.github.catvod.spider.merge.I.k0;
import com.github.catvod.spider.merge.I.l;
import com.github.catvod.spider.merge.I.l0;
import com.github.catvod.spider.merge.I.m0;
import com.github.catvod.spider.merge.I.n0;
import com.github.catvod.spider.merge.I.p0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.r0;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.g;
import com.github.catvod.spider.merge.S.b;
import com.github.catvod.spider.merge.S.d;
import com.github.catvod.spider.merge.S.e;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import java.io.PrintStream;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
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

public final class s0 {
    private static Map<String, String> n;
    private static Map<String, String> o;
    private final Map<String, String> a;
    private final Map<String, String> b;
    private ScheduledExecutorService c;
    private final ReentrantLock d;
    private final ReentrantLock e;
    private final List<String> f;
    private AlertDialog g;
    private String h;
    private String i;
    private final Map<String, String> j = new ConcurrentHashMap<String, String>();
    private final Map<String, Long> k = new ConcurrentHashMap<String, Long>();
    private String l;
    public e m;

    s0() {
        this.d = new ReentrantLock(true);
        this.e = new ReentrantLock(true);
        this.f = new ArrayList<String>();
        try {
            this.m = com.github.catvod.spider.merge.S.e.h(com.github.catvod.spider.merge.c1.d.m(com.github.catvod.spider.merge.c.b.e("quark_user")));
        }
        catch (Exception exception) {
            com.github.catvod.spider.merge.i0.m.y("\u5938\u514b\u6388\u6743\u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u5220\u9664\u6839\u76ee\u5f55TV\u6587\u4ef6\u5939\u4e0b\u6388\u6743\u6587\u4ef6\u540e\u91cd\u8bd5");
        }
        this.t();
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("quark QuarkPanApi constructor user:");
        ((StringBuilder)serializable).append(this.m);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        serializable = new HashMap();
        this.a = serializable;
        ((HashMap)serializable).put("4K", "4k");
        ((HashMap)serializable).put("2k", "2k");
        ((HashMap)serializable).put("\u8d85\u6e05", "super");
        ((HashMap)serializable).put("\u9ad8\u6e05", "high");
        ((HashMap)serializable).put("\u6a19\u6e05", "low");
        ((HashMap)serializable).put("\u6d41\u66a2", "normal");
        serializable = new HashMap();
        this.b = serializable;
        ((HashMap)serializable).put("4kz", "\u5938\u514b\u539f\u756b");
        ((HashMap)serializable).put("4k", "4K");
        ((HashMap)serializable).put("2k", "2K");
        ((HashMap)serializable).put("super", "\u9ad8\u6e05");
        ((HashMap)serializable).put("high", "\u6a19\u6e05");
        ((HashMap)serializable).put("low", "\u6d41\u66a2");
        ((HashMap)serializable).put("normal", "\u666e\u901a");
        ((HashMap)serializable).put("auto", "\u5938\u514b\u666e\u756b");
        n = new HashMap<String, String>(512);
        o = new HashMap<String, String>(4096);
    }

    private void D(HashMap<String, String> hashMap, boolean bl, com.github.catvod.spider.merge.S.a a2, List<com.github.catvod.spider.merge.S.a> list, List<com.github.catvod.spider.merge.S.a> list2, List<com.github.catvod.spider.merge.S.a> list3, String string) {
        this.E(hashMap, bl, a2, list, list2, list3, string, 1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void E(HashMap<String, String> var1_1, boolean var2_3, com.github.catvod.spider.merge.S.a var3_4, List<com.github.catvod.spider.merge.S.a> var4_5, List<com.github.catvod.spider.merge.S.a> var5_6, List<com.github.catvod.spider.merge.S.a> var6_7, String var7_8, int var8_9) {
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
                var10_11.append("1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&pwd_id=");
                var10_11.append(var7_8);
                var10_11.append("&stoken=");
                var10_11.append(URLEncoder.encode(this.z(var7_8)));
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
                var10_11 = this.p(var10_11.toString());
                var9_10 = new StringBuilder();
                var9_10.append("listFiles >> ");
                var9_10.append((String)var10_11);
                SpiderDebug.log((String)var9_10.toString());
                var9_10 = new JSONObject((String)var10_11);
                var11_13 = com.github.catvod.spider.merge.S.a.q(var9_10.getJSONObject("data").toString());
                try {
                    if (var11_13.j().size() >= 1) {
                        com.github.catvod.spider.merge.S.d.a(var11_13.j());
                    }
                    ** GOTO lbl60
                }
                catch (Exception var10_12) {}
                {
                    var12_14 = new StringBuilder();
                    var12_14.append("listFiles error");
                    var12_14.append(var10_12.getMessage());
                    com.github.catvod.spider.merge.i0.m.y(var12_14.toString());
lbl60:
                    // 6 sources

                    for (Object var10_11 : var11_13.j()) {
                        if ("folder".equals(var10_11.p())) {
                            var6_7.add((com.github.catvod.spider.merge.S.a)var10_11);
                            continue;
                        }
                        if (!BaseApi.get().d.booleanValue() && !com.github.catvod.spider.merge.R0.e.d(com.github.catvod.spider.merge.i0.m.n(var10_11.k()))) {
                            if (!com.github.catvod.spider.merge.i0.m.t(var10_11.h())) continue;
                            var5_6.add((com.github.catvod.spider.merge.S.a)var10_11);
                            continue;
                        }
                        var10_11.r(var3_4.k());
                        var4_5.add((com.github.catvod.spider.merge.S.a)var10_11);
                    }
                    var10_11 = new Gson();
                    var9_10 = (com.github.catvod.spider.merge.S.c)var10_11.fromJson(var9_10.getJSONObject("metadata").toString(), com.github.catvod.spider.merge.S.c.class);
                    var8_9 = var9_10.c();
                    if ((var9_10.b() - 1) * var8_9 + var9_10.a() < var9_10.d()) {
                        this.E(var1_1, var2_3, (com.github.catvod.spider.merge.S.a)var3_4, var4_5, var5_6, var6_7, var7_8, var9_10.b() + 1);
                    }
                    if (!var2_3) return;
                    var3_4 = var6_7.iterator();
                    while (var3_4.hasNext()) {
                        this.D(var1_1, var2_3, (com.github.catvod.spider.merge.S.a)var3_4.next(), var4_5, var5_6, null, var7_8);
                    }
                    return;
                }
            }
        }
        var1_2.printStackTrace();
    }

    private com.github.catvod.spider.merge.f0.i I(String object, JSONObject jSONObject) {
        Object object2 = ((String)object).startsWith("https") ? object : com.github.catvod.spider.merge.B.e.c("https://drive-pc.quark.cn/", (String)object);
        Serializable serializable = new HashMap<String, List<String>>();
        HashMap<String, String> hashMap = this.s((String)object2);
        object = new com.github.catvod.spider.merge.f0.i();
        for (int i2 = 2; i2 > 0 && ((com.github.catvod.spider.merge.f0.i)(object = com.github.catvod.spider.merge.f0.d.j((String)object2, jSONObject.toString(), hashMap, serializable))).a().length() <= 10; --i2) {
            Thread.sleep(500L);
        }
        String string = this.F((Map<String, List<String>>)((Object)serializable));
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("quark post url:");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(" headers:");
        ((StringBuilder)serializable).append(hashMap);
        ((StringBuilder)serializable).append(" postBody:");
        ((StringBuilder)serializable).append(jSONObject.toString());
        ((StringBuilder)serializable).append(" newcookie:");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(" result:,");
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
    private boolean J(String charSequence, String object) {
        boolean bl = this.e.tryLock();
        Object object2 = 0L;
        if (bl) {
            Throwable throwable2222222;
            block11: {
                block12: {
                    CharSequence charSequence2 = (String)((ConcurrentHashMap)this.j).get(charSequence);
                    if (charSequence2 != null && System.currentTimeMillis() < ((ConcurrentHashMap)this.k).getOrDefault(charSequence, (Long)object2)) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("use cached SToken...");
                        ((StringBuilder)charSequence).append((String)charSequence2);
                        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                        this.e.unlock();
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
                        for (int i2 = 3; i2 > 0 && com.github.catvod.spider.merge.R0.e.c(this.m.d()); --i2) {
                            Thread.sleep(1000L);
                        }
                    }
                    {
                        object2 = new JSONObject();
                        object2.put("pwd_id", (Object)charSequence);
                        object2.put("passcode", object);
                        object = this.I("1/clouddrive/share/sharepage/token?pr=ucpro&fr=pc", (JSONObject)object2);
                        JSONObject jSONObject = new JSONObject(((com.github.catvod.spider.merge.f0.i)object).a());
                        object2 = System.out;
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append("resultJson");
                        ((StringBuilder)charSequence2).append(jSONObject);
                        ((PrintStream)object2).println(((StringBuilder)charSequence2).toString());
                        if (jSONObject.getInt("status") != 401) {
                            object = ((com.github.catvod.spider.merge.f0.i)object).a();
                            object2 = new JSONObject((String)object);
                            this.h = object2.getJSONObject("data").getString("stoken");
                            object2 = new JSONObject((String)object);
                            this.i = object2.getJSONObject("data").getJSONObject("author").getString("avatar_url");
                            object = new StringBuilder();
                            ((StringBuilder)object).append("sToken: ");
                            ((StringBuilder)object).append(this.h);
                            SpiderDebug.log((String)((StringBuilder)object).toString());
                            ((ConcurrentHashMap)this.j).put((String)charSequence, this.h);
                            ((ConcurrentHashMap)this.k).put((String)charSequence, System.currentTimeMillis() + 3600000L);
                            this.e.unlock();
                            return true;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("cookie is invalid:");
                        ((StringBuilder)object).append(this.m.d());
                        SpiderDebug.log((String)((StringBuilder)object).toString());
                        object = new StringBuilder();
                        ((StringBuilder)object).append("cookie is invalid:");
                        ((StringBuilder)object).append(this.m.d());
                        com.github.catvod.spider.merge.i0.m.y(((StringBuilder)object).toString());
                        this.m.j("");
                        this.m.i();
                        ((ConcurrentHashMap)this.j).remove(charSequence);
                    }
                }
                this.e.unlock();
                return false;
            }
            this.e.unlock();
            throw throwable2222222;
        }
        object = (String)((ConcurrentHashMap)this.j).get(charSequence);
        if (object != null && System.currentTimeMillis() < ((ConcurrentHashMap)this.k).getOrDefault(charSequence, (Long)object2)) {
            com.github.catvod.spider.merge.B.e.d("use cached SToken (concurrent)...", (String)object);
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void L(String object) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.i0.m.e(240), com.github.catvod.spider.merge.i0.m.e(240));
            ImageView imageView = new ImageView((Context)Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.K1.d.b((String)object, 240, 2));
            object = new FrameLayout((Context)Init.context());
            layoutParams.gravity = 17;
            object.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
            imageView = new AlertDialog.Builder((Context)Init.getActivity());
            imageView = imageView.setView((View)object);
            object = new g0(this, 0);
            imageView = imageView.setOnCancelListener((DialogInterface.OnCancelListener)object);
            object = new j0(this, 0);
            object = imageView.setOnDismissListener((DialogInterface.OnDismissListener)object).show();
            this.g = object;
            imageView = object.getWindow();
            object = new ColorDrawable(0);
            imageView.setBackgroundDrawable((Drawable)object);
            com.github.catvod.spider.merge.i0.m.y("\u8acb\u4f7f\u7528\u5938\u514b App \u6383\u63cf\u4e8c\u7dad\u78bc");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void M() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new S(this, 1));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(s0 s02) {
        Objects.requireNonNull(s02);
        Iterator<String> iterator = new ArrayList<String>(s02.f).iterator();
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
                    object = s02.I("1/clouddrive/file/delete?pr=ucpro&fr=pc", (JSONObject)stringBuilder).a();
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
            ((ArrayList)s02.f).remove(string);
        }
    }

    public static void b(s0 s02) {
        s02.m();
        Init.execute(new k0(s02, 1));
    }

    public static void c(EditText object) {
        s0 s02 = r0.a;
        object = object.getText().toString();
        s02.m();
        Init.execute(new l0(s02, (String)object, 1));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(s0 object, String string, String string2) {
        Throwable throwable2222222;
        block4: {
            Objects.requireNonNull(object);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClassName("com.quark.browser", "com.ucpro.MainActivity");
            intent.setData(Uri.parse((String)string2));
            Init.getActivity().startActivity(intent);
            object = new K(object, string, 1);
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (Exception exception) {}
                {
                    ((s0)object).L(string2);
                    object = new i(object, string, 1);
                }
            }
            Init.execute((Runnable)object);
            return;
        }
        Init.execute(new l(object, string, 2));
        throw throwable2222222;
    }

    public static void e(s0 s02, EditText object) {
        Objects.requireNonNull(s02);
        object = object.getText().toString();
        s02.m();
        Init.execute(new h(s02, object, 2));
    }

    public static void f(s0 s02) {
        s02.M();
    }

    public static /* synthetic */ void g(s0 s02, String string) {
        Objects.requireNonNull(s02);
        try {
            Object object = new StringBuilder();
            ((StringBuilder)object).append("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=");
            ((StringBuilder)object).append(string);
            string = com.github.catvod.spider.merge.f0.d.k(((StringBuilder)object).toString());
            object = new JSONObject(string);
            if ("2000000".equals(object.getString("status"))) {
                object = new JSONObject(string);
                HashMap<String, List<String>> hashMap = object.getJSONObject("data").getJSONObject("members").getString("service_ticket");
                object = new StringBuilder();
                ((StringBuilder)object).append("serviceTicket>>");
                ((StringBuilder)object).append((String)((Object)hashMap));
                SpiderDebug.log((String)((StringBuilder)object).toString());
                object = new HashMap();
                Serializable serializable = new StringBuilder();
                ((StringBuilder)serializable).append("https://pan.quark.cn/account/info?st=");
                ((StringBuilder)serializable).append((String)((Object)hashMap));
                ((StringBuilder)serializable).append("&lw=scan");
                hashMap = com.github.catvod.spider.merge.f0.d.l(((StringBuilder)serializable).toString(), null, (Map<String, List<String>>)object);
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("respHeader");
                ((StringBuilder)serializable).append(object);
                SpiderDebug.log((String)((StringBuilder)serializable).toString());
                serializable = new JSONObject((String)((Object)hashMap));
                if (serializable.getBoolean("success")) {
                    object = s02.q((Map<String, List<String>>)object).toString();
                    hashMap = new HashMap<String, List<String>>();
                    serializable = new HashMap();
                    ((HashMap)serializable).put("Cookie", object);
                    com.github.catvod.spider.merge.f0.d.l("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", (Map<String, String>)((Object)serializable), hashMap);
                    com.github.catvod.spider.merge.i0.m.y(((Object)hashMap).toString());
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append((Object)s02.q(hashMap));
                    ((StringBuilder)serializable).append((String)object);
                    s02.K(((StringBuilder)serializable).toString(), true);
                    object = new StringBuilder();
                    ((StringBuilder)object).append("\u8bf7\u91cd\u65b0\u8fdb\u5165\u64ad\u653e\u9875\u3002\u3002\u3002");
                    ((StringBuilder)object).append(string);
                    com.github.catvod.spider.merge.i0.m.y(((StringBuilder)object).toString());
                    s02.M();
                }
            }
            return;
        }
        catch (JSONException jSONException) {
            s02.M();
            throw new RuntimeException(jSONException);
        }
    }

    public static void h(s0 s02, String string) {
        ScheduledExecutorService scheduledExecutorService;
        Objects.requireNonNull(s02);
        s02.c = scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new l0(s02, string, 0), 1L, 1L, TimeUnit.SECONDS);
    }

    public static void i(s0 s02) {
        s02.M();
    }

    public static /* synthetic */ void j(s0 s02) {
        s02.m();
    }

    private String k(String object, String string, boolean bl) {
        Object object2 = object;
        if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)object)) {
            Object object3 = new StringBuilder();
            ((StringBuilder)object3).append("Copy ... fileId:");
            ((StringBuilder)object3).append((String)object);
            SpiderDebug.log((String)((StringBuilder)object3).toString());
            object3 = ((String)object).split("_");
            Object object4 = (String)((HashMap)o).get(object3[0]);
            if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)object4)) {
                object3[1] = object4;
            }
            object4 = new JSONObject();
            object4.put("fid_list", (Object)new JSONArray().put((Object)object3[0]));
            object4.put("fid_token_list", (Object)new JSONArray().put((Object)object3[1]));
            object4.put("pwd_id", (Object)string);
            object4.put("stoken", (Object)this.z(string));
            object4.put("pdir_fid", (Object)"0");
            object3 = this.I("1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc", (JSONObject)object4).a();
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
                    ((StringBuilder)object).append("1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&pwd_id=");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("&stoken=");
                    ((StringBuilder)object).append(URLEncoder.encode(this.z(string)));
                    ((StringBuilder)object).append("&pdir_fid=0&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc");
                    object = this.p(((StringBuilder)object).toString());
                    object4 = new JSONObject((String)object);
                    object = object4.getJSONObject("data");
                    Object object5 = new ArrayList();
                    object4 = new ArrayList();
                    com.github.catvod.spider.merge.S.a a2 = new com.github.catvod.spider.merge.S.a(this.v("", (JSONObject)object));
                    this.D(null, true, a2, (List<com.github.catvod.spider.merge.S.a>)object5, (List<com.github.catvod.spider.merge.S.a>)object4, null, string);
                    object4 = ((ArrayList)object5).iterator();
                    object = "";
                    try {
                        while (object4.hasNext()) {
                            object5 = (com.github.catvod.spider.merge.S.a)object4.next();
                            ((HashMap)o).put(((com.github.catvod.spider.merge.S.a)object5).i(), ((com.github.catvod.spider.merge.S.a)object5).m());
                            if (!((com.github.catvod.spider.merge.S.a)object5).i().equals(object2)) continue;
                            object = ((com.github.catvod.spider.merge.S.a)object5).b();
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        object = object3;
                    }
                    return this.k((String)object, string, true);
                }
                throw new Exception();
            }
            return new JSONObject((String)object3).getJSONObject("data").getString("task_id");
        }
        throw new Exception();
    }

    private String l(String string, String charSequence) {
        block9: {
            try {
                if (System.currentTimeMillis() / 1000L - this.m.f() < 1800L) {
                    SpiderDebug.log((String)"Obtain drive id... return cached drive");
                    if (com.github.catvod.spider.merge.R0.e.c(this.l)) {
                        this.l = this.m.e();
                    }
                } else {
                    SpiderDebug.log((String)"Obtain drive id...");
                    String string2 = this.p("1/clouddrive/share/sharepage/dir?pr=ucpro&fr=pc&aver=1");
                    Object object = new JSONObject(string2);
                    object = object.getJSONObject("data").getString("pdir_fid");
                    this.l = object;
                    this.m.k((String)object);
                    this.m.l(System.currentTimeMillis() / 1000L);
                    this.m.i();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            string = this.k(string, (String)charSequence, false);
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
                ((StringBuilder)charSequence).append("1/clouddrive/task?pr=ucpro&fr=pc&task_id=");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("&retry_index=");
                ((StringBuilder)charSequence).append(n2);
                if ((charSequence = new JSONObject(this.p(((StringBuilder)charSequence).toString()))).getInt("status") != 200) continue;
                if (charSequence.getJSONObject("data").getInt("status") == 2) {
                    string = charSequence.getJSONObject("data").getJSONObject("save_as").getJSONArray("save_as_top_fids").getString(0);
                    break block9;
                }
                n2 = n3;
            }
            string = "";
        }
        ((ArrayList)this.f).add(0, string);
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m() {
        try {
            AlertDialog alertDialog = this.g;
            if (alertDialog == null) return;
            alertDialog.dismiss();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private String n(String object, List<com.github.catvod.spider.merge.S.a> object2) {
        Object object3 = new ArrayList<Object>();
        String string = com.github.catvod.spider.merge.i0.m.z((String)object).toLowerCase();
        Iterator<com.github.catvod.spider.merge.S.a> iterator = object2.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            String string2 = com.github.catvod.spider.merge.i0.m.z(((com.github.catvod.spider.merge.S.a)object).k()).toLowerCase();
            if (!string.contains(string2) && !string2.contains(string)) continue;
            ((ArrayList)object3).add(object);
        }
        if (((ArrayList)object3).isEmpty()) {
            ((ArrayList)object3).addAll(object2);
        }
        object = new StringBuilder();
        object2 = ((ArrayList)object3).iterator();
        while (object2.hasNext()) {
            object3 = (com.github.catvod.spider.merge.S.a)object2.next();
            ((HashMap)o).put(((com.github.catvod.spider.merge.S.a)object3).i(), ((com.github.catvod.spider.merge.S.a)object3).m());
            ((StringBuilder)object).append("+");
            ((StringBuilder)object).append(com.github.catvod.spider.merge.i0.m.z(((com.github.catvod.spider.merge.S.a)object3).k()));
            ((StringBuilder)object).append("@@@");
            ((StringBuilder)object).append(((com.github.catvod.spider.merge.S.a)object3).h());
            ((StringBuilder)object).append("@@@");
            ((StringBuilder)object).append(((com.github.catvod.spider.merge.S.a)object3).b());
        }
        return ((StringBuilder)object).toString();
    }

    public static s0 o() {
        return r0.a;
    }

    private String p(String string) {
        CharSequence charSequence;
        String string2 = string.startsWith("https") ? string : com.github.catvod.spider.merge.B.e.c("https://drive-pc.quark.cn/", string);
        Serializable serializable = new HashMap<String, List<String>>();
        HashMap<String, String> hashMap = this.s(string2);
        string = null;
        for (int i2 = 2; i2 > 0; --i2) {
            string = com.github.catvod.spider.merge.f0.d.l(string2, hashMap, serializable);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("quark get result:");
            ((StringBuilder)charSequence).append(string);
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            if (string.length() > 10) break;
            Thread.sleep(500L);
        }
        charSequence = this.F((Map<String, List<String>>)((Object)serializable));
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("quark get url:");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(" headers:");
        ((StringBuilder)serializable).append(hashMap);
        ((StringBuilder)serializable).append(" newcookie:");
        ((StringBuilder)serializable).append((String)charSequence);
        ((StringBuilder)serializable).append(" result:");
        ((StringBuilder)serializable).append(string);
        SpiderDebug.log((String)((StringBuilder)serializable).toString());
        return string;
    }

    private StringBuilder q(Map<String, List<String>> object) {
        Object object2;
        Object object3;
        block6: {
            block5: {
                object3 = object.get("Set-Cookie");
                if (object3 == null) break block5;
                object2 = object3;
                if (object3.size() != 0) break block6;
            }
            object2 = object.get("set-cookie");
        }
        object = new StringBuilder();
        if (object2.size() > 0) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object3 = (String)object2.next();
                if (((String)object3).contains("ctoken")) continue;
                ((StringBuilder)object).append(((String)object3).split(";")[0]);
                ((StringBuilder)object).append("; ");
            }
        }
        return object;
    }

    private String v(String string, JSONObject jSONObject) {
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
     * Loose catch block
     */
    private String x(String string) {
        Object object = new JSONObject();
        object.put("fid", (Object)string);
        object.put("resolutions", (Object)"normal,low,high,super,2k,4k");
        object.put("supports", (Object)"fmp4,m3u8");
        string = this.I("1/clouddrive/file/v2/play?pr=ucpro&fr=pc", (JSONObject)object).a();
        object = new StringBuilder();
        ((StringBuilder)object).append("getPreviewVideoInfo:");
        ((StringBuilder)object).append(string);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object = new JSONObject(string);
        object = object.getJSONObject("data").getJSONArray("video_list");
        {
            catch (Exception exception) {
                return "";
            }
        }
        try {
            string = object.getJSONObject(0).getJSONObject("video_info").getString("url");
        }
        catch (Exception exception) {
            string = object.getJSONObject(object.length() - 1).getJSONObject("video_info").getString("url");
        }
        return string;
    }

    private String y(String string, String string2) {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("quark getRealDownUrl MD5:");
        stringBuilder.append(com.github.catvod.spider.merge.i0.m.b(string2));
        SpiderDebug.log((String)stringBuilder.toString());
        BaseApi.get().h.put(com.github.catvod.spider.merge.i0.m.b(string2), new Gson().toJson(this.s(string2)));
        boolean bl = string.contains("\u514d\u8f6c\u5b58");
        boolean bl2 = string.contains("\u539f\u756b");
        if (bl) {
            string = string2;
            if (bl2) {
                string = Server.y(string2, 8, 256);
            }
            return string;
        }
        string = string2;
        if (bl2) {
            string = Server.y(string2, this.m.c(), com.github.catvod.spider.merge.S.b.b(this.m.g()));
        }
        return string;
    }

    private String z(String string) {
        String string2;
        string = string2 = (String)((ConcurrentHashMap)this.j).get(string);
        if (string2 == null) {
            string = "";
        }
        return string;
    }

    public final List<g> A(String[] stringArray) {
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
     * Could not resolve type clashes
     */
    public final com.github.catvod.spider.merge.K.h B(String var1_1, String var2_5, String var3_6, String var4_7) {
        block25: {
            block24: {
                var8_8 = this.w("");
                var9_9 = new ArrayList<String>();
                var10_10 = new ArrayList<String>();
                for (var5_11 = 3; var5_11 > 0; --var5_11) {
                    if (com.github.catvod.spider.merge.R0.e.c(this.m.d())) {
                        Thread.sleep(1000L);
                        continue;
                    }
                    if (!this.j.isEmpty()) break;
                    continue;
                }
                this.J((String)var2_5, "");
                var7_12 = "0";
                if (com.github.catvod.spider.merge.R0.e.c((CharSequence)var3_6)) break block24;
                var7_12 = var3_6;
            }
            var11_13 /* !! */  = new StringBuilder();
            var11_13 /* !! */ .append("1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&pwd_id=");
            var11_13 /* !! */ .append((String)var2_5);
            var11_13 /* !! */ .append("&stoken=");
            var11_13 /* !! */ .append(URLEncoder.encode(this.z((String)var2_5)));
            var11_13 /* !! */ .append("&pdir_fid=");
            var11_13 /* !! */ .append((String)var7_12);
            var11_13 /* !! */ .append("&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc");
            var11_13 /* !! */  = this.p(var11_13 /* !! */ .toString());
            var7_12 = new JSONObject((String)var11_13 /* !! */ );
            var11_13 /* !! */  = var7_12.getJSONObject("data");
            var6_14 = com.github.catvod.spider.merge.R0.e.b((CharSequence)var4_7);
            if (!var6_14) ** GOTO lbl42
            var4_7 = com.github.catvod.spider.merge.i0.m.A(var11_13 /* !! */ .getJSONObject("share").getString("title"));
lbl42:
            // 2 sources

            var12_15 = new ArrayList();
            var7_12 = new ArrayList();
            var13_16 = new com.github.catvod.spider.merge.S.a(this.v((String)var3_6, (JSONObject)var11_13 /* !! */ ));
            var3_6 = var7_12;
            var7_12 = var4_7;
            this.D(null, true, (com.github.catvod.spider.merge.S.a)var13_16, (List<com.github.catvod.spider.merge.S.a>)var12_15, (List<com.github.catvod.spider.merge.S.a>)var3_6, null, (String)var2_5);
            var12_15 = var12_15.iterator();
            var4_7 = var3_6;
            var3_6 = var7_12;
            while (var12_15.hasNext()) {
                var7_12 = (com.github.catvod.spider.merge.S.a)var12_15.next();
                s0.o.put(var7_12.i(), var7_12.m());
                var13_16 = new Comparable<com.github.catvod.spider.merge.S.a>();
                var13_16.append(var7_12.e());
                var13_16.append("$");
                var13_16.append((String)var2_5);
                var13_16.append('+');
                var13_16.append(var7_12.b());
                var13_16.append('+');
                var13_16.append((String)var3_6);
                var13_16.append('+');
                var13_16.append(var7_12.k());
                var13_16.append(this.n(var7_12.k(), (List<com.github.catvod.spider.merge.S.a>)var4_7));
                var10_10.add(var13_16.toString());
            }
            var5_11 = 0;
            while (true) {
                var2_5 = (ArrayList)var8_8;
                if (var5_11 >= var2_5.size()) break;
                var2_5 = new Iterator<E>();
                var3_6 = var10_10.iterator();
                if (var3_6.hasNext()) {
                    while (true) {
                        var2_5.append((CharSequence)var3_6.next());
                        if (!var3_6.hasNext()) break;
                        var2_5.append("#");
                    }
                }
                var9_9.add(var2_5.toString());
                ++var5_11;
                continue;
                break;
            }
            var3_6 = new Iterator<E>();
            var3_6.l((String)var1_1);
            var3_6.j((String)var1_1);
            var3_6.n(this.i);
            var3_6.m(var11_13 /* !! */ .getJSONObject("share").getString("title"));
            var1_1 = new StringBuilder();
            var4_7 = var9_9.iterator();
            var6_14 = var4_7.hasNext();
            if (!var6_14) ** GOTO lbl118
            try {
                while (true) {
                    var1_1.append((CharSequence)var4_7.next());
                    if (!var4_7.hasNext()) break;
                    var1_1.append((CharSequence)"$$$");
                }
lbl118:
                // 2 sources

                var3_6.p(var1_1.toString());
                var1_1 = new StringBuilder();
                var2_5 = var2_5.iterator();
                if (var2_5.hasNext()) {
                    while (true) {
                        var1_1.append((CharSequence)var2_5.next());
                        if (!var2_5.hasNext()) break;
                        var1_1.append((CharSequence)"$$$");
                    }
                }
                var3_6.o(var1_1.toString());
            }
            catch (Exception var1_2) {}
            try {
                var3_6.g("\u5938\u514b\u96f2\u76e4");
                return var3_6;
            }
            catch (Exception var1_4) {
                ** continue;
            }
            break block25;
            catch (Exception var1_3) {
                // empty catch block
            }
        }
        return BaseApi.fakeVod(var8_8, "\u5938\u514b\u96f2\u76e4");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<com.github.catvod.spider.merge.K.h> C(com.github.catvod.spider.merge.K.i object) {
        Object object2;
        ArrayList<com.github.catvod.spider.merge.S.a> arrayList;
        String string;
        String string2;
        ArrayList<com.github.catvod.spider.merge.S.a> arrayList2;
        Object object3;
        Object object4;
        block13: {
            HashMap<String, String> hashMap;
            block14: {
                object4 = ((com.github.catvod.spider.merge.K.i)object).d();
                object3 = ((com.github.catvod.spider.merge.K.i)object).c();
                arrayList2 = ((com.github.catvod.spider.merge.K.i)object).f();
                string2 = ((com.github.catvod.spider.merge.K.i)object).e();
                string = ((com.github.catvod.spider.merge.K.i)object).b();
                hashMap = ((com.github.catvod.spider.merge.K.i)object).a();
                arrayList = new ArrayList<com.github.catvod.spider.merge.S.a>();
                object2 = new ArrayList();
                for (int i2 = 3; i2 > 0; --i2) {
                    try {
                        if (com.github.catvod.spider.merge.R0.e.c(this.m.d())) {
                            Thread.sleep(1000L);
                            continue;
                        }
                        if (!((ConcurrentHashMap)this.j).isEmpty()) break;
                        continue;
                    }
                    catch (Exception exception) {
                        object = arrayList2;
                        arrayList2 = arrayList;
                        break block13;
                    }
                }
                {
                    this.J((String)object3, (String)object4);
                    object = "0";
                    if (!com.github.catvod.spider.merge.R0.e.c(string)) {
                        object = string;
                    }
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append("1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc&pwd_id=");
                    ((StringBuilder)object4).append((String)object3);
                    ((StringBuilder)object4).append("&stoken=");
                    ((StringBuilder)object4).append(URLEncoder.encode(this.z((String)object3)));
                    ((StringBuilder)object4).append("&pdir_fid=");
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append("&force=0&_page=1&_size=50&_fetch_banner=1&_fetch_share=1&_fetch_total=1&_sort=file_type:asc,updated_at:desc");
                    object4 = this.p(((StringBuilder)object4).toString());
                    object = new JSONObject((String)object4);
                    object4 = object.getJSONObject("data");
                    object = arrayList2;
                    if (!com.github.catvod.spider.merge.R0.e.b((CharSequence)((Object)arrayList2))) break block14;
                    object = object4.getJSONObject("share").getString("title");
                }
            }
            try {
                arrayList2 = new ArrayList<com.github.catvod.spider.merge.S.a>();
            }
            catch (Exception exception) {
                arrayList2 = arrayList;
                break block13;
            }
            try {
                arrayList = new ArrayList<com.github.catvod.spider.merge.S.a>();
                com.github.catvod.spider.merge.S.a a2 = new com.github.catvod.spider.merge.S.a(this.v(string, (JSONObject)object4));
                this.D(hashMap, false, a2, arrayList2, arrayList, (List<com.github.catvod.spider.merge.S.a>)object2, (String)object3);
            }
            catch (Exception exception) {}
        }
        arrayList = new ArrayList();
        object2 = ((ArrayList)object2).iterator();
        while (object2.hasNext()) {
            com.github.catvod.spider.merge.S.a a3 = (com.github.catvod.spider.merge.S.a)object2.next();
            object4 = new com.github.catvod.spider.merge.K.h();
            StringBuilder stringBuilder = r.d((String)object3, "*#");
            stringBuilder.append(a3.i());
            stringBuilder.append("*#");
            stringBuilder.append(a3.k());
            ((com.github.catvod.spider.merge.K.h)object4).l(stringBuilder.toString());
            ((com.github.catvod.spider.merge.K.h)object4).m(a3.k());
            ((com.github.catvod.spider.merge.K.h)object4).r(a3.p());
            arrayList.add((com.github.catvod.spider.merge.S.a)((Object)((com.github.catvod.spider.merge.K.h)object4)));
        }
        object3 = arrayList2.iterator();
        while (object3.hasNext()) {
            com.github.catvod.spider.merge.S.a a4 = (com.github.catvod.spider.merge.S.a)object3.next();
            arrayList2 = new com.github.catvod.spider.merge.K.h();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append("*#");
            ((StringBuilder)object2).append((String)object);
            ((com.github.catvod.spider.merge.K.h)((Object)arrayList2)).l(((StringBuilder)object2).toString());
            ((com.github.catvod.spider.merge.K.h)((Object)arrayList2)).m(a4.e());
            ((com.github.catvod.spider.merge.K.h)((Object)arrayList2)).r(a4.p());
            ((com.github.catvod.spider.merge.K.h)((Object)arrayList2)).n(a4.o());
            arrayList.add((com.github.catvod.spider.merge.S.a)((Object)arrayList2));
        }
        return arrayList;
    }

    public final String F(Map<String, List<String>> object) {
        String[] stringArray;
        String[] stringArray2;
        block12: {
            block11: {
                stringArray2 = object.get("Set-Cookie");
                if (stringArray2 == null) break block11;
                stringArray = stringArray2;
                if (!stringArray2.isEmpty()) break block12;
            }
            stringArray = object.get("set-cookie");
        }
        stringArray2 = "";
        if (stringArray == null) {
            return "";
        }
        object = stringArray2;
        if (!stringArray.isEmpty()) {
            stringArray = stringArray.get(0).split(";");
            int n2 = stringArray.length;
            int n3 = 0;
            while (true) {
                object = stringArray2;
                if (n3 >= n2) break;
                object = stringArray[n3];
                if (((String)object).startsWith("__puus=")) {
                    object = ((String)object).substring(((String)object).indexOf("__puus=") + 7);
                    break;
                }
                ++n3;
            }
            stringArray2 = this.m.d();
            if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) {
                return stringArray2;
            }
            stringArray = this.m.d().split("; ");
            stringArray2 = new StringBuilder();
            for (String string : stringArray) {
                if (string.startsWith("__puus=")) {
                    stringArray2.append("__puus=");
                    stringArray2.append((String)object);
                } else {
                    stringArray2.append(string);
                }
                stringArray2.append("; ");
            }
            object = stringArray2.substring(0, stringArray2.length() - 2);
            this.m.j((String)object);
            this.m.i();
        }
        return object;
    }

    public final String G(String[] object) {
        if (object[0].startsWith("http")) {
            object = new f();
            ((f)object).w("");
            return ((f)object).toString();
        }
        f f2 = new f();
        Object object2 = r0.a;
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
        f2.v(this.A((String[])object));
        f2.g(this.s(null));
        return f2.toString();
    }

    public final String H(String[] object, String charSequence) {
        try {
            if (object[0].startsWith("http")) {
                object = new f();
                ((f)object).w("");
                return ((f)object).toString();
            }
            Object object2 = ((String)charSequence).contains("\u514d\u8f6c\u5b58") ? this.u((String)object[1], (String)object[0]) : this.r((String)object[1], (String)object[0], ((String)charSequence).contains("\u539f\u756b"));
            charSequence = this.y((String)charSequence, (String)object2);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object[2]);
            ((StringBuilder)object2).append((String)object[3]);
            object2 = ((StringBuilder)object2).toString();
            if (BaseApi.get().d.booleanValue()) {
                BaseApi.get().downloadFileWithDownloadManager((String)charSequence, (String)object2, this.s(null));
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u6b63\u5728\u4e0b\u8f7d ");
                ((StringBuilder)charSequence).append((String)object2);
                com.github.catvod.spider.merge.i0.m.y(((StringBuilder)charSequence).toString());
                charSequence = Server.B();
            } else {
                charSequence = NetPan.getIsoDownloadUrl((String)charSequence);
            }
            object2 = new f();
            ((f)object2).w((String)charSequence);
            ((f)object2).b(t.a.r((String[])object));
            ((f)object2).j();
            ((f)object2).v(this.A((String[])object));
            ((f)object2).g(this.s(null));
            object = ((f)object2).toString();
            return object;
        }
        catch (Exception exception) {
            object = new StringBuilder();
            ((StringBuilder)object).append("\u5938\u514b playerContent\uff1a");
            ((StringBuilder)object).append(exception);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new f();
            ((f)object).w("");
            return ((f)object).toString();
        }
    }

    public final void K(String string, boolean bl) {
        if (com.github.catvod.spider.merge.R0.e.c(this.m.d()) || bl) {
            com.github.catvod.spider.merge.B.e.d("set new Cookie:", string);
            String string2 = string;
            if (string != null) {
                string2 = string;
                if (string.startsWith("http")) {
                    string2 = com.github.catvod.spider.merge.f0.d.k(string).trim();
                }
            }
            this.m.j(string2);
            this.t();
            this.m.i();
            n = new HashMap<String, String>(512);
            o = new HashMap<String, String>(4096);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String r(String charSequence, String string, boolean bl) {
        Throwable throwable222222;
        block15: {
            CharSequence charSequence2;
            block14: {
                StringBuilder stringBuilder;
                Map<String, String> map;
                String string2;
                block12: {
                    block13: {
                        boolean bl2;
                        this.d.lock();
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append("getDownloadUrl... fileId:");
                        ((StringBuilder)charSequence2).append((String)charSequence);
                        ((StringBuilder)charSequence2).append(" shareId:");
                        ((StringBuilder)charSequence2).append(string);
                        SpiderDebug.log((String)((StringBuilder)charSequence2).toString());
                        string2 = ((String)charSequence).split("_")[0];
                        map = n;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(string2);
                        charSequence2 = bl ? "#DL" : "#VI";
                        stringBuilder.append((String)charSequence2);
                        charSequence2 = (String)((HashMap)map).get(stringBuilder.toString());
                        if (charSequence2 == null || (bl2 = ((String)charSequence2).isEmpty())) break block12;
                        this.d.unlock();
                        if ("selfquark".equals(string)) break block13;
                        Init.execute(new n0(this, 0));
                    }
                    return charSequence2;
                }
                if (!"selfquark".equals(string)) {
                    this.J(string, "");
                    charSequence = this.l((String)charSequence, string);
                }
                stringBuilder = new JSONObject();
                charSequence2 = new JSONArray();
                stringBuilder.put("fids", charSequence2.put(charSequence));
                charSequence2 = this.I("1/clouddrive/file/download?pr=ucpro&fr=pc", (JSONObject)stringBuilder).a();
                stringBuilder = new StringBuilder();
                stringBuilder.append("getDownloadUrl:");
                stringBuilder.append((String)charSequence2);
                SpiderDebug.log((String)stringBuilder.toString());
                stringBuilder = new JSONObject((String)charSequence2);
                charSequence2 = stringBuilder.getJSONArray("data").getJSONObject(0).getString("download_url");
                stringBuilder = new StringBuilder();
                stringBuilder.append("downloadUrl:");
                stringBuilder.append(((String)charSequence2).contains("Expires="));
                SpiderDebug.log((String)stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("downloadUrl:");
                stringBuilder.append((String)charSequence2);
                SpiderDebug.log((String)stringBuilder.toString());
                if (((String)charSequence2).contains("Expires=")) {
                    SpiderDebug.log((String)"getDownloadUrl timeshift:0");
                }
                map = n;
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("#DL");
                ((HashMap)map).put(stringBuilder.toString(), (String)charSequence2);
                charSequence = this.x((String)charSequence);
                stringBuilder = new StringBuilder();
                stringBuilder.append("resultJson:");
                stringBuilder.append((String)charSequence);
                SpiderDebug.log((String)stringBuilder.toString());
                map = n;
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("#VI");
                ((HashMap)map).put(stringBuilder.toString(), (String)charSequence);
                if (bl) {
                    charSequence = charSequence2;
                }
                this.d.unlock();
                if ("selfquark".equals(string)) break block14;
                Init.execute(new m0(this, 0));
            }
            return charSequence;
            {
                block16: {
                    catch (Throwable throwable222222) {
                        break block15;
                    }
                    catch (Exception exception) {}
                    {
                        block17: {
                            Object object = new HashMap();
                            ((HashMap)object).put("Cookie", this.m.d());
                            object = com.github.catvod.spider.merge.f0.d.l("https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", object, null);
                            charSequence2 = new StringBuilder();
                            ((StringBuilder)charSequence2).append("playerContent> ");
                            ((StringBuilder)charSequence2).append((String)object);
                            SpiderDebug.log((String)((StringBuilder)charSequence2).toString());
                            try {
                                charSequence2 = new JSONObject((String)object);
                                if (charSequence2.getInt("status") != 401) break block16;
                                com.github.catvod.spider.merge.i0.m.y("\u5230\u914d\u7f6e\u4e2d\u5fc3\u914d\u7f6e\u5938\u514b cookie");
                                this.d.unlock();
                                if ("selfquark".equals(string)) break block17;
                            }
                            catch (Exception exception) {
                                // empty catch block
                            }
                            Init.execute(new k0(this, 0));
                        }
                        return "";
                    }
                }
                this.d.unlock();
                if (!"selfquark".equals(string)) {
                    Init.execute(new c(this, 1));
                }
                return "";
            }
        }
        this.d.unlock();
        if (!"selfquark".equals(string)) {
            Init.execute(new p0(this, 0));
        }
        throw throwable222222;
    }

    public final HashMap<String, String> s(String string) {
        HashMap hashMap = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.2.0 Chrome/100.0.4896.160 Electron/18.3.5.17-1a44cfa97d Safari/537.36 Channel/pckk_other_ch", "Referer", "https://drive.quark.cn/");
        hashMap.put("Cookie", this.m.d());
        hashMap.put("Url", string);
        return hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void t() {
        try {
            HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
            JSONObject jSONObject = this.s("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("__pus=");
            stringBuilder.append(com.github.catvod.spider.merge.g.a.a(jSONObject.get("Cookie")));
            String string = stringBuilder.toString();
            jSONObject.put((String)"Cookie", (String)string);
            String string2 = com.github.catvod.spider.merge.f0.d.l("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&uc_param_str=&fetch_subscribe=true&_ch=home&fetch_identity=true", jSONObject, hashMap);
            e e2 = this.m;
            jSONObject = new JSONObject(string2);
            e2.m(jSONObject.getJSONObject("data").getString("member_type"));
            this.m.j(com.github.catvod.spider.merge.g.a.d(hashMap, string));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String u(String var1_1, String var2_4) {
        block19: {
            block17: {
                block18: {
                    try {
                        this.d.lock();
                        var4_5 = new Object();
                        var4_5.append("getNoTransferDownloadUrl... fileId:");
                        var4_5.append((String)var1_1);
                        var4_5.append(" shareId:");
                        var4_5.append((String)var2_4);
                        SpiderDebug.log((String)var4_5.toString());
                        var6_6 = var1_1.split("_")[0];
                        var4_5 = s0.n;
                        var5_7 = new StringBuilder();
                        var5_7.append(var6_6);
                        var5_7.append("#NT");
                        var4_5 = (String)var4_5.get(var5_7.toString());
                        if (var4_5 != null && !(var3_10 = var4_5.isEmpty())) {
                            this.d.unlock();
                            return var4_5;
                        }
                    }
                    catch (Exception var1_3) {
                        var2_4 = new StringBuilder();
                        var2_4.append("Quark getNoTransferDownloadUrl error: ");
                        var2_4.append(var1_3);
                        SpiderDebug.log((String)var2_4.toString());
                        break block17;
                    }
                    try {
                        this.J((String)var2_4, "");
                        var1_1 = var1_1.split("_");
                    }
                    catch (Throwable var1_2) {}
                    var7_11 = var1_1[0];
                    var4_5 = ((String[])var1_1).length > 1 ? var1_1[1] : (String)s0.o.get(var7_11);
                    try {
                        var5_7 = String.valueOf(System.currentTimeMillis());
                        var1_1 = new JSONObject();
                        var8_12 = new StringBuilder();
                        var8_12.append("300000");
                        var8_12.append((String)var5_7);
                        var1_1.put("conversation_id", (Object)var8_12.toString());
                        var1_1.put("conversation_type", 3);
                        var8_12 = new StringBuilder();
                        var8_12.append((String)var5_7);
                        var8_12.append("000");
                        var1_1.put("msg_id", (Object)var8_12.toString());
                        var5_7 = this.I("https://drive-social-api.quark.cn/1/clouddrive/chat/conv/file/acquire_dl_token?pr=ucpro&fr=pc&sys=darwin&ve=3.19", (JSONObject)var1_1);
                        var1_1 = new JSONObject(var5_7.a());
                        if (var1_1.optInt("code") != 0) break block18;
                        var1_1 = var1_1.optJSONObject("data").optString("token");
                    }
                    catch (Exception var5_9) {
                        var1_1 = "";
                        ** GOTO lbl-1000
                    }
                    try {
                        var5_7 = new StringBuilder();
                        var5_7.append("Successfully obtained Quark fast_token: ");
                        var5_7.append((String)var1_1);
                        SpiderDebug.log((String)var5_7.toString());
                        ** GOTO lbl87
                    }
                    catch (Exception var5_8) {
                        ** GOTO lbl-1000
                    }
                }
                var1_1 = "";
                ** GOTO lbl87
lbl-1000:
                // 2 sources

                {
                    var8_12 = new StringBuilder();
                    var8_12.append("Failed to obtain Quark fast_token: ");
                    var8_12.append(var5_7);
                    SpiderDebug.log((String)var8_12.toString());
lbl87:
                    // 3 sources

                    var5_7 = new JSONObject();
                    var8_12 = new JSONArray();
                    var5_7.put("fids", (Object)var8_12.put(var7_11));
                    var7_11 = new JSONArray();
                    var5_7.put("fids_token", (Object)var7_11.put(var4_5));
                    var5_7.put("pwd_id", (Object)var2_4);
                    var5_7.put("stoken", (Object)this.z((String)var2_4));
                    var5_7.put("speedup_session", (Object)"");
                    if (!com.github.catvod.spider.merge.R0.e.c((CharSequence)var1_1)) {
                        var5_7.put("token", var1_1);
                    }
                    if (((var2_4 = new JSONObject((var1_1 = this.I("1/clouddrive/file/download?pr=ucpro&fr=pc", (JSONObject)var5_7)).a())).optInt("status") == 200 || var2_4.optInt("code") == 0) && (var2_4 = var2_4.optJSONArray("data")) != null && var2_4.length() > 0) {
                        var1_1 = var2_4.getJSONObject(0).getString("download_url");
                        var2_4 = new StringBuilder();
                        var2_4.append("Quark no-transfer obtained download_url: ");
                        var2_4.append((String)var1_1);
                        SpiderDebug.log((String)var2_4.toString());
                        var4_5 = s0.n;
                        var2_4 = new StringBuilder();
                        var2_4.append(var6_6);
                        var2_4.append("#NT");
                        var4_5.put((String)var2_4.toString(), (Object)var1_1);
                        this.d.unlock();
                        return var1_1;
                    }
                    ** GOTO lbl123
                }
                {
                    break block19;
lbl123:
                    // 1 sources

                    var2_4 = new StringBuilder();
                    var2_4.append("Failed to obtain download_url directly: ");
                    var2_4.append(var1_1.a());
                    SpiderDebug.log((String)var2_4.toString());
                }
            }
            this.d.unlock();
            return "";
        }
        this.d.unlock();
        throw var1_2;
    }

    public final List<String> w(String string) {
        CharSequence charSequence;
        StringBuilder stringBuilder;
        ArrayList<String> arrayList = new ArrayList<String>();
        if (NetPan.containNoTransFrom()) {
            stringBuilder = new StringBuilder();
            charSequence = "\u5938\u514b\u514d\u8f6c\u5b58\u539f\u756b";
        } else {
            stringBuilder = new StringBuilder();
            charSequence = "\u5938\u514b\u539f\u756b";
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append(string);
        arrayList.add(stringBuilder.toString());
        if (NetPan.containPuHua()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("\u5938\u514b\u666e\u756b");
            ((StringBuilder)charSequence).append(string);
            arrayList.add(((StringBuilder)charSequence).toString());
        }
        return arrayList;
    }
}

