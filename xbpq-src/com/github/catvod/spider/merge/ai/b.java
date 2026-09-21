/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  dalvik.system.DexFile
 */
package com.github.catvod.spider.merge.ai;

import android.util.Log;
import com.github.catvod.spider.merge.ai.a;
import com.github.catvod.spider.merge.ai.e;
import com.github.catvod.spider.merge.nIe;
import dalvik.system.DexFile;
import java.io.File;
import java.util.List;

final class b {
    private final a a;

    private b() {
        a a2;
        Class<?> clazz = Class.forName(nIe.d("26073F3520246C152A303D2A2F481726311F23123B0F203C3642162F2C22270827"));
        try {
            a2 = new a(clazz, 0);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            try {
                a2 = new a(clazz, 1);
            }
            catch (NoSuchMethodException noSuchMethodException2) {
                a2 = new a(clazz, 2);
            }
        }
        this.a = a2;
    }

    static void a(ClassLoader objectArray, List<? extends File> list) {
        Object object = e.a(objectArray, nIe.d("3207272B05263112")).get(objectArray);
        b b2 = new b();
        int n2 = list.size();
        objectArray = new Object[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            File file = list.get(i2);
            a a2 = b2.a;
            String string = file.getPath();
            File file2 = file.getParentFile();
            String string2 = file.getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2.substring(0, string2.length() - 4));
            stringBuilder.append(nIe.d("6C02363B"));
            objectArray[i2] = a2.a(file, DexFile.loadDex((String)string, (String)new File(file2, stringBuilder.toString()).getPath(), (int)0));
        }
        try {
            e.b(object, nIe.d("26032B06252A2F033D373A"), objectArray);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Log.w((String)nIe.d("0F133F37200B271E"), (String)nIe.d("04073A2F2C2B62003A2D2D6F240F362F2D6F6502363B0C23270B362D3D3C654632373D2A2F16272A2728624123223D27070A362E2C21361574"), (Throwable)noSuchFieldException);
            e.b(object, nIe.d("3207272B0C23270B362D3D3C"), objectArray);
        }
    }
}

