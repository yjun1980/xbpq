/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.U0.c;
import com.github.catvod.spider.merge.U0.d;
import com.github.catvod.spider.merge.U0.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public final class a
implements com.github.catvod.spider.merge.U0.a {
    private static final byte[] i = new byte[]{99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] j = new byte[]{82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] k = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};
    private static final int[] l = com.github.catvod.spider.merge.V0.a.$d2j$hex$f3c970cb$decode_I("c66363a5f87c7c84ee777799f67b7b8dfff2f20dd66b6bbdde6f6fb191c5c5546030305002010103ce6767a9562b2b7de7fefe19b5d7d7624dababe6ec76769a8fcaca451f82829d89c9c940fa7d7d87effafa15b25959eb8e4747c9fbf0f00b41adadecb3d4d4675fa2a2fd45afafea239c9cbf53a4a4f7e47272969bc0c05b75b7b7c2e1fdfd1c3d9393ae4c26266a6c36365a7e3f3f41f5f7f70283cccc4f6834345c51a5a5f4d1e5e534f9f1f108e2717193abd8d873623131532a15153f0804040c95c7c752462323659dc3c35e30181828379696a10a05050f2f9a9ab50e070709241212361b80809bdfe2e23dcdebeb264e2727697fb2b2cdea75759f1209091b1d83839e582c2c74341a1a2e361b1b2ddc6e6eb2b45a5aee5ba0a0fba45252f6763b3b4db7d6d6617db3b3ce5229297bdde3e33e5e2f2f7113848497a65353f5b9d1d16800000000c1eded2c40202060e3fcfc1f79b1b1c8b65b5bedd46a6abe8dcbcb4667bebed97239394b944a4ade984c4cd4b05858e885cfcf4abbd0d06bc5efef2a4faaaae5edfbfb16864343c59a4d4dd766333355118585948a4545cfe9f9f91004020206fe7f7f81a05050f0783c3c44259f9fba4ba8a8e3a25151f35da3a3fe804040c0058f8f8a3f9292ad219d9dbc70383848f1f5f50463bcbcdf77b6b6c1afdada754221216320101030e5ffff1afdf3f30ebfd2d26d81cdcd4c180c0c1426131335c3ecec2fbe5f5fe1359797a2884444cc2e17173993c4c45755a7a7f2fc7e7e827a3d3d47c86464acba5d5de73219192be6737395c06060a0198181989e4f4fd1a3dcdc7f44222266542a2a7e3b9090ab0b8888838c4646cac7eeee296bb8b8d32814143ca7dede79bc5e5ee2160b0b1daddbdb76dbe0e03b64323256743a3a4e140a0a1e924949db0c06060a4824246cb85c5ce49fc2c25dbdd3d36e43acacefc46262a6399191a8319595a4d3e4e437f279798bd5e7e7328bc8c8436e373759da6d6db7018d8d8cb1d5d5649c4e4ed249a9a9e0d86c6cb4ac5656faf3f4f407cfeaea25ca6565aff47a7a8e47aeaee9100808186fbabad5f07878884a25256f5c2e2e72381c1c2457a6a6f173b4b4c797c6c651cbe8e823a1dddd7ce874749c3e1f1f21964b4bdd61bdbddc0d8b8b860f8a8a85e07070907c3e3e4271b5b5c4cc6666aa904848d806030305f7f6f6011c0e0e12c26161a36a35355fae5757f969b9b9d01786869199c1c1583a1d1d27279e9eb9d9e1e138ebf8f8132b9898b322111133d26969bba9d9d970078e8e89339494a72d9b9bb63c1e1e2215878792c9e9e92087cece49aa5555ff50282878a5dfdf7a038c8c8f59a1a1f8098989801a0d0d1765bfbfdad7e6e631844242c6d06868b8824141c3299999b05a2d2d771e0f0f117bb0b0cba85454fc6dbbbbd62c16163a");
    private static final int[] m = com.github.catvod.spider.merge.V0.a.$d2j$hex$f3c970cb$decode_I("51f4a7507e4165531a17a4c33a275e963bab6bcb1f9d45f1acfa58ab4be303932030fa55ad766df688cc7691f5024c254fe5d7fcc52acbd726354480b562a38fdeb15a4925ba1b6745ea0e985dfec0e1c32f7502814cf0128d4697a36bd3f9c6038f5fe715929c95bf6d7aeb955259dad4be832d587421d349e069298ec9c84475c2896af48e797899583e6b27b971ddbee14fb6f088ad17c920ac667dce3ab463df4a18e51a31829751336062537f45b16477e0bb6bae84fe81a01cf9082b94704868588f45fd1994de6c87527bf8b7ab73d323724b02e2e31f8f576655ab2ab2eb28072fb5c20386c57b9ad33708a5302887f223bfa5b202036abaed16825c8acf1c2ba779b492f307f2f04e69e2a165daf4cd0605bed5d134621fc4a6fe8a342e539da2f355a0058ae132a4f6eb750b83ec394060efaa5e719f06bd6e10513e218af996dd063ddd3e05ae4de6bd4691548db571c45d050406d46f605015ff1998fb24d6bde997894043cc67d99e77b0e842bd07898b88e7195b3879c8eedba17c0a477c420fe9f8841ec90000000009808683322bed481e1170ac6c5a724efd0efffb0f8538563daed51e362d39270a0fd964685ca6219b5b54d124362e3a0c0a67b19357e70fb4ee96d21b9b919e80c0c54f61dc20a25a774b691c121a16e293ba0ac0a02ae53c22e043121b171d0e090d0bf28bc7ad2db6a8b9141ea9c857f11985af75074cee99ddbba37f60fdf701269f5c72f5bc44663bc55bfb7e348b432976cb23c6dcb6edfc68b8e4f163d731dcca426385101397224084c61120854a247dd2bb3df8aef93211c729a16d1d9e2f4bdcb230f30d8652ec77c1e3d02bb3166ca970b999119448fa47e96422a8fc8cc4a0f03f1a567d2cd8223390ef87494ec7d938d1c18ccaa2fe98d40b36a6f581cfa57ade28dab78e263fadbfa42c3a9de45078920d6a5fcc9b547e4662f68d13c290d8b8e82e39f75e82c3aff59f5d80be69d0937c6fd52da9cf2512b3c8ac993b10187da7e89c636edb3bbb7bcd2678096e5918f4ec9ab701834f9aa8e6956e65aaffe67e21bccf08ef15e8e6bae79bd94a6f36ceea9f09d429b07cd631a4b2af2a3f2331c6a5943035a266c0744ebc37fc82caa6e090d0b033a7d815f104984a41ecdaf77fcd500e1791f62f764dd68d43efb04dccaa4d54e49604df9ed1b5e34c6a881bc12c1fb84665517f9d5eea04018c355dfa877473fb0b412eb3671d5a92dbd252e91056336dd647139ad7618c37a10c7a59f8148eeb133c89cea927eeb761c935e11ce5ed7a47b13c9cd2df5955f2733f1814ce7973c737bf53f7cdea5ffdaa5bdf3d6f147844db86caaff381b968c43e3824342cc2a3405f161dc372bce2250c283c498bff0d954139a80171080cb3ded8b4e49c6456c1907bcb8461d532b670486c5c74d0b85742");
    private int a;
    private int[][] b = null;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private byte[] h;

    private void d(byte[] byArray, int n2) {
        int n3 = n2 + 1;
        int n4 = this.c;
        byArray[n2] = (byte)n4;
        n2 = n3 + 1;
        byArray[n3] = (byte)(n4 >> 8);
        int n5 = n2 + 1;
        byArray[n2] = (byte)(n4 >> 16);
        n3 = n5 + 1;
        byArray[n5] = (byte)(n4 >> 24);
        n5 = n3 + 1;
        n2 = this.d;
        byArray[n3] = (byte)n2;
        n4 = n5 + 1;
        byArray[n5] = (byte)(n2 >> 8);
        n3 = n4 + 1;
        byArray[n4] = (byte)(n2 >> 16);
        n4 = n3 + 1;
        byArray[n3] = (byte)(n2 >> 24);
        n3 = n4 + 1;
        n2 = this.e;
        byArray[n4] = (byte)n2;
        n4 = n3 + 1;
        byArray[n3] = (byte)(n2 >> 8);
        n3 = n4 + 1;
        byArray[n4] = (byte)(n2 >> 16);
        n4 = n3 + 1;
        byArray[n3] = (byte)(n2 >> 24);
        n3 = n4 + 1;
        n2 = this.f;
        byArray[n4] = (byte)n2;
        n4 = n3 + 1;
        byArray[n3] = (byte)(n2 >> 8);
        byArray[n4] = (byte)(n2 >> 16);
        byArray[n4 + 1] = (byte)(n2 >> 24);
    }

    private static int e(int n2) {
        byte[] byArray = i;
        byte by = byArray[n2 & 0xFF];
        byte by2 = byArray[n2 >> 8 & 0xFF];
        byte by3 = byArray[n2 >> 16 & 0xFF];
        return byArray[n2 >> 24 & 0xFF] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    private void f(byte[] byArray, int n2) {
        int n3 = n2 + 1;
        this.c = n2 = byArray[n2] & 0xFF;
        int n4 = n3 + 1;
        this.c = n3 = n2 | (byArray[n3] & 0xFF) << 8;
        n2 = n4 + 1;
        this.c = n3 |= (byArray[n4] & 0xFF) << 16;
        n4 = n2 + 1;
        this.c = n3 | byArray[n2] << 24;
        n2 = n4 + 1;
        this.d = n3 = byArray[n4] & 0xFF;
        n4 = n2 + 1;
        this.d = n3 = (byArray[n2] & 0xFF) << 8 | n3;
        n2 = n4 + 1;
        this.d = n4 = n3 | (byArray[n4] & 0xFF) << 16;
        n3 = n2 + 1;
        this.d = n4 | byArray[n2] << 24;
        n4 = n3 + 1;
        this.e = n3 = byArray[n3] & 0xFF;
        n2 = n4 + 1;
        this.e = n3 = (byArray[n4] & 0xFF) << 8 | n3;
        n4 = n2 + 1;
        this.e = n3 |= (byArray[n2] & 0xFF) << 16;
        n2 = n4 + 1;
        this.e = n3 | byArray[n4] << 24;
        n4 = n2 + 1;
        this.f = n3 = byArray[n2] & 0xFF;
        n2 = n4 + 1;
        this.f = n4 = (byArray[n4] & 0xFF) << 8 | n3;
        this.f = n4 |= (byArray[n2] & 0xFF) << 16;
        this.f = byArray[n2 + 1] << 24 | n4;
    }

    @Override
    public final int a(byte[] object, int n2, byte[] byArray, int n3) {
        if (this.b != null) {
            if (n2 + 16 <= ((byte[])object).length) {
                if (n3 + 16 <= byArray.length) {
                    boolean bl = this.g;
                    this.f((byte[])object, n2);
                    if (bl) {
                        int n4;
                        int n5;
                        int n6;
                        int n7;
                        int n8;
                        int n9;
                        Object[] objectArray;
                        object = this.b;
                        int n10 = this.c ^ object[0][0];
                        int n11 = this.d ^ object[0][1];
                        int n12 = this.e ^ object[0][2];
                        int n13 = this.f ^ object[0][3];
                        n2 = 1;
                        while (n2 < this.a - 1) {
                            objectArray = l;
                            n9 = objectArray[n10 & 0xFF];
                            n8 = objectArray[n11 >> 8 & 0xFF];
                            n7 = objectArray[n12 >> 16 & 0xFF];
                            n6 = objectArray[n13 >> 24 & 0xFF];
                            n8 = (n8 << -24 | n8 >>> 24) ^ n9 ^ (n7 << -16 | n7 >>> 16) ^ (n6 << -8 | n6 >>> 8) ^ object[n2][0];
                            n5 = objectArray[n11 & 0xFF];
                            n9 = objectArray[n12 >> 8 & 0xFF];
                            n6 = objectArray[n13 >> 16 & 0xFF];
                            n7 = objectArray[n10 >> 24 & 0xFF];
                            n6 = (n9 << -24 | n9 >>> 24) ^ n5 ^ (n6 << -16 | n6 >>> 16) ^ (n7 << -8 | n7 >>> 8) ^ object[n2][1];
                            n5 = objectArray[n12 & 0xFF];
                            n9 = objectArray[n13 >> 8 & 0xFF];
                            n4 = objectArray[n10 >> 16 & 0xFF];
                            n7 = objectArray[n11 >> 24 & 0xFF];
                            n9 = (n9 << -24 | n9 >>> 24) ^ n5 ^ (n4 << -16 | n4 >>> 16) ^ (n7 << -8 | n7 >>> 8) ^ object[n2][2];
                            n13 = objectArray[n13 & 0xFF];
                            n10 = objectArray[n10 >> 8 & 0xFF];
                            n11 = objectArray[n11 >> 16 & 0xFF];
                            n12 = objectArray[n12 >> 24 & 0xFF];
                            n7 = n2 + 1;
                            n13 = (n10 << -24 | n10 >>> 24) ^ n13 ^ (n11 << -16 | n11 >>> 16) ^ (n12 << -8 | n12 >>> 8) ^ object[n2][3];
                            int n14 = objectArray[n8 & 0xFF];
                            n10 = objectArray[n6 >> 8 & 0xFF];
                            int n15 = objectArray[n9 >> 16 & 0xFF];
                            int n16 = objectArray[n13 >> 24 & 0xFF];
                            void var21_38 = object[n7][0];
                            int n17 = objectArray[n6 & 0xFF];
                            int n18 = objectArray[n9 >> 8 & 0xFF];
                            int n19 = objectArray[n13 >> 16 & 0xFF];
                            n11 = objectArray[n8 >> 24 & 0xFF];
                            void var16_28 = object[n7][1];
                            n2 = objectArray[n9 & 0xFF];
                            n12 = objectArray[n13 >> 8 & 0xFF];
                            n5 = objectArray[n8 >> 16 & 0xFF];
                            n4 = objectArray[n6 >> 24 & 0xFF];
                            void var15_26 = object[n7][2];
                            n13 = objectArray[n13 & 0xFF];
                            n8 = objectArray[n8 >> 8 & 0xFF];
                            n6 = objectArray[n6 >> 16 & 0xFF];
                            n9 = objectArray[n9 >> 24 & 0xFF];
                            void var24_44 = object[n7][3];
                            n10 = n14 ^ (n10 << -24 | n10 >>> 24) ^ (n15 << -16 | n15 >>> 16) ^ (n16 << -8 | n16 >>> 8) ^ var21_38;
                            n11 = n17 ^ (n18 << -24 | n18 >>> 24) ^ (n19 << -16 | n19 >>> 16) ^ (n11 << -8 | n11 >>> 8) ^ var16_28;
                            n12 = n2 ^ (n12 << -24 | n12 >>> 24) ^ (n5 << -16 | n5 >>> 16) ^ (n4 << -8 | n4 >>> 8) ^ var15_26;
                            n13 = (n6 << -16 | n6 >>> 16) ^ ((n8 << -24 | n8 >>> 24) ^ n13) ^ (n9 << -8 | n9 >>> 8) ^ var24_44;
                            n2 = n7 + 1;
                        }
                        objectArray = l;
                        n8 = objectArray[n10 & 0xFF];
                        n9 = objectArray[n11 >> 8 & 0xFF];
                        n7 = objectArray[n12 >> 16 & 0xFF];
                        n6 = objectArray[n13 >> 24 & 0xFF];
                        n8 = n8 ^ (n9 << -24 | n9 >>> 24) ^ (n7 << -16 | n7 >>> 16) ^ (n6 << -8 | n6 >>> 8) ^ object[n2][0];
                        n5 = objectArray[n11 & 0xFF];
                        n6 = objectArray[n12 >> 8 & 0xFF];
                        n9 = objectArray[n13 >> 16 & 0xFF];
                        n7 = objectArray[n10 >> 24 & 0xFF];
                        n6 = n5 ^ (n6 << -24 | n6 >>> 24) ^ (n9 << -16 | n9 >>> 16) ^ (n7 << -8 | n7 >>> 8) ^ object[n2][1];
                        n4 = objectArray[n12 & 0xFF];
                        n9 = objectArray[n13 >> 8 & 0xFF];
                        n5 = objectArray[n10 >> 16 & 0xFF];
                        n7 = objectArray[n11 >> 24 & 0xFF];
                        n7 = n4 ^ (n9 << -24 | n9 >>> 24) ^ (n5 << -16 | n5 >>> 16) ^ (n7 << -8 | n7 >>> 8) ^ object[n2][2];
                        n13 = objectArray[n13 & 0xFF];
                        n10 = objectArray[n10 >> 8 & 0xFF];
                        n11 = objectArray[n11 >> 16 & 0xFF];
                        n9 = objectArray[n12 >> 24 & 0xFF];
                        n12 = n2 + 1;
                        n2 = (n9 << -8 | n9 >>> 8) ^ ((n10 << -24 | n10 >>> 24) ^ n13 ^ (n11 << -16 | n11 >>> 16)) ^ object[n2][3];
                        byte[] byArray2 = i;
                        n10 = byArray2[n8 & 0xFF];
                        n11 = byArray2[n6 >> 8 & 0xFF];
                        objectArray = this.h;
                        this.c = n10 & 0xFF ^ (n11 & 0xFF) << 8 ^ (objectArray[n7 >> 16 & 0xFF] & 0xFF) << 16 ^ objectArray[n2 >> 24 & 0xFF] << 24 ^ object[n12][0];
                        this.d = objectArray[n6 & 0xFF] & 0xFF ^ (byArray2[n7 >> 8 & 0xFF] & 0xFF) << 8 ^ (byArray2[n2 >> 16 & 0xFF] & 0xFF) << 16 ^ objectArray[n8 >> 24 & 0xFF] << 24 ^ object[n12][1];
                        n10 = objectArray[n7 & 0xFF];
                        n13 = byArray2[n2 >> 8 & 0xFF];
                        n11 = byArray2[n8 >> 16 & 0xFF];
                        n9 = byArray2[n6 >> 24 & 0xFF];
                        this.e = object[n12][2] ^ (n10 & 0xFF ^ (n13 & 0xFF) << 8 ^ (n11 & 0xFF) << 16 ^ n9 << 24);
                        n2 = objectArray[n2 & 0xFF];
                        n11 = objectArray[n8 >> 8 & 0xFF];
                        n10 = objectArray[n6 >> 16 & 0xFF];
                        n13 = byArray2[n7 >> 24 & 0xFF];
                        this.f = object[n12][3] ^ (n2 & 0xFF ^ (n11 & 0xFF) << 8 ^ (n10 & 0xFF) << 16 ^ n13 << 24);
                    } else {
                        int n20;
                        int n21;
                        int n22;
                        int n23;
                        int n24;
                        Object[] objectArray;
                        object = this.b;
                        n2 = this.c;
                        int n25 = this.a;
                        int n26 = n2 ^ object[n25][0];
                        int n27 = this.d ^ object[n25][1];
                        int n28 = this.e ^ object[n25][2];
                        n2 = n25 - 1;
                        int n29 = this.f;
                        n25 = object[n25][3] ^ n29;
                        while (true) {
                            objectArray = m;
                            n29 = n26 & 0xFF;
                            if (n2 <= 1) break;
                            n24 = objectArray[n29];
                            n23 = objectArray[n25 >> 8 & 0xFF];
                            n29 = objectArray[n28 >> 16 & 0xFF];
                            n22 = objectArray[n27 >> 24 & 0xFF];
                            n29 = n24 ^ (n23 << -24 | n23 >>> 24) ^ (n29 << -16 | n29 >>> 16) ^ (n22 << -8 | n22 >>> 8) ^ object[n2][0];
                            n23 = objectArray[n27 & 0xFF];
                            n22 = objectArray[n26 >> 8 & 0xFF];
                            n21 = objectArray[n25 >> 16 & 0xFF];
                            n24 = objectArray[n28 >> 24 & 0xFF];
                            n22 = n23 ^ (n22 << -24 | n22 >>> 24) ^ (n21 << -16 | n21 >>> 16) ^ (n24 << -8 | n24 >>> 8) ^ object[n2][1];
                            n21 = objectArray[n28 & 0xFF];
                            n20 = objectArray[n27 >> 8 & 0xFF];
                            n24 = objectArray[n26 >> 16 & 0xFF];
                            n23 = objectArray[n25 >> 24 & 0xFF];
                            n24 = n21 ^ (n20 << -24 | n20 >>> 24) ^ (n24 << -16 | n24 >>> 16) ^ (n23 << -8 | n23 >>> 8) ^ object[n2][2];
                            n25 = objectArray[n25 & 0xFF];
                            n28 = objectArray[n28 >> 8 & 0xFF];
                            n27 = objectArray[n27 >> 16 & 0xFF];
                            n26 = objectArray[n26 >> 24 & 0xFF];
                            n23 = n2 - 1;
                            n25 = (n26 << -8 | n26 >>> 8) ^ (n25 ^ (n28 << -24 | n28 >>> 24) ^ (n27 << -16 | n27 >>> 16)) ^ object[n2][3];
                            n26 = objectArray[n29 & 0xFF];
                            int n30 = objectArray[n25 >> 8 & 0xFF];
                            int n31 = objectArray[n24 >> 16 & 0xFF];
                            int n32 = objectArray[n22 >> 24 & 0xFF];
                            void var20_37 = object[n23][0];
                            n27 = objectArray[n22 & 0xFF];
                            int n33 = objectArray[n29 >> 8 & 0xFF];
                            int n34 = objectArray[n25 >> 16 & 0xFF];
                            int n35 = objectArray[n24 >> 24 & 0xFF];
                            void var16_29 = object[n23][1];
                            n20 = objectArray[n24 & 0xFF];
                            n2 = objectArray[n22 >> 8 & 0xFF];
                            n21 = objectArray[n29 >> 16 & 0xFF];
                            int n36 = objectArray[n25 >> 24 & 0xFF];
                            n28 = object[n23][2];
                            n25 = objectArray[n25 & 0xFF];
                            n24 = objectArray[n24 >> 8 & 0xFF];
                            n22 = objectArray[n22 >> 16 & 0xFF];
                            n29 = objectArray[n29 >> 24 & 0xFF];
                            n25 = object[n23][3] ^ (n25 ^ (n24 << -24 | n24 >>> 24) ^ (n22 << -16 | n22 >>> 16) ^ (n29 << -8 | n29 >>> 8));
                            n26 = n26 ^ (n30 << -24 | n30 >>> 24) ^ (n31 << -16 | n31 >>> 16) ^ (n32 << -8 | n32 >>> 8) ^ var20_37;
                            n27 = n27 ^ (n33 << -24 | n33 >>> 24) ^ (n34 << -16 | n34 >>> 16) ^ (n35 << -8 | n35 >>> 8) ^ var16_29;
                            n28 = n20 ^ (n2 << -24 | n2 >>> 24) ^ (n21 << -16 | n21 >>> 16) ^ (n36 << -8 | n36 >>> 8) ^ n28;
                            n2 = n23 - 1;
                        }
                        n23 = objectArray[n29];
                        n29 = objectArray[n25 >> 8 & 0xFF];
                        n22 = objectArray[n28 >> 16 & 0xFF];
                        n24 = objectArray[n27 >> 24 & 0xFF];
                        n29 = n23 ^ (n29 << -24 | n29 >>> 24) ^ (n22 << -16 | n22 >>> 16) ^ (n24 << -8 | n24 >>> 8) ^ object[n2][0];
                        n24 = objectArray[n27 & 0xFF];
                        n21 = objectArray[n26 >> 8 & 0xFF];
                        n23 = objectArray[n25 >> 16 & 0xFF];
                        n22 = objectArray[n28 >> 24 & 0xFF];
                        n22 = n24 ^ (n21 << -24 | n21 >>> 24) ^ (n23 << -16 | n23 >>> 16) ^ (n22 << -8 | n22 >>> 8) ^ object[n2][1];
                        n21 = objectArray[n28 & 0xFF];
                        n24 = objectArray[n27 >> 8 & 0xFF];
                        n20 = objectArray[n26 >> 16 & 0xFF];
                        n23 = objectArray[n25 >> 24 & 0xFF];
                        n23 = n21 ^ (n24 << -24 | n24 >>> 24) ^ (n20 << -16 | n20 >>> 16) ^ (n23 << -8 | n23 >>> 8) ^ object[n2][2];
                        n25 = objectArray[n25 & 0xFF];
                        n28 = objectArray[n28 >> 8 & 0xFF];
                        n27 = objectArray[n27 >> 16 & 0xFF];
                        n26 = objectArray[n26 >> 24 & 0xFF];
                        n2 = (n26 << -8 | n26 >>> 8) ^ (n25 ^ (n28 << -24 | n28 >>> 24) ^ (n27 << -16 | n27 >>> 16)) ^ object[n2][3];
                        byte[] byArray3 = j;
                        n26 = byArray3[n29 & 0xFF];
                        objectArray = this.h;
                        this.c = n26 & 0xFF ^ (objectArray[n2 >> 8 & 0xFF] & 0xFF) << 8 ^ (objectArray[n23 >> 16 & 0xFF] & 0xFF) << 16 ^ byArray3[n22 >> 24 & 0xFF] << 24 ^ object[0][0];
                        this.d = objectArray[n22 & 0xFF] & 0xFF ^ (objectArray[n29 >> 8 & 0xFF] & 0xFF) << 8 ^ (byArray3[n2 >> 16 & 0xFF] & 0xFF) << 16 ^ objectArray[n23 >> 24 & 0xFF] << 24 ^ object[0][1];
                        n26 = objectArray[n23 & 0xFF];
                        n27 = byArray3[n22 >> 8 & 0xFF];
                        n28 = byArray3[n29 >> 16 & 0xFF];
                        n25 = objectArray[n2 >> 24 & 0xFF];
                        this.e = object[0][2] ^ (n26 & 0xFF ^ (n27 & 0xFF) << 8 ^ (n28 & 0xFF) << 16 ^ n25 << 24);
                        n2 = byArray3[n2 & 0xFF];
                        n26 = objectArray[n23 >> 8 & 0xFF];
                        n27 = objectArray[n22 >> 16 & 0xFF];
                        n28 = objectArray[n29 >> 24 & 0xFF];
                        this.f = object[0][3] ^ (n2 & 0xFF ^ (n26 & 0xFF) << 8 ^ (n27 & 0xFF) << 16 ^ n28 << 24);
                    }
                    this.d(byArray, n3);
                    return 16;
                }
                throw new f();
            }
            throw new d("input buffer too short");
        }
        throw new IllegalStateException("AES engine not initialised");
    }

    @Override
    public final int b() {
        return 16;
    }

    @Override
    public final void c(boolean bl, c object) {
        if (object instanceof com.github.catvod.spider.merge.Y0.a) {
            Object object2 = ((com.github.catvod.spider.merge.Y0.a)object).a();
            int n2 = ((byte[])object2).length;
            if (n2 >= 16 && n2 <= 32 && (n2 & 7) == 0) {
                Object object3;
                int n3;
                int n4;
                int n5;
                block13: {
                    this.a = n5 = (n2 >>>= 2) + 6;
                    object = new int[n5 + 1][4];
                    if (n2 != 4) {
                        int n6;
                        int n7;
                        int n8;
                        int n9;
                        int n10;
                        if (n2 != 6) {
                            if (n2 == 8) {
                                n10 = com.github.catvod.spider.merge.b.a.g(object2, 0);
                                object[0][0] = n10;
                                n9 = com.github.catvod.spider.merge.b.a.g(object2, 4);
                                object[0][1] = n9;
                                n4 = com.github.catvod.spider.merge.b.a.g(object2, 8);
                                object[0][2] = n4;
                                n8 = com.github.catvod.spider.merge.b.a.g(object2, 12);
                                object[0][3] = n8;
                                n7 = com.github.catvod.spider.merge.b.a.g(object2, 16);
                                object[1][0] = n7;
                                n3 = com.github.catvod.spider.merge.b.a.g(object2, 20);
                                object[1][1] = n3;
                                n5 = com.github.catvod.spider.merge.b.a.g(object2, 24);
                                object[1][2] = n5;
                                n6 = com.github.catvod.spider.merge.b.a.g(object2, 28);
                                object[1][3] = n6;
                                n2 = 1;
                                object3 = 2;
                                while (true) {
                                    int n11 = n2;
                                    int n12 = com.github.catvod.spider.merge.V0.a.e(n6 << -8 | n6 >>> 8);
                                    n2 = n11 << 1;
                                    object[object3][0] = n10 ^= n12 ^ n11;
                                    object[object3][1] = n9 ^= n10;
                                    object[object3][2] = n4 ^= n9;
                                    object[object3][3] = n8 ^= n4;
                                    if (++object3 < 15) {
                                        object[object3][0] = n7 ^= com.github.catvod.spider.merge.V0.a.e(n8);
                                        object[object3][1] = n3 ^= n7;
                                        object[object3][2] = n5 ^= n3;
                                        object[object3][3] = n6 ^= n5;
                                        ++object3;
                                        continue;
                                    }
                                    break block13;
                                    break;
                                }
                            }
                            throw new IllegalStateException("Should never get here");
                        }
                        n9 = com.github.catvod.spider.merge.b.a.g(object2, 0);
                        object[0][0] = n9;
                        n7 = com.github.catvod.spider.merge.b.a.g(object2, 4);
                        object[0][1] = n7;
                        n4 = com.github.catvod.spider.merge.b.a.g(object2, 8);
                        object[0][2] = n4;
                        object3 = com.github.catvod.spider.merge.b.a.g(object2, 12);
                        object[0][3] = object3;
                        n3 = com.github.catvod.spider.merge.b.a.g(object2, 16);
                        n5 = com.github.catvod.spider.merge.b.a.g(object2, 20);
                        n2 = 1;
                        n8 = 1;
                        while (true) {
                            object[n2][0] = n3;
                            object[n2][1] = n5;
                            n10 = com.github.catvod.spider.merge.V0.a.e(n5 >>> 8 | n5 << -8);
                            n6 = n8 << 1;
                            object[n2][2] = n9 ^= n10 ^ n8;
                            object[n2][3] = n7 ^= n9;
                            n8 = n2 + 1;
                            object[n8][0] = n4 ^= n7;
                            object[n8][1] = object3 ^= n4;
                            object[n8][2] = n3 ^= object3;
                            object[n8][3] = n5 ^= n3;
                            n10 = com.github.catvod.spider.merge.V0.a.e(n5 >>> 8 | n5 << -8);
                            n8 = n6 << 1;
                            n9 ^= n10 ^ n6;
                            n6 = n2 + 2;
                            object[n6][0] = n9;
                            object[n6][1] = n7 ^= n9;
                            object[n6][2] = n4 ^= n7;
                            object[n6][3] = object3 ^= n4;
                            if ((n2 += 3) < 13) {
                                n5 ^= (n3 ^= object3);
                                continue;
                            }
                            break block13;
                            break;
                        }
                    }
                    n4 = com.github.catvod.spider.merge.b.a.g(object2, 0);
                    object[0][0] = n4;
                    n3 = com.github.catvod.spider.merge.b.a.g(object2, 4);
                    object[0][1] = n3;
                    n5 = com.github.catvod.spider.merge.b.a.g(object2, 8);
                    object[0][2] = n5;
                    object3 = com.github.catvod.spider.merge.b.a.g(object2, 12);
                    object[0][3] = object3;
                    for (n2 = 1; n2 <= 10; ++n2) {
                        object[n2][0] = n4 ^= com.github.catvod.spider.merge.V0.a.e(object3 >>> 8 | object3 << -8) ^ k[n2 - 1];
                        object[n2][1] = n3 ^= n4;
                        object[n2][2] = n5 ^= n3;
                        object[n2][3] = object3 ^= n5;
                    }
                }
                if (!bl) {
                    for (n2 = 1; n2 < this.a; ++n2) {
                        for (n5 = 0; n5 < 4; ++n5) {
                            object2 = object[n2];
                            object3 = object[n2][n5];
                            n3 = (object3 >>> 8 | object3 << -8) ^ object3;
                            n4 = 0xC0C0C0C0 & (object3 ^= (0x7F7F7F7F & n3) << 1 ^ ((0x80808080 & n3) >>> 7) * 27);
                            n4 ^= n4 >>> 1;
                            object2[n5] = object3 ^ ((n3 ^= (0x3F3F3F3F & object3) << 2 ^ n4 >>> 2 ^ n4 >>> 5) ^ (n3 >>> 16 | n3 << -16));
                        }
                    }
                }
                this.b = (int[][])object;
                this.g = bl;
                this.h = bl ? (byte[])i.clone() : (byte[])j.clone();
                return;
            }
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("invalid parameter passed to AES init - ");
        stringBuilder.append(object.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public final void reset() {
    }

    private static long[] $d2j$hex$f3c970cb$decode_J(String src) {
        byte[] d2 = com.github.catvod.spider.merge.V0.a.$d2j$hex$f3c970cb$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$f3c970cb$decode_I(String src) {
        byte[] d2 = com.github.catvod.spider.merge.V0.a.$d2j$hex$f3c970cb$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$f3c970cb$decode_S(String src) {
        byte[] d2 = com.github.catvod.spider.merge.V0.a.$d2j$hex$f3c970cb$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$f3c970cb$decode_B(String src) {
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

