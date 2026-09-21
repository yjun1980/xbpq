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
import com.github.catvod.spider.merge.\u0671;
import com.github.catvod.spider.merge.\u0786;
import com.github.catvod.spider.merge.\u0788;
import com.github.catvod.spider.merge.\u078a;
import com.github.catvod.spider.merge.\u078c;
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

public class XYQBiu
extends Spider {
    private static SharedPreferences \u037f;
    private static boolean \u0528;
    public static Pattern \u0529;
    public static String \u052a;
    public static String \u052b;
    public static String \u052c;
    public static String \u052d;
    private static String[] \u052e;
    public xc \u052f;
    private String \u058f = "";
    private String \u0620 = "";
    private String \u0780 = "";
    private String \u0781 = "";
    private JSONObject \u0782 = new JSONObject();
    private String \u0783 = SOY.d("210E060A2824067C0C5C4B3A1B31011A150E1F2012191A1113357F06181603372329181E09260A2A230B26012D58295D456F792D2820060E020A5A2A506D785A391619023D170D1208113E18121E1D7C351903191F200E1A1D040E");
    protected String \u0784 = null;
    protected JSONObject \u0785 = null;
    protected String \u0786 = null;

    static {
        \u0529 = Pattern.compile(SOY.d("523A25020404407D7E010300547A301A1D071B3C2D17181E03273F12061E0C3778581718177D22592F29580F7A5F"));
        \u052a = SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E4347405461675631131D7D604547594A7C615844");
        \u052b = SOY.d("373D2B1F181B1B7D64584457521E3818010F417210181005153B355645444172091F1518173B714747572A203E5F54360A223D132312181938025B4249657F45425752191922393B56723D1F1F125A1534151F185372121E061817377E47474454627F465A475A1F3E141D1B1F7202171216083B7E434740546167");
        \u052c = SOY.d("373D2B1F181B1B7D64584457523B011E1B191F69713524225A3B011E1B191F721E2554464C0D6156181E1137713B15145A1D02562C5E5A13210618122D37333D1D03556461435A46546364565C3C32061C3A5857163B3A1354301F313A195D572C3723051D18147D60405A475A1F3E141D1B1F7D604331464E6A712515111B20385942474E7C60");
        \u052d = SOY.d("373D2B1F181B1B7D64584457521F30151D190E3D221E4F57333C25131857373332563B245A0A714444284E626A560601406361465A4753721006041B1F0534143F1E0E7D644543594D677F47405752191922393B56723D1F1F125A1534151F18537207130604133D3F59454254627F4654241B3430041D584B676146");
        \u052e = new String[]{SOY.d("1B38300E5B011F2038100D28193A34151F"), SOY.d("1B38300E5A0712226E17174A193D35132B141237321D"), SOY.d("552434041D11037D38181012027C3902191B"), SOY.d("4521321E11141113124B171F1F313A")};
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
    private JSONObject \u0528(String var1_1, String var2_5, boolean var3_15, HashMap<String, String> var4_16) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [59[WHILELOOP]], but top level block is 10[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
    private JSONObject \u052a(String var1_1, String var2_6, String var3_7, String var4_8, String var5_11, String var6_12, String var7_17, String var8_18, String var9_19, String var10_20, String var11_23, String var12_24, String var13_28, String var14_29) {
        var18_30 = var7_17;
        var20_39 /* !! */  = SOY.d("5C");
        try {
            var19_46 /* !! */  = new JSONArray();
            var22_48 = new JSONObject();
            var23_49 /* !! */  = var1_1.split((String)var20_39 /* !! */ );
            var21_50 = new ArrayList();
            var16_51 = var23_49 /* !! */ .length;
            var1_1 = var19_46 /* !! */ ;
            for (var15_52 = 0; var15_52 < var16_51; ++var15_52) {
                var21_50.add(var23_49 /* !! */ [var15_52].replaceAll(SOY.d("95EED799C8F1"), (String)var20_39 /* !! */ ));
            }
            var19_46 /* !! */  = var4_8;
            var20_39 /* !! */  = var6_12;
            var6_12 = var10_20;
            var4_8 = var12_24;
            var10_20 = var14_29;
            var12_24 = var8_18;
            var14_29 = var21_50;
            var8_18 = var20_39 /* !! */ ;
            var23_49 /* !! */  = var1_1;
            var1_1 = var19_46 /* !! */ ;
        }
        catch (Exception var1_5) {
            SpiderDebug.log((Throwable)var1_5);
            return null;
        }
        {
            ** for (var15_52 = 0;
            ; var15_52 < (var16_51 = var14_29.size()); ++var15_52)
        }
lbl-1000:
        // 1 sources

        {
            block110: {
                block111: {
                    block88: {
                        block94: {
                            block109: {
                                block100: {
                                    block107: {
                                        block104: {
                                            block108: {
                                                block105: {
                                                    block106: {
                                                        block98: {
                                                            block103: {
                                                                block102: {
                                                                    block101: {
                                                                        block99: {
                                                                            block95: {
                                                                                block92: {
                                                                                    block96: {
                                                                                        block97: {
                                                                                            block93: {
                                                                                                block85: {
                                                                                                    block87: {
                                                                                                        block89: {
                                                                                                            block91: {
                                                                                                                block90: {
                                                                                                                    block86: {
                                                                                                                        try {
                                                                                                                            var17_53 = var3_7.isEmpty();
                                                                                                                        }
                                                                                                                        catch (Exception var20_45) {
                                                                                                                            var24_54 = var10_20;
                                                                                                                            var21_50 = var12_24;
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var12_24 = var8_18;
                                                                                                                            var10_20 = var1_1;
                                                                                                                            var8_18 = var24_54;
                                                                                                                            var1_1 = var21_50;
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
                                                                                                                            if (!var2_6.contains(SOY.d("01313002113E1E2F"))) ** GOTO lbl-1000
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
lbl59:
                                                                                                                        // 2 sources

                                                                                                                        while (true) {
                                                                                                                            var19_46 /* !! */  = var6_12;
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var18_30 = var12_24;
                                                                                                                            var12_24 = var1_1;
                                                                                                                            break block85;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        var27_57 = SOY.d("9FDAD791C5CC");
                                                                                                                        var28_58 /* !! */  = SOY.d("193325133D13");
                                                                                                                        if (!var17_53) ** GOTO lbl96
                                                                                                                        if (var3_7.contains((CharSequence)var25_55)) {
                                                                                                                            var29_59 /* !! */  = var3_7.split((String)var24_54);
                                                                                                                            var20_39 /* !! */  = var18_30;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                        }
                                                                                                                        ** GOTO lbl96
                                                                                                                        {
                                                                                                                            catch (Exception var1_2) {
                                                                                                                                ** continue;
                                                                                                                            }
                                                                                                                            var30_60 = var18_30.split((String)var24_54);
                                                                                                                            var1_1 = var18_30;
                                                                                                                            var20_39 /* !! */  = var18_30;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                            if (var15_52 < var30_60.length) {
                                                                                                                                var1_1 = var18_30;
                                                                                                                                var20_39 /* !! */  = var18_30;
                                                                                                                                var19_46 /* !! */  = var8_18;
                                                                                                                                if (!var30_60[var15_52].equals(var21_50)) {
                                                                                                                                    var20_39 /* !! */  = var18_30;
                                                                                                                                    var19_46 /* !! */  = var8_18;
                                                                                                                                    var23_49 /* !! */ .put((Object)this.\u0620((String)var28_58 /* !! */ , (String)var27_57, var29_59 /* !! */ [var15_52], var30_60[var15_52]));
                                                                                                                                    var1_1 = var18_30;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            ** GOTO lbl-1000
lbl96:
                                                                                                                            // 2 sources

                                                                                                                            var20_39 /* !! */  = var18_30;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                            var23_49 /* !! */ .put((Object)this.\u0620((String)var28_58 /* !! */ , (String)var27_57, var3_7, (String)var18_30));
                                                                                                                            var1_1 = var18_30;
                                                                                                                        }
lbl-1000:
                                                                                                                        // 5 sources

                                                                                                                        {
                                                                                                                            if (var17_53 = var5_11.isEmpty()) break block86;
                                                                                                                            var20_39 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                        }
                                                                                                                        {
                                                                                                                            if (var8_18.isEmpty()) break block86;
                                                                                                                            var20_39 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                            if (!var2_6.contains(SOY.d("01313D17070407"))) break block86;
                                                                                                                            var18_30 = var8_18;
                                                                                                                            var20_39 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                                            if (var8_18.equals(var26_56)) {
                                                                                                                                var18_30 = var5_11;
                                                                                                                            }
                                                                                                                            var20_39 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                                                                        }
                                                                                                                        var30_60 = SOY.d("9DE3EA93EAFC");
                                                                                                                        var29_59 /* !! */  = SOY.d("193E300507");
                                                                                                                        if (!var17_53) ** GOTO lbl142
                                                                                                                        var20_39 /* !! */  = var1_1;
                                                                                                                        var19_46 /* !! */  = var18_30;
                                                                                                                        {
                                                                                                                            if (var5_11.contains((CharSequence)var25_55)) {
                                                                                                                                var20_39 /* !! */  = var1_1;
                                                                                                                                var19_46 /* !! */  = var18_30;
                                                                                                                                var28_58 /* !! */  = var5_11.split((String)var24_54);
                                                                                                                                var20_39 /* !! */  = var1_1;
                                                                                                                                var19_46 /* !! */  = var18_30;
                                                                                                                                var27_57 = var18_30.split((String)var24_54);
                                                                                                                                var20_39 /* !! */  = var1_1;
                                                                                                                                var19_46 /* !! */  = var18_30;
                                                                                                                                var8_18 = var18_30;
                                                                                                                                if (var15_52 >= var27_57.length) break block86;
                                                                                                                                var20_39 /* !! */  = var1_1;
                                                                                                                                var19_46 /* !! */  = var18_30;
                                                                                                                                var8_18 = var18_30;
                                                                                                                                if (!var27_57[var15_52].equals(var21_50)) {
                                                                                                                                    var20_39 /* !! */  = var1_1;
                                                                                                                                    var19_46 /* !! */  = var18_30;
                                                                                                                                    var23_49 /* !! */ .put((Object)this.\u0620((String)var29_59 /* !! */ , (String)var30_60, var28_58 /* !! */ [var15_52], var27_57[var15_52]));
                                                                                                                                    var8_18 = var18_30;
                                                                                                                                }
                                                                                                                                break block86;
                                                                                                                            }
lbl142:
                                                                                                                            // 3 sources

                                                                                                                            var20_39 /* !! */  = var1_1;
                                                                                                                            var19_46 /* !! */  = var18_30;
                                                                                                                            var23_49 /* !! */ .put((Object)this.\u0620((String)var29_59 /* !! */ , (String)var30_60, var5_11, (String)var18_30));
                                                                                                                            var8_18 = var18_30;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        var17_53 = var7_17.isEmpty();
                                                                                                                        if (var17_53) break block87;
                                                                                                                    }
                                                                                                                    catch (Exception var20_44) {
                                                                                                                        var18_30 = var4_8;
                                                                                                                        var19_46 /* !! */  = var6_12;
                                                                                                                        var6_12 = var12_24;
                                                                                                                        var4_8 = var20_44;
                                                                                                                        var12_24 = var19_46 /* !! */ ;
                                                                                                                        break block88;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var12_24.isEmpty() || !(var17_53 = var2_6.contains(SOY.d("01332313150A")))) break block87;
                                                                                                                    }
                                                                                                                    catch (Exception var18_32) {
                                                                                                                        // empty catch block
                                                                                                                        break block89;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        var17_53 = var12_24.equals(var26_56);
                                                                                                                        var18_30 = var17_53 ? var7_17 : var12_24;
                                                                                                                    }
                                                                                                                    catch (Exception var18_31) {
                                                                                                                        break block89;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                                                                    }
                                                                                                                    catch (Exception var12_27) {
                                                                                                                        // empty catch block
                                                                                                                        break block90;
                                                                                                                    }
                                                                                                                    var27_57 = SOY.d("9FCEE193F8CD");
                                                                                                                    var19_46 /* !! */  = SOY.d("1B203417");
                                                                                                                    if (!var17_53) ** GOTO lbl197
                                                                                                                    if (var7_17.contains((CharSequence)var25_55)) {
                                                                                                                        var28_58 /* !! */  = var7_17.split((String)var24_54);
                                                                                                                        var20_39 /* !! */  = var18_30.split((String)var24_54);
                                                                                                                        var12_24 = var18_30;
                                                                                                                    }
                                                                                                                    ** GOTO lbl197
                                                                                                                    {
                                                                                                                        catch (Exception var12_25) {
                                                                                                                            break block90;
                                                                                                                        }
                                                                                                                        ** try [egrp 14[TRYBLOCK] [31 : 879->958)] { 
lbl190:
                                                                                                                        // 1 sources

                                                                                                                        if (var15_52 >= var20_39 /* !! */ .length) break block87;
                                                                                                                        var12_24 = var18_30;
                                                                                                                        if (var20_39 /* !! */ [var15_52].equals(var21_50)) break block87;
                                                                                                                        var23_49 /* !! */ .put((Object)this.\u0620((String)var19_46 /* !! */ , (String)var27_57, var28_58 /* !! */ [var15_52], var20_39 /* !! */ [var15_52]));
                                                                                                                        var12_24 = var18_30;
                                                                                                                        break block87;
lbl197:
                                                                                                                        // 2 sources

                                                                                                                        var23_49 /* !! */ .put((Object)this.\u0620((String)var19_46 /* !! */ , (String)var27_57, var7_17, (String)var18_30));
                                                                                                                        var12_24 = var18_30;
                                                                                                                        break block87;
                                                                                                                    }
lbl201:
                                                                                                                    // 1 sources

                                                                                                                    catch (Exception var12_26) {
                                                                                                                        var20_39 /* !! */  = var1_1;
                                                                                                                        var1_1 = var12_26;
                                                                                                                        break block91;
                                                                                                                    }
                                                                                                                }
                                                                                                                var20_39 /* !! */  = var1_1;
                                                                                                                var1_1 = var12_24;
                                                                                                            }
                                                                                                            var21_50 = var4_8;
                                                                                                            var4_8 = var1_1;
                                                                                                            var1_1 = var18_30;
                                                                                                            var12_24 = var6_12;
                                                                                                            var19_46 /* !! */  = var8_18;
                                                                                                            break block111;
                                                                                                        }
                                                                                                        var19_46 /* !! */  = var12_24;
                                                                                                        var12_24 = var6_12;
                                                                                                        var12_24 = var18_30;
                                                                                                        var18_30 = var19_46 /* !! */ ;
                                                                                                        var19_46 /* !! */  = var1_1;
                                                                                                        break block85;
                                                                                                    }
                                                                                                    var19_46 /* !! */  = var7_17;
                                                                                                    try {
                                                                                                        var17_53 = var9_19.isEmpty();
                                                                                                        if (var17_53) break block92;
                                                                                                        break block93;
                                                                                                    }
                                                                                                    catch (Exception var18_38) {
                                                                                                        var20_39 /* !! */  = var8_18;
                                                                                                        var8_18 = var10_20;
                                                                                                        var10_20 = var18_38;
                                                                                                        break block94;
                                                                                                    }
                                                                                                }
lbl234:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var1_1 = var19_46 /* !! */ ;
                                                                                                    var19_46 /* !! */  = var4_8;
                                                                                                    var20_39 /* !! */  = var6_12;
                                                                                                    var6_12 = var18_30;
                                                                                                    var4_8 = var12_24;
                                                                                                    break block95;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var6_12.isEmpty() || !(var17_53 = var2_6.contains(SOY.d("012B3417060A")))) break block92;
                                                                                            }
                                                                                            catch (Exception var18_34) {
                                                                                                // empty catch block
                                                                                                break block96;
                                                                                            }
                                                                                            try {
                                                                                                var17_53 = var6_12.equals(var26_56);
                                                                                                var18_30 = var17_53 ? var9_19 : var6_12;
                                                                                            }
                                                                                            catch (Exception var18_33) {
                                                                                                break block96;
                                                                                            }
                                                                                            try {
                                                                                                var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                                            }
                                                                                            catch (Exception var6_16) {
                                                                                                // empty catch block
                                                                                                break block97;
                                                                                            }
                                                                                            var29_59 /* !! */  = SOY.d("9FEBE592CFCA");
                                                                                            var28_58 /* !! */  = SOY.d("03373004");
                                                                                            if (!var17_53) ** GOTO lbl284
                                                                                            if (var9_19.contains((CharSequence)var25_55)) {
                                                                                                var27_57 = var9_19.split((String)var24_54);
                                                                                            }
                                                                                            ** GOTO lbl284
                                                                                            {
                                                                                                catch (Exception var6_14) {
                                                                                                    break block97;
                                                                                                }
                                                                                                try {
                                                                                                    var20_39 /* !! */  = var18_30.split((String)var24_54);
                                                                                                    var6_12 = var18_30;
                                                                                                }
                                                                                                catch (Exception var6_13) {
                                                                                                    break block97;
                                                                                                }
                                                                                                ** try [egrp 21[TRYBLOCK] [40 : 1162->1249)] { 
lbl277:
                                                                                                // 1 sources

                                                                                                if (var15_52 >= var20_39 /* !! */ .length) break block92;
                                                                                                var6_12 = var18_30;
                                                                                                if (!var20_39 /* !! */ [var15_52].equals(var21_50)) {
                                                                                                    var23_49 /* !! */ .put((Object)this.\u0620((String)var28_58 /* !! */ , (String)var29_59 /* !! */ , var27_57[var15_52], var20_39 /* !! */ [var15_52]));
                                                                                                    var6_12 = var18_30;
                                                                                                }
                                                                                                break block92;
lbl284:
                                                                                                // 2 sources

                                                                                                var23_49 /* !! */ .put((Object)this.\u0620((String)var28_58 /* !! */ , (String)var29_59 /* !! */ , var9_19, (String)var18_30));
                                                                                                var6_12 = var18_30;
                                                                                                break block92;
                                                                                            }
lbl288:
                                                                                            // 1 sources

                                                                                            catch (Exception var6_15) {}
                                                                                        }
                                                                                        var19_46 /* !! */  = var4_8;
                                                                                        var4_8 = var6_12;
                                                                                        var6_12 = var12_24;
                                                                                        var12_24 = var18_30;
                                                                                        var18_30 = var19_46 /* !! */ ;
                                                                                        break block88;
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
                                                                                    if (var17_53) break block98;
                                                                                    break block99;
                                                                                }
                                                                                catch (Exception var20_43) {
                                                                                    // empty catch block
                                                                                    break block100;
                                                                                }
                                                                            }
lbl312:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var12_24 = var20_39 /* !! */ ;
                                                                                var18_30 = var19_46 /* !! */ ;
                                                                                break block88;
                                                                                break;
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (var4_8.isEmpty() || !(var17_53 = var2_6.contains(SOY.d("013E3018130A")))) break block98;
                                                                            var20_39 /* !! */  = var4_8;
                                                                            var18_30 = var20_39 /* !! */ ;
                                                                            var4_8 = var20_39 /* !! */ ;
                                                                        }
                                                                        catch (Exception var18_36) {
                                                                            // empty catch block
                                                                            break block101;
                                                                        }
                                                                        try {
                                                                            if (var20_39 /* !! */ .equals(var26_56)) {
                                                                                var18_30 = var11_23;
                                                                            }
                                                                            var4_8 = var18_30;
                                                                            var17_53 = var18_30.contains((CharSequence)var25_55);
                                                                        }
                                                                        catch (Exception var18_35) {
                                                                            break block101;
                                                                        }
                                                                        var28_58 /* !! */  = SOY.d("92FDFC9EDCF7");
                                                                        var27_57 = SOY.d("16333F11");
                                                                        if (!var17_53) ** GOTO lbl355
                                                                        if (var11_23.contains((CharSequence)var25_55)) {
                                                                            var20_39 /* !! */  = var11_23.split((String)var24_54);
                                                                            var29_59 /* !! */  = var18_30.split((String)var24_54);
                                                                            var4_8 = var18_30;
                                                                        }
                                                                        ** GOTO lbl355
                                                                        {
                                                                            catch (Exception var4_9) {
                                                                                var19_46 /* !! */  = var18_30;
                                                                                break block102;
                                                                            }
                                                                            ** try [egrp 26[TRYBLOCK] [48 : 1444->1530)] { 
lbl348:
                                                                            // 1 sources

                                                                            if (var15_52 >= var29_59 /* !! */ .length) break block98;
                                                                            var4_8 = var18_30;
                                                                            if (!var29_59 /* !! */ [var15_52].equals(var21_50)) {
                                                                                var23_49 /* !! */ .put((Object)this.\u0620((String)var27_57, (String)var28_58 /* !! */ , var20_39 /* !! */ [var15_52], var29_59 /* !! */ [var15_52]));
                                                                                var4_8 = var18_30;
                                                                            }
                                                                            break block98;
lbl355:
                                                                            // 2 sources

                                                                            var23_49 /* !! */ .put((Object)this.\u0620((String)var27_57, (String)var28_58 /* !! */ , var11_23, (String)var18_30));
                                                                            var4_8 = var18_30;
                                                                            break block98;
                                                                        }
lbl359:
                                                                        // 1 sources

                                                                        catch (Exception var4_10) {
                                                                            break block103;
                                                                        }
                                                                    }
                                                                    var19_46 /* !! */  = var4_8;
                                                                    var4_8 = var18_30;
                                                                }
                                                                var18_30 = var19_46 /* !! */ ;
                                                            }
                                                            var20_39 /* !! */  = var6_12;
                                                            var6_12 = var12_24;
                                                            var19_46 /* !! */  = var18_30;
                                                            ** continue;
                                                        }
                                                        try {
                                                            var17_53 = var13_28.isEmpty();
                                                            if (var17_53) break block104;
                                                        }
                                                        catch (Exception var20_42) {
                                                            break block100;
                                                        }
                                                        try {
                                                            if (var10_20.isEmpty() || !(var17_53 = var2_6.contains(SOY.d("0130280B")))) break block104;
                                                            var20_39 /* !! */  = var10_20;
                                                            var10_20 = var20_39 /* !! */ ;
                                                            var18_30 = var20_39 /* !! */ ;
                                                        }
                                                        catch (Exception var20_41) {
                                                            // empty catch block
                                                            break block105;
                                                        }
                                                        try {
                                                            if (var20_39 /* !! */ .equals(var26_56)) {
                                                                var10_20 = var13_28;
                                                            }
                                                            var18_30 = var10_20;
                                                            var17_53 = var10_20.contains((CharSequence)var25_55);
                                                        }
                                                        catch (Exception var20_40) {
                                                            var10_20 = var18_30;
                                                            break block105;
                                                        }
                                                        var26_56 = SOY.d("9CDCC393CEF8");
                                                        var20_39 /* !! */  = SOY.d("182B");
                                                        if (var17_53) {
                                                            try {
                                                                if (!var13_28.contains((CharSequence)var25_55)) break block106;
                                                                var25_55 = var13_28.split((String)var24_54);
                                                                var24_54 = var10_20.split((String)var24_54);
                                                                var18_30 = var10_20;
                                                                if (var15_52 >= var24_54.length) break block107;
                                                                var18_30 = var10_20;
                                                                if (!var24_54[var15_52].equals(var21_50)) {
                                                                    var23_49 /* !! */ .put((Object)this.\u0620((String)var20_39 /* !! */ , var26_56, var25_55[var15_52], var24_54[var15_52]));
                                                                    var18_30 = var10_20;
                                                                }
                                                                break block107;
                                                            }
                                                            catch (Exception var18_37) {
                                                                break block108;
                                                            }
                                                        }
                                                    }
                                                    var23_49 /* !! */ .put((Object)this.\u0620((String)var20_39 /* !! */ , var26_56, var13_28, (String)var10_20));
                                                    var18_30 = var10_20;
                                                    break block107;
                                                }
                                                var18_30 = var20_39 /* !! */ ;
                                            }
                                            var20_39 /* !! */  = var8_18;
                                            var21_50 = var1_1;
                                            var1_1 = var12_24;
                                            var8_18 = var10_20;
                                            var10_20 = var21_50;
                                            var12_24 = var20_39 /* !! */ ;
                                            ** GOTO lbl-1000
                                        }
                                        var18_30 = var10_20;
                                    }
                                    var20_39 /* !! */  = var14_29;
                                    try {
                                        var10_20 = (String)var20_39 /* !! */ .get(var15_52);
                                    }
                                    catch (Exception var10_22) {
                                        break block109;
                                    }
                                    try {
                                        var22_48.put((String)var10_20, (Object)var23_49 /* !! */ );
                                        var21_50 = new JSONArray();
                                        var14_29 = var8_18;
                                        var10_20 = var1_1;
                                        var1_1 = var12_24;
                                        var23_49 /* !! */  = var21_50;
                                        var8_18 = var18_30;
                                        var12_24 = var14_29;
                                        var14_29 = var20_39 /* !! */ ;
                                        break block110;
                                    }
                                    catch (Exception var10_21) {
                                        break block109;
                                    }
                                }
                                var18_30 = var10_20;
                                var10_20 = var20_39 /* !! */ ;
                            }
                            var20_39 /* !! */  = var8_18;
                            var8_18 = var18_30;
                        }
                        var21_50 = var1_1;
                        var1_1 = var12_24;
                        var18_30 = var10_20;
                        var10_20 = var21_50;
                        var12_24 = var20_39 /* !! */ ;
                        ** GOTO lbl-1000
                    }
                    var19_46 /* !! */  = var8_18;
                    var20_39 /* !! */  = var1_1;
                    var21_50 = var18_30;
                    var1_1 = var6_12;
                }
                var24_54 = var7_17;
                var8_18 = var10_20;
                var18_30 = var4_8;
                var6_12 = var12_24;
                var4_8 = var21_50;
                var10_20 = var20_39 /* !! */ ;
                var12_24 = var19_46 /* !! */ ;
                var19_46 /* !! */  = var24_54;
lbl-1000:
                // 4 sources

                {
                    SpiderDebug.log((Throwable)var18_30);
                }
            }
            var21_50 = var1_1;
            var20_39 /* !! */  = var8_18;
            var18_30 = var19_46 /* !! */ ;
            var1_1 = var10_20;
            var8_18 = var12_24;
            var12_24 = var21_50;
            var10_20 = var20_39 /* !! */ ;
            continue;
        }
lbl488:
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

    /*
     * Unable to fully structure code
     */
    private JSONObject \u0620(String var1_1, String var2_3, String var3_4, String var4_5) {
        block13: {
            block12: {
                var15_6 = SOY.d("93E9C99EDAD3");
                var7_7 = SOY.d("9FD7F99FF7DF");
                var14_8 = SOY.d("182B");
                var11_9 = SOY.d("5C");
                var8_10 = new JSONObject();
                var9_11 = new JSONArray();
                var6_12 = var1_1.equals(var14_8);
                var12_13 = SOY.d("0C");
                var10_14 = SOY.d("14");
                var13_15 = SOY.d("9DFBEB");
                if (var6_12) break block12;
                if (var4_5.equals(var13_15) || var3_4.contains(var7_7)) break block12;
                var8_10.put(var10_14, (Object)var7_7);
                var8_10.put(var12_13, (Object)"");
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
                var8_10.put(var10_14, (Object)var15_6);
                var8_10.put(var12_13, (Object)"");
                var9_11.put((Object)var8_10);
                var7_7 = new JSONObject();
            }
lbl40:
            // 6 sources

            if (!var4_5.contains(var11_9) || var4_5.equals(var13_15)) break block13;
            var3_4 = var3_4.split(var11_9);
            var4_5 = var4_5.split(var11_9);
            var5_16 = 0;
            while (true) {
                if (var5_16 < ((JSONObject)var3_4).length) {
                    var7_7.put(var10_14, (Object)var3_4[var5_16]);
                    var7_7.put(var12_13, (Object)var4_5[var5_16].replaceAll(SOY.d("95EED799C8F1"), var11_9));
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
                var7_7.put(var10_14, (Object)var3_4);
                var7_7.put(var12_13, (Object)var4_5);
                var9_11.put((Object)var7_7);
            }
lbl66:
            // 4 sources

            var3_4 = new JSONObject();
            var3_4.put(SOY.d("113728"), (Object)var1_1);
            var3_4.put(SOY.d("14333C13"), (Object)var2_3);
            var3_4.put(SOY.d("0C333D0311"), (Object)var9_11);
            return var3_4;
        }
        catch (Exception var1_2) {
            SpiderDebug.log((Throwable)var1_2);
            return null;
        }
    }

    private String \u0780(String string) {
        return this.\u0781(string, "");
    }

    private String \u0781(String string, String string2) {
        if (!((string = this.\u0785.optString(string)).isEmpty() || string.equals(SOY.d("9DFBEB")) || string.equals(SOY.d("5C74")))) {
            return string;
        }
        return string2;
    }

    private String \u0783(String string, String object, String hashMap) {
        hashMap = ((String)((Object)hashMap)).equals(SOY.d("093A3E01")) ? this.\u058f(string) : this.\u0782(string);
        for (int i2 = 0; i2 < 3; ++i2) {
            Object object2;
            String string2;
            String string3;
            block8: {
                String string4;
                block7: {
                    boolean bl = ((String)object).contains(SOY.d("553A2417101814350E"));
                    string3 = SOY.d("772E5B");
                    string2 = SOY.d("93F8DD9EDBF6467D251F001B1F6C");
                    string4 = SOY.d("552034181E1E25");
                    if (bl) break block7;
                    object2 = object;
                    if (!((String)object).contains(string4)) break block8;
                }
                String string5 = this.\u052c(\u0788.\u052a(string, \u0671.\u037f((String)object).\u08b3(SOY.d("183D350F")).\u052d(SOY.d("0931231F0403")).\u037f(SOY.d("092032"))), this.\u0781, hashMap);
                object2 = SOY.d("1137284B56");
                CharSequence charSequence = SOY.d("58");
                String string6 = \u0788.\u0787(string5, (String)object2, (String)charSequence).get(0);
                object2 = \u0788.\u0787(string5, SOY.d("0C333D03114A58"), (String)charSequence).get(0);
                string5 = \u0788.\u0787(string5, SOY.d("197C3613005F587D304444151F6A684F"), (String)charSequence).get(0);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(SOY.d("553363461612426B68"));
                ((StringBuilder)charSequence).append(string5);
                ((StringBuilder)charSequence).append(string6);
                ((StringBuilder)charSequence).append(SOY.d("5C24301A011247"));
                object = ((String)object).contains(string4) ? SOY.d("1E3822") : SOY.d("1236");
                ((StringBuilder)charSequence).append(com.github.catvod.spider.merge.\u0786.\u037f(XYQBiu.string2Hex((String)object2, (String)object), com.github.catvod.spider.merge.\u0786.\u0529));
                object = \u0788.\u052a(string, ((StringBuilder)charSequence).toString());
                object2 = new HashMap();
                \u078c.\u0620((String)object, hashMap, (Map<String, List<String>>)object2);
                object = object2.entrySet().iterator();
                while (object.hasNext()) {
                    object2 = (Map.Entry)object.next();
                    if (!((String)object2.getKey()).equalsIgnoreCase(SOY.d("0937255B171815393813"))) continue;
                    object = (Iterable)object2.getValue();
                    this.\u0780 = TextUtils.join((CharSequence)SOY.d("41"), (Iterable)object);
                    break;
                }
                object2 = object = this.\u052c(string, this.\u0781, hashMap);
                if (!((String)object).contains(string2)) {
                    return ((String)object).replaceAll(string3, "");
                }
            }
            if (!((String)object2).contains(string2)) {
                return ((String)object2).replaceAll(string3, "");
            }
            object = object2;
        }
        return null;
    }

    private String \u0784(String string, String charSequence, String hashMap) {
        hashMap = ((String)((Object)hashMap)).equals(SOY.d("093A3E01")) ? this.\u058f(string) : this.\u0782(string);
        Object object = charSequence;
        for (int i2 = 0; i2 < 3; ++i2) {
            boolean bl = ((String)object).contains(SOY.d("9CF1D190C1FC9EEAFC"));
            String string2 = SOY.d("772E5B");
            String string3 = SOY.d("46263802181244B4F2F692C2F1B6E9DB48580E3B251A1149");
            charSequence = object;
            if (bl) {
                charSequence = object;
                if (((String)object).contains(SOY.d("1826261712"))) {
                    Map.Entry entry = \u0788.\u0787((String)object, SOY.d("18262617124A"), SOY.d("58")).get(0);
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
                        this.\u0780 = TextUtils.join((CharSequence)SOY.d("41"), (Iterable)object);
                        break;
                    }
                    if (!((String)charSequence).contains(string3)) {
                        return ((String)charSequence).replaceAll(string2, "");
                    }
                    charSequence = this.\u052c(string, this.\u0781, hashMap);
                }
            }
            if (!((String)charSequence).contains(string3)) {
                return ((String)charSequence).replaceAll(string2, "");
            }
            object = charSequence;
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
    private String \u0785(String var1_1, Map<String, String> var2_2, String var3_3, String var4_4) {
        var15_5 = SOY.d("552434041D1103");
        var14_6 = SOY.d("093A3E01");
        var13_7 = var3_3.equals(var14_6) != false ? this.\u058f(var1_1) : this.\u0782(var1_1);
        var8_8 = SOY.d("227F031305021F212513105A2D3B251E");
        var13_7.put((String)var8_8, SOY.d("221F1D3E00030A00340701120926"));
        var7_9 = "";
        var9_10 = "";
        var5_11 = 0;
        do {
            block30: {
                block27: {
                    block28: {
                        block31: {
                            block29: {
                                try {
                                    var12_21 = new \u078a.\u037f(this){
                                        final XYQBiu \u0528;
                                        {
                                            this.\u0528 = xYQBiu;
                                        }

                                        @Override
                                        protected void onFailure(Call call, Exception exception) {
                                        }

                                        @Override
                                        protected void onResponse(Response response) {
                                        }
                                    };
                                    var6_12 = var4_4.contains(var15_5);
                                }
                                catch (Exception var10_19) {
                                    // empty catch block
                                    break block27;
                                }
                                var16_22 = SOY.d("09313913171C3B11");
                                if (!var6_12) ** GOTO lbl37
                                {
                                    var11_20 = \u078c.\u0529();
                                    var10_13 = new StringBuilder();
                                }
                                var10_13.append(\u0788.\u052a(var1_1, SOY.d("553B3F12110F542239065B011F2038100D58133C35130C5912263C1A")));
                                var10_13.append(SOY.d("45"));
                                {
                                    block32: {
                                        catch (Exception var10_14) {
                                            break block27;
                                        }
                                        ** try [egrp 3[TRYBLOCK] [3 : 151->403)] { 
lbl31:
                                        // 1 sources

                                        var10_13.append(Math.random());
                                        var17_23 = var10_13.toString();
                                        var10_13 = var3_3.equals(var14_6) != false ? this.\u058f(var1_1) : this.\u0782(var1_1);
                                        \u078c.\u052a((OkHttpClient)var11_20, (String)var17_23, null, (Map<String, String>)var10_13, var12_21);
                                        ** GOTO lbl72
lbl37:
                                        // 1 sources

                                        if (!var4_4.contains(var16_22)) break block32;
                                        var11_20 = \u078c.\u0529();
                                        var17_23 = new HashMap<String, String>();
                                        var17_23.append(\u0788.\u052a(var1_1, SOY.d("553B3F1518021E377E00101E1735321D5A071222")));
                                        var17_23.append(SOY.d("4535340249"));
                                        var10_13 = new Date();
                                        var17_23.append(var10_13);
                                        var17_23 = var17_23.toString();
                                        var10_13 = var3_3.equals(var14_6) != false ? this.\u058f(var1_1) : this.\u0782(var1_1);
                                        \u078c.\u052a((OkHttpClient)var11_20, (String)var17_23, null, (Map<String, String>)var10_13, var12_21);
                                        ** GOTO lbl72
                                    }
                                    var11_20 = \u078c.\u0529();
                                    var10_13 = new StringBuilder();
                                    var17_23 = new HashMap<String, String>();
                                    var17_23.append(SOY.d("553B3F155B14153F3C191A58193D35135A0712226E1749"));
                                    var17_23.append(var3_3);
                                    var17_23.append(SOY.d("5C216C"));
                                    var10_13.append(\u0788.\u052a(var1_1, var17_23.toString()));
                                }
lbl64:
                                // 1 sources

                                catch (Exception var10_18) {
                                    break block27;
                                }
                                try {
                                    block33: {
                                        var10_13.append(Math.random());
                                        var17_23 = var10_13.toString();
                                        var10_13 = var3_3.equals(var14_6) != false ? this.\u058f(var1_1) : this.\u0782(var1_1);
                                        \u078c.\u052a((OkHttpClient)var11_20, (String)var17_23, null, (Map<String, String>)var10_13, var12_21);
lbl72:
                                        // 3 sources

                                        var11_20 = var9_10;
                                        var12_21 = Base64.encodeToString((byte[])((Response)var12_21.getResult()).body().bytes(), (int)2);
                                        var10_13 = new HashMap();
                                        var10_13.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E434740546167"));
                                        var10_13.put(SOY.d("393D3F0211190E7F050F0412"), SOY.d("0E3729025B07163338184F57193A300407120E6F2402125A42"));
                                        var12_21 = this.\u037f(this.\u0786, (String)var12_21, this.\u0781, (Map<String, String>)var10_13);
                                        if (!var4_4.contains(var15_5)) break block33;
                                        var10_13 = new StringBuilder();
                                        var10_13.append(SOY.d("553B3F12110F542239065B16103329590212083B370F2B141237321D4B030322344B"));
                                        var10_13.append(var3_3);
                                        var10_13.append(SOY.d("5C2434041D11036F"));
                                        var10_13.append((String)var12_21);
                                        var9_10 = var10_13 = this.\u052d(\u0788.\u052a(var1_1, var10_13.toString()), null, this.\u0781, var13_7);
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
                                    break block28;
                                }
                                var13_7.remove(var10_13);
                                var10_13 = SOY.d("552134170614127C211E044809313913171C3B116C151C121939770615101F6F77051116083139020D071F6F771906131F206C50001E1E6F771706121B6F770F1116086F771A11030E37234B520E0F2B3018495109263002114A5C3F3E18110E47742713064A5C38204B");
                                var17_23 = new HashMap<String, String>();
                                var17_23.put(SOY.d("0C333D1F10160E37"), (String)var12_21);
                                var12_21 = SOY.d("09373004171F0D3D2312");
                                {
                                    block34: {
                                        catch (Exception var10_15) {
                                            break block28;
                                        }
                                        ** try [egrp 6[TRYBLOCK] [16 : 699->873)] { 
lbl113:
                                        // 1 sources

                                        var17_23.put((String)var12_21, var7_9);
                                        var9_10 = this.\u052d(\u0788.\u052a(var1_1, (String)var10_13), var17_23, this.\u0781, var13_7);
                                        break block34;
lbl117:
                                        // 1 sources

                                        var9_10 = new StringBuilder();
                                        var9_10.append(SOY.d("553B3F155B1610332958041F0A6D3015491415363429171F1F313A50000E0A376C"));
                                        var9_10.append(var3_3);
                                        var9_10.append(SOY.d("5C313E12114A"));
                                        var9_10.append((String)var12_21);
                                        var9_10 = this.\u052c(\u0788.\u052a(var1_1, var9_10.toString()), this.\u0781, var13_7);
                                    }
                                    var10_13 = var7_9;
                                    var12_21 = var8_8;
                                    if (var4_4.contains(var16_22)) {
                                        if (var9_10.contains(SOY.d("93F8DD9EDBF69DF2D092CCFA9CFFF291D5D9"))) break block29;
                                        var10_13 = var2_2 == null ? this.\u052c(var1_1, this.\u0781, var13_7) : this.\u052d(var1_1, var2_2, this.\u0781, var13_7);
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
                                    break block30;
                                }
                                try {
                                    if (!var10_13.contains(SOY.d("92ECC293F1D29CFFF291D5D99DC8D59FDEFB92FDD091D4F6"))) {
                                        var8_8 = var10_13;
                                        var6_12 = XYQBiu.checkveriry((String)var10_13);
                                        var9_10 = var10_13;
                                        if (!var6_12) {
                                            return var10_13;
                                        }
                                    }
                                    break block31;
                                }
                                catch (Exception var10_16) {
                                    var9_10 = var8_8;
                                    var8_8 = var12_21;
                                    break block30;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var10_13 = new JSONObject((String)var9_10);
                                    if (!var10_13.getString(SOY.d("172136")).equals(SOY.d("1539"))) break block29;
                                    var13_7.remove(var12_21);
                                    var9_10 = var2_2 == null ? this.\u052c(var1_1, this.\u0781, var13_7) : this.\u052d(var1_1, var2_2, this.\u0781, var13_7);
                                    var8_8 = var9_10;
                                    var10_13 = var9_10;
                                }
                                {
                                    if (var9_10.contains(SOY.d("9EEADC9ED2F693F0C091CDF69CC1DC92C9EB95EEDD90E4EB9DE6F390E3C193C5E59FE3C393C8C592CCCD"))) {
                                        var8_8 = var9_10;
                                        TimeUnit.SECONDS.sleep(6L);
                                        if (var2_2 == null) {
                                            var8_8 = var9_10;
                                            var8_8 = var9_10 = this.\u052c(var1_1, this.\u0781, var13_7);
                                        } else {
                                            var8_8 = var9_10;
                                            var8_8 = var9_10 = this.\u052d(var1_1, var2_2, this.\u0781, var13_7);
                                        }
                                        var10_13 = var8_8;
                                    }
                                    var8_8 = var10_13;
                                    var9_10 = var10_13;
                                    if (!var10_13.contains(SOY.d("92ECC293F1D293F8DD9EDBF69DF2D0"))) {
                                        var8_8 = var10_13;
                                        var6_12 = XYQBiu.checkveriry((String)var10_13);
                                        var9_10 = var10_13;
                                        if (!var6_12) {
                                            return var10_13;
                                        }
                                    }
                                    break block31;
                                }
                            }
                            var9_10 = var11_20;
                        }
                        var8_8 = var12_21;
                        continue;
                    }
                    var11_20 = var7_9;
                    break block30;
                }
                var11_20 = var7_9;
            }
            var11_20 = var7_9;
            SpiderDebug.log((Throwable)var10_13);
        } while (++var5_11 < 4);
        return var9_10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private String \u0787(String var1_1, String var2_6) {
        block211: {
            block194: {
                block209: {
                    block191: {
                        block193: {
                            block192: {
                                block190: {
                                    block182: {
                                        block189: {
                                            block188: {
                                                block187: {
                                                    block186: {
                                                        block185: {
                                                            block179: {
                                                                block177: {
                                                                    block175: {
                                                                        block178: {
                                                                            block176: {
                                                                                block173: {
                                                                                    block174: {
                                                                                        block208: {
                                                                                            var22_7 = SOY.d("07");
                                                                                            var23_8 = SOY.d("01");
                                                                                            var26_9 = SOY.d("53");
                                                                                            var24_10 = SOY.d("262902131505193A0111280A");
                                                                                            var25_11 = SOY.d("26292612280A");
                                                                                            var16_12 = SOY.d("0101341706141202360B");
                                                                                            var13_16 /* !! */  = SOY.d("09373029121E0821250615101F");
                                                                                            var27_17 = SOY.d("1736645E");
                                                                                            var14_18 /* !! */  = SOY.d("10213E18041E19");
                                                                                            var20_24 = SOY.d("09373029041E19");
                                                                                            var21_25 = SOY.d("4A");
                                                                                            var17_26 = SOY.d("4B");
                                                                                            var18_27 = SOY.d("5C74");
                                                                                            this.\u052e();
                                                                                            var15_34 = SOY.d("393D351F1A1025343E0419160E");
                                                                                            this.\u0781 = this.\u0781((String)var15_34, SOY.d("2F06175B4C"));
                                                                                            var19_45 = String.valueOf(Integer.parseInt(this.\u0781((String)var13_16 /* !! */ , (String)var17_26)));
                                                                                            var6_46 = var19_45.equals(var21_25);
                                                                                            if (!var6_46) ** GOTO lbl24
                                                                                            var13_16 /* !! */  = String.valueOf(Integer.parseInt((String)var2_6) - 1);
                                                                                            break block208;
lbl24:
                                                                                            // 1 sources

                                                                                            var13_16 /* !! */  = String.valueOf(Integer.parseInt((String)var2_6) - 1 + Integer.parseInt(this.\u0781((String)var13_16 /* !! */ , (String)var17_26)));
                                                                                        }
                                                                                        var15_34 = this.\u0780(SOY.d("09373004171F2527231A"));
                                                                                        var2_6 = var15_34.contains((CharSequence)var16_12) != false ? var21_25 : var17_26;
                                                                                        if (var15_34.contains((CharSequence)var16_12)) break block173;
                                                                                        if (!var13_16 /* !! */ .equals(var21_25) || Integer.parseInt((String)var13_16 /* !! */ ) < Integer.parseInt((String)var2_6)) break block174;
                                                                                        return null;
                                                                                    }
                                                                                    if (var13_16 /* !! */ .equals(var21_25) || Integer.parseInt((String)var13_16 /* !! */ ) <= Integer.parseInt((String)var2_6)) break block173;
                                                                                    return null;
                                                                                }
                                                                                if (!var15_34.contains(SOY.d("1C3B230500271B35344B"))) break block175;
                                                                                var6_46 = var13_16 /* !! */ .equals(var21_25);
                                                                                var28_47 = SOY.d("260F");
                                                                                var2_6 = "";
                                                                                var29_48 = SOY.d("2609371F06040E023011114A");
                                                                                if (var6_46) {
                                                                                    var16_12 = var2_6;
                                                                                    if (!var19_45.equals(var21_25)) break block176;
                                                                                    var16_12 = var2_6;
                                                                                    var2_6 = var15_34.split(var29_48)[1].split(var28_47)[0];
                                                                                    break block177;
                                                                                }
                                                                            }
                                                                            var16_12 = var2_6;
                                                                            if (!var13_16 /* !! */ .equals(var17_26)) break block178;
                                                                            var16_12 = var2_6;
                                                                            if (!var19_45.equals(var17_26)) break block178;
                                                                            var16_12 = var2_6;
                                                                            var2_6 = var15_34.split(var29_48)[1].split(var28_47)[0];
                                                                            break block177;
                                                                        }
                                                                        var16_12 = var2_6;
                                                                        var2_6 = var15_34.split(var29_48)[0];
                                                                        break block177;
                                                                    }
                                                                    var2_6 = var15_34;
                                                                }
                                                                var16_12 = var15_34 = "";
                                                                var28_47 = var2_6.replaceAll(var25_11, URLEncoder.encode(var1_1, this.\u0781)).replaceAll(var24_10, (String)var13_16 /* !! */ );
                                                                var16_12 = var15_34;
                                                                var2_6 = var28_47.split(SOY.d("41"))[0];
                                                                var16_12 = var15_34;
                                                                var9_49 = System.currentTimeMillis() / 1000L;
                                                                var16_12 = var15_34;
                                                                var11_50 = System.currentTimeMillis();
                                                                var16_12 = var15_34;
                                                                var2_6 = var2_6.replaceAll(SOY.d("9CC5E79FE3C39CDAE2"), String.valueOf(var9_49)).replaceAll(SOY.d("9CC5E79FE3C39CF2D6"), String.valueOf(var11_50));
                                                                var19_45 = var2_6;
                                                                var16_12 = var15_34;
                                                                if (!var2_6.contains(var27_17)) break block179;
                                                                var16_12 = var15_34;
                                                                var29_48 = \u0788.\u0787((String)var2_6, var27_17, var26_9).get(0);
                                                                var16_12 = var15_34;
                                                                var16_12 = var15_34;
                                                                var19_45 = new StringBuilder();
                                                                var16_12 = var15_34;
                                                                var19_45.append(var27_17);
                                                                var16_12 = var15_34;
                                                                var19_45.append(var29_48);
                                                                var16_12 = var15_34;
                                                                var19_45.append(var26_9);
                                                                var16_12 = var15_34;
                                                                var19_45 = var2_6.replace(var19_45.toString(), com.github.catvod.spider.merge.\u0786.\u037f(var29_48, com.github.catvod.spider.merge.\u0786.\u0529));
                                                            }
                                                            var16_12 = var15_34;
                                                            var6_46 = var28_47.contains(SOY.d("41223E0500"));
                                                            var26_9 = SOY.d("09373004171F");
                                                            if (var6_46) {
                                                                block180: {
                                                                    block184: {
                                                                        block183: {
                                                                            block181: {
                                                                                var16_12 = var15_34;
                                                                                var2_6 = this.\u0780(SOY.d("093730292403383D350F")).replaceAll(var25_11, var1_1).replaceAll(var24_10, (String)var13_16 /* !! */ ).trim().replaceAll(SOY.d("95EFCA"), var23_8).replaceAll(SOY.d("95EFCC"), (String)var22_7);
                                                                                var16_12 = var15_34;
                                                                                if (var2_6.isEmpty()) break block180;
                                                                                var16_12 = var15_34;
                                                                                if (!var2_6.startsWith(var23_8)) break block181;
                                                                                var16_12 = var15_34;
                                                                                if (!var2_6.endsWith((String)var22_7)) break block181;
                                                                                var16_12 = var15_34;
                                                                                var16_12 = var15_34;
                                                                                var13_16 /* !! */  = new JSONObject((String)var2_6);
                                                                                var16_12 = var15_34;
                                                                                var2_6 = this.\u037f((String)var19_45, var13_16 /* !! */ .toString(), this.\u0781, this.\u0782((String)var19_45));
                                                                                break block182;
                                                                            }
                                                                            var16_12 = var15_34;
                                                                            var16_12 = var15_34;
                                                                            var22_7 = new LinkedHashMap();
                                                                            var16_12 = var15_34;
                                                                            var2_6 = var2_6.split(SOY.d("5C"));
                                                                            var16_12 = var15_34;
                                                                            ** try [egrp 35[TRYBLOCK] [39 : 852->856)] { 
lbl147:
                                                                            // 2 sources

                                                                            for (String[] var13_16 : var2_6) {
                                                                                var16_12 = var15_34;
                                                                                var5_53 = var13_16 /* !! */ .indexOf(SOY.d("47"));
                                                                                var16_12 = var15_34;
                                                                                var22_7.put((String)var13_16 /* !! */ .substring(0, var5_53), (String)var13_16 /* !! */ .substring(var5_53 + 1));
                                                                            }
                                                                            var16_12 = var15_34;
                                                                            var13_16 /* !! */  = this.\u052d((String)var19_45, (Map<String, String>)var22_7, this.\u0781, (Map<String, String>)this.\u0782((String)var19_45));
                                                                            var16_12 = var15_34;
                                                                            if (var13_16 /* !! */ .contains(SOY.d("92ECC293F1D293F8DD9EDBF69DF2D0"))) break block183;
                                                                            var2_6 = var13_16 /* !! */ ;
                                                                            var16_12 = var15_34;
                                                                            if (!var13_16 /* !! */ .contains(SOY.d("92ECC293F1D29CFFF291D5D99DC8D59FDEFB92FDD091D4F6"))) break block184;
                                                                        }
                                                                        var2_6 = var13_16 /* !! */ ;
                                                                        var16_12 = var15_34;
                                                                        if (!XYQBiu.checkveriry((String)var13_16 /* !! */ )) break block184;
                                                                        var16_12 = var15_34;
                                                                        var2_6 = this.\u0785((String)var19_45, (Map<String, String>)var22_7, var26_9, XYQBiu.vertype((String)var13_16 /* !! */ ));
                                                                    }
                                                                    var16_12 = var15_34;
                                                                    if (!var2_6.contains(SOY.d("9EEADC9ED2F693F0C091CDF69CC1DC92C9EB95EEDD90E4EB9DE6F390E3C193C5E59FE3C393C8C592CCCD"))) break block182;
                                                                    var16_12 = var15_34;
                                                                    TimeUnit.SECONDS.sleep(6L);
                                                                    var16_12 = var15_34;
                                                                    var2_6 = this.\u052d((String)var19_45, (Map<String, String>)var22_7, this.\u0781, (Map<String, String>)this.\u0782((String)var19_45));
                                                                    break block182;
                                                                }
                                                                var16_12 = var15_34;
                                                                var2_6 = this.\u052d((String)var19_45, null, this.\u0781, this.\u0782((String)var19_45));
                                                                break block182;
                                                            }
                                                            var16_12 = var15_34;
                                                            var13_16 /* !! */  = this.\u052c((String)var19_45, this.\u0781, this.\u0782((String)var19_45));
                                                            var2_6 = var13_16 /* !! */ ;
                                                            var16_12 = var15_34;
                                                            if (!var13_16 /* !! */ .contains(SOY.d("9CF1D190C1FC9EEAFC"))) break block185;
                                                            var2_6 = var13_16 /* !! */ ;
                                                            var16_12 = var15_34;
                                                            if (!var13_16 /* !! */ .contains(SOY.d("1826261712"))) break block185;
                                                            var16_12 = var15_34;
                                                            var2_6 = this.\u0784((String)var19_45, (String)var13_16 /* !! */ , var26_9);
                                                        }
                                                        var16_12 = var15_34;
                                                        if (var2_6.contains(SOY.d("553A2417101814350E"))) break block186;
                                                        var13_16 /* !! */  = var2_6;
                                                        var16_12 = var15_34;
                                                        if (!var2_6.contains(SOY.d("552034181E1E25"))) break block187;
                                                    }
                                                    var16_12 = var15_34;
                                                    var13_16 /* !! */  = this.\u0783((String)var19_45, (String)var2_6, var26_9);
                                                }
                                                var16_12 = var15_34;
                                                if (var13_16 /* !! */ .contains(SOY.d("92ECC293F1D293F8DD9EDBF69DF2D0"))) break block188;
                                                var16_12 = var15_34;
                                                if (!var13_16 /* !! */ .contains(SOY.d("92ECC293F1D29CFFF291D5D99DC8D59FDEFB92FDD091D4F6"))) break block189;
                                            }
                                            var16_12 = var15_34;
                                            if (!XYQBiu.checkveriry((String)var13_16 /* !! */ )) break block189;
                                            var16_12 = var15_34;
                                            var13_16 /* !! */  = this.\u0785((String)var19_45, null, var26_9, XYQBiu.vertype((String)var13_16 /* !! */ ));
                                        }
                                        var2_6 = var13_16 /* !! */ ;
                                        var16_12 = var15_34;
                                        if (!var13_16 /* !! */ .contains(SOY.d("9EEADC9ED2F693F0C091CDF69CC1DC92C9EB95EEDD90E4EB9DE6F390E3C193C5E59FE3C393C8C592CCCD"))) break block182;
                                        var16_12 = var15_34;
                                        TimeUnit.SECONDS.sleep(6L);
                                        var16_12 = var15_34;
                                        var2_6 = this.\u052c((String)var19_45, this.\u0781, this.\u0782((String)var19_45));
                                    }
                                    var22_7 = null;
                                    var16_12 = var15_34;
                                    var2_6 = XYQBiu.\u0529((String)var2_6);
                                    var16_12 = var15_34;
                                    var8_54 = this.\u0780(SOY.d("09373004171F253F3E1211")).equals(var21_25);
                                    var16_12 = var15_34;
                                    var6_46 = this.\u0780(SOY.d("2A3B323811121E0223190C0E")).equals(var17_26);
                                    var16_12 = var15_34;
                                    var7_55 = this.\u0780(SOY.d("093730292D392526261F1712")).equals(var17_26);
                                    var16_12 = var15_34;
                                    var16_12 = var15_34;
                                    var23_8 = new JSONObject();
                                    var16_12 = var15_34;
                                    var16_12 = var15_34;
                                    var24_10 = new JSONArray();
                                    var25_11 = SOY.d("5E7675");
                                    if (!var8_54) break block209;
                                    var13_16 /* !! */  = var2_6;
                                    if (var7_55) {
                                        var16_12 = var15_34;
                                        var13_16 /* !! */  = \u0788.\u0787((String)var2_6, this.\u0780(SOY.d("0937302900001331342904051F")), this.\u0780(SOY.d("0937302900001331342907021C"))).get(0);
                                    }
                                    var16_12 = var15_34;
                                    var16_12 = var15_34;
                                    var2_6 = new JSONObject((String)var13_16 /* !! */ );
                                    var16_12 = var15_34;
                                    var13_16 /* !! */  = this.\u0781(SOY.d("10213E18181E0926"), SOY.d("163B2202")).split(SOY.d("267C"));
                                    var16_12 = var15_34;
                                    if (var13_16 /* !! */ .length != 1) break block190;
                                    var16_12 = var15_34;
                                    var2_6 = var2_6.getJSONArray(var13_16 /* !! */ [0]);
lbl283:
                                    // 4 sources

                                    while (true) {
                                        var17_26 = var2_6;
                                        break block191;
                                        break;
                                    }
                                }
                                var16_12 = var15_34;
                                if (var13_16 /* !! */ .length != 2) break block192;
                                var16_12 = var15_34;
                                var2_6 = var2_6.getJSONObject(var13_16 /* !! */ [0]).getJSONArray(var13_16 /* !! */ [1]);
                                ** GOTO lbl283
                            }
                            var16_12 = var15_34;
                            if (var13_16 /* !! */ .length != 3) break block193;
                            var16_12 = var15_34;
                            var2_6 = var2_6.getJSONObject(var13_16 /* !! */ [0]).getJSONObject(var13_16 /* !! */ [1]).getJSONArray(var13_16 /* !! */ [2]);
                            ** GOTO lbl283
                        }
                        var17_26 = var22_7;
                        var16_12 = var15_34;
                        if (var13_16 /* !! */ .length != 4) break block191;
                        var16_12 = var15_34;
                        var2_6 = var2_6.getJSONObject(var13_16 /* !! */ [0]).getJSONObject(var13_16 /* !! */ [1]).getJSONObject(var13_16 /* !! */ [2]).getJSONArray(var13_16 /* !! */ [3]);
                        ** continue;
                    }
                    var2_6 = "";
                    var16_12 = "";
                    var3_52 = 0;
                    var13_16 /* !! */  = var14_18 /* !! */ ;
                    var14_18 /* !! */  = var16_12;
                    var20_24 = var17_26;
                    while (true) {
                        block198: {
                            block199: {
                                block210: {
                                    block195: {
                                        block197: {
                                            block196: {
                                                var16_12 = var15_34;
                                                var4_51 = var20_24.length();
                                                if (var3_52 >= var4_51) break block194;
                                                var26_9 = var20_24.getJSONObject(var3_52);
                                                var21_25 = var26_9.optString(this.\u0780(SOY.d("10213E181A161737"))).trim();
                                                var18_27 = var26_9.optString(this.\u0780(SOY.d("10213E181D13"))).trim();
                                                var17_26 = new StringBuilder();
                                                var16_12 = SOY.d("09373004171F25222313121E02");
                                                var17_26.append(this.\u0781((String)var16_12, (String)var15_34));
                                                var17_26.append(var18_27);
                                                var17_26.append(this.\u0781(SOY.d("09373004171F25212410121E02"), (String)var15_34));
                                                var22_7 = var17_26.toString();
                                                var7_55 = this.\u0780((String)var13_16 /* !! */ ).isEmpty();
                                                if (var7_55) break block195;
                                                var16_12 = this.\u0780((String)var13_16 /* !! */ );
                                                if (var16_12.startsWith(SOY.d("12262506"))) {
                                                    var16_12 = this.\u0780((String)var13_16 /* !! */ );
                                                    break block196;
                                                }
                                                var2_6 = var16_12 = var26_9.optString(this.\u0780((String)var13_16 /* !! */ )).trim();
                                                try {
                                                    var16_12 = \u0788.\u052a((String)var19_45, (String)var16_12);
                                                }
                                                catch (Exception var18_28) {
                                                    break block197;
                                                }
                                            }
                                            var2_6 = var16_12;
                                            if (!var6_46) break block195;
                                            var2_6 = var16_12;
                                            var2_6 = var16_12 = this.\u052f((String)var16_12, (String)var19_45, var6_46);
                                            break block195;
                                            catch (Exception var18_29) {}
                                            break block197;
                                            catch (Exception var18_30) {
                                                // empty catch block
                                            }
                                        }
                                        var17_26 = var2_6;
                                        var16_12 = var14_18 /* !! */ ;
                                        SpiderDebug.log((Throwable)var18_27);
                                    }
                                    try {
                                        var16_12 = var26_9.optString(this.\u0780(SOY.d("10213E18070313263D13"))).trim();
                                        var14_18 /* !! */  = var16_12;
                                    }
                                    catch (Exception var18_31) {
                                        var17_26 = var2_6;
                                        var16_12 = var14_18 /* !! */ ;
                                        SpiderDebug.log((Throwable)var18_31);
                                    }
                                    var17_26 = var2_6;
                                    var16_12 = var14_18 /* !! */ ;
                                    if (!var21_25.contains(var1_1)) break block198;
                                    var17_26 = var2_6;
                                    var16_12 = var14_18 /* !! */ ;
                                    var17_26 = var2_6;
                                    var16_12 = var14_18 /* !! */ ;
                                    var26_9 = new JSONObject();
                                    var17_26 = var2_6;
                                    var16_12 = var14_18 /* !! */ ;
                                    var18_27 = SOY.d("0C3D35291D13");
                                    try {
                                        var16_12 = new StringBuilder();
                                        var16_12.append((String)var21_25);
                                        var16_12.append(var25_11);
                                        var16_12.append((String)var2_6);
                                        var16_12.append(var25_11);
                                        var16_12.append((String)var22_7);
                                        var26_9.put(var18_27, (Object)var16_12.toString());
                                        var26_9.put(SOY.d("0C3D35291A161737"), var21_25);
                                        var26_9.put(SOY.d("0C3D3529041E19"), var2_6);
                                        var26_9.put(SOY.d("0C3D352906121733231D07"), (Object)var14_18 /* !! */ );
                                        var24_10.put((Object)var26_9);
                                        break block198;
                                    }
                                    catch (Exception var16_13) {
                                        var17_26 = var14_18 /* !! */ ;
                                        break block199;
                                    }
                                    {
                                        catch (Exception var18_32) {
                                            var2_6 = var17_26;
                                            var14_18 /* !! */  = var16_12;
                                        }
                                    }
                                    break block210;
                                    catch (Exception var18_33) {
                                        // empty catch block
                                    }
                                }
                                var16_12 = var18_27;
                                var17_26 = var14_18 /* !! */ ;
                                break block199;
                                catch (Exception var16_14) {
                                    var17_26 = var14_18 /* !! */ ;
                                }
                                break block199;
                                catch (Exception var16_15) {
                                    var17_26 = var14_18 /* !! */ ;
                                }
                            }
                            var14_18 /* !! */  = var15_34;
                            SpiderDebug.log((Throwable)var16_12);
                            var14_18 /* !! */  = var17_26;
                        }
                        ++var3_52;
                    }
                }
                var17_26 = "";
                var13_16 /* !! */  = var2_6;
                if (var7_55) {
                    var14_18 /* !! */  = var17_26;
                    var13_16 /* !! */  = \u0788.\u0787((String)var2_6, this.\u0780(SOY.d("0937302900001331342904051F")), this.\u0780(SOY.d("0937302900001331342907021C"))).get(0);
                }
                var14_18 /* !! */  = var17_26;
                var21_25 = \u0788.\u0787((String)var13_16 /* !! */ , this.\u0780(SOY.d("093730291505080D210411")), this.\u0780(SOY.d("093730291505080D220312")));
                var2_6 = "";
                var13_16 /* !! */  = var2_6;
                var3_52 = 0;
                while (true) {
                    block206: {
                        block207: {
                            block203: {
                                block204: {
                                    block205: {
                                        block200: {
                                            block202: {
                                                block201: {
                                                    var14_18 /* !! */  = var17_26;
                                                    var4_51 = var21_25.size();
                                                    var15_34 = var17_26;
                                                    if (var3_52 >= var4_51) break;
                                                    var16_12 = (String)var21_25.get(var3_52);
                                                    var14_18 /* !! */  = this.\u0780(SOY.d("09373029001E0E3E34"));
                                                    var22_7 = this.\u0786(\u0788.\u0787((String)var16_12, var14_18 /* !! */ .split(var18_27)[0], this.\u0780(SOY.d("09373029001E0E3E34")).split(var18_27)[1]).get(0));
                                                    var7_55 = this.\u0780((String)var20_24).isEmpty();
                                                    if (var7_55) break block200;
                                                    var14_18 /* !! */  = this.\u0780((String)var20_24);
                                                    if (var14_18 /* !! */ .startsWith(SOY.d("12262506"))) {
                                                        var15_34 = this.\u0780((String)var20_24);
                                                        break block201;
                                                    }
                                                    var2_6 = var15_34 = \u0788.\u0787((String)var16_12, this.\u0780((String)var20_24).split(var18_27)[0], this.\u0780((String)var20_24).split(var18_27)[1]).get(0);
                                                    var14_18 /* !! */  = var15_34;
                                                    var15_34 = \u0788.\u052a((String)var19_45, (String)var15_34);
                                                }
                                                var2_6 = var15_34;
                                                if (!var6_46) break block200;
                                                var2_6 = var15_34;
                                                var14_18 /* !! */  = var15_34;
                                                try {
                                                    var2_6 = var15_34 = this.\u052f((String)var15_34, (String)var19_45, var6_46);
                                                    break block200;
                                                }
                                                catch (Exception var15_35) {
                                                    break block202;
                                                }
                                                catch (Throwable var14_19) {
                                                    break block203;
                                                }
                                                catch (Exception var15_36) {
                                                    break block202;
                                                }
                                                catch (Throwable var14_20) {
                                                    break block203;
                                                }
                                                catch (Exception var15_37) {
                                                    // empty catch block
                                                }
                                            }
                                            var14_18 /* !! */  = var2_6;
                                            try {
                                                SpiderDebug.log((Throwable)var15_34);
                                            }
                                            catch (Throwable var15_42) {
                                                var2_6 = var14_18 /* !! */ ;
                                                var14_18 /* !! */  = var15_42;
                                                break block203;
                                            }
                                        }
                                        var14_18 /* !! */  = var2_6;
                                        var15_34 = this.\u0780(SOY.d("09373029010516")).split(var18_27)[0];
                                        try {
                                            var14_18 /* !! */  = \u0788.\u0787((String)var16_12, (String)var15_34, this.\u0780(SOY.d("09373029010516")).split(var18_27)[1]).get(0);
                                            var15_34 = new StringBuilder();
                                        }
                                        catch (Throwable var14_22) {}
                                        var15_34.append(this.\u0780(SOY.d("09373004171F25222313121E02")));
                                        var15_34.append((String)var14_18 /* !! */ );
                                        var15_34.append(this.\u0780(SOY.d("09373004171F25212410121E02")));
                                        var26_9 = var15_34.toString();
                                        var14_18 /* !! */  = this.\u0780(SOY.d("093730290702182638021812")).split(var18_27);
                                        var27_17 = var14_18 /* !! */ [0];
                                        var15_34 = this.\u0780(SOY.d("093730290702182638021812")).split(var18_27);
                                        var14_18 /* !! */  = var13_16 /* !! */ ;
                                        var15_34 = \u0788.\u0787((String)var16_12, var27_17, (String)var15_34[1]);
                                        var14_18 /* !! */  = var13_16 /* !! */ ;
                                        try {
                                            var15_34 = this.\u0786((String)var15_34.get(0));
                                            var13_16 /* !! */  = var15_34;
                                            break block204;
                                        }
                                        catch (Exception var15_38) {
                                            break block205;
                                        }
                                        catch (Exception var15_39) {
                                            break block205;
                                        }
                                        {
                                            catch (Exception var15_40) {
                                                // empty catch block
                                            }
                                        }
                                    }
                                    var14_18 /* !! */  = var13_16 /* !! */ ;
                                    SpiderDebug.log((Throwable)var15_34);
                                }
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var16_12 = var2_6;
                                var15_34 = var13_16 /* !! */ ;
                                if (!var22_7.contains(var1_1)) break block206;
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var27_17 = new JSONObject();
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var16_12 = SOY.d("0C3D35291D13");
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var15_34 = new StringBuilder();
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var15_34.append((String)var22_7);
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var15_34.append(var25_11);
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var15_34.append((String)var2_6);
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var15_34.append(var25_11);
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var15_34.append(var26_9);
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var27_17.put((String)var16_12, (Object)var15_34.toString());
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var27_17.put(SOY.d("0C3D35291A161737"), var22_7);
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var27_17.put(SOY.d("0C3D3529041E19"), var2_6);
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                var27_17.put(SOY.d("0C3D352906121733231D07"), (Object)var13_16 /* !! */ );
                                var14_18 /* !! */  = var13_16 /* !! */ ;
                                try {
                                    var24_10.put((Object)var27_17);
                                    var16_12 = var2_6;
                                    var15_34 = var13_16 /* !! */ ;
                                    break block206;
                                }
                                catch (Throwable var15_41) {
                                    var13_16 /* !! */  = var14_18 /* !! */ ;
                                }
                                break block207;
                                catch (Throwable var14_21) {}
                                break block203;
                                catch (Throwable var14_23) {
                                    // empty catch block
                                }
                            }
                            var15_34 = var14_18 /* !! */ ;
                            break block207;
                            catch (Throwable var15_43) {
                                break block207;
                            }
                            catch (Throwable var15_44) {
                                // empty catch block
                            }
                        }
                        var14_18 /* !! */  = var17_26;
                        var15_34.printStackTrace();
                        var15_34 = var13_16 /* !! */ ;
                        var16_12 = var2_6;
                    }
                    ++var3_52;
                    var2_6 = var16_12;
                    var13_16 /* !! */  = var15_34;
                }
            }
            var14_18 /* !! */  = var15_34;
            try {
                var23_8.put(SOY.d("163B2202"), (Object)var24_10);
                var14_18 /* !! */  = var15_34;
            }
            catch (Exception var1_2) {}
            var1_1 = var23_8.toString();
            return var1_1;
            break block211;
lbl639:
            // 71 sources

            catch (Exception var1_3) {
                var14_18 /* !! */  = var16_12;
            }
            break block211;
            catch (Exception var1_4) {
                var14_18 /* !! */  = "";
            }
        }
        SpiderDebug.log((Throwable)var1_5);
        return var14_18 /* !! */ ;
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [69[UNCONDITIONALDOLOOP]], but top level block is 38[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String homeContent(boolean bl) {
        void var4_8;
        block27: {
            String string;
            JSONObject jSONObject;
            block26: {
                block25: {
                    Object object;
                    String string2;
                    block24: {
                        String[] stringArray;
                        block22: {
                            String string3;
                            block23: {
                                string3 = SOY.d("1C3B3D0211051E332517");
                                String string4 = SOY.d("5C");
                                this.\u052e();
                                jSONObject = new JSONObject();
                                JSONArray jSONArray = new JSONArray();
                                String string5 = this.\u0780(SOY.d("193E300507280C333D0311"));
                                String string6 = this.\u0780(SOY.d("193E300507280F203D"));
                                String string7 = this.\u0780(SOY.d("1C313D170704253C301B11"));
                                String string8 = this.\u0780(SOY.d("1C313D1707042524301A0112"));
                                string = this.\u0780(SOY.d("1C313002111B15350E18151A1F"));
                                string2 = this.\u0780(SOY.d("1C313002111B15350E00151B0F37"));
                                String string9 = this.\u0780(SOY.d("1C332313152814333C13"));
                                String string10 = this.\u0780(SOY.d("1C33231315280C333D0311"));
                                String string11 = this.\u0781(SOY.d("1C2B3417062814333C13"), XYQBiu.\u052b());
                                String string12 = this.\u0781(SOY.d("1C2B341706280C333D0311"), SOY.d("50"));
                                String string13 = this.\u0780(SOY.d("1C3E3018132814333C13"));
                                String string14 = this.\u0780(SOY.d("1C3E301813280C333D0311"));
                                String string15 = this.\u0781(SOY.d("1C213E04002814333C13"), SOY.d("9CC5E79FE3C35CB6EBCC92C7EE74B9D9F092F2D4"));
                                String string16 = this.\u0781(SOY.d("1C213E0400280C333D0311"), SOY.d("0E3B3C13521F132622500714152034"));
                                stringArray = this.\u0781(SOY.d("193E3005072814333C13"), "").split(string4);
                                object = string5.split(string4);
                                int n2 = 0;
                                while (true) {
                                    if (n2 >= stringArray.length) break;
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(SOY.d("0E2B21132B1E1E"), (Object)object[n2].replaceAll(SOY.d("95EED799C8F1"), string4));
                                    jSONObject2.put(SOY.d("0E2B21132B191B3F34"), (Object)stringArray[n2]);
                                    jSONArray.put((Object)jSONObject2);
                                    ++n2;
                                    continue;
                                    break;
                                }
                                jSONObject.put(SOY.d("193E300507"), (Object)jSONArray);
                                object = this.\u0781(string3, "");
                                InetAddress.getLocalHost();
                                boolean bl2 = ((String)object).startsWith(SOY.d("193E30184E5855"));
                                stringArray = null;
                                if (bl2) break block22;
                                try {
                                    if (((String)object).startsWith(SOY.d("12262506")) || ((String)object).startsWith(SOY.d("547D"))) break block22;
                                    bl2 = ((String)object).equalsIgnoreCase(SOY.d("3F0A05"));
                                    if (!bl2) break block23;
                                }
                                catch (Exception exception) {
                                    string = jSONObject;
                                    break block26;
                                }
                                try {
                                    object = this.\u052a(string5, string6, string7, string8, string, string2, string9, string10, string11, string12, string13, string14, string15, string16);
                                    break block24;
                                }
                                catch (Exception exception) {
                                    break block25;
                                }
                            }
                            object = this.\u0785.optJSONObject(string3);
                            break block24;
                        }
                        string = \u078c.\u058f((String)object, null).trim();
                        object = stringArray;
                        if (!string.startsWith(SOY.d("01"))) break block24;
                        object = stringArray;
                        try {
                            if (!string.endsWith(SOY.d("07"))) break block24;
                            object = new JSONObject(string);
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    if (bl && object != null) {
                        string2 = SOY.d("1C3B3D02110509");
                        string = jSONObject;
                        try {
                            string.put(string2, object);
                            return jSONObject.toString();
                        }
                        catch (Exception exception) {
                            break block26;
                        }
                    }
                    object = jSONObject;
                    return jSONObject.toString();
                }
                string = jSONObject;
                break block26;
                catch (Exception exception) {
                    string = jSONObject;
                }
            }
            string = jSONObject;
            try {
                void var5_30;
                SpiderDebug.log((Throwable)var5_30);
                return jSONObject.toString();
            }
            catch (Exception exception) {}
            break block27;
            catch (Exception exception) {
                // empty catch block
            }
        }
        SpiderDebug.log((Throwable)var4_8);
        return "";
    }

    public String homeVideoContent() {
        block10: {
            String string;
            String string2 = SOY.d("5C");
            String string3 = SOY.d("4B");
            this.\u052e();
            if (!this.\u0780(SOY.d("123D3C1337181426341800")).equals(string3)) break block10;
            JSONArray jSONArray = new JSONArray();
            String[] stringArray = this.\u0781(SOY.d("193E300507280C333D0311"), "").split(string2);
            int n2 = stringArray.length;
            int n3 = 0;
            while (true) {
                block11: {
                    string = SOY.d("163B2202");
                    if (n3 >= n2) break;
                    String string4 = stringArray[n3].replaceAll(SOY.d("95EED799C8F1"), string2);
                    HashMap<String, String> hashMap = new HashMap<String, String>();
                    string4 = this.\u0528(string4, string3, false, hashMap);
                    if (string4 == null) break block11;
                    string4 = string4.optJSONArray(string);
                    if (string4 == null) break block11;
                    int n4 = 0;
                    while (true) {
                        if (n4 >= string4.length() || n4 >= 5) break;
                        jSONArray.put((Object)string4.getJSONObject(n4));
                        ++n4;
                        continue;
                        break;
                    }
                }
                if (jSONArray.length() >= 20) break;
                ++n3;
                continue;
                break;
            }
            try {
                string2 = new JSONObject();
                string2.put(string, (Object)jSONArray);
                string = string2.toString();
                return string;
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
            }
        }
        return "";
    }

    /*
     * Unable to fully structure code
     */
    public void init(Context var1_1, String var2_2) {
        super.init(var1_1, (String)var2_2);
        this.\u0784 = var2_2;
        this.\u052f = new xc();
        var2_2 = new StringBuilder();
        var2_2.append(Init.context().getPackageName());
        var2_2.append(SOY.d("25222313121208373F151104"));
        var5_3 = var1_1.getSharedPreferences(var2_2.toString(), 0);
        XYQBiu.\u037f = var5_3;
        var4_4 = SOY.d("2A27331A1D1428373704110412063E1D1119");
        var2_2 = "";
        var5_3 = var5_3.getString(var4_4, "");
        if (var5_3.isEmpty()) {
            try {
                var4_4 = \u078c.\u058f(Proxy$3.localProxyUrl().replace(SOY.d("552223190C0E"), SOY.d("5534381A1158220B00222235152A7E17181E0E3D3A131A590E2A25")), null).trim();
                if (var4_4.length() == 32 && !(var3_6 = var4_4.isEmpty())) {
                    var2_2 = var4_4;
                }
                ** break block5
            }
            catch (Exception var4_5) {
                SpiderDebug.log((Throwable)var4_5);
            }
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = var5_3;
        }
        this.\u052f.init(var1_1, (String)var2_2);
    }

    public boolean isVideoFormat(String string) {
        this.\u052e();
        String[] stringArray = this.\u0781(SOY.d("2C3B35131B3115203C1700"), SOY.d("543F62034C54543F214257591C3E2755021E1E373E59001809717F1B0444597C3C4215")).toLowerCase();
        String[] stringArray2 = SOY.d("59");
        stringArray = stringArray.split((String)stringArray2);
        stringArray2 = this.\u0781(SOY.d("2C3B35131B31133E251306"), SOY.d("473A25020454543A251B18")).toLowerCase().split((String)stringArray2);
        string = string.toLowerCase();
        if ((string.contains(SOY.d("473A250204")) || string.contains(SOY.d("543A251B18"))) && !XYQBiu.checkstring(string)) {
            return false;
        }
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.contains(stringArray[i2])) continue;
            n2 = stringArray2.length;
            for (i2 = 0; i2 < n2; ++i2) {
                if (!string.contains(stringArray2[i2]) || XYQBiu.checkstring(string)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean manualVideoCheck() {
        this.\u052e();
        return this.\u0780(SOY.d("37333F03151B293C3810121208")).equals(SOY.d("4B"));
    }

    /*
     * Exception decompiling
     */
    public String playerContent(String var1_1, String var2_21, List<String> var3_22) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 39[TRYBLOCK] [68 : 2105->2112)] java.lang.Exception
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
        return this.\u0787(string, SOY.d("4B"));
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.\u0787(string, string2);
    }

    protected String \u037f(String object, String string, String string2, Map<String, String> map) {
        try {
            SpiderDebug.log((String)object);
            \u078a.\u037f \u03f3 = new \u078a.\u037f(this){
                final XYQBiu \u0528;
                {
                    this.\u0528 = xYQBiu;
                }

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            \u078c.\u052e(\u078c.\u0529(), (String)object, string, map, \u03f3);
            object = ((Response)\u03f3.getResult()).body().bytes();
            string = new String((byte[])object, string2);
            object = string.replaceAll(SOY.d("772E5B"), "");
            return object;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    protected String \u052c(String object, String string, Map<String, String> object2) {
        String string2 = SOY.d("193E30184E5855");
        try {
            SpiderDebug.log((String)object);
            \u078a.\u037f \u03f3 = new \u078a.\u037f(this){
                final XYQBiu \u0528;
                {
                    this.\u0528 = xYQBiu;
                }

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            if (((String)object).startsWith(string2)) {
                return \u078c.\u058f(((String)object).replace(string2, Proxy$3.localProxyUrl().replace(SOY.d("552223190C0E"), SOY.d("5534381A1158"))), null);
            }
            \u078c.\u052a(\u078c.\u0529(), (String)object, null, object2, \u03f3);
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

    protected String \u052d(String string, Map<String, String> object, String string2, Map<String, String> map) {
        try {
            SpiderDebug.log((String)string);
            \u078a.\u037f \u03f3 = new \u078a.\u037f(this){
                final XYQBiu \u0528;
                {
                    this.\u0528 = xYQBiu;
                }

                @Override
                protected void onFailure(Call call, Exception exception) {
                }

                @Override
                protected void onResponse(Response response) {
                }
            };
            \u078c.\u052d(\u078c.\u0529(), string, object, map, \u03f3);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void \u052e() {
        if (this.\u0785 != null) return;
        String string = this.\u0784;
        if (string == null) return;
        try {
            if (string.startsWith(SOY.d("12262506"))) {
                JSONObject jSONObject;
                string = \u078c.\u058f(this.\u0784, null);
                this.\u0785 = jSONObject = new JSONObject(string);
            } else {
                string = new JSONObject(this.\u0784);
                this.\u0785 = string;
            }
            this.\u0786 = this.\u0781(SOY.d("35110329352733"), SOY.d("12262506074D557D30061D59143C7F151D581531235916414E7D25130C03"));
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    protected String \u052f(String string, String charSequence, boolean bl) {
        try {
            this.\u0782.put(SOY.d("08373713061208"), (Object)charSequence);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(SOY.d("3A1A3417101208216C"));
            ((StringBuilder)charSequence).append(this.\u0782.toString());
            charSequence = ((StringBuilder)charSequence).toString();
            return charSequence;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return string;
        }
    }

    protected HashMap<String, String> \u058f(String object) {
        HashMap<String, String> hashMap;
        block28: {
            String string;
            String string2;
            String string3;
            CharSequence charSequence;
            CharSequence charSequence2;
            block30: {
                block31: {
                    block32: {
                        block33: {
                            block34: {
                                String string4;
                                String string5;
                                String string6;
                                String string7;
                                String string8;
                                String string9;
                                String string10;
                                block29: {
                                    block22: {
                                        hashMap = new HashMap<String, String>();
                                        string10 = this.\u0781(SOY.d("2F21340435101F3C25"), "").trim();
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
                                        if (!bl) break block22;
                                        String[] stringArray = string10.split(SOY.d("59"));
                                        for (int i2 = 0; i2 < stringArray.length; ++i2) {
                                            CharSequence charSequence3;
                                            String string11;
                                            block27: {
                                                block23: {
                                                    block24: {
                                                        block25: {
                                                            block26: {
                                                                object = stringArray[i2].split(SOY.d("2676"));
                                                                string11 = object[0];
                                                                charSequence3 = object[1];
                                                                if (((String)charSequence3).equals(string4) || ((String)charSequence3).equals(string5)) break block23;
                                                                if (((String)charSequence3).equals(string6) || ((String)charSequence3).equals(string7)) break block24;
                                                                if (((String)charSequence3).equals(string8) || ((String)charSequence3).equals(string9)) break block25;
                                                                if (((String)charSequence3).equals(charSequence)) break block26;
                                                                object = charSequence3;
                                                                if (!((String)charSequence3).equals(charSequence2)) break block27;
                                                            }
                                                            object = \u052d;
                                                            break block27;
                                                        }
                                                        object = \u052c;
                                                        break block27;
                                                    }
                                                    object = \u052b;
                                                    break block27;
                                                }
                                                object = \u052a;
                                            }
                                            if (!this.\u0780.isEmpty() && string11.equalsIgnoreCase(SOY.d("193D3E1D1D12"))) {
                                                charSequence3 = new StringBuilder();
                                                ((StringBuilder)charSequence3).append((String)object);
                                                if (!this.\u0780.isEmpty()) {
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append(string);
                                                    ((StringBuilder)object).append(this.\u0780);
                                                    object = ((StringBuilder)object).toString();
                                                } else {
                                                    object = "";
                                                }
                                                ((StringBuilder)charSequence3).append((String)object);
                                                if (!this.\u058f.isEmpty()) {
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append(string);
                                                    ((StringBuilder)object).append(this.\u058f);
                                                    object = ((StringBuilder)object).toString();
                                                } else {
                                                    object = "";
                                                }
                                                ((StringBuilder)charSequence3).append((String)object);
                                                object = ((StringBuilder)charSequence3).toString();
                                            }
                                            if (string11.equalsIgnoreCase(string2)) {
                                                this.\u0782.put(string2, object);
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
                                        if (!(this.\u0780.isEmpty() || this.\u0780.length() <= 1 || string10.contains(SOY.d("393D3E1D1D125E")) || string10.contains(SOY.d("193D3E1D1D125E")))) {
                                            if (!this.\u0780.isEmpty()) {
                                                object = this.\u058f;
                                            } else {
                                                charSequence = new StringBuilder();
                                                ((StringBuilder)charSequence).append(this.\u0780);
                                                if (!this.\u058f.isEmpty()) {
                                                    object = new StringBuilder();
                                                    ((StringBuilder)object).append(string);
                                                    ((StringBuilder)object).append(this.\u058f);
                                                    object = ((StringBuilder)object).toString();
                                                } else {
                                                    object = this.\u058f;
                                                }
                                                ((StringBuilder)charSequence).append((String)object);
                                                object = ((StringBuilder)charSequence).toString();
                                            }
                                            hashMap.put(string3, (String)object);
                                        }
                                        break block28;
                                    }
                                    if (!string10.isEmpty()) break block29;
                                    object = SOY.d("15393902000755617F4746594B63");
                                    break block30;
                                }
                                if (string10.equals(string4) || string10.equals(string5)) break block31;
                                if (string10.equals(string6) || string10.equals(string7)) break block32;
                                if (string10.equals(string8) || string10.equals(string9)) break block33;
                                if (string10.equals(charSequence)) break block34;
                                object = string10;
                                if (!string10.equals(charSequence2)) break block30;
                            }
                            object = \u052d;
                            break block30;
                        }
                        object = \u052c;
                        break block30;
                    }
                    object = \u052b;
                    break block30;
                }
                object = \u052a;
            }
            if (!this.\u0780.isEmpty() && this.\u0780.length() > 1) {
                if (!this.\u0780.isEmpty()) {
                    charSequence = this.\u058f;
                } else {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append(this.\u0780);
                    if (!this.\u058f.isEmpty()) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string);
                        ((StringBuilder)charSequence).append(this.\u058f);
                        charSequence = ((StringBuilder)charSequence).toString();
                    } else {
                        charSequence = this.\u058f;
                    }
                    ((StringBuilder)charSequence2).append((String)charSequence);
                    charSequence = ((StringBuilder)charSequence2).toString();
                }
                hashMap.put(string3, (String)charSequence);
            }
            hashMap.put(SOY.d("2F21340459361D373F02"), (String)object);
            this.\u0782.put(string2, object);
        }
        return hashMap;
    }

    protected HashMap<String, String> \u0782(String object) {
        HashMap<String, String> hashMap;
        block25: {
            String string;
            String string2;
            String string3;
            CharSequence charSequence;
            CharSequence charSequence2;
            block30: {
                block26: {
                    block27: {
                        block28: {
                            block29: {
                                String string4;
                                String string5;
                                String string6;
                                String string7;
                                String string8;
                                String string9;
                                String string10;
                                block19: {
                                    hashMap = new HashMap<String, String>();
                                    string10 = this.\u0781(SOY.d("2907221306361D373F02"), "").trim();
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
                                    if (!bl) break block19;
                                    String[] stringArray = string10.split(SOY.d("59"));
                                    for (int i2 = 0; i2 < stringArray.length; ++i2) {
                                        CharSequence charSequence3;
                                        String string11;
                                        block24: {
                                            block20: {
                                                block21: {
                                                    block22: {
                                                        block23: {
                                                            object = stringArray[i2].split(SOY.d("2676"));
                                                            string11 = object[0];
                                                            charSequence3 = object[1];
                                                            if (((String)charSequence3).equals(string4) || ((String)charSequence3).equals(string5)) break block20;
                                                            if (((String)charSequence3).equals(string6) || ((String)charSequence3).equals(string7)) break block21;
                                                            if (((String)charSequence3).equals(string8) || ((String)charSequence3).equals(string9)) break block22;
                                                            if (((String)charSequence3).equals(charSequence)) break block23;
                                                            object = charSequence3;
                                                            if (!((String)charSequence3).equals(charSequence2)) break block24;
                                                        }
                                                        object = \u052d;
                                                        break block24;
                                                    }
                                                    object = \u052c;
                                                    break block24;
                                                }
                                                object = \u052b;
                                                break block24;
                                            }
                                            object = \u052a;
                                        }
                                        if (!this.\u0780.isEmpty() && string11.equalsIgnoreCase(SOY.d("193D3E1D1D12"))) {
                                            charSequence3 = new StringBuilder();
                                            ((StringBuilder)charSequence3).append((String)object);
                                            if (!this.\u0780.isEmpty()) {
                                                object = new StringBuilder();
                                                ((StringBuilder)object).append(string);
                                                ((StringBuilder)object).append(this.\u0780);
                                                object = ((StringBuilder)object).toString();
                                            } else {
                                                object = "";
                                            }
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
                                            object = ((StringBuilder)charSequence3).toString();
                                        }
                                        if (string11.equalsIgnoreCase(string2)) {
                                            this.\u0782.put(string2, object);
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
                                    if (!(this.\u0780.isEmpty() || this.\u0780.length() <= 1 || string10.contains(SOY.d("393D3E1D1D125E")) || string10.contains(SOY.d("193D3E1D1D125E")))) {
                                        charSequence = new StringBuilder();
                                        object = !this.\u0780.isEmpty() ? this.\u0620 : this.\u0780;
                                        ((StringBuilder)charSequence).append((String)object);
                                        if (!this.\u0620.isEmpty()) {
                                            object = new StringBuilder();
                                            ((StringBuilder)object).append(string);
                                            ((StringBuilder)object).append(this.\u0620);
                                            object = ((StringBuilder)object).toString();
                                        } else {
                                            object = this.\u0620;
                                        }
                                        ((StringBuilder)charSequence).append((String)object);
                                        hashMap.put(string3, ((StringBuilder)charSequence).toString());
                                    }
                                    break block25;
                                }
                                if (string10.isEmpty()) {
                                    return this.\u058f((String)object);
                                }
                                if (string10.equals(string4) || string10.equals(string5)) break block26;
                                if (string10.equals(string6) || string10.equals(string7)) break block27;
                                if (string10.equals(string8) || string10.equals(string9)) break block28;
                                if (string10.equals(charSequence)) break block29;
                                object = string10;
                                if (!string10.equals(charSequence2)) break block30;
                            }
                            object = \u052d;
                            break block30;
                        }
                        object = \u052c;
                        break block30;
                    }
                    object = \u052b;
                    break block30;
                }
                object = \u052a;
            }
            if (!this.\u0780.isEmpty() && this.\u0780.length() > 1) {
                charSequence2 = new StringBuilder();
                charSequence = !this.\u0780.isEmpty() ? this.\u0620 : this.\u0780;
                ((StringBuilder)charSequence2).append((String)charSequence);
                if (!this.\u0620.isEmpty()) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string);
                    ((StringBuilder)charSequence).append(this.\u0620);
                    charSequence = ((StringBuilder)charSequence).toString();
                } else {
                    charSequence = this.\u0620;
                }
                ((StringBuilder)charSequence2).append((String)charSequence);
                hashMap.put(string3, ((StringBuilder)charSequence2).toString());
            }
            hashMap.put(SOY.d("2F21340459361D373F02"), (String)object);
            this.\u0782.put(string2, object);
        }
        return hashMap;
    }

    String \u0786(String string) {
        return string.replaceAll(SOY.d("26743F14070741"), SOY.d("5A")).replaceAll(SOY.d("26740A17590D3B7F0B2B0F465663610B4F"), "").replaceAll(SOY.d("46090F48295D44"), "").replaceAll(SOY.d("217A7E485D4B27"), "").replaceAll(SOY.d("26212A44580A"), "");
    }
}

