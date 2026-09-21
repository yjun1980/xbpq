/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.B.e;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime$1;
import org.mozilla.javascript.ScriptRuntime$MessageProvider;

class ScriptRuntime$DefaultMessageProvider
implements ScriptRuntime$MessageProvider {
    private ScriptRuntime$DefaultMessageProvider() {
    }

    /* synthetic */ ScriptRuntime$DefaultMessageProvider(ScriptRuntime$1 scriptRuntime$1) {
        this();
    }

    @Override
    public String getMessage(String string, Object[] objectArray) {
        Object object = Context.getCurrentContext();
        object = object != null ? ((Context)object).getLocale() : Locale.getDefault();
        object = ResourceBundle.getBundle("org.mozilla.javascript.resources.Messages", (Locale)object);
        try {
            object = ((ResourceBundle)object).getString(string);
        }
        catch (MissingResourceException missingResourceException) {
            throw new RuntimeException(e.c("no message resource found for message property ", string));
        }
        return new MessageFormat((String)object).format(objectArray);
    }
}

