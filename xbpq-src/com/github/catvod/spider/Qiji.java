/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 *  com.github.catvod.crawler.Spider
 *  com.github.catvod.crawler.SpiderDebug
 *  okhttp3.Call
 *  okhttp3.Response
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.a;
import com.github.catvod.parser.b;
import com.github.catvod.spider.c;
import com.github.catvod.spider.f;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.d;
import com.github.catvod.spider.merge.e;
import com.github.catvod.spider.merge.g;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.merge.pv;
import com.github.catvod.spider.merge.xx;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.List;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Qiji
extends Spider {
    private static final short[] short = Qiji.$d2j$hex$72b4401a$decode_S("ef04eb04e804f404f404f004af04b304ae04b104b404ae04b904550b490b490b4d0b070b120b120b0c0b0c0b0e0b130b090b080b130b0f0b090b0e0b130b0f0b0e0b0e0b070b050b040b0a0b0a0b120b4b0b580b4f0b540b5b0b540b5e0b5c0b490b540b520b530b100b5e0b520b590b580b88048c04800486048404be048304800492048404d704d504e505e705f605f205e505ee05e705d905f005e705ea05f305e305260406041d0547054b054705a307e707fe07e207e3076c0c3a0a640a7c0a640a14065a064b06520615064b0653064b06e003e103e1031d021d021d02360527053e0508053f05320536053305320525055f035203450362035e03520353035b0354035a03e701b901a101a201a101a901b801b801a901b801a101e601a101a601ac01ad01b001e701a101a601a101bc019e01f901fa01fa012d0928093d092809c502c802c102d402ee02dd02d802c202c502e105e205ed05ed05e605f105dc05ef05ea05f005f70552055e055f055705580556057f0475047f0478046904610453047f0469046d047e046f04640453047a0469047e0465046a04750453047f0478046d04780479047f040c0902091e09b10aa00aa00afd0ab10aa00ab90afd0aa60ab50aa20ab90ab60aa90afd0aa30ab90ab70abe0a510c400c400c1d0c450c590c1d0c5d0c5f0c540c550cf607f307fd07f207ee071a091c090a091d0942090e0908090a0901091b096409750975092809700976096009770928096109600973096c096609600928096c0961097c026d026d0230027c026d02740230026b0278026f0274027b02640230026902740270027802020c150c180c010c110c890998099809c5099e098d099a099b09810987098609c5098b0987098c098d09ce04df04d904db0482500291030b5d0b450b460b450b4d0b5c0b5c0b4d0b5c0b450b020b450b420b480b490b540b030b580b550b5c0b490b6a0b450b400b580b490b5e0b7a0b430b480b600b450b5f0b580bd305dc05d105c305c305d304c004d704d304b307be07b107b8071b0607061a061c064f62ff6036073b07320727071d072b072607a40ab80abc0aaf0ace01df01d901db01dd01d101cb01d001ca0129032c0328032c03310306071d07060713071e0758085d0847084008050a5b0a430a400a430a4b0a5a0a5a0a4b0a5a0a430a040a430a440a4e0a4f0a520a050a5c0a450a4e0a6e0a4f0a5e0a4b0a430a460a180a4c0855085e08650853085e08a703a203b803bf0330023d02340221021b022d022002c102cc02c502d002ea02db02d402d802d0026d0562056f057d057d0506021f0214022f02020215021d02110202021b020302b804a104aa049104be04a704ad040d0114011f01240115011a0116011e012b0732073907020734073907370b320b280b2f0be706cb06ca06d006c106ca06d0068906f006dd06d406c106b309b709bb09bd09bf09f509b009aa09bf09bd09f602f302e602f302a8026d073407370725073307600762077a07ea0bf20bfa0bf40bfe0be90bcf0cb90c2c03ae0a880a9e0a890ad60aba0a9c0a9e0a950a8f0aa406bc06b406ba06bf06bc068c059005900594057d012f01340130013e0135016601c7079907df079207fa0cfd0ce30cd606cb068f06090657064f064c064f06470656065606470656064f0608064f064806420643065e06090650064906420676064706540655064306d708c608d508d408c208f808c608d708ce0848035303570359035203280939092a092b093d0961013f012e0161017c0161018f0499049d048e049f049404a30492049d0491049904a408b508b308b108970ca004ad04a404b1048b04bd04b004290993069d0681068f0697068a069c068b0643091d090509060905090d091c091c090d091c09050942091a0909091e0905090a09150943090f091e0909090d0918090909530907090909150951097a0576057d057c05240a2a0a360ad80986099e099d099e09960987098709960987099e09d9099e099909930992098f09d809f60bec0be20beb0be40bf10bf00bf70be00bda0bf30be40be90bf00be00bbe02a402aa02a302ac02b902b802bf02a8029202a302ac02a002a802880206024a0c140c0c0c0f0c0c0c040c150c150c040c150c0c0c4b0c0c0c0b0c010c000c1d0c4a0c160c000c040c170c060c0d0c290c0c0c160c110c9399de881e7b05fc5d08580842084508");
    private boolean A;
    private String HM = "";
    private String N = "";
    private String OL = "";
    private String S = com.github.catvod.parser.g.c(short, 0, 13, 1152);
    private String T4 = f.d(short, 13, 44, 2877);
    private String b = "";
    private JSONObject cD;
    private String l = "";
    private String l8 = "";
    private JSONArray n;
    private JSONObject s;
    private String tT = "";
    private JSONArray v;

    /*
     * Enabled aggressive block sorting
     */
    public Qiji() {
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
                    float f2 = Float.parseFloat(com.github.catvod.spider.merge.f.c("UOIuzKZr9iPqbjDqZEIbl1jgHOKHd"));
                    System.out.println(f2);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String OL(String string) {
        xx.ut ut2 = new xx.ut(this){
            final Qiji S;
            {
                this.S = qiji;
                int n2 = com.github.catvod.spider.merge.f.e();
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
                            float f2 = Float.parseFloat(com.github.catvod.parser.c.d("isWBugNUFl7spzSENLR6wAzzoZZA"));
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
            @Override
            public void onFailure(Call object, Exception exception) {
                int n2 = a.b();
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
                            Float f2 = Float.valueOf(com.github.catvod.parser.c.d("QX2eBR"));
                            System.out.println(f2);
                            return;
                        }
                        case 239: 
                    }
                    break;
                }
            }

            @Override
            public String onResponse(String string) {
                return string;
            }
        };
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.github.catvod.parser.b.b(short, 57, 12, 1249), (Object)string);
            Yy.N(Yy.T4(), this.T4, jSONObject.toString(), this.tT(this.S), ut2);
            string = new JSONObject((String)ut2.getResult());
            return string.optString(com.github.catvod.parser.c.e(short, 69, 13, 1414));
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * Exception decompiling
     */
    private void b() {
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
    private void l() {
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
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private HashMap<String, String> tT(String string) {
        HashMap<String, String> hashMap;
        block16: {
            String string2 = d.e(short, 215, 3, 2407);
            String string3 = g.c(short, 218, 19, 2768);
            hashMap = new HashMap<String, String>();
            String string4 = String.valueOf(System.currentTimeMillis() / 1000L);
            hashMap.put(com.github.catvod.parser.b.b(short, 237, 11, 3120), com.github.catvod.parser.d.b(short, 248, 5, 1946));
            hashMap.put(f.d(short, 253, 10, 2415), string);
            hashMap.put(d.e(short, 263, 18, 2309), "");
            hashMap.put(com.github.catvod.parser.b.b(short, 281, 19, 541), string4);
            hashMap.put(string3, pv.cD(string4, this.b, this.OL));
            boolean bl = this.s.optString(string2).isEmpty();
            int n2 = 1616;
            block13: while (true) {
                switch (n2 ^= 0x661) {
                    default: {
                        continue block13;
                    }
                    case 49: {
                        if (!bl) {
                            n2 = 1709;
                            continue block13;
                        }
                    }
                    case 14: {
                        n2 = 1678;
                        continue block13;
                    }
                    case 204: {
                        try {
                            hashMap.put(this.s.optString(string2), this.s.optString(com.github.catvod.parser.d.b(short, 300, 5, 3188)));
                            n2 = 1740;
                            break block13;
                        }
                        catch (Exception exception) {
                            hashMap.put(string3, "");
                        }
                    }
                    break block16;
                    case 239: {
                        break block16;
                    }
                }
                break;
            }
            block14: while (true) {
                switch (n2 ^= 0x6DD) {
                    default: {
                        continue block14;
                    }
                    case 17: {
                        n2 = 1771;
                        continue block14;
                    }
                    case 54: 
                }
                break;
            }
        }
        string = this.N;
        hashMap.put(e.e(short, 305, 16, 2536), string);
        return hashMap;
    }

    /*
     * Exception decompiling
     */
    public String categoryContent(String var1_1, String var2_3, boolean var3_4, HashMap<String, String> var4_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CASE]], but top level block is 1[TRYBLOCK]
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
    public String homeContent(boolean var1_1) {
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
     * Enabled aggressive block sorting
     */
    public void init(Context context, String string) {
        super.init(context);
        this.HM = string;
        int n2 = com.github.catvod.parser.b.d();
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
                    double d2 = Double.parseDouble(c.d("oXNZCz"));
                    System.out.println(d2);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String parseImageToBase64(String var1_1) {
        try {
            var4_3 = new xx.aA(this){
                final Qiji S;
                {
                    this.S = object;
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
                                Double d2 = Double.decode((String)f.e("e2cOuzHtt4EqJPlgK088"));
                                System.out.println(d2);
                                return;
                            }
                            case 239: 
                        }
                        break;
                    }
                }

                @Override
                protected void onFailure(Call call, Exception exception) {
                    SpiderDebug.log((Throwable)exception);
                }

                @Override
                protected String onResponse(Response response) {
                    return null;
                }
            };
            Yy.b(Yy.T4(), (String)var1_1, null, this.tT((String)var1_1), var4_3);
            var1_1 = var4_3.getResult();
            var2_4 = 1616;
        }
        catch (Exception var1_2) {
            SpiderDebug.log((Throwable)var1_2);
            return "";
        }
        block28: while (true) {
            switch (var2_4 ^= 1633) {
                default: {
                    continue block28;
                }
                case 49: {
                    if (var1_1 != null) {
                        var2_4 = 1709;
                        continue block28;
                    }
                }
                case 14: {
                    var2_4 = 1678;
                    continue block28;
                }
                case 204: {
                    var3_5 = ((Response)var4_3.getResult()).code();
                    var2_4 = 1740;
                    break block28;
                }
                case 239: {
                    return "";
                }
            }
            break;
        }
        block29: while (true) {
            switch (var2_4 ^= 1757) {
                default: {
                    continue block29;
                }
                case 17: {
                    if (var3_5 == 200) {
                        var2_4 = 1833;
                        continue block29;
                    }
                }
                case 54: {
                    var2_4 = 1802;
                    continue block29;
                }
                case 500: {
                    var1_1 = ((Response)var4_3.getResult()).body().byteStream();
                    var5_6 = new ByteArrayOutputStream();
                    var6_7 = new byte[4096];
lbl40:
                    // 2 sources

                    while (true) {
                        var3_5 = var1_1.read(var6_7, 0, 4096);
                        var2_4 = 1864;
                        break block29;
                        break;
                    }
                }
                case 471: {
                    return "";
                }
            }
            break;
        }
        block31: while (true) {
            switch (var2_4 ^= 1881) {
                default: {
                    continue block31;
                }
                case 17: {
                    if (var3_5 != -1) {
                        var2_4 = 48736;
                        continue block31;
                    }
                }
                case 47483: {
                    var2_4 = 48705;
                    continue block31;
                }
                case 47417: {
                    var5_6.write(var6_7, 0, var3_5);
                    var2_4 = 48767;
                }
                case 47384: {
                    var5_6.flush();
                    var6_7 = var5_6.toByteArray();
                    var1_1.close();
                    var5_6.close();
                    var1_1 = Base64.encodeToString((byte[])var6_7, (int)2);
                    var5_6 = ((Response)var4_3.getResult()).header(h.e(Qiji.short, 510, 12, 1700), com.github.catvod.parser.b.b(Qiji.short, 522, 10, 2522));
                    var4_3 = new StringBuilder();
                    var4_3.append(com.github.catvod.parser.d.b(Qiji.short, 532, 5, 658));
                    var4_3.append((String)var5_6);
                    var4_3.append(com.github.catvod.spider.merge.f.b(Qiji.short, 537, 8, 1878));
                    var4_3.append((String)var1_1);
                    return var4_3.toString();
                }
            }
            break;
        }
        block32: while (true) {
            switch (var2_4 ^= 48784) {
                case 14: {
                    ** continue;
                }
                default: {
                    continue block32;
                }
                case 239: 
            }
            var2_4 = 48798;
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

    private static long[] $d2j$hex$72b4401a$decode_J(String src) {
        byte[] d2 = Qiji.$d2j$hex$72b4401a$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$72b4401a$decode_I(String src) {
        byte[] d2 = Qiji.$d2j$hex$72b4401a$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$72b4401a$decode_S(String src) {
        byte[] d2 = Qiji.$d2j$hex$72b4401a$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$72b4401a$decode_B(String src) {
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

