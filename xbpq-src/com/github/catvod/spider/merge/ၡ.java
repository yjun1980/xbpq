/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u08a1;
import com.github.catvod.spider.merge.\u08aa;
import com.github.catvod.spider.merge.\u08b4;
import com.github.catvod.spider.merge.\u08bc;
import com.github.catvod.spider.merge.\u1065;
import com.github.catvod.spider.merge.\u1075;
import com.github.catvod.spider.merge.\u1078;
import com.github.catvod.spider.merge.\u10cd;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;

public abstract class \u1061 {
    public static final \u08bc \u037f = new \u08bc();
    public static int \u0528 = 0;
    public final int \u0529;
    public final int \u052a;

    protected \u1061(int n2) {
        int n3 = \u0528;
        \u0528 = n3 + 1;
        this.\u0529 = n3;
        this.\u052a = n2;
    }

    protected static int \u037f() {
        return \u02c6.\u037f(\u02c6.\u052a(1), 0);
    }

    protected static int \u0528(\u1061 \u10612, int n2) {
        return \u02c6.\u037f(\u02c6.\u052b(\u02c6.\u052c(\u02c6.\u052a(1), \u10612), n2), 2);
    }

    protected static int \u0529(\u1061[] \u1061Array, int[] nArray) {
        int n2;
        int n3 = \u02c6.\u052a(1);
        int n4 = \u1061Array.length;
        int n5 = 0;
        for (n2 = 0; n2 < n4; ++n2) {
            n3 = \u02c6.\u052c(n3, \u1061Array[n2]);
        }
        n4 = nArray.length;
        for (n2 = n5; n2 < n4; ++n2) {
            n3 = \u02c6.\u052b(n3, nArray[n2]);
        }
        return \u02c6.\u037f(n3, \u1061Array.length * 2);
    }

