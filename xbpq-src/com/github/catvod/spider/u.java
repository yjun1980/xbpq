/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.Spider
 */
package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.a;
import com.github.catvod.spider.f;
import com.github.catvod.spider.v;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class u
extends Spider {
    public static int l8 = -1;
    private static final short[] short = new short[]{1704, 1716, 1716, 1712, 1786, 1775, 1775, 1777, 1778, 1783, 1774, 1776, 1774, 1776, 1774, 1777, 1786, 2792, 2743, 2741, 2728, 2751, 2750, 2808, 2723, 2728, 2810, 2724, 2732, 2809, 2813, 831, 790, 780, 791, 797, 857, 789, 790, 794, 792, 789, 857, 778, 796, 779, 783, 796, 779, 857, 777, 790, 779, 781, 857, 612, 632, 632, 636, 566, 547, 547, 573, 574, 571, 546, 572, 546, 572, 546, 573, 566, 2916, 2875, 2873, 2852, 2867, 2866, 2093, 2086, 271, 266, 277, 262, 660, 661, 647, 748, 761, 3061, 3064, 3057, 3044, 1442, 1454, 1442, 2856, 2869, 2873, 729, 721, 2741, 2724, 2745, 2741, 2798, 2737, 2733, 2720, 2728, 2735, 2810, 2785, 2722, 2729, 2720, 2739, 2738, 2724, 2741, 2812, 2740, 2741, 2727, 2796, 2809, 875, 879, 2577, 2580, 2578, 2569, 720, 713, 704, 707, 707, 1852, 1851, 1829, 1716, 1716, 1698, 1723, 2860, 2857, 2877, 2871};

    /*
     * Enabled aggressive block sorting
     */
    public u() {
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
                    Double d2 = Double.decode((String)f.e("zhvy7mkdFADqzyeDZ0ZcXlKSQS6"));
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
    static void l8() {
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

    public static String localProxyUrl() {
        int n2 = 0;
        String string = "\u06e2\u06e5\u06e1";
        StringBuilder stringBuilder = null;
        short[] sArray = null;
        String string2 = null;
        block13: while (true) {
            switch (v.d(string)) {
                default: {
                    sArray = short;
                    string = "\u06e4\u06df\u06e7";
                    continue block13;
                }
                case 1755561: {
                    string2 = f.d(sArray, 72, 6, 2891);
                    string = "\u06e6\u06e3\u06e2";
                    continue block13;
                }
                case 1749758: {
                    u.l8();
                    string = "\u06df\u06e8";
                    continue block13;
                }
                case 1751678: {
                    stringBuilder.append(n2);
                    string = "\u06e2\u06e6";
                    continue block13;
                }
                case 56388: {
                    sArray = short;
                    string = "\u06e8\u06e6\u06e7";
                    continue block13;
                }
                case 1751500: {
                    string2 = a.c(sArray, 55, 17, 524);
                    string = "\u06df\u06e5\u06e2";
                    continue block13;
                }
                case 1746876: {
                    stringBuilder.append(string2);
                    string = "\u06e4\u06e7\u06e7";
                    continue block13;
                }
                case 56297: {
                    stringBuilder = new StringBuilder();
                    string = "\u06e5\u06e0\u06e3";
                    continue block13;
                }
                case 1748803: {
                    string2 = stringBuilder.toString();
                    string = "\u06df\u06e0\u06e4";
                    continue block13;
                }
                case 1751748: {
                    n2 = l8;
                    string = "\u06e4\u06e5\u06df";
                    continue block13;
                }
                case 1753541: {
                    stringBuilder.append(string2);
                    string = "\u06e1\u06e5\u06e7";
                    continue block13;
                }
                case 1746723: 
            }
            break;
        }
        return string2;
    }

    /*
     * Exception decompiling
     */
    public static Object[] proxy(Map<String, String> var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 490->509)] java.lang.Throwable
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
}

