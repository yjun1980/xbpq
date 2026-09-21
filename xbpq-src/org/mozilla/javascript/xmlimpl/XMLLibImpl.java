/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.s;
import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.xml.XMLLib;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XMLObjectImpl;
import org.mozilla.javascript.xmlimpl.XMLWithScope;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlNode$Namespace;
import org.mozilla.javascript.xmlimpl.XmlNode$QName;
import org.mozilla.javascript.xmlimpl.XmlProcessor;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public final class XMLLibImpl
extends XMLLib
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Scriptable globalScope;
    private Namespace namespacePrototype;
    private XmlProcessor options = new XmlProcessor();
    private QName qnamePrototype;
    private XMLList xmlListPrototype;
    private XML xmlPrototype;

    private XMLLibImpl(Scriptable scriptable) {
        this.globalScope = scriptable;
    }

    private static RuntimeException badXMLName(Object object) {
        CharSequence charSequence;
        if (object instanceof Number) {
            charSequence = "Can not construct XML name from number: ";
        } else if (object instanceof Boolean) {
            charSequence = "Can not construct XML name from boolean: ";
        } else {
            if (object != Undefined.instance && object != null) {
                throw new IllegalArgumentException(object.toString());
            }
            charSequence = "Can not construct XML name from ";
        }
        charSequence = a.c((String)charSequence);
        ((StringBuilder)charSequence).append(ScriptRuntime.toString(object));
        return ScriptRuntime.typeError(((StringBuilder)charSequence).toString());
    }

    private void exportToScope(boolean bl) {
        this.xmlPrototype = this.newXML(XmlNode.createText(this.options, ""));
        this.xmlListPrototype = this.newXMLList();
        this.namespacePrototype = Namespace.create(this.globalScope, null, XmlNode$Namespace.GLOBAL);
        this.qnamePrototype = QName.create(this, this.globalScope, null, XmlNode$QName.create(XmlNode$Namespace.create(""), ""));
        this.xmlPrototype.exportAsJSClass(bl);
        this.xmlListPrototype.exportAsJSClass(bl);
        this.namespacePrototype.exportAsJSClass(bl);
        this.qnamePrototype.exportAsJSClass(bl);
    }

    private String getDefaultNamespaceURI(Context context) {
        return this.getDefaultNamespace(context).uri();
    }

    public static void init(Context object, Scriptable scriptable, boolean bl) {
        object = new XMLLibImpl(scriptable);
        if (((XMLLib)object).bindToScope(scriptable) == object) {
            super.exportToScope(bl);
        }
    }

    private XML parse(String object) {
        try {
            object = this.newXML(XmlNode.createElement(this.options, this.getDefaultNamespaceURI(Context.getCurrentContext()), (String)object));
            return object;
        }
        catch (SAXException sAXException) {
            StringBuilder stringBuilder = a.c("Cannot parse XML: ");
            stringBuilder.append(sAXException.getMessage());
            throw ScriptRuntime.typeError(stringBuilder.toString());
        }
    }

    public static Node toDomNode(Object object) {
        if (object instanceof XML) {
            return ((XML)object).toDomNode();
        }
        throw new IllegalArgumentException("xmlObject is not an XML object in JavaScript.");
    }

    private Ref xmlPrimaryReference(Context object, XMLName xMLName, Scriptable scriptable) {
        Object object2;
        block4: {
            Context context = null;
            do {
                object = context;
                if (scriptable instanceof XMLWithScope) {
                    object2 = (XMLObjectImpl)scriptable.getPrototype();
                    if (((XMLObjectImpl)object2).hasXMLProperty(xMLName)) break block4;
                    object = context;
                    if (context == null) {
                        object = object2;
                    }
                }
                object2 = scriptable.getParentScope();
                context = object;
                scriptable = object2;
            } while (object2 != null);
            object2 = object;
        }
        if (object2 != null) {
            xMLName.initXMLObject((XMLObjectImpl)object2);
        }
        return xMLName;
    }

    /*
     * Unable to fully structure code
     */
    Object addXMLObjects(Context var1_1, XMLObject var2_2, XMLObject var3_3) {
        var6_4 = this.newXMLList();
        var5_5 = var2_2 instanceof XMLList;
        var4_6 = 0;
        var1_1 = var2_2;
        if (!var5_5) ** GOTO lbl11
        var1_1 = (XMLList)var2_2;
        if (var1_1.length() != 1) {
            var1_1 = this.newXMLListFrom(var2_2);
        } else {
            var1_1 = var1_1.item(0);
lbl11:
            // 2 sources

            var6_4.addToList(var1_1);
            var1_1 = var6_4;
        }
        if (var3_3 instanceof XMLList) {
            var2_2 = (XMLList)var3_3;
            while (var4_6 < var2_2.length()) {
                var1_1.addToList(var2_2.item(var4_6));
                ++var4_6;
            }
        } else if (var3_3 instanceof XML) {
            var1_1.addToList(var3_3);
        }
        return var1_1;
    }

    Namespace castToNamespace(Context context, Object object) {
        return this.namespacePrototype.castToNamespace(object);
    }

    QName castToQName(Context context, Object object) {
        return this.qnamePrototype.castToQName(this, context, object);
    }

    QName constructQName(Context context, Object object) {
        return this.qnamePrototype.constructQName(this, context, object);
    }

    QName constructQName(Context context, Object object, Object object2) {
        return this.qnamePrototype.constructQName(this, context, object, object2);
    }

    Namespace[] createNamespaces(XmlNode$Namespace[] xmlNode$NamespaceArray) {
        Namespace[] namespaceArray = new Namespace[xmlNode$NamespaceArray.length];
        for (int i2 = 0; i2 < xmlNode$NamespaceArray.length; ++i2) {
            namespaceArray[i2] = this.namespacePrototype.newNamespace(xmlNode$NamespaceArray[i2].getPrefix(), xmlNode$NamespaceArray[i2].getUri());
        }
        return namespaceArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final XML ecmaToXml(Object object) {
        if (object != null && object != Undefined.instance) {
            if (object instanceof XML) {
                return (XML)object;
            }
            if (object instanceof XMLList) {
                if (((XMLList)(object = (XMLList)object)).getXML() == null) throw ScriptRuntime.typeError("Cannot convert list of >1 element to XML");
                return ((XMLList)object).getXML();
            }
            Object object2 = object;
            if (object instanceof Wrapper) {
                object2 = ((Wrapper)object).unwrap();
            }
            if (object2 instanceof Node) {
                object = XmlNode.createElementFromNode((Node)object2);
                return this.newXML((XmlNode)object);
            }
            object = ScriptRuntime.toString(object2);
            if (((String)object).length() > 0 && ((String)object).charAt(0) == '<') {
                return this.parse((String)object);
            }
            object = XmlNode.createText(this.options, (String)object);
            return this.newXML((XmlNode)object);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot convert ");
        stringBuilder.append(object);
        stringBuilder.append(" to XML");
        throw ScriptRuntime.typeError(stringBuilder.toString());
    }

    @Override
    public String escapeAttributeValue(Object object) {
        return this.options.escapeAttributeValue(object);
    }

    @Override
    public String escapeTextValue(Object object) {
        return this.options.escapeTextValue(object);
    }

    Namespace getDefaultNamespace(Context object) {
        Context context = object;
        if (object == null) {
            object = Context.getCurrentContext();
            context = object;
            if (object == null) {
                return this.namespacePrototype;
            }
        }
        if ((object = ScriptRuntime.searchDefaultNamespace(context)) == null) {
            return this.namespacePrototype;
        }
        if (object instanceof Namespace) {
            return (Namespace)object;
        }
        return this.namespacePrototype;
    }

    @Override
    public int getPrettyIndent() {
        return this.options.getPrettyIndent();
    }

    XmlProcessor getProcessor() {
        return this.options;
    }

    @Deprecated
    Scriptable globalScope() {
        return this.globalScope;
    }

    @Override
    public boolean isIgnoreComments() {
        return this.options.isIgnoreComments();
    }

    @Override
    public boolean isIgnoreProcessingInstructions() {
        return this.options.isIgnoreProcessingInstructions();
    }

    @Override
    public boolean isIgnoreWhitespace() {
        return this.options.isIgnoreWhitespace();
    }

    @Override
    public boolean isPrettyPrinting() {
        return this.options.isPrettyPrinting();
    }

    @Override
    public boolean isXMLName(Context context, Object object) {
        return XMLName.accept(object);
    }

    @Override
    public Ref nameRef(Context context, Object object, Object object2, Scriptable scriptable, int n2) {
        object = XMLName.create(this.toNodeQName(context, object, object2), false, false);
        if ((n2 & 2) != 0 && !((XMLName)object).isAttributeName()) {
            ((XMLName)object).setAttributeName();
        }
        return this.xmlPrimaryReference(context, (XMLName)object, scriptable);
    }

    @Override
    public Ref nameRef(Context context, Object object, Scriptable scriptable, int n2) {
        if ((n2 & 2) != 0) {
            return this.xmlPrimaryReference(context, this.toAttributeName(context, object), scriptable);
        }
        throw Kit.codeBug();
    }

    Namespace newNamespace(String string) {
        return this.namespacePrototype.newNamespace(string);
    }

    QName newQName(String string, String string2, String string3) {
        return this.qnamePrototype.newQName(this, string, string2, string3);
    }

    QName newQName(XmlNode$QName xmlNode$QName) {
        return QName.create(this, this.globalScope, this.qnamePrototype, xmlNode$QName);
    }

    final XML newTextElementXML(XmlNode xmlNode, XmlNode$QName xmlNode$QName, String string) {
        return this.newXML(XmlNode.newElementWithText(this.options, xmlNode, xmlNode$QName, string));
    }

    XML newXML(XmlNode xmlNode) {
        return new XML(this, this.globalScope, this.xmlPrototype, xmlNode);
    }

    final XML newXMLFromJs(Object object) {
        object = object != null && object != Undefined.instance ? (object instanceof XMLObjectImpl ? ((XMLObjectImpl)object).toXMLString() : ScriptRuntime.toString(object)) : "";
        if (!((String)object).trim().startsWith("<>")) {
            if (((String)object).indexOf("<") == -1) {
                return this.newXML(XmlNode.createText(this.options, (String)object));
            }
            return this.parse((String)object);
        }
        throw ScriptRuntime.typeError("Invalid use of XML object anonymous tags <></>.");
    }

    XMLList newXMLList() {
        return new XMLList(this, this.globalScope, this.xmlListPrototype);
    }

    final XMLList newXMLListFrom(Object object) {
        XMLList xMLList = this.newXMLList();
        if (object != null && !(object instanceof Undefined)) {
            if (object instanceof XML) {
                object = (XML)object;
                xMLList.getNodeList().add((XML)object);
                return xMLList;
            }
            if (object instanceof XMLList) {
                object = (XMLList)object;
                xMLList.getNodeList().add(((XMLList)object).getNodeList());
                return xMLList;
            }
            CharSequence charSequence = ScriptRuntime.toString(object).trim();
            object = charSequence;
            if (!((String)charSequence).startsWith("<>")) {
                object = s.a("<>", (String)charSequence, "</>");
            }
            charSequence = a.c("<fragment>");
            ((StringBuilder)charSequence).append(((String)object).substring(2));
            charSequence = ((StringBuilder)charSequence).toString();
            if (((String)charSequence).endsWith("</>")) {
                object = new StringBuilder();
                int n2 = ((String)charSequence).length();
                ((StringBuilder)object).append(((String)charSequence).substring(0, n2 - 3));
                ((StringBuilder)object).append("</fragment>");
                object = this.newXMLFromJs(((StringBuilder)object).toString()).children();
                for (int i2 = 0; i2 < ((XMLList)object).getNodeList().length(); ++i2) {
                    xMLList.getNodeList().add((XML)((XMLList)object).item(i2).copy());
                }
                return xMLList;
            }
            throw ScriptRuntime.typeError("XML with anonymous tag missing end anonymous tag");
        }
        return xMLList;
    }

    @Deprecated
    QName qnamePrototype() {
        return this.qnamePrototype;
    }

    @Override
    public void setIgnoreComments(boolean bl) {
        this.options.setIgnoreComments(bl);
    }

    @Override
    public void setIgnoreProcessingInstructions(boolean bl) {
        this.options.setIgnoreProcessingInstructions(bl);
    }

    @Override
    public void setIgnoreWhitespace(boolean bl) {
        this.options.setIgnoreWhitespace(bl);
    }

    @Override
    public void setPrettyIndent(int n2) {
        this.options.setPrettyIndent(n2);
    }

    @Override
    public void setPrettyPrinting(boolean bl) {
        this.options.setPrettyPrinting(bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Deprecated
    XMLName toAttributeName(Context object, Object object2) {
        if (object2 instanceof XMLName) {
            return (XMLName)object2;
        }
        if (object2 instanceof QName) {
            object = ((QName)object2).getDelegate();
            return XMLName.create((XmlNode$QName)object, true, false);
        }
        if (object2 instanceof Boolean || object2 instanceof Number || object2 == Undefined.instance || object2 == null) throw XMLLibImpl.badXMLName(object2);
        object = object2 instanceof String ? (String)object2 : ScriptRuntime.toString(object2);
        object2 = object;
        if (object != null) {
            object2 = object;
            if (((String)object).equals("*")) {
                object2 = null;
            }
        }
        object = XmlNode$QName.create(XmlNode$Namespace.create(""), (String)object2);
        return XMLName.create((XmlNode$QName)object, true, false);
    }

    @Override
    public Object toDefaultXmlNamespace(Context context, Object object) {
        return this.namespacePrototype.constructNamespace(object);
    }

    /*
     * Unable to fully structure code
     */
    XmlNode$QName toNodeQName(Context var1_1, Object var2_2, Object var3_3) {
        block8: {
            block9: {
                var3_3 = var3_3 instanceof QName != false ? ((QName)var3_3).localName() : ScriptRuntime.toString(var3_3);
                if (var2_2 != Undefined.instance) break block9;
                if (!"*".equals(var3_3)) {
                    var1_1 = this.getDefaultNamespace((Context)var1_1);
lbl5:
                    // 2 sources

                    while (true) {
                        var1_1 = var1_1.getDelegate();
                        break block8;
                        break;
                    }
                }
                ** GOTO lbl-1000
            }
            if (var2_2 == null) lbl-1000:
            // 2 sources

            {
                var1_1 = null;
            } else if (var2_2 instanceof Namespace) {
                var1_1 = ((Namespace)var2_2).getDelegate();
            } else {
                var1_1 = this.namespacePrototype.constructNamespace(var2_2);
                ** continue;
            }
        }
        var2_2 = var3_3;
        if (var3_3 != null) {
            var2_2 = var3_3;
            if (var3_3.equals("*")) {
                var2_2 = null;
            }
        }
        return XmlNode$QName.create((XmlNode$Namespace)var1_1, (String)var2_2);
    }

    XmlNode$QName toNodeQName(Context context, Object object, boolean bl) {
        if (object instanceof XMLName) {
            return ((XMLName)object).toQname();
        }
        if (object instanceof QName) {
            return ((QName)object).getDelegate();
        }
        if (!(object instanceof Boolean) && !(object instanceof Number) && object != Undefined.instance && object != null) {
            object = object instanceof String ? (String)object : ScriptRuntime.toString(object);
            return this.toNodeQName(context, (String)object, bl);
        }
        throw XMLLibImpl.badXMLName(object);
    }

    XmlNode$QName toNodeQName(Context object, String string, boolean bl) {
        object = this.getDefaultNamespace((Context)object).getDelegate();
        if (string != null && string.equals("*")) {
            return XmlNode$QName.create(null, null);
        }
        if (bl) {
            return XmlNode$QName.create(XmlNode$Namespace.GLOBAL, string);
        }
        return XmlNode$QName.create((XmlNode$Namespace)object, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    XMLName toXMLName(Context object, Object object2) {
        if (object2 instanceof XMLName) {
            return (XMLName)object2;
        }
        if (object2 instanceof QName) {
            object = (QName)object2;
            return XMLName.formProperty(((QName)object).uri(), ((QName)object).localName());
        }
        if (object2 instanceof String) {
            object2 = (String)object2;
            return this.toXMLNameFromString((Context)object, (String)object2);
        }
        if (object2 instanceof Boolean) throw XMLLibImpl.badXMLName(object2);
        if (object2 instanceof Number) throw XMLLibImpl.badXMLName(object2);
        if (object2 == Undefined.instance) throw XMLLibImpl.badXMLName(object2);
        if (object2 == null) throw XMLLibImpl.badXMLName(object2);
        object2 = ScriptRuntime.toString(object2);
        return this.toXMLNameFromString((Context)object, (String)object2);
    }

    XMLName toXMLNameFromString(Context context, String string) {
        return XMLName.create(this.getDefaultNamespaceURI(context), string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    XMLName toXMLNameOrIndex(Context object, Object object2) {
        long l2;
        boolean bl = object2 instanceof XMLName;
        Object var10_4 = null;
        if (bl) {
            return (XMLName)object2;
        }
        if (object2 instanceof String) {
            l2 = ScriptRuntime.testUint32String((String)(object2 = (String)object2));
            if (l2 < 0L) return this.toXMLNameFromString((Context)object, (String)object2);
        } else {
            if (object2 instanceof Number) {
                double d2 = ((Number)object2).doubleValue();
                long l3 = (long)d2;
                if ((double)l3 != d2) throw XMLLibImpl.badXMLName(object2);
                if (0L > l3) throw XMLLibImpl.badXMLName(object2);
                if (l3 > 0xFFFFFFFFL) throw XMLLibImpl.badXMLName(object2);
                ScriptRuntime.storeUint32Result((Context)object, l3);
                return var10_4;
            }
            if (object2 instanceof QName) {
                boolean bl2;
                object2 = (QName)object2;
                String string = ((QName)object2).uri();
                boolean bl3 = bl2 = false;
                if (string != null) {
                    bl3 = bl2;
                    if (string.length() == 0) {
                        long l4 = ScriptRuntime.testUint32String(string);
                        bl3 = bl2;
                        if (l4 >= 0L) {
                            ScriptRuntime.storeUint32Result((Context)object, l4);
                            bl3 = true;
                        }
                    }
                }
                object = var10_4;
                if (bl3) return object;
                return XMLName.formProperty(string, ((QName)object2).localName());
            }
            if (object2 instanceof Boolean) throw XMLLibImpl.badXMLName(object2);
            if (object2 == Undefined.instance) throw XMLLibImpl.badXMLName(object2);
            if (object2 == null) throw XMLLibImpl.badXMLName(object2);
            l2 = ScriptRuntime.testUint32String((String)(object2 = ScriptRuntime.toString(object2)));
            if (l2 < 0L) return this.toXMLNameFromString((Context)object, (String)object2);
        }
        ScriptRuntime.storeUint32Result((Context)object, l2);
        return var10_4;
    }
}

