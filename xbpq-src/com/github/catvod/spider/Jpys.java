/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.a;
import com.github.catvod.parser.b;
import com.github.catvod.spider.Init2;
import com.github.catvod.spider.d;
import com.github.catvod.spider.e;
import com.github.catvod.spider.f;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.ZP;
import com.github.catvod.spider.merge.g;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.merge.pv;
import com.github.catvod.spider.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Jpys
extends Spider {
    private static final short[] short = Jpys.$d2j$hex$56231c5a$decode_S("0002040207021b021b021f0240025a0241025f0241025f0242020e0203021f0207020e0241025e025b027f0879086f08780827086b086d086f0864087e088d098c099f0980098a098c0980098d098602a702b402ab02a102a702ab02a602710a4b0a450a4c0a1b064608430859085e08340a7a0a6b0a720a340a760a6c0a360a760a740a6d0a720a7e0a340a7a0a750a740a750a620a760a740a6e0a680a340a6d0a720a7f0a7e0a740a340a770a720a680a6f0a240a6f0a620a6b0a7e0a2a0a260a4e03180309030f030d0326031d0305035503c0068706940683068706db06c0069f06830687069406db069d098e0999099d09c109da098c099d099b099909b20989099109c109970ac50ac80ac10ad40a800a8c0a6e0631062d0629063a0675066e0623062d06310675062b062a067006780670067d067a0671062a0629062d067e062a067e062a062d067c067d062d062b062e0629062a067a06710629067c067006700671062a062b066e063c067506b009b509a009b50911030803030338030e0303033d0a240a2f0a020a2f0a960b8f0b840bbf0b8e0b810b8d0b850b100309030203280307030b0303038f0b960b9d0ba60b890b900b9a0b2a09330938090c0935093f094a0b530b580b6e0b590b510b5d0b4e0b570b4f0b1d0c060c1f0c1f0c6109780973094809650972097a09760965097c096409380b290b2f0b2d0b690578057e057c057a0576056c0577056d056f086a086e086a087708ff02e402ff02ea02e702790662067b067b068b01c501d401cd018b01c901d3018901c901cb01d201cd01c1018b01c501ca01cb01ca01dd01c901cb01d101d7018b01d201cd01c001c101cb018b01c001c101d001c501cd01c8019b01cd01c0019901520a5f0a060a2f0462046c04700434046a046b043104390431043c043b0430046b0468046c043f046b043f046b046c043d043c046c046a046f0468046b043b04300468043d043104310430046b046a042f047d043404b203b703a203b70313010a0101013a010c010101ec08f508fe08d308fe08910388038303b803890386038a03820386079f079407be0791079d079507320c2b0c200c1b0c340c2d0c270cc807d107da07ee07d707dd076e0263026a027f02450274027b0277027f028a0787078e079b07b0079f0793079b0703061a0611062a060c06100614060706570c4e0c450c780c440c400c530c54084d0846087d0843085008470843089a0183018801ad019e0189018d0163077a077107470770077807740767077e076607660b7f0b740b4f0b620b750b7d0b710b620b7b0b630bf503ec03e703dc03e203e003f703ec03f1037c0a650a6e0a4b0a690a7e0a650a780a380c210c2a0c110c2a0c270c3c0c2b0c2d0c3a0c210c3c0c35032c03270307032a0331032603200337032c033103b00ba90ba20b850ba90ba80bb20ba30ba80bb20b1f0306030d0336030a03060307031d030c0307031d03406d8165c755a85d4c5769571d8b28f9d38ddb542e487759f355b39c25f925f9010114010d0117010b010001010128010d01170110015e0351035d0355037b074a044d0440041606a404e203e203e203f304ea04e104da04f504e904e404fc04da04e304f704ea04e804498fdd5a4672396fc806d106da06e106ce06d206df06c706e106cb06cc06d206310634062e0629060003200379032f0322032b033e03040332033f037903610379036a037903770379032f0322032b033e03040335033a0336033e037903610379036e762a5c790326037703200379032f0322032b033e03040332033f0379036103790369037903770379032f0322032b033e03040335033a0336033e037903610379036e769d8a3c51790326037703200379032f0322032b033e03040332033f0379036103790368037903770379032f0322032b033e03040335033a0336033e03790361037903a77d2181790326037703200379032f0322032b033e03040332033f037903610379036f037903770379032f0322032b033e03040335033a0336033e03790361037903f351706c790326030603b608b908b408a608a6086e042004310428046e042c0436046c042c042e043704280424046e0420042f042e042f0438042c042e04340432046e0429042e042c0424046e0429042e043504120424042004330422042904ad07a307bf07fb07a507a407fe07f607fe07f307f407ff07a407a707a307f007a407f007a407a307f207f307a307a507a007a707a407f407ff07a707f207fe07fe07ff07a407a507e007b207fb07cd01c801dd01c8017c0a650a6e0a430a6e0a87089e089508bf0890089c08940866067f067406400679067306570a4e0a450a730a440a4c0a400a530a4a0a520ab802a102aa029102a702aa022d0534053f05040535053a0536053e05950b8c0b870bbc0b930b8a0b800bd704ce04c504fe04d304c404cc04c004d304ca04d2047c047904630464047f0b7a0b6f0b7a0bf302bb02bc02b102e8023b0b3c0b220ba807880760042e043f042604600422043804620422042004390426042a0460042e042104200421043604220420043a043c04600439047d046004390426042b042a04200460042a043f0426043c0420042b042a0460043a043d04230470042c04230426042a0421043b041b0436043f042a0472047c04690426042b047204d303dc03d903d503de03c403e403c903c003d5038d0383039603d903d4038d03b704fa04f404e804ac04f204f304a904a104a904a404a304a804f304f004f404a704f304a704f304f404a504a404f404f204f704f004f304a304a804f004a504a904a904a804f304f204b704e504ac048601830199019e019a0a8b0a980a990a8f0a22033e0333032b03070320033e03180b1d0b070b000b3909770966097f0939097b0961093b097b09790960097f097309390977097809790978096f097b09790963096509390960097f097209730979093909650973097709640975097e0954096f09410979096409720929097d0973096f0961097909640972092b09bb0ced0cfc0cfa0cf80cd30ce80cf00ca00cac0cbb0ced0cfc0cfa0cf80cce0cf40ce70cf80ca00ca50c55075b074707490751074c075a070307910cc70cd60cd00cd20cf90cc20cda0c8a0c860c910cc70cd60cd00cd20ce40cde0ccd0cd20c8a0c8f0c910cdc0cd20cce0c8a0cd40cd50c8f0c870c8f0c820c850c8e0cd50cd60cd20c810cd50c810cd50cd20c830c820cd20cd40cd10cd60cd50c850c8e0cd60c830c8f0c8f0c8e0cd50cd40c910cc30c8a0c4404410454044104da05cd05db05dd05c405dc053c0825082e08150823082e0837052e05250508052505570a4e0a450a7e0a4f0a400a4c0a440a53084a0841086b08440848084008ba02a302a8029302bc02a502af0296068f068406b00689068306b202ab02a0029602a102a902a502b602af02b702ec06f706ee06ee06840a9d0a960aad0a800a970a9f0a930a800a990a810a");
    private String S = v.b(short, 0, 21, 623);
    private String T4 = "";
    private String l8 = "";

    /*
     * Enabled aggressive block sorting
     */
    public Jpys() {
        int n2 = com.github.catvod.spider.merge.e.c();
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
                    n3 = Integer.parseInt(com.github.catvod.parser.e.e("VP3RiynPZkGDBtRgy3m9zUQJCV02"));
                    System.out.println(n3);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    private HashMap<String, String> S(String string, String string2) {
        String string3 = "\u06e4\u06df\u06e1";
        Charset charset = null;
        HashMap<String, String> hashMap = null;
        String string4 = null;
        String string5 = null;
        short[] sArray = null;
        String string6 = string;
        string = string3;
        block21: while (true) {
            switch (v.d(string)) {
                default: {
                    string4 = f.d(sArray, 21, 10, 2058);
                    string = "\u06e0\u06e8\u06e7";
                    continue block21;
                }
                case 56293: {
                    string5 = ZP.l8(string6, charset);
                    string = "\u06e6\u06e3\u06e6";
                    continue block21;
                }
                case 1747935: {
                    hashMap.put(string4, string5);
                    string = "\u06e4\u06df\u06e8";
                    continue block21;
                }
                case 1746877: {
                    hashMap.put(string5, string2);
                    string = "\u06e6\u06e5\u06e7";
                    continue block21;
                }
                case 1746935: {
                    sArray = short;
                    string = "\u06e5\u06e2\u06e7";
                    continue block21;
                }
                case 1752554: {
                    string5 = b.b(sArray, 51, 1, 1647);
                    string = "\u06df\u06e5\u06e3";
                    continue block21;
                }
                case 1753545: {
                    string6 = ZP.S(string5);
                    string = "\u06e4\u06e1\u06e0";
                    continue block21;
                }
                case 1754537: {
                    string5 = d.e(sArray, 39, 8, 706);
                    string = "\u06e1\u06e4\u06e7";
                    continue block21;
                }
                case 1751501: {
                    sArray = short;
                    string = "\u06e2\u06e4\u06e3";
                    continue block21;
                }
                case 1752610: {
                    charset = ZP.S;
                    string = "\u06df\u06e4";
                    continue block21;
                }
                case 56536: {
                    hashMap.put(string4, string6);
                    string = "\u06df\u06e7\u06df";
                    continue block21;
                }
                case 1751555: {
                    string5 = this.S;
                    string = "\u06e1\u06e2\u06e8";
                    continue block21;
                }
                case 1746723: {
                    string4 = b.b(sArray, 47, 4, 2594);
                    string = "\u06e7\u06df";
                    continue block21;
                }
                case 1749729: {
                    string4 = d.e(sArray, 31, 8, 2537);
                    string = "\u06e4\u06e5\u06e6";
                    continue block21;
                }
                case 1751494: {
                    hashMap = new HashMap<String, String>();
                    string = "\u06e5\u06e4\u06e1";
                    continue block21;
                }
                case 1748711: {
                    sArray = short;
                    string = "\u06e5\u06e5";
                    continue block21;
                }
                case 1748772: {
                    hashMap.put(string4, string5);
                    string = "\u06e2\u06e0\u06e3";
                    continue block21;
                }
                case 1751685: {
                    sArray = short;
                    string = "\u06e7\u06e4\u06e6";
                    continue block21;
                }
                case 1749605: {
                    sArray = short;
                    string = "\u06df\u06e0\u06e4";
                    continue block21;
                }
                case 1753608: 
            }
            break;
        }
        return hashMap;
    }

    private void l8() {
        this.l8 = pv.l(this.T4);
    }

    /*
     * Exception decompiling
     */
    public String categoryContent(String var1_1, String var2_3, boolean var3_4, HashMap<String, String> var4_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CASE]], but top level block is 1[TRYBLOCK]
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
     * Exception decompiling
     */
    public String detailContent(List<String> var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CASE]], but top level block is 1[TRYBLOCK]
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
     * Exception decompiling
     */
    public String homeContent(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CASE]], but top level block is 1[TRYBLOCK]
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
     * Exception decompiling
     */
    public String homeVideoContent() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CASE]], but top level block is 1[TRYBLOCK]
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
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void init(Context object, String string) {
        void var2_3;
        super.init(object);
        this.T4 = var2_3;
        int n2 = b.d();
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
                    Float f2 = Float.decode((String)g.d("EV0PUGXy9"));
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
    public String playerContent(String var1_1, String var2_3, List<String> var3_4) {
        var3_4 = h.e(Jpys.short, 892, 4, 2843);
        var6_5 = com.github.catvod.parser.e.b(Jpys.short, 896, 5, 725);
        var1_1 = h.e(Jpys.short, 901, 3, 2894);
        Init2.lj();
        var7_6 /* !! */  = var2_3.split(e.d(Jpys.short, 904, 2, 2036));
        var2_3 = var7_6 /* !! */ [0];
        var7_6 /* !! */  = var7_6 /* !! */ [1];
        var8_7 /* !! */  = new StringBuilder();
        var8_7 /* !! */ .append(this.l8);
        var8_7 /* !! */ .append(e.d(Jpys.short, 906, 61, 1103));
        var8_7 /* !! */ .append((String)var7_6 /* !! */ );
        var8_7 /* !! */ .append(var6_5);
        var8_7 /* !! */ .append(var2_3);
        var8_7 /* !! */  = var8_7 /* !! */ .toString();
        var9_8 = String.valueOf(System.currentTimeMillis());
        var10_9 = new StringBuilder();
        var10_9.append(com.github.catvod.parser.f.c(Jpys.short, 967, 16, 944));
        var10_9.append((String)var7_6 /* !! */ );
        var10_9.append(var6_5);
        var10_9.append(var2_3);
        var10_9.append(com.github.catvod.parser.d.b(Jpys.short, 983, 40, 1169));
        var10_9.append(var9_8);
        var6_5 = Yy.v((String)var8_7 /* !! */ , this.S(var10_9.toString(), var9_8));
        var2_3 = new JSONObject(var6_5);
        var6_5 = var2_3.getJSONObject((String)var3_4).optJSONArray(a.c(Jpys.short, 1023, 4, 490)).getJSONObject(0);
        var5_10 = var6_5.has(var1_1);
        var2_3 = a.c(Jpys.short, 1027, 5, 2794);
        var4_11 = 1616;
        block11: while (true) {
            switch (var4_11 ^= 1633) {
                default: {
                    continue block11;
                }
lbl46:
                // 2 sources

                case 14: {
                    var4_11 = 1678;
                    continue block11;
                }
                case 49: {
                    if (!var5_10) ** GOTO lbl46
                    var4_11 = 1709;
                    continue block11;
                }
                case 204: {
                    var3_4 = var6_5.optString(var1_1);
                    var6_5 = new JSONObject();
                    var6_5.put(var1_1, var3_4);
                    var6_5.put(var2_3, 0);
                    var1_1 = var6_5.toString();
lbl62:
                    // 3 sources

                    return var1_1;
                }
                case 239: 
            }
            break;
        }
        try {
            var3_4 = var6_5.optJSONObject((String)var3_4).optString(b.b(Jpys.short, 1032, 7, 850));
            var6_5 = new JSONObject();
            var6_5.put(var1_1, var3_4);
            var6_5.put(var2_3, 0);
            var1_1 = var6_5.toString();
            ** GOTO lbl62
        }
        catch (Exception var1_2) {
            SpiderDebug.log((Throwable)var1_2);
            var1_1 = null;
            ** continue;
        }
    }

    /*
     * Exception decompiling
     */
    public String searchContent(String var1_1, boolean var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CASE]], but top level block is 1[TRYBLOCK]
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

    private static long[] $d2j$hex$56231c5a$decode_J(String src) {
        byte[] d2 = Jpys.$d2j$hex$56231c5a$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$56231c5a$decode_I(String src) {
        byte[] d2 = Jpys.$d2j$hex$56231c5a$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$56231c5a$decode_S(String src) {
        byte[] d2 = Jpys.$d2j$hex$56231c5a$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$56231c5a$decode_B(String src) {
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

