/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.en;

import java.util.Comparator;

class BaseApi$1
implements Comparator<String> {
    BaseApi$1() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int a(String stringArray) {
        if ((stringArray = stringArray.replace("ms", "").split("###"))[0].equals("auto")) {
            return Integer.MIN_VALUE;
        }
        if (stringArray.length < 2) return Integer.MAX_VALUE;
        if (stringArray[1].isEmpty()) {
            return Integer.MAX_VALUE;
        }
        try {
            return Integer.parseInt(stringArray[1]);
        }
        catch (NumberFormatException numberFormatException) {
            return Integer.MAX_VALUE;
        }
    }

    @Override
    public int compare(String string, String string2) {
        return Integer.compare(this.a(string), this.a(string2));
    }
}

