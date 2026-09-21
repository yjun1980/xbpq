/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xml;

import org.mozilla.javascript.xml.XMLLib$Factory;

final class XMLLib$Factory$1
extends XMLLib$Factory {
    final String val$className;

    XMLLib$Factory$1(String string) {
        this.val$className = string;
    }

    @Override
    public String getImplementationClassName() {
        return this.val$className;
    }
}

