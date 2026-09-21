/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.OkHttpClient
 *  okhttp3.Response
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy$3;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.xc;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u0671;
import com.github.catvod.spider.merge.\u0786;
import com.github.catvod.spider.merge.\u0788;
import com.github.catvod.spider.merge.\u078a;
import com.github.catvod.spider.merge.\u078c;
import com.github.catvod.spider.merge.\u0e33;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class XYQHiker
extends Spider {
    private static SharedPreferences \u037f;
    private static boolean \u0528;
    public static Pattern \u0529;
    public static String \u052a;
    public static String \u052b;
    public static String \u052c;
    public static String \u052d;
    private static String[] \u052e;
    private static String[] \u052f;
    public xc \u058f;
    private String \u0620 = "";
    private String \u0780 = "";
    private String \u0781 = "";
    private String \u0782 = "";
    private JSONObject \u0783 = new JSONObject();
    private String \u0784 = SOY.d("210E060A2824067C0C5C4B3A1B31011A150E1F2012191A1113357F06181603372329181E09260A2A230B26012D58295D456F792D2820060E020A5A2A506D785A391619023D170D1208113E18121E1D7C351903191F200E1A1D040E");
    protected String \u0785 = null;
    protected JSONObject \u0786 = null;
    protected String \u0787 = null;
    protected boolean \u0788;

    static {
        \u0529 = Pattern.compile(SOY.d("523A25020404407D7E010300547A301A1D071B3C2D17181E03273F12061E0C3778581718177D22592F29580F7A5F"));
        \u052a = SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E4347405461675631131D7D604547594A7C615844");
        \u052b = SOY.d("373D2B1F181B1B7D64584457521E3818010F417210181005153B355645444172091F1518173B714747572A203E5F54360A223D132312181938025B4249657F45425752191922393B56723D1F1F125A1534151F185372121E061817377E47474454627F465A475A1F3E141D1B1F7202171216083B7E434740546167");
        \u052c = SOY.d("373D2B1F181B1B7D64584457523B011E1B191F69713524225A3B011E1B191F721E2554464C0D6156181E1137713B15145A1D02562C5E5A13210618122D37333D1D03556461435A46546364565C3C32061C3A5857163B3A1354301F313A195D572C3723051D18147D60405A475A1F3E141D1B1F7D604331464E6A712515111B20385942474E7C60");
        \u052d = SOY.d("373D2B1F181B1B7D64584457521F30151D190E3D221E4F57333C25131857373332563B245A0A714444284E626A560601406361465A4753721006041B1F0534143F1E0E7D644543594D677F47405752191922393B56723D1F1F125A1534151F18537207130604133D3F59454254627F4654241B3430041D584B676146");
        \u052e = new String[]{SOY.d("1B38300E5B011F2038100D28193A34151F"), SOY.d("1B38300E5A0712226E17174A193D35132B141237321D"), SOY.d("552434041D11037D38181012027C3902191B"), SOY.d("4521321E11141113124B171F1F313A")};
        \u052f = new String[]{SOY.d("12203410"), SOY.d("092032"), SOY.d("193E300507"), SOY.d("0E3B251A11"), SOY.d("1B3E25")};
    }

    public static boolean checkstring(String string) {
        String string2 = SOY.d("1761244E5A070D7D1217171F1F");
        String string3 = SOY.d("1C203E1B491F0E2621054E58553030180D0214357F0603");
        String string4 = SOY.d("1D37251B4702426D2404184A12262506");
        for (int i2 = 0; i2 < 3; ++i2) {
            if (!string.contains((new String[]{string2, string3, string4})[i2])) continue;
            return true;
        }
        return false;
    }

    public static boolean checkveriry(String string) {
        String[] stringArray = \u052e;
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.contains(stringArray[i2]) || string.contains(SOY.d("172B241F5901153633190C5A193D3F0211190E"))) continue;
            return true;
        }
        return false;
    }

    public static String getText(\u013a \u013a2, String string) {
        if (SOY.d("50").equals(string)) {
            return SOY.d("14273D1A");
        }
        String[] stringArray = string.split(SOY.d("262E0D0A"));
        if (stringArray.length > 1) {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string2 = null;
                try {
                    String string3;
                    string2 = string3 = XYQHiker.\u0785(\u013a2, stringArray[i2]);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                if (TextUtils.isEmpty(string2)) continue;
                return string2;
            }
        }
        return XYQHiker.\u0785(\u013a2, string);
    }

    public static String getTextByRule(\u013a \u013a2, String string) {
        if (string != null && string.length() != 0 && !SOY.d("50").equals(string)) {
            boolean bl = string.contains(SOY.d("5438224C"));
            String string2 = SOY.d("95EEDA");
            if (bl) {
                return XYQHiker.\u058f(\u013a2, string, string2);
            }
            if (string.contains(string2)) {
                return XYQHiker.\u058f(\u013a2, string, string2);
            }
            return XYQHiker.\u058f(\u013a2, string, SOY.d("2679"));
        }
        return "";
    }

    public static \u013a getTrueElement(String object, \u013a object2) {
        if (!((String)object).startsWith(SOY.d("2E372902")) && !((String)object).startsWith(SOY.d("3B262504"))) {
            int n2;
            Object object3 = \u052f;
            int n3 = ((String[])object3).length;
            for (n2 = 0; n2 < n3; ++n2) {
                if (!object3[n2].equals(object)) continue;
                return object2;
            }
            object3 = ((String)object).split(SOY.d("577F"));
            n3 = ((String[])object3).length;
            if (n3 > 1) {
                object = XYQHiker.getTrueElement(object3[0], (\u013a)object2);
                object2 = ((\u0582)object).\u078b();
                for (n2 = 1; n2 < ((String[])object3).length; ++n2) {
                    object2 = ((String)object2).replace(XYQHiker.getTrueElement(object3[n2], (\u013a)object).\u078b(), "");
                    object = \u0671.\u037f((String)object2);
                }
                return object;
            }
            String[] stringArray = ((String)object).split(SOY.d("262E0D0A"));
            if (stringArray.length > 1) {
                for (n2 = 0; n2 < stringArray.length; ++n2) {
                    object3 = null;
                    try {
                        \u013a \u013a2 = XYQHiker.getTrueElement(stringArray[n2], (\u013a)object2);
                        object3 = \u013a2;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    if (object3 == null) continue;
                    return object3;
                }
            }
            if (((String[])(object3 = ((String)object).split(SOY.d("56")))).length > 1) {
                n2 = Integer.parseInt(object3[1]);
                object = ((\u013a)object2).\u08b3(object3[0]);
                if (n2 < 0) {
                    return (\u013a)((ArrayList)object).get(((ArrayList)object).size() + n2);
                }
                return (\u013a)((\u013a)object2).\u08b3(object3[0]).get(n2);
            }
            return ((\u013a)object2).\u08b3((String)object).\u0529();
        }
        return object2;
    }

    public static String listToString(List<String> list, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if (list != null && list.size() > 0) {
            int n2 = list.size();
            if (n2 <= 1) {
                return list.get(0);
            }
            stringBuilder.append(list.get(0));
            for (int i2 = 1; i2 < list.size(); ++i2) {
                stringBuilder.append(string);
                stringBuilder.append(list.get(i2));
            }
            return stringBuilder.toString();
        }
        return "";
    }

    public static \u0e33 selectElements(\u013a \u013a2, String object) {
        String[] stringArray = ((String)object).split(SOY.d("262E0D0A"));
        object = new \u0e33();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            try {
                ((ArrayList)object).addAll(XYQHiker.\u078b(\u013a2, stringArray[i2]));
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return object;
    }

    public static String string2Hex(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 <= string.length() - 1; ++i2) {
            String string3 = String.valueOf((int)string.charAt(i2));
            if (string2.equals(SOY.d("1E3822"))) {
                stringBuilder.append(string3);
                continue;
            }
            stringBuilder.append(Integer.parseInt(string3) + 1);
        }
        return stringBuilder.toString();
    }

    public static String vertype(String string) {
        for (String string2 : \u052e) {
            if (!string.contains(string2)) continue;
            return string2;
        }
        return "";
    }

    /*
     * Exception decompiling
     */
    private JSONObject \u0528(String var1_1, String var2_6, boolean var3_7, HashMap<String, String> var4_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 65[TRYBLOCK] [125 : 3533->3573)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String \u0529(String string) {
        Matcher matcher = Pattern.compile(SOY.d("520E0D035C2B0D29650B5D5E")).matcher(string);
        while (matcher.find()) {
            String string2 = matcher.group(1);
            char c2 = (char)Integer.parseInt(matcher.group(2), 16);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c2);
            stringBuilder.append("");
            string = string.replace(string2, stringBuilder.toString());
        }
        return string;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject \u052a(String var1_1, String var2_5, String var3_7, String var4_8, String var5_11, String var6_12, String var7_17, String var8_18, String var9_19, String var10_20, String var11_23, String var12_24, String var13_28, String var14_29) {
        var18_30 = var7_17;
        var20_41 /* !! */  = SOY.d("5C");
        try {
            var19_46 /* !! */  = new JSONArray();
            var22_48 = new JSONObject();
            var23_49 /* !! */  = var1_1.split((String)var20_41 /* !! */ );
            var21_50 = new ArrayList();
            var16_51 = var23_49 /* !! */ .length;
            var1_1 = var19_46 /* !! */ ;
            for (var15_52 = 0; var15_52 < var16_51; ++var15_52) {
                var21_50.add(var23_49 /* !! */ [var15_52].replaceAll(SOY.d("95EED799C8F1"), (String)var20_41 /* !! */ ));
            }
            var19_46 /* !! */  = var4_8;
            var20_41 /* !! */  = var6_12;
            var6_12 = var10_20;
            var4_8 = var12_24;
            var10_20 = var14_29;
            var12_24 = var8_18;
            var14_29 = var21_50;
            var8_18 = var20_41 /* !! */ ;
            var23_49 /* !! */  = var1_1;
            var1_1 = var19_46 /* !! */ ;
        }
        catch (Exception var2_6) {
            SpiderDebug.log((Throwable)var2_6);
            if (this.\u0788) {
                var1_1 = new StringBuilder();
                var1_1.append(SOY.d("192034170031133E25130692FFFAB4C7F492FDE8B8E2ED98C6C8"));
                var1_1.append(var2_6.toString());
                Init.show(var1_1.toString());
            }
            return null;
        }
        {
            ** for (var15_52 = 0;
            ; var15_52 < (var16_51 = var14_29.size()); ++var15_52)
        }
lbl-1000:
        // 1 sources

        {
            block112: {
                block113: {
                    block90: {
                        block96: {
                            block111: {
                                block102: {
                                    block109: {
                                        block106: {
                                            block110: {
                                                block107: {
                                                    block108: {
                                                        block100: {
                                                            block105: {
                                                                block104: {
                                                                    block103: {
                                                                        block101: {
                                                                            block97: {
                                                                                block94: {
                                                                                    block98: {
                                                                                        block99: {
                                                                                            block95: {
                                                                                                block87: {
                                                                                                    block89: {
                                                                                                        block91: {
                                                                                                            block93: {
                                                                                                                block92: {
                                                                                                                    block88: {
                                                                                                                        try {
                                                                                                                            var17_53 = var3_7.isEmpty();
                                                                                                                        }
                                                                                                                        catch (Exception var20_45) {
                                                                                                                            var24_54 = var10_20;
                                                                                                                            var21_50 = var12_24;
                                                                                                                            var25_55 = var6_12;
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var12_24 = var8_18;
                                                                                                                            var10_20 = var1_1;
                                                                                                                            var6_12 = var24_54;
                                                                                                                            var1_1 = var25_55;
                                                                                                                            var8_18 = var21_50;
                                                                                                                            var18_30 = var20_45;
                                                                                                                            ** GOTO lbl-1000
                                                                                                                        }
                                                                                                                        var21_50 = SOY.d("9DFBEB");
                                                                                                                        var26_56 = SOY.d("50");
                                                                                                                        var24_54 = SOY.d("262E0D0A");
                                                                                                                        var25_55 = SOY.d("062E");
                                                                                                                        if (var17_53) ** GOTO lbl-1000
                                                                                                                        var19_46 /* !! */  = var1_1;
                                                                                                                        try {
                                                                                                                            if (var1_1.isEmpty()) ** GOTO lbl-1000
                                                                                                                            var19_46 /* !! */  = var1_1;
                                                                                                                            if (!var2_5.contains(SOY.d("01313002113E1E2F"))) ** GOTO lbl-1000
                                                                                                                            var18_30 = var1_1;
                                                                                                                            var19_46 /* !! */  = var1_1;
                                                                                                                            if (var1_1.equals(var26_56)) {
                                                                                                                                var18_30 = var3_7;
                                                                                                                            }
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                                                                        }
                                                                                                                        catch (Exception var1_3) {
                                                                                                                            var18_30 = var19_46 /* !! */ ;
                                                                                                                        }
lbl68:
                                                                                                                        // 2 sources

                                                                                                                        while (true) {
                                                                                                                            var19_46 /* !! */  = var6_12;
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var18_30 = var12_24;
                                                                                                                            var12_24 = var1_1;
                                                                                                                            break block87;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        var29_59 = SOY.d("9FDAD791C5CC");
                                                                                                                        var28_58 /* !! */  = SOY.d("193325133D13");
                                                                                                                        if (!var17_53) ** GOTO lbl105
                                                                                                                        if (var3_7.contains((CharSequence)var25_55)) {
                                                                                                                            var27_57 = var3_7.split((String)var24_54);
                                                                                                                            var20_41 /* !! */  = var18_30;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                        }
                                                                                                                        ** GOTO lbl105
                                                                                                                        {
                                                                                                                            catch (Exception var1_2) {
                                                                                                                                ** continue;
                                                                                                                            }
                                                                                                                            var30_60 = var18_30.split((String)var24_54);
                                                                                                                            var1_1 = var18_30;
                                                                                                                            var20_41 /* !! */  = var18_30;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                            if (var15_52 < var30_60.length) {
                                                                                                                                var1_1 = var18_30;
                                                                                                                                var20_41 /* !! */  = var18_30;
                                                                                                                                var19_46 /* !! */  = var8_18;
                                                                                                                                if (!var30_60[var15_52].equals(var21_50)) {
                                                                                                                                    var20_41 /* !! */  = var18_30;
                                                                                                                                    var19_46 /* !! */  = var8_18;
                                                                                                                                    var23_49 /* !! */ .put((Object)this.\u0781((String)var28_58 /* !! */ , (String)var29_59, var27_57[var15_52], var30_60[var15_52]));
                                                                                                                                    var1_1 = var18_30;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            ** GOTO lbl-1000
lbl105:
                                                                                                                            // 2 sources

                                                                                                                            var20_41 /* !! */  = var18_30;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                            var23_49 /* !! */ .put((Object)this.\u0781((String)var28_58 /* !! */ , (String)var29_59, var3_7, (String)var18_30));
                                                                                                                            var1_1 = var18_30;
                                                                                                                        }
lbl-1000:
                                                                                                                        // 5 sources

                                                                                                                        {
                                                                                                                            if (var17_53 = var5_11.isEmpty()) break block88;
                                                                                                                            var20_41 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                        }
                                                                                                                        {
                                                                                                                            if (var8_18.isEmpty()) break block88;
                                                                                                                            var20_41 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                            if (!var2_5.contains(SOY.d("01313D17070407"))) break block88;
                                                                                                                            var18_30 = var8_18;
                                                                                                                            var20_41 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                            if (var8_18.equals(var26_56)) {
                                                                                                                                var18_30 = var5_11;
                                                                                                                            }
                                                                                                                            var20_41 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                                                                        }
                                                                                                                        var28_58 /* !! */  = SOY.d("9DE3EA93EAFC");
                                                                                                                        var30_60 = SOY.d("193E300507");
                                                                                                                        if (!var17_53) ** GOTO lbl151
                                                                                                                        var20_41 /* !! */  = var1_1;
                                                                                                                        var19_46 /* !! */  = var18_30;
                                                                                                                        {
                                                                                                                            if (var5_11.contains((CharSequence)var25_55)) {
                                                                                                                                var20_41 /* !! */  = var1_1;
                                                                                                                                var19_46 /* !! */  = var18_30;
                                                                                                                                var27_57 = var5_11.split((String)var24_54);
                                                                                                                                var20_41 /* !! */  = var1_1;
                                                                                                                                var19_46 /* !! */  = var18_30;
                                                                                                                                var29_59 = var18_30.split((String)var24_54);
                                                                                                                                var20_41 /* !! */  = var1_1;
                                                                                                                                var19_46 /* !! */  = var18_30;
                                                                                                                                var8_18 = var18_30;
                                                                                                                                if (var15_52 >= var29_59.length) break block88;
                                                                                                                                var20_41 /* !! */  = var1_1;
                                                                                                                                var19_46 /* !! */  = var18_30;
                                                                                                                                var8_18 = var18_30;
                                                                                                                                if (!var29_59[var15_52].equals(var21_50)) {
                                                                                                                                    var20_41 /* !! */  = var1_1;
                                                                                                                                    var19_46 /* !! */  = var18_30;
                                                                                                                                    var23_49 /* !! */ .put((Object)this.\u0781((String)var30_60, (String)var28_58 /* !! */ , var27_57[var15_52], var29_59[var15_52]));
                                                                                                                                    var8_18 = var18_30;
                                                                                                                                }
                                                                                                                                break block88;
                                                                                                                            }
lbl151:
                                                                                                                            // 3 sources

                                                                                                                            var20_41 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var23_49 /* !! */ .put((Object)this.\u0781((String)var30_60, (String)var28_58 /* !! */ , var5_11, (String)var18_30));
                                                                                                                            var8_18 = var18_30;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        var17_53 = var7_17.isEmpty();
                                                                                                                        if (var17_53) break block89;
                                                                                                                    }
                                                                                                                    catch (Exception var20_44) {
                                                                                                                        var18_30 = var4_8;
                                                                                                                        var19_46 /* !! */  = var6_12;
                                                                                                                        var6_12 = var12_24;
                                                                                                                        var4_8 = var20_44;
                                                                                                                        var12_24 = var19_46 /* !! */ ;
                                                                                                                        break block90;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var12_24.isEmpty() || !(var17_53 = var2_5.contains(SOY.d("01332313150A")))) break block89;
                                                                                                                    }
                                                                                                                    catch (Exception var18_32) {
                                                                                                                        // empty catch block
                                                                                                                        break block91;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        var17_53 = var12_24.equals(var26_56);
                                                                                                                        var18_30 = var17_53 ? var7_17 : var12_24;
                                                                                                                    }
                                                                                                                    catch (Exception var18_31) {
                                                                                                                        break block91;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                                                                    }
                                                                                                                    catch (Exception var12_27) {
                                                                                                                        // empty catch block
                                                                                                                        break block92;
                                                                                                                    }
                                                                                                                    var27_57 = SOY.d("9FCEE193F8CD");
                                                                                                                    var19_46 /* !! */  = SOY.d("1B203417");
                                                                                                                    if (!var17_53) ** GOTO lbl206
                                                                                                                    if (var7_17.contains((CharSequence)var25_55)) {
                                                                                                                        var20_41 /* !! */  = var7_17.split((String)var24_54);
                                                                                                                        var28_58 /* !! */  = var18_30.split((String)var24_54);
                                                                                                                        var12_24 = var18_30;
                                                                                                                    }
                                                                                                                    ** GOTO lbl206
                                                                                                                    {
                                                                                                                        catch (Exception var12_25) {
                                                                                                                            break block92;
                                                                                                                        }
                                                                                                                        ** try [egrp 14[TRYBLOCK] [31 : 876->955)] { 
lbl199:
                                                                                                                        // 1 sources

                                                                                                                        if (var15_52 >= var28_58 /* !! */ .length) break block89;
                                                                                                                        var12_24 = var18_30;
                                                                                                                        if (var28_58 /* !! */ [var15_52].equals(var21_50)) break block89;
                                                                                                                        var23_49 /* !! */ .put((Object)this.\u0781((String)var19_46 /* !! */ , (String)var27_57, var20_41 /* !! */ [var15_52], var28_58 /* !! */ [var15_52]));
                                                                                                                        var12_24 = var18_30;
                                                                                                                        break block89;
lbl206:
                                                                                                                        // 2 sources

                                                                                                                        var23_49 /* !! */ .put((Object)this.\u0781((String)var19_46 /* !! */ , (String)var27_57, var7_17, (String)var18_30));
                                                                                                                        var12_24 = var18_30;
                                                                                                                        break block89;
                                                                                                                    }
lbl210:
                                                                                                                    // 1 sources

                                                                                                                    catch (Exception var12_26) {
                                                                                                                        var20_41 /* !! */  = var1_1;
                                                                                                                        var1_1 = var12_26;
                                                                                                                        break block93;
                                                                                                                    }
                                                                                                                }
                                                                                                                var20_41 /* !! */  = var1_1;
                                                                                                                var1_1 = var12_24;
                                                                                                            }
                                                                                                            var21_50 = var4_8;
                                                                                                            var12_24 = var6_12;
                                                                                                            var6_12 = var18_30;
                                                                                                            var4_8 = var1_1;
                                                                                                            var1_1 = var12_24;
                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                            break block113;
                                                                                                        }
                                                                                                        var19_46 /* !! */  = var12_24;
                                                                                                        var12_24 = var6_12;
                                                                                                        var12_24 = var18_30;
                                                                                                        var18_30 = var19_46 /* !! */ ;
                                                                                                        var19_46 /* !! */  = var1_1;
                                                                                                        break block87;
                                                                                                    }
                                                                                                    var19_46 /* !! */  = var7_17;
                                                                                                    try {
                                                                                                        var17_53 = var9_19.isEmpty();
                                                                                                        if (var17_53) break block94;
                                                                                                        break block95;
                                                                                                    }
                                                                                                    catch (Exception var18_40) {
                                                                                                        var21_50 = var6_12;
                                                                                                        var20_41 /* !! */  = var8_18;
                                                                                                        var6_12 = var10_20;
                                                                                                        var10_20 = var21_50;
                                                                                                        break block96;
                                                                                                    }
                                                                                                }
lbl245:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var1_1 = var19_46 /* !! */ ;
                                                                                                    var19_46 /* !! */  = var4_8;
                                                                                                    var20_41 /* !! */  = var6_12;
                                                                                                    var6_12 = var18_30;
                                                                                                    var4_8 = var12_24;
                                                                                                    break block97;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var6_12.isEmpty() || !(var17_53 = var2_5.contains(SOY.d("012B3417060A")))) break block94;
                                                                                            }
                                                                                            catch (Exception var18_34) {
                                                                                                // empty catch block
                                                                                                break block98;
                                                                                            }
                                                                                            try {
                                                                                                var17_53 = var6_12.equals(var26_56);
                                                                                                var18_30 = var17_53 ? var9_19 : var6_12;
                                                                                            }
                                                                                            catch (Exception var18_33) {
                                                                                                break block98;
                                                                                            }
                                                                                            try {
                                                                                                var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                                            }
                                                                                            catch (Exception var6_16) {
                                                                                                // empty catch block
                                                                                                break block99;
                                                                                            }
                                                                                            var28_58 /* !! */  = SOY.d("9FEBE592CFCA");
                                                                                            var29_59 = SOY.d("03373004");
                                                                                            if (!var17_53) ** GOTO lbl295
                                                                                            if (var9_19.contains((CharSequence)var25_55)) {
                                                                                                var27_57 = var9_19.split((String)var24_54);
                                                                                            }
                                                                                            ** GOTO lbl295
                                                                                            {
                                                                                                catch (Exception var6_14) {
                                                                                                    break block99;
                                                                                                }
                                                                                                try {
                                                                                                    var20_41 /* !! */  = var18_30.split((String)var24_54);
                                                                                                    var6_12 = var18_30;
                                                                                                }
                                                                                                catch (Exception var6_13) {
                                                                                                    break block99;
                                                                                                }
                                                                                                ** try [egrp 21[TRYBLOCK] [40 : 1163->1250)] { 
lbl288:
                                                                                                // 1 sources

                                                                                                if (var15_52 >= var20_41 /* !! */ .length) break block94;
                                                                                                var6_12 = var18_30;
                                                                                                if (!var20_41 /* !! */ [var15_52].equals(var21_50)) {
                                                                                                    var23_49 /* !! */ .put((Object)this.\u0781((String)var29_59, (String)var28_58 /* !! */ , var27_57[var15_52], var20_41 /* !! */ [var15_52]));
                                                                                                    var6_12 = var18_30;
                                                                                                }
                                                                                                break block94;
lbl295:
                                                                                                // 2 sources

                                                                                                var23_49 /* !! */ .put((Object)this.\u0781((String)var29_59, (String)var28_58 /* !! */ , var9_19, (String)var18_30));
                                                                                                var6_12 = var18_30;
                                                                                                break block94;
                                                                                            }
lbl299:
                                                                                            // 1 sources

                                                                                            catch (Exception var6_15) {}
                                                                                        }
                                                                                        var19_46 /* !! */  = var4_8;
                                                                                        var4_8 = var6_12;
                                                                                        var6_12 = var12_24;
                                                                                        var12_24 = var18_30;
                                                                                        var18_30 = var19_46 /* !! */ ;
                                                                                        break block90;
                                                                                    }
                                                                                    var19_46 /* !! */  = var6_12;
                                                                                    var19_46 /* !! */  = var12_24;
                                                                                    var12_24 = var18_30;
                                                                                    var18_30 = var19_46 /* !! */ ;
                                                                                    var19_46 /* !! */  = var1_1;
                                                                                    ** continue;
                                                                                }
                                                                                try {
                                                                                    var17_53 = var11_23.isEmpty();
                                                                                    if (var17_53) break block100;
                                                                                    break block101;
                                                                                }
                                                                                catch (Exception var18_39) {
                                                                                    // empty catch block
                                                                                    break block102;
                                                                                }
                                                                            }
lbl323:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var12_24 = var20_41 /* !! */ ;
                                                                                var18_30 = var19_46 /* !! */ ;
                                                                                break block90;
                                                                                break;
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (var4_8.isEmpty() || !(var17_53 = var2_5.contains(SOY.d("013E3018130A")))) break block100;
                                                                            var20_41 /* !! */  = var4_8;
                                                                            var18_30 = var20_41 /* !! */ ;
                                                                            var4_8 = var20_41 /* !! */ ;
                                                                        }
                                                                        catch (Exception var18_36) {
                                                                            // empty catch block
                                                                            break block103;
                                                                        }
                                                                        try {
                                                                            if (var20_41 /* !! */ .equals(var26_56)) {
                                                                                var18_30 = var11_23;
                                                                            }
                                                                            var4_8 = var18_30;
                                                                            var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                        }
                                                                        catch (Exception var18_35) {
                                                                            break block103;
                                                                        }
                                                                        var20_41 /* !! */  = SOY.d("92FDFC9EDCF7");
                                                                        var28_58 /* !! */  = SOY.d("16333F11");
                                                                        if (!var17_53) ** GOTO lbl366
                                                                        if (var11_23.contains((CharSequence)var25_55)) {
                                                                            var27_57 = var11_23.split((String)var24_54);
                                                                            var29_59 = var18_30.split((String)var24_54);
                                                                            var4_8 = var18_30;
                                                                        }
                                                                        ** GOTO lbl366
                                                                        {
                                                                            catch (Exception var4_9) {
                                                                                var19_46 /* !! */  = var18_30;
                                                                                break block104;
                                                                            }
                                                                            ** try [egrp 26[TRYBLOCK] [48 : 1445->1531)] { 
lbl359:
                                                                            // 1 sources

                                                                            if (var15_52 >= var29_59.length) break block100;
                                                                            var4_8 = var18_30;
                                                                            if (!var29_59[var15_52].equals(var21_50)) {
                                                                                var23_49 /* !! */ .put((Object)this.\u0781((String)var28_58 /* !! */ , (String)var20_41 /* !! */ , var27_57[var15_52], var29_59[var15_52]));
                                                                                var4_8 = var18_30;
                                                                            }
                                                                            break block100;
lbl366:
                                                                            // 2 sources

                                                                            var23_49 /* !! */ .put((Object)this.\u0781((String)var28_58 /* !! */ , (String)var20_41 /* !! */ , var11_23, (String)var18_30));
                                                                            var4_8 = var18_30;
                                                                            break block100;
                                                                        }
lbl370:
                                                                        // 1 sources

                                                                        catch (Exception var4_10) {
                                                                            break block105;
                                                                        }
                                                                    }
                                                                    var19_46 /* !! */  = var4_8;
                                                                    var4_8 = var18_30;
                                                                }
                                                                var18_30 = var19_46 /* !! */ ;
                                                            }
                                                            var20_41 /* !! */  = var6_12;
                                                            var6_12 = var12_24;
                                                            var19_46 /* !! */  = var18_30;
                                                            ** continue;
                                                        }
                                                        try {
                                                            var17_53 = var13_28.isEmpty();
                                                            if (var17_53) break block106;
                                                        }
                                                        catch (Exception var18_38) {
                                                            break block102;
                                                        }
                                                        try {
                                                            if (var10_20.isEmpty() || !(var17_53 = var2_5.contains(SOY.d("0130280B")))) break block106;
                                                            var20_41 /* !! */  = var10_20;
                                                            var10_20 = var20_41 /* !! */ ;
                                                            var18_30 = var20_41 /* !! */ ;
                                                        }
                                                        catch (Exception var20_43) {
                                                            // empty catch block
                                                            break block107;
                                                        }
                                                        try {
                                                            if (var20_41 /* !! */ .equals(var26_56)) {
                                                                var10_20 = var13_28;
                                                            }
                                                            var18_30 = var10_20;
                                                            var17_53 = var10_20.contains((CharSequence)var25_55);
                                                        }
                                                        catch (Exception var20_42) {
                                                            var10_20 = var18_30;
                                                            break block107;
                                                        }
                                                        var26_56 = SOY.d("9CDCC393CEF8");
                                                        var20_41 /* !! */  = SOY.d("182B");
                                                        if (var17_53) {
                                                            try {
                                                                if (!var13_28.contains((CharSequence)var25_55)) break block108;
                                                                var25_55 = var13_28.split((String)var24_54);
                                                                var24_54 = var10_20.split((String)var24_54);
                                                                var18_30 = var10_20;
                                                                if (var15_52 >= var24_54.length) break block109;
                                                                var18_30 = var10_20;
                                                                if (!var24_54[var15_52].equals(var21_50)) {
                                                                    var23_49 /* !! */ .put((Object)this.\u0781((String)var20_41 /* !! */ , var26_56, var25_55[var15_52], var24_54[var15_52]));
                                                                    var18_30 = var10_20;
                                                                }
                                                                break block109;
                                                            }
                                                            catch (Exception var18_37) {
                                                                break block110;
                                                            }
                                                        }
                                                    }
                                                    var23_49 /* !! */ .put((Object)this.\u0781((String)var20_41 /* !! */ , var26_56, var13_28, (String)var10_20));
                                                    var18_30 = var10_20;
                                                    break block109;
                                                }
                                                var18_30 = var20_41 /* !! */ ;
                                            }
                                            var20_41 /* !! */  = var8_18;
                                            var21_50 = var1_1;
                                            var8_18 = var12_24;
                                            var1_1 = var6_12;
                                            var6_12 = var10_20;
                                            var10_20 = var21_50;
                                            var12_24 = var20_41 /* !! */ ;
                                            ** GOTO lbl-1000
                                        }
                                        var18_30 = var10_20;
                                    }
                                    var20_41 /* !! */  = var14_29;
                                    try {
                                        var10_20 = (String)var20_41 /* !! */ .get(var15_52);
                                    }
                                    catch (Exception var10_22) {
                                        var20_41 /* !! */  = var18_30;
                                        break block111;
                                    }
                                    try {
                                        var22_48.put((String)var10_20, (Object)var23_49 /* !! */ );
                                        var21_50 = new JSONArray();
                                        var10_20 = var1_1;
                                        var23_49 /* !! */  = var21_50;
                                        var1_1 = var6_12;
                                        var6_12 = var18_30;
                                        var14_29 = var20_41 /* !! */ ;
                                        break block112;
                                    }
                                    catch (Exception var10_21) {
                                        var20_41 /* !! */  = var18_30;
                                        break block111;
                                    }
                                }
                                var20_41 /* !! */  = var10_20;
                                var10_20 = var18_30;
                            }
                            var18_30 = var10_20;
                            var10_20 = var6_12;
                            var6_12 = var20_41 /* !! */ ;
                            var20_41 /* !! */  = var8_18;
                        }
                        var21_50 = var1_1;
                        var8_18 = var12_24;
                        var1_1 = var10_20;
                        var10_20 = var21_50;
                        var12_24 = var20_41 /* !! */ ;
                        ** GOTO lbl-1000
                    }
                    var19_46 /* !! */  = var8_18;
                    var20_41 /* !! */  = var1_1;
                    var21_50 = var18_30;
                    var1_1 = var12_24;
                }
                var24_54 = var7_17;
                var18_30 = var4_8;
                var8_18 = var6_12;
                var4_8 = var21_50;
                var6_12 = var10_20;
                var10_20 = var20_41 /* !! */ ;
                var12_24 = var19_46 /* !! */ ;
                var19_46 /* !! */  = var24_54;
lbl-1000:
                // 4 sources

                {
                    SpiderDebug.log((Throwable)var18_30);
                    if (this.\u0788) {
                        var20_41 /* !! */  = new StringBuilder();
                        var20_41 /* !! */ .append(SOY.d("192034170031133E2513069FD5F4B6CDF290D7C9B8F6FD90EECDB7FEE492FDE8B8E2ED98C6C8"));
                        var20_41 /* !! */ .append(var18_30.toString());
                        Init.show(var20_41 /* !! */ .toString());
                    }
                    var18_30 = var8_18;
                    var8_18 = var12_24;
                    var12_24 = var18_30;
                }
            }
            var20_41 /* !! */  = var6_12;
            var6_12 = var1_1;
            var18_30 = var19_46 /* !! */ ;
            var1_1 = var10_20;
            var10_20 = var20_41 /* !! */ ;
            continue;
        }
lbl510:
        // 1 sources

        return var22_48;
    }

    private static String \u052b() {
        int n2 = Integer.parseInt(new SimpleDateFormat(SOY.d("032B280F")).format(new Date()));
        int n3 = n2 - 20;
        int n4 = n2;
        int n5 = n3;
        if (n2 > n3) {
            n5 = n2;
            n4 = n3;
        }
        String string = "";
        while (n5 >= n4) {
            StringBuilder stringBuilder;
            if (n5 == n4) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(String.valueOf(n5));
                string = stringBuilder.toString();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(String.valueOf(n5));
                stringBuilder.append(SOY.d("5C"));
                string = stringBuilder.toString();
            }
            --n5;
        }
        return string;
    }

    private static String \u058f(\u013a \u013a2, String object, String string) {
        String[] stringArray = ((String)object).split(string);
        object = new ArrayList();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2;
            string = stringArray[i2].trim();
            if (string.startsWith(string2 = SOY.d("5D")) && string.endsWith(string2) || string.startsWith(string2 = SOY.d("58")) && string.endsWith(string2)) {
                object.add(string.substring(1, string.length() - 1).replace(SOY.d("263C"), SOY.d("70")));
                continue;
            }
            object.add(XYQHiker.\u0620(\u013a2, string));
        }
        return XYQHiker.listToString((List<String>)object, "");
    }

    private static String \u0620(\u013a \u013a2, String stringArray) {
        if ((stringArray = stringArray.split(SOY.d("5C74"))).length != 1) {
            \u013a2 = XYQHiker.getTrueElement(stringArray[0], \u013a2);
        }
        for (int i2 = 1; i2 < stringArray.length - 1; ++i2) {
            \u013a2 = XYQHiker.getTrueElement(stringArray[i2], \u013a2);
        }
        return XYQHiker.getText(\u013a2, stringArray[stringArray.length - 1]);
    }

    /*
     * Unable to fully structure code
     */
    private JSONObject \u0781(String var1_1, String var2_2, String var3_4, String var4_5) {
        block14: {
            block13: {
                var15_6 = SOY.d("93E9C99EDAD3");
                var7_7 = SOY.d("9FD7F99FF7DF");
                var14_8 = SOY.d("182B");
                var10_9 = SOY.d("5C");
                var8_10 = new JSONObject();
                var9_11 = new JSONArray();
                var6_12 = var1_1.equals(var14_8);
                var11_13 = SOY.d("0C");
                var12_14 = SOY.d("14");
                var13_15 = SOY.d("9DFBEB");
                if (var6_12) break block13;
                if (var4_5.equals(var13_15) || var3_4.contains(var7_7)) break block13;
                var8_10.put(var12_14, (Object)var7_7);
                var8_10.put(var11_13, (Object)"");
                var9_11.put((Object)var8_10);
                var7_7 = new JSONObject();
                ** GOTO lbl40
            }
            var7_7 = var8_10;
            if (!var1_1.equals(var14_8)) ** GOTO lbl40
            var7_7 = var8_10;
            if (var4_5.equals(var13_15)) ** GOTO lbl40
            var7_7 = var8_10;
            if (!var3_4.contains(var15_6)) {
                var8_10.put(var12_14, (Object)var15_6);
                var8_10.put(var11_13, (Object)"");
                var9_11.put((Object)var8_10);
                var7_7 = new JSONObject();
            }
lbl40:
            // 6 sources

            if (!var4_5.contains(var10_9) || var4_5.equals(var13_15)) break block14;
            var3_4 = var3_4.split(var10_9);
            var4_5 = var4_5.split(var10_9);
            var5_16 = 0;
            while (true) {
                if (var5_16 < ((JSONObject)var3_4).length) {
                    var7_7.put(var12_14, (Object)var3_4[var5_16]);
                    var7_7.put(var11_13, (Object)var4_5[var5_16].replaceAll(SOY.d("95EED799C8F1"), var10_9));
                    var9_11.put((Object)var7_7);
                    var7_7 = new JSONObject();
                    ++var5_16;
                    continue;
                }
                ** GOTO lbl66
                break;
            }
        }
        try {
            if (!var4_5.equals(var13_15)) {
                var7_7.put(var12_14, (Object)var3_4);
                var7_7.put(var11_13, (Object)var4_5);
                var9_11.put((Object)var7_7);
            }
lbl66:
            // 4 sources

            var3_4 = new JSONObject();
            var3_4.put(SOY.d("113728"), (Object)var1_1);
            var3_4.put(SOY.d("14333C13"), (Object)var2_2);
            var3_4.put(SOY.d("0C333D0311"), (Object)var9_11);
            return var3_4;
        }
        catch (Exception var2_3) {
            SpiderDebug.log((Throwable)var2_3);
            if (this.\u0788) {
                var1_1 = new StringBuilder();
                var1_1.append(SOY.d("9DFFCA9FF4FE1D372524200E0A37B8F5DC92F2D4B4F1CE9EEECBBECAEE"));
                var1_1.append(var2_3.toString());
                Init.show(var1_1.toString());
            }
            return null;
        }
    }

    private String \u0782(String string) {
        return this.\u0783(string, "");
    }

    private String \u0783(String string, String string2) {
        if (!((string = this.\u0786.optString(string)).isEmpty() || string.equals(SOY.d("9DFBEB")) || string.equals(SOY.d("5C74")))) {
            return string;
        }
        return string2;
    }

    private static String \u0785(\u013a object, String object2) {
        Object object3;
        block13: {
            String string;
            int n2;
            int n3;
            block11: {
                object3 = ((String)object2).split(SOY.d("267C3B054E"));
                n3 = ((String[])object3).length;
                n2 = 1;
                string = object2;
                if (n3 <= 1) break block11;
                string = object3[0];
            }
            String[] stringArray = string.split(SOY.d("5B"));
            n3 = stringArray.length;
            String string2 = SOY.d("5A");
            String string3 = SOY.d("70");
            object3 = SOY.d("386465321114");
            object2 = SOY.d("2E372902");
            String string4 = SOY.d("3B262504");
            String string5 = SOY.d("32263C1A");
            if (n3 > 1) {
                block12: {
                    object = stringArray[0].equals(object2) ? ((\u013a)object).\u08b9() : (((String)object3).equals(stringArray[0]) ? new String(Base64.decode((String)((\u013a)object).\u08b9(), (int)0)) : (string5.equals(stringArray[0]) ? ((\u013a)object).\u08a3() : (stringArray[0].contains(string4) ? ((\u0582)object).\u0529(stringArray[0].replace(string4, "")) : ((\u0582)object).\u0529(stringArray[0]))));
                    n3 = n2;
                    object2 = object;
                    if (string5.equals(string)) break block12;
                    object2 = ((String)object).replaceAll(string3, string2);
                    n3 = n2;
                }
                while (true) {
                    object3 = object2;
                    if (n3 < stringArray.length) {
                        object2 = ((String)object2).replace(stringArray[n3], "");
                        ++n3;
                        continue;
                    }
                    break block13;
                    break;
                }
            }
            try {
                object = string.equals(object2) ? ((\u013a)object).\u08b9() : (((String)object3).equals(string) ? new String(Base64.decode((String)((\u013a)object).\u08b9(), (int)0)) : (string5.equals(string) ? ((\u013a)object).\u08a3() : (string.contains(string4) ? ((\u0582)object).\u0529(string.replace(string4, "")) : ((\u0582)object).\u0529(string))));
                object3 = object;
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
                return null;
            }
            if (string5.equals(string)) break block13;
            object3 = ((String)object).replaceAll(string3, string2);
        }
        return object3;
    }

    /*
     * WARNING - void declaration
     */
    private String \u0786(String string, String object3, String hashMap) {
        HashMap<String, String> hashMap2;
        hashMap2 = ((String)((Object)hashMap2)).equals(SOY.d("093A3E01")) ? this.\u0780(string) : this.\u0784(string);
        for (int i2 = 0; i2 < 3; ++i2) {
            Object object;
            String string2;
            String string3;
            block10: {
                void var2_6;
                String string4;
                void var2_3;
                block9: {
                    boolean bl = var2_3.contains(SOY.d("553A2417101814350E"));
                    string3 = SOY.d("772E5B");
                    string2 = SOY.d("93F8DD9EDBF6467D251F001B1F6C");
                    string4 = SOY.d("552034181E1E25");
                    if (bl) break block9;
                    object = var2_3;
                    if (!var2_3.contains(string4)) break block10;
                }
                CharSequence charSequence = this.\u052c(com.github.catvod.spider.merge.\u0788.\u052a(string, XYQHiker.getTextByRule(\u0671.\u037f((String)var2_3), SOY.d("183D350F52510931231F04035C74220417"))), this.\u0780, hashMap2);
                object = SOY.d("1137284B56");
                String string5 = SOY.d("58");
                String string6 = com.github.catvod.spider.merge.\u0788.\u0787((String)charSequence, (String)object, string5).get(0);
                object = com.github.catvod.spider.merge.\u0788.\u0787((String)charSequence, SOY.d("0C333D03114A58"), string5).get(0);
                string5 = com.github.catvod.spider.merge.\u0788.\u0787((String)charSequence, SOY.d("197C3613005F587D304444151F6A684F"), string5).get(0);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(SOY.d("553363461612426B68"));
                ((StringBuilder)charSequence).append(string5);
                ((StringBuilder)charSequence).append(string6);
                ((StringBuilder)charSequence).append(SOY.d("5C24301A011247"));
                if (var2_3.contains(string4)) {
                    String string7 = SOY.d("1E3822");
                } else {
                    String string8 = SOY.d("1236");
                }
                ((StringBuilder)charSequence).append(com.github.catvod.spider.merge.\u0786.\u037f(XYQHiker.string2Hex((String)object, (String)var2_6), com.github.catvod.spider.merge.\u0786.\u0529));
                object = com.github.catvod.spider.merge.\u0788.\u052a(string, ((StringBuilder)charSequence).toString());
                HashMap<String, List<String>> hashMap3 = new HashMap<String, List<String>>();
                \u078c.\u0620((String)object, hashMap2, hashMap3);
                for (Map.Entry entry : hashMap3.entrySet()) {
                    if (!((String)entry.getKey()).equalsIgnoreCase(SOY.d("0937255B171815393813"))) continue;
                    Iterable iterable = (Iterable)entry.getValue();
                    this.\u0620 = TextUtils.join((CharSequence)SOY.d("41"), (Iterable)iterable);
                    break;
                }
                String string9 = this.\u052c(string, this.\u0780, hashMap2);
                object = string9;
                if (!string9.contains(string2)) {
                    return string9.replaceAll(string3, "");
                }
            }
            if (!((String)object).contains(string2)) {
                return ((String)object).replaceAll(string3, "");
            }
            void var2_14 = object;
        }
        return null;
    }

    private String \u0787(String string, String charSequence, String hashMap) {
        hashMap = ((String)((Object)hashMap)).equals(SOY.d("093A3E01")) ? this.\u0780(string) : this.\u0784(string);
        for (int i2 = 0; i2 < 3; ++i2) {
            boolean bl = ((String)charSequence).contains(SOY.d("9CF1D190C1FC9EEAFC"));
            String string2 = SOY.d("772E5B");
            String string3 = SOY.d("46263802181244B4F2F692C2F1B6E9DB48580E3B251A1149");
            Object object = charSequence;
            if (bl) {
                object = charSequence;
                if (((String)charSequence).contains(SOY.d("1826261712"))) {
                    Map.Entry entry = com.github.catvod.spider.merge.\u0788.\u0787((String)charSequence, SOY.d("18262617124A"), SOY.d("58")).get(0);
                    if (string.contains(SOY.d("45"))) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string);
                        object = SOY.d("5C302501151147");
                    } else {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string);
                        object = SOY.d("45302501151147");
                    }
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append((String)((Object)entry));
                    charSequence = ((StringBuilder)charSequence).toString();
                    object = new HashMap();
                    charSequence = \u078c.\u0620((String)charSequence, hashMap, (Map<String, List<String>>)object);
                    object = object.entrySet().iterator();
                    while (object.hasNext()) {
                        entry = object.next();
                        if (!((String)entry.getKey()).equalsIgnoreCase(SOY.d("0937255B171815393813"))) continue;
                        object = (Iterable)entry.getValue();
                        this.\u0620 = TextUtils.join((CharSequence)SOY.d("41"), (Iterable)object);
                        break;
                    }
                    if (!((String)charSequence).contains(string3)) {
                        return ((String)charSequence).replaceAll(string2, "");
                    }
                    object = this.\u052c(string, this.\u0780, hashMap);
                }
            }
            if (!((String)object).contains(string3)) {
                return ((String)object).replaceAll(string2, "");
            }
            charSequence = object;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String \u0788(String var1_1, Map<String, String> var2_2, String var3_3, String var4_4) {
        var14_5 = SOY.d("552434041D1103");
        var15_6 = SOY.d("093A3E01");
        var13_7 = var3_3.equals(var15_6) != false ? this.\u0780(var1_1) : this.\u0784(var1_1);
        var8_8 = SOY.d("227F031305021F212513105A2D3B251E");
        var13_7.put((String)var8_8, SOY.d("221F1D3E00030A00340701120926"));
        var7_9 = "";
        var9_10 = "";
        var5_11 = 0;
        while (true) {
            block37: {
                block32: {
                    block29: {
                        block30: {
                            block33: {
                                block31: {
                                    try {
                                        var12_21 = new \u078a.\u037f(this){
                                            final XYQHiker \u0528;
                                            {
                                                this.\u0528 = xYQHiker;
                                            }

                                            @Override
                                            protected void onFailure(Call call, Exception exception) {
                                            }

                                            @Override
                                            protected void onResponse(Response response) {
                                            }
                                        };
                                        var6_12 = var4_4.contains(var14_5);
                                    }
                                    catch (Exception var10_19) {
                                        // empty catch block
                                        break block29;
                                    }
                                    var16_22 = SOY.d("09313913171C3B11");
                                    if (!var6_12) ** GOTO lbl37
                                    {
                                        var11_20 = \u078c.\u0529();
                                        var10_13 = new StringBuilder();
                                    }
                                    var10_13.append(com.github.catvod.spider.merge.\u0788.\u052a(var1_1, SOY.d("553B3F12110F542239065B011F2038100D58133C35130C5912263C1A")));
                                    var10_13.append(SOY.d("45"));
                                    {
                                        block34: {
                                            catch (Exception var10_14) {
                                                break block29;
                                            }
                                            ** try [egrp 3[TRYBLOCK] [3 : 151->403)] { 
lbl31:
                                            // 1 sources

                                            var10_13.append(Math.random());
                                            var17_23 = var10_13.toString();
                                            var10_13 = var3_3.equals(var15_6) != false ? this.\u0780(var1_1) : this.\u0784(var1_1);
                                            \u078c.\u052a((OkHttpClient)var11_20, (String)var17_23, null, (Map<String, String>)var10_13, var12_21);
                                            ** GOTO lbl72
lbl37:
                                            // 1 sources

                                            if (!var4_4.contains(var16_22)) break block34;
                                            var11_20 = \u078c.\u0529();
                                            var17_23 = new HashMap<String, String>();
                                            var17_23.append(com.github.catvod.spider.merge.\u0788.\u052a(var1_1, SOY.d("553B3F1518021E377E00101E1735321D5A071222")));
                                            var17_23.append(SOY.d("4535340249"));
                                            var10_13 = new Date();
                                            var17_23.append(var10_13);
                                            var17_23 = var17_23.toString();
                                            var10_13 = var3_3.equals(var15_6) != false ? this.\u0780(var1_1) : this.\u0784(var1_1);
                                            \u078c.\u052a((OkHttpClient)var11_20, (String)var17_23, null, (Map<String, String>)var10_13, var12_21);
                                            ** GOTO lbl72
                                        }
                                        var11_20 = \u078c.\u0529();
                                        var10_13 = new StringBuilder();
                                        var17_23 = new HashMap<String, String>();
                                        var17_23.append(SOY.d("553B3F155B14153F3C191A58193D35135A0712226E1749"));
                                        var17_23.append(var3_3);
                                        var17_23.append(SOY.d("5C216C"));
                                        var10_13.append(com.github.catvod.spider.merge.\u0788.\u052a(var1_1, var17_23.toString()));
                                    }
lbl64:
                                    // 1 sources

                                    catch (Exception var10_18) {
                                        break block29;
                                    }
                                    try {
                                        block35: {
                                            var10_13.append(Math.random());
                                            var17_23 = var10_13.toString();
                                            var10_13 = var3_3.equals(var15_6) != false ? this.\u0780(var1_1) : this.\u0784(var1_1);
                                            \u078c.\u052a((OkHttpClient)var11_20, (String)var17_23, null, (Map<String, String>)var10_13, var12_21);
lbl72:
                                            // 3 sources

                                            var11_20 = var9_10;
                                            var12_21 = Base64.encodeToString((byte[])((Response)var12_21.getResult()).body().bytes(), (int)2);
                                            var10_13 = new HashMap();
                                            var10_13.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E434740546167"));
                                            var10_13.put(SOY.d("393D3F0211190E7F050F0412"), SOY.d("0E3729025B07163338184F57193A300407120E6F2402125A42"));
                                            var12_21 = this.\u037f(this.\u0787, (String)var12_21, this.\u0780, (Map<String, String>)var10_13);
                                            if (!var4_4.contains(var14_5)) break block35;
                                            var10_13 = new StringBuilder();
                                            var10_13.append(SOY.d("553B3F12110F542239065B16103329590212083B370F2B141237321D4B030322344B"));
                                            var10_13.append(var3_3);
                                            var10_13.append(SOY.d("5C2434041D11036F"));
                                            var10_13.append((String)var12_21);
                                            var9_10 = var10_13 = this.\u052d(com.github.catvod.spider.merge.\u0788.\u052a(var1_1, var10_13.toString()), null, this.\u0780, var13_7);
                                            ** GOTO lbl127
                                        }
                                        var6_12 = var4_4.contains(var16_22);
                                        if (var6_12) {
                                            var10_13 = var8_8;
                                        }
                                        ** GOTO lbl117
                                    }
                                    catch (Exception var10_17) {
                                        var11_20 = var8_8;
                                        break block30;
                                    }
                                    var13_7.remove(var10_13);
                                    var10_13 = SOY.d("552134170614127C211E044809313913171C3B116C151C121939770615101F6F77051116083139020D071F6F771906131F206C50001E1E6F771706121B6F770F1116086F771A11030E37234B520E0F2B3018495109263002114A5C3F3E18110E47742713064A5C38204B");
                                    var17_23 = new HashMap<String, String>();
                                    var17_23.put(SOY.d("0C333D1F10160E37"), (String)var12_21);
                                    var12_21 = SOY.d("09373004171F0D3D2312");
                                    {
                                        block36: {
                                            catch (Exception var10_15) {
                                                break block30;
                                            }
                                            ** try [egrp 6[TRYBLOCK] [16 : 699->873)] { 
lbl113:
                                            // 1 sources

                                            var17_23.put((String)var12_21, var7_9);
                                            var9_10 = this.\u052d(com.github.catvod.spider.merge.\u0788.\u052a(var1_1, (String)var10_13), var17_23, this.\u0780, var13_7);
                                            break block36;
lbl117:
                                            // 1 sources

                                            var9_10 = new StringBuilder();
                                            var9_10.append(SOY.d("553B3F155B1610332958041F0A6D3015491415363429171F1F313A50000E0A376C"));
                                            var9_10.append(var3_3);
                                            var9_10.append(SOY.d("5C313E12114A"));
                                            var9_10.append((String)var12_21);
                                            var9_10 = this.\u052c(com.github.catvod.spider.merge.\u0788.\u052a(var1_1, var9_10.toString()), this.\u0780, var13_7);
                                        }
                                        var10_13 = var7_9;
                                        var12_21 = var8_8;
                                        if (var4_4.contains(var16_22)) {
                                            if (var9_10.contains(SOY.d("93F8DD9EDBF69DF2D092CCFA9CFFF291D5D9"))) break block31;
                                            var10_13 = var2_2 == null ? this.\u052c(var1_1, this.\u0780, var13_7) : this.\u052d(var1_1, var2_2, this.\u0780, var13_7);
                                            var8_8 = var10_13;
                                            var9_10 = var10_13;
                                        }
                                        ** GOTO lbl-1000
                                    }
lbl137:
                                    // 1 sources

                                    catch (Exception v0) {
                                        var9_10 = var7_9;
                                        var10_13 = v0;
                                        var9_10 = var11_20;
                                        break block32;
                                    }
                                    try {
                                        if (!var10_13.contains(SOY.d("92ECC293F1D29CFFF291D5D99DC8D59FDEFB92FDD091D4F6"))) {
                                            var8_8 = var10_13;
                                            var6_12 = XYQHiker.checkveriry((String)var10_13);
                                            var9_10 = var10_13;
                                            if (!var6_12) {
                                                return var10_13;
                                            }
                                        }
                                        break block33;
                                    }
                                    catch (Exception var10_16) {
                                        var9_10 = var8_8;
                                        var8_8 = var12_21;
                                        break block32;
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        var10_13 = new JSONObject((String)var9_10);
                                        if (!var10_13.getString(SOY.d("172136")).equals(SOY.d("1539"))) break block31;
                                        var13_7.remove(var12_21);
                                        var9_10 = var2_2 == null ? this.\u052c(var1_1, this.\u0780, var13_7) : this.\u052d(var1_1, var2_2, this.\u0780, var13_7);
                                        var8_8 = var9_10;
                                        var10_13 = var9_10;
                                    }
                                    {
                                        if (var9_10.contains(SOY.d("9EEADC9ED2F693F0C091CDF69CC1DC92C9EB95EEDD90E4EB9DE6F390E3C193C5E59FE3C393C8C592CCCD"))) {
                                            var8_8 = var9_10;
                                            TimeUnit.SECONDS.sleep(6L);
                                            if (var2_2 == null) {
                                                var8_8 = var9_10;
                                                var8_8 = var9_10 = this.\u052c(var1_1, this.\u0780, var13_7);
                                            } else {
                                                var8_8 = var9_10;
                                                var8_8 = var9_10 = this.\u052d(var1_1, var2_2, this.\u0780, var13_7);
                                            }
                                            var10_13 = var8_8;
                                        }
                                        var8_8 = var10_13;
                                        var9_10 = var10_13;
                                        if (!var10_13.contains(SOY.d("92ECC293F1D293F8DD9EDBF69DF2D0"))) {
                                            var8_8 = var10_13;
                                            var6_12 = XYQHiker.checkveriry((String)var10_13);
                                            var9_10 = var10_13;
                                            if (!var6_12) {
                                                return var10_13;
                                            }
                                        }
                                        break block33;
                                    }
                                }
                                var9_10 = var11_20;
                            }
                            var11_20 = var9_10;
                            break block37;
                        }
                        var11_20 = var7_9;
                        break block32;
                    }
                    var11_20 = var7_9;
                }
                var11_20 = var7_9;
                SpiderDebug.log((Throwable)var10_13);
                var12_21 = var8_8;
                var11_20 = var9_10;
                if (this.\u0788) {
                    var11_20 = new StringBuilder();
                    var11_20.append(SOY.d("1531239FDEFB92FDD093F3CD93C6C899C8ED"));
                    var11_20.append(var10_13.toString());
                    Init.show(var11_20.toString());
                    var11_20 = var9_10;
                    var12_21 = var8_8;
                }
            }
            if (++var5_11 >= 4) {
                return var11_20;
            }
            var9_10 = var11_20;
            var8_8 = var12_21;
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private String \u078a(String var1_1, String var2_3) {
        block200: {
            block197: {
                block166: {
                    block199: {
                        block198: {
                            block165: {
                                block164: {
                                    block163: {
                                        block162: {
                                            block161: {
                                                block160: {
                                                    block159: {
                                                        block196: {
                                                            block158: {
                                                                block157: {
                                                                    block195: {
                                                                        block155: {
                                                                            block156: {
                                                                                var18_4 = SOY.d("26292612280A");
                                                                                var20_5 = SOY.d("0101341706141202360B");
                                                                                var15_6 = SOY.d("9CC2CD91C0D592E7E693D3FC93F3E491D4F6");
                                                                                var12_16 = SOY.d("2A1D02229CD8CDB4E0F492E2CAB4DCD8");
                                                                                var14_25 = SOY.d("9CC2CD91C0D593C1EF90FAD2");
                                                                                var13_26 = SOY.d("9DEFC09FD5C29DEEC791D4F69CF2ED93C8F8");
                                                                                var19_40 = SOY.d("1736645E");
                                                                                var17_41 = SOY.d("4A");
                                                                                var16_42 = SOY.d("4B");
                                                                                this.\u052e();
                                                                                if (this.\u0782((String)var13_26).isEmpty()) {
                                                                                    var13_26 = SOY.d("393D351F1A1025343E0419160E");
                                                                                }
                                                                                if (this.\u0782((String)var14_25).isEmpty()) {
                                                                                    var14_25 = SOY.d("09373004171F2527231A");
                                                                                }
                                                                                if (this.\u0782((String)var12_16).isEmpty()) {
                                                                                    var12_16 = SOY.d("093730292403383D350F");
                                                                                }
                                                                                if (this.\u0782((String)var15_6).isEmpty()) {
                                                                                    var15_6 = SOY.d("09373029121E0821250615101F");
                                                                                }
                                                                                this.\u0780 = this.\u0783((String)var13_26, SOY.d("2F06175B4C"));
                                                                                var21_49 = String.valueOf(Integer.parseInt(this.\u0783((String)var15_6, (String)var16_42)));
                                                                                var13_26 = var21_49.equals(var17_41) != false ? String.valueOf(Integer.parseInt((String)var2_3) - 1) : String.valueOf(Integer.parseInt((String)var2_3) - 1 + Integer.parseInt(this.\u0783((String)var15_6, (String)var16_42)));
                                                                                var14_25 = this.\u0782((String)var14_25);
                                                                                var2_3 = var14_25.contains((CharSequence)var20_5) != false ? var17_41 : var16_42;
                                                                                if (var14_25.contains((CharSequence)var20_5)) break block155;
                                                                                if (!var13_26.equals(var17_41) || Integer.parseInt((String)var13_26) < Integer.parseInt((String)var2_3)) break block156;
                                                                                return null;
                                                                            }
                                                                            if (var13_26.equals(var17_41) || Integer.parseInt((String)var13_26) <= Integer.parseInt((String)var2_3)) break block155;
                                                                            return null;
                                                                        }
                                                                        var2_3 = var14_25;
                                                                        if (!var14_25.contains(SOY.d("1C3B230500271B35344B"))) ** GOTO lbl45
                                                                        var6_50 = var13_26.equals(var17_41);
                                                                        var2_3 = SOY.d("2609371F06040E023011114A");
                                                                        if (!var6_50) ** GOTO lbl-1000
                                                                        if (var21_49.equals(var17_41)) {
                                                                            var2_3 = var14_25.split((String)var2_3)[1].split(SOY.d("260F"))[0];
                                                                        } else lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var2_3 = var13_26.equals(var16_42) != false && var21_49.equals(var16_42) != false ? var14_25.split((String)var2_3)[1].split(SOY.d("260F"))[0] : var14_25.split((String)var2_3)[0];
                                                                        }
lbl45:
                                                                        // 3 sources

                                                                        var14_25 = var2_3.replaceAll((String)var18_4, URLEncoder.encode(var1_1, this.\u0780)).replaceAll(SOY.d("262902131505193A0111280A"), (String)var13_26);
                                                                        var2_3 = var14_25.split(SOY.d("41"))[0];
                                                                        var8_51 = System.currentTimeMillis() / 1000L;
                                                                        var10_52 = System.currentTimeMillis();
                                                                        var2_3 = var2_3.replaceAll(SOY.d("9CC5E79FE3C39CDAE2"), String.valueOf(var8_51)).replaceAll(SOY.d("9CC5E79FE3C39CF2D6"), String.valueOf(var10_52));
                                                                        var6_50 = var2_3.contains((CharSequence)var19_40);
                                                                        var23_53 = SOY.d("53");
                                                                        var15_6 = var2_3;
                                                                        if (!var6_50) ** GOTO lbl64
                                                                        var15_6 = com.github.catvod.spider.merge.\u0788.\u0787((String)var2_3, (String)var19_40, (String)var23_53).get(0);
                                                                        var20_5 = new StringBuilder();
                                                                        var20_5.append((String)var19_40);
                                                                        var20_5.append((String)var15_6);
                                                                        var20_5.append((String)var23_53);
                                                                        var15_6 = var2_3.replace(var20_5.toString(), com.github.catvod.spider.merge.\u0786.\u037f((String)var15_6, com.github.catvod.spider.merge.\u0786.\u0529));
lbl64:
                                                                        // 2 sources

                                                                        var6_50 = var14_25.contains(SOY.d("41223E0500"));
                                                                        var14_25 = SOY.d("09373004171F");
                                                                        if (!var6_50) ** GOTO lbl102
                                                                        var2_3 = this.\u0782((String)var12_16).replaceAll((String)var18_4, var1_1).replaceAll(SOY.d("262902131505193A0111280A"), (String)var13_26).trim().replaceAll(SOY.d("95EFCA"), SOY.d("01")).replaceAll(SOY.d("95EFCC"), SOY.d("07"));
                                                                        if (var2_3.isEmpty()) ** GOTO lbl100
                                                                        if (!var2_3.startsWith(SOY.d("01")) || !var2_3.endsWith(SOY.d("07"))) break block195;
                                                                        var12_16 = new JSONObject((String)var2_3);
                                                                        var2_3 = this.\u037f((String)var15_6, var12_16.toString(), this.\u0780, this.\u0784((String)var15_6));
                                                                        ** GOTO lbl122
                                                                    }
                                                                    var13_26 = new LinkedHashMap();
                                                                    for (Object var12_16 : var2_3.split(SOY.d("5C"))) {
                                                                        var5_56 = var12_16.indexOf(SOY.d("47"));
                                                                        var13_26.put(var12_16.substring(0, var5_56), var12_16.substring(var5_56 + 1));
                                                                    }
                                                                    var2_3 = this.\u052d((String)var15_6, (Map<String, String>)var13_26, this.\u0780, (Map<String, String>)this.\u0784((String)var15_6));
                                                                    if (var2_3.contains(SOY.d("92ECC293F1D293F8DD9EDBF69DF2D0"))) break block157;
                                                                    var12_16 = var2_3;
                                                                    if (!var2_3.contains(SOY.d("92ECC293F1D29CFFF291D5D99DC8D59FDEFB92FDD091D4F6"))) break block158;
                                                                }
                                                                var12_16 = var2_3;
                                                                if (!XYQHiker.checkveriry((String)var2_3)) break block158;
                                                                var12_16 = this.\u0788((String)var15_6, (Map<String, String>)var13_26, (String)var14_25, XYQHiker.vertype((String)var2_3));
                                                            }
                                                            var2_3 = var12_16;
                                                            if (var12_16.contains(SOY.d("9EEADC9ED2F693F0C091CDF69CC1DC92C9EB95EEDD90E4EB9DE6F390E3C193C5E59FE3C393C8C592CCCD"))) {
                                                                TimeUnit.SECONDS.sleep(6L);
                                                                var2_3 = this.\u052d((String)var15_6, (Map<String, String>)var13_26, this.\u0780, this.\u0784((String)var15_6));
                                                            }
                                                            ** GOTO lbl122
lbl100:
                                                            // 1 sources

                                                            var2_3 = this.\u052d((String)var15_6, null, this.\u0780, this.\u0784((String)var15_6));
                                                            ** GOTO lbl122
lbl102:
                                                            // 1 sources

                                                            var2_3 = var12_16 = this.\u052c((String)var15_6, this.\u0780, this.\u0784((String)var15_6));
                                                            if (!var12_16.contains(SOY.d("9CF1D190C1FC9EEAFC"))) ** GOTO lbl109
                                                            var2_3 = var12_16;
                                                            if (var12_16.contains(SOY.d("1826261712"))) {
                                                                var2_3 = this.\u0787((String)var15_6, (String)var12_16, (String)var14_25);
                                                            }
lbl109:
                                                            // 4 sources

                                                            if (var2_3.contains(SOY.d("553A2417101814350E"))) ** GOTO lbl113
                                                            var12_16 = var2_3;
                                                            if (!var2_3.contains(SOY.d("552034181E1E25"))) break block196;
lbl113:
                                                            // 2 sources

                                                            var12_16 = this.\u0786((String)var15_6, (String)var2_3, (String)var14_25);
                                                        }
                                                        if ((var12_16.contains(SOY.d("92ECC293F1D293F8DD9EDBF69DF2D0")) || var12_16.contains(SOY.d("92ECC293F1D29CFFF291D5D99DC8D59FDEFB92FDD091D4F6"))) && XYQHiker.checkveriry((String)var12_16)) {
                                                            var12_16 = this.\u0788((String)var15_6, null, (String)var14_25, XYQHiker.vertype((String)var12_16));
                                                        }
                                                        var2_3 = var12_16;
                                                        if (var12_16.contains(SOY.d("9EEADC9ED2F693F0C091CDF69CC1DC92C9EB95EEDD90E4EB9DE6F390E3C193C5E59FE3C393C8C592CCCD"))) {
                                                            TimeUnit.SECONDS.sleep(6L);
                                                            var2_3 = this.\u052c((String)var15_6, this.\u0780, this.\u0784((String)var15_6));
                                                        }
lbl122:
                                                        // 6 sources

                                                        var19_40 = XYQHiker.\u0529((String)var2_3);
                                                        var12_16 = this.\u0782(SOY.d("9CC2CD91C0D59CDAFB93FBE19CFAF093C8F8")).isEmpty() == false ? SOY.d("9CC2CD91C0D59CDAFB93FBE19CFAF093C8F8") : SOY.d("09373004171F253F3E1211");
                                                        var13_26 = this.\u0782(SOY.d("9CC2CD91C0D59DDBD693F9E29CCAFE93E4D130213E030492FCCBB7C5E1")).isEmpty() == false ? SOY.d("9CC2CD91C0D59DDBD693F9E29CCAFE93E4D130213E030492FCCBB7C5E1") : SOY.d("093730291D04253822190107");
                                                        var14_25 = this.\u0782(SOY.d("9FC9EF91FDF09CCAFE93E4D193CED19ED2F69EE9F291E4F1")).isEmpty() == false ? SOY.d("9FC9EF91FDF09CCAFE93E4D193CED19ED2F69EE9F291E4F1") : SOY.d("2A3B323811121E0223190C0E");
                                                        var2_3 = this.\u0782(SOY.d("9CC2CD91C0D530213E1892E2CAB4DCD890CDF6B4FDD792FFD0B7DEE0")).isEmpty() == false ? SOY.d("9CC2CD91C0D530213E1892E2CAB4DCD890CDF6B4FDD792FFD0B7DEE0") : SOY.d("0937301C0718140D25011D141F");
                                                        if (!this.\u0782((String)var12_16).equals(var17_41) && !this.\u0782((String)var12_16).equals(SOY.d("9FC2F7"))) {
                                                            var4_54 = 0;
                                                            break block159;
                                                        }
                                                        var4_54 = 1;
                                                    }
                                                    var6_50 = this.\u0783((String)var13_26, (String)var16_42).equals(var16_42);
                                                    var12_16 = SOY.d("9CCAFE");
                                                    if (!var6_50) {
                                                        if (this.\u0783((String)var13_26, (String)var12_16).equals(var12_16)) break block160;
                                                        var3_55 = 0;
                                                        break block161;
                                                    }
                                                }
                                                var3_55 = 1;
                                            }
                                            if (!this.\u0782((String)var14_25).equals(var16_42) && !this.\u0782((String)var14_25).equals(var12_16)) {
                                                var6_50 = false;
                                                break block162;
                                            }
                                            var6_50 = true;
                                        }
                                        var18_4 = this.\u0782(SOY.d("9CC2CD91C0D59FDAC69ED5DF9CC7E191CFF392F5D593FCEE")).isEmpty() == false ? SOY.d("9CC2CD91C0D59FDAC69ED5DF9CC7E191CFF392F5D593FCEE") : SOY.d("093730291505080D23031812");
                                        var16_42 = this.\u0782(SOY.d("9CC2CD91C0D59DDBD693F9E29FC9EF91FDF0")).isEmpty() == false ? SOY.d("9CC2CD91C0D59DDBD693F9E29FC9EF91FDF0") : SOY.d("09373029041E19");
                                        var14_25 = this.\u0782(SOY.d("9CC2CD91C0D59DDBD693F9E29CF2D69FD6EF")).isEmpty() == false ? SOY.d("9CC2CD91C0D59DDBD693F9E29CF2D69FD6EF") : SOY.d("09373029001E0E3E34");
                                        var12_16 = this.\u0782(SOY.d("9CC2CD91C0D59DDBD693F9E293C1EF90FAD2")).isEmpty() == false ? SOY.d("9CC2CD91C0D59DDBD693F9E293C1EF90FAD2") : SOY.d("09373029010516");
                                        var13_26 = this.\u0782(SOY.d("9CC2CD91C0D59DDBD693F9E29FDBFE90D4F093F0C9")).isEmpty() == false ? SOY.d("9CC2CD91C0D59DDBD693F9E29FDBFE90D4F093F0C9") : SOY.d("093730290702182638021812");
                                        var21_49 = this.\u0782(SOY.d("9CC2CD91C0D59DDBD693F9E293C1EF90FAD29FD8F193FDFA9DEED1")).isEmpty() == false ? SOY.d("9CC2CD91C0D59DDBD693F9E293C1EF90FAD29FD8F193FDFA9DEED1") : SOY.d("09373004171F25222313121E02");
                                        var20_5 = this.\u0782(SOY.d("9CC2CD91C0D59DDBD693F9E293C1EF90FAD29FD8F193E4F99DEED1")).isEmpty() == false ? SOY.d("9CC2CD91C0D59DDBD693F9E293C1EF90FAD29FD8F193E4F99DEED1") : SOY.d("09373004171F25212410121E02");
                                        var29_57 = new JSONObject();
                                        var17_41 = new JSONArray();
                                        var2_3 = this.\u0782((String)var2_3);
                                        var7_58 = var2_3.isEmpty();
                                        var28_59 = SOY.d("5C74");
                                        if (!var7_58) {
                                            if (!var2_3.contains((CharSequence)var28_59)) break block163;
                                            var2_3 = com.github.catvod.spider.merge.\u0788.\u0787((String)var19_40, var2_3.split((String)var28_59)[0], var2_3.split((String)var28_59)[1]).get(0);
                                            break block164;
                                        }
                                    }
                                    var2_3 = var19_40;
                                }
                                var30_60 = SOY.d("5E7675");
                                var25_61 = SOY.d("5D3B3F0601035D");
                                if (var4_54 == 0) break block197;
                                var19_40 = new JSONObject((String)var2_3);
                                var2_3 = this.\u0783((String)var18_4, SOY.d("163B2202")).split(SOY.d("267C"));
                                if (((CharSequence)var2_3).length != 1) break block165;
                                var2_3 = var19_40.getJSONArray((String)var2_3[0]);
lbl178:
                                // 4 sources

                                while (true) {
                                    var18_4 = var2_3;
                                    break block166;
                                    break;
                                }
                            }
                            if (((CharSequence)var2_3).length != 2) break block198;
                            var2_3 = var19_40.getJSONObject((String)var2_3[0]).getJSONArray((String)var2_3[1]);
                            ** GOTO lbl178
                        }
                        if (((Object)var2_3).length != 3) break block199;
                        var2_3 = var19_40.getJSONObject((String)var2_3[0]).getJSONObject((String)var2_3[1]).getJSONArray((String)var2_3[2]);
                        ** GOTO lbl178
                    }
                    if (((Object)var2_3).length == 4) {
                        var2_3 = var19_40.getJSONObject((String)var2_3[0]).getJSONObject((String)var2_3[1]).getJSONObject((String)var2_3[2]).getJSONArray((String)var2_3[3]);
                        ** continue;
                    }
                    var18_4 = null;
                }
                var2_3 = "";
                var19_40 = "";
                var3_55 = 0;
                var22_62 = var13_26;
                var23_53 = var12_16;
                var12_16 = var19_40;
                var24_64 = var18_4;
                while (true) {
                    block173: {
                        block168: {
                            block172: {
                                block169: {
                                    block171: {
                                        block170: {
                                            block167: {
                                                var4_54 = var24_64.length();
                                                if (var3_55 >= var4_54) break;
                                                var26_66 /* !! */  = var24_64.getJSONObject(var3_55);
                                                var13_26 = var26_66 /* !! */ .optString(this.\u0783((String)var14_25, SOY.d("14333C13")));
                                                var19_40 = var13_26.trim();
                                                var27_68 = var26_66 /* !! */ .optString(this.\u0783((String)var23_53, SOY.d("1336"))).trim();
                                                var13_26 = new StringBuilder();
                                                var13_26.append(this.\u0783(var21_49, ""));
                                                var13_26.append(var27_68);
                                                var13_26.append(this.\u0783((String)var20_5, ""));
                                                var13_26 = var13_26.toString();
                                                var7_58 = var13_26.contains(var25_61);
                                                var18_4 = var13_26;
                                                if (!var7_58) break block167;
                                                try {
                                                    var18_4 = var13_26.replaceAll(var25_61, var27_68);
                                                }
                                                catch (Exception var13_27) {
                                                    break block168;
                                                }
                                            }
                                            var7_58 = this.\u0782((String)var16_42).isEmpty();
                                            if (var7_58) break block169;
                                            if (this.\u0782((String)var16_42).startsWith(SOY.d("12262506"))) {
                                                var13_26 = this.\u0782((String)var16_42);
                                                break block170;
                                            }
                                            var2_3 = var13_26 = var26_66 /* !! */ .optString(this.\u0783((String)var16_42, SOY.d("0A3B32"))).trim();
                                            try {
                                                var13_26 = com.github.catvod.spider.merge.\u0788.\u052a((String)var15_6, (String)var13_26);
                                            }
                                            catch (Exception var13_28) {
                                                break block171;
                                            }
                                        }
                                        var2_3 = var13_26;
                                        if (!var6_50) break block169;
                                        var2_3 = var13_26;
                                        var2_3 = var13_26 = this.\u052f((String)var13_26, (String)var15_6, var6_50);
                                        break block169;
                                        catch (Exception var13_29) {
                                            // empty catch block
                                        }
                                    }
                                    try {
                                        SpiderDebug.log((Throwable)var13_26);
                                    }
                                    catch (Exception var13_30) {
                                        break block168;
                                    }
                                }
                                try {
                                    var12_16 = var13_26 = var26_66 /* !! */ .optString(this.\u0782((String)var22_62)).trim();
                                }
                                catch (Exception var13_31) {
                                    SpiderDebug.log((Throwable)var13_31);
                                }
                                try {
                                    if (!var19_40.contains(var1_1)) break block172;
                                    var27_68 = new JSONObject();
                                    var26_66 /* !! */  = SOY.d("0C3D35291D13");
                                }
                                catch (Exception var13_34) {}
                                try {
                                    var13_26 = new StringBuilder();
                                    var13_26.append((String)var19_40);
                                    var13_26.append(var30_60);
                                    var13_26.append((String)var2_3);
                                    var13_26.append(var30_60);
                                    var13_26.append((String)var18_4);
                                    var27_68.put((String)var26_66 /* !! */ , (Object)var13_26.toString());
                                    var27_68.put(SOY.d("0C3D35291A161737"), var19_40);
                                    var27_68.put(SOY.d("0C3D3529041E19"), var2_3);
                                    var27_68.put(SOY.d("0C3D352906121733231D07"), var12_16);
                                }
                                catch (Exception var13_33) {}
                                try {
                                    var17_41.put((Object)var27_68);
                                }
                                catch (Exception var13_32) {
                                    break block168;
                                }
                                break block168;
                            }
                            var18_4 = var2_3;
                            var19_40 = var12_16;
                            break block173;
                            {
                                break block168;
                                catch (Exception var13_35) {
                                    break block168;
                                }
                            }
                            catch (Exception var13_36) {}
                            break block168;
                            catch (Exception var13_37) {
                                break block168;
                            }
                            catch (Exception var13_38) {}
                            break block168;
                            catch (Exception var13_39) {
                                // empty catch block
                            }
                        }
                        SpiderDebug.log((Throwable)var13_26);
                        var18_4 = var2_3;
                        var19_40 = var12_16;
                        if (!this.\u0788) break block173;
                        var18_4 = new StringBuilder();
                        var18_4.append(SOY.d("9CC2CD91C0D592F5F290EAE710213E1891FBC0B7CEE991F0C0BBC5EF9BCBE0"));
                        var18_4.append(var13_26.toString());
                        Init.show(var18_4.toString());
                        var19_40 = var12_16;
                        var18_4 = var2_3;
                    }
                    ++var3_55;
                    var2_3 = var18_4;
                    var12_16 = var19_40;
                }
                var15_6 = var17_41;
                break block200;
            }
            var22_63 = var12_16;
            var12_16 = var13_26;
            var19_40 = var17_41;
            var24_65 = \u0671.\u037f((String)var2_3);
            var13_26 = this.\u0782(var21_49);
            var7_58 = var13_26.contains((CharSequence)var28_59);
            var21_49 = SOY.d("2A150E23263B");
            var2_3 = var13_26;
            if (var7_58) {
                var2_3 = XYQHiker.getTextByRule((\u013a)var24_65, (String)var13_26).replace(var21_49, (CharSequence)var15_6);
            }
            var17_41 = var2_3;
            if (var2_3.contains(var21_49)) {
                var17_41 = var2_3.replace(var21_49, (CharSequence)var15_6).replaceAll(SOY.d("5D"), "");
            }
            var20_5 = var2_3 = this.\u0782((String)var20_5);
            if (var2_3.contains((CharSequence)var28_59)) {
                var20_5 = XYQHiker.getTextByRule((\u013a)var24_65, (String)var2_3);
            }
            var13_26 = this.\u0782((String)var18_4).split((String)var28_59);
            var2_3 = XYQHiker.getTrueElement(var13_26[0], (\u013a)var24_65);
            var4_54 = 1;
            while (true) {
                if (var4_54 >= ((String[])var13_26).length - 1) break;
                var2_3 = XYQHiker.getTrueElement((String)var13_26[var4_54], (\u013a)var2_3);
                ++var4_54;
                continue;
                break;
            }
            var27_69 = XYQHiker.selectElements((\u013a)var2_3, (String)var13_26[((Object)var13_26).length - 1]);
            var18_4 = "";
            var13_26 = "";
            var4_54 = 0;
            var21_49 = var25_61;
            var2_3 = var23_53;
            var23_53 = var14_25;
            var14_25 = var18_4;
            var26_67 = var16_42;
            var24_65 = var15_6;
            var25_61 = var28_59;
            var28_59 = var17_41;
            while (true) {
                block193: {
                    block194: {
                        block186: {
                            block177: {
                                block175: {
                                    block203: {
                                        block192: {
                                            block191: {
                                                block190: {
                                                    block187: {
                                                        block189: {
                                                            block202: {
                                                                block188: {
                                                                    block178: {
                                                                        block185: {
                                                                            block201: {
                                                                                block180: {
                                                                                    block184: {
                                                                                        block183: {
                                                                                            block182: {
                                                                                                block181: {
                                                                                                    block179: {
                                                                                                        block176: {
                                                                                                            block174: {
                                                                                                                var5_56 = var27_69.size();
                                                                                                                var15_6 = var19_40;
                                                                                                                if (var4_54 >= var5_56) break;
                                                                                                                var18_4 = (\u013a)var27_69.get(var4_54);
                                                                                                                var17_41 = this.\u0782((String)var23_53);
                                                                                                                if (var3_55 == 0) break block174;
                                                                                                                try {
                                                                                                                    var15_6 = XYQHiker.getTextByRule((\u013a)var18_4, (String)var17_41);
                                                                                                                    ** GOTO lbl403
                                                                                                                }
                                                                                                                catch (Exception var15_7) {
                                                                                                                    break block175;
                                                                                                                }
                                                                                                            }
                                                                                                            var15_6 = var18_4.\u078b();
                                                                                                            var16_42 = var17_41.split(var25_61);
                                                                                                            var16_42 = var16_42[0];
                                                                                                            var17_41 = var17_41.split(var25_61);
                                                                                                            var17_41 = var17_41[1];
                                                                                                            var15_6 = this.\u0789(com.github.catvod.spider.merge.\u0788.\u0787((String)var15_6, (String)var16_42, (String)var17_41).get(0));
lbl403:
                                                                                                            // 2 sources

                                                                                                            var7_58 = var15_6.contains(SOY.d("99D2DB"));
                                                                                                            var17_41 = var15_6;
                                                                                                            if (!var7_58) break block176;
                                                                                                            var17_41 = var15_6;
                                                                                                            try {
                                                                                                                if (!var15_6.contains(SOY.d("99D2DA"))) break block176;
                                                                                                                var17_41 = var15_6.split(SOY.d("99D2DB"))[1].split(SOY.d("99D2DA"))[0];
                                                                                                            }
                                                                                                            catch (Exception var15_8) {
                                                                                                                var16_42 = var13_26;
                                                                                                                var13_26 = var15_8;
                                                                                                                break block177;
                                                                                                            }
                                                                                                        }
                                                                                                        var7_58 = this.\u0782(var26_67).isEmpty();
                                                                                                        if (var7_58) break block178;
                                                                                                        if (!this.\u0782(var26_67).startsWith(SOY.d("12262506"))) break block179;
                                                                                                        var14_25 = var15_6 = this.\u0782(var26_67);
                                                                                                        break block180;
                                                                                                    }
                                                                                                    var15_6 = this.\u0782(var26_67);
                                                                                                    if (var3_55 == 0) break block181;
                                                                                                    var14_25 = var15_6 = XYQHiker.getTextByRule((\u013a)var18_4, (String)var15_6).trim();
                                                                                                    break block182;
                                                                                                }
                                                                                                var16_42 = var18_4.\u078b();
                                                                                                var31_70 /* !! */  = var15_6.split(var25_61);
                                                                                                try {
                                                                                                    var14_25 = var15_6 = com.github.catvod.spider.merge.\u0788.\u0787((String)var16_42, var31_70 /* !! */ [0], var15_6.split(var25_61)[1]).get(0);
                                                                                                }
                                                                                                catch (Exception var15_10) {
                                                                                                    break block185;
                                                                                                }
                                                                                            }
                                                                                            if (!var14_25.contains(SOY.d("0F203D5E")) || (var31_70 /* !! */  = var14_25.replaceAll(SOY.d("267420031B0341"), "").split(SOY.d("0F203D2A5C"))).length <= 1) break block183;
                                                                                            var32_71 = var31_70 /* !! */ [1];
                                                                                            var16_42 = var14_25;
                                                                                            var15_6 = var14_25;
                                                                                            if (!var32_71.contains((CharSequence)var2_3)) break block184;
                                                                                            var15_6 = var14_25;
                                                                                            var16_42 = var31_70 /* !! */ [1].split(SOY.d("267B"))[0].replaceAll(SOY.d("2175732B"), "");
                                                                                            break block184;
                                                                                        }
                                                                                        var16_42 = var14_25;
                                                                                    }
                                                                                    var15_6 = var16_42;
                                                                                    try {
                                                                                        var14_25 = com.github.catvod.spider.merge.\u0788.\u052a((String)var24_65, (String)var16_42);
                                                                                    }
                                                                                    catch (Exception var16_43) {
                                                                                        var14_25 = var15_6;
                                                                                    }
                                                                                }
                                                                                if (var6_50) {
                                                                                    try {
                                                                                        var14_25 = var15_6 = this.\u052f((String)var14_25, (String)var24_65, var6_50);
                                                                                        break block178;
                                                                                    }
                                                                                    catch (Exception var15_9) {
                                                                                        break block185;
                                                                                    }
                                                                                }
                                                                                break block178;
                                                                                break block201;
                                                                                catch (Exception var16_44) {
                                                                                    // empty catch block
                                                                                }
                                                                            }
                                                                            var15_6 = var16_42;
                                                                            break block185;
                                                                            catch (Exception var15_11) {
                                                                                // empty catch block
                                                                            }
                                                                        }
                                                                        try {
                                                                            SpiderDebug.log((Throwable)var15_6);
                                                                        }
                                                                        catch (Exception var16_45) {
                                                                            var7_58 = var6_50;
                                                                            var15_6 = var2_3;
                                                                            var15_6 = var12_16;
                                                                            var12_16 = var16_45;
lbl483:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var16_42 = var2_3;
                                                                                var7_58 = var6_50;
                                                                                var16_42 = var13_26;
                                                                                break block186;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    var7_58 = this.\u0782((String)var12_16).isEmpty();
                                                                    if (var7_58) break block187;
                                                                    var16_42 = this.\u0782((String)var12_16);
                                                                    if (var3_55 == 0) break block188;
                                                                    var13_26 = var15_6 = XYQHiker.getTextByRule((\u013a)var18_4, (String)var16_42);
                                                                    break block187;
                                                                }
                                                                try {
                                                                    var15_6 = var18_4.\u078b();
                                                                    var31_70 /* !! */  = var16_42.split(var25_61);
                                                                }
                                                                catch (Exception var15_12) {}
                                                                try {
                                                                    var13_26 = var15_6 = this.\u0789(com.github.catvod.spider.merge.\u0788.\u0787((String)var15_6, var31_70 /* !! */ [0], var16_42.split(var25_61)[1]).get(0));
                                                                    break block187;
                                                                }
                                                                catch (Exception var16_46) {
                                                                    break block189;
                                                                }
                                                                break block202;
                                                                catch (Exception var15_13) {
                                                                    // empty catch block
                                                                }
                                                            }
                                                            var16_42 = var15_6;
                                                        }
                                                        var15_6 = var2_3;
                                                        var7_58 = var6_50;
                                                        var15_6 = var12_16;
                                                        try {
                                                            SpiderDebug.log((Throwable)var16_42);
                                                        }
                                                        catch (Exception var12_17) {
                                                            ** continue;
                                                        }
                                                    }
                                                    var15_6 = var2_3;
                                                    var7_58 = var6_50;
                                                    var15_6 = var12_16;
                                                    var12_16 = this.\u0782((String)var22_63).split(SOY.d("2609B7EDCB91F7F06B"))[0];
                                                    if (var3_55 == 0) ** GOTO lbl532
                                                    var12_16 = XYQHiker.getTextByRule((\u013a)var18_4, (String)var12_16);
                                                    break block190;
lbl532:
                                                    // 1 sources

                                                    var16_42 = var18_4.\u078b();
                                                    var18_4 = var12_16.split(var25_61);
                                                    var18_4 = var18_4[0];
                                                    var12_16 = var12_16.split(var25_61);
                                                    try {
                                                        var12_16 = com.github.catvod.spider.merge.\u0788.\u0787((String)var16_42, (String)var18_4, (String)var12_16[1]).get(0);
                                                    }
                                                    catch (Exception var12_22) {}
                                                }
                                                var16_42 = var12_16;
                                                if (this.\u0782((String)var22_63).contains(SOY.d("21B4CAC992FAD8"))) {
                                                    var16_42 = com.github.catvod.spider.merge.\u0788.\u0783((String)var12_16, this.\u0782((String)var22_63));
                                                }
                                                var12_16 = new StringBuilder();
                                                var12_16.append((String)var28_59);
                                                var12_16.append((String)var16_42);
                                                var12_16.append((String)var20_5);
                                                var12_16 = var18_4 = var12_16.toString();
                                                try {
                                                    if (!var18_4.contains(var21_49)) break block191;
                                                    var12_16 = var18_4.replaceAll(var21_49, (String)var16_42);
                                                }
                                                catch (Exception var12_21) {}
                                            }
                                            try {
                                                if (!var17_41.contains(var1_1)) break block192;
                                                var16_42 = new JSONObject();
                                            }
                                            catch (Exception var12_20) {}
                                            try {
                                                var31_70 /* !! */  = SOY.d("0C3D35291D13");
                                            }
                                            catch (Exception var12_19) {
                                                break block194;
                                            }
                                            try {
                                                var18_4 = new StringBuilder();
                                                var18_4.append((String)var17_41);
                                                var18_4.append(var30_60);
                                                var18_4.append((String)var14_25);
                                                var18_4.append(var30_60);
                                                var18_4.append((String)var12_16);
                                                var16_42.put((String)var31_70 /* !! */ , (Object)var18_4.toString());
                                                var16_42.put(SOY.d("0C3D35291A161737"), var17_41);
                                                var16_42.put(SOY.d("0C3D3529041E19"), var14_25);
                                                var16_42.put(SOY.d("0C3D352906121733231D07"), var13_26);
                                                var19_40.put(var16_42);
                                                var16_42 = var14_25;
                                                var18_4 = var13_26;
                                                var17_41 = var15_6;
                                                break block193;
                                            }
                                            catch (Exception var12_18) {
                                                break block194;
                                            }
                                        }
                                        var16_42 = var14_25;
                                        var18_4 = var13_26;
                                        var17_41 = var15_6;
                                        break block193;
                                        break block194;
                                        catch (Exception var12_23) {
                                            break block194;
                                        }
                                        catch (Exception var12_24) {}
                                        break block194;
                                        catch (Exception var16_47) {
                                            var15_6 = var12_16;
                                            var7_58 = var6_50;
                                            var12_16 = var2_3;
                                            var12_16 = var16_47;
                                        }
                                        break block203;
                                        catch (Exception var16_48) {
                                            var15_6 = var2_3;
                                            var7_58 = var6_50;
                                            var15_6 = var12_16;
                                            var12_16 = var16_48;
                                        }
                                    }
                                    var16_42 = var2_3;
                                    var7_58 = var6_50;
                                    break block194;
                                    catch (Exception var15_14) {}
                                    break block175;
                                    catch (Exception var15_15) {
                                        // empty catch block
                                    }
                                }
                                var16_42 = var13_26;
                                var13_26 = var15_6;
                            }
                            var15_6 = var2_3;
                            var7_58 = var6_50;
                            var15_6 = var12_16;
                            var12_16 = var13_26;
                        }
                        var13_26 = var2_3;
                        var7_58 = var6_50;
                        var13_26 = var16_42;
                    }
                    var16_42 = var2_3;
                    var7_58 = var6_50;
                    SpiderDebug.log((Throwable)var12_16);
                    var16_42 = var14_25;
                    var18_4 = var13_26;
                    var17_41 = var15_6;
                    if (!this.\u0788) break block193;
                    var16_42 = new StringBuilder();
                    var16_42.append(SOY.d("9CC2CD91C0D592F5F290EAE712263C1A91FBC0B7CEE991F0C0BBC5EF9BCBE0"));
                    var16_42.append(var12_16.toString());
                    Init.show(var16_42.toString());
                    var17_41 = var15_6;
                    var18_4 = var13_26;
                    var16_42 = var14_25;
                }
                ++var4_54;
                var14_25 = var16_42;
                var13_26 = var18_4;
                var12_16 = var17_41;
            }
        }
        try {
            var29_57.put(SOY.d("163B2202"), var15_6);
            var1_1 = var29_57.toString();
            return var1_1;
        }
        catch (Exception var1_2) {
            SpiderDebug.log((Throwable)var1_2);
            if (this.\u0788) {
                var2_3 = new StringBuilder();
                var2_3.append(SOY.d("9CC2CD91C0D59FD7F993C5F79FD5EB9FE0EE95EECB"));
                var2_3.append(var1_2.toString());
                Init.show(var2_3.toString());
            }
            return "";
        }
    }

    private static \u0e33 \u078b(\u013a cloneable, String object) {
        String[] stringArray = ((String)object).split(SOY.d("56"));
        if (stringArray.length > 1) {
            int n2;
            int n3;
            block11: {
                String[] stringArray2;
                block10: {
                    stringArray2 = stringArray[1].split(SOY.d("40"), -1);
                    if (!TextUtils.isEmpty((CharSequence)stringArray2[0])) {
                        try {
                            n3 = Integer.parseInt(stringArray2[0]);
                            break block10;
                        }
                        catch (NumberFormatException numberFormatException) {
                            numberFormatException.printStackTrace();
                        }
                    }
                    n3 = 0;
                }
                if (!TextUtils.isEmpty((CharSequence)stringArray2[1])) {
                    try {
                        n2 = Integer.parseInt(stringArray2[1]);
                        break block11;
                    }
                    catch (NumberFormatException numberFormatException) {
                        numberFormatException.printStackTrace();
                    }
                }
                n2 = 0;
            }
            object = ((\u013a)cloneable).\u08b3(stringArray[0]);
            int n4 = n2;
            if (n2 > ((ArrayList)object).size()) {
                n4 = ((ArrayList)object).size();
            }
            n2 = n4;
            if (n4 <= 0) {
                n2 = n4 + ((ArrayList)object).size();
            }
            cloneable = new \u0e33();
            while (n3 < n2) {
                ((ArrayList)cloneable).add((\u013a)((ArrayList)object).get(n3));
                ++n3;
            }
            return cloneable;
        }
        return ((\u013a)cloneable).\u08b3((String)object);
    }

    public String categoryContent(String string, String string2, boolean bl, HashMap<String, String> hashMap) {
        string = (string = this.\u0528(string, string2, bl, hashMap)) != null ? string.toString() : "";
        return string;
    }

    /*
     * Exception decompiling
     */
    public String detailContent(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 14[TRYBLOCK] [24 : 505->518)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String homeContent(boolean var1_1) {
        block46: {
            block44: {
                block43: {
                    block45: {
                        block42: {
                            block41: {
                                var21_2 = SOY.d("9DFFCA9FF4FE9CC7E190F9D9");
                                var20_3 = SOY.d("9DFFCA9FF4FE9CDCC393CEF89CC9EE90F9D592FDDC");
                                var19_4 = SOY.d("9DFFCA9FF4FE9CDCC393CEF89FC2DC91D3C7");
                                var18_5 = SOY.d("9DFFCA9FF4FE92FDFC9EDCF79CC9EE90F9D592FDDC");
                                var17_6 = SOY.d("9DFFCA9FF4FE92FDFC9EDCF79FC2DC91D3C7");
                                var15_7 = SOY.d("9DFFCA9FF4FE9FEBE592CFCA9CC9EE90F9D592FDDC");
                                var14_8 = SOY.d("9DFFCA9FF4FE9FEBE592CFCA9FC2DC91D3C7");
                                var13_9 = SOY.d("9DFFCA9FF4FE9FCEE193F8CD9CC9EE90F9D592FDDC");
                                var12_10 = SOY.d("9DFFCA9FF4FE9FCEE193F8CD9FC2DC91D3C7");
                                var11_11 = SOY.d("9DFFCA9FF4FE9DE3EA93EAFC9CC9EE90F9D592FDDC");
                                var10_12 = SOY.d("9DFFCA9FF4FE9DE3EA93EAFC9FC2DC91D3C7");
                                var9_13 = SOY.d("9DFFCA9FF4FE9FFFC193FCF19DE3EA90EFC89CDFF39EDBFA");
                                var8_14 = SOY.d("9DFFCA9FF4FE9FFFC193FCF19DE3EA93E4FA9DF5E1");
                                var7_15 = SOY.d("9FDAD791C5CC93C1EF90FAD2");
                                var6_16 = SOY.d("9FDAD791C5CC9FC2DC91D3C79CC9EE90F9D592FDDC");
                                var5_17 = SOY.d("9FDAD791C5CC9FC2DC91D3C7");
                                var22_22 = SOY.d("5C");
                                this.\u052e();
                                var4_23 /* !! */  = new JSONObject();
                                var16_28 = new JSONArray();
                                if (this.\u0782((String)var5_17).isEmpty()) {
                                    var5_17 = SOY.d("193E3005072814333C13");
                                }
                                if (this.\u0782((String)var6_16).isEmpty()) {
                                    var6_16 = SOY.d("193E300507280C333D0311");
                                }
                                if (this.\u0782(var7_15).isEmpty()) {
                                    var7_15 = SOY.d("193E300507280F203D");
                                }
                                if (this.\u0782(var8_14).isEmpty()) {
                                    var8_14 = SOY.d("1C313D170704253C301B11");
                                }
                                if (this.\u0782(var9_13).isEmpty()) {
                                    var9_13 = SOY.d("1C313D1707042524301A0112");
                                }
                                if (this.\u0782(var10_12).isEmpty()) {
                                    var10_12 = SOY.d("1C313002111B15350E18151A1F");
                                }
                                if (this.\u0782(var11_11).isEmpty()) {
                                    var11_11 = SOY.d("1C313002111B15350E00151B0F37");
                                }
                                if (this.\u0782(var12_10).isEmpty()) {
                                    var12_10 = SOY.d("1C332313152814333C13");
                                }
                                if (this.\u0782(var13_9).isEmpty()) {
                                    var13_9 = SOY.d("1C33231315280C333D0311");
                                }
                                if (this.\u0782(var14_8).isEmpty()) {
                                    var14_8 = SOY.d("1C2B3417062814333C13");
                                }
                                if (this.\u0782(var15_7).isEmpty()) {
                                    var15_7 = SOY.d("1C2B341706280C333D0311");
                                }
                                if (this.\u0782(var17_6).isEmpty()) {
                                    var17_6 = SOY.d("1C3E3018132814333C13");
                                }
                                if (this.\u0782(var18_5).isEmpty()) {
                                    var18_5 = SOY.d("1C3E301813280C333D0311");
                                }
                                if (this.\u0782(var19_4).isEmpty()) {
                                    var19_4 = SOY.d("1C213E04002814333C13");
                                }
                                if (this.\u0782(var20_3).isEmpty()) {
                                    var20_3 = SOY.d("1C213E0400280C333D0311");
                                }
                                var23_29 = this.\u0782((String)var6_16);
                                var7_15 = this.\u0782(var7_15);
                                var8_14 = this.\u0782(var8_14);
                                var9_13 = this.\u0782(var9_13);
                                var10_12 = this.\u0782(var10_12);
                                var11_11 = this.\u0782(var11_11);
                                var12_10 = this.\u0782(var12_10);
                                var13_9 = this.\u0782(var13_9);
                                var14_8 = this.\u0783(var14_8, XYQHiker.\u052b());
                                var15_7 = this.\u0783(var15_7, SOY.d("50"));
                                var17_6 = this.\u0782(var17_6);
                                var18_5 = this.\u0782(var18_5);
                                var19_4 = this.\u0783(var19_4, SOY.d("9CC5E79FE3C35CB6EBCC92C7EE74B9D9F092F2D4"));
                                var20_3 = this.\u0783(var20_3, SOY.d("0E3B3C13521F132622500714152034"));
                                var6_16 = this.\u0783((String)var5_17, "").split(var22_22);
                                var5_17 = var23_29.split(var22_22);
                                var2_30 = 0;
                                while (true) {
                                    if (var2_30 >= ((String[])var6_16).length) break;
                                    var24_31 = new JSONObject();
                                    var24_31.put(SOY.d("0E2B21132B1E1E"), (Object)var5_17[var2_30].replaceAll(SOY.d("95EED799C8F1"), var22_22));
                                    var24_31.put(SOY.d("0E2B21132B191B3F34"), (Object)var6_16[var2_30]);
                                    var16_28.put((Object)var24_31);
                                    ++var2_30;
                                    continue;
                                    break;
                                }
                                var6_16 = SOY.d("193E300507");
                                var5_17 = var4_23 /* !! */ ;
                                var5_17.put((String)var6_16, var16_28);
                                var5_17 = var21_2;
                                if (this.\u0782((String)var5_17).isEmpty()) {
                                    var5_17 = SOY.d("1C3B3D0211051E332517");
                                }
                                var16_28 = this.\u0783((String)var5_17, "");
                                InetAddress.getLocalHost();
                                var3_32 = var16_28.startsWith(SOY.d("193E30184E5855"));
                                var6_16 = null;
                                if (var3_32) ** GOTO lbl112
                                if (var16_28.startsWith(SOY.d("12262506")) || var16_28.startsWith(SOY.d("547D"))) ** GOTO lbl112
                                var3_32 = var16_28.equalsIgnoreCase(SOY.d("3F0A05"));
                                if (!var3_32) break block41;
                                try {
                                    var5_17 = this.\u052a(var23_29, var7_15, var8_14, var9_13, var10_12, var11_11, var12_10, var13_9, var14_8, var15_7, var17_6, var18_5, var19_4, var20_3);
                                    break block42;
                                }
                                catch (Exception var5_18) {
                                    break block43;
                                }
                            }
                            var5_17 = this.\u0786.optJSONObject((String)var5_17);
                            break block42;
lbl112:
                            // 2 sources

                            var7_15 = \u078c.\u058f((String)var16_28, null).trim();
                            var5_17 = var6_16;
                            if (!var7_15.startsWith(SOY.d("01"))) break block42;
                            var5_17 = var6_16;
                            if (!var7_15.endsWith(SOY.d("07"))) break block42;
                            var5_17 = new JSONObject(var7_15);
                        }
                        if (!var1_1 || var5_17 == null) break block45;
                        var7_15 = SOY.d("1C3B3D02110509");
                        var6_16 = var4_23 /* !! */ ;
                        try {
                            var6_16.put(var7_15, var5_17);
                            ** GOTO lbl152
                        }
                        catch (Exception var5_19) {
                            break block44;
                        }
                    }
                    var5_17 = var4_23 /* !! */ ;
                    ** GOTO lbl152
                    catch (Exception var5_20) {
                        // empty catch block
                    }
                }
                var6_16 = var4_23 /* !! */ ;
                break block44;
                catch (Exception var5_21) {
                    // empty catch block
                }
            }
            var6_16 = var4_23 /* !! */ ;
            try {
                SpiderDebug.log((Throwable)var5_17);
                if (this.\u0788) {
                    var6_16 = new StringBuilder();
                    var6_16.append(SOY.d("123D3C133718142634180090D7C9B8F6FD9EF9FAB4FEF292FDE8B8E2ED98C6C8"));
                    var6_16.append(var5_17.toString());
                    Init.show(var6_16.toString());
                }
lbl152:
                // 5 sources

                var4_23 /* !! */  = var4_23 /* !! */ .toString();
                return var4_23 /* !! */ ;
            }
            catch (Exception var4_24) {}
            break block46;
            catch (Exception var4_25) {}
            break block46;
            catch (Exception var4_26) {
                // empty catch block
            }
        }
        SpiderDebug.log((Throwable)var4_27);
        if (this.\u0788) {
            var5_17 = new StringBuilder();
            var5_17.append(SOY.d("123D3C133718142634180092FFFAB4C7F492FDE8B8E2ED98C6C8"));
            var5_17.append(var4_27.toString());
            Init.show(var5_17.toString());
        }
        return "";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String homeVideoContent() {
        block198: {
            block197: {
                block175: {
                    block196: {
                        block174: {
                            block173: {
                                block172: {
                                    block170: {
                                        block171: {
                                            block167: {
                                                block168: {
                                                    block169: {
                                                        block166: {
                                                            block165: {
                                                                block164: {
                                                                    block163: {
                                                                        block161: {
                                                                            block160: {
                                                                                var16_1 = SOY.d("93F4C79FD5C29DDBD693F9E29FDBFE90D4F093F0C9");
                                                                                var13_2 = SOY.d("93F4C79FD5C29DDBD693F9E29FC9EF91FDF0");
                                                                                var14_5 = SOY.d("93F4C79FD5C29DDBD693F9E293C1EF90FAD2");
                                                                                var12_6 = SOY.d("93F4C79FD5C29DDBD693F9E29CF2D69FD6EF");
                                                                                var31_11 = SOY.d("93F4C79FD5C29DDBD693F9E29CCAFE93E4D130213E030492FCCBB7C5E1");
                                                                                var15_12 = SOY.d("93F4C79FD5C29DDBD693F9E29FDAC69ED5DF9CC7E191CFF392F5D593FCEE");
                                                                                var19_18 = SOY.d("93F4C79FD5C29FDAC69ED5DF9CC7E191CFF392F5D593FCEE");
                                                                                var29_19 /* !! */  = SOY.d("93F4C79FD5C29CDCF99EF9E793C1EF90FAD2");
                                                                                var17_20 = SOY.d("9FC9EF91FDF09CCAFE93E4D193CED19ED2F69EE9F291E4F1");
                                                                                var18_21 /* !! */  = SOY.d("9CCAFE93E4D19FEED193E4D892DCE693FBE193F4C79FD5C29CC7E190F9D9");
                                                                                var34_22 /* !! */  = SOY.d("1736645E");
                                                                                var36_23 = SOY.d("5C74");
                                                                                this.\u052e();
                                                                                if (this.\u0782((String)var18_21 /* !! */ ).isEmpty()) {
                                                                                    var18_21 /* !! */  = SOY.d("123D3C1337181426341800");
                                                                                }
                                                                                if (this.\u0782((String)var17_20).isEmpty()) {
                                                                                    var17_20 = SOY.d("2A3B323811121E0223190C0E");
                                                                                }
                                                                                if (this.\u0782((String)var29_19 /* !! */ ).isEmpty()) {
                                                                                    var29_19 /* !! */  = SOY.d("08313C1310280F203D");
                                                                                }
                                                                                if (this.\u0782((String)var19_18).isEmpty()) {
                                                                                    var19_18 = SOY.d("123D3C132B1608200E04011B1F");
                                                                                }
                                                                                if (this.\u0782((String)var15_12).isEmpty()) {
                                                                                    var15_12 = SOY.d("123F34061D281B20232906021637");
                                                                                }
                                                                                if (this.\u0782((String)var31_11).isEmpty()) {
                                                                                    var31_11 = SOY.d("123D3C132B1E090D3B051B020A");
                                                                                }
                                                                                if (this.\u0782((String)var12_6).isEmpty()) {
                                                                                    var12_6 = SOY.d("123D3C132B0313263D13");
                                                                                }
                                                                                if (this.\u0782((String)var14_5).isEmpty()) {
                                                                                    var14_5 = SOY.d("123D3C132B02083E");
                                                                                }
                                                                                if (this.\u0782((String)var13_2).isEmpty()) {
                                                                                    var13_2 = SOY.d("123D3C132B071331");
                                                                                }
                                                                                if (this.\u0782((String)var16_1).isEmpty()) {
                                                                                    var16_1 = SOY.d("123D3C132B040F30251F001B1F");
                                                                                }
                                                                                var24_24 = this.\u0782(SOY.d("93F4C79FD5C29DDBD693F9E293C1EF90FAD29FD8F193FDFA9DEED1")).isEmpty() == false ? SOY.d("93F4C79FD5C29DDBD693F9E293C1EF90FAD29FD8F193FDFA9DEED1") : SOY.d("123D3C132B070837371F0C");
                                                                                var25_25 = this.\u0782(SOY.d("93F4C79FD5C29DDBD693F9E293C1EF90FAD29FD8F193E4F99DEED1")).isEmpty() == false ? SOY.d("93F4C79FD5C29DDBD693F9E293C1EF90FAD29FD8F193E4F99DEED1") : SOY.d("123D3C132B040F34371F0C");
                                                                                var20_26 = var14_5;
                                                                                var14_5 = this.\u0782(SOY.d("9FDAD791C5CC9FC2DC91D3C79CC9EE90F9D592FDDC")).isEmpty() == false ? SOY.d("9FDAD791C5CC9FC2DC91D3C79CC9EE90F9D592FDDC") : SOY.d("193E300507280C333D0311");
                                                                                var21_27 = var16_1;
                                                                                var27_28 = new JSONArray();
                                                                                var22_29 = var13_2;
                                                                                var23_35 = new JSONObject();
                                                                                var6_36 = this.\u0782((String)var29_19 /* !! */ ).isEmpty();
                                                                                var26_37 = var12_6;
                                                                                var37_38 = SOY.d("163B2202");
                                                                                var12_6 = SOY.d("5C");
                                                                                var35_39 = SOY.d("9CCAFE");
                                                                                var38_40 = SOY.d("4B");
                                                                                if (!var6_36) {
                                                                                    if (this.\u0782((String)var15_12).isEmpty()) break block160;
                                                                                    while (true) {
                                                                                        var14_5 = var12_6;
                                                                                        break block161;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (!this.\u0782((String)var18_21 /* !! */ ).equals(var38_40) && !this.\u0782((String)var18_21 /* !! */ ).equals(var35_39)) ** continue;
                                                                            var13_2 = this.\u0783((String)var14_5, "").split((String)var12_6);
                                                                            var2_41 = ((CharSequence)var13_2).length;
                                                                            for (var1_42 = 0; var1_42 < var2_41; ++var1_42) {
                                                                                block162: {
                                                                                    var14_5 = var13_2[var1_42].replaceAll(SOY.d("95EED799C8F1"), (String)var12_6);
                                                                                    var16_1 = new HashMap();
                                                                                    var14_5 = this.\u0528((String)var14_5, (String)var38_40, false, (HashMap<String, String>)var16_1);
                                                                                    if (var14_5 == null) break block162;
                                                                                    var14_5 = var14_5.optJSONArray(var37_38);
                                                                                    if (var14_5 == null) break block162;
                                                                                    var3_43 = 0;
                                                                                    while (true) {
                                                                                        if (var3_43 >= var14_5.length() || var3_43 >= 5) break;
                                                                                        var27_28.put((Object)var14_5.getJSONObject(var3_43));
                                                                                        ++var3_43;
                                                                                        continue;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (var27_28.length() >= 20) break;
                                                                                continue;
                                                                            }
                                                                            var23_35.put(var37_38, var27_28);
                                                                            var14_5 = var12_6;
                                                                        }
                                                                        if (this.\u0782((String)var29_19 /* !! */ ).isEmpty() && this.\u0782((String)var15_12).isEmpty()) ** GOTO lbl606
                                                                        if (!this.\u0782((String)var18_21 /* !! */ ).equals(var38_40) && !this.\u0782((String)var18_21 /* !! */ ).equals(var35_39)) ** GOTO lbl606
                                                                        var12_6 = this.\u0782(SOY.d("9DEFC09FD5C29DEEC791D4F69CF2ED93C8F8")).isEmpty() == false ? SOY.d("9DEFC09FD5C29DEEC791D4F69CF2ED93C8F8") : SOY.d("393D351F1A1025343E0419160E");
                                                                        this.\u0780 = this.\u0783((String)var12_6, SOY.d("2F06175B4C"));
                                                                        var33_44 = this.\u0782(SOY.d("9FDAD791C5CC9DDBD693F9E29CCAFE93E4D130213E030492FCCBB7C5E1")).isEmpty() == false ? SOY.d("9FDAD791C5CC9DDBD693F9E29CCAFE93E4D130213E030492FCCBB7C5E1") : SOY.d("193325291D04253822190107");
                                                                        var16_1 = this.\u0782(SOY.d("9FDAD791C5CC9DDBD693F9E29CF2D69FD6EF")).isEmpty() == false ? SOY.d("9FDAD791C5CC9DDBD693F9E29CF2D69FD6EF") : SOY.d("19332529001E0E3E34");
                                                                        var13_2 = this.\u0782(SOY.d("9FDAD791C5CC9DDBD693F9E293C1EF90FAD2")).isEmpty() == false ? SOY.d("9FDAD791C5CC9DDBD693F9E293C1EF90FAD2") : SOY.d("19332529010516");
                                                                        var12_6 = this.\u0782(SOY.d("9FDAD791C5CC9DDBD693F9E29FC9EF91FDF0")).isEmpty() == false ? SOY.d("9FDAD791C5CC9DDBD693F9E29FC9EF91FDF0") : SOY.d("19332529041E19");
                                                                        var18_21 /* !! */  = this.\u0782(SOY.d("9FDAD791C5CC9DDBD693F9E29FDBFE90D4F093F0C9")).isEmpty() == false ? SOY.d("9FDAD791C5CC9DDBD693F9E29FDBFE90D4F093F0C9") : SOY.d("193325290702182638021812");
                                                                        var32_45 /* !! */  = this.\u0782(SOY.d("9FDAD791C5CC9DDBD693F9E293C1EF90FAD29FD8F193FDFA9DEED1")).isEmpty() == false ? SOY.d("9FDAD791C5CC9DDBD693F9E293C1EF90FAD29FD8F193FDFA9DEED1") : SOY.d("1933252904051F34380E");
                                                                        var30_46 = this.\u0782(SOY.d("9FDAD791C5CC9DDBD693F9E293C1EF90FAD29FD8F193E4F99DEED1")).isEmpty() == false ? SOY.d("9FDAD791C5CC9DDBD693F9E293C1EF90FAD29FD8F193E4F99DEED1") : SOY.d("1933252907021C34380E");
                                                                        var6_36 = this.\u0783((String)var31_11, (String)var38_40).equals(var38_40);
                                                                        var28_47 = var13_2;
                                                                        if (var6_36) break block163;
                                                                        if (this.\u0783((String)var31_11, (String)var35_39).equals(var35_39)) break block163;
                                                                        var1_42 = 0;
                                                                        break block164;
                                                                    }
                                                                    var1_42 = 1;
                                                                }
                                                                if (!this.\u0782((String)var17_20).equals(var38_40) && !this.\u0782((String)var17_20).equals(var35_39)) {
                                                                    var6_36 = false;
                                                                    break block165;
                                                                }
                                                                var6_36 = true;
                                                            }
                                                            if (!this.\u0783((String)var33_44, (String)var38_40).equals(var38_40) && !this.\u0783((String)var33_44, (String)var35_39).equals(var35_39)) {
                                                                var2_41 = 0;
                                                                break block166;
                                                            }
                                                            var2_41 = 1;
                                                        }
                                                        var13_2 = this.\u0782((String)var29_19 /* !! */ );
                                                        var10_48 = System.currentTimeMillis() / 1000L;
                                                        var8_49 = System.currentTimeMillis();
                                                        var29_19 /* !! */  = var13_2.replaceAll(SOY.d("9CC5E79FE3C39CDAE2"), String.valueOf(var10_48)).replaceAll(SOY.d("9CC5E79FE3C39CF2D6"), String.valueOf(var8_49));
                                                        var7_50 = var29_19 /* !! */ .contains((CharSequence)var34_22 /* !! */ );
                                                        var13_2 = SOY.d("53");
                                                        var17_20 = var29_19 /* !! */ ;
                                                        if (!var7_50) ** GOTO lbl143
                                                        var17_20 = com.github.catvod.spider.merge.\u0788.\u0787((String)var29_19 /* !! */ , (String)var34_22 /* !! */ , (String)var13_2).get(0);
                                                        var31_11 = new StringBuilder();
                                                        var31_11.append((String)var34_22 /* !! */ );
                                                        var31_11.append((String)var17_20);
                                                        var31_11.append((String)var13_2);
                                                        var17_20 = var29_19 /* !! */ .replace(var31_11.toString(), com.github.catvod.spider.merge.\u0786.\u037f((String)var17_20, com.github.catvod.spider.merge.\u0786.\u0529));
lbl143:
                                                        // 2 sources

                                                        if (!var17_20.contains(SOY.d("41223E0500"))) break block167;
                                                        var31_11 = var17_20.split(SOY.d("266D"))[0].replaceAll(SOY.d("95EECE99C8E8"), SOY.d("45")).trim();
                                                        var29_19 /* !! */  = var17_20.split(SOY.d("266D"))[1].split(SOY.d("41"))[0].replaceAll(SOY.d("95EECE99C8E8"), SOY.d("45")).trim();
                                                        if (var29_19 /* !! */ .isEmpty()) break block168;
                                                        if (!var29_19 /* !! */ .startsWith(SOY.d("01")) || !var29_19 /* !! */ .endsWith(SOY.d("07"))) break block169;
                                                        var14_5 = new JSONObject((String)var29_19 /* !! */ );
                                                        var14_5 = this.\u037f((String)var31_11, var14_5.toString(), this.\u0780, this.\u0780((String)var31_11));
                                                        var29_19 /* !! */  = var12_6;
                                                        var12_6 = var13_2;
                                                        var13_2 = var29_19 /* !! */ ;
                                                        break block170;
                                                    }
                                                    var33_44 = new LinkedHashMap();
                                                    for (String[] var29_19 : var29_19 /* !! */ .split((String)var14_5)) {
                                                        var5_52 = var29_19 /* !! */ .indexOf(SOY.d("47"));
                                                        var33_44.put((String)var29_19 /* !! */ .substring(0, var5_52), (String)var29_19 /* !! */ .substring(var5_52 + 1));
                                                    }
                                                    var29_19 /* !! */  = var12_6;
                                                    var12_6 = var13_2;
                                                    var14_5 = this.\u052d((String)var31_11, (Map<String, String>)var33_44, this.\u0780, (Map<String, String>)this.\u0780((String)var31_11));
                                                    var13_2 = var29_19 /* !! */ ;
                                                    break block170;
                                                }
                                                var29_19 /* !! */  = var12_6;
                                                var12_6 = var13_2;
                                                var14_5 = this.\u052d((String)var31_11, null, this.\u0780, this.\u0780((String)var31_11));
                                                var13_2 = var29_19 /* !! */ ;
                                                break block170;
                                            }
                                            var29_19 /* !! */  = var12_6;
                                            var31_11 = var13_2;
                                            var12_6 = var13_2 = this.\u052c((String)var17_20, this.\u0780, this.\u0780((String)var17_20));
                                            if (!var13_2.contains(SOY.d("9CF1D190C1FC9EEAFC"))) break block171;
                                            var12_6 = var13_2;
                                            if (!var13_2.contains(SOY.d("1826261712"))) break block171;
                                            var12_6 = this.\u0787((String)var17_20, (String)var13_2, SOY.d("093A3E01"));
                                        }
                                        var33_44 = var12_6;
                                        if (var33_44.contains(SOY.d("553A2417101814350E"))) ** GOTO lbl196
                                        var14_5 = var33_44;
                                        var12_6 = var31_11;
                                        var13_2 = var29_19 /* !! */ ;
                                        if (!var33_44.contains(SOY.d("552034181E1E25"))) break block170;
lbl196:
                                        // 2 sources

                                        var14_5 = this.\u0786((String)var17_20, (String)var33_44, SOY.d("093A3E01"));
                                        var13_2 = var29_19 /* !! */ ;
                                        var12_6 = var31_11;
                                    }
                                    var33_44 = var18_21 /* !! */ ;
                                    var29_19 /* !! */  = \u0671.\u037f(XYQHiker.\u0529((String)var14_5));
                                    var18_21 /* !! */  = this.\u0782(var24_24);
                                    var14_5 = var18_21 /* !! */ ;
                                    if (!var18_21 /* !! */ .isEmpty()) ** GOTO lbl211
                                    var14_5 = var18_21 /* !! */ ;
                                    if (var1_42 != var2_41) ** GOTO lbl211
                                    var14_5 = this.\u0782(var32_45 /* !! */ );
lbl211:
                                    // 3 sources

                                    var7_50 = var14_5.contains(var36_23);
                                    var24_24 = SOY.d("2A150E23263B");
                                    var18_21 /* !! */  = var14_5;
                                    if (!var7_50) ** GOTO lbl217
                                    var18_21 /* !! */  = XYQHiker.getTextByRule((\u013a)var29_19 /* !! */ , (String)var14_5).replace(var24_24, (CharSequence)var17_20);
lbl217:
                                    // 2 sources

                                    if (!var18_21 /* !! */ .contains(var24_24)) break block172;
                                    var18_21 /* !! */  = var18_21 /* !! */ .replace(var24_24, (CharSequence)var17_20);
                                    var14_5 = SOY.d("5D");
                                    var24_24 = var18_21 /* !! */ .replaceAll((String)var14_5, "");
                                    break block173;
                                }
                                var24_24 = var18_21 /* !! */ ;
                            }
                            var18_21 /* !! */  = this.\u0782(var25_25);
                            var14_5 = var18_21 /* !! */ ;
                            if (!var18_21 /* !! */ .isEmpty()) break block174;
                            var14_5 = var18_21 /* !! */ ;
                            if (var1_42 != var2_41) break block174;
                            var14_5 = this.\u0782((String)var30_46);
                        }
                        var25_25 = var14_5;
                        if (var14_5.contains(var36_23)) {
                            var25_25 = XYQHiker.getTextByRule((\u013a)var29_19 /* !! */ , (String)var14_5);
                        }
                        var18_21 /* !! */  = this.\u0782((String)var19_18).split(var36_23);
                        var14_5 = XYQHiker.getTrueElement(var18_21 /* !! */ [0], (\u013a)var29_19 /* !! */ );
                        var3_43 = 1;
                        while (true) {
                            if (var3_43 >= var18_21 /* !! */ .length - 1) break;
                            var14_5 = XYQHiker.getTrueElement(var18_21 /* !! */ [var3_43], (\u013a)var14_5);
                            ++var3_43;
                            continue;
                            break;
                        }
                        var19_18 = XYQHiker.selectElements((\u013a)var14_5, var18_21 /* !! */ [var18_21 /* !! */ .length - 1]);
                        var34_22 /* !! */  = "";
                        var14_5 = var34_22 /* !! */ ;
                        var3_43 = 0;
                        var31_11 = var13_2;
                        var29_19 /* !! */  = var12_6;
                        var13_2 = var28_47;
                        var12_6 = var27_28;
                        var30_46 = var26_37;
                        var32_45 /* !! */  = var22_29;
                        var18_21 /* !! */  = var21_27;
                        var22_29 = var19_18;
                        var21_27 = var17_20;
                        var19_18 = var16_1;
                        var26_37 = var15_12;
                        var16_1 = var34_22 /* !! */ ;
                        while (true) {
                            block177: {
                                block176: {
                                    var4_51 = var22_29.size();
                                    if (var3_43 >= var4_51) break block175;
                                    var15_12 = var12_6;
                                    var17_20 = (\u013a)var22_29.get(var3_43);
                                    var15_12 = var12_6;
                                    var27_28 = this.\u0782(var26_37);
                                    var15_12 = var12_6;
                                    if (!var27_28.contains(var36_23)) break block176;
                                    var15_12 = var12_6;
                                    var27_28 = var27_28.split(var36_23);
                                    var15_12 = var12_6;
                                    var17_20 = XYQHiker.getTrueElement((String)var27_28[0], (\u013a)var17_20);
                                    var4_51 = 1;
                                    while (true) {
                                        var15_12 = var12_6;
                                        if (var4_51 >= ((Object)var27_28).length - 1) break;
                                        var15_12 = var12_6;
                                        var17_20 = XYQHiker.getTrueElement((String)var27_28[var4_51], (\u013a)var17_20);
                                        ++var4_51;
                                        continue;
                                        break;
                                    }
                                    var15_12 = var12_6;
                                    var15_12 = var17_20 = XYQHiker.selectElements((\u013a)var17_20, (String)var27_28[((Object)var27_28).length - 1]);
                                    break block177;
                                }
                                var15_12 = var12_6;
                                var15_12 = var17_20 = XYQHiker.selectElements((\u013a)var17_20, (String)var27_28);
                            }
                            var17_20 = var16_1;
                            var4_51 = 0;
                            var28_47 = var33_44;
                            var16_1 = var13_2;
                            var13_2 = var17_20;
                            var17_20 = var22_29;
                            var27_28 = var15_12;
                            while (true) {
                                block195: {
                                    block194: {
                                        block193: {
                                            block189: {
                                                block192: {
                                                    block191: {
                                                        block190: {
                                                            block188: {
                                                                block181: {
                                                                    block187: {
                                                                        block182: {
                                                                            block186: {
                                                                                block185: {
                                                                                    block184: {
                                                                                        block183: {
                                                                                            block180: {
                                                                                                block179: {
                                                                                                    block178: {
                                                                                                        var15_12 = var12_6;
                                                                                                        if (var4_51 >= var27_28.size()) break;
                                                                                                        var15_12 = var12_6;
                                                                                                        var38_40 = (\u013a)var27_28.get(var4_51);
                                                                                                        var15_12 = var12_6;
                                                                                                        var22_29 = var33_44 = this.\u0782((String)var30_46);
                                                                                                        var15_12 = var12_6;
                                                                                                        if (!var33_44.isEmpty()) break block178;
                                                                                                        var22_29 = var33_44;
                                                                                                        if (var1_42 != var2_41) break block178;
                                                                                                        var15_12 = var12_6;
                                                                                                        var22_29 = this.\u0782((String)var19_18);
                                                                                                    }
                                                                                                    if (var1_42 != 0) {
                                                                                                        var15_12 = var12_6;
                                                                                                        var22_29 = XYQHiker.getTextByRule((\u013a)var38_40, (String)var22_29);
                                                                                                    } else {
                                                                                                        var15_12 = var12_6;
                                                                                                        var22_29 = this.\u0789(com.github.catvod.spider.merge.\u0788.\u0787(var38_40.\u078b(), var22_29.split(var36_23)[0], var22_29.split(var36_23)[1]).get(0));
                                                                                                    }
                                                                                                    var33_44 = var30_46;
                                                                                                    var30_46 = var22_29;
                                                                                                    var15_12 = var12_6;
                                                                                                    if (!var22_29.contains(SOY.d("99D2DB"))) break block179;
                                                                                                    var30_46 = var22_29;
                                                                                                    var15_12 = var12_6;
                                                                                                    if (!var22_29.contains(SOY.d("99D2DA"))) break block179;
                                                                                                    var15_12 = var12_6;
                                                                                                    var30_46 = var22_29.split(SOY.d("99D2DB"))[1].split(SOY.d("99D2DA"))[0];
                                                                                                }
                                                                                                var15_12 = var12_6;
                                                                                                var22_29 = this.\u0782(var32_45 /* !! */ );
                                                                                                var15_12 = var12_6;
                                                                                                if (!var22_29.isEmpty() || var1_42 != var2_41) break block180;
                                                                                                var15_12 = var12_6;
                                                                                                var22_29 = this.\u0782((String)var31_11);
                                                                                            }
                                                                                            var15_12 = var12_6;
                                                                                            var7_50 = var22_29.isEmpty();
                                                                                            if (var7_50) break block181;
                                                                                            if (var22_29.startsWith(SOY.d("12262506"))) {
                                                                                                var13_2 = var22_29;
                                                                                                break block182;
                                                                                            }
                                                                                            if (var1_42 == 0) break block183;
                                                                                            var13_2 = var15_12 = XYQHiker.getTextByRule((\u013a)var38_40, (String)var22_29).trim();
                                                                                            break block184;
                                                                                        }
                                                                                        var15_12 = var38_40.\u078b();
                                                                                        var34_22 /* !! */  = var22_29.split(var36_23);
                                                                                        var13_2 = var15_12 = com.github.catvod.spider.merge.\u0788.\u0787((String)var15_12, var34_22 /* !! */ [0], var22_29.split(var36_23)[1]).get(0);
                                                                                    }
                                                                                    var7_50 = var13_2.contains(SOY.d("0F203D5E"));
                                                                                    if (!var7_50) break block185;
                                                                                    try {
                                                                                        var34_22 /* !! */  = var13_2.replaceAll(SOY.d("267420031B0341"), "").split(SOY.d("0F203D2A5C"));
                                                                                        if (var34_22 /* !! */ .length <= 1) break block185;
                                                                                    }
                                                                                    catch (Exception var22_31) {
                                                                                        break block187;
                                                                                    }
                                                                                    var15_12 = var34_22 /* !! */ [1];
                                                                                    var22_29 = var13_2;
                                                                                    try {
                                                                                        if (var15_12.contains((CharSequence)var29_19 /* !! */ )) {
                                                                                            var22_29 = var34_22 /* !! */ [1].split(SOY.d("267B"))[0].replaceAll(SOY.d("2175732B"), "");
                                                                                        }
                                                                                        break block186;
                                                                                    }
                                                                                    catch (Exception var22_30) {
                                                                                        break block187;
                                                                                    }
                                                                                }
                                                                                var22_29 = var13_2;
                                                                            }
                                                                            try {
                                                                                var13_2 = com.github.catvod.spider.merge.\u0788.\u052a(var21_27, (String)var22_29);
                                                                            }
                                                                            catch (Exception var15_14) {
                                                                                var13_2 = var22_29;
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                        }
                                                                        if (var6_36) {
                                                                            try {
                                                                                var13_2 = var15_12 = this.\u052f((String)var13_2, var21_27, var6_36);
                                                                                break block181;
                                                                            }
                                                                            catch (Exception var15_13) lbl-1000:
                                                                            // 3 sources

                                                                            {
                                                                                while (true) {
                                                                                    var22_29 = var15_12;
                                                                                    break block187;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break block181;
                                                                        catch (Exception var15_15) {
                                                                            ** continue;
                                                                        }
                                                                        catch (Exception var22_32) {
                                                                            break block187;
                                                                        }
                                                                        catch (Exception var22_33) {
                                                                            // empty catch block
                                                                        }
                                                                    }
                                                                    var15_12 = var12_6;
                                                                    SpiderDebug.log((Throwable)var22_29);
                                                                }
                                                                var15_12 = var12_6;
                                                                var22_29 = this.\u0782((String)var18_21 /* !! */ );
                                                                var15_12 = var12_6;
                                                                if (!var22_29.isEmpty() || var1_42 != var2_41) break block188;
                                                                var15_12 = var12_6;
                                                                var22_29 = this.\u0782((String)var28_47);
                                                            }
                                                            var15_12 = var12_6;
                                                            var7_50 = var22_29.isEmpty();
                                                            if (var7_50) break block189;
                                                            if (var1_42 == 0) break block190;
                                                            try {
                                                                var14_5 = var15_12 = XYQHiker.getTextByRule((\u013a)var38_40, (String)var22_29);
                                                                break block189;
                                                            }
                                                            catch (Exception var15_16) {
                                                                break block191;
                                                            }
                                                        }
                                                        var15_12 = var38_40.\u078b();
                                                        var34_22 /* !! */  = var22_29.split(var36_23);
                                                        try {
                                                            var14_5 = var15_12 = this.\u0789(com.github.catvod.spider.merge.\u0788.\u0787((String)var15_12, var34_22 /* !! */ [0], var22_29.split(var36_23)[1]).get(0));
                                                            break block189;
                                                        }
                                                        catch (Exception var22_34) {
                                                            break block192;
                                                        }
                                                        catch (Exception var15_17) {
                                                            // empty catch block
                                                        }
                                                    }
                                                    var22_29 = var15_12;
                                                }
                                                var15_12 = var12_6;
                                                SpiderDebug.log((Throwable)var22_29);
                                            }
                                            var34_22 /* !! */  = var29_19 /* !! */ ;
                                            var35_39 = var28_47;
                                            var15_12 = var12_6;
                                            var28_47 = this.\u0782((String)var20_26);
                                            var15_12 = var12_6;
                                            if (!var28_47.isEmpty() || var1_42 != var2_41) break block193;
                                            var15_12 = var12_6;
                                            var28_47 = this.\u0782((String)var16_1);
                                        }
                                        var22_29 = SOY.d("2609B7EDCB91F7F06B");
                                        if (var1_42 != 0) {
                                            var15_12 = var12_6;
                                            var22_29 = XYQHiker.getTextByRule((\u013a)var38_40, var28_47.split((String)var22_29)[0]);
                                        } else {
                                            var15_12 = var12_6;
                                            var22_29 = com.github.catvod.spider.merge.\u0788.\u0787(var38_40.\u078b(), var28_47.split((String)var22_29)[0].split(var36_23)[0], var28_47.split((String)var22_29)[0].split(var36_23)[1]).get(0);
                                        }
                                        var29_19 /* !! */  = var22_29;
                                        var15_12 = var12_6;
                                        if (!var28_47.contains(SOY.d("21B4CAC992FAD8"))) break block194;
                                        var15_12 = var12_6;
                                        var29_19 /* !! */  = com.github.catvod.spider.merge.\u0788.\u0783((String)var22_29, (String)var28_47);
                                    }
                                    var15_12 = var12_6;
                                    var15_12 = var12_6;
                                    var22_29 = new StringBuilder();
                                    var15_12 = var12_6;
                                    var22_29.append(var24_24);
                                    var15_12 = var12_6;
                                    var22_29.append((String)var29_19 /* !! */ );
                                    var15_12 = var12_6;
                                    var22_29.append(var25_25);
                                    var15_12 = var12_6;
                                    var22_29 = var28_47 = var22_29.toString();
                                    var15_12 = var12_6;
                                    if (!var28_47.contains(SOY.d("5D3B3F0601035D"))) break block195;
                                    var15_12 = var12_6;
                                    var22_29 = var28_47.replaceAll(SOY.d("5D3B3F0601035D"), (String)var29_19 /* !! */ );
                                }
                                var15_12 = var12_6;
                                var15_12 = var12_6;
                                var28_47 = new JSONObject();
                                var15_12 = var12_6;
                                var38_40 = SOY.d("0C3D35291D13");
                                var15_12 = var12_6;
                                var15_12 = var12_6;
                                var29_19 /* !! */  = new StringBuilder();
                                var15_12 = var12_6;
                                var29_19 /* !! */ .append((String)var30_46);
                                var15_12 = var12_6;
                                var29_19 /* !! */ .append(SOY.d("5E7675"));
                                var15_12 = var12_6;
                                var29_19 /* !! */ .append((String)var13_2);
                                var15_12 = var12_6;
                                var29_19 /* !! */ .append(SOY.d("5E7675"));
                                var15_12 = var12_6;
                                var29_19 /* !! */ .append((String)var22_29);
                                var15_12 = var12_6;
                                var28_47.put((String)var38_40, (Object)var29_19 /* !! */ .toString());
                                var15_12 = var12_6;
                                var28_47.put(SOY.d("0C3D35291A161737"), var30_46);
                                var15_12 = var12_6;
                                var28_47.put(SOY.d("0C3D3529041E19"), var13_2);
                                var15_12 = var12_6;
                                var28_47.put(SOY.d("0C3D352906121733231D07"), var14_5);
                                try {
                                    var12_6.put(var28_47);
                                    ++var4_51;
                                    var30_46 = var33_44;
                                    var28_47 = var35_39;
                                    var29_19 /* !! */  = var34_22 /* !! */ ;
                                }
                                catch (Exception var13_3) {
                                    break block196;
                                }
                            }
                            ++var3_43;
                            var15_12 = var13_2;
                            var13_2 = var16_1;
                            var16_1 = var15_12;
                            var22_29 = var17_20;
                            var33_44 = var28_47;
                        }
                        catch (Exception var13_4) {
                            var12_6 = var15_12;
                        }
                    }
                    try {
                        SpiderDebug.log((Throwable)var13_2);
                        var14_5 = var12_6;
                    }
                    catch (Exception var12_7) {}
                    if (this.\u0788) {
                        var14_5 = new StringBuilder();
                        var14_5.append(SOY.d("9EEAEA9FD5C29FDCD79FF5FA9FDAC69ED5DF9FD5EB9FE0EE95EECB"));
                        var14_5.append(var13_2.toString());
                        Init.show(var14_5.toString());
                        var14_5 = var12_6;
                    }
                    break block197;
                }
                var14_5 = var12_6;
            }
            var23_35.put(var37_38, var14_5);
lbl606:
            // 3 sources

            var12_6 = var23_35.toString();
            return var12_6;
            break block198;
            catch (Exception var12_8) {}
            break block198;
            catch (Exception var12_9) {
                // empty catch block
            }
        }
        SpiderDebug.log((Throwable)var12_10);
        if (this.\u0788) {
            var13_2 = new StringBuilder();
            var13_2.append(SOY.d("9EEAEA9FD5C29FD7F993C5F79FD5EB9FE0EE95EECB"));
            var13_2.append(var12_10.toString());
            Init.show(var13_2.toString());
        }
        return "";
    }

    /*
     * Unable to fully structure code
     */
    public void init(Context var1_1, String var2_2) {
        super.init(var1_1, (String)var2_2);
        this.\u0785 = var2_2;
        this.\u058f = new xc();
        var2_2 = new StringBuilder();
        var2_2.append(Init.context().getPackageName());
        var2_2.append(SOY.d("25222313121208373F151104"));
        var4_3 = var1_1.getSharedPreferences(var2_2.toString(), 0);
        XYQHiker.\u037f = var4_3;
        var5_5 = SOY.d("2A27331A1D1428373704110412063E1D1119");
        var2_2 = "";
        var4_3 = var4_3.getString(var5_5, "");
        if (var4_3.isEmpty()) {
            try {
                var5_5 = \u078c.\u058f(Proxy$3.localProxyUrl().replace(SOY.d("552223190C0E"), SOY.d("5534381A1158220B00222235152A7E17181E0E3D3A131A590E2A25")), null).trim();
                if (var5_5.length() == 32 && !(var3_6 = var5_5.isEmpty())) {
                    var2_2 = var5_5;
                }
                ** break block5
            }
            catch (Exception var4_4) {
                SpiderDebug.log((Throwable)var4_4);
            }
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = var4_3;
        }
        this.\u058f.init(var1_1, (String)var2_2);
    }

    public boolean isVideoFormat(String string) {
        this.\u052e();
        String[] stringArray = SOY.d("9CDBDA93FEDF9FC5D490FAD592F5D79FD6E693C1EF90FAD29FD7E29FE0D992FDDC");
        if (this.\u0782((String)stringArray).isEmpty()) {
            stringArray = SOY.d("2C3B35131B3115203C1700");
        }
        String[] stringArray2 = SOY.d("9CDBDA93FEDF9FC5D490FAD592F5D79FD6E693C1EF90FAD292EDD690CFD392FDDC");
        if (this.\u0782((String)stringArray2).isEmpty()) {
            stringArray2 = SOY.d("2C3B35131B31133E251306");
        }
        stringArray = this.\u0783((String)stringArray, SOY.d("543F62034C54543F214257591C3E2755021E1E373E59001809717F1B0444597C3C4215")).toLowerCase();
        String string2 = SOY.d("59");
        stringArray = stringArray.split(string2);
        stringArray2 = this.\u0783((String)stringArray2, SOY.d("473A25020454543A251B18")).toLowerCase().split(string2);
        string = string.toLowerCase();
        if ((string.contains(SOY.d("473A250204")) || string.contains(SOY.d("543A251B18"))) && !XYQHiker.checkstring(string)) {
            return false;
        }
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.contains(stringArray[i2])) continue;
            n2 = stringArray2.length;
            for (i2 = 0; i2 < n2; ++i2) {
                if (!string.contains(stringArray2[i2]) || XYQHiker.checkstring(string)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean manualVideoCheck() {
        this.\u052e();
        String string = SOY.d("9CCAFE93E4D19FEED193E4D89CDBDA93FEDF9FC5D490FAD5");
        if (this.\u0782(string).isEmpty()) {
            string = SOY.d("37333F03151B293C3810121208");
        }
        return this.\u0782(string).equals(SOY.d("4B")) || this.\u0782(string).equals(SOY.d("9CCAFE"));
        {
        }
    }

    /*
     * Exception decompiling
     */
    public String playerContent(String var1_1, String var2_29, List<String> var3_30) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [31 : 685->695)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String searchContent(String string, boolean bl) {
        return this.\u078a(string, SOY.d("4B"));
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.\u078a(string, string2);
    }

    protected String \u037f(String string, String object, String string2, Map<String, String> map) {
        try {
            SpiderDebug.log((String)string);
            \u078a.\u037f \u03f3 = new \u078a.\u037f(this){
                final XYQHiker \u0528;
                {
                    this.\u0528 = xYQHiker;
                }

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            \u078c.\u052e(\u078c.\u0529(), string, (String)object, map, \u03f3);
            object = ((Response)\u03f3.getResult()).body().bytes();
            string = new String((byte[])object, string2);
            string = string.replaceAll(SOY.d("772E5B"), "");
            return string;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    protected String \u052c(String string, String string2, Map<String, String> object) {
        String string3 = SOY.d("193E30184E5855");
        try {
            SpiderDebug.log((String)string);
            \u078a.\u037f \u03f3 = new \u078a.\u037f(this){
                final XYQHiker \u0528;
                {
                    this.\u0528 = xYQHiker;
                }

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            if (string.startsWith(string3)) {
                return \u078c.\u058f(string.replace(string3, Proxy$3.localProxyUrl().replace(SOY.d("552223190C0E"), SOY.d("5534381A1158"))), null);
            }
            \u078c.\u052a(\u078c.\u0529(), string, null, object, \u03f3);
            object = ((Response)\u03f3.getResult()).body().bytes();
            string = new String((byte[])object, string2);
            string = string.replaceAll(SOY.d("772E5B"), "");
            return string;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    protected String \u052d(String object, Map<String, String> object2, String string, Map<String, String> map) {
        try {
            SpiderDebug.log((String)object);
            \u078a.\u037f \u03f3 = new \u078a.\u037f(this){
                final XYQHiker \u0528;
                {
                    this.\u0528 = xYQHiker;
                }

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            \u078c.\u052d(\u078c.\u0529(), (String)object, object2, map, \u03f3);
            object = ((Response)\u03f3.getResult()).body().bytes();
            object2 = new String((byte[])object, string);
            object = ((String)object2).replaceAll(SOY.d("772E5B"), "");
            return object;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void \u052e() {
        String string = SOY.d("4A");
        String string2 = SOY.d("3E17132333");
        if (this.\u0786 != null) return;
        String string3 = this.\u0785;
        if (string3 == null) return;
        try {
            if (string3.startsWith(SOY.d("12262506"))) {
                JSONObject jSONObject;
                string3 = \u078c.\u058f(this.\u0785, null);
                this.\u0786 = jSONObject = new JSONObject(string3);
            } else {
                string3 = new JSONObject(this.\u0785);
                this.\u0786 = string3;
            }
            this.\u0787 = this.\u0783(SOY.d("35110329352733"), SOY.d("12262506074D557D30061D59143C7F151D581531235916414E7D25130C03"));
            boolean bl = this.\u0783(string2, string).equals(SOY.d("9CCAFE")) || this.\u0783(string2, string).equals(SOY.d("4B"));
            this.\u0788 = bl;
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    protected String \u052f(String string, String charSequence, boolean bl) {
        try {
            this.\u0783.put(SOY.d("08373713061208"), (Object)charSequence);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(SOY.d("3A1A3417101208216C"));
            ((StringBuilder)charSequence).append(this.\u0783.toString());
            charSequence = ((StringBuilder)charSequence).toString();
            return charSequence;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return string;
        }
    }

    protected HashMap<String, String> \u0780(String object) {
        HashMap<String, String> hashMap;
        block29: {
            String string;
            String string2;
            String string3;
            CharSequence charSequence;
            CharSequence charSequence2;
            block31: {
                block32: {
                    block33: {
                        block34: {
                            block35: {
                                String string4;
                                String string5;
                                String string6;
                                String string7;
                                String string8;
                                String string9;
                                String string10;
                                block30: {
                                    block23: {
                                        hashMap = new HashMap<String, String>();
                                        object = SOY.d("92FDE690C5F59FF6E593FBF59CC7E1");
                                        if (this.\u0782((String)object).isEmpty()) {
                                            object = SOY.d("32373012110509");
                                        }
                                        string10 = this.\u0783((String)object, "").trim();
                                        boolean bl = string10.contains(SOY.d("5E"));
                                        charSequence2 = SOY.d("92D9E890EAEB9DC6E49EF0E6");
                                        charSequence = SOY.d("371312292136");
                                        string9 = SOY.d("92D9E890EAEB9CDBDA90E8CD");
                                        string8 = SOY.d("331D02292136");
                                        string3 = SOY.d("393D3E1D1D12");
                                        string7 = SOY.d("9CDBDA90E8CD");
                                        string6 = SOY.d("371D133F3832250710");
                                        string5 = SOY.d("9DC6E49EF0E6");
                                        string4 = SOY.d("2A110E2335");
                                        string2 = SOY.d("0F21340459161D373F02");
                                        string = SOY.d("41");
                                        if (!bl) break block23;
                                        String[] stringArray = string10.split(SOY.d("59"));
                                        for (int i2 = 0; i2 < stringArray.length; ++i2) {
                                            CharSequence charSequence3;
                                            String string11;
                                            block28: {
                                                block24: {
                                                    block25: {
                                                        block26: {
                                                            block27: {
                                                                object = stringArray[i2].split(SOY.d("2676"));
                                                                string11 = object[0];
                                                                charSequence3 = object[1];
                                                                if (((String)charSequence3).equals(string4) || ((String)charSequence3).equals(string5)) break block24;
                                                                if (((String)charSequence3).equals(string6) || ((String)charSequence3).equals(string7)) break block25;
                                                                if (((String)charSequence3).equals(string8) || ((String)charSequence3).equals(string9)) break block26;
                                                                if (((String)charSequence3).equals(charSequence)) break block27;
                                                                object = charSequence3;
                                                                if (!((String)charSequence3).equals(charSequence2)) break block28;
                                                            }
                                                            object = \u052d;
                                                            break block28;
                                                        }
                                                        object = \u052c;
                                                        break block28;
                                                    }
                                                    object = \u052b;
                                                    break block28;
                                                }
                                                object = \u052a;
                                            }
                                            if (!(this.\u0620.isEmpty() && this.\u0781.isEmpty() || !string11.equalsIgnoreCase(SOY.d("193D3E1D1D12")))) {
                                                charSequence3 = new StringBuilder();
                                                ((StringBuilder)charSequence3).append((String)object);
                                                if (!this.\u0620.isEmpty()) {
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append(string);
                                                    ((StringBuilder)object).append(this.\u0620);
                                                    object = ((StringBuilder)object).toString();
                                                } else {
                                                    object = "";
                                                }
                                                ((StringBuilder)charSequence3).append((String)object);
                                                if (!this.\u0781.isEmpty()) {
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append(string);
                                                    ((StringBuilder)object).append(this.\u0781);
                                                    object = ((StringBuilder)object).toString();
                                                } else {
                                                    object = "";
                                                }
                                                ((StringBuilder)charSequence3).append((String)object);
                                                object = ((StringBuilder)charSequence3).toString();
                                            }
                                            if (string11.equalsIgnoreCase(string2)) {
                                                this.\u0783.put(string2, object);
                                            }
                                            bl = string11.equalsIgnoreCase(SOY.d("08373713061208"));
                                            charSequence3 = SOY.d("2D3733201D120D");
                                            if (!bl && !((String)object).equalsIgnoreCase((String)charSequence3)) {
                                                hashMap.put(string11, (String)object);
                                                continue;
                                            }
                                            if (((String)object).equalsIgnoreCase((String)charSequence3)) continue;
                                            hashMap.put(string11, (String)object);
                                        }
                                        if (!(this.\u0620.isEmpty() && this.\u0781.isEmpty() || this.\u0620.length() <= 1 && this.\u0781.length() <= 1 || string10.contains(SOY.d("393D3E1D1D125E")) || string10.contains(SOY.d("193D3E1D1D125E")))) {
                                            if (!this.\u0620.isEmpty()) {
                                                object = this.\u0781;
                                            } else {
                                                charSequence = new StringBuilder();
                                                ((StringBuilder)charSequence).append(this.\u0620);
                                                if (!this.\u0781.isEmpty()) {
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append(string);
                                                    ((StringBuilder)object).append(this.\u0781);
                                                    object = ((StringBuilder)object).toString();
                                                } else {
                                                    object = this.\u0781;
                                                }
                                                ((StringBuilder)charSequence).append((String)object);
                                                object = ((StringBuilder)charSequence).toString();
                                            }
                                            hashMap.put(string3, (String)object);
                                        }
                                        break block29;
                                    }
                                    if (!string10.isEmpty()) break block30;
                                    object = SOY.d("15393902000755617F4746594B63");
                                    break block31;
                                }
                                if (string10.equals(string4) || string10.equals(string5)) break block32;
                                if (string10.equals(string6) || string10.equals(string7)) break block33;
                                if (string10.equals(string8) || string10.equals(string9)) break block34;
                                if (string10.equals(charSequence)) break block35;
                                object = string10;
                                if (!string10.equals(charSequence2)) break block31;
                            }
                            object = \u052d;
                            break block31;
                        }
                        object = \u052c;
                        break block31;
                    }
                    object = \u052b;
                    break block31;
                }
                object = \u052a;
            }
            if (!(this.\u0620.isEmpty() && this.\u0781.isEmpty() || this.\u0620.length() <= 1 && this.\u0781.length() <= 1)) {
                if (!this.\u0620.isEmpty()) {
                    charSequence = this.\u0781;
                } else {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append(this.\u0620);
                    if (!this.\u0781.isEmpty()) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string);
                        ((StringBuilder)charSequence).append(this.\u0781);
                        charSequence = ((StringBuilder)charSequence).toString();
                    } else {
                        charSequence = this.\u0781;
                    }
                    ((StringBuilder)charSequence2).append((String)charSequence);
                    charSequence = ((StringBuilder)charSequence2).toString();
                }
                hashMap.put(string3, (String)charSequence);
            }
            hashMap.put(SOY.d("2F21340459361D373F02"), (String)object);
            this.\u0783.put(string2, object);
        }
        return hashMap;
    }

    protected HashMap<String, String> \u0784(String object) {
        HashMap<String, String> hashMap;
        block26: {
            String string;
            String string2;
            String string3;
            CharSequence charSequence;
            CharSequence charSequence2;
            block31: {
                block27: {
                    block28: {
                        block29: {
                            block30: {
                                String string4;
                                String string5;
                                String string6;
                                String string7;
                                String string8;
                                String string9;
                                String string10;
                                block20: {
                                    hashMap = new HashMap<String, String>();
                                    charSequence2 = SOY.d("9CC2CD91C0D592FDE690C5F59FF6E593FBF59CC7E1");
                                    if (this.\u0782((String)charSequence2).isEmpty()) {
                                        charSequence2 = SOY.d("291A341710120821");
                                    }
                                    string10 = this.\u0783((String)charSequence2, "").trim();
                                    boolean bl = string10.contains(SOY.d("5E"));
                                    charSequence = SOY.d("92D9E890EAEB9DC6E49EF0E6");
                                    charSequence2 = SOY.d("371312292136");
                                    string9 = SOY.d("92D9E890EAEB9CDBDA90E8CD");
                                    string8 = SOY.d("331D02292136");
                                    string3 = SOY.d("393D3E1D1D12");
                                    string7 = SOY.d("9CDBDA90E8CD");
                                    string6 = SOY.d("371D133F3832250710");
                                    string5 = SOY.d("9DC6E49EF0E6");
                                    string4 = SOY.d("2A110E2335");
                                    string2 = SOY.d("0F21340459161D373F02");
                                    string = SOY.d("41");
                                    if (!bl) break block20;
                                    String[] stringArray = string10.split(SOY.d("59"));
                                    for (int i2 = 0; i2 < stringArray.length; ++i2) {
                                        CharSequence charSequence3;
                                        String string11;
                                        block25: {
                                            block21: {
                                                block22: {
                                                    block23: {
                                                        block24: {
                                                            object = stringArray[i2].split(SOY.d("2676"));
                                                            string11 = object[0];
                                                            charSequence3 = object[1];
                                                            if (((String)charSequence3).equals(string4) || ((String)charSequence3).equals(string5)) break block21;
                                                            if (((String)charSequence3).equals(string6) || ((String)charSequence3).equals(string7)) break block22;
                                                            if (((String)charSequence3).equals(string8) || ((String)charSequence3).equals(string9)) break block23;
                                                            if (((String)charSequence3).equals(charSequence2)) break block24;
                                                            object = charSequence3;
                                                            if (!((String)charSequence3).equals(charSequence)) break block25;
                                                        }
                                                        object = \u052d;
                                                        break block25;
                                                    }
                                                    object = \u052c;
                                                    break block25;
                                                }
                                                object = \u052b;
                                                break block25;
                                            }
                                            object = \u052a;
                                        }
                                        if (!(this.\u0620.isEmpty() && this.\u0782.isEmpty() || !string11.equalsIgnoreCase(SOY.d("193D3E1D1D12")))) {
                                            charSequence3 = new StringBuilder();
                                            ((StringBuilder)charSequence3).append((String)object);
                                            if (!this.\u0620.isEmpty()) {
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append(string);
                                                ((StringBuilder)object).append(this.\u0620);
                                                object = ((StringBuilder)object).toString();
                                            } else {
                                                object = "";
                                            }
                                            ((StringBuilder)charSequence3).append((String)object);
                                            if (!this.\u0782.isEmpty()) {
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append(string);
                                                ((StringBuilder)object).append(this.\u0782);
                                                object = ((StringBuilder)object).toString();
                                            } else {
                                                object = "";
                                            }
                                            ((StringBuilder)charSequence3).append((String)object);
                                            object = ((StringBuilder)charSequence3).toString();
                                        }
                                        if (string11.equalsIgnoreCase(string2)) {
                                            this.\u0783.put(string2, object);
                                        }
                                        bl = string11.equalsIgnoreCase(SOY.d("08373713061208"));
                                        charSequence3 = SOY.d("2D3733201D120D");
                                        if (!bl && !((String)object).equalsIgnoreCase((String)charSequence3)) {
                                            hashMap.put(string11, (String)object);
                                            continue;
                                        }
                                        if (((String)object).equalsIgnoreCase((String)charSequence3)) continue;
                                        hashMap.put(string11, (String)object);
                                    }
                                    if (!(this.\u0620.isEmpty() && this.\u0782.isEmpty() || this.\u0620.length() <= 1 && this.\u0782.length() <= 1 || string10.contains(SOY.d("393D3E1D1D125E")) || string10.contains(SOY.d("193D3E1D1D125E")))) {
                                        charSequence2 = new StringBuilder();
                                        object = !this.\u0620.isEmpty() ? this.\u0782 : this.\u0620;
                                        ((StringBuilder)charSequence2).append((String)object);
                                        if (!this.\u0782.isEmpty()) {
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append(string);
                                            ((StringBuilder)object).append(this.\u0782);
                                            object = ((StringBuilder)object).toString();
                                        } else {
                                            object = this.\u0782;
                                        }
                                        ((StringBuilder)charSequence2).append((String)object);
                                        hashMap.put(string3, ((StringBuilder)charSequence2).toString());
                                    }
                                    break block26;
                                }
                                if (string10.isEmpty()) {
                                    return this.\u0780((String)object);
                                }
                                if (string10.equals(string4) || string10.equals(string5)) break block27;
                                if (string10.equals(string6) || string10.equals(string7)) break block28;
                                if (string10.equals(string8) || string10.equals(string9)) break block29;
                                if (string10.equals(charSequence2)) break block30;
                                object = string10;
                                if (!string10.equals(charSequence)) break block31;
                            }
                            object = \u052d;
                            break block31;
                        }
                        object = \u052c;
                        break block31;
                    }
                    object = \u052b;
                    break block31;
                }
                object = \u052a;
            }
            if (!(this.\u0620.isEmpty() && this.\u0782.isEmpty() || this.\u0620.length() <= 1 && this.\u0782.length() <= 1)) {
                charSequence = new StringBuilder();
                charSequence2 = !this.\u0620.isEmpty() ? this.\u0782 : this.\u0620;
                ((StringBuilder)charSequence).append((String)charSequence2);
                if (!this.\u0782.isEmpty()) {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append(string);
                    ((StringBuilder)charSequence2).append(this.\u0782);
                    charSequence2 = ((StringBuilder)charSequence2).toString();
                } else {
                    charSequence2 = this.\u0782;
                }
                ((StringBuilder)charSequence).append((String)charSequence2);
                hashMap.put(string3, ((StringBuilder)charSequence).toString());
            }
            hashMap.put(SOY.d("2F21340459361D373F02"), (String)object);
            this.\u0783.put(string2, object);
        }
        return hashMap;
    }

    String \u0789(String string) {
        return string.replaceAll(SOY.d("26743F14070741"), SOY.d("5A")).replaceAll(SOY.d("26740A17590D3B7F0B2B0F465663610B4F"), "").replaceAll(SOY.d("46090F48295D44"), "").replaceAll(SOY.d("217A7E485D4B27"), "").replaceAll(SOY.d("26212A44580A"), "");
    }
}

