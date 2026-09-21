/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.Base64
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
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.I;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.J;
import com.github.catvod.spider.merge.I.N;
import com.github.catvod.spider.merge.I.Q;
import com.github.catvod.spider.merge.I.S;
import com.github.catvod.spider.merge.I.T;
import com.github.catvod.spider.merge.I.W;
import com.github.catvod.spider.merge.I.Z;
import com.github.catvod.spider.merge.I.f;
import com.github.catvod.spider.merge.I.h;
import com.github.catvod.spider.merge.I.l;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.x;
import com.github.catvod.spider.merge.K.i;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class X {
    private final Map<String, String> a = new ConcurrentHashMap<String, String>();
    private final Map<String, Long> b = new ConcurrentHashMap<String, Long>();
    private String c;
    private String d = UUID.randomUUID().toString().replace("-", "");
    public com.github.catvod.spider.merge.P.a e;
    private ScheduledExecutorService f;
    private AlertDialog g;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    X() {
        try {
            Object object = com.github.catvod.spider.merge.c1.d.m(com.github.catvod.spider.merge.c.b.e("guangya_user"));
            Gson gson = new Gson();
            com.github.catvod.spider.merge.P.a a2 = (com.github.catvod.spider.merge.P.a)gson.fromJson((String)object, com.github.catvod.spider.merge.P.a.class);
            object = a2;
            if (a2 == null) {
                object = new com.github.catvod.spider.merge.P.a();
            }
            this.e = object;
            return;
        }
        catch (Exception exception) {
            this.e = new com.github.catvod.spider.merge.P.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String A(String string, JSONObject jSONObject, boolean bl) {
        int n2;
        com.github.catvod.spider.merge.f0.i i2;
        block6: {
            block7: {
                int n3;
                StringBuilder stringBuilder;
                try {
                    i2 = com.github.catvod.spider.merge.f0.d.i(string, jSONObject.toString(), this.r());
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("\u5149\u9e2d\u4e91\u76d8 POST ");
                    stringBuilder.append(string);
                    stringBuilder.append(" body:");
                    stringBuilder.append(jSONObject);
                    stringBuilder.append(" result:");
                    stringBuilder.append(i2.a());
                    SpiderDebug.log((String)stringBuilder.toString());
                    if (!bl) return i2.a();
                    n2 = i2.b();
                    n3 = 1;
                    if (n2 == 401) {
                        n2 = n3;
                        break block6;
                    }
                    bl = com.github.catvod.spider.merge.R0.e.d(i2.a());
                    if (!bl) break block7;
                }
                catch (Exception exception) {
                    r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 POST \u5f02\u5e38: "));
                    return "";
                }
                try {
                    stringBuilder = new JSONObject(i2.a());
                    int n4 = stringBuilder.optInt("code", 200);
                    n2 = n3;
                    if (n4 == 401) break block6;
                    if (n4 != 207) break block7;
                    n2 = n3;
                }
                catch (Exception exception) {}
            }
            n2 = 0;
        }
        if (n2 == 0) return i2.a();
        if (!this.C()) return i2.a();
        return this.A(string, jSONObject, false);
    }

    private String B(JSONObject jSONObject) {
        return this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/file/delete_file", jSONObject, true);
    }

    private String D(String string, String string2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accessToken", (Object)string);
            string = new JSONArray();
            string.put((Object)string2);
            jSONObject.put("fileIds", (Object)string);
            jSONObject.put("parentId", (Object)"");
            string = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/restore_share", jSONObject, true);
            if (com.github.catvod.spider.merge.R0.e.d(string) && "success".equals((string2 = new JSONObject(string)).optString("msg"))) {
                string = string2.getJSONObject("data").optString("taskId", "");
                return string;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 restoreShare \u5f02\u5e38: "));
        }
        return "";
    }

    private void F(String object, String string) {
        com.github.catvod.spider.merge.B.e.d("\u5149\u9e2dToken\u83b7\u53d6\u6210\u529f: ", string);
        com.github.catvod.spider.merge.P.a a2 = this.e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append((String)object);
        a2.e(stringBuilder.toString());
        this.e.f(string);
        this.e.d();
        object = this.f;
        if (object != null) {
            object.shutdownNow();
        }
        Init.run(new T(this, 0));
    }

    private boolean H(String charSequence) {
        if (com.github.catvod.spider.merge.R0.e.b(charSequence)) {
            return true;
        }
        for (int i2 = 0; i2 < 20; ++i2) {
            block7: {
                JSONObject jSONObject;
                Object object = new JSONObject();
                object.put("taskId", (Object)charSequence);
                object = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/get_task_status", (JSONObject)object, true);
                if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)object) || !"success".equals((jSONObject = new JSONObject((String)object)).optString("msg"))) break block7;
                int n2 = jSONObject.getJSONObject("data").optInt("status", 0);
                if (n2 == 2) {
                    return true;
                }
                if (n2 != -1 && n2 != 3) break block7;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u5149\u9e2d\u4e91\u76d8 waitTaskDone \u4efb\u52a1\u5931\u8d25: ");
                ((StringBuilder)charSequence).append(n2);
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                return false;
            }
            try {
                Thread.sleep(500L);
                continue;
            }
            catch (Exception exception) {
                r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 waitTaskDone \u5f02\u5e38: "));
                break;
            }
        }
        return false;
    }

    public static void a(X x2) {
        x2.l();
        Init.execute(new S(x2, 0));
    }

    public static void b(X x2) {
        ScheduledExecutorService scheduledExecutorService = x2.f;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new T(x2, 0));
    }

    public static void c(X x2, String string) {
        ScheduledExecutorService scheduledExecutorService;
        Objects.requireNonNull(x2);
        x2.f = scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new f(x2, string, 1), 1L, 2L, TimeUnit.SECONDS);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void d(X x2, String object) {
        Objects.requireNonNull(x2);
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m.e(240), m.e(240));
            ImageView imageView = new ImageView((Context)Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.K1.d.b((String)object, 240, 2));
            object = new FrameLayout((Context)Init.context());
            layoutParams.gravity = 17;
            object.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
            AlertDialog.Builder builder2 = new AlertDialog.Builder((Context)Init.getActivity());
            builder2 = builder2.setView((View)object);
            object = new N(x2);
            object = builder2.setOnCancelListener((DialogInterface.OnCancelListener)object);
            Q q2 = new Q(x2);
            object = object.setOnDismissListener((DialogInterface.OnDismissListener)q2).show();
            x2.g = object;
            x2 = object.getWindow();
            object = new ColorDrawable(0);
            x2.setBackgroundDrawable((Drawable)object);
            m.y("\u8acb\u4f7f\u7528\u5149\u9e2d\u4e91\u76d8 App \u6216\u6d4f\u89c8\u5668\u6383\u63cf\u4e8c\u7dad\u78bc");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void e(X object) {
        Objects.requireNonNull(object);
        try {
            Object object2 = new JSONObject();
            object2.put("scope", (Object)"user");
            object2.put("client_id", (Object)"aMe-8VSlkrbQXpUR");
            Object object3 = com.github.catvod.spider.merge.f0.d.i("https://account.guangyapan.com/v1/auth/device/code", object2.toString(), super.r()).a();
            object2 = new JSONObject((String)object3);
            object3 = object2.getString("verification_uri_complete");
            object2 = object2.getString("device_code");
            J j2 = new J(object, object3, 1);
            Init.run(j2);
            object3 = new x(object, object2, 2);
            Init.execute((Runnable)object3);
        }
        catch (Exception exception) {
            object = com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u83b7\u53d6\u4e8c\u7ef4\u7801\u5931\u8d25: ");
            ((StringBuilder)object).append(exception.getMessage());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            m.y("\u5149\u9e2d\u83b7\u53d6\u4e8c\u7ef4\u7801\u5931\u8d25");
        }
    }

    public static void f(X x2) {
        ScheduledExecutorService scheduledExecutorService = x2.f;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new T(x2, 0));
    }

    public static void g(X x2, EditText object) {
        Objects.requireNonNull(x2);
        object = object.getText().toString();
        x2.l();
        Init.execute(new l(x2, (String)object, 1));
    }

    public static /* synthetic */ void h(X x2) {
        x2.l();
    }

    public static /* synthetic */ void i(X object, String string) {
        Objects.requireNonNull(object);
        try {
            Thread.sleep(905000L);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put((Object)string);
            jSONObject.put("fileIds", (Object)jSONArray);
            ((X)object).B(jSONObject);
            object = new StringBuilder();
            ((StringBuilder)object).append("\u5149\u9e2d\u4e91\u76d8 \u540e\u53f0\u81ea\u52a8\u5220\u9664\u4e34\u65f6\u8f6c\u5b58\u6587\u4ef6\u6210\u529f: ");
            ((StringBuilder)object).append(string);
            SpiderDebug.log((String)((StringBuilder)object).toString());
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 deleteFileDelayed \u5f02\u5e38: "));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void j(X x2, String string) {
        Objects.requireNonNull(x2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("grant_type", (Object)"urn:ietf:params:oauth:grant-type:device_code");
            jSONObject.put("device_code", (Object)string);
            jSONObject.put("client_id", (Object)"aMe-8VSlkrbQXpUR");
            string = com.github.catvod.spider.merge.f0.d.i("https://account.guangyapan.com/v1/auth/token", jSONObject.toString(), x2.r()).a();
            if (string.contains("access_token") && string.contains("refresh_token")) {
                jSONObject = new JSONObject(string);
                x2.F(jSONObject.getString("access_token"), jSONObject.getString("refresh_token"));
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private com.github.catvod.spider.merge.K.h k(String string, String string2) {
        com.github.catvod.spider.merge.K.h h2 = new com.github.catvod.spider.merge.K.h();
        h2.l(string);
        if (!com.github.catvod.spider.merge.R0.e.d(string2)) {
            string2 = "\u5149\u9e2d\u4e91\u76d8";
        }
        h2.m(string2);
        h2.j("\u65e0\u6cd5\u83b7\u53d6\u6587\u4ef6\u5217\u8868");
        h2.g("\u5149\u9e2d\u96f2\u76e4");
        return h2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l() {
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

    private String m(String string) {
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            return "";
        }
        try {
            Object object = new i();
            ((i)object).h("");
            ((i)object).i("");
            ((i)object).k("");
            ((i)object).l("");
            for (Object object2 : (ArrayList)Z.a.e((i)object)) {
                if (!m.A(object2.d()).equals(string) || !(object2 = object2.c()).contains("*#") || ((String[])(object2 = object2.split("\\*#"))).length <= 1) continue;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 findFileInRoot \u5f02\u5e38: "));
        }
        {
            Object object2;
            string = object2[1];
            return string;
            break;
        }
        return "";
    }

    public static X n() {
        return W.a;
    }

    private String o(String string, String string2) {
        String string3;
        block6: {
            string3 = (String)((ConcurrentHashMap)this.a).get(string);
            if (string3 == null) break block6;
            if (System.currentTimeMillis() >= ((ConcurrentHashMap)this.b).getOrDefault(string, 0L)) break block6;
            return string3;
        }
        try {
            string3 = new JSONObject();
            string3.put("shareId", (Object)string);
            if (com.github.catvod.spider.merge.R0.e.d(string2)) {
                string3.put("code", (Object)string2);
            }
            if (com.github.catvod.spider.merge.R0.e.d(string3 = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/get_share_access_token", (JSONObject)string3, true)) && "success".equals((string2 = new JSONObject(string3)).optString("msg"))) {
                string2 = string2.getJSONObject("data").getString("accessToken");
                ((ConcurrentHashMap)this.a).put(string, string2);
                ((ConcurrentHashMap)this.b).put(string, System.currentTimeMillis() + 3000000L);
                return string2;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 getAccessToken \u5f02\u5e38: "));
        }
        return "";
    }

    private JSONArray q(String string, String string2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageSize", 200);
            jSONObject.put("accessToken", (Object)string);
            jSONObject.put("parentId", (Object)string2);
            jSONObject.put("orderBy", 0);
            jSONObject.put("sortType", 0);
            string2 = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/get_share_page_files_list", jSONObject, true);
            if (com.github.catvod.spider.merge.R0.e.d(string2) && "success".equals((string = new JSONObject(string2)).optString("msg"))) {
                string = string.getJSONObject("data").optJSONArray("list");
                return string;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 getFilesList \u5f02\u5e38: "));
        }
        return new JSONArray();
    }

    private Map<String, String> r() {
        HashMap hashMap = com.github.catvod.spider.merge.A.c.b("Content-Type", "application/json", "User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
        hashMap.put("Referer", "https://www.guangyapan.com/");
        hashMap.put("Origin", "https://www.guangyapan.com");
        hashMap.put("dt", "4");
        hashMap.put("did", this.d);
        if (com.github.catvod.spider.merge.R0.e.d(this.e.b())) {
            hashMap.put("Authorization", this.e.b());
        }
        return hashMap;
    }

    private String s(String string) {
        block4: {
            Object object = new JSONObject();
            object.put("fileId", (Object)string);
            object = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/get_res_download_url", (JSONObject)object, true);
            if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)object) || !"success".equals((string = new JSONObject((String)object)).optString("msg"))) break block4;
            JSONObject jSONObject = string.getJSONObject("data");
            object = jSONObject.optString("signedURL", "");
            string = object;
            try {
                if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) {
                    string = jSONObject.optString("downloadUrl", "");
                }
                return string;
            }
            catch (Exception exception) {
                r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 getSelfDownloadUrl \u5f02\u5e38: "));
            }
        }
        return "";
    }

    private String u(String string) {
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            return "";
        }
        try {
            Object object = new JSONObject();
            object.put("taskId", (Object)string);
            object = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/file/get_info_by_task_id", (JSONObject)object, true);
            if (com.github.catvod.spider.merge.R0.e.d((CharSequence)object) && "success".equals((string = new JSONObject((String)object)).optString("msg"))) {
                string = string.getJSONObject("data").optString("fileId", "");
                return string;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 getTaskFileId \u5f02\u5e38: "));
        }
        return "";
    }

    private boolean x(JSONObject object) {
        String string = object.optString("mineType", "");
        object = object.optString("ext", "").toLowerCase();
        if (string.startsWith("video/")) {
            return true;
        }
        for (int i2 = 0; i2 < 15; ++i2) {
            if (!((String)object).equals((new String[]{".mp4", ".mkv", ".avi", ".wmv", ".flv", ".mov", ".rmvb", ".rm", ".3gp", ".ts", ".m4v", ".webm", ".mpg", ".mpeg", ".m2ts"})[i2])) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void y(String string, String charSequence, List<JSONObject> list, String string2) {
        try {
            JSONArray jSONArray = this.q(string, (String)charSequence);
            if (jSONArray == null) {
                return;
            }
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                boolean bl = jSONObject.optInt("resType") == 2;
                if (bl) {
                    String string3 = jSONObject.getString("fileName");
                    String string4 = jSONObject.getString("fileId");
                    charSequence = string3;
                    if (com.github.catvod.spider.merge.R0.e.d(string2)) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string2);
                        ((StringBuilder)charSequence).append("/");
                        ((StringBuilder)charSequence).append(string3);
                        charSequence = ((StringBuilder)charSequence).toString();
                    }
                    this.y(string, string4, list, (String)charSequence);
                    continue;
                }
                if (!this.x(jSONObject)) continue;
                charSequence = string2 != null ? string2 : "";
                jSONObject.put("_parentName", (Object)charSequence);
                list.add(jSONObject);
            }
            return;
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 listAllVideoFiles \u5f02\u5e38: "));
        }
    }

    final boolean C() {
        CharSequence charSequence;
        block4: {
            SpiderDebug.log((String)"\u5149\u9e2d\u4e91\u76d8 refreshAccessToken...");
            charSequence = this.e.c();
            if (!com.github.catvod.spider.merge.R0.e.b(charSequence)) break block4;
            return false;
        }
        try {
            Object object = this.r();
            ((HashMap)object).put("x-action", "401");
            Object object2 = new JSONObject();
            object2.put("client_id", (Object)"aMe-8VSlkrbQXpUR");
            object2.put("grant_type", (Object)"refresh_token");
            object2.put("refresh_token", (Object)charSequence);
            object2 = com.github.catvod.spider.merge.f0.d.i("https://account.guangyapan.com/v1/auth/token", object2.toString(), object).a();
            if (com.github.catvod.spider.merge.R0.e.d((CharSequence)object2) && ((String)object2).contains("access_token")) {
                object = new JSONObject((String)object2);
                object2 = object.getString("access_token");
                object = object.optString("refresh_token", (String)charSequence);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u5149\u9e2d\u4e91\u76d8 refreshAccessToken accessToken...");
                ((StringBuilder)charSequence).append((String)object2);
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                this.F((String)object2, (String)object);
                return true;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 refreshAccessToken \u5f02\u5e38: "));
        }
        return false;
    }

    public final JSONArray E(String string, String string2, String string3) {
        try {
            string = this.o(string, string2);
            if (com.github.catvod.spider.merge.R0.e.b(string)) {
                return new JSONArray();
            }
            string2 = new JSONObject();
            string2.put("accessToken", (Object)string);
            string2.put("keyword", (Object)string3);
            string2.put("page", 0);
            string2.put("pageSize", 100);
            string = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/share_page_search_files", (JSONObject)string2, true);
            if (com.github.catvod.spider.merge.R0.e.d(string) && "success".equals((string2 = new JSONObject(string)).optString("msg"))) {
                string = string2.optJSONObject("data").optJSONArray("list");
                return string;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 searchFiles \u5f02\u5e38: "));
        }
        return new JSONArray();
    }

    public final void G(String string, boolean bl) {
        if (com.github.catvod.spider.merge.R0.e.b(this.e.c()) || bl) {
            com.github.catvod.spider.merge.B.e.d("\u5149\u9e2d\u4e91\u76d8 setUser: ", string);
            String string2 = string;
            if (string != null) {
                string2 = string;
                if (string.startsWith("http")) {
                    try {
                        string2 = com.github.catvod.spider.merge.f0.d.k(string).trim();
                    }
                    catch (Exception exception) {
                        r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 setUser fetching error: "));
                        string2 = string;
                    }
                }
            }
            if (com.github.catvod.spider.merge.R0.e.d(string2)) {
                this.e.f(string2);
                this.e.d();
            }
        }
    }

    public final String p(String string, String charSequence, String string2) {
        block5: {
            string = this.o(string, string2);
            if (!com.github.catvod.spider.merge.R0.e.b(string)) break block5;
            return "";
        }
        try {
            string2 = new JSONObject();
            string2.put("fileId", (Object)charSequence);
            string2.put("accessToken", (Object)string);
            charSequence = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/get_share_download_url", (JSONObject)string2, true);
            if (com.github.catvod.spider.merge.R0.e.d(charSequence)) {
                string = new JSONObject((String)charSequence);
                if ("success".equals(string.optString("msg"))) {
                    return string.getJSONObject("data").optString("downloadUrl", "");
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u5149\u9e2d\u4e91\u76d8 \u4e0b\u8f7d\u5931\u8d25: ");
                ((StringBuilder)charSequence).append(string.optString("msg"));
                ((StringBuilder)charSequence).append(" code:");
                ((StringBuilder)charSequence).append(string.optInt("code"));
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                return "";
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 getDownloadUrl \u5f02\u5e38: "));
        }
        return "";
    }

    public final JSONObject t(String string, String string2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareId", (Object)string);
            if (com.github.catvod.spider.merge.R0.e.d(string2)) {
                jSONObject.put("code", (Object)string2);
            }
            if (com.github.catvod.spider.merge.R0.e.d(string = this.A("https://api.guangyapan.com/nd.bizuserres.s/v1/get_share_summary", jSONObject, true)) && "success".equals((string2 = new JSONObject(string)).optString("msg"))) {
                string = string2.optJSONObject("data");
                return string;
            }
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 getShareSummary \u5f02\u5e38: "));
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public final com.github.catvod.spider.merge.K.h v(String var1_1, String var2_2, String var3_7, String var4_8, String var5_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [25[UNCONDITIONALDOLOOP]], but top level block is 16[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<com.github.catvod.spider.merge.K.h> w(i object) {
        String string = ((i)object).d();
        String string2 = ((i)object).c();
        String string3 = ((i)object).f();
        String string4 = ((i)object).e();
        object = ((i)object).b();
        ArrayList<com.github.catvod.spider.merge.K.h> arrayList = new ArrayList<com.github.catvod.spider.merge.K.h>();
        try {
            boolean bl;
            Object object2 = this.o(string2, string);
            if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object2)) {
                return arrayList;
            }
            if ((com.github.catvod.spider.merge.R0.e.b(string3) || com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) && (string3 = this.t(string2, string)) != null) {
                string3.optString("title", "\u5149\u9e2d\u4e91\u76d8");
            }
            if (bl = com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) {
                object = "";
            }
            if ((string3 = this.q((String)object2, (String)object)) == null) {
                return arrayList;
            }
            for (int i2 = 0; i2 < string3.length(); ++i2) {
                Object object3 = string3.getJSONObject(i2);
                object2 = new com.github.catvod.spider.merge.K.h();
                string = object3.getString("fileName");
                object = object3.getString("fileId");
                int n2 = object3.optInt("resType");
                n2 = n2 == 2 ? 1 : 0;
                if (n2 != 0) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(string2);
                    ((StringBuilder)object3).append("*#");
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append("*#");
                    ((StringBuilder)object3).append(string);
                    ((com.github.catvod.spider.merge.K.h)object2).l(((StringBuilder)object3).toString());
                    ((com.github.catvod.spider.merge.K.h)object2).m(string);
                    object = "folder";
                } else {
                    if (!this.x((JSONObject)object3) && !BaseApi.get().d.booleanValue() && !com.github.catvod.spider.merge.R0.e.d(m.n(string))) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string4);
                    stringBuilder.append(object3.optString("parentId", ""));
                    stringBuilder.append("*#");
                    stringBuilder.append((String)object);
                    stringBuilder.append("*#");
                    stringBuilder.append(string);
                    ((com.github.catvod.spider.merge.K.h)object2).l(stringBuilder.toString());
                    ((com.github.catvod.spider.merge.K.h)object2).m(string);
                    object = "file";
                }
                ((com.github.catvod.spider.merge.K.h)object2).r((String)object);
                arrayList.add((com.github.catvod.spider.merge.K.h)object2);
            }
            return arrayList;
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 getVodFolder \u5f02\u5e38: "));
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String z(String object) {
        try {
            byte[] byArray = Base64.decode((String)object, (int)10);
            object = new String(byArray, StandardCharsets.UTF_8);
            JSONObject jSONObject = new JSONObject((String)object);
            String string = jSONObject.optString("shareId");
            object = jSONObject.optString("fileId");
            String string2 = jSONObject.optString("code");
            String string3 = jSONObject.optString("fileName");
            Object object2 = this.p(string, (String)object, string2);
            boolean bl = com.github.catvod.spider.merge.R0.e.d((CharSequence)object2);
            if (bl) {
                object = new JSONObject();
                object.put("parse", 0);
                object.put("url", object2);
                JSONObject jSONObject2 = new JSONObject();
                object.put("header", (Object)jSONObject2);
                return object.toString();
            }
            if (!com.github.catvod.spider.merge.R0.e.d(this.e.b())) return "";
            SpiderDebug.log((String)"\u5149\u9e2d\u4e91\u76d8 \u76f4\u94fe\u76f4\u63a5\u83b7\u53d6\u5931\u8d25\uff0c\u5c1d\u8bd5\u901a\u8fc7\u8f6c\u5b58\u4e2a\u4eba\u76d8\u83b7\u53d6...");
            String string4 = this.o(string, string2);
            if (!com.github.catvod.spider.merge.R0.e.d(string4)) return "";
            if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)(object = this.D(string4, (String)object)))) return "";
            if (!this.H((String)object)) return "";
            String string5 = this.u((String)object);
            object = string5;
            if (com.github.catvod.spider.merge.R0.e.b(string5)) {
                object = string5;
                if (com.github.catvod.spider.merge.R0.e.d(string3)) {
                    object = this.m(string3);
                }
            }
            if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)object)) return "";
            String string6 = this.s((String)object);
            if (!com.github.catvod.spider.merge.R0.e.d(string6)) return "";
            if (!com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) {
                h h2 = new h(this, object, 1);
                object2 = new Thread(h2);
                ((Thread)object2).start();
            }
            object = new JSONObject();
            object.put("parse", 0);
            object.put("url", (Object)string6);
            JSONObject jSONObject3 = new JSONObject();
            object.put("header", (Object)jSONObject3);
            return object.toString();
        }
        catch (Exception exception) {
            r.f(exception, com.github.catvod.spider.merge.C.a.c("\u5149\u9e2d\u4e91\u76d8 playerContent \u5f02\u5e38: "));
            return "";
        }
    }
}

