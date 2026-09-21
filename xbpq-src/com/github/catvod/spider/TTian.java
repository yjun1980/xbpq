/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.c;
import com.github.catvod.parser.d;
import com.github.catvod.spider.Init2;
import com.github.catvod.spider.e;
import com.github.catvod.spider.merge.f;
import com.github.catvod.spider.merge.g;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.merge.pv;
import com.github.catvod.spider.v;
import com.github.catvod.spider.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TTian
extends Spider {
    private static final short[] short = TTian.$d2j$hex$8c2efa2d$decode_S("560706071107510703070f07050753071207130759075407180705070807080753070b07520753071107020718071107120702070e0702075507160757070207560706075407120711070d07d30cf50ce30cf40cab0cc70ce10ce30ce80cf20c9a019e019d01810181018501da01c101db01cc01db01c601d605e105e205e105f605e105f605650c220c3b0c300c0b0c260c310c390c350c260c3f0c270c14030d0306033d030c0303030f030703090a100a1b0a200a160a1b0a150710070a070d078d0194019f01a4018b0192019801bb09e209a709bb09fc09fb09f909f109bb09e009ed09e409f109cb09e709f109f509e609f709fc09ea02ef02fa02ef02a908b008bb088008af08b608bc088008ab08b708aa08b208bd08a503b403b203b003620873087508770871087d0867087c0866080a0a0f0a0b0a0f0a120a45085e08450850085d08fb07fb07fb07d604cf04c404ff04c304cf04ce04d404c504ce04d4043a01230128011301280125013e0129012f01380123013e016e0577057c05470579057b056c0577056a05d70cce0cc50cfe0cd30cc40ccc0cc00cd30cca0cd20ca901b001bb018001be01ad01ba01be012b06320639060206240638063c062f061009090902093909080907090b09030974096d0966095d096b096609030512050105000516052c05060501051f050005e205fb05f005cb05e405fd05f705fa06a306e606fa06bd06ba06b806b006fa06a306ba06b1068a06b106b006a106b406bc06b906a606ad01a801bd01a801c70cde0cd50cee0cc10cd80cd20cee0cc50cd90cc40cdc0cd30c16081b08120807083d080c0803080f080708dc0ac50ace0af50ac90ac60acb0ad90ad90a016ec0668656e95e0d5428545c8869fa928e9a576f4b365ab256f29f64fa64fa52094b0940097b095409480945095d097b0948094d0957095009ad0ab00aad0ab50abc0a4e0a4f0a4305b30bb80bb20b69096e0970096f09080407040b0403040007970b900b8e0b610c790c710c7f0c7a0c790ccb068d0294029f02a4028b0297029a028202a4029d02890294029602f002e902e202d902f602ea02e702ff02d902f302f402ea02b40ab10aab0aac0aab04bb04b604ad04ad03ad03e403e903ef03ad03e203ef03f503ee03e403e103f203f903ad0307061f0606061e0603061a060b0618061e0645060c0605061806070647060e060b061e060b0651064a06ee02ee024d024a0203022f022e02340225022e0234026d0204022902330230022f0233022902340229022f022e027a02600226022f0232022d026d0224022102340221027b0260022e0221022d0225027d02620262024d024a024d024a024d024a026d026d0283098409cd09e109e009fa09eb09e009fa09a309ca09e709fd09fe09e109fd09e709fa09e709e109e009b409ae09e809e109fc09e309a309ea09ef09fa09ef09b509ae09e009ef09e309eb09b309ac09fd09e709e909e009ac0983098409830984091e0519053e053e05b801bf01f601da01db01c101d001db01c1019801f101dc01c601c501da01c601dc01c101dc01da01db018f019501d301da01c701d8019801d101d401c101d4018e019501db01d401d801d00188019701c101dc01d801d001c601c101d401d801c5019701b801bf01b801bf018c048c04ac04ab04ac04ab04c905ef05f905ee05b105dd05fb05f905f205e805a70ba30ba00bbc0bbc0bb80be50ba70ba30baf0ba70be70ba20bad0ba90bbb0ba70ba60ba40bb20bb10b09081108080810080d0814080508160810084b0802080b0816080908490800080508100805085f08440806080b0811080a080008050816081d0859081c0a100a110a0b0a1a0a110a0b0a520a0b0a060a0f0a1a0af70cf70cf70c2281516ff051e485ce07de07d307c8073d0a250a3c0a240a390a200a310a220a240a7f0a360a3f0a220a3d0a7d0a340a310a240a310a6b0a700a320a3f0a250a3e0a340a310a220a290a6d0a640a320a680a310a600a320a640a670a7d0a680a640a320a330a7d0a640a320a660a350a7d0a320a620a650a620a7d0a340a320a620a650a320a640a320a690a310a320a340a620af70bf70bee0bb80be20bbb0bea0bb80bee0bed0bf70be20bee0bb80bb90bf70bee0bb80bec0bbf0bf70bb80be80bef0be80bf70bbe0bb80be80bef0bb80bee0bb80be30bbb0bb80bbe0be80bd70bd00b990bb50bb40bae0bbf0bb40bae0bf70b9e0bb30ba90baa0bb50ba90bb30bae0bb30bb50bb40be00bfa0bbc0bb50ba80bb70bf70bbe0bbb0bae0bbb0be10bfa0bb40bbb0bb70bbf0be70bf80ba90bb30bbd0bb40bf80bd70bd00bd70bd00bc90bce0be90be90bf00ba60bfc0ba50bf40ba60bf00bf30be90bfc0bf00ba60ba70be90bf00ba60bf20ba10be90ba60bf60bf10bf60be90ba00ba60bf60bf10ba60bf00ba60bfd0ba50ba60ba00bf60bc90bce0b870bab0baa0bb00ba10baa0bb00be90b800bad0bb70bb40bab0bb70bad0bb00bad0bab0baa0bfe0be40ba20bab0bb60ba90be90ba00ba50bb00ba50bff0be40baa0ba50ba90ba10bf90be60bb00bad0ba90ba10bb70bb00ba50ba90bb40be60bc90bce0bc90bce0b5e0859087e087e08670831086b08320863083108670864087e086b086708310830087e0867083108650836087e0831086108660861087e0837083108610866083108670831086a0832083108370861085e08590810083c083d08270836083d0827087e0817083a08200823083c0820083a0827083a083c083d086908730835083c0821083e087e083708320827083208680873083d0832083e0836086e0871083f083a083e083a08270871085e0859085e085908620861085e0859087e087e08670831086b08320863083108670864087e086b086708310830087e0867083108650836087e0831086108660861087e0837083108610866083108670831086a0832083108370861085e08590810083c083d08270836083d0827087e0817083a08200823083c0820083a0827083a083c083d086908730835083c0821083e087e083708320827083208680873083d0832083e0836086e08710827082a08230836080c083a08370871085e0859085e085908ff09f809df09df09c6099009ca099309c2099009c609c509df09ca09c60990099109df09c6099009c4099709df099009c009c709c009df0996099009c009c7099009c6099009cb09930990099609c009ff09f809b1099d099c09860997099c098609df09b6099b09810982099d0981099b0986099b099d099c09c809d20994099d0980099f09df099609930986099309c909d2099c0993099f099709cf09d0098209930995099709d009ff09f809ff09f80944034303640364037d032b037103280379032b037d037e03640371037d032b032a0364037d032b037f032c0364032b037b037c037b0364032d032b037b037c032b037d032b03700328032b032d037b0364036403440343034403430368064e0658064f0610067c065a065806530649067402700273026f026f026b023602740270027c027402340271027e027a0268027402750277026102620262036e036f03750364036f0375032c0375037803710364038104810481044e8e3d609c5e888a720262026f0274021f0a1f0a560a5b0a5d0a1f0a500a5d0a470a5c0a560a530a400a4b0a1f0a3c0c240c3d0c250c380c210c300c230c250c7e0c370c3e0c230c3c0c7c0c350c300c250c300c6a0c710c32093209920a950adc0af00af10aeb0afa0af10aeb0ab20adb0af60aec0aef0af00aec0af60aeb0af60af00af10aa50abf0af90af00aed0af20ab20afb0afe0aeb0afe0aa40abf0af10afe0af20afa0aa20abd0ae90af00afb0ac00af60afb0abd0a920a950a920a950af408f308d408d408ae05a905e005cc05cd05d705c605cd05d7058e05e705ca05d005d305cc05d005ca05d705ca05cc05cd0599058305c505cc05d105ce058e05c705c205d705c20598058305cd05c205ce05c6059e058105d005ca05c405cd058105ae05a905ae05a9056b016c0125010901080112010301080112014b0122010f0115011601090115010f0112010f01090108015c0146010001090114010b014b0102010701120107015d014601080107010b0103015b01440112010f010b0103011501120107010b01160144016b016c016b016c01b70cb70c970c900c970c900cce08e808fe08e908b608da08fc08fe08f508ef087d0379037a036603660362033f037d03790375037d033d0378037703730361037d037c037e0368036b03fa0be20bfb0be30bfe0be70bf60be50be30bb80bf10bf80be50bfa0bba0bf30bf60be30bf60bac0bb70bf50bf80be20bf90bf30bf60be50bee0baa0bb901b501b401ae01bf01b401ae01f701ae01a301aa01bf01df08df08df089f8dec634d5d5989b60ca60cab0cb00c670c670c2e0c230c250c670c280c250c3f0c240c2e0c2b0c380c330c670c210939092009380925093c092d093e09380963092a0923093e092109610928092d0938092d0977096c0989048904d108d6089f08b308b208a808b908b208a808f1089808b508af08ac08b308af08b508a808b508b308b208e608fc08ba08b308ae08b108f108b808bd08a808bd08e708fc08b208bd08b108b908e108fe08b708b908a508ab08b308ae08b808fe08d108d608d108d6083e0839081e081e08fe09f909b0099c099d09870996099d098709de09b7099a09800983099c0980099a0987099a099c099d09c909d30995099c0981099e09de099709920987099209c809d3099d0992099e099609ce09d10980099a0994099d09d109fe09f909fe09f909db03dc039503b903b803a203b303b803a203fb039203bf03a503a603b903a503bf03a203bf03b903b803ec03f603b003b903a403bb03fb03b203b703a203b703ed03f603b803b703bb03b303eb03f403a203bf03bb03b303a503a203b703bb03a603f403db03dc03db03dc0302080208220825082208250849026f0279026e0231025d027b02790272026802d606d206d106cd06cd06c9069406d606d206de06d6069606d306dc06d806ca06d606d706d506c306c00657084f0856084e0853084a085b0848084e0815085c0855084808570817085e085b084e085b0801081a08580855084f0854085e085b084808430807089505990598058205930598058205db0582058f0586059305bc05bc05bc056182126cb352a786b50bb80bb10ba40b9e0baf0ba00bac0ba40bdf05d205db05ce05f405c205cf05090a500a150a090a520a5f0a560a430a090a520a490a560a790a520a5f0a560a430aa702a202b702a202470b420b580b5f0b890986098b09990999096e03610364037c036d037a037b03dc0bc50bce0bf50bd80bcf0bc70bcb0bd80bc10bd90b810198019301a801990196019a0192013e0127012c01170121012c0115050c0507053c0513050a05000574022d02680274022f0222022b023e0274022f02310204022d0234023f020b020e021b020e022e032c0324030a081308180823080c0815081f08230808081408090811081e085e035b034103460362087308600861087708f709f009ee09e404f404f904e204150b400b5a0b540b5d0b0e0b4c051e05030507050f0519051e050b0507051a055705f7026e0c6a0c6e0cab0bb90b598e2a60cf07c807d6078f078007ab06b706b706b306b006f906ec06ec06ae06a206b706a606b106aa06a206af06ee06b306b106ac06ee06b506aa06a706a606ac06ee06f206f106f606f606fa06f406f606f406f106f006ed06a006ac06b006ed06a206b306ee06a106a606aa06a906aa06ad06a406ed06ae06ba06b206a006af06ac06b606a706ed06a006ac06ae06470504055a051c055105440c5c0c540c5a0c5f0c5c0c7b82086ced0bea0bf40ba20b10051b0511051604330438043204b30a3b0b3f0b3b0be303e703e303514dcf03d603dd03e603cb03dc03d403d803cb03d203ca030b0512051905220513051c051005180565067c0677064c067a067706540351034b034c03e70cfe0cf50cce0ce10cf80cf20c6b09320977096b092c092b09290921096b09370921092509360927092c090d0608061d060806e501fc01f701cc01e301fa01f001cc01e701fb01e601fe01f101");
    private String S;
    private String T4;
    private String l8 = "";

    /*
     * Enabled aggressive block sorting
     */
    public TTian() {
        Object object = com.github.catvod.spider.merge.e.e(short, 0, 38, 1889);
        this.S = object;
        this.T4 = object;
        int n2 = w.d();
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
                    object = Integer.decode(g.d("z349zsZGHwKz1ylb7J3GT6j0uuLey"));
                    System.out.println(object);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String getRandomNickname(int n2) {
        void var4_3;
        Random random = new Random();
        String string = "";
        int n3 = 0;
        block10: while (true) {
            int n4 = 1616;
            block11: while (true) {
                switch (n4 ^= 0x661) {
                    default: {
                        continue block11;
                    }
                    case 49: {
                        if (n3 < n2) {
                            n4 = 1709;
                            continue block11;
                        }
                    }
                    case 14: {
                        n4 = 1678;
                        continue block11;
                    }
                    case 204: {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)var4_3);
                        stringBuilder.append(String.valueOf(random.nextInt(10)));
                        String string2 = stringBuilder.toString();
                        int n5 = n3 + 1;
                        n4 = 1740;
                        block12: while (true) {
                            String string3 = string2;
                            n3 = n5;
                            switch (n4 ^= 0x6DD) {
                                case 54: {
                                    continue block10;
                                }
                                default: {
                                    continue block12;
                                }
                                case 17: 
                            }
                            n4 = 1771;
                        }
                    }
                    case 239: 
                }
                break;
            }
            break;
        }
        return var4_3;
    }

    private HashMap<String, String> l8(String string) {
        string = "\u06df\u06e4\u06e7";
        HashMap<String, String> hashMap = null;
        String string2 = null;
        String string3 = null;
        short[] sArray = null;
        block13: while (true) {
            switch (v.d(string)) {
                default: {
                    string2 = com.github.catvod.spider.merge.e.e(sArray, 38, 10, 3206);
                    string = "\u06e3\u06e0\u06e2";
                    continue block13;
                }
                case 1749854: {
                    sArray = short;
                    string = "\u06e0\u06e6\u06e5";
                    continue block13;
                }
                case 1747871: {
                    string3 = c.e(sArray, 67, 1, 3141);
                    string = "\u06df\u06e4\u06e4";
                    continue block13;
                }
                case 1746847: {
                    hashMap.put(string2, string3);
                    string = "\u06e3\u06e6\u06e1";
                    continue block13;
                }
                case 1749757: {
                    sArray = short;
                    string = "\u06df\u06df\u06e6";
                    continue block13;
                }
                case 1746850: {
                    hashMap = new HashMap<String, String>();
                    string = "\u06e0\u06e3\u06e4";
                    continue block13;
                }
                case 1747712: {
                    string3 = d.b(sArray, 48, 12, 501);
                    string = "\u06e4\u06e6\u06e7";
                    continue block13;
                }
                case 1747777: {
                    sArray = short;
                    string = "\u06e3\u06df\u06e5";
                    continue block13;
                }
                case 1746694: {
                    string2 = f.b(sArray, 60, 7, 1412);
                    string = "\u06e2\u06e8\u06e4";
                    continue block13;
                }
                case 1750565: {
                    sArray = short;
                    string = "\u06e0\u06e1\u06e1";
                    continue block13;
                }
                case 1751717: {
                    hashMap.put(string2, string3);
                    string = "\u06e2\u06e5\u06e0";
                    continue block13;
                }
                case 1750750: 
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
    public String formUpload(String var1_1) {
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
    public String formUploadCate(String var1_1, String var2_2, String var3_3) {
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
    public String formUploadDetail(String var1_1, String var2_2) {
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
    public String formUploadSearch(String var1_1, String var2_2) {
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
    public String homeContent(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[CASE]], but top level block is 4[TRYBLOCK]
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
        super.init(object, (String)var2_3);
        this.l8 = pv.l((String)var2_3);
        int n2 = w.d();
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
                    Integer n4 = Integer.decode(g.d("eSeipKr7"));
                    System.out.println(n4);
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
    public String parseurl(String var1_1, String var2_3) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String playerContent(String var1_1, String var2_3, List<String> var3_4) {
        var3_4 = "";
        Init2.lj();
        var8_5 /* !! */  = var2_3.split(e.d(TTian.short, 2113, 6, 3125));
        var1_1 = var8_5 /* !! */ [1];
        var8_5 /* !! */  = var8_5 /* !! */ [0];
        var9_6 = System.out;
        var10_7 = new StringBuilder();
        var10_7.append(com.github.catvod.spider.merge.e.e(TTian.short, 2119, 6, 2968));
        var10_7.append((String)var2_3);
        var9_6.println(var10_7.toString());
        var7_8 = var1_1.contains(d.b(TTian.short, 2125, 3, 1397));
        var4_9 = 1616;
        block34: while (true) {
            switch (var4_9 ^= 1633) {
                default: {
                    continue block34;
                }
lbl21:
                // 2 sources

                case 14: {
                    var4_9 = 1678;
                    continue block34;
                }
                case 49: {
                    if (!var7_8) ** GOTO lbl21
                    var4_9 = 1709;
                    continue block34;
                }
                case 204: {
                    var2_3 = var1_1.replace(e.d(TTian.short, 2128, 4, 1110), "").split(com.github.catvod.parser.f.c(TTian.short, 2132, 1, 2803));
                    var5_10 = 0;
                    block36: while (true) {
                        var6_11 = var2_3.length;
                        var4_9 = 1740;
                        block37: while (true) {
                            var1_1 = var3_4;
                            switch (var4_9 ^= 1757) {
                                default: {
                                    continue block37;
                                }
                                case 17: {
                                    if (var5_10 < var6_11) {
                                        var4_9 = 1833;
                                        continue block37;
                                    }
                                }
                                case 54: {
                                    var4_9 = 1802;
                                    continue block37;
                                }
                                case 500: {
                                    var1_1 = this.parseurl(var2_3[var5_10], (String)var8_5 /* !! */ );
                                    var7_8 = var1_1.contains(g.c(TTian.short, 2133, 3, 2831));
                                    var4_9 = 1864;
                                    block38: while (true) {
                                        switch (var4_9 ^= 1881) {
                                            default: {
                                                continue block38;
                                            }
                                            case 17: {
                                                if (var7_8) {
                                                    var4_9 = 48736;
                                                    continue block38;
                                                }
                                            }
                                            case 47483: {
                                                var4_9 = 48705;
                                                continue block38;
                                            }
                                            case 47417: {
                                                System.out.println(h.e(TTian.short, 2136, 4, 983));
                                                var4_9 = 48767;
                                                block39: while (true) {
                                                    switch (var4_9 ^= 48784) {
                                                        default: {
                                                            continue block39;
                                                        }
                                                        case 14: {
                                                            ++var5_10;
                                                            continue block36;
                                                        }
                                                        case 239: 
                                                    }
                                                    var4_9 = 48798;
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
                        break;
                    }
lbl80:
                    // 4 sources

                    return var1_1;
                }
                case 239: 
            }
            break;
        }
        try {
            var1_1 = this.parseurl((String)var1_1, (String)var8_5 /* !! */ );
            ** GOTO lbl80
        }
        catch (Throwable var1_2) {
            var4_9 = 48891;
            block41: while (true) {
                var1_1 = var3_4;
                switch (var4_9 ^= 48908) {
                    case 22: {
                        ** continue;
                    }
                    default: {
                        continue block41;
                    }
                    case 503: 
                }
                var4_9 = 48922;
            }
        }
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

    private static long[] $d2j$hex$8c2efa2d$decode_J(String src) {
        byte[] d2 = TTian.$d2j$hex$8c2efa2d$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$8c2efa2d$decode_I(String src) {
        byte[] d2 = TTian.$d2j$hex$8c2efa2d$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$8c2efa2d$decode_S(String src) {
        byte[] d2 = TTian.$d2j$hex$8c2efa2d$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$8c2efa2d$decode_B(String src) {
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

