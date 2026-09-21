/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.a;
import com.github.catvod.parser.b;
import com.github.catvod.spider.Init2;
import com.github.catvod.spider.c;
import com.github.catvod.spider.d;
import com.github.catvod.spider.e;
import com.github.catvod.spider.merge.f;
import com.github.catvod.spider.merge.g;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Dygang
extends Spider {
    private static final short[] short = Dygang.$d2j$hex$2e4a8d95$decode_S("2f0b280b5c0b530b2b0b290b2f0bfa048e048104f904fb0453050c0510051d0505055305540520052f055705550553055404020408045404120415041f041e0403042404530427041f0450045204550413040f041604bb05ba05a805c305d605a708a208f208f308f108f208610a470a510a460a190a750a530a510a5a0a400afb0bd90bcc0bdf0bda0bda0bd70b990b830b980b860b960b9e0be10bdf0bd80bd20bd90bc10bc50b960bf80be20b960b870b860b980b860b8d0b960be10bdf0bd80b800b820b8d0b960bce0b800b820b9f0b960bf70bc60bc60bda0bd30be10bd30bd40bfd0bdf0bc20b990b830b850b810b980b850b800b960b9e0bfd0bfe0be20bfb0bfa0b9a0b960bda0bdf0bdd0bd30b960bf10bd30bd50bdd0bd90b9f0b960bf50bde0bc40bd90bdb0bd30b990b870b870b860b980b860b980b860b980b860b960be50bd70bd00bd70bc40bdf0b990b830b850b810b980b850b800b960bf30bd20bd10b990b870b870b860b980b860b980b870b830b8e0b810b980b830b810b51037d037c03660377037c0366033f0346036b03620377031c0b0d0b0d0b110b140b1e0b1c0b090b140b120b130b520b050b500b0a0b0a0b0a0b500b1b0b120b0f0b100b500b080b0f0b110b180b130b1e0b120b190b180b190bf001d201d201d401c101c5019c01f401df01d201de01d501d801df01d6018807950786079f07420546054c057f0c630c630c670c640c2d0c380c380c600c600c600c390c730c6e0c700c760c790c700c390c630c610c380c6103270320032a032b033603600326033a032303a909ef09e809e209e309fe09d909b50bf30bef0bf60b4c065c0618065906630650064a065d065e06120605061f06510656065c065d06400667061f066506ca02d002c702c402720bf157ba934065e86e9f6bd15b496912696080657f32777d6e075d200235023602380231027a0236023b022602300231022602650274023502480745075d076008610870089b7cc1569b0482048904b20484048904b902a002ab029002a102ae02a202aa027c0a650a6e0a550a7a0a630a690afb01e201e901d201ff01e801e001ec01ff01e601fe019d068c068a068806940b850b830b810b870b8b0b910b8a0b900be309e609e209e609fb09100a0b0a100a050a080a450b400b5a0b5d0b4e0852085208560855081c0809080908510851085108080842085f084108470848084108080852085008f803e803af03e803e903e803e903d303ef03e303e203f803e903e203f803ac03e503e103eb03520b530b420bf807f507ea07b207e807f507e807f007f907bc07fd07d906c006cb06f006c606cb06080b110b1a0b210b100b1f0b130b1b0b2d0634063f0604062b0632063806e409f409b009ae09b009f109cb09f809e209f509f609ba09ad09b709fd09f109f709fe09f509e409b709cd09d50aa70aa40ade0cc40cd30cd00c40052f0936093d090609290935093809200906093f092b0936093409987cdc5682675e0c470c4c0c770c580c440c490c510c770c5d0c5a0c440c6709620978097f091e0c1a0c100c5f0443044304470444040d0418041804400440044004190453044e045004560459045004190443044104200930095a0916091309590912091809110911090009540915092d093709200923093c54a650f76e476cc27c86565378e457449c9968fd534d943570715ae9765e590966617a880af70a6490b9648659f7912a65b058f77d9d6191931f563d7ed453c27a4486365ab567d509a209d37c9756ca7435552778700c7d0c740c610c5b0c6d0c600ce101ec01e501f001ca01fb01f401f801f001810b8e0b8b0b930b820b950b940bf206fd06f006e206e206010414041704190410045b0417041a04070411041004070444045504140451075c0744073307320723079472ce5805011c0117012c011a011701440a5d0a560a6d0a5c0a530a5f0a570a03041a0411042a0405041c041604c006d906d206e906c406d306db06d706c406dd06c5061d07180702070507e003b903e303fc03c403fa03eb03eb03c403eb03f703fa03e203fe03e903b903a103e003b903e803f303f403ec03b903a103b903fa03eb03eb03f352db5f788a0b64b903b703b903ff03fe03e803b903a103b903b903b703b903eb03e803b903a103b903aa03b903b703b903eb03fa03e903e803fe03b903a103b903f303ef03ef03eb03e803a103c703b403c703b403ec03ec03ec03b503e303b603f503b503f803f803c703b403fa03eb03f203b503eb03f303eb03a403ee03e903f703a603b903e603b703b903eb03eb03fa03e203ee03f503a903b903a103e003b903e803f303f403ec03b903a103b903884d247dda33b903b703b903ff03fe03e803b903a103b903eb03eb030a4db903b703b903eb03e803b903a103b903ab03b903b703b903eb03fa03e903e803fe03b903a103b903f303ef03ef03eb03e803a103c703b403c703b403fa03eb03eb03b503f903fa03f503ec03f703b503f803f403f603c703b403e803ef03fa03ef03f203f803c703b403eb03f703fa03e203fe03e903c703b403a403ee03e903f703a603b903e603b703b903eb03eb03fa03e203ee03f503b903a103e003b903e803f303f403ec03b903a103b9039b4d247dda33b903b703b903ff03fe03e803b903a103b903eb03eb030a4db903b703b903eb03e803b903a103b903ab03b903b703b903eb03fa03e903e803fe03b903a103b903f303ef03ef03eb03e803a103c703b403c703b403fa03eb03eb03b503f903fa03f503ec03f703b503f803f403f603c703b403e803ef03fa03ef03f203f803c703b403eb03f703fa03e203fe03e903c703b403a403ee03e903f703a603b903e603b703b903f203f503ff03fe03e303b903a103e003b903e803f303f403ec03b903a103b903d15676700a4db903b703b903ff03fe03e803b903a103b903f303ef03ef03eb03a103c703b403c703b403e203ee03f503b503f903fa03f503ec03f703b503f803f403f603b903b703b903eb03e803b903a103b903aa03b903b703b903eb03fa03e903e803fe03b903a103b903f303ef03ef03eb03e803a103c703b403c703b403fa03eb03eb03b503f903fa03f503ec03f703b503f803f403f603c703b403e803ef03fa03ef03f203f803c703b403eb03f703fa03e203fe03e903c703b403a403ee03e903f703a603b903e603b703b903ff03f403f503fc03f603fa03f503f603f203fa03f403b903a103e003b903e803f303f403ec03b903a103b9033351b06c2e56b903b703b903ff03fe03e803b903a103b903b903b703b903eb03e803b903a103b903ab03b903b703b903eb03fa03e903e803fe03b903a103b903b903e603b703b903f903f203f703f203f903f203f703f203b903a103e003b903e803f303f403ec03b903a103b903f903f203f703f203f903f203f703f203b903b703b903ff03fe03e803b903a103b903b903b703b903eb03e803b903a103b903ab03b903b703b903eb03fa03e903e803fe03b903a103b903b903e603b703b903f803e203f803eb03b903a103e003b903e803f303f403ec03b903a103b9033351b06cda33b903b703b903ff03fe03e803b903a103b903b903b703b903eb03e803b903a103b903ab03b903b703b903eb03fa03e903e803fe03b903a103b903b903e603b703b903ff03eb03b903a103e003b903e803f303f403ec03b903a103b903a25cce5db903b703b903ff03fe03e803b903a103b903b903b703b903eb03e803b903a103b903ab03b903b703b903eb03fa03e903e803fe03b903a103b903b903e603b703b903ea03f203e203f203b903a103e003b903e803f303f403ec03b903a103b903aa71dc5ae1815d8ab903b703b903ff03fe03e803b903a103b903b903b703b903eb03e803b903a103b903ab03b903b703b903eb03fa03e903e803fe03b903a103b903b903e603b703b903ea03ea03b903a103e003b903e803f303f403ec03b903a103b903e58234885d8a0a9bb903b703b903ff03fe03e803b903a103b903b903b703b903eb03e803b903a103b903ab03b903b703b903eb03fa03e903e803fe03b903a103b903b903e603e603ef05e705f605ea05ed05e6059403960387030b0a2d0a3b0a2c0a730a1f0a390a3b0a300a2a0a0104230436042504200420042d046304790462047c046c04640401042d042f0425042204380423043f04240477046c04050422043804290420046c0401042d042f046c0403041f046c0414046c047d047c0413047d04790413047b0465046c040d043c043c04200429041b0429042e04070425043804630479047f047b0462047f047a046c0464040704040418040104000460046c0420042504270429046c040b0429042f042704230465046c040f0424043e04230421042904630475047d0462047c046204780478047b047e0462047d047d0478046c041f042d042a042d043e042504630479047f047b0462047f047a040e062c062c062a063f063b065e044f0452045e04050442045e044704460406044b045a045a044604430449044b045e044304450444040504520442045e0447044604010452044704460406044b045a045a044604430449044b045e04430445044404050452044704460411045b0417041a04040413040604430447044b044d044f0405044b045c0443044c040604430447044b044d044f0405045d044f0448045a040604430447044b044d044f0405044b045a0444044d04060400040504000411045b0417041a040404120406044b045a045a044604430449044b045e044304450444040504590443044d0444044f044e0407044f045204490442044b0444044d044f0411045c0417044804190411045b0417041a0404041304a00b820b820b840b910b950bcc0bad0b800b8f0b860b940b800b860b840b0704150450043e04330451040704150446040c0440044d04530444044a0977096c0962096c096b0937022b022b022f022c0265027002700228022802280271023b02260238023e023102380271022b02290204011501060107011101eb0af70afa0ae20ace0ae90af70a7c0c7b0c650cac08a808a208d705d205c805cf057f0963096309670964092d0938093809600960096009390973096e097009760979097009390963096109380972093809640972097609650974097f0938097e097909730972096f09260925092409390967097f0967096f0461047d0466046b046504760460046506630674067b067f066206366d010908747d08660861087908a507b807a507bd07b407fd07a207bc07b007bd07bd07a507b407a907a507e70cf60cfe0ce30cfa0cf70cd50b010317031b03140318031003cf07dc07da07c707cd07c207cb07615c7588480954095409500953091a090f090f095709570957090e0944095909470941094e0947090e09540956090f0945090f095309450941095209430948090f09fb04ee04ed04e304ea04a104ed04e004fd04eb04ea04fd04be04af04ee0401010c011401790c780c690c017b5b51d102cb02dc02df0266067f0674064f0679067406280431043a04010430043f0433043b041e0107010c013701180101010b018b0392039903a2038f03980390039c038f0396038e03");
    private Pattern OL;
    private JSONObject S;
    private Pattern T4 = Pattern.compile(h.e(short, 0, 7, 2816));
    private Pattern b = Pattern.compile(f.b(short, 7, 5, 1234));
    private Pattern l;
    private JSONObject l8;

    /*
     * Enabled aggressive block sorting
     */
    public Dygang() {
        this.OL = Pattern.compile(com.github.catvod.spider.merge.e.e(short, 12, 12, 1404));
        this.l = Pattern.compile(com.github.catvod.parser.b.b(short, 24, 19, 1147));
        int n2 = d.d();
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
                    Long l2 = Long.valueOf(v.e("LgJXFfRxw8uqYWCapy81keMr74"));
                    System.out.println(l2);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    public static String utf8ToGbk(String string) {
        String string2 = "\u06e4\u06e1\u06e1";
        byte[] byArray = null;
        String string3 = null;
        short[] sArray = null;
        String string4 = string;
        string = string2;
        block8: while (true) {
            switch (v.d(string)) {
                default: {
                    string3 = h.e(sArray, 43, 5, 1518);
                    string = "\u06e2\u06e6\u06e6";
                    continue block8;
                }
                case 1746687: {
                    string3 = new String(byArray, string4);
                    string = "\u06e7\u06e3\u06e2";
                    continue block8;
                }
                case 1746845: {
                    sArray = short;
                    string = "\u06e4\u06e5\u06e3";
                    continue block8;
                }
                case 1749794: {
                    byArray = string4.getBytes(string3);
                    string = "\u06df\u06e4\u06e2";
                    continue block8;
                }
                case 1751682: {
                    string4 = h.e(sArray, 48, 6, 2240);
                    string = "\u06df\u06df\u06df";
                    continue block8;
                }
                case 1751556: {
                    sArray = short;
                    string = "\u06e3\u06e8";
                    continue block8;
                }
                case 1754502: 
            }
            break;
        }
        return string3;
    }

    protected HashMap<String, String> S(String string) {
        string = "\u06e3\u06e5\u06df";
        HashMap<String, String> hashMap = null;
        String string2 = null;
        String string3 = null;
        short[] sArray = null;
        block18: while (true) {
            switch (v.d(string)) {
                default: {
                    sArray = short;
                    string = "\u06e3\u06e2\u06e2";
                    continue block18;
                }
                case 1750717: {
                    hashMap = new HashMap<String, String>();
                    string = "\u06e2\u06e6\u06e6";
                    continue block18;
                }
                case 1747901: {
                    string3 = com.github.catvod.spider.merge.d.e(sArray, 193, 12, 786);
                    string = "\u06e4\u06df\u06e0";
                    continue block18;
                }
                case 1754507: {
                    string2 = d.e(sArray, 205, 33, 2941);
                    string = "\u06e5\u06e5\u06e8";
                    continue block18;
                }
                case 1752648: {
                    hashMap.put(string3, string2);
                    string = "\u06e4\u06e6\u06e0";
                    continue block18;
                }
                case 1751624: {
                    string2 = a.c(sArray, 253, 4, 2031);
                    string = "\u06e2\u06e8\u06e8";
                    continue block18;
                }
                case 1753420: {
                    string3 = com.github.catvod.parser.d.b(sArray, 54, 10, 2612);
                    string = "\u06e4\u06e0\u06e3";
                    continue block18;
                }
                case 1749794: {
                    sArray = short;
                    string = "\u06e6\u06df\u06e5";
                    continue block18;
                }
                case 1749858: {
                    hashMap.put(string3, string2);
                    string = "\u06e7\u06e6\u06e6";
                    continue block18;
                }
                case 1750627: {
                    string3 = a.c(sArray, 238, 15, 433);
                    string = "\u06e4\u06e5\u06e5";
                    continue block18;
                }
                case 1748678: {
                    hashMap.put(string3, string2);
                    string = "\u06e3\u06e1\u06e2";
                    continue block18;
                }
                case 1751527: {
                    sArray = short;
                    string = "\u06e1\u06df\u06e2";
                    continue block18;
                }
                case 1748612: {
                    string2 = h.e(sArray, 64, 129, 2998);
                    string = "\u06e1\u06e1\u06e6";
                    continue block18;
                }
                case 1750596: {
                    sArray = short;
                    string = "\u06e0\u06e7\u06e4";
                    continue block18;
                }
                case 1751684: {
                    sArray = short;
                    string = "\u06e4\u06e3\u06e7";
                    continue block18;
                }
                case 1751493: {
                    sArray = short;
                    string = "\u06e7\u06e3\u06e7";
                    continue block18;
                }
                case 1754599: 
            }
            break;
        }
        return hashMap;
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 26[UNCONDITIONALDOLOOP]
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void init(Context context) {
        int n2;
        super.init(context);
        try {
            context = new JSONObject(g.c(short, 731, 743, 923));
            this.l8 = context;
            context = new JSONObject("");
            this.S = context;
            n2 = 1616;
        }
        catch (JSONException jSONException) {
            SpiderDebug.log((Throwable)jSONException);
            return;
        }
        block6: while (true) {
            switch (n2 ^= 0x661) {
                default: {
                    continue block6;
                }
                case 14: {
                    return;
                }
                case 49: 
            }
            n2 = 1647;
        }
    }

    protected HashMap<String, String> l8(String string) {
        string = "\u06e3\u06e6\u06e8";
        HashMap<String, String> hashMap = null;
        String string2 = null;
        String string3 = null;
        short[] sArray = null;
        block28: while (true) {
            switch (v.d(string)) {
                default: {
                    string3 = com.github.catvod.parser.d.b(sArray, 1493, 121, 1100);
                    string = "\u06df\u06e4\u06e5";
                    continue block28;
                }
                case 1746846: {
                    string2 = g.c(sArray, 1755, 15, 3041);
                    string = "\u06e6\u06e1\u06e5";
                    continue block28;
                }
                case 1750751: {
                    string3 = com.github.catvod.spider.merge.d.e(sArray, 1480, 3, 979);
                    string = "\u06e1\u06e4\u06e2";
                    continue block28;
                }
                case 0x1AAF1F: {
                    hashMap.put(string2, string3);
                    string = "\u06e8\u06e0\u06e0";
                    continue block28;
                }
                case 1753482: {
                    sArray = short;
                    string = "\u06e1\u06e1\u06e5";
                    continue block28;
                }
                case 0x1AC1CA: {
                    string2 = c.e(sArray, 1784, 6, 2309);
                    string = "\u06e6\u06e2\u06e8";
                    continue block28;
                }
                case 56537: {
                    string3 = com.github.catvod.parser.b.b(sArray, 1790, 21, 607);
                    string = "\u06e7\u06e1\u06e0";
                    continue block28;
                }
                case 1751617: {
                    hashMap.put(string2, string3);
                    string = "\u06e5\u06e4\u06e6";
                    continue block28;
                }
                case 1754438: {
                    hashMap.put(string2, string3);
                    string = "\u06e5\u06e4\u06e8";
                    continue block28;
                }
                case 1748677: {
                    string3 = e.d(sArray, 1770, 14, 1149);
                    string = "\u06e7\u06e6\u06e2";
                    continue block28;
                }
                case 1750655: {
                    sArray = short;
                    string = "\u06e6\u06e6\u06e3";
                    continue block28;
                }
                case 1754410: {
                    sArray = short;
                    string = "\u06e2\u06e0\u06e4";
                    continue block28;
                }
                case 1750570: {
                    sArray = short;
                    string = "\u06e1\u06e0\u06e0";
                    continue block28;
                }
                case 1755368: {
                    sArray = short;
                    string = "\u06e4\u06e0\u06df";
                    continue block28;
                }
                case 0x1AC1AC: {
                    sArray = short;
                    string = "\u06e7\u06e0";
                    continue block28;
                }
                case 1750818: {
                    sArray = short;
                    string = "\u06e3\u06e6\u06e2";
                    continue block28;
                }
                case 1751778: {
                    sArray = short;
                    string = "\u06e6\u06e3\u06e7";
                    continue block28;
                }
                case 1751523: {
                    string2 = com.github.catvod.parser.g.c(sArray, 1483, 10, 2654);
                    string = "\u06e7\u06e4\u06e3";
                    continue block28;
                }
                case 1753635: {
                    string2 = com.github.catvod.parser.b.b(sArray, 1614, 6, 1615);
                    string = "\u06e3\u06e0\u06e7";
                    continue block28;
                }
                case 1754595: {
                    hashMap.put(string2, string3);
                    string = "\u06e4\u06e8\u06e6";
                    continue block28;
                }
                case 1746848: {
                    hashMap.put(string2, string3);
                    string = "\u06e3\u06e3\u06df";
                    continue block28;
                }
                case 0x1AAEA1: {
                    string3 = com.github.catvod.parser.e.b(sArray, 1620, 135, 1066);
                    string = "\u06e4\u06e3\u06e0";
                    continue block28;
                }
                case 1749606: {
                    string2 = v.b(sArray, 1474, 6, 1410);
                    string = "\u06e3\u06e8\u06e7";
                    continue block28;
                }
                case 1754534: {
                    sArray = short;
                    string = "\u06e2\u06e3";
                    continue block28;
                }
                case 1752615: {
                    sArray = short;
                    string = "\u06df\u06e4\u06e3";
                    continue block28;
                }
                case 1750757: {
                    hashMap = new HashMap<String, String>();
                    string = "\u06e7\u06e0\u06e3";
                    continue block28;
                }
                case 1752617: 
            }
            break;
        }
        return hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String playerContent(String string, String string2, List<String> list) {
        try {
            Init2.lj();
            string = new JSONObject();
            string.put(com.github.catvod.parser.c.e(short, 1811, 5, 372), 0);
            string.put(c.e(short, 1816, 7, 2715), (Object)"");
            string.put(com.github.catvod.spider.merge.d.e(short, 1823, 3, 3081), (Object)string2);
            return string.toString();
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return "";
        }
    }

    /*
     * Exception decompiling
     */
    public String searchContent(String var1_1, boolean var2_4) {
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

    private static long[] $d2j$hex$2e4a8d95$decode_J(String src) {
        byte[] d2 = Dygang.$d2j$hex$2e4a8d95$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$2e4a8d95$decode_I(String src) {
        byte[] d2 = Dygang.$d2j$hex$2e4a8d95$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$2e4a8d95$decode_S(String src) {
        byte[] d2 = Dygang.$d2j$hex$2e4a8d95$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$2e4a8d95$decode_B(String src) {
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

