/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.j0;
import java.io.IOException;

public class O
extends IOException {
    private j0 a;

    public O(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public O(String string) {
        super(string);
    }

    static O a() {
        return new O("Protocol message contained an invalid tag (zero).");
    }

    static O b() {
        return new O("Protocol message had invalid UTF-8.");
    }

    static O c() {
        return new O("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static O d() {
        return new O("Failed to parse the message.");
    }

    static O e() {
        return new O("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static O g() {
        return new O("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final O f(j0 j02) {
        this.a = j02;
        return this;
    }
}

