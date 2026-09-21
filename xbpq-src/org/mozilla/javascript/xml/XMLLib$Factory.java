/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xml;

import org.mozilla.javascript.xml.XMLLib$Factory$1;

public abstract class XMLLib$Factory {
    public static XMLLib$Factory create(String string) {
        return new XMLLib$Factory$1(string);
    }

    public abstract String getImplementationClassName();
}

