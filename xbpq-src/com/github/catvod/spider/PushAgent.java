/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.github.catvod.spider.Ali
 *  com.github.catvod.spider.Youtube
 */
package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.Ali;
import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.c.e;
import com.github.catvod.spider.merge.c.g;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.h.b;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.j.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PushAgent
extends Ali {
    private List<e> a(String string) {
        Object object;
        CharSequence charSequence;
        Object object2;
        ArrayList<e> arrayList = new ArrayList<e>();
        Object object3 = cYh.d("01392D346D7548");
        if (string.startsWith((String)object3) && ((File)(object2 = new File(string.replace((CharSequence)object3, "")))).getParentFile() != null) {
            object2 = ((File)object2).getParentFile().listFiles();
            object2.getClass();
            for (Object object4 : object2) {
                charSequence = o.b(((File)object4).getName());
                if (!o.d((String)charSequence)) continue;
                object = new e();
                ((e)object).c(o.e(((File)object4).getName()));
                object = ((e)object).a((String)charSequence);
                charSequence = d.b(object3);
                ((StringBuilder)charSequence).append(((File)object4).getAbsolutePath());
                ((e)object).d(((StringBuilder)charSequence).toString());
                arrayList.add((e)object);
            }
        }
        if (string.startsWith(cYh.d("0F2435216D7548"))) {
            try {
                object3 = Arrays.asList(cYh.d("0A2075"), cYh.d("0A3B37"));
                object2 = Arrays.asList(cYh.d("142235"), cYh.d("062332"));
                if (object3.contains(o.b(string))) {
                    object3 = object2.iterator();
                    while (object3.hasNext()) {
                        Object object4;
                        object = (String)object3.next();
                        object2 = o.e(string).concat(cYh.d("49")).concat((String)object);
                        if (b.a((String)object2).code() != 200) continue;
                        charSequence = Uri.parse((String)object2).getLastPathSegment();
                        object4 = new e();
                        ((e)object4).c((String)charSequence);
                        object4 = ((e)object4).a((String)object);
                        ((e)object4).d((String)object2);
                        arrayList.add((e)object4);
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return arrayList;
    }

    private g b(String string) {
        List<String> list;
        g g2 = new g();
        g2.e(string);
        g2.f(string);
        g2.a(cYh.d("3F121100"));
        g2.g(cYh.d("0F2435212460487F31383474153D237F353E142420253E3949332E3C78380D386E60336A05607335673C52672761366E55627160316355332033366F5660763433740D202436"));
        boolean bl = m.d(string);
        String string2 = cYh.d("82C7C4B7D9F8");
        String string3 = cYh.d("8FF7E2B7C9CA");
        if (bl) {
            list = Arrays.asList(string3, string2, cYh.d("80CBF5B8C4E4"));
        } else {
            bl = m.c(string);
            list = cYh.d("80CBF5B9E8C4");
            list = !bl && !string.startsWith(cYh.d("0A31263F322E")) ? Arrays.asList(string2, string3, list) : Arrays.asList(list, string2, string3);
        }
        string3 = cYh.d("437465");
        g2.h(TextUtils.join((CharSequence)string3, list));
        list = cYh.d("81C2ECB7C3E443");
        g2.i(TextUtils.join((CharSequence)string3, Arrays.asList(n.a(list, string), n.a(list, string), n.a(list, string))));
        return g2;
    }

    public String detailContent(List<String> object) {
        boolean bl;
        String string;
        try {
            string = object.get(0).trim();
            bl = string.contains(cYh.d("0A31263F322E"));
        }
        catch (Exception exception) {
            return "";
        }
        String string2 = cYh.d("4361");
        String string3 = string;
        if (bl) {
            string3 = string.replaceAll(cYh.d("3C0C120D24074D782C30303402247B0D6822136D34233960052428396D01577D78307A3C267D070C2C6E572D680A0B093B231C7B"), string2);
        }
        string = string3;
        if (string3.contains(cYh.d("0F2435212460487F36262074063C28282234032228273274043F2C7E2475"))) {
            string = string3.replaceAll(cYh.d("3C0C120D24074D782925232A146A6E7E202D107E203D3E23123E25233E2C027E223E3A75147F1D022C6B562D680A0B093B231C7B"), string2);
        }
        if (string.contains(cYh.d("063C282822340322282732"))) {
            return super.detailContent(object);
        }
        object = com.github.catvod.spider.merge.c.d.e(this.b(string));
        return object;
    }

    public void init(Context context, String string) {
        super.init(context, string);
    }

    public String playerContent(String object, String string, List<String> list) {
        try {
            if (string.contains(cYh.d("1E3F34252238027E223E3A"))) {
                object = new com.github.catvod.spider.merge.c.d();
                ((com.github.catvod.spider.merge.c.d)object).i(Youtube.fetch((String)string));
                return ((com.github.catvod.spider.merge.c.d)object).toString();
            }
            if (((String)object).equals(cYh.d("80CBF5B9E8C4"))) {
                object = new com.github.catvod.spider.merge.c.d();
                ((com.github.catvod.spider.merge.c.d)object).i(string);
                ((com.github.catvod.spider.merge.c.d)object).h(this.a(string));
                return ((com.github.catvod.spider.merge.c.d)object).toString();
            }
            if (((String)object).equals(cYh.d("82C7C4B7D9F8"))) {
                object = new com.github.catvod.spider.merge.c.d();
                ((com.github.catvod.spider.merge.c.d)object).d();
                ((com.github.catvod.spider.merge.c.d)object).i(string);
                return ((com.github.catvod.spider.merge.c.d)object).toString();
            }
            if (((String)object).equals(cYh.d("8FF7E2B7C9CA"))) {
                object = new com.github.catvod.spider.merge.c.d();
                ((com.github.catvod.spider.merge.c.d)object).d();
                ((com.github.catvod.spider.merge.c.d)object).b();
                ((com.github.catvod.spider.merge.c.d)object).i(string);
                return ((com.github.catvod.spider.merge.c.d)object).toString();
            }
            object = super.playerContent((String)object, string, list);
            return object;
        }
        catch (Exception exception) {
            return "";
        }
    }
}

