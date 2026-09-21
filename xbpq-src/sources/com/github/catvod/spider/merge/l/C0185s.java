package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.github.catvod.spider.merge.l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185s {
    public static String a(String str) {
        int i = C0178l.a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String b(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = cYh.d("09252D3D");
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger(cYh.d("043F2C7F303508372D347939083D2C3E39740531323479091322283F3029"));
                    Level level = Level.WARNING;
                    String d = cYh.d("22282234272E0E3F2F71332F15392F367736023E2834392E213F333C362E47362E2377");
                    String valueOf = String.valueOf(sb3);
                    logger.log(level, valueOf.length() != 0 ? d.concat(valueOf) : new String(d), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append(cYh.d("5B"));
                    sb4.append(sb3);
                    sb4.append(cYh.d("47242923322D47"));
                    sb4.append(name2);
                    sb4.append(cYh.d("59"));
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf(cYh.d("4223"), i3)) != -1) {
            sb5.append((CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb5.append(cYh.d("470B"));
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(cYh.d("4B70"));
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
