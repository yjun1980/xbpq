/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

public class Token {
    public static final int ADD = 21;
    public static final int AND = 109;
    public static final int ARRAYCOMP = 161;
    public static final int ARRAYLIT = 66;
    public static final int ARROW = 168;
    public static final int ASSIGN = 93;
    public static final int ASSIGN_ADD = 100;
    public static final int ASSIGN_BITAND = 96;
    public static final int ASSIGN_BITOR = 94;
    public static final int ASSIGN_BITXOR = 95;
    public static final int ASSIGN_DIV = 103;
    public static final int ASSIGN_EXP = 105;
    public static final int ASSIGN_LSH = 97;
    public static final int ASSIGN_MOD = 104;
    public static final int ASSIGN_MUL = 102;
    public static final int ASSIGN_RSH = 98;
    public static final int ASSIGN_SUB = 101;
    public static final int ASSIGN_URSH = 99;
    public static final int BIGINT = 83;
    public static final int BINDNAME = 49;
    public static final int BITAND = 11;
    public static final int BITNOT = 27;
    public static final int BITOR = 9;
    public static final int BITXOR = 10;
    public static final int BLOCK = 133;
    public static final int BREAK = 124;
    public static final int CALL = 38;
    public static final int CASE = 119;
    public static final int CATCH = 128;
    public static final int CATCH_SCOPE = 57;
    public static final int COLON = 107;
    public static final int COLONCOLON = 148;
    public static final int COMMA = 92;
    public static final int COMMENT = 165;
    public static final int CONST = 158;
    public static final int CONTINUE = 125;
    public static final int DEBUGGER = 164;
    public static final int DEC = 111;
    public static final int DEFAULT = 120;
    public static final int DEFAULTNAMESPACE = 76;
    public static final int DELPROP = 31;
    public static final int DEL_REF = 70;
    public static final int DIV = 24;
    public static final int DO = 122;
    public static final int DOT = 112;
    public static final int DOTDOT = 147;
    public static final int DOTDOTDOT = 174;
    public static final int DOTQUERY = 150;
    public static final int ELSE = 117;
    public static final int EMPTY = 132;
    public static final int ENTERWITH = 2;
    public static final int ENUM_ID = 63;
    public static final int ENUM_INIT_ARRAY = 60;
    public static final int ENUM_INIT_KEYS = 58;
    public static final int ENUM_INIT_VALUES = 59;
    public static final int ENUM_INIT_VALUES_IN_ORDER = 61;
    public static final int ENUM_NEXT = 62;
    public static final int EOF = 0;
    public static final int EOL = 1;
    public static final int EQ = 12;
    public static final int ERROR = -1;
    public static final int ESCXMLATTR = 77;
    public static final int ESCXMLTEXT = 78;
    public static final int EXP = 75;
    public static final int EXPORT = 114;
    public static final int EXPR_RESULT = 138;
    public static final int EXPR_VOID = 137;
    public static final int FALSE = 44;
    public static final int FINALLY = 129;
    public static final int FIRST_ASSIGN = 93;
    public static final int FIRST_BYTECODE_TOKEN = 2;
    public static final int FOR = 123;
    public static final int FUNCTION = 113;
    public static final int GE = 17;
    public static final int GENEXPR = 166;
    public static final int GET = 155;
    public static final int GETELEM = 36;
    public static final int GETPROP = 33;
    public static final int GETPROPNOWARN = 34;
    public static final int GETVAR = 55;
    public static final int GET_REF = 68;
    public static final int GOTO = 5;
    public static final int GT = 16;
    public static final int HOOK = 106;
    public static final int IF = 116;
    public static final int IFEQ = 6;
    public static final int IFNE = 7;
    public static final int IMPORT = 115;
    public static final int IN = 52;
    public static final int INC = 110;
    public static final int INSTANCEOF = 53;
    public static final int JSR = 139;
    public static final int LABEL = 134;
    public static final int LAST_ASSIGN = 105;
    public static final int LAST_BYTECODE_TOKEN = 83;
    public static final int LAST_TOKEN = 174;
    public static final int LB = 86;
    public static final int LC = 88;
    public static final int LE = 15;
    public static final int LEAVEWITH = 3;
    public static final int LET = 157;
    public static final int LETEXPR = 162;
    public static final int LOCAL_BLOCK = 145;
    public static final int LOCAL_LOAD = 54;
    public static final int LOOP = 136;
    public static final int LP = 90;
    public static final int LSH = 18;
    public static final int LT = 14;
    public static final int METHOD = 167;
    public static final int MOD = 25;
    public static final int MUL = 23;
    public static final int NAME = 39;
    public static final int NE = 13;
    public static final int NEG = 29;
    public static final int NEW = 30;
    public static final int NOT = 26;
    public static final int NULL = 42;
    public static final int NUMBER = 40;
    public static final int OBJECTLIT = 67;
    public static final int OR = 108;
    public static final int POS = 28;
    public static final int RB = 87;
    public static final int RC = 89;
    public static final int REF_CALL = 71;
    public static final int REF_MEMBER = 79;
    public static final int REF_NAME = 81;
    public static final int REF_NS_MEMBER = 80;
    public static final int REF_NS_NAME = 82;
    public static final int REF_SPECIAL = 72;
    public static final int REGEXP = 48;
    public static final int RESERVED = 131;
    public static final int RETHROW = 51;
    public static final int RETURN = 4;
    public static final int RETURN_RESULT = 65;
    public static final int RP = 91;
    public static final int RSH = 19;
    public static final int SCRIPT = 140;
    public static final int SEMI = 85;
    public static final int SET = 156;
    public static final int SETCONST = 159;
    public static final int SETCONSTVAR = 160;
    public static final int SETELEM = 37;
    public static final int SETELEM_OP = 144;
    public static final int SETNAME = 8;
    public static final int SETPROP = 35;
    public static final int SETPROP_OP = 143;
    public static final int SETVAR = 56;
    public static final int SET_REF = 69;
    public static final int SET_REF_OP = 146;
    public static final int SHEQ = 46;
    public static final int SHNE = 47;
    public static final int STRICT_SETNAME = 74;
    public static final int STRING = 41;
    public static final int SUB = 22;
    public static final int SWITCH = 118;
    public static final int TAGGED_TEMPLATE_LITERAL = 173;
    public static final int TARGET = 135;
    public static final int TEMPLATE_CHARS = 171;
    public static final int TEMPLATE_LITERAL = 170;
    public static final int TEMPLATE_LITERAL_SUBST = 172;
    public static final int THIS = 43;
    public static final int THISFN = 64;
    public static final int THROW = 50;
    public static final int TO_DOUBLE = 154;
    public static final int TO_OBJECT = 153;
    public static final int TRUE = 45;
    public static final int TRY = 84;
    public static final int TYPEOF = 32;
    public static final int TYPEOFNAME = 141;
    public static final int URSH = 20;
    public static final int USE_STACK = 142;
    public static final int VAR = 126;
    public static final int VOID = 130;
    public static final int WHILE = 121;
    public static final int WITH = 127;
    public static final int WITHEXPR = 163;
    public static final int XML = 149;
    public static final int XMLATTR = 151;
    public static final int XMLEND = 152;
    public static final int YIELD = 73;
    public static final int YIELD_STAR = 169;
    static final boolean printICode = false;
    static final boolean printNames = false;
    public static final boolean printTrees = false;

