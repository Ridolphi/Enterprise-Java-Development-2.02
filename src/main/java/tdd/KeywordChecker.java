package tdd;

import java.util.Set;

public class KeywordChecker {
    private static final Set<String> JAVA_KEYWORDS = Set.of(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch",
            "char", "class", "const", "continue", "default", "do", "double",
            "else", "enum", "extends", "final", "finally", "float", "for",
            "goto", "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"
    );

    public static boolean containsJavaKeyword(String input) {
        String[] words = input.split("\\s+");
        for (String word : words) {
            // Remove pontuação para verificar palavras isoladas
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (JAVA_KEYWORDS.contains(cleanWord.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}