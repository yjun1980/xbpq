/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.G;
import com.github.catvod.spider.merge.E1.M;
import com.github.catvod.spider.merge.E1.b;
import com.github.catvod.spider.merge.E1.g;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.p1.j;
import java.util.AbstractMap;
import java.util.function.Function;

public final class A
implements Function {
    public final j a;

    public /* synthetic */ A(j j2) {
        this.a = j2;
    }

    public final Object apply(Object object) {
        block1: {
            block4: {
                block5: {
                    j j2;
                    block3: {
                        block2: {
                            block0: {
                                j2 = this.a;
                                if (!((AbstractMap)(object = (e)object)).containsKey("compactVideoRenderer")) break block0;
                                object = new G(((e)object).g("compactVideoRenderer"), j2);
                                break block1;
                            }
                            if (!((AbstractMap)object).containsKey("compactRadioRenderer")) break block2;
                            object = new b(((e)object).g("compactRadioRenderer"));
                            break block1;
                        }
                        if (!((AbstractMap)object).containsKey("compactPlaylistRenderer")) break block3;
                        object = new b(((e)object).g("compactPlaylistRenderer"));
                        break block1;
                    }
                    if (!((AbstractMap)object).containsKey("lockupViewModel")) break block4;
                    String string = ((e)(object = ((e)object).g("lockupViewModel"))).i("contentType", null);
                    if ("LOCKUP_CONTENT_TYPE_PLAYLIST".equals(string) || "LOCKUP_CONTENT_TYPE_PODCAST".equals(string)) break block5;
                    if (!"LOCKUP_CONTENT_TYPE_VIDEO".equals(string)) break block4;
                    object = new M((e)object, j2);
                    break block1;
                }
                object = new g((e)object);
                break block1;
            }
            object = null;
        }
        return object;
    }
}

