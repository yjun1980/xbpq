/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f0;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

final class e
extends Authenticator {
    final String a;

    e(String string) {
        this.a = string;
    }

    @Override
    protected final PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.a.split(":")[0], this.a.split(":")[1].toCharArray());
    }
}

