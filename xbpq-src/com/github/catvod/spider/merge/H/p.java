/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

public final class p {
    private static final int[][] a;
    private static final int[][] b;

    static {
        int[] nArray = new int[]{0x20000000, 0};
        int[] nArray2 = new int[]{0x28000000, 0};
        int[] nArray3 = new int[]{0x32000000, 0};
        int[] nArray4 = new int[]{655360000, 0};
        int[] nArray5 = new int[]{819200000, 0};
        int[] nArray6 = new int[]{640000000, 0};
        int[] nArray7 = new int[]{800000000, 0};
        int[] nArray8 = new int[]{1000000000, 0};
        int[] nArray9 = new int[]{625000000, 0};
        int[] nArray10 = new int[]{781250000, 0};
        int[] nArray11 = new int[]{976562500, 0};
        int[] nArray12 = new int[]{610351562, 0x40000000};
        int[] nArray13 = new int[]{953674316, 0x34000000};
        int[] nArray14 = new int[]{596046447, 0x60800000};
        int[] nArray15 = new int[]{745058059, 1486880768};
        int[] nArray16 = new int[]{931322574, 1321730048};
        int[] nArray17 = new int[]{582076609, 289210368};
        int[] nArray18 = new int[]{727595761, 898383872};
        int[] nArray19 = new int[]{909494701, 1659850752};
        int[] nArray20 = new int[]{710542735, 1632302720};
        int[] nArray21 = new int[]{888178419, 1503507488};
        int[] nArray22 = new int[]{555111512, 671256724};
        int[] nArray23 = new int[]{693889390, 839070905};
        int[] nArray24 = new int[]{867361737, 2122580455};
        int[] nArray25 = new int[]{847032947, 546105819};
        int[] nArray26 = new int[]{1058791184, 145761362};
        int[] nArray27 = new int[]{827180612, 1187617888};
        int[] nArray28 = new int[]{1033975765, 1484522360};
        int[] nArray29 = new int[]{646234853, 1196261931};
        int[] nArray30 = new int[]{1009741958, 1466506084};
        int[] nArray31 = new int[]{631088724, 379695390};
        int[] nArray32 = new int[]{788860905, 474619238};
        int[] nArray33 = new int[]{986076131, 1130144959};
        int[] nArray34 = new int[]{616297582, 437905143};
        int[] nArray35 = new int[]{770371977, 1621123253};
        int[] nArray36 = new int[]{962964972, 415791331};
        int[] nArray37 = new int[]{752316384, 1130143345};
        int[] nArray38 = new int[]{940395480, 1412679181};
        a = new int[][]{nArray, nArray2, nArray3, {1048576000, 0}, nArray4, nArray5, {1024000000, 0}, nArray6, nArray7, nArray8, nArray9, nArray10, nArray11, nArray12, {762939453, 0x10000000}, nArray13, nArray14, nArray15, nArray16, nArray17, nArray18, nArray19, {568434188, 1305842176}, nArray20, nArray21, nArray22, nArray23, nArray24, {542101086, 521306416}, {677626357, 1725374844}, nArray25, nArray26, {661744490, 91100851}, nArray27, nArray28, nArray29, {807793566, 2032198326}, nArray30, nArray31, nArray32, nArray33, nArray34, nArray35, nArray36, {601853107, 1333611405}, nArray37, nArray38};
        nArray8 = new int[]{0x10000000, 1};
        nArray36 = new int[]{0xCCCCCCC, 0x66666667};
        nArray33 = new int[]{171798691, 1803886265};
        nArray14 = new int[]{137438953, 1013612282};
        nArray29 = new int[]{219902325, 1192282922};
        nArray23 = new int[]{175921860, 953826338};
        nArray27 = new int[]{140737488, 763061070};
        nArray35 = new int[]{225179981, 791400982};
        nArray7 = new int[]{180143985, 203624056};
        nArray15 = new int[]{144115188, 162899245};
        nArray9 = new int[]{184467440, 1582900568};
        nArray26 = new int[]{147573952, 1266320455};
        nArray = new int[]{236118324, 308125809};
        nArray22 = new int[]{151115727, 970294631};
        nArray2 = new int[]{241785163, 1981968139};
        nArray20 = new int[]{154742504, 1955654377};
        nArray5 = new int[]{198070406, 613451992};
        nArray25 = new int[]{253530120, 98023782};
        nArray17 = new int[]{202824096, 78419026};
        nArray31 = new int[]{162259276, 1780722139};
        nArray21 = new int[]{207691874, 733136111};
        nArray19 = new int[]{265845599, 337118801};
        nArray4 = new int[]{170141183, 988850146};
        b = new int[][]{nArray8, nArray36, nArray33, nArray14, nArray29, nArray23, nArray27, nArray35, nArray7, nArray15, {230584300, 1978625710}, nArray9, nArray26, nArray, {188894659, 675997377}, nArray22, nArray2, {193428131, 297084323}, nArray20, {247588007, 1840556814}, nArray5, {158456325, 61264864}, nArray25, nArray17, nArray31, {259614842, 1990161963}, nArray21, {166153499, 1016005619}, nArray19, {212676479, 699191770}, nArray4};
    }

