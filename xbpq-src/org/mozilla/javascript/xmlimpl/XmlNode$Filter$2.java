/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.xmlimpl.XmlNode$Filter;
import org.w3c.dom.Node;

final class XmlNode$Filter$2
extends XmlNode$Filter {
    XmlNode$Filter$2() {
    }

    @Override
    boolean accept(Node node) {
        boolean bl = node.getNodeType() == 3;
        return bl;
    }
}

