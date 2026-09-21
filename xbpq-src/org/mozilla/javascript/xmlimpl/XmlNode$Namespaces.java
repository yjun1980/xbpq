/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;

class XmlNode$Namespaces {
    private Map<String, String> map = new HashMap<String, String>();
    private Map<String, String> uriToPrefix = new HashMap<String, String>();

    XmlNode$Namespaces() {
    }

    void declare(XmlNode$Namespace xmlNode$Namespace) {
        if (this.map.get(XmlNode$Namespace.access$000(xmlNode$Namespace)) == null) {
            this.map.put(XmlNode$Namespace.access$000(xmlNode$Namespace), XmlNode$Namespace.access$100(xmlNode$Namespace));
        }
        if (this.uriToPrefix.get(XmlNode$Namespace.access$100(xmlNode$Namespace)) == null) {
            this.uriToPrefix.put(XmlNode$Namespace.access$100(xmlNode$Namespace), XmlNode$Namespace.access$000(xmlNode$Namespace));
        }
    }

    XmlNode$Namespace getNamespace(String string) {
        if (this.map.get(string) == null) {
            return null;
        }
        return XmlNode$Namespace.create(string, this.map.get(string));
    }

    XmlNode$Namespace getNamespaceByUri(String string) {
        if (this.uriToPrefix.get(string) == null) {
            return null;
        }
        return XmlNode$Namespace.create(string, this.uriToPrefix.get(string));
    }

    XmlNode$Namespace[] getNamespaces() {
        ArrayList<XmlNode$Namespace> arrayList = new ArrayList<XmlNode$Namespace>();
        for (Map.Entry<String, String> entry : this.map.entrySet()) {
            XmlNode$Namespace object = XmlNode$Namespace.create(entry.getKey(), entry.getValue());
            if (object.isEmpty()) continue;
            arrayList.add(object);
        }
        return arrayList.toArray(new XmlNode$Namespace[arrayList.size()]);
    }
}

