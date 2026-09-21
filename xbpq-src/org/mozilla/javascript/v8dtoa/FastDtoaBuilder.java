/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.v8dtoa;

import com.github.catvod.spider.merge.C.a;
import java.util.Arrays;

public class FastDtoaBuilder {
    static final char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    final char[] chars = new char[25];
    int end = 0;
    boolean formatted = false;
    int point;

    private void toExponentialFormat(int n2, int n3) {
        int n4;
        char[] cArray;
        int n5;
        if ((n5 = this.end++) - n2 > 1) {
            cArray = this.chars;
            System.arraycopy(cArray, ++n2, cArray, n2 + 1, n5 - n2);
            this.chars[n2] = 46;
        }
        cArray = this.chars;
        n2 = this.end;
        this.end = n4 = n2 + 1;
        cArray[n2] = 101;
        int n6 = 43;
        n3 = n2 = n3 - 1;
        if (n2 < 0) {
            n6 = 45;
            n3 = -n2;
        }
        this.end = n5 = n4 + 1;
        cArray[n4] = n6;
        if (n3 > 99) {
            n2 = n5 + 2;
        } else {
            n2 = n5;
            if (n3 > 9) {
                n2 = n5 + 1;
            }
        }
        this.end = n2 + 1;
        while (true) {
            this.chars[n2] = digits[n3 % 10];
            if ((n3 /= 10) == 0) {
                return;
            }
            --n2;
        }
    }

    private void toFixedFormat(int n2, int n3) {
        block6: {
            block7: {
                int n4;
                int n5;
                block4: {
                    block5: {
                        n5 = this.point;
                        if (n5 >= (n4 = this.end++)) break block4;
                        if (n3 <= 0) break block5;
                        char[] cArray = this.chars;
                        System.arraycopy(cArray, n5, cArray, n5 + 1, n4 - n5);
                        this.chars[this.point] = 46;
                        break block6;
                    }
                    n5 = n2 + 2;
                    int n6 = n5 - n3;
                    char[] cArray = this.chars;
                    System.arraycopy(cArray, n2, cArray, n6, n4 - n2);
                    cArray = this.chars;
                    cArray[n2] = 48;
                    cArray[n2 + 1] = 46;
                    if (n3 < 0) {
                        Arrays.fill(cArray, n5, n6, '0');
                    }
                    n2 = this.end;
                    n3 = 2 - n3;
                    break block7;
                }
                if (n5 <= n4) break block6;
                Arrays.fill(this.chars, n4, n5, '0');
                n2 = this.end;
                n3 = this.point - n2;
            }
            this.end = n3 + n2;
        }
    }

    void append(char c2) {
        char[] cArray = this.chars;
        int n2 = this.end;
        this.end = n2 + 1;
        cArray[n2] = c2;
    }

    void decreaseLast() {
        char[] cArray = this.chars;
        int n2 = this.end - 1;
        cArray[n2] = (char)(cArray[n2] - '\u0001');
    }

    public String format() {
        if (!this.formatted) {
            int n2 = this.chars[0] == '-' ? 1 : 0;
            int n3 = this.point - n2;
            if (n3 >= -5 && n3 <= 21) {
                this.toFixedFormat(n2, n3);
            } else {
                this.toExponentialFormat(n2, n3);
            }
            this.formatted = true;
        }
        return new String(this.chars, 0, this.end);
    }

    public void reset() {
        this.end = 0;
        this.formatted = false;
    }

    public String toString() {
        StringBuilder stringBuilder = a.c("[chars:");
        stringBuilder.append(new String(this.chars, 0, this.end));
        stringBuilder.append(", point:");
        stringBuilder.append(this.point);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

