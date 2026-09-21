/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u0671;
import com.github.catvod.spider.merge.\u078a;
import com.github.catvod.spider.merge.\u078c;
import com.github.catvod.spider.merge.\u0e33;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;

public class \u0788 {
    private static String[] \u037f = new String[]{SOY.d("12203410"), SOY.d("092032"), SOY.d("193E300507"), SOY.d("0E3B251A11"), SOY.d("1B3E25")};

    private static String \u037f(String string) {
        CharSequence charSequence = string;
        if (!string.isEmpty()) {
            String string2 = SOY.d("55");
            int n2 = 0;
            String string3 = SOY.d("57");
            String string4 = SOY.d("5E");
            String string5 = SOY.d("52");
            String string6 = SOY.d("53");
            String string7 = SOY.d("50");
            String string8 = SOY.d("51");
            String string9 = SOY.d("54");
            String string10 = SOY.d("21");
            String string11 = SOY.d("27");
            String string12 = SOY.d("45");
            String string13 = SOY.d("24");
            String string14 = SOY.d("01");
            String string15 = SOY.d("07");
            String string16 = SOY.d("06");
            while (true) {
                charSequence = string;
                if (n2 >= 15) break;
                String string17 = (new String[]{string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16})[n2];
                charSequence = string;
                if (string.contains(string17)) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(SOY.d("26"));
                    ((StringBuilder)charSequence).append(string17);
                    charSequence = string.replace(string17, ((StringBuilder)charSequence).toString());
                }
                ++n2;
                string = charSequence;
            }
        }
        return charSequence;
    }

    public static String \u0528(String object, String string, Map<String, String> object2) {
        try {
            \u078a.\u037f \u03f3 = new \u078a.\u037f(){

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            \u078c.\u052a(\u078c.\u0529(), (String)object, null, object2, \u03f3);
            object = ((Response)\u03f3.getResult()).body().bytes();
            object2 = new String((byte[])object, string);
            object = ((String)object2).replaceAll(SOY.d("772E5B"), "");
            return object;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public static String \u0529(String object, Map<String, String> object2, String string, Map<String, String> map) {
        try {
            \u078a.\u037f \u03f3 = new \u078a.\u037f(){

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            \u078c.\u052d(\u078c.\u0529(), (String)object, object2, map, \u03f3);
            object = ((Response)\u03f3.getResult()).body().bytes();
            object2 = new String((byte[])object, string);
            object = ((String)object2).replaceAll(SOY.d("772E5B"), "");
            return object;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String \u052a(String charSequence, String string) {
        boolean bl;
        CharSequence charSequence2 = SOY.d("1733324C5B58");
        CharSequence charSequence3 = SOY.d("55");
        try {
            if (string.startsWith(SOY.d("557D"))) {
                charSequence2 = Uri.parse((String)charSequence);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(charSequence2.getScheme());
                ((StringBuilder)charSequence).append(SOY.d("40"));
                ((StringBuilder)charSequence).append(string);
                charSequence = ((StringBuilder)charSequence).toString();
                return charSequence;
            }
            bl = string.startsWith((String)charSequence3);
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return string;
        }
        String string2 = SOY.d("407D7E");
        {
            if (bl && string.contains(SOY.d("473A250204"))) {
                charSequence = Uri.parse((String)charSequence);
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append(charSequence.getScheme());
                ((StringBuilder)charSequence2).append(string2);
                ((StringBuilder)charSequence2).append(charSequence.getHost());
                ((StringBuilder)charSequence2).append(string);
                return ((StringBuilder)charSequence2).toString();
            }
            if (string.startsWith((String)charSequence2)) {
                charSequence = Uri.parse((String)charSequence);
                charSequence3 = new StringBuilder();
                ((StringBuilder)charSequence3).append(charSequence.getScheme());
                ((StringBuilder)charSequence3).append(string2);
                return string.replace(charSequence2, ((StringBuilder)charSequence3).toString());
            }
            charSequence2 = string;
            if (string.contains(string2)) return charSequence2;
            charSequence = Uri.parse((String)charSequence);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(charSequence.getScheme());
            ((StringBuilder)charSequence2).append(string2);
            ((StringBuilder)charSequence2).append(charSequence.getHost());
            if (!string.startsWith((String)charSequence3)) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence3);
                ((StringBuilder)charSequence).append(string);
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = string;
            }
            ((StringBuilder)charSequence2).append((String)charSequence);
            return ((StringBuilder)charSequence2).toString();
        }
    }

    private static String \u052b(\u013a \u013a2, String string, String object) {
        String[] stringArray = string.split((String)object);
        object = new ArrayList();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2;
            string = stringArray[i2].trim();
            if (string.startsWith(string2 = SOY.d("5D")) && string.endsWith(string2) || string.startsWith(string2 = SOY.d("58")) && string.endsWith(string2)) {
                object.add(string.substring(1, string.length() - 1).replace(SOY.d("263C"), SOY.d("70")));
                continue;
            }
            object.add(\u0788.\u052c(\u013a2, string));
        }
        return \u0788.\u0781((List<String>)object, "");
    }

    private static String \u052c(\u013a \u013a2, String stringArray) {
        if ((stringArray = stringArray.split(SOY.d("5C74"))).length != 1) {
            \u013a2 = \u0788.\u0620(stringArray[0], \u013a2);
        }
        for (int i2 = 1; i2 < stringArray.length - 1; ++i2) {
            \u013a2 = \u0788.\u0620(stringArray[i2], \u013a2);
        }
        return \u0788.\u052e(\u013a2, stringArray[stringArray.length - 1]);
    }

    private static HashMap<String, String> \u052d() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E434740546167"));
        return hashMap;
    }

    public static String \u052e(\u013a \u013a2, String string) {
        if (SOY.d("50").equals(string)) {
            return SOY.d("14273D1A");
        }
        String[] stringArray = string.split(SOY.d("262E0D0A"));
        if (stringArray.length > 1) {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string2 = null;
                try {
                    String string3;
                    string2 = string3 = \u0788.\u058f(\u013a2, stringArray[i2]);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                if (TextUtils.isEmpty(string2)) continue;
                return string2;
            }
        }
        return \u0788.\u058f(\u013a2, string);
    }

    public static String \u052f(\u013a \u013a2, String string) {
        if (string != null && string.length() != 0 && !SOY.d("50").equals(string)) {
            boolean bl = string.contains(SOY.d("5438224C"));
            String string2 = SOY.d("95EEDA");
            if (bl) {
                return \u0788.\u052b(\u013a2, string, string2);
            }
            if (string.contains(string2)) {
                return \u0788.\u052b(\u013a2, string, string2);
            }
            return \u0788.\u052b(\u013a2, string, SOY.d("2679"));
        }
        return "";
    }

    private static String \u058f(\u013a object, String object2) {
        Object object3;
        block13: {
            String string;
            int n2;
            int n3;
            block11: {
                object3 = ((String)object2).split(SOY.d("267C3B054E"));
                n3 = ((String[])object3).length;
                n2 = 1;
                string = object2;
                if (n3 <= 1) break block11;
                string = object3[0];
            }
            String[] stringArray = string.split(SOY.d("5B"));
            n3 = stringArray.length;
            String string2 = SOY.d("5A");
            String string3 = SOY.d("70");
            object2 = SOY.d("386465321114");
            object3 = SOY.d("2E372902");
            String string4 = SOY.d("3B262504");
            String string5 = SOY.d("32263C1A");
            if (n3 > 1) {
                block12: {
                    object = stringArray[0].equals(object3) ? ((\u013a)object).\u08b9() : (((String)object2).equals(stringArray[0]) ? new String(Base64.decode((String)((\u013a)object).\u08b9(), (int)0)) : (string5.equals(stringArray[0]) ? ((\u013a)object).\u08a3() : (stringArray[0].contains(string4) ? ((\u0582)object).\u0529(stringArray[0].replace(string4, "")) : ((\u0582)object).\u0529(stringArray[0]))));
                    n3 = n2;
                    object2 = object;
                    if (string5.equals(string)) break block12;
                    object2 = ((String)object).replaceAll(string3, string2);
                    n3 = n2;
                }
                while (true) {
                    object3 = object2;
                    if (n3 < stringArray.length) {
                        object2 = ((String)object2).replace(stringArray[n3], "");
                        ++n3;
                        continue;
                    }
                    break block13;
                    break;
                }
            }
            try {
                object = string.equals(object3) ? ((\u013a)object).\u08b9() : (((String)object2).equals(string) ? new String(Base64.decode((String)((\u013a)object).\u08b9(), (int)0)) : (string5.equals(string) ? ((\u013a)object).\u08a3() : (string.contains(string4) ? ((\u0582)object).\u0529(string.replace(string4, "")) : ((\u0582)object).\u0529(string))));
                object3 = object;
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
                return null;
            }
            if (string5.equals(string)) break block13;
            object3 = ((String)object).replaceAll(string3, string2);
        }
        return object3;
    }

    public static \u013a \u0620(String object, \u013a \u013a2) {
        if (!((String)object).startsWith(SOY.d("2E372902")) && !((String)object).startsWith(SOY.d("3B262504"))) {
            int n2;
            Object object2 = \u037f;
            int n3 = ((String[])object2).length;
            for (n2 = 0; n2 < n3; ++n2) {
                if (!object2[n2].equals(object)) continue;
                return \u013a2;
            }
            object2 = ((String)object).split(SOY.d("577F"));
            n3 = ((String[])object2).length;
            if (n3 > 1) {
                \u013a2 = \u0788.\u0620(object2[0], \u013a2);
                object = \u013a2.\u078b();
                for (n2 = 1; n2 < ((String[])object2).length; ++n2) {
                    object = ((String)object).replace(\u0788.\u0620(object2[n2], \u013a2).\u078b(), "");
                    \u013a2 = \u0671.\u037f((String)object);
                }
                return \u013a2;
            }
            String[] stringArray = ((String)object).split(SOY.d("262E0D0A"));
            if (stringArray.length > 1) {
                for (n2 = 0; n2 < stringArray.length; ++n2) {
                    object2 = null;
                    try {
                        \u013a \u013a3 = \u0788.\u0620(stringArray[n2], \u013a2);
                        object2 = \u013a3;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    if (object2 == null) continue;
                    return object2;
                }
            }
            if (((String[])(object2 = ((String)object).split(SOY.d("56")))).length > 1) {
                n2 = Integer.parseInt(object2[1]);
                object = \u013a2.\u08b3(object2[0]);
                if (n2 < 0) {
                    return (\u013a)((ArrayList)object).get(((ArrayList)object).size() + n2);
                }
                return (\u013a)\u013a2.\u08b3(object2[0]).get(n2);
            }
            return \u013a2.\u08b3((String)object).\u0529();
        }
        return \u013a2;
    }

    public static boolean \u0780(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return (string = string.toLowerCase()).startsWith(SOY.d("17333618110340")) || string.startsWith(SOY.d("1F36631D4E")) || string.startsWith(SOY.d("0E3A241810120868")) || string.startsWith(SOY.d("12262506")) && string.split(SOY.d("41"))[0].endsWith(SOY.d("54263E0406121426")) || string.startsWith(SOY.d("1C26214C5B58")) || string.startsWith(SOY.d("0E2433190C5A02356B")) || string.startsWith(SOY.d("02356B595B")) || string.startsWith(SOY.d("0235211A150E407D7E"));
            {
            }
        }
        return false;
    }

    public static String \u0781(List<String> list, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if (list != null && list.size() > 0) {
            int n2 = list.size();
            if (n2 <= 1) {
                return list.get(0);
            }
            stringBuilder.append(list.get(0));
            for (int i2 = 1; i2 < list.size(); ++i2) {
                stringBuilder.append(string);
                stringBuilder.append(list.get(i2));
            }
            return stringBuilder.toString();
        }
        return "";
    }

    public static String \u0782(String string) {
        String string2 = SOY.d("21B4DFE491CDF5");
        String string3 = SOY.d("21B4CAC992FAD8");
        String string4 = SOY.d("21B6E9FB91FBFFB7C1DD");
        String string5 = string;
        for (int i2 = 0; i2 < 3; ++i2) {
            String string6 = (new String[]{string2, string3, string4})[i2];
            string = string5;
            if (string5.contains(string6)) {
                string = string5.substring(0, string5.indexOf(string6));
            }
            string5 = string;
        }
        return string5;
    }

    public static String \u0783(String string, String string2) {
        String string3 = string;
        if (!string.isEmpty()) {
            String[] stringArray = \u0788.\u0787(string2, SOY.d("21B4CAC992FAD868"), SOY.d("27")).get(0).split(SOY.d("262E0D0A"));
            int n2 = stringArray.length;
            int n3 = 0;
            while (true) {
                string3 = string;
                if (n3 >= n2) break;
                String string4 = stringArray[n3];
                string3 = SOY.d("476C");
                string2 = string;
                if (string4.contains(string3)) {
                    string2 = string4.split(string3).length < 2 ? string.replace(string4.split(string3)[0], "") : string.replace(string4.split(string3)[0], string4.split(string3)[1]);
                }
                ++n3;
                string = string2;
            }
        }
        return string3;
    }

    public static \u0e33 \u0784(\u013a \u013a2, String object) {
        String[] stringArray = ((String)object).split(SOY.d("262E0D0A"));
        object = new \u0e33();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            try {
                ((ArrayList)object).addAll(\u0788.\u0785(\u013a2, stringArray[i2]));
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return object;
    }

    private static \u0e33 \u0785(\u013a cloneable, String object) {
        String[] stringArray = ((String)object).split(SOY.d("56"));
        if (stringArray.length > 1) {
            int n2;
            int n3;
            block11: {
                block10: {
                    object = stringArray[1].split(SOY.d("40"), -1);
                    if (!TextUtils.isEmpty((CharSequence)object[0])) {
                        try {
                            n3 = Integer.parseInt(object[0]);
                            break block10;
                        }
                        catch (NumberFormatException numberFormatException) {
                            numberFormatException.printStackTrace();
                        }
                    }
                    n3 = 0;
                }
                if (!TextUtils.isEmpty((CharSequence)object[1])) {
                    try {
                        n2 = Integer.parseInt(object[1]);
                        break block11;
                    }
                    catch (NumberFormatException numberFormatException) {
                        numberFormatException.printStackTrace();
                    }
                }
                n2 = 0;
            }
            cloneable = ((\u013a)cloneable).\u08b3(stringArray[0]);
            int n4 = n2;
            if (n2 > ((ArrayList)cloneable).size()) {
                n4 = ((ArrayList)cloneable).size();
            }
            n2 = n4;
            if (n4 <= 0) {
                n2 = n4 + ((ArrayList)cloneable).size();
            }
            object = new \u0e33();
            while (n3 < n2) {
                ((ArrayList)object).add((\u013a)((ArrayList)cloneable).get(n3));
                ++n3;
            }
            return object;
        }
        return ((\u013a)cloneable).\u08b3((String)object);
    }

    /*
     * Unable to fully structure code
     */
    public static String \u0786(String var0) {
        block8: {
            try {
                var3_1 = var0.split(SOY.d("552139170612"))[0];
                var5_2 = \u078c.\u058f(var0, \u0788.\u052d()).replace(SOY.d("0C3323560402083E"), SOY.d("0C3323561916133C"));
                var2_3 = null;
            }
            catch (Exception var2_4) {
                ** continue;
            }
            var1_5 = var5_2.indexOf(SOY.d("17333818"));
            var4_6 = SOY.d("12262506");
            if (var1_5 == -1) ** GOTO lbl21
            var5_2 = Pattern.compile(SOY.d("0C3323561916133C714B542C5D700C5E5A5D457B0A51562A")).matcher((CharSequence)var5_2);
            if (var5_2.find() && (var2_3 = var5_2.group(1).trim()).indexOf((String)var4_6) == -1) {
                var4_6 = new StringBuilder();
                var4_6.append(var3_1);
                var4_6.append(var2_3);
                var2_3 = var4_6.toString();
            }
            break block8;
lbl21:
            // 1 sources

            var5_2 = Pattern.compile(SOY.d("0F203D4C5A5D45097654295F54786E5F2F50580F")).matcher((CharSequence)var5_2);
            if (var5_2.find() && (var2_3 = var5_2.group(1).trim()).indexOf((String)var4_6) == -1) {
                var4_6 = new StringBuilder();
                var4_6.append(var3_1);
                var4_6.append(var2_3);
                var2_3 = var4_6.toString();
            }
        }
        if (var2_3 != null) {
            var0 = var2_3;
        }
lbl32:
        // 4 sources

        return var0;
    }

    public static ArrayList<String> \u0787(String object, String string, String string2) {
        String string3 = SOY.d("5C");
        String string4 = SOY.d("95EED799C8F1");
        ArrayList<String> arrayList = new ArrayList<String>();
        if (string.isEmpty() && string2.isEmpty()) {
            arrayList.add((String)object);
            return arrayList;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(\u0788.\u037f(string.replaceAll(string4, string3)));
            stringBuilder.append(SOY.d("527C7B495D"));
            stringBuilder.append(\u0788.\u037f(string2.replaceAll(string4, string3)));
            object = Pattern.compile(stringBuilder.toString()).matcher((CharSequence)object);
            while (((Matcher)object).find()) {
                arrayList.add(((Matcher)object).group(1).trim());
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        if (arrayList.isEmpty()) {
            arrayList.add("");
        }
        return arrayList;
    }

    public static String \u0788(String stringArray) {
        StringBuffer stringBuffer = new StringBuffer();
        stringArray = stringArray.split(SOY.d("260E24"));
        for (int i2 = 1; i2 < stringArray.length; ++i2) {
            stringBuffer.append((char)Integer.parseInt(stringArray[i2], 16));
        }
        return stringBuffer.toString();
    }
}

