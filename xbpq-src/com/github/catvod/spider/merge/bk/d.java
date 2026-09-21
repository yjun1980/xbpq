/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.bk;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.bk.c;
import com.github.catvod.spider.merge.bk.e;
import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class d {
    static volatile e a = new e();

    public static void a(File object) {
        CharSequence charSequence;
        Application application;
        Intent intent = new Intent(nIe.d("23083731262626483A2D3D2A2C127D222A3B2B093D6D1F060731"));
        intent.addFlags(0x10000000);
        intent.addFlags(1);
        if (Build.VERSION.SDK_INT < 24) {
            application = Uri.fromFile((File)object);
        } else {
            application = Init.context();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(Init.context().getPackageName());
            ((StringBuilder)charSequence).append(nIe.d("6C16212C3F26260321"));
            application = c.a((Context)application, ((StringBuilder)charSequence).toString(), (File)object);
        }
        charSequence = URLConnection.guessContentTypeFromName(((File)object).getName());
        object = charSequence;
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            object = nIe.d("684979");
        }
        intent.setDataAndType((Uri)application, (String)object);
        Init.context().startActivity(intent);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(File enumeration, File file) {
        ZipFile zipFile = new ZipFile(((File)((Object)enumeration)).getAbsolutePath());
        try {
            enumeration = zipFile.entries();
            block10: while (true) {
                if (enumeration.hasMoreElements()) {
                    Object object = enumeration.nextElement();
                    Object object2 = new File(file, ((ZipEntry)object).getName());
                    if (((ZipEntry)object).isDirectory()) {
                        ((File)object2).mkdirs();
                        continue;
                    }
                    InputStream inputStream = zipFile.getInputStream((ZipEntry)object);
                    object = new FileOutputStream((File)object2);
                    object2 = new byte[8192];
                    while (true) {
                        int n2;
                        if ((n2 = inputStream.read((byte[])object2)) == -1) continue block10;
                        ((OutputStream)object).write((byte[])object2, 0, n2);
                    }
                }
                zipFile.close();
                return;
                catch (Exception exception) {
                    continue;
                }
                break;
            }
        }
        catch (Throwable throwable) {
            try {
                zipFile.close();
            }
            catch (Throwable throwable2) {}
            throw throwable;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

