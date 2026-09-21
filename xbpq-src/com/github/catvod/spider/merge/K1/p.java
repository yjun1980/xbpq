/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.K1.o;
import com.github.catvod.spider.merge.n1.i;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

public final class p {
    private static final Pattern a = Pattern.compile("(https?)?://m\\.");
    private static final Pattern b = Pattern.compile("(https?)?://www\\.");
    public static final int c = 0;

    public static void a(Pattern pattern, String string) {
        if (!p.j(string)) {
            if (pattern.matcher(string.toLowerCase()).find()) {
                return;
            }
            throw new i("Url doesn't match the pattern");
        }
        throw new IllegalArgumentException("Url can't be null or empty");
    }

    public static String b(String string) {
        try {
            string = URLDecoder.decode(string, "UTF-8");
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException(unsupportedEncodingException);
        }
    }

    public static String c(String string) {
        try {
            string = URLEncoder.encode(string, "UTF-8");
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException(unsupportedEncodingException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String d(String string) {
        String string2;
        URL uRL;
        try {
            uRL = p.q(string);
            string2 = string;
        }
        catch (Exception exception) {
            return string;
        }
        if (!uRL.getHost().contains("google")) return string2;
        string2 = string;
        if (!uRL.getPath().equals("/url")) return string2;
        return p.b(d.f("&url=([^&]+)(?:&|$)", string, 1));
    }

    public static String e(String string) {
        try {
            Object object = p.q(string);
            String string2 = ((URL)object).getProtocol();
            object = ((URL)object).getAuthority();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("://");
            stringBuilder.append((String)object);
            string2 = stringBuilder.toString();
            return string2;
        }
        catch (MalformedURLException malformedURLException) {
            String string3 = malformedURLException.getMessage();
            if (string3.startsWith("unknown protocol: ")) {
                return string3.substring(18);
            }
            throw new i(e.c("Malformed url: ", string), malformedURLException);
        }
    }

    public static String f(URL stringArray, String string) {
        if ((stringArray = stringArray.getQuery()) != null) {
            String[] stringArray2 = stringArray.split("&");
            int n2 = stringArray2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                stringArray = stringArray2[i2].split("=", 2);
                if (!p.b(stringArray[0]).equals(string)) continue;
                return p.b(stringArray[1]);
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String g(String string, String[] objectArray) {
        int n2;
        Object object = new ArrayList<Pattern>();
        int n3 = objectArray.length;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            Object object2 = objectArray[n2];
            if (object2 == null) continue;
            ((ArrayList)object).add(Pattern.compile((String)object2));
        }
        objectArray = ((ArrayList)object).toArray(new Pattern[0]);
        n3 = objectArray.length;
        n2 = n4;
        while (true) {
            if (n2 >= n3) {
                throw new o("No regex matched the input on group 1");
            }
            object = objectArray[n2];
            try {
                object = d.g((Pattern)object, string, 1);
                if (object != null) {
                    return object;
                }
            }
            catch (o o2) {}
            ++n2;
        }
    }

    public static boolean h(String string) {
        boolean bl = string == null || string.trim().isEmpty();
        return bl;
    }

    public static boolean i(URL uRL) {
        String string = uRL.getProtocol();
        boolean bl = string.equals("http");
        boolean bl2 = false;
        if (!bl && !string.equals("https")) {
            return false;
        }
        boolean bl3 = uRL.getPort() == uRL.getDefaultPort();
        boolean bl4 = uRL.getPort() == -1;
        if (bl4 || bl3) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean j(String string) {
        boolean bl = string == null || string.isEmpty();
        return bl;
    }

    public static boolean k(Collection<?> collection) {
        boolean bl = collection == null || collection.isEmpty();
        return bl;
    }

    public static <K, V> boolean l(Map<K, V> map) {
        boolean bl = map == null || map.isEmpty();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long m(String string) {
        double d2;
        String string2;
        int n2 = 2;
        try {
            string2 = d.f("[\\d]+([\\.,][\\d]+)?([KMBkmb])+", string, 2);
        }
        catch (i i2) {
            string2 = "";
        }
        double d3 = Double.parseDouble(d.f("([\\d]+([\\.,][\\d]+)?)", string, 1).replace(",", "."));
        string = string2.toUpperCase();
        Objects.requireNonNull(string);
        int n3 = -1;
        switch (string.hashCode()) {
            case 77: {
                if (!string.equals("M")) break;
                n3 = 1;
                break;
            }
            case 75: {
                if (!string.equals("K")) break;
                n3 = 2;
                break;
            }
            case 66: {
                if (!string.equals("B")) break;
                n3 = 3;
                break;
            }
        }
        switch (n3) {
            default: {
                n2 = -1;
                break;
            }
            case 2: {
                n2 = 1;
                break;
            }
            case 3: {
                n2 = 0;
                break;
            }
            case 1: 
        }
        switch (n2) {
            default: {
                return (long)d3;
            }
            case 2: {
                d2 = 1000000.0;
                return (long)(d3 * d2);
            }
            case 1: {
                d2 = 1000.0;
                return (long)(d3 * d2);
            }
            case 0: 
        }
        d2 = 1.0E9;
        return (long)(d3 * d2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String n(String string) {
        String string2;
        if (a.matcher(string).find()) {
            string2 = "m.";
            return string.replace(string2, "");
        }
        if (!b.matcher(string).find()) return string;
        string2 = "www.";
        return string.replace(string2, "");
    }

    public static String o(String string) {
        return string.replaceAll("\\D+", "");
    }

    public static String p(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (string.startsWith("http://")) {
            string2 = e.c("https://", string.substring(7));
        }
        return string2;
    }

    public static URL q(String string) {
        try {
            URL uRL = new URL(string);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            String string2 = malformedURLException.getMessage();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("no protocol: ");
            stringBuilder.append(string);
            if (string2.equals(stringBuilder.toString())) {
                return new URL(e.c("https://", string));
            }
            throw malformedURLException;
        }
    }
}

