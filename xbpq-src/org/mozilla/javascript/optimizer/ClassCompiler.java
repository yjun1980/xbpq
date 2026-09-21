/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import com.github.catvod.spider.merge.B.e;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.IRFactory;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.optimizer.Codegen;

public class ClassCompiler {
    private CompilerEnvirons compilerEnv;
    private String mainMethodClassName;
    private Class<?> targetExtends;
    private Class<?>[] targetImplements;

    public ClassCompiler(CompilerEnvirons compilerEnvirons) {
        if (compilerEnvirons != null) {
            this.compilerEnv = compilerEnvirons;
            this.mainMethodClassName = "org.mozilla.javascript.optimizer.OptRuntime";
            return;
        }
        throw new IllegalArgumentException();
    }

    public Object[] compileToClassFiles(String object, String clazz, int n2, String string) {
        object = new Parser(this.compilerEnv).parse((String)object, (String)((Object)clazz), n2);
        clazz = new IRFactory(this.compilerEnv).transformTree((AstRoot)object);
        Class<?> clazz2 = this.getTargetExtends();
        Class<?>[] classArray = this.getTargetImplements();
        n2 = classArray == null && clazz2 == null ? 1 : 0;
        object = n2 != 0 ? string : this.makeAuxiliaryClassName(string, "1");
        Object object2 = new Codegen();
        ((Codegen)object2).setMainMethodClass(this.mainMethodClassName);
        object2 = ((Codegen)object2).compileToClassFile(this.compilerEnv, (String)object, (ScriptNode)((Object)clazz), ((ScriptNode)((Object)clazz)).getEncodedSource(), false);
        if (n2 != 0) {
            return new Object[]{object, object2};
        }
        int n3 = ((ScriptNode)((Object)clazz)).getFunctionCount();
        ObjToIntMap objToIntMap = new ObjToIntMap(n3);
        for (n2 = 0; n2 != n3; ++n2) {
            FunctionNode functionNode = ((ScriptNode)((Object)clazz)).getFunctionNode(n2);
            String string2 = functionNode.getName();
            if (string2 == null || string2.length() == 0) continue;
            objToIntMap.put(string2, functionNode.getParamCount());
        }
        clazz = clazz2;
        if (clazz2 == null) {
            clazz = ScriptRuntime.ObjectClass;
        }
        return new Object[]{string, JavaAdapter.createAdapterCode(objToIntMap, string, clazz, classArray, (String)object), object, object2};
    }

    public CompilerEnvirons getCompilerEnv() {
        return this.compilerEnv;
    }

    public String getMainMethodClass() {
        return this.mainMethodClassName;
    }

    public Class<?> getTargetExtends() {
        return this.targetExtends;
    }

    public Class<?>[] getTargetImplements() {
        Object object = this.targetImplements;
        object = object == null ? null : (Class[])object.clone();
        return object;
    }

    protected String makeAuxiliaryClassName(String string, String string2) {
        return e.c(string, string2);
    }

    public void setMainMethodClass(String string) {
        this.mainMethodClassName = string;
    }

    public void setTargetExtends(Class<?> clazz) {
        this.targetExtends = clazz;
    }

    public void setTargetImplements(Class<?>[] object) {
        object = object == null ? null : (Class[])object.clone();
        this.targetImplements = object;
    }
}

