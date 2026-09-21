/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.DialogInterface$OnCancelListener
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.util.Base64
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager$LayoutParams
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  com.github.catvod.spider.InitOrigin
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider.merge.xc.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.x;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.F0.h;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.U.F;
import com.github.catvod.spider.merge.xc.U.K;
import com.github.catvod.spider.merge.xc.U.p;
import com.github.catvod.spider.merge.xc.U.r;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.e0.e;
import com.github.catvod.spider.merge.xc.e0.f;
import com.github.catvod.spider.merge.xc.e0.j;
import com.github.catvod.spider.merge.xc.g0.c;
import com.github.catvod.spider.merge.xc.s0.w;
import com.google.gson.JsonObject;
import java.io.Closeable;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public abstract class a {
    public static AlertDialog a;

    public static HashMap A(LinkedHashMap object, String charSequence) {
        HashMap hashMap = com.github.catvod.spider.merge.xc.a.a.c();
        String string = com.github.catvod.spider.merge.xc.a.a.t();
        CharSequence charSequence2 = new SimpleDateFormat("yyyyMMdd HHmmss", Locale.getDefault()).format(new Date());
        hashMap.put("mcloud-skey", charSequence);
        hashMap.put("X-Deviceinfo", "||9|7.17.4|chrome|131.0.0.0|||windows 10||zh-CN|||");
        hashMap.put("CMS-DEVICE", "default");
        hashMap.put("x-yun-channel-source", "10000034");
        hashMap.put("x-huawei-channelSrc", "10000034");
        hashMap.put("x-yun-svc-type", "1");
        hashMap.put("x-SvcType", "1");
        hashMap.put("x-m4c-caller", "PC");
        hashMap.put("x-m4c-src", "10002");
        hashMap.put("x-inner-ntwk", "2");
        hashMap.put("mcloud-route", "001");
        hashMap.put("mcloud-version", "7.17.4");
        hashMap.put("mcloud-channel", "1000101");
        hashMap.put("mcloud-client", "10701");
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)charSequence2);
        ((StringBuilder)charSequence).append(",");
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(",");
        object = URLEncoder.encode(C.Z(object));
        Object object2 = new ArrayList<Character>();
        for (int i2 = 0; i2 < ((String)object).length(); ++i2) {
            ((ArrayList)object2).add(Character.valueOf(((String)object).charAt(i2)));
        }
        Collections.sort(object2);
        object = new StringBuilder();
        object2 = ((ArrayList)object2).iterator();
        while (object2.hasNext()) {
            ((StringBuilder)object).append((Character)object2.next());
        }
        object = H.a(Base64.encodeToString((byte[])((StringBuilder)object).toString().getBytes(com.github.catvod.spider.merge.UY.m.m()), (int)2));
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)charSequence2);
        ((StringBuilder)object2).append(":");
        ((StringBuilder)object2).append(string);
        string = H.a(((StringBuilder)object2).toString());
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append((String)object);
        ((StringBuilder)charSequence2).append(string);
        ((StringBuilder)charSequence).append(H.a(((StringBuilder)charSequence2).toString()).toUpperCase(Locale.ROOT));
        hashMap.put("mcloud-sign", ((StringBuilder)charSequence).toString());
        hashMap.put("INNER-HCY-ROUTER-HTTPS", "1");
        return hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void B(AlertDialog alertDialog) {
        block5: {
            if (alertDialog == null) {
                return;
            }
            try {
                alertDialog = alertDialog.getWindow();
                if (alertDialog != null) break block5;
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        ColorDrawable colorDrawable = new ColorDrawable(0);
        alertDialog.setBackgroundDrawable((Drawable)colorDrawable);
        colorDrawable = alertDialog.getAttributes();
        colorDrawable.dimAmount = 0.42f;
        alertDialog.setAttributes((WindowManager.LayoutParams)colorDrawable);
        alertDialog.addFlags(2);
    }

    public static final void C(Object object) {
        if (!(object instanceof com.github.catvod.spider.merge.xc.c0.c)) {
            return;
        }
        throw ((com.github.catvod.spider.merge.xc.c0.c)object).a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ContextWrapper D() {
        block3: {
            try {
                Activity activity = InitOrigin.getActivity();
                if (activity == null) break block3;
                return activity;
            }
            catch (Exception exception) {
                return InitOrigin.context();
            }
        }
        return InitOrigin.context();
    }

    public static Button E(String string, boolean bl) {
        Button button = new Button((Context)com.github.catvod.spider.merge.xc.a.a.D());
        button.setText((CharSequence)string);
        button.setTextSize(16.0f);
        button.setAllCaps(false);
        int n2 = bl ? -1 : Color.rgb((int)31, (int)41, (int)55);
        button.setTextColor(n2);
        n2 = bl ? Color.rgb((int)37, (int)99, (int)235) : Color.rgb((int)243, (int)244, (int)246);
        float f2 = C.j(12);
        int n3 = bl ? Color.rgb((int)37, (int)99, (int)235) : Color.rgb((int)209, (int)213, (int)219);
        button.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.v(n2, f2, n3, C.j(1)));
        button.setOnFocusChangeListener((View.OnFocusChangeListener)new com.github.catvod.spider.merge.xc.U.c((View)button, bl, 1));
        return button;
    }

    public static LinearLayout.LayoutParams F(boolean bl) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        int n2 = bl ? 0 : C.j(6);
        int n3 = bl ? C.j(6) : 0;
        layoutParams.setMargins(n2, 0, n3, 0);
        return layoutParams;
    }

    public static EditText G(String string, boolean bl) {
        EditText editText = new EditText((Context)com.github.catvod.spider.merge.xc.a.a.D());
        editText.setHint((CharSequence)string);
        editText.setSingleLine(true);
        int n2 = bl ? 129 : 1;
        editText.setInputType(n2);
        editText.setTextSize(18.0f);
        editText.setPadding(C.j(16), 0, C.j(16), 0);
        editText.setSelectAllOnFocus(true);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setCursorVisible(true);
        editText.setOnClickListener((View.OnClickListener)new com.github.catvod.spider.merge.xc.U.a(editText, 1));
        editText.setOnFocusChangeListener((View.OnFocusChangeListener)new com.github.catvod.spider.merge.xc.U.m(editText, 1));
        editText.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.v(Color.rgb((int)249, (int)250, (int)251), C.j(12), Color.rgb((int)37, (int)99, (int)235), C.j(2)));
        return editText;
    }

    public static String a(String string, String string2) {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(string2.getBytes(com.github.catvod.spider.merge.UY.m.m()), "AES"));
        return new String(cipher.doFinal(Base64.decode((String)string, (int)2)), com.github.catvod.spider.merge.UY.m.m());
    }

    public static String b(String string, String string2) {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(1, new SecretKeySpec(string2.getBytes(com.github.catvod.spider.merge.UY.m.m()), "AES"));
        return Base64.encodeToString((byte[])cipher.doFinal(string.getBytes(com.github.catvod.spider.merge.UY.m.m())), (int)2);
    }

    public static HashMap c() {
        HashMap hashMap = m.k("caller", "web", "Content-Type", "application/json;charset=UTF-8");
        hashMap.put("Origin", "https://yun.139.com");
        hashMap.put("Referer", "https://yun.139.com/w/");
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        return hashMap;
    }

    public static void d(int n2, int n3, int n4) {
        if (n2 >= 0 && n3 <= n4) {
            if (n2 <= n3) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("fromIndex: ");
            stringBuilder.append(n2);
            stringBuilder.append(" > toIndex: ");
            stringBuilder.append(n3);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder("fromIndex: ");
        stringBuilder.append(n2);
        stringBuilder.append(", toIndex: ");
        stringBuilder.append(n3);
        stringBuilder.append(", size: ");
        stringBuilder.append(n4);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public static final void e(Closeable closeable, Throwable throwable) {
        if (closeable != null) {
            if (throwable == null) {
                closeable.close();
            } else {
                try {
                    closeable.close();
                }
                catch (Throwable throwable2) {
                    b.c(throwable, throwable2);
                }
            }
        }
    }

    public static int f(int n2, int n3, int n4) {
        if (n3 <= n4) {
            if (n2 < n3) {
                return n3;
            }
            if (n2 > n4) {
                return n4;
            }
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(n4);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(n3);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static d g(d d2, com.github.catvod.spider.merge.by.p p2, Object object) {
        com.github.catvod.spider.merge.xc.e0.i i2;
        i.e(p2, "<this>");
        i.e(d2, "completion");
        d2 = p2 instanceof com.github.catvod.spider.merge.xc.g0.a ? ((com.github.catvod.spider.merge.xc.g0.a)((Object)p2)).create(object, d2) : ((i2 = d2.getContext()) == j.a ? new com.github.catvod.spider.merge.xc.f0.b(d2, p2, object) : new com.github.catvod.spider.merge.xc.f0.c(d2, i2, p2, object));
        return d2;
    }

    public static final com.github.catvod.spider.merge.xc.c0.c h(Throwable throwable) {
        i.e(throwable, "exception");
        return new com.github.catvod.spider.merge.xc.c0.c(throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void i() {
        block4: {
            try {
                AlertDialog alertDialog = a;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                break block4;
            }
            catch (Throwable throwable) {
            }
            catch (Exception exception) {
                break block4;
            }
            a = null;
            throw throwable;
        }
        a = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void j(EditText editText) {
        try {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocusFromTouch();
            p p2 = new p(editText, 1);
            editText.postDelayed((Runnable)p2, 220L);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static String k() {
        JsonObject jsonObject = new LinkedHashMap();
        jsonObject.put("clientCode", "10701");
        jsonObject.put("type", 1);
        jsonObject = C.R(A.k("https://yun.139.com/orchestration/auth-rebuild/key/v1.0/getRsaPublicKey", C.Z(jsonObject), com.github.catvod.spider.merge.xc.a.a.c()).b());
        if (com.github.catvod.spider.merge.xc.a.a.n(jsonObject)) {
            return com.github.catvod.spider.merge.xc.a.a.l(jsonObject.getAsJsonObject("data"), "publicKey");
        }
        throw new RuntimeException(com.github.catvod.spider.merge.xc.a.a.p(jsonObject, "publicKey not found"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String l(JsonObject jsonObject, String string) {
        String string2;
        String string3 = string2 = "";
        if (jsonObject == null) return string3;
        string3 = string2;
        try {
            if (!jsonObject.has(string)) return string3;
            string3 = string2;
        }
        catch (Throwable throwable) {
            return string2;
        }
        if (jsonObject.get(string).isJsonNull()) return string3;
        return jsonObject.get(string).getAsString();
    }

    public static d m(d object) {
        i.e(object, "<this>");
        c c2 = object instanceof c ? (c)object : null;
        if (c2 != null) {
            d d2 = c2.b;
            object = d2;
            if (d2 == null) {
                object = c2.a;
                i.b(object);
                object = (f)object.b(e.a);
                object = object != null ? new com.github.catvod.spider.merge.xc.t0.i((w)object, c2) : c2;
                c2.b = object;
            }
        }
        return object;
    }

    public static boolean n(JsonObject jsonObject) {
        boolean bl = jsonObject.has("success") && jsonObject.get("success").getAsBoolean() && "0".equals(com.github.catvod.spider.merge.xc.a.a.l(jsonObject, "code"));
        return bl;
    }

    public static List o(Object list) {
        list = Collections.singletonList(list);
        i.d(list, "singletonList(...)");
        return list;
    }

    public static String p(JsonObject object, String object2) {
        if (((String)(object = com.github.catvod.spider.merge.xc.a.a.l((JsonObject)object, "message"))).length() != 0) {
            object2 = object;
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String q(String object) {
        if (((String)(object = object == null ? "" : ((String)object).trim())).length() == 0) {
            return "";
        }
        String[] stringArray = ((String)object).replace("\r", "").replace("\n", "").trim();
        object = stringArray;
        if (stringArray.startsWith("Authorization:")) {
            object = stringArray.substring(14).trim();
        }
        stringArray = object;
        if (((String)object).startsWith("authorization:")) {
            stringArray = ((String)object).substring(14).trim();
        }
        object = stringArray;
        if (stringArray.startsWith("Basic ")) {
            object = stringArray.substring(6).trim();
        }
        int n2 = ((String)object).indexOf("pc:");
        int n3 = ((String)object).indexOf("ph5:");
        n2 = n2 >= 0 && n3 >= 0 ? Math.min(n2, n3) : Math.max(n2, n3);
        stringArray = object;
        if (n2 > 0) {
            stringArray = ((String)object).substring(n2).trim();
        }
        if (!stringArray.startsWith("pc:") && !stringArray.startsWith("ph5:")) {
            block11: {
                try {
                    object = new String(Base64.decode((String)stringArray, (int)2), com.github.catvod.spider.merge.UY.m.m());
                    if (!((String)object).startsWith("pc:") && !((String)object).startsWith("ph5:")) break block11;
                }
                catch (Throwable throwable) {
                    break block11;
                }
                n2 = ((String)object).split(":", 3).length;
                if (n2 == 3) {
                    return stringArray;
                }
            }
            if ((stringArray = stringArray.split(":", 2)).length == 2 && stringArray[0].matches("^1[3-9][0-9]{9}$") && stringArray[1].length() > 0) {
                object = new StringBuilder("pc:");
                ((StringBuilder)object).append(stringArray[0]);
                ((StringBuilder)object).append(":");
                ((StringBuilder)object).append(stringArray[1]);
                return Base64.encodeToString((byte[])((StringBuilder)object).toString().getBytes(com.github.catvod.spider.merge.UY.m.m()), (int)2);
            }
            throw new IllegalArgumentException("Use Basic auth, pc/ph5:account:token or phone:token");
        }
        object = stringArray.split(":", 3);
        if (((String[])object).length >= 3 && object[1].length() != 0 && ((String)object[2]).length() != 0) {
            return Base64.encodeToString((byte[])stringArray.getBytes(com.github.catvod.spider.merge.UY.m.m()), (int)2);
        }
        throw new IllegalArgumentException("format: pc/ph5:account:token");
    }

    public static A r(q object) {
        object = (object = ((q)object).w()) instanceof h ? (h)object : null;
        if (object == null || (object = ((h)object).k) == null) {
            object = new A(new com.github.catvod.spider.merge.xc.G0.b());
        }
        return object;
    }

    public static com.github.catvod.spider.merge.xc.e0.i s(com.github.catvod.spider.merge.xc.e0.i i2, com.github.catvod.spider.merge.xc.e0.i i4) {
        i.e(i4, "context");
        if (i4 != j.a) {
            i2 = (com.github.catvod.spider.merge.xc.e0.i)i4.c(i2, com.github.catvod.spider.merge.xc.e0.b.c);
        }
        return i2;
    }

    public static String t() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < 16; ++i2) {
            stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(secureRandom.nextInt(62)));
        }
        return stringBuilder.toString();
    }

    public static GradientDrawable u(int n2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(n2);
        gradientDrawable.setCornerRadius(f2);
        return gradientDrawable;
    }

    public static GradientDrawable v(int n2, float f2, int n3, int n4) {
        GradientDrawable gradientDrawable = com.github.catvod.spider.merge.xc.a.a.u(n2, f2);
        gradientDrawable.setStroke(n4, n3);
        return gradientDrawable;
    }

    public static String w(String string, String object) {
        object = Base64.decode((String)object, (int)2);
        PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec((byte[])object));
        object = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        ((Cipher)object).init(1, publicKey);
        return Base64.encodeToString((byte[])((Cipher)object).doFinal(string.getBytes(com.github.catvod.spider.merge.UY.m.m())), (int)2);
    }

    public static void x(Runnable runnable) {
        InitOrigin.run((Runnable)runnable, (int)450);
    }

    public static void y(String string, int n2, Bitmap bitmap, Runnable runnable) {
        int n3 = C.j(238);
        LinearLayout linearLayout = new LinearLayout((Context)InitOrigin.context());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(C.j(24), C.j(20), C.j(24), C.j(20));
        linearLayout.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.u(-1, C.j(20)));
        TextView textView = new TextView((Context)InitOrigin.context());
        textView.setText((CharSequence)string);
        textView.setTextColor(Color.rgb((int)17, (int)24, (int)39));
        textView.setTextSize(20.0f);
        textView.setTypeface(Typeface.DEFAULT, 1);
        textView.setGravity(17);
        linearLayout.addView((View)textView, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        string = new TextView((Context)InitOrigin.context());
        string.setText((CharSequence)"\u8bf7\u4f7f\u7528\u5bf9\u5e94\u7f51\u76d8 App \u626b\u7801\u5b8c\u6210\u6388\u6743");
        string.setTextColor(Color.rgb((int)75, (int)85, (int)99));
        string.setTextSize(14.0f);
        string.setGravity(17);
        string.setPadding(0, C.j(8), 0, C.j(16));
        linearLayout.addView((View)string, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -2));
        string = new ImageView((Context)InitOrigin.context());
        string.setImageBitmap(bitmap);
        string.setPadding(C.j(14), C.j(14), C.j(14), C.j(14));
        string.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.v(-1, C.j(18), Color.rgb((int)229, (int)231, (int)235), C.j(1)));
        string.setScaleType(ImageView.ScaleType.FIT_CENTER);
        textView = new FrameLayout((Context)InitOrigin.context());
        textView.setPadding(0, 0, 0, C.j(18));
        bitmap = new FrameLayout.LayoutParams(n3, n3);
        bitmap.gravity = 17;
        textView.addView((View)string, (ViewGroup.LayoutParams)bitmap);
        linearLayout.addView((View)textView, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, C.j(18) + n3));
        string = new Button((Context)InitOrigin.context());
        string.setText((CharSequence)"\u53d6\u6d88\u6388\u6743");
        string.setAllCaps(false);
        string.setTextSize(14.0f);
        string.setTextColor(-1);
        string.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.u(n2, C.j(12)));
        linearLayout.addView((View)string, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, C.j(44)));
        com.github.catvod.spider.merge.xc.a.a.i();
        a = new AlertDialog.Builder((Context)InitOrigin.getActivity()).create();
        string.setOnClickListener((View.OnClickListener)new r(runnable, 1));
        a.setOnCancelListener((DialogInterface.OnCancelListener)new x(1, runnable));
        a.show();
        a.setContentView((View)linearLayout);
        com.github.catvod.spider.merge.xc.a.a.B(a);
        string = a.getWindow();
        if (string != null) {
            string.setLayout(Math.min(C.j(340), InitOrigin.context().getResources().getDisplayMetrics().widthPixels - C.j(40)), -2);
        }
    }

    public static void z(String string, String string2, String string3, String string4, K k2) {
        com.github.catvod.spider.merge.xc.a.a.x(new F(string, string2, string3, string4, k2));
    }
}

