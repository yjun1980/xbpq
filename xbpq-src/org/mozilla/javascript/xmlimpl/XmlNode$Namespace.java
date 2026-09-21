/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import com.github.catvod.spider.merge.C.a;
import java.io.Serializable;

class XmlNode$Namespace
implements Serializable {
    static final XmlNode$Namespace GLOBAL = XmlNode$Namespace.create("", "");
    private static final long serialVersionUID = 4073904386884677090L;
    private String prefix;
    private String uri;

    private XmlNode$Namespace() {
    }

    static /* synthetic */ String access$000(XmlNode$Namespace xmlNode$Namespace) {
        return xmlNode$Namespace.prefix;
    }

    static /* synthetic */ String access$100(XmlNode$Namespace xmlNode$Namespace) {
        return xmlNode$Namespace.uri;
    }

    static /* synthetic */ void access$200(XmlNode$Namespace xmlNode$Namespace, String string) {
        xmlNode$Namespace.setPrefix(string);
    }

    static XmlNode$Namespace create(String string) {
        XmlNode$Namespace xmlNode$Namespace = new XmlNode$Namespace();
        xmlNode$Namespace.uri = string;
        if (string == null || string.length() == 0) {
            xmlNode$Namespace.prefix = "";
        }
        return xmlNode$Namespace;
    }

    static XmlNode$Namespace create(String string, String string2) {
        if (string != null) {
            if (string2 != null) {
                XmlNode$Namespace xmlNode$Namespace = new XmlNode$Namespace();
                xmlNode$Namespace.prefix = string;
                xmlNode$Namespace.uri = string2;
                return xmlNode$Namespace;
            }
            throw new IllegalArgumentException("Namespace may not lack a URI");
        }
        throw new IllegalArgumentException("Empty string represents default namespace prefix");
    }

    private void setPrefix(String string) {
        if (string != null) {
            this.prefix = string;
            return;
        }
        throw new IllegalArgumentException();
    }

    String getPrefix() {
        return this.prefix;
    }

    String getUri() {
        return this.uri;
    }

    boolean is(XmlNode$Namespace xmlNode$Namespace) {
        String string;
        String string2 = this.prefix;
        boolean bl = string2 != null && (string = xmlNode$Namespace.prefix) != null && string2.equals(string) && this.uri.equals(xmlNode$Namespace.uri);
        return bl;
    }

    boolean isDefault() {
        String string = this.prefix;
        boolean bl = string != null && string.equals("");
        return bl;
    }

    boolean isEmpty() {
        String string = this.prefix;
        boolean bl = string != null && string.equals("") && this.uri.equals("");
        return bl;
    }

    boolean isGlobal() {
        String string = this.uri;
        boolean bl = string != null && string.equals("");
        return bl;
    }

    boolean isUnspecifiedPrefix() {
        boolean bl = this.prefix == null;
        return bl;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder;
        if (this.prefix == null) {
            stringBuilder = a.c("XmlNode.Namespace [");
            stringBuilder.append(this.uri);
            string = "]";
        } else {
            stringBuilder = a.c("XmlNode.Namespace [");
            stringBuilder.append(this.prefix);
            stringBuilder.append("{");
            stringBuilder.append(this.uri);
            string = "}]";
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

