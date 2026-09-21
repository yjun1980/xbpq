package com.github.catvod.spider.merge.b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0057b;
import com.github.catvod.spider.merge.d.C0058c;
import com.github.catvod.spider.merge.h.C0149b;
import com.google.gson.Gson;
import com.google.net.cronet.okhttptransport.CronetInterceptor;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {
    public static String l = "";
    public static String m = "";
    public static String n = "";
    private final Map<String, String> a;
    private AlertDialog c;
    private String d;
    private String e;
    private String f;
    private com.github.catvod.spider.merge.d.f g;
    private com.github.catvod.spider.merge.d.g h;
    private String i = cYh.d("551B");
    private boolean j = false;
    private String k = "";
    private final List<String> b = new ArrayList();

    public p() {
        String str;
        String str2 = "";
        try {
            str = com.github.catvod.spider.merge.j.l.e(new FileInputStream(s()));
        } catch (Exception unused) {
            str = "";
        }
        this.g = com.github.catvod.spider.merge.d.f.d(str);
        try {
            str2 = com.github.catvod.spider.merge.j.l.e(new FileInputStream(x()));
        } catch (Exception unused2) {
        }
        this.h = com.github.catvod.spider.merge.d.g.f(str2);
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put(cYh.d("59620A6D"), cYh.d("361805"));
        hashMap.put(cYh.d("59B8F7D4B1E2E26C"), cYh.d("211805"));
    }

    private void A(com.github.catvod.spider.merge.d.e eVar, List<com.github.catvod.spider.merge.d.e> list, List<com.github.catvod.spider.merge.d.e> list2) {
        B(eVar, list, list2, "");
    }

    private void B(com.github.catvod.spider.merge.d.e eVar, List<com.github.catvod.spider.merge.d.e> list, List<com.github.catvod.spider.merge.d.e> list2, String str) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        jSONObject.put(cYh.d("0B392C3823"), 200);
        jSONObject.put(cYh.d("1438202332050E34"), this.f);
        jSONObject.put(cYh.d("17313334392E3836283D32050E34"), eVar.d());
        jSONObject.put(cYh.d("0822253425050529"), cYh.d("09312C34"));
        jSONObject.put(cYh.d("08222534250503393334342E0E3F2F"), cYh.d("260302"));
        if (str.length() > 0) {
            jSONObject.put(cYh.d("0A31333A3228"), str);
        }
        com.github.catvod.spider.merge.d.e eVar2 = (com.github.catvod.spider.merge.d.e) new Gson().fromJson(l(cYh.d("06343338213F4826727E31330B356E3D3E2913"), jSONObject.toString(), true), com.github.catvod.spider.merge.d.e.class);
        for (com.github.catvod.spider.merge.d.e eVar3 : eVar2.e()) {
            if (eVar3.h().equals(cYh.d("013F2D353228"))) {
                arrayList.add(eVar3);
            } else if (eVar3.a().equals(cYh.d("1139253438")) || eVar3.a().equals(cYh.d("0625253838"))) {
                eVar3.i(eVar.f());
                list.add(eVar3);
            } else if (com.github.catvod.spider.merge.j.o.d(eVar3.c())) {
                list2.add(eVar3);
            }
        }
        if (eVar2.g().length() > 0) {
            B(eVar, list, list2, eVar2.g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A((com.github.catvod.spider.merge.d.e) it.next(), list, list2);
        }
    }

    private String C(String str, String str2, boolean z) {
        boolean z2;
        if (!str.startsWith(cYh.d("0F24352124"))) {
            str = n.a(cYh.d("0F2435212460487F2E21323449312D382E2F09343338213F49332E3C783B03222827327511616F6178"), str);
        }
        HashMap<String, String> q = q();
        q.put(cYh.d("0625353938280E2A20253E3509"), this.g.b());
        com.github.catvod.spider.merge.h.d f = C0149b.f(str, str2, q);
        StringBuilder sb = new StringBuilder();
        sb.append(f.b());
        String d = cYh.d("4B");
        sb.append(d);
        sb.append(str);
        sb.append(d);
        sb.append(f.a());
        SpiderDebug.log(sb.toString());
        if (z && (f.b() == 400 || f.b() == 401)) {
            String d2 = cYh.d("1535272332290F0F353E3C3F09");
            try {
                if (this.g.c().isEmpty()) {
                    z2 = E();
                } else {
                    SpiderDebug.log(cYh.d("1535272332290F1F3134390E083B243F797449"));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(cYh.d("0022203F230513293134"), d2);
                    jSONObject.put(d2, this.g.c());
                    z2 = k(cYh.d("0F2435212460487F20213E7704366F3F397404396E303B3314246E303B33383F31343975133F2A3439"), jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
                com.github.catvod.spider.merge.d.f fVar = this.g;
                fVar.a();
                fVar.e();
                z2 = false;
            }
            if (z2) {
                return C(str, str2, false);
            }
        }
        return f.a();
    }

    private boolean D(String str) {
        try {
            SpiderDebug.log(cYh.d("281134253F7A35352538253F04246F7F79"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(cYh.d("043F2534"), str);
            jSONObject.put(cYh.d("0022203F230513293134"), cYh.d("0625353938280E2A20253E35090F223E333F"));
            return k(cYh.d("0F2435212460487F20213E7704366F3F397404396E303B3314246E303B33383F31343975043F2534"), jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            com.github.catvod.spider.merge.d.f fVar = this.g;
            fVar.a();
            fVar.e();
            return false;
        }
    }

    private boolean E() {
        try {
            SpiderDebug.log(cYh.d("281134253F7A353530243229137E6F7F"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(cYh.d("0625353938280E2A24"), 1);
            jSONObject.put(cYh.d("14332E2132"), cYh.d("122324236D380623247D31330B357B303B365D222430337601392D346D3B0B3C7B2625331335"));
            return D(((C0057b) new Gson().fromJson(l(cYh.d("0F2435212460487F2E21323449312D382E2F09343338213F49332E3C783506253539782F14353322783B1224293E25331D357E323B33023E350E3E3E5A677768666D04332232336E53647032646353657630676E01667169633C05622777253F03393334342E382533386A32132431226D7548312D38242E493E2F7F343348242E3E3B75063C2828223403222827327504312D3D353B043B6722343517357C24243F156A2330243F4B36283D3260063C2D6B253F06346D373E36026A203D3B6010222825327C142420253267"), jSONObject.toString(), true), C0057b.class)).a());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String G(String str, JSONObject jSONObject) {
        if (!str.startsWith(cYh.d("0F24352124"))) {
            str = n.a(cYh.d("0F2435212460487F20213E74063C28282234032228273274043F2C7E"), str);
        }
        com.github.catvod.spider.merge.h.d f = C0149b.f(str, jSONObject.toString(), q());
        StringBuilder sb = new StringBuilder();
        sb.append(f.b());
        String d = cYh.d("4B");
        sb.append(d);
        sb.append(str);
        sb.append(d);
        sb.append(f.a());
        SpiderDebug.log(sb.toString());
        return f.a();
    }

    private boolean I() {
        String d = cYh.d("1535272332290F0F353E3C3F09");
        try {
            SpiderDebug.log(cYh.d("1535272332290F112232322914042E3A3234497E6F"));
            JSONObject jSONObject = new JSONObject();
            String str = this.d;
            if (str.isEmpty()) {
                str = this.h.e();
            }
            if (str.startsWith(cYh.d("0F243521"))) {
                str = C0149b.h(str, null, null).trim();
            }
            jSONObject.put(d, str);
            jSONObject.put(cYh.d("0022203F230513293134"), d);
            String G = G(cYh.d("0F2435212460487F2024233249312D382E2F09343338213F49332E3C782C557F20323435123E357E23350C352F"), jSONObject);
            com.github.catvod.spider.merge.d.g f = com.github.catvod.spider.merge.d.g.f(G);
            f.g();
            this.h = f;
            if (f.b().isEmpty()) {
                throw new Exception(G);
            }
            this.d = str;
            return true;
        } catch (Exception unused) {
            if (this.d.length() > 0 && this.h.e().length() > 0 && !this.d.equals(this.h.e())) {
                this.d = "";
                if (I()) {
                    return true;
                }
            }
            int length = this.k.length();
            String d2 = cYh.d("1420");
            if (length < 1) {
                if (this.j) {
                    Init.show(cYh.d("8ED5CCB6EAF480CAC5253831023EA7C6F7BCF2D8AEEDD6"));
                }
                String string = Init.d.getString(cYh.d("063C280E2331"), "");
                this.d = string;
                if (string.length() > 0) {
                    this.k = d2;
                    if (I()) {
                        if (this.j) {
                            Init.show(cYh.d("83EDFEB6C3F280ECD2B4FAC2133F2A3439BCEFC0A4DBC8B5DBD1"));
                        }
                        return true;
                    }
                }
            }
            String str2 = this.k;
            String d3 = cYh.d("81D8D1B4DDC5");
            if (d3.equals(str2)) {
                Init.show(cYh.d("81D9EAB6F7DB80CAC5253831023EA7CDFDB2D2E7A5ECCBBDF3F8AEEDDBB2C8E7A8D6DAB2C8C5AEEDD6"));
            }
            if ("".equals(this.k) || d2.equals(this.k)) {
                if (d2.equals(this.k)) {
                    Init.show(cYh.d("80ECD2B4FAC2133F2A3439BFC3E1A7C4DF7B"));
                }
                if ("".equals(this.k)) {
                    this.k = d2;
                }
                com.github.catvod.spider.merge.d.g gVar = this.h;
                gVar.a();
                gVar.g();
                this.d = "";
                N();
                int i = com.github.catvod.spider.merge.j.o.a;
                if (Init.context().getPackageManager().hasSystemFeature(cYh.d("063E25233833037E2930253E103133347939063D24233674063E38")) && Init.context().getPackageManager().hasSystemFeature(cYh.d("063E25233833037E2930253E10313334792E023C24213F350929")) && Init.context().getPackageManager().hasSystemFeature(cYh.d("063E25233833037E2930253E1031333479380B25242538351338"))) {
                    Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.b.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            p.h(p.this);
                        }
                    });
                } else {
                    M();
                }
                if (d3.equals(this.k) && I()) {
                    if (this.j) {
                        Init.show(cYh.d("333F2A3439BCFBD9A7C4DFB5DBD1"));
                    }
                    return true;
                }
            }
            return false;
        }
    }

    private void L(String str) {
        if (str.length() > 0) {
            SharedPreferences.Editor edit = Init.d.edit();
            edit.putString(cYh.d("063C280E2331"), str);
            edit.apply();
            this.d = str;
            this.h.h(str);
        }
        N();
    }

    public void M() {
        final C0058c c = C0058c.g(C0149b.h(cYh.d("0F2435212460487F31302429173F3325793B0B393824393E153937347939083D6E3F322D0B3F263839751622223E333F4837243F32280624247F333558313121193B0A357C303B331E252F0E33280E2624773128083D1238233F5A657377362A171E203C3267063C2828223438343338213F4131312112341322203F343F5A2724337133141D2E333E36026D27303B2902762D30393D5A2A290E14144122242522280905333D6A7C05393B013628063D326C710505286C276A6849626F62"), null, null)).b().c();
        Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.b.b
            @Override // java.lang.Runnable
            public final void run() {
                p.b(p.this, c);
            }
        });
        while (this.d.length() < 1) {
            if (!cYh.d("1420").equals(this.k)) {
                return;
            } else {
                SystemClock.sleep(500L);
            }
        }
    }

    private void N() {
        Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.b.m
            @Override // java.lang.Runnable
            public final void run() {
                p.this.n();
            }
        });
    }

    public static void b(p pVar, final C0058c c0058c) {
        pVar.getClass();
        try {
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setGravity(17);
            TextView textView = new TextView(Init.context());
            textView.setText(cYh.d("8EC8FEB8D0D683EAD0B6CCC2260011B7DEF180F0C0B6CEE182EDD4"));
            textView.setLayoutParams(new LinearLayout.LayoutParams(com.github.catvod.spider.merge.j.o.a(240), com.github.catvod.spider.merge.j.o.a(25)));
            textView.setBackgroundColor(-1);
            textView.setGravity(17);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.github.catvod.spider.merge.j.o.a(240), com.github.catvod.spider.merge.j.o.a(240));
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(com.github.catvod.spider.merge.N.a.c(c0058c.a()));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            linearLayout.addView(frameLayout);
            linearLayout.addView(textView);
            AlertDialog show = new AlertDialog.Builder(Init.getActivity()).setView(linearLayout).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.b.e
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    final p pVar2 = p.this;
                    final C0058c c0058c2 = c0058c;
                    pVar2.getClass();
                    Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            p.g(p.this, c0058c2);
                        }
                    });
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.b.h
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    p.i(p.this);
                }
            }).show();
            pVar.c = show;
            show.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } catch (Exception unused) {
        }
    }

    public static void c(p pVar, EditText editText) {
        pVar.getClass();
        final String obj = editText.getText().toString();
        pVar.n();
        Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.d
            @Override // java.lang.Runnable
            public final void run() {
                p.e(p.this, obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public static void d(p pVar) {
        pVar.getClass();
        Iterator it = new ArrayList(pVar.b).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            boolean z = false;
            try {
                SpiderDebug.log(cYh.d("23352D34233F497E6F") + str);
                if (pVar.l(cYh.d("06343338213F4826737E353B133329"), String.format(cYh.d("1C723334262F0223352275603C2B6333383E1E727B2A753E15393734083303727B737229457C63373E36020F28357560457532732A7645382430333F1523636B2C78243F2F253234137D1528273F456A6330272A0B3922302333083E6E3B243509723C7D753303727B737229457C633C322E0F3F25736D78371F120575764525333D7560457F27383B3F4834243D322E02723C0C7B781535323E22280435636B753C0E3C24732A"), pVar.h.d(), str, str), true).length() == 211) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            if (z) {
                pVar.b.remove(str);
            }
        }
    }

    public static void e(p pVar, String str) {
        pVar.getClass();
        if (!str.startsWith(cYh.d("0F243521"))) {
            if (str.length() != 32) {
                if (!str.contains(cYh.d("5D"))) {
                    return;
                }
                str = cYh.d("0F2435216D7548") + str + cYh.d("4820333E2F2358342E6C36360E763528273F5A242E3A3234");
            }
            pVar.L(str);
        }
        str = C0149b.h(str, null, null);
        pVar.L(str);
    }

    public static void g(p pVar, C0058c c0058c) {
        String d;
        pVar.getClass();
        C0058c c = C0058c.g(C0149b.e(c0058c.d())).b().c();
        if (c == null || !c.f()) {
            pVar.L("");
            d = cYh.d("82F4F0B9E3FF");
        } else {
            String e = c.e();
            pVar.L(e);
            Init.show(Init.d.getString(cYh.d("063C280E2331"), "").equals(e) ? cYh.d("133F2A3439BDDBC3A4FCCFBCEFC0A4DBC8B5DBD1") : cYh.d("133F2A3439BDDBC3A4FCCFBFC3E1A9E5F2B5DBD1"));
            d = cYh.d("81D8D1B4DDC5");
        }
        pVar.k = d;
    }

    public static void h(p pVar) {
        pVar.getClass();
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(com.github.catvod.spider.merge.j.o.a(16), com.github.catvod.spider.merge.j.o.a(16), com.github.catvod.spider.merge.j.o.a(16), com.github.catvod.spider.merge.j.o.a(16));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            final EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            pVar.c = new AlertDialog.Builder(Init.getActivity()).setTitle(cYh.d("8FFFF6B9E9C982D5E4053831023E")).setView(frameLayout).setNeutralButton(cYh.d("81D9EAB6F7DB"), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.b.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    p.j(p.this);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.b.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    p.c(p.this, editText);
                }
            }).show();
        } catch (Exception unused) {
        }
    }

    public static void i(p pVar) {
        pVar.N();
    }

    public static void j(p pVar) {
        pVar.n();
        Init.execute(new i(pVar, 1));
    }

    private boolean k(String str, JSONObject jSONObject) {
        boolean z;
        com.github.catvod.spider.merge.h.d f = C0149b.f(str, jSONObject.toString(), q());
        StringBuilder sb = new StringBuilder();
        sb.append(f.b());
        String d = cYh.d("4B");
        sb.append(d);
        sb.append(str);
        sb.append(d);
        sb.append(f.a());
        SpiderDebug.log(sb.toString());
        if (f.a().contains(cYh.d("333F2E711A3B09296103322B1235322524"))) {
            Init.show(cYh.d("81E4D6B7E3CD80CDE0B4C7FD88ECCD053835471D203F2E7A3535302432291323A2D1D5"));
            com.github.catvod.spider.merge.d.f fVar = this.g;
            fVar.a();
            fVar.e();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        com.github.catvod.spider.merge.d.f d2 = com.github.catvod.spider.merge.d.f.d(f.a());
        d2.e();
        this.g = d2;
        return true;
    }

    private String l(String str, String str2, boolean z) {
        if (!str.startsWith(cYh.d("0F24352124"))) {
            str = n.a(cYh.d("0F2435212460487F20213E74063C28282234032228273274043F2C7E"), str);
        }
        com.github.catvod.spider.merge.h.d f = C0149b.f(str, str2, r());
        StringBuilder sb = new StringBuilder();
        sb.append(f.b());
        String d = cYh.d("4B");
        sb.append(d);
        sb.append(str);
        sb.append(d);
        sb.append(f.a());
        SpiderDebug.log(sb.toString());
        return (z && (f.b() == 400 || f.b() == 401) && I()) ? l(str, str2, false) : (z && f.b() == 429) ? l(str, str2, false) : f.a();
    }

    private String m(String str) {
        SpiderDebug.log(cYh.d("243F3128797449") + str);
        String l2 = l(cYh.d("06343338213F4826737E353B133329"), String.format(cYh.d("1C723334262F0223352275603C2B6333383E1E727B2A753C0E3C240E3E3E456A637424784B7232393628020F28357560457532737B780625353E0828023E203C32785D243324327645242E0E273B15352F25083C0E3C240E3E3E456A6323383513726D73233538343338213F383925736D784223632C7B780F352035322814727B2A7519083E3534392E4A04382132785D72202127360E3320253E35097F2B223834452D6D733E3E456A63617576453D24253F3503727B7307153404637D752F153C636B757501392D347839082038732A074B72333424351222223475604536283D32781A"), str, this.f, this.h.d()), true);
        return l2.contains(cYh.d("213F33333E3E03352F1F380A02222C3824290E3F2F7F11330B35")) ? m(str) : new JSONObject(l2).getJSONArray(cYh.d("153532213834143532")).getJSONObject(0).getJSONObject(cYh.d("053F2528")).getString(cYh.d("01392D34083303"));
    }

    public void n() {
        try {
            AlertDialog alertDialog = this.c;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static p o() {
        return o.a;
    }

    private HashMap<String, String> r() {
        HashMap<String, String> q = q();
        q.put(cYh.d("0625353938280E2A20253E3509"), this.h.c());
        q.put(cYh.d("1F7D32393628027D353E3C3F09"), this.e);
        q.put(cYh.d("3F7D0230393B1529"), cYh.d("043C2834392E5A112F3525350E346D30272A5A3125233E2C027C373425290E3F2F6C216E49636F60"));
        return q;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    private String t(JSONObject jSONObject, String str) {
        String d = cYh.d("0B393734082E15312F22343503392F36082E06232A0E3B331424");
        if (!jSONObject.has(d)) {
            return "";
        }
        JSONArray jSONArray = jSONObject.getJSONArray(d);
        int i = 0;
        while (true) {
            int length = jSONArray.length();
            String d2 = cYh.d("12222D");
            if (i >= length) {
                return str.equals(cYh.d("59620A6D")) ? t(jSONObject, cYh.d("59B8F7D4B1E2E26C")) : jSONArray.getJSONObject(0).getString(d2);
            }
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2.getString(cYh.d("13352C213B3B13351E3833")).equals(this.a.get(str))) {
                return jSONObject2.getString(d2);
            }
            i++;
        }
    }

    private List<com.github.catvod.spider.merge.c.e> u(JSONObject jSONObject) {
        String d = cYh.d("0B393734082E15312F22343503392F360829123235382336020F35302431383C282223");
        if (!jSONObject.has(d)) {
            return Collections.emptyList();
        }
        JSONArray jSONArray = jSONObject.getJSONArray(d);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(cYh.d("0B312F36223B0035"));
            String string2 = jSONObject2.getString(cYh.d("12222D"));
            com.github.catvod.spider.merge.c.e eVar = new com.github.catvod.spider.merge.c.e();
            eVar.d(string2);
            eVar.c(string);
            eVar.b(string);
            arrayList.add(eVar.a(cYh.d("112435")));
        }
        return arrayList;
    }

    public final String F(String[] strArr, String str) {
        try {
            JSONObject y = y(strArr[0]);
            String t = t(y, str);
            List<com.github.catvod.spider.merge.c.e> v = v(strArr);
            ((ArrayList) v).addAll(u(y));
            com.github.catvod.spider.merge.c.d dVar = new com.github.catvod.spider.merge.c.d();
            dVar.i(t);
            dVar.h(v);
            dVar.a(q());
            return dVar.toString();
        } catch (Exception e) {
            e.printStackTrace();
            com.github.catvod.spider.merge.c.d dVar2 = new com.github.catvod.spider.merge.c.d();
            dVar2.i("");
            return dVar2.toString();
        }
    }

    public final Object[] H(Map<String, String> map) {
        byte[] bytes = C0149b.b(p(map.get(cYh.d("01392D34083303"))), r()).body().bytes();
        int i = com.github.catvod.spider.merge.j.o.a;
        String d = cYh.d("20120A");
        Charset forName = Charset.forName(d);
        if (Arrays.equals(bytes, new String(bytes, forName).getBytes(forName))) {
            bytes = new String(bytes, Charset.forName(d)).getBytes(cYh.d("3204077C6F"));
        }
        return new Object[]{200, cYh.d("0620313D3E390624283E3975083335342377142433343637"), new ByteArrayInputStream(bytes)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r8.startsWith(com.github.catvod.spider.merge.cYh.d("0F243521")) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            java.lang.String r1 = "3C0E007C0D3B4A2A717C6E07"
            java.lang.String r1 = com.github.catvod.spider.merge.cYh.d(r1)
            r2 = 0
            java.lang.String r3 = ""
            if (r0 == 0) goto L1e
            java.lang.String r8 = "0F2435212460487F22302374043F2D303A3309246F323B2F057F203D3E77133F2A34392E"
            java.lang.String r8 = com.github.catvod.spider.merge.cYh.d(r8)
        L15:
            java.lang.String r8 = com.github.catvod.spider.merge.h.C0149b.h(r8, r2, r2)
            java.lang.String r8 = r8.replaceAll(r1, r3)
            goto L9b
        L1e:
            java.lang.String r0 = "82DEDEB6C3E1"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            boolean r4 = r8.contains(r0)
            java.lang.String r5 = "8FE6C4B7EFDF"
            java.lang.String r5 = com.github.catvod.spider.merge.cYh.d(r5)
            if (r4 != 0) goto L52
            java.lang.String r4 = "59B5CFCEB0CEDC6C"
            java.lang.String r4 = com.github.catvod.spider.merge.cYh.d(r4)
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L3d
            goto L52
        L3d:
            boolean r4 = r8.contains(r5)
            if (r4 != 0) goto L4f
            java.lang.String r4 = "59B8F7D4B1E2E26C"
            java.lang.String r4 = com.github.catvod.spider.merge.cYh.d(r4)
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L54
        L4f:
            r7.i = r5
            goto L54
        L52:
            r7.i = r0
        L54:
            java.lang.String r4 = "8FE0C2B9F8CF81F8E0B4EBD5"
            java.lang.String r4 = com.github.catvod.spider.merge.cYh.d(r4)
            boolean r6 = r8.contains(r4)
            if (r6 == 0) goto L63
            r6 = 1
            r7.j = r6
        L63:
            java.lang.String r8 = r8.replace(r5, r3)
            java.lang.String r8 = r8.replace(r0, r3)
            java.lang.String r0 = "59620A6D"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            java.lang.String r8 = r8.replace(r0, r3)
            java.lang.String r0 = "596C"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            java.lang.String r8 = r8.replace(r0, r3)
            java.lang.String r0 = "81C9EFB6C3E1"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            java.lang.String r8 = r8.replace(r0, r3)
            java.lang.String r8 = r8.replace(r4, r3)
            java.lang.String r0 = "0F243521"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L9b
            goto L15
        L9b:
            if (r8 != 0) goto L9e
            goto L9f
        L9e:
            r3 = r8
        L9f:
            r7.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.p.J(java.lang.String):void");
    }

    public final void K(String str) {
        if (!s().exists()) {
            com.github.catvod.spider.merge.d.f fVar = this.g;
            fVar.a();
            fVar.e();
        }
        if (!x().exists()) {
            com.github.catvod.spider.merge.d.g gVar = this.h;
            gVar.a();
            gVar.g();
        }
        this.f = str;
        try {
            SpiderDebug.log(cYh.d("1535272332290F032930253F333F2A343974497E"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(cYh.d("1438202332050E34"), this.f);
            jSONObject.put(cYh.d("143820233205172725"), "");
            this.e = new JSONObject(G(cYh.d("11626E223F3B15351E3D3E340C7F26342305143820233205133F2A3439"), jSONObject)).getString(cYh.d("143820233205133F2A3439"));
        } catch (Exception e) {
            e.printStackTrace();
            Init.show(cYh.d("81CDE4B7CEC082C5E7BEEBD68FFFE4B4DFDC83EAEAB4E0E882F4F0B7C2D284D0C3"));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final String p(String str) {
        String str2;
        l lVar;
        final int i = 0;
        try {
            try {
                SpiderDebug.log(cYh.d("00353515382D093C2E30330F153C6F7F79") + str);
                this.b.add(0, m(str));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(cYh.d("01392D34083303"), this.b.get(0));
                jSONObject.put(cYh.d("0322282732050E34"), this.h.d());
                str2 = new JSONObject(C(cYh.d("0820243F11330B356E36322E233F363F3B35063414233B"), jSONObject.toString(), true)).getString(cYh.d("12222D"));
                lVar = new l(this);
            } catch (Exception e) {
                e.printStackTrace();
                str2 = "";
                lVar = new l(this);
            }
            Init.execute(lVar);
            return str2;
        } catch (Throwable th) {
            Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.b.j
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            p.d((p) this);
                            return;
                        default:
                            CronetInterceptor.a((CronetInterceptor) this);
                            return;
                    }
                }
            });
            throw th;
        }
    }

    public final HashMap<String, String> q() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(cYh.d("322324237A1B00352F25"), cYh.d("2A3F3B383B36067F747F677A4F07283F33351023611F037A56606F616C7A30392F676361472877657E7A2620313D320D02320A3823755263767F646C47780A1903172B7C613D3E31027006343431087961123F28083D247E6E6E49606F65616A517E74657709063620233E755263767F646C"));
        hashMap.put(cYh.d("35352734253F15"), cYh.d("0F2435212460487F36262074063C28282234032228273274043F2C7E"));
        return hashMap;
    }

    public final File s() {
        return new File(Init.context().getCacheDir(), cYh.d("063C28282234032228273205083134253F"));
    }

    public final List<com.github.catvod.spider.merge.c.e> v(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String d = cYh.d("271001");
            if (str.contains(d)) {
                String[] split = str.split(d);
                String str2 = split[0];
                String str3 = split[1];
                String str4 = Proxy.getUrl() + cYh.d("58342E6C36360E763528273F5A233433713C0E3C240E3E3E5A") + split[2];
                com.github.catvod.spider.merge.c.e eVar = new com.github.catvod.spider.merge.c.e();
                eVar.c(str2);
                com.github.catvod.spider.merge.c.e a = eVar.a(str3);
                a.d(str4);
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public final Object[] w() {
        return new Object[]{200, cYh.d("13353925782A0B31283F"), new ByteArrayInputStream(this.h.e().getBytes())};
    }

    public final File x() {
        return new File(Init.context().getCacheDir(), cYh.d("063C2828223403222827320512232423"));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public final JSONObject y(String str) {
        try {
            try {
                SpiderDebug.log(cYh.d("003535073E3E023F1123322C0E3536013B3B1E192F373874497E") + str);
                this.b.add(0, m(str));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(cYh.d("01392D34083303"), this.b.get(0));
                jSONObject.put(cYh.d("0322282732050E34"), this.h.d());
                jSONObject.put(cYh.d("0431353430351529"), cYh.d("0B393734082E15312F22343503392F36"));
                jSONObject.put(cYh.d("12222D0E32221739333408290233"), cYh.d("5664756167"));
                JSONObject jSONObject2 = new JSONObject(C(cYh.d("0820243F11330B356E36322E31392534380A15353738322D373C20281E34013F"), jSONObject.toString(), true)).getJSONObject(cYh.d("113925343805172224273E3F100F313D362338392F3738"));
                Init.execute(new l(this));
                return jSONObject2;
            } catch (Exception e) {
                e.printStackTrace();
                JSONObject jSONObject3 = new JSONObject();
                Init.execute(new k(this, 0));
                return jSONObject3;
            }
        } catch (Throwable th) {
            Init.execute(new i(this, 0));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.github.catvod.spider.merge.c.g z(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.b.p.z(java.lang.String, java.lang.String):com.github.catvod.spider.merge.c.g");
    }
}
