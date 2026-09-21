/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g;

import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {
    public static final int[] a = new int[]{2130903102, 2130903103, 2130903104, 2130903174, 2130903175, 2130903176, 2130903177, 2130903178, 2130903179, 2130903192, 2130903205, 2130903206, 2130903230, 2130903267, 2130903268, 2130903269, 2130903270, 2130903271, 2130903282, 2130903285, 2130903373, 2130903411, 2130903441, 2130903444, 2130903445, 2130903497, 2130903500, 2130903546, 2130903555};
    public static final int[] b = new int[]{16842931};
    public static final int[] c = new int[]{16843071};
    public static final int[] d = new int[]{2130903102, 2130903103, 2130903151, 2130903267, 2130903500, 2130903555};
    public static final int[] e = new int[]{0x1010119, 2130903491, 2130903544, 2130903545};
    public static final int[] f = new int[]{16842804, 16843117, 16843118, 16843119, 0x1010170, 16843666, 16843667};
    public static final int[] g = new int[]{16842804, 2130903096, 2130903097, 2130903098, 2130903099, 2130903100, 2130903214, 2130903215, 2130903216, 2130903217, 2130903219, 2130903220, 2130903221, 2130903222, 2130903232, 2130903253, 2130903262, 2130903288, 2130903357, 2130903510, 2130903527};
    public static final int[] h = com.github.catvod.spider.merge.g.a.$d2j$hex$2e636dbe$decode_I("57000101ae0001010300037f0400037f0500037f0600037f0700037f0800037f0900037f0a00037f0b00037f0c00037f0d00037f0e00037f0f00037f1100037f1200037f1300037f1400037f1500037f1600037f1700037f1800037f1900037f1a00037f1b00037f1c00037f1d00037f1e00037f1f00037f2000037f2100037f2200037f2300037f2600037f2700037f2800037f2900037f2a00037f3700037f4a00037f4c00037f4d00037f4e00037f4f00037f5000037f5500037f5600037f6400037f6500037f7300037f7400037f7500037f7600037f7700037f7800037f7900037f7a00037f7b00037f7c00037f8d00037fa200037fa300037fa400037fa700037fa900037fb800037fb900037fbb00037fbc00037fbd00037fe500037fed00037f3e01037f3f01037f4001037f4101037f4401037f4501037f4601037f4701037f4801037f4901037f4a01037f4b01037f4c01037f8301037f8401037f8501037f9001037f9201037f9b01037f9c01037f9d01037f9e01037fae01037faf01037fb001037fb101037fbb01037fbc01037fd001037fd701037fd801037fd901037fda01037fdb01037fdc01037fdd01037fde01037fe401037fe501037f0402037f0502037f0602037f0702037f1902037f2702037f2802037f2902037f2a02037f2b02037f2c02037f2d02037f2e02037f2f02037f3002037f");
    public static final int[] i = new int[]{2130903083};
    public static final int[] j = new int[]{16842927, 16842948, 16843046, 16843047, 16843048, 2130903206, 2130903208, 2130903380, 2130903476};
    public static final int[] k = new int[]{16843436, 16843437};
    public static final int[] l = new int[]{0x101000E, 0x10100D0, 16843156, 16843230, 16843231, 0x10101E0};
    public static final int[] m = new int[]{0x1010002, 0x101000E, 0x10100D0, 0x1010106, 16843156, 16843230, 16843231, 0x10101E1, 16843234, 16843235, 16843236, 16843237, 16843375, 2130903056, 2130903076, 2130903077, 2130903085, 2130903173, 2130903272, 2130903273, 2130903413, 2130903475, 2130903560};
    public static final int[] n = new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 0x1010130, 0x1010131, 2130903443, 2130903495};
    public static final int[] o = new int[]{16843126, 16843465, 2130903421};
    public static final int[] p = new int[]{2130903423, 2130903426};
    public static final int[] q = new int[]{16842970, 0x101011F, 0x1010220, 16843364, 2130903150, 2130903165, 2130903197, 2130903266, 2130903274, 2130903289, 2130903449, 2130903450, 2130903468, 2130903469, 2130903496, 2130903501, 2130903583};
    public static final int[] r = new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 0x1010161, 16843106, 16843107, 16843108, 16843692, 16844165, 2130903253, 2130903262, 2130903510, 2130903527};
    public static final int[] s = new int[]{16842927, 0x1010140, 2130903122, 2130903152, 2130903153, 2130903174, 2130903175, 2130903176, 2130903177, 2130903178, 2130903179, 2130903373, 2130903374, 2130903376, 2130903381, 2130903409, 2130903410, 2130903441, 2130903497, 2130903498, 2130903499, 2130903546, 2130903547, 2130903548, 2130903549, 2130903550, 2130903551, 2130903552, 2130903553, 2130903554};
    public static final int[] t = new int[]{16842964, 2130903105, 2130903106};
    public static final int[] u = new int[]{0x10100D0, 16842994, 16842995};
    public static final int[] v = new int[]{0x101011C, 16843156, 16843157, 16843158, 16843532, 16843533};
    public static final int[] w = new int[]{0x10100D0, 0x1010199};
    public static final int[] x = new int[]{0x1010199, 16843849, 16843850, 16843851};

    public static String a(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (string != null && !string.trim().isEmpty()) {
            Matcher matcher = Pattern.compile("([^=;]+)=([^;]*)").matcher(string);
            while (matcher.find()) {
                String string2 = matcher.group(1).trim();
                string = matcher.group(2).trim();
                if (string2.isEmpty()) continue;
                hashMap.put(string2, string);
            }
        }
        return (String)hashMap.get("__pus");
    }

    public static String b(e a2) {
        if (a2 == null) {
            return null;
        }
        if ((a2 = ((e)a2).t("runs")) == null) {
            return null;
        }
        int n2 = ((b)a2).size();
        if (n2 == 1) {
            return ((b)a2).p(0).x("text");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < ((b)a2).size(); ++i2) {
            stringBuilder.append(((b)a2).p(i2).x("text"));
        }
        return stringBuilder.toString();
    }

    public static List c(e a2) {
        if (a2 == null) {
            return null;
        }
        if ((a2 = ((e)a2).t("thumbnails")) == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>(((b)a2).size());
        for (int i2 = 0; i2 < ((b)a2).size(); ++i2) {
            e e2 = ((b)a2).p(i2);
            if (!e2.containsKey("url")) continue;
            arrayList.add(e2.x("url"));
        }
        return arrayList;
    }

    public static String d(Map object, String object2) {
        int n2;
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        if (object2 != null && !((String)object2).trim().isEmpty()) {
            String[] object32 = ((String)object2).split(";");
            int n3 = object32.length;
            for (n2 = 0; n2 < n3; ++n2) {
                int n4;
                object2 = object32[n2].trim();
                if (((String)object2).isEmpty() || (n4 = ((String)object2).indexOf(61)) <= 0) continue;
                String string = ((String)object2).substring(0, n4);
                object2 = n4 < ((String)object2).length() - 1 ? ((String)object2).substring(n4 + 1) : "";
                linkedHashMap.put(string, object2);
            }
        }
        if (object.containsKey("Set-Cookie") || object.containsKey("set-cookie")) {
            List list = (List)object.get("Set-Cookie");
            object2 = list;
            if (list == null) {
                object2 = (List)object.get("set-cookie");
            }
            if (object2 != null) {
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    object = ((String)iterator.next()).split(";")[0].trim();
                    if (((String)object).isEmpty() || (n2 = ((String)object).indexOf(61)) <= 0) continue;
                    object2 = ((String)object).substring(0, n2);
                    object = n2 < ((String)object).length() - 1 ? ((String)object).substring(n2 + 1) : "";
                    linkedHashMap.put(object2, object);
                }
            }
        }
        object = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((StringBuilder)object).length() > 0) {
                ((StringBuilder)object).append("; ");
            }
            ((StringBuilder)object).append((String)entry.getKey());
            ((StringBuilder)object).append("=");
            ((StringBuilder)object).append((String)entry.getValue());
        }
        return ((StringBuilder)object).toString();
    }

    private static long[] $d2j$hex$2e636dbe$decode_J(String src) {
        byte[] d2 = com.github.catvod.spider.merge.g.a.$d2j$hex$2e636dbe$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$2e636dbe$decode_I(String src) {
        byte[] d2 = com.github.catvod.spider.merge.g.a.$d2j$hex$2e636dbe$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$2e636dbe$decode_S(String src) {
        byte[] d2 = com.github.catvod.spider.merge.g.a.$d2j$hex$2e636dbe$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$2e636dbe$decode_B(String src) {
        char[] d2 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i2 = 0; i2 < ret.length; ++i2) {
            int ll;
            int hh;
            char h2 = d2[2 * i2];
            char l2 = d2[2 * i2 + 1];
            if (h2 >= '0' && h2 <= '9') {
                hh = h2 - 48;
            } else if (h2 >= 'a' && h2 <= 'f') {
                hh = h2 - 97 + 10;
            } else if (h2 >= 'A' && h2 <= 'F') {
                hh = h2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l2 >= '0' && l2 <= '9') {
                ll = l2 - 48;
            } else if (l2 >= 'a' && l2 <= 'f') {
                ll = l2 - 97 + 10;
            } else if (l2 >= 'A' && l2 <= 'F') {
                ll = l2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i2] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