    public static boolean isValidToken(int n2) {
        boolean bl = n2 >= -1 && n2 <= 174;
        return bl;
    }

    public static String keywordToName(int n2) {
        if (n2 != 4) {
            if (n2 != 50) {
                if (n2 != 73) {
                    if (n2 != 84) {
                        if (n2 != 113) {
                            if (n2 != 164) {
                                if (n2 != 52) {
                                    if (n2 != 53) {
                                        if (n2 != 157) {
                                            if (n2 != 158) {
                                                switch (n2) {
                                                    default: {
                                                        switch (n2) {
                                                            default: {
                                                                switch (n2) {
                                                                    default: {
                                                                        return null;
                                                                    }
                                                                    case 130: {
                                                                        return "void";
                                                                    }
                                                                    case 129: {
                                                                        return "finally";
                                                                    }
                                                                    case 128: {
                                                                        return "catch";
                                                                    }
                                                                    case 127: {
                                                                        return "with";
                                                                    }
                                                                    case 126: {
                                                                        return "var";
                                                                    }
                                                                    case 125: {
                                                                        return "continue";
                                                                    }
                                                                    case 124: {
                                                                        return "break";
                                                                    }
                                                                    case 123: {
                                                                        return "for";
                                                                    }
                                                                    case 122: {
                                                                        return "do";
                                                                    }
                                                                    case 121: {
                                                                        return "while";
                                                                    }
                                                                    case 120: {
                                                                        return "default";
                                                                    }
                                                                    case 119: {
                                                                        return "case";
                                                                    }
                                                                    case 118: {
                                                                        return "switch";
                                                                    }
                                                                    case 117: {
                                                                        return "else";
                                                                    }
                                                                    case 116: 
                                                                }
                                                                return "if";
                                                            }
                                                            case 45: {
                                                                return "true";
                                                            }
                                                            case 44: {
                                                                return "false";
                                                            }
                                                            case 43: {
                                                                return "this";
                                                            }
                                                            case 42: 
                                                        }
                                                        return "null";
                                                    }
                                                    case 32: {
                                                        return "typeof";
                                                    }
                                                    case 31: {
                                                        return "delete";
                                                    }
                                                    case 30: 
                                                }
                                                return "new";
                                            }
                                            return "const";
                                        }
                                        return "let";
                                    }
                                    return "instanceof";
                                }
                                return "in";
                            }
                            return "debugger";
                        }
                        return "function";
                    }
                    return "try";
                }
                return "yield";
            }
            return "throw";
        }
        return "return";
    }

