/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.D1.d;
import com.github.catvod.spider.merge.H1.r;
import com.github.catvod.spider.merge.k1.i;

public final class q {
    private String a;
    private String b;
    private boolean c;
    private int d = 1;
    private i e;
    private String f;
    private Boolean g;
    private String h;
    private d i;

    public final r a() {
        String string = this.a;
        if (string != null) {
            String string2 = this.b;
            if (string2 != null) {
                int n2 = this.d;
                if (n2 != 0) {
                    Boolean bl = this.g;
                    if (bl != null) {
                        String string3 = this.h;
                        if (string3 != null) {
                            return new r(string, string2, this.c, this.e, n2, string3, bl, this.f, this.i);
                        }
                        throw new IllegalStateException("The resolution of the video stream has been not set. Please specify it with setResolution (use an empty string if you are not able to get it).");
                    }
                    throw new IllegalStateException("The video stream has been not set as a video-only stream or as a video stream with embedded audio. Please specify this information with setIsVideoOnly.");
                }
                throw new IllegalStateException("The delivery method of the video stream has been set as null, which is not allowed. Pass a valid one instead with setDeliveryMethod.");
            }
            throw new IllegalStateException("The content of the video stream has been not set or is null. Please specify a non-null one with setContent.");
        }
        throw new IllegalStateException("The identifier of the video stream has been not set or is null. If you are not able to get an identifier, use the static constant ID_UNKNOWN of the Stream class.");
    }

    public final q b(String string, boolean bl) {
        this.b = string;
        this.c = bl;
        return this;
    }

    public final q c(int n2) {
        this.d = n2;
        return this;
    }

    public final q d(String string) {
        this.a = string;
        return this;
    }

    public final q e(boolean bl) {
        this.g = bl;
        return this;
    }

    public final q f(d d2) {
        this.i = d2;
        return this;
    }

    public final q g(String string) {
        this.f = string;
        return this;
    }

    public final q h(i i2) {
        this.e = i2;
        return this;
    }

    public final q i(String string) {
        this.h = string;
        return this;
    }
}

