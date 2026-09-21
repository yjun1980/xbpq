/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

public class SubString {
    int index;
    int length;
    String str;

    public SubString() {
    }

    public SubString(String string) {
        this.str = string;
        this.index = 0;
        this.length = string.length();
    }

    public SubString(String string, int n2, int n3) {
        this.str = string;
        this.index = n2;
        this.length = n3;
    }

    public String toString() {
        String string = this.str;
        if (string == null) {
            string = "";
        } else {
            int n2 = this.index;
            string = string.substring(n2, this.length + n2);
        }
        return string;
    }
}

