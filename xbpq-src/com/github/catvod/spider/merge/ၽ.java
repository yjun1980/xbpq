/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0674;
import com.github.catvod.spider.merge.\u08b0;
import com.github.catvod.spider.merge.\u08b3;
import com.github.catvod.spider.merge.\u08b6;
import com.github.catvod.spider.merge.\u08bd;
import com.github.catvod.spider.merge.\u0f8c;
import com.github.catvod.spider.merge.\u105c;
import com.github.catvod.spider.merge.\u105d;
import com.github.catvod.spider.merge.\u106e;
import com.github.catvod.spider.merge.\u1075;
import com.github.catvod.spider.merge.\u1077;
import com.github.catvod.spider.merge.\u107e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class \u107d {
    public static final List<String> \u037f = Collections.unmodifiableList(Arrays.asList(SOY.d("331C0737383E3E"), SOY.d("3F02023F383834"), SOY.d("28131F3131"), SOY.d("28071D33"), SOY.d("2A0014323D343B0614"), SOY.d("3B061E3B"), SOY.d("3B11053F3B39"), SOY.d("291705"), SOY.d("341D052927322E"), SOY.d("2D1B1D3237362816"), SOY.d("2A00143531333F1C1233")));
    public static final Map<Class<? extends \u107d>, Integer> \u0528 = Collections.unmodifiableMap(new HashMap<Class<? extends \u107d>, Integer>(){
        {
            this.put(\u08bd.class, 1);
            this.put(\u106e.class, 2);
            this.put(\u1075.class, 3);
            this.put(\u105d.class, 4);
            this.put(\u08b6.class, 5);
            this.put(\u08b3.class, 6);
            this.put(\u1077.class, 7);
            this.put(\u0f8c.class, 8);
            this.put(\u107e.class, 9);
            this.put(\u105c.class, 10);
        }
    });
    public \u08b0 \u0529;

    protected \u107d(\u08b0 \u08b02) {
        if (\u08b02 != null) {
            this.\u0529 = \u08b02;
            return;
        }
        throw new NullPointerException(SOY.d("0E33231111035A3130181A180E72331354190F3E3D58"));
    }

    public abstract int \u037f();

    public boolean \u0528() {
        return false;
    }

    public \u0674 \u0529() {
        return null;
    }

    public abstract boolean \u052a(int var1, int var2, int var3);
}

