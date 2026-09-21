package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.c.d;
import com.github.catvod.spider.merge.c.e;
import com.github.catvod.spider.merge.c.g;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.h.C0149b;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.j.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class PushAgent extends Ali {
    private List<e> a(String str) {
        ArrayList arrayList = new ArrayList();
        String d = cYh.d("01392D346D7548");
        if (str.startsWith(d)) {
            File file = new File(str.replace(d, ""));
            if (file.getParentFile() != null) {
                File[] listFiles = file.getParentFile().listFiles();
                listFiles.getClass();
                for (File file2 : listFiles) {
                    String b = o.b(file2.getName());
                    if (o.d(b)) {
                        e eVar = new e();
                        eVar.c(o.e(file2.getName()));
                        e a = eVar.a(b);
                        StringBuilder b2 = C0059d.b(d);
                        b2.append(file2.getAbsolutePath());
                        a.d(b2.toString());
                        arrayList.add(a);
                    }
                }
            }
        }
        if (str.startsWith(cYh.d("0F2435216D7548"))) {
            try {
                List asList = Arrays.asList(cYh.d("0A2075"), cYh.d("0A3B37"));
                List<String> asList2 = Arrays.asList(cYh.d("142235"), cYh.d("062332"));
                if (asList.contains(o.b(str))) {
                    for (String str2 : asList2) {
                        String concat = o.e(str).concat(cYh.d("49")).concat(str2);
                        if (C0149b.a(concat).code() == 200) {
                            String lastPathSegment = Uri.parse(concat).getLastPathSegment();
                            e eVar2 = new e();
                            eVar2.c(lastPathSegment);
                            e a2 = eVar2.a(str2);
                            a2.d(concat);
                            arrayList.add(a2);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    private g b(String str) {
        List asList;
        g gVar = new g();
        gVar.e(str);
        gVar.f(str);
        gVar.a(cYh.d("3F121100"));
        gVar.g(cYh.d("0F2435212460487F31383474153D237F353E142420253E3949332E3C78380D386E60336A05607335673C52672761366E55627160316355332033366F5660763433740D202436"));
        boolean d = m.d(str);
        String d2 = cYh.d("82C7C4B7D9F8");
        String d3 = cYh.d("8FF7E2B7C9CA");
        if (d) {
            asList = Arrays.asList(d3, d2, cYh.d("80CBF5B8C4E4"));
        } else {
            boolean c = m.c(str);
            String d4 = cYh.d("80CBF5B9E8C4");
            asList = (c || str.startsWith(cYh.d("0A31263F322E"))) ? Arrays.asList(d4, d2, d3) : Arrays.asList(d2, d3, d4);
        }
        String d5 = cYh.d("437465");
        gVar.h(TextUtils.join(d5, asList));
        String d6 = cYh.d("81C2ECB7C3E443");
        gVar.i(TextUtils.join(d5, Arrays.asList(n.a(d6, str), n.a(d6, str), n.a(d6, str))));
        return gVar;
    }

    public String detailContent(List<String> list) {
        try {
            String trim = list.get(0).trim();
            boolean contains = trim.contains(cYh.d("0A31263F322E"));
            String d = cYh.d("4361");
            if (contains) {
                trim = trim.replaceAll(cYh.d("3C0C120D24074D782C30303402247B0D6822136D34233960052428396D01577D78307A3C267D070C2C6E572D680A0B093B231C7B"), d);
            }
            if (trim.contains(cYh.d("0F2435212460487F36262074063C28282234032228273274043F2C7E2475"))) {
                trim = trim.replaceAll(cYh.d("3C0C120D24074D782925232A146A6E7E202D107E203D3E23123E25233E2C027E223E3A75147F1D022C6B562D680A0B093B231C7B"), d);
            }
            return trim.contains(cYh.d("063C282822340322282732")) ? super.detailContent(list) : d.e(b(trim));
        } catch (Exception unused) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (str2.contains(cYh.d("1E3F34252238027E223E3A"))) {
                d dVar = new d();
                dVar.i(Youtube.fetch(str2));
                return dVar.toString();
            }
            if (str.equals(cYh.d("80CBF5B9E8C4"))) {
                d dVar2 = new d();
                dVar2.i(str2);
                dVar2.h(a(str2));
                return dVar2.toString();
            }
            if (str.equals(cYh.d("82C7C4B7D9F8"))) {
                d dVar3 = new d();
                dVar3.d();
                dVar3.i(str2);
                return dVar3.toString();
            }
            if (str.equals(cYh.d("8FF7E2B7C9CA"))) {
                d dVar4 = new d();
                dVar4.d();
                dVar4.b();
                dVar4.i(str2);
                return dVar4.toString();
            }
            return super.playerContent(str, str2, list);
        } catch (Exception unused) {
            return "";
        }
    }
}
