/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.io.Serializable;
import java.util.StringTokenizer;

public final class ParsedContentType
implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String contentType;
    private final String encoding;

    public ParsedContentType(String string) {
        StringTokenizer stringTokenizer;
        String string2 = null;
        String string3 = null;
        if (string != null && (stringTokenizer = new StringTokenizer(string, ";")).hasMoreTokens()) {
            String string4;
            block6: {
                string4 = stringTokenizer.nextToken().trim();
                do {
                    string = string3;
                    if (!stringTokenizer.hasMoreTokens()) break block6;
                } while (!(string = stringTokenizer.nextToken().trim()).startsWith("charset="));
                string2 = string.substring(8).trim();
                int n2 = string2.length();
                string = string2;
                if (n2 > 0) {
                    string3 = string2;
                    if (string2.charAt(0) == '\"') {
                        string3 = string2.substring(1);
                    }
                    string = string3;
                    if (string3.charAt(--n2) == '\"') {
                        string = string3.substring(0, n2);
                    }
                }
            }
            string3 = string4;
        } else {
            string = null;
            string3 = string2;
        }
        this.contentType = string3;
        this.encoding = string;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getEncoding() {
        return this.encoding;
    }
}

