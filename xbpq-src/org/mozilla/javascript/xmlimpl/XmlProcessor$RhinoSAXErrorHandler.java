/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.xmlimpl;

import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.xmlimpl.XmlProcessor$1;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

class XmlProcessor$RhinoSAXErrorHandler
implements ErrorHandler,
Serializable {
    private static final long serialVersionUID = 6918417235413084055L;

    private XmlProcessor$RhinoSAXErrorHandler() {
    }

    /* synthetic */ XmlProcessor$RhinoSAXErrorHandler(XmlProcessor$1 xmlProcessor$1) {
        this();
    }

    private void throwError(SAXParseException sAXParseException) {
        throw ScriptRuntime.constructError("TypeError", ((Throwable)sAXParseException).getMessage(), sAXParseException.getLineNumber() - 1);
    }

    @Override
    public void error(SAXParseException sAXParseException) {
        this.throwError(sAXParseException);
    }

    @Override
    public void fatalError(SAXParseException sAXParseException) {
        this.throwError(sAXParseException);
    }

    @Override
    public void warning(SAXParseException sAXParseException) {
        Context.reportWarning(((Throwable)sAXParseException).getMessage());
    }
}

