/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import java.util.ArrayList;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XMLObjectImpl;
import org.mozilla.javascript.xmlimpl.XmlNode$InternalList;
import org.mozilla.javascript.xmlimpl.XmlNode$QName;

class XMLList
extends XMLObjectImpl
implements Function {
    static final long serialVersionUID = -4543618751670781135L;
    private XmlNode$InternalList _annos = new XmlNode$InternalList();
    private XMLObjectImpl targetObject = null;
    private XmlNode$QName targetProperty = null;

    XMLList(XMLLibImpl xMLLibImpl, Scriptable scriptable, XMLObject xMLObject) {
        super(xMLLibImpl, scriptable, xMLObject);
    }

    private Object applyOrCall(boolean bl, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        String string = bl ? "apply" : "call";
        if (scriptable2 instanceof XMLList && ((XMLList)scriptable2).targetProperty != null) {
            return ScriptRuntime.applyOrCall(bl, context, scriptable, scriptable2, objectArray);
        }
        throw ScriptRuntime.typeErrorById("msg.isnt.function", string);
    }

    private XMLList getPropertyList(XMLName xMLName) {
        XMLList xMLList = this.newXMLList();
        XmlNode$QName xmlNode$QName = !xMLName.isDescendants() && !xMLName.isAttributeName() ? xMLName.toQname() : null;
        xMLList.setTargets(this, xmlNode$QName);
        for (int i2 = 0; i2 < this.length(); ++i2) {
            xMLList.addToList(this.getXmlFromAnnotation(i2).getPropertyList(xMLName));
        }
        return xMLList;
    }

    private XML getXML(XmlNode$InternalList xmlNode$InternalList, int n2) {
        if (n2 >= 0 && n2 < this.length()) {
            return this.xmlFromNode(xmlNode$InternalList.item(n2));
        }
        return null;
    }

    private XML getXmlFromAnnotation(int n2) {
        return this.getXML(this._annos, n2);
    }

    private void insert(int n2, XML xML) {
        if (n2 < this.length()) {
            XmlNode$InternalList xmlNode$InternalList = new XmlNode$InternalList();
            xmlNode$InternalList.add(this._annos, 0, n2);
            xmlNode$InternalList.add(xML);
            xmlNode$InternalList.add(this._annos, n2, this.length());
            this._annos = xmlNode$InternalList;
        }
    }

    private void internalRemoveFromList(int n2) {
        this._annos.remove(n2);
    }

    private void replaceNode(XML xML, XML xML2) {
        xML.replaceWith(xML2);
    }

    private void setAttribute(XMLName xMLName, Object object) {
        for (int i2 = 0; i2 < this.length(); ++i2) {
            this.getXmlFromAnnotation(i2).setAttribute(xMLName, object);
        }
    }

    @Override
    void addMatches(XMLList xMLList, XMLName xMLName) {
        for (int i2 = 0; i2 < this.length(); ++i2) {
            this.getXmlFromAnnotation(i2).addMatches(xMLList, xMLName);
        }
    }

    void addToList(Object object) {
        this._annos.addToList(object);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        Object object = this.targetProperty;
        if (object != null) {
            String string = ((XmlNode$QName)object).getLocalName();
            boolean bl = string.equals("apply");
            if (!bl && !string.equals("call")) {
                if (scriptable2 instanceof XMLObject) {
                    Scriptable scriptable3;
                    object = null;
                    block0: while (true) {
                        Object object2 = scriptable2;
                        do {
                            Scriptable scriptable4 = scriptable3 = object2;
                            object2 = object;
                            do {
                                object = object2;
                                if (!(scriptable4 instanceof XMLObject) || (object = ((XMLObject)(scriptable2 = (XMLObject)scriptable4)).getFunctionProperty(context, string)) != Scriptable.NOT_FOUND) break block0;
                                scriptable2 = ((XMLObject)scriptable2).getExtraMethodSource(context);
                                object2 = object;
                                scriptable4 = scriptable2;
                            } while (scriptable2 == null);
                            object2 = scriptable2;
                        } while (scriptable2 instanceof XMLObject);
                        object = ScriptableObject.getProperty(scriptable2, string);
                    }
                    if (object instanceof Callable) {
                        return ((Callable)object).call(context, scriptable, scriptable3, objectArray);
                    }
                    throw ScriptRuntime.notFunctionError(scriptable3, object, string);
                }
                throw ScriptRuntime.typeErrorById("msg.incompat.call", string);
            }
            return this.applyOrCall(bl, context, scriptable, scriptable2, objectArray);
        }
        throw ScriptRuntime.notFunctionError(this);
    }

    @Override
    XMLList child(int n2) {
        XMLList xMLList = this.newXMLList();
        for (int i2 = 0; i2 < this.length(); ++i2) {
            xMLList.addToList(this.getXmlFromAnnotation(i2).child(n2));
        }
        return xMLList;
    }

    @Override
    XMLList child(XMLName xMLName) {
        XMLList xMLList = this.newXMLList();
        for (int i2 = 0; i2 < this.length(); ++i2) {
            xMLList.addToList(this.getXmlFromAnnotation(i2).child(xMLName));
        }
        return xMLList;
    }

    @Override
    XMLList children() {
        int n2;
        XMLObjectImpl xMLObjectImpl;
        int n3;
        ArrayList<XML> arrayList = new ArrayList<XML>();
        int n4 = 0;
        for (n3 = 0; n3 < this.length(); ++n3) {
            xMLObjectImpl = this.getXmlFromAnnotation(n3);
            if (xMLObjectImpl == null) continue;
            xMLObjectImpl = ((XML)xMLObjectImpl).children();
            int n5 = ((XMLList)xMLObjectImpl).length();
            for (n2 = 0; n2 < n5; ++n2) {
                arrayList.add(((XMLList)xMLObjectImpl).item(n2));
            }
        }
        xMLObjectImpl = this.newXMLList();
        n2 = arrayList.size();
        for (n3 = n4; n3 < n2; ++n3) {
            ((XMLList)xMLObjectImpl).addToList(arrayList.get(n3));
        }
        return xMLObjectImpl;
    }

    @Override
    XMLList comments() {
        XMLList xMLList = this.newXMLList();
        for (int i2 = 0; i2 < this.length(); ++i2) {
            xMLList.addToList(this.getXmlFromAnnotation(i2).comments());
        }
        return xMLList;
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        throw ScriptRuntime.typeErrorById("msg.not.ctor", "XMLList");
    }

    @Override
    boolean contains(Object object) {
        boolean bl;
        boolean bl2 = false;
        int n2 = 0;
        while (true) {
            bl = bl2;
            if (n2 >= this.length()) break;
            if (this.getXmlFromAnnotation(n2).equivalentXml(object)) {
                bl = true;
                break;
            }
            ++n2;
        }
        return bl;
    }

    @Override
    XMLObjectImpl copy() {
        XMLList xMLList = this.newXMLList();
        for (int i2 = 0; i2 < this.length(); ++i2) {
            xMLList.addToList(this.getXmlFromAnnotation(i2).copy());
        }
        return xMLList;
    }

    @Override
    public void delete(int n2) {
        if (n2 >= 0 && n2 < this.length()) {
            this.getXmlFromAnnotation(n2).remove();
            this.internalRemoveFromList(n2);
        }
    }

    @Override
    void deleteXMLProperty(XMLName xMLName) {
        for (int i2 = 0; i2 < this.length(); ++i2) {
            XML xML = this.getXmlFromAnnotation(i2);
            if (!xML.isElement()) continue;
            xML.deleteXMLProperty(xMLName);
        }
    }

    @Override
    XMLList elements(XMLName xMLName) {
        XMLList xMLList = this.newXMLList();
        for (int i2 = 0; i2 < this.length(); ++i2) {
            xMLList.addToList(this.getXmlFromAnnotation(i2).elements(xMLName));
        }
        return xMLList;
    }

    @Override
    boolean equivalentXml(Object object) {
        boolean bl = object instanceof Undefined;
        boolean bl2 = true;
        if (bl && this.length() == 0) {
            bl = bl2;
        } else if (this.length() == 1) {
            bl = this.getXmlFromAnnotation(0).equivalentXml(object);
        } else if (object instanceof XMLList && ((XMLList)(object = (XMLList)object)).length() == this.length()) {
            int n2 = 0;
            while (true) {
                bl = bl2;
                if (n2 < this.length()) {
                    if (!this.getXmlFromAnnotation(n2).equivalentXml(super.getXmlFromAnnotation(n2))) break;
                    ++n2;
                    continue;
                }
                break;
            }
        } else {
            bl = false;
        }
        return bl;
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        if (n2 >= 0 && n2 < this.length()) {
            return this.getXmlFromAnnotation(n2);
        }
        return Scriptable.NOT_FOUND;
    }

    @Override
    public String getClassName() {
        return "XMLList";
    }

    @Override
    public Scriptable getExtraMethodSource(Context context) {
        if (this.length() == 1) {
            return this.getXmlFromAnnotation(0);
        }
        return null;
    }

    @Override
    public Object[] getIds() {
        Object[] objectArray;
        boolean bl = this.isPrototype();
        if (bl) {
            objectArray = new Object[]{};
        } else {
            int n2 = this.length();
            objectArray = new Object[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                objectArray[i2] = i2;
            }
        }
        return objectArray;
    }

    public Object[] getIdsForDebug() {
        return this.getIds();
    }

    XmlNode$InternalList getNodeList() {
        return this._annos;
    }

    @Override
    XML getXML() {
        if (this.length() == 1) {
            return this.getXmlFromAnnotation(0);
        }
        return null;
    }

    @Override
    Object getXMLProperty(XMLName xMLName) {
        return this.getPropertyList(xMLName);
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        boolean bl = n2 >= 0 && n2 < this.length();
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    boolean hasComplexContent() {
        int n2 = this.length();
        boolean bl = true;
        if (n2 == 0) {
            return false;
        }
        if (n2 == 1) {
            return this.getXmlFromAnnotation(0).hasComplexContent();
        }
        int n3 = 0;
        while (n3 < n2) {
            if (this.getXmlFromAnnotation(n3).isElement()) return bl;
            ++n3;
        }
        return false;
    }

    @Override
    boolean hasOwnProperty(XMLName xMLName) {
        boolean bl = this.isPrototype();
        boolean bl2 = true;
        boolean bl3 = true;
        if (bl) {
            if (this.findPrototypeId(xMLName.localName()) == 0) {
                bl3 = false;
            }
            return bl3;
        }
        bl3 = this.getPropertyList(xMLName).length() > 0 ? bl2 : false;
        return bl3;
    }

    @Override
    boolean hasSimpleContent() {
        if (this.length() == 0) {
            return true;
        }
        if (this.length() == 1) {
            return this.getXmlFromAnnotation(0).hasSimpleContent();
        }
        for (int i2 = 0; i2 < this.length(); ++i2) {
            if (!this.getXmlFromAnnotation(i2).isElement()) continue;
            return false;
        }
        return true;
    }

    @Override
    boolean hasXMLProperty(XMLName xMLName) {
        boolean bl = this.getPropertyList(xMLName).length() > 0;
        return bl;
    }

    XML item(int n2) {
        XML xML = this._annos != null ? this.getXmlFromAnnotation(n2) : this.createEmptyXML();
        return xML;
    }

    @Override
    protected Object jsConstructor(Context object, boolean bl, Object[] objectArray) {
        if (objectArray.length == 0) {
            return this.newXMLList();
        }
        object = objectArray[0];
        if (!bl && object instanceof XMLList) {
            return object;
        }
        return this.newXMLListFrom(object);
    }

    @Override
    int length() {
        XmlNode$InternalList xmlNode$InternalList = this._annos;
        int n2 = xmlNode$InternalList != null ? xmlNode$InternalList.length() : 0;
        return n2;
    }

    @Override
    void normalize() {
        for (int i2 = 0; i2 < this.length(); ++i2) {
            this.getXmlFromAnnotation(i2).normalize();
        }
    }

    @Override
    Object parent() {
        Object object;
        block5: {
            if (this.length() == 0) {
                return Undefined.instance;
            }
            Object object2 = null;
            int n2 = 0;
            while (true) {
                object = object2;
                if (n2 >= this.length()) break block5;
                object = this.getXmlFromAnnotation(n2).parent();
                if (!(object instanceof XML)) {
                    return Undefined.instance;
                }
                object = (XML)object;
                if (n2 == 0) {
                    object2 = object;
                } else if (!((XML)object2).is((XML)object)) break;
                ++n2;
            }
            object = Undefined.instance;
        }
        return object;
    }

    @Override
    XMLList processingInstructions(XMLName xMLName) {
        XMLList xMLList = this.newXMLList();
        for (int i2 = 0; i2 < this.length(); ++i2) {
            xMLList.addToList(this.getXmlFromAnnotation(i2).processingInstructions(xMLName));
        }
        return xMLList;
    }

    @Override
    boolean propertyIsEnumerable(Object object) {
        long l2;
        boolean bl = object instanceof Integer;
        boolean bl2 = false;
        if (bl) {
            l2 = ((Integer)object).intValue();
        } else if (object instanceof Number) {
            double d2 = ((Number)object).doubleValue();
            l2 = (long)d2;
            if ((double)l2 != d2) {
                return false;
            }
            if (l2 == 0L && 1.0 / d2 < 0.0) {
                return false;
            }
        } else {
            l2 = ScriptRuntime.testUint32String(ScriptRuntime.toString(object));
        }
        bl = bl2;
        if (0L <= l2) {
            bl = bl2;
            if (l2 < (long)this.length()) {
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public void put(int n2, Scriptable object, Object object2) {
        int n3;
        Object object3;
        object = Undefined.instance;
        if (object2 == null) {
            object3 = "null";
        } else {
            object3 = object2;
            if (object2 instanceof Undefined) {
                object3 = "undefined";
            }
        }
        if (object3 instanceof XMLObject) {
            object = (XMLObject)object3;
        } else if (this.targetProperty == null) {
            object = this.newXMLFromJs(object3.toString());
        } else {
            object = object2 = this.item(n2);
            if (object2 == null) {
                object = this.item(0);
                object = object == null ? this.newTextElementXML(null, this.targetProperty, null) : ((XML)object).copy();
            }
            ((XML)object).setChildren(object3);
        }
        object2 = n2 < this.length() ? this.item(n2).parent() : (this.length() == 0 && (object2 = this.targetObject) != null ? ((XMLObjectImpl)object2).getXML() : this.parent());
        boolean bl = object2 instanceof XML;
        if (bl) {
            object2 = (XML)object2;
            if (n2 < this.length()) {
                object3 = this.getXmlFromAnnotation(n2);
                if (object instanceof XML) {
                    this.replaceNode((XML)object3, (XML)object);
                    this.replace(n2, (XML)object3);
                } else if (object instanceof XMLList && ((XMLList)(object = (XMLList)object)).length() > 0) {
                    int n4 = ((XML)object3).childIndex();
                    this.replaceNode((XML)object3, ((XMLList)object).item(0));
                    this.replace(n2, ((XMLList)object).item(0));
                    for (n3 = 1; n3 < ((XMLList)object).length(); ++n3) {
                        ((XML)object2).insertChildAfter(((XML)object2).getXmlChild(n4), ((XMLList)object).item(n3));
                        ++n4;
                        this.insert(n2 + n3, ((XMLList)object).item(n3));
                    }
                }
            } else {
                ((XML)object2).appendChild(object);
                this.addToList(((XML)object2).getLastXmlChild());
            }
        } else if (n2 < this.length()) {
            object2 = this.getXML(this._annos, n2);
            if (object instanceof XML) {
                this.replaceNode((XML)object2, (XML)object);
                this.replace(n2, (XML)object2);
            } else if (object instanceof XMLList && ((XMLList)(object = (XMLList)object)).length() > 0) {
                this.replaceNode((XML)object2, ((XMLList)object).item(0));
                this.replace(n2, ((XMLList)object).item(0));
                for (n3 = 1; n3 < ((XMLList)object).length(); ++n3) {
                    this.insert(n2 + n3, ((XMLList)object).item(n3));
                }
            }
        } else {
            this.addToList(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    void putXMLProperty(XMLName serializable, Object object) {
        Object object2;
        if (object == null) {
            object2 = "null";
        } else {
            object2 = object;
            if (object instanceof Undefined) {
                object2 = "undefined";
            }
        }
        if (this.length() > 1) throw ScriptRuntime.typeError("Assignment to lists with more than one item is not supported");
        if (this.length() == 0) {
            if (this.targetObject == null) throw ScriptRuntime.typeError("Assignment to empty XMLList without targets not supported");
            object = this.targetProperty;
            if (object == null) throw ScriptRuntime.typeError("Assignment to empty XMLList without targets not supported");
            if (((XmlNode$QName)object).getLocalName() == null) throw ScriptRuntime.typeError("Assignment to empty XMLList without targets not supported");
            if (this.targetProperty.getLocalName().length() <= 0) throw ScriptRuntime.typeError("Assignment to empty XMLList without targets not supported");
            this.addToList(this.newTextElementXML(null, this.targetProperty, null));
            if (((XMLName)serializable).isAttributeName()) {
                this.setAttribute((XMLName)serializable, object2);
            } else {
                this.item(0).putXMLProperty((XMLName)serializable, object2);
                this.replace(0, this.item(0));
            }
            serializable = XMLName.formProperty(this.targetProperty.getNamespace().getUri(), this.targetProperty.getLocalName());
            this.targetObject.putXMLProperty((XMLName)serializable, this);
            serializable = this.targetObject.getXML().getLastXmlChild();
        } else {
            if (((XMLName)serializable).isAttributeName()) {
                this.setAttribute((XMLName)serializable, object2);
                return;
            }
            this.item(0).putXMLProperty((XMLName)serializable, object2);
            serializable = this.item(0);
        }
        this.replace(0, (XML)serializable);
    }

    void remove() {
        for (int i2 = this.length() - 1; i2 >= 0; --i2) {
            XML xML = this.getXmlFromAnnotation(i2);
            if (xML == null) continue;
            xML.remove();
            this.internalRemoveFromList(i2);
        }
    }

    void replace(int n2, XML xML) {
        if (n2 < this.length()) {
            XmlNode$InternalList xmlNode$InternalList = new XmlNode$InternalList();
            xmlNode$InternalList.add(this._annos, 0, n2);
            xmlNode$InternalList.add(xML);
            xmlNode$InternalList.add(this._annos, n2 + 1, this.length());
            this._annos = xmlNode$InternalList;
        }
    }

    void setTargets(XMLObjectImpl xMLObjectImpl, XmlNode$QName xmlNode$QName) {
        this.targetObject = xMLObjectImpl;
        this.targetProperty = xmlNode$QName;
    }

    @Override
    XMLList text() {
        XMLList xMLList = this.newXMLList();
        for (int i2 = 0; i2 < this.length(); ++i2) {
            xMLList.addToList(this.getXmlFromAnnotation(i2).text());
        }
        return xMLList;
    }

    @Override
    String toSource(int n2) {
        return this.toXMLString();
    }

    @Override
    public String toString() {
        if (this.hasSimpleContent()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i2 = 0; i2 < this.length(); ++i2) {
                XML xML = this.getXmlFromAnnotation(i2);
                if (xML.isComment() || xML.isProcessingInstruction()) continue;
                stringBuilder.append(xML.toString());
            }
            return stringBuilder.toString();
        }
        return this.toXMLString();
    }

    @Override
    String toXMLString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < this.length(); ++i2) {
            if (this.getProcessor().isPrettyPrinting() && i2 != 0) {
                stringBuilder.append('\n');
            }
            stringBuilder.append(this.getXmlFromAnnotation(i2).toXMLString());
        }
        return stringBuilder.toString();
    }

    @Override
    Object valueOf() {
        return this;
    }
}

