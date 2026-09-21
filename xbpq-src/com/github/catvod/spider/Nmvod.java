/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.b;
import com.github.catvod.spider.Init2;
import com.github.catvod.spider.c;
import com.github.catvod.spider.d;
import com.github.catvod.spider.f;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.e;
import com.github.catvod.spider.merge.g;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.merge.pv;
import com.github.catvod.spider.merge.xx;
import com.github.catvod.spider.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Nmvod
extends Spider {
    private static String l8 = "";
    private static final short[] short = Nmvod.$d2j$hex$fd9f07ef$decode_S("55040c0415041e0457040e0403040a041f04570413041e045704520426041e045104530457040a041d045704520426041e0451045304540412040e04170416049405cd05d405df05cf05c205cb05de05d305cf05d605d70594059305e705df05900592059505d305cf05d605d705ac02f502ec02e702eb02f702ee02ef02ac02ab02df02e702a802aa02ad02eb02f702ee02ef02d903800399039203db0392039303820397039f039a03db039f039203db03de03aa039203dd03df03d8039e0382039b039a0306035f0346034d0304035903450348035003040340034d030403010375037a0302030003070341035d034403450334096d0974097f0936097709720968096f09360972097f093609330947097f093009320936096b097c093609330947097f09300932093609740969097f097e096909360936097909620936096f09720976097e093609780977097a096809680936092b09360962097e097a09690936092b09360977097e096f096f097e096909360936097a0969097e097a093609360977097a0975097c093609350973096f0976097709fd07d107d307e007dc07d107c907d507c207f307df07de07d607d907d7079e07c007dc07d107c907d507c207ef07dc07d907c307c4078d079807ec07cb079e079a07ec07cd079907ec079c07fd07d107d307e007dc07d107c907d507c207f307df07de07d607d907d7079e07d407df07c707de07d507c207ef07dc07d907c307c4078d07ce03c203c003fc03d603d103cf039e0384038b038d0389038a0384039803460c0f0c010c1d0c460c5e0c460c4c0c4a0c4e0c4d0c460c480c570503051e0510050c0557054f0557055d055b055f055c0557055905450313030e030a03020345035d0345034f0349034d034e0345034b036c074a075c074b07140778075e075c0757074d072107030716070507000700070d074307590742075c074c0744072007050702071907140757074c072d07020708071e070307050708074c075d075d0757074c0721075e075c075c075b0726075f073f072f074c072e07190705070007080743073e0727073d075d0742075e075c075c0754075e075a0742075c075c075e0757074c071b071a0745074c072d071c071c07000709073b0709070e07270705071807430759075f075b0742075f075a074c0744072707240738072107200740074c0700070507070709074c072b0709070f070707030745074c073a0709071e071f070507030702074307580742075c074c072f0704071e0703070107090743075b075b0742075c0742075f0754075a07590742075d075e075c074c0721073d073d072e071e0703071b071f0709071e0743075a0742075e074c0738072e073f0743075c07580759075b075d0758074c07210703070e070507000709074c073f070d070a070d071e070507430759075f075b0742075f075a078a058f05c6058705f103ed03ed03e903ea03a303b603b603ef03f003e903b703ee03ee03fe03e303b703fa03f703a303ac03ab03a903a903b603f003f703fd03fc03e103b703e903f103e903a603f403a403ef03f603fd03b403f503f003ea03ed03b403f003fd03b403640339032e036403ae0bec0bf10be70be60bf10bae0bae0be10bfa0bae0bf70bea0bee0be60bae0be00bef0be20bf00bf00bae0bb30bae0bfa0be60be20bf10bae0bb30bae0bef0be60bf70bf70be60bf10bae0bae0be20bf10be60be20bae0bae0bef0be20bed0be40bae0bad0beb0bf70bee0bef0b260a2b0a340a6c0a320a230a250a270a7c0a230a0c06160601060206d909c809ce09cc09c509c009c709c209f609cb093f547490fe65566e216b6f5bf769ac69de80db7f8c77c36eb95d8b049204d0048c049b048d04970484049b04a104920497048d048a04de0492049704d709ca09d709cf09c609fc0bf90bb00bf10bb00bf40bf90be60bbe0be00bf90bf30bb00bf90bfd0bf70b3104300421043e093b0972093309720936093b0924097c0922093b09310972092109220933093c097c09210910093d09260926093d093f0972092109220933093c09a304ba04b1048a04bc04b104c50adc0ad70aec0add0ad20ade0ad60a27013e0135010e01210138013201b402ad02a6029d02b002a702af02a302b002a902b1022d093c093a093809110200020602040202020e0214020f0215024a0c4f0c4b0c4f0c520c42055905420557055a056703620378037f030405180518051c051f055605430543051a0505051c0542051b051b050b05160542050f050205560559055e055c055c0543051a050305080541050805090518050d05050500054105050508054105360570056c057505740540095c095c0958095b091209070907095e094109580906095f095f094f09520906094b09460912091d091a091809180907095e0947094c0905095809440949095109050941094c090509320c6c0c6d0c7c0c320c2e0c320c710c6a0c720c320c2e0c310c770c6b0c720c730c34092209240933092e0928092909690937092609200922096a092f0923096709260967092e092a092009f409f509e4094c0615060a0650064d065006480641060406450680039603900387039a039c039d03dd038303920394039603de0391039703d30397039a038503dd039703960380039003ac039a03870396039e032a0a290a380a370a3e53d667df04ec01f501fe01c501fe01f301e801ff01f901ee01f501e801ba4a956b410c580c530c680c560c540c430c580c450c7077c765a109b809b3098809a509b209ba09b609a509bc0975027c027d026702125b854b63067a0671064a066c06700674066706e204f104f704ea04e004ef04e604ad04e704e604f704e204ea04ef04ae04e004ec04ed04bd04f304790c600c6b0c500c660c6b0c3b0122012901120123012c0120012801300b290b220b190b360b2f0b250bef02f602fd02c602fa02f602f702ed02fc02f702ed022461e569a359cc51285b0d5b79874cf5b781bf584a4413559759d79041f541f5b80ab50aaa0af20ab80ab90aa80abd0ab50ab00a8c0ab30aaf0aa80ab90aae0a950ab20aa80aae0ab30afc0aaf0abf0aae0ab50aac0aa80ac207db07d007eb07c407d807d507cd07eb07d207c607db07d907c18755524f0456045d046604490455045804400466044c044b0455046b066e067406730691089408dd089c0899098509850981098209cb09de09de09870998098109df098609860996098b09df0992099f09cb09c409c309c109c109940b990b860bd30b840b9f0b800b9e0b910b860bd00b850b9c0bde0b830b870b990b800b950b820bdd0b870b820b910b800b800b950b820bd00b9c0b990bd00b910b99048304940497043477705d548e677fed534077c68b4257c16a6076ea53ea08e708ee08fb08c108f708fa08bd04b004b904ac049604a704a804a404ac04230a2c0a290a310a200a370a360a11061e0613060106010673096a0928097409630975096f097c09630959096a096f09750972093406290634062c062506ea04ef04a604e704a604e204ef04f004a804f604ef04e504a604ef04eb04e1047008710860089a0a9f0ad60a970ad60a920a9f0a800ad80a860a9f0a950ad60a850a860a970a980ad80a850ab40a990a820a820a990a9b0ad60a850a860a970a980ad70bce0bc50bfe0bc80bc50bea03f303f803c303f203fd03f103f903db09c209c909f209dd09c409ce09120a0b0a000a3b0a160a010a090a050a160a0f0a170a510a540a4e0a490ae301f401e701b501e001e701f901a801b201bd01bb01bf01bc01b201ae01580349035a035b034d03370530052e0592078e078e078a078907c007d507d5078c0793078a07d4078d078d079d078007d40799079407c007cf07c807ca07ca07d507930794079e079f078207d4078a0792078a07c5079707c7078c0795079e07d70789079f079b0788079907920767027402020507051d051a05");
    private Pattern A;
    private Pattern HM;
    private Pattern N;
    private Pattern OL;
    private JSONObject S;
    private Pattern T4 = Pattern.compile(g.c(short, 0, 32, 1146));
    private Pattern b = Pattern.compile(com.github.catvod.parser.e.b(short, 32, 23, 1467));
    private Pattern cD;
    private Pattern l;
    private Pattern n;
    private Pattern s;
    private Pattern tT;
    private Pattern v;

    /*
     * Enabled aggressive block sorting
     */
    public Nmvod() {
        this.OL = Pattern.compile(com.github.catvod.spider.merge.d.e(short, 55, 19, 643));
        this.l = Pattern.compile(f.d(short, 74, 25, 1014));
        this.tT = Pattern.compile(com.github.catvod.parser.g.c(short, 99, 23, 809));
        Object object = c.e(short, 122, 82, 2331);
        this.N = Pattern.compile((String)object);
        this.HM = Pattern.compile((String)object);
        this.n = Pattern.compile(e.e(short, 204, 66, 1968));
        this.v = Pattern.compile(e.e(short, 270, 15, 931));
        this.A = Pattern.compile(e.e(short, 285, 13, 3172));
        this.cD = Pattern.compile(f.d(short, 298, 14, 1397));
        this.s = Pattern.compile(com.github.catvod.parser.g.c(short, 312, 14, 871));
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
                    object = Float.decode((String)com.github.catvod.parser.g.d("TrLDHR"));
                    System.out.println(object);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    static /* synthetic */ Pattern l8(Nmvod nmvod) {
        return nmvod.l;
    }

    protected HashMap<String, String> S(String string) {
        string = "\u06e7\u06e8\u06e5";
        HashMap<String, String> hashMap = null;
        String string2 = null;
        String string3 = null;
        short[] sArray = null;
        block8: while (true) {
            switch (com.github.catvod.spider.v.d(string)) {
                default: {
                    return hashMap;
                }
                case 56451: {
                    sArray = short;
                    string = "\u06e4\u06e5\u06e7";
                    continue block8;
                }
                case 1750785: {
                    string3 = h.e(sArray, 336, 187, 1900);
                    string = "\u06e1\u06e3\u06e6";
                    continue block8;
                }
                case 1751686: {
                    string2 = d.e(sArray, 326, 10, 1849);
                    string = "\u06e2\u06e1\u06e5";
                    continue block8;
                }
                case 1749638: {
                    sArray = short;
                    string = "\u06e3\u06e7\u06e5";
                    continue block8;
                }
                case 1754660: {
                    hashMap = new HashMap<String, String>();
                    string = "\u06e4\u06e7";
                    continue block8;
                }
                case 1748740: 
            }
            hashMap.put(string2, string3);
            string = "\u06e6\u06e2\u06e4";
        }
    }

    /*
     * Exception decompiling
     */
    public String categoryContent(String var1_1, String var2_3, boolean var3_4, HashMap<String, String> var4_5) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public String detailContent(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [11 : 1196->1404)] java.lang.Exception
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
     * Exception decompiling
     */
    public String homeContent(boolean var1_1) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void init(Context object, String string) {
        void var2_3;
        super.init(object);
        l8 = pv.l((String)var2_3);
        int n2 = com.github.catvod.parser.c.b();
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
                    Float f2 = Float.decode((String)com.github.catvod.parser.b.c("3UiWM7HEvIJbsUedRR"));
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String string, String object, List<String> object2) {
        Init2.lj();
        string = new JSONObject();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(l8);
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        object = Yy.v((String)object, this.S((String)object));
        object = Pattern.compile(f.d(short, 1354, 15, 405)).matcher((CharSequence)object);
        boolean bl = ((Matcher)object).find();
        int n2 = 1616;
        block9: while (true) {
            switch (n2 ^= 0x661) {
                default: {
                    continue block9;
                }
                case 49: {
                    if (bl) {
                        n2 = 1709;
                        continue block9;
                    }
                }
                case 14: {
                    n2 = 1678;
                    continue block9;
                }
                case 204: {
                    try {
                        object = ((Matcher)object).group(1);
                        string.put(g.c(short, 1369, 5, 808), 0);
                        string.put(d.e(short, 1374, 3, 1346), object);
                        return string.toString();
                    }
                    catch (Exception exception) {
                        SpiderDebug.log((Throwable)exception);
                        return "";
                    }
                }
                case 239: 
            }
            break;
        }
        return "";
    }

    /*
     * Unable to fully structure code
     */
    public String searchContent(String var1_1, boolean var2_4) {
        var4_5 = new JSONArray();
        try {
            var5_6 = e.e(Nmvod.short, 1377, 47, 2042);
            var6_7 = new HashMap<String, String>();
            var6_7.put(c.e(Nmvod.short, 1424, 2, 528), (String)var1_1);
            var7_8 = Yy.T4();
            var8_9 = this.S("");
            var1_1 = new xx.ut(this, var4_5){
                private static final short[] short = new short[]{827, 802, 877, 810, 815, 826, 815, 785, 802, 807, 829, 826, 878, 802, 807, 2450, 2463, 2432, 2520, 2434, 2446, 2434, 2494, 2451, 2463, 2449, 2462, 2434, 2518, 2437, 2438, 2455, 2456, 2520, 2437, 2466, 2463, 2434, 2619, 2614, 2601, 2673, 2607, 2614, 2620, 2687, 2622, 2687, 2614, 2610, 2616, 2478, 2479, 2494, 2993, 3004, 2979, 3067, 2981, 3004, 2998, 3061, 2996, 1721, 1699, 1716, 1719, 541, 516, 527, 564, 514, 527, 1141, 1132, 1127, 1116, 1133, 1122, 1134, 1126, 2450, 2443, 2432, 2491, 2452, 2445, 2439, 820, 813, 806, 797, 816, 807, 815, 803, 816, 809, 817};
                final JSONArray S;
                final Nmvod T4;
                {
                    void var2_3;
                    this.T4 = object;
                    this.S = var2_3;
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
                                Long l2 = Long.valueOf(com.github.catvod.spider.v.e("tfzm1OhFzTYbQS0Ah964ijT4"));
                                System.out.println(l2);
                                return;
                            }
                            case 239: 
                        }
                        break;
                    }
                }

                @Override
                public void onFailure(Call call, Exception exception) {
                }

                /*
                 * Exception decompiling
                 */
                @Override
                public String onResponse(String var1_1) {
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
            Yy.tT(var7_8, var5_6, var6_7, var8_9, var1_1);
        }
        catch (Exception var1_3) {
            var3_10 = 1616;
            block11: while (true) {
                switch (var3_10 ^= 1633) {
                    case 14: {
                        ** continue;
                    }
                    default: {
                        continue block11;
                    }
                    case 49: 
                }
                var3_10 = 1647;
            }
        }
lbl12:
        // 2 sources

        while (true) {
            try {
                var1_1 = new JSONObject();
                var1_1.put(g.c(Nmvod.short, 1426, 4, 1390), var4_5);
                var1_1 = var1_1.toString();
lbl18:
                // 2 sources

                return var1_1;
            }
            catch (Exception var1_2) {
                SpiderDebug.log((Throwable)var1_2);
                var1_1 = "";
                ** continue;
            }
            break;
        }
    }

    private static long[] $d2j$hex$fd9f07ef$decode_J(String src) {
        byte[] d2 = Nmvod.$d2j$hex$fd9f07ef$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$fd9f07ef$decode_I(String src) {
        byte[] d2 = Nmvod.$d2j$hex$fd9f07ef$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$fd9f07ef$decode_S(String src) {
        byte[] d2 = Nmvod.$d2j$hex$fd9f07ef$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$fd9f07ef$decode_B(String src) {
        char[] d2 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i2 = 0; i2 < ret.length; ++i2) {
            int ll;
            int hh;
            char h2 = d2[2 * i2];
            char l2 = d2[2 * i2 + 1];
            if (h2 >= '0' && h2 <= '9') {
                hh = h2 - 48;
            } else if (h2 >= 'a' && h2 <= 'f') {
                hh = h2 - 97 + 10;
            } else if (h2 >= 'A' && h2 <= 'F') {
                hh = h2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l2 >= '0' && l2 <= '9') {
                ll = l2 - 48;
            } else if (l2 >= 'a' && l2 <= 'f') {
                ll = l2 - 97 + 10;
            } else if (l2 >= 'A' && l2 <= 'F') {
                ll = l2 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i2] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

