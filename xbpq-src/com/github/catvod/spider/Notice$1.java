/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
package com.github.catvod.spider;

import android.graphics.Color;
import com.github.catvod.spider.Notice;
import java.util.Random;

class Notice$1
implements Runnable {
    final Notice a;

    Notice$1(Notice notice) {
        this.a = notice;
    }

    @Override
    public void run() {
        Random random = new Random();
        Notice.c(this.a).setTextColor(Color.argb((int)255, (int)random.nextInt(128), (int)random.nextInt(128), (int)random.nextInt(128)));
        Notice.d(this.a);
    }
}

