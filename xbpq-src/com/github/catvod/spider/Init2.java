/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.Application
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnShowListener
 *  android.content.SharedPreferences$Editor
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.Toast
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.b;
import com.github.catvod.spider.aA;
import com.github.catvod.spider.f;
import com.github.catvod.spider.merge.W;
import com.github.catvod.spider.merge.d;
import com.github.catvod.spider.merge.e;
import com.github.catvod.spider.merge.eE;
import com.github.catvod.spider.merge.fS;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.ut;
import com.github.catvod.spider.v;
import com.github.catvod.spider.w;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Init2 {
    private static EditText HM;
    public static String N;
    public static String OL;
    public static String S;
    public static String T4;
    public static String b;
    public static int l;
    public static String l8;
    public static String n;
    private static final short[] short;
    public static int tT;
    public static Boolean v;
    private final Handler A = new Handler(Looper.getMainLooper());
    private Application cD;

    static {
        short = new short[]{2371, 2328, 2334, 2371, 2370, 2375, 2323, 2323, 2372, 2381, 2375, 2381, 2371, 2381, 2373, 2332, 2373, 2328, 2375, 2332, 2380, 2375, 2334, 2374, 2332, 2328, 2369, 2370, 2380, 2369, 2333, 2323, 2332, 2333, 2323, 2332, 2333, 2369, 2369, 2372, 2380, 2375, 2380, 2328, 2375, 2369, 2375, 2381, 2372, 2375, 2373, 2375, 2368, 2332, 2323, 2370, 2332, 2371, 2373, 2334, 2368, 2380, 2372, 2373, 2373, 2369, 537, 548, 569, 545, 552, 1818, 1851, 1824, 1853, 1847, 1841, 2360, 2320, 2310, 2310, 2324, 2322, 2320, 2589, 2623, 2587, 2613, 2601, 1904, 1879, 1858, 1879, 1878, 1872, 707, 743, 749, 735, 760, 742, 1346, 1390, 1393, 1400, 1397, 1384, 1393, 1837, 1808, 1806, 1793, 1805, 1797, 1096, 1102, 1112, 1103, 1145, 1116, 1097, 1116, 2133, 2116, 2134, 2134, 2130, 2122, 2135, 2113, -30313, -29197, 21253, 28064, 28507, 31329, 17554, 23314, 26959, 29605, 27938, 28633, 3320, 3319, 3325, 3307, 3318, 3312, 3325, 3255, 3320, 3305, 3305, 3255, 3288, 3322, 3309, 3312, 3311, 3312, 3309, 3296, 3277, 3313, 3307, 3324, 3320, 3325, 2192, 2182, 2177, 2177, 2198, 2205, 2183, 2226, 2192, 2183, 2202, 2181, 2202, 2183, 2186, 2215, 2203, 2177, 2198, 2194, 2199, 1248, 1228, 1262, 1273, 1252, 1275, 1252, 1273, 1252, 1256, 1278, 2757, 2772, 2752, 2758, 2768, 2769, 2801, 2803, 2788, 2809, 2790, 2809, 2788, 2793, -30117, 20523, 17912, 31133, -29222, 17746, 29616, 22801, -31540, 27041, 22830, -2896};
        v = Boolean.FALSE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Init2() {
        int n2 = f.c();
        int n3 = 1616;
        block6: while (true) {
            switch (n3 ^= 0x661) {
                default: {
                    continue block6;
                }
                case 49: {
                    if (n2 <= 0) {
                        n3 = 1709;
                        continue block6;
                    }
                }
                case 14: {
                    n3 = 1678;
                    continue block6;
                }
                case 204: {
                    Float f2 = Float.valueOf(com.github.catvod.parser.d.c("z5LFtK4fGYNLIpXuXe1mr141I"));
                    System.out.println(f2);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static AlertDialog N0() {
        var3 = new JSONObject(eE.l8("{\"Status\":0,\"Notice\":0,\"MoKey\":\"8972\",\"Mpname\":\"\",\"Copytip\":\"\",\"Title\":\"\",\"Message\":\"\u6fc0\u6d3b\u78018972\",\"ImgUrl\":\"\",\"WcNob\":\"\"}"));
        Init2.l8 = var3.optString("Title");
        Init2.tT = var3.getInt("Notice");
        Init2.S = var3.optString("Message");
        Init2.T4 = var3.optString("MoKey");
        Init2.l = var3.getInt("Status");
        Init2.N = var3.optString("ImgUrl");
        Init2.b = var3.optString("Copytip");
        Init2.OL = var3.optString("Mpname");
        var3 = Init2.getActivity().getSharedPreferences("userData", 0).getString("password", "");
        var1_2 = Init2.l;
        var0_3 = 1616;
        block36: while (true) {
            switch (var0_3 ^= 1633) {
                default: {
                    continue block36;
                }
lbl18:
                // 2 sources

                case 14: {
                    var0_3 = 1678;
                    continue block36;
                }
                case 49: {
                    if (var1_2 == 0) ** GOTO lbl18
                    var0_3 = 1709;
                    continue block36;
                }
                case 204: {
                    var2_4 = var3.equals(Init2.T4);
                    var0_3 = 1740;
                    block38: while (true) {
                        switch (var0_3 ^= 1757) {
                            default: {
                                continue block38;
                            }
                            case 17: {
                                if (!var2_4) {
                                    var0_3 = 1833;
                                    continue block38;
                                }
                            }
                            case 54: {
                                var0_3 = 1802;
                                continue block38;
                            }
                            case 500: {
                                var2_4 = Init2.v;
                                var0_3 = 1864;
                                block39: while (true) {
                                    switch (var0_3 ^= 1881) {
                                        default: {
                                            continue block39;
                                        }
                                        case 17: {
                                            if (!var2_4) {
                                                var0_3 = 48736;
                                                continue block39;
                                            }
                                        }
                                        case 47483: {
                                            var0_3 = 48705;
                                            continue block39;
                                        }
                                        case 47417: {
                                            var3 = new AlertDialog.Builder((Context)Init2.getActivity());
                                            var5_5 /* !! */  = new LinearLayout((Context)Init2.getActivity());
                                            var5_5 /* !! */ .setOrientation(1);
                                            var4_6 /* !! */  = new fS((Context)Init2.getActivity());
                                            var4_6 /* !! */ .setMaxHeight(300);
                                            var4_6 /* !! */ .HM(Init2.N);
                                            Init2.HM = var6_7 = new EditText((Context)Init2.getActivity());
                                            var6_7.setHint((CharSequence)"\u8bf7\u8f93\u5165\u6fc0\u6d3b\u7801");
                                            Init2.HM.setInputType(2);
                                            var5_5 /* !! */ .addView((View)var4_6 /* !! */ );
                                            var5_5 /* !! */ .addView((View)Init2.HM);
                                            var1_2 = Init2.tT;
                                            var0_3 = 48767;
                                            block40: while (true) {
                                                switch (var0_3 ^= 48784) {
                                                    default: {
                                                        continue block40;
                                                    }
lbl74:
                                                    // 2 sources

                                                    case 14: {
                                                        var0_3 = 48829;
                                                        continue block40;
                                                    }
                                                    case 239: {
                                                        if (var1_2 != 1) ** GOTO lbl74
                                                        var0_3 = 48860;
                                                        continue block40;
                                                    }
                                                    case 76: {
                                                        var5_5 /* !! */ .removeView((View)Init2.HM);
                                                        var4_6 /* !! */  = var3.setCancelable(true).setMessage((CharSequence)Init2.S).setView((View)var5_5 /* !! */ );
                                                        var5_5 /* !! */  = new DialogInterface.OnClickListener(){
                                                            private static final short[] short = new short[]{3040, 3046, 3056, 3047, 3025, 3060, 3041, 3060, 2270, 2255, 2269, 2269, 2265, 2241, 2268, 2250};
                                                            {
                                                                int n2 = h.c();
                                                                int n3 = 1616;
                                                                block6: while (true) {
                                                                    switch (n3 ^= 0x661) {
                                                                        default: {
                                                                            continue block6;
                                                                        }
                                                                        case 49: {
                                                                            if (n2 >= 0) {
                                                                                n3 = 1709;
                                                                                continue block6;
                                                                            }
                                                                        }
                                                                        case 14: {
                                                                            n3 = 1678;
                                                                            continue block6;
                                                                        }
                                                                        case 204: {
                                                                            Long l2 = Long.decode(com.github.catvod.spider.d.b("9Ndnt7cOaxStglMtka"));
                                                                            System.out.println(l2);
                                                                            return;
                                                                        }
                                                                        case 239: 
                                                                    }
                                                                    break;
                                                                }
                                                            }

                                                            /*
                                                             * Enabled aggressive block sorting
                                                             */
                                                            public void onClick(DialogInterface object, int n2) {
                                                                SharedPreferences.Editor editor = Init2.getActivity().getSharedPreferences("userData", 0).edit();
                                                                String string = T4;
                                                                editor.putString(com.github.catvod.spider.e.d(short, 8, 8, 2222), string);
                                                                editor.apply();
                                                                int n3 = com.github.catvod.spider.v.c();
                                                                int n4 = 1616;
                                                                block6: while (true) {
                                                                    switch (n4 ^= 0x661) {
                                                                        default: {
                                                                            continue block6;
                                                                        }
                                                                        case 49: {
                                                                            if (n3 >= 0) {
                                                                                n4 = 1709;
                                                                                continue block6;
                                                                            }
                                                                        }
                                                                        case 14: {
                                                                            n4 = 1678;
                                                                            continue block6;
                                                                        }
                                                                        case 204: {
                                                                            String string2 = com.github.catvod.parser.f.d("J8e2v");
                                                                            System.out.println(string2);
                                                                            return;
                                                                        }
                                                                        case 239: 
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                        };
                                                        var4_6 /* !! */ .setNegativeButton("\u4e0d\u518d\u63d0\u793a", (DialogInterface.OnClickListener)var5_5 /* !! */ );
                                                        var0_3 = 48891;
                                                        block42: while (true) {
                                                            switch (var0_3 ^= 48908) {
                                                                default: {
                                                                    continue block42;
                                                                }
                                                                case 22: lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    while (true) {
                                                                        var3 = var3.create();
                                                                        var4_6 /* !! */  = new DialogInterface.OnCancelListener(){
                                                                            private static final short[] short = new short[]{1001, 1020, 1018, 21443, -31769, 24700, 26034, 20747, 18108};
                                                                            {
                                                                                int n2 = h.c();
                                                                                int n3 = 1616;
                                                                                block6: while (true) {
                                                                                    switch (n3 ^= 0x661) {
                                                                                        default: {
                                                                                            continue block6;
                                                                                        }
                                                                                        case 49: {
                                                                                            if (n2 >= 0) {
                                                                                                n3 = 1709;
                                                                                                continue block6;
                                                                                            }
                                                                                        }
                                                                                        case 14: {
                                                                                            n3 = 1678;
                                                                                            continue block6;
                                                                                        }
                                                                                        case 204: {
                                                                                            Float f2 = Float.valueOf(com.github.catvod.parser.e.e("P5l"));
                                                                                            System.out.println(f2);
                                                                                            return;
                                                                                        }
                                                                                        case 239: 
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }

                                                                            /*
                                                                             * Enabled aggressive block sorting
                                                                             */
                                                                            public void onCancel(DialogInterface dialogInterface) {
                                                                                Log.e((String)"TAG", (String)"\u5bf9\u8bdd\u6846\u6d88\u5931\u4e86");
                                                                                int n2 = d.b();
                                                                                int n3 = 1616;
                                                                                block6: while (true) {
                                                                                    switch (n3 ^= 0x661) {
                                                                                        default: {
                                                                                            continue block6;
                                                                                        }
                                                                                        case 49: {
                                                                                            if (n2 >= 0) {
                                                                                                n3 = 1709;
                                                                                                continue block6;
                                                                                            }
                                                                                        }
                                                                                        case 14: {
                                                                                            n3 = 1678;
                                                                                            continue block6;
                                                                                        }
                                                                                        case 204: {
                                                                                            n3 = Integer.parseInt(h.b("ZD5CcwMlcbgVn"));
                                                                                            System.out.println(n3);
                                                                                            return;
                                                                                        }
                                                                                        case 239: 
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }
                                                                        };
                                                                        var3.setOnCancelListener((DialogInterface.OnCancelListener)var4_6 /* !! */ );
                                                                        var4_6 /* !! */  = new DialogInterface.OnShowListener(){
                                                                            {
                                                                                int n2 = com.github.catvod.parser.d.d();
                                                                                int n3 = 1616;
                                                                                block6: while (true) {
                                                                                    switch (n3 ^= 0x661) {
                                                                                        default: {
                                                                                            continue block6;
                                                                                        }
                                                                                        case 49: {
                                                                                            if (n2 >= 0) {
                                                                                                n3 = 1709;
                                                                                                continue block6;
                                                                                            }
                                                                                        }
                                                                                        case 14: {
                                                                                            n3 = 1678;
                                                                                            continue block6;
                                                                                        }
                                                                                        case 204: {
                                                                                            String string = com.github.catvod.parser.b.c("TTzpKykY5nzMiyIdo");
                                                                                            System.out.println(string);
                                                                                            return;
                                                                                        }
                                                                                        case 239: 
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }

                                                                            public void onShow(DialogInterface dialogInterface) {
                                                                            }
                                                                        };
                                                                        var3.setOnShowListener((DialogInterface.OnShowListener)var4_6 /* !! */ );
                                                                        var3.show();
                                                                        Init2.v = Boolean.TRUE;
                                                                        var4_6 /* !! */  = var3.getButton(-3);
                                                                        var5_5 /* !! */  = new View.OnClickListener((AlertDialog)var3){
                                                                            private static final short[] short = new short[]{2024, 2030, 2040, 2031, 2009, 2044, 2025, 2044, 1479, 1494, 1476, 1476, 1472, 1496, 1477, 1491, 27630, 26901, 31791, -28361, -28735};
                                                                            final AlertDialog l8;
                                                                            {
                                                                                this.l8 = object;
                                                                                int n2 = h.c();
                                                                                int n3 = 1616;
                                                                                block6: while (true) {
                                                                                    switch (n3 ^= 0x661) {
                                                                                        default: {
                                                                                            continue block6;
                                                                                        }
                                                                                        case 49: {
                                                                                            if (n2 >= 0) {
                                                                                                n3 = 1709;
                                                                                                continue block6;
                                                                                            }
                                                                                        }
                                                                                        case 14: {
                                                                                            n3 = 1678;
                                                                                            continue block6;
                                                                                        }
                                                                                        case 204: {
                                                                                            Double d2 = Double.valueOf(d.d("fRJVsOAdn"));
                                                                                            System.out.println(d2);
                                                                                            return;
                                                                                        }
                                                                                        case 239: 
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }

                                                                            /*
                                                                             * Exception decompiling
                                                                             */
                                                                            public void onClick(View var1_1) {
                                                                                /*
                                                                                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                                                                                 * 
                                                                                 * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
                                                                                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
                                                                                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
                                                                                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
                                                                                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                                                                                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                                                                                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                                                                                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                                                                                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                                                                                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                                                                                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                                                                                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                                                                                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                                                                                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                                                                                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                                                                                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                                                                                 */
                                                                                throw new IllegalStateException("Decompilation failed");
                                                                            }
                                                                        };
                                                                        var4_6 /* !! */ .setOnClickListener((View.OnClickListener)var5_5 /* !! */ );
lbl106:
                                                                        // 2 sources

                                                                        return var3;
                                                                    }
                                                                }
                                                                case 503: 
                                                            }
                                                            var0_3 = 48922;
                                                        }
                                                    }
                                                    case 45: 
                                                }
                                                break;
                                            }
                                            try {
                                                var5_5 /* !! */  = var3.setCancelable(false).setMessage((CharSequence)Init2.S).setView((View)var5_5 /* !! */ );
                                                var4_6 /* !! */  = new DialogInterface.OnClickListener(){
                                                    {
                                                        int n2 = com.github.catvod.parser.d.d();
                                                        int n3 = 1616;
                                                        block6: while (true) {
                                                            switch (n3 ^= 0x661) {
                                                                default: {
                                                                    continue block6;
                                                                }
                                                                case 49: {
                                                                    if (n2 >= 0) {
                                                                        n3 = 1709;
                                                                        continue block6;
                                                                    }
                                                                }
                                                                case 14: {
                                                                    n3 = 1678;
                                                                    continue block6;
                                                                }
                                                                case 204: {
                                                                    String string = h.b("DB4q");
                                                                    System.out.println(string);
                                                                    return;
                                                                }
                                                                case 239: 
                                                            }
                                                            break;
                                                        }
                                                    }

                                                    public void onClick(DialogInterface dialogInterface, int n2) {
                                                    }
                                                };
                                                var4_6 /* !! */  = var5_5 /* !! */ .setNeutralButton((CharSequence)"\u6fc0\u6d3b", (DialogInterface.OnClickListener)var4_6 /* !! */ );
                                                var5_5 /* !! */  = new DialogInterface.OnClickListener(){
                                                    {
                                                        int n2 = com.github.catvod.parser.e.c();
                                                        int n3 = 1616;
                                                        block6: while (true) {
                                                            switch (n3 ^= 0x661) {
                                                                default: {
                                                                    continue block6;
                                                                }
                                                                case 49: {
                                                                    if (n2 <= 0) {
                                                                        n3 = 1709;
                                                                        continue block6;
                                                                    }
                                                                }
                                                                case 14: {
                                                                    n3 = 1678;
                                                                    continue block6;
                                                                }
                                                                case 204: {
                                                                    Integer n4 = Integer.valueOf(com.github.catvod.spider.v.e("hvoW3VUmWqdlZN2Xnb2Jhxz"));
                                                                    System.out.println(n4);
                                                                    return;
                                                                }
                                                                case 239: 
                                                            }
                                                            break;
                                                        }
                                                    }

                                                    public void onClick(DialogInterface dialogInterface, int n2) {
                                                        System.exit(0);
                                                    }
                                                };
                                                var4_6 /* !! */ .setPositiveButton("\u4e0d\u518d\u63d0\u793a", (DialogInterface.OnClickListener)var5_5 /* !! */ );
                                                ** continue;
                                            }
                                            catch (JSONException var3_1) {
                                                var3_1.printStackTrace();
                                            }
                                        }
                                        case 47384: 
                                    }
                                    break;
                                }
                            }
                            case 471: 
                        }
                        break;
                    }
                }
                case 239: 
            }
            break;
        }
        var3 = null;
        ** while (true)
    }

    static /* synthetic */ void S() {
        Init2.N0();
    }

    /*
     * Enabled aggressive block sorting
     */
    static /* synthetic */ void T4(String string) {
        Toast.makeText((Context)Init2.context(), (CharSequence)string, (int)1).show();
        int n2 = com.github.catvod.spider.v.c();
        int n3 = 1616;
        block6: while (true) {
            switch (n3 ^= 0x661) {
                default: {
                    continue block6;
                }
                case 49: {
                    if (n2 >= 0) {
                        n3 = 1709;
                        continue block6;
                    }
                }
                case 14: {
                    n3 = 1678;
                    continue block6;
                }
                case 204: {
                    n3 = Integer.parseInt(w.c("iliz9cpNrONfLY0sBdW2tqAS"));
                    System.out.println(n3);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    public static Application context() {
        return Init2.get().cD;
    }

    public static Init2 get() {
        return Loader.l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Activity getActivity() {
        Class<?> clazz;
        Object object;
        Object object2;
        try {
            object2 = Class.forName("android.app.ActivityThread");
            object = ((Class)object2).getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            object2 = ((Class)object2).getDeclaredField("mActivities");
            ((Field)object2).setAccessible(true);
            object2 = ((Map)((Field)object2).get(object)).values().iterator();
            block16: while (true) {
                boolean bl = object2.hasNext();
                int n2 = 1616;
                block17: while (true) {
                    switch (n2 ^= 0x661) {
                        default: {
                            continue block17;
                        }
                        case 49: {
                            if (bl) {
                                n2 = 1709;
                                continue block17;
                            }
                        }
                        case 14: {
                            n2 = 1678;
                            continue block17;
                        }
                        case 204: {
                            object = object2.next();
                            clazz = object.getClass();
                            Field field = clazz.getDeclaredField("paused");
                            field.setAccessible(true);
                            bl = field.getBoolean(object);
                            n2 = 1740;
                            break block17;
                        }
                        case 239: {
                            return null;
                        }
                    }
                    break;
                }
                block18: while (true) {
                    switch (n2 ^= 0x6DD) {
                        case 471: {
                            continue block16;
                        }
                        default: {
                            continue block18;
                        }
                        case 17: {
                            if (!bl) {
                                n2 = 1833;
                                continue block18;
                            }
                        }
                        case 54: {
                            n2 = 1802;
                            continue block18;
                        }
                        case 500: 
                    }
                    break;
                }
                break;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        object2 = clazz.getDeclaredField("activity");
        ((Field)object2).setAccessible(true);
        object = (Activity)((Field)object2).get(object);
        SpiderDebug.log((String)object.getComponentName().getClassName());
        return object;
    }

    public static void init(Context context) {
        String string = "\u06e0\u06e2\u06e5";
        String string2 = null;
        short[] sArray = null;
        Init2 init2 = null;
        Application application = null;
        block9: while (true) {
            switch (com.github.catvod.spider.v.d(string)) {
                default: {
                    return;
                }
                case 1747932: {
                    init2 = Init2.get();
                    string = "\u06e1\u06e5\u06e6";
                    continue block9;
                }
                case 1752578: {
                    string2 = com.github.catvod.spider.v.b(sArray, 214, 12, 2993);
                    string = "\u06e2\u06df\u06e1";
                    continue block9;
                }
                case 1748802: {
                    application = (Application)context;
                    string = "\u06e3\u06e2\u06df";
                    continue block9;
                }
                case 1747747: {
                    sArray = short;
                    string = "\u06e5\u06e3\u06e0";
                    continue block9;
                }
                case 1750624: {
                    init2.cD = application;
                    string = "\u06df\u06e1\u06e8";
                    continue block9;
                }
                case 1746758: {
                    W.l8();
                    string = "\u06df\u06e6\u06e0";
                    continue block9;
                }
                case 1749572: 
            }
            SpiderDebug.log(string2);
            string = "\u06e0\u06e8\u06e4";
        }
    }

    static /* synthetic */ EditText l8() {
        return HM;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lj() {
        Init2.get().A.post((Runnable)aA.l8);
        int n2 = e.c();
        int n3 = 1616;
        block6: while (true) {
            switch (n3 ^= 0x661) {
                default: {
                    continue block6;
                }
                case 49: {
                    if (n2 >= 0) {
                        n3 = 1709;
                        continue block6;
                    }
                }
                case 14: {
                    n3 = 1678;
                    continue block6;
                }
                case 204: {
                    Integer n4 = Integer.valueOf(com.github.catvod.spider.v.e("kUjn0U0"));
                    System.out.println(n4);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    public static void run(Runnable runnable) {
        Init2.get().A.post(runnable);
    }

    public static void show(String string) {
        String string2 = "\u06e5\u06e5\u06df";
        ut ut2 = null;
        Init2 init2 = null;
        Handler handler = null;
        block6: while (true) {
            switch (com.github.catvod.spider.v.d(string2)) {
                default: {
                    ut2 = new ut(string);
                    string2 = "\u06e3\u06e3\u06e5";
                    continue block6;
                }
                case 1752639: {
                    init2 = Init2.get();
                    string2 = "\u06e5\u06e7\u06e2";
                    continue block6;
                }
                case 1752704: {
                    handler = init2.A;
                    string2 = "\u06e1\u06e2";
                    continue block6;
                }
                case 1750661: {
                    handler.post(ut2);
                    string2 = "\u06e4\u06df";
                    continue block6;
                }
                case 56443: 
            }
            break;
        }
    }

    private static class Loader {
        static volatile Init2 l8 = new Init2();

        /*
         * Enabled aggressive block sorting
         */
        private Loader() {
            int n2 = com.github.catvod.parser.d.d();
            int n3 = 1616;
            block6: while (true) {
                switch (n3 ^= 0x661) {
                    default: {
                        continue block6;
                    }
                    case 49: {
                        if (n2 >= 0) {
                            n3 = 1709;
                            continue block6;
                        }
                    }
                    case 14: {
                        n3 = 1678;
                        continue block6;
                    }
                    case 204: {
                        Double d2 = Double.decode((String)com.github.catvod.parser.d.c("0eL4LOyjlIfBwRMuA8HN0c6tw"));
                        System.out.println(d2);
                        return;
                    }
                    case 239: 
                }
                break;
            }
        }
    }
}

