/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.util.Base64
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  com.github.catvod.crawler.Spider
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.graphics.Color;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Notice$1;
import com.github.catvod.spider.merge.I.m0;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.g0.n;
import com.github.catvod.spider.merge.h0.a;
import com.github.catvod.spider.merge.i0.m;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

public class Notice
extends Spider {
    private a a;
    private String b;
    private int c;
    private String d;
    private final Runnable e = new Notice$1(this);

    public static void a(Notice notice) {
        a a2;
        Objects.requireNonNull(notice);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < 2; ++i2) {
            stringBuilder.append("                                        ");
            stringBuilder.append(notice.d);
        }
        notice.a = a2 = new a((Context)Init.context());
        a2.setTextSize(20.0f);
        notice.a.a(notice.c);
        notice.a.setText(stringBuilder.toString());
        notice.a.setTypeface(null, 1);
        notice.a.setPadding(0, m.e(16), 0, m.e(16));
        notice.a.setBackgroundColor(Color.argb((int)200, (int)255, (int)255, (int)255));
        notice.a.b();
        a2 = new FrameLayout.LayoutParams(-1, -2);
        ((FrameLayout.LayoutParams)a2).gravity = 48;
        m.d((View)notice.a, (ViewGroup.LayoutParams)a2);
        Init.run(notice.e, 500);
        Init.run(new n(notice), notice.c * 1000);
    }

    public static void b(Notice object) {
        a a2 = object.a;
        object = m.a;
        try {
            ((ViewGroup)Init.getActivity().getWindow().getDecorView().findViewById(0x1020002)).removeView((View)a2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static /* bridge */ /* synthetic */ a c(Notice notice) {
        return notice.a;
    }

    static void d(Notice notice) {
        Init.run(notice.e, 500);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void show(String string) {
        try {
            Notice notice = new Notice();
            notice.init(null, string);
            notice.homeContent(false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public String homeContent(boolean bl) {
        boolean bl2;
        block4: {
            block5: {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
                bl = this.b.startsWith("http");
                boolean bl3 = false;
                String string = bl ? com.github.catvod.spider.merge.f0.d.k(this.b) : new String(Base64.decode((String)this.b, (int)0));
                string = new JSONObject(string);
                this.d = string.optString("msg");
                this.c = string.optInt("duration", 30);
                string = string.optString("date");
                bl2 = bl3;
                if (this.d.length() <= 0) break block4;
                if (string.isEmpty()) break block5;
                bl2 = bl3;
                if (!new Date().after(simpleDateFormat.parse(string))) break block4;
            }
            bl2 = true;
        }
        if (bl2) {
            Init.run(new m0((Object)this, 4), 500);
        }
        return "";
    }

    public void init(Context context, String string) {
        this.b = string;
    }
}

