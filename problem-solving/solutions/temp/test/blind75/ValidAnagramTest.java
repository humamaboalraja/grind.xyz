package blind75;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.grind.coding.blind75.ValidAnagram;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    @Test
    @DisplayName("Should return true if two strings are anagrams")
    void shouldReturnTrueIfFoundDuplicates() {
        assertAll(
            () -> assertTrue(ValidAnagram.isAnagramSortingBruteForce("silent", "listen")),
            () -> assertTrue(ValidAnagram.isAnagramSortingBruteForce("anagram", "gaanrma")),
            () -> assertTrue(ValidAnagram.isAnagramHashSet("silent", "listen")),
            () -> assertTrue(ValidAnagram.isAnagramHashSet("anagram", "gaanrma")),
            () -> assertTrue(ValidAnagram.isAnagramHashSet("art", "tra")),
            () -> assertTrue(ValidAnagram.isAnagram("silent", "listen")),
            () -> assertTrue(ValidAnagram.isAnagram("anagram", "gaanrma")),
            () -> assertTrue(ValidAnagram.isAnagram("art", "tra")),
            () -> assertTrue(ValidAnagram.isAnagram("aps", "pas"))
        );
    }

    @Test
    @DisplayName("Should return false if it two strings aren't anagrams")
    void shouldReturnFalseIfNoDuplicates() {
        assertAll(
            () -> assertFalse(ValidAnagram.isAnagramSortingBruteForce("silent", "isten")),
            () -> assertFalse(ValidAnagram.isAnagramSortingBruteForce("anagram", "aanrma")),
            () -> assertFalse(ValidAnagram.isAnagramHashSet("silent", "isten")),
            () -> assertFalse(ValidAnagram.isAnagramHashSet("anagram", "aanrma")),
            () -> assertFalse(ValidAnagram.isAnagramHashSet("art", "ra")),
            () -> assertFalse(ValidAnagram.isAnagram("silent", "isten")),
            () -> assertFalse(ValidAnagram.isAnagram("anagram", "aanrma")),
            () -> assertFalse(ValidAnagram.isAnagram("art", "ra")),
            () -> assertFalse(ValidAnagram.isAnagram("aps", "as"))
        );
    }

}
