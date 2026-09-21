/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.os.Build$VERSION
 *  android.util.Log
 */
package com.github.catvod.spider.merge.ai;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.github.catvod.spider.merge.ai.b;
import com.github.catvod.spider.merge.ai.c;
import com.github.catvod.spider.merge.ai.h;
import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class e {
    private static final Set<File> a;
    private static final boolean b;

    static {
        Object object;
        boolean bl;
        String string;
        block6: {
            boolean bl2;
            a = new HashSet<File>();
            string = System.getProperty(nIe.d("2807252267392F4825263B3C2B093D"));
            bl = bl2 = false;
            if (string != null) {
                object = Pattern.compile(nIe.d("6A3A376860136C4E0F2762666A3A7D1F2D646B59")).matcher(string);
                bl = bl2;
                if (((Matcher)object).matches()) {
                    try {
                        int n2 = Integer.parseInt(((Matcher)object).group(1));
                        int n3 = Integer.parseInt(((Matcher)object).group(2));
                        if (n2 <= 2) {
                            bl = bl2;
                            if (n2 != 2) break block6;
                            bl = bl2;
                            if (n3 < 1) break block6;
                        }
                        bl = true;
                    }
                    catch (NumberFormatException numberFormatException) {
                        bl = bl2;
                    }
                }
            }
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(nIe.d("142B7334203B2A4625263B3C2B093D63"));
        ((StringBuilder)object).append(string);
        string = bl ? nIe.d("620E32306922370A272A2D2A3A462036393F2D1427") : nIe.d("62023C263A6F2C092763212E3403732E3C23360F3726316F31132333263D36");
        ((StringBuilder)object).append(string);
        string = ((StringBuilder)object).toString();
        Log.i((String)nIe.d("0F133F37200B271E"), (String)string);
        b = bl;
    }

    static /* synthetic */ Field a(Object object, String string) {
        return e.e(object, string);
    }

    static void b(Object object, String objectArray, Object[] objectArray2) {
        Field field = e.e(object, (String)objectArray);
        Object[] objectArray3 = (Object[])field.get(object);
        objectArray = (Object[])Array.newInstance(objectArray3.getClass().getComponentType(), objectArray3.length + objectArray2.length);
        System.arraycopy(objectArray3, 0, objectArray, 0, objectArray3.length);
        System.arraycopy(objectArray2, 0, objectArray, objectArray3.length, objectArray2.length);
        field.set(object, objectArray);
    }

    private static void c(Context object) {
        if (((File)(object = new File(object.getFilesDir(), nIe.d("3103302C272B23142A6E2D2A3A0320")))).isDirectory()) {
            CharSequence charSequence = c.b(nIe.d("010A36223B262C01732C252B6215362026212607213A692B271E7327203D624E"));
            charSequence.append(((File)object).getPath());
            Object object22 = nIe.d("6B48");
            charSequence.append((String)object22);
            Object object3 = charSequence.toString();
            charSequence = nIe.d("0F133F37200B271E");
            Log.i((String)charSequence, (String)object3);
            object3 = ((File)object).listFiles();
            if (object3 == null) {
                object3 = c.b(nIe.d("04073A2F2C2B62123C632526311273302C2C2D0837223B366202363B692B2B147320262136033D376967"));
                ((StringBuilder)object3).append(((File)object).getPath());
                ((StringBuilder)object3).append((String)object22);
                Log.w((String)charSequence, (String)((StringBuilder)object3).toString());
                return;
            }
            for (Object object22 : object3) {
                StringBuilder stringBuilder = c.b(nIe.d("16142A2A272862123C632D2A2E03272669202E02732520232746"));
                stringBuilder.append(((File)object22).getPath());
                stringBuilder.append(nIe.d("620935633A26380373"));
                stringBuilder.append(((File)object22).length());
                Log.i((String)charSequence, (String)stringBuilder.toString());
                if (!((File)object22).delete()) {
                    stringBuilder = c.b(nIe.d("04073A2F2C2B62123C632D2A2E03272669202E02732520232746"));
                    stringBuilder.append(((File)object22).getPath());
                    Log.w((String)charSequence, (String)stringBuilder.toString());
                    continue;
                }
                stringBuilder = c.b(nIe.d("06033F263D2A26463C2F2D6F240F3F2669"));
                stringBuilder.append(((File)object22).getPath());
                Log.i((String)charSequence, (String)stringBuilder.toString());
            }
            if (!((File)object).delete()) {
                object3 = c.b(nIe.d("04073A2F2C2B62123C632D2A2E032726693C27053C2D2D2E301F73272C3762023A3169"));
                ((StringBuilder)object3).append(((File)object).getPath());
                Log.w((String)charSequence, (String)((StringBuilder)object3).toString());
            } else {
                object3 = c.b(nIe.d("06033F263D2A26463C2F2D6F3103302C272B23142A632D2A3A46372A3B6F"));
                ((StringBuilder)object3).append(((File)object).getPath());
                Log.i((String)charSequence, (String)((StringBuilder)object3).toString());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void d(Context object, File file, File object2) {
        Object object3 = nIe.d("3103302C272B23142A6E2D2A3A0320");
        Set<File> set = a;
        synchronized (set) {
            block22: {
                Object object4;
                Object object5;
                block21: {
                    if (set.contains(file)) {
                        return;
                    }
                    set.add(file);
                    int n2 = Build.VERSION.SDK_INT;
                    if (n2 > 20) {
                        object5 = nIe.d("0F133F37200B271E");
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append(nIe.d("0F133F37200B271E732A3A6F2C0927632E3A2314322D3D2A27027337266F3509212869262C460007026F3403213020202C46"));
                        ((StringBuilder)object4).append(n2);
                        ((StringBuilder)object4).append(nIe.d("78460007026F3403213020202C463B2A2E2727147337212E2C46"));
                        ((StringBuilder)object4).append(20);
                        ((StringBuilder)object4).append(nIe.d("62153B2C3C2326463126692D230538262D6F201F73"));
                        ((StringBuilder)object4).append(nIe.d("30133D3720222746242A3D276204262A253B6F0F3D63243A2E123A272C3762053233282D2B0A273A692D3712732A3D6831463D2C3D6F360E3663"));
                        ((StringBuilder)object4).append(nIe.d("2107202669272714367969252310326D3F226C1036313A262D086E61"));
                        ((StringBuilder)object4).append(System.getProperty(nIe.d("2807252267392F4825263B3C2B093D")));
                        ((StringBuilder)object4).append(nIe.d("60"));
                        Log.w((String)object5, (String)((StringBuilder)object4).toString());
                    }
                    try {
                        object4 = object.getClassLoader();
                        if (object4 != null) break block21;
                    }
                    catch (RuntimeException runtimeException) {
                        Log.w((String)nIe.d("0F133F37200B271E"), (String)nIe.d("04073A2F3C3D2746242B20232746273130262C017337266F2D042722202162253C2D3D2A3A127320252E3115732F262E2603216D6902371527632B2A6214262D27262C01732A276F3603203769222D02366D691C290F2363392E36053B2A27286C"), (Throwable)runtimeException);
                        return;
                    }
                    Log.e((String)nIe.d("0F133F37200B271E"), (String)nIe.d("01093D372C373646302F283C31463F2C282B2714732A3A6F2C133F2F676F0F132037692D2746213627212B0834632021621236303D6F2F093726676F110D3A33693F2312302B20212548"));
                    return;
                }
                try {
                    e.c(object);
                }
                catch (Throwable throwable) {
                    Log.w((String)nIe.d("0F133F37200B271E"), (String)nIe.d("11093E263D272B0834633E2A2C1273343B202C017334212A2C46273130262C017337266F210A36223B6F2D0A3763043A2E123A072C3762032B373B2E21123A2C276362053C2D3D262C133A2D2E6F350F272B263A3646302F2C2E2C0F3D2467"), (Throwable)throwable);
                }
                String string = nIe.d("21093726162C23053B26");
                object5 = new File((File)object2, string);
                try {
                    e.h((File)object5);
                    object2 = object5;
                }
                catch (IOException iOException) {
                    object2 = new File(object.getFilesDir(), string);
                    e.h((File)object2);
                }
                object5 = new File((File)object2, (String)object3);
                e.h((File)object5);
                object2 = new h(file, (File)object5);
                file = null;
                object3 = ((h)object2).e((Context)object, false);
                try {
                    e.g((ClassLoader)object4, (File)object5, (List<? extends File>)object3);
                }
                catch (IOException iOException) {
                    Log.w((String)nIe.d("0F133F37200B271E"), (String)nIe.d("04073A2F2C2B62123C6320213112322F256F271E2731282C360337633A2A21093D27283D3B463726316F240F3F263A63621436373B362B0834633E26360E7325263D210337632C37361432203D262D08"), (Throwable)iOException);
                    e.g((ClassLoader)object4, (File)object5, ((h)object2).e((Context)object, true));
                }
                object = file;
                if (object != null) break block22;
                return;
            }
            throw object;
            finally {
                ((h)object2).close();
            }
        }
    }

    private static Field e(Object object, String string) {
        Serializable serializable;
        for (serializable = object.getClass(); serializable != null; serializable = ((Class)serializable).getSuperclass()) {
            try {
                Field field = ((Class)serializable).getDeclaredField(string);
                if (!field.isAccessible()) {
                    ((AccessibleObject)field).setAccessible(true);
                }
                return field;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                continue;
            }
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(nIe.d("040F362F2D6F"));
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(nIe.d("62083C3769292D133D2769262C46"));
        ((StringBuilder)serializable).append(object.getClass());
        object = new NoSuchFieldException(((StringBuilder)serializable).toString());
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(Context object) {
        Exception exception2;
        String string;
        block7: {
            string = nIe.d("0F133F37200B271E");
            Log.i((String)string, (String)nIe.d("0B08203728232E0F3D24692E32163F2A2A2E360F3C2D"));
            if (b) {
                object = nIe.d("142B732B283C620B262F3D2626032B633A3A32163C313D63622B262F3D2606032B633A3A32163C313D6F2E0F3131283D3B463A30692B2B153221252A2648");
            } else {
                ApplicationInfo applicationInfo;
                try {
                    try {
                        applicationInfo = object.getApplicationInfo();
                    }
                    catch (RuntimeException runtimeException) {
                        Log.w((String)string, (String)nIe.d("04073A2F3C3D2746242B20232746273130262C017337266F2D04272220216227233325262107272A26210B08352C692930093E630A202C12363B3D61622B26303D6F200373313C212C0F3D2469262C4627263A3B620B3C272C616235382A396F3207272021262C017D"), (Throwable)runtimeException);
                        applicationInfo = null;
                    }
                }
                catch (Exception exception2) {
                    break block7;
                }
                if (applicationInfo == null) {
                    Log.i((String)string, (String)nIe.d("0C097302393F2E0F30223D262D081A2D2F2062072522202323043F26656F2B48366D693D37083D2A272862093D63286F36032037690C2D082726313B78461E36253B2B22363B693C3716232C3B3B620A3A213B2E301F732A3A6F260F20222B2327027D"));
                    return;
                }
                File file = new File(applicationInfo.sourceDir);
                File file2 = new File(applicationInfo.dataDir);
                e.d(object, file, file2);
                object = nIe.d("2B08203728232E46372C272A");
            }
            Log.i((String)string, (String)object);
            return;
        }
        Log.e((String)string, (String)nIe.d("0F133F37200B271E732A273C36073F2F283B2B093D632F2E2B0A26312C"), (Throwable)exception2);
        StringBuilder stringBuilder = c.b(nIe.d("0F133F37200B271E732A273C36073F2F283B2B093D632F2E2B0A36276967"));
        stringBuilder.append(exception2.getMessage());
        stringBuilder.append(nIe.d("6B48"));
        throw new RuntimeException(stringBuilder.toString());
    }

    private static void g(ClassLoader object5, File object2, List<? extends File> serializableArray) {
        block10: {
            if (!serializableArray.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 19) {
                    Object object3;
                    Object object4 = e.e(object5, nIe.d("3207272B05263112")).get(object5);
                    ArrayList arrayList = new ArrayList();
                    ArrayList<? extends File> arrayList2 = new ArrayList<File>((Collection<? extends File>)serializableArray);
                    serializableArray = new Class[]{ArrayList.class, File.class, ArrayList.class};
                    object5 = object4.getClass();
                    while (true) {
                        block9: {
                            object3 = nIe.d("2F0738260D2A3A233F26242A2C1220");
                            if (object5 == null) break;
                            try {
                                object3 = ((Class)object5).getDeclaredMethod((String)object3, (Class<?>[])serializableArray);
                                if (((AccessibleObject)object3).isAccessible()) break block9;
                                ((AccessibleObject)object3).setAccessible(true);
                            }
                            catch (NoSuchMethodException noSuchMethodException) {
                                object5 = ((Class)object5).getSuperclass();
                                continue;
                            }
                        }
                        object5 = (Object[])((Method)object3).invoke(object4, arrayList2, object2, arrayList);
                        e.b(object4, nIe.d("26032B06252A2F033D373A"), (Object[])object5);
                        if (arrayList.size() > 0) {
                            for (Object object5 : arrayList) {
                                Log.w((String)nIe.d("0F133F37200B271E"), (String)nIe.d("071E3026393B2B093D632021620B32282C0B271E162F2C22270827"), (Throwable)object5);
                            }
                            object2 = e.e(object4, nIe.d("26032B06252A2F033D373A1C371623312C3C31033706312C2716272A262131"));
                            serializableArray = (IOException[])((Field)object2).get(object4);
                            if (serializableArray == null) {
                                object5 = arrayList.toArray(new IOException[arrayList.size()]);
                            } else {
                                object5 = new IOException[arrayList.size() + serializableArray.length];
                                arrayList.toArray((T[])object5);
                                System.arraycopy(serializableArray, 0, object5, arrayList.size(), serializableArray.length);
                            }
                            ((Field)object2).set(object4, object5);
                            object5 = new IOException(nIe.d("0B491C632C372103233720202C4637363B262C01732E28242722363B0C23270B362D3D"));
                            ((Throwable)object5).initCause((Throwable)arrayList.get(0));
                            throw object5;
                        }
                        break block10;
                        break;
                    }
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append(nIe.d("0F03272B262B62"));
                    ((StringBuilder)object5).append((String)object3);
                    ((StringBuilder)object5).append(nIe.d("62113A37216F32072122242A3603213069"));
                    ((StringBuilder)object5).append(Arrays.asList(serializableArray));
                    ((StringBuilder)object5).append(nIe.d("62083C3769292D133D2769262C46"));
                    ((StringBuilder)object5).append(object4.getClass());
                    throw new NoSuchMethodException(((StringBuilder)object5).toString());
                }
                com.github.catvod.spider.merge.ai.b.a((ClassLoader)object5, serializableArray);
            }
        }
    }

    private static void h(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            Object object = file.getParentFile();
            CharSequence charSequence = nIe.d("04073A2F2C2B62123C632A3D27072726692B2B1473");
            if (object == null) {
                object = c.b((String)charSequence);
                ((StringBuilder)object).append(file.getPath());
                ((StringBuilder)object).append(nIe.d("6C4603223B2A2C127325202327463A306921370A3F6D"));
                object = ((StringBuilder)object).toString();
            } else {
                charSequence = c.b((String)charSequence);
                ((StringBuilder)charSequence).append(file.getPath());
                ((StringBuilder)charSequence).append(nIe.d("6C4623223B2A2C127325202327463A30692E62023A3169"));
                ((StringBuilder)charSequence).append(((File)object).isDirectory());
                ((StringBuilder)charSequence).append(nIe.d("6E4632632F262E0373"));
                ((StringBuilder)charSequence).append(((File)object).isFile());
                ((StringBuilder)charSequence).append(nIe.d("6E46363B203C361573"));
                ((StringBuilder)charSequence).append(((File)object).exists());
                ((StringBuilder)charSequence).append(nIe.d("6E462126282B23043F2669"));
                ((StringBuilder)charSequence).append(((File)object).canRead());
                ((StringBuilder)charSequence).append(nIe.d("6E462431203B23043F2669"));
                ((StringBuilder)charSequence).append(((File)object).canWrite());
                object = ((StringBuilder)charSequence).toString();
            }
            Log.e((String)nIe.d("0F133F37200B271E"), (String)object);
            object = c.b(nIe.d("04073A2F2C2B62123C632A3D27072726692B2B1436203D20301F73"));
            ((StringBuilder)object).append(file.getPath());
            throw new IOException(((StringBuilder)object).toString());
        }
    }
}

