
package rs.ac.bg.etf.pp1;

public class sym {
    /* terminals */

    //special terminals 0, 1
    public static final int EOF = 0;
    public static final int error = 1;

    //key words 2 - 17
    public static final int PROGRAM = 2;

    public static final int CLASS = 3;
    public static final int INTERFACE = 4;
    public static final int EXTENDS = 5;
    public static final int NEW = 6;
    public static final int ENUM = 7;
    public static final int RETURN = 8;

    public static final int PRINT = 9;
    public static final int READ = 10;

    public static final int CONST = 11;
    public static final int VOID = 12;

    public static final int IF = 13;
    public static final int ELSE = 14;
    public static final int FOR = 15;
    public static final int BREAK = 16;
    public static final int CONTINUE = 17;

    //operators 18 - 42

    public static final int PLUS = 18;
    public static final int MINUS = 19;
    public static final int MUL = 20;
    public static final int DIV = 21;
    public static final int MOD = 22;
    public static final int EQUAL = 23;
    public static final int UNEQUAL = 24;
    public static final int GREATER = 25;
    public static final int GREATER_EQUAL = 26;
    public static final int SMALLER = 27;
    public static final int SMALLER_EQUAL = 28;
    public static final int AND = 29;
    public static final int OR = 30;
    public static final int ASSIGNMENT = 31;
    public static final int INC = 32;
    public static final int DEC = 33;
    public static final int SEMI = 34;
    public static final int COMMA = 35;
    public static final int DOT = 36;
    public static final int LBRACE = 37;
    public static final int RBRACE = 38;
    public static final int LSQBRACE = 39;
    public static final int RSQBRACE = 40;
    public static final int LPAREN = 41;
    public static final int RPAREN = 42;

    //defined const 43
    public static final int BOOL_CONST = 43;

    //identifiers and numbers 44, 45, 46
    public static final int IDENT = 44;
    public static final int NUMBER = 45;
    public static final int CHARCONST = 46;

    //eol, ord, chr, int, char, bool, null

}

