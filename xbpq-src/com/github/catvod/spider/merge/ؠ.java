/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 *  com.google.gson.reflect.TypeToken
 */
package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u052e;
import com.github.catvod.spider.merge.\u058f;
import com.github.catvod.spider.merge.\u0787;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class \u0620 {
    @SerializedName(value="name")
    private String \u037f;
    @SerializedName(alternate={"parent"}, value="path")
    private String \u0528;
    @SerializedName(value="type")
    private int \u0529;
    @SerializedName(value="size")
    private long \u052a;
    @SerializedName(alternate={"thumbnail"}, value="thumb")
    private String \u052b;
    @SerializedName(alternate={"raw_url"}, value="url")
    private String \u052c;
    @SerializedName(alternate={"updated_at"}, value="modified")
    private String \u052d;

    public static List<\u0620> \u037f(String string) {
        Type type = new TypeToken<List<\u0620>>(){}.getType();
        return (List)new Gson().fromJson(string, type);
    }

    public static \u0620 \u0787(String string) {
        return (\u0620)new Gson().fromJson(string, \u0620.class);
    }

    public Date \u0528() {
        try {
            Cloneable cloneable = new SimpleDateFormat(SOY.d("032B280F593A377F351253235D1A194C191A4021225827242908"), Locale.getDefault());
            cloneable = cloneable.parse(this.\u052a());
            return cloneable;
        }
        catch (Exception exception) {
            return new Date();
        }
    }

    public String \u0529() {
        return \u0787.\u037f(this.\u052b());
    }

    public String \u052a() {
        return this.\u052d;
    }

    public String \u052b() {
        String string = TextUtils.isEmpty((CharSequence)this.\u037f) ? "" : this.\u037f;
        return string;
    }

    public String \u052c() {
        String string = TextUtils.isEmpty((CharSequence)this.\u0528) ? "" : this.\u0528;
        return string;
    }

    public String \u052d(String string) {
        if (!this.\u058f().isEmpty() || !this.\u0785()) {
            string = this.\u058f();
        }
        return string;
    }

    public String \u052e() {
        return \u0787.\u0528(this.\u052f());
    }

    public long \u052f() {
        return this.\u052a;
    }

    public String \u058f() {
        String string = TextUtils.isEmpty((CharSequence)this.\u052b) ? "" : this.\u052b;
        return string;
    }

    public int \u0620() {
        return this.\u0529;
    }

    public String \u0780() {
        CharSequence charSequence;
        if (TextUtils.isEmpty((CharSequence)this.\u052c)) {
            charSequence = "";
        } else if (this.\u052c.startsWith(SOY.d("557D"))) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(SOY.d("122625064E"));
            ((StringBuilder)charSequence).append(this.\u052c);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = this.\u052c;
        }
        return charSequence;
    }

    public \u052e \u0781(\u058f \u058f2, String string) {
        return new \u052e(this.\u0783(\u058f2.\u052e()), this.\u052b(), this.\u052d(string), \u058f2.\u052e(), this.\u0785());
    }

    public \u052e \u0782(String string, String string2) {
        return new \u052e(this.\u0783(string), this.\u052b(), this.\u052d(string2), this.\u052e(), this.\u0785());
    }

    public String \u0783(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(this.\u052c());
        stringBuilder.append(SOY.d("55"));
        stringBuilder.append(this.\u052b());
        return stringBuilder.toString();
    }

    public boolean \u0784(boolean bl) {
        boolean bl2;
        block4: {
            block9: {
                boolean bl3;
                block6: {
                    block8: {
                        block7: {
                            boolean bl4;
                            block5: {
                                boolean bl5 = this.\u052b().endsWith(SOY.d("542622"));
                                bl3 = false;
                                bl4 = false;
                                bl2 = bl3;
                                if (bl5) break block4;
                                if (!this.\u052b().endsWith(SOY.d("543F2111"))) break block5;
                                bl2 = bl3;
                                break block4;
                            }
                            if (!bl) break block6;
                            if (this.\u0620() == 0) break block7;
                            bl = bl4;
                            if (this.\u0620() != 4) break block8;
                        }
                        bl = true;
                    }
                    return bl;
                }
                if (this.\u0620() == 0 || this.\u0620() == 2) break block9;
                bl2 = bl3;
                if (this.\u0620() != 5) break block4;
            }
            bl2 = true;
        }
        return bl2;
    }

    public boolean \u0785() {
        int n2 = this.\u0620();
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }

    public boolean \u0786(boolean bl) {
        boolean bl2 = this.\u052b().endsWith(SOY.d("542622"));
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = bl3;
        if (!bl2) {
            if (this.\u052b().endsWith(SOY.d("543F2111"))) {
                bl5 = bl3;
            } else {
                if (bl) {
                    bl = bl4;
                    if (this.\u0620() != 2) {
                        bl = this.\u0620() == 3 ? bl4 : false;
                    }
                    return bl;
                }
                bl5 = bl3;
                if (this.\u0620() != 3) {
                    bl5 = this.\u0620() == 4 ? bl3 : false;
                }
            }
        }
        return bl5;
    }

    public void \u0788(String string) {
        this.\u037f = string;
    }

    public void \u0789(String string) {
        this.\u0528 = string;
    }

    public void \u078a(String string) {
        this.\u052b = string;
    }

    public void \u078b(int n2) {
        this.\u0529 = n2;
    }
}

