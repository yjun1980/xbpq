/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.json;

public class JsonParser$ParseException
extends Exception {
    private static final long serialVersionUID = 4804542791749920772L;

    JsonParser$ParseException(Exception exception) {
        super(exception);
    }

    JsonParser$ParseException(String string) {
        super(string);
    }
}

