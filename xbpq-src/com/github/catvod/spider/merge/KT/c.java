/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.a;
import com.github.catvod.spider.merge.KT.b;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.d0.k;
import com.github.catvod.spider.merge.xc.d0.r;
import com.github.catvod.spider.merge.xc.d0.v;
import com.github.catvod.spider.merge.xc.r0.e;
import java.io.IOException;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c {
    public int a;
    public boolean b;
    public final Object c;
    public Object d;
    public final Serializable e;

    public c(int n2) {
        this.a = n2;
        this.e = new LinkedHashMap();
        this.c = new ServerSocket(n2);
        this.d = Executors.newFixedThreadPool(10);
    }

    public c(ArrayList object, String string, boolean bl) {
        this.c = new ArrayList();
        this.e = string;
        this.b = bl;
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            string = com.github.catvod.spider.merge.KT.c.d((String)object.next());
            if (string.isEmpty() || ((ArrayList)this.c).contains(string)) continue;
            ((ArrayList)this.c).add(string);
        }
        if (((ArrayList)this.c).isEmpty()) {
            ((ArrayList)this.c).add("");
        }
        this.j(0);
    }

    public static boolean c(String string) {
        string = string.trim();
        boolean bl = string.isEmpty();
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        bl = bl2;
        if (!string.contains("\u8ba2\u5355\u72b6\u6001\u5f02\u5e38")) {
            bl = bl2;
            if (!string.contains("\u7ad9\u70b9\u521b\u5efa\u6210\u529f")) {
                bl = bl2;
                if (!string.contains("\u6ca1\u6709\u627e\u5230\u7ad9\u70b9")) {
                    bl = bl2;
                    if (!string.contains("\u57df\u540d\u672a\u7ed1\u5b9a")) {
                        bl = bl2;
                        if (!string.contains("\u7f51\u7ad9\u6682\u65f6\u65e0\u6cd5\u8bbf\u95ee")) {
                            bl = bl2;
                            if (!string.contains("This site can't be reached")) {
                                bl = bl2;
                                if (!string.contains("502 Bad Gateway")) {
                                    bl = string.contains("Service Unavailable") ? bl2 : false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl;
    }

    public static String d(String string) {
        if (string == null) {
            return "";
        }
        string = string.trim();
        while (string.endsWith("/") && string.length() > 1) {
            string = m.d(string, 1, 0);
        }
        return string;
    }

    public static com.github.catvod.spider.merge.xc.c0.b e(String object) {
        int n2 = com.github.catvod.spider.merge.xc.r0.e.Q((CharSequence)object, '?');
        if (n2 >= 0) {
            String string = ((String)object).substring(0, n2);
            i.d(string, "substring(...)");
            object = ((String)object).substring(n2 + 1);
            i.d(object, "substring(...)");
            object = new com.github.catvod.spider.merge.xc.c0.b(string, com.github.catvod.spider.merge.KT.c.f((String)object));
        } else {
            object = new com.github.catvod.spider.merge.xc.c0.b(object, r.a);
        }
        return object;
    }

    public static Map f(String object) {
        ArrayList<Object> arrayList = com.github.catvod.spider.merge.xc.r0.e.Y((CharSequence)object, new String[]{"&"}, 0, 6);
        object = new ArrayList();
        for (Object object22 : arrayList) {
            if (((String)object22).length() <= 0) continue;
            ((ArrayList)object).add(object22);
        }
        arrayList = new ArrayList<Object>(k.H(object));
        Iterator iterator = ((ArrayList)object).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            int n2 = com.github.catvod.spider.merge.xc.r0.e.Q(string, '=');
            if (n2 >= 0) {
                object = string.substring(0, n2);
                i.d(object, "substring(...)");
                object = URLDecoder.decode((String)object, "UTF-8");
                string = string.substring(n2 + 1);
                i.d(string, "substring(...)");
                object = new com.github.catvod.spider.merge.xc.c0.b(object, URLDecoder.decode(string, "UTF-8"));
            } else {
                object = new com.github.catvod.spider.merge.xc.c0.b(URLDecoder.decode(string, "UTF-8"), "");
            }
            arrayList.add(object);
        }
        return v.W(arrayList);
    }

    public static com.github.catvod.spider.merge.xc.c0.e g(String object) {
        object = (object = com.github.catvod.spider.merge.xc.r0.e.Y((CharSequence)object, new String[]{" "}, 3, 2)).size() >= 3 ? new com.github.catvod.spider.merge.xc.c0.e(object.get(0), object.get(1), object.get(2)) : (object.size() == 2 ? new com.github.catvod.spider.merge.xc.c0.e(object.get(0), object.get(1), "HTTP/1.1") : new com.github.catvod.spider.merge.xc.c0.e("GET", "/", "HTTP/1.1"));
        return object;
    }

    public String a(String string, HashMap hashMap) {
        if (string != null && string.startsWith("http")) {
            return A.n(string, hashMap, 12, 15);
        }
        ArrayList arrayList = (ArrayList)this.c;
        int n2 = arrayList.size();
        int n3 = this.a;
        int n4 = 0;
        while (true) {
            String string2 = "";
            if (n4 >= n2) break;
            int n5 = (n3 + n4) % n2;
            String string3 = (String)arrayList.get(n5);
            if (!string3.isEmpty()) {
                CharSequence charSequence;
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("http")) {
                        charSequence = string;
                    } else if (string3.endsWith("/") && string.startsWith("/")) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string3);
                        ((StringBuilder)charSequence).append(string.substring(1));
                        charSequence = ((StringBuilder)charSequence).toString();
                    } else {
                        charSequence = !string3.endsWith("/") && !string.startsWith("/") ? m.g(string3, "/", string) : string3.concat(string);
                    }
                } else {
                    charSequence = string3;
                }
                try {
                    String string4 = A.n((String)charSequence, this.b(string3, hashMap), 12, 15);
                    charSequence = string4;
                }
                catch (Throwable throwable) {
                    m.p(throwable, m.i("CloudPool fetch fail: ", (String)charSequence, " "));
                    charSequence = string2;
                }
                if (charSequence != null && !((String)charSequence).isEmpty() && !com.github.catvod.spider.merge.KT.c.c((String)charSequence)) {
                    this.j(n5);
                    if (this.b) {
                        C.b0((String)((Object)this.e), (String)this.d);
                    }
                    return charSequence;
                }
                charSequence = new StringBuilder("CloudPool switch site: ");
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(" -> empty/invalid response");
                SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            }
            ++n4;
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public HashMap b(String string, HashMap hashMap) {
        String string2;
        if (!(hashMap = new HashMap<String, String>(hashMap)).containsKey("User-Agent")) {
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        }
        if ((string2 = (String)hashMap.get("Referer")) != null && !string2.isEmpty()) {
            String string3;
            Iterator iterator = ((ArrayList)this.c).iterator();
            do {
                if (!iterator.hasNext()) return hashMap;
            } while ((string3 = (String)iterator.next()).isEmpty() || !string2.startsWith(string3));
        }
        hashMap.put("Referer", string);
        return hashMap;
    }

    public void h(a a2, b b2) {
        p p2 = (p)((LinkedHashMap)this.e).get(a2.b);
        if (p2 == null) {
            b2.d = 404;
            b2.c = "text/html";
            b2.b();
            b2.c("<html><body><h1>404 Not Found</h1></body></html>");
        } else {
            p2.invoke(a2, b2);
        }
    }

    public void i() {
        this.b = true;
        Object object = new StringBuilder("\u670d\u52a1\u5668\u5df2\u542f\u52a8\uff0c\u76d1\u542c\u7aef\u53e3: ");
        ((StringBuilder)object).append(this.a);
        SpiderDebug.log((String)((StringBuilder)object).toString());
        while (this.b) {
            try {
                Socket socket = ((ServerSocket)this.c).accept();
                object = (ExecutorService)this.d;
                com.github.catvod.spider.merge.UY.c c2 = new com.github.catvod.spider.merge.UY.c(this, socket, 8);
                object.execute(c2);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                m.o("\u51fa\u9519\uff1a", iOException.getMessage());
                if (this.b) {
                    iOException.printStackTrace();
                }
                m.o("\u51fa\u9519\uff1a", iOException.getMessage());
            }
        }
    }

    public void j(int n2) {
        int n3;
        ArrayList arrayList;
        block3: {
            block2: {
                arrayList = (ArrayList)this.c;
                if (n2 < 0) break block2;
                n3 = n2;
                if (n2 < arrayList.size()) break block3;
            }
            n3 = 0;
        }
        this.a = n3;
        this.d = (String)arrayList.get(n3);
    }
}

