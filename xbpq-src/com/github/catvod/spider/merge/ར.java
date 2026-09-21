/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u017f;
import com.github.catvod.spider.merge.\u0456;
import com.github.catvod.spider.merge.\u05f2;

abstract class \u0f62
extends Enum<\u0f62> {
    public static final /* enum */ \u0f62 \u037f = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u0788();
            if (c2 != '\u0000') {
                if (c2 != '&') {
                    if (c2 != '<') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0620(\u04562.\u052d());
                        } else {
                            \u05f22.\u0781(new \u017f.\u058f());
                        }
                    } else {
                        \u05f22.\u037f(\u052e);
                    }
                } else {
                    \u05f22.\u037f(\u0528);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u058f(\u04562.\u052b());
            }
        }
    };
    public static final /* enum */ \u0f62 \u0528 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u058f(\u05f22, \u037f);
        }
    };
    public static final /* enum */ \u0f62 \u0529 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u0788();
            if (c2 != '\u0000') {
                if (c2 != '&') {
                    if (c2 != '<') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0620(\u04562.\u052d());
                        } else {
                            \u05f22.\u0781(new \u017f.\u058f());
                        }
                    } else {
                        \u05f22.\u037f(\u0620);
                    }
                } else {
                    \u05f22.\u037f(\u052a);
                }
            } else {
                \u05f22.\u0788(this);
                \u04562.\u037f();
                \u05f22.\u058f('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u052a = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u058f(\u05f22, \u0529);
        }
    };
    public static final /* enum */ \u0f62 \u052b = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u0780(\u05f22, \u04562, (\u0f62)this, \u0782);
        }
    };
    public static final /* enum */ \u0f62 \u052c = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u0780(\u05f22, \u04562, (\u0f62)this, \u0785);
        }
    };
    public static final /* enum */ \u0f62 \u052d = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u0788();
            if (c2 != '\u0000') {
                if (c2 != '\uffff') {
                    \u05f22.\u0620(\u04562.\u0782('\u0000'));
                } else {
                    \u05f22.\u0781(new \u017f.\u058f());
                }
            } else {
                \u05f22.\u0788(this);
                \u04562.\u037f();
                \u05f22.\u058f('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u052e = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u0788();
            if (c2 != '!') {
                if (c2 != '/') {
                    if (c2 != '?') {
                        if (\u04562.\u0794()) {
                            \u05f22.\u052e(true);
                            \u05f22.\u078b(\u058f);
                        } else {
                            \u05f22.\u0788(this);
                            \u05f22.\u058f('<');
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u052b();
                        \u05f22.\u037f(\u079f);
                    }
                } else {
                    \u05f22.\u037f(\u052f);
                }
            } else {
                \u05f22.\u037f(\u07a0);
            }
        }
    };
    public static final /* enum */ \u0f62 \u052f = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0789()) {
                \u05f22.\u0786(this);
                \u05f22.\u0620(SOY.d("467D"));
                \u05f22.\u078b(\u037f);
            } else if (\u04562.\u0794()) {
                \u05f22.\u052e(false);
                \u05f22.\u078b(\u058f);
            } else if (\u04562.\u078e('>')) {
                \u05f22.\u0788(this);
                \u05f22.\u037f(\u037f);
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u052b();
                \u05f22.\u037f(\u079f);
            }
        }
    };
    public static final /* enum */ \u0f62 \u058f = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            block6: {
                block0: {
                    block1: {
                        block2: {
                            block4: {
                                block3: {
                                    block5: {
                                        String string = \u04562.\u0781();
                                        \u05f22.\u0620.\u078a(string);
                                        char c2 = \u04562.\u052b();
                                        if (c2 == '\u0000') break block0;
                                        if (c2 == ' ') break block1;
                                        if (c2 == '/') break block2;
                                        if (c2 == '<') break block3;
                                        if (c2 == '>') break block4;
                                        if (c2 == '\uffff') break block5;
                                        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block1;
                                        \u05f22.\u0620.\u0789(c2);
                                        break block6;
                                    }
                                    \u05f22.\u0786(this);
                                    \u05f22.\u078b(\u037f);
                                    break block6;
                                }
                                \u04562.\u079a();
                                \u05f22.\u0788(this);
                            }
                            \u05f22.\u0785();
                            \u05f22.\u078b(\u037f);
                            break block6;
                        }
                        \u05f22.\u078b(\u079e);
                        break block6;
                    }
                    \u05f22.\u078b(\u0796);
                    break block6;
                }
                \u05f22.\u0620.\u078a(\u08a8);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0620 = new \u0f62(){

        /*
         * Enabled aggressive block sorting
         */
        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u078e('/')) {
                \u05f22.\u052f();
                \u05f22.\u037f(\u0780);
                return;
            }
            if (\u04562.\u0794() && \u05f22.\u0528() != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(SOY.d("467D"));
                stringBuilder.append(\u05f22.\u0528());
                if (!\u04562.\u0787(stringBuilder.toString())) {
                    \u05f22.\u0620 = \u05f22.\u052e(false).\u0791(\u05f22.\u0528());
                    \u05f22.\u0785();
                    \u05f22.\u078b(\u052e);
                    return;
                }
            }
            \u05f22.\u0620(SOY.d("46"));
            \u05f22.\u078b(\u0529);
        }
    };
    public static final /* enum */ \u0f62 \u0780 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0794()) {
                \u05f22.\u052e(false);
                \u05f22.\u0620.\u0789(\u04562.\u0788());
                \u05f22.\u058f.append(\u04562.\u0788());
                \u05f22.\u037f(\u0781);
            } else {
                \u05f22.\u0620(SOY.d("467D"));
                \u05f22.\u078b(\u0529);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0781 = new \u0f62(){

        private void \u0781(\u05f2 \u05f22, \u0456 \u04562) {
            \u05f22.\u0620(SOY.d("467D"));
            \u05f22.\u0780(\u05f22.\u058f);
            \u04562.\u079a();
            \u05f22.\u078b(\u0529);
        }

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 object) {
            if (((\u0456)object).\u0794()) {
                object = ((\u0456)object).\u058f();
                \u05f22.\u0620.\u078a((String)object);
                \u05f22.\u058f.append((String)object);
                return;
            }
            char c2 = ((\u0456)object).\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '/') {
                    if (c2 != '>') {
                        this.\u0781(\u05f22, (\u0456)object);
                    } else if (\u05f22.\u0789()) {
                        \u05f22.\u0785();
                        \u05f22.\u078b(\u037f);
                    } else {
                        this.\u0781(\u05f22, (\u0456)object);
                    }
                } else if (\u05f22.\u0789()) {
                    \u05f22.\u078b(\u079e);
                } else {
                    this.\u0781(\u05f22, (\u0456)object);
                }
            } else if (\u05f22.\u0789()) {
                \u05f22.\u078b(\u0796);
            } else {
                this.\u0781(\u05f22, (\u0456)object);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0782 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u078e('/')) {
                \u05f22.\u052f();
                \u05f22.\u037f(\u0783);
            } else {
                \u05f22.\u058f('<');
                \u05f22.\u078b(\u052b);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0783 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u0620(\u05f22, \u04562, \u0784, \u052b);
        }
    };
    public static final /* enum */ \u0f62 \u0784 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u052e(\u05f22, \u04562, \u052b);
        }
    };
    public static final /* enum */ \u0f62 \u0785 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '!') {
                if (c2 != '/') {
                    String string = SOY.d("46");
                    if (c2 != '\uffff') {
                        \u05f22.\u0620(string);
                        \u04562.\u079a();
                        \u05f22.\u078b(\u052c);
                    } else {
                        \u05f22.\u0620(string);
                        \u05f22.\u0786(this);
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u052f();
                    \u05f22.\u078b(\u0786);
                }
            } else {
                \u05f22.\u0620(SOY.d("4673"));
                \u05f22.\u078b(\u0788);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0786 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u0620(\u05f22, \u04562, \u0787, \u052c);
        }
    };
    public static final /* enum */ \u0f62 \u0787 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u052e(\u05f22, \u04562, \u052c);
        }
    };
    public static final /* enum */ \u0f62 \u0788 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u078e('-')) {
                \u05f22.\u058f('-');
                \u05f22.\u037f(\u0789);
            } else {
                \u05f22.\u078b(\u052c);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0789 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u078e('-')) {
                \u05f22.\u058f('-');
                \u05f22.\u037f(\u078c);
            } else {
                \u05f22.\u078b(\u052c);
            }
        }
    };
    public static final /* enum */ \u0f62 \u078a = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0789()) {
                \u05f22.\u0786(this);
                \u05f22.\u078b(\u037f);
                return;
            }
            char c2 = \u04562.\u0788();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '<') {
                        \u05f22.\u0620(\u04562.\u0784('-', '<', '\u0000'));
                    } else {
                        \u05f22.\u037f(\u078d);
                    }
                } else {
                    \u05f22.\u058f('-');
                    \u05f22.\u037f(\u078b);
                }
            } else {
                \u05f22.\u0788(this);
                \u04562.\u037f();
                \u05f22.\u058f('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u078b = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0789()) {
                \u05f22.\u0786(this);
                \u05f22.\u078b(\u037f);
                return;
            }
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '<') {
                        \u05f22.\u058f(c2);
                        \u05f22.\u078b(\u078a);
                    } else {
                        \u05f22.\u078b(\u078d);
                    }
                } else {
                    \u05f22.\u058f(c2);
                    \u05f22.\u078b(\u078c);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u058f('\ufffd');
                \u05f22.\u078b(\u078a);
            }
        }
    };
    public static final /* enum */ \u0f62 \u078c = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0789()) {
                \u05f22.\u0786(this);
                \u05f22.\u078b(\u037f);
                return;
            }
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '<') {
                        if (c2 != '>') {
                            \u05f22.\u058f(c2);
                            \u05f22.\u078b(\u078a);
                        } else {
                            \u05f22.\u058f(c2);
                            \u05f22.\u078b(\u052c);
                        }
                    } else {
                        \u05f22.\u078b(\u078d);
                    }
                } else {
                    \u05f22.\u058f(c2);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u058f('\ufffd');
                \u05f22.\u078b(\u078a);
            }
        }
    };
    public static final /* enum */ \u0f62 \u078d = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0794()) {
                \u05f22.\u052f();
                \u05f22.\u058f.append(\u04562.\u0788());
                \u05f22.\u0620(SOY.d("46"));
                \u05f22.\u058f(\u04562.\u0788());
                \u05f22.\u037f(\u0790);
            } else if (\u04562.\u078e('/')) {
                \u05f22.\u052f();
                \u05f22.\u037f(\u078e);
            } else {
                \u05f22.\u058f('<');
                \u05f22.\u078b(\u078a);
            }
        }
    };
    public static final /* enum */ \u0f62 \u078e = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0794()) {
                \u05f22.\u052e(false);
                \u05f22.\u0620.\u0789(\u04562.\u0788());
                \u05f22.\u058f.append(\u04562.\u0788());
                \u05f22.\u037f(\u078f);
            } else {
                \u05f22.\u0620(SOY.d("467D"));
                \u05f22.\u078b(\u078a);
            }
        }
    };
    public static final /* enum */ \u0f62 \u078f = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u052e(\u05f22, \u04562, \u078a);
        }
    };
    public static final /* enum */ \u0f62 \u0790 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u052d(\u05f22, \u04562, \u0791, \u078a);
        }
    };
    public static final /* enum */ \u0f62 \u0791 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u0788();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '<') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0620(\u04562.\u0784('-', '<', '\u0000'));
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u058f(c2);
                        \u05f22.\u037f(\u0794);
                    }
                } else {
                    \u05f22.\u058f(c2);
                    \u05f22.\u037f(\u0792);
                }
            } else {
                \u05f22.\u0788(this);
                \u04562.\u037f();
                \u05f22.\u058f('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u0792 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '<') {
                        if (c2 != '\uffff') {
                            \u05f22.\u058f(c2);
                            \u05f22.\u078b(\u0791);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u058f(c2);
                        \u05f22.\u078b(\u0794);
                    }
                } else {
                    \u05f22.\u058f(c2);
                    \u05f22.\u078b(\u0793);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u058f('\ufffd');
                \u05f22.\u078b(\u0791);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0793 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '<') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                \u05f22.\u058f(c2);
                                \u05f22.\u078b(\u0791);
                            } else {
                                \u05f22.\u0786(this);
                                \u05f22.\u078b(\u037f);
                            }
                        } else {
                            \u05f22.\u058f(c2);
                            \u05f22.\u078b(\u052c);
                        }
                    } else {
                        \u05f22.\u058f(c2);
                        \u05f22.\u078b(\u0794);
                    }
                } else {
                    \u05f22.\u058f(c2);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u058f('\ufffd');
                \u05f22.\u078b(\u0791);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0794 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u078e('/')) {
                \u05f22.\u058f('/');
                \u05f22.\u052f();
                \u05f22.\u037f(\u0795);
            } else {
                \u05f22.\u078b(\u0791);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0795 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u0f62.\u052d(\u05f22, \u04562, \u078a, \u0791);
        }
    };
    public static final /* enum */ \u0f62 \u0796 = new \u0f62(){

        /*
         * Unable to fully structure code
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        void \u052f(\u05f2 var1_1, \u0456 var2_2) {
            block5: {
                var3_3 = var2_2.\u052b();
                if (var3_3 == '\u0000') break block5;
                if (var3_3 == ' ') return;
                if (var3_3 == '\"' || var3_3 == '\'') ** GOTO lbl-1000
                if (var3_3 == '/') ** GOTO lbl24
                if (var3_3 == '\uffff') ** GOTO lbl21
                if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') return;
                switch (var3_3) {
                    default: {
                        var1_1.\u0620.\u0792();
                        var2_2.\u079a();
                        var1_1.\u078b(\u0f62.\u0797);
                        return;
                    }
                    case '<': {
                        var2_2.\u079a();
                        var1_1.\u0788(this);
                    }
                    case '>': {
                        var1_1.\u0785();
                        var1_1.\u078b(\u0f62.\u037f);
                        return;
                    }
lbl21:
                    // 1 sources

                    var1_1.\u0786(this);
                    var1_1.\u078b(\u0f62.\u037f);
                    return;
lbl24:
                    // 1 sources

                    var1_1.\u078b(\u0f62.\u079e);
                    return;
                    case '=': lbl-1000:
                    // 2 sources

                    {
                        var1_1.\u0788(this);
                        var1_1.\u0620.\u0792();
                        var1_1.\u0620.\u0784(var3_3);
                        var1_1.\u078b(\u0f62.\u0797);
                        return;
                    }
                }
            }
            var2_2.\u079a();
            var1_1.\u0788(this);
            var1_1.\u0620.\u0792();
            var1_1.\u078b(\u0f62.\u0797);
        }
    };
    public static final /* enum */ \u0f62 \u0797 = new \u0f62(){

        /*
         * Unable to fully structure code
         */
        @Override
        void \u052f(\u05f2 var1_1, \u0456 var2_2) {
            block8: {
                block6: {
                    block7: {
                        var4_3 = var2_2.\u0785(\u0f62.\u08a6);
                        var1_1.\u0620.\u0785(var4_3);
                        var3_4 = var2_2.\u052b();
                        if (var3_4 == '\u0000') break block6;
                        if (var3_4 == ' ') break block7;
                        if (var3_4 == '\"' || var3_4 == '\'') ** GOTO lbl-1000
                        if (var3_4 == '/') ** GOTO lbl25
                        if (var3_4 == '\uffff') ** GOTO lbl-1000
                        if (var3_4 != '\t' && var3_4 != '\n' && var3_4 != '\f' && var3_4 != '\r') {
                            switch (var3_4) {
                                default: {
                                    var1_1.\u0620.\u0784(var3_4);
                                    break;
                                }
                                case '>': {
                                    var1_1.\u0785();
                                    var1_1.\u078b(\u0f62.\u037f);
                                    break;
                                }
                                case '=': {
                                    var1_1.\u078b(\u0f62.\u0799);
                                    break;
                                }
                            }
                        }
                        break block7;
lbl-1000:
                        // 1 sources

                        {
                            var1_1.\u0786(this);
                            var1_1.\u078b(\u0f62.\u037f);
                            break;
lbl25:
                            // 1 sources

                            var1_1.\u078b(\u0f62.\u079e);
                            break;
                            case '<': lbl-1000:
                            // 2 sources

                            {
                                var1_1.\u0788(this);
                                var1_1.\u0620.\u0784(var3_4);
                                break;
                            }
                        }
                        break block8;
                    }
                    var1_1.\u078b(\u0f62.\u0798);
                    break block8;
                }
                var1_1.\u0788(this);
                var1_1.\u0620.\u0784('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u0798 = new \u0f62(){

        /*
         * Unable to fully structure code
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        void \u052f(\u05f2 var1_1, \u0456 var2_2) {
            block5: {
                var3_3 = var2_2.\u052b();
                if (var3_3 == '\u0000') break block5;
                if (var3_3 == ' ') return;
                if (var3_3 == '\"' || var3_3 == '\'') ** GOTO lbl-1000
                if (var3_3 == '/') ** GOTO lbl24
                if (var3_3 == '\uffff') ** GOTO lbl21
                if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') return;
                switch (var3_3) {
                    default: {
                        var1_1.\u0620.\u0792();
                        var2_2.\u079a();
                        var1_1.\u078b(\u0f62.\u0797);
                        return;
                    }
                    case '>': {
                        var1_1.\u0785();
                        var1_1.\u078b(\u0f62.\u037f);
                        return;
                    }
                    case '=': {
                        var1_1.\u078b(\u0f62.\u0799);
                        return;
                    }
lbl21:
                    // 1 sources

                    var1_1.\u0786(this);
                    var1_1.\u078b(\u0f62.\u037f);
                    return;
lbl24:
                    // 1 sources

                    var1_1.\u078b(\u0f62.\u079e);
                    return;
                    case '<': lbl-1000:
                    // 2 sources

                    {
                        var1_1.\u0788(this);
                        var1_1.\u0620.\u0792();
                        var1_1.\u0620.\u0784(var3_3);
                        var1_1.\u078b(\u0f62.\u0797);
                        return;
                    }
                }
            }
            var1_1.\u0788(this);
            var1_1.\u0620.\u0784('\ufffd');
            var1_1.\u078b(\u0f62.\u0797);
        }
    };
    public static final /* enum */ \u0f62 \u0799 = new \u0f62(){

        /*
         * Unable to fully structure code
         */
        @Override
        void \u052f(\u05f2 var1_1, \u0456 var2_2) {
            block5: {
                block4: {
                    block6: {
                        var3_3 = var2_2.\u052b();
                        if (var3_3 == '\u0000') break block4;
                        if (var3_3 == ' ') break block5;
                        if (var3_3 == '\"') break block6;
                        if (var3_3 == '`') ** GOTO lbl-1000
                        if (var3_3 == '\uffff') ** GOTO lbl25
                        if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') break block5;
                        if (var3_3 == '&') ** GOTO lbl22
                        if (var3_3 == '\'') ** GOTO lbl20
                        switch (var3_3) {
                            default: {
                                var2_2.\u079a();
                                var1_1.\u078b(\u0f62.\u079c);
                                break;
                            }
                            case '>': {
                                var1_1.\u0788(this);
                                var1_1.\u0785();
                                var1_1.\u078b(\u0f62.\u037f);
                                break;
                            }
lbl20:
                            // 1 sources

                            var1_1.\u078b(\u0f62.\u079b);
                            break;
lbl22:
                            // 1 sources

                            var2_2.\u079a();
                            var1_1.\u078b(\u0f62.\u079c);
                            break;
lbl25:
                            // 1 sources

                            var1_1.\u0786(this);
                            var1_1.\u0785();
                            var1_1.\u078b(\u0f62.\u037f);
                            break;
                            case '<': 
                            case '=': lbl-1000:
                            // 2 sources

                            {
                                var1_1.\u0788(this);
                                var1_1.\u0620.\u0786(var3_3);
                                var1_1.\u078b(\u0f62.\u079c);
                                break;
                            }
                        }
                        break block5;
                    }
                    var1_1.\u078b(\u0f62.\u079a);
                    break block5;
                }
                var1_1.\u0788(this);
                var1_1.\u0620.\u0786('\ufffd');
                var1_1.\u078b(\u0f62.\u079c);
            }
        }
    };
    public static final /* enum */ \u0f62 \u079a = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 object) {
            String string = ((\u0456)object).\u052c(false);
            if (string.length() > 0) {
                \u05f22.\u0620.\u0787(string);
            } else {
                \u05f22.\u0620.\u0795();
            }
            char c2 = ((\u0456)object).\u052b();
            if (c2 != '\u0000') {
                if (c2 != '\"') {
                    if (c2 != '&') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0620.\u0786(c2);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        object = \u05f22.\u052a(Character.valueOf('\"'), true);
                        if (object != null) {
                            \u05f22.\u0620.\u0788((int[])object);
                        } else {
                            \u05f22.\u0620.\u0786('&');
                        }
                    }
                } else {
                    \u05f22.\u078b(\u079d);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0620.\u0786('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u079b = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 object) {
            String string = ((\u0456)object).\u052c(true);
            if (string.length() > 0) {
                \u05f22.\u0620.\u0787(string);
            } else {
                \u05f22.\u0620.\u0795();
            }
            char c2 = ((\u0456)object).\u052b();
            if (c2 != '\u0000') {
                if (c2 != '\uffff') {
                    if (c2 != '&') {
                        if (c2 != '\'') {
                            \u05f22.\u0620.\u0786(c2);
                        } else {
                            \u05f22.\u078b(\u079d);
                        }
                    } else {
                        object = \u05f22.\u052a(Character.valueOf('\''), true);
                        if (object != null) {
                            \u05f22.\u0620.\u0788((int[])object);
                        } else {
                            \u05f22.\u0620.\u0786('&');
                        }
                    }
                } else {
                    \u05f22.\u0786(this);
                    \u05f22.\u078b(\u037f);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0620.\u0786('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u079c = new \u0f62(){

        /*
         * Unable to fully structure code
         */
        @Override
        void \u052f(\u05f2 var1_1, \u0456 var2_2) {
            block9: {
                block7: {
                    block8: {
                        var4_3 = var2_2.\u0785(\u0f62.\u08a7);
                        if (var4_3.length() > 0) {
                            var1_1.\u0620.\u0787(var4_3);
                        }
                        if ((var3_4 = var2_2.\u052b()) == '\u0000') break block7;
                        if (var3_4 == ' ') break block8;
                        if (var3_4 == '\"' || var3_4 == '`') ** GOTO lbl-1000
                        if (var3_4 == '\uffff') ** GOTO lbl26
                        if (var3_4 == '\t' || var3_4 == '\n' || var3_4 == '\f' || var3_4 == '\r') break block8;
                        if (var3_4 == '&') ** GOTO lbl-1000
                        if (var3_4 != '\'') {
                            switch (var3_4) {
                                default: {
                                    var1_1.\u0620.\u0786(var3_4);
                                    break;
                                }
                                case '>': {
                                    var1_1.\u0785();
                                    var1_1.\u078b(\u0f62.\u037f);
                                    break;
                                }
                            }
                        }
                        ** GOTO lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            var2_2 = var1_1.\u052a(Character.valueOf('>'), true);
                            if (var2_2 != null) {
                                var1_1.\u0620.\u0788((int[])var2_2);
                                break;
                            }
                            var1_1.\u0620.\u0786('&');
                            break;
lbl26:
                            // 1 sources

                            var1_1.\u0786(this);
                            var1_1.\u078b(\u0f62.\u037f);
                            break;
                            case '<': 
                            case '=': lbl-1000:
                            // 3 sources

                            {
                                var1_1.\u0788(this);
                                var1_1.\u0620.\u0786(var3_4);
                                break;
                            }
                        }
                        break block9;
                    }
                    var1_1.\u078b(\u0f62.\u0796);
                    break block9;
                }
                var1_1.\u0788(this);
                var1_1.\u0620.\u0786('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u079d = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '/') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            \u04562.\u079a();
                            \u05f22.\u0788(this);
                            \u05f22.\u078b(\u0796);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0785();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u078b(\u079e);
                }
            } else {
                \u05f22.\u078b(\u0796);
            }
        }
    };
    public static final /* enum */ \u0f62 \u079e = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '>') {
                if (c2 != '\uffff') {
                    \u04562.\u079a();
                    \u05f22.\u0788(this);
                    \u05f22.\u078b(\u0796);
                } else {
                    \u05f22.\u0786(this);
                    \u05f22.\u078b(\u037f);
                }
            } else {
                \u05f22.\u0620.\u052f = true;
                \u05f22.\u0785();
                \u05f22.\u078b(\u037f);
            }
        }
    };
    public static final /* enum */ \u0f62 \u079f = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            \u04562.\u079a();
            \u05f22.\u0784.\u0785(\u04562.\u0782('>'));
            char c2 = \u04562.\u052b();
            if (c2 == '>' || c2 == '\uffff') {
                \u05f22.\u0783();
                \u05f22.\u078b(\u037f);
            }
        }
    };
    public static final /* enum */ \u0f62 \u07a0 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u078c(SOY.d("577F"))) {
                \u05f22.\u052c();
                \u05f22.\u078b(\u07a1);
            } else if (\u04562.\u078d(SOY.d("3E1D12222D273F"))) {
                \u05f22.\u078b(\u0860);
            } else if (\u04562.\u078c(SOY.d("21111537203621"))) {
                \u05f22.\u052f();
                \u05f22.\u078b(\u08a5);
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u052b();
                \u05f22.\u037f(\u079f);
            }
        }
    };
    public static final /* enum */ \u0f62 \u07a1 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            \u04562.\u079a();
                            \u05f22.\u078b(\u07a3);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u0783();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u0783();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u078b(\u07a2);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0784.\u0784('\ufffd');
                \u05f22.\u078b(\u07a3);
            }
        }
    };
    public static final /* enum */ \u0f62 \u07a2 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0784.\u0784(c2);
                            \u05f22.\u078b(\u07a3);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u0783();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u0783();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u078b(\u07a2);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0784.\u0784('\ufffd');
                \u05f22.\u078b(\u07a3);
            }
        }
    };
    public static final /* enum */ \u0f62 \u07a3 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u0788();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '\uffff') {
                        \u05f22.\u0784.\u0785(\u04562.\u0784('-', '\u0000'));
                    } else {
                        \u05f22.\u0786(this);
                        \u05f22.\u0783();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u037f(\u07a4);
                }
            } else {
                \u05f22.\u0788(this);
                \u04562.\u037f();
                \u05f22.\u0784.\u0784('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u07a4 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '\uffff') {
                        \u05f22.\u0784.\u0784('-').\u0784(c2);
                        \u05f22.\u078b(\u07a3);
                    } else {
                        \u05f22.\u0786(this);
                        \u05f22.\u0783();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u078b(\u07a5);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0784.\u0784('-').\u0784('\ufffd');
                \u05f22.\u078b(\u07a3);
            }
        }
    };
    public static final /* enum */ \u0f62 \u07a5 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 object) {
            char c2 = ((\u0456)object).\u052b();
            object = SOY.d("577F");
            if (c2 != '\u0000') {
                if (c2 != '!') {
                    if (c2 != '-') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                \u05f22.\u0788(this);
                                \u05f22.\u0784.\u0785((String)object).\u0784(c2);
                                \u05f22.\u078b(\u07a3);
                            } else {
                                \u05f22.\u0786(this);
                                \u05f22.\u0783();
                                \u05f22.\u078b(\u037f);
                            }
                        } else {
                            \u05f22.\u0783();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u0784.\u0784('-');
                    }
                } else {
                    \u05f22.\u0788(this);
                    \u05f22.\u078b(\u07b1);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0784.\u0785((String)object).\u0784('\ufffd');
                \u05f22.\u078b(\u07a3);
            }
        }
    };
    public static final /* enum */ \u0f62 \u07b1 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 object) {
            char c2 = ((\u0456)object).\u052b();
            object = SOY.d("577F70");
            if (c2 != '\u0000') {
                if (c2 != '-') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0784.\u0785((String)object).\u0784(c2);
                            \u05f22.\u078b(\u07a3);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u0783();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0783();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u0784.\u0785((String)object);
                    \u05f22.\u078b(\u07a4);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0784.\u0785((String)object).\u0784('\ufffd');
                \u05f22.\u078b(\u07a3);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0860 = new \u0f62(){

        /*
         * Enabled aggressive block sorting
         */
        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '>') {
                    if (c2 != '\uffff') {
                        \u05f22.\u0788(this);
                        \u05f22.\u078b(\u0861);
                        return;
                    }
                    \u05f22.\u0786(this);
                }
                \u05f22.\u0788(this);
                \u05f22.\u052d();
                \u05f22.\u0783.\u052c = true;
                \u05f22.\u0784();
                \u05f22.\u078b(\u037f);
                return;
            }
            \u05f22.\u078b(\u0861);
        }
    };
    public static final /* enum */ \u0f62 \u0861 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0794()) {
                \u05f22.\u052d();
                \u05f22.\u078b(\u0862);
                return;
            }
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != ' ') {
                    if (c2 != '\uffff') {
                        if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r') {
                            \u05f22.\u052d();
                            \u05f22.\u0783.\u0528.append(c2);
                            \u05f22.\u078b(\u0862);
                        }
                    } else {
                        \u05f22.\u0786(this);
                        \u05f22.\u052d();
                        \u05f22.\u0783.\u052c = true;
                        \u05f22.\u0784();
                        \u05f22.\u078b(\u037f);
                    }
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u052d();
                \u05f22.\u0783.\u0528.append('\ufffd');
                \u05f22.\u078b(\u0862);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0862 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 object) {
            block5: {
                block1: {
                    block2: {
                        block3: {
                            block4: {
                                if (((\u0456)object).\u0794()) {
                                    object = ((\u0456)object).\u058f();
                                    \u05f22.\u0783.\u0528.append((String)object);
                                    return;
                                }
                                char c2 = ((\u0456)object).\u052b();
                                if (c2 == '\u0000') break block1;
                                if (c2 == ' ') break block2;
                                if (c2 == '>') break block3;
                                if (c2 == '\uffff') break block4;
                                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block2;
                                \u05f22.\u0783.\u0528.append(c2);
                                break block5;
                            }
                            \u05f22.\u0786(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                            break block5;
                        }
                        \u05f22.\u0784();
                        \u05f22.\u078b(\u037f);
                        break block5;
                    }
                    \u05f22.\u078b(\u0863);
                    break block5;
                }
                \u05f22.\u0788(this);
                \u05f22.\u0783.\u0528.append('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u0863 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            if (\u04562.\u0789()) {
                \u05f22.\u0786(this);
                \u05f22.\u0783.\u052c = true;
                \u05f22.\u0784();
                \u05f22.\u078b(\u037f);
                return;
            }
            if (\u04562.\u0790('\t', '\n', '\r', '\f', ' ')) {
                \u04562.\u037f();
            } else if (\u04562.\u078e('>')) {
                \u05f22.\u0784();
                \u05f22.\u037f(\u037f);
            } else {
                String string = SOY.d("2A07133A3D34");
                if (\u04562.\u078d(string)) {
                    \u05f22.\u0783.\u0529 = string;
                    \u05f22.\u078b(\u0864);
                } else {
                    string = SOY.d("290B0222313A");
                    if (\u04562.\u078d(string)) {
                        \u05f22.\u0783.\u0529 = string;
                        \u05f22.\u078b(\u086a);
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u0783.\u052c = true;
                        \u05f22.\u037f(\u08a4);
                    }
                }
            }
        }
    };
    public static final /* enum */ \u0f62 \u0864 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '\"') {
                    if (c2 != '\'') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                \u05f22.\u0788(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u078b(\u08a4);
                            } else {
                                \u05f22.\u0786(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u0784();
                                \u05f22.\u078b(\u037f);
                            }
                        } else {
                            \u05f22.\u0788(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u078b(\u0867);
                    }
                } else {
                    \u05f22.\u0788(this);
                    \u05f22.\u078b(\u0866);
                }
            } else {
                \u05f22.\u078b(\u0865);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0865 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '\"') {
                    if (c2 != '\'') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                \u05f22.\u0788(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u078b(\u08a4);
                            } else {
                                \u05f22.\u0786(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u0784();
                                \u05f22.\u078b(\u037f);
                            }
                        } else {
                            \u05f22.\u0788(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u078b(\u0867);
                    }
                } else {
                    \u05f22.\u078b(\u0866);
                }
            }
        }
    };
    public static final /* enum */ \u0f62 \u0866 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '\"') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0783.\u052a.append(c2);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u0783.\u052c = true;
                        \u05f22.\u0784();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u078b(\u0868);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0783.\u052a.append('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u0867 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '\'') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0783.\u052a.append(c2);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u0783.\u052c = true;
                        \u05f22.\u0784();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u078b(\u0868);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0783.\u052a.append('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u0868 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '\"') {
                    if (c2 != '\'') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                \u05f22.\u0788(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u078b(\u08a4);
                            } else {
                                \u05f22.\u0786(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u0784();
                                \u05f22.\u078b(\u037f);
                            }
                        } else {
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u078b(\u08a2);
                    }
                } else {
                    \u05f22.\u0788(this);
                    \u05f22.\u078b(\u08a1);
                }
            } else {
                \u05f22.\u078b(\u0869);
            }
        }
    };
    public static final /* enum */ \u0f62 \u0869 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '\"') {
                    if (c2 != '\'') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                \u05f22.\u0788(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u078b(\u08a4);
                            } else {
                                \u05f22.\u0786(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u0784();
                                \u05f22.\u078b(\u037f);
                            }
                        } else {
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u078b(\u08a2);
                    }
                } else {
                    \u05f22.\u0788(this);
                    \u05f22.\u078b(\u08a1);
                }
            }
        }
    };
    public static final /* enum */ \u0f62 \u086a = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '\"') {
                    if (c2 != '\'') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                \u05f22.\u0788(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u0784();
                            } else {
                                \u05f22.\u0786(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u0784();
                                \u05f22.\u078b(\u037f);
                            }
                        } else {
                            \u05f22.\u0788(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u078b(\u08a2);
                    }
                } else {
                    \u05f22.\u0788(this);
                    \u05f22.\u078b(\u08a1);
                }
            } else {
                \u05f22.\u078b(\u08a0);
            }
        }
    };
    public static final /* enum */ \u0f62 \u08a0 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '\"') {
                    if (c2 != '\'') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                \u05f22.\u0788(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u078b(\u08a4);
                            } else {
                                \u05f22.\u0786(this);
                                \u05f22.\u0783.\u052c = true;
                                \u05f22.\u0784();
                                \u05f22.\u078b(\u037f);
                            }
                        } else {
                            \u05f22.\u0788(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u078b(\u08a2);
                    }
                } else {
                    \u05f22.\u078b(\u08a1);
                }
            }
        }
    };
    public static final /* enum */ \u0f62 \u08a1 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '\"') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0783.\u052b.append(c2);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u0783.\u052c = true;
                        \u05f22.\u0784();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u078b(\u08a3);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0783.\u052b.append('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u08a2 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\u0000') {
                if (c2 != '\'') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            \u05f22.\u0783.\u052b.append(c2);
                        } else {
                            \u05f22.\u0786(this);
                            \u05f22.\u0783.\u052c = true;
                            \u05f22.\u0784();
                            \u05f22.\u078b(\u037f);
                        }
                    } else {
                        \u05f22.\u0788(this);
                        \u05f22.\u0783.\u052c = true;
                        \u05f22.\u0784();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u078b(\u08a3);
                }
            } else {
                \u05f22.\u0788(this);
                \u05f22.\u0783.\u052b.append('\ufffd');
            }
        }
    };
    public static final /* enum */ \u0f62 \u08a3 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                if (c2 != '>') {
                    if (c2 != '\uffff') {
                        \u05f22.\u0788(this);
                        \u05f22.\u078b(\u08a4);
                    } else {
                        \u05f22.\u0786(this);
                        \u05f22.\u0783.\u052c = true;
                        \u05f22.\u0784();
                        \u05f22.\u078b(\u037f);
                    }
                } else {
                    \u05f22.\u0784();
                    \u05f22.\u078b(\u037f);
                }
            }
        }
    };
    public static final /* enum */ \u0f62 \u08a4 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            char c2 = \u04562.\u052b();
            if (c2 != '>') {
                if (c2 == '\uffff') {
                    \u05f22.\u0784();
                    \u05f22.\u078b(\u037f);
                }
            } else {
                \u05f22.\u0784();
                \u05f22.\u078b(\u037f);
            }
        }
    };
    public static final /* enum */ \u0f62 \u08a5 = new \u0f62(){

        @Override
        void \u052f(\u05f2 \u05f22, \u0456 \u04562) {
            String string = SOY.d("270F6F");
            String string2 = \u04562.\u0783(string);
            \u05f22.\u058f.append(string2);
            if (\u04562.\u078c(string) || \u04562.\u0789()) {
                \u05f22.\u0781(new \u017f.\u0528(\u05f22.\u058f.toString()));
                \u05f22.\u078b(\u037f);
            }
        }
    };
    static final char[] \u08a6;
    static final char[] \u08a7;
    private static final String \u08a8;
    private static final \u0f62[] \u08a9;

    static {
        \u08a9 = new \u0f62[]{\u037f, \u0528, \u0529, \u052a, \u052b, \u052c, \u052d, \u052e, \u052f, \u058f, \u0620, \u0780, \u0781, \u0782, \u0783, \u0784, \u0785, \u0786, \u0787, \u0788, \u0789, \u078a, \u078b, \u078c, \u078d, \u078e, \u078f, \u0790, \u0791, \u0792, \u0793, \u0794, \u0795, \u0796, \u0797, \u0798, \u0799, \u079a, \u079b, \u079c, \u079d, \u079e, \u079f, \u07a0, \u07a1, \u07a2, \u07a3, \u07a4, \u07a5, \u07b1, \u0860, \u0861, \u0862, \u0863, \u0864, \u0865, \u0866, \u0867, \u0868, \u0869, \u086a, \u08a0, \u08a1, \u08a2, \u08a3, \u08a4, \u08a5};
        \u08a6 = new char[]{'\u0000', '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        \u08a7 = new char[]{'\u0000', '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        \u08a8 = String.valueOf('\ufffd');
    }

    private static void \u052d(\u05f2 \u05f22, \u0456 object, \u0f62 \u0f622, \u0f62 \u0f623) {
        if (((\u0456)object).\u0794()) {
            object = ((\u0456)object).\u058f();
            \u05f22.\u058f.append((String)object);
            \u05f22.\u0620((String)object);
            return;
        }
        char c2 = ((\u0456)object).\u052b();
        if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ' && c2 != '/' && c2 != '>') {
            ((\u0456)object).\u079a();
            \u05f22.\u078b(\u0f623);
        } else {
            if (\u05f22.\u058f.toString().equals(SOY.d("0931231F0403"))) {
                \u05f22.\u078b(\u0f622);
            } else {
                \u05f22.\u078b(\u0f623);
            }
            \u05f22.\u058f(c2);
        }
    }

    private static void \u052e(\u05f2 \u05f22, \u0456 object, \u0f62 \u0f622) {
        boolean bl;
        if (((\u0456)object).\u0794()) {
            object = ((\u0456)object).\u058f();
            \u05f22.\u0620.\u078a((String)object);
            \u05f22.\u058f.append((String)object);
            return;
        }
        boolean bl2 = false;
        boolean bl3 = \u05f22.\u0789();
        boolean bl4 = bl = true;
        if (bl3) {
            bl4 = bl;
            if (!((\u0456)object).\u0789()) {
                char c2 = ((\u0456)object).\u052b();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '/') {
                        if (c2 != '>') {
                            \u05f22.\u058f.append(c2);
                            bl4 = true;
                        } else {
                            \u05f22.\u0785();
                            \u05f22.\u078b(\u037f);
                            bl4 = bl2;
                        }
                    } else {
                        \u05f22.\u078b(\u079e);
                        bl4 = bl2;
                    }
                } else {
                    \u05f22.\u078b(\u0796);
                    bl4 = bl2;
                }
            }
        }
        if (bl4) {
            \u05f22.\u0620(SOY.d("467D"));
            \u05f22.\u0780(\u05f22.\u058f);
            \u05f22.\u078b(\u0f622);
        }
    }

    private static void \u058f(\u05f2 \u05f22, \u0f62 \u0f622) {
        int[] nArray = \u05f22.\u052a(null, false);
        if (nArray == null) {
            \u05f22.\u058f('&');
        } else {
            \u05f22.\u0782(nArray);
        }
        \u05f22.\u078b(\u0f622);
    }

    private static void \u0620(\u05f2 \u05f22, \u0456 \u04562, \u0f62 \u0f622, \u0f62 \u0f623) {
        if (\u04562.\u0794()) {
            \u05f22.\u052e(false);
            \u05f22.\u078b(\u0f622);
        } else {
            \u05f22.\u0620(SOY.d("467D"));
            \u05f22.\u078b(\u0f623);
        }
    }

    private static void \u0780(\u05f2 \u05f22, \u0456 \u04562, \u0f62 \u0f622, \u0f62 \u0f623) {
        char c2 = \u04562.\u0788();
        if (c2 != '\u0000') {
            if (c2 != '<') {
                if (c2 != '\uffff') {
                    \u05f22.\u0620(\u04562.\u0780());
                } else {
                    \u05f22.\u0781(new \u017f.\u058f());
                }
            } else {
                \u05f22.\u037f(\u0f623);
            }
        } else {
            \u05f22.\u0788(\u0f622);
            \u04562.\u037f();
            \u05f22.\u058f('\ufffd');
        }
    }

    abstract void \u052f(\u05f2 var1, \u0456 var2);
}

