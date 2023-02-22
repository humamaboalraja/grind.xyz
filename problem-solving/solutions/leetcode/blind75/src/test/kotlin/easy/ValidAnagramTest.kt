package easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import xyz.grind.coding.easy.ValidAnagram

class ValidAnagramTest {
    @Test
    fun `Should return true if two strings are anagrams`() {
        Assertions.assertAll(
            Executable { assertTrue(ValidAnagram.isAnagramSortingBruteForce("silent", "listen")) },
            Executable { assertTrue(ValidAnagram.isAnagramSortingBruteForce("anagram", "gaanrma")) },
            Executable { assertTrue(ValidAnagram.isAnagramHashSet("silent", "listen")) },
            Executable { assertTrue(ValidAnagram.isAnagramHashSet("anagram", "gaanrma")) },
            Executable { assertTrue(ValidAnagram.isAnagramHashSet("art", "tra")) },
            Executable { assertTrue(ValidAnagram.isAnagram("silent", "listen")) },
            Executable { assertTrue(ValidAnagram.isAnagram("anagram", "gaanrma")) },
            Executable { assertTrue(ValidAnagram.isAnagram("art", "tra")) },
            Executable { assertTrue(ValidAnagram.isAnagram("aps", "pas")) },
            Executable { assertTrue(ValidAnagram.isAnagramAdjusted("silent", "listen")) },
            Executable { assertTrue(ValidAnagram.isAnagramAdjusted("anagram", "gaanrma")) },
            Executable { assertTrue(ValidAnagram.isAnagramAdjusted("art", "tra")) },
            Executable { assertTrue(ValidAnagram.isAnagramAdjusted("aps", "pas")) },
        )
    }

    @Test
    fun `Should return false if it two strings aren't anagrams`() {
        Assertions.assertAll(
            Executable { assertFalse(ValidAnagram.isAnagramSortingBruteForce("silent", "isten")) },
            Executable { assertFalse(ValidAnagram.isAnagramSortingBruteForce("anagram", "aanrma")) },
            Executable { assertFalse(ValidAnagram.isAnagramHashSet("silent", "isten")) },
            Executable { assertFalse(ValidAnagram.isAnagramHashSet("anagram", "aanrma")) },
            Executable { assertFalse(ValidAnagram.isAnagramHashSet("art", "ra")) },
            Executable { assertFalse(ValidAnagram.isAnagram("silent", "isten")) },
            Executable { assertFalse(ValidAnagram.isAnagram("anagram", "aanrma")) },
            Executable { assertFalse(ValidAnagram.isAnagram("art", "ra")) },
            Executable { assertFalse(ValidAnagram.isAnagram("aps", "as")) },
            Executable { assertFalse(ValidAnagram.isAnagramAdjusted("silent", "isten")) },
            Executable { assertFalse(ValidAnagram.isAnagramAdjusted("anagram", "aanrma")) },
            Executable { assertFalse(ValidAnagram.isAnagramAdjusted("art", "ra")) },
            Executable { assertFalse(ValidAnagram.isAnagramAdjusted("aps", "as")) },
        )
    }
}
