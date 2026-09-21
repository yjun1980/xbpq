/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import com.github.catvod.spider.merge.C.a;
import java.io.Serializable;
import java.util.ArrayList;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XmlNode$Filter;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespaces;
import org.mozilla.javascript.xmlimpl.XmlNode$QName;
import org.mozilla.javascript.xmlimpl.XmlNode$XmlNodeUserDataHandler;
import org.mozilla.javascript.xmlimpl.XmlProcessor;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

class XmlNode
implements Serializable {
    private static final boolean DOM_LEVEL_3 = true;
    private static final String USER_DATA_XMLNODE_KEY = XmlNode.class.getName();
    private static final String XML_NAMESPACES_NAMESPACE_URI = "http://www.w3.org/2000/xmlns/";
    private static final long serialVersionUID = 1L;
    private Node dom;
    private UserDataHandler events = new XmlNode$XmlNodeUserDataHandler();
    private XML xml;

    private XmlNode() {
    }

    private void addNamespaces(XmlNode$Namespaces xmlNode$Namespaces, Element node) {
        if (node != null) {
            Object object;
            String string = this.toUri(node.lookupNamespaceURI(null));
            if (!string.equals(object = node.getParentNode() != null ? this.toUri(node.getParentNode().lookupNamespaceURI(null)) : "") || !(node.getParentNode() instanceof Element)) {
                xmlNode$Namespaces.declare(XmlNode$Namespace.create("", string));
            }
            object = node.getAttributes();
            for (int i2 = 0; i2 < object.getLength(); ++i2) {
                node = (Attr)object.item(i2);
                if (node.getPrefix() == null || !node.getPrefix().equals("xmlns")) continue;
                xmlNode$Namespaces.declare(XmlNode$Namespace.create(node.getLocalName(), node.getValue()));
            }
            return;
        }
        throw new RuntimeException("element must not be null");
    }

    private static XmlNode copy(XmlNode xmlNode) {
        return XmlNode.createImpl(xmlNode.dom.cloneNode(true));
    }

    static XmlNode createElement(XmlProcessor xmlProcessor, String string, String string2) {
        return XmlNode.createImpl(xmlProcessor.toXml(string, string2));
    }

    static XmlNode createElementFromNode(Node node) {
        Node node2 = node;
        if (node instanceof Document) {
            node2 = ((Document)node).getDocumentElement();
        }
        return XmlNode.createImpl(node2);
    }

    static XmlNode createEmpty(XmlProcessor xmlProcessor) {
        return XmlNode.createText(xmlProcessor, "");
    }

    private static XmlNode createImpl(Node object) {
        if (!(object instanceof Document)) {
            if (XmlNode.getUserData((Node)object) == null) {
                XmlNode xmlNode = new XmlNode();
                xmlNode.dom = object;
                XmlNode.setUserData((Node)object, xmlNode);
                object = xmlNode;
            } else {
                object = XmlNode.getUserData((Node)object);
            }
            return object;
        }
        throw new IllegalArgumentException();
    }

    static XmlNode createText(XmlProcessor xmlProcessor, String string) {
        return XmlNode.createImpl(xmlProcessor.newDocument().createTextNode(string));
    }

    private void declareNamespace(Element element, String string, String string2) {
        if (string.length() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("xmlns:");
            stringBuilder.append(string);
            element.setAttributeNS(XML_NAMESPACES_NAMESPACE_URI, stringBuilder.toString(), string2);
        } else {
            element.setAttribute("xmlns", string2);
        }
    }

    private XmlNode$Namespaces getAllNamespaces() {
        Node node;
        XmlNode$Namespaces xmlNode$Namespaces = new XmlNode$Namespaces();
        Node node2 = node = this.dom;
        if (node instanceof Attr) {
            node2 = ((Attr)node).getOwnerElement();
        }
        while (node2 != null) {
            if (node2 instanceof Element) {
                this.addNamespaces(xmlNode$Namespaces, (Element)node2);
            }
            node2 = node2.getParentNode();
        }
        xmlNode$Namespaces.declare(XmlNode$Namespace.create("", ""));
        return xmlNode$Namespaces;
    }

    private XmlNode$Namespace getDefaultNamespace() {
        String string = this.dom.lookupNamespaceURI(null) == null ? "" : this.dom.lookupNamespaceURI(null);
        return XmlNode$Namespace.create("", string);
    }

    private String getExistingPrefixFor(XmlNode$Namespace xmlNode$Namespace) {
        if (this.getDefaultNamespace().getUri().equals(xmlNode$Namespace.getUri())) {
            return "";
        }
        return this.dom.lookupPrefix(xmlNode$Namespace.getUri());
    }

    private XmlNode$Namespace getNodeNamespace() {
        String string = this.dom.getNamespaceURI();
        String string2 = this.dom.getPrefix();
        String string3 = string;
        if (string == null) {
            string3 = "";
        }
        string = string2;
        if (string2 == null) {
            string = "";
        }
        return XmlNode$Namespace.create(string, string3);
    }

    private static XmlNode getUserData(Node node) {
        return (XmlNode)node.getUserData(USER_DATA_XMLNODE_KEY);
    }

    static XmlNode newElementWithText(XmlProcessor object, XmlNode object2, XmlNode$QName object3, String string) {
        if (!(object2 instanceof Document)) {
            object = object2 != null ? ((XmlNode)object2).dom.getOwnerDocument() : ((XmlProcessor)object).newDocument();
            String string2 = null;
            object2 = object2 != null ? ((XmlNode)object2).dom : null;
            XmlNode$Namespace xmlNode$Namespace = ((XmlNode$QName)object3).getNamespace();
            if (xmlNode$Namespace != null && xmlNode$Namespace.getUri().length() != 0) {
                string2 = xmlNode$Namespace.getUri();
                object2 = ((XmlNode$QName)object3).qualify((Node)object2);
                object3 = string2;
            } else {
                object2 = ((XmlNode$QName)object3).getLocalName();
                object3 = string2;
            }
            object2 = object.createElementNS((String)object3, (String)object2);
            if (string != null) {
                object2.appendChild(object.createTextNode(string));
            }
            return XmlNode.createImpl((Node)object2);
        }
        throw new IllegalArgumentException("Cannot use Document node as reference");
    }

    private void setProcessingInstructionName(String string) {
        ProcessingInstruction processingInstruction = (ProcessingInstruction)this.dom;
        processingInstruction.getParentNode().replaceChild(processingInstruction, processingInstruction.getOwnerDocument().createProcessingInstruction(string, processingInstruction.getData()));
    }

    private static void setUserData(Node node, XmlNode xmlNode) {
        node.setUserData(USER_DATA_XMLNODE_KEY, xmlNode, xmlNode.events);
    }

    private String toUri(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    void addMatchingChildren(XMLList xMLList, XmlNode$Filter xmlNode$Filter) {
        NodeList nodeList = this.dom.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            XmlNode xmlNode = XmlNode.createImpl(node);
            if (!xmlNode$Filter.accept(node)) continue;
            xMLList.addToList(xmlNode);
        }
    }

    final XmlNode copy() {
        return XmlNode.copy(this);
    }

    String debug() {
        XmlProcessor xmlProcessor = new XmlProcessor();
        xmlProcessor.setIgnoreComments(false);
        xmlProcessor.setIgnoreProcessingInstructions(false);
        xmlProcessor.setIgnoreWhitespace(false);
        xmlProcessor.setPrettyPrinting(false);
        return xmlProcessor.ecmaToXmlString(this.dom);
    }

    void declareNamespace(String string, String string2) {
        Node node = this.dom;
        if (node instanceof Element) {
            if (node.lookupNamespaceURI(string2) == null || !this.dom.lookupNamespaceURI(string2).equals(string)) {
                this.declareNamespace((Element)this.dom, string, string2);
            }
            return;
        }
        throw new IllegalStateException();
    }

    void deleteMe() {
        Node node = this.dom;
        if (node instanceof Attr) {
            node = (Attr)node;
            node.getOwnerElement().getAttributes().removeNamedItemNS(node.getNamespaceURI(), node.getLocalName());
        } else if (node.getParentNode() != null) {
            this.dom.getParentNode().removeChild(this.dom);
        }
    }

    String ecmaToXMLString(XmlProcessor xmlProcessor) {
        if (this.isElementType()) {
            Element element = (Element)this.dom.cloneNode(true);
            XmlNode$Namespace[] xmlNode$NamespaceArray = this.getInScopeNamespaces();
            for (int i2 = 0; i2 < xmlNode$NamespaceArray.length; ++i2) {
                this.declareNamespace(element, xmlNode$NamespaceArray[i2].getPrefix(), xmlNode$NamespaceArray[i2].getUri());
            }
            return xmlProcessor.ecmaToXmlString(element);
        }
        return xmlProcessor.ecmaToXmlString(this.dom);
    }

    String ecmaValue() {
        if (this.isTextType()) {
            return ((Text)this.dom).getData();
        }
        if (this.isAttributeType()) {
            return ((Attr)this.dom).getValue();
        }
        if (this.isProcessingInstructionType()) {
            return ((ProcessingInstruction)this.dom).getData();
        }
        if (this.isCommentType()) {
            return ((Comment)this.dom).getNodeValue();
        }
        if (this.isElementType()) {
            throw new RuntimeException("Unimplemented ecmaValue() for elements.");
        }
        StringBuilder stringBuilder = a.c("Unimplemented for node ");
        stringBuilder.append(this.dom);
        throw new RuntimeException(stringBuilder.toString());
    }

    String getAttributeValue() {
        return ((Attr)this.dom).getValue();
    }

    XmlNode[] getAttributes() {
        NamedNodeMap namedNodeMap = this.dom.getAttributes();
        if (namedNodeMap != null) {
            XmlNode[] xmlNodeArray = new XmlNode[namedNodeMap.getLength()];
            for (int i2 = 0; i2 < namedNodeMap.getLength(); ++i2) {
                xmlNodeArray[i2] = XmlNode.createImpl(namedNodeMap.item(i2));
            }
            return xmlNodeArray;
        }
        throw new IllegalStateException("Must be element.");
    }

    XmlNode getChild(int n2) {
        return XmlNode.createImpl(this.dom.getChildNodes().item(n2));
    }

    int getChildCount() {
        return this.dom.getChildNodes().getLength();
    }

    int getChildIndex() {
        if (this.isAttributeType()) {
            return -1;
        }
        if (this.parent() == null) {
            return -1;
        }
        NodeList nodeList = this.dom.getParentNode().getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            if (nodeList.item(i2) != this.dom) continue;
            return i2;
        }
        throw new RuntimeException("Unreachable.");
    }

    XmlNode$Namespace[] getInScopeNamespaces() {
        return this.getAllNamespaces().getNamespaces();
    }

    XmlNode[] getMatchingChildren(XmlNode$Filter xmlNode$Filter) {
        ArrayList<XmlNode> arrayList = new ArrayList<XmlNode>();
        NodeList nodeList = this.dom.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (!xmlNode$Filter.accept(node)) continue;
            arrayList.add(XmlNode.createImpl(node));
        }
        return arrayList.toArray(new XmlNode[arrayList.size()]);
    }

    XmlNode$Namespace getNamespace() {
        return this.getNodeNamespace();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    XmlNode$Namespace getNamespaceDeclaration() {
        String string;
        if (this.dom.getPrefix() == null) {
            string = "";
            return this.getNamespaceDeclaration(string);
        }
        string = this.dom.getPrefix();
        return this.getNamespaceDeclaration(string);
    }

    XmlNode$Namespace getNamespaceDeclaration(String string) {
        if (string.equals("") && this.dom instanceof Attr) {
            return XmlNode$Namespace.create("", "");
        }
        return this.getAllNamespaces().getNamespace(string);
    }

    XmlNode$Namespace[] getNamespaceDeclarations() {
        if (this.dom instanceof Element) {
            XmlNode$Namespaces xmlNode$Namespaces = new XmlNode$Namespaces();
            this.addNamespaces(xmlNode$Namespaces, (Element)this.dom);
            return xmlNode$Namespaces.getNamespaces();
        }
        return new XmlNode$Namespace[0];
    }

    final XmlNode$QName getQname() {
        String string = this.dom.getNamespaceURI();
        String string2 = "";
        string = string == null ? "" : this.dom.getNamespaceURI();
        if (this.dom.getPrefix() != null) {
            string2 = this.dom.getPrefix();
        }
        return XmlNode$QName.create(string, this.dom.getLocalName(), string2);
    }

    XML getXml() {
        return this.xml;
    }

    boolean hasChildElement() {
        NodeList nodeList = this.dom.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            if (nodeList.item(i2).getNodeType() != 1) continue;
            return true;
        }
        return false;
    }

    void insertChildAt(int n2, XmlNode object) {
        Node node = this.dom;
        object = node.getOwnerDocument().importNode(((XmlNode)object).dom, true);
        if (node.getChildNodes().getLength() >= n2) {
            if (node.getChildNodes().getLength() == n2) {
                node.appendChild((Node)object);
            } else {
                node.insertBefore((Node)object, node.getChildNodes().item(n2));
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("index=");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(" length=");
        ((StringBuilder)object).append(node.getChildNodes().getLength());
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    void insertChildrenAt(int n2, XmlNode[] xmlNodeArray) {
        for (int i2 = 0; i2 < xmlNodeArray.length; ++i2) {
            this.insertChildAt(n2 + i2, xmlNodeArray[i2]);
        }
    }

    void invalidateNamespacePrefix() {
        Object object = this.dom;
        if (object instanceof Element) {
            object = object.getPrefix();
            this.renameNode(XmlNode$QName.create(this.dom.getNamespaceURI(), this.dom.getLocalName(), null));
            NamedNodeMap namedNodeMap = this.dom.getAttributes();
            for (int i2 = 0; i2 < namedNodeMap.getLength(); ++i2) {
                if (!namedNodeMap.item(i2).getPrefix().equals(object)) continue;
                XmlNode.createImpl(namedNodeMap.item(i2)).renameNode(XmlNode$QName.create(namedNodeMap.item(i2).getNamespaceURI(), namedNodeMap.item(i2).getLocalName(), null));
            }
            return;
        }
        throw new IllegalStateException();
    }

    final boolean isAttributeType() {
        boolean bl = this.dom.getNodeType() == 2;
        return bl;
    }

    final boolean isCommentType() {
        boolean bl = this.dom.getNodeType() == 8;
        return bl;
    }

    final boolean isElementType() {
        short s2 = this.dom.getNodeType();
        boolean bl = true;
        if (s2 != 1) {
            bl = false;
        }
        return bl;
    }

    final boolean isParentType() {
        return this.isElementType();
    }

    final boolean isProcessingInstructionType() {
        boolean bl = this.dom.getNodeType() == 7;
        return bl;
    }

    boolean isSameNode(XmlNode xmlNode) {
        boolean bl = this.dom == xmlNode.dom;
        return bl;
    }

    final boolean isTextType() {
        boolean bl = this.dom.getNodeType() == 3 || this.dom.getNodeType() == 4;
        return bl;
    }

    void normalize() {
        this.dom.normalize();
    }

    XmlNode parent() {
        Node node = this.dom.getParentNode();
        if (node instanceof Document) {
            return null;
        }
        if (node == null) {
            return null;
        }
        return XmlNode.createImpl(node);
    }

    void removeChild(int n2) {
        Node node = this.dom;
        node.removeChild(node.getChildNodes().item(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    void removeNamespace(XmlNode$Namespace xmlNode$Namespace) {
        if (xmlNode$Namespace.is(this.getNodeNamespace())) {
            return;
        }
        Object object = this.dom.getAttributes();
        for (int i2 = 0; i2 < object.getLength(); ++i2) {
            if (!xmlNode$Namespace.is(XmlNode.createImpl(object.item(i2)).getNodeNamespace())) continue;
            return;
        }
        object = this.getExistingPrefixFor(xmlNode$Namespace);
        if (object == null) return;
        if (!xmlNode$Namespace.isUnspecifiedPrefix()) {
            if (!((String)object).equals(xmlNode$Namespace.getPrefix())) return;
        }
        this.declareNamespace((String)object, this.getDefaultNamespace().getUri());
    }

    final void renameNode(XmlNode$QName xmlNode$QName) {
        this.dom = this.dom.getOwnerDocument().renameNode(this.dom, xmlNode$QName.getNamespace().getUri(), xmlNode$QName.qualify(this.dom));
    }

    void replaceWith(XmlNode object) {
        object = this.dom.getOwnerDocument().importNode(((XmlNode)object).dom, true);
        this.dom.getParentNode().replaceChild((Node)object, this.dom);
    }

    void setAttribute(XmlNode$QName xmlNode$QName, String string) {
        Node node = this.dom;
        if (node instanceof Element) {
            xmlNode$QName.setAttribute((Element)node, string);
            return;
        }
        throw new IllegalStateException("Can only set attribute on elements.");
    }

    final void setLocalName(String string) {
        Object object = this.dom;
        if (object instanceof ProcessingInstruction) {
            this.setProcessingInstructionName(string);
        } else {
            Object object2;
            object = object2 = object.getPrefix();
            if (object2 == null) {
                object = "";
            }
            Document document = this.dom.getOwnerDocument();
            object2 = this.dom;
            this.dom = document.renameNode((Node)object2, object2.getNamespaceURI(), XmlNode$QName.qualify((String)object, string));
        }
    }

    void setXml(XML xML) {
        this.xml = xML;
    }

    Node toDomNode() {
        return this.dom;
    }

    public String toString() {
        StringBuilder stringBuilder = a.c("XmlNode: type=");
        stringBuilder.append(this.dom.getNodeType());
        stringBuilder.append(" dom=");
        stringBuilder.append(this.dom.toString());
        return stringBuilder.toString();
    }

    String toXmlString(XmlProcessor xmlProcessor) {
        return xmlProcessor.ecmaToXmlString(this.dom);
    }
}

