/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Set;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.ast.ErrorCollector;

public class CompilerEnvirons {
    Set<String> activationNames;
    private boolean allowMemberExprAsFunctionName = false;
    private boolean allowSharpComments = false;
    private ErrorReporter errorReporter = DefaultErrorReporter.instance;
    private boolean generateDebugInfo = true;
    private boolean generateObserverCount = false;
    private boolean generatingSource = true;
    private boolean ideMode;
    private int languageVersion = 0;
    private int optimizationLevel = 0;
    private boolean recordingComments;
    private boolean recordingLocalJsDocComments;
    private boolean recoverFromErrors;
    private boolean reservedKeywordAsIdentifier = true;
    private boolean strictMode = false;
    private boolean warnTrailingComma;
    private boolean warningAsError = false;
    private boolean xmlAvailable = true;

    public static CompilerEnvirons ideEnvirons() {
        CompilerEnvirons compilerEnvirons = new CompilerEnvirons();
        compilerEnvirons.setRecoverFromErrors(true);
        compilerEnvirons.setRecordingComments(true);
        compilerEnvirons.setStrictMode(true);
        compilerEnvirons.setWarnTrailingComma(true);
        compilerEnvirons.setLanguageVersion(170);
        compilerEnvirons.setReservedKeywordAsIdentifier(true);
        compilerEnvirons.setIdeMode(true);
        compilerEnvirons.setErrorReporter(new ErrorCollector());
        return compilerEnvirons;
    }

    public Set<String> getActivationNames() {
        return this.activationNames;
    }

    public boolean getAllowSharpComments() {
        return this.allowSharpComments;
    }

    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final int getLanguageVersion() {
        return this.languageVersion;
    }

    public final int getOptimizationLevel() {
        return this.optimizationLevel;
    }

    public boolean getWarnTrailingComma() {
        return this.warnTrailingComma;
    }

    public void initFromContext(Context context) {
        this.setErrorReporter(context.getErrorReporter());
        this.languageVersion = context.getLanguageVersion();
        boolean bl = !context.isGeneratingDebugChanged() || context.isGeneratingDebug();
        this.generateDebugInfo = bl;
        this.reservedKeywordAsIdentifier = context.hasFeature(3);
        this.allowMemberExprAsFunctionName = context.hasFeature(2);
        this.strictMode = context.hasFeature(11);
        this.warningAsError = context.hasFeature(12);
        this.xmlAvailable = context.hasFeature(6);
        this.optimizationLevel = context.getOptimizationLevel();
        this.generatingSource = context.isGeneratingSource();
        this.activationNames = context.activationNames;
        this.generateObserverCount = context.generateObserverCount;
    }

    public final boolean isAllowMemberExprAsFunctionName() {
        return this.allowMemberExprAsFunctionName;
    }

    public final boolean isGenerateDebugInfo() {
        return this.generateDebugInfo;
    }

    public boolean isGenerateObserverCount() {
        return this.generateObserverCount;
    }

    public final boolean isGeneratingSource() {
        return this.generatingSource;
    }

    public boolean isIdeMode() {
        return this.ideMode;
    }

    public boolean isRecordingComments() {
        return this.recordingComments;
    }

    public boolean isRecordingLocalJsDocComments() {
        return this.recordingLocalJsDocComments;
    }

    public final boolean isReservedKeywordAsIdentifier() {
        return this.reservedKeywordAsIdentifier;
    }

    public final boolean isStrictMode() {
        return this.strictMode;
    }

    public final boolean isXmlAvailable() {
        return this.xmlAvailable;
    }

    public boolean recoverFromErrors() {
        return this.recoverFromErrors;
    }

    public final boolean reportWarningAsError() {
        return this.warningAsError;
    }

    public void setActivationNames(Set<String> set) {
        this.activationNames = set;
    }

    public void setAllowMemberExprAsFunctionName(boolean bl) {
        this.allowMemberExprAsFunctionName = bl;
    }

    public void setAllowSharpComments(boolean bl) {
        this.allowSharpComments = bl;
    }

    public void setErrorReporter(ErrorReporter errorReporter) {
        if (errorReporter != null) {
            this.errorReporter = errorReporter;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setGenerateDebugInfo(boolean bl) {
        this.generateDebugInfo = bl;
    }

    public void setGenerateObserverCount(boolean bl) {
        this.generateObserverCount = bl;
    }

    public void setGeneratingSource(boolean bl) {
        this.generatingSource = bl;
    }

    public void setIdeMode(boolean bl) {
        this.ideMode = bl;
    }

    public void setLanguageVersion(int n2) {
        Context.checkLanguageVersion(n2);
        this.languageVersion = n2;
    }

    public void setOptimizationLevel(int n2) {
        Context.checkOptimizationLevel(n2);
        this.optimizationLevel = n2;
    }

    public void setRecordingComments(boolean bl) {
        this.recordingComments = bl;
    }

    public void setRecordingLocalJsDocComments(boolean bl) {
        this.recordingLocalJsDocComments = bl;
    }

    public void setRecoverFromErrors(boolean bl) {
        this.recoverFromErrors = bl;
    }

    public void setReservedKeywordAsIdentifier(boolean bl) {
        this.reservedKeywordAsIdentifier = bl;
    }

    public void setStrictMode(boolean bl) {
        this.strictMode = bl;
    }

    public void setWarnTrailingComma(boolean bl) {
        this.warnTrailingComma = bl;
    }

    public void setXmlAvailable(boolean bl) {
        this.xmlAvailable = bl;
    }
}

