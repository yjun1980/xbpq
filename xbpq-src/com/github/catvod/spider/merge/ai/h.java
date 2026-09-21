/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.util.Log
 */
package com.github.catvod.spider.merge.ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.github.catvod.spider.merge.ai.c;
import com.github.catvod.spider.merge.ai.d;
import com.github.catvod.spider.merge.ai.f;
import com.github.catvod.spider.merge.ai.g;
import com.github.catvod.spider.merge.ai.i;
import com.github.catvod.spider.merge.nIe;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class h
implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    h(File file, File object) {
        void iOException;
        CharSequence charSequence = com.github.catvod.spider.merge.ai.c.b(nIe.d("0F133F37200B271E163B3D3D2305272C3B67"));
        charSequence.append(file.getPath());
        charSequence.append(nIe.d("6E46"));
        charSequence.append(((File)object).getPath());
        charSequence.append(nIe.d("6B"));
        Object object2 = charSequence.toString();
        charSequence = nIe.d("0F133F37200B271E");
        Log.i((String)charSequence, (String)object2);
        this.a = file;
        this.c = object;
        this.b = h.d(file);
        file = new File((File)object, nIe.d("0F133F37200B271E7D2F262C29"));
        this.d = object = new RandomAccessFile(file, nIe.d("3011"));
        this.e = object2 = ((RandomAccessFile)object).getChannel();
        object = new StringBuilder();
        ((StringBuilder)object).append(nIe.d("000A3C2022262C01732C276F2E09302869"));
        ((StringBuilder)object).append(file.getPath());
        Log.i((String)charSequence, (String)((StringBuilder)object).toString());
        this.f = ((FileChannel)object2).lock();
        object = new StringBuilder();
        ((StringBuilder)object).append(file.getPath());
        ((StringBuilder)object).append(nIe.d("620A3C20222A26"));
        Log.i((String)charSequence, (String)((StringBuilder)object).toString());
        return;
        catch (Error error2) {
        }
        catch (RuntimeException runtimeException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        try {
            h.a(this.e);
            throw file;
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        h.a(this.d);
        throw iOException;
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        }
        catch (IOException iOException) {
            Log.w((String)nIe.d("0F133F37200B271E"), (String)nIe.d("04073A2F2C2B62123C632A232D1536633B2A310926312A2A"), (Throwable)iOException);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(ZipFile closeable, ZipEntry object, File file, String object2) {
        int n2;
        closeable = ((ZipFile)closeable).getInputStream((ZipEntry)object);
        CharSequence charSequence = com.github.catvod.spider.merge.ai.c.a(nIe.d("360B236E"), (String)object2);
        object2 = file.getParentFile();
        object2 = File.createTempFile((String)charSequence, nIe.d("6C1C3A33"), (File)object2);
        charSequence = com.github.catvod.spider.merge.ai.c.b(nIe.d("071E2731282C360F3D2469"));
        ((StringBuilder)charSequence).append(((File)object2).getPath());
        Object object3 = ((StringBuilder)charSequence).toString();
        charSequence = nIe.d("0F133F37200B271E");
        Log.i((String)charSequence, (String)object3);
        FileOutputStream fileOutputStream = new FileOutputStream((File)object2);
        Object object4 = new BufferedOutputStream(fileOutputStream);
        object3 = new ZipOutputStream((OutputStream)object4);
        object4 = new ZipEntry(nIe.d("210A32303A2A3148372631"));
        ((ZipEntry)object4).setTime(((ZipEntry)object).getTime());
        ((ZipOutputStream)object3).putNextEntry((ZipEntry)object4);
        object = new byte[16384];
        while ((n2 = ((InputStream)closeable).read((byte[])object)) != -1) {
            ((ZipOutputStream)object3).write((byte[])object, 0, n2);
        }
        ((ZipOutputStream)object3).closeEntry();
        {
            catch (Throwable throwable) {
                ((ZipOutputStream)object3).close();
                throw throwable;
            }
        }
        try {
            ((ZipOutputStream)object3).close();
            if (((File)object2).setReadOnly()) {
                object = new StringBuilder();
                ((StringBuilder)object).append(nIe.d("10033D2224262C017337266F"));
                ((StringBuilder)object).append(file.getPath());
                Log.i((String)charSequence, (String)((StringBuilder)object).toString());
                boolean bl = ((File)object2).renameTo(file);
                if (bl) {
                    return;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(nIe.d("04073A2F2C2B62123C633B2A2C073E26696D"));
                ((StringBuilder)charSequence).append(((File)object2).getAbsolutePath());
                ((StringBuilder)charSequence).append(nIe.d("6046272C696D"));
                ((StringBuilder)charSequence).append(file.getAbsolutePath());
                ((StringBuilder)charSequence).append(nIe.d("60"));
                object = new IOException(((StringBuilder)charSequence).toString());
                throw object;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(nIe.d("04073A2F2C2B62123C63242E300D73312C2E26093D2F306F60"));
            ((StringBuilder)charSequence).append(((File)object2).getAbsolutePath());
            ((StringBuilder)charSequence).append(nIe.d("60467B37243F620935636B"));
            ((StringBuilder)charSequence).append(file.getAbsolutePath());
            ((StringBuilder)charSequence).append(nIe.d("604F"));
            object = new IOException(((StringBuilder)charSequence).toString());
            throw object;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        finally {
            h.a(closeable);
            ((File)object2).delete();
        }
    }

    private static long c(File file) {
        long l2;
        long l3 = l2 = file.lastModified();
        if (l2 == -1L) {
            l3 = l2 - 1L;
        }
        return l3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static long d(File object) {
        object = new RandomAccessFile((File)object, nIe.d("30"));
        Object object2 = com.github.catvod.spider.merge.ai.d.a((RandomAccessFile)object);
        CRC32 cRC32 = new CRC32();
        long l2 = ((i)object2).b;
        ((RandomAccessFile)object).seek(((i)object2).a);
        int n2 = (int)Math.min(16384L, l2);
        object2 = new byte[16384];
        while ((n2 = ((RandomAccessFile)object).read((byte[])object2, 0, n2)) != -1) {
            cRC32.update((byte[])object2, 0, n2);
            if ((l2 -= (long)n2) == 0L) break;
            n2 = (int)Math.min(16384L, l2);
        }
        long l3 = cRC32.getValue();
        l2 = l3;
        if (l3 != -1L) return l2;
        return l3 - 1L;
        finally {
            ((RandomAccessFile)object).close();
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private List f(Context object) {
        Log.i((String)nIe.d("0F133F37200B271E"), (String)nIe.d("2E09322720212546363B203C360F3D24693C27053C2D2D2E301F73272C3762003A2F2C3C"));
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append(this.a.getName());
        ((StringBuilder)object2).append(nIe.d("6C053F223A3C2715"));
        object2 = ((StringBuilder)object2).toString();
        SharedPreferences sharedPreferences = object.getSharedPreferences(nIe.d("2F133F37202B271E7D352C3D310F3C2D"), 4);
        int n2 = sharedPreferences.getInt(nIe.d("26032B6D273A2F043631"), 1);
        ArrayList<Object> arrayList = new ArrayList<Object>(n2 - 1);
        object = object2;
        for (int i2 = 2; i2 <= n2; ++i2) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(i2);
            ((StringBuilder)object2).append(nIe.d("6C1C3A33"));
            object2 = ((StringBuilder)object2).toString();
            object2 = new g(this.c, (String)object2);
            if (((File)object2).isFile()) {
                ((g)object2).a = h.d((File)object2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(nIe.d("26032B6D2A3D2148"));
                stringBuilder.append(i2);
                long l2 = sharedPreferences.getLong(stringBuilder.toString(), -1L);
                stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(nIe.d("26032B6D3D262F037D"));
                stringBuilder.append(i2);
                long l3 = sharedPreferences.getLong(stringBuilder.toString(), -1L);
                long l4 = ((File)object2).lastModified();
                if (l3 == l4 && l2 == ((g)object2).a) {
                    arrayList.add(object2);
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(nIe.d("0B08252225262646363B3D3D230527262D6F26032B7969"));
                ((StringBuilder)object).append(object2);
                ((StringBuilder)object).append(nIe.d("624E3826306F60"));
                ((StringBuilder)object).append("");
                ((StringBuilder)object).append(nIe.d("604F7F632C37320330372C2B620B3C2720292B05323720202C46272A242A7846"));
                ((StringBuilder)object).append(l3);
                ((StringBuilder)object).append(nIe.d("6E463E2C2D26240F30223D262D0873372022275C73"));
                ((StringBuilder)object).append(l4);
                ((StringBuilder)object).append(nIe.d("6E46363B392A21123627692C30056963"));
                ((StringBuilder)object).append(l2);
                ((StringBuilder)object).append(nIe.d("6E46352A252A62052120736F"));
                ((StringBuilder)object).append(((g)object2).a);
                throw new IOException(((StringBuilder)object).toString());
            }
            object = com.github.catvod.spider.merge.ai.c.b(nIe.d("0F0F203020212546363B3D3D230527262D6F3103302C272B23142A632D2A3A46352A252A6241"));
            ((StringBuilder)object).append(((File)object2).getPath());
            ((StringBuilder)object).append(nIe.d("65"));
            throw new IOException(((StringBuilder)object).toString());
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<g> g() {
        Serializable serializable;
        String string = nIe.d("04073A2F2C2B62123C632A232D1536633B2A310926312A2A");
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append(this.a.getName());
        ((StringBuilder)object3).append(nIe.d("6C053F223A3C2715"));
        CharSequence charSequence = ((StringBuilder)object3).toString();
        Object object2 = this.c.listFiles(new f());
        String string2 = nIe.d("0F133F37200B271E");
        if (object2 == null) {
            object3 = com.github.catvod.spider.merge.ai.c.b(nIe.d("04073A2F2C2B62123C632526311273302C2C2D0837223B366202363B692B2B147320262136033D376967"));
            ((StringBuilder)object3).append(this.c.getPath());
            ((StringBuilder)object3).append(nIe.d("6B48"));
            Log.w((String)string2, (String)((StringBuilder)object3).toString());
        } else {
            for (Object object3 : object2) {
                serializable = com.github.catvod.spider.merge.ai.c.b(nIe.d("16142A2A272862123C632D2A2E03272669202E02732520232746"));
                ((StringBuilder)serializable).append(((File)object3).getPath());
                ((StringBuilder)serializable).append(nIe.d("620935633A26380373"));
                ((StringBuilder)serializable).append(((File)object3).length());
                Log.i((String)string2, (String)((StringBuilder)serializable).toString());
                if (!((File)object3).delete()) {
                    serializable = com.github.catvod.spider.merge.ai.c.b(nIe.d("04073A2F2C2B62123C632D2A2E03272669202E02732520232746"));
                    ((StringBuilder)serializable).append(((File)object3).getPath());
                    Log.w((String)string2, (String)((StringBuilder)serializable).toString());
                    continue;
                }
                serializable = com.github.catvod.spider.merge.ai.c.b(nIe.d("06033F263D2A26463C2F2D6F240F3F2669"));
                ((StringBuilder)serializable).append(((File)object3).getPath());
                Log.i((String)string2, (String)((StringBuilder)serializable).toString());
            }
        }
        serializable = new ArrayList();
        object2 = new ZipFile(this.a);
        int n2 = 2;
        try {
            ZipEntry zipEntry;
            object3 = nIe.d("210A32303A2A31547D272C37");
            while ((zipEntry = ((ZipFile)object2).getEntry((String)object3)) != null) {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)charSequence);
                ((StringBuilder)object3).append(n2);
                ((StringBuilder)object3).append(nIe.d("6C1C3A33"));
                object3 = ((StringBuilder)object3).toString();
                g g2 = new g(this.c, (String)object3);
                serializable.add(g2);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append(nIe.d("071E2731282C360F3C2D692631463D262C2B27027325263D62003A2F2C6F"));
                ((StringBuilder)object3).append(g2);
                Log.i((String)string2, (String)((StringBuilder)object3).toString());
                int n3 = 0;
                int n4 = 0;
                while (n3 < 3 && n4 == 0) {
                    int n5;
                    int n6 = n3 + 1;
                    h.b((ZipFile)object2, zipEntry, g2, (String)charSequence);
                    try {
                        g2.a = h.d(g2);
                        n5 = 1;
                    }
                    catch (IOException iOException) {
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append(nIe.d("04073A2F2C2B62123C633B2A230273203B2C6200212C246F"));
                        ((StringBuilder)object3).append(g2.getAbsolutePath());
                        Log.w((String)string2, (String)((StringBuilder)object3).toString(), (Throwable)iOException);
                        n5 = 0;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(nIe.d("071E2731282C360F3C2D69"));
                    object3 = n5 != 0 ? nIe.d("311330202C2A260337") : nIe.d("24073A2F2C2B");
                    stringBuilder.append((String)object3);
                    stringBuilder.append(nIe.d("6241"));
                    stringBuilder.append(g2.getAbsolutePath());
                    stringBuilder.append(nIe.d("655C732F2C2125123B63"));
                    stringBuilder.append(g2.length());
                    stringBuilder.append(nIe.d("624B73203B2C7846"));
                    stringBuilder.append(g2.a);
                    Log.i((String)string2, (String)stringBuilder.toString());
                    n3 = n6;
                    n4 = n5;
                    if (n5 != 0) continue;
                    g2.delete();
                    n3 = n6;
                    n4 = n5;
                    if (!g2.exists()) continue;
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(nIe.d("04073A2F2C2B62123C632D2A2E032726692C2D142136393B270273302C2C2D0837223B366202363B6968"));
                    ((StringBuilder)object3).append(g2.getPath());
                    ((StringBuilder)object3).append(nIe.d("65"));
                    Log.w((String)string2, (String)((StringBuilder)object3).toString());
                    n3 = n6;
                    n4 = n5;
                }
                if (n4 != 0) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(nIe.d("210A32303A2A31"));
                    ((StringBuilder)object3).append(++n2);
                    ((StringBuilder)object3).append(nIe.d("6C02363B"));
                    object3 = ((StringBuilder)object3).toString();
                    continue;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(nIe.d("0109262F2D6F2C0927632A3D2707272669352B16732520232746"));
                ((StringBuilder)charSequence).append(g2.getAbsolutePath());
                ((StringBuilder)charSequence).append(nIe.d("62003C31693C27053C2D2D2E301F73272C37624E"));
                ((StringBuilder)charSequence).append(n2);
                ((StringBuilder)charSequence).append(nIe.d("6B"));
                object3 = new IOException(((StringBuilder)charSequence).toString());
                throw object3;
            }
        }
        catch (Throwable throwable) {
            try {
                ((ZipFile)object2).close();
                throw throwable;
            }
            catch (IOException iOException) {
                Log.w((String)string2, (String)string, (Throwable)iOException);
                throw throwable;
            }
        }
        try {
            ((ZipFile)object2).close();
            return serializable;
        }
        catch (IOException iOException) {
            Log.w((String)string2, (String)string, (Throwable)iOException);
        }
        return serializable;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private static void h(Context context, long l2, long l3, List object) {
        context = context.getSharedPreferences(nIe.d("2F133F37202B271E7D352C3D310F3C2D"), 4).edit();
        context.putLong(nIe.d("360F3E263A3B230B23"), l2);
        context.putLong(nIe.d("211430"), l3);
        int n2 = object.size();
        context.putInt(nIe.d("26032B6D273A2F043631"), n2 + 1);
        Iterator iterator = object.iterator();
        n2 = 2;
        while (iterator.hasNext()) {
            object = (g)iterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(nIe.d("26032B6D2A3D2148"));
            stringBuilder.append(n2);
            context.putLong(stringBuilder.toString(), ((g)object).a);
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(nIe.d("26032B6D3D262F037D"));
            stringBuilder.append(n2);
            context.putLong(stringBuilder.toString(), ((File)object).lastModified());
            ++n2;
        }
        context.commit();
    }

    @Override
    public final void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    final List e(Context object, boolean bl) {
        Object object2 = com.github.catvod.spider.merge.ai.c.b(nIe.d("0F133F37200B271E163B3D3D2305272C3B612E09322761"));
        ((StringBuilder)object2).append(this.a.getPath());
        String string = nIe.d("6E46");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(bl);
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("");
        ((StringBuilder)object2).append(nIe.d("6B"));
        object2 = ((StringBuilder)object2).toString();
        string = nIe.d("0F133F37200B271E");
        Log.i((String)string, (String)object2);
        if (this.f.isValid()) {
            block5: {
                block6: {
                    if (!bl) {
                        object2 = this.a;
                        long l2 = this.b;
                        SharedPreferences sharedPreferences = object.getSharedPreferences(nIe.d("2F133F37202B271E7D352C3D310F3C2D"), 4);
                        boolean bl2 = sharedPreferences.getLong(nIe.d("360F3E263A3B230B23"), -1L) != h.c(object2) || sharedPreferences.getLong(nIe.d("211430"), -1L) != l2;
                        if (!bl2) {
                            try {
                                object = object2 = this.f((Context)object);
                                break block5;
                            }
                            catch (IOException iOException) {
                                Log.w((String)string, (String)nIe.d("04073A2F2C2B62123C633B2A2E093227692A3A0F203720212546363B3D3D230527262D6F3103302C272B23142A632D2A3A46352A252A314A732528232E0F3D24692D230538633D20620021263A2762032B373B2E21123A2C27"), (Throwable)iOException);
                                break block6;
                            }
                        }
                    }
                    object2 = bl ? nIe.d("040921202C2B62032B373B2E21123A2C276F2F132037692D274623263B292D143E262D61") : nIe.d("060327262A3B27027337212E3646363B3D3D2305272A2621620B26303D6F200373332C3D2409212E2C2B6C");
                    Log.i((String)string, (String)object2);
                }
                object2 = this.g();
                h.h((Context)object, h.c(this.a), this.b, object2);
                object = object2;
            }
            object2 = com.github.catvod.spider.merge.ai.c.b(nIe.d("2E09322769292D133D2769"));
            ((StringBuilder)object2).append(object.size());
            ((StringBuilder)object2).append(nIe.d("6215362026212607213A692B271E732520232715"));
            Log.i((String)string, (String)((StringBuilder)object2).toString());
            return object;
        }
        throw new IllegalStateException(nIe.d("0F133F37200B271E163B3D3D2305272C3B6F350720632A232D153627"));
    }
}

