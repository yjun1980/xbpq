/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c9;
import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08ad;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08b1;
import com.github.catvod.spider.merge.\u08b3;
import com.github.catvod.spider.merge.\u08b6;
import com.github.catvod.spider.merge.\u08b7;
import com.github.catvod.spider.merge.\u08b8;
import com.github.catvod.spider.merge.\u08b9;
import com.github.catvod.spider.merge.\u08ba;
import com.github.catvod.spider.merge.\u08bb;
import com.github.catvod.spider.merge.\u08bd;
import com.github.catvod.spider.merge.\u0cf1;
import com.github.catvod.spider.merge.\u0d29;
import com.github.catvod.spider.merge.\u0d3a;
import com.github.catvod.spider.merge.\u0d4e;
import com.github.catvod.spider.merge.\u0d55;
import com.github.catvod.spider.merge.\u0d56;
import com.github.catvod.spider.merge.\u0d5f;
import com.github.catvod.spider.merge.\u0ede;
import com.github.catvod.spider.merge.\u0edf;
import com.github.catvod.spider.merge.\u0f88;
import com.github.catvod.spider.merge.\u0f89;
import com.github.catvod.spider.merge.\u0f8c;
import com.github.catvod.spider.merge.\u105a;
import com.github.catvod.spider.merge.\u105b;
import com.github.catvod.spider.merge.\u105c;
import com.github.catvod.spider.merge.\u105d;
import com.github.catvod.spider.merge.\u106e;
import com.github.catvod.spider.merge.\u106f;
import com.github.catvod.spider.merge.\u1070;
import com.github.catvod.spider.merge.\u1075;
import com.github.catvod.spider.merge.\u1077;
import com.github.catvod.spider.merge.\u1079;
import com.github.catvod.spider.merge.\u107a;
import com.github.catvod.spider.merge.\u107b;
import com.github.catvod.spider.merge.\u107c;
import com.github.catvod.spider.merge.\u107d;
import com.github.catvod.spider.merge.\u107e;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class \u08ae {
    public static final int \u037f = 3;
    private static final UUID \u0528;
    private static final UUID \u0529;
    private static final UUID \u052a;
    private static final UUID \u052b;
    private static final List<UUID> \u052c;
    public static final UUID \u052d;
    private final \u08ad \u052e;

    static {
        UUID uUID;
        UUID uUID2;
        UUID uUID3;
        UUID uUID4;
        \u0528 = uUID4 = UUID.fromString(SOY.d("49616640453548167C414C35387F65374044576A1346365A4E1464343132421310353244"));
        \u0529 = uUID3 = UUID.fromString(SOY.d("4B16104637424D167C4037474C7F65454C36576B1344435A4B6213353644391761304246"));
        \u052a = uUID2 = UUID.fromString(SOY.d("3B1315344C334D177C3731323C7F6542454257131544365A426061423041391461424632"));
        \u052b = uUID = UUID.fromString(SOY.d("4F6B6744434042667C4536324F7F6547433657106833365A426362473540486A67464C4E"));
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        \u052c = arrayList;
        arrayList.add(uUID4);
        arrayList.add(uUID3);
        arrayList.add(uUID2);
        arrayList.add(uUID);
        \u052d = uUID;
    }

    public \u08ae() {
        this(\u08ad.\u037f());
    }

    public \u08ae(\u08ad \u08ad2) {
        \u08ad \u08ad3 = \u08ad2;
        if (\u08ad2 == null) {
            \u08ad3 = \u08ad.\u037f();
        }
        this.\u052e = \u08ad3;
    }

    private int \u052a(char[] cArray, int n2, List<\u0674> list, \u052c \u052d) {
        int n3 = n2 + 1;
        int n4 = \u08ae.\u0620(cArray[n2]);
        n2 = n3;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = \u08ae.\u0620(cArray[n2]);
            n3 = n2 + 1;
            \u0674 \u06742 = new \u0674(new int[0]);
            list.add(\u06742);
            n2 = \u08ae.\u0620(cArray[n3]) != 0 ? 1 : 0;
            if (n2 != 0) {
                \u06742.\u0529(-1);
            }
            n2 = n3 + 1;
            for (n3 = 0; n3 < n5; ++n3) {
                int n6 = \u052d.\u037f(cArray, n2);
                int n7 = \u052d.\u037f(cArray, n2 += \u052d.size());
                n2 += \u052d.size();
                \u06742.\u052a(n6, n7);
            }
        }
        return n2;
    }

    static \u052c \u052c(\u052e \u052f) {
        if (\u052f == com.github.catvod.spider.merge.\u08ae$\u052e.\u037f) {
            return new \u052c(){

                @Override
                public int size() {
                    return 1;
                }

                @Override
                public int \u037f(char[] cArray, int n2) {
                    return \u08ae.\u0620(cArray[n2]);
                }
            };
        }
        return new \u052c(){

            @Override
            public int size() {
                return 2;
            }

            @Override
            public int \u037f(char[] cArray, int n2) {
                return \u08ae.\u0780(cArray, n2);
            }
        };
    }

    protected static boolean \u052d(UUID uUID, UUID uUID2) {
        List<UUID> list = \u052c;
        int n2 = list.indexOf(uUID);
        boolean bl = false;
        if (n2 < 0) {
            return false;
        }
        if (list.indexOf(uUID2) >= n2) {
            bl = true;
        }
        return bl;
    }

    protected static int \u0620(char c2) {
        return c2;
    }

    protected static int \u0780(char[] cArray, int n2) {
        char c2 = cArray[n2];
        return cArray[n2 + 1] << 16 | c2;
    }

    protected static long \u0781(char[] cArray, int n2) {
        long l2 = \u08ae.\u0780(cArray, n2);
        return (long)\u08ae.\u0780(cArray, n2 + 2) << 32 | l2 & 0xFFFFFFFFL;
    }

    protected static UUID \u0782(char[] cArray, int n2) {
        long l2 = \u08ae.\u0781(cArray, n2);
        return new UUID(\u08ae.\u0781(cArray, n2 + 4), l2);
    }

    protected void \u037f(boolean bl) {
        this.\u0528(bl, null);
    }

    protected void \u0528(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(string);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public \u08aa \u0529(char[] object) {
        int n2;
        char[] cArray = (char[])object.clone();
        for (n2 = 1; n2 < cArray.length; ++n2) {
            cArray[n2] = (char)(cArray[n2] - 2);
        }
        int n3 = \u08ae.\u0620(cArray[0]);
        if (n3 == (n2 = \u037f)) {
            UUID uUID = \u08ae.\u0782(cArray, 1);
            if (\u052c.contains(uUID)) {
                Object object22;
                int n4;
                int n5;
                boolean bl = \u08ae.\u052d(\u0529, uUID);
                boolean bl2 = \u08ae.\u052d(\u052a, uUID);
                \u08aa \u08aa2 = new \u08aa(\u08b1.\u037f()[\u08ae.\u0620(cArray[9])], \u08ae.\u0620(cArray[10]));
                Object object32 = new ArrayList();
                ArrayList<\u02c9<\u08ba, Integer>> arrayList = new ArrayList<\u02c9<\u08ba, Integer>>();
                int n6 = \u08ae.\u0620(cArray[11]);
                n2 = 12;
                for (n3 = 0; n3 < n6; ++n3) {
                    n5 = n2 + 1;
                    int n7 = \u08ae.\u0620(cArray[n2]);
                    if (n7 == 0) {
                        \u08aa2.\u037f(null);
                        n2 = n5;
                        continue;
                    }
                    n4 = n5 + 1;
                    n2 = n5 = \u08ae.\u0620(cArray[n5]);
                    if (n5 == 65535) {
                        n2 = -1;
                    }
                    object22 = this.\u058f(n7, n2);
                    if (n7 == 12) {
                        n2 = \u08ae.\u0620(cArray[n4]);
                        object32.add(new \u02c9<\u0f89, Integer>((\u0f89)object22, n2));
                        n2 = n4 + 1;
                    } else {
                        n2 = n4;
                        if (object22 instanceof \u08ba) {
                            n2 = \u08ae.\u0620(cArray[n4]);
                            arrayList.add(new \u02c9<\u08ba, Integer>((\u08ba)object22, n2));
                            n2 = n4 + 1;
                        }
                    }
                    \u08aa2.\u037f((\u08b0)object22);
                }
                object32 = object32.iterator();
                while (object32.hasNext()) {
                    object22 = (\u02c9)object32.next();
                    ((\u0f89)((\u02c9)object22).\u037f).\u052e = \u08aa2.\u037f.get((Integer)((\u02c9)object22).\u0528);
                }
                for (Object object22 : arrayList) {
                    ((\u08ba)((\u02c9)object22).\u037f).\u058f = (\u08b9)\u08aa2.\u037f.get((Integer)((\u02c9)object22).\u0528);
                }
                n4 = \u08ae.\u0620(cArray[n2]);
                ++n2;
                n3 = 0;
                while (n3 < n4) {
                    n5 = \u08ae.\u0620(cArray[n2]);
                    ((\u08bb)\u08aa2.\u037f.get((int)n5)).\u052f = true;
                    ++n3;
                    ++n2;
                }
                n4 = n2;
                if (bl) {
                    n5 = \u08ae.\u0620(cArray[n2]);
                    ++n2;
                    n3 = 0;
                    while (true) {
                        n4 = n2;
                        if (n3 >= n5) break;
                        n4 = \u08ae.\u0620(cArray[n2]);
                        ((\u106f)\u08aa2.\u037f.get((int)n4)).\u052f = true;
                        ++n3;
                        ++n2;
                    }
                }
                n6 = \u08ae.\u0620(cArray[n4]);
                if (\u08aa2.\u052c == \u08b1.\u037f) {
                    \u08aa2.\u052e = new int[n6];
                }
                \u08aa2.\u0529 = new \u106f[n6];
                n2 = n4 + 1;
                for (n3 = 0; n3 < n6; ++n3) {
                    \u106f \u106f2;
                    n5 = n2 + 1;
                    n2 = \u08ae.\u0620(cArray[n2]);
                    \u08aa2.\u0529[n3] = \u106f2 = (\u106f)\u08aa2.\u037f.get(n2);
                    n2 = n5;
                    if (\u08aa2.\u052c != \u08b1.\u037f) continue;
                    n4 = n5 + 1;
                    n2 = n5 = \u08ae.\u0620(cArray[n5]);
                    if (n5 == 65535) {
                        n2 = -1;
                    }
                    \u08aa2.\u052e[n3] = n2;
                    n2 = n4;
                    if (\u08ae.\u052d(\u052a, uUID)) continue;
                    n2 = n4 + 1;
                    \u08ae.\u0620(cArray[n4]);
                }
                \u08aa2.\u052a = new \u1070[n6];
                for (\u08b0 \u08b02 : \u08aa2.\u037f) {
                    if (!(\u08b02 instanceof \u1070)) continue;
                    object32 = (\u1070)\u08b02;
                    object22 = \u08aa2.\u052a;
                    n3 = \u08b02.\u052a;
                    object22[n3] = object32;
                    \u08aa2.\u0529[n3].\u052e = object32;
                }
                n4 = \u08ae.\u0620(cArray[n2]);
                ++n2;
                n3 = 0;
                while (n3 < n4) {
                    n5 = \u08ae.\u0620(cArray[n2]);
                    \u08aa2.\u058f.add((\u107c)\u08aa2.\u037f.get(n5));
                    ++n3;
                    ++n2;
                }
                ArrayList<\u0674> arrayList2 = new ArrayList<\u0674>();
                n2 = n3 = this.\u052a(cArray, n2, arrayList2, \u08ae.\u052c(com.github.catvod.spider.merge.\u08ae$\u052e.\u037f));
                if (\u08ae.\u052d(\u052b, uUID)) {
                    n2 = this.\u052a(cArray, n3, arrayList2, \u08ae.\u052c(com.github.catvod.spider.merge.\u08ae$\u052e.\u0528));
                }
                n3 = \u08ae.\u0620(cArray[n2]);
                ++n2;
                for (n4 = 0; n4 < n3; ++n4) {
                    n6 = \u08ae.\u0620(cArray[n2]);
                    n5 = \u08ae.\u0620(cArray[n2 + 1]);
                    \u107d \u107d2 = this.\u052b(\u08aa2, \u08ae.\u0620(cArray[n2 + 2]), n6, n5, \u08ae.\u0620(cArray[n2 + 3]), \u08ae.\u0620(cArray[n2 + 4]), \u08ae.\u0620(cArray[n2 + 5]), arrayList2);
                    \u08aa2.\u037f.get(n6).\u0528(\u107d2);
                    n2 += 6;
                }
                for (\u08b0 \u08b03 : \u08aa2.\u037f) {
                    for (n3 = 0; n3 < \u08b03.\u0529(); ++n3) {
                        object22 = \u08b03.\u052e(n3);
                        if (!(object22 instanceof \u1075)) continue;
                        object22 = (\u1075)object22;
                        object32 = \u08aa2.\u0529;
                        n4 = ((\u107d)object22).\u0529.\u052a;
                        if (!object32[n4].\u052f || ((\u1075)object22).\u052b != 0) {
                            n4 = -1;
                        }
                        object32 = new \u08bd(((\u1075)object22).\u052c, n4);
                        \u08aa2.\u052a[((\u107d)object22).\u0529.\u052a].\u0528((\u107d)object32);
                    }
                }
                for (Object object32 : \u08aa2.\u037f) {
                    if (object32 instanceof \u08ba) {
                        object22 = (\u08ba)object32;
                        \u08b9 \u08b92 = ((\u08ba)object22).\u058f;
                        if (\u08b92 == null) throw new IllegalStateException();
                        if (\u08b92.\u052e != null) throw new IllegalStateException();
                        \u08b92.\u052e = object22;
                    }
                    if (object32 instanceof \u105b) {
                        object22 = (\u105b)object32;
                        for (n3 = 0; n3 < ((\u08b0)object22).\u0529(); ++n3) {
                            \u08b0 \u08b04 = ((\u08b0)object22).\u052e((int)n3).\u0529;
                            if (!(\u08b04 instanceof \u105a)) continue;
                            ((\u105a)\u08b04).\u0620 = object22;
                        }
                        continue;
                    }
                    if (!(object32 instanceof \u107b)) continue;
                    \u107b \u107b2 = (\u107b)object32;
                    for (n3 = 0; n3 < \u107b2.\u0529(); ++n3) {
                        object22 = \u107b2.\u052e((int)n3).\u0529;
                        if (!(object22 instanceof \u107a)) continue;
                        ((\u107a)object22).\u058f = \u107b2;
                    }
                }
                n4 = n2 + 1;
                n5 = \u08ae.\u0620(cArray[n2]);
                n3 = 1;
                n2 = n4;
                while (n3 <= n5) {
                    n4 = \u08ae.\u0620(cArray[n2]);
                    \u08bb \u08bb2 = (\u08bb)\u08aa2.\u037f.get(n4);
                    \u08aa2.\u0528.add(\u08bb2);
                    \u08bb2.\u052e = n3 - 1;
                    ++n3;
                    ++n2;
                }
                if (\u08aa2.\u052c == \u08b1.\u037f) {
                    if (bl2) {
                        n3 = n2 + 1;
                        \u08aa2.\u052f = new \u0cf1[\u08ae.\u0620(cArray[n2])];
                        for (n2 = 0; n2 < \u08aa2.\u052f.length; ++n2) {
                            \u0cf1 \u0cf12;
                            \u0d29[] \u0d29Array = \u0d29.\u037f();
                            n4 = n3 + 1;
                            \u0d29 \u0d292 = \u0d29Array[\u08ae.\u0620(cArray[n3])];
                            n6 = n4 + 1;
                            n3 = n4 = \u08ae.\u0620(cArray[n4]);
                            if (n4 == 65535) {
                                n3 = -1;
                            }
                            n4 = n5 = \u08ae.\u0620(cArray[n6]);
                            if (n5 == 65535) {
                                n4 = -1;
                            }
                            \u08aa2.\u052f[n2] = \u0cf12 = this.\u052e(\u0d292, n3, n4);
                            n3 = n6 + 1;
                        }
                    } else {
                        ArrayList<\u106f[]> arrayList3 = new ArrayList<\u106f[]>();
                        for (\u08b0 \u08b05 : \u08aa2.\u037f) {
                            for (n2 = 0; n2 < \u08b05.\u0529(); ++n2) {
                                \u107d \u107d3 = \u08b05.\u052e(n2);
                                if (!(\u107d3 instanceof \u08b3)) continue;
                                object32 = (\u08b3)\u107d3;
                                n3 = ((\u08b3)object32).\u052a;
                                object32 = new \u0d4e(n3, ((\u08b3)object32).\u052b);
                                \u08b05.\u052d(n2, new \u08b3(\u107d3.\u0529, n3, arrayList3.size(), false));
                                arrayList3.add((\u106f[])object32);
                            }
                        }
                        \u08aa2.\u052f = arrayList3.toArray(new \u0cf1[arrayList3.size()]);
                    }
                }
                this.\u052f(\u08aa2);
                if (this.\u052e.\u0529()) {
                    this.\u0783(\u08aa2);
                }
                if (!this.\u052e.\u0528() || \u08aa2.\u052c != \u08b1.\u0528) return \u08aa2;
                \u08aa2.\u052e = new int[\u08aa2.\u0529.length];
                for (n2 = 0; n2 < \u08aa2.\u0529.length; ++n2) {
                    \u08aa2.\u052e[n2] = \u08aa2.\u052d + n2 + 1;
                }
                for (n2 = 0; n2 < \u08aa2.\u0529.length; ++n2) {
                    void var1_11;
                    \u08b7 \u08b72 = new \u08b7();
                    \u08b72.\u052a = n2;
                    \u08aa2.\u037f(\u08b72);
                    object22 = new \u08b9();
                    ((\u08b0)object22).\u052a = n2;
                    \u08aa2.\u037f((\u08b0)object22);
                    \u08b72.\u058f = object22;
                    \u08aa2.\u0528(\u08b72);
                    ((\u08b9)object22).\u052e = \u08b72;
                    if (\u08aa2.\u0529[n2].\u052f) {
                        void var1_9;
                        block47: {
                            for (\u08b0 \u08b06 : \u08aa2.\u037f) {
                                \u08b0 \u08b07;
                                if (\u08b06.\u052a != n2 || !(\u08b06 instanceof \u107a) || !((\u08b07 = \u08b06.\u052e((int)(\u08b06.\u0529() - 1)).\u0529) instanceof \u0f89) || !\u08b07.\u052b || !(\u08b07.\u052e((int)0).\u0529 instanceof \u1070)) continue;
                                break block47;
                            }
                            Object var1_8 = null;
                        }
                        if (var1_9 == null) throw new UnsupportedOperationException(SOY.d("393D241A10195D26711F1012142638100D571C3B3F171857092630021157153471021C125A22231317121E373F15115708273D1354070837371F0C57093732021D18147C"));
                        \u107d \u107d4 = ((\u107a)var1_9).\u058f.\u052e(0);
                    } else {
                        \u1070 \u10702 = \u08aa2.\u052a[n2];
                        Object var10_38 = null;
                    }
                    object32 = \u08aa2.\u037f.iterator();
                    while (object32.hasNext()) {
                        for (\u107d \u107d5 : ((\u08b0)object32.next()).\u052c) {
                            void var10_39;
                            if (\u107d5 == var10_39 || \u107d5.\u0529 != var1_11) continue;
                            \u107d5.\u0529 = object22;
                        }
                    }
                    while (\u08aa2.\u0529[n2].\u0529() > 0) {
                        \u106f[] \u106fArray = \u08aa2.\u0529;
                        \u08b72.\u0528(\u106fArray[n2].\u052c(\u106fArray[n2].\u0529() - 1));
                    }
                    \u08aa2.\u0529[n2].\u0528(new \u08bd(\u08b72));
                    ((\u08b0)object22).\u0528(new \u08bd((\u08b0)var1_11));
                    \u08b8 \u08b82 = new \u08b8();
                    \u08aa2.\u037f(\u08b82);
                    \u08b82.\u0528(new \u08b6((\u08b0)object22, \u08aa2.\u052e[n2]));
                    \u08b72.\u0528(new \u08bd(\u08b82));
                }
                if (!this.\u052e.\u0529()) return \u08aa2;
                this.\u0783(\u08aa2);
                return \u08aa2;
            }
            Locale locale = Locale.getDefault();
            UUID uUID2 = \u052d;
            String string = String.format(locale, SOY.d("393D241A1057143D255610120937231F151B1328345635233472261F001F5A07043F30575F21715E110F0A37320211135A7722561B055A33711A11101B312856212233167858"), uUID, uUID2);
            throw new UnsupportedOperationException(new InvalidClassException(\u08aa.class.getName(), string));
        }
        String string = String.format(Locale.getDefault(), SOY.d("393D241A1057143D255610120937231F151B1328345635233472261F001F5A243404071E153C715310575237290611140E3735565113537C"), n3, n2);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(new InvalidClassException(\u08aa.class.getName(), string));
        throw unsupportedOperationException;
    }

    protected \u107d \u052b(\u08aa \u08aa2, int n2, int n3, int n4, int n5, int n6, int n7, List<\u0674> list) {
        \u08b0 \u08b02 = \u08aa2.\u037f.get(n4);
        boolean bl = true;
        boolean bl2 = true;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(SOY.d("2E3A345607071F3138101D121E7225041519093B251F1B195A2628061157132171181B035A24301A1D1354"));
            }
            case 10: {
                return new \u105c(\u08b02, n5);
            }
            case 9: {
                return new \u107e(\u08b02);
            }
            case 8: {
                return new \u0f8c(\u08b02, list.get(n5));
            }
            case 7: {
                return new \u1077(\u08b02, list.get(n5));
            }
            case 6: {
                bl = n7 != 0 ? bl2 : false;
                return new \u08b3(\u08b02, n5, n6, bl);
            }
            case 5: {
                if (n7 != 0) {
                    return new \u08b6(\u08b02, -1);
                }
                return new \u08b6(\u08b02, n5);
            }
            case 4: {
                if (n7 == 0) {
                    bl = false;
                }
                return new \u105d(\u08b02, n5, n6, bl);
            }
            case 3: {
                return new \u1075((\u106f)\u08aa2.\u037f.get(n5), n6, n7, \u08b02);
            }
            case 2: {
                if (n7 != 0) {
                    return new \u106e(\u08b02, -1, n6);
                }
                return new \u106e(\u08b02, n5, n6);
            }
            case 1: 
        }
        return new \u08bd(\u08b02);
    }

    protected \u0cf1 \u052e(\u0d29 \u0d292, int n2, int n3) {
        switch (com.github.catvod.spider.merge.\u08ae$\u052a.\u037f[\u0d292.ordinal()]) {
            default: {
                throw new IllegalArgumentException(String.format(Locale.getDefault(), SOY.d("2E3A345607071F3138101D121E723D130C1208723015001E153C71020D071F727412541E09723F1900570C333D1F1059"), new Object[]{\u0d292}));
            }
            case 8: {
                return new \u0f88(n2);
            }
            case 7: {
                return \u0edf.\u037f;
            }
            case 6: {
                return new \u0ede(n2);
            }
            case 5: {
                return \u0d5f.\u037f;
            }
            case 4: {
                return \u0d56.\u037f;
            }
            case 3: {
                return new \u0d55(n2);
            }
            case 2: {
                return new \u0d4e(n2, n3);
            }
            case 1: 
        }
        return new \u0d3a(n2);
    }

    protected void \u052f(\u08aa \u08aa2) {
        for (\u08b0 \u08b02 : \u08aa2.\u037f) {
            \u08b0 \u08b03;
            if (!(\u08b02 instanceof \u107a) || !\u08aa2.\u0529[\u08b02.\u052a].\u052f || !((\u08b03 = \u08b02.\u052e((int)(\u08b02.\u0529() - 1)).\u0529) instanceof \u0f89) || !\u08b03.\u052b || !(\u08b03.\u052e((int)0).\u0529 instanceof \u1070)) continue;
            ((\u107a)\u08b02).\u0620 = true;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected \u08b0 \u058f(int var1_1, int var2_2) {
        switch (var1_1) {
            default: {
                throw new IllegalArgumentException(String.format(Locale.getDefault(), SOY.d("2E3A345607071F3138101D121E72220215031F72250F04125A7735561D045A3C3E0254011B3E38125A"), new Object[]{var1_1}));
            }
            case 12: {
                var3_3 /* !! */  = new \u0f89();
                ** GOTO lbl39
            }
            case 11: {
                var3_3 /* !! */  = new \u105b();
                ** GOTO lbl39
            }
            case 10: {
                var3_3 /* !! */  = new \u107a();
                ** GOTO lbl39
            }
            case 9: {
                var3_3 /* !! */  = new \u107b();
                ** GOTO lbl39
            }
            case 8: {
                var3_3 /* !! */  = new \u08b9();
                ** GOTO lbl39
            }
            case 7: {
                var3_3 /* !! */  = new \u1070();
                ** GOTO lbl39
            }
            case 6: {
                var3_3 /* !! */  = new \u107c();
                ** GOTO lbl39
            }
            case 5: {
                var3_3 /* !! */  = new \u1079();
                ** GOTO lbl39
            }
            case 4: {
                var3_3 /* !! */  = new \u105a();
                ** GOTO lbl39
            }
            case 3: {
                var3_3 /* !! */  = new \u08b7();
                ** GOTO lbl39
            }
            case 2: {
                var3_3 /* !! */  = new \u106f();
                ** GOTO lbl39
            }
            case 1: {
                var3_3 /* !! */  = new \u08b8();
lbl39:
                // 12 sources

                var3_3 /* !! */ .\u052a = var2_2;
                return var3_3 /* !! */ ;
            }
            case 0: 
        }
        return null;
    }

    protected void \u0783(\u08aa object) {
        for (\u08b0 \u08b02 : ((\u08aa)object).\u037f) {
            boolean bl;
            block22: {
                block21: {
                    boolean bl2;
                    block18: {
                        block20: {
                            block19: {
                                if (\u08b02 == null) continue;
                                bl = \u08b02.\u052b();
                                bl2 = false;
                                boolean bl3 = false;
                                bl = bl || \u08b02.\u0529() <= 1;
                                this.\u037f(bl);
                                if (\u08b02 instanceof \u105a) {
                                    bl = ((\u105a)\u08b02).\u0620 != null;
                                    this.\u037f(bl);
                                }
                                if (\u08b02 instanceof \u107a) {
                                    \u107a \u107a2 = (\u107a)\u08b02;
                                    bl = \u107a2.\u058f != null;
                                    this.\u037f(bl);
                                    bl = \u107a2.\u0529() == 2;
                                    this.\u037f(bl);
                                    if (\u107a2.\u052e((int)0).\u0529 instanceof \u1079) {
                                        this.\u037f(\u107a2.\u052e((int)1).\u0529 instanceof \u0f89);
                                        this.\u037f(\u107a2.\u052f ^ true);
                                    } else if (\u107a2.\u052e((int)0).\u0529 instanceof \u0f89) {
                                        this.\u037f(\u107a2.\u052e((int)1).\u0529 instanceof \u1079);
                                        this.\u037f(\u107a2.\u052f);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                }
                                if (\u08b02 instanceof \u107b) {
                                    bl = \u08b02.\u0529() == 1;
                                    this.\u037f(bl);
                                    this.\u037f(\u08b02.\u052e((int)0).\u0529 instanceof \u107a);
                                }
                                if (\u08b02 instanceof \u0f89) {
                                    bl = ((\u0f89)\u08b02).\u052e != null;
                                    this.\u037f(bl);
                                }
                                if (\u08b02 instanceof \u106f) {
                                    bl = ((\u106f)\u08b02).\u052e != null;
                                    this.\u037f(bl);
                                }
                                if (\u08b02 instanceof \u08ba) {
                                    bl = ((\u08ba)\u08b02).\u058f != null;
                                    this.\u037f(bl);
                                }
                                if (\u08b02 instanceof \u08b9) {
                                    bl = ((\u08b9)\u08b02).\u052e != null;
                                    this.\u037f(bl);
                                }
                                if (!(\u08b02 instanceof \u08bb)) break block18;
                                if ((\u08b02 = (\u08bb)\u08b02).\u0529() <= 1) break block19;
                                bl = bl3;
                                if (((\u08bb)\u08b02).\u052e < 0) break block20;
                            }
                            bl = true;
                        }
                        this.\u037f(bl);
                        continue;
                    }
                    if (\u08b02.\u0529() <= 1) break block21;
                    bl = bl2;
                    if (!(\u08b02 instanceof \u1070)) break block22;
                }
                bl = true;
            }
            this.\u037f(bl);
        }
    }

    static interface \u052c {
        public int size();

        public int \u037f(char[] var1, int var2);
    }

    static final class \u052e
    extends Enum<\u052e> {
        public static final /* enum */ \u052e \u037f;
        public static final /* enum */ \u052e \u0528;
        private static final \u052e[] \u0529;

        static {
            \u052e \u052f;
            \u052e \u052f2;
            \u037f = \u052f2 = new \u052e();
            \u0528 = \u052f = new \u052e();
            \u0529 = new \u052e[]{\u052f2, \u052f};
        }
    }
}

