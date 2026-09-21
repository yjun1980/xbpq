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
 *  com.google.gson.Gson
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge.b;

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
import com.github.catvod.spider.merge.b.a;
import com.github.catvod.spider.merge.b.b;
import com.github.catvod.spider.merge.b.d;
import com.github.catvod.spider.merge.b.e;
import com.github.catvod.spider.merge.b.f;
import com.github.catvod.spider.merge.b.g;
import com.github.catvod.spider.merge.b.h;
import com.github.catvod.spider.merge.b.i;
import com.github.catvod.spider.merge.b.j;
import com.github.catvod.spider.merge.b.k;
import com.github.catvod.spider.merge.b.l;
import com.github.catvod.spider.merge.b.m;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.b.o;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.c;
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
import org.json.JSONObject;

public final class p {
    public static String l = "";
    public static String m = "";
    public static String n = "";
    private final Map<String, String> a;
    private final List<String> b;
    private AlertDialog c;
    private String d;
    private String e;
    private String f;
    private com.github.catvod.spider.merge.d.f g;
    private com.github.catvod.spider.merge.d.g h;
    private String i = cYh.d("551B");
    private boolean j = false;
    private String k;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    p() {
        HashMap<String, String> hashMap;
        String string = "";
        this.k = "";
        this.b = new ArrayList<String>();
        Object object = this.s();
        try {
            hashMap = new HashMap<String, String>((File)object);
            hashMap = com.github.catvod.spider.merge.j.l.e((InputStream)((Object)hashMap));
        }
        catch (Exception exception) {
            hashMap = "";
        }
        this.g = com.github.catvod.spider.merge.d.f.d((String)((Object)hashMap));
        hashMap = this.x();
        try {
            object = new FileInputStream((File)((Object)hashMap));
            hashMap = com.github.catvod.spider.merge.j.l.e((InputStream)object);
        }
        catch (Exception exception) {
            hashMap = string;
        }
        this.h = com.github.catvod.spider.merge.d.g.f((String)((Object)hashMap));
        hashMap = new HashMap<String, String>();
        this.a = hashMap;
        hashMap.put(cYh.d("59620A6D"), cYh.d("361805"));
        hashMap.put(cYh.d("59B8F7D4B1E2E26C"), cYh.d("211805"));
    }

    private void A(com.github.catvod.spider.merge.d.e e2, List<com.github.catvod.spider.merge.d.e> list, List<com.github.catvod.spider.merge.d.e> list2) {
        this.B(e2, list, list2, "");
    }

    private void B(com.github.catvod.spider.merge.d.e object, List<com.github.catvod.spider.merge.d.e> list, List<com.github.catvod.spider.merge.d.e> list2, String object2) {
        JSONObject object32 = new JSONObject();
        ArrayList<com.github.catvod.spider.merge.d.e> arrayList = new ArrayList<com.github.catvod.spider.merge.d.e>();
        object32.put(cYh.d("0B392C3823"), 200);
        Object object3 = this.f;
        object32.put(cYh.d("1438202332050E34"), object3);
        object3 = ((com.github.catvod.spider.merge.d.e)((Object)object)).d();
        object32.put(cYh.d("17313334392E3836283D32050E34"), object3);
        object32.put(cYh.d("0822253425050529"), (Object)cYh.d("09312C34"));
        object32.put(cYh.d("08222534250503393334342E0E3F2F"), (Object)cYh.d("260302"));
        if (((String)((Object)object2)).length() > 0) {
            object32.put(cYh.d("0A31333A3228"), (Object)object2);
        }
        object2 = object32.toString();
        object2 = this.l(cYh.d("06343338213F4826727E31330B356E3D3E2913"), (String)((Object)object2), true);
        object3 = (com.github.catvod.spider.merge.d.e)new Gson().fromJson((String)((Object)object2), com.github.catvod.spider.merge.d.e.class);
        for (com.github.catvod.spider.merge.d.e e2 : ((com.github.catvod.spider.merge.d.e)object3).e()) {
            if (e2.h().equals(cYh.d("013F2D353228"))) {
                arrayList.add(e2);
                continue;
            }
            if (!e2.a().equals(cYh.d("1139253438")) && !e2.a().equals(cYh.d("0625253838"))) {
                if (!com.github.catvod.spider.merge.j.o.d(e2.c())) continue;
                list2.add(e2);
                continue;
            }
            e2.i(((com.github.catvod.spider.merge.d.e)((Object)object)).f());
            list.add(e2);
        }
        if (((com.github.catvod.spider.merge.d.e)object3).g().length() > 0) {
            this.B((com.github.catvod.spider.merge.d.e)((Object)object), list, list2, ((com.github.catvod.spider.merge.d.e)object3).g());
        }
        object = arrayList.iterator();
        while (object.hasNext()) {
            this.A((com.github.catvod.spider.merge.d.e)object.next(), list, list2);
        }
    }

