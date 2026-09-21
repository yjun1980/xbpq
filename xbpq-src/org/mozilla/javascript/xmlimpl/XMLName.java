/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XMLObjectImpl;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;
import org.mozilla.javascript.xmlimpl.XmlNode$QName;

class XMLName
extends Ref {
    static final long serialVersionUID = 3832176310755686977L;
    private boolean isAttributeName;
    private boolean isDescendants;
    private XmlNode$QName qname;
    private XMLObjectImpl xmlObject;

    private XMLName() {
    }

    static boolean accept(Object object) {
        try {
            object = ScriptRuntime.toString(object);
        }
        catch (EcmaError ecmaError) {
            if ("TypeError".equals(ecmaError.getName())) {
                return false;
            }
            throw ecmaError;
        }
        int n2 = ((String)object).length();
        if (n2 != 0 && XMLName.isNCNameStartChar(((String)object).charAt(0))) {
            for (int i2 = 1; i2 != n2; ++i2) {
                if (XMLName.isNCNameChar(((String)object).charAt(i2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private void addAttributes(XMLList xMLList, XML xML) {
        this.addMatchingAttributes(xMLList, xML);
    }

    private void addDescendantAttributes(XMLList xMLList, XML xMLArray) {
        if (xMLArray.isElement()) {
            this.addMatchingAttributes(xMLList, (XML)xMLArray);
            xMLArray = xMLArray.getChildren();
            for (int i2 = 0; i2 < xMLArray.length; ++i2) {
                this.addDescendantAttributes(xMLList, xMLArray[i2]);
            }
        }
    }

    private void addDescendantChildren(XMLList xMLList, XML xMLArray) {
        if (xMLArray.isElement()) {
            xMLArray = xMLArray.getChildren();
            for (int i2 = 0; i2 < xMLArray.length; ++i2) {
                if (this.matches(xMLArray[i2])) {
                    xMLList.addToList(xMLArray[i2]);
                }
                this.addDescendantChildren(xMLList, xMLArray[i2]);
            }
        }
    }

    static XMLName create(String object, String string) {
        if (string != null) {
            int n2 = string.length();
            if (n2 != 0) {
                char c2 = string.charAt(0);
                if (c2 == '*') {
                    if (n2 == 1) {
                        return XMLName.formStar();
                    }
                } else if (c2 == '@') {
                    object = XMLName.formProperty("", string.substring(1));
                    ((XMLName)object).setAttributeName();
                    return object;
                }
            }
            return XMLName.formProperty((String)object, string);
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    static XMLName create(XmlNode$QName xmlNode$QName) {
        return XMLName.create(xmlNode$QName, false, false);
    }

    static XMLName create(XmlNode$QName xmlNode$QName, boolean bl, boolean bl2) {
        XMLName xMLName = new XMLName();
        xMLName.qname = xmlNode$QName;
        xMLName.isAttributeName = bl;
        xMLName.isDescendants = bl2;
        return xMLName;
    }

    static XMLName formProperty(String string, String string2) {
        return XMLName.formProperty(XmlNode$Namespace.create(string), string2);
    }

    @Deprecated
    static XMLName formProperty(XmlNode$Namespace xmlNode$Namespace, String object) {
        String string = object;
        if (object != null) {
            string = object;
            if (((String)object).equals("*")) {
                string = null;
            }
        }
        object = new XMLName();
        ((XMLName)object).qname = XmlNode$QName.create(xmlNode$Namespace, string);
        return object;
    }

    static XMLName formStar() {
        XMLName xMLName = new XMLName();
        xMLName.qname = XmlNode$QName.create(null, null);
        return xMLName;
    }

    private static boolean isNCNameChar(int n2) {
        boolean bl;
        block23: {
            block22: {
                boolean bl2;
                block19: {
                    block21: {
                        block20: {
                            boolean bl3;
                            block16: {
                                block18: {
                                    block17: {
                                        boolean bl4 = false;
                                        bl = false;
                                        boolean bl5 = false;
                                        bl3 = false;
                                        bl2 = false;
                                        boolean bl6 = false;
                                        if ((n2 & 0xFFFFFF80) != 0) break block16;
                                        if (n2 >= 97) {
                                            bl = bl6;
                                            if (n2 <= 122) {
                                                bl = true;
                                            }
                                            return bl;
                                        }
                                        if (n2 >= 65) {
                                            if (n2 <= 90) {
                                                return true;
                                            }
                                            bl = bl4;
                                            if (n2 == 95) {
                                                bl = true;
                                            }
                                            return bl;
                                        }
                                        if (n2 >= 48) {
                                            if (n2 <= 57) {
                                                bl = true;
                                            }
                                            return bl;
                                        }
                                        if (n2 == 45) break block17;
                                        bl = bl5;
                                        if (n2 != 46) break block18;
                                    }
                                    bl = true;
                                }
                                return bl;
                            }
                            if ((n2 & 0xFFFFE000) != 0) break block19;
                            if (XMLName.isNCNameStartChar(n2) || n2 == 183) break block20;
                            bl = bl3;
                            if (768 > n2) break block21;
                            bl = bl3;
                            if (n2 > 879) break block21;
                        }
                        bl = true;
                    }
                    return bl;
                }
                if (XMLName.isNCNameStartChar(n2)) break block22;
                bl = bl2;
                if (8255 > n2) break block23;
                bl = bl2;
                if (n2 > 8256) break block23;
            }
            bl = true;
        }
        return bl;
    }

    private static boolean isNCNameStartChar(int n2) {
        boolean bl;
        block18: {
            block17: {
                boolean bl2;
                block14: {
                    block16: {
                        block15: {
                            boolean bl3;
                            block13: {
                                boolean bl4 = false;
                                bl3 = false;
                                bl2 = false;
                                bl = false;
                                if ((n2 & 0xFFFFFF80) != 0) break block13;
                                if (n2 >= 97) {
                                    if (n2 <= 122) {
                                        bl = true;
                                    }
                                    return bl;
                                }
                                if (n2 >= 65) {
                                    if (n2 <= 90) {
                                        return true;
                                    }
                                    bl = bl4;
                                    if (n2 == 95) {
                                        bl = true;
                                    }
                                    return bl;
                                }
                                break block14;
                            }
                            if ((n2 & 0xFFFFE000) != 0) break block14;
                            if (192 <= n2 && n2 <= 214 || 216 <= n2 && n2 <= 246 || 248 <= n2 && n2 <= 767 || 880 <= n2 && n2 <= 893) break block15;
                            bl = bl3;
                            if (895 > n2) break block16;
                        }
                        bl = true;
                    }
                    return bl;
                }
                if (8204 <= n2 && n2 <= 8205 || 8304 <= n2 && n2 <= 8591 || 11264 <= n2 && n2 <= 12271 || 12289 <= n2 && n2 <= 55295 || 63744 <= n2 && n2 <= 64975 || 65008 <= n2 && n2 <= 65533) break block17;
                bl = bl2;
                if (65536 > n2) break block18;
                bl = bl2;
                if (n2 > 983039) break block18;
            }
            bl = true;
        }
        return bl;
    }

    void addDescendants(XMLList xMLList, XML xML) {
        if (this.isAttributeName()) {
            this.matchDescendantAttributes(xMLList, xML);
        } else {
            this.matchDescendantChildren(xMLList, xML);
        }
    }

    void addMatches(XMLList xMLList, XML xML) {
        if (this.isDescendants()) {
            this.addDescendants(xMLList, xML);
        } else if (this.isAttributeName()) {
            this.addAttributes(xMLList, xML);
        } else {
            XML[] xMLArray = xML.getChildren();
            if (xMLArray != null) {
                for (int i2 = 0; i2 < xMLArray.length; ++i2) {
                    if (!this.matches(xMLArray[i2])) continue;
                    xMLList.addToList(xMLArray[i2]);
                }
            }
            xMLList.setTargets(xML, this.toQname());
        }
    }

    void addMatchingAttributes(XMLList xMLList, XML xMLArray) {
        if (xMLArray.isElement()) {
            xMLArray = xMLArray.getAttributes();
            for (int i2 = 0; i2 < xMLArray.length; ++i2) {
                if (!this.matches(xMLArray[i2])) continue;
                xMLList.addToList(xMLArray[i2]);
            }
        }
    }

    @Override
    public boolean delete(Context object) {
        object = this.xmlObject;
        if (object == null) {
            return true;
        }
        ((XMLObjectImpl)object).deleteXMLProperty(this);
        return this.xmlObject.hasXMLProperty(this) ^ true;
    }

    @Override
    public Object get(Context object) {
        object = this.xmlObject;
        if (object != null) {
            return ((XMLObjectImpl)object).getXMLProperty(this);
        }
        throw ScriptRuntime.undefReadError(Undefined.instance, this.toString());
    }

    XMLList getMyValueOn(XML xML) {
        XMLList xMLList = xML.newXMLList();
        this.addMatches(xMLList, xML);
        return xMLList;
    }

    @Override
    public boolean has(Context object) {
        object = this.xmlObject;
        if (object == null) {
            return false;
        }
        return ((XMLObjectImpl)object).hasXMLProperty(this);
    }

    void initXMLObject(XMLObjectImpl xMLObjectImpl) {
        if (xMLObjectImpl != null) {
            if (this.xmlObject == null) {
                this.xmlObject = xMLObjectImpl;
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }

    boolean isAttributeName() {
        return this.isAttributeName;
    }

    boolean isDescendants() {
        return this.isDescendants;
    }

    String localName() {
        if (this.qname.getLocalName() == null) {
            return "*";
        }
        return this.qname.getLocalName();
    }

    XMLList matchDescendantAttributes(XMLList xMLList, XML xML) {
        xMLList.setTargets(xML, null);
        this.addDescendantAttributes(xMLList, xML);
        return xMLList;
    }

    XMLList matchDescendantChildren(XMLList xMLList, XML xML) {
        xMLList.setTargets(xML, null);
        this.addDescendantChildren(xMLList, xML);
        return xMLList;
    }

    final boolean matches(XML xML) {
        XmlNode$QName xmlNode$QName = xML.getNodeQname();
        String string = xmlNode$QName.getNamespace() != null ? xmlNode$QName.getNamespace().getUri() : null;
        if (this.isAttributeName) {
            if (xML.isAttribute()) {
                return !(this.uri() != null && !this.uri().equals(string) || !this.localName().equals("*") && !this.localName().equals(xmlNode$QName.getLocalName()));
                {
                }
            }
            return false;
        }
        if (this.uri() == null || xML.isElement() && this.uri().equals(string)) {
            if (this.localName().equals("*")) {
                return true;
            }
            if (xML.isElement() && this.localName().equals(xmlNode$QName.getLocalName())) {
                return true;
            }
        }
        return false;
    }

    final boolean matchesElement(XmlNode$QName xmlNode$QName) {
        return !(this.uri() != null && !this.uri().equals(xmlNode$QName.getNamespace().getUri()) || !this.localName().equals("*") && !this.localName().equals(xmlNode$QName.getLocalName()));
        {
        }
    }

    final boolean matchesLocalName(String string) {
        boolean bl = this.localName().equals("*") || this.localName().equals(string);
        return bl;
    }

    @Override
    public Object set(Context object, Object object2) {
        object = this.xmlObject;
        if (object != null) {
            if (!this.isDescendants) {
                ((XMLObjectImpl)object).putXMLProperty(this, object2);
                return object2;
            }
            throw Kit.codeBug();
        }
        throw ScriptRuntime.undefWriteError(Undefined.instance, this.toString(), object2);
    }

    void setAttributeName() {
        this.isAttributeName = true;
    }

    @Deprecated
    void setIsDescendants() {
        this.isDescendants = true;
    }

    void setMyValueOn(XML xML, Object object) {
        Object object2;
        if (object == null) {
            object2 = "null";
        } else {
            object2 = object;
            if (object instanceof Undefined) {
                object2 = "undefined";
            }
        }
        if (this.isAttributeName()) {
            xML.setAttribute(this, object2);
        } else if (this.uri() == null && this.localName().equals("*")) {
            xML.setChildren(object2);
        } else {
            int n2;
            if (object2 instanceof XMLObjectImpl) {
                object = object2 = (XMLObjectImpl)object2;
                if (object2 instanceof XML) {
                    object = object2;
                    if (((XML)object2).isAttribute()) {
                        object = xML.makeXmlFromString(this, ((XMLObjectImpl)object2).toString());
                    }
                }
                object2 = object;
                if (object instanceof XMLList) {
                    n2 = 0;
                    while (true) {
                        object2 = object;
                        if (n2 < ((XMLObjectImpl)object).length()) {
                            object2 = (XMLList)object;
                            XML xML2 = ((XMLList)object2).item(n2);
                            if (xML2.isAttribute()) {
                                ((XMLList)object2).replace(n2, xML.makeXmlFromString(this, xML2.toString()));
                            }
                            ++n2;
                            continue;
                        }
                        break;
                    }
                }
            } else {
                object2 = xML.makeXmlFromString(this, ScriptRuntime.toString(object2));
            }
            if (((XMLList)(object = xML.getPropertyList(this))).length() == 0) {
                xML.appendChild(object2);
            } else {
                for (n2 = 1; n2 < ((XMLList)object).length(); ++n2) {
                    xML.removeChild(((XMLList)object).item(n2).childIndex());
                }
                xML.replace(((XMLList)object).item(0).childIndex(), object2);
            }
        }
    }

    final XmlNode$QName toQname() {
        return this.qname;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.isDescendants) {
            stringBuilder.append("..");
        }
        if (this.isAttributeName) {
            stringBuilder.append('@');
        }
        if (this.uri() == null) {
            stringBuilder.append('*');
            if (this.localName().equals("*")) {
                return stringBuilder.toString();
            }
        } else {
            stringBuilder.append('\"');
            stringBuilder.append(this.uri());
            stringBuilder.append('\"');
        }
        stringBuilder.append(':');
        stringBuilder.append(this.localName());
        return stringBuilder.toString();
    }

    String uri() {
        if (this.qname.getNamespace() == null) {
            return null;
        }
        return this.qname.getNamespace().getUri();
    }
}

