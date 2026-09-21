/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.s;
import java.io.Serializable;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

class XmlNode$QName
implements Serializable {
    private static final long serialVersionUID = -6587069811691451077L;
    private String localName;
    private XmlNode$Namespace namespace;

    private XmlNode$QName() {
    }

    @Deprecated
    static XmlNode$QName create(String string, String string2, String string3) {
        return XmlNode$QName.create(XmlNode$Namespace.create(string3, string), string2);
    }

    static XmlNode$QName create(XmlNode$Namespace xmlNode$Namespace, String string) {
        if (string != null && string.equals("*")) {
            throw new RuntimeException("* is not valid localName");
        }
        XmlNode$QName xmlNode$QName = new XmlNode$QName();
        xmlNode$QName.namespace = xmlNode$Namespace;
        xmlNode$QName.localName = string;
        return xmlNode$QName;
    }

    private boolean equals(String string, String string2) {
        if (string == null && string2 == null) {
            return true;
        }
        if (string != null && string2 != null) {
            return string.equals(string2);
        }
        return false;
    }

    private boolean namespacesEqual(XmlNode$Namespace xmlNode$Namespace, XmlNode$Namespace xmlNode$Namespace2) {
        if (xmlNode$Namespace == null && xmlNode$Namespace2 == null) {
            return true;
        }
        if (xmlNode$Namespace != null && xmlNode$Namespace2 != null) {
            return this.equals(xmlNode$Namespace.getUri(), xmlNode$Namespace2.getUri());
        }
        return false;
    }

    static String qualify(String string, String string2) {
        if (string != null) {
            if (string.length() > 0) {
                return s.a(string, ":", string2);
            }
            return string2;
        }
        throw new IllegalArgumentException("prefix must not be null");
    }

    public boolean equals(Object object) {
        if (!(object instanceof XmlNode$QName)) {
            return false;
        }
        return this.equals((XmlNode$QName)object);
    }

    final boolean equals(XmlNode$QName xmlNode$QName) {
        if (!this.namespacesEqual(this.namespace, xmlNode$QName.namespace)) {
            return false;
        }
        return this.equals(this.localName, xmlNode$QName.localName);
    }

    String getLocalName() {
        return this.localName;
    }

    XmlNode$Namespace getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        String string = this.localName;
        int n2 = string == null ? 0 : string.hashCode();
        return n2;
    }

    void lookupPrefix(Node node) {
        if (node != null) {
            CharSequence charSequence;
            String string = node.lookupPrefix(this.namespace.getUri());
            Object object = string;
            if (string == null) {
                object = node.lookupNamespaceURI(null);
                charSequence = object;
                if (object == null) {
                    charSequence = "";
                }
                object = string;
                if (this.namespace.getUri().equals(charSequence)) {
                    object = "";
                }
            }
            int n2 = 0;
            while (object == null) {
                charSequence = a.c("e4x_");
                ((StringBuilder)charSequence).append(n2);
                charSequence = ((StringBuilder)charSequence).toString();
                if (node.lookupNamespaceURI((String)charSequence) == null) {
                    object = node;
                    while (object.getParentNode() != null && object.getParentNode() instanceof Element) {
                        object = object.getParentNode();
                    }
                    ((Element)object).setAttributeNS("http://www.w3.org/2000/xmlns/", e.c("xmlns:", (String)charSequence), this.namespace.getUri());
                    object = charSequence;
                }
                ++n2;
            }
            XmlNode$Namespace.access$200(this.namespace, (String)object);
            return;
        }
        throw new IllegalArgumentException("node must not be null");
    }

    String qualify(Node node) {
        if (this.namespace.getPrefix() == null) {
            if (node != null) {
                this.lookupPrefix(node);
            } else {
                XmlNode$Namespace.access$200(this.namespace, "");
            }
        }
        return XmlNode$QName.qualify(this.namespace.getPrefix(), this.localName);
    }

    void setAttribute(Element element, String string) {
        if (this.namespace.getPrefix() == null) {
            this.lookupPrefix(element);
        }
        element.setAttributeNS(this.namespace.getUri(), XmlNode$QName.qualify(this.namespace.getPrefix(), this.localName), string);
    }

    public String toString() {
        StringBuilder stringBuilder = a.c("XmlNode.QName [");
        stringBuilder.append(this.localName);
        stringBuilder.append(",");
        stringBuilder.append(this.namespace);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

