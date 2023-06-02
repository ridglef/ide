package org.ide;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import static java.awt.Color.*;

public class Keywords {
    private static final Color PURPLE = new Color(128, 0, 128);
    private static final Color DARK_RED = RED.darker().darker();
    private static final Color LIGHT_RED = RED.brighter().brighter();
    private static final Color DARK_GREEN = GREEN.darker().darker();
    private static final Color DARK_MAGENTA = new Color(127, 0, 85);
    private static final Color NICE_BLUE = new Color(0, 0, 255);
    private static final Color Dark_Yellow = new Color(107, 95, 12);
    public static Map<String, Color> defaults() {
        Map<String, Color> keywordColorMap = new HashMap<>();
        keywordColorMap.put("assert", DARK_MAGENTA);
        keywordColorMap.put("break", DARK_RED);
        keywordColorMap.put("class", PURPLE);
        keywordColorMap.put("continue", GREEN);
        keywordColorMap.put("finally", DARK_RED);
        keywordColorMap.put("import", LIGHT_RED);
        keywordColorMap.put("return", GREEN);
        keywordColorMap.put("try", LIGHT_RED);
        keywordColorMap.put("if", RED);
        keywordColorMap.put("else", RED);
        keywordColorMap.put("while", ORANGE);
        keywordColorMap.put("for", ORANGE);
        keywordColorMap.put("this", NICE_BLUE);
        keywordColorMap.put("int", NICE_BLUE);
        keywordColorMap.put("float", NICE_BLUE);
        keywordColorMap.put("case", DARK_MAGENTA);
        keywordColorMap.put("super", DARK_MAGENTA);
        keywordColorMap.put("==", Dark_Yellow);
        keywordColorMap.put("!=", Dark_Yellow);
        keywordColorMap.put(">=", Dark_Yellow);
        keywordColorMap.put("<=", Dark_Yellow);
        keywordColorMap.put(">", Dark_Yellow);
        keywordColorMap.put("<", Dark_Yellow);
        keywordColorMap.put("/", Dark_Yellow);
        keywordColorMap.put("*", Dark_Yellow);
        keywordColorMap.put("+", Dark_Yellow);
        return keywordColorMap;
    }


    public static Map<String, Color> Java() {
        Map<String, Color> keywordColorMap = defaults();
        keywordColorMap.put("abstract", GREEN);
        keywordColorMap.put("boolean", NICE_BLUE);
        keywordColorMap.put("byte", NICE_BLUE);
        keywordColorMap.put("catch", LIGHT_RED);
        keywordColorMap.put("char", NICE_BLUE);
        keywordColorMap.put("const", DARK_MAGENTA);
        keywordColorMap.put("default", DARK_MAGENTA);
        keywordColorMap.put("do", DARK_MAGENTA);
        keywordColorMap.put("double", NICE_BLUE);
        keywordColorMap.put("enum", DARK_MAGENTA);
        keywordColorMap.put("extends", DARK_MAGENTA);
        keywordColorMap.put("final", GREEN);
        keywordColorMap.put("goto", DARK_MAGENTA);
        keywordColorMap.put("implements", DARK_MAGENTA);
        keywordColorMap.put("instanceof", DARK_MAGENTA);
        keywordColorMap.put("interface", DARK_MAGENTA);
        keywordColorMap.put("long", NICE_BLUE);
        keywordColorMap.put("native", GREEN);
        keywordColorMap.put("new", DARK_MAGENTA);
        keywordColorMap.put("package", DARK_MAGENTA);
        keywordColorMap.put("private", GREEN);
        keywordColorMap.put("protected", GREEN);
        keywordColorMap.put("public", GREEN);
        keywordColorMap.put("short", NICE_BLUE);
        keywordColorMap.put("static", GREEN);
        keywordColorMap.put("strictfp", GREEN);
        keywordColorMap.put("switch", DARK_MAGENTA);
        keywordColorMap.put("synchronized", GREEN);
        keywordColorMap.put("throw", DARK_MAGENTA);
        keywordColorMap.put("throws", DARK_MAGENTA);
        keywordColorMap.put("transient", GREEN);
        keywordColorMap.put("void", NICE_BLUE);
        keywordColorMap.put("volatile", GREEN);
        keywordColorMap.put("false", DARK_RED);
        keywordColorMap.put("true", DARK_GREEN);
        keywordColorMap.put("&", DARK_MAGENTA);
        return keywordColorMap;
    }

