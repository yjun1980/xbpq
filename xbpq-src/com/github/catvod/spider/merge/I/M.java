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
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Response
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
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.E;
import com.github.catvod.spider.merge.I.F;
import com.github.catvod.spider.merge.I.G;
import com.github.catvod.spider.merge.I.H;
import com.github.catvod.spider.merge.I.I;
import com.github.catvod.spider.merge.I.J;
import com.github.catvod.spider.merge.I.K;
import com.github.catvod.spider.merge.I.L;
import com.github.catvod.spider.merge.I.d;
import com.github.catvod.spider.merge.I.e;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.x;
import com.github.catvod.spider.merge.O.a;
import com.github.catvod.spider.merge.O.b;
import com.github.catvod.spider.merge.O.c;
import com.github.catvod.spider.merge.O.h;
import com.github.catvod.spider.merge.O.j;
import com.github.catvod.spider.merge.i0.m;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Response;
import org.json.JSONObject;

public final class M {
    private ScheduledExecutorService a;
    private Map<String, String> b;
    private AlertDialog c;
    public String d;
    public boolean e;
    private boolean f;
    public j g;
    public j h;
    public Map<String, String> i = new HashMap<String, String>();

    public M() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        this.b = hashMap;
        hashMap.put("30280", "192000");
        ((HashMap)this.b).put("30232", "132000");
        ((HashMap)this.b).put("30216", "64000");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(M object, b b2) {
        Throwable throwable2222222;
        block6: {
            Objects.requireNonNull(object);
            Init.getActivity().startActivity(((M)object).p("tv.danmaku.bili", b2));
            object = new e(object, b2, 2);
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                catch (Exception exception) {}
                {
                    try {
                        Init.getActivity().startActivity(((M)object).p("com.bilibili.app.in", b2));
                    }
                    catch (Exception exception) {
                        ((M)object).t(b2);
                    }
                    object = new J(object, b2, 0);
                }
            }
            Init.execute((Runnable)object);
            return;
        }
        Init.execute(new x(object, b2, 1));
        throw throwable2222222;
    }

    public static void b(M m2) {
        m2.u();
    }

    public static /* synthetic */ void c(M m2, b object) {
        block8: {
            int n2;
            block9: {
                Objects.requireNonNull(m2);
                CharSequence charSequence = new StringBuilder();
                charSequence.append("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=");
                charSequence.append(((b)object).h());
                charSequence.append("&source=main_mini");
                Response response = com.github.catvod.spider.merge.f0.d.e(charSequence.toString(), m2.n());
                if (response == null) break block8;
                if (!response.isSuccessful()) break block8;
                object = response.headers().values("Set-Cookie");
                charSequence = response.body().string();
                response.close();
                response = new JSONObject((String)charSequence);
                charSequence = response.optJSONObject("data");
                if (charSequence == null) break block8;
                n2 = charSequence.optInt("code", -1);
                if (n2 != 0) break block9;
                m2.s((JSONObject)charSequence, (List<String>)object);
            }
            if (n2 == 86038) {
                m.y("\u4e8c\u7ef4\u7801\u5df2\u8fc7\u671f\uff0c\u8bf7\u91cd\u65b0\u8fdb\u5165\u83b7\u53d6");
                m2.u();
            }
            if (n2 != 86090) break block8;
            try {
                SpiderDebug.log((String)"Bili qrcode scanned, awaiting confirmation");
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(M m2) {
        Objects.requireNonNull(m2);
        try {
            AlertDialog alertDialog = m2.c;
            if (alertDialog == null) return;
            if (!alertDialog.isShowing()) return;
            m2.c.dismiss();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void e(M m2, b b2) {
        ScheduledExecutorService scheduledExecutorService = m2.a;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            m2.a.shutdownNow();
        }
        m2.a = scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new K(m2, b2, 0), 1L, 2L, TimeUnit.SECONDS);
    }

    public static void f(M m2) {
        m2.u();
    }

    private void i(a object, StringBuilder stringBuilder, String string) {
        for (c c2 : ((a)object).d()) {
            if (!c2.g().equals(string)) continue;
            stringBuilder.append(this.q(c2));
        }
    }

    public static M j() {
        return L.a;
    }

    private String k(c c2, String string) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(c2.g());
        charSequence.append("_");
        charSequence.append(c2.c());
        charSequence = charSequence.toString();
        String string2 = c2.h().split("/")[0];
        String string3 = c2.b().replace("&", "&amp;");
        return String.format(Locale.getDefault(), "<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%s\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%s\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>", string2, charSequence, c2.a(), c2.d(), c2.h(), string, c2.k(), string3, c2.j().a(), c2.j().b());
    }

    private Map<String, String> n() {
        return this.o("buvid3=84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc");
    }

    private Map<String, String> o(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (com.github.catvod.spider.merge.R0.e.d(string)) {
            hashMap.put("cookie", string);
        }
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        hashMap.put("Referer", "https://www.bilibili.com");
        return hashMap;
    }

    private Intent p(String string, b b2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName(string, "tv.danmaku.bili.ui.intent.IntentHandlerActivity");
        intent.setData(Uri.parse((String)b2.k()));
        return intent;
    }

    private String q(c c2) {
        block4: {
            String string;
            block3: {
                block2: {
                    if (!c2.h().startsWith("video")) break block2;
                    string = String.format(Locale.getDefault(), "height='%s' width='%s' frameRate='%s' sar='%s'", c2.f(), c2.l(), c2.e(), c2.i());
                    break block3;
                }
                if (!c2.h().startsWith("audio")) break block4;
                string = String.format("numChannels='2' sampleRate='%s'", ((HashMap)this.b).get(c2.g()));
            }
            return this.k(c2, string);
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void s(JSONObject object, List<String> object2) {
        String string;
        Object object32;
        Object object4 = new LinkedHashMap<String, String>();
        if (object2 != null) {
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                object32 = (String[])iterator.next();
                if (TextUtils.isEmpty((CharSequence)object32) || ((String[])(object32 = ((String)object32).split(";")[0].split("=", 2))).length != 2) continue;
                object4.put(object32[0].trim(), object32[1].trim());
            }
        }
        if (!TextUtils.isEmpty((CharSequence)(object = object.optString("url")))) {
            try {
                String string2 = Uri.parse((String)object).getQuery();
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    String[] stringArray = string2.split("&");
                    int n2 = stringArray.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        object32 = stringArray[i2].split("=", 2);
                        if (((String[])object32).length != 2 || object32[0].equals("ticket") || ((String)object32[0]).equals("gourl")) continue;
                        object4.put(((String)object32[0]).trim(), ((String)object32[1]).trim());
                    }
                }
            }
            catch (Exception exception) {}
            try {
                object = com.github.catvod.spider.merge.f0.d.e((String)object, this.o(""));
                if (object != null && object.isSuccessful()) {
                    for (Object object32 : object.headers().values("Set-Cookie")) {
                        if (TextUtils.isEmpty((CharSequence)object32) || ((Object)(object32 = ((String)object32).split(";")[0].split("=", 2))).length != 2) continue;
                        object4.put(((String)object32[0]).trim(), ((String)object32[1]).trim());
                    }
                    object.close();
                }
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
            }
        }
        if (!object4.containsKey("buvid3")) {
            object4.put("buvid3", "84B0395D-C9F2-C490-E92E-A09AB48FE26E71636infoc");
        }
        object = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap)object4).entrySet()) {
            ((StringBuilder)object).append((String)entry.getKey());
            ((StringBuilder)object).append("=");
            ((StringBuilder)object).append((String)entry.getValue());
            ((StringBuilder)object).append("; ");
        }
        this.d = string = ((StringBuilder)object).toString().trim();
        this.e = true;
        object = com.github.catvod.spider.merge.c.b.e("bilibili_user");
        object4 = string.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream((File)object);
            fileOutputStream.write((byte[])object4);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        m.y("B\u7ad9\u767b\u5f55\u6210\u529f\uff01");
        this.u();
        Init.execute(new d(this, 1));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void t(b object) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m.e(240), m.e(240));
            ImageView imageView = new ImageView((Context)Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.K1.d.b(((b)object).k(), 240, 2));
            G g2 = new G(object, 0);
            imageView.setOnClickListener((View.OnClickListener)g2);
            object = new FrameLayout((Context)Init.context());
            layoutParams.gravity = 17;
            object.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
            AlertDialog.Builder builder2 = new AlertDialog.Builder((Context)Init.getActivity());
            builder2 = builder2.setView((View)object);
            object = new E(this);
            object = builder2.setOnCancelListener((DialogInterface.OnCancelListener)object);
            F f2 = new F(this);
            object = object.setOnDismissListener((DialogInterface.OnDismissListener)f2).show();
            this.c = object;
            Window window = object.getWindow();
            object = new ColorDrawable(0);
            window.setBackgroundDrawable((Drawable)object);
            m.y("\u8acb\u4f7f\u7528 BiliBili App \u6383\u63cf\u4e8c\u7dad\u78bc");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void u() {
        ScheduledExecutorService scheduledExecutorService = this.a;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new H(this, 0));
    }

    public final void g() {
        this.h();
        boolean bl = this.e;
        if (!bl && !bl) {
            try {
                Object object = com.github.catvod.spider.merge.f0.d.k("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini");
                Object object2 = com.github.catvod.spider.merge.O.h.b((String)object).a();
                if (!TextUtils.isEmpty((CharSequence)((b)object2).k()) && !TextUtils.isEmpty((CharSequence)((b)object2).h())) {
                    object = new I(this, object2, 0);
                    Init.run((Runnable)object);
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Bili getQRCode failed: ");
                    ((StringBuilder)object2).append((String)object);
                    SpiderDebug.log((String)((StringBuilder)object2).toString());
                }
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
            }
        }
    }

    public final void h() {
        try {
            Object object = com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.l("https://api.bilibili.com/x/web-interface/nav", this.r(), null)).a();
            this.f = ((b)object).n();
            this.e = ((b)object).m();
            if (((b)object).l() != null) {
                this.g = ((b)object).l();
                this.h = ((b)object).l();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Bili checkLoginState -> login: ");
            ((StringBuilder)object).append(this.e);
            ((StringBuilder)object).append(", vip: ");
            ((StringBuilder)object).append(this.f);
            SpiderDebug.log((String)((StringBuilder)object).toString());
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
    }

    public final String l(String object, String charSequence, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://api.bilibili.com/x/player/playurl?avid=");
        stringBuilder.append((String)object);
        stringBuilder.append("&cid=");
        stringBuilder.append((String)charSequence);
        stringBuilder.append("&qn=");
        object = r.c(stringBuilder, string, "&fnval=4048&fourk=1");
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("playerContent:");
        ((StringBuilder)charSequence).append((String)object);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("getBigMember():");
        ((StringBuilder)charSequence).append(this.r());
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        object = com.github.catvod.spider.merge.O.h.b(new JSONObject(com.github.catvod.spider.merge.f0.d.l((String)object, this.r(), null)).toString()).a().a();
        StringBuilder stringBuilder2 = new StringBuilder();
        charSequence = new StringBuilder();
        for (c c2 : ((a)object).a()) {
            for (String string2 : ((HashMap)this.b).keySet()) {
                if (!c2.g().equals(string2)) continue;
                ((StringBuilder)charSequence).append(this.q(c2));
            }
        }
        this.i((a)object, stringBuilder2, string);
        boolean bl = stringBuilder2.length() == 0 && ((a)object).d().size() > 0;
        if (bl) {
            this.i((a)object, stringBuilder2, ((a)object).d().get(0).g());
        }
        string = stringBuilder2.toString();
        charSequence = ((StringBuilder)charSequence).toString();
        object = String.format(Locale.getDefault(), "<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT%sS\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", ((a)object).b(), ((a)object).c(), ((a)object).b(), string, charSequence);
        com.github.catvod.spider.merge.B.e.d("mpd", (String)object);
        return object;
    }

    public final void m() {
        b b2 = com.github.catvod.spider.merge.O.h.b(com.github.catvod.spider.merge.f0.d.l("https://api.bilibili.com/x/web-interface/nav", this.n(), null)).a();
        this.f = b2.n();
        this.e = b2.m();
        this.h = b2.l();
    }

    public final Map<String, String> r() {
        if (com.github.catvod.spider.merge.R0.e.b(this.d)) {
            return this.n();
        }
        return this.o(this.d);
    }
}

