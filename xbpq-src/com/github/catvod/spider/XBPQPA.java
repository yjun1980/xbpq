/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.XBPQAli;
import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.dp.n;
import com.github.catvod.spider.merge.fb.d;
import com.github.catvod.spider.merge.fb.e;
import com.github.catvod.spider.merge.fb.g;
import com.github.catvod.spider.merge.lq.b;
import com.github.catvod.spider.merge.nz.m;
import com.github.catvod.spider.merge.nz.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XBPQPA
extends XBPQAli {
    private List<e> a(String string) {
        Object object;
        CharSequence charSequence;
        Object object2;
        Object object32;
        ArrayList<e> arrayList = new ArrayList<e>();
        if (string.startsWith("file://") && ((File)(object32 = new File(string.replace("file://", "")))).getParentFile() != null) {
            object2 = ((File)object32).getParentFile().listFiles();
            object2.getClass();
            for (Object object32 : object2) {
                charSequence = o.b(((File)object32).getName());
                if (!o.d((String)charSequence)) continue;
                object = new e();
                ((e)object).c(o.e(((File)object32).getName()));
                object = ((e)object).a((String)charSequence);
                charSequence = com.github.catvod.spider.merge.ka.d.b("file://");
                ((StringBuilder)charSequence).append(((File)object32).getAbsolutePath());
                ((e)object).d(((StringBuilder)charSequence).toString());
                arrayList.add((e)object);
            }
        }
        if (string.startsWith("http://")) {
            try {
                object2 = Arrays.asList("mp4", "mkv");
                object32 = Arrays.asList("srt", "ass");
                if (object2.contains(o.b(string))) {
                    object32 = object32.iterator();
                    while (object32.hasNext()) {
                        object = (String)object32.next();
                        object2 = o.e(string).concat(".").concat((String)object);
                        if (b.a((String)object2).code() != 200) continue;
                        charSequence = Uri.parse((String)object2).getLastPathSegment();
                        e e2 = new e();
                        e2.c((String)charSequence);
                        object = e2.a((String)object);
                        ((e)object).d((String)object2);
                        arrayList.add((e)object);
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
        g g2 = new g();
        g2.f(string);
        g2.g(string);
        g2.a("XBPQ");
        g2.h("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        List<String> list = m.d(string) ? Arrays.asList("\u89e3\u6790", "\u55c5\u63a2", "\u76f4\u94fe") : (!m.c(string) && !string.startsWith("magnet") ? Arrays.asList("\u55c5\u63a2", "\u89e3\u6790", "\u76f4\u8fde") : Arrays.asList("\u76f4\u8fde", "\u55c5\u63a2", "\u89e3\u6790"));
        g2.i(TextUtils.join((CharSequence)"$$$", list));
        g2.j(TextUtils.join((CharSequence)"$$$", Arrays.asList(n.a("\u64ad\u653e$", string), n.a("\u64ad\u653e$", string), n.a("\u64ad\u653e$", string))));
        return g2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String detailContent(List<String> object) {
        try {
            String string;
            block7: {
                String string2;
                block6: {
                    string = ((String)object.get(0)).trim();
                    boolean bl = string.contains("magnet");
                    string2 = string;
                    if (bl) {
                        string2 = string.replaceAll("[\\S\\s]*(magnet:\\?xt=urn:btih:[0-9a-fA-F]{40})[\\S\\s]*", "$1");
                    }
                    if (string2.contains("https://www.aliyundrive.com/s/")) break block6;
                    string = string2;
                    if (!string2.contains("https://www.alipan.com/s/")) break block7;
                }
                string = string2.replace("www.alipan.com", "www.aliyundrive.com").replaceAll("[\\S\\s]*(https://www\\.aliyundrive\\.com/s/\\S{11})[\\S\\s]*", "$1");
            }
            if (!string.contains("aliyundrive")) return d.e(this.b(string));
            return super.detailContent((List<String>)object);
        }
        catch (Exception exception) {
            return "";
        }
    }

    @Override
    public void init(Context context, String string) {
        super.init(context, string);
    }

    @Override
    public String playerContent(String object, String string, List<String> list) {
        try {
            if (string.contains("youtube.com")) {
                object = new d();
                ((d)object).i(Youtube.fetch((String)string));
                return ((d)object).toString();
            }
            if (((String)object).equals("\u76f4\u8fde")) {
                object = new d();
                ((d)object).i(string);
                ((d)object).h(this.a(string));
                return ((d)object).toString();
            }
            if (((String)object).equals("\u55c5\u63a2")) {
                object = new d();
                ((d)object).d();
                ((d)object).i(string);
                return ((d)object).toString();
            }
            if (((String)object).equals("\u89e3\u6790")) {
                object = new d();
                ((d)object).d();
                ((d)object).b();
                ((d)object).i(string);
                return ((d)object).toString();
            }
            object = super.playerContent((String)object, string, list);
            return object;
        }
        catch (Exception exception) {
            return "";
        }
    }
}

