package com.github.catvod.spider.merge.j;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.C0123g;
import com.github.catvod.spider.merge.x.C0248f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {
    public static final Object a(Throwable th) {
        return new C0248f(th);
    }

    public static C0123g b(com.github.catvod.spider.merge.c0.l lVar) {
        C0123g c0123g = new C0123g();
        while (true) {
            lVar = lVar.b0();
            if (lVar == null) {
                break;
            }
            c0123g.add(lVar);
        }
        if (c0123g.size() > 0) {
            return c0123g;
        }
        return null;
    }

    public static int c(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.h0.d dVar) {
        Iterator<com.github.catvod.spider.merge.c0.l> it = lVar.f0().R().iterator();
        int i = 1;
        while (it.hasNext()) {
            com.github.catvod.spider.merge.c0.l next = it.next();
            if (lVar.n0().equals(next.n0()) && dVar.a().contains(next)) {
                if (lVar == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static C0123g d(com.github.catvod.spider.merge.c0.l lVar) {
        C0123g c0123g = new C0123g();
        while (true) {
            lVar = lVar.i0();
            if (lVar == null) {
                break;
            }
            c0123g.add(lVar);
        }
        if (c0123g.size() > 0) {
            return c0123g;
        }
        return null;
    }

    public static String e(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append(cYh.d("6D"));
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            int i = o.a;
            return (sb2 == null || sb2.length() <= 1) ? sb2 : sb2.substring(0, sb2.length() - 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public static void f(com.github.catvod.spider.merge.c0.l lVar, int i) {
        lVar.b(cYh.d("221C1E021617220F151010052E1E05140F052C1518"), String.valueOf(i));
    }

    public static void g(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            try {
                Runtime.getRuntime().exec(cYh.d("04382C3E337A50677671") + file).waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
