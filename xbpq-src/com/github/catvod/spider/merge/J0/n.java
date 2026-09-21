/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.J0.m;

public final class n
extends Enum<n>
implements m {
    public static final /* enum */ n c;
    public static final /* enum */ n d;
    public static final /* enum */ n e;
    public static final /* enum */ n f;
    public static final /* enum */ n g;
    public static final /* enum */ n h;
    private static final n[] i;
    private final int a;
    private final String b;

    static {
        n n2;
        n n3;
        n n4;
        n n5;
        n n6;
        n n7;
        n n8 = new n(101, "Switching Protocols");
        c = n7 = new n(200, "OK");
        n n9 = new n(201, "Created");
        n n10 = new n(202, "Accepted");
        n n11 = new n(204, "No Content");
        d = n6 = new n(206, "Partial Content");
        n n12 = new n(207, "Multi-Status");
        n n13 = new n(301, "Moved Permanently");
        n n14 = new n(302, "Found");
        n n15 = new n(303, "See Other");
        n n16 = new n(304, "Not Modified");
        n n17 = new n(307, "Temporary Redirect");
        e = n5 = new n(400, "Bad Request");
        n n18 = new n(401, "Unauthorized");
        n n19 = new n(403, "Forbidden");
        f = n4 = new n(404, "Not Found");
        n n20 = new n(405, "Method Not Allowed");
        n n21 = new n(406, "Not Acceptable");
        n n22 = new n(408, "Request Timeout");
        n n23 = new n(409, "Conflict");
        n n24 = new n(410, "Gone");
        n n25 = new n(411, "Length Required");
        n n26 = new n(412, "Precondition Failed");
        n n27 = new n(413, "Payload Too Large");
        n n28 = new n(415, "Unsupported Media Type");
        g = n3 = new n(416, "Requested Range Not Satisfiable");
        n n29 = new n(417, "Expectation Failed");
        n n30 = new n(429, "Too Many Requests");
        h = n2 = new n(500, "Internal Server Error");
        i = new n[]{n8, n7, n9, n10, n11, n6, n12, n13, n14, n15, n16, n17, n5, n18, n19, n4, n20, n21, n22, n23, n24, n25, n26, n27, n28, n3, n29, n30, n2, new n(501, "Not Implemented"), new n(503, "Service Unavailable"), new n(505, "HTTP Version Not Supported")};
    }

    private n(int n3, String string2) {
        this.a = n3;
        this.b = string2;
    }

    public static n e(int n2) {
        for (n n3 : n.values()) {
            if (n3.a != n2) continue;
            return n3;
        }
        return null;
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    public static n[] values() {
        return (n[])i.clone();
    }

    public final String b() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("");
        stringBuilder.append(this.a);
        stringBuilder.append(" ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

