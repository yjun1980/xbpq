/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k1;

import com.github.catvod.spider.merge.k1.h;
import java.util.Arrays;

public final class i
extends Enum<i> {
    public static final /* enum */ i d;
    public static final /* enum */ i e;
    public static final /* enum */ i f;
    public static final /* enum */ i g;
    public static final /* enum */ i h;
    public static final /* enum */ i i;
    public static final /* enum */ i j;
    public static final /* enum */ i k;
    public static final /* enum */ i l;
    public static final /* enum */ i m;
    private static final i[] n;
    public final int a;
    public final String b;
    public final String c;

    static {
        i i2;
        i i4;
        i i5;
        i i6;
        i i7;
        i i8;
        i i9;
        i i10;
        i i11;
        i i12;
        d = i12 = new i("MPEG_4", 0, 0, "mp4", "video/mp4");
        e = i11 = new i("v3GPP", 1, 16, "3gp", "video/3gpp");
        f = i10 = new i("WEBM", 2, 32, "webm", "video/webm");
        g = i9 = new i("M4A", 3, 256, "m4a", "audio/mp4");
        h = i8 = new i("WEBMA", 4, 512, "webm", "audio/webm");
        i = i7 = new i("MP3", 5, 768, "mp3", "audio/mpeg");
        i i13 = new i("MP2", 6, 784, "mp2", "audio/mpeg");
        j = i6 = new i("OPUS", 7, 1024, "opus", "audio/opus");
        k = i5 = new i("OGG", 8, 1280, "ogg", "audio/ogg");
        l = i4 = new i("WEBMA_OPUS", 9, 512, "webm", "audio/webm");
        i i14 = new i("AIFF", 10, 1536, "aiff", "audio/aiff");
        i i15 = new i("AIF", 11, 1536, "aif", "audio/aiff");
        i i16 = new i("WAV", 12, 1792, "wav", "audio/wav");
        i i17 = new i("FLAC", 13, 2048, "flac", "audio/flac");
        i i18 = new i("ALAC", 14, 2304, "alac", "audio/alac");
        i i19 = new i("VTT", 15, 4096, "vtt", "text/vtt");
        m = i2 = new i("TTML", 16, 8192, "ttml", "application/ttml+xml");
        n = new i[]{i12, i11, i10, i9, i8, i7, i13, i6, i5, i4, i14, i15, i16, i17, i18, i19, i2, new i("TRANSCRIPT1", 17, 12288, "srv1", "text/xml"), new i("TRANSCRIPT2", 18, 16384, "srv2", "text/xml"), new i("TRANSCRIPT3", 19, 20480, "srv3", "text/xml"), new i("SRT", 20, 24576, "srt", "text/srt")};
    }

    private i(int n3, String string2, String string3, String string4) {
        this.a = n3;
        this.b = string2;
        this.c = string3;
    }

    public static i b(String string) {
        return Arrays.stream(com.github.catvod.spider.merge.k1.i.values()).filter(new h(string, 0)).findFirst().orElse(null);
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public static i[] values() {
        return (i[])n.clone();
    }
}

