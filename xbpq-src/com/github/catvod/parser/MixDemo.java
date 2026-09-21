/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  org.json.JSONObject
 */
package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.spider.merge.cYh;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public class MixDemo {
    public static HashMap<String, ArrayList<String>> a = new HashMap();
    static HashMap<String, ArrayList<String>> b = null;

    private static String a(String string, String string2) {
        CharSequence charSequence = string;
        if (string2.trim().length() > 0) {
            int n2 = string.indexOf(cYh.d("58"));
            charSequence = string;
            if (n2 > 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string.substring(0, ++n2));
                ((StringBuilder)charSequence).append(cYh.d("0431350E3222136D"));
                ((StringBuilder)charSequence).append(Base64.encodeToString((byte[])string2.getBytes(), (int)10));
                ((StringBuilder)charSequence).append(cYh.d("41"));
                ((StringBuilder)charSequence).append(string.substring(n2));
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return charSequence;
    }

    public static Object[] loadHtml(String object, String object2) {
        String string;
        String string2;
        String string3;
        block6: {
            String string4 = cYh.d("45");
            string3 = cYh.d("3204077C6F");
            string2 = new String(Base64.decode((String)object2, (int)10), string3);
            string = cYh.d("6D6C60353839132931347732133D2D6F5D660F242C3D69505B38243033646D6C35382336026EA9F6F4BCF9C07D7E2333133C246F5D660A35353077321324317C322B1239376C7519083E3534392E4A043821327847332E3F233F09247C73233F1F246E3923370B6B61323F3B152324256A2F13366C69757A486E4B6D3A3F13316139232E177D24202233116D63097A0F267D023E3A2A062428333B3F4570223E392E023E356C7513226D043C223606242418126B5772617E69505B3D2425367A09312C346A7815352F3532280222637134350924243F2367452724333C33132C28347A39083D312D3E3F4A233530393E456E4B6D3A3F1331613F3637026D63273E3F10202E23237847332E3F233F09247C7320330324296C333F113922347A2D0E34353975646D6C6E39323B036E4B6D353503297F5B6B290422282123646D262023773B17390023253B1E6D1A723D2214731C6A5D2C06226124253637237C73742F153C62736C50113133713E3C15312C341F2E0A3C7C7375616D362E237F2C062261386A6A5C397D302733262233302E740B352F3623325C396A7A7E216D262023770F351C7C302733262233302E010E0D6A24253637237A5B3E3C15312C341F2E0A3C7C383128063D241923370B7B636D3E3C15312C347729063E253338225A77203D3B35107D323225331724327136360B3F367C243B0A356C3E253300392F7136360B3F367C3135153D3276773C15312C343535153424236A7D577761303B36082727243B361433333432345A773523223F4070363435310E24203D3B351036343D3B2904222434396740243324327D473D2E2B36360B3F363722360B232223323F096D6625252F0277612225395A726A0405164C727F6D78330122203C3264456B4B2C5D3E0833343C3234137E36233E2E02782837253B0A3509253A364E6B4B6D78290422282123646D6C6E33383E1E6E4B6D7832133D2D6F");
            object2 = new StringBuilder();
            if (!a.containsKey(object)) break block6;
            object = a.get(object);
            int n2 = 0;
            while (true) {
                if (n2 >= ((ArrayList)object).size()) break;
                ((StringBuilder)object2).append(string4);
                ((StringBuilder)object2).append((String)((ArrayList)object).get(n2));
                ((StringBuilder)object2).append(string4);
                if (n2 < ((ArrayList)object).size() - 1) {
                    ((StringBuilder)object2).append(cYh.d("4B"));
                }
                ++n2;
                continue;
                break;
            }
        }
        try {
            object2 = string.replace(cYh.d("4425333D74"), string2).replace(cYh.d("443A392274"), ((StringBuilder)object2).toString());
            object = cYh.d("133539257832133D2D6A77390F313322322E5A72140511775F72");
            object2 = new ByteArrayInputStream(((String)object2).toString().getBytes(string3));
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
        return new Object[]{200, object, object2};
    }

    /*
     * Exception decompiling
     */
    public static JSONObject parse(LinkedHashMap<String, HashMap<String, String>> var0, String var1_2, String var2_4, String var3_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 13[UNCONDITIONALDOLOOP]
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
}

