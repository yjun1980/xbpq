/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.u0.a;
import com.github.catvod.spider.merge.w0.e;
import com.github.catvod.spider.merge.w0.g;
import com.github.catvod.spider.merge.w0.h;
import java.util.ArrayList;
import java.util.List;

public final class j
extends a
implements g {
    private long g;
    private List<String> h;
    private List<String> i;

    /*
     * Unable to fully structure code
     */
    public j(com.github.catvod.spider.merge.y.e var1_1, boolean var2_3) {
        block33: {
            block38: {
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                super((com.github.catvod.spider.merge.y.e)var1_1);
                                var11_4 = var1_1.containsKey("lengthText");
                                var5_5 = 0;
                                if (var11_4) {
                                    block32: {
                                        block30: {
                                            block31: {
                                                var12_6 = var1_1.u("lengthText").x("simpleText");
                                                if (var12_6.length() <= 2) break block30;
                                                if (var12_6.length() > 5) {
                                                    var3_9 = var12_6.indexOf(58);
                                                    var4_10 = Integer.parseInt(var12_6.substring(0, var3_9)) * 3600 + 0;
                                                    ++var3_9;
                                                    break block31;
                                                }
                                                var3_9 = 0;
                                                var4_10 = 0;
                                            }
                                            var6_11 = var12_6.indexOf(58, var3_9);
                                            var3_9 = Integer.parseInt(var12_6.substring(var3_9, var6_11)) * 60 + var4_10;
                                            var4_10 = var6_11 + 1;
                                            break block32;
                                        }
                                        var3_9 = 0;
                                        var4_10 = 0;
                                    }
                                    try {
                                        var4_10 = Integer.parseInt(var12_6.substring(var4_10));
                                        var3_9 += var4_10;
                                    }
                                    catch (ArrayIndexOutOfBoundsException | NumberFormatException var12_7) {
                                        var3_9 = -1;
                                    }
                                    this.c = var3_9;
                                }
                                if (!var2_3) break block34;
                                var12_6 = var1_1.u("descriptionSnippet");
                                break block35;
                            }
                            if (!var1_1.containsKey("detailedMetadataSnippets")) break block36;
                            var12_6 = var1_1.t("detailedMetadataSnippets").p(0).u("snippetText");
                        }
                        com.github.catvod.spider.merge.g.a.b((com.github.catvod.spider.merge.y.e)var12_6);
                    }
                    if (!var1_1.containsKey("upcomingEventData")) break block37;
                    Long.parseLong(var1_1.u("upcomingEventData").x("startTime"));
                    break block38;
                }
                if (!var1_1.containsKey("viewCountText")) break block33;
                var12_6 = var1_1.u("viewCountText");
                if (var12_6.containsKey("simpleText")) {
                    var12_6 = var12_6.x("simpleText");
                    var7_13 = var9_12 = 0L;
                    if (var12_6 != null) {
                        if (var12_6.isEmpty()) {
                            var7_13 = var9_12;
                        } else {
                            var12_6 = var12_6.replaceAll("[^0-9]", "");
                            var7_13 = var9_12;
                            if (!var12_6.isEmpty()) {
                                var7_13 = Long.parseLong((String)var12_6);
                            }
                        }
                    }
lbl61:
                    // 7 sources

                    while (true) {
                        this.g = var7_13;
                        break block33;
                        break;
                    }
                }
                if (!var12_6.containsKey("runs")) break block33;
                com.github.catvod.spider.merge.g.a.b((com.github.catvod.spider.merge.y.e)var12_6);
            }
            this.g = -1L;
        }
        if (var1_1.containsKey("badges")) {
            var12_6 = var1_1.t("badges");
            this.h = new ArrayList<String>(var12_6.size());
            for (var3_9 = 0; var3_9 < var12_6.size(); ++var3_9) {
                var13_14 = var12_6.p(var3_9);
                if (!var13_14.containsKey("metadataBadgeRenderer")) continue;
                this.h.add(var13_14.u("metadataBadgeRenderer").x("label"));
            }
        }
        if (var1_1.containsKey("richThumbnail")) {
            var1_1 = var1_1.u("richThumbnail").u("movingThumbnailRenderer").u("movingThumbnailDetails").t("thumbnails");
            this.i = var12_6 = new ArrayList(var1_1.size());
            var3_9 = var5_5;
            while (true) {
                if (var3_9 >= var1_1.size()) break;
                this.i.add(var1_1.p(var3_9).x("url"));
                ++var3_9;
                continue;
                break;
            }
        }
lbl91:
        // 4 sources

        return;
        catch (NumberFormatException var12_8) {
            var7_13 = var9_12;
            ** continue;
        }
        catch (NullPointerException var1_2) {
            ** continue;
        }
    }

    @Override
    public final j a() {
        return this;
    }

    @Override
    public final boolean b() {
        boolean bl = this.g == -1L;
        return bl;
    }

    @Override
    public final int d() {
        return 1;
    }

    @Override
    public final e f() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final h g() {
        throw new UnsupportedOperationException();
    }

    public final List<String> j() {
        return this.i;
    }
}

