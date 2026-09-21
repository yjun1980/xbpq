/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XmlNode;

class XmlNode$InternalList
implements Serializable {
    private static final long serialVersionUID = -3633151157292048978L;
    private List<XmlNode> list = new ArrayList<XmlNode>();

    XmlNode$InternalList() {
    }

    private void _add(XmlNode xmlNode) {
        this.list.add(xmlNode);
    }

    void add(XML xML) {
        this._add(xML.getAnnotation());
    }

    void add(XmlNode$InternalList xmlNode$InternalList) {
        for (int i2 = 0; i2 < xmlNode$InternalList.length(); ++i2) {
            this._add(xmlNode$InternalList.item(i2));
        }
    }

    void add(XmlNode$InternalList xmlNode$InternalList, int n2, int n3) {
        while (n2 < n3) {
            this._add(xmlNode$InternalList.item(n2));
            ++n2;
        }
    }

    void add(XmlNode xmlNode) {
        this._add(xmlNode);
    }

    /*
     * Enabled aggressive block sorting
     */
    void addToList(Object object) {
        if (object instanceof Undefined) {
            return;
        }
        if (object instanceof XMLList) {
            object = (XMLList)object;
            int n2 = 0;
            while (n2 < ((XMLList)object).length()) {
                this._add(((XMLList)object).item(n2).getAnnotation());
                ++n2;
            }
            return;
        }
        if (object instanceof XML) {
            object = ((XML)object).getAnnotation();
        } else {
            if (!(object instanceof XmlNode)) return;
            object = (XmlNode)object;
        }
        this._add((XmlNode)object);
    }

    XmlNode item(int n2) {
        return this.list.get(n2);
    }

    int length() {
        return this.list.size();
    }

    void remove(int n2) {
        this.list.remove(n2);
    }
}

