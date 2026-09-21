/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.ast.IdeErrorReporter;
import org.mozilla.javascript.ast.ParseProblem;
import org.mozilla.javascript.ast.ParseProblem$Type;

public class ErrorCollector
implements IdeErrorReporter {
    private List<ParseProblem> errors = new ArrayList<ParseProblem>();

    @Override
    public void error(String string, String string2, int n2, int n3) {
        this.errors.add(new ParseProblem(ParseProblem$Type.Error, string, string2, n2, n3));
    }

    @Override
    public void error(String string, String string2, int n2, String string3, int n3) {
        throw new UnsupportedOperationException();
    }

    public List<ParseProblem> getErrors() {
        return this.errors;
    }

    @Override
    public EvaluatorException runtimeError(String string, String string2, int n2, String string3, int n3) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.errors.size() * 100);
        Iterator<ParseProblem> iterator = this.errors.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void warning(String string, String string2, int n2, int n3) {
        this.errors.add(new ParseProblem(ParseProblem$Type.Warning, string, string2, n2, n3));
    }

    @Override
    public void warning(String string, String string2, int n2, String string3, int n3) {
        throw new UnsupportedOperationException();
    }
}

