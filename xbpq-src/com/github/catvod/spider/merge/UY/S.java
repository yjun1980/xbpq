/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.Base64
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 *  com.google.zxing.Binarizer
 *  com.google.zxing.BinaryBitmap
 *  com.google.zxing.LuminanceSource
 *  com.google.zxing.MultiFormatReader
 *  com.google.zxing.RGBLuminanceSource
 *  com.google.zxing.common.GlobalHistogramBinarizer
 */
package com.github.catvod.spider.merge.UY;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.N;
import com.github.catvod.spider.merge.UY.O;
import com.github.catvod.spider.merge.UY.P;
import com.github.catvod.spider.merge.UY.Q;
import com.github.catvod.spider.merge.UY.X;
import com.github.catvod.spider.merge.xc.A0.c;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.common.GlobalHistogramBinarizer;
import java.io.Serializable;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class S {
    public static final String[] i = new String[]{"4k", "2k", "super", "high", "normal", "low"};
    public volatile String a;
    public volatile String b;
    public volatile String c;
    public final HashMap d = new HashMap();
    public ScheduledExecutorService e;
    public AlertDialog f;
    public String g = "";
    public String h = "";

    public S() {
        this.f();
        if (com.github.catvod.spider.merge.xc.A0.c.b(this.a)) {
            this.a = H.a(String.valueOf(System.currentTimeMillis()));
            this.j();
        }
    }

    public static HashMap a(String string, String string2) {
        Serializable serializable = new StringBuilder("GET&");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append("&");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d");
        string = ((StringBuilder)serializable).toString();
        serializable = H.a;
        try {
            string = H.d(MessageDigest.getInstance("SHA-256").digest(string.getBytes(Charset.defaultCharset())));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
        serializable = m.k("Accept", "application/json, text/plain, */*", "User-Agent", "Mozilla/5.0 (Linux; U; Android 13; zh-cn; M2004J7AC Build/UKQ1.231108.001) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
        ((HashMap)serializable).put("x-pan-tm", string2);
        ((HashMap)serializable).put("x-pan-token", string);
        ((HashMap)serializable).put("x-pan-client-id", "5acf882d27b74502b7040b0c65519aa7");
        return serializable;
    }

    public static String d(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return H.a(stringBuilder.toString()).substring(0, 16);
    }

    public final HashMap b() {
        long l2 = System.currentTimeMillis();
        HashMap hashMap = m.k("req_id", S.d(this.a, String.valueOf(l2)), "app_ver", "1.7.2.2");
        hashMap.put("device_id", this.a);
        hashMap.put("device_brand", "Xiaomi");
        hashMap.put("platform", "tv");
        hashMap.put("device_name", "M2004J7AC");
        hashMap.put("device_model", "M2004J7AC");
        hashMap.put("build_device", "M2004J7AC");
        hashMap.put("build_product", "M2004J7AC");
        hashMap.put("device_gpu", "Adreno (TM) 550");
        hashMap.put("activity_rect", "{}");
        hashMap.put("channel", "UCTVOFFICIALWEB");
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = (Map)this.d.get("UC_TOKEN");
        if (object == null) {
            Collections.singletonMap("status", "EXPIRED");
            return;
        }
        HashMap<String, String> hashMap = String.valueOf(System.currentTimeMillis());
        Object object2 = S.d(this.a, (String)((Object)hashMap));
        hashMap = S.a("/oauth/code", (String)((Object)hashMap));
        object = (String)object.get("query_token");
        HashMap hashMap2 = m.j("req_id", (String)object2);
        object2 = com.github.catvod.spider.merge.xc.A0.c.c(this.b) ? this.b : "";
        hashMap2.put("access_token", object2);
        hashMap2.put("app_ver", "1.7.2.2");
        hashMap2.put("device_id", this.a);
        hashMap2.put("device_brand", "Xiaomi");
        hashMap2.put("platform", "tv");
        hashMap2.put("device_name", "M2004J7AC");
        hashMap2.put("device_model", "M2004J7AC");
        hashMap2.put("build_device", "M2004J7AC");
        hashMap2.put("build_product", "M2004J7AC");
        hashMap2.put("device_gpu", "Adreno (TM) 550");
        hashMap2.put("activity_rect", URLEncoder.encode("{}", "UTF-8"));
        hashMap2.put("channel", "UCTVOFFICIALWEB");
        hashMap2.put("client_id", "5acf882d27b74502b7040b0c65519aa7");
        hashMap2.put("scope", "netdisk");
        hashMap2.put("query_token", object);
        object2 = A.e("https://open-api-drive.uc.cn/oauth/code", hashMap2, hashMap);
        int n2 = ((X)object2).a;
        if (n2 == 200) {
            block5: {
                Exception exception2;
                block7: {
                    block6: {
                        object2 = ((X)object2).b();
                        try {
                            hashMap = C.R((String)object2).get("code").getAsString();
                            object2 = this.b();
                            ((HashMap)object2).put("code", hashMap);
                            hashMap = new HashMap<String, String>();
                            hashMap.put("Content-Type", "application/json");
                            object2 = A.k("http://api.extscreen.com/ucdrive/token", C.Z(object2), hashMap);
                            if (((X)object2).a != 200 || !(object2 = C.R(((X)object2).b())).has("code") || object2.get("code").getAsInt() != 200) break block5;
                            object2 = object2.get("data").getAsJsonObject();
                            this.b = object2.get("access_token").getAsString();
                            if (!object2.has("refresh_token") || object2.get("refresh_token").isJsonNull()) break block6;
                            this.c = object2.get("refresh_token").getAsString();
                        }
                        catch (Exception exception2) {
                            break block7;
                        }
                    }
                    this.j();
                    this.d.remove("UC_TOKEN");
                    this.n();
                    A.m("\u667a\u80fd\u753b\u8d28\u6388\u6743\u6210\u529f");
                    object2 = new Object();
                    ((HashMap)object2).put("status", "CONFIRMED");
                    ((HashMap)object2).put("cookie", this.b);
                    return;
                }
                m.m(exception2, new StringBuilder("[UCTV] \u5904\u7406\u626b\u7801\u6210\u529f\u5931\u8d25: "));
            }
            this.d.remove("UC_TOKEN");
            Collections.singletonMap("status", "EXPIRED");
            return;
        }
        if (n2 == 400) {
            Collections.singletonMap("status", "NEW");
            return;
        }
        this.d.remove("UC_TOKEN");
        Collections.singletonMap("status", "EXPIRED");
    }

    public final boolean e() {
        if (com.github.catvod.spider.merge.xc.A0.c.b(this.b)) {
            this.f();
        }
        return com.github.catvod.spider.merge.xc.A0.c.c(this.b);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        synchronized (this) {
            Throwable throwable22222;
            block10: {
                block9: {
                    Map map;
                    CharSequence charSequence;
                    block8: {
                        block7: {
                            charSequence = C.P("uctvtoken");
                            boolean bl = com.github.catvod.spider.merge.xc.A0.c.b(charSequence);
                            if (!bl) break block7;
                            return;
                        }
                        map = (Map)C.L((String)charSequence, Map.class);
                        if (map != null) break block8;
                        return;
                    }
                    try {
                        charSequence = map.get("access_token");
                        charSequence = charSequence != null ? charSequence.toString() : "";
                        this.b = charSequence;
                        charSequence = map.get("refresh_token");
                        charSequence = charSequence != null ? charSequence.toString() : "";
                        this.c = charSequence;
                        charSequence = map.get("device_id");
                        charSequence = charSequence != null ? charSequence.toString() : "";
                        this.a = charSequence;
                        break block9;
                    }
                    catch (Throwable throwable22222) {
                        break block10;
                    }
                    catch (Exception exception) {
                        charSequence = new StringBuilder("[UCTV] \u52a0\u8f7d Token \u5931\u8d25: ");
                        ((StringBuilder)charSequence).append(exception.getMessage());
                        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
                    }
                }
                return;
            }
            throw throwable22222;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        Object object = String.valueOf(System.currentTimeMillis());
        String string = S.d(this.a, (String)object);
        HashMap hashMap = S.a("/oauth/authorize", (String)object);
        Object object2 = m.j("req_id", string);
        boolean bl = com.github.catvod.spider.merge.xc.A0.c.c(this.b);
        String string2 = "";
        object = bl ? this.b : "";
        ((HashMap)object2).put("access_token", object);
        ((HashMap)object2).put("app_ver", "1.7.2.2");
        ((HashMap)object2).put("device_id", this.a);
        ((HashMap)object2).put("device_brand", "Xiaomi");
        ((HashMap)object2).put("platform", "tv");
        ((HashMap)object2).put("device_name", "M2004J7AC");
        ((HashMap)object2).put("device_model", "M2004J7AC");
        ((HashMap)object2).put("build_device", "M2004J7AC");
        ((HashMap)object2).put("build_product", "M2004J7AC");
        ((HashMap)object2).put("device_gpu", "Adreno (TM) 550");
        ((HashMap)object2).put("activity_rect", URLEncoder.encode("{}", "UTF-8"));
        ((HashMap)object2).put("channel", "UCTVOFFICIALWEB");
        ((HashMap)object2).put("auth_type", "code");
        ((HashMap)object2).put("client_id", "5acf882d27b74502b7040b0c65519aa7");
        ((HashMap)object2).put("scope", "netdisk");
        ((HashMap)object2).put("qrcode", "1");
        ((HashMap)object2).put("qr_width", "460");
        ((HashMap)object2).put("qr_height", "460");
        object2 = C.R(A.e("https://open-api-drive.uc.cn/oauth/authorize", (Map)object2, hashMap).b());
        object = object2.get("query_token").getAsString();
        this.g = object2.get("qr_data").getAsString();
        object = m.k("query_token", (String)object, "request_id", string);
        this.d.put("UC_TOKEN", object);
        object = this.g;
        try {
            object = Base64.decode((String)object, (int)2);
            object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)((Object)object).length);
        }
        catch (Exception exception) {
            object = null;
        }
        if (object == null) {
            object = string2;
        } else {
            try {
                int n2 = object.getWidth();
                int n3 = object.getHeight();
                object2 = new int[n2 * n3];
                object.getPixels((int[])object2, 0, n2, 0, 0, n2, n3);
                string = new RGBLuminanceSource(n2, n3, (int[])object2);
                object2 = new GlobalHistogramBinarizer((LuminanceSource)string);
                object = new BinaryBitmap((Binarizer)object2);
                string = new MultiFormatReader();
                object = string.decode((BinaryBitmap)object).getText();
            }
            catch (Exception exception) {
                object = string2;
            }
        }
        this.h = object;
        object = new StringBuilder("[UCTV] QR\u89e3\u7801URL: ");
        ((StringBuilder)object).append(this.h);
        SpiderDebug.log((String)((StringBuilder)object).toString());
    }

    public final void h() {
        if (com.github.catvod.spider.merge.xc.A0.c.b(this.c)) {
            SpiderDebug.log((String)"[UCTV] refresh_token \u4e3a\u7a7a\uff0c\u65e0\u6cd5\u5237\u65b0\uff0c\u8bf7\u91cd\u65b0\u626b\u7801");
            this.b = "";
            this.c = "";
            this.j();
            return;
        }
        Serializable serializable = this.b();
        ((HashMap)serializable).put("refresh_token", this.c);
        Object object = new HashMap<String, String>();
        ((HashMap)object).put("Content-Type", "application/json");
        object = A.k("http://api.extscreen.com/ucdrive/token", C.Z(serializable), object);
        if (((X)object).a == 200) {
            if ((object = C.R(((X)object).b())).has("code") && object.get("code").getAsInt() == 200) {
                object = object.get("data").getAsJsonObject();
                this.b = object.get("access_token").getAsString();
                if (object.has("refresh_token") && !object.get("refresh_token").isJsonNull()) {
                    this.c = object.get("refresh_token").getAsString();
                }
                this.j();
            } else {
                int n2 = object.has("code") ? object.get("code").getAsInt() : -1;
                object = object.has("message") ? object.get("message").getAsString() : "";
                serializable = new StringBuilder("[UCTV] \u5237\u65b0\u5931\u8d25: code=");
                ((StringBuilder)serializable).append(n2);
                ((StringBuilder)serializable).append(", msg=");
                ((StringBuilder)serializable).append((String)object);
                SpiderDebug.log((String)((StringBuilder)serializable).toString());
                this.b = "";
                this.c = "";
                this.j();
                A.m("\u667a\u753b\u6388\u6743\u5df2\u5931\u6548\uff0c\u8bf7\u91cd\u65b0\u626b\u7801");
            }
        } else {
            serializable = new StringBuilder("[UCTV] \u5237\u65b0 Token \u7f51\u7edc\u9519\u8bef: ");
            ((StringBuilder)serializable).append(((X)object).a);
            SpiderDebug.log((String)((StringBuilder)serializable).toString());
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String i(String object, String object2, boolean bl) {
        String string;
        block22: {
            Exception exception2;
            block21: {
                int n2;
                boolean bl2 = com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object);
                string = "";
                Object object3 = object;
                if (bl2) {
                    if (com.github.catvod.spider.merge.xc.A0.c.c(this.b)) {
                        object = this.b;
                    } else {
                        this.f();
                        if (com.github.catvod.spider.merge.xc.A0.c.c(this.b)) {
                            object = this.b;
                        } else if (com.github.catvod.spider.merge.xc.A0.c.c(this.c)) {
                            this.h();
                            object = this.b;
                        } else {
                            SpiderDebug.log((String)"[UCTV] \u65e0\u53ef\u7528token\uff0c\u8bf7\u91cd\u65b0\u626b\u7801\u6388\u6743");
                            object = "";
                        }
                    }
                    object3 = object;
                    if (com.github.catvod.spider.merge.xc.A0.c.b((CharSequence)object)) {
                        SpiderDebug.log((String)"[UCTV] \u65e0\u6cd5\u83b7\u53d6 token\uff0c\u8bf7\u91cd\u65b0\u626b\u7801\u6388\u6743");
                        return "";
                    }
                }
                Object object4 = String.valueOf(System.currentTimeMillis());
                object = S.a("/file", (String)object4);
                String string2 = S.d(this.a, (String)object4);
                object4 = new StringBuilder("https://open-api-drive.uc.cn/file?req_id=");
                ((StringBuilder)object4).append(string2);
                ((StringBuilder)object4).append("&access_token=");
                ((StringBuilder)object4).append((String)object3);
                ((StringBuilder)object4).append("&app_ver=1.7.2.2&device_id=");
                ((StringBuilder)object4).append(this.a);
                ((StringBuilder)object4).append("&device_brand=Xiaomi&platform=tv&device_name=M2004J7AC&device_model=M2004J7AC&build_device=M2004J7AC&build_product=M2004J7AC&device_gpu=");
                ((StringBuilder)object4).append(URLEncoder.encode("Adreno (TM) 550", "UTF-8"));
                ((StringBuilder)object4).append("&activity_rect=");
                ((StringBuilder)object4).append(URLEncoder.encode("{}", "UTF-8"));
                ((StringBuilder)object4).append("&channel=UCTVOFFICIALWEB&method=streaming&fid=");
                object3 = C.R(A.e(m.h((StringBuilder)object4, (String)object2, "&group_by=source&resolution=low,normal,high,super,2k,4k&support=dolby_vision"), new HashMap(), (Map)object).b());
                if (object3.has("errno")) {
                    n2 = object3.get("errno").getAsInt();
                    object = object3.has("errmsg") ? object3.get("errmsg").getAsString() : "";
                    if (!(n2 != 10001 && n2 != 10002 && n2 != 11001 && n2 != 401 || bl)) {
                        this.h();
                        if (com.github.catvod.spider.merge.xc.A0.c.c(this.b)) {
                            return this.i(this.b, (String)object2, true);
                        }
                        this.b = "";
                        this.c = "";
                        this.j();
                        SpiderDebug.log((String)"[UCTV] token\u5237\u65b0\u5931\u8d25\uff0c\u5df2\u6e05\u9664");
                        return "";
                    }
                    if (n2 != 0) {
                        object2 = new StringBuilder("[UCTV] \u8bf7\u6c42\u6587\u4ef6\u5931\u8d25: errno=");
                        ((StringBuilder)object2).append(n2);
                        ((StringBuilder)object2).append(", msg=");
                        ((StringBuilder)object2).append((String)object);
                        SpiderDebug.log((String)((StringBuilder)object2).toString());
                        return "";
                    }
                }
                if (!object3.has("data")) {
                    SpiderDebug.log((String)"[UCTV] parseFileResponse: \u54cd\u5e94\u65e0data\u5b57\u6bb5");
                    return string;
                }
                object = object3.get("data").getAsJsonObject();
                if (!object.has("video_info")) {
                    SpiderDebug.log((String)"[UCTV] parseFileResponse: \u672a\u627e\u5230\u5339\u914d\u7684method=streaming");
                    return string;
                }
                object3 = object.get("video_info").getAsJsonArray();
                try {
                    object2 = i;
                }
                catch (Exception exception2) {
                    break block21;
                }
                for (n2 = 0; n2 < 6; ++n2) {
                    object4 = object2[n2];
                    for (int i2 = 0; i2 < object3.size(); ++i2) {
                        string2 = object3.get(i2).getAsJsonObject();
                        object = string2.has("resolution") ? string2.get("resolution").getAsString() : "";
                        if (!((String)object4).equals(object)) continue;
                        return string2.get("url").getAsString();
                    }
                }
                {
                    if (object3.size() > 0) {
                        return object3.get(0).getAsJsonObject().get("url").getAsString();
                    }
                    break block22;
                }
            }
            m.m(exception2, new StringBuilder("[UCTV] \u89e3\u6790\u8f6c\u7801\u94fe\u63a5\u5931\u8d25: "));
        }
        SpiderDebug.log((String)"[UCTV] parseStreamingUrl: \u672a\u627e\u5230\u53ef\u7528\u8f6c\u7801\u94fe\u63a5");
        return string;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block7: {
                    Exception exception2;
                    block6: {
                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        String string = this.b != null ? this.b : "";
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        catch (Exception exception2) {
                            break block6;
                        }
                        hashMap.put("access_token", string);
                        string = this.c != null ? this.c : "";
                        hashMap.put("refresh_token", string);
                        string = this.a != null ? this.a : "";
                        hashMap.put("device_id", string);
                        C.b0("uctvtoken", C.Z(hashMap));
                        break block7;
                    }
                    StringBuilder stringBuilder = new StringBuilder("[UCTV] \u4fdd\u5b58 Token \u5931\u8d25: ");
                    stringBuilder.append(exception2.getMessage());
                    SpiderDebug.log((String)stringBuilder.toString());
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void k(String object) {
        int n2 = C.j(240);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n2, n2);
        layoutParams.gravity = 17;
        ImageView imageView = new ImageView((Context)InitOrigin.context());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        try {
            object = Base64.decode((String)object, (int)2);
            object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)((Object)object).length);
        }
        catch (Exception exception) {
            object = null;
        }
        try {
            imageView.setImageBitmap((Bitmap)object);
            object = new FrameLayout((Context)InitOrigin.context());
            object.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
            imageView = new AlertDialog.Builder((Context)InitOrigin.getActivity());
            imageView = imageView.setView((View)object);
            object = new O(this, 1);
            imageView = imageView.setOnCancelListener((DialogInterface.OnCancelListener)object);
            object = new P(this, 1);
            object = N.w((AlertDialog.Builder)imageView, (P)object).show();
            this.f = object;
            object = object.getWindow();
            imageView = new ColorDrawable(0);
            object.setBackgroundDrawable((Drawable)imageView);
            A.m("\u8bf7\u4f7f\u7528 UC \u7f51\u76d8 App \u626b\u7801");
        }
        catch (Exception exception) {
            m.m(exception, new StringBuilder("[UCTV] \u663e\u793a\u4e8c\u7ef4\u7801\u5931\u8d25: "));
        }
    }

    public final void l(String object) {
        try {
            int n2 = C.j(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n2, n2);
            layoutParams.gravity = 17;
            Object object2 = new ImageView((Context)InitOrigin.context());
            object2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            object2.setImageBitmap(C.w(n2, (String)object));
            object = new FrameLayout((Context)InitOrigin.context());
            object.addView((View)object2, (ViewGroup.LayoutParams)layoutParams);
            object2 = new AlertDialog.Builder((Context)InitOrigin.getActivity());
            object = object2.setView((View)object);
            object2 = new O(this, 0);
            object2 = object.setOnCancelListener((DialogInterface.OnCancelListener)object2);
            object = new P(this, 0);
            object = N.e((AlertDialog.Builder)object2, (P)object).show();
            this.f = object;
            object2 = object.getWindow();
            object = new ColorDrawable(0);
            object2.setBackgroundDrawable((Drawable)object);
        }
        catch (Exception exception) {
            m.m(exception, new StringBuilder("[UCTV] \u663e\u793a\u4e8c\u7ef4\u7801\u5931\u8d25: "));
        }
    }

    public final void m() {
        ScheduledExecutorService scheduledExecutorService;
        SpiderDebug.log((String)"[UCTV] \u542f\u52a8\u626b\u7801\u72b6\u6001\u68c0\u67e5\u670d\u52a1");
        this.e = scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new Q(this, 6), 1L, 3L, TimeUnit.SECONDS);
    }

    public final void n() {
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.e = null;
        }
        InitOrigin.run((Runnable)new Q(this, 0));
    }
}

