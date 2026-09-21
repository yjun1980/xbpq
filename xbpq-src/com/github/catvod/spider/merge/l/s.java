/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.l;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class s {
    public static String a(String string) {
        int n2 = l.a;
        n2 = string != null && !string.isEmpty() ? 0 : 1;
        if (n2 != 0) {
            string = null;
        }
        return string;
    }

    public static String b(String string, Object ... objectArray) {
        int n2;
        CharSequence charSequence;
        int n3;
        int n4 = 0;
        for (n3 = 0; n3 < objectArray.length; ++n3) {
            Object object = objectArray[n3];
            if (object == null) {
                charSequence = cYh.d("09252D3D");
            } else {
                try {
                    charSequence = object.toString();
                }
                catch (Exception exception) {
                    charSequence = object.getClass().getName();
                    Object object2 = Integer.toHexString(System.identityHashCode(object));
                    n2 = ((String)charSequence).length();
                    object = new StringBuilder(String.valueOf(object2).length() + (n2 + 1));
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append('@');
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                    Logger logger = Logger.getLogger(cYh.d("043F2C7F303508372D347939083D2C3E39740531323479091322283F3029"));
                    object2 = Level.WARNING;
                    charSequence = cYh.d("22282234272E0E3F2F71332F15392F367736023E2834392E213F333C362E47362E2377");
                    String string2 = String.valueOf(object);
                    charSequence = string2.length() != 0 ? ((String)charSequence).concat(string2) : new String((String)charSequence);
                    logger.log((Level)object2, (String)charSequence, exception);
                    charSequence = exception.getClass().getName();
                    n2 = String.valueOf(object).length();
                    StringBuilder stringBuilder = new StringBuilder(((String)charSequence).length() + (n2 + 9));
                    stringBuilder.append(cYh.d("5B"));
                    stringBuilder.append((String)object);
                    stringBuilder.append(cYh.d("47242923322D47"));
                    stringBuilder.append((String)charSequence);
                    stringBuilder.append(cYh.d("59"));
                    charSequence = stringBuilder.toString();
                }
            }
            objectArray[n3] = charSequence;
        }
        n3 = string.length();
        charSequence = new StringBuilder(objectArray.length * 16 + n3);
        n2 = 0;
        for (n3 = n4; n3 < objectArray.length && (n4 = string.indexOf(cYh.d("4223"), n2)) != -1; ++n3) {
            ((StringBuilder)charSequence).append(string, n2, n4);
            ((StringBuilder)charSequence).append(objectArray[n3]);
            n2 = n4 + 2;
        }
        ((StringBuilder)charSequence).append(string, n2, string.length());
        if (n3 < objectArray.length) {
            ((StringBuilder)charSequence).append(cYh.d("470B"));
            n2 = n3 + 1;
            ((StringBuilder)charSequence).append(objectArray[n3]);
            for (n3 = n2; n3 < objectArray.length; ++n3) {
                ((StringBuilder)charSequence).append(cYh.d("4B70"));
                ((StringBuilder)charSequence).append(objectArray[n3]);
            }
            ((StringBuilder)charSequence).append(']');
        }
        return ((StringBuilder)charSequence).toString();
    }
}

