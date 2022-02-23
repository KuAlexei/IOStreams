package com.epam.ld.javabasics2_1.iostreams;

import java.util.HashMap;
import java.util.Map;

public enum ReservedWord {

    ABSTRACT,
    ASSERT,
    BOOLEAN,
    BREAK,
    BYTE,
    CASE,
    CATCH,
    CHAR,
    CLASS,
    CONST,
    CONTINUE,
    DEFAULT,
    DOUBLE,
    DO,
    ELSE,
    ENUM,
    EXTENDS,
    FALSE,
    FINAL,
    FINALLY,
    FLOAT,
    FOR,
    GOTO,
    IF,
    IMPLEMENTS,
    IMPORT,
    INSTANCEOF,
    INT,
    INTERFACE,
    LONG,
    NATIVE,
    NEW,
    NULL,
    PACKAGE,
    PRIVATE,
    PROTECTED,
    PUBLIC,
    RETURN,
    SHORT,
    STATIC,
    STRICTFP,
    SUPER,
    SWITCH,
    SYNCHRONIZED,
    THIS,
    THROW,
    THROWS,
    TRANSIENT,
    TRUE,
    TRY,
    VOID,
    VOLATILE,
    WHILE;

    private static Map<String, ReservedWord> reserved = new HashMap<>();
    static {
        for (ReservedWord reservedWord: ReservedWord.values()) {
            reserved.put(reservedWord.name().toLowerCase(), reservedWord);
        }
    }

    public static ReservedWord getReservedWord(String keyWord) {
        return reserved.get(keyWord);
    }

}
