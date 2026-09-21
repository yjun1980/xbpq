/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.xc.D0.c;
import com.github.catvod.spider.merge.xc.F0.l;
import com.github.catvod.spider.merge.xc.F0.q;
import com.github.catvod.spider.merge.xc.G0.A;
import com.github.catvod.spider.merge.xc.G0.B;
import com.github.catvod.spider.merge.xc.G0.D;
import com.github.catvod.spider.merge.xc.G0.E;
import com.github.catvod.spider.merge.xc.G0.G;
import com.github.catvod.spider.merge.xc.G0.H;
import com.github.catvod.spider.merge.xc.G0.K;
import com.github.catvod.spider.merge.xc.G0.L;
import com.github.catvod.spider.merge.xc.G0.N;
import com.github.catvod.spider.merge.xc.G0.b;
import com.github.catvod.spider.merge.xc.G0.g1;
import com.github.catvod.spider.merge.xc.y0.a;
import java.util.ArrayList;
import java.util.Collections;

public final class x
extends B {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean c(N var1_1, b var2_2) {
        block310: {
            block311: {
                block309: {
                    var3_3 = com.github.catvod.spider.merge.xc.y0.a.a(var1_1 /* !! */ .a);
                    if (var3_3 == 0) {
                        var2_2.h(this);
                        return false;
                    }
                    var15_4 = B.d;
                    var13_5 = A.i;
                    var14_6 = A.l;
                    var10_8 = com.github.catvod.spider.merge.xc.G0.b.E;
                    if (var3_3 == 1) break block309;
                    if (var3_3 != 2) {
                        if (var3_3 == 3) {
                            var2_2.t((H)var1_1 /* !! */ );
                            return true;
                        }
                        if (var3_3 != 4) {
                            if (var3_3 != 5) {
                                return true;
                            }
                            if (var2_2.r.size() <= 0) return true;
                            var10_8 = B.r;
                            var2_2.g = var1_1 /* !! */ ;
                            return var10_8.c((N)var1_1 /* !! */ , (b)var2_2);
                        }
                        var1_1 /* !! */  = (G)var1_1 /* !! */ ;
                        if (var1_1 /* !! */ .b.equals(B.x)) {
                            var2_2.h(this);
                            return false;
                        }
                        if (var2_2.u && B.a((N)var1_1 /* !! */ )) {
                            var2_2.I();
                            var2_2.s((G)var1_1 /* !! */ );
                            return true;
                        }
                        var2_2.I();
                        var2_2.s((G)var1_1 /* !! */ );
                        var2_2.u = false;
                        return true;
                    }
                    var16_9 = (K)var1_1 /* !! */ ;
                    var11_11 = var16_9.c;
                    var11_11.getClass();
                    var12_13 = com.github.catvod.spider.merge.xc.G0.b.x;
                    tmp = -1;
                    switch (var11_11.hashCode()) {
                        case 1869063452: {
                            if (!var11_11.equals("sarcasm")) break;
                            tmp = 1;
                            break;
                        }
                        case 3536714: {
                            if (!var11_11.equals("span")) break;
                            tmp = 2;
                            break;
                        }
                        case 3213227: {
                            if (!var11_11.equals("html")) break;
                            tmp = 3;
                            break;
                        }
                        case 3148996: {
                            if (!var11_11.equals("form")) break;
                            tmp = 4;
                            break;
                        }
                        case 3029410: {
                            if (!var11_11.equals("body")) break;
                            tmp = 5;
                            break;
                        }
                        case 3453: {
                            if (!var11_11.equals("li")) break;
                            tmp = 6;
                            break;
                        }
                        case 3278: {
                            if (!var11_11.equals("h6")) break;
                            tmp = 7;
                            break;
                        }
                        case 3277: {
                            if (!var11_11.equals("h5")) break;
                            tmp = 8;
                            break;
                        }
                        case 3276: {
                            if (!var11_11.equals("h4")) break;
                            tmp = 9;
                            break;
                        }
                        case 3275: {
                            if (!var11_11.equals("h3")) break;
                            tmp = 10;
                            break;
                        }
                        case 3274: {
                            if (!var11_11.equals("h2")) break;
                            tmp = 11;
                            break;
                        }
                        case 3273: {
                            if (!var11_11.equals("h1")) break;
                            tmp = 12;
                            break;
                        }
                        case 3216: {
                            if (!var11_11.equals("dt")) break;
                            tmp = 13;
                            break;
                        }
                        case 3200: {
                            if (!var11_11.equals("dd")) break;
                            tmp = 14;
                            break;
                        }
                        case 3152: {
                            if (!var11_11.equals("br")) break;
                            tmp = 15;
                            break;
                        }
                        case 112: {
                            if (!var11_11.equals("p")) break;
                            tmp = 16;
                            break;
                        }
                        case -1321546630: {
                            if (!var11_11.equals("template")) break;
                            tmp = 17;
                            break;
                        }
                    }
                    switch (tmp) {
                        default: {
                            var3_3 = -1;
                            break;
                        }
                        case 1: {
                            var3_3 = 16;
                            break;
                        }
                        case 2: {
                            var3_3 = 15;
                            break;
                        }
                        case 3: {
                            var3_3 = 14;
                            break;
                        }
                        case 4: {
                            var3_3 = 13;
                            break;
                        }
                        case 5: {
                            var3_3 = 12;
                            break;
                        }
                        case 6: {
                            var3_3 = 11;
                            break;
                        }
                        case 7: {
                            var3_3 = 10;
                            break;
                        }
                        case 8: {
                            var3_3 = 9;
                            break;
                        }
                        case 9: {
                            var3_3 = 8;
                            break;
                        }
                        case 10: {
                            var3_3 = 7;
                            break;
                        }
                        case 11: {
                            var3_3 = 6;
                            break;
                        }
                        case 12: {
                            var3_3 = 5;
                            break;
                        }
                        case 13: {
                            var3_3 = 4;
                            break;
                        }
                        case 14: {
                            var3_3 = 3;
                            break;
                        }
                        case 15: {
                            var3_3 = 2;
                            break;
                        }
                        case 16: {
                            var3_3 = 1;
                            break;
                        }
                        case 17: {
                            var3_3 = 0;
                        }
                    }
                    switch (var3_3) {
                        default: {
                            if (!com.github.catvod.spider.merge.xc.E0.b.c((String)var11_11, A.q)) ** GOTO lbl169
                            var13_5 = var16_9.c;
                            var12_13 = var2_2.e;
                            var5_15 = 0;
                            break block310;
lbl169:
                            // 1 sources

                            if (com.github.catvod.spider.merge.xc.E0.b.c((String)var11_11, A.p)) {
                                if (!var2_2.n((String)var11_11)) {
                                    var2_2.h(this);
                                    return false;
                                } else {
                                    var2_2.j(false);
                                    if (!var2_2.g((String)var11_11)) {
                                        var2_2.h(this);
                                    }
                                    var2_2.B((String)var11_11);
                                    return true;
                                }
                            }
                            if (!com.github.catvod.spider.merge.xc.E0.b.c((String)var11_11, (String[])var14_6)) {
                                return this.d((N)var1_1 /* !! */ , (b)var2_2);
                            }
                            if (var2_2.n("name") != false) return true;
                            if (!var2_2.n((String)var11_11)) {
                                var2_2.h(this);
                                return false;
                            } else {
                                var2_2.j(false);
                                if (!var2_2.g((String)var11_11)) {
                                    var2_2.h(this);
                                }
                                var2_2.B((String)var11_11);
                                var2_2.c();
                                return true;
                            }
                        }
                        case 15: 
                        case 16: {
                            return this.d((N)var1_1 /* !! */ , (b)var2_2);
                        }
                        case 14: {
                            if (var2_2.F("body") == false) return true;
                            return var2_2.D((N)var16_9);
                        }
                        case 13: {
                            if (!var2_2.y("template")) {
                                var1_1 /* !! */  = var2_2.p;
                                var2_2.p = null;
                                if (var1_1 /* !! */  != null && var2_2.n((String)var11_11)) {
                                    var2_2.j(false);
                                    if (!var2_2.g((String)var11_11)) {
                                        var2_2.h(this);
                                    }
                                    var2_2.K((l)var1_1 /* !! */ );
                                    return true;
                                }
                                var2_2.h(this);
                                return false;
                            }
                            if (!var2_2.n((String)var11_11)) {
                                var2_2.h(this);
                                return false;
                            } else {
                                var2_2.j(false);
                                if (!var2_2.g((String)var11_11)) {
                                    var2_2.h(this);
                                }
                                var2_2.B((String)var11_11);
                                return true;
                            }
                        }
                        case 12: {
                            if (!var2_2.n("body")) {
                                var2_2.h(this);
                                return false;
                            } else {
                                this.d((N)var1_1 /* !! */ , (b)var2_2);
                                var2_2.l = B.s;
                                return true;
                            }
                        }
                        case 11: {
                            var1_1 /* !! */  = com.github.catvod.spider.merge.xc.G0.b.y;
                            var10_8 = var2_2.w;
                            var10_8[0] = var11_11;
                            if (!var2_2.p((String[])var10_8, var12_13, var1_1 /* !! */ )) {
                                var2_2.h(this);
                                return false;
                            } else {
                                var2_2.i((String)var11_11);
                                if (!var2_2.g((String)var11_11)) {
                                    var2_2.h(this);
                                }
                                var2_2.B((String)var11_11);
                                return true;
                            }
                        }
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: {
                            if (!var2_2.p(var13_5, var12_13, null)) {
                                var2_2.h(this);
                                return false;
                            } else {
                                var2_2.i((String)var11_11);
                                if (!var2_2.g((String)var11_11)) {
                                    var2_2.h(this);
                                }
                                var3_3 = var2_2.e.size() - 1;
                                while (var3_3 >= 0) {
                                    var1_1 /* !! */  = (l)var2_2.e.get(var3_3);
                                    var2_2.e.remove(var3_3);
                                    if (com.github.catvod.spider.merge.xc.E0.b.c(var1_1 /* !! */ .d.b, var13_5)) return true;
                                    --var3_3;
                                }
                                return true;
                            }
                        }
                        case 3: 
                        case 4: {
                            if (!var2_2.n((String)var11_11)) {
                                var2_2.h(this);
                                return false;
                            } else {
                                var2_2.i((String)var11_11);
                                if (!var2_2.g((String)var11_11)) {
                                    var2_2.h(this);
                                }
                                var2_2.B((String)var11_11);
                                return true;
                            }
                        }
                        case 2: {
                            var2_2.h(this);
                            var2_2.G("br");
                            return false;
                        }
                        case 1: {
                            if (!var2_2.m((String)var11_11)) {
                                var2_2.h(this);
                                var2_2.G((String)var11_11);
                                return var2_2.D((N)var16_9);
                            }
                            var2_2.i((String)var11_11);
                            if (!var2_2.g((String)var11_11)) {
                                var2_2.h(this);
                            }
                            var2_2.B((String)var11_11);
                            return true;
                        }
                        case 0: {
                            var2_2.E((N)var1_1 /* !! */ , (B)var15_4);
                            return true;
                        }
                    }
                }
                var12_14 = (L)var1_1 /* !! */ ;
                var17_27 = var12_14.c;
                var17_27.getClass();
                var11_12 = A.j;
                var16_10 = B.i;
                tmp = -1;
                switch (var17_27.hashCode()) {
                    case 2115613112: {
                        if (!var17_27.equals("noembed")) break;
                        tmp = 1;
                        break;
                    }
                    case 2091304424: {
                        if (!var17_27.equals("isindex")) break;
                        tmp = 2;
                        break;
                    }
                    case 1973234167: {
                        if (!var17_27.equals("plaintext")) break;
                        tmp = 3;
                        break;
                    }
                    case 181975684: {
                        if (!var17_27.equals("listing")) break;
                        tmp = 4;
                        break;
                    }
                    case 110115790: {
                        if (!var17_27.equals("table")) break;
                        tmp = 5;
                        break;
                    }
                    case 109548807: {
                        if (!var17_27.equals("small")) break;
                        tmp = 6;
                        break;
                    }
                    case 100358090: {
                        if (!var17_27.equals("input")) break;
                        tmp = 7;
                        break;
                    }
                    case 100313435: {
                        if (!var17_27.equals("image")) break;
                        tmp = 8;
                        break;
                    }
                    case 96620249: {
                        if (!var17_27.equals("embed")) break;
                        tmp = 9;
                        break;
                    }
                    case 3536714: {
                        if (!var17_27.equals("span")) break;
                        tmp = 10;
                        break;
                    }
                    case 3386833: {
                        if (!var17_27.equals("nobr")) break;
                        tmp = 11;
                        break;
                    }
                    case 3344136: {
                        if (!var17_27.equals("math")) break;
                        tmp = 12;
                        break;
                    }
                    case 3213227: {
                        if (!var17_27.equals("html")) break;
                        tmp = 13;
                        break;
                    }
                    case 3148996: {
                        if (!var17_27.equals("form")) break;
                        tmp = 14;
                        break;
                    }
                    case 3148879: {
                        if (!var17_27.equals("font")) break;
                        tmp = 15;
                        break;
                    }
                    case 3059181: {
                        if (!var17_27.equals("code")) break;
                        tmp = 16;
                        break;
                    }
                    case 3029410: {
                        if (!var17_27.equals("body")) break;
                        tmp = 17;
                        break;
                    }
                    case 3002509: {
                        if (!var17_27.equals("area")) break;
                        tmp = 18;
                        break;
                    }
                    case 118811: {
                        if (!var17_27.equals("xmp")) break;
                        tmp = 19;
                        break;
                    }
                    case 117511: {
                        if (!var17_27.equals("wbr")) break;
                        tmp = 20;
                        break;
                    }
                    case 114276: {
                        if (!var17_27.equals("svg")) break;
                        tmp = 21;
                        break;
                    }
                    case 111267: {
                        if (!var17_27.equals("pre")) break;
                        tmp = 22;
                        break;
                    }
                    case 104387: {
                        if (!var17_27.equals("img")) break;
                        tmp = 23;
                        break;
                    }
                    case 97536: {
                        if (!var17_27.equals("big")) break;
                        tmp = 24;
                        break;
                    }
                    case 3712: {
                        if (!var17_27.equals("tt")) break;
                        tmp = 25;
                        break;
                    }
                    case 3650: {
                        if (!var17_27.equals("rt")) break;
                        tmp = 26;
                        break;
                    }
                    case 3646: {
                        if (!var17_27.equals("rp")) break;
                        tmp = 27;
                        break;
                    }
                    case 3453: {
                        if (!var17_27.equals("li")) break;
                        tmp = 28;
                        break;
                    }
                    case 3338: {
                        if (!var17_27.equals("hr")) break;
                        tmp = 29;
                        break;
                    }
                    case 3278: {
                        if (!var17_27.equals("h6")) break;
                        tmp = 30;
                        break;
                    }
                    case 3277: {
                        if (!var17_27.equals("h5")) break;
                        tmp = 31;
                        break;
                    }
                    case 3276: {
                        if (!var17_27.equals("h4")) break;
                        tmp = 32;
                        break;
                    }
                    case 3275: {
                        if (!var17_27.equals("h3")) break;
                        tmp = 33;
                        break;
                    }
                    case 3274: {
                        if (!var17_27.equals("h2")) break;
                        tmp = 34;
                        break;
                    }
                    case 3273: {
                        if (!var17_27.equals("h1")) break;
                        tmp = 35;
                        break;
                    }
                    case 3240: {
                        if (!var17_27.equals("em")) break;
                        tmp = 36;
                        break;
                    }
                    case 3216: {
                        if (!var17_27.equals("dt")) break;
                        tmp = 37;
                        break;
                    }
                    case 3200: {
                        if (!var17_27.equals("dd")) break;
                        tmp = 38;
                        break;
                    }
                    case 3152: {
                        if (!var17_27.equals("br")) break;
                        tmp = 39;
                        break;
                    }
                    case 117: {
                        if (!var17_27.equals("u")) break;
                        tmp = 40;
                        break;
                    }
                    case 115: {
                        if (!var17_27.equals("s")) break;
                        tmp = 41;
                        break;
                    }
                    case 105: {
                        if (!var17_27.equals("i")) break;
                        tmp = 42;
                        break;
                    }
                    case 98: {
                        if (!var17_27.equals("b")) break;
                        tmp = 43;
                        break;
                    }
                    case 97: {
                        if (!var17_27.equals("a")) break;
                        tmp = 44;
                        break;
                    }
                    case -80773204: {
                        if (!var17_27.equals("optgroup")) break;
                        tmp = 45;
                        break;
                    }
                    case -891980137: {
                        if (!var17_27.equals("strong")) break;
                        tmp = 46;
                        break;
                    }
                    case -891985998: {
                        if (!var17_27.equals("strike")) break;
                        tmp = 47;
                        break;
                    }
                    case -906021636: {
                        if (!var17_27.equals("select")) break;
                        tmp = 48;
                        break;
                    }
                    case -1003243718: {
                        if (!var17_27.equals("textarea")) break;
                        tmp = 49;
                        break;
                    }
                    case -1010136971: {
                        if (!var17_27.equals("option")) break;
                        tmp = 50;
                        break;
                    }
                    case -1134665583: {
                        if (!var17_27.equals("keygen")) break;
                        tmp = 51;
                        break;
                    }
                    case -1191214428: {
                        if (!var17_27.equals("iframe")) break;
                        tmp = 52;
                        break;
                    }
                    case -1377687758: {
                        if (!var17_27.equals("button")) break;
                        tmp = 53;
                        break;
                    }
                    case -1644953643: {
                        if (!var17_27.equals("frameset")) break;
                        tmp = 54;
                        break;
                    }
                }
                switch (tmp) {
                    default: {
                        var3_3 = -1;
                        break;
                    }
                    case 1: {
                        var3_3 = 53;
                        break;
                    }
                    case 2: {
                        var3_3 = 52;
                        break;
                    }
                    case 3: {
                        var3_3 = 51;
                        break;
                    }
                    case 4: {
                        var3_3 = 50;
                        break;
                    }
                    case 5: {
                        var3_3 = 49;
                        break;
                    }
                    case 6: {
                        var3_3 = 48;
                        break;
                    }
                    case 7: {
                        var3_3 = 47;
                        break;
                    }
                    case 8: {
                        var3_3 = 46;
                        break;
                    }
                    case 9: {
                        var3_3 = 45;
                        break;
                    }
                    case 10: {
                        var3_3 = 44;
                        break;
                    }
                    case 11: {
                        var3_3 = 43;
                        break;
                    }
                    case 12: {
                        var3_3 = 42;
                        break;
                    }
                    case 13: {
                        var3_3 = 41;
                        break;
                    }
                    case 14: {
                        var3_3 = 40;
                        break;
                    }
                    case 15: {
                        var3_3 = 39;
                        break;
                    }
                    case 16: {
                        var3_3 = 38;
                        break;
                    }
                    case 17: {
                        var3_3 = 37;
                        break;
                    }
                    case 18: {
                        var3_3 = 36;
                        break;
                    }
                    case 19: {
                        var3_3 = 35;
                        break;
                    }
                    case 20: {
                        var3_3 = 34;
                        break;
                    }
                    case 21: {
                        var3_3 = 33;
                        break;
                    }
                    case 22: {
                        var3_3 = 32;
                        break;
                    }
                    case 23: {
                        var3_3 = 31;
                        break;
                    }
                    case 24: {
                        var3_3 = 30;
                        break;
                    }
                    case 25: {
                        var3_3 = 29;
                        break;
                    }
                    case 26: {
                        var3_3 = 28;
                        break;
                    }
                    case 27: {
                        var3_3 = 27;
                        break;
                    }
                    case 28: {
                        var3_3 = 26;
                        break;
                    }
                    case 29: {
                        var3_3 = 25;
                        break;
                    }
                    case 30: {
                        var3_3 = 24;
                        break;
                    }
                    case 31: {
                        var3_3 = 23;
                        break;
                    }
                    case 32: {
                        var3_3 = 22;
                        break;
                    }
                    case 33: {
                        var3_3 = 21;
                        break;
                    }
                    case 34: {
                        var3_3 = 20;
                        break;
                    }
                    case 35: {
                        var3_3 = 19;
                        break;
                    }
                    case 36: {
                        var3_3 = 18;
                        break;
                    }
                    case 37: {
                        var3_3 = 17;
                        break;
                    }
                    case 38: {
                        var3_3 = 16;
                        break;
                    }
                    case 39: {
                        var3_3 = 15;
                        break;
                    }
                    case 40: {
                        var3_3 = 14;
                        break;
                    }
                    case 41: {
                        var3_3 = 13;
                        break;
                    }
                    case 42: {
                        var3_3 = 12;
                        break;
                    }
                    case 43: {
                        var3_3 = 11;
                        break;
                    }
                    case 44: {
                        var3_3 = 10;
                        break;
                    }
                    case 45: {
                        var3_3 = 9;
                        break;
                    }
                    case 46: {
                        var3_3 = 8;
                        break;
                    }
                    case 47: {
                        var3_3 = 7;
                        break;
                    }
                    case 48: {
                        var3_3 = 6;
                        break;
                    }
                    case 49: {
                        var3_3 = 5;
                        break;
                    }
                    case 50: {
                        var3_3 = 4;
                        break;
                    }
                    case 51: {
                        var3_3 = 3;
                        break;
                    }
                    case 52: {
                        var3_3 = 2;
                        break;
                    }
                    case 53: {
                        var3_3 = 1;
                        break;
                    }
                    case 54: {
                        var3_3 = 0;
                    }
                }
                switch (var3_3) {
                    default: {
                        if (!E.j.containsKey(var17_27)) {
                            var2_2.r(var12_14);
                            return true;
                        }
                        if (com.github.catvod.spider.merge.xc.E0.b.c(var17_27, A.h)) {
                            if (var2_2.m("p")) {
                                var2_2.F("p");
                            }
                            var2_2.r(var12_14);
                            return true;
                        }
                        if (com.github.catvod.spider.merge.xc.E0.b.c(var17_27, A.g)) {
                            var2_2.g = var1_1 /* !! */ ;
                            return var15_4.c((N)var1_1 /* !! */ , (b)var2_2);
                        }
                        if (com.github.catvod.spider.merge.xc.E0.b.c(var17_27, (String[])var14_6)) {
                            var2_2.I();
                            var2_2.r(var12_14);
                            var2_2.q.add(null);
                            var2_2.u = false;
                            return true;
                        }
                        if (com.github.catvod.spider.merge.xc.E0.b.c(var17_27, A.m)) {
                            var2_2.u(var12_14);
                            return true;
                        } else {
                            if (com.github.catvod.spider.merge.xc.E0.b.c(var17_27, A.o)) {
                                var2_2.h(this);
                                return false;
                            }
                            var2_2.I();
                            var2_2.r(var12_14);
                        }
                        return true;
                    }
                    case 53: {
                        B.b(var12_14, (b)var2_2);
                        return true;
                    }
                    case 52: {
                        var2_2.h(this);
                        if (var2_2.p != null) return false;
                        var2_2.G("form");
                        var1_1 /* !! */  = var12_14.l;
                        if (var1_1 /* !! */  != null && var1_1 /* !! */ .g("action") != -1 && (var1_1 /* !! */  = var2_2.p) != null && (var10_8 = var12_14.l) != null && var10_8.g("action") != -1) {
                            var10_8 = var12_14.l.d("action");
                            var1_1 /* !! */ .d().k("action", (String)var10_8);
                        }
                        var2_2.G("hr");
                        var2_2.G("label");
                        var1_1 /* !! */  = var12_14.l;
                        var1_1 /* !! */  = var1_1 /* !! */  != null && var1_1 /* !! */ .g("prompt") != -1 ? var12_14.l.d("prompt") : "This is a searchable index. Enter search keywords: ";
                        var10_8 = new G();
                        var10_8.b = var1_1 /* !! */ ;
                        var2_2.D((N)var10_8);
                        var1_1 /* !! */  = new com.github.catvod.spider.merge.xc.F0.c();
                        if (var12_14.l()) {
                            var11_12 = var12_14.l;
                            var11_12.getClass();
                            var3_3 = 0;
                            while (true) {
                                if (var3_3 < var11_12.a && com.github.catvod.spider.merge.xc.F0.c.i(var11_12.b[var3_3])) {
                                    ++var3_3;
                                    continue;
                                }
                                if (var3_3 >= var11_12.a) break;
                                var10_8 = new com.github.catvod.spider.merge.xc.F0.a(var11_12.b[var3_3], (String)var11_12.c[var3_3], (com.github.catvod.spider.merge.xc.F0.c)var11_12);
                                var3_3 = var4_17 = var3_3 + 1;
                                if (com.github.catvod.spider.merge.xc.E0.b.c(var10_8.a, A.n)) continue;
                                var1_1 /* !! */ .j((com.github.catvod.spider.merge.xc.F0.a)var10_8);
                                var3_3 = var4_17;
                            }
                        }
                        var1_1 /* !! */ .k("name", "isindex");
                        var10_8 = var2_2.g;
                        var11_12 = var2_2.j;
                        if (var10_8 == var11_12) {
                            var10_8 = new L();
                            var10_8.b = "input";
                            var10_8.l = var1_1 /* !! */ ;
                            var10_8.c = com.github.catvod.spider.merge.xc.D0.b.u("input");
                            var2_2.D((N)var10_8);
                        } else {
                            var11_12.p();
                            var11_12.b = "input";
                            var11_12.l = var1_1 /* !! */ ;
                            var11_12.c = com.github.catvod.spider.merge.xc.D0.b.u("input");
                            var2_2.D((N)var11_12);
                        }
                        var2_2.F("label");
                        var2_2.G("hr");
                        var2_2.F("form");
                        return true;
                    }
                    case 51: {
                        if (var2_2.m("p")) {
                            var2_2.F("p");
                        }
                        var2_2.r(var12_14);
                        var2_2.c.o(g1.g);
                        return true;
                    }
                    case 49: {
                        if (var2_2.d.l != 2 && var2_2.m("p")) {
                            var2_2.F("p");
                        }
                        var2_2.r(var12_14);
                        var2_2.u = false;
                        var2_2.l = var16_10;
                        return true;
                    }
                    case 47: {
                        var2_2.I();
                        if (var2_2.u(var12_14).c("type").equalsIgnoreCase("hidden") != false) return true;
                        var2_2.u = false;
                        return true;
                    }
                    case 46: {
                        if (var2_2.l("svg") == null) {
                            var12_14.n("img");
                            return var2_2.D(var12_14);
                        }
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 44: {
                        var2_2.I();
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 43: {
                        var2_2.I();
                        if (var2_2.n("nobr")) {
                            var2_2.h(this);
                            var2_2.F("nobr");
                            var2_2.I();
                        }
                        var1_1 /* !! */  = var2_2.r(var12_14);
                        var2_2.b((l)var1_1 /* !! */ );
                        var2_2.q.add(var1_1 /* !! */ );
                        return true;
                    }
                    case 42: {
                        var2_2.I();
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 41: {
                        var2_2.h(this);
                        if (var2_2.y("template")) return false;
                        if (var2_2.e.size() <= 0) return true;
                        var1_1 /* !! */  = (l)var2_2.e.get(0);
                        if (var12_14.l() == false) return true;
                        var10_8 = var12_14.l;
                        var10_8.getClass();
                        var3_3 = 0;
                        while (true) {
                            if (var3_3 < var10_8.a && com.github.catvod.spider.merge.xc.F0.c.i(var10_8.b[var3_3])) {
                                ++var3_3;
                                continue;
                            }
                            if (var3_3 >= var10_8.a) return true;
                            var2_2 = new com.github.catvod.spider.merge.xc.F0.a(var10_8.b[var3_3], (String)var10_8.c[var3_3], (com.github.catvod.spider.merge.xc.F0.c)var10_8);
                            var3_3 = var4_18 = var3_3 + 1;
                            if (var1_1 /* !! */ .k(var2_2.a)) continue;
                            var1_1 /* !! */ .d().j((com.github.catvod.spider.merge.xc.F0.a)var2_2);
                            var3_3 = var4_18;
                        }
                    }
                    case 40: {
                        if (var2_2.p != null && !var2_2.y("template")) {
                            var2_2.h(this);
                            return false;
                        }
                        if (var2_2.m("p")) {
                            var2_2.i("p");
                            if (!"p".equals(var2_2.f().d.b)) {
                                var2_2.h(var2_2.l);
                            }
                            var2_2.B("p");
                        }
                        var2_2.v(var12_14, true, true);
                        return true;
                    }
                    case 37: {
                        var2_2.h(this);
                        var1_1 /* !! */  = var2_2.e;
                        if (var1_1 /* !! */ .size() == 1) return false;
                        if (var1_1 /* !! */ .size() > 2) {
                            if (((l)var1_1 /* !! */ .get((int)1)).d.b.equals("body") == false) return false;
                        }
                        if (var2_2.y("template")) return false;
                        var2_2.u = false;
                        if (var12_14.l() == false) return true;
                        var1_1 /* !! */  = var2_2.l("body");
                        if (var1_1 /* !! */  == null) return true;
                        var10_8 = var12_14.l;
                        var10_8.getClass();
                        var3_3 = 0;
                        while (true) {
                            if (var3_3 < var10_8.a && com.github.catvod.spider.merge.xc.F0.c.i(var10_8.b[var3_3])) {
                                ++var3_3;
                                continue;
                            }
                            if (var3_3 >= var10_8.a) return true;
                            var2_2 = new com.github.catvod.spider.merge.xc.F0.a(var10_8.b[var3_3], (String)var10_8.c[var3_3], (com.github.catvod.spider.merge.xc.F0.c)var10_8);
                            var3_3 = var4_19 = var3_3 + 1;
                            if (var1_1 /* !! */ .k(var2_2.a)) continue;
                            var1_1 /* !! */ .d().j((com.github.catvod.spider.merge.xc.F0.a)var2_2);
                            var3_3 = var4_19;
                        }
                    }
                    case 35: {
                        if (var2_2.m("p")) {
                            var2_2.F("p");
                        }
                        var2_2.I();
                        var2_2.u = false;
                        B.b(var12_14, (b)var2_2);
                        return true;
                    }
                    case 33: {
                        var2_2.I();
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 32: 
                    case 50: {
                        if (var2_2.m("p")) {
                            var2_2.F("p");
                        }
                        var2_2.r(var12_14);
                        var2_2.b.p("\n");
                        var2_2.u = false;
                        return true;
                    }
                    case 27: 
                    case 28: {
                        if (var2_2.n("ruby") == false) return true;
                        var2_2.j(false);
                        if (!var2_2.g("ruby")) {
                            var2_2.h(this);
                            for (var3_3 = var2_2.e.size() - 1; var3_3 >= 0 && !((l)var2_2.e.get((int)var3_3)).d.b.equals("ruby"); --var3_3) {
                                var2_2.e.remove(var3_3);
                            }
                        }
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 26: {
                        var2_2.u = false;
                        var13_5 = var2_2.e;
                        var1_1 /* !! */  = var11_12;
                        for (var3_3 = var13_5.size() - 1; var3_3 > 0; --var3_3) {
                            var11_12 = (l)var13_5.get(var3_3);
                            if (var11_12.d.b.equals("li")) {
                                var2_2.F("li");
                                break;
                            }
                            var11_12 = var11_12.d;
                            if (com.github.catvod.spider.merge.xc.E0.b.c(var11_12.b, (String[])var10_8) && !com.github.catvod.spider.merge.xc.E0.b.c(var11_12.b, var1_1 /* !! */ )) break;
                        }
                        if (var2_2.m("p")) {
                            var2_2.F("p");
                        }
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 25: {
                        if (var2_2.m("p")) {
                            var2_2.F("p");
                        }
                        var2_2.u(var12_14);
                        var2_2.u = false;
                        return true;
                    }
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: {
                        if (var2_2.m("p")) {
                            var2_2.F("p");
                        }
                        if (com.github.catvod.spider.merge.xc.E0.b.c(var2_2.f().d.b, var13_5)) {
                            var2_2.h(this);
                            var2_2.A();
                        }
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 16: 
                    case 17: {
                        var2_2.u = false;
                        var1_1 /* !! */  = var2_2.e;
                        var3_3 = var1_1 /* !! */ .size();
                        var4_20 = var3_3 - 1;
                        var3_3 = var4_20 >= 24 ? (var3_3 -= 25) : 0;
                        while (var4_20 >= var3_3) {
                            var13_5 = (l)var1_1 /* !! */ .get(var4_20);
                            var9_25 = com.github.catvod.spider.merge.xc.E0.b.c(var13_5.d.b, A.k);
                            var13_5 = var13_5.d;
                            if (var9_25) {
                                var2_2.F(var13_5.b);
                                break;
                            }
                            if (com.github.catvod.spider.merge.xc.E0.b.c(var13_5.b, (String[])var10_8) && !com.github.catvod.spider.merge.xc.E0.b.c(var13_5.b, (String[])var11_12)) break;
                            --var4_20;
                        }
                        if (var2_2.m("p")) {
                            var2_2.F("p");
                        }
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 10: {
                        if (var2_2.k("a") != null) {
                            var2_2.h(this);
                            var2_2.F("a");
                            var1_1 /* !! */  = var2_2.l("a");
                            if (var1_1 /* !! */  != null) {
                                var2_2.J((l)var1_1 /* !! */ );
                                var2_2.K((l)var1_1 /* !! */ );
                            }
                        }
                        var2_2.I();
                        var1_1 /* !! */  = var2_2.r(var12_14);
                        var2_2.b((l)var1_1 /* !! */ );
                        var2_2.q.add(var1_1 /* !! */ );
                        return true;
                    }
                    case 7: 
                    case 8: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 18: 
                    case 29: 
                    case 30: 
                    case 38: 
                    case 39: 
                    case 48: {
                        var2_2.I();
                        var1_1 /* !! */  = var2_2.r(var12_14);
                        var2_2.b((l)var1_1 /* !! */ );
                        var2_2.q.add(var1_1 /* !! */ );
                        return true;
                    }
                    case 6: {
                        var2_2.I();
                        var2_2.r(var12_14);
                        var2_2.u = false;
                        if (var12_14.k) return true;
                        var1_1 /* !! */  = var2_2.l;
                        var2_2.l = !(var1_1 /* !! */ .equals((Object)var16_10) || var1_1 /* !! */ .equals((Object)B.k) || var1_1 /* !! */ .equals((Object)B.m) || var1_1 /* !! */ .equals((Object)B.n) || var1_1 /* !! */ .equals((Object)B.o)) ? B.p : B.q;
                        return true;
                    }
                    case 5: {
                        var2_2.r(var12_14);
                        if (var12_14.k != false) return true;
                        var2_2.c.o(g1.c);
                        var2_2.m = var2_2.l;
                        var2_2.u = false;
                        var2_2.l = B.h;
                        return true;
                    }
                    case 4: 
                    case 9: {
                        if (var2_2.g("option")) {
                            var2_2.F("option");
                        }
                        var2_2.I();
                        var2_2.r(var12_14);
                        return true;
                    }
                    case 3: 
                    case 15: 
                    case 31: 
                    case 34: 
                    case 36: 
                    case 45: {
                        var2_2.I();
                        var2_2.u(var12_14);
                        var2_2.u = false;
                        return true;
                    }
                    case 2: {
                        var2_2.u = false;
                        B.b(var12_14, (b)var2_2);
                        return true;
                    }
                    case 1: {
                        if (var2_2.m("button")) {
                            var2_2.h(this);
                            var2_2.F("button");
                            var2_2.D(var12_14);
                            return true;
                        } else {
                            var2_2.I();
                            var2_2.r(var12_14);
                            var2_2.u = false;
                        }
                        return true;
                    }
                    case 0: {
                        var2_2.h(this);
                        var10_8 = var2_2.e;
                        if (var10_8.size() == 1) return false;
                        if ((var10_8.size() <= 2 || ((l)var10_8.get((int)1)).d.b.equals("body")) && var2_2.u) break block311;
                    }
                }
                return false;
            }
            var1_1 /* !! */  = (l)var10_8.get(1);
            if ((l)var1_1 /* !! */ .a != null) {
                var1_1 /* !! */ .u();
            }
            while (var10_8.size() > 1) {
                var10_8.remove(var10_8.size() - 1);
            }
            var2_2.r(var12_14);
            var2_2.l = B.t;
            return true;
        }
        while (var5_15 < 8) {
            var18_28 = var2_2.k((String)var13_5);
            if (var18_28 == null) {
                return this.d((N)var1_1 /* !! */ , (b)var2_2);
            }
            if (!com.github.catvod.spider.merge.xc.G0.b.z(var2_2.e, var18_28)) {
                var2_2.h(this);
                var2_2.J(var18_28);
                return true;
            }
            var19_29 = var18_28.d;
            if (var2_2.n(var19_29.b)) {
                if (var2_2.f() != var18_28) {
                    var2_2.h(this);
                }
            } else {
                var2_2.h(this);
                return false;
            }
            var8_23 = var12_13.size();
            var7_22 = false;
            var3_3 = -1;
            var4_16 = 1;
            var16_9 = null;
            block204: while (true) {
                block316: {
                    block308: {
                        block314: {
                            block317: {
                                block312: {
                                    block315: {
                                        block313: {
                                            if (var4_16 >= var8_23 || var4_16 >= 64) break block312;
                                            var14_6 = (l)var12_13.get(var4_16);
                                            if (var14_6 != var18_28) break block313;
                                            var11_11 = (l)var12_13.get(var4_16 - 1);
                                            break block314;
                                        }
                                        if (!var7_22) break block315;
                                        var6_21 = var3_3;
                                        var11_11 = var16_9;
                                        if (!com.github.catvod.spider.merge.xc.E0.b.c(var14_6.d.b, (String[])var10_8)) break block316;
                                        var11_11 = var14_6;
                                        break block317;
                                    }
                                    var6_21 = var3_3;
                                    var11_11 = var16_9;
                                    break block316;
                                }
                                var11_11 = null;
                            }
                            if (var11_11 == null) {
                                var2_2.B(var19_29.b);
                                var2_2.J(var18_28);
                                return true;
                            }
                            var17_26 = var15_4 = var11_11;
                            for (var4_16 = 0; var4_16 < 3; ++var4_16) {
                                var14_6 = var15_4;
                                if (com.github.catvod.spider.merge.xc.G0.b.z(var2_2.e, (l)var15_4)) {
                                    var14_6 = var2_2.a((l)var15_4);
                                }
                                if (!com.github.catvod.spider.merge.xc.G0.b.z(var2_2.q, (l)var14_6)) {
                                    var2_2.K((l)var14_6);
                                } else {
                                    if (var14_6 == var18_28) break block204;
                                    var15_4 = new l(var2_2.N(var14_6.o(), D.d), var2_2.f, null);
                                    var20_30 = var2_2.q;
                                    var6_21 = var20_30.lastIndexOf(var14_6);
                                    var9_24 = var6_21 != -1;
                                    com.github.catvod.spider.merge.xc.D0.b.r(var9_24);
                                    var20_30.set(var6_21, var15_4);
                                    var20_30 = var2_2.e;
                                    var6_21 = var20_30.lastIndexOf(var14_6);
                                    var9_24 = var6_21 != -1;
                                    com.github.catvod.spider.merge.xc.D0.b.r(var9_24);
                                    var20_30.set(var6_21, var15_4);
                                    if (var17_26 == var11_11) {
                                        block307: {
                                            for (var3_3 = 0; var3_3 < var2_2.q.size(); ++var3_3) {
                                                if (var15_4 != var2_2.q.get(var3_3)) {
                                                    continue;
                                                }
                                                break block307;
                                            }
                                            var3_3 = -1;
                                        }
                                        ++var3_3;
                                    }
                                    if ((l)var17_26.a != null) {
                                        var17_26.u();
                                    }
                                    var15_4.y((q)var17_26);
                                    var17_26 = var14_6 = var15_4;
                                }
                                var15_4 = var14_6;
                            }
                            break;
                        }
                        for (var3_3 = 0; var3_3 < var2_2.q.size(); ++var3_3) {
                            if (var14_6 != var2_2.q.get(var3_3)) {
                                continue;
                            }
                            break block308;
                        }
                        var3_3 = -1;
                    }
                    var7_22 = true;
                    var6_21 = var3_3;
                }
                ++var4_16;
                var3_3 = var6_21;
                var16_9 = var11_11;
            }
            if (var16_9 != null) {
                if (com.github.catvod.spider.merge.xc.E0.b.c(var16_9.d.b, A.r)) {
                    if ((l)var17_26.a != null) {
                        var17_26.u();
                    }
                    var2_2.w((q)var17_26);
                } else {
                    if ((l)var17_26.a != null) {
                        var17_26.u();
                    }
                    var16_9.y((q)var17_26);
                }
            }
            var16_9 = new l((E)var19_29, var2_2.f, null);
            var17_26 = var16_9.d();
            var20_30 = var18_28.d();
            var17_26.getClass();
            var4_16 = var20_30.a;
            if (var4_16 != 0) {
                var17_26.b(var17_26.a + var4_16);
                var6_21 = var17_26.a != 0 ? 1 : 0;
                var4_16 = 0;
                while (true) {
                    if (var4_16 < var20_30.a && com.github.catvod.spider.merge.xc.F0.c.i(var20_30.b[var4_16])) {
                        ++var4_16;
                        continue;
                    }
                    if (var4_16 >= var20_30.a) break;
                    var14_6 = new com.github.catvod.spider.merge.xc.F0.a(var20_30.b[var4_16], (String)var20_30.c[var4_16], (com.github.catvod.spider.merge.xc.F0.c)var20_30);
                    ++var4_16;
                    if (var6_21 != 0) {
                        var17_26.j((com.github.catvod.spider.merge.xc.F0.a)var14_6);
                        continue;
                    }
                    var19_29 = var14_6.a;
                    var14_6 = var15_4 = var14_6.b;
                    if (var15_4 == null) {
                        var14_6 = "";
                    }
                    var17_26.a(var14_6, (String)var19_29);
                }
            }
            if (var11_11.f() == 0) {
                var14_6 = com.github.catvod.spider.merge.xc.F0.q.c;
            } else {
                var14_6 = var11_11.j();
                var15_4 = new ArrayList<E>(var14_6.size());
                var15_4.addAll(var14_6);
                var14_6 = Collections.unmodifiableList(var15_4);
            }
            if (var14_6 == null) throw new c("Children collection to be inserted must not be null.");
            var6_21 = var16_9.f.size();
            var4_16 = var6_21 >= 0 ? 1 : 0;
            if (var4_16 == 0) throw new c("Insert position out of bounds.");
            var16_9.b(var6_21, new ArrayList<E>(var14_6).toArray(new q[0]));
            var11_11.y((q)var16_9);
            var2_2.J(var18_28);
            var2_2.b((l)var16_9);
            try {
                var2_2.q.add(var3_3, var16_9);
            }
            catch (IndexOutOfBoundsException var14_7) {
                var2_2.q.add(var16_9);
            }
            var2_2.K(var18_28);
            var3_3 = var2_2.e.lastIndexOf(var11_11);
            var9_24 = var3_3 != -1;
            com.github.catvod.spider.merge.xc.D0.b.r(var9_24);
            var2_2.e.add(var3_3 + 1, var16_9);
            ++var5_15;
        }
        return true;
    }

    public final boolean d(N object, b b2) {
        object.getClass();
        String string = ((K)object).c;
        object = b2.e;
        if (b2.l(string) == null) {
            b2.h(this);
            return false;
        }
        for (int i2 = ((ArrayList)object).size() - 1; i2 >= 0; --i2) {
            l l2 = (l)((ArrayList)object).get(i2);
            if (l2.d.b.equals(string)) {
                b2.i(string);
                if (!b2.g(string)) {
                    b2.h(this);
                }
                b2.B(string);
                break;
            }
            if (!com.github.catvod.spider.merge.xc.E0.b.c(l2.d.b, com.github.catvod.spider.merge.xc.G0.b.E)) continue;
            b2.h(this);
            return false;
        }
        return true;
    }
}

