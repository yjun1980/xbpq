/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.b;
import com.github.catvod.parser.c;
import com.github.catvod.spider.d;
import com.github.catvod.spider.e;
import com.github.catvod.spider.f;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.merge.pv;
import com.github.catvod.spider.merge.xv;
import com.github.catvod.spider.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AppV6
extends Spider {
    private static final short[] short = AppV6.$d2j$hex$cfbaf9df$decode_S("f209f309e109cd09b50900041b0419041404900581059a05bd0594059f0596058505990595029a0223052d054c035b034d0374036d0366035d03700367036f03630370036903710386079f079407af078007990793079c0a990a9d0a990a840ad805c105ca05f105c005cf05c305cb05780c690c6f0c6d0c5e0947094c09770941094c09d40bc50bc30bc10bc70bcb0bd10bca0bd00bc804d304c804dd04d00435026c022c0235026c0273027e027f02750225026a027d022702c9039b0386038b03d203fd0ab80ab70aba0aa80aa80ae60afd0aba0aa90abe0aba0ae60afd0ab70aba0ab50abc0ae60afd0aa20abe0aba0aa90ae60afd0ab40aa90abf0abe0aa90ae60aaf0ab20ab60abe0afd0aaf0ab40ab00abe0ab50ae60afd0ab80aa80aa90abd0ae60a2d058f018a019f018a01bb0bbe0ba40ba30b3504530853085308a307ba07b1078a07b607ba07bb07a107b007bb07a107f002e902e202d902e202ef02f402e302e502f202e902f402700669066206590667066506720669067406480a510a5a0a610a4c0a5b0a530a5f0a4c0a550a4d0a8d0294029f02a4029a0289029e029a0270026902620259027f02630267027402f20beb0be00bdb0bf40bed0be70bdb04c204c904f204c304cc04c004c80400071907120729071f071207d3028a02ca02d3028a029502980299029302a3029802990288029d0295029002c30295029802c1026b0b2e0b260b700b9506c706dc06d806d606dd068e069506c306d806da06d7068e06c306d806da06d7069506d006c006c106d5068e0622085d0b440b4f0b740b420b450b4d0b440b1608130806081308160a0f0a040a3f0a150a120a0c0a3f0a170a090a140a080a3f0a100a0c0a010a190a050a120aff01ee01fd01fc01ea01d001fc01ea01ec01fd01ea01fb01d50bd20bcc0bc105d905d105df05da05d905d807c907da07db07cd07f707c907d807c10781028e0282028a029308f60791079d0796079707ce0cd70cdc0ce70cc80cd40cd90cc10ce70cde0cca0cd70cd50cfa01e301e801d301fc01e001ed01f501d301f901fe01e001140111010b010c01050818081c081408d50ad40ac60aea0a920a6d097c0967094009690962096b0978096409200937092b092e09260916092b092f09270960096109730918090d09730c7e0c770c620c580c6e0c630cbe05b305ba05af059505a405ab05a705af0558010101410158011901160101014801030118011c01120119014a01510114010401050111014a0159046b0b6e0b7b0b6e0b3a07350738072a072a072109380933090809250932093a09360925093c0924092f0a360a3d0a060a290a300a3a0a270a3e0a350a0e0a3f0a300a3c0a340aea0bf30bf80bc30bf50bf80b630c3a0c7a0c630c250c220c280c290c340c130c3a0c250c280c290c230c730c380c230c270c290c220c710c6a0c2f0c3f0c3e0c2a0c710c930aef01ea01ff01ea01f10beb0bee0bf40bf30b6c0a690a730a740aca05ea05060407041504390441043c072d0736071107380733073a0729073507a80bbf0ba30ba60bae0be70bbe0ba30ba70baf0b2803270324082a084f08540856085b08c501d201c4011a021a021a02a401d2015f0c470c4f0c410c440c470c260b370b240b250b330b09040e041004a301e001be01f801b5018a07c907d4079007360bac07a50aa70a58060106410658060406120614060506120603062806070616060506040612062806160607061e062806020605061b06480604062806020605061b064a067c012e01350131013f01340167017c013901290128013c016701b404b104a404b104c80ad10ada0ae10acc0adb0ad30adf0acc0ad50acd0aa60abf0ab40a8f0aa00ab90ab30a4105580553056805590556055a055205980a810a8a0ab10a870a8a0a40021902590240021c020a020e021d020c02070250021f02080252025e0249021b0206020b0252025f0249021b020a0217021b025202bd0bef0bf40bf00bfe0bf50ba60bbd0bf80be80be90bfd0ba60b430a29042c0439042c04cc09c909d309d4093408160835082b080b0806081f0828080b08090803083b08350809081f0861083308630860082608080809081f082b0835086308680828080b0819081f086408330806081b082708330810086c086c08be62a064ca5ec873ff5eeb8a");
    private String HM;
    private JSONObject N;
    private String OL;
    private String S = "";
    private String T4 = "";
    private String b;
    private String l;
    private String l8 = "";
    private String tT;

    /*
     * Enabled aggressive block sorting
     */
    public AppV6() {
        int n2 = com.github.catvod.parser.f.b();
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
                    float f2 = Float.parseFloat(com.github.catvod.spider.merge.e.b("xuDFVVQVt9pJsJXqBOEnmMarhNO"));
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
    private HashMap<String, String> l8(String hashMap) {
        hashMap = new HashMap();
        try {
            Iterator iterator = this.N.keys();
            block59: while (true) {
                String string;
                boolean bl = iterator.hasNext();
                int n2 = 1616;
                block60: while (true) {
                    switch (n2 ^= 0x661) {
                        default: {
                            continue block60;
                        }
                        case 49: {
                            if (bl) {
                                n2 = 1709;
                                continue block60;
                            }
                        }
                        case 14: {
                            n2 = 1678;
                            continue block60;
                        }
                        case 204: {
                            string = (String)iterator.next();
                            bl = string.contains(com.github.catvod.parser.f.c(short, 0, 5, 2432));
                            n2 = 1740;
                            break block60;
                        }
                        case 239: {
                            return hashMap;
                        }
                    }
                    break;
                }
                block61: while (true) {
                    switch (n2 ^= 0x6DD) {
                        case 471: {
                            continue block59;
                        }
                        default: {
                            continue block61;
                        }
                        case 17: {
                            if (!bl) {
                                n2 = 1833;
                                continue block61;
                            }
                        }
                        case 54: {
                            n2 = 1802;
                            continue block61;
                        }
                        case 500: 
                    }
                    break;
                }
                bl = string.contains(com.github.catvod.spider.merge.d.e(short, 5, 4, 1136));
                n2 = 1864;
                block62: while (true) {
                    switch (n2 ^= 0x759) {
                        case 47384: {
                            continue block59;
                        }
                        default: {
                            continue block62;
                        }
                        case 17: {
                            if (!bl) {
                                n2 = 48736;
                                continue block62;
                            }
                        }
                        case 47483: {
                            n2 = 48705;
                            continue block62;
                        }
                        case 47417: 
                    }
                    break;
                }
                bl = string.contains(h.e(short, 9, 9, 1521));
                n2 = 48767;
                block63: while (true) {
                    switch (n2 ^= 0xBE90) {
                        case 45: {
                            continue block59;
                        }
                        default: {
                            continue block63;
                        }
                        case 239: {
                            if (!bl) {
                                n2 = 48860;
                                continue block63;
                            }
                        }
                        case 14: {
                            n2 = 48829;
                            continue block63;
                        }
                        case 76: 
                    }
                    break;
                }
                bl = string.contains(com.github.catvod.parser.d.b(short, 18, 2, 753));
                n2 = 48891;
                block64: while (true) {
                    switch (n2 ^= 0xBF0C) {
                        case 53: {
                            continue block59;
                        }
                        default: {
                            continue block64;
                        }
                        case 503: {
                            if (!bl) {
                                n2 = 49635;
                                continue block64;
                            }
                        }
                        case 22: {
                            n2 = 48953;
                            continue block64;
                        }
                        case 32495: 
                    }
                    break;
                }
                bl = string.contains(v.b(short, 20, 2, 1350));
                n2 = 49666;
                block65: while (true) {
                    switch (n2 ^= 0xC213) {
                        case 83: {
                            continue block59;
                        }
                        default: {
                            continue block65;
                        }
                        case 17: {
                            if (!bl) {
                                n2 = 49759;
                                continue block65;
                            }
                        }
                        case 50: {
                            n2 = 49728;
                            continue block65;
                        }
                        case 76: 
                    }
                    break;
                }
                bl = string.contains(com.github.catvod.spider.merge.e.e(short, 22, 3, 830));
                n2 = 49790;
                block66: while (true) {
                    switch (n2 ^= 0xC28F) {
                        default: {
                            continue block66;
                        }
                        case 241: {
                            if (bl) {
                                n2 = 49883;
                                continue block66;
                            }
                        }
                        case 18: {
                            n2 = 49852;
                            continue block66;
                        }
                        case 84: {
                            n2 = 49914;
                            block67: while (true) {
                                switch (n2 ^= 0xC30B) {
                                    case 1711: {
                                        continue block59;
                                    }
                                    default: {
                                        continue block67;
                                    }
                                    case 497: 
                                }
                                n2 = 50596;
                            }
                        }
                        case 51: 
                    }
                    break;
                }
                hashMap.put(string, this.N.getString(string));
                n2 = 50689;
                block68: while (true) {
                    switch (n2 ^= 0xC612) {
                        case 50: {
                            continue block59;
                        }
                        default: {
                            continue block68;
                        }
                        case 19: 
                    }
                    n2 = 50720;
                }
                break;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [11[CASE]], but top level block is 17[SWITCH]
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [10 : 1657->1761)] java.lang.Throwable
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

    public String getCk(String string) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.github.catvod.spider.merge.d.e(short, 388, 4, 2161), (Object)string);
            jSONObject.put(e.d(short, 392, 5, 2727), (Object)this.b);
            jSONObject.put(h.e(short, 397, 9, 2316), (Object)this.OL);
            jSONObject.put(com.github.catvod.parser.b.b(short, 406, 9, 2370), (Object)this.l);
            System.out.println(jSONObject.toString());
            string = URLEncoder.encode(xv.tT(String.valueOf(jSONObject), this.T4));
            return string;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (JSONException jSONException) {
            throw new RuntimeException(jSONException);
        }
    }

    public String getCsrf(String string) {
        try {
            string = URLEncoder.encode(xv.l(string, this.T4), com.github.catvod.parser.f.c(short, 415, 5, 2357));
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
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
     * Exception decompiling
     */
    public String homeVideoContent() {
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

    public void init(Context context, String stringArray) {
        super.init(context, (String)stringArray);
        stringArray = pv.l((String)stringArray).split(com.github.catvod.parser.b.b(short, 540, 2, 1430));
        this.l8 = stringArray[0];
        try {
            context = new JSONObject(stringArray[1]);
            this.N = context;
            this.b = context.getString(d.e(short, 542, 5, 1140));
            this.OL = this.N.getString(f.d(short, 547, 9, 1885));
            this.l = this.N.getString(c.e(short, 556, 10, 3018));
            this.S = this.N.getString(h.e(short, 566, 2, 844));
            this.T4 = this.N.getString(d.e(short, 568, 2, 2113));
            this.tT = this.N.getString(v.b(short, 570, 4, 2111));
            System.out.println(this.T4);
            this.HM = this.N.getString(com.github.catvod.spider.merge.e.e(short, 574, 3, 439));
            return;
        }
        catch (JSONException jSONException) {
            throw new RuntimeException(jSONException);
        }
    }

    /*
     * Exception decompiling
     */
    public String playerContent(String var1_1, String var2_3, List<String> var3_4) {
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
    public String searchContent(String var1_1, boolean var2_3) {
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

    public String splitData(String string) {
        Object object;
        try {
            object = string.split(h.e(short, 738, 40, 2129));
        }
        catch (Exception exception) {
            throw new RuntimeException(com.github.catvod.spider.merge.d.e(short, 778, 6, 1998), exception);
        }
        string = object[0];
        CharSequence charSequence = object[1];
        object = new String(Base64.decode((String)charSequence, (int)0));
        int n2 = Integer.parseInt((String)object);
        object = string.substring(0, n2);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(this.HM);
        ((StringBuilder)charSequence).append((String)object);
        object = Yy.v(((StringBuilder)charSequence).toString(), this.l8(""));
        string = string.substring(n2);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(string);
        string = ((StringBuilder)charSequence).toString();
        return string;
    }

    private static long[] $d2j$hex$cfbaf9df$decode_J(String src) {
        byte[] d2 = AppV6.$d2j$hex$cfbaf9df$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$cfbaf9df$decode_I(String src) {
        byte[] d2 = AppV6.$d2j$hex$cfbaf9df$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$cfbaf9df$decode_S(String src) {
        byte[] d2 = AppV6.$d2j$hex$cfbaf9df$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$cfbaf9df$decode_B(String src) {
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

