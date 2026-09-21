/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.SharedPreferences$Editor
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.merge.ka.b
 *  com.google.gson.Gson
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.dp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.dp.a;
import com.github.catvod.spider.merge.dp.b;
import com.github.catvod.spider.merge.dp.d;
import com.github.catvod.spider.merge.dp.e;
import com.github.catvod.spider.merge.dp.f;
import com.github.catvod.spider.merge.dp.g;
import com.github.catvod.spider.merge.dp.h;
import com.github.catvod.spider.merge.dp.i;
import com.github.catvod.spider.merge.dp.j;
import com.github.catvod.spider.merge.dp.k;
import com.github.catvod.spider.merge.dp.l;
import com.github.catvod.spider.merge.dp.m;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.dp.o;
import com.github.catvod.spider.merge.ka.c;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class p {
    public static JSONObject l;
    private final Map<String, String> a;
    private final List<String> b;
    private AlertDialog c;
    private String d;
    private String e;
    private String f;
    private com.github.catvod.spider.merge.ka.f g;
    private com.github.catvod.spider.merge.ka.g h;
    private String i = "2K";
    private boolean j = false;
    private String k;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    p() {
        Object object;
        String string = "";
        this.k = "";
        this.b = new ArrayList<String>();
        HashMap<String, String> hashMap = this.s();
        try {
            object = new FileInputStream((File)((Object)hashMap));
            hashMap = com.github.catvod.spider.merge.nz.l.e((InputStream)object);
        }
        catch (Exception exception) {
            hashMap = "";
        }
        this.g = com.github.catvod.spider.merge.ka.f.d((String)((Object)hashMap));
        object = this.x();
        try {
            hashMap = new HashMap<String, String>((File)object);
            hashMap = com.github.catvod.spider.merge.nz.l.e((InputStream)((Object)hashMap));
        }
        catch (Exception exception) {
            hashMap = string;
        }
        this.h = com.github.catvod.spider.merge.ka.g.f((String)((Object)hashMap));
        hashMap = new HashMap<String, String>();
        this.a = hashMap;
        hashMap.put(">2K<", "QHD");
        hashMap.put(">\u8d85\u6e05<", "FHD");
    }

    private void A(com.github.catvod.spider.merge.ka.e e2, List<com.github.catvod.spider.merge.ka.e> list, List<com.github.catvod.spider.merge.ka.e> list2) {
        this.B(e2, list, list2, "");
    }

    private void B(com.github.catvod.spider.merge.ka.e object, List<com.github.catvod.spider.merge.ka.e> list, List<com.github.catvod.spider.merge.ka.e> list2, String object2) {
        JSONObject object32 = new JSONObject();
        ArrayList<com.github.catvod.spider.merge.ka.e> arrayList = new ArrayList<com.github.catvod.spider.merge.ka.e>();
        object32.put("limit", 200);
        object32.put("share_id", (Object)this.f);
        object32.put("parent_file_id", (Object)((com.github.catvod.spider.merge.ka.e)((Object)object)).d());
        object32.put("order_by", (Object)"name");
        object32.put("order_direction", (Object)"ASC");
        if (((String)((Object)object2)).length() > 0) {
            object32.put("marker", (Object)object2);
        }
        object2 = this.l("adrive/v3/file/list", object32.toString(), true);
        com.github.catvod.spider.merge.ka.e e2 = (com.github.catvod.spider.merge.ka.e)new Gson().fromJson((String)((Object)object2), com.github.catvod.spider.merge.ka.e.class);
        for (com.github.catvod.spider.merge.ka.e e3 : e2.e()) {
            if (e3.h().equals("folder")) {
                arrayList.add(e3);
                continue;
            }
            if (!e3.a().equals("video") && !e3.a().equals("audio")) {
                if (!com.github.catvod.spider.merge.nz.o.d(e3.c())) continue;
                list2.add(e3);
                continue;
            }
            e3.i(((com.github.catvod.spider.merge.ka.e)((Object)object)).f());
            list.add(e3);
        }
        if (e2.g().length() > 0) {
            this.B((com.github.catvod.spider.merge.ka.e)((Object)object), list, list2, e2.g());
        }
        object = arrayList.iterator();
        while (object.hasNext()) {
            this.A((com.github.catvod.spider.merge.ka.e)object.next(), list, list2);
        }
    }

    private String C(String string, String string2, boolean bl) {
        if (!string.startsWith("https")) {
            string = n.a("https://open.aliyundrive.com/adrive/v1.0/", string);
        }
        Object object = this.q();
        ((HashMap)object).put((String)"authorization", (String)this.g.b());
        object = com.github.catvod.spider.merge.lq.b.f(string, string2, object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((com.github.catvod.spider.merge.lq.d)object).b());
        stringBuilder.append(",");
        stringBuilder.append(string);
        stringBuilder.append(",");
        stringBuilder.append(((com.github.catvod.spider.merge.lq.d)object).a());
        SpiderDebug.log((String)stringBuilder.toString());
        if (bl && (((com.github.catvod.spider.merge.lq.d)object).b() == 400 || ((com.github.catvod.spider.merge.lq.d)object).b() == 401)) {
            try {
                if (this.g.c().isEmpty()) {
                    bl = this.E();
                } else {
                    SpiderDebug.log((String)"refreshOpenToken...");
                    stringBuilder = new JSONObject();
                    stringBuilder.put("grant_type", "refresh_token");
                    stringBuilder.put("refresh_token", this.g.c());
                    bl = this.k("https://api-cf.nn.ci/alist/ali_open/token", (JSONObject)stringBuilder);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                com.github.catvod.spider.merge.ka.f f2 = this.g;
                f2.a();
                f2.e();
                bl = false;
            }
            if (bl) {
                return this.C(string, string2, false);
            }
        }
        return ((com.github.catvod.spider.merge.lq.d)object).a();
    }

    private boolean D(String string) {
        try {
            SpiderDebug.log((String)"OAuth Redirect...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object)string);
            jSONObject.put("grant_type", (Object)"authorization_code");
            boolean bl = this.k("https://api-cf.nn.ci/alist/ali_open/code", jSONObject);
            return bl;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            com.github.catvod.spider.merge.ka.f f2 = this.g;
            f2.a();
            f2.e();
            return false;
        }
    }

    private boolean E() {
        try {
            SpiderDebug.log((String)"OAuth Request...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("authorize", 1);
            jSONObject.put("scope", (Object)"user:base,file:all:read,file:all:write");
            String string = this.l("https://open.aliyundrive.com/oauth/users/authorize?client_id=76917ccccd4441c39457a04f6084fb2f&redirect_uri=https://alist.nn.ci/tool/aliyundrive/callback&scope=user:base,file:all:read,file:all:write&state=", jSONObject.toString(), true);
            jSONObject = new Gson();
            boolean bl = this.D(((com.github.catvod.spider.merge.ka.b)jSONObject.fromJson(string, com.github.catvod.spider.merge.ka.b.class)).a());
            return bl;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    private String G(String string, JSONObject object) {
        if (!string.startsWith("https")) {
            string = n.a("https://api.aliyundrive.com/", string);
        }
        object = com.github.catvod.spider.merge.lq.b.f(string, object.toString(), this.q());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((com.github.catvod.spider.merge.lq.d)object).b());
        stringBuilder.append(",");
        stringBuilder.append(string);
        stringBuilder.append(",");
        stringBuilder.append(((com.github.catvod.spider.merge.lq.d)object).a());
        SpiderDebug.log((String)stringBuilder.toString());
        return ((com.github.catvod.spider.merge.lq.d)object).a();
    }

    private boolean I() {
        String string;
        Object object;
        block22: {
            Object object2;
            try {
                SpiderDebug.log((String)"refreshAccessToken...");
                object2 = new JSONObject();
                object = this.d;
                string = object;
            }
            catch (Exception exception) {
                Object object3;
                if (this.d.length() > 0 && this.h.e().length() > 0 && !this.d.equals(this.h.e())) {
                    this.d = "";
                    if (this.I()) {
                        return true;
                    }
                }
                if (this.k.length() < 1) {
                    if (this.j) {
                        Init.show("\u914d\u7f6e\u7684token\u65e0\u6548\uff01");
                    }
                    object3 = Init.d.getString("ali_tk", "");
                    this.d = object3;
                    if (((String)object3).length() > 0) {
                        this.k = "sp";
                        if (this.I()) {
                            if (this.j) {
                                Init.show("\u4f7f\u7528\u7f13\u5b58token\u6210\u529f\uff01");
                            }
                            return true;
                        }
                    }
                }
                if ("\u6210\u529f".equals(this.k)) {
                    Init.show("\u626b\u7801\u7684token\u672a\u8d77\u4f5c\u7528\uff0c\u8bf7\u91cd\u8bd5\uff01");
                }
                if ("".equals(this.k) || "sp".equals(this.k)) {
                    if ("sp".equals(this.k)) {
                        Init.show("\u7f13\u5b58token\u5931\u6548!");
                    }
                    if ("".equals(this.k)) {
                        this.k = "sp";
                    }
                    object3 = this.h;
                    ((com.github.catvod.spider.merge.ka.g)object3).a();
                    ((com.github.catvod.spider.merge.ka.g)object3).g();
                    this.d = "";
                    this.N();
                    int n2 = com.github.catvod.spider.merge.nz.o.a;
                    boolean bl = Init.context().getPackageManager().hasSystemFeature("android.hardware.camera.any");
                    boolean bl2 = Init.context().getPackageManager().hasSystemFeature("android.hardware.telephony");
                    boolean bl3 = Init.context().getPackageManager().hasSystemFeature("android.hardware.bluetooth");
                    n2 = bl && bl2 && bl3 ? 1 : 0;
                    if (n2 != 0) {
                        Init.run(new a(this));
                    } else {
                        this.M();
                    }
                    if ("\u6210\u529f".equals(this.k) && this.I()) {
                        if (this.j) {
                            Init.show("Token\u6709\u6548\uff01");
                        }
                        return true;
                    }
                }
                return false;
            }
            if (((String)object).isEmpty()) {
                string = this.h.e();
            }
            object = string;
            if (string.startsWith("http")) {
                object = com.github.catvod.spider.merge.lq.b.h(string, null, null).trim();
            }
            object2.put("refresh_token", object);
            object2.put("grant_type", (Object)"refresh_token");
            string = this.G("https://auth.aliyundrive.com/v2/account/token", (JSONObject)object2);
            object2 = com.github.catvod.spider.merge.ka.g.f(string);
            ((com.github.catvod.spider.merge.ka.g)object2).g();
            this.h = object2;
            if (((com.github.catvod.spider.merge.ka.g)object2).b().isEmpty()) break block22;
            this.d = object;
            return true;
        }
        object = new Exception(string);
        throw object;
    }

    private void L(String string) {
        if (string.length() > 0) {
            SharedPreferences.Editor editor = Init.d.edit();
            editor.putString("ali_tk", string);
            editor.apply();
            this.d = string;
            this.h.h(string);
        }
        this.N();
    }

    private void M() {
        Init.run(new b(this, com.github.catvod.spider.merge.ka.c.g(com.github.catvod.spider.merge.lq.b.h("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null, null)).b().c()));
        while (this.d.length() < 1 && "sp".equals(this.k)) {
            SystemClock.sleep((long)500L);
        }
    }

    private void N() {
        Init.run(new m(this));
    }

    public static /* synthetic */ void a(p p2) {
        p2.M();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b(p p2, c c2) {
        p2.getClass();
        try {
            LinearLayout linearLayout = new LinearLayout((Context)Init.context());
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            linearLayout.setGravity(17);
            layoutParams = new TextView((Context)Init.context());
            layoutParams.setText((CharSequence)"\u963f\u91cc\u4e91\u76d8APP\u626b\u7801\u767b\u5f55");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(com.github.catvod.spider.merge.nz.o.a(240), com.github.catvod.spider.merge.nz.o.a(25));
            layoutParams.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
            layoutParams.setBackgroundColor(-1);
            layoutParams.setGravity(17);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.nz.o.a(240), com.github.catvod.spider.merge.nz.o.a(240));
            layoutParams2 = new ImageView((Context)Init.context());
            layoutParams2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            layoutParams2.setImageBitmap(com.github.catvod.spider.merge.Dw.i.c(c2.a()));
            FrameLayout frameLayout = new FrameLayout((Context)Init.context());
            layoutParams3.gravity = 17;
            frameLayout.addView((View)layoutParams2, (ViewGroup.LayoutParams)layoutParams3);
            linearLayout.addView((View)frameLayout);
            linearLayout.addView((View)layoutParams);
            layoutParams = new AlertDialog.Builder((Context)Init.getActivity());
            layoutParams = layoutParams.setView((View)linearLayout);
            e e2 = new e(p2, c2);
            c2 = layoutParams.setOnCancelListener((DialogInterface.OnCancelListener)e2);
            h h2 = new h(p2);
            c2 = c2.setOnDismissListener(h2).show();
            p2.c = c2;
            c2 = c2.getWindow();
            p2 = new ColorDrawable(0);
            c2.setBackgroundDrawable((Drawable)p2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void c(p p2, EditText object) {
        p2.getClass();
        object = object.getText().toString();
        p2.n();
        Init.execute(new d(p2, (String)object));
    }

    public static void d(p p2) {
        p2.getClass();
        for (String string : new ArrayList<String>(p2.b)) {
            boolean bl = false;
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Delete...");
                stringBuilder.append(string);
                SpiderDebug.log((String)stringBuilder.toString());
                int n2 = p2.l("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"drive_id\":\"%s\",\"file_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"%s\",\"method\":\"POST\",\"url\":\"/file/delete\"}],\"resource\":\"file\"}", p2.h.d(), string, string), true).length();
                if (n2 == 211) {
                    bl = true;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (!bl) continue;
            ((ArrayList)p2.b).remove(string);
        }
    }

    public static void e(p p2, String string) {
        block4: {
            block3: {
                block2: {
                    p2.getClass();
                    if (string.startsWith("http")) break block2;
                    if (string.length() == 32) break block3;
                    if (!string.contains(":")) break block4;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("http://");
                    stringBuilder.append(string);
                    stringBuilder.append("/proxy?do=ali&type=token");
                    string = stringBuilder.toString();
                }
                string = com.github.catvod.spider.merge.lq.b.h(string, null, null);
            }
            p2.L(string);
        }
    }

    public static /* synthetic */ void f(p p2) {
        p2.n();
    }

    public static void g(p p2, c object) {
        p2.getClass();
        object = com.github.catvod.spider.merge.ka.c.g(com.github.catvod.spider.merge.lq.b.e(((c)object).d())).b().c();
        if (object != null && ((c)object).f()) {
            object = ((c)object).e();
            p2.L((String)object);
            object = Init.d.getString("ali_tk", "").equals(object) ? "token\u7f13\u5b58\u6210\u529f\uff01" : "token\u7f13\u5b58\u5931\u8d25\uff01";
            Init.show((String)object);
            object = "\u6210\u529f";
        } else {
            p2.L("");
            object = "\u5931\u8d25";
        }
        p2.k = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void h(p p2) {
        p2.getClass();
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(com.github.catvod.spider.merge.nz.o.a(16), com.github.catvod.spider.merge.nz.o.a(16), com.github.catvod.spider.merge.nz.o.a(16), com.github.catvod.spider.merge.nz.o.a(16));
            FrameLayout frameLayout = new FrameLayout((Context)Init.context());
            EditText editText = new EditText((Context)Init.context());
            frameLayout.addView((View)editText, (ViewGroup.LayoutParams)layoutParams);
            AlertDialog.Builder builder2 = new AlertDialog.Builder((Context)Init.getActivity());
            builder2 = builder2.setTitle((CharSequence)"\u8bf7\u8f93\u5165Token").setView((View)frameLayout);
            f f2 = new f(p2);
            AlertDialog.Builder builder3 = builder2.setNeutralButton((CharSequence)"\u626b\u7801", (DialogInterface.OnClickListener)f2).setNegativeButton(0x1040000, null);
            g g2 = new g(p2, editText);
            p2.c = builder3.setPositiveButton(17039370, (DialogInterface.OnClickListener)g2).show();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void i(p p2) {
        p2.N();
    }

    public static void j(p p2) {
        p2.n();
        Init.execute(new i(p2, 1));
    }

    private boolean k(String object, JSONObject object2) {
        boolean bl;
        object2 = com.github.catvod.spider.merge.lq.b.f((String)object, object2.toString(), this.q());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((com.github.catvod.spider.merge.lq.d)object2).b());
        stringBuilder.append(",");
        stringBuilder.append((String)object);
        stringBuilder.append(",");
        stringBuilder.append(((com.github.catvod.spider.merge.lq.d)object2).a());
        SpiderDebug.log((String)stringBuilder.toString());
        if (!((com.github.catvod.spider.merge.lq.d)object2).a().contains("Too Many Requests")) {
            bl = false;
        } else {
            Init.show("\u6d17\u6d17\u7761\u5427\uff0cToo Many Requests\u3002");
            object = this.g;
            ((com.github.catvod.spider.merge.ka.f)object).a();
            ((com.github.catvod.spider.merge.ka.f)object).e();
            bl = true;
        }
        if (bl) {
            return false;
        }
        object = com.github.catvod.spider.merge.ka.f.d(((com.github.catvod.spider.merge.lq.d)object2).a());
        ((com.github.catvod.spider.merge.ka.f)object).e();
        this.g = object;
        return true;
    }

    private String l(String string, String string2, boolean bl) {
        if (!string.startsWith("https")) {
            string = n.a("https://api.aliyundrive.com/", string);
        }
        com.github.catvod.spider.merge.lq.d d2 = com.github.catvod.spider.merge.lq.b.f(string, string2, this.r());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d2.b());
        stringBuilder.append(",");
        stringBuilder.append(string);
        stringBuilder.append(",");
        stringBuilder.append(d2.a());
        SpiderDebug.log((String)stringBuilder.toString());
        if (bl && (d2.b() == 400 || d2.b() == 401) && this.I()) {
            return this.l(string, string2, false);
        }
        if (bl && d2.b() == 429) {
            return this.l(string, string2, false);
        }
        return d2.a();
    }

    private String m(String string) {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Copy...");
        ((StringBuilder)charSequence).append(string);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        charSequence = this.l("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", string, this.f, this.h.d()), true);
        if (((String)charSequence).contains("ForbiddenNoPermission.File")) {
            return this.m(string);
        }
        return new JSONObject((String)charSequence).getJSONArray("responses").getJSONObject(0).getJSONObject("body").getString("file_id");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        try {
            AlertDialog alertDialog = this.c;
            if (alertDialog == null) return;
            alertDialog.dismiss();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static p o() {
        return o.a;
    }

    private HashMap<String, String> r() {
        HashMap<String, String> hashMap = this.q();
        hashMap.put("authorization", this.h.c());
        hashMap.put("x-share-token", this.e);
        hashMap.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        return hashMap;
    }

    private String t(JSONObject jSONObject, String string) {
        if (!jSONObject.has("live_transcoding_task_list")) {
            return "";
        }
        JSONArray jSONArray = jSONObject.getJSONArray("live_transcoding_task_list");
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            if (!jSONObject2.getString("template_id").equals(((HashMap)this.a).get(string))) continue;
            return jSONObject2.getString("url");
        }
        if (string.equals(">2K<")) {
            return this.t(jSONObject, ">\u8d85\u6e05<");
        }
        return jSONArray.getJSONObject(0).getString("url");
    }

    private List<com.github.catvod.spider.merge.fb.e> u(JSONObject jSONObject) {
        if (!jSONObject.has("live_transcoding_subtitle_task_list")) {
            return Collections.emptyList();
        }
        jSONObject = jSONObject.getJSONArray("live_transcoding_subtitle_task_list");
        ArrayList<com.github.catvod.spider.merge.fb.e> arrayList = new ArrayList<com.github.catvod.spider.merge.fb.e>();
        for (int i2 = 0; i2 < jSONObject.length(); ++i2) {
            Object object = jSONObject.getJSONObject(i2);
            String string = object.getString("language");
            String string2 = object.getString("url");
            object = new com.github.catvod.spider.merge.fb.e();
            ((com.github.catvod.spider.merge.fb.e)object).d(string2);
            ((com.github.catvod.spider.merge.fb.e)object).c(string);
            ((com.github.catvod.spider.merge.fb.e)object).b(string);
            arrayList.add(((com.github.catvod.spider.merge.fb.e)object).a("vtt"));
        }
        return arrayList;
    }

    public final String F(String[] object, String string) {
        try {
            Object object2 = this.y(object[0]);
            string = this.t((JSONObject)object2, string);
            object = this.v((String[])object);
            object2 = this.u((JSONObject)object2);
            ((ArrayList)object).addAll(object2);
            object2 = new com.github.catvod.spider.merge.fb.d();
            ((com.github.catvod.spider.merge.fb.d)object2).i(string);
            ((com.github.catvod.spider.merge.fb.d)object2).h((List<com.github.catvod.spider.merge.fb.e>)object);
            ((com.github.catvod.spider.merge.fb.d)object2).a(this.q());
            object = ((com.github.catvod.spider.merge.fb.d)object2).toString();
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            com.github.catvod.spider.merge.fb.d d2 = new com.github.catvod.spider.merge.fb.d();
            d2.i("");
            return d2.toString();
        }
    }

    public final Object[] H(Map<String, String> object) {
        byte[] byArray = com.github.catvod.spider.merge.lq.b.b(this.p(object.get("file_id")), this.r()).body().bytes();
        int n2 = com.github.catvod.spider.merge.nz.o.a;
        Charset charset = Charset.forName("GBK");
        object = byArray;
        if (Arrays.equals(byArray, new String(byArray, charset).getBytes(charset))) {
            object = new String(byArray, Charset.forName("GBK")).getBytes("UTF-8");
        }
        return new Object[]{200, "application/octet-stream", new ByteArrayInputStream((byte[])object)};
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void J(String string) {
        String string2;
        block12: {
            String string3;
            block11: {
                block10: {
                    boolean bl = string.isEmpty();
                    string2 = "";
                    if (!bl) break block10;
                    string3 = "https://cat.colamint.club/ali-tokent";
                    break block11;
                }
                if (!string.contains("\u539f\u753b") && !string.contains(">\u539f\u753b<")) {
                    if (string.contains("\u8d85\u6e05") || string.contains(">\u8d85\u6e05<")) {
                        this.i = "\u8d85\u6e05";
                    }
                } else {
                    this.i = "\u539f\u753b";
                }
                if (string.contains("\u8c03\u8bd5\u6a21\u5f0f")) {
                    this.j = true;
                }
                string = string3 = string.replace("\u8d85\u6e05", "").replace("\u539f\u753b", "").replace(">2K<", "").replace("><", "").replace("\u666e\u753b", "").replace("\u8c03\u8bd5\u6a21\u5f0f", "");
                if (!string3.startsWith("http")) break block12;
            }
            string = com.github.catvod.spider.merge.lq.b.h(string3, null, null).replaceAll("[^A-Za-z0-9]", "");
        }
        if (string == null) {
            string = string2;
        }
        this.d = string;
    }

    public final void K(String string) {
        Object object;
        if (!this.s().exists()) {
            object = this.g;
            ((com.github.catvod.spider.merge.ka.f)object).a();
            ((com.github.catvod.spider.merge.ka.f)object).e();
        }
        if (!this.x().exists()) {
            object = this.h;
            ((com.github.catvod.spider.merge.ka.g)object).a();
            ((com.github.catvod.spider.merge.ka.g)object).g();
        }
        this.f = string;
        try {
            SpiderDebug.log((String)"refreshShareToken...");
            string = new JSONObject();
            string.put("share_id", (Object)this.f);
            string.put("share_pwd", (Object)"");
            string = this.G("v2/share_link/get_share_token", (JSONObject)string);
            object = new JSONObject(string);
            this.e = object.getString("share_token");
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Init.show("\u6765\u665a\u5566\uff0c\u8be5\u5206\u4eab\u5df2\u5931\u6548\u3002");
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String p(String object) {
        Throwable throwable2222222;
        block4: {
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("getDownloadUrl...");
            ((StringBuilder)charSequence).append((String)object);
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            ((ArrayList)this.b).add(0, this.m((String)object));
            object = new JSONObject();
            object.put("file_id", ((ArrayList)this.b).get(0));
            object.put("drive_id", (Object)this.h.d());
            object = this.C("openFile/getDownloadUrl", object.toString(), true);
            charSequence = new JSONObject((String)object);
            charSequence = charSequence.getString("url");
            object = new l(this);
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (Exception exception) {}
                {
                    exception.printStackTrace();
                    charSequence = "";
                    object = new l(this);
                }
            }
            Init.execute((Runnable)object);
            return charSequence;
        }
        Init.execute(new j(this, 0));
        throw throwable2222222;
    }

    public final HashMap<String, String> q() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        hashMap.put("Referer", "https://www.aliyundrive.com/");
        return hashMap;
    }

    public final File s() {
        return new File(Init.context().getCacheDir(), "aliyundrive_oauth");
    }

    public final List<com.github.catvod.spider.merge.fb.e> v(String[] stringArray) {
        ArrayList<com.github.catvod.spider.merge.fb.e> arrayList = new ArrayList<com.github.catvod.spider.merge.fb.e>();
        for (String string : stringArray) {
            if (!string.contains("@@@")) continue;
            Object object = string.split("@@@");
            String string2 = object[0];
            String string3 = object[1];
            CharSequence charSequence = new StringBuilder();
            charSequence.append(Proxy.getUrl());
            charSequence.append("?do=ali&type=sub&file_id=");
            charSequence.append(object[2]);
            charSequence = charSequence.toString();
            object = new com.github.catvod.spider.merge.fb.e();
            ((com.github.catvod.spider.merge.fb.e)object).c(string2);
            com.github.catvod.spider.merge.fb.e e2 = ((com.github.catvod.spider.merge.fb.e)object).a(string3);
            e2.d((String)charSequence);
            arrayList.add(e2);
        }
        return arrayList;
    }

    public final Object[] w() {
        return new Object[]{200, "text/plain", new ByteArrayInputStream(this.h.e().getBytes())};
    }

    public final File x() {
        return new File(Init.context().getCacheDir(), "aliyundrive_user");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject y(String string) {
        Throwable throwable2222222;
        block4: {
            CharSequence charSequence = new StringBuilder();
            charSequence.append("getVideoPreviewPlayInfo...");
            charSequence.append(string);
            SpiderDebug.log((String)charSequence.toString());
            ((ArrayList)this.b).add(0, this.m(string));
            string = new JSONObject();
            string.put("file_id", ((ArrayList)this.b).get(0));
            string.put("drive_id", (Object)this.h.d());
            string.put("category", (Object)"live_transcoding");
            string.put("url_expire_sec", (Object)"14400");
            charSequence = this.C("openFile/getVideoPreviewPlayInfo", string.toString(), true);
            string = new JSONObject((String)charSequence);
            string = string.getJSONObject("video_preview_play_info");
            {
                JSONObject jSONObject;
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (Exception exception) {}
                {
                    exception.printStackTrace();
                    jSONObject = new JSONObject();
                }
                Init.execute(new k(this, 0));
                return jSONObject;
            }
            Init.execute(new l(this));
            return string;
        }
        Init.execute(new i(this, 0));
        throw throwable2222222;
    }

    /*
     * Unable to fully structure code
     */
    public final com.github.catvod.spider.merge.fb.g z(String var1_1, String var2_2) {
        block22: {
            block21: {
                block20: {
                    var4_3 = var1_1;
                    var1_1 = new JSONObject();
                    var1_1.put("share_id", this.f);
                    var12_4 = new JSONObject(this.G("adrive/v3/share_link/get_share_by_anonymous", (JSONObject)var1_1));
                    var6_5 = new ArrayList<com.github.catvod.spider.merge.ka.e>();
                    var5_6 = new ArrayList();
                    var1_1 = var12_4.getJSONArray("file_infos");
                    if (!TextUtils.isEmpty((CharSequence)var2_2)) {
                        var1_1 = var2_2;
                    } else if (var1_1.length() == 0) {
                        while (true) {
                            var1_1 = "";
                            break;
                        }
                    } else if ((var1_1 = var1_1.getJSONObject(0)).getString("type").equals("folder")) {
                        var1_1 = var1_1.getString("file_id");
                    } else {
                        if (!var1_1.getString("type").equals("file") || !var1_1.getString("category").equals("video")) ** continue;
                        var1_1 = "root";
                    }
                    this.B(new com.github.catvod.spider.merge.ka.e((String)var1_1), (List<com.github.catvod.spider.merge.ka.e>)var6_5, (List<com.github.catvod.spider.merge.ka.e>)var5_6, "");
                    var1_1 = "\u8d85\u6e05".equals(this.i) != false ? Arrays.asList(new String[]{">\u8d85\u6e05<", ">\u539f\u753b<", ">2K<"}) : ("\u539f\u753b".equals(this.i) != false ? Arrays.asList(new String[]{">\u539f\u753b<", ">2K<", ">\u8d85\u6e05<"}) : Arrays.asList(new String[]{">2K<", ">\u539f\u753b<", ">\u8d85\u6e05<"}));
                    var2_2 = new ArrayList<E>();
                    var13_7 = new ArrayList<String>();
                    var7_8 = var6_5.iterator();
                    while (var7_8.hasNext()) {
                        var8_9 = var7_8.next();
                        var6_5 = new StringBuilder();
                        var6_5.append(var8_9.b());
                        var6_5.append("$");
                        var6_5.append(var8_9.d());
                        var9_10 = var8_9.f();
                        var8_9 = new ArrayList<E>();
                        var11_12 = com.github.catvod.spider.merge.nz.o.e((String)var9_10).toLowerCase();
                        var10_11 = var5_6.iterator();
                        while (var10_11.hasNext()) {
                            var14_13 = (com.github.catvod.spider.merge.ka.e)var10_11.next();
                            var9_10 = com.github.catvod.spider.merge.nz.o.e(var14_13.f()).toLowerCase();
                            if (!var11_12.contains(var9_10) && !var9_10.contains(var11_12)) continue;
                            var8_9.add(var14_13);
                        }
                        if (var8_9.isEmpty()) {
                            var8_9.addAll(var5_6);
                        }
                        var9_10 = new StringBuilder();
                        var8_9 = var8_9.iterator();
                        while (var8_9.hasNext()) {
                            var10_11 = (com.github.catvod.spider.merge.ka.e)var8_9.next();
                            var9_10.append("+");
                            var9_10.append(com.github.catvod.spider.merge.nz.o.e(var10_11.f()));
                            var9_10.append("@@@");
                            var9_10.append(var10_11.c());
                            var9_10.append("@@@");
                            var9_10.append(var10_11.d());
                        }
                        var6_5.append(var9_10.toString());
                        var2_2.add(var6_5.toString());
                    }
                    for (var3_14 = 0; var3_14 < var1_1.size(); ++var3_14) {
                        var13_7.add(TextUtils.join((CharSequence)"#", (Iterable)var2_2));
                    }
                    var14_13 = new com.github.catvod.spider.merge.fb.g();
                    var14_13.f(var4_3);
                    var15_15 = this.h.e();
                    var2_2 = p.l;
                    var6_5 = var2_2 != null ? var2_2.optString("desc") : "";
                    var2_2 = p.l;
                    var2_2 = var2_2 != null ? var2_2.optString("category") : "";
                    var5_6 = p.l;
                    var5_6 = var5_6 != null ? var5_6.optString("area") : "";
                    var7_8 = p.l;
                    var7_8 = var7_8 != null ? var7_8.optString("year") : "";
                    var8_9 = p.l;
                    var8_9 = var8_9 != null ? var8_9.optString("remark") : "";
                    var9_10 = p.l;
                    var9_10 = var9_10 != null ? var9_10.optString("director") : "";
                    var10_11 = p.l;
                    var10_11 = var10_11 != null ? var10_11.optString("actor") : "";
                    if (!this.j || var15_15.length() <= 0 || !Init.d.getString("ali_tk", "").equals(var15_15)) break block20;
                    var6_5 = new StringBuilder();
                    var11_12 = "\u6b63\u5728\u4f7f\u7528\u626b\u7801\u5b58\u50a8token\uff1a";
                    break block21;
                }
                if (!this.j || var15_15.length() <= 0) break block22;
                var6_5 = new StringBuilder();
                var11_12 = "\u6b63\u5728\u4f7f\u7528\u914d\u7f6e\u4e2d\u7684token\uff1a";
            }
            var6_5.append(var11_12);
            var6_5.append(var15_15);
            var6_5.append("\uff0c\u64ad\u653e");
            var6_5.append(var12_4.getString("share_name"));
            var6_5.append("\uff0c\u94fe\u63a5\uff1a");
            var6_5.append(var4_3);
            var4_3 = var6_5.toString();
            ** GOTO lbl-1000
        }
        if (var6_5.length() > 0) {
            var14_13.d((String)var6_5);
        } else lbl-1000:
        // 2 sources

        {
            var14_13.d(var4_3);
        }
        if (var9_10.length() > 0) {
            var14_13.e((String)var9_10);
        }
        if (var10_11.length() > 0) {
            var14_13.b((String)var10_11);
        }
        if (var2_2.length() > 0) {
            var14_13.a((String)var2_2);
        }
        if (var5_6.length() > 0) {
            var14_13.c((String)var5_6);
        }
        if (var7_8.length() > 0) {
            var14_13.l((String)var7_8);
        }
        if (var8_9.length() > 0) {
            var14_13.k((String)var8_9);
        }
        var14_13.h(var12_4.getString("avatar"));
        var14_13.g(var12_4.getString("share_name"));
        var14_13.j(TextUtils.join((CharSequence)"$$$", var13_7));
        var14_13.i(TextUtils.join((CharSequence)"$$$", var1_1));
        var14_13.a("\u963f\u91cc\u4e91\u76d8");
        return var14_13;
    }
}