    public static String name(int n2) {
        return String.valueOf(n2);
    }

    public static String typeToName(int n2) {
        switch (n2) {
            default: {
                throw new IllegalStateException(String.valueOf(n2));
            }
            case 173: {
                return "TAGGED_TEMPLATE_LITERAL";
            }
            case 172: {
                return "TEMPLATE_LITERAL_SUBST";
            }
            case 171: {
                return "TEMPLATE_CHARS";
            }
            case 170: {
                return "TEMPLATE_LITERAL";
            }
            case 169: {
                return "YIELD_STAR";
            }
            case 168: {
                return "ARROW";
            }
            case 167: {
                return "METHOD";
            }
            case 166: {
                return "GENEXPR";
            }
            case 165: {
                return "COMMENT";
            }
            case 164: {
                return "DEBUGGER";
            }
            case 163: {
                return "WITHEXPR";
            }
            case 162: {
                return "LETEXPR";
            }
            case 161: {
                return "ARRAYCOMP";
            }
            case 159: {
                return "SETCONST";
            }
            case 158: {
                return "CONST";
            }
            case 157: {
                return "LET";
            }
            case 156: {
                return "SET";
            }
            case 155: {
                return "GET";
            }
            case 154: {
                return "TO_DOUBLE";
            }
            case 153: {
                return "TO_OBJECT";
            }
            case 152: {
                return "XMLEND";
            }
            case 151: {
                return "XMLATTR";
            }
            case 150: {
                return "DOTQUERY";
            }
            case 149: {
                return "XML";
            }
            case 148: {
                return "COLONCOLON";
            }
            case 147: {
                return "DOTDOT";
            }
            case 146: {
                return "SET_REF_OP";
            }
            case 145: {
                return "LOCAL_BLOCK";
            }
            case 144: {
                return "SETELEM_OP";
            }
            case 143: {
                return "SETPROP_OP";
            }
            case 142: {
                return "USE_STACK";
            }
            case 141: {
                return "TYPEOFNAME";
            }
            case 140: {
                return "SCRIPT";
            }
            case 139: {
                return "JSR";
            }
            case 138: {
                return "EXPR_RESULT";
            }
            case 137: {
                return "EXPR_VOID";
            }
            case 136: {
                return "LOOP";
            }
            case 135: {
                return "TARGET";
            }
            case 134: {
                return "LABEL";
            }
            case 133: {
                return "BLOCK";
            }
            case 132: {
                return "EMPTY";
            }
            case 131: {
                return "RESERVED";
            }
            case 130: {
                return "VOID";
            }
            case 129: {
                return "FINALLY";
            }
            case 128: {
                return "CATCH";
            }
            case 127: {
                return "WITH";
            }
            case 126: {
                return "VAR";
            }
            case 125: {
                return "CONTINUE";
            }
            case 124: {
                return "BREAK";
            }
            case 123: {
                return "FOR";
            }
            case 122: {
                return "DO";
            }
            case 121: {
                return "WHILE";
            }
            case 120: {
                return "DEFAULT";
            }
            case 119: {
                return "CASE";
            }
            case 118: {
                return "SWITCH";
            }
            case 117: {
                return "ELSE";
            }
            case 116: {
                return "IF";
            }
            case 115: {
                return "IMPORT";
            }
            case 114: {
                return "EXPORT";
            }
            case 113: {
                return "FUNCTION";
            }
            case 112: {
                return "DOT";
            }
            case 111: {
                return "DEC";
            }
            case 110: {
                return "INC";
            }
            case 109: {
                return "AND";
            }
            case 108: {
                return "OR";
            }
            case 107: {
                return "COLON";
            }
            case 106: {
                return "HOOK";
            }
            case 105: {
                return "ASSIGN_EXP";
            }
            case 104: {
                return "ASSIGN_MOD";
            }
            case 103: {
                return "ASSIGN_DIV";
            }
            case 102: {
                return "ASSIGN_MUL";
            }
            case 101: {
                return "ASSIGN_SUB";
            }
            case 100: {
                return "ASSIGN_ADD";
            }
            case 99: {
                return "ASSIGN_URSH";
            }
            case 98: {
                return "ASSIGN_RSH";
            }
            case 97: {
                return "ASSIGN_LSH";
            }
            case 96: {
                return "ASSIGN_BITAND";
            }
            case 95: {
                return "ASSIGN_BITXOR";
            }
            case 94: {
                return "ASSIGN_BITOR";
            }
            case 93: {
                return "ASSIGN";
            }
            case 92: {
                return "COMMA";
            }
            case 91: {
                return "RP";
            }
            case 90: {
                return "LP";
            }
            case 89: {
                return "RC";
            }
            case 88: {
                return "LC";
            }
            case 87: {
                return "RB";
            }
            case 86: {
                return "LB";
            }
            case 85: {
                return "SEMI";
            }
            case 84: {
                return "TRY";
            }
            case 83: {
                return "BIGINT";
            }
            case 82: {
                return "REF_NS_NAME";
            }
            case 81: {
                return "REF_NAME";
            }
            case 80: {
                return "REF_NS_MEMBER";
            }
            case 79: {
                return "REF_MEMBER";
            }
            case 78: {
                return "ESCXMLTEXT";
            }
            case 77: {
                return "ESCXMLATTR";
            }
            case 76: {
                return "DEFAULTNAMESPACE";
            }
            case 75: {
                return "EXP";
            }
            case 73: {
                return "YIELD";
            }
            case 72: {
                return "REF_SPECIAL";
            }
            case 71: {
                return "REF_CALL";
            }
            case 70: {
                return "DEL_REF";
            }
            case 69: {
                return "SET_REF";
            }
            case 68: {
                return "GET_REF";
            }
            case 67: {
                return "OBJECTLIT";
            }
            case 66: {
                return "ARRAYLIT";
            }
            case 65: {
                return "RETURN_RESULT";
            }
            case 64: {
                return "THISFN";
            }
            case 63: {
                return "ENUM_ID";
            }
            case 62: {
                return "ENUM_NEXT";
            }
            case 61: {
                return "ENUM_INIT_VALUES_IN_ORDER";
            }
            case 60: {
                return "ENUM_INIT_ARRAY";
            }
            case 59: {
                return "ENUM_INIT_VALUES";
            }
            case 58: {
                return "ENUM_INIT_KEYS";
            }
            case 57: {
                return "CATCH_SCOPE";
            }
            case 56: {
                return "SETVAR";
            }
            case 55: {
                return "GETVAR";
            }
            case 54: {
                return "LOCAL_LOAD";
            }
            case 53: {
                return "INSTANCEOF";
            }
            case 52: {
                return "IN";
            }
            case 51: {
                return "RETHROW";
            }
            case 50: {
                return "THROW";
            }
            case 49: {
                return "BINDNAME";
            }
            case 48: {
                return "REGEXP";
            }
            case 47: {
                return "SHNE";
            }
            case 46: {
                return "SHEQ";
            }
            case 45: {
                return "TRUE";
            }
            case 44: {
                return "FALSE";
            }
            case 43: {
                return "THIS";
            }
            case 42: {
                return "NULL";
            }
            case 41: {
                return "STRING";
            }
            case 40: {
                return "NUMBER";
            }
            case 39: {
                return "NAME";
            }
            case 38: {
                return "CALL";
            }
            case 37: {
                return "SETELEM";
            }
            case 36: {
                return "GETELEM";
            }
            case 35: {
                return "SETPROP";
            }
            case 34: {
                return "GETPROPNOWARN";
            }
            case 33: {
                return "GETPROP";
            }
            case 32: {
                return "TYPEOF";
            }
            case 31: {
                return "DELPROP";
            }
            case 30: {
                return "NEW";
            }
            case 29: {
                return "NEG";
            }
            case 28: {
                return "POS";
            }
            case 27: {
                return "BITNOT";
            }
            case 26: {
                return "NOT";
            }
            case 25: {
                return "MOD";
            }
            case 24: {
                return "DIV";
            }
            case 23: {
                return "MUL";
            }
            case 22: {
                return "SUB";
            }
            case 21: {
                return "ADD";
            }
            case 20: {
                return "URSH";
            }
            case 19: {
                return "RSH";
            }
            case 18: {
                return "LSH";
            }
            case 17: {
                return "GE";
            }
            case 16: {
                return "GT";
            }
            case 15: {
                return "LE";
            }
            case 14: {
                return "LT";
            }
            case 13: {
                return "NE";
            }
            case 12: {
                return "EQ";
            }
            case 11: {
                return "BITAND";
            }
            case 10: {
                return "BITXOR";
            }
            case 9: {
                return "BITOR";
            }
            case 8: {
                return "SETNAME";
            }
            case 7: {
                return "IFNE";
            }
            case 6: {
                return "IFEQ";
            }
            case 5: {
                return "GOTO";
            }
            case 4: {
                return "RETURN";
            }
            case 3: {
                return "LEAVEWITH";
            }
            case 2: {
                return "ENTERWITH";
            }
            case 1: {
                return "EOL";
            }
            case 0: {
                return "EOF";
            }
            case -1: 
        }
        return "ERROR";
    }
}

