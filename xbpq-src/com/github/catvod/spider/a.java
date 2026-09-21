/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.JuheShortDrama
 *  com.github.catvod.spider.JuheShortDrama$Platform
 */
package com.github.catvod.spider;

import com.github.catvod.spider.JuheShortDrama;
import java.util.concurrent.Callable;

public final class a
implements Callable {
    public final JuheShortDrama a;
    public final JuheShortDrama.Platform b;
    public final String c;
    public final String d;

    public /* synthetic */ a(JuheShortDrama juheShortDrama, JuheShortDrama.Platform platform, String string, String string2) {
        this.a = juheShortDrama;
        this.b = platform;
        this.c = string;
        this.d = string2;
    }

    public final Object call() {
        return JuheShortDrama.o((JuheShortDrama)this.a, (JuheShortDrama.Platform)this.b, (String)this.c, (String)this.d);
    }
}

