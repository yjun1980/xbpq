/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.H1.b;
import com.github.catvod.spider.merge.H1.f;
import com.github.catvod.utils.server.Server;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Function;

public final class A
implements Function {
    public final Youtube a;

    public /* synthetic */ A(Youtube youtube, String string) {
        this.a = youtube;
    }

    public final Object apply(Object object) {
        Object object2 = this.a;
        object = (b)object;
        int n2 = Youtube.u;
        Objects.requireNonNull(object2);
        String string = String.format(Locale.getDefault(), "subsegmentAlignment='true' audioSamplingRate='%d'", ((b)object).l().n());
        n2 = ((b)object).k();
        int n3 = ((b)object).e();
        object2 = ((b)object).f();
        String string2 = ((f)object).d().c;
        String string3 = Server.H(((f)object).c()).replace("&", "&amp;");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(((b)object).j());
        charSequence.append("-");
        charSequence.append(((b)object).i());
        charSequence = charSequence.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((b)object).h());
        stringBuilder.append("-");
        stringBuilder.append(((b)object).g());
        return String.format("<AdaptationSet>\n<ContentComponent contentType=\"audio\"/>\n<Representation id=\"%d\" bandwidth=\"%d\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"0\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>\n", n2, n3, object2, string2, string, string3, stringBuilder.toString(), charSequence);
    }
}