    public static Map<String, Color> Python() {
        Map<String, Color> keywordColorMap = defaults();
        keywordColorMap.put("False", DARK_RED);
        keywordColorMap.put("None", LIGHT_RED);
        keywordColorMap.put("True", DARK_GREEN);
        keywordColorMap.put("and", DARK_MAGENTA);
        keywordColorMap.put("as", DARK_MAGENTA);
        keywordColorMap.put("async", DARK_MAGENTA);
        keywordColorMap.put("await", DARK_MAGENTA);
        keywordColorMap.put("def", DARK_MAGENTA);
        keywordColorMap.put("del", DARK_MAGENTA);
        keywordColorMap.put("elif", RED);
        keywordColorMap.put("except", LIGHT_RED);
        keywordColorMap.put("from", ORANGE);
        keywordColorMap.put("global", ORANGE);
        keywordColorMap.put("in", LIGHT_RED);
        keywordColorMap.put("is", LIGHT_RED);
        keywordColorMap.put("lambda", DARK_MAGENTA);
        keywordColorMap.put("nonlocal", DARK_MAGENTA);
        keywordColorMap.put("not", DARK_RED);
        keywordColorMap.put("or", LIGHT_RED);
        keywordColorMap.put("pass", DARK_MAGENTA);
        keywordColorMap.put("raise", DARK_RED);
        keywordColorMap.put("with", DARK_MAGENTA);
        keywordColorMap.put("yield", DARK_MAGENTA);
        return keywordColorMap;
    }

    public static Map<String, Color> Lolcode() {
        Map<String, Color> keywordColorMap = defaults();
        keywordColorMap.put("HAI", NICE_BLUE);
        keywordColorMap.put("CAN HAS", orange);
        keywordColorMap.put("VISIBLE", DARK_MAGENTA);
        keywordColorMap.put("GIMMEH", GREEN);
        keywordColorMap.put("I HAS A", ORANGE);
        keywordColorMap.put("ITZ", DARK_GREEN);
        keywordColorMap.put("ITZ LIEK A", DARK_GREEN);
        keywordColorMap.put("R", DARK_GREEN);
        keywordColorMap.put("BOTH SAEM", LIGHT_RED);
        keywordColorMap.put("DIFFRINT", LIGHT_RED);
        keywordColorMap.put("AN", DARK_MAGENTA);
        keywordColorMap.put("SMALLR OF", LIGHT_RED);
        keywordColorMap.put("BIGGR OF", LIGHT_RED);
        keywordColorMap.put("SUM OF", DARK_MAGENTA);
        keywordColorMap.put("DIFF OF", DARK_MAGENTA);
        keywordColorMap.put("PRODUKT OF", DARK_MAGENTA);
        keywordColorMap.put("QUOSHUNT", DARK_MAGENTA);
        keywordColorMap.put("MOD OF", Dark_Yellow);
        keywordColorMap.put("SMOOSH", Dark_Yellow);
        keywordColorMap.put("MAEK", Dark_Yellow);
        keywordColorMap.put("IS NOW A", Dark_Yellow);
        keywordColorMap.put("SRS", Dark_Yellow);
        keywordColorMap.put("O RLY?", RED);
        keywordColorMap.put(", WTF?", RED);
        keywordColorMap.put("OMG", RED);
        keywordColorMap.put("OMGWTF", RED);
        keywordColorMap.put("YA RLY", RED);
        keywordColorMap.put("NO WAI", RED);
        keywordColorMap.put("OIC", DARK_MAGENTA);
        keywordColorMap.put("IM IN YR", DARK_MAGENTA);
        keywordColorMap.put("IM OUTTA YR", DARK_MAGENTA);
        keywordColorMap.put("KTHXBYE", NICE_BLUE);
        return keywordColorMap;
    }

}
