/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

final class AbstractEcmaObjectOperations$INTEGRITY_LEVEL
extends Enum<AbstractEcmaObjectOperations$INTEGRITY_LEVEL> {
    private static final AbstractEcmaObjectOperations$INTEGRITY_LEVEL[] $VALUES;
    public static final /* enum */ AbstractEcmaObjectOperations$INTEGRITY_LEVEL FROZEN;
    public static final /* enum */ AbstractEcmaObjectOperations$INTEGRITY_LEVEL SEALED;

    static {
        AbstractEcmaObjectOperations$INTEGRITY_LEVEL abstractEcmaObjectOperations$INTEGRITY_LEVEL;
        AbstractEcmaObjectOperations$INTEGRITY_LEVEL abstractEcmaObjectOperations$INTEGRITY_LEVEL2;
        FROZEN = abstractEcmaObjectOperations$INTEGRITY_LEVEL2 = new AbstractEcmaObjectOperations$INTEGRITY_LEVEL();
        SEALED = abstractEcmaObjectOperations$INTEGRITY_LEVEL = new AbstractEcmaObjectOperations$INTEGRITY_LEVEL();
        $VALUES = new AbstractEcmaObjectOperations$INTEGRITY_LEVEL[]{abstractEcmaObjectOperations$INTEGRITY_LEVEL2, abstractEcmaObjectOperations$INTEGRITY_LEVEL};
    }

    public static AbstractEcmaObjectOperations$INTEGRITY_LEVEL valueOf(String string) {
        return Enum.valueOf(AbstractEcmaObjectOperations$INTEGRITY_LEVEL.class, string);
    }

    public static AbstractEcmaObjectOperations$INTEGRITY_LEVEL[] values() {
        return (AbstractEcmaObjectOperations$INTEGRITY_LEVEL[])$VALUES.clone();
    }
}

