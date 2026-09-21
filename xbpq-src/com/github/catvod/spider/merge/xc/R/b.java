/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.debug.MainActivity
 *  com.orhanobut.logger.Logger
 *  com.orhanobut.logger.Printer
 */
package com.github.catvod.spider.merge.xc.R;

import android.content.Context;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Wogg;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.Printer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class b
implements Runnable {
    public final int a;
    public final MainActivity b;

    public /* synthetic */ b(MainActivity mainActivity, int n2) {
        this.a = n2;
        this.b = mainActivity;
    }

    @Override
    public final void run() {
        Object object = this.b;
        switch (this.a) {
            default: {
                object.getClass();
                try {
                    Logger.t((String)"homeContent").d((Object)object.b.homeContent(true));
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return;
            }
            case 5: {
                object.getClass();
                try {
                    Logger.t((String)"homeVideoContent").d((Object)object.b.homeVideoContent());
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return;
            }
            case 4: {
                object.getClass();
                try {
                    Printer printer = Logger.t((String)"playerContent");
                    Wogg wogg = object.b;
                    object = new ArrayList();
                    printer.d((Object)wogg.playerContent("Uc4K", "c346b2883f0346d793b2aab7dbf6c08c++6924b088a6f624fd5baa769bf48ae337++1bc52309b62f4++YmXbBVC2f9W1Frq2ji2l0p0TxSaJhSr7HjrKRat1E6c=", (List)object));
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return;
            }
            case 3: {
                int n2 = MainActivity.c;
                object.getClass();
                try {
                    Wogg wogg;
                    Init.init(object.getApplicationContext());
                    object.b = wogg = new Wogg();
                    wogg.init((Context)object, "");
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return;
            }
            case 2: {
                object.getClass();
                try {
                    Logger.t((String)"searchContent").d((Object)object.b.searchContent("\u6211\u7684\u4eba\u95f4\u70df\u706b", false));
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return;
            }
            case 1: {
                object.getClass();
                try {
                    HashMap<String, String> hashMap = new HashMap<String, String>();
                    hashMap.put("c", "19");
                    hashMap.put("year", "2024");
                    Logger.t((String)"categoryContent").d((Object)object.b.categoryContent("1", "2", true, hashMap));
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return;
            }
            case 0: 
        }
        object.getClass();
        try {
            Logger.t((String)"detailContent").d((Object)object.b.detailContent(Arrays.asList("/voddetail/88220.html")));
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

