/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.y.z;
import java.io.Serializable;
import org.mozilla.javascript.Kit;

public final class UniqueTag
implements Serializable {
    public static final UniqueTag DOUBLE_MARK;
    private static final int ID_DOUBLE_MARK = 3;
    private static final int ID_NOT_FOUND = 1;
    private static final int ID_NULL_VALUE = 2;
    public static final UniqueTag NOT_FOUND;
    public static final UniqueTag NULL_VALUE;
    private static final long serialVersionUID = -4320556826714577259L;
    private final int tagId;

    static {
        NOT_FOUND = new UniqueTag(1);
        NULL_VALUE = new UniqueTag(2);
        DOUBLE_MARK = new UniqueTag(3);
    }

    private UniqueTag(int n2) {
        this.tagId = n2;
    }

    public Object readResolve() {
        int n2 = this.tagId;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return DOUBLE_MARK;
                }
                throw new IllegalStateException(String.valueOf(this.tagId));
            }
            return NULL_VALUE;
        }
        return NOT_FOUND;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        String string;
        int n2 = this.tagId;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) throw Kit.codeBug();
                string = "DOUBLE_MARK";
                return z.b(new StringBuilder(), super.toString(), ": ", string);
            } else {
                string = "NULL_VALUE";
            }
            return z.b(new StringBuilder(), super.toString(), ": ", string);
        } else {
            string = "NOT_FOUND";
        }
        return z.b(new StringBuilder(), super.toString(), ": ", string);
    }
}

