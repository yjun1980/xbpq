/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.y.S;
import java.io.Closeable;

public abstract class T
implements Cloneable,
Closeable {
    protected boolean a;
    protected int b = -1;
    protected char c;
    private Boolean d;

    /*
     * Unable to fully structure code
     */
    private boolean a() {
        block38: {
            block46: {
                block47: {
                    block45: {
                        block44: {
                            block39: {
                                block40: {
                                    block41: {
                                        block42: {
                                            block43: {
                                                var1_1 = this.c;
                                                if (var1_1 == '\"') break block38;
                                                if (var1_1 == '+' || var1_1 == '-') ** GOTO lbl103
                                                if (var1_1 == '[') break block39;
                                                if (var1_1 == 'f') break block40;
                                                if (var1_1 == 'n') break block41;
                                                if (var1_1 == 't') break block42;
                                                if (var1_1 == '{') break block43;
                                                switch (var1_1) {
                                                    default: {
                                                        return false;
                                                    }
                                                    case '0': 
                                                    case '1': 
                                                    case '2': 
                                                    case '3': 
                                                    case '4': 
                                                    case '5': 
                                                    case '6': 
                                                    case '7': 
                                                    case '8': 
                                                    case '9': {
                                                        if (var1_1 == '-') break block44;
                                                    }
                                                }
                                            }
                                            do {
                                                this.e();
                                            } while (T.d(this.c));
                                            if (this.c == '}') {
                                                this.e();
                                                return true;
                                            }
                                            while (this.c == '\"') {
                                                this.b();
                                                this.f();
                                                if (this.c != ':') break;
                                                this.e();
                                                this.f();
                                                if (!this.a()) {
                                                    return false;
                                                }
                                                this.f();
                                                var1_1 = this.c;
                                                if (var1_1 == ',') {
                                                    this.e();
                                                    this.f();
                                                    continue;
                                                }
                                                if (var1_1 != '}') break;
                                                this.e();
                                                return true;
                                            }
                                            return false;
                                        }
                                        this.e();
                                        if (this.c != 'r') {
                                            return false;
                                        }
                                        this.e();
                                        if (this.c != 'u') {
                                            return false;
                                        }
                                        this.e();
                                        if (this.c != 'e') {
                                            return false;
                                        }
                                        this.e();
                                        return T.d(this.c) || (var1_1 = this.c) == ',' || var1_1 == ']' || var1_1 == '}' || var1_1 == '\u0000';
                                        {
                                        }
                                    }
                                    this.e();
                                    if (this.c != 'u') {
                                        return false;
                                    }
                                    this.e();
                                    if (this.c != 'l') {
                                        return false;
                                    }
                                    this.e();
                                    if (this.c != 'l') {
                                        return false;
                                    }
                                    this.e();
                                    return T.d(this.c) || (var1_1 = this.c) == ',' || var1_1 == ']' || var1_1 == '}' || var1_1 == '\u0000';
                                    {
                                    }
                                }
                                this.e();
                                if (this.c != 'a') {
                                    return false;
                                }
                                this.e();
                                if (this.c != 'l') {
                                    return false;
                                }
                                this.e();
                                if (this.c != 's') {
                                    return false;
                                }
                                this.e();
                                if (this.c != 'e') {
                                    return false;
                                }
                                this.e();
                                return T.d(this.c) || (var1_1 = this.c) == ',' || var1_1 == ']' || var1_1 == '}' || var1_1 == '\u0000';
                                {
                                }
                            }
                            this.e();
                            this.f();
                            if (this.c == ']') {
                                this.e();
                                return true;
                            }
                            while (true) {
                                if (!this.a()) {
                                    return false;
                                }
                                this.f();
                                var1_1 = this.c;
                                if (var1_1 != ',') break;
                                this.e();
                                this.f();
                            }
                            if (var1_1 == ']') {
                                this.e();
                                return true;
                            }
                            return false;
lbl103:
                            // 1 sources

                            if (var1_1 == '-') break block44;
                            if (var1_1 != '+') break block45;
                        }
                        this.e();
                        this.f();
                        var1_1 = this.c;
                        if (var1_1 < '0' || var1_1 > '9') break block46;
                    }
                    do {
                        this.e();
                    } while ((var1_1 = this.c) >= '0' && var1_1 <= '9');
                    if (var1_1 == '.') {
                        this.e();
                        var1_1 = this.c;
                        if (var1_1 >= '0' && var1_1 <= '9') {
                            while ((var1_1 = this.c) >= '0' && var1_1 <= '9') {
                                this.e();
                            }
                        } else {
                            return false;
                        }
                    }
                    if ((var1_1 = this.c) != 'e' && var1_1 != 'E') break block47;
                    this.e();
                    var1_1 = this.c;
                    if (var1_1 == '-' || var1_1 == '+') {
                        this.e();
                    }
                    if ((var1_1 = this.c) < '0' || var1_1 > '9') break block46;
                    do {
                        this.e();
                        var1_1 = this.c;
                    } while (var1_1 >= '0' && var1_1 <= '9');
                }
                return true;
            }
            return false;
        }
        while (true) {
            this.e();
            if (this.a) {
                return false;
            }
            var1_1 = this.c;
            if (var1_1 == '\\') {
                this.e();
                if (this.c != 'u') continue;
                this.e();
                this.e();
                this.e();
                this.e();
                continue;
            }
            if (var1_1 == '\"') break;
        }
        this.e();
        return true;
    }

    public static T c(String string) {
        return new S(string);
    }

    static final boolean d(char c2) {
        boolean bl = c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n' || c2 == '\f' || c2 == '\b';
        return bl;
    }

    protected abstract void b();

    @Override
    public final void close() {
    }

    abstract void e();

    final void f() {
        while (T.d(this.c)) {
            this.e();
        }
    }

    public final boolean g() {
        Boolean bl = this.d;
        if (bl != null) {
            return bl;
        }
        if (this.a()) {
            this.f();
            if (this.a) {
                this.d = Boolean.TRUE;
                return true;
            }
        }
        this.d = Boolean.FALSE;
        return false;
    }
}

