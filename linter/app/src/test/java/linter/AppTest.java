package linter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Path;
import java.nio.file.Paths;

class AppTest {

    @Test
    @DisplayName("Many Errors")
    void testLinter() {
        String path = "./src/main/java/resources/gates.js";
        String expected =
                """
                        Line 3: Missing semicolon.
                        Line 5: Missing semicolon.
                        Line 11: Missing semicolon.
                        Line 13: Missing semicolon.
                        Line 15: Missing semicolon.
                        Line 26: Missing semicolon.
                        Line 28: Missing semicolon.
                        Line 32: Missing semicolon.
                        Line 36: Missing semicolon.
                        Line 40: Missing semicolon.
                        Line 41: Missing semicolon.
                        Line 50: Missing semicolon.
                        Line 51: Missing semicolon.
                        Line 59: Missing semicolon.
                        Line 60: Missing semicolon.
                        Line 61: Missing semicolon.
                        Line 62: Missing semicolon.
                        Line 64: Missing semicolon.
                        Line 70: Missing semicolon.
                        Line 71: Missing semicolon.
                        Line 72: Missing semicolon.
                        Line 73: Missing semicolon.
                        Line 74: Missing semicolon.
                        Line 76: Missing semicolon.
                        Line 77: Missing semicolon.
                        Line 78: Missing semicolon.
                        Line 79: Missing semicolon.
                        Line 80: Missing semicolon.
                        Line 82: Missing semicolon.
                        Line 83: Missing semicolon.
                        Line 84: Missing semicolon.
                        Line 85: Missing semicolon.
                        Line 86: Missing semicolon.
                        Line 88: Missing semicolon.
                        Line 89: Missing semicolon.
                        Line 90: Missing semicolon.
                        Line 91: Missing semicolon.
                        Line 92: Missing semicolon.
                        Line 94: Missing semicolon.
                        Line 95: Missing semicolon.
                        Line 96: Missing semicolon.
                        Line 97: Missing semicolon.
                        Line 98: Missing semicolon.
                        Line 99: Missing semicolon.
                        Line 100: Missing semicolon.
                        Line 101: Missing semicolon.
                        """;
        String response = App.linter(path);
        System.out.println(response);
        assertEquals(expected, response);
    }



    @Test
    @DisplayName("No Errors")
    void testLinterNoErrors() {
        String path = "./src/main/java/resources/noErrors.js";
        String expected = "File has no errors!";
        String response = App.linter(path);
        System.out.println(response);
        assertEquals(expected, response);
    }

    @Test
    @DisplayName("No Errors Empty File")
    void testLinterNoErrorsEmptyFile() {
        String path = "./src/main/java/resources/empty.js";
        String expected = "File has no errors!";
        String response = App.linter(path);
        System.out.println(response);
        assertEquals(expected, response);

    }

    @Test
    @DisplayName("No Errors Multiple Lines")
    void testLinterNoErrorsMultiLines() {
        String path = "./src/main/java/resources/noErrorsMultiLines.js";
        String expected = "File has no errors!";
        String response = App.linter(path);
        System.out.println(response);
        assertEquals(expected, response);
    }

    @Test
    @DisplayName("One Error")
    void testLinterOneError() {
        String path = "./src/main/java/resources/oneError.js";
        String expected = "Line 3: Missing semicolon.\n";
        String response = App.linter(path);
        System.out.println(response);
        assertEquals(expected, response);
    }

    @Test
    @DisplayName("Five Errors")
    void testLinterFiveError() {
        String path = "./src/main/java/resources/fiveErrors.js";
        String expected =
                """
                        Line 1: Missing semicolon.
                        Line 3: Missing semicolon.
                        Line 5: Missing semicolon.
                        Line 7: Missing semicolon.
                        Line 9: Missing semicolon.
                        """;

        String response = App.linter(path);
        System.out.println(response);
        assertEquals(expected, response);
    }

    @Test
    @DisplayName("Ten Errors")
    void testLinterTenError() {
        String path = "./src/main/java/resources/tenErrors.js";
        String expected =
                """
                        Line 1: Missing semicolon.
                        Line 3: Missing semicolon.
                        Line 5: Missing semicolon.
                        Line 7: Missing semicolon.
                        Line 9: Missing semicolon.
                        Line 10: Missing semicolon.
                        Line 12: Missing semicolon.
                        Line 14: Missing semicolon.
                        Line 16: Missing semicolon.
                        Line 18: Missing semicolon.                                         
                        """;
        String response = App.linter(path);
        System.out.println(response);
        assertEquals(expected, response);
    }
}