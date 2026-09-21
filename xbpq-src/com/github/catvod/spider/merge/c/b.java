/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Environment
 */
package com.github.catvod.spider.merge.c;

import android.os.Bundle;
import android.os.Environment;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I0.a;
import com.github.catvod.spider.merge.c1.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;

public final class b {
    public static a a(BigInteger object) {
        String string = String.format("%x", object);
        object = string;
        if (string.length() % 2 != 0) {
            object = e.c("0", string);
        }
        if (((a)(object = new a(d.a((String)object)))).b() <= 127) {
            ((a)object).c(0, d.o(((a)object).e()));
            ((a)object).c(0, d.o(2));
            return object;
        }
        int n2 = ((a)object).e();
        ((a)object).c(0, d.o(0));
        ((a)object).c(0, d.o(n2 + 1));
        ((a)object).c(0, d.o(2));
        return object;
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(b.class.getClassLoader());
        }
    }

    public static String c(String object, String object2) {
        Init.checkPermission();
        object = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), (String)object);
        object2 = new File((File)object, (String)object2);
        if (!((File)object).exists()) {
            ((File)object).mkdirs();
        }
        return ((File)object2).getAbsolutePath();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String d(File object) {
        String string = "";
        try {
            FileInputStream fileInputStream = new FileInputStream((File)object);
            try {
                object = new ByteArrayOutputStream();
                byte[] byArray = new byte[16384];
                while (true) {
                    int n2;
                    if ((n2 = ((InputStream)fileInputStream).read(byArray, 0, 16384)) == -1) {
                        ((InputStream)fileInputStream).close();
                        return new String(((ByteArrayOutputStream)object).toByteArray(), "UTF-8");
                    }
                    ((ByteArrayOutputStream)object).write(byArray, 0, n2);
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return string;
            }
        }
        catch (Exception exception) {
            return string;
        }
    }

    public static File e(String object) {
        String string = object;
        if (!((String)object).startsWith(".")) {
            string = e.c(".", (String)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(Environment.getExternalStorageDirectory());
        object = new File(r.c((StringBuilder)object, File.separator, "TV"));
        if (!((File)object).exists()) {
            ((File)object).mkdirs();
        }
        return new File((File)object, string);
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static File f(File file, String object) {
        Object object2 = ((String)object).getBytes();
        object = new FileOutputStream(file);
        ((FileOutputStream)object).write((byte[])object2);
        ((OutputStream)object).flush();
        ((FileOutputStream)object).close();
        {
            catch (Exception exception) {
                return file;
            }
        }
        try {
            object2 = Runtime.getRuntime();
            object = new StringBuilder();
            ((StringBuilder)object).append("chmod 777 ");
            ((StringBuilder)object).append(file);
            ((Runtime)object2).exec(((StringBuilder)object).toString()).waitFor();
            return file;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return file;
    }
}