    public static int a(float f2, char[] cArray, int n2) {
        int n3;
        int n4;
        int n5;
        long l2;
        int n6;
        long l3;
        long l4;
        long l5;
        int[][] nArray;
        int n7;
        int n8;
        int n9;
        block48: {
            int n10;
            block46: {
                block47: {
                    block45: {
                        if (!Float.isNaN(f2)) break block45;
                        n10 = n2 + 1;
                        cArray[n2] = 78;
                        int n11 = n10 + 1;
                        cArray[n10] = 97;
                        n10 = n11 + 1;
                        cArray[n11] = 78;
                        break block46;
                    }
                    if (f2 == Float.POSITIVE_INFINITY) {
                        int n12 = n2 + 1;
                        cArray[n2] = 73;
                        int n13 = n12 + 1;
                        cArray[n12] = 110;
                        n12 = n13 + 1;
                        cArray[n13] = 102;
                        int n14 = n12 + 1;
                        cArray[n12] = 105;
                        n13 = n14 + 1;
                        cArray[n14] = 110;
                        n12 = n13 + 1;
                        cArray[n13] = 105;
                        n13 = n12 + 1;
                        cArray[n12] = 116;
                        cArray[n13] = 121;
                        return n13 + 1 - n2;
                    }
                    if (f2 != Float.NEGATIVE_INFINITY) break block47;
                    int n15 = n2 + 1;
                    cArray[n2] = 45;
                    n10 = n15 + 1;
                    cArray[n15] = 73;
                    n15 = n10 + 1;
                    cArray[n10] = 110;
                    n10 = n15 + 1;
                    cArray[n15] = 102;
                    n15 = n10 + 1;
                    cArray[n10] = 105;
                    int n16 = n15 + 1;
                    cArray[n15] = 110;
                    n10 = n16 + 1;
                    cArray[n16] = 105;
                    n15 = n10 + 1;
                    cArray[n10] = 116;
                    n10 = n15 + 1;
                    cArray[n15] = 121;
                    break block46;
                }
                n9 = Float.floatToIntBits(f2);
                if (n9 != 0) break block48;
                n10 = n2 + 1;
                cArray[n2] = 48;
                int n17 = n10 + 1;
                cArray[n10] = 46;
                n10 = n17 + 1;
                cArray[n17] = 48;
            }
            return n10 - n2;
        }
        if (n9 == Integer.MIN_VALUE) {
            int n18 = n2 + 1;
            cArray[n2] = 45;
            int n19 = n18 + 1;
            cArray[n18] = 48;
            n18 = n19 + 1;
            cArray[n19] = 46;
            cArray[n18] = 48;
            return n18 + 1 - n2;
        }
        int n20 = n9 >> 23 & 0xFF;
        int n21 = 0x7FFFFF & n9;
        if (n20 == 0) {
            n8 = -149;
        } else {
            n8 = n20 - 127 - 23;
            n21 |= 0x800000;
        }
        boolean bl = n9 < 0;
        boolean bl2 = (n21 & 1) == 0;
        int n22 = n21 * 4;
        n9 = n22 + 2;
        n21 = (long)n21 == 0x800000L && n20 > 1 ? 1 : 2;
        int n23 = n22 - n21;
        int n24 = n8 - 2;
        if (n24 >= 0) {
            n7 = (int)((long)n24 * 3010299L / 10000000L);
            n8 = n7 == 0 ? 1 : (int)(((long)n7 * 23219280L + 10000000L - 1L) / 10000000L);
            n21 = -n24 + n7;
            nArray = b;
            l5 = nArray[n7][0];
            l4 = nArray[n7][1];
            l3 = n22;
            n8 = n8 + 59 - 1 + n21 - 31;
            n6 = (int)(l3 * l5 + (l3 * l4 >> 31) >> n8);
            l2 = n9;
            n24 = (int)(l2 * l5 + (l2 * l4 >> 31) >> n8);
            l2 = n23;
            n5 = (int)(l5 * l2 + (l2 * l4 >> 31) >> n8);
            if (n7 != 0 && (n24 - 1) / 10 <= n5 / 10) {
                n20 = n7 - 1;
                n8 = n20 == 0 ? 1 : (int)(((long)n20 * 23219280L + 10000000L - 1L) / 10000000L);
                n8 = (int)(((long)nArray[n20][0] * l3 + ((long)nArray[n20][1] * l3 >> 31) >> n21 - 1 + (n8 + 59 - 1) - 31) % 10L);
            } else {
                n8 = 0;
            }
            n21 = 0;
            while (n9 > 0 && n9 % 5 == 0) {
                n9 /= 5;
                ++n21;
            }
            n9 = 0;
            while (n22 > 0 && n22 % 5 == 0) {
                n22 /= 5;
                ++n9;
            }
            n20 = 0;
            n22 = n23;
            while (n22 > 0 && n22 % 5 == 0) {
                n22 /= 5;
                ++n20;
            }
            n21 = n21 >= n7 ? 1 : 0;
            n22 = n9 >= n7 ? 1 : 0;
            n9 = n20 >= n7 ? 1 : 0;
            n4 = n21;
            n3 = n22;
            n20 = n24;
            n23 = n7;
            n22 = n5;
            n21 = n6;
        } else {
            n8 = -n24;
            n7 = (int)((long)n8 * 6989700L / 10000000L);
            n21 = n8 - n7;
            n8 = n21 == 0 ? 1 : (int)(((long)n21 * 23219280L + 10000000L - 1L) / 10000000L);
            nArray = a;
            l4 = nArray[n21][0];
            l5 = nArray[n21][1];
            n8 = n7 - (n8 - 61) - 31;
            l3 = n22;
            n6 = (int)(l3 * l4 + (l3 * l5 >> 31) >> n8);
            l2 = n9;
            n3 = (int)(l2 * l4 + (l2 * l5 >> 31) >> n8);
            l2 = n23;
            n5 = (int)(l4 * l2 + (l2 * l5 >> 31) >> n8);
            if (n7 != 0 && (n3 - 1) / 10 <= n5 / 10) {
                n8 = ++n21 == 0 ? 1 : (int)(((long)n21 * 23219280L + 10000000L - 1L) / 10000000L);
                n8 = (int)(((long)nArray[n21][0] * l3 + ((long)nArray[n21][1] * l3 >> 31) >> n7 - 1 - (n8 - 61) - 31) % 10L);
            } else {
                n8 = 0;
            }
            n9 = 1 >= n7 ? 1 : 0;
            n21 = n7 < 23 && ((1 << n7 - 1) - 1 & n22) == 0 ? 1 : 0;
            n22 = n23 % 2 == 1 ? 0 : 1;
            n20 = n22 >= n7 ? 1 : 0;
            n22 = n5;
            n4 = n9;
            n23 = n24 + n7;
            n5 = n21;
            n21 = n6;
            n9 = n20;
            n20 = n3;
            n3 = n5;
        }
        n6 = 1000000000;
        for (n5 = 10; n5 > 0 && n20 < n6; n6 /= 10, --n5) {
        }
        int n25 = n23 + n5 - 1;
        n6 = n25 >= -3 && n25 < 7 ? 0 : 1;
        n23 = n20;
        if (n4 != 0) {
            n23 = n20;
            if (!bl2) {
                n23 = n20 - 1;
            }
        }
        n7 = 0;
        n4 = n9;
        n9 = n8;
        n20 = n23;
        n8 = n7;
        while ((n7 = n20 / 10) > (n23 = n22 / 10) && (n20 >= 100 || n6 == 0)) {
            n9 = n22 % 10 == 0 ? 1 : 0;
            n4 &= n9;
            n9 = n21 % 10;
            n21 /= 10;
            ++n8;
            n20 = n7;
            n22 = n23;
        }
        n7 = n8;
        n23 = n9;
        int n26 = n22;
        n24 = n21;
        if (n4 != 0) {
            n7 = n8;
            n23 = n9;
            n26 = n22;
            n24 = n21;
            if (bl2) {
                while (true) {
                    n7 = ++n8;
                    n23 = n9;
                    n26 = n22;
                    n24 = n21;
                    if (n22 % 10 != 0) break;
                    if (n20 < 100 && n6 != 0) {
                        n7 = n8;
                        n23 = n9;
                        n26 = n22;
                        n24 = n21;
                        break;
                    }
                    n20 /= 10;
                    n9 = n21 % 10;
                    n21 /= 10;
                    n22 /= 10;
                }
            }
        }
        n8 = n23;
        if (n3 != 0) {
            n8 = n23;
            if (n23 == 5) {
                n8 = n23;
                if (n24 % 2 == 0) {
                    n8 = 4;
                }
            }
        }
        n8 = n24 == n26 && (n4 == 0 || !bl2) || n8 >= 5 ? 1 : 0;
        n8 = n24 + n8;
        n23 = n5 - n7;
        if (bl) {
            n21 = n2 + 1;
            cArray[n2] = 45;
        } else {
            n21 = n2;
        }
        if (n6 != 0) {
            n9 = 0;
            while (true) {
                n22 = n8;
                if (n9 >= n23 - 1) break;
                n8 = n22 / 10;
                cArray[n21 + n23 - n9] = (char)(n22 % 10 + 48);
                ++n9;
            }
            cArray[n21] = (char)(n22 % 10 + 48);
            cArray[n21 + 1] = 46;
            n8 = n21 = n23 + 1 + n21;
            if (n23 == 1) {
                cArray[n21] = 48;
                n8 = n21 + 1;
            }
            n9 = n8 + 1;
            cArray[n8] = 69;
            n8 = n9;
            n21 = n25;
            if (n25 < 0) {
                cArray[n9] = 45;
                n21 = -n25;
                n8 = n9 + 1;
            }
            if (n21 >= 10) {
                cArray[n8] = (char)(n21 / 10 + 48);
                ++n8;
            }
            n9 = n8 + 1;
            cArray[n8] = (char)(n21 % 10 + 48);
            n8 = n9;
        } else if (n25 < 0) {
            n9 = n21 + 1;
            cArray[n21] = 48;
            n21 = n9 + 1;
            cArray[n9] = 46;
            n9 = -1;
            while (n9 > n25) {
                cArray[n21] = 48;
                --n9;
                ++n21;
            }
            n20 = n21;
            n22 = n8;
            n8 = n20;
            for (n9 = 0; n9 < n23; ++n9) {
                cArray[n21 + n23 - n9 - 1] = (char)(n22 % 10 + 48);
                n22 /= 10;
                ++n8;
            }
        } else {
            n20 = n25 + 1;
            if (n20 >= n23) {
                n22 = 0;
                n9 = n8;
                for (n8 = n22; n8 < n23; ++n8) {
                    cArray[n21 + n23 - n8 - 1] = (char)(n9 % 10 + 48);
                    n9 /= 10;
                }
                n8 = n21 + n23;
                n21 = n23;
                while (n21 < n20) {
                    cArray[n8] = 48;
                    ++n21;
                    ++n8;
                }
                n21 = n8 + 1;
                cArray[n8] = 46;
                cArray[n21] = 48;
                n8 = n21 + 1;
            } else {
                n22 = n21 + 1;
                n20 = 0;
                n9 = n8;
                for (n8 = n20; n8 < n23; ++n8) {
                    n20 = n22;
                    if (n23 - n8 - 1 == n25) {
                        cArray[n22 + n23 - n8 - 1] = 46;
                        n20 = n22 - 1;
                    }
                    cArray[n20 + n23 - n8 - 1] = (char)(n9 % 10 + 48);
                    n9 /= 10;
                    n22 = n20;
                }
                n8 = n23 + 1 + n21;
            }
        }
        return n8 - n2;
    }
}

