package easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import xyz.grind.coding.easy.ContainsDuplicate

class ContainsDuplicateTest {
    @Test
    fun `Should return true if found duplicates in various inputs`() {
        Assertions.assertAll(
            Executable {
                assertTrue(ContainsDuplicate.containsDuplicate(intArrayOf(1, 2, 3, 3)))
                assertTrue(ContainsDuplicate.containsDuplicate(intArrayOf(2, 2, 3, 3)))
                assertTrue(ContainsDuplicate.containsDuplicate(intArrayOf(3, 3, 3, 3)))
                assertTrue(ContainsDuplicate.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
                assertTrue(ContainsDuplicate.containsDuplicateBruteForce(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
                assertTrue(ContainsDuplicate.containsDuplicateSorting(intArrayOf(2, 2, 3, 3)))
                assertTrue(ContainsDuplicate.containsDuplicateSorting(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2)))
                assertTrue(ContainsDuplicate.containsDuplicateFunctional(intArrayOf(1, 2, 3, 3)))
                assertTrue(ContainsDuplicate.containsDuplicateFunctional(intArrayOf(2, 2, 3, 3)))
                assertTrue(ContainsDuplicate.containsDuplicateFunctional(intArrayOf(3, 3, 3, 3)))
                assertTrue(ContainsDuplicate.containsDuplicateFunctional(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
            }
        )
    }

    @Test
    fun `Should return false if it there's no duplicates a simple assertion`() {
        Assertions.assertAll(
            Executable {
                assertFalse(ContainsDuplicate.containsDuplicate(intArrayOf(1, 2, 3, 4)))
                assertFalse(ContainsDuplicate.containsDuplicate(intArrayOf(2, 49, 1, 9)))
                assertFalse(ContainsDuplicate.containsDuplicate(intArrayOf(4, 11, 34, 5)))
                assertFalse(ContainsDuplicate.containsDuplicateBruteForce(intArrayOf(13, 43, 24, 2)))
                assertFalse(ContainsDuplicate.containsDuplicateSorting(intArrayOf(1, 2, 3, 4)))
                assertFalse(ContainsDuplicate.containsDuplicateSorting(intArrayOf(10, 46, 51, 66, 91, 35, 76)))
                assertFalse(ContainsDuplicate.containsDuplicateFunctional(intArrayOf(1, 2, 3, 4)))
                assertFalse(ContainsDuplicate.containsDuplicateFunctional(intArrayOf(2, 49, 1, 9)))
                assertFalse(ContainsDuplicate.containsDuplicateFunctional(intArrayOf(4, 11, 34, 5)))
            }
        )
    }
}
