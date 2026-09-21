/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.thegrizzlylabs.sardineandroid.DavResource
 */
package com.github.catvod.spider.merge.V;

import com.thegrizzlylabs.sardineandroid.DavResource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public final class c
implements Comparator<DavResource> {
    private final String a;
    private final String b;

    public c(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static void a(String string, String string2, List<DavResource> list) {
        Collections.sort(list, new c(string, string2));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int compare(Object var1_1, Object var2_2) {
        block12: {
            block10: {
                block11: {
                    var1_1 = (DavResource)var1_1;
                    var8_3 = (DavResource)var2_2;
                    var5_4 = this.b.equals("asc");
                    var2_2 = this.a;
                    Objects.requireNonNull(var2_2);
                    var3_5 = var2_2.hashCode();
                    var4_6 = -1;
                    if (var3_5 == 3076014) break block10;
                    if (var3_5 == 3373707) break block11;
                    if (var3_5 != 3530753 || !var2_2.equals("size")) ** GOTO lbl-1000
                    var3_5 = 2;
                    break block12;
                }
                if (!var2_2.equals("name")) ** GOTO lbl-1000
                var3_5 = 1;
                break block12;
            }
            if (!var2_2.equals("date")) lbl-1000:
            // 3 sources

            {
                var3_5 = -1;
            } else {
                var3_5 = 0;
            }
        }
        if (var3_5 != 0) {
            if (var3_5 != 1) {
                if (var3_5 != 2) {
                    var3_5 = var4_6;
                } else {
                    if (var5_4) {
                        var6_7 = var1_1.getContentLength();
                        var1_1 = var8_3.getContentLength();
                    } else {
                        var6_7 = var8_3.getContentLength();
                        var1_1 = var1_1.getContentLength();
                    }
                    var3_5 = Long.compare(var6_7, var1_1.longValue());
                }
            } else {
                var3_5 = var5_4 ? var1_1.getName().compareTo(var8_3.getName()) : var8_3.getName().compareTo(var1_1.getName());
            }
        } else {
            var3_5 = var5_4 ? var1_1.getModified().compareTo(var8_3.getModified()) : var8_3.getModified().compareTo(var1_1.getModified());
        }
        return var3_5;
    }
}

