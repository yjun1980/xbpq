/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.WrappedException;

public class ToolErrorReporter
implements ErrorReporter {
    private static final String messagePrefix = "js: ";
    private PrintStream err;
    private boolean hasReportedErrorFlag;
    private boolean reportWarnings;

    public ToolErrorReporter(boolean bl) {
        this(bl, System.err);
    }

    public ToolErrorReporter(boolean bl, PrintStream printStream) {
        this.reportWarnings = bl;
        this.err = printStream;
    }

    private String buildIndicator(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n2 - 1; ++i2) {
            stringBuilder.append(".");
        }
        stringBuilder.append("^");
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String getExceptionMessage(RhinoException object) {
        String string;
        if (object instanceof JavaScriptException) {
            object = ((RhinoException)object).details();
            string = "msg.uncaughtJSException";
            return ToolErrorReporter.getMessage(string, (String)object);
        }
        if (object instanceof EcmaError) {
            object = ((RhinoException)object).details();
            string = "msg.uncaughtEcmaError";
            return ToolErrorReporter.getMessage(string, (String)object);
        }
        if (!(object instanceof EvaluatorException)) return object.toString();
        return ((RhinoException)object).details();
    }

    public static String getMessage(String string) {
        return ToolErrorReporter.getMessage(string, null);
    }

    public static String getMessage(String string, Object object, Object object2) {
        return ToolErrorReporter.getMessage(string, new Object[]{object, object2});
    }

    public static String getMessage(String string, String string2) {
        return ToolErrorReporter.getMessage(string, new Object[]{string2});
    }

    public static String getMessage(String string, Object[] objectArray) {
        Object object;
        block2: {
            object = Context.getCurrentContext();
            object = object == null ? Locale.getDefault() : ((Context)object).getLocale();
            object = ResourceBundle.getBundle("org.mozilla.javascript.tools.resources.Messages", (Locale)object);
            try {
                object = ((ResourceBundle)object).getString(string);
                if (objectArray != null) break block2;
                return object;
            }
            catch (MissingResourceException missingResourceException) {
                throw new RuntimeException(e.c("no message resource found for message property ", string));
            }
        }
        return new MessageFormat((String)object).format(objectArray);
    }

    private void reportErrorMessage(String object, String object2, int n2, String string, int n3, boolean bl) {
        CharSequence charSequence;
        if (n2 > 0) {
            charSequence = String.valueOf(n2);
            object = object2 != null ? ToolErrorReporter.getMessage("msg.format3", new Object[]{object2, charSequence, object}) : ToolErrorReporter.getMessage("msg.format2", new Object[]{charSequence, object});
        } else {
            object = ToolErrorReporter.getMessage("msg.format1", new Object[]{object});
        }
        object2 = object;
        if (bl) {
            object2 = ToolErrorReporter.getMessage("msg.warning", (String)object);
        }
        object = this.err;
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(messagePrefix);
        ((StringBuilder)charSequence).append((String)object2);
        ((PrintStream)object).println(((StringBuilder)charSequence).toString());
        if (string != null) {
            object = this.err;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(messagePrefix);
            ((StringBuilder)object2).append(string);
            ((PrintStream)object).println(((StringBuilder)object2).toString());
            object2 = this.err;
            object = a.c(messagePrefix);
            ((StringBuilder)object).append(this.buildIndicator(n3));
            ((PrintStream)object2).println(((StringBuilder)object).toString());
        }
    }

    public static void reportException(ErrorReporter errorReporter, RhinoException rhinoException) {
        if (errorReporter instanceof ToolErrorReporter) {
            ((ToolErrorReporter)errorReporter).reportException(rhinoException);
        } else {
            errorReporter.error(ToolErrorReporter.getExceptionMessage(rhinoException), rhinoException.sourceName(), rhinoException.lineNumber(), rhinoException.lineSource(), rhinoException.columnNumber());
        }
    }

    @Override
    public void error(String string, String string2, int n2, String string3, int n3) {
        this.hasReportedErrorFlag = true;
        this.reportErrorMessage(string, string2, n2, string3, n3, false);
    }

    public boolean hasReportedError() {
        return this.hasReportedErrorFlag;
    }

    public boolean isReportingWarnings() {
        return this.reportWarnings;
    }

    public void reportException(RhinoException rhinoException) {
        if (rhinoException instanceof WrappedException) {
            ((WrappedException)rhinoException).printStackTrace(this.err);
        } else {
            String string = SecurityUtilities.getSystemProperty("line.separator");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ToolErrorReporter.getExceptionMessage(rhinoException));
            stringBuilder.append(string);
            stringBuilder.append(rhinoException.getScriptStackTrace());
            this.reportErrorMessage(stringBuilder.toString(), rhinoException.sourceName(), rhinoException.lineNumber(), rhinoException.lineSource(), rhinoException.columnNumber(), false);
        }
    }

    @Override
    public EvaluatorException runtimeError(String string, String string2, int n2, String string3, int n3) {
        return new EvaluatorException(string, string2, n2, string3, n3);
    }

    public void setIsReportingWarnings(boolean bl) {
        this.reportWarnings = bl;
    }

    @Override
    public void warning(String string, String string2, int n2, String string3, int n3) {
        if (!this.reportWarnings) {
            return;
        }
        this.reportErrorMessage(string, string2, n2, string3, n3, true);
    }
}