    protected static void \u052a(\u1061[] \u1061Array) {
        HashMap<\u1061, \u1061> hashMap = new HashMap<\u1061, \u1061>();
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= \u1061Array.length) break;
            \u1061 \u10612 = \u1061Array[n3];
            if (!hashMap.containsKey(\u10612)) {
                hashMap.put(\u10612, \u10612);
            }
            ++n3;
        }
        for (int i2 = n2; i2 < \u1061Array.length; ++i2) {
            \u1061Array[i2] = (\u1061)hashMap.get(\u1061Array[i2]);
        }
    }

    public static \u1061 \u052b(\u08aa \u08aa2, \u08a1 \u08a12) {
        \u08a1 \u08a13 = \u08a12;
        if (\u08a12 == null) {
            \u08a13 = \u08a1.\u037f;
        }
        if ((\u08a12 = \u08a13.\u0528) != null && \u08a13 != \u08a1.\u037f) {
            return \u1078.\u0784(\u1061.\u052b(\u08aa2, \u08a12), ((\u1075)\u08aa2.\u037f.get((int)\u08a13.\u0529).\u052e((int)0)).\u052c.\u0529);
        }
        return \u037f;
    }

    public static \u1061 \u052c(\u1061 \u10612, \u1065 \u10652, IdentityHashMap<\u1061, \u1061> identityHashMap) {
        if (\u10612.\u058f()) {
            return \u10612;
        }
        Object object = identityHashMap.get(\u10612);
        if (object != null) {
            return object;
        }
        object = \u10652.\u0528(\u10612);
        if (object != null) {
            identityHashMap.put(\u10612, (\u1061)object);
            return object;
        }
        object = new \u1061[\u10612.\u0783()];
        int n2 = 0;
        for (int i2 = 0; i2 < ((\u1061[])object).length; ++i2) {
            int n3;
            \u1061[] \u1061Array;
            block11: {
                \u1061 \u10613;
                block10: {
                    \u10613 = \u1061.\u052c(\u10612.\u052d(i2), \u10652, identityHashMap);
                    if (n2 != 0) break block10;
                    \u1061Array = object;
                    n3 = n2;
                    if (\u10613 == \u10612.\u052d(i2)) break block11;
                }
                n3 = n2;
                if (n2 == 0) {
                    object = new \u1061[\u10612.\u0783()];
                    for (n2 = 0; n2 < \u10612.\u0783(); ++n2) {
                        object[n2] = \u10612.\u052d(n2);
                    }
                    n3 = 1;
                }
                object[i2] = \u10613;
                \u1061Array = object;
            }
            object = \u1061Array;
            n2 = n3;
        }
        if (n2 == 0) {
            \u10652.\u037f(\u10612);
            identityHashMap.put(\u10612, \u10612);
            return \u10612;
        }
        object = ((\u1061[])object).length == 0 ? \u037f : (((\u1061[])object).length == 1 ? \u1078.\u0784(object[0], \u10612.\u052e(0)) : new \u08b4((\u1061[])object, ((\u08b4)\u10612).\u052c));
        \u10652.\u037f((\u1061)object);
        identityHashMap.put((\u1061)object, (\u1061)object);
        identityHashMap.put(\u10612, (\u1061)object);
        return object;
    }

    public static \u1061 \u0620(\u1061 \u10612, \u1061 \u10613, boolean bl, \u10cd<\u1061, \u1061, \u1061> \u2d2d) {
        \u1061 \u10614 = \u10612;
        if (\u10612 != \u10613) {
            if (\u10612.equals(\u10613)) {
                \u10614 = \u10612;
            } else {
                boolean bl2 = \u10612 instanceof \u1078;
                if (bl2 && \u10613 instanceof \u1078) {
                    return \u1061.\u0782((\u1078)\u10612, (\u1078)\u10613, bl, \u2d2d);
                }
                if (bl) {
                    if (\u10612 instanceof \u08bc) {
                        return \u10612;
                    }
                    if (\u10613 instanceof \u08bc) {
                        return \u10613;
                    }
                }
                \u10614 = \u10612;
                if (bl2) {
                    \u10614 = new \u08b4((\u1078)\u10612);
                }
                \u10612 = \u10613;
                if (\u10613 instanceof \u1078) {
                    \u10612 = new \u08b4((\u1078)\u10613);
                }
                \u10614 = \u1061.\u0780((\u08b4)\u10614, (\u08b4)\u10612, bl, \u2d2d);
            }
        }
        return \u10614;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static \u1061 \u0780(\u08b4 var0, \u08b4 var1_1, boolean var2_2, \u10cd<\u1061, \u1061, \u1061> var3_3) {
        if (var3_3 != null) {
            var11_4 /* !! */  = var3_3.\u037f(var0, var1_1);
            if (var11_4 /* !! */  != null) {
                return var11_4 /* !! */ ;
            }
            var11_4 /* !! */  = var3_3.\u037f(var1_1, var0);
            if (var11_4 /* !! */  != null) {
                return var11_4 /* !! */ ;
            }
        }
        var12_5 /* !! */  = var0.\u052c;
        var4_6 = var12_5 /* !! */ .length;
        var11_4 /* !! */  = (\u1061[])var1_1.\u052c;
        var13_7 = new int[var4_6 + var11_4 /* !! */ .length];
        var9_8 = var12_5 /* !! */ .length + var11_4 /* !! */ .length;
        var14_9 = new \u1061[var9_8];
        var5_10 = 0;
        var6_11 = 0;
        var4_6 = 0;
        while (true) {
            block22: {
                var15_15 = var0.\u052c;
                var7_12 = var15_15.length;
                var8_13 = true;
                if (var5_10 >= var7_12 || var6_11 >= (var12_5 /* !! */  = var1_1.\u052c).length) break;
                var16_16 = var0.\u052b[var5_10];
                var11_4 /* !! */  = var1_1.\u052b[var6_11];
                if (var15_15[var5_10] != var12_5 /* !! */ [var6_11]) break block22;
                var10_14 = var15_15[var5_10];
                var7_12 = var10_14 == 0x7FFFFFFF && var16_16 == null && var11_4 /* !! */  == null ? 1 : 0;
                if (var16_16 == null || var11_4 /* !! */  == null || !var16_16.equals(var11_4 /* !! */ )) {
                    var8_13 = false;
                }
                if (var7_12 == 0 && !var8_13) {
                    var14_9[var4_6] = \u1061.\u0620(var16_16, (\u1061)var11_4 /* !! */ , var2_2, var3_3);
                    var13_7[var4_6] = var10_14;
                } else {
                    var14_9[var4_6] = var16_16;
                    var13_7[var4_6] = var10_14;
                }
                ++var5_10;
                ** GOTO lbl45
            }
            if (var15_15[var5_10] < var12_5 /* !! */ [var6_11]) {
                var14_9[var4_6] = var16_16;
                var13_7[var4_6] = var15_15[var5_10];
                ++var5_10;
            } else {
                var14_9[var4_6] = var11_4 /* !! */ ;
                var13_7[var4_6] = var12_5 /* !! */ [var6_11];
lbl45:
                // 2 sources

                ++var6_11;
            }
            ++var4_6;
        }
        var7_12 = var6_11;
        var6_11 = var4_6;
        if (var5_10 < var15_15.length) {
            var6_11 = var5_10;
            while (true) {
                var11_4 /* !! */  = (\u1061[])var0.\u052c;
                var5_10 = ++var4_6;
                if (var6_11 < var11_4 /* !! */ .length) {
                    var14_9[var4_6] = var0.\u052b[var6_11];
                    var13_7[var4_6] = (int)var11_4 /* !! */ [var6_11];
                    ++var6_11;
                    continue;
                }
                break;
            }
        } else {
            while (true) {
                var11_4 /* !! */  = (\u1061[])var1_1.\u052c;
                var5_10 = ++var6_11;
                if (var7_12 >= var11_4 /* !! */ .length) break;
                var14_9[var6_11] = var1_1.\u052b[var7_12];
                var13_7[var6_11] = (int)var11_4 /* !! */ [var7_12];
                ++var7_12;
            }
        }
        var12_5 /* !! */  = var13_7;
        var11_4 /* !! */  = var14_9;
        if (var5_10 < var9_8) {
            if (var5_10 == 1) {
                var11_4 /* !! */  = \u1078.\u0784(var14_9[0], var13_7[0]);
                if (var3_3 != null) {
                    var3_3.\u0528(var0, var1_1, (\u1061)var11_4 /* !! */ );
                }
                return var11_4 /* !! */ ;
            }
            var11_4 /* !! */  = Arrays.copyOf(var14_9, var5_10);
            var12_5 /* !! */  = Arrays.copyOf(var13_7, var5_10);
        }
        if ((var12_5 /* !! */  = (int[])new \u08b4(var11_4 /* !! */ , var12_5 /* !! */ )).equals(var0)) {
            if (var3_3 != null) {
                var3_3.\u0528(var0, var1_1, var0);
            }
            return var0;
        }
        if (var12_5 /* !! */ .equals(var1_1)) {
            if (var3_3 != null) {
                var3_3.\u0528(var0, var1_1, var1_1);
            }
            return var1_1;
        }
        \u1061.\u052a(var11_4 /* !! */ );
        if (var3_3 != null) {
            var3_3.\u0528(var0, var1_1, (\u1061)var12_5 /* !! */ );
        }
        return var12_5 /* !! */ ;
    }

    public static \u1061 \u0781(\u1078 \u10782, \u1078 \u10783, boolean bl) {
        if (bl) {
            \u08bc \u08bc2 = \u037f;
            if (\u10782 == \u08bc2) {
                return \u08bc2;
            }
            if (\u10783 == \u08bc2) {
                return \u08bc2;
            }
        } else {
            \u08bc \u08bc3 = \u037f;
            if (\u10782 == \u08bc3 && \u10783 == \u08bc3) {
                return \u08bc3;
            }
            if (\u10782 == \u08bc3) {
                int n2 = \u10783.\u052c;
                return new \u08b4(new \u1061[]{\u10783.\u052b, null}, new int[]{n2, Integer.MAX_VALUE});
            }
            if (\u10783 == \u08bc3) {
                int n3 = \u10782.\u052c;
                return new \u08b4(new \u1061[]{\u10782.\u052b, null}, new int[]{n3, Integer.MAX_VALUE});
            }
        }
        return null;
    }

    public static \u1061 \u0782(\u1078 \u10782, \u1078 \u10783, boolean bl, \u10cd<\u1061, \u1061, \u1061> \u2d2d) {
        \u1061 \u10612;
        Object object;
        Object object2;
        Object object3;
        block18: {
            block17: {
                if (\u2d2d != null) {
                    object3 = \u2d2d.\u037f(\u10782, \u10783);
                    if (object3 != null) {
                        return object3;
                    }
                    object3 = \u2d2d.\u037f(\u10783, \u10782);
                    if (object3 != null) {
                        return object3;
                    }
                }
                if ((object3 = \u1061.\u0781(\u10782, \u10783, bl)) != null) {
                    if (\u2d2d != null) {
                        \u2d2d.\u0528(\u10782, \u10783, (\u1061)object3);
                    }
                    return object3;
                }
                if (\u10782.\u052c == \u10783.\u052c) {
                    object3 = \u1061.\u0620(\u10782.\u052b, \u10783.\u052b, bl, \u2d2d);
                    if (object3 == \u10782.\u052b) {
                        return \u10782;
                    }
                    if (object3 == \u10783.\u052b) {
                        return \u10783;
                    }
                    object3 = \u1078.\u0784((\u1061)object3, \u10782.\u052c);
                    if (\u2d2d != null) {
                        \u2d2d.\u0528(\u10782, \u10783, (\u1061)object3);
                    }
                    return object3;
                }
                object2 = null;
                if (\u10782 == \u10783) break block17;
                object = \u10782.\u052b;
                object3 = object2;
                if (object == null) break block18;
                object3 = object2;
                if (!((\u1061)object).equals(\u10783.\u052b)) break block18;
            }
            object3 = \u10782.\u052b;
        }
        if (object3 != null) {
            int n2 = \u10782.\u052c;
            int n3 = \u10783.\u052c;
            object2 = new int[]{n2, n3};
            if (n2 > n3) {
                object2[0] = n3;
                object2[1] = n2;
            }
            object3 = new \u08b4(new \u1061[]{object3, object3}, (int[])object2);
            if (\u2d2d != null) {
                \u2d2d.\u0528(\u10782, \u10783, (\u1061)object3);
            }
            return object3;
        }
        object = new int[2];
        int n4 = \u10782.\u052c;
        object[0] = n4;
        int n5 = \u10783.\u052c;
        object[1] = n5;
        object3 = new \u1061[2];
        object3[0] = \u10612 = \u10782.\u052b;
        object2 = \u10783.\u052b;
        object3[1] = object2;
        if (n4 > n5) {
            object[0] = n5;
            object[1] = n4;
            object3 = new \u1061[]{object2, \u10612};
        }
        object3 = new \u08b4((\u1061[])object3, (int[])object);
        if (\u2d2d != null) {
            \u2d2d.\u0528(\u10782, \u10783, (\u1061)object3);
        }
        return object3;
    }

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        return this.\u052a;
    }

    public abstract \u1061 \u052d(int var1);

    public abstract int \u052e(int var1);

    public boolean \u052f() {
        int n2 = this.\u0783();
        boolean bl = true;
        if (this.\u052e(n2 - 1) != Integer.MAX_VALUE) {
            bl = false;
        }
        return bl;
    }

    public boolean \u058f() {
        boolean bl = this == \u037f;
        return bl;
    }

    public abstract int \u0783();
}

