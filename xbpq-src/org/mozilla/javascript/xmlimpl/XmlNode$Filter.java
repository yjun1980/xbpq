/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XmlNode$Filter$1;
import org.mozilla.javascript.xmlimpl.XmlNode$Filter$2;
import org.mozilla.javascript.xmlimpl.XmlNode$Filter$3;
import org.mozilla.javascript.xmlimpl.XmlNode$Filter$4;
import org.mozilla.javascript.xmlimpl.XmlNode$Filter$5;
import org.w3c.dom.Node;

abstract class XmlNode$Filter {
    static final XmlNode$Filter COMMENT = new XmlNode$Filter$1();
    static XmlNode$Filter ELEMENT;
    static final XmlNode$Filter TEXT;
    static XmlNode$Filter TRUE;

    static {
        TEXT = new XmlNode$Filter$2();
        ELEMENT = new XmlNode$Filter$4();
        TRUE = new XmlNode$Filter$5();
    }

    XmlNode$Filter() {
    }

    static XmlNode$Filter PROCESSING_INSTRUCTION(XMLName xMLName) {
        return new XmlNode$Filter$3(xMLName);
    }

    abstract boolean accept(Node var1);
}

