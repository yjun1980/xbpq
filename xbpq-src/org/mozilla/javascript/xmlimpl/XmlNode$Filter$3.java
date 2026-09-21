/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XmlNode$Filter;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;

final class XmlNode$Filter$3
extends XmlNode$Filter {
    final XMLName val$name;

    XmlNode$Filter$3(XMLName xMLName) {
        this.val$name = xMLName;
    }

    @Override
    boolean accept(Node node) {
        if (node.getNodeType() == 7) {
            node = (ProcessingInstruction)node;
            return this.val$name.matchesLocalName(node.getTarget());
        }
        return false;
    }
}

