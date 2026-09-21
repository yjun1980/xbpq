/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.xmlimpl.XmlNode$Filter;
import org.w3c.dom.Node;

final class XmlNode$Filter$4
extends XmlNode$Filter {
    XmlNode$Filter$4() {
    }

    @Override
    boolean accept(Node node) {
        short s2 = node.getNodeType();
        boolean bl = true;
        if (s2 != 1) {
            bl = false;
        }
        return bl;
    }
}

