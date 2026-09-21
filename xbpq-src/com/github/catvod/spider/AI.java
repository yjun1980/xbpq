/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.a;
import com.github.catvod.parser.c;
import com.github.catvod.spider.d;
import com.github.catvod.spider.e;
import com.github.catvod.spider.f;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.g;
import com.github.catvod.spider.merge.h;
import com.github.catvod.spider.merge.pv;
import com.github.catvod.spider.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AI
extends Spider {
    private static final short[] short = AI.$d2j$hex$04539192$decode_S("56027002660271022e024202640266026d02770282079b079007ab078407980795078d07ab07810786079807fc04e504ee04d504fa04e604eb04f304d504ec04f804e504e704bc06a506ae069506a906a506a406be06af06a406be06c60adf0ad40aef0ad40ad90ac20ad50ad30ac40adf0ac20a3f0526052d05160528052a053d0526053b0503041a0411042a04070410041804140407041e040604560c4f0c440c7f0c410c520c450c410c4e0357035c03670341035d0359034a031b070207090732071d0704070e07d201cb01c001fb01ca01c501c901c101e107f807f307c807fe07f3074f0a4a0a500a570a80019001ce01cc019201cb01ca01db01ce01c601c3018901c601cb01dc0192012b0226022f023a02000231023e0232023a02780861086a0851086d0862086f087d087d087f6cbe64f854975c73565656228a17f8ec8ce45511494858cc548c9d1af81af86e024e02c902fe02fd02fe02e902fe02e90229036a03340372033f0362076f076b076e076f0778077a0262026a02640261026202ca06cd06d3061402050216021702010249020a0217025302b107a3070e0317031c0327030a031d03150319030a0313030b03ab0bb20bb90b820bad0bb40bbe0bb502ac02a7029c02ad02a202ae02a602c605df05d405ef05d905d4053a063f06250622060609160948094a0914095f0940094d094c094609450940095a095d090f095e094d091409");
    private String S = "";
    private String T4 = "";
    private String l8 = "";

    /*
     * Enabled aggressive block sorting
     */
    public AI() {
        int n2 = e.e();
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
                    Float f2 = Float.decode((String)com.github.catvod.parser.g.d("dIC"));
                    System.out.println(f2);
                    return;
                }
                case 239: 
            }
            break;
        }
    }

    private HashMap<String, String> l8(String string) {
        string = "\u06e5\u06e3\u06e7";
        String string2 = null;
        String string3 = null;
        HashMap<String, String> hashMap = null;
        short[] sArray = null;
        block7: while (true) {
            switch (v.d(string)) {
                default: {
                    string3 = this.S;
                    string = "\u06e6\u06e6";
                    continue block7;
                }
                case 56512: {
                    sArray = short;
                    string = "\u06e5\u06e3\u06df";
                    continue block7;
                }
                case 56514: {
                    hashMap.put(string2, string3);
                    string = "\u06e7\u06e4\u06e4";
                    continue block7;
                }
                case 1752585: {
                    hashMap = new HashMap<String, String>();
                    string = "\u06e6\u06df\u06e3";
                    continue block7;
                }
                case 1752577: {
                    string2 = g.c(sArray, 0, 10, 515);
                    string = "\u06e6\u06e8";
                    continue block7;
                }
                case 1754535: 
            }
            break;
        }
        return hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String detailContent(List<String> object) {
        String string = v.b(short, 10, 12, 2036);
        String string2 = com.github.catvod.spider.merge.f.b(short, 22, 13, 1162);
        String string3 = f.d(short, 35, 11, 1738);
        String string4 = com.github.catvod.parser.e.b(short, 46, 12, 2736);
        String string5 = e.d(short, 58, 9, 1353);
        String string6 = c.e(short, 67, 11, 1141);
        String string7 = g.c(short, 78, 8, 3104);
        CharSequence charSequence = com.github.catvod.parser.g.c(short, 86, 8, 824);
        String string8 = com.github.catvod.parser.e.b(short, 94, 7, 1901);
        String string9 = com.github.catvod.parser.d.b(short, 101, 8, 420);
        String string10 = e.d(short, 109, 6, 1943);
        String string11 = com.github.catvod.spider.merge.e.e(short, 115, 4, 2595);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.l8);
            stringBuilder.append(a.c(short, 119, 16, 431));
            stringBuilder.append((String)object.get(0));
            object = stringBuilder.toString();
            String string12 = Yy.v((String)object, this.l8((String)object));
            object = new JSONObject(string12);
            object = object.getJSONArray(string11).optJSONObject(0);
            jSONObject.put(string10, (Object)object.optString(string10));
            jSONObject.put(string9, (Object)object.optString(string9));
            jSONObject.put(string8, (Object)object.optString(string8));
            jSONObject.put(h.e(short, 135, 9, 607), (Object)object.optString(com.github.catvod.spider.merge.e.e(short, 144, 9, 2062)));
            jSONObject.put((String)charSequence, (Object)object.optString((String)charSequence));
            jSONObject.put(string7, (Object)object.optString(string7));
            jSONObject.put(string6, (Object)object.optString(string6));
            jSONObject.put(string5, (Object)object.optString(string5));
            jSONObject.put(string4, (Object)object.optString(string4));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(com.github.catvod.spider.merge.e.e(short, 153, 16, 1819));
            ((StringBuilder)charSequence).append(object.optString(string3));
            jSONObject.put(string3, (Object)((StringBuilder)charSequence).toString());
            jSONObject.put(string2, (Object)object.optString(string2));
            jSONObject.put(string, (Object)object.optString(string));
            object = new JSONArray();
            object.put((Object)jSONObject);
            jSONObject2.put(string11, object);
            return jSONObject2.toString();
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void init(Context object, String string) {
        void var2_4;
        super.init((Context)object, (String)var2_4);
        String[] stringArray = pv.l((String)var2_4).split(h.e(short, 169, 2, 562));
        this.l8 = stringArray[0];
        this.S = stringArray[1];
        this.T4 = stringArray[2];
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
                    Double d2 = Double.valueOf(com.github.catvod.parser.d.c("UML8joJ1TfBPO3UX0s8b3e"));
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String searchContent(String string, boolean bl) {
        String string2 = c.e(short, 209, 11, 888);
        String string3 = com.github.catvod.spider.merge.d.e(short, 220, 7, 3037);
        String string4 = d.e(short, 227, 8, 707);
        String string5 = f.d(short, 235, 6, 1456);
        String string6 = h.e(short, 241, 4, 1622);
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.l8);
            stringBuilder.append(com.github.catvod.parser.f.c(short, 245, 18, 2345));
            stringBuilder.append(string);
            string = stringBuilder.toString();
            System.out.println(string);
            String string7 = Yy.v(string, this.l8(string));
            string = new JSONArray();
            stringBuilder = new JSONObject(string7);
            JSONArray jSONArray = stringBuilder.getJSONArray(string6);
            int n2 = 0;
            block14: while (true) {
                int n3 = jSONArray.length();
                int n4 = 1616;
                block15: while (true) {
                    switch (n4 ^= 0x661) {
                        default: {
                            continue block15;
                        }
                        case 49: {
                            if (n2 < n3) {
                                n4 = 1709;
                                continue block15;
                            }
                        }
                        case 14: {
                            n4 = 1678;
                            continue block15;
                        }
                        case 204: {
                            stringBuilder = jSONArray.optJSONObject(n2);
                            string7 = new JSONObject();
                            string7.put(string5, (Object)stringBuilder.optString(string5));
                            string7.put(string4, (Object)stringBuilder.optString(string4));
                            string7.put(string3, (Object)stringBuilder.optString(string3));
                            string7.put(string2, (Object)stringBuilder.optString(string2));
                            string.put((Object)string7);
                            n3 = n2 + 1;
                            n4 = 1740;
                            break block15;
                        }
                        case 239: {
                            jSONObject.put(string6, (Object)string);
                            return jSONObject.toString();
                        }
                    }
                    break;
                }
                block16: while (true) {
                    n2 = n3;
                    switch (n4 ^= 0x6DD) {
                        case 54: {
                            continue block14;
                        }
                        default: {
                            continue block16;
                        }
                        case 17: 
                    }
                    n4 = 1771;
                }
                break;
            }
        }
        catch (Throwable throwable) {
            return "";
        }
    }

    private static long[] $d2j$hex$04539192$decode_J(String src) {
        byte[] d2 = AI.$d2j$hex$04539192$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s2 = b2.asLongBuffer();
        long[] data = new long[d2.length / 8];
        s2.get(data);
        return data;
    }

    private static int[] $d2j$hex$04539192$decode_I(String src) {
        byte[] d2 = AI.$d2j$hex$04539192$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s2 = b2.asIntBuffer();
        int[] data = new int[d2.length / 4];
        s2.get(data);
        return data;
    }

    private static short[] $d2j$hex$04539192$decode_S(String src) {
        byte[] d2 = AI.$d2j$hex$04539192$decode_B(src);
        ByteBuffer b2 = ByteBuffer.wrap(d2);
        b2.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s2 = b2.asShortBuffer();
        short[] data = new short[d2.length / 2];
        s2.get(data);
        return data;
    }

    private static byte[] $d2j$hex$04539192$decode_B(String src) {
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

