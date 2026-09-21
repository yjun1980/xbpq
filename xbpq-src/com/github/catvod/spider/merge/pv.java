/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.parser.a;
import com.github.catvod.parser.f;
import com.github.catvod.parser.g;
import com.github.catvod.spider.c;
import com.github.catvod.spider.e;
import com.github.catvod.spider.merge.MN;
import com.github.catvod.spider.merge.ZP;
import com.github.catvod.spider.merge.d;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class pv {
    private static final char[] l8;
    private static final short[] short;

    static {
        short = pv.$d2j$hex$1a6e8dd5$decode_S("f107f007f307f207f507f407f707f607f907f807800783078207850784078707cb03cf03d9037a0a7e0a680a140a780a790a780a140a6b0a700a780a680a0e0a6b0a5a0a5f0a5f0a520a550a5c0af306f206e0068b069e06dc07c307ea9233595058ee9fba61a407a307c25c1785bd07a407a707ad07d848bc0799f8c658d855af07b507ab57c8981299cb52a8531694426a5e0c5f0c3a57ef8e450c5f0c580c5b0c2043440c61f33e53205e570c4d0cad03ac03be03d503c003780b7c0b6a0b2b022f023902450229023e02380245023a022102290239025f023a020b020e020e02030204020d0240064406520679037d036b03680b6c0b7a0b060b6a0b6b0b6a0b060b790b620b6a0b7a0b1e0b790b480b4d0b4d0b400b470b4e0be907e807fa0791078407ba09bb09a909c209d70968046c047a04c40bc00bd60baa0bc00bc60bc70baa0bd50bce0bc60bd60bb00bd50be40be10be10bec0beb0be20b8e52ed9d379cee578d563391724768097b097a0968091f52ca8b800281029302d802cd022c0128013e01d701d301c501b901d301d501d401b901c601dd01d501c501a301c601f701f201f201ff01f801f101b70bb30ba50b500c540c420c3e0c520c530c520c3e0c410c5a0c520c420c260c410c700c750c750c780c7f0c760cc001c101d301b801ad01a00aa40ab20a3104350423045f043304320433045f0420043b04330423044704200411041404140419041e041704cc06cd06df06b406a10623043b0433043d0438043b04640464046404b603b703a503ee03fb0305042b043704744a347e20043b0422042204e807c607da07dc920559ae498c6192079507ee48240b200b360bb201b601a001dc01b601b001b101dc01a301b801b001a001c601a3019201970197019a019d019401dd06dc06ce06a506b006800684069206fc02f802ee029202fe02ff02fe029202ed02f602fe02ee028802ed02fc02f902f902f402f302fa0228092c093a092d0529053f0543052f052e052f0543053c0527052f053f0559053c050d0508050805050502050b05e70be60bf40b9f0b8a0b");
        l8 = "0123456789ABCDEF".toCharArray();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String A(String object, String object2, String object3) {
        byte[] byArray = MN.l8((String)object);
        object = MN.l8((String)object2);
        object2 = MN.l8((String)object3);
        int n2 = byArray.length;
        int n3 = 1616;
        block12: while (true) {
            switch (n3 ^= 0x661) {
                default: {
                    continue block12;
                }
                case 49: {
                    if (n2 == 32) {
                        n3 = 1709;
                        continue block12;
                    }
                }
                case 14: {
                    n3 = 1678;
                    continue block12;
                }
                case 204: {
                    n2 = ((Object)object).length;
                    n3 = 1740;
                    block13: while (true) {
                        switch (n3 ^= 0x6DD) {
                            default: {
                                continue block13;
                            }
                            case 17: {
                                if (n2 == 16) {
                                    n3 = 1833;
                                    continue block13;
                                }
                            }
                            case 54: {
                                n3 = 1802;
                                continue block13;
                            }
                            case 500: {
                                object3 = new SecretKeySpec(byArray, "AES");
                                IvParameterSpec ivParameterSpec = new IvParameterSpec((byte[])object);
                                object = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                ((Cipher)object).init(2, (Key)object3, ivParameterSpec);
                                return new String(((Cipher)object).doFinal((byte[])object2), "UTF-8");
                            }
                            case 471: 
                        }
                        break;
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("IV\u957f\u5ea6\u5fc5\u987b\u662f16\u5b57\u8282(128\u4f4d)\uff0c\u5f53\u524d: ");
                    ((StringBuilder)object2).append(((Object)object).length);
                    throw new IllegalArgumentException(((StringBuilder)object2).toString());
                }
                case 239: 
            }
            break;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("\u5bc6\u94a5\u957f\u5ea6\u5fc5\u987b\u662f32\u5b57\u8282(256\u4f4d)\uff0c\u5f53\u524d: ");
        ((StringBuilder)object).append(byArray.length);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String HM(String object, String string, String object2, String string2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(((String)object2).getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            object2 = new IvParameterSpec(string2.getBytes());
            cipher.init(2, (Key)secretKeySpec, (AlgorithmParameterSpec)object2);
            object2 = new String(cipher.doFinal(MN.l8((String)object)), string);
            return object2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Key Kf(byte[] byArray) {
        return new SecretKeySpec(byArray, "AES");
    }

    public static String N(String string, String string2, String object) {
        String string3 = "\u06e3\u06e3\u06e3";
        SecretKeySpec secretKeySpec = null;
        IvParameterSpec ivParameterSpec = null;
        Key key = null;
        byte[] byArray = null;
        Cipher cipher = null;
        Object var11_9 = null;
        short[] sArray = null;
        String string4 = object;
        String string5 = string2;
        string2 = string3;
        object = var11_9;
        block19: while (true) {
            switch (v.d(string2)) {
                default: {
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    string2 = "\u06e6\u06e4";
                    continue block19;
                }
                case 1750570: {
                    string5 = com.github.catvod.spider.merge.e.e(sArray, 122, 20, 2857);
                    string2 = "\u06e5\u06e2\u06e5";
                    continue block19;
                }
                case 1752552: {
                    cipher = Cipher.getInstance(string5);
                    string2 = "\u06e6\u06e8\u06e3";
                    continue block19;
                }
                case 1754601: {
                    secretKeySpec = new SecretKeySpec((byte[])object, string5);
                    string2 = "\u06e6\u06e5";
                    continue block19;
                }
                case 1750659: {
                    object = string5.getBytes();
                    string2 = "\u06e0\u06e0\u06e4";
                    continue block19;
                }
                case 1750531: {
                    sArray = short;
                    string2 = "\u06df\u06df\u06e6";
                    continue block19;
                }
                case 1748611: {
                    string4 = new String(byArray, string5);
                    string2 = "\u06e2\u06e1";
                    continue block19;
                }
                case 56538: {
                    byArray = cipher.doFinal((byte[])object);
                    string2 = "\u06e3\u06df\u06df";
                    continue block19;
                }
                case 1753697: {
                    object = string4.getBytes();
                    string2 = "\u06e0\u06e2\u06e7";
                    continue block19;
                }
                case 1746694: {
                    string5 = a.c(sArray, 142, 5, 1980);
                    string2 = "\u06e1\u06df\u06e1";
                    continue block19;
                }
                case 1753639: {
                    sArray = short;
                    string2 = "\u06e3\u06e1";
                    continue block19;
                }
                case 1747684: {
                    key = pv.Kf((byte[])object);
                    string2 = "\u06df\u06e2\u06e7";
                    continue block19;
                }
                case 1746788: {
                    object = key.getEncoded();
                    string2 = "\u06e6\u06e6\u06e7";
                    continue block19;
                }
                case 56414: {
                    string5 = v.b(sArray, 119, 3, 824);
                    string2 = "\u06e7\u06e6\u06e8";
                    continue block19;
                }
                case 56510: {
                    object = MN.l8(string);
                    string2 = "\u06e7\u06e1";
                    continue block19;
                }
                case 56511: {
                    sArray = short;
                    string2 = "\u06e3\u06e0\u06e7";
                    continue block19;
                }
                case 1747749: {
                    ivParameterSpec = new IvParameterSpec((byte[])object);
                    string2 = "\u06e0\u06e7\u06e4";
                    continue block19;
                }
                case 56383: 
            }
            break;
        }
        return string4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static byte[] OL(byte[] byArray, byte[] byArray2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int[] nArray = new int[256];
        int n6 = 0;
        block30: while (true) {
            n5 = 1616;
            block31: while (true) {
                switch (n5 ^= 0x661) {
                    default: {
                        continue block31;
                    }
                    case 49: {
                        if (n6 < 256) {
                            n5 = 1709;
                            continue block31;
                        }
                    }
                    case 14: {
                        n5 = 1678;
                        continue block31;
                    }
                    case 204: {
                        nArray[n6] = n6;
                        n4 = n6 + 1;
                        n5 = 1740;
                        block32: while (true) {
                            n6 = n4;
                            switch (n5 ^= 0x6DD) {
                                case 54: {
                                    continue block30;
                                }
                                default: {
                                    continue block32;
                                }
                                case 17: 
                            }
                            n5 = 1771;
                        }
                    }
                    case 239: 
                }
                break;
            }
            break;
        }
        int n7 = byArray2.length;
        n4 = 0;
        n6 = 0;
        block33: while (true) {
            n5 = 1864;
            block34: while (true) {
                switch (n5 ^= 0x759) {
                    default: {
                        continue block34;
                    }
                    case 17: {
                        if (n6 < 256) {
                            n5 = 48736;
                            continue block34;
                        }
                    }
                    case 47483: {
                        n5 = 48705;
                        continue block34;
                    }
                    case 47417: {
                        n3 = (n4 + nArray[n6] + byArray2[n6 % n7] + n6 % 128) % 256;
                        n5 = nArray[n6];
                        nArray[n6] = nArray[n3];
                        nArray[n3] = n5;
                        n2 = n6 + 1;
                        n5 = 48767;
                        block35: while (true) {
                            n4 = n3;
                            n6 = n2;
                            switch (n5 ^= 0xBE90) {
                                case 14: {
                                    continue block33;
                                }
                                default: {
                                    continue block35;
                                }
                                case 239: 
                            }
                            n5 = 48798;
                        }
                    }
                    case 47384: 
                }
                break;
            }
            break;
        }
        byArray2 = new byte[byArray.length];
        n3 = 0;
        n4 = 0;
        n6 = 0;
        block36: while (true) {
            n2 = byArray.length;
            n5 = 48891;
            block37: while (true) {
                switch (n5 ^= 0xBF0C) {
                    default: {
                        continue block37;
                    }
                    case 503: {
                        if (n6 < n2) {
                            n5 = 49635;
                            continue block37;
                        }
                    }
                    case 22: {
                        n5 = 48953;
                        continue block37;
                    }
                    case 32495: {
                        n3 = (n3 + 1) % 256;
                        n4 = (nArray[n3] + n4 + n6 % 64) % 256;
                        n5 = nArray[n3];
                        nArray[n3] = nArray[n4];
                        nArray[n4] = n5;
                        byArray2[n6] = (byte)(nArray[(nArray[n3] + nArray[n4] + nArray[(n3 + n4) % 256]) % 256] ^ byArray[n6]);
                        ++n6;
                        n5 = 49666;
                        block38: while (true) {
                            switch (n5 ^= 0xC213) {
                                default: {
                                    continue block38;
                                }
                                case 17: {
                                    n5 = 49697;
                                    continue block38;
                                }
                                case 50: 
                            }
                            break;
                        }
                        continue block36;
                    }
                    case 53: 
                }
                break;
            }
            break;
        }
        return byArray2;
    }

    /*
     * Unable to fully structure code
     */
    public static String S(String var0, String var1_2) {
        var2_3 = 1616;
        block16: while (true) {
            switch (var2_3 ^= 1633) {
                default: {
                    continue block16;
                }
lbl6:
                // 2 sources

                case 14: {
                    var2_3 = 1678;
                    continue block16;
                }
                case 49: {
                    if (var1_2 == null) ** GOTO lbl6
                    var2_3 = 1709;
                    continue block16;
                }
                case 204: {
                    var3_4 = var1_2.length();
                    var2_3 = 1740;
                    block18: while (true) {
                        switch (var2_3 ^= 1757) {
                            default: {
                                continue block18;
                            }
                            case 17: {
                                if (var3_4 == 32) {
                                    var2_3 = 1833;
                                    continue block18;
                                }
                            }
                            case 54: {
                                var2_3 = 1802;
                                continue block18;
                            }
                            case 500: {
                                var4_5 = new SecretKeySpec(var1_2.getBytes("UTF-8"), "AES");
                                var1_2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
                                var1_2.init(2, var4_5);
                                var0 = new String(var1_2.doFinal(MN.l8((String)var0)), "UTF-8");
lbl34:
                                // 2 sources

                                return var0;
                            }
                            case 471: 
                        }
                        break;
                    }
                }
                case 239: 
            }
            break;
        }
        try {
            var0 = new IllegalArgumentException("\u5bc6\u94a5\u957f\u5ea6\u5fc5\u987b\u4e3a 32 \u5b57\u8282");
            throw var0;
        }
        catch (Exception var0_1) {
            var0_1.printStackTrace();
            var0 = null;
            ** continue;
        }
    }

    public static String T4(String string, String string2) {
        String string3 = "\u06df\u06e7\u06e7";
        String string4 = null;
        byte[] byArray = null;
        SecretKeySpec secretKeySpec = null;
        Cipher cipher = null;
        byte[] byArray2 = null;
        short[] sArray = null;
        String string5 = string2;
        string2 = string3;
        block15: while (true) {
            switch (v.d(string2)) {
                default: {
                    byArray = cipher.doFinal(byArray2);
                    string2 = "\u06e8\u06e3\u06e4";
                    continue block15;
                }
                case 1746750: {
                    byArray2 = string5.getBytes(string4);
                    string2 = "\u06e8\u06e0\u06df";
                    continue block15;
                }
                case 1746943: {
                    sArray = short;
                    string2 = "\u06e7\u06e0\u06e7";
                    continue block15;
                }
                case 1750780: {
                    string5 = com.github.catvod.parser.c.e(sArray, 196, 20, 406);
                    string2 = "\u06e6\u06e1\u06e6";
                    continue block15;
                }
                case 1753483: {
                    cipher = Cipher.getInstance(string5);
                    string2 = "\u06e6\u06e7\u06e7";
                    continue block15;
                }
                case 1750633: {
                    byArray2 = string.getBytes(string4);
                    string2 = "\u06df\u06e3\u06df";
                    continue block15;
                }
                case 1755465: {
                    string5 = MN.S(byArray);
                    string2 = "\u06df\u06df\u06df";
                    continue block15;
                }
                case 1754414: {
                    string4 = h.e(sArray, 188, 5, 757);
                    string2 = "\u06df\u06e1\u06e0";
                    continue block15;
                }
                case 1747683: {
                    sArray = short;
                    string2 = "\u06e3\u06e7\u06e0";
                    continue block15;
                }
                case 56444: {
                    string5 = e.d(sArray, 193, 3, 365);
                    string2 = "\u06e6\u06e8\u06e7";
                    continue block15;
                }
                case 1753670: {
                    cipher.init(1, secretKeySpec);
                    string2 = "\u06e3\u06e2\u06e8";
                    continue block15;
                }
                case 1755367: {
                    sArray = short;
                    string2 = "\u06e4\u06e0";
                    continue block15;
                }
                case 1753701: {
                    secretKeySpec = new SecretKeySpec(byArray2, string5);
                    string2 = "\u06e0\u06e0\u06e3";
                    continue block15;
                }
                case 1746687: 
            }
            break;
        }
        return string5;
    }

    /*
     * Unable to fully structure code
     */
    private static String b(String var0) {
        var5_1 = new StringBuilder();
        var3_2 = 0;
        block26: while (true) {
            var4_5 = var0.length();
            var2_4 = 1616;
            block27: while (true) {
                switch (var2_4 ^= 1633) {
                    default: {
                        continue block27;
                    }
lbl10:
                    // 2 sources

                    case 14: {
                        var2_4 = 1678;
                        continue block27;
                    }
                    case 49: {
                        if (var3_2 >= var4_5) ** GOTO lbl10
                        var2_4 = 1709;
                        continue block27;
                    }
                    case 204: {
                        var1_3 = var0.charAt(var3_2);
                        var2_4 = 1740;
                        block29: while (true) {
                            switch (var2_4 ^= 1757) {
                                default: {
                                    continue block29;
                                }
                                case 17: {
                                    if (var1_3 >= 'g') {
                                        var2_4 = 1833;
                                        continue block29;
                                    }
                                }
                                case 54: {
                                    var2_4 = 1802;
                                    continue block29;
                                }
                                case 500: {
                                    var2_4 = 1864;
                                    block30: while (true) {
                                        switch (var2_4 ^= 1881) {
                                            default: {
                                                continue block30;
                                            }
                                            case 17: {
                                                if (var1_3 <= 'l') {
                                                    var2_4 = 48736;
                                                    continue block30;
                                                }
                                            }
                                            case 47483: {
                                                var2_4 = 48705;
                                                continue block30;
                                            }
                                            case 47417: {
                                                var5_1.append((char)(var1_3 - 6));
                                                var2_4 = 48767;
                                                block31: while (true) {
                                                    switch (var2_4 ^= 48784) {
                                                        default: {
                                                            continue block31;
                                                        }
                                                        case 14: lbl-1000:
                                                        // 2 sources

                                                        {
                                                            while (true) {
                                                                var4_5 = var3_2 + 1;
                                                                var2_4 = 48891;
                                                                block33: while (true) {
                                                                    var3_2 = var4_5;
                                                                    switch (var2_4 ^= 48908) {
                                                                        case 22: {
                                                                            continue block26;
                                                                        }
                                                                        default: {
                                                                            continue block33;
                                                                        }
                                                                        case 503: 
                                                                    }
                                                                    var2_4 = 48922;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        case 239: 
                                                    }
                                                    var2_4 = 48798;
                                                }
                                            }
                                            case 47384: 
                                        }
                                        break;
                                    }
                                }
                                case 471: 
                            }
                            break;
                        }
                        var5_1.append(var1_3);
                        ** continue;
                    }
                    case 239: 
                }
                break;
            }
            break;
        }
        return var5_1.toString();
    }

    public static String cD(String string, String object, String string2) {
        String string3 = "\u06e8\u06df\u06e7";
        SecretKeySpec secretKeySpec = null;
        Key key = null;
        Cipher cipher = null;
        byte[] byArray = null;
        IvParameterSpec ivParameterSpec = null;
        short[] sArray = null;
        Object var11_10 = null;
        String string4 = string2;
        string2 = object;
        String string5 = string;
        string = string3;
        object = var11_10;
        block20: while (true) {
            switch (v.d(string)) {
                default: {
                    sArray = short;
                    string = "\u06e4\u06e7\u06df";
                    continue block20;
                }
                case 1747803: {
                    sArray = short;
                    string = "\u06df\u06e8\u06e1";
                    continue block20;
                }
                case 0x1AA818: {
                    string2 = e.d(sArray, 219, 20, 3089);
                    string = "\u06e1\u06e5\u06e4";
                    continue block20;
                }
                case 1751740: {
                    string2 = f.c(sArray, 216, 3, 3062);
                    string = "\u06e5\u06e5\u06e4";
                    continue block20;
                }
                case 1748733: {
                    ivParameterSpec = new IvParameterSpec((byte[])object);
                    string = "\u06e2\u06e1\u06e2";
                    continue block20;
                }
                case 1755344: {
                    object = string2.getBytes();
                    string = "\u06e8\u06e7\u06e0";
                    continue block20;
                }
                case 1755560: {
                    byArray = cipher.doFinal((byte[])object);
                    string = "\u06e0\u06e2\u06e4";
                    continue block20;
                }
                case 1747657: {
                    object = string4.getBytes();
                    string = "\u06e1\u06e3\u06df";
                    continue block20;
                }
                case 1747746: {
                    string4 = MN.S(byArray);
                    string = "\u06e0\u06e0\u06e3";
                    continue block20;
                }
                case 1749635: {
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    string = "\u06e3\u06e4\u06e7";
                    continue block20;
                }
                case 1751523: {
                    object = string5.getBytes(string2);
                    string = "\u06e8\u06e6\u06e6";
                    continue block20;
                }
                case 1747683: {
                    string5 = string4.toString();
                    string = "\u06e2\u06df\u06e5";
                    continue block20;
                }
                case 1748800: {
                    cipher = Cipher.getInstance(string2);
                    string = "\u06e0\u06df\u06e8";
                    continue block20;
                }
                case 1755585: {
                    key = pv.Kf((byte[])object);
                    string = "\u06e8\u06e3\u06df";
                    continue block20;
                }
                case 0x1AA7A1: {
                    string2 = d.e(sArray, 239, 5, 405);
                    string = "\u06e4\u06e0\u06df";
                    continue block20;
                }
                case 1750694: {
                    sArray = short;
                    string = "\u06df\u06e4\u06e6";
                    continue block20;
                }
                case 1755460: {
                    object = key.getEncoded();
                    string = "\u06e0\u06e8\u06e2";
                    continue block20;
                }
                case 1752644: {
                    secretKeySpec = new SecretKeySpec((byte[])object, string2);
                    string = "\u06e0\u06e4\u06df";
                    continue block20;
                }
                case 1749576: 
            }
            break;
        }
        return string5;
    }

    public static String hR(String string, String object, String string2) {
        String string3 = "\u06e1\u06e1";
        byte[] byArray = null;
        Key key = null;
        Cipher cipher = null;
        SecretKeySpec secretKeySpec = null;
        IvParameterSpec ivParameterSpec = null;
        short[] sArray = null;
        Object var11_10 = null;
        String string4 = string2;
        string2 = object;
        String string5 = string;
        string = string3;
        object = var11_10;
        block20: while (true) {
            switch (v.d(string)) {
                default: {
                    object = string2.getBytes();
                    string = "\u06df\u06e2\u06e1";
                    continue block20;
                }
                case 56289: {
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    string = "\u06e5\u06e3\u06e6";
                    continue block20;
                }
                case 1746782: {
                    key = pv.Kf((byte[])object);
                    string = "\u06e3\u06e4\u06e2";
                    continue block20;
                }
                case 1746941: {
                    sArray = short;
                    string = "\u06e5\u06e6\u06e7";
                    continue block20;
                }
                case 1753418: {
                    object = pv.s(string4);
                    string = "\u06e7\u06e4\u06e1";
                    continue block20;
                }
                case 1750602: {
                    byArray = cipher.doFinal((byte[])object);
                    string = "\u06e2\u06e1\u06e6";
                    continue block20;
                }
                case 1749579: {
                    sArray = short;
                    string = "\u06e7\u06df\u06e5";
                    continue block20;
                }
                case 1752584: {
                    sArray = short;
                    string = "\u06e0\u06e3\u06e4";
                    continue block20;
                }
                case 0x1AC1AC: {
                    object = string5.getBytes(string2);
                    string = "\u06e3\u06e1\u06e8";
                    continue block20;
                }
                case 1754381: {
                    string2 = g.c(sArray, 244, 3, 2785);
                    string = "\u06e5\u06e6\u06e5";
                    continue block20;
                }
                case 1750689: {
                    object = key.getEncoded();
                    string = "\u06e2\u06df\u06e8";
                    continue block20;
                }
                case 1747777: {
                    string2 = com.github.catvod.parser.d.b(sArray, 267, 5, 1689);
                    string = "\u06e6\u06e2\u06e8";
                    continue block20;
                }
                case 1752678: {
                    string2 = f.c(sArray, 247, 20, 1136);
                    string = "\u06e4\u06e2\u06e5";
                    continue block20;
                }
                case 1751591: {
                    cipher = Cipher.getInstance(string2);
                    string = "\u06e6\u06df\u06e3";
                    continue block20;
                }
                case 1749639: {
                    string4 = MN.S(byArray);
                    string = "\u06e6\u06e4\u06e5";
                    continue block20;
                }
                case 1753575: {
                    string5 = string4.toString();
                    string = "\u06e2\u06e5\u06e1";
                    continue block20;
                }
                case 1752676: {
                    secretKeySpec = new SecretKeySpec((byte[])object, string2);
                    string = "\u06df\u06e7\u06e5";
                    continue block20;
                }
                case 1754532: {
                    ivParameterSpec = new IvParameterSpec((byte[])object);
                    string = "\u06df\u06e0";
                    continue block20;
                }
                case 1749758: 
            }
            break;
        }
        return string5;
    }

    public static String l(String string) {
        String string2 = "\u06e4\u06e3\u06e5";
        short[] sArray = null;
        byte[] byArray = null;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        String string3 = null;
        Charset charset = null;
        String string4 = string;
        string = string2;
        block11: while (true) {
            switch (v.d(string)) {
                default: {
                    return string3;
                }
                case 1752524: {
                    byArray2 = pv.tT(string3);
                    string = "\u06e6\u06e8\u06df";
                    continue block11;
                }
                case 1753693: {
                    charset = ZP.S;
                    string = "\u06e4\u06e7\u06e8";
                    continue block11;
                }
                case 56296: {
                    byArray = string4.getBytes(charset);
                    string = "\u06e1\u06df\u06df";
                    continue block11;
                }
                case 1748609: {
                    byArray3 = pv.OL(byArray2, byArray);
                    string = "\u06e5\u06e0\u06df";
                    continue block11;
                }
                case 1751622: {
                    string3 = pv.b(string4);
                    string = "\u06e5\u06e1\u06e8";
                    continue block11;
                }
                case 1755462: {
                    string4 = c.e(sArray, 272, 9, 1106);
                    string = "\u06df\u06e7";
                    continue block11;
                }
                case 1752484: {
                    charset = ZP.S;
                    string = "\u06e0\u06e2\u06e7";
                    continue block11;
                }
                case 1751749: {
                    sArray = short;
                    string = "\u06e8\u06e3\u06e1";
                    continue block11;
                }
                case 1747749: 
            }
            string3 = new String(byArray3, charset);
            string = "\u06e7\u06e7\u06e8";
        }
    }

    /*
     * Exception decompiling
     */
    public static String l8(String var0, String var1_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 203->243)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String n(String string, String string2, String object) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(((String)object).getBytes("UTF-8"));
            object = new SecretKeySpec(string2.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, (Key)object, ivParameterSpec);
            string2 = new String(cipher.doFinal(MN.l8(string)), "UTF-8");
            return string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static byte[] s(String object) {
        int n2 = ((String)object).length();
        int n3 = 1616;
        block16: while (true) {
            switch (n3 ^= 0x661) {
                default: {
                    continue block16;
                }
                case 49: {
                    if (n2 < 1) {
                        n3 = 1709;
                        continue block16;
                    }
                }
                case 14: {
                    n3 = 1678;
                    continue block16;
                }
                case 204: {
                    return null;
                }
                case 239: 
            }
            break;
        }
        byte[] byArray = new byte[((String)object).length() / 2];
        n2 = 0;
        block17: while (true) {
            int n4 = ((String)object).length() / 2;
            n3 = 1740;
            block18: while (true) {
                switch (n3 ^= 0x6DD) {
                    default: {
                        continue block18;
                    }
                    case 17: {
                        if (n2 < n4) {
                            n3 = 1833;
                            continue block18;
                        }
                    }
                    case 54: {
                        n3 = 1802;
                        continue block18;
                    }
                    case 500: {
                        int n5 = n2 * 2;
                        n4 = n5 + 1;
                        n3 = Integer.parseInt(((String)object).substring(n5, n4), 16);
                        byArray[n2] = (byte)(Integer.parseInt(((String)object).substring(n4, n5 + 2), 16) + n3 * 16);
                        n4 = n2 + 1;
                        n3 = 1864;
                        block19: while (true) {
                            n2 = n4;
                            switch (n3 ^= 0x759) {
                                case 47483: {
                                    continue block17;
                                }
                                default: {
                                    continue block19;
                                }
                                case 17: 
                            }
                            n3 = 48674;
                        }
                    }
                    case 471: 
                }
                break;
            }
            break;
        }
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static byte[] tT(String string) {
        int n2 = string.length();
        byte[] byArray = new byte[n2 / 2];
        int n3 = 0;
        block10: while (true) {
            int n4 = 1616;
            block11: while (true) {
                switch (n4 ^= 0x661) {
                    default: {
                        continue block11;
                    }
                    case 49: {
                        if (n3 < n2) {
                            n4 = 1709;
                            continue block11;
                        }
                    }
                    case 14: {
                        n4 = 1678;
                        continue block11;
                    }
                    case 204: {
                        byArray[n3 / 2] = (byte)((Character.digit(string.charAt(n3), 16) << 4) + Character.digit(string.charAt(n3 + 1), 16));
                        int n5 = n3 + 2;
                        n4 = 1740;
                        block12: while (true) {
                            n3 = n5;
                            switch (n4 ^= 0x6DD) {
                                case 54: {
                                    continue block10;
                                }
                                default: {
                                    continue block12;
                                }
                                case 17: 
                            }
                            n4 = 1771;
                        }
                    }
                    case 239: 
                }
                break;
            }
            break;
        }
        return byArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String v(String object, String object2, String string) {
        try {
            byte[] byArray = MN.l8((String)object);
            object = new SecretKeySpec(((String)object2).getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(string.getBytes());
            object2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            ((Cipher)object2).init(2, (Key)object, ivParameterSpec);
            return new String(((Cipher)object2).doFinal(byArray), "UTF-8");
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static long[] $d2j$hex$1a6e8dd5$decode_J(String src) {
        byte[] d2 = pv.$d2j$hex$1a6e8dd5$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$1a6e8dd5$decode_I(String src) {
        byte[] d2 = pv.$d2j$hex$1a6e8dd5$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$1a6e8dd5$decode_S(String src) {
        byte[] d2 = pv.$d2j$hex$1a6e8dd5$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$1a6e8dd5$decode_B(String src) {
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

