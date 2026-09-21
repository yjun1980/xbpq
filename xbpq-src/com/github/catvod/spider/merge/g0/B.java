/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Youtube;
import com.github.catvod.spider.merge.H1.f;
import com.github.catvod.spider.merge.H1.r;
import com.github.catvod.utils.server.Server;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Function;

public final class B
implements Function {
    public final Youtube a;

    public /* synthetic */ B(Youtube youtube, String string) {
        this.a = youtube;
    }

    public final Object apply(Object object) {
        Object object2 = this.a;
        object = (r)object;
        int n2 = Youtube.u;
        Objects.requireNonNull(object2);
        String string = String.format(Locale.getDefault(), "height='%d' width='%d' frameRate='%d' maxPlayoutRate='1' startWithSAP='1'", ((r)object).h(), ((r)object).n(), ((r)object).g());
        int n3 = ((r)object).m();
        n2 = ((r)object).e();
        object2 = ((r)object).f();
        String string2 = ((f)object).d().c;
        String string3 = Server.H(((f)object).c()).replace("&", "&amp;");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(((r)object).l());
        charSequence.append("-");
        charSequence.append(((r)object).k());
        charSequence = charSequence.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((r)object).j());
        stringBuilder.append("-");
        stringBuilder.append(((r)object).i());
        return String.format("<AdaptationSet>\n<ContentComponent contentType=\"video\"/>\n<Representation id=\"%d\" bandwidth=\"%d\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"1\">\n<BaseURL>%s</BaseURL>\n<SegmentBase indexRange=\"%s\">\n<Initialization range=\"%s\"/>\n</SegmentBase>\n</Representation>\n</AdaptationSet>\n", n3, n2, object2, string2, string, string3, stringBuilder.toString(), charSequence);
    }
}

