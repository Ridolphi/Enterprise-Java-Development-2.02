package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KeywordCheckerTest {
    @Test
    void testContainsJavaKeyword() {
        assertTrue(KeywordChecker.containsJavaKeyword("Don't break my heart"));
        assertFalse(KeywordChecker.containsJavaKeyword("I love to breakdance"));
        assertTrue(KeywordChecker.containsJavaKeyword("This is a class example"));
        assertFalse(KeywordChecker.containsJavaKeyword("No keywords here"));
    }
}