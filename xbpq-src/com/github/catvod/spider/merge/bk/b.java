/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.bk;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.ai.c;
import com.github.catvod.spider.merge.bk.a;
import com.github.catvod.spider.merge.nIe;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

final class b
implements a {
    private final String a;
    private final HashMap<String, File> b = new HashMap();

    b(String string) {
        this.a = string;
    }

    @Override
    public final Uri a(File object) {
        CharSequence charSequence;
        try {
            charSequence = ((File)object).getCanonicalPath();
            object = null;
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(nIe.d("04073A2F2C2B62123C633B2A31093F352C6F21073D2C272621073F63392E360E7325263D62"));
            stringBuilder.append(object);
            object = new IllegalArgumentException(stringBuilder.toString());
            throw object;
        }
        for (Map.Entry<String, File> entry : this.b.entrySet()) {
            String string = entry.getValue().getPath();
            if (!((String)charSequence).startsWith(string) || object != null && string.length() <= ((File)object.getValue()).getPath().length()) continue;
            object = entry;
        }
        if (object != null) {
            Map.Entry<String, File> entry;
            Object object2 = ((File)object.getValue()).getPath();
            entry = nIe.d("6D");
            boolean bl = ((String)object2).endsWith((String)((Object)entry));
            int n2 = ((String)object2).length();
            if (!bl) {
                ++n2;
            }
            object2 = ((String)charSequence).substring(n2);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(Uri.encode((String)((String)object.getKey())));
            ((StringBuilder)charSequence).append('/');
            ((StringBuilder)charSequence).append(Uri.encode((String)object2, (String)((Object)entry)));
            object = ((StringBuilder)charSequence).toString();
            return new Uri.Builder().scheme(nIe.d("21093D372C2136")).authority(this.a).encodedPath((String)object).build();
        }
        throw new IllegalArgumentException(c.a(nIe.d("04073A2F2C2B62123C632F262C0273202621240F34363B2A2646212C263B62123B223D6F21093D3728262C1573"), (String)charSequence));
    }

    final void b(String string, File file) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            try {
                File file2 = file.getCanonicalFile();
                this.b.put(string, file2);
            }
            catch (IOException iOException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(nIe.d("04073A2F2C2B62123C633B2A31093F352C6F21073D2C272621073F63392E360E7325263D62"));
                stringBuilder.append(file);
                throw new IllegalArgumentException(stringBuilder.toString(), iOException);
            }
            return;
        }
        throw new IllegalArgumentException(nIe.d("0C073E26692237152763272036463126692A2F16273A"));
    }
}

