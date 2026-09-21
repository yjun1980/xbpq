/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import com.github.catvod.spider.merge.C.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.xmlimpl.XMLObjectImpl;
import org.mozilla.javascript.xmlimpl.XmlProcessor$RhinoSAXErrorHandler;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

class XmlProcessor
implements Serializable {
    private static final long serialVersionUID = 6903514433204808713L;
    private transient LinkedBlockingDeque<DocumentBuilder> documentBuilderPool;
    private transient DocumentBuilderFactory dom;
    private XmlProcessor$RhinoSAXErrorHandler errorHandler = new XmlProcessor$RhinoSAXErrorHandler(null);
    private boolean ignoreComments;
    private boolean ignoreProcessingInstructions;
    private boolean ignoreWhitespace;
    private int prettyIndent;
    private boolean prettyPrint;
    private transient TransformerFactory xform;

    XmlProcessor() {
        this.setDefault();
        Object object = DocumentBuilderFactory.newInstance();
        this.dom = object;
        ((DocumentBuilderFactory)object).setNamespaceAware(true);
        this.dom.setIgnoringComments(false);
        this.xform = TransformerFactory.newInstance();
        object = Context.getCurrentContext();
        if (object == null || ((Context)object).hasFeature(20)) {
            this.configureSecureDBF(this.dom);
            this.configureSecureTF(this.xform);
        }
        this.documentBuilderPool = new LinkedBlockingDeque(Runtime.getRuntime().availableProcessors() * 2);
    }

    private void addCommentsTo(List<Node> list, Node node) {
        if (node instanceof Comment) {
            list.add(node);
        }
        if (node.getChildNodes() != null) {
            for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
                this.addProcessingInstructionsTo(list, node.getChildNodes().item(i2));
            }
        }
    }

    private void addProcessingInstructionsTo(List<Node> list, Node node) {
        if (node instanceof ProcessingInstruction) {
            list.add(node);
        }
        if (node.getChildNodes() != null) {
            for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
                this.addProcessingInstructionsTo(list, node.getChildNodes().item(i2));
            }
        }
    }

    private void addTextNodesToRemoveAndTrim(List<Node> list, Node node) {
        if (node instanceof Text) {
            Text text = (Text)node;
            text.setData(text.getData().trim());
            if (text.getData().length() == 0) {
                list.add(node);
            }
        }
        if (node.getChildNodes() != null) {
            for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
                this.addTextNodesToRemoveAndTrim(list, node.getChildNodes().item(i2));
            }
        }
    }

    private void beautifyElement(Element element, int n2) {
        int n3;
        int n4;
        Iterator<Element> iterator = new StringBuilder();
        ((StringBuilder)((Object)iterator)).append('\n');
        int n5 = 0;
        for (n4 = 0; n4 < n2; ++n4) {
            ((StringBuilder)((Object)iterator)).append(' ');
        }
        String string = ((StringBuilder)((Object)iterator)).toString();
        for (n4 = 0; n4 < this.prettyIndent; ++n4) {
            ((StringBuilder)((Object)iterator)).append(' ');
        }
        iterator = ((StringBuilder)((Object)iterator)).toString();
        Object object = new ArrayList();
        n4 = 0;
        for (n3 = 0; n3 < element.getChildNodes().getLength(); ++n3) {
            if (n3 == 1) {
                n4 = 1;
            }
            if (element.getChildNodes().item(n3) instanceof Text) {
                ((ArrayList)object).add(element.getChildNodes().item(n3));
                continue;
            }
            ((ArrayList)object).add(element.getChildNodes().item(n3));
            n4 = 1;
        }
        if (n4 != 0) {
            for (n3 = 0; n3 < ((ArrayList)object).size(); ++n3) {
                element.insertBefore(element.getOwnerDocument().createTextNode((String)((Object)iterator)), (Node)((ArrayList)object).get(n3));
            }
        }
        object = element.getChildNodes();
        iterator = new ArrayList();
        for (n3 = n5; n3 < object.getLength(); ++n3) {
            if (!(object.item(n3) instanceof Element)) continue;
            ((ArrayList)((Object)iterator)).add((Element)object.item(n3));
        }
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while (iterator.hasNext()) {
            this.beautifyElement((Element)iterator.next(), this.prettyIndent + n2);
        }
        if (n4 != 0) {
            element.appendChild(element.getOwnerDocument().createTextNode(string));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void configureSecureDBF(DocumentBuilderFactory documentBuilderFactory) {
        try {
            documentBuilderFactory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            documentBuilderFactory.setXIncludeAware(false);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            throw new RuntimeException("XML parser (DocumentBuilderFactory) cannot be securely configured.", parserConfigurationException);
        }
        try {
            documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        }
        catch (ParserConfigurationException parserConfigurationException) {}
        try {
            documentBuilderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            return;
        }
        catch (ParserConfigurationException parserConfigurationException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void configureSecureTF(TransformerFactory transformerFactory) {
        try {
            transformerFactory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        }
        catch (TransformerConfigurationException transformerConfigurationException) {
            throw new RuntimeException("XML parser (TransformerFactory) cannot be securely configured.", transformerConfigurationException);
        }
        try {
            transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalDTD", "");
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        try {
            transformerFactory.setAttribute("http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    private String elementToXmlString(Element element) {
        element = (Element)element.cloneNode(true);
        if (this.prettyPrint) {
            this.beautifyElement(element, 0);
        }
        return this.toString(element);
    }

    private String escapeElementValue(String string) {
        return this.escapeTextValue(string);
    }

    private DocumentBuilder getDocumentBuilderFromPool() {
        DocumentBuilder documentBuilder;
        DocumentBuilder documentBuilder2 = documentBuilder = this.documentBuilderPool.pollFirst();
        if (documentBuilder == null) {
            documentBuilder2 = this.getDomFactory().newDocumentBuilder();
        }
        documentBuilder2.setErrorHandler(this.errorHandler);
        return documentBuilder2;
    }

    private DocumentBuilderFactory getDomFactory() {
        return this.dom;
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        this.dom = object = DocumentBuilderFactory.newInstance();
        ((DocumentBuilderFactory)object).setNamespaceAware(true);
        this.dom.setIgnoringComments(false);
        this.xform = TransformerFactory.newInstance();
        object = Context.getCurrentContext();
        if (object == null || ((Context)object).hasFeature(20)) {
            this.configureSecureDBF(this.dom);
            this.configureSecureTF(this.xform);
        }
        this.documentBuilderPool = new LinkedBlockingDeque(Runtime.getRuntime().availableProcessors() * 2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void returnDocumentBuilderToPool(DocumentBuilder documentBuilder) {
        try {
            documentBuilder.reset();
            if (!documentBuilder.isNamespaceAware()) {
                return;
            }
            this.documentBuilderPool.offerFirst(documentBuilder);
            return;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            return;
        }
    }

    private String toString(Node object) {
        DOMSource dOMSource = new DOMSource((Node)object);
        StringWriter stringWriter = new StringWriter();
        object = new StreamResult(stringWriter);
        try {
            Transformer transformer = this.xform.newTransformer();
            transformer.setOutputProperty("omit-xml-declaration", "yes");
            transformer.setOutputProperty("indent", "no");
            transformer.setOutputProperty("method", "xml");
            transformer.transform(dOMSource, (Result)object);
            return this.toXmlNewlines(stringWriter.toString());
        }
        catch (TransformerException transformerException) {
            throw new RuntimeException(transformerException);
        }
        catch (TransformerConfigurationException transformerConfigurationException) {
            throw new RuntimeException(transformerConfigurationException);
        }
    }

    private String toXmlNewlines(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\r') {
                if (string.charAt(i2 + 1) == '\n') continue;
                stringBuilder.append('\n');
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    final String ecmaToXmlString(Node var1_1) {
        block4: {
            block6: {
                block5: {
                    block3: {
                        var4_2 = new StringBuilder();
                        if (!(var1_1 instanceof Text)) break block3;
                        var2_3 = ((Text)var1_1).getData();
                        var1_1 = var2_3;
                        if (this.prettyPrint) {
                            var1_1 = var2_3.trim();
                        }
                        var1_1 = this.escapeElementValue((String)var1_1);
                        break block4;
                    }
                    if (!(var1_1 instanceof Attr)) break block5;
                    var1_1 = this.escapeAttributeValue(((Attr)var1_1).getValue());
                    break block4;
                }
                if (!(var1_1 instanceof Comment)) break block6;
                var3_5 = a.c("<!--");
                var3_5.append(((Comment)var1_1).getNodeValue());
                var2_4 = "-->";
                var1_1 = var3_5;
                ** GOTO lbl32
            }
            if (var1_1 instanceof ProcessingInstruction) {
                var2_4 = (ProcessingInstruction)var1_1;
                var1_1 = a.c("<?");
                var1_1.append(var2_4.getTarget());
                var1_1.append(" ");
                var1_1.append(var2_4.getData());
                var2_4 = "?>";
lbl32:
                // 2 sources

                var1_1.append((String)var2_4);
                var1_1 = var1_1.toString();
            } else {
                var1_1 = this.elementToXmlString((Element)var1_1);
            }
        }
        var4_2.append((String)var1_1);
        return var4_2.toString();
    }

    String escapeAttributeValue(Object object) {
        String string = ScriptRuntime.toString(object);
        if (string.length() == 0) {
            return "";
        }
        object = this.newDocument().createElement("a");
        object.setAttribute("b", string);
        object = this.toString((Node)object);
        return ((String)object).substring(((String)object).indexOf(34) + 1, ((String)object).lastIndexOf(34));
    }

    String escapeTextValue(Object object) {
        if (object instanceof XMLObjectImpl) {
            return ((XMLObjectImpl)object).toXMLString();
        }
        if (((String)(object = ScriptRuntime.toString(object))).length() == 0) {
            return object;
        }
        Element element = this.newDocument().createElement("a");
        element.setTextContent((String)object);
        object = this.toString(element);
        int n2 = ((String)object).indexOf(62) + 1;
        int n3 = ((String)object).lastIndexOf(60);
        object = n2 < n3 ? ((String)object).substring(n2, n3) : "";
        return object;
    }

    final int getPrettyIndent() {
        return this.prettyIndent;
    }

    final boolean isIgnoreComments() {
        return this.ignoreComments;
    }

    final boolean isIgnoreProcessingInstructions() {
        return this.ignoreProcessingInstructions;
    }

    final boolean isIgnoreWhitespace() {
        return this.ignoreWhitespace;
    }

    final boolean isPrettyPrinting() {
        return this.prettyPrint;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Document newDocument() {
        Throwable throwable2222222;
        DocumentBuilder documentBuilder;
        DocumentBuilder documentBuilder2 = null;
        DocumentBuilder documentBuilder3 = null;
        documentBuilder3 = documentBuilder = this.getDocumentBuilderFromPool();
        documentBuilder2 = documentBuilder;
        Document document = documentBuilder.newDocument();
        this.returnDocumentBuilderToPool(documentBuilder);
        return document;
        {
            catch (Throwable throwable2222222) {
            }
            catch (ParserConfigurationException parserConfigurationException) {}
            documentBuilder3 = documentBuilder2;
            {
                documentBuilder3 = documentBuilder2;
                RuntimeException runtimeException = new RuntimeException(parserConfigurationException);
                documentBuilder3 = documentBuilder2;
                throw runtimeException;
            }
        }
        if (documentBuilder3 != null) {
            this.returnDocumentBuilderToPool(documentBuilder3);
        }
        throw throwable2222222;
    }

    final void setDefault() {
        this.setIgnoreComments(true);
        this.setIgnoreProcessingInstructions(true);
        this.setIgnoreWhitespace(true);
        this.setPrettyPrinting(true);
        this.setPrettyIndent(2);
    }

    final void setIgnoreComments(boolean bl) {
        this.ignoreComments = bl;
    }

    final void setIgnoreProcessingInstructions(boolean bl) {
        this.ignoreProcessingInstructions = bl;
    }

    final void setIgnoreWhitespace(boolean bl) {
        this.ignoreWhitespace = bl;
    }

    final void setPrettyIndent(int n2) {
        this.prettyIndent = n2;
    }

    final void setPrettyPrinting(boolean bl) {
        this.prettyPrint = bl;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Node toXml(String arrayList, String object) {
        Throwable throwable2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        block15: {
            Object object2 = null;
            ArrayList arrayList5 = null;
            Object object3 = null;
            arrayList4 = object3;
            arrayList3 = object2;
            arrayList2 = arrayList5;
            try {
                arrayList4 = object3;
                arrayList3 = object2;
                arrayList2 = arrayList5;
                StringBuilder stringBuilder = new StringBuilder();
                arrayList4 = object3;
                arrayList3 = object2;
                arrayList2 = arrayList5;
                stringBuilder.append("<parent xmlns=\"");
                arrayList4 = object3;
                arrayList3 = object2;
                arrayList2 = arrayList5;
                stringBuilder.append((String)((Object)arrayList));
                arrayList4 = object3;
                arrayList3 = object2;
                arrayList2 = arrayList5;
                stringBuilder.append("\">");
                arrayList4 = object3;
                arrayList3 = object2;
                arrayList2 = arrayList5;
                stringBuilder.append((String)object);
                arrayList4 = object3;
                arrayList3 = object2;
                arrayList2 = arrayList5;
                stringBuilder.append("</parent>");
                arrayList4 = object3;
                arrayList3 = object2;
                arrayList2 = arrayList5;
                object = stringBuilder.toString();
                arrayList4 = object3;
                arrayList3 = object2;
                arrayList2 = arrayList5;
                arrayList4 = arrayList = this.getDocumentBuilderFromPool();
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                object3 = new StringReader((String)object);
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                object2 = new InputSource((Reader)object3);
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                object = ((DocumentBuilder)((Object)arrayList)).parse((InputSource)object2);
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                if (this.ignoreProcessingInstructions) {
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    object2 = new ArrayList();
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    this.addProcessingInstructionsTo((List<Node>)object2, (Node)object);
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    object3 = ((ArrayList)object2).iterator();
                    while (true) {
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        if (!object3.hasNext()) break;
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        object2 = (Node)object3.next();
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        object2.getParentNode().removeChild((Node)object2);
                    }
                }
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                if (this.ignoreComments) {
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    object2 = new ArrayList();
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    this.addCommentsTo((List<Node>)object2, (Node)object);
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    object2 = ((ArrayList)object2).iterator();
                    while (true) {
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        if (!object2.hasNext()) break;
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        object3 = (Node)object2.next();
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        object3.getParentNode().removeChild((Node)object3);
                    }
                }
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                if (this.ignoreWhitespace) {
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    object2 = new ArrayList();
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    this.addTextNodesToRemoveAndTrim((List<Node>)object2, (Node)object);
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    object3 = ((ArrayList)object2).iterator();
                    while (true) {
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        if (!object3.hasNext()) break;
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        object2 = (Node)object3.next();
                        arrayList4 = arrayList;
                        arrayList3 = arrayList;
                        arrayList2 = arrayList;
                        object2.getParentNode().removeChild((Node)object2);
                    }
                }
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                object2 = object.getDocumentElement().getChildNodes();
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                if (object2.getLength() > 1) break block15;
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                if (object2.getLength() == 0) {
                    arrayList4 = arrayList;
                    arrayList3 = arrayList;
                    arrayList2 = arrayList;
                    object = object.createTextNode("");
                    this.returnDocumentBuilderToPool((DocumentBuilder)((Object)arrayList));
                    return object;
                }
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
            }
            catch (ParserConfigurationException parserConfigurationException) {
                arrayList4 = arrayList3;
                arrayList4 = arrayList3;
                arrayList = new RuntimeException(parserConfigurationException);
                arrayList4 = arrayList3;
                throw arrayList;
            }
            catch (IOException iOException) {
                arrayList4 = arrayList2;
                arrayList4 = arrayList2;
                RuntimeException runtimeException = new RuntimeException("Unreachable.");
                arrayList4 = arrayList2;
                throw runtimeException;
            }
            try {
                object2 = object2.item(0);
                arrayList4 = arrayList;
                arrayList3 = arrayList;
                arrayList2 = arrayList;
                object.getDocumentElement().removeChild((Node)object2);
                this.returnDocumentBuilderToPool((DocumentBuilder)((Object)arrayList));
                return object2;
            }
            catch (Throwable throwable2) {}
        }
        arrayList4 = arrayList;
        arrayList3 = arrayList;
        arrayList2 = arrayList;
        {
            throw ScriptRuntime.constructError("SyntaxError", "XML objects may contain at most one node.");
        }
        if (arrayList4 != null) {
            this.returnDocumentBuilderToPool((DocumentBuilder)((Object)arrayList4));
        }
        throw throwable2;
    }
}

