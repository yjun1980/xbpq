/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import com.github.catvod.spider.merge.C.a;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XMLObjectImpl;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlNode$Filter;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;
import org.mozilla.javascript.xmlimpl.XmlNode$QName;
import org.w3c.dom.Node;

class XML
extends XMLObjectImpl {
    static final long serialVersionUID = -630969919086449092L;
    private XmlNode node;

    XML(XMLLibImpl xMLLibImpl, Scriptable scriptable, XMLObject xMLObject, XmlNode xmlNode) {
        super(xMLLibImpl, scriptable, xMLObject);
        this.initialize(xmlNode);
    }

    private XmlNode$Namespace adapt(Namespace namespace) {
        if (namespace.prefix() == null) {
            return XmlNode$Namespace.create(namespace.uri());
        }
        return XmlNode$Namespace.create(namespace.prefix(), namespace.uri());
    }

    private void addInScopeNamespace(Namespace namespace) {
        if (!this.isElement()) {
            return;
        }
        if (namespace.prefix() != null) {
            if (namespace.prefix().length() == 0 && namespace.uri().length() == 0) {
                return;
            }
            if (this.node.getQname().getNamespace().getPrefix().equals(namespace.prefix())) {
                this.node.invalidateNamespacePrefix();
            }
            this.node.declareNamespace(namespace.prefix(), namespace.uri());
        }
    }

    private String ecmaToString() {
        if (!this.isAttribute() && !this.isText()) {
            if (this.hasSimpleContent()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i2 = 0; i2 < this.node.getChildCount(); ++i2) {
                    XmlNode xmlNode = this.node.getChild(i2);
                    if (xmlNode.isProcessingInstructionType() || xmlNode.isCommentType()) continue;
                    stringBuilder.append(new XML(this.getLib(), this.getParentScope(), (XMLObject)this.getPrototype(), xmlNode).toString());
                }
                return stringBuilder.toString();
            }
            return this.toXMLString();
        }
        return this.ecmaValue();
    }

    private String ecmaValue() {
        return this.node.ecmaValue();
    }

    private int getChildIndexOf(XML xML) {
        for (int i2 = 0; i2 < this.node.getChildCount(); ++i2) {
            if (!this.node.getChild(i2).isSameNode(xML.node)) continue;
            return i2;
        }
        return -1;
    }

    private XmlNode[] getNodesForInsert(Object object) {
        boolean bl = object instanceof XML;
        if (bl) {
            return new XmlNode[]{((XML)object).node};
        }
        if (object instanceof XMLList) {
            object = (XMLList)object;
            XmlNode[] xmlNodeArray = new XmlNode[((XMLList)object).length()];
            for (int i2 = 0; i2 < ((XMLList)object).length(); ++i2) {
                xmlNodeArray[i2] = ((XMLList)object).item((int)i2).node;
            }
            return xmlNodeArray;
        }
        return new XmlNode[]{XmlNode.createText(this.getProcessor(), ScriptRuntime.toString(object))};
    }

    private XML toXML(XmlNode xmlNode) {
        if (xmlNode.getXml() == null) {
            xmlNode.setXml(this.newXML(xmlNode));
        }
        return xmlNode.getXml();
    }

    @Override
    void addMatches(XMLList xMLList, XMLName xMLName) {
        xMLName.addMatches(xMLList, this);
    }

    XML addNamespace(Namespace namespace) {
        this.addInScopeNamespace(namespace);
        return this;
    }

    XML appendChild(Object xmlNodeArray) {
        if (this.node.isParentType()) {
            xmlNodeArray = this.getNodesForInsert(xmlNodeArray);
            XmlNode xmlNode = this.node;
            xmlNode.insertChildrenAt(xmlNode.getChildCount(), xmlNodeArray);
        }
        return this;
    }

    @Override
    XMLList child(int n2) {
        XMLList xMLList = this.newXMLList();
        xMLList.setTargets(this, null);
        if (n2 >= 0 && n2 < this.node.getChildCount()) {
            xMLList.addToList(this.getXmlChild(n2));
        }
        return xMLList;
    }

    @Override
    XMLList child(XMLName xMLName) {
        XMLList xMLList = this.newXMLList();
        XmlNode[] xmlNodeArray = this.node.getMatchingChildren(XmlNode$Filter.ELEMENT);
        for (int i2 = 0; i2 < xmlNodeArray.length; ++i2) {
            if (!xMLName.matchesElement(xmlNodeArray[i2].getQname())) continue;
            xMLList.addToList(this.toXML(xmlNodeArray[i2]));
        }
        xMLList.setTargets(this, xMLName.toQname());
        return xMLList;
    }

    int childIndex() {
        return this.node.getChildIndex();
    }

    @Override
    XMLList children() {
        XMLList xMLList = this.newXMLList();
        xMLList.setTargets(this, XMLName.formStar().toQname());
        XmlNode[] xmlNodeArray = this.node.getMatchingChildren(XmlNode$Filter.TRUE);
        for (int i2 = 0; i2 < xmlNodeArray.length; ++i2) {
            xMLList.addToList(this.toXML(xmlNodeArray[i2]));
        }
        return xMLList;
    }

    @Override
    XMLList comments() {
        XMLList xMLList = this.newXMLList();
        this.node.addMatchingChildren(xMLList, XmlNode$Filter.COMMENT);
        return xMLList;
    }

    @Override
    boolean contains(Object object) {
        if (object instanceof XML) {
            return this.equivalentXml(object);
        }
        return false;
    }

    @Override
    XMLObjectImpl copy() {
        return this.newXML(this.node.copy());
    }

    @Override
    public void delete(int n2) {
        if (n2 == 0) {
            this.remove();
        }
    }

    @Override
    void deleteXMLProperty(XMLName serializable) {
        serializable = this.getPropertyList((XMLName)serializable);
        for (int i2 = 0; i2 < ((XMLList)serializable).length(); ++i2) {
            ((XMLList)serializable).item((int)i2).node.deleteMe();
        }
    }

    final String ecmaClass() {
        if (this.node.isTextType()) {
            return "text";
        }
        if (this.node.isAttributeType()) {
            return "attribute";
        }
        if (this.node.isCommentType()) {
            return "comment";
        }
        if (this.node.isProcessingInstructionType()) {
            return "processing-instruction";
        }
        if (this.node.isElementType()) {
            return "element";
        }
        StringBuilder stringBuilder = a.c("Unrecognized type: ");
        stringBuilder.append(this.node);
        throw new RuntimeException(stringBuilder.toString());
    }

    @Override
    XMLList elements(XMLName xMLName) {
        XMLList xMLList = this.newXMLList();
        xMLList.setTargets(this, xMLName.toQname());
        XmlNode[] xmlNodeArray = this.node.getMatchingChildren(XmlNode$Filter.ELEMENT);
        for (int i2 = 0; i2 < xmlNodeArray.length; ++i2) {
            if (!xMLName.matches(this.toXML(xmlNodeArray[i2]))) continue;
            xMLList.addToList(this.toXML(xmlNodeArray[i2]));
        }
        return xMLList;
    }

    @Override
    boolean equivalentXml(Object object) {
        if (object instanceof XML) {
            return this.node.toXmlString(this.getProcessor()).equals(((XML)object).node.toXmlString(this.getProcessor()));
        }
        boolean bl = object instanceof XMLList;
        boolean bl2 = false;
        if (bl) {
            if (((XMLList)(object = (XMLList)object)).length() == 1) {
                bl2 = this.equivalentXml(((XMLList)object).getXML());
            }
        } else if (this.hasSimpleContent()) {
            object = ScriptRuntime.toString(object);
            bl2 = this.toString().equals(object);
        }
        return bl2;
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        if (n2 == 0) {
            return this;
        }
        return Scriptable.NOT_FOUND;
    }

    XmlNode getAnnotation() {
        return this.node;
    }

    XML[] getAttributes() {
        XmlNode[] xmlNodeArray = this.node.getAttributes();
        int n2 = xmlNodeArray.length;
        XML[] xMLArray = new XML[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            xMLArray[i2] = this.toXML(xmlNodeArray[i2]);
        }
        return xMLArray;
    }

    XML[] getChildren() {
        if (!this.isElement()) {
            return null;
        }
        XmlNode[] xmlNodeArray = this.node.getMatchingChildren(XmlNode$Filter.TRUE);
        int n2 = xmlNodeArray.length;
        XML[] xMLArray = new XML[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            xMLArray[i2] = this.toXML(xmlNodeArray[i2]);
        }
        return xMLArray;
    }

    @Override
    public String getClassName() {
        return "XML";
    }

    @Override
    public Scriptable getExtraMethodSource(Context context) {
        if (this.hasSimpleContent()) {
            return ScriptRuntime.toObjectOrNull(context, this.toString());
        }
        return null;
    }

    @Override
    public Object[] getIds() {
        if (this.isPrototype()) {
            return new Object[0];
        }
        return new Object[]{0};
    }

    XML getLastXmlChild() {
        int n2 = this.node.getChildCount() - 1;
        if (n2 < 0) {
            return null;
        }
        return this.getXmlChild(n2);
    }

    XmlNode$QName getNodeQname() {
        return this.node.getQname();
    }

    XMLList getPropertyList(XMLName xMLName) {
        return xMLName.getMyValueOn(this);
    }

    @Override
    final XML getXML() {
        return this;
    }

    @Override
    Object getXMLProperty(XMLName xMLName) {
        return this.getPropertyList(xMLName);
    }

    XML getXmlChild(int n2) {
        XmlNode xmlNode = this.node.getChild(n2);
        if (xmlNode.getXml() == null) {
            xmlNode.setXml(this.newXML(xmlNode));
        }
        return xmlNode.getXml();
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        boolean bl = n2 == 0;
        return bl;
    }

    @Override
    boolean hasComplexContent() {
        return this.hasSimpleContent() ^ true;
    }

    @Override
    boolean hasOwnProperty(XMLName xMLName) {
        boolean bl;
        block0: {
            boolean bl2 = this.isPrototype();
            bl = true;
            if (bl2 ? this.findPrototypeId(xMLName.localName()) != 0 : this.getPropertyList(xMLName).length() > 0) break block0;
            bl = false;
        }
        return bl;
    }

    @Override
    boolean hasSimpleContent() {
        if (!this.isComment() && !this.isProcessingInstruction()) {
            if (!this.isText() && !this.node.isAttributeType()) {
                return this.node.hasChildElement() ^ true;
            }
            return true;
        }
        return false;
    }

    @Override
    boolean hasXMLProperty(XMLName xMLName) {
        boolean bl = this.getPropertyList(xMLName).length() > 0;
        return bl;
    }

    Namespace[] inScopeNamespaces() {
        return this.createNamespaces(this.node.getInScopeNamespaces());
    }

    void initialize(XmlNode xmlNode) {
        this.node = xmlNode;
        xmlNode.setXml(this);
    }

    XML insertChildAfter(XML xML, Object xmlNodeArray) {
        if (xML == null) {
            this.prependChild(xmlNodeArray);
        } else {
            xmlNodeArray = this.getNodesForInsert(xmlNodeArray);
            int n2 = this.getChildIndexOf(xML);
            if (n2 != -1) {
                this.node.insertChildrenAt(n2 + 1, xmlNodeArray);
            }
        }
        return this;
    }

    XML insertChildBefore(XML xML, Object xmlNodeArray) {
        if (xML == null) {
            this.appendChild(xmlNodeArray);
        } else {
            xmlNodeArray = this.getNodesForInsert(xmlNodeArray);
            int n2 = this.getChildIndexOf(xML);
            if (n2 != -1) {
                this.node.insertChildrenAt(n2, xmlNodeArray);
            }
        }
        return this;
    }

    boolean is(XML xML) {
        return this.node.isSameNode(xML.node);
    }

    final boolean isAttribute() {
        return this.node.isAttributeType();
    }

    final boolean isComment() {
        return this.node.isCommentType();
    }

    final boolean isElement() {
        return this.node.isElementType();
    }

    final boolean isProcessingInstruction() {
        return this.node.isProcessingInstructionType();
    }

    final boolean isText() {
        return this.node.isTextType();
    }

    @Override
    protected Object jsConstructor(Context object, boolean bl, Object[] object2) {
        block5: {
            block4: {
                if (((Object[])object2).length == 0 || object2[0] == null) break block4;
                object = object2;
                if (object2[0] != Undefined.instance) break block5;
            }
            object = new Object[]{""};
        }
        object2 = this.ecmaToXml(object[0]);
        object = object2;
        if (bl) {
            object = ((XML)object2).copy();
        }
        return object;
    }

    @Override
    int length() {
        return 1;
    }

    String localName() {
        if (this.name() == null) {
            return null;
        }
        return this.name().localName();
    }

    XML makeXmlFromString(XMLName serializable, String string) {
        try {
            serializable = this.newTextElementXML(this.node, serializable.toQname(), string);
            return serializable;
        }
        catch (Exception exception) {
            throw ScriptRuntime.typeError(exception.getMessage());
        }
    }

    QName name() {
        if (!this.isText() && !this.isComment()) {
            if (this.isProcessingInstruction()) {
                return this.newQName("", this.node.getQname().getLocalName(), null);
            }
            return this.newQName(this.node.getQname());
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    Namespace namespace(String object) {
        if (object == null) {
            object = this.node.getNamespaceDeclaration();
            return this.createNamespace((XmlNode$Namespace)object);
        }
        object = this.node.getNamespaceDeclaration((String)object);
        return this.createNamespace((XmlNode$Namespace)object);
    }

    Namespace[] namespaceDeclarations() {
        return this.createNamespaces(this.node.getNamespaceDeclarations());
    }

    Object nodeKind() {
        return this.ecmaClass();
    }

    @Override
    void normalize() {
        this.node.normalize();
    }

    @Override
    Object parent() {
        if (this.node.parent() == null) {
            return null;
        }
        return this.newXML(this.node.parent());
    }

    XML prependChild(Object object) {
        if (this.node.isParentType()) {
            this.node.insertChildrenAt(0, this.getNodesForInsert(object));
        }
        return this;
    }

    @Override
    XMLList processingInstructions(XMLName xMLName) {
        XMLList xMLList = this.newXMLList();
        this.node.addMatchingChildren(xMLList, XmlNode$Filter.PROCESSING_INSTRUCTION(xMLName));
        return xMLList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    boolean propertyIsEnumerable(Object object) {
        boolean bl = object instanceof Integer;
        boolean bl2 = true;
        if (bl) {
            if ((Integer)object != 0) return false;
            return bl2;
        } else {
            if (!(object instanceof Number)) return ScriptRuntime.toString(object).equals("0");
            double d2 = ((Number)object).doubleValue();
            if (d2 != 0.0) return false;
            if (!(1.0 / d2 > 0.0)) return false;
        }
        return bl2;
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        throw ScriptRuntime.typeError("Assignment to indexed XML is not allowed");
    }

    @Override
    void putXMLProperty(XMLName xMLName, Object object) {
        if (!this.isPrototype()) {
            xMLName.setMyValueOn(this, object);
        }
    }

    void remove() {
        this.node.deleteMe();
    }

    void removeChild(int n2) {
        this.node.removeChild(n2);
    }

    XML removeNamespace(Namespace namespace) {
        if (!this.isElement()) {
            return this;
        }
        this.node.removeNamespace(this.adapt(namespace));
        return this;
    }

    XML replace(int n2, Object object) {
        XMLList xMLList = this.child(n2);
        if (xMLList.length() > 0) {
            this.insertChildAfter(xMLList.item(0), object);
            this.removeChild(n2);
        }
        return this;
    }

    XML replace(XMLName xMLName, Object object) {
        this.putXMLProperty(xMLName, object);
        return this;
    }

    void replaceWith(XML xML) {
        if (this.node.parent() != null) {
            this.node.replaceWith(xML.node);
        } else {
            this.initialize(xML.node);
        }
    }

    void setAttribute(XMLName xMLName, Object object) {
        if (this.isElement()) {
            if (xMLName.uri() == null && xMLName.localName().equals("*")) {
                throw ScriptRuntime.typeError("@* assignment not supported.");
            }
            this.node.setAttribute(xMLName.toQname(), ScriptRuntime.toString(object));
            return;
        }
        throw new IllegalStateException("Can only set attributes on elements.");
    }

    XML setChildren(Object xmlNodeArray) {
        if (!this.isElement()) {
            return this;
        }
        while (this.node.getChildCount() > 0) {
            this.node.removeChild(0);
        }
        xmlNodeArray = this.getNodesForInsert(xmlNodeArray);
        this.node.insertChildrenAt(0, xmlNodeArray);
        return this;
    }

    void setLocalName(String string) {
        if (!this.isText() && !this.isComment()) {
            this.node.setLocalName(string);
        }
    }

    void setName(QName qName) {
        if (!this.isText() && !this.isComment()) {
            if (this.isProcessingInstruction()) {
                this.node.setLocalName(qName.localName());
                return;
            }
            this.node.renameNode(qName.getDelegate());
        }
    }

    void setNamespace(Namespace namespace) {
        if (!(this.isText() || this.isComment() || this.isProcessingInstruction())) {
            this.setName(this.newQName(namespace.uri(), this.localName(), namespace.prefix()));
        }
    }

    @Override
    XMLList text() {
        XMLList xMLList = this.newXMLList();
        this.node.addMatchingChildren(xMLList, XmlNode$Filter.TEXT);
        return xMLList;
    }

    Node toDomNode() {
        return this.node.toDomNode();
    }

    @Override
    String toSource(int n2) {
        return this.toXMLString();
    }

    @Override
    public String toString() {
        return this.ecmaToString();
    }

    @Override
    String toXMLString() {
        return this.node.ecmaToXMLString(this.getProcessor());
    }

    @Override
    Object valueOf() {
        return this;
    }
}

