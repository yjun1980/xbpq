/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.io.Serializable;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Symbol;

public class SymbolKey
implements Symbol,
Serializable {
    public static final SymbolKey HAS_INSTANCE;
    public static final SymbolKey IS_CONCAT_SPREADABLE;
    public static final SymbolKey IS_REGEXP;
    public static final SymbolKey ITERATOR;
    public static final SymbolKey MATCH;
    public static final SymbolKey REPLACE;
    public static final SymbolKey SEARCH;
    public static final SymbolKey SPECIES;
    public static final SymbolKey SPLIT;
    public static final SymbolKey TO_PRIMITIVE;
    public static final SymbolKey TO_STRING_TAG;
    public static final SymbolKey UNSCOPABLES;
    private static final long serialVersionUID = -6019782713330994754L;
    private String name;

    static {
        ITERATOR = new SymbolKey("Symbol.iterator");
        TO_STRING_TAG = new SymbolKey("Symbol.toStringTag");
        SPECIES = new SymbolKey("Symbol.species");
        HAS_INSTANCE = new SymbolKey("Symbol.hasInstance");
        IS_CONCAT_SPREADABLE = new SymbolKey("Symbol.isConcatSpreadable");
        IS_REGEXP = new SymbolKey("Symbol.isRegExp");
        TO_PRIMITIVE = new SymbolKey("Symbol.toPrimitive");
        MATCH = new SymbolKey("Symbol.match");
        REPLACE = new SymbolKey("Symbol.replace");
        SEARCH = new SymbolKey("Symbol.search");
        SPLIT = new SymbolKey("Symbol.split");
        UNSCOPABLES = new SymbolKey("Symbol.unscopables");
    }

    public SymbolKey(String string) {
        this.name = string;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof SymbolKey;
        boolean bl2 = true;
        boolean bl3 = true;
        if (bl) {
            bl2 = object == this ? bl3 : false;
            return bl2;
        }
        if (object instanceof NativeSymbol) {
            if (((NativeSymbol)object).getKey() != this) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public String toString() {
        if (this.name == null) {
            return "Symbol()";
        }
        StringBuilder stringBuilder = a.c("Symbol(");
        stringBuilder.append(this.name);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

