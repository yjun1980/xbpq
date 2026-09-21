/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.xmlimpl.XmlNode$Filter;
import org.w3c.dom.Node;

final class XmlNode$Filter$1
extends XmlNode$Filter {
    XmlNode$Filter$1() {
    }

    @Override
    boolean accept(Node node) {
        boolean bl = node.getNodeType() == 8;
        return bl;
    }
}