    private String C(String string, String string2, boolean bl) {
        if (!string.startsWith(cYh.d("0F24352124"))) {
            string = com.github.catvod.spider.merge.b.n.a(cYh.d("0F2435212460487F2E21323449312D382E2F09343338213F49332E3C783B03222827327511616F6178"), string);
        }
        Object object = this.q();
        Object object2 = this.g.b();
        ((HashMap)object).put((String)cYh.d("0625353938280E2A20253E3509"), (String)object2);
        object2 = com.github.catvod.spider.merge.h.b.f(string, string2, object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((com.github.catvod.spider.merge.h.d)object2).b());
        object = cYh.d("4B");
        stringBuilder.append((String)object);
        stringBuilder.append(string);
        stringBuilder.append((String)object);
        stringBuilder.append(((com.github.catvod.spider.merge.h.d)object2).a());
        SpiderDebug.log((String)stringBuilder.toString());
        if (bl && (((com.github.catvod.spider.merge.h.d)object2).b() == 400 || ((com.github.catvod.spider.merge.h.d)object2).b() == 401)) {
            object = cYh.d("1535272332290F0F353E3C3F09");
            try {
                if (this.g.c().isEmpty()) {
                    bl = this.E();
                } else {
                    SpiderDebug.log((String)cYh.d("1535272332290F1F3134390E083B243F797449"));
                    stringBuilder = new JSONObject();
                    stringBuilder.put(cYh.d("0022203F230513293134"), object);
                    stringBuilder.put((String)object, this.g.c());
                    bl = this.k(cYh.d("0F2435212460487F20213E7704366F3F397404396E303B3314246E303B33383F31343975133F2A3439"), (JSONObject)stringBuilder);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                com.github.catvod.spider.merge.d.f f2 = this.g;
                f2.a();
                f2.e();
                bl = false;
            }
            if (bl) {
                return this.C(string, string2, false);
            }
        }
        return ((com.github.catvod.spider.merge.h.d)object2).a();
    }

    private boolean D(String string) {
        try {
            SpiderDebug.log((String)cYh.d("281134253F7A35352538253F04246F7F79"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(cYh.d("043F2534"), (Object)string);
            jSONObject.put(cYh.d("0022203F230513293134"), (Object)cYh.d("0625353938280E2A20253E35090F223E333F"));
            boolean bl = this.k(cYh.d("0F2435212460487F20213E7704366F3F397404396E303B3314246E303B33383F31343975043F2534"), jSONObject);
            return bl;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            com.github.catvod.spider.merge.d.f f2 = this.g;
            f2.a();
            f2.e();
            return false;
        }
    }

    private boolean E() {
        try {
            SpiderDebug.log((String)cYh.d("281134253F7A353530243229137E6F7F"));
            Object object = new JSONObject();
            object.put(cYh.d("0625353938280E2A24"), 1);
            object.put(cYh.d("14332E2132"), (Object)cYh.d("122324236D380623247D31330B357B303B365D222430337601392D346D3B0B3C7B2625331335"));
            object = this.l(cYh.d("0F2435212460487F2E21323449312D382E2F09343338213F49332E3C783506253539782F14353322783B1224293E25331D357E323B33023E350E3E3E5A677768666D04332232336E53647032646353657630676E01667169633C05622777253F03393334342E382533386A32132431226D7548312D38242E493E2F7F343348242E3E3B75063C2828223403222827327504312D3D353B043B6722343517357C24243F156A2330243F4B36283D3260063C2D6B253F06346D373E36026A203D3B6010222825327C142420253267"), object.toString(), true);
            Gson gson = new Gson();
            boolean bl = this.D(((com.github.catvod.spider.merge.d.b)gson.fromJson((String)object, com.github.catvod.spider.merge.d.b.class)).a());
            return bl;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    private String G(String string, JSONObject object) {
        if (!string.startsWith(cYh.d("0F24352124"))) {
            string = com.github.catvod.spider.merge.b.n.a(cYh.d("0F2435212460487F20213E74063C28282234032228273274043F2C7E"), string);
        }
        object = com.github.catvod.spider.merge.h.b.f(string, object.toString(), this.q());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((com.github.catvod.spider.merge.h.d)object).b());
        String string2 = cYh.d("4B");
        stringBuilder.append(string2);
        stringBuilder.append(string);
        stringBuilder.append(string2);
        stringBuilder.append(((com.github.catvod.spider.merge.h.d)object).a());
        SpiderDebug.log((String)stringBuilder.toString());
        return ((com.github.catvod.spider.merge.h.d)object).a();
    }

    private boolean I() {
        String string;
        Object object;
        block22: {
            JSONObject jSONObject;
            Object object2 = cYh.d("1535272332290F0F353E3C3F09");
            try {
                SpiderDebug.log((String)cYh.d("1535272332290F112232322914042E3A3234497E6F"));
                jSONObject = new JSONObject();
                object = this.d;
                string = object;
            }
            catch (Exception exception) {
                String string2;
                if (this.d.length() > 0 && this.h.e().length() > 0 && !this.d.equals(this.h.e())) {
                    this.d = "";
                    if (this.I()) {
                        return true;
                    }
                }
                int n2 = this.k.length();
                object = cYh.d("1420");
                if (n2 < 1) {
                    if (this.j) {
                        Init.show(cYh.d("8ED5CCB6EAF480CAC5253831023EA7C6F7BCF2D8AEEDD6"));
                    }
                    this.d = string2 = Init.d.getString(cYh.d("063C280E2331"), "");
                    if (string2.length() > 0) {
                        this.k = object;
                        if (this.I()) {
                            if (this.j) {
                                Init.show(cYh.d("83EDFEB6C3F280ECD2B4FAC2133F2A3439BCEFC0A4DBC8B5DBD1"));
                            }
                            return true;
                        }
                    }
                }
                object2 = this.k;
                string2 = cYh.d("81D8D1B4DDC5");
                if (string2.equals(object2)) {
                    Init.show(cYh.d("81D9EAB6F7DB80CAC5253831023EA7CDFDB2D2E7A5ECCBBDF3F8AEEDDBB2C8E7A8D6DAB2C8C5AEEDD6"));
                }
                if ("".equals(this.k) || ((String)object).equals(this.k)) {
                    if (((String)object).equals(this.k)) {
                        Init.show(cYh.d("80ECD2B4FAC2133F2A3439BFC3E1A7C4DF7B"));
                    }
                    if ("".equals(this.k)) {
                        this.k = object;
                    }
                    object = this.h;
                    ((com.github.catvod.spider.merge.d.g)object).a();
                    ((com.github.catvod.spider.merge.d.g)object).g();
                    this.d = "";
                    this.N();
                    n2 = com.github.catvod.spider.merge.j.o.a;
                    boolean bl = Init.context().getPackageManager().hasSystemFeature(cYh.d("063E25233833037E2930253E103133347939063D24233674063E38"));
                    boolean bl2 = Init.context().getPackageManager().hasSystemFeature(cYh.d("063E25233833037E2930253E10313334792E023C24213F350929"));
                    boolean bl3 = Init.context().getPackageManager().hasSystemFeature(cYh.d("063E25233833037E2930253E1031333479380B25242538351338"));
                    n2 = bl && bl2 && bl3 ? 1 : 0;
                    if (n2 != 0) {
                        Init.run(new a(this));
                    } else {
                        this.M();
                    }
                    if (string2.equals(this.k) && this.I()) {
                        if (this.j) {
                            Init.show(cYh.d("333F2A3439BCFBD9A7C4DFB5DBD1"));
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
            if (string.startsWith(cYh.d("0F243521"))) {
                object = com.github.catvod.spider.merge.h.b.h(string, null, null).trim();
            }
            jSONObject.put((String)object2, object);
            jSONObject.put(cYh.d("0022203F230513293134"), object2);
            string = this.G(cYh.d("0F2435212460487F2024233249312D382E2F09343338213F49332E3C782C557F20323435123E357E23350C352F"), jSONObject);
            object2 = com.github.catvod.spider.merge.d.g.f(string);
            ((com.github.catvod.spider.merge.d.g)object2).g();
            this.h = object2;
            if (((com.github.catvod.spider.merge.d.g)object2).b().isEmpty()) break block22;
            this.d = object;
            return true;
        }
        object = new Exception(string);
        throw object;
    }

    private void L(String string) {
        if (string.length() > 0) {
            SharedPreferences.Editor editor = Init.d.edit();
            editor.putString(cYh.d("063C280E2331"), string);
            editor.apply();
            this.d = string;
            this.h.h(string);
        }
        this.N();
    }

    private void M() {
        Init.run(new b(this, com.github.catvod.spider.merge.d.c.g(com.github.catvod.spider.merge.h.b.h(cYh.d("0F2435212460487F31302429173F3325793B0B393824393E153937347939083D6E3F322D0B3F263839751622223E333F4837243F32280624247F333558313121193B0A357C303B331E252F0E33280E2624773128083D1238233F5A657377362A171E203C3267063C2828223438343338213F4131312112341322203F343F5A2724337133141D2E333E36026D27303B2902762D30393D5A2A290E14144122242522280905333D6A7C05393B013628063D326C710505286C276A6849626F62"), null, null)).b().c()));
        while (this.d.length() < 1) {
            String string = this.k;
            if (!cYh.d("1420").equals(string)) break;
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
            TextView textView = new TextView((Context)Init.context());
            textView.setText((CharSequence)cYh.d("8EC8FEB8D0D683EAD0B6CCC2260011B7DEF180F0C0B6CEE182EDD4"));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(com.github.catvod.spider.merge.j.o.a(240), com.github.catvod.spider.merge.j.o.a(25));
            textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
            textView.setBackgroundColor(-1);
            textView.setGravity(17);
            layoutParams2 = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.j.o.a(240), com.github.catvod.spider.merge.j.o.a(240));
            ImageView imageView = new ImageView((Context)Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.N.a.c(c2.a()));
            FrameLayout frameLayout = new FrameLayout((Context)Init.context());
            layoutParams2.gravity = 17;
            frameLayout.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams2);
            linearLayout.addView((View)frameLayout);
            linearLayout.addView((View)textView);
            AlertDialog.Builder builder = new AlertDialog.Builder((Context)Init.getActivity());
            AlertDialog.Builder builder2 = builder.setView((View)linearLayout);
            e e2 = new e(p2, c2);
            c2 = builder2.setOnCancelListener((DialogInterface.OnCancelListener)e2);
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
                CharSequence charSequence = new StringBuilder();
                charSequence.append(cYh.d("23352D34233F497E6F"));
                charSequence.append(string);
                SpiderDebug.log((String)charSequence.toString());
                charSequence = String.format(cYh.d("1C723334262F0223352275603C2B6333383E1E727B2A753E15393734083303727B737229457C63373E36020F28357560457532732A7645382430333F1523636B2C78243F2F253234137D1528273F456A6330272A0B3922302333083E6E3B243509723C7D753303727B737229457C633C322E0F3F25736D78371F120575764525333D7560457F27383B3F4834243D322E02723C0C7B781535323E22280435636B753C0E3C24732A"), p2.h.d(), string, string);
                int n2 = p2.l(cYh.d("06343338213F4826737E353B133329"), (String)charSequence, true).length();
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
                    if (string.startsWith(cYh.d("0F243521"))) break block2;
                    if (string.length() == 32) break block3;
                    if (!string.contains(cYh.d("5D"))) break block4;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(cYh.d("0F2435216D7548"));
                    stringBuilder.append(string);
                    stringBuilder.append(cYh.d("4820333E2F2358342E6C36360E763528273F5A242E3A3234"));
                    string = stringBuilder.toString();
                }
                string = com.github.catvod.spider.merge.h.b.h(string, null, null);
            }
            p2.L(string);
        }
    }

    public static /* synthetic */ void f(p p2) {
        p2.n();
    }

    public static void g(p p2, c object) {
        p2.getClass();
        object = com.github.catvod.spider.merge.d.c.g(com.github.catvod.spider.merge.h.b.e(((c)object).d())).b().c();
        if (object != null && ((c)object).f()) {
            object = ((c)object).e();
            p2.L((String)object);
            object = Init.d.getString(cYh.d("063C280E2331"), "").equals(object) ? cYh.d("133F2A3439BDDBC3A4FCCFBCEFC0A4DBC8B5DBD1") : cYh.d("133F2A3439BDDBC3A4FCCFBFC3E1A9E5F2B5DBD1");
            Init.show((String)object);
            object = cYh.d("81D8D1B4DDC5");
        } else {
            p2.L("");
            object = cYh.d("82F4F0B9E3FF");
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
            layoutParams.setMargins(com.github.catvod.spider.merge.j.o.a(16), com.github.catvod.spider.merge.j.o.a(16), com.github.catvod.spider.merge.j.o.a(16), com.github.catvod.spider.merge.j.o.a(16));
            FrameLayout frameLayout = new FrameLayout((Context)Init.context());
            EditText editText = new EditText((Context)Init.context());
            frameLayout.addView((View)editText, (ViewGroup.LayoutParams)layoutParams);
            AlertDialog.Builder builder = new AlertDialog.Builder((Context)Init.getActivity());
            AlertDialog.Builder builder2 = builder.setTitle((CharSequence)cYh.d("8FFFF6B9E9C982D5E4053831023E")).setView((View)frameLayout);
            String string = cYh.d("81D9EAB6F7DB");
            f f2 = new f(p2);
            AlertDialog.Builder builder3 = builder2.setNeutralButton((CharSequence)string, (DialogInterface.OnClickListener)f2).setNegativeButton(0x1040000, null);
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
        object2 = com.github.catvod.spider.merge.h.b.f((String)object, object2.toString(), this.q());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((com.github.catvod.spider.merge.h.d)object2).b());
        String string = cYh.d("4B");
        stringBuilder.append(string);
        stringBuilder.append((String)object);
        stringBuilder.append(string);
        stringBuilder.append(((com.github.catvod.spider.merge.h.d)object2).a());
        SpiderDebug.log((String)stringBuilder.toString());
        if (!((com.github.catvod.spider.merge.h.d)object2).a().contains(cYh.d("333F2E711A3B09296103322B1235322524"))) {
            bl = false;
        } else {
            Init.show(cYh.d("81E4D6B7E3CD80CDE0B4C7FD88ECCD053835471D203F2E7A3535302432291323A2D1D5"));
            object = this.g;
            ((com.github.catvod.spider.merge.d.f)object).a();
            ((com.github.catvod.spider.merge.d.f)object).e();
            bl = true;
        }
        if (bl) {
            return false;
        }
        object = com.github.catvod.spider.merge.d.f.d(((com.github.catvod.spider.merge.h.d)object2).a());
        ((com.github.catvod.spider.merge.d.f)object).e();
        this.g = object;
        return true;
    }

    private String l(String string, String string2, boolean bl) {
        if (!string.startsWith(cYh.d("0F24352124"))) {
            string = com.github.catvod.spider.merge.b.n.a(cYh.d("0F2435212460487F20213E74063C28282234032228273274043F2C7E"), string);
        }
        com.github.catvod.spider.merge.h.d d2 = com.github.catvod.spider.merge.h.b.f(string, string2, this.r());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d2.b());
        String string3 = cYh.d("4B");
        stringBuilder.append(string3);
        stringBuilder.append(string);
        stringBuilder.append(string3);
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
        ((StringBuilder)charSequence).append(cYh.d("243F3128797449"));
        ((StringBuilder)charSequence).append(string);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        charSequence = this.f;
        String string2 = this.h.d();
        charSequence = String.format(cYh.d("1C723334262F0223352275603C2B6333383E1E727B2A753C0E3C240E3E3E456A637424784B7232393628020F28357560457532737B780625353E0828023E203C32785D243324327645242E0E273B15352F25083C0E3C240E3E3E456A6323383513726D73233538343338213F383925736D784223632C7B780F352035322814727B2A7519083E3534392E4A04382132785D72202127360E3320253E35097F2B223834452D6D733E3E456A63617576453D24253F3503727B7307153404637D752F153C636B757501392D347839082038732A074B72333424351222223475604536283D32781A"), string, charSequence, string2);
        charSequence = this.l(cYh.d("06343338213F4826737E353B133329"), (String)charSequence, true);
        if (((String)charSequence).contains(cYh.d("213F33333E3E03352F1F380A02222C3824290E3F2F7F11330B35"))) {
            return this.m(string);
        }
        return new JSONObject((String)charSequence).getJSONArray(cYh.d("153532213834143532")).getJSONObject(0).getJSONObject(cYh.d("053F2528")).getString(cYh.d("01392D34083303"));
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
        String string = this.h.c();
        hashMap.put(cYh.d("0625353938280E2A20253E3509"), string);
        string = this.e;
        hashMap.put(cYh.d("1F7D32393628027D353E3C3F09"), string);
        hashMap.put(cYh.d("3F7D0230393B1529"), cYh.d("043C2834392E5A112F3525350E346D30272A5A3125233E2C027C373425290E3F2F6C216E49636F60"));
        return hashMap;
    }

    private String t(JSONObject jSONObject, String string) {
        String string2;
        String string3 = cYh.d("0B393734082E15312F22343503392F36082E06232A0E3B331424");
        if (!jSONObject.has(string3)) {
            return "";
        }
        string3 = jSONObject.getJSONArray(string3);
        int n2 = 0;
        while (true) {
            int n3 = string3.length();
            string2 = cYh.d("12222D");
            if (n2 >= n3) break;
            JSONObject jSONObject2 = string3.getJSONObject(n2);
            if (jSONObject2.getString(cYh.d("13352C213B3B13351E3833")).equals(((HashMap)this.a).get(string))) {
                return jSONObject2.getString(string2);
            }
            ++n2;
        }
        if (string.equals(cYh.d("59620A6D"))) {
            return this.t(jSONObject, cYh.d("59B8F7D4B1E2E26C"));
        }
        return string3.getJSONObject(0).getString(string2);
    }

    private List<com.github.catvod.spider.merge.c.e> u(JSONObject jSONObject) {
        Object object = cYh.d("0B393734082E15312F22343503392F360829123235382336020F35302431383C282223");
        if (!jSONObject.has((String)object)) {
            return Collections.emptyList();
        }
        jSONObject = jSONObject.getJSONArray((String)object);
        object = new ArrayList();
        for (int i2 = 0; i2 < jSONObject.length(); ++i2) {
            Object object2 = jSONObject.getJSONObject(i2);
            String string = object2.getString(cYh.d("0B312F36223B0035"));
            object2 = object2.getString(cYh.d("12222D"));
            com.github.catvod.spider.merge.c.e e2 = new com.github.catvod.spider.merge.c.e();
            e2.d((String)object2);
            e2.c(string);
            e2.b(string);
            ((ArrayList)object).add(e2.a(cYh.d("112435")));
        }
        return object;
    }

    public final String F(String[] object, String string) {
        try {
            Object object2 = this.y(object[0]);
            string = this.t((JSONObject)object2, string);
            object = this.v((String[])object);
            object2 = this.u((JSONObject)object2);
            ((ArrayList)object).addAll(object2);
            object2 = new com.github.catvod.spider.merge.c.d();
            ((com.github.catvod.spider.merge.c.d)object2).i(string);
            ((com.github.catvod.spider.merge.c.d)object2).h((List<com.github.catvod.spider.merge.c.e>)object);
            ((com.github.catvod.spider.merge.c.d)object2).a(this.q());
            object = ((com.github.catvod.spider.merge.c.d)object2).toString();
            return object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            com.github.catvod.spider.merge.c.d d2 = new com.github.catvod.spider.merge.c.d();
            d2.i("");
            return d2.toString();
        }
    }

    public final Object[] H(Map<String, String> object) {
        byte[] byArray = com.github.catvod.spider.merge.h.b.b(this.p(object.get(cYh.d("01392D34083303"))), this.r()).body().bytes();
        int n2 = com.github.catvod.spider.merge.j.o.a;
        String string = cYh.d("20120A");
        Charset charset = Charset.forName(string);
        object = byArray;
        if (Arrays.equals(byArray, new String(byArray, charset).getBytes(charset))) {
            object = new String(byArray, Charset.forName(string)).getBytes(cYh.d("3204077C6F"));
        }
        return new Object[]{200, cYh.d("0620313D3E390624283E3975083335342377142433343637"), new ByteArrayInputStream((byte[])object)};
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void J(String string) {
        String string2;
        block12: {
            String string3;
            String string4;
            block11: {
                boolean bl;
                block10: {
                    bl = string.isEmpty();
                    string4 = cYh.d("3C0E007C0D3B4A2A717C6E07");
                    string2 = "";
                    if (!bl) break block10;
                    string3 = cYh.d("0F2435212460487F22302374043F2D303A3309246F323B2F057F203D3E77133F2A34392E");
                    break block11;
                }
                String string5 = cYh.d("82DEDEB6C3E1");
                bl = string.contains(string5);
                String string6 = cYh.d("8FE6C4B7EFDF");
                if (!bl && !string.contains(cYh.d("59B5CFCEB0CEDC6C"))) {
                    if (string.contains(string6) || string.contains(cYh.d("59B8F7D4B1E2E26C"))) {
                        this.i = string6;
                    }
                } else {
                    this.i = string5;
                }
                if (string.contains(string3 = cYh.d("8FE0C2B9F8CF81F8E0B4EBD5"))) {
                    this.j = true;
                }
                string = string3 = string.replace(string6, "").replace(string5, "").replace(cYh.d("59620A6D"), "").replace(cYh.d("596C"), "").replace(cYh.d("81C9EFB6C3E1"), "").replace(string3, "");
                if (!string3.startsWith(cYh.d("0F243521"))) break block12;
            }
            string = com.github.catvod.spider.merge.h.b.h(string3, null, null).replaceAll(string4, "");
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
            ((com.github.catvod.spider.merge.d.f)object).a();
            ((com.github.catvod.spider.merge.d.f)object).e();
        }
        if (!this.x().exists()) {
            object = this.h;
            ((com.github.catvod.spider.merge.d.g)object).a();
            ((com.github.catvod.spider.merge.d.g)object).g();
        }
        this.f = string;
        try {
            SpiderDebug.log((String)cYh.d("1535272332290F032930253F333F2A343974497E"));
            string = new JSONObject();
            string.put(cYh.d("1438202332050E34"), (Object)this.f);
            string.put(cYh.d("143820233205172725"), (Object)"");
            string = this.G(cYh.d("11626E223F3B15351E3D3E340C7F26342305143820233205133F2A3439"), (JSONObject)string);
            object = new JSONObject(string);
            this.e = object.getString(cYh.d("143820233205133F2A3439"));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Init.show(cYh.d("81CDE4B7CEC082C5E7BEEBD68FFFE4B4DFDC83EAEAB4E0E882F4F0B7C2D284D0C3"));
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
            ((StringBuilder)charSequence).append(cYh.d("00353515382D093C2E30330F153C6F7F79"));
            ((StringBuilder)charSequence).append((String)object);
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            ((ArrayList)this.b).add(0, this.m((String)object));
            object = new JSONObject();
            object.put(cYh.d("01392D34083303"), ((ArrayList)this.b).get(0));
            object.put(cYh.d("0322282732050E34"), (Object)this.h.d());
            object = this.C(cYh.d("0820243F11330B356E36322E233F363F3B35063414233B"), object.toString(), true);
            charSequence = new JSONObject((String)object);
            charSequence = charSequence.getString(cYh.d("12222D"));
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
        hashMap.put(cYh.d("322324237A1B00352F25"), cYh.d("2A3F3B383B36067F747F677A4F07283F33351023611F037A56606F616C7A30392F676361472877657E7A2620313D320D02320A3823755263767F646C47780A1903172B7C613D3E31027006343431087961123F28083D247E6E6E49606F65616A517E74657709063620233E755263767F646C"));
        hashMap.put(cYh.d("35352734253F15"), cYh.d("0F2435212460487F36262074063C28282234032228273274043F2C7E"));
        return hashMap;
    }

    public final File s() {
        return new File(Init.context().getCacheDir(), cYh.d("063C28282234032228273205083134253F"));
    }

    public final List<com.github.catvod.spider.merge.c.e> v(String[] stringArray) {
        ArrayList<com.github.catvod.spider.merge.c.e> arrayList = new ArrayList<com.github.catvod.spider.merge.c.e>();
        for (String string : stringArray) {
            Object object = cYh.d("271001");
            if (!string.contains((CharSequence)object)) continue;
            Object object2 = string.split((String)object);
            object = object2[0];
            string = object2[1];
            Object object3 = new StringBuilder();
            ((StringBuilder)object3).append(Proxy.getUrl());
            ((StringBuilder)object3).append(cYh.d("58342E6C36360E763528273F5A233433713C0E3C240E3E3E5A"));
            ((StringBuilder)object3).append(object2[2]);
            object2 = ((StringBuilder)object3).toString();
            object3 = new com.github.catvod.spider.merge.c.e();
            ((com.github.catvod.spider.merge.c.e)object3).c((String)object);
            object = ((com.github.catvod.spider.merge.c.e)object3).a(string);
            ((com.github.catvod.spider.merge.c.e)object).d((String)object2);
            arrayList.add((com.github.catvod.spider.merge.c.e)object);
        }
        return arrayList;
    }

    public final Object[] w() {
        return new Object[]{200, cYh.d("13353925782A0B31283F"), new ByteArrayInputStream(this.h.e().getBytes())};
    }

    public final File x() {
        return new File(Init.context().getCacheDir(), cYh.d("063C2828223403222827320512232423"));
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
            charSequence.append(cYh.d("003535073E3E023F1123322C0E3536013B3B1E192F373874497E"));
            charSequence.append(string);
            SpiderDebug.log((String)charSequence.toString());
            ((ArrayList)this.b).add(0, this.m(string));
            string = new JSONObject();
            string.put(cYh.d("01392D34083303"), ((ArrayList)this.b).get(0));
            string.put(cYh.d("0322282732050E34"), (Object)this.h.d());
            string.put(cYh.d("0431353430351529"), (Object)cYh.d("0B393734082E15312F22343503392F36"));
            string.put(cYh.d("12222D0E32221739333408290233"), (Object)cYh.d("5664756167"));
            charSequence = this.C(cYh.d("0820243F11330B356E36322E31392534380A15353738322D373C20281E34013F"), string.toString(), true);
            string = new JSONObject((String)charSequence);
            string = string.getJSONObject(cYh.d("113925343805172224273E3F100F313D362338392F3738"));
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
    public final com.github.catvod.spider.merge.c.g z(String var1_1, String var2_2) {
        block19: {
            var6_3 = var1_1;
            var7_4 = new JSONObject();
            var1_1 = this.f;
            var7_4.put(cYh.d("1438202332050E34"), (Object)var1_1);
            var8_5 = new JSONObject(this.G(cYh.d("06343338213F4826727E24320622240E3B33093B6E36322E38232930253F3832380E3634083E383C382F14"), (JSONObject)var7_4));
            var10_6 = new ArrayList<com.github.catvod.spider.merge.d.e>();
            var7_4 = new ArrayList<E>();
            var1_1 = var8_5.getJSONArray(cYh.d("01392D34083309362E22"));
            var5_7 = TextUtils.isEmpty((CharSequence)var2_2);
            var4_8 = 0;
            if (!var5_7) {
                var1_1 = var2_2;
            } else if (var1_1.length() == 0) {
                while (true) {
                    var1_1 = "";
                    break;
                }
            } else {
                var2_2 = var1_1.getJSONObject(0);
                if (var2_2.getString((String)(var1_1 = cYh.d("13293134"))).equals(cYh.d("013F2D353228"))) {
                    var1_1 = var2_2.getString(cYh.d("01392D34083303"));
                } else {
                    if (!var2_2.getString((String)var1_1).equals(cYh.d("01392D34")) || !var2_2.getString(cYh.d("0431353430351529")).equals(cYh.d("1139253438"))) ** continue;
                    var1_1 = cYh.d("153F2E25");
                }
            }
            this.B(new com.github.catvod.spider.merge.d.e((String)var1_1), (List<com.github.catvod.spider.merge.d.e>)var10_6, (List<com.github.catvod.spider.merge.d.e>)var7_4, "");
            var1_1 = this.i;
            var5_7 = cYh.d("8FE6C4B7EFDF").equals(var1_1);
            var9_9 = cYh.d("59620A6D");
            var11_10 = cYh.d("59B5CFCEB0CEDC6C");
            var1_1 = cYh.d("59B8F7D4B1E2E26C");
            if (var5_7) {
                var1_1 = Arrays.asList(new String[]{var1_1, var11_10, var9_9});
            } else {
                var2_2 = this.i;
                var1_1 = cYh.d("82DEDEB6C3E1").equals(var2_2) != false ? Arrays.asList(new String[]{var11_10, var9_9, var1_1}) : Arrays.asList(new String[]{var9_9, var11_10, var1_1});
            }
            var2_2 = new ArrayList<E>();
            var9_9 = new ArrayList<E>();
            var11_10 = var10_6.iterator();
            while (true) {
                if (!var11_10.hasNext()) break;
                var12_12 = (com.github.catvod.spider.merge.d.e)var11_10.next();
                var10_6 = new StringBuilder();
                var10_6.append(var12_12.b());
                var10_6.append(cYh.d("43"));
                var10_6.append(var12_12.d());
                var13_13 = var12_12.f();
                var12_12 = new ArrayList<E>();
                var16_16 = com.github.catvod.spider.merge.j.o.e((String)var13_13).toLowerCase();
                var14_14 = var7_4.iterator();
                while (var14_14.hasNext()) {
                    var13_13 = (com.github.catvod.spider.merge.d.e)var14_14.next();
                    var15_15 = com.github.catvod.spider.merge.j.o.e(var13_13.f()).toLowerCase();
                    if (!var16_16.contains((CharSequence)var15_15) && !var15_15.contains(var16_16)) continue;
                    var12_12.add(var13_13);
                }
                if (var12_12.isEmpty()) {
                    var12_12.addAll(var7_4);
                }
                var13_13 = new StringBuilder();
                var12_12 = var12_12.iterator();
                while (var12_12.hasNext()) {
                    var15_15 = (com.github.catvod.spider.merge.d.e)var12_12.next();
                    var13_13.append(cYh.d("4C"));
                    var13_13.append(com.github.catvod.spider.merge.j.o.e(var15_15.f()));
                    var14_14 = cYh.d("271001");
                    var13_13.append((String)var14_14);
                    var13_13.append(var15_15.c());
                    var13_13.append((String)var14_14);
                    var13_13.append(var15_15.d());
                }
                var10_6.append(var13_13.toString());
                var2_2.add(var10_6.toString());
            }
            for (var3_11 = var4_8; var3_11 < var1_1.size(); ++var3_11) {
                var9_9.add(TextUtils.join((CharSequence)cYh.d("44"), (Iterable)var2_2));
            }
            var10_6 = new com.github.catvod.spider.merge.c.g();
            var10_6.e(var6_3);
            var14_14 = this.h.e();
            var5_7 = this.j;
            var13_13 = cYh.d("88ECCDB8C4E481DEE4BEEBC0");
            var12_12 = cYh.d("88ECCDB7C5F781C4FF");
            var11_10 = cYh.d("14382023320509312C34");
            if (!var5_7 || var14_14.length() <= 0 || !Init.d.getString(cYh.d("063C280E2331"), "").equals(var14_14)) break block19;
            var7_4 = new StringBuilder();
            var2_2 = cYh.d("81FDE2B4CBF283EDFEB6C3F281D9EAB6F7DB82FDD9B4D5F2133F2A3439B5DBCA");
            ** GOTO lbl105
        }
        if (this.j && var14_14.length() > 0) {
            var7_4 = new StringBuilder();
            var2_2 = cYh.d("81FDE2B4CBF283EDFEB6C3F28ED5CCB6EAF483E8ECB6CDDE133F2A3439B5DBCA");
lbl105:
            // 2 sources

            var7_4.append((String)var2_2);
            var7_4.append((String)var14_14);
            var7_4.append((String)var12_12);
            var7_4.append(var8_5.getString((String)var11_10));
            var7_4.append((String)var13_13);
            var7_4.append(var6_3);
            var2_2 = var7_4.toString();
        } else {
            var2_2 = var6_3;
            if (p.l.length() > 0) {
                var2_2 = p.l;
            }
        }
        var10_6.c((String)var2_2);
        if (p.m.length() > 0) {
            var10_6.d(p.m);
        }
        if (p.n.length() > 0) {
            var10_6.b(p.n);
        }
        var10_6.g(var8_5.getString(cYh.d("062620253628")));
        var10_6.f(var8_5.getString((String)var11_10));
        var2_2 = cYh.d("437465");
        var10_6.i(TextUtils.join((CharSequence)var2_2, (Iterable)var9_9));
        var10_6.h(TextUtils.join((CharSequence)var2_2, var1_1));
        var10_6.a(cYh.d("8EC8FEB8D0D683EAD0B6CCC2"));
        return var10_6;
    }
}

